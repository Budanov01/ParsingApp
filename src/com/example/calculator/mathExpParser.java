// Generated from C:/Users/Alexandr/IdeaProjects/untitled/src/com/example/calculator\mathExp.g4 by ANTLR 4.9.1
package com.example.calculator;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class mathExpParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, PLUSMINUS=2, MULDIV=3, OP_POW=4, LPAR=5, RPAR=6, IDENTIFIER=7, 
		NUMBER=8, WHITESPACE=9;
	public static final int
		RULE_start = 0, RULE_expr = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", null, null, "'^'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "PLUSMINUS", "MULDIV", "OP_POW", "LPAR", "RPAR", "IDENTIFIER", 
			"NUMBER", "WHITESPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "mathExp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public mathExpParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mathExpListener ) ((mathExpListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mathExpListener ) ((mathExpListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mathExpVisitor ) return ((mathExpVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ADDORSUBContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUSMINUS() { return getToken(mathExpParser.PLUSMINUS, 0); }
		public ADDORSUBContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mathExpListener ) ((mathExpListener)listener).enterADDORSUB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mathExpListener ) ((mathExpListener)listener).exitADDORSUB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mathExpVisitor ) return ((mathExpVisitor<? extends T>)visitor).visitADDORSUB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PARENTHESESContext extends ExprContext {
		public TerminalNode LPAR() { return getToken(mathExpParser.LPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(mathExpParser.RPAR, 0); }
		public PARENTHESESContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mathExpListener ) ((mathExpListener)listener).enterPARENTHESES(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mathExpListener ) ((mathExpListener)listener).exitPARENTHESES(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mathExpVisitor ) return ((mathExpVisitor<? extends T>)visitor).visitPARENTHESES(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UNARYOPContext extends ExprContext {
		public TerminalNode PLUSMINUS() { return getToken(mathExpParser.PLUSMINUS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UNARYOPContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mathExpListener ) ((mathExpListener)listener).enterUNARYOP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mathExpListener ) ((mathExpListener)listener).exitUNARYOP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mathExpVisitor ) return ((mathExpVisitor<? extends T>)visitor).visitUNARYOP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MULORDIVContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULDIV() { return getToken(mathExpParser.MULDIV, 0); }
		public MULORDIVContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mathExpListener ) ((mathExpListener)listener).enterMULORDIV(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mathExpListener ) ((mathExpListener)listener).exitMULORDIV(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mathExpVisitor ) return ((mathExpVisitor<? extends T>)visitor).visitMULORDIV(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CONSTANTContext extends ExprContext {
		public TerminalNode NUMBER() { return getToken(mathExpParser.NUMBER, 0); }
		public CONSTANTContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mathExpListener ) ((mathExpListener)listener).enterCONSTANT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mathExpListener ) ((mathExpListener)listener).exitCONSTANT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mathExpVisitor ) return ((mathExpVisitor<? extends T>)visitor).visitCONSTANT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FUNCTIONCALLContext extends ExprContext {
		public TerminalNode IDENTIFIER() { return getToken(mathExpParser.IDENTIFIER, 0); }
		public TerminalNode LPAR() { return getToken(mathExpParser.LPAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(mathExpParser.RPAR, 0); }
		public FUNCTIONCALLContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mathExpListener ) ((mathExpListener)listener).enterFUNCTIONCALL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mathExpListener ) ((mathExpListener)listener).exitFUNCTIONCALL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mathExpVisitor ) return ((mathExpVisitor<? extends T>)visitor).visitFUNCTIONCALL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class POWContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OP_POW() { return getToken(mathExpParser.OP_POW, 0); }
		public POWContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mathExpListener ) ((mathExpListener)listener).enterPOW(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mathExpListener ) ((mathExpListener)listener).exitPOW(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mathExpVisitor ) return ((mathExpVisitor<? extends T>)visitor).visitPOW(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUSMINUS:
				{
				_localctx = new UNARYOPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(7);
				match(PLUSMINUS);
				setState(8);
				expr(7);
				}
				break;
			case NUMBER:
				{
				_localctx = new CONSTANTContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(9);
				match(NUMBER);
				}
				break;
			case LPAR:
				{
				_localctx = new PARENTHESESContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(10);
				match(LPAR);
				setState(11);
				expr(0);
				setState(12);
				match(RPAR);
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new FUNCTIONCALLContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(14);
				match(IDENTIFIER);
				setState(15);
				match(LPAR);
				setState(16);
				expr(0);
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(17);
					match(T__0);
					setState(18);
					expr(0);
					}
					}
					setState(23);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(24);
				match(RPAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(39);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(37);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new POWContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(28);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(29);
						match(OP_POW);
						setState(30);
						expr(3);
						}
						break;
					case 2:
						{
						_localctx = new MULORDIVContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(31);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(32);
						match(MULDIV);
						setState(33);
						expr(3);
						}
						break;
					case 3:
						{
						_localctx = new ADDORSUBContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(34);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(35);
						match(PLUSMINUS);
						setState(36);
						expr(2);
						}
						break;
					}
					} 
				}
				setState(41);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\13-\4\2\t\2\4\3\t"+
		"\3\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\26"+
		"\n\3\f\3\16\3\31\13\3\3\3\3\3\5\3\35\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\7\3(\n\3\f\3\16\3+\13\3\3\3\2\3\4\4\2\4\2\2\2\61\2\6\3\2\2\2\4"+
		"\34\3\2\2\2\6\7\5\4\3\2\7\3\3\2\2\2\b\t\b\3\1\2\t\n\7\4\2\2\n\35\5\4\3"+
		"\t\13\35\7\n\2\2\f\r\7\7\2\2\r\16\5\4\3\2\16\17\7\b\2\2\17\35\3\2\2\2"+
		"\20\21\7\t\2\2\21\22\7\7\2\2\22\27\5\4\3\2\23\24\7\3\2\2\24\26\5\4\3\2"+
		"\25\23\3\2\2\2\26\31\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\32\3\2\2\2"+
		"\31\27\3\2\2\2\32\33\7\b\2\2\33\35\3\2\2\2\34\b\3\2\2\2\34\13\3\2\2\2"+
		"\34\f\3\2\2\2\34\20\3\2\2\2\35)\3\2\2\2\36\37\f\5\2\2\37 \7\6\2\2 (\5"+
		"\4\3\5!\"\f\4\2\2\"#\7\5\2\2#(\5\4\3\5$%\f\3\2\2%&\7\4\2\2&(\5\4\3\4\'"+
		"\36\3\2\2\2\'!\3\2\2\2\'$\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*\5\3"+
		"\2\2\2+)\3\2\2\2\6\27\34\')";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}