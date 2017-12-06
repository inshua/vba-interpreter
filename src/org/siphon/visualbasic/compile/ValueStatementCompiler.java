package org.siphon.visualbasic.compile;

import static org.siphon.visualbasic.compile.Compiler.getArgumentDeclsOfMethodOrProperty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.siphon.visualbasic.ClassModuleDecl;
import org.siphon.visualbasic.ClassTypeDecl;
import org.siphon.visualbasic.ConstDecl;
import org.siphon.visualbasic.MethodDecl;
import org.siphon.visualbasic.ModuleDecl;
import org.siphon.visualbasic.ModuleMemberDecl;
import org.siphon.visualbasic.PropertyDecl;
import org.siphon.visualbasic.SourceLocation;
import org.siphon.visualbasic.VarDecl;
import org.siphon.visualbasic.VbDecl;
import org.siphon.visualbasic.runtime.ArgumentDecl;
import org.siphon.visualbasic.runtime.LogicalExpr;
import org.siphon.visualbasic.runtime.Statement;
import org.siphon.visualbasic.runtime.VbValue;
import org.siphon.visualbasic.runtime.VbVarType;
import org.siphon.visualbasic.runtime.statements.CalcStatements;
import org.siphon.visualbasic.runtime.statements.CompareStatements;
import org.siphon.visualbasic.runtime.statements.EvalAssignableStatement;
import org.siphon.visualbasic.runtime.statements.IsStatement;
import org.siphon.visualbasic.runtime.statements.EvalAssignableStatement.MemberAtLocation;
import org.siphon.visualbasic.runtime.statements.LiteralStatement;
import org.siphon.visualbasic.runtime.statements.LogicalStatements;
import org.siphon.visualbasic.runtime.statements.NewStatement;
import org.siphon.visualbasic.runtime.statements.TypeOfIsStatement;

import vba.VbaParser.ArgsCallContext;
import vba.VbaParser.DictionaryCallContext;
import vba.VbaParser.ICS_followElementContext;
import vba.VbaParser.ImplicitCallStmt_InStmtContext;
import vba.VbaParser.LiteralContext;
import vba.VbaParser.MemberCallContext;
import vba.VbaParser.SubscriptsContext;
import vba.VbaParser.TypeOfIsStmtContext;
import vba.VbaParser.ValueStmtContext;
import vba.VbaParser.VsAddContext;
import vba.VbaParser.VsAmpContext;
import vba.VbaParser.VsAndContext;
import vba.VbaParser.VsDivContext;
import vba.VbaParser.VsEqContext;
import vba.VbaParser.VsEqvContext;
import vba.VbaParser.VsGeqContext;
import vba.VbaParser.VsGtContext;
import vba.VbaParser.VsICSContext;
import vba.VbaParser.VsImpContext;
import vba.VbaParser.VsIsContext;
import vba.VbaParser.VsLeqContext;
import vba.VbaParser.VsLikeContext;
import vba.VbaParser.VsLiteralContext;
import vba.VbaParser.VsLtContext;
import vba.VbaParser.VsMinusContext;
import vba.VbaParser.VsModContext;
import vba.VbaParser.VsMultContext;
import vba.VbaParser.VsNegationContext;
import vba.VbaParser.VsNeqContext;
import vba.VbaParser.VsNewContext;
import vba.VbaParser.VsNotContext;
import vba.VbaParser.VsOrContext;
import vba.VbaParser.VsPlusContext;
import vba.VbaParser.VsPowContext;
import vba.VbaParser.VsStructContext;
import vba.VbaParser.VsTypeOfContext;
import vba.VbaParser.VsXorContext;

public class ValueStatementCompiler {

	private final Compiler compiler;

	public ValueStatementCompiler(Compiler compiler) {
		this.compiler = compiler;
	}

