package org.siphon.visualbasic.runtime.statements;

import org.siphon.visualbasic.Interpreter;
import org.siphon.visualbasic.SourceLocation;
import org.siphon.visualbasic.VarDecl;
import org.siphon.visualbasic.runtime.CallFrame;
import org.siphon.visualbasic.runtime.Statement;
import org.siphon.visualbasic.runtime.VbValue;

public class VariableStatement extends Statement {

	private final VarDecl varDecl;

	public VariableStatement(SourceLocation sourceLocation, VarDecl varDecl) {
		super(sourceLocation);
		this.varDecl = varDecl;
	}

	@Override
	public VbValue eval(Interpreter interpreter, CallFrame frame) {
		frame.local.put(varDecl, varDecl.createVar());
		return null;
	}

	@Override
	public String toString() {
		return "Dim " + varDecl;
	}
}
