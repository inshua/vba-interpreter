package org.siphon.visualbasic.runtime.statements;

import org.siphon.visualbasic.Interpreter;
import org.siphon.visualbasic.SourceLocation;
import org.siphon.visualbasic.runtime.CallFrame;
import org.siphon.visualbasic.runtime.Statement;
import org.siphon.visualbasic.runtime.VbRuntimeException;
import org.siphon.visualbasic.runtime.VbValue;

public class AssignStatement extends Statement {

	private EvalAssignableStatement evalAssignableStatement;
	private Statement valueStatement;

	public AssignStatement(SourceLocation sourceLocation, EvalAssignableStatement evalAssignableStatement, Statement valueStatement) {
		super(sourceLocation);
		this.evalAssignableStatement = evalAssignableStatement;
		this.valueStatement = valueStatement;
		assert valueStatement != null;
	}
	
	@Override
	public VbValue eval(Interpreter interpreter, CallFrame frame) throws VbRuntimeException {
		EvalAssignableObject obj = (EvalAssignableObject) evalAssignableStatement.evalIt(interpreter, frame);
		assert obj != null;
		VbValue value = valueStatement.eval(interpreter, frame);
		
		obj.assign(value, interpreter, frame);
		
		return value;
	}
	
	@Override
	public String toString() {
		return String.format("Assign %s = %s", evalAssignableStatement, valueStatement);
	}

}
