// Generated from MySQLParser.g4 by ANTLR 4.5.3

package com.kakao.prmc.antlr.mysql;

import java.util.List;

import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.VocabularyImpl;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MySQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SELECT=1, FROM=2, WHERE=3, AND=4, OR=5, XOR=6, IS=7, NULL=8, LIKE=9, IN=10, 
		EXISTS=11, ALL=12, ANY=13, TRUE=14, FALSE=15, DIVIDE=16, MOD=17, BETWEEN=18, 
		REGEXP=19, PLUS=20, MINUS=21, NEGATION=22, VERTBAR=23, BITAND=24, POWER_OP=25, 
		BINARY=26, SHIFT_LEFT=27, SHIFT_RIGHT=28, ESCAPE=29, ASTERISK=30, RPAREN=31, 
		LPAREN=32, RBRACK=33, LBRACK=34, COLON=35, EQ=36, LTH=37, GTH=38, NOT_EQ=39, 
		NOT=40, LET=41, GET=42, SEMI=43, COMMA=44, DOT=45, COLLATE=46, INNER=47, 
		OUTER=48, JOIN=49, CROSS=50, USING=51, INDEX=52, KEY=53, ORDER=54, GROUP=55, 
		BY=56, FOR=57, USE=58, IGNORE=59, PARTITION=60, STRAIGHT_JOIN=61, NATURAL=62, 
		LEFT=63, RIGHT=64, OJ=65, ON=66, ASC=67, DESC=68, ID=69, INT=70, STRING=71, 
		NEWLINE=72, WS=73, USER_VAR=74, STRAIGHTJOIN=75;
	public static final int
		RULE_stat = 0, RULE_schemaName = 1, RULE_selectClause = 2, RULE_ascDesc = 3, 
		RULE_groupByClause = 4, RULE_groupByItem = 5, RULE_orderByClause = 6, 
		RULE_orderByItem = 7, RULE_tableName = 8, RULE_tableAlias = 9, RULE_columnName = 10, 
		RULE_function = 11, RULE_functionParameter = 12, RULE_columnNameAlias = 13, 
		RULE_indexName = 14, RULE_columnList = 15, RULE_columnListClause = 16, 
		RULE_fromClause = 17, RULE_selectKey = 18, RULE_whereClause = 19, RULE_expression = 20, 
		RULE_element = 21, RULE_rightElement = 22, RULE_leftElement = 23, RULE_targetElement = 24, 
		RULE_relationalOp = 25, RULE_exprOp = 26, RULE_betweenOp = 27, RULE_isOrIsNot = 28, 
		RULE_simpleExpression = 29, RULE_inSubquery = 30, RULE_exists = 31, RULE_notExists = 32, 
		RULE_inClause = 33, RULE_tableReferences = 34, RULE_tableReference = 35, 
		RULE_tableFactor4 = 36, RULE_leftjoinTableAtom = 37, RULE_tableAtom = 38, 
		RULE_joinClause = 39, RULE_joinCondition = 40, RULE_indexHintList = 41, 
		RULE_indexOptions = 42, RULE_indexHint = 43, RULE_indexList = 44, RULE_partitionClause = 45, 
		RULE_partitionNames = 46, RULE_partitionName = 47, RULE_subqueryAlias = 48, 
		RULE_subquery = 49, RULE_subqueryEnd = 50;
	public static final String[] ruleNames = {
		"stat", "schemaName", "selectClause", "ascDesc", "groupByClause", "groupByItem", 
		"orderByClause", "orderByItem", "tableName", "tableAlias", "columnName", 
		"function", "functionParameter", "columnNameAlias", "indexName", "columnList", 
		"columnListClause", "fromClause", "selectKey", "whereClause", "expression", 
		"element", "rightElement", "leftElement", "targetElement", "relationalOp", 
		"exprOp", "betweenOp", "isOrIsNot", "simpleExpression", "inSubquery", 
		"exists", "notExists", "inClause", "tableReferences", "tableReference", 
		"tableFactor4", "leftjoinTableAtom", "tableAtom", "joinClause", "joinCondition", 
		"indexHintList", "indexOptions", "indexHint", "indexList", "partitionClause", 
		"partitionNames", "partitionName", "subqueryAlias", "subquery", "subqueryEnd"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'select'", "'from'", "'where'", null, null, "'xor'", "'is'", "'null'", 
		"'like'", "'in'", "'exists'", "'all'", "'any'", "'true'", "'false'", null, 
		null, "'between'", "'regexp'", "'+'", "'-'", "'~'", "'|'", "'&'", "'^'", 
		"'binary'", "'<<'", "'>>'", "'escape'", "'*'", "')'", "'('", "']'", "'['", 
		"':'", "'='", "'<'", "'>'", "'!='", "'not'", "'<='", "'>='", "';'", "','", 
		"'.'", "'collate'", "'inner'", "'outer'", "'join'", "'cross'", "'using'", 
		"'index'", "'key'", "'order'", "'group'", "'by'", "'for'", "'use'", "'ignore'", 
		"'partition'", "'straight_join'", "'natural'", "'left'", "'right'", "'oj'", 
		"'on'", "'asc'", "'desc'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SELECT", "FROM", "WHERE", "AND", "OR", "XOR", "IS", "NULL", "LIKE", 
		"IN", "EXISTS", "ALL", "ANY", "TRUE", "FALSE", "DIVIDE", "MOD", "BETWEEN", 
		"REGEXP", "PLUS", "MINUS", "NEGATION", "VERTBAR", "BITAND", "POWER_OP", 
		"BINARY", "SHIFT_LEFT", "SHIFT_RIGHT", "ESCAPE", "ASTERISK", "RPAREN", 
		"LPAREN", "RBRACK", "LBRACK", "COLON", "EQ", "LTH", "GTH", "NOT_EQ", "NOT", 
		"LET", "GET", "SEMI", "COMMA", "DOT", "COLLATE", "INNER", "OUTER", "JOIN", 
		"CROSS", "USING", "INDEX", "KEY", "ORDER", "GROUP", "BY", "FOR", "USE", 
		"IGNORE", "PARTITION", "STRAIGHT_JOIN", "NATURAL", "LEFT", "RIGHT", "OJ", 
		"ON", "ASC", "DESC", "ID", "INT", "STRING", "NEWLINE", "WS", "USER_VAR", 
		"STRAIGHTJOIN"
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
	public String getGrammarFileName() { return "MySQLParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MySQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StatContext extends ParserRuleContext {
		public List<SelectClauseContext> selectClause() {
			return getRuleContexts(SelectClauseContext.class);
		}
		public SelectClauseContext selectClause(int i) {
			return getRuleContext(SelectClauseContext.class,i);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_stat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(102);
				selectClause();
				}
				}
				setState(105); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SELECT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SchemaNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MySQLParser.ID, 0); }
		public SchemaNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitSchemaName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemaNameContext schemaName() throws RecognitionException {
		SchemaNameContext _localctx = new SchemaNameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_schemaName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectClauseContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(MySQLParser.SELECT, 0); }
		public ColumnListClauseContext columnListClause() {
			return getRuleContext(ColumnListClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public SelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitSelectClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectClauseContext selectClause() throws RecognitionException {
		SelectClauseContext _localctx = new SelectClauseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_selectClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(SELECT);
			setState(110);
			columnListClause();
			setState(112);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(111);
				fromClause();
				}
			}

			setState(115);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(114);
				whereClause();
				}
			}

			setState(118);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(117);
				groupByClause();
				}
			}

			setState(121);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(120);
				orderByClause();
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

	public static class AscDescContext extends ParserRuleContext {
		public TerminalNode ASC() { return getToken(MySQLParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(MySQLParser.DESC, 0); }
		public AscDescContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ascDesc; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitAscDesc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AscDescContext ascDesc() throws RecognitionException {
		AscDescContext _localctx = new AscDescContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ascDesc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_la = _input.LA(1);
			if ( !(_la==ASC || _la==DESC) ) {
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

	public static class GroupByClauseContext extends ParserRuleContext {
		public TerminalNode GROUP() { return getToken(MySQLParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(MySQLParser.BY, 0); }
		public List<GroupByItemContext> groupByItem() {
			return getRuleContexts(GroupByItemContext.class);
		}
		public GroupByItemContext groupByItem(int i) {
			return getRuleContext(GroupByItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLParser.COMMA, i);
		}
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitGroupByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_groupByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(GROUP);
			setState(126);
			match(BY);
			setState(128);
			_la = _input.LA(1);
			if (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & ((1L << (ASTERISK - 30)) | (1L << (ID - 30)) | (1L << (INT - 30)) | (1L << (STRING - 30)))) != 0)) {
				{
				setState(127);
				groupByItem();
				}
			}

			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(130);
				match(COMMA);
				setState(131);
				groupByItem();
				}
				}
				setState(136);
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

	public static class GroupByItemContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public GroupByItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByItem; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitGroupByItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByItemContext groupByItem() throws RecognitionException {
		GroupByItemContext _localctx = new GroupByItemContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_groupByItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			columnName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderByClauseContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(MySQLParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(MySQLParser.BY, 0); }
		public List<OrderByItemContext> orderByItem() {
			return getRuleContexts(OrderByItemContext.class);
		}
		public OrderByItemContext orderByItem(int i) {
			return getRuleContext(OrderByItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLParser.COMMA, i);
		}
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitOrderByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_orderByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(ORDER);
			setState(140);
			match(BY);
			setState(142);
			_la = _input.LA(1);
			if (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & ((1L << (ASTERISK - 30)) | (1L << (ID - 30)) | (1L << (INT - 30)) | (1L << (STRING - 30)))) != 0)) {
				{
				setState(141);
				orderByItem();
				}
			}

			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(144);
				match(COMMA);
				setState(145);
				orderByItem();
				}
				}
				setState(150);
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

	public static class OrderByItemContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public AscDescContext ascDesc() {
			return getRuleContext(AscDescContext.class,0);
		}
		public OrderByItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByItem; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitOrderByItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByItemContext orderByItem() throws RecognitionException {
		OrderByItemContext _localctx = new OrderByItemContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_orderByItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			columnName();
			setState(153);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(152);
				ascDesc();
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

	public static class TableNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MySQLParser.ID, 0); }
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableAliasContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MySQLParser.ID, 0); }
		public TableAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableAlias; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitTableAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableAliasContext tableAlias() throws RecognitionException {
		TableAliasContext _localctx = new TableAliasContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tableAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnNameContext extends ParserRuleContext {
		public TerminalNode ASTERISK() { return getToken(MySQLParser.ASTERISK, 0); }
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public TerminalNode DOT() { return getToken(MySQLParser.DOT, 0); }
		public TerminalNode ID() { return getToken(MySQLParser.ID, 0); }
		public TerminalNode INT() { return getToken(MySQLParser.INT, 0); }
		public TerminalNode STRING() { return getToken(MySQLParser.STRING, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitColumnName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_columnName);
		int _la;
		try {
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(159);
					tableAlias();
					setState(160);
					match(DOT);
					}
				}

				setState(164);
				match(ASTERISK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(165);
					tableAlias();
					setState(166);
					match(DOT);
					}
					break;
				}
				setState(170);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
				match(INT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(172);
				match(STRING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(173);
				function();
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MySQLParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(MySQLParser.LPAREN, 0); }
		public FunctionParameterContext functionParameter() {
			return getRuleContext(FunctionParameterContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MySQLParser.RPAREN, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(ID);
			setState(177);
			match(LPAREN);
			setState(178);
			functionParameter();
			setState(179);
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

	public static class FunctionParameterContext extends ParserRuleContext {
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLParser.COMMA, i);
		}
		public FunctionParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitFunctionParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParameterContext functionParameter() throws RecognitionException {
		FunctionParameterContext _localctx = new FunctionParameterContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			columnName();
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(182);
				match(COMMA);
				setState(183);
				columnName();
				}
				}
				setState(188);
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

	public static class ColumnNameAliasContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MySQLParser.ID, 0); }
		public ColumnNameAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNameAlias; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitColumnNameAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNameAliasContext columnNameAlias() throws RecognitionException {
		ColumnNameAliasContext _localctx = new ColumnNameAliasContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_columnNameAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MySQLParser.ID, 0); }
		public IndexNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitIndexName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexNameContext indexName() throws RecognitionException {
		IndexNameContext _localctx = new IndexNameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_indexName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnListContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(MySQLParser.LPAREN, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(MySQLParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MySQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLParser.COMMA, i);
		}
		public ColumnListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitColumnList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnListContext columnList() throws RecognitionException {
		ColumnListContext _localctx = new ColumnListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_columnList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(LPAREN);
			setState(194);
			columnName();
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(195);
				match(COMMA);
				setState(196);
				columnName();
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(202);
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

	public static class ColumnListClauseContext extends ParserRuleContext {
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLParser.COMMA, i);
		}
		public ColumnListClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnListClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitColumnListClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnListClauseContext columnListClause() throws RecognitionException {
		ColumnListClauseContext _localctx = new ColumnListClauseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_columnListClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			columnName();
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(205);
				match(COMMA);
				setState(206);
				columnName();
				}
				}
				setState(211);
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

	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(MySQLParser.FROM, 0); }
		public TableReferencesContext tableReferences() {
			return getRuleContext(TableReferencesContext.class,0);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_fromClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(FROM);
			setState(213);
			tableReferences();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectKeyContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(MySQLParser.SELECT, 0); }
		public SelectKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectKey; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitSelectKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectKeyContext selectKey() throws RecognitionException {
		SelectKeyContext _localctx = new SelectKeyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_selectKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(SELECT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(MySQLParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(WHERE);
			setState(218);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public List<SimpleExpressionContext> simpleExpression() {
			return getRuleContexts(SimpleExpressionContext.class);
		}
		public SimpleExpressionContext simpleExpression(int i) {
			return getRuleContext(SimpleExpressionContext.class,i);
		}
		public List<ExprOpContext> exprOp() {
			return getRuleContexts(ExprOpContext.class);
		}
		public ExprOpContext exprOp(int i) {
			return getRuleContext(ExprOpContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			simpleExpression();
			setState(226);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(221);
					exprOp();
					setState(222);
					simpleExpression();
					}
					} 
				}
				setState(228);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class ElementContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode INT() { return getToken(MySQLParser.INT, 0); }
		public TerminalNode STRING() { return getToken(MySQLParser.STRING, 0); }
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_element);
		try {
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				columnName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				match(INT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(231);
				match(STRING);
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

	public static class RightElementContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public RightElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightElement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitRightElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RightElementContext rightElement() throws RecognitionException {
		RightElementContext _localctx = new RightElementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_rightElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			element();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeftElementContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public LeftElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftElement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitLeftElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeftElementContext leftElement() throws RecognitionException {
		LeftElementContext _localctx = new LeftElementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_leftElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			element();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TargetElementContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public TargetElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_targetElement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitTargetElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TargetElementContext targetElement() throws RecognitionException {
		TargetElementContext _localctx = new TargetElementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_targetElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			element();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationalOpContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(MySQLParser.EQ, 0); }
		public TerminalNode LTH() { return getToken(MySQLParser.LTH, 0); }
		public TerminalNode GTH() { return getToken(MySQLParser.GTH, 0); }
		public TerminalNode NOT_EQ() { return getToken(MySQLParser.NOT_EQ, 0); }
		public TerminalNode LET() { return getToken(MySQLParser.LET, 0); }
		public TerminalNode GET() { return getToken(MySQLParser.GET, 0); }
		public RelationalOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitRelationalOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalOpContext relationalOp() throws RecognitionException {
		RelationalOpContext _localctx = new RelationalOpContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_relationalOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << LTH) | (1L << GTH) | (1L << NOT_EQ) | (1L << LET) | (1L << GET))) != 0)) ) {
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

	public static class ExprOpContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(MySQLParser.AND, 0); }
		public TerminalNode XOR() { return getToken(MySQLParser.XOR, 0); }
		public TerminalNode OR() { return getToken(MySQLParser.OR, 0); }
		public TerminalNode NOT() { return getToken(MySQLParser.NOT, 0); }
		public ExprOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitExprOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprOpContext exprOp() throws RecognitionException {
		ExprOpContext _localctx = new ExprOpContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_exprOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << XOR) | (1L << NOT))) != 0)) ) {
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

	public static class BetweenOpContext extends ParserRuleContext {
		public TerminalNode BETWEEN() { return getToken(MySQLParser.BETWEEN, 0); }
		public BetweenOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_betweenOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitBetweenOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BetweenOpContext betweenOp() throws RecognitionException {
		BetweenOpContext _localctx = new BetweenOpContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_betweenOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(BETWEEN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IsOrIsNotContext extends ParserRuleContext {
		public TerminalNode IS() { return getToken(MySQLParser.IS, 0); }
		public TerminalNode NOT() { return getToken(MySQLParser.NOT, 0); }
		public IsOrIsNotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isOrIsNot; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitIsOrIsNot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsOrIsNotContext isOrIsNot() throws RecognitionException {
		IsOrIsNotContext _localctx = new IsOrIsNotContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_isOrIsNot);
		try {
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				match(IS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				match(IS);
				setState(248);
				match(NOT);
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

	public static class SimpleExpressionContext extends ParserRuleContext {
		public LeftElementContext leftElement() {
			return getRuleContext(LeftElementContext.class,0);
		}
		public RelationalOpContext relationalOp() {
			return getRuleContext(RelationalOpContext.class,0);
		}
		public RightElementContext rightElement() {
			return getRuleContext(RightElementContext.class,0);
		}
		public TargetElementContext targetElement() {
			return getRuleContext(TargetElementContext.class,0);
		}
		public BetweenOpContext betweenOp() {
			return getRuleContext(BetweenOpContext.class,0);
		}
		public TerminalNode AND() { return getToken(MySQLParser.AND, 0); }
		public IsOrIsNotContext isOrIsNot() {
			return getRuleContext(IsOrIsNotContext.class,0);
		}
		public TerminalNode NULL() { return getToken(MySQLParser.NULL, 0); }
		public ExistsContext exists() {
			return getRuleContext(ExistsContext.class,0);
		}
		public NotExistsContext notExists() {
			return getRuleContext(NotExistsContext.class,0);
		}
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public TerminalNode IN() { return getToken(MySQLParser.IN, 0); }
		public InClauseContext inClause() {
			return getRuleContext(InClauseContext.class,0);
		}
		public InSubqueryContext inSubquery() {
			return getRuleContext(InSubqueryContext.class,0);
		}
		public SimpleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitSimpleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleExpressionContext simpleExpression() throws RecognitionException {
		SimpleExpressionContext _localctx = new SimpleExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_simpleExpression);
		try {
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				leftElement();
				setState(252);
				relationalOp();
				setState(253);
				rightElement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				targetElement();
				setState(256);
				betweenOp();
				setState(257);
				leftElement();
				setState(258);
				match(AND);
				setState(259);
				rightElement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(261);
				targetElement();
				setState(262);
				isOrIsNot();
				setState(263);
				match(NULL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(265);
				exists();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(266);
				notExists();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(267);
				element();
				setState(268);
				match(IN);
				setState(269);
				inClause();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(271);
				inSubquery();
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

	public static class InSubqueryContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public TerminalNode IN() { return getToken(MySQLParser.IN, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public InSubqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inSubquery; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitInSubquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InSubqueryContext inSubquery() throws RecognitionException {
		InSubqueryContext _localctx = new InSubqueryContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_inSubquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			element();
			setState(275);
			match(IN);
			setState(276);
			subquery();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExistsContext extends ParserRuleContext {
		public TerminalNode EXISTS() { return getToken(MySQLParser.EXISTS, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public ExistsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exists; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitExists(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExistsContext exists() throws RecognitionException {
		ExistsContext _localctx = new ExistsContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_exists);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(EXISTS);
			setState(279);
			subquery();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotExistsContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(MySQLParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(MySQLParser.EXISTS, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public NotExistsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notExists; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitNotExists(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotExistsContext notExists() throws RecognitionException {
		NotExistsContext _localctx = new NotExistsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_notExists);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(NOT);
			setState(282);
			match(EXISTS);
			setState(283);
			subquery();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InClauseContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(MySQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MySQLParser.RPAREN, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<TerminalNode> INT() { return getTokens(MySQLParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(MySQLParser.INT, i);
		}
		public List<TerminalNode> STRING() { return getTokens(MySQLParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(MySQLParser.STRING, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLParser.COMMA, i);
		}
		public InClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitInClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InClauseContext inClause() throws RecognitionException {
		InClauseContext _localctx = new InClauseContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_inClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(LPAREN);
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(286);
				element();
				}
				break;
			case 2:
				{
				setState(287);
				match(INT);
				}
				break;
			case 3:
				{
				setState(288);
				match(STRING);
				}
				break;
			}
			setState(295); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(295);
				switch (_input.LA(1)) {
				case COMMA:
					{
					setState(291);
					match(COMMA);
					setState(292);
					element();
					}
					break;
				case INT:
					{
					setState(293);
					match(INT);
					}
					break;
				case STRING:
					{
					setState(294);
					match(STRING);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(297); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (COMMA - 44)) | (1L << (INT - 44)) | (1L << (STRING - 44)))) != 0) );
			setState(299);
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

	public static class TableReferencesContext extends ParserRuleContext {
		public List<TableReferenceContext> tableReference() {
			return getRuleContexts(TableReferenceContext.class);
		}
		public TableReferenceContext tableReference(int i) {
			return getRuleContext(TableReferenceContext.class,i);
		}
		public List<JoinClauseContext> joinClause() {
			return getRuleContexts(JoinClauseContext.class);
		}
		public JoinClauseContext joinClause(int i) {
			return getRuleContext(JoinClauseContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLParser.COMMA, i);
		}
		public TableReferencesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableReferences; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitTableReferences(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableReferencesContext tableReferences() throws RecognitionException {
		TableReferencesContext _localctx = new TableReferencesContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_tableReferences);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			tableReference();
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (COMMA - 44)) | (1L << (INNER - 44)) | (1L << (JOIN - 44)) | (1L << (CROSS - 44)) | (1L << (NATURAL - 44)) | (1L << (LEFT - 44)) | (1L << (RIGHT - 44)) | (1L << (STRAIGHTJOIN - 44)))) != 0)) {
				{
				setState(305);
				switch (_input.LA(1)) {
				case COMMA:
					{
					{
					setState(302);
					match(COMMA);
					setState(303);
					tableReference();
					}
					}
					break;
				case INNER:
				case JOIN:
				case CROSS:
				case NATURAL:
				case LEFT:
				case RIGHT:
				case STRAIGHTJOIN:
					{
					setState(304);
					joinClause();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(309);
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

	public static class TableReferenceContext extends ParserRuleContext {
		public TableAtomContext tableAtom() {
			return getRuleContext(TableAtomContext.class,0);
		}
		public TableReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableReference; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitTableReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableReferenceContext tableReference() throws RecognitionException {
		TableReferenceContext _localctx = new TableReferenceContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_tableReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			tableAtom();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableFactor4Context extends ParserRuleContext {
		public List<TableAtomContext> tableAtom() {
			return getRuleContexts(TableAtomContext.class);
		}
		public TableAtomContext tableAtom(int i) {
			return getRuleContext(TableAtomContext.class,i);
		}
		public TerminalNode NATURAL() { return getToken(MySQLParser.NATURAL, 0); }
		public TerminalNode JOIN() { return getToken(MySQLParser.JOIN, 0); }
		public TerminalNode LEFT() { return getToken(MySQLParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(MySQLParser.RIGHT, 0); }
		public TerminalNode OUTER() { return getToken(MySQLParser.OUTER, 0); }
		public TableFactor4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableFactor4; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitTableFactor4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableFactor4Context tableFactor4() throws RecognitionException {
		TableFactor4Context _localctx = new TableFactor4Context(_ctx, getState());
		enterRule(_localctx, 72, RULE_tableFactor4);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			tableAtom();
			setState(322);
			_la = _input.LA(1);
			if (_la==NATURAL) {
				{
				setState(313);
				match(NATURAL);
				setState(318);
				_la = _input.LA(1);
				if (_la==LEFT || _la==RIGHT) {
					{
					setState(314);
					_la = _input.LA(1);
					if ( !(_la==LEFT || _la==RIGHT) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(316);
					_la = _input.LA(1);
					if (_la==OUTER) {
						{
						setState(315);
						match(OUTER);
						}
					}

					}
				}

				setState(320);
				match(JOIN);
				setState(321);
				tableAtom();
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

	public static class LeftjoinTableAtomContext extends ParserRuleContext {
		public TableAtomContext tableAtom() {
			return getRuleContext(TableAtomContext.class,0);
		}
		public LeftjoinTableAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftjoinTableAtom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitLeftjoinTableAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeftjoinTableAtomContext leftjoinTableAtom() throws RecognitionException {
		LeftjoinTableAtomContext _localctx = new LeftjoinTableAtomContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_leftjoinTableAtom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			tableAtom();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableAtomContext extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public IndexHintListContext indexHintList() {
			return getRuleContext(IndexHintListContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public SubqueryAliasContext subqueryAlias() {
			return getRuleContext(SubqueryAliasContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(MySQLParser.LPAREN, 0); }
		public TableReferencesContext tableReferences() {
			return getRuleContext(TableReferencesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MySQLParser.RPAREN, 0); }
		public TerminalNode OJ() { return getToken(MySQLParser.OJ, 0); }
		public List<TableReferenceContext> tableReference() {
			return getRuleContexts(TableReferenceContext.class);
		}
		public TableReferenceContext tableReference(int i) {
			return getRuleContext(TableReferenceContext.class,i);
		}
		public TerminalNode LEFT() { return getToken(MySQLParser.LEFT, 0); }
		public TerminalNode OUTER() { return getToken(MySQLParser.OUTER, 0); }
		public TerminalNode JOIN() { return getToken(MySQLParser.JOIN, 0); }
		public TerminalNode ON() { return getToken(MySQLParser.ON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TableAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableAtom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitTableAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableAtomContext tableAtom() throws RecognitionException {
		TableAtomContext _localctx = new TableAtomContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_tableAtom);
		int _la;
		try {
			setState(352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(326);
				tableName();
				setState(328);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(327);
					partitionClause();
					}
				}

				setState(331);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(330);
					tableAlias();
					}
				}

				setState(334);
				_la = _input.LA(1);
				if (_la==USE || _la==IGNORE) {
					{
					setState(333);
					indexHintList();
					}
				}

				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(336);
				subquery();
				setState(337);
				subqueryAlias();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(339);
				match(LPAREN);
				setState(340);
				tableReferences();
				setState(341);
				match(RPAREN);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(343);
				match(OJ);
				setState(344);
				tableReference();
				setState(345);
				match(LEFT);
				setState(346);
				match(OUTER);
				setState(347);
				match(JOIN);
				setState(348);
				tableReference();
				setState(349);
				match(ON);
				setState(350);
				expression();
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

	public static class JoinClauseContext extends ParserRuleContext {
		public TerminalNode JOIN() { return getToken(MySQLParser.JOIN, 0); }
		public TableAtomContext tableAtom() {
			return getRuleContext(TableAtomContext.class,0);
		}
		public JoinConditionContext joinCondition() {
			return getRuleContext(JoinConditionContext.class,0);
		}
		public TerminalNode INNER() { return getToken(MySQLParser.INNER, 0); }
		public TerminalNode CROSS() { return getToken(MySQLParser.CROSS, 0); }
		public TerminalNode STRAIGHTJOIN() { return getToken(MySQLParser.STRAIGHTJOIN, 0); }
		public TerminalNode ON() { return getToken(MySQLParser.ON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LeftjoinTableAtomContext leftjoinTableAtom() {
			return getRuleContext(LeftjoinTableAtomContext.class,0);
		}
		public TerminalNode LEFT() { return getToken(MySQLParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(MySQLParser.RIGHT, 0); }
		public TerminalNode OUTER() { return getToken(MySQLParser.OUTER, 0); }
		public TerminalNode NATURAL() { return getToken(MySQLParser.NATURAL, 0); }
		public JoinClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitJoinClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinClauseContext joinClause() throws RecognitionException {
		JoinClauseContext _localctx = new JoinClauseContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_joinClause);
		int _la;
		try {
			setState(385);
			switch (_input.LA(1)) {
			case INNER:
			case JOIN:
			case CROSS:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(355);
				_la = _input.LA(1);
				if (_la==INNER || _la==CROSS) {
					{
					setState(354);
					_la = _input.LA(1);
					if ( !(_la==INNER || _la==CROSS) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(357);
				match(JOIN);
				setState(358);
				tableAtom();
				setState(360);
				_la = _input.LA(1);
				if (_la==USING || _la==ON) {
					{
					setState(359);
					joinCondition();
					}
				}

				}
				}
				break;
			case STRAIGHTJOIN:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(362);
				match(STRAIGHTJOIN);
				setState(363);
				tableAtom();
				setState(366);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(364);
					match(ON);
					setState(365);
					expression();
					}
				}

				}
				}
				break;
			case LEFT:
			case RIGHT:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(368);
				_la = _input.LA(1);
				if ( !(_la==LEFT || _la==RIGHT) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(370);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(369);
					match(OUTER);
					}
				}

				setState(372);
				match(JOIN);
				setState(373);
				leftjoinTableAtom();
				setState(374);
				joinCondition();
				}
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(376);
				match(NATURAL);
				setState(381);
				_la = _input.LA(1);
				if (_la==LEFT || _la==RIGHT) {
					{
					setState(377);
					_la = _input.LA(1);
					if ( !(_la==LEFT || _la==RIGHT) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(379);
					_la = _input.LA(1);
					if (_la==OUTER) {
						{
						setState(378);
						match(OUTER);
						}
					}

					}
				}

				setState(383);
				match(JOIN);
				setState(384);
				tableAtom();
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

	public static class JoinConditionContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(MySQLParser.ON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExprOpContext> exprOp() {
			return getRuleContexts(ExprOpContext.class);
		}
		public ExprOpContext exprOp(int i) {
			return getRuleContext(ExprOpContext.class,i);
		}
		public TerminalNode USING() { return getToken(MySQLParser.USING, 0); }
		public ColumnListContext columnList() {
			return getRuleContext(ColumnListContext.class,0);
		}
		public JoinConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinCondition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitJoinCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinConditionContext joinCondition() throws RecognitionException {
		JoinConditionContext _localctx = new JoinConditionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_joinCondition);
		int _la;
		try {
			setState(399);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(387);
				match(ON);
				setState(388);
				expression();
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << XOR) | (1L << NOT))) != 0)) {
					{
					{
					setState(389);
					exprOp();
					setState(390);
					expression();
					}
					}
					setState(396);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(397);
				match(USING);
				setState(398);
				columnList();
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

	public static class IndexHintListContext extends ParserRuleContext {
		public List<IndexHintContext> indexHint() {
			return getRuleContexts(IndexHintContext.class);
		}
		public IndexHintContext indexHint(int i) {
			return getRuleContext(IndexHintContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLParser.COMMA, i);
		}
		public IndexHintListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexHintList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitIndexHintList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexHintListContext indexHintList() throws RecognitionException {
		IndexHintListContext _localctx = new IndexHintListContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_indexHintList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			indexHint();
			setState(406);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(402);
					match(COMMA);
					setState(403);
					indexHint();
					}
					} 
				}
				setState(408);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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

	public static class IndexOptionsContext extends ParserRuleContext {
		public TerminalNode INDEX() { return getToken(MySQLParser.INDEX, 0); }
		public TerminalNode KEY() { return getToken(MySQLParser.KEY, 0); }
		public TerminalNode FOR() { return getToken(MySQLParser.FOR, 0); }
		public TerminalNode JOIN() { return getToken(MySQLParser.JOIN, 0); }
		public TerminalNode ORDER() { return getToken(MySQLParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(MySQLParser.BY, 0); }
		public TerminalNode GROUP() { return getToken(MySQLParser.GROUP, 0); }
		public IndexOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexOptions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitIndexOptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexOptionsContext indexOptions() throws RecognitionException {
		IndexOptionsContext _localctx = new IndexOptionsContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_indexOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			_la = _input.LA(1);
			if ( !(_la==INDEX || _la==KEY) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(418);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(410);
				match(FOR);
				setState(416);
				switch (_input.LA(1)) {
				case JOIN:
					{
					{
					setState(411);
					match(JOIN);
					}
					}
					break;
				case ORDER:
					{
					{
					setState(412);
					match(ORDER);
					setState(413);
					match(BY);
					}
					}
					break;
				case GROUP:
					{
					{
					setState(414);
					match(GROUP);
					setState(415);
					match(BY);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class IndexHintContext extends ParserRuleContext {
		public TerminalNode USE() { return getToken(MySQLParser.USE, 0); }
		public IndexOptionsContext indexOptions() {
			return getRuleContext(IndexOptionsContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(MySQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MySQLParser.RPAREN, 0); }
		public IndexListContext indexList() {
			return getRuleContext(IndexListContext.class,0);
		}
		public TerminalNode IGNORE() { return getToken(MySQLParser.IGNORE, 0); }
		public IndexHintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexHint; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitIndexHint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexHintContext indexHint() throws RecognitionException {
		IndexHintContext _localctx = new IndexHintContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_indexHint);
		int _la;
		try {
			setState(434);
			switch (_input.LA(1)) {
			case USE:
				enterOuterAlt(_localctx, 1);
				{
				setState(420);
				match(USE);
				setState(421);
				indexOptions();
				setState(422);
				match(LPAREN);
				setState(424);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(423);
					indexList();
					}
				}

				setState(426);
				match(RPAREN);
				}
				break;
			case IGNORE:
				enterOuterAlt(_localctx, 2);
				{
				setState(428);
				match(IGNORE);
				setState(429);
				indexOptions();
				setState(430);
				match(LPAREN);
				setState(431);
				indexList();
				setState(432);
				match(RPAREN);
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

	public static class IndexListContext extends ParserRuleContext {
		public List<IndexNameContext> indexName() {
			return getRuleContexts(IndexNameContext.class);
		}
		public IndexNameContext indexName(int i) {
			return getRuleContext(IndexNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLParser.COMMA, i);
		}
		public IndexListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitIndexList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexListContext indexList() throws RecognitionException {
		IndexListContext _localctx = new IndexListContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_indexList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			indexName();
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(437);
				match(COMMA);
				setState(438);
				indexName();
				}
				}
				setState(443);
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

	public static class PartitionClauseContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(MySQLParser.PARTITION, 0); }
		public TerminalNode LPAREN() { return getToken(MySQLParser.LPAREN, 0); }
		public PartitionNamesContext partitionNames() {
			return getRuleContext(PartitionNamesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MySQLParser.RPAREN, 0); }
		public PartitionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitPartitionClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionClauseContext partitionClause() throws RecognitionException {
		PartitionClauseContext _localctx = new PartitionClauseContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_partitionClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(PARTITION);
			setState(445);
			match(LPAREN);
			setState(446);
			partitionNames();
			setState(447);
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

	public static class PartitionNamesContext extends ParserRuleContext {
		public List<PartitionNameContext> partitionName() {
			return getRuleContexts(PartitionNameContext.class);
		}
		public PartitionNameContext partitionName(int i) {
			return getRuleContext(PartitionNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLParser.COMMA, i);
		}
		public PartitionNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionNames; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitPartitionNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionNamesContext partitionNames() throws RecognitionException {
		PartitionNamesContext _localctx = new PartitionNamesContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_partitionNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			partitionName();
			setState(454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(450);
				match(COMMA);
				setState(451);
				partitionName();
				}
				}
				setState(456);
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

	public static class PartitionNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MySQLParser.ID, 0); }
		public PartitionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitPartitionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionNameContext partitionName() throws RecognitionException {
		PartitionNameContext _localctx = new PartitionNameContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_partitionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubqueryAliasContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MySQLParser.ID, 0); }
		public SubqueryAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subqueryAlias; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitSubqueryAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubqueryAliasContext subqueryAlias() throws RecognitionException {
		SubqueryAliasContext _localctx = new SubqueryAliasContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_subqueryAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubqueryContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(MySQLParser.LPAREN, 0); }
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public SubqueryEndContext subqueryEnd() {
			return getRuleContext(SubqueryEndContext.class,0);
		}
		public SubqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubqueryContext subquery() throws RecognitionException {
		SubqueryContext _localctx = new SubqueryContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			match(LPAREN);
			setState(462);
			selectClause();
			setState(463);
			subqueryEnd();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubqueryEndContext extends ParserRuleContext {
		public TerminalNode RPAREN() { return getToken(MySQLParser.RPAREN, 0); }
		public SubqueryEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subqueryEnd; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitSubqueryEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubqueryEndContext subqueryEnd() throws RecognitionException {
		SubqueryEndContext _localctx = new SubqueryEndContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_subqueryEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3M\u01d6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\3\2\6\2j\n\2\r\2\16\2k\3\3\3\3\3\4\3\4\3\4\5\4s\n\4\3\4\5\4v\n\4\3"+
		"\4\5\4y\n\4\3\4\5\4|\n\4\3\5\3\5\3\6\3\6\3\6\5\6\u0083\n\6\3\6\3\6\7\6"+
		"\u0087\n\6\f\6\16\6\u008a\13\6\3\7\3\7\3\b\3\b\3\b\5\b\u0091\n\b\3\b\3"+
		"\b\7\b\u0095\n\b\f\b\16\b\u0098\13\b\3\t\3\t\5\t\u009c\n\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\f\5\f\u00a5\n\f\3\f\3\f\3\f\3\f\5\f\u00ab\n\f\3\f\3\f"+
		"\3\f\3\f\5\f\u00b1\n\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\7\16\u00bb\n"+
		"\16\f\16\16\16\u00be\13\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\7\21"+
		"\u00c8\n\21\f\21\16\21\u00cb\13\21\3\21\3\21\3\22\3\22\3\22\7\22\u00d2"+
		"\n\22\f\22\16\22\u00d5\13\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3"+
		"\26\3\26\3\26\3\26\7\26\u00e3\n\26\f\26\16\26\u00e6\13\26\3\27\3\27\3"+
		"\27\5\27\u00eb\n\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\36\5\36\u00fc\n\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\5\37\u0113\n\37\3 \3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3"+
		"#\5#\u0124\n#\3#\3#\3#\3#\6#\u012a\n#\r#\16#\u012b\3#\3#\3$\3$\3$\3$\7"+
		"$\u0134\n$\f$\16$\u0137\13$\3%\3%\3&\3&\3&\3&\5&\u013f\n&\5&\u0141\n&"+
		"\3&\3&\5&\u0145\n&\3\'\3\'\3(\3(\5(\u014b\n(\3(\5(\u014e\n(\3(\5(\u0151"+
		"\n(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u0163\n(\3)\5)"+
		"\u0166\n)\3)\3)\3)\5)\u016b\n)\3)\3)\3)\3)\5)\u0171\n)\3)\3)\5)\u0175"+
		"\n)\3)\3)\3)\3)\3)\3)\3)\5)\u017e\n)\5)\u0180\n)\3)\3)\5)\u0184\n)\3*"+
		"\3*\3*\3*\3*\7*\u018b\n*\f*\16*\u018e\13*\3*\3*\5*\u0192\n*\3+\3+\3+\7"+
		"+\u0197\n+\f+\16+\u019a\13+\3,\3,\3,\3,\3,\3,\3,\5,\u01a3\n,\5,\u01a5"+
		"\n,\3-\3-\3-\3-\5-\u01ab\n-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u01b5\n-\3.\3."+
		"\3.\7.\u01ba\n.\f.\16.\u01bd\13.\3/\3/\3/\3/\3/\3\60\3\60\3\60\7\60\u01c7"+
		"\n\60\f\60\16\60\u01ca\13\60\3\61\3\61\3\62\3\62\3\63\3\63\3\63\3\63\3"+
		"\64\3\64\3\64\2\2\65\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdf\2\b\3\2EF\4\2&)+,\4\2\6\b**\3\2AB\4"+
		"\2\61\61\64\64\3\2\66\67\u01e2\2i\3\2\2\2\4m\3\2\2\2\6o\3\2\2\2\b}\3\2"+
		"\2\2\n\177\3\2\2\2\f\u008b\3\2\2\2\16\u008d\3\2\2\2\20\u0099\3\2\2\2\22"+
		"\u009d\3\2\2\2\24\u009f\3\2\2\2\26\u00b0\3\2\2\2\30\u00b2\3\2\2\2\32\u00b7"+
		"\3\2\2\2\34\u00bf\3\2\2\2\36\u00c1\3\2\2\2 \u00c3\3\2\2\2\"\u00ce\3\2"+
		"\2\2$\u00d6\3\2\2\2&\u00d9\3\2\2\2(\u00db\3\2\2\2*\u00de\3\2\2\2,\u00ea"+
		"\3\2\2\2.\u00ec\3\2\2\2\60\u00ee\3\2\2\2\62\u00f0\3\2\2\2\64\u00f2\3\2"+
		"\2\2\66\u00f4\3\2\2\28\u00f6\3\2\2\2:\u00fb\3\2\2\2<\u0112\3\2\2\2>\u0114"+
		"\3\2\2\2@\u0118\3\2\2\2B\u011b\3\2\2\2D\u011f\3\2\2\2F\u012f\3\2\2\2H"+
		"\u0138\3\2\2\2J\u013a\3\2\2\2L\u0146\3\2\2\2N\u0162\3\2\2\2P\u0183\3\2"+
		"\2\2R\u0191\3\2\2\2T\u0193\3\2\2\2V\u019b\3\2\2\2X\u01b4\3\2\2\2Z\u01b6"+
		"\3\2\2\2\\\u01be\3\2\2\2^\u01c3\3\2\2\2`\u01cb\3\2\2\2b\u01cd\3\2\2\2"+
		"d\u01cf\3\2\2\2f\u01d3\3\2\2\2hj\5\6\4\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2"+
		"kl\3\2\2\2l\3\3\2\2\2mn\7G\2\2n\5\3\2\2\2op\7\3\2\2pr\5\"\22\2qs\5$\23"+
		"\2rq\3\2\2\2rs\3\2\2\2su\3\2\2\2tv\5(\25\2ut\3\2\2\2uv\3\2\2\2vx\3\2\2"+
		"\2wy\5\n\6\2xw\3\2\2\2xy\3\2\2\2y{\3\2\2\2z|\5\16\b\2{z\3\2\2\2{|\3\2"+
		"\2\2|\7\3\2\2\2}~\t\2\2\2~\t\3\2\2\2\177\u0080\79\2\2\u0080\u0082\7:\2"+
		"\2\u0081\u0083\5\f\7\2\u0082\u0081\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0088"+
		"\3\2\2\2\u0084\u0085\7.\2\2\u0085\u0087\5\f\7\2\u0086\u0084\3\2\2\2\u0087"+
		"\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\13\3\2\2"+
		"\2\u008a\u0088\3\2\2\2\u008b\u008c\5\26\f\2\u008c\r\3\2\2\2\u008d\u008e"+
		"\78\2\2\u008e\u0090\7:\2\2\u008f\u0091\5\20\t\2\u0090\u008f\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u0096\3\2\2\2\u0092\u0093\7.\2\2\u0093\u0095\5\20"+
		"\t\2\u0094\u0092\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\17\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009b\5\26\f"+
		"\2\u009a\u009c\5\b\5\2\u009b\u009a\3\2\2\2\u009b\u009c\3\2\2\2\u009c\21"+
		"\3\2\2\2\u009d\u009e\7G\2\2\u009e\23\3\2\2\2\u009f\u00a0\7G\2\2\u00a0"+
		"\25\3\2\2\2\u00a1\u00a2\5\24\13\2\u00a2\u00a3\7/\2\2\u00a3\u00a5\3\2\2"+
		"\2\u00a4\u00a1\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00b1"+
		"\7 \2\2\u00a7\u00a8\5\24\13\2\u00a8\u00a9\7/\2\2\u00a9\u00ab\3\2\2\2\u00aa"+
		"\u00a7\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00b1\7G"+
		"\2\2\u00ad\u00b1\7H\2\2\u00ae\u00b1\7I\2\2\u00af\u00b1\5\30\r\2\u00b0"+
		"\u00a4\3\2\2\2\u00b0\u00aa\3\2\2\2\u00b0\u00ad\3\2\2\2\u00b0\u00ae\3\2"+
		"\2\2\u00b0\u00af\3\2\2\2\u00b1\27\3\2\2\2\u00b2\u00b3\7G\2\2\u00b3\u00b4"+
		"\7\"\2\2\u00b4\u00b5\5\32\16\2\u00b5\u00b6\7!\2\2\u00b6\31\3\2\2\2\u00b7"+
		"\u00bc\5\26\f\2\u00b8\u00b9\7.\2\2\u00b9\u00bb\5\26\f\2\u00ba\u00b8\3"+
		"\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\33\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c0\7G\2\2\u00c0\35\3\2\2\2\u00c1"+
		"\u00c2\7G\2\2\u00c2\37\3\2\2\2\u00c3\u00c4\7\"\2\2\u00c4\u00c9\5\26\f"+
		"\2\u00c5\u00c6\7.\2\2\u00c6\u00c8\5\26\f\2\u00c7\u00c5\3\2\2\2\u00c8\u00cb"+
		"\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb"+
		"\u00c9\3\2\2\2\u00cc\u00cd\7!\2\2\u00cd!\3\2\2\2\u00ce\u00d3\5\26\f\2"+
		"\u00cf\u00d0\7.\2\2\u00d0\u00d2\5\26\f\2\u00d1\u00cf\3\2\2\2\u00d2\u00d5"+
		"\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4#\3\2\2\2\u00d5"+
		"\u00d3\3\2\2\2\u00d6\u00d7\7\4\2\2\u00d7\u00d8\5F$\2\u00d8%\3\2\2\2\u00d9"+
		"\u00da\7\3\2\2\u00da\'\3\2\2\2\u00db\u00dc\7\5\2\2\u00dc\u00dd\5*\26\2"+
		"\u00dd)\3\2\2\2\u00de\u00e4\5<\37\2\u00df\u00e0\5\66\34\2\u00e0\u00e1"+
		"\5<\37\2\u00e1\u00e3\3\2\2\2\u00e2\u00df\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4"+
		"\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5+\3\2\2\2\u00e6\u00e4\3\2\2\2"+
		"\u00e7\u00eb\5\26\f\2\u00e8\u00eb\7H\2\2\u00e9\u00eb\7I\2\2\u00ea\u00e7"+
		"\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb-\3\2\2\2\u00ec"+
		"\u00ed\5,\27\2\u00ed/\3\2\2\2\u00ee\u00ef\5,\27\2\u00ef\61\3\2\2\2\u00f0"+
		"\u00f1\5,\27\2\u00f1\63\3\2\2\2\u00f2\u00f3\t\3\2\2\u00f3\65\3\2\2\2\u00f4"+
		"\u00f5\t\4\2\2\u00f5\67\3\2\2\2\u00f6\u00f7\7\24\2\2\u00f79\3\2\2\2\u00f8"+
		"\u00fc\7\t\2\2\u00f9\u00fa\7\t\2\2\u00fa\u00fc\7*\2\2\u00fb\u00f8\3\2"+
		"\2\2\u00fb\u00f9\3\2\2\2\u00fc;\3\2\2\2\u00fd\u00fe\5\60\31\2\u00fe\u00ff"+
		"\5\64\33\2\u00ff\u0100\5.\30\2\u0100\u0113\3\2\2\2\u0101\u0102\5\62\32"+
		"\2\u0102\u0103\58\35\2\u0103\u0104\5\60\31\2\u0104\u0105\7\6\2\2\u0105"+
		"\u0106\5.\30\2\u0106\u0113\3\2\2\2\u0107\u0108\5\62\32\2\u0108\u0109\5"+
		":\36\2\u0109\u010a\7\n\2\2\u010a\u0113\3\2\2\2\u010b\u0113\5@!\2\u010c"+
		"\u0113\5B\"\2\u010d\u010e\5,\27\2\u010e\u010f\7\f\2\2\u010f\u0110\5D#"+
		"\2\u0110\u0113\3\2\2\2\u0111\u0113\5> \2\u0112\u00fd\3\2\2\2\u0112\u0101"+
		"\3\2\2\2\u0112\u0107\3\2\2\2\u0112\u010b\3\2\2\2\u0112\u010c\3\2\2\2\u0112"+
		"\u010d\3\2\2\2\u0112\u0111\3\2\2\2\u0113=\3\2\2\2\u0114\u0115\5,\27\2"+
		"\u0115\u0116\7\f\2\2\u0116\u0117\5d\63\2\u0117?\3\2\2\2\u0118\u0119\7"+
		"\r\2\2\u0119\u011a\5d\63\2\u011aA\3\2\2\2\u011b\u011c\7*\2\2\u011c\u011d"+
		"\7\r\2\2\u011d\u011e\5d\63\2\u011eC\3\2\2\2\u011f\u0123\7\"\2\2\u0120"+
		"\u0124\5,\27\2\u0121\u0124\7H\2\2\u0122\u0124\7I\2\2\u0123\u0120\3\2\2"+
		"\2\u0123\u0121\3\2\2\2\u0123\u0122\3\2\2\2\u0124\u0129\3\2\2\2\u0125\u0126"+
		"\7.\2\2\u0126\u012a\5,\27\2\u0127\u012a\7H\2\2\u0128\u012a\7I\2\2\u0129"+
		"\u0125\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u0128\3\2\2\2\u012a\u012b\3\2"+
		"\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\3\2\2\2\u012d"+
		"\u012e\7!\2\2\u012eE\3\2\2\2\u012f\u0135\5H%\2\u0130\u0131\7.\2\2\u0131"+
		"\u0134\5H%\2\u0132\u0134\5P)\2\u0133\u0130\3\2\2\2\u0133\u0132\3\2\2\2"+
		"\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136G\3"+
		"\2\2\2\u0137\u0135\3\2\2\2\u0138\u0139\5N(\2\u0139I\3\2\2\2\u013a\u0144"+
		"\5N(\2\u013b\u0140\7@\2\2\u013c\u013e\t\5\2\2\u013d\u013f\7\62\2\2\u013e"+
		"\u013d\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0141\3\2\2\2\u0140\u013c\3\2"+
		"\2\2\u0140\u0141\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0143\7\63\2\2\u0143"+
		"\u0145\5N(\2\u0144\u013b\3\2\2\2\u0144\u0145\3\2\2\2\u0145K\3\2\2\2\u0146"+
		"\u0147\5N(\2\u0147M\3\2\2\2\u0148\u014a\5\22\n\2\u0149\u014b\5\\/\2\u014a"+
		"\u0149\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014d\3\2\2\2\u014c\u014e\5\24"+
		"\13\2\u014d\u014c\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0150\3\2\2\2\u014f"+
		"\u0151\5T+\2\u0150\u014f\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0163\3\2\2"+
		"\2\u0152\u0153\5d\63\2\u0153\u0154\5b\62\2\u0154\u0163\3\2\2\2\u0155\u0156"+
		"\7\"\2\2\u0156\u0157\5F$\2\u0157\u0158\7!\2\2\u0158\u0163\3\2\2\2\u0159"+
		"\u015a\7C\2\2\u015a\u015b\5H%\2\u015b\u015c\7A\2\2\u015c\u015d\7\62\2"+
		"\2\u015d\u015e\7\63\2\2\u015e\u015f\5H%\2\u015f\u0160\7D\2\2\u0160\u0161"+
		"\5*\26\2\u0161\u0163\3\2\2\2\u0162\u0148\3\2\2\2\u0162\u0152\3\2\2\2\u0162"+
		"\u0155\3\2\2\2\u0162\u0159\3\2\2\2\u0163O\3\2\2\2\u0164\u0166\t\6\2\2"+
		"\u0165\u0164\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0168"+
		"\7\63\2\2\u0168\u016a\5N(\2\u0169\u016b\5R*\2\u016a\u0169\3\2\2\2\u016a"+
		"\u016b\3\2\2\2\u016b\u0184\3\2\2\2\u016c\u016d\7M\2\2\u016d\u0170\5N("+
		"\2\u016e\u016f\7D\2\2\u016f\u0171\5*\26\2\u0170\u016e\3\2\2\2\u0170\u0171"+
		"\3\2\2\2\u0171\u0184\3\2\2\2\u0172\u0174\t\5\2\2\u0173\u0175\7\62\2\2"+
		"\u0174\u0173\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177"+
		"\7\63\2\2\u0177\u0178\5L\'\2\u0178\u0179\5R*\2\u0179\u0184\3\2\2\2\u017a"+
		"\u017f\7@\2\2\u017b\u017d\t\5\2\2\u017c\u017e\7\62\2\2\u017d\u017c\3\2"+
		"\2\2\u017d\u017e\3\2\2\2\u017e\u0180\3\2\2\2\u017f\u017b\3\2\2\2\u017f"+
		"\u0180\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182\7\63\2\2\u0182\u0184\5"+
		"N(\2\u0183\u0165\3\2\2\2\u0183\u016c\3\2\2\2\u0183\u0172\3\2\2\2\u0183"+
		"\u017a\3\2\2\2\u0184Q\3\2\2\2\u0185\u0186\7D\2\2\u0186\u018c\5*\26\2\u0187"+
		"\u0188\5\66\34\2\u0188\u0189\5*\26\2\u0189\u018b\3\2\2\2\u018a\u0187\3"+
		"\2\2\2\u018b\u018e\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d"+
		"\u0192\3\2\2\2\u018e\u018c\3\2\2\2\u018f\u0190\7\65\2\2\u0190\u0192\5"+
		" \21\2\u0191\u0185\3\2\2\2\u0191\u018f\3\2\2\2\u0192S\3\2\2\2\u0193\u0198"+
		"\5X-\2\u0194\u0195\7.\2\2\u0195\u0197\5X-\2\u0196\u0194\3\2\2\2\u0197"+
		"\u019a\3\2\2\2\u0198\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199U\3\2\2\2"+
		"\u019a\u0198\3\2\2\2\u019b\u01a4\t\7\2\2\u019c\u01a2\7;\2\2\u019d\u01a3"+
		"\7\63\2\2\u019e\u019f\78\2\2\u019f\u01a3\7:\2\2\u01a0\u01a1\79\2\2\u01a1"+
		"\u01a3\7:\2\2\u01a2\u019d\3\2\2\2\u01a2\u019e\3\2\2\2\u01a2\u01a0\3\2"+
		"\2\2\u01a3\u01a5\3\2\2\2\u01a4\u019c\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5"+
		"W\3\2\2\2\u01a6\u01a7\7<\2\2\u01a7\u01a8\5V,\2\u01a8\u01aa\7\"\2\2\u01a9"+
		"\u01ab\5Z.\2\u01aa\u01a9\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ac\3\2\2"+
		"\2\u01ac\u01ad\7!\2\2\u01ad\u01b5\3\2\2\2\u01ae\u01af\7=\2\2\u01af\u01b0"+
		"\5V,\2\u01b0\u01b1\7\"\2\2\u01b1\u01b2\5Z.\2\u01b2\u01b3\7!\2\2\u01b3"+
		"\u01b5\3\2\2\2\u01b4\u01a6\3\2\2\2\u01b4\u01ae\3\2\2\2\u01b5Y\3\2\2\2"+
		"\u01b6\u01bb\5\36\20\2\u01b7\u01b8\7.\2\2\u01b8\u01ba\5\36\20\2\u01b9"+
		"\u01b7\3\2\2\2\u01ba\u01bd\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01bc\3\2"+
		"\2\2\u01bc[\3\2\2\2\u01bd\u01bb\3\2\2\2\u01be\u01bf\7>\2\2\u01bf\u01c0"+
		"\7\"\2\2\u01c0\u01c1\5^\60\2\u01c1\u01c2\7!\2\2\u01c2]\3\2\2\2\u01c3\u01c8"+
		"\5`\61\2\u01c4\u01c5\7.\2\2\u01c5\u01c7\5`\61\2\u01c6\u01c4\3\2\2\2\u01c7"+
		"\u01ca\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9_\3\2\2\2"+
		"\u01ca\u01c8\3\2\2\2\u01cb\u01cc\7G\2\2\u01cca\3\2\2\2\u01cd\u01ce\7G"+
		"\2\2\u01cec\3\2\2\2\u01cf\u01d0\7\"\2\2\u01d0\u01d1\5\6\4\2\u01d1\u01d2"+
		"\5f\64\2\u01d2e\3\2\2\2\u01d3\u01d4\7!\2\2\u01d4g\3\2\2\2\62krux{\u0082"+
		"\u0088\u0090\u0096\u009b\u00a4\u00aa\u00b0\u00bc\u00c9\u00d3\u00e4\u00ea"+
		"\u00fb\u0112\u0123\u0129\u012b\u0133\u0135\u013e\u0140\u0144\u014a\u014d"+
		"\u0150\u0162\u0165\u016a\u0170\u0174\u017d\u017f\u0183\u018c\u0191\u0198"+
		"\u01a2\u01a4\u01aa\u01b4\u01bb\u01c8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}