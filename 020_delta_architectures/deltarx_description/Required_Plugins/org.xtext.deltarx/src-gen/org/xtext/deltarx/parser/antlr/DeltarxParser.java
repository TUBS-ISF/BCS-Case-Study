/*
* generated by Xtext
*/
package org.xtext.deltarx.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.deltarx.services.DeltarxGrammarAccess;

public class DeltarxParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private DeltarxGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.xtext.deltarx.parser.antlr.internal.InternalDeltarxParser createParser(XtextTokenStream stream) {
		return new org.xtext.deltarx.parser.antlr.internal.InternalDeltarxParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Deltarx";
	}
	
	public DeltarxGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(DeltarxGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
