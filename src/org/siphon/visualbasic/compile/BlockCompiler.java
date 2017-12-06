package org.siphon.visualbasic.compile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static org.siphon.visualbasic.compile.Compiler.getArgumentDeclsOfMethodOrProperty;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.collections.CollectionUtils;
import org.siphon.visualbasic.ClassModuleDecl;
import org.siphon.visualbasic.ClassTypeDecl;
import org.siphon.visualbasic.EventDecl;
import org.siphon.visualbasic.MethodDecl;
import org.siphon.visualbasic.MethodType;
import org.siphon.visualbasic.ModuleDecl;
import org.siphon.visualbasic.OverflowException;
import org.siphon.visualbasic.PropertyDecl;
import org.siphon.visualbasic.SourceLocation;
import org.siphon.visualbasic.VarDecl;
import org.siphon.visualbasic.VbDecl;
import org.siphon.visualbasic.compile.NamedArgument.AlreadyPositionedException;
import org.siphon.visualbasic.compile.NamedArgument.NameNotFoundException;
import org.siphon.visualbasic.compile.NamedArgument.RemainShouldNamedException;
import org.siphon.visualbasic.runtime.ArgumentDecl;
import org.siphon.visualbasic.runtime.ArrayDef;
import org.siphon.visualbasic.runtime.ArrayDef.RankAsStatement;
import org.siphon.visualbasic.runtime.Statement;
import org.siphon.visualbasic.runtime.VbValue;
import org.siphon.visualbasic.runtime.VbVarType;
import org.siphon.visualbasic.runtime.statements.AssignStatement;
import org.siphon.visualbasic.runtime.statements.EvalAssignableStatement;
import org.siphon.visualbasic.runtime.statements.ExitMethodStatement;
import org.siphon.visualbasic.runtime.statements.ForEachStatement;
import org.siphon.visualbasic.runtime.statements.ForNextStatement;
import org.siphon.visualbasic.runtime.statements.GoSubStatement;
import org.siphon.visualbasic.runtime.statements.GotoStatement;
import org.siphon.visualbasic.runtime.statements.IfNotGotoStatement;
import org.siphon.visualbasic.runtime.statements.LiteralStatement;
import org.siphon.visualbasic.runtime.statements.LogicalStatements;
import org.siphon.visualbasic.runtime.statements.MidStatment;
import org.siphon.visualbasic.runtime.statements.NewStatement;
import org.siphon.visualbasic.runtime.statements.OnErrorStatement;
import org.siphon.visualbasic.runtime.statements.PrintStatement;
import org.siphon.visualbasic.runtime.statements.RaiseEventStatement;
import org.siphon.visualbasic.runtime.statements.RedimStatement;
import org.siphon.visualbasic.runtime.statements.ResumeStatement;
import org.siphon.visualbasic.runtime.statements.ReturnStatement;
import org.siphon.visualbasic.runtime.statements.SelectCaseConditionStatement;
import org.siphon.visualbasic.runtime.statements.SelectCaseStatement;
import org.siphon.visualbasic.runtime.statements.StopStatement;
import org.siphon.visualbasic.runtime.statements.SelectCaseStatement.ComparisonCondition;
import org.siphon.visualbasic.runtime.statements.SelectCaseStatement.Switcher;
import org.siphon.visualbasic.runtime.statements.VariableStatement;
import org.siphon.visualbasic.runtime.statements.UndeterminedLabelGotoStatement;
import org.siphon.visualbasic.runtime.statements.WithStatement;

import jdk.nashorn.internal.ir.BlockStatement;
import vba.VbaParser.AmbiguousIdentifierContext;
import vba.VbaParser.ArgCallContext;
import vba.VbaParser.ArgListContext;
import vba.VbaParser.ArgsCallContext;
import vba.VbaParser.BlockContext;
import vba.VbaParser.BlockIfThenElseContext;
import vba.VbaParser.BlockStmtContext;
import vba.VbaParser.CaseCondIsContext;
import vba.VbaParser.CaseCondSelectionContext;
import vba.VbaParser.CaseCondToContext;
import vba.VbaParser.CaseCondValueContext;
import vba.VbaParser.ConstStmtContext;
import vba.VbaParser.ConstSubscriptContext;
import vba.VbaParser.ConstSubscriptsContext;
import vba.VbaParser.ConstValueExprContext;
import vba.VbaParser.DoLoopStmtContext;
import vba.VbaParser.ExitStmtContext;
import vba.VbaParser.ExplicitCallStmtContext;
import vba.VbaParser.ForEachStmtContext;
import vba.VbaParser.ForNextStmtContext;
import vba.VbaParser.GoSubStmtContext;
import vba.VbaParser.GoToStmtContext;
import vba.VbaParser.IfBlockStmtContext;
import vba.VbaParser.IfConditionStmtContext;
import vba.VbaParser.IfElseBlockStmtContext;
import vba.VbaParser.IfElseIfBlockStmtContext;
import vba.VbaParser.IfThenElseStmtContext;
import vba.VbaParser.ImplicitCallStmt_InBlockContext;
import vba.VbaParser.ImplicitCallStmt_InStmtContext;
import vba.VbaParser.InlineIfThenElseContext;
import vba.VbaParser.LetStmtContext;
import vba.VbaParser.LineLabelContext;
import vba.VbaParser.LoadStmtContext;
import vba.VbaParser.MidStmtContext;
import vba.VbaParser.OnErrorStmtContext;
import vba.VbaParser.PrintStmtContext;
import vba.VbaParser.RaiseEventStmtContext;
import vba.VbaParser.RandomizeStmtContext;
import vba.VbaParser.RedimStmtContext;
import vba.VbaParser.RedimSubStmtContext;
import vba.VbaParser.ResumeStmtContext;
import vba.VbaParser.ReturnStmtContext;
import vba.VbaParser.SC_CaseContext;
import vba.VbaParser.SC_CondContext;
import vba.VbaParser.SC_SelectionContext;
import vba.VbaParser.SelectCaseStmtContext;
import vba.VbaParser.SetStmtContext;
import vba.VbaParser.StopStmtContext;
import vba.VbaParser.SubscriptContext;
import vba.VbaParser.SubscriptsContext;
import vba.VbaParser.ValueStmtContext;
import vba.VbaParser.VariableStmtContext;
import vba.VbaParser.WhileWendStmtContext;
import vba.VbaParser.WithStmtContext;

