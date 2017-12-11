/*******************************************************************************
 * Copyright (C) 2017 Inshua<inshua@gmail.com>
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 ******************************************************************************/
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
