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

import org.siphon.visualbasic.Interpreter;
import org.siphon.visualbasic.SourceLocation;
import org.siphon.visualbasic.runtime.CallFrame;
import org.siphon.visualbasic.runtime.Statement;
import org.siphon.visualbasic.runtime.VbRuntimeException;
import org.siphon.visualbasic.runtime.VbValue;

public class WithStatement extends Statement {

	private Statement bindObj;
	private VbValue prevWith;

	public WithStatement(SourceLocation sourceLocation, Statement bindObj) {
		super(sourceLocation);
		this.bindObj = bindObj;
	}

	@Override
	public VbValue eval(Interpreter interpreter, CallFrame frame) throws VbRuntimeException {
		this.prevWith = frame.withObject;
		frame.withObject = this.bindObj.eval(interpreter, frame);
		return null;
	}

	public Statement endWith(SourceLocation sourceLocation) {
		return new Statement(sourceLocation) {
			
			@Override
			public VbValue eval(Interpreter interpreter, CallFrame frame) throws VbRuntimeException {
				frame.withObject = prevWith;
				return null;
			}
			
			@Override
			public String toString() {
				return "End With";
			}
		};
	}
	
	@Override
	public String toString() {
		return "With " + bindObj;
	}

}