public class BlockCompiler {

	private static class Exits {
		public List<GotoStatement> forStatements = new ArrayList<>();
		public List<GotoStatement> doStatements = new ArrayList<>();
	}

	private BlockContext block;
	private MethodDecl method;
	private Compiler compiler;

	List<Statement> result = new ArrayList<>();
	Map<String, Integer> labels = new HashMap<>();
	int innerLabelId = 0;
	private final ModuleDecl module;
	
	private List<UndeterminedLabelGotoStatement> undeterminedLableGotoStaments = new ArrayList<>();

	public BlockCompiler(BlockContext block, MethodDecl method, Compiler compiler) {
		this.block = block;
		this.method = method;
		this.module = method.module;
		this.compiler = compiler;
	}
	
	public BlockCompiler(MethodDecl method, Compiler compiler) {
		this.block = block;
		this.method = method;
		this.module = method.module;
		this.compiler = compiler;
	}

	/*
	 * 	lineLabel					*
	| appactivateStmt				-	激活一应用程序窗口。
	| attributeStmt					-	不知是什么
	| beepStmt						-	通过计算机喇叭发出一个声调。
	| chdirStmt						-	改变当前的目录或文件夹。
	| chdriveStmt					-	改变当前的驱动器。
	| closeStmt						-	关闭 Open 语句所打开的输入/输出 (I/O) 文件。
	| constStmt						*
	| dateStmt						-	设置当前系统日期。
	| deleteSettingStmt				-	在 Windows 注册表中，从应用程序项目里删除区域或注册表项设置。
	| deftypeStmt					-	在模块级别上，为变量和传给过程的参数，设置缺省数据类型，以及为其名称以指定的字符开头的 Function 和 Property Get 过程，设置返回值类型。
	| doLoopStmt					*
	| endStmt						-	这种语句并不存在
	| eraseStmt						w	重新初始化大小固定的数组的元素，以及释放动态数组的存储空间。
	| errorStmt						w	模拟错误的发生。Error 语句获得的支持是向后兼容的。在新的代码中，特别是在建立对象时，要使用 Err 对象的 Raise 方法产生运行时错误。
	| exitStmt						*
	| explicitCallStmt				*
	| filecopyStmt					-
	| forEachStmt					*
	| forNextStmt					*
	| getStmt						-	将一个已打开的磁盘文件读入一个变量之中。通常用 Put 将 Get 读出的数据写入一个文件。
	| goSubStmt						*
	| goToStmt						*
	| ifThenElseStmt				*
	| inputStmt						-	从已打开的顺序文件中读出数据并将数据指定给变量。
	| killStmt						-	从磁盘中删除文件。
	| letStmt						*
	| lineInputStmt					-	从已打开的顺序文件中读出一行并将它分配给 String变量。
	| loadStmt						-	加载窗口
	| lockStmt						-	对于用 Open 语句打开的全部文件或一部分文件，其它进程所进行的控制访问。
	| lsetStmt						w	在一字符串变量中将一字符串往左对齐，或是将一用户定义类型变量复制到另一用户自定义类型变量。
	| midStmt						*	
	| mkdirStmt						-	创建一个新的目录或文件夹。
	| nameStmt						-	重新命名一个文件、目录、或文件夹。
	| onErrorStmt					*
	| onGoToStmt
	| onGoSubStmt
	| openStmt						-	对文件做任何 I/O 操作之前都必须先打开文件。Open 语句分配一个缓冲区供文件进行 I/O 之用，并决定缓冲区所使用的访问方式。
	| printStmt						-	将格式化显示的数据写入顺序文件中。
	| putStmt						-	将一个变量的数据写入磁盘文件中。
	| raiseEventStmt				*
	| randomizeStmt					-	VB 里实际上用的是 Math.Randomize Sub
	| redimStmt						*	
	| resetStmt						-	关闭所有用 Open 语句打开的磁盘文件。
	| resumeStmt					*
	| returnStmt					*
	| rmdirStmt						-	删除一个存在的目录或文件夹。
	| rsetStmt						w	在一字符串变量中将一字符串往右对齐。
	| savepictureStmt				-
	| saveSettingStmt				-
	| seekStmt						-	在 Open 语句打开的文件中，设置下一个读/写操作的位置。
	| selectCaseStmt				*
	| sendkeysStmt					-	将一个或多个按键消息发送到活动窗口，就如同在键盘上进行输入一样。
	| setattrStmt					- 	为一个文件设置属性信息。
	| setStmt						*
	| stopStmt						* 	可以在过程中的任何地方放置 Stop 语句，使用 Stop 语句，就相当于在程序代码中设置断点。
	| timeStmt						- 	设置系统时间。
	| unloadStmt					-	结束窗口
	| unlockStmt					- 	对于用 Open 语句打开的全部文件或一部分文件，其它进程所进行的控制访问。
	| variableStmt					*
	| whileWendStmt					*
	| widthStmt						-	将一个输出行的宽度指定给用 Open 语句打开的文件。
	| withStmt						*
	| writeStmt						-	将数据写入顺序文件。
	| implicitCallStmt_InBlock		*
	 */
	public List<Statement> compile() {

		compileBlock(block);

		// 确定标签后设置 goto 点
		for (UndeterminedLabelGotoStatement stmt : undeterminedLableGotoStaments) {
			if (labels.containsKey(stmt.label)) {
				Collections.replaceAll(stmt.owner, stmt, stmt.toGotoStatement(labels.get(stmt.label)));
			} else {
				module.addCompileException(new CompileException(stmt.getSourceLocation(), CompileException.LABEL_NOT_DEFINED, stmt.label));
			}
		}

		return result;
	}

	private void compileBlock(BlockContext block) {
		if (block == null)
			return;
		for (BlockStmtContext st : block.blockStmt()) {
			ParserRuleContext c = (ParserRuleContext) st.getChild(0);
			try {
				compileStmt(c, null, null);
			} catch (CompileException e) {
				module.addCompileException(e);
			}
		}
	}

