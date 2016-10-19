package org.siphon.visualbasic.runtime.statements;

import org.siphon.visualbasic.Interpreter;
import org.siphon.visualbasic.OverflowException;
import org.siphon.visualbasic.SourceLocation;
import org.siphon.visualbasic.runtime.CallFrame;
import org.siphon.visualbasic.runtime.NullValueException;
import org.siphon.visualbasic.runtime.Statement;
import org.siphon.visualbasic.runtime.VbRuntimeException;
import org.siphon.visualbasic.runtime.VbValue;

public class IfNotGotoStatement extends GotoStatement {

	private final Statement condition;

	public IfNotGotoStatement(SourceLocation sourceLocation, Statement condition) {
		super(sourceLocation);
		this.condition = condition;
	}

	@Override
	public VbValue eval(Interpreter interpreter, CallFrame frame)  throws VbRuntimeException {
		VbValue value = condition.eval(interpreter, frame);
		
		try{
			boolean cond = VbValue.isTrue(value);
			if (cond == false) {
				frame.nextStatement = this.statementIndex;
			}
		} catch(ClassCastException e){
			throw new VbRuntimeException(VbRuntimeException.类型不匹配, sourceLocation);
		} catch(NullValueException e){
			throw new VbRuntimeException(VbRuntimeException.Null的使用无效, sourceLocation);
		}

		return null;
	}

	@Override
	public String toString() {
		return String.format("IF NOT %s GOTO %s", condition, statementIndex);
	}
}
