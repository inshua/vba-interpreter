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