	Statement compileBlockStatement(ParserRuleContext blockStatement) throws CompileException {
		compileStmt(blockStatement, null, null);
		return result.get(0);
	}

	
	private void compileStmt(ParserRuleContext ast, List<GotoStatement> forExits, List<GotoStatement> doWhileExits)
			throws CompileException {
		if (ast instanceof VariableStmtContext) {
			List<VarDecl> vars = compiler.compileVarDecl((VariableStmtContext) ast, method.module, method);
			for (VarDecl v : vars) {
				result.add(new VariableStatement(module.sourceLocation(ast), v));
			}

		} else if (ast instanceof ConstStmtContext) {
			compiler.compileConstDecl((ConstStmtContext) ast, method.module, method);

		} else if (ast instanceof LetStmtContext) {
			/*
			 * letStmt : (LET WS)? implicitCallStmt_InStmt WS? (EQ | PLUS_EQ | MINUS_EQ) WS? valueStmt;
			 */
			LetStmtContext let = (LetStmtContext) ast;
			ValueStmtContext value = let.valueStmt();
			ImplicitCallStmt_InStmtContext implicitCallStmt_InStmt = let.implicitCallStmt_InStmt();
			ValueStatementDesc assignee = compiler.compileImplicitCallStmt(implicitCallStmt_InStmt, method, true);
			ValueStatementDesc valueStmt = compiler.compileValueStatement(value, method);

			ensureAssignable(assignee.getVarType(), valueStmt.getVarType(), "let");
			assert assignee.getStatement() instanceof EvalAssignableStatement;
			result.add(new AssignStatement(module.sourceLocation(ast), (EvalAssignableStatement) assignee.getStatement(),
					valueStmt.getStatement()));
		} else if (ast instanceof SetStmtContext) {
			/*
			setStmt : SET WS implicitCallStmt_InStmt WS? EQ WS? valueStmt;
			*/
			SetStmtContext set = (SetStmtContext) ast;
			ValueStatementDesc assignee = compiler.compileImplicitCallStmt(set.implicitCallStmt_InStmt(), method, true);
			ValueStatementDesc valueStmt = compiler.compileValueStatement(set.valueStmt(), method);
			ensureAssignable(assignee.getVarType(), valueStmt.getVarType(), "set");

			assert assignee.getStatement() instanceof EvalAssignableStatement;
			result.add(new AssignStatement(module.sourceLocation(ast), (EvalAssignableStatement) assignee.getStatement(),
					valueStmt.getStatement()));

		} else if (ast instanceof IfThenElseStmtContext) {
			IfThenElseStmtContext ifThenElse = (IfThenElseStmtContext) ast;
			if (ifThenElse instanceof InlineIfThenElseContext) {
				/*
				 * IF WS ifConditionStmt WS THEN WS blockStmt (WS ELSE WS blockStmt)?
				 */
				InlineIfThenElseContext inlineIfThenElse = (InlineIfThenElseContext) ifThenElse;
				BlockStmtContext ifBlock = inlineIfThenElse.blockStmt(0);
				BlockStmtContext elseBlock = inlineIfThenElse.blockStmt(1);
				compileIfThenElse(inlineIfThenElse.ifConditionStmt(), Arrays.asList(new BlockStmtContext[] { ifBlock }), null,
						Arrays.asList(new BlockStmtContext[] { elseBlock }), forExits, doWhileExits);

			} else if (ifThenElse instanceof BlockIfThenElseContext) {
				/*
				 * ifThenElseStmt : 
						IF WS ifConditionStmt WS THEN WS blockStmt (WS ELSE WS blockStmt)?	# inlineIfThenElse
						| ifBlockStmt ifElseIfBlockStmt* ifElseBlockStmt? END_IF			# blockIfThenElse
					;
				 */
				BlockIfThenElseContext blockIfThenElseContext = (BlockIfThenElseContext) ifThenElse;
				List<IfElseIfBlockStmtContext> elseIfStmts = blockIfThenElseContext.ifElseIfBlockStmt();
				IfElseBlockStmtContext elseStmt = blockIfThenElseContext.ifElseBlockStmt();

				IfBlockStmtContext ifBlock = blockIfThenElseContext.ifBlockStmt();
				IfConditionStmtContext ifBlockCondition = ifBlock.ifConditionStmt();
				List<BlockStmtContext> ifStatements = ifBlock.block().blockStmt();
				List<BlockStmtContext> elseStatements = elseStmt != null ? elseStmt.block().blockStmt() : null;

				compileIfThenElse(ifBlockCondition, ifStatements, elseIfStmts, elseStatements, forExits, doWhileExits);
			}

		} else if (ast instanceof SelectCaseStmtContext) {
			compileSelectCase((SelectCaseStmtContext) ast, forExits, doWhileExits);

		} else if (ast instanceof ForNextStmtContext) {
			compileForNext((ForNextStmtContext) ast, forExits, doWhileExits);

		} else if (ast instanceof ForEachStmtContext) {
			compileForEach((ForEachStmtContext) ast, forExits, doWhileExits);

		} else if (ast instanceof DoLoopStmtContext) {
			compileDoLoop((DoLoopStmtContext) ast, forExits, doWhileExits);

		} else if (ast instanceof WhileWendStmtContext) {
			compileWhileWend((WhileWendStmtContext) ast, forExits, doWhileExits);

		} else if (ast instanceof ExitStmtContext) {
			ExitStmtContext exit = (ExitStmtContext) ast;
			compileExitStmt(exit, forExits, doWhileExits);

		} else if (ast instanceof LineLabelContext) {
			String label = ((LineLabelContext) ast).ambiguousIdentifier().getText().toUpperCase();
			if (labels.containsKey(label)) {
				module.addCompileException(ast, CompileException.AMBIGUOUS_LABEL, ast);
			} else {
				labels.put(label, result.size());
			}

		} else if (ast instanceof WithStmtContext) {
			compileWithStmt((WithStmtContext) ast, forExits, doWhileExits);

		} else if (ast instanceof GoToStmtContext) {
			GoToStmtContext gotoStmt = (GoToStmtContext) ast;
			String label = gotoStmt.ambiguousIdentifier().getText().toUpperCase();
			if (!labels.containsKey(label)) {
				UndeterminedLabelGotoStatement stmt = new UndeterminedLabelGotoStatement(module.sourceLocation(ast), label,
						result);
				result.add(stmt);
				undeterminedLableGotoStaments.add(stmt);
			} else {
				result.add(new GotoStatement(module.sourceLocation(ast), labels.get(label)));
			}

		} else if (ast instanceof GoSubStmtContext) {
			GoSubStmtContext gosubStmt = (GoSubStmtContext) ast;
			String label = gosubStmt.ambiguousIdentifier().getText().toUpperCase();
			if (!labels.containsKey(label)) {
				UndeterminedLabelGotoStatement stmt = new UndeterminedLabelGotoStatement.GoSub(module.sourceLocation(ast),
						label, result);
				result.add(stmt);
				undeterminedLableGotoStaments.add(stmt);
			} else {
				result.add(new GoSubStatement(module.sourceLocation(ast), labels.get(label)));
			}

		} else if (ast instanceof ReturnStmtContext) {
			result.add(new ReturnStatement(module.sourceLocation(ast)));

		} else if (ast instanceof OnErrorStmtContext) {
			compileOnErrorStmt((OnErrorStmtContext) ast);

		} else if (ast instanceof ResumeStmtContext) {
			compileResumeStmt((ResumeStmtContext) ast);

		} else if (ast instanceof RaiseEventStmtContext) {
			compileRaiseEventStmt((RaiseEventStmtContext) ast);

		} else if (ast instanceof PrintStmtContext) { // TODO 这并不是 print 的原意，调试用用
			PrintStmtContext printStmtContext = (PrintStmtContext) ast;
			ValueStmtContext vs = printStmtContext.outputList().outputList_Expression(0).valueStmt();
			result.add(
					new PrintStatement(module.sourceLocation(ast), compiler.compileValueStatement(vs, method).getStatement()));

		} else if (ast instanceof ExplicitCallStmtContext) {
			Statement statement = compileExplicitCallStmt((ExplicitCallStmtContext) ast);
			result.add(statement);

		} else if (ast instanceof ImplicitCallStmt_InBlockContext) {
			Statement statement = compileImplicitCallInBlockStmt((ImplicitCallStmt_InBlockContext) ast);
			result.add(statement);
			
		} else if(ast instanceof StopStmtContext){
			result.add(new StopStatement(module.sourceLocation(ast)));
			
		} else if(ast instanceof RedimStmtContext){
			compileRedimStmt((RedimStmtContext)ast);
			
		} else if(ast instanceof MidStmtContext){
			compileMidStmt((MidStmtContext)ast);
			
		} else if(ast instanceof LoadStmtContext) {
			compileLoadStmt((LoadStmtContext)ast);
			
		} else {
			throw new ImpossibleException();
		}
	}

