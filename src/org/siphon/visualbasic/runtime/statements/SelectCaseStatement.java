package org.siphon.visualbasic.runtime.statements;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.siphon.visualbasic.Interpreter;
import org.siphon.visualbasic.SourceLocation;
import org.siphon.visualbasic.runtime.CallFrame;
import org.siphon.visualbasic.runtime.Comparision;
import org.siphon.visualbasic.runtime.Statement;
import org.siphon.visualbasic.runtime.VbRuntimeException;
import org.siphon.visualbasic.runtime.VbValue;

public class SelectCaseStatement extends Statement {

	public static class SingleValueCondition extends SelectCaseConditionStatement {

		public final Statement valueStatement;

		public SingleValueCondition(Statement valueStatement) {
			this.valueStatement = valueStatement;
		}

		@Override
		public boolean test(Interpreter interpreter, CallFrame frame, VbValue value) throws VbRuntimeException {
			VbValue v = valueStatement.eval(interpreter, frame);
			if(v.isString()) {
				value = VbValue.CStr(value);
			} else if( value.isString()) {
				v = VbValue.CStr(v);
			}
			return Comparision.compare(v, value) == 0;
		}

		@Override
		public String toString() {
			return String.format("(SingleValue %s)", this.valueStatement);
		}

	}

	public static class ComparisonCondition extends SelectCaseConditionStatement {

		public final String comparison; // 未来再提高效率

		public final Statement valueStatement;

		public ComparisonCondition(Statement valueStatement, String comparison) {
			this.valueStatement = valueStatement;
			this.comparison = comparison;
		}

		@Override
		public boolean test(Interpreter interpreter, CallFrame frame, VbValue value) throws VbRuntimeException {
			VbValue pattern = valueStatement.eval(interpreter, frame);
			if(pattern.isString()) {
				value = VbValue.CStr(value);
			} else if(value.isString()) {
				pattern = VbValue.CStr(pattern);
			}
			double c = Comparision.compare(value, pattern);
			switch (comparison) {
			case "=":
				return c == 0;
			case ">=":
				return c >= 0;
			case ">":
				return c > 0;
			case "<":
				return c < 0;
			case "<=":
				return c <= 0;
			}
			throw new UnsupportedOperationException(comparison);
		}

		@Override
		public String toString() {
			return String.format("(%s %s)", this.comparison, this.valueStatement);
		}
	}

	public static class BetweenCondition extends SelectCaseConditionStatement {

		private final Statement from;
		private final Statement to;

		public BetweenCondition(Statement from, Statement to) {
			this.from = from;
			this.to = to;
		}

		@Override
		public boolean test(Interpreter interpreter, CallFrame frame, VbValue value) throws VbRuntimeException {
			VbValue f = from.eval(interpreter, frame);
			VbValue t = to.eval(interpreter, frame);
			VbValue v1 = value, v2 = value;
			if(f.isString()) {
				v1 = VbValue.CStr(v1);
			} else if(v1.isString()) {
				f = VbValue.CStr(f);						
			}
			if(t.isString()) {
				v2 = VbValue.CStr(v2);
			} else if(v2.isString()) {
				t = VbValue.CStr(t);						
			}
			return Comparision.compare(v1, f) >= 0 && Comparision.compare(v2, t) <= 0;
		}

		@Override
		public String toString() {
			return String.format("Between %s And %s", this.from, this.to);
		}

	}

	public static class Switcher {
		public SelectCaseConditionStatement[] conditionStatements;
		public int nextStatementIndex;
	}

	public final List<Switcher> switchers = new ArrayList<>();

	private final Statement condition;

	public int defaultStatementIndex;

	private Object conditionStatements;

	public SelectCaseStatement(SourceLocation sourceLocation, Statement condition) {
		super(sourceLocation);
		this.condition = condition;
	}

	@Override
	public VbValue eval(Interpreter interpreter, CallFrame frame) throws VbRuntimeException {
		VbValue value = this.condition.eval(interpreter, frame);
		for (Switcher switcher : switchers) {
			for (SelectCaseConditionStatement cond : switcher.conditionStatements) {
				if (cond.test(interpreter, frame, value)) {
					frame.nextStatement = switcher.nextStatementIndex;
					return null;
				}
			}
		}

		frame.nextStatement = defaultStatementIndex;

		return null;
	}

	@Override
	public String toString() {
		List<String> ls = new ArrayList<>();
		ls.add("Select Case " + this.condition);
		for (Switcher switcher : switchers) {
			for (SelectCaseConditionStatement cond : switcher.conditionStatements) {
				ls.add("Case " + cond + " Goto " + switcher.nextStatementIndex);
			}
		}
		ls.add("End Select");
		return StringUtils.join(ls, "\r\n");

	}

}
