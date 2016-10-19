package org.siphon.visualbasic.runtime.statements;

import org.siphon.visualbasic.Interpreter;
import org.siphon.visualbasic.SourceLocation;
import org.siphon.visualbasic.runtime.CallFrame;
import org.siphon.visualbasic.runtime.Statement;
import org.siphon.visualbasic.runtime.VbRuntimeException;
import org.siphon.visualbasic.runtime.VbValue;

public class PrintStatement extends Statement {

	private final Statement valueStatement;

	public PrintStatement(SourceLocation sourceLocation,Statement valueStatement) {
		super(sourceLocation);
		this.valueStatement = valueStatement;
	}

	@Override
	public VbValue eval(Interpreter interpreter, CallFrame frame)  throws VbRuntimeException {
		VbValue value = valueStatement.eval(interpreter, frame);
		System.err.println(value.value);
		return null;
	}
	
	@Override
	public String toString() {
		return "Print " + valueStatement;
	}

}