	private void compileMidStmt(MidStmtContext ast) throws CompileException {
		VbDecl varDecl = compiler.findDeclInScope(ast.ambiguousIdentifier(), method, false);
		compiler.mustBeVariable(varDecl);
		compiler.mustBeStringType(varDecl);
		
		ValueStatementDesc start = compiler.compileValueStatement(ast.valueStmt(0), method);
		compiler.mustBeBaseType(start.getVarType(), start.getAst());
		
		ValueStatementDesc length = null;
		if(ast.valueStmt().size() == 3){
			length = compiler.compileValueStatement(ast.valueStmt(1), method);
			compiler.mustBeBaseType(length.getVarType(), length.getAst());
		}
		
		ValueStmtContext strStmt = ast.valueStmt(ast.valueStmt().size() - 1);
		ValueStatementDesc str = compiler.compileValueStatement(strStmt, method);
		compiler.mustBeBaseType(str.getVarType(), strStmt);
		
		result.add(new MidStatment(module.sourceLocation(ast), (VarDecl) varDecl, start.getStatement(), length == null ? null : length.getStatement(), str.getStatement()));
	}
	
	private void compileLoadStmt(LoadStmtContext ast) {
		// TODO
	}

	private void compileRedimStmt(RedimStmtContext ast) throws CompileException {
		boolean preserve = ast.PRESERVE() != null;
		for(RedimSubStmtContext sub : ast.redimSubStmt()){
			VbDecl decl = compiler.findDeclInScope(sub.ambiguousIdentifier(), method, false);
			compiler.mustBeArrayType(decl);
			VarDecl varDecl = (VarDecl) decl;
			if(varDecl.varType.vbType != VbVarType.vbVariant && varDecl.varType.vbType != VbVarType.vbArray){
				throw module.newCompileException(sub.ambiguousIdentifier(), CompileException.SYNTAX_ERROR, sub.ambiguousIdentifier(), " is not array or variant");
			}
			
			RankAsStatement[] ranks = parseArrayRanks(module, method, sub.subscripts());
			
			VbVarType type = null;
			if(sub.asTypeClause() != null){
				if(preserve){
					throw module.newCompileException(sub.asTypeClause(), CompileException.SYNTAX_ERROR, sub.asTypeClause(), "redim preserve cannot follow with type clause");
				}
				if(varDecl.varType.vbType != VbVarType.vbVariant){
					throw module.newCompileException(sub.asTypeClause(), CompileException.SYNTAX_ERROR, sub.asTypeClause(), "array is not variant, cannot change type");
				}
				type = compiler.parseType(sub.asTypeClause(), null, module);
			}
			
			RedimStatement statement = new RedimStatement(module.sourceLocation(sub), (VarDecl)decl, ranks, preserve, type);
			result.add(statement);
		}
	}
	
