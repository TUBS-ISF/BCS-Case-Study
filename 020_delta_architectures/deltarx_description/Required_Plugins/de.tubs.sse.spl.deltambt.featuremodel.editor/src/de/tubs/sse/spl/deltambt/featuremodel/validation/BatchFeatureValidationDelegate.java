package de.tubs.sse.spl.deltambt.featuremodel.validation;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.marker.MarkerUtil;
import org.eclipse.emf.validation.model.EvaluationMode;
import org.eclipse.emf.validation.model.IConstraintStatus;
import org.eclipse.emf.validation.service.IBatchValidator;
import org.eclipse.emf.validation.service.ModelValidationService;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate2;
import org.eclipse.ui.IEditorActionDelegate;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.dialogs.ListDialog;

import de.tubs.sse.spl.deltambt.featuremodel.provider.FeatureModelEditPlugin;
import de.tubs.sse.spl.deltambt.featuremodel.validation.constraint.ValidationFeatureDelegateClientSelector;
import de.tubs.sse.spl.deltambt.featuremodel.presentation.FeaturemodelEditor;

/**
 * This action delegate calls upon the validation service to provide a batch
 *  validation of the selected EObjects and their children.
 *  
 *  This implementation based on the EMF Validation Framework Example org.eclipse.emf.validation.examples.general
 */
public class BatchFeatureValidationDelegate
	implements IEditorActionDelegate, IActionDelegate2 {

	/**
	 * Error message to display when an exception occured
	 */
	protected static final String MESSAGE_EXCEPTION = "An unexpected exception occurs. The operation can't complete successfully.  See Error Log View for details.";

	/**
	 * The shell this action is hosted in
	 */
	protected Shell shell = null;

	/**
	 * The active editor
	 */
	protected FeaturemodelEditor editor = null;

	/**
	 * Selected EObjects
	 */
	protected Collection<EObject> selectedEObjects = null;

	/**
	 * The InputDialog title
	 */
	private final String title = "Feature Model Validation";

	/*
	 * @see org.eclipse.ui.IActionDelegate#selectionChanged(org.eclipse.jface.action.IAction,
	 *      org.eclipse.jface.viewers.ISelection)
	 */
	@SuppressWarnings("unchecked")
	public void selectionChanged(IAction action, final ISelection selection) {
		this.selectedEObjects = null;
		try {
			if (selection instanceof IStructuredSelection) {
				IStructuredSelection structuredSelection = (IStructuredSelection) selection;
				this.selectedEObjects = structuredSelection.toList();
			}
		} catch (Exception e) {
			// Exceptions are not expected
			MessageDialog.openInformation(shell, title, MESSAGE_EXCEPTION);
			throw new RuntimeException(e);
		} finally {
			action.setEnabled((null != selectedEObjects));
		}
		
		for (Object next : selectedEObjects) {
			if (!(next instanceof EObject)) {
				action.setEnabled(false);
			}
		}
	}

	/*
	 * @see org.eclipse.ui.IActionDelegate2#dispose()
	 */
	public void dispose() {
		//No-op
	}

	/*
	 * @see org.eclipse.ui.IEditorActionDelegate#setActiveEditor(org.eclipse.jface.action.IAction,
	 *      org.eclipse.ui.IEditorPart)
	 */
	public void setActiveEditor(IAction action, IEditorPart targetEditor) {
		this.editor = (FeaturemodelEditor) targetEditor;
		if ( targetEditor != null ) {
			this.shell = targetEditor.getSite().getShell();
		}
	}

	/*
	 * @see org.eclipse.ui.IActionDelegate2#init(org.eclipse.jface.action.IAction)
	 */
	public void init(IAction action) {
		// No-op
	}

	/*
	 * @see org.eclipse.ui.IActionDelegate2#runWithEvent(org.eclipse.jface.action.IAction,
	 *      org.eclipse.swt.widgets.Event)
	 */
	public void runWithEvent(IAction action, Event event) {
		run(action);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
	 */
	public void run(IAction action) {
		ValidationFeatureDelegateClientSelector.running = true;
		
		IBatchValidator validator = ModelValidationService.getInstance()
			.newValidator(EvaluationMode.BATCH);
		// include live constraints, also, in batch validation
		validator.setOption(IBatchValidator.OPTION_INCLUDE_LIVE_CONSTRAINTS, true);
		// track the validated resources for accurate problem-marker updates
		validator.setOption(IBatchValidator.OPTION_TRACK_RESOURCES, true);
		
		final IStatus status = validator.validate(selectedEObjects);
		
		if (status.isOK()) {
			MessageDialog.openInformation(shell, title,
				"The Validation operation completed successfully.");
		} 
		else 
		{
			ListDialog dialog = new ListDialog(shell);
			dialog.setInput(status);
			dialog.setTitle(title);
			dialog.setContentProvider(new IStructuredContentProvider() {
				public void dispose() {
					// nothing to dispose
				}

				public Object[] getElements(Object inputElement) {
					if (status != null && status.isMultiStatus() && status == inputElement) {
						return status.getChildren();
					} else if (status != null && status == inputElement) {
						return new Object[] {status};
					}
					return new Object[0];
				}

				public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
					// Do nothing.
				}
			});
			dialog.setLabelProvider(new LabelProvider() {
				@Override
				public String getText(Object element) {
					if (element instanceof IStatus) {
						return ((IStatus)element).getMessage();
					}
					return null;
				}
			});
			dialog.setBlockOnOpen(true);
			dialog.setMessage("The Validation operation failed in the following areas (click OK to see the selected problem elements in the editor):");
			
			if (Window.OK == dialog.open()) {
				Set<EObject> errorSelections = new HashSet<EObject>();
				if (!status.isMultiStatus()) {
					IConstraintStatus cstatus = (IConstraintStatus)status;
					errorSelections.add(cstatus.getTarget());
				} else {
					IStatus[] children = status.getChildren();
					for (IStatus element : children) {
						IConstraintStatus cstatus = (IConstraintStatus)element;
						errorSelections.add(cstatus.getTarget());
					}
				}
				editor.setSelectionToViewer(errorSelections);
			}
		}
		
		ValidationFeatureDelegateClientSelector.running = false;
		
		// Create problem markers on the resources with validation failures/warnings.
		try {
			MarkerUtil.updateMarkers(status);
		} catch (CoreException e) {
			FeatureModelEditPlugin.getPlugin().getLog().log(e.getStatus());
		}
	}
}
