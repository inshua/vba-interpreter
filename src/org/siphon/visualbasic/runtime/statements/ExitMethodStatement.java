package org.siphon.visualbasic.runtime.statements;

import org.siphon.visualbasic.Interpreter;
import org.siphon.visualbasic.SourceLocation;
import org.siphon.visualbasic.runtime.CallFrame;
import org.siphon.visualbasic.runtime.Statement;
import org.siphon.visualbasic.runtime.VbValue;

public class ExitMethodStatement extends Statement {

	public ExitMethodStatement(SourceLocation sourceLocation) {
		super(sourceLocation);
	}

	@Override
	public VbValue eval(Interpreter interpreter, CallFrame frame) {
		frame.nextStatement = frame.method.statements.size();
		return null;
	}

	@Override
	public String toString() {
		return "EXIT METHOD";
	}
}