	private ArrayDef.RankAsStatement[] parseArrayRanks(ModuleDecl module, MethodDecl method, SubscriptsContext constSubscriptsContext)
			throws CompileException {
		ArrayDef.RankAsStatement[] ranks = null;
		if (constSubscriptsContext != null) {
			List<SubscriptContext> subscripts = constSubscriptsContext.subscript();
			ranks = new ArrayDef.RankAsStatement[subscripts.size()];
			int i = 0;
			for (SubscriptContext subscript : subscripts) {
				if (subscript.valueStmt().size() == 1) {
					int from = module.getArrayBase();
					ValueStatementDesc to;
					ValueStmtContext s = subscript.valueStmt(0);
					try {
						to = compiler.compileValueStatement(s, method);
						compiler.mustBeNumberType(to.getVarType());
						ranks[i++] = new ArrayDef.RankAsStatement(new LiteralStatement(VbValue.fromJava(from)), to.getStatement());
					} catch (OverflowException e) {
						module.addCompileException(s, CompileException.OVERFLOW, s);
					}
				} else {
					ValueStmtContext s = subscript.valueStmt(0);
					ValueStmtContext e = subscript.valueStmt(1);
					try {
						ValueStatementDesc from = compiler.compileValueStatement(s, method);
						ValueStatementDesc to = compiler.compileValueStatement(e, method);
						compiler.mustBeNumberType(from.getVarType());
						compiler.mustBeNumberType(to.getVarType());
						try {
							ranks[i++] = new ArrayDef.RankAsStatement(from.getStatement(), to.getStatement());
						} catch (OverflowException e1) {
							module.addCompileException(s, CompileException.OVERFLOW, e);
						}
					} catch (OverflowException e1) {
						module.addCompileException(s, CompileException.OVERFLOW, s);
					}
				}
			}
		}
		return ranks;
	}

	private void ensureAssignable(VbVarType varType, VbVarType varType2, String mode) {
		// TODO
	}

	private void compileRaiseEventStmt(RaiseEventStmtContext stmt) throws CompileException {
		/*
		 * RAISEEVENT WS ambiguousIdentifier (WS? LPAREN WS? (argsCall WS?)? RPAREN)?;
		 */
		if (module instanceof ClassModuleDecl == false) {
			module.addCompileException(stmt.RAISEEVENT(), CompileException.MUST_IN_CLASSMODULE, stmt.RAISEEVENT());
		}

		ClassModuleDecl classModuleDecl = (ClassModuleDecl) module;

		String eventName = stmt.ambiguousIdentifier().getText();
		EventDecl event = classModuleDecl.events.get(eventName.toUpperCase());
		if (event == null) {
			module.addCompileException(stmt.ambiguousIdentifier(), CompileException.NOT_MEMBER_TYPE,
					stmt.ambiguousIdentifier());
		}
		List<ValueStatementDesc> args = null;
		if (stmt.argsCall() != null) {
			Compiler.noNamedArgs(stmt.argsCall(), module);
			args = compiler.compileArgsCall(stmt.argsCall(), event.arguments, method);
		}
		Compiler.checkArgs(event.arguments, args, module, stmt.argsCall());
		RaiseEventStatement raise = new RaiseEventStatement(module.sourceLocation(stmt), event, compiler.toStatements(args, module));
		result.add(raise);
	}

	private void compileResumeStmt(ResumeStmtContext ast) {
		// resumeStmt : RESUME (WS (NEXT | ambiguousIdentifier))?;
		SourceLocation sourceLocation = module.sourceLocation(ast);
		if (ast.NEXT() != null) {
			result.add(new ResumeStatement.Next(sourceLocation));
		} else if (ast.ambiguousIdentifier() != null) {
			String label = ast.ambiguousIdentifier().getText().toUpperCase();
			if (label.equals("0")) {
				result.add(new ResumeStatement.Resume(sourceLocation));
			} else {
				if (!labels.containsKey(label)) {
					UndeterminedLabelGotoStatement stmt = new ResumeStatement.GotoLabel(sourceLocation, label, result);
					undeterminedLableGotoStaments.add(stmt);
					result.add(stmt);
				} else {
					result.add(new ResumeStatement.Goto(sourceLocation, labels.get(label)));
				}
			}
		} else {
			result.add(new ResumeStatement.Resume(sourceLocation));
		}
	}

	private void compileOnErrorStmt(OnErrorStmtContext ast) {
		// onErrorStmt : (ON_ERROR | ON_LOCAL_ERROR) WS (GOTO WS ambiguousIdentifier | RESUME WS NEXT);
		SourceLocation sourceLocation = module.sourceLocation(ast);
		if (ast.RESUME() != null) {
			result.add(new OnErrorStatement.ResumeNext(sourceLocation));
		} else {
			String label = ast.ambiguousIdentifier().getText().toUpperCase();
			if ("0".equals(label)) {
				result.add(new OnErrorStatement.Reset(sourceLocation));
			} else {
				if (!labels.containsKey(label)) {
					UndeterminedLabelGotoStatement stmt = new OnErrorStatement.GotoLabel(module.sourceLocation(ast), label,
							result);
					undeterminedLableGotoStaments.add(stmt);
					result.add(stmt);
				} else {
					result.add(new OnErrorStatement.Goto(sourceLocation, labels.get(label)));
				}
			}
		}
	}

	private void compileWithStmt(WithStmtContext ast, List<GotoStatement> forExits, List<GotoStatement> doWhileExits)
			throws CompileException {
		/*
		 	withStmt : 
				WITH WS (implicitCallStmt_InStmt | (NEW WS type)) endOfStatement 
				block? 
				END_WITH
			;
		 */
		Statement statement = null;
		VbVarType varType = null;
		if (ast.implicitCallStmt_InStmt() != null) {
			ValueStatementDesc vsd = compiler.compileImplicitCallStmt(ast.implicitCallStmt_InStmt(), method, false, false);
			varType = vsd.getVarType();
			statement = ((EvalAssignableStatement) vsd.getStatement()).apply();
		} else { // new type
			varType = compiler.parseType(ast.type(), null, method.module);
			compiler.mustBeClassType(varType.typeDecl, method.module, ast.type());
			statement = new NewStatement(module.sourceLocation(ast.type()), (ClassTypeDecl) varType.typeDecl);
		}

		WithStatement with = new WithStatement(module.sourceLocation(ast), statement);
		BlockCompiler.this.result.add(with);
		VbDecl prevWith = compiler.withObjDecl;
		SourceLocation prevWithLocation = compiler.withObjDeclLocation;
		compiler.withObjDecl = varType.typeDecl;
		compiler.withObjDeclLocation = module.sourceLocation(ast.type());

		if (ast.block() != null) {
			for (BlockStmtContext st : ast.block().blockStmt()) {
				compileStmt(st, forExits, doWhileExits);
			}
		}

		compiler.withObjDecl = prevWith;
		compiler.withObjDeclLocation = prevWithLocation;
		BlockCompiler.this.result.add(with.endWith(module.sourceLocation(ast.END_WITH())));
	}

