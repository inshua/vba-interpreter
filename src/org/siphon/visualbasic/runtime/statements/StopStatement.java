package org.siphon.visualbasic.runtime.statements;

import org.siphon.visualbasic.Interpreter;
import org.siphon.visualbasic.SourceLocation;
import org.siphon.visualbasic.runtime.CallFrame;
import org.siphon.visualbasic.runtime.Debugger;
import org.siphon.visualbasic.runtime.Statement;
import org.siphon.visualbasic.runtime.VbRuntimeException;
import org.siphon.visualbasic.runtime.VbValue;

public class StopStatement extends Statement {

	public StopStatement(SourceLocation sourceLocation) {
		super(sourceLocation);
	}

	@Override
	public VbValue eval(Interpreter interpreter, CallFrame frame) throws VbRuntimeException {
		Debugger debugger = interpreter.getDebugger();
		if(debugger != null){
			debugger.stop();
		}
		return null;
	}
	
	@Override
	public String toString() {
		return "Stop";
	}

}
