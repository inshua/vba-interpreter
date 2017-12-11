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
package vba;

// Generated from Vba.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link VbaParser}.
 */
public interface VbaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link VbaParser#startRule}.
	 * @param ctx the parse tree
	 */
	void enterStartRule(VbaParser.StartRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#startRule}.
	 * @param ctx the parse tree
	 */
	void exitStartRule(VbaParser.StartRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#module}.
	 * @param ctx the parse tree
	 */
	void enterModule(VbaParser.ModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#module}.
	 * @param ctx the parse tree
	 */
	void exitModule(VbaParser.ModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#moduleHeader}.
	 * @param ctx the parse tree
	 */
	void enterModuleHeader(VbaParser.ModuleHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#moduleHeader}.
	 * @param ctx the parse tree
	 */
	void exitModuleHeader(VbaParser.ModuleHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#moduleConfig}.
	 * @param ctx the parse tree
	 */
	void enterModuleConfig(VbaParser.ModuleConfigContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#moduleConfig}.
	 * @param ctx the parse tree
	 */
	void exitModuleConfig(VbaParser.ModuleConfigContext ctx);
	/**
	 * Enter a parse tree produced by the {@code complexProperty}
	 * labeled alternative in {@link VbaParser#moduleConfigElement}.
	 * @param ctx the parse tree
	 */
	void enterComplexProperty(VbaParser.ComplexPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code complexProperty}
	 * labeled alternative in {@link VbaParser#moduleConfigElement}.
	 * @param ctx the parse tree
	 */
	void exitComplexProperty(VbaParser.ComplexPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleProperty}
	 * labeled alternative in {@link VbaParser#moduleConfigElement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleProperty(VbaParser.SimplePropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleProperty}
	 * labeled alternative in {@link VbaParser#moduleConfigElement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleProperty(VbaParser.SimplePropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#moduleBagProperty}.
	 * @param ctx the parse tree
	 */
	void enterModuleBagProperty(VbaParser.ModuleBagPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#moduleBagProperty}.
	 * @param ctx the parse tree
	 */
	void exitModuleBagProperty(VbaParser.ModuleBagPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#controlDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterControlDeclaration(VbaParser.ControlDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#controlDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitControlDeclaration(VbaParser.ControlDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#moduleAttributes}.
	 * @param ctx the parse tree
	 */
	void enterModuleAttributes(VbaParser.ModuleAttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#moduleAttributes}.
	 * @param ctx the parse tree
	 */
	void exitModuleAttributes(VbaParser.ModuleAttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#moduleDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterModuleDeclarations(VbaParser.ModuleDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#moduleDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitModuleDeclarations(VbaParser.ModuleDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code optionBaseStmt}
	 * labeled alternative in {@link VbaParser#moduleOption}.
	 * @param ctx the parse tree
	 */
	void enterOptionBaseStmt(VbaParser.OptionBaseStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code optionBaseStmt}
	 * labeled alternative in {@link VbaParser#moduleOption}.
	 * @param ctx the parse tree
	 */
	void exitOptionBaseStmt(VbaParser.OptionBaseStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code optionCompareStmt}
	 * labeled alternative in {@link VbaParser#moduleOption}.
	 * @param ctx the parse tree
	 */
	void enterOptionCompareStmt(VbaParser.OptionCompareStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code optionCompareStmt}
	 * labeled alternative in {@link VbaParser#moduleOption}.
	 * @param ctx the parse tree
	 */
	void exitOptionCompareStmt(VbaParser.OptionCompareStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code optionExplicitStmt}
	 * labeled alternative in {@link VbaParser#moduleOption}.
	 * @param ctx the parse tree
	 */
	void enterOptionExplicitStmt(VbaParser.OptionExplicitStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code optionExplicitStmt}
	 * labeled alternative in {@link VbaParser#moduleOption}.
	 * @param ctx the parse tree
	 */
	void exitOptionExplicitStmt(VbaParser.OptionExplicitStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code optionPrivateModuleStmt}
	 * labeled alternative in {@link VbaParser#moduleOption}.
	 * @param ctx the parse tree
	 */
	void enterOptionPrivateModuleStmt(VbaParser.OptionPrivateModuleStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code optionPrivateModuleStmt}
	 * labeled alternative in {@link VbaParser#moduleOption}.
	 * @param ctx the parse tree
	 */
	void exitOptionPrivateModuleStmt(VbaParser.OptionPrivateModuleStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#moduleDeclarationsElement}.
	 * @param ctx the parse tree
	 */
	void enterModuleDeclarationsElement(VbaParser.ModuleDeclarationsElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#moduleDeclarationsElement}.
	 * @param ctx the parse tree
	 */
	void exitModuleDeclarationsElement(VbaParser.ModuleDeclarationsElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#macroStmt}.
	 * @param ctx the parse tree
	 */
	void enterMacroStmt(VbaParser.MacroStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#macroStmt}.
	 * @param ctx the parse tree
	 */
	void exitMacroStmt(VbaParser.MacroStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#moduleBody}.
	 * @param ctx the parse tree
	 */
	void enterModuleBody(VbaParser.ModuleBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#moduleBody}.
	 * @param ctx the parse tree
	 */
	void exitModuleBody(VbaParser.ModuleBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#moduleBodyElement}.
	 * @param ctx the parse tree
	 */
	void enterModuleBodyElement(VbaParser.ModuleBodyElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#moduleBodyElement}.
	 * @param ctx the parse tree
	 */
	void exitModuleBodyElement(VbaParser.ModuleBodyElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#attributeStmt}.
	 * @param ctx the parse tree
	 */
	void enterAttributeStmt(VbaParser.AttributeStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#attributeStmt}.
	 * @param ctx the parse tree
	 */
	void exitAttributeStmt(VbaParser.AttributeStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(VbaParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(VbaParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#blockStmt}.
	 * @param ctx the parse tree
	 */
	void enterBlockStmt(VbaParser.BlockStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#blockStmt}.
	 * @param ctx the parse tree
	 */
	void exitBlockStmt(VbaParser.BlockStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#evalStmt}.
	 * @param ctx the parse tree
	 */
	void enterEvalStmt(VbaParser.EvalStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#evalStmt}.
	 * @param ctx the parse tree
	 */
	void exitEvalStmt(VbaParser.EvalStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#appactivateStmt}.
	 * @param ctx the parse tree
	 */
	void enterAppactivateStmt(VbaParser.AppactivateStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#appactivateStmt}.
	 * @param ctx the parse tree
	 */
	void exitAppactivateStmt(VbaParser.AppactivateStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#beepStmt}.
	 * @param ctx the parse tree
	 */
	void enterBeepStmt(VbaParser.BeepStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#beepStmt}.
	 * @param ctx the parse tree
	 */
	void exitBeepStmt(VbaParser.BeepStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#chdirStmt}.
	 * @param ctx the parse tree
	 */
	void enterChdirStmt(VbaParser.ChdirStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#chdirStmt}.
	 * @param ctx the parse tree
	 */
	void exitChdirStmt(VbaParser.ChdirStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#chdriveStmt}.
	 * @param ctx the parse tree
	 */
	void enterChdriveStmt(VbaParser.ChdriveStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#chdriveStmt}.
	 * @param ctx the parse tree
	 */
	void exitChdriveStmt(VbaParser.ChdriveStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#closeStmt}.
	 * @param ctx the parse tree
	 */
	void enterCloseStmt(VbaParser.CloseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#closeStmt}.
	 * @param ctx the parse tree
	 */
	void exitCloseStmt(VbaParser.CloseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#constStmt}.
	 * @param ctx the parse tree
	 */
	void enterConstStmt(VbaParser.ConstStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#constStmt}.
	 * @param ctx the parse tree
	 */
	void exitConstStmt(VbaParser.ConstStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#constSubStmt}.
	 * @param ctx the parse tree
	 */
	void enterConstSubStmt(VbaParser.ConstSubStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#constSubStmt}.
	 * @param ctx the parse tree
	 */
	void exitConstSubStmt(VbaParser.ConstSubStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#dateStmt}.
	 * @param ctx the parse tree
	 */
	void enterDateStmt(VbaParser.DateStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#dateStmt}.
	 * @param ctx the parse tree
	 */
	void exitDateStmt(VbaParser.DateStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#declareStmt}.
	 * @param ctx the parse tree
	 */
	void enterDeclareStmt(VbaParser.DeclareStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#declareStmt}.
	 * @param ctx the parse tree
	 */
	void exitDeclareStmt(VbaParser.DeclareStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#deftypeStmt}.
	 * @param ctx the parse tree
	 */
	void enterDeftypeStmt(VbaParser.DeftypeStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#deftypeStmt}.
	 * @param ctx the parse tree
	 */
	void exitDeftypeStmt(VbaParser.DeftypeStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#deleteSettingStmt}.
	 * @param ctx the parse tree
	 */
	void enterDeleteSettingStmt(VbaParser.DeleteSettingStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#deleteSettingStmt}.
	 * @param ctx the parse tree
	 */
	void exitDeleteSettingStmt(VbaParser.DeleteSettingStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#doLoopStmt}.
	 * @param ctx the parse tree
	 */
	void enterDoLoopStmt(VbaParser.DoLoopStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#doLoopStmt}.
	 * @param ctx the parse tree
	 */
	void exitDoLoopStmt(VbaParser.DoLoopStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#endStmt}.
	 * @param ctx the parse tree
	 */
	void enterEndStmt(VbaParser.EndStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#endStmt}.
	 * @param ctx the parse tree
	 */
	void exitEndStmt(VbaParser.EndStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#enumerationStmt}.
	 * @param ctx the parse tree
	 */
	void enterEnumerationStmt(VbaParser.EnumerationStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#enumerationStmt}.
	 * @param ctx the parse tree
	 */
	void exitEnumerationStmt(VbaParser.EnumerationStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#enumerationStmt_Constant}.
	 * @param ctx the parse tree
	 */
	void enterEnumerationStmt_Constant(VbaParser.EnumerationStmt_ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#enumerationStmt_Constant}.
	 * @param ctx the parse tree
	 */
	void exitEnumerationStmt_Constant(VbaParser.EnumerationStmt_ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#eraseStmt}.
	 * @param ctx the parse tree
	 */
	void enterEraseStmt(VbaParser.EraseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#eraseStmt}.
	 * @param ctx the parse tree
	 */
	void exitEraseStmt(VbaParser.EraseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#errorStmt}.
	 * @param ctx the parse tree
	 */
	void enterErrorStmt(VbaParser.ErrorStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#errorStmt}.
	 * @param ctx the parse tree
	 */
	void exitErrorStmt(VbaParser.ErrorStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#eventStmt}.
	 * @param ctx the parse tree
	 */
	void enterEventStmt(VbaParser.EventStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#eventStmt}.
	 * @param ctx the parse tree
	 */
	void exitEventStmt(VbaParser.EventStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#exitStmt}.
	 * @param ctx the parse tree
	 */
	void enterExitStmt(VbaParser.ExitStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#exitStmt}.
	 * @param ctx the parse tree
	 */
	void exitExitStmt(VbaParser.ExitStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#filecopyStmt}.
	 * @param ctx the parse tree
	 */
	void enterFilecopyStmt(VbaParser.FilecopyStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#filecopyStmt}.
	 * @param ctx the parse tree
	 */
	void exitFilecopyStmt(VbaParser.FilecopyStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#forEachStmt}.
	 * @param ctx the parse tree
	 */
	void enterForEachStmt(VbaParser.ForEachStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#forEachStmt}.
	 * @param ctx the parse tree
	 */
	void exitForEachStmt(VbaParser.ForEachStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#forNextStmt}.
	 * @param ctx the parse tree
	 */
	void enterForNextStmt(VbaParser.ForNextStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#forNextStmt}.
	 * @param ctx the parse tree
	 */
	void exitForNextStmt(VbaParser.ForNextStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#functionStmt}.
	 * @param ctx the parse tree
	 */
	void enterFunctionStmt(VbaParser.FunctionStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#functionStmt}.
	 * @param ctx the parse tree
	 */
	void exitFunctionStmt(VbaParser.FunctionStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#ruleStmt}.
	 * @param ctx the parse tree
	 */
	void enterRuleStmt(VbaParser.RuleStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#ruleStmt}.
	 * @param ctx the parse tree
	 */
	void exitRuleStmt(VbaParser.RuleStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#getStmt}.
	 * @param ctx the parse tree
	 */
	void enterGetStmt(VbaParser.GetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#getStmt}.
	 * @param ctx the parse tree
	 */
	void exitGetStmt(VbaParser.GetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#goSubStmt}.
	 * @param ctx the parse tree
	 */
	void enterGoSubStmt(VbaParser.GoSubStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#goSubStmt}.
	 * @param ctx the parse tree
	 */
	void exitGoSubStmt(VbaParser.GoSubStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#goToStmt}.
	 * @param ctx the parse tree
	 */
	void enterGoToStmt(VbaParser.GoToStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#goToStmt}.
	 * @param ctx the parse tree
	 */
	void exitGoToStmt(VbaParser.GoToStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inlineIfThenElse}
	 * labeled alternative in {@link VbaParser#ifThenElseStmt}.
	 * @param ctx the parse tree
	 */
	void enterInlineIfThenElse(VbaParser.InlineIfThenElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inlineIfThenElse}
	 * labeled alternative in {@link VbaParser#ifThenElseStmt}.
	 * @param ctx the parse tree
	 */
	void exitInlineIfThenElse(VbaParser.InlineIfThenElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blockIfThenElse}
	 * labeled alternative in {@link VbaParser#ifThenElseStmt}.
	 * @param ctx the parse tree
	 */
	void enterBlockIfThenElse(VbaParser.BlockIfThenElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockIfThenElse}
	 * labeled alternative in {@link VbaParser#ifThenElseStmt}.
	 * @param ctx the parse tree
	 */
	void exitBlockIfThenElse(VbaParser.BlockIfThenElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#ifBlockStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfBlockStmt(VbaParser.IfBlockStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#ifBlockStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfBlockStmt(VbaParser.IfBlockStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#ifConditionStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfConditionStmt(VbaParser.IfConditionStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#ifConditionStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfConditionStmt(VbaParser.IfConditionStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#ifElseIfBlockStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfElseIfBlockStmt(VbaParser.IfElseIfBlockStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#ifElseIfBlockStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfElseIfBlockStmt(VbaParser.IfElseIfBlockStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#ifElseBlockStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfElseBlockStmt(VbaParser.IfElseBlockStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#ifElseBlockStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfElseBlockStmt(VbaParser.IfElseBlockStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#implementsStmt}.
	 * @param ctx the parse tree
	 */
	void enterImplementsStmt(VbaParser.ImplementsStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#implementsStmt}.
	 * @param ctx the parse tree
	 */
	void exitImplementsStmt(VbaParser.ImplementsStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#inputStmt}.
	 * @param ctx the parse tree
	 */
	void enterInputStmt(VbaParser.InputStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#inputStmt}.
	 * @param ctx the parse tree
	 */
	void exitInputStmt(VbaParser.InputStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#killStmt}.
	 * @param ctx the parse tree
	 */
	void enterKillStmt(VbaParser.KillStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#killStmt}.
	 * @param ctx the parse tree
	 */
	void exitKillStmt(VbaParser.KillStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#letStmt}.
	 * @param ctx the parse tree
	 */
	void enterLetStmt(VbaParser.LetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#letStmt}.
	 * @param ctx the parse tree
	 */
	void exitLetStmt(VbaParser.LetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#lineInputStmt}.
	 * @param ctx the parse tree
	 */
	void enterLineInputStmt(VbaParser.LineInputStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#lineInputStmt}.
	 * @param ctx the parse tree
	 */
	void exitLineInputStmt(VbaParser.LineInputStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#loadStmt}.
	 * @param ctx the parse tree
	 */
	void enterLoadStmt(VbaParser.LoadStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#loadStmt}.
	 * @param ctx the parse tree
	 */
	void exitLoadStmt(VbaParser.LoadStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#lockStmt}.
	 * @param ctx the parse tree
	 */
	void enterLockStmt(VbaParser.LockStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#lockStmt}.
	 * @param ctx the parse tree
	 */
	void exitLockStmt(VbaParser.LockStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#lsetStmt}.
	 * @param ctx the parse tree
	 */
	void enterLsetStmt(VbaParser.LsetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#lsetStmt}.
	 * @param ctx the parse tree
	 */
	void exitLsetStmt(VbaParser.LsetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#macroConstStmt}.
	 * @param ctx the parse tree
	 */
	void enterMacroConstStmt(VbaParser.MacroConstStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#macroConstStmt}.
	 * @param ctx the parse tree
	 */
	void exitMacroConstStmt(VbaParser.MacroConstStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#macroIfThenElseStmt}.
	 * @param ctx the parse tree
	 */
	void enterMacroIfThenElseStmt(VbaParser.MacroIfThenElseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#macroIfThenElseStmt}.
	 * @param ctx the parse tree
	 */
	void exitMacroIfThenElseStmt(VbaParser.MacroIfThenElseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#macroIfBlockStmt}.
	 * @param ctx the parse tree
	 */
	void enterMacroIfBlockStmt(VbaParser.MacroIfBlockStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#macroIfBlockStmt}.
	 * @param ctx the parse tree
	 */
	void exitMacroIfBlockStmt(VbaParser.MacroIfBlockStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#macroElseIfBlockStmt}.
	 * @param ctx the parse tree
	 */
	void enterMacroElseIfBlockStmt(VbaParser.MacroElseIfBlockStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#macroElseIfBlockStmt}.
	 * @param ctx the parse tree
	 */
	void exitMacroElseIfBlockStmt(VbaParser.MacroElseIfBlockStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#macroElseBlockStmt}.
	 * @param ctx the parse tree
	 */
	void enterMacroElseBlockStmt(VbaParser.MacroElseBlockStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#macroElseBlockStmt}.
	 * @param ctx the parse tree
	 */
	void exitMacroElseBlockStmt(VbaParser.MacroElseBlockStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#midStmt}.
	 * @param ctx the parse tree
	 */
	void enterMidStmt(VbaParser.MidStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#midStmt}.
	 * @param ctx the parse tree
	 */
	void exitMidStmt(VbaParser.MidStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#mkdirStmt}.
	 * @param ctx the parse tree
	 */
	void enterMkdirStmt(VbaParser.MkdirStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#mkdirStmt}.
	 * @param ctx the parse tree
	 */
	void exitMkdirStmt(VbaParser.MkdirStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#nameStmt}.
	 * @param ctx the parse tree
	 */
	void enterNameStmt(VbaParser.NameStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#nameStmt}.
	 * @param ctx the parse tree
	 */
	void exitNameStmt(VbaParser.NameStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#onErrorStmt}.
	 * @param ctx the parse tree
	 */
	void enterOnErrorStmt(VbaParser.OnErrorStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#onErrorStmt}.
	 * @param ctx the parse tree
	 */
	void exitOnErrorStmt(VbaParser.OnErrorStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#onGoToStmt}.
	 * @param ctx the parse tree
	 */
	void enterOnGoToStmt(VbaParser.OnGoToStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#onGoToStmt}.
	 * @param ctx the parse tree
	 */
	void exitOnGoToStmt(VbaParser.OnGoToStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#onGoSubStmt}.
	 * @param ctx the parse tree
	 */
	void enterOnGoSubStmt(VbaParser.OnGoSubStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#onGoSubStmt}.
	 * @param ctx the parse tree
	 */
	void exitOnGoSubStmt(VbaParser.OnGoSubStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#openStmt}.
	 * @param ctx the parse tree
	 */
	void enterOpenStmt(VbaParser.OpenStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#openStmt}.
	 * @param ctx the parse tree
	 */
	void exitOpenStmt(VbaParser.OpenStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#outputList}.
	 * @param ctx the parse tree
	 */
	void enterOutputList(VbaParser.OutputListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#outputList}.
	 * @param ctx the parse tree
	 */
	void exitOutputList(VbaParser.OutputListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#outputList_Expression}.
	 * @param ctx the parse tree
	 */
	void enterOutputList_Expression(VbaParser.OutputList_ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#outputList_Expression}.
	 * @param ctx the parse tree
	 */
	void exitOutputList_Expression(VbaParser.OutputList_ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintStmt(VbaParser.PrintStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintStmt(VbaParser.PrintStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#propertyGetStmt}.
	 * @param ctx the parse tree
	 */
	void enterPropertyGetStmt(VbaParser.PropertyGetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#propertyGetStmt}.
	 * @param ctx the parse tree
	 */
	void exitPropertyGetStmt(VbaParser.PropertyGetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#propertySetStmt}.
	 * @param ctx the parse tree
	 */
	void enterPropertySetStmt(VbaParser.PropertySetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#propertySetStmt}.
	 * @param ctx the parse tree
	 */
	void exitPropertySetStmt(VbaParser.PropertySetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#propertyLetStmt}.
	 * @param ctx the parse tree
	 */
	void enterPropertyLetStmt(VbaParser.PropertyLetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#propertyLetStmt}.
	 * @param ctx the parse tree
	 */
	void exitPropertyLetStmt(VbaParser.PropertyLetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#putStmt}.
	 * @param ctx the parse tree
	 */
	void enterPutStmt(VbaParser.PutStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#putStmt}.
	 * @param ctx the parse tree
	 */
	void exitPutStmt(VbaParser.PutStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#raiseEventStmt}.
	 * @param ctx the parse tree
	 */
	void enterRaiseEventStmt(VbaParser.RaiseEventStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#raiseEventStmt}.
	 * @param ctx the parse tree
	 */
	void exitRaiseEventStmt(VbaParser.RaiseEventStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#randomizeStmt}.
	 * @param ctx the parse tree
	 */
	void enterRandomizeStmt(VbaParser.RandomizeStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#randomizeStmt}.
	 * @param ctx the parse tree
	 */
	void exitRandomizeStmt(VbaParser.RandomizeStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#redimStmt}.
	 * @param ctx the parse tree
	 */
	void enterRedimStmt(VbaParser.RedimStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#redimStmt}.
	 * @param ctx the parse tree
	 */
	void exitRedimStmt(VbaParser.RedimStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#redimSubStmt}.
	 * @param ctx the parse tree
	 */
	void enterRedimSubStmt(VbaParser.RedimSubStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#redimSubStmt}.
	 * @param ctx the parse tree
	 */
	void exitRedimSubStmt(VbaParser.RedimSubStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#resetStmt}.
	 * @param ctx the parse tree
	 */
	void enterResetStmt(VbaParser.ResetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#resetStmt}.
	 * @param ctx the parse tree
	 */
	void exitResetStmt(VbaParser.ResetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#resumeStmt}.
	 * @param ctx the parse tree
	 */
	void enterResumeStmt(VbaParser.ResumeStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#resumeStmt}.
	 * @param ctx the parse tree
	 */
	void exitResumeStmt(VbaParser.ResumeStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(VbaParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(VbaParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#rmdirStmt}.
	 * @param ctx the parse tree
	 */
	void enterRmdirStmt(VbaParser.RmdirStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#rmdirStmt}.
	 * @param ctx the parse tree
	 */
	void exitRmdirStmt(VbaParser.RmdirStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#rsetStmt}.
	 * @param ctx the parse tree
	 */
	void enterRsetStmt(VbaParser.RsetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#rsetStmt}.
	 * @param ctx the parse tree
	 */
	void exitRsetStmt(VbaParser.RsetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#savepictureStmt}.
	 * @param ctx the parse tree
	 */
	void enterSavepictureStmt(VbaParser.SavepictureStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#savepictureStmt}.
	 * @param ctx the parse tree
	 */
	void exitSavepictureStmt(VbaParser.SavepictureStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#saveSettingStmt}.
	 * @param ctx the parse tree
	 */
	void enterSaveSettingStmt(VbaParser.SaveSettingStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#saveSettingStmt}.
	 * @param ctx the parse tree
	 */
	void exitSaveSettingStmt(VbaParser.SaveSettingStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#seekStmt}.
	 * @param ctx the parse tree
	 */
	void enterSeekStmt(VbaParser.SeekStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#seekStmt}.
	 * @param ctx the parse tree
	 */
	void exitSeekStmt(VbaParser.SeekStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#selectCaseStmt}.
	 * @param ctx the parse tree
	 */
	void enterSelectCaseStmt(VbaParser.SelectCaseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#selectCaseStmt}.
	 * @param ctx the parse tree
	 */
	void exitSelectCaseStmt(VbaParser.SelectCaseStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code caseCondIs}
	 * labeled alternative in {@link VbaParser#sC_Selection}.
	 * @param ctx the parse tree
	 */
	void enterCaseCondIs(VbaParser.CaseCondIsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code caseCondIs}
	 * labeled alternative in {@link VbaParser#sC_Selection}.
	 * @param ctx the parse tree
	 */
	void exitCaseCondIs(VbaParser.CaseCondIsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code caseCondTo}
	 * labeled alternative in {@link VbaParser#sC_Selection}.
	 * @param ctx the parse tree
	 */
	void enterCaseCondTo(VbaParser.CaseCondToContext ctx);
	/**
	 * Exit a parse tree produced by the {@code caseCondTo}
	 * labeled alternative in {@link VbaParser#sC_Selection}.
	 * @param ctx the parse tree
	 */
	void exitCaseCondTo(VbaParser.CaseCondToContext ctx);
	/**
	 * Enter a parse tree produced by the {@code caseCondValue}
	 * labeled alternative in {@link VbaParser#sC_Selection}.
	 * @param ctx the parse tree
	 */
	void enterCaseCondValue(VbaParser.CaseCondValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code caseCondValue}
	 * labeled alternative in {@link VbaParser#sC_Selection}.
	 * @param ctx the parse tree
	 */
	void exitCaseCondValue(VbaParser.CaseCondValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#sC_Case}.
	 * @param ctx the parse tree
	 */
	void enterSC_Case(VbaParser.SC_CaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#sC_Case}.
	 * @param ctx the parse tree
	 */
	void exitSC_Case(VbaParser.SC_CaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code caseCondElse}
	 * labeled alternative in {@link VbaParser#sC_Cond}.
	 * @param ctx the parse tree
	 */
	void enterCaseCondElse(VbaParser.CaseCondElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code caseCondElse}
	 * labeled alternative in {@link VbaParser#sC_Cond}.
	 * @param ctx the parse tree
	 */
	void exitCaseCondElse(VbaParser.CaseCondElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code caseCondSelection}
	 * labeled alternative in {@link VbaParser#sC_Cond}.
	 * @param ctx the parse tree
	 */
	void enterCaseCondSelection(VbaParser.CaseCondSelectionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code caseCondSelection}
	 * labeled alternative in {@link VbaParser#sC_Cond}.
	 * @param ctx the parse tree
	 */
	void exitCaseCondSelection(VbaParser.CaseCondSelectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#sendkeysStmt}.
	 * @param ctx the parse tree
	 */
	void enterSendkeysStmt(VbaParser.SendkeysStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#sendkeysStmt}.
	 * @param ctx the parse tree
	 */
	void exitSendkeysStmt(VbaParser.SendkeysStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#setattrStmt}.
	 * @param ctx the parse tree
	 */
	void enterSetattrStmt(VbaParser.SetattrStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#setattrStmt}.
	 * @param ctx the parse tree
	 */
	void exitSetattrStmt(VbaParser.SetattrStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#setStmt}.
	 * @param ctx the parse tree
	 */
	void enterSetStmt(VbaParser.SetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#setStmt}.
	 * @param ctx the parse tree
	 */
	void exitSetStmt(VbaParser.SetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#stopStmt}.
	 * @param ctx the parse tree
	 */
	void enterStopStmt(VbaParser.StopStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#stopStmt}.
	 * @param ctx the parse tree
	 */
	void exitStopStmt(VbaParser.StopStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#subStmt}.
	 * @param ctx the parse tree
	 */
	void enterSubStmt(VbaParser.SubStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#subStmt}.
	 * @param ctx the parse tree
	 */
	void exitSubStmt(VbaParser.SubStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#timeStmt}.
	 * @param ctx the parse tree
	 */
	void enterTimeStmt(VbaParser.TimeStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#timeStmt}.
	 * @param ctx the parse tree
	 */
	void exitTimeStmt(VbaParser.TimeStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#typeStmt}.
	 * @param ctx the parse tree
	 */
	void enterTypeStmt(VbaParser.TypeStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#typeStmt}.
	 * @param ctx the parse tree
	 */
	void exitTypeStmt(VbaParser.TypeStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#typeStmt_Element}.
	 * @param ctx the parse tree
	 */
	void enterTypeStmt_Element(VbaParser.TypeStmt_ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#typeStmt_Element}.
	 * @param ctx the parse tree
	 */
	void exitTypeStmt_Element(VbaParser.TypeStmt_ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#typeOfIsStmt}.
	 * @param ctx the parse tree
	 */
	void enterTypeOfIsStmt(VbaParser.TypeOfIsStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#typeOfIsStmt}.
	 * @param ctx the parse tree
	 */
	void exitTypeOfIsStmt(VbaParser.TypeOfIsStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#unloadStmt}.
	 * @param ctx the parse tree
	 */
	void enterUnloadStmt(VbaParser.UnloadStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#unloadStmt}.
	 * @param ctx the parse tree
	 */
	void exitUnloadStmt(VbaParser.UnloadStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#unlockStmt}.
	 * @param ctx the parse tree
	 */
	void enterUnlockStmt(VbaParser.UnlockStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#unlockStmt}.
	 * @param ctx the parse tree
	 */
	void exitUnlockStmt(VbaParser.UnlockStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cveDiv}
	 * labeled alternative in {@link VbaParser#constValueExpr}.
	 * @param ctx the parse tree
	 */
	void enterCveDiv(VbaParser.CveDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cveDiv}
	 * labeled alternative in {@link VbaParser#constValueExpr}.
	 * @param ctx the parse tree
	 */
	void exitCveDiv(VbaParser.CveDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cveMinus}
	 * labeled alternative in {@link VbaParser#constValueExpr}.
	 * @param ctx the parse tree
	 */
	void enterCveMinus(VbaParser.CveMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cveMinus}
	 * labeled alternative in {@link VbaParser#constValueExpr}.
	 * @param ctx the parse tree
	 */
	void exitCveMinus(VbaParser.CveMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cveEqv}
	 * labeled alternative in {@link VbaParser#constValueExpr}.
	 * @param ctx the parse tree
	 */
	void enterCveEqv(VbaParser.CveEqvContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cveEqv}
	 * labeled alternative in {@link VbaParser#constValueExpr}.
	 * @param ctx the parse tree
	 */
	void exitCveEqv(VbaParser.CveEqvContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cveImp}
	 * labeled alternative in {@link VbaParser#constValueExpr}.
	 * @param ctx the parse tree
	 */
	void enterCveImp(VbaParser.CveImpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cveImp}
	 * labeled alternative in {@link VbaParser#constValueExpr}.
	 * @param ctx the parse tree
	 */
	void exitCveImp(VbaParser.CveImpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cveMod}
	 * labeled alternative in {@link VbaParser#constValueExpr}.
	 * @param ctx the parse tree
	 */
	void enterCveMod(VbaParser.CveModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cveMod}
	 * labeled alternative in {@link VbaParser#constValueExpr}.
	 * @param ctx the parse tree
	 */
	void exitCveMod(VbaParser.CveModContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cveAmp}
	 * labeled alternative in {@link VbaParser#constValueExpr}.
	 * @param ctx the parse tree
	 */
	void enterCveAmp(VbaParser.CveAmpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cveAmp}
	 * labeled alternative in {@link VbaParser#constValueExpr}.
	 * @param ctx the parse tree
	 */
	void exitCveAmp(VbaParser.CveAmpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cveLt}
	 * labeled alternative in {@link VbaParser#constValueExpr}.
	 * @param ctx the parse tree
	 */
	void enterCveLt(VbaParser.CveLtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cveLt}
	 * labeled alternative in {@link VbaParser#constValueExpr}.
	 * @param ctx the parse tree
	 */
	void exitCveLt(VbaParser.CveLtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cveLike}
	 * labeled alternative in {@link VbaParser#constValueExpr}.
	 * @param ctx the parse tree
	 */
	void enterCveLike(VbaParser.CveLikeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cveLike}
	 * labeled alternative in {@link VbaParser#constValueExpr}.
	 * @param ctx the parse tree
	 */
	void exitCveLike(VbaParser.CveLikeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cveAdd}
	 * labeled alternative in {@link VbaParser#constValueExpr}.
	 * @param ctx the parse tree
	 */
	void enterCveAdd(VbaParser.CveAddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cveAdd}
	 * labeled alternative in {@link VbaParser#constValueExpr}.
	 * @param ctx the parse tree
	 */
	void exitCveAdd(VbaParser.CveAddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cveEq}
	 * labeled alternative in {@link VbaParser#constValueExpr}.
	 * @param ctx the parse tree
	 */
	void enterCveEq(VbaParser.CveEqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cveEq}
	 * labeled alternative in {@link VbaParser#constValueExpr}.
	 * @param ctx the parse tree
	 */
	void exitCveEq(VbaParser.CveEqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cveXor}
	 * labeled alternative in {@link VbaParser#constValueExpr}.
	 * @param ctx the parse tree
	 */
	void enterCveXor(VbaParser.CveXorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cveXor}
	 * labeled alternative in {@link VbaParser#constValueExpr}.
	 * @param ctx the parse tree
	 */
	void exitCveXor(VbaParser.CveXorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cveGt}
	 * labeled alternative in {@link VbaParser#constValueExpr}.
	 * @param ctx the parse tree
	 */
	void enterCveGt(VbaParser.CveGtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cveGt}
	 * labeled alternative in {@link VbaParser#constValueExpr}.
	 * @param ctx the parse tree
	 */
	void exitCveGt(VbaParser.CveGtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cveNeq}
	 * labeled alternative in {@link VbaParser#constValueExpr}.
	 * @param ctx the parse tree
	 */
	void enterCveNeq(VbaParser.CveNeqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cveNeq}
	 * labeled alternative in {@link VbaParser#constValueExpr}.
	 * @param ctx the parse tree
	 */
	void exitCveNeq(VbaParser.CveNeqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cvePlus}
	 * labeled alternative in {@link VbaParser#constValueExpr}.
	 * @param ctx the parse tree
	 */
	void enterCvePlus(VbaParser.CvePlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cvePlus}
	 * labeled alternative in {@link VbaParser#constValueExpr}.
	 * @param ctx the parse tree
	 */
	void exitCvePlus(VbaParser.CvePlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cveAnd}
	 * labeled alternative in {@link VbaParser#constValueExpr}.
	 * @param ctx the parse tree
	 */
	void enterCveAnd(VbaParser.CveAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cveAnd}
	 * labeled alternative in {@link VbaParser#constValueExpr}.
	 * @param ctx the parse tree
	 */
	void exitCveAnd(VbaParser.CveAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cveIdentifier}
	 * labeled alternative in {@link VbaParser#constValueExpr}.
	 * @param ctx the parse tree
	 */
	void enterCveIdentifier(VbaParser.CveIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cveIdentifier}
	 * labeled alternative in {@link VbaParser#constValueExpr}.
	 * @param ctx the parse tree
	 */
	void exitCveIdentifier(VbaParser.CveIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cveMult}
	 * labeled alternative in {@link VbaParser#constValueExpr}.
	 * @param ctx the parse tree
	 */
	void enterCveMult(VbaParser.CveMultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cveMult}
	 * labeled alternative in {@link VbaParser#constValueExpr}.
	 * @param ctx the parse tree
	 */
	void exitCveMult(VbaParser.CveMultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cveNegation}
	 * labeled alternative in {@link VbaParser#constValueExpr}.
	 * @param ctx the parse tree
	 */
	void enterCveNegation(VbaParser.CveNegationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cveNegation}
	 * labeled alternative in {@link VbaParser#constValueExpr}.
	 * @param ctx the parse tree
	 */
	void exitCveNegation(VbaParser.CveNegationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cvePow}
	 * labeled alternative in {@link VbaParser#constValueExpr}.
	 * @param ctx the parse tree
	 */
	void enterCvePow(VbaParser.CvePowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cvePow}
	 * labeled alternative in {@link VbaParser#constValueExpr}.
	 * @param ctx the parse tree
	 */
	void exitCvePow(VbaParser.CvePowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cveLeq}
	 * labeled alternative in {@link VbaParser#constValueExpr}.
	 * @param ctx the parse tree
	 */
	void enterCveLeq(VbaParser.CveLeqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cveLeq}
	 * labeled alternative in {@link VbaParser#constValueExpr}.
	 * @param ctx the parse tree
	 */
	void exitCveLeq(VbaParser.CveLeqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cveLiteral}
	 * labeled alternative in {@link VbaParser#constValueExpr}.
	 * @param ctx the parse tree
	 */
	void enterCveLiteral(VbaParser.CveLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cveLiteral}
	 * labeled alternative in {@link VbaParser#constValueExpr}.
	 * @param ctx the parse tree
	 */
	void exitCveLiteral(VbaParser.CveLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cveNot}
	 * labeled alternative in {@link VbaParser#constValueExpr}.
	 * @param ctx the parse tree
	 */
	void enterCveNot(VbaParser.CveNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cveNot}
	 * labeled alternative in {@link VbaParser#constValueExpr}.
	 * @param ctx the parse tree
	 */
	void exitCveNot(VbaParser.CveNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cveGeq}
	 * labeled alternative in {@link VbaParser#constValueExpr}.
	 * @param ctx the parse tree
	 */
	void enterCveGeq(VbaParser.CveGeqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cveGeq}
	 * labeled alternative in {@link VbaParser#constValueExpr}.
	 * @param ctx the parse tree
	 */
	void exitCveGeq(VbaParser.CveGeqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cveOr}
	 * labeled alternative in {@link VbaParser#constValueExpr}.
	 * @param ctx the parse tree
	 */
	void enterCveOr(VbaParser.CveOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cveOr}
	 * labeled alternative in {@link VbaParser#constValueExpr}.
	 * @param ctx the parse tree
	 */
	void exitCveOr(VbaParser.CveOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsStruct}
	 * labeled alternative in {@link VbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsStruct(VbaParser.VsStructContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsStruct}
	 * labeled alternative in {@link VbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsStruct(VbaParser.VsStructContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsAdd}
	 * labeled alternative in {@link VbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsAdd(VbaParser.VsAddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsAdd}
	 * labeled alternative in {@link VbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsAdd(VbaParser.VsAddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsLt}
	 * labeled alternative in {@link VbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsLt(VbaParser.VsLtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsLt}
	 * labeled alternative in {@link VbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsLt(VbaParser.VsLtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsAddressOf}
	 * labeled alternative in {@link VbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsAddressOf(VbaParser.VsAddressOfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsAddressOf}
	 * labeled alternative in {@link VbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsAddressOf(VbaParser.VsAddressOfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsNew}
	 * labeled alternative in {@link VbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsNew(VbaParser.VsNewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsNew}
	 * labeled alternative in {@link VbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsNew(VbaParser.VsNewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsMult}
	 * labeled alternative in {@link VbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsMult(VbaParser.VsMultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsMult}
	 * labeled alternative in {@link VbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsMult(VbaParser.VsMultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsNegation}
	 * labeled alternative in {@link VbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsNegation(VbaParser.VsNegationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsNegation}
	 * labeled alternative in {@link VbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsNegation(VbaParser.VsNegationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsDiv}
	 * labeled alternative in {@link VbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsDiv(VbaParser.VsDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsDiv}
	 * labeled alternative in {@link VbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsDiv(VbaParser.VsDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsLike}
	 * labeled alternative in {@link VbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsLike(VbaParser.VsLikeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsLike}
	 * labeled alternative in {@link VbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsLike(VbaParser.VsLikeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsPlus}
	 * labeled alternative in {@link VbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsPlus(VbaParser.VsPlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsPlus}
	 * labeled alternative in {@link VbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsPlus(VbaParser.VsPlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsNot}
	 * labeled alternative in {@link VbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsNot(VbaParser.VsNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsNot}
	 * labeled alternative in {@link VbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsNot(VbaParser.VsNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsGeq}
	 * labeled alternative in {@link VbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsGeq(VbaParser.VsGeqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsGeq}
	 * labeled alternative in {@link VbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsGeq(VbaParser.VsGeqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsTypeOf}
	 * labeled alternative in {@link VbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsTypeOf(VbaParser.VsTypeOfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsTypeOf}
	 * labeled alternative in {@link VbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsTypeOf(VbaParser.VsTypeOfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsICS}
	 * labeled alternative in {@link VbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsICS(VbaParser.VsICSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsICS}
	 * labeled alternative in {@link VbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsICS(VbaParser.VsICSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsNeq}
	 * labeled alternative in {@link VbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsNeq(VbaParser.VsNeqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsNeq}
	 * labeled alternative in {@link VbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsNeq(VbaParser.VsNeqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsXor}
	 * labeled alternative in {@link VbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsXor(VbaParser.VsXorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsXor}
	 * labeled alternative in {@link VbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsXor(VbaParser.VsXorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsAnd}
	 * labeled alternative in {@link VbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsAnd(VbaParser.VsAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsAnd}
	 * labeled alternative in {@link VbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsAnd(VbaParser.VsAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsPow}
	 * labeled alternative in {@link VbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsPow(VbaParser.VsPowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsPow}
	 * labeled alternative in {@link VbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsPow(VbaParser.VsPowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsLeq}
	 * labeled alternative in {@link VbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsLeq(VbaParser.VsLeqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsLeq}
	 * labeled alternative in {@link VbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsLeq(VbaParser.VsLeqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsIs}
	 * labeled alternative in {@link VbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsIs(VbaParser.VsIsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsIs}
	 * labeled alternative in {@link VbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsIs(VbaParser.VsIsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsMod}
	 * labeled alternative in {@link VbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsMod(VbaParser.VsModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsMod}
	 * labeled alternative in {@link VbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsMod(VbaParser.VsModContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsAmp}
	 * labeled alternative in {@link VbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsAmp(VbaParser.VsAmpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsAmp}
	 * labeled alternative in {@link VbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsAmp(VbaParser.VsAmpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsOr}
	 * labeled alternative in {@link VbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsOr(VbaParser.VsOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsOr}
	 * labeled alternative in {@link VbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsOr(VbaParser.VsOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsMinus}
	 * labeled alternative in {@link VbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsMinus(VbaParser.VsMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsMinus}
	 * labeled alternative in {@link VbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsMinus(VbaParser.VsMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsLiteral}
	 * labeled alternative in {@link VbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsLiteral(VbaParser.VsLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsLiteral}
	 * labeled alternative in {@link VbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsLiteral(VbaParser.VsLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsEqv}
	 * labeled alternative in {@link VbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsEqv(VbaParser.VsEqvContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsEqv}
	 * labeled alternative in {@link VbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsEqv(VbaParser.VsEqvContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsImp}
	 * labeled alternative in {@link VbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsImp(VbaParser.VsImpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsImp}
	 * labeled alternative in {@link VbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsImp(VbaParser.VsImpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsGt}
	 * labeled alternative in {@link VbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsGt(VbaParser.VsGtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsGt}
	 * labeled alternative in {@link VbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsGt(VbaParser.VsGtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsEq}
	 * labeled alternative in {@link VbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsEq(VbaParser.VsEqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsEq}
	 * labeled alternative in {@link VbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsEq(VbaParser.VsEqContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#variableStmt}.
	 * @param ctx the parse tree
	 */
	void enterVariableStmt(VbaParser.VariableStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#variableStmt}.
	 * @param ctx the parse tree
	 */
	void exitVariableStmt(VbaParser.VariableStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#variableListStmt}.
	 * @param ctx the parse tree
	 */
	void enterVariableListStmt(VbaParser.VariableListStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#variableListStmt}.
	 * @param ctx the parse tree
	 */
	void exitVariableListStmt(VbaParser.VariableListStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#variableSubStmt}.
	 * @param ctx the parse tree
	 */
	void enterVariableSubStmt(VbaParser.VariableSubStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#variableSubStmt}.
	 * @param ctx the parse tree
	 */
	void exitVariableSubStmt(VbaParser.VariableSubStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#whileWendStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileWendStmt(VbaParser.WhileWendStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#whileWendStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileWendStmt(VbaParser.WhileWendStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#widthStmt}.
	 * @param ctx the parse tree
	 */
	void enterWidthStmt(VbaParser.WidthStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#widthStmt}.
	 * @param ctx the parse tree
	 */
	void exitWidthStmt(VbaParser.WidthStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#withStmt}.
	 * @param ctx the parse tree
	 */
	void enterWithStmt(VbaParser.WithStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#withStmt}.
	 * @param ctx the parse tree
	 */
	void exitWithStmt(VbaParser.WithStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#writeStmt}.
	 * @param ctx the parse tree
	 */
	void enterWriteStmt(VbaParser.WriteStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#writeStmt}.
	 * @param ctx the parse tree
	 */
	void exitWriteStmt(VbaParser.WriteStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#fileNumber}.
	 * @param ctx the parse tree
	 */
	void enterFileNumber(VbaParser.FileNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#fileNumber}.
	 * @param ctx the parse tree
	 */
	void exitFileNumber(VbaParser.FileNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#explicitCallStmt}.
	 * @param ctx the parse tree
	 */
	void enterExplicitCallStmt(VbaParser.ExplicitCallStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#explicitCallStmt}.
	 * @param ctx the parse tree
	 */
	void exitExplicitCallStmt(VbaParser.ExplicitCallStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#implicitCallStmt_InBlock}.
	 * @param ctx the parse tree
	 */
	void enterImplicitCallStmt_InBlock(VbaParser.ImplicitCallStmt_InBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#implicitCallStmt_InBlock}.
	 * @param ctx the parse tree
	 */
	void exitImplicitCallStmt_InBlock(VbaParser.ImplicitCallStmt_InBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#implicitCallStmt_InStmt}.
	 * @param ctx the parse tree
	 */
	void enterImplicitCallStmt_InStmt(VbaParser.ImplicitCallStmt_InStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#implicitCallStmt_InStmt}.
	 * @param ctx the parse tree
	 */
	void exitImplicitCallStmt_InStmt(VbaParser.ImplicitCallStmt_InStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#iCS_startElement}.
	 * @param ctx the parse tree
	 */
	void enterICS_startElement(VbaParser.ICS_startElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#iCS_startElement}.
	 * @param ctx the parse tree
	 */
	void exitICS_startElement(VbaParser.ICS_startElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#iCS_followElement}.
	 * @param ctx the parse tree
	 */
	void enterICS_followElement(VbaParser.ICS_followElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#iCS_followElement}.
	 * @param ctx the parse tree
	 */
	void exitICS_followElement(VbaParser.ICS_followElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#memberCall}.
	 * @param ctx the parse tree
	 */
	void enterMemberCall(VbaParser.MemberCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#memberCall}.
	 * @param ctx the parse tree
	 */
	void exitMemberCall(VbaParser.MemberCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#dictionaryCall}.
	 * @param ctx the parse tree
	 */
	void enterDictionaryCall(VbaParser.DictionaryCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#dictionaryCall}.
	 * @param ctx the parse tree
	 */
	void exitDictionaryCall(VbaParser.DictionaryCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#argsCall}.
	 * @param ctx the parse tree
	 */
	void enterArgsCall(VbaParser.ArgsCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#argsCall}.
	 * @param ctx the parse tree
	 */
	void exitArgsCall(VbaParser.ArgsCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#argCall}.
	 * @param ctx the parse tree
	 */
	void enterArgCall(VbaParser.ArgCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#argCall}.
	 * @param ctx the parse tree
	 */
	void exitArgCall(VbaParser.ArgCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgList(VbaParser.ArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgList(VbaParser.ArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(VbaParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(VbaParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#argDefaultValue}.
	 * @param ctx the parse tree
	 */
	void enterArgDefaultValue(VbaParser.ArgDefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#argDefaultValue}.
	 * @param ctx the parse tree
	 */
	void exitArgDefaultValue(VbaParser.ArgDefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#subscripts}.
	 * @param ctx the parse tree
	 */
	void enterSubscripts(VbaParser.SubscriptsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#subscripts}.
	 * @param ctx the parse tree
	 */
	void exitSubscripts(VbaParser.SubscriptsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#subscript}.
	 * @param ctx the parse tree
	 */
	void enterSubscript(VbaParser.SubscriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#subscript}.
	 * @param ctx the parse tree
	 */
	void exitSubscript(VbaParser.SubscriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#constSubscripts}.
	 * @param ctx the parse tree
	 */
	void enterConstSubscripts(VbaParser.ConstSubscriptsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#constSubscripts}.
	 * @param ctx the parse tree
	 */
	void exitConstSubscripts(VbaParser.ConstSubscriptsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#constSubscript}.
	 * @param ctx the parse tree
	 */
	void enterConstSubscript(VbaParser.ConstSubscriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#constSubscript}.
	 * @param ctx the parse tree
	 */
	void exitConstSubscript(VbaParser.ConstSubscriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#ambiguousIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterAmbiguousIdentifier(VbaParser.AmbiguousIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#ambiguousIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitAmbiguousIdentifier(VbaParser.AmbiguousIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#asTypeClause}.
	 * @param ctx the parse tree
	 */
	void enterAsTypeClause(VbaParser.AsTypeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#asTypeClause}.
	 * @param ctx the parse tree
	 */
	void exitAsTypeClause(VbaParser.AsTypeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#baseType}.
	 * @param ctx the parse tree
	 */
	void enterBaseType(VbaParser.BaseTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#baseType}.
	 * @param ctx the parse tree
	 */
	void exitBaseType(VbaParser.BaseTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#certainIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterCertainIdentifier(VbaParser.CertainIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#certainIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitCertainIdentifier(VbaParser.CertainIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(VbaParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(VbaParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#fixedSizeString}.
	 * @param ctx the parse tree
	 */
	void enterFixedSizeString(VbaParser.FixedSizeStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#fixedSizeString}.
	 * @param ctx the parse tree
	 */
	void exitFixedSizeString(VbaParser.FixedSizeStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#complexType}.
	 * @param ctx the parse tree
	 */
	void enterComplexType(VbaParser.ComplexTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#complexType}.
	 * @param ctx the parse tree
	 */
	void exitComplexType(VbaParser.ComplexTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#fieldLength}.
	 * @param ctx the parse tree
	 */
	void enterFieldLength(VbaParser.FieldLengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#fieldLength}.
	 * @param ctx the parse tree
	 */
	void exitFieldLength(VbaParser.FieldLengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#letterrange}.
	 * @param ctx the parse tree
	 */
	void enterLetterrange(VbaParser.LetterrangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#letterrange}.
	 * @param ctx the parse tree
	 */
	void exitLetterrange(VbaParser.LetterrangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#lineLabel}.
	 * @param ctx the parse tree
	 */
	void enterLineLabel(VbaParser.LineLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#lineLabel}.
	 * @param ctx the parse tree
	 */
	void exitLineLabel(VbaParser.LineLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(VbaParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(VbaParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(VbaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(VbaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#typeHint}.
	 * @param ctx the parse tree
	 */
	void enterTypeHint(VbaParser.TypeHintContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#typeHint}.
	 * @param ctx the parse tree
	 */
	void exitTypeHint(VbaParser.TypeHintContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#visibility}.
	 * @param ctx the parse tree
	 */
	void enterVisibility(VbaParser.VisibilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#visibility}.
	 * @param ctx the parse tree
	 */
	void exitVisibility(VbaParser.VisibilityContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#ambiguousKeyword}.
	 * @param ctx the parse tree
	 */
	void enterAmbiguousKeyword(VbaParser.AmbiguousKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#ambiguousKeyword}.
	 * @param ctx the parse tree
	 */
	void exitAmbiguousKeyword(VbaParser.AmbiguousKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#remComment}.
	 * @param ctx the parse tree
	 */
	void enterRemComment(VbaParser.RemCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#remComment}.
	 * @param ctx the parse tree
	 */
	void exitRemComment(VbaParser.RemCommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(VbaParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(VbaParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#endOfLine}.
	 * @param ctx the parse tree
	 */
	void enterEndOfLine(VbaParser.EndOfLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#endOfLine}.
	 * @param ctx the parse tree
	 */
	void exitEndOfLine(VbaParser.EndOfLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link VbaParser#endOfStatement}.
	 * @param ctx the parse tree
	 */
	void enterEndOfStatement(VbaParser.EndOfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VbaParser#endOfStatement}.
	 * @param ctx the parse tree
	 */
	void exitEndOfStatement(VbaParser.EndOfStatementContext ctx);
}
