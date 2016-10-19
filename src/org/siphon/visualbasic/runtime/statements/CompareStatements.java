package org.siphon.visualbasic.runtime.statements;

import org.siphon.visualbasic.Interpreter;
import org.siphon.visualbasic.SourceLocation;
import org.siphon.visualbasic.runtime.CallFrame;
import org.siphon.visualbasic.runtime.Comparision;
import org.siphon.visualbasic.runtime.LogicalExpr;
import org.siphon.visualbasic.runtime.NullValueException;
import org.siphon.visualbasic.runtime.Statement;
import org.siphon.visualbasic.runtime.StringExpr;
import org.siphon.visualbasic.runtime.VbRuntimeException;
import org.siphon.visualbasic.runtime.VbValue;
import org.siphon.visualbasic.runtime.VbVarType;

public class CompareStatements {

	public static class LikeStatement extends BinaryStatement {
		
		public LikeStatement(SourceLocation sourceLocation, Statement v1, Statement v2) {
			super(sourceLocation, v1, v2);
		}

		@Override
		public String toString() {
			return v1 + " Like " + v2;
		}

		@Override
		protected VbValue eval(VbValue value1, VbValue value2, Interpreter interpreter, CallFrame frame)
				throws VbRuntimeException {
			try {
				VbValue result = StringExpr.like(value1, value2);
				return result;
			} catch (ClassCastException e) {
				throw new VbRuntimeException(VbRuntimeException.类型不匹配, sourceLocation);
			} catch(NullValueException e){
				throw new VbRuntimeException(VbRuntimeException.Null的使用无效, sourceLocation);
			}
		}


	}

	public static class GeqStatement extends BinaryStatement {

		public GeqStatement(SourceLocation sourceLocation, Statement v1, Statement v2) {
			super(sourceLocation, v1, v2);
		}

		@Override
		public String toString() {
			return v1 + " >= " + v2;
		}

		@Override
		protected VbValue eval(VbValue value1, VbValue value2, Interpreter interpreter, CallFrame frame)
				throws VbRuntimeException {
			try {
				VbValue result = Comparision.geq(value1, value2);
				return result;
			} catch (ClassCastException e) {
				throw new VbRuntimeException(VbRuntimeException.类型不匹配, sourceLocation);
			} catch(NullValueException e){
				throw new VbRuntimeException(VbRuntimeException.Null的使用无效, sourceLocation);
			}
		}

	}
	
	public static class LeqStatement extends BinaryStatement {

		public LeqStatement(SourceLocation sourceLocation, Statement v1, Statement v2) {
			super(sourceLocation, v1, v2);
		}
		
		@Override
		public String toString() {
			return v1 + " <= " + v2;
		}

		@Override
		protected VbValue eval(VbValue value1, VbValue value2, Interpreter interpreter, CallFrame frame)
				throws VbRuntimeException {
			try {
				VbValue result = Comparision.leq(value1, value2);
				return result;
			} catch (ClassCastException e) {
				throw new VbRuntimeException(VbRuntimeException.类型不匹配, sourceLocation);
			} catch(NullValueException e){
				throw new VbRuntimeException(VbRuntimeException.Null的使用无效, sourceLocation);
			}
		}

	}

	public static class EqStatement extends BinaryStatement {

		public EqStatement(SourceLocation sourceLocation, Statement v1, Statement v2) {
			super(sourceLocation, v1, v2);
		}

		@Override
		public String toString() {
			return v1 + " == " + v2;
		}

		@Override
		protected VbValue eval(VbValue value1, VbValue value2, Interpreter interpreter, CallFrame frame)
				throws VbRuntimeException {
			try {
				VbValue result = Comparision.eq(value1, value2);
				return result;
			} catch (ClassCastException e) {
				throw new VbRuntimeException(VbRuntimeException.类型不匹配, sourceLocation);
			} catch(NullValueException e){
				throw new VbRuntimeException(VbRuntimeException.Null的使用无效, sourceLocation);
			}
		}
	}

	public static class NeqStatement extends BinaryStatement {

		public NeqStatement(SourceLocation sourceLocation, Statement v1, Statement v2) {
			super(sourceLocation, v1, v2);
		}

		@Override
		public String toString() {
			return v1 + " != " + v2;
		}

		@Override
		protected VbValue eval(VbValue value1, VbValue value2, Interpreter interpreter, CallFrame frame)
				throws VbRuntimeException {
			try {
				VbValue result = Comparision.neq(value1, value2);
				return result;
			} catch (ClassCastException e) {
				throw new VbRuntimeException(VbRuntimeException.类型不匹配, sourceLocation);
			} catch(NullValueException e){
				throw new VbRuntimeException(VbRuntimeException.Null的使用无效, sourceLocation);
			}
		}

	}

	public static class LtStatement extends BinaryStatement {

		public LtStatement(SourceLocation sourceLocation, Statement v1, Statement v2) {
			super(sourceLocation, v1, v2);
		}

		@Override
		public String toString() {
			return v1 + " < " + v2;
		}

		@Override
		protected VbValue eval(VbValue value1, VbValue value2, Interpreter interpreter, CallFrame frame)
				throws VbRuntimeException {
			try {
				VbValue result = Comparision.lt(value1, value2);
				return result;
			} catch (ClassCastException e) {
				throw new VbRuntimeException(VbRuntimeException.类型不匹配, sourceLocation);
			} catch(NullValueException e){
				throw new VbRuntimeException(VbRuntimeException.Null的使用无效, sourceLocation);
			}
		}

	}

	public static class GtStatement extends BinaryStatement {

		public GtStatement(SourceLocation sourceLocation, Statement v1, Statement v2) {
			super(sourceLocation, v1, v2);
		}

		@Override
		public String toString() {
			return v1 + " > " + v2;
		}

		@Override
		protected VbValue eval(VbValue value1, VbValue value2, Interpreter interpreter, CallFrame frame)
				throws VbRuntimeException {
			try {
				VbValue result = Comparision.gt(value1, value2);
				return result;
			} catch (ClassCastException e) {
				throw new VbRuntimeException(VbRuntimeException.类型不匹配, sourceLocation);
			} catch(NullValueException e){
				throw new VbRuntimeException(VbRuntimeException.Null的使用无效, sourceLocation);
			}
		}
	}

	public static void checkAllowCompare(VbVarType varType, VbVarType varType2) {
	}
}