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
		LEFT=63, RIGHT=64, OJ=65, ON=66, ID=67, INT=68, STRING=69, NEWLINE=70, 
		WS=71, USER_VAR=72;
	public static final int
		RULE_stat = 0, RULE_schema_name = 1, RULE_select_clause = 2, RULE_table_name = 3, 
		RULE_table_alias = 4, RULE_column_name = 5, RULE_column_name_alias = 6, 
		RULE_index_name = 7, RULE_column_list = 8, RULE_column_list_clause = 9, 
		RULE_from_clause = 10, RULE_select_key = 11, RULE_where_clause = 12, RULE_expression = 13, 
		RULE_element = 14, RULE_right_element = 15, RULE_left_element = 16, RULE_target_element = 17, 
		RULE_relational_op = 18, RULE_expr_op = 19, RULE_between_op = 20, RULE_is_or_is_not = 21, 
		RULE_simple_expression = 22, RULE_table_references = 23, RULE_table_reference = 24, 
		RULE_table_factor4 = 25, RULE_table_atom = 26, RULE_join_clause = 27, 
		RULE_join_condition = 28, RULE_index_hint_list = 29, RULE_index_options = 30, 
		RULE_index_hint = 31, RULE_index_list = 32, RULE_partition_clause = 33, 
		RULE_partition_names = 34, RULE_partition_name = 35, RULE_subquery_alias = 36, 
		RULE_subquery = 37;
	public static final String[] ruleNames = {
		"stat", "schema_name", "select_clause", "table_name", "table_alias", "column_name", 
		"column_name_alias", "index_name", "column_list", "column_list_clause", 
		"from_clause", "select_key", "where_clause", "expression", "element", 
		"right_element", "left_element", "target_element", "relational_op", "expr_op", 
		"between_op", "is_or_is_not", "simple_expression", "table_references", 
		"table_reference", "table_factor4", "table_atom", "join_clause", "join_condition", 
		"index_hint_list", "index_options", "index_hint", "index_list", "partition_clause", 
		"partition_names", "partition_name", "subquery_alias", "subquery"
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
		"'on'"
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
		"ON", "ID", "INT", "STRING", "NEWLINE", "WS", "USER_VAR"
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
		public List<Select_clauseContext> select_clause() {
			return getRuleContexts(Select_clauseContext.class);
		}
		public Select_clauseContext select_clause(int i) {
			return getRuleContext(Select_clauseContext.class,i);
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
			setState(77); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(76);
				select_clause();
				}
				}
				setState(79); 
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

	public static class Schema_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MySQLParser.ID, 0); }
		public Schema_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schema_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterSchema_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitSchema_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitSchema_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Schema_nameContext schema_name() throws RecognitionException {
		Schema_nameContext _localctx = new Schema_nameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_schema_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
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

	public static class Select_clauseContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(MySQLParser.SELECT, 0); }
		public Column_list_clauseContext column_list_clause() {
			return getRuleContext(Column_list_clauseContext.class,0);
		}
		public From_clauseContext from_clause() {
			return getRuleContext(From_clauseContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Select_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterSelect_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitSelect_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitSelect_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_clauseContext select_clause() throws RecognitionException {
		Select_clauseContext _localctx = new Select_clauseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_select_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(SELECT);
			setState(84);
			column_list_clause();
			setState(86);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(85);
				from_clause();
				}
			}

			setState(89);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(88);
				where_clause();
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

	public static class Table_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MySQLParser.ID, 0); }
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitTable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
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

	public static class Table_aliasContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MySQLParser.ID, 0); }
		public Table_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterTable_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitTable_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitTable_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_aliasContext table_alias() throws RecognitionException {
		Table_aliasContext _localctx = new Table_aliasContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
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

	public static class Column_nameContext extends ParserRuleContext {
		public TerminalNode ASTERISK() { return getToken(MySQLParser.ASTERISK, 0); }
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public TerminalNode DOT() { return getToken(MySQLParser.DOT, 0); }
		public TerminalNode ID() { return getToken(MySQLParser.ID, 0); }
		public TerminalNode INT() { return getToken(MySQLParser.INT, 0); }
		public TerminalNode STRING() { return getToken(MySQLParser.STRING, 0); }
		public TerminalNode USER_VAR() { return getToken(MySQLParser.USER_VAR, 0); }
		public Column_name_aliasContext column_name_alias() {
			return getRuleContext(Column_name_aliasContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitColumn_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_column_name);
		int _la;
		try {
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				match(ASTERISK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				table_alias();
				setState(97);
				match(DOT);
				setState(98);
				match(ASTERISK);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(100);
					table_alias();
					setState(101);
					match(DOT);
					}
					break;
				}
				setState(105);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(106);
				match(INT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(107);
				match(STRING);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(108);
				match(USER_VAR);
				setState(110);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(109);
					column_name_alias();
					}
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

	public static class Column_name_aliasContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MySQLParser.ID, 0); }
		public Column_name_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterColumn_name_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitColumn_name_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitColumn_name_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_name_aliasContext column_name_alias() throws RecognitionException {
		Column_name_aliasContext _localctx = new Column_name_aliasContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_column_name_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
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

	public static class Index_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MySQLParser.ID, 0); }
		public Index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterIndex_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitIndex_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitIndex_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_nameContext index_name() throws RecognitionException {
		Index_nameContext _localctx = new Index_nameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
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

	public static class Column_listContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(MySQLParser.LPAREN, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(MySQLParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MySQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLParser.COMMA, i);
		}
		public Column_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterColumn_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitColumn_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitColumn_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_listContext column_list() throws RecognitionException {
		Column_listContext _localctx = new Column_listContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_column_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(LPAREN);
			setState(119);
			column_name();
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(120);
				match(COMMA);
				setState(121);
				column_name();
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(127);
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

	public static class Column_list_clauseContext extends ParserRuleContext {
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLParser.COMMA, i);
		}
		public Column_list_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_list_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterColumn_list_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitColumn_list_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitColumn_list_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_list_clauseContext column_list_clause() throws RecognitionException {
		Column_list_clauseContext _localctx = new Column_list_clauseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_column_list_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			column_name();
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(130);
				match(COMMA);
				setState(131);
				column_name();
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

	public static class From_clauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(MySQLParser.FROM, 0); }
		public Table_referencesContext table_references() {
			return getRuleContext(Table_referencesContext.class,0);
		}
		public From_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterFrom_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitFrom_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitFrom_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_clauseContext from_clause() throws RecognitionException {
		From_clauseContext _localctx = new From_clauseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_from_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(FROM);
			setState(138);
			table_references();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_keyContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(MySQLParser.SELECT, 0); }
		public Select_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterSelect_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitSelect_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitSelect_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_keyContext select_key() throws RecognitionException {
		Select_keyContext _localctx = new Select_keyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_select_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
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

	public static class Where_clauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(MySQLParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterWhere_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitWhere_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitWhere_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(WHERE);
			setState(143);
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
		public List<Simple_expressionContext> simple_expression() {
			return getRuleContexts(Simple_expressionContext.class);
		}
		public Simple_expressionContext simple_expression(int i) {
			return getRuleContext(Simple_expressionContext.class,i);
		}
		public List<Expr_opContext> expr_op() {
			return getRuleContexts(Expr_opContext.class);
		}
		public Expr_opContext expr_op(int i) {
			return getRuleContext(Expr_opContext.class,i);
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
		enterRule(_localctx, 26, RULE_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			simple_expression();
			setState(151);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(146);
					expr_op();
					setState(147);
					simple_expression();
					}
					} 
				}
				setState(153);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		public TerminalNode USER_VAR() { return getToken(MySQLParser.USER_VAR, 0); }
		public TerminalNode ID() { return getToken(MySQLParser.ID, 0); }
		public TerminalNode INT() { return getToken(MySQLParser.INT, 0); }
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
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
		enterRule(_localctx, 28, RULE_element);
		try {
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				match(USER_VAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(156);
				match(VERTBAR);
				setState(157);
				match(ID);
				setState(158);
				match(VERTBAR);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(159);
				match(INT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(160);
				column_name();
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

	public static class Right_elementContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public Right_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_right_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterRight_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitRight_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitRight_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Right_elementContext right_element() throws RecognitionException {
		Right_elementContext _localctx = new Right_elementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_right_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
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

	public static class Left_elementContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public Left_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_left_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterLeft_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitLeft_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitLeft_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Left_elementContext left_element() throws RecognitionException {
		Left_elementContext _localctx = new Left_elementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_left_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
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

	public static class Target_elementContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public Target_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_target_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterTarget_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitTarget_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitTarget_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Target_elementContext target_element() throws RecognitionException {
		Target_elementContext _localctx = new Target_elementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_target_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
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

	public static class Relational_opContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(MySQLParser.EQ, 0); }
		public TerminalNode LTH() { return getToken(MySQLParser.LTH, 0); }
		public TerminalNode GTH() { return getToken(MySQLParser.GTH, 0); }
		public TerminalNode NOT_EQ() { return getToken(MySQLParser.NOT_EQ, 0); }
		public TerminalNode LET() { return getToken(MySQLParser.LET, 0); }
		public TerminalNode GET() { return getToken(MySQLParser.GET, 0); }
		public Relational_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterRelational_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitRelational_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitRelational_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relational_opContext relational_op() throws RecognitionException {
		Relational_opContext _localctx = new Relational_opContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_relational_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
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

	public static class Expr_opContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(MySQLParser.AND, 0); }
		public TerminalNode XOR() { return getToken(MySQLParser.XOR, 0); }
		public TerminalNode OR() { return getToken(MySQLParser.OR, 0); }
		public TerminalNode NOT() { return getToken(MySQLParser.NOT, 0); }
		public Expr_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterExpr_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitExpr_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitExpr_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_opContext expr_op() throws RecognitionException {
		Expr_opContext _localctx = new Expr_opContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expr_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
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

	public static class Between_opContext extends ParserRuleContext {
		public TerminalNode BETWEEN() { return getToken(MySQLParser.BETWEEN, 0); }
		public Between_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_between_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterBetween_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitBetween_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitBetween_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Between_opContext between_op() throws RecognitionException {
		Between_opContext _localctx = new Between_opContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_between_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
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

	public static class Is_or_is_notContext extends ParserRuleContext {
		public TerminalNode IS() { return getToken(MySQLParser.IS, 0); }
		public TerminalNode NOT() { return getToken(MySQLParser.NOT, 0); }
		public Is_or_is_notContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_is_or_is_not; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterIs_or_is_not(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitIs_or_is_not(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitIs_or_is_not(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Is_or_is_notContext is_or_is_not() throws RecognitionException {
		Is_or_is_notContext _localctx = new Is_or_is_notContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_is_or_is_not);
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				match(IS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				match(IS);
				setState(177);
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

	public static class Simple_expressionContext extends ParserRuleContext {
		public Left_elementContext left_element() {
			return getRuleContext(Left_elementContext.class,0);
		}
		public Relational_opContext relational_op() {
			return getRuleContext(Relational_opContext.class,0);
		}
		public Right_elementContext right_element() {
			return getRuleContext(Right_elementContext.class,0);
		}
		public Target_elementContext target_element() {
			return getRuleContext(Target_elementContext.class,0);
		}
		public Between_opContext between_op() {
			return getRuleContext(Between_opContext.class,0);
		}
		public TerminalNode AND() { return getToken(MySQLParser.AND, 0); }
		public Is_or_is_notContext is_or_is_not() {
			return getRuleContext(Is_or_is_notContext.class,0);
		}
		public TerminalNode NULL() { return getToken(MySQLParser.NULL, 0); }
		public TerminalNode EXISTS() { return getToken(MySQLParser.EXISTS, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode NOT() { return getToken(MySQLParser.NOT, 0); }
		public Simple_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterSimple_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitSimple_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitSimple_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_expressionContext simple_expression() throws RecognitionException {
		Simple_expressionContext _localctx = new Simple_expressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_simple_expression);
		try {
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				left_element();
				setState(181);
				relational_op();
				setState(182);
				right_element();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				target_element();
				setState(185);
				between_op();
				setState(186);
				left_element();
				setState(187);
				match(AND);
				setState(188);
				right_element();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(190);
				target_element();
				setState(191);
				is_or_is_not();
				setState(192);
				match(NULL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(194);
				match(EXISTS);
				setState(195);
				subquery();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(196);
				match(NOT);
				setState(197);
				match(EXISTS);
				setState(198);
				subquery();
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

	public static class Table_referencesContext extends ParserRuleContext {
		public List<Table_referenceContext> table_reference() {
			return getRuleContexts(Table_referenceContext.class);
		}
		public Table_referenceContext table_reference(int i) {
			return getRuleContext(Table_referenceContext.class,i);
		}
		public List<Join_clauseContext> join_clause() {
			return getRuleContexts(Join_clauseContext.class);
		}
		public Join_clauseContext join_clause(int i) {
			return getRuleContext(Join_clauseContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLParser.COMMA, i);
		}
		public Table_referencesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_references; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterTable_references(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitTable_references(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitTable_references(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_referencesContext table_references() throws RecognitionException {
		Table_referencesContext _localctx = new Table_referencesContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_table_references);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			table_reference();
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (COMMA - 44)) | (1L << (INNER - 44)) | (1L << (JOIN - 44)) | (1L << (CROSS - 44)) | (1L << (STRAIGHT_JOIN - 44)) | (1L << (NATURAL - 44)) | (1L << (LEFT - 44)) | (1L << (RIGHT - 44)))) != 0)) {
				{
				setState(205);
				switch (_input.LA(1)) {
				case COMMA:
					{
					{
					setState(202);
					match(COMMA);
					setState(203);
					table_reference();
					}
					}
					break;
				case INNER:
				case JOIN:
				case CROSS:
				case STRAIGHT_JOIN:
				case NATURAL:
				case LEFT:
				case RIGHT:
					{
					setState(204);
					join_clause();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(209);
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

	public static class Table_referenceContext extends ParserRuleContext {
		public Table_atomContext table_atom() {
			return getRuleContext(Table_atomContext.class,0);
		}
		public Table_referenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterTable_reference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitTable_reference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitTable_reference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_referenceContext table_reference() throws RecognitionException {
		Table_referenceContext _localctx = new Table_referenceContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_table_reference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			table_atom();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_factor4Context extends ParserRuleContext {
		public List<Table_atomContext> table_atom() {
			return getRuleContexts(Table_atomContext.class);
		}
		public Table_atomContext table_atom(int i) {
			return getRuleContext(Table_atomContext.class,i);
		}
		public TerminalNode NATURAL() { return getToken(MySQLParser.NATURAL, 0); }
		public TerminalNode JOIN() { return getToken(MySQLParser.JOIN, 0); }
		public TerminalNode LEFT() { return getToken(MySQLParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(MySQLParser.RIGHT, 0); }
		public TerminalNode OUTER() { return getToken(MySQLParser.OUTER, 0); }
		public Table_factor4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_factor4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterTable_factor4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitTable_factor4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitTable_factor4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_factor4Context table_factor4() throws RecognitionException {
		Table_factor4Context _localctx = new Table_factor4Context(_ctx, getState());
		enterRule(_localctx, 50, RULE_table_factor4);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			table_atom();
			setState(222);
			_la = _input.LA(1);
			if (_la==NATURAL) {
				{
				setState(213);
				match(NATURAL);
				setState(218);
				_la = _input.LA(1);
				if (_la==LEFT || _la==RIGHT) {
					{
					setState(214);
					_la = _input.LA(1);
					if ( !(_la==LEFT || _la==RIGHT) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(216);
					_la = _input.LA(1);
					if (_la==OUTER) {
						{
						setState(215);
						match(OUTER);
						}
					}

					}
				}

				setState(220);
				match(JOIN);
				setState(221);
				table_atom();
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

	public static class Table_atomContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Partition_clauseContext partition_clause() {
			return getRuleContext(Partition_clauseContext.class,0);
		}
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public Index_hint_listContext index_hint_list() {
			return getRuleContext(Index_hint_listContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public Subquery_aliasContext subquery_alias() {
			return getRuleContext(Subquery_aliasContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(MySQLParser.LPAREN, 0); }
		public Table_referencesContext table_references() {
			return getRuleContext(Table_referencesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MySQLParser.RPAREN, 0); }
		public TerminalNode OJ() { return getToken(MySQLParser.OJ, 0); }
		public List<Table_referenceContext> table_reference() {
			return getRuleContexts(Table_referenceContext.class);
		}
		public Table_referenceContext table_reference(int i) {
			return getRuleContext(Table_referenceContext.class,i);
		}
		public TerminalNode LEFT() { return getToken(MySQLParser.LEFT, 0); }
		public TerminalNode OUTER() { return getToken(MySQLParser.OUTER, 0); }
		public TerminalNode JOIN() { return getToken(MySQLParser.JOIN, 0); }
		public TerminalNode ON() { return getToken(MySQLParser.ON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Table_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterTable_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitTable_atom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitTable_atom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_atomContext table_atom() throws RecognitionException {
		Table_atomContext _localctx = new Table_atomContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_table_atom);
		int _la;
		try {
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(224);
				table_name();
				setState(226);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(225);
					partition_clause();
					}
				}

				setState(229);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(228);
					table_alias();
					}
				}

				setState(232);
				_la = _input.LA(1);
				if (_la==USE || _la==IGNORE) {
					{
					setState(231);
					index_hint_list();
					}
				}

				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(234);
				subquery();
				setState(235);
				subquery_alias();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(237);
				match(LPAREN);
				setState(238);
				table_references();
				setState(239);
				match(RPAREN);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(241);
				match(OJ);
				setState(242);
				table_reference();
				setState(243);
				match(LEFT);
				setState(244);
				match(OUTER);
				setState(245);
				match(JOIN);
				setState(246);
				table_reference();
				setState(247);
				match(ON);
				setState(248);
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

	public static class Join_clauseContext extends ParserRuleContext {
		public TerminalNode JOIN() { return getToken(MySQLParser.JOIN, 0); }
		public Table_atomContext table_atom() {
			return getRuleContext(Table_atomContext.class,0);
		}
		public Join_conditionContext join_condition() {
			return getRuleContext(Join_conditionContext.class,0);
		}
		public TerminalNode INNER() { return getToken(MySQLParser.INNER, 0); }
		public TerminalNode CROSS() { return getToken(MySQLParser.CROSS, 0); }
		public TerminalNode STRAIGHT_JOIN() { return getToken(MySQLParser.STRAIGHT_JOIN, 0); }
		public TerminalNode ON() { return getToken(MySQLParser.ON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Table_factor4Context table_factor4() {
			return getRuleContext(Table_factor4Context.class,0);
		}
		public TerminalNode LEFT() { return getToken(MySQLParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(MySQLParser.RIGHT, 0); }
		public TerminalNode OUTER() { return getToken(MySQLParser.OUTER, 0); }
		public TerminalNode NATURAL() { return getToken(MySQLParser.NATURAL, 0); }
		public Join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterJoin_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitJoin_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitJoin_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_clauseContext join_clause() throws RecognitionException {
		Join_clauseContext _localctx = new Join_clauseContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_join_clause);
		int _la;
		try {
			setState(283);
			switch (_input.LA(1)) {
			case INNER:
			case JOIN:
			case CROSS:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(253);
				_la = _input.LA(1);
				if (_la==INNER || _la==CROSS) {
					{
					setState(252);
					_la = _input.LA(1);
					if ( !(_la==INNER || _la==CROSS) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(255);
				match(JOIN);
				setState(256);
				table_atom();
				setState(258);
				_la = _input.LA(1);
				if (_la==USING || _la==ON) {
					{
					setState(257);
					join_condition();
					}
				}

				}
				}
				break;
			case STRAIGHT_JOIN:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(260);
				match(STRAIGHT_JOIN);
				setState(261);
				table_atom();
				setState(264);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(262);
					match(ON);
					setState(263);
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
				setState(266);
				_la = _input.LA(1);
				if ( !(_la==LEFT || _la==RIGHT) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(268);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(267);
					match(OUTER);
					}
				}

				setState(270);
				match(JOIN);
				setState(271);
				table_factor4();
				setState(272);
				join_condition();
				}
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(274);
				match(NATURAL);
				setState(279);
				_la = _input.LA(1);
				if (_la==LEFT || _la==RIGHT) {
					{
					setState(275);
					_la = _input.LA(1);
					if ( !(_la==LEFT || _la==RIGHT) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(277);
					_la = _input.LA(1);
					if (_la==OUTER) {
						{
						setState(276);
						match(OUTER);
						}
					}

					}
				}

				setState(281);
				match(JOIN);
				setState(282);
				table_atom();
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

	public static class Join_conditionContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(MySQLParser.ON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<Expr_opContext> expr_op() {
			return getRuleContexts(Expr_opContext.class);
		}
		public Expr_opContext expr_op(int i) {
			return getRuleContext(Expr_opContext.class,i);
		}
		public TerminalNode USING() { return getToken(MySQLParser.USING, 0); }
		public Column_listContext column_list() {
			return getRuleContext(Column_listContext.class,0);
		}
		public Join_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterJoin_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitJoin_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitJoin_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_conditionContext join_condition() throws RecognitionException {
		Join_conditionContext _localctx = new Join_conditionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_join_condition);
		int _la;
		try {
			setState(297);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(285);
				match(ON);
				setState(286);
				expression();
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << XOR) | (1L << NOT))) != 0)) {
					{
					{
					setState(287);
					expr_op();
					setState(288);
					expression();
					}
					}
					setState(294);
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
				setState(295);
				match(USING);
				setState(296);
				column_list();
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

	public static class Index_hint_listContext extends ParserRuleContext {
		public List<Index_hintContext> index_hint() {
			return getRuleContexts(Index_hintContext.class);
		}
		public Index_hintContext index_hint(int i) {
			return getRuleContext(Index_hintContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLParser.COMMA, i);
		}
		public Index_hint_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_hint_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterIndex_hint_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitIndex_hint_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitIndex_hint_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_hint_listContext index_hint_list() throws RecognitionException {
		Index_hint_listContext _localctx = new Index_hint_listContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_index_hint_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			index_hint();
			setState(304);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(300);
					match(COMMA);
					setState(301);
					index_hint();
					}
					} 
				}
				setState(306);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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

	public static class Index_optionsContext extends ParserRuleContext {
		public TerminalNode INDEX() { return getToken(MySQLParser.INDEX, 0); }
		public TerminalNode KEY() { return getToken(MySQLParser.KEY, 0); }
		public TerminalNode FOR() { return getToken(MySQLParser.FOR, 0); }
		public TerminalNode JOIN() { return getToken(MySQLParser.JOIN, 0); }
		public TerminalNode ORDER() { return getToken(MySQLParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(MySQLParser.BY, 0); }
		public TerminalNode GROUP() { return getToken(MySQLParser.GROUP, 0); }
		public Index_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterIndex_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitIndex_options(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitIndex_options(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_optionsContext index_options() throws RecognitionException {
		Index_optionsContext _localctx = new Index_optionsContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_index_options);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			_la = _input.LA(1);
			if ( !(_la==INDEX || _la==KEY) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(316);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(308);
				match(FOR);
				setState(314);
				switch (_input.LA(1)) {
				case JOIN:
					{
					{
					setState(309);
					match(JOIN);
					}
					}
					break;
				case ORDER:
					{
					{
					setState(310);
					match(ORDER);
					setState(311);
					match(BY);
					}
					}
					break;
				case GROUP:
					{
					{
					setState(312);
					match(GROUP);
					setState(313);
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

	public static class Index_hintContext extends ParserRuleContext {
		public TerminalNode USE() { return getToken(MySQLParser.USE, 0); }
		public Index_optionsContext index_options() {
			return getRuleContext(Index_optionsContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(MySQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MySQLParser.RPAREN, 0); }
		public Index_listContext index_list() {
			return getRuleContext(Index_listContext.class,0);
		}
		public TerminalNode IGNORE() { return getToken(MySQLParser.IGNORE, 0); }
		public Index_hintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_hint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterIndex_hint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitIndex_hint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitIndex_hint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_hintContext index_hint() throws RecognitionException {
		Index_hintContext _localctx = new Index_hintContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_index_hint);
		int _la;
		try {
			setState(332);
			switch (_input.LA(1)) {
			case USE:
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
				match(USE);
				setState(319);
				index_options();
				setState(320);
				match(LPAREN);
				setState(322);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(321);
					index_list();
					}
				}

				setState(324);
				match(RPAREN);
				}
				break;
			case IGNORE:
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
				match(IGNORE);
				setState(327);
				index_options();
				setState(328);
				match(LPAREN);
				setState(329);
				index_list();
				setState(330);
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

	public static class Index_listContext extends ParserRuleContext {
		public List<Index_nameContext> index_name() {
			return getRuleContexts(Index_nameContext.class);
		}
		public Index_nameContext index_name(int i) {
			return getRuleContext(Index_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLParser.COMMA, i);
		}
		public Index_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterIndex_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitIndex_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitIndex_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_listContext index_list() throws RecognitionException {
		Index_listContext _localctx = new Index_listContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_index_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			index_name();
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(335);
				match(COMMA);
				setState(336);
				index_name();
				}
				}
				setState(341);
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

	public static class Partition_clauseContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(MySQLParser.PARTITION, 0); }
		public TerminalNode LPAREN() { return getToken(MySQLParser.LPAREN, 0); }
		public Partition_namesContext partition_names() {
			return getRuleContext(Partition_namesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MySQLParser.RPAREN, 0); }
		public Partition_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterPartition_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitPartition_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitPartition_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Partition_clauseContext partition_clause() throws RecognitionException {
		Partition_clauseContext _localctx = new Partition_clauseContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_partition_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(PARTITION);
			setState(343);
			match(LPAREN);
			setState(344);
			partition_names();
			setState(345);
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

	public static class Partition_namesContext extends ParserRuleContext {
		public List<Partition_nameContext> partition_name() {
			return getRuleContexts(Partition_nameContext.class);
		}
		public Partition_nameContext partition_name(int i) {
			return getRuleContext(Partition_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLParser.COMMA, i);
		}
		public Partition_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition_names; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterPartition_names(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitPartition_names(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitPartition_names(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Partition_namesContext partition_names() throws RecognitionException {
		Partition_namesContext _localctx = new Partition_namesContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_partition_names);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			partition_name();
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(348);
				match(COMMA);
				setState(349);
				partition_name();
				}
				}
				setState(354);
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

	public static class Partition_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MySQLParser.ID, 0); }
		public Partition_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterPartition_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitPartition_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitPartition_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Partition_nameContext partition_name() throws RecognitionException {
		Partition_nameContext _localctx = new Partition_nameContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_partition_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
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

	public static class Subquery_aliasContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MySQLParser.ID, 0); }
		public Subquery_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterSubquery_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitSubquery_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitSubquery_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subquery_aliasContext subquery_alias() throws RecognitionException {
		Subquery_aliasContext _localctx = new Subquery_aliasContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_subquery_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
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
		public Select_clauseContext select_clause() {
			return getRuleContext(Select_clauseContext.class,0);
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
		enterRule(_localctx, 74, RULE_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(LPAREN);
			setState(360);
			select_clause();
			setState(361);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3J\u016e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\6\2P\n\2\r\2\16\2Q\3\3"+
		"\3\3\3\4\3\4\3\4\5\4Y\n\4\3\4\5\4\\\n\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\5\7j\n\7\3\7\3\7\3\7\3\7\3\7\5\7q\n\7\5\7s\n\7\3\b"+
		"\3\b\3\t\3\t\3\n\3\n\3\n\3\n\7\n}\n\n\f\n\16\n\u0080\13\n\3\n\3\n\3\13"+
		"\3\13\3\13\7\13\u0087\n\13\f\13\16\13\u008a\13\13\3\f\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\7\17\u0098\n\17\f\17\16\17\u009b\13"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00a4\n\20\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\5\27\u00b5"+
		"\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00ca\n\30\3\31\3\31\3\31\3\31\7\31"+
		"\u00d0\n\31\f\31\16\31\u00d3\13\31\3\32\3\32\3\33\3\33\3\33\3\33\5\33"+
		"\u00db\n\33\5\33\u00dd\n\33\3\33\3\33\5\33\u00e1\n\33\3\34\3\34\5\34\u00e5"+
		"\n\34\3\34\5\34\u00e8\n\34\3\34\5\34\u00eb\n\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u00fd"+
		"\n\34\3\35\5\35\u0100\n\35\3\35\3\35\3\35\5\35\u0105\n\35\3\35\3\35\3"+
		"\35\3\35\5\35\u010b\n\35\3\35\3\35\5\35\u010f\n\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\5\35\u0118\n\35\5\35\u011a\n\35\3\35\3\35\5\35\u011e\n"+
		"\35\3\36\3\36\3\36\3\36\3\36\7\36\u0125\n\36\f\36\16\36\u0128\13\36\3"+
		"\36\3\36\5\36\u012c\n\36\3\37\3\37\3\37\7\37\u0131\n\37\f\37\16\37\u0134"+
		"\13\37\3 \3 \3 \3 \3 \3 \3 \5 \u013d\n \5 \u013f\n \3!\3!\3!\3!\5!\u0145"+
		"\n!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u014f\n!\3\"\3\"\3\"\7\"\u0154\n\"\f\""+
		"\16\"\u0157\13\"\3#\3#\3#\3#\3#\3$\3$\3$\7$\u0161\n$\f$\16$\u0164\13$"+
		"\3%\3%\3&\3&\3\'\3\'\3\'\3\'\3\'\2\2(\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL\2\7\4\2&)+,\4\2\6\b**\3\2AB\4\2"+
		"\61\61\64\64\3\2\66\67\u017b\2O\3\2\2\2\4S\3\2\2\2\6U\3\2\2\2\b]\3\2\2"+
		"\2\n_\3\2\2\2\fr\3\2\2\2\16t\3\2\2\2\20v\3\2\2\2\22x\3\2\2\2\24\u0083"+
		"\3\2\2\2\26\u008b\3\2\2\2\30\u008e\3\2\2\2\32\u0090\3\2\2\2\34\u0093\3"+
		"\2\2\2\36\u00a3\3\2\2\2 \u00a5\3\2\2\2\"\u00a7\3\2\2\2$\u00a9\3\2\2\2"+
		"&\u00ab\3\2\2\2(\u00ad\3\2\2\2*\u00af\3\2\2\2,\u00b4\3\2\2\2.\u00c9\3"+
		"\2\2\2\60\u00cb\3\2\2\2\62\u00d4\3\2\2\2\64\u00d6\3\2\2\2\66\u00fc\3\2"+
		"\2\28\u011d\3\2\2\2:\u012b\3\2\2\2<\u012d\3\2\2\2>\u0135\3\2\2\2@\u014e"+
		"\3\2\2\2B\u0150\3\2\2\2D\u0158\3\2\2\2F\u015d\3\2\2\2H\u0165\3\2\2\2J"+
		"\u0167\3\2\2\2L\u0169\3\2\2\2NP\5\6\4\2ON\3\2\2\2PQ\3\2\2\2QO\3\2\2\2"+
		"QR\3\2\2\2R\3\3\2\2\2ST\7E\2\2T\5\3\2\2\2UV\7\3\2\2VX\5\24\13\2WY\5\26"+
		"\f\2XW\3\2\2\2XY\3\2\2\2Y[\3\2\2\2Z\\\5\32\16\2[Z\3\2\2\2[\\\3\2\2\2\\"+
		"\7\3\2\2\2]^\7E\2\2^\t\3\2\2\2_`\7E\2\2`\13\3\2\2\2as\7 \2\2bc\5\n\6\2"+
		"cd\7/\2\2de\7 \2\2es\3\2\2\2fg\5\n\6\2gh\7/\2\2hj\3\2\2\2if\3\2\2\2ij"+
		"\3\2\2\2jk\3\2\2\2ks\7E\2\2ls\7F\2\2ms\7G\2\2np\7J\2\2oq\5\16\b\2po\3"+
		"\2\2\2pq\3\2\2\2qs\3\2\2\2ra\3\2\2\2rb\3\2\2\2ri\3\2\2\2rl\3\2\2\2rm\3"+
		"\2\2\2rn\3\2\2\2s\r\3\2\2\2tu\7E\2\2u\17\3\2\2\2vw\7E\2\2w\21\3\2\2\2"+
		"xy\7\"\2\2y~\5\f\7\2z{\7.\2\2{}\5\f\7\2|z\3\2\2\2}\u0080\3\2\2\2~|\3\2"+
		"\2\2~\177\3\2\2\2\177\u0081\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\7!\2\2"+
		"\u0082\23\3\2\2\2\u0083\u0088\5\f\7\2\u0084\u0085\7.\2\2\u0085\u0087\5"+
		"\f\7\2\u0086\u0084\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\25\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008c\7\4\2"+
		"\2\u008c\u008d\5\60\31\2\u008d\27\3\2\2\2\u008e\u008f\7\3\2\2\u008f\31"+
		"\3\2\2\2\u0090\u0091\7\5\2\2\u0091\u0092\5\34\17\2\u0092\33\3\2\2\2\u0093"+
		"\u0099\5.\30\2\u0094\u0095\5(\25\2\u0095\u0096\5.\30\2\u0096\u0098\3\2"+
		"\2\2\u0097\u0094\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\35\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u00a4\7J\2\2"+
		"\u009d\u00a4\7E\2\2\u009e\u009f\7\31\2\2\u009f\u00a0\7E\2\2\u00a0\u00a4"+
		"\7\31\2\2\u00a1\u00a4\7F\2\2\u00a2\u00a4\5\f\7\2\u00a3\u009c\3\2\2\2\u00a3"+
		"\u009d\3\2\2\2\u00a3\u009e\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2"+
		"\2\2\u00a4\37\3\2\2\2\u00a5\u00a6\5\36\20\2\u00a6!\3\2\2\2\u00a7\u00a8"+
		"\5\36\20\2\u00a8#\3\2\2\2\u00a9\u00aa\5\36\20\2\u00aa%\3\2\2\2\u00ab\u00ac"+
		"\t\2\2\2\u00ac\'\3\2\2\2\u00ad\u00ae\t\3\2\2\u00ae)\3\2\2\2\u00af\u00b0"+
		"\7\24\2\2\u00b0+\3\2\2\2\u00b1\u00b5\7\t\2\2\u00b2\u00b3\7\t\2\2\u00b3"+
		"\u00b5\7*\2\2\u00b4\u00b1\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5-\3\2\2\2\u00b6"+
		"\u00b7\5\"\22\2\u00b7\u00b8\5&\24\2\u00b8\u00b9\5 \21\2\u00b9\u00ca\3"+
		"\2\2\2\u00ba\u00bb\5$\23\2\u00bb\u00bc\5*\26\2\u00bc\u00bd\5\"\22\2\u00bd"+
		"\u00be\7\6\2\2\u00be\u00bf\5 \21\2\u00bf\u00ca\3\2\2\2\u00c0\u00c1\5$"+
		"\23\2\u00c1\u00c2\5,\27\2\u00c2\u00c3\7\n\2\2\u00c3\u00ca\3\2\2\2\u00c4"+
		"\u00c5\7\r\2\2\u00c5\u00ca\5L\'\2\u00c6\u00c7\7*\2\2\u00c7\u00c8\7\r\2"+
		"\2\u00c8\u00ca\5L\'\2\u00c9\u00b6\3\2\2\2\u00c9\u00ba\3\2\2\2\u00c9\u00c0"+
		"\3\2\2\2\u00c9\u00c4\3\2\2\2\u00c9\u00c6\3\2\2\2\u00ca/\3\2\2\2\u00cb"+
		"\u00d1\5\62\32\2\u00cc\u00cd\7.\2\2\u00cd\u00d0\5\62\32\2\u00ce\u00d0"+
		"\58\35\2\u00cf\u00cc\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1"+
		"\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\61\3\2\2\2\u00d3\u00d1\3\2\2"+
		"\2\u00d4\u00d5\5\66\34\2\u00d5\63\3\2\2\2\u00d6\u00e0\5\66\34\2\u00d7"+
		"\u00dc\7@\2\2\u00d8\u00da\t\4\2\2\u00d9\u00db\7\62\2\2\u00da\u00d9\3\2"+
		"\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00d8\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\7\63\2\2\u00df\u00e1\5"+
		"\66\34\2\u00e0\u00d7\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\65\3\2\2\2\u00e2"+
		"\u00e4\5\b\5\2\u00e3\u00e5\5D#\2\u00e4\u00e3\3\2\2\2\u00e4\u00e5\3\2\2"+
		"\2\u00e5\u00e7\3\2\2\2\u00e6\u00e8\5\n\6\2\u00e7\u00e6\3\2\2\2\u00e7\u00e8"+
		"\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00eb\5<\37\2\u00ea\u00e9\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb\u00fd\3\2\2\2\u00ec\u00ed\5L\'\2\u00ed\u00ee\5J&"+
		"\2\u00ee\u00fd\3\2\2\2\u00ef\u00f0\7\"\2\2\u00f0\u00f1\5\60\31\2\u00f1"+
		"\u00f2\7!\2\2\u00f2\u00fd\3\2\2\2\u00f3\u00f4\7C\2\2\u00f4\u00f5\5\62"+
		"\32\2\u00f5\u00f6\7A\2\2\u00f6\u00f7\7\62\2\2\u00f7\u00f8\7\63\2\2\u00f8"+
		"\u00f9\5\62\32\2\u00f9\u00fa\7D\2\2\u00fa\u00fb\5\34\17\2\u00fb\u00fd"+
		"\3\2\2\2\u00fc\u00e2\3\2\2\2\u00fc\u00ec\3\2\2\2\u00fc\u00ef\3\2\2\2\u00fc"+
		"\u00f3\3\2\2\2\u00fd\67\3\2\2\2\u00fe\u0100\t\5\2\2\u00ff\u00fe\3\2\2"+
		"\2\u00ff\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\7\63\2\2\u0102"+
		"\u0104\5\66\34\2\u0103\u0105\5:\36\2\u0104\u0103\3\2\2\2\u0104\u0105\3"+
		"\2\2\2\u0105\u011e\3\2\2\2\u0106\u0107\7?\2\2\u0107\u010a\5\66\34\2\u0108"+
		"\u0109\7D\2\2\u0109\u010b\5\34\17\2\u010a\u0108\3\2\2\2\u010a\u010b\3"+
		"\2\2\2\u010b\u011e\3\2\2\2\u010c\u010e\t\4\2\2\u010d\u010f\7\62\2\2\u010e"+
		"\u010d\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\7\63"+
		"\2\2\u0111\u0112\5\64\33\2\u0112\u0113\5:\36\2\u0113\u011e\3\2\2\2\u0114"+
		"\u0119\7@\2\2\u0115\u0117\t\4\2\2\u0116\u0118\7\62\2\2\u0117\u0116\3\2"+
		"\2\2\u0117\u0118\3\2\2\2\u0118\u011a\3\2\2\2\u0119\u0115\3\2\2\2\u0119"+
		"\u011a\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\7\63\2\2\u011c\u011e\5"+
		"\66\34\2\u011d\u00ff\3\2\2\2\u011d\u0106\3\2\2\2\u011d\u010c\3\2\2\2\u011d"+
		"\u0114\3\2\2\2\u011e9\3\2\2\2\u011f\u0120\7D\2\2\u0120\u0126\5\34\17\2"+
		"\u0121\u0122\5(\25\2\u0122\u0123\5\34\17\2\u0123\u0125\3\2\2\2\u0124\u0121"+
		"\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127"+
		"\u012c\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012a\7\65\2\2\u012a\u012c\5"+
		"\22\n\2\u012b\u011f\3\2\2\2\u012b\u0129\3\2\2\2\u012c;\3\2\2\2\u012d\u0132"+
		"\5@!\2\u012e\u012f\7.\2\2\u012f\u0131\5@!\2\u0130\u012e\3\2\2\2\u0131"+
		"\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133=\3\2\2\2"+
		"\u0134\u0132\3\2\2\2\u0135\u013e\t\6\2\2\u0136\u013c\7;\2\2\u0137\u013d"+
		"\7\63\2\2\u0138\u0139\78\2\2\u0139\u013d\7:\2\2\u013a\u013b\79\2\2\u013b"+
		"\u013d\7:\2\2\u013c\u0137\3\2\2\2\u013c\u0138\3\2\2\2\u013c\u013a\3\2"+
		"\2\2\u013d\u013f\3\2\2\2\u013e\u0136\3\2\2\2\u013e\u013f\3\2\2\2\u013f"+
		"?\3\2\2\2\u0140\u0141\7<\2\2\u0141\u0142\5> \2\u0142\u0144\7\"\2\2\u0143"+
		"\u0145\5B\"\2\u0144\u0143\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146\3\2"+
		"\2\2\u0146\u0147\7!\2\2\u0147\u014f\3\2\2\2\u0148\u0149\7=\2\2\u0149\u014a"+
		"\5> \2\u014a\u014b\7\"\2\2\u014b\u014c\5B\"\2\u014c\u014d\7!\2\2\u014d"+
		"\u014f\3\2\2\2\u014e\u0140\3\2\2\2\u014e\u0148\3\2\2\2\u014fA\3\2\2\2"+
		"\u0150\u0155\5\20\t\2\u0151\u0152\7.\2\2\u0152\u0154\5\20\t\2\u0153\u0151"+
		"\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156"+
		"C\3\2\2\2\u0157\u0155\3\2\2\2\u0158\u0159\7>\2\2\u0159\u015a\7\"\2\2\u015a"+
		"\u015b\5F$\2\u015b\u015c\7!\2\2\u015cE\3\2\2\2\u015d\u0162\5H%\2\u015e"+
		"\u015f\7.\2\2\u015f\u0161\5H%\2\u0160\u015e\3\2\2\2\u0161\u0164\3\2\2"+
		"\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163G\3\2\2\2\u0164\u0162"+
		"\3\2\2\2\u0165\u0166\7E\2\2\u0166I\3\2\2\2\u0167\u0168\7E\2\2\u0168K\3"+
		"\2\2\2\u0169\u016a\7\"\2\2\u016a\u016b\5\6\4\2\u016b\u016c\7!\2\2\u016c"+
		"M\3\2\2\2\'QX[ipr~\u0088\u0099\u00a3\u00b4\u00c9\u00cf\u00d1\u00da\u00dc"+
		"\u00e0\u00e4\u00e7\u00ea\u00fc\u00ff\u0104\u010a\u010e\u0117\u0119\u011d"+
		"\u0126\u012b\u0132\u013c\u013e\u0144\u014e\u0155\u0162";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}