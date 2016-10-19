// Generated from Vba.g4 by ANTLR 4.5.3
package vba;
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
		AS=16, BEGIN=17, BEEP=18, BINARY=19, BOOLEAN=20, BYVAL=21, BYREF=22, BYTE=23, 
		CALL=24, CASE=25, CHDIR=26, CHDRIVE=27, CLASS=28, CLOSE=29, COLLECTION=30, 
		CONST=31, DATABASE=32, DATE=33, DECLARE=34, DEFBOOL=35, DEFBYTE=36, DEFDATE=37, 
		DEFDBL=38, DEFDEC=39, DEFCUR=40, DEFINT=41, DEFLNG=42, DEFOBJ=43, DEFSNG=44, 
		DEFSTR=45, DEFVAR=46, DELETESETTING=47, DIM=48, DO=49, DOUBLE=50, EACH=51, 
		ELSE=52, ELSEIF=53, END_ENUM=54, END_FUNCTION=55, END_RULE=56, END_IF=57, 
		END_PROPERTY=58, END_SELECT=59, END_SUB=60, END_TYPE=61, END_WITH=62, 
		END=63, ENUM=64, EQV=65, ERASE=66, ERROR=67, EVENT=68, EXIT_DO=69, EXIT_FOR=70, 
		EXIT_FUNCTION=71, EXIT_PROPERTY=72, EXIT_SUB=73, EXIT_RULE=74, FALSE=75, 
		FILECOPY=76, FRIEND=77, FOR=78, FUNCTION=79, RULE=80, GET=81, GLOBAL=82, 
		GOSUB=83, GOTO=84, IF=85, IMP=86, IMPLEMENTS=87, IN=88, INPUT=89, IS=90, 
		INTEGER=91, KILL=92, LOAD=93, LOCK=94, LONG=95, LOOP=96, LEN=97, LET=98, 
		LIB=99, LIKE=100, LINE_INPUT=101, LOCK_READ=102, LOCK_WRITE=103, LOCK_READ_WRITE=104, 
		LSET=105, MACRO_CONST=106, MACRO_IF=107, MACRO_ELSEIF=108, MACRO_ELSE=109, 
		MACRO_END_IF=110, ME=111, MID=112, MKDIR=113, MOD=114, NAME=115, NEXT=116, 
		NEW=117, NOT=118, NOTHING=119, NULL=120, EMPTY=121, ON=122, ON_ERROR=123, 
		ON_LOCAL_ERROR=124, OPEN=125, OPTIONAL=126, OPTION_BASE=127, OPTION_EXPLICIT=128, 
		OPTION_COMPARE=129, OPTION_PRIVATE_MODULE=130, OR=131, OUTPUT=132, PARAMARRAY=133, 
		PRESERVE=134, PRINT=135, PRIVATE=136, PROPERTY_GET=137, PROPERTY_LET=138, 
		PROPERTY_SET=139, PTRSAFE=140, PUBLIC=141, PUT=142, RANDOM=143, RANDOMIZE=144, 
		RAISEEVENT=145, READ=146, READ_WRITE=147, REDIM=148, REM=149, RESET=150, 
		RESUME=151, RETURN=152, RMDIR=153, RSET=154, SAVEPICTURE=155, SAVESETTING=156, 
		SEEK=157, SELECT=158, SENDKEYS=159, SET=160, SETATTR=161, SHARED=162, 
		SINGLE=163, CURRENCY=164, DECIMAL=165, SPC=166, STATIC=167, STEP=168, 
		STOP=169, STRING=170, SUB=171, TAB=172, TEXT=173, THEN=174, TIME=175, 
		TO=176, TRUE=177, TYPE=178, TYPEOF=179, UNLOAD=180, UNLOCK=181, UNTIL=182, 
		VARIANT=183, OBJECT=184, IUNKNOWN=185, VERSION=186, WEND=187, WHILE=188, 
		WIDTH=189, WITH=190, WHEN=191, WITHEVENTS=192, WRITE=193, XOR=194, AMPERSAND=195, 
		ASSIGN=196, DIV=197, EQ=198, GEQ=199, GT=200, LEQ=201, LPAREN=202, LT=203, 
		MINUS=204, MINUS_EQ=205, MULT=206, NEQ=207, PLUS=208, PLUS_EQ=209, POW=210, 
		RPAREN=211, L_SQUARE_BRACKET=212, R_SQUARE_BRACKET=213, STRINGLITERAL=214, 
		OCTLITERAL=215, HEXLITERAL=216, SHORTLITERAL=217, INTEGERLITERAL=218, 
		DOUBLELITERAL=219, DATELITERAL=220, LINE_CONTINUATION=221, NEWLINE=222, 
		REMCOMMENT=223, COMMENT=224, SINGLEQUOTE=225, COLON=226, UNDERSCORE=227, 
		WS=228, IDENTIFIER=229;
	public static final int
		RULE_startRule = 0, RULE_module = 1, RULE_moduleHeader = 2, RULE_moduleConfig = 3, 
		RULE_moduleConfigElement = 4, RULE_moduleAttributes = 5, RULE_moduleDeclarations = 6, 
		RULE_moduleOption = 7, RULE_moduleDeclarationsElement = 8, RULE_macroStmt = 9, 
		RULE_moduleBody = 10, RULE_moduleBodyElement = 11, RULE_attributeStmt = 12, 
		RULE_block = 13, RULE_blockStmt = 14, RULE_evalStmt = 15, RULE_appactivateStmt = 16, 
		RULE_beepStmt = 17, RULE_chdirStmt = 18, RULE_chdriveStmt = 19, RULE_closeStmt = 20, 
		RULE_constStmt = 21, RULE_constSubStmt = 22, RULE_dateStmt = 23, RULE_declareStmt = 24, 
		RULE_deftypeStmt = 25, RULE_deleteSettingStmt = 26, RULE_doLoopStmt = 27, 
		RULE_endStmt = 28, RULE_enumerationStmt = 29, RULE_enumerationStmt_Constant = 30, 
		RULE_eraseStmt = 31, RULE_errorStmt = 32, RULE_eventStmt = 33, RULE_exitStmt = 34, 
		RULE_filecopyStmt = 35, RULE_forEachStmt = 36, RULE_forNextStmt = 37, 
		RULE_functionStmt = 38, RULE_ruleStmt = 39, RULE_getStmt = 40, RULE_goSubStmt = 41, 
		RULE_goToStmt = 42, RULE_ifThenElseStmt = 43, RULE_ifBlockStmt = 44, RULE_ifConditionStmt = 45, 
		RULE_ifElseIfBlockStmt = 46, RULE_ifElseBlockStmt = 47, RULE_implementsStmt = 48, 
		RULE_inputStmt = 49, RULE_killStmt = 50, RULE_letStmt = 51, RULE_lineInputStmt = 52, 
		RULE_loadStmt = 53, RULE_lockStmt = 54, RULE_lsetStmt = 55, RULE_macroConstStmt = 56, 
		RULE_macroIfThenElseStmt = 57, RULE_macroIfBlockStmt = 58, RULE_macroElseIfBlockStmt = 59, 
		RULE_macroElseBlockStmt = 60, RULE_midStmt = 61, RULE_mkdirStmt = 62, 
		RULE_nameStmt = 63, RULE_onErrorStmt = 64, RULE_onGoToStmt = 65, RULE_onGoSubStmt = 66, 
		RULE_openStmt = 67, RULE_outputList = 68, RULE_outputList_Expression = 69, 
		RULE_printStmt = 70, RULE_propertyGetStmt = 71, RULE_propertySetStmt = 72, 
		RULE_propertyLetStmt = 73, RULE_putStmt = 74, RULE_raiseEventStmt = 75, 
		RULE_randomizeStmt = 76, RULE_redimStmt = 77, RULE_redimSubStmt = 78, 
		RULE_resetStmt = 79, RULE_resumeStmt = 80, RULE_returnStmt = 81, RULE_rmdirStmt = 82, 
		RULE_rsetStmt = 83, RULE_savepictureStmt = 84, RULE_saveSettingStmt = 85, 
		RULE_seekStmt = 86, RULE_selectCaseStmt = 87, RULE_sC_Selection = 88, 
		RULE_sC_Case = 89, RULE_sC_Cond = 90, RULE_sendkeysStmt = 91, RULE_setattrStmt = 92, 
		RULE_setStmt = 93, RULE_stopStmt = 94, RULE_subStmt = 95, RULE_timeStmt = 96, 
		RULE_typeStmt = 97, RULE_typeStmt_Element = 98, RULE_typeOfIsStmt = 99, 
		RULE_unloadStmt = 100, RULE_unlockStmt = 101, RULE_constValueExpr = 102, 
		RULE_valueStmt = 103, RULE_variableStmt = 104, RULE_variableListStmt = 105, 
		RULE_variableSubStmt = 106, RULE_whileWendStmt = 107, RULE_widthStmt = 108, 
		RULE_withStmt = 109, RULE_writeStmt = 110, RULE_fileNumber = 111, RULE_explicitCallStmt = 112, 
		RULE_implicitCallStmt_InBlock = 113, RULE_implicitCallStmt_InStmt = 114, 
		RULE_iCS_startElement = 115, RULE_iCS_followElement = 116, RULE_memberCall = 117, 
		RULE_dictionaryCall = 118, RULE_argsCall = 119, RULE_argCall = 120, RULE_argList = 121, 
		RULE_arg = 122, RULE_argDefaultValue = 123, RULE_subscripts = 124, RULE_subscript = 125, 
		RULE_constSubscripts = 126, RULE_constSubscript = 127, RULE_ambiguousIdentifier = 128, 
		RULE_asTypeClause = 129, RULE_baseType = 130, RULE_certainIdentifier = 131, 
		RULE_comparisonOperator = 132, RULE_fixedSizeString = 133, RULE_complexType = 134, 
		RULE_fieldLength = 135, RULE_letterrange = 136, RULE_lineLabel = 137, 
		RULE_literal = 138, RULE_type = 139, RULE_typeHint = 140, RULE_visibility = 141, 
		RULE_ambiguousKeyword = 142, RULE_remComment = 143, RULE_comment = 144, 
		RULE_endOfLine = 145, RULE_endOfStatement = 146;
	public static final String[] ruleNames = {
		"startRule", "module", "moduleHeader", "moduleConfig", "moduleConfigElement", 
		"moduleAttributes", "moduleDeclarations", "moduleOption", "moduleDeclarationsElement", 
		"macroStmt", "moduleBody", "moduleBodyElement", "attributeStmt", "block", 
		"blockStmt", "evalStmt", "appactivateStmt", "beepStmt", "chdirStmt", "chdriveStmt", 
		"closeStmt", "constStmt", "constSubStmt", "dateStmt", "declareStmt", "deftypeStmt", 
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
		null, null, null, null, "'&'", "':='", null, "'='", "'>='", "'>'", "'<='", 
		"'('", "'<'", "'-'", "'-='", "'*'", "'<>'", "'+'", "'+='", "'^'", "')'", 
		"'['", "']'", null, null, null, null, null, null, null, null, null, null, 
		null, "'''", "':'", "'_'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "ACCESS", "ADDRESSOF", 
		"ALIAS", "AND", "ATTRIBUTE", "APPACTIVATE", "APPEND", "AS", "BEGIN", "BEEP", 
		"BINARY", "BOOLEAN", "BYVAL", "BYREF", "BYTE", "CALL", "CASE", "CHDIR", 
		"CHDRIVE", "CLASS", "CLOSE", "COLLECTION", "CONST", "DATABASE", "DATE", 
		"DECLARE", "DEFBOOL", "DEFBYTE", "DEFDATE", "DEFDBL", "DEFDEC", "DEFCUR", 
		"DEFINT", "DEFLNG", "DEFOBJ", "DEFSNG", "DEFSTR", "DEFVAR", "DELETESETTING", 
		"DIM", "DO", "DOUBLE", "EACH", "ELSE", "ELSEIF", "END_ENUM", "END_FUNCTION", 
		"END_RULE", "END_IF", "END_PROPERTY", "END_SELECT", "END_SUB", "END_TYPE", 
		"END_WITH", "END", "ENUM", "EQV", "ERASE", "ERROR", "EVENT", "EXIT_DO", 
		"EXIT_FOR", "EXIT_FUNCTION", "EXIT_PROPERTY", "EXIT_SUB", "EXIT_RULE", 
		"FALSE", "FILECOPY", "FRIEND", "FOR", "FUNCTION", "RULE", "GET", "GLOBAL", 
		"GOSUB", "GOTO", "IF", "IMP", "IMPLEMENTS", "IN", "INPUT", "IS", "INTEGER", 
		"KILL", "LOAD", "LOCK", "LONG", "LOOP", "LEN", "LET", "LIB", "LIKE", "LINE_INPUT", 
		"LOCK_READ", "LOCK_WRITE", "LOCK_READ_WRITE", "LSET", "MACRO_CONST", "MACRO_IF", 
		"MACRO_ELSEIF", "MACRO_ELSE", "MACRO_END_IF", "ME", "MID", "MKDIR", "MOD", 
		"NAME", "NEXT", "NEW", "NOT", "NOTHING", "NULL", "EMPTY", "ON", "ON_ERROR", 
		"ON_LOCAL_ERROR", "OPEN", "OPTIONAL", "OPTION_BASE", "OPTION_EXPLICIT", 
		"OPTION_COMPARE", "OPTION_PRIVATE_MODULE", "OR", "OUTPUT", "PARAMARRAY", 
		"PRESERVE", "PRINT", "PRIVATE", "PROPERTY_GET", "PROPERTY_LET", "PROPERTY_SET", 
		"PTRSAFE", "PUBLIC", "PUT", "RANDOM", "RANDOMIZE", "RAISEEVENT", "READ", 
		"READ_WRITE", "REDIM", "REM", "RESET", "RESUME", "RETURN", "RMDIR", "RSET", 
		"SAVEPICTURE", "SAVESETTING", "SEEK", "SELECT", "SENDKEYS", "SET", "SETATTR", 
		"SHARED", "SINGLE", "CURRENCY", "DECIMAL", "SPC", "STATIC", "STEP", "STOP", 
		"STRING", "SUB", "TAB", "TEXT", "THEN", "TIME", "TO", "TRUE", "TYPE", 
		"TYPEOF", "UNLOAD", "UNLOCK", "UNTIL", "VARIANT", "OBJECT", "IUNKNOWN", 
		"VERSION", "WEND", "WHILE", "WIDTH", "WITH", "WHEN", "WITHEVENTS", "WRITE", 
		"XOR", "AMPERSAND", "ASSIGN", "DIV", "EQ", "GEQ", "GT", "LEQ", "LPAREN", 
		"LT", "MINUS", "MINUS_EQ", "MULT", "NEQ", "PLUS", "PLUS_EQ", "POW", "RPAREN", 
		"L_SQUARE_BRACKET", "R_SQUARE_BRACKET", "STRINGLITERAL", "OCTLITERAL", 
		"HEXLITERAL", "SHORTLITERAL", "INTEGERLITERAL", "DOUBLELITERAL", "DATELITERAL", 
		"LINE_CONTINUATION", "NEWLINE", "REMCOMMENT", "COMMENT", "SINGLEQUOTE", 
		"COLON", "UNDERSCORE", "WS", "IDENTIFIER"
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
			setState(294);
			module();
			setState(295);
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
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(297);
				match(WS);
				}
				break;
			}
			setState(303);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(300);
					endOfLine();
					}
					} 
				}
				setState(305);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(313);
			_la = _input.LA(1);
			if (_la==VERSION) {
				{
				setState(306);
				moduleHeader();
				setState(310);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(307);
						endOfLine();
						}
						} 
					}
					setState(312);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				}
			}

			setState(316);
			_la = _input.LA(1);
			if (_la==BEGIN) {
				{
				setState(315);
				moduleConfig();
				}
			}

			setState(321);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(318);
					endOfLine();
					}
					} 
				}
				setState(323);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(325);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(324);
				moduleAttributes();
				}
				break;
			}
			setState(330);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(327);
					endOfLine();
					}
					} 
				}
				setState(332);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(334);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(333);
				moduleDeclarations();
				}
				break;
			}
			setState(339);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(336);
					endOfLine();
					}
					} 
				}
				setState(341);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(343);
			_la = _input.LA(1);
			if (((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (FRIEND - 77)) | (1L << (FUNCTION - 77)) | (1L << (RULE - 77)) | (1L << (GLOBAL - 77)) | (1L << (PRIVATE - 77)) | (1L << (PROPERTY_GET - 77)) | (1L << (PROPERTY_LET - 77)) | (1L << (PROPERTY_SET - 77)))) != 0) || ((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & ((1L << (PUBLIC - 141)) | (1L << (STATIC - 141)) | (1L << (SUB - 141)))) != 0)) {
				{
				setState(342);
				moduleBody();
				}
			}

			setState(348);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(345);
					endOfLine();
					}
					} 
				}
				setState(350);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(352);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(351);
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
			setState(354);
			match(VERSION);
			setState(355);
			match(WS);
			setState(356);
			match(DOUBLELITERAL);
			setState(357);
			match(WS);
			setState(358);
			match(CLASS);
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
			setState(360);
			match(BEGIN);
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 222)) & ~0x3f) == 0 && ((1L << (_la - 222)) & ((1L << (NEWLINE - 222)) | (1L << (REMCOMMENT - 222)) | (1L << (COMMENT - 222)) | (1L << (WS - 222)))) != 0)) {
				{
				{
				setState(361);
				endOfLine();
				}
				}
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(368); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(367);
				moduleConfigElement();
				}
				}
				setState(370); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ENUM - 64)) | (1L << (EQV - 64)) | (1L << (ERASE - 64)) | (1L << (ERROR - 64)) | (1L << (EVENT - 64)) | (1L << (FALSE - 64)) | (1L << (FILECOPY - 64)) | (1L << (FRIEND - 64)) | (1L << (FOR - 64)) | (1L << (FUNCTION - 64)) | (1L << (GET - 64)) | (1L << (GLOBAL - 64)) | (1L << (GOSUB - 64)) | (1L << (GOTO - 64)) | (1L << (IF - 64)) | (1L << (IMP - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (IN - 64)) | (1L << (INPUT - 64)) | (1L << (IS - 64)) | (1L << (INTEGER - 64)) | (1L << (KILL - 64)) | (1L << (LOAD - 64)) | (1L << (LOCK - 64)) | (1L << (LONG - 64)) | (1L << (LOOP - 64)) | (1L << (LEN - 64)) | (1L << (LET - 64)) | (1L << (LIB - 64)) | (1L << (LIKE - 64)) | (1L << (LSET - 64)) | (1L << (ME - 64)) | (1L << (MID - 64)) | (1L << (MKDIR - 64)) | (1L << (MOD - 64)) | (1L << (NAME - 64)) | (1L << (NEXT - 64)) | (1L << (NEW - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (EMPTY - 64)) | (1L << (ON - 64)) | (1L << (OPEN - 64)) | (1L << (OPTIONAL - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (OR - 131)) | (1L << (OUTPUT - 131)) | (1L << (PARAMARRAY - 131)) | (1L << (PRESERVE - 131)) | (1L << (PRINT - 131)) | (1L << (PRIVATE - 131)) | (1L << (PUBLIC - 131)) | (1L << (PUT - 131)) | (1L << (RANDOM - 131)) | (1L << (RANDOMIZE - 131)) | (1L << (RAISEEVENT - 131)) | (1L << (READ - 131)) | (1L << (REDIM - 131)) | (1L << (REM - 131)) | (1L << (RESET - 131)) | (1L << (RESUME - 131)) | (1L << (RETURN - 131)) | (1L << (RMDIR - 131)) | (1L << (RSET - 131)) | (1L << (SAVEPICTURE - 131)) | (1L << (SAVESETTING - 131)) | (1L << (SEEK - 131)) | (1L << (SELECT - 131)) | (1L << (SENDKEYS - 131)) | (1L << (SET - 131)) | (1L << (SETATTR - 131)) | (1L << (SHARED - 131)) | (1L << (SINGLE - 131)) | (1L << (SPC - 131)) | (1L << (STATIC - 131)) | (1L << (STEP - 131)) | (1L << (STRING - 131)) | (1L << (SUB - 131)) | (1L << (TAB - 131)) | (1L << (TEXT - 131)) | (1L << (THEN - 131)) | (1L << (TIME - 131)) | (1L << (TO - 131)) | (1L << (TRUE - 131)) | (1L << (TYPE - 131)) | (1L << (TYPEOF - 131)) | (1L << (UNLOAD - 131)) | (1L << (UNLOCK - 131)) | (1L << (UNTIL - 131)) | (1L << (VARIANT - 131)) | (1L << (VERSION - 131)) | (1L << (WEND - 131)) | (1L << (WHILE - 131)) | (1L << (WIDTH - 131)) | (1L << (WITH - 131)) | (1L << (WITHEVENTS - 131)) | (1L << (WRITE - 131)) | (1L << (XOR - 131)))) != 0) || _la==IDENTIFIER );
			setState(372);
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
		public ModuleConfigElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleConfigElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).enterModuleConfigElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VbaListener ) ((VbaListener)listener).exitModuleConfigElement(this);
		}
	}

	public final ModuleConfigElementContext moduleConfigElement() throws RecognitionException {
		ModuleConfigElementContext _localctx = new ModuleConfigElementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_moduleConfigElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			ambiguousIdentifier();
			setState(376);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(375);
				match(WS);
				}
			}

			setState(378);
			match(EQ);
			setState(380);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(379);
				match(WS);
				}
			}

			setState(382);
			literal();
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 222)) & ~0x3f) == 0 && ((1L << (_la - 222)) & ((1L << (NEWLINE - 222)) | (1L << (REMCOMMENT - 222)) | (1L << (COMMENT - 222)) | (1L << (WS - 222)))) != 0)) {
				{
				{
				setState(383);
				endOfLine();
				}
				}
				setState(388);
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
		enterRule(_localctx, 10, RULE_moduleAttributes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(395); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(389);
					attributeStmt();
					setState(391); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(390);
							endOfLine();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(393); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(397); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		enterRule(_localctx, 12, RULE_moduleDeclarations);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			moduleDeclarationsElement();
			setState(409);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(401); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(400);
							endOfLine();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(403); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(405);
					moduleDeclarationsElement();
					}
					} 
				}
				setState(411);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(415);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(412);
					endOfLine();
					}
					} 
				}
				setState(417);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
		enterRule(_localctx, 14, RULE_moduleOption);
		int _la;
		try {
			setState(426);
			switch (_input.LA(1)) {
			case OPTION_BASE:
				_localctx = new OptionBaseStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(418);
				match(OPTION_BASE);
				setState(419);
				match(WS);
				setState(420);
				match(SHORTLITERAL);
				}
				break;
			case OPTION_COMPARE:
				_localctx = new OptionCompareStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(421);
				match(OPTION_COMPARE);
				setState(422);
				match(WS);
				setState(423);
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
				setState(424);
				match(OPTION_EXPLICIT);
				}
				break;
			case OPTION_PRIVATE_MODULE:
				_localctx = new OptionPrivateModuleStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(425);
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
		enterRule(_localctx, 16, RULE_moduleDeclarationsElement);
		try {
			setState(438);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(428);
				comment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(429);
				declareStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(430);
				enumerationStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(431);
				eventStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(432);
				constStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(433);
				implementsStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(434);
				variableStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(435);
				moduleOption();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(436);
				typeStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(437);
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
		enterRule(_localctx, 18, RULE_macroStmt);
		try {
			setState(442);
			switch (_input.LA(1)) {
			case MACRO_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(440);
				macroConstStmt();
				}
				break;
			case MACRO_IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(441);
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
		enterRule(_localctx, 20, RULE_moduleBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			moduleBodyElement();
			setState(454);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(446); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(445);
						endOfLine();
						}
						}
						setState(448); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 222)) & ~0x3f) == 0 && ((1L << (_la - 222)) & ((1L << (NEWLINE - 222)) | (1L << (REMCOMMENT - 222)) | (1L << (COMMENT - 222)) | (1L << (WS - 222)))) != 0) );
					setState(450);
					moduleBodyElement();
					}
					} 
				}
				setState(456);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(460);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(457);
					endOfLine();
					}
					} 
				}
				setState(462);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
		enterRule(_localctx, 22, RULE_moduleBodyElement);
		try {
			setState(469);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(463);
				functionStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(464);
				propertyGetStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(465);
				propertySetStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(466);
				propertyLetStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(467);
				subStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(468);
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
		enterRule(_localctx, 24, RULE_attributeStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			match(ATTRIBUTE);
			setState(472);
			match(WS);
			setState(473);
			implicitCallStmt_InStmt();
			setState(475);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(474);
				match(WS);
				}
			}

			setState(477);
			match(EQ);
			setState(479);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(478);
				match(WS);
				}
			}

			setState(481);
			literal();
			setState(492);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(483);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(482);
						match(WS);
						}
					}

					setState(485);
					match(T__0);
					setState(487);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(486);
						match(WS);
						}
					}

					setState(489);
					literal();
					}
					} 
				}
				setState(494);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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
		enterRule(_localctx, 26, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			blockStmt();
			setState(501);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(496);
					endOfStatement();
					setState(497);
					blockStmt();
					}
					} 
				}
				setState(503);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			setState(504);
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
		public RandomizeStmtContext randomizeStmt() {
			return getRuleContext(RandomizeStmtContext.class,0);
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
		enterRule(_localctx, 28, RULE_blockStmt);
		try {
			setState(571);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(506);
				lineLabel();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(507);
				midStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(508);
				appactivateStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(509);
				attributeStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(510);
				beepStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(511);
				chdirStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(512);
				chdriveStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(513);
				closeStmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(514);
				constStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(515);
				dateStmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(516);
				deleteSettingStmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(517);
				deftypeStmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(518);
				doLoopStmt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(519);
				endStmt();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(520);
				eraseStmt();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(521);
				errorStmt();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(522);
				exitStmt();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(523);
				explicitCallStmt();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(524);
				filecopyStmt();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(525);
				forEachStmt();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(526);
				forNextStmt();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(527);
				getStmt();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(528);
				goSubStmt();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(529);
				goToStmt();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(530);
				ifThenElseStmt();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(531);
				inputStmt();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(532);
				killStmt();
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(533);
				letStmt();
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(534);
				lineInputStmt();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(535);
				loadStmt();
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(536);
				lockStmt();
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(537);
				lsetStmt();
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(538);
				mkdirStmt();
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(539);
				nameStmt();
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(540);
				onErrorStmt();
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(541);
				onGoToStmt();
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(542);
				onGoSubStmt();
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(543);
				openStmt();
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(544);
				printStmt();
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(545);
				putStmt();
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(546);
				raiseEventStmt();
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(547);
				randomizeStmt();
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(548);
				redimStmt();
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(549);
				resetStmt();
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 45);
				{
				setState(550);
				resumeStmt();
				}
				break;
			case 46:
				enterOuterAlt(_localctx, 46);
				{
				setState(551);
				returnStmt();
				}
				break;
			case 47:
				enterOuterAlt(_localctx, 47);
				{
				setState(552);
				rmdirStmt();
				}
				break;
			case 48:
				enterOuterAlt(_localctx, 48);
				{
				setState(553);
				rsetStmt();
				}
				break;
			case 49:
				enterOuterAlt(_localctx, 49);
				{
				setState(554);
				savepictureStmt();
				}
				break;
			case 50:
				enterOuterAlt(_localctx, 50);
				{
				setState(555);
				saveSettingStmt();
				}
				break;
			case 51:
				enterOuterAlt(_localctx, 51);
				{
				setState(556);
				seekStmt();
				}
				break;
			case 52:
				enterOuterAlt(_localctx, 52);
				{
				setState(557);
				selectCaseStmt();
				}
				break;
			case 53:
				enterOuterAlt(_localctx, 53);
				{
				setState(558);
				sendkeysStmt();
				}
				break;
			case 54:
				enterOuterAlt(_localctx, 54);
				{
				setState(559);
				setattrStmt();
				}
				break;
			case 55:
				enterOuterAlt(_localctx, 55);
				{
				setState(560);
				setStmt();
				}
				break;
			case 56:
				enterOuterAlt(_localctx, 56);
				{
				setState(561);
				stopStmt();
				}
				break;
			case 57:
				enterOuterAlt(_localctx, 57);
				{
				setState(562);
				timeStmt();
				}
				break;
			case 58:
				enterOuterAlt(_localctx, 58);
				{
				setState(563);
				unloadStmt();
				}
				break;
			case 59:
				enterOuterAlt(_localctx, 59);
				{
				setState(564);
				unlockStmt();
				}
				break;
			case 60:
				enterOuterAlt(_localctx, 60);
				{
				setState(565);
				variableStmt();
				}
				break;
			case 61:
				enterOuterAlt(_localctx, 61);
				{
				setState(566);
				whileWendStmt();
				}
				break;
			case 62:
				enterOuterAlt(_localctx, 62);
				{
				setState(567);
				widthStmt();
				}
				break;
			case 63:
				enterOuterAlt(_localctx, 63);
				{
				setState(568);
				withStmt();
				}
				break;
			case 64:
				enterOuterAlt(_localctx, 64);
				{
				setState(569);
				writeStmt();
				}
				break;
			case 65:
				enterOuterAlt(_localctx, 65);
				{
				setState(570);
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
		public RandomizeStmtContext randomizeStmt() {
			return getRuleContext(RandomizeStmtContext.class,0);
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
		enterRule(_localctx, 30, RULE_evalStmt);
		try {
			setState(623);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(574);
				appactivateStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(575);
				beepStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(576);
				chdirStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(577);
				chdriveStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(578);
				closeStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(579);
				dateStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(580);
				deleteSettingStmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(581);
				doLoopStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(582);
				endStmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(583);
				eraseStmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(584);
				explicitCallStmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(585);
				filecopyStmt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(586);
				forEachStmt();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(587);
				forNextStmt();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(588);
				getStmt();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(589);
				ifThenElseStmt();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(590);
				inputStmt();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(591);
				killStmt();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(592);
				letStmt();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(593);
				lineInputStmt();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(594);
				loadStmt();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(595);
				lockStmt();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(596);
				lsetStmt();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(597);
				midStmt();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(598);
				mkdirStmt();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(599);
				nameStmt();
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(600);
				openStmt();
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(601);
				printStmt();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(602);
				putStmt();
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(603);
				raiseEventStmt();
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(604);
				randomizeStmt();
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(605);
				redimStmt();
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(606);
				resetStmt();
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(607);
				rmdirStmt();
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(608);
				rsetStmt();
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(609);
				savepictureStmt();
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(610);
				saveSettingStmt();
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(611);
				seekStmt();
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(612);
				selectCaseStmt();
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(613);
				sendkeysStmt();
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(614);
				setattrStmt();
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(615);
				setStmt();
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(616);
				timeStmt();
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 45);
				{
				setState(617);
				unloadStmt();
				}
				break;
			case 46:
				enterOuterAlt(_localctx, 46);
				{
				setState(618);
				unlockStmt();
				}
				break;
			case 47:
				enterOuterAlt(_localctx, 47);
				{
				setState(619);
				whileWendStmt();
				}
				break;
			case 48:
				enterOuterAlt(_localctx, 48);
				{
				setState(620);
				widthStmt();
				}
				break;
			case 49:
				enterOuterAlt(_localctx, 49);
				{
				setState(621);
				valueStmt(0);
				}
				break;
			case 50:
				enterOuterAlt(_localctx, 50);
				{
				setState(622);
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
		enterRule(_localctx, 32, RULE_appactivateStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			match(APPACTIVATE);
			setState(626);
			match(WS);
			setState(627);
			valueStmt(0);
			setState(636);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(629);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(628);
					match(WS);
					}
				}

				setState(631);
				match(T__0);
				setState(633);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(632);
					match(WS);
					}
					break;
				}
				setState(635);
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
		enterRule(_localctx, 34, RULE_beepStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
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
		enterRule(_localctx, 36, RULE_chdirStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			match(CHDIR);
			setState(641);
			match(WS);
			setState(642);
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
		enterRule(_localctx, 38, RULE_chdriveStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			match(CHDRIVE);
			setState(645);
			match(WS);
			setState(646);
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
		enterRule(_localctx, 40, RULE_closeStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			match(CLOSE);
			setState(664);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(649);
				match(WS);
				setState(650);
				fileNumber();
				setState(661);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(652);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(651);
							match(WS);
							}
						}

						setState(654);
						match(T__0);
						setState(656);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
						case 1:
							{
							setState(655);
							match(WS);
							}
							break;
						}
						setState(658);
						fileNumber();
						}
						} 
					}
					setState(663);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
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
		enterRule(_localctx, 42, RULE_constStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(669);
			_la = _input.LA(1);
			if (((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (FRIEND - 77)) | (1L << (GLOBAL - 77)) | (1L << (PRIVATE - 77)))) != 0) || _la==PUBLIC) {
				{
				setState(666);
				visibility();
				setState(667);
				match(WS);
				}
			}

			setState(671);
			match(CONST);
			setState(672);
			match(WS);
			setState(673);
			constSubStmt();
			setState(684);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(675);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(674);
						match(WS);
						}
					}

					setState(677);
					match(T__0);
					setState(679);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(678);
						match(WS);
						}
					}

					setState(681);
					constSubStmt();
					}
					} 
				}
				setState(686);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
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
		enterRule(_localctx, 44, RULE_constSubStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
			ambiguousIdentifier();
			setState(689);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0) || _la==AMPERSAND) {
				{
				setState(688);
				typeHint();
				}
			}

			setState(693);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(691);
				match(WS);
				setState(692);
				asTypeClause();
				}
				break;
			}
			setState(696);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(695);
				match(WS);
				}
			}

			setState(698);
			match(EQ);
			setState(700);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(699);
				match(WS);
				}
			}

			setState(702);
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
		enterRule(_localctx, 46, RULE_dateStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
			match(DATE);
			setState(706);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(705);
				match(WS);
				}
			}

			setState(708);
			match(EQ);
			setState(710);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(709);
				match(WS);
				}
				break;
			}
			setState(712);
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
		enterRule(_localctx, 48, RULE_declareStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(717);
			_la = _input.LA(1);
			if (((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (FRIEND - 77)) | (1L << (GLOBAL - 77)) | (1L << (PRIVATE - 77)))) != 0) || _la==PUBLIC) {
				{
				setState(714);
				visibility();
				setState(715);
				match(WS);
				}
			}

			setState(719);
			match(DECLARE);
			setState(720);
			match(WS);
			setState(723);
			_la = _input.LA(1);
			if (_la==PTRSAFE) {
				{
				setState(721);
				match(PTRSAFE);
				setState(722);
				match(WS);
				}
			}

			setState(730);
			switch (_input.LA(1)) {
			case FUNCTION:
				{
				{
				setState(725);
				match(FUNCTION);
				setState(727);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0) || _la==AMPERSAND) {
					{
					setState(726);
					typeHint();
					}
				}

				}
				}
				break;
			case SUB:
				{
				setState(729);
				match(SUB);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(732);
			match(WS);
			setState(733);
			ambiguousIdentifier();
			setState(735);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0) || _la==AMPERSAND) {
				{
				setState(734);
				typeHint();
				}
			}

			setState(737);
			match(WS);
			setState(738);
			match(LIB);
			setState(739);
			match(WS);
			setState(740);
			match(STRINGLITERAL);
			setState(745);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(741);
				match(WS);
				setState(742);
				match(ALIAS);
				setState(743);
				match(WS);
				setState(744);
				match(STRINGLITERAL);
				}
				break;
			}
			setState(751);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(748);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(747);
					match(WS);
					}
				}

				setState(750);
				argList();
				}
				break;
			}
			setState(755);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(753);
				match(WS);
				setState(754);
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
		enterRule(_localctx, 50, RULE_deftypeStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(757);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(758);
			match(WS);
			setState(759);
			letterrange();
			setState(770);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(761);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(760);
						match(WS);
						}
					}

					setState(763);
					match(T__0);
					setState(765);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(764);
						match(WS);
						}
					}

					setState(767);
					letterrange();
					}
					} 
				}
				setState(772);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
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
		enterRule(_localctx, 52, RULE_deleteSettingStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(773);
			match(DELETESETTING);
			setState(774);
			match(WS);
			setState(775);
			valueStmt(0);
			setState(777);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(776);
				match(WS);
				}
			}

			setState(779);
			match(T__0);
			setState(781);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(780);
				match(WS);
				}
				break;
			}
			setState(783);
			valueStmt(0);
			setState(792);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(785);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(784);
					match(WS);
					}
				}

				setState(787);
				match(T__0);
				setState(789);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
				case 1:
					{
					setState(788);
					match(WS);
					}
					break;
				}
				setState(791);
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
		enterRule(_localctx, 54, RULE_doLoopStmt);
		int _la;
		try {
			setState(821);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(794);
				match(DO);
				setState(795);
				endOfStatement();
				setState(797);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
				case 1:
					{
					setState(796);
					block();
					}
					break;
				}
				setState(799);
				match(LOOP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(801);
				match(DO);
				setState(802);
				match(WS);
				setState(803);
				_la = _input.LA(1);
				if ( !(_la==UNTIL || _la==WHILE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(804);
				match(WS);
				setState(805);
				valueStmt(0);
				setState(806);
				endOfStatement();
				setState(808);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
				case 1:
					{
					setState(807);
					block();
					}
					break;
				}
				setState(810);
				match(LOOP);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(812);
				match(DO);
				setState(813);
				endOfStatement();
				setState(814);
				block();
				setState(815);
				match(LOOP);
				setState(816);
				match(WS);
				setState(817);
				_la = _input.LA(1);
				if ( !(_la==UNTIL || _la==WHILE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(818);
				match(WS);
				setState(819);
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
		enterRule(_localctx, 56, RULE_endStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(823);
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
		enterRule(_localctx, 58, RULE_enumerationStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(828);
			_la = _input.LA(1);
			if (((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (FRIEND - 77)) | (1L << (GLOBAL - 77)) | (1L << (PRIVATE - 77)))) != 0) || _la==PUBLIC) {
				{
				setState(825);
				visibility();
				setState(826);
				match(WS);
				}
			}

			setState(830);
			match(ENUM);
			setState(831);
			match(WS);
			setState(832);
			ambiguousIdentifier();
			setState(833);
			endOfStatement();
			setState(837);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ENUM - 64)) | (1L << (EQV - 64)) | (1L << (ERASE - 64)) | (1L << (ERROR - 64)) | (1L << (EVENT - 64)) | (1L << (FALSE - 64)) | (1L << (FILECOPY - 64)) | (1L << (FRIEND - 64)) | (1L << (FOR - 64)) | (1L << (FUNCTION - 64)) | (1L << (GET - 64)) | (1L << (GLOBAL - 64)) | (1L << (GOSUB - 64)) | (1L << (GOTO - 64)) | (1L << (IF - 64)) | (1L << (IMP - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (IN - 64)) | (1L << (INPUT - 64)) | (1L << (IS - 64)) | (1L << (INTEGER - 64)) | (1L << (KILL - 64)) | (1L << (LOAD - 64)) | (1L << (LOCK - 64)) | (1L << (LONG - 64)) | (1L << (LOOP - 64)) | (1L << (LEN - 64)) | (1L << (LET - 64)) | (1L << (LIB - 64)) | (1L << (LIKE - 64)) | (1L << (LSET - 64)) | (1L << (ME - 64)) | (1L << (MID - 64)) | (1L << (MKDIR - 64)) | (1L << (MOD - 64)) | (1L << (NAME - 64)) | (1L << (NEXT - 64)) | (1L << (NEW - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (EMPTY - 64)) | (1L << (ON - 64)) | (1L << (OPEN - 64)) | (1L << (OPTIONAL - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (OR - 131)) | (1L << (OUTPUT - 131)) | (1L << (PARAMARRAY - 131)) | (1L << (PRESERVE - 131)) | (1L << (PRINT - 131)) | (1L << (PRIVATE - 131)) | (1L << (PUBLIC - 131)) | (1L << (PUT - 131)) | (1L << (RANDOM - 131)) | (1L << (RANDOMIZE - 131)) | (1L << (RAISEEVENT - 131)) | (1L << (READ - 131)) | (1L << (REDIM - 131)) | (1L << (REM - 131)) | (1L << (RESET - 131)) | (1L << (RESUME - 131)) | (1L << (RETURN - 131)) | (1L << (RMDIR - 131)) | (1L << (RSET - 131)) | (1L << (SAVEPICTURE - 131)) | (1L << (SAVESETTING - 131)) | (1L << (SEEK - 131)) | (1L << (SELECT - 131)) | (1L << (SENDKEYS - 131)) | (1L << (SET - 131)) | (1L << (SETATTR - 131)) | (1L << (SHARED - 131)) | (1L << (SINGLE - 131)) | (1L << (SPC - 131)) | (1L << (STATIC - 131)) | (1L << (STEP - 131)) | (1L << (STRING - 131)) | (1L << (SUB - 131)) | (1L << (TAB - 131)) | (1L << (TEXT - 131)) | (1L << (THEN - 131)) | (1L << (TIME - 131)) | (1L << (TO - 131)) | (1L << (TRUE - 131)) | (1L << (TYPE - 131)) | (1L << (TYPEOF - 131)) | (1L << (UNLOAD - 131)) | (1L << (UNLOCK - 131)) | (1L << (UNTIL - 131)) | (1L << (VARIANT - 131)) | (1L << (VERSION - 131)) | (1L << (WEND - 131)) | (1L << (WHILE - 131)) | (1L << (WIDTH - 131)) | (1L << (WITH - 131)) | (1L << (WITHEVENTS - 131)) | (1L << (WRITE - 131)) | (1L << (XOR - 131)))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(834);
				enumerationStmt_Constant();
				}
				}
				setState(839);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(840);
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
		enterRule(_localctx, 60, RULE_enumerationStmt_Constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(842);
			ambiguousIdentifier();
			setState(851);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(844);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(843);
					match(WS);
					}
				}

				setState(846);
				match(EQ);
				setState(848);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(847);
					match(WS);
					}
				}

				setState(850);
				constValueExpr(0);
				}
				break;
			}
			setState(853);
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
		enterRule(_localctx, 62, RULE_eraseStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(855);
			match(ERASE);
			setState(856);
			match(WS);
			setState(857);
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
		enterRule(_localctx, 64, RULE_errorStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(859);
			match(ERROR);
			setState(860);
			match(WS);
			setState(861);
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
		enterRule(_localctx, 66, RULE_eventStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(866);
			_la = _input.LA(1);
			if (((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (FRIEND - 77)) | (1L << (GLOBAL - 77)) | (1L << (PRIVATE - 77)))) != 0) || _la==PUBLIC) {
				{
				setState(863);
				visibility();
				setState(864);
				match(WS);
				}
			}

			setState(868);
			match(EVENT);
			setState(869);
			match(WS);
			setState(870);
			ambiguousIdentifier();
			setState(872);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(871);
				match(WS);
				}
			}

			setState(874);
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
		enterRule(_localctx, 68, RULE_exitStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(876);
			_la = _input.LA(1);
			if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (EXIT_DO - 69)) | (1L << (EXIT_FOR - 69)) | (1L << (EXIT_FUNCTION - 69)) | (1L << (EXIT_PROPERTY - 69)) | (1L << (EXIT_SUB - 69)) | (1L << (EXIT_RULE - 69)))) != 0)) ) {
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
		enterRule(_localctx, 70, RULE_filecopyStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(878);
			match(FILECOPY);
			setState(879);
			match(WS);
			setState(880);
			valueStmt(0);
			setState(882);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(881);
				match(WS);
				}
			}

			setState(884);
			match(T__0);
			setState(886);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(885);
				match(WS);
				}
				break;
			}
			setState(888);
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
		enterRule(_localctx, 72, RULE_forEachStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(890);
			match(FOR);
			setState(891);
			match(WS);
			setState(892);
			match(EACH);
			setState(893);
			match(WS);
			setState(894);
			ambiguousIdentifier();
			setState(896);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0) || _la==AMPERSAND) {
				{
				setState(895);
				typeHint();
				}
			}

			setState(898);
			match(WS);
			setState(899);
			match(IN);
			setState(900);
			match(WS);
			setState(901);
			valueStmt(0);
			setState(902);
			endOfStatement();
			setState(904);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(903);
				block();
				}
				break;
			}
			setState(906);
			match(NEXT);
			setState(909);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(907);
				match(WS);
				setState(908);
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
		enterRule(_localctx, 74, RULE_forNextStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(911);
			match(FOR);
			setState(912);
			match(WS);
			setState(913);
			ambiguousIdentifier();
			setState(915);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0) || _la==AMPERSAND) {
				{
				setState(914);
				typeHint();
				}
			}

			setState(919);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(917);
				match(WS);
				setState(918);
				asTypeClause();
				}
				break;
			}
			setState(922);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(921);
				match(WS);
				}
			}

			setState(924);
			match(EQ);
			setState(926);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(925);
				match(WS);
				}
				break;
			}
			setState(928);
			valueStmt(0);
			setState(929);
			match(WS);
			setState(930);
			match(TO);
			setState(931);
			match(WS);
			setState(932);
			valueStmt(0);
			setState(937);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(933);
				match(WS);
				setState(934);
				match(STEP);
				setState(935);
				match(WS);
				setState(936);
				valueStmt(0);
				}
				break;
			}
			setState(939);
			endOfStatement();
			setState(941);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				setState(940);
				block();
				}
				break;
			}
			setState(943);
			match(NEXT);
			setState(946);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(944);
				match(WS);
				setState(945);
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
		enterRule(_localctx, 76, RULE_functionStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(951);
			_la = _input.LA(1);
			if (((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (FRIEND - 77)) | (1L << (GLOBAL - 77)) | (1L << (PRIVATE - 77)))) != 0) || _la==PUBLIC) {
				{
				setState(948);
				visibility();
				setState(949);
				match(WS);
				}
			}

			setState(955);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(953);
				match(STATIC);
				setState(954);
				match(WS);
				}
			}

			setState(957);
			match(FUNCTION);
			setState(959);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(958);
				match(WS);
				}
			}

			setState(961);
			ambiguousIdentifier();
			setState(963);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0) || _la==AMPERSAND) {
				{
				setState(962);
				typeHint();
				}
			}

			setState(969);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(966);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(965);
					match(WS);
					}
				}

				setState(968);
				argList();
				}
				break;
			}
			setState(975);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				{
				setState(972);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(971);
					match(WS);
					}
				}

				setState(974);
				asTypeClause();
				}
				break;
			}
			setState(977);
			endOfStatement();
			setState(979);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH) | (1L << END))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ENUM - 64)) | (1L << (EQV - 64)) | (1L << (ERASE - 64)) | (1L << (ERROR - 64)) | (1L << (EVENT - 64)) | (1L << (EXIT_DO - 64)) | (1L << (EXIT_FOR - 64)) | (1L << (EXIT_FUNCTION - 64)) | (1L << (EXIT_PROPERTY - 64)) | (1L << (EXIT_SUB - 64)) | (1L << (EXIT_RULE - 64)) | (1L << (FALSE - 64)) | (1L << (FILECOPY - 64)) | (1L << (FRIEND - 64)) | (1L << (FOR - 64)) | (1L << (FUNCTION - 64)) | (1L << (GET - 64)) | (1L << (GLOBAL - 64)) | (1L << (GOSUB - 64)) | (1L << (GOTO - 64)) | (1L << (IF - 64)) | (1L << (IMP - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (IN - 64)) | (1L << (INPUT - 64)) | (1L << (IS - 64)) | (1L << (INTEGER - 64)) | (1L << (KILL - 64)) | (1L << (LOAD - 64)) | (1L << (LOCK - 64)) | (1L << (LONG - 64)) | (1L << (LOOP - 64)) | (1L << (LEN - 64)) | (1L << (LET - 64)) | (1L << (LIB - 64)) | (1L << (LIKE - 64)) | (1L << (LINE_INPUT - 64)) | (1L << (LSET - 64)) | (1L << (ME - 64)) | (1L << (MID - 64)) | (1L << (MKDIR - 64)) | (1L << (MOD - 64)) | (1L << (NAME - 64)) | (1L << (NEXT - 64)) | (1L << (NEW - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (EMPTY - 64)) | (1L << (ON - 64)) | (1L << (ON_ERROR - 64)) | (1L << (ON_LOCAL_ERROR - 64)) | (1L << (OPEN - 64)) | (1L << (OPTIONAL - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (OR - 131)) | (1L << (OUTPUT - 131)) | (1L << (PARAMARRAY - 131)) | (1L << (PRESERVE - 131)) | (1L << (PRINT - 131)) | (1L << (PRIVATE - 131)) | (1L << (PUBLIC - 131)) | (1L << (PUT - 131)) | (1L << (RANDOM - 131)) | (1L << (RANDOMIZE - 131)) | (1L << (RAISEEVENT - 131)) | (1L << (READ - 131)) | (1L << (REDIM - 131)) | (1L << (REM - 131)) | (1L << (RESET - 131)) | (1L << (RESUME - 131)) | (1L << (RETURN - 131)) | (1L << (RMDIR - 131)) | (1L << (RSET - 131)) | (1L << (SAVEPICTURE - 131)) | (1L << (SAVESETTING - 131)) | (1L << (SEEK - 131)) | (1L << (SELECT - 131)) | (1L << (SENDKEYS - 131)) | (1L << (SET - 131)) | (1L << (SETATTR - 131)) | (1L << (SHARED - 131)) | (1L << (SINGLE - 131)) | (1L << (SPC - 131)) | (1L << (STATIC - 131)) | (1L << (STEP - 131)) | (1L << (STOP - 131)) | (1L << (STRING - 131)) | (1L << (SUB - 131)) | (1L << (TAB - 131)) | (1L << (TEXT - 131)) | (1L << (THEN - 131)) | (1L << (TIME - 131)) | (1L << (TO - 131)) | (1L << (TRUE - 131)) | (1L << (TYPE - 131)) | (1L << (TYPEOF - 131)) | (1L << (UNLOAD - 131)) | (1L << (UNLOCK - 131)) | (1L << (UNTIL - 131)) | (1L << (VARIANT - 131)) | (1L << (VERSION - 131)) | (1L << (WEND - 131)) | (1L << (WHILE - 131)) | (1L << (WIDTH - 131)) | (1L << (WITH - 131)) | (1L << (WITHEVENTS - 131)) | (1L << (WRITE - 131)) | (1L << (XOR - 131)))) != 0) || _la==WS || _la==IDENTIFIER) {
				{
				setState(978);
				block();
				}
			}

			setState(981);
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
		enterRule(_localctx, 78, RULE_ruleStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(986);
			_la = _input.LA(1);
			if (((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (FRIEND - 77)) | (1L << (GLOBAL - 77)) | (1L << (PRIVATE - 77)))) != 0) || _la==PUBLIC) {
				{
				setState(983);
				visibility();
				setState(984);
				match(WS);
				}
			}

			setState(990);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(988);
				match(STATIC);
				setState(989);
				match(WS);
				}
			}

			setState(992);
			match(RULE);
			setState(994);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(993);
				match(WS);
				}
			}

			setState(996);
			ambiguousIdentifier();
			setState(998);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0) || _la==AMPERSAND) {
				{
				setState(997);
				typeHint();
				}
			}

			setState(1003);
			_la = _input.LA(1);
			if (_la==ALIAS) {
				{
				setState(1000);
				match(ALIAS);
				setState(1001);
				match(WS);
				setState(1002);
				ambiguousIdentifier();
				}
			}

			setState(1009);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				{
				setState(1006);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1005);
					match(WS);
					}
				}

				setState(1008);
				argList();
				}
				break;
			}
			setState(1015);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				{
				setState(1012);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1011);
					match(WS);
					}
				}

				setState(1014);
				asTypeClause();
				}
				break;
			}
			setState(1023);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				{
				setState(1018);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1017);
					match(WS);
					}
				}

				setState(1020);
				match(WHEN);
				setState(1021);
				match(WS);
				setState(1022);
				valueStmt(0);
				}
				break;
			}
			setState(1025);
			endOfStatement();
			setState(1027);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH) | (1L << END))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ENUM - 64)) | (1L << (EQV - 64)) | (1L << (ERASE - 64)) | (1L << (ERROR - 64)) | (1L << (EVENT - 64)) | (1L << (EXIT_DO - 64)) | (1L << (EXIT_FOR - 64)) | (1L << (EXIT_FUNCTION - 64)) | (1L << (EXIT_PROPERTY - 64)) | (1L << (EXIT_SUB - 64)) | (1L << (EXIT_RULE - 64)) | (1L << (FALSE - 64)) | (1L << (FILECOPY - 64)) | (1L << (FRIEND - 64)) | (1L << (FOR - 64)) | (1L << (FUNCTION - 64)) | (1L << (GET - 64)) | (1L << (GLOBAL - 64)) | (1L << (GOSUB - 64)) | (1L << (GOTO - 64)) | (1L << (IF - 64)) | (1L << (IMP - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (IN - 64)) | (1L << (INPUT - 64)) | (1L << (IS - 64)) | (1L << (INTEGER - 64)) | (1L << (KILL - 64)) | (1L << (LOAD - 64)) | (1L << (LOCK - 64)) | (1L << (LONG - 64)) | (1L << (LOOP - 64)) | (1L << (LEN - 64)) | (1L << (LET - 64)) | (1L << (LIB - 64)) | (1L << (LIKE - 64)) | (1L << (LINE_INPUT - 64)) | (1L << (LSET - 64)) | (1L << (ME - 64)) | (1L << (MID - 64)) | (1L << (MKDIR - 64)) | (1L << (MOD - 64)) | (1L << (NAME - 64)) | (1L << (NEXT - 64)) | (1L << (NEW - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (EMPTY - 64)) | (1L << (ON - 64)) | (1L << (ON_ERROR - 64)) | (1L << (ON_LOCAL_ERROR - 64)) | (1L << (OPEN - 64)) | (1L << (OPTIONAL - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (OR - 131)) | (1L << (OUTPUT - 131)) | (1L << (PARAMARRAY - 131)) | (1L << (PRESERVE - 131)) | (1L << (PRINT - 131)) | (1L << (PRIVATE - 131)) | (1L << (PUBLIC - 131)) | (1L << (PUT - 131)) | (1L << (RANDOM - 131)) | (1L << (RANDOMIZE - 131)) | (1L << (RAISEEVENT - 131)) | (1L << (READ - 131)) | (1L << (REDIM - 131)) | (1L << (REM - 131)) | (1L << (RESET - 131)) | (1L << (RESUME - 131)) | (1L << (RETURN - 131)) | (1L << (RMDIR - 131)) | (1L << (RSET - 131)) | (1L << (SAVEPICTURE - 131)) | (1L << (SAVESETTING - 131)) | (1L << (SEEK - 131)) | (1L << (SELECT - 131)) | (1L << (SENDKEYS - 131)) | (1L << (SET - 131)) | (1L << (SETATTR - 131)) | (1L << (SHARED - 131)) | (1L << (SINGLE - 131)) | (1L << (SPC - 131)) | (1L << (STATIC - 131)) | (1L << (STEP - 131)) | (1L << (STOP - 131)) | (1L << (STRING - 131)) | (1L << (SUB - 131)) | (1L << (TAB - 131)) | (1L << (TEXT - 131)) | (1L << (THEN - 131)) | (1L << (TIME - 131)) | (1L << (TO - 131)) | (1L << (TRUE - 131)) | (1L << (TYPE - 131)) | (1L << (TYPEOF - 131)) | (1L << (UNLOAD - 131)) | (1L << (UNLOCK - 131)) | (1L << (UNTIL - 131)) | (1L << (VARIANT - 131)) | (1L << (VERSION - 131)) | (1L << (WEND - 131)) | (1L << (WHILE - 131)) | (1L << (WIDTH - 131)) | (1L << (WITH - 131)) | (1L << (WITHEVENTS - 131)) | (1L << (WRITE - 131)) | (1L << (XOR - 131)))) != 0) || _la==WS || _la==IDENTIFIER) {
				{
				setState(1026);
				block();
				}
			}

			setState(1029);
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
		enterRule(_localctx, 80, RULE_getStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1031);
			match(GET);
			setState(1032);
			match(WS);
			setState(1033);
			fileNumber();
			setState(1035);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1034);
				match(WS);
				}
			}

			setState(1037);
			match(T__0);
			setState(1039);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				{
				setState(1038);
				match(WS);
				}
				break;
			}
			setState(1042);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				{
				setState(1041);
				valueStmt(0);
				}
				break;
			}
			setState(1045);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1044);
				match(WS);
				}
			}

			setState(1047);
			match(T__0);
			setState(1049);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				{
				setState(1048);
				match(WS);
				}
				break;
			}
			setState(1051);
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
		enterRule(_localctx, 82, RULE_goSubStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1053);
			match(GOSUB);
			setState(1054);
			match(WS);
			setState(1055);
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
		enterRule(_localctx, 84, RULE_goToStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1057);
			match(GOTO);
			setState(1058);
			match(WS);
			setState(1059);
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
		enterRule(_localctx, 86, RULE_ifThenElseStmt);
		int _la;
		try {
			setState(1086);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				_localctx = new InlineIfThenElseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1061);
				match(IF);
				setState(1062);
				match(WS);
				setState(1063);
				ifConditionStmt();
				setState(1064);
				match(WS);
				setState(1065);
				match(THEN);
				setState(1066);
				match(WS);
				setState(1067);
				blockStmt();
				setState(1072);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
				case 1:
					{
					setState(1068);
					match(WS);
					setState(1069);
					match(ELSE);
					setState(1070);
					match(WS);
					setState(1071);
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
				setState(1074);
				ifBlockStmt();
				setState(1078);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELSEIF) {
					{
					{
					setState(1075);
					ifElseIfBlockStmt();
					}
					}
					setState(1080);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1082);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1081);
					ifElseBlockStmt();
					}
				}

				setState(1084);
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
		enterRule(_localctx, 88, RULE_ifBlockStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1088);
			match(IF);
			setState(1089);
			match(WS);
			setState(1090);
			ifConditionStmt();
			setState(1091);
			match(WS);
			setState(1092);
			match(THEN);
			setState(1093);
			endOfStatement();
			setState(1095);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH) | (1L << END))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ENUM - 64)) | (1L << (EQV - 64)) | (1L << (ERASE - 64)) | (1L << (ERROR - 64)) | (1L << (EVENT - 64)) | (1L << (EXIT_DO - 64)) | (1L << (EXIT_FOR - 64)) | (1L << (EXIT_FUNCTION - 64)) | (1L << (EXIT_PROPERTY - 64)) | (1L << (EXIT_SUB - 64)) | (1L << (EXIT_RULE - 64)) | (1L << (FALSE - 64)) | (1L << (FILECOPY - 64)) | (1L << (FRIEND - 64)) | (1L << (FOR - 64)) | (1L << (FUNCTION - 64)) | (1L << (GET - 64)) | (1L << (GLOBAL - 64)) | (1L << (GOSUB - 64)) | (1L << (GOTO - 64)) | (1L << (IF - 64)) | (1L << (IMP - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (IN - 64)) | (1L << (INPUT - 64)) | (1L << (IS - 64)) | (1L << (INTEGER - 64)) | (1L << (KILL - 64)) | (1L << (LOAD - 64)) | (1L << (LOCK - 64)) | (1L << (LONG - 64)) | (1L << (LOOP - 64)) | (1L << (LEN - 64)) | (1L << (LET - 64)) | (1L << (LIB - 64)) | (1L << (LIKE - 64)) | (1L << (LINE_INPUT - 64)) | (1L << (LSET - 64)) | (1L << (ME - 64)) | (1L << (MID - 64)) | (1L << (MKDIR - 64)) | (1L << (MOD - 64)) | (1L << (NAME - 64)) | (1L << (NEXT - 64)) | (1L << (NEW - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (EMPTY - 64)) | (1L << (ON - 64)) | (1L << (ON_ERROR - 64)) | (1L << (ON_LOCAL_ERROR - 64)) | (1L << (OPEN - 64)) | (1L << (OPTIONAL - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (OR - 131)) | (1L << (OUTPUT - 131)) | (1L << (PARAMARRAY - 131)) | (1L << (PRESERVE - 131)) | (1L << (PRINT - 131)) | (1L << (PRIVATE - 131)) | (1L << (PUBLIC - 131)) | (1L << (PUT - 131)) | (1L << (RANDOM - 131)) | (1L << (RANDOMIZE - 131)) | (1L << (RAISEEVENT - 131)) | (1L << (READ - 131)) | (1L << (REDIM - 131)) | (1L << (REM - 131)) | (1L << (RESET - 131)) | (1L << (RESUME - 131)) | (1L << (RETURN - 131)) | (1L << (RMDIR - 131)) | (1L << (RSET - 131)) | (1L << (SAVEPICTURE - 131)) | (1L << (SAVESETTING - 131)) | (1L << (SEEK - 131)) | (1L << (SELECT - 131)) | (1L << (SENDKEYS - 131)) | (1L << (SET - 131)) | (1L << (SETATTR - 131)) | (1L << (SHARED - 131)) | (1L << (SINGLE - 131)) | (1L << (SPC - 131)) | (1L << (STATIC - 131)) | (1L << (STEP - 131)) | (1L << (STOP - 131)) | (1L << (STRING - 131)) | (1L << (SUB - 131)) | (1L << (TAB - 131)) | (1L << (TEXT - 131)) | (1L << (THEN - 131)) | (1L << (TIME - 131)) | (1L << (TO - 131)) | (1L << (TRUE - 131)) | (1L << (TYPE - 131)) | (1L << (TYPEOF - 131)) | (1L << (UNLOAD - 131)) | (1L << (UNLOCK - 131)) | (1L << (UNTIL - 131)) | (1L << (VARIANT - 131)) | (1L << (VERSION - 131)) | (1L << (WEND - 131)) | (1L << (WHILE - 131)) | (1L << (WIDTH - 131)) | (1L << (WITH - 131)) | (1L << (WITHEVENTS - 131)) | (1L << (WRITE - 131)) | (1L << (XOR - 131)))) != 0) || _la==WS || _la==IDENTIFIER) {
				{
				setState(1094);
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
		enterRule(_localctx, 90, RULE_ifConditionStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1097);
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
		enterRule(_localctx, 92, RULE_ifElseIfBlockStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1099);
			match(ELSEIF);
			setState(1100);
			match(WS);
			setState(1101);
			ifConditionStmt();
			setState(1102);
			match(WS);
			setState(1103);
			match(THEN);
			setState(1104);
			endOfStatement();
			setState(1106);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH) | (1L << END))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ENUM - 64)) | (1L << (EQV - 64)) | (1L << (ERASE - 64)) | (1L << (ERROR - 64)) | (1L << (EVENT - 64)) | (1L << (EXIT_DO - 64)) | (1L << (EXIT_FOR - 64)) | (1L << (EXIT_FUNCTION - 64)) | (1L << (EXIT_PROPERTY - 64)) | (1L << (EXIT_SUB - 64)) | (1L << (EXIT_RULE - 64)) | (1L << (FALSE - 64)) | (1L << (FILECOPY - 64)) | (1L << (FRIEND - 64)) | (1L << (FOR - 64)) | (1L << (FUNCTION - 64)) | (1L << (GET - 64)) | (1L << (GLOBAL - 64)) | (1L << (GOSUB - 64)) | (1L << (GOTO - 64)) | (1L << (IF - 64)) | (1L << (IMP - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (IN - 64)) | (1L << (INPUT - 64)) | (1L << (IS - 64)) | (1L << (INTEGER - 64)) | (1L << (KILL - 64)) | (1L << (LOAD - 64)) | (1L << (LOCK - 64)) | (1L << (LONG - 64)) | (1L << (LOOP - 64)) | (1L << (LEN - 64)) | (1L << (LET - 64)) | (1L << (LIB - 64)) | (1L << (LIKE - 64)) | (1L << (LINE_INPUT - 64)) | (1L << (LSET - 64)) | (1L << (ME - 64)) | (1L << (MID - 64)) | (1L << (MKDIR - 64)) | (1L << (MOD - 64)) | (1L << (NAME - 64)) | (1L << (NEXT - 64)) | (1L << (NEW - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (EMPTY - 64)) | (1L << (ON - 64)) | (1L << (ON_ERROR - 64)) | (1L << (ON_LOCAL_ERROR - 64)) | (1L << (OPEN - 64)) | (1L << (OPTIONAL - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (OR - 131)) | (1L << (OUTPUT - 131)) | (1L << (PARAMARRAY - 131)) | (1L << (PRESERVE - 131)) | (1L << (PRINT - 131)) | (1L << (PRIVATE - 131)) | (1L << (PUBLIC - 131)) | (1L << (PUT - 131)) | (1L << (RANDOM - 131)) | (1L << (RANDOMIZE - 131)) | (1L << (RAISEEVENT - 131)) | (1L << (READ - 131)) | (1L << (REDIM - 131)) | (1L << (REM - 131)) | (1L << (RESET - 131)) | (1L << (RESUME - 131)) | (1L << (RETURN - 131)) | (1L << (RMDIR - 131)) | (1L << (RSET - 131)) | (1L << (SAVEPICTURE - 131)) | (1L << (SAVESETTING - 131)) | (1L << (SEEK - 131)) | (1L << (SELECT - 131)) | (1L << (SENDKEYS - 131)) | (1L << (SET - 131)) | (1L << (SETATTR - 131)) | (1L << (SHARED - 131)) | (1L << (SINGLE - 131)) | (1L << (SPC - 131)) | (1L << (STATIC - 131)) | (1L << (STEP - 131)) | (1L << (STOP - 131)) | (1L << (STRING - 131)) | (1L << (SUB - 131)) | (1L << (TAB - 131)) | (1L << (TEXT - 131)) | (1L << (THEN - 131)) | (1L << (TIME - 131)) | (1L << (TO - 131)) | (1L << (TRUE - 131)) | (1L << (TYPE - 131)) | (1L << (TYPEOF - 131)) | (1L << (UNLOAD - 131)) | (1L << (UNLOCK - 131)) | (1L << (UNTIL - 131)) | (1L << (VARIANT - 131)) | (1L << (VERSION - 131)) | (1L << (WEND - 131)) | (1L << (WHILE - 131)) | (1L << (WIDTH - 131)) | (1L << (WITH - 131)) | (1L << (WITHEVENTS - 131)) | (1L << (WRITE - 131)) | (1L << (XOR - 131)))) != 0) || _la==WS || _la==IDENTIFIER) {
				{
				setState(1105);
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
		enterRule(_localctx, 94, RULE_ifElseBlockStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1108);
			match(ELSE);
			setState(1109);
			endOfStatement();
			setState(1111);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH) | (1L << END))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ENUM - 64)) | (1L << (EQV - 64)) | (1L << (ERASE - 64)) | (1L << (ERROR - 64)) | (1L << (EVENT - 64)) | (1L << (EXIT_DO - 64)) | (1L << (EXIT_FOR - 64)) | (1L << (EXIT_FUNCTION - 64)) | (1L << (EXIT_PROPERTY - 64)) | (1L << (EXIT_SUB - 64)) | (1L << (EXIT_RULE - 64)) | (1L << (FALSE - 64)) | (1L << (FILECOPY - 64)) | (1L << (FRIEND - 64)) | (1L << (FOR - 64)) | (1L << (FUNCTION - 64)) | (1L << (GET - 64)) | (1L << (GLOBAL - 64)) | (1L << (GOSUB - 64)) | (1L << (GOTO - 64)) | (1L << (IF - 64)) | (1L << (IMP - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (IN - 64)) | (1L << (INPUT - 64)) | (1L << (IS - 64)) | (1L << (INTEGER - 64)) | (1L << (KILL - 64)) | (1L << (LOAD - 64)) | (1L << (LOCK - 64)) | (1L << (LONG - 64)) | (1L << (LOOP - 64)) | (1L << (LEN - 64)) | (1L << (LET - 64)) | (1L << (LIB - 64)) | (1L << (LIKE - 64)) | (1L << (LINE_INPUT - 64)) | (1L << (LSET - 64)) | (1L << (ME - 64)) | (1L << (MID - 64)) | (1L << (MKDIR - 64)) | (1L << (MOD - 64)) | (1L << (NAME - 64)) | (1L << (NEXT - 64)) | (1L << (NEW - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (EMPTY - 64)) | (1L << (ON - 64)) | (1L << (ON_ERROR - 64)) | (1L << (ON_LOCAL_ERROR - 64)) | (1L << (OPEN - 64)) | (1L << (OPTIONAL - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (OR - 131)) | (1L << (OUTPUT - 131)) | (1L << (PARAMARRAY - 131)) | (1L << (PRESERVE - 131)) | (1L << (PRINT - 131)) | (1L << (PRIVATE - 131)) | (1L << (PUBLIC - 131)) | (1L << (PUT - 131)) | (1L << (RANDOM - 131)) | (1L << (RANDOMIZE - 131)) | (1L << (RAISEEVENT - 131)) | (1L << (READ - 131)) | (1L << (REDIM - 131)) | (1L << (REM - 131)) | (1L << (RESET - 131)) | (1L << (RESUME - 131)) | (1L << (RETURN - 131)) | (1L << (RMDIR - 131)) | (1L << (RSET - 131)) | (1L << (SAVEPICTURE - 131)) | (1L << (SAVESETTING - 131)) | (1L << (SEEK - 131)) | (1L << (SELECT - 131)) | (1L << (SENDKEYS - 131)) | (1L << (SET - 131)) | (1L << (SETATTR - 131)) | (1L << (SHARED - 131)) | (1L << (SINGLE - 131)) | (1L << (SPC - 131)) | (1L << (STATIC - 131)) | (1L << (STEP - 131)) | (1L << (STOP - 131)) | (1L << (STRING - 131)) | (1L << (SUB - 131)) | (1L << (TAB - 131)) | (1L << (TEXT - 131)) | (1L << (THEN - 131)) | (1L << (TIME - 131)) | (1L << (TO - 131)) | (1L << (TRUE - 131)) | (1L << (TYPE - 131)) | (1L << (TYPEOF - 131)) | (1L << (UNLOAD - 131)) | (1L << (UNLOCK - 131)) | (1L << (UNTIL - 131)) | (1L << (VARIANT - 131)) | (1L << (VERSION - 131)) | (1L << (WEND - 131)) | (1L << (WHILE - 131)) | (1L << (WIDTH - 131)) | (1L << (WITH - 131)) | (1L << (WITHEVENTS - 131)) | (1L << (WRITE - 131)) | (1L << (XOR - 131)))) != 0) || _la==WS || _la==IDENTIFIER) {
				{
				setState(1110);
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
		enterRule(_localctx, 96, RULE_implementsStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1113);
			match(IMPLEMENTS);
			setState(1114);
			match(WS);
			setState(1115);
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
		enterRule(_localctx, 98, RULE_inputStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1117);
			match(INPUT);
			setState(1118);
			match(WS);
			setState(1119);
			fileNumber();
			setState(1128); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1121);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(1120);
						match(WS);
						}
					}

					setState(1123);
					match(T__0);
					setState(1125);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
					case 1:
						{
						setState(1124);
						match(WS);
						}
						break;
					}
					setState(1127);
					valueStmt(0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1130); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
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
		enterRule(_localctx, 100, RULE_killStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1132);
			match(KILL);
			setState(1133);
			match(WS);
			setState(1134);
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
		enterRule(_localctx, 102, RULE_letStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				{
				setState(1136);
				match(LET);
				setState(1137);
				match(WS);
				}
				break;
			}
			setState(1140);
			implicitCallStmt_InStmt();
			setState(1142);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1141);
				match(WS);
				}
			}

			setState(1144);
			_la = _input.LA(1);
			if ( !(((((_la - 198)) & ~0x3f) == 0 && ((1L << (_la - 198)) & ((1L << (EQ - 198)) | (1L << (MINUS_EQ - 198)) | (1L << (PLUS_EQ - 198)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				{
				setState(1145);
				match(WS);
				}
				break;
			}
			setState(1148);
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
		enterRule(_localctx, 104, RULE_lineInputStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1150);
			match(LINE_INPUT);
			setState(1151);
			match(WS);
			setState(1152);
			fileNumber();
			setState(1154);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1153);
				match(WS);
				}
			}

			setState(1156);
			match(T__0);
			setState(1158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				{
				setState(1157);
				match(WS);
				}
				break;
			}
			setState(1160);
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
		enterRule(_localctx, 106, RULE_loadStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1162);
			match(LOAD);
			setState(1163);
			match(WS);
			setState(1164);
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
		enterRule(_localctx, 108, RULE_lockStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1166);
			match(LOCK);
			setState(1167);
			match(WS);
			setState(1168);
			valueStmt(0);
			setState(1183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				{
				setState(1170);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1169);
					match(WS);
					}
				}

				setState(1172);
				match(T__0);
				setState(1174);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
				case 1:
					{
					setState(1173);
					match(WS);
					}
					break;
				}
				setState(1176);
				valueStmt(0);
				setState(1181);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
				case 1:
					{
					setState(1177);
					match(WS);
					setState(1178);
					match(TO);
					setState(1179);
					match(WS);
					setState(1180);
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
		enterRule(_localctx, 110, RULE_lsetStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1185);
			match(LSET);
			setState(1186);
			match(WS);
			setState(1187);
			implicitCallStmt_InStmt();
			setState(1189);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1188);
				match(WS);
				}
			}

			setState(1191);
			match(EQ);
			setState(1193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				{
				setState(1192);
				match(WS);
				}
				break;
			}
			setState(1195);
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
		enterRule(_localctx, 112, RULE_macroConstStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1197);
			match(MACRO_CONST);
			setState(1199);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1198);
				match(WS);
				}
			}

			setState(1201);
			ambiguousIdentifier();
			setState(1203);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1202);
				match(WS);
				}
			}

			setState(1205);
			match(EQ);
			setState(1207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				{
				setState(1206);
				match(WS);
				}
				break;
			}
			setState(1209);
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
		enterRule(_localctx, 114, RULE_macroIfThenElseStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1211);
			macroIfBlockStmt();
			setState(1215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MACRO_ELSEIF) {
				{
				{
				setState(1212);
				macroElseIfBlockStmt();
				}
				}
				setState(1217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1219);
			_la = _input.LA(1);
			if (_la==MACRO_ELSE) {
				{
				setState(1218);
				macroElseBlockStmt();
				}
			}

			setState(1221);
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
		enterRule(_localctx, 116, RULE_macroIfBlockStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1223);
			match(MACRO_IF);
			setState(1225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				{
				setState(1224);
				match(WS);
				}
				break;
			}
			setState(1227);
			ifConditionStmt();
			setState(1228);
			match(WS);
			setState(1229);
			match(THEN);
			setState(1230);
			endOfStatement();
			setState(1236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH) | (1L << END))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ENUM - 64)) | (1L << (EQV - 64)) | (1L << (ERASE - 64)) | (1L << (ERROR - 64)) | (1L << (EVENT - 64)) | (1L << (EXIT_DO - 64)) | (1L << (EXIT_FOR - 64)) | (1L << (EXIT_FUNCTION - 64)) | (1L << (EXIT_PROPERTY - 64)) | (1L << (EXIT_SUB - 64)) | (1L << (EXIT_RULE - 64)) | (1L << (FALSE - 64)) | (1L << (FILECOPY - 64)) | (1L << (FRIEND - 64)) | (1L << (FOR - 64)) | (1L << (FUNCTION - 64)) | (1L << (RULE - 64)) | (1L << (GET - 64)) | (1L << (GLOBAL - 64)) | (1L << (GOSUB - 64)) | (1L << (GOTO - 64)) | (1L << (IF - 64)) | (1L << (IMP - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (IN - 64)) | (1L << (INPUT - 64)) | (1L << (IS - 64)) | (1L << (INTEGER - 64)) | (1L << (KILL - 64)) | (1L << (LOAD - 64)) | (1L << (LOCK - 64)) | (1L << (LONG - 64)) | (1L << (LOOP - 64)) | (1L << (LEN - 64)) | (1L << (LET - 64)) | (1L << (LIB - 64)) | (1L << (LIKE - 64)) | (1L << (LINE_INPUT - 64)) | (1L << (LSET - 64)) | (1L << (ME - 64)) | (1L << (MID - 64)) | (1L << (MKDIR - 64)) | (1L << (MOD - 64)) | (1L << (NAME - 64)) | (1L << (NEXT - 64)) | (1L << (NEW - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (EMPTY - 64)) | (1L << (ON - 64)) | (1L << (ON_ERROR - 64)) | (1L << (ON_LOCAL_ERROR - 64)) | (1L << (OPEN - 64)) | (1L << (OPTIONAL - 64)) | (1L << (OPTION_BASE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (OPTION_EXPLICIT - 128)) | (1L << (OPTION_COMPARE - 128)) | (1L << (OPTION_PRIVATE_MODULE - 128)) | (1L << (OR - 128)) | (1L << (OUTPUT - 128)) | (1L << (PARAMARRAY - 128)) | (1L << (PRESERVE - 128)) | (1L << (PRINT - 128)) | (1L << (PRIVATE - 128)) | (1L << (PROPERTY_GET - 128)) | (1L << (PROPERTY_LET - 128)) | (1L << (PROPERTY_SET - 128)) | (1L << (PUBLIC - 128)) | (1L << (PUT - 128)) | (1L << (RANDOM - 128)) | (1L << (RANDOMIZE - 128)) | (1L << (RAISEEVENT - 128)) | (1L << (READ - 128)) | (1L << (REDIM - 128)) | (1L << (REM - 128)) | (1L << (RESET - 128)) | (1L << (RESUME - 128)) | (1L << (RETURN - 128)) | (1L << (RMDIR - 128)) | (1L << (RSET - 128)) | (1L << (SAVEPICTURE - 128)) | (1L << (SAVESETTING - 128)) | (1L << (SEEK - 128)) | (1L << (SELECT - 128)) | (1L << (SENDKEYS - 128)) | (1L << (SET - 128)) | (1L << (SETATTR - 128)) | (1L << (SHARED - 128)) | (1L << (SINGLE - 128)) | (1L << (SPC - 128)) | (1L << (STATIC - 128)) | (1L << (STEP - 128)) | (1L << (STOP - 128)) | (1L << (STRING - 128)) | (1L << (SUB - 128)) | (1L << (TAB - 128)) | (1L << (TEXT - 128)) | (1L << (THEN - 128)) | (1L << (TIME - 128)) | (1L << (TO - 128)) | (1L << (TRUE - 128)) | (1L << (TYPE - 128)) | (1L << (TYPEOF - 128)) | (1L << (UNLOAD - 128)) | (1L << (UNLOCK - 128)) | (1L << (UNTIL - 128)) | (1L << (VARIANT - 128)) | (1L << (VERSION - 128)) | (1L << (WEND - 128)) | (1L << (WHILE - 128)) | (1L << (WIDTH - 128)) | (1L << (WITH - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (WITHEVENTS - 192)) | (1L << (WRITE - 192)) | (1L << (XOR - 192)) | (1L << (COMMENT - 192)) | (1L << (WS - 192)) | (1L << (IDENTIFIER - 192)))) != 0)) {
				{
				setState(1234);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
				case 1:
					{
					setState(1231);
					moduleDeclarations();
					}
					break;
				case 2:
					{
					setState(1232);
					moduleBody();
					}
					break;
				case 3:
					{
					setState(1233);
					block();
					}
					break;
				}
				}
				setState(1238);
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
		enterRule(_localctx, 118, RULE_macroElseIfBlockStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1239);
			match(MACRO_ELSEIF);
			setState(1241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				{
				setState(1240);
				match(WS);
				}
				break;
			}
			setState(1243);
			ifConditionStmt();
			setState(1244);
			match(WS);
			setState(1245);
			match(THEN);
			setState(1246);
			endOfStatement();
			setState(1252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH) | (1L << END))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ENUM - 64)) | (1L << (EQV - 64)) | (1L << (ERASE - 64)) | (1L << (ERROR - 64)) | (1L << (EVENT - 64)) | (1L << (EXIT_DO - 64)) | (1L << (EXIT_FOR - 64)) | (1L << (EXIT_FUNCTION - 64)) | (1L << (EXIT_PROPERTY - 64)) | (1L << (EXIT_SUB - 64)) | (1L << (EXIT_RULE - 64)) | (1L << (FALSE - 64)) | (1L << (FILECOPY - 64)) | (1L << (FRIEND - 64)) | (1L << (FOR - 64)) | (1L << (FUNCTION - 64)) | (1L << (RULE - 64)) | (1L << (GET - 64)) | (1L << (GLOBAL - 64)) | (1L << (GOSUB - 64)) | (1L << (GOTO - 64)) | (1L << (IF - 64)) | (1L << (IMP - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (IN - 64)) | (1L << (INPUT - 64)) | (1L << (IS - 64)) | (1L << (INTEGER - 64)) | (1L << (KILL - 64)) | (1L << (LOAD - 64)) | (1L << (LOCK - 64)) | (1L << (LONG - 64)) | (1L << (LOOP - 64)) | (1L << (LEN - 64)) | (1L << (LET - 64)) | (1L << (LIB - 64)) | (1L << (LIKE - 64)) | (1L << (LINE_INPUT - 64)) | (1L << (LSET - 64)) | (1L << (ME - 64)) | (1L << (MID - 64)) | (1L << (MKDIR - 64)) | (1L << (MOD - 64)) | (1L << (NAME - 64)) | (1L << (NEXT - 64)) | (1L << (NEW - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (EMPTY - 64)) | (1L << (ON - 64)) | (1L << (ON_ERROR - 64)) | (1L << (ON_LOCAL_ERROR - 64)) | (1L << (OPEN - 64)) | (1L << (OPTIONAL - 64)) | (1L << (OPTION_BASE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (OPTION_EXPLICIT - 128)) | (1L << (OPTION_COMPARE - 128)) | (1L << (OPTION_PRIVATE_MODULE - 128)) | (1L << (OR - 128)) | (1L << (OUTPUT - 128)) | (1L << (PARAMARRAY - 128)) | (1L << (PRESERVE - 128)) | (1L << (PRINT - 128)) | (1L << (PRIVATE - 128)) | (1L << (PROPERTY_GET - 128)) | (1L << (PROPERTY_LET - 128)) | (1L << (PROPERTY_SET - 128)) | (1L << (PUBLIC - 128)) | (1L << (PUT - 128)) | (1L << (RANDOM - 128)) | (1L << (RANDOMIZE - 128)) | (1L << (RAISEEVENT - 128)) | (1L << (READ - 128)) | (1L << (REDIM - 128)) | (1L << (REM - 128)) | (1L << (RESET - 128)) | (1L << (RESUME - 128)) | (1L << (RETURN - 128)) | (1L << (RMDIR - 128)) | (1L << (RSET - 128)) | (1L << (SAVEPICTURE - 128)) | (1L << (SAVESETTING - 128)) | (1L << (SEEK - 128)) | (1L << (SELECT - 128)) | (1L << (SENDKEYS - 128)) | (1L << (SET - 128)) | (1L << (SETATTR - 128)) | (1L << (SHARED - 128)) | (1L << (SINGLE - 128)) | (1L << (SPC - 128)) | (1L << (STATIC - 128)) | (1L << (STEP - 128)) | (1L << (STOP - 128)) | (1L << (STRING - 128)) | (1L << (SUB - 128)) | (1L << (TAB - 128)) | (1L << (TEXT - 128)) | (1L << (THEN - 128)) | (1L << (TIME - 128)) | (1L << (TO - 128)) | (1L << (TRUE - 128)) | (1L << (TYPE - 128)) | (1L << (TYPEOF - 128)) | (1L << (UNLOAD - 128)) | (1L << (UNLOCK - 128)) | (1L << (UNTIL - 128)) | (1L << (VARIANT - 128)) | (1L << (VERSION - 128)) | (1L << (WEND - 128)) | (1L << (WHILE - 128)) | (1L << (WIDTH - 128)) | (1L << (WITH - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (WITHEVENTS - 192)) | (1L << (WRITE - 192)) | (1L << (XOR - 192)) | (1L << (COMMENT - 192)) | (1L << (WS - 192)) | (1L << (IDENTIFIER - 192)))) != 0)) {
				{
				setState(1250);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
				case 1:
					{
					setState(1247);
					moduleDeclarations();
					}
					break;
				case 2:
					{
					setState(1248);
					moduleBody();
					}
					break;
				case 3:
					{
					setState(1249);
					block();
					}
					break;
				}
				}
				setState(1254);
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
		enterRule(_localctx, 120, RULE_macroElseBlockStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1255);
			match(MACRO_ELSE);
			setState(1256);
			endOfStatement();
			setState(1262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH) | (1L << END))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ENUM - 64)) | (1L << (EQV - 64)) | (1L << (ERASE - 64)) | (1L << (ERROR - 64)) | (1L << (EVENT - 64)) | (1L << (EXIT_DO - 64)) | (1L << (EXIT_FOR - 64)) | (1L << (EXIT_FUNCTION - 64)) | (1L << (EXIT_PROPERTY - 64)) | (1L << (EXIT_SUB - 64)) | (1L << (EXIT_RULE - 64)) | (1L << (FALSE - 64)) | (1L << (FILECOPY - 64)) | (1L << (FRIEND - 64)) | (1L << (FOR - 64)) | (1L << (FUNCTION - 64)) | (1L << (RULE - 64)) | (1L << (GET - 64)) | (1L << (GLOBAL - 64)) | (1L << (GOSUB - 64)) | (1L << (GOTO - 64)) | (1L << (IF - 64)) | (1L << (IMP - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (IN - 64)) | (1L << (INPUT - 64)) | (1L << (IS - 64)) | (1L << (INTEGER - 64)) | (1L << (KILL - 64)) | (1L << (LOAD - 64)) | (1L << (LOCK - 64)) | (1L << (LONG - 64)) | (1L << (LOOP - 64)) | (1L << (LEN - 64)) | (1L << (LET - 64)) | (1L << (LIB - 64)) | (1L << (LIKE - 64)) | (1L << (LINE_INPUT - 64)) | (1L << (LSET - 64)) | (1L << (ME - 64)) | (1L << (MID - 64)) | (1L << (MKDIR - 64)) | (1L << (MOD - 64)) | (1L << (NAME - 64)) | (1L << (NEXT - 64)) | (1L << (NEW - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (EMPTY - 64)) | (1L << (ON - 64)) | (1L << (ON_ERROR - 64)) | (1L << (ON_LOCAL_ERROR - 64)) | (1L << (OPEN - 64)) | (1L << (OPTIONAL - 64)) | (1L << (OPTION_BASE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (OPTION_EXPLICIT - 128)) | (1L << (OPTION_COMPARE - 128)) | (1L << (OPTION_PRIVATE_MODULE - 128)) | (1L << (OR - 128)) | (1L << (OUTPUT - 128)) | (1L << (PARAMARRAY - 128)) | (1L << (PRESERVE - 128)) | (1L << (PRINT - 128)) | (1L << (PRIVATE - 128)) | (1L << (PROPERTY_GET - 128)) | (1L << (PROPERTY_LET - 128)) | (1L << (PROPERTY_SET - 128)) | (1L << (PUBLIC - 128)) | (1L << (PUT - 128)) | (1L << (RANDOM - 128)) | (1L << (RANDOMIZE - 128)) | (1L << (RAISEEVENT - 128)) | (1L << (READ - 128)) | (1L << (REDIM - 128)) | (1L << (REM - 128)) | (1L << (RESET - 128)) | (1L << (RESUME - 128)) | (1L << (RETURN - 128)) | (1L << (RMDIR - 128)) | (1L << (RSET - 128)) | (1L << (SAVEPICTURE - 128)) | (1L << (SAVESETTING - 128)) | (1L << (SEEK - 128)) | (1L << (SELECT - 128)) | (1L << (SENDKEYS - 128)) | (1L << (SET - 128)) | (1L << (SETATTR - 128)) | (1L << (SHARED - 128)) | (1L << (SINGLE - 128)) | (1L << (SPC - 128)) | (1L << (STATIC - 128)) | (1L << (STEP - 128)) | (1L << (STOP - 128)) | (1L << (STRING - 128)) | (1L << (SUB - 128)) | (1L << (TAB - 128)) | (1L << (TEXT - 128)) | (1L << (THEN - 128)) | (1L << (TIME - 128)) | (1L << (TO - 128)) | (1L << (TRUE - 128)) | (1L << (TYPE - 128)) | (1L << (TYPEOF - 128)) | (1L << (UNLOAD - 128)) | (1L << (UNLOCK - 128)) | (1L << (UNTIL - 128)) | (1L << (VARIANT - 128)) | (1L << (VERSION - 128)) | (1L << (WEND - 128)) | (1L << (WHILE - 128)) | (1L << (WIDTH - 128)) | (1L << (WITH - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (WITHEVENTS - 192)) | (1L << (WRITE - 192)) | (1L << (XOR - 192)) | (1L << (COMMENT - 192)) | (1L << (WS - 192)) | (1L << (IDENTIFIER - 192)))) != 0)) {
				{
				setState(1260);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
				case 1:
					{
					setState(1257);
					moduleDeclarations();
					}
					break;
				case 2:
					{
					setState(1258);
					moduleBody();
					}
					break;
				case 3:
					{
					setState(1259);
					block();
					}
					break;
				}
				}
				setState(1264);
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
		enterRule(_localctx, 122, RULE_midStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1265);
			match(MID);
			setState(1267);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1266);
				match(WS);
				}
			}

			setState(1269);
			match(LPAREN);
			setState(1271);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1270);
				match(WS);
				}
			}

			setState(1273);
			ambiguousIdentifier();
			setState(1275);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1274);
				match(WS);
				}
			}

			setState(1277);
			match(T__0);
			setState(1279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				{
				setState(1278);
				match(WS);
				}
				break;
			}
			setState(1281);
			valueStmt(0);
			setState(1290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				{
				setState(1283);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1282);
					match(WS);
					}
				}

				setState(1285);
				match(T__0);
				setState(1287);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
				case 1:
					{
					setState(1286);
					match(WS);
					}
					break;
				}
				setState(1289);
				valueStmt(0);
				}
				break;
			}
			setState(1293);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1292);
				match(WS);
				}
			}

			setState(1295);
			match(RPAREN);
			setState(1297);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1296);
				match(WS);
				}
			}

			setState(1299);
			match(EQ);
			setState(1301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				{
				setState(1300);
				match(WS);
				}
				break;
			}
			setState(1303);
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
		enterRule(_localctx, 124, RULE_mkdirStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1305);
			match(MKDIR);
			setState(1306);
			match(WS);
			setState(1307);
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
		enterRule(_localctx, 126, RULE_nameStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1309);
			match(NAME);
			setState(1310);
			match(WS);
			setState(1311);
			valueStmt(0);
			setState(1312);
			match(WS);
			setState(1313);
			match(AS);
			setState(1314);
			match(WS);
			setState(1315);
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
		enterRule(_localctx, 128, RULE_onErrorStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1317);
			_la = _input.LA(1);
			if ( !(_la==ON_ERROR || _la==ON_LOCAL_ERROR) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1318);
			match(WS);
			setState(1325);
			switch (_input.LA(1)) {
			case GOTO:
				{
				setState(1319);
				match(GOTO);
				setState(1320);
				match(WS);
				setState(1321);
				ambiguousIdentifier();
				}
				break;
			case RESUME:
				{
				setState(1322);
				match(RESUME);
				setState(1323);
				match(WS);
				setState(1324);
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
		enterRule(_localctx, 130, RULE_onGoToStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1327);
			match(ON);
			setState(1328);
			match(WS);
			setState(1329);
			valueStmt(0);
			setState(1330);
			match(WS);
			setState(1331);
			match(GOTO);
			setState(1332);
			match(WS);
			setState(1333);
			ambiguousIdentifier();
			setState(1344);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1335);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(1334);
						match(WS);
						}
					}

					setState(1337);
					match(T__0);
					setState(1339);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(1338);
						match(WS);
						}
					}

					setState(1341);
					ambiguousIdentifier();
					}
					} 
				}
				setState(1346);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
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
		enterRule(_localctx, 132, RULE_onGoSubStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1347);
			match(ON);
			setState(1348);
			match(WS);
			setState(1349);
			valueStmt(0);
			setState(1350);
			match(WS);
			setState(1351);
			match(GOSUB);
			setState(1352);
			match(WS);
			setState(1353);
			ambiguousIdentifier();
			setState(1364);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1355);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(1354);
						match(WS);
						}
					}

					setState(1357);
					match(T__0);
					setState(1359);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(1358);
						match(WS);
						}
					}

					setState(1361);
					ambiguousIdentifier();
					}
					} 
				}
				setState(1366);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
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
		enterRule(_localctx, 134, RULE_openStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1367);
			match(OPEN);
			setState(1368);
			match(WS);
			setState(1369);
			valueStmt(0);
			setState(1370);
			match(WS);
			setState(1371);
			match(FOR);
			setState(1372);
			match(WS);
			setState(1373);
			_la = _input.LA(1);
			if ( !(_la==APPEND || _la==BINARY || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (INPUT - 89)) | (1L << (OUTPUT - 89)) | (1L << (RANDOM - 89)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				{
				setState(1374);
				match(WS);
				setState(1375);
				match(ACCESS);
				setState(1376);
				match(WS);
				setState(1377);
				_la = _input.LA(1);
				if ( !(((((_la - 146)) & ~0x3f) == 0 && ((1L << (_la - 146)) & ((1L << (READ - 146)) | (1L << (READ_WRITE - 146)) | (1L << (WRITE - 146)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			}
			setState(1382);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				{
				setState(1380);
				match(WS);
				setState(1381);
				_la = _input.LA(1);
				if ( !(((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (LOCK_READ - 102)) | (1L << (LOCK_WRITE - 102)) | (1L << (LOCK_READ_WRITE - 102)) | (1L << (SHARED - 102)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			}
			setState(1384);
			match(WS);
			setState(1385);
			match(AS);
			setState(1386);
			match(WS);
			setState(1387);
			fileNumber();
			setState(1398);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
			case 1:
				{
				setState(1388);
				match(WS);
				setState(1389);
				match(LEN);
				setState(1391);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1390);
					match(WS);
					}
				}

				setState(1393);
				match(EQ);
				setState(1395);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
				case 1:
					{
					setState(1394);
					match(WS);
					}
					break;
				}
				setState(1397);
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
		enterRule(_localctx, 136, RULE_outputList);
		int _la;
		try {
			int _alt;
			setState(1433);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1400);
				outputList_Expression();
				setState(1413);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1402);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1401);
							match(WS);
							}
						}

						setState(1404);
						_la = _input.LA(1);
						if ( !(_la==T__0 || _la==T__1) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1406);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
						case 1:
							{
							setState(1405);
							match(WS);
							}
							break;
						}
						setState(1409);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
						case 1:
							{
							setState(1408);
							outputList_Expression();
							}
							break;
						}
						}
						} 
					}
					setState(1415);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1417);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
				case 1:
					{
					setState(1416);
					outputList_Expression();
					}
					break;
				}
				setState(1429); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1420);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1419);
							match(WS);
							}
						}

						setState(1422);
						_la = _input.LA(1);
						if ( !(_la==T__0 || _la==T__1) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1424);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
						case 1:
							{
							setState(1423);
							match(WS);
							}
							break;
						}
						setState(1427);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
						case 1:
							{
							setState(1426);
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
					setState(1431); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
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
		enterRule(_localctx, 138, RULE_outputList_Expression);
		int _la;
		try {
			setState(1452);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1435);
				valueStmt(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1436);
				_la = _input.LA(1);
				if ( !(_la==SPC || _la==TAB) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1450);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
				case 1:
					{
					setState(1438);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(1437);
						match(WS);
						}
					}

					setState(1440);
					match(LPAREN);
					setState(1442);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
					case 1:
						{
						setState(1441);
						match(WS);
						}
						break;
					}
					setState(1444);
					argsCall();
					setState(1446);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(1445);
						match(WS);
						}
					}

					setState(1448);
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
		enterRule(_localctx, 140, RULE_printStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1454);
			match(PRINT);
			setState(1455);
			match(WS);
			setState(1456);
			fileNumber();
			setState(1458);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1457);
				match(WS);
				}
			}

			setState(1460);
			match(T__0);
			setState(1465);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				{
				setState(1462);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
				case 1:
					{
					setState(1461);
					match(WS);
					}
					break;
				}
				setState(1464);
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
		enterRule(_localctx, 142, RULE_propertyGetStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1470);
			_la = _input.LA(1);
			if (((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (FRIEND - 77)) | (1L << (GLOBAL - 77)) | (1L << (PRIVATE - 77)))) != 0) || _la==PUBLIC) {
				{
				setState(1467);
				visibility();
				setState(1468);
				match(WS);
				}
			}

			setState(1474);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(1472);
				match(STATIC);
				setState(1473);
				match(WS);
				}
			}

			setState(1476);
			match(PROPERTY_GET);
			setState(1477);
			match(WS);
			setState(1478);
			ambiguousIdentifier();
			setState(1480);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0) || _la==AMPERSAND) {
				{
				setState(1479);
				typeHint();
				}
			}

			setState(1486);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				{
				setState(1483);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1482);
					match(WS);
					}
				}

				setState(1485);
				argList();
				}
				break;
			}
			setState(1490);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				{
				setState(1488);
				match(WS);
				setState(1489);
				asTypeClause();
				}
				break;
			}
			setState(1492);
			endOfStatement();
			setState(1494);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH) | (1L << END))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ENUM - 64)) | (1L << (EQV - 64)) | (1L << (ERASE - 64)) | (1L << (ERROR - 64)) | (1L << (EVENT - 64)) | (1L << (EXIT_DO - 64)) | (1L << (EXIT_FOR - 64)) | (1L << (EXIT_FUNCTION - 64)) | (1L << (EXIT_PROPERTY - 64)) | (1L << (EXIT_SUB - 64)) | (1L << (EXIT_RULE - 64)) | (1L << (FALSE - 64)) | (1L << (FILECOPY - 64)) | (1L << (FRIEND - 64)) | (1L << (FOR - 64)) | (1L << (FUNCTION - 64)) | (1L << (GET - 64)) | (1L << (GLOBAL - 64)) | (1L << (GOSUB - 64)) | (1L << (GOTO - 64)) | (1L << (IF - 64)) | (1L << (IMP - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (IN - 64)) | (1L << (INPUT - 64)) | (1L << (IS - 64)) | (1L << (INTEGER - 64)) | (1L << (KILL - 64)) | (1L << (LOAD - 64)) | (1L << (LOCK - 64)) | (1L << (LONG - 64)) | (1L << (LOOP - 64)) | (1L << (LEN - 64)) | (1L << (LET - 64)) | (1L << (LIB - 64)) | (1L << (LIKE - 64)) | (1L << (LINE_INPUT - 64)) | (1L << (LSET - 64)) | (1L << (ME - 64)) | (1L << (MID - 64)) | (1L << (MKDIR - 64)) | (1L << (MOD - 64)) | (1L << (NAME - 64)) | (1L << (NEXT - 64)) | (1L << (NEW - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (EMPTY - 64)) | (1L << (ON - 64)) | (1L << (ON_ERROR - 64)) | (1L << (ON_LOCAL_ERROR - 64)) | (1L << (OPEN - 64)) | (1L << (OPTIONAL - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (OR - 131)) | (1L << (OUTPUT - 131)) | (1L << (PARAMARRAY - 131)) | (1L << (PRESERVE - 131)) | (1L << (PRINT - 131)) | (1L << (PRIVATE - 131)) | (1L << (PUBLIC - 131)) | (1L << (PUT - 131)) | (1L << (RANDOM - 131)) | (1L << (RANDOMIZE - 131)) | (1L << (RAISEEVENT - 131)) | (1L << (READ - 131)) | (1L << (REDIM - 131)) | (1L << (REM - 131)) | (1L << (RESET - 131)) | (1L << (RESUME - 131)) | (1L << (RETURN - 131)) | (1L << (RMDIR - 131)) | (1L << (RSET - 131)) | (1L << (SAVEPICTURE - 131)) | (1L << (SAVESETTING - 131)) | (1L << (SEEK - 131)) | (1L << (SELECT - 131)) | (1L << (SENDKEYS - 131)) | (1L << (SET - 131)) | (1L << (SETATTR - 131)) | (1L << (SHARED - 131)) | (1L << (SINGLE - 131)) | (1L << (SPC - 131)) | (1L << (STATIC - 131)) | (1L << (STEP - 131)) | (1L << (STOP - 131)) | (1L << (STRING - 131)) | (1L << (SUB - 131)) | (1L << (TAB - 131)) | (1L << (TEXT - 131)) | (1L << (THEN - 131)) | (1L << (TIME - 131)) | (1L << (TO - 131)) | (1L << (TRUE - 131)) | (1L << (TYPE - 131)) | (1L << (TYPEOF - 131)) | (1L << (UNLOAD - 131)) | (1L << (UNLOCK - 131)) | (1L << (UNTIL - 131)) | (1L << (VARIANT - 131)) | (1L << (VERSION - 131)) | (1L << (WEND - 131)) | (1L << (WHILE - 131)) | (1L << (WIDTH - 131)) | (1L << (WITH - 131)) | (1L << (WITHEVENTS - 131)) | (1L << (WRITE - 131)) | (1L << (XOR - 131)))) != 0) || _la==WS || _la==IDENTIFIER) {
				{
				setState(1493);
				block();
				}
			}

			setState(1496);
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
		enterRule(_localctx, 144, RULE_propertySetStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1501);
			_la = _input.LA(1);
			if (((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (FRIEND - 77)) | (1L << (GLOBAL - 77)) | (1L << (PRIVATE - 77)))) != 0) || _la==PUBLIC) {
				{
				setState(1498);
				visibility();
				setState(1499);
				match(WS);
				}
			}

			setState(1505);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(1503);
				match(STATIC);
				setState(1504);
				match(WS);
				}
			}

			setState(1507);
			match(PROPERTY_SET);
			setState(1508);
			match(WS);
			setState(1509);
			ambiguousIdentifier();
			setState(1514);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				{
				setState(1511);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1510);
					match(WS);
					}
				}

				setState(1513);
				argList();
				}
				break;
			}
			setState(1516);
			endOfStatement();
			setState(1518);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH) | (1L << END))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ENUM - 64)) | (1L << (EQV - 64)) | (1L << (ERASE - 64)) | (1L << (ERROR - 64)) | (1L << (EVENT - 64)) | (1L << (EXIT_DO - 64)) | (1L << (EXIT_FOR - 64)) | (1L << (EXIT_FUNCTION - 64)) | (1L << (EXIT_PROPERTY - 64)) | (1L << (EXIT_SUB - 64)) | (1L << (EXIT_RULE - 64)) | (1L << (FALSE - 64)) | (1L << (FILECOPY - 64)) | (1L << (FRIEND - 64)) | (1L << (FOR - 64)) | (1L << (FUNCTION - 64)) | (1L << (GET - 64)) | (1L << (GLOBAL - 64)) | (1L << (GOSUB - 64)) | (1L << (GOTO - 64)) | (1L << (IF - 64)) | (1L << (IMP - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (IN - 64)) | (1L << (INPUT - 64)) | (1L << (IS - 64)) | (1L << (INTEGER - 64)) | (1L << (KILL - 64)) | (1L << (LOAD - 64)) | (1L << (LOCK - 64)) | (1L << (LONG - 64)) | (1L << (LOOP - 64)) | (1L << (LEN - 64)) | (1L << (LET - 64)) | (1L << (LIB - 64)) | (1L << (LIKE - 64)) | (1L << (LINE_INPUT - 64)) | (1L << (LSET - 64)) | (1L << (ME - 64)) | (1L << (MID - 64)) | (1L << (MKDIR - 64)) | (1L << (MOD - 64)) | (1L << (NAME - 64)) | (1L << (NEXT - 64)) | (1L << (NEW - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (EMPTY - 64)) | (1L << (ON - 64)) | (1L << (ON_ERROR - 64)) | (1L << (ON_LOCAL_ERROR - 64)) | (1L << (OPEN - 64)) | (1L << (OPTIONAL - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (OR - 131)) | (1L << (OUTPUT - 131)) | (1L << (PARAMARRAY - 131)) | (1L << (PRESERVE - 131)) | (1L << (PRINT - 131)) | (1L << (PRIVATE - 131)) | (1L << (PUBLIC - 131)) | (1L << (PUT - 131)) | (1L << (RANDOM - 131)) | (1L << (RANDOMIZE - 131)) | (1L << (RAISEEVENT - 131)) | (1L << (READ - 131)) | (1L << (REDIM - 131)) | (1L << (REM - 131)) | (1L << (RESET - 131)) | (1L << (RESUME - 131)) | (1L << (RETURN - 131)) | (1L << (RMDIR - 131)) | (1L << (RSET - 131)) | (1L << (SAVEPICTURE - 131)) | (1L << (SAVESETTING - 131)) | (1L << (SEEK - 131)) | (1L << (SELECT - 131)) | (1L << (SENDKEYS - 131)) | (1L << (SET - 131)) | (1L << (SETATTR - 131)) | (1L << (SHARED - 131)) | (1L << (SINGLE - 131)) | (1L << (SPC - 131)) | (1L << (STATIC - 131)) | (1L << (STEP - 131)) | (1L << (STOP - 131)) | (1L << (STRING - 131)) | (1L << (SUB - 131)) | (1L << (TAB - 131)) | (1L << (TEXT - 131)) | (1L << (THEN - 131)) | (1L << (TIME - 131)) | (1L << (TO - 131)) | (1L << (TRUE - 131)) | (1L << (TYPE - 131)) | (1L << (TYPEOF - 131)) | (1L << (UNLOAD - 131)) | (1L << (UNLOCK - 131)) | (1L << (UNTIL - 131)) | (1L << (VARIANT - 131)) | (1L << (VERSION - 131)) | (1L << (WEND - 131)) | (1L << (WHILE - 131)) | (1L << (WIDTH - 131)) | (1L << (WITH - 131)) | (1L << (WITHEVENTS - 131)) | (1L << (WRITE - 131)) | (1L << (XOR - 131)))) != 0) || _la==WS || _la==IDENTIFIER) {
				{
				setState(1517);
				block();
				}
			}

			setState(1520);
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
		enterRule(_localctx, 146, RULE_propertyLetStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1525);
			_la = _input.LA(1);
			if (((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (FRIEND - 77)) | (1L << (GLOBAL - 77)) | (1L << (PRIVATE - 77)))) != 0) || _la==PUBLIC) {
				{
				setState(1522);
				visibility();
				setState(1523);
				match(WS);
				}
			}

			setState(1529);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(1527);
				match(STATIC);
				setState(1528);
				match(WS);
				}
			}

			setState(1531);
			match(PROPERTY_LET);
			setState(1532);
			match(WS);
			setState(1533);
			ambiguousIdentifier();
			setState(1538);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				{
				setState(1535);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1534);
					match(WS);
					}
				}

				setState(1537);
				argList();
				}
				break;
			}
			setState(1540);
			endOfStatement();
			setState(1542);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH) | (1L << END))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ENUM - 64)) | (1L << (EQV - 64)) | (1L << (ERASE - 64)) | (1L << (ERROR - 64)) | (1L << (EVENT - 64)) | (1L << (EXIT_DO - 64)) | (1L << (EXIT_FOR - 64)) | (1L << (EXIT_FUNCTION - 64)) | (1L << (EXIT_PROPERTY - 64)) | (1L << (EXIT_SUB - 64)) | (1L << (EXIT_RULE - 64)) | (1L << (FALSE - 64)) | (1L << (FILECOPY - 64)) | (1L << (FRIEND - 64)) | (1L << (FOR - 64)) | (1L << (FUNCTION - 64)) | (1L << (GET - 64)) | (1L << (GLOBAL - 64)) | (1L << (GOSUB - 64)) | (1L << (GOTO - 64)) | (1L << (IF - 64)) | (1L << (IMP - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (IN - 64)) | (1L << (INPUT - 64)) | (1L << (IS - 64)) | (1L << (INTEGER - 64)) | (1L << (KILL - 64)) | (1L << (LOAD - 64)) | (1L << (LOCK - 64)) | (1L << (LONG - 64)) | (1L << (LOOP - 64)) | (1L << (LEN - 64)) | (1L << (LET - 64)) | (1L << (LIB - 64)) | (1L << (LIKE - 64)) | (1L << (LINE_INPUT - 64)) | (1L << (LSET - 64)) | (1L << (ME - 64)) | (1L << (MID - 64)) | (1L << (MKDIR - 64)) | (1L << (MOD - 64)) | (1L << (NAME - 64)) | (1L << (NEXT - 64)) | (1L << (NEW - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (EMPTY - 64)) | (1L << (ON - 64)) | (1L << (ON_ERROR - 64)) | (1L << (ON_LOCAL_ERROR - 64)) | (1L << (OPEN - 64)) | (1L << (OPTIONAL - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (OR - 131)) | (1L << (OUTPUT - 131)) | (1L << (PARAMARRAY - 131)) | (1L << (PRESERVE - 131)) | (1L << (PRINT - 131)) | (1L << (PRIVATE - 131)) | (1L << (PUBLIC - 131)) | (1L << (PUT - 131)) | (1L << (RANDOM - 131)) | (1L << (RANDOMIZE - 131)) | (1L << (RAISEEVENT - 131)) | (1L << (READ - 131)) | (1L << (REDIM - 131)) | (1L << (REM - 131)) | (1L << (RESET - 131)) | (1L << (RESUME - 131)) | (1L << (RETURN - 131)) | (1L << (RMDIR - 131)) | (1L << (RSET - 131)) | (1L << (SAVEPICTURE - 131)) | (1L << (SAVESETTING - 131)) | (1L << (SEEK - 131)) | (1L << (SELECT - 131)) | (1L << (SENDKEYS - 131)) | (1L << (SET - 131)) | (1L << (SETATTR - 131)) | (1L << (SHARED - 131)) | (1L << (SINGLE - 131)) | (1L << (SPC - 131)) | (1L << (STATIC - 131)) | (1L << (STEP - 131)) | (1L << (STOP - 131)) | (1L << (STRING - 131)) | (1L << (SUB - 131)) | (1L << (TAB - 131)) | (1L << (TEXT - 131)) | (1L << (THEN - 131)) | (1L << (TIME - 131)) | (1L << (TO - 131)) | (1L << (TRUE - 131)) | (1L << (TYPE - 131)) | (1L << (TYPEOF - 131)) | (1L << (UNLOAD - 131)) | (1L << (UNLOCK - 131)) | (1L << (UNTIL - 131)) | (1L << (VARIANT - 131)) | (1L << (VERSION - 131)) | (1L << (WEND - 131)) | (1L << (WHILE - 131)) | (1L << (WIDTH - 131)) | (1L << (WITH - 131)) | (1L << (WITHEVENTS - 131)) | (1L << (WRITE - 131)) | (1L << (XOR - 131)))) != 0) || _la==WS || _la==IDENTIFIER) {
				{
				setState(1541);
				block();
				}
			}

			setState(1544);
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
		enterRule(_localctx, 148, RULE_putStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1546);
			match(PUT);
			setState(1547);
			match(WS);
			setState(1548);
			fileNumber();
			setState(1550);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1549);
				match(WS);
				}
			}

			setState(1552);
			match(T__0);
			setState(1554);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				{
				setState(1553);
				match(WS);
				}
				break;
			}
			setState(1557);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
			case 1:
				{
				setState(1556);
				valueStmt(0);
				}
				break;
			}
			setState(1560);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1559);
				match(WS);
				}
			}

			setState(1562);
			match(T__0);
			setState(1564);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
			case 1:
				{
				setState(1563);
				match(WS);
				}
				break;
			}
			setState(1566);
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
		enterRule(_localctx, 150, RULE_raiseEventStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1568);
			match(RAISEEVENT);
			setState(1569);
			match(WS);
			setState(1570);
			ambiguousIdentifier();
			setState(1585);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				{
				setState(1572);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1571);
					match(WS);
					}
				}

				setState(1574);
				match(LPAREN);
				setState(1576);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
				case 1:
					{
					setState(1575);
					match(WS);
					}
					break;
				}
				setState(1582);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ENUM - 64)) | (1L << (EQV - 64)) | (1L << (ERASE - 64)) | (1L << (ERROR - 64)) | (1L << (EVENT - 64)) | (1L << (FALSE - 64)) | (1L << (FILECOPY - 64)) | (1L << (FRIEND - 64)) | (1L << (FOR - 64)) | (1L << (FUNCTION - 64)) | (1L << (GET - 64)) | (1L << (GLOBAL - 64)) | (1L << (GOSUB - 64)) | (1L << (GOTO - 64)) | (1L << (IF - 64)) | (1L << (IMP - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (IN - 64)) | (1L << (INPUT - 64)) | (1L << (IS - 64)) | (1L << (INTEGER - 64)) | (1L << (KILL - 64)) | (1L << (LOAD - 64)) | (1L << (LOCK - 64)) | (1L << (LONG - 64)) | (1L << (LOOP - 64)) | (1L << (LEN - 64)) | (1L << (LET - 64)) | (1L << (LIB - 64)) | (1L << (LIKE - 64)) | (1L << (LSET - 64)) | (1L << (ME - 64)) | (1L << (MID - 64)) | (1L << (MKDIR - 64)) | (1L << (MOD - 64)) | (1L << (NAME - 64)) | (1L << (NEXT - 64)) | (1L << (NEW - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (EMPTY - 64)) | (1L << (ON - 64)) | (1L << (OPEN - 64)) | (1L << (OPTIONAL - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (OR - 131)) | (1L << (OUTPUT - 131)) | (1L << (PARAMARRAY - 131)) | (1L << (PRESERVE - 131)) | (1L << (PRINT - 131)) | (1L << (PRIVATE - 131)) | (1L << (PUBLIC - 131)) | (1L << (PUT - 131)) | (1L << (RANDOM - 131)) | (1L << (RANDOMIZE - 131)) | (1L << (RAISEEVENT - 131)) | (1L << (READ - 131)) | (1L << (REDIM - 131)) | (1L << (REM - 131)) | (1L << (RESET - 131)) | (1L << (RESUME - 131)) | (1L << (RETURN - 131)) | (1L << (RMDIR - 131)) | (1L << (RSET - 131)) | (1L << (SAVEPICTURE - 131)) | (1L << (SAVESETTING - 131)) | (1L << (SEEK - 131)) | (1L << (SELECT - 131)) | (1L << (SENDKEYS - 131)) | (1L << (SET - 131)) | (1L << (SETATTR - 131)) | (1L << (SHARED - 131)) | (1L << (SINGLE - 131)) | (1L << (SPC - 131)) | (1L << (STATIC - 131)) | (1L << (STEP - 131)) | (1L << (STRING - 131)) | (1L << (SUB - 131)) | (1L << (TAB - 131)) | (1L << (TEXT - 131)) | (1L << (THEN - 131)) | (1L << (TIME - 131)) | (1L << (TO - 131)) | (1L << (TRUE - 131)) | (1L << (TYPE - 131)) | (1L << (TYPEOF - 131)) | (1L << (UNLOAD - 131)) | (1L << (UNLOCK - 131)) | (1L << (UNTIL - 131)) | (1L << (VARIANT - 131)) | (1L << (VERSION - 131)) | (1L << (WEND - 131)) | (1L << (WHILE - 131)) | (1L << (WIDTH - 131)) | (1L << (WITH - 131)) | (1L << (WITHEVENTS - 131)) | (1L << (WRITE - 131)) | (1L << (XOR - 131)))) != 0) || ((((_la - 202)) & ~0x3f) == 0 && ((1L << (_la - 202)) & ((1L << (LPAREN - 202)) | (1L << (MINUS - 202)) | (1L << (PLUS - 202)) | (1L << (STRINGLITERAL - 202)) | (1L << (OCTLITERAL - 202)) | (1L << (HEXLITERAL - 202)) | (1L << (SHORTLITERAL - 202)) | (1L << (INTEGERLITERAL - 202)) | (1L << (DOUBLELITERAL - 202)) | (1L << (DATELITERAL - 202)) | (1L << (WS - 202)) | (1L << (IDENTIFIER - 202)))) != 0)) {
					{
					setState(1578);
					argsCall();
					setState(1580);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(1579);
						match(WS);
						}
					}

					}
				}

				setState(1584);
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
		enterRule(_localctx, 152, RULE_randomizeStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1587);
			match(RANDOMIZE);
			setState(1590);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
			case 1:
				{
				setState(1588);
				match(WS);
				setState(1589);
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
		enterRule(_localctx, 154, RULE_redimStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1592);
			match(REDIM);
			setState(1593);
			match(WS);
			setState(1596);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
			case 1:
				{
				setState(1594);
				match(PRESERVE);
				setState(1595);
				match(WS);
				}
				break;
			}
			setState(1598);
			redimSubStmt();
			setState(1609);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,225,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1600);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(1599);
						match(WS);
						}
					}

					setState(1602);
					match(T__0);
					setState(1604);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(1603);
						match(WS);
						}
					}

					setState(1606);
					redimSubStmt();
					}
					} 
				}
				setState(1611);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,225,_ctx);
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
		enterRule(_localctx, 156, RULE_redimSubStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1612);
			ambiguousIdentifier();
			setState(1614);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1613);
				match(WS);
				}
			}

			setState(1616);
			match(LPAREN);
			setState(1618);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
			case 1:
				{
				setState(1617);
				match(WS);
				}
				break;
			}
			setState(1620);
			subscripts();
			setState(1622);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1621);
				match(WS);
				}
			}

			setState(1624);
			match(RPAREN);
			setState(1627);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
			case 1:
				{
				setState(1625);
				match(WS);
				setState(1626);
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
		enterRule(_localctx, 158, RULE_resetStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1629);
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
		enterRule(_localctx, 160, RULE_resumeStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1631);
			match(RESUME);
			setState(1637);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
			case 1:
				{
				setState(1632);
				match(WS);
				setState(1635);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
				case 1:
					{
					setState(1633);
					match(NEXT);
					}
					break;
				case 2:
					{
					setState(1634);
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
		enterRule(_localctx, 162, RULE_returnStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1639);
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
		enterRule(_localctx, 164, RULE_rmdirStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1641);
			match(RMDIR);
			setState(1642);
			match(WS);
			setState(1643);
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
		enterRule(_localctx, 166, RULE_rsetStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1645);
			match(RSET);
			setState(1646);
			match(WS);
			setState(1647);
			implicitCallStmt_InStmt();
			setState(1649);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1648);
				match(WS);
				}
			}

			setState(1651);
			match(EQ);
			setState(1653);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
			case 1:
				{
				setState(1652);
				match(WS);
				}
				break;
			}
			setState(1655);
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
		enterRule(_localctx, 168, RULE_savepictureStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1657);
			match(SAVEPICTURE);
			setState(1658);
			match(WS);
			setState(1659);
			valueStmt(0);
			setState(1661);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1660);
				match(WS);
				}
			}

			setState(1663);
			match(T__0);
			setState(1665);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
			case 1:
				{
				setState(1664);
				match(WS);
				}
				break;
			}
			setState(1667);
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
		enterRule(_localctx, 170, RULE_saveSettingStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1669);
			match(SAVESETTING);
			setState(1670);
			match(WS);
			setState(1671);
			valueStmt(0);
			setState(1673);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1672);
				match(WS);
				}
			}

			setState(1675);
			match(T__0);
			setState(1677);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
			case 1:
				{
				setState(1676);
				match(WS);
				}
				break;
			}
			setState(1679);
			valueStmt(0);
			setState(1681);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1680);
				match(WS);
				}
			}

			setState(1683);
			match(T__0);
			setState(1685);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
			case 1:
				{
				setState(1684);
				match(WS);
				}
				break;
			}
			setState(1687);
			valueStmt(0);
			setState(1689);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1688);
				match(WS);
				}
			}

			setState(1691);
			match(T__0);
			setState(1693);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
			case 1:
				{
				setState(1692);
				match(WS);
				}
				break;
			}
			setState(1695);
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
		enterRule(_localctx, 172, RULE_seekStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1697);
			match(SEEK);
			setState(1698);
			match(WS);
			setState(1699);
			fileNumber();
			setState(1701);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1700);
				match(WS);
				}
			}

			setState(1703);
			match(T__0);
			setState(1705);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
			case 1:
				{
				setState(1704);
				match(WS);
				}
				break;
			}
			setState(1707);
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
		enterRule(_localctx, 174, RULE_selectCaseStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1709);
			match(SELECT);
			setState(1710);
			match(WS);
			setState(1711);
			match(CASE);
			setState(1712);
			match(WS);
			setState(1713);
			valueStmt(0);
			setState(1714);
			endOfStatement();
			setState(1718);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(1715);
				sC_Case();
				}
				}
				setState(1720);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1721);
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
		enterRule(_localctx, 176, RULE_sC_Selection);
		int _la;
		try {
			setState(1740);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
			case 1:
				_localctx = new CaseCondIsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1723);
				match(IS);
				setState(1725);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1724);
					match(WS);
					}
				}

				setState(1727);
				comparisonOperator();
				setState(1729);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
				case 1:
					{
					setState(1728);
					match(WS);
					}
					break;
				}
				setState(1731);
				valueStmt(0);
				}
				break;
			case 2:
				_localctx = new CaseCondToContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1733);
				valueStmt(0);
				setState(1734);
				match(WS);
				setState(1735);
				match(TO);
				setState(1736);
				match(WS);
				setState(1737);
				valueStmt(0);
				}
				break;
			case 3:
				_localctx = new CaseCondValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1739);
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
		enterRule(_localctx, 178, RULE_sC_Case);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1742);
			match(CASE);
			setState(1743);
			match(WS);
			setState(1744);
			sC_Cond();
			setState(1745);
			endOfStatement();
			setState(1747);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH) | (1L << END))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ENUM - 64)) | (1L << (EQV - 64)) | (1L << (ERASE - 64)) | (1L << (ERROR - 64)) | (1L << (EVENT - 64)) | (1L << (EXIT_DO - 64)) | (1L << (EXIT_FOR - 64)) | (1L << (EXIT_FUNCTION - 64)) | (1L << (EXIT_PROPERTY - 64)) | (1L << (EXIT_SUB - 64)) | (1L << (EXIT_RULE - 64)) | (1L << (FALSE - 64)) | (1L << (FILECOPY - 64)) | (1L << (FRIEND - 64)) | (1L << (FOR - 64)) | (1L << (FUNCTION - 64)) | (1L << (GET - 64)) | (1L << (GLOBAL - 64)) | (1L << (GOSUB - 64)) | (1L << (GOTO - 64)) | (1L << (IF - 64)) | (1L << (IMP - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (IN - 64)) | (1L << (INPUT - 64)) | (1L << (IS - 64)) | (1L << (INTEGER - 64)) | (1L << (KILL - 64)) | (1L << (LOAD - 64)) | (1L << (LOCK - 64)) | (1L << (LONG - 64)) | (1L << (LOOP - 64)) | (1L << (LEN - 64)) | (1L << (LET - 64)) | (1L << (LIB - 64)) | (1L << (LIKE - 64)) | (1L << (LINE_INPUT - 64)) | (1L << (LSET - 64)) | (1L << (ME - 64)) | (1L << (MID - 64)) | (1L << (MKDIR - 64)) | (1L << (MOD - 64)) | (1L << (NAME - 64)) | (1L << (NEXT - 64)) | (1L << (NEW - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (EMPTY - 64)) | (1L << (ON - 64)) | (1L << (ON_ERROR - 64)) | (1L << (ON_LOCAL_ERROR - 64)) | (1L << (OPEN - 64)) | (1L << (OPTIONAL - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (OR - 131)) | (1L << (OUTPUT - 131)) | (1L << (PARAMARRAY - 131)) | (1L << (PRESERVE - 131)) | (1L << (PRINT - 131)) | (1L << (PRIVATE - 131)) | (1L << (PUBLIC - 131)) | (1L << (PUT - 131)) | (1L << (RANDOM - 131)) | (1L << (RANDOMIZE - 131)) | (1L << (RAISEEVENT - 131)) | (1L << (READ - 131)) | (1L << (REDIM - 131)) | (1L << (REM - 131)) | (1L << (RESET - 131)) | (1L << (RESUME - 131)) | (1L << (RETURN - 131)) | (1L << (RMDIR - 131)) | (1L << (RSET - 131)) | (1L << (SAVEPICTURE - 131)) | (1L << (SAVESETTING - 131)) | (1L << (SEEK - 131)) | (1L << (SELECT - 131)) | (1L << (SENDKEYS - 131)) | (1L << (SET - 131)) | (1L << (SETATTR - 131)) | (1L << (SHARED - 131)) | (1L << (SINGLE - 131)) | (1L << (SPC - 131)) | (1L << (STATIC - 131)) | (1L << (STEP - 131)) | (1L << (STOP - 131)) | (1L << (STRING - 131)) | (1L << (SUB - 131)) | (1L << (TAB - 131)) | (1L << (TEXT - 131)) | (1L << (THEN - 131)) | (1L << (TIME - 131)) | (1L << (TO - 131)) | (1L << (TRUE - 131)) | (1L << (TYPE - 131)) | (1L << (TYPEOF - 131)) | (1L << (UNLOAD - 131)) | (1L << (UNLOCK - 131)) | (1L << (UNTIL - 131)) | (1L << (VARIANT - 131)) | (1L << (VERSION - 131)) | (1L << (WEND - 131)) | (1L << (WHILE - 131)) | (1L << (WIDTH - 131)) | (1L << (WITH - 131)) | (1L << (WITHEVENTS - 131)) | (1L << (WRITE - 131)) | (1L << (XOR - 131)))) != 0) || _la==WS || _la==IDENTIFIER) {
				{
				setState(1746);
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
		enterRule(_localctx, 180, RULE_sC_Cond);
		int _la;
		try {
			int _alt;
			setState(1764);
			switch (_input.LA(1)) {
			case ELSE:
				_localctx = new CaseCondElseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1749);
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
				setState(1750);
				sC_Selection();
				setState(1761);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,251,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1752);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1751);
							match(WS);
							}
						}

						setState(1754);
						match(T__0);
						setState(1756);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
						case 1:
							{
							setState(1755);
							match(WS);
							}
							break;
						}
						setState(1758);
						sC_Selection();
						}
						} 
					}
					setState(1763);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,251,_ctx);
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
		enterRule(_localctx, 182, RULE_sendkeysStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1766);
			match(SENDKEYS);
			setState(1767);
			match(WS);
			setState(1768);
			valueStmt(0);
			setState(1777);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
			case 1:
				{
				setState(1770);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1769);
					match(WS);
					}
				}

				setState(1772);
				match(T__0);
				setState(1774);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
				case 1:
					{
					setState(1773);
					match(WS);
					}
					break;
				}
				setState(1776);
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
		enterRule(_localctx, 184, RULE_setattrStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1779);
			match(SETATTR);
			setState(1780);
			match(WS);
			setState(1781);
			valueStmt(0);
			setState(1783);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1782);
				match(WS);
				}
			}

			setState(1785);
			match(T__0);
			setState(1787);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
			case 1:
				{
				setState(1786);
				match(WS);
				}
				break;
			}
			setState(1789);
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
		enterRule(_localctx, 186, RULE_setStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1791);
			match(SET);
			setState(1792);
			match(WS);
			setState(1793);
			implicitCallStmt_InStmt();
			setState(1795);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1794);
				match(WS);
				}
			}

			setState(1797);
			match(EQ);
			setState(1799);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
			case 1:
				{
				setState(1798);
				match(WS);
				}
				break;
			}
			setState(1801);
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
		enterRule(_localctx, 188, RULE_stopStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1803);
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
		enterRule(_localctx, 190, RULE_subStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1808);
			_la = _input.LA(1);
			if (((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (FRIEND - 77)) | (1L << (GLOBAL - 77)) | (1L << (PRIVATE - 77)))) != 0) || _la==PUBLIC) {
				{
				setState(1805);
				visibility();
				setState(1806);
				match(WS);
				}
			}

			setState(1812);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(1810);
				match(STATIC);
				setState(1811);
				match(WS);
				}
			}

			setState(1814);
			match(SUB);
			setState(1816);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1815);
				match(WS);
				}
			}

			setState(1818);
			ambiguousIdentifier();
			setState(1823);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
			case 1:
				{
				setState(1820);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1819);
					match(WS);
					}
				}

				setState(1822);
				argList();
				}
				break;
			}
			setState(1825);
			endOfStatement();
			setState(1827);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH) | (1L << END))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ENUM - 64)) | (1L << (EQV - 64)) | (1L << (ERASE - 64)) | (1L << (ERROR - 64)) | (1L << (EVENT - 64)) | (1L << (EXIT_DO - 64)) | (1L << (EXIT_FOR - 64)) | (1L << (EXIT_FUNCTION - 64)) | (1L << (EXIT_PROPERTY - 64)) | (1L << (EXIT_SUB - 64)) | (1L << (EXIT_RULE - 64)) | (1L << (FALSE - 64)) | (1L << (FILECOPY - 64)) | (1L << (FRIEND - 64)) | (1L << (FOR - 64)) | (1L << (FUNCTION - 64)) | (1L << (GET - 64)) | (1L << (GLOBAL - 64)) | (1L << (GOSUB - 64)) | (1L << (GOTO - 64)) | (1L << (IF - 64)) | (1L << (IMP - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (IN - 64)) | (1L << (INPUT - 64)) | (1L << (IS - 64)) | (1L << (INTEGER - 64)) | (1L << (KILL - 64)) | (1L << (LOAD - 64)) | (1L << (LOCK - 64)) | (1L << (LONG - 64)) | (1L << (LOOP - 64)) | (1L << (LEN - 64)) | (1L << (LET - 64)) | (1L << (LIB - 64)) | (1L << (LIKE - 64)) | (1L << (LINE_INPUT - 64)) | (1L << (LSET - 64)) | (1L << (ME - 64)) | (1L << (MID - 64)) | (1L << (MKDIR - 64)) | (1L << (MOD - 64)) | (1L << (NAME - 64)) | (1L << (NEXT - 64)) | (1L << (NEW - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (EMPTY - 64)) | (1L << (ON - 64)) | (1L << (ON_ERROR - 64)) | (1L << (ON_LOCAL_ERROR - 64)) | (1L << (OPEN - 64)) | (1L << (OPTIONAL - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (OR - 131)) | (1L << (OUTPUT - 131)) | (1L << (PARAMARRAY - 131)) | (1L << (PRESERVE - 131)) | (1L << (PRINT - 131)) | (1L << (PRIVATE - 131)) | (1L << (PUBLIC - 131)) | (1L << (PUT - 131)) | (1L << (RANDOM - 131)) | (1L << (RANDOMIZE - 131)) | (1L << (RAISEEVENT - 131)) | (1L << (READ - 131)) | (1L << (REDIM - 131)) | (1L << (REM - 131)) | (1L << (RESET - 131)) | (1L << (RESUME - 131)) | (1L << (RETURN - 131)) | (1L << (RMDIR - 131)) | (1L << (RSET - 131)) | (1L << (SAVEPICTURE - 131)) | (1L << (SAVESETTING - 131)) | (1L << (SEEK - 131)) | (1L << (SELECT - 131)) | (1L << (SENDKEYS - 131)) | (1L << (SET - 131)) | (1L << (SETATTR - 131)) | (1L << (SHARED - 131)) | (1L << (SINGLE - 131)) | (1L << (SPC - 131)) | (1L << (STATIC - 131)) | (1L << (STEP - 131)) | (1L << (STOP - 131)) | (1L << (STRING - 131)) | (1L << (SUB - 131)) | (1L << (TAB - 131)) | (1L << (TEXT - 131)) | (1L << (THEN - 131)) | (1L << (TIME - 131)) | (1L << (TO - 131)) | (1L << (TRUE - 131)) | (1L << (TYPE - 131)) | (1L << (TYPEOF - 131)) | (1L << (UNLOAD - 131)) | (1L << (UNLOCK - 131)) | (1L << (UNTIL - 131)) | (1L << (VARIANT - 131)) | (1L << (VERSION - 131)) | (1L << (WEND - 131)) | (1L << (WHILE - 131)) | (1L << (WIDTH - 131)) | (1L << (WITH - 131)) | (1L << (WITHEVENTS - 131)) | (1L << (WRITE - 131)) | (1L << (XOR - 131)))) != 0) || _la==WS || _la==IDENTIFIER) {
				{
				setState(1826);
				block();
				}
			}

			setState(1829);
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
		enterRule(_localctx, 192, RULE_timeStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1831);
			match(TIME);
			setState(1833);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1832);
				match(WS);
				}
			}

			setState(1835);
			match(EQ);
			setState(1837);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
			case 1:
				{
				setState(1836);
				match(WS);
				}
				break;
			}
			setState(1839);
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
		enterRule(_localctx, 194, RULE_typeStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1844);
			_la = _input.LA(1);
			if (((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (FRIEND - 77)) | (1L << (GLOBAL - 77)) | (1L << (PRIVATE - 77)))) != 0) || _la==PUBLIC) {
				{
				setState(1841);
				visibility();
				setState(1842);
				match(WS);
				}
			}

			setState(1846);
			match(TYPE);
			setState(1847);
			match(WS);
			setState(1848);
			ambiguousIdentifier();
			setState(1849);
			endOfStatement();
			setState(1853);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ENUM - 64)) | (1L << (EQV - 64)) | (1L << (ERASE - 64)) | (1L << (ERROR - 64)) | (1L << (EVENT - 64)) | (1L << (FALSE - 64)) | (1L << (FILECOPY - 64)) | (1L << (FRIEND - 64)) | (1L << (FOR - 64)) | (1L << (FUNCTION - 64)) | (1L << (GET - 64)) | (1L << (GLOBAL - 64)) | (1L << (GOSUB - 64)) | (1L << (GOTO - 64)) | (1L << (IF - 64)) | (1L << (IMP - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (IN - 64)) | (1L << (INPUT - 64)) | (1L << (IS - 64)) | (1L << (INTEGER - 64)) | (1L << (KILL - 64)) | (1L << (LOAD - 64)) | (1L << (LOCK - 64)) | (1L << (LONG - 64)) | (1L << (LOOP - 64)) | (1L << (LEN - 64)) | (1L << (LET - 64)) | (1L << (LIB - 64)) | (1L << (LIKE - 64)) | (1L << (LSET - 64)) | (1L << (ME - 64)) | (1L << (MID - 64)) | (1L << (MKDIR - 64)) | (1L << (MOD - 64)) | (1L << (NAME - 64)) | (1L << (NEXT - 64)) | (1L << (NEW - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (EMPTY - 64)) | (1L << (ON - 64)) | (1L << (OPEN - 64)) | (1L << (OPTIONAL - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (OR - 131)) | (1L << (OUTPUT - 131)) | (1L << (PARAMARRAY - 131)) | (1L << (PRESERVE - 131)) | (1L << (PRINT - 131)) | (1L << (PRIVATE - 131)) | (1L << (PUBLIC - 131)) | (1L << (PUT - 131)) | (1L << (RANDOM - 131)) | (1L << (RANDOMIZE - 131)) | (1L << (RAISEEVENT - 131)) | (1L << (READ - 131)) | (1L << (REDIM - 131)) | (1L << (REM - 131)) | (1L << (RESET - 131)) | (1L << (RESUME - 131)) | (1L << (RETURN - 131)) | (1L << (RMDIR - 131)) | (1L << (RSET - 131)) | (1L << (SAVEPICTURE - 131)) | (1L << (SAVESETTING - 131)) | (1L << (SEEK - 131)) | (1L << (SELECT - 131)) | (1L << (SENDKEYS - 131)) | (1L << (SET - 131)) | (1L << (SETATTR - 131)) | (1L << (SHARED - 131)) | (1L << (SINGLE - 131)) | (1L << (SPC - 131)) | (1L << (STATIC - 131)) | (1L << (STEP - 131)) | (1L << (STRING - 131)) | (1L << (SUB - 131)) | (1L << (TAB - 131)) | (1L << (TEXT - 131)) | (1L << (THEN - 131)) | (1L << (TIME - 131)) | (1L << (TO - 131)) | (1L << (TRUE - 131)) | (1L << (TYPE - 131)) | (1L << (TYPEOF - 131)) | (1L << (UNLOAD - 131)) | (1L << (UNLOCK - 131)) | (1L << (UNTIL - 131)) | (1L << (VARIANT - 131)) | (1L << (VERSION - 131)) | (1L << (WEND - 131)) | (1L << (WHILE - 131)) | (1L << (WIDTH - 131)) | (1L << (WITH - 131)) | (1L << (WITHEVENTS - 131)) | (1L << (WRITE - 131)) | (1L << (XOR - 131)))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(1850);
				typeStmt_Element();
				}
				}
				setState(1855);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1856);
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
		enterRule(_localctx, 196, RULE_typeStmt_Element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1858);
			ambiguousIdentifier();
			setState(1873);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
			case 1:
				{
				setState(1860);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1859);
					match(WS);
					}
				}

				setState(1862);
				match(LPAREN);
				setState(1867);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,272,_ctx) ) {
				case 1:
					{
					setState(1864);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(1863);
						match(WS);
						}
					}

					setState(1866);
					constSubscripts();
					}
					break;
				}
				setState(1870);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1869);
					match(WS);
					}
				}

				setState(1872);
				match(RPAREN);
				}
				break;
			}
			setState(1875);
			match(WS);
			setState(1876);
			asTypeClause();
			setState(1877);
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
		enterRule(_localctx, 198, RULE_typeOfIsStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1879);
			match(TYPEOF);
			setState(1880);
			match(WS);
			setState(1881);
			valueStmt(0);
			setState(1882);
			match(WS);
			setState(1883);
			match(IS);
			setState(1884);
			match(WS);
			setState(1885);
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
		enterRule(_localctx, 200, RULE_unloadStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1887);
			match(UNLOAD);
			setState(1888);
			match(WS);
			setState(1889);
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
		enterRule(_localctx, 202, RULE_unlockStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1891);
			match(UNLOCK);
			setState(1892);
			match(WS);
			setState(1893);
			fileNumber();
			setState(1908);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
			case 1:
				{
				setState(1895);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1894);
					match(WS);
					}
				}

				setState(1897);
				match(T__0);
				setState(1899);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
				case 1:
					{
					setState(1898);
					match(WS);
					}
					break;
				}
				setState(1901);
				valueStmt(0);
				setState(1906);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,277,_ctx) ) {
				case 1:
					{
					setState(1902);
					match(WS);
					setState(1903);
					match(TO);
					setState(1904);
					match(WS);
					setState(1905);
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
		int _startState = 204;
		enterRecursionRule(_localctx, 204, RULE_constValueExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1935);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
			case 1:
				{
				_localctx = new CveLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1911);
				literal();
				}
				break;
			case 2:
				{
				_localctx = new CveIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1912);
				ambiguousIdentifier();
				setState(1917);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,279,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1913);
						match(T__2);
						setState(1914);
						ambiguousIdentifier();
						}
						} 
					}
					setState(1919);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,279,_ctx);
				}
				}
				break;
			case 3:
				{
				_localctx = new CveNegationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1920);
				match(MINUS);
				setState(1922);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1921);
					match(WS);
					}
				}

				setState(1924);
				constValueExpr(21);
				}
				break;
			case 4:
				{
				_localctx = new CvePlusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1925);
				match(PLUS);
				setState(1927);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1926);
					match(WS);
					}
				}

				setState(1929);
				constValueExpr(20);
				}
				break;
			case 5:
				{
				_localctx = new CveNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1930);
				match(NOT);
				setState(1932);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1931);
					match(WS);
					}
				}

				setState(1934);
				constValueExpr(6);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2110);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,323,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2108);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,322,_ctx) ) {
					case 1:
						{
						_localctx = new CvePowContext(new ConstValueExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_constValueExpr);
						setState(1937);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(1939);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1938);
							match(WS);
							}
						}

						setState(1941);
						match(POW);
						setState(1943);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1942);
							match(WS);
							}
						}

						setState(1945);
						constValueExpr(23);
						}
						break;
					case 2:
						{
						_localctx = new CveMultContext(new ConstValueExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_constValueExpr);
						setState(1946);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1948);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1947);
							match(WS);
							}
						}

						setState(1950);
						match(MULT);
						setState(1952);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1951);
							match(WS);
							}
						}

						setState(1954);
						constValueExpr(20);
						}
						break;
					case 3:
						{
						_localctx = new CveDivContext(new ConstValueExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_constValueExpr);
						setState(1955);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1957);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1956);
							match(WS);
							}
						}

						setState(1959);
						match(DIV);
						setState(1961);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1960);
							match(WS);
							}
						}

						setState(1963);
						constValueExpr(19);
						}
						break;
					case 4:
						{
						_localctx = new CveModContext(new ConstValueExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_constValueExpr);
						setState(1964);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1966);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1965);
							match(WS);
							}
						}

						setState(1968);
						match(MOD);
						setState(1970);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1969);
							match(WS);
							}
						}

						setState(1972);
						constValueExpr(18);
						}
						break;
					case 5:
						{
						_localctx = new CveAddContext(new ConstValueExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_constValueExpr);
						setState(1973);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1975);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1974);
							match(WS);
							}
						}

						setState(1977);
						match(PLUS);
						setState(1979);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1978);
							match(WS);
							}
						}

						setState(1981);
						constValueExpr(17);
						}
						break;
					case 6:
						{
						_localctx = new CveMinusContext(new ConstValueExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_constValueExpr);
						setState(1982);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1984);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1983);
							match(WS);
							}
						}

						setState(1986);
						match(MINUS);
						setState(1988);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1987);
							match(WS);
							}
						}

						setState(1990);
						constValueExpr(16);
						}
						break;
					case 7:
						{
						_localctx = new CveAmpContext(new ConstValueExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_constValueExpr);
						setState(1991);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1993);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1992);
							match(WS);
							}
						}

						setState(1995);
						match(AMPERSAND);
						setState(1997);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1996);
							match(WS);
							}
						}

						setState(1999);
						constValueExpr(15);
						}
						break;
					case 8:
						{
						_localctx = new CveLikeContext(new ConstValueExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_constValueExpr);
						setState(2000);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(2002);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2001);
							match(WS);
							}
						}

						setState(2004);
						match(LIKE);
						setState(2006);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2005);
							match(WS);
							}
						}

						setState(2008);
						constValueExpr(14);
						}
						break;
					case 9:
						{
						_localctx = new CveGeqContext(new ConstValueExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_constValueExpr);
						setState(2009);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(2011);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2010);
							match(WS);
							}
						}

						setState(2013);
						match(GEQ);
						setState(2015);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2014);
							match(WS);
							}
						}

						setState(2017);
						constValueExpr(13);
						}
						break;
					case 10:
						{
						_localctx = new CveLeqContext(new ConstValueExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_constValueExpr);
						setState(2018);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(2020);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2019);
							match(WS);
							}
						}

						setState(2022);
						match(LEQ);
						setState(2024);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2023);
							match(WS);
							}
						}

						setState(2026);
						constValueExpr(12);
						}
						break;
					case 11:
						{
						_localctx = new CveGtContext(new ConstValueExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_constValueExpr);
						setState(2027);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(2029);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2028);
							match(WS);
							}
						}

						setState(2031);
						match(GT);
						setState(2033);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2032);
							match(WS);
							}
						}

						setState(2035);
						constValueExpr(11);
						}
						break;
					case 12:
						{
						_localctx = new CveLtContext(new ConstValueExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_constValueExpr);
						setState(2036);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(2038);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2037);
							match(WS);
							}
						}

						setState(2040);
						match(LT);
						setState(2042);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2041);
							match(WS);
							}
						}

						setState(2044);
						constValueExpr(10);
						}
						break;
					case 13:
						{
						_localctx = new CveNeqContext(new ConstValueExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_constValueExpr);
						setState(2045);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(2047);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2046);
							match(WS);
							}
						}

						setState(2049);
						match(NEQ);
						setState(2051);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2050);
							match(WS);
							}
						}

						setState(2053);
						constValueExpr(9);
						}
						break;
					case 14:
						{
						_localctx = new CveEqContext(new ConstValueExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_constValueExpr);
						setState(2054);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(2056);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2055);
							match(WS);
							}
						}

						setState(2058);
						match(EQ);
						setState(2060);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2059);
							match(WS);
							}
						}

						setState(2062);
						constValueExpr(8);
						}
						break;
					case 15:
						{
						_localctx = new CveAndContext(new ConstValueExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_constValueExpr);
						setState(2063);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2065);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2064);
							match(WS);
							}
						}

						setState(2067);
						match(AND);
						setState(2069);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2068);
							match(WS);
							}
						}

						setState(2071);
						constValueExpr(6);
						}
						break;
					case 16:
						{
						_localctx = new CveOrContext(new ConstValueExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_constValueExpr);
						setState(2072);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2074);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2073);
							match(WS);
							}
						}

						setState(2076);
						match(OR);
						setState(2078);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2077);
							match(WS);
							}
						}

						setState(2080);
						constValueExpr(5);
						}
						break;
					case 17:
						{
						_localctx = new CveXorContext(new ConstValueExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_constValueExpr);
						setState(2081);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2083);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2082);
							match(WS);
							}
						}

						setState(2085);
						match(XOR);
						setState(2087);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2086);
							match(WS);
							}
						}

						setState(2089);
						constValueExpr(4);
						}
						break;
					case 18:
						{
						_localctx = new CveEqvContext(new ConstValueExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_constValueExpr);
						setState(2090);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2092);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2091);
							match(WS);
							}
						}

						setState(2094);
						match(EQV);
						setState(2096);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2095);
							match(WS);
							}
						}

						setState(2098);
						constValueExpr(3);
						}
						break;
					case 19:
						{
						_localctx = new CveImpContext(new ConstValueExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_constValueExpr);
						setState(2099);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2101);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2100);
							match(WS);
							}
						}

						setState(2103);
						match(IMP);
						setState(2105);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2104);
							match(WS);
							}
						}

						setState(2107);
						constValueExpr(2);
						}
						break;
					}
					} 
				}
				setState(2112);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,323,_ctx);
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
		int _startState = 206;
		enterRecursionRule(_localctx, 206, RULE_valueStmt, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,333,_ctx) ) {
			case 1:
				{
				_localctx = new VsLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2114);
				literal();
				}
				break;
			case 2:
				{
				_localctx = new VsICSContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2115);
				implicitCallStmt_InStmt();
				}
				break;
			case 3:
				{
				_localctx = new VsStructContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2116);
				match(LPAREN);
				setState(2118);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,324,_ctx) ) {
				case 1:
					{
					setState(2117);
					match(WS);
					}
					break;
				}
				setState(2120);
				valueStmt(0);
				setState(2131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0 || _la==WS) {
					{
					{
					setState(2122);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(2121);
						match(WS);
						}
					}

					setState(2124);
					match(T__0);
					setState(2126);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,326,_ctx) ) {
					case 1:
						{
						setState(2125);
						match(WS);
						}
						break;
					}
					setState(2128);
					valueStmt(0);
					}
					}
					setState(2133);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2134);
				match(RPAREN);
				}
				break;
			case 4:
				{
				_localctx = new VsNewContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2136);
				match(NEW);
				setState(2138);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(2137);
					match(WS);
					}
				}

				setState(2140);
				complexType();
				}
				break;
			case 5:
				{
				_localctx = new VsTypeOfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2141);
				typeOfIsStmt();
				}
				break;
			case 6:
				{
				_localctx = new VsAddressOfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2142);
				match(ADDRESSOF);
				setState(2144);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,329,_ctx) ) {
				case 1:
					{
					setState(2143);
					match(WS);
					}
					break;
				}
				setState(2146);
				valueStmt(24);
				}
				break;
			case 7:
				{
				_localctx = new VsNegationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2147);
				match(MINUS);
				setState(2149);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,330,_ctx) ) {
				case 1:
					{
					setState(2148);
					match(WS);
					}
					break;
				}
				setState(2151);
				valueStmt(22);
				}
				break;
			case 8:
				{
				_localctx = new VsPlusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2152);
				match(PLUS);
				setState(2154);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,331,_ctx) ) {
				case 1:
					{
					setState(2153);
					match(WS);
					}
					break;
				}
				setState(2156);
				valueStmt(21);
				}
				break;
			case 9:
				{
				_localctx = new VsNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2157);
				match(NOT);
				setState(2159);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,332,_ctx) ) {
				case 1:
					{
					setState(2158);
					match(WS);
					}
					break;
				}
				setState(2161);
				valueStmt(6);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2346);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,375,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2344);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,374,_ctx) ) {
					case 1:
						{
						_localctx = new VsPowContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(2164);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(2166);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2165);
							match(WS);
							}
						}

						setState(2168);
						match(POW);
						setState(2170);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,335,_ctx) ) {
						case 1:
							{
							setState(2169);
							match(WS);
							}
							break;
						}
						setState(2172);
						valueStmt(24);
						}
						break;
					case 2:
						{
						_localctx = new VsMultContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(2173);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(2175);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2174);
							match(WS);
							}
						}

						setState(2177);
						match(MULT);
						setState(2179);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,337,_ctx) ) {
						case 1:
							{
							setState(2178);
							match(WS);
							}
							break;
						}
						setState(2181);
						valueStmt(21);
						}
						break;
					case 3:
						{
						_localctx = new VsDivContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(2182);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(2184);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2183);
							match(WS);
							}
						}

						setState(2186);
						match(DIV);
						setState(2188);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,339,_ctx) ) {
						case 1:
							{
							setState(2187);
							match(WS);
							}
							break;
						}
						setState(2190);
						valueStmt(20);
						}
						break;
					case 4:
						{
						_localctx = new VsModContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(2191);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(2193);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2192);
							match(WS);
							}
						}

						setState(2195);
						match(MOD);
						setState(2197);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,341,_ctx) ) {
						case 1:
							{
							setState(2196);
							match(WS);
							}
							break;
						}
						setState(2199);
						valueStmt(19);
						}
						break;
					case 5:
						{
						_localctx = new VsAddContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(2200);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(2202);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2201);
							match(WS);
							}
						}

						setState(2204);
						match(PLUS);
						setState(2206);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,343,_ctx) ) {
						case 1:
							{
							setState(2205);
							match(WS);
							}
							break;
						}
						setState(2208);
						valueStmt(18);
						}
						break;
					case 6:
						{
						_localctx = new VsMinusContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(2209);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(2211);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2210);
							match(WS);
							}
						}

						setState(2213);
						match(MINUS);
						setState(2215);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,345,_ctx) ) {
						case 1:
							{
							setState(2214);
							match(WS);
							}
							break;
						}
						setState(2217);
						valueStmt(17);
						}
						break;
					case 7:
						{
						_localctx = new VsAmpContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(2218);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(2220);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2219);
							match(WS);
							}
						}

						setState(2222);
						match(AMPERSAND);
						setState(2224);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,347,_ctx) ) {
						case 1:
							{
							setState(2223);
							match(WS);
							}
							break;
						}
						setState(2226);
						valueStmt(16);
						}
						break;
					case 8:
						{
						_localctx = new VsLikeContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(2227);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(2229);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2228);
							match(WS);
							}
						}

						setState(2231);
						match(LIKE);
						setState(2233);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,349,_ctx) ) {
						case 1:
							{
							setState(2232);
							match(WS);
							}
							break;
						}
						setState(2235);
						valueStmt(15);
						}
						break;
					case 9:
						{
						_localctx = new VsIsContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(2236);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(2238);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2237);
							match(WS);
							}
						}

						setState(2240);
						match(IS);
						setState(2242);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,351,_ctx) ) {
						case 1:
							{
							setState(2241);
							match(WS);
							}
							break;
						}
						setState(2244);
						valueStmt(14);
						}
						break;
					case 10:
						{
						_localctx = new VsGeqContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(2245);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(2247);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2246);
							match(WS);
							}
						}

						setState(2249);
						match(GEQ);
						setState(2251);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,353,_ctx) ) {
						case 1:
							{
							setState(2250);
							match(WS);
							}
							break;
						}
						setState(2253);
						valueStmt(13);
						}
						break;
					case 11:
						{
						_localctx = new VsLeqContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(2254);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(2256);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2255);
							match(WS);
							}
						}

						setState(2258);
						match(LEQ);
						setState(2260);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,355,_ctx) ) {
						case 1:
							{
							setState(2259);
							match(WS);
							}
							break;
						}
						setState(2262);
						valueStmt(12);
						}
						break;
					case 12:
						{
						_localctx = new VsGtContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(2263);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(2265);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2264);
							match(WS);
							}
						}

						setState(2267);
						match(GT);
						setState(2269);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,357,_ctx) ) {
						case 1:
							{
							setState(2268);
							match(WS);
							}
							break;
						}
						setState(2271);
						valueStmt(11);
						}
						break;
					case 13:
						{
						_localctx = new VsLtContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(2272);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(2274);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2273);
							match(WS);
							}
						}

						setState(2276);
						match(LT);
						setState(2278);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,359,_ctx) ) {
						case 1:
							{
							setState(2277);
							match(WS);
							}
							break;
						}
						setState(2280);
						valueStmt(10);
						}
						break;
					case 14:
						{
						_localctx = new VsNeqContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(2281);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(2283);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2282);
							match(WS);
							}
						}

						setState(2285);
						match(NEQ);
						setState(2287);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,361,_ctx) ) {
						case 1:
							{
							setState(2286);
							match(WS);
							}
							break;
						}
						setState(2289);
						valueStmt(9);
						}
						break;
					case 15:
						{
						_localctx = new VsEqContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(2290);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(2292);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2291);
							match(WS);
							}
						}

						setState(2294);
						match(EQ);
						setState(2296);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,363,_ctx) ) {
						case 1:
							{
							setState(2295);
							match(WS);
							}
							break;
						}
						setState(2298);
						valueStmt(8);
						}
						break;
					case 16:
						{
						_localctx = new VsAndContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(2299);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2301);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2300);
							match(WS);
							}
						}

						setState(2303);
						match(AND);
						setState(2305);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,365,_ctx) ) {
						case 1:
							{
							setState(2304);
							match(WS);
							}
							break;
						}
						setState(2307);
						valueStmt(6);
						}
						break;
					case 17:
						{
						_localctx = new VsOrContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(2308);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2310);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2309);
							match(WS);
							}
						}

						setState(2312);
						match(OR);
						setState(2314);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,367,_ctx) ) {
						case 1:
							{
							setState(2313);
							match(WS);
							}
							break;
						}
						setState(2316);
						valueStmt(5);
						}
						break;
					case 18:
						{
						_localctx = new VsXorContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(2317);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2319);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2318);
							match(WS);
							}
						}

						setState(2321);
						match(XOR);
						setState(2323);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,369,_ctx) ) {
						case 1:
							{
							setState(2322);
							match(WS);
							}
							break;
						}
						setState(2325);
						valueStmt(4);
						}
						break;
					case 19:
						{
						_localctx = new VsEqvContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(2326);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2328);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2327);
							match(WS);
							}
						}

						setState(2330);
						match(EQV);
						setState(2332);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,371,_ctx) ) {
						case 1:
							{
							setState(2331);
							match(WS);
							}
							break;
						}
						setState(2334);
						valueStmt(3);
						}
						break;
					case 20:
						{
						_localctx = new VsImpContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(2335);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2337);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2336);
							match(WS);
							}
						}

						setState(2339);
						match(IMP);
						setState(2341);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,373,_ctx) ) {
						case 1:
							{
							setState(2340);
							match(WS);
							}
							break;
						}
						setState(2343);
						valueStmt(2);
						}
						break;
					}
					} 
				}
				setState(2348);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,375,_ctx);
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
		enterRule(_localctx, 208, RULE_variableStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2352);
			switch (_input.LA(1)) {
			case DIM:
				{
				setState(2349);
				match(DIM);
				}
				break;
			case STATIC:
				{
				setState(2350);
				match(STATIC);
				}
				break;
			case FRIEND:
			case GLOBAL:
			case PRIVATE:
			case PUBLIC:
				{
				setState(2351);
				visibility();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2354);
			match(WS);
			setState(2357);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,377,_ctx) ) {
			case 1:
				{
				setState(2355);
				match(WITHEVENTS);
				setState(2356);
				match(WS);
				}
				break;
			}
			setState(2359);
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
		enterRule(_localctx, 210, RULE_variableListStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2361);
			variableSubStmt();
			setState(2372);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,380,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2363);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(2362);
						match(WS);
						}
					}

					setState(2365);
					match(T__0);
					setState(2367);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(2366);
						match(WS);
						}
					}

					setState(2369);
					variableSubStmt();
					}
					} 
				}
				setState(2374);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,380,_ctx);
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
		enterRule(_localctx, 212, RULE_variableSubStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2375);
			ambiguousIdentifier();
			setState(2393);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,386,_ctx) ) {
			case 1:
				{
				setState(2377);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(2376);
					match(WS);
					}
				}

				setState(2379);
				match(LPAREN);
				setState(2381);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(2380);
					match(WS);
					}
				}

				setState(2387);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ENUM - 64)) | (1L << (EQV - 64)) | (1L << (ERASE - 64)) | (1L << (ERROR - 64)) | (1L << (EVENT - 64)) | (1L << (FALSE - 64)) | (1L << (FILECOPY - 64)) | (1L << (FRIEND - 64)) | (1L << (FOR - 64)) | (1L << (FUNCTION - 64)) | (1L << (GET - 64)) | (1L << (GLOBAL - 64)) | (1L << (GOSUB - 64)) | (1L << (GOTO - 64)) | (1L << (IF - 64)) | (1L << (IMP - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (IN - 64)) | (1L << (INPUT - 64)) | (1L << (IS - 64)) | (1L << (INTEGER - 64)) | (1L << (KILL - 64)) | (1L << (LOAD - 64)) | (1L << (LOCK - 64)) | (1L << (LONG - 64)) | (1L << (LOOP - 64)) | (1L << (LEN - 64)) | (1L << (LET - 64)) | (1L << (LIB - 64)) | (1L << (LIKE - 64)) | (1L << (LSET - 64)) | (1L << (ME - 64)) | (1L << (MID - 64)) | (1L << (MKDIR - 64)) | (1L << (MOD - 64)) | (1L << (NAME - 64)) | (1L << (NEXT - 64)) | (1L << (NEW - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (EMPTY - 64)) | (1L << (ON - 64)) | (1L << (OPEN - 64)) | (1L << (OPTIONAL - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (OR - 131)) | (1L << (OUTPUT - 131)) | (1L << (PARAMARRAY - 131)) | (1L << (PRESERVE - 131)) | (1L << (PRINT - 131)) | (1L << (PRIVATE - 131)) | (1L << (PUBLIC - 131)) | (1L << (PUT - 131)) | (1L << (RANDOM - 131)) | (1L << (RANDOMIZE - 131)) | (1L << (RAISEEVENT - 131)) | (1L << (READ - 131)) | (1L << (REDIM - 131)) | (1L << (REM - 131)) | (1L << (RESET - 131)) | (1L << (RESUME - 131)) | (1L << (RETURN - 131)) | (1L << (RMDIR - 131)) | (1L << (RSET - 131)) | (1L << (SAVEPICTURE - 131)) | (1L << (SAVESETTING - 131)) | (1L << (SEEK - 131)) | (1L << (SELECT - 131)) | (1L << (SENDKEYS - 131)) | (1L << (SET - 131)) | (1L << (SETATTR - 131)) | (1L << (SHARED - 131)) | (1L << (SINGLE - 131)) | (1L << (SPC - 131)) | (1L << (STATIC - 131)) | (1L << (STEP - 131)) | (1L << (STRING - 131)) | (1L << (SUB - 131)) | (1L << (TAB - 131)) | (1L << (TEXT - 131)) | (1L << (THEN - 131)) | (1L << (TIME - 131)) | (1L << (TO - 131)) | (1L << (TRUE - 131)) | (1L << (TYPE - 131)) | (1L << (TYPEOF - 131)) | (1L << (UNLOAD - 131)) | (1L << (UNLOCK - 131)) | (1L << (UNTIL - 131)) | (1L << (VARIANT - 131)) | (1L << (VERSION - 131)) | (1L << (WEND - 131)) | (1L << (WHILE - 131)) | (1L << (WIDTH - 131)) | (1L << (WITH - 131)) | (1L << (WITHEVENTS - 131)) | (1L << (WRITE - 131)) | (1L << (XOR - 131)))) != 0) || ((((_la - 204)) & ~0x3f) == 0 && ((1L << (_la - 204)) & ((1L << (MINUS - 204)) | (1L << (PLUS - 204)) | (1L << (STRINGLITERAL - 204)) | (1L << (OCTLITERAL - 204)) | (1L << (HEXLITERAL - 204)) | (1L << (SHORTLITERAL - 204)) | (1L << (INTEGERLITERAL - 204)) | (1L << (DOUBLELITERAL - 204)) | (1L << (DATELITERAL - 204)) | (1L << (IDENTIFIER - 204)))) != 0)) {
					{
					setState(2383);
					constSubscripts();
					setState(2385);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(2384);
						match(WS);
						}
					}

					}
				}

				setState(2389);
				match(RPAREN);
				setState(2391);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,385,_ctx) ) {
				case 1:
					{
					setState(2390);
					match(WS);
					}
					break;
				}
				}
				break;
			}
			setState(2396);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,387,_ctx) ) {
			case 1:
				{
				setState(2395);
				typeHint();
				}
				break;
			}
			setState(2400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,388,_ctx) ) {
			case 1:
				{
				setState(2398);
				match(WS);
				setState(2399);
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
		enterRule(_localctx, 214, RULE_whileWendStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2402);
			match(WHILE);
			setState(2403);
			match(WS);
			setState(2404);
			valueStmt(0);
			setState(2405);
			endOfStatement();
			setState(2407);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,389,_ctx) ) {
			case 1:
				{
				setState(2406);
				block();
				}
				break;
			}
			setState(2409);
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
		enterRule(_localctx, 216, RULE_widthStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2411);
			match(WIDTH);
			setState(2412);
			match(WS);
			setState(2413);
			fileNumber();
			setState(2415);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(2414);
				match(WS);
				}
			}

			setState(2417);
			match(T__0);
			setState(2419);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,391,_ctx) ) {
			case 1:
				{
				setState(2418);
				match(WS);
				}
				break;
			}
			setState(2421);
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
		enterRule(_localctx, 218, RULE_withStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2423);
			match(WITH);
			setState(2424);
			match(WS);
			setState(2429);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,392,_ctx) ) {
			case 1:
				{
				setState(2425);
				implicitCallStmt_InStmt();
				}
				break;
			case 2:
				{
				{
				setState(2426);
				match(NEW);
				setState(2427);
				match(WS);
				setState(2428);
				type();
				}
				}
				break;
			}
			setState(2431);
			endOfStatement();
			setState(2433);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH) | (1L << END))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ENUM - 64)) | (1L << (EQV - 64)) | (1L << (ERASE - 64)) | (1L << (ERROR - 64)) | (1L << (EVENT - 64)) | (1L << (EXIT_DO - 64)) | (1L << (EXIT_FOR - 64)) | (1L << (EXIT_FUNCTION - 64)) | (1L << (EXIT_PROPERTY - 64)) | (1L << (EXIT_SUB - 64)) | (1L << (EXIT_RULE - 64)) | (1L << (FALSE - 64)) | (1L << (FILECOPY - 64)) | (1L << (FRIEND - 64)) | (1L << (FOR - 64)) | (1L << (FUNCTION - 64)) | (1L << (GET - 64)) | (1L << (GLOBAL - 64)) | (1L << (GOSUB - 64)) | (1L << (GOTO - 64)) | (1L << (IF - 64)) | (1L << (IMP - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (IN - 64)) | (1L << (INPUT - 64)) | (1L << (IS - 64)) | (1L << (INTEGER - 64)) | (1L << (KILL - 64)) | (1L << (LOAD - 64)) | (1L << (LOCK - 64)) | (1L << (LONG - 64)) | (1L << (LOOP - 64)) | (1L << (LEN - 64)) | (1L << (LET - 64)) | (1L << (LIB - 64)) | (1L << (LIKE - 64)) | (1L << (LINE_INPUT - 64)) | (1L << (LSET - 64)) | (1L << (ME - 64)) | (1L << (MID - 64)) | (1L << (MKDIR - 64)) | (1L << (MOD - 64)) | (1L << (NAME - 64)) | (1L << (NEXT - 64)) | (1L << (NEW - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (EMPTY - 64)) | (1L << (ON - 64)) | (1L << (ON_ERROR - 64)) | (1L << (ON_LOCAL_ERROR - 64)) | (1L << (OPEN - 64)) | (1L << (OPTIONAL - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (OR - 131)) | (1L << (OUTPUT - 131)) | (1L << (PARAMARRAY - 131)) | (1L << (PRESERVE - 131)) | (1L << (PRINT - 131)) | (1L << (PRIVATE - 131)) | (1L << (PUBLIC - 131)) | (1L << (PUT - 131)) | (1L << (RANDOM - 131)) | (1L << (RANDOMIZE - 131)) | (1L << (RAISEEVENT - 131)) | (1L << (READ - 131)) | (1L << (REDIM - 131)) | (1L << (REM - 131)) | (1L << (RESET - 131)) | (1L << (RESUME - 131)) | (1L << (RETURN - 131)) | (1L << (RMDIR - 131)) | (1L << (RSET - 131)) | (1L << (SAVEPICTURE - 131)) | (1L << (SAVESETTING - 131)) | (1L << (SEEK - 131)) | (1L << (SELECT - 131)) | (1L << (SENDKEYS - 131)) | (1L << (SET - 131)) | (1L << (SETATTR - 131)) | (1L << (SHARED - 131)) | (1L << (SINGLE - 131)) | (1L << (SPC - 131)) | (1L << (STATIC - 131)) | (1L << (STEP - 131)) | (1L << (STOP - 131)) | (1L << (STRING - 131)) | (1L << (SUB - 131)) | (1L << (TAB - 131)) | (1L << (TEXT - 131)) | (1L << (THEN - 131)) | (1L << (TIME - 131)) | (1L << (TO - 131)) | (1L << (TRUE - 131)) | (1L << (TYPE - 131)) | (1L << (TYPEOF - 131)) | (1L << (UNLOAD - 131)) | (1L << (UNLOCK - 131)) | (1L << (UNTIL - 131)) | (1L << (VARIANT - 131)) | (1L << (VERSION - 131)) | (1L << (WEND - 131)) | (1L << (WHILE - 131)) | (1L << (WIDTH - 131)) | (1L << (WITH - 131)) | (1L << (WITHEVENTS - 131)) | (1L << (WRITE - 131)) | (1L << (XOR - 131)))) != 0) || _la==WS || _la==IDENTIFIER) {
				{
				setState(2432);
				block();
				}
			}

			setState(2435);
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
		enterRule(_localctx, 220, RULE_writeStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2437);
			match(WRITE);
			setState(2438);
			match(WS);
			setState(2439);
			fileNumber();
			setState(2441);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(2440);
				match(WS);
				}
			}

			setState(2443);
			match(T__0);
			setState(2448);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,396,_ctx) ) {
			case 1:
				{
				setState(2445);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,395,_ctx) ) {
				case 1:
					{
					setState(2444);
					match(WS);
					}
					break;
				}
				setState(2447);
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
		enterRule(_localctx, 222, RULE_fileNumber);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2451);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(2450);
				match(T__3);
				}
			}

			setState(2453);
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
		enterRule(_localctx, 224, RULE_explicitCallStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2455);
			match(CALL);
			setState(2456);
			match(WS);
			setState(2457);
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
		enterRule(_localctx, 226, RULE_implicitCallStmt_InBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2459);
			implicitCallStmt_InStmt();
			setState(2462);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,398,_ctx) ) {
			case 1:
				{
				setState(2460);
				match(WS);
				setState(2461);
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
		enterRule(_localctx, 228, RULE_implicitCallStmt_InStmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2464);
			iCS_startElement();
			setState(2468);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,399,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2465);
					iCS_followElement();
					}
					} 
				}
				setState(2470);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,399,_ctx);
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
		enterRule(_localctx, 230, RULE_iCS_startElement);
		try {
			setState(2477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,401,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2471);
				ambiguousIdentifier();
				setState(2473);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,400,_ctx) ) {
				case 1:
					{
					setState(2472);
					typeHint();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2475);
				memberCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2476);
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
		enterRule(_localctx, 232, RULE_iCS_followElement);
		int _la;
		try {
			setState(2492);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,405,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2479);
				memberCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2480);
				dictionaryCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2481);
				match(LPAREN);
				setState(2483);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,402,_ctx) ) {
				case 1:
					{
					setState(2482);
					match(WS);
					}
					break;
				}
				setState(2486);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,403,_ctx) ) {
				case 1:
					{
					setState(2485);
					argsCall();
					}
					break;
				}
				setState(2489);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(2488);
					match(WS);
					}
				}

				setState(2491);
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
		enterRule(_localctx, 234, RULE_memberCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2495);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(2494);
				match(WS);
				}
			}

			setState(2497);
			match(T__2);
			setState(2499);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(2498);
				match(WS);
				}
			}

			setState(2501);
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
		enterRule(_localctx, 236, RULE_dictionaryCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2504);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(2503);
				match(WS);
				}
			}

			setState(2506);
			match(T__4);
			setState(2508);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(2507);
				match(WS);
				}
			}

			setState(2510);
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
		enterRule(_localctx, 238, RULE_argsCall);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2524);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,413,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2513);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,410,_ctx) ) {
					case 1:
						{
						setState(2512);
						argCall();
						}
						break;
					}
					setState(2516);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(2515);
						match(WS);
						}
					}

					setState(2518);
					match(T__0);
					setState(2520);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,412,_ctx) ) {
					case 1:
						{
						setState(2519);
						match(WS);
						}
						break;
					}
					}
					} 
				}
				setState(2526);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,413,_ctx);
			}
			setState(2527);
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
		enterRule(_localctx, 240, RULE_argCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2537);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,416,_ctx) ) {
			case 1:
				{
				setState(2529);
				ambiguousIdentifier();
				setState(2531);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(2530);
					match(WS);
					}
				}

				setState(2533);
				match(ASSIGN);
				setState(2535);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,415,_ctx) ) {
				case 1:
					{
					setState(2534);
					match(WS);
					}
					break;
				}
				}
				break;
			}
			setState(2539);
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
		enterRule(_localctx, 242, RULE_argList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2541);
			match(LPAREN);
			setState(2559);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,421,_ctx) ) {
			case 1:
				{
				setState(2543);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(2542);
					match(WS);
					}
				}

				setState(2545);
				arg();
				setState(2556);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,420,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2547);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2546);
							match(WS);
							}
						}

						setState(2549);
						match(T__0);
						setState(2551);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2550);
							match(WS);
							}
						}

						setState(2553);
						arg();
						}
						} 
					}
					setState(2558);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,420,_ctx);
				}
				}
				break;
			}
			setState(2562);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(2561);
				match(WS);
				}
			}

			setState(2564);
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
		enterRule(_localctx, 244, RULE_arg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2568);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,423,_ctx) ) {
			case 1:
				{
				setState(2566);
				match(OPTIONAL);
				setState(2567);
				match(WS);
				}
				break;
			}
			setState(2572);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,424,_ctx) ) {
			case 1:
				{
				setState(2570);
				_la = _input.LA(1);
				if ( !(_la==BYVAL || _la==BYREF) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(2571);
				match(WS);
				}
				break;
			}
			setState(2576);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,425,_ctx) ) {
			case 1:
				{
				setState(2574);
				match(PARAMARRAY);
				setState(2575);
				match(WS);
				}
				break;
			}
			setState(2578);
			ambiguousIdentifier();
			setState(2580);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0) || _la==AMPERSAND) {
				{
				setState(2579);
				typeHint();
				}
			}

			setState(2590);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,429,_ctx) ) {
			case 1:
				{
				setState(2583);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(2582);
					match(WS);
					}
				}

				setState(2585);
				match(LPAREN);
				setState(2587);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(2586);
					match(WS);
					}
				}

				setState(2589);
				match(RPAREN);
				}
				break;
			}
			setState(2596);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,431,_ctx) ) {
			case 1:
				{
				setState(2593);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(2592);
					match(WS);
					}
				}

				setState(2595);
				asTypeClause();
				}
				break;
			}
			setState(2602);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,433,_ctx) ) {
			case 1:
				{
				setState(2599);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(2598);
					match(WS);
					}
				}

				setState(2601);
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
		enterRule(_localctx, 246, RULE_argDefaultValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2604);
			match(EQ);
			setState(2606);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(2605);
				match(WS);
				}
			}

			setState(2608);
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
		enterRule(_localctx, 248, RULE_subscripts);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2610);
			subscript();
			setState(2621);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,437,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2612);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(2611);
						match(WS);
						}
					}

					setState(2614);
					match(T__0);
					setState(2616);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,436,_ctx) ) {
					case 1:
						{
						setState(2615);
						match(WS);
						}
						break;
					}
					setState(2618);
					subscript();
					}
					} 
				}
				setState(2623);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,437,_ctx);
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
		enterRule(_localctx, 250, RULE_subscript);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2629);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,438,_ctx) ) {
			case 1:
				{
				setState(2624);
				valueStmt(0);
				setState(2625);
				match(WS);
				setState(2626);
				match(TO);
				setState(2627);
				match(WS);
				}
				break;
			}
			setState(2631);
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
		enterRule(_localctx, 252, RULE_constSubscripts);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2633);
			constSubscript();
			setState(2644);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,441,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2635);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(2634);
						match(WS);
						}
					}

					setState(2637);
					match(T__0);
					setState(2639);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(2638);
						match(WS);
						}
					}

					setState(2641);
					constSubscript();
					}
					} 
				}
				setState(2646);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,441,_ctx);
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
		enterRule(_localctx, 254, RULE_constSubscript);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2652);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,442,_ctx) ) {
			case 1:
				{
				setState(2647);
				constValueExpr(0);
				setState(2648);
				match(WS);
				setState(2649);
				match(TO);
				setState(2650);
				match(WS);
				}
				break;
			}
			setState(2654);
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
		enterRule(_localctx, 256, RULE_ambiguousIdentifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2658); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(2658);
					switch (_input.LA(1)) {
					case IDENTIFIER:
						{
						setState(2656);
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
						setState(2657);
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
				setState(2660); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,444,_ctx);
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
		enterRule(_localctx, 258, RULE_asTypeClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2662);
			match(AS);
			setState(2664);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(2663);
				match(WS);
				}
			}

			setState(2668);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,446,_ctx) ) {
			case 1:
				{
				setState(2666);
				match(NEW);
				setState(2667);
				match(WS);
				}
				break;
			}
			setState(2670);
			type();
			setState(2675);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,448,_ctx) ) {
			case 1:
				{
				setState(2672);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(2671);
					match(WS);
					}
				}

				setState(2674);
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
		enterRule(_localctx, 260, RULE_baseType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2677);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << DATE) | (1L << DOUBLE))) != 0) || _la==INTEGER || _la==LONG || ((((_la - 163)) & ~0x3f) == 0 && ((1L << (_la - 163)) & ((1L << (SINGLE - 163)) | (1L << (CURRENCY - 163)) | (1L << (DECIMAL - 163)) | (1L << (STRING - 163)) | (1L << (VARIANT - 163)) | (1L << (OBJECT - 163)) | (1L << (IUNKNOWN - 163)))) != 0)) ) {
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
		enterRule(_localctx, 262, RULE_certainIdentifier);
		int _la;
		try {
			setState(2694);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2679);
				match(IDENTIFIER);
				setState(2684);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ENUM - 64)) | (1L << (EQV - 64)) | (1L << (ERASE - 64)) | (1L << (ERROR - 64)) | (1L << (EVENT - 64)) | (1L << (FALSE - 64)) | (1L << (FILECOPY - 64)) | (1L << (FRIEND - 64)) | (1L << (FOR - 64)) | (1L << (FUNCTION - 64)) | (1L << (GET - 64)) | (1L << (GLOBAL - 64)) | (1L << (GOSUB - 64)) | (1L << (GOTO - 64)) | (1L << (IF - 64)) | (1L << (IMP - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (IN - 64)) | (1L << (INPUT - 64)) | (1L << (IS - 64)) | (1L << (INTEGER - 64)) | (1L << (KILL - 64)) | (1L << (LOAD - 64)) | (1L << (LOCK - 64)) | (1L << (LONG - 64)) | (1L << (LOOP - 64)) | (1L << (LEN - 64)) | (1L << (LET - 64)) | (1L << (LIB - 64)) | (1L << (LIKE - 64)) | (1L << (LSET - 64)) | (1L << (ME - 64)) | (1L << (MID - 64)) | (1L << (MKDIR - 64)) | (1L << (MOD - 64)) | (1L << (NAME - 64)) | (1L << (NEXT - 64)) | (1L << (NEW - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (EMPTY - 64)) | (1L << (ON - 64)) | (1L << (OPEN - 64)) | (1L << (OPTIONAL - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (OR - 131)) | (1L << (OUTPUT - 131)) | (1L << (PARAMARRAY - 131)) | (1L << (PRESERVE - 131)) | (1L << (PRINT - 131)) | (1L << (PRIVATE - 131)) | (1L << (PUBLIC - 131)) | (1L << (PUT - 131)) | (1L << (RANDOM - 131)) | (1L << (RANDOMIZE - 131)) | (1L << (RAISEEVENT - 131)) | (1L << (READ - 131)) | (1L << (REDIM - 131)) | (1L << (REM - 131)) | (1L << (RESET - 131)) | (1L << (RESUME - 131)) | (1L << (RETURN - 131)) | (1L << (RMDIR - 131)) | (1L << (RSET - 131)) | (1L << (SAVEPICTURE - 131)) | (1L << (SAVESETTING - 131)) | (1L << (SEEK - 131)) | (1L << (SELECT - 131)) | (1L << (SENDKEYS - 131)) | (1L << (SET - 131)) | (1L << (SETATTR - 131)) | (1L << (SHARED - 131)) | (1L << (SINGLE - 131)) | (1L << (SPC - 131)) | (1L << (STATIC - 131)) | (1L << (STEP - 131)) | (1L << (STRING - 131)) | (1L << (SUB - 131)) | (1L << (TAB - 131)) | (1L << (TEXT - 131)) | (1L << (THEN - 131)) | (1L << (TIME - 131)) | (1L << (TO - 131)) | (1L << (TRUE - 131)) | (1L << (TYPE - 131)) | (1L << (TYPEOF - 131)) | (1L << (UNLOAD - 131)) | (1L << (UNLOCK - 131)) | (1L << (UNTIL - 131)) | (1L << (VARIANT - 131)) | (1L << (VERSION - 131)) | (1L << (WEND - 131)) | (1L << (WHILE - 131)) | (1L << (WIDTH - 131)) | (1L << (WITH - 131)) | (1L << (WITHEVENTS - 131)) | (1L << (WRITE - 131)) | (1L << (XOR - 131)))) != 0) || _la==IDENTIFIER) {
					{
					setState(2682);
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
						setState(2680);
						ambiguousKeyword();
						}
						break;
					case IDENTIFIER:
						{
						setState(2681);
						match(IDENTIFIER);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(2686);
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
				setState(2687);
				ambiguousKeyword();
				setState(2690); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(2690);
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
						setState(2688);
						ambiguousKeyword();
						}
						break;
					case IDENTIFIER:
						{
						setState(2689);
						match(IDENTIFIER);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(2692); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ENUM - 64)) | (1L << (EQV - 64)) | (1L << (ERASE - 64)) | (1L << (ERROR - 64)) | (1L << (EVENT - 64)) | (1L << (FALSE - 64)) | (1L << (FILECOPY - 64)) | (1L << (FRIEND - 64)) | (1L << (FOR - 64)) | (1L << (FUNCTION - 64)) | (1L << (GET - 64)) | (1L << (GLOBAL - 64)) | (1L << (GOSUB - 64)) | (1L << (GOTO - 64)) | (1L << (IF - 64)) | (1L << (IMP - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (IN - 64)) | (1L << (INPUT - 64)) | (1L << (IS - 64)) | (1L << (INTEGER - 64)) | (1L << (KILL - 64)) | (1L << (LOAD - 64)) | (1L << (LOCK - 64)) | (1L << (LONG - 64)) | (1L << (LOOP - 64)) | (1L << (LEN - 64)) | (1L << (LET - 64)) | (1L << (LIB - 64)) | (1L << (LIKE - 64)) | (1L << (LSET - 64)) | (1L << (ME - 64)) | (1L << (MID - 64)) | (1L << (MKDIR - 64)) | (1L << (MOD - 64)) | (1L << (NAME - 64)) | (1L << (NEXT - 64)) | (1L << (NEW - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (EMPTY - 64)) | (1L << (ON - 64)) | (1L << (OPEN - 64)) | (1L << (OPTIONAL - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (OR - 131)) | (1L << (OUTPUT - 131)) | (1L << (PARAMARRAY - 131)) | (1L << (PRESERVE - 131)) | (1L << (PRINT - 131)) | (1L << (PRIVATE - 131)) | (1L << (PUBLIC - 131)) | (1L << (PUT - 131)) | (1L << (RANDOM - 131)) | (1L << (RANDOMIZE - 131)) | (1L << (RAISEEVENT - 131)) | (1L << (READ - 131)) | (1L << (REDIM - 131)) | (1L << (REM - 131)) | (1L << (RESET - 131)) | (1L << (RESUME - 131)) | (1L << (RETURN - 131)) | (1L << (RMDIR - 131)) | (1L << (RSET - 131)) | (1L << (SAVEPICTURE - 131)) | (1L << (SAVESETTING - 131)) | (1L << (SEEK - 131)) | (1L << (SELECT - 131)) | (1L << (SENDKEYS - 131)) | (1L << (SET - 131)) | (1L << (SETATTR - 131)) | (1L << (SHARED - 131)) | (1L << (SINGLE - 131)) | (1L << (SPC - 131)) | (1L << (STATIC - 131)) | (1L << (STEP - 131)) | (1L << (STRING - 131)) | (1L << (SUB - 131)) | (1L << (TAB - 131)) | (1L << (TEXT - 131)) | (1L << (THEN - 131)) | (1L << (TIME - 131)) | (1L << (TO - 131)) | (1L << (TRUE - 131)) | (1L << (TYPE - 131)) | (1L << (TYPEOF - 131)) | (1L << (UNLOAD - 131)) | (1L << (UNLOCK - 131)) | (1L << (UNTIL - 131)) | (1L << (VARIANT - 131)) | (1L << (VERSION - 131)) | (1L << (WEND - 131)) | (1L << (WHILE - 131)) | (1L << (WIDTH - 131)) | (1L << (WITH - 131)) | (1L << (WITHEVENTS - 131)) | (1L << (WRITE - 131)) | (1L << (XOR - 131)))) != 0) || _la==IDENTIFIER );
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
		enterRule(_localctx, 264, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2696);
			_la = _input.LA(1);
			if ( !(_la==IS || _la==LIKE || ((((_la - 198)) & ~0x3f) == 0 && ((1L << (_la - 198)) & ((1L << (EQ - 198)) | (1L << (GEQ - 198)) | (1L << (GT - 198)) | (1L << (LEQ - 198)) | (1L << (LT - 198)) | (1L << (NEQ - 198)))) != 0)) ) {
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
		enterRule(_localctx, 266, RULE_fixedSizeString);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2698);
			match(STRING);
			setState(2700);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(2699);
				match(WS);
				}
			}

			setState(2702);
			match(MULT);
			setState(2704);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(2703);
				match(WS);
				}
			}

			setState(2708);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,456,_ctx) ) {
			case 1:
				{
				setState(2706);
				literal();
				}
				break;
			case 2:
				{
				setState(2707);
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
		enterRule(_localctx, 268, RULE_complexType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2710);
			ambiguousIdentifier();
			setState(2715);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,457,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2711);
					match(T__2);
					setState(2712);
					ambiguousIdentifier();
					}
					} 
				}
				setState(2717);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,457,_ctx);
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
		enterRule(_localctx, 270, RULE_fieldLength);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2718);
			match(MULT);
			setState(2720);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(2719);
				match(WS);
				}
			}

			setState(2724);
			switch (_input.LA(1)) {
			case INTEGERLITERAL:
				{
				setState(2722);
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
				setState(2723);
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
		enterRule(_localctx, 272, RULE_letterrange);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2726);
			certainIdentifier();
			setState(2735);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,462,_ctx) ) {
			case 1:
				{
				setState(2728);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(2727);
					match(WS);
					}
				}

				setState(2730);
				match(MINUS);
				setState(2732);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(2731);
					match(WS);
					}
				}

				setState(2734);
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
		enterRule(_localctx, 274, RULE_lineLabel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2737);
			ambiguousIdentifier();
			setState(2738);
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
		enterRule(_localctx, 276, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2740);
			_la = _input.LA(1);
			if ( !(((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (FALSE - 75)) | (1L << (NOTHING - 75)) | (1L << (NULL - 75)) | (1L << (EMPTY - 75)))) != 0) || ((((_la - 177)) & ~0x3f) == 0 && ((1L << (_la - 177)) & ((1L << (TRUE - 177)) | (1L << (STRINGLITERAL - 177)) | (1L << (OCTLITERAL - 177)) | (1L << (HEXLITERAL - 177)) | (1L << (SHORTLITERAL - 177)) | (1L << (INTEGERLITERAL - 177)) | (1L << (DOUBLELITERAL - 177)) | (1L << (DATELITERAL - 177)))) != 0)) ) {
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
		enterRule(_localctx, 278, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2745);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,463,_ctx) ) {
			case 1:
				{
				setState(2742);
				fixedSizeString();
				}
				break;
			case 2:
				{
				setState(2743);
				baseType();
				}
				break;
			case 3:
				{
				setState(2744);
				complexType();
				}
				break;
			}
			setState(2755);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,466,_ctx) ) {
			case 1:
				{
				setState(2748);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(2747);
					match(WS);
					}
				}

				setState(2750);
				match(LPAREN);
				setState(2752);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(2751);
					match(WS);
					}
				}

				setState(2754);
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
		enterRule(_localctx, 280, RULE_typeHint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2757);
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
		enterRule(_localctx, 282, RULE_visibility);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2759);
			_la = _input.LA(1);
			if ( !(((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (FRIEND - 77)) | (1L << (GLOBAL - 77)) | (1L << (PRIVATE - 77)))) != 0) || _la==PUBLIC) ) {
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
		enterRule(_localctx, 284, RULE_ambiguousKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2761);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ENUM - 64)) | (1L << (EQV - 64)) | (1L << (ERASE - 64)) | (1L << (ERROR - 64)) | (1L << (EVENT - 64)) | (1L << (FALSE - 64)) | (1L << (FILECOPY - 64)) | (1L << (FRIEND - 64)) | (1L << (FOR - 64)) | (1L << (FUNCTION - 64)) | (1L << (GET - 64)) | (1L << (GLOBAL - 64)) | (1L << (GOSUB - 64)) | (1L << (GOTO - 64)) | (1L << (IF - 64)) | (1L << (IMP - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (IN - 64)) | (1L << (INPUT - 64)) | (1L << (IS - 64)) | (1L << (INTEGER - 64)) | (1L << (KILL - 64)) | (1L << (LOAD - 64)) | (1L << (LOCK - 64)) | (1L << (LONG - 64)) | (1L << (LOOP - 64)) | (1L << (LEN - 64)) | (1L << (LET - 64)) | (1L << (LIB - 64)) | (1L << (LIKE - 64)) | (1L << (LSET - 64)) | (1L << (ME - 64)) | (1L << (MID - 64)) | (1L << (MKDIR - 64)) | (1L << (MOD - 64)) | (1L << (NAME - 64)) | (1L << (NEXT - 64)) | (1L << (NEW - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (EMPTY - 64)) | (1L << (ON - 64)) | (1L << (OPEN - 64)) | (1L << (OPTIONAL - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (OR - 131)) | (1L << (OUTPUT - 131)) | (1L << (PARAMARRAY - 131)) | (1L << (PRESERVE - 131)) | (1L << (PRINT - 131)) | (1L << (PRIVATE - 131)) | (1L << (PUBLIC - 131)) | (1L << (PUT - 131)) | (1L << (RANDOM - 131)) | (1L << (RANDOMIZE - 131)) | (1L << (RAISEEVENT - 131)) | (1L << (READ - 131)) | (1L << (REDIM - 131)) | (1L << (REM - 131)) | (1L << (RESET - 131)) | (1L << (RESUME - 131)) | (1L << (RETURN - 131)) | (1L << (RMDIR - 131)) | (1L << (RSET - 131)) | (1L << (SAVEPICTURE - 131)) | (1L << (SAVESETTING - 131)) | (1L << (SEEK - 131)) | (1L << (SELECT - 131)) | (1L << (SENDKEYS - 131)) | (1L << (SET - 131)) | (1L << (SETATTR - 131)) | (1L << (SHARED - 131)) | (1L << (SINGLE - 131)) | (1L << (SPC - 131)) | (1L << (STATIC - 131)) | (1L << (STEP - 131)) | (1L << (STRING - 131)) | (1L << (SUB - 131)) | (1L << (TAB - 131)) | (1L << (TEXT - 131)) | (1L << (THEN - 131)) | (1L << (TIME - 131)) | (1L << (TO - 131)) | (1L << (TRUE - 131)) | (1L << (TYPE - 131)) | (1L << (TYPEOF - 131)) | (1L << (UNLOAD - 131)) | (1L << (UNLOCK - 131)) | (1L << (UNTIL - 131)) | (1L << (VARIANT - 131)) | (1L << (VERSION - 131)) | (1L << (WEND - 131)) | (1L << (WHILE - 131)) | (1L << (WIDTH - 131)) | (1L << (WITH - 131)) | (1L << (WITHEVENTS - 131)) | (1L << (WRITE - 131)) | (1L << (XOR - 131)))) != 0)) ) {
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
		enterRule(_localctx, 286, RULE_remComment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2763);
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
		enterRule(_localctx, 288, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2765);
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
		enterRule(_localctx, 290, RULE_endOfLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2768);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(2767);
				match(WS);
				}
			}

			setState(2773);
			switch (_input.LA(1)) {
			case NEWLINE:
				{
				setState(2770);
				match(NEWLINE);
				}
				break;
			case COMMENT:
				{
				setState(2771);
				comment();
				}
				break;
			case REMCOMMENT:
				{
				setState(2772);
				remComment();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2776);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,469,_ctx) ) {
			case 1:
				{
				setState(2775);
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
		enterRule(_localctx, 292, RULE_endOfStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2786); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(2786);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,472,_ctx) ) {
					case 1:
						{
						setState(2778);
						endOfLine();
						}
						break;
					case 2:
						{
						setState(2780);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2779);
							match(WS);
							}
						}

						setState(2782);
						match(COLON);
						setState(2784);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,471,_ctx) ) {
						case 1:
							{
							setState(2783);
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
				setState(2788); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,473,_ctx);
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
		case 102:
			return constValueExpr_sempred((ConstValueExprContext)_localctx, predIndex);
		case 103:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u00e7\u0ae9\4\2\t"+
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
		"\4\u0093\t\u0093\4\u0094\t\u0094\3\2\3\2\3\2\3\3\5\3\u012d\n\3\3\3\7\3"+
		"\u0130\n\3\f\3\16\3\u0133\13\3\3\3\3\3\7\3\u0137\n\3\f\3\16\3\u013a\13"+
		"\3\5\3\u013c\n\3\3\3\5\3\u013f\n\3\3\3\7\3\u0142\n\3\f\3\16\3\u0145\13"+
		"\3\3\3\5\3\u0148\n\3\3\3\7\3\u014b\n\3\f\3\16\3\u014e\13\3\3\3\5\3\u0151"+
		"\n\3\3\3\7\3\u0154\n\3\f\3\16\3\u0157\13\3\3\3\5\3\u015a\n\3\3\3\7\3\u015d"+
		"\n\3\f\3\16\3\u0160\13\3\3\3\5\3\u0163\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\7\5\u016d\n\5\f\5\16\5\u0170\13\5\3\5\6\5\u0173\n\5\r\5\16\5\u0174"+
		"\3\5\3\5\3\6\3\6\5\6\u017b\n\6\3\6\3\6\5\6\u017f\n\6\3\6\3\6\7\6\u0183"+
		"\n\6\f\6\16\6\u0186\13\6\3\7\3\7\6\7\u018a\n\7\r\7\16\7\u018b\6\7\u018e"+
		"\n\7\r\7\16\7\u018f\3\b\3\b\6\b\u0194\n\b\r\b\16\b\u0195\3\b\3\b\7\b\u019a"+
		"\n\b\f\b\16\b\u019d\13\b\3\b\7\b\u01a0\n\b\f\b\16\b\u01a3\13\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u01ad\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\5\n\u01b9\n\n\3\13\3\13\5\13\u01bd\n\13\3\f\3\f\6\f\u01c1\n\f"+
		"\r\f\16\f\u01c2\3\f\3\f\7\f\u01c7\n\f\f\f\16\f\u01ca\13\f\3\f\7\f\u01cd"+
		"\n\f\f\f\16\f\u01d0\13\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u01d8\n\r\3\16\3"+
		"\16\3\16\3\16\5\16\u01de\n\16\3\16\3\16\5\16\u01e2\n\16\3\16\3\16\5\16"+
		"\u01e6\n\16\3\16\3\16\5\16\u01ea\n\16\3\16\7\16\u01ed\n\16\f\16\16\16"+
		"\u01f0\13\16\3\17\3\17\3\17\3\17\7\17\u01f6\n\17\f\17\16\17\u01f9\13\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u023e\n\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0272\n\21\3\22\3\22\3\22"+
		"\3\22\5\22\u0278\n\22\3\22\3\22\5\22\u027c\n\22\3\22\5\22\u027f\n\22\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\5"+
		"\26\u028f\n\26\3\26\3\26\5\26\u0293\n\26\3\26\7\26\u0296\n\26\f\26\16"+
		"\26\u0299\13\26\5\26\u029b\n\26\3\27\3\27\3\27\5\27\u02a0\n\27\3\27\3"+
		"\27\3\27\3\27\5\27\u02a6\n\27\3\27\3\27\5\27\u02aa\n\27\3\27\7\27\u02ad"+
		"\n\27\f\27\16\27\u02b0\13\27\3\30\3\30\5\30\u02b4\n\30\3\30\3\30\5\30"+
		"\u02b8\n\30\3\30\5\30\u02bb\n\30\3\30\3\30\5\30\u02bf\n\30\3\30\3\30\3"+
		"\31\3\31\5\31\u02c5\n\31\3\31\3\31\5\31\u02c9\n\31\3\31\3\31\3\32\3\32"+
		"\3\32\5\32\u02d0\n\32\3\32\3\32\3\32\3\32\5\32\u02d6\n\32\3\32\3\32\5"+
		"\32\u02da\n\32\3\32\5\32\u02dd\n\32\3\32\3\32\3\32\5\32\u02e2\n\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u02ec\n\32\3\32\5\32\u02ef\n"+
		"\32\3\32\5\32\u02f2\n\32\3\32\3\32\5\32\u02f6\n\32\3\33\3\33\3\33\3\33"+
		"\5\33\u02fc\n\33\3\33\3\33\5\33\u0300\n\33\3\33\7\33\u0303\n\33\f\33\16"+
		"\33\u0306\13\33\3\34\3\34\3\34\3\34\5\34\u030c\n\34\3\34\3\34\5\34\u0310"+
		"\n\34\3\34\3\34\5\34\u0314\n\34\3\34\3\34\5\34\u0318\n\34\3\34\5\34\u031b"+
		"\n\34\3\35\3\35\3\35\5\35\u0320\n\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\5\35\u032b\n\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\5\35\u0338\n\35\3\36\3\36\3\37\3\37\3\37\5\37\u033f\n\37\3"+
		"\37\3\37\3\37\3\37\3\37\7\37\u0346\n\37\f\37\16\37\u0349\13\37\3\37\3"+
		"\37\3 \3 \5 \u034f\n \3 \3 \5 \u0353\n \3 \5 \u0356\n \3 \3 \3!\3!\3!"+
		"\3!\3\"\3\"\3\"\3\"\3#\3#\3#\5#\u0365\n#\3#\3#\3#\3#\5#\u036b\n#\3#\3"+
		"#\3$\3$\3%\3%\3%\3%\5%\u0375\n%\3%\3%\5%\u0379\n%\3%\3%\3&\3&\3&\3&\3"+
		"&\3&\5&\u0383\n&\3&\3&\3&\3&\3&\3&\5&\u038b\n&\3&\3&\3&\5&\u0390\n&\3"+
		"\'\3\'\3\'\3\'\5\'\u0396\n\'\3\'\3\'\5\'\u039a\n\'\3\'\5\'\u039d\n\'\3"+
		"\'\3\'\5\'\u03a1\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u03ac\n\'"+
		"\3\'\3\'\5\'\u03b0\n\'\3\'\3\'\3\'\5\'\u03b5\n\'\3(\3(\3(\5(\u03ba\n("+
		"\3(\3(\5(\u03be\n(\3(\3(\5(\u03c2\n(\3(\3(\5(\u03c6\n(\3(\5(\u03c9\n("+
		"\3(\5(\u03cc\n(\3(\5(\u03cf\n(\3(\5(\u03d2\n(\3(\3(\5(\u03d6\n(\3(\3("+
		"\3)\3)\3)\5)\u03dd\n)\3)\3)\5)\u03e1\n)\3)\3)\5)\u03e5\n)\3)\3)\5)\u03e9"+
		"\n)\3)\3)\3)\5)\u03ee\n)\3)\5)\u03f1\n)\3)\5)\u03f4\n)\3)\5)\u03f7\n)"+
		"\3)\5)\u03fa\n)\3)\5)\u03fd\n)\3)\3)\3)\5)\u0402\n)\3)\3)\5)\u0406\n)"+
		"\3)\3)\3*\3*\3*\3*\5*\u040e\n*\3*\3*\5*\u0412\n*\3*\5*\u0415\n*\3*\5*"+
		"\u0418\n*\3*\3*\5*\u041c\n*\3*\3*\3+\3+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3-"+
		"\3-\3-\3-\3-\3-\3-\3-\5-\u0433\n-\3-\3-\7-\u0437\n-\f-\16-\u043a\13-\3"+
		"-\5-\u043d\n-\3-\3-\5-\u0441\n-\3.\3.\3.\3.\3.\3.\3.\5.\u044a\n.\3/\3"+
		"/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u0455\n\60\3\61\3\61\3\61\5"+
		"\61\u045a\n\61\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\5\63\u0464\n\63"+
		"\3\63\3\63\5\63\u0468\n\63\3\63\6\63\u046b\n\63\r\63\16\63\u046c\3\64"+
		"\3\64\3\64\3\64\3\65\3\65\5\65\u0475\n\65\3\65\3\65\5\65\u0479\n\65\3"+
		"\65\3\65\5\65\u047d\n\65\3\65\3\65\3\66\3\66\3\66\3\66\5\66\u0485\n\66"+
		"\3\66\3\66\5\66\u0489\n\66\3\66\3\66\3\67\3\67\3\67\3\67\38\38\38\38\5"+
		"8\u0495\n8\38\38\58\u0499\n8\38\38\38\38\38\58\u04a0\n8\58\u04a2\n8\3"+
		"9\39\39\39\59\u04a8\n9\39\39\59\u04ac\n9\39\39\3:\3:\5:\u04b2\n:\3:\3"+
		":\5:\u04b6\n:\3:\3:\5:\u04ba\n:\3:\3:\3;\3;\7;\u04c0\n;\f;\16;\u04c3\13"+
		";\3;\5;\u04c6\n;\3;\3;\3<\3<\5<\u04cc\n<\3<\3<\3<\3<\3<\3<\3<\7<\u04d5"+
		"\n<\f<\16<\u04d8\13<\3=\3=\5=\u04dc\n=\3=\3=\3=\3=\3=\3=\3=\7=\u04e5\n"+
		"=\f=\16=\u04e8\13=\3>\3>\3>\3>\3>\7>\u04ef\n>\f>\16>\u04f2\13>\3?\3?\5"+
		"?\u04f6\n?\3?\3?\5?\u04fa\n?\3?\3?\5?\u04fe\n?\3?\3?\5?\u0502\n?\3?\3"+
		"?\5?\u0506\n?\3?\3?\5?\u050a\n?\3?\5?\u050d\n?\3?\5?\u0510\n?\3?\3?\5"+
		"?\u0514\n?\3?\3?\5?\u0518\n?\3?\3?\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3A\3"+
		"A\3B\3B\3B\3B\3B\3B\3B\3B\5B\u0530\nB\3C\3C\3C\3C\3C\3C\3C\3C\5C\u053a"+
		"\nC\3C\3C\5C\u053e\nC\3C\7C\u0541\nC\fC\16C\u0544\13C\3D\3D\3D\3D\3D\3"+
		"D\3D\3D\5D\u054e\nD\3D\3D\5D\u0552\nD\3D\7D\u0555\nD\fD\16D\u0558\13D"+
		"\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\5E\u0565\nE\3E\3E\5E\u0569\nE\3E\3E"+
		"\3E\3E\3E\3E\3E\5E\u0572\nE\3E\3E\5E\u0576\nE\3E\5E\u0579\nE\3F\3F\5F"+
		"\u057d\nF\3F\3F\5F\u0581\nF\3F\5F\u0584\nF\7F\u0586\nF\fF\16F\u0589\13"+
		"F\3F\5F\u058c\nF\3F\5F\u058f\nF\3F\3F\5F\u0593\nF\3F\5F\u0596\nF\6F\u0598"+
		"\nF\rF\16F\u0599\5F\u059c\nF\3G\3G\3G\5G\u05a1\nG\3G\3G\5G\u05a5\nG\3"+
		"G\3G\5G\u05a9\nG\3G\3G\5G\u05ad\nG\5G\u05af\nG\3H\3H\3H\3H\5H\u05b5\n"+
		"H\3H\3H\5H\u05b9\nH\3H\5H\u05bc\nH\3I\3I\3I\5I\u05c1\nI\3I\3I\5I\u05c5"+
		"\nI\3I\3I\3I\3I\5I\u05cb\nI\3I\5I\u05ce\nI\3I\5I\u05d1\nI\3I\3I\5I\u05d5"+
		"\nI\3I\3I\5I\u05d9\nI\3I\3I\3J\3J\3J\5J\u05e0\nJ\3J\3J\5J\u05e4\nJ\3J"+
		"\3J\3J\3J\5J\u05ea\nJ\3J\5J\u05ed\nJ\3J\3J\5J\u05f1\nJ\3J\3J\3K\3K\3K"+
		"\5K\u05f8\nK\3K\3K\5K\u05fc\nK\3K\3K\3K\3K\5K\u0602\nK\3K\5K\u0605\nK"+
		"\3K\3K\5K\u0609\nK\3K\3K\3L\3L\3L\3L\5L\u0611\nL\3L\3L\5L\u0615\nL\3L"+
		"\5L\u0618\nL\3L\5L\u061b\nL\3L\3L\5L\u061f\nL\3L\3L\3M\3M\3M\3M\5M\u0627"+
		"\nM\3M\3M\5M\u062b\nM\3M\3M\5M\u062f\nM\5M\u0631\nM\3M\5M\u0634\nM\3N"+
		"\3N\3N\5N\u0639\nN\3O\3O\3O\3O\5O\u063f\nO\3O\3O\5O\u0643\nO\3O\3O\5O"+
		"\u0647\nO\3O\7O\u064a\nO\fO\16O\u064d\13O\3P\3P\5P\u0651\nP\3P\3P\5P\u0655"+
		"\nP\3P\3P\5P\u0659\nP\3P\3P\3P\5P\u065e\nP\3Q\3Q\3R\3R\3R\3R\5R\u0666"+
		"\nR\5R\u0668\nR\3S\3S\3T\3T\3T\3T\3U\3U\3U\3U\5U\u0674\nU\3U\3U\5U\u0678"+
		"\nU\3U\3U\3V\3V\3V\3V\5V\u0680\nV\3V\3V\5V\u0684\nV\3V\3V\3W\3W\3W\3W"+
		"\5W\u068c\nW\3W\3W\5W\u0690\nW\3W\3W\5W\u0694\nW\3W\3W\5W\u0698\nW\3W"+
		"\3W\5W\u069c\nW\3W\3W\5W\u06a0\nW\3W\3W\3X\3X\3X\3X\5X\u06a8\nX\3X\3X"+
		"\5X\u06ac\nX\3X\3X\3Y\3Y\3Y\3Y\3Y\3Y\3Y\7Y\u06b7\nY\fY\16Y\u06ba\13Y\3"+
		"Y\3Y\3Z\3Z\5Z\u06c0\nZ\3Z\3Z\5Z\u06c4\nZ\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\5"+
		"Z\u06cf\nZ\3[\3[\3[\3[\3[\5[\u06d6\n[\3\\\3\\\3\\\5\\\u06db\n\\\3\\\3"+
		"\\\5\\\u06df\n\\\3\\\7\\\u06e2\n\\\f\\\16\\\u06e5\13\\\5\\\u06e7\n\\\3"+
		"]\3]\3]\3]\5]\u06ed\n]\3]\3]\5]\u06f1\n]\3]\5]\u06f4\n]\3^\3^\3^\3^\5"+
		"^\u06fa\n^\3^\3^\5^\u06fe\n^\3^\3^\3_\3_\3_\3_\5_\u0706\n_\3_\3_\5_\u070a"+
		"\n_\3_\3_\3`\3`\3a\3a\3a\5a\u0713\na\3a\3a\5a\u0717\na\3a\3a\5a\u071b"+
		"\na\3a\3a\5a\u071f\na\3a\5a\u0722\na\3a\3a\5a\u0726\na\3a\3a\3b\3b\5b"+
		"\u072c\nb\3b\3b\5b\u0730\nb\3b\3b\3c\3c\3c\5c\u0737\nc\3c\3c\3c\3c\3c"+
		"\7c\u073e\nc\fc\16c\u0741\13c\3c\3c\3d\3d\5d\u0747\nd\3d\3d\5d\u074b\n"+
		"d\3d\5d\u074e\nd\3d\5d\u0751\nd\3d\5d\u0754\nd\3d\3d\3d\3d\3e\3e\3e\3"+
		"e\3e\3e\3e\3e\3f\3f\3f\3f\3g\3g\3g\3g\5g\u076a\ng\3g\3g\5g\u076e\ng\3"+
		"g\3g\3g\3g\3g\5g\u0775\ng\5g\u0777\ng\3h\3h\3h\3h\3h\7h\u077e\nh\fh\16"+
		"h\u0781\13h\3h\3h\5h\u0785\nh\3h\3h\3h\5h\u078a\nh\3h\3h\3h\5h\u078f\n"+
		"h\3h\5h\u0792\nh\3h\3h\5h\u0796\nh\3h\3h\5h\u079a\nh\3h\3h\3h\5h\u079f"+
		"\nh\3h\3h\5h\u07a3\nh\3h\3h\3h\5h\u07a8\nh\3h\3h\5h\u07ac\nh\3h\3h\3h"+
		"\5h\u07b1\nh\3h\3h\5h\u07b5\nh\3h\3h\3h\5h\u07ba\nh\3h\3h\5h\u07be\nh"+
		"\3h\3h\3h\5h\u07c3\nh\3h\3h\5h\u07c7\nh\3h\3h\3h\5h\u07cc\nh\3h\3h\5h"+
		"\u07d0\nh\3h\3h\3h\5h\u07d5\nh\3h\3h\5h\u07d9\nh\3h\3h\3h\5h\u07de\nh"+
		"\3h\3h\5h\u07e2\nh\3h\3h\3h\5h\u07e7\nh\3h\3h\5h\u07eb\nh\3h\3h\3h\5h"+
		"\u07f0\nh\3h\3h\5h\u07f4\nh\3h\3h\3h\5h\u07f9\nh\3h\3h\5h\u07fd\nh\3h"+
		"\3h\3h\5h\u0802\nh\3h\3h\5h\u0806\nh\3h\3h\3h\5h\u080b\nh\3h\3h\5h\u080f"+
		"\nh\3h\3h\3h\5h\u0814\nh\3h\3h\5h\u0818\nh\3h\3h\3h\5h\u081d\nh\3h\3h"+
		"\5h\u0821\nh\3h\3h\3h\5h\u0826\nh\3h\3h\5h\u082a\nh\3h\3h\3h\5h\u082f"+
		"\nh\3h\3h\5h\u0833\nh\3h\3h\3h\5h\u0838\nh\3h\3h\5h\u083c\nh\3h\7h\u083f"+
		"\nh\fh\16h\u0842\13h\3i\3i\3i\3i\3i\5i\u0849\ni\3i\3i\5i\u084d\ni\3i\3"+
		"i\5i\u0851\ni\3i\7i\u0854\ni\fi\16i\u0857\13i\3i\3i\3i\3i\5i\u085d\ni"+
		"\3i\3i\3i\3i\5i\u0863\ni\3i\3i\3i\5i\u0868\ni\3i\3i\3i\5i\u086d\ni\3i"+
		"\3i\3i\5i\u0872\ni\3i\5i\u0875\ni\3i\3i\5i\u0879\ni\3i\3i\5i\u087d\ni"+
		"\3i\3i\3i\5i\u0882\ni\3i\3i\5i\u0886\ni\3i\3i\3i\5i\u088b\ni\3i\3i\5i"+
		"\u088f\ni\3i\3i\3i\5i\u0894\ni\3i\3i\5i\u0898\ni\3i\3i\3i\5i\u089d\ni"+
		"\3i\3i\5i\u08a1\ni\3i\3i\3i\5i\u08a6\ni\3i\3i\5i\u08aa\ni\3i\3i\3i\5i"+
		"\u08af\ni\3i\3i\5i\u08b3\ni\3i\3i\3i\5i\u08b8\ni\3i\3i\5i\u08bc\ni\3i"+
		"\3i\3i\5i\u08c1\ni\3i\3i\5i\u08c5\ni\3i\3i\3i\5i\u08ca\ni\3i\3i\5i\u08ce"+
		"\ni\3i\3i\3i\5i\u08d3\ni\3i\3i\5i\u08d7\ni\3i\3i\3i\5i\u08dc\ni\3i\3i"+
		"\5i\u08e0\ni\3i\3i\3i\5i\u08e5\ni\3i\3i\5i\u08e9\ni\3i\3i\3i\5i\u08ee"+
		"\ni\3i\3i\5i\u08f2\ni\3i\3i\3i\5i\u08f7\ni\3i\3i\5i\u08fb\ni\3i\3i\3i"+
		"\5i\u0900\ni\3i\3i\5i\u0904\ni\3i\3i\3i\5i\u0909\ni\3i\3i\5i\u090d\ni"+
		"\3i\3i\3i\5i\u0912\ni\3i\3i\5i\u0916\ni\3i\3i\3i\5i\u091b\ni\3i\3i\5i"+
		"\u091f\ni\3i\3i\3i\5i\u0924\ni\3i\3i\5i\u0928\ni\3i\7i\u092b\ni\fi\16"+
		"i\u092e\13i\3j\3j\3j\5j\u0933\nj\3j\3j\3j\5j\u0938\nj\3j\3j\3k\3k\5k\u093e"+
		"\nk\3k\3k\5k\u0942\nk\3k\7k\u0945\nk\fk\16k\u0948\13k\3l\3l\5l\u094c\n"+
		"l\3l\3l\5l\u0950\nl\3l\3l\5l\u0954\nl\5l\u0956\nl\3l\3l\5l\u095a\nl\5"+
		"l\u095c\nl\3l\5l\u095f\nl\3l\3l\5l\u0963\nl\3m\3m\3m\3m\3m\5m\u096a\n"+
		"m\3m\3m\3n\3n\3n\3n\5n\u0972\nn\3n\3n\5n\u0976\nn\3n\3n\3o\3o\3o\3o\3"+
		"o\3o\5o\u0980\no\3o\3o\5o\u0984\no\3o\3o\3p\3p\3p\3p\5p\u098c\np\3p\3"+
		"p\5p\u0990\np\3p\5p\u0993\np\3q\5q\u0996\nq\3q\3q\3r\3r\3r\3r\3s\3s\3"+
		"s\5s\u09a1\ns\3t\3t\7t\u09a5\nt\ft\16t\u09a8\13t\3u\3u\5u\u09ac\nu\3u"+
		"\3u\5u\u09b0\nu\3v\3v\3v\3v\5v\u09b6\nv\3v\5v\u09b9\nv\3v\5v\u09bc\nv"+
		"\3v\5v\u09bf\nv\3w\5w\u09c2\nw\3w\3w\5w\u09c6\nw\3w\3w\3x\5x\u09cb\nx"+
		"\3x\3x\5x\u09cf\nx\3x\3x\3y\5y\u09d4\ny\3y\5y\u09d7\ny\3y\3y\5y\u09db"+
		"\ny\7y\u09dd\ny\fy\16y\u09e0\13y\3y\3y\3z\3z\5z\u09e6\nz\3z\3z\5z\u09ea"+
		"\nz\5z\u09ec\nz\3z\3z\3{\3{\5{\u09f2\n{\3{\3{\5{\u09f6\n{\3{\3{\5{\u09fa"+
		"\n{\3{\7{\u09fd\n{\f{\16{\u0a00\13{\5{\u0a02\n{\3{\5{\u0a05\n{\3{\3{\3"+
		"|\3|\5|\u0a0b\n|\3|\3|\5|\u0a0f\n|\3|\3|\5|\u0a13\n|\3|\3|\5|\u0a17\n"+
		"|\3|\5|\u0a1a\n|\3|\3|\5|\u0a1e\n|\3|\5|\u0a21\n|\3|\5|\u0a24\n|\3|\5"+
		"|\u0a27\n|\3|\5|\u0a2a\n|\3|\5|\u0a2d\n|\3}\3}\5}\u0a31\n}\3}\3}\3~\3"+
		"~\5~\u0a37\n~\3~\3~\5~\u0a3b\n~\3~\7~\u0a3e\n~\f~\16~\u0a41\13~\3\177"+
		"\3\177\3\177\3\177\3\177\5\177\u0a48\n\177\3\177\3\177\3\u0080\3\u0080"+
		"\5\u0080\u0a4e\n\u0080\3\u0080\3\u0080\5\u0080\u0a52\n\u0080\3\u0080\7"+
		"\u0080\u0a55\n\u0080\f\u0080\16\u0080\u0a58\13\u0080\3\u0081\3\u0081\3"+
		"\u0081\3\u0081\3\u0081\5\u0081\u0a5f\n\u0081\3\u0081\3\u0081\3\u0082\3"+
		"\u0082\6\u0082\u0a65\n\u0082\r\u0082\16\u0082\u0a66\3\u0083\3\u0083\5"+
		"\u0083\u0a6b\n\u0083\3\u0083\3\u0083\5\u0083\u0a6f\n\u0083\3\u0083\3\u0083"+
		"\5\u0083\u0a73\n\u0083\3\u0083\5\u0083\u0a76\n\u0083\3\u0084\3\u0084\3"+
		"\u0085\3\u0085\3\u0085\7\u0085\u0a7d\n\u0085\f\u0085\16\u0085\u0a80\13"+
		"\u0085\3\u0085\3\u0085\3\u0085\6\u0085\u0a85\n\u0085\r\u0085\16\u0085"+
		"\u0a86\5\u0085\u0a89\n\u0085\3\u0086\3\u0086\3\u0087\3\u0087\5\u0087\u0a8f"+
		"\n\u0087\3\u0087\3\u0087\5\u0087\u0a93\n\u0087\3\u0087\3\u0087\5\u0087"+
		"\u0a97\n\u0087\3\u0088\3\u0088\3\u0088\7\u0088\u0a9c\n\u0088\f\u0088\16"+
		"\u0088\u0a9f\13\u0088\3\u0089\3\u0089\5\u0089\u0aa3\n\u0089\3\u0089\3"+
		"\u0089\5\u0089\u0aa7\n\u0089\3\u008a\3\u008a\5\u008a\u0aab\n\u008a\3\u008a"+
		"\3\u008a\5\u008a\u0aaf\n\u008a\3\u008a\5\u008a\u0ab2\n\u008a\3\u008b\3"+
		"\u008b\3\u008b\3\u008c\3\u008c\3\u008d\3\u008d\3\u008d\5\u008d\u0abc\n"+
		"\u008d\3\u008d\5\u008d\u0abf\n\u008d\3\u008d\3\u008d\5\u008d\u0ac3\n\u008d"+
		"\3\u008d\5\u008d\u0ac6\n\u008d\3\u008e\3\u008e\3\u008f\3\u008f\3\u0090"+
		"\3\u0090\3\u0091\3\u0091\3\u0092\3\u0092\3\u0093\5\u0093\u0ad3\n\u0093"+
		"\3\u0093\3\u0093\3\u0093\5\u0093\u0ad8\n\u0093\3\u0093\5\u0093\u0adb\n"+
		"\u0093\3\u0094\3\u0094\5\u0094\u0adf\n\u0094\3\u0094\3\u0094\5\u0094\u0ae3"+
		"\n\u0094\6\u0094\u0ae5\n\u0094\r\u0094\16\u0094\u0ae6\3\u0094\2\4\u00ce"+
		"\u00d0\u0095\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0"+
		"\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8"+
		"\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0"+
		"\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8"+
		"\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100"+
		"\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118"+
		"\u011a\u011c\u011e\u0120\u0122\u0124\u0126\2\24\5\2\25\25\"\"\u00af\u00af"+
		"\3\2%\60\4\2\u00b8\u00b8\u00be\u00be\3\2GL\5\2\u00c8\u00c8\u00cf\u00cf"+
		"\u00d3\u00d3\3\2}~\7\2\21\21\25\25[[\u0086\u0086\u0091\u0091\4\2\u0094"+
		"\u0095\u00c3\u00c3\4\2hj\u00a4\u00a4\3\2\3\4\4\2\u00a8\u00a8\u00ae\u00ae"+
		"\3\2\27\30\13\2\26\26\31\31##\64\64]]aa\u00a5\u00a7\u00ac\u00ac\u00b9"+
		"\u00bb\7\2\\\\ff\u00c8\u00cb\u00cd\u00cd\u00d1\u00d1\6\2MMy{\u00b3\u00b3"+
		"\u00d8\u00de\4\2\6\n\u00c5\u00c5\6\2OOTT\u008a\u008a\u008f\u008f\22\2"+
		"\13\21\23\32\34\65BFMQSfkkq|\177\u0080\u0085\u008a\u008f\u0094\u0096\u00a5"+
		"\u00a8\u00aa\u00ac\u00b9\u00bc\u00c0\u00c2\u00c4\u0ce3\2\u0128\3\2\2\2"+
		"\4\u012c\3\2\2\2\6\u0164\3\2\2\2\b\u016a\3\2\2\2\n\u0178\3\2\2\2\f\u018d"+
		"\3\2\2\2\16\u0191\3\2\2\2\20\u01ac\3\2\2\2\22\u01b8\3\2\2\2\24\u01bc\3"+
		"\2\2\2\26\u01be\3\2\2\2\30\u01d7\3\2\2\2\32\u01d9\3\2\2\2\34\u01f1\3\2"+
		"\2\2\36\u023d\3\2\2\2 \u0271\3\2\2\2\"\u0273\3\2\2\2$\u0280\3\2\2\2&\u0282"+
		"\3\2\2\2(\u0286\3\2\2\2*\u028a\3\2\2\2,\u029f\3\2\2\2.\u02b1\3\2\2\2\60"+
		"\u02c2\3\2\2\2\62\u02cf\3\2\2\2\64\u02f7\3\2\2\2\66\u0307\3\2\2\28\u0337"+
		"\3\2\2\2:\u0339\3\2\2\2<\u033e\3\2\2\2>\u034c\3\2\2\2@\u0359\3\2\2\2B"+
		"\u035d\3\2\2\2D\u0364\3\2\2\2F\u036e\3\2\2\2H\u0370\3\2\2\2J\u037c\3\2"+
		"\2\2L\u0391\3\2\2\2N\u03b9\3\2\2\2P\u03dc\3\2\2\2R\u0409\3\2\2\2T\u041f"+
		"\3\2\2\2V\u0423\3\2\2\2X\u0440\3\2\2\2Z\u0442\3\2\2\2\\\u044b\3\2\2\2"+
		"^\u044d\3\2\2\2`\u0456\3\2\2\2b\u045b\3\2\2\2d\u045f\3\2\2\2f\u046e\3"+
		"\2\2\2h\u0474\3\2\2\2j\u0480\3\2\2\2l\u048c\3\2\2\2n\u0490\3\2\2\2p\u04a3"+
		"\3\2\2\2r\u04af\3\2\2\2t\u04bd\3\2\2\2v\u04c9\3\2\2\2x\u04d9\3\2\2\2z"+
		"\u04e9\3\2\2\2|\u04f3\3\2\2\2~\u051b\3\2\2\2\u0080\u051f\3\2\2\2\u0082"+
		"\u0527\3\2\2\2\u0084\u0531\3\2\2\2\u0086\u0545\3\2\2\2\u0088\u0559\3\2"+
		"\2\2\u008a\u059b\3\2\2\2\u008c\u05ae\3\2\2\2\u008e\u05b0\3\2\2\2\u0090"+
		"\u05c0\3\2\2\2\u0092\u05df\3\2\2\2\u0094\u05f7\3\2\2\2\u0096\u060c\3\2"+
		"\2\2\u0098\u0622\3\2\2\2\u009a\u0635\3\2\2\2\u009c\u063a\3\2\2\2\u009e"+
		"\u064e\3\2\2\2\u00a0\u065f\3\2\2\2\u00a2\u0661\3\2\2\2\u00a4\u0669\3\2"+
		"\2\2\u00a6\u066b\3\2\2\2\u00a8\u066f\3\2\2\2\u00aa\u067b\3\2\2\2\u00ac"+
		"\u0687\3\2\2\2\u00ae\u06a3\3\2\2\2\u00b0\u06af\3\2\2\2\u00b2\u06ce\3\2"+
		"\2\2\u00b4\u06d0\3\2\2\2\u00b6\u06e6\3\2\2\2\u00b8\u06e8\3\2\2\2\u00ba"+
		"\u06f5\3\2\2\2\u00bc\u0701\3\2\2\2\u00be\u070d\3\2\2\2\u00c0\u0712\3\2"+
		"\2\2\u00c2\u0729\3\2\2\2\u00c4\u0736\3\2\2\2\u00c6\u0744\3\2\2\2\u00c8"+
		"\u0759\3\2\2\2\u00ca\u0761\3\2\2\2\u00cc\u0765\3\2\2\2\u00ce\u0791\3\2"+
		"\2\2\u00d0\u0874\3\2\2\2\u00d2\u0932\3\2\2\2\u00d4\u093b\3\2\2\2\u00d6"+
		"\u0949\3\2\2\2\u00d8\u0964\3\2\2\2\u00da\u096d\3\2\2\2\u00dc\u0979\3\2"+
		"\2\2\u00de\u0987\3\2\2\2\u00e0\u0995\3\2\2\2\u00e2\u0999\3\2\2\2\u00e4"+
		"\u099d\3\2\2\2\u00e6\u09a2\3\2\2\2\u00e8\u09af\3\2\2\2\u00ea\u09be\3\2"+
		"\2\2\u00ec\u09c1\3\2\2\2\u00ee\u09ca\3\2\2\2\u00f0\u09de\3\2\2\2\u00f2"+
		"\u09eb\3\2\2\2\u00f4\u09ef\3\2\2\2\u00f6\u0a0a\3\2\2\2\u00f8\u0a2e\3\2"+
		"\2\2\u00fa\u0a34\3\2\2\2\u00fc\u0a47\3\2\2\2\u00fe\u0a4b\3\2\2\2\u0100"+
		"\u0a5e\3\2\2\2\u0102\u0a64\3\2\2\2\u0104\u0a68\3\2\2\2\u0106\u0a77\3\2"+
		"\2\2\u0108\u0a88\3\2\2\2\u010a\u0a8a\3\2\2\2\u010c\u0a8c\3\2\2\2\u010e"+
		"\u0a98\3\2\2\2\u0110\u0aa0\3\2\2\2\u0112\u0aa8\3\2\2\2\u0114\u0ab3\3\2"+
		"\2\2\u0116\u0ab6\3\2\2\2\u0118\u0abb\3\2\2\2\u011a\u0ac7\3\2\2\2\u011c"+
		"\u0ac9\3\2\2\2\u011e\u0acb\3\2\2\2\u0120\u0acd\3\2\2\2\u0122\u0acf\3\2"+
		"\2\2\u0124\u0ad2\3\2\2\2\u0126\u0ae4\3\2\2\2\u0128\u0129\5\4\3\2\u0129"+
		"\u012a\7\2\2\3\u012a\3\3\2\2\2\u012b\u012d\7\u00e6\2\2\u012c\u012b\3\2"+
		"\2\2\u012c\u012d\3\2\2\2\u012d\u0131\3\2\2\2\u012e\u0130\5\u0124\u0093"+
		"\2\u012f\u012e\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132"+
		"\3\2\2\2\u0132\u013b\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u0138\5\6\4\2\u0135"+
		"\u0137\5\u0124\u0093\2\u0136\u0135\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136"+
		"\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013b"+
		"\u0134\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013e\3\2\2\2\u013d\u013f\5\b"+
		"\5\2\u013e\u013d\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0143\3\2\2\2\u0140"+
		"\u0142\5\u0124\u0093\2\u0141\u0140\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141"+
		"\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0146"+
		"\u0148\5\f\7\2\u0147\u0146\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014c\3\2"+
		"\2\2\u0149\u014b\5\u0124\u0093\2\u014a\u0149\3\2\2\2\u014b\u014e\3\2\2"+
		"\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c"+
		"\3\2\2\2\u014f\u0151\5\16\b\2\u0150\u014f\3\2\2\2\u0150\u0151\3\2\2\2"+
		"\u0151\u0155\3\2\2\2\u0152\u0154\5\u0124\u0093\2\u0153\u0152\3\2\2\2\u0154"+
		"\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0159\3\2"+
		"\2\2\u0157\u0155\3\2\2\2\u0158\u015a\5\26\f\2\u0159\u0158\3\2\2\2\u0159"+
		"\u015a\3\2\2\2\u015a\u015e\3\2\2\2\u015b\u015d\5\u0124\u0093\2\u015c\u015b"+
		"\3\2\2\2\u015d\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f"+
		"\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0161\u0163\7\u00e6\2\2\u0162\u0161"+
		"\3\2\2\2\u0162\u0163\3\2\2\2\u0163\5\3\2\2\2\u0164\u0165\7\u00bc\2\2\u0165"+
		"\u0166\7\u00e6\2\2\u0166\u0167\7\u00dd\2\2\u0167\u0168\7\u00e6\2\2\u0168"+
		"\u0169\7\36\2\2\u0169\7\3\2\2\2\u016a\u016e\7\23\2\2\u016b\u016d\5\u0124"+
		"\u0093\2\u016c\u016b\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u016c\3\2\2\2\u016e"+
		"\u016f\3\2\2\2\u016f\u0172\3\2\2\2\u0170\u016e\3\2\2\2\u0171\u0173\5\n"+
		"\6\2\u0172\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0172\3\2\2\2\u0174"+
		"\u0175\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177\7A\2\2\u0177\t\3\2\2\2"+
		"\u0178\u017a\5\u0102\u0082\2\u0179\u017b\7\u00e6\2\2\u017a\u0179\3\2\2"+
		"\2\u017a\u017b\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017e\7\u00c8\2\2\u017d"+
		"\u017f\7\u00e6\2\2\u017e\u017d\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0180"+
		"\3\2\2\2\u0180\u0184\5\u0116\u008c\2\u0181\u0183\5\u0124\u0093\2\u0182"+
		"\u0181\3\2\2\2\u0183\u0186\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2"+
		"\2\2\u0185\13\3\2\2\2\u0186\u0184\3\2\2\2\u0187\u0189\5\32\16\2\u0188"+
		"\u018a\5\u0124\u0093\2\u0189\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u0189"+
		"\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018e\3\2\2\2\u018d\u0187\3\2\2\2\u018e"+
		"\u018f\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190\r\3\2\2\2"+
		"\u0191\u019b\5\22\n\2\u0192\u0194\5\u0124\u0093\2\u0193\u0192\3\2\2\2"+
		"\u0194\u0195\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0197"+
		"\3\2\2\2\u0197\u0198\5\22\n\2\u0198\u019a\3\2\2\2\u0199\u0193\3\2\2\2"+
		"\u019a\u019d\3\2\2\2\u019b\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u01a1"+
		"\3\2\2\2\u019d\u019b\3\2\2\2\u019e\u01a0\5\u0124\u0093\2\u019f\u019e\3"+
		"\2\2\2\u01a0\u01a3\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2"+
		"\17\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4\u01a5\7\u0081\2\2\u01a5\u01a6\7"+
		"\u00e6\2\2\u01a6\u01ad\7\u00db\2\2\u01a7\u01a8\7\u0083\2\2\u01a8\u01a9"+
		"\7\u00e6\2\2\u01a9\u01ad\t\2\2\2\u01aa\u01ad\7\u0082\2\2\u01ab\u01ad\7"+
		"\u0084\2\2\u01ac\u01a4\3\2\2\2\u01ac\u01a7\3\2\2\2\u01ac\u01aa\3\2\2\2"+
		"\u01ac\u01ab\3\2\2\2\u01ad\21\3\2\2\2\u01ae\u01b9\5\u0122\u0092\2\u01af"+
		"\u01b9\5\62\32\2\u01b0\u01b9\5<\37\2\u01b1\u01b9\5D#\2\u01b2\u01b9\5,"+
		"\27\2\u01b3\u01b9\5b\62\2\u01b4\u01b9\5\u00d2j\2\u01b5\u01b9\5\20\t\2"+
		"\u01b6\u01b9\5\u00c4c\2\u01b7\u01b9\5\32\16\2\u01b8\u01ae\3\2\2\2\u01b8"+
		"\u01af\3\2\2\2\u01b8\u01b0\3\2\2\2\u01b8\u01b1\3\2\2\2\u01b8\u01b2\3\2"+
		"\2\2\u01b8\u01b3\3\2\2\2\u01b8\u01b4\3\2\2\2\u01b8\u01b5\3\2\2\2\u01b8"+
		"\u01b6\3\2\2\2\u01b8\u01b7\3\2\2\2\u01b9\23\3\2\2\2\u01ba\u01bd\5r:\2"+
		"\u01bb\u01bd\5t;\2\u01bc\u01ba\3\2\2\2\u01bc\u01bb\3\2\2\2\u01bd\25\3"+
		"\2\2\2\u01be\u01c8\5\30\r\2\u01bf\u01c1\5\u0124\u0093\2\u01c0\u01bf\3"+
		"\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3"+
		"\u01c4\3\2\2\2\u01c4\u01c5\5\30\r\2\u01c5\u01c7\3\2\2\2\u01c6\u01c0\3"+
		"\2\2\2\u01c7\u01ca\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9"+
		"\u01ce\3\2\2\2\u01ca\u01c8\3\2\2\2\u01cb\u01cd\5\u0124\u0093\2\u01cc\u01cb"+
		"\3\2\2\2\u01cd\u01d0\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf"+
		"\27\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d1\u01d8\5N(\2\u01d2\u01d8\5\u0090"+
		"I\2\u01d3\u01d8\5\u0092J\2\u01d4\u01d8\5\u0094K\2\u01d5\u01d8\5\u00c0"+
		"a\2\u01d6\u01d8\5P)\2\u01d7\u01d1\3\2\2\2\u01d7\u01d2\3\2\2\2\u01d7\u01d3"+
		"\3\2\2\2\u01d7\u01d4\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d7\u01d6\3\2\2\2\u01d8"+
		"\31\3\2\2\2\u01d9\u01da\7\17\2\2\u01da\u01db\7\u00e6\2\2\u01db\u01dd\5"+
		"\u00e6t\2\u01dc\u01de\7\u00e6\2\2\u01dd\u01dc\3\2\2\2\u01dd\u01de\3\2"+
		"\2\2\u01de\u01df\3\2\2\2\u01df\u01e1\7\u00c8\2\2\u01e0\u01e2\7\u00e6\2"+
		"\2\u01e1\u01e0\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01ee"+
		"\5\u0116\u008c\2\u01e4\u01e6\7\u00e6\2\2\u01e5\u01e4\3\2\2\2\u01e5\u01e6"+
		"\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e9\7\3\2\2\u01e8\u01ea\7\u00e6\2"+
		"\2\u01e9\u01e8\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ed"+
		"\5\u0116\u008c\2\u01ec\u01e5\3\2\2\2\u01ed\u01f0\3\2\2\2\u01ee\u01ec\3"+
		"\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\33\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f1"+
		"\u01f7\5\36\20\2\u01f2\u01f3\5\u0126\u0094\2\u01f3\u01f4\5\36\20\2\u01f4"+
		"\u01f6\3\2\2\2\u01f5\u01f2\3\2\2\2\u01f6\u01f9\3\2\2\2\u01f7\u01f5\3\2"+
		"\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01fa\3\2\2\2\u01f9\u01f7\3\2\2\2\u01fa"+
		"\u01fb\5\u0126\u0094\2\u01fb\35\3\2\2\2\u01fc\u023e\5\u0114\u008b\2\u01fd"+
		"\u023e\5|?\2\u01fe\u023e\5\"\22\2\u01ff\u023e\5\32\16\2\u0200\u023e\5"+
		"$\23\2\u0201\u023e\5&\24\2\u0202\u023e\5(\25\2\u0203\u023e\5*\26\2\u0204"+
		"\u023e\5,\27\2\u0205\u023e\5\60\31\2\u0206\u023e\5\66\34\2\u0207\u023e"+
		"\5\64\33\2\u0208\u023e\58\35\2\u0209\u023e\5:\36\2\u020a\u023e\5@!\2\u020b"+
		"\u023e\5B\"\2\u020c\u023e\5F$\2\u020d\u023e\5\u00e2r\2\u020e\u023e\5H"+
		"%\2\u020f\u023e\5J&\2\u0210\u023e\5L\'\2\u0211\u023e\5R*\2\u0212\u023e"+
		"\5T+\2\u0213\u023e\5V,\2\u0214\u023e\5X-\2\u0215\u023e\5d\63\2\u0216\u023e"+
		"\5f\64\2\u0217\u023e\5h\65\2\u0218\u023e\5j\66\2\u0219\u023e\5l\67\2\u021a"+
		"\u023e\5n8\2\u021b\u023e\5p9\2\u021c\u023e\5~@\2\u021d\u023e\5\u0080A"+
		"\2\u021e\u023e\5\u0082B\2\u021f\u023e\5\u0084C\2\u0220\u023e\5\u0086D"+
		"\2\u0221\u023e\5\u0088E\2\u0222\u023e\5\u008eH\2\u0223\u023e\5\u0096L"+
		"\2\u0224\u023e\5\u0098M\2\u0225\u023e\5\u009aN\2\u0226\u023e\5\u009cO"+
		"\2\u0227\u023e\5\u00a0Q\2\u0228\u023e\5\u00a2R\2\u0229\u023e\5\u00a4S"+
		"\2\u022a\u023e\5\u00a6T\2\u022b\u023e\5\u00a8U\2\u022c\u023e\5\u00aaV"+
		"\2\u022d\u023e\5\u00acW\2\u022e\u023e\5\u00aeX\2\u022f\u023e\5\u00b0Y"+
		"\2\u0230\u023e\5\u00b8]\2\u0231\u023e\5\u00ba^\2\u0232\u023e\5\u00bc_"+
		"\2\u0233\u023e\5\u00be`\2\u0234\u023e\5\u00c2b\2\u0235\u023e\5\u00caf"+
		"\2\u0236\u023e\5\u00ccg\2\u0237\u023e\5\u00d2j\2\u0238\u023e\5\u00d8m"+
		"\2\u0239\u023e\5\u00dan\2\u023a\u023e\5\u00dco\2\u023b\u023e\5\u00dep"+
		"\2\u023c\u023e\5\u00e4s\2\u023d\u01fc\3\2\2\2\u023d\u01fd\3\2\2\2\u023d"+
		"\u01fe\3\2\2\2\u023d\u01ff\3\2\2\2\u023d\u0200\3\2\2\2\u023d\u0201\3\2"+
		"\2\2\u023d\u0202\3\2\2\2\u023d\u0203\3\2\2\2\u023d\u0204\3\2\2\2\u023d"+
		"\u0205\3\2\2\2\u023d\u0206\3\2\2\2\u023d\u0207\3\2\2\2\u023d\u0208\3\2"+
		"\2\2\u023d\u0209\3\2\2\2\u023d\u020a\3\2\2\2\u023d\u020b\3\2\2\2\u023d"+
		"\u020c\3\2\2\2\u023d\u020d\3\2\2\2\u023d\u020e\3\2\2\2\u023d\u020f\3\2"+
		"\2\2\u023d\u0210\3\2\2\2\u023d\u0211\3\2\2\2\u023d\u0212\3\2\2\2\u023d"+
		"\u0213\3\2\2\2\u023d\u0214\3\2\2\2\u023d\u0215\3\2\2\2\u023d\u0216\3\2"+
		"\2\2\u023d\u0217\3\2\2\2\u023d\u0218\3\2\2\2\u023d\u0219\3\2\2\2\u023d"+
		"\u021a\3\2\2\2\u023d\u021b\3\2\2\2\u023d\u021c\3\2\2\2\u023d\u021d\3\2"+
		"\2\2\u023d\u021e\3\2\2\2\u023d\u021f\3\2\2\2\u023d\u0220\3\2\2\2\u023d"+
		"\u0221\3\2\2\2\u023d\u0222\3\2\2\2\u023d\u0223\3\2\2\2\u023d\u0224\3\2"+
		"\2\2\u023d\u0225\3\2\2\2\u023d\u0226\3\2\2\2\u023d\u0227\3\2\2\2\u023d"+
		"\u0228\3\2\2\2\u023d\u0229\3\2\2\2\u023d\u022a\3\2\2\2\u023d\u022b\3\2"+
		"\2\2\u023d\u022c\3\2\2\2\u023d\u022d\3\2\2\2\u023d\u022e\3\2\2\2\u023d"+
		"\u022f\3\2\2\2\u023d\u0230\3\2\2\2\u023d\u0231\3\2\2\2\u023d\u0232\3\2"+
		"\2\2\u023d\u0233\3\2\2\2\u023d\u0234\3\2\2\2\u023d\u0235\3\2\2\2\u023d"+
		"\u0236\3\2\2\2\u023d\u0237\3\2\2\2\u023d\u0238\3\2\2\2\u023d\u0239\3\2"+
		"\2\2\u023d\u023a\3\2\2\2\u023d\u023b\3\2\2\2\u023d\u023c\3\2\2\2\u023e"+
		"\37\3\2\2\2\u023f\u0272\3\2\2\2\u0240\u0272\5\"\22\2\u0241\u0272\5$\23"+
		"\2\u0242\u0272\5&\24\2\u0243\u0272\5(\25\2\u0244\u0272\5*\26\2\u0245\u0272"+
		"\5\60\31\2\u0246\u0272\5\66\34\2\u0247\u0272\58\35\2\u0248\u0272\5:\36"+
		"\2\u0249\u0272\5@!\2\u024a\u0272\5\u00e2r\2\u024b\u0272\5H%\2\u024c\u0272"+
		"\5J&\2\u024d\u0272\5L\'\2\u024e\u0272\5R*\2\u024f\u0272\5X-\2\u0250\u0272"+
		"\5d\63\2\u0251\u0272\5f\64\2\u0252\u0272\5h\65\2\u0253\u0272\5j\66\2\u0254"+
		"\u0272\5l\67\2\u0255\u0272\5n8\2\u0256\u0272\5p9\2\u0257\u0272\5|?\2\u0258"+
		"\u0272\5~@\2\u0259\u0272\5\u0080A\2\u025a\u0272\5\u0088E\2\u025b\u0272"+
		"\5\u008eH\2\u025c\u0272\5\u0096L\2\u025d\u0272\5\u0098M\2\u025e\u0272"+
		"\5\u009aN\2\u025f\u0272\5\u009cO\2\u0260\u0272\5\u00a0Q\2\u0261\u0272"+
		"\5\u00a6T\2\u0262\u0272\5\u00a8U\2\u0263\u0272\5\u00aaV\2\u0264\u0272"+
		"\5\u00acW\2\u0265\u0272\5\u00aeX\2\u0266\u0272\5\u00b0Y\2\u0267\u0272"+
		"\5\u00b8]\2\u0268\u0272\5\u00ba^\2\u0269\u0272\5\u00bc_\2\u026a\u0272"+
		"\5\u00c2b\2\u026b\u0272\5\u00caf\2\u026c\u0272\5\u00ccg\2\u026d\u0272"+
		"\5\u00d8m\2\u026e\u0272\5\u00dan\2\u026f\u0272\5\u00d0i\2\u0270\u0272"+
		"\5\u00e4s\2\u0271\u023f\3\2\2\2\u0271\u0240\3\2\2\2\u0271\u0241\3\2\2"+
		"\2\u0271\u0242\3\2\2\2\u0271\u0243\3\2\2\2\u0271\u0244\3\2\2\2\u0271\u0245"+
		"\3\2\2\2\u0271\u0246\3\2\2\2\u0271\u0247\3\2\2\2\u0271\u0248\3\2\2\2\u0271"+
		"\u0249\3\2\2\2\u0271\u024a\3\2\2\2\u0271\u024b\3\2\2\2\u0271\u024c\3\2"+
		"\2\2\u0271\u024d\3\2\2\2\u0271\u024e\3\2\2\2\u0271\u024f\3\2\2\2\u0271"+
		"\u0250\3\2\2\2\u0271\u0251\3\2\2\2\u0271\u0252\3\2\2\2\u0271\u0253\3\2"+
		"\2\2\u0271\u0254\3\2\2\2\u0271\u0255\3\2\2\2\u0271\u0256\3\2\2\2\u0271"+
		"\u0257\3\2\2\2\u0271\u0258\3\2\2\2\u0271\u0259\3\2\2\2\u0271\u025a\3\2"+
		"\2\2\u0271\u025b\3\2\2\2\u0271\u025c\3\2\2\2\u0271\u025d\3\2\2\2\u0271"+
		"\u025e\3\2\2\2\u0271\u025f\3\2\2\2\u0271\u0260\3\2\2\2\u0271\u0261\3\2"+
		"\2\2\u0271\u0262\3\2\2\2\u0271\u0263\3\2\2\2\u0271\u0264\3\2\2\2\u0271"+
		"\u0265\3\2\2\2\u0271\u0266\3\2\2\2\u0271\u0267\3\2\2\2\u0271\u0268\3\2"+
		"\2\2\u0271\u0269\3\2\2\2\u0271\u026a\3\2\2\2\u0271\u026b\3\2\2\2\u0271"+
		"\u026c\3\2\2\2\u0271\u026d\3\2\2\2\u0271\u026e\3\2\2\2\u0271\u026f\3\2"+
		"\2\2\u0271\u0270\3\2\2\2\u0272!\3\2\2\2\u0273\u0274\7\20\2\2\u0274\u0275"+
		"\7\u00e6\2\2\u0275\u027e\5\u00d0i\2\u0276\u0278\7\u00e6\2\2\u0277\u0276"+
		"\3\2\2\2\u0277\u0278\3\2\2\2\u0278\u0279\3\2\2\2\u0279\u027b\7\3\2\2\u027a"+
		"\u027c\7\u00e6\2\2\u027b\u027a\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u027d"+
		"\3\2\2\2\u027d\u027f\5\u00d0i\2\u027e\u0277\3\2\2\2\u027e\u027f\3\2\2"+
		"\2\u027f#\3\2\2\2\u0280\u0281\7\24\2\2\u0281%\3\2\2\2\u0282\u0283\7\34"+
		"\2\2\u0283\u0284\7\u00e6\2\2\u0284\u0285\5\u00d0i\2\u0285\'\3\2\2\2\u0286"+
		"\u0287\7\35\2\2\u0287\u0288\7\u00e6\2\2\u0288\u0289\5\u00d0i\2\u0289)"+
		"\3\2\2\2\u028a\u029a\7\37\2\2\u028b\u028c\7\u00e6\2\2\u028c\u0297\5\u00e0"+
		"q\2\u028d\u028f\7\u00e6\2\2\u028e\u028d\3\2\2\2\u028e\u028f\3\2\2\2\u028f"+
		"\u0290\3\2\2\2\u0290\u0292\7\3\2\2\u0291\u0293\7\u00e6\2\2\u0292\u0291"+
		"\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u0294\3\2\2\2\u0294\u0296\5\u00e0q"+
		"\2\u0295\u028e\3\2\2\2\u0296\u0299\3\2\2\2\u0297\u0295\3\2\2\2\u0297\u0298"+
		"\3\2\2\2\u0298\u029b\3\2\2\2\u0299\u0297\3\2\2\2\u029a\u028b\3\2\2\2\u029a"+
		"\u029b\3\2\2\2\u029b+\3\2\2\2\u029c\u029d\5\u011c\u008f\2\u029d\u029e"+
		"\7\u00e6\2\2\u029e\u02a0\3\2\2\2\u029f\u029c\3\2\2\2\u029f\u02a0\3\2\2"+
		"\2\u02a0\u02a1\3\2\2\2\u02a1\u02a2\7!\2\2\u02a2\u02a3\7\u00e6\2\2\u02a3"+
		"\u02ae\5.\30\2\u02a4\u02a6\7\u00e6\2\2\u02a5\u02a4\3\2\2\2\u02a5\u02a6"+
		"\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02a9\7\3\2\2\u02a8\u02aa\7\u00e6\2"+
		"\2\u02a9\u02a8\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab\u02ad"+
		"\5.\30\2\u02ac\u02a5\3\2\2\2\u02ad\u02b0\3\2\2\2\u02ae\u02ac\3\2\2\2\u02ae"+
		"\u02af\3\2\2\2\u02af-\3\2\2\2\u02b0\u02ae\3\2\2\2\u02b1\u02b3\5\u0102"+
		"\u0082\2\u02b2\u02b4\5\u011a\u008e\2\u02b3\u02b2\3\2\2\2\u02b3\u02b4\3"+
		"\2\2\2\u02b4\u02b7\3\2\2\2\u02b5\u02b6\7\u00e6\2\2\u02b6\u02b8\5\u0104"+
		"\u0083\2\u02b7\u02b5\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02ba\3\2\2\2\u02b9"+
		"\u02bb\7\u00e6\2\2\u02ba\u02b9\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb\u02bc"+
		"\3\2\2\2\u02bc\u02be\7\u00c8\2\2\u02bd\u02bf\7\u00e6\2\2\u02be\u02bd\3"+
		"\2\2\2\u02be\u02bf\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02c1\5\u00ceh\2"+
		"\u02c1/\3\2\2\2\u02c2\u02c4\7#\2\2\u02c3\u02c5\7\u00e6\2\2\u02c4\u02c3"+
		"\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02c8\7\u00c8\2"+
		"\2\u02c7\u02c9\7\u00e6\2\2\u02c8\u02c7\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9"+
		"\u02ca\3\2\2\2\u02ca\u02cb\5\u00d0i\2\u02cb\61\3\2\2\2\u02cc\u02cd\5\u011c"+
		"\u008f\2\u02cd\u02ce\7\u00e6\2\2\u02ce\u02d0\3\2\2\2\u02cf\u02cc\3\2\2"+
		"\2\u02cf\u02d0\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1\u02d2\7$\2\2\u02d2\u02d5"+
		"\7\u00e6\2\2\u02d3\u02d4\7\u008e\2\2\u02d4\u02d6\7\u00e6\2\2\u02d5\u02d3"+
		"\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02dc\3\2\2\2\u02d7\u02d9\7Q\2\2\u02d8"+
		"\u02da\5\u011a\u008e\2\u02d9\u02d8\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02dd"+
		"\3\2\2\2\u02db\u02dd\7\u00ad\2\2\u02dc\u02d7\3\2\2\2\u02dc\u02db\3\2\2"+
		"\2\u02dd\u02de\3\2\2\2\u02de\u02df\7\u00e6\2\2\u02df\u02e1\5\u0102\u0082"+
		"\2\u02e0\u02e2\5\u011a\u008e\2\u02e1\u02e0\3\2\2\2\u02e1\u02e2\3\2\2\2"+
		"\u02e2\u02e3\3\2\2\2\u02e3\u02e4\7\u00e6\2\2\u02e4\u02e5\7e\2\2\u02e5"+
		"\u02e6\7\u00e6\2\2\u02e6\u02eb\7\u00d8\2\2\u02e7\u02e8\7\u00e6\2\2\u02e8"+
		"\u02e9\7\r\2\2\u02e9\u02ea\7\u00e6\2\2\u02ea\u02ec\7\u00d8\2\2\u02eb\u02e7"+
		"\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec\u02f1\3\2\2\2\u02ed\u02ef\7\u00e6\2"+
		"\2\u02ee\u02ed\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0\u02f2"+
		"\5\u00f4{\2\u02f1\u02ee\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2\u02f5\3\2\2"+
		"\2\u02f3\u02f4\7\u00e6\2\2\u02f4\u02f6\5\u0104\u0083\2\u02f5\u02f3\3\2"+
		"\2\2\u02f5\u02f6\3\2\2\2\u02f6\63\3\2\2\2\u02f7\u02f8\t\3\2\2\u02f8\u02f9"+
		"\7\u00e6\2\2\u02f9\u0304\5\u0112\u008a\2\u02fa\u02fc\7\u00e6\2\2\u02fb"+
		"\u02fa\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd\u02ff\7\3"+
		"\2\2\u02fe\u0300\7\u00e6\2\2\u02ff\u02fe\3\2\2\2\u02ff\u0300\3\2\2\2\u0300"+
		"\u0301\3\2\2\2\u0301\u0303\5\u0112\u008a\2\u0302\u02fb\3\2\2\2\u0303\u0306"+
		"\3\2\2\2\u0304\u0302\3\2\2\2\u0304\u0305\3\2\2\2\u0305\65\3\2\2\2\u0306"+
		"\u0304\3\2\2\2\u0307\u0308\7\61\2\2\u0308\u0309\7\u00e6\2\2\u0309\u030b"+
		"\5\u00d0i\2\u030a\u030c\7\u00e6\2\2\u030b\u030a\3\2\2\2\u030b\u030c\3"+
		"\2\2\2\u030c\u030d\3\2\2\2\u030d\u030f\7\3\2\2\u030e\u0310\7\u00e6\2\2"+
		"\u030f\u030e\3\2\2\2\u030f\u0310\3\2\2\2\u0310\u0311\3\2\2\2\u0311\u031a"+
		"\5\u00d0i\2\u0312\u0314\7\u00e6\2\2\u0313\u0312\3\2\2\2\u0313\u0314\3"+
		"\2\2\2\u0314\u0315\3\2\2\2\u0315\u0317\7\3\2\2\u0316\u0318\7\u00e6\2\2"+
		"\u0317\u0316\3\2\2\2\u0317\u0318\3\2\2\2\u0318\u0319\3\2\2\2\u0319\u031b"+
		"\5\u00d0i\2\u031a\u0313\3\2\2\2\u031a\u031b\3\2\2\2\u031b\67\3\2\2\2\u031c"+
		"\u031d\7\63\2\2\u031d\u031f\5\u0126\u0094\2\u031e\u0320\5\34\17\2\u031f"+
		"\u031e\3\2\2\2\u031f\u0320\3\2\2\2\u0320\u0321\3\2\2\2\u0321\u0322\7b"+
		"\2\2\u0322\u0338\3\2\2\2\u0323\u0324\7\63\2\2\u0324\u0325\7\u00e6\2\2"+
		"\u0325\u0326\t\4\2\2\u0326\u0327\7\u00e6\2\2\u0327\u0328\5\u00d0i\2\u0328"+
		"\u032a\5\u0126\u0094\2\u0329\u032b\5\34\17\2\u032a\u0329\3\2\2\2\u032a"+
		"\u032b\3\2\2\2\u032b\u032c\3\2\2\2\u032c\u032d\7b\2\2\u032d\u0338\3\2"+
		"\2\2\u032e\u032f\7\63\2\2\u032f\u0330\5\u0126\u0094\2\u0330\u0331\5\34"+
		"\17\2\u0331\u0332\7b\2\2\u0332\u0333\7\u00e6\2\2\u0333\u0334\t\4\2\2\u0334"+
		"\u0335\7\u00e6\2\2\u0335\u0336\5\u00d0i\2\u0336\u0338\3\2\2\2\u0337\u031c"+
		"\3\2\2\2\u0337\u0323\3\2\2\2\u0337\u032e\3\2\2\2\u03389\3\2\2\2\u0339"+
		"\u033a\7A\2\2\u033a;\3\2\2\2\u033b\u033c\5\u011c\u008f\2\u033c\u033d\7"+
		"\u00e6\2\2\u033d\u033f\3\2\2\2\u033e\u033b\3\2\2\2\u033e\u033f\3\2\2\2"+
		"\u033f\u0340\3\2\2\2\u0340\u0341\7B\2\2\u0341\u0342\7\u00e6\2\2\u0342"+
		"\u0343\5\u0102\u0082\2\u0343\u0347\5\u0126\u0094\2\u0344\u0346\5> \2\u0345"+
		"\u0344\3\2\2\2\u0346\u0349\3\2\2\2\u0347\u0345\3\2\2\2\u0347\u0348\3\2"+
		"\2\2\u0348\u034a\3\2\2\2\u0349\u0347\3\2\2\2\u034a\u034b\78\2\2\u034b"+
		"=\3\2\2\2\u034c\u0355\5\u0102\u0082\2\u034d\u034f\7\u00e6\2\2\u034e\u034d"+
		"\3\2\2\2\u034e\u034f\3\2\2\2\u034f\u0350\3\2\2\2\u0350\u0352\7\u00c8\2"+
		"\2\u0351\u0353\7\u00e6\2\2\u0352\u0351\3\2\2\2\u0352\u0353\3\2\2\2\u0353"+
		"\u0354\3\2\2\2\u0354\u0356\5\u00ceh\2\u0355\u034e\3\2\2\2\u0355\u0356"+
		"\3\2\2\2\u0356\u0357\3\2\2\2\u0357\u0358\5\u0126\u0094\2\u0358?\3\2\2"+
		"\2\u0359\u035a\7D\2\2\u035a\u035b\7\u00e6\2\2\u035b\u035c\5\u00d0i\2\u035c"+
		"A\3\2\2\2\u035d\u035e\7E\2\2\u035e\u035f\7\u00e6\2\2\u035f\u0360\5\u00d0"+
		"i\2\u0360C\3\2\2\2\u0361\u0362\5\u011c\u008f\2\u0362\u0363\7\u00e6\2\2"+
		"\u0363\u0365\3\2\2\2\u0364\u0361\3\2\2\2\u0364\u0365\3\2\2\2\u0365\u0366"+
		"\3\2\2\2\u0366\u0367\7F\2\2\u0367\u0368\7\u00e6\2\2\u0368\u036a\5\u0102"+
		"\u0082\2\u0369\u036b\7\u00e6\2\2\u036a\u0369\3\2\2\2\u036a\u036b\3\2\2"+
		"\2\u036b\u036c\3\2\2\2\u036c\u036d\5\u00f4{\2\u036dE\3\2\2\2\u036e\u036f"+
		"\t\5\2\2\u036fG\3\2\2\2\u0370\u0371\7N\2\2\u0371\u0372\7\u00e6\2\2\u0372"+
		"\u0374\5\u00d0i\2\u0373\u0375\7\u00e6\2\2\u0374\u0373\3\2\2\2\u0374\u0375"+
		"\3\2\2\2\u0375\u0376\3\2\2\2\u0376\u0378\7\3\2\2\u0377\u0379\7\u00e6\2"+
		"\2\u0378\u0377\3\2\2\2\u0378\u0379\3\2\2\2\u0379\u037a\3\2\2\2\u037a\u037b"+
		"\5\u00d0i\2\u037bI\3\2\2\2\u037c\u037d\7P\2\2\u037d\u037e\7\u00e6\2\2"+
		"\u037e\u037f\7\65\2\2\u037f\u0380\7\u00e6\2\2\u0380\u0382\5\u0102\u0082"+
		"\2\u0381\u0383\5\u011a\u008e\2\u0382\u0381\3\2\2\2\u0382\u0383\3\2\2\2"+
		"\u0383\u0384\3\2\2\2\u0384\u0385\7\u00e6\2\2\u0385\u0386\7Z\2\2\u0386"+
		"\u0387\7\u00e6\2\2\u0387\u0388\5\u00d0i\2\u0388\u038a\5\u0126\u0094\2"+
		"\u0389\u038b\5\34\17\2\u038a\u0389\3\2\2\2\u038a\u038b\3\2\2\2\u038b\u038c"+
		"\3\2\2\2\u038c\u038f\7v\2\2\u038d\u038e\7\u00e6\2\2\u038e\u0390\5\u0102"+
		"\u0082\2\u038f\u038d\3\2\2\2\u038f\u0390\3\2\2\2\u0390K\3\2\2\2\u0391"+
		"\u0392\7P\2\2\u0392\u0393\7\u00e6\2\2\u0393\u0395\5\u0102\u0082\2\u0394"+
		"\u0396\5\u011a\u008e\2\u0395\u0394\3\2\2\2\u0395\u0396\3\2\2\2\u0396\u0399"+
		"\3\2\2\2\u0397\u0398\7\u00e6\2\2\u0398\u039a\5\u0104\u0083\2\u0399\u0397"+
		"\3\2\2\2\u0399\u039a\3\2\2\2\u039a\u039c\3\2\2\2\u039b\u039d\7\u00e6\2"+
		"\2\u039c\u039b\3\2\2\2\u039c\u039d\3\2\2\2\u039d\u039e\3\2\2\2\u039e\u03a0"+
		"\7\u00c8\2\2\u039f\u03a1\7\u00e6\2\2\u03a0\u039f\3\2\2\2\u03a0\u03a1\3"+
		"\2\2\2\u03a1\u03a2\3\2\2\2\u03a2\u03a3\5\u00d0i\2\u03a3\u03a4\7\u00e6"+
		"\2\2\u03a4\u03a5\7\u00b2\2\2\u03a5\u03a6\7\u00e6\2\2\u03a6\u03ab\5\u00d0"+
		"i\2\u03a7\u03a8\7\u00e6\2\2\u03a8\u03a9\7\u00aa\2\2\u03a9\u03aa\7\u00e6"+
		"\2\2\u03aa\u03ac\5\u00d0i\2\u03ab\u03a7\3\2\2\2\u03ab\u03ac\3\2\2\2\u03ac"+
		"\u03ad\3\2\2\2\u03ad\u03af\5\u0126\u0094\2\u03ae\u03b0\5\34\17\2\u03af"+
		"\u03ae\3\2\2\2\u03af\u03b0\3\2\2\2\u03b0\u03b1\3\2\2\2\u03b1\u03b4\7v"+
		"\2\2\u03b2\u03b3\7\u00e6\2\2\u03b3\u03b5\5\u0102\u0082\2\u03b4\u03b2\3"+
		"\2\2\2\u03b4\u03b5\3\2\2\2\u03b5M\3\2\2\2\u03b6\u03b7\5\u011c\u008f\2"+
		"\u03b7\u03b8\7\u00e6\2\2\u03b8\u03ba\3\2\2\2\u03b9\u03b6\3\2\2\2\u03b9"+
		"\u03ba\3\2\2\2\u03ba\u03bd\3\2\2\2\u03bb\u03bc\7\u00a9\2\2\u03bc\u03be"+
		"\7\u00e6\2\2\u03bd\u03bb\3\2\2\2\u03bd\u03be\3\2\2\2\u03be\u03bf\3\2\2"+
		"\2\u03bf\u03c1\7Q\2\2\u03c0\u03c2\7\u00e6\2\2\u03c1\u03c0\3\2\2\2\u03c1"+
		"\u03c2\3\2\2\2\u03c2\u03c3\3\2\2\2\u03c3\u03c5\5\u0102\u0082\2\u03c4\u03c6"+
		"\5\u011a\u008e\2\u03c5\u03c4\3\2\2\2\u03c5\u03c6\3\2\2\2\u03c6\u03cb\3"+
		"\2\2\2\u03c7\u03c9\7\u00e6\2\2\u03c8\u03c7\3\2\2\2\u03c8\u03c9\3\2\2\2"+
		"\u03c9\u03ca\3\2\2\2\u03ca\u03cc\5\u00f4{\2\u03cb\u03c8\3\2\2\2\u03cb"+
		"\u03cc\3\2\2\2\u03cc\u03d1\3\2\2\2\u03cd\u03cf\7\u00e6\2\2\u03ce\u03cd"+
		"\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf\u03d0\3\2\2\2\u03d0\u03d2\5\u0104\u0083"+
		"\2\u03d1\u03ce\3\2\2\2\u03d1\u03d2\3\2\2\2\u03d2\u03d3\3\2\2\2\u03d3\u03d5"+
		"\5\u0126\u0094\2\u03d4\u03d6\5\34\17\2\u03d5\u03d4\3\2\2\2\u03d5\u03d6"+
		"\3\2\2\2\u03d6\u03d7\3\2\2\2\u03d7\u03d8\79\2\2\u03d8O\3\2\2\2\u03d9\u03da"+
		"\5\u011c\u008f\2\u03da\u03db\7\u00e6\2\2\u03db\u03dd\3\2\2\2\u03dc\u03d9"+
		"\3\2\2\2\u03dc\u03dd\3\2\2\2\u03dd\u03e0\3\2\2\2\u03de\u03df\7\u00a9\2"+
		"\2\u03df\u03e1\7\u00e6\2\2\u03e0\u03de\3\2\2\2\u03e0\u03e1\3\2\2\2\u03e1"+
		"\u03e2\3\2\2\2\u03e2\u03e4\7R\2\2\u03e3\u03e5\7\u00e6\2\2\u03e4\u03e3"+
		"\3\2\2\2\u03e4\u03e5\3\2\2\2\u03e5\u03e6\3\2\2\2\u03e6\u03e8\5\u0102\u0082"+
		"\2\u03e7\u03e9\5\u011a\u008e\2\u03e8\u03e7\3\2\2\2\u03e8\u03e9\3\2\2\2"+
		"\u03e9\u03ed\3\2\2\2\u03ea\u03eb\7\r\2\2\u03eb\u03ec\7\u00e6\2\2\u03ec"+
		"\u03ee\5\u0102\u0082\2\u03ed\u03ea\3\2\2\2\u03ed\u03ee\3\2\2\2\u03ee\u03f3"+
		"\3\2\2\2\u03ef\u03f1\7\u00e6\2\2\u03f0\u03ef\3\2\2\2\u03f0\u03f1\3\2\2"+
		"\2\u03f1\u03f2\3\2\2\2\u03f2\u03f4\5\u00f4{\2\u03f3\u03f0\3\2\2\2\u03f3"+
		"\u03f4\3\2\2\2\u03f4\u03f9\3\2\2\2\u03f5\u03f7\7\u00e6\2\2\u03f6\u03f5"+
		"\3\2\2\2\u03f6\u03f7\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f8\u03fa\5\u0104\u0083"+
		"\2\u03f9\u03f6\3\2\2\2\u03f9\u03fa\3\2\2\2\u03fa\u0401\3\2\2\2\u03fb\u03fd"+
		"\7\u00e6\2\2\u03fc\u03fb\3\2\2\2\u03fc\u03fd\3\2\2\2\u03fd\u03fe\3\2\2"+
		"\2\u03fe\u03ff\7\u00c1\2\2\u03ff\u0400\7\u00e6\2\2\u0400\u0402\5\u00d0"+
		"i\2\u0401\u03fc\3\2\2\2\u0401\u0402\3\2\2\2\u0402\u0403\3\2\2\2\u0403"+
		"\u0405\5\u0126\u0094\2\u0404\u0406\5\34\17\2\u0405\u0404\3\2\2\2\u0405"+
		"\u0406\3\2\2\2\u0406\u0407\3\2\2\2\u0407\u0408\7:\2\2\u0408Q\3\2\2\2\u0409"+
		"\u040a\7S\2\2\u040a\u040b\7\u00e6\2\2\u040b\u040d\5\u00e0q\2\u040c\u040e"+
		"\7\u00e6\2\2\u040d\u040c\3\2\2\2\u040d\u040e\3\2\2\2\u040e\u040f\3\2\2"+
		"\2\u040f\u0411\7\3\2\2\u0410\u0412\7\u00e6\2\2\u0411\u0410\3\2\2\2\u0411"+
		"\u0412\3\2\2\2\u0412\u0414\3\2\2\2\u0413\u0415\5\u00d0i\2\u0414\u0413"+
		"\3\2\2\2\u0414\u0415\3\2\2\2\u0415\u0417\3\2\2\2\u0416\u0418\7\u00e6\2"+
		"\2\u0417\u0416\3\2\2\2\u0417\u0418\3\2\2\2\u0418\u0419\3\2\2\2\u0419\u041b"+
		"\7\3\2\2\u041a\u041c\7\u00e6\2\2\u041b\u041a\3\2\2\2\u041b\u041c\3\2\2"+
		"\2\u041c\u041d\3\2\2\2\u041d\u041e\5\u00d0i\2\u041eS\3\2\2\2\u041f\u0420"+
		"\7U\2\2\u0420\u0421\7\u00e6\2\2\u0421\u0422\5\u0102\u0082\2\u0422U\3\2"+
		"\2\2\u0423\u0424\7V\2\2\u0424\u0425\7\u00e6\2\2\u0425\u0426\5\u0102\u0082"+
		"\2\u0426W\3\2\2\2\u0427\u0428\7W\2\2\u0428\u0429\7\u00e6\2\2\u0429\u042a"+
		"\5\\/\2\u042a\u042b\7\u00e6\2\2\u042b\u042c\7\u00b0\2\2\u042c\u042d\7"+
		"\u00e6\2\2\u042d\u0432\5\36\20\2\u042e\u042f\7\u00e6\2\2\u042f\u0430\7"+
		"\66\2\2\u0430\u0431\7\u00e6\2\2\u0431\u0433\5\36\20\2\u0432\u042e\3\2"+
		"\2\2\u0432\u0433\3\2\2\2\u0433\u0441\3\2\2\2\u0434\u0438\5Z.\2\u0435\u0437"+
		"\5^\60\2\u0436\u0435\3\2\2\2\u0437\u043a\3\2\2\2\u0438\u0436\3\2\2\2\u0438"+
		"\u0439\3\2\2\2\u0439\u043c\3\2\2\2\u043a\u0438\3\2\2\2\u043b\u043d\5`"+
		"\61\2\u043c\u043b\3\2\2\2\u043c\u043d\3\2\2\2\u043d\u043e\3\2\2\2\u043e"+
		"\u043f\7;\2\2\u043f\u0441\3\2\2\2\u0440\u0427\3\2\2\2\u0440\u0434\3\2"+
		"\2\2\u0441Y\3\2\2\2\u0442\u0443\7W\2\2\u0443\u0444\7\u00e6\2\2\u0444\u0445"+
		"\5\\/\2\u0445\u0446\7\u00e6\2\2\u0446\u0447\7\u00b0\2\2\u0447\u0449\5"+
		"\u0126\u0094\2\u0448\u044a\5\34\17\2\u0449\u0448\3\2\2\2\u0449\u044a\3"+
		"\2\2\2\u044a[\3\2\2\2\u044b\u044c\5\u00d0i\2\u044c]\3\2\2\2\u044d\u044e"+
		"\7\67\2\2\u044e\u044f\7\u00e6\2\2\u044f\u0450\5\\/\2\u0450\u0451\7\u00e6"+
		"\2\2\u0451\u0452\7\u00b0\2\2\u0452\u0454\5\u0126\u0094\2\u0453\u0455\5"+
		"\34\17\2\u0454\u0453\3\2\2\2\u0454\u0455\3\2\2\2\u0455_\3\2\2\2\u0456"+
		"\u0457\7\66\2\2\u0457\u0459\5\u0126\u0094\2\u0458\u045a\5\34\17\2\u0459"+
		"\u0458\3\2\2\2\u0459\u045a\3\2\2\2\u045aa\3\2\2\2\u045b\u045c\7Y\2\2\u045c"+
		"\u045d\7\u00e6\2\2\u045d\u045e\5\u0102\u0082\2\u045ec\3\2\2\2\u045f\u0460"+
		"\7[\2\2\u0460\u0461\7\u00e6\2\2\u0461\u046a\5\u00e0q\2\u0462\u0464\7\u00e6"+
		"\2\2\u0463\u0462\3\2\2\2\u0463\u0464\3\2\2\2\u0464\u0465\3\2\2\2\u0465"+
		"\u0467\7\3\2\2\u0466\u0468\7\u00e6\2\2\u0467\u0466\3\2\2\2\u0467\u0468"+
		"\3\2\2\2\u0468\u0469\3\2\2\2\u0469\u046b\5\u00d0i\2\u046a\u0463\3\2\2"+
		"\2\u046b\u046c\3\2\2\2\u046c\u046a\3\2\2\2\u046c\u046d\3\2\2\2\u046de"+
		"\3\2\2\2\u046e\u046f\7^\2\2\u046f\u0470\7\u00e6\2\2\u0470\u0471\5\u00d0"+
		"i\2\u0471g\3\2\2\2\u0472\u0473\7d\2\2\u0473\u0475\7\u00e6\2\2\u0474\u0472"+
		"\3\2\2\2\u0474\u0475\3\2\2\2\u0475\u0476\3\2\2\2\u0476\u0478\5\u00e6t"+
		"\2\u0477\u0479\7\u00e6\2\2\u0478\u0477\3\2\2\2\u0478\u0479\3\2\2\2\u0479"+
		"\u047a\3\2\2\2\u047a\u047c\t\6\2\2\u047b\u047d\7\u00e6\2\2\u047c\u047b"+
		"\3\2\2\2\u047c\u047d\3\2\2\2\u047d\u047e\3\2\2\2\u047e\u047f\5\u00d0i"+
		"\2\u047fi\3\2\2\2\u0480\u0481\7g\2\2\u0481\u0482\7\u00e6\2\2\u0482\u0484"+
		"\5\u00e0q\2\u0483\u0485\7\u00e6\2\2\u0484\u0483\3\2\2\2\u0484\u0485\3"+
		"\2\2\2\u0485\u0486\3\2\2\2\u0486\u0488\7\3\2\2\u0487\u0489\7\u00e6\2\2"+
		"\u0488\u0487\3\2\2\2\u0488\u0489\3\2\2\2\u0489\u048a\3\2\2\2\u048a\u048b"+
		"\5\u00d0i\2\u048bk\3\2\2\2\u048c\u048d\7_\2\2\u048d\u048e\7\u00e6\2\2"+
		"\u048e\u048f\5\u00d0i\2\u048fm\3\2\2\2\u0490\u0491\7`\2\2\u0491\u0492"+
		"\7\u00e6\2\2\u0492\u04a1\5\u00d0i\2\u0493\u0495\7\u00e6\2\2\u0494\u0493"+
		"\3\2\2\2\u0494\u0495\3\2\2\2\u0495\u0496\3\2\2\2\u0496\u0498\7\3\2\2\u0497"+
		"\u0499\7\u00e6\2\2\u0498\u0497\3\2\2\2\u0498\u0499\3\2\2\2\u0499\u049a"+
		"\3\2\2\2\u049a\u049f\5\u00d0i\2\u049b\u049c\7\u00e6\2\2\u049c\u049d\7"+
		"\u00b2\2\2\u049d\u049e\7\u00e6\2\2\u049e\u04a0\5\u00d0i\2\u049f\u049b"+
		"\3\2\2\2\u049f\u04a0\3\2\2\2\u04a0\u04a2\3\2\2\2\u04a1\u0494\3\2\2\2\u04a1"+
		"\u04a2\3\2\2\2\u04a2o\3\2\2\2\u04a3\u04a4\7k\2\2\u04a4\u04a5\7\u00e6\2"+
		"\2\u04a5\u04a7\5\u00e6t\2\u04a6\u04a8\7\u00e6\2\2\u04a7\u04a6\3\2\2\2"+
		"\u04a7\u04a8\3\2\2\2\u04a8\u04a9\3\2\2\2\u04a9\u04ab\7\u00c8\2\2\u04aa"+
		"\u04ac\7\u00e6\2\2\u04ab\u04aa\3\2\2\2\u04ab\u04ac\3\2\2\2\u04ac\u04ad"+
		"\3\2\2\2\u04ad\u04ae\5\u00d0i\2\u04aeq\3\2\2\2\u04af\u04b1\7l\2\2\u04b0"+
		"\u04b2\7\u00e6\2\2\u04b1\u04b0\3\2\2\2\u04b1\u04b2\3\2\2\2\u04b2\u04b3"+
		"\3\2\2\2\u04b3\u04b5\5\u0102\u0082\2\u04b4\u04b6\7\u00e6\2\2\u04b5\u04b4"+
		"\3\2\2\2\u04b5\u04b6\3\2\2\2\u04b6\u04b7\3\2\2\2\u04b7\u04b9\7\u00c8\2"+
		"\2\u04b8\u04ba\7\u00e6\2\2\u04b9\u04b8\3\2\2\2\u04b9\u04ba\3\2\2\2\u04ba"+
		"\u04bb\3\2\2\2\u04bb\u04bc\5\u00d0i\2\u04bcs\3\2\2\2\u04bd\u04c1\5v<\2"+
		"\u04be\u04c0\5x=\2\u04bf\u04be\3\2\2\2\u04c0\u04c3\3\2\2\2\u04c1\u04bf"+
		"\3\2\2\2\u04c1\u04c2\3\2\2\2\u04c2\u04c5\3\2\2\2\u04c3\u04c1\3\2\2\2\u04c4"+
		"\u04c6\5z>\2\u04c5\u04c4\3\2\2\2\u04c5\u04c6\3\2\2\2\u04c6\u04c7\3\2\2"+
		"\2\u04c7\u04c8\7p\2\2\u04c8u\3\2\2\2\u04c9\u04cb\7m\2\2\u04ca\u04cc\7"+
		"\u00e6\2\2\u04cb\u04ca\3\2\2\2\u04cb\u04cc\3\2\2\2\u04cc\u04cd\3\2\2\2"+
		"\u04cd\u04ce\5\\/\2\u04ce\u04cf\7\u00e6\2\2\u04cf\u04d0\7\u00b0\2\2\u04d0"+
		"\u04d6\5\u0126\u0094\2\u04d1\u04d5\5\16\b\2\u04d2\u04d5\5\26\f\2\u04d3"+
		"\u04d5\5\34\17\2\u04d4\u04d1\3\2\2\2\u04d4\u04d2\3\2\2\2\u04d4\u04d3\3"+
		"\2\2\2\u04d5\u04d8\3\2\2\2\u04d6\u04d4\3\2\2\2\u04d6\u04d7\3\2\2\2\u04d7"+
		"w\3\2\2\2\u04d8\u04d6\3\2\2\2\u04d9\u04db\7n\2\2\u04da\u04dc\7\u00e6\2"+
		"\2\u04db\u04da\3\2\2\2\u04db\u04dc\3\2\2\2\u04dc\u04dd\3\2\2\2\u04dd\u04de"+
		"\5\\/\2\u04de\u04df\7\u00e6\2\2\u04df\u04e0\7\u00b0\2\2\u04e0\u04e6\5"+
		"\u0126\u0094\2\u04e1\u04e5\5\16\b\2\u04e2\u04e5\5\26\f\2\u04e3\u04e5\5"+
		"\34\17\2\u04e4\u04e1\3\2\2\2\u04e4\u04e2\3\2\2\2\u04e4\u04e3\3\2\2\2\u04e5"+
		"\u04e8\3\2\2\2\u04e6\u04e4\3\2\2\2\u04e6\u04e7\3\2\2\2\u04e7y\3\2\2\2"+
		"\u04e8\u04e6\3\2\2\2\u04e9\u04ea\7o\2\2\u04ea\u04f0\5\u0126\u0094\2\u04eb"+
		"\u04ef\5\16\b\2\u04ec\u04ef\5\26\f\2\u04ed\u04ef\5\34\17\2\u04ee\u04eb"+
		"\3\2\2\2\u04ee\u04ec\3\2\2\2\u04ee\u04ed\3\2\2\2\u04ef\u04f2\3\2\2\2\u04f0"+
		"\u04ee\3\2\2\2\u04f0\u04f1\3\2\2\2\u04f1{\3\2\2\2\u04f2\u04f0\3\2\2\2"+
		"\u04f3\u04f5\7r\2\2\u04f4\u04f6\7\u00e6\2\2\u04f5\u04f4\3\2\2\2\u04f5"+
		"\u04f6\3\2\2\2\u04f6\u04f7\3\2\2\2\u04f7\u04f9\7\u00cc\2\2\u04f8\u04fa"+
		"\7\u00e6\2\2\u04f9\u04f8\3\2\2\2\u04f9\u04fa\3\2\2\2\u04fa\u04fb\3\2\2"+
		"\2\u04fb\u04fd\5\u0102\u0082\2\u04fc\u04fe\7\u00e6\2\2\u04fd\u04fc\3\2"+
		"\2\2\u04fd\u04fe\3\2\2\2\u04fe\u04ff\3\2\2\2\u04ff\u0501\7\3\2\2\u0500"+
		"\u0502\7\u00e6\2\2\u0501\u0500\3\2\2\2\u0501\u0502\3\2\2\2\u0502\u0503"+
		"\3\2\2\2\u0503\u050c\5\u00d0i\2\u0504\u0506\7\u00e6\2\2\u0505\u0504\3"+
		"\2\2\2\u0505\u0506\3\2\2\2\u0506\u0507\3\2\2\2\u0507\u0509\7\3\2\2\u0508"+
		"\u050a\7\u00e6\2\2\u0509\u0508\3\2\2\2\u0509\u050a\3\2\2\2\u050a\u050b"+
		"\3\2\2\2\u050b\u050d\5\u00d0i\2\u050c\u0505\3\2\2\2\u050c\u050d\3\2\2"+
		"\2\u050d\u050f\3\2\2\2\u050e\u0510\7\u00e6\2\2\u050f\u050e\3\2\2\2\u050f"+
		"\u0510\3\2\2\2\u0510\u0511\3\2\2\2\u0511\u0513\7\u00d5\2\2\u0512\u0514"+
		"\7\u00e6\2\2\u0513\u0512\3\2\2\2\u0513\u0514\3\2\2\2\u0514\u0515\3\2\2"+
		"\2\u0515\u0517\7\u00c8\2\2\u0516\u0518\7\u00e6\2\2\u0517\u0516\3\2\2\2"+
		"\u0517\u0518\3\2\2\2\u0518\u0519\3\2\2\2\u0519\u051a\5\u00d0i\2\u051a"+
		"}\3\2\2\2\u051b\u051c\7s\2\2\u051c\u051d\7\u00e6\2\2\u051d\u051e\5\u00d0"+
		"i\2\u051e\177\3\2\2\2\u051f\u0520\7u\2\2\u0520\u0521\7\u00e6\2\2\u0521"+
		"\u0522\5\u00d0i\2\u0522\u0523\7\u00e6\2\2\u0523\u0524\7\22\2\2\u0524\u0525"+
		"\7\u00e6\2\2\u0525\u0526\5\u00d0i\2\u0526\u0081\3\2\2\2\u0527\u0528\t"+
		"\7\2\2\u0528\u052f\7\u00e6\2\2\u0529\u052a\7V\2\2\u052a\u052b\7\u00e6"+
		"\2\2\u052b\u0530\5\u0102\u0082\2\u052c\u052d\7\u0099\2\2\u052d\u052e\7"+
		"\u00e6\2\2\u052e\u0530\7v\2\2\u052f\u0529\3\2\2\2\u052f\u052c\3\2\2\2"+
		"\u0530\u0083\3\2\2\2\u0531\u0532\7|\2\2\u0532\u0533\7\u00e6\2\2\u0533"+
		"\u0534\5\u00d0i\2\u0534\u0535\7\u00e6\2\2\u0535\u0536\7V\2\2\u0536\u0537"+
		"\7\u00e6\2\2\u0537\u0542\5\u0102\u0082\2\u0538\u053a\7\u00e6\2\2\u0539"+
		"\u0538\3\2\2\2\u0539\u053a\3\2\2\2\u053a\u053b\3\2\2\2\u053b\u053d\7\3"+
		"\2\2\u053c\u053e\7\u00e6\2\2\u053d\u053c\3\2\2\2\u053d\u053e\3\2\2\2\u053e"+
		"\u053f\3\2\2\2\u053f\u0541\5\u0102\u0082\2\u0540\u0539\3\2\2\2\u0541\u0544"+
		"\3\2\2\2\u0542\u0540\3\2\2\2\u0542\u0543\3\2\2\2\u0543\u0085\3\2\2\2\u0544"+
		"\u0542\3\2\2\2\u0545\u0546\7|\2\2\u0546\u0547\7\u00e6\2\2\u0547\u0548"+
		"\5\u00d0i\2\u0548\u0549\7\u00e6\2\2\u0549\u054a\7U\2\2\u054a\u054b\7\u00e6"+
		"\2\2\u054b\u0556\5\u0102\u0082\2\u054c\u054e\7\u00e6\2\2\u054d\u054c\3"+
		"\2\2\2\u054d\u054e\3\2\2\2\u054e\u054f\3\2\2\2\u054f\u0551\7\3\2\2\u0550"+
		"\u0552\7\u00e6\2\2\u0551\u0550\3\2\2\2\u0551\u0552\3\2\2\2\u0552\u0553"+
		"\3\2\2\2\u0553\u0555\5\u0102\u0082\2\u0554\u054d\3\2\2\2\u0555\u0558\3"+
		"\2\2\2\u0556\u0554\3\2\2\2\u0556\u0557\3\2\2\2\u0557\u0087\3\2\2\2\u0558"+
		"\u0556\3\2\2\2\u0559\u055a\7\177\2\2\u055a\u055b\7\u00e6\2\2\u055b\u055c"+
		"\5\u00d0i\2\u055c\u055d\7\u00e6\2\2\u055d\u055e\7P\2\2\u055e\u055f\7\u00e6"+
		"\2\2\u055f\u0564\t\b\2\2\u0560\u0561\7\u00e6\2\2\u0561\u0562\7\13\2\2"+
		"\u0562\u0563\7\u00e6\2\2\u0563\u0565\t\t\2\2\u0564\u0560\3\2\2\2\u0564"+
		"\u0565\3\2\2\2\u0565\u0568\3\2\2\2\u0566\u0567\7\u00e6\2\2\u0567\u0569"+
		"\t\n\2\2\u0568\u0566\3\2\2\2\u0568\u0569\3\2\2\2\u0569\u056a\3\2\2\2\u056a"+
		"\u056b\7\u00e6\2\2\u056b\u056c\7\22\2\2\u056c\u056d\7\u00e6\2\2\u056d"+
		"\u0578\5\u00e0q\2\u056e\u056f\7\u00e6\2\2\u056f\u0571\7c\2\2\u0570\u0572"+
		"\7\u00e6\2\2\u0571\u0570\3\2\2\2\u0571\u0572\3\2\2\2\u0572\u0573\3\2\2"+
		"\2\u0573\u0575\7\u00c8\2\2\u0574\u0576\7\u00e6\2\2\u0575\u0574\3\2\2\2"+
		"\u0575\u0576\3\2\2\2\u0576\u0577\3\2\2\2\u0577\u0579\5\u00d0i\2\u0578"+
		"\u056e\3\2\2\2\u0578\u0579\3\2\2\2\u0579\u0089\3\2\2\2\u057a\u0587\5\u008c"+
		"G\2\u057b\u057d\7\u00e6\2\2\u057c\u057b\3\2\2\2\u057c\u057d\3\2\2\2\u057d"+
		"\u057e\3\2\2\2\u057e\u0580\t\13\2\2\u057f\u0581\7\u00e6\2\2\u0580\u057f"+
		"\3\2\2\2\u0580\u0581\3\2\2\2\u0581\u0583\3\2\2\2\u0582\u0584\5\u008cG"+
		"\2\u0583\u0582\3\2\2\2\u0583\u0584\3\2\2\2\u0584\u0586\3\2\2\2\u0585\u057c"+
		"\3\2\2\2\u0586\u0589\3\2\2\2\u0587\u0585\3\2\2\2\u0587\u0588\3\2\2\2\u0588"+
		"\u059c\3\2\2\2\u0589\u0587\3\2\2\2\u058a\u058c\5\u008cG\2\u058b\u058a"+
		"\3\2\2\2\u058b\u058c\3\2\2\2\u058c\u0597\3\2\2\2\u058d\u058f\7\u00e6\2"+
		"\2\u058e\u058d\3\2\2\2\u058e\u058f\3\2\2\2\u058f\u0590\3\2\2\2\u0590\u0592"+
		"\t\13\2\2\u0591\u0593\7\u00e6\2\2\u0592\u0591\3\2\2\2\u0592\u0593\3\2"+
		"\2\2\u0593\u0595\3\2\2\2\u0594\u0596\5\u008cG\2\u0595\u0594\3\2\2\2\u0595"+
		"\u0596\3\2\2\2\u0596\u0598\3\2\2\2\u0597\u058e\3\2\2\2\u0598\u0599\3\2"+
		"\2\2\u0599\u0597\3\2\2\2\u0599\u059a\3\2\2\2\u059a\u059c\3\2\2\2\u059b"+
		"\u057a\3\2\2\2\u059b\u058b\3\2\2\2\u059c\u008b\3\2\2\2\u059d\u05af\5\u00d0"+
		"i\2\u059e\u05ac\t\f\2\2\u059f\u05a1\7\u00e6\2\2\u05a0\u059f\3\2\2\2\u05a0"+
		"\u05a1\3\2\2\2\u05a1\u05a2\3\2\2\2\u05a2\u05a4\7\u00cc\2\2\u05a3\u05a5"+
		"\7\u00e6\2\2\u05a4\u05a3\3\2\2\2\u05a4\u05a5\3\2\2\2\u05a5\u05a6\3\2\2"+
		"\2\u05a6\u05a8\5\u00f0y\2\u05a7\u05a9\7\u00e6\2\2\u05a8\u05a7\3\2\2\2"+
		"\u05a8\u05a9\3\2\2\2\u05a9\u05aa\3\2\2\2\u05aa\u05ab\7\u00d5\2\2\u05ab"+
		"\u05ad\3\2\2\2\u05ac\u05a0\3\2\2\2\u05ac\u05ad\3\2\2\2\u05ad\u05af\3\2"+
		"\2\2\u05ae\u059d\3\2\2\2\u05ae\u059e\3\2\2\2\u05af\u008d\3\2\2\2\u05b0"+
		"\u05b1\7\u0089\2\2\u05b1\u05b2\7\u00e6\2\2\u05b2\u05b4\5\u00e0q\2\u05b3"+
		"\u05b5\7\u00e6\2\2\u05b4\u05b3\3\2\2\2\u05b4\u05b5\3\2\2\2\u05b5\u05b6"+
		"\3\2\2\2\u05b6\u05bb\7\3\2\2\u05b7\u05b9\7\u00e6\2\2\u05b8\u05b7\3\2\2"+
		"\2\u05b8\u05b9\3\2\2\2\u05b9\u05ba\3\2\2\2\u05ba\u05bc\5\u008aF\2\u05bb"+
		"\u05b8\3\2\2\2\u05bb\u05bc\3\2\2\2\u05bc\u008f\3\2\2\2\u05bd\u05be\5\u011c"+
		"\u008f\2\u05be\u05bf\7\u00e6\2\2\u05bf\u05c1\3\2\2\2\u05c0\u05bd\3\2\2"+
		"\2\u05c0\u05c1\3\2\2\2\u05c1\u05c4\3\2\2\2\u05c2\u05c3\7\u00a9\2\2\u05c3"+
		"\u05c5\7\u00e6\2\2\u05c4\u05c2\3\2\2\2\u05c4\u05c5\3\2\2\2\u05c5\u05c6"+
		"\3\2\2\2\u05c6\u05c7\7\u008b\2\2\u05c7\u05c8\7\u00e6\2\2\u05c8\u05ca\5"+
		"\u0102\u0082\2\u05c9\u05cb\5\u011a\u008e\2\u05ca\u05c9\3\2\2\2\u05ca\u05cb"+
		"\3\2\2\2\u05cb\u05d0\3\2\2\2\u05cc\u05ce\7\u00e6\2\2\u05cd\u05cc\3\2\2"+
		"\2\u05cd\u05ce\3\2\2\2\u05ce\u05cf\3\2\2\2\u05cf\u05d1\5\u00f4{\2\u05d0"+
		"\u05cd\3\2\2\2\u05d0\u05d1\3\2\2\2\u05d1\u05d4\3\2\2\2\u05d2\u05d3\7\u00e6"+
		"\2\2\u05d3\u05d5\5\u0104\u0083\2\u05d4\u05d2\3\2\2\2\u05d4\u05d5\3\2\2"+
		"\2\u05d5\u05d6\3\2\2\2\u05d6\u05d8\5\u0126\u0094\2\u05d7\u05d9\5\34\17"+
		"\2\u05d8\u05d7\3\2\2\2\u05d8\u05d9\3\2\2\2\u05d9\u05da\3\2\2\2\u05da\u05db"+
		"\7<\2\2\u05db\u0091\3\2\2\2\u05dc\u05dd\5\u011c\u008f\2\u05dd\u05de\7"+
		"\u00e6\2\2\u05de\u05e0\3\2\2\2\u05df\u05dc\3\2\2\2\u05df\u05e0\3\2\2\2"+
		"\u05e0\u05e3\3\2\2\2\u05e1\u05e2\7\u00a9\2\2\u05e2\u05e4\7\u00e6\2\2\u05e3"+
		"\u05e1\3\2\2\2\u05e3\u05e4\3\2\2\2\u05e4\u05e5\3\2\2\2\u05e5\u05e6\7\u008d"+
		"\2\2\u05e6\u05e7\7\u00e6\2\2\u05e7\u05ec\5\u0102\u0082\2\u05e8\u05ea\7"+
		"\u00e6\2\2\u05e9\u05e8\3\2\2\2\u05e9\u05ea\3\2\2\2\u05ea\u05eb\3\2\2\2"+
		"\u05eb\u05ed\5\u00f4{\2\u05ec\u05e9\3\2\2\2\u05ec\u05ed\3\2\2\2\u05ed"+
		"\u05ee\3\2\2\2\u05ee\u05f0\5\u0126\u0094\2\u05ef\u05f1\5\34\17\2\u05f0"+
		"\u05ef\3\2\2\2\u05f0\u05f1\3\2\2\2\u05f1\u05f2\3\2\2\2\u05f2\u05f3\7<"+
		"\2\2\u05f3\u0093\3\2\2\2\u05f4\u05f5\5\u011c\u008f\2\u05f5\u05f6\7\u00e6"+
		"\2\2\u05f6\u05f8\3\2\2\2\u05f7\u05f4\3\2\2\2\u05f7\u05f8\3\2\2\2\u05f8"+
		"\u05fb\3\2\2\2\u05f9\u05fa\7\u00a9\2\2\u05fa\u05fc\7\u00e6\2\2\u05fb\u05f9"+
		"\3\2\2\2\u05fb\u05fc\3\2\2\2\u05fc\u05fd\3\2\2\2\u05fd\u05fe\7\u008c\2"+
		"\2\u05fe\u05ff\7\u00e6\2\2\u05ff\u0604\5\u0102\u0082\2\u0600\u0602\7\u00e6"+
		"\2\2\u0601\u0600\3\2\2\2\u0601\u0602\3\2\2\2\u0602\u0603\3\2\2\2\u0603"+
		"\u0605\5\u00f4{\2\u0604\u0601\3\2\2\2\u0604\u0605\3\2\2\2\u0605\u0606"+
		"\3\2\2\2\u0606\u0608\5\u0126\u0094\2\u0607\u0609\5\34\17\2\u0608\u0607"+
		"\3\2\2\2\u0608\u0609\3\2\2\2\u0609\u060a\3\2\2\2\u060a\u060b\7<\2\2\u060b"+
		"\u0095\3\2\2\2\u060c\u060d\7\u0090\2\2\u060d\u060e\7\u00e6\2\2\u060e\u0610"+
		"\5\u00e0q\2\u060f\u0611\7\u00e6\2\2\u0610\u060f\3\2\2\2\u0610\u0611\3"+
		"\2\2\2\u0611\u0612\3\2\2\2\u0612\u0614\7\3\2\2\u0613\u0615\7\u00e6\2\2"+
		"\u0614\u0613\3\2\2\2\u0614\u0615\3\2\2\2\u0615\u0617\3\2\2\2\u0616\u0618"+
		"\5\u00d0i\2\u0617\u0616\3\2\2\2\u0617\u0618\3\2\2\2\u0618\u061a\3\2\2"+
		"\2\u0619\u061b\7\u00e6\2\2\u061a\u0619\3\2\2\2\u061a\u061b\3\2\2\2\u061b"+
		"\u061c\3\2\2\2\u061c\u061e\7\3\2\2\u061d\u061f\7\u00e6\2\2\u061e\u061d"+
		"\3\2\2\2\u061e\u061f\3\2\2\2\u061f\u0620\3\2\2\2\u0620\u0621\5\u00d0i"+
		"\2\u0621\u0097\3\2\2\2\u0622\u0623\7\u0093\2\2\u0623\u0624\7\u00e6\2\2"+
		"\u0624\u0633\5\u0102\u0082\2\u0625\u0627\7\u00e6\2\2\u0626\u0625\3\2\2"+
		"\2\u0626\u0627\3\2\2\2\u0627\u0628\3\2\2\2\u0628\u062a\7\u00cc\2\2\u0629"+
		"\u062b\7\u00e6\2\2\u062a\u0629\3\2\2\2\u062a\u062b\3\2\2\2\u062b\u0630"+
		"\3\2\2\2\u062c\u062e\5\u00f0y\2\u062d\u062f\7\u00e6\2\2\u062e\u062d\3"+
		"\2\2\2\u062e\u062f\3\2\2\2\u062f\u0631\3\2\2\2\u0630\u062c\3\2\2\2\u0630"+
		"\u0631\3\2\2\2\u0631\u0632\3\2\2\2\u0632\u0634\7\u00d5\2\2\u0633\u0626"+
		"\3\2\2\2\u0633\u0634\3\2\2\2\u0634\u0099\3\2\2\2\u0635\u0638\7\u0092\2"+
		"\2\u0636\u0637\7\u00e6\2\2\u0637\u0639\5\u00d0i\2\u0638\u0636\3\2\2\2"+
		"\u0638\u0639\3\2\2\2\u0639\u009b\3\2\2\2\u063a\u063b\7\u0096\2\2\u063b"+
		"\u063e\7\u00e6\2\2\u063c\u063d\7\u0088\2\2\u063d\u063f\7\u00e6\2\2\u063e"+
		"\u063c\3\2\2\2\u063e\u063f\3\2\2\2\u063f\u0640\3\2\2\2\u0640\u064b\5\u009e"+
		"P\2\u0641\u0643\7\u00e6\2\2\u0642\u0641\3\2\2\2\u0642\u0643\3\2\2\2\u0643"+
		"\u0644\3\2\2\2\u0644\u0646\7\3\2\2\u0645\u0647\7\u00e6\2\2\u0646\u0645"+
		"\3\2\2\2\u0646\u0647\3\2\2\2\u0647\u0648\3\2\2\2\u0648\u064a\5\u009eP"+
		"\2\u0649\u0642\3\2\2\2\u064a\u064d\3\2\2\2\u064b\u0649\3\2\2\2\u064b\u064c"+
		"\3\2\2\2\u064c\u009d\3\2\2\2\u064d\u064b\3\2\2\2\u064e\u0650\5\u0102\u0082"+
		"\2\u064f\u0651\7\u00e6\2\2\u0650\u064f\3\2\2\2\u0650\u0651\3\2\2\2\u0651"+
		"\u0652\3\2\2\2\u0652\u0654\7\u00cc\2\2\u0653\u0655\7\u00e6\2\2\u0654\u0653"+
		"\3\2\2\2\u0654\u0655\3\2\2\2\u0655\u0656\3\2\2\2\u0656\u0658\5\u00fa~"+
		"\2\u0657\u0659\7\u00e6\2\2\u0658\u0657\3\2\2\2\u0658\u0659\3\2\2\2\u0659"+
		"\u065a\3\2\2\2\u065a\u065d\7\u00d5\2\2\u065b\u065c\7\u00e6\2\2\u065c\u065e"+
		"\5\u0104\u0083\2\u065d\u065b\3\2\2\2\u065d\u065e\3\2\2\2\u065e\u009f\3"+
		"\2\2\2\u065f\u0660\7\u0098\2\2\u0660\u00a1\3\2\2\2\u0661\u0667\7\u0099"+
		"\2\2\u0662\u0665\7\u00e6\2\2\u0663\u0666\7v\2\2\u0664\u0666\5\u0102\u0082"+
		"\2\u0665\u0663\3\2\2\2\u0665\u0664\3\2\2\2\u0666\u0668\3\2\2\2\u0667\u0662"+
		"\3\2\2\2\u0667\u0668\3\2\2\2\u0668\u00a3\3\2\2\2\u0669\u066a\7\u009a\2"+
		"\2\u066a\u00a5\3\2\2\2\u066b\u066c\7\u009b\2\2\u066c\u066d\7\u00e6\2\2"+
		"\u066d\u066e\5\u00d0i\2\u066e\u00a7\3\2\2\2\u066f\u0670\7\u009c\2\2\u0670"+
		"\u0671\7\u00e6\2\2\u0671\u0673\5\u00e6t\2\u0672\u0674\7\u00e6\2\2\u0673"+
		"\u0672\3\2\2\2\u0673\u0674\3\2\2\2\u0674\u0675\3\2\2\2\u0675\u0677\7\u00c8"+
		"\2\2\u0676\u0678\7\u00e6\2\2\u0677\u0676\3\2\2\2\u0677\u0678\3\2\2\2\u0678"+
		"\u0679\3\2\2\2\u0679\u067a\5\u00d0i\2\u067a\u00a9\3\2\2\2\u067b\u067c"+
		"\7\u009d\2\2\u067c\u067d\7\u00e6\2\2\u067d\u067f\5\u00d0i\2\u067e\u0680"+
		"\7\u00e6\2\2\u067f\u067e\3\2\2\2\u067f\u0680\3\2\2\2\u0680\u0681\3\2\2"+
		"\2\u0681\u0683\7\3\2\2\u0682\u0684\7\u00e6\2\2\u0683\u0682\3\2\2\2\u0683"+
		"\u0684\3\2\2\2\u0684\u0685\3\2\2\2\u0685\u0686\5\u00d0i\2\u0686\u00ab"+
		"\3\2\2\2\u0687\u0688\7\u009e\2\2\u0688\u0689\7\u00e6\2\2\u0689\u068b\5"+
		"\u00d0i\2\u068a\u068c\7\u00e6\2\2\u068b\u068a\3\2\2\2\u068b\u068c\3\2"+
		"\2\2\u068c\u068d\3\2\2\2\u068d\u068f\7\3\2\2\u068e\u0690\7\u00e6\2\2\u068f"+
		"\u068e\3\2\2\2\u068f\u0690\3\2\2\2\u0690\u0691\3\2\2\2\u0691\u0693\5\u00d0"+
		"i\2\u0692\u0694\7\u00e6\2\2\u0693\u0692\3\2\2\2\u0693\u0694\3\2\2\2\u0694"+
		"\u0695\3\2\2\2\u0695\u0697\7\3\2\2\u0696\u0698\7\u00e6\2\2\u0697\u0696"+
		"\3\2\2\2\u0697\u0698\3\2\2\2\u0698\u0699\3\2\2\2\u0699\u069b\5\u00d0i"+
		"\2\u069a\u069c\7\u00e6\2\2\u069b\u069a\3\2\2\2\u069b\u069c\3\2\2\2\u069c"+
		"\u069d\3\2\2\2\u069d\u069f\7\3\2\2\u069e\u06a0\7\u00e6\2\2\u069f\u069e"+
		"\3\2\2\2\u069f\u06a0\3\2\2\2\u06a0\u06a1\3\2\2\2\u06a1\u06a2\5\u00d0i"+
		"\2\u06a2\u00ad\3\2\2\2\u06a3\u06a4\7\u009f\2\2\u06a4\u06a5\7\u00e6\2\2"+
		"\u06a5\u06a7\5\u00e0q\2\u06a6\u06a8\7\u00e6\2\2\u06a7\u06a6\3\2\2\2\u06a7"+
		"\u06a8\3\2\2\2\u06a8\u06a9\3\2\2\2\u06a9\u06ab\7\3\2\2\u06aa\u06ac\7\u00e6"+
		"\2\2\u06ab\u06aa\3\2\2\2\u06ab\u06ac\3\2\2\2\u06ac\u06ad\3\2\2\2\u06ad"+
		"\u06ae\5\u00d0i\2\u06ae\u00af\3\2\2\2\u06af\u06b0\7\u00a0\2\2\u06b0\u06b1"+
		"\7\u00e6\2\2\u06b1\u06b2\7\33\2\2\u06b2\u06b3\7\u00e6\2\2\u06b3\u06b4"+
		"\5\u00d0i\2\u06b4\u06b8\5\u0126\u0094\2\u06b5\u06b7\5\u00b4[\2\u06b6\u06b5"+
		"\3\2\2\2\u06b7\u06ba\3\2\2\2\u06b8\u06b6\3\2\2\2\u06b8\u06b9\3\2\2\2\u06b9"+
		"\u06bb\3\2\2\2\u06ba\u06b8\3\2\2\2\u06bb\u06bc\7=\2\2\u06bc\u00b1\3\2"+
		"\2\2\u06bd\u06bf\7\\\2\2\u06be\u06c0\7\u00e6\2\2\u06bf\u06be\3\2\2\2\u06bf"+
		"\u06c0\3\2\2\2\u06c0\u06c1\3\2\2\2\u06c1\u06c3\5\u010a\u0086\2\u06c2\u06c4"+
		"\7\u00e6\2\2\u06c3\u06c2\3\2\2\2\u06c3\u06c4\3\2\2\2\u06c4\u06c5\3\2\2"+
		"\2\u06c5\u06c6\5\u00d0i\2\u06c6\u06cf\3\2\2\2\u06c7\u06c8\5\u00d0i\2\u06c8"+
		"\u06c9\7\u00e6\2\2\u06c9\u06ca\7\u00b2\2\2\u06ca\u06cb\7\u00e6\2\2\u06cb"+
		"\u06cc\5\u00d0i\2\u06cc\u06cf\3\2\2\2\u06cd\u06cf\5\u00d0i\2\u06ce\u06bd"+
		"\3\2\2\2\u06ce\u06c7\3\2\2\2\u06ce\u06cd\3\2\2\2\u06cf\u00b3\3\2\2\2\u06d0"+
		"\u06d1\7\33\2\2\u06d1\u06d2\7\u00e6\2\2\u06d2\u06d3\5\u00b6\\\2\u06d3"+
		"\u06d5\5\u0126\u0094\2\u06d4\u06d6\5\34\17\2\u06d5\u06d4\3\2\2\2\u06d5"+
		"\u06d6\3\2\2\2\u06d6\u00b5\3\2\2\2\u06d7\u06e7\7\66\2\2\u06d8\u06e3\5"+
		"\u00b2Z\2\u06d9\u06db\7\u00e6\2\2\u06da\u06d9\3\2\2\2\u06da\u06db\3\2"+
		"\2\2\u06db\u06dc\3\2\2\2\u06dc\u06de\7\3\2\2\u06dd\u06df\7\u00e6\2\2\u06de"+
		"\u06dd\3\2\2\2\u06de\u06df\3\2\2\2\u06df\u06e0\3\2\2\2\u06e0\u06e2\5\u00b2"+
		"Z\2\u06e1\u06da\3\2\2\2\u06e2\u06e5\3\2\2\2\u06e3\u06e1\3\2\2\2\u06e3"+
		"\u06e4\3\2\2\2\u06e4\u06e7\3\2\2\2\u06e5\u06e3\3\2\2\2\u06e6\u06d7\3\2"+
		"\2\2\u06e6\u06d8\3\2\2\2\u06e7\u00b7\3\2\2\2\u06e8\u06e9\7\u00a1\2\2\u06e9"+
		"\u06ea\7\u00e6\2\2\u06ea\u06f3\5\u00d0i\2\u06eb\u06ed\7\u00e6\2\2\u06ec"+
		"\u06eb\3\2\2\2\u06ec\u06ed\3\2\2\2\u06ed\u06ee\3\2\2\2\u06ee\u06f0\7\3"+
		"\2\2\u06ef\u06f1\7\u00e6\2\2\u06f0\u06ef\3\2\2\2\u06f0\u06f1\3\2\2\2\u06f1"+
		"\u06f2\3\2\2\2\u06f2\u06f4\5\u00d0i\2\u06f3\u06ec\3\2\2\2\u06f3\u06f4"+
		"\3\2\2\2\u06f4\u00b9\3\2\2\2\u06f5\u06f6\7\u00a3\2\2\u06f6\u06f7\7\u00e6"+
		"\2\2\u06f7\u06f9\5\u00d0i\2\u06f8\u06fa\7\u00e6\2\2\u06f9\u06f8\3\2\2"+
		"\2\u06f9\u06fa\3\2\2\2\u06fa\u06fb\3\2\2\2\u06fb\u06fd\7\3\2\2\u06fc\u06fe"+
		"\7\u00e6\2\2\u06fd\u06fc\3\2\2\2\u06fd\u06fe\3\2\2\2\u06fe\u06ff\3\2\2"+
		"\2\u06ff\u0700\5\u00d0i\2\u0700\u00bb\3\2\2\2\u0701\u0702\7\u00a2\2\2"+
		"\u0702\u0703\7\u00e6\2\2\u0703\u0705\5\u00e6t\2\u0704\u0706\7\u00e6\2"+
		"\2\u0705\u0704\3\2\2\2\u0705\u0706\3\2\2\2\u0706\u0707\3\2\2\2\u0707\u0709"+
		"\7\u00c8\2\2\u0708\u070a\7\u00e6\2\2\u0709\u0708\3\2\2\2\u0709\u070a\3"+
		"\2\2\2\u070a\u070b\3\2\2\2\u070b\u070c\5\u00d0i\2\u070c\u00bd\3\2\2\2"+
		"\u070d\u070e\7\u00ab\2\2\u070e\u00bf\3\2\2\2\u070f\u0710\5\u011c\u008f"+
		"\2\u0710\u0711\7\u00e6\2\2\u0711\u0713\3\2\2\2\u0712\u070f\3\2\2\2\u0712"+
		"\u0713\3\2\2\2\u0713\u0716\3\2\2\2\u0714\u0715\7\u00a9\2\2\u0715\u0717"+
		"\7\u00e6\2\2\u0716\u0714\3\2\2\2\u0716\u0717\3\2\2\2\u0717\u0718\3\2\2"+
		"\2\u0718\u071a\7\u00ad\2\2\u0719\u071b\7\u00e6\2\2\u071a\u0719\3\2\2\2"+
		"\u071a\u071b\3\2\2\2\u071b\u071c\3\2\2\2\u071c\u0721\5\u0102\u0082\2\u071d"+
		"\u071f\7\u00e6\2\2\u071e\u071d\3\2\2\2\u071e\u071f\3\2\2\2\u071f\u0720"+
		"\3\2\2\2\u0720\u0722\5\u00f4{\2\u0721\u071e\3\2\2\2\u0721\u0722\3\2\2"+
		"\2\u0722\u0723\3\2\2\2\u0723\u0725\5\u0126\u0094\2\u0724\u0726\5\34\17"+
		"\2\u0725\u0724\3\2\2\2\u0725\u0726\3\2\2\2\u0726\u0727\3\2\2\2\u0727\u0728"+
		"\7>\2\2\u0728\u00c1\3\2\2\2\u0729\u072b\7\u00b1\2\2\u072a\u072c\7\u00e6"+
		"\2\2\u072b\u072a\3\2\2\2\u072b\u072c\3\2\2\2\u072c\u072d\3\2\2\2\u072d"+
		"\u072f\7\u00c8\2\2\u072e\u0730\7\u00e6\2\2\u072f\u072e\3\2\2\2\u072f\u0730"+
		"\3\2\2\2\u0730\u0731\3\2\2\2\u0731\u0732\5\u00d0i\2\u0732\u00c3\3\2\2"+
		"\2\u0733\u0734\5\u011c\u008f\2\u0734\u0735\7\u00e6\2\2\u0735\u0737\3\2"+
		"\2\2\u0736\u0733\3\2\2\2\u0736\u0737\3\2\2\2\u0737\u0738\3\2\2\2\u0738"+
		"\u0739\7\u00b4\2\2\u0739\u073a\7\u00e6\2\2\u073a\u073b\5\u0102\u0082\2"+
		"\u073b\u073f\5\u0126\u0094\2\u073c\u073e\5\u00c6d\2\u073d\u073c\3\2\2"+
		"\2\u073e\u0741\3\2\2\2\u073f\u073d\3\2\2\2\u073f\u0740\3\2\2\2\u0740\u0742"+
		"\3\2\2\2\u0741\u073f\3\2\2\2\u0742\u0743\7?\2\2\u0743\u00c5\3\2\2\2\u0744"+
		"\u0753\5\u0102\u0082\2\u0745\u0747\7\u00e6\2\2\u0746\u0745\3\2\2\2\u0746"+
		"\u0747\3\2\2\2\u0747\u0748\3\2\2\2\u0748\u074d\7\u00cc\2\2\u0749\u074b"+
		"\7\u00e6\2\2\u074a\u0749\3\2\2\2\u074a\u074b\3\2\2\2\u074b\u074c\3\2\2"+
		"\2\u074c\u074e\5\u00fe\u0080\2\u074d\u074a\3\2\2\2\u074d\u074e\3\2\2\2"+
		"\u074e\u0750\3\2\2\2\u074f\u0751\7\u00e6\2\2\u0750\u074f\3\2\2\2\u0750"+
		"\u0751\3\2\2\2\u0751\u0752\3\2\2\2\u0752\u0754\7\u00d5\2\2\u0753\u0746"+
		"\3\2\2\2\u0753\u0754\3\2\2\2\u0754\u0755\3\2\2\2\u0755\u0756\7\u00e6\2"+
		"\2\u0756\u0757\5\u0104\u0083\2\u0757\u0758\5\u0126\u0094\2\u0758\u00c7"+
		"\3\2\2\2\u0759\u075a\7\u00b5\2\2\u075a\u075b\7\u00e6\2\2\u075b\u075c\5"+
		"\u00d0i\2\u075c\u075d\7\u00e6\2\2\u075d\u075e\7\\\2\2\u075e\u075f\7\u00e6"+
		"\2\2\u075f\u0760\5\u0118\u008d\2\u0760\u00c9\3\2\2\2\u0761\u0762\7\u00b6"+
		"\2\2\u0762\u0763\7\u00e6\2\2\u0763\u0764\5\u00d0i\2\u0764\u00cb\3\2\2"+
		"\2\u0765\u0766\7\u00b7\2\2\u0766\u0767\7\u00e6\2\2\u0767\u0776\5\u00e0"+
		"q\2\u0768\u076a\7\u00e6\2\2\u0769\u0768\3\2\2\2\u0769\u076a\3\2\2\2\u076a"+
		"\u076b\3\2\2\2\u076b\u076d\7\3\2\2\u076c\u076e\7\u00e6\2\2\u076d\u076c"+
		"\3\2\2\2\u076d\u076e\3\2\2\2\u076e\u076f\3\2\2\2\u076f\u0774\5\u00d0i"+
		"\2\u0770\u0771\7\u00e6\2\2\u0771\u0772\7\u00b2\2\2\u0772\u0773\7\u00e6"+
		"\2\2\u0773\u0775\5\u00d0i\2\u0774\u0770\3\2\2\2\u0774\u0775\3\2\2\2\u0775"+
		"\u0777\3\2\2\2\u0776\u0769\3\2\2\2\u0776\u0777\3\2\2\2\u0777\u00cd\3\2"+
		"\2\2\u0778\u0779\bh\1\2\u0779\u0792\5\u0116\u008c\2\u077a\u077f\5\u0102"+
		"\u0082\2\u077b\u077c\7\5\2\2\u077c\u077e\5\u0102\u0082\2\u077d\u077b\3"+
		"\2\2\2\u077e\u0781\3\2\2\2\u077f\u077d\3\2\2\2\u077f\u0780\3\2\2\2\u0780"+
		"\u0792\3\2\2\2\u0781\u077f\3\2\2\2\u0782\u0784\7\u00ce\2\2\u0783\u0785"+
		"\7\u00e6\2\2\u0784\u0783\3\2\2\2\u0784\u0785\3\2\2\2\u0785\u0786\3\2\2"+
		"\2\u0786\u0792\5\u00ceh\27\u0787\u0789\7\u00d2\2\2\u0788\u078a\7\u00e6"+
		"\2\2\u0789\u0788\3\2\2\2\u0789\u078a\3\2\2\2\u078a\u078b\3\2\2\2\u078b"+
		"\u0792\5\u00ceh\26\u078c\u078e\7x\2\2\u078d\u078f\7\u00e6\2\2\u078e\u078d"+
		"\3\2\2\2\u078e\u078f\3\2\2\2\u078f\u0790\3\2\2\2\u0790\u0792\5\u00ceh"+
		"\b\u0791\u0778\3\2\2\2\u0791\u077a\3\2\2\2\u0791\u0782\3\2\2\2\u0791\u0787"+
		"\3\2\2\2\u0791\u078c\3\2\2\2\u0792\u0840\3\2\2\2\u0793\u0795\f\30\2\2"+
		"\u0794\u0796\7\u00e6\2\2\u0795\u0794\3\2\2\2\u0795\u0796\3\2\2\2\u0796"+
		"\u0797\3\2\2\2\u0797\u0799\7\u00d4\2\2\u0798\u079a\7\u00e6\2\2\u0799\u0798"+
		"\3\2\2\2\u0799\u079a\3\2\2\2\u079a\u079b\3\2\2\2\u079b\u083f\5\u00ceh"+
		"\31\u079c\u079e\f\25\2\2\u079d\u079f\7\u00e6\2\2\u079e\u079d\3\2\2\2\u079e"+
		"\u079f\3\2\2\2\u079f\u07a0\3\2\2\2\u07a0\u07a2\7\u00d0\2\2\u07a1\u07a3"+
		"\7\u00e6\2\2\u07a2\u07a1\3\2\2\2\u07a2\u07a3\3\2\2\2\u07a3\u07a4\3\2\2"+
		"\2\u07a4\u083f\5\u00ceh\26\u07a5\u07a7\f\24\2\2\u07a6\u07a8\7\u00e6\2"+
		"\2\u07a7\u07a6\3\2\2\2\u07a7\u07a8\3\2\2\2\u07a8\u07a9\3\2\2\2\u07a9\u07ab"+
		"\7\u00c7\2\2\u07aa\u07ac\7\u00e6\2\2\u07ab\u07aa\3\2\2\2\u07ab\u07ac\3"+
		"\2\2\2\u07ac\u07ad\3\2\2\2\u07ad\u083f\5\u00ceh\25\u07ae\u07b0\f\23\2"+
		"\2\u07af\u07b1\7\u00e6\2\2\u07b0\u07af\3\2\2\2\u07b0\u07b1\3\2\2\2\u07b1"+
		"\u07b2\3\2\2\2\u07b2\u07b4\7t\2\2\u07b3\u07b5\7\u00e6\2\2\u07b4\u07b3"+
		"\3\2\2\2\u07b4\u07b5\3\2\2\2\u07b5\u07b6\3\2\2\2\u07b6\u083f\5\u00ceh"+
		"\24\u07b7\u07b9\f\22\2\2\u07b8\u07ba\7\u00e6\2\2\u07b9\u07b8\3\2\2\2\u07b9"+
		"\u07ba\3\2\2\2\u07ba\u07bb\3\2\2\2\u07bb\u07bd\7\u00d2\2\2\u07bc\u07be"+
		"\7\u00e6\2\2\u07bd\u07bc\3\2\2\2\u07bd\u07be\3\2\2\2\u07be\u07bf\3\2\2"+
		"\2\u07bf\u083f\5\u00ceh\23\u07c0\u07c2\f\21\2\2\u07c1\u07c3\7\u00e6\2"+
		"\2\u07c2\u07c1\3\2\2\2\u07c2\u07c3\3\2\2\2\u07c3\u07c4\3\2\2\2\u07c4\u07c6"+
		"\7\u00ce\2\2\u07c5\u07c7\7\u00e6\2\2\u07c6\u07c5\3\2\2\2\u07c6\u07c7\3"+
		"\2\2\2\u07c7\u07c8\3\2\2\2\u07c8\u083f\5\u00ceh\22\u07c9\u07cb\f\20\2"+
		"\2\u07ca\u07cc\7\u00e6\2\2\u07cb\u07ca\3\2\2\2\u07cb\u07cc\3\2\2\2\u07cc"+
		"\u07cd\3\2\2\2\u07cd\u07cf\7\u00c5\2\2\u07ce\u07d0\7\u00e6\2\2\u07cf\u07ce"+
		"\3\2\2\2\u07cf\u07d0\3\2\2\2\u07d0\u07d1\3\2\2\2\u07d1\u083f\5\u00ceh"+
		"\21\u07d2\u07d4\f\17\2\2\u07d3\u07d5\7\u00e6\2\2\u07d4\u07d3\3\2\2\2\u07d4"+
		"\u07d5\3\2\2\2\u07d5\u07d6\3\2\2\2\u07d6\u07d8\7f\2\2\u07d7\u07d9\7\u00e6"+
		"\2\2\u07d8\u07d7\3\2\2\2\u07d8\u07d9\3\2\2\2\u07d9\u07da\3\2\2\2\u07da"+
		"\u083f\5\u00ceh\20\u07db\u07dd\f\16\2\2\u07dc\u07de\7\u00e6\2\2\u07dd"+
		"\u07dc\3\2\2\2\u07dd\u07de\3\2\2\2\u07de\u07df\3\2\2\2\u07df\u07e1\7\u00c9"+
		"\2\2\u07e0\u07e2\7\u00e6\2\2\u07e1\u07e0\3\2\2\2\u07e1\u07e2\3\2\2\2\u07e2"+
		"\u07e3\3\2\2\2\u07e3\u083f\5\u00ceh\17\u07e4\u07e6\f\r\2\2\u07e5\u07e7"+
		"\7\u00e6\2\2\u07e6\u07e5\3\2\2\2\u07e6\u07e7\3\2\2\2\u07e7\u07e8\3\2\2"+
		"\2\u07e8\u07ea\7\u00cb\2\2\u07e9\u07eb\7\u00e6\2\2\u07ea\u07e9\3\2\2\2"+
		"\u07ea\u07eb\3\2\2\2\u07eb\u07ec\3\2\2\2\u07ec\u083f\5\u00ceh\16\u07ed"+
		"\u07ef\f\f\2\2\u07ee\u07f0\7\u00e6\2\2\u07ef\u07ee\3\2\2\2\u07ef\u07f0"+
		"\3\2\2\2\u07f0\u07f1\3\2\2\2\u07f1\u07f3\7\u00ca\2\2\u07f2\u07f4\7\u00e6"+
		"\2\2\u07f3\u07f2\3\2\2\2\u07f3\u07f4\3\2\2\2\u07f4\u07f5\3\2\2\2\u07f5"+
		"\u083f\5\u00ceh\r\u07f6\u07f8\f\13\2\2\u07f7\u07f9\7\u00e6\2\2\u07f8\u07f7"+
		"\3\2\2\2\u07f8\u07f9\3\2\2\2\u07f9\u07fa\3\2\2\2\u07fa\u07fc\7\u00cd\2"+
		"\2\u07fb\u07fd\7\u00e6\2\2\u07fc\u07fb\3\2\2\2\u07fc\u07fd\3\2\2\2\u07fd"+
		"\u07fe\3\2\2\2\u07fe\u083f\5\u00ceh\f\u07ff\u0801\f\n\2\2\u0800\u0802"+
		"\7\u00e6\2\2\u0801\u0800\3\2\2\2\u0801\u0802\3\2\2\2\u0802\u0803\3\2\2"+
		"\2\u0803\u0805\7\u00d1\2\2\u0804\u0806\7\u00e6\2\2\u0805\u0804\3\2\2\2"+
		"\u0805\u0806\3\2\2\2\u0806\u0807\3\2\2\2\u0807\u083f\5\u00ceh\13\u0808"+
		"\u080a\f\t\2\2\u0809\u080b\7\u00e6\2\2\u080a\u0809\3\2\2\2\u080a\u080b"+
		"\3\2\2\2\u080b\u080c\3\2\2\2\u080c\u080e\7\u00c8\2\2\u080d\u080f\7\u00e6"+
		"\2\2\u080e\u080d\3\2\2\2\u080e\u080f\3\2\2\2\u080f\u0810\3\2\2\2\u0810"+
		"\u083f\5\u00ceh\n\u0811\u0813\f\7\2\2\u0812\u0814\7\u00e6\2\2\u0813\u0812"+
		"\3\2\2\2\u0813\u0814\3\2\2\2\u0814\u0815\3\2\2\2\u0815\u0817\7\16\2\2"+
		"\u0816\u0818\7\u00e6\2\2\u0817\u0816\3\2\2\2\u0817\u0818\3\2\2\2\u0818"+
		"\u0819\3\2\2\2\u0819\u083f\5\u00ceh\b\u081a\u081c\f\6\2\2\u081b\u081d"+
		"\7\u00e6\2\2\u081c\u081b\3\2\2\2\u081c\u081d\3\2\2\2\u081d\u081e\3\2\2"+
		"\2\u081e\u0820\7\u0085\2\2\u081f\u0821\7\u00e6\2\2\u0820\u081f\3\2\2\2"+
		"\u0820\u0821\3\2\2\2\u0821\u0822\3\2\2\2\u0822\u083f\5\u00ceh\7\u0823"+
		"\u0825\f\5\2\2\u0824\u0826\7\u00e6\2\2\u0825\u0824\3\2\2\2\u0825\u0826"+
		"\3\2\2\2\u0826\u0827\3\2\2\2\u0827\u0829\7\u00c4\2\2\u0828\u082a\7\u00e6"+
		"\2\2\u0829\u0828\3\2\2\2\u0829\u082a\3\2\2\2\u082a\u082b\3\2\2\2\u082b"+
		"\u083f\5\u00ceh\6\u082c\u082e\f\4\2\2\u082d\u082f\7\u00e6\2\2\u082e\u082d"+
		"\3\2\2\2\u082e\u082f\3\2\2\2\u082f\u0830\3\2\2\2\u0830\u0832\7C\2\2\u0831"+
		"\u0833\7\u00e6\2\2\u0832\u0831\3\2\2\2\u0832\u0833\3\2\2\2\u0833\u0834"+
		"\3\2\2\2\u0834\u083f\5\u00ceh\5\u0835\u0837\f\3\2\2\u0836\u0838\7\u00e6"+
		"\2\2\u0837\u0836\3\2\2\2\u0837\u0838\3\2\2\2\u0838\u0839\3\2\2\2\u0839"+
		"\u083b\7X\2\2\u083a\u083c\7\u00e6\2\2\u083b\u083a\3\2\2\2\u083b\u083c"+
		"\3\2\2\2\u083c\u083d\3\2\2\2\u083d\u083f\5\u00ceh\4\u083e\u0793\3\2\2"+
		"\2\u083e\u079c\3\2\2\2\u083e\u07a5\3\2\2\2\u083e\u07ae\3\2\2\2\u083e\u07b7"+
		"\3\2\2\2\u083e\u07c0\3\2\2\2\u083e\u07c9\3\2\2\2\u083e\u07d2\3\2\2\2\u083e"+
		"\u07db\3\2\2\2\u083e\u07e4\3\2\2\2\u083e\u07ed\3\2\2\2\u083e\u07f6\3\2"+
		"\2\2\u083e\u07ff\3\2\2\2\u083e\u0808\3\2\2\2\u083e\u0811\3\2\2\2\u083e"+
		"\u081a\3\2\2\2\u083e\u0823\3\2\2\2\u083e\u082c\3\2\2\2\u083e\u0835\3\2"+
		"\2\2\u083f\u0842\3\2\2\2\u0840\u083e\3\2\2\2\u0840\u0841\3\2\2\2\u0841"+
		"\u00cf\3\2\2\2\u0842\u0840\3\2\2\2\u0843\u0844\bi\1\2\u0844\u0875\5\u0116"+
		"\u008c\2\u0845\u0875\5\u00e6t\2\u0846\u0848\7\u00cc\2\2\u0847\u0849\7"+
		"\u00e6\2\2\u0848\u0847\3\2\2\2\u0848\u0849\3\2\2\2\u0849\u084a\3\2\2\2"+
		"\u084a\u0855\5\u00d0i\2\u084b\u084d\7\u00e6\2\2\u084c\u084b\3\2\2\2\u084c"+
		"\u084d\3\2\2\2\u084d\u084e\3\2\2\2\u084e\u0850\7\3\2\2\u084f\u0851\7\u00e6"+
		"\2\2\u0850\u084f\3\2\2\2\u0850\u0851\3\2\2\2\u0851\u0852\3\2\2\2\u0852"+
		"\u0854\5\u00d0i\2\u0853\u084c\3\2\2\2\u0854\u0857\3\2\2\2\u0855\u0853"+
		"\3\2\2\2\u0855\u0856\3\2\2\2\u0856\u0858\3\2\2\2\u0857\u0855\3\2\2\2\u0858"+
		"\u0859\7\u00d5\2\2\u0859\u0875\3\2\2\2\u085a\u085c\7w\2\2\u085b\u085d"+
		"\7\u00e6\2\2\u085c\u085b\3\2\2\2\u085c\u085d\3\2\2\2\u085d\u085e\3\2\2"+
		"\2\u085e\u0875\5\u010e\u0088\2\u085f\u0875\5\u00c8e\2\u0860\u0862\7\f"+
		"\2\2\u0861\u0863\7\u00e6\2\2\u0862\u0861\3\2\2\2\u0862\u0863\3\2\2\2\u0863"+
		"\u0864\3\2\2\2\u0864\u0875\5\u00d0i\32\u0865\u0867\7\u00ce\2\2\u0866\u0868"+
		"\7\u00e6\2\2\u0867\u0866\3\2\2\2\u0867\u0868\3\2\2\2\u0868\u0869\3\2\2"+
		"\2\u0869\u0875\5\u00d0i\30\u086a\u086c\7\u00d2\2\2\u086b\u086d\7\u00e6"+
		"\2\2\u086c\u086b\3\2\2\2\u086c\u086d\3\2\2\2\u086d\u086e\3\2\2\2\u086e"+
		"\u0875\5\u00d0i\27\u086f\u0871\7x\2\2\u0870\u0872\7\u00e6\2\2\u0871\u0870"+
		"\3\2\2\2\u0871\u0872\3\2\2\2\u0872\u0873\3\2\2\2\u0873\u0875\5\u00d0i"+
		"\b\u0874\u0843\3\2\2\2\u0874\u0845\3\2\2\2\u0874\u0846\3\2\2\2\u0874\u085a"+
		"\3\2\2\2\u0874\u085f\3\2\2\2\u0874\u0860\3\2\2\2\u0874\u0865\3\2\2\2\u0874"+
		"\u086a\3\2\2\2\u0874\u086f\3\2\2\2\u0875\u092c\3\2\2\2\u0876\u0878\f\31"+
		"\2\2\u0877\u0879\7\u00e6\2\2\u0878\u0877\3\2\2\2\u0878\u0879\3\2\2\2\u0879"+
		"\u087a\3\2\2\2\u087a\u087c\7\u00d4\2\2\u087b\u087d\7\u00e6\2\2\u087c\u087b"+
		"\3\2\2\2\u087c\u087d\3\2\2\2\u087d\u087e\3\2\2\2\u087e\u092b\5\u00d0i"+
		"\32\u087f\u0881\f\26\2\2\u0880\u0882\7\u00e6\2\2\u0881\u0880\3\2\2\2\u0881"+
		"\u0882\3\2\2\2\u0882\u0883\3\2\2\2\u0883\u0885\7\u00d0\2\2\u0884\u0886"+
		"\7\u00e6\2\2\u0885\u0884\3\2\2\2\u0885\u0886\3\2\2\2\u0886\u0887\3\2\2"+
		"\2\u0887\u092b\5\u00d0i\27\u0888\u088a\f\25\2\2\u0889\u088b\7\u00e6\2"+
		"\2\u088a\u0889\3\2\2\2\u088a\u088b\3\2\2\2\u088b\u088c\3\2\2\2\u088c\u088e"+
		"\7\u00c7\2\2\u088d\u088f\7\u00e6\2\2\u088e\u088d\3\2\2\2\u088e\u088f\3"+
		"\2\2\2\u088f\u0890\3\2\2\2\u0890\u092b\5\u00d0i\26\u0891\u0893\f\24\2"+
		"\2\u0892\u0894\7\u00e6\2\2\u0893\u0892\3\2\2\2\u0893\u0894\3\2\2\2\u0894"+
		"\u0895\3\2\2\2\u0895\u0897\7t\2\2\u0896\u0898\7\u00e6\2\2\u0897\u0896"+
		"\3\2\2\2\u0897\u0898\3\2\2\2\u0898\u0899\3\2\2\2\u0899\u092b\5\u00d0i"+
		"\25\u089a\u089c\f\23\2\2\u089b\u089d\7\u00e6\2\2\u089c\u089b\3\2\2\2\u089c"+
		"\u089d\3\2\2\2\u089d\u089e\3\2\2\2\u089e\u08a0\7\u00d2\2\2\u089f\u08a1"+
		"\7\u00e6\2\2\u08a0\u089f\3\2\2\2\u08a0\u08a1\3\2\2\2\u08a1\u08a2\3\2\2"+
		"\2\u08a2\u092b\5\u00d0i\24\u08a3\u08a5\f\22\2\2\u08a4\u08a6\7\u00e6\2"+
		"\2\u08a5\u08a4\3\2\2\2\u08a5\u08a6\3\2\2\2\u08a6\u08a7\3\2\2\2\u08a7\u08a9"+
		"\7\u00ce\2\2\u08a8";
	private static final String _serializedATNSegment1 =
		"\u08aa\7\u00e6\2\2\u08a9\u08a8\3\2\2\2\u08a9\u08aa\3\2\2\2\u08aa\u08ab"+
		"\3\2\2\2\u08ab\u092b\5\u00d0i\23\u08ac\u08ae\f\21\2\2\u08ad\u08af\7\u00e6"+
		"\2\2\u08ae\u08ad\3\2\2\2\u08ae\u08af\3\2\2\2\u08af\u08b0\3\2\2\2\u08b0"+
		"\u08b2\7\u00c5\2\2\u08b1\u08b3\7\u00e6\2\2\u08b2\u08b1\3\2\2\2\u08b2\u08b3"+
		"\3\2\2\2\u08b3\u08b4\3\2\2\2\u08b4\u092b\5\u00d0i\22\u08b5\u08b7\f\20"+
		"\2\2\u08b6\u08b8\7\u00e6\2\2\u08b7\u08b6\3\2\2\2\u08b7\u08b8\3\2\2\2\u08b8"+
		"\u08b9\3\2\2\2\u08b9\u08bb\7f\2\2\u08ba\u08bc\7\u00e6\2\2\u08bb\u08ba"+
		"\3\2\2\2\u08bb\u08bc\3\2\2\2\u08bc\u08bd\3\2\2\2\u08bd\u092b\5\u00d0i"+
		"\21\u08be\u08c0\f\17\2\2\u08bf\u08c1\7\u00e6\2\2\u08c0\u08bf\3\2\2\2\u08c0"+
		"\u08c1\3\2\2\2\u08c1\u08c2\3\2\2\2\u08c2\u08c4\7\\\2\2\u08c3\u08c5\7\u00e6"+
		"\2\2\u08c4\u08c3\3\2\2\2\u08c4\u08c5\3\2\2\2\u08c5\u08c6\3\2\2\2\u08c6"+
		"\u092b\5\u00d0i\20\u08c7\u08c9\f\16\2\2\u08c8\u08ca\7\u00e6\2\2\u08c9"+
		"\u08c8\3\2\2\2\u08c9\u08ca\3\2\2\2\u08ca\u08cb\3\2\2\2\u08cb\u08cd\7\u00c9"+
		"\2\2\u08cc\u08ce\7\u00e6\2\2\u08cd\u08cc\3\2\2\2\u08cd\u08ce\3\2\2\2\u08ce"+
		"\u08cf\3\2\2\2\u08cf\u092b\5\u00d0i\17\u08d0\u08d2\f\r\2\2\u08d1\u08d3"+
		"\7\u00e6\2\2\u08d2\u08d1\3\2\2\2\u08d2\u08d3\3\2\2\2\u08d3\u08d4\3\2\2"+
		"\2\u08d4\u08d6\7\u00cb\2\2\u08d5\u08d7\7\u00e6\2\2\u08d6\u08d5\3\2\2\2"+
		"\u08d6\u08d7\3\2\2\2\u08d7\u08d8\3\2\2\2\u08d8\u092b\5\u00d0i\16\u08d9"+
		"\u08db\f\f\2\2\u08da\u08dc\7\u00e6\2\2\u08db\u08da\3\2\2\2\u08db\u08dc"+
		"\3\2\2\2\u08dc\u08dd\3\2\2\2\u08dd\u08df\7\u00ca\2\2\u08de\u08e0\7\u00e6"+
		"\2\2\u08df\u08de\3\2\2\2\u08df\u08e0\3\2\2\2\u08e0\u08e1\3\2\2\2\u08e1"+
		"\u092b\5\u00d0i\r\u08e2\u08e4\f\13\2\2\u08e3\u08e5\7\u00e6\2\2\u08e4\u08e3"+
		"\3\2\2\2\u08e4\u08e5\3\2\2\2\u08e5\u08e6\3\2\2\2\u08e6\u08e8\7\u00cd\2"+
		"\2\u08e7\u08e9\7\u00e6\2\2\u08e8\u08e7\3\2\2\2\u08e8\u08e9\3\2\2\2\u08e9"+
		"\u08ea\3\2\2\2\u08ea\u092b\5\u00d0i\f\u08eb\u08ed\f\n\2\2\u08ec\u08ee"+
		"\7\u00e6\2\2\u08ed\u08ec\3\2\2\2\u08ed\u08ee\3\2\2\2\u08ee\u08ef\3\2\2"+
		"\2\u08ef\u08f1\7\u00d1\2\2\u08f0\u08f2\7\u00e6\2\2\u08f1\u08f0\3\2\2\2"+
		"\u08f1\u08f2\3\2\2\2\u08f2\u08f3\3\2\2\2\u08f3\u092b\5\u00d0i\13\u08f4"+
		"\u08f6\f\t\2\2\u08f5\u08f7\7\u00e6\2\2\u08f6\u08f5\3\2\2\2\u08f6\u08f7"+
		"\3\2\2\2\u08f7\u08f8\3\2\2\2\u08f8\u08fa\7\u00c8\2\2\u08f9\u08fb\7\u00e6"+
		"\2\2\u08fa\u08f9\3\2\2\2\u08fa\u08fb\3\2\2\2\u08fb\u08fc\3\2\2\2\u08fc"+
		"\u092b\5\u00d0i\n\u08fd\u08ff\f\7\2\2\u08fe\u0900\7\u00e6\2\2\u08ff\u08fe"+
		"\3\2\2\2\u08ff\u0900\3\2\2\2\u0900\u0901\3\2\2\2\u0901\u0903\7\16\2\2"+
		"\u0902\u0904\7\u00e6\2\2\u0903\u0902\3\2\2\2\u0903\u0904\3\2\2\2\u0904"+
		"\u0905\3\2\2\2\u0905\u092b\5\u00d0i\b\u0906\u0908\f\6\2\2\u0907\u0909"+
		"\7\u00e6\2\2\u0908\u0907\3\2\2\2\u0908\u0909\3\2\2\2\u0909\u090a\3\2\2"+
		"\2\u090a\u090c\7\u0085\2\2\u090b\u090d\7\u00e6\2\2\u090c\u090b\3\2\2\2"+
		"\u090c\u090d\3\2\2\2\u090d\u090e\3\2\2\2\u090e\u092b\5\u00d0i\7\u090f"+
		"\u0911\f\5\2\2\u0910\u0912\7\u00e6\2\2\u0911\u0910\3\2\2\2\u0911\u0912"+
		"\3\2\2\2\u0912\u0913\3\2\2\2\u0913\u0915\7\u00c4\2\2\u0914\u0916\7\u00e6"+
		"\2\2\u0915\u0914\3\2\2\2\u0915\u0916\3\2\2\2\u0916\u0917\3\2\2\2\u0917"+
		"\u092b\5\u00d0i\6\u0918\u091a\f\4\2\2\u0919\u091b\7\u00e6\2\2\u091a\u0919"+
		"\3\2\2\2\u091a\u091b\3\2\2\2\u091b\u091c\3\2\2\2\u091c\u091e\7C\2\2\u091d"+
		"\u091f\7\u00e6\2\2\u091e\u091d\3\2\2\2\u091e\u091f\3\2\2\2\u091f\u0920"+
		"\3\2\2\2\u0920\u092b\5\u00d0i\5\u0921\u0923\f\3\2\2\u0922\u0924\7\u00e6"+
		"\2\2\u0923\u0922\3\2\2\2\u0923\u0924\3\2\2\2\u0924\u0925\3\2\2\2\u0925"+
		"\u0927\7X\2\2\u0926\u0928\7\u00e6\2\2\u0927\u0926\3\2\2\2\u0927\u0928"+
		"\3\2\2\2\u0928\u0929\3\2\2\2\u0929\u092b\5\u00d0i\4\u092a\u0876\3\2\2"+
		"\2\u092a\u087f\3\2\2\2\u092a\u0888\3\2\2\2\u092a\u0891\3\2\2\2\u092a\u089a"+
		"\3\2\2\2\u092a\u08a3\3\2\2\2\u092a\u08ac\3\2\2\2\u092a\u08b5\3\2\2\2\u092a"+
		"\u08be\3\2\2\2\u092a\u08c7\3\2\2\2\u092a\u08d0\3\2\2\2\u092a\u08d9\3\2"+
		"\2\2\u092a\u08e2\3\2\2\2\u092a\u08eb\3\2\2\2\u092a\u08f4\3\2\2\2\u092a"+
		"\u08fd\3\2\2\2\u092a\u0906\3\2\2\2\u092a\u090f\3\2\2\2\u092a\u0918\3\2"+
		"\2\2\u092a\u0921\3\2\2\2\u092b\u092e\3\2\2\2\u092c\u092a\3\2\2\2\u092c"+
		"\u092d\3\2\2\2\u092d\u00d1\3\2\2\2\u092e\u092c\3\2\2\2\u092f\u0933\7\62"+
		"\2\2\u0930\u0933\7\u00a9\2\2\u0931\u0933\5\u011c\u008f\2\u0932\u092f\3"+
		"\2\2\2\u0932\u0930\3\2\2\2\u0932\u0931\3\2\2\2\u0933\u0934\3\2\2\2\u0934"+
		"\u0937\7\u00e6\2\2\u0935\u0936\7\u00c2\2\2\u0936\u0938\7\u00e6\2\2\u0937"+
		"\u0935\3\2\2\2\u0937\u0938\3\2\2\2\u0938\u0939\3\2\2\2\u0939\u093a\5\u00d4"+
		"k\2\u093a\u00d3\3\2\2\2\u093b\u0946\5\u00d6l\2\u093c\u093e\7\u00e6\2\2"+
		"\u093d\u093c\3\2\2\2\u093d\u093e\3\2\2\2\u093e\u093f\3\2\2\2\u093f\u0941"+
		"\7\3\2\2\u0940\u0942\7\u00e6\2\2\u0941\u0940\3\2\2\2\u0941\u0942\3\2\2"+
		"\2\u0942\u0943\3\2\2\2\u0943\u0945\5\u00d6l\2\u0944\u093d\3\2\2\2\u0945"+
		"\u0948\3\2\2\2\u0946\u0944\3\2\2\2\u0946\u0947\3\2\2\2\u0947\u00d5\3\2"+
		"\2\2\u0948\u0946\3\2\2\2\u0949\u095b\5\u0102\u0082\2\u094a\u094c\7\u00e6"+
		"\2\2\u094b\u094a\3\2\2\2\u094b\u094c\3\2\2\2\u094c\u094d\3\2\2\2\u094d"+
		"\u094f\7\u00cc\2\2\u094e\u0950\7\u00e6\2\2\u094f\u094e\3\2\2\2\u094f\u0950"+
		"\3\2\2\2\u0950\u0955\3\2\2\2\u0951\u0953\5\u00fe\u0080\2\u0952\u0954\7"+
		"\u00e6\2\2\u0953\u0952\3\2\2\2\u0953\u0954\3\2\2\2\u0954\u0956\3\2\2\2"+
		"\u0955\u0951\3\2\2\2\u0955\u0956\3\2\2\2\u0956\u0957\3\2\2\2\u0957\u0959"+
		"\7\u00d5\2\2\u0958\u095a\7\u00e6\2\2\u0959\u0958\3\2\2\2\u0959\u095a\3"+
		"\2\2\2\u095a\u095c\3\2\2\2\u095b\u094b\3\2\2\2\u095b\u095c\3\2\2\2\u095c"+
		"\u095e\3\2\2\2\u095d\u095f\5\u011a\u008e\2\u095e\u095d\3\2\2\2\u095e\u095f"+
		"\3\2\2\2\u095f\u0962\3\2\2\2\u0960\u0961\7\u00e6\2\2\u0961\u0963\5\u0104"+
		"\u0083\2\u0962\u0960\3\2\2\2\u0962\u0963\3\2\2\2\u0963\u00d7\3\2\2\2\u0964"+
		"\u0965\7\u00be\2\2\u0965\u0966\7\u00e6\2\2\u0966\u0967\5\u00d0i\2\u0967"+
		"\u0969\5\u0126\u0094\2\u0968\u096a\5\34\17\2\u0969\u0968\3\2\2\2\u0969"+
		"\u096a\3\2\2\2\u096a\u096b\3\2\2\2\u096b\u096c\7\u00bd\2\2\u096c\u00d9"+
		"\3\2\2\2\u096d\u096e\7\u00bf\2\2\u096e\u096f\7\u00e6\2\2\u096f\u0971\5"+
		"\u00e0q\2\u0970\u0972\7\u00e6\2\2\u0971\u0970\3\2\2\2\u0971\u0972\3\2"+
		"\2\2\u0972\u0973\3\2\2\2\u0973\u0975\7\3\2\2\u0974\u0976\7\u00e6\2\2\u0975"+
		"\u0974\3\2\2\2\u0975\u0976\3\2\2\2\u0976\u0977\3\2\2\2\u0977\u0978\5\u00d0"+
		"i\2\u0978\u00db\3\2\2\2\u0979\u097a\7\u00c0\2\2\u097a\u097f\7\u00e6\2"+
		"\2\u097b\u0980\5\u00e6t\2\u097c\u097d\7w\2\2\u097d\u097e\7\u00e6\2\2\u097e"+
		"\u0980\5\u0118\u008d\2\u097f\u097b\3\2\2\2\u097f\u097c\3\2\2\2\u0980\u0981"+
		"\3\2\2\2\u0981\u0983\5\u0126\u0094\2\u0982\u0984\5\34\17\2\u0983\u0982"+
		"\3\2\2\2\u0983\u0984\3\2\2\2\u0984\u0985\3\2\2\2\u0985\u0986\7@\2\2\u0986"+
		"\u00dd\3\2\2\2\u0987\u0988\7\u00c3\2\2\u0988\u0989\7\u00e6\2\2\u0989\u098b"+
		"\5\u00e0q\2\u098a\u098c\7\u00e6\2\2\u098b\u098a\3\2\2\2\u098b\u098c\3"+
		"\2\2\2\u098c\u098d\3\2\2\2\u098d\u0992\7\3\2\2\u098e\u0990\7\u00e6\2\2"+
		"\u098f\u098e\3\2\2\2\u098f\u0990\3\2\2\2\u0990\u0991\3\2\2\2\u0991\u0993"+
		"\5\u008aF\2\u0992\u098f\3\2\2\2\u0992\u0993\3\2\2\2\u0993\u00df\3\2\2"+
		"\2\u0994\u0996\7\6\2\2\u0995\u0994\3\2\2\2\u0995\u0996\3\2\2\2\u0996\u0997"+
		"\3\2\2\2\u0997\u0998\5\u00d0i\2\u0998\u00e1\3\2\2\2\u0999\u099a\7\32\2"+
		"\2\u099a\u099b\7\u00e6\2\2\u099b\u099c\5\u00e6t\2\u099c\u00e3\3\2\2\2"+
		"\u099d\u09a0\5\u00e6t\2\u099e\u099f\7\u00e6\2\2\u099f\u09a1\5\u00f0y\2"+
		"\u09a0\u099e\3\2\2\2\u09a0\u09a1\3\2\2\2\u09a1\u00e5\3\2\2\2\u09a2\u09a6"+
		"\5\u00e8u\2\u09a3\u09a5\5\u00eav\2\u09a4\u09a3\3\2\2\2\u09a5\u09a8\3\2"+
		"\2\2\u09a6\u09a4\3\2\2\2\u09a6\u09a7\3\2\2\2\u09a7\u00e7\3\2\2\2\u09a8"+
		"\u09a6\3\2\2\2\u09a9\u09ab\5\u0102\u0082\2\u09aa\u09ac\5\u011a\u008e\2"+
		"\u09ab\u09aa\3\2\2\2\u09ab\u09ac\3\2\2\2\u09ac\u09b0\3\2\2\2\u09ad\u09b0"+
		"\5\u00ecw\2\u09ae\u09b0\5\u00eex\2\u09af\u09a9\3\2\2\2\u09af\u09ad\3\2"+
		"\2\2\u09af\u09ae\3\2\2\2\u09b0\u00e9\3\2\2\2\u09b1\u09bf\5\u00ecw\2\u09b2"+
		"\u09bf\5\u00eex\2\u09b3\u09b5\7\u00cc\2\2\u09b4\u09b6\7\u00e6\2\2\u09b5"+
		"\u09b4\3\2\2\2\u09b5\u09b6\3\2\2\2\u09b6\u09b8\3\2\2\2\u09b7\u09b9\5\u00f0"+
		"y\2\u09b8\u09b7\3\2\2\2\u09b8\u09b9\3\2\2\2\u09b9\u09bb\3\2\2\2\u09ba"+
		"\u09bc\7\u00e6\2\2\u09bb\u09ba\3\2\2\2\u09bb\u09bc\3\2\2\2\u09bc\u09bd"+
		"\3\2\2\2\u09bd\u09bf\7\u00d5\2\2\u09be\u09b1\3\2\2\2\u09be\u09b2\3\2\2"+
		"\2\u09be\u09b3\3\2\2\2\u09bf\u00eb\3\2\2\2\u09c0\u09c2\7\u00e6\2\2\u09c1"+
		"\u09c0\3\2\2\2\u09c1\u09c2\3\2\2\2\u09c2\u09c3\3\2\2\2\u09c3\u09c5\7\5"+
		"\2\2\u09c4\u09c6\7\u00e6\2\2\u09c5\u09c4\3\2\2\2\u09c5\u09c6\3\2\2\2\u09c6"+
		"\u09c7\3\2\2\2\u09c7\u09c8\5\u0102\u0082\2\u09c8\u00ed\3\2\2\2\u09c9\u09cb"+
		"\7\u00e6\2\2\u09ca\u09c9\3\2\2\2\u09ca\u09cb\3\2\2\2\u09cb\u09cc\3\2\2"+
		"\2\u09cc\u09ce\7\7\2\2\u09cd\u09cf\7\u00e6\2\2\u09ce\u09cd\3\2\2\2\u09ce"+
		"\u09cf\3\2\2\2\u09cf\u09d0\3\2\2\2\u09d0\u09d1\5\u0102\u0082\2\u09d1\u00ef"+
		"\3\2\2\2\u09d2\u09d4\5\u00f2z\2\u09d3\u09d2\3\2\2\2\u09d3\u09d4\3\2\2"+
		"\2\u09d4\u09d6\3\2\2\2\u09d5\u09d7\7\u00e6\2\2\u09d6\u09d5\3\2\2\2\u09d6"+
		"\u09d7\3\2\2\2\u09d7\u09d8\3\2\2\2\u09d8\u09da\7\3\2\2\u09d9\u09db\7\u00e6"+
		"\2\2\u09da\u09d9\3\2\2\2\u09da\u09db\3\2\2\2\u09db\u09dd\3\2\2\2\u09dc"+
		"\u09d3\3\2\2\2\u09dd\u09e0\3\2\2\2\u09de\u09dc\3\2\2\2\u09de\u09df\3\2"+
		"\2\2\u09df\u09e1\3\2\2\2\u09e0\u09de\3\2\2\2\u09e1\u09e2\5\u00f2z\2\u09e2"+
		"\u00f1\3\2\2\2\u09e3\u09e5\5\u0102\u0082\2\u09e4\u09e6\7\u00e6\2\2\u09e5"+
		"\u09e4\3\2\2\2\u09e5\u09e6\3\2\2\2\u09e6\u09e7\3\2\2\2\u09e7\u09e9\7\u00c6"+
		"\2\2\u09e8\u09ea\7\u00e6\2\2\u09e9\u09e8\3\2\2\2\u09e9\u09ea\3\2\2\2\u09ea"+
		"\u09ec\3\2\2\2\u09eb\u09e3\3\2\2\2\u09eb\u09ec\3\2\2\2\u09ec\u09ed\3\2"+
		"\2\2\u09ed\u09ee\5\u00d0i\2\u09ee\u00f3\3\2\2\2\u09ef\u0a01\7\u00cc\2"+
		"\2\u09f0\u09f2\7\u00e6\2\2\u09f1\u09f0\3\2\2\2\u09f1\u09f2\3\2\2\2\u09f2"+
		"\u09f3\3\2\2\2\u09f3\u09fe\5\u00f6|\2\u09f4\u09f6\7\u00e6\2\2\u09f5\u09f4"+
		"\3\2\2\2\u09f5\u09f6\3\2\2\2\u09f6\u09f7\3\2\2\2\u09f7\u09f9\7\3\2\2\u09f8"+
		"\u09fa\7\u00e6\2\2\u09f9\u09f8\3\2\2\2\u09f9\u09fa\3\2\2\2\u09fa\u09fb"+
		"\3\2\2\2\u09fb\u09fd\5\u00f6|\2\u09fc\u09f5\3\2\2\2\u09fd\u0a00\3\2\2"+
		"\2\u09fe\u09fc\3\2\2\2\u09fe\u09ff\3\2\2\2\u09ff\u0a02\3\2\2\2\u0a00\u09fe"+
		"\3\2\2\2\u0a01\u09f1\3\2\2\2\u0a01\u0a02\3\2\2\2\u0a02\u0a04\3\2\2\2\u0a03"+
		"\u0a05\7\u00e6\2\2\u0a04\u0a03\3\2\2\2\u0a04\u0a05\3\2\2\2\u0a05\u0a06"+
		"\3\2\2\2\u0a06\u0a07\7\u00d5\2\2\u0a07\u00f5\3\2\2\2\u0a08\u0a09\7\u0080"+
		"\2\2\u0a09\u0a0b\7\u00e6\2\2\u0a0a\u0a08\3\2\2\2\u0a0a\u0a0b\3\2\2\2\u0a0b"+
		"\u0a0e\3\2\2\2\u0a0c\u0a0d\t\r\2\2\u0a0d\u0a0f\7\u00e6\2\2\u0a0e\u0a0c"+
		"\3\2\2\2\u0a0e\u0a0f\3\2\2\2\u0a0f\u0a12\3\2\2\2\u0a10\u0a11\7\u0087\2"+
		"\2\u0a11\u0a13\7\u00e6\2\2\u0a12\u0a10\3\2\2\2\u0a12\u0a13\3\2\2\2\u0a13"+
		"\u0a14\3\2\2\2\u0a14\u0a16\5\u0102\u0082\2\u0a15\u0a17\5\u011a\u008e\2"+
		"\u0a16\u0a15\3\2\2\2\u0a16\u0a17\3\2\2\2\u0a17\u0a20\3\2\2\2\u0a18\u0a1a"+
		"\7\u00e6\2\2\u0a19\u0a18\3\2\2\2\u0a19\u0a1a\3\2\2\2\u0a1a\u0a1b\3\2\2"+
		"\2\u0a1b\u0a1d\7\u00cc\2\2\u0a1c\u0a1e\7\u00e6\2\2\u0a1d\u0a1c\3\2\2\2"+
		"\u0a1d\u0a1e\3\2\2\2\u0a1e\u0a1f\3\2\2\2\u0a1f\u0a21\7\u00d5\2\2\u0a20"+
		"\u0a19\3\2\2\2\u0a20\u0a21\3\2\2\2\u0a21\u0a26\3\2\2\2\u0a22\u0a24\7\u00e6"+
		"\2\2\u0a23\u0a22\3\2\2\2\u0a23\u0a24\3\2\2\2\u0a24\u0a25\3\2\2\2\u0a25"+
		"\u0a27\5\u0104\u0083\2\u0a26\u0a23\3\2\2\2\u0a26\u0a27\3\2\2\2\u0a27\u0a2c"+
		"\3\2\2\2\u0a28\u0a2a\7\u00e6\2\2\u0a29\u0a28\3\2\2\2\u0a29\u0a2a\3\2\2"+
		"\2\u0a2a\u0a2b\3\2\2\2\u0a2b\u0a2d\5\u00f8}\2\u0a2c\u0a29\3\2\2\2\u0a2c"+
		"\u0a2d\3\2\2\2\u0a2d\u00f7\3\2\2\2\u0a2e\u0a30\7\u00c8\2\2\u0a2f\u0a31"+
		"\7\u00e6\2\2\u0a30\u0a2f\3\2\2\2\u0a30\u0a31\3\2\2\2\u0a31\u0a32\3\2\2"+
		"\2\u0a32\u0a33\5\u00ceh\2\u0a33\u00f9\3\2\2\2\u0a34\u0a3f\5\u00fc\177"+
		"\2\u0a35\u0a37\7\u00e6\2\2\u0a36\u0a35\3\2\2\2\u0a36\u0a37\3\2\2\2\u0a37"+
		"\u0a38\3\2\2\2\u0a38\u0a3a\7\3\2\2\u0a39\u0a3b\7\u00e6\2\2\u0a3a\u0a39"+
		"\3\2\2\2\u0a3a\u0a3b\3\2\2\2\u0a3b\u0a3c\3\2\2\2\u0a3c\u0a3e\5\u00fc\177"+
		"\2\u0a3d\u0a36\3\2\2\2\u0a3e\u0a41\3\2\2\2\u0a3f\u0a3d\3\2\2\2\u0a3f\u0a40"+
		"\3\2\2\2\u0a40\u00fb\3\2\2\2\u0a41\u0a3f\3\2\2\2\u0a42\u0a43\5\u00d0i"+
		"\2\u0a43\u0a44\7\u00e6\2\2\u0a44\u0a45\7\u00b2\2\2\u0a45\u0a46\7\u00e6"+
		"\2\2\u0a46\u0a48\3\2\2\2\u0a47\u0a42\3\2\2\2\u0a47\u0a48\3\2\2\2\u0a48"+
		"\u0a49\3\2\2\2\u0a49\u0a4a\5\u00d0i\2\u0a4a\u00fd\3\2\2\2\u0a4b\u0a56"+
		"\5\u0100\u0081\2\u0a4c\u0a4e\7\u00e6\2\2\u0a4d\u0a4c\3\2\2\2\u0a4d\u0a4e"+
		"\3\2\2\2\u0a4e\u0a4f\3\2\2\2\u0a4f\u0a51\7\3\2\2\u0a50\u0a52\7\u00e6\2"+
		"\2\u0a51\u0a50\3\2\2\2\u0a51\u0a52\3\2\2\2\u0a52\u0a53\3\2\2\2\u0a53\u0a55"+
		"\5\u0100\u0081\2\u0a54\u0a4d\3\2\2\2\u0a55\u0a58\3\2\2\2\u0a56\u0a54\3"+
		"\2\2\2\u0a56\u0a57\3\2\2\2\u0a57\u00ff\3\2\2\2\u0a58\u0a56\3\2\2\2\u0a59"+
		"\u0a5a\5\u00ceh\2\u0a5a\u0a5b\7\u00e6\2\2\u0a5b\u0a5c\7\u00b2\2\2\u0a5c"+
		"\u0a5d\7\u00e6\2\2\u0a5d\u0a5f\3\2\2\2\u0a5e\u0a59\3\2\2\2\u0a5e\u0a5f"+
		"\3\2\2\2\u0a5f\u0a60\3\2\2\2\u0a60\u0a61\5\u00ceh\2\u0a61\u0101\3\2\2"+
		"\2\u0a62\u0a65\7\u00e7\2\2\u0a63\u0a65\5\u011e\u0090\2\u0a64\u0a62\3\2"+
		"\2\2\u0a64\u0a63\3\2\2\2\u0a65\u0a66\3\2\2\2\u0a66\u0a64\3\2\2\2\u0a66"+
		"\u0a67\3\2\2\2\u0a67\u0103\3\2\2\2\u0a68\u0a6a\7\22\2\2\u0a69\u0a6b\7"+
		"\u00e6\2\2\u0a6a\u0a69\3\2\2\2\u0a6a\u0a6b\3\2\2\2\u0a6b\u0a6e\3\2\2\2"+
		"\u0a6c\u0a6d\7w\2\2\u0a6d\u0a6f\7\u00e6\2\2\u0a6e\u0a6c\3\2\2\2\u0a6e"+
		"\u0a6f\3\2\2\2\u0a6f\u0a70\3\2\2\2\u0a70\u0a75\5\u0118\u008d\2\u0a71\u0a73"+
		"\7\u00e6\2\2\u0a72\u0a71\3\2\2\2\u0a72\u0a73\3\2\2\2\u0a73\u0a74\3\2\2"+
		"\2\u0a74\u0a76\5\u0110\u0089\2\u0a75\u0a72\3\2\2\2\u0a75\u0a76\3\2\2\2"+
		"\u0a76\u0105\3\2\2\2\u0a77\u0a78\t\16\2\2\u0a78\u0107\3\2\2\2\u0a79\u0a7e"+
		"\7\u00e7\2\2\u0a7a\u0a7d\5\u011e\u0090\2\u0a7b\u0a7d\7\u00e7\2\2\u0a7c"+
		"\u0a7a\3\2\2\2\u0a7c\u0a7b\3\2\2\2\u0a7d\u0a80\3\2\2\2\u0a7e\u0a7c\3\2"+
		"\2\2\u0a7e\u0a7f\3\2\2\2\u0a7f\u0a89\3\2\2\2\u0a80\u0a7e\3\2\2\2\u0a81"+
		"\u0a84\5\u011e\u0090\2\u0a82\u0a85\5\u011e\u0090\2\u0a83\u0a85\7\u00e7"+
		"\2\2\u0a84\u0a82\3\2\2\2\u0a84\u0a83\3\2\2\2\u0a85\u0a86\3\2\2\2\u0a86"+
		"\u0a84\3\2\2\2\u0a86\u0a87\3\2\2\2\u0a87\u0a89\3\2\2\2\u0a88\u0a79\3\2"+
		"\2\2\u0a88\u0a81\3\2\2\2\u0a89\u0109\3\2\2\2\u0a8a\u0a8b\t\17\2\2\u0a8b"+
		"\u010b\3\2\2\2\u0a8c\u0a8e\7\u00ac\2\2\u0a8d\u0a8f\7\u00e6\2\2\u0a8e\u0a8d"+
		"\3\2\2\2\u0a8e\u0a8f\3\2\2\2\u0a8f\u0a90\3\2\2\2\u0a90\u0a92\7\u00d0\2"+
		"\2\u0a91\u0a93\7\u00e6\2\2\u0a92\u0a91\3\2\2\2\u0a92\u0a93\3\2\2\2\u0a93"+
		"\u0a96\3\2\2\2\u0a94\u0a97\5\u0116\u008c\2\u0a95\u0a97\5\u0102\u0082\2"+
		"\u0a96\u0a94\3\2\2\2\u0a96\u0a95\3\2\2\2\u0a97\u010d\3\2\2\2\u0a98\u0a9d"+
		"\5\u0102\u0082\2\u0a99\u0a9a\7\5\2\2\u0a9a\u0a9c\5\u0102\u0082\2\u0a9b"+
		"\u0a99\3\2\2\2\u0a9c\u0a9f\3\2\2\2\u0a9d\u0a9b\3\2\2\2\u0a9d\u0a9e\3\2"+
		"\2\2\u0a9e\u010f\3\2\2\2\u0a9f\u0a9d\3\2\2\2\u0aa0\u0aa2\7\u00d0\2\2\u0aa1"+
		"\u0aa3\7\u00e6\2\2\u0aa2\u0aa1\3\2\2\2\u0aa2\u0aa3\3\2\2\2\u0aa3\u0aa6"+
		"\3\2\2\2\u0aa4\u0aa7\7\u00dc\2\2\u0aa5\u0aa7\5\u0102\u0082\2\u0aa6\u0aa4"+
		"\3\2\2\2\u0aa6\u0aa5\3\2\2\2\u0aa7\u0111\3\2\2\2\u0aa8\u0ab1\5\u0108\u0085"+
		"\2\u0aa9\u0aab\7\u00e6\2\2\u0aaa\u0aa9\3\2\2\2\u0aaa\u0aab\3\2\2\2\u0aab"+
		"\u0aac\3\2\2\2\u0aac\u0aae\7\u00ce\2\2\u0aad\u0aaf\7\u00e6\2\2\u0aae\u0aad"+
		"\3\2\2\2\u0aae\u0aaf\3\2\2\2\u0aaf\u0ab0\3\2\2\2\u0ab0\u0ab2\5\u0108\u0085"+
		"\2\u0ab1\u0aaa\3\2\2\2\u0ab1\u0ab2\3\2\2\2\u0ab2\u0113\3\2\2\2\u0ab3\u0ab4"+
		"\5\u0102\u0082\2\u0ab4\u0ab5\7\u00e4\2\2\u0ab5\u0115\3\2\2\2\u0ab6\u0ab7"+
		"\t\20\2\2\u0ab7\u0117\3\2\2\2\u0ab8\u0abc\5\u010c\u0087\2\u0ab9\u0abc"+
		"\5\u0106\u0084\2\u0aba\u0abc\5\u010e\u0088\2\u0abb\u0ab8\3\2\2\2\u0abb"+
		"\u0ab9\3\2\2\2\u0abb\u0aba\3\2\2\2\u0abc\u0ac5\3\2\2\2\u0abd\u0abf\7\u00e6"+
		"\2\2\u0abe\u0abd\3\2\2\2\u0abe\u0abf\3\2\2\2\u0abf\u0ac0\3\2\2\2\u0ac0"+
		"\u0ac2\7\u00cc\2\2\u0ac1\u0ac3\7\u00e6\2\2\u0ac2\u0ac1\3\2\2\2\u0ac2\u0ac3"+
		"\3\2\2\2\u0ac3\u0ac4\3\2\2\2\u0ac4\u0ac6\7\u00d5\2\2\u0ac5\u0abe\3\2\2"+
		"\2\u0ac5\u0ac6\3\2\2\2\u0ac6\u0119\3\2\2\2\u0ac7\u0ac8\t\21\2\2\u0ac8"+
		"\u011b\3\2\2\2\u0ac9\u0aca\t\22\2\2\u0aca\u011d\3\2\2\2\u0acb\u0acc\t"+
		"\23\2\2\u0acc\u011f\3\2\2\2\u0acd\u0ace\7\u00e1\2\2\u0ace\u0121\3\2\2"+
		"\2\u0acf\u0ad0\7\u00e2\2\2\u0ad0\u0123\3\2\2\2\u0ad1\u0ad3\7\u00e6\2\2"+
		"\u0ad2\u0ad1\3\2\2\2\u0ad2\u0ad3\3\2\2\2\u0ad3\u0ad7\3\2\2\2\u0ad4\u0ad8"+
		"\7\u00e0\2\2\u0ad5\u0ad8\5\u0122\u0092\2\u0ad6\u0ad8\5\u0120\u0091\2\u0ad7"+
		"\u0ad4\3\2\2\2\u0ad7\u0ad5\3\2\2\2\u0ad7\u0ad6\3\2\2\2\u0ad8\u0ada\3\2"+
		"\2\2\u0ad9\u0adb\7\u00e6\2\2\u0ada\u0ad9\3\2\2\2\u0ada\u0adb\3\2\2\2\u0adb"+
		"\u0125\3\2\2\2\u0adc\u0ae5\5\u0124\u0093\2\u0add\u0adf\7\u00e6\2\2\u0ade"+
		"\u0add\3\2\2\2\u0ade\u0adf\3\2\2\2\u0adf\u0ae0\3\2\2\2\u0ae0\u0ae2\7\u00e4"+
		"\2\2\u0ae1\u0ae3\7\u00e6\2\2\u0ae2\u0ae1\3\2\2\2\u0ae2\u0ae3\3\2\2\2\u0ae3"+
		"\u0ae5\3\2\2\2\u0ae4\u0adc\3\2\2\2\u0ae4\u0ade\3\2\2\2\u0ae5\u0ae6\3\2"+
		"\2\2\u0ae6\u0ae4\3\2\2\2\u0ae6\u0ae7\3\2\2\2\u0ae7\u0127\3\2\2\2\u01dc"+
		"\u012c\u0131\u0138\u013b\u013e\u0143\u0147\u014c\u0150\u0155\u0159\u015e"+
		"\u0162\u016e\u0174\u017a\u017e\u0184\u018b\u018f\u0195\u019b\u01a1\u01ac"+
		"\u01b8\u01bc\u01c2\u01c8\u01ce\u01d7\u01dd\u01e1\u01e5\u01e9\u01ee\u01f7"+
		"\u023d\u0271\u0277\u027b\u027e\u028e\u0292\u0297\u029a\u029f\u02a5\u02a9"+
		"\u02ae\u02b3\u02b7\u02ba\u02be\u02c4\u02c8\u02cf\u02d5\u02d9\u02dc\u02e1"+
		"\u02eb\u02ee\u02f1\u02f5\u02fb\u02ff\u0304\u030b\u030f\u0313\u0317\u031a"+
		"\u031f\u032a\u0337\u033e\u0347\u034e\u0352\u0355\u0364\u036a\u0374\u0378"+
		"\u0382\u038a\u038f\u0395\u0399\u039c\u03a0\u03ab\u03af\u03b4\u03b9\u03bd"+
		"\u03c1\u03c5\u03c8\u03cb\u03ce\u03d1\u03d5\u03dc\u03e0\u03e4\u03e8\u03ed"+
		"\u03f0\u03f3\u03f6\u03f9\u03fc\u0401\u0405\u040d\u0411\u0414\u0417\u041b"+
		"\u0432\u0438\u043c\u0440\u0449\u0454\u0459\u0463\u0467\u046c\u0474\u0478"+
		"\u047c\u0484\u0488\u0494\u0498\u049f\u04a1\u04a7\u04ab\u04b1\u04b5\u04b9"+
		"\u04c1\u04c5\u04cb\u04d4\u04d6\u04db\u04e4\u04e6\u04ee\u04f0\u04f5\u04f9"+
		"\u04fd\u0501\u0505\u0509\u050c\u050f\u0513\u0517\u052f\u0539\u053d\u0542"+
		"\u054d\u0551\u0556\u0564\u0568\u0571\u0575\u0578\u057c\u0580\u0583\u0587"+
		"\u058b\u058e\u0592\u0595\u0599\u059b\u05a0\u05a4\u05a8\u05ac\u05ae\u05b4"+
		"\u05b8\u05bb\u05c0\u05c4\u05ca\u05cd\u05d0\u05d4\u05d8\u05df\u05e3\u05e9"+
		"\u05ec\u05f0\u05f7\u05fb\u0601\u0604\u0608\u0610\u0614\u0617\u061a\u061e"+
		"\u0626\u062a\u062e\u0630\u0633\u0638\u063e\u0642\u0646\u064b\u0650\u0654"+
		"\u0658\u065d\u0665\u0667\u0673\u0677\u067f\u0683\u068b\u068f\u0693\u0697"+
		"\u069b\u069f\u06a7\u06ab\u06b8\u06bf\u06c3\u06ce\u06d5\u06da\u06de\u06e3"+
		"\u06e6\u06ec\u06f0\u06f3\u06f9\u06fd\u0705\u0709\u0712\u0716\u071a\u071e"+
		"\u0721\u0725\u072b\u072f\u0736\u073f\u0746\u074a\u074d\u0750\u0753\u0769"+
		"\u076d\u0774\u0776\u077f\u0784\u0789\u078e\u0791\u0795\u0799\u079e\u07a2"+
		"\u07a7\u07ab\u07b0\u07b4\u07b9\u07bd\u07c2\u07c6\u07cb\u07cf\u07d4\u07d8"+
		"\u07dd\u07e1\u07e6\u07ea\u07ef\u07f3\u07f8\u07fc\u0801\u0805\u080a\u080e"+
		"\u0813\u0817\u081c\u0820\u0825\u0829\u082e\u0832\u0837\u083b\u083e\u0840"+
		"\u0848\u084c\u0850\u0855\u085c\u0862\u0867\u086c\u0871\u0874\u0878\u087c"+
		"\u0881\u0885\u088a\u088e\u0893\u0897\u089c\u08a0\u08a5\u08a9\u08ae\u08b2"+
		"\u08b7\u08bb\u08c0\u08c4\u08c9\u08cd\u08d2\u08d6\u08db\u08df\u08e4\u08e8"+
		"\u08ed\u08f1\u08f6\u08fa\u08ff\u0903\u0908\u090c\u0911\u0915\u091a\u091e"+
		"\u0923\u0927\u092a\u092c\u0932\u0937\u093d\u0941\u0946\u094b\u094f\u0953"+
		"\u0955\u0959\u095b\u095e\u0962\u0969\u0971\u0975\u097f\u0983\u098b\u098f"+
		"\u0992\u0995\u09a0\u09a6\u09ab\u09af\u09b5\u09b8\u09bb\u09be\u09c1\u09c5"+
		"\u09ca\u09ce\u09d3\u09d6\u09da\u09de\u09e5\u09e9\u09eb\u09f1\u09f5\u09f9"+
		"\u09fe\u0a01\u0a04\u0a0a\u0a0e\u0a12\u0a16\u0a19\u0a1d\u0a20\u0a23\u0a26"+
		"\u0a29\u0a2c\u0a30\u0a36\u0a3a\u0a3f\u0a47\u0a4d\u0a51\u0a56\u0a5e\u0a64"+
		"\u0a66\u0a6a\u0a6e\u0a72\u0a75\u0a7c\u0a7e\u0a84\u0a86\u0a88\u0a8e\u0a92"+
		"\u0a96\u0a9d\u0aa2\u0aa6\u0aaa\u0aae\u0ab1\u0abb\u0abe\u0ac2\u0ac5\u0ad2"+
		"\u0ad7\u0ada\u0ade\u0ae2\u0ae4\u0ae6";
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