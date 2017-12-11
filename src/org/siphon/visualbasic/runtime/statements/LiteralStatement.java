package org.siphon.visualbasic.runtime.statements;

import org.siphon.visualbasic.Interpreter;
import org.siphon.visualbasic.SourceLocation;
import org.siphon.visualbasic.runtime.CallFrame;
import org.siphon.visualbasic.runtime.Statement;
import org.siphon.visualbasic.runtime.VbValue;

public class LiteralStatement extends Statement {

	private final VbValue literal;

	public LiteralStatement(VbValue literal) {
		super(SourceLocation.ByInterpreter);
		assert literal != null;
		this.literal = literal;
	}

	@Override
	public VbValue eval(Interpreter interpreter, CallFrame frame) {
		return literal;
	}
	
	@Override
	public String toString() {
		return literal.toString();
	}
	
}