	/*
	 * valueStmt : 
	literal 												# vsLiteral		*
	| implicitCallStmt_InStmt 								# vsICS			*
	| LPAREN WS? valueStmt (WS? ',' WS? valueStmt)* RPAREN 	# vsStruct		* 	//  t = (a, b, c) ??? 不理解这种东西是什么 
	| NEW WS? (baseType | complexType) 						# vsNew			*
	| typeOfStmt 											# vsTypeOf		*
	| midStmt 												# vsMid			*
	| ADDRESSOF WS? valueStmt 								# vsAddressOf
	
	| valueStmt WS? IS WS? valueStmt 						# vsIs			*
	| valueStmt WS? LIKE WS? valueStmt 						# vsLike		*
	| valueStmt WS? GEQ WS? valueStmt 						# vsGeq			*
	| valueStmt WS? LEQ WS? valueStmt 						# vsLeq			*
	| valueStmt WS? GT WS? valueStmt 						# vsGt			*
	| valueStmt WS? LT WS? valueStmt 						# vsLt			*
	| valueStmt WS? NEQ WS? valueStmt 						# vsNeq			*
	| valueStmt WS? EQ WS? valueStmt 						# vsEq			*
	
	| valueStmt WS? AMPERSAND WS? valueStmt 				# vsAmp			*
	| MINUS WS? valueStmt 									# vsNegation	*
	| PLUS WS? valueStmt 									# vsPlus		*
	| valueStmt WS? PLUS WS? valueStmt 						# vsAdd			*
	| valueStmt WS? MOD WS? valueStmt 						# vsMod			*
	| valueStmt WS? DIV WS? valueStmt 						# vsDiv			*
	| valueStmt WS? MULT WS? valueStmt 						# vsMult		*
	| valueStmt WS? MINUS WS? valueStmt 					# vsMinus		*
	| valueStmt WS? POW WS? valueStmt 						# vsPow			*
	
	| valueStmt WS? IMP WS? valueStmt 						# vsImp			*
	| valueStmt WS? EQV WS? valueStmt 						# vsEqv			*
	| valueStmt WS? XOR WS? valueStmt 						# vsXor			*
	| valueStmt WS? OR WS? valueStmt 						# vsOr			*
	| valueStmt WS? AND WS? valueStmt 						# vsAnd			*
	| NOT WS? valueStmt 									# vsNot			*
	 */
	ValueStatementDesc compileValueStatement(ValueStmtContext valueStmt, MethodDecl method) throws CompileException {
		ValueStatementDesc result = new ValueStatementDesc();
		if (valueStmt instanceof VsICSContext) {
			return compileImplicitCallStmt(((VsICSContext) valueStmt).implicitCallStmt_InStmt(), method, false);

		} else if (valueStmt instanceof VsLiteralContext) {
			LiteralContext literal = ((VsLiteralContext) valueStmt).literal();
			VbValue value = compiler.parseLiteral(literal, method.module);
			result.setVarType(value.varType).setStatement(new LiteralStatement(value)).setAst(literal);

		} else if (valueStmt instanceof VsStructContext) {
			VsStructContext struct = (VsStructContext) valueStmt; // TODO 不理解 struct 的确切含义
			return compileValueStatement(struct.valueStmt(0), method);

		} else if (valueStmt instanceof VsAmpContext) {
			VsAmpContext op = ((VsAmpContext) valueStmt);
			Statement v1 = compileValueStatement(op.valueStmt(0), method).getStatement();
			Statement v2 = compileValueStatement(op.valueStmt(1), method).getStatement();
			Statement stmt = new CalcStatements.ConcatStatement(method.module.sourceLocation(valueStmt), v1, v2);
			result.setVarType(VbVarType.VbString).setStatement(stmt).setAst(valueStmt);

		} else if (valueStmt instanceof VsNewContext) {
			VsNewContext vsNew = (VsNewContext) valueStmt;
			return compileNewStatement(method, vsNew);

		} else if (valueStmt instanceof VsAddContext) {
			VsAddContext op = ((VsAddContext) valueStmt);
			ValueStatementDesc v1 = compileValueStatement(op.valueStmt(0), method);
			ValueStatementDesc v2 = compileValueStatement(op.valueStmt(1), method);
			VbVarType varType = CalcStatements.findOpResultType(v1.getVarType(), v2.getVarType(), '+');
			Statement stmt = new CalcStatements.AddStatement(method.module.sourceLocation(valueStmt), v1.getStatement(),
					v2.getStatement());
			result.setStatement(stmt).setVarType(varType).setAst(valueStmt);
			

		} else if (valueStmt instanceof VsMultContext) {
			VsMultContext op = ((VsMultContext) valueStmt);
			ValueStatementDesc v1 = compileValueStatement(op.valueStmt(0), method);
			ValueStatementDesc v2 = compileValueStatement(op.valueStmt(1), method);
			VbVarType varType = CalcStatements.findOpResultType(v1.getVarType(), v2.getVarType(), '*');
			Statement stmt = new CalcStatements.MultiStatement(method.module.sourceLocation(valueStmt), v1.getStatement(),
					v2.getStatement());
			result.setStatement(stmt).setVarType(varType).setAst(valueStmt);

		} else if (valueStmt instanceof VsMinusContext) {
			VsMinusContext op = ((VsMinusContext) valueStmt);
			ValueStatementDesc v1 = compileValueStatement(op.valueStmt(0), method);
			ValueStatementDesc v2 = compileValueStatement(op.valueStmt(1), method);
			VbVarType varType = CalcStatements.findOpResultType(v1.getVarType(), v2.getVarType(), '-');
			Statement stmt = new CalcStatements.SubtractStatement(method.module.sourceLocation(valueStmt), v1.getStatement(),
					v2.getStatement());
			result.setStatement(stmt).setVarType(varType).setAst(valueStmt);

		} else if (valueStmt instanceof VsDivContext) {
			VsDivContext op = ((VsDivContext) valueStmt);
			ValueStatementDesc v1 = compileValueStatement(op.valueStmt(0), method);
			ValueStatementDesc v2 = compileValueStatement(op.valueStmt(1), method);
			char operator = op.DIV().getText().charAt(0);
			VbVarType varType = CalcStatements.findOpResultType(v1.getVarType(), v2.getVarType(), operator);
			Statement stmt = null;
			if(operator == '/'){
				stmt = new CalcStatements.DivStatement(method.module.sourceLocation(valueStmt), v1.getStatement(),
					v2.getStatement());
			} else {
				assert operator == '\\';
				stmt = new CalcStatements.IDivStatement(method.module.sourceLocation(valueStmt), v1.getStatement(),
						v2.getStatement());
			}
			result.setStatement(stmt).setVarType(varType).setAst(valueStmt);
			
		} else if (valueStmt instanceof VsPowContext) {
			VsPowContext op = ((VsPowContext) valueStmt);
			ValueStatementDesc v1 = compileValueStatement(op.valueStmt(0), method);
			ValueStatementDesc v2 = compileValueStatement(op.valueStmt(1), method);
			VbVarType varType = CalcStatements.findOpResultType(v1.getVarType(), v2.getVarType(), '^');
			Statement stmt = new CalcStatements.PowerStatement(method.module.sourceLocation(valueStmt), v1.getStatement(),
					v2.getStatement());
			result.setStatement(stmt).setVarType(varType).setAst(valueStmt);
			
		} else if (valueStmt instanceof VsModContext) {
			VsModContext op = ((VsModContext) valueStmt);
			ValueStatementDesc v1 = compileValueStatement(op.valueStmt(0), method);
			ValueStatementDesc v2 = compileValueStatement(op.valueStmt(1), method);
			VbVarType varType = CalcStatements.findOpResultType(v1.getVarType(), v2.getVarType(), '%');
			Statement stmt = new CalcStatements.ModStatement(method.module.sourceLocation(valueStmt), v1.getStatement(),
					v2.getStatement());
			result.setStatement(stmt).setVarType(varType).setAst(valueStmt);
			
		} else if (valueStmt instanceof VsPlusContext) {
			VsPlusContext op = ((VsPlusContext) valueStmt);
			ValueStatementDesc v = compileValueStatement(op.valueStmt(), method);
			VbVarType varType = CalcStatements.findPosNegResultType('+', v.getVarType());
			Statement stmt = new CalcStatements.PosStatement(method.module.sourceLocation(valueStmt), v.getStatement());
			result.setStatement(stmt).setVarType(varType).setAst(valueStmt);
			
		} else if (valueStmt instanceof VsNegationContext) {
			VsNegationContext op = ((VsNegationContext) valueStmt);
			ValueStatementDesc v = compileValueStatement(op.valueStmt(), method);
			VbVarType varType = CalcStatements.findPosNegResultType('-', v.getVarType());
			Statement stmt = new CalcStatements.NegStatement(method.module.sourceLocation(valueStmt), v.getStatement());
			result.setStatement(stmt).setVarType(varType).setAst(valueStmt);
			
		} else if (valueStmt instanceof VsNotContext) {
			VsNotContext op = ((VsNotContext) valueStmt);
			ValueStatementDesc v = compileValueStatement(op.valueStmt(), method);
			VbVarType varType = LogicalExpr.findNotResultType('-', v.getVarType());
			Statement stmt = new LogicalStatements.NotStatement(method.module.sourceLocation(valueStmt), v.getStatement());
			result.setStatement(stmt).setVarType(varType).setAst(valueStmt);
			
		} else if (valueStmt instanceof VsAndContext) {
			VsAndContext op = ((VsAndContext) valueStmt);
			ValueStatementDesc v1 = compileValueStatement(op.valueStmt(0), method);
			ValueStatementDesc v2 = compileValueStatement(op.valueStmt(1), method);
			VbVarType varType = LogicalExpr.findOpResultType(v1.getVarType(), v2.getVarType(), '&');
			Statement stmt = new LogicalStatements.AndStatement(method.module.sourceLocation(valueStmt), v1.getStatement(),
					v2.getStatement());
			result.setStatement(stmt).setVarType(varType).setAst(valueStmt);
			
		} else if (valueStmt instanceof VsAndContext) {
			VsAndContext op = ((VsAndContext) valueStmt);
			ValueStatementDesc v1 = compileValueStatement(op.valueStmt(0), method);
			ValueStatementDesc v2 = compileValueStatement(op.valueStmt(1), method);
			VbVarType varType = LogicalExpr.findOpResultType(v1.getVarType(), v2.getVarType(), '&');
			Statement stmt = new LogicalStatements.AndStatement(method.module.sourceLocation(valueStmt), v1.getStatement(),
					v2.getStatement());
			result.setStatement(stmt).setVarType(varType).setAst(valueStmt);
		
		} else if (valueStmt instanceof VsOrContext) {
			VsOrContext op = ((VsOrContext) valueStmt);
			ValueStatementDesc v1 = compileValueStatement(op.valueStmt(0), method);
			ValueStatementDesc v2 = compileValueStatement(op.valueStmt(1), method);
			VbVarType varType = LogicalExpr.findOpResultType(v1.getVarType(), v2.getVarType(), '|');
			Statement stmt = new LogicalStatements.OrStatement(method.module.sourceLocation(valueStmt), v1.getStatement(),
					v2.getStatement());
			result.setStatement(stmt).setVarType(varType).setAst(valueStmt);
			
		} else if (valueStmt instanceof VsXorContext) {
			VsXorContext op = ((VsXorContext) valueStmt);
			ValueStatementDesc v1 = compileValueStatement(op.valueStmt(0), method);
			ValueStatementDesc v2 = compileValueStatement(op.valueStmt(1), method);
			VbVarType varType = LogicalExpr.findOpResultType(v1.getVarType(), v2.getVarType(), '^');
			Statement stmt = new LogicalStatements.XorStatement(method.module.sourceLocation(valueStmt), v1.getStatement(),
					v2.getStatement());
			result.setStatement(stmt).setVarType(varType).setAst(valueStmt);
			
		} else if (valueStmt instanceof VsImpContext) {
			VsImpContext op = ((VsImpContext) valueStmt);
			ValueStatementDesc v1 = compileValueStatement(op.valueStmt(0), method);
			ValueStatementDesc v2 = compileValueStatement(op.valueStmt(1), method);
			VbVarType varType = LogicalExpr.findOpResultType(v1.getVarType(), v2.getVarType(), 'i');
			Statement stmt = new LogicalStatements.ImpStatement(method.module.sourceLocation(valueStmt), v1.getStatement(),
					v2.getStatement());
			result.setStatement(stmt).setVarType(varType).setAst(valueStmt);
			
		} else if (valueStmt instanceof VsEqvContext) {
			VsEqvContext op = ((VsEqvContext) valueStmt);
			ValueStatementDesc v1 = compileValueStatement(op.valueStmt(0), method);
			ValueStatementDesc v2 = compileValueStatement(op.valueStmt(1), method);
			VbVarType varType = LogicalExpr.findOpResultType(v1.getVarType(), v2.getVarType(), 'e');
			Statement stmt = new LogicalStatements.EqvStatement(method.module.sourceLocation(valueStmt), v1.getStatement(),
					v2.getStatement());
			result.setStatement(stmt).setVarType(varType).setAst(valueStmt);
			
		} else if (valueStmt instanceof VsLikeContext) {
			VsLikeContext op = ((VsLikeContext) valueStmt);
			ValueStatementDesc v1 = compileValueStatement(op.valueStmt(0), method);
			ValueStatementDesc v2 = compileValueStatement(op.valueStmt(1), method);
			CompareStatements.checkAllowCompare(v1.getVarType(), v2.getVarType());
			Statement stmt = new CompareStatements.LikeStatement(method.module.sourceLocation(valueStmt), v1.getStatement(),
					v2.getStatement());
			result.setStatement(stmt).setVarType(VbVarType.VbBoolean).setAst(valueStmt);

		} else if (valueStmt instanceof VsGeqContext) {
			VsGeqContext op = ((VsGeqContext) valueStmt);
			ValueStatementDesc v1 = compileValueStatement(op.valueStmt(0), method);
			ValueStatementDesc v2 = compileValueStatement(op.valueStmt(1), method);
			CompareStatements.checkAllowCompare(v1.getVarType(), v2.getVarType());
			Statement stmt = new CompareStatements.GeqStatement(method.module.sourceLocation(valueStmt), v1.getStatement(),
					v2.getStatement());
			result.setStatement(stmt).setVarType(VbVarType.VbBoolean).setAst(valueStmt);

		} else if (valueStmt instanceof VsEqContext) {
			VsEqContext op = ((VsEqContext) valueStmt);
			ValueStatementDesc v1 = compileValueStatement(op.valueStmt(0), method);
			ValueStatementDesc v2 = compileValueStatement(op.valueStmt(1), method);
			CompareStatements.checkAllowCompare(v1.getVarType(), v2.getVarType());
			Statement stmt = new CompareStatements.EqStatement(method.module.sourceLocation(valueStmt), v1.getStatement(),
					v2.getStatement());
			result.setStatement(stmt).setVarType(VbVarType.VbBoolean).setAst(valueStmt);

		} else if (valueStmt instanceof VsLeqContext) {
			VsLeqContext op = ((VsLeqContext) valueStmt);
			ValueStatementDesc v1 = compileValueStatement(op.valueStmt(0), method);
			ValueStatementDesc v2 = compileValueStatement(op.valueStmt(1), method);
			CompareStatements.checkAllowCompare(v1.getVarType(), v2.getVarType());
			Statement stmt = new CompareStatements.LeqStatement(method.module.sourceLocation(valueStmt), v1.getStatement(),
					v2.getStatement());
			result.setStatement(stmt).setVarType(VbVarType.VbBoolean).setAst(valueStmt);

		} else if (valueStmt instanceof VsGtContext) {
			VsGtContext op = ((VsGtContext) valueStmt);
			ValueStatementDesc v1 = compileValueStatement(op.valueStmt(0), method);
			ValueStatementDesc v2 = compileValueStatement(op.valueStmt(1), method);
			CompareStatements.checkAllowCompare(v1.getVarType(), v2.getVarType());
			Statement stmt = new CompareStatements.GtStatement(method.module.sourceLocation(valueStmt), v1.getStatement(),
					v2.getStatement());
			result.setStatement(stmt).setVarType(VbVarType.VbBoolean).setAst(valueStmt);

		} else if (valueStmt instanceof VsLtContext) {
			VsLtContext op = ((VsLtContext) valueStmt);
			ValueStatementDesc v1 = compileValueStatement(op.valueStmt(0), method);
			ValueStatementDesc v2 = compileValueStatement(op.valueStmt(1), method);
			CompareStatements.checkAllowCompare(v1.getVarType(), v2.getVarType());
			Statement stmt = new CompareStatements.LtStatement(method.module.sourceLocation(valueStmt), v1.getStatement(),
					v2.getStatement());
			result.setStatement(stmt).setVarType(VbVarType.VbBoolean).setAst(valueStmt);

		} else if (valueStmt instanceof VsNeqContext) {
			VsNeqContext op = ((VsNeqContext) valueStmt);
			ValueStatementDesc v1 = compileValueStatement(op.valueStmt(0), method);
			ValueStatementDesc v2 = compileValueStatement(op.valueStmt(1), method);
			CompareStatements.checkAllowCompare(v1.getVarType(), v2.getVarType());
			Statement stmt = new CompareStatements.NeqStatement(method.module.sourceLocation(valueStmt), v1.getStatement(),
					v2.getStatement());
			result.setStatement(stmt).setVarType(VbVarType.VbBoolean).setAst(valueStmt);
			
		} else if(valueStmt instanceof VsTypeOfContext){
			TypeOfIsStmtContext op = ((VsTypeOfContext) valueStmt).typeOfIsStmt();
			ValueStatementDesc v1 = compileValueStatement(op.valueStmt(), method);
			ClassTypeDecl patternType = compiler.findClassTypeDecl(op.type().getText().toUpperCase(), op.type(), method.module);
			VbVarType varType = v1.getVarType();
			compiler.mustBeOject(varType, op.valueStmt());
			if(varType.vbType == VbVarType.vbVariant || (varType.vbType == VbVarType.vbObject && varType.typeDecl == null)){
				result.setStatement(new TypeOfIsStatement(v1.getStatement(), patternType, method.module.sourceLocation(valueStmt)));
			} else {
				ClassModuleDecl clsLeft = varType.getClassModuleDecl();
				ClassModuleDecl clsRight = varType.getClassModuleDecl();
				boolean match = (clsLeft == clsRight || clsLeft.isImplementFrom(clsRight));
				result.setStatement(new LiteralStatement(VbValue.fromJava(match)));
			}
			
		} else if (valueStmt instanceof VsIsContext) {
			VsIsContext op = ((VsIsContext) valueStmt);
			ValueStatementDesc v1 = compileValueStatement(op.valueStmt(0), method);
			ValueStatementDesc v2 = compileValueStatement(op.valueStmt(1), method);
			compiler.mustBeOject(v1.getVarType(), op.valueStmt(0));
			compiler.mustBeOject(v2.getVarType(), op.valueStmt(1));
			Statement stmt = new IsStatement(method.module.sourceLocation(valueStmt), v1.getStatement(), v2.getStatement());
			result.setStatement(stmt).setVarType(VbVarType.VbBoolean).setAst(valueStmt);	
			
		} else {
			throw new ImpossibleException();
		}
		return result;
	}