	private Statement compileExplicitCallStmt(ExplicitCallStmtContext ast) throws CompileException {
		/*
			explicitCallStmt :  CALL WS implicitCallStmt_InStmt;
		*/
		ValueStatementDesc vsd = compiler.compileImplicitCallStmt(ast.implicitCallStmt_InStmt(), method, false,
				false);
		EvalAssignableStatement stmt = (EvalAssignableStatement) vsd.getStatement();
		return stmt.apply();
	}

	// 没有 call 开始的
	private Statement compileImplicitCallInBlockStmt(ImplicitCallStmt_InBlockContext ast) throws CompileException {
		
		
		/*
			implicitCallStmt_InBlock : implicitCallStmt_InStmt (WS argsCall)?;
		 */
		
		
		ValueStatementDesc vsd = compiler.compileImplicitCallStmt(ast.implicitCallStmt_InStmt(), method, false,
				false);
		EvalAssignableStatement ic = (EvalAssignableStatement) vsd.getStatement();
		
		if (ast.argsCall() != null) { // TODO 编译检查
			List<ValueStatementDesc> args = compiler.compileArgsCall(ast.argsCall(), null, method); // TODO check whether is method/property
			ic.bind(method.module.sourceLocation(ast.argsCall()), compiler.toStatements(args, module));
		}
		return ic.apply();
	}


	private void compileWhileWend(WhileWendStmtContext doLoop, List<GotoStatement> forExits, List<GotoStatement> doWhileExits)
			throws CompileException {
		/*
		 * whileWendStmt : 
			WHILE WS valueStmt endOfStatement 
			block?
			WEND
		;
		 */
		ValueStmtContext vs = doLoop.valueStmt();
		ValueStatementDesc condition = compiler.compileValueStatement(vs, method);
		shouldBeCondition(condition.getVarType());

		int begin = result.size();
		GotoStatement exit = null;
		exit = new IfNotGotoStatement(module.sourceLocation(doLoop.WHILE()), condition.getStatement());
		result.add(exit);
		if (doLoop.block() != null) {
			for (BlockStmtContext st : doLoop.block().blockStmt()) {
				ParserRuleContext c = (ParserRuleContext) st.getChild(0);
				compileStmt(c, forExits, doWhileExits);
			}
		}
		result.add(new GotoStatement(module.sourceLocation(doLoop.WEND()), begin));
		exit.setNextStatement(result.size());
	}

	private void shouldBeCondition(VbVarType condition) {
	}

	private void compileDoLoop(DoLoopStmtContext doLoop, List<GotoStatement> forExits, List<GotoStatement> doWhileExitsPrev)
			throws CompileException {
		/*
		 * doLoopStmt :
			DO endOfStatement 
			block?
			LOOP
			|
			DO WS (WHILE | UNTIL) WS valueStmt endOfStatement
			block?
			LOOP
			| 
			DO endOfStatement
			block
			LOOP WS (WHILE | UNTIL) WS valueStmt
		 */
		List<GotoStatement> doWhileExits = new ArrayList<>();

		ValueStmtContext vs = doLoop.valueStmt();
		ValueStatementDesc condition = vs != null ? compiler.compileValueStatement(vs, method) : null;
		if (condition != null)
			shouldBeCondition(condition.getVarType());
		boolean atBottom = false;
		boolean until = false;
		if (condition != null) {
			atBottom = (doLoop.children.indexOf(condition) == doLoop.children.size() - 1);
			until = (doLoop.UNTIL() != null);
		}

		int begin = result.size();
		if (!atBottom) {
			GotoStatement exit = null;
			if (!until) {
				exit = new IfNotGotoStatement(module.sourceLocation(doLoop.WHILE()), condition.getStatement());
			} else {
				exit = new IfNotGotoStatement(module.sourceLocation(doLoop.UNTIL()),
						new LogicalStatements.NotStatement(module.sourceLocation(doLoop.UNTIL()), condition.getStatement()));
			}
			result.add(exit);
			doWhileExits.add(exit);
		}
		if (doLoop.block() != null) {
			for (BlockStmtContext st : doLoop.block().blockStmt()) {
				ParserRuleContext c = (ParserRuleContext) st.getChild(0);
				compileStmt(c, forExits, doWhileExits);
			}
		}
		if (condition == null || !atBottom) {
			result.add(new GotoStatement(module.sourceLocation(doLoop.DO()), begin));
		} else if (atBottom) {
			if (until) {
				result.add(new IfNotGotoStatement(module.sourceLocation(doLoop.UNTIL()), condition.getStatement())
						.setNextStatement(begin));
			} else {
				result.add(new IfNotGotoStatement(module.sourceLocation(doLoop.WHILE()), new LogicalStatements.NotStatement(
						condition.getStatement().getSourceLocation(), condition.getStatement())).setNextStatement(begin));
			}
		}

		for (GotoStatement exit : doWhileExits) {
			exit.setNextStatement(result.size());
		}

	}

	private void compileExitStmt(ExitStmtContext exit, List<GotoStatement> forExits, List<GotoStatement> doWhileExits) {
		if (exit.EXIT_SUB() != null) {
			if (method.methodType != MethodType.Sub) {
				module.addCompileException(exit.EXIT_SUB(), CompileException.SYNTAX_ERROR, exit.EXIT_SUB(), " not allowed");
			} else {
				result.add(new ExitMethodStatement(module.sourceLocation(exit)));
			}
		} else if (exit.EXIT_FUNCTION() != null) {
			if (method.methodType != MethodType.Function) {
				module.addCompileException(exit.EXIT_FUNCTION(), CompileException.SYNTAX_ERROR, exit.EXIT_FUNCTION(),
						" not allowed");
			} else {
				result.add(new ExitMethodStatement(module.sourceLocation(exit)));
			}
		} else if (exit.EXIT_RULE() != null) {
			if (method.methodType != MethodType.Rule) {
				module.addCompileException(exit.EXIT_RULE(), CompileException.SYNTAX_ERROR, exit.EXIT_RULE(),
						" not allowed");
			} else {
				result.add(new ExitMethodStatement(module.sourceLocation(exit)));
			}
		} else if (exit.EXIT_PROPERTY() != null) {
			if (method.methodType == MethodType.PropertyGet || method.methodType == MethodType.PropertyLet
					|| method.methodType == MethodType.PropertySet) {
				result.add(new ExitMethodStatement(module.sourceLocation(exit)));
			} else {
				module.addCompileException(exit.EXIT_PROPERTY(), CompileException.SYNTAX_ERROR, exit.EXIT_PROPERTY(),
						" not allowed");
			}
		} else if (exit.EXIT_FOR() != null) {
			if (forExits == null) {
				module.addCompileException(exit.EXIT_FUNCTION(), CompileException.SYNTAX_ERROR, exit.EXIT_FOR(),
						" not in for loop");
			} else {
				GotoStatement exitFor = new GotoStatement(module.sourceLocation(exit));
				forExits.add(exitFor);
				result.add(exitFor);
			}
		} else if (exit.EXIT_DO() != null) {
			if (doWhileExits == null) {
				module.addCompileException(exit.EXIT_DO(), CompileException.SYNTAX_ERROR, exit.EXIT_DO(), " not in for loop");
			} else {
				doWhileExits.add(new GotoStatement(module.sourceLocation(exit)));
			}
		}
	}

