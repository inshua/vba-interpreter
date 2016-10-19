package org.siphon.visualbasic.runtime.statements;

import org.siphon.visualbasic.Interpreter;
import org.siphon.visualbasic.SourceLocation;
import org.siphon.visualbasic.runtime.CallFrame;
import org.siphon.visualbasic.runtime.Statement;
import org.siphon.visualbasic.runtime.VbRuntimeException;
import org.siphon.visualbasic.runtime.VbValue;

public class WithStatement extends Statement {

	private Statement bindObj;
	private VbValue prevWith;

	public WithStatement(SourceLocation sourceLocation, Statement bindObj) {
		super(sourceLocation);
		this.bindObj = bindObj;
	}

	@Override
	public VbValue eval(Interpreter interpreter, CallFrame frame) throws VbRuntimeException {
		this.prevWith = frame.withObject;
		frame.withObject = this.bindObj.eval(interpreter, frame);
		return null;
	}

	public Statement endWith(SourceLocation sourceLocation) {
		return new Statement(sourceLocation) {
			
			@Override
			public VbValue eval(Interpreter interpreter, CallFrame frame) throws VbRuntimeException {
				frame.withObject = prevWith;
				return null;
			}
			
			@Override
			public String toString() {
				return "End With";
			}
		};
	}
	
	@Override
	public String toString() {
		return "With " + bindObj;
	}

}