	private ValueStatementDesc compileNewStatement(MethodDecl method, VsNewContext vsNew) throws CompileException {
		/*
		 * NEW WS? complexType 						# vsNew
		 */
		String name = null;
		name = vsNew.complexType().getText().toUpperCase();
		ClassTypeDecl typeDecl = compiler.findClassTypeDecl(name, vsNew, method.module);

		ValueStatementDesc result = new ValueStatementDesc();
		result.setStatement(new NewStatement(method.module.sourceLocation(vsNew), typeDecl)).setAst(vsNew);
		return result;
	}

	/**
	 * 
	 * @param implicitCallStmt
	 * @param method
	 * @param asAssignee
	 *            是否作为赋值的左值。对于左值应生成 LocateVarStatement 不应生成 GetStatement。
	 * @return
	 * @throws CompileException
	 */
	ValueStatementDesc compileImplicitCallStmt(ImplicitCallStmt_InStmtContext implicitCallStmt, MethodDecl method,
			boolean asAssignee) throws CompileException {
		return this.compileImplicitCallStmt(implicitCallStmt, method, asAssignee, true);
	}

	ValueStatementDesc compileImplicitCallStmt(ImplicitCallStmt_InStmtContext implicitCallStmt, MethodDecl method,
			boolean asAssignee, boolean apply) throws CompileException {

		ValueStatementDesc result = null;
		/*
		 *  implicitCallStmt_InStmt : iCS_startSymbol iCS_followElement*;
			iCS_startSymbol :
				  ambiguousIdentifier typeHint?
				| memberCall		// in with block
				| dictionaryCall	// in with block
			;
			
			iCS_followElement: memberCall | dictionaryCall | LPAREN argsCall? RPAREN;
			
			memberCall : '.' ambiguousIdentifier;
			
			dictionaryCall : '!' ambiguousIdentifier;
		 */
		
		boolean inWithStatement = false;
		ParserRuleContext first = (ParserRuleContext) implicitCallStmt.iCS_startElement().getChild(0);
		List<ICS_followElementContext> followers = implicitCallStmt.iCS_followElement();
		ParserRuleContext second = null;
		if(followers.size() > 0){
			second = implicitCallStmt.iCS_followElement(0);
		}
		
		if (first instanceof MemberCallContext || first instanceof DictionaryCallContext) {
			inWithStatement = true;
		}
		String firstId = !inWithStatement ? first.getText().toUpperCase() : "";
		VbDecl base = null;
		SourceLocation baseLoacation = null;

		List<ParserRuleContext> thrumb = new ArrayList<>();
		int depth = 0;
		
		if (inWithStatement) {
			base = compiler.withObjDecl;
			baseLoacation = compiler.withObjDeclLocation;
			assert (first instanceof MemberCallContext) || (first instanceof DictionaryCallContext);
			thrumb.add(first);
			
		} else {
			base = compiler.findDeclInScope(first, method, false);
			if(base != null) {
				baseLoacation = method.module.sourceLocation(first);
			}
		} 
		if(base == null){ // macth pattern in names
			String path = firstId;
			Token end = first.stop;
			
			VbDecl[] decls = compiler.names.findAccessibleDecls(path, method.module.library);
			if (decls.length == 0) {
				//
			} else if (decls.length == 1) {
				base = decls[0];
			} else {
				base = VbDecl.AMBIGUOUS;
			}
			
			if(base != null){
				for (; depth < followers.size(); depth++) {
					ICS_followElementContext follower = followers.get(depth);
					ParseTree fc = follower.getChild(0);
					if(fc instanceof MemberCallContext == false) break;
					
					end = follower.stop;
					path = path + follower.getText().toUpperCase();
					
					decls = compiler.names.findAccessibleDecls(path, method.module.library);
					if (decls.length == 0) {
						break;
					} else if (decls.length == 1) {
						base = decls[0];
					} else {
						base = VbDecl.AMBIGUOUS;
					}
				}
			}
			
			if (base == null)
				throw method.module.newCompileException(implicitCallStmt, CompileException.UNKOWN_VALUE, implicitCallStmt);
			if (base == VbDecl.AMBIGUOUS)
				throw method.module.newCompileException(implicitCallStmt, CompileException.AMBIGUOUS_IDENTIFIER,
						implicitCallStmt);
			baseLoacation = method.module.sourceLocation(first.start, end);
		}
		// first is in scope, not lib or some type
		for (; depth < followers.size(); depth++) {
			ICS_followElementContext follower = followers.get(depth);
			ParseTree fc = (ParseTree) follower.getChild(0);
			if(fc instanceof MemberCallContext){
				thrumb.add(((MemberCallContext) fc));
			} else if(fc instanceof DictionaryCallContext){
				thrumb.add((DictionaryCallContext)fc);
			} else {	// argsCall
				thrumb.add(follower.argsCall());
			}
		}

		result = compileDeepMember(base, baseLoacation, method, thrumb, asAssignee, implicitCallStmt, apply);
		assert result != null;
		return result;
	}