	private void compileForNext(ForNextStmtContext forNext, List<GotoStatement> forExitsPrev, List<GotoStatement> doWhileExits)
			throws CompileException {
		/*
		 * msdn： counter 必要参数。用做循环计数器的数值变量。这个变量不能是布尔或数组元素。 
		 * 但是实际上在vb里用数组元素也可以正确运行。
		 * 虽然如此，还是只当简单变量来做比较方便，实际上也很少用数组元素当 counter。
		 * 
		 * 	forNextStmt : 
				FOR WS ambiguousIdentifier typeHint? (WS asTypeClause)? WS? EQ WS? valueStmt WS TO WS valueStmt (WS STEP WS valueStmt)? endOfStatement 
				block?
				NEXT (WS ambiguousIdentifier)?
			; 
		 */
		ValueStatementDesc initValue = compiler.compileValueStatement(forNext.valueStmt(0), method);
		ValueStatementDesc endValue = compiler.compileValueStatement(forNext.valueStmt(1), method);
		ValueStatementDesc step = null;
		if (forNext.valueStmt().size() == 3) {
			step = compiler.compileValueStatement(forNext.valueStmt(2), method);
			compiler.mustBeNumberType(step.getVarType());
		} else {
			VbValue v = new VbValue(VbVarType.VbInteger, 1);
			step = new ValueStatementDesc().setStatement(new LiteralStatement(v)).setVarType(VbVarType.VbInteger);
		}

		VarDecl var;
		AmbiguousIdentifierContext iterName = forNext.ambiguousIdentifier(0);
		var = (VarDecl) compiler.findDeclInScope(iterName, method, false);
		compiler.mustBeNumberType(var.varType);
		ForNextStatement forStatement = new ForNextStatement(var, initValue.getStatement(), step.getStatement(),
				endValue.getStatement());

		// LetStatment init = new LetStatment();
		// init.valueStatement = initValue;
		// init.assignee = new VariableStatement(var);
		// result.add(init);

		result.add(forStatement.initStatement(initValue.getStatement().getSourceLocation()));

		int beginLine = result.size();
		List<GotoStatement> forExits = new ArrayList<>();
		if (forNext.block() != null) {
			for (BlockStmtContext st : forNext.block().blockStmt()) {
				ParserRuleContext c = (ParserRuleContext) st.getChild(0);
				compileStmt(c, forExits, null);
			}
		}
		result.add(forStatement.nextStatement(module.sourceLocation(forNext.NEXT()), beginLine));
		for (GotoStatement exit : forExits) {
			exit.setNextStatement(result.size());
		}
	}

	private void compileForEach(ForEachStmtContext forEach, List<GotoStatement> forExitsPrev, List<GotoStatement> doWhileExits)
			throws CompileException {
		/*
			forEachStmt : 
				FOR WS EACH WS ambiguousIdentifier typeHint? WS IN WS valueStmt endOfStatement
				block?
				NEXT (WS ambiguousIdentifier)?
			;
		*/

		VarDecl var;
		AmbiguousIdentifierContext iterName = forEach.ambiguousIdentifier(0);
		var = (VarDecl) compiler.findDeclInScope(iterName, method, false);

		ValueStatementDesc collection = compiler.compileValueStatement(forEach.valueStmt(), method);
		compiler.mustBeArrayOrCollection(collection);
		ForEachStatement forStatement = new ForEachStatement(module.sourceLocation(forEach), var, collection.getStatement());

		result.add(forStatement.initStatement(module.sourceLocation(forEach.FOR())));

		int beginLine = result.size();
		result.add(forStatement.advanceNext(module.sourceLocation(forEach.IN())));

		List<GotoStatement> forExits = new ArrayList<>();
		if (forEach.block() != null) {
			for (BlockStmtContext st : forEach.block().blockStmt()) {
				ParserRuleContext c = (ParserRuleContext) st.getChild(0);
				compileStmt(c, forExits, null);
			}
		}
		SourceLocation sl = module.sourceLocation(forEach.NEXT());
		result.add(new IfNotGotoStatement(sl, forStatement.hasNext(sl)).setNextStatement(result.size() + 2));
		result.add(new GotoStatement(sl, beginLine));
		for (GotoStatement exit : forExits) {
			exit.setNextStatement(result.size());
		}
	}

