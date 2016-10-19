package org.siphon.visualbasic.runtime.statements;

import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.siphon.visualbasic.Interpreter;
import org.siphon.visualbasic.SourceLocation;
import org.siphon.visualbasic.runtime.CallFrame;
import org.siphon.visualbasic.runtime.Statement;
import org.siphon.visualbasic.runtime.VbValue;

/**
 * 编译时 goto 的 label 的行号未定，先用这个语句占位
 */
public class UndeterminedLabelGotoStatement extends Statement {

	public final String label;
	public final List<Statement> owner;

	public UndeterminedLabelGotoStatement(SourceLocation sourceLocation, String label, List<Statement> owner) {
		super(sourceLocation);
		this.label = label;
		this.owner = owner;
	}
	
	public GotoStatement toGotoStatement(int lineIndex){
		return new GotoStatement(sourceLocation, lineIndex);
	}

	@Override
	public VbValue eval(Interpreter interpreter, CallFrame frame) {
		return null;
	}

	public static class GoSub extends UndeterminedLabelGotoStatement {

		public GoSub(SourceLocation sourceLocation, String label, List<Statement> owner) {
			super(sourceLocation, label, owner);
		}
		
		public GotoStatement toGotoStatement(int lineIndex){
			return new GoSubStatement(sourceLocation, lineIndex);
		}

	}
}
