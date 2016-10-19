package org.siphon.visualbasic.runtime.statements;

import javax.xml.transform.Source;

import org.siphon.visualbasic.Interpreter;
import org.siphon.visualbasic.SourceLocation;
import org.siphon.visualbasic.runtime.CallFrame;
import org.siphon.visualbasic.runtime.Statement;
import org.siphon.visualbasic.runtime.VbRuntimeException;
import org.siphon.visualbasic.runtime.VbValue;

public class GotoStatement extends Statement {

	protected int statementIndex;

	public int getNextStatement() {
		return statementIndex;
	}

	public GotoStatement(SourceLocation sourceLocation, final Integer statementIndex) {
		super(sourceLocation);
		this.statementIndex = statementIndex;
	}

	public GotoStatement(SourceLocation sourceLocation) {
		super(sourceLocation);
		statementIndex = -1;
	}
	
	@Override
	public VbValue eval(Interpreter interpreter, CallFrame frame)  throws VbRuntimeException {
		frame.nextStatement = statementIndex;
		return null;
	}
	

	public GotoStatement setNextStatement(int nextStatement) {
		this.statementIndex = nextStatement;
		return this;
	}

	@Override
	public String toString() {
		return "GOTO " + statementIndex;
	}
}
