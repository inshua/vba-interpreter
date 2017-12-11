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
import org.siphon.visualbasic.OverflowException;
import org.siphon.visualbasic.SourceLocation;
import org.siphon.visualbasic.runtime.CallFrame;
import org.siphon.visualbasic.runtime.NullValueException;
import org.siphon.visualbasic.runtime.Statement;
import org.siphon.visualbasic.runtime.VbRuntimeException;
import org.siphon.visualbasic.runtime.VbValue;

public class IfNotGotoStatement extends GotoStatement {

	private final Statement condition;

	public IfNotGotoStatement(SourceLocation sourceLocation, Statement condition) {
		super(sourceLocation);
		this.condition = condition;
	}

	@Override
	public VbValue eval(Interpreter interpreter, CallFrame frame)  throws VbRuntimeException {
		VbValue value = condition.eval(interpreter, frame);
		
		try{
			boolean cond = VbValue.isTrue(value);
			if (cond == false) {
				frame.nextStatement = this.statementIndex;
			}
		} catch(ClassCastException e){
			throw new VbRuntimeException(VbRuntimeException.类型不匹配, sourceLocation);
		} catch(NullValueException e){
			throw new VbRuntimeException(VbRuntimeException.Null的使用无效, sourceLocation);
		}

		return null;
	}

	@Override
	public String toString() {
		return String.format("IF NOT %s GOTO %s", condition, statementIndex);
	}
}
