/*
 * generated by Xtext
 */
package de.tu_bs.cs.isf.deltamsc.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractDeltaMSCValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(de.tu_bs.cs.isf.deltamsc.deltaMSC.DeltaMSCPackage.eINSTANCE);
		return result;
	}
}