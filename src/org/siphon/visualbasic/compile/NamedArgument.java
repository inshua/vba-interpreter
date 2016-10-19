package org.siphon.visualbasic.compile;

import org.antlr.v4.runtime.ParserRuleContext;

public class NamedArgument extends ValueStatementDesc {

	public static class AlreadyPositionedException extends Exception {

		private ParserRuleContext ast;
		private String name;

		public String getName() {
			return name;
		}

		public ParserRuleContext getAst() {
			return ast;
		}

		public AlreadyPositionedException(ParserRuleContext ast, String name) {
			this.ast = ast;
			this.name = name;
		}

	}

	public static class NameNotFoundException extends Exception {

		private ParserRuleContext ast;

		private String name;

		public String getName() {
			return name;
		}

		public ParserRuleContext getAst() {
			return ast;
		}

		public NameNotFoundException(ParserRuleContext ast, String name) {
			this.ast = ast;
			this.name = name;
		}

	}

	public static class RemainShouldNamedException extends Exception {

		private ParserRuleContext ast;

		public ParserRuleContext getAst() {
			return ast;
		}

		public RemainShouldNamedException(ParserRuleContext ast) {
			this.ast = ast;
		}

	}

	private String name;
	private ValueStatementDesc stmtDesc;

	public ValueStatementDesc getStmtDesc() {
		return stmtDesc;
	}

	public NamedArgument(ValueStatementDesc stmtDesc, String name) {
		this.stmtDesc = stmtDesc;
		this.setAst(stmtDesc.getAst()).setStatement(stmtDesc.getStatement()).setVarType(stmtDesc.getVarType());
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public NamedArgument setName(String name) {
		this.name = name;
		return this;
	}

}
