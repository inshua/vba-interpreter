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
import org.siphon.visualbasic.runtime.DivByZeroException;
import org.siphon.visualbasic.runtime.LogicalExpr;
import org.siphon.visualbasic.runtime.MathExpr;
import org.siphon.visualbasic.runtime.NullValueException;
import org.siphon.visualbasic.runtime.Statement;
import org.siphon.visualbasic.runtime.VbRuntimeException;
import org.siphon.visualbasic.runtime.VbValue;
import org.siphon.visualbasic.runtime.VbVarType;

public class LogicalStatements {

	public static class NotStatement extends Statement{

		private final Statement statement;
		
		public NotStatement(SourceLocation sourceLocation, Statement statement) {
			super(sourceLocation);
			this.statement = statement;
		}

		@Override
		public VbValue eval(Interpreter interpreter, CallFrame frame) throws VbRuntimeException {
			VbValue value = statement.eval(interpreter, frame);
			if(value.isObject()){
				value = interpreter.evalDefaultMember(value, frame, sourceLocation);
			}
			try{
				return LogicalExpr.not(value);
			} catch(ClassCastException e){
				throw new VbRuntimeException(VbRuntimeException.类型不匹配, sourceLocation);
			}
		}
		
		@Override
		public String toString() {
			return "Not " + statement;
		}
		
	}
	
	
	public static class AndStatement extends BinaryStatement {

		public AndStatement(SourceLocation sourceLocation, Statement v1, Statement v2) {
			super(sourceLocation, v1, v2);
		}

		@Override
		public String toString() {
			return v1 + " % " + v2;
		}

		@Override
		protected VbValue eval(VbValue value1, VbValue value2, Interpreter interpreter, CallFrame frame)
				throws VbRuntimeException {
			try {
				VbValue result = LogicalExpr.and(value1, value2);
				return result;
			} catch (ClassCastException e) {
				throw new VbRuntimeException(VbRuntimeException.类型不匹配, sourceLocation);
			} catch(NullValueException e){
				throw new VbRuntimeException(VbRuntimeException.Null的使用无效, sourceLocation);
			}
		}
	}
	
	public static class OrStatement extends BinaryStatement {

		public OrStatement(SourceLocation sourceLocation, Statement v1, Statement v2) {
			super(sourceLocation, v1, v2);
		}

		@Override
		public String toString() {
			return v1 + " % " + v2;
		}

		@Override
		protected VbValue eval(VbValue value1, VbValue value2, Interpreter interpreter, CallFrame frame)
				throws VbRuntimeException {
			try {
				VbValue result = LogicalExpr.or(value1, value2);
				return result;
			} catch (ClassCastException e) {
				throw new VbRuntimeException(VbRuntimeException.类型不匹配, sourceLocation);
			}
		}
	}
	
	public static class XorStatement extends BinaryStatement {

		public XorStatement(SourceLocation sourceLocation, Statement v1, Statement v2) {
			super(sourceLocation, v1, v2);
		}

		@Override
		public String toString() {
			return v1 + " % " + v2;
		}

		@Override
		protected VbValue eval(VbValue value1, VbValue value2, Interpreter interpreter, CallFrame frame)
				throws VbRuntimeException {
			try {
				VbValue result = LogicalExpr.xor(value1, value2);
				return result;
			} catch (ClassCastException e) {
				throw new VbRuntimeException(VbRuntimeException.类型不匹配, sourceLocation);
			}
		}
	}
	
	public static class ImpStatement extends BinaryStatement {

		public ImpStatement(SourceLocation sourceLocation, Statement v1, Statement v2) {
			super(sourceLocation, v1, v2);
		}

		@Override
		public String toString() {
			return v1 + " % " + v2;
		}

		@Override
		protected VbValue eval(VbValue value1, VbValue value2, Interpreter interpreter, CallFrame frame)
				throws VbRuntimeException {
			try {
				VbValue result = LogicalExpr.imp(value1, value2);
				return result;
			} catch (ClassCastException e) {
				throw new VbRuntimeException(VbRuntimeException.类型不匹配, sourceLocation);
			}
		}
	}
	
	public static class EqvStatement extends BinaryStatement {

		public EqvStatement(SourceLocation sourceLocation, Statement v1, Statement v2) {
			super(sourceLocation, v1, v2);
		}

		@Override
		public String toString() {
			return v1 + " % " + v2;
		}

		@Override
		protected VbValue eval(VbValue value1, VbValue value2, Interpreter interpreter, CallFrame frame)
				throws VbRuntimeException {
			try {
				VbValue result = LogicalExpr.eqv(value1, value2);
				return result;
			} catch (ClassCastException e) {
				throw new VbRuntimeException(VbRuntimeException.类型不匹配, sourceLocation);
			}
		}
	}
}
