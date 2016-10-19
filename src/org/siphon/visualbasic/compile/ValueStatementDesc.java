package org.siphon.visualbasic.compile;

import org.antlr.v4.runtime.ParserRuleContext;
import org.siphon.visualbasic.VbDecl;
import org.siphon.visualbasic.runtime.Statement;
import org.siphon.visualbasic.runtime.VbVarType;

public class ValueStatementDesc {

	private Statement statement;
	
	private VbVarType varType;
	
	private ParserRuleContext ast;

	public Statement getStatement() {
		return statement;
	}

	public ValueStatementDesc setStatement(Statement statement) {
		this.statement = statement;
		return this;
	}

	public VbVarType getVarType() {
		return varType;
	}

	public ValueStatementDesc setVarType(VbVarType varType) {
		this.varType = varType;
		return this;
	}

	public ParserRuleContext getAst() {
		return ast;
	}
	
	public ValueStatementDesc setAst(ParserRuleContext ast){
		this.ast = ast;
		return this;
	}
}
