// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g 2010-07-09 08:55:00

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class rulesetLexer extends Lexer {
    public static final int EXPONENT=6;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__159=159;
    public static final int T__27=27;
    public static final int T__158=158;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int OCTAL_ESC=15;
    public static final int CHAR=12;
    public static final int T__160=160;
    public static final int T__167=167;
    public static final int T__168=168;
    public static final int EOF=-1;
    public static final int T__165=165;
    public static final int T__166=166;
    public static final int T__163=163;
    public static final int T__164=164;
    public static final int T__161=161;
    public static final int T__162=162;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__19=19;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__148=148;
    public static final int T__90=90;
    public static final int T__147=147;
    public static final int T__149=149;
    public static final int REGEXP=18;
    public static final int T__154=154;
    public static final int COMMENT=8;
    public static final int T__155=155;
    public static final int T__156=156;
    public static final int T__99=99;
    public static final int T__157=157;
    public static final int T__150=150;
    public static final int T__98=98;
    public static final int T__151=151;
    public static final int T__97=97;
    public static final int T__152=152;
    public static final int T__96=96;
    public static final int T__153=153;
    public static final int T__95=95;
    public static final int T__139=139;
    public static final int T__138=138;
    public static final int T__137=137;
    public static final int T__136=136;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int INT=5;
    public static final int T__141=141;
    public static final int T__85=85;
    public static final int T__142=142;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__140=140;
    public static final int T__86=86;
    public static final int T__145=145;
    public static final int T__89=89;
    public static final int T__146=146;
    public static final int T__88=88;
    public static final int T__143=143;
    public static final int T__144=144;
    public static final int T__126=126;
    public static final int T__125=125;
    public static final int T__128=128;
    public static final int T__127=127;
    public static final int WS=9;
    public static final int T__71=71;
    public static final int T__129=129;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__130=130;
    public static final int T__74=74;
    public static final int T__131=131;
    public static final int T__73=73;
    public static final int T__132=132;
    public static final int T__133=133;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__134=134;
    public static final int T__77=77;
    public static final int T__135=135;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__118=118;
    public static final int T__119=119;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__124=124;
    public static final int T__123=123;
    public static final int T__122=122;
    public static final int T__121=121;
    public static final int T__120=120;
    public static final int FLOAT=7;
    public static final int HTML=16;
    public static final int T__61=61;
    public static final int ID=4;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int ESC_SEQ=10;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__103=103;
    public static final int T__59=59;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int T__113=113;
    public static final int T__112=112;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__180=180;
    public static final int UNICODE_ESC=14;
    public static final int JS=17;
    public static final int HEX_DIGIT=13;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int T__175=175;
    public static final int T__30=30;
    public static final int T__174=174;
    public static final int T__31=31;
    public static final int T__173=173;
    public static final int T__32=32;
    public static final int T__172=172;
    public static final int T__33=33;
    public static final int T__179=179;
    public static final int T__34=34;
    public static final int T__178=178;
    public static final int T__35=35;
    public static final int T__177=177;
    public static final int T__36=36;
    public static final int T__176=176;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__171=171;
    public static final int T__170=170;
    public static final int T__169=169;
    public static final int STRING=11;

    // delegates
    // delegators

    public rulesetLexer() {;} 
    public rulesetLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public rulesetLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g"; }

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:3:7: ( 'ruleset' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:3:9: 'ruleset'
            {
            match("ruleset"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:4:7: ( '{' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:4:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:5:7: ( '}' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:5:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:6:7: ( 'rule' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:6:9: 'rule'
            {
            match("rule"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:7:7: ( 'is' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:7:9: 'is'
            {
            match("is"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:8:7: ( ';' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:8:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:9:7: ( 'fired' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:9:9: 'fired'
            {
            match("fired"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:10:7: ( 'always' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:10:9: 'always'
            {
            match("always"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:11:7: ( 'notfired' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:11:9: 'notfired'
            {
            match("notfired"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:12:7: ( 'else' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:12:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:13:7: ( 'if' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:13:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:14:7: ( 'callbacks' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:14:9: 'callbacks'
            {
            match("callbacks"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:15:7: ( 'success' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:15:9: 'success'
            {
            match("success"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:16:7: ( 'failure' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:16:9: 'failure'
            {
            match("failure"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:17:7: ( 'click' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:17:9: 'click'
            {
            match("click"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:18:7: ( 'change' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:18:9: 'change'
            {
            match("change"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:19:7: ( '=' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:19:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:20:7: ( 'triggers' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:20:9: 'triggers'
            {
            match("triggers"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:21:7: ( 'clear' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:21:9: 'clear'
            {
            match("clear"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:22:7: ( ':' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:22:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:23:7: ( 'set' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:23:9: 'set'
            {
            match("set"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:24:7: ( 'forget' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:24:9: 'forget'
            {
            match("forget"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:25:7: ( 'in' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:25:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:26:7: ( 'mark' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:26:9: 'mark'
            {
            match("mark"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:27:7: ( 'with' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:27:9: 'with'
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:28:7: ( '+=' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:28:9: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:29:7: ( '-=' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:29:9: '-='
            {
            match("-="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:30:7: ( 'from' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:30:9: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:31:7: ( 'log' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:31:9: 'log'
            {
            match("log"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:32:7: ( 'last' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:32:9: 'last'
            {
            match("last"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:33:7: ( 'raise' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:33:9: 'raise'
            {
            match("raise"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:34:7: ( 'explicit' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:34:9: 'explicit'
            {
            match("explicit"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:35:7: ( 'event' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:35:9: 'event'
            {
            match("event"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:36:7: ( 'for' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:36:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:37:7: ( 'active' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:37:9: 'active'
            {
            match("active"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:38:7: ( 'inactive' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:38:9: 'inactive'
            {
            match("inactive"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:39:7: ( 'test' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:39:9: 'test'
            {
            match("test"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:40:7: ( 'then' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:40:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:41:7: ( '(' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:41:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:42:7: ( ',' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:42:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:43:7: ( ')' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:43:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:44:7: ( '=>' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:44:9: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:45:7: ( 'and' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:45:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:46:7: ( 'choose' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:46:9: 'choose'
            {
            match("choose"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:47:7: ( 'every' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:47:9: 'every'
            {
            match("every"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:48:7: ( 'pre' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:48:9: 'pre'
            {
            match("pre"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:49:7: ( 'foreach' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:49:9: 'foreach'
            {
            match("foreach"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:50:7: ( 'select' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:50:9: 'select'
            {
            match("select"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:51:7: ( 'using' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:51:9: 'using'
            {
            match("using"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:52:7: ( 'when' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:52:9: 'when'
            {
            match("when"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:53:7: ( 'before' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:53:9: 'before'
            {
            match("before"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:54:7: ( 'or' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:54:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:55:7: ( 'not' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:55:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:56:7: ( 'between' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:56:9: 'between'
            {
            match("between"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:57:7: ( 'pageview' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:57:9: 'pageview'
            {
            match("pageview"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:58:7: ( 'submit' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:58:9: 'submit'
            {
            match("submit"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:59:7: ( 'dblclick' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:59:9: 'dblclick'
            {
            match("dblclick"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:60:7: ( 'update' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:60:9: 'update'
            {
            match("update"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:61:7: ( 'setting' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:61:9: 'setting'
            {
            match("setting"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:62:7: ( 'web' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:62:9: 'web'
            {
            match("web"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:63:7: ( 'on' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:63:9: 'on'
            {
            match("on"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:64:7: ( 'global' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:64:9: 'global'
            {
            match("global"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:65:7: ( 'datasource' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:65:9: 'datasource'
            {
            match("datasource"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:66:7: ( '<-' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:66:9: '<-'
            {
            match("<-"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:67:7: ( 'css' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:67:9: 'css'
            {
            match("css"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:68:7: ( 'function' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:68:9: 'function'
            {
            match("function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:69:7: ( '|' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:69:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:70:7: ( '||' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:70:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:71:7: ( '&&' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:71:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:72:7: ( '<=' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:72:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:73:7: ( '>=' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:73:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:74:7: ( '<' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:74:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:75:7: ( '>' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:75:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:76:7: ( '==' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:76:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:77:7: ( '!=' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:77:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:78:7: ( 'eq' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:78:9: 'eq'
            {
            match("eq"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:79:7: ( 'neq' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:79:9: 'neq'
            {
            match("neq"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:80:7: ( 'like' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:80:9: 'like'
            {
            match("like"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:81:7: ( '+' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:81:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:82:7: ( '-' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:82:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:83:7: ( '*' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:83:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:84:8: ( '/' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:84:10: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:85:8: ( '%' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:85:10: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:86:8: ( 'seen' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:86:10: 'seen'
            {
            match("seen"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:87:8: ( 'after' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:87:10: 'after'
            {
            match("after"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:88:8: ( 'true' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:88:10: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:89:8: ( 'false' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:89:10: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:90:8: ( '[' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:90:10: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:91:8: ( ']' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:91:10: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:92:8: ( 'current' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:92:10: 'current'
            {
            match("current"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:93:8: ( 'history' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:93:10: 'history'
            {
            match("history"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:94:8: ( '.' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:94:10: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:95:8: ( 'pick' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:95:10: 'pick'
            {
            match("pick"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:96:8: ( 'match' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:96:10: 'match'
            {
            match("match"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:97:8: ( 'length' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:97:10: 'length'
            {
            match("length"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:98:8: ( 'replace' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:98:10: 'replace'
            {
            match("replace"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:99:8: ( 'as' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:99:10: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "T__116"
    public final void mT__116() throws RecognitionException {
        try {
            int _type = T__116;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:100:8: ( 'head' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:100:10: 'head'
            {
            match("head"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__116"

    // $ANTLR start "T__117"
    public final void mT__117() throws RecognitionException {
        try {
            int _type = T__117;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:101:8: ( 'tail' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:101:10: 'tail'
            {
            match("tail"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__117"

    // $ANTLR start "T__118"
    public final void mT__118() throws RecognitionException {
        try {
            int _type = T__118;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:102:8: ( 'sort' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:102:10: 'sort'
            {
            match("sort"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__118"

    // $ANTLR start "T__119"
    public final void mT__119() throws RecognitionException {
        try {
            int _type = T__119;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:103:8: ( 'filter' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:103:10: 'filter'
            {
            match("filter"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__119"

    // $ANTLR start "T__120"
    public final void mT__120() throws RecognitionException {
        try {
            int _type = T__120;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:104:8: ( 'map' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:104:10: 'map'
            {
            match("map"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__120"

    // $ANTLR start "T__121"
    public final void mT__121() throws RecognitionException {
        try {
            int _type = T__121;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:105:8: ( 'uc' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:105:10: 'uc'
            {
            match("uc"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__121"

    // $ANTLR start "T__122"
    public final void mT__122() throws RecognitionException {
        try {
            int _type = T__122;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:106:8: ( 'lc' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:106:10: 'lc'
            {
            match("lc"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__122"

    // $ANTLR start "T__123"
    public final void mT__123() throws RecognitionException {
        try {
            int _type = T__123;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:107:8: ( 'split' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:107:10: 'split'
            {
            match("split"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__123"

    // $ANTLR start "T__124"
    public final void mT__124() throws RecognitionException {
        try {
            int _type = T__124;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:108:8: ( 'join' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:108:10: 'join'
            {
            match("join"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__124"

    // $ANTLR start "T__125"
    public final void mT__125() throws RecognitionException {
        try {
            int _type = T__125;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:109:8: ( 'query' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:109:10: 'query'
            {
            match("query"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__125"

    // $ANTLR start "T__126"
    public final void mT__126() throws RecognitionException {
        try {
            int _type = T__126;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:110:8: ( 'has' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:110:10: 'has'
            {
            match("has"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__126"

    // $ANTLR start "T__127"
    public final void mT__127() throws RecognitionException {
        try {
            int _type = T__127;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:111:8: ( 'union' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:111:10: 'union'
            {
            match("union"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__127"

    // $ANTLR start "T__128"
    public final void mT__128() throws RecognitionException {
        try {
            int _type = T__128;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:112:8: ( 'difference' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:112:10: 'difference'
            {
            match("difference"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__128"

    // $ANTLR start "T__129"
    public final void mT__129() throws RecognitionException {
        try {
            int _type = T__129;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:113:8: ( 'intersection' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:113:10: 'intersection'
            {
            match("intersection"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__129"

    // $ANTLR start "T__130"
    public final void mT__130() throws RecognitionException {
        try {
            int _type = T__130;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:114:8: ( 'unique' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:114:10: 'unique'
            {
            match("unique"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__130"

    // $ANTLR start "T__131"
    public final void mT__131() throws RecognitionException {
        try {
            int _type = T__131;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:115:8: ( 'once' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:115:10: 'once'
            {
            match("once"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__131"

    // $ANTLR start "T__132"
    public final void mT__132() throws RecognitionException {
        try {
            int _type = T__132;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:116:8: ( 'duplicates' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:116:10: 'duplicates'
            {
            match("duplicates"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__132"

    // $ANTLR start "T__133"
    public final void mT__133() throws RecognitionException {
        try {
            int _type = T__133;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:117:8: ( 'within' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:117:10: 'within'
            {
            match("within"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__133"

    // $ANTLR start "T__134"
    public final void mT__134() throws RecognitionException {
        try {
            int _type = T__134;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:118:8: ( 'ent' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:118:10: 'ent'
            {
            match("ent"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__134"

    // $ANTLR start "T__135"
    public final void mT__135() throws RecognitionException {
        try {
            int _type = T__135;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:119:8: ( 'app' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:119:10: 'app'
            {
            match("app"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__135"

    // $ANTLR start "T__136"
    public final void mT__136() throws RecognitionException {
        try {
            int _type = T__136;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:120:8: ( 'emit' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:120:10: 'emit'
            {
            match("emit"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__136"

    // $ANTLR start "T__137"
    public final void mT__137() throws RecognitionException {
        try {
            int _type = T__137;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:121:8: ( 'dataset' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:121:10: 'dataset'
            {
            match("dataset"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__137"

    // $ANTLR start "T__138"
    public final void mT__138() throws RecognitionException {
        try {
            int _type = T__138;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:122:8: ( 'JSON' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:122:10: 'JSON'
            {
            match("JSON"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__138"

    // $ANTLR start "T__139"
    public final void mT__139() throws RecognitionException {
        try {
            int _type = T__139;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:123:8: ( 'XML' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:123:10: 'XML'
            {
            match("XML"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__139"

    // $ANTLR start "T__140"
    public final void mT__140() throws RecognitionException {
        try {
            int _type = T__140;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:124:8: ( 'RSS' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:124:10: 'RSS'
            {
            match("RSS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__140"

    // $ANTLR start "T__141"
    public final void mT__141() throws RecognitionException {
        try {
            int _type = T__141;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:125:8: ( 'HTML' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:125:10: 'HTML'
            {
            match("HTML"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__141"

    // $ANTLR start "T__142"
    public final void mT__142() throws RecognitionException {
        try {
            int _type = T__142;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:126:8: ( 'cachable' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:126:10: 'cachable'
            {
            match("cachable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__142"

    // $ANTLR start "T__143"
    public final void mT__143() throws RecognitionException {
        try {
            int _type = T__143;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:127:8: ( 'years' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:127:10: 'years'
            {
            match("years"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__143"

    // $ANTLR start "T__144"
    public final void mT__144() throws RecognitionException {
        try {
            int _type = T__144;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:128:8: ( 'months' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:128:10: 'months'
            {
            match("months"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__144"

    // $ANTLR start "T__145"
    public final void mT__145() throws RecognitionException {
        try {
            int _type = T__145;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:129:8: ( 'weeks' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:129:10: 'weeks'
            {
            match("weeks"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__145"

    // $ANTLR start "T__146"
    public final void mT__146() throws RecognitionException {
        try {
            int _type = T__146;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:130:8: ( 'days' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:130:10: 'days'
            {
            match("days"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__146"

    // $ANTLR start "T__147"
    public final void mT__147() throws RecognitionException {
        try {
            int _type = T__147;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:131:8: ( 'hours' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:131:10: 'hours'
            {
            match("hours"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__147"

    // $ANTLR start "T__148"
    public final void mT__148() throws RecognitionException {
        try {
            int _type = T__148;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:132:8: ( 'minutes' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:132:10: 'minutes'
            {
            match("minutes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__148"

    // $ANTLR start "T__149"
    public final void mT__149() throws RecognitionException {
        try {
            int _type = T__149;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:133:8: ( 'seconds' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:133:10: 'seconds'
            {
            match("seconds"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__149"

    // $ANTLR start "T__150"
    public final void mT__150() throws RecognitionException {
        try {
            int _type = T__150;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:134:8: ( 'year' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:134:10: 'year'
            {
            match("year"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__150"

    // $ANTLR start "T__151"
    public final void mT__151() throws RecognitionException {
        try {
            int _type = T__151;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:135:8: ( 'month' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:135:10: 'month'
            {
            match("month"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__151"

    // $ANTLR start "T__152"
    public final void mT__152() throws RecognitionException {
        try {
            int _type = T__152;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:136:8: ( 'week' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:136:10: 'week'
            {
            match("week"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__152"

    // $ANTLR start "T__153"
    public final void mT__153() throws RecognitionException {
        try {
            int _type = T__153;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:137:8: ( 'day' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:137:10: 'day'
            {
            match("day"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__153"

    // $ANTLR start "T__154"
    public final void mT__154() throws RecognitionException {
        try {
            int _type = T__154;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:138:8: ( 'hour' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:138:10: 'hour'
            {
            match("hour"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__154"

    // $ANTLR start "T__155"
    public final void mT__155() throws RecognitionException {
        try {
            int _type = T__155;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:139:8: ( 'minute' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:139:10: 'minute'
            {
            match("minute"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__155"

    // $ANTLR start "T__156"
    public final void mT__156() throws RecognitionException {
        try {
            int _type = T__156;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:140:8: ( 'second' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:140:10: 'second'
            {
            match("second"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__156"

    // $ANTLR start "T__157"
    public final void mT__157() throws RecognitionException {
        try {
            int _type = T__157;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:141:8: ( 'dispatch' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:141:10: 'dispatch'
            {
            match("dispatch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__157"

    // $ANTLR start "T__158"
    public final void mT__158() throws RecognitionException {
        try {
            int _type = T__158;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:142:8: ( 'domain' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:142:10: 'domain'
            {
            match("domain"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__158"

    // $ANTLR start "T__159"
    public final void mT__159() throws RecognitionException {
        try {
            int _type = T__159;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:143:8: ( '->' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:143:10: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__159"

    // $ANTLR start "T__160"
    public final void mT__160() throws RecognitionException {
        try {
            int _type = T__160;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:144:8: ( 'meta' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:144:10: 'meta'
            {
            match("meta"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__160"

    // $ANTLR start "T__161"
    public final void mT__161() throws RecognitionException {
        try {
            int _type = T__161;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:145:8: ( 'name' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:145:10: 'name'
            {
            match("name"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__161"

    // $ANTLR start "T__162"
    public final void mT__162() throws RecognitionException {
        try {
            int _type = T__162;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:146:8: ( 'author' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:146:10: 'author'
            {
            match("author"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__162"

    // $ANTLR start "T__163"
    public final void mT__163() throws RecognitionException {
        try {
            int _type = T__163;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:147:8: ( 'key' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:147:10: 'key'
            {
            match("key"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__163"

    // $ANTLR start "T__164"
    public final void mT__164() throws RecognitionException {
        try {
            int _type = T__164;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:148:8: ( 'errorstack' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:148:10: 'errorstack'
            {
            match("errorstack"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__164"

    // $ANTLR start "T__165"
    public final void mT__165() throws RecognitionException {
        try {
            int _type = T__165;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:149:8: ( 'googleanalytics' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:149:10: 'googleanalytics'
            {
            match("googleanalytics"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__165"

    // $ANTLR start "T__166"
    public final void mT__166() throws RecognitionException {
        try {
            int _type = T__166;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:150:8: ( 'twitter' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:150:10: 'twitter'
            {
            match("twitter"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__166"

    // $ANTLR start "T__167"
    public final void mT__167() throws RecognitionException {
        try {
            int _type = T__167;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:151:8: ( 'amazon' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:151:10: 'amazon'
            {
            match("amazon"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__167"

    // $ANTLR start "T__168"
    public final void mT__168() throws RecognitionException {
        try {
            int _type = T__168;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:152:8: ( 'kpds' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:152:10: 'kpds'
            {
            match("kpds"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__168"

    // $ANTLR start "T__169"
    public final void mT__169() throws RecognitionException {
        try {
            int _type = T__169;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:153:8: ( 'google' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:153:10: 'google'
            {
            match("google"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__169"

    // $ANTLR start "T__170"
    public final void mT__170() throws RecognitionException {
        try {
            int _type = T__170;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:154:8: ( 'use' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:154:10: 'use'
            {
            match("use"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__170"

    // $ANTLR start "T__171"
    public final void mT__171() throws RecognitionException {
        try {
            int _type = T__171;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:155:8: ( 'module' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:155:10: 'module'
            {
            match("module"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__171"

    // $ANTLR start "T__172"
    public final void mT__172() throws RecognitionException {
        try {
            int _type = T__172;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:156:8: ( 'javascript' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:156:10: 'javascript'
            {
            match("javascript"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__172"

    // $ANTLR start "T__173"
    public final void mT__173() throws RecognitionException {
        try {
            int _type = T__173;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:157:8: ( 'resource' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:157:10: 'resource'
            {
            match("resource"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__173"

    // $ANTLR start "T__174"
    public final void mT__174() throws RecognitionException {
        try {
            int _type = T__174;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:158:8: ( 'authz' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:158:10: 'authz'
            {
            match("authz"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__174"

    // $ANTLR start "T__175"
    public final void mT__175() throws RecognitionException {
        try {
            int _type = T__175;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:159:8: ( 'require' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:159:10: 'require'
            {
            match("require"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__175"

    // $ANTLR start "T__176"
    public final void mT__176() throws RecognitionException {
        try {
            int _type = T__176;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:160:8: ( 'user' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:160:10: 'user'
            {
            match("user"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__176"

    // $ANTLR start "T__177"
    public final void mT__177() throws RecognitionException {
        try {
            int _type = T__177;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:161:8: ( 'logging' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:161:10: 'logging'
            {
            match("logging"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__177"

    // $ANTLR start "T__178"
    public final void mT__178() throws RecognitionException {
        try {
            int _type = T__178;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:162:8: ( 'off' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:162:10: 'off'
            {
            match("off"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__178"

    // $ANTLR start "T__179"
    public final void mT__179() throws RecognitionException {
        try {
            int _type = T__179;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:163:8: ( 'alias' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:163:10: 'alias'
            {
            match("alias"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__179"

    // $ANTLR start "T__180"
    public final void mT__180() throws RecognitionException {
        try {
            int _type = T__180;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:164:8: ( 'description' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:164:10: 'description'
            {
            match("description"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__180"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:3:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:3:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:3:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:6:5: ( ( '0' .. '9' )+ )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:6:7: ( '0' .. '9' )+
            {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:6:7: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:6:7: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:10:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
            int alt9=3;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:10:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
                    {
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:10:9: ( '0' .. '9' )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:10:10: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);

                    match('.'); 
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:10:25: ( '0' .. '9' )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:10:26: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:10:37: ( EXPONENT )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='E'||LA5_0=='e') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:10:37: EXPONENT
                            {
                            mEXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:11:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
                    {
                    match('.'); 
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:11:13: ( '0' .. '9' )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:11:14: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:11:25: ( EXPONENT )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='E'||LA7_0=='e') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:11:25: EXPONENT
                            {
                            mEXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:12:9: ( '0' .. '9' )+ EXPONENT
                    {
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:12:9: ( '0' .. '9' )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:12:10: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);

                    mEXPONENT(); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:16:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='/') ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1=='/') ) {
                    alt13=1;
                }
                else if ( (LA13_1=='*') ) {
                    alt13=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:16:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:16:14: (~ ( '\\n' | '\\r' ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:16:14: ~ ( '\\n' | '\\r' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:16:28: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:16:28: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 
                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:17:9: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:17:14: ( options {greedy=false; } : . )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0=='*') ) {
                            int LA12_1 = input.LA(2);

                            if ( (LA12_1=='/') ) {
                                alt12=2;
                            }
                            else if ( ((LA12_1>='\u0000' && LA12_1<='.')||(LA12_1>='0' && LA12_1<='\uFFFF')) ) {
                                alt12=1;
                            }


                        }
                        else if ( ((LA12_0>='\u0000' && LA12_0<=')')||(LA12_0>='+' && LA12_0<='\uFFFF')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:17:42: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    match("*/"); 

                    _channel=HIDDEN;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:20:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:20:9: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:28:5: ( '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\"' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:28:8: '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:28:12: ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )*
            loop14:
            do {
                int alt14=3;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='\\') ) {
                    alt14=1;
                }
                else if ( ((LA14_0>='\u0000' && LA14_0<='!')||(LA14_0>='#' && LA14_0<='[')||(LA14_0>=']' && LA14_0<='\uFFFF')) ) {
                    alt14=2;
                }


                switch (alt14) {
            	case 1 :
            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:28:14: ESC_SEQ
            	    {
            	    mESC_SEQ(); 

            	    }
            	    break;
            	case 2 :
            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:28:24: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:31:5: ( '\\'' ( ESC_SEQ | ~ ( '\\'' | '\\\\' ) ) '\\'' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:31:8: '\\'' ( ESC_SEQ | ~ ( '\\'' | '\\\\' ) ) '\\''
            {
            match('\''); 
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:31:13: ( ESC_SEQ | ~ ( '\\'' | '\\\\' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\\') ) {
                alt15=1;
            }
            else if ( ((LA15_0>='\u0000' && LA15_0<='&')||(LA15_0>='(' && LA15_0<='[')||(LA15_0>=']' && LA15_0<='\uFFFF')) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:31:15: ESC_SEQ
                    {
                    mESC_SEQ(); 

                    }
                    break;
                case 2 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:31:25: ~ ( '\\'' | '\\\\' )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CHAR"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:35:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:35:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:35:22: ( '+' | '-' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='+'||LA16_0=='-') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:35:33: ( '0' .. '9' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='0' && LA17_0<='9')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:35:34: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:38:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:38:13: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:42:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt18=3;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '\"':
                case '\'':
                case '\\':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                    {
                    alt18=1;
                    }
                    break;
                case 'u':
                    {
                    alt18=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt18=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:42:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 
                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:43:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 

                    }
                    break;
                case 3 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:44:9: OCTAL_ESC
                    {
                    mOCTAL_ESC(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "OCTAL_ESC"
    public final void mOCTAL_ESC() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:49:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt19=3;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\\') ) {
                int LA19_1 = input.LA(2);

                if ( ((LA19_1>='0' && LA19_1<='3')) ) {
                    int LA19_2 = input.LA(3);

                    if ( ((LA19_2>='0' && LA19_2<='7')) ) {
                        int LA19_4 = input.LA(4);

                        if ( ((LA19_4>='0' && LA19_4<='7')) ) {
                            alt19=1;
                        }
                        else {
                            alt19=2;}
                    }
                    else {
                        alt19=3;}
                }
                else if ( ((LA19_1>='4' && LA19_1<='7')) ) {
                    int LA19_3 = input.LA(3);

                    if ( ((LA19_3>='0' && LA19_3<='7')) ) {
                        alt19=2;
                    }
                    else {
                        alt19=3;}
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:49:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:49:14: ( '0' .. '3' )
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:49:15: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:49:25: ( '0' .. '7' )
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:49:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:49:36: ( '0' .. '7' )
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:49:37: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 2 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:50:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:50:14: ( '0' .. '7' )
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:50:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:50:25: ( '0' .. '7' )
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:50:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 3 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:51:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:51:14: ( '0' .. '7' )
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:51:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "OCTAL_ESC"

    // $ANTLR start "UNICODE_ESC"
    public final void mUNICODE_ESC() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:56:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:56:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
            {
            match('\\'); 
            match('u'); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "UNICODE_ESC"

    // $ANTLR start "HTML"
    public final void mHTML() throws RecognitionException {
        try {
            int _type = HTML;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:59:7: ( '<<' ( options {greedy=false; } : . )* '>>' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:59:9: '<<' ( options {greedy=false; } : . )* '>>'
            {
            match("<<"); 

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:59:14: ( options {greedy=false; } : . )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0=='>') ) {
                    int LA20_1 = input.LA(2);

                    if ( (LA20_1=='>') ) {
                        alt20=2;
                    }
                    else if ( ((LA20_1>='\u0000' && LA20_1<='=')||(LA20_1>='?' && LA20_1<='\uFFFF')) ) {
                        alt20=1;
                    }


                }
                else if ( ((LA20_0>='\u0000' && LA20_0<='=')||(LA20_0>='?' && LA20_0<='\uFFFF')) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:59:42: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            match(">>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HTML"

    // $ANTLR start "JS"
    public final void mJS() throws RecognitionException {
        try {
            int _type = JS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:61:5: ( '<|' ( options {greedy=false; } : . )* '|>' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:61:7: '<|' ( options {greedy=false; } : . )* '|>'
            {
            match("<|"); 

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:61:12: ( options {greedy=false; } : . )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0=='|') ) {
                    int LA21_1 = input.LA(2);

                    if ( (LA21_1=='>') ) {
                        alt21=2;
                    }
                    else if ( ((LA21_1>='\u0000' && LA21_1<='=')||(LA21_1>='?' && LA21_1<='\uFFFF')) ) {
                        alt21=1;
                    }


                }
                else if ( ((LA21_0>='\u0000' && LA21_0<='{')||(LA21_0>='}' && LA21_0<='\uFFFF')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:61:40: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            match("|>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "JS"

    // $ANTLR start "REGEXP"
    public final void mREGEXP() throws RecognitionException {
        try {
            int _type = REGEXP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:64:8: ( '/' ( options {greedy=false; } : . )* '/' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:64:10: '/' ( options {greedy=false; } : . )* '/'
            {
            match('/'); 
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:64:15: ( options {greedy=false; } : . )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0=='/') ) {
                    alt22=2;
                }
                else if ( ((LA22_0>='\u0000' && LA22_0<='.')||(LA22_0>='0' && LA22_0<='\uFFFF')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:64:43: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REGEXP"

    public void mTokens() throws RecognitionException {
        // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:8: ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | T__150 | T__151 | T__152 | T__153 | T__154 | T__155 | T__156 | T__157 | T__158 | T__159 | T__160 | T__161 | T__162 | T__163 | T__164 | T__165 | T__166 | T__167 | T__168 | T__169 | T__170 | T__171 | T__172 | T__173 | T__174 | T__175 | T__176 | T__177 | T__178 | T__179 | T__180 | ID | INT | FLOAT | COMMENT | WS | STRING | CHAR | HTML | JS | REGEXP )
        int alt23=172;
        alt23 = dfa23.predict(input);
        switch (alt23) {
            case 1 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:10: T__19
                {
                mT__19(); 

                }
                break;
            case 2 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:16: T__20
                {
                mT__20(); 

                }
                break;
            case 3 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:22: T__21
                {
                mT__21(); 

                }
                break;
            case 4 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:28: T__22
                {
                mT__22(); 

                }
                break;
            case 5 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:34: T__23
                {
                mT__23(); 

                }
                break;
            case 6 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:40: T__24
                {
                mT__24(); 

                }
                break;
            case 7 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:46: T__25
                {
                mT__25(); 

                }
                break;
            case 8 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:52: T__26
                {
                mT__26(); 

                }
                break;
            case 9 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:58: T__27
                {
                mT__27(); 

                }
                break;
            case 10 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:64: T__28
                {
                mT__28(); 

                }
                break;
            case 11 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:70: T__29
                {
                mT__29(); 

                }
                break;
            case 12 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:76: T__30
                {
                mT__30(); 

                }
                break;
            case 13 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:82: T__31
                {
                mT__31(); 

                }
                break;
            case 14 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:88: T__32
                {
                mT__32(); 

                }
                break;
            case 15 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:94: T__33
                {
                mT__33(); 

                }
                break;
            case 16 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:100: T__34
                {
                mT__34(); 

                }
                break;
            case 17 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:106: T__35
                {
                mT__35(); 

                }
                break;
            case 18 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:112: T__36
                {
                mT__36(); 

                }
                break;
            case 19 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:118: T__37
                {
                mT__37(); 

                }
                break;
            case 20 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:124: T__38
                {
                mT__38(); 

                }
                break;
            case 21 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:130: T__39
                {
                mT__39(); 

                }
                break;
            case 22 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:136: T__40
                {
                mT__40(); 

                }
                break;
            case 23 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:142: T__41
                {
                mT__41(); 

                }
                break;
            case 24 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:148: T__42
                {
                mT__42(); 

                }
                break;
            case 25 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:154: T__43
                {
                mT__43(); 

                }
                break;
            case 26 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:160: T__44
                {
                mT__44(); 

                }
                break;
            case 27 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:166: T__45
                {
                mT__45(); 

                }
                break;
            case 28 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:172: T__46
                {
                mT__46(); 

                }
                break;
            case 29 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:178: T__47
                {
                mT__47(); 

                }
                break;
            case 30 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:184: T__48
                {
                mT__48(); 

                }
                break;
            case 31 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:190: T__49
                {
                mT__49(); 

                }
                break;
            case 32 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:196: T__50
                {
                mT__50(); 

                }
                break;
            case 33 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:202: T__51
                {
                mT__51(); 

                }
                break;
            case 34 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:208: T__52
                {
                mT__52(); 

                }
                break;
            case 35 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:214: T__53
                {
                mT__53(); 

                }
                break;
            case 36 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:220: T__54
                {
                mT__54(); 

                }
                break;
            case 37 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:226: T__55
                {
                mT__55(); 

                }
                break;
            case 38 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:232: T__56
                {
                mT__56(); 

                }
                break;
            case 39 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:238: T__57
                {
                mT__57(); 

                }
                break;
            case 40 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:244: T__58
                {
                mT__58(); 

                }
                break;
            case 41 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:250: T__59
                {
                mT__59(); 

                }
                break;
            case 42 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:256: T__60
                {
                mT__60(); 

                }
                break;
            case 43 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:262: T__61
                {
                mT__61(); 

                }
                break;
            case 44 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:268: T__62
                {
                mT__62(); 

                }
                break;
            case 45 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:274: T__63
                {
                mT__63(); 

                }
                break;
            case 46 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:280: T__64
                {
                mT__64(); 

                }
                break;
            case 47 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:286: T__65
                {
                mT__65(); 

                }
                break;
            case 48 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:292: T__66
                {
                mT__66(); 

                }
                break;
            case 49 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:298: T__67
                {
                mT__67(); 

                }
                break;
            case 50 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:304: T__68
                {
                mT__68(); 

                }
                break;
            case 51 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:310: T__69
                {
                mT__69(); 

                }
                break;
            case 52 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:316: T__70
                {
                mT__70(); 

                }
                break;
            case 53 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:322: T__71
                {
                mT__71(); 

                }
                break;
            case 54 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:328: T__72
                {
                mT__72(); 

                }
                break;
            case 55 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:334: T__73
                {
                mT__73(); 

                }
                break;
            case 56 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:340: T__74
                {
                mT__74(); 

                }
                break;
            case 57 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:346: T__75
                {
                mT__75(); 

                }
                break;
            case 58 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:352: T__76
                {
                mT__76(); 

                }
                break;
            case 59 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:358: T__77
                {
                mT__77(); 

                }
                break;
            case 60 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:364: T__78
                {
                mT__78(); 

                }
                break;
            case 61 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:370: T__79
                {
                mT__79(); 

                }
                break;
            case 62 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:376: T__80
                {
                mT__80(); 

                }
                break;
            case 63 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:382: T__81
                {
                mT__81(); 

                }
                break;
            case 64 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:388: T__82
                {
                mT__82(); 

                }
                break;
            case 65 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:394: T__83
                {
                mT__83(); 

                }
                break;
            case 66 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:400: T__84
                {
                mT__84(); 

                }
                break;
            case 67 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:406: T__85
                {
                mT__85(); 

                }
                break;
            case 68 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:412: T__86
                {
                mT__86(); 

                }
                break;
            case 69 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:418: T__87
                {
                mT__87(); 

                }
                break;
            case 70 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:424: T__88
                {
                mT__88(); 

                }
                break;
            case 71 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:430: T__89
                {
                mT__89(); 

                }
                break;
            case 72 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:436: T__90
                {
                mT__90(); 

                }
                break;
            case 73 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:442: T__91
                {
                mT__91(); 

                }
                break;
            case 74 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:448: T__92
                {
                mT__92(); 

                }
                break;
            case 75 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:454: T__93
                {
                mT__93(); 

                }
                break;
            case 76 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:460: T__94
                {
                mT__94(); 

                }
                break;
            case 77 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:466: T__95
                {
                mT__95(); 

                }
                break;
            case 78 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:472: T__96
                {
                mT__96(); 

                }
                break;
            case 79 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:478: T__97
                {
                mT__97(); 

                }
                break;
            case 80 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:484: T__98
                {
                mT__98(); 

                }
                break;
            case 81 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:490: T__99
                {
                mT__99(); 

                }
                break;
            case 82 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:496: T__100
                {
                mT__100(); 

                }
                break;
            case 83 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:503: T__101
                {
                mT__101(); 

                }
                break;
            case 84 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:510: T__102
                {
                mT__102(); 

                }
                break;
            case 85 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:517: T__103
                {
                mT__103(); 

                }
                break;
            case 86 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:524: T__104
                {
                mT__104(); 

                }
                break;
            case 87 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:531: T__105
                {
                mT__105(); 

                }
                break;
            case 88 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:538: T__106
                {
                mT__106(); 

                }
                break;
            case 89 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:545: T__107
                {
                mT__107(); 

                }
                break;
            case 90 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:552: T__108
                {
                mT__108(); 

                }
                break;
            case 91 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:559: T__109
                {
                mT__109(); 

                }
                break;
            case 92 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:566: T__110
                {
                mT__110(); 

                }
                break;
            case 93 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:573: T__111
                {
                mT__111(); 

                }
                break;
            case 94 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:580: T__112
                {
                mT__112(); 

                }
                break;
            case 95 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:587: T__113
                {
                mT__113(); 

                }
                break;
            case 96 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:594: T__114
                {
                mT__114(); 

                }
                break;
            case 97 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:601: T__115
                {
                mT__115(); 

                }
                break;
            case 98 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:608: T__116
                {
                mT__116(); 

                }
                break;
            case 99 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:615: T__117
                {
                mT__117(); 

                }
                break;
            case 100 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:622: T__118
                {
                mT__118(); 

                }
                break;
            case 101 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:629: T__119
                {
                mT__119(); 

                }
                break;
            case 102 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:636: T__120
                {
                mT__120(); 

                }
                break;
            case 103 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:643: T__121
                {
                mT__121(); 

                }
                break;
            case 104 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:650: T__122
                {
                mT__122(); 

                }
                break;
            case 105 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:657: T__123
                {
                mT__123(); 

                }
                break;
            case 106 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:664: T__124
                {
                mT__124(); 

                }
                break;
            case 107 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:671: T__125
                {
                mT__125(); 

                }
                break;
            case 108 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:678: T__126
                {
                mT__126(); 

                }
                break;
            case 109 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:685: T__127
                {
                mT__127(); 

                }
                break;
            case 110 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:692: T__128
                {
                mT__128(); 

                }
                break;
            case 111 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:699: T__129
                {
                mT__129(); 

                }
                break;
            case 112 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:706: T__130
                {
                mT__130(); 

                }
                break;
            case 113 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:713: T__131
                {
                mT__131(); 

                }
                break;
            case 114 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:720: T__132
                {
                mT__132(); 

                }
                break;
            case 115 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:727: T__133
                {
                mT__133(); 

                }
                break;
            case 116 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:734: T__134
                {
                mT__134(); 

                }
                break;
            case 117 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:741: T__135
                {
                mT__135(); 

                }
                break;
            case 118 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:748: T__136
                {
                mT__136(); 

                }
                break;
            case 119 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:755: T__137
                {
                mT__137(); 

                }
                break;
            case 120 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:762: T__138
                {
                mT__138(); 

                }
                break;
            case 121 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:769: T__139
                {
                mT__139(); 

                }
                break;
            case 122 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:776: T__140
                {
                mT__140(); 

                }
                break;
            case 123 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:783: T__141
                {
                mT__141(); 

                }
                break;
            case 124 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:790: T__142
                {
                mT__142(); 

                }
                break;
            case 125 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:797: T__143
                {
                mT__143(); 

                }
                break;
            case 126 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:804: T__144
                {
                mT__144(); 

                }
                break;
            case 127 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:811: T__145
                {
                mT__145(); 

                }
                break;
            case 128 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:818: T__146
                {
                mT__146(); 

                }
                break;
            case 129 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:825: T__147
                {
                mT__147(); 

                }
                break;
            case 130 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:832: T__148
                {
                mT__148(); 

                }
                break;
            case 131 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:839: T__149
                {
                mT__149(); 

                }
                break;
            case 132 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:846: T__150
                {
                mT__150(); 

                }
                break;
            case 133 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:853: T__151
                {
                mT__151(); 

                }
                break;
            case 134 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:860: T__152
                {
                mT__152(); 

                }
                break;
            case 135 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:867: T__153
                {
                mT__153(); 

                }
                break;
            case 136 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:874: T__154
                {
                mT__154(); 

                }
                break;
            case 137 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:881: T__155
                {
                mT__155(); 

                }
                break;
            case 138 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:888: T__156
                {
                mT__156(); 

                }
                break;
            case 139 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:895: T__157
                {
                mT__157(); 

                }
                break;
            case 140 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:902: T__158
                {
                mT__158(); 

                }
                break;
            case 141 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:909: T__159
                {
                mT__159(); 

                }
                break;
            case 142 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:916: T__160
                {
                mT__160(); 

                }
                break;
            case 143 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:923: T__161
                {
                mT__161(); 

                }
                break;
            case 144 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:930: T__162
                {
                mT__162(); 

                }
                break;
            case 145 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:937: T__163
                {
                mT__163(); 

                }
                break;
            case 146 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:944: T__164
                {
                mT__164(); 

                }
                break;
            case 147 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:951: T__165
                {
                mT__165(); 

                }
                break;
            case 148 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:958: T__166
                {
                mT__166(); 

                }
                break;
            case 149 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:965: T__167
                {
                mT__167(); 

                }
                break;
            case 150 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:972: T__168
                {
                mT__168(); 

                }
                break;
            case 151 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:979: T__169
                {
                mT__169(); 

                }
                break;
            case 152 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:986: T__170
                {
                mT__170(); 

                }
                break;
            case 153 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:993: T__171
                {
                mT__171(); 

                }
                break;
            case 154 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:1000: T__172
                {
                mT__172(); 

                }
                break;
            case 155 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:1007: T__173
                {
                mT__173(); 

                }
                break;
            case 156 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:1014: T__174
                {
                mT__174(); 

                }
                break;
            case 157 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:1021: T__175
                {
                mT__175(); 

                }
                break;
            case 158 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:1028: T__176
                {
                mT__176(); 

                }
                break;
            case 159 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:1035: T__177
                {
                mT__177(); 

                }
                break;
            case 160 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:1042: T__178
                {
                mT__178(); 

                }
                break;
            case 161 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:1049: T__179
                {
                mT__179(); 

                }
                break;
            case 162 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:1056: T__180
                {
                mT__180(); 

                }
                break;
            case 163 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:1063: ID
                {
                mID(); 

                }
                break;
            case 164 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:1066: INT
                {
                mINT(); 

                }
                break;
            case 165 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:1070: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 166 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:1076: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 167 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:1084: WS
                {
                mWS(); 

                }
                break;
            case 168 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:1087: STRING
                {
                mSTRING(); 

                }
                break;
            case 169 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:1094: CHAR
                {
                mCHAR(); 

                }
                break;
            case 170 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:1099: HTML
                {
                mHTML(); 

                }
                break;
            case 171 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:1104: JS
                {
                mJS(); 

                }
                break;
            case 172 :
                // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:1:1107: REGEXP
                {
                mREGEXP(); 

                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    protected DFA23 dfa23 = new DFA23(this);
    static final String DFA9_eotS =
        "\5\uffff";
    static final String DFA9_eofS =
        "\5\uffff";
    static final String DFA9_minS =
        "\2\56\3\uffff";
    static final String DFA9_maxS =
        "\1\71\1\145\3\uffff";
    static final String DFA9_acceptS =
        "\2\uffff\1\2\1\1\1\3";
    static final String DFA9_specialS =
        "\5\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
            "",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "9:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
        }
    }
    static final String DFA23_eotS =
        "\1\uffff\1\61\2\uffff\1\61\1\uffff\6\61\1\136\1\61\1\uffff\2\61"+
        "\1\154\1\157\1\61\3\uffff\6\61\1\u008c\1\u008e\1\uffff\1\u0090\2"+
        "\uffff\1\u0093\3\uffff\1\61\1\u0099\10\61\1\uffff\1\u00a5\3\uffff"+
        "\3\61\1\u00ab\1\u00ac\1\u00af\11\61\1\u00bc\11\61\1\u00c6\14\61"+
        "\3\uffff\14\61\5\uffff\4\61\1\u00ef\5\61\1\u00f6\2\61\1\u00fa\1"+
        "\u00fc\11\61\11\uffff\1\u0094\3\uffff\4\61\2\uffff\12\61\1\uffff"+
        "\5\61\2\uffff\2\61\1\uffff\4\61\1\u012a\5\61\1\u0130\1\61\1\uffff"+
        "\1\u0132\2\61\1\u0136\1\u0137\4\61\1\uffff\1\u013d\10\61\1\u0146"+
        "\3\61\1\u014b\15\61\1\u0159\6\61\1\u0160\1\61\1\u0163\3\61\1\uffff"+
        "\1\u0167\3\61\1\u016c\1\61\1\uffff\3\61\1\uffff\1\61\1\uffff\1\u0173"+
        "\2\61\1\u0177\7\61\1\u0094\1\uffff\1\u017f\1\uffff\1\u0094\2\uffff"+
        "\2\61\1\u0183\5\61\1\u0189\1\u018a\2\61\1\u018d\1\61\1\u0190\14"+
        "\61\1\uffff\1\u019d\4\61\1\uffff\1\61\1\uffff\3\61\2\uffff\1\u01a7"+
        "\1\u01a8\3\61\1\uffff\1\u01ac\7\61\1\uffff\4\61\1\uffff\1\61\1\u01b9"+
        "\1\61\1\u01bb\2\61\1\u01be\1\u01bf\1\u01c0\1\u01c1\1\61\1\u01c3"+
        "\1\61\1\uffff\3\61\1\u01c8\1\u01ca\1\u01cb\1\uffff\1\u01cd\1\61"+
        "\1\uffff\1\u01cf\1\u01d0\1\61\1\uffff\1\61\1\u01d3\1\61\1\u01d5"+
        "\1\uffff\5\61\1\u01db\1\uffff\2\61\1\u01de\1\uffff\7\61\1\uffff"+
        "\1\u017f\1\61\1\u01e7\1\uffff\1\u01e9\1\u01ea\2\61\1\u01ed\2\uffff"+
        "\1\u01ee\1\u01f0\1\uffff\1\u01f1\1\61\1\uffff\1\u01f3\5\61\1\u01f9"+
        "\2\61\1\u01fc\2\61\1\uffff\2\61\1\u0201\1\61\1\u0203\1\61\1\u0205"+
        "\2\61\2\uffff\1\61\1\u0209\1\u020a\1\uffff\3\61\1\u020e\1\u020f"+
        "\7\61\1\uffff\1\61\1\uffff\1\u0218\1\61\4\uffff\1\61\1\uffff\1\u021b"+
        "\1\u021d\2\61\1\uffff\1\61\2\uffff\1\u0221\1\uffff\1\61\2\uffff"+
        "\2\61\1\uffff\1\u0225\1\uffff\1\61\1\u0227\3\61\1\uffff\2\61\1\uffff"+
        "\10\61\1\uffff\1\u0236\2\uffff\1\61\1\u0238\2\uffff\1\u0239\2\uffff"+
        "\1\61\1\uffff\5\61\1\uffff\1\u0240\1\61\1\uffff\1\u0242\2\61\1\u0245"+
        "\1\uffff\1\u0246\1\uffff\1\u0247\1\uffff\1\u0248\2\61\2\uffff\3"+
        "\61\2\uffff\1\u024e\1\u024f\2\61\1\u0252\1\61\1\u0254\1\u0256\1"+
        "\uffff\2\61\1\uffff\1\u0259\1\uffff\1\u025a\1\u025c\1\u025d\1\uffff"+
        "\1\61\1\u025f\1\61\1\uffff\1\u0261\1\uffff\1\u0262\1\u0263\7\61"+
        "\1\u026b\1\61\1\u026d\1\u026f\1\61\1\uffff\1\61\2\uffff\1\u0272"+
        "\1\u0273\1\61\1\u0275\2\61\1\uffff\1\u0278\1\uffff\1\u0279\1\61"+
        "\4\uffff\5\61\2\uffff\1\u0280\1\u0281\1\uffff\1\u0282\1\uffff\1"+
        "\u0283\1\uffff\1\61\1\u0285\2\uffff\1\u0286\2\uffff\1\u0287\1\uffff"+
        "\1\61\3\uffff\1\u0289\2\61\1\u028c\3\61\1\uffff\1\61\1\uffff\1\61"+
        "\1\uffff\1\u0292\1\61\2\uffff\1\u0294\1\uffff\1\u0295\1\61\2\uffff"+
        "\1\u0297\1\u0298\1\u0299\2\61\1\u029c\4\uffff\1\u029d\3\uffff\1"+
        "\u029e\1\uffff\1\u029f\1\61\1\uffff\1\61\1\u02a2\3\61\1\uffff\1"+
        "\61\2\uffff\1\61\3\uffff\1\61\1\u02a9\4\uffff\2\61\1\uffff\5\61"+
        "\1\u02b1\1\uffff\1\u02b2\1\u02b3\1\u02b4\2\61\1\u02b7\1\61\4\uffff"+
        "\1\u02b9\1\61\1\uffff\1\u02bb\1\uffff\1\61\1\uffff\2\61\1\u02bf"+
        "\1\uffff";
    static final String DFA23_eofS =
        "\u02c0\uffff";
    static final String DFA23_minS =
        "\1\11\1\141\2\uffff\1\146\1\uffff\1\141\1\143\1\141\1\154\1\141"+
        "\1\145\1\75\1\141\1\uffff\1\141\1\145\2\75\1\141\3\uffff\1\141\1"+
        "\143\1\145\1\146\1\141\1\154\1\55\1\174\1\uffff\1\75\2\uffff\1\0"+
        "\3\uffff\1\141\1\60\1\141\1\165\1\123\1\115\1\123\1\124\2\145\1"+
        "\uffff\1\56\3\uffff\1\154\1\151\1\160\3\60\1\154\1\151\1\162\1\157"+
        "\1\156\1\151\1\164\1\144\1\164\1\60\1\160\1\164\1\141\1\164\1\161"+
        "\1\155\1\163\1\160\1\145\1\60\1\164\1\151\1\162\1\143\1\145\1\141"+
        "\1\163\1\162\1\142\1\143\1\162\1\154\3\uffff\1\151\1\163\1\145\2"+
        "\151\1\160\1\144\1\156\2\164\1\145\1\142\5\uffff\1\147\1\163\1\153"+
        "\1\156\1\60\1\145\1\147\1\143\1\145\1\144\1\60\1\151\1\146\2\60"+
        "\1\146\1\154\1\164\1\146\1\160\1\155\1\163\2\157\11\uffff\2\0\2"+
        "\uffff\1\163\1\141\1\163\1\165\2\uffff\1\151\1\166\1\145\1\117\1"+
        "\114\1\123\1\115\1\141\1\171\1\144\1\uffff\1\145\1\163\1\154\1\157"+
        "\1\165\2\uffff\1\143\1\145\1\uffff\1\145\1\164\1\154\1\163\1\60"+
        "\1\155\1\143\2\141\1\151\1\60\1\145\1\uffff\1\60\1\150\1\172\2\60"+
        "\2\145\1\154\1\156\1\uffff\1\60\1\164\1\157\1\154\1\150\1\143\1"+
        "\141\1\156\1\157\1\60\1\162\1\143\1\155\1\60\1\145\1\156\1\157\1"+
        "\164\1\151\1\147\1\145\1\164\1\156\1\154\1\164\1\153\1\143\1\60"+
        "\1\164\2\165\1\141\1\150\1\156\1\60\1\153\1\60\1\164\1\145\1\147"+
        "\1\uffff\1\60\1\145\1\153\1\156\1\60\1\141\1\uffff\2\157\1\167\1"+
        "\uffff\1\145\1\uffff\1\60\1\143\1\141\1\60\1\146\1\160\1\154\1\141"+
        "\1\143\1\142\1\147\7\0\1\164\1\144\1\60\1\162\1\156\1\141\1\162"+
        "\1\116\2\60\1\114\1\162\1\60\1\163\1\60\1\145\1\141\1\165\1\151"+
        "\1\164\1\162\1\144\1\145\1\165\2\145\1\141\1\uffff\1\60\1\164\1"+
        "\171\1\163\1\166\1\uffff\1\162\1\uffff\2\157\1\151\2\uffff\2\60"+
        "\1\151\1\164\1\171\1\uffff\1\60\1\162\1\142\1\141\1\153\1\162\1"+
        "\147\1\163\1\uffff\2\145\2\151\1\uffff\1\143\1\60\1\156\1\60\1\164"+
        "\1\147\4\60\1\164\1\60\1\150\1\uffff\1\150\1\154\1\164\3\60\1\uffff"+
        "\1\60\1\151\1\uffff\2\60\1\164\1\uffff\1\166\1\60\1\147\1\60\1\uffff"+
        "\1\164\1\156\1\165\1\162\1\145\1\60\1\uffff\1\154\1\163\1\60\1\uffff"+
        "\1\145\1\141\2\151\1\162\1\141\1\154\1\uffff\1\0\1\157\1\60\1\uffff"+
        "\2\60\1\163\1\171\1\60\2\uffff\2\60\1\uffff\1\60\1\145\1\uffff\1"+
        "\60\1\143\2\162\1\151\1\163\1\60\2\162\1\60\1\164\1\143\1\uffff"+
        "\1\151\1\163\1\60\1\145\1\60\1\162\1\60\1\156\1\162\2\uffff\1\143"+
        "\2\60\1\uffff\1\163\1\141\1\142\2\60\2\145\1\156\1\163\1\164\1\156"+
        "\1\164\1\uffff\1\144\1\uffff\1\60\1\145\4\uffff\1\145\1\uffff\2"+
        "\60\2\145\1\uffff\1\156\2\uffff\1\60\1\uffff\1\156\2\uffff\1\150"+
        "\1\151\1\uffff\1\60\1\uffff\1\145\1\60\3\145\1\uffff\1\151\1\145"+
        "\1\uffff\1\162\1\164\1\143\1\156\1\151\1\154\1\145\1\162\1\uffff"+
        "\1\60\2\uffff\1\143\1\60\2\uffff\1\60\2\uffff\1\164\1\uffff\1\145"+
        "\1\143\1\145\1\166\1\145\1\uffff\1\60\1\145\1\uffff\1\60\1\150\1"+
        "\157\1\60\1\uffff\1\60\1\uffff\1\60\1\uffff\1\60\1\145\1\151\2\uffff"+
        "\1\164\1\143\1\154\2\uffff\2\60\1\164\1\163\1\60\1\147\2\60\1\uffff"+
        "\2\162\1\uffff\1\60\1\uffff\3\60\1\uffff\1\147\1\60\1\145\1\uffff"+
        "\1\60\1\uffff\2\60\1\156\1\143\1\165\1\164\1\145\1\143\1\141\1\60"+
        "\1\160\2\60\1\171\1\uffff\1\162\2\uffff\2\60\1\145\1\60\1\145\1"+
        "\143\1\uffff\1\60\1\uffff\1\60\1\156\4\uffff\1\144\1\164\1\141\1"+
        "\153\1\145\2\uffff\2\60\1\uffff\1\60\1\uffff\1\60\1\uffff\1\163"+
        "\1\60\2\uffff\1\60\2\uffff\1\60\1\uffff\1\167\3\uffff\1\60\1\153"+
        "\1\162\1\60\1\156\1\150\1\164\1\uffff\1\164\1\uffff\1\156\1\uffff"+
        "\1\60\1\151\2\uffff\1\60\1\uffff\1\60\1\164\2\uffff\3\60\1\143\1"+
        "\163\1\60\4\uffff\1\60\3\uffff\1\60\1\uffff\1\60\1\143\1\uffff\1"+
        "\143\1\60\1\145\1\151\1\141\1\uffff\1\160\2\uffff\1\151\3\uffff"+
        "\1\153\1\60\4\uffff\2\145\1\uffff\1\163\1\157\1\154\1\164\1\157"+
        "\1\60\1\uffff\3\60\1\156\1\171\1\60\1\156\4\uffff\1\60\1\164\1\uffff"+
        "\1\60\1\uffff\1\151\1\uffff\1\143\1\163\1\60\1\uffff";
    static final String DFA23_maxS =
        "\1\175\1\165\2\uffff\1\163\1\uffff\2\165\1\157\1\170\2\165\1\76"+
        "\1\167\1\uffff\1\157\1\151\1\75\1\76\1\157\3\uffff\1\162\1\163\1"+
        "\145\1\162\1\165\1\157\2\174\1\uffff\1\75\2\uffff\1\uffff\3\uffff"+
        "\1\157\1\71\1\157\1\165\1\123\1\115\1\123\1\124\1\145\1\160\1\uffff"+
        "\1\145\3\uffff\1\154\1\151\1\163\3\172\1\162\1\154\1\162\1\157\1"+
        "\156\1\167\1\164\1\144\1\164\1\172\1\160\1\164\1\141\1\164\1\161"+
        "\1\155\1\163\1\160\1\145\1\172\1\164\1\151\1\162\1\154\1\151\1\157"+
        "\1\163\1\162\1\143\1\164\1\162\1\154\3\uffff\1\165\1\163\1\145\2"+
        "\151\1\164\2\156\2\164\2\145\5\uffff\1\147\1\163\1\153\1\156\1\172"+
        "\1\145\1\147\1\143\1\151\1\144\1\172\1\151\1\164\2\172\1\146\1\154"+
        "\1\171\1\163\1\160\1\155\1\163\2\157\11\uffff\2\uffff\2\uffff\1"+
        "\163\1\141\1\163\1\165\2\uffff\1\151\1\166\1\145\1\117\1\114\1\123"+
        "\1\115\1\141\1\171\1\144\1\uffff\1\145\1\163\1\154\1\157\1\165\2"+
        "\uffff\1\143\1\145\1\uffff\1\145\1\164\1\154\1\163\1\172\1\155\1"+
        "\143\2\141\1\151\1\172\1\145\1\uffff\1\172\1\150\3\172\2\145\1\154"+
        "\1\162\1\uffff\1\172\1\164\1\157\1\154\1\150\1\143\1\141\1\156\1"+
        "\157\1\172\1\162\1\143\1\155\1\172\1\145\1\156\1\157\1\164\1\151"+
        "\1\147\1\145\1\164\1\156\1\154\1\164\1\153\1\143\1\172\1\164\2\165"+
        "\1\141\1\150\1\156\1\172\1\153\1\172\1\164\1\145\1\147\1\uffff\1"+
        "\172\1\145\1\153\1\156\1\172\1\141\1\uffff\1\161\1\157\1\167\1\uffff"+
        "\1\145\1\uffff\1\172\1\143\1\141\1\172\1\146\1\160\1\154\1\141\1"+
        "\143\1\142\1\147\7\uffff\1\164\1\144\1\172\1\162\1\156\1\141\1\162"+
        "\1\116\2\172\1\114\1\162\1\172\1\163\1\172\1\145\1\141\1\165\1\151"+
        "\1\164\1\162\1\144\1\145\1\165\2\145\1\141\1\uffff\1\172\1\164\1"+
        "\171\1\163\1\166\1\uffff\1\162\1\uffff\1\172\1\157\1\151\2\uffff"+
        "\2\172\1\151\1\164\1\171\1\uffff\1\172\1\162\1\142\1\141\1\153\1"+
        "\162\1\147\1\163\1\uffff\2\145\2\151\1\uffff\1\143\1\172\1\156\1"+
        "\172\1\164\1\147\4\172\1\164\1\172\1\150\1\uffff\1\150\1\154\1\164"+
        "\3\172\1\uffff\1\172\1\151\1\uffff\2\172\1\164\1\uffff\1\166\1\172"+
        "\1\147\1\172\1\uffff\1\164\1\156\1\165\1\162\1\145\1\172\1\uffff"+
        "\1\154\1\163\1\172\1\uffff\1\145\1\141\2\151\1\162\1\141\1\154\1"+
        "\uffff\1\uffff\1\157\1\172\1\uffff\2\172\1\163\1\171\1\172\2\uffff"+
        "\2\172\1\uffff\1\172\1\145\1\uffff\1\172\1\143\2\162\1\151\1\163"+
        "\1\172\2\162\1\172\1\164\1\143\1\uffff\1\151\1\163\1\172\1\145\1"+
        "\172\1\162\1\172\1\156\1\162\2\uffff\1\143\2\172\1\uffff\1\163\1"+
        "\141\1\142\2\172\2\145\1\156\1\163\1\164\1\156\1\164\1\uffff\1\144"+
        "\1\uffff\1\172\1\145\4\uffff\1\145\1\uffff\2\172\2\145\1\uffff\1"+
        "\156\2\uffff\1\172\1\uffff\1\156\2\uffff\1\150\1\151\1\uffff\1\172"+
        "\1\uffff\1\145\1\172\3\145\1\uffff\1\151\1\157\1\uffff\1\162\1\164"+
        "\1\143\1\156\1\151\1\154\1\145\1\162\1\uffff\1\172\2\uffff\1\143"+
        "\1\172\2\uffff\1\172\2\uffff\1\164\1\uffff\1\145\1\143\1\145\1\166"+
        "\1\145\1\uffff\1\172\1\145\1\uffff\1\172\1\150\1\157\1\172\1\uffff"+
        "\1\172\1\uffff\1\172\1\uffff\1\172\1\145\1\151\2\uffff\1\164\1\143"+
        "\1\154\2\uffff\2\172\1\164\1\163\1\172\1\147\2\172\1\uffff\2\162"+
        "\1\uffff\1\172\1\uffff\3\172\1\uffff\1\147\1\172\1\145\1\uffff\1"+
        "\172\1\uffff\2\172\1\156\1\143\1\165\1\164\1\145\1\143\1\141\1\172"+
        "\1\160\2\172\1\171\1\uffff\1\162\2\uffff\2\172\1\145\1\172\1\145"+
        "\1\143\1\uffff\1\172\1\uffff\1\172\1\156\4\uffff\1\144\1\164\1\141"+
        "\1\153\1\145\2\uffff\2\172\1\uffff\1\172\1\uffff\1\172\1\uffff\1"+
        "\163\1\172\2\uffff\1\172\2\uffff\1\172\1\uffff\1\167\3\uffff\1\172"+
        "\1\153\1\162\1\172\1\156\1\150\1\164\1\uffff\1\164\1\uffff\1\156"+
        "\1\uffff\1\172\1\151\2\uffff\1\172\1\uffff\1\172\1\164\2\uffff\3"+
        "\172\1\143\1\163\1\172\4\uffff\1\172\3\uffff\1\172\1\uffff\1\172"+
        "\1\143\1\uffff\1\143\1\172\1\145\1\151\1\141\1\uffff\1\160\2\uffff"+
        "\1\151\3\uffff\1\153\1\172\4\uffff\2\145\1\uffff\1\163\1\157\1\154"+
        "\1\164\1\157\1\172\1\uffff\3\172\1\156\1\171\1\172\1\156\4\uffff"+
        "\1\172\1\164\1\uffff\1\172\1\uffff\1\151\1\uffff\1\143\1\163\1\172"+
        "\1\uffff";
    static final String DFA23_acceptS =
        "\2\uffff\1\2\1\3\1\uffff\1\6\10\uffff\1\24\5\uffff\1\47\1\50\1\51"+
        "\10\uffff\1\105\1\uffff\1\113\1\121\1\uffff\1\123\1\130\1\131\12"+
        "\uffff\1\u00a3\1\uffff\1\u00a7\1\u00a8\1\u00a9\46\uffff\1\52\1\112"+
        "\1\21\14\uffff\1\32\1\117\1\33\1\u008d\1\120\30\uffff\1\100\1\106"+
        "\1\u00aa\1\u00ab\1\110\1\104\1\103\1\107\1\111\2\uffff\1\122\1\u00ac"+
        "\4\uffff\1\134\1\u00a5\12\uffff\1\u00a4\5\uffff\1\5\1\13\2\uffff"+
        "\1\27\14\uffff\1\141\11\uffff\1\114\50\uffff\1\150\6\uffff\1\147"+
        "\3\uffff\1\64\1\uffff\1\75\55\uffff\1\42\5\uffff\1\53\1\uffff\1"+
        "\165\3\uffff\1\65\1\115\5\uffff\1\164\10\uffff\1\101\4\uffff\1\25"+
        "\15\uffff\1\146\6\uffff\1\74\2\uffff\1\35\3\uffff\1\56\4\uffff\1"+
        "\u0098\6\uffff\1\u00a0\3\uffff\1\u0087\7\uffff\1\u00a6\3\uffff\1"+
        "\154\5\uffff\1\171\1\172\2\uffff\1\u0091\2\uffff\1\4\14\uffff\1"+
        "\34\11\uffff\1\u008f\1\12\3\uffff\1\166\14\uffff\1\124\1\uffff\1"+
        "\144\2\uffff\1\126\1\45\1\46\1\143\1\uffff\1\30\4\uffff\1\u008e"+
        "\1\uffff\1\31\1\62\1\uffff\1\u0086\1\uffff\1\36\1\116\2\uffff\1"+
        "\135\1\uffff\1\u009e\5\uffff\1\161\2\uffff\1\u0080\10\uffff\1\142"+
        "\1\uffff\1\u0088\1\152\2\uffff\1\170\1\173\1\uffff\1\u0084\1\u0096"+
        "\1\uffff\1\37\5\uffff\1\7\2\uffff\1\127\4\uffff\1\u00a1\1\uffff"+
        "\1\125\1\uffff\1\u009c\3\uffff\1\41\1\55\3\uffff\1\17\1\23\10\uffff"+
        "\1\151\2\uffff\1\136\1\uffff\1\u0085\3\uffff\1\177\3\uffff\1\61"+
        "\1\uffff\1\155\16\uffff\1\u0081\1\uffff\1\153\1\175\6\uffff\1\145"+
        "\1\uffff\1\26\2\uffff\1\10\1\43\1\u0090\1\u0095\5\uffff\1\20\1\54"+
        "\2\uffff\1\70\1\uffff\1\60\1\uffff\1\u008a\2\uffff\1\176\1\u0099"+
        "\1\uffff\1\u0089\1\163\1\uffff\1\137\1\uffff\1\72\1\160\1\63\7\uffff"+
        "\1\u008c\1\uffff\1\76\1\uffff\1\u0097\2\uffff\1\1\1\140\1\uffff"+
        "\1\u009d\2\uffff\1\16\1\57\6\uffff\1\132\1\15\1\73\1\u0083\1\uffff"+
        "\1\u0094\1\u0082\1\u009f\1\uffff\1\66\2\uffff\1\167\5\uffff\1\133"+
        "\1\uffff\1\u009b\1\44\1\uffff\1\102\1\11\1\40\2\uffff\1\174\1\22"+
        "\1\67\1\71\2\uffff\1\u008b\6\uffff\1\14\7\uffff\1\u0092\1\77\1\156"+
        "\1\162\2\uffff\1\u009a\1\uffff\1\u00a2\1\uffff\1\157\3\uffff\1\u0093";
    static final String DFA23_specialS =
        "\43\uffff\1\2\155\uffff\1\6\1\11\165\uffff\1\5\1\12\1\0\1\4\1\10"+
        "\1\7\1\3\161\uffff\1\1\u013f\uffff}>";
    static final String[] DFA23_transitionS = {
            "\2\63\2\uffff\1\63\22\uffff\1\63\1\41\1\64\2\uffff\1\44\1\37"+
            "\1\65\1\24\1\26\1\42\1\21\1\25\1\22\1\50\1\43\12\62\1\16\1\5"+
            "\1\35\1\14\1\40\2\uffff\7\61\1\56\1\61\1\53\7\61\1\55\5\61\1"+
            "\54\2\61\1\45\1\uffff\1\46\1\uffff\1\61\1\uffff\1\7\1\31\1\12"+
            "\1\33\1\11\1\6\1\34\1\47\1\4\1\51\1\60\1\23\1\17\1\10\1\32\1"+
            "\27\1\52\1\1\1\13\1\15\1\30\1\61\1\20\1\61\1\57\1\61\1\2\1\36"+
            "\1\3",
            "\1\67\3\uffff\1\70\17\uffff\1\66",
            "",
            "",
            "\1\72\7\uffff\1\73\4\uffff\1\71",
            "",
            "\1\75\7\uffff\1\74\5\uffff\1\76\2\uffff\1\77\2\uffff\1\100",
            "\1\102\2\uffff\1\104\5\uffff\1\101\1\110\1\103\1\uffff\1\106"+
            "\2\uffff\1\105\1\uffff\1\107",
            "\1\113\3\uffff\1\112\11\uffff\1\111",
            "\1\114\1\121\1\120\2\uffff\1\117\1\122\3\uffff\1\116\1\uffff"+
            "\1\115",
            "\1\123\6\uffff\1\125\3\uffff\1\124\6\uffff\1\126\1\uffff\1"+
            "\127",
            "\1\131\11\uffff\1\132\1\133\4\uffff\1\130",
            "\1\135\1\134",
            "\1\142\3\uffff\1\140\2\uffff\1\141\11\uffff\1\137\4\uffff\1"+
            "\143",
            "",
            "\1\144\3\uffff\1\147\3\uffff\1\146\5\uffff\1\145",
            "\1\152\2\uffff\1\151\1\150",
            "\1\153",
            "\1\155\1\156",
            "\1\161\1\uffff\1\164\1\uffff\1\163\3\uffff\1\162\5\uffff\1"+
            "\160",
            "",
            "",
            "",
            "\1\166\7\uffff\1\167\10\uffff\1\165",
            "\1\172\12\uffff\1\173\1\uffff\1\171\2\uffff\1\170",
            "\1\174",
            "\1\177\7\uffff\1\176\3\uffff\1\175",
            "\1\u0081\1\u0080\2\uffff\1\u0085\3\uffff\1\u0082\5\uffff\1"+
            "\u0084\5\uffff\1\u0083",
            "\1\u0086\2\uffff\1\u0087",
            "\1\u0088\16\uffff\1\u008a\1\u0089\76\uffff\1\u008b",
            "\1\u008d",
            "",
            "\1\u008f",
            "",
            "",
            "\52\u0094\1\u0092\4\u0094\1\u0091\uffd0\u0094",
            "",
            "",
            "",
            "\1\u0097\3\uffff\1\u0096\3\uffff\1\u0095\5\uffff\1\u0098",
            "\12\u009a",
            "\1\u009c\15\uffff\1\u009b",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3\12\uffff\1\u00a4",
            "",
            "\1\u009a\1\uffff\12\62\13\uffff\1\u009a\37\uffff\1\u009a",
            "",
            "",
            "",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8\1\u00aa\1\uffff\1\u00a9",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\1\u00ad\22\61\1\u00ae"+
            "\6\61",
            "\1\u00b1\5\uffff\1\u00b0",
            "\1\u00b2\2\uffff\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b8\15\uffff\1\u00b7",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00cb\10\uffff\1\u00ca",
            "\1\u00cd\3\uffff\1\u00cc",
            "\1\u00ce\15\uffff\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d3\1\u00d2",
            "\1\u00d7\1\uffff\1\u00d6\6\uffff\1\u00d5\7\uffff\1\u00d4",
            "\1\u00d8",
            "\1\u00d9",
            "",
            "",
            "",
            "\1\u00da\13\uffff\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e2\1\uffff\1\u00e0\1\uffff\1\u00e1",
            "\1\u00e4\11\uffff\1\u00e3",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9\2\uffff\1\u00ea",
            "",
            "",
            "",
            "",
            "",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f4\3\uffff\1\u00f3",
            "\1\u00f5",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00f7",
            "\1\u00f8\15\uffff\1\u00f9",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\2\61\1\u00fb\27\61",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff\4\uffff\1\u0100",
            "\1\u0101\14\uffff\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\u010b\1\u010a\2\u010b\1\u0109\41\u010b\1\u0108\uffd0\u010b",
            "\52\u010e\1\u010d\4\u010e\1\u010c\uffd0\u010e",
            "",
            "",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "",
            "",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "",
            "",
            "\1\u0122",
            "\1\u0123",
            "",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u0129\1\61"+
            "\1\u0128\23\61",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0131",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0133",
            "\1\u0134",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\5\61\1\u0135\24\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b\3\uffff\1\u013c",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\23\61\1\u014a\6\61",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "\1\u015d",
            "\1\u015e",
            "\1\u015f",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0161",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\6\61\1\u0162\23\61",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\21\61\1\u016b\10"+
            "\61",
            "\1\u016d",
            "",
            "\1\u016e\1\uffff\1\u016f",
            "\1\u0170",
            "\1\u0171",
            "",
            "\1\u0172",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0174",
            "\1\u0175",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\22\61\1\u0176\7\61",
            "\1\u0178",
            "\1\u0179",
            "\1\u017a",
            "\1\u017b",
            "\1\u017c",
            "\1\u017d",
            "\1\u017e",
            "\12\u010b\1\u010a\2\u010b\1\u0109\41\u010b\1\u0108\uffd0\u010b",
            "\12\u0094\1\u010a\ufff5\u0094",
            "\0\u0094",
            "\12\u010b\1\u010a\2\u010b\1\u0109\41\u010b\1\u0108\uffd0\u010b",
            "\52\u010e\1\u010d\4\u010e\1\u010c\uffd0\u010e",
            "\52\u010e\1\u010d\4\u010e\1\u0180\uffd0\u010e",
            "\52\u010e\1\u010d\4\u010e\1\u010c\uffd0\u010e",
            "\1\u0181",
            "\1\u0182",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0184",
            "\1\u0185",
            "\1\u0186",
            "\1\u0187",
            "\1\u0188",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u018b",
            "\1\u018c",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u018e",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\22\61\1\u018f\7\61",
            "\1\u0191",
            "\1\u0192",
            "\1\u0193",
            "\1\u0194",
            "\1\u0195",
            "\1\u0196",
            "\1\u0197",
            "\1\u0198",
            "\1\u0199",
            "\1\u019a",
            "\1\u019b",
            "\1\u019c",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u019e",
            "\1\u019f",
            "\1\u01a0",
            "\1\u01a1",
            "",
            "\1\u01a2",
            "",
            "\1\u01a3\12\uffff\1\u01a4",
            "\1\u01a5",
            "\1\u01a6",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u01a9",
            "\1\u01aa",
            "\1\u01ab",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u01ad",
            "\1\u01ae",
            "\1\u01af",
            "\1\u01b0",
            "\1\u01b1",
            "\1\u01b2",
            "\1\u01b3",
            "",
            "\1\u01b4",
            "\1\u01b5",
            "\1\u01b6",
            "\1\u01b7",
            "",
            "\1\u01b8",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u01ba",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u01bc",
            "\1\u01bd",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u01c2",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u01c4",
            "",
            "\1\u01c5",
            "\1\u01c6",
            "\1\u01c7",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\10\61\1\u01c9\21"+
            "\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\22\61\1\u01cc\7\61",
            "\1\u01ce",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u01d1",
            "",
            "\1\u01d2",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u01d4",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\u01d6",
            "\1\u01d7",
            "\1\u01d8",
            "\1\u01d9",
            "\1\u01da",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\u01dc",
            "\1\u01dd",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\u01df",
            "\1\u01e0",
            "\1\u01e1",
            "\1\u01e2",
            "\1\u01e3",
            "\1\u01e4",
            "\1\u01e5",
            "",
            "\52\u010e\1\u010d\4\u010e\1\u010c\uffd0\u010e",
            "\1\u01e6",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\22\61\1\u01e8\7\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u01eb",
            "\1\u01ec",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\22\61\1\u01ef\7\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u01f2",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u01f4",
            "\1\u01f5",
            "\1\u01f6",
            "\1\u01f7",
            "\1\u01f8",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u01fa",
            "\1\u01fb",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u01fd",
            "\1\u01fe",
            "",
            "\1\u01ff",
            "\1\u0200",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0202",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0204",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0206",
            "\1\u0207",
            "",
            "",
            "\1\u0208",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\u020b",
            "\1\u020c",
            "\1\u020d",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0210",
            "\1\u0211",
            "\1\u0212",
            "\1\u0213",
            "\1\u0214",
            "\1\u0215",
            "\1\u0216",
            "",
            "\1\u0217",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0219",
            "",
            "",
            "",
            "",
            "\1\u021a",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\22\61\1\u021c\7\61",
            "\1\u021e",
            "\1\u021f",
            "",
            "\1\u0220",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\u0222",
            "",
            "",
            "\1\u0223",
            "\1\u0224",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\u0226",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0228",
            "\1\u0229",
            "\1\u022a",
            "",
            "\1\u022b",
            "\1\u022d\11\uffff\1\u022c",
            "",
            "\1\u022e",
            "\1\u022f",
            "\1\u0230",
            "\1\u0231",
            "\1\u0232",
            "\1\u0233",
            "\1\u0234",
            "\1\u0235",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "\1\u0237",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "\1\u023a",
            "",
            "\1\u023b",
            "\1\u023c",
            "\1\u023d",
            "\1\u023e",
            "\1\u023f",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0241",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0243",
            "\1\u0244",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0249",
            "\1\u024a",
            "",
            "",
            "\1\u024b",
            "\1\u024c",
            "\1\u024d",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0250",
            "\1\u0251",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0253",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\22\61\1\u0255\7\61",
            "",
            "\1\u0257",
            "\1\u0258",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\22\61\1\u025b\7\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\u025e",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0260",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0264",
            "\1\u0265",
            "\1\u0266",
            "\1\u0267",
            "\1\u0268",
            "\1\u0269",
            "\1\u026a",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u026c",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\1\u026e\31\61",
            "\1\u0270",
            "",
            "\1\u0271",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0274",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0276",
            "\1\u0277",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u027a",
            "",
            "",
            "",
            "",
            "\1\u027b",
            "\1\u027c",
            "\1\u027d",
            "\1\u027e",
            "\1\u027f",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\u0284",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\u0288",
            "",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u028a",
            "\1\u028b",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u028d",
            "\1\u028e",
            "\1\u028f",
            "",
            "\1\u0290",
            "",
            "\1\u0291",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0293",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0296",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u029a",
            "\1\u029b",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u02a0",
            "",
            "\1\u02a1",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u02a3",
            "\1\u02a4",
            "\1\u02a5",
            "",
            "\1\u02a6",
            "",
            "",
            "\1\u02a7",
            "",
            "",
            "",
            "\1\u02a8",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "",
            "",
            "\1\u02aa",
            "\1\u02ab",
            "",
            "\1\u02ac",
            "\1\u02ad",
            "\1\u02ae",
            "\1\u02af",
            "\1\u02b0",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u02b5",
            "\1\u02b6",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u02b8",
            "",
            "",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u02ba",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\u02bc",
            "",
            "\1\u02bd",
            "\1\u02be",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            ""
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | T__150 | T__151 | T__152 | T__153 | T__154 | T__155 | T__156 | T__157 | T__158 | T__159 | T__160 | T__161 | T__162 | T__163 | T__164 | T__165 | T__166 | T__167 | T__168 | T__169 | T__170 | T__171 | T__172 | T__173 | T__174 | T__175 | T__176 | T__177 | T__178 | T__179 | T__180 | ID | INT | FLOAT | COMMENT | WS | STRING | CHAR | HTML | JS | REGEXP );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA23_266 = input.LA(1);

                        s = -1;
                        if ( ((LA23_266>='\u0000' && LA23_266<='\uFFFF')) ) {s = 148;}

                        else s = 383;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA23_384 = input.LA(1);

                        s = -1;
                        if ( (LA23_384=='/') ) {s = 268;}

                        else if ( (LA23_384=='*') ) {s = 269;}

                        else if ( ((LA23_384>='\u0000' && LA23_384<=')')||(LA23_384>='+' && LA23_384<='.')||(LA23_384>='0' && LA23_384<='\uFFFF')) ) {s = 270;}

                        else s = 383;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA23_35 = input.LA(1);

                        s = -1;
                        if ( (LA23_35=='/') ) {s = 145;}

                        else if ( (LA23_35=='*') ) {s = 146;}

                        else if ( ((LA23_35>='\u0000' && LA23_35<=')')||(LA23_35>='+' && LA23_35<='.')||(LA23_35>='0' && LA23_35<='\uFFFF')) ) {s = 148;}

                        else s = 147;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA23_270 = input.LA(1);

                        s = -1;
                        if ( (LA23_270=='/') ) {s = 268;}

                        else if ( (LA23_270=='*') ) {s = 269;}

                        else if ( ((LA23_270>='\u0000' && LA23_270<=')')||(LA23_270>='+' && LA23_270<='.')||(LA23_270>='0' && LA23_270<='\uFFFF')) ) {s = 270;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA23_267 = input.LA(1);

                        s = -1;
                        if ( (LA23_267=='/') ) {s = 264;}

                        else if ( (LA23_267=='\r') ) {s = 265;}

                        else if ( (LA23_267=='\n') ) {s = 266;}

                        else if ( ((LA23_267>='\u0000' && LA23_267<='\t')||(LA23_267>='\u000B' && LA23_267<='\f')||(LA23_267>='\u000E' && LA23_267<='.')||(LA23_267>='0' && LA23_267<='\uFFFF')) ) {s = 267;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA23_264 = input.LA(1);

                        s = -1;
                        if ( (LA23_264=='/') ) {s = 264;}

                        else if ( (LA23_264=='\r') ) {s = 265;}

                        else if ( (LA23_264=='\n') ) {s = 266;}

                        else if ( ((LA23_264>='\u0000' && LA23_264<='\t')||(LA23_264>='\u000B' && LA23_264<='\f')||(LA23_264>='\u000E' && LA23_264<='.')||(LA23_264>='0' && LA23_264<='\uFFFF')) ) {s = 267;}

                        else s = 148;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA23_145 = input.LA(1);

                        s = -1;
                        if ( (LA23_145=='/') ) {s = 264;}

                        else if ( (LA23_145=='\r') ) {s = 265;}

                        else if ( (LA23_145=='\n') ) {s = 266;}

                        else if ( ((LA23_145>='\u0000' && LA23_145<='\t')||(LA23_145>='\u000B' && LA23_145<='\f')||(LA23_145>='\u000E' && LA23_145<='.')||(LA23_145>='0' && LA23_145<='\uFFFF')) ) {s = 267;}

                        else s = 148;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA23_269 = input.LA(1);

                        s = -1;
                        if ( (LA23_269=='/') ) {s = 384;}

                        else if ( (LA23_269=='*') ) {s = 269;}

                        else if ( ((LA23_269>='\u0000' && LA23_269<=')')||(LA23_269>='+' && LA23_269<='.')||(LA23_269>='0' && LA23_269<='\uFFFF')) ) {s = 270;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA23_268 = input.LA(1);

                        s = -1;
                        if ( (LA23_268=='/') ) {s = 268;}

                        else if ( (LA23_268=='*') ) {s = 269;}

                        else if ( ((LA23_268>='\u0000' && LA23_268<=')')||(LA23_268>='+' && LA23_268<='.')||(LA23_268>='0' && LA23_268<='\uFFFF')) ) {s = 270;}

                        else s = 148;

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA23_146 = input.LA(1);

                        s = -1;
                        if ( (LA23_146=='/') ) {s = 268;}

                        else if ( (LA23_146=='*') ) {s = 269;}

                        else if ( ((LA23_146>='\u0000' && LA23_146<=')')||(LA23_146>='+' && LA23_146<='.')||(LA23_146>='0' && LA23_146<='\uFFFF')) ) {s = 270;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA23_265 = input.LA(1);

                        s = -1;
                        if ( (LA23_265=='\n') ) {s = 266;}

                        else if ( ((LA23_265>='\u0000' && LA23_265<='\t')||(LA23_265>='\u000B' && LA23_265<='\uFFFF')) ) {s = 148;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 23, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}