// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g 2010-07-09 08:54:59

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import org.antlr.runtime.debug.*;
import java.io.IOException;
public class rulesetParser extends DebugParser {
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

    public static final String[] ruleNames = new String[] {
        "invalidRule", "synpred7_ruleset", "using", "ruleset", "event_or", 
        "datatype", "synpred9_ruleset", "synpred13_ruleset", "hash_line", 
        "function_def", "unconditional_action", "synpred8_ruleset", "fundecls", 
        "synpred4_ruleset", "actionblock", "unary_expr", "period", "dispatch_block", 
        "counter_op", "persistent_expr", "failure", "add_expr", "synpred1_ruleset", 
        "raise_statement", "persistent_var", "event_and", "desc_block", 
        "counter_start", "setting", "emit_block", "action", "operator_expr", 
        "pragma", "alias", "rule_state", "namespace", "global", "add_op", 
        "predop", "synpred14_ruleset", "trail_forget", "trail_exp", "event_seq", 
        "persistent_set", "authz_pragma", "decl", "dataset", "global_decls", 
        "timeframe", "cachetime", "trail_mark", "dispatch", "pre_block", 
        "event_btwn", "foreach", "for_clause", "callbacks", "function_app", 
        "synpred3_ruleset", "post", "conjunction", "on_expr", "conditional_action", 
        "equality_expr", "datasource", "post_alternate", "var_domain", "synpred5_ruleset", 
        "mult_op", "operator_op", "event_prim", "synpred16_ruleset", "synpred12_ruleset", 
        "logging_pargma", "location", "rulesetname", "primrule", "click_link", 
        "key_value", "click", "event_filter", "expr", "event_domain", "rule_label", 
        "post_statement", "synpred15_ruleset", "dispatch_target", "control_statement", 
        "persistent_iterate", "name_value_pair", "periods", "synpred10_ruleset", 
        "synpred11_ruleset", "success", "cachable", "log_statement", "synpred2_ruleset", 
        "select", "conditional_expression", "trail_with", "factor", "rule", 
        "mult_expr", "operator", "synpred17_ruleset", "synpred6_ruleset", 
        "persistent_clear", "css_emit", "meta_block", "modifier", "when", 
        "blocktype", "modifier_clause", "post_block", "disjunction"
    };
     
        public int ruleLevel = 0;
        public int getRuleLevel() { return ruleLevel; }
        public void incRuleLevel() { ruleLevel++; }
        public void decRuleLevel() { ruleLevel--; }
        public rulesetParser(TokenStream input) {
            this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
        }
        public rulesetParser(TokenStream input, int port, RecognizerSharedState state) {
            super(input, state);
            DebugEventSocketProxy proxy =
                new DebugEventSocketProxy(this, port, null);
            setDebugListener(proxy);
            try {
                proxy.handshake();
            }
            catch (IOException ioe) {
                reportError(ioe);
            }
        }
    public rulesetParser(TokenStream input, DebugEventListener dbg) {
        super(input, dbg, new RecognizerSharedState());

    }
    protected boolean evalPredicate(boolean result, String predicate) {
        dbg.semanticPredicate(result, predicate);
        return result;
    }


