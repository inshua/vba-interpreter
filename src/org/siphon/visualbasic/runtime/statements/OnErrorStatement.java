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

public class OnErrorStatement {

	public static class Goto extends GotoStatement {

		private GotoStatement wrappedGoto;

		public Goto(SourceLocation sourceLocation, Integer lineIndex) {
			super(sourceLocation, lineIndex);
			this.wrappedGoto = new ErrHandleGotoStatement(sourceLocation, statementIndex);
		}

		@Override
		public VbValue eval(Interpreter interpreter, CallFrame frame) throws VbRuntimeException {
			frame.errorHandler = wrappedGoto;
			return null;
		}
		
		@Override
		public String toString() {
			return "On Error " + super.toString();
		}

	}
	
	public static class ErrHandleGotoStatement extends GotoStatement{

		public ErrHandleGotoStatement(SourceLocation sourceLocation, int statementIndex) {
			super(sourceLocation, statementIndex);
		}
		
		@Override
		public VbValue eval(Interpreter interpreter, CallFrame frame) throws VbRuntimeException {
			frame.prevErrorHandler = frame.errorHandler;
			frame.errorHandler = null;
			super.eval(interpreter, frame);
			return null;
		}
		
	}

	public static class Reset extends Statement {

		public Reset(SourceLocation sourceLocation) {
			super(sourceLocation);
		}

		@Override
		public VbValue eval(Interpreter interpreter, CallFrame frame) throws VbRuntimeException {
			frame.errorHandler = null;
			return null;
		}

	}

	public static class ResumeNext extends Statement {

		private GotoStatement resumeNext;

		public ResumeNext(SourceLocation sourceLocation) {
			super(sourceLocation);
			resumeNext = new ResumeStatement.Next(sourceLocation);
		}

		@Override
		public VbValue eval(Interpreter interpreter, CallFrame frame) throws VbRuntimeException {
			frame.errorHandler = resumeNext;
			return null;
		}

	}

	public static class GotoLabel extends UndeterminedLabelGotoStatement {

		public GotoLabel(SourceLocation sourceLocation, String label, List<Statement> owner) {
			super(sourceLocation, label, owner);
		}

		@Override
		public GotoStatement toGotoStatement(int lineIndex) {
			return new Goto(sourceLocation, lineIndex);
		}
	}
}
