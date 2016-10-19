package org.siphon.visualbasic.runtime.statements;

import org.siphon.visualbasic.Interpreter;
import org.siphon.visualbasic.SourceLocation;
import org.siphon.visualbasic.runtime.CallFrame;
import org.siphon.visualbasic.runtime.Statement;
import org.siphon.visualbasic.runtime.VbRuntimeException;
import org.siphon.visualbasic.runtime.VbValue;

public class NamedArgumentStatement extends Statement {

	public Statement getStatement() {
		return statement;
	}

	public void setStatement(Statement statement) {
		this.statement = statement;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private Statement statement;
	private String name;

//	public NamedArgumentStatement(Statement statement, String name) {
//		super(statement.getSourceLocation());
//		assert this.sourceLocation != null;
//		this.statement = statement;
//		this.name = name;
//	}
	
	public NamedArgumentStatement(SourceLocation sourceLocation, Statement statement, String name) {
		super(sourceLocation);
		assert this.sourceLocation != null;
		this.statement = statement;
		this.name = name;
	}

	@Override
	public VbValue eval(Interpreter interpreter, CallFrame frame) throws VbRuntimeException {
		return statement.eval(interpreter, frame);
	}

}
