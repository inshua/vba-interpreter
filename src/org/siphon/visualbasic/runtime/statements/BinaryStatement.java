package org.siphon.visualbasic.runtime.statements;

import org.siphon.visualbasic.Interpreter;
import org.siphon.visualbasic.SourceLocation;
import org.siphon.visualbasic.runtime.CallFrame;
import org.siphon.visualbasic.runtime.Statement;
import org.siphon.visualbasic.runtime.VbRuntimeException;
import org.siphon.visualbasic.runtime.VbValue;

public abstract class BinaryStatement extends Statement {

	protected final Statement v1;
	protected final Statement v2;

	public BinaryStatement(SourceLocation sourceLocation, Statement v1, Statement v2) {
		super(sourceLocation);
		this.v1 = v1;
		this.v2 = v2;
	}
	
	@Override
	public VbValue eval(Interpreter interpreter, CallFrame frame) throws VbRuntimeException {
		VbValue value1 = v1.eval(interpreter, frame);
		if(value1.isObject()){
			value1 = interpreter.evalDefaultMember(value1, frame, sourceLocation);
		}
		VbValue value2 = v2.eval(interpreter, frame);
		if(value2.isObject()){
			value2 = interpreter.evalDefaultMember(value2, frame, sourceLocation);
		}
		return this.eval(value1, value2, interpreter, frame);
	}

	protected abstract VbValue eval(VbValue value1, VbValue value2, Interpreter interpreter, CallFrame frame) throws VbRuntimeException;
}
