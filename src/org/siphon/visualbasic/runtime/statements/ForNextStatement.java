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
import org.siphon.visualbasic.VarDecl;
import org.siphon.visualbasic.runtime.CallFrame;
import org.siphon.visualbasic.runtime.Comparision;
import org.siphon.visualbasic.runtime.MathExpr;
import org.siphon.visualbasic.runtime.Statement;
import org.siphon.visualbasic.runtime.VbRuntimeException;
import org.siphon.visualbasic.runtime.VbValue;
import org.siphon.visualbasic.runtime.VbVarType;
import org.siphon.visualbasic.runtime.VbVariable;

public class ForNextStatement {

	private VarDecl var;
	private Statement init;
	private Statement step;
	private Statement end;
	protected VbValue stepValue;
	protected VbValue endValue;

	public ForNextStatement(VarDecl var, Statement init, Statement step, Statement end) {
		this.var = var;
		this.init = init;
		this.step = step;
		this.end = end;
	}

	public Statement initStatement(SourceLocation sourceLocation) {
		return new Statement(sourceLocation){

			@Override
			public VbValue eval(Interpreter interpreter, CallFrame frame) throws VbRuntimeException {
				VbVariable variable = frame.locateVbVariable(var);
				assert variable != null;
				// TODO must be number type
				variable.assign(init.eval(interpreter, frame), interpreter, frame, sourceLocation);
				ForNextStatement.this.endValue = end.eval(interpreter, frame);
				ForNextStatement.this.stepValue = step.eval(interpreter, frame);
				return variable.value;
			}
			
			@Override
			public String toString() {
				return String.format("For %s = %s To %s", var, init, end);
			}
		};
	}

	public Statement nextStatement(SourceLocation sourceLocation, final int beginLine) {
		return new Statement(sourceLocation) {
			
			@Override
			public VbValue eval(Interpreter interpreter, CallFrame frame) throws VbRuntimeException {
				VbVariable variable = frame.locateVbVariable(var);
				VbValue step = stepValue;
				if(stepValue.isObject()){
					step = interpreter.evalDefaultMember(step, frame, sourceLocation);
				}
				variable.assign(MathExpr.add(variable.value, step), interpreter, frame, sourceLocation);
				int c = Comparision.compare(variable.value, endValue);
				int expect = 1;
				if(Comparision.compare(stepValue, new VbValue(VbVarType.VbInteger, 0)) < 0){
					expect = -1;
				}
				if(Math.signum(c) == Math.signum(expect)){
					// FOR NEXT END
				} else {
					frame.nextStatement = beginLine;
				}
				return null;
			}
			
			@Override
			public String toString() {
				return "Next " + var;
			}
		};
	}
	
}
