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
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VbaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, ACCESS=9, 
		ADDRESSOF=10, ALIAS=11, AND=12, ATTRIBUTE=13, APPACTIVATE=14, APPEND=15, 
		AS=16, BEGIN=17, BEGINPROPERTY=18, ENDPROPERTY=19, BEEP=20, BINARY=21, 
		BOOLEAN=22, BYVAL=23, BYREF=24, BYTE=25, CALL=26, CASE=27, CHDIR=28, CHDRIVE=29, 
		CLASS=30, CLOSE=31, COLLECTION=32, CONST=33, DATABASE=34, DATE=35, DECLARE=36, 
		DEFBOOL=37, DEFBYTE=38, DEFDATE=39, DEFDBL=40, DEFDEC=41, DEFCUR=42, DEFINT=43, 
		DEFLNG=44, DEFOBJ=45, DEFSNG=46, DEFSTR=47, DEFVAR=48, DELETESETTING=49, 
		DIM=50, DO=51, DOUBLE=52, EACH=53, ELSE=54, ELSEIF=55, END_ENUM=56, END_FUNCTION=57, 
		END_RULE=58, END_IF=59, END_PROPERTY=60, END_SELECT=61, END_SUB=62, END_TYPE=63, 
		END_WITH=64, END=65, ENUM=66, EQV=67, ERASE=68, ERROR=69, EVENT=70, EXIT_DO=71, 
		EXIT_FOR=72, EXIT_FUNCTION=73, EXIT_PROPERTY=74, EXIT_SUB=75, EXIT_RULE=76, 
		FALSE=77, FILECOPY=78, FRIEND=79, FOR=80, FUNCTION=81, RULE=82, GET=83, 
		GLOBAL=84, GOSUB=85, GOTO=86, IF=87, IMP=88, IMPLEMENTS=89, IN=90, INPUT=91, 
		IS=92, INTEGER=93, KILL=94, LOAD=95, LOCK=96, LONG=97, LOOP=98, LEN=99, 
		LET=100, LIB=101, LIKE=102, LINE_INPUT=103, LOCK_READ=104, LOCK_WRITE=105, 
		LOCK_READ_WRITE=106, LSET=107, MACRO_CONST=108, MACRO_IF=109, MACRO_ELSEIF=110, 
		MACRO_ELSE=111, MACRO_END_IF=112, ME=113, MID=114, MKDIR=115, MOD=116, 
		NAME=117, NEXT=118, NEW=119, NOT=120, NOTHING=121, NULL=122, EMPTY=123, 
		ON=124, ON_ERROR=125, ON_LOCAL_ERROR=126, OPEN=127, OPTIONAL=128, OPTION_BASE=129, 
		OPTION_EXPLICIT=130, OPTION_COMPARE=131, OPTION_PRIVATE_MODULE=132, OR=133, 
		OUTPUT=134, PARAMARRAY=135, PRESERVE=136, PRINT=137, PRIVATE=138, PROPERTY_GET=139, 
		PROPERTY_LET=140, PROPERTY_SET=141, PTRSAFE=142, PUBLIC=143, PUT=144, 
		RANDOM=145, RANDOMIZE=146, RAISEEVENT=147, READ=148, READ_WRITE=149, REDIM=150, 
		REM=151, RESET=152, RESUME=153, RETURN=154, RMDIR=155, RSET=156, SAVEPICTURE=157, 
		SAVESETTING=158, SEEK=159, SELECT=160, SENDKEYS=161, SET=162, SETATTR=163, 
		SHARED=164, SINGLE=165, CURRENCY=166, DECIMAL=167, SPC=168, STATIC=169, 
		STEP=170, STOP=171, STRING=172, SUB=173, TAB=174, TEXT=175, THEN=176, 
		TIME=177, TO=178, TRUE=179, TYPE=180, TYPEOF=181, UNLOAD=182, UNLOCK=183, 
		UNTIL=184, VARIANT=185, OBJECT=186, IUNKNOWN=187, VERSION=188, WEND=189, 
		WHILE=190, WIDTH=191, WITH=192, WHEN=193, WITHEVENTS=194, WRITE=195, XOR=196, 
		AMPERSAND=197, ASSIGN=198, DIV=199, EQ=200, GEQ=201, GT=202, LEQ=203, 
		LPAREN=204, LT=205, MINUS=206, MINUS_EQ=207, MULT=208, NEQ=209, PLUS=210, 
		PLUS_EQ=211, POW=212, RPAREN=213, L_SQUARE_BRACKET=214, R_SQUARE_BRACKET=215, 
		STRINGLITERAL=216, OCTLITERAL=217, HEXLITERAL=218, SHORTLITERAL=219, INTEGERLITERAL=220, 
		DOUBLELITERAL=221, DATELITERAL=222, LINE_CONTINUATION=223, NEWLINE=224, 
		REMCOMMENT=225, COMMENT=226, SINGLEQUOTE=227, COLON=228, UNDERSCORE=229, 
		WS=230, IDENTIFIER=231;
	public static final int
		RULE_startRule = 0, RULE_module = 1, RULE_moduleHeader = 2, RULE_moduleConfig = 3, 
		RULE_moduleConfigElement = 4, RULE_moduleBagProperty = 5, RULE_controlDeclaration = 6, 
		RULE_moduleAttributes = 7, RULE_moduleDeclarations = 8, RULE_moduleOption = 9, 
		RULE_moduleDeclarationsElement = 10, RULE_macroStmt = 11, RULE_moduleBody = 12, 
		RULE_moduleBodyElement = 13, RULE_attributeStmt = 14, RULE_block = 15, 
		RULE_blockStmt = 16, RULE_evalStmt = 17, RULE_appactivateStmt = 18, RULE_beepStmt = 19, 
		RULE_chdirStmt = 20, RULE_chdriveStmt = 21, RULE_closeStmt = 22, RULE_constStmt = 23, 
		RULE_constSubStmt = 24, RULE_dateStmt = 25, RULE_declareStmt = 26, RULE_deftypeStmt = 27, 
		RULE_deleteSettingStmt = 28, RULE_doLoopStmt = 29, RULE_endStmt = 30, 
		RULE_enumerationStmt = 31, RULE_enumerationStmt_Constant = 32, RULE_eraseStmt = 33, 
		RULE_errorStmt = 34, RULE_eventStmt = 35, RULE_exitStmt = 36, RULE_filecopyStmt = 37, 
		RULE_forEachStmt = 38, RULE_forNextStmt = 39, RULE_functionStmt = 40, 
		RULE_ruleStmt = 41, RULE_getStmt = 42, RULE_goSubStmt = 43, RULE_goToStmt = 44, 
		RULE_ifThenElseStmt = 45, RULE_ifBlockStmt = 46, RULE_ifConditionStmt = 47, 
		RULE_ifElseIfBlockStmt = 48, RULE_ifElseBlockStmt = 49, RULE_implementsStmt = 50, 
		RULE_inputStmt = 51, RULE_killStmt = 52, RULE_letStmt = 53, RULE_lineInputStmt = 54, 
		RULE_loadStmt = 55, RULE_lockStmt = 56, RULE_lsetStmt = 57, RULE_macroConstStmt = 58, 
		RULE_macroIfThenElseStmt = 59, RULE_macroIfBlockStmt = 60, RULE_macroElseIfBlockStmt = 61, 
		RULE_macroElseBlockStmt = 62, RULE_midStmt = 63, RULE_mkdirStmt = 64, 
		RULE_nameStmt = 65, RULE_onErrorStmt = 66, RULE_onGoToStmt = 67, RULE_onGoSubStmt = 68, 
		RULE_openStmt = 69, RULE_outputList = 70, RULE_outputList_Expression = 71, 
		RULE_printStmt = 72, RULE_propertyGetStmt = 73, RULE_propertySetStmt = 74, 
		RULE_propertyLetStmt = 75, RULE_putStmt = 76, RULE_raiseEventStmt = 77, 
		RULE_randomizeStmt = 78, RULE_redimStmt = 79, RULE_redimSubStmt = 80, 
		RULE_resetStmt = 81, RULE_resumeStmt = 82, RULE_returnStmt = 83, RULE_rmdirStmt = 84, 
		RULE_rsetStmt = 85, RULE_savepictureStmt = 86, RULE_saveSettingStmt = 87, 
		RULE_seekStmt = 88, RULE_selectCaseStmt = 89, RULE_sC_Selection = 90, 
		RULE_sC_Case = 91, RULE_sC_Cond = 92, RULE_sendkeysStmt = 93, RULE_setattrStmt = 94, 
		RULE_setStmt = 95, RULE_stopStmt = 96, RULE_subStmt = 97, RULE_timeStmt = 98, 
		RULE_typeStmt = 99, RULE_typeStmt_Element = 100, RULE_typeOfIsStmt = 101, 
		RULE_unloadStmt = 102, RULE_unlockStmt = 103, RULE_constValueExpr = 104, 
		RULE_valueStmt = 105, RULE_variableStmt = 106, RULE_variableListStmt = 107, 
		RULE_variableSubStmt = 108, RULE_whileWendStmt = 109, RULE_widthStmt = 110, 
		RULE_withStmt = 111, RULE_writeStmt = 112, RULE_fileNumber = 113, RULE_explicitCallStmt = 114, 
		RULE_implicitCallStmt_InBlock = 115, RULE_implicitCallStmt_InStmt = 116, 
		RULE_iCS_startElement = 117, RULE_iCS_followElement = 118, RULE_memberCall = 119, 
		RULE_dictionaryCall = 120, RULE_argsCall = 121, RULE_argCall = 122, RULE_argList = 123, 
		RULE_arg = 124, RULE_argDefaultValue = 125, RULE_subscripts = 126, RULE_subscript = 127, 
		RULE_constSubscripts = 128, RULE_constSubscript = 129, RULE_ambiguousIdentifier = 130, 
		RULE_asTypeClause = 131, RULE_baseType = 132, RULE_certainIdentifier = 133, 
		RULE_comparisonOperator = 134, RULE_fixedSizeString = 135, RULE_complexType = 136, 
		RULE_fieldLength = 137, RULE_letterrange = 138, RULE_lineLabel = 139, 
		RULE_literal = 140, RULE_type = 141, RULE_typeHint = 142, RULE_visibility = 143, 
		RULE_ambiguousKeyword = 144, RULE_remComment = 145, RULE_comment = 146, 
		RULE_endOfLine = 147, RULE_endOfStatement = 148;
	public static final String[] ruleNames = {
		"startRule", "module", "moduleHeader", "moduleConfig", "moduleConfigElement", 
		"moduleBagProperty", "controlDeclaration", "moduleAttributes", "moduleDeclarations", 
		"moduleOption", "moduleDeclarationsElement", "macroStmt", "moduleBody", 
		"moduleBodyElement", "attributeStmt", "block", "blockStmt", "evalStmt", 
		"appactivateStmt", "beepStmt", "chdirStmt", "chdriveStmt", "closeStmt", 
		"constStmt", "constSubStmt", "dateStmt", "declareStmt", "deftypeStmt", 
		"deleteSettingStmt", "doLoopStmt", "endStmt", "enumerationStmt", "enumerationStmt_Constant", 
		"eraseStmt", "errorStmt", "eventStmt", "exitStmt", "filecopyStmt", "forEachStmt", 
		"forNextStmt", "functionStmt", "ruleStmt", "getStmt", "goSubStmt", "goToStmt", 
		"ifThenElseStmt", "ifBlockStmt", "ifConditionStmt", "ifElseIfBlockStmt", 
		"ifElseBlockStmt", "implementsStmt", "inputStmt", "killStmt", "letStmt", 
		"lineInputStmt", "loadStmt", "lockStmt", "lsetStmt", "macroConstStmt", 
		"macroIfThenElseStmt", "macroIfBlockStmt", "macroElseIfBlockStmt", "macroElseBlockStmt", 
		"midStmt", "mkdirStmt", "nameStmt", "onErrorStmt", "onGoToStmt", "onGoSubStmt", 
		"openStmt", "outputList", "outputList_Expression", "printStmt", "propertyGetStmt", 
		"propertySetStmt", "propertyLetStmt", "putStmt", "raiseEventStmt", "randomizeStmt", 
		"redimStmt", "redimSubStmt", "resetStmt", "resumeStmt", "returnStmt", 
		"rmdirStmt", "rsetStmt", "savepictureStmt", "saveSettingStmt", "seekStmt", 
		"selectCaseStmt", "sC_Selection", "sC_Case", "sC_Cond", "sendkeysStmt", 
		"setattrStmt", "setStmt", "stopStmt", "subStmt", "timeStmt", "typeStmt", 
		"typeStmt_Element", "typeOfIsStmt", "unloadStmt", "unlockStmt", "constValueExpr", 
		"valueStmt", "variableStmt", "variableListStmt", "variableSubStmt", "whileWendStmt", 
		"widthStmt", "withStmt", "writeStmt", "fileNumber", "explicitCallStmt", 
		"implicitCallStmt_InBlock", "implicitCallStmt_InStmt", "iCS_startElement", 
		"iCS_followElement", "memberCall", "dictionaryCall", "argsCall", "argCall", 
		"argList", "arg", "argDefaultValue", "subscripts", "subscript", "constSubscripts", 
		"constSubscript", "ambiguousIdentifier", "asTypeClause", "baseType", "certainIdentifier", 
		"comparisonOperator", "fixedSizeString", "complexType", "fieldLength", 
		"letterrange", "lineLabel", "literal", "type", "typeHint", "visibility", 
		"ambiguousKeyword", "remComment", "comment", "endOfLine", "endOfStatement"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "';'", "'.'", "'#'", "'!'", "'%'", "'@'", "'$'", null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "'&'", "':='", null, "'='", "'>='", 
		"'>'", "'<='", "'('", "'<'", "'-'", "'-='", "'*'", "'<>'", "'+'", "'+='", 
		"'^'", "')'", "'['", "']'", null, null, null, null, null, null, null, 
		null, null, null, null, "'''", "':'", "'_'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "ACCESS", "ADDRESSOF", 
		"ALIAS", "AND", "ATTRIBUTE", "APPACTIVATE", "APPEND", "AS", "BEGIN", "BEGINPROPERTY", 
		"ENDPROPERTY", "BEEP", "BINARY", "BOOLEAN", "BYVAL", "BYREF", "BYTE", 
		"CALL", "CASE", "CHDIR", "CHDRIVE", "CLASS", "CLOSE", "COLLECTION", "CONST", 
		"DATABASE", "DATE", "DECLARE", "DEFBOOL", "DEFBYTE", "DEFDATE", "DEFDBL", 
		"DEFDEC", "DEFCUR", "DEFINT", "DEFLNG", "DEFOBJ", "DEFSNG", "DEFSTR", 
		"DEFVAR", "DELETESETTING", "DIM", "DO", "DOUBLE", "EACH", "ELSE", "ELSEIF", 
		"END_ENUM", "END_FUNCTION", "END_RULE", "END_IF", "END_PROPERTY", "END_SELECT", 
		"END_SUB", "END_TYPE", "END_WITH", "END", "ENUM", "EQV", "ERASE", "ERROR", 
		"EVENT", "EXIT_DO", "EXIT_FOR", "EXIT_FUNCTION", "EXIT_PROPERTY", "EXIT_SUB", 
		"EXIT_RULE", "FALSE", "FILECOPY", "FRIEND", "FOR", "FUNCTION", "RULE", 
		"GET", "GLOBAL", "GOSUB", "GOTO", "IF", "IMP", "IMPLEMENTS", "IN", "INPUT", 
		"IS", "INTEGER", "KILL", "LOAD", "LOCK", "LONG", "LOOP", "LEN", "LET", 
		"LIB", "LIKE", "LINE_INPUT", "LOCK_READ", "LOCK_WRITE", "LOCK_READ_WRITE", 
		"LSET", "MACRO_CONST", "MACRO_IF", "MACRO_ELSEIF", "MACRO_ELSE", "MACRO_END_IF", 
		"ME", "MID", "MKDIR", "MOD", "NAME", "NEXT", "NEW", "NOT", "NOTHING", 
		"NULL", "EMPTY", "ON", "ON_ERROR", "ON_LOCAL_ERROR", "OPEN", "OPTIONAL", 
		"OPTION_BASE", "OPTION_EXPLICIT", "OPTION_COMPARE", "OPTION_PRIVATE_MODULE", 
		"OR", "OUTPUT", "PARAMARRAY", "PRESERVE", "PRINT", "PRIVATE", "PROPERTY_GET", 
		"PROPERTY_LET", "PROPERTY_SET", "PTRSAFE", "PUBLIC", "PUT", "RANDOM", 
		"RANDOMIZE", "RAISEEVENT", "READ", "READ_WRITE", "REDIM", "REM", "RESET", 
		"RESUME", "RETURN", "RMDIR", "RSET", "SAVEPICTURE", "SAVESETTING", "SEEK", 
		"SELECT", "SENDKEYS", "SET", "SETATTR", "SHARED", "SINGLE", "CURRENCY", 
		"DECIMAL", "SPC", "STATIC", "STEP", "STOP", "STRING", "SUB", "TAB", "TEXT", 
		"THEN", "TIME", "TO", "TRUE", "TYPE", "TYPEOF", "UNLOAD", "UNLOCK", "UNTIL", 
		"VARIANT", "OBJECT", "IUNKNOWN", "VERSION", "WEND", "WHILE", "WIDTH", 
		"WITH", "WHEN", "WITHEVENTS", "WRITE", "XOR", "AMPERSAND", "ASSIGN", "DIV", 
		"EQ", "GEQ", "GT", "LEQ", "LPAREN", "LT", "MINUS", "MINUS_EQ", "MULT", 
		"NEQ", "PLUS", "PLUS_EQ", "POW", "RPAREN", "L_SQUARE_BRACKET", "R_SQUARE_BRACKET", 
		"STRINGLITERAL", "OCTLITERAL", "HEXLITERAL", "SHORTLITERAL", "INTEGERLITERAL", 
		"DOUBLELITERAL", "DATELITERAL", "LINE_CONTINUATION", "NEWLINE", "REMCOMMENT", 
		"COMMENT", "SINGLEQUOTE", "COLON", "UNDERSCORE", "WS", "IDENTIFIER"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Vba.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public VbaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartRuleContext extends ParserRuleContext {
		public ModuleContext module() {
			return getRuleContext(ModuleContext.class,0);
		}
		public TerminalNode EOF() { return getToken(VbaParser.EOF, 0); }
		public StartRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterStartRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitStartRule(this);
		}
	}

	public final StartRuleContext startRule() throws RecognitionException {
		StartRuleContext _localctx = new StartRuleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_startRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			module();
			setState(299);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleContext extends ParserRuleContext {
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public List<EndOfLineContext> endOfLine() {
			return getRuleContexts(EndOfLineContext.class);
		}
		public EndOfLineContext endOfLine(int i) {
			return getRuleContext(EndOfLineContext.class,i);
		}
		public ModuleHeaderContext moduleHeader() {
			return getRuleContext(ModuleHeaderContext.class,0);
		}
		public ControlDeclarationContext controlDeclaration() {
			return getRuleContext(ControlDeclarationContext.class,0);
		}
		public ModuleConfigContext moduleConfig() {
			return getRuleContext(ModuleConfigContext.class,0);
		}
		public ModuleAttributesContext moduleAttributes() {
			return getRuleContext(ModuleAttributesContext.class,0);
		}
		public ModuleDeclarationsContext moduleDeclarations() {
			return getRuleContext(ModuleDeclarationsContext.class,0);
		}
		public ModuleBodyContext moduleBody() {
			return getRuleContext(ModuleBodyContext.class,0);
		}
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitModule(this);
		}
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_module);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(301);
				match(WS);
				}
				break;
			}
			setState(307);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(304);
					endOfLine();
					}
					} 
				}
				setState(309);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(317);
			_la = _input.LA(1);
			if (_la==VERSION) {
				{
				setState(310);
				moduleHeader();
				setState(314);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(311);
						endOfLine();
						}
						} 
					}
					setState(316);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				}
			}

			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(319);
				controlDeclaration();
				setState(323);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(320);
						endOfLine();
						}
						} 
					}
					setState(325);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				}
				break;
			}
			setState(329);
			_la = _input.LA(1);
			if (_la==BEGIN) {
				{
				setState(328);
				moduleConfig();
				}
			}

			setState(334);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(331);
					endOfLine();
					}
					} 
				}
				setState(336);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(337);
				moduleAttributes();
				}
				break;
			}
			setState(343);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(340);
					endOfLine();
					}
					} 
				}
				setState(345);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(346);
				moduleDeclarations();
				}
				break;
			}
			setState(352);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(349);
					endOfLine();
					}
					} 
				}
				setState(354);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(356);
			_la = _input.LA(1);
			if (((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (FRIEND - 79)) | (1L << (FUNCTION - 79)) | (1L << (RULE - 79)) | (1L << (GLOBAL - 79)) | (1L << (PRIVATE - 79)) | (1L << (PROPERTY_GET - 79)) | (1L << (PROPERTY_LET - 79)) | (1L << (PROPERTY_SET - 79)))) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & ((1L << (PUBLIC - 143)) | (1L << (STATIC - 143)) | (1L << (SUB - 143)))) != 0)) {
				{
				setState(355);
				moduleBody();
				}
			}

			setState(361);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(358);
					endOfLine();
					}
					} 
				}
				setState(363);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(365);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(364);
				match(WS);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleHeaderContext extends ParserRuleContext {
		public TerminalNode VERSION() { return getToken(VbaParser.VERSION, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public TerminalNode DOUBLELITERAL() { return getToken(VbaParser.DOUBLELITERAL, 0); }
		public TerminalNode CLASS() { return getToken(VbaParser.CLASS, 0); }
		public ModuleHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterModuleHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitModuleHeader(this);
		}
	}

	public final ModuleHeaderContext moduleHeader() throws RecognitionException {
		ModuleHeaderContext _localctx = new ModuleHeaderContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_moduleHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(VERSION);
			setState(368);
			match(WS);
			setState(369);
			match(DOUBLELITERAL);
			setState(372);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(370);
				match(WS);
				setState(371);
				match(CLASS);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleConfigContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(VbaParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(VbaParser.END, 0); }
		public List<EndOfLineContext> endOfLine() {
			return getRuleContexts(EndOfLineContext.class);
		}
		public EndOfLineContext endOfLine(int i) {
			return getRuleContext(EndOfLineContext.class,i);
		}
		public List<ModuleConfigElementContext> moduleConfigElement() {
			return getRuleContexts(ModuleConfigElementContext.class);
		}
		public ModuleConfigElementContext moduleConfigElement(int i) {
			return getRuleContext(ModuleConfigElementContext.class,i);
		}
		public ModuleConfigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleConfig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterModuleConfig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitModuleConfig(this);
		}
	}

	public final ModuleConfigContext moduleConfig() throws RecognitionException {
		ModuleConfigContext _localctx = new ModuleConfigContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_moduleConfig);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(BEGIN);
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 224)) & ~0x3f) == 0 && ((1L << (_la - 224)) & ((1L << (NEWLINE - 224)) | (1L << (REMCOMMENT - 224)) | (1L << (COMMENT - 224)) | (1L << (WS - 224)))) != 0)) {
				{
				{
				setState(375);
				endOfLine();
				}
				}
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(382); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(381);
				moduleConfigElement();
				}
				}
				setState(384); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << BEGIN) | (1L << BEGINPROPERTY) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (ENUM - 66)) | (1L << (EQV - 66)) | (1L << (ERASE - 66)) | (1L << (ERROR - 66)) | (1L << (EVENT - 66)) | (1L << (FALSE - 66)) | (1L << (FILECOPY - 66)) | (1L << (FRIEND - 66)) | (1L << (FOR - 66)) | (1L << (FUNCTION - 66)) | (1L << (GET - 66)) | (1L << (GLOBAL - 66)) | (1L << (GOSUB - 66)) | (1L << (GOTO - 66)) | (1L << (IF - 66)) | (1L << (IMP - 66)) | (1L << (IMPLEMENTS - 66)) | (1L << (IN - 66)) | (1L << (INPUT - 66)) | (1L << (IS - 66)) | (1L << (INTEGER - 66)) | (1L << (KILL - 66)) | (1L << (LOAD - 66)) | (1L << (LOCK - 66)) | (1L << (LONG - 66)) | (1L << (LOOP - 66)) | (1L << (LEN - 66)) | (1L << (LET - 66)) | (1L << (LIB - 66)) | (1L << (LIKE - 66)) | (1L << (LSET - 66)) | (1L << (ME - 66)) | (1L << (MID - 66)) | (1L << (MKDIR - 66)) | (1L << (MOD - 66)) | (1L << (NAME - 66)) | (1L << (NEXT - 66)) | (1L << (NEW - 66)) | (1L << (NOT - 66)) | (1L << (NOTHING - 66)) | (1L << (NULL - 66)) | (1L << (EMPTY - 66)) | (1L << (ON - 66)) | (1L << (OPEN - 66)) | (1L << (OPTIONAL - 66)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (OR - 133)) | (1L << (OUTPUT - 133)) | (1L << (PARAMARRAY - 133)) | (1L << (PRESERVE - 133)) | (1L << (PRINT - 133)) | (1L << (PRIVATE - 133)) | (1L << (PUBLIC - 133)) | (1L << (PUT - 133)) | (1L << (RANDOM - 133)) | (1L << (RANDOMIZE - 133)) | (1L << (RAISEEVENT - 133)) | (1L << (READ - 133)) | (1L << (REDIM - 133)) | (1L << (REM - 133)) | (1L << (RESET - 133)) | (1L << (RESUME - 133)) | (1L << (RETURN - 133)) | (1L << (RMDIR - 133)) | (1L << (RSET - 133)) | (1L << (SAVEPICTURE - 133)) | (1L << (SAVESETTING - 133)) | (1L << (SEEK - 133)) | (1L << (SELECT - 133)) | (1L << (SENDKEYS - 133)) | (1L << (SET - 133)) | (1L << (SETATTR - 133)) | (1L << (SHARED - 133)) | (1L << (SINGLE - 133)) | (1L << (SPC - 133)) | (1L << (STATIC - 133)) | (1L << (STEP - 133)) | (1L << (STRING - 133)) | (1L << (SUB - 133)) | (1L << (TAB - 133)) | (1L << (TEXT - 133)) | (1L << (THEN - 133)) | (1L << (TIME - 133)) | (1L << (TO - 133)) | (1L << (TRUE - 133)) | (1L << (TYPE - 133)) | (1L << (TYPEOF - 133)) | (1L << (UNLOAD - 133)) | (1L << (UNLOCK - 133)) | (1L << (UNTIL - 133)) | (1L << (VARIANT - 133)) | (1L << (VERSION - 133)) | (1L << (WEND - 133)) | (1L << (WHILE - 133)) | (1L << (WIDTH - 133)) | (1L << (WITH - 133)) | (1L << (WITHEVENTS - 133)) | (1L << (WRITE - 133)) | (1L << (XOR - 133)))) != 0) || _la==IDENTIFIER );
			setState(386);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleConfigElementContext extends ParserRuleContext {
		public ModuleConfigElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleConfigElement; }
	 
		public ModuleConfigElementContext() { }
		public void copyFrom(ModuleConfigElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ComplexPropertyContext extends ModuleConfigElementContext {
		public ModuleBagPropertyContext moduleBagProperty() {
			return getRuleContext(ModuleBagPropertyContext.class,0);
		}
		public ComplexPropertyContext(ModuleConfigElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterComplexProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitComplexProperty(this);
		}
	}
	public static class SimplePropertyContext extends ModuleConfigElementContext {
		public AmbiguousIdentifierContext ambiguousIdentifier() {
			return getRuleContext(AmbiguousIdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(VbaParser.EQ, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public List<EndOfLineContext> endOfLine() {
			return getRuleContexts(EndOfLineContext.class);
		}
		public EndOfLineContext endOfLine(int i) {
			return getRuleContext(EndOfLineContext.class,i);
		}
		public SimplePropertyContext(ModuleConfigElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterSimpleProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitSimpleProperty(this);
		}
	}

	public final ModuleConfigElementContext moduleConfigElement() throws RecognitionException {
		ModuleConfigElementContext _localctx = new ModuleConfigElementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_moduleConfigElement);
		int _la;
		try {
			setState(404);
			switch (_input.LA(1)) {
			case BEGINPROPERTY:
				_localctx = new ComplexPropertyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(388);
				moduleBagProperty();
				}
				break;
			case ACCESS:
			case ADDRESSOF:
			case ALIAS:
			case AND:
			case ATTRIBUTE:
			case APPACTIVATE:
			case APPEND:
			case BEGIN:
			case BEEP:
			case BINARY:
			case BOOLEAN:
			case BYVAL:
			case BYREF:
			case BYTE:
			case CALL:
			case CHDIR:
			case CHDRIVE:
			case CLASS:
			case CLOSE:
			case COLLECTION:
			case CONST:
			case DATABASE:
			case DATE:
			case DECLARE:
			case DEFBOOL:
			case DEFBYTE:
			case DEFDATE:
			case DEFDBL:
			case DEFDEC:
			case DEFCUR:
			case DEFINT:
			case DEFLNG:
			case DEFOBJ:
			case DEFSNG:
			case DEFSTR:
			case DEFVAR:
			case DELETESETTING:
			case DIM:
			case DO:
			case DOUBLE:
			case EACH:
			case ENUM:
			case EQV:
			case ERASE:
			case ERROR:
			case EVENT:
			case FALSE:
			case FILECOPY:
			case FRIEND:
			case FOR:
			case FUNCTION:
			case GET:
			case GLOBAL:
			case GOSUB:
			case GOTO:
			case IF:
			case IMP:
			case IMPLEMENTS:
			case IN:
			case INPUT:
			case IS:
			case INTEGER:
			case KILL:
			case LOAD:
			case LOCK:
			case LONG:
			case LOOP:
			case LEN:
			case LET:
			case LIB:
			case LIKE:
			case LSET:
			case ME:
			case MID:
			case MKDIR:
			case MOD:
			case NAME:
			case NEXT:
			case NEW:
			case NOT:
			case NOTHING:
			case NULL:
			case EMPTY:
			case ON:
			case OPEN:
			case OPTIONAL:
			case OR:
			case OUTPUT:
			case PARAMARRAY:
			case PRESERVE:
			case PRINT:
			case PRIVATE:
			case PUBLIC:
			case PUT:
			case RANDOM:
			case RANDOMIZE:
			case RAISEEVENT:
			case READ:
			case REDIM:
			case REM:
			case RESET:
			case RESUME:
			case RETURN:
			case RMDIR:
			case RSET:
			case SAVEPICTURE:
			case SAVESETTING:
			case SEEK:
			case SELECT:
			case SENDKEYS:
			case SET:
			case SETATTR:
			case SHARED:
			case SINGLE:
			case SPC:
			case STATIC:
			case STEP:
			case STRING:
			case SUB:
			case TAB:
			case TEXT:
			case THEN:
			case TIME:
			case TO:
			case TRUE:
			case TYPE:
			case TYPEOF:
			case UNLOAD:
			case UNLOCK:
			case UNTIL:
			case VARIANT:
			case VERSION:
			case WEND:
			case WHILE:
			case WIDTH:
			case WITH:
			case WITHEVENTS:
			case WRITE:
			case XOR:
			case IDENTIFIER:
				_localctx = new SimplePropertyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(389);
				ambiguousIdentifier();
				setState(391);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(390);
					match(WS);
					}
				}

				setState(393);
				match(EQ);
				setState(395);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(394);
					match(WS);
					}
				}

				setState(397);
				literal();
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 224)) & ~0x3f) == 0 && ((1L << (_la - 224)) & ((1L << (NEWLINE - 224)) | (1L << (REMCOMMENT - 224)) | (1L << (COMMENT - 224)) | (1L << (WS - 224)))) != 0)) {
					{
					{
					setState(398);
					endOfLine();
					}
					}
					setState(403);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleBagPropertyContext extends ParserRuleContext {
		public TerminalNode BEGINPROPERTY() { return getToken(VbaParser.BEGINPROPERTY, 0); }
		public TerminalNode WS() { return getToken(VbaParser.WS, 0); }
		public AmbiguousIdentifierContext ambiguousIdentifier() {
			return getRuleContext(AmbiguousIdentifierContext.class,0);
		}
		public TerminalNode ENDPROPERTY() { return getToken(VbaParser.ENDPROPERTY, 0); }
		public List<EndOfLineContext> endOfLine() {
			return getRuleContexts(EndOfLineContext.class);
		}
		public EndOfLineContext endOfLine(int i) {
			return getRuleContext(EndOfLineContext.class,i);
		}
		public List<ModuleConfigElementContext> moduleConfigElement() {
			return getRuleContexts(ModuleConfigElementContext.class);
		}
		public ModuleConfigElementContext moduleConfigElement(int i) {
			return getRuleContext(ModuleConfigElementContext.class,i);
		}
		public ModuleBagPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleBagProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterModuleBagProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitModuleBagProperty(this);
		}
	}

	public final ModuleBagPropertyContext moduleBagProperty() throws RecognitionException {
		ModuleBagPropertyContext _localctx = new ModuleBagPropertyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_moduleBagProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(BEGINPROPERTY);
			setState(407);
			match(WS);
			setState(408);
			ambiguousIdentifier();
			setState(410); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(409);
				endOfLine();
				}
				}
				setState(412); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 224)) & ~0x3f) == 0 && ((1L << (_la - 224)) & ((1L << (NEWLINE - 224)) | (1L << (REMCOMMENT - 224)) | (1L << (COMMENT - 224)) | (1L << (WS - 224)))) != 0) );
			setState(415); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(414);
				moduleConfigElement();
				}
				}
				setState(417); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << BEGIN) | (1L << BEGINPROPERTY) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (ENUM - 66)) | (1L << (EQV - 66)) | (1L << (ERASE - 66)) | (1L << (ERROR - 66)) | (1L << (EVENT - 66)) | (1L << (FALSE - 66)) | (1L << (FILECOPY - 66)) | (1L << (FRIEND - 66)) | (1L << (FOR - 66)) | (1L << (FUNCTION - 66)) | (1L << (GET - 66)) | (1L << (GLOBAL - 66)) | (1L << (GOSUB - 66)) | (1L << (GOTO - 66)) | (1L << (IF - 66)) | (1L << (IMP - 66)) | (1L << (IMPLEMENTS - 66)) | (1L << (IN - 66)) | (1L << (INPUT - 66)) | (1L << (IS - 66)) | (1L << (INTEGER - 66)) | (1L << (KILL - 66)) | (1L << (LOAD - 66)) | (1L << (LOCK - 66)) | (1L << (LONG - 66)) | (1L << (LOOP - 66)) | (1L << (LEN - 66)) | (1L << (LET - 66)) | (1L << (LIB - 66)) | (1L << (LIKE - 66)) | (1L << (LSET - 66)) | (1L << (ME - 66)) | (1L << (MID - 66)) | (1L << (MKDIR - 66)) | (1L << (MOD - 66)) | (1L << (NAME - 66)) | (1L << (NEXT - 66)) | (1L << (NEW - 66)) | (1L << (NOT - 66)) | (1L << (NOTHING - 66)) | (1L << (NULL - 66)) | (1L << (EMPTY - 66)) | (1L << (ON - 66)) | (1L << (OPEN - 66)) | (1L << (OPTIONAL - 66)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (OR - 133)) | (1L << (OUTPUT - 133)) | (1L << (PARAMARRAY - 133)) | (1L << (PRESERVE - 133)) | (1L << (PRINT - 133)) | (1L << (PRIVATE - 133)) | (1L << (PUBLIC - 133)) | (1L << (PUT - 133)) | (1L << (RANDOM - 133)) | (1L << (RANDOMIZE - 133)) | (1L << (RAISEEVENT - 133)) | (1L << (READ - 133)) | (1L << (REDIM - 133)) | (1L << (REM - 133)) | (1L << (RESET - 133)) | (1L << (RESUME - 133)) | (1L << (RETURN - 133)) | (1L << (RMDIR - 133)) | (1L << (RSET - 133)) | (1L << (SAVEPICTURE - 133)) | (1L << (SAVESETTING - 133)) | (1L << (SEEK - 133)) | (1L << (SELECT - 133)) | (1L << (SENDKEYS - 133)) | (1L << (SET - 133)) | (1L << (SETATTR - 133)) | (1L << (SHARED - 133)) | (1L << (SINGLE - 133)) | (1L << (SPC - 133)) | (1L << (STATIC - 133)) | (1L << (STEP - 133)) | (1L << (STRING - 133)) | (1L << (SUB - 133)) | (1L << (TAB - 133)) | (1L << (TEXT - 133)) | (1L << (THEN - 133)) | (1L << (TIME - 133)) | (1L << (TO - 133)) | (1L << (TRUE - 133)) | (1L << (TYPE - 133)) | (1L << (TYPEOF - 133)) | (1L << (UNLOAD - 133)) | (1L << (UNLOCK - 133)) | (1L << (UNTIL - 133)) | (1L << (VARIANT - 133)) | (1L << (VERSION - 133)) | (1L << (WEND - 133)) | (1L << (WHILE - 133)) | (1L << (WIDTH - 133)) | (1L << (WITH - 133)) | (1L << (WITHEVENTS - 133)) | (1L << (WRITE - 133)) | (1L << (XOR - 133)))) != 0) || _la==IDENTIFIER );
			setState(419);
			match(ENDPROPERTY);
			setState(421); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(420);
				endOfLine();
				}
				}
				setState(423); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 224)) & ~0x3f) == 0 && ((1L << (_la - 224)) & ((1L << (NEWLINE - 224)) | (1L << (REMCOMMENT - 224)) | (1L << (COMMENT - 224)) | (1L << (WS - 224)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ControlDeclarationContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(VbaParser.BEGIN, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AmbiguousIdentifierContext ambiguousIdentifier() {
			return getRuleContext(AmbiguousIdentifierContext.class,0);
		}
		public TerminalNode END() { return getToken(VbaParser.END, 0); }
		public List<EndOfLineContext> endOfLine() {
			return getRuleContexts(EndOfLineContext.class);
		}
		public EndOfLineContext endOfLine(int i) {
			return getRuleContext(EndOfLineContext.class,i);
		}
		public List<ModuleConfigElementContext> moduleConfigElement() {
			return getRuleContexts(ModuleConfigElementContext.class);
		}
		public ModuleConfigElementContext moduleConfigElement(int i) {
			return getRuleContext(ModuleConfigElementContext.class,i);
		}
		public List<ControlDeclarationContext> controlDeclaration() {
			return getRuleContexts(ControlDeclarationContext.class);
		}
		public ControlDeclarationContext controlDeclaration(int i) {
			return getRuleContext(ControlDeclarationContext.class,i);
		}
		public ControlDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controlDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterControlDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitControlDeclaration(this);
		}
	}

	public final ControlDeclarationContext controlDeclaration() throws RecognitionException {
		ControlDeclarationContext _localctx = new ControlDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_controlDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			match(BEGIN);
			setState(426);
			match(WS);
			setState(427);
			type();
			setState(428);
			match(WS);
			setState(429);
			ambiguousIdentifier();
			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 224)) & ~0x3f) == 0 && ((1L << (_la - 224)) & ((1L << (NEWLINE - 224)) | (1L << (REMCOMMENT - 224)) | (1L << (COMMENT - 224)) | (1L << (WS - 224)))) != 0)) {
				{
				{
				setState(430);
				endOfLine();
				}
				}
				setState(435);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(437); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(436);
					moduleConfigElement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(439); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BEGIN) {
				{
				{
				setState(441);
				controlDeclaration();
				}
				}
				setState(446);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(447);
			match(END);
			setState(449); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(448);
					endOfLine();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(451); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleAttributesContext extends ParserRuleContext {
		public List<AttributeStmtContext> attributeStmt() {
			return getRuleContexts(AttributeStmtContext.class);
		}
		public AttributeStmtContext attributeStmt(int i) {
			return getRuleContext(AttributeStmtContext.class,i);
		}
		public List<EndOfLineContext> endOfLine() {
			return getRuleContexts(EndOfLineContext.class);
		}
		public EndOfLineContext endOfLine(int i) {
			return getRuleContext(EndOfLineContext.class,i);
		}
		public ModuleAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleAttributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterModuleAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitModuleAttributes(this);
		}
	}

	public final ModuleAttributesContext moduleAttributes() throws RecognitionException {
		ModuleAttributesContext _localctx = new ModuleAttributesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_moduleAttributes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(459); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(453);
					attributeStmt();
					setState(455); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(454);
							endOfLine();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(457); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(461); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleDeclarationsContext extends ParserRuleContext {
		public List<ModuleDeclarationsElementContext> moduleDeclarationsElement() {
			return getRuleContexts(ModuleDeclarationsElementContext.class);
		}
		public ModuleDeclarationsElementContext moduleDeclarationsElement(int i) {
			return getRuleContext(ModuleDeclarationsElementContext.class,i);
		}
		public List<EndOfLineContext> endOfLine() {
			return getRuleContexts(EndOfLineContext.class);
		}
		public EndOfLineContext endOfLine(int i) {
			return getRuleContext(EndOfLineContext.class,i);
		}
		public ModuleDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterModuleDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitModuleDeclarations(this);
		}
	}

	public final ModuleDeclarationsContext moduleDeclarations() throws RecognitionException {
		ModuleDeclarationsContext _localctx = new ModuleDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_moduleDeclarations);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			moduleDeclarationsElement();
			setState(473);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(465); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(464);
							endOfLine();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(467); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(469);
					moduleDeclarationsElement();
					}
					} 
				}
				setState(475);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			setState(479);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(476);
					endOfLine();
					}
					} 
				}
				setState(481);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleOptionContext extends ParserRuleContext {
		public ModuleOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleOption; }
	 
		public ModuleOptionContext() { }
		public void copyFrom(ModuleOptionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OptionExplicitStmtContext extends ModuleOptionContext {
		public TerminalNode OPTION_EXPLICIT() { return getToken(VbaParser.OPTION_EXPLICIT, 0); }
		public OptionExplicitStmtContext(ModuleOptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterOptionExplicitStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitOptionExplicitStmt(this);
		}
	}
	public static class OptionBaseStmtContext extends ModuleOptionContext {
		public TerminalNode OPTION_BASE() { return getToken(VbaParser.OPTION_BASE, 0); }
		public TerminalNode WS() { return getToken(VbaParser.WS, 0); }
		public TerminalNode SHORTLITERAL() { return getToken(VbaParser.SHORTLITERAL, 0); }
		public OptionBaseStmtContext(ModuleOptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterOptionBaseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitOptionBaseStmt(this);
		}
	}
	public static class OptionPrivateModuleStmtContext extends ModuleOptionContext {
		public TerminalNode OPTION_PRIVATE_MODULE() { return getToken(VbaParser.OPTION_PRIVATE_MODULE, 0); }
		public OptionPrivateModuleStmtContext(ModuleOptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterOptionPrivateModuleStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitOptionPrivateModuleStmt(this);
		}
	}
	public static class OptionCompareStmtContext extends ModuleOptionContext {
		public TerminalNode OPTION_COMPARE() { return getToken(VbaParser.OPTION_COMPARE, 0); }
		public TerminalNode WS() { return getToken(VbaParser.WS, 0); }
		public TerminalNode BINARY() { return getToken(VbaParser.BINARY, 0); }
		public TerminalNode TEXT() { return getToken(VbaParser.TEXT, 0); }
		public TerminalNode DATABASE() { return getToken(VbaParser.DATABASE, 0); }
		public OptionCompareStmtContext(ModuleOptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterOptionCompareStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitOptionCompareStmt(this);
		}
	}

	public final ModuleOptionContext moduleOption() throws RecognitionException {
		ModuleOptionContext _localctx = new ModuleOptionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_moduleOption);
		int _la;
		try {
			setState(490);
			switch (_input.LA(1)) {
			case OPTION_BASE:
				_localctx = new OptionBaseStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(482);
				match(OPTION_BASE);
				setState(483);
				match(WS);
				setState(484);
				match(SHORTLITERAL);
				}
				break;
			case OPTION_COMPARE:
				_localctx = new OptionCompareStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(485);
				match(OPTION_COMPARE);
				setState(486);
				match(WS);
				setState(487);
				_la = _input.LA(1);
				if ( !(_la==BINARY || _la==DATABASE || _la==TEXT) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case OPTION_EXPLICIT:
				_localctx = new OptionExplicitStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(488);
				match(OPTION_EXPLICIT);
				}
				break;
			case OPTION_PRIVATE_MODULE:
				_localctx = new OptionPrivateModuleStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(489);
				match(OPTION_PRIVATE_MODULE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleDeclarationsElementContext extends ParserRuleContext {
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public DeclareStmtContext declareStmt() {
			return getRuleContext(DeclareStmtContext.class,0);
		}
		public EnumerationStmtContext enumerationStmt() {
			return getRuleContext(EnumerationStmtContext.class,0);
		}
		public EventStmtContext eventStmt() {
			return getRuleContext(EventStmtContext.class,0);
		}
		public ConstStmtContext constStmt() {
			return getRuleContext(ConstStmtContext.class,0);
		}
		public ImplementsStmtContext implementsStmt() {
			return getRuleContext(ImplementsStmtContext.class,0);
		}
		public VariableStmtContext variableStmt() {
			return getRuleContext(VariableStmtContext.class,0);
		}
		public ModuleOptionContext moduleOption() {
			return getRuleContext(ModuleOptionContext.class,0);
		}
		public TypeStmtContext typeStmt() {
			return getRuleContext(TypeStmtContext.class,0);
		}
		public AttributeStmtContext attributeStmt() {
			return getRuleContext(AttributeStmtContext.class,0);
		}
		public ModuleDeclarationsElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleDeclarationsElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterModuleDeclarationsElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitModuleDeclarationsElement(this);
		}
	}

	public final ModuleDeclarationsElementContext moduleDeclarationsElement() throws RecognitionException {
		ModuleDeclarationsElementContext _localctx = new ModuleDeclarationsElementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_moduleDeclarationsElement);
		try {
			setState(502);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(492);
				comment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(493);
				declareStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(494);
				enumerationStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(495);
				eventStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(496);
				constStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(497);
				implementsStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(498);
				variableStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(499);
				moduleOption();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(500);
				typeStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(501);
				attributeStmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MacroStmtContext extends ParserRuleContext {
		public MacroConstStmtContext macroConstStmt() {
			return getRuleContext(MacroConstStmtContext.class,0);
		}
		public MacroIfThenElseStmtContext macroIfThenElseStmt() {
			return getRuleContext(MacroIfThenElseStmtContext.class,0);
		}
		public MacroStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterMacroStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitMacroStmt(this);
		}
	}

	public final MacroStmtContext macroStmt() throws RecognitionException {
		MacroStmtContext _localctx = new MacroStmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_macroStmt);
		try {
			setState(506);
			switch (_input.LA(1)) {
			case MACRO_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(504);
				macroConstStmt();
				}
				break;
			case MACRO_IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(505);
				macroIfThenElseStmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleBodyContext extends ParserRuleContext {
		public List<ModuleBodyElementContext> moduleBodyElement() {
			return getRuleContexts(ModuleBodyElementContext.class);
		}
		public ModuleBodyElementContext moduleBodyElement(int i) {
			return getRuleContext(ModuleBodyElementContext.class,i);
		}
		public List<EndOfLineContext> endOfLine() {
			return getRuleContexts(EndOfLineContext.class);
		}
		public EndOfLineContext endOfLine(int i) {
			return getRuleContext(EndOfLineContext.class,i);
		}
		public ModuleBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterModuleBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitModuleBody(this);
		}
	}

	public final ModuleBodyContext moduleBody() throws RecognitionException {
		ModuleBodyContext _localctx = new ModuleBodyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_moduleBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			moduleBodyElement();
			setState(518);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(510); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(509);
						endOfLine();
						}
						}
						setState(512); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 224)) & ~0x3f) == 0 && ((1L << (_la - 224)) & ((1L << (NEWLINE - 224)) | (1L << (REMCOMMENT - 224)) | (1L << (COMMENT - 224)) | (1L << (WS - 224)))) != 0) );
					setState(514);
					moduleBodyElement();
					}
					} 
				}
				setState(520);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			setState(524);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(521);
					endOfLine();
					}
					} 
				}
				setState(526);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleBodyElementContext extends ParserRuleContext {
		public FunctionStmtContext functionStmt() {
			return getRuleContext(FunctionStmtContext.class,0);
		}
		public PropertyGetStmtContext propertyGetStmt() {
			return getRuleContext(PropertyGetStmtContext.class,0);
		}
		public PropertySetStmtContext propertySetStmt() {
			return getRuleContext(PropertySetStmtContext.class,0);
		}
		public PropertyLetStmtContext propertyLetStmt() {
			return getRuleContext(PropertyLetStmtContext.class,0);
		}
		public SubStmtContext subStmt() {
			return getRuleContext(SubStmtContext.class,0);
		}
		public RuleStmtContext ruleStmt() {
			return getRuleContext(RuleStmtContext.class,0);
		}
		public ModuleBodyElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleBodyElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterModuleBodyElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitModuleBodyElement(this);
		}
	}

	public final ModuleBodyElementContext moduleBodyElement() throws RecognitionException {
		ModuleBodyElementContext _localctx = new ModuleBodyElementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_moduleBodyElement);
		try {
			setState(533);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(527);
				functionStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(528);
				propertyGetStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(529);
				propertySetStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(530);
				propertyLetStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(531);
				subStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(532);
				ruleStmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeStmtContext extends ParserRuleContext {
		public TerminalNode ATTRIBUTE() { return getToken(VbaParser.ATTRIBUTE, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public ImplicitCallStmt_InStmtContext implicitCallStmt_InStmt() {
			return getRuleContext(ImplicitCallStmt_InStmtContext.class,0);
		}
		public TerminalNode EQ() { return getToken(VbaParser.EQ, 0); }
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public AttributeStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterAttributeStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitAttributeStmt(this);
		}
	}

	public final AttributeStmtContext attributeStmt() throws RecognitionException {
		AttributeStmtContext _localctx = new AttributeStmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_attributeStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			match(ATTRIBUTE);
			setState(536);
			match(WS);
			setState(537);
			implicitCallStmt_InStmt();
			setState(539);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(538);
				match(WS);
				}
			}

			setState(541);
			match(EQ);
			setState(543);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(542);
				match(WS);
				}
			}

			setState(545);
			literal();
			setState(556);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(547);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(546);
						match(WS);
						}
					}

					setState(549);
					match(T__0);
					setState(551);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(550);
						match(WS);
						}
					}

					setState(553);
					literal();
					}
					} 
				}
				setState(558);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<BlockStmtContext> blockStmt() {
			return getRuleContexts(BlockStmtContext.class);
		}
		public BlockStmtContext blockStmt(int i) {
			return getRuleContext(BlockStmtContext.class,i);
		}
		public List<EndOfStatementContext> endOfStatement() {
			return getRuleContexts(EndOfStatementContext.class);
		}
		public EndOfStatementContext endOfStatement(int i) {
			return getRuleContext(EndOfStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			blockStmt();
			setState(565);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(560);
					endOfStatement();
					setState(561);
					blockStmt();
					}
					} 
				}
				setState(567);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			}
			setState(568);
			endOfStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStmtContext extends ParserRuleContext {
		public LineLabelContext lineLabel() {
			return getRuleContext(LineLabelContext.class,0);
		}
		public MidStmtContext midStmt() {
			return getRuleContext(MidStmtContext.class,0);
		}
		public AppactivateStmtContext appactivateStmt() {
			return getRuleContext(AppactivateStmtContext.class,0);
		}
		public AttributeStmtContext attributeStmt() {
			return getRuleContext(AttributeStmtContext.class,0);
		}
		public BeepStmtContext beepStmt() {
			return getRuleContext(BeepStmtContext.class,0);
		}
		public ChdirStmtContext chdirStmt() {
			return getRuleContext(ChdirStmtContext.class,0);
		}
		public ChdriveStmtContext chdriveStmt() {
			return getRuleContext(ChdriveStmtContext.class,0);
		}
		public CloseStmtContext closeStmt() {
			return getRuleContext(CloseStmtContext.class,0);
		}
		public ConstStmtContext constStmt() {
			return getRuleContext(ConstStmtContext.class,0);
		}
		public DateStmtContext dateStmt() {
			return getRuleContext(DateStmtContext.class,0);
		}
		public DeleteSettingStmtContext deleteSettingStmt() {
			return getRuleContext(DeleteSettingStmtContext.class,0);
		}
		public DeftypeStmtContext deftypeStmt() {
			return getRuleContext(DeftypeStmtContext.class,0);
		}
		public DoLoopStmtContext doLoopStmt() {
			return getRuleContext(DoLoopStmtContext.class,0);
		}
		public EndStmtContext endStmt() {
			return getRuleContext(EndStmtContext.class,0);
		}
		public EraseStmtContext eraseStmt() {
			return getRuleContext(EraseStmtContext.class,0);
		}
		public ErrorStmtContext errorStmt() {
			return getRuleContext(ErrorStmtContext.class,0);
		}
		public ExitStmtContext exitStmt() {
			return getRuleContext(ExitStmtContext.class,0);
		}
		public ExplicitCallStmtContext explicitCallStmt() {
			return getRuleContext(ExplicitCallStmtContext.class,0);
		}
		public FilecopyStmtContext filecopyStmt() {
			return getRuleContext(FilecopyStmtContext.class,0);
		}
		public ForEachStmtContext forEachStmt() {
			return getRuleContext(ForEachStmtContext.class,0);
		}
		public ForNextStmtContext forNextStmt() {
			return getRuleContext(ForNextStmtContext.class,0);
		}
		public GetStmtContext getStmt() {
			return getRuleContext(GetStmtContext.class,0);
		}
		public GoSubStmtContext goSubStmt() {
			return getRuleContext(GoSubStmtContext.class,0);
		}
		public GoToStmtContext goToStmt() {
			return getRuleContext(GoToStmtContext.class,0);
		}
		public IfThenElseStmtContext ifThenElseStmt() {
			return getRuleContext(IfThenElseStmtContext.class,0);
		}
		public InputStmtContext inputStmt() {
			return getRuleContext(InputStmtContext.class,0);
		}
		public KillStmtContext killStmt() {
			return getRuleContext(KillStmtContext.class,0);
		}
		public LetStmtContext letStmt() {
			return getRuleContext(LetStmtContext.class,0);
		}
		public LineInputStmtContext lineInputStmt() {
			return getRuleContext(LineInputStmtContext.class,0);
		}
		public LoadStmtContext loadStmt() {
			return getRuleContext(LoadStmtContext.class,0);
		}
		public LockStmtContext lockStmt() {
			return getRuleContext(LockStmtContext.class,0);
		}
		public LsetStmtContext lsetStmt() {
			return getRuleContext(LsetStmtContext.class,0);
		}
		public MkdirStmtContext mkdirStmt() {
			return getRuleContext(MkdirStmtContext.class,0);
		}
		public NameStmtContext nameStmt() {
			return getRuleContext(NameStmtContext.class,0);
		}
		public OnErrorStmtContext onErrorStmt() {
			return getRuleContext(OnErrorStmtContext.class,0);
		}
		public OnGoToStmtContext onGoToStmt() {
			return getRuleContext(OnGoToStmtContext.class,0);
		}
		public OnGoSubStmtContext onGoSubStmt() {
			return getRuleContext(OnGoSubStmtContext.class,0);
		}
		public OpenStmtContext openStmt() {
			return getRuleContext(OpenStmtContext.class,0);
		}
		public PrintStmtContext printStmt() {
			return getRuleContext(PrintStmtContext.class,0);
		}
		public PutStmtContext putStmt() {
			return getRuleContext(PutStmtContext.class,0);
		}
		public RaiseEventStmtContext raiseEventStmt() {
			return getRuleContext(RaiseEventStmtContext.class,0);
		}
		public RedimStmtContext redimStmt() {
			return getRuleContext(RedimStmtContext.class,0);
		}
		public ResetStmtContext resetStmt() {
			return getRuleContext(ResetStmtContext.class,0);
		}
		public ResumeStmtContext resumeStmt() {
			return getRuleContext(ResumeStmtContext.class,0);
		}
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public RmdirStmtContext rmdirStmt() {
			return getRuleContext(RmdirStmtContext.class,0);
		}
		public RsetStmtContext rsetStmt() {
			return getRuleContext(RsetStmtContext.class,0);
		}
		public SavepictureStmtContext savepictureStmt() {
			return getRuleContext(SavepictureStmtContext.class,0);
		}
		public SaveSettingStmtContext saveSettingStmt() {
			return getRuleContext(SaveSettingStmtContext.class,0);
		}
		public SeekStmtContext seekStmt() {
			return getRuleContext(SeekStmtContext.class,0);
		}
		public SelectCaseStmtContext selectCaseStmt() {
			return getRuleContext(SelectCaseStmtContext.class,0);
		}
		public SendkeysStmtContext sendkeysStmt() {
			return getRuleContext(SendkeysStmtContext.class,0);
		}
		public SetattrStmtContext setattrStmt() {
			return getRuleContext(SetattrStmtContext.class,0);
		}
		public SetStmtContext setStmt() {
			return getRuleContext(SetStmtContext.class,0);
		}
		public StopStmtContext stopStmt() {
			return getRuleContext(StopStmtContext.class,0);
		}
		public TimeStmtContext timeStmt() {
			return getRuleContext(TimeStmtContext.class,0);
		}
		public UnloadStmtContext unloadStmt() {
			return getRuleContext(UnloadStmtContext.class,0);
		}
		public UnlockStmtContext unlockStmt() {
			return getRuleContext(UnlockStmtContext.class,0);
		}
		public VariableStmtContext variableStmt() {
			return getRuleContext(VariableStmtContext.class,0);
		}
		public WhileWendStmtContext whileWendStmt() {
			return getRuleContext(WhileWendStmtContext.class,0);
		}
		public WidthStmtContext widthStmt() {
			return getRuleContext(WidthStmtContext.class,0);
		}
		public WithStmtContext withStmt() {
			return getRuleContext(WithStmtContext.class,0);
		}
		public WriteStmtContext writeStmt() {
			return getRuleContext(WriteStmtContext.class,0);
		}
		public ImplicitCallStmt_InBlockContext implicitCallStmt_InBlock() {
			return getRuleContext(ImplicitCallStmt_InBlockContext.class,0);
		}
		public BlockStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterBlockStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitBlockStmt(this);
		}
	}

	public final BlockStmtContext blockStmt() throws RecognitionException {
		BlockStmtContext _localctx = new BlockStmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_blockStmt);
		try {
			setState(634);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(570);
				lineLabel();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(571);
				midStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(572);
				appactivateStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(573);
				attributeStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(574);
				beepStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(575);
				chdirStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(576);
				chdriveStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(577);
				closeStmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(578);
				constStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(579);
				dateStmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(580);
				deleteSettingStmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(581);
				deftypeStmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(582);
				doLoopStmt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(583);
				endStmt();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(584);
				eraseStmt();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(585);
				errorStmt();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(586);
				exitStmt();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(587);
				explicitCallStmt();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(588);
				filecopyStmt();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(589);
				forEachStmt();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(590);
				forNextStmt();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(591);
				getStmt();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(592);
				goSubStmt();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(593);
				goToStmt();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(594);
				ifThenElseStmt();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(595);
				inputStmt();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(596);
				killStmt();
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(597);
				letStmt();
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(598);
				lineInputStmt();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(599);
				loadStmt();
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(600);
				lockStmt();
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(601);
				lsetStmt();
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(602);
				mkdirStmt();
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(603);
				nameStmt();
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(604);
				onErrorStmt();
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(605);
				onGoToStmt();
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(606);
				onGoSubStmt();
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(607);
				openStmt();
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(608);
				printStmt();
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(609);
				putStmt();
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(610);
				raiseEventStmt();
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(611);
				redimStmt();
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(612);
				resetStmt();
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(613);
				resumeStmt();
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 45);
				{
				setState(614);
				returnStmt();
				}
				break;
			case 46:
				enterOuterAlt(_localctx, 46);
				{
				setState(615);
				rmdirStmt();
				}
				break;
			case 47:
				enterOuterAlt(_localctx, 47);
				{
				setState(616);
				rsetStmt();
				}
				break;
			case 48:
				enterOuterAlt(_localctx, 48);
				{
				setState(617);
				savepictureStmt();
				}
				break;
			case 49:
				enterOuterAlt(_localctx, 49);
				{
				setState(618);
				saveSettingStmt();
				}
				break;
			case 50:
				enterOuterAlt(_localctx, 50);
				{
				setState(619);
				seekStmt();
				}
				break;
			case 51:
				enterOuterAlt(_localctx, 51);
				{
				setState(620);
				selectCaseStmt();
				}
				break;
			case 52:
				enterOuterAlt(_localctx, 52);
				{
				setState(621);
				sendkeysStmt();
				}
				break;
			case 53:
				enterOuterAlt(_localctx, 53);
				{
				setState(622);
				setattrStmt();
				}
				break;
			case 54:
				enterOuterAlt(_localctx, 54);
				{
				setState(623);
				setStmt();
				}
				break;
			case 55:
				enterOuterAlt(_localctx, 55);
				{
				setState(624);
				stopStmt();
				}
				break;
			case 56:
				enterOuterAlt(_localctx, 56);
				{
				setState(625);
				timeStmt();
				}
				break;
			case 57:
				enterOuterAlt(_localctx, 57);
				{
				setState(626);
				unloadStmt();
				}
				break;
			case 58:
				enterOuterAlt(_localctx, 58);
				{
				setState(627);
				unlockStmt();
				}
				break;
			case 59:
				enterOuterAlt(_localctx, 59);
				{
				setState(628);
				variableStmt();
				}
				break;
			case 60:
				enterOuterAlt(_localctx, 60);
				{
				setState(629);
				whileWendStmt();
				}
				break;
			case 61:
				enterOuterAlt(_localctx, 61);
				{
				setState(630);
				widthStmt();
				}
				break;
			case 62:
				enterOuterAlt(_localctx, 62);
				{
				setState(631);
				withStmt();
				}
				break;
			case 63:
				enterOuterAlt(_localctx, 63);
				{
				setState(632);
				writeStmt();
				}
				break;
			case 64:
				enterOuterAlt(_localctx, 64);
				{
				setState(633);
				implicitCallStmt_InBlock();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EvalStmtContext extends ParserRuleContext {
		public AppactivateStmtContext appactivateStmt() {
			return getRuleContext(AppactivateStmtContext.class,0);
		}
		public BeepStmtContext beepStmt() {
			return getRuleContext(BeepStmtContext.class,0);
		}
		public ChdirStmtContext chdirStmt() {
			return getRuleContext(ChdirStmtContext.class,0);
		}
		public ChdriveStmtContext chdriveStmt() {
			return getRuleContext(ChdriveStmtContext.class,0);
		}
		public CloseStmtContext closeStmt() {
			return getRuleContext(CloseStmtContext.class,0);
		}
		public DateStmtContext dateStmt() {
			return getRuleContext(DateStmtContext.class,0);
		}
		public DeleteSettingStmtContext deleteSettingStmt() {
			return getRuleContext(DeleteSettingStmtContext.class,0);
		}
		public DoLoopStmtContext doLoopStmt() {
			return getRuleContext(DoLoopStmtContext.class,0);
		}
		public EndStmtContext endStmt() {
			return getRuleContext(EndStmtContext.class,0);
		}
		public EraseStmtContext eraseStmt() {
			return getRuleContext(EraseStmtContext.class,0);
		}
		public ExplicitCallStmtContext explicitCallStmt() {
			return getRuleContext(ExplicitCallStmtContext.class,0);
		}
		public FilecopyStmtContext filecopyStmt() {
			return getRuleContext(FilecopyStmtContext.class,0);
		}
		public ForEachStmtContext forEachStmt() {
			return getRuleContext(ForEachStmtContext.class,0);
		}
		public ForNextStmtContext forNextStmt() {
			return getRuleContext(ForNextStmtContext.class,0);
		}
		public GetStmtContext getStmt() {
			return getRuleContext(GetStmtContext.class,0);
		}
		public IfThenElseStmtContext ifThenElseStmt() {
			return getRuleContext(IfThenElseStmtContext.class,0);
		}
		public InputStmtContext inputStmt() {
			return getRuleContext(InputStmtContext.class,0);
		}
		public KillStmtContext killStmt() {
			return getRuleContext(KillStmtContext.class,0);
		}
		public LetStmtContext letStmt() {
			return getRuleContext(LetStmtContext.class,0);
		}
		public LineInputStmtContext lineInputStmt() {
			return getRuleContext(LineInputStmtContext.class,0);
		}
		public LoadStmtContext loadStmt() {
			return getRuleContext(LoadStmtContext.class,0);
		}
		public LockStmtContext lockStmt() {
			return getRuleContext(LockStmtContext.class,0);
		}
		public LsetStmtContext lsetStmt() {
			return getRuleContext(LsetStmtContext.class,0);
		}
		public MidStmtContext midStmt() {
			return getRuleContext(MidStmtContext.class,0);
		}
		public MkdirStmtContext mkdirStmt() {
			return getRuleContext(MkdirStmtContext.class,0);
		}
		public NameStmtContext nameStmt() {
			return getRuleContext(NameStmtContext.class,0);
		}
		public OpenStmtContext openStmt() {
			return getRuleContext(OpenStmtContext.class,0);
		}
		public PrintStmtContext printStmt() {
			return getRuleContext(PrintStmtContext.class,0);
		}
		public PutStmtContext putStmt() {
			return getRuleContext(PutStmtContext.class,0);
		}
		public RaiseEventStmtContext raiseEventStmt() {
			return getRuleContext(RaiseEventStmtContext.class,0);
		}
		public RedimStmtContext redimStmt() {
			return getRuleContext(RedimStmtContext.class,0);
		}
		public ResetStmtContext resetStmt() {
			return getRuleContext(ResetStmtContext.class,0);
		}
		public RmdirStmtContext rmdirStmt() {
			return getRuleContext(RmdirStmtContext.class,0);
		}
		public RsetStmtContext rsetStmt() {
			return getRuleContext(RsetStmtContext.class,0);
		}
		public SavepictureStmtContext savepictureStmt() {
			return getRuleContext(SavepictureStmtContext.class,0);
		}
		public SaveSettingStmtContext saveSettingStmt() {
			return getRuleContext(SaveSettingStmtContext.class,0);
		}
		public SeekStmtContext seekStmt() {
			return getRuleContext(SeekStmtContext.class,0);
		}
		public SelectCaseStmtContext selectCaseStmt() {
			return getRuleContext(SelectCaseStmtContext.class,0);
		}
		public SendkeysStmtContext sendkeysStmt() {
			return getRuleContext(SendkeysStmtContext.class,0);
		}
		public SetattrStmtContext setattrStmt() {
			return getRuleContext(SetattrStmtContext.class,0);
		}
		public SetStmtContext setStmt() {
			return getRuleContext(SetStmtContext.class,0);
		}
		public TimeStmtContext timeStmt() {
			return getRuleContext(TimeStmtContext.class,0);
		}
		public UnloadStmtContext unloadStmt() {
			return getRuleContext(UnloadStmtContext.class,0);
		}
		public UnlockStmtContext unlockStmt() {
			return getRuleContext(UnlockStmtContext.class,0);
		}
		public WhileWendStmtContext whileWendStmt() {
			return getRuleContext(WhileWendStmtContext.class,0);
		}
		public WidthStmtContext widthStmt() {
			return getRuleContext(WidthStmtContext.class,0);
		}
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public ImplicitCallStmt_InBlockContext implicitCallStmt_InBlock() {
			return getRuleContext(ImplicitCallStmt_InBlockContext.class,0);
		}
		public EvalStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_evalStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterEvalStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitEvalStmt(this);
		}
	}

	public final EvalStmtContext evalStmt() throws RecognitionException {
		EvalStmtContext _localctx = new EvalStmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_evalStmt);
		try {
			setState(685);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(637);
				appactivateStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(638);
				beepStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(639);
				chdirStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(640);
				chdriveStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(641);
				closeStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(642);
				dateStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(643);
				deleteSettingStmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(644);
				doLoopStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(645);
				endStmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(646);
				eraseStmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(647);
				explicitCallStmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(648);
				filecopyStmt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(649);
				forEachStmt();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(650);
				forNextStmt();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(651);
				getStmt();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(652);
				ifThenElseStmt();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(653);
				inputStmt();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(654);
				killStmt();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(655);
				letStmt();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(656);
				lineInputStmt();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(657);
				loadStmt();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(658);
				lockStmt();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(659);
				lsetStmt();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(660);
				midStmt();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(661);
				mkdirStmt();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(662);
				nameStmt();
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(663);
				openStmt();
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(664);
				printStmt();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(665);
				putStmt();
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(666);
				raiseEventStmt();
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(667);
				redimStmt();
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(668);
				resetStmt();
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(669);
				rmdirStmt();
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(670);
				rsetStmt();
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(671);
				savepictureStmt();
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(672);
				saveSettingStmt();
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(673);
				seekStmt();
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(674);
				selectCaseStmt();
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(675);
				sendkeysStmt();
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(676);
				setattrStmt();
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(677);
				setStmt();
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(678);
				timeStmt();
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(679);
				unloadStmt();
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 45);
				{
				setState(680);
				unlockStmt();
				}
				break;
			case 46:
				enterOuterAlt(_localctx, 46);
				{
				setState(681);
				whileWendStmt();
				}
				break;
			case 47:
				enterOuterAlt(_localctx, 47);
				{
				setState(682);
				widthStmt();
				}
				break;
			case 48:
				enterOuterAlt(_localctx, 48);
				{
				setState(683);
				valueStmt(0);
				}
				break;
			case 49:
				enterOuterAlt(_localctx, 49);
				{
				setState(684);
				implicitCallStmt_InBlock();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AppactivateStmtContext extends ParserRuleContext {
		public TerminalNode APPACTIVATE() { return getToken(VbaParser.APPACTIVATE, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public AppactivateStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_appactivateStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterAppactivateStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitAppactivateStmt(this);
		}
	}

	public final AppactivateStmtContext appactivateStmt() throws RecognitionException {
		AppactivateStmtContext _localctx = new AppactivateStmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_appactivateStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
			match(APPACTIVATE);
			setState(688);
			match(WS);
			setState(689);
			valueStmt(0);
			setState(698);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(691);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(690);
					match(WS);
					}
				}

				setState(693);
				match(T__0);
				setState(695);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(694);
					match(WS);
					}
					break;
				}
				setState(697);
				valueStmt(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BeepStmtContext extends ParserRuleContext {
		public TerminalNode BEEP() { return getToken(VbaParser.BEEP, 0); }
		public BeepStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beepStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterBeepStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitBeepStmt(this);
		}
	}

	public final BeepStmtContext beepStmt() throws RecognitionException {
		BeepStmtContext _localctx = new BeepStmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_beepStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			match(BEEP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChdirStmtContext extends ParserRuleContext {
		public TerminalNode CHDIR() { return getToken(VbaParser.CHDIR, 0); }
		public TerminalNode WS() { return getToken(VbaParser.WS, 0); }
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public ChdirStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chdirStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterChdirStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitChdirStmt(this);
		}
	}

	public final ChdirStmtContext chdirStmt() throws RecognitionException {
		ChdirStmtContext _localctx = new ChdirStmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_chdirStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			match(CHDIR);
			setState(703);
			match(WS);
			setState(704);
			valueStmt(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChdriveStmtContext extends ParserRuleContext {
		public TerminalNode CHDRIVE() { return getToken(VbaParser.CHDRIVE, 0); }
		public TerminalNode WS() { return getToken(VbaParser.WS, 0); }
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public ChdriveStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chdriveStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterChdriveStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitChdriveStmt(this);
		}
	}

	public final ChdriveStmtContext chdriveStmt() throws RecognitionException {
		ChdriveStmtContext _localctx = new ChdriveStmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_chdriveStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			match(CHDRIVE);
			setState(707);
			match(WS);
			setState(708);
			valueStmt(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CloseStmtContext extends ParserRuleContext {
		public TerminalNode CLOSE() { return getToken(VbaParser.CLOSE, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public List<FileNumberContext> fileNumber() {
			return getRuleContexts(FileNumberContext.class);
		}
		public FileNumberContext fileNumber(int i) {
			return getRuleContext(FileNumberContext.class,i);
		}
		public CloseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closeStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterCloseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitCloseStmt(this);
		}
	}

	public final CloseStmtContext closeStmt() throws RecognitionException {
		CloseStmtContext _localctx = new CloseStmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_closeStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(710);
			match(CLOSE);
			setState(726);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(711);
				match(WS);
				setState(712);
				fileNumber();
				setState(723);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(714);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(713);
							match(WS);
							}
						}

						setState(716);
						match(T__0);
						setState(718);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
						case 1:
							{
							setState(717);
							match(WS);
							}
							break;
						}
						setState(720);
						fileNumber();
						}
						} 
					}
					setState(725);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstStmtContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(VbaParser.CONST, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public List<ConstSubStmtContext> constSubStmt() {
			return getRuleContexts(ConstSubStmtContext.class);
		}
		public ConstSubStmtContext constSubStmt(int i) {
			return getRuleContext(ConstSubStmtContext.class,i);
		}
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public ConstStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterConstStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitConstStmt(this);
		}
	}

	public final ConstStmtContext constStmt() throws RecognitionException {
		ConstStmtContext _localctx = new ConstStmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_constStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			_la = _input.LA(1);
			if (((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (FRIEND - 79)) | (1L << (GLOBAL - 79)) | (1L << (PRIVATE - 79)))) != 0) || _la==PUBLIC) {
				{
				setState(728);
				visibility();
				setState(729);
				match(WS);
				}
			}

			setState(733);
			match(CONST);
			setState(734);
			match(WS);
			setState(735);
			constSubStmt();
			setState(746);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(737);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(736);
						match(WS);
						}
					}

					setState(739);
					match(T__0);
					setState(741);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(740);
						match(WS);
						}
					}

					setState(743);
					constSubStmt();
					}
					} 
				}
				setState(748);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstSubStmtContext extends ParserRuleContext {
		public AmbiguousIdentifierContext ambiguousIdentifier() {
			return getRuleContext(AmbiguousIdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(VbaParser.EQ, 0); }
		public ConstValueExprContext constValueExpr() {
			return getRuleContext(ConstValueExprContext.class,0);
		}
		public TypeHintContext typeHint() {
			return getRuleContext(TypeHintContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public AsTypeClauseContext asTypeClause() {
			return getRuleContext(AsTypeClauseContext.class,0);
		}
		public ConstSubStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constSubStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterConstSubStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitConstSubStmt(this);
		}
	}

	public final ConstSubStmtContext constSubStmt() throws RecognitionException {
		ConstSubStmtContext _localctx = new ConstSubStmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_constSubStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
			ambiguousIdentifier();
			setState(751);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0) || _la==AMPERSAND) {
				{
				setState(750);
				typeHint();
				}
			}

			setState(755);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(753);
				match(WS);
				setState(754);
				asTypeClause();
				}
				break;
			}
			setState(758);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(757);
				match(WS);
				}
			}

			setState(760);
			match(EQ);
			setState(762);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(761);
				match(WS);
				}
			}

			setState(764);
			constValueExpr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DateStmtContext extends ParserRuleContext {
		public TerminalNode DATE() { return getToken(VbaParser.DATE, 0); }
		public TerminalNode EQ() { return getToken(VbaParser.EQ, 0); }
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public DateStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterDateStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitDateStmt(this);
		}
	}

	public final DateStmtContext dateStmt() throws RecognitionException {
		DateStmtContext _localctx = new DateStmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_dateStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(766);
			match(DATE);
			setState(768);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(767);
				match(WS);
				}
			}

			setState(770);
			match(EQ);
			setState(772);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(771);
				match(WS);
				}
				break;
			}
			setState(774);
			valueStmt(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclareStmtContext extends ParserRuleContext {
		public TerminalNode DECLARE() { return getToken(VbaParser.DECLARE, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public AmbiguousIdentifierContext ambiguousIdentifier() {
			return getRuleContext(AmbiguousIdentifierContext.class,0);
		}
		public TerminalNode LIB() { return getToken(VbaParser.LIB, 0); }
		public List<TerminalNode> STRINGLITERAL() { return getTokens(VbaParser.STRINGLITERAL); }
		public TerminalNode STRINGLITERAL(int i) {
			return getToken(VbaParser.STRINGLITERAL, i);
		}
		public TerminalNode SUB() { return getToken(VbaParser.SUB, 0); }
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public TerminalNode PTRSAFE() { return getToken(VbaParser.PTRSAFE, 0); }
		public List<TypeHintContext> typeHint() {
			return getRuleContexts(TypeHintContext.class);
		}
		public TypeHintContext typeHint(int i) {
			return getRuleContext(TypeHintContext.class,i);
		}
		public TerminalNode ALIAS() { return getToken(VbaParser.ALIAS, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public AsTypeClauseContext asTypeClause() {
			return getRuleContext(AsTypeClauseContext.class,0);
		}
		public TerminalNode FUNCTION() { return getToken(VbaParser.FUNCTION, 0); }
		public DeclareStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterDeclareStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitDeclareStmt(this);
		}
	}

	public final DeclareStmtContext declareStmt() throws RecognitionException {
		DeclareStmtContext _localctx = new DeclareStmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_declareStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(779);
			_la = _input.LA(1);
			if (((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (FRIEND - 79)) | (1L << (GLOBAL - 79)) | (1L << (PRIVATE - 79)))) != 0) || _la==PUBLIC) {
				{
				setState(776);
				visibility();
				setState(777);
				match(WS);
				}
			}

			setState(781);
			match(DECLARE);
			setState(782);
			match(WS);
			setState(785);
			_la = _input.LA(1);
			if (_la==PTRSAFE) {
				{
				setState(783);
				match(PTRSAFE);
				setState(784);
				match(WS);
				}
			}

			setState(792);
			switch (_input.LA(1)) {
			case FUNCTION:
				{
				{
				setState(787);
				match(FUNCTION);
				setState(789);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0) || _la==AMPERSAND) {
					{
					setState(788);
					typeHint();
					}
				}

				}
				}
				break;
			case SUB:
				{
				setState(791);
				match(SUB);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(794);
			match(WS);
			setState(795);
			ambiguousIdentifier();
			setState(797);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0) || _la==AMPERSAND) {
				{
				setState(796);
				typeHint();
				}
			}

			setState(799);
			match(WS);
			setState(800);
			match(LIB);
			setState(801);
			match(WS);
			setState(802);
			match(STRINGLITERAL);
			setState(807);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(803);
				match(WS);
				setState(804);
				match(ALIAS);
				setState(805);
				match(WS);
				setState(806);
				match(STRINGLITERAL);
				}
				break;
			}
			setState(813);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(810);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(809);
					match(WS);
					}
				}

				setState(812);
				argList();
				}
				break;
			}
			setState(817);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(815);
				match(WS);
				setState(816);
				asTypeClause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeftypeStmtContext extends ParserRuleContext {
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public List<LetterrangeContext> letterrange() {
			return getRuleContexts(LetterrangeContext.class);
		}
		public LetterrangeContext letterrange(int i) {
			return getRuleContext(LetterrangeContext.class,i);
		}
		public TerminalNode DEFBOOL() { return getToken(VbaParser.DEFBOOL, 0); }
		public TerminalNode DEFBYTE() { return getToken(VbaParser.DEFBYTE, 0); }
		public TerminalNode DEFINT() { return getToken(VbaParser.DEFINT, 0); }
		public TerminalNode DEFLNG() { return getToken(VbaParser.DEFLNG, 0); }
		public TerminalNode DEFCUR() { return getToken(VbaParser.DEFCUR, 0); }
		public TerminalNode DEFSNG() { return getToken(VbaParser.DEFSNG, 0); }
		public TerminalNode DEFDBL() { return getToken(VbaParser.DEFDBL, 0); }
		public TerminalNode DEFDEC() { return getToken(VbaParser.DEFDEC, 0); }
		public TerminalNode DEFDATE() { return getToken(VbaParser.DEFDATE, 0); }
		public TerminalNode DEFSTR() { return getToken(VbaParser.DEFSTR, 0); }
		public TerminalNode DEFOBJ() { return getToken(VbaParser.DEFOBJ, 0); }
		public TerminalNode DEFVAR() { return getToken(VbaParser.DEFVAR, 0); }
		public DeftypeStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deftypeStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterDeftypeStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitDeftypeStmt(this);
		}
	}

	public final DeftypeStmtContext deftypeStmt() throws RecognitionException {
		DeftypeStmtContext _localctx = new DeftypeStmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_deftypeStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(819);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(820);
			match(WS);
			setState(821);
			letterrange();
			setState(832);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(823);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(822);
						match(WS);
						}
					}

					setState(825);
					match(T__0);
					setState(827);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(826);
						match(WS);
						}
					}

					setState(829);
					letterrange();
					}
					} 
				}
				setState(834);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeleteSettingStmtContext extends ParserRuleContext {
		public TerminalNode DELETESETTING() { return getToken(VbaParser.DELETESETTING, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public DeleteSettingStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteSettingStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterDeleteSettingStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitDeleteSettingStmt(this);
		}
	}

	public final DeleteSettingStmtContext deleteSettingStmt() throws RecognitionException {
		DeleteSettingStmtContext _localctx = new DeleteSettingStmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_deleteSettingStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(835);
			match(DELETESETTING);
			setState(836);
			match(WS);
			setState(837);
			valueStmt(0);
			setState(839);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(838);
				match(WS);
				}
			}

			setState(841);
			match(T__0);
			setState(843);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(842);
				match(WS);
				}
				break;
			}
			setState(845);
			valueStmt(0);
			setState(854);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(847);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(846);
					match(WS);
					}
				}

				setState(849);
				match(T__0);
				setState(851);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(850);
					match(WS);
					}
					break;
				}
				setState(853);
				valueStmt(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoLoopStmtContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(VbaParser.DO, 0); }
		public EndOfStatementContext endOfStatement() {
			return getRuleContext(EndOfStatementContext.class,0);
		}
		public TerminalNode LOOP() { return getToken(VbaParser.LOOP, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(VbaParser.WHILE, 0); }
		public TerminalNode UNTIL() { return getToken(VbaParser.UNTIL, 0); }
		public DoLoopStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doLoopStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterDoLoopStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitDoLoopStmt(this);
		}
	}

	public final DoLoopStmtContext doLoopStmt() throws RecognitionException {
		DoLoopStmtContext _localctx = new DoLoopStmtContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_doLoopStmt);
		int _la;
		try {
			setState(883);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(856);
				match(DO);
				setState(857);
				endOfStatement();
				setState(859);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
				case 1:
					{
					setState(858);
					block();
					}
					break;
				}
				setState(861);
				match(LOOP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(863);
				match(DO);
				setState(864);
				match(WS);
				setState(865);
				_la = _input.LA(1);
				if ( !(_la==UNTIL || _la==WHILE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(866);
				match(WS);
				setState(867);
				valueStmt(0);
				setState(868);
				endOfStatement();
				setState(870);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(869);
					block();
					}
					break;
				}
				setState(872);
				match(LOOP);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(874);
				match(DO);
				setState(875);
				endOfStatement();
				setState(876);
				block();
				setState(877);
				match(LOOP);
				setState(878);
				match(WS);
				setState(879);
				_la = _input.LA(1);
				if ( !(_la==UNTIL || _la==WHILE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(880);
				match(WS);
				setState(881);
				valueStmt(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndStmtContext extends ParserRuleContext {
		public TerminalNode END() { return getToken(VbaParser.END, 0); }
		public EndStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterEndStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitEndStmt(this);
		}
	}

	public final EndStmtContext endStmt() throws RecognitionException {
		EndStmtContext _localctx = new EndStmtContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_endStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(885);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumerationStmtContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(VbaParser.ENUM, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public AmbiguousIdentifierContext ambiguousIdentifier() {
			return getRuleContext(AmbiguousIdentifierContext.class,0);
		}
		public EndOfStatementContext endOfStatement() {
			return getRuleContext(EndOfStatementContext.class,0);
		}
		public TerminalNode END_ENUM() { return getToken(VbaParser.END_ENUM, 0); }
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public List<EnumerationStmt_ConstantContext> enumerationStmt_Constant() {
			return getRuleContexts(EnumerationStmt_ConstantContext.class);
		}
		public EnumerationStmt_ConstantContext enumerationStmt_Constant(int i) {
			return getRuleContext(EnumerationStmt_ConstantContext.class,i);
		}
		public EnumerationStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerationStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterEnumerationStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitEnumerationStmt(this);
		}
	}

	public final EnumerationStmtContext enumerationStmt() throws RecognitionException {
		EnumerationStmtContext _localctx = new EnumerationStmtContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_enumerationStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(890);
			_la = _input.LA(1);
			if (((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (FRIEND - 79)) | (1L << (GLOBAL - 79)) | (1L << (PRIVATE - 79)))) != 0) || _la==PUBLIC) {
				{
				setState(887);
				visibility();
				setState(888);
				match(WS);
				}
			}

			setState(892);
			match(ENUM);
			setState(893);
			match(WS);
			setState(894);
			ambiguousIdentifier();
			setState(895);
			endOfStatement();
			setState(899);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (ENUM - 66)) | (1L << (EQV - 66)) | (1L << (ERASE - 66)) | (1L << (ERROR - 66)) | (1L << (EVENT - 66)) | (1L << (FALSE - 66)) | (1L << (FILECOPY - 66)) | (1L << (FRIEND - 66)) | (1L << (FOR - 66)) | (1L << (FUNCTION - 66)) | (1L << (GET - 66)) | (1L << (GLOBAL - 66)) | (1L << (GOSUB - 66)) | (1L << (GOTO - 66)) | (1L << (IF - 66)) | (1L << (IMP - 66)) | (1L << (IMPLEMENTS - 66)) | (1L << (IN - 66)) | (1L << (INPUT - 66)) | (1L << (IS - 66)) | (1L << (INTEGER - 66)) | (1L << (KILL - 66)) | (1L << (LOAD - 66)) | (1L << (LOCK - 66)) | (1L << (LONG - 66)) | (1L << (LOOP - 66)) | (1L << (LEN - 66)) | (1L << (LET - 66)) | (1L << (LIB - 66)) | (1L << (LIKE - 66)) | (1L << (LSET - 66)) | (1L << (ME - 66)) | (1L << (MID - 66)) | (1L << (MKDIR - 66)) | (1L << (MOD - 66)) | (1L << (NAME - 66)) | (1L << (NEXT - 66)) | (1L << (NEW - 66)) | (1L << (NOT - 66)) | (1L << (NOTHING - 66)) | (1L << (NULL - 66)) | (1L << (EMPTY - 66)) | (1L << (ON - 66)) | (1L << (OPEN - 66)) | (1L << (OPTIONAL - 66)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (OR - 133)) | (1L << (OUTPUT - 133)) | (1L << (PARAMARRAY - 133)) | (1L << (PRESERVE - 133)) | (1L << (PRINT - 133)) | (1L << (PRIVATE - 133)) | (1L << (PUBLIC - 133)) | (1L << (PUT - 133)) | (1L << (RANDOM - 133)) | (1L << (RANDOMIZE - 133)) | (1L << (RAISEEVENT - 133)) | (1L << (READ - 133)) | (1L << (REDIM - 133)) | (1L << (REM - 133)) | (1L << (RESET - 133)) | (1L << (RESUME - 133)) | (1L << (RETURN - 133)) | (1L << (RMDIR - 133)) | (1L << (RSET - 133)) | (1L << (SAVEPICTURE - 133)) | (1L << (SAVESETTING - 133)) | (1L << (SEEK - 133)) | (1L << (SELECT - 133)) | (1L << (SENDKEYS - 133)) | (1L << (SET - 133)) | (1L << (SETATTR - 133)) | (1L << (SHARED - 133)) | (1L << (SINGLE - 133)) | (1L << (SPC - 133)) | (1L << (STATIC - 133)) | (1L << (STEP - 133)) | (1L << (STRING - 133)) | (1L << (SUB - 133)) | (1L << (TAB - 133)) | (1L << (TEXT - 133)) | (1L << (THEN - 133)) | (1L << (TIME - 133)) | (1L << (TO - 133)) | (1L << (TRUE - 133)) | (1L << (TYPE - 133)) | (1L << (TYPEOF - 133)) | (1L << (UNLOAD - 133)) | (1L << (UNLOCK - 133)) | (1L << (UNTIL - 133)) | (1L << (VARIANT - 133)) | (1L << (VERSION - 133)) | (1L << (WEND - 133)) | (1L << (WHILE - 133)) | (1L << (WIDTH - 133)) | (1L << (WITH - 133)) | (1L << (WITHEVENTS - 133)) | (1L << (WRITE - 133)) | (1L << (XOR - 133)))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(896);
				enumerationStmt_Constant();
				}
				}
				setState(901);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(902);
			match(END_ENUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumerationStmt_ConstantContext extends ParserRuleContext {
		public AmbiguousIdentifierContext ambiguousIdentifier() {
			return getRuleContext(AmbiguousIdentifierContext.class,0);
		}
		public EndOfStatementContext endOfStatement() {
			return getRuleContext(EndOfStatementContext.class,0);
		}
		public TerminalNode EQ() { return getToken(VbaParser.EQ, 0); }
		public ConstValueExprContext constValueExpr() {
			return getRuleContext(ConstValueExprContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public EnumerationStmt_ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerationStmt_Constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterEnumerationStmt_Constant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitEnumerationStmt_Constant(this);
		}
	}

	public final EnumerationStmt_ConstantContext enumerationStmt_Constant() throws RecognitionException {
		EnumerationStmt_ConstantContext _localctx = new EnumerationStmt_ConstantContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_enumerationStmt_Constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(904);
			ambiguousIdentifier();
			setState(913);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(906);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(905);
					match(WS);
					}
				}

				setState(908);
				match(EQ);
				setState(910);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(909);
					match(WS);
					}
				}

				setState(912);
				constValueExpr(0);
				}
				break;
			}
			setState(915);
			endOfStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EraseStmtContext extends ParserRuleContext {
		public TerminalNode ERASE() { return getToken(VbaParser.ERASE, 0); }
		public TerminalNode WS() { return getToken(VbaParser.WS, 0); }
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public EraseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eraseStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterEraseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitEraseStmt(this);
		}
	}

	public final EraseStmtContext eraseStmt() throws RecognitionException {
		EraseStmtContext _localctx = new EraseStmtContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_eraseStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(917);
			match(ERASE);
			setState(918);
			match(WS);
			setState(919);
			valueStmt(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorStmtContext extends ParserRuleContext {
		public TerminalNode ERROR() { return getToken(VbaParser.ERROR, 0); }
		public TerminalNode WS() { return getToken(VbaParser.WS, 0); }
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public ErrorStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterErrorStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitErrorStmt(this);
		}
	}

	public final ErrorStmtContext errorStmt() throws RecognitionException {
		ErrorStmtContext _localctx = new ErrorStmtContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_errorStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(921);
			match(ERROR);
			setState(922);
			match(WS);
			setState(923);
			valueStmt(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EventStmtContext extends ParserRuleContext {
		public TerminalNode EVENT() { return getToken(VbaParser.EVENT, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public AmbiguousIdentifierContext ambiguousIdentifier() {
			return getRuleContext(AmbiguousIdentifierContext.class,0);
		}
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public EventStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterEventStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitEventStmt(this);
		}
	}

	public final EventStmtContext eventStmt() throws RecognitionException {
		EventStmtContext _localctx = new EventStmtContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_eventStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(928);
			_la = _input.LA(1);
			if (((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (FRIEND - 79)) | (1L << (GLOBAL - 79)) | (1L << (PRIVATE - 79)))) != 0) || _la==PUBLIC) {
				{
				setState(925);
				visibility();
				setState(926);
				match(WS);
				}
			}

			setState(930);
			match(EVENT);
			setState(931);
			match(WS);
			setState(932);
			ambiguousIdentifier();
			setState(934);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(933);
				match(WS);
				}
			}

			setState(936);
			argList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExitStmtContext extends ParserRuleContext {
		public TerminalNode EXIT_DO() { return getToken(VbaParser.EXIT_DO, 0); }
		public TerminalNode EXIT_FOR() { return getToken(VbaParser.EXIT_FOR, 0); }
		public TerminalNode EXIT_FUNCTION() { return getToken(VbaParser.EXIT_FUNCTION, 0); }
		public TerminalNode EXIT_PROPERTY() { return getToken(VbaParser.EXIT_PROPERTY, 0); }
		public TerminalNode EXIT_SUB() { return getToken(VbaParser.EXIT_SUB, 0); }
		public TerminalNode EXIT_RULE() { return getToken(VbaParser.EXIT_RULE, 0); }
		public ExitStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exitStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterExitStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitExitStmt(this);
		}
	}

	public final ExitStmtContext exitStmt() throws RecognitionException {
		ExitStmtContext _localctx = new ExitStmtContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_exitStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(938);
			_la = _input.LA(1);
			if ( !(((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (EXIT_DO - 71)) | (1L << (EXIT_FOR - 71)) | (1L << (EXIT_FUNCTION - 71)) | (1L << (EXIT_PROPERTY - 71)) | (1L << (EXIT_SUB - 71)) | (1L << (EXIT_RULE - 71)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FilecopyStmtContext extends ParserRuleContext {
		public TerminalNode FILECOPY() { return getToken(VbaParser.FILECOPY, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public FilecopyStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filecopyStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterFilecopyStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitFilecopyStmt(this);
		}
	}

	public final FilecopyStmtContext filecopyStmt() throws RecognitionException {
		FilecopyStmtContext _localctx = new FilecopyStmtContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_filecopyStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(940);
			match(FILECOPY);
			setState(941);
			match(WS);
			setState(942);
			valueStmt(0);
			setState(944);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(943);
				match(WS);
				}
			}

			setState(946);
			match(T__0);
			setState(948);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(947);
				match(WS);
				}
				break;
			}
			setState(950);
			valueStmt(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForEachStmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(VbaParser.FOR, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public TerminalNode EACH() { return getToken(VbaParser.EACH, 0); }
		public List<AmbiguousIdentifierContext> ambiguousIdentifier() {
			return getRuleContexts(AmbiguousIdentifierContext.class);
		}
		public AmbiguousIdentifierContext ambiguousIdentifier(int i) {
			return getRuleContext(AmbiguousIdentifierContext.class,i);
		}
		public TerminalNode IN() { return getToken(VbaParser.IN, 0); }
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public EndOfStatementContext endOfStatement() {
			return getRuleContext(EndOfStatementContext.class,0);
		}
		public TerminalNode NEXT() { return getToken(VbaParser.NEXT, 0); }
		public TypeHintContext typeHint() {
			return getRuleContext(TypeHintContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForEachStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forEachStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterForEachStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitForEachStmt(this);
		}
	}

	public final ForEachStmtContext forEachStmt() throws RecognitionException {
		ForEachStmtContext _localctx = new ForEachStmtContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_forEachStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(952);
			match(FOR);
			setState(953);
			match(WS);
			setState(954);
			match(EACH);
			setState(955);
			match(WS);
			setState(956);
			ambiguousIdentifier();
			setState(958);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0) || _la==AMPERSAND) {
				{
				setState(957);
				typeHint();
				}
			}

			setState(960);
			match(WS);
			setState(961);
			match(IN);
			setState(962);
			match(WS);
			setState(963);
			valueStmt(0);
			setState(964);
			endOfStatement();
			setState(966);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				{
				setState(965);
				block();
				}
				break;
			}
			setState(968);
			match(NEXT);
			setState(971);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				{
				setState(969);
				match(WS);
				setState(970);
				ambiguousIdentifier();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForNextStmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(VbaParser.FOR, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public List<AmbiguousIdentifierContext> ambiguousIdentifier() {
			return getRuleContexts(AmbiguousIdentifierContext.class);
		}
		public AmbiguousIdentifierContext ambiguousIdentifier(int i) {
			return getRuleContext(AmbiguousIdentifierContext.class,i);
		}
		public TerminalNode EQ() { return getToken(VbaParser.EQ, 0); }
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public TerminalNode TO() { return getToken(VbaParser.TO, 0); }
		public EndOfStatementContext endOfStatement() {
			return getRuleContext(EndOfStatementContext.class,0);
		}
		public TerminalNode NEXT() { return getToken(VbaParser.NEXT, 0); }
		public TypeHintContext typeHint() {
			return getRuleContext(TypeHintContext.class,0);
		}
		public AsTypeClauseContext asTypeClause() {
			return getRuleContext(AsTypeClauseContext.class,0);
		}
		public TerminalNode STEP() { return getToken(VbaParser.STEP, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForNextStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forNextStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterForNextStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitForNextStmt(this);
		}
	}

	public final ForNextStmtContext forNextStmt() throws RecognitionException {
		ForNextStmtContext _localctx = new ForNextStmtContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_forNextStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(973);
			match(FOR);
			setState(974);
			match(WS);
			setState(975);
			ambiguousIdentifier();
			setState(977);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0) || _la==AMPERSAND) {
				{
				setState(976);
				typeHint();
				}
			}

			setState(981);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(979);
				match(WS);
				setState(980);
				asTypeClause();
				}
				break;
			}
			setState(984);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(983);
				match(WS);
				}
			}

			setState(986);
			match(EQ);
			setState(988);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				{
				setState(987);
				match(WS);
				}
				break;
			}
			setState(990);
			valueStmt(0);
			setState(991);
			match(WS);
			setState(992);
			match(TO);
			setState(993);
			match(WS);
			setState(994);
			valueStmt(0);
			setState(999);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				setState(995);
				match(WS);
				setState(996);
				match(STEP);
				setState(997);
				match(WS);
				setState(998);
				valueStmt(0);
				}
				break;
			}
			setState(1001);
			endOfStatement();
			setState(1003);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				{
				setState(1002);
				block();
				}
				break;
			}
			setState(1005);
			match(NEXT);
			setState(1008);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				{
				setState(1006);
				match(WS);
				setState(1007);
				ambiguousIdentifier();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionStmtContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(VbaParser.FUNCTION, 0); }
		public AmbiguousIdentifierContext ambiguousIdentifier() {
			return getRuleContext(AmbiguousIdentifierContext.class,0);
		}
		public EndOfStatementContext endOfStatement() {
			return getRuleContext(EndOfStatementContext.class,0);
		}
		public TerminalNode END_FUNCTION() { return getToken(VbaParser.END_FUNCTION, 0); }
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public TerminalNode STATIC() { return getToken(VbaParser.STATIC, 0); }
		public TypeHintContext typeHint() {
			return getRuleContext(TypeHintContext.class,0);
		}
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public AsTypeClauseContext asTypeClause() {
			return getRuleContext(AsTypeClauseContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterFunctionStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitFunctionStmt(this);
		}
	}

	public final FunctionStmtContext functionStmt() throws RecognitionException {
		FunctionStmtContext _localctx = new FunctionStmtContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_functionStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1013);
			_la = _input.LA(1);
			if (((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (FRIEND - 79)) | (1L << (GLOBAL - 79)) | (1L << (PRIVATE - 79)))) != 0) || _la==PUBLIC) {
				{
				setState(1010);
				visibility();
				setState(1011);
				match(WS);
				}
			}

			setState(1017);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(1015);
				match(STATIC);
				setState(1016);
				match(WS);
				}
			}

			setState(1019);
			match(FUNCTION);
			setState(1021);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1020);
				match(WS);
				}
			}

			setState(1023);
			ambiguousIdentifier();
			setState(1025);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0) || _la==AMPERSAND) {
				{
				setState(1024);
				typeHint();
				}
			}

			setState(1031);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				{
				setState(1028);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1027);
					match(WS);
					}
				}

				setState(1030);
				argList();
				}
				break;
			}
			setState(1037);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				{
				setState(1034);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1033);
					match(WS);
					}
				}

				setState(1036);
				asTypeClause();
				}
				break;
			}
			setState(1039);
			endOfStatement();
			setState(1041);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (END - 65)) | (1L << (ENUM - 65)) | (1L << (EQV - 65)) | (1L << (ERASE - 65)) | (1L << (ERROR - 65)) | (1L << (EVENT - 65)) | (1L << (EXIT_DO - 65)) | (1L << (EXIT_FOR - 65)) | (1L << (EXIT_FUNCTION - 65)) | (1L << (EXIT_PROPERTY - 65)) | (1L << (EXIT_SUB - 65)) | (1L << (EXIT_RULE - 65)) | (1L << (FALSE - 65)) | (1L << (FILECOPY - 65)) | (1L << (FRIEND - 65)) | (1L << (FOR - 65)) | (1L << (FUNCTION - 65)) | (1L << (GET - 65)) | (1L << (GLOBAL - 65)) | (1L << (GOSUB - 65)) | (1L << (GOTO - 65)) | (1L << (IF - 65)) | (1L << (IMP - 65)) | (1L << (IMPLEMENTS - 65)) | (1L << (IN - 65)) | (1L << (INPUT - 65)) | (1L << (IS - 65)) | (1L << (INTEGER - 65)) | (1L << (KILL - 65)) | (1L << (LOAD - 65)) | (1L << (LOCK - 65)) | (1L << (LONG - 65)) | (1L << (LOOP - 65)) | (1L << (LEN - 65)) | (1L << (LET - 65)) | (1L << (LIB - 65)) | (1L << (LIKE - 65)) | (1L << (LINE_INPUT - 65)) | (1L << (LSET - 65)) | (1L << (ME - 65)) | (1L << (MID - 65)) | (1L << (MKDIR - 65)) | (1L << (MOD - 65)) | (1L << (NAME - 65)) | (1L << (NEXT - 65)) | (1L << (NEW - 65)) | (1L << (NOT - 65)) | (1L << (NOTHING - 65)) | (1L << (NULL - 65)) | (1L << (EMPTY - 65)) | (1L << (ON - 65)) | (1L << (ON_ERROR - 65)) | (1L << (ON_LOCAL_ERROR - 65)) | (1L << (OPEN - 65)) | (1L << (OPTIONAL - 65)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (OR - 133)) | (1L << (OUTPUT - 133)) | (1L << (PARAMARRAY - 133)) | (1L << (PRESERVE - 133)) | (1L << (PRINT - 133)) | (1L << (PRIVATE - 133)) | (1L << (PUBLIC - 133)) | (1L << (PUT - 133)) | (1L << (RANDOM - 133)) | (1L << (RANDOMIZE - 133)) | (1L << (RAISEEVENT - 133)) | (1L << (READ - 133)) | (1L << (REDIM - 133)) | (1L << (REM - 133)) | (1L << (RESET - 133)) | (1L << (RESUME - 133)) | (1L << (RETURN - 133)) | (1L << (RMDIR - 133)) | (1L << (RSET - 133)) | (1L << (SAVEPICTURE - 133)) | (1L << (SAVESETTING - 133)) | (1L << (SEEK - 133)) | (1L << (SELECT - 133)) | (1L << (SENDKEYS - 133)) | (1L << (SET - 133)) | (1L << (SETATTR - 133)) | (1L << (SHARED - 133)) | (1L << (SINGLE - 133)) | (1L << (SPC - 133)) | (1L << (STATIC - 133)) | (1L << (STEP - 133)) | (1L << (STOP - 133)) | (1L << (STRING - 133)) | (1L << (SUB - 133)) | (1L << (TAB - 133)) | (1L << (TEXT - 133)) | (1L << (THEN - 133)) | (1L << (TIME - 133)) | (1L << (TO - 133)) | (1L << (TRUE - 133)) | (1L << (TYPE - 133)) | (1L << (TYPEOF - 133)) | (1L << (UNLOAD - 133)) | (1L << (UNLOCK - 133)) | (1L << (UNTIL - 133)) | (1L << (VARIANT - 133)) | (1L << (VERSION - 133)) | (1L << (WEND - 133)) | (1L << (WHILE - 133)) | (1L << (WIDTH - 133)) | (1L << (WITH - 133)) | (1L << (WITHEVENTS - 133)) | (1L << (WRITE - 133)) | (1L << (XOR - 133)))) != 0) || _la==WS || _la==IDENTIFIER) {
				{
				setState(1040);
				block();
				}
			}

			setState(1043);
			match(END_FUNCTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleStmtContext extends ParserRuleContext {
		public TerminalNode RULE() { return getToken(VbaParser.RULE, 0); }
		public List<AmbiguousIdentifierContext> ambiguousIdentifier() {
			return getRuleContexts(AmbiguousIdentifierContext.class);
		}
		public AmbiguousIdentifierContext ambiguousIdentifier(int i) {
			return getRuleContext(AmbiguousIdentifierContext.class,i);
		}
		public EndOfStatementContext endOfStatement() {
			return getRuleContext(EndOfStatementContext.class,0);
		}
		public TerminalNode END_RULE() { return getToken(VbaParser.END_RULE, 0); }
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public TerminalNode STATIC() { return getToken(VbaParser.STATIC, 0); }
		public TypeHintContext typeHint() {
			return getRuleContext(TypeHintContext.class,0);
		}
		public TerminalNode ALIAS() { return getToken(VbaParser.ALIAS, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public AsTypeClauseContext asTypeClause() {
			return getRuleContext(AsTypeClauseContext.class,0);
		}
		public TerminalNode WHEN() { return getToken(VbaParser.WHEN, 0); }
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public RuleStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterRuleStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitRuleStmt(this);
		}
	}

	public final RuleStmtContext ruleStmt() throws RecognitionException {
		RuleStmtContext _localctx = new RuleStmtContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_ruleStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1048);
			_la = _input.LA(1);
			if (((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (FRIEND - 79)) | (1L << (GLOBAL - 79)) | (1L << (PRIVATE - 79)))) != 0) || _la==PUBLIC) {
				{
				setState(1045);
				visibility();
				setState(1046);
				match(WS);
				}
			}

			setState(1052);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(1050);
				match(STATIC);
				setState(1051);
				match(WS);
				}
			}

			setState(1054);
			match(RULE);
			setState(1056);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1055);
				match(WS);
				}
			}

			setState(1058);
			ambiguousIdentifier();
			setState(1060);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0) || _la==AMPERSAND) {
				{
				setState(1059);
				typeHint();
				}
			}

			setState(1065);
			_la = _input.LA(1);
			if (_la==ALIAS) {
				{
				setState(1062);
				match(ALIAS);
				setState(1063);
				match(WS);
				setState(1064);
				ambiguousIdentifier();
				}
			}

			setState(1071);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				{
				setState(1068);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1067);
					match(WS);
					}
				}

				setState(1070);
				argList();
				}
				break;
			}
			setState(1077);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				{
				setState(1074);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1073);
					match(WS);
					}
				}

				setState(1076);
				asTypeClause();
				}
				break;
			}
			setState(1085);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				{
				setState(1080);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1079);
					match(WS);
					}
				}

				setState(1082);
				match(WHEN);
				setState(1083);
				match(WS);
				setState(1084);
				valueStmt(0);
				}
				break;
			}
			setState(1087);
			endOfStatement();
			setState(1089);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (END - 65)) | (1L << (ENUM - 65)) | (1L << (EQV - 65)) | (1L << (ERASE - 65)) | (1L << (ERROR - 65)) | (1L << (EVENT - 65)) | (1L << (EXIT_DO - 65)) | (1L << (EXIT_FOR - 65)) | (1L << (EXIT_FUNCTION - 65)) | (1L << (EXIT_PROPERTY - 65)) | (1L << (EXIT_SUB - 65)) | (1L << (EXIT_RULE - 65)) | (1L << (FALSE - 65)) | (1L << (FILECOPY - 65)) | (1L << (FRIEND - 65)) | (1L << (FOR - 65)) | (1L << (FUNCTION - 65)) | (1L << (GET - 65)) | (1L << (GLOBAL - 65)) | (1L << (GOSUB - 65)) | (1L << (GOTO - 65)) | (1L << (IF - 65)) | (1L << (IMP - 65)) | (1L << (IMPLEMENTS - 65)) | (1L << (IN - 65)) | (1L << (INPUT - 65)) | (1L << (IS - 65)) | (1L << (INTEGER - 65)) | (1L << (KILL - 65)) | (1L << (LOAD - 65)) | (1L << (LOCK - 65)) | (1L << (LONG - 65)) | (1L << (LOOP - 65)) | (1L << (LEN - 65)) | (1L << (LET - 65)) | (1L << (LIB - 65)) | (1L << (LIKE - 65)) | (1L << (LINE_INPUT - 65)) | (1L << (LSET - 65)) | (1L << (ME - 65)) | (1L << (MID - 65)) | (1L << (MKDIR - 65)) | (1L << (MOD - 65)) | (1L << (NAME - 65)) | (1L << (NEXT - 65)) | (1L << (NEW - 65)) | (1L << (NOT - 65)) | (1L << (NOTHING - 65)) | (1L << (NULL - 65)) | (1L << (EMPTY - 65)) | (1L << (ON - 65)) | (1L << (ON_ERROR - 65)) | (1L << (ON_LOCAL_ERROR - 65)) | (1L << (OPEN - 65)) | (1L << (OPTIONAL - 65)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (OR - 133)) | (1L << (OUTPUT - 133)) | (1L << (PARAMARRAY - 133)) | (1L << (PRESERVE - 133)) | (1L << (PRINT - 133)) | (1L << (PRIVATE - 133)) | (1L << (PUBLIC - 133)) | (1L << (PUT - 133)) | (1L << (RANDOM - 133)) | (1L << (RANDOMIZE - 133)) | (1L << (RAISEEVENT - 133)) | (1L << (READ - 133)) | (1L << (REDIM - 133)) | (1L << (REM - 133)) | (1L << (RESET - 133)) | (1L << (RESUME - 133)) | (1L << (RETURN - 133)) | (1L << (RMDIR - 133)) | (1L << (RSET - 133)) | (1L << (SAVEPICTURE - 133)) | (1L << (SAVESETTING - 133)) | (1L << (SEEK - 133)) | (1L << (SELECT - 133)) | (1L << (SENDKEYS - 133)) | (1L << (SET - 133)) | (1L << (SETATTR - 133)) | (1L << (SHARED - 133)) | (1L << (SINGLE - 133)) | (1L << (SPC - 133)) | (1L << (STATIC - 133)) | (1L << (STEP - 133)) | (1L << (STOP - 133)) | (1L << (STRING - 133)) | (1L << (SUB - 133)) | (1L << (TAB - 133)) | (1L << (TEXT - 133)) | (1L << (THEN - 133)) | (1L << (TIME - 133)) | (1L << (TO - 133)) | (1L << (TRUE - 133)) | (1L << (TYPE - 133)) | (1L << (TYPEOF - 133)) | (1L << (UNLOAD - 133)) | (1L << (UNLOCK - 133)) | (1L << (UNTIL - 133)) | (1L << (VARIANT - 133)) | (1L << (VERSION - 133)) | (1L << (WEND - 133)) | (1L << (WHILE - 133)) | (1L << (WIDTH - 133)) | (1L << (WITH - 133)) | (1L << (WITHEVENTS - 133)) | (1L << (WRITE - 133)) | (1L << (XOR - 133)))) != 0) || _la==WS || _la==IDENTIFIER) {
				{
				setState(1088);
				block();
				}
			}

			setState(1091);
			match(END_RULE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GetStmtContext extends ParserRuleContext {
		public TerminalNode GET() { return getToken(VbaParser.GET, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public FileNumberContext fileNumber() {
			return getRuleContext(FileNumberContext.class,0);
		}
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public GetStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterGetStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitGetStmt(this);
		}
	}

	public final GetStmtContext getStmt() throws RecognitionException {
		GetStmtContext _localctx = new GetStmtContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_getStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1093);
			match(GET);
			setState(1094);
			match(WS);
			setState(1095);
			fileNumber();
			setState(1097);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1096);
				match(WS);
				}
			}

			setState(1099);
			match(T__0);
			setState(1101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				{
				setState(1100);
				match(WS);
				}
				break;
			}
			setState(1104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				{
				setState(1103);
				valueStmt(0);
				}
				break;
			}
			setState(1107);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1106);
				match(WS);
				}
			}

			setState(1109);
			match(T__0);
			setState(1111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				{
				setState(1110);
				match(WS);
				}
				break;
			}
			setState(1113);
			valueStmt(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GoSubStmtContext extends ParserRuleContext {
		public TerminalNode GOSUB() { return getToken(VbaParser.GOSUB, 0); }
		public TerminalNode WS() { return getToken(VbaParser.WS, 0); }
		public AmbiguousIdentifierContext ambiguousIdentifier() {
			return getRuleContext(AmbiguousIdentifierContext.class,0);
		}
		public GoSubStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goSubStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterGoSubStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitGoSubStmt(this);
		}
	}

	public final GoSubStmtContext goSubStmt() throws RecognitionException {
		GoSubStmtContext _localctx = new GoSubStmtContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_goSubStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1115);
			match(GOSUB);
			setState(1116);
			match(WS);
			setState(1117);
			ambiguousIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GoToStmtContext extends ParserRuleContext {
		public TerminalNode GOTO() { return getToken(VbaParser.GOTO, 0); }
		public TerminalNode WS() { return getToken(VbaParser.WS, 0); }
		public AmbiguousIdentifierContext ambiguousIdentifier() {
			return getRuleContext(AmbiguousIdentifierContext.class,0);
		}
		public GoToStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goToStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterGoToStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitGoToStmt(this);
		}
	}

	public final GoToStmtContext goToStmt() throws RecognitionException {
		GoToStmtContext _localctx = new GoToStmtContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_goToStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1119);
			match(GOTO);
			setState(1120);
			match(WS);
			setState(1121);
			ambiguousIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfThenElseStmtContext extends ParserRuleContext {
		public IfThenElseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenElseStmt; }
	 
		public IfThenElseStmtContext() { }
		public void copyFrom(IfThenElseStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlockIfThenElseContext extends IfThenElseStmtContext {
		public IfBlockStmtContext ifBlockStmt() {
			return getRuleContext(IfBlockStmtContext.class,0);
		}
		public TerminalNode END_IF() { return getToken(VbaParser.END_IF, 0); }
		public List<IfElseIfBlockStmtContext> ifElseIfBlockStmt() {
			return getRuleContexts(IfElseIfBlockStmtContext.class);
		}
		public IfElseIfBlockStmtContext ifElseIfBlockStmt(int i) {
			return getRuleContext(IfElseIfBlockStmtContext.class,i);
		}
		public IfElseBlockStmtContext ifElseBlockStmt() {
			return getRuleContext(IfElseBlockStmtContext.class,0);
		}
		public BlockIfThenElseContext(IfThenElseStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterBlockIfThenElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitBlockIfThenElse(this);
		}
	}
	public static class InlineIfThenElseContext extends IfThenElseStmtContext {
		public TerminalNode IF() { return getToken(VbaParser.IF, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public IfConditionStmtContext ifConditionStmt() {
			return getRuleContext(IfConditionStmtContext.class,0);
		}
		public TerminalNode THEN() { return getToken(VbaParser.THEN, 0); }
		public List<BlockStmtContext> blockStmt() {
			return getRuleContexts(BlockStmtContext.class);
		}
		public BlockStmtContext blockStmt(int i) {
			return getRuleContext(BlockStmtContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(VbaParser.ELSE, 0); }
		public InlineIfThenElseContext(IfThenElseStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterInlineIfThenElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitInlineIfThenElse(this);
		}
	}

	public final IfThenElseStmtContext ifThenElseStmt() throws RecognitionException {
		IfThenElseStmtContext _localctx = new IfThenElseStmtContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_ifThenElseStmt);
		int _la;
		try {
			setState(1148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				_localctx = new InlineIfThenElseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1123);
				match(IF);
				setState(1124);
				match(WS);
				setState(1125);
				ifConditionStmt();
				setState(1126);
				match(WS);
				setState(1127);
				match(THEN);
				setState(1128);
				match(WS);
				setState(1129);
				blockStmt();
				setState(1134);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
				case 1:
					{
					setState(1130);
					match(WS);
					setState(1131);
					match(ELSE);
					setState(1132);
					match(WS);
					setState(1133);
					blockStmt();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new BlockIfThenElseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1136);
				ifBlockStmt();
				setState(1140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELSEIF) {
					{
					{
					setState(1137);
					ifElseIfBlockStmt();
					}
					}
					setState(1142);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1144);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1143);
					ifElseBlockStmt();
					}
				}

				setState(1146);
				match(END_IF);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfBlockStmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(VbaParser.IF, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public IfConditionStmtContext ifConditionStmt() {
			return getRuleContext(IfConditionStmtContext.class,0);
		}
		public TerminalNode THEN() { return getToken(VbaParser.THEN, 0); }
		public EndOfStatementContext endOfStatement() {
			return getRuleContext(EndOfStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfBlockStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlockStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterIfBlockStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitIfBlockStmt(this);
		}
	}

	public final IfBlockStmtContext ifBlockStmt() throws RecognitionException {
		IfBlockStmtContext _localctx = new IfBlockStmtContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_ifBlockStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1150);
			match(IF);
			setState(1151);
			match(WS);
			setState(1152);
			ifConditionStmt();
			setState(1153);
			match(WS);
			setState(1154);
			match(THEN);
			setState(1155);
			endOfStatement();
			setState(1157);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (END - 65)) | (1L << (ENUM - 65)) | (1L << (EQV - 65)) | (1L << (ERASE - 65)) | (1L << (ERROR - 65)) | (1L << (EVENT - 65)) | (1L << (EXIT_DO - 65)) | (1L << (EXIT_FOR - 65)) | (1L << (EXIT_FUNCTION - 65)) | (1L << (EXIT_PROPERTY - 65)) | (1L << (EXIT_SUB - 65)) | (1L << (EXIT_RULE - 65)) | (1L << (FALSE - 65)) | (1L << (FILECOPY - 65)) | (1L << (FRIEND - 65)) | (1L << (FOR - 65)) | (1L << (FUNCTION - 65)) | (1L << (GET - 65)) | (1L << (GLOBAL - 65)) | (1L << (GOSUB - 65)) | (1L << (GOTO - 65)) | (1L << (IF - 65)) | (1L << (IMP - 65)) | (1L << (IMPLEMENTS - 65)) | (1L << (IN - 65)) | (1L << (INPUT - 65)) | (1L << (IS - 65)) | (1L << (INTEGER - 65)) | (1L << (KILL - 65)) | (1L << (LOAD - 65)) | (1L << (LOCK - 65)) | (1L << (LONG - 65)) | (1L << (LOOP - 65)) | (1L << (LEN - 65)) | (1L << (LET - 65)) | (1L << (LIB - 65)) | (1L << (LIKE - 65)) | (1L << (LINE_INPUT - 65)) | (1L << (LSET - 65)) | (1L << (ME - 65)) | (1L << (MID - 65)) | (1L << (MKDIR - 65)) | (1L << (MOD - 65)) | (1L << (NAME - 65)) | (1L << (NEXT - 65)) | (1L << (NEW - 65)) | (1L << (NOT - 65)) | (1L << (NOTHING - 65)) | (1L << (NULL - 65)) | (1L << (EMPTY - 65)) | (1L << (ON - 65)) | (1L << (ON_ERROR - 65)) | (1L << (ON_LOCAL_ERROR - 65)) | (1L << (OPEN - 65)) | (1L << (OPTIONAL - 65)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (OR - 133)) | (1L << (OUTPUT - 133)) | (1L << (PARAMARRAY - 133)) | (1L << (PRESERVE - 133)) | (1L << (PRINT - 133)) | (1L << (PRIVATE - 133)) | (1L << (PUBLIC - 133)) | (1L << (PUT - 133)) | (1L << (RANDOM - 133)) | (1L << (RANDOMIZE - 133)) | (1L << (RAISEEVENT - 133)) | (1L << (READ - 133)) | (1L << (REDIM - 133)) | (1L << (REM - 133)) | (1L << (RESET - 133)) | (1L << (RESUME - 133)) | (1L << (RETURN - 133)) | (1L << (RMDIR - 133)) | (1L << (RSET - 133)) | (1L << (SAVEPICTURE - 133)) | (1L << (SAVESETTING - 133)) | (1L << (SEEK - 133)) | (1L << (SELECT - 133)) | (1L << (SENDKEYS - 133)) | (1L << (SET - 133)) | (1L << (SETATTR - 133)) | (1L << (SHARED - 133)) | (1L << (SINGLE - 133)) | (1L << (SPC - 133)) | (1L << (STATIC - 133)) | (1L << (STEP - 133)) | (1L << (STOP - 133)) | (1L << (STRING - 133)) | (1L << (SUB - 133)) | (1L << (TAB - 133)) | (1L << (TEXT - 133)) | (1L << (THEN - 133)) | (1L << (TIME - 133)) | (1L << (TO - 133)) | (1L << (TRUE - 133)) | (1L << (TYPE - 133)) | (1L << (TYPEOF - 133)) | (1L << (UNLOAD - 133)) | (1L << (UNLOCK - 133)) | (1L << (UNTIL - 133)) | (1L << (VARIANT - 133)) | (1L << (VERSION - 133)) | (1L << (WEND - 133)) | (1L << (WHILE - 133)) | (1L << (WIDTH - 133)) | (1L << (WITH - 133)) | (1L << (WITHEVENTS - 133)) | (1L << (WRITE - 133)) | (1L << (XOR - 133)))) != 0) || _la==WS || _la==IDENTIFIER) {
				{
				setState(1156);
				block();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfConditionStmtContext extends ParserRuleContext {
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public IfConditionStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifConditionStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterIfConditionStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitIfConditionStmt(this);
		}
	}

	public final IfConditionStmtContext ifConditionStmt() throws RecognitionException {
		IfConditionStmtContext _localctx = new IfConditionStmtContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_ifConditionStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1159);
			valueStmt(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfElseIfBlockStmtContext extends ParserRuleContext {
		public TerminalNode ELSEIF() { return getToken(VbaParser.ELSEIF, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public IfConditionStmtContext ifConditionStmt() {
			return getRuleContext(IfConditionStmtContext.class,0);
		}
		public TerminalNode THEN() { return getToken(VbaParser.THEN, 0); }
		public EndOfStatementContext endOfStatement() {
			return getRuleContext(EndOfStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfElseIfBlockStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifElseIfBlockStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterIfElseIfBlockStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitIfElseIfBlockStmt(this);
		}
	}

	public final IfElseIfBlockStmtContext ifElseIfBlockStmt() throws RecognitionException {
		IfElseIfBlockStmtContext _localctx = new IfElseIfBlockStmtContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_ifElseIfBlockStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1161);
			match(ELSEIF);
			setState(1162);
			match(WS);
			setState(1163);
			ifConditionStmt();
			setState(1164);
			match(WS);
			setState(1165);
			match(THEN);
			setState(1166);
			endOfStatement();
			setState(1168);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (END - 65)) | (1L << (ENUM - 65)) | (1L << (EQV - 65)) | (1L << (ERASE - 65)) | (1L << (ERROR - 65)) | (1L << (EVENT - 65)) | (1L << (EXIT_DO - 65)) | (1L << (EXIT_FOR - 65)) | (1L << (EXIT_FUNCTION - 65)) | (1L << (EXIT_PROPERTY - 65)) | (1L << (EXIT_SUB - 65)) | (1L << (EXIT_RULE - 65)) | (1L << (FALSE - 65)) | (1L << (FILECOPY - 65)) | (1L << (FRIEND - 65)) | (1L << (FOR - 65)) | (1L << (FUNCTION - 65)) | (1L << (GET - 65)) | (1L << (GLOBAL - 65)) | (1L << (GOSUB - 65)) | (1L << (GOTO - 65)) | (1L << (IF - 65)) | (1L << (IMP - 65)) | (1L << (IMPLEMENTS - 65)) | (1L << (IN - 65)) | (1L << (INPUT - 65)) | (1L << (IS - 65)) | (1L << (INTEGER - 65)) | (1L << (KILL - 65)) | (1L << (LOAD - 65)) | (1L << (LOCK - 65)) | (1L << (LONG - 65)) | (1L << (LOOP - 65)) | (1L << (LEN - 65)) | (1L << (LET - 65)) | (1L << (LIB - 65)) | (1L << (LIKE - 65)) | (1L << (LINE_INPUT - 65)) | (1L << (LSET - 65)) | (1L << (ME - 65)) | (1L << (MID - 65)) | (1L << (MKDIR - 65)) | (1L << (MOD - 65)) | (1L << (NAME - 65)) | (1L << (NEXT - 65)) | (1L << (NEW - 65)) | (1L << (NOT - 65)) | (1L << (NOTHING - 65)) | (1L << (NULL - 65)) | (1L << (EMPTY - 65)) | (1L << (ON - 65)) | (1L << (ON_ERROR - 65)) | (1L << (ON_LOCAL_ERROR - 65)) | (1L << (OPEN - 65)) | (1L << (OPTIONAL - 65)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (OR - 133)) | (1L << (OUTPUT - 133)) | (1L << (PARAMARRAY - 133)) | (1L << (PRESERVE - 133)) | (1L << (PRINT - 133)) | (1L << (PRIVATE - 133)) | (1L << (PUBLIC - 133)) | (1L << (PUT - 133)) | (1L << (RANDOM - 133)) | (1L << (RANDOMIZE - 133)) | (1L << (RAISEEVENT - 133)) | (1L << (READ - 133)) | (1L << (REDIM - 133)) | (1L << (REM - 133)) | (1L << (RESET - 133)) | (1L << (RESUME - 133)) | (1L << (RETURN - 133)) | (1L << (RMDIR - 133)) | (1L << (RSET - 133)) | (1L << (SAVEPICTURE - 133)) | (1L << (SAVESETTING - 133)) | (1L << (SEEK - 133)) | (1L << (SELECT - 133)) | (1L << (SENDKEYS - 133)) | (1L << (SET - 133)) | (1L << (SETATTR - 133)) | (1L << (SHARED - 133)) | (1L << (SINGLE - 133)) | (1L << (SPC - 133)) | (1L << (STATIC - 133)) | (1L << (STEP - 133)) | (1L << (STOP - 133)) | (1L << (STRING - 133)) | (1L << (SUB - 133)) | (1L << (TAB - 133)) | (1L << (TEXT - 133)) | (1L << (THEN - 133)) | (1L << (TIME - 133)) | (1L << (TO - 133)) | (1L << (TRUE - 133)) | (1L << (TYPE - 133)) | (1L << (TYPEOF - 133)) | (1L << (UNLOAD - 133)) | (1L << (UNLOCK - 133)) | (1L << (UNTIL - 133)) | (1L << (VARIANT - 133)) | (1L << (VERSION - 133)) | (1L << (WEND - 133)) | (1L << (WHILE - 133)) | (1L << (WIDTH - 133)) | (1L << (WITH - 133)) | (1L << (WITHEVENTS - 133)) | (1L << (WRITE - 133)) | (1L << (XOR - 133)))) != 0) || _la==WS || _la==IDENTIFIER) {
				{
				setState(1167);
				block();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfElseBlockStmtContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(VbaParser.ELSE, 0); }
		public EndOfStatementContext endOfStatement() {
			return getRuleContext(EndOfStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfElseBlockStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifElseBlockStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterIfElseBlockStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitIfElseBlockStmt(this);
		}
	}

	public final IfElseBlockStmtContext ifElseBlockStmt() throws RecognitionException {
		IfElseBlockStmtContext _localctx = new IfElseBlockStmtContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_ifElseBlockStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1170);
			match(ELSE);
			setState(1171);
			endOfStatement();
			setState(1173);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (END - 65)) | (1L << (ENUM - 65)) | (1L << (EQV - 65)) | (1L << (ERASE - 65)) | (1L << (ERROR - 65)) | (1L << (EVENT - 65)) | (1L << (EXIT_DO - 65)) | (1L << (EXIT_FOR - 65)) | (1L << (EXIT_FUNCTION - 65)) | (1L << (EXIT_PROPERTY - 65)) | (1L << (EXIT_SUB - 65)) | (1L << (EXIT_RULE - 65)) | (1L << (FALSE - 65)) | (1L << (FILECOPY - 65)) | (1L << (FRIEND - 65)) | (1L << (FOR - 65)) | (1L << (FUNCTION - 65)) | (1L << (GET - 65)) | (1L << (GLOBAL - 65)) | (1L << (GOSUB - 65)) | (1L << (GOTO - 65)) | (1L << (IF - 65)) | (1L << (IMP - 65)) | (1L << (IMPLEMENTS - 65)) | (1L << (IN - 65)) | (1L << (INPUT - 65)) | (1L << (IS - 65)) | (1L << (INTEGER - 65)) | (1L << (KILL - 65)) | (1L << (LOAD - 65)) | (1L << (LOCK - 65)) | (1L << (LONG - 65)) | (1L << (LOOP - 65)) | (1L << (LEN - 65)) | (1L << (LET - 65)) | (1L << (LIB - 65)) | (1L << (LIKE - 65)) | (1L << (LINE_INPUT - 65)) | (1L << (LSET - 65)) | (1L << (ME - 65)) | (1L << (MID - 65)) | (1L << (MKDIR - 65)) | (1L << (MOD - 65)) | (1L << (NAME - 65)) | (1L << (NEXT - 65)) | (1L << (NEW - 65)) | (1L << (NOT - 65)) | (1L << (NOTHING - 65)) | (1L << (NULL - 65)) | (1L << (EMPTY - 65)) | (1L << (ON - 65)) | (1L << (ON_ERROR - 65)) | (1L << (ON_LOCAL_ERROR - 65)) | (1L << (OPEN - 65)) | (1L << (OPTIONAL - 65)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (OR - 133)) | (1L << (OUTPUT - 133)) | (1L << (PARAMARRAY - 133)) | (1L << (PRESERVE - 133)) | (1L << (PRINT - 133)) | (1L << (PRIVATE - 133)) | (1L << (PUBLIC - 133)) | (1L << (PUT - 133)) | (1L << (RANDOM - 133)) | (1L << (RANDOMIZE - 133)) | (1L << (RAISEEVENT - 133)) | (1L << (READ - 133)) | (1L << (REDIM - 133)) | (1L << (REM - 133)) | (1L << (RESET - 133)) | (1L << (RESUME - 133)) | (1L << (RETURN - 133)) | (1L << (RMDIR - 133)) | (1L << (RSET - 133)) | (1L << (SAVEPICTURE - 133)) | (1L << (SAVESETTING - 133)) | (1L << (SEEK - 133)) | (1L << (SELECT - 133)) | (1L << (SENDKEYS - 133)) | (1L << (SET - 133)) | (1L << (SETATTR - 133)) | (1L << (SHARED - 133)) | (1L << (SINGLE - 133)) | (1L << (SPC - 133)) | (1L << (STATIC - 133)) | (1L << (STEP - 133)) | (1L << (STOP - 133)) | (1L << (STRING - 133)) | (1L << (SUB - 133)) | (1L << (TAB - 133)) | (1L << (TEXT - 133)) | (1L << (THEN - 133)) | (1L << (TIME - 133)) | (1L << (TO - 133)) | (1L << (TRUE - 133)) | (1L << (TYPE - 133)) | (1L << (TYPEOF - 133)) | (1L << (UNLOAD - 133)) | (1L << (UNLOCK - 133)) | (1L << (UNTIL - 133)) | (1L << (VARIANT - 133)) | (1L << (VERSION - 133)) | (1L << (WEND - 133)) | (1L << (WHILE - 133)) | (1L << (WIDTH - 133)) | (1L << (WITH - 133)) | (1L << (WITHEVENTS - 133)) | (1L << (WRITE - 133)) | (1L << (XOR - 133)))) != 0) || _la==WS || _la==IDENTIFIER) {
				{
				setState(1172);
				block();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImplementsStmtContext extends ParserRuleContext {
		public TerminalNode IMPLEMENTS() { return getToken(VbaParser.IMPLEMENTS, 0); }
		public TerminalNode WS() { return getToken(VbaParser.WS, 0); }
		public AmbiguousIdentifierContext ambiguousIdentifier() {
			return getRuleContext(AmbiguousIdentifierContext.class,0);
		}
		public ImplementsStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implementsStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterImplementsStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitImplementsStmt(this);
		}
	}

	public final ImplementsStmtContext implementsStmt() throws RecognitionException {
		ImplementsStmtContext _localctx = new ImplementsStmtContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_implementsStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1175);
			match(IMPLEMENTS);
			setState(1176);
			match(WS);
			setState(1177);
			ambiguousIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputStmtContext extends ParserRuleContext {
		public TerminalNode INPUT() { return getToken(VbaParser.INPUT, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public FileNumberContext fileNumber() {
			return getRuleContext(FileNumberContext.class,0);
		}
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public InputStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterInputStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitInputStmt(this);
		}
	}

	public final InputStmtContext inputStmt() throws RecognitionException {
		InputStmtContext _localctx = new InputStmtContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_inputStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1179);
			match(INPUT);
			setState(1180);
			match(WS);
			setState(1181);
			fileNumber();
			setState(1190); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1183);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(1182);
						match(WS);
						}
					}

					setState(1185);
					match(T__0);
					setState(1187);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
					case 1:
						{
						setState(1186);
						match(WS);
						}
						break;
					}
					setState(1189);
					valueStmt(0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1192); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KillStmtContext extends ParserRuleContext {
		public TerminalNode KILL() { return getToken(VbaParser.KILL, 0); }
		public TerminalNode WS() { return getToken(VbaParser.WS, 0); }
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public KillStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_killStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterKillStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitKillStmt(this);
		}
	}

	public final KillStmtContext killStmt() throws RecognitionException {
		KillStmtContext _localctx = new KillStmtContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_killStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1194);
			match(KILL);
			setState(1195);
			match(WS);
			setState(1196);
			valueStmt(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LetStmtContext extends ParserRuleContext {
		public ImplicitCallStmt_InStmtContext implicitCallStmt_InStmt() {
			return getRuleContext(ImplicitCallStmt_InStmtContext.class,0);
		}
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public TerminalNode EQ() { return getToken(VbaParser.EQ, 0); }
		public TerminalNode PLUS_EQ() { return getToken(VbaParser.PLUS_EQ, 0); }
		public TerminalNode MINUS_EQ() { return getToken(VbaParser.MINUS_EQ, 0); }
		public TerminalNode LET() { return getToken(VbaParser.LET, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public LetStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterLetStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitLetStmt(this);
		}
	}

	public final LetStmtContext letStmt() throws RecognitionException {
		LetStmtContext _localctx = new LetStmtContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_letStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				{
				setState(1198);
				match(LET);
				setState(1199);
				match(WS);
				}
				break;
			}
			setState(1202);
			implicitCallStmt_InStmt();
			setState(1204);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1203);
				match(WS);
				}
			}

			setState(1206);
			_la = _input.LA(1);
			if ( !(((((_la - 200)) & ~0x3f) == 0 && ((1L << (_la - 200)) & ((1L << (EQ - 200)) | (1L << (MINUS_EQ - 200)) | (1L << (PLUS_EQ - 200)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				{
				setState(1207);
				match(WS);
				}
				break;
			}
			setState(1210);
			valueStmt(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineInputStmtContext extends ParserRuleContext {
		public TerminalNode LINE_INPUT() { return getToken(VbaParser.LINE_INPUT, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public FileNumberContext fileNumber() {
			return getRuleContext(FileNumberContext.class,0);
		}
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public LineInputStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineInputStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterLineInputStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitLineInputStmt(this);
		}
	}

	public final LineInputStmtContext lineInputStmt() throws RecognitionException {
		LineInputStmtContext _localctx = new LineInputStmtContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_lineInputStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1212);
			match(LINE_INPUT);
			setState(1213);
			match(WS);
			setState(1214);
			fileNumber();
			setState(1216);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1215);
				match(WS);
				}
			}

			setState(1218);
			match(T__0);
			setState(1220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				{
				setState(1219);
				match(WS);
				}
				break;
			}
			setState(1222);
			valueStmt(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoadStmtContext extends ParserRuleContext {
		public TerminalNode LOAD() { return getToken(VbaParser.LOAD, 0); }
		public TerminalNode WS() { return getToken(VbaParser.WS, 0); }
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public LoadStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loadStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterLoadStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitLoadStmt(this);
		}
	}

	public final LoadStmtContext loadStmt() throws RecognitionException {
		LoadStmtContext _localctx = new LoadStmtContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_loadStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1224);
			match(LOAD);
			setState(1225);
			match(WS);
			setState(1226);
			valueStmt(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LockStmtContext extends ParserRuleContext {
		public TerminalNode LOCK() { return getToken(VbaParser.LOCK, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public TerminalNode TO() { return getToken(VbaParser.TO, 0); }
		public LockStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lockStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterLockStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitLockStmt(this);
		}
	}

	public final LockStmtContext lockStmt() throws RecognitionException {
		LockStmtContext _localctx = new LockStmtContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_lockStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1228);
			match(LOCK);
			setState(1229);
			match(WS);
			setState(1230);
			valueStmt(0);
			setState(1245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				{
				setState(1232);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1231);
					match(WS);
					}
				}

				setState(1234);
				match(T__0);
				setState(1236);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
				case 1:
					{
					setState(1235);
					match(WS);
					}
					break;
				}
				setState(1238);
				valueStmt(0);
				setState(1243);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
				case 1:
					{
					setState(1239);
					match(WS);
					setState(1240);
					match(TO);
					setState(1241);
					match(WS);
					setState(1242);
					valueStmt(0);
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LsetStmtContext extends ParserRuleContext {
		public TerminalNode LSET() { return getToken(VbaParser.LSET, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public ImplicitCallStmt_InStmtContext implicitCallStmt_InStmt() {
			return getRuleContext(ImplicitCallStmt_InStmtContext.class,0);
		}
		public TerminalNode EQ() { return getToken(VbaParser.EQ, 0); }
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public LsetStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lsetStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterLsetStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitLsetStmt(this);
		}
	}

	public final LsetStmtContext lsetStmt() throws RecognitionException {
		LsetStmtContext _localctx = new LsetStmtContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_lsetStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1247);
			match(LSET);
			setState(1248);
			match(WS);
			setState(1249);
			implicitCallStmt_InStmt();
			setState(1251);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1250);
				match(WS);
				}
			}

			setState(1253);
			match(EQ);
			setState(1255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				{
				setState(1254);
				match(WS);
				}
				break;
			}
			setState(1257);
			valueStmt(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MacroConstStmtContext extends ParserRuleContext {
		public TerminalNode MACRO_CONST() { return getToken(VbaParser.MACRO_CONST, 0); }
		public AmbiguousIdentifierContext ambiguousIdentifier() {
			return getRuleContext(AmbiguousIdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(VbaParser.EQ, 0); }
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public MacroConstStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroConstStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterMacroConstStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitMacroConstStmt(this);
		}
	}

	public final MacroConstStmtContext macroConstStmt() throws RecognitionException {
		MacroConstStmtContext _localctx = new MacroConstStmtContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_macroConstStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1259);
			match(MACRO_CONST);
			setState(1261);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1260);
				match(WS);
				}
			}

			setState(1263);
			ambiguousIdentifier();
			setState(1265);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1264);
				match(WS);
				}
			}

			setState(1267);
			match(EQ);
			setState(1269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				{
				setState(1268);
				match(WS);
				}
				break;
			}
			setState(1271);
			valueStmt(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MacroIfThenElseStmtContext extends ParserRuleContext {
		public MacroIfBlockStmtContext macroIfBlockStmt() {
			return getRuleContext(MacroIfBlockStmtContext.class,0);
		}
		public TerminalNode MACRO_END_IF() { return getToken(VbaParser.MACRO_END_IF, 0); }
		public List<MacroElseIfBlockStmtContext> macroElseIfBlockStmt() {
			return getRuleContexts(MacroElseIfBlockStmtContext.class);
		}
		public MacroElseIfBlockStmtContext macroElseIfBlockStmt(int i) {
			return getRuleContext(MacroElseIfBlockStmtContext.class,i);
		}
		public MacroElseBlockStmtContext macroElseBlockStmt() {
			return getRuleContext(MacroElseBlockStmtContext.class,0);
		}
		public MacroIfThenElseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroIfThenElseStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterMacroIfThenElseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitMacroIfThenElseStmt(this);
		}
	}

	public final MacroIfThenElseStmtContext macroIfThenElseStmt() throws RecognitionException {
		MacroIfThenElseStmtContext _localctx = new MacroIfThenElseStmtContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_macroIfThenElseStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1273);
			macroIfBlockStmt();
			setState(1277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MACRO_ELSEIF) {
				{
				{
				setState(1274);
				macroElseIfBlockStmt();
				}
				}
				setState(1279);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1281);
			_la = _input.LA(1);
			if (_la==MACRO_ELSE) {
				{
				setState(1280);
				macroElseBlockStmt();
				}
			}

			setState(1283);
			match(MACRO_END_IF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MacroIfBlockStmtContext extends ParserRuleContext {
		public TerminalNode MACRO_IF() { return getToken(VbaParser.MACRO_IF, 0); }
		public IfConditionStmtContext ifConditionStmt() {
			return getRuleContext(IfConditionStmtContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public TerminalNode THEN() { return getToken(VbaParser.THEN, 0); }
		public EndOfStatementContext endOfStatement() {
			return getRuleContext(EndOfStatementContext.class,0);
		}
		public List<ModuleDeclarationsContext> moduleDeclarations() {
			return getRuleContexts(ModuleDeclarationsContext.class);
		}
		public ModuleDeclarationsContext moduleDeclarations(int i) {
			return getRuleContext(ModuleDeclarationsContext.class,i);
		}
		public List<ModuleBodyContext> moduleBody() {
			return getRuleContexts(ModuleBodyContext.class);
		}
		public ModuleBodyContext moduleBody(int i) {
			return getRuleContext(ModuleBodyContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public MacroIfBlockStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroIfBlockStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterMacroIfBlockStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitMacroIfBlockStmt(this);
		}
	}

	public final MacroIfBlockStmtContext macroIfBlockStmt() throws RecognitionException {
		MacroIfBlockStmtContext _localctx = new MacroIfBlockStmtContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_macroIfBlockStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1285);
			match(MACRO_IF);
			setState(1287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				{
				setState(1286);
				match(WS);
				}
				break;
			}
			setState(1289);
			ifConditionStmt();
			setState(1290);
			match(WS);
			setState(1291);
			match(THEN);
			setState(1292);
			endOfStatement();
			setState(1298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (END - 65)) | (1L << (ENUM - 65)) | (1L << (EQV - 65)) | (1L << (ERASE - 65)) | (1L << (ERROR - 65)) | (1L << (EVENT - 65)) | (1L << (EXIT_DO - 65)) | (1L << (EXIT_FOR - 65)) | (1L << (EXIT_FUNCTION - 65)) | (1L << (EXIT_PROPERTY - 65)) | (1L << (EXIT_SUB - 65)) | (1L << (EXIT_RULE - 65)) | (1L << (FALSE - 65)) | (1L << (FILECOPY - 65)) | (1L << (FRIEND - 65)) | (1L << (FOR - 65)) | (1L << (FUNCTION - 65)) | (1L << (RULE - 65)) | (1L << (GET - 65)) | (1L << (GLOBAL - 65)) | (1L << (GOSUB - 65)) | (1L << (GOTO - 65)) | (1L << (IF - 65)) | (1L << (IMP - 65)) | (1L << (IMPLEMENTS - 65)) | (1L << (IN - 65)) | (1L << (INPUT - 65)) | (1L << (IS - 65)) | (1L << (INTEGER - 65)) | (1L << (KILL - 65)) | (1L << (LOAD - 65)) | (1L << (LOCK - 65)) | (1L << (LONG - 65)) | (1L << (LOOP - 65)) | (1L << (LEN - 65)) | (1L << (LET - 65)) | (1L << (LIB - 65)) | (1L << (LIKE - 65)) | (1L << (LINE_INPUT - 65)) | (1L << (LSET - 65)) | (1L << (ME - 65)) | (1L << (MID - 65)) | (1L << (MKDIR - 65)) | (1L << (MOD - 65)) | (1L << (NAME - 65)) | (1L << (NEXT - 65)) | (1L << (NEW - 65)) | (1L << (NOT - 65)) | (1L << (NOTHING - 65)) | (1L << (NULL - 65)) | (1L << (EMPTY - 65)) | (1L << (ON - 65)) | (1L << (ON_ERROR - 65)) | (1L << (ON_LOCAL_ERROR - 65)) | (1L << (OPEN - 65)) | (1L << (OPTIONAL - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (OPTION_BASE - 129)) | (1L << (OPTION_EXPLICIT - 129)) | (1L << (OPTION_COMPARE - 129)) | (1L << (OPTION_PRIVATE_MODULE - 129)) | (1L << (OR - 129)) | (1L << (OUTPUT - 129)) | (1L << (PARAMARRAY - 129)) | (1L << (PRESERVE - 129)) | (1L << (PRINT - 129)) | (1L << (PRIVATE - 129)) | (1L << (PROPERTY_GET - 129)) | (1L << (PROPERTY_LET - 129)) | (1L << (PROPERTY_SET - 129)) | (1L << (PUBLIC - 129)) | (1L << (PUT - 129)) | (1L << (RANDOM - 129)) | (1L << (RANDOMIZE - 129)) | (1L << (RAISEEVENT - 129)) | (1L << (READ - 129)) | (1L << (REDIM - 129)) | (1L << (REM - 129)) | (1L << (RESET - 129)) | (1L << (RESUME - 129)) | (1L << (RETURN - 129)) | (1L << (RMDIR - 129)) | (1L << (RSET - 129)) | (1L << (SAVEPICTURE - 129)) | (1L << (SAVESETTING - 129)) | (1L << (SEEK - 129)) | (1L << (SELECT - 129)) | (1L << (SENDKEYS - 129)) | (1L << (SET - 129)) | (1L << (SETATTR - 129)) | (1L << (SHARED - 129)) | (1L << (SINGLE - 129)) | (1L << (SPC - 129)) | (1L << (STATIC - 129)) | (1L << (STEP - 129)) | (1L << (STOP - 129)) | (1L << (STRING - 129)) | (1L << (SUB - 129)) | (1L << (TAB - 129)) | (1L << (TEXT - 129)) | (1L << (THEN - 129)) | (1L << (TIME - 129)) | (1L << (TO - 129)) | (1L << (TRUE - 129)) | (1L << (TYPE - 129)) | (1L << (TYPEOF - 129)) | (1L << (UNLOAD - 129)) | (1L << (UNLOCK - 129)) | (1L << (UNTIL - 129)) | (1L << (VARIANT - 129)) | (1L << (VERSION - 129)) | (1L << (WEND - 129)) | (1L << (WHILE - 129)) | (1L << (WIDTH - 129)) | (1L << (WITH - 129)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (WITHEVENTS - 194)) | (1L << (WRITE - 194)) | (1L << (XOR - 194)) | (1L << (COMMENT - 194)) | (1L << (WS - 194)) | (1L << (IDENTIFIER - 194)))) != 0)) {
				{
				setState(1296);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
				case 1:
					{
					setState(1293);
					moduleDeclarations();
					}
					break;
				case 2:
					{
					setState(1294);
					moduleBody();
					}
					break;
				case 3:
					{
					setState(1295);
					block();
					}
					break;
				}
				}
				setState(1300);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MacroElseIfBlockStmtContext extends ParserRuleContext {
		public TerminalNode MACRO_ELSEIF() { return getToken(VbaParser.MACRO_ELSEIF, 0); }
		public IfConditionStmtContext ifConditionStmt() {
			return getRuleContext(IfConditionStmtContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public TerminalNode THEN() { return getToken(VbaParser.THEN, 0); }
		public EndOfStatementContext endOfStatement() {
			return getRuleContext(EndOfStatementContext.class,0);
		}
		public List<ModuleDeclarationsContext> moduleDeclarations() {
			return getRuleContexts(ModuleDeclarationsContext.class);
		}
		public ModuleDeclarationsContext moduleDeclarations(int i) {
			return getRuleContext(ModuleDeclarationsContext.class,i);
		}
		public List<ModuleBodyContext> moduleBody() {
			return getRuleContexts(ModuleBodyContext.class);
		}
		public ModuleBodyContext moduleBody(int i) {
			return getRuleContext(ModuleBodyContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public MacroElseIfBlockStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroElseIfBlockStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterMacroElseIfBlockStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitMacroElseIfBlockStmt(this);
		}
	}

	public final MacroElseIfBlockStmtContext macroElseIfBlockStmt() throws RecognitionException {
		MacroElseIfBlockStmtContext _localctx = new MacroElseIfBlockStmtContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_macroElseIfBlockStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1301);
			match(MACRO_ELSEIF);
			setState(1303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				{
				setState(1302);
				match(WS);
				}
				break;
			}
			setState(1305);
			ifConditionStmt();
			setState(1306);
			match(WS);
			setState(1307);
			match(THEN);
			setState(1308);
			endOfStatement();
			setState(1314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (END - 65)) | (1L << (ENUM - 65)) | (1L << (EQV - 65)) | (1L << (ERASE - 65)) | (1L << (ERROR - 65)) | (1L << (EVENT - 65)) | (1L << (EXIT_DO - 65)) | (1L << (EXIT_FOR - 65)) | (1L << (EXIT_FUNCTION - 65)) | (1L << (EXIT_PROPERTY - 65)) | (1L << (EXIT_SUB - 65)) | (1L << (EXIT_RULE - 65)) | (1L << (FALSE - 65)) | (1L << (FILECOPY - 65)) | (1L << (FRIEND - 65)) | (1L << (FOR - 65)) | (1L << (FUNCTION - 65)) | (1L << (RULE - 65)) | (1L << (GET - 65)) | (1L << (GLOBAL - 65)) | (1L << (GOSUB - 65)) | (1L << (GOTO - 65)) | (1L << (IF - 65)) | (1L << (IMP - 65)) | (1L << (IMPLEMENTS - 65)) | (1L << (IN - 65)) | (1L << (INPUT - 65)) | (1L << (IS - 65)) | (1L << (INTEGER - 65)) | (1L << (KILL - 65)) | (1L << (LOAD - 65)) | (1L << (LOCK - 65)) | (1L << (LONG - 65)) | (1L << (LOOP - 65)) | (1L << (LEN - 65)) | (1L << (LET - 65)) | (1L << (LIB - 65)) | (1L << (LIKE - 65)) | (1L << (LINE_INPUT - 65)) | (1L << (LSET - 65)) | (1L << (ME - 65)) | (1L << (MID - 65)) | (1L << (MKDIR - 65)) | (1L << (MOD - 65)) | (1L << (NAME - 65)) | (1L << (NEXT - 65)) | (1L << (NEW - 65)) | (1L << (NOT - 65)) | (1L << (NOTHING - 65)) | (1L << (NULL - 65)) | (1L << (EMPTY - 65)) | (1L << (ON - 65)) | (1L << (ON_ERROR - 65)) | (1L << (ON_LOCAL_ERROR - 65)) | (1L << (OPEN - 65)) | (1L << (OPTIONAL - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (OPTION_BASE - 129)) | (1L << (OPTION_EXPLICIT - 129)) | (1L << (OPTION_COMPARE - 129)) | (1L << (OPTION_PRIVATE_MODULE - 129)) | (1L << (OR - 129)) | (1L << (OUTPUT - 129)) | (1L << (PARAMARRAY - 129)) | (1L << (PRESERVE - 129)) | (1L << (PRINT - 129)) | (1L << (PRIVATE - 129)) | (1L << (PROPERTY_GET - 129)) | (1L << (PROPERTY_LET - 129)) | (1L << (PROPERTY_SET - 129)) | (1L << (PUBLIC - 129)) | (1L << (PUT - 129)) | (1L << (RANDOM - 129)) | (1L << (RANDOMIZE - 129)) | (1L << (RAISEEVENT - 129)) | (1L << (READ - 129)) | (1L << (REDIM - 129)) | (1L << (REM - 129)) | (1L << (RESET - 129)) | (1L << (RESUME - 129)) | (1L << (RETURN - 129)) | (1L << (RMDIR - 129)) | (1L << (RSET - 129)) | (1L << (SAVEPICTURE - 129)) | (1L << (SAVESETTING - 129)) | (1L << (SEEK - 129)) | (1L << (SELECT - 129)) | (1L << (SENDKEYS - 129)) | (1L << (SET - 129)) | (1L << (SETATTR - 129)) | (1L << (SHARED - 129)) | (1L << (SINGLE - 129)) | (1L << (SPC - 129)) | (1L << (STATIC - 129)) | (1L << (STEP - 129)) | (1L << (STOP - 129)) | (1L << (STRING - 129)) | (1L << (SUB - 129)) | (1L << (TAB - 129)) | (1L << (TEXT - 129)) | (1L << (THEN - 129)) | (1L << (TIME - 129)) | (1L << (TO - 129)) | (1L << (TRUE - 129)) | (1L << (TYPE - 129)) | (1L << (TYPEOF - 129)) | (1L << (UNLOAD - 129)) | (1L << (UNLOCK - 129)) | (1L << (UNTIL - 129)) | (1L << (VARIANT - 129)) | (1L << (VERSION - 129)) | (1L << (WEND - 129)) | (1L << (WHILE - 129)) | (1L << (WIDTH - 129)) | (1L << (WITH - 129)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (WITHEVENTS - 194)) | (1L << (WRITE - 194)) | (1L << (XOR - 194)) | (1L << (COMMENT - 194)) | (1L << (WS - 194)) | (1L << (IDENTIFIER - 194)))) != 0)) {
				{
				setState(1312);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
				case 1:
					{
					setState(1309);
					moduleDeclarations();
					}
					break;
				case 2:
					{
					setState(1310);
					moduleBody();
					}
					break;
				case 3:
					{
					setState(1311);
					block();
					}
					break;
				}
				}
				setState(1316);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MacroElseBlockStmtContext extends ParserRuleContext {
		public TerminalNode MACRO_ELSE() { return getToken(VbaParser.MACRO_ELSE, 0); }
		public EndOfStatementContext endOfStatement() {
			return getRuleContext(EndOfStatementContext.class,0);
		}
		public List<ModuleDeclarationsContext> moduleDeclarations() {
			return getRuleContexts(ModuleDeclarationsContext.class);
		}
		public ModuleDeclarationsContext moduleDeclarations(int i) {
			return getRuleContext(ModuleDeclarationsContext.class,i);
		}
		public List<ModuleBodyContext> moduleBody() {
			return getRuleContexts(ModuleBodyContext.class);
		}
		public ModuleBodyContext moduleBody(int i) {
			return getRuleContext(ModuleBodyContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public MacroElseBlockStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroElseBlockStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterMacroElseBlockStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitMacroElseBlockStmt(this);
		}
	}

	public final MacroElseBlockStmtContext macroElseBlockStmt() throws RecognitionException {
		MacroElseBlockStmtContext _localctx = new MacroElseBlockStmtContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_macroElseBlockStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1317);
			match(MACRO_ELSE);
			setState(1318);
			endOfStatement();
			setState(1324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (END - 65)) | (1L << (ENUM - 65)) | (1L << (EQV - 65)) | (1L << (ERASE - 65)) | (1L << (ERROR - 65)) | (1L << (EVENT - 65)) | (1L << (EXIT_DO - 65)) | (1L << (EXIT_FOR - 65)) | (1L << (EXIT_FUNCTION - 65)) | (1L << (EXIT_PROPERTY - 65)) | (1L << (EXIT_SUB - 65)) | (1L << (EXIT_RULE - 65)) | (1L << (FALSE - 65)) | (1L << (FILECOPY - 65)) | (1L << (FRIEND - 65)) | (1L << (FOR - 65)) | (1L << (FUNCTION - 65)) | (1L << (RULE - 65)) | (1L << (GET - 65)) | (1L << (GLOBAL - 65)) | (1L << (GOSUB - 65)) | (1L << (GOTO - 65)) | (1L << (IF - 65)) | (1L << (IMP - 65)) | (1L << (IMPLEMENTS - 65)) | (1L << (IN - 65)) | (1L << (INPUT - 65)) | (1L << (IS - 65)) | (1L << (INTEGER - 65)) | (1L << (KILL - 65)) | (1L << (LOAD - 65)) | (1L << (LOCK - 65)) | (1L << (LONG - 65)) | (1L << (LOOP - 65)) | (1L << (LEN - 65)) | (1L << (LET - 65)) | (1L << (LIB - 65)) | (1L << (LIKE - 65)) | (1L << (LINE_INPUT - 65)) | (1L << (LSET - 65)) | (1L << (ME - 65)) | (1L << (MID - 65)) | (1L << (MKDIR - 65)) | (1L << (MOD - 65)) | (1L << (NAME - 65)) | (1L << (NEXT - 65)) | (1L << (NEW - 65)) | (1L << (NOT - 65)) | (1L << (NOTHING - 65)) | (1L << (NULL - 65)) | (1L << (EMPTY - 65)) | (1L << (ON - 65)) | (1L << (ON_ERROR - 65)) | (1L << (ON_LOCAL_ERROR - 65)) | (1L << (OPEN - 65)) | (1L << (OPTIONAL - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (OPTION_BASE - 129)) | (1L << (OPTION_EXPLICIT - 129)) | (1L << (OPTION_COMPARE - 129)) | (1L << (OPTION_PRIVATE_MODULE - 129)) | (1L << (OR - 129)) | (1L << (OUTPUT - 129)) | (1L << (PARAMARRAY - 129)) | (1L << (PRESERVE - 129)) | (1L << (PRINT - 129)) | (1L << (PRIVATE - 129)) | (1L << (PROPERTY_GET - 129)) | (1L << (PROPERTY_LET - 129)) | (1L << (PROPERTY_SET - 129)) | (1L << (PUBLIC - 129)) | (1L << (PUT - 129)) | (1L << (RANDOM - 129)) | (1L << (RANDOMIZE - 129)) | (1L << (RAISEEVENT - 129)) | (1L << (READ - 129)) | (1L << (REDIM - 129)) | (1L << (REM - 129)) | (1L << (RESET - 129)) | (1L << (RESUME - 129)) | (1L << (RETURN - 129)) | (1L << (RMDIR - 129)) | (1L << (RSET - 129)) | (1L << (SAVEPICTURE - 129)) | (1L << (SAVESETTING - 129)) | (1L << (SEEK - 129)) | (1L << (SELECT - 129)) | (1L << (SENDKEYS - 129)) | (1L << (SET - 129)) | (1L << (SETATTR - 129)) | (1L << (SHARED - 129)) | (1L << (SINGLE - 129)) | (1L << (SPC - 129)) | (1L << (STATIC - 129)) | (1L << (STEP - 129)) | (1L << (STOP - 129)) | (1L << (STRING - 129)) | (1L << (SUB - 129)) | (1L << (TAB - 129)) | (1L << (TEXT - 129)) | (1L << (THEN - 129)) | (1L << (TIME - 129)) | (1L << (TO - 129)) | (1L << (TRUE - 129)) | (1L << (TYPE - 129)) | (1L << (TYPEOF - 129)) | (1L << (UNLOAD - 129)) | (1L << (UNLOCK - 129)) | (1L << (UNTIL - 129)) | (1L << (VARIANT - 129)) | (1L << (VERSION - 129)) | (1L << (WEND - 129)) | (1L << (WHILE - 129)) | (1L << (WIDTH - 129)) | (1L << (WITH - 129)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (WITHEVENTS - 194)) | (1L << (WRITE - 194)) | (1L << (XOR - 194)) | (1L << (COMMENT - 194)) | (1L << (WS - 194)) | (1L << (IDENTIFIER - 194)))) != 0)) {
				{
				setState(1322);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
				case 1:
					{
					setState(1319);
					moduleDeclarations();
					}
					break;
				case 2:
					{
					setState(1320);
					moduleBody();
					}
					break;
				case 3:
					{
					setState(1321);
					block();
					}
					break;
				}
				}
				setState(1326);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MidStmtContext extends ParserRuleContext {
		public TerminalNode MID() { return getToken(VbaParser.MID, 0); }
		public TerminalNode LPAREN() { return getToken(VbaParser.LPAREN, 0); }
		public AmbiguousIdentifierContext ambiguousIdentifier() {
			return getRuleContext(AmbiguousIdentifierContext.class,0);
		}
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(VbaParser.RPAREN, 0); }
		public TerminalNode EQ() { return getToken(VbaParser.EQ, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public MidStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_midStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterMidStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitMidStmt(this);
		}
	}

	public final MidStmtContext midStmt() throws RecognitionException {
		MidStmtContext _localctx = new MidStmtContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_midStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1327);
			match(MID);
			setState(1329);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1328);
				match(WS);
				}
			}

			setState(1331);
			match(LPAREN);
			setState(1333);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1332);
				match(WS);
				}
			}

			setState(1335);
			ambiguousIdentifier();
			setState(1337);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1336);
				match(WS);
				}
			}

			setState(1339);
			match(T__0);
			setState(1341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				{
				setState(1340);
				match(WS);
				}
				break;
			}
			setState(1343);
			valueStmt(0);
			setState(1352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				{
				setState(1345);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1344);
					match(WS);
					}
				}

				setState(1347);
				match(T__0);
				setState(1349);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
				case 1:
					{
					setState(1348);
					match(WS);
					}
					break;
				}
				setState(1351);
				valueStmt(0);
				}
				break;
			}
			setState(1355);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1354);
				match(WS);
				}
			}

			setState(1357);
			match(RPAREN);
			setState(1359);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1358);
				match(WS);
				}
			}

			setState(1361);
			match(EQ);
			setState(1363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				{
				setState(1362);
				match(WS);
				}
				break;
			}
			setState(1365);
			valueStmt(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MkdirStmtContext extends ParserRuleContext {
		public TerminalNode MKDIR() { return getToken(VbaParser.MKDIR, 0); }
		public TerminalNode WS() { return getToken(VbaParser.WS, 0); }
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public MkdirStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mkdirStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterMkdirStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitMkdirStmt(this);
		}
	}

	public final MkdirStmtContext mkdirStmt() throws RecognitionException {
		MkdirStmtContext _localctx = new MkdirStmtContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_mkdirStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1367);
			match(MKDIR);
			setState(1368);
			match(WS);
			setState(1369);
			valueStmt(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameStmtContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(VbaParser.NAME, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public TerminalNode AS() { return getToken(VbaParser.AS, 0); }
		public NameStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterNameStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitNameStmt(this);
		}
	}

	public final NameStmtContext nameStmt() throws RecognitionException {
		NameStmtContext _localctx = new NameStmtContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_nameStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1371);
			match(NAME);
			setState(1372);
			match(WS);
			setState(1373);
			valueStmt(0);
			setState(1374);
			match(WS);
			setState(1375);
			match(AS);
			setState(1376);
			match(WS);
			setState(1377);
			valueStmt(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OnErrorStmtContext extends ParserRuleContext {
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public TerminalNode ON_ERROR() { return getToken(VbaParser.ON_ERROR, 0); }
		public TerminalNode ON_LOCAL_ERROR() { return getToken(VbaParser.ON_LOCAL_ERROR, 0); }
		public TerminalNode GOTO() { return getToken(VbaParser.GOTO, 0); }
		public AmbiguousIdentifierContext ambiguousIdentifier() {
			return getRuleContext(AmbiguousIdentifierContext.class,0);
		}
		public TerminalNode RESUME() { return getToken(VbaParser.RESUME, 0); }
		public TerminalNode NEXT() { return getToken(VbaParser.NEXT, 0); }
		public OnErrorStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onErrorStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterOnErrorStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitOnErrorStmt(this);
		}
	}

	public final OnErrorStmtContext onErrorStmt() throws RecognitionException {
		OnErrorStmtContext _localctx = new OnErrorStmtContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_onErrorStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1379);
			_la = _input.LA(1);
			if ( !(_la==ON_ERROR || _la==ON_LOCAL_ERROR) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1380);
			match(WS);
			setState(1387);
			switch (_input.LA(1)) {
			case GOTO:
				{
				setState(1381);
				match(GOTO);
				setState(1382);
				match(WS);
				setState(1383);
				ambiguousIdentifier();
				}
				break;
			case RESUME:
				{
				setState(1384);
				match(RESUME);
				setState(1385);
				match(WS);
				setState(1386);
				match(NEXT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OnGoToStmtContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(VbaParser.ON, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public TerminalNode GOTO() { return getToken(VbaParser.GOTO, 0); }
		public List<AmbiguousIdentifierContext> ambiguousIdentifier() {
			return getRuleContexts(AmbiguousIdentifierContext.class);
		}
		public AmbiguousIdentifierContext ambiguousIdentifier(int i) {
			return getRuleContext(AmbiguousIdentifierContext.class,i);
		}
		public OnGoToStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onGoToStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterOnGoToStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitOnGoToStmt(this);
		}
	}

	public final OnGoToStmtContext onGoToStmt() throws RecognitionException {
		OnGoToStmtContext _localctx = new OnGoToStmtContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_onGoToStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1389);
			match(ON);
			setState(1390);
			match(WS);
			setState(1391);
			valueStmt(0);
			setState(1392);
			match(WS);
			setState(1393);
			match(GOTO);
			setState(1394);
			match(WS);
			setState(1395);
			ambiguousIdentifier();
			setState(1406);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1397);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(1396);
						match(WS);
						}
					}

					setState(1399);
					match(T__0);
					setState(1401);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(1400);
						match(WS);
						}
					}

					setState(1403);
					ambiguousIdentifier();
					}
					} 
				}
				setState(1408);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OnGoSubStmtContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(VbaParser.ON, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public TerminalNode GOSUB() { return getToken(VbaParser.GOSUB, 0); }
		public List<AmbiguousIdentifierContext> ambiguousIdentifier() {
			return getRuleContexts(AmbiguousIdentifierContext.class);
		}
		public AmbiguousIdentifierContext ambiguousIdentifier(int i) {
			return getRuleContext(AmbiguousIdentifierContext.class,i);
		}
		public OnGoSubStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onGoSubStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterOnGoSubStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitOnGoSubStmt(this);
		}
	}

	public final OnGoSubStmtContext onGoSubStmt() throws RecognitionException {
		OnGoSubStmtContext _localctx = new OnGoSubStmtContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_onGoSubStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1409);
			match(ON);
			setState(1410);
			match(WS);
			setState(1411);
			valueStmt(0);
			setState(1412);
			match(WS);
			setState(1413);
			match(GOSUB);
			setState(1414);
			match(WS);
			setState(1415);
			ambiguousIdentifier();
			setState(1426);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1417);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(1416);
						match(WS);
						}
					}

					setState(1419);
					match(T__0);
					setState(1421);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(1420);
						match(WS);
						}
					}

					setState(1423);
					ambiguousIdentifier();
					}
					} 
				}
				setState(1428);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpenStmtContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(VbaParser.OPEN, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public TerminalNode FOR() { return getToken(VbaParser.FOR, 0); }
		public TerminalNode AS() { return getToken(VbaParser.AS, 0); }
		public FileNumberContext fileNumber() {
			return getRuleContext(FileNumberContext.class,0);
		}
		public TerminalNode APPEND() { return getToken(VbaParser.APPEND, 0); }
		public TerminalNode BINARY() { return getToken(VbaParser.BINARY, 0); }
		public TerminalNode INPUT() { return getToken(VbaParser.INPUT, 0); }
		public TerminalNode OUTPUT() { return getToken(VbaParser.OUTPUT, 0); }
		public TerminalNode RANDOM() { return getToken(VbaParser.RANDOM, 0); }
		public TerminalNode ACCESS() { return getToken(VbaParser.ACCESS, 0); }
		public TerminalNode LEN() { return getToken(VbaParser.LEN, 0); }
		public TerminalNode EQ() { return getToken(VbaParser.EQ, 0); }
		public TerminalNode READ() { return getToken(VbaParser.READ, 0); }
		public TerminalNode WRITE() { return getToken(VbaParser.WRITE, 0); }
		public TerminalNode READ_WRITE() { return getToken(VbaParser.READ_WRITE, 0); }
		public TerminalNode SHARED() { return getToken(VbaParser.SHARED, 0); }
		public TerminalNode LOCK_READ() { return getToken(VbaParser.LOCK_READ, 0); }
		public TerminalNode LOCK_WRITE() { return getToken(VbaParser.LOCK_WRITE, 0); }
		public TerminalNode LOCK_READ_WRITE() { return getToken(VbaParser.LOCK_READ_WRITE, 0); }
		public OpenStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterOpenStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitOpenStmt(this);
		}
	}

	public final OpenStmtContext openStmt() throws RecognitionException {
		OpenStmtContext _localctx = new OpenStmtContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_openStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1429);
			match(OPEN);
			setState(1430);
			match(WS);
			setState(1431);
			valueStmt(0);
			setState(1432);
			match(WS);
			setState(1433);
			match(FOR);
			setState(1434);
			match(WS);
			setState(1435);
			_la = _input.LA(1);
			if ( !(_la==APPEND || _la==BINARY || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (INPUT - 91)) | (1L << (OUTPUT - 91)) | (1L << (RANDOM - 91)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				{
				setState(1436);
				match(WS);
				setState(1437);
				match(ACCESS);
				setState(1438);
				match(WS);
				setState(1439);
				_la = _input.LA(1);
				if ( !(((((_la - 148)) & ~0x3f) == 0 && ((1L << (_la - 148)) & ((1L << (READ - 148)) | (1L << (READ_WRITE - 148)) | (1L << (WRITE - 148)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			}
			setState(1444);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				{
				setState(1442);
				match(WS);
				setState(1443);
				_la = _input.LA(1);
				if ( !(((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (LOCK_READ - 104)) | (1L << (LOCK_WRITE - 104)) | (1L << (LOCK_READ_WRITE - 104)) | (1L << (SHARED - 104)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			}
			setState(1446);
			match(WS);
			setState(1447);
			match(AS);
			setState(1448);
			match(WS);
			setState(1449);
			fileNumber();
			setState(1460);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				{
				setState(1450);
				match(WS);
				setState(1451);
				match(LEN);
				setState(1453);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1452);
					match(WS);
					}
				}

				setState(1455);
				match(EQ);
				setState(1457);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
				case 1:
					{
					setState(1456);
					match(WS);
					}
					break;
				}
				setState(1459);
				valueStmt(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutputListContext extends ParserRuleContext {
		public List<OutputList_ExpressionContext> outputList_Expression() {
			return getRuleContexts(OutputList_ExpressionContext.class);
		}
		public OutputList_ExpressionContext outputList_Expression(int i) {
			return getRuleContext(OutputList_ExpressionContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public OutputListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterOutputList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitOutputList(this);
		}
	}

	public final OutputListContext outputList() throws RecognitionException {
		OutputListContext _localctx = new OutputListContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_outputList);
		int _la;
		try {
			int _alt;
			setState(1495);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1462);
				outputList_Expression();
				setState(1475);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1464);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1463);
							match(WS);
							}
						}

						setState(1466);
						_la = _input.LA(1);
						if ( !(_la==T__0 || _la==T__1) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1468);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
						case 1:
							{
							setState(1467);
							match(WS);
							}
							break;
						}
						setState(1471);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
						case 1:
							{
							setState(1470);
							outputList_Expression();
							}
							break;
						}
						}
						} 
					}
					setState(1477);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1479);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
				case 1:
					{
					setState(1478);
					outputList_Expression();
					}
					break;
				}
				setState(1491); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1482);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1481);
							match(WS);
							}
						}

						setState(1484);
						_la = _input.LA(1);
						if ( !(_la==T__0 || _la==T__1) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1486);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
						case 1:
							{
							setState(1485);
							match(WS);
							}
							break;
						}
						setState(1489);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
						case 1:
							{
							setState(1488);
							outputList_Expression();
							}
							break;
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1493); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutputList_ExpressionContext extends ParserRuleContext {
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public TerminalNode SPC() { return getToken(VbaParser.SPC, 0); }
		public TerminalNode TAB() { return getToken(VbaParser.TAB, 0); }
		public TerminalNode LPAREN() { return getToken(VbaParser.LPAREN, 0); }
		public ArgsCallContext argsCall() {
			return getRuleContext(ArgsCallContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(VbaParser.RPAREN, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public OutputList_ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputList_Expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterOutputList_Expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitOutputList_Expression(this);
		}
	}

	public final OutputList_ExpressionContext outputList_Expression() throws RecognitionException {
		OutputList_ExpressionContext _localctx = new OutputList_ExpressionContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_outputList_Expression);
		int _la;
		try {
			setState(1514);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1497);
				valueStmt(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1498);
				_la = _input.LA(1);
				if ( !(_la==SPC || _la==TAB) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1512);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
				case 1:
					{
					setState(1500);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(1499);
						match(WS);
						}
					}

					setState(1502);
					match(LPAREN);
					setState(1504);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
					case 1:
						{
						setState(1503);
						match(WS);
						}
						break;
					}
					setState(1506);
					argsCall();
					setState(1508);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(1507);
						match(WS);
						}
					}

					setState(1510);
					match(RPAREN);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintStmtContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(VbaParser.PRINT, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public FileNumberContext fileNumber() {
			return getRuleContext(FileNumberContext.class,0);
		}
		public OutputListContext outputList() {
			return getRuleContext(OutputListContext.class,0);
		}
		public PrintStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterPrintStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitPrintStmt(this);
		}
	}

	public final PrintStmtContext printStmt() throws RecognitionException {
		PrintStmtContext _localctx = new PrintStmtContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_printStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1516);
			match(PRINT);
			setState(1517);
			match(WS);
			setState(1518);
			fileNumber();
			setState(1520);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1519);
				match(WS);
				}
			}

			setState(1522);
			match(T__0);
			setState(1527);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				{
				setState(1524);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
				case 1:
					{
					setState(1523);
					match(WS);
					}
					break;
				}
				setState(1526);
				outputList();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyGetStmtContext extends ParserRuleContext {
		public TerminalNode PROPERTY_GET() { return getToken(VbaParser.PROPERTY_GET, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public AmbiguousIdentifierContext ambiguousIdentifier() {
			return getRuleContext(AmbiguousIdentifierContext.class,0);
		}
		public EndOfStatementContext endOfStatement() {
			return getRuleContext(EndOfStatementContext.class,0);
		}
		public TerminalNode END_PROPERTY() { return getToken(VbaParser.END_PROPERTY, 0); }
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(VbaParser.STATIC, 0); }
		public TypeHintContext typeHint() {
			return getRuleContext(TypeHintContext.class,0);
		}
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public AsTypeClauseContext asTypeClause() {
			return getRuleContext(AsTypeClauseContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public PropertyGetStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyGetStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterPropertyGetStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitPropertyGetStmt(this);
		}
	}

	public final PropertyGetStmtContext propertyGetStmt() throws RecognitionException {
		PropertyGetStmtContext _localctx = new PropertyGetStmtContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_propertyGetStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1532);
			_la = _input.LA(1);
			if (((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (FRIEND - 79)) | (1L << (GLOBAL - 79)) | (1L << (PRIVATE - 79)))) != 0) || _la==PUBLIC) {
				{
				setState(1529);
				visibility();
				setState(1530);
				match(WS);
				}
			}

			setState(1536);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(1534);
				match(STATIC);
				setState(1535);
				match(WS);
				}
			}

			setState(1538);
			match(PROPERTY_GET);
			setState(1539);
			match(WS);
			setState(1540);
			ambiguousIdentifier();
			setState(1542);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0) || _la==AMPERSAND) {
				{
				setState(1541);
				typeHint();
				}
			}

			setState(1548);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				{
				setState(1545);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1544);
					match(WS);
					}
				}

				setState(1547);
				argList();
				}
				break;
			}
			setState(1552);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				{
				setState(1550);
				match(WS);
				setState(1551);
				asTypeClause();
				}
				break;
			}
			setState(1554);
			endOfStatement();
			setState(1556);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (END - 65)) | (1L << (ENUM - 65)) | (1L << (EQV - 65)) | (1L << (ERASE - 65)) | (1L << (ERROR - 65)) | (1L << (EVENT - 65)) | (1L << (EXIT_DO - 65)) | (1L << (EXIT_FOR - 65)) | (1L << (EXIT_FUNCTION - 65)) | (1L << (EXIT_PROPERTY - 65)) | (1L << (EXIT_SUB - 65)) | (1L << (EXIT_RULE - 65)) | (1L << (FALSE - 65)) | (1L << (FILECOPY - 65)) | (1L << (FRIEND - 65)) | (1L << (FOR - 65)) | (1L << (FUNCTION - 65)) | (1L << (GET - 65)) | (1L << (GLOBAL - 65)) | (1L << (GOSUB - 65)) | (1L << (GOTO - 65)) | (1L << (IF - 65)) | (1L << (IMP - 65)) | (1L << (IMPLEMENTS - 65)) | (1L << (IN - 65)) | (1L << (INPUT - 65)) | (1L << (IS - 65)) | (1L << (INTEGER - 65)) | (1L << (KILL - 65)) | (1L << (LOAD - 65)) | (1L << (LOCK - 65)) | (1L << (LONG - 65)) | (1L << (LOOP - 65)) | (1L << (LEN - 65)) | (1L << (LET - 65)) | (1L << (LIB - 65)) | (1L << (LIKE - 65)) | (1L << (LINE_INPUT - 65)) | (1L << (LSET - 65)) | (1L << (ME - 65)) | (1L << (MID - 65)) | (1L << (MKDIR - 65)) | (1L << (MOD - 65)) | (1L << (NAME - 65)) | (1L << (NEXT - 65)) | (1L << (NEW - 65)) | (1L << (NOT - 65)) | (1L << (NOTHING - 65)) | (1L << (NULL - 65)) | (1L << (EMPTY - 65)) | (1L << (ON - 65)) | (1L << (ON_ERROR - 65)) | (1L << (ON_LOCAL_ERROR - 65)) | (1L << (OPEN - 65)) | (1L << (OPTIONAL - 65)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (OR - 133)) | (1L << (OUTPUT - 133)) | (1L << (PARAMARRAY - 133)) | (1L << (PRESERVE - 133)) | (1L << (PRINT - 133)) | (1L << (PRIVATE - 133)) | (1L << (PUBLIC - 133)) | (1L << (PUT - 133)) | (1L << (RANDOM - 133)) | (1L << (RANDOMIZE - 133)) | (1L << (RAISEEVENT - 133)) | (1L << (READ - 133)) | (1L << (REDIM - 133)) | (1L << (REM - 133)) | (1L << (RESET - 133)) | (1L << (RESUME - 133)) | (1L << (RETURN - 133)) | (1L << (RMDIR - 133)) | (1L << (RSET - 133)) | (1L << (SAVEPICTURE - 133)) | (1L << (SAVESETTING - 133)) | (1L << (SEEK - 133)) | (1L << (SELECT - 133)) | (1L << (SENDKEYS - 133)) | (1L << (SET - 133)) | (1L << (SETATTR - 133)) | (1L << (SHARED - 133)) | (1L << (SINGLE - 133)) | (1L << (SPC - 133)) | (1L << (STATIC - 133)) | (1L << (STEP - 133)) | (1L << (STOP - 133)) | (1L << (STRING - 133)) | (1L << (SUB - 133)) | (1L << (TAB - 133)) | (1L << (TEXT - 133)) | (1L << (THEN - 133)) | (1L << (TIME - 133)) | (1L << (TO - 133)) | (1L << (TRUE - 133)) | (1L << (TYPE - 133)) | (1L << (TYPEOF - 133)) | (1L << (UNLOAD - 133)) | (1L << (UNLOCK - 133)) | (1L << (UNTIL - 133)) | (1L << (VARIANT - 133)) | (1L << (VERSION - 133)) | (1L << (WEND - 133)) | (1L << (WHILE - 133)) | (1L << (WIDTH - 133)) | (1L << (WITH - 133)) | (1L << (WITHEVENTS - 133)) | (1L << (WRITE - 133)) | (1L << (XOR - 133)))) != 0) || _la==WS || _la==IDENTIFIER) {
				{
				setState(1555);
				block();
				}
			}

			setState(1558);
			match(END_PROPERTY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertySetStmtContext extends ParserRuleContext {
		public TerminalNode PROPERTY_SET() { return getToken(VbaParser.PROPERTY_SET, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public AmbiguousIdentifierContext ambiguousIdentifier() {
			return getRuleContext(AmbiguousIdentifierContext.class,0);
		}
		public EndOfStatementContext endOfStatement() {
			return getRuleContext(EndOfStatementContext.class,0);
		}
		public TerminalNode END_PROPERTY() { return getToken(VbaParser.END_PROPERTY, 0); }
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(VbaParser.STATIC, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public PropertySetStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertySetStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterPropertySetStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitPropertySetStmt(this);
		}
	}

	public final PropertySetStmtContext propertySetStmt() throws RecognitionException {
		PropertySetStmtContext _localctx = new PropertySetStmtContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_propertySetStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1563);
			_la = _input.LA(1);
			if (((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (FRIEND - 79)) | (1L << (GLOBAL - 79)) | (1L << (PRIVATE - 79)))) != 0) || _la==PUBLIC) {
				{
				setState(1560);
				visibility();
				setState(1561);
				match(WS);
				}
			}

			setState(1567);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(1565);
				match(STATIC);
				setState(1566);
				match(WS);
				}
			}

			setState(1569);
			match(PROPERTY_SET);
			setState(1570);
			match(WS);
			setState(1571);
			ambiguousIdentifier();
			setState(1576);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
			case 1:
				{
				setState(1573);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1572);
					match(WS);
					}
				}

				setState(1575);
				argList();
				}
				break;
			}
			setState(1578);
			endOfStatement();
			setState(1580);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (END - 65)) | (1L << (ENUM - 65)) | (1L << (EQV - 65)) | (1L << (ERASE - 65)) | (1L << (ERROR - 65)) | (1L << (EVENT - 65)) | (1L << (EXIT_DO - 65)) | (1L << (EXIT_FOR - 65)) | (1L << (EXIT_FUNCTION - 65)) | (1L << (EXIT_PROPERTY - 65)) | (1L << (EXIT_SUB - 65)) | (1L << (EXIT_RULE - 65)) | (1L << (FALSE - 65)) | (1L << (FILECOPY - 65)) | (1L << (FRIEND - 65)) | (1L << (FOR - 65)) | (1L << (FUNCTION - 65)) | (1L << (GET - 65)) | (1L << (GLOBAL - 65)) | (1L << (GOSUB - 65)) | (1L << (GOTO - 65)) | (1L << (IF - 65)) | (1L << (IMP - 65)) | (1L << (IMPLEMENTS - 65)) | (1L << (IN - 65)) | (1L << (INPUT - 65)) | (1L << (IS - 65)) | (1L << (INTEGER - 65)) | (1L << (KILL - 65)) | (1L << (LOAD - 65)) | (1L << (LOCK - 65)) | (1L << (LONG - 65)) | (1L << (LOOP - 65)) | (1L << (LEN - 65)) | (1L << (LET - 65)) | (1L << (LIB - 65)) | (1L << (LIKE - 65)) | (1L << (LINE_INPUT - 65)) | (1L << (LSET - 65)) | (1L << (ME - 65)) | (1L << (MID - 65)) | (1L << (MKDIR - 65)) | (1L << (MOD - 65)) | (1L << (NAME - 65)) | (1L << (NEXT - 65)) | (1L << (NEW - 65)) | (1L << (NOT - 65)) | (1L << (NOTHING - 65)) | (1L << (NULL - 65)) | (1L << (EMPTY - 65)) | (1L << (ON - 65)) | (1L << (ON_ERROR - 65)) | (1L << (ON_LOCAL_ERROR - 65)) | (1L << (OPEN - 65)) | (1L << (OPTIONAL - 65)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (OR - 133)) | (1L << (OUTPUT - 133)) | (1L << (PARAMARRAY - 133)) | (1L << (PRESERVE - 133)) | (1L << (PRINT - 133)) | (1L << (PRIVATE - 133)) | (1L << (PUBLIC - 133)) | (1L << (PUT - 133)) | (1L << (RANDOM - 133)) | (1L << (RANDOMIZE - 133)) | (1L << (RAISEEVENT - 133)) | (1L << (READ - 133)) | (1L << (REDIM - 133)) | (1L << (REM - 133)) | (1L << (RESET - 133)) | (1L << (RESUME - 133)) | (1L << (RETURN - 133)) | (1L << (RMDIR - 133)) | (1L << (RSET - 133)) | (1L << (SAVEPICTURE - 133)) | (1L << (SAVESETTING - 133)) | (1L << (SEEK - 133)) | (1L << (SELECT - 133)) | (1L << (SENDKEYS - 133)) | (1L << (SET - 133)) | (1L << (SETATTR - 133)) | (1L << (SHARED - 133)) | (1L << (SINGLE - 133)) | (1L << (SPC - 133)) | (1L << (STATIC - 133)) | (1L << (STEP - 133)) | (1L << (STOP - 133)) | (1L << (STRING - 133)) | (1L << (SUB - 133)) | (1L << (TAB - 133)) | (1L << (TEXT - 133)) | (1L << (THEN - 133)) | (1L << (TIME - 133)) | (1L << (TO - 133)) | (1L << (TRUE - 133)) | (1L << (TYPE - 133)) | (1L << (TYPEOF - 133)) | (1L << (UNLOAD - 133)) | (1L << (UNLOCK - 133)) | (1L << (UNTIL - 133)) | (1L << (VARIANT - 133)) | (1L << (VERSION - 133)) | (1L << (WEND - 133)) | (1L << (WHILE - 133)) | (1L << (WIDTH - 133)) | (1L << (WITH - 133)) | (1L << (WITHEVENTS - 133)) | (1L << (WRITE - 133)) | (1L << (XOR - 133)))) != 0) || _la==WS || _la==IDENTIFIER) {
				{
				setState(1579);
				block();
				}
			}

			setState(1582);
			match(END_PROPERTY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyLetStmtContext extends ParserRuleContext {
		public TerminalNode PROPERTY_LET() { return getToken(VbaParser.PROPERTY_LET, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public AmbiguousIdentifierContext ambiguousIdentifier() {
			return getRuleContext(AmbiguousIdentifierContext.class,0);
		}
		public EndOfStatementContext endOfStatement() {
			return getRuleContext(EndOfStatementContext.class,0);
		}
		public TerminalNode END_PROPERTY() { return getToken(VbaParser.END_PROPERTY, 0); }
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(VbaParser.STATIC, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public PropertyLetStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyLetStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterPropertyLetStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitPropertyLetStmt(this);
		}
	}

	public final PropertyLetStmtContext propertyLetStmt() throws RecognitionException {
		PropertyLetStmtContext _localctx = new PropertyLetStmtContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_propertyLetStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1587);
			_la = _input.LA(1);
			if (((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (FRIEND - 79)) | (1L << (GLOBAL - 79)) | (1L << (PRIVATE - 79)))) != 0) || _la==PUBLIC) {
				{
				setState(1584);
				visibility();
				setState(1585);
				match(WS);
				}
			}

			setState(1591);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(1589);
				match(STATIC);
				setState(1590);
				match(WS);
				}
			}

			setState(1593);
			match(PROPERTY_LET);
			setState(1594);
			match(WS);
			setState(1595);
			ambiguousIdentifier();
			setState(1600);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				{
				setState(1597);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1596);
					match(WS);
					}
				}

				setState(1599);
				argList();
				}
				break;
			}
			setState(1602);
			endOfStatement();
			setState(1604);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (END - 65)) | (1L << (ENUM - 65)) | (1L << (EQV - 65)) | (1L << (ERASE - 65)) | (1L << (ERROR - 65)) | (1L << (EVENT - 65)) | (1L << (EXIT_DO - 65)) | (1L << (EXIT_FOR - 65)) | (1L << (EXIT_FUNCTION - 65)) | (1L << (EXIT_PROPERTY - 65)) | (1L << (EXIT_SUB - 65)) | (1L << (EXIT_RULE - 65)) | (1L << (FALSE - 65)) | (1L << (FILECOPY - 65)) | (1L << (FRIEND - 65)) | (1L << (FOR - 65)) | (1L << (FUNCTION - 65)) | (1L << (GET - 65)) | (1L << (GLOBAL - 65)) | (1L << (GOSUB - 65)) | (1L << (GOTO - 65)) | (1L << (IF - 65)) | (1L << (IMP - 65)) | (1L << (IMPLEMENTS - 65)) | (1L << (IN - 65)) | (1L << (INPUT - 65)) | (1L << (IS - 65)) | (1L << (INTEGER - 65)) | (1L << (KILL - 65)) | (1L << (LOAD - 65)) | (1L << (LOCK - 65)) | (1L << (LONG - 65)) | (1L << (LOOP - 65)) | (1L << (LEN - 65)) | (1L << (LET - 65)) | (1L << (LIB - 65)) | (1L << (LIKE - 65)) | (1L << (LINE_INPUT - 65)) | (1L << (LSET - 65)) | (1L << (ME - 65)) | (1L << (MID - 65)) | (1L << (MKDIR - 65)) | (1L << (MOD - 65)) | (1L << (NAME - 65)) | (1L << (NEXT - 65)) | (1L << (NEW - 65)) | (1L << (NOT - 65)) | (1L << (NOTHING - 65)) | (1L << (NULL - 65)) | (1L << (EMPTY - 65)) | (1L << (ON - 65)) | (1L << (ON_ERROR - 65)) | (1L << (ON_LOCAL_ERROR - 65)) | (1L << (OPEN - 65)) | (1L << (OPTIONAL - 65)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (OR - 133)) | (1L << (OUTPUT - 133)) | (1L << (PARAMARRAY - 133)) | (1L << (PRESERVE - 133)) | (1L << (PRINT - 133)) | (1L << (PRIVATE - 133)) | (1L << (PUBLIC - 133)) | (1L << (PUT - 133)) | (1L << (RANDOM - 133)) | (1L << (RANDOMIZE - 133)) | (1L << (RAISEEVENT - 133)) | (1L << (READ - 133)) | (1L << (REDIM - 133)) | (1L << (REM - 133)) | (1L << (RESET - 133)) | (1L << (RESUME - 133)) | (1L << (RETURN - 133)) | (1L << (RMDIR - 133)) | (1L << (RSET - 133)) | (1L << (SAVEPICTURE - 133)) | (1L << (SAVESETTING - 133)) | (1L << (SEEK - 133)) | (1L << (SELECT - 133)) | (1L << (SENDKEYS - 133)) | (1L << (SET - 133)) | (1L << (SETATTR - 133)) | (1L << (SHARED - 133)) | (1L << (SINGLE - 133)) | (1L << (SPC - 133)) | (1L << (STATIC - 133)) | (1L << (STEP - 133)) | (1L << (STOP - 133)) | (1L << (STRING - 133)) | (1L << (SUB - 133)) | (1L << (TAB - 133)) | (1L << (TEXT - 133)) | (1L << (THEN - 133)) | (1L << (TIME - 133)) | (1L << (TO - 133)) | (1L << (TRUE - 133)) | (1L << (TYPE - 133)) | (1L << (TYPEOF - 133)) | (1L << (UNLOAD - 133)) | (1L << (UNLOCK - 133)) | (1L << (UNTIL - 133)) | (1L << (VARIANT - 133)) | (1L << (VERSION - 133)) | (1L << (WEND - 133)) | (1L << (WHILE - 133)) | (1L << (WIDTH - 133)) | (1L << (WITH - 133)) | (1L << (WITHEVENTS - 133)) | (1L << (WRITE - 133)) | (1L << (XOR - 133)))) != 0) || _la==WS || _la==IDENTIFIER) {
				{
				setState(1603);
				block();
				}
			}

			setState(1606);
			match(END_PROPERTY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PutStmtContext extends ParserRuleContext {
		public TerminalNode PUT() { return getToken(VbaParser.PUT, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public FileNumberContext fileNumber() {
			return getRuleContext(FileNumberContext.class,0);
		}
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public PutStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_putStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterPutStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitPutStmt(this);
		}
	}

	public final PutStmtContext putStmt() throws RecognitionException {
		PutStmtContext _localctx = new PutStmtContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_putStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1608);
			match(PUT);
			setState(1609);
			match(WS);
			setState(1610);
			fileNumber();
			setState(1612);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1611);
				match(WS);
				}
			}

			setState(1614);
			match(T__0);
			setState(1616);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
			case 1:
				{
				setState(1615);
				match(WS);
				}
				break;
			}
			setState(1619);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
			case 1:
				{
				setState(1618);
				valueStmt(0);
				}
				break;
			}
			setState(1622);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1621);
				match(WS);
				}
			}

			setState(1624);
			match(T__0);
			setState(1626);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
			case 1:
				{
				setState(1625);
				match(WS);
				}
				break;
			}
			setState(1628);
			valueStmt(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RaiseEventStmtContext extends ParserRuleContext {
		public TerminalNode RAISEEVENT() { return getToken(VbaParser.RAISEEVENT, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public AmbiguousIdentifierContext ambiguousIdentifier() {
			return getRuleContext(AmbiguousIdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(VbaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(VbaParser.RPAREN, 0); }
		public ArgsCallContext argsCall() {
			return getRuleContext(ArgsCallContext.class,0);
		}
		public RaiseEventStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raiseEventStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterRaiseEventStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitRaiseEventStmt(this);
		}
	}

	public final RaiseEventStmtContext raiseEventStmt() throws RecognitionException {
		RaiseEventStmtContext _localctx = new RaiseEventStmtContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_raiseEventStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1630);
			match(RAISEEVENT);
			setState(1631);
			match(WS);
			setState(1632);
			ambiguousIdentifier();
			setState(1647);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
			case 1:
				{
				setState(1634);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1633);
					match(WS);
					}
				}

				setState(1636);
				match(LPAREN);
				setState(1638);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
				case 1:
					{
					setState(1637);
					match(WS);
					}
					break;
				}
				setState(1644);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (ENUM - 66)) | (1L << (EQV - 66)) | (1L << (ERASE - 66)) | (1L << (ERROR - 66)) | (1L << (EVENT - 66)) | (1L << (FALSE - 66)) | (1L << (FILECOPY - 66)) | (1L << (FRIEND - 66)) | (1L << (FOR - 66)) | (1L << (FUNCTION - 66)) | (1L << (GET - 66)) | (1L << (GLOBAL - 66)) | (1L << (GOSUB - 66)) | (1L << (GOTO - 66)) | (1L << (IF - 66)) | (1L << (IMP - 66)) | (1L << (IMPLEMENTS - 66)) | (1L << (IN - 66)) | (1L << (INPUT - 66)) | (1L << (IS - 66)) | (1L << (INTEGER - 66)) | (1L << (KILL - 66)) | (1L << (LOAD - 66)) | (1L << (LOCK - 66)) | (1L << (LONG - 66)) | (1L << (LOOP - 66)) | (1L << (LEN - 66)) | (1L << (LET - 66)) | (1L << (LIB - 66)) | (1L << (LIKE - 66)) | (1L << (LSET - 66)) | (1L << (ME - 66)) | (1L << (MID - 66)) | (1L << (MKDIR - 66)) | (1L << (MOD - 66)) | (1L << (NAME - 66)) | (1L << (NEXT - 66)) | (1L << (NEW - 66)) | (1L << (NOT - 66)) | (1L << (NOTHING - 66)) | (1L << (NULL - 66)) | (1L << (EMPTY - 66)) | (1L << (ON - 66)) | (1L << (OPEN - 66)) | (1L << (OPTIONAL - 66)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (OR - 133)) | (1L << (OUTPUT - 133)) | (1L << (PARAMARRAY - 133)) | (1L << (PRESERVE - 133)) | (1L << (PRINT - 133)) | (1L << (PRIVATE - 133)) | (1L << (PUBLIC - 133)) | (1L << (PUT - 133)) | (1L << (RANDOM - 133)) | (1L << (RANDOMIZE - 133)) | (1L << (RAISEEVENT - 133)) | (1L << (READ - 133)) | (1L << (REDIM - 133)) | (1L << (REM - 133)) | (1L << (RESET - 133)) | (1L << (RESUME - 133)) | (1L << (RETURN - 133)) | (1L << (RMDIR - 133)) | (1L << (RSET - 133)) | (1L << (SAVEPICTURE - 133)) | (1L << (SAVESETTING - 133)) | (1L << (SEEK - 133)) | (1L << (SELECT - 133)) | (1L << (SENDKEYS - 133)) | (1L << (SET - 133)) | (1L << (SETATTR - 133)) | (1L << (SHARED - 133)) | (1L << (SINGLE - 133)) | (1L << (SPC - 133)) | (1L << (STATIC - 133)) | (1L << (STEP - 133)) | (1L << (STRING - 133)) | (1L << (SUB - 133)) | (1L << (TAB - 133)) | (1L << (TEXT - 133)) | (1L << (THEN - 133)) | (1L << (TIME - 133)) | (1L << (TO - 133)) | (1L << (TRUE - 133)) | (1L << (TYPE - 133)) | (1L << (TYPEOF - 133)) | (1L << (UNLOAD - 133)) | (1L << (UNLOCK - 133)) | (1L << (UNTIL - 133)) | (1L << (VARIANT - 133)) | (1L << (VERSION - 133)) | (1L << (WEND - 133)) | (1L << (WHILE - 133)) | (1L << (WIDTH - 133)) | (1L << (WITH - 133)) | (1L << (WITHEVENTS - 133)) | (1L << (WRITE - 133)) | (1L << (XOR - 133)))) != 0) || ((((_la - 204)) & ~0x3f) == 0 && ((1L << (_la - 204)) & ((1L << (LPAREN - 204)) | (1L << (MINUS - 204)) | (1L << (PLUS - 204)) | (1L << (STRINGLITERAL - 204)) | (1L << (OCTLITERAL - 204)) | (1L << (HEXLITERAL - 204)) | (1L << (SHORTLITERAL - 204)) | (1L << (INTEGERLITERAL - 204)) | (1L << (DOUBLELITERAL - 204)) | (1L << (DATELITERAL - 204)) | (1L << (WS - 204)) | (1L << (IDENTIFIER - 204)))) != 0)) {
					{
					setState(1640);
					argsCall();
					setState(1642);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(1641);
						match(WS);
						}
					}

					}
				}

				setState(1646);
				match(RPAREN);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RandomizeStmtContext extends ParserRuleContext {
		public TerminalNode RANDOMIZE() { return getToken(VbaParser.RANDOMIZE, 0); }
		public TerminalNode WS() { return getToken(VbaParser.WS, 0); }
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public RandomizeStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_randomizeStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterRandomizeStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitRandomizeStmt(this);
		}
	}

	public final RandomizeStmtContext randomizeStmt() throws RecognitionException {
		RandomizeStmtContext _localctx = new RandomizeStmtContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_randomizeStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1649);
			match(RANDOMIZE);
			setState(1652);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1650);
				match(WS);
				setState(1651);
				valueStmt(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RedimStmtContext extends ParserRuleContext {
		public TerminalNode REDIM() { return getToken(VbaParser.REDIM, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public List<RedimSubStmtContext> redimSubStmt() {
			return getRuleContexts(RedimSubStmtContext.class);
		}
		public RedimSubStmtContext redimSubStmt(int i) {
			return getRuleContext(RedimSubStmtContext.class,i);
		}
		public TerminalNode PRESERVE() { return getToken(VbaParser.PRESERVE, 0); }
		public RedimStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_redimStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterRedimStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitRedimStmt(this);
		}
	}

	public final RedimStmtContext redimStmt() throws RecognitionException {
		RedimStmtContext _localctx = new RedimStmtContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_redimStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1654);
			match(REDIM);
			setState(1655);
			match(WS);
			setState(1658);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
			case 1:
				{
				setState(1656);
				match(PRESERVE);
				setState(1657);
				match(WS);
				}
				break;
			}
			setState(1660);
			redimSubStmt();
			setState(1671);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,236,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1662);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(1661);
						match(WS);
						}
					}

					setState(1664);
					match(T__0);
					setState(1666);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(1665);
						match(WS);
						}
					}

					setState(1668);
					redimSubStmt();
					}
					} 
				}
				setState(1673);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,236,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RedimSubStmtContext extends ParserRuleContext {
		public AmbiguousIdentifierContext ambiguousIdentifier() {
			return getRuleContext(AmbiguousIdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(VbaParser.LPAREN, 0); }
		public SubscriptsContext subscripts() {
			return getRuleContext(SubscriptsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(VbaParser.RPAREN, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public AsTypeClauseContext asTypeClause() {
			return getRuleContext(AsTypeClauseContext.class,0);
		}
		public RedimSubStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_redimSubStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterRedimSubStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitRedimSubStmt(this);
		}
	}

	public final RedimSubStmtContext redimSubStmt() throws RecognitionException {
		RedimSubStmtContext _localctx = new RedimSubStmtContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_redimSubStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1674);
			ambiguousIdentifier();
			setState(1676);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1675);
				match(WS);
				}
			}

			setState(1678);
			match(LPAREN);
			setState(1680);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
			case 1:
				{
				setState(1679);
				match(WS);
				}
				break;
			}
			setState(1682);
			subscripts();
			setState(1684);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1683);
				match(WS);
				}
			}

			setState(1686);
			match(RPAREN);
			setState(1689);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
			case 1:
				{
				setState(1687);
				match(WS);
				setState(1688);
				asTypeClause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResetStmtContext extends ParserRuleContext {
		public TerminalNode RESET() { return getToken(VbaParser.RESET, 0); }
		public ResetStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resetStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterResetStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitResetStmt(this);
		}
	}

	public final ResetStmtContext resetStmt() throws RecognitionException {
		ResetStmtContext _localctx = new ResetStmtContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_resetStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1691);
			match(RESET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResumeStmtContext extends ParserRuleContext {
		public TerminalNode RESUME() { return getToken(VbaParser.RESUME, 0); }
		public TerminalNode WS() { return getToken(VbaParser.WS, 0); }
		public TerminalNode NEXT() { return getToken(VbaParser.NEXT, 0); }
		public AmbiguousIdentifierContext ambiguousIdentifier() {
			return getRuleContext(AmbiguousIdentifierContext.class,0);
		}
		public ResumeStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resumeStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterResumeStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitResumeStmt(this);
		}
	}

	public final ResumeStmtContext resumeStmt() throws RecognitionException {
		ResumeStmtContext _localctx = new ResumeStmtContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_resumeStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1693);
			match(RESUME);
			setState(1699);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
			case 1:
				{
				setState(1694);
				match(WS);
				setState(1697);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
				case 1:
					{
					setState(1695);
					match(NEXT);
					}
					break;
				case 2:
					{
					setState(1696);
					ambiguousIdentifier();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(VbaParser.RETURN, 0); }
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitReturnStmt(this);
		}
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_returnStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1701);
			match(RETURN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RmdirStmtContext extends ParserRuleContext {
		public TerminalNode RMDIR() { return getToken(VbaParser.RMDIR, 0); }
		public TerminalNode WS() { return getToken(VbaParser.WS, 0); }
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public RmdirStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rmdirStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterRmdirStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitRmdirStmt(this);
		}
	}

	public final RmdirStmtContext rmdirStmt() throws RecognitionException {
		RmdirStmtContext _localctx = new RmdirStmtContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_rmdirStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1703);
			match(RMDIR);
			setState(1704);
			match(WS);
			setState(1705);
			valueStmt(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RsetStmtContext extends ParserRuleContext {
		public TerminalNode RSET() { return getToken(VbaParser.RSET, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public ImplicitCallStmt_InStmtContext implicitCallStmt_InStmt() {
			return getRuleContext(ImplicitCallStmt_InStmtContext.class,0);
		}
		public TerminalNode EQ() { return getToken(VbaParser.EQ, 0); }
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public RsetStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rsetStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterRsetStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitRsetStmt(this);
		}
	}

	public final RsetStmtContext rsetStmt() throws RecognitionException {
		RsetStmtContext _localctx = new RsetStmtContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_rsetStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1707);
			match(RSET);
			setState(1708);
			match(WS);
			setState(1709);
			implicitCallStmt_InStmt();
			setState(1711);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1710);
				match(WS);
				}
			}

			setState(1713);
			match(EQ);
			setState(1715);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
			case 1:
				{
				setState(1714);
				match(WS);
				}
				break;
			}
			setState(1717);
			valueStmt(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SavepictureStmtContext extends ParserRuleContext {
		public TerminalNode SAVEPICTURE() { return getToken(VbaParser.SAVEPICTURE, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public SavepictureStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepictureStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterSavepictureStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitSavepictureStmt(this);
		}
	}

	public final SavepictureStmtContext savepictureStmt() throws RecognitionException {
		SavepictureStmtContext _localctx = new SavepictureStmtContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_savepictureStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1719);
			match(SAVEPICTURE);
			setState(1720);
			match(WS);
			setState(1721);
			valueStmt(0);
			setState(1723);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1722);
				match(WS);
				}
			}

			setState(1725);
			match(T__0);
			setState(1727);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
			case 1:
				{
				setState(1726);
				match(WS);
				}
				break;
			}
			setState(1729);
			valueStmt(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SaveSettingStmtContext extends ParserRuleContext {
		public TerminalNode SAVESETTING() { return getToken(VbaParser.SAVESETTING, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public SaveSettingStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_saveSettingStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterSaveSettingStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitSaveSettingStmt(this);
		}
	}

	public final SaveSettingStmtContext saveSettingStmt() throws RecognitionException {
		SaveSettingStmtContext _localctx = new SaveSettingStmtContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_saveSettingStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1731);
			match(SAVESETTING);
			setState(1732);
			match(WS);
			setState(1733);
			valueStmt(0);
			setState(1735);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1734);
				match(WS);
				}
			}

			setState(1737);
			match(T__0);
			setState(1739);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
			case 1:
				{
				setState(1738);
				match(WS);
				}
				break;
			}
			setState(1741);
			valueStmt(0);
			setState(1743);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1742);
				match(WS);
				}
			}

			setState(1745);
			match(T__0);
			setState(1747);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
			case 1:
				{
				setState(1746);
				match(WS);
				}
				break;
			}
			setState(1749);
			valueStmt(0);
			setState(1751);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1750);
				match(WS);
				}
			}

			setState(1753);
			match(T__0);
			setState(1755);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
			case 1:
				{
				setState(1754);
				match(WS);
				}
				break;
			}
			setState(1757);
			valueStmt(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SeekStmtContext extends ParserRuleContext {
		public TerminalNode SEEK() { return getToken(VbaParser.SEEK, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public FileNumberContext fileNumber() {
			return getRuleContext(FileNumberContext.class,0);
		}
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public SeekStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seekStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterSeekStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitSeekStmt(this);
		}
	}

	public final SeekStmtContext seekStmt() throws RecognitionException {
		SeekStmtContext _localctx = new SeekStmtContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_seekStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1759);
			match(SEEK);
			setState(1760);
			match(WS);
			setState(1761);
			fileNumber();
			setState(1763);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1762);
				match(WS);
				}
			}

			setState(1765);
			match(T__0);
			setState(1767);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
			case 1:
				{
				setState(1766);
				match(WS);
				}
				break;
			}
			setState(1769);
			valueStmt(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectCaseStmtContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(VbaParser.SELECT, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public TerminalNode CASE() { return getToken(VbaParser.CASE, 0); }
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public EndOfStatementContext endOfStatement() {
			return getRuleContext(EndOfStatementContext.class,0);
		}
		public TerminalNode END_SELECT() { return getToken(VbaParser.END_SELECT, 0); }
		public List<SC_CaseContext> sC_Case() {
			return getRuleContexts(SC_CaseContext.class);
		}
		public SC_CaseContext sC_Case(int i) {
			return getRuleContext(SC_CaseContext.class,i);
		}
		public SelectCaseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectCaseStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterSelectCaseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitSelectCaseStmt(this);
		}
	}

	public final SelectCaseStmtContext selectCaseStmt() throws RecognitionException {
		SelectCaseStmtContext _localctx = new SelectCaseStmtContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_selectCaseStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1771);
			match(SELECT);
			setState(1772);
			match(WS);
			setState(1773);
			match(CASE);
			setState(1774);
			match(WS);
			setState(1775);
			valueStmt(0);
			setState(1776);
			endOfStatement();
			setState(1780);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(1777);
				sC_Case();
				}
				}
				setState(1782);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1783);
			match(END_SELECT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SC_SelectionContext extends ParserRuleContext {
		public SC_SelectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sC_Selection; }
	 
		public SC_SelectionContext() { }
		public void copyFrom(SC_SelectionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CaseCondValueContext extends SC_SelectionContext {
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public CaseCondValueContext(SC_SelectionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterCaseCondValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitCaseCondValue(this);
		}
	}
	public static class CaseCondToContext extends SC_SelectionContext {
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public TerminalNode TO() { return getToken(VbaParser.TO, 0); }
		public CaseCondToContext(SC_SelectionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterCaseCondTo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitCaseCondTo(this);
		}
	}
	public static class CaseCondIsContext extends SC_SelectionContext {
		public TerminalNode IS() { return getToken(VbaParser.IS, 0); }
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public CaseCondIsContext(SC_SelectionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterCaseCondIs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitCaseCondIs(this);
		}
	}

	public final SC_SelectionContext sC_Selection() throws RecognitionException {
		SC_SelectionContext _localctx = new SC_SelectionContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_sC_Selection);
		int _la;
		try {
			setState(1802);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
			case 1:
				_localctx = new CaseCondIsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1785);
				match(IS);
				setState(1787);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1786);
					match(WS);
					}
				}

				setState(1789);
				comparisonOperator();
				setState(1791);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
				case 1:
					{
					setState(1790);
					match(WS);
					}
					break;
				}
				setState(1793);
				valueStmt(0);
				}
				break;
			case 2:
				_localctx = new CaseCondToContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1795);
				valueStmt(0);
				setState(1796);
				match(WS);
				setState(1797);
				match(TO);
				setState(1798);
				match(WS);
				setState(1799);
				valueStmt(0);
				}
				break;
			case 3:
				_localctx = new CaseCondValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1801);
				valueStmt(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SC_CaseContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(VbaParser.CASE, 0); }
		public TerminalNode WS() { return getToken(VbaParser.WS, 0); }
		public SC_CondContext sC_Cond() {
			return getRuleContext(SC_CondContext.class,0);
		}
		public EndOfStatementContext endOfStatement() {
			return getRuleContext(EndOfStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public SC_CaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sC_Case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterSC_Case(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitSC_Case(this);
		}
	}

	public final SC_CaseContext sC_Case() throws RecognitionException {
		SC_CaseContext _localctx = new SC_CaseContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_sC_Case);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1804);
			match(CASE);
			setState(1805);
			match(WS);
			setState(1806);
			sC_Cond();
			setState(1807);
			endOfStatement();
			setState(1809);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (END - 65)) | (1L << (ENUM - 65)) | (1L << (EQV - 65)) | (1L << (ERASE - 65)) | (1L << (ERROR - 65)) | (1L << (EVENT - 65)) | (1L << (EXIT_DO - 65)) | (1L << (EXIT_FOR - 65)) | (1L << (EXIT_FUNCTION - 65)) | (1L << (EXIT_PROPERTY - 65)) | (1L << (EXIT_SUB - 65)) | (1L << (EXIT_RULE - 65)) | (1L << (FALSE - 65)) | (1L << (FILECOPY - 65)) | (1L << (FRIEND - 65)) | (1L << (FOR - 65)) | (1L << (FUNCTION - 65)) | (1L << (GET - 65)) | (1L << (GLOBAL - 65)) | (1L << (GOSUB - 65)) | (1L << (GOTO - 65)) | (1L << (IF - 65)) | (1L << (IMP - 65)) | (1L << (IMPLEMENTS - 65)) | (1L << (IN - 65)) | (1L << (INPUT - 65)) | (1L << (IS - 65)) | (1L << (INTEGER - 65)) | (1L << (KILL - 65)) | (1L << (LOAD - 65)) | (1L << (LOCK - 65)) | (1L << (LONG - 65)) | (1L << (LOOP - 65)) | (1L << (LEN - 65)) | (1L << (LET - 65)) | (1L << (LIB - 65)) | (1L << (LIKE - 65)) | (1L << (LINE_INPUT - 65)) | (1L << (LSET - 65)) | (1L << (ME - 65)) | (1L << (MID - 65)) | (1L << (MKDIR - 65)) | (1L << (MOD - 65)) | (1L << (NAME - 65)) | (1L << (NEXT - 65)) | (1L << (NEW - 65)) | (1L << (NOT - 65)) | (1L << (NOTHING - 65)) | (1L << (NULL - 65)) | (1L << (EMPTY - 65)) | (1L << (ON - 65)) | (1L << (ON_ERROR - 65)) | (1L << (ON_LOCAL_ERROR - 65)) | (1L << (OPEN - 65)) | (1L << (OPTIONAL - 65)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (OR - 133)) | (1L << (OUTPUT - 133)) | (1L << (PARAMARRAY - 133)) | (1L << (PRESERVE - 133)) | (1L << (PRINT - 133)) | (1L << (PRIVATE - 133)) | (1L << (PUBLIC - 133)) | (1L << (PUT - 133)) | (1L << (RANDOM - 133)) | (1L << (RANDOMIZE - 133)) | (1L << (RAISEEVENT - 133)) | (1L << (READ - 133)) | (1L << (REDIM - 133)) | (1L << (REM - 133)) | (1L << (RESET - 133)) | (1L << (RESUME - 133)) | (1L << (RETURN - 133)) | (1L << (RMDIR - 133)) | (1L << (RSET - 133)) | (1L << (SAVEPICTURE - 133)) | (1L << (SAVESETTING - 133)) | (1L << (SEEK - 133)) | (1L << (SELECT - 133)) | (1L << (SENDKEYS - 133)) | (1L << (SET - 133)) | (1L << (SETATTR - 133)) | (1L << (SHARED - 133)) | (1L << (SINGLE - 133)) | (1L << (SPC - 133)) | (1L << (STATIC - 133)) | (1L << (STEP - 133)) | (1L << (STOP - 133)) | (1L << (STRING - 133)) | (1L << (SUB - 133)) | (1L << (TAB - 133)) | (1L << (TEXT - 133)) | (1L << (THEN - 133)) | (1L << (TIME - 133)) | (1L << (TO - 133)) | (1L << (TRUE - 133)) | (1L << (TYPE - 133)) | (1L << (TYPEOF - 133)) | (1L << (UNLOAD - 133)) | (1L << (UNLOCK - 133)) | (1L << (UNTIL - 133)) | (1L << (VARIANT - 133)) | (1L << (VERSION - 133)) | (1L << (WEND - 133)) | (1L << (WHILE - 133)) | (1L << (WIDTH - 133)) | (1L << (WITH - 133)) | (1L << (WITHEVENTS - 133)) | (1L << (WRITE - 133)) | (1L << (XOR - 133)))) != 0) || _la==WS || _la==IDENTIFIER) {
				{
				setState(1808);
				block();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SC_CondContext extends ParserRuleContext {
		public SC_CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sC_Cond; }
	 
		public SC_CondContext() { }
		public void copyFrom(SC_CondContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CaseCondSelectionContext extends SC_CondContext {
		public List<SC_SelectionContext> sC_Selection() {
			return getRuleContexts(SC_SelectionContext.class);
		}
		public SC_SelectionContext sC_Selection(int i) {
			return getRuleContext(SC_SelectionContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public CaseCondSelectionContext(SC_CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterCaseCondSelection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitCaseCondSelection(this);
		}
	}
	public static class CaseCondElseContext extends SC_CondContext {
		public TerminalNode ELSE() { return getToken(VbaParser.ELSE, 0); }
		public CaseCondElseContext(SC_CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterCaseCondElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitCaseCondElse(this);
		}
	}

	public final SC_CondContext sC_Cond() throws RecognitionException {
		SC_CondContext _localctx = new SC_CondContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_sC_Cond);
		int _la;
		try {
			int _alt;
			setState(1826);
			switch (_input.LA(1)) {
			case ELSE:
				_localctx = new CaseCondElseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1811);
				match(ELSE);
				}
				break;
			case T__2:
			case T__4:
			case ACCESS:
			case ADDRESSOF:
			case ALIAS:
			case AND:
			case ATTRIBUTE:
			case APPACTIVATE:
			case APPEND:
			case BEGIN:
			case BEEP:
			case BINARY:
			case BOOLEAN:
			case BYVAL:
			case BYREF:
			case BYTE:
			case CALL:
			case CHDIR:
			case CHDRIVE:
			case CLASS:
			case CLOSE:
			case COLLECTION:
			case CONST:
			case DATABASE:
			case DATE:
			case DECLARE:
			case DEFBOOL:
			case DEFBYTE:
			case DEFDATE:
			case DEFDBL:
			case DEFDEC:
			case DEFCUR:
			case DEFINT:
			case DEFLNG:
			case DEFOBJ:
			case DEFSNG:
			case DEFSTR:
			case DEFVAR:
			case DELETESETTING:
			case DIM:
			case DO:
			case DOUBLE:
			case EACH:
			case ENUM:
			case EQV:
			case ERASE:
			case ERROR:
			case EVENT:
			case FALSE:
			case FILECOPY:
			case FRIEND:
			case FOR:
			case FUNCTION:
			case GET:
			case GLOBAL:
			case GOSUB:
			case GOTO:
			case IF:
			case IMP:
			case IMPLEMENTS:
			case IN:
			case INPUT:
			case IS:
			case INTEGER:
			case KILL:
			case LOAD:
			case LOCK:
			case LONG:
			case LOOP:
			case LEN:
			case LET:
			case LIB:
			case LIKE:
			case LSET:
			case ME:
			case MID:
			case MKDIR:
			case MOD:
			case NAME:
			case NEXT:
			case NEW:
			case NOT:
			case NOTHING:
			case NULL:
			case EMPTY:
			case ON:
			case OPEN:
			case OPTIONAL:
			case OR:
			case OUTPUT:
			case PARAMARRAY:
			case PRESERVE:
			case PRINT:
			case PRIVATE:
			case PUBLIC:
			case PUT:
			case RANDOM:
			case RANDOMIZE:
			case RAISEEVENT:
			case READ:
			case REDIM:
			case REM:
			case RESET:
			case RESUME:
			case RETURN:
			case RMDIR:
			case RSET:
			case SAVEPICTURE:
			case SAVESETTING:
			case SEEK:
			case SELECT:
			case SENDKEYS:
			case SET:
			case SETATTR:
			case SHARED:
			case SINGLE:
			case SPC:
			case STATIC:
			case STEP:
			case STRING:
			case SUB:
			case TAB:
			case TEXT:
			case THEN:
			case TIME:
			case TO:
			case TRUE:
			case TYPE:
			case TYPEOF:
			case UNLOAD:
			case UNLOCK:
			case UNTIL:
			case VARIANT:
			case VERSION:
			case WEND:
			case WHILE:
			case WIDTH:
			case WITH:
			case WITHEVENTS:
			case WRITE:
			case XOR:
			case LPAREN:
			case MINUS:
			case PLUS:
			case STRINGLITERAL:
			case OCTLITERAL:
			case HEXLITERAL:
			case SHORTLITERAL:
			case INTEGERLITERAL:
			case DOUBLELITERAL:
			case DATELITERAL:
			case WS:
			case IDENTIFIER:
				_localctx = new CaseCondSelectionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1812);
				sC_Selection();
				setState(1823);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,262,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1814);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1813);
							match(WS);
							}
						}

						setState(1816);
						match(T__0);
						setState(1818);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
						case 1:
							{
							setState(1817);
							match(WS);
							}
							break;
						}
						setState(1820);
						sC_Selection();
						}
						} 
					}
					setState(1825);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,262,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SendkeysStmtContext extends ParserRuleContext {
		public TerminalNode SENDKEYS() { return getToken(VbaParser.SENDKEYS, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public SendkeysStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sendkeysStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterSendkeysStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitSendkeysStmt(this);
		}
	}

	public final SendkeysStmtContext sendkeysStmt() throws RecognitionException {
		SendkeysStmtContext _localctx = new SendkeysStmtContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_sendkeysStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1828);
			match(SENDKEYS);
			setState(1829);
			match(WS);
			setState(1830);
			valueStmt(0);
			setState(1839);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,266,_ctx) ) {
			case 1:
				{
				setState(1832);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1831);
					match(WS);
					}
				}

				setState(1834);
				match(T__0);
				setState(1836);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,265,_ctx) ) {
				case 1:
					{
					setState(1835);
					match(WS);
					}
					break;
				}
				setState(1838);
				valueStmt(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetattrStmtContext extends ParserRuleContext {
		public TerminalNode SETATTR() { return getToken(VbaParser.SETATTR, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public SetattrStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setattrStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterSetattrStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitSetattrStmt(this);
		}
	}

	public final SetattrStmtContext setattrStmt() throws RecognitionException {
		SetattrStmtContext _localctx = new SetattrStmtContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_setattrStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1841);
			match(SETATTR);
			setState(1842);
			match(WS);
			setState(1843);
			valueStmt(0);
			setState(1845);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1844);
				match(WS);
				}
			}

			setState(1847);
			match(T__0);
			setState(1849);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
			case 1:
				{
				setState(1848);
				match(WS);
				}
				break;
			}
			setState(1851);
			valueStmt(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetStmtContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(VbaParser.SET, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public ImplicitCallStmt_InStmtContext implicitCallStmt_InStmt() {
			return getRuleContext(ImplicitCallStmt_InStmtContext.class,0);
		}
		public TerminalNode EQ() { return getToken(VbaParser.EQ, 0); }
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public SetStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterSetStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitSetStmt(this);
		}
	}

	public final SetStmtContext setStmt() throws RecognitionException {
		SetStmtContext _localctx = new SetStmtContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_setStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1853);
			match(SET);
			setState(1854);
			match(WS);
			setState(1855);
			implicitCallStmt_InStmt();
			setState(1857);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1856);
				match(WS);
				}
			}

			setState(1859);
			match(EQ);
			setState(1861);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,270,_ctx) ) {
			case 1:
				{
				setState(1860);
				match(WS);
				}
				break;
			}
			setState(1863);
			valueStmt(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StopStmtContext extends ParserRuleContext {
		public TerminalNode STOP() { return getToken(VbaParser.STOP, 0); }
		public StopStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stopStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterStopStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitStopStmt(this);
		}
	}

	public final StopStmtContext stopStmt() throws RecognitionException {
		StopStmtContext _localctx = new StopStmtContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_stopStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1865);
			match(STOP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubStmtContext extends ParserRuleContext {
		public TerminalNode SUB() { return getToken(VbaParser.SUB, 0); }
		public AmbiguousIdentifierContext ambiguousIdentifier() {
			return getRuleContext(AmbiguousIdentifierContext.class,0);
		}
		public EndOfStatementContext endOfStatement() {
			return getRuleContext(EndOfStatementContext.class,0);
		}
		public TerminalNode END_SUB() { return getToken(VbaParser.END_SUB, 0); }
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public TerminalNode STATIC() { return getToken(VbaParser.STATIC, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public SubStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterSubStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitSubStmt(this);
		}
	}

	public final SubStmtContext subStmt() throws RecognitionException {
		SubStmtContext _localctx = new SubStmtContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_subStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1870);
			_la = _input.LA(1);
			if (((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (FRIEND - 79)) | (1L << (GLOBAL - 79)) | (1L << (PRIVATE - 79)))) != 0) || _la==PUBLIC) {
				{
				setState(1867);
				visibility();
				setState(1868);
				match(WS);
				}
			}

			setState(1874);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(1872);
				match(STATIC);
				setState(1873);
				match(WS);
				}
			}

			setState(1876);
			match(SUB);
			setState(1878);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1877);
				match(WS);
				}
			}

			setState(1880);
			ambiguousIdentifier();
			setState(1885);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
			case 1:
				{
				setState(1882);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1881);
					match(WS);
					}
				}

				setState(1884);
				argList();
				}
				break;
			}
			setState(1887);
			endOfStatement();
			setState(1889);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (END - 65)) | (1L << (ENUM - 65)) | (1L << (EQV - 65)) | (1L << (ERASE - 65)) | (1L << (ERROR - 65)) | (1L << (EVENT - 65)) | (1L << (EXIT_DO - 65)) | (1L << (EXIT_FOR - 65)) | (1L << (EXIT_FUNCTION - 65)) | (1L << (EXIT_PROPERTY - 65)) | (1L << (EXIT_SUB - 65)) | (1L << (EXIT_RULE - 65)) | (1L << (FALSE - 65)) | (1L << (FILECOPY - 65)) | (1L << (FRIEND - 65)) | (1L << (FOR - 65)) | (1L << (FUNCTION - 65)) | (1L << (GET - 65)) | (1L << (GLOBAL - 65)) | (1L << (GOSUB - 65)) | (1L << (GOTO - 65)) | (1L << (IF - 65)) | (1L << (IMP - 65)) | (1L << (IMPLEMENTS - 65)) | (1L << (IN - 65)) | (1L << (INPUT - 65)) | (1L << (IS - 65)) | (1L << (INTEGER - 65)) | (1L << (KILL - 65)) | (1L << (LOAD - 65)) | (1L << (LOCK - 65)) | (1L << (LONG - 65)) | (1L << (LOOP - 65)) | (1L << (LEN - 65)) | (1L << (LET - 65)) | (1L << (LIB - 65)) | (1L << (LIKE - 65)) | (1L << (LINE_INPUT - 65)) | (1L << (LSET - 65)) | (1L << (ME - 65)) | (1L << (MID - 65)) | (1L << (MKDIR - 65)) | (1L << (MOD - 65)) | (1L << (NAME - 65)) | (1L << (NEXT - 65)) | (1L << (NEW - 65)) | (1L << (NOT - 65)) | (1L << (NOTHING - 65)) | (1L << (NULL - 65)) | (1L << (EMPTY - 65)) | (1L << (ON - 65)) | (1L << (ON_ERROR - 65)) | (1L << (ON_LOCAL_ERROR - 65)) | (1L << (OPEN - 65)) | (1L << (OPTIONAL - 65)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (OR - 133)) | (1L << (OUTPUT - 133)) | (1L << (PARAMARRAY - 133)) | (1L << (PRESERVE - 133)) | (1L << (PRINT - 133)) | (1L << (PRIVATE - 133)) | (1L << (PUBLIC - 133)) | (1L << (PUT - 133)) | (1L << (RANDOM - 133)) | (1L << (RANDOMIZE - 133)) | (1L << (RAISEEVENT - 133)) | (1L << (READ - 133)) | (1L << (REDIM - 133)) | (1L << (REM - 133)) | (1L << (RESET - 133)) | (1L << (RESUME - 133)) | (1L << (RETURN - 133)) | (1L << (RMDIR - 133)) | (1L << (RSET - 133)) | (1L << (SAVEPICTURE - 133)) | (1L << (SAVESETTING - 133)) | (1L << (SEEK - 133)) | (1L << (SELECT - 133)) | (1L << (SENDKEYS - 133)) | (1L << (SET - 133)) | (1L << (SETATTR - 133)) | (1L << (SHARED - 133)) | (1L << (SINGLE - 133)) | (1L << (SPC - 133)) | (1L << (STATIC - 133)) | (1L << (STEP - 133)) | (1L << (STOP - 133)) | (1L << (STRING - 133)) | (1L << (SUB - 133)) | (1L << (TAB - 133)) | (1L << (TEXT - 133)) | (1L << (THEN - 133)) | (1L << (TIME - 133)) | (1L << (TO - 133)) | (1L << (TRUE - 133)) | (1L << (TYPE - 133)) | (1L << (TYPEOF - 133)) | (1L << (UNLOAD - 133)) | (1L << (UNLOCK - 133)) | (1L << (UNTIL - 133)) | (1L << (VARIANT - 133)) | (1L << (VERSION - 133)) | (1L << (WEND - 133)) | (1L << (WHILE - 133)) | (1L << (WIDTH - 133)) | (1L << (WITH - 133)) | (1L << (WITHEVENTS - 133)) | (1L << (WRITE - 133)) | (1L << (XOR - 133)))) != 0) || _la==WS || _la==IDENTIFIER) {
				{
				setState(1888);
				block();
				}
			}

			setState(1891);
			match(END_SUB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimeStmtContext extends ParserRuleContext {
		public TerminalNode TIME() { return getToken(VbaParser.TIME, 0); }
		public TerminalNode EQ() { return getToken(VbaParser.EQ, 0); }
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public TimeStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterTimeStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitTimeStmt(this);
		}
	}

	public final TimeStmtContext timeStmt() throws RecognitionException {
		TimeStmtContext _localctx = new TimeStmtContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_timeStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1893);
			match(TIME);
			setState(1895);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1894);
				match(WS);
				}
			}

			setState(1897);
			match(EQ);
			setState(1899);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
			case 1:
				{
				setState(1898);
				match(WS);
				}
				break;
			}
			setState(1901);
			valueStmt(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeStmtContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(VbaParser.TYPE, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public AmbiguousIdentifierContext ambiguousIdentifier() {
			return getRuleContext(AmbiguousIdentifierContext.class,0);
		}
		public EndOfStatementContext endOfStatement() {
			return getRuleContext(EndOfStatementContext.class,0);
		}
		public TerminalNode END_TYPE() { return getToken(VbaParser.END_TYPE, 0); }
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public List<TypeStmt_ElementContext> typeStmt_Element() {
			return getRuleContexts(TypeStmt_ElementContext.class);
		}
		public TypeStmt_ElementContext typeStmt_Element(int i) {
			return getRuleContext(TypeStmt_ElementContext.class,i);
		}
		public TypeStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterTypeStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitTypeStmt(this);
		}
	}

	public final TypeStmtContext typeStmt() throws RecognitionException {
		TypeStmtContext _localctx = new TypeStmtContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_typeStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1906);
			_la = _input.LA(1);
			if (((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (FRIEND - 79)) | (1L << (GLOBAL - 79)) | (1L << (PRIVATE - 79)))) != 0) || _la==PUBLIC) {
				{
				setState(1903);
				visibility();
				setState(1904);
				match(WS);
				}
			}

			setState(1908);
			match(TYPE);
			setState(1909);
			match(WS);
			setState(1910);
			ambiguousIdentifier();
			setState(1911);
			endOfStatement();
			setState(1915);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (ENUM - 66)) | (1L << (EQV - 66)) | (1L << (ERASE - 66)) | (1L << (ERROR - 66)) | (1L << (EVENT - 66)) | (1L << (FALSE - 66)) | (1L << (FILECOPY - 66)) | (1L << (FRIEND - 66)) | (1L << (FOR - 66)) | (1L << (FUNCTION - 66)) | (1L << (GET - 66)) | (1L << (GLOBAL - 66)) | (1L << (GOSUB - 66)) | (1L << (GOTO - 66)) | (1L << (IF - 66)) | (1L << (IMP - 66)) | (1L << (IMPLEMENTS - 66)) | (1L << (IN - 66)) | (1L << (INPUT - 66)) | (1L << (IS - 66)) | (1L << (INTEGER - 66)) | (1L << (KILL - 66)) | (1L << (LOAD - 66)) | (1L << (LOCK - 66)) | (1L << (LONG - 66)) | (1L << (LOOP - 66)) | (1L << (LEN - 66)) | (1L << (LET - 66)) | (1L << (LIB - 66)) | (1L << (LIKE - 66)) | (1L << (LSET - 66)) | (1L << (ME - 66)) | (1L << (MID - 66)) | (1L << (MKDIR - 66)) | (1L << (MOD - 66)) | (1L << (NAME - 66)) | (1L << (NEXT - 66)) | (1L << (NEW - 66)) | (1L << (NOT - 66)) | (1L << (NOTHING - 66)) | (1L << (NULL - 66)) | (1L << (EMPTY - 66)) | (1L << (ON - 66)) | (1L << (OPEN - 66)) | (1L << (OPTIONAL - 66)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (OR - 133)) | (1L << (OUTPUT - 133)) | (1L << (PARAMARRAY - 133)) | (1L << (PRESERVE - 133)) | (1L << (PRINT - 133)) | (1L << (PRIVATE - 133)) | (1L << (PUBLIC - 133)) | (1L << (PUT - 133)) | (1L << (RANDOM - 133)) | (1L << (RANDOMIZE - 133)) | (1L << (RAISEEVENT - 133)) | (1L << (READ - 133)) | (1L << (REDIM - 133)) | (1L << (REM - 133)) | (1L << (RESET - 133)) | (1L << (RESUME - 133)) | (1L << (RETURN - 133)) | (1L << (RMDIR - 133)) | (1L << (RSET - 133)) | (1L << (SAVEPICTURE - 133)) | (1L << (SAVESETTING - 133)) | (1L << (SEEK - 133)) | (1L << (SELECT - 133)) | (1L << (SENDKEYS - 133)) | (1L << (SET - 133)) | (1L << (SETATTR - 133)) | (1L << (SHARED - 133)) | (1L << (SINGLE - 133)) | (1L << (SPC - 133)) | (1L << (STATIC - 133)) | (1L << (STEP - 133)) | (1L << (STRING - 133)) | (1L << (SUB - 133)) | (1L << (TAB - 133)) | (1L << (TEXT - 133)) | (1L << (THEN - 133)) | (1L << (TIME - 133)) | (1L << (TO - 133)) | (1L << (TRUE - 133)) | (1L << (TYPE - 133)) | (1L << (TYPEOF - 133)) | (1L << (UNLOAD - 133)) | (1L << (UNLOCK - 133)) | (1L << (UNTIL - 133)) | (1L << (VARIANT - 133)) | (1L << (VERSION - 133)) | (1L << (WEND - 133)) | (1L << (WHILE - 133)) | (1L << (WIDTH - 133)) | (1L << (WITH - 133)) | (1L << (WITHEVENTS - 133)) | (1L << (WRITE - 133)) | (1L << (XOR - 133)))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(1912);
				typeStmt_Element();
				}
				}
				setState(1917);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1918);
			match(END_TYPE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeStmt_ElementContext extends ParserRuleContext {
		public AmbiguousIdentifierContext ambiguousIdentifier() {
			return getRuleContext(AmbiguousIdentifierContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public AsTypeClauseContext asTypeClause() {
			return getRuleContext(AsTypeClauseContext.class,0);
		}
		public EndOfStatementContext endOfStatement() {
			return getRuleContext(EndOfStatementContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(VbaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(VbaParser.RPAREN, 0); }
		public ConstSubscriptsContext constSubscripts() {
			return getRuleContext(ConstSubscriptsContext.class,0);
		}
		public TypeStmt_ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeStmt_Element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterTypeStmt_Element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitTypeStmt_Element(this);
		}
	}

	public final TypeStmt_ElementContext typeStmt_Element() throws RecognitionException {
		TypeStmt_ElementContext _localctx = new TypeStmt_ElementContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_typeStmt_Element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1920);
			ambiguousIdentifier();
			setState(1935);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
			case 1:
				{
				setState(1922);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1921);
					match(WS);
					}
				}

				setState(1924);
				match(LPAREN);
				setState(1929);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
				case 1:
					{
					setState(1926);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(1925);
						match(WS);
						}
					}

					setState(1928);
					constSubscripts();
					}
					break;
				}
				setState(1932);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1931);
					match(WS);
					}
				}

				setState(1934);
				match(RPAREN);
				}
				break;
			}
			setState(1937);
			match(WS);
			setState(1938);
			asTypeClause();
			setState(1939);
			endOfStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeOfIsStmtContext extends ParserRuleContext {
		public TerminalNode TYPEOF() { return getToken(VbaParser.TYPEOF, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public TerminalNode IS() { return getToken(VbaParser.IS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeOfIsStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeOfIsStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterTypeOfIsStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitTypeOfIsStmt(this);
		}
	}

	public final TypeOfIsStmtContext typeOfIsStmt() throws RecognitionException {
		TypeOfIsStmtContext _localctx = new TypeOfIsStmtContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_typeOfIsStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1941);
			match(TYPEOF);
			setState(1942);
			match(WS);
			setState(1943);
			valueStmt(0);
			setState(1944);
			match(WS);
			setState(1945);
			match(IS);
			setState(1946);
			match(WS);
			setState(1947);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnloadStmtContext extends ParserRuleContext {
		public TerminalNode UNLOAD() { return getToken(VbaParser.UNLOAD, 0); }
		public TerminalNode WS() { return getToken(VbaParser.WS, 0); }
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public UnloadStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unloadStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterUnloadStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitUnloadStmt(this);
		}
	}

	public final UnloadStmtContext unloadStmt() throws RecognitionException {
		UnloadStmtContext _localctx = new UnloadStmtContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_unloadStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1949);
			match(UNLOAD);
			setState(1950);
			match(WS);
			setState(1951);
			valueStmt(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnlockStmtContext extends ParserRuleContext {
		public TerminalNode UNLOCK() { return getToken(VbaParser.UNLOCK, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public FileNumberContext fileNumber() {
			return getRuleContext(FileNumberContext.class,0);
		}
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public TerminalNode TO() { return getToken(VbaParser.TO, 0); }
		public UnlockStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unlockStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterUnlockStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitUnlockStmt(this);
		}
	}

	public final UnlockStmtContext unlockStmt() throws RecognitionException {
		UnlockStmtContext _localctx = new UnlockStmtContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_unlockStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1953);
			match(UNLOCK);
			setState(1954);
			match(WS);
			setState(1955);
			fileNumber();
			setState(1970);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
			case 1:
				{
				setState(1957);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1956);
					match(WS);
					}
				}

				setState(1959);
				match(T__0);
				setState(1961);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
				case 1:
					{
					setState(1960);
					match(WS);
					}
					break;
				}
				setState(1963);
				valueStmt(0);
				setState(1968);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
				case 1:
					{
					setState(1964);
					match(WS);
					setState(1965);
					match(TO);
					setState(1966);
					match(WS);
					setState(1967);
					valueStmt(0);
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstValueExprContext extends ParserRuleContext {
		public ConstValueExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constValueExpr; }
	 
		public ConstValueExprContext() { }
		public void copyFrom(ConstValueExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CveDivContext extends ConstValueExprContext {
		public List<ConstValueExprContext> constValueExpr() {
			return getRuleContexts(ConstValueExprContext.class);
		}
		public ConstValueExprContext constValueExpr(int i) {
			return getRuleContext(ConstValueExprContext.class,i);
		}
		public TerminalNode DIV() { return getToken(VbaParser.DIV, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public CveDivContext(ConstValueExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterCveDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitCveDiv(this);
		}
	}
	public static class CveMinusContext extends ConstValueExprContext {
		public List<ConstValueExprContext> constValueExpr() {
			return getRuleContexts(ConstValueExprContext.class);
		}
		public ConstValueExprContext constValueExpr(int i) {
			return getRuleContext(ConstValueExprContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(VbaParser.MINUS, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public CveMinusContext(ConstValueExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterCveMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitCveMinus(this);
		}
	}
	public static class CveEqvContext extends ConstValueExprContext {
		public List<ConstValueExprContext> constValueExpr() {
			return getRuleContexts(ConstValueExprContext.class);
		}
		public ConstValueExprContext constValueExpr(int i) {
			return getRuleContext(ConstValueExprContext.class,i);
		}
		public TerminalNode EQV() { return getToken(VbaParser.EQV, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public CveEqvContext(ConstValueExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterCveEqv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitCveEqv(this);
		}
	}
	public static class CveImpContext extends ConstValueExprContext {
		public List<ConstValueExprContext> constValueExpr() {
			return getRuleContexts(ConstValueExprContext.class);
		}
		public ConstValueExprContext constValueExpr(int i) {
			return getRuleContext(ConstValueExprContext.class,i);
		}
		public TerminalNode IMP() { return getToken(VbaParser.IMP, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public CveImpContext(ConstValueExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterCveImp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitCveImp(this);
		}
	}
	public static class CveModContext extends ConstValueExprContext {
		public List<ConstValueExprContext> constValueExpr() {
			return getRuleContexts(ConstValueExprContext.class);
		}
		public ConstValueExprContext constValueExpr(int i) {
			return getRuleContext(ConstValueExprContext.class,i);
		}
		public TerminalNode MOD() { return getToken(VbaParser.MOD, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public CveModContext(ConstValueExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterCveMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitCveMod(this);
		}
	}
	public static class CveAmpContext extends ConstValueExprContext {
		public List<ConstValueExprContext> constValueExpr() {
			return getRuleContexts(ConstValueExprContext.class);
		}
		public ConstValueExprContext constValueExpr(int i) {
			return getRuleContext(ConstValueExprContext.class,i);
		}
		public TerminalNode AMPERSAND() { return getToken(VbaParser.AMPERSAND, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public CveAmpContext(ConstValueExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterCveAmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitCveAmp(this);
		}
	}
	public static class CveLtContext extends ConstValueExprContext {
		public List<ConstValueExprContext> constValueExpr() {
			return getRuleContexts(ConstValueExprContext.class);
		}
		public ConstValueExprContext constValueExpr(int i) {
			return getRuleContext(ConstValueExprContext.class,i);
		}
		public TerminalNode LT() { return getToken(VbaParser.LT, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public CveLtContext(ConstValueExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterCveLt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitCveLt(this);
		}
	}
	public static class CveLikeContext extends ConstValueExprContext {
		public List<ConstValueExprContext> constValueExpr() {
			return getRuleContexts(ConstValueExprContext.class);
		}
		public ConstValueExprContext constValueExpr(int i) {
			return getRuleContext(ConstValueExprContext.class,i);
		}
		public TerminalNode LIKE() { return getToken(VbaParser.LIKE, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public CveLikeContext(ConstValueExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterCveLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitCveLike(this);
		}
	}
	public static class CveAddContext extends ConstValueExprContext {
		public List<ConstValueExprContext> constValueExpr() {
			return getRuleContexts(ConstValueExprContext.class);
		}
		public ConstValueExprContext constValueExpr(int i) {
			return getRuleContext(ConstValueExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(VbaParser.PLUS, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public CveAddContext(ConstValueExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterCveAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitCveAdd(this);
		}
	}
	public static class CveEqContext extends ConstValueExprContext {
		public List<ConstValueExprContext> constValueExpr() {
			return getRuleContexts(ConstValueExprContext.class);
		}
		public ConstValueExprContext constValueExpr(int i) {
			return getRuleContext(ConstValueExprContext.class,i);
		}
		public TerminalNode EQ() { return getToken(VbaParser.EQ, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public CveEqContext(ConstValueExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterCveEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitCveEq(this);
		}
	}
	public static class CveXorContext extends ConstValueExprContext {
		public List<ConstValueExprContext> constValueExpr() {
			return getRuleContexts(ConstValueExprContext.class);
		}
		public ConstValueExprContext constValueExpr(int i) {
			return getRuleContext(ConstValueExprContext.class,i);
		}
		public TerminalNode XOR() { return getToken(VbaParser.XOR, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public CveXorContext(ConstValueExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterCveXor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitCveXor(this);
		}
	}
	public static class CveGtContext extends ConstValueExprContext {
		public List<ConstValueExprContext> constValueExpr() {
			return getRuleContexts(ConstValueExprContext.class);
		}
		public ConstValueExprContext constValueExpr(int i) {
			return getRuleContext(ConstValueExprContext.class,i);
		}
		public TerminalNode GT() { return getToken(VbaParser.GT, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public CveGtContext(ConstValueExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterCveGt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitCveGt(this);
		}
	}
	public static class CveNeqContext extends ConstValueExprContext {
		public List<ConstValueExprContext> constValueExpr() {
			return getRuleContexts(ConstValueExprContext.class);
		}
		public ConstValueExprContext constValueExpr(int i) {
			return getRuleContext(ConstValueExprContext.class,i);
		}
		public TerminalNode NEQ() { return getToken(VbaParser.NEQ, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public CveNeqContext(ConstValueExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterCveNeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitCveNeq(this);
		}
	}
	public static class CvePlusContext extends ConstValueExprContext {
		public TerminalNode PLUS() { return getToken(VbaParser.PLUS, 0); }
		public ConstValueExprContext constValueExpr() {
			return getRuleContext(ConstValueExprContext.class,0);
		}
		public TerminalNode WS() { return getToken(VbaParser.WS, 0); }
		public CvePlusContext(ConstValueExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterCvePlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitCvePlus(this);
		}
	}
	public static class CveAndContext extends ConstValueExprContext {
		public List<ConstValueExprContext> constValueExpr() {
			return getRuleContexts(ConstValueExprContext.class);
		}
		public ConstValueExprContext constValueExpr(int i) {
			return getRuleContext(ConstValueExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(VbaParser.AND, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public CveAndContext(ConstValueExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterCveAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitCveAnd(this);
		}
	}
	public static class CveIdentifierContext extends ConstValueExprContext {
		public List<AmbiguousIdentifierContext> ambiguousIdentifier() {
			return getRuleContexts(AmbiguousIdentifierContext.class);
		}
		public AmbiguousIdentifierContext ambiguousIdentifier(int i) {
			return getRuleContext(AmbiguousIdentifierContext.class,i);
		}
		public CveIdentifierContext(ConstValueExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterCveIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitCveIdentifier(this);
		}
	}
	public static class CveMultContext extends ConstValueExprContext {
		public List<ConstValueExprContext> constValueExpr() {
			return getRuleContexts(ConstValueExprContext.class);
		}
		public ConstValueExprContext constValueExpr(int i) {
			return getRuleContext(ConstValueExprContext.class,i);
		}
		public TerminalNode MULT() { return getToken(VbaParser.MULT, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public CveMultContext(ConstValueExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterCveMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitCveMult(this);
		}
	}
	public static class CveNegationContext extends ConstValueExprContext {
		public TerminalNode MINUS() { return getToken(VbaParser.MINUS, 0); }
		public ConstValueExprContext constValueExpr() {
			return getRuleContext(ConstValueExprContext.class,0);
		}
		public TerminalNode WS() { return getToken(VbaParser.WS, 0); }
		public CveNegationContext(ConstValueExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterCveNegation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitCveNegation(this);
		}
	}
	public static class CvePowContext extends ConstValueExprContext {
		public List<ConstValueExprContext> constValueExpr() {
			return getRuleContexts(ConstValueExprContext.class);
		}
		public ConstValueExprContext constValueExpr(int i) {
			return getRuleContext(ConstValueExprContext.class,i);
		}
		public TerminalNode POW() { return getToken(VbaParser.POW, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public CvePowContext(ConstValueExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterCvePow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitCvePow(this);
		}
	}
	public static class CveLeqContext extends ConstValueExprContext {
		public List<ConstValueExprContext> constValueExpr() {
			return getRuleContexts(ConstValueExprContext.class);
		}
		public ConstValueExprContext constValueExpr(int i) {
			return getRuleContext(ConstValueExprContext.class,i);
		}
		public TerminalNode LEQ() { return getToken(VbaParser.LEQ, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public CveLeqContext(ConstValueExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterCveLeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitCveLeq(this);
		}
	}
	public static class CveLiteralContext extends ConstValueExprContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public CveLiteralContext(ConstValueExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterCveLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitCveLiteral(this);
		}
	}
	public static class CveNotContext extends ConstValueExprContext {
		public TerminalNode NOT() { return getToken(VbaParser.NOT, 0); }
		public ConstValueExprContext constValueExpr() {
			return getRuleContext(ConstValueExprContext.class,0);
		}
		public TerminalNode WS() { return getToken(VbaParser.WS, 0); }
		public CveNotContext(ConstValueExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterCveNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitCveNot(this);
		}
	}
	public static class CveGeqContext extends ConstValueExprContext {
		public List<ConstValueExprContext> constValueExpr() {
			return getRuleContexts(ConstValueExprContext.class);
		}
		public ConstValueExprContext constValueExpr(int i) {
			return getRuleContext(ConstValueExprContext.class,i);
		}
		public TerminalNode GEQ() { return getToken(VbaParser.GEQ, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public CveGeqContext(ConstValueExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterCveGeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitCveGeq(this);
		}
	}
	public static class CveOrContext extends ConstValueExprContext {
		public List<ConstValueExprContext> constValueExpr() {
			return getRuleContexts(ConstValueExprContext.class);
		}
		public ConstValueExprContext constValueExpr(int i) {
			return getRuleContext(ConstValueExprContext.class,i);
		}
		public TerminalNode OR() { return getToken(VbaParser.OR, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public CveOrContext(ConstValueExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterCveOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitCveOr(this);
		}
	}

	public final ConstValueExprContext constValueExpr() throws RecognitionException {
		return constValueExpr(0);
	}

	private ConstValueExprContext constValueExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConstValueExprContext _localctx = new ConstValueExprContext(_ctx, _parentState);
		ConstValueExprContext _prevctx = _localctx;
		int _startState = 208;
		enterRecursionRule(_localctx, 208, RULE_constValueExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1997);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,294,_ctx) ) {
			case 1:
				{
				_localctx = new CveLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1973);
				literal();
				}
				break;
			case 2:
				{
				_localctx = new CveIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1974);
				ambiguousIdentifier();
				setState(1979);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,290,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1975);
						match(T__2);
						setState(1976);
						ambiguousIdentifier();
						}
						} 
					}
					setState(1981);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,290,_ctx);
				}
				}
				break;
			case 3:
				{
				_localctx = new CveNegationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1982);
				match(MINUS);
				setState(1984);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1983);
					match(WS);
					}
				}

				setState(1986);
				constValueExpr(21);
				}
				break;
			case 4:
				{
				_localctx = new CvePlusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1987);
				match(PLUS);
				setState(1989);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1988);
					match(WS);
					}
				}

				setState(1991);
				constValueExpr(20);
				}
				break;
			case 5:
				{
				_localctx = new CveNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1992);
				match(NOT);
				setState(1994);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1993);
					match(WS);
					}
				}

				setState(1996);
				constValueExpr(6);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2172);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,334,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2170);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,333,_ctx) ) {
					case 1:
						{
						_localctx = new CvePowContext(new ConstValueExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_constValueExpr);
						setState(1999);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(2001);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2000);
							match(WS);
							}
						}

						setState(2003);
						match(POW);
						setState(2005);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2004);
							match(WS);
							}
						}

						setState(2007);
						constValueExpr(23);
						}
						break;
					case 2:
						{
						_localctx = new CveMultContext(new ConstValueExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_constValueExpr);
						setState(2008);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(2010);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2009);
							match(WS);
							}
						}

						setState(2012);
						match(MULT);
						setState(2014);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2013);
							match(WS);
							}
						}

						setState(2016);
						constValueExpr(20);
						}
						break;
					case 3:
						{
						_localctx = new CveDivContext(new ConstValueExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_constValueExpr);
						setState(2017);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(2019);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2018);
							match(WS);
							}
						}

						setState(2021);
						match(DIV);
						setState(2023);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2022);
							match(WS);
							}
						}

						setState(2025);
						constValueExpr(19);
						}
						break;
					case 4:
						{
						_localctx = new CveModContext(new ConstValueExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_constValueExpr);
						setState(2026);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(2028);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2027);
							match(WS);
							}
						}

						setState(2030);
						match(MOD);
						setState(2032);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2031);
							match(WS);
							}
						}

						setState(2034);
						constValueExpr(18);
						}
						break;
					case 5:
						{
						_localctx = new CveAddContext(new ConstValueExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_constValueExpr);
						setState(2035);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(2037);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2036);
							match(WS);
							}
						}

						setState(2039);
						match(PLUS);
						setState(2041);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2040);
							match(WS);
							}
						}

						setState(2043);
						constValueExpr(17);
						}
						break;
					case 6:
						{
						_localctx = new CveMinusContext(new ConstValueExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_constValueExpr);
						setState(2044);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(2046);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2045);
							match(WS);
							}
						}

						setState(2048);
						match(MINUS);
						setState(2050);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2049);
							match(WS);
							}
						}

						setState(2052);
						constValueExpr(16);
						}
						break;
					case 7:
						{
						_localctx = new CveAmpContext(new ConstValueExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_constValueExpr);
						setState(2053);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(2055);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2054);
							match(WS);
							}
						}

						setState(2057);
						match(AMPERSAND);
						setState(2059);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2058);
							match(WS);
							}
						}

						setState(2061);
						constValueExpr(15);
						}
						break;
					case 8:
						{
						_localctx = new CveLikeContext(new ConstValueExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_constValueExpr);
						setState(2062);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(2064);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2063);
							match(WS);
							}
						}

						setState(2066);
						match(LIKE);
						setState(2068);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2067);
							match(WS);
							}
						}

						setState(2070);
						constValueExpr(14);
						}
						break;
					case 9:
						{
						_localctx = new CveGeqContext(new ConstValueExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_constValueExpr);
						setState(2071);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(2073);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2072);
							match(WS);
							}
						}

						setState(2075);
						match(GEQ);
						setState(2077);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2076);
							match(WS);
							}
						}

						setState(2079);
						constValueExpr(13);
						}
						break;
					case 10:
						{
						_localctx = new CveLeqContext(new ConstValueExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_constValueExpr);
						setState(2080);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(2082);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2081);
							match(WS);
							}
						}

						setState(2084);
						match(LEQ);
						setState(2086);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2085);
							match(WS);
							}
						}

						setState(2088);
						constValueExpr(12);
						}
						break;
					case 11:
						{
						_localctx = new CveGtContext(new ConstValueExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_constValueExpr);
						setState(2089);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(2091);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2090);
							match(WS);
							}
						}

						setState(2093);
						match(GT);
						setState(2095);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2094);
							match(WS);
							}
						}

						setState(2097);
						constValueExpr(11);
						}
						break;
					case 12:
						{
						_localctx = new CveLtContext(new ConstValueExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_constValueExpr);
						setState(2098);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(2100);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2099);
							match(WS);
							}
						}

						setState(2102);
						match(LT);
						setState(2104);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2103);
							match(WS);
							}
						}

						setState(2106);
						constValueExpr(10);
						}
						break;
					case 13:
						{
						_localctx = new CveNeqContext(new ConstValueExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_constValueExpr);
						setState(2107);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(2109);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2108);
							match(WS);
							}
						}

						setState(2111);
						match(NEQ);
						setState(2113);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2112);
							match(WS);
							}
						}

						setState(2115);
						constValueExpr(9);
						}
						break;
					case 14:
						{
						_localctx = new CveEqContext(new ConstValueExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_constValueExpr);
						setState(2116);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(2118);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2117);
							match(WS);
							}
						}

						setState(2120);
						match(EQ);
						setState(2122);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2121);
							match(WS);
							}
						}

						setState(2124);
						constValueExpr(8);
						}
						break;
					case 15:
						{
						_localctx = new CveAndContext(new ConstValueExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_constValueExpr);
						setState(2125);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2127);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2126);
							match(WS);
							}
						}

						setState(2129);
						match(AND);
						setState(2131);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2130);
							match(WS);
							}
						}

						setState(2133);
						constValueExpr(6);
						}
						break;
					case 16:
						{
						_localctx = new CveOrContext(new ConstValueExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_constValueExpr);
						setState(2134);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2136);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2135);
							match(WS);
							}
						}

						setState(2138);
						match(OR);
						setState(2140);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2139);
							match(WS);
							}
						}

						setState(2142);
						constValueExpr(5);
						}
						break;
					case 17:
						{
						_localctx = new CveXorContext(new ConstValueExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_constValueExpr);
						setState(2143);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2145);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2144);
							match(WS);
							}
						}

						setState(2147);
						match(XOR);
						setState(2149);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2148);
							match(WS);
							}
						}

						setState(2151);
						constValueExpr(4);
						}
						break;
					case 18:
						{
						_localctx = new CveEqvContext(new ConstValueExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_constValueExpr);
						setState(2152);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2154);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2153);
							match(WS);
							}
						}

						setState(2156);
						match(EQV);
						setState(2158);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2157);
							match(WS);
							}
						}

						setState(2160);
						constValueExpr(3);
						}
						break;
					case 19:
						{
						_localctx = new CveImpContext(new ConstValueExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_constValueExpr);
						setState(2161);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2163);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2162);
							match(WS);
							}
						}

						setState(2165);
						match(IMP);
						setState(2167);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2166);
							match(WS);
							}
						}

						setState(2169);
						constValueExpr(2);
						}
						break;
					}
					} 
				}
				setState(2174);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,334,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ValueStmtContext extends ParserRuleContext {
		public ValueStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueStmt; }
	 
		public ValueStmtContext() { }
		public void copyFrom(ValueStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VsStructContext extends ValueStmtContext {
		public TerminalNode LPAREN() { return getToken(VbaParser.LPAREN, 0); }
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(VbaParser.RPAREN, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public VsStructContext(ValueStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterVsStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitVsStruct(this);
		}
	}
	public static class VsAddContext extends ValueStmtContext {
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(VbaParser.PLUS, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public VsAddContext(ValueStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterVsAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitVsAdd(this);
		}
	}
	public static class VsLtContext extends ValueStmtContext {
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public TerminalNode LT() { return getToken(VbaParser.LT, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public VsLtContext(ValueStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterVsLt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitVsLt(this);
		}
	}
	public static class VsAddressOfContext extends ValueStmtContext {
		public TerminalNode ADDRESSOF() { return getToken(VbaParser.ADDRESSOF, 0); }
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public TerminalNode WS() { return getToken(VbaParser.WS, 0); }
		public VsAddressOfContext(ValueStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterVsAddressOf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitVsAddressOf(this);
		}
	}
	public static class VsNewContext extends ValueStmtContext {
		public TerminalNode NEW() { return getToken(VbaParser.NEW, 0); }
		public ComplexTypeContext complexType() {
			return getRuleContext(ComplexTypeContext.class,0);
		}
		public TerminalNode WS() { return getToken(VbaParser.WS, 0); }
		public VsNewContext(ValueStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterVsNew(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitVsNew(this);
		}
	}
	public static class VsMultContext extends ValueStmtContext {
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public TerminalNode MULT() { return getToken(VbaParser.MULT, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public VsMultContext(ValueStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterVsMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitVsMult(this);
		}
	}
	public static class VsNegationContext extends ValueStmtContext {
		public TerminalNode MINUS() { return getToken(VbaParser.MINUS, 0); }
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public TerminalNode WS() { return getToken(VbaParser.WS, 0); }
		public VsNegationContext(ValueStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterVsNegation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitVsNegation(this);
		}
	}
	public static class VsDivContext extends ValueStmtContext {
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public TerminalNode DIV() { return getToken(VbaParser.DIV, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public VsDivContext(ValueStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterVsDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitVsDiv(this);
		}
	}
	public static class VsLikeContext extends ValueStmtContext {
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public TerminalNode LIKE() { return getToken(VbaParser.LIKE, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public VsLikeContext(ValueStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterVsLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitVsLike(this);
		}
	}
	public static class VsPlusContext extends ValueStmtContext {
		public TerminalNode PLUS() { return getToken(VbaParser.PLUS, 0); }
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public TerminalNode WS() { return getToken(VbaParser.WS, 0); }
		public VsPlusContext(ValueStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterVsPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitVsPlus(this);
		}
	}
	public static class VsNotContext extends ValueStmtContext {
		public TerminalNode NOT() { return getToken(VbaParser.NOT, 0); }
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public TerminalNode WS() { return getToken(VbaParser.WS, 0); }
		public VsNotContext(ValueStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterVsNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitVsNot(this);
		}
	}
	public static class VsGeqContext extends ValueStmtContext {
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public TerminalNode GEQ() { return getToken(VbaParser.GEQ, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public VsGeqContext(ValueStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterVsGeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitVsGeq(this);
		}
	}
	public static class VsTypeOfContext extends ValueStmtContext {
		public TypeOfIsStmtContext typeOfIsStmt() {
			return getRuleContext(TypeOfIsStmtContext.class,0);
		}
		public VsTypeOfContext(ValueStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterVsTypeOf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitVsTypeOf(this);
		}
	}
	public static class VsICSContext extends ValueStmtContext {
		public ImplicitCallStmt_InStmtContext implicitCallStmt_InStmt() {
			return getRuleContext(ImplicitCallStmt_InStmtContext.class,0);
		}
		public VsICSContext(ValueStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterVsICS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitVsICS(this);
		}
	}
	public static class VsNeqContext extends ValueStmtContext {
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public TerminalNode NEQ() { return getToken(VbaParser.NEQ, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public VsNeqContext(ValueStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterVsNeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitVsNeq(this);
		}
	}
	public static class VsXorContext extends ValueStmtContext {
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public TerminalNode XOR() { return getToken(VbaParser.XOR, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public VsXorContext(ValueStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterVsXor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitVsXor(this);
		}
	}
	public static class VsAndContext extends ValueStmtContext {
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public TerminalNode AND() { return getToken(VbaParser.AND, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public VsAndContext(ValueStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterVsAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitVsAnd(this);
		}
	}
	public static class VsPowContext extends ValueStmtContext {
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public TerminalNode POW() { return getToken(VbaParser.POW, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public VsPowContext(ValueStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterVsPow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitVsPow(this);
		}
	}
	public static class VsLeqContext extends ValueStmtContext {
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public TerminalNode LEQ() { return getToken(VbaParser.LEQ, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public VsLeqContext(ValueStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterVsLeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitVsLeq(this);
		}
	}
	public static class VsIsContext extends ValueStmtContext {
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public TerminalNode IS() { return getToken(VbaParser.IS, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public VsIsContext(ValueStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterVsIs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitVsIs(this);
		}
	}
	public static class VsModContext extends ValueStmtContext {
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public TerminalNode MOD() { return getToken(VbaParser.MOD, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public VsModContext(ValueStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterVsMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitVsMod(this);
		}
	}
	public static class VsAmpContext extends ValueStmtContext {
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public TerminalNode AMPERSAND() { return getToken(VbaParser.AMPERSAND, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public VsAmpContext(ValueStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterVsAmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitVsAmp(this);
		}
	}
	public static class VsOrContext extends ValueStmtContext {
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public TerminalNode OR() { return getToken(VbaParser.OR, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public VsOrContext(ValueStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterVsOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitVsOr(this);
		}
	}
	public static class VsMinusContext extends ValueStmtContext {
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(VbaParser.MINUS, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public VsMinusContext(ValueStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterVsMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitVsMinus(this);
		}
	}
	public static class VsLiteralContext extends ValueStmtContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public VsLiteralContext(ValueStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterVsLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitVsLiteral(this);
		}
	}
	public static class VsEqvContext extends ValueStmtContext {
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public TerminalNode EQV() { return getToken(VbaParser.EQV, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public VsEqvContext(ValueStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterVsEqv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitVsEqv(this);
		}
	}
	public static class VsImpContext extends ValueStmtContext {
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public TerminalNode IMP() { return getToken(VbaParser.IMP, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public VsImpContext(ValueStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterVsImp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitVsImp(this);
		}
	}
	public static class VsGtContext extends ValueStmtContext {
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public TerminalNode GT() { return getToken(VbaParser.GT, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public VsGtContext(ValueStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterVsGt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitVsGt(this);
		}
	}
	public static class VsEqContext extends ValueStmtContext {
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public TerminalNode EQ() { return getToken(VbaParser.EQ, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public VsEqContext(ValueStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterVsEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitVsEq(this);
		}
	}

	public final ValueStmtContext valueStmt() throws RecognitionException {
		return valueStmt(0);
	}

	private ValueStmtContext valueStmt(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValueStmtContext _localctx = new ValueStmtContext(_ctx, _parentState);
		ValueStmtContext _prevctx = _localctx;
		int _startState = 210;
		enterRecursionRule(_localctx, 210, RULE_valueStmt, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,344,_ctx) ) {
			case 1:
				{
				_localctx = new VsLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2176);
				literal();
				}
				break;
			case 2:
				{
				_localctx = new VsICSContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2177);
				implicitCallStmt_InStmt();
				}
				break;
			case 3:
				{
				_localctx = new VsStructContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2178);
				match(LPAREN);
				setState(2180);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,335,_ctx) ) {
				case 1:
					{
					setState(2179);
					match(WS);
					}
					break;
				}
				setState(2182);
				valueStmt(0);
				setState(2193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0 || _la==WS) {
					{
					{
					setState(2184);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(2183);
						match(WS);
						}
					}

					setState(2186);
					match(T__0);
					setState(2188);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,337,_ctx) ) {
					case 1:
						{
						setState(2187);
						match(WS);
						}
						break;
					}
					setState(2190);
					valueStmt(0);
					}
					}
					setState(2195);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2196);
				match(RPAREN);
				}
				break;
			case 4:
				{
				_localctx = new VsNewContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2198);
				match(NEW);
				setState(2200);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(2199);
					match(WS);
					}
				}

				setState(2202);
				complexType();
				}
				break;
			case 5:
				{
				_localctx = new VsTypeOfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2203);
				typeOfIsStmt();
				}
				break;
			case 6:
				{
				_localctx = new VsAddressOfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2204);
				match(ADDRESSOF);
				setState(2206);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,340,_ctx) ) {
				case 1:
					{
					setState(2205);
					match(WS);
					}
					break;
				}
				setState(2208);
				valueStmt(24);
				}
				break;
			case 7:
				{
				_localctx = new VsNegationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2209);
				match(MINUS);
				setState(2211);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,341,_ctx) ) {
				case 1:
					{
					setState(2210);
					match(WS);
					}
					break;
				}
				setState(2213);
				valueStmt(22);
				}
				break;
			case 8:
				{
				_localctx = new VsPlusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2214);
				match(PLUS);
				setState(2216);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,342,_ctx) ) {
				case 1:
					{
					setState(2215);
					match(WS);
					}
					break;
				}
				setState(2218);
				valueStmt(21);
				}
				break;
			case 9:
				{
				_localctx = new VsNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2219);
				match(NOT);
				setState(2221);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,343,_ctx) ) {
				case 1:
					{
					setState(2220);
					match(WS);
					}
					break;
				}
				setState(2223);
				valueStmt(6);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2408);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,386,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2406);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,385,_ctx) ) {
					case 1:
						{
						_localctx = new VsPowContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(2226);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(2228);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2227);
							match(WS);
							}
						}

						setState(2230);
						match(POW);
						setState(2232);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,346,_ctx) ) {
						case 1:
							{
							setState(2231);
							match(WS);
							}
							break;
						}
						setState(2234);
						valueStmt(24);
						}
						break;
					case 2:
						{
						_localctx = new VsMultContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(2235);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(2237);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2236);
							match(WS);
							}
						}

						setState(2239);
						match(MULT);
						setState(2241);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,348,_ctx) ) {
						case 1:
							{
							setState(2240);
							match(WS);
							}
							break;
						}
						setState(2243);
						valueStmt(21);
						}
						break;
					case 3:
						{
						_localctx = new VsDivContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(2244);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(2246);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2245);
							match(WS);
							}
						}

						setState(2248);
						match(DIV);
						setState(2250);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,350,_ctx) ) {
						case 1:
							{
							setState(2249);
							match(WS);
							}
							break;
						}
						setState(2252);
						valueStmt(20);
						}
						break;
					case 4:
						{
						_localctx = new VsModContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(2253);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(2255);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2254);
							match(WS);
							}
						}

						setState(2257);
						match(MOD);
						setState(2259);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,352,_ctx) ) {
						case 1:
							{
							setState(2258);
							match(WS);
							}
							break;
						}
						setState(2261);
						valueStmt(19);
						}
						break;
					case 5:
						{
						_localctx = new VsAddContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(2262);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(2264);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2263);
							match(WS);
							}
						}

						setState(2266);
						match(PLUS);
						setState(2268);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,354,_ctx) ) {
						case 1:
							{
							setState(2267);
							match(WS);
							}
							break;
						}
						setState(2270);
						valueStmt(18);
						}
						break;
					case 6:
						{
						_localctx = new VsMinusContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(2271);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(2273);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2272);
							match(WS);
							}
						}

						setState(2275);
						match(MINUS);
						setState(2277);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,356,_ctx) ) {
						case 1:
							{
							setState(2276);
							match(WS);
							}
							break;
						}
						setState(2279);
						valueStmt(17);
						}
						break;
					case 7:
						{
						_localctx = new VsAmpContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(2280);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(2282);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2281);
							match(WS);
							}
						}

						setState(2284);
						match(AMPERSAND);
						setState(2286);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,358,_ctx) ) {
						case 1:
							{
							setState(2285);
							match(WS);
							}
							break;
						}
						setState(2288);
						valueStmt(16);
						}
						break;
					case 8:
						{
						_localctx = new VsLikeContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(2289);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(2291);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2290);
							match(WS);
							}
						}

						setState(2293);
						match(LIKE);
						setState(2295);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,360,_ctx) ) {
						case 1:
							{
							setState(2294);
							match(WS);
							}
							break;
						}
						setState(2297);
						valueStmt(15);
						}
						break;
					case 9:
						{
						_localctx = new VsIsContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(2298);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(2300);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2299);
							match(WS);
							}
						}

						setState(2302);
						match(IS);
						setState(2304);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,362,_ctx) ) {
						case 1:
							{
							setState(2303);
							match(WS);
							}
							break;
						}
						setState(2306);
						valueStmt(14);
						}
						break;
					case 10:
						{
						_localctx = new VsGeqContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(2307);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(2309);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2308);
							match(WS);
							}
						}

						setState(2311);
						match(GEQ);
						setState(2313);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,364,_ctx) ) {
						case 1:
							{
							setState(2312);
							match(WS);
							}
							break;
						}
						setState(2315);
						valueStmt(13);
						}
						break;
					case 11:
						{
						_localctx = new VsLeqContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(2316);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(2318);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2317);
							match(WS);
							}
						}

						setState(2320);
						match(LEQ);
						setState(2322);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,366,_ctx) ) {
						case 1:
							{
							setState(2321);
							match(WS);
							}
							break;
						}
						setState(2324);
						valueStmt(12);
						}
						break;
					case 12:
						{
						_localctx = new VsGtContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(2325);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(2327);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2326);
							match(WS);
							}
						}

						setState(2329);
						match(GT);
						setState(2331);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,368,_ctx) ) {
						case 1:
							{
							setState(2330);
							match(WS);
							}
							break;
						}
						setState(2333);
						valueStmt(11);
						}
						break;
					case 13:
						{
						_localctx = new VsLtContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(2334);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(2336);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2335);
							match(WS);
							}
						}

						setState(2338);
						match(LT);
						setState(2340);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,370,_ctx) ) {
						case 1:
							{
							setState(2339);
							match(WS);
							}
							break;
						}
						setState(2342);
						valueStmt(10);
						}
						break;
					case 14:
						{
						_localctx = new VsNeqContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(2343);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(2345);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2344);
							match(WS);
							}
						}

						setState(2347);
						match(NEQ);
						setState(2349);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,372,_ctx) ) {
						case 1:
							{
							setState(2348);
							match(WS);
							}
							break;
						}
						setState(2351);
						valueStmt(9);
						}
						break;
					case 15:
						{
						_localctx = new VsEqContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(2352);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(2354);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2353);
							match(WS);
							}
						}

						setState(2356);
						match(EQ);
						setState(2358);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,374,_ctx) ) {
						case 1:
							{
							setState(2357);
							match(WS);
							}
							break;
						}
						setState(2360);
						valueStmt(8);
						}
						break;
					case 16:
						{
						_localctx = new VsAndContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(2361);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2363);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2362);
							match(WS);
							}
						}

						setState(2365);
						match(AND);
						setState(2367);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,376,_ctx) ) {
						case 1:
							{
							setState(2366);
							match(WS);
							}
							break;
						}
						setState(2369);
						valueStmt(6);
						}
						break;
					case 17:
						{
						_localctx = new VsOrContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(2370);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2372);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2371);
							match(WS);
							}
						}

						setState(2374);
						match(OR);
						setState(2376);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,378,_ctx) ) {
						case 1:
							{
							setState(2375);
							match(WS);
							}
							break;
						}
						setState(2378);
						valueStmt(5);
						}
						break;
					case 18:
						{
						_localctx = new VsXorContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(2379);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2381);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2380);
							match(WS);
							}
						}

						setState(2383);
						match(XOR);
						setState(2385);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,380,_ctx) ) {
						case 1:
							{
							setState(2384);
							match(WS);
							}
							break;
						}
						setState(2387);
						valueStmt(4);
						}
						break;
					case 19:
						{
						_localctx = new VsEqvContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(2388);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2390);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2389);
							match(WS);
							}
						}

						setState(2392);
						match(EQV);
						setState(2394);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,382,_ctx) ) {
						case 1:
							{
							setState(2393);
							match(WS);
							}
							break;
						}
						setState(2396);
						valueStmt(3);
						}
						break;
					case 20:
						{
						_localctx = new VsImpContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(2397);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2399);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2398);
							match(WS);
							}
						}

						setState(2401);
						match(IMP);
						setState(2403);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,384,_ctx) ) {
						case 1:
							{
							setState(2402);
							match(WS);
							}
							break;
						}
						setState(2405);
						valueStmt(2);
						}
						break;
					}
					} 
				}
				setState(2410);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,386,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class VariableStmtContext extends ParserRuleContext {
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public VariableListStmtContext variableListStmt() {
			return getRuleContext(VariableListStmtContext.class,0);
		}
		public TerminalNode DIM() { return getToken(VbaParser.DIM, 0); }
		public TerminalNode STATIC() { return getToken(VbaParser.STATIC, 0); }
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public TerminalNode WITHEVENTS() { return getToken(VbaParser.WITHEVENTS, 0); }
		public VariableStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterVariableStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitVariableStmt(this);
		}
	}

	public final VariableStmtContext variableStmt() throws RecognitionException {
		VariableStmtContext _localctx = new VariableStmtContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_variableStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2414);
			switch (_input.LA(1)) {
			case DIM:
				{
				setState(2411);
				match(DIM);
				}
				break;
			case STATIC:
				{
				setState(2412);
				match(STATIC);
				}
				break;
			case FRIEND:
			case GLOBAL:
			case PRIVATE:
			case PUBLIC:
				{
				setState(2413);
				visibility();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2416);
			match(WS);
			setState(2419);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,388,_ctx) ) {
			case 1:
				{
				setState(2417);
				match(WITHEVENTS);
				setState(2418);
				match(WS);
				}
				break;
			}
			setState(2421);
			variableListStmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableListStmtContext extends ParserRuleContext {
		public List<VariableSubStmtContext> variableSubStmt() {
			return getRuleContexts(VariableSubStmtContext.class);
		}
		public VariableSubStmtContext variableSubStmt(int i) {
			return getRuleContext(VariableSubStmtContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public VariableListStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableListStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterVariableListStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitVariableListStmt(this);
		}
	}

	public final VariableListStmtContext variableListStmt() throws RecognitionException {
		VariableListStmtContext _localctx = new VariableListStmtContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_variableListStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2423);
			variableSubStmt();
			setState(2434);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,391,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2425);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(2424);
						match(WS);
						}
					}

					setState(2427);
					match(T__0);
					setState(2429);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(2428);
						match(WS);
						}
					}

					setState(2431);
					variableSubStmt();
					}
					} 
				}
				setState(2436);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,391,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableSubStmtContext extends ParserRuleContext {
		public AmbiguousIdentifierContext ambiguousIdentifier() {
			return getRuleContext(AmbiguousIdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(VbaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(VbaParser.RPAREN, 0); }
		public TypeHintContext typeHint() {
			return getRuleContext(TypeHintContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public AsTypeClauseContext asTypeClause() {
			return getRuleContext(AsTypeClauseContext.class,0);
		}
		public ConstSubscriptsContext constSubscripts() {
			return getRuleContext(ConstSubscriptsContext.class,0);
		}
		public VariableSubStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableSubStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterVariableSubStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitVariableSubStmt(this);
		}
	}

	public final VariableSubStmtContext variableSubStmt() throws RecognitionException {
		VariableSubStmtContext _localctx = new VariableSubStmtContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_variableSubStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2437);
			ambiguousIdentifier();
			setState(2455);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,397,_ctx) ) {
			case 1:
				{
				setState(2439);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(2438);
					match(WS);
					}
				}

				setState(2441);
				match(LPAREN);
				setState(2443);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(2442);
					match(WS);
					}
				}

				setState(2449);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (ENUM - 66)) | (1L << (EQV - 66)) | (1L << (ERASE - 66)) | (1L << (ERROR - 66)) | (1L << (EVENT - 66)) | (1L << (FALSE - 66)) | (1L << (FILECOPY - 66)) | (1L << (FRIEND - 66)) | (1L << (FOR - 66)) | (1L << (FUNCTION - 66)) | (1L << (GET - 66)) | (1L << (GLOBAL - 66)) | (1L << (GOSUB - 66)) | (1L << (GOTO - 66)) | (1L << (IF - 66)) | (1L << (IMP - 66)) | (1L << (IMPLEMENTS - 66)) | (1L << (IN - 66)) | (1L << (INPUT - 66)) | (1L << (IS - 66)) | (1L << (INTEGER - 66)) | (1L << (KILL - 66)) | (1L << (LOAD - 66)) | (1L << (LOCK - 66)) | (1L << (LONG - 66)) | (1L << (LOOP - 66)) | (1L << (LEN - 66)) | (1L << (LET - 66)) | (1L << (LIB - 66)) | (1L << (LIKE - 66)) | (1L << (LSET - 66)) | (1L << (ME - 66)) | (1L << (MID - 66)) | (1L << (MKDIR - 66)) | (1L << (MOD - 66)) | (1L << (NAME - 66)) | (1L << (NEXT - 66)) | (1L << (NEW - 66)) | (1L << (NOT - 66)) | (1L << (NOTHING - 66)) | (1L << (NULL - 66)) | (1L << (EMPTY - 66)) | (1L << (ON - 66)) | (1L << (OPEN - 66)) | (1L << (OPTIONAL - 66)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (OR - 133)) | (1L << (OUTPUT - 133)) | (1L << (PARAMARRAY - 133)) | (1L << (PRESERVE - 133)) | (1L << (PRINT - 133)) | (1L << (PRIVATE - 133)) | (1L << (PUBLIC - 133)) | (1L << (PUT - 133)) | (1L << (RANDOM - 133)) | (1L << (RANDOMIZE - 133)) | (1L << (RAISEEVENT - 133)) | (1L << (READ - 133)) | (1L << (REDIM - 133)) | (1L << (REM - 133)) | (1L << (RESET - 133)) | (1L << (RESUME - 133)) | (1L << (RETURN - 133)) | (1L << (RMDIR - 133)) | (1L << (RSET - 133)) | (1L << (SAVEPICTURE - 133)) | (1L << (SAVESETTING - 133)) | (1L << (SEEK - 133)) | (1L << (SELECT - 133)) | (1L << (SENDKEYS - 133)) | (1L << (SET - 133)) | (1L << (SETATTR - 133)) | (1L << (SHARED - 133)) | (1L << (SINGLE - 133)) | (1L << (SPC - 133)) | (1L << (STATIC - 133)) | (1L << (STEP - 133)) | (1L << (STRING - 133)) | (1L << (SUB - 133)) | (1L << (TAB - 133)) | (1L << (TEXT - 133)) | (1L << (THEN - 133)) | (1L << (TIME - 133)) | (1L << (TO - 133)) | (1L << (TRUE - 133)) | (1L << (TYPE - 133)) | (1L << (TYPEOF - 133)) | (1L << (UNLOAD - 133)) | (1L << (UNLOCK - 133)) | (1L << (UNTIL - 133)) | (1L << (VARIANT - 133)) | (1L << (VERSION - 133)) | (1L << (WEND - 133)) | (1L << (WHILE - 133)) | (1L << (WIDTH - 133)) | (1L << (WITH - 133)) | (1L << (WITHEVENTS - 133)) | (1L << (WRITE - 133)) | (1L << (XOR - 133)))) != 0) || ((((_la - 206)) & ~0x3f) == 0 && ((1L << (_la - 206)) & ((1L << (MINUS - 206)) | (1L << (PLUS - 206)) | (1L << (STRINGLITERAL - 206)) | (1L << (OCTLITERAL - 206)) | (1L << (HEXLITERAL - 206)) | (1L << (SHORTLITERAL - 206)) | (1L << (INTEGERLITERAL - 206)) | (1L << (DOUBLELITERAL - 206)) | (1L << (DATELITERAL - 206)) | (1L << (IDENTIFIER - 206)))) != 0)) {
					{
					setState(2445);
					constSubscripts();
					setState(2447);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(2446);
						match(WS);
						}
					}

					}
				}

				setState(2451);
				match(RPAREN);
				setState(2453);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,396,_ctx) ) {
				case 1:
					{
					setState(2452);
					match(WS);
					}
					break;
				}
				}
				break;
			}
			setState(2458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,398,_ctx) ) {
			case 1:
				{
				setState(2457);
				typeHint();
				}
				break;
			}
			setState(2462);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,399,_ctx) ) {
			case 1:
				{
				setState(2460);
				match(WS);
				setState(2461);
				asTypeClause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileWendStmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(VbaParser.WHILE, 0); }
		public TerminalNode WS() { return getToken(VbaParser.WS, 0); }
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public EndOfStatementContext endOfStatement() {
			return getRuleContext(EndOfStatementContext.class,0);
		}
		public TerminalNode WEND() { return getToken(VbaParser.WEND, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileWendStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileWendStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterWhileWendStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitWhileWendStmt(this);
		}
	}

	public final WhileWendStmtContext whileWendStmt() throws RecognitionException {
		WhileWendStmtContext _localctx = new WhileWendStmtContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_whileWendStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2464);
			match(WHILE);
			setState(2465);
			match(WS);
			setState(2466);
			valueStmt(0);
			setState(2467);
			endOfStatement();
			setState(2469);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,400,_ctx) ) {
			case 1:
				{
				setState(2468);
				block();
				}
				break;
			}
			setState(2471);
			match(WEND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WidthStmtContext extends ParserRuleContext {
		public TerminalNode WIDTH() { return getToken(VbaParser.WIDTH, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public FileNumberContext fileNumber() {
			return getRuleContext(FileNumberContext.class,0);
		}
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public WidthStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_widthStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterWidthStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitWidthStmt(this);
		}
	}

	public final WidthStmtContext widthStmt() throws RecognitionException {
		WidthStmtContext _localctx = new WidthStmtContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_widthStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2473);
			match(WIDTH);
			setState(2474);
			match(WS);
			setState(2475);
			fileNumber();
			setState(2477);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(2476);
				match(WS);
				}
			}

			setState(2479);
			match(T__0);
			setState(2481);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,402,_ctx) ) {
			case 1:
				{
				setState(2480);
				match(WS);
				}
				break;
			}
			setState(2483);
			valueStmt(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WithStmtContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(VbaParser.WITH, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public EndOfStatementContext endOfStatement() {
			return getRuleContext(EndOfStatementContext.class,0);
		}
		public TerminalNode END_WITH() { return getToken(VbaParser.END_WITH, 0); }
		public ImplicitCallStmt_InStmtContext implicitCallStmt_InStmt() {
			return getRuleContext(ImplicitCallStmt_InStmtContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode NEW() { return getToken(VbaParser.NEW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public WithStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterWithStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitWithStmt(this);
		}
	}

	public final WithStmtContext withStmt() throws RecognitionException {
		WithStmtContext _localctx = new WithStmtContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_withStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2485);
			match(WITH);
			setState(2486);
			match(WS);
			setState(2491);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,403,_ctx) ) {
			case 1:
				{
				setState(2487);
				implicitCallStmt_InStmt();
				}
				break;
			case 2:
				{
				{
				setState(2488);
				match(NEW);
				setState(2489);
				match(WS);
				setState(2490);
				type();
				}
				}
				break;
			}
			setState(2493);
			endOfStatement();
			setState(2495);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (END - 65)) | (1L << (ENUM - 65)) | (1L << (EQV - 65)) | (1L << (ERASE - 65)) | (1L << (ERROR - 65)) | (1L << (EVENT - 65)) | (1L << (EXIT_DO - 65)) | (1L << (EXIT_FOR - 65)) | (1L << (EXIT_FUNCTION - 65)) | (1L << (EXIT_PROPERTY - 65)) | (1L << (EXIT_SUB - 65)) | (1L << (EXIT_RULE - 65)) | (1L << (FALSE - 65)) | (1L << (FILECOPY - 65)) | (1L << (FRIEND - 65)) | (1L << (FOR - 65)) | (1L << (FUNCTION - 65)) | (1L << (GET - 65)) | (1L << (GLOBAL - 65)) | (1L << (GOSUB - 65)) | (1L << (GOTO - 65)) | (1L << (IF - 65)) | (1L << (IMP - 65)) | (1L << (IMPLEMENTS - 65)) | (1L << (IN - 65)) | (1L << (INPUT - 65)) | (1L << (IS - 65)) | (1L << (INTEGER - 65)) | (1L << (KILL - 65)) | (1L << (LOAD - 65)) | (1L << (LOCK - 65)) | (1L << (LONG - 65)) | (1L << (LOOP - 65)) | (1L << (LEN - 65)) | (1L << (LET - 65)) | (1L << (LIB - 65)) | (1L << (LIKE - 65)) | (1L << (LINE_INPUT - 65)) | (1L << (LSET - 65)) | (1L << (ME - 65)) | (1L << (MID - 65)) | (1L << (MKDIR - 65)) | (1L << (MOD - 65)) | (1L << (NAME - 65)) | (1L << (NEXT - 65)) | (1L << (NEW - 65)) | (1L << (NOT - 65)) | (1L << (NOTHING - 65)) | (1L << (NULL - 65)) | (1L << (EMPTY - 65)) | (1L << (ON - 65)) | (1L << (ON_ERROR - 65)) | (1L << (ON_LOCAL_ERROR - 65)) | (1L << (OPEN - 65)) | (1L << (OPTIONAL - 65)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (OR - 133)) | (1L << (OUTPUT - 133)) | (1L << (PARAMARRAY - 133)) | (1L << (PRESERVE - 133)) | (1L << (PRINT - 133)) | (1L << (PRIVATE - 133)) | (1L << (PUBLIC - 133)) | (1L << (PUT - 133)) | (1L << (RANDOM - 133)) | (1L << (RANDOMIZE - 133)) | (1L << (RAISEEVENT - 133)) | (1L << (READ - 133)) | (1L << (REDIM - 133)) | (1L << (REM - 133)) | (1L << (RESET - 133)) | (1L << (RESUME - 133)) | (1L << (RETURN - 133)) | (1L << (RMDIR - 133)) | (1L << (RSET - 133)) | (1L << (SAVEPICTURE - 133)) | (1L << (SAVESETTING - 133)) | (1L << (SEEK - 133)) | (1L << (SELECT - 133)) | (1L << (SENDKEYS - 133)) | (1L << (SET - 133)) | (1L << (SETATTR - 133)) | (1L << (SHARED - 133)) | (1L << (SINGLE - 133)) | (1L << (SPC - 133)) | (1L << (STATIC - 133)) | (1L << (STEP - 133)) | (1L << (STOP - 133)) | (1L << (STRING - 133)) | (1L << (SUB - 133)) | (1L << (TAB - 133)) | (1L << (TEXT - 133)) | (1L << (THEN - 133)) | (1L << (TIME - 133)) | (1L << (TO - 133)) | (1L << (TRUE - 133)) | (1L << (TYPE - 133)) | (1L << (TYPEOF - 133)) | (1L << (UNLOAD - 133)) | (1L << (UNLOCK - 133)) | (1L << (UNTIL - 133)) | (1L << (VARIANT - 133)) | (1L << (VERSION - 133)) | (1L << (WEND - 133)) | (1L << (WHILE - 133)) | (1L << (WIDTH - 133)) | (1L << (WITH - 133)) | (1L << (WITHEVENTS - 133)) | (1L << (WRITE - 133)) | (1L << (XOR - 133)))) != 0) || _la==WS || _la==IDENTIFIER) {
				{
				setState(2494);
				block();
				}
			}

			setState(2497);
			match(END_WITH);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WriteStmtContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(VbaParser.WRITE, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public FileNumberContext fileNumber() {
			return getRuleContext(FileNumberContext.class,0);
		}
		public OutputListContext outputList() {
			return getRuleContext(OutputListContext.class,0);
		}
		public WriteStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterWriteStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitWriteStmt(this);
		}
	}

	public final WriteStmtContext writeStmt() throws RecognitionException {
		WriteStmtContext _localctx = new WriteStmtContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_writeStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2499);
			match(WRITE);
			setState(2500);
			match(WS);
			setState(2501);
			fileNumber();
			setState(2503);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(2502);
				match(WS);
				}
			}

			setState(2505);
			match(T__0);
			setState(2510);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,407,_ctx) ) {
			case 1:
				{
				setState(2507);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,406,_ctx) ) {
				case 1:
					{
					setState(2506);
					match(WS);
					}
					break;
				}
				setState(2509);
				outputList();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileNumberContext extends ParserRuleContext {
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public FileNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterFileNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitFileNumber(this);
		}
	}

	public final FileNumberContext fileNumber() throws RecognitionException {
		FileNumberContext _localctx = new FileNumberContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_fileNumber);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2513);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(2512);
				match(T__3);
				}
			}

			setState(2515);
			valueStmt(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitCallStmtContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(VbaParser.CALL, 0); }
		public TerminalNode WS() { return getToken(VbaParser.WS, 0); }
		public ImplicitCallStmt_InStmtContext implicitCallStmt_InStmt() {
			return getRuleContext(ImplicitCallStmt_InStmtContext.class,0);
		}
		public ExplicitCallStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitCallStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterExplicitCallStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitExplicitCallStmt(this);
		}
	}

	public final ExplicitCallStmtContext explicitCallStmt() throws RecognitionException {
		ExplicitCallStmtContext _localctx = new ExplicitCallStmtContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_explicitCallStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2517);
			match(CALL);
			setState(2518);
			match(WS);
			setState(2519);
			implicitCallStmt_InStmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImplicitCallStmt_InBlockContext extends ParserRuleContext {
		public ImplicitCallStmt_InStmtContext implicitCallStmt_InStmt() {
			return getRuleContext(ImplicitCallStmt_InStmtContext.class,0);
		}
		public TerminalNode WS() { return getToken(VbaParser.WS, 0); }
		public ArgsCallContext argsCall() {
			return getRuleContext(ArgsCallContext.class,0);
		}
		public ImplicitCallStmt_InBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implicitCallStmt_InBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterImplicitCallStmt_InBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitImplicitCallStmt_InBlock(this);
		}
	}

	public final ImplicitCallStmt_InBlockContext implicitCallStmt_InBlock() throws RecognitionException {
		ImplicitCallStmt_InBlockContext _localctx = new ImplicitCallStmt_InBlockContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_implicitCallStmt_InBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2521);
			implicitCallStmt_InStmt();
			setState(2524);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,409,_ctx) ) {
			case 1:
				{
				setState(2522);
				match(WS);
				setState(2523);
				argsCall();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImplicitCallStmt_InStmtContext extends ParserRuleContext {
		public ICS_startElementContext iCS_startElement() {
			return getRuleContext(ICS_startElementContext.class,0);
		}
		public List<ICS_followElementContext> iCS_followElement() {
			return getRuleContexts(ICS_followElementContext.class);
		}
		public ICS_followElementContext iCS_followElement(int i) {
			return getRuleContext(ICS_followElementContext.class,i);
		}
		public ImplicitCallStmt_InStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implicitCallStmt_InStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterImplicitCallStmt_InStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitImplicitCallStmt_InStmt(this);
		}
	}

	public final ImplicitCallStmt_InStmtContext implicitCallStmt_InStmt() throws RecognitionException {
		ImplicitCallStmt_InStmtContext _localctx = new ImplicitCallStmt_InStmtContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_implicitCallStmt_InStmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2526);
			iCS_startElement();
			setState(2530);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,410,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2527);
					iCS_followElement();
					}
					} 
				}
				setState(2532);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,410,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ICS_startElementContext extends ParserRuleContext {
		public AmbiguousIdentifierContext ambiguousIdentifier() {
			return getRuleContext(AmbiguousIdentifierContext.class,0);
		}
		public TypeHintContext typeHint() {
			return getRuleContext(TypeHintContext.class,0);
		}
		public MemberCallContext memberCall() {
			return getRuleContext(MemberCallContext.class,0);
		}
		public DictionaryCallContext dictionaryCall() {
			return getRuleContext(DictionaryCallContext.class,0);
		}
		public ICS_startElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iCS_startElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterICS_startElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitICS_startElement(this);
		}
	}

	public final ICS_startElementContext iCS_startElement() throws RecognitionException {
		ICS_startElementContext _localctx = new ICS_startElementContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_iCS_startElement);
		try {
			setState(2539);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,412,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2533);
				ambiguousIdentifier();
				setState(2535);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,411,_ctx) ) {
				case 1:
					{
					setState(2534);
					typeHint();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2537);
				memberCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2538);
				dictionaryCall();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ICS_followElementContext extends ParserRuleContext {
		public MemberCallContext memberCall() {
			return getRuleContext(MemberCallContext.class,0);
		}
		public DictionaryCallContext dictionaryCall() {
			return getRuleContext(DictionaryCallContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(VbaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(VbaParser.RPAREN, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public ArgsCallContext argsCall() {
			return getRuleContext(ArgsCallContext.class,0);
		}
		public ICS_followElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iCS_followElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterICS_followElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitICS_followElement(this);
		}
	}

	public final ICS_followElementContext iCS_followElement() throws RecognitionException {
		ICS_followElementContext _localctx = new ICS_followElementContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_iCS_followElement);
		int _la;
		try {
			setState(2554);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,416,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2541);
				memberCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2542);
				dictionaryCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2543);
				match(LPAREN);
				setState(2545);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,413,_ctx) ) {
				case 1:
					{
					setState(2544);
					match(WS);
					}
					break;
				}
				setState(2548);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,414,_ctx) ) {
				case 1:
					{
					setState(2547);
					argsCall();
					}
					break;
				}
				setState(2551);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(2550);
					match(WS);
					}
				}

				setState(2553);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberCallContext extends ParserRuleContext {
		public AmbiguousIdentifierContext ambiguousIdentifier() {
			return getRuleContext(AmbiguousIdentifierContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public MemberCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterMemberCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitMemberCall(this);
		}
	}

	public final MemberCallContext memberCall() throws RecognitionException {
		MemberCallContext _localctx = new MemberCallContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_memberCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2557);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(2556);
				match(WS);
				}
			}

			setState(2559);
			match(T__2);
			setState(2561);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(2560);
				match(WS);
				}
			}

			setState(2563);
			ambiguousIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DictionaryCallContext extends ParserRuleContext {
		public AmbiguousIdentifierContext ambiguousIdentifier() {
			return getRuleContext(AmbiguousIdentifierContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public DictionaryCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionaryCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterDictionaryCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitDictionaryCall(this);
		}
	}

	public final DictionaryCallContext dictionaryCall() throws RecognitionException {
		DictionaryCallContext _localctx = new DictionaryCallContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_dictionaryCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2566);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(2565);
				match(WS);
				}
			}

			setState(2568);
			match(T__4);
			setState(2570);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(2569);
				match(WS);
				}
			}

			setState(2572);
			ambiguousIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgsCallContext extends ParserRuleContext {
		public List<ArgCallContext> argCall() {
			return getRuleContexts(ArgCallContext.class);
		}
		public ArgCallContext argCall(int i) {
			return getRuleContext(ArgCallContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public ArgsCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argsCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterArgsCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitArgsCall(this);
		}
	}

	public final ArgsCallContext argsCall() throws RecognitionException {
		ArgsCallContext _localctx = new ArgsCallContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_argsCall);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2586);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,424,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2575);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,421,_ctx) ) {
					case 1:
						{
						setState(2574);
						argCall();
						}
						break;
					}
					setState(2578);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(2577);
						match(WS);
						}
					}

					setState(2580);
					match(T__0);
					setState(2582);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,423,_ctx) ) {
					case 1:
						{
						setState(2581);
						match(WS);
						}
						break;
					}
					}
					} 
				}
				setState(2588);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,424,_ctx);
			}
			setState(2589);
			argCall();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgCallContext extends ParserRuleContext {
		public ValueStmtContext valueStmt() {
			return getRuleContext(ValueStmtContext.class,0);
		}
		public AmbiguousIdentifierContext ambiguousIdentifier() {
			return getRuleContext(AmbiguousIdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(VbaParser.ASSIGN, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public ArgCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterArgCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitArgCall(this);
		}
	}

	public final ArgCallContext argCall() throws RecognitionException {
		ArgCallContext _localctx = new ArgCallContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_argCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2599);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,427,_ctx) ) {
			case 1:
				{
				setState(2591);
				ambiguousIdentifier();
				setState(2593);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(2592);
					match(WS);
					}
				}

				setState(2595);
				match(ASSIGN);
				setState(2597);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,426,_ctx) ) {
				case 1:
					{
					setState(2596);
					match(WS);
					}
					break;
				}
				}
				break;
			}
			setState(2601);
			valueStmt(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgListContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(VbaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(VbaParser.RPAREN, 0); }
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public ArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitArgList(this);
		}
	}

	public final ArgListContext argList() throws RecognitionException {
		ArgListContext _localctx = new ArgListContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_argList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2603);
			match(LPAREN);
			setState(2621);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,432,_ctx) ) {
			case 1:
				{
				setState(2605);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(2604);
					match(WS);
					}
				}

				setState(2607);
				arg();
				setState(2618);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,431,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2609);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2608);
							match(WS);
							}
						}

						setState(2611);
						match(T__0);
						setState(2613);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2612);
							match(WS);
							}
						}

						setState(2615);
						arg();
						}
						} 
					}
					setState(2620);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,431,_ctx);
				}
				}
				break;
			}
			setState(2624);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(2623);
				match(WS);
				}
			}

			setState(2626);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgContext extends ParserRuleContext {
		public AmbiguousIdentifierContext ambiguousIdentifier() {
			return getRuleContext(AmbiguousIdentifierContext.class,0);
		}
		public TerminalNode OPTIONAL() { return getToken(VbaParser.OPTIONAL, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public TerminalNode PARAMARRAY() { return getToken(VbaParser.PARAMARRAY, 0); }
		public TypeHintContext typeHint() {
			return getRuleContext(TypeHintContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(VbaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(VbaParser.RPAREN, 0); }
		public AsTypeClauseContext asTypeClause() {
			return getRuleContext(AsTypeClauseContext.class,0);
		}
		public ArgDefaultValueContext argDefaultValue() {
			return getRuleContext(ArgDefaultValueContext.class,0);
		}
		public TerminalNode BYVAL() { return getToken(VbaParser.BYVAL, 0); }
		public TerminalNode BYREF() { return getToken(VbaParser.BYREF, 0); }
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitArg(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_arg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2630);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,434,_ctx) ) {
			case 1:
				{
				setState(2628);
				match(OPTIONAL);
				setState(2629);
				match(WS);
				}
				break;
			}
			setState(2634);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,435,_ctx) ) {
			case 1:
				{
				setState(2632);
				_la = _input.LA(1);
				if ( !(_la==BYVAL || _la==BYREF) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(2633);
				match(WS);
				}
				break;
			}
			setState(2638);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,436,_ctx) ) {
			case 1:
				{
				setState(2636);
				match(PARAMARRAY);
				setState(2637);
				match(WS);
				}
				break;
			}
			setState(2640);
			ambiguousIdentifier();
			setState(2642);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0) || _la==AMPERSAND) {
				{
				setState(2641);
				typeHint();
				}
			}

			setState(2652);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,440,_ctx) ) {
			case 1:
				{
				setState(2645);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(2644);
					match(WS);
					}
				}

				setState(2647);
				match(LPAREN);
				setState(2649);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(2648);
					match(WS);
					}
				}

				setState(2651);
				match(RPAREN);
				}
				break;
			}
			setState(2658);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,442,_ctx) ) {
			case 1:
				{
				setState(2655);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(2654);
					match(WS);
					}
				}

				setState(2657);
				asTypeClause();
				}
				break;
			}
			setState(2664);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,444,_ctx) ) {
			case 1:
				{
				setState(2661);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(2660);
					match(WS);
					}
				}

				setState(2663);
				argDefaultValue();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgDefaultValueContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(VbaParser.EQ, 0); }
		public ConstValueExprContext constValueExpr() {
			return getRuleContext(ConstValueExprContext.class,0);
		}
		public TerminalNode WS() { return getToken(VbaParser.WS, 0); }
		public ArgDefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argDefaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterArgDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitArgDefaultValue(this);
		}
	}

	public final ArgDefaultValueContext argDefaultValue() throws RecognitionException {
		ArgDefaultValueContext _localctx = new ArgDefaultValueContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_argDefaultValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2666);
			match(EQ);
			setState(2668);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(2667);
				match(WS);
				}
			}

			setState(2670);
			constValueExpr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubscriptsContext extends ParserRuleContext {
		public List<SubscriptContext> subscript() {
			return getRuleContexts(SubscriptContext.class);
		}
		public SubscriptContext subscript(int i) {
			return getRuleContext(SubscriptContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public SubscriptsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscripts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterSubscripts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitSubscripts(this);
		}
	}

	public final SubscriptsContext subscripts() throws RecognitionException {
		SubscriptsContext _localctx = new SubscriptsContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_subscripts);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2672);
			subscript();
			setState(2683);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,448,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2674);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(2673);
						match(WS);
						}
					}

					setState(2676);
					match(T__0);
					setState(2678);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,447,_ctx) ) {
					case 1:
						{
						setState(2677);
						match(WS);
						}
						break;
					}
					setState(2680);
					subscript();
					}
					} 
				}
				setState(2685);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,448,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubscriptContext extends ParserRuleContext {
		public List<ValueStmtContext> valueStmt() {
			return getRuleContexts(ValueStmtContext.class);
		}
		public ValueStmtContext valueStmt(int i) {
			return getRuleContext(ValueStmtContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public TerminalNode TO() { return getToken(VbaParser.TO, 0); }
		public SubscriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscript; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterSubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitSubscript(this);
		}
	}

	public final SubscriptContext subscript() throws RecognitionException {
		SubscriptContext _localctx = new SubscriptContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_subscript);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2691);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,449,_ctx) ) {
			case 1:
				{
				setState(2686);
				valueStmt(0);
				setState(2687);
				match(WS);
				setState(2688);
				match(TO);
				setState(2689);
				match(WS);
				}
				break;
			}
			setState(2693);
			valueStmt(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstSubscriptsContext extends ParserRuleContext {
		public List<ConstSubscriptContext> constSubscript() {
			return getRuleContexts(ConstSubscriptContext.class);
		}
		public ConstSubscriptContext constSubscript(int i) {
			return getRuleContext(ConstSubscriptContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public ConstSubscriptsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constSubscripts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterConstSubscripts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitConstSubscripts(this);
		}
	}

	public final ConstSubscriptsContext constSubscripts() throws RecognitionException {
		ConstSubscriptsContext _localctx = new ConstSubscriptsContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_constSubscripts);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2695);
			constSubscript();
			setState(2706);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,452,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2697);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(2696);
						match(WS);
						}
					}

					setState(2699);
					match(T__0);
					setState(2701);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(2700);
						match(WS);
						}
					}

					setState(2703);
					constSubscript();
					}
					} 
				}
				setState(2708);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,452,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstSubscriptContext extends ParserRuleContext {
		public List<ConstValueExprContext> constValueExpr() {
			return getRuleContexts(ConstValueExprContext.class);
		}
		public ConstValueExprContext constValueExpr(int i) {
			return getRuleContext(ConstValueExprContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public TerminalNode TO() { return getToken(VbaParser.TO, 0); }
		public ConstSubscriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constSubscript; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterConstSubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitConstSubscript(this);
		}
	}

	public final ConstSubscriptContext constSubscript() throws RecognitionException {
		ConstSubscriptContext _localctx = new ConstSubscriptContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_constSubscript);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2714);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,453,_ctx) ) {
			case 1:
				{
				setState(2709);
				constValueExpr(0);
				setState(2710);
				match(WS);
				setState(2711);
				match(TO);
				setState(2712);
				match(WS);
				}
				break;
			}
			setState(2716);
			constValueExpr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AmbiguousIdentifierContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(VbaParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(VbaParser.IDENTIFIER, i);
		}
		public List<AmbiguousKeywordContext> ambiguousKeyword() {
			return getRuleContexts(AmbiguousKeywordContext.class);
		}
		public AmbiguousKeywordContext ambiguousKeyword(int i) {
			return getRuleContext(AmbiguousKeywordContext.class,i);
		}
		public AmbiguousIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ambiguousIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterAmbiguousIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitAmbiguousIdentifier(this);
		}
	}

	public final AmbiguousIdentifierContext ambiguousIdentifier() throws RecognitionException {
		AmbiguousIdentifierContext _localctx = new AmbiguousIdentifierContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_ambiguousIdentifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2720); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(2720);
					switch (_input.LA(1)) {
					case IDENTIFIER:
						{
						setState(2718);
						match(IDENTIFIER);
						}
						break;
					case ACCESS:
					case ADDRESSOF:
					case ALIAS:
					case AND:
					case ATTRIBUTE:
					case APPACTIVATE:
					case APPEND:
					case BEGIN:
					case BEEP:
					case BINARY:
					case BOOLEAN:
					case BYVAL:
					case BYREF:
					case BYTE:
					case CALL:
					case CHDIR:
					case CHDRIVE:
					case CLASS:
					case CLOSE:
					case COLLECTION:
					case CONST:
					case DATABASE:
					case DATE:
					case DECLARE:
					case DEFBOOL:
					case DEFBYTE:
					case DEFDATE:
					case DEFDBL:
					case DEFDEC:
					case DEFCUR:
					case DEFINT:
					case DEFLNG:
					case DEFOBJ:
					case DEFSNG:
					case DEFSTR:
					case DEFVAR:
					case DELETESETTING:
					case DIM:
					case DO:
					case DOUBLE:
					case EACH:
					case ENUM:
					case EQV:
					case ERASE:
					case ERROR:
					case EVENT:
					case FALSE:
					case FILECOPY:
					case FRIEND:
					case FOR:
					case FUNCTION:
					case GET:
					case GLOBAL:
					case GOSUB:
					case GOTO:
					case IF:
					case IMP:
					case IMPLEMENTS:
					case IN:
					case INPUT:
					case IS:
					case INTEGER:
					case KILL:
					case LOAD:
					case LOCK:
					case LONG:
					case LOOP:
					case LEN:
					case LET:
					case LIB:
					case LIKE:
					case LSET:
					case ME:
					case MID:
					case MKDIR:
					case MOD:
					case NAME:
					case NEXT:
					case NEW:
					case NOT:
					case NOTHING:
					case NULL:
					case EMPTY:
					case ON:
					case OPEN:
					case OPTIONAL:
					case OR:
					case OUTPUT:
					case PARAMARRAY:
					case PRESERVE:
					case PRINT:
					case PRIVATE:
					case PUBLIC:
					case PUT:
					case RANDOM:
					case RANDOMIZE:
					case RAISEEVENT:
					case READ:
					case REDIM:
					case REM:
					case RESET:
					case RESUME:
					case RETURN:
					case RMDIR:
					case RSET:
					case SAVEPICTURE:
					case SAVESETTING:
					case SEEK:
					case SELECT:
					case SENDKEYS:
					case SET:
					case SETATTR:
					case SHARED:
					case SINGLE:
					case SPC:
					case STATIC:
					case STEP:
					case STRING:
					case SUB:
					case TAB:
					case TEXT:
					case THEN:
					case TIME:
					case TO:
					case TRUE:
					case TYPE:
					case TYPEOF:
					case UNLOAD:
					case UNLOCK:
					case UNTIL:
					case VARIANT:
					case VERSION:
					case WEND:
					case WHILE:
					case WIDTH:
					case WITH:
					case WITHEVENTS:
					case WRITE:
					case XOR:
						{
						setState(2719);
						ambiguousKeyword();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2722); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,455,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsTypeClauseContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(VbaParser.AS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public TerminalNode NEW() { return getToken(VbaParser.NEW, 0); }
		public FieldLengthContext fieldLength() {
			return getRuleContext(FieldLengthContext.class,0);
		}
		public AsTypeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asTypeClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterAsTypeClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitAsTypeClause(this);
		}
	}

	public final AsTypeClauseContext asTypeClause() throws RecognitionException {
		AsTypeClauseContext _localctx = new AsTypeClauseContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_asTypeClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2724);
			match(AS);
			setState(2726);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(2725);
				match(WS);
				}
			}

			setState(2730);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,457,_ctx) ) {
			case 1:
				{
				setState(2728);
				match(NEW);
				setState(2729);
				match(WS);
				}
				break;
			}
			setState(2732);
			type();
			setState(2737);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,459,_ctx) ) {
			case 1:
				{
				setState(2734);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(2733);
					match(WS);
					}
				}

				setState(2736);
				fieldLength();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BaseTypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(VbaParser.BOOLEAN, 0); }
		public TerminalNode BYTE() { return getToken(VbaParser.BYTE, 0); }
		public TerminalNode DATE() { return getToken(VbaParser.DATE, 0); }
		public TerminalNode DOUBLE() { return getToken(VbaParser.DOUBLE, 0); }
		public TerminalNode INTEGER() { return getToken(VbaParser.INTEGER, 0); }
		public TerminalNode LONG() { return getToken(VbaParser.LONG, 0); }
		public TerminalNode SINGLE() { return getToken(VbaParser.SINGLE, 0); }
		public TerminalNode CURRENCY() { return getToken(VbaParser.CURRENCY, 0); }
		public TerminalNode DECIMAL() { return getToken(VbaParser.DECIMAL, 0); }
		public TerminalNode STRING() { return getToken(VbaParser.STRING, 0); }
		public TerminalNode VARIANT() { return getToken(VbaParser.VARIANT, 0); }
		public TerminalNode OBJECT() { return getToken(VbaParser.OBJECT, 0); }
		public TerminalNode IUNKNOWN() { return getToken(VbaParser.IUNKNOWN, 0); }
		public BaseTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterBaseType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitBaseType(this);
		}
	}

	public final BaseTypeContext baseType() throws RecognitionException {
		BaseTypeContext _localctx = new BaseTypeContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_baseType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2739);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << DATE) | (1L << DOUBLE))) != 0) || _la==INTEGER || _la==LONG || ((((_la - 165)) & ~0x3f) == 0 && ((1L << (_la - 165)) & ((1L << (SINGLE - 165)) | (1L << (CURRENCY - 165)) | (1L << (DECIMAL - 165)) | (1L << (STRING - 165)) | (1L << (VARIANT - 165)) | (1L << (OBJECT - 165)) | (1L << (IUNKNOWN - 165)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CertainIdentifierContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(VbaParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(VbaParser.IDENTIFIER, i);
		}
		public List<AmbiguousKeywordContext> ambiguousKeyword() {
			return getRuleContexts(AmbiguousKeywordContext.class);
		}
		public AmbiguousKeywordContext ambiguousKeyword(int i) {
			return getRuleContext(AmbiguousKeywordContext.class,i);
		}
		public CertainIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_certainIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterCertainIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitCertainIdentifier(this);
		}
	}

	public final CertainIdentifierContext certainIdentifier() throws RecognitionException {
		CertainIdentifierContext _localctx = new CertainIdentifierContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_certainIdentifier);
		int _la;
		try {
			setState(2756);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2741);
				match(IDENTIFIER);
				setState(2746);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (ENUM - 66)) | (1L << (EQV - 66)) | (1L << (ERASE - 66)) | (1L << (ERROR - 66)) | (1L << (EVENT - 66)) | (1L << (FALSE - 66)) | (1L << (FILECOPY - 66)) | (1L << (FRIEND - 66)) | (1L << (FOR - 66)) | (1L << (FUNCTION - 66)) | (1L << (GET - 66)) | (1L << (GLOBAL - 66)) | (1L << (GOSUB - 66)) | (1L << (GOTO - 66)) | (1L << (IF - 66)) | (1L << (IMP - 66)) | (1L << (IMPLEMENTS - 66)) | (1L << (IN - 66)) | (1L << (INPUT - 66)) | (1L << (IS - 66)) | (1L << (INTEGER - 66)) | (1L << (KILL - 66)) | (1L << (LOAD - 66)) | (1L << (LOCK - 66)) | (1L << (LONG - 66)) | (1L << (LOOP - 66)) | (1L << (LEN - 66)) | (1L << (LET - 66)) | (1L << (LIB - 66)) | (1L << (LIKE - 66)) | (1L << (LSET - 66)) | (1L << (ME - 66)) | (1L << (MID - 66)) | (1L << (MKDIR - 66)) | (1L << (MOD - 66)) | (1L << (NAME - 66)) | (1L << (NEXT - 66)) | (1L << (NEW - 66)) | (1L << (NOT - 66)) | (1L << (NOTHING - 66)) | (1L << (NULL - 66)) | (1L << (EMPTY - 66)) | (1L << (ON - 66)) | (1L << (OPEN - 66)) | (1L << (OPTIONAL - 66)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (OR - 133)) | (1L << (OUTPUT - 133)) | (1L << (PARAMARRAY - 133)) | (1L << (PRESERVE - 133)) | (1L << (PRINT - 133)) | (1L << (PRIVATE - 133)) | (1L << (PUBLIC - 133)) | (1L << (PUT - 133)) | (1L << (RANDOM - 133)) | (1L << (RANDOMIZE - 133)) | (1L << (RAISEEVENT - 133)) | (1L << (READ - 133)) | (1L << (REDIM - 133)) | (1L << (REM - 133)) | (1L << (RESET - 133)) | (1L << (RESUME - 133)) | (1L << (RETURN - 133)) | (1L << (RMDIR - 133)) | (1L << (RSET - 133)) | (1L << (SAVEPICTURE - 133)) | (1L << (SAVESETTING - 133)) | (1L << (SEEK - 133)) | (1L << (SELECT - 133)) | (1L << (SENDKEYS - 133)) | (1L << (SET - 133)) | (1L << (SETATTR - 133)) | (1L << (SHARED - 133)) | (1L << (SINGLE - 133)) | (1L << (SPC - 133)) | (1L << (STATIC - 133)) | (1L << (STEP - 133)) | (1L << (STRING - 133)) | (1L << (SUB - 133)) | (1L << (TAB - 133)) | (1L << (TEXT - 133)) | (1L << (THEN - 133)) | (1L << (TIME - 133)) | (1L << (TO - 133)) | (1L << (TRUE - 133)) | (1L << (TYPE - 133)) | (1L << (TYPEOF - 133)) | (1L << (UNLOAD - 133)) | (1L << (UNLOCK - 133)) | (1L << (UNTIL - 133)) | (1L << (VARIANT - 133)) | (1L << (VERSION - 133)) | (1L << (WEND - 133)) | (1L << (WHILE - 133)) | (1L << (WIDTH - 133)) | (1L << (WITH - 133)) | (1L << (WITHEVENTS - 133)) | (1L << (WRITE - 133)) | (1L << (XOR - 133)))) != 0) || _la==IDENTIFIER) {
					{
					setState(2744);
					switch (_input.LA(1)) {
					case ACCESS:
					case ADDRESSOF:
					case ALIAS:
					case AND:
					case ATTRIBUTE:
					case APPACTIVATE:
					case APPEND:
					case BEGIN:
					case BEEP:
					case BINARY:
					case BOOLEAN:
					case BYVAL:
					case BYREF:
					case BYTE:
					case CALL:
					case CHDIR:
					case CHDRIVE:
					case CLASS:
					case CLOSE:
					case COLLECTION:
					case CONST:
					case DATABASE:
					case DATE:
					case DECLARE:
					case DEFBOOL:
					case DEFBYTE:
					case DEFDATE:
					case DEFDBL:
					case DEFDEC:
					case DEFCUR:
					case DEFINT:
					case DEFLNG:
					case DEFOBJ:
					case DEFSNG:
					case DEFSTR:
					case DEFVAR:
					case DELETESETTING:
					case DIM:
					case DO:
					case DOUBLE:
					case EACH:
					case ENUM:
					case EQV:
					case ERASE:
					case ERROR:
					case EVENT:
					case FALSE:
					case FILECOPY:
					case FRIEND:
					case FOR:
					case FUNCTION:
					case GET:
					case GLOBAL:
					case GOSUB:
					case GOTO:
					case IF:
					case IMP:
					case IMPLEMENTS:
					case IN:
					case INPUT:
					case IS:
					case INTEGER:
					case KILL:
					case LOAD:
					case LOCK:
					case LONG:
					case LOOP:
					case LEN:
					case LET:
					case LIB:
					case LIKE:
					case LSET:
					case ME:
					case MID:
					case MKDIR:
					case MOD:
					case NAME:
					case NEXT:
					case NEW:
					case NOT:
					case NOTHING:
					case NULL:
					case EMPTY:
					case ON:
					case OPEN:
					case OPTIONAL:
					case OR:
					case OUTPUT:
					case PARAMARRAY:
					case PRESERVE:
					case PRINT:
					case PRIVATE:
					case PUBLIC:
					case PUT:
					case RANDOM:
					case RANDOMIZE:
					case RAISEEVENT:
					case READ:
					case REDIM:
					case REM:
					case RESET:
					case RESUME:
					case RETURN:
					case RMDIR:
					case RSET:
					case SAVEPICTURE:
					case SAVESETTING:
					case SEEK:
					case SELECT:
					case SENDKEYS:
					case SET:
					case SETATTR:
					case SHARED:
					case SINGLE:
					case SPC:
					case STATIC:
					case STEP:
					case STRING:
					case SUB:
					case TAB:
					case TEXT:
					case THEN:
					case TIME:
					case TO:
					case TRUE:
					case TYPE:
					case TYPEOF:
					case UNLOAD:
					case UNLOCK:
					case UNTIL:
					case VARIANT:
					case VERSION:
					case WEND:
					case WHILE:
					case WIDTH:
					case WITH:
					case WITHEVENTS:
					case WRITE:
					case XOR:
						{
						setState(2742);
						ambiguousKeyword();
						}
						break;
					case IDENTIFIER:
						{
						setState(2743);
						match(IDENTIFIER);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(2748);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case ACCESS:
			case ADDRESSOF:
			case ALIAS:
			case AND:
			case ATTRIBUTE:
			case APPACTIVATE:
			case APPEND:
			case BEGIN:
			case BEEP:
			case BINARY:
			case BOOLEAN:
			case BYVAL:
			case BYREF:
			case BYTE:
			case CALL:
			case CHDIR:
			case CHDRIVE:
			case CLASS:
			case CLOSE:
			case COLLECTION:
			case CONST:
			case DATABASE:
			case DATE:
			case DECLARE:
			case DEFBOOL:
			case DEFBYTE:
			case DEFDATE:
			case DEFDBL:
			case DEFDEC:
			case DEFCUR:
			case DEFINT:
			case DEFLNG:
			case DEFOBJ:
			case DEFSNG:
			case DEFSTR:
			case DEFVAR:
			case DELETESETTING:
			case DIM:
			case DO:
			case DOUBLE:
			case EACH:
			case ENUM:
			case EQV:
			case ERASE:
			case ERROR:
			case EVENT:
			case FALSE:
			case FILECOPY:
			case FRIEND:
			case FOR:
			case FUNCTION:
			case GET:
			case GLOBAL:
			case GOSUB:
			case GOTO:
			case IF:
			case IMP:
			case IMPLEMENTS:
			case IN:
			case INPUT:
			case IS:
			case INTEGER:
			case KILL:
			case LOAD:
			case LOCK:
			case LONG:
			case LOOP:
			case LEN:
			case LET:
			case LIB:
			case LIKE:
			case LSET:
			case ME:
			case MID:
			case MKDIR:
			case MOD:
			case NAME:
			case NEXT:
			case NEW:
			case NOT:
			case NOTHING:
			case NULL:
			case EMPTY:
			case ON:
			case OPEN:
			case OPTIONAL:
			case OR:
			case OUTPUT:
			case PARAMARRAY:
			case PRESERVE:
			case PRINT:
			case PRIVATE:
			case PUBLIC:
			case PUT:
			case RANDOM:
			case RANDOMIZE:
			case RAISEEVENT:
			case READ:
			case REDIM:
			case REM:
			case RESET:
			case RESUME:
			case RETURN:
			case RMDIR:
			case RSET:
			case SAVEPICTURE:
			case SAVESETTING:
			case SEEK:
			case SELECT:
			case SENDKEYS:
			case SET:
			case SETATTR:
			case SHARED:
			case SINGLE:
			case SPC:
			case STATIC:
			case STEP:
			case STRING:
			case SUB:
			case TAB:
			case TEXT:
			case THEN:
			case TIME:
			case TO:
			case TRUE:
			case TYPE:
			case TYPEOF:
			case UNLOAD:
			case UNLOCK:
			case UNTIL:
			case VARIANT:
			case VERSION:
			case WEND:
			case WHILE:
			case WIDTH:
			case WITH:
			case WITHEVENTS:
			case WRITE:
			case XOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(2749);
				ambiguousKeyword();
				setState(2752); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(2752);
					switch (_input.LA(1)) {
					case ACCESS:
					case ADDRESSOF:
					case ALIAS:
					case AND:
					case ATTRIBUTE:
					case APPACTIVATE:
					case APPEND:
					case BEGIN:
					case BEEP:
					case BINARY:
					case BOOLEAN:
					case BYVAL:
					case BYREF:
					case BYTE:
					case CALL:
					case CHDIR:
					case CHDRIVE:
					case CLASS:
					case CLOSE:
					case COLLECTION:
					case CONST:
					case DATABASE:
					case DATE:
					case DECLARE:
					case DEFBOOL:
					case DEFBYTE:
					case DEFDATE:
					case DEFDBL:
					case DEFDEC:
					case DEFCUR:
					case DEFINT:
					case DEFLNG:
					case DEFOBJ:
					case DEFSNG:
					case DEFSTR:
					case DEFVAR:
					case DELETESETTING:
					case DIM:
					case DO:
					case DOUBLE:
					case EACH:
					case ENUM:
					case EQV:
					case ERASE:
					case ERROR:
					case EVENT:
					case FALSE:
					case FILECOPY:
					case FRIEND:
					case FOR:
					case FUNCTION:
					case GET:
					case GLOBAL:
					case GOSUB:
					case GOTO:
					case IF:
					case IMP:
					case IMPLEMENTS:
					case IN:
					case INPUT:
					case IS:
					case INTEGER:
					case KILL:
					case LOAD:
					case LOCK:
					case LONG:
					case LOOP:
					case LEN:
					case LET:
					case LIB:
					case LIKE:
					case LSET:
					case ME:
					case MID:
					case MKDIR:
					case MOD:
					case NAME:
					case NEXT:
					case NEW:
					case NOT:
					case NOTHING:
					case NULL:
					case EMPTY:
					case ON:
					case OPEN:
					case OPTIONAL:
					case OR:
					case OUTPUT:
					case PARAMARRAY:
					case PRESERVE:
					case PRINT:
					case PRIVATE:
					case PUBLIC:
					case PUT:
					case RANDOM:
					case RANDOMIZE:
					case RAISEEVENT:
					case READ:
					case REDIM:
					case REM:
					case RESET:
					case RESUME:
					case RETURN:
					case RMDIR:
					case RSET:
					case SAVEPICTURE:
					case SAVESETTING:
					case SEEK:
					case SELECT:
					case SENDKEYS:
					case SET:
					case SETATTR:
					case SHARED:
					case SINGLE:
					case SPC:
					case STATIC:
					case STEP:
					case STRING:
					case SUB:
					case TAB:
					case TEXT:
					case THEN:
					case TIME:
					case TO:
					case TRUE:
					case TYPE:
					case TYPEOF:
					case UNLOAD:
					case UNLOCK:
					case UNTIL:
					case VARIANT:
					case VERSION:
					case WEND:
					case WHILE:
					case WIDTH:
					case WITH:
					case WITHEVENTS:
					case WRITE:
					case XOR:
						{
						setState(2750);
						ambiguousKeyword();
						}
						break;
					case IDENTIFIER:
						{
						setState(2751);
						match(IDENTIFIER);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(2754); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (ENUM - 66)) | (1L << (EQV - 66)) | (1L << (ERASE - 66)) | (1L << (ERROR - 66)) | (1L << (EVENT - 66)) | (1L << (FALSE - 66)) | (1L << (FILECOPY - 66)) | (1L << (FRIEND - 66)) | (1L << (FOR - 66)) | (1L << (FUNCTION - 66)) | (1L << (GET - 66)) | (1L << (GLOBAL - 66)) | (1L << (GOSUB - 66)) | (1L << (GOTO - 66)) | (1L << (IF - 66)) | (1L << (IMP - 66)) | (1L << (IMPLEMENTS - 66)) | (1L << (IN - 66)) | (1L << (INPUT - 66)) | (1L << (IS - 66)) | (1L << (INTEGER - 66)) | (1L << (KILL - 66)) | (1L << (LOAD - 66)) | (1L << (LOCK - 66)) | (1L << (LONG - 66)) | (1L << (LOOP - 66)) | (1L << (LEN - 66)) | (1L << (LET - 66)) | (1L << (LIB - 66)) | (1L << (LIKE - 66)) | (1L << (LSET - 66)) | (1L << (ME - 66)) | (1L << (MID - 66)) | (1L << (MKDIR - 66)) | (1L << (MOD - 66)) | (1L << (NAME - 66)) | (1L << (NEXT - 66)) | (1L << (NEW - 66)) | (1L << (NOT - 66)) | (1L << (NOTHING - 66)) | (1L << (NULL - 66)) | (1L << (EMPTY - 66)) | (1L << (ON - 66)) | (1L << (OPEN - 66)) | (1L << (OPTIONAL - 66)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (OR - 133)) | (1L << (OUTPUT - 133)) | (1L << (PARAMARRAY - 133)) | (1L << (PRESERVE - 133)) | (1L << (PRINT - 133)) | (1L << (PRIVATE - 133)) | (1L << (PUBLIC - 133)) | (1L << (PUT - 133)) | (1L << (RANDOM - 133)) | (1L << (RANDOMIZE - 133)) | (1L << (RAISEEVENT - 133)) | (1L << (READ - 133)) | (1L << (REDIM - 133)) | (1L << (REM - 133)) | (1L << (RESET - 133)) | (1L << (RESUME - 133)) | (1L << (RETURN - 133)) | (1L << (RMDIR - 133)) | (1L << (RSET - 133)) | (1L << (SAVEPICTURE - 133)) | (1L << (SAVESETTING - 133)) | (1L << (SEEK - 133)) | (1L << (SELECT - 133)) | (1L << (SENDKEYS - 133)) | (1L << (SET - 133)) | (1L << (SETATTR - 133)) | (1L << (SHARED - 133)) | (1L << (SINGLE - 133)) | (1L << (SPC - 133)) | (1L << (STATIC - 133)) | (1L << (STEP - 133)) | (1L << (STRING - 133)) | (1L << (SUB - 133)) | (1L << (TAB - 133)) | (1L << (TEXT - 133)) | (1L << (THEN - 133)) | (1L << (TIME - 133)) | (1L << (TO - 133)) | (1L << (TRUE - 133)) | (1L << (TYPE - 133)) | (1L << (TYPEOF - 133)) | (1L << (UNLOAD - 133)) | (1L << (UNLOCK - 133)) | (1L << (UNTIL - 133)) | (1L << (VARIANT - 133)) | (1L << (VERSION - 133)) | (1L << (WEND - 133)) | (1L << (WHILE - 133)) | (1L << (WIDTH - 133)) | (1L << (WITH - 133)) | (1L << (WITHEVENTS - 133)) | (1L << (WRITE - 133)) | (1L << (XOR - 133)))) != 0) || _la==IDENTIFIER );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(VbaParser.LT, 0); }
		public TerminalNode LEQ() { return getToken(VbaParser.LEQ, 0); }
		public TerminalNode GT() { return getToken(VbaParser.GT, 0); }
		public TerminalNode GEQ() { return getToken(VbaParser.GEQ, 0); }
		public TerminalNode EQ() { return getToken(VbaParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(VbaParser.NEQ, 0); }
		public TerminalNode IS() { return getToken(VbaParser.IS, 0); }
		public TerminalNode LIKE() { return getToken(VbaParser.LIKE, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitComparisonOperator(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2758);
			_la = _input.LA(1);
			if ( !(_la==IS || _la==LIKE || ((((_la - 200)) & ~0x3f) == 0 && ((1L << (_la - 200)) & ((1L << (EQ - 200)) | (1L << (GEQ - 200)) | (1L << (GT - 200)) | (1L << (LEQ - 200)) | (1L << (LT - 200)) | (1L << (NEQ - 200)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FixedSizeStringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(VbaParser.STRING, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public AmbiguousIdentifierContext ambiguousIdentifier() {
			return getRuleContext(AmbiguousIdentifierContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public FixedSizeStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixedSizeString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterFixedSizeString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitFixedSizeString(this);
		}
	}

	public final FixedSizeStringContext fixedSizeString() throws RecognitionException {
		FixedSizeStringContext _localctx = new FixedSizeStringContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_fixedSizeString);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2760);
			match(STRING);
			setState(2762);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(2761);
				match(WS);
				}
			}

			setState(2764);
			match(MULT);
			setState(2766);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(2765);
				match(WS);
				}
			}

			setState(2770);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,467,_ctx) ) {
			case 1:
				{
				setState(2768);
				literal();
				}
				break;
			case 2:
				{
				setState(2769);
				ambiguousIdentifier();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComplexTypeContext extends ParserRuleContext {
		public List<AmbiguousIdentifierContext> ambiguousIdentifier() {
			return getRuleContexts(AmbiguousIdentifierContext.class);
		}
		public AmbiguousIdentifierContext ambiguousIdentifier(int i) {
			return getRuleContext(AmbiguousIdentifierContext.class,i);
		}
		public ComplexTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterComplexType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitComplexType(this);
		}
	}

	public final ComplexTypeContext complexType() throws RecognitionException {
		ComplexTypeContext _localctx = new ComplexTypeContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_complexType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2772);
			ambiguousIdentifier();
			setState(2777);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,468,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2773);
					match(T__2);
					setState(2774);
					ambiguousIdentifier();
					}
					} 
				}
				setState(2779);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,468,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldLengthContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(VbaParser.MULT, 0); }
		public TerminalNode INTEGERLITERAL() { return getToken(VbaParser.INTEGERLITERAL, 0); }
		public AmbiguousIdentifierContext ambiguousIdentifier() {
			return getRuleContext(AmbiguousIdentifierContext.class,0);
		}
		public TerminalNode WS() { return getToken(VbaParser.WS, 0); }
		public FieldLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldLength; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterFieldLength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitFieldLength(this);
		}
	}

	public final FieldLengthContext fieldLength() throws RecognitionException {
		FieldLengthContext _localctx = new FieldLengthContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_fieldLength);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2780);
			match(MULT);
			setState(2782);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(2781);
				match(WS);
				}
			}

			setState(2786);
			switch (_input.LA(1)) {
			case INTEGERLITERAL:
				{
				setState(2784);
				match(INTEGERLITERAL);
				}
				break;
			case ACCESS:
			case ADDRESSOF:
			case ALIAS:
			case AND:
			case ATTRIBUTE:
			case APPACTIVATE:
			case APPEND:
			case BEGIN:
			case BEEP:
			case BINARY:
			case BOOLEAN:
			case BYVAL:
			case BYREF:
			case BYTE:
			case CALL:
			case CHDIR:
			case CHDRIVE:
			case CLASS:
			case CLOSE:
			case COLLECTION:
			case CONST:
			case DATABASE:
			case DATE:
			case DECLARE:
			case DEFBOOL:
			case DEFBYTE:
			case DEFDATE:
			case DEFDBL:
			case DEFDEC:
			case DEFCUR:
			case DEFINT:
			case DEFLNG:
			case DEFOBJ:
			case DEFSNG:
			case DEFSTR:
			case DEFVAR:
			case DELETESETTING:
			case DIM:
			case DO:
			case DOUBLE:
			case EACH:
			case ENUM:
			case EQV:
			case ERASE:
			case ERROR:
			case EVENT:
			case FALSE:
			case FILECOPY:
			case FRIEND:
			case FOR:
			case FUNCTION:
			case GET:
			case GLOBAL:
			case GOSUB:
			case GOTO:
			case IF:
			case IMP:
			case IMPLEMENTS:
			case IN:
			case INPUT:
			case IS:
			case INTEGER:
			case KILL:
			case LOAD:
			case LOCK:
			case LONG:
			case LOOP:
			case LEN:
			case LET:
			case LIB:
			case LIKE:
			case LSET:
			case ME:
			case MID:
			case MKDIR:
			case MOD:
			case NAME:
			case NEXT:
			case NEW:
			case NOT:
			case NOTHING:
			case NULL:
			case EMPTY:
			case ON:
			case OPEN:
			case OPTIONAL:
			case OR:
			case OUTPUT:
			case PARAMARRAY:
			case PRESERVE:
			case PRINT:
			case PRIVATE:
			case PUBLIC:
			case PUT:
			case RANDOM:
			case RANDOMIZE:
			case RAISEEVENT:
			case READ:
			case REDIM:
			case REM:
			case RESET:
			case RESUME:
			case RETURN:
			case RMDIR:
			case RSET:
			case SAVEPICTURE:
			case SAVESETTING:
			case SEEK:
			case SELECT:
			case SENDKEYS:
			case SET:
			case SETATTR:
			case SHARED:
			case SINGLE:
			case SPC:
			case STATIC:
			case STEP:
			case STRING:
			case SUB:
			case TAB:
			case TEXT:
			case THEN:
			case TIME:
			case TO:
			case TRUE:
			case TYPE:
			case TYPEOF:
			case UNLOAD:
			case UNLOCK:
			case UNTIL:
			case VARIANT:
			case VERSION:
			case WEND:
			case WHILE:
			case WIDTH:
			case WITH:
			case WITHEVENTS:
			case WRITE:
			case XOR:
			case IDENTIFIER:
				{
				setState(2785);
				ambiguousIdentifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LetterrangeContext extends ParserRuleContext {
		public List<CertainIdentifierContext> certainIdentifier() {
			return getRuleContexts(CertainIdentifierContext.class);
		}
		public CertainIdentifierContext certainIdentifier(int i) {
			return getRuleContext(CertainIdentifierContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(VbaParser.MINUS, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public LetterrangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letterrange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterLetterrange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitLetterrange(this);
		}
	}

	public final LetterrangeContext letterrange() throws RecognitionException {
		LetterrangeContext _localctx = new LetterrangeContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_letterrange);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2788);
			certainIdentifier();
			setState(2797);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,473,_ctx) ) {
			case 1:
				{
				setState(2790);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(2789);
					match(WS);
					}
				}

				setState(2792);
				match(MINUS);
				setState(2794);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(2793);
					match(WS);
					}
				}

				setState(2796);
				certainIdentifier();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineLabelContext extends ParserRuleContext {
		public AmbiguousIdentifierContext ambiguousIdentifier() {
			return getRuleContext(AmbiguousIdentifierContext.class,0);
		}
		public LineLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterLineLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitLineLabel(this);
		}
	}

	public final LineLabelContext lineLabel() throws RecognitionException {
		LineLabelContext _localctx = new LineLabelContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_lineLabel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2799);
			ambiguousIdentifier();
			setState(2800);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode HEXLITERAL() { return getToken(VbaParser.HEXLITERAL, 0); }
		public TerminalNode OCTLITERAL() { return getToken(VbaParser.OCTLITERAL, 0); }
		public TerminalNode DATELITERAL() { return getToken(VbaParser.DATELITERAL, 0); }
		public TerminalNode DOUBLELITERAL() { return getToken(VbaParser.DOUBLELITERAL, 0); }
		public TerminalNode INTEGERLITERAL() { return getToken(VbaParser.INTEGERLITERAL, 0); }
		public TerminalNode SHORTLITERAL() { return getToken(VbaParser.SHORTLITERAL, 0); }
		public TerminalNode STRINGLITERAL() { return getToken(VbaParser.STRINGLITERAL, 0); }
		public TerminalNode TRUE() { return getToken(VbaParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(VbaParser.FALSE, 0); }
		public TerminalNode NOTHING() { return getToken(VbaParser.NOTHING, 0); }
		public TerminalNode NULL() { return getToken(VbaParser.NULL, 0); }
		public TerminalNode EMPTY() { return getToken(VbaParser.EMPTY, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2802);
			_la = _input.LA(1);
			if ( !(((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (FALSE - 77)) | (1L << (NOTHING - 77)) | (1L << (NULL - 77)) | (1L << (EMPTY - 77)))) != 0) || ((((_la - 179)) & ~0x3f) == 0 && ((1L << (_la - 179)) & ((1L << (TRUE - 179)) | (1L << (STRINGLITERAL - 179)) | (1L << (OCTLITERAL - 179)) | (1L << (HEXLITERAL - 179)) | (1L << (SHORTLITERAL - 179)) | (1L << (INTEGERLITERAL - 179)) | (1L << (DOUBLELITERAL - 179)) | (1L << (DATELITERAL - 179)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public FixedSizeStringContext fixedSizeString() {
			return getRuleContext(FixedSizeStringContext.class,0);
		}
		public BaseTypeContext baseType() {
			return getRuleContext(BaseTypeContext.class,0);
		}
		public ComplexTypeContext complexType() {
			return getRuleContext(ComplexTypeContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(VbaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(VbaParser.RPAREN, 0); }
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2807);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,474,_ctx) ) {
			case 1:
				{
				setState(2804);
				fixedSizeString();
				}
				break;
			case 2:
				{
				setState(2805);
				baseType();
				}
				break;
			case 3:
				{
				setState(2806);
				complexType();
				}
				break;
			}
			setState(2817);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,477,_ctx) ) {
			case 1:
				{
				setState(2810);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(2809);
					match(WS);
					}
				}

				setState(2812);
				match(LPAREN);
				setState(2814);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(2813);
					match(WS);
					}
				}

				setState(2816);
				match(RPAREN);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeHintContext extends ParserRuleContext {
		public TypeHintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeHint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterTypeHint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitTypeHint(this);
		}
	}

	public final TypeHintContext typeHint() throws RecognitionException {
		TypeHintContext _localctx = new TypeHintContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_typeHint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2819);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0) || _la==AMPERSAND) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VisibilityContext extends ParserRuleContext {
		public TerminalNode PRIVATE() { return getToken(VbaParser.PRIVATE, 0); }
		public TerminalNode PUBLIC() { return getToken(VbaParser.PUBLIC, 0); }
		public TerminalNode FRIEND() { return getToken(VbaParser.FRIEND, 0); }
		public TerminalNode GLOBAL() { return getToken(VbaParser.GLOBAL, 0); }
		public VisibilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_visibility; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterVisibility(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitVisibility(this);
		}
	}

	public final VisibilityContext visibility() throws RecognitionException {
		VisibilityContext _localctx = new VisibilityContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_visibility);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2821);
			_la = _input.LA(1);
			if ( !(((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (FRIEND - 79)) | (1L << (GLOBAL - 79)) | (1L << (PRIVATE - 79)))) != 0) || _la==PUBLIC) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AmbiguousKeywordContext extends ParserRuleContext {
		public TerminalNode ACCESS() { return getToken(VbaParser.ACCESS, 0); }
		public TerminalNode ADDRESSOF() { return getToken(VbaParser.ADDRESSOF, 0); }
		public TerminalNode ALIAS() { return getToken(VbaParser.ALIAS, 0); }
		public TerminalNode AND() { return getToken(VbaParser.AND, 0); }
		public TerminalNode ATTRIBUTE() { return getToken(VbaParser.ATTRIBUTE, 0); }
		public TerminalNode APPACTIVATE() { return getToken(VbaParser.APPACTIVATE, 0); }
		public TerminalNode APPEND() { return getToken(VbaParser.APPEND, 0); }
		public TerminalNode BEEP() { return getToken(VbaParser.BEEP, 0); }
		public TerminalNode BEGIN() { return getToken(VbaParser.BEGIN, 0); }
		public TerminalNode BINARY() { return getToken(VbaParser.BINARY, 0); }
		public TerminalNode BOOLEAN() { return getToken(VbaParser.BOOLEAN, 0); }
		public TerminalNode BYVAL() { return getToken(VbaParser.BYVAL, 0); }
		public TerminalNode BYREF() { return getToken(VbaParser.BYREF, 0); }
		public TerminalNode BYTE() { return getToken(VbaParser.BYTE, 0); }
		public TerminalNode CALL() { return getToken(VbaParser.CALL, 0); }
		public TerminalNode CLASS() { return getToken(VbaParser.CLASS, 0); }
		public TerminalNode CLOSE() { return getToken(VbaParser.CLOSE, 0); }
		public TerminalNode CHDIR() { return getToken(VbaParser.CHDIR, 0); }
		public TerminalNode CHDRIVE() { return getToken(VbaParser.CHDRIVE, 0); }
		public TerminalNode COLLECTION() { return getToken(VbaParser.COLLECTION, 0); }
		public TerminalNode CONST() { return getToken(VbaParser.CONST, 0); }
		public TerminalNode DATABASE() { return getToken(VbaParser.DATABASE, 0); }
		public TerminalNode DATE() { return getToken(VbaParser.DATE, 0); }
		public TerminalNode DECLARE() { return getToken(VbaParser.DECLARE, 0); }
		public TerminalNode DEFBOOL() { return getToken(VbaParser.DEFBOOL, 0); }
		public TerminalNode DEFBYTE() { return getToken(VbaParser.DEFBYTE, 0); }
		public TerminalNode DEFCUR() { return getToken(VbaParser.DEFCUR, 0); }
		public TerminalNode DEFDBL() { return getToken(VbaParser.DEFDBL, 0); }
		public TerminalNode DEFDATE() { return getToken(VbaParser.DEFDATE, 0); }
		public TerminalNode DEFDEC() { return getToken(VbaParser.DEFDEC, 0); }
		public TerminalNode DEFINT() { return getToken(VbaParser.DEFINT, 0); }
		public TerminalNode DEFLNG() { return getToken(VbaParser.DEFLNG, 0); }
		public TerminalNode DEFOBJ() { return getToken(VbaParser.DEFOBJ, 0); }
		public TerminalNode DEFSNG() { return getToken(VbaParser.DEFSNG, 0); }
		public TerminalNode DEFSTR() { return getToken(VbaParser.DEFSTR, 0); }
		public TerminalNode DEFVAR() { return getToken(VbaParser.DEFVAR, 0); }
		public TerminalNode DELETESETTING() { return getToken(VbaParser.DELETESETTING, 0); }
		public TerminalNode DIM() { return getToken(VbaParser.DIM, 0); }
		public TerminalNode DO() { return getToken(VbaParser.DO, 0); }
		public TerminalNode DOUBLE() { return getToken(VbaParser.DOUBLE, 0); }
		public TerminalNode EACH() { return getToken(VbaParser.EACH, 0); }
		public TerminalNode ENUM() { return getToken(VbaParser.ENUM, 0); }
		public TerminalNode EQV() { return getToken(VbaParser.EQV, 0); }
		public TerminalNode ERASE() { return getToken(VbaParser.ERASE, 0); }
		public TerminalNode ERROR() { return getToken(VbaParser.ERROR, 0); }
		public TerminalNode EVENT() { return getToken(VbaParser.EVENT, 0); }
		public TerminalNode FALSE() { return getToken(VbaParser.FALSE, 0); }
		public TerminalNode FILECOPY() { return getToken(VbaParser.FILECOPY, 0); }
		public TerminalNode FRIEND() { return getToken(VbaParser.FRIEND, 0); }
		public TerminalNode FOR() { return getToken(VbaParser.FOR, 0); }
		public TerminalNode FUNCTION() { return getToken(VbaParser.FUNCTION, 0); }
		public TerminalNode GET() { return getToken(VbaParser.GET, 0); }
		public TerminalNode GLOBAL() { return getToken(VbaParser.GLOBAL, 0); }
		public TerminalNode GOSUB() { return getToken(VbaParser.GOSUB, 0); }
		public TerminalNode GOTO() { return getToken(VbaParser.GOTO, 0); }
		public TerminalNode IF() { return getToken(VbaParser.IF, 0); }
		public TerminalNode IMP() { return getToken(VbaParser.IMP, 0); }
		public TerminalNode IMPLEMENTS() { return getToken(VbaParser.IMPLEMENTS, 0); }
		public TerminalNode IN() { return getToken(VbaParser.IN, 0); }
		public TerminalNode INPUT() { return getToken(VbaParser.INPUT, 0); }
		public TerminalNode IS() { return getToken(VbaParser.IS, 0); }
		public TerminalNode INTEGER() { return getToken(VbaParser.INTEGER, 0); }
		public TerminalNode KILL() { return getToken(VbaParser.KILL, 0); }
		public TerminalNode LOAD() { return getToken(VbaParser.LOAD, 0); }
		public TerminalNode LOCK() { return getToken(VbaParser.LOCK, 0); }
		public TerminalNode LONG() { return getToken(VbaParser.LONG, 0); }
		public TerminalNode LOOP() { return getToken(VbaParser.LOOP, 0); }
		public TerminalNode LEN() { return getToken(VbaParser.LEN, 0); }
		public TerminalNode LET() { return getToken(VbaParser.LET, 0); }
		public TerminalNode LIB() { return getToken(VbaParser.LIB, 0); }
		public TerminalNode LIKE() { return getToken(VbaParser.LIKE, 0); }
		public TerminalNode LSET() { return getToken(VbaParser.LSET, 0); }
		public TerminalNode ME() { return getToken(VbaParser.ME, 0); }
		public TerminalNode MID() { return getToken(VbaParser.MID, 0); }
		public TerminalNode MKDIR() { return getToken(VbaParser.MKDIR, 0); }
		public TerminalNode MOD() { return getToken(VbaParser.MOD, 0); }
		public TerminalNode NAME() { return getToken(VbaParser.NAME, 0); }
		public TerminalNode NEXT() { return getToken(VbaParser.NEXT, 0); }
		public TerminalNode NEW() { return getToken(VbaParser.NEW, 0); }
		public TerminalNode NOT() { return getToken(VbaParser.NOT, 0); }
		public TerminalNode NOTHING() { return getToken(VbaParser.NOTHING, 0); }
		public TerminalNode NULL() { return getToken(VbaParser.NULL, 0); }
		public TerminalNode EMPTY() { return getToken(VbaParser.EMPTY, 0); }
		public TerminalNode ON() { return getToken(VbaParser.ON, 0); }
		public TerminalNode OPEN() { return getToken(VbaParser.OPEN, 0); }
		public TerminalNode OPTIONAL() { return getToken(VbaParser.OPTIONAL, 0); }
		public TerminalNode OR() { return getToken(VbaParser.OR, 0); }
		public TerminalNode OUTPUT() { return getToken(VbaParser.OUTPUT, 0); }
		public TerminalNode PARAMARRAY() { return getToken(VbaParser.PARAMARRAY, 0); }
		public TerminalNode PRESERVE() { return getToken(VbaParser.PRESERVE, 0); }
		public TerminalNode PRINT() { return getToken(VbaParser.PRINT, 0); }
		public TerminalNode PRIVATE() { return getToken(VbaParser.PRIVATE, 0); }
		public TerminalNode PUBLIC() { return getToken(VbaParser.PUBLIC, 0); }
		public TerminalNode PUT() { return getToken(VbaParser.PUT, 0); }
		public TerminalNode RANDOM() { return getToken(VbaParser.RANDOM, 0); }
		public TerminalNode RANDOMIZE() { return getToken(VbaParser.RANDOMIZE, 0); }
		public TerminalNode RAISEEVENT() { return getToken(VbaParser.RAISEEVENT, 0); }
		public TerminalNode READ() { return getToken(VbaParser.READ, 0); }
		public TerminalNode REDIM() { return getToken(VbaParser.REDIM, 0); }
		public TerminalNode REM() { return getToken(VbaParser.REM, 0); }
		public TerminalNode RESET() { return getToken(VbaParser.RESET, 0); }
		public TerminalNode RESUME() { return getToken(VbaParser.RESUME, 0); }
		public TerminalNode RETURN() { return getToken(VbaParser.RETURN, 0); }
		public TerminalNode RMDIR() { return getToken(VbaParser.RMDIR, 0); }
		public TerminalNode RSET() { return getToken(VbaParser.RSET, 0); }
		public TerminalNode SAVEPICTURE() { return getToken(VbaParser.SAVEPICTURE, 0); }
		public TerminalNode SAVESETTING() { return getToken(VbaParser.SAVESETTING, 0); }
		public TerminalNode SEEK() { return getToken(VbaParser.SEEK, 0); }
		public TerminalNode SELECT() { return getToken(VbaParser.SELECT, 0); }
		public TerminalNode SENDKEYS() { return getToken(VbaParser.SENDKEYS, 0); }
		public TerminalNode SET() { return getToken(VbaParser.SET, 0); }
		public TerminalNode SETATTR() { return getToken(VbaParser.SETATTR, 0); }
		public TerminalNode SHARED() { return getToken(VbaParser.SHARED, 0); }
		public TerminalNode SINGLE() { return getToken(VbaParser.SINGLE, 0); }
		public TerminalNode SPC() { return getToken(VbaParser.SPC, 0); }
		public TerminalNode STATIC() { return getToken(VbaParser.STATIC, 0); }
		public TerminalNode STEP() { return getToken(VbaParser.STEP, 0); }
		public TerminalNode STRING() { return getToken(VbaParser.STRING, 0); }
		public TerminalNode SUB() { return getToken(VbaParser.SUB, 0); }
		public TerminalNode TAB() { return getToken(VbaParser.TAB, 0); }
		public TerminalNode TEXT() { return getToken(VbaParser.TEXT, 0); }
		public TerminalNode THEN() { return getToken(VbaParser.THEN, 0); }
		public TerminalNode TIME() { return getToken(VbaParser.TIME, 0); }
		public TerminalNode TO() { return getToken(VbaParser.TO, 0); }
		public TerminalNode TRUE() { return getToken(VbaParser.TRUE, 0); }
		public TerminalNode TYPE() { return getToken(VbaParser.TYPE, 0); }
		public TerminalNode TYPEOF() { return getToken(VbaParser.TYPEOF, 0); }
		public TerminalNode UNLOAD() { return getToken(VbaParser.UNLOAD, 0); }
		public TerminalNode UNLOCK() { return getToken(VbaParser.UNLOCK, 0); }
		public TerminalNode UNTIL() { return getToken(VbaParser.UNTIL, 0); }
		public TerminalNode VARIANT() { return getToken(VbaParser.VARIANT, 0); }
		public TerminalNode VERSION() { return getToken(VbaParser.VERSION, 0); }
		public TerminalNode WEND() { return getToken(VbaParser.WEND, 0); }
		public TerminalNode WHILE() { return getToken(VbaParser.WHILE, 0); }
		public TerminalNode WIDTH() { return getToken(VbaParser.WIDTH, 0); }
		public TerminalNode WITH() { return getToken(VbaParser.WITH, 0); }
		public TerminalNode WITHEVENTS() { return getToken(VbaParser.WITHEVENTS, 0); }
		public TerminalNode WRITE() { return getToken(VbaParser.WRITE, 0); }
		public TerminalNode XOR() { return getToken(VbaParser.XOR, 0); }
		public AmbiguousKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ambiguousKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterAmbiguousKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitAmbiguousKeyword(this);
		}
	}

	public final AmbiguousKeywordContext ambiguousKeyword() throws RecognitionException {
		AmbiguousKeywordContext _localctx = new AmbiguousKeywordContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_ambiguousKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2823);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (ENUM - 66)) | (1L << (EQV - 66)) | (1L << (ERASE - 66)) | (1L << (ERROR - 66)) | (1L << (EVENT - 66)) | (1L << (FALSE - 66)) | (1L << (FILECOPY - 66)) | (1L << (FRIEND - 66)) | (1L << (FOR - 66)) | (1L << (FUNCTION - 66)) | (1L << (GET - 66)) | (1L << (GLOBAL - 66)) | (1L << (GOSUB - 66)) | (1L << (GOTO - 66)) | (1L << (IF - 66)) | (1L << (IMP - 66)) | (1L << (IMPLEMENTS - 66)) | (1L << (IN - 66)) | (1L << (INPUT - 66)) | (1L << (IS - 66)) | (1L << (INTEGER - 66)) | (1L << (KILL - 66)) | (1L << (LOAD - 66)) | (1L << (LOCK - 66)) | (1L << (LONG - 66)) | (1L << (LOOP - 66)) | (1L << (LEN - 66)) | (1L << (LET - 66)) | (1L << (LIB - 66)) | (1L << (LIKE - 66)) | (1L << (LSET - 66)) | (1L << (ME - 66)) | (1L << (MID - 66)) | (1L << (MKDIR - 66)) | (1L << (MOD - 66)) | (1L << (NAME - 66)) | (1L << (NEXT - 66)) | (1L << (NEW - 66)) | (1L << (NOT - 66)) | (1L << (NOTHING - 66)) | (1L << (NULL - 66)) | (1L << (EMPTY - 66)) | (1L << (ON - 66)) | (1L << (OPEN - 66)) | (1L << (OPTIONAL - 66)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (OR - 133)) | (1L << (OUTPUT - 133)) | (1L << (PARAMARRAY - 133)) | (1L << (PRESERVE - 133)) | (1L << (PRINT - 133)) | (1L << (PRIVATE - 133)) | (1L << (PUBLIC - 133)) | (1L << (PUT - 133)) | (1L << (RANDOM - 133)) | (1L << (RANDOMIZE - 133)) | (1L << (RAISEEVENT - 133)) | (1L << (READ - 133)) | (1L << (REDIM - 133)) | (1L << (REM - 133)) | (1L << (RESET - 133)) | (1L << (RESUME - 133)) | (1L << (RETURN - 133)) | (1L << (RMDIR - 133)) | (1L << (RSET - 133)) | (1L << (SAVEPICTURE - 133)) | (1L << (SAVESETTING - 133)) | (1L << (SEEK - 133)) | (1L << (SELECT - 133)) | (1L << (SENDKEYS - 133)) | (1L << (SET - 133)) | (1L << (SETATTR - 133)) | (1L << (SHARED - 133)) | (1L << (SINGLE - 133)) | (1L << (SPC - 133)) | (1L << (STATIC - 133)) | (1L << (STEP - 133)) | (1L << (STRING - 133)) | (1L << (SUB - 133)) | (1L << (TAB - 133)) | (1L << (TEXT - 133)) | (1L << (THEN - 133)) | (1L << (TIME - 133)) | (1L << (TO - 133)) | (1L << (TRUE - 133)) | (1L << (TYPE - 133)) | (1L << (TYPEOF - 133)) | (1L << (UNLOAD - 133)) | (1L << (UNLOCK - 133)) | (1L << (UNTIL - 133)) | (1L << (VARIANT - 133)) | (1L << (VERSION - 133)) | (1L << (WEND - 133)) | (1L << (WHILE - 133)) | (1L << (WIDTH - 133)) | (1L << (WITH - 133)) | (1L << (WITHEVENTS - 133)) | (1L << (WRITE - 133)) | (1L << (XOR - 133)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RemCommentContext extends ParserRuleContext {
		public TerminalNode REMCOMMENT() { return getToken(VbaParser.REMCOMMENT, 0); }
		public RemCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_remComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterRemComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitRemComment(this);
		}
	}

	public final RemCommentContext remComment() throws RecognitionException {
		RemCommentContext _localctx = new RemCommentContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_remComment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2825);
			match(REMCOMMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(VbaParser.COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2827);
			match(COMMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndOfLineContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(VbaParser.NEWLINE, 0); }
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public RemCommentContext remComment() {
			return getRuleContext(RemCommentContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public EndOfLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endOfLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterEndOfLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitEndOfLine(this);
		}
	}

	public final EndOfLineContext endOfLine() throws RecognitionException {
		EndOfLineContext _localctx = new EndOfLineContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_endOfLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2830);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(2829);
				match(WS);
				}
			}

			setState(2835);
			switch (_input.LA(1)) {
			case NEWLINE:
				{
				setState(2832);
				match(NEWLINE);
				}
				break;
			case COMMENT:
				{
				setState(2833);
				comment();
				}
				break;
			case REMCOMMENT:
				{
				setState(2834);
				remComment();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2838);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,480,_ctx) ) {
			case 1:
				{
				setState(2837);
				match(WS);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndOfStatementContext extends ParserRuleContext {
		public List<EndOfLineContext> endOfLine() {
			return getRuleContexts(EndOfLineContext.class);
		}
		public EndOfLineContext endOfLine(int i) {
			return getRuleContext(EndOfLineContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(VbaParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(VbaParser.COLON, i);
		}
		public List<TerminalNode> WS() { return getTokens(VbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VbaParser.WS, i);
		}
		public EndOfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endOfStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterEndOfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitEndOfStatement(this);
		}
	}

	public final EndOfStatementContext endOfStatement() throws RecognitionException {
		EndOfStatementContext _localctx = new EndOfStatementContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_endOfStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2848); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(2848);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,483,_ctx) ) {
					case 1:
						{
						setState(2840);
						endOfLine();
						}
						break;
					case 2:
						{
						setState(2842);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2841);
							match(WS);
							}
						}

						setState(2844);
						match(COLON);
						setState(2846);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,482,_ctx) ) {
						case 1:
							{
							setState(2845);
							match(WS);
							}
							break;
						}
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2850); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,484,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 104:
			return constValueExpr_sempred((ConstValueExprContext)_localctx, predIndex);
		case 105:
			return valueStmt_sempred((ValueStmtContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean constValueExpr_sempred(ConstValueExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 22);
		case 1:
			return precpred(_ctx, 19);
		case 2:
			return precpred(_ctx, 18);
		case 3:
			return precpred(_ctx, 17);
		case 4:
			return precpred(_ctx, 16);
		case 5:
			return precpred(_ctx, 15);
		case 6:
			return precpred(_ctx, 14);
		case 7:
			return precpred(_ctx, 13);
		case 8:
			return precpred(_ctx, 12);
		case 9:
			return precpred(_ctx, 11);
		case 10:
			return precpred(_ctx, 10);
		case 11:
			return precpred(_ctx, 9);
		case 12:
			return precpred(_ctx, 8);
		case 13:
			return precpred(_ctx, 7);
		case 14:
			return precpred(_ctx, 5);
		case 15:
			return precpred(_ctx, 4);
		case 16:
			return precpred(_ctx, 3);
		case 17:
			return precpred(_ctx, 2);
		case 18:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean valueStmt_sempred(ValueStmtContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19:
			return precpred(_ctx, 23);
		case 20:
			return precpred(_ctx, 20);
		case 21:
			return precpred(_ctx, 19);
		case 22:
			return precpred(_ctx, 18);
		case 23:
			return precpred(_ctx, 17);
		case 24:
			return precpred(_ctx, 16);
		case 25:
			return precpred(_ctx, 15);
		case 26:
			return precpred(_ctx, 14);
		case 27:
			return precpred(_ctx, 13);
		case 28:
			return precpred(_ctx, 12);
		case 29:
			return precpred(_ctx, 11);
		case 30:
			return precpred(_ctx, 10);
		case 31:
			return precpred(_ctx, 9);
		case 32:
			return precpred(_ctx, 8);
		case 33:
			return precpred(_ctx, 7);
		case 34:
			return precpred(_ctx, 5);
		case 35:
			return precpred(_ctx, 4);
		case 36:
			return precpred(_ctx, 3);
		case 37:
			return precpred(_ctx, 2);
		case 38:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u00e9\u0b27\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\3\2\3"+
		"\2\3\2\3\3\5\3\u0131\n\3\3\3\7\3\u0134\n\3\f\3\16\3\u0137\13\3\3\3\3\3"+
		"\7\3\u013b\n\3\f\3\16\3\u013e\13\3\5\3\u0140\n\3\3\3\3\3\7\3\u0144\n\3"+
		"\f\3\16\3\u0147\13\3\5\3\u0149\n\3\3\3\5\3\u014c\n\3\3\3\7\3\u014f\n\3"+
		"\f\3\16\3\u0152\13\3\3\3\5\3\u0155\n\3\3\3\7\3\u0158\n\3\f\3\16\3\u015b"+
		"\13\3\3\3\5\3\u015e\n\3\3\3\7\3\u0161\n\3\f\3\16\3\u0164\13\3\3\3\5\3"+
		"\u0167\n\3\3\3\7\3\u016a\n\3\f\3\16\3\u016d\13\3\3\3\5\3\u0170\n\3\3\4"+
		"\3\4\3\4\3\4\3\4\5\4\u0177\n\4\3\5\3\5\7\5\u017b\n\5\f\5\16\5\u017e\13"+
		"\5\3\5\6\5\u0181\n\5\r\5\16\5\u0182\3\5\3\5\3\6\3\6\3\6\5\6\u018a\n\6"+
		"\3\6\3\6\5\6\u018e\n\6\3\6\3\6\7\6\u0192\n\6\f\6\16\6\u0195\13\6\5\6\u0197"+
		"\n\6\3\7\3\7\3\7\3\7\6\7\u019d\n\7\r\7\16\7\u019e\3\7\6\7\u01a2\n\7\r"+
		"\7\16\7\u01a3\3\7\3\7\6\7\u01a8\n\7\r\7\16\7\u01a9\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\7\b\u01b2\n\b\f\b\16\b\u01b5\13\b\3\b\6\b\u01b8\n\b\r\b\16\b\u01b9"+
		"\3\b\7\b\u01bd\n\b\f\b\16\b\u01c0\13\b\3\b\3\b\6\b\u01c4\n\b\r\b\16\b"+
		"\u01c5\3\t\3\t\6\t\u01ca\n\t\r\t\16\t\u01cb\6\t\u01ce\n\t\r\t\16\t\u01cf"+
		"\3\n\3\n\6\n\u01d4\n\n\r\n\16\n\u01d5\3\n\3\n\7\n\u01da\n\n\f\n\16\n\u01dd"+
		"\13\n\3\n\7\n\u01e0\n\n\f\n\16\n\u01e3\13\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\5\13\u01ed\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\5\f\u01f9\n\f\3\r\3\r\5\r\u01fd\n\r\3\16\3\16\6\16\u0201\n\16\r\16\16"+
		"\16\u0202\3\16\3\16\7\16\u0207\n\16\f\16\16\16\u020a\13\16\3\16\7\16\u020d"+
		"\n\16\f\16\16\16\u0210\13\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0218"+
		"\n\17\3\20\3\20\3\20\3\20\5\20\u021e\n\20\3\20\3\20\5\20\u0222\n\20\3"+
		"\20\3\20\5\20\u0226\n\20\3\20\3\20\5\20\u022a\n\20\3\20\7\20\u022d\n\20"+
		"\f\20\16\20\u0230\13\20\3\21\3\21\3\21\3\21\7\21\u0236\n\21\f\21\16\21"+
		"\u0239\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u027d"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u02b0\n\23\3\24\3\24\3\24"+
		"\3\24\5\24\u02b6\n\24\3\24\3\24\5\24\u02ba\n\24\3\24\5\24\u02bd\n\24\3"+
		"\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\5"+
		"\30\u02cd\n\30\3\30\3\30\5\30\u02d1\n\30\3\30\7\30\u02d4\n\30\f\30\16"+
		"\30\u02d7\13\30\5\30\u02d9\n\30\3\31\3\31\3\31\5\31\u02de\n\31\3\31\3"+
		"\31\3\31\3\31\5\31\u02e4\n\31\3\31\3\31\5\31\u02e8\n\31\3\31\7\31\u02eb"+
		"\n\31\f\31\16\31\u02ee\13\31\3\32\3\32\5\32\u02f2\n\32\3\32\3\32\5\32"+
		"\u02f6\n\32\3\32\5\32\u02f9\n\32\3\32\3\32\5\32\u02fd\n\32\3\32\3\32\3"+
		"\33\3\33\5\33\u0303\n\33\3\33\3\33\5\33\u0307\n\33\3\33\3\33\3\34\3\34"+
		"\3\34\5\34\u030e\n\34\3\34\3\34\3\34\3\34\5\34\u0314\n\34\3\34\3\34\5"+
		"\34\u0318\n\34\3\34\5\34\u031b\n\34\3\34\3\34\3\34\5\34\u0320\n\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u032a\n\34\3\34\5\34\u032d\n"+
		"\34\3\34\5\34\u0330\n\34\3\34\3\34\5\34\u0334\n\34\3\35\3\35\3\35\3\35"+
		"\5\35\u033a\n\35\3\35\3\35\5\35\u033e\n\35\3\35\7\35\u0341\n\35\f\35\16"+
		"\35\u0344\13\35\3\36\3\36\3\36\3\36\5\36\u034a\n\36\3\36\3\36\5\36\u034e"+
		"\n\36\3\36\3\36\5\36\u0352\n\36\3\36\3\36\5\36\u0356\n\36\3\36\5\36\u0359"+
		"\n\36\3\37\3\37\3\37\5\37\u035e\n\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\5\37\u0369\n\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\5\37\u0376\n\37\3 \3 \3!\3!\3!\5!\u037d\n!\3!\3!\3!\3!\3!\7"+
		"!\u0384\n!\f!\16!\u0387\13!\3!\3!\3\"\3\"\5\"\u038d\n\"\3\"\3\"\5\"\u0391"+
		"\n\"\3\"\5\"\u0394\n\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\5%\u03a3"+
		"\n%\3%\3%\3%\3%\5%\u03a9\n%\3%\3%\3&\3&\3\'\3\'\3\'\3\'\5\'\u03b3\n\'"+
		"\3\'\3\'\5\'\u03b7\n\'\3\'\3\'\3(\3(\3(\3(\3(\3(\5(\u03c1\n(\3(\3(\3("+
		"\3(\3(\3(\5(\u03c9\n(\3(\3(\3(\5(\u03ce\n(\3)\3)\3)\3)\5)\u03d4\n)\3)"+
		"\3)\5)\u03d8\n)\3)\5)\u03db\n)\3)\3)\5)\u03df\n)\3)\3)\3)\3)\3)\3)\3)"+
		"\3)\3)\5)\u03ea\n)\3)\3)\5)\u03ee\n)\3)\3)\3)\5)\u03f3\n)\3*\3*\3*\5*"+
		"\u03f8\n*\3*\3*\5*\u03fc\n*\3*\3*\5*\u0400\n*\3*\3*\5*\u0404\n*\3*\5*"+
		"\u0407\n*\3*\5*\u040a\n*\3*\5*\u040d\n*\3*\5*\u0410\n*\3*\3*\5*\u0414"+
		"\n*\3*\3*\3+\3+\3+\5+\u041b\n+\3+\3+\5+\u041f\n+\3+\3+\5+\u0423\n+\3+"+
		"\3+\5+\u0427\n+\3+\3+\3+\5+\u042c\n+\3+\5+\u042f\n+\3+\5+\u0432\n+\3+"+
		"\5+\u0435\n+\3+\5+\u0438\n+\3+\5+\u043b\n+\3+\3+\3+\5+\u0440\n+\3+\3+"+
		"\5+\u0444\n+\3+\3+\3,\3,\3,\3,\5,\u044c\n,\3,\3,\5,\u0450\n,\3,\5,\u0453"+
		"\n,\3,\5,\u0456\n,\3,\3,\5,\u045a\n,\3,\3,\3-\3-\3-\3-\3.\3.\3.\3.\3/"+
		"\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u0471\n/\3/\3/\7/\u0475\n/\f/\16/\u0478"+
		"\13/\3/\5/\u047b\n/\3/\3/\5/\u047f\n/\3\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\5\60\u0488\n\60\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62"+
		"\u0493\n\62\3\63\3\63\3\63\5\63\u0498\n\63\3\64\3\64\3\64\3\64\3\65\3"+
		"\65\3\65\3\65\5\65\u04a2\n\65\3\65\3\65\5\65\u04a6\n\65\3\65\6\65\u04a9"+
		"\n\65\r\65\16\65\u04aa\3\66\3\66\3\66\3\66\3\67\3\67\5\67\u04b3\n\67\3"+
		"\67\3\67\5\67\u04b7\n\67\3\67\3\67\5\67\u04bb\n\67\3\67\3\67\38\38\38"+
		"\38\58\u04c3\n8\38\38\58\u04c7\n8\38\38\39\39\39\39\3:\3:\3:\3:\5:\u04d3"+
		"\n:\3:\3:\5:\u04d7\n:\3:\3:\3:\3:\3:\5:\u04de\n:\5:\u04e0\n:\3;\3;\3;"+
		"\3;\5;\u04e6\n;\3;\3;\5;\u04ea\n;\3;\3;\3<\3<\5<\u04f0\n<\3<\3<\5<\u04f4"+
		"\n<\3<\3<\5<\u04f8\n<\3<\3<\3=\3=\7=\u04fe\n=\f=\16=\u0501\13=\3=\5=\u0504"+
		"\n=\3=\3=\3>\3>\5>\u050a\n>\3>\3>\3>\3>\3>\3>\3>\7>\u0513\n>\f>\16>\u0516"+
		"\13>\3?\3?\5?\u051a\n?\3?\3?\3?\3?\3?\3?\3?\7?\u0523\n?\f?\16?\u0526\13"+
		"?\3@\3@\3@\3@\3@\7@\u052d\n@\f@\16@\u0530\13@\3A\3A\5A\u0534\nA\3A\3A"+
		"\5A\u0538\nA\3A\3A\5A\u053c\nA\3A\3A\5A\u0540\nA\3A\3A\5A\u0544\nA\3A"+
		"\3A\5A\u0548\nA\3A\5A\u054b\nA\3A\5A\u054e\nA\3A\3A\5A\u0552\nA\3A\3A"+
		"\5A\u0556\nA\3A\3A\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3C\3C\3D\3D\3D\3D\3D"+
		"\3D\3D\3D\5D\u056e\nD\3E\3E\3E\3E\3E\3E\3E\3E\5E\u0578\nE\3E\3E\5E\u057c"+
		"\nE\3E\7E\u057f\nE\fE\16E\u0582\13E\3F\3F\3F\3F\3F\3F\3F\3F\5F\u058c\n"+
		"F\3F\3F\5F\u0590\nF\3F\7F\u0593\nF\fF\16F\u0596\13F\3G\3G\3G\3G\3G\3G"+
		"\3G\3G\3G\3G\3G\5G\u05a3\nG\3G\3G\5G\u05a7\nG\3G\3G\3G\3G\3G\3G\3G\5G"+
		"\u05b0\nG\3G\3G\5G\u05b4\nG\3G\5G\u05b7\nG\3H\3H\5H\u05bb\nH\3H\3H\5H"+
		"\u05bf\nH\3H\5H\u05c2\nH\7H\u05c4\nH\fH\16H\u05c7\13H\3H\5H\u05ca\nH\3"+
		"H\5H\u05cd\nH\3H\3H\5H\u05d1\nH\3H\5H\u05d4\nH\6H\u05d6\nH\rH\16H\u05d7"+
		"\5H\u05da\nH\3I\3I\3I\5I\u05df\nI\3I\3I\5I\u05e3\nI\3I\3I\5I\u05e7\nI"+
		"\3I\3I\5I\u05eb\nI\5I\u05ed\nI\3J\3J\3J\3J\5J\u05f3\nJ\3J\3J\5J\u05f7"+
		"\nJ\3J\5J\u05fa\nJ\3K\3K\3K\5K\u05ff\nK\3K\3K\5K\u0603\nK\3K\3K\3K\3K"+
		"\5K\u0609\nK\3K\5K\u060c\nK\3K\5K\u060f\nK\3K\3K\5K\u0613\nK\3K\3K\5K"+
		"\u0617\nK\3K\3K\3L\3L\3L\5L\u061e\nL\3L\3L\5L\u0622\nL\3L\3L\3L\3L\5L"+
		"\u0628\nL\3L\5L\u062b\nL\3L\3L\5L\u062f\nL\3L\3L\3M\3M\3M\5M\u0636\nM"+
		"\3M\3M\5M\u063a\nM\3M\3M\3M\3M\5M\u0640\nM\3M\5M\u0643\nM\3M\3M\5M\u0647"+
		"\nM\3M\3M\3N\3N\3N\3N\5N\u064f\nN\3N\3N\5N\u0653\nN\3N\5N\u0656\nN\3N"+
		"\5N\u0659\nN\3N\3N\5N\u065d\nN\3N\3N\3O\3O\3O\3O\5O\u0665\nO\3O\3O\5O"+
		"\u0669\nO\3O\3O\5O\u066d\nO\5O\u066f\nO\3O\5O\u0672\nO\3P\3P\3P\5P\u0677"+
		"\nP\3Q\3Q\3Q\3Q\5Q\u067d\nQ\3Q\3Q\5Q\u0681\nQ\3Q\3Q\5Q\u0685\nQ\3Q\7Q"+
		"\u0688\nQ\fQ\16Q\u068b\13Q\3R\3R\5R\u068f\nR\3R\3R\5R\u0693\nR\3R\3R\5"+
		"R\u0697\nR\3R\3R\3R\5R\u069c\nR\3S\3S\3T\3T\3T\3T\5T\u06a4\nT\5T\u06a6"+
		"\nT\3U\3U\3V\3V\3V\3V\3W\3W\3W\3W\5W\u06b2\nW\3W\3W\5W\u06b6\nW\3W\3W"+
		"\3X\3X\3X\3X\5X\u06be\nX\3X\3X\5X\u06c2\nX\3X\3X\3Y\3Y\3Y\3Y\5Y\u06ca"+
		"\nY\3Y\3Y\5Y\u06ce\nY\3Y\3Y\5Y\u06d2\nY\3Y\3Y\5Y\u06d6\nY\3Y\3Y\5Y\u06da"+
		"\nY\3Y\3Y\5Y\u06de\nY\3Y\3Y\3Z\3Z\3Z\3Z\5Z\u06e6\nZ\3Z\3Z\5Z\u06ea\nZ"+
		"\3Z\3Z\3[\3[\3[\3[\3[\3[\3[\7[\u06f5\n[\f[\16[\u06f8\13[\3[\3[\3\\\3\\"+
		"\5\\\u06fe\n\\\3\\\3\\\5\\\u0702\n\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3"+
		"\\\5\\\u070d\n\\\3]\3]\3]\3]\3]\5]\u0714\n]\3^\3^\3^\5^\u0719\n^\3^\3"+
		"^\5^\u071d\n^\3^\7^\u0720\n^\f^\16^\u0723\13^\5^\u0725\n^\3_\3_\3_\3_"+
		"\5_\u072b\n_\3_\3_\5_\u072f\n_\3_\5_\u0732\n_\3`\3`\3`\3`\5`\u0738\n`"+
		"\3`\3`\5`\u073c\n`\3`\3`\3a\3a\3a\3a\5a\u0744\na\3a\3a\5a\u0748\na\3a"+
		"\3a\3b\3b\3c\3c\3c\5c\u0751\nc\3c\3c\5c\u0755\nc\3c\3c\5c\u0759\nc\3c"+
		"\3c\5c\u075d\nc\3c\5c\u0760\nc\3c\3c\5c\u0764\nc\3c\3c\3d\3d\5d\u076a"+
		"\nd\3d\3d\5d\u076e\nd\3d\3d\3e\3e\3e\5e\u0775\ne\3e\3e\3e\3e\3e\7e\u077c"+
		"\ne\fe\16e\u077f\13e\3e\3e\3f\3f\5f\u0785\nf\3f\3f\5f\u0789\nf\3f\5f\u078c"+
		"\nf\3f\5f\u078f\nf\3f\5f\u0792\nf\3f\3f\3f\3f\3g\3g\3g\3g\3g\3g\3g\3g"+
		"\3h\3h\3h\3h\3i\3i\3i\3i\5i\u07a8\ni\3i\3i\5i\u07ac\ni\3i\3i\3i\3i\3i"+
		"\5i\u07b3\ni\5i\u07b5\ni\3j\3j\3j\3j\3j\7j\u07bc\nj\fj\16j\u07bf\13j\3"+
		"j\3j\5j\u07c3\nj\3j\3j\3j\5j\u07c8\nj\3j\3j\3j\5j\u07cd\nj\3j\5j\u07d0"+
		"\nj\3j\3j\5j\u07d4\nj\3j\3j\5j\u07d8\nj\3j\3j\3j\5j\u07dd\nj\3j\3j\5j"+
		"\u07e1\nj\3j\3j\3j\5j\u07e6\nj\3j\3j\5j\u07ea\nj\3j\3j\3j\5j\u07ef\nj"+
		"\3j\3j\5j\u07f3\nj\3j\3j\3j\5j\u07f8\nj\3j\3j\5j\u07fc\nj\3j\3j\3j\5j"+
		"\u0801\nj\3j\3j\5j\u0805\nj\3j\3j\3j\5j\u080a\nj\3j\3j\5j\u080e\nj\3j"+
		"\3j\3j\5j\u0813\nj\3j\3j\5j\u0817\nj\3j\3j\3j\5j\u081c\nj\3j\3j\5j\u0820"+
		"\nj\3j\3j\3j\5j\u0825\nj\3j\3j\5j\u0829\nj\3j\3j\3j\5j\u082e\nj\3j\3j"+
		"\5j\u0832\nj\3j\3j\3j\5j\u0837\nj\3j\3j\5j\u083b\nj\3j\3j\3j\5j\u0840"+
		"\nj\3j\3j\5j\u0844\nj\3j\3j\3j\5j\u0849\nj\3j\3j\5j\u084d\nj\3j\3j\3j"+
		"\5j\u0852\nj\3j\3j\5j\u0856\nj\3j\3j\3j\5j\u085b\nj\3j\3j\5j\u085f\nj"+
		"\3j\3j\3j\5j\u0864\nj\3j\3j\5j\u0868\nj\3j\3j\3j\5j\u086d\nj\3j\3j\5j"+
		"\u0871\nj\3j\3j\3j\5j\u0876\nj\3j\3j\5j\u087a\nj\3j\7j\u087d\nj\fj\16"+
		"j\u0880\13j\3k\3k\3k\3k\3k\5k\u0887\nk\3k\3k\5k\u088b\nk\3k\3k\5k\u088f"+
		"\nk\3k\7k\u0892\nk\fk\16k\u0895\13k\3k\3k\3k\3k\5k\u089b\nk\3k\3k\3k\3"+
		"k\5k\u08a1\nk\3k\3k\3k\5k\u08a6\nk\3k\3k\3k\5k\u08ab\nk\3k\3k\3k\5k\u08b0"+
		"\nk\3k\5k\u08b3\nk\3k\3k\5k\u08b7\nk\3k\3k\5k\u08bb\nk\3k\3k\3k\5k\u08c0"+
		"\nk\3k\3k\5k\u08c4\nk\3k\3k\3k\5k\u08c9\nk\3k\3k\5k\u08cd\nk\3k\3k\3k"+
		"\5k\u08d2\nk\3k\3k\5k\u08d6\nk\3k\3k\3k\5k\u08db\nk\3k\3k\5k\u08df\nk"+
		"\3k\3k\3k\5k\u08e4\nk\3k\3k\5k\u08e8\nk\3k\3k\3k\5k\u08ed\nk\3k\3k\5k"+
		"\u08f1\nk\3k\3k\3k\5k\u08f6\nk\3k\3k\5k\u08fa\nk\3k\3k\3k\5k\u08ff\nk"+
		"\3k\3k\5k\u0903\nk\3k\3k\3k\5k\u0908\nk\3k\3k\5k\u090c\nk\3k\3k\3k\5k"+
		"\u0911\nk\3k\3k\5k\u0915\nk\3k\3k\3k\5k\u091a\nk\3k\3k\5k\u091e\nk\3k"+
		"\3k\3k\5k\u0923\nk\3k\3k\5k\u0927\nk\3k\3k\3k\5k\u092c\nk\3k\3k\5k\u0930"+
		"\nk\3k\3k\3k\5k\u0935\nk\3k\3k\5k\u0939\nk\3k\3k\3k\5k\u093e\nk\3k\3k"+
		"\5k\u0942\nk\3k\3k\3k\5k\u0947\nk\3k\3k\5k\u094b\nk\3k\3k\3k\5k\u0950"+
		"\nk\3k\3k\5k\u0954\nk\3k\3k\3k\5k\u0959\nk\3k\3k\5k\u095d\nk\3k\3k\3k"+
		"\5k\u0962\nk\3k\3k\5k\u0966\nk\3k\7k\u0969\nk\fk\16k\u096c\13k\3l\3l\3"+
		"l\5l\u0971\nl\3l\3l\3l\5l\u0976\nl\3l\3l\3m\3m\5m\u097c\nm\3m\3m\5m\u0980"+
		"\nm\3m\7m\u0983\nm\fm\16m\u0986\13m\3n\3n\5n\u098a\nn\3n\3n\5n\u098e\n"+
		"n\3n\3n\5n\u0992\nn\5n\u0994\nn\3n\3n\5n\u0998\nn\5n\u099a\nn\3n\5n\u099d"+
		"\nn\3n\3n\5n\u09a1\nn\3o\3o\3o\3o\3o\5o\u09a8\no\3o\3o\3p\3p\3p\3p\5p"+
		"\u09b0\np\3p\3p\5p\u09b4\np\3p\3p\3q\3q\3q\3q\3q\3q\5q\u09be\nq\3q\3q"+
		"\5q\u09c2\nq\3q\3q\3r\3r\3r\3r\5r\u09ca\nr\3r\3r\5r\u09ce\nr\3r\5r\u09d1"+
		"\nr\3s\5s\u09d4\ns\3s\3s\3t\3t\3t\3t\3u\3u\3u\5u\u09df\nu\3v\3v\7v\u09e3"+
		"\nv\fv\16v\u09e6\13v\3w\3w\5w\u09ea\nw\3w\3w\5w\u09ee\nw\3x\3x\3x\3x\5"+
		"x\u09f4\nx\3x\5x\u09f7\nx\3x\5x\u09fa\nx\3x\5x\u09fd\nx\3y\5y\u0a00\n"+
		"y\3y\3y\5y\u0a04\ny\3y\3y\3z\5z\u0a09\nz\3z\3z\5z\u0a0d\nz\3z\3z\3{\5"+
		"{\u0a12\n{\3{\5{\u0a15\n{\3{\3{\5{\u0a19\n{\7{\u0a1b\n{\f{\16{\u0a1e\13"+
		"{\3{\3{\3|\3|\5|\u0a24\n|\3|\3|\5|\u0a28\n|\5|\u0a2a\n|\3|\3|\3}\3}\5"+
		"}\u0a30\n}\3}\3}\5}\u0a34\n}\3}\3}\5}\u0a38\n}\3}\7}\u0a3b\n}\f}\16}\u0a3e"+
		"\13}\5}\u0a40\n}\3}\5}\u0a43\n}\3}\3}\3~\3~\5~\u0a49\n~\3~\3~\5~\u0a4d"+
		"\n~\3~\3~\5~\u0a51\n~\3~\3~\5~\u0a55\n~\3~\5~\u0a58\n~\3~\3~\5~\u0a5c"+
		"\n~\3~\5~\u0a5f\n~\3~\5~\u0a62\n~\3~\5~\u0a65\n~\3~\5~\u0a68\n~\3~\5~"+
		"\u0a6b\n~\3\177\3\177\5\177\u0a6f\n\177\3\177\3\177\3\u0080\3\u0080\5"+
		"\u0080\u0a75\n\u0080\3\u0080\3\u0080\5\u0080\u0a79\n\u0080\3\u0080\7\u0080"+
		"\u0a7c\n\u0080\f\u0080\16\u0080\u0a7f\13\u0080\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\5\u0081\u0a86\n\u0081\3\u0081\3\u0081\3\u0082\3\u0082"+
		"\5\u0082\u0a8c\n\u0082\3\u0082\3\u0082\5\u0082\u0a90\n\u0082\3\u0082\7"+
		"\u0082\u0a93\n\u0082\f\u0082\16\u0082\u0a96\13\u0082\3\u0083\3\u0083\3"+
		"\u0083\3\u0083\3\u0083\5\u0083\u0a9d\n\u0083\3\u0083\3\u0083\3\u0084\3"+
		"\u0084\6\u0084\u0aa3\n\u0084\r\u0084\16\u0084\u0aa4\3\u0085\3\u0085\5"+
		"\u0085\u0aa9\n\u0085\3\u0085\3\u0085\5\u0085\u0aad\n\u0085\3\u0085\3\u0085"+
		"\5\u0085\u0ab1\n\u0085\3\u0085\5\u0085\u0ab4\n\u0085\3\u0086\3\u0086\3"+
		"\u0087\3\u0087\3\u0087\7\u0087\u0abb\n\u0087\f\u0087\16\u0087\u0abe\13"+
		"\u0087\3\u0087\3\u0087\3\u0087\6\u0087\u0ac3\n\u0087\r\u0087\16\u0087"+
		"\u0ac4\5\u0087\u0ac7\n\u0087\3\u0088\3\u0088\3\u0089\3\u0089\5\u0089\u0acd"+
		"\n\u0089\3\u0089\3\u0089\5\u0089\u0ad1\n\u0089\3\u0089\3\u0089\5\u0089"+
		"\u0ad5\n\u0089\3\u008a\3\u008a\3\u008a\7\u008a\u0ada\n\u008a\f\u008a\16"+
		"\u008a\u0add\13\u008a\3\u008b\3\u008b\5\u008b\u0ae1\n\u008b\3\u008b\3"+
		"\u008b\5\u008b\u0ae5\n\u008b\3\u008c\3\u008c\5\u008c\u0ae9\n\u008c\3\u008c"+
		"\3\u008c\5\u008c\u0aed\n\u008c\3\u008c\5\u008c\u0af0\n\u008c\3\u008d\3"+
		"\u008d\3\u008d\3\u008e\3\u008e\3\u008f\3\u008f\3\u008f\5\u008f\u0afa\n"+
		"\u008f\3\u008f\5\u008f\u0afd\n\u008f\3\u008f\3\u008f\5\u008f\u0b01\n\u008f"+
		"\3\u008f\5\u008f\u0b04\n\u008f\3\u0090\3\u0090\3\u0091\3\u0091\3\u0092"+
		"\3\u0092\3\u0093\3\u0093\3\u0094\3\u0094\3\u0095\5\u0095\u0b11\n\u0095"+
		"\3\u0095\3\u0095\3\u0095\5\u0095\u0b16\n\u0095\3\u0095\5\u0095\u0b19\n"+
		"\u0095\3\u0096\3\u0096\5\u0096\u0b1d\n\u0096\3\u0096\3\u0096\5\u0096\u0b21"+
		"\n\u0096\6\u0096\u0b23\n\u0096\r\u0096\16\u0096\u0b24\3\u0096\2\4\u00d2"+
		"\u00d4\u0097\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0"+
		"\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8"+
		"\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0"+
		"\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8"+
		"\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100"+
		"\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118"+
		"\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\2\24\5\2\27\27"+
		"$$\u00b1\u00b1\3\2\'\62\4\2\u00ba\u00ba\u00c0\u00c0\3\2IN\5\2\u00ca\u00ca"+
		"\u00d1\u00d1\u00d5\u00d5\3\2\177\u0080\7\2\21\21\27\27]]\u0088\u0088\u0093"+
		"\u0093\4\2\u0096\u0097\u00c5\u00c5\4\2jl\u00a6\u00a6\3\2\3\4\4\2\u00aa"+
		"\u00aa\u00b0\u00b0\3\2\31\32\13\2\30\30\33\33%%\66\66__cc\u00a7\u00a9"+
		"\u00ae\u00ae\u00bb\u00bd\7\2^^hh\u00ca\u00cd\u00cf\u00cf\u00d3\u00d3\6"+
		"\2OO{}\u00b5\u00b5\u00da\u00e0\4\2\6\n\u00c7\u00c7\6\2QQVV\u008c\u008c"+
		"\u0091\u0091\23\2\13\21\23\23\26\34\36\67DHOSUhmms~\u0081\u0082\u0087"+
		"\u008c\u0091\u0096\u0098\u00a7\u00aa\u00ac\u00ae\u00bb\u00be\u00c2\u00c4"+
		"\u00c6\u0d28\2\u012c\3\2\2\2\4\u0130\3\2\2\2\6\u0171\3\2\2\2\b\u0178\3"+
		"\2\2\2\n\u0196\3\2\2\2\f\u0198\3\2\2\2\16\u01ab\3\2\2\2\20\u01cd\3\2\2"+
		"\2\22\u01d1\3\2\2\2\24\u01ec\3\2\2\2\26\u01f8\3\2\2\2\30\u01fc\3\2\2\2"+
		"\32\u01fe\3\2\2\2\34\u0217\3\2\2\2\36\u0219\3\2\2\2 \u0231\3\2\2\2\"\u027c"+
		"\3\2\2\2$\u02af\3\2\2\2&\u02b1\3\2\2\2(\u02be\3\2\2\2*\u02c0\3\2\2\2,"+
		"\u02c4\3\2\2\2.\u02c8\3\2\2\2\60\u02dd\3\2\2\2\62\u02ef\3\2\2\2\64\u0300"+
		"\3\2\2\2\66\u030d\3\2\2\28\u0335\3\2\2\2:\u0345\3\2\2\2<\u0375\3\2\2\2"+
		">\u0377\3\2\2\2@\u037c\3\2\2\2B\u038a\3\2\2\2D\u0397\3\2\2\2F\u039b\3"+
		"\2\2\2H\u03a2\3\2\2\2J\u03ac\3\2\2\2L\u03ae\3\2\2\2N\u03ba\3\2\2\2P\u03cf"+
		"\3\2\2\2R\u03f7\3\2\2\2T\u041a\3\2\2\2V\u0447\3\2\2\2X\u045d\3\2\2\2Z"+
		"\u0461\3\2\2\2\\\u047e\3\2\2\2^\u0480\3\2\2\2`\u0489\3\2\2\2b\u048b\3"+
		"\2\2\2d\u0494\3\2\2\2f\u0499\3\2\2\2h\u049d\3\2\2\2j\u04ac\3\2\2\2l\u04b2"+
		"\3\2\2\2n\u04be\3\2\2\2p\u04ca\3\2\2\2r\u04ce\3\2\2\2t\u04e1\3\2\2\2v"+
		"\u04ed\3\2\2\2x\u04fb\3\2\2\2z\u0507\3\2\2\2|\u0517\3\2\2\2~\u0527\3\2"+
		"\2\2\u0080\u0531\3\2\2\2\u0082\u0559\3\2\2\2\u0084\u055d\3\2\2\2\u0086"+
		"\u0565\3\2\2\2\u0088\u056f\3\2\2\2\u008a\u0583\3\2\2\2\u008c\u0597\3\2"+
		"\2\2\u008e\u05d9\3\2\2\2\u0090\u05ec\3\2\2\2\u0092\u05ee\3\2\2\2\u0094"+
		"\u05fe\3\2\2\2\u0096\u061d\3\2\2\2\u0098\u0635\3\2\2\2\u009a\u064a\3\2"+
		"\2\2\u009c\u0660\3\2\2\2\u009e\u0673\3\2\2\2\u00a0\u0678\3\2\2\2\u00a2"+
		"\u068c\3\2\2\2\u00a4\u069d\3\2\2\2\u00a6\u069f\3\2\2\2\u00a8\u06a7\3\2"+
		"\2\2\u00aa\u06a9\3\2\2\2\u00ac\u06ad\3\2\2\2\u00ae\u06b9\3\2\2\2\u00b0"+
		"\u06c5\3\2\2\2\u00b2\u06e1\3\2\2\2\u00b4\u06ed\3\2\2\2\u00b6\u070c\3\2"+
		"\2\2\u00b8\u070e\3\2\2\2\u00ba\u0724\3\2\2\2\u00bc\u0726\3\2\2\2\u00be"+
		"\u0733\3\2\2\2\u00c0\u073f\3\2\2\2\u00c2\u074b\3\2\2\2\u00c4\u0750\3\2"+
		"\2\2\u00c6\u0767\3\2\2\2\u00c8\u0774\3\2\2\2\u00ca\u0782\3\2\2\2\u00cc"+
		"\u0797\3\2\2\2\u00ce\u079f\3\2\2\2\u00d0\u07a3\3\2\2\2\u00d2\u07cf\3\2"+
		"\2\2\u00d4\u08b2\3\2\2\2\u00d6\u0970\3\2\2\2\u00d8\u0979\3\2\2\2\u00da"+
		"\u0987\3\2\2\2\u00dc\u09a2\3\2\2\2\u00de\u09ab\3\2\2\2\u00e0\u09b7\3\2"+
		"\2\2\u00e2\u09c5\3\2\2\2\u00e4\u09d3\3\2\2\2\u00e6\u09d7\3\2\2\2\u00e8"+
		"\u09db\3\2\2\2\u00ea\u09e0\3\2\2\2\u00ec\u09ed\3\2\2\2\u00ee\u09fc\3\2"+
		"\2\2\u00f0\u09ff\3\2\2\2\u00f2\u0a08\3\2\2\2\u00f4\u0a1c\3\2\2\2\u00f6"+
		"\u0a29\3\2\2\2\u00f8\u0a2d\3\2\2\2\u00fa\u0a48\3\2\2\2\u00fc\u0a6c\3\2"+
		"\2\2\u00fe\u0a72\3\2\2\2\u0100\u0a85\3\2\2\2\u0102\u0a89\3\2\2\2\u0104"+
		"\u0a9c\3\2\2\2\u0106\u0aa2\3\2\2\2\u0108\u0aa6\3\2\2\2\u010a\u0ab5\3\2"+
		"\2\2\u010c\u0ac6\3\2\2\2\u010e\u0ac8\3\2\2\2\u0110\u0aca\3\2\2\2\u0112"+
		"\u0ad6\3\2\2\2\u0114\u0ade\3\2\2\2\u0116\u0ae6\3\2\2\2\u0118\u0af1\3\2"+
		"\2\2\u011a\u0af4\3\2\2\2\u011c\u0af9\3\2\2\2\u011e\u0b05\3\2\2\2\u0120"+
		"\u0b07\3\2\2\2\u0122\u0b09\3\2\2\2\u0124\u0b0b\3\2\2\2\u0126\u0b0d\3\2"+
		"\2\2\u0128\u0b10\3\2\2\2\u012a\u0b22\3\2\2\2\u012c\u012d\5\4\3\2\u012d"+
		"\u012e\7\2\2\3\u012e\3\3\2\2\2\u012f\u0131\7\u00e8\2\2\u0130\u012f\3\2"+
		"\2\2\u0130\u0131\3\2\2\2\u0131\u0135\3\2\2\2\u0132\u0134\5\u0128\u0095"+
		"\2\u0133\u0132\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136"+
		"\3\2\2\2\u0136\u013f\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u013c\5\6\4\2\u0139"+
		"\u013b\5\u0128\u0095\2\u013a\u0139\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a"+
		"\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013f"+
		"\u0138\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0148\3\2\2\2\u0141\u0145\5\16"+
		"\b\2\u0142\u0144\5\u0128\u0095\2\u0143\u0142\3\2\2\2\u0144\u0147\3\2\2"+
		"\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145"+
		"\3\2\2\2\u0148\u0141\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014b\3\2\2\2\u014a"+
		"\u014c\5\b\5\2\u014b\u014a\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u0150\3\2"+
		"\2\2\u014d\u014f\5\u0128\u0095\2\u014e\u014d\3\2\2\2\u014f\u0152\3\2\2"+
		"\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0150"+
		"\3\2\2\2\u0153\u0155\5\20\t\2\u0154\u0153\3\2\2\2\u0154\u0155\3\2\2\2"+
		"\u0155\u0159\3\2\2\2\u0156\u0158\5\u0128\u0095\2\u0157\u0156\3\2\2\2\u0158"+
		"\u015b\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015d\3\2"+
		"\2\2\u015b\u0159\3\2\2\2\u015c\u015e\5\22\n\2\u015d\u015c\3\2\2\2\u015d"+
		"\u015e\3\2\2\2\u015e\u0162\3\2\2\2\u015f\u0161\5\u0128\u0095\2\u0160\u015f"+
		"\3\2\2\2\u0161\u0164\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163"+
		"\u0166\3\2\2\2\u0164\u0162\3\2\2\2\u0165\u0167\5\32\16\2\u0166\u0165\3"+
		"\2\2\2\u0166\u0167\3\2\2\2\u0167\u016b\3\2\2\2\u0168\u016a\5\u0128\u0095"+
		"\2\u0169\u0168\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c"+
		"\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016e\u0170\7\u00e8\2"+
		"\2\u016f\u016e\3\2\2\2\u016f\u0170\3\2\2\2\u0170\5\3\2\2\2\u0171\u0172"+
		"\7\u00be\2\2\u0172\u0173\7\u00e8\2\2\u0173\u0176\7\u00df\2\2\u0174\u0175"+
		"\7\u00e8\2\2\u0175\u0177\7 \2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2"+
		"\2\u0177\7\3\2\2\2\u0178\u017c\7\23\2\2\u0179\u017b\5\u0128\u0095\2\u017a"+
		"\u0179\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2"+
		"\2\2\u017d\u0180\3\2\2\2\u017e\u017c\3\2\2\2\u017f\u0181\5\n\6\2\u0180"+
		"\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0183\3\2"+
		"\2\2\u0183\u0184\3\2\2\2\u0184\u0185\7C\2\2\u0185\t\3\2\2\2\u0186\u0197"+
		"\5\f\7\2\u0187\u0189\5\u0106\u0084\2\u0188\u018a\7\u00e8\2\2\u0189\u0188"+
		"\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018d\7\u00ca\2"+
		"\2\u018c\u018e\7\u00e8\2\2\u018d\u018c\3\2\2\2\u018d\u018e\3\2\2\2\u018e"+
		"\u018f\3\2\2\2\u018f\u0193\5\u011a\u008e\2\u0190\u0192\5\u0128\u0095\2"+
		"\u0191\u0190\3\2\2\2\u0192\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194"+
		"\3\2\2\2\u0194\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0196\u0186\3\2\2\2\u0196"+
		"\u0187\3\2\2\2\u0197\13\3\2\2\2\u0198\u0199\7\24\2\2\u0199\u019a\7\u00e8"+
		"\2\2\u019a\u019c\5\u0106\u0084\2\u019b\u019d\5\u0128\u0095\2\u019c\u019b"+
		"\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f"+
		"\u01a1\3\2\2\2\u01a0\u01a2\5\n\6\2\u01a1\u01a0\3\2\2\2\u01a2\u01a3\3\2"+
		"\2\2\u01a3\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5"+
		"\u01a7\7\25\2\2\u01a6\u01a8\5\u0128\u0095\2\u01a7\u01a6\3\2\2\2\u01a8"+
		"\u01a9\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\r\3\2\2\2"+
		"\u01ab\u01ac\7\23\2\2\u01ac\u01ad\7\u00e8\2\2\u01ad\u01ae\5\u011c\u008f"+
		"\2\u01ae\u01af\7\u00e8\2\2\u01af\u01b3\5\u0106\u0084\2\u01b0\u01b2\5\u0128"+
		"\u0095\2\u01b1\u01b0\3\2\2\2\u01b2\u01b5\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3"+
		"\u01b4\3\2\2\2\u01b4\u01b7\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b6\u01b8\5\n"+
		"\6\2\u01b7\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9"+
		"\u01ba\3\2\2\2\u01ba\u01be\3\2\2\2\u01bb\u01bd\5\16\b\2\u01bc\u01bb\3"+
		"\2\2\2\u01bd\u01c0\3\2\2\2\u01be\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf"+
		"\u01c1\3\2\2\2\u01c0\u01be\3\2\2\2\u01c1\u01c3\7C\2\2\u01c2\u01c4\5\u0128"+
		"\u0095\2\u01c3\u01c2\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5"+
		"\u01c6\3\2\2\2\u01c6\17\3\2\2\2\u01c7\u01c9\5\36\20\2\u01c8\u01ca\5\u0128"+
		"\u0095\2\u01c9\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cb"+
		"\u01cc\3\2\2\2\u01cc\u01ce\3\2\2\2\u01cd\u01c7\3\2\2\2\u01ce\u01cf\3\2"+
		"\2\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\21\3\2\2\2\u01d1\u01db"+
		"\5\26\f\2\u01d2\u01d4\5\u0128\u0095\2\u01d3\u01d2\3\2\2\2\u01d4\u01d5"+
		"\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7"+
		"\u01d8\5\26\f\2\u01d8\u01da\3\2\2\2\u01d9\u01d3\3\2\2\2\u01da\u01dd\3"+
		"\2\2\2\u01db\u01d9\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01e1\3\2\2\2\u01dd"+
		"\u01db\3\2\2\2\u01de\u01e0\5\u0128\u0095\2\u01df\u01de\3\2\2\2\u01e0\u01e3"+
		"\3\2\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\23\3\2\2\2\u01e3"+
		"\u01e1\3\2\2\2\u01e4\u01e5\7\u0083\2\2\u01e5\u01e6\7\u00e8\2\2\u01e6\u01ed"+
		"\7\u00dd\2\2\u01e7\u01e8\7\u0085\2\2\u01e8\u01e9\7\u00e8\2\2\u01e9\u01ed"+
		"\t\2\2\2\u01ea\u01ed\7\u0084\2\2\u01eb\u01ed\7\u0086\2\2\u01ec\u01e4\3"+
		"\2\2\2\u01ec\u01e7\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01eb\3\2\2\2\u01ed"+
		"\25\3\2\2\2\u01ee\u01f9\5\u0126\u0094\2\u01ef\u01f9\5\66\34\2\u01f0\u01f9"+
		"\5@!\2\u01f1\u01f9\5H%\2\u01f2\u01f9\5\60\31\2\u01f3\u01f9\5f\64\2\u01f4"+
		"\u01f9\5\u00d6l\2\u01f5\u01f9\5\24\13\2\u01f6\u01f9\5\u00c8e\2\u01f7\u01f9"+
		"\5\36\20\2\u01f8\u01ee\3\2\2\2\u01f8\u01ef\3\2\2\2\u01f8\u01f0\3\2\2\2"+
		"\u01f8\u01f1\3\2\2\2\u01f8\u01f2\3\2\2\2\u01f8\u01f3\3\2\2\2\u01f8\u01f4"+
		"\3\2\2\2\u01f8\u01f5\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f8\u01f7\3\2\2\2\u01f9"+
		"\27\3\2\2\2\u01fa\u01fd\5v<\2\u01fb\u01fd\5x=\2\u01fc\u01fa\3\2\2\2\u01fc"+
		"\u01fb\3\2\2\2\u01fd\31\3\2\2\2\u01fe\u0208\5\34\17\2\u01ff\u0201\5\u0128"+
		"\u0095\2\u0200\u01ff\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0200\3\2\2\2\u0202"+
		"\u0203\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0205\5\34\17\2\u0205\u0207\3"+
		"\2\2\2\u0206\u0200\3\2\2\2\u0207\u020a\3\2\2\2\u0208\u0206\3\2\2\2\u0208"+
		"\u0209\3\2\2\2\u0209\u020e\3\2\2\2\u020a\u0208\3\2\2\2\u020b\u020d\5\u0128"+
		"\u0095\2\u020c\u020b\3\2\2\2\u020d\u0210\3\2\2\2\u020e\u020c\3\2\2\2\u020e"+
		"\u020f\3\2\2\2\u020f\33\3\2\2\2\u0210\u020e\3\2\2\2\u0211\u0218\5R*\2"+
		"\u0212\u0218\5\u0094K\2\u0213\u0218\5\u0096L\2\u0214\u0218\5\u0098M\2"+
		"\u0215\u0218\5\u00c4c\2\u0216\u0218\5T+\2\u0217\u0211\3\2\2\2\u0217\u0212"+
		"\3\2\2\2\u0217\u0213\3\2\2\2\u0217\u0214\3\2\2\2\u0217\u0215\3\2\2\2\u0217"+
		"\u0216\3\2\2\2\u0218\35\3\2\2\2\u0219\u021a\7\17\2\2\u021a\u021b\7\u00e8"+
		"\2\2\u021b\u021d\5\u00eav\2\u021c\u021e\7\u00e8\2\2\u021d\u021c\3\2\2"+
		"\2\u021d\u021e\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0221\7\u00ca\2\2\u0220"+
		"\u0222\7\u00e8\2\2\u0221\u0220\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u0223"+
		"\3\2\2\2\u0223\u022e\5\u011a\u008e\2\u0224\u0226\7\u00e8\2\2\u0225\u0224"+
		"\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0229\7\3\2\2\u0228"+
		"\u022a\7\u00e8\2\2\u0229\u0228\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022b"+
		"\3\2\2\2\u022b\u022d\5\u011a\u008e\2\u022c\u0225\3\2\2\2\u022d\u0230\3"+
		"\2\2\2\u022e\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022f\37\3\2\2\2\u0230"+
		"\u022e\3\2\2\2\u0231\u0237\5\"\22\2\u0232\u0233\5\u012a\u0096\2\u0233"+
		"\u0234\5\"\22\2\u0234\u0236\3\2\2\2\u0235\u0232\3\2\2\2\u0236\u0239\3"+
		"\2\2\2\u0237\u0235\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u023a\3\2\2\2\u0239"+
		"\u0237\3\2\2\2\u023a\u023b\5\u012a\u0096\2\u023b!\3\2\2\2\u023c\u027d"+
		"\5\u0118\u008d\2\u023d\u027d\5\u0080A\2\u023e\u027d\5&\24\2\u023f\u027d"+
		"\5\36\20\2\u0240\u027d\5(\25\2\u0241\u027d\5*\26\2\u0242\u027d\5,\27\2"+
		"\u0243\u027d\5.\30\2\u0244\u027d\5\60\31\2\u0245\u027d\5\64\33\2\u0246"+
		"\u027d\5:\36\2\u0247\u027d\58\35\2\u0248\u027d\5<\37\2\u0249\u027d\5>"+
		" \2\u024a\u027d\5D#\2\u024b\u027d\5F$\2\u024c\u027d\5J&\2\u024d\u027d"+
		"\5\u00e6t\2\u024e\u027d\5L\'\2\u024f\u027d\5N(\2\u0250\u027d\5P)\2\u0251"+
		"\u027d\5V,\2\u0252\u027d\5X-\2\u0253\u027d\5Z.\2\u0254\u027d\5\\/\2\u0255"+
		"\u027d\5h\65\2\u0256\u027d\5j\66\2\u0257\u027d\5l\67\2\u0258\u027d\5n"+
		"8\2\u0259\u027d\5p9\2\u025a\u027d\5r:\2\u025b\u027d\5t;\2\u025c\u027d"+
		"\5\u0082B\2\u025d\u027d\5\u0084C\2\u025e\u027d\5\u0086D\2\u025f\u027d"+
		"\5\u0088E\2\u0260\u027d\5\u008aF\2\u0261\u027d\5\u008cG\2\u0262\u027d"+
		"\5\u0092J\2\u0263\u027d\5\u009aN\2\u0264\u027d\5\u009cO\2\u0265\u027d"+
		"\5\u00a0Q\2\u0266\u027d\5\u00a4S\2\u0267\u027d\5\u00a6T\2\u0268\u027d"+
		"\5\u00a8U\2\u0269\u027d\5\u00aaV\2\u026a\u027d\5\u00acW\2\u026b\u027d"+
		"\5\u00aeX\2\u026c\u027d\5\u00b0Y\2\u026d\u027d\5\u00b2Z\2\u026e\u027d"+
		"\5\u00b4[\2\u026f\u027d\5\u00bc_\2\u0270\u027d\5\u00be`\2\u0271\u027d"+
		"\5\u00c0a\2\u0272\u027d\5\u00c2b\2\u0273\u027d\5\u00c6d\2\u0274\u027d"+
		"\5\u00ceh\2\u0275\u027d\5\u00d0i\2\u0276\u027d\5\u00d6l\2\u0277\u027d"+
		"\5\u00dco\2\u0278\u027d\5\u00dep\2\u0279\u027d\5\u00e0q\2\u027a\u027d"+
		"\5\u00e2r\2\u027b\u027d\5\u00e8u\2\u027c\u023c\3\2\2\2\u027c\u023d\3\2"+
		"\2\2\u027c\u023e\3\2\2\2\u027c\u023f\3\2\2\2\u027c\u0240\3\2\2\2\u027c"+
		"\u0241\3\2\2\2\u027c\u0242\3\2\2\2\u027c\u0243\3\2\2\2\u027c\u0244\3\2"+
		"\2\2\u027c\u0245\3\2\2\2\u027c\u0246\3\2\2\2\u027c\u0247\3\2\2\2\u027c"+
		"\u0248\3\2\2\2\u027c\u0249\3\2\2\2\u027c\u024a\3\2\2\2\u027c\u024b\3\2"+
		"\2\2\u027c\u024c\3\2\2\2\u027c\u024d\3\2\2\2\u027c\u024e\3\2\2\2\u027c"+
		"\u024f\3\2\2\2\u027c\u0250\3\2\2\2\u027c\u0251\3\2\2\2\u027c\u0252\3\2"+
		"\2\2\u027c\u0253\3\2\2\2\u027c\u0254\3\2\2\2\u027c\u0255\3\2\2\2\u027c"+
		"\u0256\3\2\2\2\u027c\u0257\3\2\2\2\u027c\u0258\3\2\2\2\u027c\u0259\3\2"+
		"\2\2\u027c\u025a\3\2\2\2\u027c\u025b\3\2\2\2\u027c\u025c\3\2\2\2\u027c"+
		"\u025d\3\2\2\2\u027c\u025e\3\2\2\2\u027c\u025f\3\2\2\2\u027c\u0260\3\2"+
		"\2\2\u027c\u0261\3\2\2\2\u027c\u0262\3\2\2\2\u027c\u0263\3\2\2\2\u027c"+
		"\u0264\3\2\2\2\u027c\u0265\3\2\2\2\u027c\u0266\3\2\2\2\u027c\u0267\3\2"+
		"\2\2\u027c\u0268\3\2\2\2\u027c\u0269\3\2\2\2\u027c\u026a\3\2\2\2\u027c"+
		"\u026b\3\2\2\2\u027c\u026c\3\2\2\2\u027c\u026d\3\2\2\2\u027c\u026e\3\2"+
		"\2\2\u027c\u026f\3\2\2\2\u027c\u0270\3\2\2\2\u027c\u0271\3\2\2\2\u027c"+
		"\u0272\3\2\2\2\u027c\u0273\3\2\2\2\u027c\u0274\3\2\2\2\u027c\u0275\3\2"+
		"\2\2\u027c\u0276\3\2\2\2\u027c\u0277\3\2\2\2\u027c\u0278\3\2\2\2\u027c"+
		"\u0279\3\2\2\2\u027c\u027a\3\2\2\2\u027c\u027b\3\2\2\2\u027d#\3\2\2\2"+
		"\u027e\u02b0\3\2\2\2\u027f\u02b0\5&\24\2\u0280\u02b0\5(\25\2\u0281\u02b0"+
		"\5*\26\2\u0282\u02b0\5,\27\2\u0283\u02b0\5.\30\2\u0284\u02b0\5\64\33\2"+
		"\u0285\u02b0\5:\36\2\u0286\u02b0\5<\37\2\u0287\u02b0\5> \2\u0288\u02b0"+
		"\5D#\2\u0289\u02b0\5\u00e6t\2\u028a\u02b0\5L\'\2\u028b\u02b0\5N(\2\u028c"+
		"\u02b0\5P)\2\u028d\u02b0\5V,\2\u028e\u02b0\5\\/\2\u028f\u02b0\5h\65\2"+
		"\u0290\u02b0\5j\66\2\u0291\u02b0\5l\67\2\u0292\u02b0\5n8\2\u0293\u02b0"+
		"\5p9\2\u0294\u02b0\5r:\2\u0295\u02b0\5t;\2\u0296\u02b0\5\u0080A\2\u0297"+
		"\u02b0\5\u0082B\2\u0298\u02b0\5\u0084C\2\u0299\u02b0\5\u008cG\2\u029a"+
		"\u02b0\5\u0092J\2\u029b\u02b0\5\u009aN\2\u029c\u02b0\5\u009cO\2\u029d"+
		"\u02b0\5\u00a0Q\2\u029e\u02b0\5\u00a4S\2\u029f\u02b0\5\u00aaV\2\u02a0"+
		"\u02b0\5\u00acW\2\u02a1\u02b0\5\u00aeX\2\u02a2\u02b0\5\u00b0Y\2\u02a3"+
		"\u02b0\5\u00b2Z\2\u02a4\u02b0\5\u00b4[\2\u02a5\u02b0\5\u00bc_\2\u02a6"+
		"\u02b0\5\u00be`\2\u02a7\u02b0\5\u00c0a\2\u02a8\u02b0\5\u00c6d\2\u02a9"+
		"\u02b0\5\u00ceh\2\u02aa\u02b0\5\u00d0i\2\u02ab\u02b0\5\u00dco\2\u02ac"+
		"\u02b0\5\u00dep\2\u02ad\u02b0\5\u00d4k\2\u02ae\u02b0\5\u00e8u\2\u02af"+
		"\u027e\3\2\2\2\u02af\u027f\3\2\2\2\u02af\u0280\3\2\2\2\u02af\u0281\3\2"+
		"\2\2\u02af\u0282\3\2\2\2\u02af\u0283\3\2\2\2\u02af\u0284\3\2\2\2\u02af"+
		"\u0285\3\2\2\2\u02af\u0286\3\2\2\2\u02af\u0287\3\2\2\2\u02af\u0288\3\2"+
		"\2\2\u02af\u0289\3\2\2\2\u02af\u028a\3\2\2\2\u02af\u028b\3\2\2\2\u02af"+
		"\u028c\3\2\2\2\u02af\u028d\3\2\2\2\u02af\u028e\3\2\2\2\u02af\u028f\3\2"+
		"\2\2\u02af\u0290\3\2\2\2\u02af\u0291\3\2\2\2\u02af\u0292\3\2\2\2\u02af"+
		"\u0293\3\2\2\2\u02af\u0294\3\2\2\2\u02af\u0295\3\2\2\2\u02af\u0296\3\2"+
		"\2\2\u02af\u0297\3\2\2\2\u02af\u0298\3\2\2\2\u02af\u0299\3\2\2\2\u02af"+
		"\u029a\3\2\2\2\u02af\u029b\3\2\2\2\u02af\u029c\3\2\2\2\u02af\u029d\3\2"+
		"\2\2\u02af\u029e\3\2\2\2\u02af\u029f\3\2\2\2\u02af\u02a0\3\2\2\2\u02af"+
		"\u02a1\3\2\2\2\u02af\u02a2\3\2\2\2\u02af\u02a3\3\2\2\2\u02af\u02a4\3\2"+
		"\2\2\u02af\u02a5\3\2\2\2\u02af\u02a6\3\2\2\2\u02af\u02a7\3\2\2\2\u02af"+
		"\u02a8\3\2\2\2\u02af\u02a9\3\2\2\2\u02af\u02aa\3\2\2\2\u02af\u02ab\3\2"+
		"\2\2\u02af\u02ac\3\2\2\2\u02af\u02ad\3\2\2\2\u02af\u02ae\3\2\2\2\u02b0"+
		"%\3\2\2\2\u02b1\u02b2\7\20\2\2\u02b2\u02b3\7\u00e8\2\2\u02b3\u02bc\5\u00d4"+
		"k\2\u02b4\u02b6\7\u00e8\2\2\u02b5\u02b4\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6"+
		"\u02b7\3\2\2\2\u02b7\u02b9\7\3\2\2\u02b8\u02ba\7\u00e8\2\2\u02b9\u02b8"+
		"\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb\u02bd\5\u00d4k"+
		"\2\u02bc\u02b5\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd\'\3\2\2\2\u02be\u02bf"+
		"\7\26\2\2\u02bf)\3\2\2\2\u02c0\u02c1\7\36\2\2\u02c1\u02c2\7\u00e8\2\2"+
		"\u02c2\u02c3\5\u00d4k\2\u02c3+\3\2\2\2\u02c4\u02c5\7\37\2\2\u02c5\u02c6"+
		"\7\u00e8\2\2\u02c6\u02c7\5\u00d4k\2\u02c7-\3\2\2\2\u02c8\u02d8\7!\2\2"+
		"\u02c9\u02ca\7\u00e8\2\2\u02ca\u02d5\5\u00e4s\2\u02cb\u02cd\7\u00e8\2"+
		"\2\u02cc\u02cb\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce\u02d0"+
		"\7\3\2\2\u02cf\u02d1\7\u00e8\2\2\u02d0\u02cf\3\2\2\2\u02d0\u02d1\3\2\2"+
		"\2\u02d1\u02d2\3\2\2\2\u02d2\u02d4\5\u00e4s\2\u02d3\u02cc\3\2\2\2\u02d4"+
		"\u02d7\3\2\2\2\u02d5\u02d3\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02d9\3\2"+
		"\2\2\u02d7\u02d5\3\2\2\2\u02d8\u02c9\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9"+
		"/\3\2\2\2\u02da\u02db\5\u0120\u0091\2\u02db\u02dc\7\u00e8\2\2\u02dc\u02de"+
		"\3\2\2\2\u02dd\u02da\3\2\2\2\u02dd\u02de\3\2\2\2\u02de\u02df\3\2\2\2\u02df"+
		"\u02e0\7#\2\2\u02e0\u02e1\7\u00e8\2\2\u02e1\u02ec\5\62\32\2\u02e2\u02e4"+
		"\7\u00e8\2\2\u02e3\u02e2\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02e5\3\2\2"+
		"\2\u02e5\u02e7\7\3\2\2\u02e6\u02e8\7\u00e8\2\2\u02e7\u02e6\3\2\2\2\u02e7"+
		"\u02e8\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9\u02eb\5\62\32\2\u02ea\u02e3\3"+
		"\2\2\2\u02eb\u02ee\3\2\2\2\u02ec\u02ea\3\2\2\2\u02ec\u02ed\3\2\2\2\u02ed"+
		"\61\3\2\2\2\u02ee\u02ec\3\2\2\2\u02ef\u02f1\5\u0106\u0084\2\u02f0\u02f2"+
		"\5\u011e\u0090\2\u02f1\u02f0\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2\u02f5\3"+
		"\2\2\2\u02f3\u02f4\7\u00e8\2\2\u02f4\u02f6\5\u0108\u0085\2\u02f5\u02f3"+
		"\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6\u02f8\3\2\2\2\u02f7\u02f9\7\u00e8\2"+
		"\2\u02f8\u02f7\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa\u02fc"+
		"\7\u00ca\2\2\u02fb\u02fd\7\u00e8\2\2\u02fc\u02fb\3\2\2\2\u02fc\u02fd\3"+
		"\2\2\2\u02fd\u02fe\3\2\2\2\u02fe\u02ff\5\u00d2j\2\u02ff\63\3\2\2\2\u0300"+
		"\u0302\7%\2\2\u0301\u0303\7\u00e8\2\2\u0302\u0301\3\2\2\2\u0302\u0303"+
		"\3\2\2\2\u0303\u0304\3\2\2\2\u0304\u0306\7\u00ca\2\2\u0305\u0307\7\u00e8"+
		"\2\2\u0306\u0305\3\2\2\2\u0306\u0307\3\2\2\2\u0307\u0308\3\2\2\2\u0308"+
		"\u0309\5\u00d4k\2\u0309\65\3\2\2\2\u030a\u030b\5\u0120\u0091\2\u030b\u030c"+
		"\7\u00e8\2\2\u030c\u030e\3\2\2\2\u030d\u030a\3\2\2\2\u030d\u030e\3\2\2"+
		"\2\u030e\u030f\3\2\2\2\u030f\u0310\7&\2\2\u0310\u0313\7\u00e8\2\2\u0311"+
		"\u0312\7\u0090\2\2\u0312\u0314\7\u00e8\2\2\u0313\u0311\3\2\2\2\u0313\u0314"+
		"\3\2\2\2\u0314\u031a\3\2\2\2\u0315\u0317\7S\2\2\u0316\u0318\5\u011e\u0090"+
		"\2\u0317\u0316\3\2\2\2\u0317\u0318\3\2\2\2\u0318\u031b\3\2\2\2\u0319\u031b"+
		"\7\u00af\2\2\u031a\u0315\3\2\2\2\u031a\u0319\3\2\2\2\u031b\u031c\3\2\2"+
		"\2\u031c\u031d\7\u00e8\2\2\u031d\u031f\5\u0106\u0084\2\u031e\u0320\5\u011e"+
		"\u0090\2\u031f\u031e\3\2\2\2\u031f\u0320\3\2\2\2\u0320\u0321\3\2\2\2\u0321"+
		"\u0322\7\u00e8\2\2\u0322\u0323\7g\2\2\u0323\u0324\7\u00e8\2\2\u0324\u0329"+
		"\7\u00da\2\2\u0325\u0326\7\u00e8\2\2\u0326\u0327\7\r\2\2\u0327\u0328\7"+
		"\u00e8\2\2\u0328\u032a\7\u00da\2\2\u0329\u0325\3\2\2\2\u0329\u032a\3\2"+
		"\2\2\u032a\u032f\3\2\2\2\u032b\u032d\7\u00e8\2\2\u032c\u032b\3\2\2\2\u032c"+
		"\u032d\3\2\2\2\u032d\u032e\3\2\2\2\u032e\u0330\5\u00f8}\2\u032f\u032c"+
		"\3\2\2\2\u032f\u0330\3\2\2\2\u0330\u0333\3\2\2\2\u0331\u0332\7\u00e8\2"+
		"\2\u0332\u0334\5\u0108\u0085\2\u0333\u0331\3\2\2\2\u0333\u0334\3\2\2\2"+
		"\u0334\67\3\2\2\2\u0335\u0336\t\3\2\2\u0336\u0337\7\u00e8\2\2\u0337\u0342"+
		"\5\u0116\u008c\2\u0338\u033a\7\u00e8\2\2\u0339\u0338\3\2\2\2\u0339\u033a"+
		"\3\2\2\2\u033a\u033b\3\2\2\2\u033b\u033d\7\3\2\2\u033c\u033e\7\u00e8\2"+
		"\2\u033d\u033c\3\2\2\2\u033d\u033e\3\2\2\2\u033e\u033f\3\2\2\2\u033f\u0341"+
		"\5\u0116\u008c\2\u0340\u0339\3\2\2\2\u0341\u0344\3\2\2\2\u0342\u0340\3"+
		"\2\2\2\u0342\u0343\3\2\2\2\u03439\3\2\2\2\u0344\u0342\3\2\2\2\u0345\u0346"+
		"\7\63\2\2\u0346\u0347\7\u00e8\2\2\u0347\u0349\5\u00d4k\2\u0348\u034a\7"+
		"\u00e8\2\2\u0349\u0348\3\2\2\2\u0349\u034a\3\2\2\2\u034a\u034b\3\2\2\2"+
		"\u034b\u034d\7\3\2\2\u034c\u034e\7\u00e8\2\2\u034d\u034c\3\2\2\2\u034d"+
		"\u034e\3\2\2\2\u034e\u034f\3\2\2\2\u034f\u0358\5\u00d4k\2\u0350\u0352"+
		"\7\u00e8\2\2\u0351\u0350\3\2\2\2\u0351\u0352\3\2\2\2\u0352\u0353\3\2\2"+
		"\2\u0353\u0355\7\3\2\2\u0354\u0356\7\u00e8\2\2\u0355\u0354\3\2\2\2\u0355"+
		"\u0356\3\2\2\2\u0356\u0357\3\2\2\2\u0357\u0359\5\u00d4k\2\u0358\u0351"+
		"\3\2\2\2\u0358\u0359\3\2\2\2\u0359;\3\2\2\2\u035a\u035b\7\65\2\2\u035b"+
		"\u035d\5\u012a\u0096\2\u035c\u035e\5 \21\2\u035d\u035c\3\2\2\2\u035d\u035e"+
		"\3\2\2\2\u035e\u035f\3\2\2\2\u035f\u0360\7d\2\2\u0360\u0376\3\2\2\2\u0361"+
		"\u0362\7\65\2\2\u0362\u0363\7\u00e8\2\2\u0363\u0364\t\4\2\2\u0364\u0365"+
		"\7\u00e8\2\2\u0365\u0366\5\u00d4k\2\u0366\u0368\5\u012a\u0096\2\u0367"+
		"\u0369\5 \21\2\u0368\u0367\3\2\2\2\u0368\u0369\3\2\2\2\u0369\u036a\3\2"+
		"\2\2\u036a\u036b\7d\2\2\u036b\u0376\3\2\2\2\u036c\u036d\7\65\2\2\u036d"+
		"\u036e\5\u012a\u0096\2\u036e\u036f\5 \21\2\u036f\u0370\7d\2\2\u0370\u0371"+
		"\7\u00e8\2\2\u0371\u0372\t\4\2\2\u0372\u0373\7\u00e8\2\2\u0373\u0374\5"+
		"\u00d4k\2\u0374\u0376\3\2\2\2\u0375\u035a\3\2\2\2\u0375\u0361\3\2\2\2"+
		"\u0375\u036c\3\2\2\2\u0376=\3\2\2\2\u0377\u0378\7C\2\2\u0378?\3\2\2\2"+
		"\u0379\u037a\5\u0120\u0091\2\u037a\u037b\7\u00e8\2\2\u037b\u037d\3\2\2"+
		"\2\u037c\u0379\3\2\2\2\u037c\u037d\3\2\2\2\u037d\u037e\3\2\2\2\u037e\u037f"+
		"\7D\2\2\u037f\u0380\7\u00e8\2\2\u0380\u0381\5\u0106\u0084\2\u0381\u0385"+
		"\5\u012a\u0096\2\u0382\u0384\5B\"\2\u0383\u0382\3\2\2\2\u0384\u0387\3"+
		"\2\2\2\u0385\u0383\3\2\2\2\u0385\u0386\3\2\2\2\u0386\u0388\3\2\2\2\u0387"+
		"\u0385\3\2\2\2\u0388\u0389\7:\2\2\u0389A\3\2\2\2\u038a\u0393\5\u0106\u0084"+
		"\2\u038b\u038d\7\u00e8\2\2\u038c\u038b\3\2\2\2\u038c\u038d\3\2\2\2\u038d"+
		"\u038e\3\2\2\2\u038e\u0390\7\u00ca\2\2\u038f\u0391\7\u00e8\2\2\u0390\u038f"+
		"\3\2\2\2\u0390\u0391\3\2\2\2\u0391\u0392\3\2\2\2\u0392\u0394\5\u00d2j"+
		"\2\u0393\u038c\3\2\2\2\u0393\u0394\3\2\2\2\u0394\u0395\3\2\2\2\u0395\u0396"+
		"\5\u012a\u0096\2\u0396C\3\2\2\2\u0397\u0398\7F\2\2\u0398\u0399\7\u00e8"+
		"\2\2\u0399\u039a\5\u00d4k\2\u039aE\3\2\2\2\u039b\u039c\7G\2\2\u039c\u039d"+
		"\7\u00e8\2\2\u039d\u039e\5\u00d4k\2\u039eG\3\2\2\2\u039f\u03a0\5\u0120"+
		"\u0091\2\u03a0\u03a1\7\u00e8\2\2\u03a1\u03a3\3\2\2\2\u03a2\u039f\3\2\2"+
		"\2\u03a2\u03a3\3\2\2\2\u03a3\u03a4\3\2\2\2\u03a4\u03a5\7H\2\2\u03a5\u03a6"+
		"\7\u00e8\2\2\u03a6\u03a8\5\u0106\u0084\2\u03a7\u03a9\7\u00e8\2\2\u03a8"+
		"\u03a7\3\2\2\2\u03a8\u03a9\3\2\2\2\u03a9\u03aa\3\2\2\2\u03aa\u03ab\5\u00f8"+
		"}\2\u03abI\3\2\2\2\u03ac\u03ad\t\5\2\2\u03adK\3\2\2\2\u03ae\u03af\7P\2"+
		"\2\u03af\u03b0\7\u00e8\2\2\u03b0\u03b2\5\u00d4k\2\u03b1\u03b3\7\u00e8"+
		"\2\2\u03b2\u03b1\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3\u03b4\3\2\2\2\u03b4"+
		"\u03b6\7\3\2\2\u03b5\u03b7\7\u00e8\2\2\u03b6\u03b5\3\2\2\2\u03b6\u03b7"+
		"\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8\u03b9\5\u00d4k\2\u03b9M\3\2\2\2\u03ba"+
		"\u03bb\7R\2\2\u03bb\u03bc\7\u00e8\2\2\u03bc\u03bd\7\67\2\2\u03bd\u03be"+
		"\7\u00e8\2\2\u03be\u03c0\5\u0106\u0084\2\u03bf\u03c1\5\u011e\u0090\2\u03c0"+
		"\u03bf\3\2\2\2\u03c0\u03c1\3\2\2\2\u03c1\u03c2\3\2\2\2\u03c2\u03c3\7\u00e8"+
		"\2\2\u03c3\u03c4\7\\\2\2\u03c4\u03c5\7\u00e8\2\2\u03c5\u03c6\5\u00d4k"+
		"\2\u03c6\u03c8\5\u012a\u0096\2\u03c7\u03c9\5 \21\2\u03c8\u03c7\3\2\2\2"+
		"\u03c8\u03c9\3\2\2\2\u03c9\u03ca\3\2\2\2\u03ca\u03cd\7x\2\2\u03cb\u03cc"+
		"\7\u00e8\2\2\u03cc\u03ce\5\u0106\u0084\2\u03cd\u03cb\3\2\2\2\u03cd\u03ce"+
		"\3\2\2\2\u03ceO\3\2\2\2\u03cf\u03d0\7R\2\2\u03d0\u03d1\7\u00e8\2\2\u03d1"+
		"\u03d3\5\u0106\u0084\2\u03d2\u03d4\5\u011e\u0090\2\u03d3\u03d2\3\2\2\2"+
		"\u03d3\u03d4\3\2\2\2\u03d4\u03d7\3\2\2\2\u03d5\u03d6\7\u00e8\2\2\u03d6"+
		"\u03d8\5\u0108\u0085\2\u03d7\u03d5\3\2\2\2\u03d7\u03d8\3\2\2\2\u03d8\u03da"+
		"\3\2\2\2\u03d9\u03db\7\u00e8\2\2\u03da\u03d9\3\2\2\2\u03da\u03db\3\2\2"+
		"\2\u03db\u03dc\3\2\2\2\u03dc\u03de\7\u00ca\2\2\u03dd\u03df\7\u00e8\2\2"+
		"\u03de\u03dd\3\2\2\2\u03de\u03df\3\2\2\2\u03df\u03e0\3\2\2\2\u03e0\u03e1"+
		"\5\u00d4k\2\u03e1\u03e2\7\u00e8\2\2\u03e2\u03e3\7\u00b4\2\2\u03e3\u03e4"+
		"\7\u00e8\2\2\u03e4\u03e9\5\u00d4k\2\u03e5\u03e6\7\u00e8\2\2\u03e6\u03e7"+
		"\7\u00ac\2\2\u03e7\u03e8\7\u00e8\2\2\u03e8\u03ea\5\u00d4k\2\u03e9\u03e5"+
		"\3\2\2\2\u03e9\u03ea\3\2\2\2\u03ea\u03eb\3\2\2\2\u03eb\u03ed\5\u012a\u0096"+
		"\2\u03ec\u03ee\5 \21\2\u03ed\u03ec\3\2\2\2\u03ed\u03ee\3\2\2\2\u03ee\u03ef"+
		"\3\2\2\2\u03ef\u03f2\7x\2\2\u03f0\u03f1\7\u00e8\2\2\u03f1\u03f3\5\u0106"+
		"\u0084\2\u03f2\u03f0\3\2\2\2\u03f2\u03f3\3\2\2\2\u03f3Q\3\2\2\2\u03f4"+
		"\u03f5\5\u0120\u0091\2\u03f5\u03f6\7\u00e8\2\2\u03f6\u03f8\3\2\2\2\u03f7"+
		"\u03f4\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f8\u03fb\3\2\2\2\u03f9\u03fa\7\u00ab"+
		"\2\2\u03fa\u03fc\7\u00e8\2\2\u03fb\u03f9\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc"+
		"\u03fd\3\2\2\2\u03fd\u03ff\7S\2\2\u03fe\u0400\7\u00e8\2\2\u03ff\u03fe"+
		"\3\2\2\2\u03ff\u0400\3\2\2\2\u0400\u0401\3\2\2\2\u0401\u0403\5\u0106\u0084"+
		"\2\u0402\u0404\5\u011e\u0090\2\u0403\u0402\3\2\2\2\u0403\u0404\3\2\2\2"+
		"\u0404\u0409\3\2\2\2\u0405\u0407\7\u00e8\2\2\u0406\u0405\3\2\2\2\u0406"+
		"\u0407\3\2\2\2\u0407\u0408\3\2\2\2\u0408\u040a\5\u00f8}\2\u0409\u0406"+
		"\3\2\2\2\u0409\u040a\3\2\2\2\u040a\u040f\3\2\2\2\u040b\u040d\7\u00e8\2"+
		"\2\u040c\u040b\3\2\2\2\u040c\u040d\3\2\2\2\u040d\u040e\3\2\2\2\u040e\u0410"+
		"\5\u0108\u0085\2\u040f\u040c\3\2\2\2\u040f\u0410\3\2\2\2\u0410\u0411\3"+
		"\2\2\2\u0411\u0413\5\u012a\u0096\2\u0412\u0414\5 \21\2\u0413\u0412\3\2"+
		"\2\2\u0413\u0414\3\2\2\2\u0414\u0415\3\2\2\2\u0415\u0416\7;\2\2\u0416"+
		"S\3\2\2\2\u0417\u0418\5\u0120\u0091\2\u0418\u0419\7\u00e8\2\2\u0419\u041b"+
		"\3\2\2\2\u041a\u0417\3\2\2\2\u041a\u041b\3\2\2\2\u041b\u041e\3\2\2\2\u041c"+
		"\u041d\7\u00ab\2\2\u041d\u041f\7\u00e8\2\2\u041e\u041c\3\2\2\2\u041e\u041f"+
		"\3\2\2\2\u041f\u0420\3\2\2\2\u0420\u0422\7T\2\2\u0421\u0423\7\u00e8\2"+
		"\2\u0422\u0421\3\2\2\2\u0422\u0423\3\2\2\2\u0423\u0424\3\2\2\2\u0424\u0426"+
		"\5\u0106\u0084\2\u0425\u0427\5\u011e\u0090\2\u0426\u0425\3\2\2\2\u0426"+
		"\u0427\3\2\2\2\u0427\u042b\3\2\2\2\u0428\u0429\7\r\2\2\u0429\u042a\7\u00e8"+
		"\2\2\u042a\u042c\5\u0106\u0084\2\u042b\u0428\3\2\2\2\u042b\u042c\3\2\2"+
		"\2\u042c\u0431\3\2\2\2\u042d\u042f\7\u00e8\2\2\u042e\u042d\3\2\2\2\u042e"+
		"\u042f\3\2\2\2\u042f\u0430\3\2\2\2\u0430\u0432\5\u00f8}\2\u0431\u042e"+
		"\3\2\2\2\u0431\u0432\3\2\2\2\u0432\u0437\3\2\2\2\u0433\u0435\7\u00e8\2"+
		"\2\u0434\u0433\3\2\2\2\u0434\u0435\3\2\2\2\u0435\u0436\3\2\2\2\u0436\u0438"+
		"\5\u0108\u0085\2\u0437\u0434\3\2\2\2\u0437\u0438\3\2\2\2\u0438\u043f\3"+
		"\2\2\2\u0439\u043b\7\u00e8\2\2\u043a\u0439\3\2\2\2\u043a\u043b\3\2\2\2"+
		"\u043b\u043c\3\2\2\2\u043c\u043d\7\u00c3\2\2\u043d\u043e\7\u00e8\2\2\u043e"+
		"\u0440\5\u00d4k\2\u043f\u043a\3\2\2\2\u043f\u0440\3\2\2\2\u0440\u0441"+
		"\3\2\2\2\u0441\u0443\5\u012a\u0096\2\u0442\u0444\5 \21\2\u0443\u0442\3"+
		"\2\2\2\u0443\u0444\3\2\2\2\u0444\u0445\3\2\2\2\u0445\u0446\7<\2\2\u0446"+
		"U\3\2\2\2\u0447\u0448\7U\2\2\u0448\u0449\7\u00e8\2\2\u0449\u044b\5\u00e4"+
		"s\2\u044a\u044c\7\u00e8\2\2\u044b\u044a\3\2\2\2\u044b\u044c\3\2\2\2\u044c"+
		"\u044d\3\2\2\2\u044d\u044f\7\3\2\2\u044e\u0450\7\u00e8\2\2\u044f\u044e"+
		"\3\2\2\2\u044f\u0450\3\2\2\2\u0450\u0452\3\2\2\2\u0451\u0453\5\u00d4k"+
		"\2\u0452\u0451\3\2\2\2\u0452\u0453\3\2\2\2\u0453\u0455\3\2\2\2\u0454\u0456"+
		"\7\u00e8\2\2\u0455\u0454\3\2\2\2\u0455\u0456\3\2\2\2\u0456\u0457\3\2\2"+
		"\2\u0457\u0459\7\3\2\2\u0458\u045a\7\u00e8\2\2\u0459\u0458\3\2\2\2\u0459"+
		"\u045a\3\2\2\2\u045a\u045b\3\2\2\2\u045b\u045c\5\u00d4k\2\u045cW\3\2\2"+
		"\2\u045d\u045e\7W\2\2\u045e\u045f\7\u00e8\2\2\u045f\u0460\5\u0106\u0084"+
		"\2\u0460Y\3\2\2\2\u0461\u0462\7X\2\2\u0462\u0463\7\u00e8\2\2\u0463\u0464"+
		"\5\u0106\u0084\2\u0464[\3\2\2\2\u0465\u0466\7Y\2\2\u0466\u0467\7\u00e8"+
		"\2\2\u0467\u0468\5`\61\2\u0468\u0469\7\u00e8\2\2\u0469\u046a\7\u00b2\2"+
		"\2\u046a\u046b\7\u00e8\2\2\u046b\u0470\5\"\22\2\u046c\u046d\7\u00e8\2"+
		"\2\u046d\u046e\78\2\2\u046e\u046f\7\u00e8\2\2\u046f\u0471\5\"\22\2\u0470"+
		"\u046c\3\2\2\2\u0470\u0471\3\2\2\2\u0471\u047f\3\2\2\2\u0472\u0476\5^"+
		"\60\2\u0473\u0475\5b\62\2\u0474\u0473\3\2\2\2\u0475\u0478\3\2\2\2\u0476"+
		"\u0474\3\2\2\2\u0476\u0477\3\2\2\2\u0477\u047a\3\2\2\2\u0478\u0476\3\2"+
		"\2\2\u0479\u047b\5d\63\2\u047a\u0479\3\2\2\2\u047a\u047b\3\2\2\2\u047b"+
		"\u047c\3\2\2\2\u047c\u047d\7=\2\2\u047d\u047f\3\2\2\2\u047e\u0465\3\2"+
		"\2\2\u047e\u0472\3\2\2\2\u047f]\3\2\2\2\u0480\u0481\7Y\2\2\u0481\u0482"+
		"\7\u00e8\2\2\u0482\u0483\5`\61\2\u0483\u0484\7\u00e8\2\2\u0484\u0485\7"+
		"\u00b2\2\2\u0485\u0487\5\u012a\u0096\2\u0486\u0488\5 \21\2\u0487\u0486"+
		"\3\2\2\2\u0487\u0488\3\2\2\2\u0488_\3\2\2\2\u0489\u048a\5\u00d4k\2\u048a"+
		"a\3\2\2\2\u048b\u048c\79\2\2\u048c\u048d\7\u00e8\2\2\u048d\u048e\5`\61"+
		"\2\u048e\u048f\7\u00e8\2\2\u048f\u0490\7\u00b2\2\2\u0490\u0492\5\u012a"+
		"\u0096\2\u0491\u0493\5 \21\2\u0492\u0491\3\2\2\2\u0492\u0493\3\2\2\2\u0493"+
		"c\3\2\2\2\u0494\u0495\78\2\2\u0495\u0497\5\u012a\u0096\2\u0496\u0498\5"+
		" \21\2\u0497\u0496\3\2\2\2\u0497\u0498\3\2\2\2\u0498e\3\2\2\2\u0499\u049a"+
		"\7[\2\2\u049a\u049b\7\u00e8\2\2\u049b\u049c\5\u0106\u0084\2\u049cg\3\2"+
		"\2\2\u049d\u049e\7]\2\2\u049e\u049f\7\u00e8\2\2\u049f\u04a8\5\u00e4s\2"+
		"\u04a0\u04a2\7\u00e8\2\2\u04a1\u04a0\3\2\2\2\u04a1\u04a2\3\2\2\2\u04a2"+
		"\u04a3\3\2\2\2\u04a3\u04a5\7\3\2\2\u04a4\u04a6\7\u00e8\2\2\u04a5\u04a4"+
		"\3\2\2\2\u04a5\u04a6\3\2\2\2\u04a6\u04a7\3\2\2\2\u04a7\u04a9\5\u00d4k"+
		"\2\u04a8\u04a1\3\2\2\2\u04a9\u04aa\3\2\2\2\u04aa\u04a8\3\2\2\2\u04aa\u04ab"+
		"\3\2\2\2\u04abi\3\2\2\2\u04ac\u04ad\7`\2\2\u04ad\u04ae\7\u00e8\2\2\u04ae"+
		"\u04af\5\u00d4k\2\u04afk\3\2\2\2\u04b0\u04b1\7f\2\2\u04b1\u04b3\7\u00e8"+
		"\2\2\u04b2\u04b0\3\2\2\2\u04b2\u04b3\3\2\2\2\u04b3\u04b4\3\2\2\2\u04b4"+
		"\u04b6\5\u00eav\2\u04b5\u04b7\7\u00e8\2\2\u04b6\u04b5\3\2\2\2\u04b6\u04b7"+
		"\3\2\2\2\u04b7\u04b8\3\2\2\2\u04b8\u04ba\t\6\2\2\u04b9\u04bb\7\u00e8\2"+
		"\2\u04ba\u04b9\3\2\2\2\u04ba\u04bb\3\2\2\2\u04bb\u04bc\3\2\2\2\u04bc\u04bd"+
		"\5\u00d4k\2\u04bdm\3\2\2\2\u04be\u04bf\7i\2\2\u04bf\u04c0\7\u00e8\2\2"+
		"\u04c0\u04c2\5\u00e4s\2\u04c1\u04c3\7\u00e8\2\2\u04c2\u04c1\3\2\2\2\u04c2"+
		"\u04c3\3\2\2\2\u04c3\u04c4\3\2\2\2\u04c4\u04c6\7\3\2\2\u04c5\u04c7\7\u00e8"+
		"\2\2\u04c6\u04c5\3\2\2\2\u04c6\u04c7\3\2\2\2\u04c7\u04c8\3\2\2\2\u04c8"+
		"\u04c9\5\u00d4k\2\u04c9o\3\2\2\2\u04ca\u04cb\7a\2\2\u04cb\u04cc\7\u00e8"+
		"\2\2\u04cc\u04cd\5\u00d4k\2\u04cdq\3\2\2\2\u04ce\u04cf\7b\2\2\u04cf\u04d0"+
		"\7\u00e8\2\2\u04d0\u04df\5\u00d4k\2\u04d1\u04d3\7\u00e8\2\2\u04d2\u04d1"+
		"\3\2\2\2\u04d2\u04d3\3\2\2\2\u04d3\u04d4\3\2\2\2\u04d4\u04d6\7\3\2\2\u04d5"+
		"\u04d7\7\u00e8\2\2\u04d6\u04d5\3\2\2\2\u04d6\u04d7\3\2\2\2\u04d7\u04d8"+
		"\3\2\2\2\u04d8\u04dd\5\u00d4k\2\u04d9\u04da\7\u00e8\2\2\u04da\u04db\7"+
		"\u00b4\2\2\u04db\u04dc\7\u00e8\2\2\u04dc\u04de\5\u00d4k\2\u04dd\u04d9"+
		"\3\2\2\2\u04dd\u04de\3\2\2\2\u04de\u04e0\3\2\2\2\u04df\u04d2\3\2\2\2\u04df"+
		"\u04e0\3\2\2\2\u04e0s\3\2\2\2\u04e1\u04e2\7m\2\2\u04e2\u04e3\7\u00e8\2"+
		"\2\u04e3\u04e5\5\u00eav\2\u04e4\u04e6\7\u00e8\2\2\u04e5\u04e4\3\2\2\2"+
		"\u04e5\u04e6\3\2\2\2\u04e6\u04e7\3\2\2\2\u04e7\u04e9\7\u00ca\2\2\u04e8"+
		"\u04ea\7\u00e8\2\2\u04e9\u04e8\3\2\2\2\u04e9\u04ea\3\2\2\2\u04ea\u04eb"+
		"\3\2\2\2\u04eb\u04ec\5\u00d4k\2\u04ecu\3\2\2\2\u04ed\u04ef\7n\2\2\u04ee"+
		"\u04f0\7\u00e8\2\2\u04ef\u04ee\3\2\2\2\u04ef\u04f0\3\2\2\2\u04f0\u04f1"+
		"\3\2\2\2\u04f1\u04f3\5\u0106\u0084\2\u04f2\u04f4\7\u00e8\2\2\u04f3\u04f2"+
		"\3\2\2\2\u04f3\u04f4\3\2\2\2\u04f4\u04f5\3\2\2\2\u04f5\u04f7\7\u00ca\2"+
		"\2\u04f6\u04f8\7\u00e8\2\2\u04f7\u04f6\3\2\2\2\u04f7\u04f8\3\2\2\2\u04f8"+
		"\u04f9\3\2\2\2\u04f9\u04fa\5\u00d4k\2\u04faw\3\2\2\2\u04fb\u04ff\5z>\2"+
		"\u04fc\u04fe\5|?\2\u04fd\u04fc\3\2\2\2\u04fe\u0501\3\2\2\2\u04ff\u04fd"+
		"\3\2\2\2\u04ff\u0500\3\2\2\2\u0500\u0503\3\2\2\2\u0501\u04ff\3\2\2\2\u0502"+
		"\u0504\5~@\2\u0503\u0502\3\2\2\2\u0503\u0504\3\2\2\2\u0504\u0505\3\2\2"+
		"\2\u0505\u0506\7r\2\2\u0506y\3\2\2\2\u0507\u0509\7o\2\2\u0508\u050a\7"+
		"\u00e8\2\2\u0509\u0508\3\2\2\2\u0509\u050a\3\2\2\2\u050a\u050b\3\2\2\2"+
		"\u050b\u050c\5`\61\2\u050c\u050d\7\u00e8\2\2\u050d\u050e\7\u00b2\2\2\u050e"+
		"\u0514\5\u012a\u0096\2\u050f\u0513\5\22\n\2\u0510\u0513\5\32\16\2\u0511"+
		"\u0513\5 \21\2\u0512\u050f\3\2\2\2\u0512\u0510\3\2\2\2\u0512\u0511\3\2"+
		"\2\2\u0513\u0516\3\2\2\2\u0514\u0512\3\2\2\2\u0514\u0515\3\2\2\2\u0515"+
		"{\3\2\2\2\u0516\u0514\3\2\2\2\u0517\u0519\7p\2\2\u0518\u051a\7\u00e8\2"+
		"\2\u0519\u0518\3\2\2\2\u0519\u051a\3\2\2\2\u051a\u051b\3\2\2\2\u051b\u051c"+
		"\5`\61\2\u051c\u051d\7\u00e8\2\2\u051d\u051e\7\u00b2\2\2\u051e\u0524\5"+
		"\u012a\u0096\2\u051f\u0523\5\22\n\2\u0520\u0523\5\32\16\2\u0521\u0523"+
		"\5 \21\2\u0522\u051f\3\2\2\2\u0522\u0520\3\2\2\2\u0522\u0521\3\2\2\2\u0523"+
		"\u0526\3\2\2\2\u0524\u0522\3\2\2\2\u0524\u0525\3\2\2\2\u0525}\3\2\2\2"+
		"\u0526\u0524\3\2\2\2\u0527\u0528\7q\2\2\u0528\u052e\5\u012a\u0096\2\u0529"+
		"\u052d\5\22\n\2\u052a\u052d\5\32\16\2\u052b\u052d\5 \21\2\u052c\u0529"+
		"\3\2\2\2\u052c\u052a\3\2\2\2\u052c\u052b\3\2\2\2\u052d\u0530\3\2\2\2\u052e"+
		"\u052c\3\2\2\2\u052e\u052f\3\2\2\2\u052f\177\3\2\2\2\u0530\u052e\3\2\2"+
		"\2\u0531\u0533\7t\2\2\u0532\u0534\7\u00e8\2\2\u0533\u0532\3\2\2\2\u0533"+
		"\u0534\3\2\2\2\u0534\u0535\3\2\2\2\u0535\u0537\7\u00ce\2\2\u0536\u0538"+
		"\7\u00e8\2\2\u0537\u0536\3\2\2\2\u0537\u0538\3\2\2\2\u0538\u0539\3\2\2"+
		"\2\u0539\u053b\5\u0106\u0084\2\u053a\u053c\7\u00e8\2\2\u053b\u053a\3\2"+
		"\2\2\u053b\u053c\3\2\2\2\u053c\u053d\3\2\2\2\u053d\u053f\7\3\2\2\u053e"+
		"\u0540\7\u00e8\2\2\u053f\u053e\3\2\2\2\u053f\u0540\3\2\2\2\u0540\u0541"+
		"\3\2\2\2\u0541\u054a\5\u00d4k\2\u0542\u0544\7\u00e8\2\2\u0543\u0542\3"+
		"\2\2\2\u0543\u0544\3\2\2\2\u0544\u0545\3\2\2\2\u0545\u0547\7\3\2\2\u0546"+
		"\u0548\7\u00e8\2\2\u0547\u0546\3\2\2\2\u0547\u0548\3\2\2\2\u0548\u0549"+
		"\3\2\2\2\u0549\u054b\5\u00d4k\2\u054a\u0543\3\2\2\2\u054a\u054b\3\2\2"+
		"\2\u054b\u054d\3\2\2\2\u054c\u054e\7\u00e8\2\2\u054d\u054c\3\2\2\2\u054d"+
		"\u054e\3\2\2\2\u054e\u054f\3\2\2\2\u054f\u0551\7\u00d7\2\2\u0550\u0552"+
		"\7\u00e8\2\2\u0551\u0550\3\2\2\2\u0551\u0552\3\2\2\2\u0552\u0553\3\2\2"+
		"\2\u0553\u0555\7\u00ca\2\2\u0554\u0556\7\u00e8\2\2\u0555\u0554\3\2\2\2"+
		"\u0555\u0556\3\2\2\2\u0556\u0557\3\2\2\2\u0557\u0558\5\u00d4k\2\u0558"+
		"\u0081\3\2\2\2\u0559\u055a\7u\2\2\u055a\u055b\7\u00e8\2\2\u055b\u055c"+
		"\5\u00d4k\2\u055c\u0083\3\2\2\2\u055d\u055e\7w\2\2\u055e\u055f\7\u00e8"+
		"\2\2\u055f\u0560\5\u00d4k\2\u0560\u0561\7\u00e8\2\2\u0561\u0562\7\22\2"+
		"\2\u0562\u0563\7\u00e8\2\2\u0563\u0564\5\u00d4k\2\u0564\u0085\3\2\2\2"+
		"\u0565\u0566\t\7\2\2\u0566\u056d\7\u00e8\2\2\u0567\u0568\7X\2\2\u0568"+
		"\u0569\7\u00e8\2\2\u0569\u056e\5\u0106\u0084\2\u056a\u056b\7\u009b\2\2"+
		"\u056b\u056c\7\u00e8\2\2\u056c\u056e\7x\2\2\u056d\u0567\3\2\2\2\u056d"+
		"\u056a\3\2\2\2\u056e\u0087\3\2\2\2\u056f\u0570\7~\2\2\u0570\u0571\7\u00e8"+
		"\2\2\u0571\u0572\5\u00d4k\2\u0572\u0573\7\u00e8\2\2\u0573\u0574\7X\2\2"+
		"\u0574\u0575\7\u00e8\2\2\u0575\u0580\5\u0106\u0084\2\u0576\u0578\7\u00e8"+
		"\2\2\u0577\u0576\3\2\2\2\u0577\u0578\3\2\2\2\u0578\u0579\3\2\2\2\u0579"+
		"\u057b\7\3\2\2\u057a\u057c\7\u00e8\2\2\u057b\u057a\3\2\2\2\u057b\u057c"+
		"\3\2\2\2\u057c\u057d\3\2\2\2\u057d\u057f\5\u0106\u0084\2\u057e\u0577\3"+
		"\2\2\2\u057f\u0582\3\2\2\2\u0580\u057e\3\2\2\2\u0580\u0581\3\2\2\2\u0581"+
		"\u0089\3\2\2\2\u0582\u0580\3\2\2\2\u0583\u0584\7~\2\2\u0584\u0585\7\u00e8"+
		"\2\2\u0585\u0586\5\u00d4k\2\u0586\u0587\7\u00e8\2\2\u0587\u0588\7W\2\2"+
		"\u0588\u0589\7\u00e8\2\2\u0589\u0594\5\u0106\u0084\2\u058a\u058c\7\u00e8"+
		"\2\2\u058b\u058a\3\2\2\2\u058b\u058c\3\2\2\2\u058c\u058d\3\2\2\2\u058d"+
		"\u058f\7\3\2\2\u058e\u0590\7\u00e8\2\2\u058f\u058e\3\2\2\2\u058f\u0590"+
		"\3\2\2\2\u0590\u0591\3\2\2\2\u0591\u0593\5\u0106\u0084\2\u0592\u058b\3"+
		"\2\2\2\u0593\u0596\3\2\2\2\u0594\u0592\3\2\2\2\u0594\u0595\3\2\2\2\u0595"+
		"\u008b\3\2\2\2\u0596\u0594\3\2\2\2\u0597\u0598\7\u0081\2\2\u0598\u0599"+
		"\7\u00e8\2\2\u0599\u059a\5\u00d4k\2\u059a\u059b\7\u00e8\2\2\u059b\u059c"+
		"\7R\2\2\u059c\u059d\7\u00e8\2\2\u059d\u05a2\t\b\2\2\u059e\u059f\7\u00e8"+
		"\2\2\u059f\u05a0\7\13\2\2\u05a0\u05a1\7\u00e8\2\2\u05a1\u05a3\t\t\2\2"+
		"\u05a2\u059e\3\2\2\2\u05a2\u05a3\3\2\2\2\u05a3\u05a6\3\2\2\2\u05a4\u05a5"+
		"\7\u00e8\2\2\u05a5\u05a7\t\n\2\2\u05a6\u05a4\3\2\2\2\u05a6\u05a7\3\2\2"+
		"\2\u05a7\u05a8\3\2\2\2\u05a8\u05a9\7\u00e8\2\2\u05a9\u05aa\7\22\2\2\u05aa"+
		"\u05ab\7\u00e8\2\2\u05ab\u05b6\5\u00e4s\2\u05ac\u05ad\7\u00e8\2\2\u05ad"+
		"\u05af\7e\2\2\u05ae\u05b0\7\u00e8\2\2\u05af\u05ae\3\2\2\2\u05af\u05b0"+
		"\3\2\2\2\u05b0\u05b1\3\2\2\2\u05b1\u05b3\7\u00ca\2\2\u05b2\u05b4\7\u00e8"+
		"\2\2\u05b3\u05b2\3\2\2\2\u05b3\u05b4\3\2\2\2\u05b4\u05b5\3\2\2\2\u05b5"+
		"\u05b7\5\u00d4k\2\u05b6\u05ac\3\2\2\2\u05b6\u05b7\3\2\2\2\u05b7\u008d"+
		"\3\2\2\2\u05b8\u05c5\5\u0090I\2\u05b9\u05bb\7\u00e8\2\2\u05ba\u05b9\3"+
		"\2\2\2\u05ba\u05bb\3\2\2\2\u05bb\u05bc\3\2\2\2\u05bc\u05be\t\13\2\2\u05bd"+
		"\u05bf\7\u00e8\2\2\u05be\u05bd\3\2\2\2\u05be\u05bf\3\2\2\2\u05bf\u05c1"+
		"\3\2\2\2\u05c0\u05c2\5\u0090I\2\u05c1\u05c0\3\2\2\2\u05c1\u05c2\3\2\2"+
		"\2\u05c2\u05c4\3\2\2\2\u05c3\u05ba\3\2\2\2\u05c4\u05c7\3\2\2\2\u05c5\u05c3"+
		"\3\2\2\2\u05c5\u05c6\3\2\2\2\u05c6\u05da\3\2\2\2\u05c7\u05c5\3\2\2\2\u05c8"+
		"\u05ca\5\u0090I\2\u05c9\u05c8\3\2\2\2\u05c9\u05ca\3\2\2\2\u05ca\u05d5"+
		"\3\2\2\2\u05cb\u05cd\7\u00e8\2\2\u05cc\u05cb\3\2\2\2\u05cc\u05cd\3\2\2"+
		"\2\u05cd\u05ce\3\2\2\2\u05ce\u05d0\t\13\2\2\u05cf\u05d1\7\u00e8\2\2\u05d0"+
		"\u05cf\3\2\2\2\u05d0\u05d1\3\2\2\2\u05d1\u05d3\3\2\2\2\u05d2\u05d4\5\u0090"+
		"I\2\u05d3\u05d2\3\2\2\2\u05d3\u05d4\3\2\2\2\u05d4\u05d6\3\2\2\2\u05d5"+
		"\u05cc\3\2\2\2\u05d6\u05d7\3\2\2\2\u05d7\u05d5\3\2\2\2\u05d7\u05d8\3\2"+
		"\2\2\u05d8\u05da\3\2\2\2\u05d9\u05b8\3\2\2\2\u05d9\u05c9\3\2\2\2\u05da"+
		"\u008f\3\2\2\2\u05db\u05ed\5\u00d4k\2\u05dc\u05ea\t\f\2\2\u05dd\u05df"+
		"\7\u00e8\2\2\u05de\u05dd\3\2\2\2\u05de\u05df\3\2\2\2\u05df\u05e0\3\2\2"+
		"\2\u05e0\u05e2\7\u00ce\2\2\u05e1\u05e3\7\u00e8\2\2\u05e2\u05e1\3\2\2\2"+
		"\u05e2\u05e3\3\2\2\2\u05e3\u05e4\3\2\2\2\u05e4\u05e6\5\u00f4{\2\u05e5"+
		"\u05e7\7\u00e8\2\2\u05e6\u05e5\3\2\2\2\u05e6\u05e7\3\2\2\2\u05e7\u05e8"+
		"\3\2\2\2\u05e8\u05e9\7\u00d7\2\2\u05e9\u05eb\3\2\2\2\u05ea\u05de\3\2\2"+
		"\2\u05ea\u05eb\3\2\2\2\u05eb\u05ed\3\2\2\2\u05ec\u05db\3\2\2\2\u05ec\u05dc"+
		"\3\2\2\2\u05ed\u0091\3\2\2\2\u05ee\u05ef\7\u008b\2\2\u05ef\u05f0\7\u00e8"+
		"\2\2\u05f0\u05f2\5\u00e4s\2\u05f1\u05f3\7\u00e8\2\2\u05f2\u05f1\3\2\2"+
		"\2\u05f2\u05f3\3\2\2\2\u05f3\u05f4\3\2\2\2\u05f4\u05f9\7\3\2\2\u05f5\u05f7"+
		"\7\u00e8\2\2\u05f6\u05f5\3\2\2\2\u05f6\u05f7\3\2\2\2\u05f7\u05f8\3\2\2"+
		"\2\u05f8\u05fa\5\u008eH\2\u05f9\u05f6\3\2\2\2\u05f9\u05fa\3\2\2\2\u05fa"+
		"\u0093\3\2\2\2\u05fb\u05fc\5\u0120\u0091\2\u05fc\u05fd\7\u00e8\2\2\u05fd"+
		"\u05ff\3\2\2\2\u05fe\u05fb\3\2\2\2\u05fe\u05ff\3\2\2\2\u05ff\u0602\3\2"+
		"\2\2\u0600\u0601\7\u00ab\2\2\u0601\u0603\7\u00e8\2\2\u0602\u0600\3\2\2"+
		"\2\u0602\u0603\3\2\2\2\u0603\u0604\3\2\2\2\u0604\u0605\7\u008d\2\2\u0605"+
		"\u0606\7\u00e8\2\2\u0606\u0608\5\u0106\u0084\2\u0607\u0609\5\u011e\u0090"+
		"\2\u0608\u0607\3\2\2\2\u0608\u0609\3\2\2\2\u0609\u060e\3\2\2\2\u060a\u060c"+
		"\7\u00e8\2\2\u060b\u060a\3\2\2\2\u060b\u060c\3\2\2\2\u060c\u060d\3\2\2"+
		"\2\u060d\u060f\5\u00f8}\2\u060e\u060b\3\2\2\2\u060e\u060f\3\2\2\2\u060f"+
		"\u0612\3\2\2\2\u0610\u0611\7\u00e8\2\2\u0611\u0613\5\u0108\u0085\2\u0612"+
		"\u0610\3\2\2\2\u0612\u0613\3\2\2\2\u0613\u0614\3\2\2\2\u0614\u0616\5\u012a"+
		"\u0096\2\u0615\u0617\5 \21\2\u0616\u0615\3\2\2\2\u0616\u0617\3\2\2\2\u0617"+
		"\u0618\3\2\2\2\u0618\u0619\7>\2\2\u0619\u0095\3\2\2\2\u061a\u061b\5\u0120"+
		"\u0091\2\u061b\u061c\7\u00e8\2\2\u061c\u061e\3\2\2\2\u061d\u061a\3\2\2"+
		"\2\u061d\u061e\3\2\2\2\u061e\u0621\3\2\2\2\u061f\u0620\7\u00ab\2\2\u0620"+
		"\u0622\7\u00e8\2\2\u0621\u061f\3\2\2\2\u0621\u0622\3\2\2\2\u0622\u0623"+
		"\3\2\2\2\u0623\u0624\7\u008f\2\2\u0624\u0625\7\u00e8\2\2\u0625\u062a\5"+
		"\u0106\u0084\2\u0626\u0628\7\u00e8\2\2\u0627\u0626\3\2\2\2\u0627\u0628"+
		"\3\2\2\2\u0628\u0629\3\2\2\2\u0629\u062b\5\u00f8}\2\u062a\u0627\3\2\2"+
		"\2\u062a\u062b\3\2\2\2\u062b\u062c\3\2\2\2\u062c\u062e\5\u012a\u0096\2"+
		"\u062d\u062f\5 \21\2\u062e\u062d\3\2\2\2\u062e\u062f\3\2\2\2\u062f\u0630"+
		"\3\2\2\2\u0630\u0631\7>\2\2\u0631\u0097\3\2\2\2\u0632\u0633\5\u0120\u0091"+
		"\2\u0633\u0634\7\u00e8\2\2\u0634\u0636\3\2\2\2\u0635\u0632\3\2\2\2\u0635"+
		"\u0636\3\2\2\2\u0636\u0639\3\2\2\2\u0637\u0638\7\u00ab\2\2\u0638\u063a"+
		"\7\u00e8\2\2\u0639\u0637\3\2\2\2\u0639\u063a\3\2\2\2\u063a\u063b\3\2\2"+
		"\2\u063b\u063c\7\u008e\2\2\u063c\u063d\7\u00e8\2\2\u063d\u0642\5\u0106"+
		"\u0084\2\u063e\u0640\7\u00e8\2\2\u063f\u063e\3\2\2\2\u063f\u0640\3\2\2"+
		"\2\u0640\u0641\3\2\2\2\u0641\u0643\5\u00f8}\2\u0642\u063f\3\2\2\2\u0642"+
		"\u0643\3\2\2\2\u0643\u0644\3\2\2\2\u0644\u0646\5\u012a\u0096\2\u0645\u0647"+
		"\5 \21\2\u0646\u0645\3\2\2\2\u0646\u0647\3\2\2\2\u0647\u0648\3\2\2\2\u0648"+
		"\u0649\7>\2\2\u0649\u0099\3\2\2\2\u064a\u064b\7\u0092\2\2\u064b\u064c"+
		"\7\u00e8\2\2\u064c\u064e\5\u00e4s\2\u064d\u064f\7\u00e8\2\2\u064e\u064d"+
		"\3\2\2\2\u064e\u064f\3\2\2\2\u064f\u0650\3\2\2\2\u0650\u0652\7\3\2\2\u0651"+
		"\u0653\7\u00e8\2\2\u0652\u0651\3\2\2\2\u0652\u0653\3\2\2\2\u0653\u0655"+
		"\3\2\2\2\u0654\u0656\5\u00d4k\2\u0655\u0654\3\2\2\2\u0655\u0656\3\2\2"+
		"\2\u0656\u0658\3\2\2\2\u0657\u0659\7\u00e8\2\2\u0658\u0657\3\2\2\2\u0658"+
		"\u0659\3\2\2\2\u0659\u065a\3\2\2\2\u065a\u065c\7\3\2\2\u065b\u065d\7\u00e8"+
		"\2\2\u065c\u065b\3\2\2\2\u065c\u065d\3\2\2\2\u065d\u065e\3\2\2\2\u065e"+
		"\u065f\5\u00d4k\2\u065f\u009b\3\2\2\2\u0660\u0661\7\u0095\2\2\u0661\u0662"+
		"\7\u00e8\2\2\u0662\u0671\5\u0106\u0084\2\u0663\u0665\7\u00e8\2\2\u0664"+
		"\u0663\3\2\2\2\u0664\u0665\3\2\2\2\u0665\u0666\3\2\2\2\u0666\u0668\7\u00ce"+
		"\2\2\u0667\u0669\7\u00e8\2\2\u0668\u0667\3\2\2\2\u0668\u0669\3\2\2\2\u0669"+
		"\u066e\3\2\2\2\u066a\u066c\5\u00f4{\2\u066b\u066d\7\u00e8\2\2\u066c\u066b"+
		"\3\2\2\2\u066c\u066d\3\2\2\2\u066d\u066f\3\2\2\2\u066e\u066a\3\2\2\2\u066e"+
		"\u066f\3\2\2\2\u066f\u0670\3\2\2\2\u0670\u0672\7\u00d7\2\2\u0671\u0664"+
		"\3\2\2\2\u0671\u0672\3\2\2\2\u0672\u009d\3\2\2\2\u0673\u0676\7\u0094\2"+
		"\2\u0674\u0675\7\u00e8\2\2\u0675\u0677\5\u00d4k\2\u0676\u0674\3\2\2\2"+
		"\u0676\u0677\3\2\2\2\u0677\u009f\3\2\2\2\u0678\u0679\7\u0098\2\2\u0679"+
		"\u067c\7\u00e8\2\2\u067a\u067b\7\u008a\2\2\u067b\u067d\7\u00e8\2\2\u067c"+
		"\u067a\3\2\2\2\u067c\u067d\3\2\2\2\u067d\u067e\3\2\2\2\u067e\u0689\5\u00a2"+
		"R\2\u067f\u0681\7\u00e8\2\2\u0680\u067f\3\2\2\2\u0680\u0681\3\2\2\2\u0681"+
		"\u0682\3\2\2\2\u0682\u0684\7\3\2\2\u0683\u0685\7\u00e8\2\2\u0684\u0683"+
		"\3\2\2\2\u0684\u0685\3\2\2\2\u0685\u0686\3\2\2\2\u0686\u0688\5\u00a2R"+
		"\2\u0687\u0680\3\2\2\2\u0688\u068b\3\2\2\2\u0689\u0687\3\2\2\2\u0689\u068a"+
		"\3\2\2\2\u068a\u00a1\3\2\2\2\u068b\u0689\3\2\2\2\u068c\u068e\5\u0106\u0084"+
		"\2\u068d\u068f\7\u00e8\2\2\u068e\u068d\3\2\2\2\u068e\u068f\3\2\2\2\u068f"+
		"\u0690\3\2\2\2\u0690\u0692\7\u00ce\2\2\u0691\u0693\7\u00e8\2\2\u0692\u0691"+
		"\3\2\2\2\u0692\u0693\3\2\2\2\u0693\u0694\3\2\2\2\u0694\u0696\5\u00fe\u0080"+
		"\2\u0695\u0697\7\u00e8\2\2\u0696\u0695\3\2\2\2\u0696\u0697\3\2\2\2\u0697"+
		"\u0698\3\2\2\2\u0698\u069b\7\u00d7\2\2\u0699\u069a\7\u00e8\2\2\u069a\u069c"+
		"\5\u0108\u0085\2\u069b\u0699\3\2\2\2\u069b\u069c\3\2\2\2\u069c\u00a3\3"+
		"\2\2\2\u069d\u069e\7\u009a\2\2\u069e\u00a5\3\2\2\2\u069f\u06a5\7\u009b"+
		"\2\2\u06a0\u06a3\7\u00e8\2\2\u06a1\u06a4\7x\2\2\u06a2\u06a4\5\u0106\u0084"+
		"\2\u06a3\u06a1\3\2\2\2\u06a3\u06a2\3\2\2\2\u06a4\u06a6\3\2\2\2\u06a5\u06a0"+
		"\3\2\2\2\u06a5\u06a6\3\2\2\2\u06a6\u00a7\3\2\2\2\u06a7\u06a8\7\u009c\2"+
		"\2\u06a8\u00a9\3\2\2\2\u06a9\u06aa\7\u009d\2\2\u06aa\u06ab\7\u00e8\2\2"+
		"\u06ab\u06ac\5\u00d4k\2\u06ac\u00ab\3\2\2\2\u06ad\u06ae\7\u009e\2\2\u06ae"+
		"\u06af\7\u00e8\2\2\u06af\u06b1\5\u00eav\2\u06b0\u06b2\7\u00e8\2\2\u06b1"+
		"\u06b0\3\2\2\2\u06b1\u06b2\3\2\2\2\u06b2\u06b3\3\2\2\2\u06b3\u06b5\7\u00ca"+
		"\2\2\u06b4\u06b6\7\u00e8\2\2\u06b5\u06b4\3\2\2\2\u06b5\u06b6\3\2\2\2\u06b6"+
		"\u06b7\3\2\2\2\u06b7\u06b8\5\u00d4k\2\u06b8\u00ad\3\2\2\2\u06b9\u06ba"+
		"\7\u009f\2\2\u06ba\u06bb\7\u00e8\2\2\u06bb\u06bd\5\u00d4k\2\u06bc\u06be"+
		"\7\u00e8\2\2\u06bd\u06bc\3\2\2\2\u06bd\u06be\3\2\2\2\u06be\u06bf\3\2\2"+
		"\2\u06bf\u06c1\7\3\2\2\u06c0\u06c2\7\u00e8\2\2\u06c1\u06c0\3\2\2\2\u06c1"+
		"\u06c2\3\2\2\2\u06c2\u06c3\3\2\2\2\u06c3\u06c4\5\u00d4k\2\u06c4\u00af"+
		"\3\2\2\2\u06c5\u06c6\7\u00a0\2\2\u06c6\u06c7\7\u00e8\2\2\u06c7\u06c9\5"+
		"\u00d4k\2\u06c8\u06ca\7\u00e8\2\2\u06c9\u06c8\3\2\2\2\u06c9\u06ca\3\2"+
		"\2\2\u06ca\u06cb\3\2\2\2\u06cb\u06cd\7\3\2\2\u06cc\u06ce\7\u00e8\2\2\u06cd"+
		"\u06cc\3\2\2\2\u06cd\u06ce\3\2\2\2\u06ce\u06cf\3\2\2\2\u06cf\u06d1\5\u00d4"+
		"k\2\u06d0\u06d2\7\u00e8\2\2\u06d1\u06d0\3\2\2\2\u06d1\u06d2\3\2\2\2\u06d2"+
		"\u06d3\3\2\2\2\u06d3\u06d5\7\3\2\2\u06d4\u06d6\7\u00e8\2\2\u06d5\u06d4"+
		"\3\2\2\2\u06d5\u06d6\3\2\2\2\u06d6\u06d7\3\2\2\2\u06d7\u06d9\5\u00d4k"+
		"\2\u06d8\u06da\7\u00e8\2\2\u06d9\u06d8\3\2\2\2\u06d9\u06da\3\2\2\2\u06da"+
		"\u06db\3\2\2\2\u06db\u06dd\7\3\2\2\u06dc\u06de\7\u00e8\2\2\u06dd\u06dc"+
		"\3\2\2\2\u06dd\u06de\3\2\2\2\u06de\u06df\3\2\2\2\u06df\u06e0\5\u00d4k"+
		"\2\u06e0\u00b1\3\2\2\2\u06e1\u06e2\7\u00a1\2\2\u06e2\u06e3\7\u00e8\2\2"+
		"\u06e3\u06e5\5\u00e4s\2\u06e4\u06e6\7\u00e8\2\2\u06e5\u06e4\3\2\2\2\u06e5"+
		"\u06e6\3\2\2\2\u06e6\u06e7\3\2\2\2\u06e7\u06e9\7\3\2\2\u06e8\u06ea\7\u00e8"+
		"\2\2\u06e9\u06e8\3\2\2\2\u06e9\u06ea\3\2\2\2\u06ea\u06eb\3\2\2\2\u06eb"+
		"\u06ec\5\u00d4k\2\u06ec\u00b3\3\2\2\2\u06ed\u06ee\7\u00a2\2\2\u06ee\u06ef"+
		"\7\u00e8\2\2\u06ef\u06f0\7\35\2\2\u06f0\u06f1\7\u00e8\2\2\u06f1\u06f2"+
		"\5\u00d4k\2\u06f2\u06f6\5\u012a\u0096\2\u06f3\u06f5\5\u00b8]\2\u06f4\u06f3"+
		"\3\2\2\2\u06f5\u06f8\3\2\2\2\u06f6\u06f4\3\2\2\2\u06f6\u06f7\3\2\2\2\u06f7"+
		"\u06f9\3\2\2\2\u06f8\u06f6\3\2\2\2\u06f9\u06fa\7?\2\2\u06fa\u00b5\3\2"+
		"\2\2\u06fb\u06fd\7^\2\2\u06fc\u06fe\7\u00e8\2\2\u06fd\u06fc\3\2\2\2\u06fd"+
		"\u06fe\3\2\2\2\u06fe\u06ff\3\2\2\2\u06ff\u0701\5\u010e\u0088\2\u0700\u0702"+
		"\7\u00e8\2\2\u0701\u0700\3\2\2\2\u0701\u0702\3\2\2\2\u0702\u0703\3\2\2"+
		"\2\u0703\u0704\5\u00d4k\2\u0704\u070d\3\2\2\2\u0705\u0706\5\u00d4k\2\u0706"+
		"\u0707\7\u00e8\2\2\u0707\u0708\7\u00b4\2\2\u0708\u0709\7\u00e8\2\2\u0709"+
		"\u070a\5\u00d4k\2\u070a\u070d\3\2\2\2\u070b\u070d\5\u00d4k\2\u070c\u06fb"+
		"\3\2\2\2\u070c\u0705\3\2\2\2\u070c\u070b\3\2\2\2\u070d\u00b7\3\2\2\2\u070e"+
		"\u070f\7\35\2\2\u070f\u0710\7\u00e8\2\2\u0710\u0711\5\u00ba^\2\u0711\u0713"+
		"\5\u012a\u0096\2\u0712\u0714\5 \21\2\u0713\u0712\3\2\2\2\u0713\u0714\3"+
		"\2\2\2\u0714\u00b9\3\2\2\2\u0715\u0725\78\2\2\u0716\u0721\5\u00b6\\\2"+
		"\u0717\u0719\7\u00e8\2\2\u0718\u0717\3\2\2\2\u0718\u0719\3\2\2\2\u0719"+
		"\u071a\3\2\2\2\u071a\u071c\7\3\2\2\u071b\u071d\7\u00e8\2\2\u071c\u071b"+
		"\3\2\2\2\u071c\u071d\3\2\2\2\u071d\u071e\3\2\2\2\u071e\u0720\5\u00b6\\"+
		"\2\u071f\u0718\3\2\2\2\u0720\u0723\3\2\2\2\u0721\u071f\3\2\2\2\u0721\u0722"+
		"\3\2\2\2\u0722\u0725\3\2\2\2\u0723\u0721\3\2\2\2\u0724\u0715\3\2\2\2\u0724"+
		"\u0716\3\2\2\2\u0725\u00bb\3\2\2\2\u0726\u0727\7\u00a3\2\2\u0727\u0728"+
		"\7\u00e8\2\2\u0728\u0731\5\u00d4k\2\u0729\u072b\7\u00e8\2\2\u072a\u0729"+
		"\3\2\2\2\u072a\u072b\3\2\2\2\u072b\u072c\3\2\2\2\u072c\u072e\7\3\2\2\u072d"+
		"\u072f\7\u00e8\2\2\u072e\u072d\3\2\2\2\u072e\u072f\3\2\2\2\u072f\u0730"+
		"\3\2\2\2\u0730\u0732\5\u00d4k\2\u0731\u072a\3\2\2\2\u0731\u0732\3\2\2"+
		"\2\u0732\u00bd\3\2\2\2\u0733\u0734\7\u00a5\2\2\u0734\u0735\7\u00e8\2\2"+
		"\u0735\u0737\5\u00d4k\2\u0736\u0738\7\u00e8\2\2\u0737\u0736\3\2\2\2\u0737"+
		"\u0738\3\2\2\2\u0738\u0739\3\2\2\2\u0739\u073b\7\3\2\2\u073a\u073c\7\u00e8"+
		"\2\2\u073b\u073a\3\2\2\2\u073b\u073c\3\2\2\2\u073c\u073d\3\2\2\2\u073d"+
		"\u073e\5\u00d4k\2\u073e\u00bf\3\2\2\2\u073f\u0740\7\u00a4\2\2\u0740\u0741"+
		"\7\u00e8\2\2\u0741\u0743\5\u00eav\2\u0742\u0744\7\u00e8\2\2\u0743\u0742"+
		"\3\2\2\2\u0743\u0744\3\2\2\2\u0744\u0745\3\2\2\2\u0745\u0747\7\u00ca\2"+
		"\2\u0746\u0748\7\u00e8\2\2\u0747\u0746\3\2\2\2\u0747\u0748\3\2\2\2\u0748"+
		"\u0749\3\2\2\2\u0749\u074a\5\u00d4k\2\u074a\u00c1\3\2\2\2\u074b\u074c"+
		"\7\u00ad\2\2\u074c\u00c3\3\2\2\2\u074d\u074e\5\u0120\u0091\2\u074e\u074f"+
		"\7\u00e8\2\2\u074f\u0751\3\2\2\2\u0750\u074d\3\2\2\2\u0750\u0751\3\2\2"+
		"\2\u0751\u0754\3\2\2\2\u0752\u0753\7\u00ab\2\2\u0753\u0755\7\u00e8\2\2"+
		"\u0754\u0752\3\2\2\2\u0754\u0755\3\2\2\2\u0755\u0756\3\2\2\2\u0756\u0758"+
		"\7\u00af\2\2\u0757\u0759\7\u00e8\2\2\u0758\u0757\3\2\2\2\u0758\u0759\3"+
		"\2\2\2\u0759\u075a\3\2\2\2\u075a\u075f\5\u0106\u0084\2\u075b\u075d\7\u00e8"+
		"\2\2\u075c\u075b\3\2\2\2\u075c\u075d\3\2\2\2\u075d\u075e\3\2\2\2\u075e"+
		"\u0760\5\u00f8}\2\u075f\u075c\3\2\2\2\u075f\u0760\3\2\2\2\u0760\u0761"+
		"\3\2\2\2\u0761\u0763\5\u012a\u0096\2\u0762\u0764\5 \21\2\u0763\u0762\3"+
		"\2\2\2\u0763\u0764\3\2\2\2\u0764\u0765\3\2\2\2\u0765\u0766\7@\2\2\u0766"+
		"\u00c5\3\2\2\2\u0767\u0769\7\u00b3\2\2\u0768\u076a\7\u00e8\2\2\u0769\u0768"+
		"\3\2\2\2\u0769\u076a\3\2\2\2\u076a\u076b\3\2\2\2\u076b\u076d\7\u00ca\2"+
		"\2\u076c\u076e\7\u00e8\2\2\u076d\u076c\3\2\2\2\u076d\u076e\3\2\2\2\u076e"+
		"\u076f\3\2\2\2\u076f\u0770\5\u00d4k\2\u0770\u00c7\3\2\2\2\u0771\u0772"+
		"\5\u0120\u0091\2\u0772\u0773\7\u00e8\2\2\u0773\u0775\3\2\2\2\u0774\u0771"+
		"\3\2\2\2\u0774\u0775\3\2\2\2\u0775\u0776\3\2\2\2\u0776\u0777\7\u00b6\2"+
		"\2\u0777\u0778\7\u00e8\2\2\u0778\u0779\5\u0106\u0084\2\u0779\u077d\5\u012a"+
		"\u0096\2\u077a\u077c\5\u00caf\2\u077b\u077a\3\2\2\2\u077c\u077f\3\2\2"+
		"\2\u077d\u077b\3\2\2\2\u077d\u077e\3\2\2\2\u077e\u0780\3\2\2\2\u077f\u077d"+
		"\3\2\2\2\u0780\u0781\7A\2\2\u0781\u00c9\3\2\2\2\u0782\u0791\5\u0106\u0084"+
		"\2\u0783\u0785\7\u00e8\2\2\u0784\u0783\3\2\2\2\u0784\u0785\3\2\2\2\u0785"+
		"\u0786\3\2\2\2\u0786\u078b\7\u00ce\2\2\u0787\u0789\7\u00e8\2\2\u0788\u0787"+
		"\3\2\2\2\u0788\u0789\3\2\2\2\u0789\u078a\3\2\2\2\u078a\u078c\5\u0102\u0082"+
		"\2\u078b\u0788\3\2\2\2\u078b\u078c\3\2\2\2\u078c\u078e\3\2\2\2\u078d\u078f"+
		"\7\u00e8\2\2\u078e\u078d\3\2\2\2\u078e\u078f\3\2\2\2\u078f\u0790\3\2\2"+
		"\2\u0790\u0792\7\u00d7\2\2\u0791\u0784\3\2\2\2\u0791\u0792\3\2\2\2\u0792"+
		"\u0793\3\2\2\2\u0793\u0794\7\u00e8\2\2\u0794\u0795\5\u0108\u0085\2\u0795"+
		"\u0796\5\u012a\u0096\2\u0796\u00cb\3\2\2\2\u0797\u0798\7\u00b7\2\2\u0798"+
		"\u0799\7\u00e8\2\2\u0799\u079a\5\u00d4k\2\u079a\u079b\7\u00e8\2\2\u079b"+
		"\u079c\7^\2\2\u079c\u079d\7\u00e8\2\2\u079d\u079e\5\u011c\u008f\2\u079e"+
		"\u00cd\3\2\2\2\u079f\u07a0\7\u00b8\2\2\u07a0\u07a1\7\u00e8\2\2\u07a1\u07a2"+
		"\5\u00d4k\2\u07a2\u00cf\3\2\2\2\u07a3\u07a4\7\u00b9\2\2\u07a4\u07a5\7"+
		"\u00e8\2\2\u07a5\u07b4\5\u00e4s\2\u07a6\u07a8\7\u00e8\2\2\u07a7\u07a6"+
		"\3\2\2\2\u07a7\u07a8\3\2\2\2\u07a8\u07a9\3\2\2\2\u07a9\u07ab\7\3\2\2\u07aa"+
		"\u07ac\7\u00e8\2\2\u07ab\u07aa\3\2\2\2\u07ab\u07ac\3\2\2\2\u07ac\u07ad"+
		"\3\2\2\2\u07ad\u07b2\5\u00d4k\2\u07ae\u07af\7\u00e8\2\2\u07af\u07b0\7"+
		"\u00b4\2\2\u07b0\u07b1\7\u00e8\2\2\u07b1\u07b3\5\u00d4k\2\u07b2\u07ae"+
		"\3\2\2\2\u07b2\u07b3\3\2\2\2\u07b3\u07b5\3\2\2\2\u07b4\u07a7\3\2\2\2\u07b4"+
		"\u07b5\3\2\2\2\u07b5\u00d1\3\2\2\2\u07b6\u07b7\bj\1\2\u07b7\u07d0\5\u011a"+
		"\u008e\2\u07b8\u07bd\5\u0106\u0084\2\u07b9\u07ba\7\5\2\2\u07ba\u07bc\5"+
		"\u0106\u0084\2\u07bb\u07b9\3\2\2\2\u07bc\u07bf\3\2\2\2\u07bd\u07bb\3\2"+
		"\2\2\u07bd\u07be\3\2\2\2\u07be\u07d0\3\2\2\2\u07bf\u07bd\3\2\2\2\u07c0"+
		"\u07c2\7\u00d0\2\2\u07c1\u07c3\7\u00e8\2\2\u07c2\u07c1\3\2\2\2\u07c2\u07c3"+
		"\3\2\2\2\u07c3\u07c4\3\2\2\2\u07c4\u07d0\5\u00d2j\27\u07c5\u07c7\7\u00d4"+
		"\2\2\u07c6\u07c8\7\u00e8\2\2\u07c7\u07c6\3\2\2\2\u07c7\u07c8\3\2\2\2\u07c8"+
		"\u07c9\3\2\2\2\u07c9\u07d0\5\u00d2j\26\u07ca\u07cc\7z\2\2\u07cb\u07cd"+
		"\7\u00e8\2\2\u07cc\u07cb\3\2\2\2\u07cc\u07cd\3\2\2\2\u07cd\u07ce\3\2\2"+
		"\2\u07ce\u07d0\5\u00d2j\b\u07cf\u07b6\3\2\2\2\u07cf\u07b8\3\2\2\2\u07cf"+
		"\u07c0\3\2\2\2\u07cf\u07c5\3\2\2\2\u07cf\u07ca\3\2\2\2\u07d0\u087e\3\2"+
		"\2\2\u07d1\u07d3\f\30\2\2\u07d2\u07d4\7\u00e8\2\2\u07d3\u07d2\3\2\2\2"+
		"\u07d3\u07d4\3\2\2\2\u07d4\u07d5\3\2\2\2\u07d5\u07d7\7\u00d6\2\2\u07d6"+
		"\u07d8\7\u00e8\2\2\u07d7\u07d6\3\2\2\2\u07d7\u07d8\3\2\2\2\u07d8\u07d9"+
		"\3\2\2\2\u07d9\u087d\5\u00d2j\31\u07da\u07dc\f\25\2\2\u07db\u07dd\7\u00e8"+
		"\2\2\u07dc\u07db\3\2\2\2\u07dc\u07dd\3\2\2\2\u07dd\u07de\3\2\2\2\u07de"+
		"\u07e0\7\u00d2\2\2\u07df\u07e1\7\u00e8\2\2\u07e0\u07df\3\2\2\2\u07e0\u07e1"+
		"\3\2\2\2\u07e1\u07e2\3\2\2\2\u07e2\u087d\5\u00d2j\26\u07e3\u07e5\f\24"+
		"\2\2\u07e4\u07e6\7\u00e8\2\2\u07e5\u07e4\3\2\2\2\u07e5\u07e6\3\2\2\2\u07e6"+
		"\u07e7\3\2\2\2\u07e7\u07e9\7\u00c9\2\2\u07e8\u07ea\7\u00e8\2\2\u07e9\u07e8"+
		"\3\2\2\2\u07e9\u07ea\3\2\2\2\u07ea\u07eb\3\2\2\2\u07eb\u087d\5\u00d2j"+
		"\25\u07ec\u07ee\f\23\2\2\u07ed\u07ef\7\u00e8\2\2\u07ee\u07ed\3\2\2\2\u07ee"+
		"\u07ef\3\2\2\2\u07ef\u07f0\3\2\2\2\u07f0\u07f2\7v\2\2\u07f1\u07f3\7\u00e8"+
		"\2\2\u07f2\u07f1\3\2\2\2\u07f2\u07f3\3\2\2\2\u07f3\u07f4\3\2\2\2\u07f4"+
		"\u087d\5\u00d2j\24\u07f5\u07f7\f\22\2\2\u07f6\u07f8\7\u00e8\2\2\u07f7"+
		"\u07f6\3\2\2\2\u07f7\u07f8\3\2\2\2\u07f8\u07f9\3\2\2\2\u07f9\u07fb\7\u00d4"+
		"\2\2\u07fa\u07fc\7\u00e8\2\2\u07fb\u07fa\3\2\2\2\u07fb\u07fc\3\2\2\2\u07fc"+
		"\u07fd\3\2\2\2\u07fd\u087d\5\u00d2j\23\u07fe\u0800\f\21\2\2\u07ff\u0801"+
		"\7\u00e8\2\2\u0800\u07ff\3\2\2\2\u0800\u0801\3\2\2\2\u0801\u0802\3\2\2"+
		"\2\u0802\u0804\7\u00d0\2\2\u0803\u0805\7\u00e8\2\2\u0804\u0803\3\2\2\2"+
		"\u0804\u0805\3\2\2\2\u0805\u0806\3\2\2\2\u0806\u087d\5\u00d2j\22\u0807"+
		"\u0809\f\20\2\2\u0808\u080a\7\u00e8\2\2\u0809\u0808\3\2\2\2\u0809\u080a"+
		"\3\2\2\2\u080a\u080b\3\2\2\2\u080b\u080d\7\u00c7\2\2\u080c\u080e\7\u00e8"+
		"\2\2\u080d\u080c\3\2\2\2\u080d\u080e\3\2\2\2\u080e\u080f\3\2\2\2\u080f"+
		"\u087d\5\u00d2j\21\u0810\u0812\f\17\2\2\u0811\u0813\7\u00e8\2\2\u0812"+
		"\u0811\3\2\2\2\u0812\u0813\3\2\2\2\u0813\u0814\3\2\2\2\u0814\u0816\7h"+
		"\2\2\u0815\u0817\7\u00e8\2\2\u0816\u0815\3\2\2\2\u0816\u0817\3\2\2\2\u0817"+
		"\u0818\3\2\2\2\u0818\u087d\5\u00d2j\20\u0819\u081b\f\16\2\2\u081a\u081c"+
		"\7\u00e8\2\2\u081b\u081a\3\2\2\2\u081b\u081c\3\2\2\2\u081c\u081d\3\2\2"+
		"\2\u081d\u081f\7\u00cb\2\2\u081e\u0820\7\u00e8\2\2\u081f\u081e\3\2\2\2"+
		"\u081f\u0820\3\2\2\2\u0820\u0821\3\2\2\2\u0821\u087d\5\u00d2j\17\u0822"+
		"\u0824\f\r\2\2\u0823\u0825\7\u00e8\2\2\u0824\u0823\3\2\2\2\u0824\u0825"+
		"\3\2\2\2\u0825\u0826\3\2\2\2\u0826\u0828\7\u00cd\2\2\u0827\u0829\7\u00e8"+
		"\2\2\u0828\u0827\3\2\2\2\u0828\u0829\3\2\2\2\u0829\u082a\3\2\2\2\u082a"+
		"\u087d\5\u00d2j\16\u082b\u082d\f\f\2\2\u082c\u082e\7\u00e8\2\2\u082d\u082c"+
		"\3\2\2\2\u082d\u082e\3\2\2\2\u082e\u082f\3\2\2\2\u082f\u0831\7\u00cc\2"+
		"\2\u0830\u0832\7\u00e8\2\2\u0831\u0830\3\2\2\2\u0831\u0832\3\2\2\2\u0832"+
		"\u0833\3\2\2\2\u0833\u087d\5\u00d2j\r\u0834\u0836\f\13\2\2\u0835\u0837"+
		"\7\u00e8\2\2\u0836\u0835\3\2\2\2\u0836\u0837\3\2\2\2\u0837\u0838\3\2\2"+
		"\2\u0838\u083a\7\u00cf\2\2\u0839\u083b\7\u00e8\2\2\u083a\u0839\3\2\2\2"+
		"\u083a\u083b\3\2\2\2\u083b\u083c\3\2\2\2\u083c\u087d\5\u00d2j\f\u083d"+
		"\u083f\f\n\2\2\u083e\u0840\7\u00e8\2\2\u083f\u083e\3\2\2\2\u083f\u0840"+
		"\3\2\2\2\u0840\u0841\3\2\2\2\u0841\u0843\7\u00d3\2\2\u0842\u0844\7\u00e8"+
		"\2\2\u0843\u0842\3\2\2\2\u0843\u0844\3\2\2\2\u0844\u0845\3\2\2\2\u0845"+
		"\u087d\5\u00d2j\13\u0846\u0848\f\t\2\2\u0847\u0849\7\u00e8\2\2\u0848\u0847"+
		"\3\2\2\2\u0848\u0849\3\2\2\2\u0849\u084a\3\2\2\2\u084a\u084c\7\u00ca\2"+
		"\2\u084b\u084d\7\u00e8\2\2\u084c\u084b\3\2\2\2\u084c\u084d\3\2\2\2\u084d"+
		"\u084e\3\2\2\2\u084e\u087d\5\u00d2j\n\u084f\u0851\f\7\2\2\u0850\u0852"+
		"\7\u00e8\2\2\u0851\u0850\3\2\2\2\u0851\u0852\3\2\2\2\u0852\u0853\3\2\2"+
		"\2\u0853\u0855\7\16\2\2\u0854\u0856\7\u00e8\2\2\u0855\u0854\3\2\2\2\u0855"+
		"\u0856\3\2\2\2\u0856\u0857\3\2\2\2\u0857\u087d\5\u00d2j\b\u0858\u085a"+
		"\f\6\2\2\u0859\u085b\7\u00e8\2\2\u085a\u0859\3\2\2\2\u085a\u085b\3\2\2"+
		"\2\u085b\u085c\3\2\2\2\u085c\u085e\7\u0087\2\2\u085d\u085f\7\u00e8\2\2"+
		"\u085e\u085d\3\2\2\2\u085e\u085f\3\2\2\2\u085f\u0860\3\2\2\2\u0860\u087d"+
		"\5\u00d2j\7\u0861\u0863\f\5\2\2\u0862\u0864\7\u00e8\2\2\u0863\u0862\3"+
		"\2\2\2\u0863\u0864\3\2\2\2\u0864\u0865\3\2\2\2\u0865\u0867\7\u00c6\2\2"+
		"\u0866\u0868\7\u00e8\2\2\u0867\u0866\3\2\2\2\u0867\u0868\3\2\2\2\u0868"+
		"\u0869\3\2\2\2\u0869\u087d\5\u00d2j\6\u086a\u086c\f\4\2\2\u086b\u086d"+
		"\7\u00e8\2\2\u086c\u086b\3\2\2\2\u086c\u086d\3\2\2\2\u086d\u086e\3\2\2"+
		"\2\u086e\u0870\7E\2\2\u086f\u0871\7\u00e8\2\2\u0870\u086f\3\2\2\2\u0870"+
		"\u0871\3\2\2\2\u0871\u0872\3\2\2\2\u0872\u087d\5\u00d2j\5\u0873\u0875"+
		"\f\3\2\2\u0874\u0876\7\u00e8\2\2\u0875\u0874\3\2\2\2\u0875\u0876\3\2\2"+
		"\2\u0876\u0877\3\2\2\2\u0877\u0879\7Z\2\2\u0878\u087a\7\u00e8\2\2\u0879"+
		"\u0878\3\2\2\2\u0879\u087a\3\2\2\2\u087a\u087b\3\2\2\2\u087b\u087d\5\u00d2"+
		"j\4\u087c\u07d1\3\2\2\2\u087c\u07da\3\2\2\2\u087c\u07e3\3\2\2\2\u087c"+
		"\u07ec\3\2\2\2\u087c\u07f5\3\2\2\2\u087c\u07fe\3\2\2\2\u087c\u0807\3\2"+
		"\2\2\u087c\u0810\3\2\2\2\u087c\u0819\3\2\2\2\u087c\u0822\3\2\2\2\u087c"+
		"\u082b\3\2\2\2\u087c\u0834\3\2\2\2\u087c\u083d\3\2\2\2\u087c\u0846\3\2"+
		"\2\2\u087c\u084f\3\2\2\2\u087c\u0858\3\2\2\2\u087c\u0861\3\2\2\2\u087c"+
		"\u086a\3\2\2\2\u087c\u0873\3\2\2\2\u087d\u0880\3\2\2\2\u087e\u087c\3\2"+
		"\2\2\u087e\u087f\3\2\2\2\u087f\u00d3\3\2\2\2\u0880\u087e\3\2\2\2\u0881"+
		"\u0882\bk\1\2\u0882\u08b3\5\u011a\u008e\2\u0883\u08b3\5\u00eav\2\u0884"+
		"\u0886\7\u00ce\2\2\u0885\u0887\7\u00e8\2\2\u0886\u0885\3\2\2\2\u0886\u0887"+
		"\3\2\2\2\u0887\u0888\3\2\2\2\u0888\u0893\5\u00d4k\2\u0889\u088b\7\u00e8"+
		"\2\2\u088a\u0889\3\2\2\2\u088a\u088b\3\2\2\2\u088b\u088c\3\2\2\2\u088c"+
		"\u088e\7\3\2\2\u088d\u088f\7\u00e8\2\2\u088e\u088d\3\2\2\2\u088e\u088f"+
		"\3\2\2\2\u088f\u0890\3\2\2\2\u0890\u0892\5\u00d4k\2\u0891\u088a\3\2\2"+
		"\2\u0892\u0895\3\2\2\2\u0893\u0891\3\2\2\2\u0893\u0894\3\2\2\2\u0894\u0896"+
		"\3\2\2\2\u0895\u0893\3\2\2\2\u0896\u0897\7\u00d7\2\2\u0897\u08b3\3\2\2"+
		"\2\u0898\u089a\7y\2\2\u0899\u089b\7\u00e8\2\2\u089a\u0899\3\2\2\2\u089a"+
		"\u089b\3\2\2\2\u089b\u089c\3\2\2\2\u089c\u08b3\5\u0112\u008a\2\u089d\u08b3"+
		"\5\u00ccg\2\u089e\u08a0\7\f\2\2\u089f\u08a1\7\u00e8";
	private static final String _serializedATNSegment1 =
		"\2\2\u08a0\u089f\3\2\2\2\u08a0\u08a1\3\2\2\2\u08a1\u08a2\3\2\2\2\u08a2"+
		"\u08b3\5\u00d4k\32\u08a3\u08a5\7\u00d0\2\2\u08a4\u08a6\7\u00e8\2\2\u08a5"+
		"\u08a4\3\2\2\2\u08a5\u08a6\3\2\2\2\u08a6\u08a7\3\2\2\2\u08a7\u08b3\5\u00d4"+
		"k\30\u08a8\u08aa\7\u00d4\2\2\u08a9\u08ab\7\u00e8\2\2\u08aa\u08a9\3\2\2"+
		"\2\u08aa\u08ab\3\2\2\2\u08ab\u08ac\3\2\2\2\u08ac\u08b3\5\u00d4k\27\u08ad"+
		"\u08af\7z\2\2\u08ae\u08b0\7\u00e8\2\2\u08af\u08ae\3\2\2\2\u08af\u08b0"+
		"\3\2\2\2\u08b0\u08b1\3\2\2\2\u08b1\u08b3\5\u00d4k\b\u08b2\u0881\3\2\2"+
		"\2\u08b2\u0883\3\2\2\2\u08b2\u0884\3\2\2\2\u08b2\u0898\3\2\2\2\u08b2\u089d"+
		"\3\2\2\2\u08b2\u089e\3\2\2\2\u08b2\u08a3\3\2\2\2\u08b2\u08a8\3\2\2\2\u08b2"+
		"\u08ad\3\2\2\2\u08b3\u096a\3\2\2\2\u08b4\u08b6\f\31\2\2\u08b5\u08b7\7"+
		"\u00e8\2\2\u08b6\u08b5\3\2\2\2\u08b6\u08b7\3\2\2\2\u08b7\u08b8\3\2\2\2"+
		"\u08b8\u08ba\7\u00d6\2\2\u08b9\u08bb\7\u00e8\2\2\u08ba\u08b9\3\2\2\2\u08ba"+
		"\u08bb\3\2\2\2\u08bb\u08bc\3\2\2\2\u08bc\u0969\5\u00d4k\32\u08bd\u08bf"+
		"\f\26\2\2\u08be\u08c0\7\u00e8\2\2\u08bf\u08be\3\2\2\2\u08bf\u08c0\3\2"+
		"\2\2\u08c0\u08c1\3\2\2\2\u08c1\u08c3\7\u00d2\2\2\u08c2\u08c4\7\u00e8\2"+
		"\2\u08c3\u08c2\3\2\2\2\u08c3\u08c4\3\2\2\2\u08c4\u08c5\3\2\2\2\u08c5\u0969"+
		"\5\u00d4k\27\u08c6\u08c8\f\25\2\2\u08c7\u08c9\7\u00e8\2\2\u08c8\u08c7"+
		"\3\2\2\2\u08c8\u08c9\3\2\2\2\u08c9\u08ca\3\2\2\2\u08ca\u08cc\7\u00c9\2"+
		"\2\u08cb\u08cd\7\u00e8\2\2\u08cc\u08cb\3\2\2\2\u08cc\u08cd\3\2\2\2\u08cd"+
		"\u08ce\3\2\2\2\u08ce\u0969\5\u00d4k\26\u08cf\u08d1\f\24\2\2\u08d0\u08d2"+
		"\7\u00e8\2\2\u08d1\u08d0\3\2\2\2\u08d1\u08d2\3\2\2\2\u08d2\u08d3\3\2\2"+
		"\2\u08d3\u08d5\7v\2\2\u08d4\u08d6\7\u00e8\2\2\u08d5\u08d4\3\2\2\2\u08d5"+
		"\u08d6\3\2\2\2\u08d6\u08d7\3\2\2\2\u08d7\u0969\5\u00d4k\25\u08d8\u08da"+
		"\f\23\2\2\u08d9\u08db\7\u00e8\2\2\u08da\u08d9\3\2\2\2\u08da\u08db\3\2"+
		"\2\2\u08db\u08dc\3\2\2\2\u08dc\u08de\7\u00d4\2\2\u08dd\u08df\7\u00e8\2"+
		"\2\u08de\u08dd\3\2\2\2\u08de\u08df\3\2\2\2\u08df\u08e0\3\2\2\2\u08e0\u0969"+
		"\5\u00d4k\24\u08e1\u08e3\f\22\2\2\u08e2\u08e4\7\u00e8\2\2\u08e3\u08e2"+
		"\3\2\2\2\u08e3\u08e4\3\2\2\2\u08e4\u08e5\3\2\2\2\u08e5\u08e7\7\u00d0\2"+
		"\2\u08e6\u08e8\7\u00e8\2\2\u08e7\u08e6\3\2\2\2\u08e7\u08e8\3\2\2\2\u08e8"+
		"\u08e9\3\2\2\2\u08e9\u0969\5\u00d4k\23\u08ea\u08ec\f\21\2\2\u08eb\u08ed"+
		"\7\u00e8\2\2\u08ec\u08eb\3\2\2\2\u08ec\u08ed\3\2\2\2\u08ed\u08ee\3\2\2"+
		"\2\u08ee\u08f0\7\u00c7\2\2\u08ef\u08f1\7\u00e8\2\2\u08f0\u08ef\3\2\2\2"+
		"\u08f0\u08f1\3\2\2\2\u08f1\u08f2\3\2\2\2\u08f2\u0969\5\u00d4k\22\u08f3"+
		"\u08f5\f\20\2\2\u08f4\u08f6\7\u00e8\2\2\u08f5\u08f4\3\2\2\2\u08f5\u08f6"+
		"\3\2\2\2\u08f6\u08f7\3\2\2\2\u08f7\u08f9\7h\2\2\u08f8\u08fa\7\u00e8\2"+
		"\2\u08f9\u08f8\3\2\2\2\u08f9\u08fa\3\2\2\2\u08fa\u08fb\3\2\2\2\u08fb\u0969"+
		"\5\u00d4k\21\u08fc\u08fe\f\17\2\2\u08fd\u08ff\7\u00e8\2\2\u08fe\u08fd"+
		"\3\2\2\2\u08fe\u08ff\3\2\2\2\u08ff\u0900\3\2\2\2\u0900\u0902\7^\2\2\u0901"+
		"\u0903\7\u00e8\2\2\u0902\u0901\3\2\2\2\u0902\u0903\3\2\2\2\u0903\u0904"+
		"\3\2\2\2\u0904\u0969\5\u00d4k\20\u0905\u0907\f\16\2\2\u0906\u0908\7\u00e8"+
		"\2\2\u0907\u0906\3\2\2\2\u0907\u0908\3\2\2\2\u0908\u0909\3\2\2\2\u0909"+
		"\u090b\7\u00cb\2\2\u090a\u090c\7\u00e8\2\2\u090b\u090a\3\2\2\2\u090b\u090c"+
		"\3\2\2\2\u090c\u090d\3\2\2\2\u090d\u0969\5\u00d4k\17\u090e\u0910\f\r\2"+
		"\2\u090f\u0911\7\u00e8\2\2\u0910\u090f\3\2\2\2\u0910\u0911\3\2\2\2\u0911"+
		"\u0912\3\2\2\2\u0912\u0914\7\u00cd\2\2\u0913\u0915\7\u00e8\2\2\u0914\u0913"+
		"\3\2\2\2\u0914\u0915\3\2\2\2\u0915\u0916\3\2\2\2\u0916\u0969\5\u00d4k"+
		"\16\u0917\u0919\f\f\2\2\u0918\u091a\7\u00e8\2\2\u0919\u0918\3\2\2\2\u0919"+
		"\u091a\3\2\2\2\u091a\u091b\3\2\2\2\u091b\u091d\7\u00cc\2\2\u091c\u091e"+
		"\7\u00e8\2\2\u091d\u091c\3\2\2\2\u091d\u091e\3\2\2\2\u091e\u091f\3\2\2"+
		"\2\u091f\u0969\5\u00d4k\r\u0920\u0922\f\13\2\2\u0921\u0923\7\u00e8\2\2"+
		"\u0922\u0921\3\2\2\2\u0922\u0923\3\2\2\2\u0923\u0924\3\2\2\2\u0924\u0926"+
		"\7\u00cf\2\2\u0925\u0927\7\u00e8\2\2\u0926\u0925\3\2\2\2\u0926\u0927\3"+
		"\2\2\2\u0927\u0928\3\2\2\2\u0928\u0969\5\u00d4k\f\u0929\u092b\f\n\2\2"+
		"\u092a\u092c\7\u00e8\2\2\u092b\u092a\3\2\2\2\u092b\u092c\3\2\2\2\u092c"+
		"\u092d\3\2\2\2\u092d\u092f\7\u00d3\2\2\u092e\u0930\7\u00e8\2\2\u092f\u092e"+
		"\3\2\2\2\u092f\u0930\3\2\2\2\u0930\u0931\3\2\2\2\u0931\u0969\5\u00d4k"+
		"\13\u0932\u0934\f\t\2\2\u0933\u0935\7\u00e8\2\2\u0934\u0933\3\2\2\2\u0934"+
		"\u0935\3\2\2\2\u0935\u0936\3\2\2\2\u0936\u0938\7\u00ca\2\2\u0937\u0939"+
		"\7\u00e8\2\2\u0938\u0937\3\2\2\2\u0938\u0939\3\2\2\2\u0939\u093a\3\2\2"+
		"\2\u093a\u0969\5\u00d4k\n\u093b\u093d\f\7\2\2\u093c\u093e\7\u00e8\2\2"+
		"\u093d\u093c\3\2\2\2\u093d\u093e\3\2\2\2\u093e\u093f\3\2\2\2\u093f\u0941"+
		"\7\16\2\2\u0940\u0942\7\u00e8\2\2\u0941\u0940\3\2\2\2\u0941\u0942\3\2"+
		"\2\2\u0942\u0943\3\2\2\2\u0943\u0969\5\u00d4k\b\u0944\u0946\f\6\2\2\u0945"+
		"\u0947\7\u00e8\2\2\u0946\u0945\3\2\2\2\u0946\u0947\3\2\2\2\u0947\u0948"+
		"\3\2\2\2\u0948\u094a\7\u0087\2\2\u0949\u094b\7\u00e8\2\2\u094a\u0949\3"+
		"\2\2\2\u094a\u094b\3\2\2\2\u094b\u094c\3\2\2\2\u094c\u0969\5\u00d4k\7"+
		"\u094d\u094f\f\5\2\2\u094e\u0950\7\u00e8\2\2\u094f\u094e\3\2\2\2\u094f"+
		"\u0950\3\2\2\2\u0950\u0951\3\2\2\2\u0951\u0953\7\u00c6\2\2\u0952\u0954"+
		"\7\u00e8\2\2\u0953\u0952\3\2\2\2\u0953\u0954\3\2\2\2\u0954\u0955\3\2\2"+
		"\2\u0955\u0969\5\u00d4k\6\u0956\u0958\f\4\2\2\u0957\u0959\7\u00e8\2\2"+
		"\u0958\u0957\3\2\2\2\u0958\u0959\3\2\2\2\u0959\u095a\3\2\2\2\u095a\u095c"+
		"\7E\2\2\u095b\u095d\7\u00e8\2\2\u095c\u095b\3\2\2\2\u095c\u095d\3\2\2"+
		"\2\u095d\u095e\3\2\2\2\u095e\u0969\5\u00d4k\5\u095f\u0961\f\3\2\2\u0960"+
		"\u0962\7\u00e8\2\2\u0961\u0960\3\2\2\2\u0961\u0962\3\2\2\2\u0962\u0963"+
		"\3\2\2\2\u0963\u0965\7Z\2\2\u0964\u0966\7\u00e8\2\2\u0965\u0964\3\2\2"+
		"\2\u0965\u0966\3\2\2\2\u0966\u0967\3\2\2\2\u0967\u0969\5\u00d4k\4\u0968"+
		"\u08b4\3\2\2\2\u0968\u08bd\3\2\2\2\u0968\u08c6\3\2\2\2\u0968\u08cf\3\2"+
		"\2\2\u0968\u08d8\3\2\2\2\u0968\u08e1\3\2\2\2\u0968\u08ea\3\2\2\2\u0968"+
		"\u08f3\3\2\2\2\u0968\u08fc\3\2\2\2\u0968\u0905\3\2\2\2\u0968\u090e\3\2"+
		"\2\2\u0968\u0917\3\2\2\2\u0968\u0920\3\2\2\2\u0968\u0929\3\2\2\2\u0968"+
		"\u0932\3\2\2\2\u0968\u093b\3\2\2\2\u0968\u0944\3\2\2\2\u0968\u094d\3\2"+
		"\2\2\u0968\u0956\3\2\2\2\u0968\u095f\3\2\2\2\u0969\u096c\3\2\2\2\u096a"+
		"\u0968\3\2\2\2\u096a\u096b\3\2\2\2\u096b\u00d5\3\2\2\2\u096c\u096a\3\2"+
		"\2\2\u096d\u0971\7\64\2\2\u096e\u0971\7\u00ab\2\2\u096f\u0971\5\u0120"+
		"\u0091\2\u0970\u096d\3\2\2\2\u0970\u096e\3\2\2\2\u0970\u096f\3\2\2\2\u0971"+
		"\u0972\3\2\2\2\u0972\u0975\7\u00e8\2\2\u0973\u0974\7\u00c4\2\2\u0974\u0976"+
		"\7\u00e8\2\2\u0975\u0973\3\2\2\2\u0975\u0976\3\2\2\2\u0976\u0977\3\2\2"+
		"\2\u0977\u0978\5\u00d8m\2\u0978\u00d7\3\2\2\2\u0979\u0984\5\u00dan\2\u097a"+
		"\u097c\7\u00e8\2\2\u097b\u097a\3\2\2\2\u097b\u097c\3\2\2\2\u097c\u097d"+
		"\3\2\2\2\u097d\u097f\7\3\2\2\u097e\u0980\7\u00e8\2\2\u097f\u097e\3\2\2"+
		"\2\u097f\u0980\3\2\2\2\u0980\u0981\3\2\2\2\u0981\u0983\5\u00dan\2\u0982"+
		"\u097b\3\2\2\2\u0983\u0986\3\2\2\2\u0984\u0982\3\2\2\2\u0984\u0985\3\2"+
		"\2\2\u0985\u00d9\3\2\2\2\u0986\u0984\3\2\2\2\u0987\u0999\5\u0106\u0084"+
		"\2\u0988\u098a\7\u00e8\2\2\u0989\u0988\3\2\2\2\u0989\u098a\3\2\2\2\u098a"+
		"\u098b\3\2\2\2\u098b\u098d\7\u00ce\2\2\u098c\u098e\7\u00e8\2\2\u098d\u098c"+
		"\3\2\2\2\u098d\u098e\3\2\2\2\u098e\u0993\3\2\2\2\u098f\u0991\5\u0102\u0082"+
		"\2\u0990\u0992\7\u00e8\2\2\u0991\u0990\3\2\2\2\u0991\u0992\3\2\2\2\u0992"+
		"\u0994\3\2\2\2\u0993\u098f\3\2\2\2\u0993\u0994\3\2\2\2\u0994\u0995\3\2"+
		"\2\2\u0995\u0997\7\u00d7\2\2\u0996\u0998\7\u00e8\2\2\u0997\u0996\3\2\2"+
		"\2\u0997\u0998\3\2\2\2\u0998\u099a\3\2\2\2\u0999\u0989\3\2\2\2\u0999\u099a"+
		"\3\2\2\2\u099a\u099c\3\2\2\2\u099b\u099d\5\u011e\u0090\2\u099c\u099b\3"+
		"\2\2\2\u099c\u099d\3\2\2\2\u099d\u09a0\3\2\2\2\u099e\u099f\7\u00e8\2\2"+
		"\u099f\u09a1\5\u0108\u0085\2\u09a0\u099e\3\2\2\2\u09a0\u09a1\3\2\2\2\u09a1"+
		"\u00db\3\2\2\2\u09a2\u09a3\7\u00c0\2\2\u09a3\u09a4\7\u00e8\2\2\u09a4\u09a5"+
		"\5\u00d4k\2\u09a5\u09a7\5\u012a\u0096\2\u09a6\u09a8\5 \21\2\u09a7\u09a6"+
		"\3\2\2\2\u09a7\u09a8\3\2\2\2\u09a8\u09a9\3\2\2\2\u09a9\u09aa\7\u00bf\2"+
		"\2\u09aa\u00dd\3\2\2\2\u09ab\u09ac\7\u00c1\2\2\u09ac\u09ad\7\u00e8\2\2"+
		"\u09ad\u09af\5\u00e4s\2\u09ae\u09b0\7\u00e8\2\2\u09af\u09ae\3\2\2\2\u09af"+
		"\u09b0\3\2\2\2\u09b0\u09b1\3\2\2\2\u09b1\u09b3\7\3\2\2\u09b2\u09b4\7\u00e8"+
		"\2\2\u09b3\u09b2\3\2\2\2\u09b3\u09b4\3\2\2\2\u09b4\u09b5\3\2\2\2\u09b5"+
		"\u09b6\5\u00d4k\2\u09b6\u00df\3\2\2\2\u09b7\u09b8\7\u00c2\2\2\u09b8\u09bd"+
		"\7\u00e8\2\2\u09b9\u09be\5\u00eav\2\u09ba\u09bb\7y\2\2\u09bb\u09bc\7\u00e8"+
		"\2\2\u09bc\u09be\5\u011c\u008f\2\u09bd\u09b9\3\2\2\2\u09bd\u09ba\3\2\2"+
		"\2\u09be\u09bf\3\2\2\2\u09bf\u09c1\5\u012a\u0096\2\u09c0\u09c2\5 \21\2"+
		"\u09c1\u09c0\3\2\2\2\u09c1\u09c2\3\2\2\2\u09c2\u09c3\3\2\2\2\u09c3\u09c4"+
		"\7B\2\2\u09c4\u00e1\3\2\2\2\u09c5\u09c6\7\u00c5\2\2\u09c6\u09c7\7\u00e8"+
		"\2\2\u09c7\u09c9\5\u00e4s\2\u09c8\u09ca\7\u00e8\2\2\u09c9\u09c8\3\2\2"+
		"\2\u09c9\u09ca\3\2\2\2\u09ca\u09cb\3\2\2\2\u09cb\u09d0\7\3\2\2\u09cc\u09ce"+
		"\7\u00e8\2\2\u09cd\u09cc\3\2\2\2\u09cd\u09ce\3\2\2\2\u09ce\u09cf\3\2\2"+
		"\2\u09cf\u09d1\5\u008eH\2\u09d0\u09cd\3\2\2\2\u09d0\u09d1\3\2\2\2\u09d1"+
		"\u00e3\3\2\2\2\u09d2\u09d4\7\6\2\2\u09d3\u09d2\3\2\2\2\u09d3\u09d4\3\2"+
		"\2\2\u09d4\u09d5\3\2\2\2\u09d5\u09d6\5\u00d4k\2\u09d6\u00e5\3\2\2\2\u09d7"+
		"\u09d8\7\34\2\2\u09d8\u09d9\7\u00e8\2\2\u09d9\u09da\5\u00eav\2\u09da\u00e7"+
		"\3\2\2\2\u09db\u09de\5\u00eav\2\u09dc\u09dd\7\u00e8\2\2\u09dd\u09df\5"+
		"\u00f4{\2\u09de\u09dc\3\2\2\2\u09de\u09df\3\2\2\2\u09df\u00e9\3\2\2\2"+
		"\u09e0\u09e4\5\u00ecw\2\u09e1\u09e3\5\u00eex\2\u09e2\u09e1\3\2\2\2\u09e3"+
		"\u09e6\3\2\2\2\u09e4\u09e2\3\2\2\2\u09e4\u09e5\3\2\2\2\u09e5\u00eb\3\2"+
		"\2\2\u09e6\u09e4\3\2\2\2\u09e7\u09e9\5\u0106\u0084\2\u09e8\u09ea\5\u011e"+
		"\u0090\2\u09e9\u09e8\3\2\2\2\u09e9\u09ea\3\2\2\2\u09ea\u09ee\3\2\2\2\u09eb"+
		"\u09ee\5\u00f0y\2\u09ec\u09ee\5\u00f2z\2\u09ed\u09e7\3\2\2\2\u09ed\u09eb"+
		"\3\2\2\2\u09ed\u09ec\3\2\2\2\u09ee\u00ed\3\2\2\2\u09ef\u09fd\5\u00f0y"+
		"\2\u09f0\u09fd\5\u00f2z\2\u09f1\u09f3\7\u00ce\2\2\u09f2\u09f4\7\u00e8"+
		"\2\2\u09f3\u09f2\3\2\2\2\u09f3\u09f4\3\2\2\2\u09f4\u09f6\3\2\2\2\u09f5"+
		"\u09f7\5\u00f4{\2\u09f6\u09f5\3\2\2\2\u09f6\u09f7\3\2\2\2\u09f7\u09f9"+
		"\3\2\2\2\u09f8\u09fa\7\u00e8\2\2\u09f9\u09f8\3\2\2\2\u09f9\u09fa\3\2\2"+
		"\2\u09fa\u09fb\3\2\2\2\u09fb\u09fd\7\u00d7\2\2\u09fc\u09ef\3\2\2\2\u09fc"+
		"\u09f0\3\2\2\2\u09fc\u09f1\3\2\2\2\u09fd\u00ef\3\2\2\2\u09fe\u0a00\7\u00e8"+
		"\2\2\u09ff\u09fe\3\2\2\2\u09ff\u0a00\3\2\2\2\u0a00\u0a01\3\2\2\2\u0a01"+
		"\u0a03\7\5\2\2\u0a02\u0a04\7\u00e8\2\2\u0a03\u0a02\3\2\2\2\u0a03\u0a04"+
		"\3\2\2\2\u0a04\u0a05\3\2\2\2\u0a05\u0a06\5\u0106\u0084\2\u0a06\u00f1\3"+
		"\2\2\2\u0a07\u0a09\7\u00e8\2\2\u0a08\u0a07\3\2\2\2\u0a08\u0a09\3\2\2\2"+
		"\u0a09\u0a0a\3\2\2\2\u0a0a\u0a0c\7\7\2\2\u0a0b\u0a0d\7\u00e8\2\2\u0a0c"+
		"\u0a0b\3\2\2\2\u0a0c\u0a0d\3\2\2\2\u0a0d\u0a0e\3\2\2\2\u0a0e\u0a0f\5\u0106"+
		"\u0084\2\u0a0f\u00f3\3\2\2\2\u0a10\u0a12\5\u00f6|\2\u0a11\u0a10\3\2\2"+
		"\2\u0a11\u0a12\3\2\2\2\u0a12\u0a14\3\2\2\2\u0a13\u0a15\7\u00e8\2\2\u0a14"+
		"\u0a13\3\2\2\2\u0a14\u0a15\3\2\2\2\u0a15\u0a16\3\2\2\2\u0a16\u0a18\7\3"+
		"\2\2\u0a17\u0a19\7\u00e8\2\2\u0a18\u0a17\3\2\2\2\u0a18\u0a19\3\2\2\2\u0a19"+
		"\u0a1b\3\2\2\2\u0a1a\u0a11\3\2\2\2\u0a1b\u0a1e\3\2\2\2\u0a1c\u0a1a\3\2"+
		"\2\2\u0a1c\u0a1d\3\2\2\2\u0a1d\u0a1f\3\2\2\2\u0a1e\u0a1c\3\2\2\2\u0a1f"+
		"\u0a20\5\u00f6|\2\u0a20\u00f5\3\2\2\2\u0a21\u0a23\5\u0106\u0084\2\u0a22"+
		"\u0a24\7\u00e8\2\2\u0a23\u0a22\3\2\2\2\u0a23\u0a24\3\2\2\2\u0a24\u0a25"+
		"\3\2\2\2\u0a25\u0a27\7\u00c8\2\2\u0a26\u0a28\7\u00e8\2\2\u0a27\u0a26\3"+
		"\2\2\2\u0a27\u0a28\3\2\2\2\u0a28\u0a2a\3\2\2\2\u0a29\u0a21\3\2\2\2\u0a29"+
		"\u0a2a\3\2\2\2\u0a2a\u0a2b\3\2\2\2\u0a2b\u0a2c\5\u00d4k\2\u0a2c\u00f7"+
		"\3\2\2\2\u0a2d\u0a3f\7\u00ce\2\2\u0a2e\u0a30\7\u00e8\2\2\u0a2f\u0a2e\3"+
		"\2\2\2\u0a2f\u0a30\3\2\2\2\u0a30\u0a31\3\2\2\2\u0a31\u0a3c\5\u00fa~\2"+
		"\u0a32\u0a34\7\u00e8\2\2\u0a33\u0a32\3\2\2\2\u0a33\u0a34\3\2\2\2\u0a34"+
		"\u0a35\3\2\2\2\u0a35\u0a37\7\3\2\2\u0a36\u0a38\7\u00e8\2\2\u0a37\u0a36"+
		"\3\2\2\2\u0a37\u0a38\3\2\2\2\u0a38\u0a39\3\2\2\2\u0a39\u0a3b\5\u00fa~"+
		"\2\u0a3a\u0a33\3\2\2\2\u0a3b\u0a3e\3\2\2\2\u0a3c\u0a3a\3\2\2\2\u0a3c\u0a3d"+
		"\3\2\2\2\u0a3d\u0a40\3\2\2\2\u0a3e\u0a3c\3\2\2\2\u0a3f\u0a2f\3\2\2\2\u0a3f"+
		"\u0a40\3\2\2\2\u0a40\u0a42\3\2\2\2\u0a41\u0a43\7\u00e8\2\2\u0a42\u0a41"+
		"\3\2\2\2\u0a42\u0a43\3\2\2\2\u0a43\u0a44\3\2\2\2\u0a44\u0a45\7\u00d7\2"+
		"\2\u0a45\u00f9\3\2\2\2\u0a46\u0a47\7\u0082\2\2\u0a47\u0a49\7\u00e8\2\2"+
		"\u0a48\u0a46\3\2\2\2\u0a48\u0a49\3\2\2\2\u0a49\u0a4c\3\2\2\2\u0a4a\u0a4b"+
		"\t\r\2\2\u0a4b\u0a4d\7\u00e8\2\2\u0a4c\u0a4a\3\2\2\2\u0a4c\u0a4d\3\2\2"+
		"\2\u0a4d\u0a50\3\2\2\2\u0a4e\u0a4f\7\u0089\2\2\u0a4f\u0a51\7\u00e8\2\2"+
		"\u0a50\u0a4e\3\2\2\2\u0a50\u0a51\3\2\2\2\u0a51\u0a52\3\2\2\2\u0a52\u0a54"+
		"\5\u0106\u0084\2\u0a53\u0a55\5\u011e\u0090\2\u0a54\u0a53\3\2\2\2\u0a54"+
		"\u0a55\3\2\2\2\u0a55\u0a5e\3\2\2\2\u0a56\u0a58\7\u00e8\2\2\u0a57\u0a56"+
		"\3\2\2\2\u0a57\u0a58\3\2\2\2\u0a58\u0a59\3\2\2\2\u0a59\u0a5b\7\u00ce\2"+
		"\2\u0a5a\u0a5c\7\u00e8\2\2\u0a5b\u0a5a\3\2\2\2\u0a5b\u0a5c\3\2\2\2\u0a5c"+
		"\u0a5d\3\2\2\2\u0a5d\u0a5f\7\u00d7\2\2\u0a5e\u0a57\3\2\2\2\u0a5e\u0a5f"+
		"\3\2\2\2\u0a5f\u0a64\3\2\2\2\u0a60\u0a62\7\u00e8\2\2\u0a61\u0a60\3\2\2"+
		"\2\u0a61\u0a62\3\2\2\2\u0a62\u0a63\3\2\2\2\u0a63\u0a65\5\u0108\u0085\2"+
		"\u0a64\u0a61\3\2\2\2\u0a64\u0a65\3\2\2\2\u0a65\u0a6a\3\2\2\2\u0a66\u0a68"+
		"\7\u00e8\2\2\u0a67\u0a66\3\2\2\2\u0a67\u0a68\3\2\2\2\u0a68\u0a69\3\2\2"+
		"\2\u0a69\u0a6b\5\u00fc\177\2\u0a6a\u0a67\3\2\2\2\u0a6a\u0a6b\3\2\2\2\u0a6b"+
		"\u00fb\3\2\2\2\u0a6c\u0a6e\7\u00ca\2\2\u0a6d\u0a6f\7\u00e8\2\2\u0a6e\u0a6d"+
		"\3\2\2\2\u0a6e\u0a6f\3\2\2\2\u0a6f\u0a70\3\2\2\2\u0a70\u0a71\5\u00d2j"+
		"\2\u0a71\u00fd\3\2\2\2\u0a72\u0a7d\5\u0100\u0081\2\u0a73\u0a75\7\u00e8"+
		"\2\2\u0a74\u0a73\3\2\2\2\u0a74\u0a75\3\2\2\2\u0a75\u0a76\3\2\2\2\u0a76"+
		"\u0a78\7\3\2\2\u0a77\u0a79\7\u00e8\2\2\u0a78\u0a77\3\2\2\2\u0a78\u0a79"+
		"\3\2\2\2\u0a79\u0a7a\3\2\2\2\u0a7a\u0a7c\5\u0100\u0081\2\u0a7b\u0a74\3"+
		"\2\2\2\u0a7c\u0a7f\3\2\2\2\u0a7d\u0a7b\3\2\2\2\u0a7d\u0a7e\3\2\2\2\u0a7e"+
		"\u00ff\3\2\2\2\u0a7f\u0a7d\3\2\2\2\u0a80\u0a81\5\u00d4k\2\u0a81\u0a82"+
		"\7\u00e8\2\2\u0a82\u0a83\7\u00b4\2\2\u0a83\u0a84\7\u00e8\2\2\u0a84\u0a86"+
		"\3\2\2\2\u0a85\u0a80\3\2\2\2\u0a85\u0a86\3\2\2\2\u0a86\u0a87\3\2\2\2\u0a87"+
		"\u0a88\5\u00d4k\2\u0a88\u0101\3\2\2\2\u0a89\u0a94\5\u0104\u0083\2\u0a8a"+
		"\u0a8c\7\u00e8\2\2\u0a8b\u0a8a\3\2\2\2\u0a8b\u0a8c\3\2\2\2\u0a8c\u0a8d"+
		"\3\2\2\2\u0a8d\u0a8f\7\3\2\2\u0a8e\u0a90\7\u00e8\2\2\u0a8f\u0a8e\3\2\2"+
		"\2\u0a8f\u0a90\3\2\2\2\u0a90\u0a91\3\2\2\2\u0a91\u0a93\5\u0104\u0083\2"+
		"\u0a92\u0a8b\3\2\2\2\u0a93\u0a96\3\2\2\2\u0a94\u0a92\3\2\2\2\u0a94\u0a95"+
		"\3\2\2\2\u0a95\u0103\3\2\2\2\u0a96\u0a94\3\2\2\2\u0a97\u0a98\5\u00d2j"+
		"\2\u0a98\u0a99\7\u00e8\2\2\u0a99\u0a9a\7\u00b4\2\2\u0a9a\u0a9b\7\u00e8"+
		"\2\2\u0a9b\u0a9d\3\2\2\2\u0a9c\u0a97\3\2\2\2\u0a9c\u0a9d\3\2\2\2\u0a9d"+
		"\u0a9e\3\2\2\2\u0a9e\u0a9f\5\u00d2j\2\u0a9f\u0105\3\2\2\2\u0aa0\u0aa3"+
		"\7\u00e9\2\2\u0aa1\u0aa3\5\u0122\u0092\2\u0aa2\u0aa0\3\2\2\2\u0aa2\u0aa1"+
		"\3\2\2\2\u0aa3\u0aa4\3\2\2\2\u0aa4\u0aa2\3\2\2\2\u0aa4\u0aa5\3\2\2\2\u0aa5"+
		"\u0107\3\2\2\2\u0aa6\u0aa8\7\22\2\2\u0aa7\u0aa9\7\u00e8\2\2\u0aa8\u0aa7"+
		"\3\2\2\2\u0aa8\u0aa9\3\2\2\2\u0aa9\u0aac\3\2\2\2\u0aaa\u0aab\7y\2\2\u0aab"+
		"\u0aad\7\u00e8\2\2\u0aac\u0aaa\3\2\2\2\u0aac\u0aad\3\2\2\2\u0aad\u0aae"+
		"\3\2\2\2\u0aae\u0ab3\5\u011c\u008f\2\u0aaf\u0ab1\7\u00e8\2\2\u0ab0\u0aaf"+
		"\3\2\2\2\u0ab0\u0ab1\3\2\2\2\u0ab1\u0ab2\3\2\2\2\u0ab2\u0ab4\5\u0114\u008b"+
		"\2\u0ab3\u0ab0\3\2\2\2\u0ab3\u0ab4\3\2\2\2\u0ab4\u0109\3\2\2\2\u0ab5\u0ab6"+
		"\t\16\2\2\u0ab6\u010b\3\2\2\2\u0ab7\u0abc\7\u00e9\2\2\u0ab8\u0abb\5\u0122"+
		"\u0092\2\u0ab9\u0abb\7\u00e9\2\2\u0aba\u0ab8\3\2\2\2\u0aba\u0ab9\3\2\2"+
		"\2\u0abb\u0abe\3\2\2\2\u0abc\u0aba\3\2\2\2\u0abc\u0abd\3\2\2\2\u0abd\u0ac7"+
		"\3\2\2\2\u0abe\u0abc\3\2\2\2\u0abf\u0ac2\5\u0122\u0092\2\u0ac0\u0ac3\5"+
		"\u0122\u0092\2\u0ac1\u0ac3\7\u00e9\2\2\u0ac2\u0ac0\3\2\2\2\u0ac2\u0ac1"+
		"\3\2\2\2\u0ac3\u0ac4\3\2\2\2\u0ac4\u0ac2\3\2\2\2\u0ac4\u0ac5\3\2\2\2\u0ac5"+
		"\u0ac7\3\2\2\2\u0ac6\u0ab7\3\2\2\2\u0ac6\u0abf\3\2\2\2\u0ac7\u010d\3\2"+
		"\2\2\u0ac8\u0ac9\t\17\2\2\u0ac9\u010f\3\2\2\2\u0aca\u0acc\7\u00ae\2\2"+
		"\u0acb\u0acd\7\u00e8\2\2\u0acc\u0acb\3\2\2\2\u0acc\u0acd\3\2\2\2\u0acd"+
		"\u0ace\3\2\2\2\u0ace\u0ad0\7\u00d2\2\2\u0acf\u0ad1\7\u00e8\2\2\u0ad0\u0acf"+
		"\3\2\2\2\u0ad0\u0ad1\3\2\2\2\u0ad1\u0ad4\3\2\2\2\u0ad2\u0ad5\5\u011a\u008e"+
		"\2\u0ad3\u0ad5\5\u0106\u0084\2\u0ad4\u0ad2\3\2\2\2\u0ad4\u0ad3\3\2\2\2"+
		"\u0ad5\u0111\3\2\2\2\u0ad6\u0adb\5\u0106\u0084\2\u0ad7\u0ad8\7\5\2\2\u0ad8"+
		"\u0ada\5\u0106\u0084\2\u0ad9\u0ad7\3\2\2\2\u0ada\u0add\3\2\2\2\u0adb\u0ad9"+
		"\3\2\2\2\u0adb\u0adc\3\2\2\2\u0adc\u0113\3\2\2\2\u0add\u0adb\3\2\2\2\u0ade"+
		"\u0ae0\7\u00d2\2\2\u0adf\u0ae1\7\u00e8\2\2\u0ae0\u0adf\3\2\2\2\u0ae0\u0ae1"+
		"\3\2\2\2\u0ae1\u0ae4\3\2\2\2\u0ae2\u0ae5\7\u00de\2\2\u0ae3\u0ae5\5\u0106"+
		"\u0084\2\u0ae4\u0ae2\3\2\2\2\u0ae4\u0ae3\3\2\2\2\u0ae5\u0115\3\2\2\2\u0ae6"+
		"\u0aef\5\u010c\u0087\2\u0ae7\u0ae9\7\u00e8\2\2\u0ae8\u0ae7\3\2\2\2\u0ae8"+
		"\u0ae9\3\2\2\2\u0ae9\u0aea\3\2\2\2\u0aea\u0aec\7\u00d0\2\2\u0aeb\u0aed"+
		"\7\u00e8\2\2\u0aec\u0aeb\3\2\2\2\u0aec\u0aed\3\2\2\2\u0aed\u0aee\3\2\2"+
		"\2\u0aee\u0af0\5\u010c\u0087\2\u0aef\u0ae8\3\2\2\2\u0aef\u0af0\3\2\2\2"+
		"\u0af0\u0117\3\2\2\2\u0af1\u0af2\5\u0106\u0084\2\u0af2\u0af3\7\u00e6\2"+
		"\2\u0af3\u0119\3\2\2\2\u0af4\u0af5\t\20\2\2\u0af5\u011b\3\2\2\2\u0af6"+
		"\u0afa\5\u0110\u0089\2\u0af7\u0afa\5\u010a\u0086\2\u0af8\u0afa\5\u0112"+
		"\u008a\2\u0af9\u0af6\3\2\2\2\u0af9\u0af7\3\2\2\2\u0af9\u0af8\3\2\2\2\u0afa"+
		"\u0b03\3\2\2\2\u0afb\u0afd\7\u00e8\2\2\u0afc\u0afb\3\2\2\2\u0afc\u0afd"+
		"\3\2\2\2\u0afd\u0afe\3\2\2\2\u0afe\u0b00\7\u00ce\2\2\u0aff\u0b01\7\u00e8"+
		"\2\2\u0b00\u0aff\3\2\2\2\u0b00\u0b01\3\2\2\2\u0b01\u0b02\3\2\2\2\u0b02"+
		"\u0b04\7\u00d7\2\2\u0b03\u0afc\3\2\2\2\u0b03\u0b04\3\2\2\2\u0b04\u011d"+
		"\3\2\2\2\u0b05\u0b06\t\21\2\2\u0b06\u011f\3\2\2\2\u0b07\u0b08\t\22\2\2"+
		"\u0b08\u0121\3\2\2\2\u0b09\u0b0a\t\23\2\2\u0b0a\u0123\3\2\2\2\u0b0b\u0b0c"+
		"\7\u00e3\2\2\u0b0c\u0125\3\2\2\2\u0b0d\u0b0e\7\u00e4\2\2\u0b0e\u0127\3"+
		"\2\2\2\u0b0f\u0b11\7\u00e8\2\2\u0b10\u0b0f\3\2\2\2\u0b10\u0b11\3\2\2\2"+
		"\u0b11\u0b15\3\2\2\2\u0b12\u0b16\7\u00e2\2\2\u0b13\u0b16\5\u0126\u0094"+
		"\2\u0b14\u0b16\5\u0124\u0093\2\u0b15\u0b12\3\2\2\2\u0b15\u0b13\3\2\2\2"+
		"\u0b15\u0b14\3\2\2\2\u0b16\u0b18\3\2\2\2\u0b17\u0b19\7\u00e8\2\2\u0b18"+
		"\u0b17\3\2\2\2\u0b18\u0b19\3\2\2\2\u0b19\u0129\3\2\2\2\u0b1a\u0b23\5\u0128"+
		"\u0095\2\u0b1b\u0b1d\7\u00e8\2\2\u0b1c\u0b1b\3\2\2\2\u0b1c\u0b1d\3\2\2"+
		"\2\u0b1d\u0b1e\3\2\2\2\u0b1e\u0b20\7\u00e6\2\2\u0b1f\u0b21\7\u00e8\2\2"+
		"\u0b20\u0b1f\3\2\2\2\u0b20\u0b21\3\2\2\2\u0b21\u0b23\3\2\2\2\u0b22\u0b1a"+
		"\3\2\2\2\u0b22\u0b1c\3\2\2\2\u0b23\u0b24\3\2\2\2\u0b24\u0b22\3\2\2\2\u0b24"+
		"\u0b25\3\2\2\2\u0b25\u012b\3\2\2\2\u01e7\u0130\u0135\u013c\u013f\u0145"+
		"\u0148\u014b\u0150\u0154\u0159\u015d\u0162\u0166\u016b\u016f\u0176\u017c"+
		"\u0182\u0189\u018d\u0193\u0196\u019e\u01a3\u01a9\u01b3\u01b9\u01be\u01c5"+
		"\u01cb\u01cf\u01d5\u01db\u01e1\u01ec\u01f8\u01fc\u0202\u0208\u020e\u0217"+
		"\u021d\u0221\u0225\u0229\u022e\u0237\u027c\u02af\u02b5\u02b9\u02bc\u02cc"+
		"\u02d0\u02d5\u02d8\u02dd\u02e3\u02e7\u02ec\u02f1\u02f5\u02f8\u02fc\u0302"+
		"\u0306\u030d\u0313\u0317\u031a\u031f\u0329\u032c\u032f\u0333\u0339\u033d"+
		"\u0342\u0349\u034d\u0351\u0355\u0358\u035d\u0368\u0375\u037c\u0385\u038c"+
		"\u0390\u0393\u03a2\u03a8\u03b2\u03b6\u03c0\u03c8\u03cd\u03d3\u03d7\u03da"+
		"\u03de\u03e9\u03ed\u03f2\u03f7\u03fb\u03ff\u0403\u0406\u0409\u040c\u040f"+
		"\u0413\u041a\u041e\u0422\u0426\u042b\u042e\u0431\u0434\u0437\u043a\u043f"+
		"\u0443\u044b\u044f\u0452\u0455\u0459\u0470\u0476\u047a\u047e\u0487\u0492"+
		"\u0497\u04a1\u04a5\u04aa\u04b2\u04b6\u04ba\u04c2\u04c6\u04d2\u04d6\u04dd"+
		"\u04df\u04e5\u04e9\u04ef\u04f3\u04f7\u04ff\u0503\u0509\u0512\u0514\u0519"+
		"\u0522\u0524\u052c\u052e\u0533\u0537\u053b\u053f\u0543\u0547\u054a\u054d"+
		"\u0551\u0555\u056d\u0577\u057b\u0580\u058b\u058f\u0594\u05a2\u05a6\u05af"+
		"\u05b3\u05b6\u05ba\u05be\u05c1\u05c5\u05c9\u05cc\u05d0\u05d3\u05d7\u05d9"+
		"\u05de\u05e2\u05e6\u05ea\u05ec\u05f2\u05f6\u05f9\u05fe\u0602\u0608\u060b"+
		"\u060e\u0612\u0616\u061d\u0621\u0627\u062a\u062e\u0635\u0639\u063f\u0642"+
		"\u0646\u064e\u0652\u0655\u0658\u065c\u0664\u0668\u066c\u066e\u0671\u0676"+
		"\u067c\u0680\u0684\u0689\u068e\u0692\u0696\u069b\u06a3\u06a5\u06b1\u06b5"+
		"\u06bd\u06c1\u06c9\u06cd\u06d1\u06d5\u06d9\u06dd\u06e5\u06e9\u06f6\u06fd"+
		"\u0701\u070c\u0713\u0718\u071c\u0721\u0724\u072a\u072e\u0731\u0737\u073b"+
		"\u0743\u0747\u0750\u0754\u0758\u075c\u075f\u0763\u0769\u076d\u0774\u077d"+
		"\u0784\u0788\u078b\u078e\u0791\u07a7\u07ab\u07b2\u07b4\u07bd\u07c2\u07c7"+
		"\u07cc\u07cf\u07d3\u07d7\u07dc\u07e0\u07e5\u07e9\u07ee\u07f2\u07f7\u07fb"+
		"\u0800\u0804\u0809\u080d\u0812\u0816\u081b\u081f\u0824\u0828\u082d\u0831"+
		"\u0836\u083a\u083f\u0843\u0848\u084c\u0851\u0855\u085a\u085e\u0863\u0867"+
		"\u086c\u0870\u0875\u0879\u087c\u087e\u0886\u088a\u088e\u0893\u089a\u08a0"+
		"\u08a5\u08aa\u08af\u08b2\u08b6\u08ba\u08bf\u08c3\u08c8\u08cc\u08d1\u08d5"+
		"\u08da\u08de\u08e3\u08e7\u08ec\u08f0\u08f5\u08f9\u08fe\u0902\u0907\u090b"+
		"\u0910\u0914\u0919\u091d\u0922\u0926\u092b\u092f\u0934\u0938\u093d\u0941"+
		"\u0946\u094a\u094f\u0953\u0958\u095c\u0961\u0965\u0968\u096a\u0970\u0975"+
		"\u097b\u097f\u0984\u0989\u098d\u0991\u0993\u0997\u0999\u099c\u09a0\u09a7"+
		"\u09af\u09b3\u09bd\u09c1\u09c9\u09cd\u09d0\u09d3\u09de\u09e4\u09e9\u09ed"+
		"\u09f3\u09f6\u09f9\u09fc\u09ff\u0a03\u0a08\u0a0c\u0a11\u0a14\u0a18\u0a1c"+
		"\u0a23\u0a27\u0a29\u0a2f\u0a33\u0a37\u0a3c\u0a3f\u0a42\u0a48\u0a4c\u0a50"+
		"\u0a54\u0a57\u0a5b\u0a5e\u0a61\u0a64\u0a67\u0a6a\u0a6e\u0a74\u0a78\u0a7d"+
		"\u0a85\u0a8b\u0a8f\u0a94\u0a9c\u0aa2\u0aa4\u0aa8\u0aac\u0ab0\u0ab3\u0aba"+
		"\u0abc\u0ac2\u0ac4\u0ac6\u0acc\u0ad0\u0ad4\u0adb\u0ae0\u0ae4\u0ae8\u0aec"+
		"\u0aef\u0af9\u0afc\u0b00\u0b03\u0b10\u0b15\u0b18\u0b1c\u0b20\u0b22\u0b24";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
