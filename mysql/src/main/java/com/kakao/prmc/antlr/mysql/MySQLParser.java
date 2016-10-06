// Generated from MySQLParser.g4 by ANTLR 4.5.3
package com.kakao.prmc.antlr.mysql;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

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
		RULE_simpleExpression = 29, RULE_inClause = 30, RULE_tableReferences = 31, 
		RULE_tableReference = 32, RULE_tableFactor4 = 33, RULE_leftjoinTableAtom = 34, 
		RULE_tableAtom = 35, RULE_joinClause = 36, RULE_joinCondition = 37, RULE_indexHintList = 38, 
		RULE_indexOptions = 39, RULE_indexHint = 40, RULE_indexList = 41, RULE_partitionClause = 42, 
		RULE_partitionNames = 43, RULE_partitionName = 44, RULE_subqueryAlias = 45, 
		RULE_subquery = 46;
	public static final String[] ruleNames = {
		"stat", "schemaName", "selectClause", "ascDesc", "groupByClause", "groupByItem", 
		"orderByClause", "orderByItem", "tableName", "tableAlias", "columnName", 
		"function", "functionParameter", "columnNameAlias", "indexName", "columnList", 
		"columnListClause", "fromClause", "selectKey", "whereClause", "expression", 
		"element", "rightElement", "leftElement", "targetElement", "relationalOp", 
		"exprOp", "betweenOp", "isOrIsNot", "simpleExpression", "inClause", "tableReferences", 
		"tableReference", "tableFactor4", "leftjoinTableAtom", "tableAtom", "joinClause", 
		"joinCondition", "indexHintList", "indexOptions", "indexHint", "indexList", 
		"partitionClause", "partitionNames", "partitionName", "subqueryAlias", 
		"subquery"
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitStat(this);
		}
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
			setState(95); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(94);
				selectClause();
				}
				}
				setState(97); 
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterSchemaName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitSchemaName(this);
		}
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
			setState(99);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterSelectClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitSelectClause(this);
		}
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
			setState(101);
			match(SELECT);
			setState(102);
			columnListClause();
			setState(104);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(103);
				fromClause();
				}
			}

			setState(107);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(106);
				whereClause();
				}
			}

			setState(110);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(109);
				groupByClause();
				}
			}

			setState(113);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(112);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterAscDesc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitAscDesc(this);
		}
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
			setState(115);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterGroupByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitGroupByClause(this);
		}
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
			setState(117);
			match(GROUP);
			setState(118);
			match(BY);
			setState(120);
			_la = _input.LA(1);
			if (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & ((1L << (ASTERISK - 30)) | (1L << (ID - 30)) | (1L << (INT - 30)) | (1L << (STRING - 30)))) != 0)) {
				{
				setState(119);
				groupByItem();
				}
			}

			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(122);
				match(COMMA);
				setState(123);
				groupByItem();
				}
				}
				setState(128);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterGroupByItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitGroupByItem(this);
		}
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
			setState(129);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterOrderByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitOrderByClause(this);
		}
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
			setState(131);
			match(ORDER);
			setState(132);
			match(BY);
			setState(134);
			_la = _input.LA(1);
			if (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & ((1L << (ASTERISK - 30)) | (1L << (ID - 30)) | (1L << (INT - 30)) | (1L << (STRING - 30)))) != 0)) {
				{
				setState(133);
				orderByItem();
				}
			}

			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(136);
				match(COMMA);
				setState(137);
				orderByItem();
				}
				}
				setState(142);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterOrderByItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitOrderByItem(this);
		}
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
			setState(143);
			columnName();
			setState(145);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(144);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitTableName(this);
		}
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
			setState(147);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterTableAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitTableAlias(this);
		}
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
			setState(149);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterColumnName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitColumnName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitColumnName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_columnName);
		try {
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(ASTERISK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				tableAlias();
				setState(153);
				match(DOT);
				setState(154);
				match(ASTERISK);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(156);
					tableAlias();
					setState(157);
					match(DOT);
					}
					break;
				}
				setState(161);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(162);
				match(INT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(163);
				match(STRING);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(164);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitFunction(this);
		}
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
			setState(167);
			match(ID);
			setState(168);
			match(LPAREN);
			setState(169);
			functionParameter();
			setState(170);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterFunctionParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitFunctionParameter(this);
		}
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
			setState(172);
			columnName();
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(173);
				match(COMMA);
				setState(174);
				columnName();
				}
				}
				setState(179);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterColumnNameAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitColumnNameAlias(this);
		}
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
			setState(180);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterIndexName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitIndexName(this);
		}
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
			setState(182);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterColumnList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitColumnList(this);
		}
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
			setState(184);
			match(LPAREN);
			setState(185);
			columnName();
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(186);
				match(COMMA);
				setState(187);
				columnName();
				}
				}
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(193);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterColumnListClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitColumnListClause(this);
		}
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
			setState(195);
			columnName();
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(196);
				match(COMMA);
				setState(197);
				columnName();
				}
				}
				setState(202);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterFromClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitFromClause(this);
		}
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
			setState(203);
			match(FROM);
			setState(204);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterSelectKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitSelectKey(this);
		}
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
			setState(206);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitWhereClause(this);
		}
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
			setState(208);
			match(WHERE);
			setState(209);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitExpression(this);
		}
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
			setState(211);
			simpleExpression();
			setState(217);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(212);
					exprOp();
					setState(213);
					simpleExpression();
					}
					} 
				}
				setState(219);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitElement(this);
		}
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
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				columnName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				match(INT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(222);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterRightElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitRightElement(this);
		}
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
			setState(225);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterLeftElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitLeftElement(this);
		}
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
			setState(227);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterTargetElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitTargetElement(this);
		}
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
			setState(229);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterRelationalOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitRelationalOp(this);
		}
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
			setState(231);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterExprOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitExprOp(this);
		}
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
			setState(233);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterBetweenOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitBetweenOp(this);
		}
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
			setState(235);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterIsOrIsNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitIsOrIsNot(this);
		}
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
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				match(IS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				match(IS);
				setState(239);
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
		public TerminalNode EXISTS() { return getToken(MySQLParser.EXISTS, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode NOT() { return getToken(MySQLParser.NOT, 0); }
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public TerminalNode IN() { return getToken(MySQLParser.IN, 0); }
		public InClauseContext inClause() {
			return getRuleContext(InClauseContext.class,0);
		}
		public SimpleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterSimpleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitSimpleExpression(this);
		}
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
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				leftElement();
				setState(243);
				relationalOp();
				setState(244);
				rightElement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				targetElement();
				setState(247);
				betweenOp();
				setState(248);
				leftElement();
				setState(249);
				match(AND);
				setState(250);
				rightElement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(252);
				targetElement();
				setState(253);
				isOrIsNot();
				setState(254);
				match(NULL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(256);
				match(EXISTS);
				setState(257);
				subquery();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(258);
				match(NOT);
				setState(259);
				match(EXISTS);
				setState(260);
				subquery();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(261);
				element();
				setState(262);
				match(IN);
				setState(263);
				inClause();
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterInClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitInClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitInClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InClauseContext inClause() throws RecognitionException {
		InClauseContext _localctx = new InClauseContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_inClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(LPAREN);
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(268);
				element();
				}
				break;
			case 2:
				{
				setState(269);
				match(INT);
				}
				break;
			case 3:
				{
				setState(270);
				match(STRING);
				}
				break;
			}
			setState(277); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(277);
				switch (_input.LA(1)) {
				case COMMA:
					{
					setState(273);
					match(COMMA);
					setState(274);
					element();
					}
					break;
				case INT:
					{
					setState(275);
					match(INT);
					}
					break;
				case STRING:
					{
					setState(276);
					match(STRING);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(279); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (COMMA - 44)) | (1L << (INT - 44)) | (1L << (STRING - 44)))) != 0) );
			setState(281);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterTableReferences(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitTableReferences(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitTableReferences(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableReferencesContext tableReferences() throws RecognitionException {
		TableReferencesContext _localctx = new TableReferencesContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_tableReferences);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			tableReference();
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (COMMA - 44)) | (1L << (INNER - 44)) | (1L << (JOIN - 44)) | (1L << (CROSS - 44)) | (1L << (NATURAL - 44)) | (1L << (LEFT - 44)) | (1L << (RIGHT - 44)) | (1L << (STRAIGHTJOIN - 44)))) != 0)) {
				{
				setState(287);
				switch (_input.LA(1)) {
				case COMMA:
					{
					{
					setState(284);
					match(COMMA);
					setState(285);
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
					setState(286);
					joinClause();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(291);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterTableReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitTableReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitTableReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableReferenceContext tableReference() throws RecognitionException {
		TableReferenceContext _localctx = new TableReferenceContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_tableReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterTableFactor4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitTableFactor4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitTableFactor4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableFactor4Context tableFactor4() throws RecognitionException {
		TableFactor4Context _localctx = new TableFactor4Context(_ctx, getState());
		enterRule(_localctx, 66, RULE_tableFactor4);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			tableAtom();
			setState(304);
			_la = _input.LA(1);
			if (_la==NATURAL) {
				{
				setState(295);
				match(NATURAL);
				setState(300);
				_la = _input.LA(1);
				if (_la==LEFT || _la==RIGHT) {
					{
					setState(296);
					_la = _input.LA(1);
					if ( !(_la==LEFT || _la==RIGHT) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(298);
					_la = _input.LA(1);
					if (_la==OUTER) {
						{
						setState(297);
						match(OUTER);
						}
					}

					}
				}

				setState(302);
				match(JOIN);
				setState(303);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterLeftjoinTableAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitLeftjoinTableAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitLeftjoinTableAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeftjoinTableAtomContext leftjoinTableAtom() throws RecognitionException {
		LeftjoinTableAtomContext _localctx = new LeftjoinTableAtomContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_leftjoinTableAtom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterTableAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitTableAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitTableAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableAtomContext tableAtom() throws RecognitionException {
		TableAtomContext _localctx = new TableAtomContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_tableAtom);
		int _la;
		try {
			setState(334);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(308);
				tableName();
				setState(310);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(309);
					partitionClause();
					}
				}

				setState(313);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(312);
					tableAlias();
					}
				}

				setState(316);
				_la = _input.LA(1);
				if (_la==USE || _la==IGNORE) {
					{
					setState(315);
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
				setState(318);
				subquery();
				setState(319);
				subqueryAlias();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(321);
				match(LPAREN);
				setState(322);
				tableReferences();
				setState(323);
				match(RPAREN);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(325);
				match(OJ);
				setState(326);
				tableReference();
				setState(327);
				match(LEFT);
				setState(328);
				match(OUTER);
				setState(329);
				match(JOIN);
				setState(330);
				tableReference();
				setState(331);
				match(ON);
				setState(332);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterJoinClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitJoinClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitJoinClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinClauseContext joinClause() throws RecognitionException {
		JoinClauseContext _localctx = new JoinClauseContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_joinClause);
		int _la;
		try {
			setState(367);
			switch (_input.LA(1)) {
			case INNER:
			case JOIN:
			case CROSS:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(337);
				_la = _input.LA(1);
				if (_la==INNER || _la==CROSS) {
					{
					setState(336);
					_la = _input.LA(1);
					if ( !(_la==INNER || _la==CROSS) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(339);
				match(JOIN);
				setState(340);
				tableAtom();
				setState(342);
				_la = _input.LA(1);
				if (_la==USING || _la==ON) {
					{
					setState(341);
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
				setState(344);
				match(STRAIGHTJOIN);
				setState(345);
				tableAtom();
				setState(348);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(346);
					match(ON);
					setState(347);
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
				setState(350);
				_la = _input.LA(1);
				if ( !(_la==LEFT || _la==RIGHT) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(352);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(351);
					match(OUTER);
					}
				}

				setState(354);
				match(JOIN);
				setState(355);
				leftjoinTableAtom();
				setState(356);
				joinCondition();
				}
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(358);
				match(NATURAL);
				setState(363);
				_la = _input.LA(1);
				if (_la==LEFT || _la==RIGHT) {
					{
					setState(359);
					_la = _input.LA(1);
					if ( !(_la==LEFT || _la==RIGHT) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(361);
					_la = _input.LA(1);
					if (_la==OUTER) {
						{
						setState(360);
						match(OUTER);
						}
					}

					}
				}

				setState(365);
				match(JOIN);
				setState(366);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterJoinCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitJoinCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitJoinCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinConditionContext joinCondition() throws RecognitionException {
		JoinConditionContext _localctx = new JoinConditionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_joinCondition);
		int _la;
		try {
			setState(381);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(369);
				match(ON);
				setState(370);
				expression();
				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << XOR) | (1L << NOT))) != 0)) {
					{
					{
					setState(371);
					exprOp();
					setState(372);
					expression();
					}
					}
					setState(378);
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
				setState(379);
				match(USING);
				setState(380);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterIndexHintList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitIndexHintList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitIndexHintList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexHintListContext indexHintList() throws RecognitionException {
		IndexHintListContext _localctx = new IndexHintListContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_indexHintList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			indexHint();
			setState(388);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(384);
					match(COMMA);
					setState(385);
					indexHint();
					}
					} 
				}
				setState(390);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterIndexOptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitIndexOptions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitIndexOptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexOptionsContext indexOptions() throws RecognitionException {
		IndexOptionsContext _localctx = new IndexOptionsContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_indexOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			_la = _input.LA(1);
			if ( !(_la==INDEX || _la==KEY) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(400);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(392);
				match(FOR);
				setState(398);
				switch (_input.LA(1)) {
				case JOIN:
					{
					{
					setState(393);
					match(JOIN);
					}
					}
					break;
				case ORDER:
					{
					{
					setState(394);
					match(ORDER);
					setState(395);
					match(BY);
					}
					}
					break;
				case GROUP:
					{
					{
					setState(396);
					match(GROUP);
					setState(397);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterIndexHint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitIndexHint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitIndexHint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexHintContext indexHint() throws RecognitionException {
		IndexHintContext _localctx = new IndexHintContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_indexHint);
		int _la;
		try {
			setState(416);
			switch (_input.LA(1)) {
			case USE:
				enterOuterAlt(_localctx, 1);
				{
				setState(402);
				match(USE);
				setState(403);
				indexOptions();
				setState(404);
				match(LPAREN);
				setState(406);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(405);
					indexList();
					}
				}

				setState(408);
				match(RPAREN);
				}
				break;
			case IGNORE:
				enterOuterAlt(_localctx, 2);
				{
				setState(410);
				match(IGNORE);
				setState(411);
				indexOptions();
				setState(412);
				match(LPAREN);
				setState(413);
				indexList();
				setState(414);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterIndexList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitIndexList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitIndexList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexListContext indexList() throws RecognitionException {
		IndexListContext _localctx = new IndexListContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_indexList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			indexName();
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(419);
				match(COMMA);
				setState(420);
				indexName();
				}
				}
				setState(425);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterPartitionClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitPartitionClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitPartitionClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionClauseContext partitionClause() throws RecognitionException {
		PartitionClauseContext _localctx = new PartitionClauseContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_partitionClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			match(PARTITION);
			setState(427);
			match(LPAREN);
			setState(428);
			partitionNames();
			setState(429);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterPartitionNames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitPartitionNames(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitPartitionNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionNamesContext partitionNames() throws RecognitionException {
		PartitionNamesContext _localctx = new PartitionNamesContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_partitionNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			partitionName();
			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(432);
				match(COMMA);
				setState(433);
				partitionName();
				}
				}
				setState(438);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterPartitionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitPartitionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitPartitionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionNameContext partitionName() throws RecognitionException {
		PartitionNameContext _localctx = new PartitionNameContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_partitionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterSubqueryAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitSubqueryAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitSubqueryAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubqueryAliasContext subqueryAlias() throws RecognitionException {
		SubqueryAliasContext _localctx = new SubqueryAliasContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_subqueryAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
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
		public TerminalNode RPAREN() { return getToken(MySQLParser.RPAREN, 0); }
		public SubqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubqueryContext subquery() throws RecognitionException {
		SubqueryContext _localctx = new SubqueryContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			match(LPAREN);
			setState(444);
			selectClause();
			setState(445);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3M\u01c2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\6\2b\n\2\r\2\16\2c\3\3\3\3\3\4\3"+
		"\4\3\4\5\4k\n\4\3\4\5\4n\n\4\3\4\5\4q\n\4\3\4\5\4t\n\4\3\5\3\5\3\6\3\6"+
		"\3\6\5\6{\n\6\3\6\3\6\7\6\177\n\6\f\6\16\6\u0082\13\6\3\7\3\7\3\b\3\b"+
		"\3\b\5\b\u0089\n\b\3\b\3\b\7\b\u008d\n\b\f\b\16\b\u0090\13\b\3\t\3\t\5"+
		"\t\u0094\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00a2"+
		"\n\f\3\f\3\f\3\f\3\f\5\f\u00a8\n\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\7\16\u00b2\n\16\f\16\16\16\u00b5\13\16\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\7\21\u00bf\n\21\f\21\16\21\u00c2\13\21\3\21\3\21\3\22\3\22"+
		"\3\22\7\22\u00c9\n\22\f\22\16\22\u00cc\13\22\3\23\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u00da\n\26\f\26\16\26\u00dd\13"+
		"\26\3\27\3\27\3\27\5\27\u00e2\n\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\5\36\u00f3\n\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u010c\n\37\3 \3 \3 \3 \5 \u0112\n"+
		" \3 \3 \3 \3 \6 \u0118\n \r \16 \u0119\3 \3 \3!\3!\3!\3!\7!\u0122\n!\f"+
		"!\16!\u0125\13!\3\"\3\"\3#\3#\3#\3#\5#\u012d\n#\5#\u012f\n#\3#\3#\5#\u0133"+
		"\n#\3$\3$\3%\3%\5%\u0139\n%\3%\5%\u013c\n%\3%\5%\u013f\n%\3%\3%\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u0151\n%\3&\5&\u0154\n&\3&\3&"+
		"\3&\5&\u0159\n&\3&\3&\3&\3&\5&\u015f\n&\3&\3&\5&\u0163\n&\3&\3&\3&\3&"+
		"\3&\3&\3&\5&\u016c\n&\5&\u016e\n&\3&\3&\5&\u0172\n&\3\'\3\'\3\'\3\'\3"+
		"\'\7\'\u0179\n\'\f\'\16\'\u017c\13\'\3\'\3\'\5\'\u0180\n\'\3(\3(\3(\7"+
		"(\u0185\n(\f(\16(\u0188\13(\3)\3)\3)\3)\3)\3)\3)\5)\u0191\n)\5)\u0193"+
		"\n)\3*\3*\3*\3*\5*\u0199\n*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u01a3\n*\3+\3+"+
		"\3+\7+\u01a8\n+\f+\16+\u01ab\13+\3,\3,\3,\3,\3,\3-\3-\3-\7-\u01b5\n-\f"+
		"-\16-\u01b8\13-\3.\3.\3/\3/\3\60\3\60\3\60\3\60\3\60\2\2\61\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\"+
		"^\2\b\3\2EF\4\2&)+,\4\2\6\b**\3\2AB\4\2\61\61\64\64\3\2\66\67\u01d1\2"+
		"a\3\2\2\2\4e\3\2\2\2\6g\3\2\2\2\bu\3\2\2\2\nw\3\2\2\2\f\u0083\3\2\2\2"+
		"\16\u0085\3\2\2\2\20\u0091\3\2\2\2\22\u0095\3\2\2\2\24\u0097\3\2\2\2\26"+
		"\u00a7\3\2\2\2\30\u00a9\3\2\2\2\32\u00ae\3\2\2\2\34\u00b6\3\2\2\2\36\u00b8"+
		"\3\2\2\2 \u00ba\3\2\2\2\"\u00c5\3\2\2\2$\u00cd\3\2\2\2&\u00d0\3\2\2\2"+
		"(\u00d2\3\2\2\2*\u00d5\3\2\2\2,\u00e1\3\2\2\2.\u00e3\3\2\2\2\60\u00e5"+
		"\3\2\2\2\62\u00e7\3\2\2\2\64\u00e9\3\2\2\2\66\u00eb\3\2\2\28\u00ed\3\2"+
		"\2\2:\u00f2\3\2\2\2<\u010b\3\2\2\2>\u010d\3\2\2\2@\u011d\3\2\2\2B\u0126"+
		"\3\2\2\2D\u0128\3\2\2\2F\u0134\3\2\2\2H\u0150\3\2\2\2J\u0171\3\2\2\2L"+
		"\u017f\3\2\2\2N\u0181\3\2\2\2P\u0189\3\2\2\2R\u01a2\3\2\2\2T\u01a4\3\2"+
		"\2\2V\u01ac\3\2\2\2X\u01b1\3\2\2\2Z\u01b9\3\2\2\2\\\u01bb\3\2\2\2^\u01bd"+
		"\3\2\2\2`b\5\6\4\2a`\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\3\3\2\2\2"+
		"ef\7G\2\2f\5\3\2\2\2gh\7\3\2\2hj\5\"\22\2ik\5$\23\2ji\3\2\2\2jk\3\2\2"+
		"\2km\3\2\2\2ln\5(\25\2ml\3\2\2\2mn\3\2\2\2np\3\2\2\2oq\5\n\6\2po\3\2\2"+
		"\2pq\3\2\2\2qs\3\2\2\2rt\5\16\b\2sr\3\2\2\2st\3\2\2\2t\7\3\2\2\2uv\t\2"+
		"\2\2v\t\3\2\2\2wx\79\2\2xz\7:\2\2y{\5\f\7\2zy\3\2\2\2z{\3\2\2\2{\u0080"+
		"\3\2\2\2|}\7.\2\2}\177\5\f\7\2~|\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2"+
		"\2\2\u0080\u0081\3\2\2\2\u0081\13\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084"+
		"\5\26\f\2\u0084\r\3\2\2\2\u0085\u0086\78\2\2\u0086\u0088\7:\2\2\u0087"+
		"\u0089\5\20\t\2\u0088\u0087\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008e\3"+
		"\2\2\2\u008a\u008b\7.\2\2\u008b\u008d\5\20\t\2\u008c\u008a\3\2\2\2\u008d"+
		"\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\17\3\2\2"+
		"\2\u0090\u008e\3\2\2\2\u0091\u0093\5\26\f\2\u0092\u0094\5\b\5\2\u0093"+
		"\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094\21\3\2\2\2\u0095\u0096\7G\2\2"+
		"\u0096\23\3\2\2\2\u0097\u0098\7G\2\2\u0098\25\3\2\2\2\u0099\u00a8\7 \2"+
		"\2\u009a\u009b\5\24\13\2\u009b\u009c\7/\2\2\u009c\u009d\7 \2\2\u009d\u00a8"+
		"\3\2\2\2\u009e\u009f\5\24\13\2\u009f\u00a0\7/\2\2\u00a0\u00a2\3\2\2\2"+
		"\u00a1\u009e\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a8"+
		"\7G\2\2\u00a4\u00a8\7H\2\2\u00a5\u00a8\7I\2\2\u00a6\u00a8\5\30\r\2\u00a7"+
		"\u0099\3\2\2\2\u00a7\u009a\3\2\2\2\u00a7\u00a1\3\2\2\2\u00a7\u00a4\3\2"+
		"\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a6\3\2\2\2\u00a8\27\3\2\2\2\u00a9\u00aa"+
		"\7G\2\2\u00aa\u00ab\7\"\2\2\u00ab\u00ac\5\32\16\2\u00ac\u00ad\7!\2\2\u00ad"+
		"\31\3\2\2\2\u00ae\u00b3\5\26\f\2\u00af\u00b0\7.\2\2\u00b0\u00b2\5\26\f"+
		"\2\u00b1\u00af\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4"+
		"\3\2\2\2\u00b4\33\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7\7G\2\2\u00b7"+
		"\35\3\2\2\2\u00b8\u00b9\7G\2\2\u00b9\37\3\2\2\2\u00ba\u00bb\7\"\2\2\u00bb"+
		"\u00c0\5\26\f\2\u00bc\u00bd\7.\2\2\u00bd\u00bf\5\26\f\2\u00be\u00bc\3"+
		"\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1"+
		"\u00c3\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c4\7!\2\2\u00c4!\3\2\2\2\u00c5"+
		"\u00ca\5\26\f\2\u00c6\u00c7\7.\2\2\u00c7\u00c9\5\26\f\2\u00c8\u00c6\3"+
		"\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"#\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\7\4\2\2\u00ce\u00cf\5@!\2\u00cf"+
		"%\3\2\2\2\u00d0\u00d1\7\3\2\2\u00d1\'\3\2\2\2\u00d2\u00d3\7\5\2\2\u00d3"+
		"\u00d4\5*\26\2\u00d4)\3\2\2\2\u00d5\u00db\5<\37\2\u00d6\u00d7\5\66\34"+
		"\2\u00d7\u00d8\5<\37\2\u00d8\u00da\3\2\2\2\u00d9\u00d6\3\2\2\2\u00da\u00dd"+
		"\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc+\3\2\2\2\u00dd"+
		"\u00db\3\2\2\2\u00de\u00e2\5\26\f\2\u00df\u00e2\7H\2\2\u00e0\u00e2\7I"+
		"\2\2\u00e1\u00de\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2"+
		"-\3\2\2\2\u00e3\u00e4\5,\27\2\u00e4/\3\2\2\2\u00e5\u00e6\5,\27\2\u00e6"+
		"\61\3\2\2\2\u00e7\u00e8\5,\27\2\u00e8\63\3\2\2\2\u00e9\u00ea\t\3\2\2\u00ea"+
		"\65\3\2\2\2\u00eb\u00ec\t\4\2\2\u00ec\67\3\2\2\2\u00ed\u00ee\7\24\2\2"+
		"\u00ee9\3\2\2\2\u00ef\u00f3\7\t\2\2\u00f0\u00f1\7\t\2\2\u00f1\u00f3\7"+
		"*\2\2\u00f2\u00ef\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3;\3\2\2\2\u00f4\u00f5"+
		"\5\60\31\2\u00f5\u00f6\5\64\33\2\u00f6\u00f7\5.\30\2\u00f7\u010c\3\2\2"+
		"\2\u00f8\u00f9\5\62\32\2\u00f9\u00fa\58\35\2\u00fa\u00fb\5\60\31\2\u00fb"+
		"\u00fc\7\6\2\2\u00fc\u00fd\5.\30\2\u00fd\u010c\3\2\2\2\u00fe\u00ff\5\62"+
		"\32\2\u00ff\u0100\5:\36\2\u0100\u0101\7\n\2\2\u0101\u010c\3\2\2\2\u0102"+
		"\u0103\7\r\2\2\u0103\u010c\5^\60\2\u0104\u0105\7*\2\2\u0105\u0106\7\r"+
		"\2\2\u0106\u010c\5^\60\2\u0107\u0108\5,\27\2\u0108\u0109\7\f\2\2\u0109"+
		"\u010a\5> \2\u010a\u010c\3\2\2\2\u010b\u00f4\3\2\2\2\u010b\u00f8\3\2\2"+
		"\2\u010b\u00fe\3\2\2\2\u010b\u0102\3\2\2\2\u010b\u0104\3\2\2\2\u010b\u0107"+
		"\3\2\2\2\u010c=\3\2\2\2\u010d\u0111\7\"\2\2\u010e\u0112\5,\27\2\u010f"+
		"\u0112\7H\2\2\u0110\u0112\7I\2\2\u0111\u010e\3\2\2\2\u0111\u010f\3\2\2"+
		"\2\u0111\u0110\3\2\2\2\u0112\u0117\3\2\2\2\u0113\u0114\7.\2\2\u0114\u0118"+
		"\5,\27\2\u0115\u0118\7H\2\2\u0116\u0118\7I\2\2\u0117\u0113\3\2\2\2\u0117"+
		"\u0115\3\2\2\2\u0117\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u0117\3\2"+
		"\2\2\u0119\u011a\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\7!\2\2\u011c"+
		"?\3\2\2\2\u011d\u0123\5B\"\2\u011e\u011f\7.\2\2\u011f\u0122\5B\"\2\u0120"+
		"\u0122\5J&\2\u0121\u011e\3\2\2\2\u0121\u0120\3\2\2\2\u0122\u0125\3\2\2"+
		"\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124A\3\2\2\2\u0125\u0123"+
		"\3\2\2\2\u0126\u0127\5H%\2\u0127C\3\2\2\2\u0128\u0132\5H%\2\u0129\u012e"+
		"\7@\2\2\u012a\u012c\t\5\2\2\u012b\u012d\7\62\2\2\u012c\u012b\3\2\2\2\u012c"+
		"\u012d\3\2\2\2\u012d\u012f\3\2\2\2\u012e\u012a\3\2\2\2\u012e\u012f\3\2"+
		"\2\2\u012f\u0130\3\2\2\2\u0130\u0131\7\63\2\2\u0131\u0133\5H%\2\u0132"+
		"\u0129\3\2\2\2\u0132\u0133\3\2\2\2\u0133E\3\2\2\2\u0134\u0135\5H%\2\u0135"+
		"G\3\2\2\2\u0136\u0138\5\22\n\2\u0137\u0139\5V,\2\u0138\u0137\3\2\2\2\u0138"+
		"\u0139\3\2\2\2\u0139\u013b\3\2\2\2\u013a\u013c\5\24\13\2\u013b\u013a\3"+
		"\2\2\2\u013b\u013c\3\2\2\2\u013c\u013e\3\2\2\2\u013d\u013f\5N(\2\u013e"+
		"\u013d\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0151\3\2\2\2\u0140\u0141\5^"+
		"\60\2\u0141\u0142\5\\/\2\u0142\u0151\3\2\2\2\u0143\u0144\7\"\2\2\u0144"+
		"\u0145\5@!\2\u0145\u0146\7!\2\2\u0146\u0151\3\2\2\2\u0147\u0148\7C\2\2"+
		"\u0148\u0149\5B\"\2\u0149\u014a\7A\2\2\u014a\u014b\7\62\2\2\u014b\u014c"+
		"\7\63\2\2\u014c\u014d\5B\"\2\u014d\u014e\7D\2\2\u014e\u014f\5*\26\2\u014f"+
		"\u0151\3\2\2\2\u0150\u0136\3\2\2\2\u0150\u0140\3\2\2\2\u0150\u0143\3\2"+
		"\2\2\u0150\u0147\3\2\2\2\u0151I\3\2\2\2\u0152\u0154\t\6\2\2\u0153\u0152"+
		"\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156\7\63\2\2"+
		"\u0156\u0158\5H%\2\u0157\u0159\5L\'\2\u0158\u0157\3\2\2\2\u0158\u0159"+
		"\3\2\2\2\u0159\u0172\3\2\2\2\u015a\u015b\7M\2\2\u015b\u015e\5H%\2\u015c"+
		"\u015d\7D\2\2\u015d\u015f\5*\26\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2"+
		"\2\2\u015f\u0172\3\2\2\2\u0160\u0162\t\5\2\2\u0161\u0163\7\62\2\2\u0162"+
		"\u0161\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165\7\63"+
		"\2\2\u0165\u0166\5F$\2\u0166\u0167\5L\'\2\u0167\u0172\3\2\2\2\u0168\u016d"+
		"\7@\2\2\u0169\u016b\t\5\2\2\u016a\u016c\7\62\2\2\u016b\u016a\3\2\2\2\u016b"+
		"\u016c\3\2\2\2\u016c\u016e\3\2\2\2\u016d\u0169\3\2\2\2\u016d\u016e\3\2"+
		"\2\2\u016e\u016f\3\2\2\2\u016f\u0170\7\63\2\2\u0170\u0172\5H%\2\u0171"+
		"\u0153\3\2\2\2\u0171\u015a\3\2\2\2\u0171\u0160\3\2\2\2\u0171\u0168\3\2"+
		"\2\2\u0172K\3\2\2\2\u0173\u0174\7D\2\2\u0174\u017a\5*\26\2\u0175\u0176"+
		"\5\66\34\2\u0176\u0177\5*\26\2\u0177\u0179\3\2\2\2\u0178\u0175\3\2\2\2"+
		"\u0179\u017c\3\2\2\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u0180"+
		"\3\2\2\2\u017c\u017a\3\2\2\2\u017d\u017e\7\65\2\2\u017e\u0180\5 \21\2"+
		"\u017f\u0173\3\2\2\2\u017f\u017d\3\2\2\2\u0180M\3\2\2\2\u0181\u0186\5"+
		"R*\2\u0182\u0183\7.\2\2\u0183\u0185\5R*\2\u0184\u0182\3\2\2\2\u0185\u0188"+
		"\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187O\3\2\2\2\u0188"+
		"\u0186\3\2\2\2\u0189\u0192\t\7\2\2\u018a\u0190\7;\2\2\u018b\u0191\7\63"+
		"\2\2\u018c\u018d\78\2\2\u018d\u0191\7:\2\2\u018e\u018f\79\2\2\u018f\u0191"+
		"\7:\2\2\u0190\u018b\3\2\2\2\u0190\u018c\3\2\2\2\u0190\u018e\3\2\2\2\u0191"+
		"\u0193\3\2\2\2\u0192\u018a\3\2\2\2\u0192\u0193\3\2\2\2\u0193Q\3\2\2\2"+
		"\u0194\u0195\7<\2\2\u0195\u0196\5P)\2\u0196\u0198\7\"\2\2\u0197\u0199"+
		"\5T+\2\u0198\u0197\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019a\3\2\2\2\u019a"+
		"\u019b\7!\2\2\u019b\u01a3\3\2\2\2\u019c\u019d\7=\2\2\u019d\u019e\5P)\2"+
		"\u019e\u019f\7\"\2\2\u019f\u01a0\5T+\2\u01a0\u01a1\7!\2\2\u01a1\u01a3"+
		"\3\2\2\2\u01a2\u0194\3\2\2\2\u01a2\u019c\3\2\2\2\u01a3S\3\2\2\2\u01a4"+
		"\u01a9\5\36\20\2\u01a5\u01a6\7.\2\2\u01a6\u01a8\5\36\20\2\u01a7\u01a5"+
		"\3\2\2\2\u01a8\u01ab\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa"+
		"U\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ac\u01ad\7>\2\2\u01ad\u01ae\7\"\2\2\u01ae"+
		"\u01af\5X-\2\u01af\u01b0\7!\2\2\u01b0W\3\2\2\2\u01b1\u01b6\5Z.\2\u01b2"+
		"\u01b3\7.\2\2\u01b3\u01b5\5Z.\2\u01b4\u01b2\3\2\2\2\u01b5\u01b8\3\2\2"+
		"\2\u01b6\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7Y\3\2\2\2\u01b8\u01b6"+
		"\3\2\2\2\u01b9\u01ba\7G\2\2\u01ba[\3\2\2\2\u01bb\u01bc\7G\2\2\u01bc]\3"+
		"\2\2\2\u01bd\u01be\7\"\2\2\u01be\u01bf\5\6\4\2\u01bf\u01c0\7!\2\2\u01c0"+
		"_\3\2\2\2\61cjmpsz\u0080\u0088\u008e\u0093\u00a1\u00a7\u00b3\u00c0\u00ca"+
		"\u00db\u00e1\u00f2\u010b\u0111\u0117\u0119\u0121\u0123\u012c\u012e\u0132"+
		"\u0138\u013b\u013e\u0150\u0153\u0158\u015e\u0162\u016b\u016d\u0171\u017a"+
		"\u017f\u0186\u0190\u0192\u0198\u01a2\u01a9\u01b6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}