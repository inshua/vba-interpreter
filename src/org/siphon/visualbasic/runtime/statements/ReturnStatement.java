package org.siphon.visualbasic.runtime.statements;

import org.siphon.visualbasic.Interpreter;
import org.siphon.visualbasic.SourceLocation;
import org.siphon.visualbasic.runtime.CallFrame;
import org.siphon.visualbasic.runtime.Statement;
import org.siphon.visualbasic.runtime.VbValue;

public class ReturnStatement extends Statement {

	public ReturnStatement(SourceLocation sourceLocation) {
		super(sourceLocation);
	}

	@Override
	public VbValue eval(Interpreter interpreter, CallFrame frame) {
		frame.nextStatement = frame.gosubResumeStack.pop();
		return null;
	}

	@Override
	public String toString() {
		return "RETURN (LAST GOTO SUB)";
	}
}
