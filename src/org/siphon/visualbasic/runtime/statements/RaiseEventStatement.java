package org.siphon.visualbasic.runtime.statements;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.siphon.visualbasic.EventDecl;
import org.siphon.visualbasic.Interpreter;
import org.siphon.visualbasic.SourceLocation;
import org.siphon.visualbasic.runtime.CallFrame;
import org.siphon.visualbasic.runtime.ErrObject;
import org.siphon.visualbasic.runtime.Statement;
import org.siphon.visualbasic.runtime.VbRuntimeException;
import org.siphon.visualbasic.runtime.VbValue;

public class RaiseEventStatement extends Statement {

	private EventDecl eventDecl;
	private List<Statement> arguments;

	public RaiseEventStatement(SourceLocation sourceLocation, EventDecl eventDecl, List<Statement> args) {
		super(sourceLocation);
		this.eventDecl = eventDecl;
		this.arguments = args;
	}

	@Override
	public VbValue eval(Interpreter interpreter, CallFrame frame) throws VbRuntimeException {
		List<VbValue> values = new ArrayList<>();
		if(arguments != null){
			for(Statement arg : arguments){
				values.add(VbValue.fromJava(arg.eval(interpreter, frame)));
			}
		}
		frame.module.raiseEvent(eventDecl, arguments, values, interpreter, frame);
		return null;
	}
	
	@Override
	public String toString() {
		String s = "RaiseEvent " + eventDecl;
		if(arguments != null){
			s += "(";
			s += StringUtils.join(arguments, ',');
			s += ")";
		}
		return s;
	}

}