	private void compileSelectCase(SelectCaseStmtContext ast, List<GotoStatement> forExits, List<GotoStatement> doWhileExits)
			throws CompileException {
		/*
		 * selectCaseStmt : 
				SELECT WS CASE WS valueStmt endOfStatement 
				sC_Case*
				END_SELECT
			;
			
			sC_Case : 
				CASE WS sC_Cond endOfStatement
				block?
			;
			
			// ELSE first, so that it is not interpreted as a variable call
			sC_Cond :
			    ELSE                                                            # caseCondElse
			    | sC_Selection (WS? ',' WS? sC_Selection)*                      # caseCondSelection
			;
			
			sC_Selection :
			    IS WS? comparisonOperator WS? valueStmt                       # caseCondIs
			    | valueStmt WS TO WS valueStmt                                # caseCondTo
			    | valueStmt                                                   # caseCondValue
			;
		 */
		List<GotoStatement> lsGotoEnd = new ArrayList<>();

		ValueStatementDesc vsd = compiler.compileValueStatement(ast.valueStmt(), method);
		compiler.mustBeNumberOrStringType(vsd.getVarType());
		Statement vs = vsd.getStatement();
		SelectCaseStatement selectCaseStatement = new SelectCaseStatement(module.sourceLocation(ast), vs);
		result.add(selectCaseStatement);

		int index = 0;
		for (SC_CaseContext kase : ast.sC_Case()) {
			Switcher switcher = new Switcher();
			List<SelectCaseConditionStatement> conds = new ArrayList<>();

			SC_CondContext cond = kase.sC_Cond();
			if (cond instanceof CaseCondSelectionContext) {
				for (SC_SelectionContext selection : ((CaseCondSelectionContext) cond).sC_Selection()) {
					if (selection instanceof CaseCondValueContext) {
						CaseCondValueContext v = (CaseCondValueContext) selection;
						vsd = compiler.compileValueStatement(v.valueStmt(), method);
						compiler.mustBeNumberOrStringType(vsd.getVarType());
						conds.add(new SelectCaseStatement.SingleValueCondition(vsd.getStatement()));
					} else if (selection instanceof CaseCondIsContext) {
						CaseCondIsContext s = (CaseCondIsContext) selection;
						vsd = compiler.compileValueStatement(s.valueStmt(), method);
						compiler.mustBeNumberOrStringType(vsd.getVarType());
						conds.add(new ComparisonCondition(vsd.getStatement(), s.comparisonOperator().getText()));
					} else if (selection instanceof CaseCondToContext) {
						CaseCondToContext c = (CaseCondToContext) selection;
						vsd = compiler.compileValueStatement(c.valueStmt(0), method);
						compiler.mustBeNumberType(vsd.getVarType());
						Statement from = vsd.getStatement();
						vsd = compiler.compileValueStatement(c.valueStmt(1), method);
						compiler.mustBeNumberType(vsd.getVarType());
						Statement to = vsd.getStatement();
						conds.add(new SelectCaseStatement.BetweenCondition(from, to));
					}
				}
				switcher.conditionStatements = (SelectCaseConditionStatement[]) conds
						.toArray(new SelectCaseConditionStatement[conds.size()]);
				switcher.nextStatementIndex = result.size();
				selectCaseStatement.switchers.add(switcher);
			} else { // caseCondElse
				selectCaseStatement.defaultStatementIndex = result.size();
			}

			for (BlockStmtContext st : kase.block().blockStmt()) {
				ParserRuleContext c = (ParserRuleContext) st.getChild(0);
				compileStmt(c, forExits, doWhileExits);
			}

			index++;
			if (index != ast.sC_Case().size()) {
				GotoStatement gotoEnd = new GotoStatement(module.sourceLocation(ast.END_SELECT()), -2);
				result.add(gotoEnd); // GOTO END
				lsGotoEnd.add(gotoEnd);
			}
		}

		for (GotoStatement g : lsGotoEnd) {
			g.setNextStatement(result.size());
		}
		if (selectCaseStatement.defaultStatementIndex == 0)
			selectCaseStatement.defaultStatementIndex = result.size();
	}

	private void compileIfThenElse(IfConditionStmtContext ifBlockCondition, List<BlockStmtContext> ifStatements,
			List<IfElseIfBlockStmtContext> elseIfStmts, List<BlockStmtContext> elseStatements, List<GotoStatement> forExits,
			List<GotoStatement> doWhileExits) throws CompileException {

		ValueStatementDesc vsd = compiler.compileValueStatement(ifBlockCondition.valueStmt(), method);
		shouldBeCondition(vsd.getVarType());
		Statement condition = vsd.getStatement();
		List<GotoStatement> gotos = new ArrayList<>();
		IfNotGotoStatement ifNotGoto = new IfNotGotoStatement(module.sourceLocation(ifBlockCondition), condition);
		result.add(ifNotGoto);

		// if branch
		for (BlockStmtContext st : ifStatements) {
			ParserRuleContext c = (ParserRuleContext) st.getChild(0);
			compileStmt(c, forExits, doWhileExits);
		}
		if (elseIfStmts != null && elseIfStmts.isEmpty() == false || elseStatements != null) {
			GotoStatement toEndIf = new GotoStatement(module.sourceLocation(ifBlockCondition), -2);
			gotos.add(toEndIf);
			result.add(toEndIf);
		}

		// elseif branch
		if (elseIfStmts != null) {
			int i = 0;
			for (IfElseIfBlockStmtContext elseIf : elseIfStmts) {
				ifNotGoto.setNextStatement(result.size());

				vsd = compiler.compileValueStatement(elseIf.ifConditionStmt().valueStmt(), method);
				shouldBeCondition(vsd.getVarType());
				condition = vsd.getStatement();
				ifNotGoto = new IfNotGotoStatement(module.sourceLocation(elseIf.ELSEIF()), condition);
				result.add(ifNotGoto);
				gotos.add(ifNotGoto);

				for (BlockStmtContext st : elseIf.block().blockStmt()) {
					ParserRuleContext c = (ParserRuleContext) st.getChild(0);
					compileStmt(c, forExits, doWhileExits);
				}

				i++;
				if (i < elseIfStmts.size() || elseStatements != null) {
					GotoStatement toEndIf = new GotoStatement(module.sourceLocation(elseIf.ELSEIF()), -2);
					gotos.add(toEndIf);
					result.add(toEndIf);
				}
			}
		}

		// else branch
		if (!isStatementsEmpty(elseStatements)) {
			ifNotGoto.setNextStatement(result.size());

			for (BlockStmtContext st : elseStatements) {
				ParserRuleContext c = (ParserRuleContext) st.getChild(0);
				compileStmt(c, forExits, doWhileExits);
			}

		} else {
			ifNotGoto.setNextStatement(result.size());
		}

		for (GotoStatement gotoStmt : gotos) {
			if (gotoStmt.getNextStatement() == -2) {
				gotoStmt.setNextStatement(result.size());
			}
		}
	}

	private boolean isStatementsEmpty(List<BlockStmtContext> statements) {
		return statements == null || statements.isEmpty() || (statements.size() == 1 && statements.get(0) == null);
	}

}
