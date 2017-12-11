/*******************************************************************************
 * Copyright (C) 2017 Inshua<inshua@gmail.com>
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 ******************************************************************************/
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