	/*
	 *  implicitCallStmt_InStmt : iCS_startSymbol iCS_followElement*;
		iCS_startSymbol :
			  ambiguousIdentifier typeHint?
			| memberCall		// in with block
			| dictionaryCall	// in with block
		;
		
		iCS_followElement: memberCall | dictionaryCall | LPAREN argsCall? RPAREN;
		
		memberCall : '.' ambiguousIdentifier;
		
		dictionaryCall : '!' ambiguousIdentifier;
	 */
	private ValueStatementDesc compileDeepMember(VbDecl base, SourceLocation baseLocation, MethodDecl method,
			List<ParserRuleContext> thrumb, boolean asAssignee, ParserRuleContext implicitCallStmt, boolean apply)
			throws CompileException {
		
		EvalAssignableStatement result = null;

		VbVarType type = null;
		if (base instanceof ConstDecl) {
			VbValue c = ((ConstDecl) base).constValue; 
			if (thrumb.size() > 0 && !c.isObject()) {
				throw method.module.newCompileException(thrumb.get(0), CompileException.UNKNOWN_MEMBER, thrumb.get(0));
			}
			if (asAssignee && thrumb.size() == 0) {
				throw method.module.newCompileException(implicitCallStmt, CompileException.CANNOT_MODIFY_CONST, implicitCallStmt);
			}
			if (c.isObject()) { // const cannot be array or object or udt, but sometimes come from bindObject can be Object
				result = new EvalAssignableStatement(method.module.sourceLocation(implicitCallStmt), c);
				type = c.varType;
			} else {
				return new ValueStatementDesc().setStatement(new LiteralStatement(c)).setVarType(type).setAst(implicitCallStmt);
			}
		} else if (base instanceof VarDecl) {
			VarDecl vd = (VarDecl) base;
			type = vd.varType;
			if (vd.methodDecl != null && vd == vd.methodDecl.result) {
				// maybe recursive call
				if (vd.methodDecl.arguments.size() > 0 && thrumb.size() > 0
						&& nextIsArguments(vd.methodDecl.arguments, type, thrumb.get(0))) {
					base = vd.methodDecl;
				}
			}
		}

		result = new EvalAssignableStatement(baseLocation, base);

		boolean afterFunctionCalled = false;
		for (int i = 0; i < thrumb.size(); i++) {
			ParserRuleContext ast = thrumb.get(i);
			
			afterFunctionCalled = false;
			if(base instanceof MethodDecl || base instanceof PropertyDecl){
				ModuleMemberDecl m = (ModuleMemberDecl) base;
				if(ast instanceof ArgsCallContext){
					List<ValueStatementDesc> lsArgCalls = compiler.compileArgsCall((ArgsCallContext) ast, getArgumentDeclsOfMethodOrProperty(base) , method);
					compiler.checkMethodOrPropertyCall(base, lsArgCalls, method.module, ast);
					result = result.bind(method.module.sourceLocation(ast), compiler.toStatements(lsArgCalls, method.module));  // base 已经 bind 过了
					type = getReturnType(m);
					base = null;
					afterFunctionCalled = true;
				} else if(ast instanceof MemberCallContext || ast instanceof DictionaryCallContext){
					List<ValueStatementDesc> lsArgCalls = Collections.emptyList();
					compiler.checkMethodOrPropertyCall(base, lsArgCalls, method.module, ast);	
					// 0参数，不需要 bind
					type = getReturnType(m);
					base = null;
					i--; 	// wait next turn
					afterFunctionCalled = m instanceof MethodDecl || (m instanceof PropertyDecl && ((PropertyDecl)m).isReadonly());
				}
				
			} else if(type.vbType == VbVarType.vbVariant || (type == VbVarType.VbObject && type.typeDecl == null)){
				if(ast instanceof ArgsCallContext){
					List<ValueStatementDesc> lsArgCalls = compiler.compileArgsCall((ArgsCallContext) ast, getArgumentDeclsOfMethodOrProperty(base) , method);
					result = result.bind(method.module.sourceLocation(ast), compiler.toStatements(lsArgCalls, method.module));
				} else if(ast instanceof MemberCallContext){
					MemberCallContext mc = (MemberCallContext) ast;
					result = result.bind(method.module.sourceLocation(ast), new EvalAssignableStatement.Member(mc.ambiguousIdentifier().getText().toUpperCase()));
				} else if(ast instanceof DictionaryCallContext){
					DictionaryCallContext dictCall = (DictionaryCallContext) ast;
					result = result.bind(method.module.sourceLocation(ast), new EvalAssignableStatement.DictionaryCall(dictCall.ambiguousIdentifier().getText().toUpperCase()));
				}
				
			} else if(type.vbType == VbVarType.vbArray){
				if(ast instanceof ArgsCallContext){
					List<ValueStatementDesc> lsArgCalls = compiler.compileArgsCall((ArgsCallContext) ast, getArgumentDeclsOfMethodOrProperty(base) , method);
					this.checkArrayOrCollectionCall(type, lsArgCalls, method.module, ast);
					Compiler.noNamedArgs((ArgsCallContext) ast, method.module);
					result = result.bind(method.module.sourceLocation(ast), compiler.toStatements(lsArgCalls, method.module));
					type = type.arrayDef.baseType;
					base = null;
				} else if(ast instanceof MemberCallContext){
					throw method.module.newCompileException(ast, CompileException.SYNTAX_ERROR, " is an array");
				} else if(ast instanceof DictionaryCallContext){
					throw method.module.newCompileException(ast, CompileException.SYNTAX_ERROR, " is an array");
				}
				
			} else if(type.vbType == VbVarType.vbObject){
				if(ast instanceof ArgsCallContext){
					if(type.hasDefaultMember()){
						base = type.getDefaultMember();	// enter default member
						result = result.bind(method.module.sourceLocation(ast), base);
						i--;
					} else {
						throw method.module.newCompileException(ast, CompileException.DEFAULT_MEMBER_REQUIRED, ast);
					}
				} else if(ast instanceof MemberCallContext){
					MemberCallContext mc = (MemberCallContext) ast;
					String name = mc.ambiguousIdentifier().getText().toUpperCase();

					ModuleMemberDecl member = (ModuleMemberDecl) type.typeDecl.getMember(name);
					if (member instanceof VarDecl) {
						VarDecl vd = (VarDecl) member;
						type = vd.varType;
						result = result.bind(method.module.sourceLocation(ast), vd);
						
					} else if (member instanceof MethodDecl || member instanceof PropertyDecl) {
						result = result.bind(method.module.sourceLocation(ast), member);
						base = member;
						afterFunctionCalled = member instanceof MethodDecl || (member instanceof PropertyDecl && ((PropertyDecl)member).isReadonly());
					} else if (member == null) {
						throw method.module.newCompileException(mc.ambiguousIdentifier(), CompileException.MEMBER_NOT_EXIST, mc.ambiguousIdentifier().getText());
					}
				} else if(ast instanceof DictionaryCallContext){
					if(type.isDictionary()){
						DictionaryCallContext dictCall = (DictionaryCallContext) ast;
						ModuleMemberDecl member = type.getDictionaryMember();
						result = result.bind(method.module.sourceLocation(ast), member);
						
						List<ValueStatementDesc> lsArgCalls = new ArrayList<>();
						ValueStatementDesc desc = new ValueStatementDesc();
						desc.setAst(ast).setStatement(new LiteralStatement(new VbValue(VbVarType.VbString, dictCall.ambiguousIdentifier().getText()))).setVarType(VbVarType.VbString);
						lsArgCalls.add(desc);
						result.bind(method.module.sourceLocation(dictCall.ambiguousIdentifier()), compiler.toStatements(lsArgCalls, method.module));
						
						base = null;
						type = getReturnType(member);
						
						afterFunctionCalled = member instanceof MethodDecl || (member instanceof PropertyDecl && ((PropertyDecl)member).isReadonly());
					} else {
						throw method.module.newCompileException(ast, CompileException.DEFAULT_MEMBER_REQUIRED, ast);
					}
				}
				
			} else if(type.vbType == VbVarType.vbUserDefinedType){
				if(ast instanceof ArgsCallContext){
					throw method.module.newCompileException(ast, CompileException.SYNTAX_ERROR, " is a udt");
				} else if(ast instanceof MemberCallContext){
					String name = ((MemberCallContext) ast).ambiguousIdentifier().getText().toUpperCase();
					if (!type.typeDecl.hasMember(name))
						throw method.module.newCompileException(ast, CompileException.UNKNOWN_MEMBER, ast);

					VarDecl member = (VarDecl) type.typeDecl.getMember(name);
					result = result.bind(method.module.sourceLocation(ast), member);
					type = member.varType;
					base = null;
				} else if(ast instanceof DictionaryCallContext){
					throw method.module.newCompileException(ast, CompileException.SYNTAX_ERROR, " is a array");
				}
			} else {	// base type
				throw method.module.newCompileException(ast, CompileException.SYNTAX_ERROR, " is base type");
			}
		}

		if (asAssignee) {
			if (afterFunctionCalled) {
				throw method.module.newCompileException(implicitCallStmt, CompileException.FUNCTION_CANNOT_ASSIGN,
						implicitCallStmt);
			} else {
				return new ValueStatementDesc().setStatement(result).setVarType(type).setAst(implicitCallStmt);
			}
		} else {
			if (apply) {
//				MemberAtLocation last = result.peek();
//				if(last.member instanceof MethodDecl || last.member instanceof PropertyDecl){
//					compiler.checkMethodOrPropertyCall((VbDecl) last.member, Collections.emptyList(), method.module, thrumb.get(thrumb.size()-1));
//				}
				return new ValueStatementDesc().setStatement(result.apply()).setVarType(type).setAst(implicitCallStmt);
			} else {
				return new ValueStatementDesc().setStatement(result).setVarType(type).setAst(implicitCallStmt);
			}
		}
	}
	
	
	
	
	private VbVarType getReturnType(ModuleMemberDecl member) {
		if(member instanceof MethodDecl){
			return ((MethodDecl) member).returnType;
		} else {
			PropertyDecl pd = (PropertyDecl) member;
			return pd.getReturnType();
		}
	}

	void checkArrayOrCollectionCall(VbVarType varType, List<ValueStatementDesc> argCalls, ModuleDecl module,
			ParserRuleContext ast) {
		// TODO
	}
	

	private boolean nextIsArguments(List<ArgumentDecl> arguments, VbVarType returnType, ParserRuleContext next) {
		boolean result = true;
		if (next instanceof SubscriptsContext) {
			int sz = ((SubscriptsContext) next).subscript().size();
			if (arguments.size() == 0) {
				if (sz == 0) {
					//
				} else if (returnType.vbType == VbVarType.vbArray || returnType.vbType == VbVarType.vbVariant) {
					result = false;
				} else { // TODO wrong arguments check soon
					//
				}
			}
		} else if (next instanceof ArgsCallContext) {
			int sz = ((ArgsCallContext) next).argCall().size();
			if (arguments.size() == 0) {
				if (sz == 0) {
					//
				} else if (returnType.vbType == VbVarType.vbArray || returnType.vbType == VbVarType.vbVariant) {
					result = false;
				} else { // TODO wrong arguments check soon
					//
				}
			}
		} else {
			result = false;
		}
		return result;
	}
}
