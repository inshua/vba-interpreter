package org.siphon.visualbasic.runtime.statements;

import java.util.List;

import org.siphon.visualbasic.Interpreter;
import org.siphon.visualbasic.SourceLocation;
import org.siphon.visualbasic.runtime.CallFrame;
import org.siphon.visualbasic.runtime.Statement;
import org.siphon.visualbasic.runtime.VbRuntimeException;
import org.siphon.visualbasic.runtime.VbValue;

public class ResumeStatement {

	public static class GotoLabel extends UndeterminedLabelGotoStatement {

		public GotoLabel(SourceLocation sourceLocation, String label, List<Statement> owner) {
			super(sourceLocation, label, owner);
		}

		@Override
		public GotoStatement toGotoStatement(int lineIndex) {
			return new Goto(sourceLocation, lineIndex);
		}
	}

	public static class Resume extends GotoStatement {

		public Resume(SourceLocation sourceLocation) {
			super(sourceLocation);
		}
		
		@Override
		public VbValue eval(Interpreter interpreter, CallFrame frame) throws VbRuntimeException {
			frame.errorHandler = frame.prevErrorHandler;
			frame.nextStatement = frame.error.getStatementIndex();
			frame.error.Clear();
			return null;
		}

	}

	public static class Goto extends GotoStatement {

		public Goto(SourceLocation sourceLocation, Integer statementIndex) {
			super(sourceLocation, statementIndex);
		}

		@Override
		public VbValue eval(Interpreter interpreter, CallFrame frame) throws VbRuntimeException {
			frame.errorHandler = frame.prevErrorHandler;
			frame.error.Clear();
			return super.eval(interpreter, frame);
		}

	}

	public static class Next extends GotoStatement {

		public Next(SourceLocation sourceLocation) {
			super(sourceLocation);
		}
		
		@Override
		public VbValue eval(Interpreter interpreter, CallFrame frame) throws VbRuntimeException {
			frame.nextStatement = frame.error.getStatementIndex() + 1;
			frame.errorHandler = frame.prevErrorHandler;
			frame.error.Clear();
			return null;
		}

	}

}