    public String[] getTokenNames() { return rulesetParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g"; }



    // $ANTLR start "ruleset"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:67:1: ruleset : 'ruleset' rulesetname '{' ( meta_block | dispatch_block | global_decls )* '}' EOF ;
    public final void ruleset() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "ruleset");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(67, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:68:3: ( 'ruleset' rulesetname '{' ( meta_block | dispatch_block | global_decls )* '}' EOF )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:68:5: 'ruleset' rulesetname '{' ( meta_block | dispatch_block | global_decls )* '}' EOF
            {
            dbg.location(68,5);
            match(input,19,FOLLOW_19_in_ruleset646); if (state.failed) return ;
            dbg.location(68,15);
            pushFollow(FOLLOW_rulesetname_in_ruleset648);
            rulesetname();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(68,27);
            match(input,20,FOLLOW_20_in_ruleset650); if (state.failed) return ;
            dbg.location(69,4);
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:69:4: ( meta_block | dispatch_block | global_decls )*
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=4;
                try { dbg.enterDecision(1);

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

                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:69:6: meta_block
            	    {
            	    dbg.location(69,6);
            	    pushFollow(FOLLOW_meta_block_in_ruleset658);
            	    meta_block();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:70:6: dispatch_block
            	    {
            	    dbg.location(70,6);
            	    pushFollow(FOLLOW_dispatch_block_in_ruleset666);
            	    dispatch_block();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 3 :
            	    dbg.enterAlt(3);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:71:6: global_decls
            	    {
            	    dbg.location(71,6);
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
            } finally {dbg.exitSubRule(1);}

            dbg.location(72,3);
            match(input,21,FOLLOW_21_in_ruleset680); if (state.failed) return ;
            dbg.location(72,7);
            match(input,EOF,FOLLOW_EOF_in_ruleset682); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(73, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "ruleset");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "ruleset"


    // $ANTLR start "rulesetname"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:75:1: rulesetname : ( ID | INT );
    public final void rulesetname() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "rulesetname");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(75, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:76:2: ( ID | INT )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:
            {
            dbg.location(76,2);
            if ( (input.LA(1)>=ID && input.LA(1)<=INT) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
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
        dbg.location(77, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "rulesetname");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "rulesetname"


    // $ANTLR start "rule"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:84:1: rule : 'rule' ID 'is' rule_state '{' select pre_block emit_block action ';' callbacks post_block '}' ;
    public final void rule() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "rule");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(84, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:84:6: ( 'rule' ID 'is' rule_state '{' select pre_block emit_block action ';' callbacks post_block '}' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:84:9: 'rule' ID 'is' rule_state '{' select pre_block emit_block action ';' callbacks post_block '}'
            {
            dbg.location(84,9);
            match(input,22,FOLLOW_22_in_rule729); if (state.failed) return ;
            dbg.location(84,16);
            match(input,ID,FOLLOW_ID_in_rule731); if (state.failed) return ;
            dbg.location(84,19);
            match(input,23,FOLLOW_23_in_rule733); if (state.failed) return ;
            dbg.location(84,24);
            pushFollow(FOLLOW_rule_state_in_rule735);
            rule_state();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(84,35);
            match(input,20,FOLLOW_20_in_rule737); if (state.failed) return ;
            dbg.location(85,3);
            pushFollow(FOLLOW_select_in_rule741);
            select();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(85,10);
            pushFollow(FOLLOW_pre_block_in_rule743);
            pre_block();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(85,20);
            pushFollow(FOLLOW_emit_block_in_rule745);
            emit_block();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(85,31);
            pushFollow(FOLLOW_action_in_rule747);
            action();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(85,38);
            match(input,24,FOLLOW_24_in_rule749); if (state.failed) return ;
            dbg.location(85,42);
            pushFollow(FOLLOW_callbacks_in_rule751);
            callbacks();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(85,52);
            pushFollow(FOLLOW_post_block_in_rule753);
            post_block();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(86,2);
            match(input,21,FOLLOW_21_in_rule756); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(87, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "rule");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "rule"


    // $ANTLR start "post_block"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:91:1: post_block : post '{' post_statement ';' ';' '}' post_alternate ;
    public final void post_block() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "post_block");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(91, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:91:11: ( post '{' post_statement ';' ';' '}' post_alternate )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:91:13: post '{' post_statement ';' ';' '}' post_alternate
            {
            dbg.location(91,13);
            pushFollow(FOLLOW_post_in_post_block769);
            post();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(91,18);
            match(input,20,FOLLOW_20_in_post_block771); if (state.failed) return ;
            dbg.location(91,22);
            pushFollow(FOLLOW_post_statement_in_post_block773);
            post_statement();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(91,37);
            match(input,24,FOLLOW_24_in_post_block775); if (state.failed) return ;
            dbg.location(91,41);
            match(input,24,FOLLOW_24_in_post_block777); if (state.failed) return ;
            dbg.location(91,45);
            match(input,21,FOLLOW_21_in_post_block779); if (state.failed) return ;
            dbg.location(91,49);
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
        dbg.location(91, 63);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "post_block");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "post_block"


    // $ANTLR start "post"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:93:1: post : ( 'fired' | 'always' | 'notfired' );
    public final void post() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "post");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(93, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:93:5: ( 'fired' | 'always' | 'notfired' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:
            {
            dbg.location(93,5);
            if ( (input.LA(1)>=25 && input.LA(1)<=27) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
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
        dbg.location(95, 17);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "post");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "post"


    // $ANTLR start "post_alternate"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:98:1: post_alternate : 'else' '{' post_statement ';' ';' '}' ;
    public final void post_alternate() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "post_alternate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(98, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:98:15: ( 'else' '{' post_statement ';' ';' '}' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:98:17: 'else' '{' post_statement ';' ';' '}'
            {
            dbg.location(98,17);
            match(input,28,FOLLOW_28_in_post_alternate812); if (state.failed) return ;
            dbg.location(98,24);
            match(input,20,FOLLOW_20_in_post_alternate814); if (state.failed) return ;
            dbg.location(98,28);
            pushFollow(FOLLOW_post_statement_in_post_alternate816);
            post_statement();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(98,43);
            match(input,24,FOLLOW_24_in_post_alternate818); if (state.failed) return ;
            dbg.location(98,47);
            match(input,24,FOLLOW_24_in_post_alternate820); if (state.failed) return ;
            dbg.location(98,51);
            match(input,21,FOLLOW_21_in_post_alternate822); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(98, 54);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "post_alternate");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "post_alternate"


    // $ANTLR start "post_statement"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:100:1: post_statement : ( persistent_expr ( 'if' expr ) | log_statement ( 'if' expr ) | control_statement ( 'if' expr ) | raise_statement ( 'if' expr ) );
    public final void post_statement() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "post_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(100, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:100:15: ( persistent_expr ( 'if' expr ) | log_statement ( 'if' expr ) | control_statement ( 'if' expr ) | raise_statement ( 'if' expr ) )
            int alt2=4;
            try { dbg.enterDecision(2);

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

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(2);}

            switch (alt2) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:100:17: persistent_expr ( 'if' expr )
                    {
                    dbg.location(100,17);
                    pushFollow(FOLLOW_persistent_expr_in_post_statement829);
                    persistent_expr();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(100,33);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:100:33: ( 'if' expr )
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:100:34: 'if' expr
                    {
                    dbg.location(100,34);
                    match(input,29,FOLLOW_29_in_post_statement832); if (state.failed) return ;
                    dbg.location(100,39);
                    pushFollow(FOLLOW_expr_in_post_statement834);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    }


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:101:5: log_statement ( 'if' expr )
                    {
                    dbg.location(101,5);
                    pushFollow(FOLLOW_log_statement_in_post_statement841);
                    log_statement();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(101,19);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:101:19: ( 'if' expr )
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:101:20: 'if' expr
                    {
                    dbg.location(101,20);
                    match(input,29,FOLLOW_29_in_post_statement844); if (state.failed) return ;
                    dbg.location(101,25);
                    pushFollow(FOLLOW_expr_in_post_statement846);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    }


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:102:5: control_statement ( 'if' expr )
                    {
                    dbg.location(102,5);
                    pushFollow(FOLLOW_control_statement_in_post_statement853);
                    control_statement();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(102,23);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:102:23: ( 'if' expr )
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:102:24: 'if' expr
                    {
                    dbg.location(102,24);
                    match(input,29,FOLLOW_29_in_post_statement856); if (state.failed) return ;
                    dbg.location(102,29);
                    pushFollow(FOLLOW_expr_in_post_statement858);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    }


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:103:5: raise_statement ( 'if' expr )
                    {
                    dbg.location(103,5);
                    pushFollow(FOLLOW_raise_statement_in_post_statement865);
                    raise_statement();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(103,21);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:103:21: ( 'if' expr )
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:103:22: 'if' expr
                    {
                    dbg.location(103,22);
                    match(input,29,FOLLOW_29_in_post_statement868); if (state.failed) return ;
                    dbg.location(103,27);
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
        dbg.location(104, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "post_statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "post_statement"


    // $ANTLR start "callbacks"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:107:1: callbacks : 'callbacks' '{' success failure '}' ;
    public final void callbacks() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "callbacks");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(107, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:107:10: ( 'callbacks' '{' success failure '}' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:107:12: 'callbacks' '{' success failure '}'
            {
            dbg.location(107,12);
            match(input,30,FOLLOW_30_in_callbacks882); if (state.failed) return ;
            dbg.location(107,24);
            match(input,20,FOLLOW_20_in_callbacks884); if (state.failed) return ;
            dbg.location(107,28);
            pushFollow(FOLLOW_success_in_callbacks886);
            success();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(107,36);
            pushFollow(FOLLOW_failure_in_callbacks888);
            failure();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(107,44);
            match(input,21,FOLLOW_21_in_callbacks890); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(107, 47);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "callbacks");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "callbacks"


    // $ANTLR start "success"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:109:1: success : 'success' '{' click ';' ';' '}' ;
    public final void success() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "success");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(109, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:109:8: ( 'success' '{' click ';' ';' '}' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:109:10: 'success' '{' click ';' ';' '}'
            {
            dbg.location(109,10);
            match(input,31,FOLLOW_31_in_success897); if (state.failed) return ;
            dbg.location(109,20);
            match(input,20,FOLLOW_20_in_success899); if (state.failed) return ;
            dbg.location(109,24);
            pushFollow(FOLLOW_click_in_success901);
            click();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(109,30);
            match(input,24,FOLLOW_24_in_success903); if (state.failed) return ;
            dbg.location(109,35);
            match(input,24,FOLLOW_24_in_success906); if (state.failed) return ;
            dbg.location(109,39);
            match(input,21,FOLLOW_21_in_success908); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(109, 42);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "success");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "success"


    // $ANTLR start "failure"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:111:1: failure : 'failure' '{' click ';' ';' '}' ;
    public final void failure() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "failure");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(111, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:111:8: ( 'failure' '{' click ';' ';' '}' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:111:10: 'failure' '{' click ';' ';' '}'
            {
            dbg.location(111,10);
            match(input,32,FOLLOW_32_in_failure915); if (state.failed) return ;
            dbg.location(111,20);
            match(input,20,FOLLOW_20_in_failure917); if (state.failed) return ;
            dbg.location(111,24);
            pushFollow(FOLLOW_click_in_failure919);
            click();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(111,30);
            match(input,24,FOLLOW_24_in_failure921); if (state.failed) return ;
            dbg.location(111,35);
            match(input,24,FOLLOW_24_in_failure924); if (state.failed) return ;
            dbg.location(111,39);
            match(input,21,FOLLOW_21_in_failure926); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(111, 42);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "failure");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "failure"


    // $ANTLR start "click"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:113:1: click : ( 'click' | 'change' ) ID '=' STRING click_link ;
    public final void click() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "click");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(113, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:113:6: ( ( 'click' | 'change' ) ID '=' STRING click_link )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:113:8: ( 'click' | 'change' ) ID '=' STRING click_link
            {
            dbg.location(113,8);
            if ( (input.LA(1)>=33 && input.LA(1)<=34) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }

            dbg.location(113,29);
            match(input,ID,FOLLOW_ID_in_click941); if (state.failed) return ;
            dbg.location(113,32);
            match(input,35,FOLLOW_35_in_click943); if (state.failed) return ;
            dbg.location(113,36);
            match(input,STRING,FOLLOW_STRING_in_click945); if (state.failed) return ;
            dbg.location(113,43);
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
        dbg.location(113, 53);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "click");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "click"


    // $ANTLR start "click_link"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:115:1: click_link : 'triggers' persistent_expr ;
    public final void click_link() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "click_link");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(115, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:115:11: ( 'triggers' persistent_expr )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:115:13: 'triggers' persistent_expr
            {
            dbg.location(115,13);
            match(input,36,FOLLOW_36_in_click_link954); if (state.failed) return ;
            dbg.location(115,24);
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
        dbg.location(115, 39);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "click_link");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "click_link"


    // $ANTLR start "persistent_expr"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:118:1: persistent_expr : ( persistent_clear | persistent_set | persistent_iterate | trail_forget | trail_mark );
    public final void persistent_expr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "persistent_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(118, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:118:16: ( persistent_clear | persistent_set | persistent_iterate | trail_forget | trail_mark )
            int alt3=5;
            try { dbg.enterDecision(3);

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

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(3);}

            switch (alt3) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:118:18: persistent_clear
                    {
                    dbg.location(118,18);
                    pushFollow(FOLLOW_persistent_clear_in_persistent_expr964);
                    persistent_clear();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:119:6: persistent_set
                    {
                    dbg.location(119,6);
                    pushFollow(FOLLOW_persistent_set_in_persistent_expr971);
                    persistent_set();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:120:6: persistent_iterate
                    {
                    dbg.location(120,6);
                    pushFollow(FOLLOW_persistent_iterate_in_persistent_expr978);
                    persistent_iterate();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:121:6: trail_forget
                    {
                    dbg.location(121,6);
                    pushFollow(FOLLOW_trail_forget_in_persistent_expr985);
                    trail_forget();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:122:6: trail_mark
                    {
                    dbg.location(122,6);
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
        dbg.location(122, 16);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "persistent_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "persistent_expr"


    // $ANTLR start "persistent_clear"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:125:1: persistent_clear : 'clear' var_domain ':' ID ;
    public final void persistent_clear() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "persistent_clear");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(125, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:125:17: ( 'clear' var_domain ':' ID )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:125:19: 'clear' var_domain ':' ID
            {
            dbg.location(125,19);
            match(input,37,FOLLOW_37_in_persistent_clear1000); if (state.failed) return ;
            dbg.location(125,27);
            pushFollow(FOLLOW_var_domain_in_persistent_clear1002);
            var_domain();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(125,38);
            match(input,38,FOLLOW_38_in_persistent_clear1004); if (state.failed) return ;
            dbg.location(125,42);
            match(input,ID,FOLLOW_ID_in_persistent_clear1006); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(125, 44);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "persistent_clear");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "persistent_clear"


    // $ANTLR start "persistent_set"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:127:1: persistent_set : 'set' var_domain ':' ID ;
    public final void persistent_set() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "persistent_set");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(127, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:127:15: ( 'set' var_domain ':' ID )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:127:17: 'set' var_domain ':' ID
            {
            dbg.location(127,17);
            match(input,39,FOLLOW_39_in_persistent_set1013); if (state.failed) return ;
            dbg.location(127,23);
            pushFollow(FOLLOW_var_domain_in_persistent_set1015);
            var_domain();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(127,34);
            match(input,38,FOLLOW_38_in_persistent_set1017); if (state.failed) return ;
            dbg.location(127,38);
            match(input,ID,FOLLOW_ID_in_persistent_set1019); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(127, 40);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "persistent_set");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "persistent_set"


    // $ANTLR start "persistent_iterate"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:129:1: persistent_iterate : var_domain ':' ID counter_op expr counter_start ;
    public final void persistent_iterate() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "persistent_iterate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(129, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:129:19: ( var_domain ':' ID counter_op expr counter_start )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:129:21: var_domain ':' ID counter_op expr counter_start
            {
            dbg.location(129,21);
            pushFollow(FOLLOW_var_domain_in_persistent_iterate1026);
            var_domain();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(129,32);
            match(input,38,FOLLOW_38_in_persistent_iterate1028); if (state.failed) return ;
            dbg.location(129,36);
            match(input,ID,FOLLOW_ID_in_persistent_iterate1030); if (state.failed) return ;
            dbg.location(129,39);
            pushFollow(FOLLOW_counter_op_in_persistent_iterate1032);
            counter_op();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(129,50);
            pushFollow(FOLLOW_expr_in_persistent_iterate1034);
            expr();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(129,55);
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
        dbg.location(129, 68);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "persistent_iterate");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "persistent_iterate"


    // $ANTLR start "trail_forget"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:131:1: trail_forget : 'forget' STRING 'in' var_domain ':' ID ;
    public final void trail_forget() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "trail_forget");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(131, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:131:13: ( 'forget' STRING 'in' var_domain ':' ID )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:131:15: 'forget' STRING 'in' var_domain ':' ID
            {
            dbg.location(131,15);
            match(input,40,FOLLOW_40_in_trail_forget1043); if (state.failed) return ;
            dbg.location(131,24);
            match(input,STRING,FOLLOW_STRING_in_trail_forget1045); if (state.failed) return ;
            dbg.location(131,31);
            match(input,41,FOLLOW_41_in_trail_forget1047); if (state.failed) return ;
            dbg.location(131,36);
            pushFollow(FOLLOW_var_domain_in_trail_forget1049);
            var_domain();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(131,47);
            match(input,38,FOLLOW_38_in_trail_forget1051); if (state.failed) return ;
            dbg.location(131,51);
            match(input,ID,FOLLOW_ID_in_trail_forget1053); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(131, 53);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "trail_forget");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "trail_forget"


    // $ANTLR start "trail_mark"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:133:1: trail_mark : 'mark' var_domain ':' ID trail_with ;
    public final void trail_mark() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "trail_mark");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(133, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:133:11: ( 'mark' var_domain ':' ID trail_with )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:133:13: 'mark' var_domain ':' ID trail_with
            {
            dbg.location(133,13);
            match(input,42,FOLLOW_42_in_trail_mark1060); if (state.failed) return ;
            dbg.location(133,20);
            pushFollow(FOLLOW_var_domain_in_trail_mark1062);
            var_domain();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(133,31);
            match(input,38,FOLLOW_38_in_trail_mark1064); if (state.failed) return ;
            dbg.location(133,35);
            match(input,ID,FOLLOW_ID_in_trail_mark1066); if (state.failed) return ;
            dbg.location(133,38);
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
        dbg.location(133, 48);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "trail_mark");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "trail_mark"


    // $ANTLR start "trail_with"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:135:1: trail_with : 'with' expr ;
    public final void trail_with() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "trail_with");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(135, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:135:11: ( 'with' expr )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:135:13: 'with' expr
            {
            dbg.location(135,13);
            match(input,43,FOLLOW_43_in_trail_with1075); if (state.failed) return ;
            dbg.location(135,20);
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
        dbg.location(135, 24);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "trail_with");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "trail_with"


    // $ANTLR start "counter_op"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:138:1: counter_op : ( '+=' | '-=' );
    public final void counter_op() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "counter_op");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(138, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:138:11: ( '+=' | '-=' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:
            {
            dbg.location(138,11);
            if ( (input.LA(1)>=44 && input.LA(1)<=45) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
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
        dbg.location(139, 17);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "counter_op");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "counter_op"


    // $ANTLR start "counter_start"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:141:1: counter_start : 'from' expr ;
    public final void counter_start() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "counter_start");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(141, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:141:14: ( 'from' expr )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:141:16: 'from' expr
            {
            dbg.location(141,16);
            match(input,46,FOLLOW_46_in_counter_start1106); if (state.failed) return ;
            dbg.location(141,23);
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
        dbg.location(141, 27);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "counter_start");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "counter_start"


    // $ANTLR start "log_statement"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:144:1: log_statement : 'log' expr ;
    public final void log_statement() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "log_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(144, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:144:14: ( 'log' expr )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:144:16: 'log' expr
            {
            dbg.location(144,16);
            match(input,47,FOLLOW_47_in_log_statement1116); if (state.failed) return ;
            dbg.location(144,22);
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
        dbg.location(144, 26);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "log_statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "log_statement"


    // $ANTLR start "control_statement"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:146:1: control_statement : 'last' ;
    public final void control_statement() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "control_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(146, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:146:18: ( 'last' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:146:20: 'last'
            {
            dbg.location(146,20);
            match(input,48,FOLLOW_48_in_control_statement1125); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(146, 26);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "control_statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "control_statement"


    // $ANTLR start "raise_statement"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:148:1: raise_statement : 'raise' 'explicit' 'event' ID for_clause modifier_clause ;
    public final void raise_statement() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "raise_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(148, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:148:16: ( 'raise' 'explicit' 'event' ID for_clause modifier_clause )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:148:18: 'raise' 'explicit' 'event' ID for_clause modifier_clause
            {
            dbg.location(148,18);
            match(input,49,FOLLOW_49_in_raise_statement1132); if (state.failed) return ;
            dbg.location(148,26);
            match(input,50,FOLLOW_50_in_raise_statement1134); if (state.failed) return ;
            dbg.location(148,37);
            match(input,51,FOLLOW_51_in_raise_statement1136); if (state.failed) return ;
            dbg.location(148,45);
            match(input,ID,FOLLOW_ID_in_raise_statement1138); if (state.failed) return ;
            dbg.location(148,48);
            pushFollow(FOLLOW_for_clause_in_raise_statement1140);
            for_clause();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(148,59);
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
        dbg.location(148, 74);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "raise_statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "raise_statement"


    // $ANTLR start "for_clause"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:150:1: for_clause : 'for' ID ;
    public final void for_clause() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "for_clause");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(150, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:150:11: ( 'for' ID )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:150:13: 'for' ID
            {
            dbg.location(150,13);
            match(input,52,FOLLOW_52_in_for_clause1149); if (state.failed) return ;
            dbg.location(150,19);
            match(input,ID,FOLLOW_ID_in_for_clause1151); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(150, 21);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "for_clause");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "for_clause"


    // $ANTLR start "rule_state"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:155:1: rule_state : ( 'active' | 'inactive' | 'test' );
    public final void rule_state() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "rule_state");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(155, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:155:11: ( 'active' | 'inactive' | 'test' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:
            {
            dbg.location(155,11);
            if ( (input.LA(1)>=53 && input.LA(1)<=55) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
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
        dbg.location(158, 11);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "rule_state");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "rule_state"


    // $ANTLR start "action"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:161:1: action : ( conditional_action | unconditional_action );
    public final void action() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "action");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(161, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:161:9: ( conditional_action | unconditional_action )
            int alt4=2;
            try { dbg.enterDecision(4);

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

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:161:11: conditional_action
                    {
                    dbg.location(161,11);
                    pushFollow(FOLLOW_conditional_action_in_action1223);
                    conditional_action();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:161:32: unconditional_action
                    {
                    dbg.location(161,32);
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
        dbg.location(162, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "action");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "action"


    // $ANTLR start "conditional_action"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:165:1: conditional_action : 'if' expr 'then' unconditional_action ;
    public final void conditional_action() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "conditional_action");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(165, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:166:2: ( 'if' expr 'then' unconditional_action )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:166:4: 'if' expr 'then' unconditional_action
            {
            dbg.location(166,4);
            match(input,29,FOLLOW_29_in_conditional_action1241); if (state.failed) return ;
            dbg.location(166,9);
            pushFollow(FOLLOW_expr_in_conditional_action1243);
            expr();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(166,14);
            match(input,56,FOLLOW_56_in_conditional_action1245); if (state.failed) return ;
            dbg.location(166,21);
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
        dbg.location(167, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "conditional_action");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "conditional_action"


    // $ANTLR start "unconditional_action"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:169:1: unconditional_action : ( primrule | actionblock );
    public final void unconditional_action() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "unconditional_action");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(169, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:170:2: ( primrule | actionblock )
            int alt5=2;
            try { dbg.enterDecision(5);

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

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(5);}

            switch (alt5) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:170:4: primrule
                    {
                    dbg.location(170,4);
                    pushFollow(FOLLOW_primrule_in_unconditional_action1260);
                    primrule();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:170:15: actionblock
                    {
                    dbg.location(170,15);
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
        dbg.location(171, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "unconditional_action");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "unconditional_action"


    // $ANTLR start "primrule"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:173:1: primrule : ( rule_label namespace ID '(' expr ',' ')' modifier_clause | rule_label emit_block );
    public final void primrule() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "primrule");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(173, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:174:2: ( rule_label namespace ID '(' expr ',' ')' modifier_clause | rule_label emit_block )
            int alt6=2;
            try { dbg.enterDecision(6);

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

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(6);}

            switch (alt6) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:174:4: rule_label namespace ID '(' expr ',' ')' modifier_clause
                    {
                    dbg.location(174,4);
                    pushFollow(FOLLOW_rule_label_in_primrule1277);
                    rule_label();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(174,15);
                    pushFollow(FOLLOW_namespace_in_primrule1279);
                    namespace();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(174,25);
                    match(input,ID,FOLLOW_ID_in_primrule1281); if (state.failed) return ;
                    dbg.location(174,28);
                    match(input,57,FOLLOW_57_in_primrule1283); if (state.failed) return ;
                    dbg.location(174,32);
                    pushFollow(FOLLOW_expr_in_primrule1285);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(174,37);
                    match(input,58,FOLLOW_58_in_primrule1287); if (state.failed) return ;
                    dbg.location(174,41);
                    match(input,59,FOLLOW_59_in_primrule1289); if (state.failed) return ;
                    dbg.location(174,45);
                    pushFollow(FOLLOW_modifier_clause_in_primrule1291);
                    modifier_clause();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:175:4: rule_label emit_block
                    {
                    dbg.location(175,4);
                    pushFollow(FOLLOW_rule_label_in_primrule1298);
                    rule_label();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(175,15);
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
        dbg.location(176, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "primrule");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "primrule"


    // $ANTLR start "rule_label"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:178:1: rule_label : ID '=>' ;
    public final void rule_label() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "rule_label");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(178, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:178:12: ( ID '=>' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:178:14: ID '=>'
            {
            dbg.location(178,14);
            match(input,ID,FOLLOW_ID_in_rule_label1321); if (state.failed) return ;
            dbg.location(178,17);
            match(input,60,FOLLOW_60_in_rule_label1323); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(178, 21);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "rule_label");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "rule_label"


    // $ANTLR start "modifier_clause"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:180:1: modifier_clause : 'with' modifier 'and' ;
    public final void modifier_clause() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "modifier_clause");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(180, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:181:2: ( 'with' modifier 'and' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:181:4: 'with' modifier 'and'
            {
            dbg.location(181,4);
            match(input,43,FOLLOW_43_in_modifier_clause1342); if (state.failed) return ;
            dbg.location(181,11);
            pushFollow(FOLLOW_modifier_in_modifier_clause1344);
            modifier();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(181,20);
            match(input,61,FOLLOW_61_in_modifier_clause1346); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(182, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "modifier_clause");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "modifier_clause"


    // $ANTLR start "modifier"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:185:1: modifier : ( ID '=' expr | ID '=' JS );
    public final void modifier() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "modifier");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(185, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:185:9: ( ID '=' expr | ID '=' JS )
            int alt7=2;
            try { dbg.enterDecision(7);

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

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(7);}

            switch (alt7) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:185:11: ID '=' expr
                    {
                    dbg.location(185,11);
                    match(input,ID,FOLLOW_ID_in_modifier1357); if (state.failed) return ;
                    dbg.location(185,14);
                    match(input,35,FOLLOW_35_in_modifier1359); if (state.failed) return ;
                    dbg.location(185,18);
                    pushFollow(FOLLOW_expr_in_modifier1361);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:186:3: ID '=' JS
                    {
                    dbg.location(186,3);
                    match(input,ID,FOLLOW_ID_in_modifier1367); if (state.failed) return ;
                    dbg.location(186,6);
                    match(input,35,FOLLOW_35_in_modifier1369); if (state.failed) return ;
                    dbg.location(186,10);
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
        dbg.location(187, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "modifier");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "modifier"


    // $ANTLR start "actionblock"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:189:1: actionblock : blocktype '{' primrule ';' ';' '}' ;
    public final void actionblock() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "actionblock");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(189, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:190:2: ( blocktype '{' primrule ';' ';' '}' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:190:4: blocktype '{' primrule ';' ';' '}'
            {
            dbg.location(190,4);
            pushFollow(FOLLOW_blocktype_in_actionblock1384);
            blocktype();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(190,14);
            match(input,20,FOLLOW_20_in_actionblock1386); if (state.failed) return ;
            dbg.location(190,18);
            pushFollow(FOLLOW_primrule_in_actionblock1388);
            primrule();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(190,27);
            match(input,24,FOLLOW_24_in_actionblock1390); if (state.failed) return ;
            dbg.location(190,31);
            match(input,24,FOLLOW_24_in_actionblock1392); if (state.failed) return ;
            dbg.location(190,35);
            match(input,21,FOLLOW_21_in_actionblock1394); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(191, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "actionblock");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "actionblock"


    // $ANTLR start "blocktype"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:193:1: blocktype : ( 'choose' | 'every' );
    public final void blocktype() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "blocktype");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(193, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:193:10: ( 'choose' | 'every' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:
            {
            dbg.location(193,10);
            if ( (input.LA(1)>=62 && input.LA(1)<=63) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
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
        dbg.location(194, 19);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "blocktype");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "blocktype"


    // $ANTLR start "pre_block"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:197:1: pre_block : 'pre' '{' decl ';' ';' '}' ;
    public final void pre_block() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "pre_block");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(197, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:197:10: ( 'pre' '{' decl ';' ';' '}' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:197:12: 'pre' '{' decl ';' ';' '}'
            {
            dbg.location(197,12);
            match(input,64,FOLLOW_64_in_pre_block1436); if (state.failed) return ;
            dbg.location(197,18);
            match(input,20,FOLLOW_20_in_pre_block1438); if (state.failed) return ;
            dbg.location(197,22);
            pushFollow(FOLLOW_decl_in_pre_block1440);
            decl();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(197,27);
            match(input,24,FOLLOW_24_in_pre_block1442); if (state.failed) return ;
            dbg.location(197,31);
            match(input,24,FOLLOW_24_in_pre_block1444); if (state.failed) return ;
            dbg.location(197,35);
            match(input,21,FOLLOW_21_in_pre_block1446); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(197, 38);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "pre_block");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "pre_block"


    // $ANTLR start "foreach"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:200:1: foreach : 'foreach' expr setting ;
    public final void foreach() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "foreach");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(200, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:200:8: ( 'foreach' expr setting )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:201:2: 'foreach' expr setting
            {
            dbg.location(201,2);
            match(input,65,FOLLOW_65_in_foreach1466); if (state.failed) return ;
            dbg.location(201,12);
            pushFollow(FOLLOW_expr_in_foreach1468);
            expr();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(201,17);
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
        dbg.location(202, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "foreach");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "foreach"


    // $ANTLR start "select"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:204:1: select : 'select' ( using | when ) foreach ;
    public final void select() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "select");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(204, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:204:8: ( 'select' ( using | when ) foreach )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:204:10: 'select' ( using | when ) foreach
            {
            dbg.location(204,10);
            match(input,66,FOLLOW_66_in_select1489); if (state.failed) return ;
            dbg.location(204,19);
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:204:19: ( using | when )
            int alt8=2;
            try { dbg.enterSubRule(8);
            try { dbg.enterDecision(8);

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

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(8);}

            switch (alt8) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:204:20: using
                    {
                    dbg.location(204,20);
                    pushFollow(FOLLOW_using_in_select1492);
                    using();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:204:26: when
                    {
                    dbg.location(204,26);
                    pushFollow(FOLLOW_when_in_select1494);
                    when();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(8);}

            dbg.location(204,32);
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
        dbg.location(205, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "select");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "select"


    // $ANTLR start "using"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:207:1: using : 'using' STRING setting ;
    public final void using() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "using");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(207, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:207:7: ( 'using' STRING setting )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:207:9: 'using' STRING setting
            {
            dbg.location(207,9);
            match(input,67,FOLLOW_67_in_using1510); if (state.failed) return ;
            dbg.location(207,17);
            match(input,STRING,FOLLOW_STRING_in_using1512); if (state.failed) return ;
            dbg.location(207,24);
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
        dbg.location(207, 31);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "using");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "using"


    // $ANTLR start "when"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:209:1: when : 'when' event_seq ;
    public final void when() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "when");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(209, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:209:6: ( 'when' event_seq )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:209:7: 'when' event_seq
            {
            dbg.location(209,7);
            match(input,68,FOLLOW_68_in_when1521); if (state.failed) return ;
            dbg.location(209,14);
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
        dbg.location(209, 23);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "when");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "when"


    // $ANTLR start "event_seq"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:211:1: event_seq options {backtrack=true; } : event_or ( 'then' | 'before' ) event_or ;
    public final void event_seq() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "event_seq");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(211, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:212:2: ( event_or ( 'then' | 'before' ) event_or )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:212:4: event_or ( 'then' | 'before' ) event_or
            {
            dbg.location(212,4);
            pushFollow(FOLLOW_event_or_in_event_seq1544);
            event_or();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(212,13);
            if ( input.LA(1)==56||input.LA(1)==69 ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }

            dbg.location(212,31);
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
        dbg.location(213, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "event_seq");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "event_seq"


    // $ANTLR start "event_or"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:215:1: event_or : event_and ( 'or' ) event_and ;
    public final void event_or() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "event_or");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(215, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:215:9: ( event_and ( 'or' ) event_and )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:215:11: event_and ( 'or' ) event_and
            {
            dbg.location(215,11);
            pushFollow(FOLLOW_event_and_in_event_or1563);
            event_and();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(215,21);
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:215:21: ( 'or' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:215:22: 'or'
            {
            dbg.location(215,22);
            match(input,70,FOLLOW_70_in_event_or1566); if (state.failed) return ;

            }

            dbg.location(215,28);
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
        dbg.location(215, 37);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "event_or");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "event_or"


    // $ANTLR start "event_and"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:217:1: event_and : event_btwn ( 'and' ) event_btwn ;
    public final void event_and() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "event_and");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(217, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:218:2: ( event_btwn ( 'and' ) event_btwn )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:218:4: event_btwn ( 'and' ) event_btwn
            {
            dbg.location(218,4);
            pushFollow(FOLLOW_event_btwn_in_event_and1578);
            event_btwn();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(218,15);
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:218:15: ( 'and' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:218:16: 'and'
            {
            dbg.location(218,16);
            match(input,61,FOLLOW_61_in_event_and1581); if (state.failed) return ;

            }

            dbg.location(218,23);
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
        dbg.location(219, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "event_and");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "event_and"


    // $ANTLR start "event_btwn"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:221:1: event_btwn : event_prim ( 'not' ) 'between' '(' event_seq ',' event_seq ')' ;
    public final void event_btwn() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "event_btwn");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(221, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:222:2: ( event_prim ( 'not' ) 'between' '(' event_seq ',' event_seq ')' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:222:4: event_prim ( 'not' ) 'between' '(' event_seq ',' event_seq ')'
            {
            dbg.location(222,4);
            pushFollow(FOLLOW_event_prim_in_event_btwn1595);
            event_prim();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(222,15);
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:222:15: ( 'not' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:222:16: 'not'
            {
            dbg.location(222,16);
            match(input,71,FOLLOW_71_in_event_btwn1598); if (state.failed) return ;

            }

            dbg.location(222,23);
            match(input,72,FOLLOW_72_in_event_btwn1601); if (state.failed) return ;
            dbg.location(222,33);
            match(input,57,FOLLOW_57_in_event_btwn1603); if (state.failed) return ;
            dbg.location(222,37);
            pushFollow(FOLLOW_event_seq_in_event_btwn1605);
            event_seq();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(222,47);
            match(input,58,FOLLOW_58_in_event_btwn1607); if (state.failed) return ;
            dbg.location(222,51);
            pushFollow(FOLLOW_event_seq_in_event_btwn1609);
            event_seq();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(222,61);
            match(input,59,FOLLOW_59_in_event_btwn1611); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(222, 64);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "event_btwn");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "event_btwn"


    // $ANTLR start "event_prim"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:225:1: event_prim : ( event_domain 'pageview' ( STRING | REGEXP ) setting | event_domain ( 'submit' | 'click' | 'dblclick' | 'change' | 'update' ) STRING on_expr setting | ID ID event_filter setting | '(' event_seq ')' );
    public final void event_prim() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "event_prim");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(225, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:226:2: ( event_domain 'pageview' ( STRING | REGEXP ) setting | event_domain ( 'submit' | 'click' | 'dblclick' | 'change' | 'update' ) STRING on_expr setting | ID ID event_filter setting | '(' event_seq ')' )
            int alt9=4;
            try { dbg.enterDecision(9);

            switch ( input.LA(1) ) {
            case 78:
                {
                int LA9_1 = input.LA(2);

                if ( ((LA9_1>=33 && LA9_1<=34)||(LA9_1>=74 && LA9_1<=76)) ) {
                    alt9=2;
                }
                else if ( (LA9_1==73) ) {
                    alt9=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    dbg.recognitionException(nvae);
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

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(9);}

            switch (alt9) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:226:4: event_domain 'pageview' ( STRING | REGEXP ) setting
                    {
                    dbg.location(226,4);
                    pushFollow(FOLLOW_event_domain_in_event_prim1626);
                    event_domain();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(226,17);
                    match(input,73,FOLLOW_73_in_event_prim1628); if (state.failed) return ;
                    dbg.location(226,28);
                    if ( input.LA(1)==STRING||input.LA(1)==REGEXP ) {
                        input.consume();
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(226,44);
                    pushFollow(FOLLOW_setting_in_event_prim1636);
                    setting();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:227:2: event_domain ( 'submit' | 'click' | 'dblclick' | 'change' | 'update' ) STRING on_expr setting
                    {
                    dbg.location(227,2);
                    pushFollow(FOLLOW_event_domain_in_event_prim1641);
                    event_domain();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(227,15);
                    if ( (input.LA(1)>=33 && input.LA(1)<=34)||(input.LA(1)>=74 && input.LA(1)<=76) ) {
                        input.consume();
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(227,63);
                    match(input,STRING,FOLLOW_STRING_in_event_prim1655); if (state.failed) return ;
                    dbg.location(227,70);
                    pushFollow(FOLLOW_on_expr_in_event_prim1657);
                    on_expr();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(227,79);
                    pushFollow(FOLLOW_setting_in_event_prim1660);
                    setting();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:228:2: ID ID event_filter setting
                    {
                    dbg.location(228,2);
                    match(input,ID,FOLLOW_ID_in_event_prim1665); if (state.failed) return ;
                    dbg.location(228,5);
                    match(input,ID,FOLLOW_ID_in_event_prim1667); if (state.failed) return ;
                    dbg.location(228,8);
                    pushFollow(FOLLOW_event_filter_in_event_prim1669);
                    event_filter();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(228,21);
                    pushFollow(FOLLOW_setting_in_event_prim1671);
                    setting();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:229:2: '(' event_seq ')'
                    {
                    dbg.location(229,2);
                    match(input,57,FOLLOW_57_in_event_prim1676); if (state.failed) return ;
                    dbg.location(229,6);
                    pushFollow(FOLLOW_event_seq_in_event_prim1678);
                    event_seq();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(229,16);
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
        dbg.location(230, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "event_prim");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "event_prim"


    // $ANTLR start "setting"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:232:1: setting : 'setting' '(' ID ',' ')' ;
    public final void setting() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "setting");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(232, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:232:9: ( 'setting' '(' ID ',' ')' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:232:11: 'setting' '(' ID ',' ')'
            {
            dbg.location(232,11);
            match(input,77,FOLLOW_77_in_setting1691); if (state.failed) return ;
            dbg.location(232,21);
            match(input,57,FOLLOW_57_in_setting1693); if (state.failed) return ;
            dbg.location(232,25);
            match(input,ID,FOLLOW_ID_in_setting1695); if (state.failed) return ;
            dbg.location(232,28);
            match(input,58,FOLLOW_58_in_setting1697); if (state.failed) return ;
            dbg.location(232,32);
            match(input,59,FOLLOW_59_in_setting1699); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(232, 35);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "setting");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "setting"


    // $ANTLR start "event_domain"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:234:1: event_domain : 'web' ;
    public final void event_domain() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "event_domain");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(234, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:235:2: ( 'web' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:235:4: 'web'
            {
            dbg.location(235,4);
            match(input,78,FOLLOW_78_in_event_domain1709); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(236, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "event_domain");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "event_domain"


    // $ANTLR start "event_filter"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:238:1: event_filter : ID ( STRING | REGEXP ) ;
    public final void event_filter() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "event_filter");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(238, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:239:2: ( ID ( STRING | REGEXP ) )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:239:4: ID ( STRING | REGEXP )
            {
            dbg.location(239,4);
            match(input,ID,FOLLOW_ID_in_event_filter1723); if (state.failed) return ;
            dbg.location(239,7);
            if ( input.LA(1)==STRING||input.LA(1)==REGEXP ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
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
        dbg.location(240, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "event_filter");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "event_filter"


    // $ANTLR start "on_expr"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:242:1: on_expr : 'on' ( STRING | REGEXP ) ;
    public final void on_expr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "on_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(242, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:242:9: ( 'on' ( STRING | REGEXP ) )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:242:11: 'on' ( STRING | REGEXP )
            {
            dbg.location(242,11);
            match(input,79,FOLLOW_79_in_on_expr1743); if (state.failed) return ;
            dbg.location(242,16);
            if ( input.LA(1)==STRING||input.LA(1)==REGEXP ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
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
        dbg.location(243, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "on_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "on_expr"


    // $ANTLR start "global_decls"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:246:1: global_decls : 'global' '{' ( global ';' )+ '}' ;
    public final void global_decls() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "global_decls");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(246, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:247:2: ( 'global' '{' ( global ';' )+ '}' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:247:4: 'global' '{' ( global ';' )+ '}'
            {
            dbg.location(247,4);
            match(input,80,FOLLOW_80_in_global_decls1769); if (state.failed) return ;
            dbg.location(247,13);
            match(input,20,FOLLOW_20_in_global_decls1771); if (state.failed) return ;
            dbg.location(247,17);
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:247:17: ( global ';' )+
            int cnt10=0;
            try { dbg.enterSubRule(10);

            loop10:
            do {
                int alt10=2;
                try { dbg.enterDecision(10);

                int LA10_0 = input.LA(1);

                if ( (LA10_0==ID||LA10_0==81||LA10_0==83||(LA10_0>=136 && LA10_0<=137)) ) {
                    alt10=1;
                }


                } finally {dbg.exitDecision(10);}

                switch (alt10) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:247:19: global ';'
            	    {
            	    dbg.location(247,19);
            	    pushFollow(FOLLOW_global_in_global_decls1775);
            	    global();

            	    state._fsp--;
            	    if (state.failed) return ;
            	    dbg.location(247,26);
            	    match(input,24,FOLLOW_24_in_global_decls1777); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt10++;
            } while (true);
            } finally {dbg.exitSubRule(10);}

            dbg.location(247,33);
            match(input,21,FOLLOW_21_in_global_decls1782); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(248, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "global_decls");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "global_decls"


    // $ANTLR start "global"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:250:1: global : ( emit_block | dataset | datasource | css_emit | decl );
    public final void global() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "global");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(250, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:250:9: ( emit_block | dataset | datasource | css_emit | decl )
            int alt11=5;
            try { dbg.enterDecision(11);

            switch ( input.LA(1) ) {
            case 136:
                {
                alt11=1;
                }
                break;
            case 137:
                {
                alt11=2;
                }
                break;
            case 81:
                {
                alt11=3;
                }
                break;
            case 83:
                {
                alt11=4;
                }
                break;
            case ID:
                {
                alt11=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(11);}

            switch (alt11) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:250:11: emit_block
                    {
                    dbg.location(250,11);
                    pushFollow(FOLLOW_emit_block_in_global1798);
                    emit_block();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:250:24: dataset
                    {
                    dbg.location(250,24);
                    pushFollow(FOLLOW_dataset_in_global1802);
                    dataset();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:250:34: datasource
                    {
                    dbg.location(250,34);
                    pushFollow(FOLLOW_datasource_in_global1806);
                    datasource();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:250:47: css_emit
                    {
                    dbg.location(250,47);
                    pushFollow(FOLLOW_css_emit_in_global1810);
                    css_emit();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:250:58: decl
                    {
                    dbg.location(250,58);
                    pushFollow(FOLLOW_decl_in_global1814);
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
        dbg.location(251, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "global");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "global"


    // $ANTLR start "datasource"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:253:1: datasource : 'datasource' ID ( datatype )? '<-' STRING cachable ;
    public final void datasource() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "datasource");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(253, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:254:2: ( 'datasource' ID ( datatype )? '<-' STRING cachable )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:254:5: 'datasource' ID ( datatype )? '<-' STRING cachable
            {
            dbg.location(254,5);
            match(input,81,FOLLOW_81_in_datasource1826); if (state.failed) return ;
            dbg.location(254,18);
            match(input,ID,FOLLOW_ID_in_datasource1828); if (state.failed) return ;
            dbg.location(254,21);
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:254:21: ( datatype )?
            int alt12=2;
            try { dbg.enterSubRule(12);
            try { dbg.enterDecision(12);

            int LA12_0 = input.LA(1);

            if ( (LA12_0==38) ) {
                alt12=1;
            }
            } finally {dbg.exitDecision(12);}

            switch (alt12) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:254:21: datatype
                    {
                    dbg.location(254,21);
                    pushFollow(FOLLOW_datatype_in_datasource1830);
                    datatype();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(12);}

            dbg.location(254,31);
            match(input,82,FOLLOW_82_in_datasource1833); if (state.failed) return ;
            dbg.location(254,36);
            match(input,STRING,FOLLOW_STRING_in_datasource1835); if (state.failed) return ;
            dbg.location(254,43);
            pushFollow(FOLLOW_cachable_in_datasource1837);
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
        dbg.location(255, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "datasource");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "datasource"


    // $ANTLR start "css_emit"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:257:1: css_emit : 'css' ( HTML | STRING ) ;
    public final void css_emit() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "css_emit");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(257, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:258:2: ( 'css' ( HTML | STRING ) )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:258:4: 'css' ( HTML | STRING )
            {
            dbg.location(258,4);
            match(input,83,FOLLOW_83_in_css_emit1849); if (state.failed) return ;
            dbg.location(258,10);
            if ( input.LA(1)==STRING||input.LA(1)==HTML ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
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
        dbg.location(259, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "css_emit");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "css_emit"


    // $ANTLR start "decl"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:261:1: decl options {backtrack=true; } : ( ID '=' HTML | ID '=' JS | ID '=' expr );
    public final void decl() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "decl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(261, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:261:39: ( ID '=' HTML | ID '=' JS | ID '=' expr )
            int alt13=3;
            try { dbg.enterDecision(13);

            int LA13_0 = input.LA(1);

            if ( (LA13_0==ID) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==35) ) {
                    switch ( input.LA(3) ) {
                    case HTML:
                        {
                        alt13=1;
                        }
                        break;
                    case JS:
                        {
                        alt13=2;
                        }
                        break;
                    case ID:
                    case INT:
                    case STRING:
                    case REGEXP:
                    case 20:
                    case 57:
                    case 71:
                    case 84:
                    case 98:
                    case 102:
                    case 104:
                    case 105:
                    case 106:
                    case 108:
                    case 109:
                    case 134:
                    case 135:
                        {
                        alt13=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 2, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(13);}

            switch (alt13) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:262:2: ID '=' HTML
                    {
                    dbg.location(262,2);
                    match(input,ID,FOLLOW_ID_in_decl1885); if (state.failed) return ;
                    dbg.location(262,5);
                    match(input,35,FOLLOW_35_in_decl1887); if (state.failed) return ;
                    dbg.location(262,9);
                    match(input,HTML,FOLLOW_HTML_in_decl1889); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:263:2: ID '=' JS
                    {
                    dbg.location(263,2);
                    match(input,ID,FOLLOW_ID_in_decl1894); if (state.failed) return ;
                    dbg.location(263,5);
                    match(input,35,FOLLOW_35_in_decl1896); if (state.failed) return ;
                    dbg.location(263,9);
                    match(input,JS,FOLLOW_JS_in_decl1898); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:264:2: ID '=' expr
                    {
                    dbg.location(264,2);
                    match(input,ID,FOLLOW_ID_in_decl1903); if (state.failed) return ;
                    dbg.location(264,5);
                    match(input,35,FOLLOW_35_in_decl1905); if (state.failed) return ;
                    dbg.location(264,9);
                    pushFollow(FOLLOW_expr_in_decl1907);
                    expr();

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
        dbg.location(265, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "decl");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "decl"


    // $ANTLR start "expr"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:269:1: expr options {backtrack=true; } : ( function_def | conditional_expression );
    public final void expr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(269, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:269:36: ( function_def | conditional_expression )
            int alt14=2;
            try { dbg.enterDecision(14);

            int LA14_0 = input.LA(1);

            if ( (LA14_0==84) ) {
                alt14=1;
            }
            else if ( ((LA14_0>=ID && LA14_0<=INT)||LA14_0==STRING||LA14_0==REGEXP||LA14_0==20||LA14_0==57||LA14_0==71||LA14_0==98||LA14_0==102||(LA14_0>=104 && LA14_0<=106)||(LA14_0>=108 && LA14_0<=109)||(LA14_0>=134 && LA14_0<=135)) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(14);}

            switch (alt14) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:269:38: function_def
                    {
                    dbg.location(269,38);
                    pushFollow(FOLLOW_function_def_in_expr1937);
                    function_def();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:269:53: conditional_expression
                    {
                    dbg.location(269,53);
                    pushFollow(FOLLOW_conditional_expression_in_expr1941);
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
        dbg.location(270, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "expr"


    // $ANTLR start "function_def"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:272:1: function_def options {backtrack=true; } : 'function' '(' ( ID ( ',' )? )* ')' '{' ( fundecls )* expr ';' '}' ;
    public final void function_def() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "function_def");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(272, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:273:2: ( 'function' '(' ( ID ( ',' )? )* ')' '{' ( fundecls )* expr ';' '}' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:273:4: 'function' '(' ( ID ( ',' )? )* ')' '{' ( fundecls )* expr ';' '}'
            {
            dbg.location(273,4);
            match(input,84,FOLLOW_84_in_function_def1966); if (state.failed) return ;
            dbg.location(273,15);
            match(input,57,FOLLOW_57_in_function_def1968); if (state.failed) return ;
            dbg.location(273,19);
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:273:19: ( ID ( ',' )? )*
            try { dbg.enterSubRule(16);

            loop16:
            do {
                int alt16=2;
                try { dbg.enterDecision(16);

                int LA16_0 = input.LA(1);

                if ( (LA16_0==ID) ) {
                    alt16=1;
                }


                } finally {dbg.exitDecision(16);}

                switch (alt16) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:273:20: ID ( ',' )?
            	    {
            	    dbg.location(273,20);
            	    match(input,ID,FOLLOW_ID_in_function_def1971); if (state.failed) return ;
            	    dbg.location(273,23);
            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:273:23: ( ',' )?
            	    int alt15=2;
            	    try { dbg.enterSubRule(15);
            	    try { dbg.enterDecision(15);

            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==58) ) {
            	        alt15=1;
            	    }
            	    } finally {dbg.exitDecision(15);}

            	    switch (alt15) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:273:23: ','
            	            {
            	            dbg.location(273,23);
            	            match(input,58,FOLLOW_58_in_function_def1973); if (state.failed) return ;

            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(15);}


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);
            } finally {dbg.exitSubRule(16);}

            dbg.location(273,30);
            match(input,59,FOLLOW_59_in_function_def1978); if (state.failed) return ;
            dbg.location(273,34);
            match(input,20,FOLLOW_20_in_function_def1980); if (state.failed) return ;
            dbg.location(273,38);
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:273:38: ( fundecls )*
            try { dbg.enterSubRule(17);

            loop17:
            do {
                int alt17=2;
                try { dbg.enterDecision(17);

                int LA17_0 = input.LA(1);

                if ( (LA17_0==ID) ) {
                    int LA17_2 = input.LA(2);

                    if ( (LA17_2==35) ) {
                        alt17=1;
                    }


                }


                } finally {dbg.exitDecision(17);}

                switch (alt17) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:273:38: fundecls
            	    {
            	    dbg.location(273,38);
            	    pushFollow(FOLLOW_fundecls_in_function_def1982);
            	    fundecls();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);
            } finally {dbg.exitSubRule(17);}

            dbg.location(273,48);
            pushFollow(FOLLOW_expr_in_function_def1985);
            expr();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(273,53);
            match(input,24,FOLLOW_24_in_function_def1987); if (state.failed) return ;
            dbg.location(273,57);
            match(input,21,FOLLOW_21_in_function_def1989); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(274, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "function_def");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "function_def"


    // $ANTLR start "fundecls"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:276:1: fundecls options {backtrack=true; } : decl ';' ;
    public final void fundecls() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "fundecls");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(276, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:277:2: ( decl ';' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:277:4: decl ';'
            {
            dbg.location(277,4);
            pushFollow(FOLLOW_decl_in_fundecls2013);
            decl();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(277,9);
            match(input,24,FOLLOW_24_in_fundecls2015); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(278, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "fundecls");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "fundecls"


    // $ANTLR start "conditional_expression"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:282:1: conditional_expression options {backtrack=true; } : ( disjunction '=>' expr '|' expr | disjunction );
    public final void conditional_expression() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "conditional_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(282, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:283:2: ( disjunction '=>' expr '|' expr | disjunction )
            int alt18=2;
            try { dbg.enterDecision(18);

            try {
                isCyclicDecision = true;
                alt18 = dfa18.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(18);}

            switch (alt18) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:283:4: disjunction '=>' expr '|' expr
                    {
                    dbg.location(283,4);
                    pushFollow(FOLLOW_disjunction_in_conditional_expression2041);
                    disjunction();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(283,16);
                    match(input,60,FOLLOW_60_in_conditional_expression2043); if (state.failed) return ;
                    dbg.location(283,21);
                    pushFollow(FOLLOW_expr_in_conditional_expression2045);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(283,26);
                    match(input,85,FOLLOW_85_in_conditional_expression2047); if (state.failed) return ;
                    dbg.location(283,30);
                    pushFollow(FOLLOW_expr_in_conditional_expression2049);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:283:37: disjunction
                    {
                    dbg.location(283,37);
                    pushFollow(FOLLOW_disjunction_in_conditional_expression2053);
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
        dbg.location(284, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "conditional_expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "conditional_expression"


    // $ANTLR start "disjunction"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:286:1: disjunction : conjunction ( '||' conjunction )* ;
    public final void disjunction() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "disjunction");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(286, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:287:2: ( conjunction ( '||' conjunction )* )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:287:4: conjunction ( '||' conjunction )*
            {
            dbg.location(287,4);
            pushFollow(FOLLOW_conjunction_in_disjunction2066);
            conjunction();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(287,16);
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:287:16: ( '||' conjunction )*
            try { dbg.enterSubRule(19);

            loop19:
            do {
                int alt19=2;
                try { dbg.enterDecision(19);

                int LA19_0 = input.LA(1);

                if ( (LA19_0==86) ) {
                    alt19=1;
                }


                } finally {dbg.exitDecision(19);}

                switch (alt19) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:287:17: '||' conjunction
            	    {
            	    dbg.location(287,17);
            	    match(input,86,FOLLOW_86_in_disjunction2069); if (state.failed) return ;
            	    dbg.location(287,22);
            	    pushFollow(FOLLOW_conjunction_in_disjunction2071);
            	    conjunction();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);
            } finally {dbg.exitSubRule(19);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(288, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "disjunction");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "disjunction"


    // $ANTLR start "conjunction"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:290:1: conjunction : equality_expr ( '&&' equality_expr )* ;
    public final void conjunction() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "conjunction");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(290, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:291:2: ( equality_expr ( '&&' equality_expr )* )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:291:4: equality_expr ( '&&' equality_expr )*
            {
            dbg.location(291,4);
            pushFollow(FOLLOW_equality_expr_in_conjunction2087);
            equality_expr();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(291,18);
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:291:18: ( '&&' equality_expr )*
            try { dbg.enterSubRule(20);

            loop20:
            do {
                int alt20=2;
                try { dbg.enterDecision(20);

                int LA20_0 = input.LA(1);

                if ( (LA20_0==87) ) {
                    alt20=1;
                }


                } finally {dbg.exitDecision(20);}

                switch (alt20) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:291:19: '&&' equality_expr
            	    {
            	    dbg.location(291,19);
            	    match(input,87,FOLLOW_87_in_conjunction2090); if (state.failed) return ;
            	    dbg.location(291,24);
            	    pushFollow(FOLLOW_equality_expr_in_conjunction2092);
            	    equality_expr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);
            } finally {dbg.exitSubRule(20);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(292, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "conjunction");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "conjunction"


    // $ANTLR start "equality_expr"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:294:1: equality_expr : add_expr predop add_expr ;
    public final void equality_expr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "equality_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(294, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:295:2: ( add_expr predop add_expr )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:295:4: add_expr predop add_expr
            {
            dbg.location(295,4);
            pushFollow(FOLLOW_add_expr_in_equality_expr2107);
            add_expr();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(295,13);
            pushFollow(FOLLOW_predop_in_equality_expr2109);
            predop();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(295,20);
            pushFollow(FOLLOW_add_expr_in_equality_expr2111);
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
        dbg.location(296, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "equality_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "equality_expr"


    // $ANTLR start "predop"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:298:1: predop : ( '<=' | '>=' | '<' | '>' | '==' | '!=' | 'eq' | 'neq' | 'like' );
    public final void predop() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "predop");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(298, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:298:7: ( '<=' | '>=' | '<' | '>' | '==' | '!=' | 'eq' | 'neq' | 'like' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:
            {
            dbg.location(298,7);
            if ( (input.LA(1)>=88 && input.LA(1)<=96) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
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
        dbg.location(298, 70);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "predop");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "predop"


    // $ANTLR start "add_expr"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:300:1: add_expr : mult_expr add_op mult_expr ;
    public final void add_expr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "add_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(300, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:300:9: ( mult_expr add_op mult_expr )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:300:11: mult_expr add_op mult_expr
            {
            dbg.location(300,11);
            pushFollow(FOLLOW_mult_expr_in_add_expr2164);
            mult_expr();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(300,21);
            pushFollow(FOLLOW_add_op_in_add_expr2166);
            add_op();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(300,28);
            pushFollow(FOLLOW_mult_expr_in_add_expr2168);
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
        dbg.location(300, 37);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "add_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "add_expr"


    // $ANTLR start "add_op"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:302:1: add_op : ( '+' | '-' );
    public final void add_op() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "add_op");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(302, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:302:7: ( '+' | '-' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:
            {
            dbg.location(302,7);
            if ( (input.LA(1)>=97 && input.LA(1)<=98) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
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
        dbg.location(302, 16);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "add_op");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "add_op"


    // $ANTLR start "mult_expr"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:304:1: mult_expr : unary_expr mult_op unary_expr ;
    public final void mult_expr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "mult_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(304, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:305:2: ( unary_expr mult_op unary_expr )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:305:4: unary_expr mult_op unary_expr
            {
            dbg.location(305,4);
            pushFollow(FOLLOW_unary_expr_in_mult_expr2188);
            unary_expr();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(305,15);
            pushFollow(FOLLOW_mult_op_in_mult_expr2190);
            mult_op();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(305,23);
            pushFollow(FOLLOW_unary_expr_in_mult_expr2192);
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
        dbg.location(306, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "mult_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "mult_expr"


    // $ANTLR start "mult_op"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:308:1: mult_op : ( '*' | '/' | '%' );
    public final void mult_op() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "mult_op");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(308, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:308:8: ( '*' | '/' | '%' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:
            {
            dbg.location(308,8);
            if ( (input.LA(1)>=99 && input.LA(1)<=101) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
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
        dbg.location(308, 21);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "mult_op");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "mult_op"


    // $ANTLR start "unary_expr"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:310:1: unary_expr : ( 'not' unary_expr | 'seen' STRING 'in' var_domain ':' ID timeframe | 'seen' STRING ( 'before' | 'after' ) STRING 'in' var_domain ':' ID | var_domain ':' ID predop expr timeframe | var_domain ':' ID timeframe | operator_expr );
    public final void unary_expr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "unary_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(310, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:311:2: ( 'not' unary_expr | 'seen' STRING 'in' var_domain ':' ID timeframe | 'seen' STRING ( 'before' | 'after' ) STRING 'in' var_domain ':' ID | var_domain ':' ID predop expr timeframe | var_domain ':' ID timeframe | operator_expr )
            int alt21=6;
            try { dbg.enterDecision(21);

            try {
                isCyclicDecision = true;
                alt21 = dfa21.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(21);}

            switch (alt21) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:311:4: 'not' unary_expr
                    {
                    dbg.location(311,4);
                    match(input,71,FOLLOW_71_in_unary_expr2215); if (state.failed) return ;
                    dbg.location(311,10);
                    pushFollow(FOLLOW_unary_expr_in_unary_expr2217);
                    unary_expr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:312:2: 'seen' STRING 'in' var_domain ':' ID timeframe
                    {
                    dbg.location(312,2);
                    match(input,102,FOLLOW_102_in_unary_expr2223); if (state.failed) return ;
                    dbg.location(312,9);
                    match(input,STRING,FOLLOW_STRING_in_unary_expr2225); if (state.failed) return ;
                    dbg.location(312,16);
                    match(input,41,FOLLOW_41_in_unary_expr2227); if (state.failed) return ;
                    dbg.location(312,21);
                    pushFollow(FOLLOW_var_domain_in_unary_expr2229);
                    var_domain();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(312,32);
                    match(input,38,FOLLOW_38_in_unary_expr2231); if (state.failed) return ;
                    dbg.location(312,36);
                    match(input,ID,FOLLOW_ID_in_unary_expr2233); if (state.failed) return ;
                    dbg.location(312,39);
                    pushFollow(FOLLOW_timeframe_in_unary_expr2235);
                    timeframe();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:313:2: 'seen' STRING ( 'before' | 'after' ) STRING 'in' var_domain ':' ID
                    {
                    dbg.location(313,2);
                    match(input,102,FOLLOW_102_in_unary_expr2240); if (state.failed) return ;
                    dbg.location(313,9);
                    match(input,STRING,FOLLOW_STRING_in_unary_expr2242); if (state.failed) return ;
                    dbg.location(313,16);
                    if ( input.LA(1)==69||input.LA(1)==103 ) {
                        input.consume();
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(313,37);
                    match(input,STRING,FOLLOW_STRING_in_unary_expr2252); if (state.failed) return ;
                    dbg.location(313,44);
                    match(input,41,FOLLOW_41_in_unary_expr2254); if (state.failed) return ;
                    dbg.location(313,49);
                    pushFollow(FOLLOW_var_domain_in_unary_expr2256);
                    var_domain();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(313,60);
                    match(input,38,FOLLOW_38_in_unary_expr2258); if (state.failed) return ;
                    dbg.location(313,64);
                    match(input,ID,FOLLOW_ID_in_unary_expr2260); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:314:2: var_domain ':' ID predop expr timeframe
                    {
                    dbg.location(314,2);
                    pushFollow(FOLLOW_var_domain_in_unary_expr2265);
                    var_domain();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(314,13);
                    match(input,38,FOLLOW_38_in_unary_expr2267); if (state.failed) return ;
                    dbg.location(314,17);
                    match(input,ID,FOLLOW_ID_in_unary_expr2269); if (state.failed) return ;
                    dbg.location(314,20);
                    pushFollow(FOLLOW_predop_in_unary_expr2271);
                    predop();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(314,27);
                    pushFollow(FOLLOW_expr_in_unary_expr2273);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(314,32);
                    pushFollow(FOLLOW_timeframe_in_unary_expr2275);
                    timeframe();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:315:2: var_domain ':' ID timeframe
                    {
                    dbg.location(315,2);
                    pushFollow(FOLLOW_var_domain_in_unary_expr2280);
                    var_domain();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(315,13);
                    match(input,38,FOLLOW_38_in_unary_expr2282); if (state.failed) return ;
                    dbg.location(315,17);
                    match(input,ID,FOLLOW_ID_in_unary_expr2284); if (state.failed) return ;
                    dbg.location(315,20);
                    pushFollow(FOLLOW_timeframe_in_unary_expr2286);
                    timeframe();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:316:2: operator_expr
                    {
                    dbg.location(316,2);
                    pushFollow(FOLLOW_operator_expr_in_unary_expr2291);
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
        dbg.location(317, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "unary_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "unary_expr"


    // $ANTLR start "operator_expr"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:320:1: operator_expr : factor operator ;
    public final void operator_expr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "operator_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(320, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:321:2: ( factor operator )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:321:4: factor operator
            {
            dbg.location(321,4);
            pushFollow(FOLLOW_factor_in_operator_expr2305);
            factor();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(321,11);
            pushFollow(FOLLOW_operator_in_operator_expr2307);
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
        dbg.location(322, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "operator_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "operator_expr"


    // $ANTLR start "factor"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:324:1: factor options {backtrack=true; } : ( INT | '-' INT | STRING | REGEXP | 'true' | 'false' | ID '[' expr ']' | persistent_var | trail_exp | function_app | '[' expr ',' ']' | '{' hash_line ',' '}' | ID | '(' expr ')' );
    public final void factor() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "factor");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(324, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:324:37: ( INT | '-' INT | STRING | REGEXP | 'true' | 'false' | ID '[' expr ']' | persistent_var | trail_exp | function_app | '[' expr ',' ']' | '{' hash_line ',' '}' | ID | '(' expr ')' )
            int alt22=14;
            try { dbg.enterDecision(22);

            try {
                isCyclicDecision = true;
                alt22 = dfa22.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(22);}

            switch (alt22) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:324:39: INT
                    {
                    dbg.location(324,39);
                    match(input,INT,FOLLOW_INT_in_factor2329); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:325:9: '-' INT
                    {
                    dbg.location(325,9);
                    match(input,98,FOLLOW_98_in_factor2339); if (state.failed) return ;
                    dbg.location(325,13);
                    match(input,INT,FOLLOW_INT_in_factor2341); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:326:9: STRING
                    {
                    dbg.location(326,9);
                    match(input,STRING,FOLLOW_STRING_in_factor2351); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:327:9: REGEXP
                    {
                    dbg.location(327,9);
                    match(input,REGEXP,FOLLOW_REGEXP_in_factor2361); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:328:9: 'true'
                    {
                    dbg.location(328,9);
                    match(input,104,FOLLOW_104_in_factor2371); if (state.failed) return ;

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:329:9: 'false'
                    {
                    dbg.location(329,9);
                    match(input,105,FOLLOW_105_in_factor2381); if (state.failed) return ;

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:330:9: ID '[' expr ']'
                    {
                    dbg.location(330,9);
                    match(input,ID,FOLLOW_ID_in_factor2391); if (state.failed) return ;
                    dbg.location(330,12);
                    match(input,106,FOLLOW_106_in_factor2393); if (state.failed) return ;
                    dbg.location(330,16);
                    pushFollow(FOLLOW_expr_in_factor2395);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(330,21);
                    match(input,107,FOLLOW_107_in_factor2397); if (state.failed) return ;

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:331:9: persistent_var
                    {
                    dbg.location(331,9);
                    pushFollow(FOLLOW_persistent_var_in_factor2407);
                    persistent_var();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:332:9: trail_exp
                    {
                    dbg.location(332,9);
                    pushFollow(FOLLOW_trail_exp_in_factor2417);
                    trail_exp();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:333:9: function_app
                    {
                    dbg.location(333,9);
                    pushFollow(FOLLOW_function_app_in_factor2427);
                    function_app();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:334:9: '[' expr ',' ']'
                    {
                    dbg.location(334,9);
                    match(input,106,FOLLOW_106_in_factor2437); if (state.failed) return ;
                    dbg.location(334,13);
                    pushFollow(FOLLOW_expr_in_factor2439);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(334,18);
                    match(input,58,FOLLOW_58_in_factor2441); if (state.failed) return ;
                    dbg.location(334,22);
                    match(input,107,FOLLOW_107_in_factor2443); if (state.failed) return ;

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:335:9: '{' hash_line ',' '}'
                    {
                    dbg.location(335,9);
                    match(input,20,FOLLOW_20_in_factor2453); if (state.failed) return ;
                    dbg.location(335,13);
                    pushFollow(FOLLOW_hash_line_in_factor2455);
                    hash_line();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(335,23);
                    match(input,58,FOLLOW_58_in_factor2457); if (state.failed) return ;
                    dbg.location(335,27);
                    match(input,21,FOLLOW_21_in_factor2459); if (state.failed) return ;

                    }
                    break;
                case 13 :
                    dbg.enterAlt(13);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:336:9: ID
                    {
                    dbg.location(336,9);
                    match(input,ID,FOLLOW_ID_in_factor2469); if (state.failed) return ;

                    }
                    break;
                case 14 :
                    dbg.enterAlt(14);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:337:9: '(' expr ')'
                    {
                    dbg.location(337,9);
                    match(input,57,FOLLOW_57_in_factor2480); if (state.failed) return ;
                    dbg.location(337,13);
                    pushFollow(FOLLOW_expr_in_factor2482);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(337,18);
                    match(input,59,FOLLOW_59_in_factor2484); if (state.failed) return ;

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
        dbg.location(338, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "factor");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "factor"


    // $ANTLR start "hash_line"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:340:1: hash_line : STRING ':' expr ;
    public final void hash_line() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "hash_line");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(340, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:341:2: ( STRING ':' expr )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:341:4: STRING ':' expr
            {
            dbg.location(341,4);
            match(input,STRING,FOLLOW_STRING_in_hash_line2497); if (state.failed) return ;
            dbg.location(341,11);
            match(input,38,FOLLOW_38_in_hash_line2499); if (state.failed) return ;
            dbg.location(341,15);
            pushFollow(FOLLOW_expr_in_hash_line2501);
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
        dbg.location(342, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "hash_line");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "hash_line"


    // $ANTLR start "function_app"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:344:1: function_app : ( namespace ID '(' expr ',' ')' | ID '(' expr ',' ')' );
    public final void function_app() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "function_app");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(344, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:345:2: ( namespace ID '(' expr ',' ')' | ID '(' expr ',' ')' )
            int alt23=2;
            try { dbg.enterDecision(23);

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

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(23);}

            switch (alt23) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:345:3: namespace ID '(' expr ',' ')'
                    {
                    dbg.location(345,3);
                    pushFollow(FOLLOW_namespace_in_function_app2514);
                    namespace();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(345,13);
                    match(input,ID,FOLLOW_ID_in_function_app2516); if (state.failed) return ;
                    dbg.location(345,16);
                    match(input,57,FOLLOW_57_in_function_app2518); if (state.failed) return ;
                    dbg.location(345,20);
                    pushFollow(FOLLOW_expr_in_function_app2520);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(345,25);
                    match(input,58,FOLLOW_58_in_function_app2522); if (state.failed) return ;
                    dbg.location(345,29);
                    match(input,59,FOLLOW_59_in_function_app2524); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:346:3: ID '(' expr ',' ')'
                    {
                    dbg.location(346,3);
                    match(input,ID,FOLLOW_ID_in_function_app2530); if (state.failed) return ;
                    dbg.location(346,6);
                    match(input,57,FOLLOW_57_in_function_app2532); if (state.failed) return ;
                    dbg.location(346,10);
                    pushFollow(FOLLOW_expr_in_function_app2534);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(346,15);
                    match(input,58,FOLLOW_58_in_function_app2536); if (state.failed) return ;
                    dbg.location(346,19);
                    match(input,59,FOLLOW_59_in_function_app2538); if (state.failed) return ;

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
        dbg.location(347, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "function_app");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "function_app"


    // $ANTLR start "namespace"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:349:1: namespace : ID ':' ;
    public final void namespace() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "namespace");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(349, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:350:2: ( ID ':' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:350:4: ID ':'
            {
            dbg.location(350,4);
            match(input,ID,FOLLOW_ID_in_namespace2550); if (state.failed) return ;
            dbg.location(350,7);
            match(input,38,FOLLOW_38_in_namespace2552); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(351, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "namespace");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "namespace"


    // $ANTLR start "trail_exp"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:353:1: trail_exp : ( 'current' var_domain ':' ID | 'history' expr var_domain ':' ID );
    public final void trail_exp() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "trail_exp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(353, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:354:2: ( 'current' var_domain ':' ID | 'history' expr var_domain ':' ID )
            int alt24=2;
            try { dbg.enterDecision(24);

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

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(24);}

            switch (alt24) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:354:3: 'current' var_domain ':' ID
                    {
                    dbg.location(354,3);
                    match(input,108,FOLLOW_108_in_trail_exp2564); if (state.failed) return ;
                    dbg.location(354,13);
                    pushFollow(FOLLOW_var_domain_in_trail_exp2566);
                    var_domain();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(354,24);
                    match(input,38,FOLLOW_38_in_trail_exp2568); if (state.failed) return ;
                    dbg.location(354,28);
                    match(input,ID,FOLLOW_ID_in_trail_exp2570); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:355:2: 'history' expr var_domain ':' ID
                    {
                    dbg.location(355,2);
                    match(input,109,FOLLOW_109_in_trail_exp2575); if (state.failed) return ;
                    dbg.location(355,12);
                    pushFollow(FOLLOW_expr_in_trail_exp2577);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(355,17);
                    pushFollow(FOLLOW_var_domain_in_trail_exp2579);
                    var_domain();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(355,28);
                    match(input,38,FOLLOW_38_in_trail_exp2581); if (state.failed) return ;
                    dbg.location(355,32);
                    match(input,ID,FOLLOW_ID_in_trail_exp2583); if (state.failed) return ;

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
        dbg.location(356, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "trail_exp");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "trail_exp"


    // $ANTLR start "persistent_var"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:358:1: persistent_var : var_domain ':' ID ;
    public final void persistent_var() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "persistent_var");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(358, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:359:2: ( var_domain ':' ID )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:359:4: var_domain ':' ID
            {
            dbg.location(359,4);
            pushFollow(FOLLOW_var_domain_in_persistent_var2597);
            var_domain();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(359,15);
            match(input,38,FOLLOW_38_in_persistent_var2599); if (state.failed) return ;
            dbg.location(359,19);
            match(input,ID,FOLLOW_ID_in_persistent_var2601); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(360, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "persistent_var");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "persistent_var"


    // $ANTLR start "operator"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:361:1: operator : '.' operator_op '(' expr ',' ')' ;
    public final void operator() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "operator");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(361, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:362:2: ( '.' operator_op '(' expr ',' ')' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:362:4: '.' operator_op '(' expr ',' ')'
            {
            dbg.location(362,4);
            match(input,110,FOLLOW_110_in_operator2613); if (state.failed) return ;
            dbg.location(362,8);
            pushFollow(FOLLOW_operator_op_in_operator2615);
            operator_op();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(362,20);
            match(input,57,FOLLOW_57_in_operator2617); if (state.failed) return ;
            dbg.location(362,24);
            pushFollow(FOLLOW_expr_in_operator2619);
            expr();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(362,29);
            match(input,58,FOLLOW_58_in_operator2621); if (state.failed) return ;
            dbg.location(362,33);
            match(input,59,FOLLOW_59_in_operator2623); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(363, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "operator");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "operator"


    // $ANTLR start "operator_op"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:365:1: operator_op : ( 'pick' | 'match' | 'length' | 'replace' | 'as' | 'head' | 'tail' | 'sort' | 'filter' | 'map' | 'uc' | 'lc' | 'split' | 'join' | 'query' | 'has' | 'union' | 'difference' | 'intersection' | 'unique' | 'once' | 'duplicates' );
    public final void operator_op() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "operator_op");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(365, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:366:2: ( 'pick' | 'match' | 'length' | 'replace' | 'as' | 'head' | 'tail' | 'sort' | 'filter' | 'map' | 'uc' | 'lc' | 'split' | 'join' | 'query' | 'has' | 'union' | 'difference' | 'intersection' | 'unique' | 'once' | 'duplicates' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:
            {
            dbg.location(366,2);
            if ( (input.LA(1)>=111 && input.LA(1)<=132) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
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
        dbg.location(370, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "operator_op");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "operator_op"


    // $ANTLR start "timeframe"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:371:1: timeframe : 'within' expr ( periods | period ) ;
    public final void timeframe() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "timeframe");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(371, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:372:2: ( 'within' expr ( periods | period ) )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:372:5: 'within' expr ( periods | period )
            {
            dbg.location(372,5);
            match(input,133,FOLLOW_133_in_timeframe2733); if (state.failed) return ;
            dbg.location(372,14);
            pushFollow(FOLLOW_expr_in_timeframe2735);
            expr();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(372,19);
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:372:19: ( periods | period )
            int alt25=2;
            try { dbg.enterSubRule(25);
            try { dbg.enterDecision(25);

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

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(25);}

            switch (alt25) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:372:20: periods
                    {
                    dbg.location(372,20);
                    pushFollow(FOLLOW_periods_in_timeframe2738);
                    periods();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:372:30: period
                    {
                    dbg.location(372,30);
                    pushFollow(FOLLOW_period_in_timeframe2742);
                    period();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(25);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(373, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "timeframe");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "timeframe"


    // $ANTLR start "var_domain"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:375:1: var_domain : ( 'ent' | 'app' );
    public final void var_domain() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "var_domain");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(375, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:375:11: ( 'ent' | 'app' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:
            {
            dbg.location(375,11);
            if ( (input.LA(1)>=134 && input.LA(1)<=135) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
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
        dbg.location(375, 26);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "var_domain");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "var_domain"


    // $ANTLR start "emit_block"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:377:1: emit_block : 'emit' ( HTML | STRING | JS ) ;
    public final void emit_block() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "emit_block");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(377, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:378:2: ( 'emit' ( HTML | STRING | JS ) )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:378:4: 'emit' ( HTML | STRING | JS )
            {
            dbg.location(378,4);
            match(input,136,FOLLOW_136_in_emit_block2769); if (state.failed) return ;
            dbg.location(378,11);
            if ( input.LA(1)==STRING||(input.LA(1)>=HTML && input.LA(1)<=JS) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
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
        dbg.location(379, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "emit_block");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "emit_block"


    // $ANTLR start "dataset"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:381:1: dataset : 'dataset' ID ( datatype )? '<-' STRING cachable ;
    public final void dataset() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "dataset");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(381, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:381:9: ( 'dataset' ID ( datatype )? '<-' STRING cachable )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:381:11: 'dataset' ID ( datatype )? '<-' STRING cachable
            {
            dbg.location(381,11);
            match(input,137,FOLLOW_137_in_dataset2789); if (state.failed) return ;
            dbg.location(381,21);
            match(input,ID,FOLLOW_ID_in_dataset2791); if (state.failed) return ;
            dbg.location(381,24);
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:381:24: ( datatype )?
            int alt26=2;
            try { dbg.enterSubRule(26);
            try { dbg.enterDecision(26);

            int LA26_0 = input.LA(1);

            if ( (LA26_0==38) ) {
                alt26=1;
            }
            } finally {dbg.exitDecision(26);}

            switch (alt26) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:381:24: datatype
                    {
                    dbg.location(381,24);
                    pushFollow(FOLLOW_datatype_in_dataset2793);
                    datatype();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(26);}

            dbg.location(381,34);
            match(input,82,FOLLOW_82_in_dataset2796); if (state.failed) return ;
            dbg.location(381,39);
            match(input,STRING,FOLLOW_STRING_in_dataset2798); if (state.failed) return ;
            dbg.location(381,46);
            pushFollow(FOLLOW_cachable_in_dataset2800);
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
        dbg.location(382, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "dataset");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "dataset"


    // $ANTLR start "datatype"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:384:1: datatype : ':' ( 'JSON' | 'XML' | 'RSS' | 'HTML' ) ;
    public final void datatype() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "datatype");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(384, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:384:9: ( ':' ( 'JSON' | 'XML' | 'RSS' | 'HTML' ) )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:384:11: ':' ( 'JSON' | 'XML' | 'RSS' | 'HTML' )
            {
            dbg.location(384,11);
            match(input,38,FOLLOW_38_in_datatype2810); if (state.failed) return ;
            dbg.location(384,15);
            if ( (input.LA(1)>=138 && input.LA(1)<=141) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
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
        dbg.location(385, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "datatype");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "datatype"


    // $ANTLR start "cachable"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:387:1: cachable : 'cachable' cachetime ;
    public final void cachable() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "cachable");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(387, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:387:9: ( 'cachable' cachetime )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:387:11: 'cachable' cachetime
            {
            dbg.location(387,11);
            match(input,142,FOLLOW_142_in_cachable2829); if (state.failed) return ;
            dbg.location(387,22);
            pushFollow(FOLLOW_cachetime_in_cachable2831);
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
        dbg.location(388, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "cachable");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "cachable"


    // $ANTLR start "cachetime"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:390:1: cachetime : 'for' INT ( periods | period ) ;
    public final void cachetime() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "cachetime");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(390, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:390:10: ( 'for' INT ( periods | period ) )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:390:12: 'for' INT ( periods | period )
            {
            dbg.location(390,12);
            match(input,52,FOLLOW_52_in_cachetime2842); if (state.failed) return ;
            dbg.location(390,18);
            match(input,INT,FOLLOW_INT_in_cachetime2844); if (state.failed) return ;
            dbg.location(390,22);
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:390:22: ( periods | period )
            int alt27=2;
            try { dbg.enterSubRule(27);
            try { dbg.enterDecision(27);

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

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(27);}

            switch (alt27) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:390:23: periods
                    {
                    dbg.location(390,23);
                    pushFollow(FOLLOW_periods_in_cachetime2847);
                    periods();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:390:31: period
                    {
                    dbg.location(390,31);
                    pushFollow(FOLLOW_period_in_cachetime2849);
                    period();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(27);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(391, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "cachetime");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "cachetime"


    // $ANTLR start "periods"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:393:1: periods : ( 'years' | 'months' | 'weeks' | 'days' | 'hours' | 'minutes' | 'seconds' );
    public final void periods() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "periods");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(393, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:393:9: ( 'years' | 'months' | 'weeks' | 'days' | 'hours' | 'minutes' | 'seconds' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:
            {
            dbg.location(393,9);
            if ( (input.LA(1)>=143 && input.LA(1)<=149) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
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
        dbg.location(400, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "periods");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "periods"


    // $ANTLR start "period"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:402:1: period : ( 'year' | 'month' | 'week' | 'day' | 'hour' | 'minute' | 'second' );
    public final void period() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "period");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(402, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:402:9: ( 'year' | 'month' | 'week' | 'day' | 'hour' | 'minute' | 'second' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:
            {
            dbg.location(402,9);
            if ( (input.LA(1)>=150 && input.LA(1)<=156) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
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
        dbg.location(409, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "period");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "period"


    // $ANTLR start "dispatch_block"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:414:1: dispatch_block : 'dispatch' '{' ( dispatch )* '}' ;
    public final void dispatch_block() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "dispatch_block");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(414, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:415:2: ( 'dispatch' '{' ( dispatch )* '}' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:415:4: 'dispatch' '{' ( dispatch )* '}'
            {
            dbg.location(415,4);
            match(input,157,FOLLOW_157_in_dispatch_block2984); if (state.failed) return ;
            dbg.location(415,15);
            match(input,20,FOLLOW_20_in_dispatch_block2986); if (state.failed) return ;
            dbg.location(415,19);
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:415:19: ( dispatch )*
            try { dbg.enterSubRule(28);

            loop28:
            do {
                int alt28=2;
                try { dbg.enterDecision(28);

                int LA28_0 = input.LA(1);

                if ( (LA28_0==158) ) {
                    alt28=1;
                }


                } finally {dbg.exitDecision(28);}

                switch (alt28) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:415:19: dispatch
            	    {
            	    dbg.location(415,19);
            	    pushFollow(FOLLOW_dispatch_in_dispatch_block2988);
            	    dispatch();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);
            } finally {dbg.exitSubRule(28);}

            dbg.location(415,29);
            match(input,21,FOLLOW_21_in_dispatch_block2991); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(416, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "dispatch_block");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "dispatch_block"


    // $ANTLR start "dispatch"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:418:1: dispatch : 'domain' STRING dispatch_target ;
    public final void dispatch() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "dispatch");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(418, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:418:9: ( 'domain' STRING dispatch_target )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:418:11: 'domain' STRING dispatch_target
            {
            dbg.location(418,11);
            match(input,158,FOLLOW_158_in_dispatch3000); if (state.failed) return ;
            dbg.location(418,20);
            match(input,STRING,FOLLOW_STRING_in_dispatch3002); if (state.failed) return ;
            dbg.location(418,27);
            pushFollow(FOLLOW_dispatch_target_in_dispatch3004);
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
        dbg.location(418, 44);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "dispatch");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "dispatch"


    // $ANTLR start "dispatch_target"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:420:1: dispatch_target : '->' STRING ;
    public final void dispatch_target() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "dispatch_target");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(420, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:421:2: ( '->' STRING )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:421:4: '->' STRING
            {
            dbg.location(421,4);
            match(input,159,FOLLOW_159_in_dispatch_target3015); if (state.failed) return ;
            dbg.location(421,9);
            match(input,STRING,FOLLOW_STRING_in_dispatch_target3017); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(422, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "dispatch_target");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "dispatch_target"


    // $ANTLR start "meta_block"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:427:1: meta_block : 'meta' '{' ( pragma )* '}' ;
    public final void meta_block() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "meta_block");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(427, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:428:2: ( 'meta' '{' ( pragma )* '}' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:428:4: 'meta' '{' ( pragma )* '}'
            {
            dbg.location(428,4);
            match(input,160,FOLLOW_160_in_meta_block3040); if (state.failed) return ;
            dbg.location(428,11);
            match(input,20,FOLLOW_20_in_meta_block3042); if (state.failed) return ;
            dbg.location(428,15);
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:428:15: ( pragma )*
            try { dbg.enterSubRule(29);

            loop29:
            do {
                int alt29=2;
                try { dbg.enterDecision(29);

                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=161 && LA29_0<=163)||LA29_0==170||LA29_0==174||LA29_0==177||LA29_0==180) ) {
                    alt29=1;
                }


                } finally {dbg.exitDecision(29);}

                switch (alt29) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:428:15: pragma
            	    {
            	    dbg.location(428,15);
            	    pushFollow(FOLLOW_pragma_in_meta_block3044);
            	    pragma();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);
            } finally {dbg.exitSubRule(29);}

            dbg.location(429,2);
            match(input,21,FOLLOW_21_in_meta_block3048); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(431, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "meta_block");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "meta_block"


    // $ANTLR start "pragma"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:433:1: pragma : ( desc_block | 'name' STRING | 'author' STRING | 'key' ( 'errorstack' | 'googleanalytics' | 'twitter' | 'amazon' | 'kpds' | 'google' | ID ) key_value | authz_pragma | logging_pargma | 'use' 'module' ID ( alias )? | 'use' ( 'css' | 'javascript' ) 'resource' location );
    public final void pragma() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "pragma");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(433, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:433:9: ( desc_block | 'name' STRING | 'author' STRING | 'key' ( 'errorstack' | 'googleanalytics' | 'twitter' | 'amazon' | 'kpds' | 'google' | ID ) key_value | authz_pragma | logging_pargma | 'use' 'module' ID ( alias )? | 'use' ( 'css' | 'javascript' ) 'resource' location )
            int alt31=8;
            try { dbg.enterDecision(31);

            try {
                isCyclicDecision = true;
                alt31 = dfa31.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(31);}

            switch (alt31) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:433:11: desc_block
                    {
                    dbg.location(433,11);
                    pushFollow(FOLLOW_desc_block_in_pragma3062);
                    desc_block();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:433:24: 'name' STRING
                    {
                    dbg.location(433,24);
                    match(input,161,FOLLOW_161_in_pragma3066); if (state.failed) return ;
                    dbg.location(433,31);
                    match(input,STRING,FOLLOW_STRING_in_pragma3068); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:433:40: 'author' STRING
                    {
                    dbg.location(433,40);
                    match(input,162,FOLLOW_162_in_pragma3072); if (state.failed) return ;
                    dbg.location(433,49);
                    match(input,STRING,FOLLOW_STRING_in_pragma3074); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:433:58: 'key' ( 'errorstack' | 'googleanalytics' | 'twitter' | 'amazon' | 'kpds' | 'google' | ID ) key_value
                    {
                    dbg.location(433,58);
                    match(input,163,FOLLOW_163_in_pragma3078); if (state.failed) return ;
                    dbg.location(433,64);
                    if ( input.LA(1)==ID||(input.LA(1)>=164 && input.LA(1)<=169) ) {
                        input.consume();
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(433,137);
                    pushFollow(FOLLOW_key_value_in_pragma3098);
                    key_value();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:434:4: authz_pragma
                    {
                    dbg.location(434,4);
                    pushFollow(FOLLOW_authz_pragma_in_pragma3104);
                    authz_pragma();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:435:4: logging_pargma
                    {
                    dbg.location(435,4);
                    pushFollow(FOLLOW_logging_pargma_in_pragma3109);
                    logging_pargma();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:436:4: 'use' 'module' ID ( alias )?
                    {
                    dbg.location(436,4);
                    match(input,170,FOLLOW_170_in_pragma3114); if (state.failed) return ;
                    dbg.location(436,10);
                    match(input,171,FOLLOW_171_in_pragma3116); if (state.failed) return ;
                    dbg.location(436,19);
                    match(input,ID,FOLLOW_ID_in_pragma3118); if (state.failed) return ;
                    dbg.location(436,22);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:436:22: ( alias )?
                    int alt30=2;
                    try { dbg.enterSubRule(30);
                    try { dbg.enterDecision(30);

                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==179) ) {
                        alt30=1;
                    }
                    } finally {dbg.exitDecision(30);}

                    switch (alt30) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:436:22: alias
                            {
                            dbg.location(436,22);
                            pushFollow(FOLLOW_alias_in_pragma3120);
                            alias();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(30);}


                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:437:4: 'use' ( 'css' | 'javascript' ) 'resource' location
                    {
                    dbg.location(437,4);
                    match(input,170,FOLLOW_170_in_pragma3126); if (state.failed) return ;
                    dbg.location(437,10);
                    if ( input.LA(1)==83||input.LA(1)==172 ) {
                        input.consume();
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(437,33);
                    match(input,173,FOLLOW_173_in_pragma3136); if (state.failed) return ;
                    dbg.location(437,44);
                    pushFollow(FOLLOW_location_in_pragma3138);
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
        dbg.location(438, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "pragma");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "pragma"


    // $ANTLR start "authz_pragma"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:440:1: authz_pragma : 'authz' 'require' 'user' ;
    public final void authz_pragma() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "authz_pragma");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(440, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:441:2: ( 'authz' 'require' 'user' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:441:4: 'authz' 'require' 'user'
            {
            dbg.location(441,4);
            match(input,174,FOLLOW_174_in_authz_pragma3150); if (state.failed) return ;
            dbg.location(441,12);
            match(input,175,FOLLOW_175_in_authz_pragma3152); if (state.failed) return ;
            dbg.location(441,22);
            match(input,176,FOLLOW_176_in_authz_pragma3154); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(442, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "authz_pragma");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "authz_pragma"


    // $ANTLR start "logging_pargma"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:444:1: logging_pargma : 'logging' ( 'on' | 'off' ) ;
    public final void logging_pargma() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "logging_pargma");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(444, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:445:2: ( 'logging' ( 'on' | 'off' ) )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:445:4: 'logging' ( 'on' | 'off' )
            {
            dbg.location(445,4);
            match(input,177,FOLLOW_177_in_logging_pargma3166); if (state.failed) return ;
            dbg.location(445,14);
            if ( input.LA(1)==79||input.LA(1)==178 ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
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
        dbg.location(446, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "logging_pargma");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "logging_pargma"


    // $ANTLR start "alias"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:448:1: alias : 'alias' ID ;
    public final void alias() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "alias");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(448, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:448:7: ( 'alias' ID )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:448:9: 'alias' ID
            {
            dbg.location(448,9);
            match(input,179,FOLLOW_179_in_alias3183); if (state.failed) return ;
            dbg.location(448,17);
            match(input,ID,FOLLOW_ID_in_alias3185); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(448, 19);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "alias");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "alias"


    // $ANTLR start "location"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:450:1: location : ( STRING | ID );
    public final void location() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "location");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(450, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:450:9: ( STRING | ID )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:
            {
            dbg.location(450,9);
            if ( input.LA(1)==ID||input.LA(1)==STRING ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
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
        dbg.location(450, 22);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "location");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "location"


    // $ANTLR start "desc_block"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:452:1: desc_block : 'description' ( HTML | STRING ) ;
    public final void desc_block() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "desc_block");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(452, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:453:2: ( 'description' ( HTML | STRING ) )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:453:4: 'description' ( HTML | STRING )
            {
            dbg.location(453,4);
            match(input,180,FOLLOW_180_in_desc_block3207); if (state.failed) return ;
            dbg.location(453,18);
            if ( input.LA(1)==STRING||input.LA(1)==HTML ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
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
        dbg.location(454, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "desc_block");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "desc_block"


    // $ANTLR start "key_value"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:457:1: key_value : ( STRING | ( name_value_pair )+ );
    public final void key_value() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "key_value");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(457, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:458:2: ( STRING | ( name_value_pair )+ )
            int alt33=2;
            try { dbg.enterDecision(33);

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

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(33);}

            switch (alt33) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:458:4: STRING
                    {
                    dbg.location(458,4);
                    match(input,STRING,FOLLOW_STRING_in_key_value3227); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:458:13: ( name_value_pair )+
                    {
                    dbg.location(458,13);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:458:13: ( name_value_pair )+
                    int cnt32=0;
                    try { dbg.enterSubRule(32);

                    loop32:
                    do {
                        int alt32=2;
                        try { dbg.enterDecision(32);

                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==STRING) ) {
                            alt32=1;
                        }


                        } finally {dbg.exitDecision(32);}

                        switch (alt32) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:458:13: name_value_pair
                    	    {
                    	    dbg.location(458,13);
                    	    pushFollow(FOLLOW_name_value_pair_in_key_value3231);
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
                                dbg.recognitionException(eee);

                                throw eee;
                        }
                        cnt32++;
                    } while (true);
                    } finally {dbg.exitSubRule(32);}


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
        dbg.location(459, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "key_value");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "key_value"


    // $ANTLR start "name_value_pair"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:461:1: name_value_pair : STRING ':' ( INT | STRING ) ;
    public final void name_value_pair() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "name_value_pair");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(461, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:462:2: ( STRING ':' ( INT | STRING ) )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:462:4: STRING ':' ( INT | STRING )
            {
            dbg.location(462,4);
            match(input,STRING,FOLLOW_STRING_in_name_value_pair3247); if (state.failed) return ;
            dbg.location(462,11);
            match(input,38,FOLLOW_38_in_name_value_pair3249); if (state.failed) return ;
            dbg.location(462,15);
            if ( input.LA(1)==INT||input.LA(1)==STRING ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
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
        dbg.location(463, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "name_value_pair");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "name_value_pair"

    // $ANTLR start synpred4_ruleset
    public final void synpred4_ruleset_fragment() throws RecognitionException {   
        // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:283:4: ( disjunction '=>' expr '|' expr )
        dbg.enterAlt(1);

        // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:283:4: disjunction '=>' expr '|' expr
        {
        dbg.location(283,4);
        pushFollow(FOLLOW_disjunction_in_synpred4_ruleset2041);
        disjunction();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(283,16);
        match(input,60,FOLLOW_60_in_synpred4_ruleset2043); if (state.failed) return ;
        dbg.location(283,21);
        pushFollow(FOLLOW_expr_in_synpred4_ruleset2045);
        expr();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(283,26);
        match(input,85,FOLLOW_85_in_synpred4_ruleset2047); if (state.failed) return ;
        dbg.location(283,30);
        pushFollow(FOLLOW_expr_in_synpred4_ruleset2049);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_ruleset

    // Delegated rules

    public final boolean synpred4_ruleset() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred4_ruleset_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA18 dfa18 = new DFA18(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA31 dfa31 = new DFA31(this);
    static final String DFA18_eotS =
        "\22\uffff";
    static final String DFA18_eofS =
        "\22\uffff";
    static final String DFA18_minS =
        "\1\4\17\0\2\uffff";
    static final String DFA18_maxS =
        "\1\u0087\17\0\2\uffff";
    static final String DFA18_acceptS =
        "\20\uffff\1\1\1\2";
    static final String DFA18_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\2\uffff}>";
    static final String[] DFA18_transitionS = {
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

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "282:1: conditional_expression options {backtrack=true; } : ( disjunction '=>' expr '|' expr | disjunction );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_1 = input.LA(1);

                         
                        int index18_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_ruleset()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index18_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_2 = input.LA(1);

                         
                        int index18_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_ruleset()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index18_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA18_3 = input.LA(1);

                         
                        int index18_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_ruleset()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index18_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA18_4 = input.LA(1);

                         
                        int index18_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_ruleset()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index18_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA18_5 = input.LA(1);

                         
                        int index18_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_ruleset()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index18_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA18_6 = input.LA(1);

                         
                        int index18_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_ruleset()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index18_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA18_7 = input.LA(1);

                         
                        int index18_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_ruleset()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index18_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA18_8 = input.LA(1);

                         
                        int index18_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_ruleset()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index18_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA18_9 = input.LA(1);

                         
                        int index18_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_ruleset()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index18_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA18_10 = input.LA(1);

                         
                        int index18_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_ruleset()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index18_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA18_11 = input.LA(1);

                         
                        int index18_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_ruleset()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index18_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA18_12 = input.LA(1);

                         
                        int index18_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_ruleset()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index18_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA18_13 = input.LA(1);

                         
                        int index18_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_ruleset()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index18_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA18_14 = input.LA(1);

                         
                        int index18_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_ruleset()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index18_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA18_15 = input.LA(1);

                         
                        int index18_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_ruleset()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index18_15);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
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
            return "310:1: unary_expr : ( 'not' unary_expr | 'seen' STRING 'in' var_domain ':' ID timeframe | 'seen' STRING ( 'before' | 'after' ) STRING 'in' var_domain ':' ID | var_domain ':' ID predop expr timeframe | var_domain ':' ID timeframe | operator_expr );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA22_eotS =
        "\20\uffff";
    static final String DFA22_eofS =
        "\20\uffff";
    static final String DFA22_minS =
        "\1\4\6\uffff\1\46\10\uffff";
    static final String DFA22_maxS =
        "\1\u0087\6\uffff\1\156\10\uffff";
    static final String DFA22_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\10\1\11\1\13\1\14\1\16"+
        "\1\7\1\12\1\15";
    static final String DFA22_specialS =
        "\20\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\7\1\1\5\uffff\1\3\6\uffff\1\4\1\uffff\1\13\44\uffff\1\14"+
            "\50\uffff\1\2\5\uffff\1\5\1\6\1\12\1\uffff\2\11\30\uffff\2\10",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\16\22\uffff\1\16\60\uffff\1\15\3\uffff\1\17",
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
            return "324:1: factor options {backtrack=true; } : ( INT | '-' INT | STRING | REGEXP | 'true' | 'false' | ID '[' expr ']' | persistent_var | trail_exp | function_app | '[' expr ',' ']' | '{' hash_line ',' '}' | ID | '(' expr ')' );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
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
            return "433:1: pragma : ( desc_block | 'name' STRING | 'author' STRING | 'key' ( 'errorstack' | 'googleanalytics' | 'twitter' | 'amazon' | 'kpds' | 'google' | ID ) key_value | authz_pragma | logging_pargma | 'use' 'module' ID ( alias )? | 'use' ( 'css' | 'javascript' ) 'resource' location );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
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
    public static final BitSet FOLLOW_24_in_global_decls1777 = new BitSet(new long[]{0x0000000000200010L,0x00000000000A0000L,0x0000000000000300L});
    public static final BitSet FOLLOW_21_in_global_decls1782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emit_block_in_global1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dataset_in_global1802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_datasource_in_global1806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_css_emit_in_global1810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decl_in_global1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_datasource1826 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_datasource1828 = new BitSet(new long[]{0x0000004000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_datatype_in_datasource1830 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_datasource1833 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_datasource1835 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_cachable_in_datasource1837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_css_emit1849 = new BitSet(new long[]{0x0000000000010800L});
    public static final BitSet FOLLOW_set_in_css_emit1851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_decl1885 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_decl1887 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_HTML_in_decl1889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_decl1894 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_decl1896 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_JS_in_decl1898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_decl1903 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_decl1905 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_decl1907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_def_in_expr1937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_expression_in_expr1941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_function_def1966 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_function_def1968 = new BitSet(new long[]{0x0800000000000010L});
    public static final BitSet FOLLOW_ID_in_function_def1971 = new BitSet(new long[]{0x0C00000000000010L});
    public static final BitSet FOLLOW_58_in_function_def1973 = new BitSet(new long[]{0x0800000000000010L});
    public static final BitSet FOLLOW_59_in_function_def1978 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_function_def1980 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_fundecls_in_function_def1982 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_function_def1985 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_function_def1987 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_function_def1989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decl_in_fundecls2013 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_fundecls2015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_disjunction_in_conditional_expression2041 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_conditional_expression2043 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_conditional_expression2045 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_conditional_expression2047 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_conditional_expression2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_disjunction_in_conditional_expression2053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conjunction_in_disjunction2066 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_disjunction2069 = new BitSet(new long[]{0x0200000000140830L,0x0000374400000080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_conjunction_in_disjunction2071 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_equality_expr_in_conjunction2087 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_conjunction2090 = new BitSet(new long[]{0x0200000000140830L,0x0000374400000080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_equality_expr_in_conjunction2092 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_add_expr_in_equality_expr2107 = new BitSet(new long[]{0x0000000000000000L,0x00000001FF000000L});
    public static final BitSet FOLLOW_predop_in_equality_expr2109 = new BitSet(new long[]{0x0200000000140830L,0x0000374400000080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_add_expr_in_equality_expr2111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_predop0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mult_expr_in_add_expr2164 = new BitSet(new long[]{0x0000000000000000L,0x0000000600000000L});
    public static final BitSet FOLLOW_add_op_in_add_expr2166 = new BitSet(new long[]{0x0200000000140830L,0x0000374400000080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_mult_expr_in_add_expr2168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_add_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_expr_in_mult_expr2188 = new BitSet(new long[]{0x0000000000000000L,0x0000003800000000L});
    public static final BitSet FOLLOW_mult_op_in_mult_expr2190 = new BitSet(new long[]{0x0200000000140830L,0x0000374400000080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_unary_expr_in_mult_expr2192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_mult_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_unary_expr2215 = new BitSet(new long[]{0x0200000000140830L,0x0000374400000080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_unary_expr_in_unary_expr2217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_unary_expr2223 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_unary_expr2225 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_unary_expr2227 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_var_domain_in_unary_expr2229 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_unary_expr2231 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_unary_expr2233 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_timeframe_in_unary_expr2235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_unary_expr2240 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_unary_expr2242 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000020L});
    public static final BitSet FOLLOW_set_in_unary_expr2244 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_unary_expr2252 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_unary_expr2254 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_var_domain_in_unary_expr2256 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_unary_expr2258 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_unary_expr2260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_domain_in_unary_expr2265 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_unary_expr2267 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_unary_expr2269 = new BitSet(new long[]{0x0000000000000000L,0x00000001FF000000L});
    public static final BitSet FOLLOW_predop_in_unary_expr2271 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_unary_expr2273 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_timeframe_in_unary_expr2275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_domain_in_unary_expr2280 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_unary_expr2282 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_unary_expr2284 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_timeframe_in_unary_expr2286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operator_expr_in_unary_expr2291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_operator_expr2305 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_operator_in_operator_expr2307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_factor2329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_factor2339 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_INT_in_factor2341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_factor2351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REGEXP_in_factor2361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_factor2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_factor2381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_factor2391 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_factor2393 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_factor2395 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_factor2397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_persistent_var_in_factor2407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_trail_exp_in_factor2417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_app_in_factor2427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_factor2437 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_factor2439 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_factor2441 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_factor2443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_factor2453 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_hash_line_in_factor2455 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_factor2457 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_factor2459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_factor2469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_factor2480 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_factor2482 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_factor2484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_hash_line2497 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_hash_line2499 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_hash_line2501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namespace_in_function_app2514 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_function_app2516 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_function_app2518 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_function_app2520 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_function_app2522 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_function_app2524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_function_app2530 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_function_app2532 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_function_app2534 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_function_app2536 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_function_app2538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_namespace2550 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_namespace2552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_trail_exp2564 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_var_domain_in_trail_exp2566 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_trail_exp2568 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_trail_exp2570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_trail_exp2575 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_trail_exp2577 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_var_domain_in_trail_exp2579 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_trail_exp2581 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_trail_exp2583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_domain_in_persistent_var2597 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_persistent_var2599 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_persistent_var2601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_operator2613 = new BitSet(new long[]{0x0000000000000000L,0xFFFF800000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_operator_op_in_operator2615 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_operator2617 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_operator2619 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_operator2621 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_operator2623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operator_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_timeframe2733 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_timeframe2735 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000001FFF8000L});
    public static final BitSet FOLLOW_periods_in_timeframe2738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_period_in_timeframe2742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_var_domain0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_emit_block2769 = new BitSet(new long[]{0x0000000000030800L});
    public static final BitSet FOLLOW_set_in_emit_block2771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_dataset2789 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_dataset2791 = new BitSet(new long[]{0x0000004000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_datatype_in_dataset2793 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_dataset2796 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_dataset2798 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_cachable_in_dataset2800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_datatype2810 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000003C00L});
    public static final BitSet FOLLOW_set_in_datatype2812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_142_in_cachable2829 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_cachetime_in_cachable2831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_cachetime2842 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_INT_in_cachetime2844 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000001FFF8000L});
    public static final BitSet FOLLOW_periods_in_cachetime2847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_period_in_cachetime2849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_periods0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_period0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_157_in_dispatch_block2984 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_dispatch_block2986 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_dispatch_in_dispatch_block2988 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_21_in_dispatch_block2991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_158_in_dispatch3000 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_dispatch3002 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_dispatch_target_in_dispatch3004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_159_in_dispatch_target3015 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_dispatch_target3017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_160_in_meta_block3040 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_meta_block3042 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000000L,0x0012440E00000000L});
    public static final BitSet FOLLOW_pragma_in_meta_block3044 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000000L,0x0012440E00000000L});
    public static final BitSet FOLLOW_21_in_meta_block3048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_desc_block_in_pragma3062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_161_in_pragma3066 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_pragma3068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_162_in_pragma3072 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_pragma3074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_163_in_pragma3078 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000000L,0x000003F000000000L});
    public static final BitSet FOLLOW_set_in_pragma3080 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_key_value_in_pragma3098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_authz_pragma_in_pragma3104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logging_pargma_in_pragma3109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_170_in_pragma3114 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_171_in_pragma3116 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_pragma3118 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_alias_in_pragma3120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_170_in_pragma3126 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000100000000000L});
    public static final BitSet FOLLOW_set_in_pragma3128 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_173_in_pragma3136 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_location_in_pragma3138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_174_in_authz_pragma3150 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_175_in_authz_pragma3152 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_176_in_authz_pragma3154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_177_in_logging_pargma3166 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L,0x0004000000000000L});
    public static final BitSet FOLLOW_set_in_logging_pargma3168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_179_in_alias3183 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_alias3185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_location0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_180_in_desc_block3207 = new BitSet(new long[]{0x0000000000010800L});
    public static final BitSet FOLLOW_set_in_desc_block3209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_key_value3227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_value_pair_in_key_value3231 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_STRING_in_name_value_pair3247 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_name_value_pair3249 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_set_in_name_value_pair3251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_disjunction_in_synpred4_ruleset2041 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_synpred4_ruleset2043 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_synpred4_ruleset2045 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_synpred4_ruleset2047 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_synpred4_ruleset2049 = new BitSet(new long[]{0x0000000000000002L});

}