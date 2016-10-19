package org.siphon.visualbasic.runtime.statements;

import org.siphon.visualbasic.Interpreter;
import org.siphon.visualbasic.runtime.CallFrame;
import org.siphon.visualbasic.runtime.VbRuntimeException;
import org.siphon.visualbasic.runtime.VbValue;

public abstract class SelectCaseConditionStatement{
	
	public abstract boolean test(Interpreter interpreter, CallFrame frame, VbValue value) throws VbRuntimeException;
	
}