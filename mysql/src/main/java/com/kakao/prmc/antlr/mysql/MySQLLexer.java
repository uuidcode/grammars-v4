// Generated from MySQLLexer.g4 by ANTLR 4.5.3
package com.kakao.prmc.antlr.mysql;
 
 
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MySQLLexer extends Lexer {
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
		NEWLINE=72, WS=73, USER_VAR=74;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SELECT", "FROM", "WHERE", "AND", "OR", "XOR", "IS", "NULL", "LIKE", "IN", 
		"EXISTS", "ALL", "ANY", "TRUE", "FALSE", "DIVIDE", "MOD", "BETWEEN", "REGEXP", 
		"PLUS", "MINUS", "NEGATION", "VERTBAR", "BITAND", "POWER_OP", "BINARY", 
		"SHIFT_LEFT", "SHIFT_RIGHT", "ESCAPE", "ASTERISK", "RPAREN", "LPAREN", 
		"RBRACK", "LBRACK", "COLON", "EQ", "LTH", "GTH", "NOT_EQ", "NOT", "LET", 
		"GET", "SEMI", "COMMA", "DOT", "COLLATE", "INNER", "OUTER", "JOIN", "CROSS", 
		"USING", "INDEX", "KEY", "ORDER", "GROUP", "BY", "FOR", "USE", "IGNORE", 
		"PARTITION", "STRAIGHT_JOIN", "NATURAL", "LEFT", "RIGHT", "OJ", "ON", 
		"ASC", "DESC", "ID", "INT", "STRING", "NEWLINE", "WS", "USER_VAR", "USER_VAR_SUBFIX1", 
		"USER_VAR_SUBFIX2", "USER_VAR_SUBFIX3", "USER_VAR_SUBFIX4"
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
		"ON", "ASC", "DESC", "ID", "INT", "STRING", "NEWLINE", "WS", "USER_VAR"
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


	public MySQLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MySQLLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2L\u021b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5\u00b7"+
		"\n\5\3\6\3\6\3\6\3\6\5\6\u00bd\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u00f1\n\21\3\22"+
		"\3\22\3\22\3\22\5\22\u00f7\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3 \3"+
		" \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3)\3)\3)\3)\3"+
		"*\3*\3*\3+\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3"+
		"\62\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3"+
		"\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3"+
		"\67\38\38\38\38\38\38\39\39\39\3:\3:\3:\3:\3;\3;\3;\3;\3<\3<\3<\3<\3<"+
		"\3<\3<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>"+
		"\3>\3>\3>\3?\3?\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3B"+
		"\3B\3B\3C\3C\3C\3D\3D\3D\3D\3E\3E\3E\3E\3E\3F\6F\u01d5\nF\rF\16F\u01d6"+
		"\3F\5F\u01da\nF\3G\6G\u01dd\nG\rG\16G\u01de\3H\3H\6H\u01e3\nH\rH\16H\u01e4"+
		"\3H\3H\3I\5I\u01ea\nI\3I\3I\3I\3I\3J\6J\u01f1\nJ\rJ\16J\u01f2\3J\3J\3"+
		"K\3K\3K\3K\3K\5K\u01fc\nK\3L\3L\6L\u0200\nL\rL\16L\u0201\3L\3L\3M\3M\6"+
		"M\u0208\nM\rM\16M\u0209\3M\3M\3N\3N\6N\u0210\nN\rN\16N\u0211\3N\3N\3O"+
		"\3O\6O\u0218\nO\rO\16O\u0219\2\2P\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60"+
		"_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085"+
		"D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097\2\u0099"+
		"\2\u009b\2\u009d\2\3\2\b\5\2C\\aac|\3\2))\5\2\13\f\17\17\"\"\3\2bb\3\2"+
		"$$\7\2&&\62;C\\aac|\u0228\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2"+
		"\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]"+
		"\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2"+
		"\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2"+
		"\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2"+
		"\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2"+
		"\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093"+
		"\3\2\2\2\2\u0095\3\2\2\2\3\u009f\3\2\2\2\5\u00a6\3\2\2\2\7\u00ab\3\2\2"+
		"\2\t\u00b6\3\2\2\2\13\u00bc\3\2\2\2\r\u00be\3\2\2\2\17\u00c2\3\2\2\2\21"+
		"\u00c5\3\2\2\2\23\u00ca\3\2\2\2\25\u00cf\3\2\2\2\27\u00d2\3\2\2\2\31\u00d9"+
		"\3\2\2\2\33\u00dd\3\2\2\2\35\u00e1\3\2\2\2\37\u00e6\3\2\2\2!\u00f0\3\2"+
		"\2\2#\u00f6\3\2\2\2%\u00f8\3\2\2\2\'\u0100\3\2\2\2)\u0107\3\2\2\2+\u0109"+
		"\3\2\2\2-\u010b\3\2\2\2/\u010d\3\2\2\2\61\u010f\3\2\2\2\63\u0111\3\2\2"+
		"\2\65\u0113\3\2\2\2\67\u011a\3\2\2\29\u011d\3\2\2\2;\u0120\3\2\2\2=\u0127"+
		"\3\2\2\2?\u0129\3\2\2\2A\u012b\3\2\2\2C\u012d\3\2\2\2E\u012f\3\2\2\2G"+
		"\u0131\3\2\2\2I\u0133\3\2\2\2K\u0135\3\2\2\2M\u0137\3\2\2\2O\u0139\3\2"+
		"\2\2Q\u013c\3\2\2\2S\u0140\3\2\2\2U\u0143\3\2\2\2W\u0146\3\2\2\2Y\u0148"+
		"\3\2\2\2[\u014a\3\2\2\2]\u014c\3\2\2\2_\u0154\3\2\2\2a\u015a\3\2\2\2c"+
		"\u0160\3\2\2\2e\u0165\3\2\2\2g\u016b\3\2\2\2i\u0171\3\2\2\2k\u0177\3\2"+
		"\2\2m\u017b\3\2\2\2o\u0181\3\2\2\2q\u0187\3\2\2\2s\u018a\3\2\2\2u\u018e"+
		"\3\2\2\2w\u0192\3\2\2\2y\u0199\3\2\2\2{\u01a3\3\2\2\2}\u01b1\3\2\2\2\177"+
		"\u01b9\3\2\2\2\u0081\u01be\3\2\2\2\u0083\u01c4\3\2\2\2\u0085\u01c7\3\2"+
		"\2\2\u0087\u01ca\3\2\2\2\u0089\u01ce\3\2\2\2\u008b\u01d4\3\2\2\2\u008d"+
		"\u01dc\3\2\2\2\u008f\u01e0\3\2\2\2\u0091\u01e9\3\2\2\2\u0093\u01f0\3\2"+
		"\2\2\u0095\u01f6\3\2\2\2\u0097\u01fd\3\2\2\2\u0099\u0205\3\2\2\2\u009b"+
		"\u020d\3\2\2\2\u009d\u0217\3\2\2\2\u009f\u00a0\7u\2\2\u00a0\u00a1\7g\2"+
		"\2\u00a1\u00a2\7n\2\2\u00a2\u00a3\7g\2\2\u00a3\u00a4\7e\2\2\u00a4\u00a5"+
		"\7v\2\2\u00a5\4\3\2\2\2\u00a6\u00a7\7h\2\2\u00a7\u00a8\7t\2\2\u00a8\u00a9"+
		"\7q\2\2\u00a9\u00aa\7o\2\2\u00aa\6\3\2\2\2\u00ab\u00ac\7y\2\2\u00ac\u00ad"+
		"\7j\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af\7t\2\2\u00af\u00b0\7g\2\2\u00b0"+
		"\b\3\2\2\2\u00b1\u00b2\7c\2\2\u00b2\u00b3\7p\2\2\u00b3\u00b7\7f\2\2\u00b4"+
		"\u00b5\7(\2\2\u00b5\u00b7\7(\2\2\u00b6\u00b1\3\2\2\2\u00b6\u00b4\3\2\2"+
		"\2\u00b7\n\3\2\2\2\u00b8\u00b9\7q\2\2\u00b9\u00bd\7t\2\2\u00ba\u00bb\7"+
		"~\2\2\u00bb\u00bd\7~\2\2\u00bc\u00b8\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd"+
		"\f\3\2\2\2\u00be\u00bf\7z\2\2\u00bf\u00c0\7q\2\2\u00c0\u00c1\7t\2\2\u00c1"+
		"\16\3\2\2\2\u00c2\u00c3\7k\2\2\u00c3\u00c4\7u\2\2\u00c4\20\3\2\2\2\u00c5"+
		"\u00c6\7p\2\2\u00c6\u00c7\7w\2\2\u00c7\u00c8\7n\2\2\u00c8\u00c9\7n\2\2"+
		"\u00c9\22\3\2\2\2\u00ca\u00cb\7n\2\2\u00cb\u00cc\7k\2\2\u00cc\u00cd\7"+
		"m\2\2\u00cd\u00ce\7g\2\2\u00ce\24\3\2\2\2\u00cf\u00d0\7k\2\2\u00d0\u00d1"+
		"\7p\2\2\u00d1\26\3\2\2\2\u00d2\u00d3\7g\2\2\u00d3\u00d4\7z\2\2\u00d4\u00d5"+
		"\7k\2\2\u00d5\u00d6\7u\2\2\u00d6\u00d7\7v\2\2\u00d7\u00d8\7u\2\2\u00d8"+
		"\30\3\2\2\2\u00d9\u00da\7c\2\2\u00da\u00db\7n\2\2\u00db\u00dc\7n\2\2\u00dc"+
		"\32\3\2\2\2\u00dd\u00de\7c\2\2\u00de\u00df\7p\2\2\u00df\u00e0\7{\2\2\u00e0"+
		"\34\3\2\2\2\u00e1\u00e2\7v\2\2\u00e2\u00e3\7t\2\2\u00e3\u00e4\7w\2\2\u00e4"+
		"\u00e5\7g\2\2\u00e5\36\3\2\2\2\u00e6\u00e7\7h\2\2\u00e7\u00e8\7c\2\2\u00e8"+
		"\u00e9\7n\2\2\u00e9\u00ea\7u\2\2\u00ea\u00eb\7g\2\2\u00eb \3\2\2\2\u00ec"+
		"\u00ed\7f\2\2\u00ed\u00ee\7k\2\2\u00ee\u00f1\7x\2\2\u00ef\u00f1\7\61\2"+
		"\2\u00f0\u00ec\3\2\2\2\u00f0\u00ef\3\2\2\2\u00f1\"\3\2\2\2\u00f2\u00f3"+
		"\7o\2\2\u00f3\u00f4\7q\2\2\u00f4\u00f7\7f\2\2\u00f5\u00f7\7\'\2\2\u00f6"+
		"\u00f2\3\2\2\2\u00f6\u00f5\3\2\2\2\u00f7$\3\2\2\2\u00f8\u00f9\7d\2\2\u00f9"+
		"\u00fa\7g\2\2\u00fa\u00fb\7v\2\2\u00fb\u00fc\7y\2\2\u00fc\u00fd\7g\2\2"+
		"\u00fd\u00fe\7g\2\2\u00fe\u00ff\7p\2\2\u00ff&\3\2\2\2\u0100\u0101\7t\2"+
		"\2\u0101\u0102\7g\2\2\u0102\u0103\7i\2\2\u0103\u0104\7g\2\2\u0104\u0105"+
		"\7z\2\2\u0105\u0106\7r\2\2\u0106(\3\2\2\2\u0107\u0108\7-\2\2\u0108*\3"+
		"\2\2\2\u0109\u010a\7/\2\2\u010a,\3\2\2\2\u010b\u010c\7\u0080\2\2\u010c"+
		".\3\2\2\2\u010d\u010e\7~\2\2\u010e\60\3\2\2\2\u010f\u0110\7(\2\2\u0110"+
		"\62\3\2\2\2\u0111\u0112\7`\2\2\u0112\64\3\2\2\2\u0113\u0114\7d\2\2\u0114"+
		"\u0115\7k\2\2\u0115\u0116\7p\2\2\u0116\u0117\7c\2\2\u0117\u0118\7t\2\2"+
		"\u0118\u0119\7{\2\2\u0119\66\3\2\2\2\u011a\u011b\7>\2\2\u011b\u011c\7"+
		">\2\2\u011c8\3\2\2\2\u011d\u011e\7@\2\2\u011e\u011f\7@\2\2\u011f:\3\2"+
		"\2\2\u0120\u0121\7g\2\2\u0121\u0122\7u\2\2\u0122\u0123\7e\2\2\u0123\u0124"+
		"\7c\2\2\u0124\u0125\7r\2\2\u0125\u0126\7g\2\2\u0126<\3\2\2\2\u0127\u0128"+
		"\7,\2\2\u0128>\3\2\2\2\u0129\u012a\7+\2\2\u012a@\3\2\2\2\u012b\u012c\7"+
		"*\2\2\u012cB\3\2\2\2\u012d\u012e\7_\2\2\u012eD\3\2\2\2\u012f\u0130\7]"+
		"\2\2\u0130F\3\2\2\2\u0131\u0132\7<\2\2\u0132H\3\2\2\2\u0133\u0134\7?\2"+
		"\2\u0134J\3\2\2\2\u0135\u0136\7>\2\2\u0136L\3\2\2\2\u0137\u0138\7@\2\2"+
		"\u0138N\3\2\2\2\u0139\u013a\7#\2\2\u013a\u013b\7?\2\2\u013bP\3\2\2\2\u013c"+
		"\u013d\7p\2\2\u013d\u013e\7q\2\2\u013e\u013f\7v\2\2\u013fR\3\2\2\2\u0140"+
		"\u0141\7>\2\2\u0141\u0142\7?\2\2\u0142T\3\2\2\2\u0143\u0144\7@\2\2\u0144"+
		"\u0145\7?\2\2\u0145V\3\2\2\2\u0146\u0147\7=\2\2\u0147X\3\2\2\2\u0148\u0149"+
		"\7.\2\2\u0149Z\3\2\2\2\u014a\u014b\7\60\2\2\u014b\\\3\2\2\2\u014c\u014d"+
		"\7e\2\2\u014d\u014e\7q\2\2\u014e\u014f\7n\2\2\u014f\u0150\7n\2\2\u0150"+
		"\u0151\7c\2\2\u0151\u0152\7v\2\2\u0152\u0153\7g\2\2\u0153^\3\2\2\2\u0154"+
		"\u0155\7k\2\2\u0155\u0156\7p\2\2\u0156\u0157\7p\2\2\u0157\u0158\7g\2\2"+
		"\u0158\u0159\7t\2\2\u0159`\3\2\2\2\u015a\u015b\7q\2\2\u015b\u015c\7w\2"+
		"\2\u015c\u015d\7v\2\2\u015d\u015e\7g\2\2\u015e\u015f\7t\2\2\u015fb\3\2"+
		"\2\2\u0160\u0161\7l\2\2\u0161\u0162\7q\2\2\u0162\u0163\7k\2\2\u0163\u0164"+
		"\7p\2\2\u0164d\3\2\2\2\u0165\u0166\7e\2\2\u0166\u0167\7t\2\2\u0167\u0168"+
		"\7q\2\2\u0168\u0169\7u\2\2\u0169\u016a\7u\2\2\u016af\3\2\2\2\u016b\u016c"+
		"\7w\2\2\u016c\u016d\7u\2\2\u016d\u016e\7k\2\2\u016e\u016f\7p\2\2\u016f"+
		"\u0170\7i\2\2\u0170h\3\2\2\2\u0171\u0172\7k\2\2\u0172\u0173\7p\2\2\u0173"+
		"\u0174\7f\2\2\u0174\u0175\7g\2\2\u0175\u0176\7z\2\2\u0176j\3\2\2\2\u0177"+
		"\u0178\7m\2\2\u0178\u0179\7g\2\2\u0179\u017a\7{\2\2\u017al\3\2\2\2\u017b"+
		"\u017c\7q\2\2\u017c\u017d\7t\2\2\u017d\u017e\7f\2\2\u017e\u017f\7g\2\2"+
		"\u017f\u0180\7t\2\2\u0180n\3\2\2\2\u0181\u0182\7i\2\2\u0182\u0183\7t\2"+
		"\2\u0183\u0184\7q\2\2\u0184\u0185\7w\2\2\u0185\u0186\7r\2\2\u0186p\3\2"+
		"\2\2\u0187\u0188\7d\2\2\u0188\u0189\7{\2\2\u0189r\3\2\2\2\u018a\u018b"+
		"\7h\2\2\u018b\u018c\7q\2\2\u018c\u018d\7t\2\2\u018dt\3\2\2\2\u018e\u018f"+
		"\7w\2\2\u018f\u0190\7u\2\2\u0190\u0191\7g\2\2\u0191v\3\2\2\2\u0192\u0193"+
		"\7k\2\2\u0193\u0194\7i\2\2\u0194\u0195\7p\2\2\u0195\u0196\7q\2\2\u0196"+
		"\u0197\7t\2\2\u0197\u0198\7g\2\2\u0198x\3\2\2\2\u0199\u019a\7r\2\2\u019a"+
		"\u019b\7c\2\2\u019b\u019c\7t\2\2\u019c\u019d\7v\2\2\u019d\u019e\7k\2\2"+
		"\u019e\u019f\7v\2\2\u019f\u01a0\7k\2\2\u01a0\u01a1\7q\2\2\u01a1\u01a2"+
		"\7p\2\2\u01a2z\3\2\2\2\u01a3\u01a4\7u\2\2\u01a4\u01a5\7v\2\2\u01a5\u01a6"+
		"\7t\2\2\u01a6\u01a7\7c\2\2\u01a7\u01a8\7k\2\2\u01a8\u01a9\7i\2\2\u01a9"+
		"\u01aa\7j\2\2\u01aa\u01ab\7v\2\2\u01ab\u01ac\7a\2\2\u01ac\u01ad\7l\2\2"+
		"\u01ad\u01ae\7q\2\2\u01ae\u01af\7k\2\2\u01af\u01b0\7p\2\2\u01b0|\3\2\2"+
		"\2\u01b1\u01b2\7p\2\2\u01b2\u01b3\7c\2\2\u01b3\u01b4\7v\2\2\u01b4\u01b5"+
		"\7w\2\2\u01b5\u01b6\7t\2\2\u01b6\u01b7\7c\2\2\u01b7\u01b8\7n\2\2\u01b8"+
		"~\3\2\2\2\u01b9\u01ba\7n\2\2\u01ba\u01bb\7g\2\2\u01bb\u01bc\7h\2\2\u01bc"+
		"\u01bd\7v\2\2\u01bd\u0080\3\2\2\2\u01be\u01bf\7t\2\2\u01bf\u01c0\7k\2"+
		"\2\u01c0\u01c1\7i\2\2\u01c1\u01c2\7j\2\2\u01c2\u01c3\7v\2\2\u01c3\u0082"+
		"\3\2\2\2\u01c4\u01c5\7q\2\2\u01c5\u01c6\7l\2\2\u01c6\u0084\3\2\2\2\u01c7"+
		"\u01c8\7q\2\2\u01c8\u01c9\7p\2\2\u01c9\u0086\3\2\2\2\u01ca\u01cb\7c\2"+
		"\2\u01cb\u01cc\7u\2\2\u01cc\u01cd\7e\2\2\u01cd\u0088\3\2\2\2\u01ce\u01cf"+
		"\7f\2\2\u01cf\u01d0\7g\2\2\u01d0\u01d1\7u\2\2\u01d1\u01d2\7e\2\2\u01d2"+
		"\u008a\3\2\2\2\u01d3\u01d5\t\2\2\2\u01d4\u01d3\3\2\2\2\u01d5\u01d6\3\2"+
		"\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d9\3\2\2\2\u01d8"+
		"\u01da\4\62;\2\u01d9\u01d8\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u008c\3\2"+
		"\2\2\u01db\u01dd\4\62;\2\u01dc\u01db\3\2\2\2\u01dd\u01de\3\2\2\2\u01de"+
		"\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u008e\3\2\2\2\u01e0\u01e2\7)"+
		"\2\2\u01e1\u01e3\n\3\2\2\u01e2\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4"+
		"\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7\7)"+
		"\2\2\u01e7\u0090\3\2\2\2\u01e8\u01ea\7\17\2\2\u01e9\u01e8\3\2\2\2\u01e9"+
		"\u01ea\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ec\7\f\2\2\u01ec\u01ed\3\2"+
		"\2\2\u01ed\u01ee\bI\2\2\u01ee\u0092\3\2\2\2\u01ef\u01f1\t\4\2\2\u01f0"+
		"\u01ef\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f2\u01f3\3\2"+
		"\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f5\bJ\2\2\u01f5\u0094\3\2\2\2\u01f6"+
		"\u01fb\7B\2\2\u01f7\u01fc\5\u0097L\2\u01f8\u01fc\5\u0099M\2\u01f9\u01fc"+
		"\5\u009bN\2\u01fa\u01fc\5\u009dO\2\u01fb\u01f7\3\2\2\2\u01fb\u01f8\3\2"+
		"\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fa\3\2\2\2\u01fc\u0096\3\2\2\2\u01fd"+
		"\u01ff\7b\2\2\u01fe\u0200\n\5\2\2\u01ff\u01fe\3\2\2\2\u0200\u0201\3\2"+
		"\2\2\u0201\u01ff\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0203\3\2\2\2\u0203"+
		"\u0204\7b\2\2\u0204\u0098\3\2\2\2\u0205\u0207\7)\2\2\u0206\u0208\n\3\2"+
		"\2\u0207\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u0207\3\2\2\2\u0209\u020a"+
		"\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020c\7)\2\2\u020c\u009a\3\2\2\2\u020d"+
		"\u020f\7$\2\2\u020e\u0210\n\6\2\2\u020f\u020e\3\2\2\2\u0210\u0211\3\2"+
		"\2\2\u0211\u020f\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0213\3\2\2\2\u0213"+
		"\u0214\7$\2\2\u0214\u009c\3\2\2\2\u0215\u0218\t\7\2\2\u0216\u0218\5[."+
		"\2\u0217\u0215\3\2\2\2\u0217\u0216\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u0217"+
		"\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u009e\3\2\2\2\23\2\u00b6\u00bc\u00f0"+
		"\u00f6\u01d6\u01d9\u01de\u01e4\u01e9\u01f2\u01fb\u0201\u0209\u0211\u0217"+
		"\u0219\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}