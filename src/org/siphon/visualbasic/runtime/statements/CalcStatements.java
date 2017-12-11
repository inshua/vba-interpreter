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

import org.siphon.visualbasic.ClassTypeDecl;
import org.siphon.visualbasic.Interpreter;
import org.siphon.visualbasic.OverflowException;
import org.siphon.visualbasic.SourceLocation;
import org.siphon.visualbasic.compile.ImpossibleException;
import org.siphon.visualbasic.runtime.CallFrame;
import org.siphon.visualbasic.runtime.DivByZeroException;
import org.siphon.visualbasic.runtime.MathExpr;
import org.siphon.visualbasic.runtime.NullValueException;
import org.siphon.visualbasic.runtime.Statement;
import org.siphon.visualbasic.runtime.VbRuntimeException;
import org.siphon.visualbasic.runtime.VbValue;
import org.siphon.visualbasic.runtime.VbVarType;

public class CalcStatements{
	
	public static class PosStatement extends Statement {

		private Statement statement;

		public PosStatement(SourceLocation sourceLocation, Statement statement) {
			super(sourceLocation);
			this.statement = statement;
		}

		@Override
		public VbValue eval(Interpreter interpreter, CallFrame frame) throws VbRuntimeException {
			VbValue value = this.statement.eval(interpreter, frame);
			if(value.isObject()){
				value = interpreter.evalDefaultMember(value, frame, sourceLocation);
			}
			try{
				return MathExpr.pos(value);
			} catch(ClassCastException e){
				throw new VbRuntimeException(VbRuntimeException.类型不匹配, sourceLocation);
			} catch (OverflowException e) {
				throw new ImpossibleException();
			} catch(NullValueException e){
				throw new VbRuntimeException(VbRuntimeException.Null的使用无效, sourceLocation);
			}
		}


		@Override
		public String toString() {
			return " + (" + statement + ")";
		}
	}

	public static class NegStatement extends Statement {

		private Statement statement;

		public NegStatement(SourceLocation sourceLocation, Statement statement) {
			super(sourceLocation);
			this.statement = statement;
		}

		@Override
		public VbValue eval(Interpreter interpreter, CallFrame frame) throws VbRuntimeException {
			VbValue value = this.statement.eval(interpreter, frame);
			if(value.isObject()){
				value = interpreter.evalDefaultMember(value, frame, sourceLocation);
			}
			try{
				return MathExpr.neg(value);
			} catch(ClassCastException e){
				throw new VbRuntimeException(VbRuntimeException.类型不匹配, sourceLocation);
			} catch (OverflowException e) {
				throw new VbRuntimeException(VbRuntimeException.溢出, sourceLocation);
			} catch(NullValueException e){
				throw new VbRuntimeException(VbRuntimeException.Null的使用无效, sourceLocation);
			}
		}
		@Override
		public String toString() {
			return " - (" + statement + ")";
		}

	}

	
	public static class ConcatStatement extends BinaryStatement {


		public ConcatStatement(SourceLocation sourceLocation, Statement v1, Statement v2) {
			super(sourceLocation, v1, v2);
		}

		@Override
		public String toString() {
			return v1 + " & " + v2;
		}

		@Override
		protected VbValue eval(VbValue value1, VbValue value2, Interpreter interpreter, CallFrame frame) throws VbRuntimeException {
			String s;
			try {
				s = VbValue.CStr(value1).value + "" + VbValue.CStr(value2).value;
				return new VbValue(VbVarType.VbString, s);
			} catch(ClassCastException e){ 
				throw new VbRuntimeException(VbRuntimeException.类型不匹配, sourceLocation);
			} catch (OverflowException e) {
				throw new ImpossibleException();
			} catch(NullValueException e){
				throw new VbRuntimeException(VbRuntimeException.Null的使用无效, sourceLocation);
			}
		}

	}

	public static class AddStatement extends BinaryStatement {


		public AddStatement(SourceLocation sourceLocation, Statement v1, Statement v2) {
			super(sourceLocation, v1, v2);
		}

		
		@Override
		public String toString() {
			return v1 + " + " + v2;
		}

		@Override
		protected VbValue eval(VbValue value1, VbValue value2, Interpreter interpreter, CallFrame frame)
				throws VbRuntimeException {
			try {
				return MathExpr.add(value1, value2);
			} catch (OverflowException e) {
				throw new VbRuntimeException(VbRuntimeException.溢出, sourceLocation);
			} catch (ClassCastException e) {
				throw new VbRuntimeException(VbRuntimeException.类型不匹配, sourceLocation);
			} catch(NullValueException e){
				throw new VbRuntimeException(VbRuntimeException.Null的使用无效, sourceLocation);
			}
		}

	}
	
	public static class SubtractStatement extends BinaryStatement {


		public SubtractStatement(SourceLocation sourceLocation, Statement v1, Statement v2) {
			super(sourceLocation, v1, v2);
		}

		@Override
		public String toString() {
			return v1 + " - " + v2;
		}

		@Override
		protected VbValue eval(VbValue value1, VbValue value2, Interpreter interpreter, CallFrame frame)
				throws VbRuntimeException {
			try {
				return MathExpr.subtract(value1, value2);
			} catch (OverflowException e) {
				throw new VbRuntimeException(VbRuntimeException.溢出, sourceLocation);
			} catch (ClassCastException e) {
				throw new VbRuntimeException(VbRuntimeException.类型不匹配, sourceLocation);
			} catch(NullValueException e){
				throw new VbRuntimeException(VbRuntimeException.Null的使用无效, sourceLocation);
			}
		}
	}
	
