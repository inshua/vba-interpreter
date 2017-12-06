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
		RULE_moduleConfigElement = 4, RULE_controlDeclaration = 5, RULE_moduleAttributes = 6, 
		RULE_moduleDeclarations = 7, RULE_moduleOption = 8, RULE_moduleDeclarationsElement = 9, 
		RULE_macroStmt = 10, RULE_moduleBody = 11, RULE_moduleBodyElement = 12, 
		RULE_attributeStmt = 13, RULE_block = 14, RULE_blockStmt = 15, RULE_evalStmt = 16, 
		RULE_appactivateStmt = 17, RULE_beepStmt = 18, RULE_chdirStmt = 19, RULE_chdriveStmt = 20, 
		RULE_closeStmt = 21, RULE_constStmt = 22, RULE_constSubStmt = 23, RULE_dateStmt = 24, 
		RULE_declareStmt = 25, RULE_deftypeStmt = 26, RULE_deleteSettingStmt = 27, 
		RULE_doLoopStmt = 28, RULE_endStmt = 29, RULE_enumerationStmt = 30, RULE_enumerationStmt_Constant = 31, 
		RULE_eraseStmt = 32, RULE_errorStmt = 33, RULE_eventStmt = 34, RULE_exitStmt = 35, 
		RULE_filecopyStmt = 36, RULE_forEachStmt = 37, RULE_forNextStmt = 38, 
		RULE_functionStmt = 39, RULE_ruleStmt = 40, RULE_getStmt = 41, RULE_goSubStmt = 42, 
		RULE_goToStmt = 43, RULE_ifThenElseStmt = 44, RULE_ifBlockStmt = 45, RULE_ifConditionStmt = 46, 
		RULE_ifElseIfBlockStmt = 47, RULE_ifElseBlockStmt = 48, RULE_implementsStmt = 49, 
		RULE_inputStmt = 50, RULE_killStmt = 51, RULE_letStmt = 52, RULE_lineInputStmt = 53, 
		RULE_loadStmt = 54, RULE_lockStmt = 55, RULE_lsetStmt = 56, RULE_macroConstStmt = 57, 
		RULE_macroIfThenElseStmt = 58, RULE_macroIfBlockStmt = 59, RULE_macroElseIfBlockStmt = 60, 
		RULE_macroElseBlockStmt = 61, RULE_midStmt = 62, RULE_mkdirStmt = 63, 
		RULE_nameStmt = 64, RULE_onErrorStmt = 65, RULE_onGoToStmt = 66, RULE_onGoSubStmt = 67, 
		RULE_openStmt = 68, RULE_outputList = 69, RULE_outputList_Expression = 70, 
		RULE_printStmt = 71, RULE_propertyGetStmt = 72, RULE_propertySetStmt = 73, 
		RULE_propertyLetStmt = 74, RULE_putStmt = 75, RULE_raiseEventStmt = 76, 
		RULE_randomizeStmt = 77, RULE_redimStmt = 78, RULE_redimSubStmt = 79, 
		RULE_resetStmt = 80, RULE_resumeStmt = 81, RULE_returnStmt = 82, RULE_rmdirStmt = 83, 
		RULE_rsetStmt = 84, RULE_savepictureStmt = 85, RULE_saveSettingStmt = 86, 
		RULE_seekStmt = 87, RULE_selectCaseStmt = 88, RULE_sC_Selection = 89, 
		RULE_sC_Case = 90, RULE_sC_Cond = 91, RULE_sendkeysStmt = 92, RULE_setattrStmt = 93, 
		RULE_setStmt = 94, RULE_stopStmt = 95, RULE_subStmt = 96, RULE_timeStmt = 97, 
		RULE_typeStmt = 98, RULE_typeStmt_Element = 99, RULE_typeOfIsStmt = 100, 
		RULE_unloadStmt = 101, RULE_unlockStmt = 102, RULE_constValueExpr = 103, 
		RULE_valueStmt = 104, RULE_variableStmt = 105, RULE_variableListStmt = 106, 
		RULE_variableSubStmt = 107, RULE_whileWendStmt = 108, RULE_widthStmt = 109, 
		RULE_withStmt = 110, RULE_writeStmt = 111, RULE_fileNumber = 112, RULE_explicitCallStmt = 113, 
		RULE_implicitCallStmt_InBlock = 114, RULE_implicitCallStmt_InStmt = 115, 
		RULE_iCS_startElement = 116, RULE_iCS_followElement = 117, RULE_memberCall = 118, 
		RULE_dictionaryCall = 119, RULE_argsCall = 120, RULE_argCall = 121, RULE_argList = 122, 
		RULE_arg = 123, RULE_argDefaultValue = 124, RULE_subscripts = 125, RULE_subscript = 126, 
		RULE_constSubscripts = 127, RULE_constSubscript = 128, RULE_ambiguousIdentifier = 129, 
		RULE_asTypeClause = 130, RULE_baseType = 131, RULE_certainIdentifier = 132, 
		RULE_comparisonOperator = 133, RULE_fixedSizeString = 134, RULE_complexType = 135, 
		RULE_fieldLength = 136, RULE_letterrange = 137, RULE_lineLabel = 138, 
		RULE_literal = 139, RULE_type = 140, RULE_typeHint = 141, RULE_visibility = 142, 
		RULE_ambiguousKeyword = 143, RULE_remComment = 144, RULE_comment = 145, 
		RULE_endOfLine = 146, RULE_endOfStatement = 147;
	public static final String[] ruleNames = {
		"startRule", "module", "moduleHeader", "moduleConfig", "moduleConfigElement", 
		"controlDeclaration", "moduleAttributes", "moduleDeclarations", "moduleOption", 
		"moduleDeclarationsElement", "macroStmt", "moduleBody", "moduleBodyElement", 
		"attributeStmt", "block", "blockStmt", "evalStmt", "appactivateStmt", 
		"beepStmt", "chdirStmt", "chdriveStmt", "closeStmt", "constStmt", "constSubStmt", 
		"dateStmt", "declareStmt", "deftypeStmt", "deleteSettingStmt", "doLoopStmt", 
		"endStmt", "enumerationStmt", "enumerationStmt_Constant", "eraseStmt", 
		"errorStmt", "eventStmt", "exitStmt", "filecopyStmt", "forEachStmt", "forNextStmt", 
		"functionStmt", "ruleStmt", "getStmt", "goSubStmt", "goToStmt", "ifThenElseStmt", 
		"ifBlockStmt", "ifConditionStmt", "ifElseIfBlockStmt", "ifElseBlockStmt", 
		"implementsStmt", "inputStmt", "killStmt", "letStmt", "lineInputStmt", 
		"loadStmt", "lockStmt", "lsetStmt", "macroConstStmt", "macroIfThenElseStmt", 
		"macroIfBlockStmt", "macroElseIfBlockStmt", "macroElseBlockStmt", "midStmt", 
		"mkdirStmt", "nameStmt", "onErrorStmt", "onGoToStmt", "onGoSubStmt", "openStmt", 
		"outputList", "outputList_Expression", "printStmt", "propertyGetStmt", 
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
			setState(296);
			module();
			setState(297);
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
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(299);
				match(WS);
				}
				break;
			}
			setState(305);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(302);
					endOfLine();
					}
					} 
				}
				setState(307);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(315);
			_la = _input.LA(1);
			if (_la==VERSION) {
				{
				setState(308);
				moduleHeader();
				setState(312);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(309);
						endOfLine();
						}
						} 
					}
					setState(314);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				}
			}

			setState(324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(317);
				controlDeclaration();
				setState(321);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				}
				break;
			}
			setState(327);
			_la = _input.LA(1);
			if (_la==BEGIN) {
				{
				setState(326);
				moduleConfig();
				}
			}

			setState(332);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(329);
					endOfLine();
					}
					} 
				}
				setState(334);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(335);
				moduleAttributes();
				}
				break;
			}
			setState(341);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(338);
					endOfLine();
					}
					} 
				}
				setState(343);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(344);
				moduleDeclarations();
				}
				break;
			}
			setState(350);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(347);
					endOfLine();
					}
					} 
				}
				setState(352);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(354);
			_la = _input.LA(1);
			if (((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (FRIEND - 77)) | (1L << (FUNCTION - 77)) | (1L << (RULE - 77)) | (1L << (GLOBAL - 77)) | (1L << (PRIVATE - 77)) | (1L << (PROPERTY_GET - 77)) | (1L << (PROPERTY_LET - 77)) | (1L << (PROPERTY_SET - 77)))) != 0) || ((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & ((1L << (PUBLIC - 141)) | (1L << (STATIC - 141)) | (1L << (SUB - 141)))) != 0)) {
				{
				setState(353);
				moduleBody();
				}
			}

			setState(359);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(356);
					endOfLine();
					}
					} 
				}
				setState(361);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(363);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(362);
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
			setState(365);
			match(VERSION);
			setState(366);
			match(WS);
			setState(367);
			match(DOUBLELITERAL);
			setState(370);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(368);
				match(WS);
				setState(369);
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
			setState(372);
			match(BEGIN);
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 222)) & ~0x3f) == 0 && ((1L << (_la - 222)) & ((1L << (NEWLINE - 222)) | (1L << (REMCOMMENT - 222)) | (1L << (COMMENT - 222)) | (1L << (WS - 222)))) != 0)) {
				{
				{
				setState(373);
				endOfLine();
				}
				}
				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(380); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(379);
				moduleConfigElement();
				}
				}
				setState(382); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ENUM - 64)) | (1L << (EQV - 64)) | (1L << (ERASE - 64)) | (1L << (ERROR - 64)) | (1L << (EVENT - 64)) | (1L << (FALSE - 64)) | (1L << (FILECOPY - 64)) | (1L << (FRIEND - 64)) | (1L << (FOR - 64)) | (1L << (FUNCTION - 64)) | (1L << (GET - 64)) | (1L << (GLOBAL - 64)) | (1L << (GOSUB - 64)) | (1L << (GOTO - 64)) | (1L << (IF - 64)) | (1L << (IMP - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (IN - 64)) | (1L << (INPUT - 64)) | (1L << (IS - 64)) | (1L << (INTEGER - 64)) | (1L << (KILL - 64)) | (1L << (LOAD - 64)) | (1L << (LOCK - 64)) | (1L << (LONG - 64)) | (1L << (LOOP - 64)) | (1L << (LEN - 64)) | (1L << (LET - 64)) | (1L << (LIB - 64)) | (1L << (LIKE - 64)) | (1L << (LSET - 64)) | (1L << (ME - 64)) | (1L << (MID - 64)) | (1L << (MKDIR - 64)) | (1L << (MOD - 64)) | (1L << (NAME - 64)) | (1L << (NEXT - 64)) | (1L << (NEW - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (EMPTY - 64)) | (1L << (ON - 64)) | (1L << (OPEN - 64)) | (1L << (OPTIONAL - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (OR - 131)) | (1L << (OUTPUT - 131)) | (1L << (PARAMARRAY - 131)) | (1L << (PRESERVE - 131)) | (1L << (PRINT - 131)) | (1L << (PRIVATE - 131)) | (1L << (PUBLIC - 131)) | (1L << (PUT - 131)) | (1L << (RANDOM - 131)) | (1L << (RANDOMIZE - 131)) | (1L << (RAISEEVENT - 131)) | (1L << (READ - 131)) | (1L << (REDIM - 131)) | (1L << (REM - 131)) | (1L << (RESET - 131)) | (1L << (RESUME - 131)) | (1L << (RETURN - 131)) | (1L << (RMDIR - 131)) | (1L << (RSET - 131)) | (1L << (SAVEPICTURE - 131)) | (1L << (SAVESETTING - 131)) | (1L << (SEEK - 131)) | (1L << (SELECT - 131)) | (1L << (SENDKEYS - 131)) | (1L << (SET - 131)) | (1L << (SETATTR - 131)) | (1L << (SHARED - 131)) | (1L << (SINGLE - 131)) | (1L << (SPC - 131)) | (1L << (STATIC - 131)) | (1L << (STEP - 131)) | (1L << (STRING - 131)) | (1L << (SUB - 131)) | (1L << (TAB - 131)) | (1L << (TEXT - 131)) | (1L << (THEN - 131)) | (1L << (TIME - 131)) | (1L << (TO - 131)) | (1L << (TRUE - 131)) | (1L << (TYPE - 131)) | (1L << (TYPEOF - 131)) | (1L << (UNLOAD - 131)) | (1L << (UNLOCK - 131)) | (1L << (UNTIL - 131)) | (1L << (VARIANT - 131)) | (1L << (VERSION - 131)) | (1L << (WEND - 131)) | (1L << (WHILE - 131)) | (1L << (WIDTH - 131)) | (1L << (WITH - 131)) | (1L << (WITHEVENTS - 131)) | (1L << (WRITE - 131)) | (1L << (XOR - 131)))) != 0) || _la==IDENTIFIER );
			setState(384);
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
			setState(386);
			ambiguousIdentifier();
			setState(388);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(387);
				match(WS);
				}
			}

			setState(390);
			match(EQ);
			setState(392);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(391);
				match(WS);
				}
			}

			setState(394);
			literal();
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 222)) & ~0x3f) == 0 && ((1L << (_la - 222)) & ((1L << (NEWLINE - 222)) | (1L << (REMCOMMENT - 222)) | (1L << (COMMENT - 222)) | (1L << (WS - 222)))) != 0)) {
				{
				{
				setState(395);
				endOfLine();
				}
				}
				setState(400);
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
		enterRule(_localctx, 10, RULE_controlDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			match(BEGIN);
			setState(402);
			match(WS);
			setState(403);
			type();
			setState(404);
			match(WS);
			setState(405);
			ambiguousIdentifier();
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 222)) & ~0x3f) == 0 && ((1L << (_la - 222)) & ((1L << (NEWLINE - 222)) | (1L << (REMCOMMENT - 222)) | (1L << (COMMENT - 222)) | (1L << (WS - 222)))) != 0)) {
				{
				{
				setState(406);
				endOfLine();
				}
				}
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(413); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(412);
					moduleConfigElement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(415); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BEGIN) {
				{
				{
				setState(417);
				controlDeclaration();
				}
				}
				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(423);
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
		enterRule(_localctx, 12, RULE_moduleAttributes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(431); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(425);
					attributeStmt();
					setState(427); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(426);
							endOfLine();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(429); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(433); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
		enterRule(_localctx, 14, RULE_moduleDeclarations);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			moduleDeclarationsElement();
			setState(445);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(437); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(436);
							endOfLine();
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
					setState(441);
					moduleDeclarationsElement();
					}
					} 
				}
				setState(447);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(451);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(448);
					endOfLine();
					}
					} 
				}
				setState(453);
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
		enterRule(_localctx, 16, RULE_moduleOption);
		int _la;
		try {
			setState(462);
			switch (_input.LA(1)) {
			case OPTION_BASE:
				_localctx = new OptionBaseStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(454);
				match(OPTION_BASE);
				setState(455);
				match(WS);
				setState(456);
				match(SHORTLITERAL);
				}
				break;
			case OPTION_COMPARE:
				_localctx = new OptionCompareStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(457);
				match(OPTION_COMPARE);
				setState(458);
				match(WS);
				setState(459);
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
				setState(460);
				match(OPTION_EXPLICIT);
				}
				break;
			case OPTION_PRIVATE_MODULE:
				_localctx = new OptionPrivateModuleStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(461);
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
		enterRule(_localctx, 18, RULE_moduleDeclarationsElement);
		try {
			setState(474);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(464);
				comment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(465);
				declareStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(466);
				enumerationStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(467);
				eventStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(468);
				constStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(469);
				implementsStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(470);
				variableStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(471);
				moduleOption();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(472);
				typeStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(473);
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
		enterRule(_localctx, 20, RULE_macroStmt);
		try {
			setState(478);
			switch (_input.LA(1)) {
			case MACRO_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(476);
				macroConstStmt();
				}
				break;
			case MACRO_IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(477);
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
		enterRule(_localctx, 22, RULE_moduleBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			moduleBodyElement();
			setState(490);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(482); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(481);
						endOfLine();
						}
						}
						setState(484); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 222)) & ~0x3f) == 0 && ((1L << (_la - 222)) & ((1L << (NEWLINE - 222)) | (1L << (REMCOMMENT - 222)) | (1L << (COMMENT - 222)) | (1L << (WS - 222)))) != 0) );
					setState(486);
					moduleBodyElement();
					}
					} 
				}
				setState(492);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			setState(496);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(493);
					endOfLine();
					}
					} 
				}
				setState(498);
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
		enterRule(_localctx, 24, RULE_moduleBodyElement);
		try {
			setState(505);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(499);
				functionStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(500);
				propertyGetStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(501);
				propertySetStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(502);
				propertyLetStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(503);
				subStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(504);
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
		enterRule(_localctx, 26, RULE_attributeStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			match(ATTRIBUTE);
			setState(508);
			match(WS);
			setState(509);
			implicitCallStmt_InStmt();
			setState(511);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(510);
				match(WS);
				}
			}

			setState(513);
			match(EQ);
			setState(515);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(514);
				match(WS);
				}
			}

			setState(517);
			literal();
			setState(528);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(519);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(518);
						match(WS);
						}
					}

					setState(521);
					match(T__0);
					setState(523);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(522);
						match(WS);
						}
					}

					setState(525);
					literal();
					}
					} 
				}
				setState(530);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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
		enterRule(_localctx, 28, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			blockStmt();
			setState(537);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(532);
					endOfStatement();
					setState(533);
					blockStmt();
					}
					} 
				}
				setState(539);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			}
			setState(540);
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
		enterRule(_localctx, 30, RULE_blockStmt);
		try {
			setState(606);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(542);
				lineLabel();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(543);
				midStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(544);
				appactivateStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(545);
				attributeStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(546);
				beepStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(547);
				chdirStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(548);
				chdriveStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(549);
				closeStmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(550);
				constStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(551);
				dateStmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(552);
				deleteSettingStmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(553);
				deftypeStmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(554);
				doLoopStmt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(555);
				endStmt();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(556);
				eraseStmt();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(557);
				errorStmt();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(558);
				exitStmt();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(559);
				explicitCallStmt();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(560);
				filecopyStmt();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(561);
				forEachStmt();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(562);
				forNextStmt();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(563);
				getStmt();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(564);
				goSubStmt();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(565);
				goToStmt();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(566);
				ifThenElseStmt();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(567);
				inputStmt();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(568);
				killStmt();
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(569);
				letStmt();
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(570);
				lineInputStmt();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(571);
				loadStmt();
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(572);
				lockStmt();
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(573);
				lsetStmt();
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(574);
				mkdirStmt();
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(575);
				nameStmt();
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(576);
				onErrorStmt();
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(577);
				onGoToStmt();
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(578);
				onGoSubStmt();
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(579);
				openStmt();
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(580);
				printStmt();
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(581);
				putStmt();
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(582);
				raiseEventStmt();
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(583);
				redimStmt();
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(584);
				resetStmt();
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(585);
				resumeStmt();
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 45);
				{
				setState(586);
				returnStmt();
				}
				break;
			case 46:
				enterOuterAlt(_localctx, 46);
				{
				setState(587);
				rmdirStmt();
				}
				break;
			case 47:
				enterOuterAlt(_localctx, 47);
				{
				setState(588);
				rsetStmt();
				}
				break;
			case 48:
				enterOuterAlt(_localctx, 48);
				{
				setState(589);
				savepictureStmt();
				}
				break;
			case 49:
				enterOuterAlt(_localctx, 49);
				{
				setState(590);
				saveSettingStmt();
				}
				break;
			case 50:
				enterOuterAlt(_localctx, 50);
				{
				setState(591);
				seekStmt();
				}
				break;
			case 51:
				enterOuterAlt(_localctx, 51);
				{
				setState(592);
				selectCaseStmt();
				}
				break;
			case 52:
				enterOuterAlt(_localctx, 52);
				{
				setState(593);
				sendkeysStmt();
				}
				break;
			case 53:
				enterOuterAlt(_localctx, 53);
				{
				setState(594);
				setattrStmt();
				}
				break;
			case 54:
				enterOuterAlt(_localctx, 54);
				{
				setState(595);
				setStmt();
				}
				break;
			case 55:
				enterOuterAlt(_localctx, 55);
				{
				setState(596);
				stopStmt();
				}
				break;
			case 56:
				enterOuterAlt(_localctx, 56);
				{
				setState(597);
				timeStmt();
				}
				break;
			case 57:
				enterOuterAlt(_localctx, 57);
				{
				setState(598);
				unloadStmt();
				}
				break;
			case 58:
				enterOuterAlt(_localctx, 58);
				{
				setState(599);
				unlockStmt();
				}
				break;
			case 59:
				enterOuterAlt(_localctx, 59);
				{
				setState(600);
				variableStmt();
				}
				break;
			case 60:
				enterOuterAlt(_localctx, 60);
				{
				setState(601);
				whileWendStmt();
				}
				break;
			case 61:
				enterOuterAlt(_localctx, 61);
				{
				setState(602);
				widthStmt();
				}
				break;
			case 62:
				enterOuterAlt(_localctx, 62);
				{
				setState(603);
				withStmt();
				}
				break;
			case 63:
				enterOuterAlt(_localctx, 63);
				{
				setState(604);
				writeStmt();
				}
				break;
			case 64:
				enterOuterAlt(_localctx, 64);
				{
				setState(605);
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
		enterRule(_localctx, 32, RULE_evalStmt);
		try {
			setState(657);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(609);
				appactivateStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(610);
				beepStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(611);
				chdirStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(612);
				chdriveStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(613);
				closeStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(614);
				dateStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(615);
				deleteSettingStmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(616);
				doLoopStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(617);
				endStmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(618);
				eraseStmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(619);
				explicitCallStmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(620);
				filecopyStmt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(621);
				forEachStmt();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(622);
				forNextStmt();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(623);
				getStmt();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(624);
				ifThenElseStmt();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(625);
				inputStmt();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(626);
				killStmt();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(627);
				letStmt();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(628);
				lineInputStmt();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(629);
				loadStmt();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(630);
				lockStmt();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(631);
				lsetStmt();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(632);
				midStmt();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(633);
				mkdirStmt();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(634);
				nameStmt();
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(635);
				openStmt();
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(636);
				printStmt();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(637);
				putStmt();
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(638);
				raiseEventStmt();
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(639);
				redimStmt();
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(640);
				resetStmt();
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(641);
				rmdirStmt();
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(642);
				rsetStmt();
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(643);
				savepictureStmt();
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(644);
				saveSettingStmt();
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(645);
				seekStmt();
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(646);
				selectCaseStmt();
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(647);
				sendkeysStmt();
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(648);
				setattrStmt();
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(649);
				setStmt();
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(650);
				timeStmt();
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(651);
				unloadStmt();
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 45);
				{
				setState(652);
				unlockStmt();
				}
				break;
			case 46:
				enterOuterAlt(_localctx, 46);
				{
				setState(653);
				whileWendStmt();
				}
				break;
			case 47:
				enterOuterAlt(_localctx, 47);
				{
				setState(654);
				widthStmt();
				}
				break;
			case 48:
				enterOuterAlt(_localctx, 48);
				{
				setState(655);
				valueStmt(0);
				}
				break;
			case 49:
				enterOuterAlt(_localctx, 49);
				{
				setState(656);
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
		enterRule(_localctx, 34, RULE_appactivateStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			match(APPACTIVATE);
			setState(660);
			match(WS);
			setState(661);
			valueStmt(0);
			setState(670);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(663);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(662);
					match(WS);
					}
				}

				setState(665);
				match(T__0);
				setState(667);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(666);
					match(WS);
					}
					break;
				}
				setState(669);
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
		enterRule(_localctx, 36, RULE_beepStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(672);
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
		enterRule(_localctx, 38, RULE_chdirStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			match(CHDIR);
			setState(675);
			match(WS);
			setState(676);
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
		enterRule(_localctx, 40, RULE_chdriveStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			match(CHDRIVE);
			setState(679);
			match(WS);
			setState(680);
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
		enterRule(_localctx, 42, RULE_closeStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(682);
			match(CLOSE);
			setState(698);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(683);
				match(WS);
				setState(684);
				fileNumber();
				setState(695);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(686);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(685);
							match(WS);
							}
						}

						setState(688);
						match(T__0);
						setState(690);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
						case 1:
							{
							setState(689);
							match(WS);
							}
							break;
						}
						setState(692);
						fileNumber();
						}
						} 
					}
					setState(697);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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
		enterRule(_localctx, 44, RULE_constStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			_la = _input.LA(1);
			if (((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (FRIEND - 77)) | (1L << (GLOBAL - 77)) | (1L << (PRIVATE - 77)))) != 0) || _la==PUBLIC) {
				{
				setState(700);
				visibility();
				setState(701);
				match(WS);
				}
			}

			setState(705);
			match(CONST);
			setState(706);
			match(WS);
			setState(707);
			constSubStmt();
			setState(718);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(709);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(708);
						match(WS);
						}
					}

					setState(711);
					match(T__0);
					setState(713);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(712);
						match(WS);
						}
					}

					setState(715);
					constSubStmt();
					}
					} 
				}
				setState(720);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
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
		enterRule(_localctx, 46, RULE_constSubStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(721);
			ambiguousIdentifier();
			setState(723);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0) || _la==AMPERSAND) {
				{
				setState(722);
				typeHint();
				}
			}

			setState(727);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(725);
				match(WS);
				setState(726);
				asTypeClause();
				}
				break;
			}
			setState(730);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(729);
				match(WS);
				}
			}

			setState(732);
			match(EQ);
			setState(734);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(733);
				match(WS);
				}
			}

			setState(736);
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
		enterRule(_localctx, 48, RULE_dateStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(738);
			match(DATE);
			setState(740);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(739);
				match(WS);
				}
			}

			setState(742);
			match(EQ);
			setState(744);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(743);
				match(WS);
				}
				break;
			}
			setState(746);
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
		enterRule(_localctx, 50, RULE_declareStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(751);
			_la = _input.LA(1);
			if (((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (FRIEND - 77)) | (1L << (GLOBAL - 77)) | (1L << (PRIVATE - 77)))) != 0) || _la==PUBLIC) {
				{
				setState(748);
				visibility();
				setState(749);
				match(WS);
				}
			}

			setState(753);
			match(DECLARE);
			setState(754);
			match(WS);
			setState(757);
			_la = _input.LA(1);
			if (_la==PTRSAFE) {
				{
				setState(755);
				match(PTRSAFE);
				setState(756);
				match(WS);
				}
			}

			setState(764);
			switch (_input.LA(1)) {
			case FUNCTION:
				{
				{
				setState(759);
				match(FUNCTION);
				setState(761);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0) || _la==AMPERSAND) {
					{
					setState(760);
					typeHint();
					}
				}

				}
				}
				break;
			case SUB:
				{
				setState(763);
				match(SUB);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(766);
			match(WS);
			setState(767);
			ambiguousIdentifier();
			setState(769);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0) || _la==AMPERSAND) {
				{
				setState(768);
				typeHint();
				}
			}

			setState(771);
			match(WS);
			setState(772);
			match(LIB);
			setState(773);
			match(WS);
			setState(774);
			match(STRINGLITERAL);
			setState(779);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(775);
				match(WS);
				setState(776);
				match(ALIAS);
				setState(777);
				match(WS);
				setState(778);
				match(STRINGLITERAL);
				}
				break;
			}
			setState(785);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(782);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(781);
					match(WS);
					}
				}

				setState(784);
				argList();
				}
				break;
			}
			setState(789);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(787);
				match(WS);
				setState(788);
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
		enterRule(_localctx, 52, RULE_deftypeStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(791);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(792);
			match(WS);
			setState(793);
			letterrange();
			setState(804);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(795);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(794);
						match(WS);
						}
					}

					setState(797);
					match(T__0);
					setState(799);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(798);
						match(WS);
						}
					}

					setState(801);
					letterrange();
					}
					} 
				}
				setState(806);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
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
		enterRule(_localctx, 54, RULE_deleteSettingStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807);
			match(DELETESETTING);
			setState(808);
			match(WS);
			setState(809);
			valueStmt(0);
			setState(811);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(810);
				match(WS);
				}
			}

			setState(813);
			match(T__0);
			setState(815);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(814);
				match(WS);
				}
				break;
			}
			setState(817);
			valueStmt(0);
			setState(826);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(819);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(818);
					match(WS);
					}
				}

				setState(821);
				match(T__0);
				setState(823);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(822);
					match(WS);
					}
					break;
				}
				setState(825);
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
		enterRule(_localctx, 56, RULE_doLoopStmt);
		int _la;
		try {
			setState(855);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(828);
				match(DO);
				setState(829);
				endOfStatement();
				setState(831);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
				case 1:
					{
					setState(830);
					block();
					}
					break;
				}
				setState(833);
				match(LOOP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(835);
				match(DO);
				setState(836);
				match(WS);
				setState(837);
				_la = _input.LA(1);
				if ( !(_la==UNTIL || _la==WHILE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(838);
				match(WS);
				setState(839);
				valueStmt(0);
				setState(840);
				endOfStatement();
				setState(842);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
				case 1:
					{
					setState(841);
					block();
					}
					break;
				}
				setState(844);
				match(LOOP);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(846);
				match(DO);
				setState(847);
				endOfStatement();
				setState(848);
				block();
				setState(849);
				match(LOOP);
				setState(850);
				match(WS);
				setState(851);
				_la = _input.LA(1);
				if ( !(_la==UNTIL || _la==WHILE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(852);
				match(WS);
				setState(853);
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
		enterRule(_localctx, 58, RULE_endStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(857);
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
		enterRule(_localctx, 60, RULE_enumerationStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(862);
			_la = _input.LA(1);
			if (((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (FRIEND - 77)) | (1L << (GLOBAL - 77)) | (1L << (PRIVATE - 77)))) != 0) || _la==PUBLIC) {
				{
				setState(859);
				visibility();
				setState(860);
				match(WS);
				}
			}

			setState(864);
			match(ENUM);
			setState(865);
			match(WS);
			setState(866);
			ambiguousIdentifier();
			setState(867);
			endOfStatement();
			setState(871);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ENUM - 64)) | (1L << (EQV - 64)) | (1L << (ERASE - 64)) | (1L << (ERROR - 64)) | (1L << (EVENT - 64)) | (1L << (FALSE - 64)) | (1L << (FILECOPY - 64)) | (1L << (FRIEND - 64)) | (1L << (FOR - 64)) | (1L << (FUNCTION - 64)) | (1L << (GET - 64)) | (1L << (GLOBAL - 64)) | (1L << (GOSUB - 64)) | (1L << (GOTO - 64)) | (1L << (IF - 64)) | (1L << (IMP - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (IN - 64)) | (1L << (INPUT - 64)) | (1L << (IS - 64)) | (1L << (INTEGER - 64)) | (1L << (KILL - 64)) | (1L << (LOAD - 64)) | (1L << (LOCK - 64)) | (1L << (LONG - 64)) | (1L << (LOOP - 64)) | (1L << (LEN - 64)) | (1L << (LET - 64)) | (1L << (LIB - 64)) | (1L << (LIKE - 64)) | (1L << (LSET - 64)) | (1L << (ME - 64)) | (1L << (MID - 64)) | (1L << (MKDIR - 64)) | (1L << (MOD - 64)) | (1L << (NAME - 64)) | (1L << (NEXT - 64)) | (1L << (NEW - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (EMPTY - 64)) | (1L << (ON - 64)) | (1L << (OPEN - 64)) | (1L << (OPTIONAL - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (OR - 131)) | (1L << (OUTPUT - 131)) | (1L << (PARAMARRAY - 131)) | (1L << (PRESERVE - 131)) | (1L << (PRINT - 131)) | (1L << (PRIVATE - 131)) | (1L << (PUBLIC - 131)) | (1L << (PUT - 131)) | (1L << (RANDOM - 131)) | (1L << (RANDOMIZE - 131)) | (1L << (RAISEEVENT - 131)) | (1L << (READ - 131)) | (1L << (REDIM - 131)) | (1L << (REM - 131)) | (1L << (RESET - 131)) | (1L << (RESUME - 131)) | (1L << (RETURN - 131)) | (1L << (RMDIR - 131)) | (1L << (RSET - 131)) | (1L << (SAVEPICTURE - 131)) | (1L << (SAVESETTING - 131)) | (1L << (SEEK - 131)) | (1L << (SELECT - 131)) | (1L << (SENDKEYS - 131)) | (1L << (SET - 131)) | (1L << (SETATTR - 131)) | (1L << (SHARED - 131)) | (1L << (SINGLE - 131)) | (1L << (SPC - 131)) | (1L << (STATIC - 131)) | (1L << (STEP - 131)) | (1L << (STRING - 131)) | (1L << (SUB - 131)) | (1L << (TAB - 131)) | (1L << (TEXT - 131)) | (1L << (THEN - 131)) | (1L << (TIME - 131)) | (1L << (TO - 131)) | (1L << (TRUE - 131)) | (1L << (TYPE - 131)) | (1L << (TYPEOF - 131)) | (1L << (UNLOAD - 131)) | (1L << (UNLOCK - 131)) | (1L << (UNTIL - 131)) | (1L << (VARIANT - 131)) | (1L << (VERSION - 131)) | (1L << (WEND - 131)) | (1L << (WHILE - 131)) | (1L << (WIDTH - 131)) | (1L << (WITH - 131)) | (1L << (WITHEVENTS - 131)) | (1L << (WRITE - 131)) | (1L << (XOR - 131)))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(868);
				enumerationStmt_Constant();
				}
				}
				setState(873);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(874);
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
		enterRule(_localctx, 62, RULE_enumerationStmt_Constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(876);
			ambiguousIdentifier();
			setState(885);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(878);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(877);
					match(WS);
					}
				}

				setState(880);
				match(EQ);
				setState(882);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(881);
					match(WS);
					}
				}

				setState(884);
				constValueExpr(0);
				}
				break;
			}
			setState(887);
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
		enterRule(_localctx, 64, RULE_eraseStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(889);
			match(ERASE);
			setState(890);
			match(WS);
			setState(891);
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
		enterRule(_localctx, 66, RULE_errorStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(893);
			match(ERROR);
			setState(894);
			match(WS);
			setState(895);
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
		enterRule(_localctx, 68, RULE_eventStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(900);
			_la = _input.LA(1);
			if (((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (FRIEND - 77)) | (1L << (GLOBAL - 77)) | (1L << (PRIVATE - 77)))) != 0) || _la==PUBLIC) {
				{
				setState(897);
				visibility();
				setState(898);
				match(WS);
				}
			}

			setState(902);
			match(EVENT);
			setState(903);
			match(WS);
			setState(904);
			ambiguousIdentifier();
			setState(906);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(905);
				match(WS);
				}
			}

			setState(908);
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
		enterRule(_localctx, 70, RULE_exitStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(910);
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
		enterRule(_localctx, 72, RULE_filecopyStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(912);
			match(FILECOPY);
			setState(913);
			match(WS);
			setState(914);
			valueStmt(0);
			setState(916);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(915);
				match(WS);
				}
			}

			setState(918);
			match(T__0);
			setState(920);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(919);
				match(WS);
				}
				break;
			}
			setState(922);
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
		enterRule(_localctx, 74, RULE_forEachStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(924);
			match(FOR);
			setState(925);
			match(WS);
			setState(926);
			match(EACH);
			setState(927);
			match(WS);
			setState(928);
			ambiguousIdentifier();
			setState(930);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0) || _la==AMPERSAND) {
				{
				setState(929);
				typeHint();
				}
			}

			setState(932);
			match(WS);
			setState(933);
			match(IN);
			setState(934);
			match(WS);
			setState(935);
			valueStmt(0);
			setState(936);
			endOfStatement();
			setState(938);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(937);
				block();
				}
				break;
			}
			setState(940);
			match(NEXT);
			setState(943);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				setState(941);
				match(WS);
				setState(942);
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
		enterRule(_localctx, 76, RULE_forNextStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(945);
			match(FOR);
			setState(946);
			match(WS);
			setState(947);
			ambiguousIdentifier();
			setState(949);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0) || _la==AMPERSAND) {
				{
				setState(948);
				typeHint();
				}
			}

			setState(953);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(951);
				match(WS);
				setState(952);
				asTypeClause();
				}
				break;
			}
			setState(956);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(955);
				match(WS);
				}
			}

			setState(958);
			match(EQ);
			setState(960);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				{
				setState(959);
				match(WS);
				}
				break;
			}
			setState(962);
			valueStmt(0);
			setState(963);
			match(WS);
			setState(964);
			match(TO);
			setState(965);
			match(WS);
			setState(966);
			valueStmt(0);
			setState(971);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				{
				setState(967);
				match(WS);
				setState(968);
				match(STEP);
				setState(969);
				match(WS);
				setState(970);
				valueStmt(0);
				}
				break;
			}
			setState(973);
			endOfStatement();
			setState(975);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(974);
				block();
				}
				break;
			}
			setState(977);
			match(NEXT);
			setState(980);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(978);
				match(WS);
				setState(979);
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
		enterRule(_localctx, 78, RULE_functionStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(985);
			_la = _input.LA(1);
			if (((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (FRIEND - 77)) | (1L << (GLOBAL - 77)) | (1L << (PRIVATE - 77)))) != 0) || _la==PUBLIC) {
				{
				setState(982);
				visibility();
				setState(983);
				match(WS);
				}
			}

			setState(989);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(987);
				match(STATIC);
				setState(988);
				match(WS);
				}
			}

			setState(991);
			match(FUNCTION);
			setState(993);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(992);
				match(WS);
				}
			}

			setState(995);
			ambiguousIdentifier();
			setState(997);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0) || _la==AMPERSAND) {
				{
				setState(996);
				typeHint();
				}
			}

			setState(1003);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				setState(1000);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(999);
					match(WS);
					}
				}

				setState(1002);
				argList();
				}
				break;
			}
			setState(1009);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
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
				asTypeClause();
				}
				break;
			}
			setState(1011);
			endOfStatement();
			setState(1013);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH) | (1L << END))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ENUM - 64)) | (1L << (EQV - 64)) | (1L << (ERASE - 64)) | (1L << (ERROR - 64)) | (1L << (EVENT - 64)) | (1L << (EXIT_DO - 64)) | (1L << (EXIT_FOR - 64)) | (1L << (EXIT_FUNCTION - 64)) | (1L << (EXIT_PROPERTY - 64)) | (1L << (EXIT_SUB - 64)) | (1L << (EXIT_RULE - 64)) | (1L << (FALSE - 64)) | (1L << (FILECOPY - 64)) | (1L << (FRIEND - 64)) | (1L << (FOR - 64)) | (1L << (FUNCTION - 64)) | (1L << (GET - 64)) | (1L << (GLOBAL - 64)) | (1L << (GOSUB - 64)) | (1L << (GOTO - 64)) | (1L << (IF - 64)) | (1L << (IMP - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (IN - 64)) | (1L << (INPUT - 64)) | (1L << (IS - 64)) | (1L << (INTEGER - 64)) | (1L << (KILL - 64)) | (1L << (LOAD - 64)) | (1L << (LOCK - 64)) | (1L << (LONG - 64)) | (1L << (LOOP - 64)) | (1L << (LEN - 64)) | (1L << (LET - 64)) | (1L << (LIB - 64)) | (1L << (LIKE - 64)) | (1L << (LINE_INPUT - 64)) | (1L << (LSET - 64)) | (1L << (ME - 64)) | (1L << (MID - 64)) | (1L << (MKDIR - 64)) | (1L << (MOD - 64)) | (1L << (NAME - 64)) | (1L << (NEXT - 64)) | (1L << (NEW - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (EMPTY - 64)) | (1L << (ON - 64)) | (1L << (ON_ERROR - 64)) | (1L << (ON_LOCAL_ERROR - 64)) | (1L << (OPEN - 64)) | (1L << (OPTIONAL - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (OR - 131)) | (1L << (OUTPUT - 131)) | (1L << (PARAMARRAY - 131)) | (1L << (PRESERVE - 131)) | (1L << (PRINT - 131)) | (1L << (PRIVATE - 131)) | (1L << (PUBLIC - 131)) | (1L << (PUT - 131)) | (1L << (RANDOM - 131)) | (1L << (RANDOMIZE - 131)) | (1L << (RAISEEVENT - 131)) | (1L << (READ - 131)) | (1L << (REDIM - 131)) | (1L << (REM - 131)) | (1L << (RESET - 131)) | (1L << (RESUME - 131)) | (1L << (RETURN - 131)) | (1L << (RMDIR - 131)) | (1L << (RSET - 131)) | (1L << (SAVEPICTURE - 131)) | (1L << (SAVESETTING - 131)) | (1L << (SEEK - 131)) | (1L << (SELECT - 131)) | (1L << (SENDKEYS - 131)) | (1L << (SET - 131)) | (1L << (SETATTR - 131)) | (1L << (SHARED - 131)) | (1L << (SINGLE - 131)) | (1L << (SPC - 131)) | (1L << (STATIC - 131)) | (1L << (STEP - 131)) | (1L << (STOP - 131)) | (1L << (STRING - 131)) | (1L << (SUB - 131)) | (1L << (TAB - 131)) | (1L << (TEXT - 131)) | (1L << (THEN - 131)) | (1L << (TIME - 131)) | (1L << (TO - 131)) | (1L << (TRUE - 131)) | (1L << (TYPE - 131)) | (1L << (TYPEOF - 131)) | (1L << (UNLOAD - 131)) | (1L << (UNLOCK - 131)) | (1L << (UNTIL - 131)) | (1L << (VARIANT - 131)) | (1L << (VERSION - 131)) | (1L << (WEND - 131)) | (1L << (WHILE - 131)) | (1L << (WIDTH - 131)) | (1L << (WITH - 131)) | (1L << (WITHEVENTS - 131)) | (1L << (WRITE - 131)) | (1L << (XOR - 131)))) != 0) || _la==WS || _la==IDENTIFIER) {
				{
				setState(1012);
				block();
				}
			}

			setState(1015);
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
		enterRule(_localctx, 80, RULE_ruleStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1020);
			_la = _input.LA(1);
			if (((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (FRIEND - 77)) | (1L << (GLOBAL - 77)) | (1L << (PRIVATE - 77)))) != 0) || _la==PUBLIC) {
				{
				setState(1017);
				visibility();
				setState(1018);
				match(WS);
				}
			}

			setState(1024);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(1022);
				match(STATIC);
				setState(1023);
				match(WS);
				}
			}

			setState(1026);
			match(RULE);
			setState(1028);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1027);
				match(WS);
				}
			}

			setState(1030);
			ambiguousIdentifier();
			setState(1032);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0) || _la==AMPERSAND) {
				{
				setState(1031);
				typeHint();
				}
			}

			setState(1037);
			_la = _input.LA(1);
			if (_la==ALIAS) {
				{
				setState(1034);
				match(ALIAS);
				setState(1035);
				match(WS);
				setState(1036);
				ambiguousIdentifier();
				}
			}

			setState(1043);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				{
				setState(1040);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1039);
					match(WS);
					}
				}

				setState(1042);
				argList();
				}
				break;
			}
			setState(1049);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				{
				setState(1046);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1045);
					match(WS);
					}
				}

				setState(1048);
				asTypeClause();
				}
				break;
			}
			setState(1057);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				{
				setState(1052);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1051);
					match(WS);
					}
				}

				setState(1054);
				match(WHEN);
				setState(1055);
				match(WS);
				setState(1056);
				valueStmt(0);
				}
				break;
			}
			setState(1059);
			endOfStatement();
			setState(1061);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH) | (1L << END))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ENUM - 64)) | (1L << (EQV - 64)) | (1L << (ERASE - 64)) | (1L << (ERROR - 64)) | (1L << (EVENT - 64)) | (1L << (EXIT_DO - 64)) | (1L << (EXIT_FOR - 64)) | (1L << (EXIT_FUNCTION - 64)) | (1L << (EXIT_PROPERTY - 64)) | (1L << (EXIT_SUB - 64)) | (1L << (EXIT_RULE - 64)) | (1L << (FALSE - 64)) | (1L << (FILECOPY - 64)) | (1L << (FRIEND - 64)) | (1L << (FOR - 64)) | (1L << (FUNCTION - 64)) | (1L << (GET - 64)) | (1L << (GLOBAL - 64)) | (1L << (GOSUB - 64)) | (1L << (GOTO - 64)) | (1L << (IF - 64)) | (1L << (IMP - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (IN - 64)) | (1L << (INPUT - 64)) | (1L << (IS - 64)) | (1L << (INTEGER - 64)) | (1L << (KILL - 64)) | (1L << (LOAD - 64)) | (1L << (LOCK - 64)) | (1L << (LONG - 64)) | (1L << (LOOP - 64)) | (1L << (LEN - 64)) | (1L << (LET - 64)) | (1L << (LIB - 64)) | (1L << (LIKE - 64)) | (1L << (LINE_INPUT - 64)) | (1L << (LSET - 64)) | (1L << (ME - 64)) | (1L << (MID - 64)) | (1L << (MKDIR - 64)) | (1L << (MOD - 64)) | (1L << (NAME - 64)) | (1L << (NEXT - 64)) | (1L << (NEW - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (EMPTY - 64)) | (1L << (ON - 64)) | (1L << (ON_ERROR - 64)) | (1L << (ON_LOCAL_ERROR - 64)) | (1L << (OPEN - 64)) | (1L << (OPTIONAL - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (OR - 131)) | (1L << (OUTPUT - 131)) | (1L << (PARAMARRAY - 131)) | (1L << (PRESERVE - 131)) | (1L << (PRINT - 131)) | (1L << (PRIVATE - 131)) | (1L << (PUBLIC - 131)) | (1L << (PUT - 131)) | (1L << (RANDOM - 131)) | (1L << (RANDOMIZE - 131)) | (1L << (RAISEEVENT - 131)) | (1L << (READ - 131)) | (1L << (REDIM - 131)) | (1L << (REM - 131)) | (1L << (RESET - 131)) | (1L << (RESUME - 131)) | (1L << (RETURN - 131)) | (1L << (RMDIR - 131)) | (1L << (RSET - 131)) | (1L << (SAVEPICTURE - 131)) | (1L << (SAVESETTING - 131)) | (1L << (SEEK - 131)) | (1L << (SELECT - 131)) | (1L << (SENDKEYS - 131)) | (1L << (SET - 131)) | (1L << (SETATTR - 131)) | (1L << (SHARED - 131)) | (1L << (SINGLE - 131)) | (1L << (SPC - 131)) | (1L << (STATIC - 131)) | (1L << (STEP - 131)) | (1L << (STOP - 131)) | (1L << (STRING - 131)) | (1L << (SUB - 131)) | (1L << (TAB - 131)) | (1L << (TEXT - 131)) | (1L << (THEN - 131)) | (1L << (TIME - 131)) | (1L << (TO - 131)) | (1L << (TRUE - 131)) | (1L << (TYPE - 131)) | (1L << (TYPEOF - 131)) | (1L << (UNLOAD - 131)) | (1L << (UNLOCK - 131)) | (1L << (UNTIL - 131)) | (1L << (VARIANT - 131)) | (1L << (VERSION - 131)) | (1L << (WEND - 131)) | (1L << (WHILE - 131)) | (1L << (WIDTH - 131)) | (1L << (WITH - 131)) | (1L << (WITHEVENTS - 131)) | (1L << (WRITE - 131)) | (1L << (XOR - 131)))) != 0) || _la==WS || _la==IDENTIFIER) {
				{
				setState(1060);
				block();
				}
			}

			setState(1063);
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
		enterRule(_localctx, 82, RULE_getStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1065);
			match(GET);
			setState(1066);
			match(WS);
			setState(1067);
			fileNumber();
			setState(1069);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1068);
				match(WS);
				}
			}

			setState(1071);
			match(T__0);
			setState(1073);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				{
				setState(1072);
				match(WS);
				}
				break;
			}
			setState(1076);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				{
				setState(1075);
				valueStmt(0);
				}
				break;
			}
			setState(1079);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1078);
				match(WS);
				}
			}

			setState(1081);
			match(T__0);
			setState(1083);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				{
				setState(1082);
				match(WS);
				}
				break;
			}
			setState(1085);
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
		enterRule(_localctx, 84, RULE_goSubStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1087);
			match(GOSUB);
			setState(1088);
			match(WS);
			setState(1089);
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
		enterRule(_localctx, 86, RULE_goToStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1091);
			match(GOTO);
			setState(1092);
			match(WS);
			setState(1093);
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
		enterRule(_localctx, 88, RULE_ifThenElseStmt);
		int _la;
		try {
			setState(1120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				_localctx = new InlineIfThenElseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1095);
				match(IF);
				setState(1096);
				match(WS);
				setState(1097);
				ifConditionStmt();
				setState(1098);
				match(WS);
				setState(1099);
				match(THEN);
				setState(1100);
				match(WS);
				setState(1101);
				blockStmt();
				setState(1106);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
				case 1:
					{
					setState(1102);
					match(WS);
					setState(1103);
					match(ELSE);
					setState(1104);
					match(WS);
					setState(1105);
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
				setState(1108);
				ifBlockStmt();
				setState(1112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELSEIF) {
					{
					{
					setState(1109);
					ifElseIfBlockStmt();
					}
					}
					setState(1114);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1116);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1115);
					ifElseBlockStmt();
					}
				}

				setState(1118);
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
		enterRule(_localctx, 90, RULE_ifBlockStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1122);
			match(IF);
			setState(1123);
			match(WS);
			setState(1124);
			ifConditionStmt();
			setState(1125);
			match(WS);
			setState(1126);
			match(THEN);
			setState(1127);
			endOfStatement();
			setState(1129);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH) | (1L << END))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ENUM - 64)) | (1L << (EQV - 64)) | (1L << (ERASE - 64)) | (1L << (ERROR - 64)) | (1L << (EVENT - 64)) | (1L << (EXIT_DO - 64)) | (1L << (EXIT_FOR - 64)) | (1L << (EXIT_FUNCTION - 64)) | (1L << (EXIT_PROPERTY - 64)) | (1L << (EXIT_SUB - 64)) | (1L << (EXIT_RULE - 64)) | (1L << (FALSE - 64)) | (1L << (FILECOPY - 64)) | (1L << (FRIEND - 64)) | (1L << (FOR - 64)) | (1L << (FUNCTION - 64)) | (1L << (GET - 64)) | (1L << (GLOBAL - 64)) | (1L << (GOSUB - 64)) | (1L << (GOTO - 64)) | (1L << (IF - 64)) | (1L << (IMP - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (IN - 64)) | (1L << (INPUT - 64)) | (1L << (IS - 64)) | (1L << (INTEGER - 64)) | (1L << (KILL - 64)) | (1L << (LOAD - 64)) | (1L << (LOCK - 64)) | (1L << (LONG - 64)) | (1L << (LOOP - 64)) | (1L << (LEN - 64)) | (1L << (LET - 64)) | (1L << (LIB - 64)) | (1L << (LIKE - 64)) | (1L << (LINE_INPUT - 64)) | (1L << (LSET - 64)) | (1L << (ME - 64)) | (1L << (MID - 64)) | (1L << (MKDIR - 64)) | (1L << (MOD - 64)) | (1L << (NAME - 64)) | (1L << (NEXT - 64)) | (1L << (NEW - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (EMPTY - 64)) | (1L << (ON - 64)) | (1L << (ON_ERROR - 64)) | (1L << (ON_LOCAL_ERROR - 64)) | (1L << (OPEN - 64)) | (1L << (OPTIONAL - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (OR - 131)) | (1L << (OUTPUT - 131)) | (1L << (PARAMARRAY - 131)) | (1L << (PRESERVE - 131)) | (1L << (PRINT - 131)) | (1L << (PRIVATE - 131)) | (1L << (PUBLIC - 131)) | (1L << (PUT - 131)) | (1L << (RANDOM - 131)) | (1L << (RANDOMIZE - 131)) | (1L << (RAISEEVENT - 131)) | (1L << (READ - 131)) | (1L << (REDIM - 131)) | (1L << (REM - 131)) | (1L << (RESET - 131)) | (1L << (RESUME - 131)) | (1L << (RETURN - 131)) | (1L << (RMDIR - 131)) | (1L << (RSET - 131)) | (1L << (SAVEPICTURE - 131)) | (1L << (SAVESETTING - 131)) | (1L << (SEEK - 131)) | (1L << (SELECT - 131)) | (1L << (SENDKEYS - 131)) | (1L << (SET - 131)) | (1L << (SETATTR - 131)) | (1L << (SHARED - 131)) | (1L << (SINGLE - 131)) | (1L << (SPC - 131)) | (1L << (STATIC - 131)) | (1L << (STEP - 131)) | (1L << (STOP - 131)) | (1L << (STRING - 131)) | (1L << (SUB - 131)) | (1L << (TAB - 131)) | (1L << (TEXT - 131)) | (1L << (THEN - 131)) | (1L << (TIME - 131)) | (1L << (TO - 131)) | (1L << (TRUE - 131)) | (1L << (TYPE - 131)) | (1L << (TYPEOF - 131)) | (1L << (UNLOAD - 131)) | (1L << (UNLOCK - 131)) | (1L << (UNTIL - 131)) | (1L << (VARIANT - 131)) | (1L << (VERSION - 131)) | (1L << (WEND - 131)) | (1L << (WHILE - 131)) | (1L << (WIDTH - 131)) | (1L << (WITH - 131)) | (1L << (WITHEVENTS - 131)) | (1L << (WRITE - 131)) | (1L << (XOR - 131)))) != 0) || _la==WS || _la==IDENTIFIER) {
				{
				setState(1128);
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
		enterRule(_localctx, 92, RULE_ifConditionStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1131);
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
		enterRule(_localctx, 94, RULE_ifElseIfBlockStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1133);
			match(ELSEIF);
			setState(1134);
			match(WS);
			setState(1135);
			ifConditionStmt();
			setState(1136);
			match(WS);
			setState(1137);
			match(THEN);
			setState(1138);
			endOfStatement();
			setState(1140);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH) | (1L << END))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ENUM - 64)) | (1L << (EQV - 64)) | (1L << (ERASE - 64)) | (1L << (ERROR - 64)) | (1L << (EVENT - 64)) | (1L << (EXIT_DO - 64)) | (1L << (EXIT_FOR - 64)) | (1L << (EXIT_FUNCTION - 64)) | (1L << (EXIT_PROPERTY - 64)) | (1L << (EXIT_SUB - 64)) | (1L << (EXIT_RULE - 64)) | (1L << (FALSE - 64)) | (1L << (FILECOPY - 64)) | (1L << (FRIEND - 64)) | (1L << (FOR - 64)) | (1L << (FUNCTION - 64)) | (1L << (GET - 64)) | (1L << (GLOBAL - 64)) | (1L << (GOSUB - 64)) | (1L << (GOTO - 64)) | (1L << (IF - 64)) | (1L << (IMP - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (IN - 64)) | (1L << (INPUT - 64)) | (1L << (IS - 64)) | (1L << (INTEGER - 64)) | (1L << (KILL - 64)) | (1L << (LOAD - 64)) | (1L << (LOCK - 64)) | (1L << (LONG - 64)) | (1L << (LOOP - 64)) | (1L << (LEN - 64)) | (1L << (LET - 64)) | (1L << (LIB - 64)) | (1L << (LIKE - 64)) | (1L << (LINE_INPUT - 64)) | (1L << (LSET - 64)) | (1L << (ME - 64)) | (1L << (MID - 64)) | (1L << (MKDIR - 64)) | (1L << (MOD - 64)) | (1L << (NAME - 64)) | (1L << (NEXT - 64)) | (1L << (NEW - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (EMPTY - 64)) | (1L << (ON - 64)) | (1L << (ON_ERROR - 64)) | (1L << (ON_LOCAL_ERROR - 64)) | (1L << (OPEN - 64)) | (1L << (OPTIONAL - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (OR - 131)) | (1L << (OUTPUT - 131)) | (1L << (PARAMARRAY - 131)) | (1L << (PRESERVE - 131)) | (1L << (PRINT - 131)) | (1L << (PRIVATE - 131)) | (1L << (PUBLIC - 131)) | (1L << (PUT - 131)) | (1L << (RANDOM - 131)) | (1L << (RANDOMIZE - 131)) | (1L << (RAISEEVENT - 131)) | (1L << (READ - 131)) | (1L << (REDIM - 131)) | (1L << (REM - 131)) | (1L << (RESET - 131)) | (1L << (RESUME - 131)) | (1L << (RETURN - 131)) | (1L << (RMDIR - 131)) | (1L << (RSET - 131)) | (1L << (SAVEPICTURE - 131)) | (1L << (SAVESETTING - 131)) | (1L << (SEEK - 131)) | (1L << (SELECT - 131)) | (1L << (SENDKEYS - 131)) | (1L << (SET - 131)) | (1L << (SETATTR - 131)) | (1L << (SHARED - 131)) | (1L << (SINGLE - 131)) | (1L << (SPC - 131)) | (1L << (STATIC - 131)) | (1L << (STEP - 131)) | (1L << (STOP - 131)) | (1L << (STRING - 131)) | (1L << (SUB - 131)) | (1L << (TAB - 131)) | (1L << (TEXT - 131)) | (1L << (THEN - 131)) | (1L << (TIME - 131)) | (1L << (TO - 131)) | (1L << (TRUE - 131)) | (1L << (TYPE - 131)) | (1L << (TYPEOF - 131)) | (1L << (UNLOAD - 131)) | (1L << (UNLOCK - 131)) | (1L << (UNTIL - 131)) | (1L << (VARIANT - 131)) | (1L << (VERSION - 131)) | (1L << (WEND - 131)) | (1L << (WHILE - 131)) | (1L << (WIDTH - 131)) | (1L << (WITH - 131)) | (1L << (WITHEVENTS - 131)) | (1L << (WRITE - 131)) | (1L << (XOR - 131)))) != 0) || _la==WS || _la==IDENTIFIER) {
				{
				setState(1139);
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
		enterRule(_localctx, 96, RULE_ifElseBlockStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1142);
			match(ELSE);
			setState(1143);
			endOfStatement();
			setState(1145);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH) | (1L << END))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ENUM - 64)) | (1L << (EQV - 64)) | (1L << (ERASE - 64)) | (1L << (ERROR - 64)) | (1L << (EVENT - 64)) | (1L << (EXIT_DO - 64)) | (1L << (EXIT_FOR - 64)) | (1L << (EXIT_FUNCTION - 64)) | (1L << (EXIT_PROPERTY - 64)) | (1L << (EXIT_SUB - 64)) | (1L << (EXIT_RULE - 64)) | (1L << (FALSE - 64)) | (1L << (FILECOPY - 64)) | (1L << (FRIEND - 64)) | (1L << (FOR - 64)) | (1L << (FUNCTION - 64)) | (1L << (GET - 64)) | (1L << (GLOBAL - 64)) | (1L << (GOSUB - 64)) | (1L << (GOTO - 64)) | (1L << (IF - 64)) | (1L << (IMP - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (IN - 64)) | (1L << (INPUT - 64)) | (1L << (IS - 64)) | (1L << (INTEGER - 64)) | (1L << (KILL - 64)) | (1L << (LOAD - 64)) | (1L << (LOCK - 64)) | (1L << (LONG - 64)) | (1L << (LOOP - 64)) | (1L << (LEN - 64)) | (1L << (LET - 64)) | (1L << (LIB - 64)) | (1L << (LIKE - 64)) | (1L << (LINE_INPUT - 64)) | (1L << (LSET - 64)) | (1L << (ME - 64)) | (1L << (MID - 64)) | (1L << (MKDIR - 64)) | (1L << (MOD - 64)) | (1L << (NAME - 64)) | (1L << (NEXT - 64)) | (1L << (NEW - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (EMPTY - 64)) | (1L << (ON - 64)) | (1L << (ON_ERROR - 64)) | (1L << (ON_LOCAL_ERROR - 64)) | (1L << (OPEN - 64)) | (1L << (OPTIONAL - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (OR - 131)) | (1L << (OUTPUT - 131)) | (1L << (PARAMARRAY - 131)) | (1L << (PRESERVE - 131)) | (1L << (PRINT - 131)) | (1L << (PRIVATE - 131)) | (1L << (PUBLIC - 131)) | (1L << (PUT - 131)) | (1L << (RANDOM - 131)) | (1L << (RANDOMIZE - 131)) | (1L << (RAISEEVENT - 131)) | (1L << (READ - 131)) | (1L << (REDIM - 131)) | (1L << (REM - 131)) | (1L << (RESET - 131)) | (1L << (RESUME - 131)) | (1L << (RETURN - 131)) | (1L << (RMDIR - 131)) | (1L << (RSET - 131)) | (1L << (SAVEPICTURE - 131)) | (1L << (SAVESETTING - 131)) | (1L << (SEEK - 131)) | (1L << (SELECT - 131)) | (1L << (SENDKEYS - 131)) | (1L << (SET - 131)) | (1L << (SETATTR - 131)) | (1L << (SHARED - 131)) | (1L << (SINGLE - 131)) | (1L << (SPC - 131)) | (1L << (STATIC - 131)) | (1L << (STEP - 131)) | (1L << (STOP - 131)) | (1L << (STRING - 131)) | (1L << (SUB - 131)) | (1L << (TAB - 131)) | (1L << (TEXT - 131)) | (1L << (THEN - 131)) | (1L << (TIME - 131)) | (1L << (TO - 131)) | (1L << (TRUE - 131)) | (1L << (TYPE - 131)) | (1L << (TYPEOF - 131)) | (1L << (UNLOAD - 131)) | (1L << (UNLOCK - 131)) | (1L << (UNTIL - 131)) | (1L << (VARIANT - 131)) | (1L << (VERSION - 131)) | (1L << (WEND - 131)) | (1L << (WHILE - 131)) | (1L << (WIDTH - 131)) | (1L << (WITH - 131)) | (1L << (WITHEVENTS - 131)) | (1L << (WRITE - 131)) | (1L << (XOR - 131)))) != 0) || _la==WS || _la==IDENTIFIER) {
				{
				setState(1144);
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
		enterRule(_localctx, 98, RULE_implementsStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1147);
			match(IMPLEMENTS);
			setState(1148);
			match(WS);
			setState(1149);
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
		enterRule(_localctx, 100, RULE_inputStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1151);
			match(INPUT);
			setState(1152);
			match(WS);
			setState(1153);
			fileNumber();
			setState(1162); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1155);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(1154);
						match(WS);
						}
					}

					setState(1157);
					match(T__0);
					setState(1159);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
					case 1:
						{
						setState(1158);
						match(WS);
						}
						break;
					}
					setState(1161);
					valueStmt(0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1164); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
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
		enterRule(_localctx, 102, RULE_killStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1166);
			match(KILL);
			setState(1167);
			match(WS);
			setState(1168);
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
		enterRule(_localctx, 104, RULE_letStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				{
				setState(1170);
				match(LET);
				setState(1171);
				match(WS);
				}
				break;
			}
			setState(1174);
			implicitCallStmt_InStmt();
			setState(1176);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1175);
				match(WS);
				}
			}

			setState(1178);
			_la = _input.LA(1);
			if ( !(((((_la - 198)) & ~0x3f) == 0 && ((1L << (_la - 198)) & ((1L << (EQ - 198)) | (1L << (MINUS_EQ - 198)) | (1L << (PLUS_EQ - 198)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				{
				setState(1179);
				match(WS);
				}
				break;
			}
			setState(1182);
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
		enterRule(_localctx, 106, RULE_lineInputStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1184);
			match(LINE_INPUT);
			setState(1185);
			match(WS);
			setState(1186);
			fileNumber();
			setState(1188);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1187);
				match(WS);
				}
			}

			setState(1190);
			match(T__0);
			setState(1192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				{
				setState(1191);
				match(WS);
				}
				break;
			}
			setState(1194);
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
		enterRule(_localctx, 108, RULE_loadStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1196);
			match(LOAD);
			setState(1197);
			match(WS);
			setState(1198);
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
		enterRule(_localctx, 110, RULE_lockStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1200);
			match(LOCK);
			setState(1201);
			match(WS);
			setState(1202);
			valueStmt(0);
			setState(1217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				{
				setState(1204);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1203);
					match(WS);
					}
				}

				setState(1206);
				match(T__0);
				setState(1208);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
				case 1:
					{
					setState(1207);
					match(WS);
					}
					break;
				}
				setState(1210);
				valueStmt(0);
				setState(1215);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
				case 1:
					{
					setState(1211);
					match(WS);
					setState(1212);
					match(TO);
					setState(1213);
					match(WS);
					setState(1214);
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
		enterRule(_localctx, 112, RULE_lsetStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1219);
			match(LSET);
			setState(1220);
			match(WS);
			setState(1221);
			implicitCallStmt_InStmt();
			setState(1223);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1222);
				match(WS);
				}
			}

			setState(1225);
			match(EQ);
			setState(1227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				{
				setState(1226);
				match(WS);
				}
				break;
			}
			setState(1229);
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
		enterRule(_localctx, 114, RULE_macroConstStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1231);
			match(MACRO_CONST);
			setState(1233);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1232);
				match(WS);
				}
			}

			setState(1235);
			ambiguousIdentifier();
			setState(1237);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1236);
				match(WS);
				}
			}

			setState(1239);
			match(EQ);
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
		enterRule(_localctx, 116, RULE_macroIfThenElseStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1245);
			macroIfBlockStmt();
			setState(1249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MACRO_ELSEIF) {
				{
				{
				setState(1246);
				macroElseIfBlockStmt();
				}
				}
				setState(1251);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1253);
			_la = _input.LA(1);
			if (_la==MACRO_ELSE) {
				{
				setState(1252);
				macroElseBlockStmt();
				}
			}

			setState(1255);
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
		enterRule(_localctx, 118, RULE_macroIfBlockStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1257);
			match(MACRO_IF);
			setState(1259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				{
				setState(1258);
				match(WS);
				}
				break;
			}
			setState(1261);
			ifConditionStmt();
			setState(1262);
			match(WS);
			setState(1263);
			match(THEN);
			setState(1264);
			endOfStatement();
			setState(1270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH) | (1L << END))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ENUM - 64)) | (1L << (EQV - 64)) | (1L << (ERASE - 64)) | (1L << (ERROR - 64)) | (1L << (EVENT - 64)) | (1L << (EXIT_DO - 64)) | (1L << (EXIT_FOR - 64)) | (1L << (EXIT_FUNCTION - 64)) | (1L << (EXIT_PROPERTY - 64)) | (1L << (EXIT_SUB - 64)) | (1L << (EXIT_RULE - 64)) | (1L << (FALSE - 64)) | (1L << (FILECOPY - 64)) | (1L << (FRIEND - 64)) | (1L << (FOR - 64)) | (1L << (FUNCTION - 64)) | (1L << (RULE - 64)) | (1L << (GET - 64)) | (1L << (GLOBAL - 64)) | (1L << (GOSUB - 64)) | (1L << (GOTO - 64)) | (1L << (IF - 64)) | (1L << (IMP - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (IN - 64)) | (1L << (INPUT - 64)) | (1L << (IS - 64)) | (1L << (INTEGER - 64)) | (1L << (KILL - 64)) | (1L << (LOAD - 64)) | (1L << (LOCK - 64)) | (1L << (LONG - 64)) | (1L << (LOOP - 64)) | (1L << (LEN - 64)) | (1L << (LET - 64)) | (1L << (LIB - 64)) | (1L << (LIKE - 64)) | (1L << (LINE_INPUT - 64)) | (1L << (LSET - 64)) | (1L << (ME - 64)) | (1L << (MID - 64)) | (1L << (MKDIR - 64)) | (1L << (MOD - 64)) | (1L << (NAME - 64)) | (1L << (NEXT - 64)) | (1L << (NEW - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (EMPTY - 64)) | (1L << (ON - 64)) | (1L << (ON_ERROR - 64)) | (1L << (ON_LOCAL_ERROR - 64)) | (1L << (OPEN - 64)) | (1L << (OPTIONAL - 64)) | (1L << (OPTION_BASE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (OPTION_EXPLICIT - 128)) | (1L << (OPTION_COMPARE - 128)) | (1L << (OPTION_PRIVATE_MODULE - 128)) | (1L << (OR - 128)) | (1L << (OUTPUT - 128)) | (1L << (PARAMARRAY - 128)) | (1L << (PRESERVE - 128)) | (1L << (PRINT - 128)) | (1L << (PRIVATE - 128)) | (1L << (PROPERTY_GET - 128)) | (1L << (PROPERTY_LET - 128)) | (1L << (PROPERTY_SET - 128)) | (1L << (PUBLIC - 128)) | (1L << (PUT - 128)) | (1L << (RANDOM - 128)) | (1L << (RANDOMIZE - 128)) | (1L << (RAISEEVENT - 128)) | (1L << (READ - 128)) | (1L << (REDIM - 128)) | (1L << (REM - 128)) | (1L << (RESET - 128)) | (1L << (RESUME - 128)) | (1L << (RETURN - 128)) | (1L << (RMDIR - 128)) | (1L << (RSET - 128)) | (1L << (SAVEPICTURE - 128)) | (1L << (SAVESETTING - 128)) | (1L << (SEEK - 128)) | (1L << (SELECT - 128)) | (1L << (SENDKEYS - 128)) | (1L << (SET - 128)) | (1L << (SETATTR - 128)) | (1L << (SHARED - 128)) | (1L << (SINGLE - 128)) | (1L << (SPC - 128)) | (1L << (STATIC - 128)) | (1L << (STEP - 128)) | (1L << (STOP - 128)) | (1L << (STRING - 128)) | (1L << (SUB - 128)) | (1L << (TAB - 128)) | (1L << (TEXT - 128)) | (1L << (THEN - 128)) | (1L << (TIME - 128)) | (1L << (TO - 128)) | (1L << (TRUE - 128)) | (1L << (TYPE - 128)) | (1L << (TYPEOF - 128)) | (1L << (UNLOAD - 128)) | (1L << (UNLOCK - 128)) | (1L << (UNTIL - 128)) | (1L << (VARIANT - 128)) | (1L << (VERSION - 128)) | (1L << (WEND - 128)) | (1L << (WHILE - 128)) | (1L << (WIDTH - 128)) | (1L << (WITH - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (WITHEVENTS - 192)) | (1L << (WRITE - 192)) | (1L << (XOR - 192)) | (1L << (COMMENT - 192)) | (1L << (WS - 192)) | (1L << (IDENTIFIER - 192)))) != 0)) {
				{
				setState(1268);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
				case 1:
					{
					setState(1265);
					moduleDeclarations();
					}
					break;
				case 2:
					{
					setState(1266);
					moduleBody();
					}
					break;
				case 3:
					{
					setState(1267);
					block();
					}
					break;
				}
				}
				setState(1272);
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
		enterRule(_localctx, 120, RULE_macroElseIfBlockStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1273);
			match(MACRO_ELSEIF);
			setState(1275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				{
				setState(1274);
				match(WS);
				}
				break;
			}
			setState(1277);
			ifConditionStmt();
			setState(1278);
			match(WS);
			setState(1279);
			match(THEN);
			setState(1280);
			endOfStatement();
			setState(1286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH) | (1L << END))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ENUM - 64)) | (1L << (EQV - 64)) | (1L << (ERASE - 64)) | (1L << (ERROR - 64)) | (1L << (EVENT - 64)) | (1L << (EXIT_DO - 64)) | (1L << (EXIT_FOR - 64)) | (1L << (EXIT_FUNCTION - 64)) | (1L << (EXIT_PROPERTY - 64)) | (1L << (EXIT_SUB - 64)) | (1L << (EXIT_RULE - 64)) | (1L << (FALSE - 64)) | (1L << (FILECOPY - 64)) | (1L << (FRIEND - 64)) | (1L << (FOR - 64)) | (1L << (FUNCTION - 64)) | (1L << (RULE - 64)) | (1L << (GET - 64)) | (1L << (GLOBAL - 64)) | (1L << (GOSUB - 64)) | (1L << (GOTO - 64)) | (1L << (IF - 64)) | (1L << (IMP - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (IN - 64)) | (1L << (INPUT - 64)) | (1L << (IS - 64)) | (1L << (INTEGER - 64)) | (1L << (KILL - 64)) | (1L << (LOAD - 64)) | (1L << (LOCK - 64)) | (1L << (LONG - 64)) | (1L << (LOOP - 64)) | (1L << (LEN - 64)) | (1L << (LET - 64)) | (1L << (LIB - 64)) | (1L << (LIKE - 64)) | (1L << (LINE_INPUT - 64)) | (1L << (LSET - 64)) | (1L << (ME - 64)) | (1L << (MID - 64)) | (1L << (MKDIR - 64)) | (1L << (MOD - 64)) | (1L << (NAME - 64)) | (1L << (NEXT - 64)) | (1L << (NEW - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (EMPTY - 64)) | (1L << (ON - 64)) | (1L << (ON_ERROR - 64)) | (1L << (ON_LOCAL_ERROR - 64)) | (1L << (OPEN - 64)) | (1L << (OPTIONAL - 64)) | (1L << (OPTION_BASE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (OPTION_EXPLICIT - 128)) | (1L << (OPTION_COMPARE - 128)) | (1L << (OPTION_PRIVATE_MODULE - 128)) | (1L << (OR - 128)) | (1L << (OUTPUT - 128)) | (1L << (PARAMARRAY - 128)) | (1L << (PRESERVE - 128)) | (1L << (PRINT - 128)) | (1L << (PRIVATE - 128)) | (1L << (PROPERTY_GET - 128)) | (1L << (PROPERTY_LET - 128)) | (1L << (PROPERTY_SET - 128)) | (1L << (PUBLIC - 128)) | (1L << (PUT - 128)) | (1L << (RANDOM - 128)) | (1L << (RANDOMIZE - 128)) | (1L << (RAISEEVENT - 128)) | (1L << (READ - 128)) | (1L << (REDIM - 128)) | (1L << (REM - 128)) | (1L << (RESET - 128)) | (1L << (RESUME - 128)) | (1L << (RETURN - 128)) | (1L << (RMDIR - 128)) | (1L << (RSET - 128)) | (1L << (SAVEPICTURE - 128)) | (1L << (SAVESETTING - 128)) | (1L << (SEEK - 128)) | (1L << (SELECT - 128)) | (1L << (SENDKEYS - 128)) | (1L << (SET - 128)) | (1L << (SETATTR - 128)) | (1L << (SHARED - 128)) | (1L << (SINGLE - 128)) | (1L << (SPC - 128)) | (1L << (STATIC - 128)) | (1L << (STEP - 128)) | (1L << (STOP - 128)) | (1L << (STRING - 128)) | (1L << (SUB - 128)) | (1L << (TAB - 128)) | (1L << (TEXT - 128)) | (1L << (THEN - 128)) | (1L << (TIME - 128)) | (1L << (TO - 128)) | (1L << (TRUE - 128)) | (1L << (TYPE - 128)) | (1L << (TYPEOF - 128)) | (1L << (UNLOAD - 128)) | (1L << (UNLOCK - 128)) | (1L << (UNTIL - 128)) | (1L << (VARIANT - 128)) | (1L << (VERSION - 128)) | (1L << (WEND - 128)) | (1L << (WHILE - 128)) | (1L << (WIDTH - 128)) | (1L << (WITH - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (WITHEVENTS - 192)) | (1L << (WRITE - 192)) | (1L << (XOR - 192)) | (1L << (COMMENT - 192)) | (1L << (WS - 192)) | (1L << (IDENTIFIER - 192)))) != 0)) {
				{
				setState(1284);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
				case 1:
					{
					setState(1281);
					moduleDeclarations();
					}
					break;
				case 2:
					{
					setState(1282);
					moduleBody();
					}
					break;
				case 3:
					{
					setState(1283);
					block();
					}
					break;
				}
				}
				setState(1288);
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
		enterRule(_localctx, 122, RULE_macroElseBlockStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1289);
			match(MACRO_ELSE);
			setState(1290);
			endOfStatement();
			setState(1296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH) | (1L << END))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ENUM - 64)) | (1L << (EQV - 64)) | (1L << (ERASE - 64)) | (1L << (ERROR - 64)) | (1L << (EVENT - 64)) | (1L << (EXIT_DO - 64)) | (1L << (EXIT_FOR - 64)) | (1L << (EXIT_FUNCTION - 64)) | (1L << (EXIT_PROPERTY - 64)) | (1L << (EXIT_SUB - 64)) | (1L << (EXIT_RULE - 64)) | (1L << (FALSE - 64)) | (1L << (FILECOPY - 64)) | (1L << (FRIEND - 64)) | (1L << (FOR - 64)) | (1L << (FUNCTION - 64)) | (1L << (RULE - 64)) | (1L << (GET - 64)) | (1L << (GLOBAL - 64)) | (1L << (GOSUB - 64)) | (1L << (GOTO - 64)) | (1L << (IF - 64)) | (1L << (IMP - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (IN - 64)) | (1L << (INPUT - 64)) | (1L << (IS - 64)) | (1L << (INTEGER - 64)) | (1L << (KILL - 64)) | (1L << (LOAD - 64)) | (1L << (LOCK - 64)) | (1L << (LONG - 64)) | (1L << (LOOP - 64)) | (1L << (LEN - 64)) | (1L << (LET - 64)) | (1L << (LIB - 64)) | (1L << (LIKE - 64)) | (1L << (LINE_INPUT - 64)) | (1L << (LSET - 64)) | (1L << (ME - 64)) | (1L << (MID - 64)) | (1L << (MKDIR - 64)) | (1L << (MOD - 64)) | (1L << (NAME - 64)) | (1L << (NEXT - 64)) | (1L << (NEW - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (EMPTY - 64)) | (1L << (ON - 64)) | (1L << (ON_ERROR - 64)) | (1L << (ON_LOCAL_ERROR - 64)) | (1L << (OPEN - 64)) | (1L << (OPTIONAL - 64)) | (1L << (OPTION_BASE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (OPTION_EXPLICIT - 128)) | (1L << (OPTION_COMPARE - 128)) | (1L << (OPTION_PRIVATE_MODULE - 128)) | (1L << (OR - 128)) | (1L << (OUTPUT - 128)) | (1L << (PARAMARRAY - 128)) | (1L << (PRESERVE - 128)) | (1L << (PRINT - 128)) | (1L << (PRIVATE - 128)) | (1L << (PROPERTY_GET - 128)) | (1L << (PROPERTY_LET - 128)) | (1L << (PROPERTY_SET - 128)) | (1L << (PUBLIC - 128)) | (1L << (PUT - 128)) | (1L << (RANDOM - 128)) | (1L << (RANDOMIZE - 128)) | (1L << (RAISEEVENT - 128)) | (1L << (READ - 128)) | (1L << (REDIM - 128)) | (1L << (REM - 128)) | (1L << (RESET - 128)) | (1L << (RESUME - 128)) | (1L << (RETURN - 128)) | (1L << (RMDIR - 128)) | (1L << (RSET - 128)) | (1L << (SAVEPICTURE - 128)) | (1L << (SAVESETTING - 128)) | (1L << (SEEK - 128)) | (1L << (SELECT - 128)) | (1L << (SENDKEYS - 128)) | (1L << (SET - 128)) | (1L << (SETATTR - 128)) | (1L << (SHARED - 128)) | (1L << (SINGLE - 128)) | (1L << (SPC - 128)) | (1L << (STATIC - 128)) | (1L << (STEP - 128)) | (1L << (STOP - 128)) | (1L << (STRING - 128)) | (1L << (SUB - 128)) | (1L << (TAB - 128)) | (1L << (TEXT - 128)) | (1L << (THEN - 128)) | (1L << (TIME - 128)) | (1L << (TO - 128)) | (1L << (TRUE - 128)) | (1L << (TYPE - 128)) | (1L << (TYPEOF - 128)) | (1L << (UNLOAD - 128)) | (1L << (UNLOCK - 128)) | (1L << (UNTIL - 128)) | (1L << (VARIANT - 128)) | (1L << (VERSION - 128)) | (1L << (WEND - 128)) | (1L << (WHILE - 128)) | (1L << (WIDTH - 128)) | (1L << (WITH - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (WITHEVENTS - 192)) | (1L << (WRITE - 192)) | (1L << (XOR - 192)) | (1L << (COMMENT - 192)) | (1L << (WS - 192)) | (1L << (IDENTIFIER - 192)))) != 0)) {
				{
				setState(1294);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
				case 1:
					{
					setState(1291);
					moduleDeclarations();
					}
					break;
				case 2:
					{
					setState(1292);
					moduleBody();
					}
					break;
				case 3:
					{
					setState(1293);
					block();
					}
					break;
				}
				}
				setState(1298);
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
		enterRule(_localctx, 124, RULE_midStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1299);
			match(MID);
			setState(1301);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1300);
				match(WS);
				}
			}

			setState(1303);
			match(LPAREN);
			setState(1305);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1304);
				match(WS);
				}
			}

			setState(1307);
			ambiguousIdentifier();
			setState(1309);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1308);
				match(WS);
				}
			}

			setState(1311);
			match(T__0);
			setState(1313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				{
				setState(1312);
				match(WS);
				}
				break;
			}
			setState(1315);
			valueStmt(0);
			setState(1324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				{
				setState(1317);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1316);
					match(WS);
					}
				}

				setState(1319);
				match(T__0);
				setState(1321);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
				case 1:
					{
					setState(1320);
					match(WS);
					}
					break;
				}
				setState(1323);
				valueStmt(0);
				}
				break;
			}
			setState(1327);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1326);
				match(WS);
				}
			}

			setState(1329);
			match(RPAREN);
			setState(1331);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1330);
				match(WS);
				}
			}

			setState(1333);
			match(EQ);
			setState(1335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				{
				setState(1334);
				match(WS);
				}
				break;
			}
			setState(1337);
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
		enterRule(_localctx, 126, RULE_mkdirStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1339);
			match(MKDIR);
			setState(1340);
			match(WS);
			setState(1341);
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
		enterRule(_localctx, 128, RULE_nameStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1343);
			match(NAME);
			setState(1344);
			match(WS);
			setState(1345);
			valueStmt(0);
			setState(1346);
			match(WS);
			setState(1347);
			match(AS);
			setState(1348);
			match(WS);
			setState(1349);
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
		enterRule(_localctx, 130, RULE_onErrorStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1351);
			_la = _input.LA(1);
			if ( !(_la==ON_ERROR || _la==ON_LOCAL_ERROR) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1352);
			match(WS);
			setState(1359);
			switch (_input.LA(1)) {
			case GOTO:
				{
				setState(1353);
				match(GOTO);
				setState(1354);
				match(WS);
				setState(1355);
				ambiguousIdentifier();
				}
				break;
			case RESUME:
				{
				setState(1356);
				match(RESUME);
				setState(1357);
				match(WS);
				setState(1358);
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
		enterRule(_localctx, 132, RULE_onGoToStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1361);
			match(ON);
			setState(1362);
			match(WS);
			setState(1363);
			valueStmt(0);
			setState(1364);
			match(WS);
			setState(1365);
			match(GOTO);
			setState(1366);
			match(WS);
			setState(1367);
			ambiguousIdentifier();
			setState(1378);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1369);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(1368);
						match(WS);
						}
					}

					setState(1371);
					match(T__0);
					setState(1373);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(1372);
						match(WS);
						}
					}

					setState(1375);
					ambiguousIdentifier();
					}
					} 
				}
				setState(1380);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
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
		enterRule(_localctx, 134, RULE_onGoSubStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1381);
			match(ON);
			setState(1382);
			match(WS);
			setState(1383);
			valueStmt(0);
			setState(1384);
			match(WS);
			setState(1385);
			match(GOSUB);
			setState(1386);
			match(WS);
			setState(1387);
			ambiguousIdentifier();
			setState(1398);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1389);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(1388);
						match(WS);
						}
					}

					setState(1391);
					match(T__0);
					setState(1393);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(1392);
						match(WS);
						}
					}

					setState(1395);
					ambiguousIdentifier();
					}
					} 
				}
				setState(1400);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
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
		enterRule(_localctx, 136, RULE_openStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1401);
			match(OPEN);
			setState(1402);
			match(WS);
			setState(1403);
			valueStmt(0);
			setState(1404);
			match(WS);
			setState(1405);
			match(FOR);
			setState(1406);
			match(WS);
			setState(1407);
			_la = _input.LA(1);
			if ( !(_la==APPEND || _la==BINARY || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (INPUT - 89)) | (1L << (OUTPUT - 89)) | (1L << (RANDOM - 89)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1412);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				{
				setState(1408);
				match(WS);
				setState(1409);
				match(ACCESS);
				setState(1410);
				match(WS);
				setState(1411);
				_la = _input.LA(1);
				if ( !(((((_la - 146)) & ~0x3f) == 0 && ((1L << (_la - 146)) & ((1L << (READ - 146)) | (1L << (READ_WRITE - 146)) | (1L << (WRITE - 146)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			}
			setState(1416);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
			case 1:
				{
				setState(1414);
				match(WS);
				setState(1415);
				_la = _input.LA(1);
				if ( !(((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (LOCK_READ - 102)) | (1L << (LOCK_WRITE - 102)) | (1L << (LOCK_READ_WRITE - 102)) | (1L << (SHARED - 102)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			}
			setState(1418);
			match(WS);
			setState(1419);
			match(AS);
			setState(1420);
			match(WS);
			setState(1421);
			fileNumber();
			setState(1432);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				{
				setState(1422);
				match(WS);
				setState(1423);
				match(LEN);
				setState(1425);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1424);
					match(WS);
					}
				}

				setState(1427);
				match(EQ);
				setState(1429);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
				case 1:
					{
					setState(1428);
					match(WS);
					}
					break;
				}
				setState(1431);
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
		enterRule(_localctx, 138, RULE_outputList);
		int _la;
		try {
			int _alt;
			setState(1467);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1434);
				outputList_Expression();
				setState(1447);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1436);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1435);
							match(WS);
							}
						}

						setState(1438);
						_la = _input.LA(1);
						if ( !(_la==T__0 || _la==T__1) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1440);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
						case 1:
							{
							setState(1439);
							match(WS);
							}
							break;
						}
						setState(1443);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
						case 1:
							{
							setState(1442);
							outputList_Expression();
							}
							break;
						}
						}
						} 
					}
					setState(1449);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1451);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
				case 1:
					{
					setState(1450);
					outputList_Expression();
					}
					break;
				}
				setState(1463); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1454);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1453);
							match(WS);
							}
						}

						setState(1456);
						_la = _input.LA(1);
						if ( !(_la==T__0 || _la==T__1) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1458);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
						case 1:
							{
							setState(1457);
							match(WS);
							}
							break;
						}
						setState(1461);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
						case 1:
							{
							setState(1460);
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
					setState(1465); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
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
		enterRule(_localctx, 140, RULE_outputList_Expression);
		int _la;
		try {
			setState(1486);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1469);
				valueStmt(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1470);
				_la = _input.LA(1);
				if ( !(_la==SPC || _la==TAB) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1484);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
				case 1:
					{
					setState(1472);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(1471);
						match(WS);
						}
					}

					setState(1474);
					match(LPAREN);
					setState(1476);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
					case 1:
						{
						setState(1475);
						match(WS);
						}
						break;
					}
					setState(1478);
					argsCall();
					setState(1480);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(1479);
						match(WS);
						}
					}

					setState(1482);
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
		enterRule(_localctx, 142, RULE_printStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1488);
			match(PRINT);
			setState(1489);
			match(WS);
			setState(1490);
			fileNumber();
			setState(1492);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1491);
				match(WS);
				}
			}

			setState(1494);
			match(T__0);
			setState(1499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				{
				setState(1496);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
				case 1:
					{
					setState(1495);
					match(WS);
					}
					break;
				}
				setState(1498);
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
		enterRule(_localctx, 144, RULE_propertyGetStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1504);
			_la = _input.LA(1);
			if (((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (FRIEND - 77)) | (1L << (GLOBAL - 77)) | (1L << (PRIVATE - 77)))) != 0) || _la==PUBLIC) {
				{
				setState(1501);
				visibility();
				setState(1502);
				match(WS);
				}
			}

			setState(1508);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(1506);
				match(STATIC);
				setState(1507);
				match(WS);
				}
			}

			setState(1510);
			match(PROPERTY_GET);
			setState(1511);
			match(WS);
			setState(1512);
			ambiguousIdentifier();
			setState(1514);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0) || _la==AMPERSAND) {
				{
				setState(1513);
				typeHint();
				}
			}

			setState(1520);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				{
				setState(1517);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1516);
					match(WS);
					}
				}

				setState(1519);
				argList();
				}
				break;
			}
			setState(1524);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
			case 1:
				{
				setState(1522);
				match(WS);
				setState(1523);
				asTypeClause();
				}
				break;
			}
			setState(1526);
			endOfStatement();
			setState(1528);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH) | (1L << END))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ENUM - 64)) | (1L << (EQV - 64)) | (1L << (ERASE - 64)) | (1L << (ERROR - 64)) | (1L << (EVENT - 64)) | (1L << (EXIT_DO - 64)) | (1L << (EXIT_FOR - 64)) | (1L << (EXIT_FUNCTION - 64)) | (1L << (EXIT_PROPERTY - 64)) | (1L << (EXIT_SUB - 64)) | (1L << (EXIT_RULE - 64)) | (1L << (FALSE - 64)) | (1L << (FILECOPY - 64)) | (1L << (FRIEND - 64)) | (1L << (FOR - 64)) | (1L << (FUNCTION - 64)) | (1L << (GET - 64)) | (1L << (GLOBAL - 64)) | (1L << (GOSUB - 64)) | (1L << (GOTO - 64)) | (1L << (IF - 64)) | (1L << (IMP - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (IN - 64)) | (1L << (INPUT - 64)) | (1L << (IS - 64)) | (1L << (INTEGER - 64)) | (1L << (KILL - 64)) | (1L << (LOAD - 64)) | (1L << (LOCK - 64)) | (1L << (LONG - 64)) | (1L << (LOOP - 64)) | (1L << (LEN - 64)) | (1L << (LET - 64)) | (1L << (LIB - 64)) | (1L << (LIKE - 64)) | (1L << (LINE_INPUT - 64)) | (1L << (LSET - 64)) | (1L << (ME - 64)) | (1L << (MID - 64)) | (1L << (MKDIR - 64)) | (1L << (MOD - 64)) | (1L << (NAME - 64)) | (1L << (NEXT - 64)) | (1L << (NEW - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (EMPTY - 64)) | (1L << (ON - 64)) | (1L << (ON_ERROR - 64)) | (1L << (ON_LOCAL_ERROR - 64)) | (1L << (OPEN - 64)) | (1L << (OPTIONAL - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (OR - 131)) | (1L << (OUTPUT - 131)) | (1L << (PARAMARRAY - 131)) | (1L << (PRESERVE - 131)) | (1L << (PRINT - 131)) | (1L << (PRIVATE - 131)) | (1L << (PUBLIC - 131)) | (1L << (PUT - 131)) | (1L << (RANDOM - 131)) | (1L << (RANDOMIZE - 131)) | (1L << (RAISEEVENT - 131)) | (1L << (READ - 131)) | (1L << (REDIM - 131)) | (1L << (REM - 131)) | (1L << (RESET - 131)) | (1L << (RESUME - 131)) | (1L << (RETURN - 131)) | (1L << (RMDIR - 131)) | (1L << (RSET - 131)) | (1L << (SAVEPICTURE - 131)) | (1L << (SAVESETTING - 131)) | (1L << (SEEK - 131)) | (1L << (SELECT - 131)) | (1L << (SENDKEYS - 131)) | (1L << (SET - 131)) | (1L << (SETATTR - 131)) | (1L << (SHARED - 131)) | (1L << (SINGLE - 131)) | (1L << (SPC - 131)) | (1L << (STATIC - 131)) | (1L << (STEP - 131)) | (1L << (STOP - 131)) | (1L << (STRING - 131)) | (1L << (SUB - 131)) | (1L << (TAB - 131)) | (1L << (TEXT - 131)) | (1L << (THEN - 131)) | (1L << (TIME - 131)) | (1L << (TO - 131)) | (1L << (TRUE - 131)) | (1L << (TYPE - 131)) | (1L << (TYPEOF - 131)) | (1L << (UNLOAD - 131)) | (1L << (UNLOCK - 131)) | (1L << (UNTIL - 131)) | (1L << (VARIANT - 131)) | (1L << (VERSION - 131)) | (1L << (WEND - 131)) | (1L << (WHILE - 131)) | (1L << (WIDTH - 131)) | (1L << (WITH - 131)) | (1L << (WITHEVENTS - 131)) | (1L << (WRITE - 131)) | (1L << (XOR - 131)))) != 0) || _la==WS || _la==IDENTIFIER) {
				{
				setState(1527);
				block();
				}
			}

			setState(1530);
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
		enterRule(_localctx, 146, RULE_propertySetStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1535);
			_la = _input.LA(1);
			if (((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (FRIEND - 77)) | (1L << (GLOBAL - 77)) | (1L << (PRIVATE - 77)))) != 0) || _la==PUBLIC) {
				{
				setState(1532);
				visibility();
				setState(1533);
				match(WS);
				}
			}

			setState(1539);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(1537);
				match(STATIC);
				setState(1538);
				match(WS);
				}
			}

			setState(1541);
			match(PROPERTY_SET);
			setState(1542);
			match(WS);
			setState(1543);
			ambiguousIdentifier();
			setState(1548);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
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
			setState(1550);
			endOfStatement();
			setState(1552);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH) | (1L << END))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ENUM - 64)) | (1L << (EQV - 64)) | (1L << (ERASE - 64)) | (1L << (ERROR - 64)) | (1L << (EVENT - 64)) | (1L << (EXIT_DO - 64)) | (1L << (EXIT_FOR - 64)) | (1L << (EXIT_FUNCTION - 64)) | (1L << (EXIT_PROPERTY - 64)) | (1L << (EXIT_SUB - 64)) | (1L << (EXIT_RULE - 64)) | (1L << (FALSE - 64)) | (1L << (FILECOPY - 64)) | (1L << (FRIEND - 64)) | (1L << (FOR - 64)) | (1L << (FUNCTION - 64)) | (1L << (GET - 64)) | (1L << (GLOBAL - 64)) | (1L << (GOSUB - 64)) | (1L << (GOTO - 64)) | (1L << (IF - 64)) | (1L << (IMP - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (IN - 64)) | (1L << (INPUT - 64)) | (1L << (IS - 64)) | (1L << (INTEGER - 64)) | (1L << (KILL - 64)) | (1L << (LOAD - 64)) | (1L << (LOCK - 64)) | (1L << (LONG - 64)) | (1L << (LOOP - 64)) | (1L << (LEN - 64)) | (1L << (LET - 64)) | (1L << (LIB - 64)) | (1L << (LIKE - 64)) | (1L << (LINE_INPUT - 64)) | (1L << (LSET - 64)) | (1L << (ME - 64)) | (1L << (MID - 64)) | (1L << (MKDIR - 64)) | (1L << (MOD - 64)) | (1L << (NAME - 64)) | (1L << (NEXT - 64)) | (1L << (NEW - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (EMPTY - 64)) | (1L << (ON - 64)) | (1L << (ON_ERROR - 64)) | (1L << (ON_LOCAL_ERROR - 64)) | (1L << (OPEN - 64)) | (1L << (OPTIONAL - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (OR - 131)) | (1L << (OUTPUT - 131)) | (1L << (PARAMARRAY - 131)) | (1L << (PRESERVE - 131)) | (1L << (PRINT - 131)) | (1L << (PRIVATE - 131)) | (1L << (PUBLIC - 131)) | (1L << (PUT - 131)) | (1L << (RANDOM - 131)) | (1L << (RANDOMIZE - 131)) | (1L << (RAISEEVENT - 131)) | (1L << (READ - 131)) | (1L << (REDIM - 131)) | (1L << (REM - 131)) | (1L << (RESET - 131)) | (1L << (RESUME - 131)) | (1L << (RETURN - 131)) | (1L << (RMDIR - 131)) | (1L << (RSET - 131)) | (1L << (SAVEPICTURE - 131)) | (1L << (SAVESETTING - 131)) | (1L << (SEEK - 131)) | (1L << (SELECT - 131)) | (1L << (SENDKEYS - 131)) | (1L << (SET - 131)) | (1L << (SETATTR - 131)) | (1L << (SHARED - 131)) | (1L << (SINGLE - 131)) | (1L << (SPC - 131)) | (1L << (STATIC - 131)) | (1L << (STEP - 131)) | (1L << (STOP - 131)) | (1L << (STRING - 131)) | (1L << (SUB - 131)) | (1L << (TAB - 131)) | (1L << (TEXT - 131)) | (1L << (THEN - 131)) | (1L << (TIME - 131)) | (1L << (TO - 131)) | (1L << (TRUE - 131)) | (1L << (TYPE - 131)) | (1L << (TYPEOF - 131)) | (1L << (UNLOAD - 131)) | (1L << (UNLOCK - 131)) | (1L << (UNTIL - 131)) | (1L << (VARIANT - 131)) | (1L << (VERSION - 131)) | (1L << (WEND - 131)) | (1L << (WHILE - 131)) | (1L << (WIDTH - 131)) | (1L << (WITH - 131)) | (1L << (WITHEVENTS - 131)) | (1L << (WRITE - 131)) | (1L << (XOR - 131)))) != 0) || _la==WS || _la==IDENTIFIER) {
				{
				setState(1551);
				block();
				}
			}

			setState(1554);
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
		enterRule(_localctx, 148, RULE_propertyLetStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1559);
			_la = _input.LA(1);
			if (((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (FRIEND - 77)) | (1L << (GLOBAL - 77)) | (1L << (PRIVATE - 77)))) != 0) || _la==PUBLIC) {
				{
				setState(1556);
				visibility();
				setState(1557);
				match(WS);
				}
			}

			setState(1563);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(1561);
				match(STATIC);
				setState(1562);
				match(WS);
				}
			}

			setState(1565);
			match(PROPERTY_LET);
			setState(1566);
			match(WS);
			setState(1567);
			ambiguousIdentifier();
			setState(1572);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
			case 1:
				{
				setState(1569);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1568);
					match(WS);
					}
				}

				setState(1571);
				argList();
				}
				break;
			}
			setState(1574);
			endOfStatement();
			setState(1576);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH) | (1L << END))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ENUM - 64)) | (1L << (EQV - 64)) | (1L << (ERASE - 64)) | (1L << (ERROR - 64)) | (1L << (EVENT - 64)) | (1L << (EXIT_DO - 64)) | (1L << (EXIT_FOR - 64)) | (1L << (EXIT_FUNCTION - 64)) | (1L << (EXIT_PROPERTY - 64)) | (1L << (EXIT_SUB - 64)) | (1L << (EXIT_RULE - 64)) | (1L << (FALSE - 64)) | (1L << (FILECOPY - 64)) | (1L << (FRIEND - 64)) | (1L << (FOR - 64)) | (1L << (FUNCTION - 64)) | (1L << (GET - 64)) | (1L << (GLOBAL - 64)) | (1L << (GOSUB - 64)) | (1L << (GOTO - 64)) | (1L << (IF - 64)) | (1L << (IMP - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (IN - 64)) | (1L << (INPUT - 64)) | (1L << (IS - 64)) | (1L << (INTEGER - 64)) | (1L << (KILL - 64)) | (1L << (LOAD - 64)) | (1L << (LOCK - 64)) | (1L << (LONG - 64)) | (1L << (LOOP - 64)) | (1L << (LEN - 64)) | (1L << (LET - 64)) | (1L << (LIB - 64)) | (1L << (LIKE - 64)) | (1L << (LINE_INPUT - 64)) | (1L << (LSET - 64)) | (1L << (ME - 64)) | (1L << (MID - 64)) | (1L << (MKDIR - 64)) | (1L << (MOD - 64)) | (1L << (NAME - 64)) | (1L << (NEXT - 64)) | (1L << (NEW - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (EMPTY - 64)) | (1L << (ON - 64)) | (1L << (ON_ERROR - 64)) | (1L << (ON_LOCAL_ERROR - 64)) | (1L << (OPEN - 64)) | (1L << (OPTIONAL - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (OR - 131)) | (1L << (OUTPUT - 131)) | (1L << (PARAMARRAY - 131)) | (1L << (PRESERVE - 131)) | (1L << (PRINT - 131)) | (1L << (PRIVATE - 131)) | (1L << (PUBLIC - 131)) | (1L << (PUT - 131)) | (1L << (RANDOM - 131)) | (1L << (RANDOMIZE - 131)) | (1L << (RAISEEVENT - 131)) | (1L << (READ - 131)) | (1L << (REDIM - 131)) | (1L << (REM - 131)) | (1L << (RESET - 131)) | (1L << (RESUME - 131)) | (1L << (RETURN - 131)) | (1L << (RMDIR - 131)) | (1L << (RSET - 131)) | (1L << (SAVEPICTURE - 131)) | (1L << (SAVESETTING - 131)) | (1L << (SEEK - 131)) | (1L << (SELECT - 131)) | (1L << (SENDKEYS - 131)) | (1L << (SET - 131)) | (1L << (SETATTR - 131)) | (1L << (SHARED - 131)) | (1L << (SINGLE - 131)) | (1L << (SPC - 131)) | (1L << (STATIC - 131)) | (1L << (STEP - 131)) | (1L << (STOP - 131)) | (1L << (STRING - 131)) | (1L << (SUB - 131)) | (1L << (TAB - 131)) | (1L << (TEXT - 131)) | (1L << (THEN - 131)) | (1L << (TIME - 131)) | (1L << (TO - 131)) | (1L << (TRUE - 131)) | (1L << (TYPE - 131)) | (1L << (TYPEOF - 131)) | (1L << (UNLOAD - 131)) | (1L << (UNLOCK - 131)) | (1L << (UNTIL - 131)) | (1L << (VARIANT - 131)) | (1L << (VERSION - 131)) | (1L << (WEND - 131)) | (1L << (WHILE - 131)) | (1L << (WIDTH - 131)) | (1L << (WITH - 131)) | (1L << (WITHEVENTS - 131)) | (1L << (WRITE - 131)) | (1L << (XOR - 131)))) != 0) || _la==WS || _la==IDENTIFIER) {
				{
				setState(1575);
				block();
				}
			}

			setState(1578);
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
		enterRule(_localctx, 150, RULE_putStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1580);
			match(PUT);
			setState(1581);
			match(WS);
			setState(1582);
			fileNumber();
			setState(1584);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1583);
				match(WS);
				}
			}

			setState(1586);
			match(T__0);
			setState(1588);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
			case 1:
				{
				setState(1587);
				match(WS);
				}
				break;
			}
			setState(1591);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
			case 1:
				{
				setState(1590);
				valueStmt(0);
				}
				break;
			}
			setState(1594);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1593);
				match(WS);
				}
			}

			setState(1596);
			match(T__0);
			setState(1598);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
			case 1:
				{
				setState(1597);
				match(WS);
				}
				break;
			}
			setState(1600);
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
		enterRule(_localctx, 152, RULE_raiseEventStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1602);
			match(RAISEEVENT);
			setState(1603);
			match(WS);
			setState(1604);
			ambiguousIdentifier();
			setState(1619);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
			case 1:
				{
				setState(1606);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1605);
					match(WS);
					}
				}

				setState(1608);
				match(LPAREN);
				setState(1610);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
				case 1:
					{
					setState(1609);
					match(WS);
					}
					break;
				}
				setState(1616);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ENUM - 64)) | (1L << (EQV - 64)) | (1L << (ERASE - 64)) | (1L << (ERROR - 64)) | (1L << (EVENT - 64)) | (1L << (FALSE - 64)) | (1L << (FILECOPY - 64)) | (1L << (FRIEND - 64)) | (1L << (FOR - 64)) | (1L << (FUNCTION - 64)) | (1L << (GET - 64)) | (1L << (GLOBAL - 64)) | (1L << (GOSUB - 64)) | (1L << (GOTO - 64)) | (1L << (IF - 64)) | (1L << (IMP - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (IN - 64)) | (1L << (INPUT - 64)) | (1L << (IS - 64)) | (1L << (INTEGER - 64)) | (1L << (KILL - 64)) | (1L << (LOAD - 64)) | (1L << (LOCK - 64)) | (1L << (LONG - 64)) | (1L << (LOOP - 64)) | (1L << (LEN - 64)) | (1L << (LET - 64)) | (1L << (LIB - 64)) | (1L << (LIKE - 64)) | (1L << (LSET - 64)) | (1L << (ME - 64)) | (1L << (MID - 64)) | (1L << (MKDIR - 64)) | (1L << (MOD - 64)) | (1L << (NAME - 64)) | (1L << (NEXT - 64)) | (1L << (NEW - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (EMPTY - 64)) | (1L << (ON - 64)) | (1L << (OPEN - 64)) | (1L << (OPTIONAL - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (OR - 131)) | (1L << (OUTPUT - 131)) | (1L << (PARAMARRAY - 131)) | (1L << (PRESERVE - 131)) | (1L << (PRINT - 131)) | (1L << (PRIVATE - 131)) | (1L << (PUBLIC - 131)) | (1L << (PUT - 131)) | (1L << (RANDOM - 131)) | (1L << (RANDOMIZE - 131)) | (1L << (RAISEEVENT - 131)) | (1L << (READ - 131)) | (1L << (REDIM - 131)) | (1L << (REM - 131)) | (1L << (RESET - 131)) | (1L << (RESUME - 131)) | (1L << (RETURN - 131)) | (1L << (RMDIR - 131)) | (1L << (RSET - 131)) | (1L << (SAVEPICTURE - 131)) | (1L << (SAVESETTING - 131)) | (1L << (SEEK - 131)) | (1L << (SELECT - 131)) | (1L << (SENDKEYS - 131)) | (1L << (SET - 131)) | (1L << (SETATTR - 131)) | (1L << (SHARED - 131)) | (1L << (SINGLE - 131)) | (1L << (SPC - 131)) | (1L << (STATIC - 131)) | (1L << (STEP - 131)) | (1L << (STRING - 131)) | (1L << (SUB - 131)) | (1L << (TAB - 131)) | (1L << (TEXT - 131)) | (1L << (THEN - 131)) | (1L << (TIME - 131)) | (1L << (TO - 131)) | (1L << (TRUE - 131)) | (1L << (TYPE - 131)) | (1L << (TYPEOF - 131)) | (1L << (UNLOAD - 131)) | (1L << (UNLOCK - 131)) | (1L << (UNTIL - 131)) | (1L << (VARIANT - 131)) | (1L << (VERSION - 131)) | (1L << (WEND - 131)) | (1L << (WHILE - 131)) | (1L << (WIDTH - 131)) | (1L << (WITH - 131)) | (1L << (WITHEVENTS - 131)) | (1L << (WRITE - 131)) | (1L << (XOR - 131)))) != 0) || ((((_la - 202)) & ~0x3f) == 0 && ((1L << (_la - 202)) & ((1L << (LPAREN - 202)) | (1L << (MINUS - 202)) | (1L << (PLUS - 202)) | (1L << (STRINGLITERAL - 202)) | (1L << (OCTLITERAL - 202)) | (1L << (HEXLITERAL - 202)) | (1L << (SHORTLITERAL - 202)) | (1L << (INTEGERLITERAL - 202)) | (1L << (DOUBLELITERAL - 202)) | (1L << (DATELITERAL - 202)) | (1L << (WS - 202)) | (1L << (IDENTIFIER - 202)))) != 0)) {
					{
					setState(1612);
					argsCall();
					setState(1614);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(1613);
						match(WS);
						}
					}

					}
				}

				setState(1618);
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
		enterRule(_localctx, 154, RULE_randomizeStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1621);
			match(RANDOMIZE);
			setState(1624);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1622);
				match(WS);
				setState(1623);
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
		enterRule(_localctx, 156, RULE_redimStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1626);
			match(REDIM);
			setState(1627);
			match(WS);
			setState(1630);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
			case 1:
				{
				setState(1628);
				match(PRESERVE);
				setState(1629);
				match(WS);
				}
				break;
			}
			setState(1632);
			redimSubStmt();
			setState(1643);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,231,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
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
					match(T__0);
					setState(1638);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(1637);
						match(WS);
						}
					}

					setState(1640);
					redimSubStmt();
					}
					} 
				}
				setState(1645);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,231,_ctx);
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
		enterRule(_localctx, 158, RULE_redimSubStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1646);
			ambiguousIdentifier();
			setState(1648);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1647);
				match(WS);
				}
			}

			setState(1650);
			match(LPAREN);
			setState(1652);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
			case 1:
				{
				setState(1651);
				match(WS);
				}
				break;
			}
			setState(1654);
			subscripts();
			setState(1656);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1655);
				match(WS);
				}
			}

			setState(1658);
			match(RPAREN);
			setState(1661);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
			case 1:
				{
				setState(1659);
				match(WS);
				setState(1660);
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
		enterRule(_localctx, 160, RULE_resetStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1663);
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
		enterRule(_localctx, 162, RULE_resumeStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1665);
			match(RESUME);
			setState(1671);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
			case 1:
				{
				setState(1666);
				match(WS);
				setState(1669);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
				case 1:
					{
					setState(1667);
					match(NEXT);
					}
					break;
				case 2:
					{
					setState(1668);
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
		enterRule(_localctx, 164, RULE_returnStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1673);
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
		enterRule(_localctx, 166, RULE_rmdirStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1675);
			match(RMDIR);
			setState(1676);
			match(WS);
			setState(1677);
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
		enterRule(_localctx, 168, RULE_rsetStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1679);
			match(RSET);
			setState(1680);
			match(WS);
			setState(1681);
			implicitCallStmt_InStmt();
			setState(1683);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1682);
				match(WS);
				}
			}

			setState(1685);
			match(EQ);
			setState(1687);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
			case 1:
				{
				setState(1686);
				match(WS);
				}
				break;
			}
			setState(1689);
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
		enterRule(_localctx, 170, RULE_savepictureStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1691);
			match(SAVEPICTURE);
			setState(1692);
			match(WS);
			setState(1693);
			valueStmt(0);
			setState(1695);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1694);
				match(WS);
				}
			}

			setState(1697);
			match(T__0);
			setState(1699);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
			case 1:
				{
				setState(1698);
				match(WS);
				}
				break;
			}
			setState(1701);
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
		enterRule(_localctx, 172, RULE_saveSettingStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1703);
			match(SAVESETTING);
			setState(1704);
			match(WS);
			setState(1705);
			valueStmt(0);
			setState(1707);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1706);
				match(WS);
				}
			}

			setState(1709);
			match(T__0);
			setState(1711);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
			case 1:
				{
				setState(1710);
				match(WS);
				}
				break;
			}
			setState(1713);
			valueStmt(0);
			setState(1715);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1714);
				match(WS);
				}
			}

			setState(1717);
			match(T__0);
			setState(1719);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
			case 1:
				{
				setState(1718);
				match(WS);
				}
				break;
			}
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
			switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
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
		enterRule(_localctx, 174, RULE_seekStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1731);
			match(SEEK);
			setState(1732);
			match(WS);
			setState(1733);
			fileNumber();
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
			switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
			case 1:
				{
				setState(1738);
				match(WS);
				}
				break;
			}
			setState(1741);
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
		enterRule(_localctx, 176, RULE_selectCaseStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1743);
			match(SELECT);
			setState(1744);
			match(WS);
			setState(1745);
			match(CASE);
			setState(1746);
			match(WS);
			setState(1747);
			valueStmt(0);
			setState(1748);
			endOfStatement();
			setState(1752);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(1749);
				sC_Case();
				}
				}
				setState(1754);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1755);
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
		enterRule(_localctx, 178, RULE_sC_Selection);
		int _la;
		try {
			setState(1774);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
			case 1:
				_localctx = new CaseCondIsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1757);
				match(IS);
				setState(1759);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1758);
					match(WS);
					}
				}

				setState(1761);
				comparisonOperator();
				setState(1763);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
				case 1:
					{
					setState(1762);
					match(WS);
					}
					break;
				}
				setState(1765);
				valueStmt(0);
				}
				break;
			case 2:
				_localctx = new CaseCondToContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1767);
				valueStmt(0);
				setState(1768);
				match(WS);
				setState(1769);
				match(TO);
				setState(1770);
				match(WS);
				setState(1771);
				valueStmt(0);
				}
				break;
			case 3:
				_localctx = new CaseCondValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1773);
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
		enterRule(_localctx, 180, RULE_sC_Case);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1776);
			match(CASE);
			setState(1777);
			match(WS);
			setState(1778);
			sC_Cond();
			setState(1779);
			endOfStatement();
			setState(1781);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH) | (1L << END))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ENUM - 64)) | (1L << (EQV - 64)) | (1L << (ERASE - 64)) | (1L << (ERROR - 64)) | (1L << (EVENT - 64)) | (1L << (EXIT_DO - 64)) | (1L << (EXIT_FOR - 64)) | (1L << (EXIT_FUNCTION - 64)) | (1L << (EXIT_PROPERTY - 64)) | (1L << (EXIT_SUB - 64)) | (1L << (EXIT_RULE - 64)) | (1L << (FALSE - 64)) | (1L << (FILECOPY - 64)) | (1L << (FRIEND - 64)) | (1L << (FOR - 64)) | (1L << (FUNCTION - 64)) | (1L << (GET - 64)) | (1L << (GLOBAL - 64)) | (1L << (GOSUB - 64)) | (1L << (GOTO - 64)) | (1L << (IF - 64)) | (1L << (IMP - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (IN - 64)) | (1L << (INPUT - 64)) | (1L << (IS - 64)) | (1L << (INTEGER - 64)) | (1L << (KILL - 64)) | (1L << (LOAD - 64)) | (1L << (LOCK - 64)) | (1L << (LONG - 64)) | (1L << (LOOP - 64)) | (1L << (LEN - 64)) | (1L << (LET - 64)) | (1L << (LIB - 64)) | (1L << (LIKE - 64)) | (1L << (LINE_INPUT - 64)) | (1L << (LSET - 64)) | (1L << (ME - 64)) | (1L << (MID - 64)) | (1L << (MKDIR - 64)) | (1L << (MOD - 64)) | (1L << (NAME - 64)) | (1L << (NEXT - 64)) | (1L << (NEW - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (EMPTY - 64)) | (1L << (ON - 64)) | (1L << (ON_ERROR - 64)) | (1L << (ON_LOCAL_ERROR - 64)) | (1L << (OPEN - 64)) | (1L << (OPTIONAL - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (OR - 131)) | (1L << (OUTPUT - 131)) | (1L << (PARAMARRAY - 131)) | (1L << (PRESERVE - 131)) | (1L << (PRINT - 131)) | (1L << (PRIVATE - 131)) | (1L << (PUBLIC - 131)) | (1L << (PUT - 131)) | (1L << (RANDOM - 131)) | (1L << (RANDOMIZE - 131)) | (1L << (RAISEEVENT - 131)) | (1L << (READ - 131)) | (1L << (REDIM - 131)) | (1L << (REM - 131)) | (1L << (RESET - 131)) | (1L << (RESUME - 131)) | (1L << (RETURN - 131)) | (1L << (RMDIR - 131)) | (1L << (RSET - 131)) | (1L << (SAVEPICTURE - 131)) | (1L << (SAVESETTING - 131)) | (1L << (SEEK - 131)) | (1L << (SELECT - 131)) | (1L << (SENDKEYS - 131)) | (1L << (SET - 131)) | (1L << (SETATTR - 131)) | (1L << (SHARED - 131)) | (1L << (SINGLE - 131)) | (1L << (SPC - 131)) | (1L << (STATIC - 131)) | (1L << (STEP - 131)) | (1L << (STOP - 131)) | (1L << (STRING - 131)) | (1L << (SUB - 131)) | (1L << (TAB - 131)) | (1L << (TEXT - 131)) | (1L << (THEN - 131)) | (1L << (TIME - 131)) | (1L << (TO - 131)) | (1L << (TRUE - 131)) | (1L << (TYPE - 131)) | (1L << (TYPEOF - 131)) | (1L << (UNLOAD - 131)) | (1L << (UNLOCK - 131)) | (1L << (UNTIL - 131)) | (1L << (VARIANT - 131)) | (1L << (VERSION - 131)) | (1L << (WEND - 131)) | (1L << (WHILE - 131)) | (1L << (WIDTH - 131)) | (1L << (WITH - 131)) | (1L << (WITHEVENTS - 131)) | (1L << (WRITE - 131)) | (1L << (XOR - 131)))) != 0) || _la==WS || _la==IDENTIFIER) {
				{
				setState(1780);
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
		enterRule(_localctx, 182, RULE_sC_Cond);
		int _la;
		try {
			int _alt;
			setState(1798);
			switch (_input.LA(1)) {
			case ELSE:
				_localctx = new CaseCondElseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1783);
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
				setState(1784);
				sC_Selection();
				setState(1795);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,257,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1786);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1785);
							match(WS);
							}
						}

						setState(1788);
						match(T__0);
						setState(1790);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
						case 1:
							{
							setState(1789);
							match(WS);
							}
							break;
						}
						setState(1792);
						sC_Selection();
						}
						} 
					}
					setState(1797);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,257,_ctx);
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
		enterRule(_localctx, 184, RULE_sendkeysStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1800);
			match(SENDKEYS);
			setState(1801);
			match(WS);
			setState(1802);
			valueStmt(0);
			setState(1811);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
			case 1:
				{
				setState(1804);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1803);
					match(WS);
					}
				}

				setState(1806);
				match(T__0);
				setState(1808);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
				case 1:
					{
					setState(1807);
					match(WS);
					}
					break;
				}
				setState(1810);
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
		enterRule(_localctx, 186, RULE_setattrStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1813);
			match(SETATTR);
			setState(1814);
			match(WS);
			setState(1815);
			valueStmt(0);
			setState(1817);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1816);
				match(WS);
				}
			}

			setState(1819);
			match(T__0);
			setState(1821);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
			case 1:
				{
				setState(1820);
				match(WS);
				}
				break;
			}
			setState(1823);
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
		enterRule(_localctx, 188, RULE_setStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1825);
			match(SET);
			setState(1826);
			match(WS);
			setState(1827);
			implicitCallStmt_InStmt();
			setState(1829);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1828);
				match(WS);
				}
			}

			setState(1831);
			match(EQ);
			setState(1833);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,265,_ctx) ) {
			case 1:
				{
				setState(1832);
				match(WS);
				}
				break;
			}
			setState(1835);
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
		enterRule(_localctx, 190, RULE_stopStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1837);
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
		enterRule(_localctx, 192, RULE_subStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1842);
			_la = _input.LA(1);
			if (((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (FRIEND - 77)) | (1L << (GLOBAL - 77)) | (1L << (PRIVATE - 77)))) != 0) || _la==PUBLIC) {
				{
				setState(1839);
				visibility();
				setState(1840);
				match(WS);
				}
			}

			setState(1846);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(1844);
				match(STATIC);
				setState(1845);
				match(WS);
				}
			}

			setState(1848);
			match(SUB);
			setState(1850);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1849);
				match(WS);
				}
			}

			setState(1852);
			ambiguousIdentifier();
			setState(1857);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,270,_ctx) ) {
			case 1:
				{
				setState(1854);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1853);
					match(WS);
					}
				}

				setState(1856);
				argList();
				}
				break;
			}
			setState(1859);
			endOfStatement();
			setState(1861);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH) | (1L << END))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ENUM - 64)) | (1L << (EQV - 64)) | (1L << (ERASE - 64)) | (1L << (ERROR - 64)) | (1L << (EVENT - 64)) | (1L << (EXIT_DO - 64)) | (1L << (EXIT_FOR - 64)) | (1L << (EXIT_FUNCTION - 64)) | (1L << (EXIT_PROPERTY - 64)) | (1L << (EXIT_SUB - 64)) | (1L << (EXIT_RULE - 64)) | (1L << (FALSE - 64)) | (1L << (FILECOPY - 64)) | (1L << (FRIEND - 64)) | (1L << (FOR - 64)) | (1L << (FUNCTION - 64)) | (1L << (GET - 64)) | (1L << (GLOBAL - 64)) | (1L << (GOSUB - 64)) | (1L << (GOTO - 64)) | (1L << (IF - 64)) | (1L << (IMP - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (IN - 64)) | (1L << (INPUT - 64)) | (1L << (IS - 64)) | (1L << (INTEGER - 64)) | (1L << (KILL - 64)) | (1L << (LOAD - 64)) | (1L << (LOCK - 64)) | (1L << (LONG - 64)) | (1L << (LOOP - 64)) | (1L << (LEN - 64)) | (1L << (LET - 64)) | (1L << (LIB - 64)) | (1L << (LIKE - 64)) | (1L << (LINE_INPUT - 64)) | (1L << (LSET - 64)) | (1L << (ME - 64)) | (1L << (MID - 64)) | (1L << (MKDIR - 64)) | (1L << (MOD - 64)) | (1L << (NAME - 64)) | (1L << (NEXT - 64)) | (1L << (NEW - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (EMPTY - 64)) | (1L << (ON - 64)) | (1L << (ON_ERROR - 64)) | (1L << (ON_LOCAL_ERROR - 64)) | (1L << (OPEN - 64)) | (1L << (OPTIONAL - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (OR - 131)) | (1L << (OUTPUT - 131)) | (1L << (PARAMARRAY - 131)) | (1L << (PRESERVE - 131)) | (1L << (PRINT - 131)) | (1L << (PRIVATE - 131)) | (1L << (PUBLIC - 131)) | (1L << (PUT - 131)) | (1L << (RANDOM - 131)) | (1L << (RANDOMIZE - 131)) | (1L << (RAISEEVENT - 131)) | (1L << (READ - 131)) | (1L << (REDIM - 131)) | (1L << (REM - 131)) | (1L << (RESET - 131)) | (1L << (RESUME - 131)) | (1L << (RETURN - 131)) | (1L << (RMDIR - 131)) | (1L << (RSET - 131)) | (1L << (SAVEPICTURE - 131)) | (1L << (SAVESETTING - 131)) | (1L << (SEEK - 131)) | (1L << (SELECT - 131)) | (1L << (SENDKEYS - 131)) | (1L << (SET - 131)) | (1L << (SETATTR - 131)) | (1L << (SHARED - 131)) | (1L << (SINGLE - 131)) | (1L << (SPC - 131)) | (1L << (STATIC - 131)) | (1L << (STEP - 131)) | (1L << (STOP - 131)) | (1L << (STRING - 131)) | (1L << (SUB - 131)) | (1L << (TAB - 131)) | (1L << (TEXT - 131)) | (1L << (THEN - 131)) | (1L << (TIME - 131)) | (1L << (TO - 131)) | (1L << (TRUE - 131)) | (1L << (TYPE - 131)) | (1L << (TYPEOF - 131)) | (1L << (UNLOAD - 131)) | (1L << (UNLOCK - 131)) | (1L << (UNTIL - 131)) | (1L << (VARIANT - 131)) | (1L << (VERSION - 131)) | (1L << (WEND - 131)) | (1L << (WHILE - 131)) | (1L << (WIDTH - 131)) | (1L << (WITH - 131)) | (1L << (WITHEVENTS - 131)) | (1L << (WRITE - 131)) | (1L << (XOR - 131)))) != 0) || _la==WS || _la==IDENTIFIER) {
				{
				setState(1860);
				block();
				}
			}

			setState(1863);
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
		enterRule(_localctx, 194, RULE_timeStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1865);
			match(TIME);
			setState(1867);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1866);
				match(WS);
				}
			}

			setState(1869);
			match(EQ);
			setState(1871);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
			case 1:
				{
				setState(1870);
				match(WS);
				}
				break;
			}
			setState(1873);
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
		enterRule(_localctx, 196, RULE_typeStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1878);
			_la = _input.LA(1);
			if (((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (FRIEND - 77)) | (1L << (GLOBAL - 77)) | (1L << (PRIVATE - 77)))) != 0) || _la==PUBLIC) {
				{
				setState(1875);
				visibility();
				setState(1876);
				match(WS);
				}
			}

			setState(1880);
			match(TYPE);
			setState(1881);
			match(WS);
			setState(1882);
			ambiguousIdentifier();
			setState(1883);
			endOfStatement();
			setState(1887);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ENUM - 64)) | (1L << (EQV - 64)) | (1L << (ERASE - 64)) | (1L << (ERROR - 64)) | (1L << (EVENT - 64)) | (1L << (FALSE - 64)) | (1L << (FILECOPY - 64)) | (1L << (FRIEND - 64)) | (1L << (FOR - 64)) | (1L << (FUNCTION - 64)) | (1L << (GET - 64)) | (1L << (GLOBAL - 64)) | (1L << (GOSUB - 64)) | (1L << (GOTO - 64)) | (1L << (IF - 64)) | (1L << (IMP - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (IN - 64)) | (1L << (INPUT - 64)) | (1L << (IS - 64)) | (1L << (INTEGER - 64)) | (1L << (KILL - 64)) | (1L << (LOAD - 64)) | (1L << (LOCK - 64)) | (1L << (LONG - 64)) | (1L << (LOOP - 64)) | (1L << (LEN - 64)) | (1L << (LET - 64)) | (1L << (LIB - 64)) | (1L << (LIKE - 64)) | (1L << (LSET - 64)) | (1L << (ME - 64)) | (1L << (MID - 64)) | (1L << (MKDIR - 64)) | (1L << (MOD - 64)) | (1L << (NAME - 64)) | (1L << (NEXT - 64)) | (1L << (NEW - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (EMPTY - 64)) | (1L << (ON - 64)) | (1L << (OPEN - 64)) | (1L << (OPTIONAL - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (OR - 131)) | (1L << (OUTPUT - 131)) | (1L << (PARAMARRAY - 131)) | (1L << (PRESERVE - 131)) | (1L << (PRINT - 131)) | (1L << (PRIVATE - 131)) | (1L << (PUBLIC - 131)) | (1L << (PUT - 131)) | (1L << (RANDOM - 131)) | (1L << (RANDOMIZE - 131)) | (1L << (RAISEEVENT - 131)) | (1L << (READ - 131)) | (1L << (REDIM - 131)) | (1L << (REM - 131)) | (1L << (RESET - 131)) | (1L << (RESUME - 131)) | (1L << (RETURN - 131)) | (1L << (RMDIR - 131)) | (1L << (RSET - 131)) | (1L << (SAVEPICTURE - 131)) | (1L << (SAVESETTING - 131)) | (1L << (SEEK - 131)) | (1L << (SELECT - 131)) | (1L << (SENDKEYS - 131)) | (1L << (SET - 131)) | (1L << (SETATTR - 131)) | (1L << (SHARED - 131)) | (1L << (SINGLE - 131)) | (1L << (SPC - 131)) | (1L << (STATIC - 131)) | (1L << (STEP - 131)) | (1L << (STRING - 131)) | (1L << (SUB - 131)) | (1L << (TAB - 131)) | (1L << (TEXT - 131)) | (1L << (THEN - 131)) | (1L << (TIME - 131)) | (1L << (TO - 131)) | (1L << (TRUE - 131)) | (1L << (TYPE - 131)) | (1L << (TYPEOF - 131)) | (1L << (UNLOAD - 131)) | (1L << (UNLOCK - 131)) | (1L << (UNTIL - 131)) | (1L << (VARIANT - 131)) | (1L << (VERSION - 131)) | (1L << (WEND - 131)) | (1L << (WHILE - 131)) | (1L << (WIDTH - 131)) | (1L << (WITH - 131)) | (1L << (WITHEVENTS - 131)) | (1L << (WRITE - 131)) | (1L << (XOR - 131)))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(1884);
				typeStmt_Element();
				}
				}
				setState(1889);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1890);
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
		enterRule(_localctx, 198, RULE_typeStmt_Element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1892);
			ambiguousIdentifier();
			setState(1907);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,280,_ctx) ) {
			case 1:
				{
				setState(1894);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1893);
					match(WS);
					}
				}

				setState(1896);
				match(LPAREN);
				setState(1901);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
				case 1:
					{
					setState(1898);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(1897);
						match(WS);
						}
					}

					setState(1900);
					constSubscripts();
					}
					break;
				}
				setState(1904);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1903);
					match(WS);
					}
				}

				setState(1906);
				match(RPAREN);
				}
				break;
			}
			setState(1909);
			match(WS);
			setState(1910);
			asTypeClause();
			setState(1911);
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
		enterRule(_localctx, 200, RULE_typeOfIsStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1913);
			match(TYPEOF);
			setState(1914);
			match(WS);
			setState(1915);
			valueStmt(0);
			setState(1916);
			match(WS);
			setState(1917);
			match(IS);
			setState(1918);
			match(WS);
			setState(1919);
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
		enterRule(_localctx, 202, RULE_unloadStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1921);
			match(UNLOAD);
			setState(1922);
			match(WS);
			setState(1923);
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
		enterRule(_localctx, 204, RULE_unlockStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1925);
			match(UNLOCK);
			setState(1926);
			match(WS);
			setState(1927);
			fileNumber();
			setState(1942);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
			case 1:
				{
				setState(1929);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1928);
					match(WS);
					}
				}

				setState(1931);
				match(T__0);
				setState(1933);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
				case 1:
					{
					setState(1932);
					match(WS);
					}
					break;
				}
				setState(1935);
				valueStmt(0);
				setState(1940);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
				case 1:
					{
					setState(1936);
					match(WS);
					setState(1937);
					match(TO);
					setState(1938);
					match(WS);
					setState(1939);
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
		int _startState = 206;
		enterRecursionRule(_localctx, 206, RULE_constValueExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1969);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
			case 1:
				{
				_localctx = new CveLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1945);
				literal();
				}
				break;
			case 2:
				{
				_localctx = new CveIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1946);
				ambiguousIdentifier();
				setState(1951);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,285,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1947);
						match(T__2);
						setState(1948);
						ambiguousIdentifier();
						}
						} 
					}
					setState(1953);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,285,_ctx);
				}
				}
				break;
			case 3:
				{
				_localctx = new CveNegationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1954);
				match(MINUS);
				setState(1956);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1955);
					match(WS);
					}
				}

				setState(1958);
				constValueExpr(21);
				}
				break;
			case 4:
				{
				_localctx = new CvePlusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1959);
				match(PLUS);
				setState(1961);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1960);
					match(WS);
					}
				}

				setState(1963);
				constValueExpr(20);
				}
				break;
			case 5:
				{
				_localctx = new CveNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1964);
				match(NOT);
				setState(1966);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1965);
					match(WS);
					}
				}

				setState(1968);
				constValueExpr(6);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,329,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2142);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,328,_ctx) ) {
					case 1:
						{
						_localctx = new CvePowContext(new ConstValueExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_constValueExpr);
						setState(1971);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(1973);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1972);
							match(WS);
							}
						}

						setState(1975);
						match(POW);
						setState(1977);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1976);
							match(WS);
							}
						}

						setState(1979);
						constValueExpr(23);
						}
						break;
					case 2:
						{
						_localctx = new CveMultContext(new ConstValueExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_constValueExpr);
						setState(1980);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1982);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1981);
							match(WS);
							}
						}

						setState(1984);
						match(MULT);
						setState(1986);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1985);
							match(WS);
							}
						}

						setState(1988);
						constValueExpr(20);
						}
						break;
					case 3:
						{
						_localctx = new CveDivContext(new ConstValueExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_constValueExpr);
						setState(1989);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1991);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1990);
							match(WS);
							}
						}

						setState(1993);
						match(DIV);
						setState(1995);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1994);
							match(WS);
							}
						}

						setState(1997);
						constValueExpr(19);
						}
						break;
					case 4:
						{
						_localctx = new CveModContext(new ConstValueExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_constValueExpr);
						setState(1998);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(2000);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1999);
							match(WS);
							}
						}

						setState(2002);
						match(MOD);
						setState(2004);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2003);
							match(WS);
							}
						}

						setState(2006);
						constValueExpr(18);
						}
						break;
					case 5:
						{
						_localctx = new CveAddContext(new ConstValueExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_constValueExpr);
						setState(2007);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(2009);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2008);
							match(WS);
							}
						}

						setState(2011);
						match(PLUS);
						setState(2013);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2012);
							match(WS);
							}
						}

						setState(2015);
						constValueExpr(17);
						}
						break;
					case 6:
						{
						_localctx = new CveMinusContext(new ConstValueExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_constValueExpr);
						setState(2016);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(2018);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2017);
							match(WS);
							}
						}

						setState(2020);
						match(MINUS);
						setState(2022);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2021);
							match(WS);
							}
						}

						setState(2024);
						constValueExpr(16);
						}
						break;
					case 7:
						{
						_localctx = new CveAmpContext(new ConstValueExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_constValueExpr);
						setState(2025);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(2027);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2026);
							match(WS);
							}
						}

						setState(2029);
						match(AMPERSAND);
						setState(2031);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2030);
							match(WS);
							}
						}

						setState(2033);
						constValueExpr(15);
						}
						break;
					case 8:
						{
						_localctx = new CveLikeContext(new ConstValueExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_constValueExpr);
						setState(2034);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(2036);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2035);
							match(WS);
							}
						}

						setState(2038);
						match(LIKE);
						setState(2040);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2039);
							match(WS);
							}
						}

						setState(2042);
						constValueExpr(14);
						}
						break;
					case 9:
						{
						_localctx = new CveGeqContext(new ConstValueExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_constValueExpr);
						setState(2043);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(2045);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2044);
							match(WS);
							}
						}

						setState(2047);
						match(GEQ);
						setState(2049);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2048);
							match(WS);
							}
						}

						setState(2051);
						constValueExpr(13);
						}
						break;
					case 10:
						{
						_localctx = new CveLeqContext(new ConstValueExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_constValueExpr);
						setState(2052);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(2054);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2053);
							match(WS);
							}
						}

						setState(2056);
						match(LEQ);
						setState(2058);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2057);
							match(WS);
							}
						}

						setState(2060);
						constValueExpr(12);
						}
						break;
					case 11:
						{
						_localctx = new CveGtContext(new ConstValueExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_constValueExpr);
						setState(2061);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(2063);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2062);
							match(WS);
							}
						}

						setState(2065);
						match(GT);
						setState(2067);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2066);
							match(WS);
							}
						}

						setState(2069);
						constValueExpr(11);
						}
						break;
					case 12:
						{
						_localctx = new CveLtContext(new ConstValueExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_constValueExpr);
						setState(2070);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(2072);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2071);
							match(WS);
							}
						}

						setState(2074);
						match(LT);
						setState(2076);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2075);
							match(WS);
							}
						}

						setState(2078);
						constValueExpr(10);
						}
						break;
					case 13:
						{
						_localctx = new CveNeqContext(new ConstValueExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_constValueExpr);
						setState(2079);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(2081);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2080);
							match(WS);
							}
						}

						setState(2083);
						match(NEQ);
						setState(2085);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2084);
							match(WS);
							}
						}

						setState(2087);
						constValueExpr(9);
						}
						break;
					case 14:
						{
						_localctx = new CveEqContext(new ConstValueExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_constValueExpr);
						setState(2088);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(2090);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2089);
							match(WS);
							}
						}

						setState(2092);
						match(EQ);
						setState(2094);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2093);
							match(WS);
							}
						}

						setState(2096);
						constValueExpr(8);
						}
						break;
					case 15:
						{
						_localctx = new CveAndContext(new ConstValueExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_constValueExpr);
						setState(2097);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2099);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2098);
							match(WS);
							}
						}

						setState(2101);
						match(AND);
						setState(2103);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2102);
							match(WS);
							}
						}

						setState(2105);
						constValueExpr(6);
						}
						break;
					case 16:
						{
						_localctx = new CveOrContext(new ConstValueExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_constValueExpr);
						setState(2106);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2108);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2107);
							match(WS);
							}
						}

						setState(2110);
						match(OR);
						setState(2112);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2111);
							match(WS);
							}
						}

						setState(2114);
						constValueExpr(5);
						}
						break;
					case 17:
						{
						_localctx = new CveXorContext(new ConstValueExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_constValueExpr);
						setState(2115);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2117);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2116);
							match(WS);
							}
						}

						setState(2119);
						match(XOR);
						setState(2121);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2120);
							match(WS);
							}
						}

						setState(2123);
						constValueExpr(4);
						}
						break;
					case 18:
						{
						_localctx = new CveEqvContext(new ConstValueExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_constValueExpr);
						setState(2124);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2126);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2125);
							match(WS);
							}
						}

						setState(2128);
						match(EQV);
						setState(2130);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2129);
							match(WS);
							}
						}

						setState(2132);
						constValueExpr(3);
						}
						break;
					case 19:
						{
						_localctx = new CveImpContext(new ConstValueExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_constValueExpr);
						setState(2133);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2135);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2134);
							match(WS);
							}
						}

						setState(2137);
						match(IMP);
						setState(2139);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2138);
							match(WS);
							}
						}

						setState(2141);
						constValueExpr(2);
						}
						break;
					}
					} 
				}
				setState(2146);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,329,_ctx);
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
		int _startState = 208;
		enterRecursionRule(_localctx, 208, RULE_valueStmt, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,339,_ctx) ) {
			case 1:
				{
				_localctx = new VsLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2148);
				literal();
				}
				break;
			case 2:
				{
				_localctx = new VsICSContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2149);
				implicitCallStmt_InStmt();
				}
				break;
			case 3:
				{
				_localctx = new VsStructContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2150);
				match(LPAREN);
				setState(2152);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,330,_ctx) ) {
				case 1:
					{
					setState(2151);
					match(WS);
					}
					break;
				}
				setState(2154);
				valueStmt(0);
				setState(2165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0 || _la==WS) {
					{
					{
					setState(2156);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(2155);
						match(WS);
						}
					}

					setState(2158);
					match(T__0);
					setState(2160);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,332,_ctx) ) {
					case 1:
						{
						setState(2159);
						match(WS);
						}
						break;
					}
					setState(2162);
					valueStmt(0);
					}
					}
					setState(2167);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2168);
				match(RPAREN);
				}
				break;
			case 4:
				{
				_localctx = new VsNewContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2170);
				match(NEW);
				setState(2172);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(2171);
					match(WS);
					}
				}

				setState(2174);
				complexType();
				}
				break;
			case 5:
				{
				_localctx = new VsTypeOfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2175);
				typeOfIsStmt();
				}
				break;
			case 6:
				{
				_localctx = new VsAddressOfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2176);
				match(ADDRESSOF);
				setState(2178);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,335,_ctx) ) {
				case 1:
					{
					setState(2177);
					match(WS);
					}
					break;
				}
				setState(2180);
				valueStmt(24);
				}
				break;
			case 7:
				{
				_localctx = new VsNegationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2181);
				match(MINUS);
				setState(2183);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,336,_ctx) ) {
				case 1:
					{
					setState(2182);
					match(WS);
					}
					break;
				}
				setState(2185);
				valueStmt(22);
				}
				break;
			case 8:
				{
				_localctx = new VsPlusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2186);
				match(PLUS);
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
				valueStmt(21);
				}
				break;
			case 9:
				{
				_localctx = new VsNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2191);
				match(NOT);
				setState(2193);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,338,_ctx) ) {
				case 1:
					{
					setState(2192);
					match(WS);
					}
					break;
				}
				setState(2195);
				valueStmt(6);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2380);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,381,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2378);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,380,_ctx) ) {
					case 1:
						{
						_localctx = new VsPowContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(2198);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(2200);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2199);
							match(WS);
							}
						}

						setState(2202);
						match(POW);
						setState(2204);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,341,_ctx) ) {
						case 1:
							{
							setState(2203);
							match(WS);
							}
							break;
						}
						setState(2206);
						valueStmt(24);
						}
						break;
					case 2:
						{
						_localctx = new VsMultContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(2207);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(2209);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2208);
							match(WS);
							}
						}

						setState(2211);
						match(MULT);
						setState(2213);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,343,_ctx) ) {
						case 1:
							{
							setState(2212);
							match(WS);
							}
							break;
						}
						setState(2215);
						valueStmt(21);
						}
						break;
					case 3:
						{
						_localctx = new VsDivContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(2216);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(2218);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2217);
							match(WS);
							}
						}

						setState(2220);
						match(DIV);
						setState(2222);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,345,_ctx) ) {
						case 1:
							{
							setState(2221);
							match(WS);
							}
							break;
						}
						setState(2224);
						valueStmt(20);
						}
						break;
					case 4:
						{
						_localctx = new VsModContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(2225);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(2227);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2226);
							match(WS);
							}
						}

						setState(2229);
						match(MOD);
						setState(2231);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,347,_ctx) ) {
						case 1:
							{
							setState(2230);
							match(WS);
							}
							break;
						}
						setState(2233);
						valueStmt(19);
						}
						break;
					case 5:
						{
						_localctx = new VsAddContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(2234);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(2236);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2235);
							match(WS);
							}
						}

						setState(2238);
						match(PLUS);
						setState(2240);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,349,_ctx) ) {
						case 1:
							{
							setState(2239);
							match(WS);
							}
							break;
						}
						setState(2242);
						valueStmt(18);
						}
						break;
					case 6:
						{
						_localctx = new VsMinusContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(2243);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(2245);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2244);
							match(WS);
							}
						}

						setState(2247);
						match(MINUS);
						setState(2249);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,351,_ctx) ) {
						case 1:
							{
							setState(2248);
							match(WS);
							}
							break;
						}
						setState(2251);
						valueStmt(17);
						}
						break;
					case 7:
						{
						_localctx = new VsAmpContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(2252);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(2254);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2253);
							match(WS);
							}
						}

						setState(2256);
						match(AMPERSAND);
						setState(2258);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,353,_ctx) ) {
						case 1:
							{
							setState(2257);
							match(WS);
							}
							break;
						}
						setState(2260);
						valueStmt(16);
						}
						break;
					case 8:
						{
						_localctx = new VsLikeContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(2261);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(2263);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2262);
							match(WS);
							}
						}

						setState(2265);
						match(LIKE);
						setState(2267);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,355,_ctx) ) {
						case 1:
							{
							setState(2266);
							match(WS);
							}
							break;
						}
						setState(2269);
						valueStmt(15);
						}
						break;
					case 9:
						{
						_localctx = new VsIsContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(2270);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(2272);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2271);
							match(WS);
							}
						}

						setState(2274);
						match(IS);
						setState(2276);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,357,_ctx) ) {
						case 1:
							{
							setState(2275);
							match(WS);
							}
							break;
						}
						setState(2278);
						valueStmt(14);
						}
						break;
					case 10:
						{
						_localctx = new VsGeqContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(2279);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(2281);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2280);
							match(WS);
							}
						}

						setState(2283);
						match(GEQ);
						setState(2285);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,359,_ctx) ) {
						case 1:
							{
							setState(2284);
							match(WS);
							}
							break;
						}
						setState(2287);
						valueStmt(13);
						}
						break;
					case 11:
						{
						_localctx = new VsLeqContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(2288);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(2290);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2289);
							match(WS);
							}
						}

						setState(2292);
						match(LEQ);
						setState(2294);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,361,_ctx) ) {
						case 1:
							{
							setState(2293);
							match(WS);
							}
							break;
						}
						setState(2296);
						valueStmt(12);
						}
						break;
					case 12:
						{
						_localctx = new VsGtContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(2297);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(2299);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2298);
							match(WS);
							}
						}

						setState(2301);
						match(GT);
						setState(2303);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,363,_ctx) ) {
						case 1:
							{
							setState(2302);
							match(WS);
							}
							break;
						}
						setState(2305);
						valueStmt(11);
						}
						break;
					case 13:
						{
						_localctx = new VsLtContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(2306);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(2308);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2307);
							match(WS);
							}
						}

						setState(2310);
						match(LT);
						setState(2312);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,365,_ctx) ) {
						case 1:
							{
							setState(2311);
							match(WS);
							}
							break;
						}
						setState(2314);
						valueStmt(10);
						}
						break;
					case 14:
						{
						_localctx = new VsNeqContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(2315);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(2317);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2316);
							match(WS);
							}
						}

						setState(2319);
						match(NEQ);
						setState(2321);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,367,_ctx) ) {
						case 1:
							{
							setState(2320);
							match(WS);
							}
							break;
						}
						setState(2323);
						valueStmt(9);
						}
						break;
					case 15:
						{
						_localctx = new VsEqContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(2324);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(2326);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2325);
							match(WS);
							}
						}

						setState(2328);
						match(EQ);
						setState(2330);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,369,_ctx) ) {
						case 1:
							{
							setState(2329);
							match(WS);
							}
							break;
						}
						setState(2332);
						valueStmt(8);
						}
						break;
					case 16:
						{
						_localctx = new VsAndContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(2333);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2335);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2334);
							match(WS);
							}
						}

						setState(2337);
						match(AND);
						setState(2339);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,371,_ctx) ) {
						case 1:
							{
							setState(2338);
							match(WS);
							}
							break;
						}
						setState(2341);
						valueStmt(6);
						}
						break;
					case 17:
						{
						_localctx = new VsOrContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(2342);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2344);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2343);
							match(WS);
							}
						}

						setState(2346);
						match(OR);
						setState(2348);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,373,_ctx) ) {
						case 1:
							{
							setState(2347);
							match(WS);
							}
							break;
						}
						setState(2350);
						valueStmt(5);
						}
						break;
					case 18:
						{
						_localctx = new VsXorContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(2351);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2353);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2352);
							match(WS);
							}
						}

						setState(2355);
						match(XOR);
						setState(2357);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,375,_ctx) ) {
						case 1:
							{
							setState(2356);
							match(WS);
							}
							break;
						}
						setState(2359);
						valueStmt(4);
						}
						break;
					case 19:
						{
						_localctx = new VsEqvContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(2360);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2362);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2361);
							match(WS);
							}
						}

						setState(2364);
						match(EQV);
						setState(2366);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,377,_ctx) ) {
						case 1:
							{
							setState(2365);
							match(WS);
							}
							break;
						}
						setState(2368);
						valueStmt(3);
						}
						break;
					case 20:
						{
						_localctx = new VsImpContext(new ValueStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueStmt);
						setState(2369);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2371);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2370);
							match(WS);
							}
						}

						setState(2373);
						match(IMP);
						setState(2375);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,379,_ctx) ) {
						case 1:
							{
							setState(2374);
							match(WS);
							}
							break;
						}
						setState(2377);
						valueStmt(2);
						}
						break;
					}
					} 
				}
				setState(2382);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,381,_ctx);
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
		enterRule(_localctx, 210, RULE_variableStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2386);
			switch (_input.LA(1)) {
			case DIM:
				{
				setState(2383);
				match(DIM);
				}
				break;
			case STATIC:
				{
				setState(2384);
				match(STATIC);
				}
				break;
			case FRIEND:
			case GLOBAL:
			case PRIVATE:
			case PUBLIC:
				{
				setState(2385);
				visibility();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2388);
			match(WS);
			setState(2391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,383,_ctx) ) {
			case 1:
				{
				setState(2389);
				match(WITHEVENTS);
				setState(2390);
				match(WS);
				}
				break;
			}
			setState(2393);
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
		enterRule(_localctx, 212, RULE_variableListStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2395);
			variableSubStmt();
			setState(2406);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,386,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2397);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(2396);
						match(WS);
						}
					}

					setState(2399);
					match(T__0);
					setState(2401);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(2400);
						match(WS);
						}
					}

					setState(2403);
					variableSubStmt();
					}
					} 
				}
				setState(2408);
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
		enterRule(_localctx, 214, RULE_variableSubStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2409);
			ambiguousIdentifier();
			setState(2427);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,392,_ctx) ) {
			case 1:
				{
				setState(2411);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(2410);
					match(WS);
					}
				}

				setState(2413);
				match(LPAREN);
				setState(2415);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(2414);
					match(WS);
					}
				}

				setState(2421);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ENUM - 64)) | (1L << (EQV - 64)) | (1L << (ERASE - 64)) | (1L << (ERROR - 64)) | (1L << (EVENT - 64)) | (1L << (FALSE - 64)) | (1L << (FILECOPY - 64)) | (1L << (FRIEND - 64)) | (1L << (FOR - 64)) | (1L << (FUNCTION - 64)) | (1L << (GET - 64)) | (1L << (GLOBAL - 64)) | (1L << (GOSUB - 64)) | (1L << (GOTO - 64)) | (1L << (IF - 64)) | (1L << (IMP - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (IN - 64)) | (1L << (INPUT - 64)) | (1L << (IS - 64)) | (1L << (INTEGER - 64)) | (1L << (KILL - 64)) | (1L << (LOAD - 64)) | (1L << (LOCK - 64)) | (1L << (LONG - 64)) | (1L << (LOOP - 64)) | (1L << (LEN - 64)) | (1L << (LET - 64)) | (1L << (LIB - 64)) | (1L << (LIKE - 64)) | (1L << (LSET - 64)) | (1L << (ME - 64)) | (1L << (MID - 64)) | (1L << (MKDIR - 64)) | (1L << (MOD - 64)) | (1L << (NAME - 64)) | (1L << (NEXT - 64)) | (1L << (NEW - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (EMPTY - 64)) | (1L << (ON - 64)) | (1L << (OPEN - 64)) | (1L << (OPTIONAL - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (OR - 131)) | (1L << (OUTPUT - 131)) | (1L << (PARAMARRAY - 131)) | (1L << (PRESERVE - 131)) | (1L << (PRINT - 131)) | (1L << (PRIVATE - 131)) | (1L << (PUBLIC - 131)) | (1L << (PUT - 131)) | (1L << (RANDOM - 131)) | (1L << (RANDOMIZE - 131)) | (1L << (RAISEEVENT - 131)) | (1L << (READ - 131)) | (1L << (REDIM - 131)) | (1L << (REM - 131)) | (1L << (RESET - 131)) | (1L << (RESUME - 131)) | (1L << (RETURN - 131)) | (1L << (RMDIR - 131)) | (1L << (RSET - 131)) | (1L << (SAVEPICTURE - 131)) | (1L << (SAVESETTING - 131)) | (1L << (SEEK - 131)) | (1L << (SELECT - 131)) | (1L << (SENDKEYS - 131)) | (1L << (SET - 131)) | (1L << (SETATTR - 131)) | (1L << (SHARED - 131)) | (1L << (SINGLE - 131)) | (1L << (SPC - 131)) | (1L << (STATIC - 131)) | (1L << (STEP - 131)) | (1L << (STRING - 131)) | (1L << (SUB - 131)) | (1L << (TAB - 131)) | (1L << (TEXT - 131)) | (1L << (THEN - 131)) | (1L << (TIME - 131)) | (1L << (TO - 131)) | (1L << (TRUE - 131)) | (1L << (TYPE - 131)) | (1L << (TYPEOF - 131)) | (1L << (UNLOAD - 131)) | (1L << (UNLOCK - 131)) | (1L << (UNTIL - 131)) | (1L << (VARIANT - 131)) | (1L << (VERSION - 131)) | (1L << (WEND - 131)) | (1L << (WHILE - 131)) | (1L << (WIDTH - 131)) | (1L << (WITH - 131)) | (1L << (WITHEVENTS - 131)) | (1L << (WRITE - 131)) | (1L << (XOR - 131)))) != 0) || ((((_la - 204)) & ~0x3f) == 0 && ((1L << (_la - 204)) & ((1L << (MINUS - 204)) | (1L << (PLUS - 204)) | (1L << (STRINGLITERAL - 204)) | (1L << (OCTLITERAL - 204)) | (1L << (HEXLITERAL - 204)) | (1L << (SHORTLITERAL - 204)) | (1L << (INTEGERLITERAL - 204)) | (1L << (DOUBLELITERAL - 204)) | (1L << (DATELITERAL - 204)) | (1L << (IDENTIFIER - 204)))) != 0)) {
					{
					setState(2417);
					constSubscripts();
					setState(2419);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(2418);
						match(WS);
						}
					}

					}
				}

				setState(2423);
				match(RPAREN);
				setState(2425);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,391,_ctx) ) {
				case 1:
					{
					setState(2424);
					match(WS);
					}
					break;
				}
				}
				break;
			}
			setState(2430);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,393,_ctx) ) {
			case 1:
				{
				setState(2429);
				typeHint();
				}
				break;
			}
			setState(2434);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,394,_ctx) ) {
			case 1:
				{
				setState(2432);
				match(WS);
				setState(2433);
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
		enterRule(_localctx, 216, RULE_whileWendStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2436);
			match(WHILE);
			setState(2437);
			match(WS);
			setState(2438);
			valueStmt(0);
			setState(2439);
			endOfStatement();
			setState(2441);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,395,_ctx) ) {
			case 1:
				{
				setState(2440);
				block();
				}
				break;
			}
			setState(2443);
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
		enterRule(_localctx, 218, RULE_widthStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2445);
			match(WIDTH);
			setState(2446);
			match(WS);
			setState(2447);
			fileNumber();
			setState(2449);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(2448);
				match(WS);
				}
			}

			setState(2451);
			match(T__0);
			setState(2453);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,397,_ctx) ) {
			case 1:
				{
				setState(2452);
				match(WS);
				}
				break;
			}
			setState(2455);
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
		enterRule(_localctx, 220, RULE_withStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2457);
			match(WITH);
			setState(2458);
			match(WS);
			setState(2463);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,398,_ctx) ) {
			case 1:
				{
				setState(2459);
				implicitCallStmt_InStmt();
				}
				break;
			case 2:
				{
				{
				setState(2460);
				match(NEW);
				setState(2461);
				match(WS);
				setState(2462);
				type();
				}
				}
				break;
			}
			setState(2465);
			endOfStatement();
			setState(2467);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH) | (1L << END))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ENUM - 64)) | (1L << (EQV - 64)) | (1L << (ERASE - 64)) | (1L << (ERROR - 64)) | (1L << (EVENT - 64)) | (1L << (EXIT_DO - 64)) | (1L << (EXIT_FOR - 64)) | (1L << (EXIT_FUNCTION - 64)) | (1L << (EXIT_PROPERTY - 64)) | (1L << (EXIT_SUB - 64)) | (1L << (EXIT_RULE - 64)) | (1L << (FALSE - 64)) | (1L << (FILECOPY - 64)) | (1L << (FRIEND - 64)) | (1L << (FOR - 64)) | (1L << (FUNCTION - 64)) | (1L << (GET - 64)) | (1L << (GLOBAL - 64)) | (1L << (GOSUB - 64)) | (1L << (GOTO - 64)) | (1L << (IF - 64)) | (1L << (IMP - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (IN - 64)) | (1L << (INPUT - 64)) | (1L << (IS - 64)) | (1L << (INTEGER - 64)) | (1L << (KILL - 64)) | (1L << (LOAD - 64)) | (1L << (LOCK - 64)) | (1L << (LONG - 64)) | (1L << (LOOP - 64)) | (1L << (LEN - 64)) | (1L << (LET - 64)) | (1L << (LIB - 64)) | (1L << (LIKE - 64)) | (1L << (LINE_INPUT - 64)) | (1L << (LSET - 64)) | (1L << (ME - 64)) | (1L << (MID - 64)) | (1L << (MKDIR - 64)) | (1L << (MOD - 64)) | (1L << (NAME - 64)) | (1L << (NEXT - 64)) | (1L << (NEW - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (EMPTY - 64)) | (1L << (ON - 64)) | (1L << (ON_ERROR - 64)) | (1L << (ON_LOCAL_ERROR - 64)) | (1L << (OPEN - 64)) | (1L << (OPTIONAL - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (OR - 131)) | (1L << (OUTPUT - 131)) | (1L << (PARAMARRAY - 131)) | (1L << (PRESERVE - 131)) | (1L << (PRINT - 131)) | (1L << (PRIVATE - 131)) | (1L << (PUBLIC - 131)) | (1L << (PUT - 131)) | (1L << (RANDOM - 131)) | (1L << (RANDOMIZE - 131)) | (1L << (RAISEEVENT - 131)) | (1L << (READ - 131)) | (1L << (REDIM - 131)) | (1L << (REM - 131)) | (1L << (RESET - 131)) | (1L << (RESUME - 131)) | (1L << (RETURN - 131)) | (1L << (RMDIR - 131)) | (1L << (RSET - 131)) | (1L << (SAVEPICTURE - 131)) | (1L << (SAVESETTING - 131)) | (1L << (SEEK - 131)) | (1L << (SELECT - 131)) | (1L << (SENDKEYS - 131)) | (1L << (SET - 131)) | (1L << (SETATTR - 131)) | (1L << (SHARED - 131)) | (1L << (SINGLE - 131)) | (1L << (SPC - 131)) | (1L << (STATIC - 131)) | (1L << (STEP - 131)) | (1L << (STOP - 131)) | (1L << (STRING - 131)) | (1L << (SUB - 131)) | (1L << (TAB - 131)) | (1L << (TEXT - 131)) | (1L << (THEN - 131)) | (1L << (TIME - 131)) | (1L << (TO - 131)) | (1L << (TRUE - 131)) | (1L << (TYPE - 131)) | (1L << (TYPEOF - 131)) | (1L << (UNLOAD - 131)) | (1L << (UNLOCK - 131)) | (1L << (UNTIL - 131)) | (1L << (VARIANT - 131)) | (1L << (VERSION - 131)) | (1L << (WEND - 131)) | (1L << (WHILE - 131)) | (1L << (WIDTH - 131)) | (1L << (WITH - 131)) | (1L << (WITHEVENTS - 131)) | (1L << (WRITE - 131)) | (1L << (XOR - 131)))) != 0) || _la==WS || _la==IDENTIFIER) {
				{
				setState(2466);
				block();
				}
			}

			setState(2469);
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
		enterRule(_localctx, 222, RULE_writeStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2471);
			match(WRITE);
			setState(2472);
			match(WS);
			setState(2473);
			fileNumber();
			setState(2475);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(2474);
				match(WS);
				}
			}

			setState(2477);
			match(T__0);
			setState(2482);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,402,_ctx) ) {
			case 1:
				{
				setState(2479);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,401,_ctx) ) {
				case 1:
					{
					setState(2478);
					match(WS);
					}
					break;
				}
				setState(2481);
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
		enterRule(_localctx, 224, RULE_fileNumber);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2485);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(2484);
				match(T__3);
				}
			}

			setState(2487);
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
		enterRule(_localctx, 226, RULE_explicitCallStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2489);
			match(CALL);
			setState(2490);
			match(WS);
			setState(2491);
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
		enterRule(_localctx, 228, RULE_implicitCallStmt_InBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2493);
			implicitCallStmt_InStmt();
			setState(2496);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,404,_ctx) ) {
			case 1:
				{
				setState(2494);
				match(WS);
				setState(2495);
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
		enterRule(_localctx, 230, RULE_implicitCallStmt_InStmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2498);
			iCS_startElement();
			setState(2502);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,405,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2499);
					iCS_followElement();
					}
					} 
				}
				setState(2504);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,405,_ctx);
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
		enterRule(_localctx, 232, RULE_iCS_startElement);
		try {
			setState(2511);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,407,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2505);
				ambiguousIdentifier();
				setState(2507);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,406,_ctx) ) {
				case 1:
					{
					setState(2506);
					typeHint();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2509);
				memberCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2510);
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
		enterRule(_localctx, 234, RULE_iCS_followElement);
		int _la;
		try {
			setState(2526);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,411,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2513);
				memberCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2514);
				dictionaryCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2515);
				match(LPAREN);
				setState(2517);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,408,_ctx) ) {
				case 1:
					{
					setState(2516);
					match(WS);
					}
					break;
				}
				setState(2520);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,409,_ctx) ) {
				case 1:
					{
					setState(2519);
					argsCall();
					}
					break;
				}
				setState(2523);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(2522);
					match(WS);
					}
				}

				setState(2525);
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
		enterRule(_localctx, 236, RULE_memberCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2529);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(2528);
				match(WS);
				}
			}

			setState(2531);
			match(T__2);
			setState(2533);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(2532);
				match(WS);
				}
			}

			setState(2535);
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
		enterRule(_localctx, 238, RULE_dictionaryCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2538);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(2537);
				match(WS);
				}
			}

			setState(2540);
			match(T__4);
			setState(2542);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(2541);
				match(WS);
				}
			}

			setState(2544);
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
		enterRule(_localctx, 240, RULE_argsCall);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2558);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,419,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2547);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,416,_ctx) ) {
					case 1:
						{
						setState(2546);
						argCall();
						}
						break;
					}
					setState(2550);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(2549);
						match(WS);
						}
					}

					setState(2552);
					match(T__0);
					setState(2554);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,418,_ctx) ) {
					case 1:
						{
						setState(2553);
						match(WS);
						}
						break;
					}
					}
					} 
				}
				setState(2560);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,419,_ctx);
			}
			setState(2561);
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
		enterRule(_localctx, 242, RULE_argCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2571);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,422,_ctx) ) {
			case 1:
				{
				setState(2563);
				ambiguousIdentifier();
				setState(2565);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(2564);
					match(WS);
					}
				}

				setState(2567);
				match(ASSIGN);
				setState(2569);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,421,_ctx) ) {
				case 1:
					{
					setState(2568);
					match(WS);
					}
					break;
				}
				}
				break;
			}
			setState(2573);
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
		enterRule(_localctx, 244, RULE_argList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2575);
			match(LPAREN);
			setState(2593);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,427,_ctx) ) {
			case 1:
				{
				setState(2577);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(2576);
					match(WS);
					}
				}

				setState(2579);
				arg();
				setState(2590);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,426,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2581);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2580);
							match(WS);
							}
						}

						setState(2583);
						match(T__0);
						setState(2585);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2584);
							match(WS);
							}
						}

						setState(2587);
						arg();
						}
						} 
					}
					setState(2592);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,426,_ctx);
				}
				}
				break;
			}
			setState(2596);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(2595);
				match(WS);
				}
			}

			setState(2598);
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
		enterRule(_localctx, 246, RULE_arg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2602);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,429,_ctx) ) {
			case 1:
				{
				setState(2600);
				match(OPTIONAL);
				setState(2601);
				match(WS);
				}
				break;
			}
			setState(2606);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,430,_ctx) ) {
			case 1:
				{
				setState(2604);
				_la = _input.LA(1);
				if ( !(_la==BYVAL || _la==BYREF) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(2605);
				match(WS);
				}
				break;
			}
			setState(2610);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,431,_ctx) ) {
			case 1:
				{
				setState(2608);
				match(PARAMARRAY);
				setState(2609);
				match(WS);
				}
				break;
			}
			setState(2612);
			ambiguousIdentifier();
			setState(2614);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0) || _la==AMPERSAND) {
				{
				setState(2613);
				typeHint();
				}
			}

			setState(2624);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,435,_ctx) ) {
			case 1:
				{
				setState(2617);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(2616);
					match(WS);
					}
				}

				setState(2619);
				match(LPAREN);
				setState(2621);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(2620);
					match(WS);
					}
				}

				setState(2623);
				match(RPAREN);
				}
				break;
			}
			setState(2630);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,437,_ctx) ) {
			case 1:
				{
				setState(2627);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(2626);
					match(WS);
					}
				}

				setState(2629);
				asTypeClause();
				}
				break;
			}
			setState(2636);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,439,_ctx) ) {
			case 1:
				{
				setState(2633);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(2632);
					match(WS);
					}
				}

				setState(2635);
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
		enterRule(_localctx, 248, RULE_argDefaultValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2638);
			match(EQ);
			setState(2640);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(2639);
				match(WS);
				}
			}

			setState(2642);
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
		enterRule(_localctx, 250, RULE_subscripts);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2644);
			subscript();
			setState(2655);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,443,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2646);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(2645);
						match(WS);
						}
					}

					setState(2648);
					match(T__0);
					setState(2650);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,442,_ctx) ) {
					case 1:
						{
						setState(2649);
						match(WS);
						}
						break;
					}
					setState(2652);
					subscript();
					}
					} 
				}
				setState(2657);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,443,_ctx);
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
		enterRule(_localctx, 252, RULE_subscript);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2663);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,444,_ctx) ) {
			case 1:
				{
				setState(2658);
				valueStmt(0);
				setState(2659);
				match(WS);
				setState(2660);
				match(TO);
				setState(2661);
				match(WS);
				}
				break;
			}
			setState(2665);
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
		enterRule(_localctx, 254, RULE_constSubscripts);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2667);
			constSubscript();
			setState(2678);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,447,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2669);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(2668);
						match(WS);
						}
					}

					setState(2671);
					match(T__0);
					setState(2673);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(2672);
						match(WS);
						}
					}

					setState(2675);
					constSubscript();
					}
					} 
				}
				setState(2680);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,447,_ctx);
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
		enterRule(_localctx, 256, RULE_constSubscript);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2686);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,448,_ctx) ) {
			case 1:
				{
				setState(2681);
				constValueExpr(0);
				setState(2682);
				match(WS);
				setState(2683);
				match(TO);
				setState(2684);
				match(WS);
				}
				break;
			}
			setState(2688);
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
		enterRule(_localctx, 258, RULE_ambiguousIdentifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2692); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(2692);
					switch (_input.LA(1)) {
					case IDENTIFIER:
						{
						setState(2690);
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
						setState(2691);
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
				setState(2694); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,450,_ctx);
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
		enterRule(_localctx, 260, RULE_asTypeClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2696);
			match(AS);
			setState(2698);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(2697);
				match(WS);
				}
			}

			setState(2702);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,452,_ctx) ) {
			case 1:
				{
				setState(2700);
				match(NEW);
				setState(2701);
				match(WS);
				}
				break;
			}
			setState(2704);
			type();
			setState(2709);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,454,_ctx) ) {
			case 1:
				{
				setState(2706);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(2705);
					match(WS);
					}
				}

				setState(2708);
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
		enterRule(_localctx, 262, RULE_baseType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2711);
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
		enterRule(_localctx, 264, RULE_certainIdentifier);
		int _la;
		try {
			setState(2728);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2713);
				match(IDENTIFIER);
				setState(2718);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCESS) | (1L << ADDRESSOF) | (1L << ALIAS) | (1L << AND) | (1L << ATTRIBUTE) | (1L << APPACTIVATE) | (1L << APPEND) | (1L << BEGIN) | (1L << BEEP) | (1L << BINARY) | (1L << BOOLEAN) | (1L << BYVAL) | (1L << BYREF) | (1L << BYTE) | (1L << CALL) | (1L << CHDIR) | (1L << CHDRIVE) | (1L << CLASS) | (1L << CLOSE) | (1L << COLLECTION) | (1L << CONST) | (1L << DATABASE) | (1L << DATE) | (1L << DECLARE) | (1L << DEFBOOL) | (1L << DEFBYTE) | (1L << DEFDATE) | (1L << DEFDBL) | (1L << DEFDEC) | (1L << DEFCUR) | (1L << DEFINT) | (1L << DEFLNG) | (1L << DEFOBJ) | (1L << DEFSNG) | (1L << DEFSTR) | (1L << DEFVAR) | (1L << DELETESETTING) | (1L << DIM) | (1L << DO) | (1L << DOUBLE) | (1L << EACH))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ENUM - 64)) | (1L << (EQV - 64)) | (1L << (ERASE - 64)) | (1L << (ERROR - 64)) | (1L << (EVENT - 64)) | (1L << (FALSE - 64)) | (1L << (FILECOPY - 64)) | (1L << (FRIEND - 64)) | (1L << (FOR - 64)) | (1L << (FUNCTION - 64)) | (1L << (GET - 64)) | (1L << (GLOBAL - 64)) | (1L << (GOSUB - 64)) | (1L << (GOTO - 64)) | (1L << (IF - 64)) | (1L << (IMP - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (IN - 64)) | (1L << (INPUT - 64)) | (1L << (IS - 64)) | (1L << (INTEGER - 64)) | (1L << (KILL - 64)) | (1L << (LOAD - 64)) | (1L << (LOCK - 64)) | (1L << (LONG - 64)) | (1L << (LOOP - 64)) | (1L << (LEN - 64)) | (1L << (LET - 64)) | (1L << (LIB - 64)) | (1L << (LIKE - 64)) | (1L << (LSET - 64)) | (1L << (ME - 64)) | (1L << (MID - 64)) | (1L << (MKDIR - 64)) | (1L << (MOD - 64)) | (1L << (NAME - 64)) | (1L << (NEXT - 64)) | (1L << (NEW - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (EMPTY - 64)) | (1L << (ON - 64)) | (1L << (OPEN - 64)) | (1L << (OPTIONAL - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (OR - 131)) | (1L << (OUTPUT - 131)) | (1L << (PARAMARRAY - 131)) | (1L << (PRESERVE - 131)) | (1L << (PRINT - 131)) | (1L << (PRIVATE - 131)) | (1L << (PUBLIC - 131)) | (1L << (PUT - 131)) | (1L << (RANDOM - 131)) | (1L << (RANDOMIZE - 131)) | (1L << (RAISEEVENT - 131)) | (1L << (READ - 131)) | (1L << (REDIM - 131)) | (1L << (REM - 131)) | (1L << (RESET - 131)) | (1L << (RESUME - 131)) | (1L << (RETURN - 131)) | (1L << (RMDIR - 131)) | (1L << (RSET - 131)) | (1L << (SAVEPICTURE - 131)) | (1L << (SAVESETTING - 131)) | (1L << (SEEK - 131)) | (1L << (SELECT - 131)) | (1L << (SENDKEYS - 131)) | (1L << (SET - 131)) | (1L << (SETATTR - 131)) | (1L << (SHARED - 131)) | (1L << (SINGLE - 131)) | (1L << (SPC - 131)) | (1L << (STATIC - 131)) | (1L << (STEP - 131)) | (1L << (STRING - 131)) | (1L << (SUB - 131)) | (1L << (TAB - 131)) | (1L << (TEXT - 131)) | (1L << (THEN - 131)) | (1L << (TIME - 131)) | (1L << (TO - 131)) | (1L << (TRUE - 131)) | (1L << (TYPE - 131)) | (1L << (TYPEOF - 131)) | (1L << (UNLOAD - 131)) | (1L << (UNLOCK - 131)) | (1L << (UNTIL - 131)) | (1L << (VARIANT - 131)) | (1L << (VERSION - 131)) | (1L << (WEND - 131)) | (1L << (WHILE - 131)) | (1L << (WIDTH - 131)) | (1L << (WITH - 131)) | (1L << (WITHEVENTS - 131)) | (1L << (WRITE - 131)) | (1L << (XOR - 131)))) != 0) || _la==IDENTIFIER) {
					{
					setState(2716);
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
						setState(2714);
						ambiguousKeyword();
						}
						break;
					case IDENTIFIER:
						{
						setState(2715);
						match(IDENTIFIER);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(2720);
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
				setState(2721);
				ambiguousKeyword();
				setState(2724); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(2724);
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
						setState(2722);
						ambiguousKeyword();
						}
						break;
					case IDENTIFIER:
						{
						setState(2723);
						match(IDENTIFIER);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(2726); 
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
		enterRule(_localctx, 266, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2730);
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
		enterRule(_localctx, 268, RULE_fixedSizeString);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2732);
			match(STRING);
			setState(2734);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(2733);
				match(WS);
				}
			}

			setState(2736);
			match(MULT);
			setState(2738);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(2737);
				match(WS);
				}
			}

			setState(2742);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,462,_ctx) ) {
			case 1:
				{
				setState(2740);
				literal();
				}
				break;
			case 2:
				{
				setState(2741);
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
		enterRule(_localctx, 270, RULE_complexType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2744);
			ambiguousIdentifier();
			setState(2749);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,463,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2745);
					match(T__2);
					setState(2746);
					ambiguousIdentifier();
					}
					} 
				}
				setState(2751);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,463,_ctx);
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
		enterRule(_localctx, 272, RULE_fieldLength);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2752);
			match(MULT);
			setState(2754);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(2753);
				match(WS);
				}
			}

			setState(2758);
			switch (_input.LA(1)) {
			case INTEGERLITERAL:
				{
				setState(2756);
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
				setState(2757);
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
		enterRule(_localctx, 274, RULE_letterrange);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2760);
			certainIdentifier();
			setState(2769);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,468,_ctx) ) {
			case 1:
				{
				setState(2762);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(2761);
					match(WS);
					}
				}

				setState(2764);
				match(MINUS);
				setState(2766);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(2765);
					match(WS);
					}
				}

				setState(2768);
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
		enterRule(_localctx, 276, RULE_lineLabel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2771);
			ambiguousIdentifier();
			setState(2772);
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
		enterRule(_localctx, 278, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2774);
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
		enterRule(_localctx, 280, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2779);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,469,_ctx) ) {
			case 1:
				{
				setState(2776);
				fixedSizeString();
				}
				break;
			case 2:
				{
				setState(2777);
				baseType();
				}
				break;
			case 3:
				{
				setState(2778);
				complexType();
				}
				break;
			}
			setState(2789);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,472,_ctx) ) {
			case 1:
				{
				setState(2782);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(2781);
					match(WS);
					}
				}

				setState(2784);
				match(LPAREN);
				setState(2786);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(2785);
					match(WS);
					}
				}

				setState(2788);
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
		enterRule(_localctx, 282, RULE_typeHint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2791);
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
		enterRule(_localctx, 284, RULE_visibility);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2793);
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
		enterRule(_localctx, 286, RULE_ambiguousKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2795);
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
		enterRule(_localctx, 288, RULE_remComment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2797);
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
		enterRule(_localctx, 290, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2799);
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
		enterRule(_localctx, 292, RULE_endOfLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2802);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(2801);
				match(WS);
				}
			}

			setState(2807);
			switch (_input.LA(1)) {
			case NEWLINE:
				{
				setState(2804);
				match(NEWLINE);
				}
				break;
			case COMMENT:
				{
				setState(2805);
				comment();
				}
				break;
			case REMCOMMENT:
				{
				setState(2806);
				remComment();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2810);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,475,_ctx) ) {
			case 1:
				{
				setState(2809);
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
		enterRule(_localctx, 294, RULE_endOfStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2820); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(2820);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,478,_ctx) ) {
					case 1:
						{
						setState(2812);
						endOfLine();
						}
						break;
					case 2:
						{
						setState(2814);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(2813);
							match(WS);
							}
						}

						setState(2816);
						match(COLON);
						setState(2818);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,477,_ctx) ) {
						case 1:
							{
							setState(2817);
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
				setState(2822); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,479,_ctx);
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
		case 103:
			return constValueExpr_sempred((ConstValueExprContext)_localctx, predIndex);
		case 104:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u00e7\u0b0b\4\2\t"+
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
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\3\2\3\2\3\2\3\3\5\3\u012f"+
		"\n\3\3\3\7\3\u0132\n\3\f\3\16\3\u0135\13\3\3\3\3\3\7\3\u0139\n\3\f\3\16"+
		"\3\u013c\13\3\5\3\u013e\n\3\3\3\3\3\7\3\u0142\n\3\f\3\16\3\u0145\13\3"+
		"\5\3\u0147\n\3\3\3\5\3\u014a\n\3\3\3\7\3\u014d\n\3\f\3\16\3\u0150\13\3"+
		"\3\3\5\3\u0153\n\3\3\3\7\3\u0156\n\3\f\3\16\3\u0159\13\3\3\3\5\3\u015c"+
		"\n\3\3\3\7\3\u015f\n\3\f\3\16\3\u0162\13\3\3\3\5\3\u0165\n\3\3\3\7\3\u0168"+
		"\n\3\f\3\16\3\u016b\13\3\3\3\5\3\u016e\n\3\3\4\3\4\3\4\3\4\3\4\5\4\u0175"+
		"\n\4\3\5\3\5\7\5\u0179\n\5\f\5\16\5\u017c\13\5\3\5\6\5\u017f\n\5\r\5\16"+
		"\5\u0180\3\5\3\5\3\6\3\6\5\6\u0187\n\6\3\6\3\6\5\6\u018b\n\6\3\6\3\6\7"+
		"\6\u018f\n\6\f\6\16\6\u0192\13\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u019a\n\7"+
		"\f\7\16\7\u019d\13\7\3\7\6\7\u01a0\n\7\r\7\16\7\u01a1\3\7\7\7\u01a5\n"+
		"\7\f\7\16\7\u01a8\13\7\3\7\3\7\3\b\3\b\6\b\u01ae\n\b\r\b\16\b\u01af\6"+
		"\b\u01b2\n\b\r\b\16\b\u01b3\3\t\3\t\6\t\u01b8\n\t\r\t\16\t\u01b9\3\t\3"+
		"\t\7\t\u01be\n\t\f\t\16\t\u01c1\13\t\3\t\7\t\u01c4\n\t\f\t\16\t\u01c7"+
		"\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u01d1\n\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u01dd\n\13\3\f\3\f\5\f\u01e1\n\f\3"+
		"\r\3\r\6\r\u01e5\n\r\r\r\16\r\u01e6\3\r\3\r\7\r\u01eb\n\r\f\r\16\r\u01ee"+
		"\13\r\3\r\7\r\u01f1\n\r\f\r\16\r\u01f4\13\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\5\16\u01fc\n\16\3\17\3\17\3\17\3\17\5\17\u0202\n\17\3\17\3\17\5\17"+
		"\u0206\n\17\3\17\3\17\5\17\u020a\n\17\3\17\3\17\5\17\u020e\n\17\3\17\7"+
		"\17\u0211\n\17\f\17\16\17\u0214\13\17\3\20\3\20\3\20\3\20\7\20\u021a\n"+
		"\20\f\20\16\20\u021d\13\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u0261\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0294\n\22"+
		"\3\23\3\23\3\23\3\23\5\23\u029a\n\23\3\23\3\23\5\23\u029e\n\23\3\23\5"+
		"\23\u02a1\n\23\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\5\27\u02b1\n\27\3\27\3\27\5\27\u02b5\n\27\3\27\7\27\u02b8"+
		"\n\27\f\27\16\27\u02bb\13\27\5\27\u02bd\n\27\3\30\3\30\3\30\5\30\u02c2"+
		"\n\30\3\30\3\30\3\30\3\30\5\30\u02c8\n\30\3\30\3\30\5\30\u02cc\n\30\3"+
		"\30\7\30\u02cf\n\30\f\30\16\30\u02d2\13\30\3\31\3\31\5\31\u02d6\n\31\3"+
		"\31\3\31\5\31\u02da\n\31\3\31\5\31\u02dd\n\31\3\31\3\31\5\31\u02e1\n\31"+
		"\3\31\3\31\3\32\3\32\5\32\u02e7\n\32\3\32\3\32\5\32\u02eb\n\32\3\32\3"+
		"\32\3\33\3\33\3\33\5\33\u02f2\n\33\3\33\3\33\3\33\3\33\5\33\u02f8\n\33"+
		"\3\33\3\33\5\33\u02fc\n\33\3\33\5\33\u02ff\n\33\3\33\3\33\3\33\5\33\u0304"+
		"\n\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u030e\n\33\3\33\5\33"+
		"\u0311\n\33\3\33\5\33\u0314\n\33\3\33\3\33\5\33\u0318\n\33\3\34\3\34\3"+
		"\34\3\34\5\34\u031e\n\34\3\34\3\34\5\34\u0322\n\34\3\34\7\34\u0325\n\34"+
		"\f\34\16\34\u0328\13\34\3\35\3\35\3\35\3\35\5\35\u032e\n\35\3\35\3\35"+
		"\5\35\u0332\n\35\3\35\3\35\5\35\u0336\n\35\3\35\3\35\5\35\u033a\n\35\3"+
		"\35\5\35\u033d\n\35\3\36\3\36\3\36\5\36\u0342\n\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\5\36\u034d\n\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\5\36\u035a\n\36\3\37\3\37\3 \3 \3 \5 \u0361"+
		"\n \3 \3 \3 \3 \3 \7 \u0368\n \f \16 \u036b\13 \3 \3 \3!\3!\5!\u0371\n"+
		"!\3!\3!\5!\u0375\n!\3!\5!\u0378\n!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3"+
		"$\3$\3$\5$\u0387\n$\3$\3$\3$\3$\5$\u038d\n$\3$\3$\3%\3%\3&\3&\3&\3&\5"+
		"&\u0397\n&\3&\3&\5&\u039b\n&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u03a5\n"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u03ad\n\'\3\'\3\'\3\'\5\'\u03b2\n\'\3("+
		"\3(\3(\3(\5(\u03b8\n(\3(\3(\5(\u03bc\n(\3(\5(\u03bf\n(\3(\3(\5(\u03c3"+
		"\n(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u03ce\n(\3(\3(\5(\u03d2\n(\3(\3(\3("+
		"\5(\u03d7\n(\3)\3)\3)\5)\u03dc\n)\3)\3)\5)\u03e0\n)\3)\3)\5)\u03e4\n)"+
		"\3)\3)\5)\u03e8\n)\3)\5)\u03eb\n)\3)\5)\u03ee\n)\3)\5)\u03f1\n)\3)\5)"+
		"\u03f4\n)\3)\3)\5)\u03f8\n)\3)\3)\3*\3*\3*\5*\u03ff\n*\3*\3*\5*\u0403"+
		"\n*\3*\3*\5*\u0407\n*\3*\3*\5*\u040b\n*\3*\3*\3*\5*\u0410\n*\3*\5*\u0413"+
		"\n*\3*\5*\u0416\n*\3*\5*\u0419\n*\3*\5*\u041c\n*\3*\5*\u041f\n*\3*\3*"+
		"\3*\5*\u0424\n*\3*\3*\5*\u0428\n*\3*\3*\3+\3+\3+\3+\5+\u0430\n+\3+\3+"+
		"\5+\u0434\n+\3+\5+\u0437\n+\3+\5+\u043a\n+\3+\3+\5+\u043e\n+\3+\3+\3,"+
		"\3,\3,\3,\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u0455\n.\3."+
		"\3.\7.\u0459\n.\f.\16.\u045c\13.\3.\5.\u045f\n.\3.\3.\5.\u0463\n.\3/\3"+
		"/\3/\3/\3/\3/\3/\5/\u046c\n/\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\5\61\u0477\n\61\3\62\3\62\3\62\5\62\u047c\n\62\3\63\3\63\3\63\3\63"+
		"\3\64\3\64\3\64\3\64\5\64\u0486\n\64\3\64\3\64\5\64\u048a\n\64\3\64\6"+
		"\64\u048d\n\64\r\64\16\64\u048e\3\65\3\65\3\65\3\65\3\66\3\66\5\66\u0497"+
		"\n\66\3\66\3\66\5\66\u049b\n\66\3\66\3\66\5\66\u049f\n\66\3\66\3\66\3"+
		"\67\3\67\3\67\3\67\5\67\u04a7\n\67\3\67\3\67\5\67\u04ab\n\67\3\67\3\67"+
		"\38\38\38\38\39\39\39\39\59\u04b7\n9\39\39\59\u04bb\n9\39\39\39\39\39"+
		"\59\u04c2\n9\59\u04c4\n9\3:\3:\3:\3:\5:\u04ca\n:\3:\3:\5:\u04ce\n:\3:"+
		"\3:\3;\3;\5;\u04d4\n;\3;\3;\5;\u04d8\n;\3;\3;\5;\u04dc\n;\3;\3;\3<\3<"+
		"\7<\u04e2\n<\f<\16<\u04e5\13<\3<\5<\u04e8\n<\3<\3<\3=\3=\5=\u04ee\n=\3"+
		"=\3=\3=\3=\3=\3=\3=\7=\u04f7\n=\f=\16=\u04fa\13=\3>\3>\5>\u04fe\n>\3>"+
		"\3>\3>\3>\3>\3>\3>\7>\u0507\n>\f>\16>\u050a\13>\3?\3?\3?\3?\3?\7?\u0511"+
		"\n?\f?\16?\u0514\13?\3@\3@\5@\u0518\n@\3@\3@\5@\u051c\n@\3@\3@\5@\u0520"+
		"\n@\3@\3@\5@\u0524\n@\3@\3@\5@\u0528\n@\3@\3@\5@\u052c\n@\3@\5@\u052f"+
		"\n@\3@\5@\u0532\n@\3@\3@\5@\u0536\n@\3@\3@\5@\u053a\n@\3@\3@\3A\3A\3A"+
		"\3A\3B\3B\3B\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3C\3C\5C\u0552\nC\3D\3D"+
		"\3D\3D\3D\3D\3D\3D\5D\u055c\nD\3D\3D\5D\u0560\nD\3D\7D\u0563\nD\fD\16"+
		"D\u0566\13D\3E\3E\3E\3E\3E\3E\3E\3E\5E\u0570\nE\3E\3E\5E\u0574\nE\3E\7"+
		"E\u0577\nE\fE\16E\u057a\13E\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\5F\u0587"+
		"\nF\3F\3F\5F\u058b\nF\3F\3F\3F\3F\3F\3F\3F\5F\u0594\nF\3F\3F\5F\u0598"+
		"\nF\3F\5F\u059b\nF\3G\3G\5G\u059f\nG\3G\3G\5G\u05a3\nG\3G\5G\u05a6\nG"+
		"\7G\u05a8\nG\fG\16G\u05ab\13G\3G\5G\u05ae\nG\3G\5G\u05b1\nG\3G\3G\5G\u05b5"+
		"\nG\3G\5G\u05b8\nG\6G\u05ba\nG\rG\16G\u05bb\5G\u05be\nG\3H\3H\3H\5H\u05c3"+
		"\nH\3H\3H\5H\u05c7\nH\3H\3H\5H\u05cb\nH\3H\3H\5H\u05cf\nH\5H\u05d1\nH"+
		"\3I\3I\3I\3I\5I\u05d7\nI\3I\3I\5I\u05db\nI\3I\5I\u05de\nI\3J\3J\3J\5J"+
		"\u05e3\nJ\3J\3J\5J\u05e7\nJ\3J\3J\3J\3J\5J\u05ed\nJ\3J\5J\u05f0\nJ\3J"+
		"\5J\u05f3\nJ\3J\3J\5J\u05f7\nJ\3J\3J\5J\u05fb\nJ\3J\3J\3K\3K\3K\5K\u0602"+
		"\nK\3K\3K\5K\u0606\nK\3K\3K\3K\3K\5K\u060c\nK\3K\5K\u060f\nK\3K\3K\5K"+
		"\u0613\nK\3K\3K\3L\3L\3L\5L\u061a\nL\3L\3L\5L\u061e\nL\3L\3L\3L\3L\5L"+
		"\u0624\nL\3L\5L\u0627\nL\3L\3L\5L\u062b\nL\3L\3L\3M\3M\3M\3M\5M\u0633"+
		"\nM\3M\3M\5M\u0637\nM\3M\5M\u063a\nM\3M\5M\u063d\nM\3M\3M\5M\u0641\nM"+
		"\3M\3M\3N\3N\3N\3N\5N\u0649\nN\3N\3N\5N\u064d\nN\3N\3N\5N\u0651\nN\5N"+
		"\u0653\nN\3N\5N\u0656\nN\3O\3O\3O\5O\u065b\nO\3P\3P\3P\3P\5P\u0661\nP"+
		"\3P\3P\5P\u0665\nP\3P\3P\5P\u0669\nP\3P\7P\u066c\nP\fP\16P\u066f\13P\3"+
		"Q\3Q\5Q\u0673\nQ\3Q\3Q\5Q\u0677\nQ\3Q\3Q\5Q\u067b\nQ\3Q\3Q\3Q\5Q\u0680"+
		"\nQ\3R\3R\3S\3S\3S\3S\5S\u0688\nS\5S\u068a\nS\3T\3T\3U\3U\3U\3U\3V\3V"+
		"\3V\3V\5V\u0696\nV\3V\3V\5V\u069a\nV\3V\3V\3W\3W\3W\3W\5W\u06a2\nW\3W"+
		"\3W\5W\u06a6\nW\3W\3W\3X\3X\3X\3X\5X\u06ae\nX\3X\3X\5X\u06b2\nX\3X\3X"+
		"\5X\u06b6\nX\3X\3X\5X\u06ba\nX\3X\3X\5X\u06be\nX\3X\3X\5X\u06c2\nX\3X"+
		"\3X\3Y\3Y\3Y\3Y\5Y\u06ca\nY\3Y\3Y\5Y\u06ce\nY\3Y\3Y\3Z\3Z\3Z\3Z\3Z\3Z"+
		"\3Z\7Z\u06d9\nZ\fZ\16Z\u06dc\13Z\3Z\3Z\3[\3[\5[\u06e2\n[\3[\3[\5[\u06e6"+
		"\n[\3[\3[\3[\3[\3[\3[\3[\3[\3[\5[\u06f1\n[\3\\\3\\\3\\\3\\\3\\\5\\\u06f8"+
		"\n\\\3]\3]\3]\5]\u06fd\n]\3]\3]\5]\u0701\n]\3]\7]\u0704\n]\f]\16]\u0707"+
		"\13]\5]\u0709\n]\3^\3^\3^\3^\5^\u070f\n^\3^\3^\5^\u0713\n^\3^\5^\u0716"+
		"\n^\3_\3_\3_\3_\5_\u071c\n_\3_\3_\5_\u0720\n_\3_\3_\3`\3`\3`\3`\5`\u0728"+
		"\n`\3`\3`\5`\u072c\n`\3`\3`\3a\3a\3b\3b\3b\5b\u0735\nb\3b\3b\5b\u0739"+
		"\nb\3b\3b\5b\u073d\nb\3b\3b\5b\u0741\nb\3b\5b\u0744\nb\3b\3b\5b\u0748"+
		"\nb\3b\3b\3c\3c\5c\u074e\nc\3c\3c\5c\u0752\nc\3c\3c\3d\3d\3d\5d\u0759"+
		"\nd\3d\3d\3d\3d\3d\7d\u0760\nd\fd\16d\u0763\13d\3d\3d\3e\3e\5e\u0769\n"+
		"e\3e\3e\5e\u076d\ne\3e\5e\u0770\ne\3e\5e\u0773\ne\3e\5e\u0776\ne\3e\3"+
		"e\3e\3e\3f\3f\3f\3f\3f\3f\3f\3f\3g\3g\3g\3g\3h\3h\3h\3h\5h\u078c\nh\3"+
		"h\3h\5h\u0790\nh\3h\3h\3h\3h\3h\5h\u0797\nh\5h\u0799\nh\3i\3i\3i\3i\3"+
		"i\7i\u07a0\ni\fi\16i\u07a3\13i\3i\3i\5i\u07a7\ni\3i\3i\3i\5i\u07ac\ni"+
		"\3i\3i\3i\5i\u07b1\ni\3i\5i\u07b4\ni\3i\3i\5i\u07b8\ni\3i\3i\5i\u07bc"+
		"\ni\3i\3i\3i\5i\u07c1\ni\3i\3i\5i\u07c5\ni\3i\3i\3i\5i\u07ca\ni\3i\3i"+
		"\5i\u07ce\ni\3i\3i\3i\5i\u07d3\ni\3i\3i\5i\u07d7\ni\3i\3i\3i\5i\u07dc"+
		"\ni\3i\3i\5i\u07e0\ni\3i\3i\3i\5i\u07e5\ni\3i\3i\5i\u07e9\ni\3i\3i\3i"+
		"\5i\u07ee\ni\3i\3i\5i\u07f2\ni\3i\3i\3i\5i\u07f7\ni\3i\3i\5i\u07fb\ni"+
		"\3i\3i\3i\5i\u0800\ni\3i\3i\5i\u0804\ni\3i\3i\3i\5i\u0809\ni\3i\3i\5i"+
		"\u080d\ni\3i\3i\3i\5i\u0812\ni\3i\3i\5i\u0816\ni\3i\3i\3i\5i\u081b\ni"+
		"\3i\3i\5i\u081f\ni\3i\3i\3i\5i\u0824\ni\3i\3i\5i\u0828\ni\3i\3i\3i\5i"+
		"\u082d\ni\3i\3i\5i\u0831\ni\3i\3i\3i\5i\u0836\ni\3i\3i\5i\u083a\ni\3i"+
		"\3i\3i\5i\u083f\ni\3i\3i\5i\u0843\ni\3i\3i\3i\5i\u0848\ni\3i\3i\5i\u084c"+
		"\ni\3i\3i\3i\5i\u0851\ni\3i\3i\5i\u0855\ni\3i\3i\3i\5i\u085a\ni\3i\3i"+
		"\5i\u085e\ni\3i\7i\u0861\ni\fi\16i\u0864\13i\3j\3j\3j\3j\3j\5j\u086b\n"+
		"j\3j\3j\5j\u086f\nj\3j\3j\5j\u0873\nj\3j\7j\u0876\nj\fj\16j\u0879\13j"+
		"\3j\3j\3j\3j\5j\u087f\nj\3j\3j\3j\3j\5j\u0885\nj\3j\3j\3j\5j\u088a\nj"+
		"\3j\3j\3j\5j\u088f\nj\3j\3j\3j\5j\u0894\nj\3j\5j\u0897\nj\3j\3j\5j\u089b"+
		"\nj\3j\3j\5j\u089f\nj\3j\3j\3j\5j\u08a4\nj\3j\3j\5j\u08a8\nj\3j\3j\3j"+
		"\5j\u08ad\nj\3j\3j\5j\u08b1\nj\3j\3j\3j\5j\u08b6\nj\3j\3j\5j\u08ba\nj"+
		"\3j\3j\3j\5j\u08bf\nj\3j\3j\5j\u08c3\nj\3j\3j\3j\5j\u08c8\nj\3j\3j\5j"+
		"\u08cc\nj\3j\3j\3j\5j\u08d1\nj\3j\3j\5j\u08d5\nj\3j\3j\3j\5j\u08da\nj"+
		"\3j\3j\5j\u08de\nj\3j\3j\3j\5j\u08e3\nj\3j\3j\5j\u08e7\nj\3j\3j\3j\5j"+
		"\u08ec\nj\3j\3j\5j\u08f0\nj\3j\3j\3j\5j\u08f5\nj\3j\3j\5j\u08f9\nj\3j"+
		"\3j\3j\5j\u08fe\nj\3j\3j\5j\u0902\nj\3j\3j\3j\5j\u0907\nj\3j\3j\5j\u090b"+
		"\nj\3j\3j\3j\5j\u0910\nj\3j\3j\5j\u0914\nj\3j\3j\3j\5j\u0919\nj\3j\3j"+
		"\5j\u091d\nj\3j\3j\3j\5j\u0922\nj\3j\3j\5j\u0926\nj\3j\3j\3j\5j\u092b"+
		"\nj\3j\3j\5j\u092f\nj\3j\3j\3j\5j\u0934\nj\3j\3j\5j\u0938\nj\3j\3j\3j"+
		"\5j\u093d\nj\3j\3j\5j\u0941\nj\3j\3j\3j\5j\u0946\nj\3j\3j\5j\u094a\nj"+
		"\3j\7j\u094d\nj\fj\16j\u0950\13j\3k\3k\3k\5k\u0955\nk\3k\3k\3k\5k\u095a"+
		"\nk\3k\3k\3l\3l\5l\u0960\nl\3l\3l\5l\u0964\nl\3l\7l\u0967\nl\fl\16l\u096a"+
		"\13l\3m\3m\5m\u096e\nm\3m\3m\5m\u0972\nm\3m\3m\5m\u0976\nm\5m\u0978\n"+
		"m\3m\3m\5m\u097c\nm\5m\u097e\nm\3m\5m\u0981\nm\3m\3m\5m\u0985\nm\3n\3"+
		"n\3n\3n\3n\5n\u098c\nn\3n\3n\3o\3o\3o\3o\5o\u0994\no\3o\3o\5o\u0998\n"+
		"o\3o\3o\3p\3p\3p\3p\3p\3p\5p\u09a2\np\3p\3p\5p\u09a6\np\3p\3p\3q\3q\3"+
		"q\3q\5q\u09ae\nq\3q\3q\5q\u09b2\nq\3q\5q\u09b5\nq\3r\5r\u09b8\nr\3r\3"+
		"r\3s\3s\3s\3s\3t\3t\3t\5t\u09c3\nt\3u\3u\7u\u09c7\nu\fu\16u\u09ca\13u"+
		"\3v\3v\5v\u09ce\nv\3v\3v\5v\u09d2\nv\3w\3w\3w\3w\5w\u09d8\nw\3w\5w\u09db"+
		"\nw\3w\5w\u09de\nw\3w\5w\u09e1\nw\3x\5x\u09e4\nx\3x\3x\5x\u09e8\nx\3x"+
		"\3x\3y\5y\u09ed\ny\3y\3y\5y\u09f1\ny\3y\3y\3z\5z\u09f6\nz\3z\5z\u09f9"+
		"\nz\3z\3z\5z\u09fd\nz\7z\u09ff\nz\fz\16z\u0a02\13z\3z\3z\3{\3{\5{\u0a08"+
		"\n{\3{\3{\5{\u0a0c\n{\5{\u0a0e\n{\3{\3{\3|\3|\5|\u0a14\n|\3|\3|\5|\u0a18"+
		"\n|\3|\3|\5|\u0a1c\n|\3|\7|\u0a1f\n|\f|\16|\u0a22\13|\5|\u0a24\n|\3|\5"+
		"|\u0a27\n|\3|\3|\3}\3}\5}\u0a2d\n}\3}\3}\5}\u0a31\n}\3}\3}\5}\u0a35\n"+
		"}\3}\3}\5}\u0a39\n}\3}\5}\u0a3c\n}\3}\3}\5}\u0a40\n}\3}\5}\u0a43\n}\3"+
		"}\5}\u0a46\n}\3}\5}\u0a49\n}\3}\5}\u0a4c\n}\3}\5}\u0a4f\n}\3~\3~\5~\u0a53"+
		"\n~\3~\3~\3\177\3\177\5\177\u0a59\n\177\3\177\3\177\5\177\u0a5d\n\177"+
		"\3\177\7\177\u0a60\n\177\f\177\16\177\u0a63\13\177\3\u0080\3\u0080\3\u0080"+
		"\3\u0080\3\u0080\5\u0080\u0a6a\n\u0080\3\u0080\3\u0080\3\u0081\3\u0081"+
		"\5\u0081\u0a70\n\u0081\3\u0081\3\u0081\5\u0081\u0a74\n\u0081\3\u0081\7"+
		"\u0081\u0a77\n\u0081\f\u0081\16\u0081\u0a7a\13\u0081\3\u0082\3\u0082\3"+
		"\u0082\3\u0082\3\u0082\5\u0082\u0a81\n\u0082\3\u0082\3\u0082\3\u0083\3"+
		"\u0083\6\u0083\u0a87\n\u0083\r\u0083\16\u0083\u0a88\3\u0084\3\u0084\5"+
		"\u0084\u0a8d\n\u0084\3\u0084\3\u0084\5\u0084\u0a91\n\u0084\3\u0084\3\u0084"+
		"\5\u0084\u0a95\n\u0084\3\u0084\5\u0084\u0a98\n\u0084\3\u0085\3\u0085\3"+
		"\u0086\3\u0086\3\u0086\7\u0086\u0a9f\n\u0086\f\u0086\16\u0086\u0aa2\13"+
		"\u0086\3\u0086\3\u0086\3\u0086\6\u0086\u0aa7\n\u0086\r\u0086\16\u0086"+
		"\u0aa8\5\u0086\u0aab\n\u0086\3\u0087\3\u0087\3\u0088\3\u0088\5\u0088\u0ab1"+
		"\n\u0088\3\u0088\3\u0088\5\u0088\u0ab5\n\u0088\3\u0088\3\u0088\5\u0088"+
		"\u0ab9\n\u0088\3\u0089\3\u0089\3\u0089\7\u0089\u0abe\n\u0089\f\u0089\16"+
		"\u0089\u0ac1\13\u0089\3\u008a\3\u008a\5\u008a\u0ac5\n\u008a\3\u008a\3"+
		"\u008a\5\u008a\u0ac9\n\u008a\3\u008b\3\u008b\5\u008b\u0acd\n\u008b\3\u008b"+
		"\3\u008b\5\u008b\u0ad1\n\u008b\3\u008b\5\u008b\u0ad4\n\u008b\3\u008c\3"+
		"\u008c\3\u008c\3\u008d\3\u008d\3\u008e\3\u008e\3\u008e\5\u008e\u0ade\n"+
		"\u008e\3\u008e\5\u008e\u0ae1\n\u008e\3\u008e\3\u008e\5\u008e\u0ae5\n\u008e"+
		"\3\u008e\5\u008e\u0ae8\n\u008e\3\u008f\3\u008f\3\u0090\3\u0090\3\u0091"+
		"\3\u0091\3\u0092\3\u0092\3\u0093\3\u0093\3\u0094\5\u0094\u0af5\n\u0094"+
		"\3\u0094\3\u0094\3\u0094\5\u0094\u0afa\n\u0094\3\u0094\5\u0094\u0afd\n"+
		"\u0094\3\u0095\3\u0095\5\u0095\u0b01\n\u0095\3\u0095\3\u0095\5\u0095\u0b05"+
		"\n\u0095\6\u0095\u0b07\n\u0095\r\u0095\16\u0095\u0b08\3\u0095\2\4\u00d0"+
		"\u00d2\u0096\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0"+
		"\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8"+
		"\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0"+
		"\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8"+
		"\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100"+
		"\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118"+
		"\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\2\24\5\2\25\25\"\"\u00af"+
		"\u00af\3\2%\60\4\2\u00b8\u00b8\u00be\u00be\3\2GL\5\2\u00c8\u00c8\u00cf"+
		"\u00cf\u00d3\u00d3\3\2}~\7\2\21\21\25\25[[\u0086\u0086\u0091\u0091\4\2"+
		"\u0094\u0095\u00c3\u00c3\4\2hj\u00a4\u00a4\3\2\3\4\4\2\u00a8\u00a8\u00ae"+
		"\u00ae\3\2\27\30\13\2\26\26\31\31##\64\64]]aa\u00a5\u00a7\u00ac\u00ac"+
		"\u00b9\u00bb\7\2\\\\ff\u00c8\u00cb\u00cd\u00cd\u00d1\u00d1\6\2MMy{\u00b3"+
		"\u00b3\u00d8\u00de\4\2\6\n\u00c5\u00c5\6\2OOTT\u008a\u008a\u008f\u008f"+
		"\22\2\13\21\23\32\34\65BFMQSfkkq|\177\u0080\u0085\u008a\u008f\u0094\u0096"+
		"\u00a5\u00a8\u00aa\u00ac\u00b9\u00bc\u00c0\u00c2\u00c4\u0d08\2\u012a\3"+
		"\2\2\2\4\u012e\3\2\2\2\6\u016f\3\2\2\2\b\u0176\3\2\2\2\n\u0184\3\2\2\2"+
		"\f\u0193\3\2\2\2\16\u01b1\3\2\2\2\20\u01b5\3\2\2\2\22\u01d0\3\2\2\2\24"+
		"\u01dc\3\2\2\2\26\u01e0\3\2\2\2\30\u01e2\3\2\2\2\32\u01fb\3\2\2\2\34\u01fd"+
		"\3\2\2\2\36\u0215\3\2\2\2 \u0260\3\2\2\2\"\u0293\3\2\2\2$\u0295\3\2\2"+
		"\2&\u02a2\3\2\2\2(\u02a4\3\2\2\2*\u02a8\3\2\2\2,\u02ac\3\2\2\2.\u02c1"+
		"\3\2\2\2\60\u02d3\3\2\2\2\62\u02e4\3\2\2\2\64\u02f1\3\2\2\2\66\u0319\3"+
		"\2\2\28\u0329\3\2\2\2:\u0359\3\2\2\2<\u035b\3\2\2\2>\u0360\3\2\2\2@\u036e"+
		"\3\2\2\2B\u037b\3\2\2\2D\u037f\3\2\2\2F\u0386\3\2\2\2H\u0390\3\2\2\2J"+
		"\u0392\3\2\2\2L\u039e\3\2\2\2N\u03b3\3\2\2\2P\u03db\3\2\2\2R\u03fe\3\2"+
		"\2\2T\u042b\3\2\2\2V\u0441\3\2\2\2X\u0445\3\2\2\2Z\u0462\3\2\2\2\\\u0464"+
		"\3\2\2\2^\u046d\3\2\2\2`\u046f\3\2\2\2b\u0478\3\2\2\2d\u047d\3\2\2\2f"+
		"\u0481\3\2\2\2h\u0490\3\2\2\2j\u0496\3\2\2\2l\u04a2\3\2\2\2n\u04ae\3\2"+
		"\2\2p\u04b2\3\2\2\2r\u04c5\3\2\2\2t\u04d1\3\2\2\2v\u04df\3\2\2\2x\u04eb"+
		"\3\2\2\2z\u04fb\3\2\2\2|\u050b\3\2\2\2~\u0515\3\2\2\2\u0080\u053d\3\2"+
		"\2\2\u0082\u0541\3\2\2\2\u0084\u0549\3\2\2\2\u0086\u0553\3\2\2\2\u0088"+
		"\u0567\3\2\2\2\u008a\u057b\3\2\2\2\u008c\u05bd\3\2\2\2\u008e\u05d0\3\2"+
		"\2\2\u0090\u05d2\3\2\2\2\u0092\u05e2\3\2\2\2\u0094\u0601\3\2\2\2\u0096"+
		"\u0619\3\2\2\2\u0098\u062e\3\2\2\2\u009a\u0644\3\2\2\2\u009c\u0657\3\2"+
		"\2\2\u009e\u065c\3\2\2\2\u00a0\u0670\3\2\2\2\u00a2\u0681\3\2\2\2\u00a4"+
		"\u0683\3\2\2\2\u00a6\u068b\3\2\2\2\u00a8\u068d\3\2\2\2\u00aa\u0691\3\2"+
		"\2\2\u00ac\u069d\3\2\2\2\u00ae\u06a9\3\2\2\2\u00b0\u06c5\3\2\2\2\u00b2"+
		"\u06d1\3\2\2\2\u00b4\u06f0\3\2\2\2\u00b6\u06f2\3\2\2\2\u00b8\u0708\3\2"+
		"\2\2\u00ba\u070a\3\2\2\2\u00bc\u0717\3\2\2\2\u00be\u0723\3\2\2\2\u00c0"+
		"\u072f\3\2\2\2\u00c2\u0734\3\2\2\2\u00c4\u074b\3\2\2\2\u00c6\u0758\3\2"+
		"\2\2\u00c8\u0766\3\2\2\2\u00ca\u077b\3\2\2\2\u00cc\u0783\3\2\2\2\u00ce"+
		"\u0787\3\2\2\2\u00d0\u07b3\3\2\2\2\u00d2\u0896\3\2\2\2\u00d4\u0954\3\2"+
		"\2\2\u00d6\u095d\3\2\2\2\u00d8\u096b\3\2\2\2\u00da\u0986\3\2\2\2\u00dc"+
		"\u098f\3\2\2\2\u00de\u099b\3\2\2\2\u00e0\u09a9\3\2\2\2\u00e2\u09b7\3\2"+
		"\2\2\u00e4\u09bb\3\2\2\2\u00e6\u09bf\3\2\2\2\u00e8\u09c4\3\2\2\2\u00ea"+
		"\u09d1\3\2\2\2\u00ec\u09e0\3\2\2\2\u00ee\u09e3\3\2\2\2\u00f0\u09ec\3\2"+
		"\2\2\u00f2\u0a00\3\2\2\2\u00f4\u0a0d\3\2\2\2\u00f6\u0a11\3\2\2\2\u00f8"+
		"\u0a2c\3\2\2\2\u00fa\u0a50\3\2\2\2\u00fc\u0a56\3\2\2\2\u00fe\u0a69\3\2"+
		"\2\2\u0100\u0a6d\3\2\2\2\u0102\u0a80\3\2\2\2\u0104\u0a86\3\2\2\2\u0106"+
		"\u0a8a\3\2\2\2\u0108\u0a99\3\2\2\2\u010a\u0aaa\3\2\2\2\u010c\u0aac\3\2"+
		"\2\2\u010e\u0aae\3\2\2\2\u0110\u0aba\3\2\2\2\u0112\u0ac2\3\2\2\2\u0114"+
		"\u0aca\3\2\2\2\u0116\u0ad5\3\2\2\2\u0118\u0ad8\3\2\2\2\u011a\u0add\3\2"+
		"\2\2\u011c\u0ae9\3\2\2\2\u011e\u0aeb\3\2\2\2\u0120\u0aed\3\2\2\2\u0122"+
		"\u0aef\3\2\2\2\u0124\u0af1\3\2\2\2\u0126\u0af4\3\2\2\2\u0128\u0b06\3\2"+
		"\2\2\u012a\u012b\5\4\3\2\u012b\u012c\7\2\2\3\u012c\3\3\2\2\2\u012d\u012f"+
		"\7\u00e6\2\2\u012e\u012d\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0133\3\2\2"+
		"\2\u0130\u0132\5\u0126\u0094\2\u0131\u0130\3\2\2\2\u0132\u0135\3\2\2\2"+
		"\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u013d\3\2\2\2\u0135\u0133"+
		"\3\2\2\2\u0136\u013a\5\6\4\2\u0137\u0139\5\u0126\u0094\2\u0138\u0137\3"+
		"\2\2\2\u0139\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b"+
		"\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013d\u0136\3\2\2\2\u013d\u013e\3\2"+
		"\2\2\u013e\u0146\3\2\2\2\u013f\u0143\5\f\7\2\u0140\u0142\5\u0126\u0094"+
		"\2\u0141\u0140\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144"+
		"\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0146\u013f\3\2\2\2\u0146"+
		"\u0147\3\2\2\2\u0147\u0149\3\2\2\2\u0148\u014a\5\b\5\2\u0149\u0148\3\2"+
		"\2\2\u0149\u014a\3\2\2\2\u014a\u014e\3\2\2\2\u014b\u014d\5\u0126\u0094"+
		"\2\u014c\u014b\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f"+
		"\3\2\2\2\u014f\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0153\5\16\b\2"+
		"\u0152\u0151\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0157\3\2\2\2\u0154\u0156"+
		"\5\u0126\u0094\2\u0155\u0154\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3"+
		"\2\2\2\u0157\u0158\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157\3\2\2\2\u015a"+
		"\u015c\5\20\t\2\u015b\u015a\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u0160\3"+
		"\2\2\2\u015d\u015f\5\u0126\u0094\2\u015e\u015d\3\2\2\2\u015f\u0162\3\2"+
		"\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0164\3\2\2\2\u0162"+
		"\u0160\3\2\2\2\u0163\u0165\5\30\r\2\u0164\u0163\3\2\2\2\u0164\u0165\3"+
		"\2\2\2\u0165\u0169\3\2\2\2\u0166\u0168\5\u0126\u0094\2\u0167\u0166\3\2"+
		"\2\2\u0168\u016b\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a"+
		"\u016d\3\2\2\2\u016b\u0169\3\2\2\2\u016c\u016e\7\u00e6\2\2\u016d\u016c"+
		"\3\2\2\2\u016d\u016e\3\2\2\2\u016e\5\3\2\2\2\u016f\u0170\7\u00bc\2\2\u0170"+
		"\u0171\7\u00e6\2\2\u0171\u0174\7\u00dd\2\2\u0172\u0173\7\u00e6\2\2\u0173"+
		"\u0175\7\36\2\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\7\3\2\2"+
		"\2\u0176\u017a\7\23\2\2\u0177\u0179\5\u0126\u0094\2\u0178\u0177\3\2\2"+
		"\2\u0179\u017c\3\2\2\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017e"+
		"\3\2\2\2\u017c\u017a\3\2\2\2\u017d\u017f\5\n\6\2\u017e\u017d\3\2\2\2\u017f"+
		"\u0180\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182\3\2"+
		"\2\2\u0182\u0183\7A\2\2\u0183\t\3\2\2\2\u0184\u0186\5\u0104\u0083\2\u0185"+
		"\u0187\7\u00e6\2\2\u0186\u0185\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0188"+
		"\3\2\2\2\u0188\u018a\7\u00c8\2\2\u0189\u018b\7\u00e6\2\2\u018a\u0189\3"+
		"\2\2\2\u018a\u018b\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u0190\5\u0118\u008d"+
		"\2\u018d\u018f\5\u0126\u0094\2\u018e\u018d\3\2\2\2\u018f\u0192\3\2\2\2"+
		"\u0190\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191\13\3\2\2\2\u0192\u0190"+
		"\3\2\2\2\u0193\u0194\7\23\2\2\u0194\u0195\7\u00e6\2\2\u0195\u0196\5\u011a"+
		"\u008e\2\u0196\u0197\7\u00e6\2\2\u0197\u019b\5\u0104\u0083\2\u0198\u019a"+
		"\5\u0126\u0094\2\u0199\u0198\3\2\2\2\u019a\u019d\3\2\2\2\u019b\u0199\3"+
		"\2\2\2\u019b\u019c\3\2\2\2\u019c\u019f\3\2\2\2\u019d\u019b\3\2\2\2\u019e"+
		"\u01a0\5\n\6\2\u019f\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u019f\3\2"+
		"\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a6\3\2\2\2\u01a3\u01a5\5\f\7\2\u01a4"+
		"\u01a3\3\2\2\2\u01a5\u01a8\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7\3\2"+
		"\2\2\u01a7\u01a9\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a9\u01aa\7A\2\2\u01aa"+
		"\r\3\2\2\2\u01ab\u01ad\5\34\17\2\u01ac\u01ae\5\u0126\u0094\2\u01ad\u01ac"+
		"\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0"+
		"\u01b2\3\2\2\2\u01b1\u01ab\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b1\3\2"+
		"\2\2\u01b3\u01b4\3\2\2\2\u01b4\17\3\2\2\2\u01b5\u01bf\5\24\13\2\u01b6"+
		"\u01b8\5\u0126\u0094\2\u01b7\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01b7"+
		"\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bc\5\24\13\2"+
		"\u01bc\u01be\3\2\2\2\u01bd\u01b7\3\2\2\2\u01be\u01c1\3\2\2\2\u01bf\u01bd"+
		"\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c5\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c2"+
		"\u01c4\5\u0126\u0094\2\u01c3\u01c2\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c3"+
		"\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\21\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c8"+
		"\u01c9\7\u0081\2\2\u01c9\u01ca\7\u00e6\2\2\u01ca\u01d1\7\u00db\2\2\u01cb"+
		"\u01cc\7\u0083\2\2\u01cc\u01cd\7\u00e6\2\2\u01cd\u01d1\t\2\2\2\u01ce\u01d1"+
		"\7\u0082\2\2\u01cf\u01d1\7\u0084\2\2\u01d0\u01c8\3\2\2\2\u01d0\u01cb\3"+
		"\2\2\2\u01d0\u01ce\3\2\2\2\u01d0\u01cf\3\2\2\2\u01d1\23\3\2\2\2\u01d2"+
		"\u01dd\5\u0124\u0093\2\u01d3\u01dd\5\64\33\2\u01d4\u01dd\5> \2\u01d5\u01dd"+
		"\5F$\2\u01d6\u01dd\5.\30\2\u01d7\u01dd\5d\63\2\u01d8\u01dd\5\u00d4k\2"+
		"\u01d9\u01dd\5\22\n\2\u01da\u01dd\5\u00c6d\2\u01db\u01dd\5\34\17\2\u01dc"+
		"\u01d2\3\2\2\2\u01dc\u01d3\3\2\2\2\u01dc\u01d4\3\2\2\2\u01dc\u01d5\3\2"+
		"\2\2\u01dc\u01d6\3\2\2\2\u01dc\u01d7\3\2\2\2\u01dc\u01d8\3\2\2\2\u01dc"+
		"\u01d9\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc\u01db\3\2\2\2\u01dd\25\3\2\2"+
		"\2\u01de\u01e1\5t;\2\u01df\u01e1\5v<\2\u01e0\u01de\3\2\2\2\u01e0\u01df"+
		"\3\2\2\2\u01e1\27\3\2\2\2\u01e2\u01ec\5\32\16\2\u01e3\u01e5\5\u0126\u0094"+
		"\2\u01e4\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e6\u01e7"+
		"\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01e9\5\32\16\2\u01e9\u01eb\3\2\2\2"+
		"\u01ea\u01e4\3\2\2\2\u01eb\u01ee\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01ed"+
		"\3\2\2\2\u01ed\u01f2\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ef\u01f1\5\u0126\u0094"+
		"\2\u01f0\u01ef\3\2\2\2\u01f1\u01f4\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f2\u01f3"+
		"\3\2\2\2\u01f3\31\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f5\u01fc\5P)\2\u01f6"+
		"\u01fc\5\u0092J\2\u01f7\u01fc\5\u0094K\2\u01f8\u01fc\5\u0096L\2\u01f9"+
		"\u01fc\5\u00c2b\2\u01fa\u01fc\5R*\2\u01fb\u01f5\3\2\2\2\u01fb\u01f6\3"+
		"\2\2\2\u01fb\u01f7\3\2\2\2\u01fb\u01f8\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb"+
		"\u01fa\3\2\2\2\u01fc\33\3\2\2\2\u01fd\u01fe\7\17\2\2\u01fe\u01ff\7\u00e6"+
		"\2\2\u01ff\u0201\5\u00e8u\2\u0200\u0202\7\u00e6\2\2\u0201\u0200\3\2\2"+
		"\2\u0201\u0202\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0205\7\u00c8\2\2\u0204"+
		"\u0206\7\u00e6\2\2\u0205\u0204\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0207"+
		"\3\2\2\2\u0207\u0212\5\u0118\u008d\2\u0208\u020a\7\u00e6\2\2\u0209\u0208"+
		"\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020d\7\3\2\2\u020c"+
		"\u020e\7\u00e6\2\2\u020d\u020c\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u020f"+
		"\3\2\2\2\u020f\u0211\5\u0118\u008d\2\u0210\u0209\3\2\2\2\u0211\u0214\3"+
		"\2\2\2\u0212\u0210\3\2\2\2\u0212\u0213\3\2\2\2\u0213\35\3\2\2\2\u0214"+
		"\u0212\3\2\2\2\u0215\u021b\5 \21\2\u0216\u0217\5\u0128\u0095\2\u0217\u0218"+
		"\5 \21\2\u0218\u021a\3\2\2\2\u0219\u0216\3\2\2\2\u021a\u021d\3\2\2\2\u021b"+
		"\u0219\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021e\3\2\2\2\u021d\u021b\3\2"+
		"\2\2\u021e\u021f\5\u0128\u0095\2\u021f\37\3\2\2\2\u0220\u0261\5\u0116"+
		"\u008c\2\u0221\u0261\5~@\2\u0222\u0261\5$\23\2\u0223\u0261\5\34\17\2\u0224"+
		"\u0261\5&\24\2\u0225\u0261\5(\25\2\u0226\u0261\5*\26\2\u0227\u0261\5,"+
		"\27\2\u0228\u0261\5.\30\2\u0229\u0261\5\62\32\2\u022a\u0261\58\35\2\u022b"+
		"\u0261\5\66\34\2\u022c\u0261\5:\36\2\u022d\u0261\5<\37\2\u022e\u0261\5"+
		"B\"\2\u022f\u0261\5D#\2\u0230\u0261\5H%\2\u0231\u0261\5\u00e4s\2\u0232"+
		"\u0261\5J&\2\u0233\u0261\5L\'\2\u0234\u0261\5N(\2\u0235\u0261\5T+\2\u0236"+
		"\u0261\5V,\2\u0237\u0261\5X-\2\u0238\u0261\5Z.\2\u0239\u0261\5f\64\2\u023a"+
		"\u0261\5h\65\2\u023b\u0261\5j\66\2\u023c\u0261\5l\67\2\u023d\u0261\5n"+
		"8\2\u023e\u0261\5p9\2\u023f\u0261\5r:\2\u0240\u0261\5\u0080A\2\u0241\u0261"+
		"\5\u0082B\2\u0242\u0261\5\u0084C\2\u0243\u0261\5\u0086D\2\u0244\u0261"+
		"\5\u0088E\2\u0245\u0261\5\u008aF\2\u0246\u0261\5\u0090I\2\u0247\u0261"+
		"\5\u0098M\2\u0248\u0261\5\u009aN\2\u0249\u0261\5\u009eP\2\u024a\u0261"+
		"\5\u00a2R\2\u024b\u0261\5\u00a4S\2\u024c\u0261\5\u00a6T\2\u024d\u0261"+
		"\5\u00a8U\2\u024e\u0261\5\u00aaV\2\u024f\u0261\5\u00acW\2\u0250\u0261"+
		"\5\u00aeX\2\u0251\u0261\5\u00b0Y\2\u0252\u0261\5\u00b2Z\2\u0253\u0261"+
		"\5\u00ba^\2\u0254\u0261\5\u00bc_\2\u0255\u0261\5\u00be`\2\u0256\u0261"+
		"\5\u00c0a\2\u0257\u0261\5\u00c4c\2\u0258\u0261\5\u00ccg\2\u0259\u0261"+
		"\5\u00ceh\2\u025a\u0261\5\u00d4k\2\u025b\u0261\5\u00dan\2\u025c\u0261"+
		"\5\u00dco\2\u025d\u0261\5\u00dep\2\u025e\u0261\5\u00e0q\2\u025f\u0261"+
		"\5\u00e6t\2\u0260\u0220\3\2\2\2\u0260\u0221\3\2\2\2\u0260\u0222\3\2\2"+
		"\2\u0260\u0223\3\2\2\2\u0260\u0224\3\2\2\2\u0260\u0225\3\2\2\2\u0260\u0226"+
		"\3\2\2\2\u0260\u0227\3\2\2\2\u0260\u0228\3\2\2\2\u0260\u0229\3\2\2\2\u0260"+
		"\u022a\3\2\2\2\u0260\u022b\3\2\2\2\u0260\u022c\3\2\2\2\u0260\u022d\3\2"+
		"\2\2\u0260\u022e\3\2\2\2\u0260\u022f\3\2\2\2\u0260\u0230\3\2\2\2\u0260"+
		"\u0231\3\2\2\2\u0260\u0232\3\2\2\2\u0260\u0233\3\2\2\2\u0260\u0234\3\2"+
		"\2\2\u0260\u0235\3\2\2\2\u0260\u0236\3\2\2\2\u0260\u0237\3\2\2\2\u0260"+
		"\u0238\3\2\2\2\u0260\u0239\3\2\2\2\u0260\u023a\3\2\2\2\u0260\u023b\3\2"+
		"\2\2\u0260\u023c\3\2\2\2\u0260\u023d\3\2\2\2\u0260\u023e\3\2\2\2\u0260"+
		"\u023f\3\2\2\2\u0260\u0240\3\2\2\2\u0260\u0241\3\2\2\2\u0260\u0242\3\2"+
		"\2\2\u0260\u0243\3\2\2\2\u0260\u0244\3\2\2\2\u0260\u0245\3\2\2\2\u0260"+
		"\u0246\3\2\2\2\u0260\u0247\3\2\2\2\u0260\u0248\3\2\2\2\u0260\u0249\3\2"+
		"\2\2\u0260\u024a\3\2\2\2\u0260\u024b\3\2\2\2\u0260\u024c\3\2\2\2\u0260"+
		"\u024d\3\2\2\2\u0260\u024e\3\2\2\2\u0260\u024f\3\2\2\2\u0260\u0250\3\2"+
		"\2\2\u0260\u0251\3\2\2\2\u0260\u0252\3\2\2\2\u0260\u0253\3\2\2\2\u0260"+
		"\u0254\3\2\2\2\u0260\u0255\3\2\2\2\u0260\u0256\3\2\2\2\u0260\u0257\3\2"+
		"\2\2\u0260\u0258\3\2\2\2\u0260\u0259\3\2\2\2\u0260\u025a\3\2\2\2\u0260"+
		"\u025b\3\2\2\2\u0260\u025c\3\2\2\2\u0260\u025d\3\2\2\2\u0260\u025e\3\2"+
		"\2\2\u0260\u025f\3\2\2\2\u0261!\3\2\2\2\u0262\u0294\3\2\2\2\u0263\u0294"+
		"\5$\23\2\u0264\u0294\5&\24\2\u0265\u0294\5(\25\2\u0266\u0294\5*\26\2\u0267"+
		"\u0294\5,\27\2\u0268\u0294\5\62\32\2\u0269\u0294\58\35\2\u026a\u0294\5"+
		":\36\2\u026b\u0294\5<\37\2\u026c\u0294\5B\"\2\u026d\u0294\5\u00e4s\2\u026e"+
		"\u0294\5J&\2\u026f\u0294\5L\'\2\u0270\u0294\5N(\2\u0271\u0294\5T+\2\u0272"+
		"\u0294\5Z.\2\u0273\u0294\5f\64\2\u0274\u0294\5h\65\2\u0275\u0294\5j\66"+
		"\2\u0276\u0294\5l\67\2\u0277\u0294\5n8\2\u0278\u0294\5p9\2\u0279\u0294"+
		"\5r:\2\u027a\u0294\5~@\2\u027b\u0294\5\u0080A\2\u027c\u0294\5\u0082B\2"+
		"\u027d\u0294\5\u008aF\2\u027e\u0294\5\u0090I\2\u027f\u0294\5\u0098M\2"+
		"\u0280\u0294\5\u009aN\2\u0281\u0294\5\u009eP\2\u0282\u0294\5\u00a2R\2"+
		"\u0283\u0294\5\u00a8U\2\u0284\u0294\5\u00aaV\2\u0285\u0294\5\u00acW\2"+
		"\u0286\u0294\5\u00aeX\2\u0287\u0294\5\u00b0Y\2\u0288\u0294\5\u00b2Z\2"+
		"\u0289\u0294\5\u00ba^\2\u028a\u0294\5\u00bc_\2\u028b\u0294\5\u00be`\2"+
		"\u028c\u0294\5\u00c4c\2\u028d\u0294\5\u00ccg\2\u028e\u0294\5\u00ceh\2"+
		"\u028f\u0294\5\u00dan\2\u0290\u0294\5\u00dco\2\u0291\u0294\5\u00d2j\2"+
		"\u0292\u0294\5\u00e6t\2\u0293\u0262\3\2\2\2\u0293\u0263\3\2\2\2\u0293"+
		"\u0264\3\2\2\2\u0293\u0265\3\2\2\2\u0293\u0266\3\2\2\2\u0293\u0267\3\2"+
		"\2\2\u0293\u0268\3\2\2\2\u0293\u0269\3\2\2\2\u0293\u026a\3\2\2\2\u0293"+
		"\u026b\3\2\2\2\u0293\u026c\3\2\2\2\u0293\u026d\3\2\2\2\u0293\u026e\3\2"+
		"\2\2\u0293\u026f\3\2\2\2\u0293\u0270\3\2\2\2\u0293\u0271\3\2\2\2\u0293"+
		"\u0272\3\2\2\2\u0293\u0273\3\2\2\2\u0293\u0274\3\2\2\2\u0293\u0275\3\2"+
		"\2\2\u0293\u0276\3\2\2\2\u0293\u0277\3\2\2\2\u0293\u0278\3\2\2\2\u0293"+
		"\u0279\3\2\2\2\u0293\u027a\3\2\2\2\u0293\u027b\3\2\2\2\u0293\u027c\3\2"+
		"\2\2\u0293\u027d\3\2\2\2\u0293\u027e\3\2\2\2\u0293\u027f\3\2\2\2\u0293"+
		"\u0280\3\2\2\2\u0293\u0281\3\2\2\2\u0293\u0282\3\2\2\2\u0293\u0283\3\2"+
		"\2\2\u0293\u0284\3\2\2\2\u0293\u0285\3\2\2\2\u0293\u0286\3\2\2\2\u0293"+
		"\u0287\3\2\2\2\u0293\u0288\3\2\2\2\u0293\u0289\3\2\2\2\u0293\u028a\3\2"+
		"\2\2\u0293\u028b\3\2\2\2\u0293\u028c\3\2\2\2\u0293\u028d\3\2\2\2\u0293"+
		"\u028e\3\2\2\2\u0293\u028f\3\2\2\2\u0293\u0290\3\2\2\2\u0293\u0291\3\2"+
		"\2\2\u0293\u0292\3\2\2\2\u0294#\3\2\2\2\u0295\u0296\7\20\2\2\u0296\u0297"+
		"\7\u00e6\2\2\u0297\u02a0\5\u00d2j\2\u0298\u029a\7\u00e6\2\2\u0299\u0298"+
		"\3\2\2\2\u0299\u029a\3\2\2\2\u029a\u029b\3\2\2\2\u029b\u029d\7\3\2\2\u029c"+
		"\u029e\7\u00e6\2\2\u029d\u029c\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u029f"+
		"\3\2\2\2\u029f\u02a1\5\u00d2j\2\u02a0\u0299\3\2\2\2\u02a0\u02a1\3\2\2"+
		"\2\u02a1%\3\2\2\2\u02a2\u02a3\7\24\2\2\u02a3\'\3\2\2\2\u02a4\u02a5\7\34"+
		"\2\2\u02a5\u02a6\7\u00e6\2\2\u02a6\u02a7\5\u00d2j\2\u02a7)\3\2\2\2\u02a8"+
		"\u02a9\7\35\2\2\u02a9\u02aa\7\u00e6\2\2\u02aa\u02ab\5\u00d2j\2\u02ab+"+
		"\3\2\2\2\u02ac\u02bc\7\37\2\2\u02ad\u02ae\7\u00e6\2\2\u02ae\u02b9\5\u00e2"+
		"r\2\u02af\u02b1\7\u00e6\2\2\u02b0\u02af\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1"+
		"\u02b2\3\2\2\2\u02b2\u02b4\7\3\2\2\u02b3\u02b5\7\u00e6\2\2\u02b4\u02b3"+
		"\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6\u02b8\5\u00e2r"+
		"\2\u02b7\u02b0\3\2\2\2\u02b8\u02bb\3\2\2\2\u02b9\u02b7\3\2\2\2\u02b9\u02ba"+
		"\3\2\2\2\u02ba\u02bd\3\2\2\2\u02bb\u02b9\3\2\2\2\u02bc\u02ad\3\2\2\2\u02bc"+
		"\u02bd\3\2\2\2\u02bd-\3\2\2\2\u02be\u02bf\5\u011e\u0090\2\u02bf\u02c0"+
		"\7\u00e6\2\2\u02c0\u02c2\3\2\2\2\u02c1\u02be\3\2\2\2\u02c1\u02c2\3\2\2"+
		"\2\u02c2\u02c3\3\2\2\2\u02c3\u02c4\7!\2\2\u02c4\u02c5\7\u00e6\2\2\u02c5"+
		"\u02d0\5\60\31\2\u02c6\u02c8\7\u00e6\2\2\u02c7\u02c6\3\2\2\2\u02c7\u02c8"+
		"\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9\u02cb\7\3\2\2\u02ca\u02cc\7\u00e6\2"+
		"\2\u02cb\u02ca\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd\u02cf"+
		"\5\60\31\2\u02ce\u02c7\3\2\2\2\u02cf\u02d2\3\2\2\2\u02d0\u02ce\3\2\2\2"+
		"\u02d0\u02d1\3\2\2\2\u02d1/\3\2\2\2\u02d2\u02d0\3\2\2\2\u02d3\u02d5\5"+
		"\u0104\u0083\2\u02d4\u02d6\5\u011c\u008f\2\u02d5\u02d4\3\2\2\2\u02d5\u02d6"+
		"\3\2\2\2\u02d6\u02d9\3\2\2\2\u02d7\u02d8\7\u00e6\2\2\u02d8\u02da\5\u0106"+
		"\u0084\2\u02d9\u02d7\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02dc\3\2\2\2\u02db"+
		"\u02dd\7\u00e6\2\2\u02dc\u02db\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd\u02de"+
		"\3\2\2\2\u02de\u02e0\7\u00c8\2\2\u02df\u02e1\7\u00e6\2\2\u02e0\u02df\3"+
		"\2\2\2\u02e0\u02e1\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2\u02e3\5\u00d0i\2"+
		"\u02e3\61\3\2\2\2\u02e4\u02e6\7#\2\2\u02e5\u02e7\7\u00e6\2\2\u02e6\u02e5"+
		"\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02ea\7\u00c8\2"+
		"\2\u02e9\u02eb\7\u00e6\2\2\u02ea\u02e9\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb"+
		"\u02ec\3\2\2\2\u02ec\u02ed\5\u00d2j\2\u02ed\63\3\2\2\2\u02ee\u02ef\5\u011e"+
		"\u0090\2\u02ef\u02f0\7\u00e6\2\2\u02f0\u02f2\3\2\2\2\u02f1\u02ee\3\2\2"+
		"\2\u02f1\u02f2\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3\u02f4\7$\2\2\u02f4\u02f7"+
		"\7\u00e6\2\2\u02f5\u02f6\7\u008e\2\2\u02f6\u02f8\7\u00e6\2\2\u02f7\u02f5"+
		"\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u02fe\3\2\2\2\u02f9\u02fb\7Q\2\2\u02fa"+
		"\u02fc\5\u011c\u008f\2\u02fb\u02fa\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u02ff"+
		"\3\2\2\2\u02fd\u02ff\7\u00ad\2\2\u02fe\u02f9\3\2\2\2\u02fe\u02fd\3\2\2"+
		"\2\u02ff\u0300\3\2\2\2\u0300\u0301\7\u00e6\2\2\u0301\u0303\5\u0104\u0083"+
		"\2\u0302\u0304\5\u011c\u008f\2\u0303\u0302\3\2\2\2\u0303\u0304\3\2\2\2"+
		"\u0304\u0305\3\2\2\2\u0305\u0306\7\u00e6\2\2\u0306\u0307\7e\2\2\u0307"+
		"\u0308\7\u00e6\2\2\u0308\u030d\7\u00d8\2\2\u0309\u030a\7\u00e6\2\2\u030a"+
		"\u030b\7\r\2\2\u030b\u030c\7\u00e6\2\2\u030c\u030e\7\u00d8\2\2\u030d\u0309"+
		"\3\2\2\2\u030d\u030e\3\2\2\2\u030e\u0313\3\2\2\2\u030f\u0311\7\u00e6\2"+
		"\2\u0310\u030f\3\2\2\2\u0310\u0311\3\2\2\2\u0311\u0312\3\2\2\2\u0312\u0314"+
		"\5\u00f6|\2\u0313\u0310\3\2\2\2\u0313\u0314\3\2\2\2\u0314\u0317\3\2\2"+
		"\2\u0315\u0316\7\u00e6\2\2\u0316\u0318\5\u0106\u0084\2\u0317\u0315\3\2"+
		"\2\2\u0317\u0318\3\2\2\2\u0318\65\3\2\2\2\u0319\u031a\t\3\2\2\u031a\u031b"+
		"\7\u00e6\2\2\u031b\u0326\5\u0114\u008b\2\u031c\u031e\7\u00e6\2\2\u031d"+
		"\u031c\3\2\2\2\u031d\u031e\3\2\2\2\u031e\u031f\3\2\2\2\u031f\u0321\7\3"+
		"\2\2\u0320\u0322\7\u00e6\2\2\u0321\u0320\3\2\2\2\u0321\u0322\3\2\2\2\u0322"+
		"\u0323\3\2\2\2\u0323\u0325\5\u0114\u008b\2\u0324\u031d\3\2\2\2\u0325\u0328"+
		"\3\2\2\2\u0326\u0324\3\2\2\2\u0326\u0327\3\2\2\2\u0327\67\3\2\2\2\u0328"+
		"\u0326\3\2\2\2\u0329\u032a\7\61\2\2\u032a\u032b\7\u00e6\2\2\u032b\u032d"+
		"\5\u00d2j\2\u032c\u032e\7\u00e6\2\2\u032d\u032c\3\2\2\2\u032d\u032e\3"+
		"\2\2\2\u032e\u032f\3\2\2\2\u032f\u0331\7\3\2\2\u0330\u0332\7\u00e6\2\2"+
		"\u0331\u0330\3\2\2\2\u0331\u0332\3\2\2\2\u0332\u0333\3\2\2\2\u0333\u033c"+
		"\5\u00d2j\2\u0334\u0336\7\u00e6\2\2\u0335\u0334\3\2\2\2\u0335\u0336\3"+
		"\2\2\2\u0336\u0337\3\2\2\2\u0337\u0339\7\3\2\2\u0338\u033a\7\u00e6\2\2"+
		"\u0339\u0338\3\2\2\2\u0339\u033a\3\2\2\2\u033a\u033b\3\2\2\2\u033b\u033d"+
		"\5\u00d2j\2\u033c\u0335\3\2\2\2\u033c\u033d\3\2\2\2\u033d9\3\2\2\2\u033e"+
		"\u033f\7\63\2\2\u033f\u0341\5\u0128\u0095\2\u0340\u0342\5\36\20\2\u0341"+
		"\u0340\3\2\2\2\u0341\u0342\3\2\2\2\u0342\u0343\3\2\2\2\u0343\u0344\7b"+
		"\2\2\u0344\u035a\3\2\2\2\u0345\u0346\7\63\2\2\u0346\u0347\7\u00e6\2\2"+
		"\u0347\u0348\t\4\2\2\u0348\u0349\7\u00e6\2\2\u0349\u034a\5\u00d2j\2\u034a"+
		"\u034c\5\u0128\u0095\2\u034b\u034d\5\36\20\2\u034c\u034b\3\2\2\2\u034c"+
		"\u034d\3\2\2\2\u034d\u034e\3\2\2\2\u034e\u034f\7b\2\2\u034f\u035a\3\2"+
		"\2\2\u0350\u0351\7\63\2\2\u0351\u0352\5\u0128\u0095\2\u0352\u0353\5\36"+
		"\20\2\u0353\u0354\7b\2\2\u0354\u0355\7\u00e6\2\2\u0355\u0356\t\4\2\2\u0356"+
		"\u0357\7\u00e6\2\2\u0357\u0358\5\u00d2j\2\u0358\u035a\3\2\2\2\u0359\u033e"+
		"\3\2\2\2\u0359\u0345\3\2\2\2\u0359\u0350\3\2\2\2\u035a;\3\2\2\2\u035b"+
		"\u035c\7A\2\2\u035c=\3\2\2\2\u035d\u035e\5\u011e\u0090\2\u035e\u035f\7"+
		"\u00e6\2\2\u035f\u0361\3\2\2\2\u0360\u035d\3\2\2\2\u0360\u0361\3\2\2\2"+
		"\u0361\u0362\3\2\2\2\u0362\u0363\7B\2\2\u0363\u0364\7\u00e6\2\2\u0364"+
		"\u0365\5\u0104\u0083\2\u0365\u0369\5\u0128\u0095\2\u0366\u0368\5@!\2\u0367"+
		"\u0366\3\2\2\2\u0368\u036b\3\2\2\2\u0369\u0367\3\2\2\2\u0369\u036a\3\2"+
		"\2\2\u036a\u036c\3\2\2\2\u036b\u0369\3\2\2\2\u036c\u036d\78\2\2\u036d"+
		"?\3\2\2\2\u036e\u0377\5\u0104\u0083\2\u036f\u0371\7\u00e6\2\2\u0370\u036f"+
		"\3\2\2\2\u0370\u0371\3\2\2\2\u0371\u0372\3\2\2\2\u0372\u0374\7\u00c8\2"+
		"\2\u0373\u0375\7\u00e6\2\2\u0374\u0373\3\2\2\2\u0374\u0375\3\2\2\2\u0375"+
		"\u0376\3\2\2\2\u0376\u0378\5\u00d0i\2\u0377\u0370\3\2\2\2\u0377\u0378"+
		"\3\2\2\2\u0378\u0379\3\2\2\2\u0379\u037a\5\u0128\u0095\2\u037aA\3\2\2"+
		"\2\u037b\u037c\7D\2\2\u037c\u037d\7\u00e6\2\2\u037d\u037e\5\u00d2j\2\u037e"+
		"C\3\2\2\2\u037f\u0380\7E\2\2\u0380\u0381\7\u00e6\2\2\u0381\u0382\5\u00d2"+
		"j\2\u0382E\3\2\2\2\u0383\u0384\5\u011e\u0090\2\u0384\u0385\7\u00e6\2\2"+
		"\u0385\u0387\3\2\2\2\u0386\u0383\3\2\2\2\u0386\u0387\3\2\2\2\u0387\u0388"+
		"\3\2\2\2\u0388\u0389\7F\2\2\u0389\u038a\7\u00e6\2\2\u038a\u038c\5\u0104"+
		"\u0083\2\u038b\u038d\7\u00e6\2\2\u038c\u038b\3\2\2\2\u038c\u038d\3\2\2"+
		"\2\u038d\u038e\3\2\2\2\u038e\u038f\5\u00f6|\2\u038fG\3\2\2\2\u0390\u0391"+
		"\t\5\2\2\u0391I\3\2\2\2\u0392\u0393\7N\2\2\u0393\u0394\7\u00e6\2\2\u0394"+
		"\u0396\5\u00d2j\2\u0395\u0397\7\u00e6\2\2\u0396\u0395\3\2\2\2\u0396\u0397"+
		"\3\2\2\2\u0397\u0398\3\2\2\2\u0398\u039a\7\3\2\2\u0399\u039b\7\u00e6\2"+
		"\2\u039a\u0399\3\2\2\2\u039a\u039b\3\2\2\2\u039b\u039c\3\2\2\2\u039c\u039d"+
		"\5\u00d2j\2\u039dK\3\2\2\2\u039e\u039f\7P\2\2\u039f\u03a0\7\u00e6\2\2"+
		"\u03a0\u03a1\7\65\2\2\u03a1\u03a2\7\u00e6\2\2\u03a2\u03a4\5\u0104\u0083"+
		"\2\u03a3\u03a5\5\u011c\u008f\2\u03a4\u03a3\3\2\2\2\u03a4\u03a5\3\2\2\2"+
		"\u03a5\u03a6\3\2\2\2\u03a6\u03a7\7\u00e6\2\2\u03a7\u03a8\7Z\2\2\u03a8"+
		"\u03a9\7\u00e6\2\2\u03a9\u03aa\5\u00d2j\2\u03aa\u03ac\5\u0128\u0095\2"+
		"\u03ab\u03ad\5\36\20\2\u03ac\u03ab\3\2\2\2\u03ac\u03ad\3\2\2\2\u03ad\u03ae"+
		"\3\2\2\2\u03ae\u03b1\7v\2\2\u03af\u03b0\7\u00e6\2\2\u03b0\u03b2\5\u0104"+
		"\u0083\2\u03b1\u03af\3\2\2\2\u03b1\u03b2\3\2\2\2\u03b2M\3\2\2\2\u03b3"+
		"\u03b4\7P\2\2\u03b4\u03b5\7\u00e6\2\2\u03b5\u03b7\5\u0104\u0083\2\u03b6"+
		"\u03b8\5\u011c\u008f\2\u03b7\u03b6\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8\u03bb"+
		"\3\2\2\2\u03b9\u03ba\7\u00e6\2\2\u03ba\u03bc\5\u0106\u0084\2\u03bb\u03b9"+
		"\3\2\2\2\u03bb\u03bc\3\2\2\2\u03bc\u03be\3\2\2\2\u03bd\u03bf\7\u00e6\2"+
		"\2\u03be\u03bd\3\2\2\2\u03be\u03bf\3\2\2\2\u03bf\u03c0\3\2\2\2\u03c0\u03c2"+
		"\7\u00c8\2\2\u03c1\u03c3\7\u00e6\2\2\u03c2\u03c1\3\2\2\2\u03c2\u03c3\3"+
		"\2\2\2\u03c3\u03c4\3\2\2\2\u03c4\u03c5\5\u00d2j\2\u03c5\u03c6\7\u00e6"+
		"\2\2\u03c6\u03c7\7\u00b2\2\2\u03c7\u03c8\7\u00e6\2\2\u03c8\u03cd\5\u00d2"+
		"j\2\u03c9\u03ca\7\u00e6\2\2\u03ca\u03cb\7\u00aa\2\2\u03cb\u03cc\7\u00e6"+
		"\2\2\u03cc\u03ce\5\u00d2j\2\u03cd\u03c9\3\2\2\2\u03cd\u03ce\3\2\2\2\u03ce"+
		"\u03cf\3\2\2\2\u03cf\u03d1\5\u0128\u0095\2\u03d0\u03d2\5\36\20\2\u03d1"+
		"\u03d0\3\2\2\2\u03d1\u03d2\3\2\2\2\u03d2\u03d3\3\2\2\2\u03d3\u03d6\7v"+
		"\2\2\u03d4\u03d5\7\u00e6\2\2\u03d5\u03d7\5\u0104\u0083\2\u03d6\u03d4\3"+
		"\2\2\2\u03d6\u03d7\3\2\2\2\u03d7O\3\2\2\2\u03d8\u03d9\5\u011e\u0090\2"+
		"\u03d9\u03da\7\u00e6\2\2\u03da\u03dc\3\2\2\2\u03db\u03d8\3\2\2\2\u03db"+
		"\u03dc\3\2\2\2\u03dc\u03df\3\2\2\2\u03dd\u03de\7\u00a9\2\2\u03de\u03e0"+
		"\7\u00e6\2\2\u03df\u03dd\3\2\2\2\u03df\u03e0\3\2\2\2\u03e0\u03e1\3\2\2"+
		"\2\u03e1\u03e3\7Q\2\2\u03e2\u03e4\7\u00e6\2\2\u03e3\u03e2\3\2\2\2\u03e3"+
		"\u03e4\3\2\2\2\u03e4\u03e5\3\2\2\2\u03e5\u03e7\5\u0104\u0083\2\u03e6\u03e8"+
		"\5\u011c\u008f\2\u03e7\u03e6\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e8\u03ed\3"+
		"\2\2\2\u03e9\u03eb\7\u00e6\2\2\u03ea\u03e9\3\2\2\2\u03ea\u03eb\3\2\2\2"+
		"\u03eb\u03ec\3\2\2\2\u03ec\u03ee\5\u00f6|\2\u03ed\u03ea\3\2\2\2\u03ed"+
		"\u03ee\3\2\2\2\u03ee\u03f3\3\2\2\2\u03ef\u03f1\7\u00e6\2\2\u03f0\u03ef"+
		"\3\2\2\2\u03f0\u03f1\3\2\2\2\u03f1\u03f2\3\2\2\2\u03f2\u03f4\5\u0106\u0084"+
		"\2\u03f3\u03f0\3\2\2\2\u03f3\u03f4\3\2\2\2\u03f4\u03f5\3\2\2\2\u03f5\u03f7"+
		"\5\u0128\u0095\2\u03f6\u03f8\5\36\20\2\u03f7\u03f6\3\2\2\2\u03f7\u03f8"+
		"\3\2\2\2\u03f8\u03f9\3\2\2\2\u03f9\u03fa\79\2\2\u03faQ\3\2\2\2\u03fb\u03fc"+
		"\5\u011e\u0090\2\u03fc\u03fd\7\u00e6\2\2\u03fd\u03ff\3\2\2\2\u03fe\u03fb"+
		"\3\2\2\2\u03fe\u03ff\3\2\2\2\u03ff\u0402\3\2\2\2\u0400\u0401\7\u00a9\2"+
		"\2\u0401\u0403\7\u00e6\2\2\u0402\u0400\3\2\2\2\u0402\u0403\3\2\2\2\u0403"+
		"\u0404\3\2\2\2\u0404\u0406\7R\2\2\u0405\u0407\7\u00e6\2\2\u0406\u0405"+
		"\3\2\2\2\u0406\u0407\3\2\2\2\u0407\u0408\3\2\2\2\u0408\u040a\5\u0104\u0083"+
		"\2\u0409\u040b\5\u011c\u008f\2\u040a\u0409\3\2\2\2\u040a\u040b\3\2\2\2"+
		"\u040b\u040f\3\2\2\2\u040c\u040d\7\r\2\2\u040d\u040e\7\u00e6\2\2\u040e"+
		"\u0410\5\u0104\u0083\2\u040f\u040c\3\2\2\2\u040f\u0410\3\2\2\2\u0410\u0415"+
		"\3\2\2\2\u0411\u0413\7\u00e6\2\2\u0412\u0411\3\2\2\2\u0412\u0413\3\2\2"+
		"\2\u0413\u0414\3\2\2\2\u0414\u0416\5\u00f6|\2\u0415\u0412\3\2\2\2\u0415"+
		"\u0416\3\2\2\2\u0416\u041b\3\2\2\2\u0417\u0419\7\u00e6\2\2\u0418\u0417"+
		"\3\2\2\2\u0418\u0419\3\2\2\2\u0419\u041a\3\2\2\2\u041a\u041c\5\u0106\u0084"+
		"\2\u041b\u0418\3\2\2\2\u041b\u041c\3\2\2\2\u041c\u0423\3\2\2\2\u041d\u041f"+
		"\7\u00e6\2\2\u041e\u041d\3\2\2\2\u041e\u041f\3\2\2\2\u041f\u0420\3\2\2"+
		"\2\u0420\u0421\7\u00c1\2\2\u0421\u0422\7\u00e6\2\2\u0422\u0424\5\u00d2"+
		"j\2\u0423\u041e\3\2\2\2\u0423\u0424\3\2\2\2\u0424\u0425\3\2\2\2\u0425"+
		"\u0427\5\u0128\u0095\2\u0426\u0428\5\36\20\2\u0427\u0426\3\2\2\2\u0427"+
		"\u0428\3\2\2\2\u0428\u0429\3\2\2\2\u0429\u042a\7:\2\2\u042aS\3\2\2\2\u042b"+
		"\u042c\7S\2\2\u042c\u042d\7\u00e6\2\2\u042d\u042f\5\u00e2r\2\u042e\u0430"+
		"\7\u00e6\2\2\u042f\u042e\3\2\2\2\u042f\u0430\3\2\2\2\u0430\u0431\3\2\2"+
		"\2\u0431\u0433\7\3\2\2\u0432\u0434\7\u00e6\2\2\u0433\u0432\3\2\2\2\u0433"+
		"\u0434\3\2\2\2\u0434\u0436\3\2\2\2\u0435\u0437\5\u00d2j\2\u0436\u0435"+
		"\3\2\2\2\u0436\u0437\3\2\2\2\u0437\u0439\3\2\2\2\u0438\u043a\7\u00e6\2"+
		"\2\u0439\u0438\3\2\2\2\u0439\u043a\3\2\2\2\u043a\u043b\3\2\2\2\u043b\u043d"+
		"\7\3\2\2\u043c\u043e\7\u00e6\2\2\u043d\u043c\3\2\2\2\u043d\u043e\3\2\2"+
		"\2\u043e\u043f\3\2\2\2\u043f\u0440\5\u00d2j\2\u0440U\3\2\2\2\u0441\u0442"+
		"\7U\2\2\u0442\u0443\7\u00e6\2\2\u0443\u0444\5\u0104\u0083\2\u0444W\3\2"+
		"\2\2\u0445\u0446\7V\2\2\u0446\u0447\7\u00e6\2\2\u0447\u0448\5\u0104\u0083"+
		"\2\u0448Y\3\2\2\2\u0449\u044a\7W\2\2\u044a\u044b\7\u00e6\2\2\u044b\u044c"+
		"\5^\60\2\u044c\u044d\7\u00e6\2\2\u044d\u044e\7\u00b0\2\2\u044e\u044f\7"+
		"\u00e6\2\2\u044f\u0454\5 \21\2\u0450\u0451\7\u00e6\2\2\u0451\u0452\7\66"+
		"\2\2\u0452\u0453\7\u00e6\2\2\u0453\u0455\5 \21\2\u0454\u0450\3\2\2\2\u0454"+
		"\u0455\3\2\2\2\u0455\u0463\3\2\2\2\u0456\u045a\5\\/\2\u0457\u0459\5`\61"+
		"\2\u0458\u0457\3\2\2\2\u0459\u045c\3\2\2\2\u045a\u0458\3\2\2\2\u045a\u045b"+
		"\3\2\2\2\u045b\u045e\3\2\2\2\u045c\u045a\3\2\2\2\u045d\u045f\5b\62\2\u045e"+
		"\u045d\3\2\2\2\u045e\u045f\3\2\2\2\u045f\u0460\3\2\2\2\u0460\u0461\7;"+
		"\2\2\u0461\u0463\3\2\2\2\u0462\u0449\3\2\2\2\u0462\u0456\3\2\2\2\u0463"+
		"[\3\2\2\2\u0464\u0465\7W\2\2\u0465\u0466\7\u00e6\2\2\u0466\u0467\5^\60"+
		"\2\u0467\u0468\7\u00e6\2\2\u0468\u0469\7\u00b0\2\2\u0469\u046b\5\u0128"+
		"\u0095\2\u046a\u046c\5\36\20\2\u046b\u046a\3\2\2\2\u046b\u046c\3\2\2\2"+
		"\u046c]\3\2\2\2\u046d\u046e\5\u00d2j\2\u046e_\3\2\2\2\u046f\u0470\7\67"+
		"\2\2\u0470\u0471\7\u00e6\2\2\u0471\u0472\5^\60\2\u0472\u0473\7\u00e6\2"+
		"\2\u0473\u0474\7\u00b0\2\2\u0474\u0476\5\u0128\u0095\2\u0475\u0477\5\36"+
		"\20\2\u0476\u0475\3\2\2\2\u0476\u0477\3\2\2\2\u0477a\3\2\2\2\u0478\u0479"+
		"\7\66\2\2\u0479\u047b\5\u0128\u0095\2\u047a\u047c\5\36\20\2\u047b\u047a"+
		"\3\2\2\2\u047b\u047c\3\2\2\2\u047cc\3\2\2\2\u047d\u047e\7Y\2\2\u047e\u047f"+
		"\7\u00e6\2\2\u047f\u0480\5\u0104\u0083\2\u0480e\3\2\2\2\u0481\u0482\7"+
		"[\2\2\u0482\u0483\7\u00e6\2\2\u0483\u048c\5\u00e2r\2\u0484\u0486\7\u00e6"+
		"\2\2\u0485\u0484\3\2\2\2\u0485\u0486\3\2\2\2\u0486\u0487\3\2\2\2\u0487"+
		"\u0489\7\3\2\2\u0488\u048a\7\u00e6\2\2\u0489\u0488\3\2\2\2\u0489\u048a"+
		"\3\2\2\2\u048a\u048b\3\2\2\2\u048b\u048d\5\u00d2j\2\u048c\u0485\3\2\2"+
		"\2\u048d\u048e\3\2\2\2\u048e\u048c\3\2\2\2\u048e\u048f\3\2\2\2\u048fg"+
		"\3\2\2\2\u0490\u0491\7^\2\2\u0491\u0492\7\u00e6\2\2\u0492\u0493\5\u00d2"+
		"j\2\u0493i\3\2\2\2\u0494\u0495\7d\2\2\u0495\u0497\7\u00e6\2\2\u0496\u0494"+
		"\3\2\2\2\u0496\u0497\3\2\2\2\u0497\u0498\3\2\2\2\u0498\u049a\5\u00e8u"+
		"\2\u0499\u049b\7\u00e6\2\2\u049a\u0499\3\2\2\2\u049a\u049b\3\2\2\2\u049b"+
		"\u049c\3\2\2\2\u049c\u049e\t\6\2\2\u049d\u049f\7\u00e6\2\2\u049e\u049d"+
		"\3\2\2\2\u049e\u049f\3\2\2\2\u049f\u04a0\3\2\2\2\u04a0\u04a1\5\u00d2j"+
		"\2\u04a1k\3\2\2\2\u04a2\u04a3\7g\2\2\u04a3\u04a4\7\u00e6\2\2\u04a4\u04a6"+
		"\5\u00e2r\2\u04a5\u04a7\7\u00e6\2\2\u04a6\u04a5\3\2\2\2\u04a6\u04a7\3"+
		"\2\2\2\u04a7\u04a8\3\2\2\2\u04a8\u04aa\7\3\2\2\u04a9\u04ab\7\u00e6\2\2"+
		"\u04aa\u04a9\3\2\2\2\u04aa\u04ab\3\2\2\2\u04ab\u04ac\3\2\2\2\u04ac\u04ad"+
		"\5\u00d2j\2\u04adm\3\2\2\2\u04ae\u04af\7_\2\2\u04af\u04b0\7\u00e6\2\2"+
		"\u04b0\u04b1\5\u00d2j\2\u04b1o\3\2\2\2\u04b2\u04b3\7`\2\2\u04b3\u04b4"+
		"\7\u00e6\2\2\u04b4\u04c3\5\u00d2j\2\u04b5\u04b7\7\u00e6\2\2\u04b6\u04b5"+
		"\3\2\2\2\u04b6\u04b7\3\2\2\2\u04b7\u04b8\3\2\2\2\u04b8\u04ba\7\3\2\2\u04b9"+
		"\u04bb\7\u00e6\2\2\u04ba\u04b9\3\2\2\2\u04ba\u04bb\3\2\2\2\u04bb\u04bc"+
		"\3\2\2\2\u04bc\u04c1\5\u00d2j\2\u04bd\u04be\7\u00e6\2\2\u04be\u04bf\7"+
		"\u00b2\2\2\u04bf\u04c0\7\u00e6\2\2\u04c0\u04c2\5\u00d2j\2\u04c1\u04bd"+
		"\3\2\2\2\u04c1\u04c2\3\2\2\2\u04c2\u04c4\3\2\2\2\u04c3\u04b6\3\2\2\2\u04c3"+
		"\u04c4\3\2\2\2\u04c4q\3\2\2\2\u04c5\u04c6\7k\2\2\u04c6\u04c7\7\u00e6\2"+
		"\2\u04c7\u04c9\5\u00e8u\2\u04c8\u04ca\7\u00e6\2\2\u04c9\u04c8\3\2\2\2"+
		"\u04c9\u04ca\3\2\2\2\u04ca\u04cb\3\2\2\2\u04cb\u04cd\7\u00c8\2\2\u04cc"+
		"\u04ce\7\u00e6\2\2\u04cd\u04cc\3\2\2\2\u04cd\u04ce\3\2\2\2\u04ce\u04cf"+
		"\3\2\2\2\u04cf\u04d0\5\u00d2j\2\u04d0s\3\2\2\2\u04d1\u04d3\7l\2\2\u04d2"+
		"\u04d4\7\u00e6\2\2\u04d3\u04d2\3\2\2\2\u04d3\u04d4\3\2\2\2\u04d4\u04d5"+
		"\3\2\2\2\u04d5\u04d7\5\u0104\u0083\2\u04d6\u04d8\7\u00e6\2\2\u04d7\u04d6"+
		"\3\2\2\2\u04d7\u04d8\3\2\2\2\u04d8\u04d9\3\2\2\2\u04d9\u04db\7\u00c8\2"+
		"\2\u04da\u04dc\7\u00e6\2\2\u04db\u04da\3\2\2\2\u04db\u04dc\3\2\2\2\u04dc"+
		"\u04dd\3\2\2\2\u04dd\u04de\5\u00d2j\2\u04deu\3\2\2\2\u04df\u04e3\5x=\2"+
		"\u04e0\u04e2\5z>\2\u04e1\u04e0\3\2\2\2\u04e2\u04e5\3\2\2\2\u04e3\u04e1"+
		"\3\2\2\2\u04e3\u04e4\3\2\2\2\u04e4\u04e7\3\2\2\2\u04e5\u04e3\3\2\2\2\u04e6"+
		"\u04e8\5|?\2\u04e7\u04e6\3\2\2\2\u04e7\u04e8\3\2\2\2\u04e8\u04e9\3\2\2"+
		"\2\u04e9\u04ea\7p\2\2\u04eaw\3\2\2\2\u04eb\u04ed\7m\2\2\u04ec\u04ee\7"+
		"\u00e6\2\2\u04ed\u04ec\3\2\2\2\u04ed\u04ee\3\2\2\2\u04ee\u04ef\3\2\2\2"+
		"\u04ef\u04f0\5^\60\2\u04f0\u04f1\7\u00e6\2\2\u04f1\u04f2\7\u00b0\2\2\u04f2"+
		"\u04f8\5\u0128\u0095\2\u04f3\u04f7\5\20\t\2\u04f4\u04f7\5\30\r\2\u04f5"+
		"\u04f7\5\36\20\2\u04f6\u04f3\3\2\2\2\u04f6\u04f4\3\2\2\2\u04f6\u04f5\3"+
		"\2\2\2\u04f7\u04fa\3\2\2\2\u04f8\u04f6\3\2\2\2\u04f8\u04f9\3\2\2\2\u04f9"+
		"y\3\2\2\2\u04fa\u04f8\3\2\2\2\u04fb\u04fd\7n\2\2\u04fc\u04fe\7\u00e6\2"+
		"\2\u04fd\u04fc\3\2\2\2\u04fd\u04fe\3\2\2\2\u04fe\u04ff\3\2\2\2\u04ff\u0500"+
		"\5^\60\2\u0500\u0501\7\u00e6\2\2\u0501\u0502\7\u00b0\2\2\u0502\u0508\5"+
		"\u0128\u0095\2\u0503\u0507\5\20\t\2\u0504\u0507\5\30\r\2\u0505\u0507\5"+
		"\36\20\2\u0506\u0503\3\2\2\2\u0506\u0504\3\2\2\2\u0506\u0505\3\2\2\2\u0507"+
		"\u050a\3\2\2\2\u0508\u0506\3\2\2\2\u0508\u0509\3\2\2\2\u0509{\3\2\2\2"+
		"\u050a\u0508\3\2\2\2\u050b\u050c\7o\2\2\u050c\u0512\5\u0128\u0095\2\u050d"+
		"\u0511\5\20\t\2\u050e\u0511\5\30\r\2\u050f\u0511\5\36\20\2\u0510\u050d"+
		"\3\2\2\2\u0510\u050e\3\2\2\2\u0510\u050f\3\2\2\2\u0511\u0514\3\2\2\2\u0512"+
		"\u0510\3\2\2\2\u0512\u0513\3\2\2\2\u0513}\3\2\2\2\u0514\u0512\3\2\2\2"+
		"\u0515\u0517\7r\2\2\u0516\u0518\7\u00e6\2\2\u0517\u0516\3\2\2\2\u0517"+
		"\u0518\3\2\2\2\u0518\u0519\3\2\2\2\u0519\u051b\7\u00cc\2\2\u051a\u051c"+
		"\7\u00e6\2\2\u051b\u051a\3\2\2\2\u051b\u051c\3\2\2\2\u051c\u051d\3\2\2"+
		"\2\u051d\u051f\5\u0104\u0083\2\u051e\u0520\7\u00e6\2\2\u051f\u051e\3\2"+
		"\2\2\u051f\u0520\3\2\2\2\u0520\u0521\3\2\2\2\u0521\u0523\7\3\2\2\u0522"+
		"\u0524\7\u00e6\2\2\u0523\u0522\3\2\2\2\u0523\u0524\3\2\2\2\u0524\u0525"+
		"\3\2\2\2\u0525\u052e\5\u00d2j\2\u0526\u0528\7\u00e6\2\2\u0527\u0526\3"+
		"\2\2\2\u0527\u0528\3\2\2\2\u0528\u0529\3\2\2\2\u0529\u052b\7\3\2\2\u052a"+
		"\u052c\7\u00e6\2\2\u052b\u052a\3\2\2\2\u052b\u052c\3\2\2\2\u052c\u052d"+
		"\3\2\2\2\u052d\u052f\5\u00d2j\2\u052e\u0527\3\2\2\2\u052e\u052f\3\2\2"+
		"\2\u052f\u0531\3\2\2\2\u0530\u0532\7\u00e6\2\2\u0531\u0530\3\2\2\2\u0531"+
		"\u0532\3\2\2\2\u0532\u0533\3\2\2\2\u0533\u0535\7\u00d5\2\2\u0534\u0536"+
		"\7\u00e6\2\2\u0535\u0534\3\2\2\2\u0535\u0536\3\2\2\2\u0536\u0537\3\2\2"+
		"\2\u0537\u0539\7\u00c8\2\2\u0538\u053a\7\u00e6\2\2\u0539\u0538\3\2\2\2"+
		"\u0539\u053a\3\2\2\2\u053a\u053b\3\2\2\2\u053b\u053c\5\u00d2j\2\u053c"+
		"\177\3\2\2\2\u053d\u053e\7s\2\2\u053e\u053f\7\u00e6\2\2\u053f\u0540\5"+
		"\u00d2j\2\u0540\u0081\3\2\2\2\u0541\u0542\7u\2\2\u0542\u0543\7\u00e6\2"+
		"\2\u0543\u0544\5\u00d2j\2\u0544\u0545\7\u00e6\2\2\u0545\u0546\7\22\2\2"+
		"\u0546\u0547\7\u00e6\2\2\u0547\u0548\5\u00d2j\2\u0548\u0083\3\2\2\2\u0549"+
		"\u054a\t\7\2\2\u054a\u0551\7\u00e6\2\2\u054b\u054c\7V\2\2\u054c\u054d"+
		"\7\u00e6\2\2\u054d\u0552\5\u0104\u0083\2\u054e\u054f\7\u0099\2\2\u054f"+
		"\u0550\7\u00e6\2\2\u0550\u0552\7v\2\2\u0551\u054b\3\2\2\2\u0551\u054e"+
		"\3\2\2\2\u0552\u0085\3\2\2\2\u0553\u0554\7|\2\2\u0554\u0555\7\u00e6\2"+
		"\2\u0555\u0556\5\u00d2j\2\u0556\u0557\7\u00e6\2\2\u0557\u0558\7V\2\2\u0558"+
		"\u0559\7\u00e6\2\2\u0559\u0564\5\u0104\u0083\2\u055a\u055c\7\u00e6\2\2"+
		"\u055b\u055a\3\2\2\2\u055b\u055c\3\2\2\2\u055c\u055d\3\2\2\2\u055d\u055f"+
		"\7\3\2\2\u055e\u0560\7\u00e6\2\2\u055f\u055e\3\2\2\2\u055f\u0560\3\2\2"+
		"\2\u0560\u0561\3\2\2\2\u0561\u0563\5\u0104\u0083\2\u0562\u055b\3\2\2\2"+
		"\u0563\u0566\3\2\2\2\u0564\u0562\3\2\2\2\u0564\u0565\3\2\2\2\u0565\u0087"+
		"\3\2\2\2\u0566\u0564\3\2\2\2\u0567\u0568\7|\2\2\u0568\u0569\7\u00e6\2"+
		"\2\u0569\u056a\5\u00d2j\2\u056a\u056b\7\u00e6\2\2\u056b\u056c\7U\2\2\u056c"+
		"\u056d\7\u00e6\2\2\u056d\u0578\5\u0104\u0083\2\u056e\u0570\7\u00e6\2\2"+
		"\u056f\u056e\3\2\2\2\u056f\u0570\3\2\2\2\u0570\u0571\3\2\2\2\u0571\u0573"+
		"\7\3\2\2\u0572\u0574\7\u00e6\2\2\u0573\u0572\3\2\2\2\u0573\u0574\3\2\2"+
		"\2\u0574\u0575\3\2\2\2\u0575\u0577\5\u0104\u0083\2\u0576\u056f\3\2\2\2"+
		"\u0577\u057a\3\2\2\2\u0578\u0576\3\2\2\2\u0578\u0579\3\2\2\2\u0579\u0089"+
		"\3\2\2\2\u057a\u0578\3\2\2\2\u057b\u057c\7\177\2\2\u057c\u057d\7\u00e6"+
		"\2\2\u057d\u057e\5\u00d2j\2\u057e\u057f\7\u00e6\2\2\u057f\u0580\7P\2\2"+
		"\u0580\u0581\7\u00e6\2\2\u0581\u0586\t\b\2\2\u0582\u0583\7\u00e6\2\2\u0583"+
		"\u0584\7\13\2\2\u0584\u0585\7\u00e6\2\2\u0585\u0587\t\t\2\2\u0586\u0582"+
		"\3\2\2\2\u0586\u0587\3\2\2\2\u0587\u058a\3\2\2\2\u0588\u0589\7\u00e6\2"+
		"\2\u0589\u058b\t\n\2\2\u058a\u0588\3\2\2\2\u058a\u058b\3\2\2\2\u058b\u058c"+
		"\3\2\2\2\u058c\u058d\7\u00e6\2\2\u058d\u058e\7\22\2\2\u058e\u058f\7\u00e6"+
		"\2\2\u058f\u059a\5\u00e2r\2\u0590\u0591\7\u00e6\2\2\u0591\u0593\7c\2\2"+
		"\u0592\u0594\7\u00e6\2\2\u0593\u0592\3\2\2\2\u0593\u0594\3\2\2\2\u0594"+
		"\u0595\3\2\2\2\u0595\u0597\7\u00c8\2\2\u0596\u0598\7\u00e6\2\2\u0597\u0596"+
		"\3\2\2\2\u0597\u0598\3\2\2\2\u0598\u0599\3\2\2\2\u0599\u059b\5\u00d2j"+
		"\2\u059a\u0590\3\2\2\2\u059a\u059b\3\2\2\2\u059b\u008b\3\2\2\2\u059c\u05a9"+
		"\5\u008eH\2\u059d\u059f\7\u00e6\2\2\u059e\u059d\3\2\2\2\u059e\u059f\3"+
		"\2\2\2\u059f\u05a0\3\2\2\2\u05a0\u05a2\t\13\2\2\u05a1\u05a3\7\u00e6\2"+
		"\2\u05a2\u05a1\3\2\2\2\u05a2\u05a3\3\2\2\2\u05a3\u05a5\3\2\2\2\u05a4\u05a6"+
		"\5\u008eH\2\u05a5\u05a4\3\2\2\2\u05a5\u05a6\3\2\2\2\u05a6\u05a8\3\2\2"+
		"\2\u05a7\u059e\3\2\2\2\u05a8\u05ab\3\2\2\2\u05a9\u05a7\3\2\2\2\u05a9\u05aa"+
		"\3\2\2\2\u05aa\u05be\3\2\2\2\u05ab\u05a9\3\2\2\2\u05ac\u05ae\5\u008eH"+
		"\2\u05ad\u05ac\3\2\2\2\u05ad\u05ae\3\2\2\2\u05ae\u05b9\3\2\2\2\u05af\u05b1"+
		"\7\u00e6\2\2\u05b0\u05af\3\2\2\2\u05b0\u05b1\3\2\2\2\u05b1\u05b2\3\2\2"+
		"\2\u05b2\u05b4\t\13\2\2\u05b3\u05b5\7\u00e6\2\2\u05b4\u05b3\3\2\2\2\u05b4"+
		"\u05b5\3\2\2\2\u05b5\u05b7\3\2\2\2\u05b6\u05b8\5\u008eH\2\u05b7\u05b6"+
		"\3\2\2\2\u05b7\u05b8\3\2\2\2\u05b8\u05ba\3\2\2\2\u05b9\u05b0\3\2\2\2\u05ba"+
		"\u05bb\3\2\2\2\u05bb\u05b9\3\2\2\2\u05bb\u05bc\3\2\2\2\u05bc\u05be\3\2"+
		"\2\2\u05bd\u059c\3\2\2\2\u05bd\u05ad\3\2\2\2\u05be\u008d\3\2\2\2\u05bf"+
		"\u05d1\5\u00d2j\2\u05c0\u05ce\t\f\2\2\u05c1\u05c3\7\u00e6\2\2\u05c2\u05c1"+
		"\3\2\2\2\u05c2\u05c3\3\2\2\2\u05c3\u05c4\3\2\2\2\u05c4\u05c6\7\u00cc\2"+
		"\2\u05c5\u05c7\7\u00e6\2\2\u05c6\u05c5\3\2\2\2\u05c6\u05c7\3\2\2\2\u05c7"+
		"\u05c8\3\2\2\2\u05c8\u05ca\5\u00f2z\2\u05c9\u05cb\7\u00e6\2\2\u05ca\u05c9"+
		"\3\2\2\2\u05ca\u05cb\3\2\2\2\u05cb\u05cc\3\2\2\2\u05cc\u05cd\7\u00d5\2"+
		"\2\u05cd\u05cf\3\2\2\2\u05ce\u05c2\3\2\2\2\u05ce\u05cf\3\2\2\2\u05cf\u05d1"+
		"\3\2\2\2\u05d0\u05bf\3\2\2\2\u05d0\u05c0\3\2\2\2\u05d1\u008f\3\2\2\2\u05d2"+
		"\u05d3\7\u0089\2\2\u05d3\u05d4\7\u00e6\2\2\u05d4\u05d6\5\u00e2r\2\u05d5"+
		"\u05d7\7\u00e6\2\2\u05d6\u05d5\3\2\2\2\u05d6\u05d7\3\2\2\2\u05d7\u05d8"+
		"\3\2\2\2\u05d8\u05dd\7\3\2\2\u05d9\u05db\7\u00e6\2\2\u05da\u05d9\3\2\2"+
		"\2\u05da\u05db\3\2\2\2\u05db\u05dc\3\2\2\2\u05dc\u05de\5\u008cG\2\u05dd"+
		"\u05da\3\2\2\2\u05dd\u05de\3\2\2\2\u05de\u0091\3\2\2\2\u05df\u05e0\5\u011e"+
		"\u0090\2\u05e0\u05e1\7\u00e6\2\2\u05e1\u05e3\3\2\2\2\u05e2\u05df\3\2\2"+
		"\2\u05e2\u05e3\3\2\2\2\u05e3\u05e6\3\2\2\2\u05e4\u05e5\7\u00a9\2\2\u05e5"+
		"\u05e7\7\u00e6\2\2\u05e6\u05e4\3\2\2\2\u05e6\u05e7\3\2\2\2\u05e7\u05e8"+
		"\3\2\2\2\u05e8\u05e9\7\u008b\2\2\u05e9\u05ea\7\u00e6\2\2\u05ea\u05ec\5"+
		"\u0104\u0083\2\u05eb\u05ed\5\u011c\u008f\2\u05ec\u05eb\3\2\2\2\u05ec\u05ed"+
		"\3\2\2\2\u05ed\u05f2\3\2\2\2\u05ee\u05f0\7\u00e6\2\2\u05ef\u05ee\3\2\2"+
		"\2\u05ef\u05f0\3\2\2\2\u05f0\u05f1\3\2\2\2\u05f1\u05f3\5\u00f6|\2\u05f2"+
		"\u05ef\3\2\2\2\u05f2\u05f3\3\2\2\2\u05f3\u05f6\3\2\2\2\u05f4\u05f5\7\u00e6"+
		"\2\2\u05f5\u05f7\5\u0106\u0084\2\u05f6\u05f4\3\2\2\2\u05f6\u05f7\3\2\2"+
		"\2\u05f7\u05f8\3\2\2\2\u05f8\u05fa\5\u0128\u0095\2\u05f9\u05fb\5\36\20"+
		"\2\u05fa\u05f9\3\2\2\2\u05fa\u05fb\3\2\2\2\u05fb\u05fc\3\2\2\2\u05fc\u05fd"+
		"\7<\2\2\u05fd\u0093\3\2\2\2\u05fe\u05ff\5\u011e\u0090\2\u05ff\u0600\7"+
		"\u00e6\2\2\u0600\u0602\3\2\2\2\u0601\u05fe\3\2\2\2\u0601\u0602\3\2\2\2"+
		"\u0602\u0605\3\2\2\2\u0603\u0604\7\u00a9\2\2\u0604\u0606\7\u00e6\2\2\u0605"+
		"\u0603\3\2\2\2\u0605\u0606\3\2\2\2\u0606\u0607\3\2\2\2\u0607\u0608\7\u008d"+
		"\2\2\u0608\u0609\7\u00e6\2\2\u0609\u060e\5\u0104\u0083\2\u060a\u060c\7"+
		"\u00e6\2\2\u060b\u060a\3\2\2\2\u060b\u060c\3\2\2\2\u060c\u060d\3\2\2\2"+
		"\u060d\u060f\5\u00f6|\2\u060e\u060b\3\2\2\2\u060e\u060f\3\2\2\2\u060f"+
		"\u0610\3\2\2\2\u0610\u0612\5\u0128\u0095\2\u0611\u0613\5\36\20\2\u0612"+
		"\u0611\3\2\2\2\u0612\u0613\3\2\2\2\u0613\u0614\3\2\2\2\u0614\u0615\7<"+
		"\2\2\u0615\u0095\3\2\2\2\u0616\u0617\5\u011e\u0090\2\u0617\u0618\7\u00e6"+
		"\2\2\u0618\u061a\3\2\2\2\u0619\u0616\3\2\2\2\u0619\u061a\3\2\2\2\u061a"+
		"\u061d\3\2\2\2\u061b\u061c\7\u00a9\2\2\u061c\u061e\7\u00e6\2\2\u061d\u061b"+
		"\3\2\2\2\u061d\u061e\3\2\2\2\u061e\u061f\3\2\2\2\u061f\u0620\7\u008c\2"+
		"\2\u0620\u0621\7\u00e6\2\2\u0621\u0626\5\u0104\u0083\2\u0622\u0624\7\u00e6"+
		"\2\2\u0623\u0622\3\2\2\2\u0623\u0624\3\2\2\2\u0624\u0625\3\2\2\2\u0625"+
		"\u0627\5\u00f6|\2\u0626\u0623\3\2\2\2\u0626\u0627\3\2\2\2\u0627\u0628"+
		"\3\2\2\2\u0628\u062a\5\u0128\u0095\2\u0629\u062b\5\36\20\2\u062a\u0629"+
		"\3\2\2\2\u062a\u062b\3\2\2\2\u062b\u062c\3\2\2\2\u062c\u062d\7<\2\2\u062d"+
		"\u0097\3\2\2\2\u062e\u062f\7\u0090\2\2\u062f\u0630\7\u00e6\2\2\u0630\u0632"+
		"\5\u00e2r\2\u0631\u0633\7\u00e6\2\2\u0632\u0631\3\2\2\2\u0632\u0633\3"+
		"\2\2\2\u0633\u0634\3\2\2\2\u0634\u0636\7\3\2\2\u0635\u0637\7\u00e6\2\2"+
		"\u0636\u0635\3\2\2\2\u0636\u0637\3\2\2\2\u0637\u0639\3\2\2\2\u0638\u063a"+
		"\5\u00d2j\2\u0639\u0638\3\2\2\2\u0639\u063a\3\2\2\2\u063a\u063c\3\2\2"+
		"\2\u063b\u063d\7\u00e6\2\2\u063c\u063b\3\2\2\2\u063c\u063d\3\2\2\2\u063d"+
		"\u063e\3\2\2\2\u063e\u0640\7\3\2\2\u063f\u0641\7\u00e6\2\2\u0640\u063f"+
		"\3\2\2\2\u0640\u0641\3\2\2\2\u0641\u0642\3\2\2\2\u0642\u0643\5\u00d2j"+
		"\2\u0643\u0099\3\2\2\2\u0644\u0645\7\u0093\2\2\u0645\u0646\7\u00e6\2\2"+
		"\u0646\u0655\5\u0104\u0083\2\u0647\u0649\7\u00e6\2\2\u0648\u0647\3\2\2"+
		"\2\u0648\u0649\3\2\2\2\u0649\u064a\3\2\2\2\u064a\u064c\7\u00cc\2\2\u064b"+
		"\u064d\7\u00e6\2\2\u064c\u064b\3\2\2\2\u064c\u064d\3\2\2\2\u064d\u0652"+
		"\3\2\2\2\u064e\u0650\5\u00f2z\2\u064f\u0651\7\u00e6\2\2\u0650\u064f\3"+
		"\2\2\2\u0650\u0651\3\2\2\2\u0651\u0653\3\2\2\2\u0652\u064e\3\2\2\2\u0652"+
		"\u0653\3\2\2\2\u0653\u0654\3\2\2\2\u0654\u0656\7\u00d5\2\2\u0655\u0648"+
		"\3\2\2\2\u0655\u0656\3\2\2\2\u0656\u009b\3\2\2\2\u0657\u065a\7\u0092\2"+
		"\2\u0658\u0659\7\u00e6\2\2\u0659\u065b\5\u00d2j\2\u065a\u0658\3\2\2\2"+
		"\u065a\u065b\3\2\2\2\u065b\u009d\3\2\2\2\u065c\u065d\7\u0096\2\2\u065d"+
		"\u0660\7\u00e6\2\2\u065e\u065f\7\u0088\2\2\u065f\u0661\7\u00e6\2\2\u0660"+
		"\u065e\3\2\2\2\u0660\u0661\3\2\2\2\u0661\u0662\3\2\2\2\u0662\u066d\5\u00a0"+
		"Q\2\u0663\u0665\7\u00e6\2\2\u0664\u0663\3\2\2\2\u0664\u0665\3\2\2\2\u0665"+
		"\u0666\3\2\2\2\u0666\u0668\7\3\2\2\u0667\u0669\7\u00e6\2\2\u0668\u0667"+
		"\3\2\2\2\u0668\u0669\3\2\2\2\u0669\u066a\3\2\2\2\u066a\u066c\5\u00a0Q"+
		"\2\u066b\u0664\3\2\2\2\u066c\u066f\3\2\2\2\u066d\u066b\3\2\2\2\u066d\u066e"+
		"\3\2\2\2\u066e\u009f\3\2\2\2\u066f\u066d\3\2\2\2\u0670\u0672\5\u0104\u0083"+
		"\2\u0671\u0673\7\u00e6\2\2\u0672\u0671\3\2\2\2\u0672\u0673\3\2\2\2\u0673"+
		"\u0674\3\2\2\2\u0674\u0676\7\u00cc\2\2\u0675\u0677\7\u00e6\2\2\u0676\u0675"+
		"\3\2\2\2\u0676\u0677\3\2\2\2\u0677\u0678\3\2\2\2\u0678\u067a\5\u00fc\177"+
		"\2\u0679\u067b\7\u00e6\2\2\u067a\u0679\3\2\2\2\u067a\u067b\3\2\2\2\u067b"+
		"\u067c\3\2\2\2\u067c\u067f\7\u00d5\2\2\u067d\u067e\7\u00e6\2\2\u067e\u0680"+
		"\5\u0106\u0084\2\u067f\u067d\3\2\2\2\u067f\u0680\3\2\2\2\u0680\u00a1\3"+
		"\2\2\2\u0681\u0682\7\u0098\2\2\u0682\u00a3\3\2\2\2\u0683\u0689\7\u0099"+
		"\2\2\u0684\u0687\7\u00e6\2\2\u0685\u0688\7v\2\2\u0686\u0688\5\u0104\u0083"+
		"\2\u0687\u0685\3\2\2\2\u0687\u0686\3\2\2\2\u0688\u068a\3\2\2\2\u0689\u0684"+
		"\3\2\2\2\u0689\u068a\3\2\2\2\u068a\u00a5\3\2\2\2\u068b\u068c\7\u009a\2"+
		"\2\u068c\u00a7\3\2\2\2\u068d\u068e\7\u009b\2\2\u068e\u068f\7\u00e6\2\2"+
		"\u068f\u0690\5\u00d2j\2\u0690\u00a9\3\2\2\2\u0691\u0692\7\u009c\2\2\u0692"+
		"\u0693\7\u00e6\2\2\u0693\u0695\5\u00e8u\2\u0694\u0696\7\u00e6\2\2\u0695"+
		"\u0694\3\2\2\2\u0695\u0696\3\2\2\2\u0696\u0697\3\2\2\2\u0697\u0699\7\u00c8"+
		"\2\2\u0698\u069a\7\u00e6\2\2\u0699\u0698\3\2\2\2\u0699\u069a\3\2\2\2\u069a"+
		"\u069b\3\2\2\2\u069b\u069c\5\u00d2j\2\u069c\u00ab\3\2\2\2\u069d\u069e"+
		"\7\u009d\2\2\u069e\u069f\7\u00e6\2\2\u069f\u06a1\5\u00d2j\2\u06a0\u06a2"+
		"\7\u00e6\2\2\u06a1\u06a0\3\2\2\2\u06a1\u06a2\3\2\2\2\u06a2\u06a3\3\2\2"+
		"\2\u06a3\u06a5\7\3\2\2\u06a4\u06a6\7\u00e6\2\2\u06a5\u06a4\3\2\2\2\u06a5"+
		"\u06a6\3\2\2\2\u06a6\u06a7\3\2\2\2\u06a7\u06a8\5\u00d2j\2\u06a8\u00ad"+
		"\3\2\2\2\u06a9\u06aa\7\u009e\2\2\u06aa\u06ab\7\u00e6\2\2\u06ab\u06ad\5"+
		"\u00d2j\2\u06ac\u06ae\7\u00e6\2\2\u06ad\u06ac\3\2\2\2\u06ad\u06ae\3\2"+
		"\2\2\u06ae\u06af\3\2\2\2\u06af\u06b1\7\3\2\2\u06b0\u06b2\7\u00e6\2\2\u06b1"+
		"\u06b0\3\2\2\2\u06b1\u06b2\3\2\2\2\u06b2\u06b3\3\2\2\2\u06b3\u06b5\5\u00d2"+
		"j\2\u06b4\u06b6\7\u00e6\2\2\u06b5\u06b4\3\2\2\2\u06b5\u06b6\3\2\2\2\u06b6"+
		"\u06b7\3\2\2\2\u06b7\u06b9\7\3\2\2\u06b8\u06ba\7\u00e6\2\2\u06b9\u06b8"+
		"\3\2\2\2\u06b9\u06ba\3\2\2\2\u06ba\u06bb\3\2\2\2\u06bb\u06bd\5\u00d2j"+
		"\2\u06bc\u06be\7\u00e6\2\2\u06bd\u06bc\3\2\2\2\u06bd\u06be\3\2\2\2\u06be"+
		"\u06bf\3\2\2\2\u06bf\u06c1\7\3\2\2\u06c0\u06c2\7\u00e6\2\2\u06c1\u06c0"+
		"\3\2\2\2\u06c1\u06c2\3\2\2\2\u06c2\u06c3\3\2\2\2\u06c3\u06c4\5\u00d2j"+
		"\2\u06c4\u00af\3\2\2\2\u06c5\u06c6\7\u009f\2\2\u06c6\u06c7\7\u00e6\2\2"+
		"\u06c7\u06c9\5\u00e2r\2\u06c8\u06ca\7\u00e6\2\2\u06c9\u06c8\3\2\2\2\u06c9"+
		"\u06ca\3\2\2\2\u06ca\u06cb\3\2\2\2\u06cb\u06cd\7\3\2\2\u06cc\u06ce\7\u00e6"+
		"\2\2\u06cd\u06cc\3\2\2\2\u06cd\u06ce\3\2\2\2\u06ce\u06cf\3\2\2\2\u06cf"+
		"\u06d0\5\u00d2j\2\u06d0\u00b1\3\2\2\2\u06d1\u06d2\7\u00a0\2\2\u06d2\u06d3"+
		"\7\u00e6\2\2\u06d3\u06d4\7\33\2\2\u06d4\u06d5\7\u00e6\2\2\u06d5\u06d6"+
		"\5\u00d2j\2\u06d6\u06da\5\u0128\u0095\2\u06d7\u06d9\5\u00b6\\\2\u06d8"+
		"\u06d7\3\2\2\2\u06d9\u06dc\3\2\2\2\u06da\u06d8\3\2\2\2\u06da\u06db\3\2"+
		"\2\2\u06db\u06dd\3\2\2\2\u06dc\u06da\3\2\2\2\u06dd\u06de\7=\2\2\u06de"+
		"\u00b3\3\2\2\2\u06df\u06e1\7\\\2\2\u06e0\u06e2\7\u00e6\2\2\u06e1\u06e0"+
		"\3\2\2\2\u06e1\u06e2\3\2\2\2\u06e2\u06e3\3\2\2\2\u06e3\u06e5\5\u010c\u0087"+
		"\2\u06e4\u06e6\7\u00e6\2\2\u06e5\u06e4\3\2\2\2\u06e5\u06e6\3\2\2\2\u06e6"+
		"\u06e7\3\2\2\2\u06e7\u06e8\5\u00d2j\2\u06e8\u06f1\3\2\2\2\u06e9\u06ea"+
		"\5\u00d2j\2\u06ea\u06eb\7\u00e6\2\2\u06eb\u06ec\7\u00b2\2\2\u06ec\u06ed"+
		"\7\u00e6\2\2\u06ed\u06ee\5\u00d2j\2\u06ee\u06f1\3\2\2\2\u06ef\u06f1\5"+
		"\u00d2j\2\u06f0\u06df\3\2\2\2\u06f0\u06e9\3\2\2\2\u06f0\u06ef\3\2\2\2"+
		"\u06f1\u00b5\3\2\2\2\u06f2\u06f3\7\33\2\2\u06f3\u06f4\7\u00e6\2\2\u06f4"+
		"\u06f5\5\u00b8]\2\u06f5\u06f7\5\u0128\u0095\2\u06f6\u06f8\5\36\20\2\u06f7"+
		"\u06f6\3\2\2\2\u06f7\u06f8\3\2\2\2\u06f8\u00b7\3\2\2\2\u06f9\u0709\7\66"+
		"\2\2\u06fa\u0705\5\u00b4[\2\u06fb\u06fd\7\u00e6\2\2\u06fc\u06fb\3\2\2"+
		"\2\u06fc\u06fd\3\2\2\2\u06fd\u06fe\3\2\2\2\u06fe\u0700\7\3\2\2\u06ff\u0701"+
		"\7\u00e6\2\2\u0700\u06ff\3\2\2\2\u0700\u0701\3\2\2\2\u0701\u0702\3\2\2"+
		"\2\u0702\u0704\5\u00b4[\2\u0703\u06fc\3\2\2\2\u0704\u0707\3\2\2\2\u0705"+
		"\u0703\3\2\2\2\u0705\u0706\3\2\2\2\u0706\u0709\3\2\2\2\u0707\u0705\3\2"+
		"\2\2\u0708\u06f9\3\2\2\2\u0708\u06fa\3\2\2\2\u0709\u00b9\3\2\2\2\u070a"+
		"\u070b\7\u00a1\2\2\u070b\u070c\7\u00e6\2\2\u070c\u0715\5\u00d2j\2\u070d"+
		"\u070f\7\u00e6\2\2\u070e\u070d\3\2\2\2\u070e\u070f\3\2\2\2\u070f\u0710"+
		"\3\2\2\2\u0710\u0712\7\3\2\2\u0711\u0713\7\u00e6\2\2\u0712\u0711\3\2\2"+
		"\2\u0712\u0713\3\2\2\2\u0713\u0714\3\2\2\2\u0714\u0716\5\u00d2j\2\u0715"+
		"\u070e\3\2\2\2\u0715\u0716\3\2\2\2\u0716\u00bb\3\2\2\2\u0717\u0718\7\u00a3"+
		"\2\2\u0718\u0719\7\u00e6\2\2\u0719\u071b\5\u00d2j\2\u071a\u071c\7\u00e6"+
		"\2\2\u071b\u071a\3\2\2\2\u071b\u071c\3\2\2\2\u071c\u071d\3\2\2\2\u071d"+
		"\u071f\7\3\2\2\u071e\u0720\7\u00e6\2\2\u071f\u071e\3\2\2\2\u071f\u0720"+
		"\3\2\2\2\u0720\u0721\3\2\2\2\u0721\u0722\5\u00d2j\2\u0722\u00bd\3\2\2"+
		"\2\u0723\u0724\7\u00a2\2\2\u0724\u0725\7\u00e6\2\2\u0725\u0727\5\u00e8"+
		"u\2\u0726\u0728\7\u00e6\2\2\u0727\u0726\3\2\2\2\u0727\u0728\3\2\2\2\u0728"+
		"\u0729\3\2\2\2\u0729\u072b\7\u00c8\2\2\u072a\u072c\7\u00e6\2\2\u072b\u072a"+
		"\3\2\2\2\u072b\u072c\3\2\2\2\u072c\u072d\3\2\2\2\u072d\u072e\5\u00d2j"+
		"\2\u072e\u00bf\3\2\2\2\u072f\u0730\7\u00ab\2\2\u0730\u00c1\3\2\2\2\u0731"+
		"\u0732\5\u011e\u0090\2\u0732\u0733\7\u00e6\2\2\u0733\u0735\3\2\2\2\u0734"+
		"\u0731\3\2\2\2\u0734\u0735\3\2\2\2\u0735\u0738\3\2\2\2\u0736\u0737\7\u00a9"+
		"\2\2\u0737\u0739\7\u00e6\2\2\u0738\u0736\3\2\2\2\u0738\u0739\3\2\2\2\u0739"+
		"\u073a\3\2\2\2\u073a\u073c\7\u00ad\2\2\u073b\u073d\7\u00e6\2\2\u073c\u073b"+
		"\3\2\2\2\u073c\u073d\3\2\2\2\u073d\u073e\3\2\2\2\u073e\u0743\5\u0104\u0083"+
		"\2\u073f\u0741\7\u00e6\2\2\u0740\u073f\3\2\2\2\u0740\u0741\3\2\2\2\u0741"+
		"\u0742\3\2\2\2\u0742\u0744\5\u00f6|\2\u0743\u0740\3\2\2\2\u0743\u0744"+
		"\3\2\2\2\u0744\u0745\3\2\2\2\u0745\u0747\5\u0128\u0095\2\u0746\u0748\5"+
		"\36\20\2\u0747\u0746\3\2\2\2\u0747\u0748\3\2\2\2\u0748\u0749\3\2\2\2\u0749"+
		"\u074a\7>\2\2\u074a\u00c3\3\2\2\2\u074b\u074d\7\u00b1\2\2\u074c\u074e"+
		"\7\u00e6\2\2\u074d\u074c\3\2\2\2\u074d\u074e\3\2\2\2\u074e\u074f\3\2\2"+
		"\2\u074f\u0751\7\u00c8\2\2\u0750\u0752\7\u00e6\2\2\u0751\u0750\3\2\2\2"+
		"\u0751\u0752\3\2\2\2\u0752\u0753\3\2\2\2\u0753\u0754\5\u00d2j\2\u0754"+
		"\u00c5\3\2\2\2\u0755\u0756\5\u011e\u0090\2\u0756\u0757\7\u00e6\2\2\u0757"+
		"\u0759\3\2\2\2\u0758\u0755\3\2\2\2\u0758\u0759\3\2\2\2\u0759\u075a\3\2"+
		"\2\2\u075a\u075b\7\u00b4\2\2\u075b\u075c\7\u00e6\2\2\u075c\u075d\5\u0104"+
		"\u0083\2\u075d\u0761\5\u0128\u0095\2\u075e\u0760\5\u00c8e\2\u075f\u075e"+
		"\3\2\2\2\u0760\u0763\3\2\2\2\u0761\u075f\3\2\2\2\u0761\u0762\3\2\2\2\u0762"+
		"\u0764\3\2\2\2\u0763\u0761\3\2\2\2\u0764\u0765\7?\2\2\u0765\u00c7\3\2"+
		"\2\2\u0766\u0775\5\u0104\u0083\2\u0767\u0769\7\u00e6\2\2\u0768\u0767\3"+
		"\2\2\2\u0768\u0769\3\2\2\2\u0769\u076a\3\2\2\2\u076a\u076f\7\u00cc\2\2"+
		"\u076b\u076d\7\u00e6\2\2\u076c\u076b\3\2\2\2\u076c\u076d\3\2\2\2\u076d"+
		"\u076e\3\2\2\2\u076e\u0770\5\u0100\u0081\2\u076f\u076c\3\2\2\2\u076f\u0770"+
		"\3\2\2\2\u0770\u0772\3\2\2\2\u0771\u0773\7\u00e6\2\2\u0772\u0771\3\2\2"+
		"\2\u0772\u0773\3\2\2\2\u0773\u0774\3\2\2\2\u0774\u0776\7\u00d5\2\2\u0775"+
		"\u0768\3\2\2\2\u0775\u0776\3\2\2\2\u0776\u0777\3\2\2\2\u0777\u0778\7\u00e6"+
		"\2\2\u0778\u0779\5\u0106\u0084\2\u0779\u077a\5\u0128\u0095\2\u077a\u00c9"+
		"\3\2\2\2\u077b\u077c\7\u00b5\2\2\u077c\u077d\7\u00e6\2\2\u077d\u077e\5"+
		"\u00d2j\2\u077e\u077f\7\u00e6\2\2\u077f\u0780\7\\\2\2\u0780\u0781\7\u00e6"+
		"\2\2\u0781\u0782\5\u011a\u008e\2\u0782\u00cb\3\2\2\2\u0783\u0784\7\u00b6"+
		"\2\2\u0784\u0785\7\u00e6\2\2\u0785\u0786\5\u00d2j\2\u0786\u00cd\3\2\2"+
		"\2\u0787\u0788\7\u00b7\2\2\u0788\u0789\7\u00e6\2\2\u0789\u0798\5\u00e2"+
		"r\2\u078a\u078c\7\u00e6\2\2\u078b\u078a\3\2\2\2\u078b\u078c\3\2\2\2\u078c"+
		"\u078d\3\2\2\2\u078d\u078f\7\3\2\2\u078e\u0790\7\u00e6\2\2\u078f\u078e"+
		"\3\2\2\2\u078f\u0790\3\2\2\2\u0790\u0791\3\2\2\2\u0791\u0796\5\u00d2j"+
		"\2\u0792\u0793\7\u00e6\2\2\u0793\u0794\7\u00b2\2\2\u0794\u0795\7\u00e6"+
		"\2\2\u0795\u0797\5\u00d2j\2\u0796\u0792\3\2\2\2\u0796\u0797\3\2\2\2\u0797"+
		"\u0799\3\2\2\2\u0798\u078b\3\2\2\2\u0798\u0799\3\2\2\2\u0799\u00cf\3\2"+
		"\2\2\u079a\u079b\bi\1\2\u079b\u07b4\5\u0118\u008d\2\u079c\u07a1\5\u0104"+
		"\u0083\2\u079d\u079e\7\5\2\2\u079e\u07a0\5\u0104\u0083\2\u079f\u079d\3"+
		"\2\2\2\u07a0\u07a3\3\2\2\2\u07a1\u079f\3\2\2\2\u07a1\u07a2\3\2\2\2\u07a2"+
		"\u07b4\3\2\2\2\u07a3\u07a1\3\2\2\2\u07a4\u07a6\7\u00ce\2\2\u07a5\u07a7"+
		"\7\u00e6\2\2\u07a6\u07a5\3\2\2\2\u07a6\u07a7\3\2\2\2\u07a7\u07a8\3\2\2"+
		"\2\u07a8\u07b4\5\u00d0i\27\u07a9\u07ab\7\u00d2\2\2\u07aa\u07ac\7\u00e6"+
		"\2\2\u07ab\u07aa\3\2\2\2\u07ab\u07ac\3\2\2\2\u07ac\u07ad\3\2\2\2\u07ad"+
		"\u07b4\5\u00d0i\26\u07ae\u07b0\7x\2\2\u07af\u07b1\7\u00e6\2\2\u07b0\u07af"+
		"\3\2\2\2\u07b0\u07b1\3\2\2\2\u07b1\u07b2\3\2\2\2\u07b2\u07b4\5\u00d0i"+
		"\b\u07b3\u079a\3\2\2\2\u07b3\u079c\3\2\2\2\u07b3\u07a4\3\2\2\2\u07b3\u07a9"+
		"\3\2\2\2\u07b3\u07ae\3\2\2\2\u07b4\u0862\3\2\2\2\u07b5\u07b7\f\30\2\2"+
		"\u07b6\u07b8\7\u00e6\2\2\u07b7\u07b6\3\2\2\2\u07b7\u07b8\3\2\2\2\u07b8"+
		"\u07b9\3\2\2\2\u07b9\u07bb\7\u00d4\2\2\u07ba\u07bc\7\u00e6\2\2\u07bb\u07ba"+
		"\3\2\2\2\u07bb\u07bc\3\2\2\2\u07bc\u07bd\3\2\2\2\u07bd\u0861\5\u00d0i"+
		"\31\u07be\u07c0\f\25\2\2\u07bf\u07c1\7\u00e6\2\2\u07c0\u07bf\3\2\2\2\u07c0"+
		"\u07c1\3\2\2\2\u07c1\u07c2\3\2\2\2\u07c2\u07c4\7\u00d0\2\2\u07c3\u07c5"+
		"\7\u00e6\2\2\u07c4\u07c3\3\2\2\2\u07c4\u07c5\3\2\2\2\u07c5\u07c6\3\2\2"+
		"\2\u07c6\u0861\5\u00d0i\26\u07c7\u07c9\f\24\2\2\u07c8\u07ca\7\u00e6\2"+
		"\2\u07c9\u07c8\3\2\2\2\u07c9\u07ca\3\2\2\2\u07ca\u07cb\3\2\2\2\u07cb\u07cd"+
		"\7\u00c7\2\2\u07cc\u07ce\7\u00e6\2\2\u07cd\u07cc\3\2\2\2\u07cd\u07ce\3"+
		"\2\2\2\u07ce\u07cf\3\2\2\2\u07cf\u0861\5\u00d0i\25\u07d0\u07d2\f\23\2"+
		"\2\u07d1\u07d3\7\u00e6\2\2\u07d2\u07d1\3\2\2\2\u07d2\u07d3\3\2\2\2\u07d3"+
		"\u07d4\3\2\2\2\u07d4\u07d6\7t\2\2\u07d5\u07d7\7\u00e6\2\2\u07d6\u07d5"+
		"\3\2\2\2\u07d6\u07d7\3\2\2\2\u07d7\u07d8\3\2\2\2\u07d8\u0861\5\u00d0i"+
		"\24\u07d9\u07db\f\22\2\2\u07da\u07dc\7\u00e6\2\2\u07db\u07da\3\2\2\2\u07db"+
		"\u07dc\3\2\2\2\u07dc\u07dd\3\2\2\2\u07dd\u07df\7\u00d2\2\2\u07de\u07e0"+
		"\7\u00e6\2\2\u07df\u07de\3\2\2\2\u07df\u07e0\3\2\2\2\u07e0\u07e1\3\2\2"+
		"\2\u07e1\u0861\5\u00d0i\23\u07e2\u07e4\f\21\2\2\u07e3\u07e5\7\u00e6\2"+
		"\2\u07e4\u07e3\3\2\2\2\u07e4\u07e5\3\2\2\2\u07e5\u07e6\3\2\2\2\u07e6\u07e8"+
		"\7\u00ce\2\2\u07e7\u07e9\7\u00e6\2\2\u07e8\u07e7\3\2\2\2\u07e8\u07e9\3"+
		"\2\2\2\u07e9\u07ea\3\2\2\2\u07ea\u0861\5\u00d0i\22\u07eb\u07ed\f\20\2"+
		"\2\u07ec\u07ee\7\u00e6\2\2\u07ed\u07ec\3\2\2\2\u07ed\u07ee\3\2\2\2\u07ee"+
		"\u07ef\3\2\2\2\u07ef\u07f1\7\u00c5\2\2\u07f0\u07f2\7\u00e6\2\2\u07f1\u07f0"+
		"\3\2\2\2\u07f1\u07f2\3\2\2\2\u07f2\u07f3\3\2\2\2\u07f3\u0861\5\u00d0i"+
		"\21\u07f4\u07f6\f\17\2\2\u07f5\u07f7\7\u00e6\2\2\u07f6\u07f5\3\2\2\2\u07f6"+
		"\u07f7\3\2\2\2\u07f7\u07f8\3\2\2\2\u07f8\u07fa\7f\2\2\u07f9\u07fb\7\u00e6"+
		"\2\2\u07fa\u07f9\3\2\2\2\u07fa\u07fb\3\2\2\2\u07fb\u07fc\3\2\2\2\u07fc"+
		"\u0861\5\u00d0i\20\u07fd\u07ff\f\16\2\2\u07fe\u0800\7\u00e6\2\2\u07ff"+
		"\u07fe\3\2\2\2\u07ff\u0800\3\2\2\2\u0800\u0801\3\2\2\2\u0801\u0803\7\u00c9"+
		"\2\2\u0802\u0804\7\u00e6\2\2\u0803\u0802\3\2\2\2\u0803\u0804\3\2\2\2\u0804"+
		"\u0805\3\2\2\2\u0805\u0861\5\u00d0i\17\u0806\u0808\f\r\2\2\u0807\u0809"+
		"\7\u00e6\2\2\u0808\u0807\3\2\2\2\u0808\u0809\3\2\2\2\u0809\u080a\3\2\2"+
		"\2\u080a\u080c\7\u00cb\2\2\u080b\u080d\7\u00e6\2\2\u080c\u080b\3\2\2\2"+
		"\u080c\u080d\3\2\2\2\u080d\u080e\3\2\2\2\u080e\u0861\5\u00d0i\16\u080f"+
		"\u0811\f\f\2\2\u0810\u0812\7\u00e6\2\2\u0811\u0810\3\2\2\2\u0811\u0812"+
		"\3\2\2\2\u0812\u0813\3\2\2\2\u0813\u0815\7\u00ca\2\2\u0814\u0816\7\u00e6"+
		"\2\2\u0815\u0814\3\2\2\2\u0815\u0816\3\2\2\2\u0816\u0817\3\2\2\2\u0817"+
		"\u0861\5\u00d0i\r\u0818\u081a\f\13\2\2\u0819\u081b\7\u00e6\2\2\u081a\u0819"+
		"\3\2\2\2\u081a\u081b\3\2\2\2\u081b\u081c\3\2\2\2\u081c\u081e\7\u00cd\2"+
		"\2\u081d\u081f\7\u00e6\2\2\u081e\u081d\3\2\2\2\u081e\u081f\3\2\2\2\u081f"+
		"\u0820\3\2\2\2\u0820\u0861\5\u00d0i\f\u0821\u0823\f\n\2\2\u0822\u0824"+
		"\7\u00e6\2\2\u0823\u0822\3\2\2\2\u0823\u0824\3\2\2\2\u0824\u0825\3\2\2"+
		"\2\u0825\u0827\7\u00d1\2\2\u0826\u0828\7\u00e6\2\2\u0827\u0826\3\2\2\2"+
		"\u0827\u0828\3\2\2\2\u0828\u0829\3\2\2\2\u0829\u0861\5\u00d0i\13\u082a"+
		"\u082c\f\t\2\2\u082b\u082d\7\u00e6\2\2\u082c\u082b\3\2\2\2\u082c\u082d"+
		"\3\2\2\2\u082d\u082e\3\2\2\2\u082e\u0830\7\u00c8\2\2\u082f\u0831\7\u00e6"+
		"\2\2\u0830\u082f\3\2\2\2\u0830\u0831\3\2\2\2\u0831\u0832\3\2\2\2\u0832"+
		"\u0861\5\u00d0i\n\u0833\u0835\f\7\2\2\u0834\u0836\7\u00e6\2\2\u0835\u0834"+
		"\3\2\2\2\u0835\u0836\3\2\2\2\u0836\u0837\3\2\2\2\u0837\u0839\7\16\2\2"+
		"\u0838\u083a\7\u00e6\2\2\u0839\u0838\3\2\2\2\u0839\u083a\3\2\2\2\u083a"+
		"\u083b\3\2\2\2\u083b\u0861\5\u00d0i\b\u083c\u083e\f\6\2\2\u083d\u083f"+
		"\7\u00e6\2\2\u083e\u083d\3\2\2\2\u083e\u083f\3\2\2\2\u083f\u0840\3\2\2"+
		"\2\u0840\u0842\7\u0085\2\2\u0841\u0843\7\u00e6\2\2\u0842\u0841\3\2\2\2"+
		"\u0842\u0843\3\2\2\2\u0843\u0844\3\2\2\2\u0844\u0861\5\u00d0i\7\u0845"+
		"\u0847\f\5\2\2\u0846\u0848\7\u00e6\2\2\u0847\u0846\3\2\2\2\u0847\u0848"+
		"\3\2\2\2\u0848\u0849\3\2\2\2\u0849\u084b\7\u00c4\2\2\u084a\u084c\7\u00e6"+
		"\2\2\u084b\u084a\3\2\2\2\u084b\u084c\3\2\2\2\u084c\u084d\3\2\2\2\u084d"+
		"\u0861\5\u00d0i\6\u084e\u0850\f\4\2\2\u084f\u0851\7\u00e6\2\2\u0850\u084f"+
		"\3\2\2\2\u0850\u0851\3\2\2\2\u0851\u0852\3\2\2\2\u0852\u0854\7C\2\2\u0853"+
		"\u0855\7\u00e6\2\2\u0854\u0853\3\2\2\2\u0854\u0855\3\2\2\2\u0855\u0856"+
		"\3\2\2\2\u0856\u0861\5\u00d0i\5\u0857\u0859\f\3\2\2\u0858\u085a\7\u00e6"+
		"\2\2\u0859\u0858\3\2\2\2\u0859\u085a\3\2\2\2\u085a\u085b\3\2\2\2\u085b"+
		"\u085d\7X\2\2\u085c\u085e\7\u00e6\2\2\u085d\u085c\3\2\2\2\u085d\u085e"+
		"\3\2\2\2\u085e\u085f\3\2\2\2\u085f\u0861\5\u00d0i\4\u0860\u07b5\3\2\2"+
		"\2\u0860\u07be\3\2\2\2\u0860\u07c7\3\2\2\2\u0860\u07d0\3\2\2\2\u0860\u07d9"+
		"\3\2\2\2\u0860\u07e2\3\2\2\2\u0860\u07eb\3\2\2\2\u0860\u07f4\3\2\2\2\u0860"+
		"\u07fd\3\2\2\2\u0860\u0806\3\2\2\2\u0860\u080f\3\2\2\2\u0860\u0818\3\2"+
		"\2\2\u0860\u0821\3\2\2\2\u0860\u082a\3\2\2\2\u0860\u0833\3\2\2\2\u0860"+
		"\u083c\3\2\2\2\u0860\u0845\3\2\2\2\u0860\u084e\3\2\2\2\u0860\u0857\3\2"+
		"\2\2\u0861\u0864\3\2\2\2\u0862\u0860\3\2\2\2\u0862\u0863\3\2\2\2\u0863"+
		"\u00d1\3\2\2\2\u0864\u0862\3\2\2\2\u0865\u0866\bj\1\2\u0866\u0897\5\u0118"+
		"\u008d\2\u0867\u0897\5\u00e8u\2\u0868\u086a\7\u00cc\2\2\u0869\u086b\7"+
		"\u00e6\2\2\u086a\u0869\3\2\2\2\u086a\u086b\3\2\2\2\u086b\u086c\3\2\2\2"+
		"\u086c\u0877\5\u00d2j\2\u086d\u086f\7\u00e6\2\2\u086e\u086d\3\2\2\2\u086e"+
		"\u086f\3\2\2\2\u086f\u0870\3\2\2\2\u0870\u0872\7\3\2\2\u0871\u0873\7\u00e6"+
		"\2\2\u0872\u0871\3\2\2\2\u0872\u0873\3\2\2\2\u0873\u0874\3\2\2\2\u0874"+
		"\u0876\5\u00d2j\2\u0875\u086e\3\2\2\2\u0876\u0879\3\2\2\2\u0877\u0875"+
		"\3\2\2\2\u0877\u0878\3\2\2\2\u0878\u087a\3\2\2\2\u0879\u0877\3\2\2\2\u087a"+
		"\u087b\7\u00d5\2\2\u087b\u0897\3\2\2\2\u087c\u087e\7w\2\2\u087d\u087f"+
		"\7\u00e6\2\2\u087e\u087d\3\2\2\2\u087e\u087f\3\2\2\2\u087f\u0880\3\2\2"+
		"\2\u0880\u0897\5\u0110\u0089\2\u0881\u0897\5\u00caf\2\u0882\u0884\7\f"+
		"\2\2\u0883\u0885\7\u00e6\2\2\u0884\u0883\3\2\2\2\u0884\u0885\3\2\2\2\u0885"+
		"\u0886\3\2\2\2\u0886\u0897\5\u00d2j\32\u0887\u0889\7\u00ce\2\2\u0888\u088a"+
		"\7\u00e6\2\2\u0889\u0888\3\2\2\2\u0889\u088a\3\2\2\2\u088a\u088b\3\2\2"+
		"\2\u088b\u0897\5\u00d2j\30\u088c\u088e\7\u00d2\2\2\u088d\u088f\7\u00e6"+
		"\2\2\u088e\u088d\3\2\2\2\u088e\u088f\3\2\2\2\u088f\u0890\3\2\2\2\u0890"+
		"\u0897\5\u00d2j\27\u0891\u0893\7x\2\2\u0892\u0894\7\u00e6\2\2\u0893\u0892"+
		"\3\2\2\2\u0893\u0894\3\2\2\2\u0894\u0895\3\2\2\2\u0895\u0897\5\u00d2j"+
		"\b\u0896\u0865\3\2\2\2\u0896\u0867\3\2\2\2\u0896\u0868\3\2\2\2\u0896\u087c"+
		"\3\2\2\2\u0896\u0881\3\2\2\2\u0896\u0882\3\2\2\2\u0896\u0887\3\2\2\2\u0896"+
		"\u088c\3\2\2\2\u0896\u0891\3\2\2\2\u0897\u094e\3\2\2\2\u0898\u089a\f\31"+
		"\2\2\u0899\u089b\7\u00e6\2\2\u089a\u0899\3\2\2\2\u089a\u089b\3\2\2\2\u089b"+
		"\u089c\3\2\2\2\u089c\u089e\7\u00d4\2\2\u089d\u089f\7\u00e6\2\2\u089e\u089d"+
		"\3\2\2\2\u089e\u089f\3\2\2\2\u089f\u08a0\3\2\2\2\u08a0\u094d\5\u00d2j"+
		"\32";
	private static final String _serializedATNSegment1 =
		"\u08a1\u08a3\f\26\2\2\u08a2\u08a4\7\u00e6\2\2\u08a3\u08a2\3\2\2\2\u08a3"+
		"\u08a4\3\2\2\2\u08a4\u08a5\3\2\2\2\u08a5\u08a7\7\u00d0\2\2\u08a6\u08a8"+
		"\7\u00e6\2\2\u08a7\u08a6\3\2\2\2\u08a7\u08a8\3\2\2\2\u08a8\u08a9\3\2\2"+
		"\2\u08a9\u094d\5\u00d2j\27\u08aa\u08ac\f\25\2\2\u08ab\u08ad\7\u00e6\2"+
		"\2\u08ac\u08ab\3\2\2\2\u08ac\u08ad\3\2\2\2\u08ad\u08ae\3\2\2\2\u08ae\u08b0"+
		"\7\u00c7\2\2\u08af\u08b1\7\u00e6\2\2\u08b0\u08af\3\2\2\2\u08b0\u08b1\3"+
		"\2\2\2\u08b1\u08b2\3\2\2\2\u08b2\u094d\5\u00d2j\26\u08b3\u08b5\f\24\2"+
		"\2\u08b4\u08b6\7\u00e6\2\2\u08b5\u08b4\3\2\2\2\u08b5\u08b6\3\2\2\2\u08b6"+
		"\u08b7\3\2\2\2\u08b7\u08b9\7t\2\2\u08b8\u08ba\7\u00e6\2\2\u08b9\u08b8"+
		"\3\2\2\2\u08b9\u08ba\3\2\2\2\u08ba\u08bb\3\2\2\2\u08bb\u094d\5\u00d2j"+
		"\25\u08bc\u08be\f\23\2\2\u08bd\u08bf\7\u00e6\2\2\u08be\u08bd\3\2\2\2\u08be"+
		"\u08bf\3\2\2\2\u08bf\u08c0\3\2\2\2\u08c0\u08c2\7\u00d2\2\2\u08c1\u08c3"+
		"\7\u00e6\2\2\u08c2\u08c1\3\2\2\2\u08c2\u08c3\3\2\2\2\u08c3\u08c4\3\2\2"+
		"\2\u08c4\u094d\5\u00d2j\24\u08c5\u08c7\f\22\2\2\u08c6\u08c8\7\u00e6\2"+
		"\2\u08c7\u08c6\3\2\2\2\u08c7\u08c8\3\2\2\2\u08c8\u08c9\3\2\2\2\u08c9\u08cb"+
		"\7\u00ce\2\2\u08ca\u08cc\7\u00e6\2\2\u08cb\u08ca\3\2\2\2\u08cb\u08cc\3"+
		"\2\2\2\u08cc\u08cd\3\2\2\2\u08cd\u094d\5\u00d2j\23\u08ce\u08d0\f\21\2"+
		"\2\u08cf\u08d1\7\u00e6\2\2\u08d0\u08cf\3\2\2\2\u08d0\u08d1\3\2\2\2\u08d1"+
		"\u08d2\3\2\2\2\u08d2\u08d4\7\u00c5\2\2\u08d3\u08d5\7\u00e6\2\2\u08d4\u08d3"+
		"\3\2\2\2\u08d4\u08d5\3\2\2\2\u08d5\u08d6\3\2\2\2\u08d6\u094d\5\u00d2j"+
		"\22\u08d7\u08d9\f\20\2\2\u08d8\u08da\7\u00e6\2\2\u08d9\u08d8\3\2\2\2\u08d9"+
		"\u08da\3\2\2\2\u08da\u08db\3\2\2\2\u08db\u08dd\7f\2\2\u08dc\u08de\7\u00e6"+
		"\2\2\u08dd\u08dc\3\2\2\2\u08dd\u08de\3\2\2\2\u08de\u08df\3\2\2\2\u08df"+
		"\u094d\5\u00d2j\21\u08e0\u08e2\f\17\2\2\u08e1\u08e3\7\u00e6\2\2\u08e2"+
		"\u08e1\3\2\2\2\u08e2\u08e3\3\2\2\2\u08e3\u08e4\3\2\2\2\u08e4\u08e6\7\\"+
		"\2\2\u08e5\u08e7\7\u00e6\2\2\u08e6\u08e5\3\2\2\2\u08e6\u08e7\3\2\2\2\u08e7"+
		"\u08e8\3\2\2\2\u08e8\u094d\5\u00d2j\20\u08e9\u08eb\f\16\2\2\u08ea\u08ec"+
		"\7\u00e6\2\2\u08eb\u08ea\3\2\2\2\u08eb\u08ec\3\2\2\2\u08ec\u08ed\3\2\2"+
		"\2\u08ed\u08ef\7\u00c9\2\2\u08ee\u08f0\7\u00e6\2\2\u08ef\u08ee\3\2\2\2"+
		"\u08ef\u08f0\3\2\2\2\u08f0\u08f1\3\2\2\2\u08f1\u094d\5\u00d2j\17\u08f2"+
		"\u08f4\f\r\2\2\u08f3\u08f5\7\u00e6\2\2\u08f4\u08f3\3\2\2\2\u08f4\u08f5"+
		"\3\2\2\2\u08f5\u08f6\3\2\2\2\u08f6\u08f8\7\u00cb\2\2\u08f7\u08f9\7\u00e6"+
		"\2\2\u08f8\u08f7\3\2\2\2\u08f8\u08f9\3\2\2\2\u08f9\u08fa\3\2\2\2\u08fa"+
		"\u094d\5\u00d2j\16\u08fb\u08fd\f\f\2\2\u08fc\u08fe\7\u00e6\2\2\u08fd\u08fc"+
		"\3\2\2\2\u08fd\u08fe\3\2\2\2\u08fe\u08ff\3\2\2\2\u08ff\u0901\7\u00ca\2"+
		"\2\u0900\u0902\7\u00e6\2\2\u0901\u0900\3\2\2\2\u0901\u0902\3\2\2\2\u0902"+
		"\u0903\3\2\2\2\u0903\u094d\5\u00d2j\r\u0904\u0906\f\13\2\2\u0905\u0907"+
		"\7\u00e6\2\2\u0906\u0905\3\2\2\2\u0906\u0907\3\2\2\2\u0907\u0908\3\2\2"+
		"\2\u0908\u090a\7\u00cd\2\2\u0909\u090b\7\u00e6\2\2\u090a\u0909\3\2\2\2"+
		"\u090a\u090b\3\2\2\2\u090b\u090c\3\2\2\2\u090c\u094d\5\u00d2j\f\u090d"+
		"\u090f\f\n\2\2\u090e\u0910\7\u00e6\2\2\u090f\u090e\3\2\2\2\u090f\u0910"+
		"\3\2\2\2\u0910\u0911\3\2\2\2\u0911\u0913\7\u00d1\2\2\u0912\u0914\7\u00e6"+
		"\2\2\u0913\u0912\3\2\2\2\u0913\u0914\3\2\2\2\u0914\u0915\3\2\2\2\u0915"+
		"\u094d\5\u00d2j\13\u0916\u0918\f\t\2\2\u0917\u0919\7\u00e6\2\2\u0918\u0917"+
		"\3\2\2\2\u0918\u0919\3\2\2\2\u0919\u091a\3\2\2\2\u091a\u091c\7\u00c8\2"+
		"\2\u091b\u091d\7\u00e6\2\2\u091c\u091b\3\2\2\2\u091c\u091d\3\2\2\2\u091d"+
		"\u091e\3\2\2\2\u091e\u094d\5\u00d2j\n\u091f\u0921\f\7\2\2\u0920\u0922"+
		"\7\u00e6\2\2\u0921\u0920\3\2\2\2\u0921\u0922\3\2\2\2\u0922\u0923\3\2\2"+
		"\2\u0923\u0925\7\16\2\2\u0924\u0926\7\u00e6\2\2\u0925\u0924\3\2\2\2\u0925"+
		"\u0926\3\2\2\2\u0926\u0927\3\2\2\2\u0927\u094d\5\u00d2j\b\u0928\u092a"+
		"\f\6\2\2\u0929\u092b\7\u00e6\2\2\u092a\u0929\3\2\2\2\u092a\u092b\3\2\2"+
		"\2\u092b\u092c\3\2\2\2\u092c\u092e\7\u0085\2\2\u092d\u092f\7\u00e6\2\2"+
		"\u092e\u092d\3\2\2\2\u092e\u092f\3\2\2\2\u092f\u0930\3\2\2\2\u0930\u094d"+
		"\5\u00d2j\7\u0931\u0933\f\5\2\2\u0932\u0934\7\u00e6\2\2\u0933\u0932\3"+
		"\2\2\2\u0933\u0934\3\2\2\2\u0934\u0935\3\2\2\2\u0935\u0937\7\u00c4\2\2"+
		"\u0936\u0938\7\u00e6\2\2\u0937\u0936\3\2\2\2\u0937\u0938\3\2\2\2\u0938"+
		"\u0939\3\2\2\2\u0939\u094d\5\u00d2j\6\u093a\u093c\f\4\2\2\u093b\u093d"+
		"\7\u00e6\2\2\u093c\u093b\3\2\2\2\u093c\u093d\3\2\2\2\u093d\u093e\3\2\2"+
		"\2\u093e\u0940\7C\2\2\u093f\u0941\7\u00e6\2\2\u0940\u093f\3\2\2\2\u0940"+
		"\u0941\3\2\2\2\u0941\u0942\3\2\2\2\u0942\u094d\5\u00d2j\5\u0943\u0945"+
		"\f\3\2\2\u0944\u0946\7\u00e6\2\2\u0945\u0944\3\2\2\2\u0945\u0946\3\2\2"+
		"\2\u0946\u0947\3\2\2\2\u0947\u0949\7X\2\2\u0948\u094a\7\u00e6\2\2\u0949"+
		"\u0948\3\2\2\2\u0949\u094a\3\2\2\2\u094a\u094b\3\2\2\2\u094b\u094d\5\u00d2"+
		"j\4\u094c\u0898\3\2\2\2\u094c\u08a1\3\2\2\2\u094c\u08aa\3\2\2\2\u094c"+
		"\u08b3\3\2\2\2\u094c\u08bc\3\2\2\2\u094c\u08c5\3\2\2\2\u094c\u08ce\3\2"+
		"\2\2\u094c\u08d7\3\2\2\2\u094c\u08e0\3\2\2\2\u094c\u08e9\3\2\2\2\u094c"+
		"\u08f2\3\2\2\2\u094c\u08fb\3\2\2\2\u094c\u0904\3\2\2\2\u094c\u090d\3\2"+
		"\2\2\u094c\u0916\3\2\2\2\u094c\u091f\3\2\2\2\u094c\u0928\3\2\2\2\u094c"+
		"\u0931\3\2\2\2\u094c\u093a\3\2\2\2\u094c\u0943\3\2\2\2\u094d\u0950\3\2"+
		"\2\2\u094e\u094c\3\2\2\2\u094e\u094f\3\2\2\2\u094f\u00d3\3\2\2\2\u0950"+
		"\u094e\3\2\2\2\u0951\u0955\7\62\2\2\u0952\u0955\7\u00a9\2\2\u0953\u0955"+
		"\5\u011e\u0090\2\u0954\u0951\3\2\2\2\u0954\u0952\3\2\2\2\u0954\u0953\3"+
		"\2\2\2\u0955\u0956\3\2\2\2\u0956\u0959\7\u00e6\2\2\u0957\u0958\7\u00c2"+
		"\2\2\u0958\u095a\7\u00e6\2\2\u0959\u0957\3\2\2\2\u0959\u095a\3\2\2\2\u095a"+
		"\u095b\3\2\2\2\u095b\u095c\5\u00d6l\2\u095c\u00d5\3\2\2\2\u095d\u0968"+
		"\5\u00d8m\2\u095e\u0960\7\u00e6\2\2\u095f\u095e\3\2\2\2\u095f\u0960\3"+
		"\2\2\2\u0960\u0961\3\2\2\2\u0961\u0963\7\3\2\2\u0962\u0964\7\u00e6\2\2"+
		"\u0963\u0962\3\2\2\2\u0963\u0964\3\2\2\2\u0964\u0965\3\2\2\2\u0965\u0967"+
		"\5\u00d8m\2\u0966\u095f\3\2\2\2\u0967\u096a\3\2\2\2\u0968\u0966\3\2\2"+
		"\2\u0968\u0969\3\2\2\2\u0969\u00d7\3\2\2\2\u096a\u0968\3\2\2\2\u096b\u097d"+
		"\5\u0104\u0083\2\u096c\u096e\7\u00e6\2\2\u096d\u096c\3\2\2\2\u096d\u096e"+
		"\3\2\2\2\u096e\u096f\3\2\2\2\u096f\u0971\7\u00cc\2\2\u0970\u0972\7\u00e6"+
		"\2\2\u0971\u0970\3\2\2\2\u0971\u0972\3\2\2\2\u0972\u0977\3\2\2\2\u0973"+
		"\u0975\5\u0100\u0081\2\u0974\u0976\7\u00e6\2\2\u0975\u0974\3\2\2\2\u0975"+
		"\u0976\3\2\2\2\u0976\u0978\3\2\2\2\u0977\u0973\3\2\2\2\u0977\u0978\3\2"+
		"\2\2\u0978\u0979\3\2\2\2\u0979\u097b\7\u00d5\2\2\u097a\u097c\7\u00e6\2"+
		"\2\u097b\u097a\3\2\2\2\u097b\u097c\3\2\2\2\u097c\u097e\3\2\2\2\u097d\u096d"+
		"\3\2\2\2\u097d\u097e\3\2\2\2\u097e\u0980\3\2\2\2\u097f\u0981\5\u011c\u008f"+
		"\2\u0980\u097f\3\2\2\2\u0980\u0981\3\2\2\2\u0981\u0984\3\2\2\2\u0982\u0983"+
		"\7\u00e6\2\2\u0983\u0985\5\u0106\u0084\2\u0984\u0982\3\2\2\2\u0984\u0985"+
		"\3\2\2\2\u0985\u00d9\3\2\2\2\u0986\u0987\7\u00be\2\2\u0987\u0988\7\u00e6"+
		"\2\2\u0988\u0989\5\u00d2j\2\u0989\u098b\5\u0128\u0095\2\u098a\u098c\5"+
		"\36\20\2\u098b\u098a\3\2\2\2\u098b\u098c\3\2\2\2\u098c\u098d\3\2\2\2\u098d"+
		"\u098e\7\u00bd\2\2\u098e\u00db\3\2\2\2\u098f\u0990\7\u00bf\2\2\u0990\u0991"+
		"\7\u00e6\2\2\u0991\u0993\5\u00e2r\2\u0992\u0994\7\u00e6\2\2\u0993\u0992"+
		"\3\2\2\2\u0993\u0994\3\2\2\2\u0994\u0995\3\2\2\2\u0995\u0997\7\3\2\2\u0996"+
		"\u0998\7\u00e6\2\2\u0997\u0996\3\2\2\2\u0997\u0998\3\2\2\2\u0998\u0999"+
		"\3\2\2\2\u0999\u099a\5\u00d2j\2\u099a\u00dd\3\2\2\2\u099b\u099c\7\u00c0"+
		"\2\2\u099c\u09a1\7\u00e6\2\2\u099d\u09a2\5\u00e8u\2\u099e\u099f\7w\2\2"+
		"\u099f\u09a0\7\u00e6\2\2\u09a0\u09a2\5\u011a\u008e\2\u09a1\u099d\3\2\2"+
		"\2\u09a1\u099e\3\2\2\2\u09a2\u09a3\3\2\2\2\u09a3\u09a5\5\u0128\u0095\2"+
		"\u09a4\u09a6\5\36\20\2\u09a5\u09a4\3\2\2\2\u09a5\u09a6\3\2\2\2\u09a6\u09a7"+
		"\3\2\2\2\u09a7\u09a8\7@\2\2\u09a8\u00df\3\2\2\2\u09a9\u09aa\7\u00c3\2"+
		"\2\u09aa\u09ab\7\u00e6\2\2\u09ab\u09ad\5\u00e2r\2\u09ac\u09ae\7\u00e6"+
		"\2\2\u09ad\u09ac\3\2\2\2\u09ad\u09ae\3\2\2\2\u09ae\u09af\3\2\2\2\u09af"+
		"\u09b4\7\3\2\2\u09b0\u09b2\7\u00e6\2\2\u09b1\u09b0\3\2\2\2\u09b1\u09b2"+
		"\3\2\2\2\u09b2\u09b3\3\2\2\2\u09b3\u09b5\5\u008cG\2\u09b4\u09b1\3\2\2"+
		"\2\u09b4\u09b5\3\2\2\2\u09b5\u00e1\3\2\2\2\u09b6\u09b8\7\6\2\2\u09b7\u09b6"+
		"\3\2\2\2\u09b7\u09b8\3\2\2\2\u09b8\u09b9\3\2\2\2\u09b9\u09ba\5\u00d2j"+
		"\2\u09ba\u00e3\3\2\2\2\u09bb\u09bc\7\32\2\2\u09bc\u09bd\7\u00e6\2\2\u09bd"+
		"\u09be\5\u00e8u\2\u09be\u00e5\3\2\2\2\u09bf\u09c2\5\u00e8u\2\u09c0\u09c1"+
		"\7\u00e6\2\2\u09c1\u09c3\5\u00f2z\2\u09c2\u09c0\3\2\2\2\u09c2\u09c3\3"+
		"\2\2\2\u09c3\u00e7\3\2\2\2\u09c4\u09c8\5\u00eav\2\u09c5\u09c7\5\u00ec"+
		"w\2\u09c6\u09c5\3\2\2\2\u09c7\u09ca\3\2\2\2\u09c8\u09c6\3\2\2\2\u09c8"+
		"\u09c9\3\2\2\2\u09c9\u00e9\3\2\2\2\u09ca\u09c8\3\2\2\2\u09cb\u09cd\5\u0104"+
		"\u0083\2\u09cc\u09ce\5\u011c\u008f\2\u09cd\u09cc\3\2\2\2\u09cd\u09ce\3"+
		"\2\2\2\u09ce\u09d2\3\2\2\2\u09cf\u09d2\5\u00eex\2\u09d0\u09d2\5\u00f0"+
		"y\2\u09d1\u09cb\3\2\2\2\u09d1\u09cf\3\2\2\2\u09d1\u09d0\3\2\2\2\u09d2"+
		"\u00eb\3\2\2\2\u09d3\u09e1\5\u00eex\2\u09d4\u09e1\5\u00f0y\2\u09d5\u09d7"+
		"\7\u00cc\2\2\u09d6\u09d8\7\u00e6\2\2\u09d7\u09d6\3\2\2\2\u09d7\u09d8\3"+
		"\2\2\2\u09d8\u09da\3\2\2\2\u09d9\u09db\5\u00f2z\2\u09da\u09d9\3\2\2\2"+
		"\u09da\u09db\3\2\2\2\u09db\u09dd\3\2\2\2\u09dc\u09de\7\u00e6\2\2\u09dd"+
		"\u09dc\3\2\2\2\u09dd\u09de\3\2\2\2\u09de\u09df\3\2\2\2\u09df\u09e1\7\u00d5"+
		"\2\2\u09e0\u09d3\3\2\2\2\u09e0\u09d4\3\2\2\2\u09e0\u09d5\3\2\2\2\u09e1"+
		"\u00ed\3\2\2\2\u09e2\u09e4\7\u00e6\2\2\u09e3\u09e2\3\2\2\2\u09e3\u09e4"+
		"\3\2\2\2\u09e4\u09e5\3\2\2\2\u09e5\u09e7\7\5\2\2\u09e6\u09e8\7\u00e6\2"+
		"\2\u09e7\u09e6\3\2\2\2\u09e7\u09e8\3\2\2\2\u09e8\u09e9\3\2\2\2\u09e9\u09ea"+
		"\5\u0104\u0083\2\u09ea\u00ef\3\2\2\2\u09eb\u09ed\7\u00e6\2\2\u09ec\u09eb"+
		"\3\2\2\2\u09ec\u09ed\3\2\2\2\u09ed\u09ee\3\2\2\2\u09ee\u09f0\7\7\2\2\u09ef"+
		"\u09f1\7\u00e6\2\2\u09f0\u09ef\3\2\2\2\u09f0\u09f1\3\2\2\2\u09f1\u09f2"+
		"\3\2\2\2\u09f2\u09f3\5\u0104\u0083\2\u09f3\u00f1\3\2\2\2\u09f4\u09f6\5"+
		"\u00f4{\2\u09f5\u09f4\3\2\2\2\u09f5\u09f6\3\2\2\2\u09f6\u09f8\3\2\2\2"+
		"\u09f7\u09f9\7\u00e6\2\2\u09f8\u09f7\3\2\2\2\u09f8\u09f9\3\2\2\2\u09f9"+
		"\u09fa\3\2\2\2\u09fa\u09fc\7\3\2\2\u09fb\u09fd\7\u00e6\2\2\u09fc\u09fb"+
		"\3\2\2\2\u09fc\u09fd\3\2\2\2\u09fd\u09ff\3\2\2\2\u09fe\u09f5\3\2\2\2\u09ff"+
		"\u0a02\3\2\2\2\u0a00\u09fe\3\2\2\2\u0a00\u0a01\3\2\2\2\u0a01\u0a03\3\2"+
		"\2\2\u0a02\u0a00\3\2\2\2\u0a03\u0a04\5\u00f4{\2\u0a04\u00f3\3\2\2\2\u0a05"+
		"\u0a07\5\u0104\u0083\2\u0a06\u0a08\7\u00e6\2\2\u0a07\u0a06\3\2\2\2\u0a07"+
		"\u0a08\3\2\2\2\u0a08\u0a09\3\2\2\2\u0a09\u0a0b\7\u00c6\2\2\u0a0a\u0a0c"+
		"\7\u00e6\2\2\u0a0b\u0a0a\3\2\2\2\u0a0b\u0a0c\3\2\2\2\u0a0c\u0a0e\3\2\2"+
		"\2\u0a0d\u0a05\3\2\2\2\u0a0d\u0a0e\3\2\2\2\u0a0e\u0a0f\3\2\2\2\u0a0f\u0a10"+
		"\5\u00d2j\2\u0a10\u00f5\3\2\2\2\u0a11\u0a23\7\u00cc\2\2\u0a12\u0a14\7"+
		"\u00e6\2\2\u0a13\u0a12\3\2\2\2\u0a13\u0a14\3\2\2\2\u0a14\u0a15\3\2\2\2"+
		"\u0a15\u0a20\5\u00f8}\2\u0a16\u0a18\7\u00e6\2\2\u0a17\u0a16\3\2\2\2\u0a17"+
		"\u0a18\3\2\2\2\u0a18\u0a19\3\2\2\2\u0a19\u0a1b\7\3\2\2\u0a1a\u0a1c\7\u00e6"+
		"\2\2\u0a1b\u0a1a\3\2\2\2\u0a1b\u0a1c\3\2\2\2\u0a1c\u0a1d\3\2\2\2\u0a1d"+
		"\u0a1f\5\u00f8}\2\u0a1e\u0a17\3\2\2\2\u0a1f\u0a22\3\2\2\2\u0a20\u0a1e"+
		"\3\2\2\2\u0a20\u0a21\3\2\2\2\u0a21\u0a24\3\2\2\2\u0a22\u0a20\3\2\2\2\u0a23"+
		"\u0a13\3\2\2\2\u0a23\u0a24\3\2\2\2\u0a24\u0a26\3\2\2\2\u0a25\u0a27\7\u00e6"+
		"\2\2\u0a26\u0a25\3\2\2\2\u0a26\u0a27\3\2\2\2\u0a27\u0a28\3\2\2\2\u0a28"+
		"\u0a29\7\u00d5\2\2\u0a29\u00f7\3\2\2\2\u0a2a\u0a2b\7\u0080\2\2\u0a2b\u0a2d"+
		"\7\u00e6\2\2\u0a2c\u0a2a\3\2\2\2\u0a2c\u0a2d\3\2\2\2\u0a2d\u0a30\3\2\2"+
		"\2\u0a2e\u0a2f\t\r\2\2\u0a2f\u0a31\7\u00e6\2\2\u0a30\u0a2e\3\2\2\2\u0a30"+
		"\u0a31\3\2\2\2\u0a31\u0a34\3\2\2\2\u0a32\u0a33\7\u0087\2\2\u0a33\u0a35"+
		"\7\u00e6\2\2\u0a34\u0a32\3\2\2\2\u0a34\u0a35\3\2\2\2\u0a35\u0a36\3\2\2"+
		"\2\u0a36\u0a38\5\u0104\u0083\2\u0a37\u0a39\5\u011c\u008f\2\u0a38\u0a37"+
		"\3\2\2\2\u0a38\u0a39\3\2\2\2\u0a39\u0a42\3\2\2\2\u0a3a\u0a3c\7\u00e6\2"+
		"\2\u0a3b\u0a3a\3\2\2\2\u0a3b\u0a3c\3\2\2\2\u0a3c\u0a3d\3\2\2\2\u0a3d\u0a3f"+
		"\7\u00cc\2\2\u0a3e\u0a40\7\u00e6\2\2\u0a3f\u0a3e\3\2\2\2\u0a3f\u0a40\3"+
		"\2\2\2\u0a40\u0a41\3\2\2\2\u0a41\u0a43\7\u00d5\2\2\u0a42\u0a3b\3\2\2\2"+
		"\u0a42\u0a43\3\2\2\2\u0a43\u0a48\3\2\2\2\u0a44\u0a46\7\u00e6\2\2\u0a45"+
		"\u0a44\3\2\2\2\u0a45\u0a46\3\2\2\2\u0a46\u0a47\3\2\2\2\u0a47\u0a49\5\u0106"+
		"\u0084\2\u0a48\u0a45\3\2\2\2\u0a48\u0a49\3\2\2\2\u0a49\u0a4e\3\2\2\2\u0a4a"+
		"\u0a4c\7\u00e6\2\2\u0a4b\u0a4a\3\2\2\2\u0a4b\u0a4c\3\2\2\2\u0a4c\u0a4d"+
		"\3\2\2\2\u0a4d\u0a4f\5\u00fa~\2\u0a4e\u0a4b\3\2\2\2\u0a4e\u0a4f\3\2\2"+
		"\2\u0a4f\u00f9\3\2\2\2\u0a50\u0a52\7\u00c8\2\2\u0a51\u0a53\7\u00e6\2\2"+
		"\u0a52\u0a51\3\2\2\2\u0a52\u0a53\3\2\2\2\u0a53\u0a54\3\2\2\2\u0a54\u0a55"+
		"\5\u00d0i\2\u0a55\u00fb\3\2\2\2\u0a56\u0a61\5\u00fe\u0080\2\u0a57\u0a59"+
		"\7\u00e6\2\2\u0a58\u0a57\3\2\2\2\u0a58\u0a59\3\2\2\2\u0a59\u0a5a\3\2\2"+
		"\2\u0a5a\u0a5c\7\3\2\2\u0a5b\u0a5d\7\u00e6\2\2\u0a5c\u0a5b\3\2\2\2\u0a5c"+
		"\u0a5d\3\2\2\2\u0a5d\u0a5e\3\2\2\2\u0a5e\u0a60\5\u00fe\u0080\2\u0a5f\u0a58"+
		"\3\2\2\2\u0a60\u0a63\3\2\2\2\u0a61\u0a5f\3\2\2\2\u0a61\u0a62\3\2\2\2\u0a62"+
		"\u00fd\3\2\2\2\u0a63\u0a61\3\2\2\2\u0a64\u0a65\5\u00d2j\2\u0a65\u0a66"+
		"\7\u00e6\2\2\u0a66\u0a67\7\u00b2\2\2\u0a67\u0a68\7\u00e6\2\2\u0a68\u0a6a"+
		"\3\2\2\2\u0a69\u0a64\3\2\2\2\u0a69\u0a6a\3\2\2\2\u0a6a\u0a6b\3\2\2\2\u0a6b"+
		"\u0a6c\5\u00d2j\2\u0a6c\u00ff\3\2\2\2\u0a6d\u0a78\5\u0102\u0082\2\u0a6e"+
		"\u0a70\7\u00e6\2\2\u0a6f\u0a6e\3\2\2\2\u0a6f\u0a70\3\2\2\2\u0a70\u0a71"+
		"\3\2\2\2\u0a71\u0a73\7\3\2\2\u0a72\u0a74\7\u00e6\2\2\u0a73\u0a72\3\2\2"+
		"\2\u0a73\u0a74\3\2\2\2\u0a74\u0a75\3\2\2\2\u0a75\u0a77\5\u0102\u0082\2"+
		"\u0a76\u0a6f\3\2\2\2\u0a77\u0a7a\3\2\2\2\u0a78\u0a76\3\2\2\2\u0a78\u0a79"+
		"\3\2\2\2\u0a79\u0101\3\2\2\2\u0a7a\u0a78\3\2\2\2\u0a7b\u0a7c\5\u00d0i"+
		"\2\u0a7c\u0a7d\7\u00e6\2\2\u0a7d\u0a7e\7\u00b2\2\2\u0a7e\u0a7f\7\u00e6"+
		"\2\2\u0a7f\u0a81\3\2\2\2\u0a80\u0a7b\3\2\2\2\u0a80\u0a81\3\2\2\2\u0a81"+
		"\u0a82\3\2\2\2\u0a82\u0a83\5\u00d0i\2\u0a83\u0103\3\2\2\2\u0a84\u0a87"+
		"\7\u00e7\2\2\u0a85\u0a87\5\u0120\u0091\2\u0a86\u0a84\3\2\2\2\u0a86\u0a85"+
		"\3\2\2\2\u0a87\u0a88\3\2\2\2\u0a88\u0a86\3\2\2\2\u0a88\u0a89\3\2\2\2\u0a89"+
		"\u0105\3\2\2\2\u0a8a\u0a8c\7\22\2\2\u0a8b\u0a8d\7\u00e6\2\2\u0a8c\u0a8b"+
		"\3\2\2\2\u0a8c\u0a8d\3\2\2\2\u0a8d\u0a90\3\2\2\2\u0a8e\u0a8f\7w\2\2\u0a8f"+
		"\u0a91\7\u00e6\2\2\u0a90\u0a8e\3\2\2\2\u0a90\u0a91\3\2\2\2\u0a91\u0a92"+
		"\3\2\2\2\u0a92\u0a97\5\u011a\u008e\2\u0a93\u0a95\7\u00e6\2\2\u0a94\u0a93"+
		"\3\2\2\2\u0a94\u0a95\3\2\2\2\u0a95\u0a96\3\2\2\2\u0a96\u0a98\5\u0112\u008a"+
		"\2\u0a97\u0a94\3\2\2\2\u0a97\u0a98\3\2\2\2\u0a98\u0107\3\2\2\2\u0a99\u0a9a"+
		"\t\16\2\2\u0a9a\u0109\3\2\2\2\u0a9b\u0aa0\7\u00e7\2\2\u0a9c\u0a9f\5\u0120"+
		"\u0091\2\u0a9d\u0a9f\7\u00e7\2\2\u0a9e\u0a9c\3\2\2\2\u0a9e\u0a9d\3\2\2"+
		"\2\u0a9f\u0aa2\3\2\2\2\u0aa0\u0a9e\3\2\2\2\u0aa0\u0aa1\3\2\2\2\u0aa1\u0aab"+
		"\3\2\2\2\u0aa2\u0aa0\3\2\2\2\u0aa3\u0aa6\5\u0120\u0091\2\u0aa4\u0aa7\5"+
		"\u0120\u0091\2\u0aa5\u0aa7\7\u00e7\2\2\u0aa6\u0aa4\3\2\2\2\u0aa6\u0aa5"+
		"\3\2\2\2\u0aa7\u0aa8\3\2\2\2\u0aa8\u0aa6\3\2\2\2\u0aa8\u0aa9\3\2\2\2\u0aa9"+
		"\u0aab\3\2\2\2\u0aaa\u0a9b\3\2\2\2\u0aaa\u0aa3\3\2\2\2\u0aab\u010b\3\2"+
		"\2\2\u0aac\u0aad\t\17\2\2\u0aad\u010d\3\2\2\2\u0aae\u0ab0\7\u00ac\2\2"+
		"\u0aaf\u0ab1\7\u00e6\2\2\u0ab0\u0aaf\3\2\2\2\u0ab0\u0ab1\3\2\2\2\u0ab1"+
		"\u0ab2\3\2\2\2\u0ab2\u0ab4\7\u00d0\2\2\u0ab3\u0ab5\7\u00e6\2\2\u0ab4\u0ab3"+
		"\3\2\2\2\u0ab4\u0ab5\3\2\2\2\u0ab5\u0ab8\3\2\2\2\u0ab6\u0ab9\5\u0118\u008d"+
		"\2\u0ab7\u0ab9\5\u0104\u0083\2\u0ab8\u0ab6\3\2\2\2\u0ab8\u0ab7\3\2\2\2"+
		"\u0ab9\u010f\3\2\2\2\u0aba\u0abf\5\u0104\u0083\2\u0abb\u0abc\7\5\2\2\u0abc"+
		"\u0abe\5\u0104\u0083\2\u0abd\u0abb\3\2\2\2\u0abe\u0ac1\3\2\2\2\u0abf\u0abd"+
		"\3\2\2\2\u0abf\u0ac0\3\2\2\2\u0ac0\u0111\3\2\2\2\u0ac1\u0abf\3\2\2\2\u0ac2"+
		"\u0ac4\7\u00d0\2\2\u0ac3\u0ac5\7\u00e6\2\2\u0ac4\u0ac3\3\2\2\2\u0ac4\u0ac5"+
		"\3\2\2\2\u0ac5\u0ac8\3\2\2\2\u0ac6\u0ac9\7\u00dc\2\2\u0ac7\u0ac9\5\u0104"+
		"\u0083\2\u0ac8\u0ac6\3\2\2\2\u0ac8\u0ac7\3\2\2\2\u0ac9\u0113\3\2\2\2\u0aca"+
		"\u0ad3\5\u010a\u0086\2\u0acb\u0acd\7\u00e6\2\2\u0acc\u0acb\3\2\2\2\u0acc"+
		"\u0acd\3\2\2\2\u0acd\u0ace\3\2\2\2\u0ace\u0ad0\7\u00ce\2\2\u0acf\u0ad1"+
		"\7\u00e6\2\2\u0ad0\u0acf\3\2\2\2\u0ad0\u0ad1\3\2\2\2\u0ad1\u0ad2\3\2\2"+
		"\2\u0ad2\u0ad4\5\u010a\u0086\2\u0ad3\u0acc\3\2\2\2\u0ad3\u0ad4\3\2\2\2"+
		"\u0ad4\u0115\3\2\2\2\u0ad5\u0ad6\5\u0104\u0083\2\u0ad6\u0ad7\7\u00e4\2"+
		"\2\u0ad7\u0117\3\2\2\2\u0ad8\u0ad9\t\20\2\2\u0ad9\u0119\3\2\2\2\u0ada"+
		"\u0ade\5\u010e\u0088\2\u0adb\u0ade\5\u0108\u0085\2\u0adc\u0ade\5\u0110"+
		"\u0089\2\u0add\u0ada\3\2\2\2\u0add\u0adb\3\2\2\2\u0add\u0adc\3\2\2\2\u0ade"+
		"\u0ae7\3\2\2\2\u0adf\u0ae1\7\u00e6\2\2\u0ae0\u0adf\3\2\2\2\u0ae0\u0ae1"+
		"\3\2\2\2\u0ae1\u0ae2\3\2\2\2\u0ae2\u0ae4\7\u00cc\2\2\u0ae3\u0ae5\7\u00e6"+
		"\2\2\u0ae4\u0ae3\3\2\2\2\u0ae4\u0ae5\3\2\2\2\u0ae5\u0ae6\3\2\2\2\u0ae6"+
		"\u0ae8\7\u00d5\2\2\u0ae7\u0ae0\3\2\2\2\u0ae7\u0ae8\3\2\2\2\u0ae8\u011b"+
		"\3\2\2\2\u0ae9\u0aea\t\21\2\2\u0aea\u011d\3\2\2\2\u0aeb\u0aec\t\22\2\2"+
		"\u0aec\u011f\3\2\2\2\u0aed\u0aee\t\23\2\2\u0aee\u0121\3\2\2\2\u0aef\u0af0"+
		"\7\u00e1\2\2\u0af0\u0123\3\2\2\2\u0af1\u0af2\7\u00e2\2\2\u0af2\u0125\3"+
		"\2\2\2\u0af3\u0af5\7\u00e6\2\2\u0af4\u0af3\3\2\2\2\u0af4\u0af5\3\2\2\2"+
		"\u0af5\u0af9\3\2\2\2\u0af6\u0afa\7\u00e0\2\2\u0af7\u0afa\5\u0124\u0093"+
		"\2\u0af8\u0afa\5\u0122\u0092\2\u0af9\u0af6\3\2\2\2\u0af9\u0af7\3\2\2\2"+
		"\u0af9\u0af8\3\2\2\2\u0afa\u0afc\3\2\2\2\u0afb\u0afd\7\u00e6\2\2\u0afc"+
		"\u0afb\3\2\2\2\u0afc\u0afd\3\2\2\2\u0afd\u0127\3\2\2\2\u0afe\u0b07\5\u0126"+
		"\u0094\2\u0aff\u0b01\7\u00e6\2\2\u0b00\u0aff\3\2\2\2\u0b00\u0b01\3\2\2"+
		"\2\u0b01\u0b02\3\2\2\2\u0b02\u0b04\7\u00e4\2\2\u0b03\u0b05\7\u00e6\2\2"+
		"\u0b04\u0b03\3\2\2\2\u0b04\u0b05\3\2\2\2\u0b05\u0b07\3\2\2\2\u0b06\u0afe"+
		"\3\2\2\2\u0b06\u0b00\3\2\2\2\u0b07\u0b08\3\2\2\2\u0b08\u0b06\3\2\2\2\u0b08"+
		"\u0b09\3\2\2\2\u0b09\u0129\3\2\2\2\u01e2\u012e\u0133\u013a\u013d\u0143"+
		"\u0146\u0149\u014e\u0152\u0157\u015b\u0160\u0164\u0169\u016d\u0174\u017a"+
		"\u0180\u0186\u018a\u0190\u019b\u01a1\u01a6\u01af\u01b3\u01b9\u01bf\u01c5"+
		"\u01d0\u01dc\u01e0\u01e6\u01ec\u01f2\u01fb\u0201\u0205\u0209\u020d\u0212"+
		"\u021b\u0260\u0293\u0299\u029d\u02a0\u02b0\u02b4\u02b9\u02bc\u02c1\u02c7"+
		"\u02cb\u02d0\u02d5\u02d9\u02dc\u02e0\u02e6\u02ea\u02f1\u02f7\u02fb\u02fe"+
		"\u0303\u030d\u0310\u0313\u0317\u031d\u0321\u0326\u032d\u0331\u0335\u0339"+
		"\u033c\u0341\u034c\u0359\u0360\u0369\u0370\u0374\u0377\u0386\u038c\u0396"+
		"\u039a\u03a4\u03ac\u03b1\u03b7\u03bb\u03be\u03c2\u03cd\u03d1\u03d6\u03db"+
		"\u03df\u03e3\u03e7\u03ea\u03ed\u03f0\u03f3\u03f7\u03fe\u0402\u0406\u040a"+
		"\u040f\u0412\u0415\u0418\u041b\u041e\u0423\u0427\u042f\u0433\u0436\u0439"+
		"\u043d\u0454\u045a\u045e\u0462\u046b\u0476\u047b\u0485\u0489\u048e\u0496"+
		"\u049a\u049e\u04a6\u04aa\u04b6\u04ba\u04c1\u04c3\u04c9\u04cd\u04d3\u04d7"+
		"\u04db\u04e3\u04e7\u04ed\u04f6\u04f8\u04fd\u0506\u0508\u0510\u0512\u0517"+
		"\u051b\u051f\u0523\u0527\u052b\u052e\u0531\u0535\u0539\u0551\u055b\u055f"+
		"\u0564\u056f\u0573\u0578\u0586\u058a\u0593\u0597\u059a\u059e\u05a2\u05a5"+
		"\u05a9\u05ad\u05b0\u05b4\u05b7\u05bb\u05bd\u05c2\u05c6\u05ca\u05ce\u05d0"+
		"\u05d6\u05da\u05dd\u05e2\u05e6\u05ec\u05ef\u05f2\u05f6\u05fa\u0601\u0605"+
		"\u060b\u060e\u0612\u0619\u061d\u0623\u0626\u062a\u0632\u0636\u0639\u063c"+
		"\u0640\u0648\u064c\u0650\u0652\u0655\u065a\u0660\u0664\u0668\u066d\u0672"+
		"\u0676\u067a\u067f\u0687\u0689\u0695\u0699\u06a1\u06a5\u06ad\u06b1\u06b5"+
		"\u06b9\u06bd\u06c1\u06c9\u06cd\u06da\u06e1\u06e5\u06f0\u06f7\u06fc\u0700"+
		"\u0705\u0708\u070e\u0712\u0715\u071b\u071f\u0727\u072b\u0734\u0738\u073c"+
		"\u0740\u0743\u0747\u074d\u0751\u0758\u0761\u0768\u076c\u076f\u0772\u0775"+
		"\u078b\u078f\u0796\u0798\u07a1\u07a6\u07ab\u07b0\u07b3\u07b7\u07bb\u07c0"+
		"\u07c4\u07c9\u07cd\u07d2\u07d6\u07db\u07df\u07e4\u07e8\u07ed\u07f1\u07f6"+
		"\u07fa\u07ff\u0803\u0808\u080c\u0811\u0815\u081a\u081e\u0823\u0827\u082c"+
		"\u0830\u0835\u0839\u083e\u0842\u0847\u084b\u0850\u0854\u0859\u085d\u0860"+
		"\u0862\u086a\u086e\u0872\u0877\u087e\u0884\u0889\u088e\u0893\u0896\u089a"+
		"\u089e\u08a3\u08a7\u08ac\u08b0\u08b5\u08b9\u08be\u08c2\u08c7\u08cb\u08d0"+
		"\u08d4\u08d9\u08dd\u08e2\u08e6\u08eb\u08ef\u08f4\u08f8\u08fd\u0901\u0906"+
		"\u090a\u090f\u0913\u0918\u091c\u0921\u0925\u092a\u092e\u0933\u0937\u093c"+
		"\u0940\u0945\u0949\u094c\u094e\u0954\u0959\u095f\u0963\u0968\u096d\u0971"+
		"\u0975\u0977\u097b\u097d\u0980\u0984\u098b\u0993\u0997\u09a1\u09a5\u09ad"+
		"\u09b1\u09b4\u09b7\u09c2\u09c8\u09cd\u09d1\u09d7\u09da\u09dd\u09e0\u09e3"+
		"\u09e7\u09ec\u09f0\u09f5\u09f8\u09fc\u0a00\u0a07\u0a0b\u0a0d\u0a13\u0a17"+
		"\u0a1b\u0a20\u0a23\u0a26\u0a2c\u0a30\u0a34\u0a38\u0a3b\u0a3f\u0a42\u0a45"+
		"\u0a48\u0a4b\u0a4e\u0a52\u0a58\u0a5c\u0a61\u0a69\u0a6f\u0a73\u0a78\u0a80"+
		"\u0a86\u0a88\u0a8c\u0a90\u0a94\u0a97\u0a9e\u0aa0\u0aa6\u0aa8\u0aaa\u0ab0"+
		"\u0ab4\u0ab8\u0abf\u0ac4\u0ac8\u0acc\u0ad0\u0ad3\u0add\u0ae0\u0ae4\u0ae7"+
		"\u0af4\u0af9\u0afc\u0b00\u0b04\u0b06\u0b08";
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