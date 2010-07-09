// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g 2010-07-09 08:23:19

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class rulesetParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "INT", "EXPONENT", "FLOAT", "COMMENT", "WS", "ESC_SEQ", "STRING", "CHAR", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "HTML", "JS", "REGEXP", "'ruleset'", "'{'", "'}'", "'rule'", "'is'", "';'", "'fired'", "'always'", "'notfired'", "'else'", "'if'", "'callbacks'", "'success'", "'failure'", "'click'", "'change'", "'='", "'triggers'", "'clear'", "':'", "'set'", "'forget'", "'in'", "'mark'", "'with'", "'+='", "'-='", "'from'", "'log'", "'last'", "'raise'", "'explicit'", "'event'", "'for'", "'active'", "'inactive'", "'test'", "'then'", "'('", "','", "')'", "'=>'", "'and'", "'choose'", "'every'", "'pre'", "'foreach'", "'select'", "'using'", "'when'", "'before'", "'or'", "'not'", "'between'", "'pageview'", "'submit'", "'dblclick'", "'update'", "'setting'", "'web'", "'on'", "'global'", "'datasource'", "'<-'", "'css'", "'function'", "'|'", "'||'", "'&&'", "'<='", "'>='", "'<'", "'>'", "'=='", "'!='", "'eq'", "'neq'", "'like'", "'+'", "'-'", "'*'", "'/'", "'%'", "'seen'", "'after'", "'true'", "'false'", "'['", "']'", "'current'", "'history'", "'.'", "'pick'", "'match'", "'length'", "'replace'", "'as'", "'head'", "'tail'", "'sort'", "'filter'", "'map'", "'uc'", "'lc'", "'split'", "'join'", "'query'", "'has'", "'union'", "'difference'", "'intersection'", "'unique'", "'once'", "'duplicates'", "'within'", "'ent'", "'app'", "'emit'", "'dataset'", "'JSON'", "'XML'", "'RSS'", "'HTML'", "'cachable'", "'years'", "'months'", "'weeks'", "'days'", "'hours'", "'minutes'", "'seconds'", "'year'", "'month'", "'week'", "'day'", "'hour'", "'minute'", "'second'", "'dispatch'", "'domain'", "'->'", "'meta'", "'name'", "'author'", "'key'", "'errorstack'", "'googleanalytics'", "'twitter'", "'amazon'", "'kpds'", "'google'", "'use'", "'module'", "'javascript'", "'resource'", "'authz'", "'require'", "'user'", "'logging'", "'off'", "'alias'", "'description'"
    };
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
    public static final int T__19=19;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__148=148;
    public static final int T__147=147;
    public static final int T__90=90;
    public static final int T__149=149;
    public static final int REGEXP=18;
    public static final int COMMENT=8;
    public static final int T__154=154;
    public static final int T__155=155;
    public static final int T__156=156;
    public static final int T__157=157;
    public static final int T__99=99;
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
    public static final int T__134=134;
    public static final int T__78=78;
    public static final int T__135=135;
    public static final int T__77=77;
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
    public static final int FLOAT=7;
    public static final int T__120=120;
    public static final int HTML=16;
    public static final int ID=4;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int ESC_SEQ=10;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__59=59;
    public static final int T__103=103;
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
    public static final int T__174=174;
    public static final int T__30=30;
    public static final int T__173=173;
    public static final int T__31=31;
    public static final int T__172=172;
    public static final int T__32=32;
    public static final int T__179=179;
    public static final int T__33=33;
    public static final int T__178=178;
    public static final int T__34=34;
    public static final int T__177=177;
    public static final int T__35=35;
    public static final int T__176=176;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__171=171;
    public static final int T__170=170;
    public static final int T__169=169;
    public static final int STRING=11;

    // delegates
    // delegators


        public rulesetParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public rulesetParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return rulesetParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g"; }



    // $ANTLR start "ruleset"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:67:1: ruleset : 'ruleset' rulesetname '{' ( meta_block | dispatch_block | global_decls )* '}' EOF ;
    public final void ruleset() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:68:3: ( 'ruleset' rulesetname '{' ( meta_block | dispatch_block | global_decls )* '}' EOF )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:68:5: 'ruleset' rulesetname '{' ( meta_block | dispatch_block | global_decls )* '}' EOF
            {
            match(input,19,FOLLOW_19_in_ruleset646); if (state.failed) return ;
            pushFollow(FOLLOW_rulesetname_in_ruleset648);
            rulesetname();

            state._fsp--;
            if (state.failed) return ;
            match(input,20,FOLLOW_20_in_ruleset650); if (state.failed) return ;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:69:4: ( meta_block | dispatch_block | global_decls )*
            loop1:
            do {
                int alt1=4;
                switch ( input.LA(1) ) {
                case 160:
                    {
                    alt1=1;
                    }
                    break;
                case 157:
                    {
                    alt1=2;
                    }
                    break;
                case 80:
                    {
                    alt1=3;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:69:6: meta_block
            	    {
            	    pushFollow(FOLLOW_meta_block_in_ruleset658);
            	    meta_block();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:70:6: dispatch_block
            	    {
            	    pushFollow(FOLLOW_dispatch_block_in_ruleset666);
            	    dispatch_block();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 3 :
            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:71:6: global_decls
            	    {
            	    pushFollow(FOLLOW_global_decls_in_ruleset673);
            	    global_decls();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match(input,21,FOLLOW_21_in_ruleset680); if (state.failed) return ;
            match(input,EOF,FOLLOW_EOF_in_ruleset682); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleset"


    // $ANTLR start "rulesetname"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:75:1: rulesetname : ( ID | INT );
    public final void rulesetname() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:76:2: ( ID | INT )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:
            {
            if ( (input.LA(1)>=ID && input.LA(1)<=INT) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "rulesetname"


    // $ANTLR start "rule"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:84:1: rule : 'rule' ID 'is' rule_state '{' select pre_block emit_block action ';' callbacks post_block '}' ;
    public final void rule() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:84:6: ( 'rule' ID 'is' rule_state '{' select pre_block emit_block action ';' callbacks post_block '}' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:84:9: 'rule' ID 'is' rule_state '{' select pre_block emit_block action ';' callbacks post_block '}'
            {
            match(input,22,FOLLOW_22_in_rule729); if (state.failed) return ;
            match(input,ID,FOLLOW_ID_in_rule731); if (state.failed) return ;
            match(input,23,FOLLOW_23_in_rule733); if (state.failed) return ;
            pushFollow(FOLLOW_rule_state_in_rule735);
            rule_state();

            state._fsp--;
            if (state.failed) return ;
            match(input,20,FOLLOW_20_in_rule737); if (state.failed) return ;
            pushFollow(FOLLOW_select_in_rule741);
            select();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_pre_block_in_rule743);
            pre_block();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_emit_block_in_rule745);
            emit_block();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_action_in_rule747);
            action();

            state._fsp--;
            if (state.failed) return ;
            match(input,24,FOLLOW_24_in_rule749); if (state.failed) return ;
            pushFollow(FOLLOW_callbacks_in_rule751);
            callbacks();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_post_block_in_rule753);
            post_block();

            state._fsp--;
            if (state.failed) return ;
            match(input,21,FOLLOW_21_in_rule756); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "rule"


    // $ANTLR start "post_block"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:91:1: post_block : post '{' post_statement ';' ';' '}' post_alternate ;
    public final void post_block() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:91:11: ( post '{' post_statement ';' ';' '}' post_alternate )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:91:13: post '{' post_statement ';' ';' '}' post_alternate
            {
            pushFollow(FOLLOW_post_in_post_block769);
            post();

            state._fsp--;
            if (state.failed) return ;
            match(input,20,FOLLOW_20_in_post_block771); if (state.failed) return ;
            pushFollow(FOLLOW_post_statement_in_post_block773);
            post_statement();

            state._fsp--;
            if (state.failed) return ;
            match(input,24,FOLLOW_24_in_post_block775); if (state.failed) return ;
            match(input,24,FOLLOW_24_in_post_block777); if (state.failed) return ;
            match(input,21,FOLLOW_21_in_post_block779); if (state.failed) return ;
            pushFollow(FOLLOW_post_alternate_in_post_block781);
            post_alternate();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "post_block"


    // $ANTLR start "post"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:93:1: post : ( 'fired' | 'always' | 'notfired' );
    public final void post() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:93:5: ( 'fired' | 'always' | 'notfired' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:
            {
            if ( (input.LA(1)>=25 && input.LA(1)<=27) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "post"


    // $ANTLR start "post_alternate"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:98:1: post_alternate : 'else' '{' post_statement ';' ';' '}' ;
    public final void post_alternate() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:98:15: ( 'else' '{' post_statement ';' ';' '}' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:98:17: 'else' '{' post_statement ';' ';' '}'
            {
            match(input,28,FOLLOW_28_in_post_alternate812); if (state.failed) return ;
            match(input,20,FOLLOW_20_in_post_alternate814); if (state.failed) return ;
            pushFollow(FOLLOW_post_statement_in_post_alternate816);
            post_statement();

            state._fsp--;
            if (state.failed) return ;
            match(input,24,FOLLOW_24_in_post_alternate818); if (state.failed) return ;
            match(input,24,FOLLOW_24_in_post_alternate820); if (state.failed) return ;
            match(input,21,FOLLOW_21_in_post_alternate822); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "post_alternate"


    // $ANTLR start "post_statement"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:100:1: post_statement : ( persistent_expr ( 'if' expr ) | log_statement ( 'if' expr ) | control_statement ( 'if' expr ) | raise_statement ( 'if' expr ) );
    public final void post_statement() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:100:15: ( persistent_expr ( 'if' expr ) | log_statement ( 'if' expr ) | control_statement ( 'if' expr ) | raise_statement ( 'if' expr ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 37:
            case 39:
            case 40:
            case 42:
            case 134:
            case 135:
                {
                alt2=1;
                }
                break;
            case 47:
                {
                alt2=2;
                }
                break;
            case 48:
                {
                alt2=3;
                }
                break;
            case 49:
                {
                alt2=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:100:17: persistent_expr ( 'if' expr )
                    {
                    pushFollow(FOLLOW_persistent_expr_in_post_statement829);
                    persistent_expr();

                    state._fsp--;
                    if (state.failed) return ;
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:100:33: ( 'if' expr )
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:100:34: 'if' expr
                    {
                    match(input,29,FOLLOW_29_in_post_statement832); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_post_statement834);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:101:5: log_statement ( 'if' expr )
                    {
                    pushFollow(FOLLOW_log_statement_in_post_statement841);
                    log_statement();

                    state._fsp--;
                    if (state.failed) return ;
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:101:19: ( 'if' expr )
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:101:20: 'if' expr
                    {
                    match(input,29,FOLLOW_29_in_post_statement844); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_post_statement846);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    }


                    }
                    break;
                case 3 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:102:5: control_statement ( 'if' expr )
                    {
                    pushFollow(FOLLOW_control_statement_in_post_statement853);
                    control_statement();

                    state._fsp--;
                    if (state.failed) return ;
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:102:23: ( 'if' expr )
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:102:24: 'if' expr
                    {
                    match(input,29,FOLLOW_29_in_post_statement856); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_post_statement858);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    }


                    }
                    break;
                case 4 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:103:5: raise_statement ( 'if' expr )
                    {
                    pushFollow(FOLLOW_raise_statement_in_post_statement865);
                    raise_statement();

                    state._fsp--;
                    if (state.failed) return ;
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:103:21: ( 'if' expr )
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:103:22: 'if' expr
                    {
                    match(input,29,FOLLOW_29_in_post_statement868); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_post_statement870);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "post_statement"


    // $ANTLR start "callbacks"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:107:1: callbacks : 'callbacks' '{' success failure '}' ;
    public final void callbacks() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:107:10: ( 'callbacks' '{' success failure '}' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:107:12: 'callbacks' '{' success failure '}'
            {
            match(input,30,FOLLOW_30_in_callbacks882); if (state.failed) return ;
            match(input,20,FOLLOW_20_in_callbacks884); if (state.failed) return ;
            pushFollow(FOLLOW_success_in_callbacks886);
            success();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_failure_in_callbacks888);
            failure();

            state._fsp--;
            if (state.failed) return ;
            match(input,21,FOLLOW_21_in_callbacks890); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "callbacks"


    // $ANTLR start "success"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:109:1: success : 'success' '{' click ';' ';' '}' ;
    public final void success() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:109:8: ( 'success' '{' click ';' ';' '}' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:109:10: 'success' '{' click ';' ';' '}'
            {
            match(input,31,FOLLOW_31_in_success897); if (state.failed) return ;
            match(input,20,FOLLOW_20_in_success899); if (state.failed) return ;
            pushFollow(FOLLOW_click_in_success901);
            click();

            state._fsp--;
            if (state.failed) return ;
            match(input,24,FOLLOW_24_in_success903); if (state.failed) return ;
            match(input,24,FOLLOW_24_in_success906); if (state.failed) return ;
            match(input,21,FOLLOW_21_in_success908); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "success"


    // $ANTLR start "failure"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:111:1: failure : 'failure' '{' click ';' ';' '}' ;
    public final void failure() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:111:8: ( 'failure' '{' click ';' ';' '}' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:111:10: 'failure' '{' click ';' ';' '}'
            {
            match(input,32,FOLLOW_32_in_failure915); if (state.failed) return ;
            match(input,20,FOLLOW_20_in_failure917); if (state.failed) return ;
            pushFollow(FOLLOW_click_in_failure919);
            click();

            state._fsp--;
            if (state.failed) return ;
            match(input,24,FOLLOW_24_in_failure921); if (state.failed) return ;
            match(input,24,FOLLOW_24_in_failure924); if (state.failed) return ;
            match(input,21,FOLLOW_21_in_failure926); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "failure"


    // $ANTLR start "click"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:113:1: click : ( 'click' | 'change' ) ID '=' STRING click_link ;
    public final void click() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:113:6: ( ( 'click' | 'change' ) ID '=' STRING click_link )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:113:8: ( 'click' | 'change' ) ID '=' STRING click_link
            {
            if ( (input.LA(1)>=33 && input.LA(1)<=34) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            match(input,ID,FOLLOW_ID_in_click941); if (state.failed) return ;
            match(input,35,FOLLOW_35_in_click943); if (state.failed) return ;
            match(input,STRING,FOLLOW_STRING_in_click945); if (state.failed) return ;
            pushFollow(FOLLOW_click_link_in_click947);
            click_link();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "click"


    // $ANTLR start "click_link"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:115:1: click_link : 'triggers' persistent_expr ;
    public final void click_link() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:115:11: ( 'triggers' persistent_expr )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:115:13: 'triggers' persistent_expr
            {
            match(input,36,FOLLOW_36_in_click_link954); if (state.failed) return ;
            pushFollow(FOLLOW_persistent_expr_in_click_link956);
            persistent_expr();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "click_link"


    // $ANTLR start "persistent_expr"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:118:1: persistent_expr : ( persistent_clear | persistent_set | persistent_iterate | trail_forget | trail_mark );
    public final void persistent_expr() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:118:16: ( persistent_clear | persistent_set | persistent_iterate | trail_forget | trail_mark )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt3=1;
                }
                break;
            case 39:
                {
                alt3=2;
                }
                break;
            case 134:
            case 135:
                {
                alt3=3;
                }
                break;
            case 40:
                {
                alt3=4;
                }
                break;
            case 42:
                {
                alt3=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:118:18: persistent_clear
                    {
                    pushFollow(FOLLOW_persistent_clear_in_persistent_expr964);
                    persistent_clear();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:119:6: persistent_set
                    {
                    pushFollow(FOLLOW_persistent_set_in_persistent_expr971);
                    persistent_set();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:120:6: persistent_iterate
                    {
                    pushFollow(FOLLOW_persistent_iterate_in_persistent_expr978);
                    persistent_iterate();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:121:6: trail_forget
                    {
                    pushFollow(FOLLOW_trail_forget_in_persistent_expr985);
                    trail_forget();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:122:6: trail_mark
                    {
                    pushFollow(FOLLOW_trail_mark_in_persistent_expr992);
                    trail_mark();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "persistent_expr"


    // $ANTLR start "persistent_clear"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:125:1: persistent_clear : 'clear' var_domain ':' ID ;
    public final void persistent_clear() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:125:17: ( 'clear' var_domain ':' ID )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:125:19: 'clear' var_domain ':' ID
            {
            match(input,37,FOLLOW_37_in_persistent_clear1000); if (state.failed) return ;
            pushFollow(FOLLOW_var_domain_in_persistent_clear1002);
            var_domain();

            state._fsp--;
            if (state.failed) return ;
            match(input,38,FOLLOW_38_in_persistent_clear1004); if (state.failed) return ;
            match(input,ID,FOLLOW_ID_in_persistent_clear1006); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "persistent_clear"


    // $ANTLR start "persistent_set"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:127:1: persistent_set : 'set' var_domain ':' ID ;
    public final void persistent_set() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:127:15: ( 'set' var_domain ':' ID )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:127:17: 'set' var_domain ':' ID
            {
            match(input,39,FOLLOW_39_in_persistent_set1013); if (state.failed) return ;
            pushFollow(FOLLOW_var_domain_in_persistent_set1015);
            var_domain();

            state._fsp--;
            if (state.failed) return ;
            match(input,38,FOLLOW_38_in_persistent_set1017); if (state.failed) return ;
            match(input,ID,FOLLOW_ID_in_persistent_set1019); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "persistent_set"


    // $ANTLR start "persistent_iterate"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:129:1: persistent_iterate : var_domain ':' ID counter_op expr counter_start ;
    public final void persistent_iterate() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:129:19: ( var_domain ':' ID counter_op expr counter_start )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:129:21: var_domain ':' ID counter_op expr counter_start
            {
            pushFollow(FOLLOW_var_domain_in_persistent_iterate1026);
            var_domain();

            state._fsp--;
            if (state.failed) return ;
            match(input,38,FOLLOW_38_in_persistent_iterate1028); if (state.failed) return ;
            match(input,ID,FOLLOW_ID_in_persistent_iterate1030); if (state.failed) return ;
            pushFollow(FOLLOW_counter_op_in_persistent_iterate1032);
            counter_op();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_persistent_iterate1034);
            expr();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_counter_start_in_persistent_iterate1036);
            counter_start();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "persistent_iterate"


    // $ANTLR start "trail_forget"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:131:1: trail_forget : 'forget' STRING 'in' var_domain ':' ID ;
    public final void trail_forget() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:131:13: ( 'forget' STRING 'in' var_domain ':' ID )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:131:15: 'forget' STRING 'in' var_domain ':' ID
            {
            match(input,40,FOLLOW_40_in_trail_forget1043); if (state.failed) return ;
            match(input,STRING,FOLLOW_STRING_in_trail_forget1045); if (state.failed) return ;
            match(input,41,FOLLOW_41_in_trail_forget1047); if (state.failed) return ;
            pushFollow(FOLLOW_var_domain_in_trail_forget1049);
            var_domain();

            state._fsp--;
            if (state.failed) return ;
            match(input,38,FOLLOW_38_in_trail_forget1051); if (state.failed) return ;
            match(input,ID,FOLLOW_ID_in_trail_forget1053); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "trail_forget"


    // $ANTLR start "trail_mark"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:133:1: trail_mark : 'mark' var_domain ':' ID trail_with ;
    public final void trail_mark() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:133:11: ( 'mark' var_domain ':' ID trail_with )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:133:13: 'mark' var_domain ':' ID trail_with
            {
            match(input,42,FOLLOW_42_in_trail_mark1060); if (state.failed) return ;
            pushFollow(FOLLOW_var_domain_in_trail_mark1062);
            var_domain();

            state._fsp--;
            if (state.failed) return ;
            match(input,38,FOLLOW_38_in_trail_mark1064); if (state.failed) return ;
            match(input,ID,FOLLOW_ID_in_trail_mark1066); if (state.failed) return ;
            pushFollow(FOLLOW_trail_with_in_trail_mark1068);
            trail_with();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "trail_mark"


    // $ANTLR start "trail_with"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:135:1: trail_with : 'with' expr ;
    public final void trail_with() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:135:11: ( 'with' expr )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:135:13: 'with' expr
            {
            match(input,43,FOLLOW_43_in_trail_with1075); if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_trail_with1077);
            expr();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "trail_with"


    // $ANTLR start "counter_op"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:138:1: counter_op : ( '+=' | '-=' );
    public final void counter_op() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:138:11: ( '+=' | '-=' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:
            {
            if ( (input.LA(1)>=44 && input.LA(1)<=45) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "counter_op"


    // $ANTLR start "counter_start"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:141:1: counter_start : 'from' expr ;
    public final void counter_start() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:141:14: ( 'from' expr )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:141:16: 'from' expr
            {
            match(input,46,FOLLOW_46_in_counter_start1106); if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_counter_start1108);
            expr();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "counter_start"


    // $ANTLR start "log_statement"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:144:1: log_statement : 'log' expr ;
    public final void log_statement() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:144:14: ( 'log' expr )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:144:16: 'log' expr
            {
            match(input,47,FOLLOW_47_in_log_statement1116); if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_log_statement1118);
            expr();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "log_statement"


    // $ANTLR start "control_statement"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:146:1: control_statement : 'last' ;
    public final void control_statement() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:146:18: ( 'last' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:146:20: 'last'
            {
            match(input,48,FOLLOW_48_in_control_statement1125); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "control_statement"


    // $ANTLR start "raise_statement"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:148:1: raise_statement : 'raise' 'explicit' 'event' ID for_clause modifier_clause ;
    public final void raise_statement() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:148:16: ( 'raise' 'explicit' 'event' ID for_clause modifier_clause )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:148:18: 'raise' 'explicit' 'event' ID for_clause modifier_clause
            {
            match(input,49,FOLLOW_49_in_raise_statement1132); if (state.failed) return ;
            match(input,50,FOLLOW_50_in_raise_statement1134); if (state.failed) return ;
            match(input,51,FOLLOW_51_in_raise_statement1136); if (state.failed) return ;
            match(input,ID,FOLLOW_ID_in_raise_statement1138); if (state.failed) return ;
            pushFollow(FOLLOW_for_clause_in_raise_statement1140);
            for_clause();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_modifier_clause_in_raise_statement1142);
            modifier_clause();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "raise_statement"


    // $ANTLR start "for_clause"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:150:1: for_clause : 'for' ID ;
    public final void for_clause() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:150:11: ( 'for' ID )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:150:13: 'for' ID
            {
            match(input,52,FOLLOW_52_in_for_clause1149); if (state.failed) return ;
            match(input,ID,FOLLOW_ID_in_for_clause1151); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "for_clause"


    // $ANTLR start "rule_state"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:155:1: rule_state : ( 'active' | 'inactive' | 'test' );
    public final void rule_state() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:155:11: ( 'active' | 'inactive' | 'test' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:
            {
            if ( (input.LA(1)>=53 && input.LA(1)<=55) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "rule_state"


    // $ANTLR start "action"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:161:1: action : ( conditional_action | unconditional_action );
    public final void action() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:161:9: ( conditional_action | unconditional_action )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==29) ) {
                alt4=1;
            }
            else if ( (LA4_0==ID||(LA4_0>=62 && LA4_0<=63)) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:161:11: conditional_action
                    {
                    pushFollow(FOLLOW_conditional_action_in_action1223);
                    conditional_action();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:161:32: unconditional_action
                    {
                    pushFollow(FOLLOW_unconditional_action_in_action1227);
                    unconditional_action();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "action"


    // $ANTLR start "conditional_action"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:165:1: conditional_action : 'if' expr 'then' unconditional_action ;
    public final void conditional_action() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:166:2: ( 'if' expr 'then' unconditional_action )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:166:4: 'if' expr 'then' unconditional_action
            {
            match(input,29,FOLLOW_29_in_conditional_action1241); if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_conditional_action1243);
            expr();

            state._fsp--;
            if (state.failed) return ;
            match(input,56,FOLLOW_56_in_conditional_action1245); if (state.failed) return ;
            pushFollow(FOLLOW_unconditional_action_in_conditional_action1247);
            unconditional_action();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "conditional_action"


    // $ANTLR start "unconditional_action"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:169:1: unconditional_action : ( primrule | actionblock );
    public final void unconditional_action() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:170:2: ( primrule | actionblock )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ID) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=62 && LA5_0<=63)) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:170:4: primrule
                    {
                    pushFollow(FOLLOW_primrule_in_unconditional_action1260);
                    primrule();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:170:15: actionblock
                    {
                    pushFollow(FOLLOW_actionblock_in_unconditional_action1264);
                    actionblock();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "unconditional_action"


    // $ANTLR start "primrule"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:173:1: primrule : ( rule_label namespace ID '(' expr ',' ')' modifier_clause | rule_label emit_block );
    public final void primrule() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:174:2: ( rule_label namespace ID '(' expr ',' ')' modifier_clause | rule_label emit_block )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==60) ) {
                    int LA6_2 = input.LA(3);

                    if ( (LA6_2==136) ) {
                        alt6=2;
                    }
                    else if ( (LA6_2==ID) ) {
                        alt6=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:174:4: rule_label namespace ID '(' expr ',' ')' modifier_clause
                    {
                    pushFollow(FOLLOW_rule_label_in_primrule1277);
                    rule_label();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_namespace_in_primrule1279);
                    namespace();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,ID,FOLLOW_ID_in_primrule1281); if (state.failed) return ;
                    match(input,57,FOLLOW_57_in_primrule1283); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_primrule1285);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,58,FOLLOW_58_in_primrule1287); if (state.failed) return ;
                    match(input,59,FOLLOW_59_in_primrule1289); if (state.failed) return ;
                    pushFollow(FOLLOW_modifier_clause_in_primrule1291);
                    modifier_clause();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:175:4: rule_label emit_block
                    {
                    pushFollow(FOLLOW_rule_label_in_primrule1298);
                    rule_label();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_emit_block_in_primrule1300);
                    emit_block();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "primrule"


    // $ANTLR start "rule_label"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:178:1: rule_label : ID '=>' ;
    public final void rule_label() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:178:12: ( ID '=>' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:178:14: ID '=>'
            {
            match(input,ID,FOLLOW_ID_in_rule_label1321); if (state.failed) return ;
            match(input,60,FOLLOW_60_in_rule_label1323); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "rule_label"


    // $ANTLR start "modifier_clause"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:180:1: modifier_clause : 'with' modifier 'and' ;
    public final void modifier_clause() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:181:2: ( 'with' modifier 'and' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:181:4: 'with' modifier 'and'
            {
            match(input,43,FOLLOW_43_in_modifier_clause1342); if (state.failed) return ;
            pushFollow(FOLLOW_modifier_in_modifier_clause1344);
            modifier();

            state._fsp--;
            if (state.failed) return ;
            match(input,61,FOLLOW_61_in_modifier_clause1346); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "modifier_clause"


    // $ANTLR start "modifier"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:185:1: modifier : ( ID '=' expr | ID '=' JS );
    public final void modifier() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:185:9: ( ID '=' expr | ID '=' JS )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==35) ) {
                    int LA7_2 = input.LA(3);

                    if ( (LA7_2==JS) ) {
                        alt7=2;
                    }
                    else if ( ((LA7_2>=ID && LA7_2<=INT)||LA7_2==STRING||LA7_2==REGEXP||LA7_2==20||LA7_2==57||LA7_2==71||LA7_2==84||LA7_2==98||LA7_2==102||(LA7_2>=104 && LA7_2<=106)||(LA7_2>=108 && LA7_2<=109)||(LA7_2>=134 && LA7_2<=135)) ) {
                        alt7=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:185:11: ID '=' expr
                    {
                    match(input,ID,FOLLOW_ID_in_modifier1357); if (state.failed) return ;
                    match(input,35,FOLLOW_35_in_modifier1359); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_modifier1361);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:186:3: ID '=' JS
                    {
                    match(input,ID,FOLLOW_ID_in_modifier1367); if (state.failed) return ;
                    match(input,35,FOLLOW_35_in_modifier1369); if (state.failed) return ;
                    match(input,JS,FOLLOW_JS_in_modifier1371); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "modifier"


    // $ANTLR start "actionblock"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:189:1: actionblock : blocktype '{' primrule ';' ';' '}' ;
    public final void actionblock() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:190:2: ( blocktype '{' primrule ';' ';' '}' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:190:4: blocktype '{' primrule ';' ';' '}'
            {
            pushFollow(FOLLOW_blocktype_in_actionblock1384);
            blocktype();

            state._fsp--;
            if (state.failed) return ;
            match(input,20,FOLLOW_20_in_actionblock1386); if (state.failed) return ;
            pushFollow(FOLLOW_primrule_in_actionblock1388);
            primrule();

            state._fsp--;
            if (state.failed) return ;
            match(input,24,FOLLOW_24_in_actionblock1390); if (state.failed) return ;
            match(input,24,FOLLOW_24_in_actionblock1392); if (state.failed) return ;
            match(input,21,FOLLOW_21_in_actionblock1394); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "actionblock"


    // $ANTLR start "blocktype"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:193:1: blocktype : ( 'choose' | 'every' );
    public final void blocktype() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:193:10: ( 'choose' | 'every' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:
            {
            if ( (input.LA(1)>=62 && input.LA(1)<=63) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "blocktype"


    // $ANTLR start "pre_block"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:197:1: pre_block : 'pre' '{' decl ';' ';' '}' ;
    public final void pre_block() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:197:10: ( 'pre' '{' decl ';' ';' '}' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:197:12: 'pre' '{' decl ';' ';' '}'
            {
            match(input,64,FOLLOW_64_in_pre_block1436); if (state.failed) return ;
            match(input,20,FOLLOW_20_in_pre_block1438); if (state.failed) return ;
            pushFollow(FOLLOW_decl_in_pre_block1440);
            decl();

            state._fsp--;
            if (state.failed) return ;
            match(input,24,FOLLOW_24_in_pre_block1442); if (state.failed) return ;
            match(input,24,FOLLOW_24_in_pre_block1444); if (state.failed) return ;
            match(input,21,FOLLOW_21_in_pre_block1446); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "pre_block"


    // $ANTLR start "foreach"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:200:1: foreach : 'foreach' expr setting ;
    public final void foreach() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:200:8: ( 'foreach' expr setting )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:201:2: 'foreach' expr setting
            {
            match(input,65,FOLLOW_65_in_foreach1466); if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_foreach1468);
            expr();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_setting_in_foreach1470);
            setting();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "foreach"


    // $ANTLR start "select"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:204:1: select : 'select' ( using | when ) foreach ;
    public final void select() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:204:8: ( 'select' ( using | when ) foreach )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:204:10: 'select' ( using | when ) foreach
            {
            match(input,66,FOLLOW_66_in_select1489); if (state.failed) return ;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:204:19: ( using | when )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==67) ) {
                alt8=1;
            }
            else if ( (LA8_0==68) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:204:20: using
                    {
                    pushFollow(FOLLOW_using_in_select1492);
                    using();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:204:26: when
                    {
                    pushFollow(FOLLOW_when_in_select1494);
                    when();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_foreach_in_select1497);
            foreach();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "select"


    // $ANTLR start "using"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:207:1: using : 'using' STRING setting ;
    public final void using() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:207:7: ( 'using' STRING setting )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:207:9: 'using' STRING setting
            {
            match(input,67,FOLLOW_67_in_using1510); if (state.failed) return ;
            match(input,STRING,FOLLOW_STRING_in_using1512); if (state.failed) return ;
            pushFollow(FOLLOW_setting_in_using1514);
            setting();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "using"


    // $ANTLR start "when"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:209:1: when : 'when' event_seq ;
    public final void when() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:209:6: ( 'when' event_seq )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:209:7: 'when' event_seq
            {
            match(input,68,FOLLOW_68_in_when1521); if (state.failed) return ;
            pushFollow(FOLLOW_event_seq_in_when1523);
            event_seq();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "when"


    // $ANTLR start "event_seq"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:211:1: event_seq options {backtrack=true; } : event_or ( 'then' | 'before' ) event_or ;
    public final void event_seq() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:212:2: ( event_or ( 'then' | 'before' ) event_or )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:212:4: event_or ( 'then' | 'before' ) event_or
            {
            pushFollow(FOLLOW_event_or_in_event_seq1544);
            event_or();

            state._fsp--;
            if (state.failed) return ;
            if ( input.LA(1)==56||input.LA(1)==69 ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            pushFollow(FOLLOW_event_or_in_event_seq1552);
            event_or();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "event_seq"


    // $ANTLR start "event_or"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:215:1: event_or : event_and ( 'or' ) event_and ;
    public final void event_or() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:215:9: ( event_and ( 'or' ) event_and )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:215:11: event_and ( 'or' ) event_and
            {
            pushFollow(FOLLOW_event_and_in_event_or1563);
            event_and();

            state._fsp--;
            if (state.failed) return ;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:215:21: ( 'or' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:215:22: 'or'
            {
            match(input,70,FOLLOW_70_in_event_or1566); if (state.failed) return ;

            }

            pushFollow(FOLLOW_event_and_in_event_or1569);
            event_and();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "event_or"


    // $ANTLR start "event_and"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:217:1: event_and : event_btwn ( 'and' ) event_btwn ;
    public final void event_and() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:218:2: ( event_btwn ( 'and' ) event_btwn )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:218:4: event_btwn ( 'and' ) event_btwn
            {
            pushFollow(FOLLOW_event_btwn_in_event_and1578);
            event_btwn();

            state._fsp--;
            if (state.failed) return ;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:218:15: ( 'and' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:218:16: 'and'
            {
            match(input,61,FOLLOW_61_in_event_and1581); if (state.failed) return ;

            }

            pushFollow(FOLLOW_event_btwn_in_event_and1584);
            event_btwn();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "event_and"


    // $ANTLR start "event_btwn"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:221:1: event_btwn : event_prim ( 'not' ) 'between' '(' event_seq ',' event_seq ')' ;
    public final void event_btwn() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:222:2: ( event_prim ( 'not' ) 'between' '(' event_seq ',' event_seq ')' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:222:4: event_prim ( 'not' ) 'between' '(' event_seq ',' event_seq ')'
            {
            pushFollow(FOLLOW_event_prim_in_event_btwn1595);
            event_prim();

            state._fsp--;
            if (state.failed) return ;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:222:15: ( 'not' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:222:16: 'not'
            {
            match(input,71,FOLLOW_71_in_event_btwn1598); if (state.failed) return ;

            }

            match(input,72,FOLLOW_72_in_event_btwn1601); if (state.failed) return ;
            match(input,57,FOLLOW_57_in_event_btwn1603); if (state.failed) return ;
            pushFollow(FOLLOW_event_seq_in_event_btwn1605);
            event_seq();

            state._fsp--;
            if (state.failed) return ;
            match(input,58,FOLLOW_58_in_event_btwn1607); if (state.failed) return ;
            pushFollow(FOLLOW_event_seq_in_event_btwn1609);
            event_seq();

            state._fsp--;
            if (state.failed) return ;
            match(input,59,FOLLOW_59_in_event_btwn1611); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "event_btwn"


    // $ANTLR start "event_prim"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:225:1: event_prim : ( event_domain 'pageview' ( STRING | REGEXP ) setting | event_domain ( 'submit' | 'click' | 'dblclick' | 'change' | 'update' ) STRING on_expr setting | ID ID event_filter setting | '(' event_seq ')' );
    public final void event_prim() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:226:2: ( event_domain 'pageview' ( STRING | REGEXP ) setting | event_domain ( 'submit' | 'click' | 'dblclick' | 'change' | 'update' ) STRING on_expr setting | ID ID event_filter setting | '(' event_seq ')' )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 78:
                {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==73) ) {
                    alt9=1;
                }
                else if ( ((LA9_1>=33 && LA9_1<=34)||(LA9_1>=74 && LA9_1<=76)) ) {
                    alt9=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
                }
                break;
            case ID:
                {
                alt9=3;
                }
                break;
            case 57:
                {
                alt9=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:226:4: event_domain 'pageview' ( STRING | REGEXP ) setting
                    {
                    pushFollow(FOLLOW_event_domain_in_event_prim1626);
                    event_domain();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,73,FOLLOW_73_in_event_prim1628); if (state.failed) return ;
                    if ( input.LA(1)==STRING||input.LA(1)==REGEXP ) {
                        input.consume();
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_setting_in_event_prim1636);
                    setting();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:227:2: event_domain ( 'submit' | 'click' | 'dblclick' | 'change' | 'update' ) STRING on_expr setting
                    {
                    pushFollow(FOLLOW_event_domain_in_event_prim1641);
                    event_domain();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( (input.LA(1)>=33 && input.LA(1)<=34)||(input.LA(1)>=74 && input.LA(1)<=76) ) {
                        input.consume();
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    match(input,STRING,FOLLOW_STRING_in_event_prim1655); if (state.failed) return ;
                    pushFollow(FOLLOW_on_expr_in_event_prim1657);
                    on_expr();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_setting_in_event_prim1660);
                    setting();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:228:2: ID ID event_filter setting
                    {
                    match(input,ID,FOLLOW_ID_in_event_prim1665); if (state.failed) return ;
                    match(input,ID,FOLLOW_ID_in_event_prim1667); if (state.failed) return ;
                    pushFollow(FOLLOW_event_filter_in_event_prim1669);
                    event_filter();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_setting_in_event_prim1671);
                    setting();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:229:2: '(' event_seq ')'
                    {
                    match(input,57,FOLLOW_57_in_event_prim1676); if (state.failed) return ;
                    pushFollow(FOLLOW_event_seq_in_event_prim1678);
                    event_seq();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,59,FOLLOW_59_in_event_prim1680); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "event_prim"


    // $ANTLR start "setting"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:232:1: setting : 'setting' '(' ID ',' ')' ;
    public final void setting() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:232:9: ( 'setting' '(' ID ',' ')' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:232:11: 'setting' '(' ID ',' ')'
            {
            match(input,77,FOLLOW_77_in_setting1691); if (state.failed) return ;
            match(input,57,FOLLOW_57_in_setting1693); if (state.failed) return ;
            match(input,ID,FOLLOW_ID_in_setting1695); if (state.failed) return ;
            match(input,58,FOLLOW_58_in_setting1697); if (state.failed) return ;
            match(input,59,FOLLOW_59_in_setting1699); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "setting"


    // $ANTLR start "event_domain"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:234:1: event_domain : 'web' ;
    public final void event_domain() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:235:2: ( 'web' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:235:4: 'web'
            {
            match(input,78,FOLLOW_78_in_event_domain1709); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "event_domain"


    // $ANTLR start "event_filter"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:238:1: event_filter : ID ( STRING | REGEXP ) ;
    public final void event_filter() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:239:2: ( ID ( STRING | REGEXP ) )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:239:4: ID ( STRING | REGEXP )
            {
            match(input,ID,FOLLOW_ID_in_event_filter1723); if (state.failed) return ;
            if ( input.LA(1)==STRING||input.LA(1)==REGEXP ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "event_filter"


    // $ANTLR start "on_expr"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:242:1: on_expr : 'on' ( STRING | REGEXP ) ;
    public final void on_expr() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:242:9: ( 'on' ( STRING | REGEXP ) )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:242:11: 'on' ( STRING | REGEXP )
            {
            match(input,79,FOLLOW_79_in_on_expr1743); if (state.failed) return ;
            if ( input.LA(1)==STRING||input.LA(1)==REGEXP ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "on_expr"


    // $ANTLR start "global_decls"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:246:1: global_decls : 'global' '{' ( global ';' )+ ( ';' )? '}' ;
    public final void global_decls() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:247:2: ( 'global' '{' ( global ';' )+ ( ';' )? '}' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:247:4: 'global' '{' ( global ';' )+ ( ';' )? '}'
            {
            match(input,80,FOLLOW_80_in_global_decls1769); if (state.failed) return ;
            match(input,20,FOLLOW_20_in_global_decls1771); if (state.failed) return ;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:247:17: ( global ';' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==ID||LA10_0==81||LA10_0==83||(LA10_0>=136 && LA10_0<=137)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:247:19: global ';'
            	    {
            	    pushFollow(FOLLOW_global_in_global_decls1775);
            	    global();

            	    state._fsp--;
            	    if (state.failed) return ;
            	    match(input,24,FOLLOW_24_in_global_decls1777); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:247:32: ( ';' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:247:32: ';'
                    {
                    match(input,24,FOLLOW_24_in_global_decls1781); if (state.failed) return ;

                    }
                    break;

            }

            match(input,21,FOLLOW_21_in_global_decls1784); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "global_decls"


    // $ANTLR start "global"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:250:1: global : ( emit_block | dataset | datasource | css_emit | decl );
    public final void global() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:250:9: ( emit_block | dataset | datasource | css_emit | decl )
            int alt12=5;
            switch ( input.LA(1) ) {
            case 136:
                {
                alt12=1;
                }
                break;
            case 137:
                {
                alt12=2;
                }
                break;
            case 81:
                {
                alt12=3;
                }
                break;
            case 83:
                {
                alt12=4;
                }
                break;
            case ID:
                {
                alt12=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:250:11: emit_block
                    {
                    pushFollow(FOLLOW_emit_block_in_global1800);
                    emit_block();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:250:24: dataset
                    {
                    pushFollow(FOLLOW_dataset_in_global1804);
                    dataset();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:250:34: datasource
                    {
                    pushFollow(FOLLOW_datasource_in_global1808);
                    datasource();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:250:47: css_emit
                    {
                    pushFollow(FOLLOW_css_emit_in_global1812);
                    css_emit();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:250:58: decl
                    {
                    pushFollow(FOLLOW_decl_in_global1816);
                    decl();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "global"


    // $ANTLR start "datasource"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:253:1: datasource : 'datasource' ID ( datatype )? '<-' STRING cachable ;
    public final void datasource() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:254:2: ( 'datasource' ID ( datatype )? '<-' STRING cachable )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:254:5: 'datasource' ID ( datatype )? '<-' STRING cachable
            {
            match(input,81,FOLLOW_81_in_datasource1828); if (state.failed) return ;
            match(input,ID,FOLLOW_ID_in_datasource1830); if (state.failed) return ;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:254:21: ( datatype )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==38) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:254:21: datatype
                    {
                    pushFollow(FOLLOW_datatype_in_datasource1832);
                    datatype();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,82,FOLLOW_82_in_datasource1835); if (state.failed) return ;
            match(input,STRING,FOLLOW_STRING_in_datasource1837); if (state.failed) return ;
            pushFollow(FOLLOW_cachable_in_datasource1839);
            cachable();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "datasource"


    // $ANTLR start "css_emit"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:257:1: css_emit : 'css' ( HTML | STRING ) ;
    public final void css_emit() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:258:2: ( 'css' ( HTML | STRING ) )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:258:4: 'css' ( HTML | STRING )
            {
            match(input,83,FOLLOW_83_in_css_emit1851); if (state.failed) return ;
            if ( input.LA(1)==STRING||input.LA(1)==HTML ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "css_emit"


    // $ANTLR start "decl"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:261:1: decl options {backtrack=true; } : ( ID '=' HTML | ID '=' JS | ID '=' expr | ID '=' factor );
    public final void decl() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:261:39: ( ID '=' HTML | ID '=' JS | ID '=' expr | ID '=' factor )
            int alt14=4;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==ID) ) {
                int LA14_1 = input.LA(2);

                if ( (synpred1_ruleset()) ) {
                    alt14=1;
                }
                else if ( (synpred2_ruleset()) ) {
                    alt14=2;
                }
                else if ( (synpred3_ruleset()) ) {
                    alt14=3;
                }
                else if ( (true) ) {
                    alt14=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:262:2: ID '=' HTML
                    {
                    match(input,ID,FOLLOW_ID_in_decl1887); if (state.failed) return ;
                    match(input,35,FOLLOW_35_in_decl1889); if (state.failed) return ;
                    match(input,HTML,FOLLOW_HTML_in_decl1891); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:263:2: ID '=' JS
                    {
                    match(input,ID,FOLLOW_ID_in_decl1896); if (state.failed) return ;
                    match(input,35,FOLLOW_35_in_decl1898); if (state.failed) return ;
                    match(input,JS,FOLLOW_JS_in_decl1900); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:264:2: ID '=' expr
                    {
                    match(input,ID,FOLLOW_ID_in_decl1905); if (state.failed) return ;
                    match(input,35,FOLLOW_35_in_decl1907); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_decl1909);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:265:2: ID '=' factor
                    {
                    match(input,ID,FOLLOW_ID_in_decl1915); if (state.failed) return ;
                    match(input,35,FOLLOW_35_in_decl1917); if (state.failed) return ;
                    pushFollow(FOLLOW_factor_in_decl1919);
                    factor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "decl"


    // $ANTLR start "expr"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:271:1: expr options {backtrack=true; } : ( function_def | conditional_expression );
    public final void expr() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:271:36: ( function_def | conditional_expression )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==84) ) {
                alt15=1;
            }
            else if ( ((LA15_0>=ID && LA15_0<=INT)||LA15_0==STRING||LA15_0==REGEXP||LA15_0==20||LA15_0==57||LA15_0==71||LA15_0==98||LA15_0==102||(LA15_0>=104 && LA15_0<=106)||(LA15_0>=108 && LA15_0<=109)||(LA15_0>=134 && LA15_0<=135)) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:271:38: function_def
                    {
                    pushFollow(FOLLOW_function_def_in_expr1948);
                    function_def();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:271:53: conditional_expression
                    {
                    pushFollow(FOLLOW_conditional_expression_in_expr1952);
                    conditional_expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "expr"


    // $ANTLR start "function_def"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:274:1: function_def options {backtrack=true; } : 'function' '(' ( ID ( ',' )? )* ')' '{' ( fundecls )* expr '}' ;
    public final void function_def() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:275:2: ( 'function' '(' ( ID ( ',' )? )* ')' '{' ( fundecls )* expr '}' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:275:4: 'function' '(' ( ID ( ',' )? )* ')' '{' ( fundecls )* expr '}'
            {
            match(input,84,FOLLOW_84_in_function_def1977); if (state.failed) return ;
            match(input,57,FOLLOW_57_in_function_def1979); if (state.failed) return ;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:275:19: ( ID ( ',' )? )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:275:20: ID ( ',' )?
            	    {
            	    match(input,ID,FOLLOW_ID_in_function_def1982); if (state.failed) return ;
            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:275:23: ( ',' )?
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==58) ) {
            	        alt16=1;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:275:23: ','
            	            {
            	            match(input,58,FOLLOW_58_in_function_def1984); if (state.failed) return ;

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            match(input,59,FOLLOW_59_in_function_def1989); if (state.failed) return ;
            match(input,20,FOLLOW_20_in_function_def1991); if (state.failed) return ;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:275:38: ( fundecls )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==ID) ) {
                    int LA18_2 = input.LA(2);

                    if ( (LA18_2==35) ) {
                        alt18=1;
                    }


                }


                switch (alt18) {
            	case 1 :
            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:275:38: fundecls
            	    {
            	    pushFollow(FOLLOW_fundecls_in_function_def1993);
            	    fundecls();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            pushFollow(FOLLOW_expr_in_function_def1996);
            expr();

            state._fsp--;
            if (state.failed) return ;
            match(input,21,FOLLOW_21_in_function_def1998); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "function_def"


    // $ANTLR start "fundecls"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:278:1: fundecls options {backtrack=true; } : ( decl ( ';' )? ) ;
    public final void fundecls() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:279:2: ( ( decl ( ';' )? ) )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:279:4: ( decl ( ';' )? )
            {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:279:4: ( decl ( ';' )? )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:279:5: decl ( ';' )?
            {
            pushFollow(FOLLOW_decl_in_fundecls2023);
            decl();

            state._fsp--;
            if (state.failed) return ;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:279:10: ( ';' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==24) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:279:10: ';'
                    {
                    match(input,24,FOLLOW_24_in_fundecls2025); if (state.failed) return ;

                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "fundecls"


    // $ANTLR start "conditional_expression"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:284:1: conditional_expression options {backtrack=true; } : ( disjunction '=>' expr '|' expr | disjunction );
    public final void conditional_expression() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:285:2: ( disjunction '=>' expr '|' expr | disjunction )
            int alt20=2;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:285:4: disjunction '=>' expr '|' expr
                    {
                    pushFollow(FOLLOW_disjunction_in_conditional_expression2053);
                    disjunction();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,60,FOLLOW_60_in_conditional_expression2055); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_conditional_expression2057);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,85,FOLLOW_85_in_conditional_expression2059); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_conditional_expression2061);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:285:37: disjunction
                    {
                    pushFollow(FOLLOW_disjunction_in_conditional_expression2065);
                    disjunction();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "conditional_expression"


    // $ANTLR start "disjunction"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:288:1: disjunction : conjunction '||' conjunction ;
    public final void disjunction() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:289:2: ( conjunction '||' conjunction )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:289:4: conjunction '||' conjunction
            {
            pushFollow(FOLLOW_conjunction_in_disjunction2078);
            conjunction();

            state._fsp--;
            if (state.failed) return ;
            match(input,86,FOLLOW_86_in_disjunction2080); if (state.failed) return ;
            pushFollow(FOLLOW_conjunction_in_disjunction2082);
            conjunction();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "disjunction"


    // $ANTLR start "conjunction"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:292:1: conjunction : equality_expr '&&' equality_expr ;
    public final void conjunction() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:293:2: ( equality_expr '&&' equality_expr )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:293:4: equality_expr '&&' equality_expr
            {
            pushFollow(FOLLOW_equality_expr_in_conjunction2097);
            equality_expr();

            state._fsp--;
            if (state.failed) return ;
            match(input,87,FOLLOW_87_in_conjunction2099); if (state.failed) return ;
            pushFollow(FOLLOW_equality_expr_in_conjunction2101);
            equality_expr();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "conjunction"


    // $ANTLR start "equality_expr"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:296:1: equality_expr : add_expr predop add_expr ;
    public final void equality_expr() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:297:2: ( add_expr predop add_expr )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:297:4: add_expr predop add_expr
            {
            pushFollow(FOLLOW_add_expr_in_equality_expr2116);
            add_expr();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_predop_in_equality_expr2118);
            predop();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_add_expr_in_equality_expr2120);
            add_expr();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "equality_expr"


    // $ANTLR start "predop"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:300:1: predop : ( '<=' | '>=' | '<' | '>' | '==' | '!=' | 'eq' | 'neq' | 'like' );
    public final void predop() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:300:7: ( '<=' | '>=' | '<' | '>' | '==' | '!=' | 'eq' | 'neq' | 'like' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:
            {
            if ( (input.LA(1)>=88 && input.LA(1)<=96) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "predop"


    // $ANTLR start "add_expr"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:302:1: add_expr : mult_expr add_op mult_expr ;
    public final void add_expr() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:302:9: ( mult_expr add_op mult_expr )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:302:11: mult_expr add_op mult_expr
            {
            pushFollow(FOLLOW_mult_expr_in_add_expr2173);
            mult_expr();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_add_op_in_add_expr2175);
            add_op();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_mult_expr_in_add_expr2177);
            mult_expr();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "add_expr"


    // $ANTLR start "add_op"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:304:1: add_op : ( '+' | '-' );
    public final void add_op() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:304:7: ( '+' | '-' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:
            {
            if ( (input.LA(1)>=97 && input.LA(1)<=98) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "add_op"


    // $ANTLR start "mult_expr"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:306:1: mult_expr : unary_expr mult_op unary_expr ;
    public final void mult_expr() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:307:2: ( unary_expr mult_op unary_expr )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:307:4: unary_expr mult_op unary_expr
            {
            pushFollow(FOLLOW_unary_expr_in_mult_expr2197);
            unary_expr();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_mult_op_in_mult_expr2199);
            mult_op();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_unary_expr_in_mult_expr2201);
            unary_expr();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "mult_expr"


    // $ANTLR start "mult_op"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:310:1: mult_op : ( '*' | '/' | '%' );
    public final void mult_op() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:310:8: ( '*' | '/' | '%' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:
            {
            if ( (input.LA(1)>=99 && input.LA(1)<=101) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "mult_op"


    // $ANTLR start "unary_expr"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:312:1: unary_expr : ( 'not' unary_expr | 'seen' STRING 'in' var_domain ':' ID timeframe | 'seen' STRING ( 'before' | 'after' ) STRING 'in' var_domain ':' ID | var_domain ':' ID predop expr timeframe | var_domain ':' ID timeframe | operator_expr );
    public final void unary_expr() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:313:2: ( 'not' unary_expr | 'seen' STRING 'in' var_domain ':' ID timeframe | 'seen' STRING ( 'before' | 'after' ) STRING 'in' var_domain ':' ID | var_domain ':' ID predop expr timeframe | var_domain ':' ID timeframe | operator_expr )
            int alt21=6;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:313:4: 'not' unary_expr
                    {
                    match(input,71,FOLLOW_71_in_unary_expr2224); if (state.failed) return ;
                    pushFollow(FOLLOW_unary_expr_in_unary_expr2226);
                    unary_expr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:314:2: 'seen' STRING 'in' var_domain ':' ID timeframe
                    {
                    match(input,102,FOLLOW_102_in_unary_expr2232); if (state.failed) return ;
                    match(input,STRING,FOLLOW_STRING_in_unary_expr2234); if (state.failed) return ;
                    match(input,41,FOLLOW_41_in_unary_expr2236); if (state.failed) return ;
                    pushFollow(FOLLOW_var_domain_in_unary_expr2238);
                    var_domain();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,38,FOLLOW_38_in_unary_expr2240); if (state.failed) return ;
                    match(input,ID,FOLLOW_ID_in_unary_expr2242); if (state.failed) return ;
                    pushFollow(FOLLOW_timeframe_in_unary_expr2244);
                    timeframe();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:315:2: 'seen' STRING ( 'before' | 'after' ) STRING 'in' var_domain ':' ID
                    {
                    match(input,102,FOLLOW_102_in_unary_expr2249); if (state.failed) return ;
                    match(input,STRING,FOLLOW_STRING_in_unary_expr2251); if (state.failed) return ;
                    if ( input.LA(1)==69||input.LA(1)==103 ) {
                        input.consume();
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    match(input,STRING,FOLLOW_STRING_in_unary_expr2261); if (state.failed) return ;
                    match(input,41,FOLLOW_41_in_unary_expr2263); if (state.failed) return ;
                    pushFollow(FOLLOW_var_domain_in_unary_expr2265);
                    var_domain();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,38,FOLLOW_38_in_unary_expr2267); if (state.failed) return ;
                    match(input,ID,FOLLOW_ID_in_unary_expr2269); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:316:2: var_domain ':' ID predop expr timeframe
                    {
                    pushFollow(FOLLOW_var_domain_in_unary_expr2274);
                    var_domain();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,38,FOLLOW_38_in_unary_expr2276); if (state.failed) return ;
                    match(input,ID,FOLLOW_ID_in_unary_expr2278); if (state.failed) return ;
                    pushFollow(FOLLOW_predop_in_unary_expr2280);
                    predop();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_unary_expr2282);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_timeframe_in_unary_expr2284);
                    timeframe();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:317:2: var_domain ':' ID timeframe
                    {
                    pushFollow(FOLLOW_var_domain_in_unary_expr2289);
                    var_domain();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,38,FOLLOW_38_in_unary_expr2291); if (state.failed) return ;
                    match(input,ID,FOLLOW_ID_in_unary_expr2293); if (state.failed) return ;
                    pushFollow(FOLLOW_timeframe_in_unary_expr2295);
                    timeframe();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:318:2: operator_expr
                    {
                    pushFollow(FOLLOW_operator_expr_in_unary_expr2300);
                    operator_expr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "unary_expr"


    // $ANTLR start "operator_expr"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:322:1: operator_expr : factor operator ;
    public final void operator_expr() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:323:2: ( factor operator )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:323:4: factor operator
            {
            pushFollow(FOLLOW_factor_in_operator_expr2314);
            factor();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_operator_in_operator_expr2316);
            operator();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "operator_expr"


    // $ANTLR start "factor"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:326:1: factor options {backtrack=true; } : ( INT | '-' INT | STRING | REGEXP | 'true' | 'false' | ID '[' expr ']' | persistent_var | trail_exp | function_app | '[' expr ',' ']' | '{' hash_line ',' '}' | ID | '(' expr ')' );
    public final void factor() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:326:37: ( INT | '-' INT | STRING | REGEXP | 'true' | 'false' | ID '[' expr ']' | persistent_var | trail_exp | function_app | '[' expr ',' ']' | '{' hash_line ',' '}' | ID | '(' expr ')' )
            int alt22=14;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:326:39: INT
                    {
                    match(input,INT,FOLLOW_INT_in_factor2338); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:327:9: '-' INT
                    {
                    match(input,98,FOLLOW_98_in_factor2348); if (state.failed) return ;
                    match(input,INT,FOLLOW_INT_in_factor2350); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:328:9: STRING
                    {
                    match(input,STRING,FOLLOW_STRING_in_factor2360); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:329:9: REGEXP
                    {
                    match(input,REGEXP,FOLLOW_REGEXP_in_factor2370); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:330:9: 'true'
                    {
                    match(input,104,FOLLOW_104_in_factor2380); if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:331:9: 'false'
                    {
                    match(input,105,FOLLOW_105_in_factor2390); if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:332:9: ID '[' expr ']'
                    {
                    match(input,ID,FOLLOW_ID_in_factor2400); if (state.failed) return ;
                    match(input,106,FOLLOW_106_in_factor2402); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_factor2404);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,107,FOLLOW_107_in_factor2406); if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:333:9: persistent_var
                    {
                    pushFollow(FOLLOW_persistent_var_in_factor2416);
                    persistent_var();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 9 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:334:9: trail_exp
                    {
                    pushFollow(FOLLOW_trail_exp_in_factor2426);
                    trail_exp();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 10 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:335:9: function_app
                    {
                    pushFollow(FOLLOW_function_app_in_factor2436);
                    function_app();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 11 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:336:9: '[' expr ',' ']'
                    {
                    match(input,106,FOLLOW_106_in_factor2446); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_factor2448);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,58,FOLLOW_58_in_factor2450); if (state.failed) return ;
                    match(input,107,FOLLOW_107_in_factor2452); if (state.failed) return ;

                    }
                    break;
                case 12 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:337:9: '{' hash_line ',' '}'
                    {
                    match(input,20,FOLLOW_20_in_factor2462); if (state.failed) return ;
                    pushFollow(FOLLOW_hash_line_in_factor2464);
                    hash_line();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,58,FOLLOW_58_in_factor2466); if (state.failed) return ;
                    match(input,21,FOLLOW_21_in_factor2468); if (state.failed) return ;

                    }
                    break;
                case 13 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:338:9: ID
                    {
                    match(input,ID,FOLLOW_ID_in_factor2478); if (state.failed) return ;

                    }
                    break;
                case 14 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:339:9: '(' expr ')'
                    {
                    match(input,57,FOLLOW_57_in_factor2489); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_factor2491);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,59,FOLLOW_59_in_factor2493); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "factor"


    // $ANTLR start "hash_line"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:342:1: hash_line : STRING ':' expr ;
    public final void hash_line() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:343:2: ( STRING ':' expr )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:343:4: STRING ':' expr
            {
            match(input,STRING,FOLLOW_STRING_in_hash_line2506); if (state.failed) return ;
            match(input,38,FOLLOW_38_in_hash_line2508); if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_hash_line2510);
            expr();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "hash_line"


    // $ANTLR start "function_app"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:346:1: function_app : ( namespace ID '(' expr ',' ')' | ID '(' expr ',' ')' );
    public final void function_app() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:347:2: ( namespace ID '(' expr ',' ')' | ID '(' expr ',' ')' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==ID) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==38) ) {
                    alt23=1;
                }
                else if ( (LA23_1==57) ) {
                    alt23=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:347:3: namespace ID '(' expr ',' ')'
                    {
                    pushFollow(FOLLOW_namespace_in_function_app2523);
                    namespace();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,ID,FOLLOW_ID_in_function_app2525); if (state.failed) return ;
                    match(input,57,FOLLOW_57_in_function_app2527); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_function_app2529);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,58,FOLLOW_58_in_function_app2531); if (state.failed) return ;
                    match(input,59,FOLLOW_59_in_function_app2533); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:348:3: ID '(' expr ',' ')'
                    {
                    match(input,ID,FOLLOW_ID_in_function_app2539); if (state.failed) return ;
                    match(input,57,FOLLOW_57_in_function_app2541); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_function_app2543);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,58,FOLLOW_58_in_function_app2545); if (state.failed) return ;
                    match(input,59,FOLLOW_59_in_function_app2547); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "function_app"


    // $ANTLR start "namespace"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:351:1: namespace : ID ':' ;
    public final void namespace() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:352:2: ( ID ':' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:352:4: ID ':'
            {
            match(input,ID,FOLLOW_ID_in_namespace2559); if (state.failed) return ;
            match(input,38,FOLLOW_38_in_namespace2561); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "namespace"


    // $ANTLR start "trail_exp"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:355:1: trail_exp : ( 'current' var_domain ':' ID | 'history' expr var_domain ':' ID );
    public final void trail_exp() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:356:2: ( 'current' var_domain ':' ID | 'history' expr var_domain ':' ID )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==108) ) {
                alt24=1;
            }
            else if ( (LA24_0==109) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:356:3: 'current' var_domain ':' ID
                    {
                    match(input,108,FOLLOW_108_in_trail_exp2573); if (state.failed) return ;
                    pushFollow(FOLLOW_var_domain_in_trail_exp2575);
                    var_domain();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,38,FOLLOW_38_in_trail_exp2577); if (state.failed) return ;
                    match(input,ID,FOLLOW_ID_in_trail_exp2579); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:357:2: 'history' expr var_domain ':' ID
                    {
                    match(input,109,FOLLOW_109_in_trail_exp2584); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_trail_exp2586);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_var_domain_in_trail_exp2588);
                    var_domain();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,38,FOLLOW_38_in_trail_exp2590); if (state.failed) return ;
                    match(input,ID,FOLLOW_ID_in_trail_exp2592); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "trail_exp"


    // $ANTLR start "persistent_var"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:360:1: persistent_var : var_domain ':' ID ;
    public final void persistent_var() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:361:2: ( var_domain ':' ID )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:361:4: var_domain ':' ID
            {
            pushFollow(FOLLOW_var_domain_in_persistent_var2606);
            var_domain();

            state._fsp--;
            if (state.failed) return ;
            match(input,38,FOLLOW_38_in_persistent_var2608); if (state.failed) return ;
            match(input,ID,FOLLOW_ID_in_persistent_var2610); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "persistent_var"


    // $ANTLR start "operator"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:363:1: operator : '.' operator_op '(' expr ',' ')' ;
    public final void operator() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:364:2: ( '.' operator_op '(' expr ',' ')' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:364:4: '.' operator_op '(' expr ',' ')'
            {
            match(input,110,FOLLOW_110_in_operator2622); if (state.failed) return ;
            pushFollow(FOLLOW_operator_op_in_operator2624);
            operator_op();

            state._fsp--;
            if (state.failed) return ;
            match(input,57,FOLLOW_57_in_operator2626); if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_operator2628);
            expr();

            state._fsp--;
            if (state.failed) return ;
            match(input,58,FOLLOW_58_in_operator2630); if (state.failed) return ;
            match(input,59,FOLLOW_59_in_operator2632); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "operator"


    // $ANTLR start "operator_op"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:367:1: operator_op : ( 'pick' | 'match' | 'length' | 'replace' | 'as' | 'head' | 'tail' | 'sort' | 'filter' | 'map' | 'uc' | 'lc' | 'split' | 'join' | 'query' | 'has' | 'union' | 'difference' | 'intersection' | 'unique' | 'once' | 'duplicates' );
    public final void operator_op() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:368:2: ( 'pick' | 'match' | 'length' | 'replace' | 'as' | 'head' | 'tail' | 'sort' | 'filter' | 'map' | 'uc' | 'lc' | 'split' | 'join' | 'query' | 'has' | 'union' | 'difference' | 'intersection' | 'unique' | 'once' | 'duplicates' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:
            {
            if ( (input.LA(1)>=111 && input.LA(1)<=132) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "operator_op"


    // $ANTLR start "timeframe"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:373:1: timeframe : 'within' expr ( periods | period ) ;
    public final void timeframe() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:374:2: ( 'within' expr ( periods | period ) )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:374:5: 'within' expr ( periods | period )
            {
            match(input,133,FOLLOW_133_in_timeframe2742); if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_timeframe2744);
            expr();

            state._fsp--;
            if (state.failed) return ;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:374:19: ( periods | period )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=143 && LA25_0<=149)) ) {
                alt25=1;
            }
            else if ( ((LA25_0>=150 && LA25_0<=156)) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:374:20: periods
                    {
                    pushFollow(FOLLOW_periods_in_timeframe2747);
                    periods();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:374:30: period
                    {
                    pushFollow(FOLLOW_period_in_timeframe2751);
                    period();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "timeframe"


    // $ANTLR start "var_domain"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:377:1: var_domain : ( 'ent' | 'app' );
    public final void var_domain() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:377:11: ( 'ent' | 'app' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:
            {
            if ( (input.LA(1)>=134 && input.LA(1)<=135) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "var_domain"


    // $ANTLR start "emit_block"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:379:1: emit_block : 'emit' ( HTML | STRING | JS ) ;
    public final void emit_block() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:380:2: ( 'emit' ( HTML | STRING | JS ) )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:380:4: 'emit' ( HTML | STRING | JS )
            {
            match(input,136,FOLLOW_136_in_emit_block2778); if (state.failed) return ;
            if ( input.LA(1)==STRING||(input.LA(1)>=HTML && input.LA(1)<=JS) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "emit_block"


    // $ANTLR start "dataset"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:383:1: dataset : 'dataset' ID ( datatype )? '<-' STRING cachable ;
    public final void dataset() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:383:9: ( 'dataset' ID ( datatype )? '<-' STRING cachable )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:383:11: 'dataset' ID ( datatype )? '<-' STRING cachable
            {
            match(input,137,FOLLOW_137_in_dataset2798); if (state.failed) return ;
            match(input,ID,FOLLOW_ID_in_dataset2800); if (state.failed) return ;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:383:24: ( datatype )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==38) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:383:24: datatype
                    {
                    pushFollow(FOLLOW_datatype_in_dataset2802);
                    datatype();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,82,FOLLOW_82_in_dataset2805); if (state.failed) return ;
            match(input,STRING,FOLLOW_STRING_in_dataset2807); if (state.failed) return ;
            pushFollow(FOLLOW_cachable_in_dataset2809);
            cachable();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "dataset"


    // $ANTLR start "datatype"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:386:1: datatype : ':' ( 'JSON' | 'XML' | 'RSS' | 'HTML' ) ;
    public final void datatype() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:386:9: ( ':' ( 'JSON' | 'XML' | 'RSS' | 'HTML' ) )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:386:11: ':' ( 'JSON' | 'XML' | 'RSS' | 'HTML' )
            {
            match(input,38,FOLLOW_38_in_datatype2819); if (state.failed) return ;
            if ( (input.LA(1)>=138 && input.LA(1)<=141) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "datatype"


    // $ANTLR start "cachable"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:389:1: cachable : 'cachable' cachetime ;
    public final void cachable() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:389:9: ( 'cachable' cachetime )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:389:11: 'cachable' cachetime
            {
            match(input,142,FOLLOW_142_in_cachable2838); if (state.failed) return ;
            pushFollow(FOLLOW_cachetime_in_cachable2840);
            cachetime();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "cachable"


    // $ANTLR start "cachetime"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:392:1: cachetime : 'for' INT ( periods | period ) ;
    public final void cachetime() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:392:10: ( 'for' INT ( periods | period ) )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:392:12: 'for' INT ( periods | period )
            {
            match(input,52,FOLLOW_52_in_cachetime2851); if (state.failed) return ;
            match(input,INT,FOLLOW_INT_in_cachetime2853); if (state.failed) return ;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:392:22: ( periods | period )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=143 && LA27_0<=149)) ) {
                alt27=1;
            }
            else if ( ((LA27_0>=150 && LA27_0<=156)) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:392:23: periods
                    {
                    pushFollow(FOLLOW_periods_in_cachetime2856);
                    periods();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:392:31: period
                    {
                    pushFollow(FOLLOW_period_in_cachetime2858);
                    period();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "cachetime"


    // $ANTLR start "periods"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:395:1: periods : ( 'years' | 'months' | 'weeks' | 'days' | 'hours' | 'minutes' | 'seconds' );
    public final void periods() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:395:9: ( 'years' | 'months' | 'weeks' | 'days' | 'hours' | 'minutes' | 'seconds' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:
            {
            if ( (input.LA(1)>=143 && input.LA(1)<=149) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "periods"


    // $ANTLR start "period"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:404:1: period : ( 'year' | 'month' | 'week' | 'day' | 'hour' | 'minute' | 'second' );
    public final void period() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:404:9: ( 'year' | 'month' | 'week' | 'day' | 'hour' | 'minute' | 'second' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:
            {
            if ( (input.LA(1)>=150 && input.LA(1)<=156) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "period"


    // $ANTLR start "dispatch_block"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:416:1: dispatch_block : 'dispatch' '{' ( dispatch )* '}' ;
    public final void dispatch_block() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:417:2: ( 'dispatch' '{' ( dispatch )* '}' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:417:4: 'dispatch' '{' ( dispatch )* '}'
            {
            match(input,157,FOLLOW_157_in_dispatch_block2993); if (state.failed) return ;
            match(input,20,FOLLOW_20_in_dispatch_block2995); if (state.failed) return ;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:417:19: ( dispatch )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==158) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:417:19: dispatch
            	    {
            	    pushFollow(FOLLOW_dispatch_in_dispatch_block2997);
            	    dispatch();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            match(input,21,FOLLOW_21_in_dispatch_block3000); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "dispatch_block"


    // $ANTLR start "dispatch"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:420:1: dispatch : 'domain' STRING dispatch_target ;
    public final void dispatch() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:420:9: ( 'domain' STRING dispatch_target )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:420:11: 'domain' STRING dispatch_target
            {
            match(input,158,FOLLOW_158_in_dispatch3009); if (state.failed) return ;
            match(input,STRING,FOLLOW_STRING_in_dispatch3011); if (state.failed) return ;
            pushFollow(FOLLOW_dispatch_target_in_dispatch3013);
            dispatch_target();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "dispatch"


    // $ANTLR start "dispatch_target"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:422:1: dispatch_target : '->' STRING ;
    public final void dispatch_target() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:423:2: ( '->' STRING )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:423:4: '->' STRING
            {
            match(input,159,FOLLOW_159_in_dispatch_target3024); if (state.failed) return ;
            match(input,STRING,FOLLOW_STRING_in_dispatch_target3026); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "dispatch_target"


    // $ANTLR start "meta_block"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:429:1: meta_block : 'meta' '{' ( pragma )* '}' ;
    public final void meta_block() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:430:2: ( 'meta' '{' ( pragma )* '}' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:430:4: 'meta' '{' ( pragma )* '}'
            {
            match(input,160,FOLLOW_160_in_meta_block3049); if (state.failed) return ;
            match(input,20,FOLLOW_20_in_meta_block3051); if (state.failed) return ;
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:430:15: ( pragma )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=161 && LA29_0<=163)||LA29_0==170||LA29_0==174||LA29_0==177||LA29_0==180) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:430:15: pragma
            	    {
            	    pushFollow(FOLLOW_pragma_in_meta_block3053);
            	    pragma();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            match(input,21,FOLLOW_21_in_meta_block3057); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "meta_block"


    // $ANTLR start "pragma"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:435:1: pragma : ( desc_block | 'name' STRING | 'author' STRING | 'key' ( 'errorstack' | 'googleanalytics' | 'twitter' | 'amazon' | 'kpds' | 'google' | ID ) key_value | authz_pragma | logging_pargma | 'use' 'module' ID ( alias )? | 'use' ( 'css' | 'javascript' ) 'resource' location );
    public final void pragma() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:435:9: ( desc_block | 'name' STRING | 'author' STRING | 'key' ( 'errorstack' | 'googleanalytics' | 'twitter' | 'amazon' | 'kpds' | 'google' | ID ) key_value | authz_pragma | logging_pargma | 'use' 'module' ID ( alias )? | 'use' ( 'css' | 'javascript' ) 'resource' location )
            int alt31=8;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:435:11: desc_block
                    {
                    pushFollow(FOLLOW_desc_block_in_pragma3071);
                    desc_block();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:435:24: 'name' STRING
                    {
                    match(input,161,FOLLOW_161_in_pragma3075); if (state.failed) return ;
                    match(input,STRING,FOLLOW_STRING_in_pragma3077); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:435:40: 'author' STRING
                    {
                    match(input,162,FOLLOW_162_in_pragma3081); if (state.failed) return ;
                    match(input,STRING,FOLLOW_STRING_in_pragma3083); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:435:58: 'key' ( 'errorstack' | 'googleanalytics' | 'twitter' | 'amazon' | 'kpds' | 'google' | ID ) key_value
                    {
                    match(input,163,FOLLOW_163_in_pragma3087); if (state.failed) return ;
                    if ( input.LA(1)==ID||(input.LA(1)>=164 && input.LA(1)<=169) ) {
                        input.consume();
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_key_value_in_pragma3107);
                    key_value();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:436:4: authz_pragma
                    {
                    pushFollow(FOLLOW_authz_pragma_in_pragma3113);
                    authz_pragma();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:437:4: logging_pargma
                    {
                    pushFollow(FOLLOW_logging_pargma_in_pragma3118);
                    logging_pargma();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:438:4: 'use' 'module' ID ( alias )?
                    {
                    match(input,170,FOLLOW_170_in_pragma3123); if (state.failed) return ;
                    match(input,171,FOLLOW_171_in_pragma3125); if (state.failed) return ;
                    match(input,ID,FOLLOW_ID_in_pragma3127); if (state.failed) return ;
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:438:22: ( alias )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==179) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:438:22: alias
                            {
                            pushFollow(FOLLOW_alias_in_pragma3129);
                            alias();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 8 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:439:4: 'use' ( 'css' | 'javascript' ) 'resource' location
                    {
                    match(input,170,FOLLOW_170_in_pragma3135); if (state.failed) return ;
                    if ( input.LA(1)==83||input.LA(1)==172 ) {
                        input.consume();
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    match(input,173,FOLLOW_173_in_pragma3145); if (state.failed) return ;
                    pushFollow(FOLLOW_location_in_pragma3147);
                    location();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "pragma"


    // $ANTLR start "authz_pragma"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:442:1: authz_pragma : 'authz' 'require' 'user' ;
    public final void authz_pragma() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:443:2: ( 'authz' 'require' 'user' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:443:4: 'authz' 'require' 'user'
            {
            match(input,174,FOLLOW_174_in_authz_pragma3159); if (state.failed) return ;
            match(input,175,FOLLOW_175_in_authz_pragma3161); if (state.failed) return ;
            match(input,176,FOLLOW_176_in_authz_pragma3163); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "authz_pragma"


    // $ANTLR start "logging_pargma"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:446:1: logging_pargma : 'logging' ( 'on' | 'off' ) ;
    public final void logging_pargma() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:447:2: ( 'logging' ( 'on' | 'off' ) )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:447:4: 'logging' ( 'on' | 'off' )
            {
            match(input,177,FOLLOW_177_in_logging_pargma3175); if (state.failed) return ;
            if ( input.LA(1)==79||input.LA(1)==178 ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "logging_pargma"


    // $ANTLR start "alias"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:450:1: alias : 'alias' ID ;
    public final void alias() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:450:7: ( 'alias' ID )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:450:9: 'alias' ID
            {
            match(input,179,FOLLOW_179_in_alias3192); if (state.failed) return ;
            match(input,ID,FOLLOW_ID_in_alias3194); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "alias"


    // $ANTLR start "location"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:452:1: location : ( STRING | ID );
    public final void location() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:452:9: ( STRING | ID )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:
            {
            if ( input.LA(1)==ID||input.LA(1)==STRING ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "location"


    // $ANTLR start "desc_block"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:454:1: desc_block : 'description' ( HTML | STRING ) ;
    public final void desc_block() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:455:2: ( 'description' ( HTML | STRING ) )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:455:4: 'description' ( HTML | STRING )
            {
            match(input,180,FOLLOW_180_in_desc_block3216); if (state.failed) return ;
            if ( input.LA(1)==STRING||input.LA(1)==HTML ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "desc_block"


    // $ANTLR start "key_value"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:459:1: key_value : ( STRING | ( name_value_pair )+ );
    public final void key_value() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:460:2: ( STRING | ( name_value_pair )+ )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==STRING) ) {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==38) ) {
                    alt33=2;
                }
                else if ( (LA33_1==21||(LA33_1>=161 && LA33_1<=163)||LA33_1==170||LA33_1==174||LA33_1==177||LA33_1==180) ) {
                    alt33=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:460:4: STRING
                    {
                    match(input,STRING,FOLLOW_STRING_in_key_value3236); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:460:13: ( name_value_pair )+
                    {
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:460:13: ( name_value_pair )+
                    int cnt32=0;
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==STRING) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:460:13: name_value_pair
                    	    {
                    	    pushFollow(FOLLOW_name_value_pair_in_key_value3240);
                    	    name_value_pair();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt32 >= 1 ) break loop32;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(32, input);
                                throw eee;
                        }
                        cnt32++;
                    } while (true);


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "key_value"


    // $ANTLR start "name_value_pair"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:463:1: name_value_pair : STRING ':' ( INT | STRING ) ;
    public final void name_value_pair() throws RecognitionException {
        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:464:2: ( STRING ':' ( INT | STRING ) )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:464:4: STRING ':' ( INT | STRING )
            {
            match(input,STRING,FOLLOW_STRING_in_name_value_pair3256); if (state.failed) return ;
            match(input,38,FOLLOW_38_in_name_value_pair3258); if (state.failed) return ;
            if ( input.LA(1)==INT||input.LA(1)==STRING ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "name_value_pair"

    // $ANTLR start synpred1_ruleset
    public final void synpred1_ruleset_fragment() throws RecognitionException {   
        // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:262:2: ( ID '=' HTML )
        // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:262:2: ID '=' HTML
        {
        match(input,ID,FOLLOW_ID_in_synpred1_ruleset1887); if (state.failed) return ;
        match(input,35,FOLLOW_35_in_synpred1_ruleset1889); if (state.failed) return ;
        match(input,HTML,FOLLOW_HTML_in_synpred1_ruleset1891); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_ruleset

    // $ANTLR start synpred2_ruleset
    public final void synpred2_ruleset_fragment() throws RecognitionException {   
        // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:263:2: ( ID '=' JS )
        // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:263:2: ID '=' JS
        {
        match(input,ID,FOLLOW_ID_in_synpred2_ruleset1896); if (state.failed) return ;
        match(input,35,FOLLOW_35_in_synpred2_ruleset1898); if (state.failed) return ;
        match(input,JS,FOLLOW_JS_in_synpred2_ruleset1900); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_ruleset

    // $ANTLR start synpred3_ruleset
    public final void synpred3_ruleset_fragment() throws RecognitionException {   
        // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:264:2: ( ID '=' expr )
        // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:264:2: ID '=' expr
        {
        match(input,ID,FOLLOW_ID_in_synpred3_ruleset1905); if (state.failed) return ;
        match(input,35,FOLLOW_35_in_synpred3_ruleset1907); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred3_ruleset1909);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_ruleset

    // $ANTLR start synpred5_ruleset
    public final void synpred5_ruleset_fragment() throws RecognitionException {   
        // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:285:4: ( disjunction '=>' expr '|' expr )
        // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:285:4: disjunction '=>' expr '|' expr
        {
        pushFollow(FOLLOW_disjunction_in_synpred5_ruleset2053);
        disjunction();

        state._fsp--;
        if (state.failed) return ;
        match(input,60,FOLLOW_60_in_synpred5_ruleset2055); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred5_ruleset2057);
        expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,85,FOLLOW_85_in_synpred5_ruleset2059); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred5_ruleset2061);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_ruleset

    // $ANTLR start synpred12_ruleset
    public final void synpred12_ruleset_fragment() throws RecognitionException {   
        // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:332:9: ( ID '[' expr ']' )
        // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:332:9: ID '[' expr ']'
        {
        match(input,ID,FOLLOW_ID_in_synpred12_ruleset2400); if (state.failed) return ;
        match(input,106,FOLLOW_106_in_synpred12_ruleset2402); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred12_ruleset2404);
        expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,107,FOLLOW_107_in_synpred12_ruleset2406); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred12_ruleset

    // $ANTLR start synpred15_ruleset
    public final void synpred15_ruleset_fragment() throws RecognitionException {   
        // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:335:9: ( function_app )
        // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:335:9: function_app
        {
        pushFollow(FOLLOW_function_app_in_synpred15_ruleset2436);
        function_app();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_ruleset

    // $ANTLR start synpred18_ruleset
    public final void synpred18_ruleset_fragment() throws RecognitionException {   
        // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:338:9: ( ID )
        // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:338:9: ID
        {
        match(input,ID,FOLLOW_ID_in_synpred18_ruleset2478); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_ruleset

    // Delegated rules

    public final boolean synpred3_ruleset() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_ruleset_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_ruleset() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_ruleset_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_ruleset() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_ruleset_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_ruleset() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_ruleset_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_ruleset() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_ruleset_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_ruleset() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_ruleset_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_ruleset() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_ruleset_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA20 dfa20 = new DFA20(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA31 dfa31 = new DFA31(this);
    static final String DFA20_eotS =
        "\22\uffff";
    static final String DFA20_eofS =
        "\22\uffff";
    static final String DFA20_minS =
        "\1\4\17\0\2\uffff";
    static final String DFA20_maxS =
        "\1\u0087\17\0\2\uffff";
    static final String DFA20_acceptS =
        "\20\uffff\1\1\1\2";
    static final String DFA20_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\2\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\12\1\4\5\uffff\1\6\6\uffff\1\7\1\uffff\1\16\44\uffff\1\17"+
            "\15\uffff\1\1\32\uffff\1\5\3\uffff\1\2\1\uffff\1\10\1\11\1\15"+
            "\1\uffff\1\13\1\14\30\uffff\2\3",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "284:1: conditional_expression options {backtrack=true; } : ( disjunction '=>' expr '|' expr | disjunction );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_1 = input.LA(1);

                         
                        int index20_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_ruleset()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index20_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA20_2 = input.LA(1);

                         
                        int index20_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_ruleset()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index20_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA20_3 = input.LA(1);

                         
                        int index20_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_ruleset()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index20_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA20_4 = input.LA(1);

                         
                        int index20_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_ruleset()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index20_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA20_5 = input.LA(1);

                         
                        int index20_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_ruleset()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index20_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA20_6 = input.LA(1);

                         
                        int index20_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_ruleset()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index20_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA20_7 = input.LA(1);

                         
                        int index20_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_ruleset()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index20_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA20_8 = input.LA(1);

                         
                        int index20_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_ruleset()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index20_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA20_9 = input.LA(1);

                         
                        int index20_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_ruleset()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index20_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA20_10 = input.LA(1);

                         
                        int index20_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_ruleset()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index20_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA20_11 = input.LA(1);

                         
                        int index20_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_ruleset()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index20_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA20_12 = input.LA(1);

                         
                        int index20_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_ruleset()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index20_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA20_13 = input.LA(1);

                         
                        int index20_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_ruleset()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index20_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA20_14 = input.LA(1);

                         
                        int index20_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_ruleset()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index20_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA20_15 = input.LA(1);

                         
                        int index20_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_ruleset()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index20_15);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 20, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA21_eotS =
        "\14\uffff";
    static final String DFA21_eofS =
        "\14\uffff";
    static final String DFA21_minS =
        "\1\4\1\uffff\1\13\1\46\1\uffff\1\51\1\4\2\uffff\1\130\2\uffff";
    static final String DFA21_maxS =
        "\1\u0087\1\uffff\1\13\1\46\1\uffff\1\147\1\4\2\uffff\1\u0085\2\uffff";
    static final String DFA21_acceptS =
        "\1\uffff\1\1\2\uffff\1\6\2\uffff\1\2\1\3\1\uffff\1\4\1\5";
    static final String DFA21_specialS =
        "\14\uffff}>";
    static final String[] DFA21_transitionS = {
            "\2\4\5\uffff\1\4\6\uffff\1\4\1\uffff\1\4\44\uffff\1\4\15\uffff"+
            "\1\1\32\uffff\1\4\3\uffff\1\2\1\uffff\3\4\1\uffff\2\4\30\uffff"+
            "\2\3",
            "",
            "\1\5",
            "\1\6",
            "",
            "\1\7\33\uffff\1\10\41\uffff\1\10",
            "\1\11",
            "",
            "",
            "\11\12\15\uffff\1\4\26\uffff\1\13",
            "",
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "312:1: unary_expr : ( 'not' unary_expr | 'seen' STRING 'in' var_domain ':' ID timeframe | 'seen' STRING ( 'before' | 'after' ) STRING 'in' var_domain ':' ID | var_domain ':' ID predop expr timeframe | var_domain ':' ID timeframe | operator_expr );";
        }
    }
    static final String DFA22_eotS =
        "\21\uffff";
    static final String DFA22_eofS =
        "\21\uffff";
    static final String DFA22_minS =
        "\1\4\6\uffff\1\0\11\uffff";
    static final String DFA22_maxS =
        "\1\u0087\6\uffff\1\0\11\uffff";
    static final String DFA22_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\10\1\11\1\uffff\1\13"+
        "\1\14\1\16\1\7\1\12\1\15";
    static final String DFA22_specialS =
        "\7\uffff\1\0\11\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\7\1\1\5\uffff\1\3\6\uffff\1\4\1\uffff\1\14\44\uffff\1\15"+
            "\50\uffff\1\2\5\uffff\1\5\1\6\1\13\1\uffff\2\11\30\uffff\2\10",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "326:1: factor options {backtrack=true; } : ( INT | '-' INT | STRING | REGEXP | 'true' | 'false' | ID '[' expr ']' | persistent_var | trail_exp | function_app | '[' expr ',' ']' | '{' hash_line ',' '}' | ID | '(' expr ')' );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_7 = input.LA(1);

                         
                        int index22_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_ruleset()) ) {s = 14;}

                        else if ( (synpred15_ruleset()) ) {s = 15;}

                        else if ( (synpred18_ruleset()) ) {s = 16;}

                         
                        input.seek(index22_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA31_eotS =
        "\12\uffff";
    static final String DFA31_eofS =
        "\12\uffff";
    static final String DFA31_minS =
        "\1\u00a1\6\uffff\1\123\2\uffff";
    static final String DFA31_maxS =
        "\1\u00b4\6\uffff\1\u00ac\2\uffff";
    static final String DFA31_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\7\1\10";
    static final String DFA31_specialS =
        "\12\uffff}>";
    static final String[] DFA31_transitionS = {
            "\1\2\1\3\1\4\6\uffff\1\7\3\uffff\1\5\2\uffff\1\6\2\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\11\127\uffff\1\10\1\11",
            "",
            ""
    };

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "435:1: pragma : ( desc_block | 'name' STRING | 'author' STRING | 'key' ( 'errorstack' | 'googleanalytics' | 'twitter' | 'amazon' | 'kpds' | 'google' | ID ) key_value | authz_pragma | logging_pargma | 'use' 'module' ID ( alias )? | 'use' ( 'css' | 'javascript' ) 'resource' location );";
        }
    }
 

    public static final BitSet FOLLOW_19_in_ruleset646 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rulesetname_in_ruleset648 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleset650 = new BitSet(new long[]{0x0000000000200000L,0x0000000000010000L,0x0000000120000000L});
    public static final BitSet FOLLOW_meta_block_in_ruleset658 = new BitSet(new long[]{0x0000000000200000L,0x0000000000010000L,0x0000000120000000L});
    public static final BitSet FOLLOW_dispatch_block_in_ruleset666 = new BitSet(new long[]{0x0000000000200000L,0x0000000000010000L,0x0000000120000000L});
    public static final BitSet FOLLOW_global_decls_in_ruleset673 = new BitSet(new long[]{0x0000000000200000L,0x0000000000010000L,0x0000000120000000L});
    public static final BitSet FOLLOW_21_in_ruleset680 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_ruleset682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_rulesetname0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule729 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_rule731 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rule733 = new BitSet(new long[]{0x00E0000000000000L});
    public static final BitSet FOLLOW_rule_state_in_rule735 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rule737 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_select_in_rule741 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_pre_block_in_rule743 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_emit_block_in_rule745 = new BitSet(new long[]{0xC000000020000010L});
    public static final BitSet FOLLOW_action_in_rule747 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rule749 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_callbacks_in_rule751 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_post_block_in_rule753 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rule756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_post_in_post_block769 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_post_block771 = new BitSet(new long[]{0x000385A000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_post_statement_in_post_block773 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_post_block775 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_post_block777 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_post_block779 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_post_alternate_in_post_block781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_post0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_post_alternate812 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_post_alternate814 = new BitSet(new long[]{0x000385A000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_post_statement_in_post_alternate816 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_post_alternate818 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_post_alternate820 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_post_alternate822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_persistent_expr_in_post_statement829 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_post_statement832 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_post_statement834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_log_statement_in_post_statement841 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_post_statement844 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_post_statement846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_control_statement_in_post_statement853 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_post_statement856 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_post_statement858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_raise_statement_in_post_statement865 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_post_statement868 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_post_statement870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_callbacks882 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_callbacks884 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_success_in_callbacks886 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_failure_in_callbacks888 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_callbacks890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_success897 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_success899 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_click_in_success901 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_success903 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_success906 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_success908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_failure915 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_failure917 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_click_in_failure919 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_failure921 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_failure924 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_failure926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_click933 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_click941 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_click943 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_click945 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_click_link_in_click947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_click_link954 = new BitSet(new long[]{0x000005A000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_persistent_expr_in_click_link956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_persistent_clear_in_persistent_expr964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_persistent_set_in_persistent_expr971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_persistent_iterate_in_persistent_expr978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_trail_forget_in_persistent_expr985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_trail_mark_in_persistent_expr992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_persistent_clear1000 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_var_domain_in_persistent_clear1002 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_persistent_clear1004 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_persistent_clear1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_persistent_set1013 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_var_domain_in_persistent_set1015 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_persistent_set1017 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_persistent_set1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_domain_in_persistent_iterate1026 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_persistent_iterate1028 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_persistent_iterate1030 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_counter_op_in_persistent_iterate1032 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_persistent_iterate1034 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_counter_start_in_persistent_iterate1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_trail_forget1043 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_trail_forget1045 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_trail_forget1047 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_var_domain_in_trail_forget1049 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_trail_forget1051 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_trail_forget1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_trail_mark1060 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_var_domain_in_trail_mark1062 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_trail_mark1064 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_trail_mark1066 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_trail_with_in_trail_mark1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_trail_with1075 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_trail_with1077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_counter_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_counter_start1106 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_counter_start1108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_log_statement1116 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_log_statement1118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_control_statement1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_raise_statement1132 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_raise_statement1134 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_raise_statement1136 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_raise_statement1138 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_for_clause_in_raise_statement1140 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_modifier_clause_in_raise_statement1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_for_clause1149 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_for_clause1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_rule_state0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_action_in_action1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unconditional_action_in_action1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_conditional_action1241 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_conditional_action1243 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_conditional_action1245 = new BitSet(new long[]{0xC000000020000010L});
    public static final BitSet FOLLOW_unconditional_action_in_conditional_action1247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primrule_in_unconditional_action1260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actionblock_in_unconditional_action1264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule_label_in_primrule1277 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_namespace_in_primrule1279 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_primrule1281 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_primrule1283 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_primrule1285 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_primrule1287 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_primrule1289 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_modifier_clause_in_primrule1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule_label_in_primrule1298 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_emit_block_in_primrule1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_rule_label1321 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_rule_label1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_modifier_clause1342 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_modifier_in_modifier_clause1344 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_modifier_clause1346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_modifier1357 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_modifier1359 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_modifier1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_modifier1367 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_modifier1369 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_JS_in_modifier1371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blocktype_in_actionblock1384 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_actionblock1386 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_primrule_in_actionblock1388 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_actionblock1390 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_actionblock1392 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_actionblock1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_blocktype0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_pre_block1436 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_pre_block1438 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_decl_in_pre_block1440 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_pre_block1442 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_pre_block1444 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_pre_block1446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_foreach1466 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_foreach1468 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_setting_in_foreach1470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_select1489 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_using_in_select1492 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_when_in_select1494 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_foreach_in_select1497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_using1510 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_using1512 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_setting_in_using1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_when1521 = new BitSet(new long[]{0x0200000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_event_seq_in_when1523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_event_or_in_event_seq1544 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_set_in_event_seq1546 = new BitSet(new long[]{0x0200000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_event_or_in_event_seq1552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_event_and_in_event_or1563 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_event_or1566 = new BitSet(new long[]{0x0200000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_event_and_in_event_or1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_event_btwn_in_event_and1578 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_event_and1581 = new BitSet(new long[]{0x0200000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_event_btwn_in_event_and1584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_event_prim_in_event_btwn1595 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_event_btwn1598 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_event_btwn1601 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_event_btwn1603 = new BitSet(new long[]{0x0200000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_event_seq_in_event_btwn1605 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_event_btwn1607 = new BitSet(new long[]{0x0200000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_event_seq_in_event_btwn1609 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_event_btwn1611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_event_domain_in_event_prim1626 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_event_prim1628 = new BitSet(new long[]{0x0000000000040800L});
    public static final BitSet FOLLOW_set_in_event_prim1630 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_setting_in_event_prim1636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_event_domain_in_event_prim1641 = new BitSet(new long[]{0x0000000600000000L,0x0000000000001C00L});
    public static final BitSet FOLLOW_set_in_event_prim1643 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_event_prim1655 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_on_expr_in_event_prim1657 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_setting_in_event_prim1660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_event_prim1665 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_event_prim1667 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_event_filter_in_event_prim1669 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_setting_in_event_prim1671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_event_prim1676 = new BitSet(new long[]{0x0200000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_event_seq_in_event_prim1678 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_event_prim1680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_setting1691 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_setting1693 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_setting1695 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_setting1697 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_setting1699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_event_domain1709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_event_filter1723 = new BitSet(new long[]{0x0000000000040800L});
    public static final BitSet FOLLOW_set_in_event_filter1725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_on_expr1743 = new BitSet(new long[]{0x0000000000040800L});
    public static final BitSet FOLLOW_set_in_on_expr1745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_global_decls1769 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_global_decls1771 = new BitSet(new long[]{0x0000000000000010L,0x00000000000A0000L,0x0000000000000300L});
    public static final BitSet FOLLOW_global_in_global_decls1775 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_global_decls1777 = new BitSet(new long[]{0x0000000001200010L,0x00000000000A0000L,0x0000000000000300L});
    public static final BitSet FOLLOW_24_in_global_decls1781 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_global_decls1784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emit_block_in_global1800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dataset_in_global1804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_datasource_in_global1808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_css_emit_in_global1812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decl_in_global1816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_datasource1828 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_datasource1830 = new BitSet(new long[]{0x0000004000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_datatype_in_datasource1832 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_datasource1835 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_datasource1837 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_cachable_in_datasource1839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_css_emit1851 = new BitSet(new long[]{0x0000000000010800L});
    public static final BitSet FOLLOW_set_in_css_emit1853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_decl1887 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_decl1889 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_HTML_in_decl1891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_decl1896 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_decl1898 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_JS_in_decl1900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_decl1905 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_decl1907 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_decl1909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_decl1915 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_decl1917 = new BitSet(new long[]{0x0200000000140830L,0x0000374400000080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_factor_in_decl1919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_def_in_expr1948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_expression_in_expr1952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_function_def1977 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_function_def1979 = new BitSet(new long[]{0x0800000000000010L});
    public static final BitSet FOLLOW_ID_in_function_def1982 = new BitSet(new long[]{0x0C00000000000010L});
    public static final BitSet FOLLOW_58_in_function_def1984 = new BitSet(new long[]{0x0800000000000010L});
    public static final BitSet FOLLOW_59_in_function_def1989 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_function_def1991 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_fundecls_in_function_def1993 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_function_def1996 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_function_def1998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decl_in_fundecls2023 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_fundecls2025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_disjunction_in_conditional_expression2053 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_conditional_expression2055 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_conditional_expression2057 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_conditional_expression2059 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_conditional_expression2061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_disjunction_in_conditional_expression2065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conjunction_in_disjunction2078 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_disjunction2080 = new BitSet(new long[]{0x0200000000140830L,0x0000374400000080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_conjunction_in_disjunction2082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equality_expr_in_conjunction2097 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_conjunction2099 = new BitSet(new long[]{0x0200000000140830L,0x0000374400000080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_equality_expr_in_conjunction2101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_add_expr_in_equality_expr2116 = new BitSet(new long[]{0x0000000000000000L,0x00000001FF000000L});
    public static final BitSet FOLLOW_predop_in_equality_expr2118 = new BitSet(new long[]{0x0200000000140830L,0x0000374400000080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_add_expr_in_equality_expr2120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_predop0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mult_expr_in_add_expr2173 = new BitSet(new long[]{0x0000000000000000L,0x0000000600000000L});
    public static final BitSet FOLLOW_add_op_in_add_expr2175 = new BitSet(new long[]{0x0200000000140830L,0x0000374400000080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_mult_expr_in_add_expr2177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_add_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_expr_in_mult_expr2197 = new BitSet(new long[]{0x0000000000000000L,0x0000003800000000L});
    public static final BitSet FOLLOW_mult_op_in_mult_expr2199 = new BitSet(new long[]{0x0200000000140830L,0x0000374400000080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_unary_expr_in_mult_expr2201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_mult_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_unary_expr2224 = new BitSet(new long[]{0x0200000000140830L,0x0000374400000080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_unary_expr_in_unary_expr2226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_unary_expr2232 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_unary_expr2234 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_unary_expr2236 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_var_domain_in_unary_expr2238 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_unary_expr2240 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_unary_expr2242 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_timeframe_in_unary_expr2244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_unary_expr2249 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_unary_expr2251 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000020L});
    public static final BitSet FOLLOW_set_in_unary_expr2253 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_unary_expr2261 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_unary_expr2263 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_var_domain_in_unary_expr2265 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_unary_expr2267 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_unary_expr2269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_domain_in_unary_expr2274 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_unary_expr2276 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_unary_expr2278 = new BitSet(new long[]{0x0000000000000000L,0x00000001FF000000L});
    public static final BitSet FOLLOW_predop_in_unary_expr2280 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_unary_expr2282 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_timeframe_in_unary_expr2284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_domain_in_unary_expr2289 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_unary_expr2291 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_unary_expr2293 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_timeframe_in_unary_expr2295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operator_expr_in_unary_expr2300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_operator_expr2314 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_operator_in_operator_expr2316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_factor2338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_factor2348 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_INT_in_factor2350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_factor2360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REGEXP_in_factor2370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_factor2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_factor2390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_factor2400 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_factor2402 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_factor2404 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_factor2406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_persistent_var_in_factor2416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_trail_exp_in_factor2426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_app_in_factor2436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_factor2446 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_factor2448 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_factor2450 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_factor2452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_factor2462 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_hash_line_in_factor2464 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_factor2466 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_factor2468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_factor2478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_factor2489 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_factor2491 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_factor2493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_hash_line2506 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_hash_line2508 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_hash_line2510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namespace_in_function_app2523 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_function_app2525 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_function_app2527 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_function_app2529 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_function_app2531 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_function_app2533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_function_app2539 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_function_app2541 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_function_app2543 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_function_app2545 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_function_app2547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_namespace2559 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_namespace2561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_trail_exp2573 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_var_domain_in_trail_exp2575 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_trail_exp2577 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_trail_exp2579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_trail_exp2584 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_trail_exp2586 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_var_domain_in_trail_exp2588 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_trail_exp2590 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_trail_exp2592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_domain_in_persistent_var2606 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_persistent_var2608 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_persistent_var2610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_operator2622 = new BitSet(new long[]{0x0000000000000000L,0xFFFF800000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_operator_op_in_operator2624 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_operator2626 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_operator2628 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_operator2630 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_operator2632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operator_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_timeframe2742 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_timeframe2744 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000001FFF8000L});
    public static final BitSet FOLLOW_periods_in_timeframe2747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_period_in_timeframe2751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_var_domain0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_emit_block2778 = new BitSet(new long[]{0x0000000000030800L});
    public static final BitSet FOLLOW_set_in_emit_block2780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_dataset2798 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_dataset2800 = new BitSet(new long[]{0x0000004000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_datatype_in_dataset2802 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_dataset2805 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_dataset2807 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_cachable_in_dataset2809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_datatype2819 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000003C00L});
    public static final BitSet FOLLOW_set_in_datatype2821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_142_in_cachable2838 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_cachetime_in_cachable2840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_cachetime2851 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_INT_in_cachetime2853 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000001FFF8000L});
    public static final BitSet FOLLOW_periods_in_cachetime2856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_period_in_cachetime2858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_periods0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_period0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_157_in_dispatch_block2993 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_dispatch_block2995 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_dispatch_in_dispatch_block2997 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_21_in_dispatch_block3000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_158_in_dispatch3009 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_dispatch3011 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_dispatch_target_in_dispatch3013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_159_in_dispatch_target3024 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_dispatch_target3026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_160_in_meta_block3049 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_meta_block3051 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000000L,0x0012440E00000000L});
    public static final BitSet FOLLOW_pragma_in_meta_block3053 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000000L,0x0012440E00000000L});
    public static final BitSet FOLLOW_21_in_meta_block3057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_desc_block_in_pragma3071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_161_in_pragma3075 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_pragma3077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_162_in_pragma3081 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_pragma3083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_163_in_pragma3087 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000000L,0x000003F000000000L});
    public static final BitSet FOLLOW_set_in_pragma3089 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_key_value_in_pragma3107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_authz_pragma_in_pragma3113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logging_pargma_in_pragma3118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_170_in_pragma3123 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_171_in_pragma3125 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_pragma3127 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_alias_in_pragma3129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_170_in_pragma3135 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000100000000000L});
    public static final BitSet FOLLOW_set_in_pragma3137 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_173_in_pragma3145 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_location_in_pragma3147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_174_in_authz_pragma3159 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_175_in_authz_pragma3161 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_176_in_authz_pragma3163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_177_in_logging_pargma3175 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L,0x0004000000000000L});
    public static final BitSet FOLLOW_set_in_logging_pargma3177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_179_in_alias3192 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_alias3194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_location0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_180_in_desc_block3216 = new BitSet(new long[]{0x0000000000010800L});
    public static final BitSet FOLLOW_set_in_desc_block3218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_key_value3236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_value_pair_in_key_value3240 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_STRING_in_name_value_pair3256 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_name_value_pair3258 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_set_in_name_value_pair3260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_synpred1_ruleset1887 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_synpred1_ruleset1889 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_HTML_in_synpred1_ruleset1891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_synpred2_ruleset1896 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_synpred2_ruleset1898 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_JS_in_synpred2_ruleset1900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_synpred3_ruleset1905 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_synpred3_ruleset1907 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_synpred3_ruleset1909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_disjunction_in_synpred5_ruleset2053 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_synpred5_ruleset2055 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_synpred5_ruleset2057 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_synpred5_ruleset2059 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_synpred5_ruleset2061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_synpred12_ruleset2400 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_synpred12_ruleset2402 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_synpred12_ruleset2404 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_synpred12_ruleset2406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_app_in_synpred15_ruleset2436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_synpred18_ruleset2478 = new BitSet(new long[]{0x0000000000000002L});

}