package org.siphon.visualbasic.runtime.statements;

import org.siphon.visualbasic.Interpreter;
import org.siphon.visualbasic.SourceLocation;
import org.siphon.visualbasic.runtime.CallFrame;
import org.siphon.visualbasic.runtime.VbValue;

public class GoSubStatement extends GotoStatement {

	public GoSubStatement(SourceLocation sourceLocation, Integer statementIndex) {
		super(sourceLocation, statementIndex);
	}

	@Override
	public VbValue eval(Interpreter interpreter, CallFrame frame) {
		frame.gosubResumeStack.push(frame.nextStatement);
		frame.nextStatement = statementIndex;
		return null;
	}
	
	@Override
	public String toString() {
		return "GOSUB " + statementIndex;
	}

}