	public static class MultiStatement extends BinaryStatement {


		public MultiStatement(SourceLocation sourceLocation,Statement v1, Statement v2) {
			super(sourceLocation, v1, v2);
		}

		@Override
		public String toString() {
			return v1 + " * " + v2;
		}

		@Override
		protected VbValue eval(VbValue value1, VbValue value2, Interpreter interpreter, CallFrame frame)
				throws VbRuntimeException {
			try {
				return MathExpr.multi(value1, value2);
			} catch (OverflowException e) {
				throw new VbRuntimeException(VbRuntimeException.溢出, sourceLocation);
			} catch (ClassCastException e) {
				throw new VbRuntimeException(VbRuntimeException.类型不匹配, sourceLocation);
			} catch(NullValueException e){
				throw new VbRuntimeException(VbRuntimeException.Null的使用无效, sourceLocation);
			}
		}

	}
	
	public static class PowerStatement extends BinaryStatement {


		public PowerStatement(SourceLocation sourceLocation,Statement v1, Statement v2) {
			super(sourceLocation, v1, v2);
		}

		@Override
		public String toString() {
			return v1 + " ^ " + v2;
		}

		@Override
		protected VbValue eval(VbValue value1, VbValue value2, Interpreter interpreter, CallFrame frame)
				throws VbRuntimeException {
			try {
				return MathExpr.power(value1, value2);
			} catch (OverflowException e) {
				throw new VbRuntimeException(VbRuntimeException.溢出, sourceLocation);
			} catch (ClassCastException e) {
				throw new VbRuntimeException(VbRuntimeException.类型不匹配, sourceLocation);
			} catch(NullValueException e){
				throw new VbRuntimeException(VbRuntimeException.Null的使用无效, sourceLocation);
			}
		}

	}

	public static class DivStatement extends BinaryStatement {


		public DivStatement(SourceLocation sourceLocation, Statement v1, Statement v2) {
			super(sourceLocation, v1, v2);
		}

		@Override
		public String toString() {
			return v1 + " / " + v2;
		}

		@Override
		protected VbValue eval(VbValue value1, VbValue value2, Interpreter interpreter, CallFrame frame)
				throws VbRuntimeException {
			try {
				VbValue result = MathExpr.div(value1, value2);
				Number r = (Number)result.getExactValue();
				if(Double.isInfinite(r.doubleValue())){
					throw new VbRuntimeException(VbRuntimeException.除以零, sourceLocation);
				}
				return result;
			} catch (OverflowException e) {
				throw new VbRuntimeException(VbRuntimeException.溢出, sourceLocation);
			} catch (ClassCastException e) {
				throw new VbRuntimeException(VbRuntimeException.类型不匹配, sourceLocation);
			} catch(NullValueException e){
				throw new VbRuntimeException(VbRuntimeException.Null的使用无效, sourceLocation);
			}
		}
	}
	
	public static class IDivStatement extends BinaryStatement {


		public IDivStatement(SourceLocation sourceLocation, Statement v1, Statement v2) {
			super(sourceLocation, v1, v2);
		}


		@Override
		public String toString() {
			return v1 + " \\ " + v2;
		}

		@Override
		protected VbValue eval(VbValue value1, VbValue value2, Interpreter interpreter, CallFrame frame)
				throws VbRuntimeException {
			try {
				VbValue result = MathExpr.idiv(value1, value2);
				Number r = (Number)result.getExactValue();
				if(Double.isInfinite(r.doubleValue())){
					throw new VbRuntimeException(VbRuntimeException.除以零, sourceLocation);
				}
				return result;
			} catch (OverflowException e) {
				throw new VbRuntimeException(VbRuntimeException.溢出, sourceLocation);
			} catch (ClassCastException e) {
				throw new VbRuntimeException(VbRuntimeException.类型不匹配, sourceLocation);
			} catch(DivByZeroException e){
				throw new VbRuntimeException(VbRuntimeException.除以零, sourceLocation);
			} catch(NullValueException e){
				throw new VbRuntimeException(VbRuntimeException.Null的使用无效, sourceLocation);
			}
		}
	}
	
	public static class ModStatement extends BinaryStatement {


		public ModStatement(SourceLocation sourceLocation, Statement v1, Statement v2) {
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
				VbValue result = MathExpr.mod(value1, value2);
				return result;
			} catch (OverflowException e) {
				throw new VbRuntimeException(VbRuntimeException.溢出, sourceLocation);
			} catch (ClassCastException e) {
				throw new VbRuntimeException(VbRuntimeException.类型不匹配, sourceLocation);
			} catch(DivByZeroException e){
				throw new VbRuntimeException(VbRuntimeException.除以零, sourceLocation);
			} catch(NullValueException e){
				throw new VbRuntimeException(VbRuntimeException.Null的使用无效, sourceLocation);
			}
		}
	}

	// TODO
	public static VbVarType findOpResultType(VbVarType varType, VbVarType varType2, char c) {
		return null;
	}

	public static VbVarType findPosNegResultType(char c, VbVarType varType) {
		return null;
	}

}
