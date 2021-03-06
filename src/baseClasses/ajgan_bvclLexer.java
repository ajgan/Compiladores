package baseClasses;
// Generated from ajgan_bvcl.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ajgan_bvclLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__34=1, T__33=2, T__32=3, T__31=4, T__30=5, T__29=6, T__28=7, T__27=8, 
		T__26=9, T__25=10, T__24=11, T__23=12, T__22=13, T__21=14, T__20=15, T__19=16, 
		T__18=17, T__17=18, T__16=19, T__15=20, T__14=21, T__13=22, T__12=23, 
		T__11=24, T__10=25, T__9=26, T__8=27, T__7=28, T__6=29, T__5=30, T__4=31, 
		T__3=32, T__2=33, T__1=34, T__0=35, IDENTIFIER=36, INTEGER_LITERAL=37, 
		ESPACOS=38, COMENTARIO_LINHA=39;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''"
	};
	public static final String[] ruleNames = {
		"T__34", "T__33", "T__32", "T__31", "T__30", "T__29", "T__28", "T__27", 
		"T__26", "T__25", "T__24", "T__23", "T__22", "T__21", "T__20", "T__19", 
		"T__18", "T__17", "T__16", "T__15", "T__14", "T__13", "T__12", "T__11", 
		"T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", 
		"T__1", "T__0", "IDENTIFIER", "INTEGER_LITERAL", "ESPACOS", "COMENTARIO_LINHA"
	};


	public ajgan_bvclLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ajgan_bvcl.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2)\u0113\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3"+
		"\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3 \3 "+
		"\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\5%\u00f0\n%\3%\3"+
		"%\5%\u00f4\n%\7%\u00f6\n%\f%\16%\u00f9\13%\3&\3&\3&\7&\u00fe\n&\f&\16"+
		"&\u0101\13&\5&\u0103\n&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\7(\u010d\n(\f(\16"+
		"(\u0110\13(\3(\3(\2\2)\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)\3\2\t\5\2C\\aac|\5\2\62;C\\"+
		"c|\3\2\62\62\3\2\63;\3\2\62;\5\2\13\f\17\17\"\"\3\2\f\f\u0117\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3"+
		"\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\3Q\3\2\2\2\5V\3\2\2\2\7]\3\2\2"+
		"\2\ta\3\2\2\2\13f\3\2\2\2\rm\3\2\2\2\17s\3\2\2\2\21y\3\2\2\2\23{\3\2\2"+
		"\2\25\u0080\3\2\2\2\27\u0082\3\2\2\2\31\u0085\3\2\2\2\33\u0087\3\2\2\2"+
		"\35\u008f\3\2\2\2\37\u0091\3\2\2\2!\u0094\3\2\2\2#\u0098\3\2\2\2%\u009a"+
		"\3\2\2\2\'\u009c\3\2\2\2)\u00a1\3\2\2\2+\u00a3\3\2\2\2-\u00a9\3\2\2\2"+
		"/\u00ab\3\2\2\2\61\u00b3\3\2\2\2\63\u00c6\3\2\2\2\65\u00c8\3\2\2\2\67"+
		"\u00ca\3\2\2\29\u00d1\3\2\2\2;\u00d3\3\2\2\2=\u00da\3\2\2\2?\u00dc\3\2"+
		"\2\2A\u00e3\3\2\2\2C\u00e8\3\2\2\2E\u00ea\3\2\2\2G\u00ec\3\2\2\2I\u00ef"+
		"\3\2\2\2K\u0102\3\2\2\2M\u0104\3\2\2\2O\u0108\3\2\2\2QR\7o\2\2RS\7c\2"+
		"\2ST\7k\2\2TU\7p\2\2U\4\3\2\2\2VW\7n\2\2WX\7g\2\2XY\7p\2\2YZ\7i\2\2Z["+
		"\7v\2\2[\\\7j\2\2\\\6\3\2\2\2]^\7p\2\2^_\7g\2\2_`\7y\2\2`\b\3\2\2\2ab"+
		"\7v\2\2bc\7t\2\2cd\7w\2\2de\7g\2\2e\n\3\2\2\2fg\7t\2\2gh\7g\2\2hi\7v\2"+
		"\2ij\7w\2\2jk\7t\2\2kl\7p\2\2l\f\3\2\2\2mn\7e\2\2no\7n\2\2op\7c\2\2pq"+
		"\7u\2\2qr\7u\2\2r\16\3\2\2\2st\7y\2\2tu\7j\2\2uv\7k\2\2vw\7n\2\2wx\7g"+
		"\2\2x\20\3\2\2\2yz\7=\2\2z\22\3\2\2\2{|\7x\2\2|}\7q\2\2}~\7k\2\2~\177"+
		"\7f\2\2\177\24\3\2\2\2\u0080\u0081\7}\2\2\u0081\26\3\2\2\2\u0082\u0083"+
		"\7(\2\2\u0083\u0084\7(\2\2\u0084\30\3\2\2\2\u0085\u0086\7?\2\2\u0086\32"+
		"\3\2\2\2\u0087\u0088\7g\2\2\u0088\u0089\7z\2\2\u0089\u008a\7v\2\2\u008a"+
		"\u008b\7g\2\2\u008b\u008c\7p\2\2\u008c\u008d\7f\2\2\u008d\u008e\7u\2\2"+
		"\u008e\34\3\2\2\2\u008f\u0090\7\177\2\2\u0090\36\3\2\2\2\u0091\u0092\7"+
		"k\2\2\u0092\u0093\7h\2\2\u0093 \3\2\2\2\u0094\u0095\7k\2\2\u0095\u0096"+
		"\7p\2\2\u0096\u0097\7v\2\2\u0097\"\3\2\2\2\u0098\u0099\7*\2\2\u0099$\3"+
		"\2\2\2\u009a\u009b\7,\2\2\u009b&\3\2\2\2\u009c\u009d\7v\2\2\u009d\u009e"+
		"\7j\2\2\u009e\u009f\7k\2\2\u009f\u00a0\7u\2\2\u00a0(\3\2\2\2\u00a1\u00a2"+
		"\7.\2\2\u00a2*\3\2\2\2\u00a3\u00a4\7h\2\2\u00a4\u00a5\7c\2\2\u00a5\u00a6"+
		"\7n\2\2\u00a6\u00a7\7u\2\2\u00a7\u00a8\7g\2\2\u00a8,\3\2\2\2\u00a9\u00aa"+
		"\7\60\2\2\u00aa.\3\2\2\2\u00ab\u00ac\7d\2\2\u00ac\u00ad\7q\2\2\u00ad\u00ae"+
		"\7q\2\2\u00ae\u00af\7n\2\2\u00af\u00b0\7g\2\2\u00b0\u00b1\7c\2\2\u00b1"+
		"\u00b2\7p\2\2\u00b2\60\3\2\2\2\u00b3\u00b4\7U\2\2\u00b4\u00b5\7{\2\2\u00b5"+
		"\u00b6\7u\2\2\u00b6\u00b7\7v\2\2\u00b7\u00b8\7g\2\2\u00b8\u00b9\7o\2\2"+
		"\u00b9\u00ba\7\60\2\2\u00ba\u00bb\7q\2\2\u00bb\u00bc\7w\2\2\u00bc\u00bd"+
		"\7v\2\2\u00bd\u00be\7\60\2\2\u00be\u00bf\7r\2\2\u00bf\u00c0\7t\2\2\u00c0"+
		"\u00c1\7k\2\2\u00c1\u00c2\7p\2\2\u00c2\u00c3\7v\2\2\u00c3\u00c4\7n\2\2"+
		"\u00c4\u00c5\7p\2\2\u00c5\62\3\2\2\2\u00c6\u00c7\7]\2\2\u00c7\64\3\2\2"+
		"\2\u00c8\u00c9\7>\2\2\u00c9\66\3\2\2\2\u00ca\u00cb\7U\2\2\u00cb\u00cc"+
		"\7v\2\2\u00cc\u00cd\7t\2\2\u00cd\u00ce\7k\2\2\u00ce\u00cf\7p\2\2\u00cf"+
		"\u00d0\7i\2\2\u00d08\3\2\2\2\u00d1\u00d2\7_\2\2\u00d2:\3\2\2\2\u00d3\u00d4"+
		"\7r\2\2\u00d4\u00d5\7w\2\2\u00d5\u00d6\7d\2\2\u00d6\u00d7\7n\2\2\u00d7"+
		"\u00d8\7k\2\2\u00d8\u00d9\7e\2\2\u00d9<\3\2\2\2\u00da\u00db\7#\2\2\u00db"+
		">\3\2\2\2\u00dc\u00dd\7u\2\2\u00dd\u00de\7v\2\2\u00de\u00df\7c\2\2\u00df"+
		"\u00e0\7v\2\2\u00e0\u00e1\7k\2\2\u00e1\u00e2\7e\2\2\u00e2@\3\2\2\2\u00e3"+
		"\u00e4\7g\2\2\u00e4\u00e5\7n\2\2\u00e5\u00e6\7u\2\2\u00e6\u00e7\7g\2\2"+
		"\u00e7B\3\2\2\2\u00e8\u00e9\7+\2\2\u00e9D\3\2\2\2\u00ea\u00eb\7-\2\2\u00eb"+
		"F\3\2\2\2\u00ec\u00ed\7/\2\2\u00edH\3\2\2\2\u00ee\u00f0\t\2\2\2\u00ef"+
		"\u00ee\3\2\2\2\u00f0\u00f7\3\2\2\2\u00f1\u00f6\7a\2\2\u00f2\u00f4\t\3"+
		"\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00f1\3\2\2\2\u00f5"+
		"\u00f3\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2"+
		"\2\2\u00f8J\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u0103\t\4\2\2\u00fb\u00ff"+
		"\t\5\2\2\u00fc\u00fe\t\6\2\2\u00fd\u00fc\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff"+
		"\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2"+
		"\2\2\u0102\u00fa\3\2\2\2\u0102\u00fb\3\2\2\2\u0103L\3\2\2\2\u0104\u0105"+
		"\t\7\2\2\u0105\u0106\3\2\2\2\u0106\u0107\b\'\2\2\u0107N\3\2\2\2\u0108"+
		"\u0109\7\61\2\2\u0109\u010a\7\61\2\2\u010a\u010e\3\2\2\2\u010b\u010d\n"+
		"\b\2\2\u010c\u010b\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e"+
		"\u010f\3\2\2\2\u010f\u0111\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0112\b("+
		"\2\2\u0112P\3\2\2\2\n\2\u00ef\u00f3\u00f5\u00f7\u00ff\u0102\u010e\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}