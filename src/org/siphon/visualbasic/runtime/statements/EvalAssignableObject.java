package org.siphon.visualbasic.runtime.statements;

import org.siphon.visualbasic.Interpreter;
import org.siphon.visualbasic.runtime.CallFrame;
import org.siphon.visualbasic.runtime.VbRuntimeException;
import org.siphon.visualbasic.runtime.VbValue;

/*
 * 可求值，可赋值的对象结构
 */
public abstract class EvalAssignableObject {

	public abstract VbValue apply(Interpreter interpreter, CallFrame frame) throws VbRuntimeException;
	
	
	public abstract void assign(VbValue value, Interpreter interpreter, CallFrame frame) throws VbRuntimeException;
	
}
