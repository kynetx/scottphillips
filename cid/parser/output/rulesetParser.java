// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g 2010-07-09 10:43:44

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import org.antlr.runtime.debug.*;
import java.io.IOException;

import org.antlr.runtime.tree.*;

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
        "invalidRule", "synpred15_ruleset", "persistent_clear", "operator_expr", 
        "post", "cachetime", "using", "function_app", "synpred7_ruleset", 
        "pragma", "unconditional_action", "for_clause", "click", "equality_expr", 
        "authz_pragma", "synpred21_ruleset", "event_btwn", "action", "predop", 
        "synpred13_ruleset", "mult_expr", "control_statement", "operator", 
        "disjunction", "synpred18_ruleset", "synpred8_ruleset", "location", 
        "synpred9_ruleset", "event_prim", "post_block", "key_value", "synpred1_ruleset", 
        "modifier", "alias", "synpred23_ruleset", "datasource", "synpred11_ruleset", 
        "function_def", "synpred24_ruleset", "trail_with", "conditional_action", 
        "trail_forget", "counter_start", "operator_op", "event_filter", 
        "event_or", "synpred17_ruleset", "cachable", "logging_pargma", "setting", 
        "dispatch", "synpred2_ruleset", "ruleset", "on_expr", "modifier_clause", 
        "rulesetname", "add_expr", "rule", "event_domain", "foreach", "blocktype", 
        "success", "callbacks", "var_domain", "name_value_pair", "post_alternate", 
        "conditional_expression", "fundecls", "click_link", "trail_exp", 
        "rule_state", "synpred10_ruleset", "persistent_iterate", "event_and", 
        "trail_mark", "rule_label", "add_op", "desc_block", "synpred14_ruleset", 
        "dispatch_target", "counter_op", "global", "pre_block", "persistent_var", 
        "failure", "synpred19_ruleset", "persistent_expr", "persistent_set", 
        "synpred12_ruleset", "meta_block", "factor", "css_emit", "periods", 
        "synpred16_ruleset", "decl", "datatype", "raise_statement", "actionblock", 
        "unary_expr", "post_statement", "period", "expr", "synpred4_ruleset", 
        "when", "global_decls", "conjunction", "primrule", "emit_block", 
        "event_seq", "hash_line", "mult_op", "log_statement", "select", 
        "timeframe", "synpred22_ruleset", "namespace", "dispatch_block", 
        "synpred3_ruleset", "synpred20_ruleset", "synpred6_ruleset", "synpred5_ruleset", 
        "dataset"
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
                new DebugEventSocketProxy(this,port,adaptor);
            setDebugListener(proxy);
            setTokenStream(new DebugTokenStream(input,proxy));
            try {
                proxy.handshake();
            }
            catch (IOException ioe) {
                reportError(ioe);
            }
            TreeAdaptor adap = new CommonTreeAdaptor();
            setTreeAdaptor(adap);
            proxy.setTreeAdaptor(adap);
        }
    public rulesetParser(TokenStream input, DebugEventListener dbg) {
        super(input, dbg);

         
        TreeAdaptor adap = new CommonTreeAdaptor();
        setTreeAdaptor(adap);

    }
    protected boolean evalPredicate(boolean result, String predicate) {
        dbg.semanticPredicate(result, predicate);
        return result;
    }

    protected DebugTreeAdaptor adaptor;
    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = new DebugTreeAdaptor(dbg,adaptor);

    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }


    public String[] getTokenNames() { return rulesetParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g"; }


    public static class ruleset_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ruleset"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:68:1: ruleset : 'ruleset' rulesetname '{' ( meta_block | dispatch_block | global_decls | rule )* '}' EOF ;
    public final rulesetParser.ruleset_return ruleset() throws RecognitionException {
        rulesetParser.ruleset_return retval = new rulesetParser.ruleset_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal1=null;
        Token char_literal3=null;
        Token char_literal8=null;
        Token EOF9=null;
        rulesetParser.rulesetname_return rulesetname2 = null;

        rulesetParser.meta_block_return meta_block4 = null;

        rulesetParser.dispatch_block_return dispatch_block5 = null;

        rulesetParser.global_decls_return global_decls6 = null;

        rulesetParser.rule_return rule7 = null;


        Object string_literal1_tree=null;
        Object char_literal3_tree=null;
        Object char_literal8_tree=null;
        Object EOF9_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ruleset");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(68, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:69:3: ( 'ruleset' rulesetname '{' ( meta_block | dispatch_block | global_decls | rule )* '}' EOF )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:69:5: 'ruleset' rulesetname '{' ( meta_block | dispatch_block | global_decls | rule )* '}' EOF
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(69,5);
            string_literal1=(Token)match(input,19,FOLLOW_19_in_ruleset653); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal1_tree = (Object)adaptor.create(string_literal1);
            adaptor.addChild(root_0, string_literal1_tree);
            }
            dbg.location(69,15);
            pushFollow(FOLLOW_rulesetname_in_ruleset655);
            rulesetname2=rulesetname();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, rulesetname2.getTree());
            dbg.location(69,27);
            char_literal3=(Token)match(input,20,FOLLOW_20_in_ruleset657); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal3_tree = (Object)adaptor.create(char_literal3);
            adaptor.addChild(root_0, char_literal3_tree);
            }
            dbg.location(70,4);
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:70:4: ( meta_block | dispatch_block | global_decls | rule )*
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=5;
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
                case 22:
                    {
                    alt1=4;
                    }
                    break;

                }

                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:70:6: meta_block
            	    {
            	    dbg.location(70,6);
            	    pushFollow(FOLLOW_meta_block_in_ruleset665);
            	    meta_block4=meta_block();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, meta_block4.getTree());

            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:71:6: dispatch_block
            	    {
            	    dbg.location(71,6);
            	    pushFollow(FOLLOW_dispatch_block_in_ruleset673);
            	    dispatch_block5=dispatch_block();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, dispatch_block5.getTree());

            	    }
            	    break;
            	case 3 :
            	    dbg.enterAlt(3);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:72:6: global_decls
            	    {
            	    dbg.location(72,6);
            	    pushFollow(FOLLOW_global_decls_in_ruleset680);
            	    global_decls6=global_decls();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, global_decls6.getTree());

            	    }
            	    break;
            	case 4 :
            	    dbg.enterAlt(4);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:73:6: rule
            	    {
            	    dbg.location(73,6);
            	    pushFollow(FOLLOW_rule_in_ruleset688);
            	    rule7=rule();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, rule7.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);
            } finally {dbg.exitSubRule(1);}

            dbg.location(74,3);
            char_literal8=(Token)match(input,21,FOLLOW_21_in_ruleset696); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal8_tree = (Object)adaptor.create(char_literal8);
            adaptor.addChild(root_0, char_literal8_tree);
            }
            dbg.location(74,7);
            EOF9=(Token)match(input,EOF,FOLLOW_EOF_in_ruleset698); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EOF9_tree = (Object)adaptor.create(EOF9);
            adaptor.addChild(root_0, EOF9_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(75, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "ruleset");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "ruleset"

    public static class rulesetname_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rulesetname"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:81:1: rulesetname : ( ID | INT );
    public final rulesetParser.rulesetname_return rulesetname() throws RecognitionException {
        rulesetParser.rulesetname_return retval = new rulesetParser.rulesetname_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set10=null;

        Object set10_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rulesetname");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(81, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:82:2: ( ID | INT )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(82,2);
            set10=(Token)input.LT(1);
            if ( (input.LA(1)>=ID && input.LA(1)<=INT) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set10));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(83, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "rulesetname");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "rulesetname"

    public static class rule_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rule"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:89:1: rule : 'rule' ID 'is' rule_state '{' select ( pre_block )? ( emit_block )? action ( ';' )? ( callbacks )? ( post_block )? '}' ;
    public final rulesetParser.rule_return rule() throws RecognitionException {
        rulesetParser.rule_return retval = new rulesetParser.rule_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal11=null;
        Token ID12=null;
        Token string_literal13=null;
        Token char_literal15=null;
        Token char_literal20=null;
        Token char_literal23=null;
        rulesetParser.rule_state_return rule_state14 = null;

        rulesetParser.select_return select16 = null;

        rulesetParser.pre_block_return pre_block17 = null;

        rulesetParser.emit_block_return emit_block18 = null;

        rulesetParser.action_return action19 = null;

        rulesetParser.callbacks_return callbacks21 = null;

        rulesetParser.post_block_return post_block22 = null;


        Object string_literal11_tree=null;
        Object ID12_tree=null;
        Object string_literal13_tree=null;
        Object char_literal15_tree=null;
        Object char_literal20_tree=null;
        Object char_literal23_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rule");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(89, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:89:6: ( 'rule' ID 'is' rule_state '{' select ( pre_block )? ( emit_block )? action ( ';' )? ( callbacks )? ( post_block )? '}' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:89:9: 'rule' ID 'is' rule_state '{' select ( pre_block )? ( emit_block )? action ( ';' )? ( callbacks )? ( post_block )? '}'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(89,9);
            string_literal11=(Token)match(input,22,FOLLOW_22_in_rule754); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal11_tree = (Object)adaptor.create(string_literal11);
            adaptor.addChild(root_0, string_literal11_tree);
            }
            dbg.location(89,16);
            ID12=(Token)match(input,ID,FOLLOW_ID_in_rule756); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID12_tree = (Object)adaptor.create(ID12);
            adaptor.addChild(root_0, ID12_tree);
            }
            dbg.location(89,19);
            string_literal13=(Token)match(input,23,FOLLOW_23_in_rule758); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal13_tree = (Object)adaptor.create(string_literal13);
            adaptor.addChild(root_0, string_literal13_tree);
            }
            dbg.location(89,24);
            pushFollow(FOLLOW_rule_state_in_rule760);
            rule_state14=rule_state();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, rule_state14.getTree());
            dbg.location(89,35);
            char_literal15=(Token)match(input,20,FOLLOW_20_in_rule762); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal15_tree = (Object)adaptor.create(char_literal15);
            adaptor.addChild(root_0, char_literal15_tree);
            }
            dbg.location(90,2);
            pushFollow(FOLLOW_select_in_rule765);
            select16=select();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, select16.getTree());
            dbg.location(90,9);
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:90:9: ( pre_block )?
            int alt2=2;
            try { dbg.enterSubRule(2);
            try { dbg.enterDecision(2);

            int LA2_0 = input.LA(1);

            if ( (LA2_0==64) ) {
                alt2=1;
            }
            } finally {dbg.exitDecision(2);}

            switch (alt2) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:90:9: pre_block
                    {
                    dbg.location(90,9);
                    pushFollow(FOLLOW_pre_block_in_rule767);
                    pre_block17=pre_block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pre_block17.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(2);}

            dbg.location(90,20);
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:90:20: ( emit_block )?
            int alt3=2;
            try { dbg.enterSubRule(3);
            try { dbg.enterDecision(3);

            int LA3_0 = input.LA(1);

            if ( (LA3_0==136) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==STRING||(LA3_1>=HTML && LA3_1<=JS)) ) {
                    int LA3_3 = input.LA(3);

                    if ( (LA3_3==ID||LA3_3==29||(LA3_3>=62 && LA3_3<=63)||LA3_3==136) ) {
                        alt3=1;
                    }
                }
            }
            } finally {dbg.exitDecision(3);}

            switch (alt3) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:90:20: emit_block
                    {
                    dbg.location(90,20);
                    pushFollow(FOLLOW_emit_block_in_rule770);
                    emit_block18=emit_block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, emit_block18.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(3);}

            dbg.location(90,32);
            pushFollow(FOLLOW_action_in_rule773);
            action19=action();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, action19.getTree());
            dbg.location(90,39);
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:90:39: ( ';' )?
            int alt4=2;
            try { dbg.enterSubRule(4);
            try { dbg.enterDecision(4);

            int LA4_0 = input.LA(1);

            if ( (LA4_0==24) ) {
                alt4=1;
            }
            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:90:39: ';'
                    {
                    dbg.location(90,39);
                    char_literal20=(Token)match(input,24,FOLLOW_24_in_rule775); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal20_tree = (Object)adaptor.create(char_literal20);
                    adaptor.addChild(root_0, char_literal20_tree);
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(4);}

            dbg.location(90,44);
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:90:44: ( callbacks )?
            int alt5=2;
            try { dbg.enterSubRule(5);
            try { dbg.enterDecision(5);

            int LA5_0 = input.LA(1);

            if ( (LA5_0==30) ) {
                alt5=1;
            }
            } finally {dbg.exitDecision(5);}

            switch (alt5) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:90:44: callbacks
                    {
                    dbg.location(90,44);
                    pushFollow(FOLLOW_callbacks_in_rule778);
                    callbacks21=callbacks();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, callbacks21.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(5);}

            dbg.location(90,55);
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:90:55: ( post_block )?
            int alt6=2;
            try { dbg.enterSubRule(6);
            try { dbg.enterDecision(6);

            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=25 && LA6_0<=27)) ) {
                alt6=1;
            }
            } finally {dbg.exitDecision(6);}

            switch (alt6) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:90:55: post_block
                    {
                    dbg.location(90,55);
                    pushFollow(FOLLOW_post_block_in_rule781);
                    post_block22=post_block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, post_block22.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(6);}

            dbg.location(91,2);
            char_literal23=(Token)match(input,21,FOLLOW_21_in_rule785); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal23_tree = (Object)adaptor.create(char_literal23);
            adaptor.addChild(root_0, char_literal23_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(92, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "rule");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "rule"

    public static class post_block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "post_block"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:97:1: post_block : post '{' post_statement ';' ';' '}' post_alternate ;
    public final rulesetParser.post_block_return post_block() throws RecognitionException {
        rulesetParser.post_block_return retval = new rulesetParser.post_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal25=null;
        Token char_literal27=null;
        Token char_literal28=null;
        Token char_literal29=null;
        rulesetParser.post_return post24 = null;

        rulesetParser.post_statement_return post_statement26 = null;

        rulesetParser.post_alternate_return post_alternate30 = null;


        Object char_literal25_tree=null;
        Object char_literal27_tree=null;
        Object char_literal28_tree=null;
        Object char_literal29_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "post_block");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(97, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:97:11: ( post '{' post_statement ';' ';' '}' post_alternate )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:97:13: post '{' post_statement ';' ';' '}' post_alternate
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(97,13);
            pushFollow(FOLLOW_post_in_post_block799);
            post24=post();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, post24.getTree());
            dbg.location(97,18);
            char_literal25=(Token)match(input,20,FOLLOW_20_in_post_block801); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal25_tree = (Object)adaptor.create(char_literal25);
            adaptor.addChild(root_0, char_literal25_tree);
            }
            dbg.location(97,22);
            pushFollow(FOLLOW_post_statement_in_post_block803);
            post_statement26=post_statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, post_statement26.getTree());
            dbg.location(97,37);
            char_literal27=(Token)match(input,24,FOLLOW_24_in_post_block805); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal27_tree = (Object)adaptor.create(char_literal27);
            adaptor.addChild(root_0, char_literal27_tree);
            }
            dbg.location(97,41);
            char_literal28=(Token)match(input,24,FOLLOW_24_in_post_block807); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal28_tree = (Object)adaptor.create(char_literal28);
            adaptor.addChild(root_0, char_literal28_tree);
            }
            dbg.location(97,45);
            char_literal29=(Token)match(input,21,FOLLOW_21_in_post_block809); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal29_tree = (Object)adaptor.create(char_literal29);
            adaptor.addChild(root_0, char_literal29_tree);
            }
            dbg.location(97,49);
            pushFollow(FOLLOW_post_alternate_in_post_block811);
            post_alternate30=post_alternate();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, post_alternate30.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(97, 63);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "post_block");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "post_block"

    public static class post_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "post"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:99:1: post : ( 'fired' | 'always' | 'notfired' );
    public final rulesetParser.post_return post() throws RecognitionException {
        rulesetParser.post_return retval = new rulesetParser.post_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set31=null;

        Object set31_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "post");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(99, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:99:5: ( 'fired' | 'always' | 'notfired' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(99,5);
            set31=(Token)input.LT(1);
            if ( (input.LA(1)>=25 && input.LA(1)<=27) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set31));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(101, 17);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "post");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "post"

    public static class post_alternate_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "post_alternate"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:104:1: post_alternate : 'else' '{' post_statement ';' ';' '}' ;
    public final rulesetParser.post_alternate_return post_alternate() throws RecognitionException {
        rulesetParser.post_alternate_return retval = new rulesetParser.post_alternate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal32=null;
        Token char_literal33=null;
        Token char_literal35=null;
        Token char_literal36=null;
        Token char_literal37=null;
        rulesetParser.post_statement_return post_statement34 = null;


        Object string_literal32_tree=null;
        Object char_literal33_tree=null;
        Object char_literal35_tree=null;
        Object char_literal36_tree=null;
        Object char_literal37_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "post_alternate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(104, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:104:15: ( 'else' '{' post_statement ';' ';' '}' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:104:17: 'else' '{' post_statement ';' ';' '}'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(104,17);
            string_literal32=(Token)match(input,28,FOLLOW_28_in_post_alternate842); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal32_tree = (Object)adaptor.create(string_literal32);
            adaptor.addChild(root_0, string_literal32_tree);
            }
            dbg.location(104,24);
            char_literal33=(Token)match(input,20,FOLLOW_20_in_post_alternate844); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal33_tree = (Object)adaptor.create(char_literal33);
            adaptor.addChild(root_0, char_literal33_tree);
            }
            dbg.location(104,28);
            pushFollow(FOLLOW_post_statement_in_post_alternate846);
            post_statement34=post_statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, post_statement34.getTree());
            dbg.location(104,43);
            char_literal35=(Token)match(input,24,FOLLOW_24_in_post_alternate848); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal35_tree = (Object)adaptor.create(char_literal35);
            adaptor.addChild(root_0, char_literal35_tree);
            }
            dbg.location(104,47);
            char_literal36=(Token)match(input,24,FOLLOW_24_in_post_alternate850); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal36_tree = (Object)adaptor.create(char_literal36);
            adaptor.addChild(root_0, char_literal36_tree);
            }
            dbg.location(104,51);
            char_literal37=(Token)match(input,21,FOLLOW_21_in_post_alternate852); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal37_tree = (Object)adaptor.create(char_literal37);
            adaptor.addChild(root_0, char_literal37_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(104, 54);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "post_alternate");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "post_alternate"

    public static class post_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "post_statement"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:106:1: post_statement : ( persistent_expr ( 'if' expr ) | log_statement ( 'if' expr ) | control_statement ( 'if' expr ) | raise_statement ( 'if' expr ) );
    public final rulesetParser.post_statement_return post_statement() throws RecognitionException {
        rulesetParser.post_statement_return retval = new rulesetParser.post_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal39=null;
        Token string_literal42=null;
        Token string_literal45=null;
        Token string_literal48=null;
        rulesetParser.persistent_expr_return persistent_expr38 = null;

        rulesetParser.expr_return expr40 = null;

        rulesetParser.log_statement_return log_statement41 = null;

        rulesetParser.expr_return expr43 = null;

        rulesetParser.control_statement_return control_statement44 = null;

        rulesetParser.expr_return expr46 = null;

        rulesetParser.raise_statement_return raise_statement47 = null;

        rulesetParser.expr_return expr49 = null;


        Object string_literal39_tree=null;
        Object string_literal42_tree=null;
        Object string_literal45_tree=null;
        Object string_literal48_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "post_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(106, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:106:15: ( persistent_expr ( 'if' expr ) | log_statement ( 'if' expr ) | control_statement ( 'if' expr ) | raise_statement ( 'if' expr ) )
            int alt7=4;
            try { dbg.enterDecision(7);

            switch ( input.LA(1) ) {
            case 37:
            case 39:
            case 40:
            case 42:
            case 134:
            case 135:
                {
                alt7=1;
                }
                break;
            case 47:
                {
                alt7=2;
                }
                break;
            case 48:
                {
                alt7=3;
                }
                break;
            case 49:
                {
                alt7=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(7);}

            switch (alt7) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:106:17: persistent_expr ( 'if' expr )
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(106,17);
                    pushFollow(FOLLOW_persistent_expr_in_post_statement859);
                    persistent_expr38=persistent_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, persistent_expr38.getTree());
                    dbg.location(106,33);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:106:33: ( 'if' expr )
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:106:34: 'if' expr
                    {
                    dbg.location(106,34);
                    string_literal39=(Token)match(input,29,FOLLOW_29_in_post_statement862); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal39_tree = (Object)adaptor.create(string_literal39);
                    adaptor.addChild(root_0, string_literal39_tree);
                    }
                    dbg.location(106,39);
                    pushFollow(FOLLOW_expr_in_post_statement864);
                    expr40=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr40.getTree());

                    }


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:107:5: log_statement ( 'if' expr )
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(107,5);
                    pushFollow(FOLLOW_log_statement_in_post_statement871);
                    log_statement41=log_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, log_statement41.getTree());
                    dbg.location(107,19);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:107:19: ( 'if' expr )
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:107:20: 'if' expr
                    {
                    dbg.location(107,20);
                    string_literal42=(Token)match(input,29,FOLLOW_29_in_post_statement874); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal42_tree = (Object)adaptor.create(string_literal42);
                    adaptor.addChild(root_0, string_literal42_tree);
                    }
                    dbg.location(107,25);
                    pushFollow(FOLLOW_expr_in_post_statement876);
                    expr43=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr43.getTree());

                    }


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:108:5: control_statement ( 'if' expr )
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(108,5);
                    pushFollow(FOLLOW_control_statement_in_post_statement883);
                    control_statement44=control_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, control_statement44.getTree());
                    dbg.location(108,23);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:108:23: ( 'if' expr )
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:108:24: 'if' expr
                    {
                    dbg.location(108,24);
                    string_literal45=(Token)match(input,29,FOLLOW_29_in_post_statement886); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal45_tree = (Object)adaptor.create(string_literal45);
                    adaptor.addChild(root_0, string_literal45_tree);
                    }
                    dbg.location(108,29);
                    pushFollow(FOLLOW_expr_in_post_statement888);
                    expr46=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr46.getTree());

                    }


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:109:5: raise_statement ( 'if' expr )
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(109,5);
                    pushFollow(FOLLOW_raise_statement_in_post_statement895);
                    raise_statement47=raise_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, raise_statement47.getTree());
                    dbg.location(109,21);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:109:21: ( 'if' expr )
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:109:22: 'if' expr
                    {
                    dbg.location(109,22);
                    string_literal48=(Token)match(input,29,FOLLOW_29_in_post_statement898); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal48_tree = (Object)adaptor.create(string_literal48);
                    adaptor.addChild(root_0, string_literal48_tree);
                    }
                    dbg.location(109,27);
                    pushFollow(FOLLOW_expr_in_post_statement900);
                    expr49=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr49.getTree());

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(110, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "post_statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "post_statement"

    public static class callbacks_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "callbacks"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:113:1: callbacks : 'callbacks' '{' ( success )? ( failure )? '}' ;
    public final rulesetParser.callbacks_return callbacks() throws RecognitionException {
        rulesetParser.callbacks_return retval = new rulesetParser.callbacks_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal50=null;
        Token char_literal51=null;
        Token char_literal54=null;
        rulesetParser.success_return success52 = null;

        rulesetParser.failure_return failure53 = null;


        Object string_literal50_tree=null;
        Object char_literal51_tree=null;
        Object char_literal54_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "callbacks");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(113, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:113:10: ( 'callbacks' '{' ( success )? ( failure )? '}' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:113:12: 'callbacks' '{' ( success )? ( failure )? '}'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(113,12);
            string_literal50=(Token)match(input,30,FOLLOW_30_in_callbacks912); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal50_tree = (Object)adaptor.create(string_literal50);
            adaptor.addChild(root_0, string_literal50_tree);
            }
            dbg.location(113,24);
            char_literal51=(Token)match(input,20,FOLLOW_20_in_callbacks914); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal51_tree = (Object)adaptor.create(char_literal51);
            adaptor.addChild(root_0, char_literal51_tree);
            }
            dbg.location(113,28);
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:113:28: ( success )?
            int alt8=2;
            try { dbg.enterSubRule(8);
            try { dbg.enterDecision(8);

            int LA8_0 = input.LA(1);

            if ( (LA8_0==31) ) {
                alt8=1;
            }
            } finally {dbg.exitDecision(8);}

            switch (alt8) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:113:28: success
                    {
                    dbg.location(113,28);
                    pushFollow(FOLLOW_success_in_callbacks916);
                    success52=success();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, success52.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(8);}

            dbg.location(113,37);
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:113:37: ( failure )?
            int alt9=2;
            try { dbg.enterSubRule(9);
            try { dbg.enterDecision(9);

            int LA9_0 = input.LA(1);

            if ( (LA9_0==32) ) {
                alt9=1;
            }
            } finally {dbg.exitDecision(9);}

            switch (alt9) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:113:37: failure
                    {
                    dbg.location(113,37);
                    pushFollow(FOLLOW_failure_in_callbacks919);
                    failure53=failure();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, failure53.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(9);}

            dbg.location(113,46);
            char_literal54=(Token)match(input,21,FOLLOW_21_in_callbacks922); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal54_tree = (Object)adaptor.create(char_literal54);
            adaptor.addChild(root_0, char_literal54_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(113, 49);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "callbacks");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "callbacks"

    public static class success_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "success"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:115:1: success : 'success' '{' click ( ';' )? '}' ;
    public final rulesetParser.success_return success() throws RecognitionException {
        rulesetParser.success_return retval = new rulesetParser.success_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal55=null;
        Token char_literal56=null;
        Token char_literal58=null;
        Token char_literal59=null;
        rulesetParser.click_return click57 = null;


        Object string_literal55_tree=null;
        Object char_literal56_tree=null;
        Object char_literal58_tree=null;
        Object char_literal59_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "success");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(115, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:115:8: ( 'success' '{' click ( ';' )? '}' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:115:10: 'success' '{' click ( ';' )? '}'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(115,10);
            string_literal55=(Token)match(input,31,FOLLOW_31_in_success929); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal55_tree = (Object)adaptor.create(string_literal55);
            adaptor.addChild(root_0, string_literal55_tree);
            }
            dbg.location(115,20);
            char_literal56=(Token)match(input,20,FOLLOW_20_in_success931); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal56_tree = (Object)adaptor.create(char_literal56);
            adaptor.addChild(root_0, char_literal56_tree);
            }
            dbg.location(115,24);
            pushFollow(FOLLOW_click_in_success933);
            click57=click();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, click57.getTree());
            dbg.location(115,30);
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:115:30: ( ';' )?
            int alt10=2;
            try { dbg.enterSubRule(10);
            try { dbg.enterDecision(10);

            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            } finally {dbg.exitDecision(10);}

            switch (alt10) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:115:30: ';'
                    {
                    dbg.location(115,30);
                    char_literal58=(Token)match(input,24,FOLLOW_24_in_success935); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal58_tree = (Object)adaptor.create(char_literal58);
                    adaptor.addChild(root_0, char_literal58_tree);
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(10);}

            dbg.location(115,35);
            char_literal59=(Token)match(input,21,FOLLOW_21_in_success938); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal59_tree = (Object)adaptor.create(char_literal59);
            adaptor.addChild(root_0, char_literal59_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(115, 38);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "success");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "success"

    public static class failure_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "failure"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:117:1: failure : 'failure' '{' click ( ';' )? '}' ;
    public final rulesetParser.failure_return failure() throws RecognitionException {
        rulesetParser.failure_return retval = new rulesetParser.failure_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal60=null;
        Token char_literal61=null;
        Token char_literal63=null;
        Token char_literal64=null;
        rulesetParser.click_return click62 = null;


        Object string_literal60_tree=null;
        Object char_literal61_tree=null;
        Object char_literal63_tree=null;
        Object char_literal64_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "failure");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(117, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:117:8: ( 'failure' '{' click ( ';' )? '}' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:117:10: 'failure' '{' click ( ';' )? '}'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(117,10);
            string_literal60=(Token)match(input,32,FOLLOW_32_in_failure945); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal60_tree = (Object)adaptor.create(string_literal60);
            adaptor.addChild(root_0, string_literal60_tree);
            }
            dbg.location(117,20);
            char_literal61=(Token)match(input,20,FOLLOW_20_in_failure947); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal61_tree = (Object)adaptor.create(char_literal61);
            adaptor.addChild(root_0, char_literal61_tree);
            }
            dbg.location(117,24);
            pushFollow(FOLLOW_click_in_failure949);
            click62=click();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, click62.getTree());
            dbg.location(117,30);
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:117:30: ( ';' )?
            int alt11=2;
            try { dbg.enterSubRule(11);
            try { dbg.enterDecision(11);

            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            } finally {dbg.exitDecision(11);}

            switch (alt11) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:117:30: ';'
                    {
                    dbg.location(117,30);
                    char_literal63=(Token)match(input,24,FOLLOW_24_in_failure951); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal63_tree = (Object)adaptor.create(char_literal63);
                    adaptor.addChild(root_0, char_literal63_tree);
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(11);}

            dbg.location(117,37);
            char_literal64=(Token)match(input,21,FOLLOW_21_in_failure956); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal64_tree = (Object)adaptor.create(char_literal64);
            adaptor.addChild(root_0, char_literal64_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(117, 40);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "failure");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "failure"

    public static class click_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "click"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:119:1: click : ( 'click' | 'change' ) ID '=' STRING ( click_link )? ;
    public final rulesetParser.click_return click() throws RecognitionException {
        rulesetParser.click_return retval = new rulesetParser.click_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set65=null;
        Token ID66=null;
        Token char_literal67=null;
        Token STRING68=null;
        rulesetParser.click_link_return click_link69 = null;


        Object set65_tree=null;
        Object ID66_tree=null;
        Object char_literal67_tree=null;
        Object STRING68_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "click");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(119, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:119:6: ( ( 'click' | 'change' ) ID '=' STRING ( click_link )? )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:119:8: ( 'click' | 'change' ) ID '=' STRING ( click_link )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(119,8);
            set65=(Token)input.LT(1);
            if ( (input.LA(1)>=33 && input.LA(1)<=34) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set65));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }

            dbg.location(119,29);
            ID66=(Token)match(input,ID,FOLLOW_ID_in_click971); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID66_tree = (Object)adaptor.create(ID66);
            adaptor.addChild(root_0, ID66_tree);
            }
            dbg.location(119,32);
            char_literal67=(Token)match(input,35,FOLLOW_35_in_click973); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal67_tree = (Object)adaptor.create(char_literal67);
            adaptor.addChild(root_0, char_literal67_tree);
            }
            dbg.location(119,36);
            STRING68=(Token)match(input,STRING,FOLLOW_STRING_in_click975); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING68_tree = (Object)adaptor.create(STRING68);
            adaptor.addChild(root_0, STRING68_tree);
            }
            dbg.location(119,43);
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:119:43: ( click_link )?
            int alt12=2;
            try { dbg.enterSubRule(12);
            try { dbg.enterDecision(12);

            int LA12_0 = input.LA(1);

            if ( (LA12_0==36) ) {
                alt12=1;
            }
            } finally {dbg.exitDecision(12);}

            switch (alt12) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:119:43: click_link
                    {
                    dbg.location(119,43);
                    pushFollow(FOLLOW_click_link_in_click977);
                    click_link69=click_link();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, click_link69.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(12);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(119, 54);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "click");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "click"

    public static class click_link_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "click_link"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:121:1: click_link : 'triggers' persistent_expr ;
    public final rulesetParser.click_link_return click_link() throws RecognitionException {
        rulesetParser.click_link_return retval = new rulesetParser.click_link_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal70=null;
        rulesetParser.persistent_expr_return persistent_expr71 = null;


        Object string_literal70_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "click_link");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(121, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:121:11: ( 'triggers' persistent_expr )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:121:13: 'triggers' persistent_expr
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(121,13);
            string_literal70=(Token)match(input,36,FOLLOW_36_in_click_link985); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal70_tree = (Object)adaptor.create(string_literal70);
            adaptor.addChild(root_0, string_literal70_tree);
            }
            dbg.location(121,24);
            pushFollow(FOLLOW_persistent_expr_in_click_link987);
            persistent_expr71=persistent_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, persistent_expr71.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(121, 39);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "click_link");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "click_link"

    public static class persistent_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "persistent_expr"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:124:1: persistent_expr : ( persistent_clear | persistent_set | persistent_iterate | trail_forget | trail_mark );
    public final rulesetParser.persistent_expr_return persistent_expr() throws RecognitionException {
        rulesetParser.persistent_expr_return retval = new rulesetParser.persistent_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        rulesetParser.persistent_clear_return persistent_clear72 = null;

        rulesetParser.persistent_set_return persistent_set73 = null;

        rulesetParser.persistent_iterate_return persistent_iterate74 = null;

        rulesetParser.trail_forget_return trail_forget75 = null;

        rulesetParser.trail_mark_return trail_mark76 = null;



        try { dbg.enterRule(getGrammarFileName(), "persistent_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(124, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:124:16: ( persistent_clear | persistent_set | persistent_iterate | trail_forget | trail_mark )
            int alt13=5;
            try { dbg.enterDecision(13);

            switch ( input.LA(1) ) {
            case 37:
                {
                alt13=1;
                }
                break;
            case 39:
                {
                alt13=2;
                }
                break;
            case 134:
            case 135:
                {
                alt13=3;
                }
                break;
            case 40:
                {
                alt13=4;
                }
                break;
            case 42:
                {
                alt13=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(13);}

            switch (alt13) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:124:18: persistent_clear
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(124,18);
                    pushFollow(FOLLOW_persistent_clear_in_persistent_expr995);
                    persistent_clear72=persistent_clear();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, persistent_clear72.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:125:6: persistent_set
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(125,6);
                    pushFollow(FOLLOW_persistent_set_in_persistent_expr1002);
                    persistent_set73=persistent_set();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, persistent_set73.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:126:6: persistent_iterate
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(126,6);
                    pushFollow(FOLLOW_persistent_iterate_in_persistent_expr1009);
                    persistent_iterate74=persistent_iterate();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, persistent_iterate74.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:127:6: trail_forget
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(127,6);
                    pushFollow(FOLLOW_trail_forget_in_persistent_expr1016);
                    trail_forget75=trail_forget();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, trail_forget75.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:128:6: trail_mark
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(128,6);
                    pushFollow(FOLLOW_trail_mark_in_persistent_expr1023);
                    trail_mark76=trail_mark();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, trail_mark76.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(128, 16);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "persistent_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "persistent_expr"

    public static class persistent_clear_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "persistent_clear"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:131:1: persistent_clear : 'clear' var_domain ':' ID ;
    public final rulesetParser.persistent_clear_return persistent_clear() throws RecognitionException {
        rulesetParser.persistent_clear_return retval = new rulesetParser.persistent_clear_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal77=null;
        Token char_literal79=null;
        Token ID80=null;
        rulesetParser.var_domain_return var_domain78 = null;


        Object string_literal77_tree=null;
        Object char_literal79_tree=null;
        Object ID80_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "persistent_clear");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(131, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:131:17: ( 'clear' var_domain ':' ID )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:131:19: 'clear' var_domain ':' ID
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(131,19);
            string_literal77=(Token)match(input,37,FOLLOW_37_in_persistent_clear1031); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal77_tree = (Object)adaptor.create(string_literal77);
            adaptor.addChild(root_0, string_literal77_tree);
            }
            dbg.location(131,27);
            pushFollow(FOLLOW_var_domain_in_persistent_clear1033);
            var_domain78=var_domain();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, var_domain78.getTree());
            dbg.location(131,38);
            char_literal79=(Token)match(input,38,FOLLOW_38_in_persistent_clear1035); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal79_tree = (Object)adaptor.create(char_literal79);
            adaptor.addChild(root_0, char_literal79_tree);
            }
            dbg.location(131,42);
            ID80=(Token)match(input,ID,FOLLOW_ID_in_persistent_clear1037); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID80_tree = (Object)adaptor.create(ID80);
            adaptor.addChild(root_0, ID80_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(131, 44);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "persistent_clear");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "persistent_clear"

    public static class persistent_set_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "persistent_set"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:133:1: persistent_set : 'set' var_domain ':' ID ;
    public final rulesetParser.persistent_set_return persistent_set() throws RecognitionException {
        rulesetParser.persistent_set_return retval = new rulesetParser.persistent_set_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal81=null;
        Token char_literal83=null;
        Token ID84=null;
        rulesetParser.var_domain_return var_domain82 = null;


        Object string_literal81_tree=null;
        Object char_literal83_tree=null;
        Object ID84_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "persistent_set");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(133, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:133:15: ( 'set' var_domain ':' ID )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:133:17: 'set' var_domain ':' ID
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(133,17);
            string_literal81=(Token)match(input,39,FOLLOW_39_in_persistent_set1044); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal81_tree = (Object)adaptor.create(string_literal81);
            adaptor.addChild(root_0, string_literal81_tree);
            }
            dbg.location(133,23);
            pushFollow(FOLLOW_var_domain_in_persistent_set1046);
            var_domain82=var_domain();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, var_domain82.getTree());
            dbg.location(133,34);
            char_literal83=(Token)match(input,38,FOLLOW_38_in_persistent_set1048); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal83_tree = (Object)adaptor.create(char_literal83);
            adaptor.addChild(root_0, char_literal83_tree);
            }
            dbg.location(133,38);
            ID84=(Token)match(input,ID,FOLLOW_ID_in_persistent_set1050); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID84_tree = (Object)adaptor.create(ID84);
            adaptor.addChild(root_0, ID84_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(133, 40);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "persistent_set");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "persistent_set"

    public static class persistent_iterate_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "persistent_iterate"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:135:1: persistent_iterate : var_domain ':' ID counter_op expr counter_start ;
    public final rulesetParser.persistent_iterate_return persistent_iterate() throws RecognitionException {
        rulesetParser.persistent_iterate_return retval = new rulesetParser.persistent_iterate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal86=null;
        Token ID87=null;
        rulesetParser.var_domain_return var_domain85 = null;

        rulesetParser.counter_op_return counter_op88 = null;

        rulesetParser.expr_return expr89 = null;

        rulesetParser.counter_start_return counter_start90 = null;


        Object char_literal86_tree=null;
        Object ID87_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "persistent_iterate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(135, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:135:19: ( var_domain ':' ID counter_op expr counter_start )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:135:21: var_domain ':' ID counter_op expr counter_start
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(135,21);
            pushFollow(FOLLOW_var_domain_in_persistent_iterate1057);
            var_domain85=var_domain();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, var_domain85.getTree());
            dbg.location(135,32);
            char_literal86=(Token)match(input,38,FOLLOW_38_in_persistent_iterate1059); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal86_tree = (Object)adaptor.create(char_literal86);
            adaptor.addChild(root_0, char_literal86_tree);
            }
            dbg.location(135,36);
            ID87=(Token)match(input,ID,FOLLOW_ID_in_persistent_iterate1061); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID87_tree = (Object)adaptor.create(ID87);
            adaptor.addChild(root_0, ID87_tree);
            }
            dbg.location(135,39);
            pushFollow(FOLLOW_counter_op_in_persistent_iterate1063);
            counter_op88=counter_op();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, counter_op88.getTree());
            dbg.location(135,50);
            pushFollow(FOLLOW_expr_in_persistent_iterate1065);
            expr89=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr89.getTree());
            dbg.location(135,55);
            pushFollow(FOLLOW_counter_start_in_persistent_iterate1067);
            counter_start90=counter_start();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, counter_start90.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(135, 68);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "persistent_iterate");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "persistent_iterate"

    public static class trail_forget_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "trail_forget"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:137:1: trail_forget : 'forget' STRING 'in' var_domain ':' ID ;
    public final rulesetParser.trail_forget_return trail_forget() throws RecognitionException {
        rulesetParser.trail_forget_return retval = new rulesetParser.trail_forget_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal91=null;
        Token STRING92=null;
        Token string_literal93=null;
        Token char_literal95=null;
        Token ID96=null;
        rulesetParser.var_domain_return var_domain94 = null;


        Object string_literal91_tree=null;
        Object STRING92_tree=null;
        Object string_literal93_tree=null;
        Object char_literal95_tree=null;
        Object ID96_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "trail_forget");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(137, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:137:13: ( 'forget' STRING 'in' var_domain ':' ID )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:137:15: 'forget' STRING 'in' var_domain ':' ID
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(137,15);
            string_literal91=(Token)match(input,40,FOLLOW_40_in_trail_forget1074); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal91_tree = (Object)adaptor.create(string_literal91);
            adaptor.addChild(root_0, string_literal91_tree);
            }
            dbg.location(137,24);
            STRING92=(Token)match(input,STRING,FOLLOW_STRING_in_trail_forget1076); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING92_tree = (Object)adaptor.create(STRING92);
            adaptor.addChild(root_0, STRING92_tree);
            }
            dbg.location(137,31);
            string_literal93=(Token)match(input,41,FOLLOW_41_in_trail_forget1078); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal93_tree = (Object)adaptor.create(string_literal93);
            adaptor.addChild(root_0, string_literal93_tree);
            }
            dbg.location(137,36);
            pushFollow(FOLLOW_var_domain_in_trail_forget1080);
            var_domain94=var_domain();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, var_domain94.getTree());
            dbg.location(137,47);
            char_literal95=(Token)match(input,38,FOLLOW_38_in_trail_forget1082); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal95_tree = (Object)adaptor.create(char_literal95);
            adaptor.addChild(root_0, char_literal95_tree);
            }
            dbg.location(137,51);
            ID96=(Token)match(input,ID,FOLLOW_ID_in_trail_forget1084); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID96_tree = (Object)adaptor.create(ID96);
            adaptor.addChild(root_0, ID96_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(137, 53);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "trail_forget");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "trail_forget"

    public static class trail_mark_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "trail_mark"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:139:1: trail_mark : 'mark' var_domain ':' ID trail_with ;
    public final rulesetParser.trail_mark_return trail_mark() throws RecognitionException {
        rulesetParser.trail_mark_return retval = new rulesetParser.trail_mark_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal97=null;
        Token char_literal99=null;
        Token ID100=null;
        rulesetParser.var_domain_return var_domain98 = null;

        rulesetParser.trail_with_return trail_with101 = null;


        Object string_literal97_tree=null;
        Object char_literal99_tree=null;
        Object ID100_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "trail_mark");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(139, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:139:11: ( 'mark' var_domain ':' ID trail_with )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:139:13: 'mark' var_domain ':' ID trail_with
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(139,13);
            string_literal97=(Token)match(input,42,FOLLOW_42_in_trail_mark1091); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal97_tree = (Object)adaptor.create(string_literal97);
            adaptor.addChild(root_0, string_literal97_tree);
            }
            dbg.location(139,20);
            pushFollow(FOLLOW_var_domain_in_trail_mark1093);
            var_domain98=var_domain();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, var_domain98.getTree());
            dbg.location(139,31);
            char_literal99=(Token)match(input,38,FOLLOW_38_in_trail_mark1095); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal99_tree = (Object)adaptor.create(char_literal99);
            adaptor.addChild(root_0, char_literal99_tree);
            }
            dbg.location(139,35);
            ID100=(Token)match(input,ID,FOLLOW_ID_in_trail_mark1097); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID100_tree = (Object)adaptor.create(ID100);
            adaptor.addChild(root_0, ID100_tree);
            }
            dbg.location(139,38);
            pushFollow(FOLLOW_trail_with_in_trail_mark1099);
            trail_with101=trail_with();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, trail_with101.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(139, 48);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "trail_mark");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "trail_mark"

    public static class trail_with_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "trail_with"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:141:1: trail_with : 'with' expr ;
    public final rulesetParser.trail_with_return trail_with() throws RecognitionException {
        rulesetParser.trail_with_return retval = new rulesetParser.trail_with_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal102=null;
        rulesetParser.expr_return expr103 = null;


        Object string_literal102_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "trail_with");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(141, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:141:11: ( 'with' expr )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:141:13: 'with' expr
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(141,13);
            string_literal102=(Token)match(input,43,FOLLOW_43_in_trail_with1106); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal102_tree = (Object)adaptor.create(string_literal102);
            adaptor.addChild(root_0, string_literal102_tree);
            }
            dbg.location(141,20);
            pushFollow(FOLLOW_expr_in_trail_with1108);
            expr103=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr103.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(141, 24);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "trail_with");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "trail_with"

    public static class counter_op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "counter_op"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:144:1: counter_op : ( '+=' | '-=' );
    public final rulesetParser.counter_op_return counter_op() throws RecognitionException {
        rulesetParser.counter_op_return retval = new rulesetParser.counter_op_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set104=null;

        Object set104_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "counter_op");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(144, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:144:11: ( '+=' | '-=' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(144,11);
            set104=(Token)input.LT(1);
            if ( (input.LA(1)>=44 && input.LA(1)<=45) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set104));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(145, 17);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "counter_op");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "counter_op"

    public static class counter_start_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "counter_start"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:147:1: counter_start : 'from' expr ;
    public final rulesetParser.counter_start_return counter_start() throws RecognitionException {
        rulesetParser.counter_start_return retval = new rulesetParser.counter_start_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal105=null;
        rulesetParser.expr_return expr106 = null;


        Object string_literal105_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "counter_start");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(147, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:147:14: ( 'from' expr )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:147:16: 'from' expr
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(147,16);
            string_literal105=(Token)match(input,46,FOLLOW_46_in_counter_start1137); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal105_tree = (Object)adaptor.create(string_literal105);
            adaptor.addChild(root_0, string_literal105_tree);
            }
            dbg.location(147,23);
            pushFollow(FOLLOW_expr_in_counter_start1139);
            expr106=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr106.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(147, 27);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "counter_start");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "counter_start"

    public static class log_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "log_statement"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:150:1: log_statement : 'log' expr ;
    public final rulesetParser.log_statement_return log_statement() throws RecognitionException {
        rulesetParser.log_statement_return retval = new rulesetParser.log_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal107=null;
        rulesetParser.expr_return expr108 = null;


        Object string_literal107_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "log_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(150, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:150:14: ( 'log' expr )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:150:16: 'log' expr
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(150,16);
            string_literal107=(Token)match(input,47,FOLLOW_47_in_log_statement1147); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal107_tree = (Object)adaptor.create(string_literal107);
            adaptor.addChild(root_0, string_literal107_tree);
            }
            dbg.location(150,22);
            pushFollow(FOLLOW_expr_in_log_statement1149);
            expr108=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr108.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(150, 26);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "log_statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "log_statement"

    public static class control_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "control_statement"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:152:1: control_statement : 'last' ;
    public final rulesetParser.control_statement_return control_statement() throws RecognitionException {
        rulesetParser.control_statement_return retval = new rulesetParser.control_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal109=null;

        Object string_literal109_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "control_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(152, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:152:18: ( 'last' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:152:20: 'last'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(152,20);
            string_literal109=(Token)match(input,48,FOLLOW_48_in_control_statement1156); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal109_tree = (Object)adaptor.create(string_literal109);
            adaptor.addChild(root_0, string_literal109_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(152, 26);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "control_statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "control_statement"

    public static class raise_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "raise_statement"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:154:1: raise_statement : 'raise' 'explicit' 'event' ID for_clause modifier_clause ;
    public final rulesetParser.raise_statement_return raise_statement() throws RecognitionException {
        rulesetParser.raise_statement_return retval = new rulesetParser.raise_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal110=null;
        Token string_literal111=null;
        Token string_literal112=null;
        Token ID113=null;
        rulesetParser.for_clause_return for_clause114 = null;

        rulesetParser.modifier_clause_return modifier_clause115 = null;


        Object string_literal110_tree=null;
        Object string_literal111_tree=null;
        Object string_literal112_tree=null;
        Object ID113_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "raise_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(154, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:154:16: ( 'raise' 'explicit' 'event' ID for_clause modifier_clause )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:154:18: 'raise' 'explicit' 'event' ID for_clause modifier_clause
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(154,18);
            string_literal110=(Token)match(input,49,FOLLOW_49_in_raise_statement1163); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal110_tree = (Object)adaptor.create(string_literal110);
            adaptor.addChild(root_0, string_literal110_tree);
            }
            dbg.location(154,26);
            string_literal111=(Token)match(input,50,FOLLOW_50_in_raise_statement1165); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal111_tree = (Object)adaptor.create(string_literal111);
            adaptor.addChild(root_0, string_literal111_tree);
            }
            dbg.location(154,37);
            string_literal112=(Token)match(input,51,FOLLOW_51_in_raise_statement1167); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal112_tree = (Object)adaptor.create(string_literal112);
            adaptor.addChild(root_0, string_literal112_tree);
            }
            dbg.location(154,45);
            ID113=(Token)match(input,ID,FOLLOW_ID_in_raise_statement1169); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID113_tree = (Object)adaptor.create(ID113);
            adaptor.addChild(root_0, ID113_tree);
            }
            dbg.location(154,48);
            pushFollow(FOLLOW_for_clause_in_raise_statement1171);
            for_clause114=for_clause();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, for_clause114.getTree());
            dbg.location(154,59);
            pushFollow(FOLLOW_modifier_clause_in_raise_statement1173);
            modifier_clause115=modifier_clause();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, modifier_clause115.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(154, 74);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "raise_statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "raise_statement"

    public static class for_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "for_clause"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:156:1: for_clause : 'for' ID ;
    public final rulesetParser.for_clause_return for_clause() throws RecognitionException {
        rulesetParser.for_clause_return retval = new rulesetParser.for_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal116=null;
        Token ID117=null;

        Object string_literal116_tree=null;
        Object ID117_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "for_clause");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(156, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:156:11: ( 'for' ID )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:156:13: 'for' ID
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(156,13);
            string_literal116=(Token)match(input,52,FOLLOW_52_in_for_clause1180); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal116_tree = (Object)adaptor.create(string_literal116);
            adaptor.addChild(root_0, string_literal116_tree);
            }
            dbg.location(156,19);
            ID117=(Token)match(input,ID,FOLLOW_ID_in_for_clause1182); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID117_tree = (Object)adaptor.create(ID117);
            adaptor.addChild(root_0, ID117_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(156, 21);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "for_clause");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "for_clause"

    public static class rule_state_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rule_state"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:161:1: rule_state : ( 'active' | 'inactive' | 'test' );
    public final rulesetParser.rule_state_return rule_state() throws RecognitionException {
        rulesetParser.rule_state_return retval = new rulesetParser.rule_state_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set118=null;

        Object set118_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rule_state");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(161, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:161:11: ( 'active' | 'inactive' | 'test' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(161,11);
            set118=(Token)input.LT(1);
            if ( (input.LA(1)>=53 && input.LA(1)<=55) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set118));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(164, 11);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "rule_state");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "rule_state"

    public static class action_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "action"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:167:1: action : ( conditional_action | unconditional_action );
    public final rulesetParser.action_return action() throws RecognitionException {
        rulesetParser.action_return retval = new rulesetParser.action_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        rulesetParser.conditional_action_return conditional_action119 = null;

        rulesetParser.unconditional_action_return unconditional_action120 = null;



        try { dbg.enterRule(getGrammarFileName(), "action");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(167, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:167:9: ( conditional_action | unconditional_action )
            int alt14=2;
            try { dbg.enterDecision(14);

            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            else if ( (LA14_0==ID||(LA14_0>=62 && LA14_0<=63)||LA14_0==136) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(14);}

            switch (alt14) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:167:11: conditional_action
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(167,11);
                    pushFollow(FOLLOW_conditional_action_in_action1254);
                    conditional_action119=conditional_action();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditional_action119.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:167:32: unconditional_action
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(167,32);
                    pushFollow(FOLLOW_unconditional_action_in_action1258);
                    unconditional_action120=unconditional_action();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unconditional_action120.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(168, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "action");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "action"

    public static class conditional_action_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditional_action"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:171:1: conditional_action : 'if' expr 'then' unconditional_action ;
    public final rulesetParser.conditional_action_return conditional_action() throws RecognitionException {
        rulesetParser.conditional_action_return retval = new rulesetParser.conditional_action_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal121=null;
        Token string_literal123=null;
        rulesetParser.expr_return expr122 = null;

        rulesetParser.unconditional_action_return unconditional_action124 = null;


        Object string_literal121_tree=null;
        Object string_literal123_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "conditional_action");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(171, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:172:2: ( 'if' expr 'then' unconditional_action )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:172:4: 'if' expr 'then' unconditional_action
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(172,4);
            string_literal121=(Token)match(input,29,FOLLOW_29_in_conditional_action1272); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal121_tree = (Object)adaptor.create(string_literal121);
            adaptor.addChild(root_0, string_literal121_tree);
            }
            dbg.location(172,9);
            pushFollow(FOLLOW_expr_in_conditional_action1274);
            expr122=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr122.getTree());
            dbg.location(172,14);
            string_literal123=(Token)match(input,56,FOLLOW_56_in_conditional_action1276); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal123_tree = (Object)adaptor.create(string_literal123);
            adaptor.addChild(root_0, string_literal123_tree);
            }
            dbg.location(172,21);
            pushFollow(FOLLOW_unconditional_action_in_conditional_action1278);
            unconditional_action124=unconditional_action();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unconditional_action124.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(173, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "conditional_action");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "conditional_action"

    public static class unconditional_action_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unconditional_action"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:175:1: unconditional_action : ( primrule | actionblock );
    public final rulesetParser.unconditional_action_return unconditional_action() throws RecognitionException {
        rulesetParser.unconditional_action_return retval = new rulesetParser.unconditional_action_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        rulesetParser.primrule_return primrule125 = null;

        rulesetParser.actionblock_return actionblock126 = null;



        try { dbg.enterRule(getGrammarFileName(), "unconditional_action");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(175, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:176:2: ( primrule | actionblock )
            int alt15=2;
            try { dbg.enterDecision(15);

            int LA15_0 = input.LA(1);

            if ( (LA15_0==ID||LA15_0==136) ) {
                alt15=1;
            }
            else if ( ((LA15_0>=62 && LA15_0<=63)) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(15);}

            switch (alt15) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:176:4: primrule
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(176,4);
                    pushFollow(FOLLOW_primrule_in_unconditional_action1291);
                    primrule125=primrule();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primrule125.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:176:15: actionblock
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(176,15);
                    pushFollow(FOLLOW_actionblock_in_unconditional_action1295);
                    actionblock126=actionblock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, actionblock126.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(177, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "unconditional_action");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "unconditional_action"

    public static class primrule_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primrule"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:179:1: primrule : ( ( rule_label )? ( namespace )? ID '(' ( expr ( ',' )? )* ')' ( modifier_clause )* | ( rule_label )? emit_block );
    public final rulesetParser.primrule_return primrule() throws RecognitionException {
        rulesetParser.primrule_return retval = new rulesetParser.primrule_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID129=null;
        Token char_literal130=null;
        Token char_literal132=null;
        Token char_literal133=null;
        rulesetParser.rule_label_return rule_label127 = null;

        rulesetParser.namespace_return namespace128 = null;

        rulesetParser.expr_return expr131 = null;

        rulesetParser.modifier_clause_return modifier_clause134 = null;

        rulesetParser.rule_label_return rule_label135 = null;

        rulesetParser.emit_block_return emit_block136 = null;


        Object ID129_tree=null;
        Object char_literal130_tree=null;
        Object char_literal132_tree=null;
        Object char_literal133_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "primrule");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(179, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:180:2: ( ( rule_label )? ( namespace )? ID '(' ( expr ( ',' )? )* ')' ( modifier_clause )* | ( rule_label )? emit_block )
            int alt22=2;
            try { dbg.enterDecision(22);

            int LA22_0 = input.LA(1);

            if ( (LA22_0==ID) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==60) ) {
                    int LA22_3 = input.LA(3);

                    if ( (LA22_3==136) ) {
                        alt22=2;
                    }
                    else if ( (LA22_3==ID) ) {
                        alt22=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 3, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                }
                else if ( (LA22_1==38||LA22_1==57) ) {
                    alt22=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else if ( (LA22_0==136) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(22);}

            switch (alt22) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:180:4: ( rule_label )? ( namespace )? ID '(' ( expr ( ',' )? )* ')' ( modifier_clause )*
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(180,4);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:180:4: ( rule_label )?
                    int alt16=2;
                    try { dbg.enterSubRule(16);
                    try { dbg.enterDecision(16);

                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==ID) ) {
                        int LA16_1 = input.LA(2);

                        if ( (LA16_1==60) ) {
                            alt16=1;
                        }
                    }
                    } finally {dbg.exitDecision(16);}

                    switch (alt16) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:180:4: rule_label
                            {
                            dbg.location(180,4);
                            pushFollow(FOLLOW_rule_label_in_primrule1308);
                            rule_label127=rule_label();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, rule_label127.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(16);}

                    dbg.location(180,16);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:180:16: ( namespace )?
                    int alt17=2;
                    try { dbg.enterSubRule(17);
                    try { dbg.enterDecision(17);

                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==ID) ) {
                        int LA17_1 = input.LA(2);

                        if ( (LA17_1==38) ) {
                            alt17=1;
                        }
                    }
                    } finally {dbg.exitDecision(17);}

                    switch (alt17) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:180:16: namespace
                            {
                            dbg.location(180,16);
                            pushFollow(FOLLOW_namespace_in_primrule1311);
                            namespace128=namespace();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, namespace128.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(17);}

                    dbg.location(180,27);
                    ID129=(Token)match(input,ID,FOLLOW_ID_in_primrule1314); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID129_tree = (Object)adaptor.create(ID129);
                    adaptor.addChild(root_0, ID129_tree);
                    }
                    dbg.location(180,30);
                    char_literal130=(Token)match(input,57,FOLLOW_57_in_primrule1316); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal130_tree = (Object)adaptor.create(char_literal130);
                    adaptor.addChild(root_0, char_literal130_tree);
                    }
                    dbg.location(180,34);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:180:34: ( expr ( ',' )? )*
                    try { dbg.enterSubRule(19);

                    loop19:
                    do {
                        int alt19=2;
                        try { dbg.enterDecision(19);

                        int LA19_0 = input.LA(1);

                        if ( ((LA19_0>=ID && LA19_0<=INT)||LA19_0==STRING||LA19_0==REGEXP||LA19_0==20||LA19_0==57||LA19_0==71||LA19_0==84||LA19_0==98||LA19_0==102||(LA19_0>=104 && LA19_0<=106)||(LA19_0>=108 && LA19_0<=109)||(LA19_0>=134 && LA19_0<=135)) ) {
                            alt19=1;
                        }


                        } finally {dbg.exitDecision(19);}

                        switch (alt19) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:180:35: expr ( ',' )?
                    	    {
                    	    dbg.location(180,35);
                    	    pushFollow(FOLLOW_expr_in_primrule1319);
                    	    expr131=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr131.getTree());
                    	    dbg.location(180,40);
                    	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:180:40: ( ',' )?
                    	    int alt18=2;
                    	    try { dbg.enterSubRule(18);
                    	    try { dbg.enterDecision(18);

                    	    int LA18_0 = input.LA(1);

                    	    if ( (LA18_0==58) ) {
                    	        alt18=1;
                    	    }
                    	    } finally {dbg.exitDecision(18);}

                    	    switch (alt18) {
                    	        case 1 :
                    	            dbg.enterAlt(1);

                    	            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:180:40: ','
                    	            {
                    	            dbg.location(180,40);
                    	            char_literal132=(Token)match(input,58,FOLLOW_58_in_primrule1321); if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) {
                    	            char_literal132_tree = (Object)adaptor.create(char_literal132);
                    	            adaptor.addChild(root_0, char_literal132_tree);
                    	            }

                    	            }
                    	            break;

                    	    }
                    	    } finally {dbg.exitSubRule(18);}


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(19);}

                    dbg.location(180,47);
                    char_literal133=(Token)match(input,59,FOLLOW_59_in_primrule1326); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal133_tree = (Object)adaptor.create(char_literal133);
                    adaptor.addChild(root_0, char_literal133_tree);
                    }
                    dbg.location(180,51);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:180:51: ( modifier_clause )*
                    try { dbg.enterSubRule(20);

                    loop20:
                    do {
                        int alt20=2;
                        try { dbg.enterDecision(20);

                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==43||LA20_0==61) ) {
                            alt20=1;
                        }


                        } finally {dbg.exitDecision(20);}

                        switch (alt20) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:180:52: modifier_clause
                    	    {
                    	    dbg.location(180,52);
                    	    pushFollow(FOLLOW_modifier_clause_in_primrule1329);
                    	    modifier_clause134=modifier_clause();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, modifier_clause134.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(20);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:181:4: ( rule_label )? emit_block
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(181,4);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:181:4: ( rule_label )?
                    int alt21=2;
                    try { dbg.enterSubRule(21);
                    try { dbg.enterDecision(21);

                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==ID) ) {
                        alt21=1;
                    }
                    } finally {dbg.exitDecision(21);}

                    switch (alt21) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:181:4: rule_label
                            {
                            dbg.location(181,4);
                            pushFollow(FOLLOW_rule_label_in_primrule1338);
                            rule_label135=rule_label();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, rule_label135.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(21);}

                    dbg.location(181,16);
                    pushFollow(FOLLOW_emit_block_in_primrule1341);
                    emit_block136=emit_block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, emit_block136.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(182, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "primrule");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "primrule"

    public static class rule_label_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rule_label"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:184:1: rule_label : ID '=>' ;
    public final rulesetParser.rule_label_return rule_label() throws RecognitionException {
        rulesetParser.rule_label_return retval = new rulesetParser.rule_label_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID137=null;
        Token string_literal138=null;

        Object ID137_tree=null;
        Object string_literal138_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rule_label");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(184, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:184:12: ( ID '=>' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:184:14: ID '=>'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(184,14);
            ID137=(Token)match(input,ID,FOLLOW_ID_in_rule_label1362); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID137_tree = (Object)adaptor.create(ID137);
            adaptor.addChild(root_0, ID137_tree);
            }
            dbg.location(184,17);
            string_literal138=(Token)match(input,60,FOLLOW_60_in_rule_label1364); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal138_tree = (Object)adaptor.create(string_literal138);
            adaptor.addChild(root_0, string_literal138_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(184, 21);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "rule_label");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "rule_label"

    public static class modifier_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "modifier_clause"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:186:1: modifier_clause : ( 'with' modifier | 'and' modifier );
    public final rulesetParser.modifier_clause_return modifier_clause() throws RecognitionException {
        rulesetParser.modifier_clause_return retval = new rulesetParser.modifier_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal139=null;
        Token string_literal141=null;
        rulesetParser.modifier_return modifier140 = null;

        rulesetParser.modifier_return modifier142 = null;


        Object string_literal139_tree=null;
        Object string_literal141_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "modifier_clause");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(186, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:187:2: ( 'with' modifier | 'and' modifier )
            int alt23=2;
            try { dbg.enterDecision(23);

            int LA23_0 = input.LA(1);

            if ( (LA23_0==43) ) {
                alt23=1;
            }
            else if ( (LA23_0==61) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(23);}

            switch (alt23) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:187:4: 'with' modifier
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(187,4);
                    string_literal139=(Token)match(input,43,FOLLOW_43_in_modifier_clause1384); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal139_tree = (Object)adaptor.create(string_literal139);
                    adaptor.addChild(root_0, string_literal139_tree);
                    }
                    dbg.location(187,11);
                    pushFollow(FOLLOW_modifier_in_modifier_clause1386);
                    modifier140=modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, modifier140.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:188:3: 'and' modifier
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(188,3);
                    string_literal141=(Token)match(input,61,FOLLOW_61_in_modifier_clause1392); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal141_tree = (Object)adaptor.create(string_literal141);
                    adaptor.addChild(root_0, string_literal141_tree);
                    }
                    dbg.location(188,9);
                    pushFollow(FOLLOW_modifier_in_modifier_clause1394);
                    modifier142=modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, modifier142.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(189, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "modifier_clause");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "modifier_clause"

    public static class modifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "modifier"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:192:1: modifier : ( ID '=' expr | ID '=' JS );
    public final rulesetParser.modifier_return modifier() throws RecognitionException {
        rulesetParser.modifier_return retval = new rulesetParser.modifier_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID143=null;
        Token char_literal144=null;
        Token ID146=null;
        Token char_literal147=null;
        Token JS148=null;
        rulesetParser.expr_return expr145 = null;


        Object ID143_tree=null;
        Object char_literal144_tree=null;
        Object ID146_tree=null;
        Object char_literal147_tree=null;
        Object JS148_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "modifier");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(192, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:193:2: ( ID '=' expr | ID '=' JS )
            int alt24=2;
            try { dbg.enterDecision(24);

            int LA24_0 = input.LA(1);

            if ( (LA24_0==ID) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==35) ) {
                    int LA24_2 = input.LA(3);

                    if ( (LA24_2==JS) ) {
                        alt24=2;
                    }
                    else if ( ((LA24_2>=ID && LA24_2<=INT)||LA24_2==STRING||LA24_2==REGEXP||LA24_2==20||LA24_2==57||LA24_2==71||LA24_2==84||LA24_2==98||LA24_2==102||(LA24_2>=104 && LA24_2<=106)||(LA24_2>=108 && LA24_2<=109)||(LA24_2>=134 && LA24_2<=135)) ) {
                        alt24=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 2, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(24);}

            switch (alt24) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:193:4: ID '=' expr
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(193,4);
                    ID143=(Token)match(input,ID,FOLLOW_ID_in_modifier1407); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID143_tree = (Object)adaptor.create(ID143);
                    adaptor.addChild(root_0, ID143_tree);
                    }
                    dbg.location(193,7);
                    char_literal144=(Token)match(input,35,FOLLOW_35_in_modifier1409); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal144_tree = (Object)adaptor.create(char_literal144);
                    adaptor.addChild(root_0, char_literal144_tree);
                    }
                    dbg.location(193,11);
                    pushFollow(FOLLOW_expr_in_modifier1411);
                    expr145=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr145.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:194:4: ID '=' JS
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(194,4);
                    ID146=(Token)match(input,ID,FOLLOW_ID_in_modifier1418); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID146_tree = (Object)adaptor.create(ID146);
                    adaptor.addChild(root_0, ID146_tree);
                    }
                    dbg.location(194,7);
                    char_literal147=(Token)match(input,35,FOLLOW_35_in_modifier1420); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal147_tree = (Object)adaptor.create(char_literal147);
                    adaptor.addChild(root_0, char_literal147_tree);
                    }
                    dbg.location(194,11);
                    JS148=(Token)match(input,JS,FOLLOW_JS_in_modifier1422); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    JS148_tree = (Object)adaptor.create(JS148);
                    adaptor.addChild(root_0, JS148_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(195, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "modifier");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "modifier"

    public static class actionblock_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "actionblock"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:197:1: actionblock : blocktype '{' ( primrule ( ';' )? )* '}' ;
    public final rulesetParser.actionblock_return actionblock() throws RecognitionException {
        rulesetParser.actionblock_return retval = new rulesetParser.actionblock_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal150=null;
        Token char_literal152=null;
        Token char_literal153=null;
        rulesetParser.blocktype_return blocktype149 = null;

        rulesetParser.primrule_return primrule151 = null;


        Object char_literal150_tree=null;
        Object char_literal152_tree=null;
        Object char_literal153_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "actionblock");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(197, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:198:2: ( blocktype '{' ( primrule ( ';' )? )* '}' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:198:4: blocktype '{' ( primrule ( ';' )? )* '}'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(198,4);
            pushFollow(FOLLOW_blocktype_in_actionblock1435);
            blocktype149=blocktype();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, blocktype149.getTree());
            dbg.location(198,14);
            char_literal150=(Token)match(input,20,FOLLOW_20_in_actionblock1437); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal150_tree = (Object)adaptor.create(char_literal150);
            adaptor.addChild(root_0, char_literal150_tree);
            }
            dbg.location(198,18);
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:198:18: ( primrule ( ';' )? )*
            try { dbg.enterSubRule(26);

            loop26:
            do {
                int alt26=2;
                try { dbg.enterDecision(26);

                int LA26_0 = input.LA(1);

                if ( (LA26_0==ID||LA26_0==136) ) {
                    alt26=1;
                }


                } finally {dbg.exitDecision(26);}

                switch (alt26) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:198:19: primrule ( ';' )?
            	    {
            	    dbg.location(198,19);
            	    pushFollow(FOLLOW_primrule_in_actionblock1440);
            	    primrule151=primrule();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, primrule151.getTree());
            	    dbg.location(198,28);
            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:198:28: ( ';' )?
            	    int alt25=2;
            	    try { dbg.enterSubRule(25);
            	    try { dbg.enterDecision(25);

            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==24) ) {
            	        alt25=1;
            	    }
            	    } finally {dbg.exitDecision(25);}

            	    switch (alt25) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:198:28: ';'
            	            {
            	            dbg.location(198,28);
            	            char_literal152=(Token)match(input,24,FOLLOW_24_in_actionblock1442); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal152_tree = (Object)adaptor.create(char_literal152);
            	            adaptor.addChild(root_0, char_literal152_tree);
            	            }

            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(25);}


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);
            } finally {dbg.exitSubRule(26);}

            dbg.location(198,35);
            char_literal153=(Token)match(input,21,FOLLOW_21_in_actionblock1447); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal153_tree = (Object)adaptor.create(char_literal153);
            adaptor.addChild(root_0, char_literal153_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(199, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "actionblock");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "actionblock"

    public static class blocktype_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "blocktype"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:201:1: blocktype : ( 'choose' | 'every' );
    public final rulesetParser.blocktype_return blocktype() throws RecognitionException {
        rulesetParser.blocktype_return retval = new rulesetParser.blocktype_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set154=null;

        Object set154_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "blocktype");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(201, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:201:10: ( 'choose' | 'every' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(201,10);
            set154=(Token)input.LT(1);
            if ( (input.LA(1)>=62 && input.LA(1)<=63) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set154));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(202, 19);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "blocktype");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "blocktype"

    public static class pre_block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pre_block"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:205:1: pre_block : 'pre' '{' decl ';' ';' '}' ;
    public final rulesetParser.pre_block_return pre_block() throws RecognitionException {
        rulesetParser.pre_block_return retval = new rulesetParser.pre_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal155=null;
        Token char_literal156=null;
        Token char_literal158=null;
        Token char_literal159=null;
        Token char_literal160=null;
        rulesetParser.decl_return decl157 = null;


        Object string_literal155_tree=null;
        Object char_literal156_tree=null;
        Object char_literal158_tree=null;
        Object char_literal159_tree=null;
        Object char_literal160_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "pre_block");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(205, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:205:10: ( 'pre' '{' decl ';' ';' '}' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:205:12: 'pre' '{' decl ';' ';' '}'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(205,12);
            string_literal155=(Token)match(input,64,FOLLOW_64_in_pre_block1489); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal155_tree = (Object)adaptor.create(string_literal155);
            adaptor.addChild(root_0, string_literal155_tree);
            }
            dbg.location(205,18);
            char_literal156=(Token)match(input,20,FOLLOW_20_in_pre_block1491); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal156_tree = (Object)adaptor.create(char_literal156);
            adaptor.addChild(root_0, char_literal156_tree);
            }
            dbg.location(205,22);
            pushFollow(FOLLOW_decl_in_pre_block1493);
            decl157=decl();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, decl157.getTree());
            dbg.location(205,27);
            char_literal158=(Token)match(input,24,FOLLOW_24_in_pre_block1495); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal158_tree = (Object)adaptor.create(char_literal158);
            adaptor.addChild(root_0, char_literal158_tree);
            }
            dbg.location(205,31);
            char_literal159=(Token)match(input,24,FOLLOW_24_in_pre_block1497); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal159_tree = (Object)adaptor.create(char_literal159);
            adaptor.addChild(root_0, char_literal159_tree);
            }
            dbg.location(205,35);
            char_literal160=(Token)match(input,21,FOLLOW_21_in_pre_block1499); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal160_tree = (Object)adaptor.create(char_literal160);
            adaptor.addChild(root_0, char_literal160_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(205, 38);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "pre_block");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "pre_block"

    public static class foreach_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "foreach"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:208:1: foreach : 'foreach' expr setting ;
    public final rulesetParser.foreach_return foreach() throws RecognitionException {
        rulesetParser.foreach_return retval = new rulesetParser.foreach_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal161=null;
        rulesetParser.expr_return expr162 = null;

        rulesetParser.setting_return setting163 = null;


        Object string_literal161_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "foreach");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(208, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:208:8: ( 'foreach' expr setting )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:209:2: 'foreach' expr setting
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(209,2);
            string_literal161=(Token)match(input,65,FOLLOW_65_in_foreach1519); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal161_tree = (Object)adaptor.create(string_literal161);
            adaptor.addChild(root_0, string_literal161_tree);
            }
            dbg.location(209,12);
            pushFollow(FOLLOW_expr_in_foreach1521);
            expr162=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr162.getTree());
            dbg.location(209,17);
            pushFollow(FOLLOW_setting_in_foreach1523);
            setting163=setting();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, setting163.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(210, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "foreach");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "foreach"

    public static class select_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "select"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:212:1: select : 'select' ( using | when ) foreach ;
    public final rulesetParser.select_return select() throws RecognitionException {
        rulesetParser.select_return retval = new rulesetParser.select_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal164=null;
        rulesetParser.using_return using165 = null;

        rulesetParser.when_return when166 = null;

        rulesetParser.foreach_return foreach167 = null;


        Object string_literal164_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "select");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(212, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:212:8: ( 'select' ( using | when ) foreach )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:212:10: 'select' ( using | when ) foreach
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(212,10);
            string_literal164=(Token)match(input,66,FOLLOW_66_in_select1542); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal164_tree = (Object)adaptor.create(string_literal164);
            adaptor.addChild(root_0, string_literal164_tree);
            }
            dbg.location(212,19);
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:212:19: ( using | when )
            int alt27=2;
            try { dbg.enterSubRule(27);
            try { dbg.enterDecision(27);

            int LA27_0 = input.LA(1);

            if ( (LA27_0==67) ) {
                alt27=1;
            }
            else if ( (LA27_0==68) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(27);}

            switch (alt27) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:212:20: using
                    {
                    dbg.location(212,20);
                    pushFollow(FOLLOW_using_in_select1545);
                    using165=using();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, using165.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:212:26: when
                    {
                    dbg.location(212,26);
                    pushFollow(FOLLOW_when_in_select1547);
                    when166=when();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, when166.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(27);}

            dbg.location(212,32);
            pushFollow(FOLLOW_foreach_in_select1550);
            foreach167=foreach();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, foreach167.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(213, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "select");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "select"

    public static class using_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "using"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:215:1: using : 'using' STRING setting ;
    public final rulesetParser.using_return using() throws RecognitionException {
        rulesetParser.using_return retval = new rulesetParser.using_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal168=null;
        Token STRING169=null;
        rulesetParser.setting_return setting170 = null;


        Object string_literal168_tree=null;
        Object STRING169_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "using");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(215, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:215:7: ( 'using' STRING setting )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:215:9: 'using' STRING setting
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(215,9);
            string_literal168=(Token)match(input,67,FOLLOW_67_in_using1563); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal168_tree = (Object)adaptor.create(string_literal168);
            adaptor.addChild(root_0, string_literal168_tree);
            }
            dbg.location(215,17);
            STRING169=(Token)match(input,STRING,FOLLOW_STRING_in_using1565); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING169_tree = (Object)adaptor.create(STRING169);
            adaptor.addChild(root_0, STRING169_tree);
            }
            dbg.location(215,24);
            pushFollow(FOLLOW_setting_in_using1567);
            setting170=setting();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, setting170.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(215, 31);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "using");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "using"

    public static class when_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "when"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:217:1: when : 'when' event_seq ;
    public final rulesetParser.when_return when() throws RecognitionException {
        rulesetParser.when_return retval = new rulesetParser.when_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal171=null;
        rulesetParser.event_seq_return event_seq172 = null;


        Object string_literal171_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "when");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(217, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:217:6: ( 'when' event_seq )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:217:7: 'when' event_seq
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(217,7);
            string_literal171=(Token)match(input,68,FOLLOW_68_in_when1574); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal171_tree = (Object)adaptor.create(string_literal171);
            adaptor.addChild(root_0, string_literal171_tree);
            }
            dbg.location(217,14);
            pushFollow(FOLLOW_event_seq_in_when1576);
            event_seq172=event_seq();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, event_seq172.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(217, 23);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "when");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "when"

    public static class event_seq_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "event_seq"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:219:1: event_seq options {backtrack=true; } : ( event_or 'then' | event_or 'before' | event_or );
    public final rulesetParser.event_seq_return event_seq() throws RecognitionException {
        rulesetParser.event_seq_return retval = new rulesetParser.event_seq_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal174=null;
        Token string_literal176=null;
        rulesetParser.event_or_return event_or173 = null;

        rulesetParser.event_or_return event_or175 = null;

        rulesetParser.event_or_return event_or177 = null;


        Object string_literal174_tree=null;
        Object string_literal176_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "event_seq");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(219, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:220:2: ( event_or 'then' | event_or 'before' | event_or )
            int alt28=3;
            try { dbg.enterDecision(28);

            switch ( input.LA(1) ) {
            case 78:
                {
                int LA28_1 = input.LA(2);

                if ( (synpred1_ruleset()) ) {
                    alt28=1;
                }
                else if ( (synpred2_ruleset()) ) {
                    alt28=2;
                }
                else if ( (true) ) {
                    alt28=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case ID:
                {
                int LA28_2 = input.LA(2);

                if ( (synpred1_ruleset()) ) {
                    alt28=1;
                }
                else if ( (synpred2_ruleset()) ) {
                    alt28=2;
                }
                else if ( (true) ) {
                    alt28=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case 57:
                {
                int LA28_3 = input.LA(2);

                if ( (synpred1_ruleset()) ) {
                    alt28=1;
                }
                else if ( (synpred2_ruleset()) ) {
                    alt28=2;
                }
                else if ( (true) ) {
                    alt28=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 3, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(28);}

            switch (alt28) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:220:4: event_or 'then'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(220,4);
                    pushFollow(FOLLOW_event_or_in_event_seq1597);
                    event_or173=event_or();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, event_or173.getTree());
                    dbg.location(220,13);
                    string_literal174=(Token)match(input,56,FOLLOW_56_in_event_seq1599); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal174_tree = (Object)adaptor.create(string_literal174);
                    adaptor.addChild(root_0, string_literal174_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:221:3: event_or 'before'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(221,3);
                    pushFollow(FOLLOW_event_or_in_event_seq1604);
                    event_or175=event_or();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, event_or175.getTree());
                    dbg.location(221,12);
                    string_literal176=(Token)match(input,69,FOLLOW_69_in_event_seq1606); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal176_tree = (Object)adaptor.create(string_literal176);
                    adaptor.addChild(root_0, string_literal176_tree);
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:222:3: event_or
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(222,3);
                    pushFollow(FOLLOW_event_or_in_event_seq1611);
                    event_or177=event_or();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, event_or177.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(223, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "event_seq");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "event_seq"

    public static class event_or_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "event_or"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:225:1: event_or : event_and ( 'or' event_and )* ;
    public final rulesetParser.event_or_return event_or() throws RecognitionException {
        rulesetParser.event_or_return retval = new rulesetParser.event_or_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal179=null;
        rulesetParser.event_and_return event_and178 = null;

        rulesetParser.event_and_return event_and180 = null;


        Object string_literal179_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "event_or");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(225, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:225:9: ( event_and ( 'or' event_and )* )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:225:11: event_and ( 'or' event_and )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(225,11);
            pushFollow(FOLLOW_event_and_in_event_or1622);
            event_and178=event_and();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, event_and178.getTree());
            dbg.location(225,21);
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:225:21: ( 'or' event_and )*
            try { dbg.enterSubRule(29);

            loop29:
            do {
                int alt29=2;
                try { dbg.enterDecision(29);

                int LA29_0 = input.LA(1);

                if ( (LA29_0==70) ) {
                    alt29=1;
                }


                } finally {dbg.exitDecision(29);}

                switch (alt29) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:225:22: 'or' event_and
            	    {
            	    dbg.location(225,22);
            	    string_literal179=(Token)match(input,70,FOLLOW_70_in_event_or1625); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal179_tree = (Object)adaptor.create(string_literal179);
            	    adaptor.addChild(root_0, string_literal179_tree);
            	    }
            	    dbg.location(225,27);
            	    pushFollow(FOLLOW_event_and_in_event_or1627);
            	    event_and180=event_and();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, event_and180.getTree());

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);
            } finally {dbg.exitSubRule(29);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(225, 38);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "event_or");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "event_or"

    public static class event_and_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "event_and"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:227:1: event_and : event_btwn ( 'and' event_btwn )* ;
    public final rulesetParser.event_and_return event_and() throws RecognitionException {
        rulesetParser.event_and_return retval = new rulesetParser.event_and_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal182=null;
        rulesetParser.event_btwn_return event_btwn181 = null;

        rulesetParser.event_btwn_return event_btwn183 = null;


        Object string_literal182_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "event_and");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(227, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:228:2: ( event_btwn ( 'and' event_btwn )* )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:228:4: event_btwn ( 'and' event_btwn )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(228,4);
            pushFollow(FOLLOW_event_btwn_in_event_and1638);
            event_btwn181=event_btwn();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, event_btwn181.getTree());
            dbg.location(228,15);
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:228:15: ( 'and' event_btwn )*
            try { dbg.enterSubRule(30);

            loop30:
            do {
                int alt30=2;
                try { dbg.enterDecision(30);

                int LA30_0 = input.LA(1);

                if ( (LA30_0==61) ) {
                    alt30=1;
                }


                } finally {dbg.exitDecision(30);}

                switch (alt30) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:228:16: 'and' event_btwn
            	    {
            	    dbg.location(228,16);
            	    string_literal182=(Token)match(input,61,FOLLOW_61_in_event_and1641); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal182_tree = (Object)adaptor.create(string_literal182);
            	    adaptor.addChild(root_0, string_literal182_tree);
            	    }
            	    dbg.location(228,22);
            	    pushFollow(FOLLOW_event_btwn_in_event_and1643);
            	    event_btwn183=event_btwn();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, event_btwn183.getTree());

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);
            } finally {dbg.exitSubRule(30);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(229, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "event_and");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "event_and"

    public static class event_btwn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "event_btwn"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:231:1: event_btwn : event_prim ( 'not' ) 'between' '(' event_seq ',' event_seq ')' ;
    public final rulesetParser.event_btwn_return event_btwn() throws RecognitionException {
        rulesetParser.event_btwn_return retval = new rulesetParser.event_btwn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal185=null;
        Token string_literal186=null;
        Token char_literal187=null;
        Token char_literal189=null;
        Token char_literal191=null;
        rulesetParser.event_prim_return event_prim184 = null;

        rulesetParser.event_seq_return event_seq188 = null;

        rulesetParser.event_seq_return event_seq190 = null;


        Object string_literal185_tree=null;
        Object string_literal186_tree=null;
        Object char_literal187_tree=null;
        Object char_literal189_tree=null;
        Object char_literal191_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "event_btwn");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(231, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:232:2: ( event_prim ( 'not' ) 'between' '(' event_seq ',' event_seq ')' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:232:4: event_prim ( 'not' ) 'between' '(' event_seq ',' event_seq ')'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(232,4);
            pushFollow(FOLLOW_event_prim_in_event_btwn1656);
            event_prim184=event_prim();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, event_prim184.getTree());
            dbg.location(232,15);
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:232:15: ( 'not' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:232:16: 'not'
            {
            dbg.location(232,16);
            string_literal185=(Token)match(input,71,FOLLOW_71_in_event_btwn1659); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal185_tree = (Object)adaptor.create(string_literal185);
            adaptor.addChild(root_0, string_literal185_tree);
            }

            }

            dbg.location(232,23);
            string_literal186=(Token)match(input,72,FOLLOW_72_in_event_btwn1662); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal186_tree = (Object)adaptor.create(string_literal186);
            adaptor.addChild(root_0, string_literal186_tree);
            }
            dbg.location(232,33);
            char_literal187=(Token)match(input,57,FOLLOW_57_in_event_btwn1664); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal187_tree = (Object)adaptor.create(char_literal187);
            adaptor.addChild(root_0, char_literal187_tree);
            }
            dbg.location(232,37);
            pushFollow(FOLLOW_event_seq_in_event_btwn1666);
            event_seq188=event_seq();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, event_seq188.getTree());
            dbg.location(232,47);
            char_literal189=(Token)match(input,58,FOLLOW_58_in_event_btwn1668); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal189_tree = (Object)adaptor.create(char_literal189);
            adaptor.addChild(root_0, char_literal189_tree);
            }
            dbg.location(232,51);
            pushFollow(FOLLOW_event_seq_in_event_btwn1670);
            event_seq190=event_seq();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, event_seq190.getTree());
            dbg.location(232,61);
            char_literal191=(Token)match(input,59,FOLLOW_59_in_event_btwn1672); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal191_tree = (Object)adaptor.create(char_literal191);
            adaptor.addChild(root_0, char_literal191_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(232, 64);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "event_btwn");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "event_btwn"

    public static class event_prim_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "event_prim"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:235:1: event_prim : ( event_domain 'pageview' ( STRING | REGEXP ) setting | event_domain ( 'submit' | 'click' | 'dblclick' | 'change' | 'update' ) STRING on_expr setting | ID ID event_filter setting | '(' event_seq ')' );
    public final rulesetParser.event_prim_return event_prim() throws RecognitionException {
        rulesetParser.event_prim_return retval = new rulesetParser.event_prim_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal193=null;
        Token set194=null;
        Token set197=null;
        Token STRING198=null;
        Token ID201=null;
        Token ID202=null;
        Token char_literal205=null;
        Token char_literal207=null;
        rulesetParser.event_domain_return event_domain192 = null;

        rulesetParser.setting_return setting195 = null;

        rulesetParser.event_domain_return event_domain196 = null;

        rulesetParser.on_expr_return on_expr199 = null;

        rulesetParser.setting_return setting200 = null;

        rulesetParser.event_filter_return event_filter203 = null;

        rulesetParser.setting_return setting204 = null;

        rulesetParser.event_seq_return event_seq206 = null;


        Object string_literal193_tree=null;
        Object set194_tree=null;
        Object set197_tree=null;
        Object STRING198_tree=null;
        Object ID201_tree=null;
        Object ID202_tree=null;
        Object char_literal205_tree=null;
        Object char_literal207_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "event_prim");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(235, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:236:2: ( event_domain 'pageview' ( STRING | REGEXP ) setting | event_domain ( 'submit' | 'click' | 'dblclick' | 'change' | 'update' ) STRING on_expr setting | ID ID event_filter setting | '(' event_seq ')' )
            int alt31=4;
            try { dbg.enterDecision(31);

            switch ( input.LA(1) ) {
            case 78:
                {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==73) ) {
                    alt31=1;
                }
                else if ( ((LA31_1>=33 && LA31_1<=34)||(LA31_1>=74 && LA31_1<=76)) ) {
                    alt31=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case ID:
                {
                alt31=3;
                }
                break;
            case 57:
                {
                alt31=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(31);}

            switch (alt31) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:236:4: event_domain 'pageview' ( STRING | REGEXP ) setting
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(236,4);
                    pushFollow(FOLLOW_event_domain_in_event_prim1687);
                    event_domain192=event_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, event_domain192.getTree());
                    dbg.location(236,17);
                    string_literal193=(Token)match(input,73,FOLLOW_73_in_event_prim1689); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal193_tree = (Object)adaptor.create(string_literal193);
                    adaptor.addChild(root_0, string_literal193_tree);
                    }
                    dbg.location(236,28);
                    set194=(Token)input.LT(1);
                    if ( input.LA(1)==STRING||input.LA(1)==REGEXP ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set194));
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(236,44);
                    pushFollow(FOLLOW_setting_in_event_prim1697);
                    setting195=setting();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, setting195.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:237:2: event_domain ( 'submit' | 'click' | 'dblclick' | 'change' | 'update' ) STRING on_expr setting
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(237,2);
                    pushFollow(FOLLOW_event_domain_in_event_prim1702);
                    event_domain196=event_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, event_domain196.getTree());
                    dbg.location(237,15);
                    set197=(Token)input.LT(1);
                    if ( (input.LA(1)>=33 && input.LA(1)<=34)||(input.LA(1)>=74 && input.LA(1)<=76) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set197));
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(237,63);
                    STRING198=(Token)match(input,STRING,FOLLOW_STRING_in_event_prim1716); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING198_tree = (Object)adaptor.create(STRING198);
                    adaptor.addChild(root_0, STRING198_tree);
                    }
                    dbg.location(237,70);
                    pushFollow(FOLLOW_on_expr_in_event_prim1718);
                    on_expr199=on_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, on_expr199.getTree());
                    dbg.location(237,79);
                    pushFollow(FOLLOW_setting_in_event_prim1721);
                    setting200=setting();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, setting200.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:238:2: ID ID event_filter setting
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(238,2);
                    ID201=(Token)match(input,ID,FOLLOW_ID_in_event_prim1726); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID201_tree = (Object)adaptor.create(ID201);
                    adaptor.addChild(root_0, ID201_tree);
                    }
                    dbg.location(238,5);
                    ID202=(Token)match(input,ID,FOLLOW_ID_in_event_prim1728); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID202_tree = (Object)adaptor.create(ID202);
                    adaptor.addChild(root_0, ID202_tree);
                    }
                    dbg.location(238,8);
                    pushFollow(FOLLOW_event_filter_in_event_prim1730);
                    event_filter203=event_filter();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, event_filter203.getTree());
                    dbg.location(238,21);
                    pushFollow(FOLLOW_setting_in_event_prim1732);
                    setting204=setting();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, setting204.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:239:2: '(' event_seq ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(239,2);
                    char_literal205=(Token)match(input,57,FOLLOW_57_in_event_prim1737); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal205_tree = (Object)adaptor.create(char_literal205);
                    adaptor.addChild(root_0, char_literal205_tree);
                    }
                    dbg.location(239,6);
                    pushFollow(FOLLOW_event_seq_in_event_prim1739);
                    event_seq206=event_seq();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, event_seq206.getTree());
                    dbg.location(239,16);
                    char_literal207=(Token)match(input,59,FOLLOW_59_in_event_prim1741); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal207_tree = (Object)adaptor.create(char_literal207);
                    adaptor.addChild(root_0, char_literal207_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(240, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "event_prim");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "event_prim"

    public static class setting_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "setting"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:242:1: setting : 'setting' '(' ID ',' ')' ;
    public final rulesetParser.setting_return setting() throws RecognitionException {
        rulesetParser.setting_return retval = new rulesetParser.setting_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal208=null;
        Token char_literal209=null;
        Token ID210=null;
        Token char_literal211=null;
        Token char_literal212=null;

        Object string_literal208_tree=null;
        Object char_literal209_tree=null;
        Object ID210_tree=null;
        Object char_literal211_tree=null;
        Object char_literal212_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "setting");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(242, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:242:9: ( 'setting' '(' ID ',' ')' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:242:11: 'setting' '(' ID ',' ')'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(242,11);
            string_literal208=(Token)match(input,77,FOLLOW_77_in_setting1752); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal208_tree = (Object)adaptor.create(string_literal208);
            adaptor.addChild(root_0, string_literal208_tree);
            }
            dbg.location(242,21);
            char_literal209=(Token)match(input,57,FOLLOW_57_in_setting1754); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal209_tree = (Object)adaptor.create(char_literal209);
            adaptor.addChild(root_0, char_literal209_tree);
            }
            dbg.location(242,25);
            ID210=(Token)match(input,ID,FOLLOW_ID_in_setting1756); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID210_tree = (Object)adaptor.create(ID210);
            adaptor.addChild(root_0, ID210_tree);
            }
            dbg.location(242,28);
            char_literal211=(Token)match(input,58,FOLLOW_58_in_setting1758); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal211_tree = (Object)adaptor.create(char_literal211);
            adaptor.addChild(root_0, char_literal211_tree);
            }
            dbg.location(242,32);
            char_literal212=(Token)match(input,59,FOLLOW_59_in_setting1760); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal212_tree = (Object)adaptor.create(char_literal212);
            adaptor.addChild(root_0, char_literal212_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(242, 35);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "setting");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "setting"

    public static class event_domain_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "event_domain"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:244:1: event_domain : 'web' ;
    public final rulesetParser.event_domain_return event_domain() throws RecognitionException {
        rulesetParser.event_domain_return retval = new rulesetParser.event_domain_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal213=null;

        Object string_literal213_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "event_domain");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(244, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:245:2: ( 'web' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:245:4: 'web'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(245,4);
            string_literal213=(Token)match(input,78,FOLLOW_78_in_event_domain1770); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal213_tree = (Object)adaptor.create(string_literal213);
            adaptor.addChild(root_0, string_literal213_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(246, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "event_domain");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "event_domain"

    public static class event_filter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "event_filter"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:248:1: event_filter : ID ( STRING | REGEXP ) ;
    public final rulesetParser.event_filter_return event_filter() throws RecognitionException {
        rulesetParser.event_filter_return retval = new rulesetParser.event_filter_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID214=null;
        Token set215=null;

        Object ID214_tree=null;
        Object set215_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "event_filter");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(248, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:249:2: ( ID ( STRING | REGEXP ) )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:249:4: ID ( STRING | REGEXP )
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(249,4);
            ID214=(Token)match(input,ID,FOLLOW_ID_in_event_filter1784); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID214_tree = (Object)adaptor.create(ID214);
            adaptor.addChild(root_0, ID214_tree);
            }
            dbg.location(249,7);
            set215=(Token)input.LT(1);
            if ( input.LA(1)==STRING||input.LA(1)==REGEXP ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set215));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(250, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "event_filter");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "event_filter"

    public static class on_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "on_expr"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:252:1: on_expr : 'on' ( STRING | REGEXP ) ;
    public final rulesetParser.on_expr_return on_expr() throws RecognitionException {
        rulesetParser.on_expr_return retval = new rulesetParser.on_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal216=null;
        Token set217=null;

        Object string_literal216_tree=null;
        Object set217_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "on_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(252, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:252:9: ( 'on' ( STRING | REGEXP ) )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:252:11: 'on' ( STRING | REGEXP )
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(252,11);
            string_literal216=(Token)match(input,79,FOLLOW_79_in_on_expr1804); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal216_tree = (Object)adaptor.create(string_literal216);
            adaptor.addChild(root_0, string_literal216_tree);
            }
            dbg.location(252,16);
            set217=(Token)input.LT(1);
            if ( input.LA(1)==STRING||input.LA(1)==REGEXP ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set217));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(253, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "on_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "on_expr"

    public static class global_decls_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "global_decls"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:256:1: global_decls : 'global' '{' ( global ';' )+ '}' ;
    public final rulesetParser.global_decls_return global_decls() throws RecognitionException {
        rulesetParser.global_decls_return retval = new rulesetParser.global_decls_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal218=null;
        Token char_literal219=null;
        Token char_literal221=null;
        Token char_literal222=null;
        rulesetParser.global_return global220 = null;


        Object string_literal218_tree=null;
        Object char_literal219_tree=null;
        Object char_literal221_tree=null;
        Object char_literal222_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "global_decls");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(256, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:257:2: ( 'global' '{' ( global ';' )+ '}' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:257:4: 'global' '{' ( global ';' )+ '}'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(257,4);
            string_literal218=(Token)match(input,80,FOLLOW_80_in_global_decls1830); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal218_tree = (Object)adaptor.create(string_literal218);
            adaptor.addChild(root_0, string_literal218_tree);
            }
            dbg.location(257,13);
            char_literal219=(Token)match(input,20,FOLLOW_20_in_global_decls1832); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal219_tree = (Object)adaptor.create(char_literal219);
            adaptor.addChild(root_0, char_literal219_tree);
            }
            dbg.location(257,17);
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:257:17: ( global ';' )+
            int cnt32=0;
            try { dbg.enterSubRule(32);

            loop32:
            do {
                int alt32=2;
                try { dbg.enterDecision(32);

                int LA32_0 = input.LA(1);

                if ( (LA32_0==ID||LA32_0==81||LA32_0==83||(LA32_0>=136 && LA32_0<=137)) ) {
                    alt32=1;
                }


                } finally {dbg.exitDecision(32);}

                switch (alt32) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:257:19: global ';'
            	    {
            	    dbg.location(257,19);
            	    pushFollow(FOLLOW_global_in_global_decls1836);
            	    global220=global();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, global220.getTree());
            	    dbg.location(257,26);
            	    char_literal221=(Token)match(input,24,FOLLOW_24_in_global_decls1838); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal221_tree = (Object)adaptor.create(char_literal221);
            	    adaptor.addChild(root_0, char_literal221_tree);
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt32 >= 1 ) break loop32;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt32++;
            } while (true);
            } finally {dbg.exitSubRule(32);}

            dbg.location(257,33);
            char_literal222=(Token)match(input,21,FOLLOW_21_in_global_decls1843); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal222_tree = (Object)adaptor.create(char_literal222);
            adaptor.addChild(root_0, char_literal222_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(258, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "global_decls");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "global_decls"

    public static class global_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "global"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:260:1: global : ( emit_block | dataset | datasource | css_emit | decl );
    public final rulesetParser.global_return global() throws RecognitionException {
        rulesetParser.global_return retval = new rulesetParser.global_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        rulesetParser.emit_block_return emit_block223 = null;

        rulesetParser.dataset_return dataset224 = null;

        rulesetParser.datasource_return datasource225 = null;

        rulesetParser.css_emit_return css_emit226 = null;

        rulesetParser.decl_return decl227 = null;



        try { dbg.enterRule(getGrammarFileName(), "global");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(260, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:260:9: ( emit_block | dataset | datasource | css_emit | decl )
            int alt33=5;
            try { dbg.enterDecision(33);

            switch ( input.LA(1) ) {
            case 136:
                {
                alt33=1;
                }
                break;
            case 137:
                {
                alt33=2;
                }
                break;
            case 81:
                {
                alt33=3;
                }
                break;
            case 83:
                {
                alt33=4;
                }
                break;
            case ID:
                {
                alt33=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(33);}

            switch (alt33) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:260:11: emit_block
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(260,11);
                    pushFollow(FOLLOW_emit_block_in_global1859);
                    emit_block223=emit_block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, emit_block223.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:260:24: dataset
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(260,24);
                    pushFollow(FOLLOW_dataset_in_global1863);
                    dataset224=dataset();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dataset224.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:260:34: datasource
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(260,34);
                    pushFollow(FOLLOW_datasource_in_global1867);
                    datasource225=datasource();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, datasource225.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:260:47: css_emit
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(260,47);
                    pushFollow(FOLLOW_css_emit_in_global1871);
                    css_emit226=css_emit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, css_emit226.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:260:58: decl
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(260,58);
                    pushFollow(FOLLOW_decl_in_global1875);
                    decl227=decl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, decl227.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(261, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "global");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "global"

    public static class datasource_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "datasource"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:263:1: datasource : 'datasource' ID ( datatype )? '<-' STRING cachable ;
    public final rulesetParser.datasource_return datasource() throws RecognitionException {
        rulesetParser.datasource_return retval = new rulesetParser.datasource_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal228=null;
        Token ID229=null;
        Token string_literal231=null;
        Token STRING232=null;
        rulesetParser.datatype_return datatype230 = null;

        rulesetParser.cachable_return cachable233 = null;


        Object string_literal228_tree=null;
        Object ID229_tree=null;
        Object string_literal231_tree=null;
        Object STRING232_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "datasource");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(263, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:264:2: ( 'datasource' ID ( datatype )? '<-' STRING cachable )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:264:5: 'datasource' ID ( datatype )? '<-' STRING cachable
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(264,5);
            string_literal228=(Token)match(input,81,FOLLOW_81_in_datasource1887); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal228_tree = (Object)adaptor.create(string_literal228);
            adaptor.addChild(root_0, string_literal228_tree);
            }
            dbg.location(264,18);
            ID229=(Token)match(input,ID,FOLLOW_ID_in_datasource1889); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID229_tree = (Object)adaptor.create(ID229);
            adaptor.addChild(root_0, ID229_tree);
            }
            dbg.location(264,21);
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:264:21: ( datatype )?
            int alt34=2;
            try { dbg.enterSubRule(34);
            try { dbg.enterDecision(34);

            int LA34_0 = input.LA(1);

            if ( (LA34_0==38) ) {
                alt34=1;
            }
            } finally {dbg.exitDecision(34);}

            switch (alt34) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:264:21: datatype
                    {
                    dbg.location(264,21);
                    pushFollow(FOLLOW_datatype_in_datasource1891);
                    datatype230=datatype();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, datatype230.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(34);}

            dbg.location(264,31);
            string_literal231=(Token)match(input,82,FOLLOW_82_in_datasource1894); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal231_tree = (Object)adaptor.create(string_literal231);
            adaptor.addChild(root_0, string_literal231_tree);
            }
            dbg.location(264,36);
            STRING232=(Token)match(input,STRING,FOLLOW_STRING_in_datasource1896); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING232_tree = (Object)adaptor.create(STRING232);
            adaptor.addChild(root_0, STRING232_tree);
            }
            dbg.location(264,43);
            pushFollow(FOLLOW_cachable_in_datasource1898);
            cachable233=cachable();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cachable233.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(265, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "datasource");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "datasource"

    public static class css_emit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "css_emit"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:267:1: css_emit : 'css' ( HTML | STRING ) ;
    public final rulesetParser.css_emit_return css_emit() throws RecognitionException {
        rulesetParser.css_emit_return retval = new rulesetParser.css_emit_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal234=null;
        Token set235=null;

        Object string_literal234_tree=null;
        Object set235_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "css_emit");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(267, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:268:2: ( 'css' ( HTML | STRING ) )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:268:4: 'css' ( HTML | STRING )
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(268,4);
            string_literal234=(Token)match(input,83,FOLLOW_83_in_css_emit1910); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal234_tree = (Object)adaptor.create(string_literal234);
            adaptor.addChild(root_0, string_literal234_tree);
            }
            dbg.location(268,10);
            set235=(Token)input.LT(1);
            if ( input.LA(1)==STRING||input.LA(1)==HTML ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set235));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(269, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "css_emit");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "css_emit"

    public static class decl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "decl"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:271:1: decl options {backtrack=true; } : ( ID '=' HTML | ID '=' JS | ID '=' expr );
    public final rulesetParser.decl_return decl() throws RecognitionException {
        rulesetParser.decl_return retval = new rulesetParser.decl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID236=null;
        Token char_literal237=null;
        Token HTML238=null;
        Token ID239=null;
        Token char_literal240=null;
        Token JS241=null;
        Token ID242=null;
        Token char_literal243=null;
        rulesetParser.expr_return expr244 = null;


        Object ID236_tree=null;
        Object char_literal237_tree=null;
        Object HTML238_tree=null;
        Object ID239_tree=null;
        Object char_literal240_tree=null;
        Object JS241_tree=null;
        Object ID242_tree=null;
        Object char_literal243_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "decl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(271, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:271:39: ( ID '=' HTML | ID '=' JS | ID '=' expr )
            int alt35=3;
            try { dbg.enterDecision(35);

            int LA35_0 = input.LA(1);

            if ( (LA35_0==ID) ) {
                int LA35_1 = input.LA(2);

                if ( (LA35_1==35) ) {
                    switch ( input.LA(3) ) {
                    case HTML:
                        {
                        alt35=1;
                        }
                        break;
                    case JS:
                        {
                        alt35=2;
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
                        alt35=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 2, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(35);}

            switch (alt35) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:272:2: ID '=' HTML
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(272,2);
                    ID236=(Token)match(input,ID,FOLLOW_ID_in_decl1946); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID236_tree = (Object)adaptor.create(ID236);
                    adaptor.addChild(root_0, ID236_tree);
                    }
                    dbg.location(272,5);
                    char_literal237=(Token)match(input,35,FOLLOW_35_in_decl1948); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal237_tree = (Object)adaptor.create(char_literal237);
                    adaptor.addChild(root_0, char_literal237_tree);
                    }
                    dbg.location(272,9);
                    HTML238=(Token)match(input,HTML,FOLLOW_HTML_in_decl1950); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    HTML238_tree = (Object)adaptor.create(HTML238);
                    adaptor.addChild(root_0, HTML238_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:273:2: ID '=' JS
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(273,2);
                    ID239=(Token)match(input,ID,FOLLOW_ID_in_decl1955); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID239_tree = (Object)adaptor.create(ID239);
                    adaptor.addChild(root_0, ID239_tree);
                    }
                    dbg.location(273,5);
                    char_literal240=(Token)match(input,35,FOLLOW_35_in_decl1957); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal240_tree = (Object)adaptor.create(char_literal240);
                    adaptor.addChild(root_0, char_literal240_tree);
                    }
                    dbg.location(273,9);
                    JS241=(Token)match(input,JS,FOLLOW_JS_in_decl1959); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    JS241_tree = (Object)adaptor.create(JS241);
                    adaptor.addChild(root_0, JS241_tree);
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:274:2: ID '=' expr
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(274,2);
                    ID242=(Token)match(input,ID,FOLLOW_ID_in_decl1964); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID242_tree = (Object)adaptor.create(ID242);
                    adaptor.addChild(root_0, ID242_tree);
                    }
                    dbg.location(274,5);
                    char_literal243=(Token)match(input,35,FOLLOW_35_in_decl1966); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal243_tree = (Object)adaptor.create(char_literal243);
                    adaptor.addChild(root_0, char_literal243_tree);
                    }
                    dbg.location(274,9);
                    pushFollow(FOLLOW_expr_in_decl1968);
                    expr244=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr244.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(275, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "decl");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "decl"

    public static class expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:279:1: expr options {backtrack=true; } : ( function_def | conditional_expression );
    public final rulesetParser.expr_return expr() throws RecognitionException {
        rulesetParser.expr_return retval = new rulesetParser.expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        rulesetParser.function_def_return function_def245 = null;

        rulesetParser.conditional_expression_return conditional_expression246 = null;



        try { dbg.enterRule(getGrammarFileName(), "expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(279, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:279:36: ( function_def | conditional_expression )
            int alt36=2;
            try { dbg.enterDecision(36);

            int LA36_0 = input.LA(1);

            if ( (LA36_0==84) ) {
                alt36=1;
            }
            else if ( ((LA36_0>=ID && LA36_0<=INT)||LA36_0==STRING||LA36_0==REGEXP||LA36_0==20||LA36_0==57||LA36_0==71||LA36_0==98||LA36_0==102||(LA36_0>=104 && LA36_0<=106)||(LA36_0>=108 && LA36_0<=109)||(LA36_0>=134 && LA36_0<=135)) ) {
                alt36=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(36);}

            switch (alt36) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:279:38: function_def
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(279,38);
                    pushFollow(FOLLOW_function_def_in_expr1998);
                    function_def245=function_def();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_def245.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:279:53: conditional_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(279,53);
                    pushFollow(FOLLOW_conditional_expression_in_expr2002);
                    conditional_expression246=conditional_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditional_expression246.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(280, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "expr"

    public static class function_def_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function_def"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:282:1: function_def options {backtrack=true; } : 'function' '(' ( ID ( ',' )? )* ')' '{' ( fundecls )* expr ( ';' )? '}' ;
    public final rulesetParser.function_def_return function_def() throws RecognitionException {
        rulesetParser.function_def_return retval = new rulesetParser.function_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal247=null;
        Token char_literal248=null;
        Token ID249=null;
        Token char_literal250=null;
        Token char_literal251=null;
        Token char_literal252=null;
        Token char_literal255=null;
        Token char_literal256=null;
        rulesetParser.fundecls_return fundecls253 = null;

        rulesetParser.expr_return expr254 = null;


        Object string_literal247_tree=null;
        Object char_literal248_tree=null;
        Object ID249_tree=null;
        Object char_literal250_tree=null;
        Object char_literal251_tree=null;
        Object char_literal252_tree=null;
        Object char_literal255_tree=null;
        Object char_literal256_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "function_def");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(282, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:283:2: ( 'function' '(' ( ID ( ',' )? )* ')' '{' ( fundecls )* expr ( ';' )? '}' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:283:4: 'function' '(' ( ID ( ',' )? )* ')' '{' ( fundecls )* expr ( ';' )? '}'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(283,4);
            string_literal247=(Token)match(input,84,FOLLOW_84_in_function_def2027); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal247_tree = (Object)adaptor.create(string_literal247);
            adaptor.addChild(root_0, string_literal247_tree);
            }
            dbg.location(283,15);
            char_literal248=(Token)match(input,57,FOLLOW_57_in_function_def2029); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal248_tree = (Object)adaptor.create(char_literal248);
            adaptor.addChild(root_0, char_literal248_tree);
            }
            dbg.location(283,19);
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:283:19: ( ID ( ',' )? )*
            try { dbg.enterSubRule(38);

            loop38:
            do {
                int alt38=2;
                try { dbg.enterDecision(38);

                int LA38_0 = input.LA(1);

                if ( (LA38_0==ID) ) {
                    alt38=1;
                }


                } finally {dbg.exitDecision(38);}

                switch (alt38) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:283:20: ID ( ',' )?
            	    {
            	    dbg.location(283,20);
            	    ID249=(Token)match(input,ID,FOLLOW_ID_in_function_def2032); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    ID249_tree = (Object)adaptor.create(ID249);
            	    adaptor.addChild(root_0, ID249_tree);
            	    }
            	    dbg.location(283,23);
            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:283:23: ( ',' )?
            	    int alt37=2;
            	    try { dbg.enterSubRule(37);
            	    try { dbg.enterDecision(37);

            	    int LA37_0 = input.LA(1);

            	    if ( (LA37_0==58) ) {
            	        alt37=1;
            	    }
            	    } finally {dbg.exitDecision(37);}

            	    switch (alt37) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:283:23: ','
            	            {
            	            dbg.location(283,23);
            	            char_literal250=(Token)match(input,58,FOLLOW_58_in_function_def2034); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal250_tree = (Object)adaptor.create(char_literal250);
            	            adaptor.addChild(root_0, char_literal250_tree);
            	            }

            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(37);}


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);
            } finally {dbg.exitSubRule(38);}

            dbg.location(283,30);
            char_literal251=(Token)match(input,59,FOLLOW_59_in_function_def2039); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal251_tree = (Object)adaptor.create(char_literal251);
            adaptor.addChild(root_0, char_literal251_tree);
            }
            dbg.location(283,34);
            char_literal252=(Token)match(input,20,FOLLOW_20_in_function_def2041); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal252_tree = (Object)adaptor.create(char_literal252);
            adaptor.addChild(root_0, char_literal252_tree);
            }
            dbg.location(283,38);
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:283:38: ( fundecls )*
            try { dbg.enterSubRule(39);

            loop39:
            do {
                int alt39=2;
                try { dbg.enterDecision(39);

                int LA39_0 = input.LA(1);

                if ( (LA39_0==ID) ) {
                    int LA39_2 = input.LA(2);

                    if ( (LA39_2==35) ) {
                        alt39=1;
                    }


                }


                } finally {dbg.exitDecision(39);}

                switch (alt39) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:283:38: fundecls
            	    {
            	    dbg.location(283,38);
            	    pushFollow(FOLLOW_fundecls_in_function_def2043);
            	    fundecls253=fundecls();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, fundecls253.getTree());

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);
            } finally {dbg.exitSubRule(39);}

            dbg.location(283,48);
            pushFollow(FOLLOW_expr_in_function_def2046);
            expr254=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr254.getTree());
            dbg.location(283,53);
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:283:53: ( ';' )?
            int alt40=2;
            try { dbg.enterSubRule(40);
            try { dbg.enterDecision(40);

            int LA40_0 = input.LA(1);

            if ( (LA40_0==24) ) {
                alt40=1;
            }
            } finally {dbg.exitDecision(40);}

            switch (alt40) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:283:53: ';'
                    {
                    dbg.location(283,53);
                    char_literal255=(Token)match(input,24,FOLLOW_24_in_function_def2048); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal255_tree = (Object)adaptor.create(char_literal255);
                    adaptor.addChild(root_0, char_literal255_tree);
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(40);}

            dbg.location(283,58);
            char_literal256=(Token)match(input,21,FOLLOW_21_in_function_def2051); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal256_tree = (Object)adaptor.create(char_literal256);
            adaptor.addChild(root_0, char_literal256_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(284, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "function_def");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "function_def"

    public static class fundecls_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fundecls"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:286:1: fundecls options {backtrack=true; } : decl ';' ;
    public final rulesetParser.fundecls_return fundecls() throws RecognitionException {
        rulesetParser.fundecls_return retval = new rulesetParser.fundecls_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal258=null;
        rulesetParser.decl_return decl257 = null;


        Object char_literal258_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "fundecls");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(286, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:287:2: ( decl ';' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:287:4: decl ';'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(287,4);
            pushFollow(FOLLOW_decl_in_fundecls2075);
            decl257=decl();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, decl257.getTree());
            dbg.location(287,9);
            char_literal258=(Token)match(input,24,FOLLOW_24_in_fundecls2077); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal258_tree = (Object)adaptor.create(char_literal258);
            adaptor.addChild(root_0, char_literal258_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(288, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "fundecls");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "fundecls"

    public static class conditional_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditional_expression"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:292:1: conditional_expression options {backtrack=true; } : ( disjunction '=>' expr '|' expr | disjunction );
    public final rulesetParser.conditional_expression_return conditional_expression() throws RecognitionException {
        rulesetParser.conditional_expression_return retval = new rulesetParser.conditional_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal260=null;
        Token char_literal262=null;
        rulesetParser.disjunction_return disjunction259 = null;

        rulesetParser.expr_return expr261 = null;

        rulesetParser.expr_return expr263 = null;

        rulesetParser.disjunction_return disjunction264 = null;


        Object string_literal260_tree=null;
        Object char_literal262_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "conditional_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(292, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:293:2: ( disjunction '=>' expr '|' expr | disjunction )
            int alt41=2;
            try { dbg.enterDecision(41);

            try {
                isCyclicDecision = true;
                alt41 = dfa41.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(41);}

            switch (alt41) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:293:4: disjunction '=>' expr '|' expr
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(293,4);
                    pushFollow(FOLLOW_disjunction_in_conditional_expression2103);
                    disjunction259=disjunction();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, disjunction259.getTree());
                    dbg.location(293,16);
                    string_literal260=(Token)match(input,60,FOLLOW_60_in_conditional_expression2105); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal260_tree = (Object)adaptor.create(string_literal260);
                    adaptor.addChild(root_0, string_literal260_tree);
                    }
                    dbg.location(293,21);
                    pushFollow(FOLLOW_expr_in_conditional_expression2107);
                    expr261=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr261.getTree());
                    dbg.location(293,26);
                    char_literal262=(Token)match(input,85,FOLLOW_85_in_conditional_expression2109); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal262_tree = (Object)adaptor.create(char_literal262);
                    adaptor.addChild(root_0, char_literal262_tree);
                    }
                    dbg.location(293,30);
                    pushFollow(FOLLOW_expr_in_conditional_expression2111);
                    expr263=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr263.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:293:37: disjunction
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(293,37);
                    pushFollow(FOLLOW_disjunction_in_conditional_expression2115);
                    disjunction264=disjunction();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, disjunction264.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(294, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "conditional_expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "conditional_expression"

    public static class disjunction_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "disjunction"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:296:1: disjunction : conjunction ( '||' conjunction )* ;
    public final rulesetParser.disjunction_return disjunction() throws RecognitionException {
        rulesetParser.disjunction_return retval = new rulesetParser.disjunction_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal266=null;
        rulesetParser.conjunction_return conjunction265 = null;

        rulesetParser.conjunction_return conjunction267 = null;


        Object string_literal266_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "disjunction");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(296, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:297:2: ( conjunction ( '||' conjunction )* )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:297:4: conjunction ( '||' conjunction )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(297,4);
            pushFollow(FOLLOW_conjunction_in_disjunction2128);
            conjunction265=conjunction();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conjunction265.getTree());
            dbg.location(297,16);
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:297:16: ( '||' conjunction )*
            try { dbg.enterSubRule(42);

            loop42:
            do {
                int alt42=2;
                try { dbg.enterDecision(42);

                int LA42_0 = input.LA(1);

                if ( (LA42_0==86) ) {
                    alt42=1;
                }


                } finally {dbg.exitDecision(42);}

                switch (alt42) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:297:17: '||' conjunction
            	    {
            	    dbg.location(297,17);
            	    string_literal266=(Token)match(input,86,FOLLOW_86_in_disjunction2131); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal266_tree = (Object)adaptor.create(string_literal266);
            	    adaptor.addChild(root_0, string_literal266_tree);
            	    }
            	    dbg.location(297,22);
            	    pushFollow(FOLLOW_conjunction_in_disjunction2133);
            	    conjunction267=conjunction();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, conjunction267.getTree());

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);
            } finally {dbg.exitSubRule(42);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(298, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "disjunction");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "disjunction"

    public static class conjunction_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conjunction"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:300:1: conjunction : equality_expr ( '&&' equality_expr )* ;
    public final rulesetParser.conjunction_return conjunction() throws RecognitionException {
        rulesetParser.conjunction_return retval = new rulesetParser.conjunction_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal269=null;
        rulesetParser.equality_expr_return equality_expr268 = null;

        rulesetParser.equality_expr_return equality_expr270 = null;


        Object string_literal269_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "conjunction");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(300, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:301:2: ( equality_expr ( '&&' equality_expr )* )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:301:4: equality_expr ( '&&' equality_expr )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(301,4);
            pushFollow(FOLLOW_equality_expr_in_conjunction2149);
            equality_expr268=equality_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equality_expr268.getTree());
            dbg.location(301,18);
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:301:18: ( '&&' equality_expr )*
            try { dbg.enterSubRule(43);

            loop43:
            do {
                int alt43=2;
                try { dbg.enterDecision(43);

                int LA43_0 = input.LA(1);

                if ( (LA43_0==87) ) {
                    alt43=1;
                }


                } finally {dbg.exitDecision(43);}

                switch (alt43) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:301:19: '&&' equality_expr
            	    {
            	    dbg.location(301,19);
            	    string_literal269=(Token)match(input,87,FOLLOW_87_in_conjunction2152); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal269_tree = (Object)adaptor.create(string_literal269);
            	    adaptor.addChild(root_0, string_literal269_tree);
            	    }
            	    dbg.location(301,24);
            	    pushFollow(FOLLOW_equality_expr_in_conjunction2154);
            	    equality_expr270=equality_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, equality_expr270.getTree());

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);
            } finally {dbg.exitSubRule(43);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(302, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "conjunction");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "conjunction"

    public static class equality_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equality_expr"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:304:1: equality_expr : add_expr ( predop add_expr )* ;
    public final rulesetParser.equality_expr_return equality_expr() throws RecognitionException {
        rulesetParser.equality_expr_return retval = new rulesetParser.equality_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        rulesetParser.add_expr_return add_expr271 = null;

        rulesetParser.predop_return predop272 = null;

        rulesetParser.add_expr_return add_expr273 = null;



        try { dbg.enterRule(getGrammarFileName(), "equality_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(304, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:305:2: ( add_expr ( predop add_expr )* )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:305:4: add_expr ( predop add_expr )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(305,4);
            pushFollow(FOLLOW_add_expr_in_equality_expr2169);
            add_expr271=add_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, add_expr271.getTree());
            dbg.location(305,13);
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:305:13: ( predop add_expr )*
            try { dbg.enterSubRule(44);

            loop44:
            do {
                int alt44=2;
                try { dbg.enterDecision(44);

                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=88 && LA44_0<=96)) ) {
                    alt44=1;
                }


                } finally {dbg.exitDecision(44);}

                switch (alt44) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:305:14: predop add_expr
            	    {
            	    dbg.location(305,14);
            	    pushFollow(FOLLOW_predop_in_equality_expr2172);
            	    predop272=predop();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, predop272.getTree());
            	    dbg.location(305,21);
            	    pushFollow(FOLLOW_add_expr_in_equality_expr2174);
            	    add_expr273=add_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, add_expr273.getTree());

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);
            } finally {dbg.exitSubRule(44);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(306, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "equality_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "equality_expr"

    public static class predop_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "predop"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:308:1: predop : ( '<=' | '>=' | '<' | '>' | '==' | '!=' | 'eq' | 'neq' | 'like' );
    public final rulesetParser.predop_return predop() throws RecognitionException {
        rulesetParser.predop_return retval = new rulesetParser.predop_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set274=null;

        Object set274_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "predop");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(308, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:308:7: ( '<=' | '>=' | '<' | '>' | '==' | '!=' | 'eq' | 'neq' | 'like' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(308,7);
            set274=(Token)input.LT(1);
            if ( (input.LA(1)>=88 && input.LA(1)<=96) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set274));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(308, 70);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "predop");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "predop"

    public static class add_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "add_expr"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:310:1: add_expr : mult_expr ( add_op mult_expr )* ;
    public final rulesetParser.add_expr_return add_expr() throws RecognitionException {
        rulesetParser.add_expr_return retval = new rulesetParser.add_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        rulesetParser.mult_expr_return mult_expr275 = null;

        rulesetParser.add_op_return add_op276 = null;

        rulesetParser.mult_expr_return mult_expr277 = null;



        try { dbg.enterRule(getGrammarFileName(), "add_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(310, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:310:9: ( mult_expr ( add_op mult_expr )* )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:310:11: mult_expr ( add_op mult_expr )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(310,11);
            pushFollow(FOLLOW_mult_expr_in_add_expr2228);
            mult_expr275=mult_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, mult_expr275.getTree());
            dbg.location(310,21);
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:310:21: ( add_op mult_expr )*
            try { dbg.enterSubRule(45);

            loop45:
            do {
                int alt45=2;
                try { dbg.enterDecision(45);

                int LA45_0 = input.LA(1);

                if ( (LA45_0==98) ) {
                    int LA45_2 = input.LA(2);

                    if ( ((LA45_2>=ID && LA45_2<=INT)||LA45_2==STRING||LA45_2==REGEXP||LA45_2==20||LA45_2==57||LA45_2==71||LA45_2==98||LA45_2==102||(LA45_2>=104 && LA45_2<=106)||(LA45_2>=108 && LA45_2<=109)||(LA45_2>=134 && LA45_2<=135)) ) {
                        alt45=1;
                    }


                }
                else if ( (LA45_0==97) ) {
                    alt45=1;
                }


                } finally {dbg.exitDecision(45);}

                switch (alt45) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:310:22: add_op mult_expr
            	    {
            	    dbg.location(310,22);
            	    pushFollow(FOLLOW_add_op_in_add_expr2231);
            	    add_op276=add_op();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, add_op276.getTree());
            	    dbg.location(310,29);
            	    pushFollow(FOLLOW_mult_expr_in_add_expr2233);
            	    mult_expr277=mult_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, mult_expr277.getTree());

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);
            } finally {dbg.exitSubRule(45);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(310, 40);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "add_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "add_expr"

    public static class add_op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "add_op"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:312:1: add_op : ( '+' | '-' );
    public final rulesetParser.add_op_return add_op() throws RecognitionException {
        rulesetParser.add_op_return retval = new rulesetParser.add_op_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set278=null;

        Object set278_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "add_op");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(312, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:312:7: ( '+' | '-' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(312,7);
            set278=(Token)input.LT(1);
            if ( (input.LA(1)>=97 && input.LA(1)<=98) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set278));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(312, 16);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "add_op");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "add_op"

    public static class mult_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mult_expr"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:314:1: mult_expr : unary_expr ( mult_op unary_expr )* ;
    public final rulesetParser.mult_expr_return mult_expr() throws RecognitionException {
        rulesetParser.mult_expr_return retval = new rulesetParser.mult_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        rulesetParser.unary_expr_return unary_expr279 = null;

        rulesetParser.mult_op_return mult_op280 = null;

        rulesetParser.unary_expr_return unary_expr281 = null;



        try { dbg.enterRule(getGrammarFileName(), "mult_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(314, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:315:2: ( unary_expr ( mult_op unary_expr )* )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:315:4: unary_expr ( mult_op unary_expr )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(315,4);
            pushFollow(FOLLOW_unary_expr_in_mult_expr2255);
            unary_expr279=unary_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expr279.getTree());
            dbg.location(315,15);
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:315:15: ( mult_op unary_expr )*
            try { dbg.enterSubRule(46);

            loop46:
            do {
                int alt46=2;
                try { dbg.enterDecision(46);

                int LA46_0 = input.LA(1);

                if ( ((LA46_0>=99 && LA46_0<=101)) ) {
                    alt46=1;
                }


                } finally {dbg.exitDecision(46);}

                switch (alt46) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:315:16: mult_op unary_expr
            	    {
            	    dbg.location(315,16);
            	    pushFollow(FOLLOW_mult_op_in_mult_expr2258);
            	    mult_op280=mult_op();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, mult_op280.getTree());
            	    dbg.location(315,24);
            	    pushFollow(FOLLOW_unary_expr_in_mult_expr2260);
            	    unary_expr281=unary_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expr281.getTree());

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);
            } finally {dbg.exitSubRule(46);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(316, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "mult_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "mult_expr"

    public static class mult_op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mult_op"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:318:1: mult_op : ( '*' | '/' | '%' );
    public final rulesetParser.mult_op_return mult_op() throws RecognitionException {
        rulesetParser.mult_op_return retval = new rulesetParser.mult_op_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set282=null;

        Object set282_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "mult_op");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(318, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:318:8: ( '*' | '/' | '%' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(318,8);
            set282=(Token)input.LT(1);
            if ( (input.LA(1)>=99 && input.LA(1)<=101) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set282));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(318, 21);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "mult_op");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "mult_op"

    public static class unary_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unary_expr"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:320:1: unary_expr options {backtrack=true; } : ( 'not' unary_expr | 'seen' STRING 'in' var_domain ':' ID timeframe | 'seen' STRING ( 'before' | 'after' ) STRING 'in' var_domain ':' ID | var_domain ':' ID predop expr timeframe | var_domain ':' ID timeframe | operator_expr );
    public final rulesetParser.unary_expr_return unary_expr() throws RecognitionException {
        rulesetParser.unary_expr_return retval = new rulesetParser.unary_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal283=null;
        Token string_literal285=null;
        Token STRING286=null;
        Token string_literal287=null;
        Token char_literal289=null;
        Token ID290=null;
        Token string_literal292=null;
        Token STRING293=null;
        Token set294=null;
        Token STRING295=null;
        Token string_literal296=null;
        Token char_literal298=null;
        Token ID299=null;
        Token char_literal301=null;
        Token ID302=null;
        Token char_literal307=null;
        Token ID308=null;
        rulesetParser.unary_expr_return unary_expr284 = null;

        rulesetParser.var_domain_return var_domain288 = null;

        rulesetParser.timeframe_return timeframe291 = null;

        rulesetParser.var_domain_return var_domain297 = null;

        rulesetParser.var_domain_return var_domain300 = null;

        rulesetParser.predop_return predop303 = null;

        rulesetParser.expr_return expr304 = null;

        rulesetParser.timeframe_return timeframe305 = null;

        rulesetParser.var_domain_return var_domain306 = null;

        rulesetParser.timeframe_return timeframe309 = null;

        rulesetParser.operator_expr_return operator_expr310 = null;


        Object string_literal283_tree=null;
        Object string_literal285_tree=null;
        Object STRING286_tree=null;
        Object string_literal287_tree=null;
        Object char_literal289_tree=null;
        Object ID290_tree=null;
        Object string_literal292_tree=null;
        Object STRING293_tree=null;
        Object set294_tree=null;
        Object STRING295_tree=null;
        Object string_literal296_tree=null;
        Object char_literal298_tree=null;
        Object ID299_tree=null;
        Object char_literal301_tree=null;
        Object ID302_tree=null;
        Object char_literal307_tree=null;
        Object ID308_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "unary_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(320, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:321:2: ( 'not' unary_expr | 'seen' STRING 'in' var_domain ':' ID timeframe | 'seen' STRING ( 'before' | 'after' ) STRING 'in' var_domain ':' ID | var_domain ':' ID predop expr timeframe | var_domain ':' ID timeframe | operator_expr )
            int alt47=6;
            try { dbg.enterDecision(47);

            try {
                isCyclicDecision = true;
                alt47 = dfa47.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(47);}

            switch (alt47) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:321:4: 'not' unary_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(321,4);
                    string_literal283=(Token)match(input,71,FOLLOW_71_in_unary_expr2295); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal283_tree = (Object)adaptor.create(string_literal283);
                    adaptor.addChild(root_0, string_literal283_tree);
                    }
                    dbg.location(321,10);
                    pushFollow(FOLLOW_unary_expr_in_unary_expr2297);
                    unary_expr284=unary_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expr284.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:322:2: 'seen' STRING 'in' var_domain ':' ID timeframe
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(322,2);
                    string_literal285=(Token)match(input,102,FOLLOW_102_in_unary_expr2303); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal285_tree = (Object)adaptor.create(string_literal285);
                    adaptor.addChild(root_0, string_literal285_tree);
                    }
                    dbg.location(322,9);
                    STRING286=(Token)match(input,STRING,FOLLOW_STRING_in_unary_expr2305); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING286_tree = (Object)adaptor.create(STRING286);
                    adaptor.addChild(root_0, STRING286_tree);
                    }
                    dbg.location(322,16);
                    string_literal287=(Token)match(input,41,FOLLOW_41_in_unary_expr2307); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal287_tree = (Object)adaptor.create(string_literal287);
                    adaptor.addChild(root_0, string_literal287_tree);
                    }
                    dbg.location(322,21);
                    pushFollow(FOLLOW_var_domain_in_unary_expr2309);
                    var_domain288=var_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, var_domain288.getTree());
                    dbg.location(322,32);
                    char_literal289=(Token)match(input,38,FOLLOW_38_in_unary_expr2311); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal289_tree = (Object)adaptor.create(char_literal289);
                    adaptor.addChild(root_0, char_literal289_tree);
                    }
                    dbg.location(322,36);
                    ID290=(Token)match(input,ID,FOLLOW_ID_in_unary_expr2313); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID290_tree = (Object)adaptor.create(ID290);
                    adaptor.addChild(root_0, ID290_tree);
                    }
                    dbg.location(322,39);
                    pushFollow(FOLLOW_timeframe_in_unary_expr2315);
                    timeframe291=timeframe();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeframe291.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:323:2: 'seen' STRING ( 'before' | 'after' ) STRING 'in' var_domain ':' ID
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(323,2);
                    string_literal292=(Token)match(input,102,FOLLOW_102_in_unary_expr2320); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal292_tree = (Object)adaptor.create(string_literal292);
                    adaptor.addChild(root_0, string_literal292_tree);
                    }
                    dbg.location(323,9);
                    STRING293=(Token)match(input,STRING,FOLLOW_STRING_in_unary_expr2322); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING293_tree = (Object)adaptor.create(STRING293);
                    adaptor.addChild(root_0, STRING293_tree);
                    }
                    dbg.location(323,16);
                    set294=(Token)input.LT(1);
                    if ( input.LA(1)==69||input.LA(1)==103 ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set294));
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(323,37);
                    STRING295=(Token)match(input,STRING,FOLLOW_STRING_in_unary_expr2332); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING295_tree = (Object)adaptor.create(STRING295);
                    adaptor.addChild(root_0, STRING295_tree);
                    }
                    dbg.location(323,44);
                    string_literal296=(Token)match(input,41,FOLLOW_41_in_unary_expr2334); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal296_tree = (Object)adaptor.create(string_literal296);
                    adaptor.addChild(root_0, string_literal296_tree);
                    }
                    dbg.location(323,49);
                    pushFollow(FOLLOW_var_domain_in_unary_expr2336);
                    var_domain297=var_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, var_domain297.getTree());
                    dbg.location(323,60);
                    char_literal298=(Token)match(input,38,FOLLOW_38_in_unary_expr2338); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal298_tree = (Object)adaptor.create(char_literal298);
                    adaptor.addChild(root_0, char_literal298_tree);
                    }
                    dbg.location(323,64);
                    ID299=(Token)match(input,ID,FOLLOW_ID_in_unary_expr2340); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID299_tree = (Object)adaptor.create(ID299);
                    adaptor.addChild(root_0, ID299_tree);
                    }

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:324:2: var_domain ':' ID predop expr timeframe
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(324,2);
                    pushFollow(FOLLOW_var_domain_in_unary_expr2345);
                    var_domain300=var_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, var_domain300.getTree());
                    dbg.location(324,13);
                    char_literal301=(Token)match(input,38,FOLLOW_38_in_unary_expr2347); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal301_tree = (Object)adaptor.create(char_literal301);
                    adaptor.addChild(root_0, char_literal301_tree);
                    }
                    dbg.location(324,17);
                    ID302=(Token)match(input,ID,FOLLOW_ID_in_unary_expr2349); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID302_tree = (Object)adaptor.create(ID302);
                    adaptor.addChild(root_0, ID302_tree);
                    }
                    dbg.location(324,20);
                    pushFollow(FOLLOW_predop_in_unary_expr2351);
                    predop303=predop();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, predop303.getTree());
                    dbg.location(324,27);
                    pushFollow(FOLLOW_expr_in_unary_expr2353);
                    expr304=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr304.getTree());
                    dbg.location(324,32);
                    pushFollow(FOLLOW_timeframe_in_unary_expr2355);
                    timeframe305=timeframe();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeframe305.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:325:2: var_domain ':' ID timeframe
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(325,2);
                    pushFollow(FOLLOW_var_domain_in_unary_expr2360);
                    var_domain306=var_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, var_domain306.getTree());
                    dbg.location(325,13);
                    char_literal307=(Token)match(input,38,FOLLOW_38_in_unary_expr2362); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal307_tree = (Object)adaptor.create(char_literal307);
                    adaptor.addChild(root_0, char_literal307_tree);
                    }
                    dbg.location(325,17);
                    ID308=(Token)match(input,ID,FOLLOW_ID_in_unary_expr2364); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID308_tree = (Object)adaptor.create(ID308);
                    adaptor.addChild(root_0, ID308_tree);
                    }
                    dbg.location(325,20);
                    pushFollow(FOLLOW_timeframe_in_unary_expr2366);
                    timeframe309=timeframe();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeframe309.getTree());

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:326:2: operator_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(326,2);
                    pushFollow(FOLLOW_operator_expr_in_unary_expr2371);
                    operator_expr310=operator_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, operator_expr310.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(327, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "unary_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "unary_expr"

    public static class operator_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operator_expr"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:330:1: operator_expr : factor ( operator )* ;
    public final rulesetParser.operator_expr_return operator_expr() throws RecognitionException {
        rulesetParser.operator_expr_return retval = new rulesetParser.operator_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        rulesetParser.factor_return factor311 = null;

        rulesetParser.operator_return operator312 = null;



        try { dbg.enterRule(getGrammarFileName(), "operator_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(330, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:331:2: ( factor ( operator )* )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:331:4: factor ( operator )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(331,4);
            pushFollow(FOLLOW_factor_in_operator_expr2385);
            factor311=factor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, factor311.getTree());
            dbg.location(331,11);
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:331:11: ( operator )*
            try { dbg.enterSubRule(48);

            loop48:
            do {
                int alt48=2;
                try { dbg.enterDecision(48);

                int LA48_0 = input.LA(1);

                if ( (LA48_0==110) ) {
                    alt48=1;
                }


                } finally {dbg.exitDecision(48);}

                switch (alt48) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:331:11: operator
            	    {
            	    dbg.location(331,11);
            	    pushFollow(FOLLOW_operator_in_operator_expr2387);
            	    operator312=operator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, operator312.getTree());

            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);
            } finally {dbg.exitSubRule(48);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(332, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "operator_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "operator_expr"

    public static class factor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "factor"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:334:1: factor options {backtrack=true; } : ( INT | '-' INT | STRING | REGEXP | 'true' | 'false' | ID '[' expr ']' | persistent_var | trail_exp | function_app | '[' expr ',' ']' | '{' ( hash_line ( ',' )? )* '}' | ID | '(' expr ')' );
    public final rulesetParser.factor_return factor() throws RecognitionException {
        rulesetParser.factor_return retval = new rulesetParser.factor_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT313=null;
        Token char_literal314=null;
        Token INT315=null;
        Token STRING316=null;
        Token REGEXP317=null;
        Token string_literal318=null;
        Token string_literal319=null;
        Token ID320=null;
        Token char_literal321=null;
        Token char_literal323=null;
        Token char_literal327=null;
        Token char_literal329=null;
        Token char_literal330=null;
        Token char_literal331=null;
        Token char_literal333=null;
        Token char_literal334=null;
        Token ID335=null;
        Token char_literal336=null;
        Token char_literal338=null;
        rulesetParser.expr_return expr322 = null;

        rulesetParser.persistent_var_return persistent_var324 = null;

        rulesetParser.trail_exp_return trail_exp325 = null;

        rulesetParser.function_app_return function_app326 = null;

        rulesetParser.expr_return expr328 = null;

        rulesetParser.hash_line_return hash_line332 = null;

        rulesetParser.expr_return expr337 = null;


        Object INT313_tree=null;
        Object char_literal314_tree=null;
        Object INT315_tree=null;
        Object STRING316_tree=null;
        Object REGEXP317_tree=null;
        Object string_literal318_tree=null;
        Object string_literal319_tree=null;
        Object ID320_tree=null;
        Object char_literal321_tree=null;
        Object char_literal323_tree=null;
        Object char_literal327_tree=null;
        Object char_literal329_tree=null;
        Object char_literal330_tree=null;
        Object char_literal331_tree=null;
        Object char_literal333_tree=null;
        Object char_literal334_tree=null;
        Object ID335_tree=null;
        Object char_literal336_tree=null;
        Object char_literal338_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "factor");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(334, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:335:2: ( INT | '-' INT | STRING | REGEXP | 'true' | 'false' | ID '[' expr ']' | persistent_var | trail_exp | function_app | '[' expr ',' ']' | '{' ( hash_line ( ',' )? )* '}' | ID | '(' expr ')' )
            int alt51=14;
            try { dbg.enterDecision(51);

            try {
                isCyclicDecision = true;
                alt51 = dfa51.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(51);}

            switch (alt51) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:335:4: INT
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(335,4);
                    INT313=(Token)match(input,INT,FOLLOW_INT_in_factor2412); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT313_tree = (Object)adaptor.create(INT313);
                    adaptor.addChild(root_0, INT313_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:336:9: '-' INT
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(336,9);
                    char_literal314=(Token)match(input,98,FOLLOW_98_in_factor2422); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal314_tree = (Object)adaptor.create(char_literal314);
                    adaptor.addChild(root_0, char_literal314_tree);
                    }
                    dbg.location(336,13);
                    INT315=(Token)match(input,INT,FOLLOW_INT_in_factor2424); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT315_tree = (Object)adaptor.create(INT315);
                    adaptor.addChild(root_0, INT315_tree);
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:337:9: STRING
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(337,9);
                    STRING316=(Token)match(input,STRING,FOLLOW_STRING_in_factor2434); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING316_tree = (Object)adaptor.create(STRING316);
                    adaptor.addChild(root_0, STRING316_tree);
                    }

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:338:9: REGEXP
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(338,9);
                    REGEXP317=(Token)match(input,REGEXP,FOLLOW_REGEXP_in_factor2444); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXP317_tree = (Object)adaptor.create(REGEXP317);
                    adaptor.addChild(root_0, REGEXP317_tree);
                    }

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:339:9: 'true'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(339,9);
                    string_literal318=(Token)match(input,104,FOLLOW_104_in_factor2454); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal318_tree = (Object)adaptor.create(string_literal318);
                    adaptor.addChild(root_0, string_literal318_tree);
                    }

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:340:9: 'false'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(340,9);
                    string_literal319=(Token)match(input,105,FOLLOW_105_in_factor2464); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal319_tree = (Object)adaptor.create(string_literal319);
                    adaptor.addChild(root_0, string_literal319_tree);
                    }

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:341:9: ID '[' expr ']'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(341,9);
                    ID320=(Token)match(input,ID,FOLLOW_ID_in_factor2474); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID320_tree = (Object)adaptor.create(ID320);
                    adaptor.addChild(root_0, ID320_tree);
                    }
                    dbg.location(341,12);
                    char_literal321=(Token)match(input,106,FOLLOW_106_in_factor2476); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal321_tree = (Object)adaptor.create(char_literal321);
                    adaptor.addChild(root_0, char_literal321_tree);
                    }
                    dbg.location(341,16);
                    pushFollow(FOLLOW_expr_in_factor2478);
                    expr322=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr322.getTree());
                    dbg.location(341,21);
                    char_literal323=(Token)match(input,107,FOLLOW_107_in_factor2480); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal323_tree = (Object)adaptor.create(char_literal323);
                    adaptor.addChild(root_0, char_literal323_tree);
                    }

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:342:9: persistent_var
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(342,9);
                    pushFollow(FOLLOW_persistent_var_in_factor2490);
                    persistent_var324=persistent_var();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, persistent_var324.getTree());

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:343:9: trail_exp
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(343,9);
                    pushFollow(FOLLOW_trail_exp_in_factor2500);
                    trail_exp325=trail_exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, trail_exp325.getTree());

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:344:9: function_app
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(344,9);
                    pushFollow(FOLLOW_function_app_in_factor2510);
                    function_app326=function_app();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_app326.getTree());

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:345:9: '[' expr ',' ']'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(345,9);
                    char_literal327=(Token)match(input,106,FOLLOW_106_in_factor2520); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal327_tree = (Object)adaptor.create(char_literal327);
                    adaptor.addChild(root_0, char_literal327_tree);
                    }
                    dbg.location(345,13);
                    pushFollow(FOLLOW_expr_in_factor2522);
                    expr328=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr328.getTree());
                    dbg.location(345,18);
                    char_literal329=(Token)match(input,58,FOLLOW_58_in_factor2524); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal329_tree = (Object)adaptor.create(char_literal329);
                    adaptor.addChild(root_0, char_literal329_tree);
                    }
                    dbg.location(345,22);
                    char_literal330=(Token)match(input,107,FOLLOW_107_in_factor2526); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal330_tree = (Object)adaptor.create(char_literal330);
                    adaptor.addChild(root_0, char_literal330_tree);
                    }

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:346:9: '{' ( hash_line ( ',' )? )* '}'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(346,9);
                    char_literal331=(Token)match(input,20,FOLLOW_20_in_factor2536); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal331_tree = (Object)adaptor.create(char_literal331);
                    adaptor.addChild(root_0, char_literal331_tree);
                    }
                    dbg.location(346,13);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:346:13: ( hash_line ( ',' )? )*
                    try { dbg.enterSubRule(50);

                    loop50:
                    do {
                        int alt50=2;
                        try { dbg.enterDecision(50);

                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==STRING) ) {
                            alt50=1;
                        }


                        } finally {dbg.exitDecision(50);}

                        switch (alt50) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:346:14: hash_line ( ',' )?
                    	    {
                    	    dbg.location(346,14);
                    	    pushFollow(FOLLOW_hash_line_in_factor2539);
                    	    hash_line332=hash_line();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, hash_line332.getTree());
                    	    dbg.location(346,24);
                    	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:346:24: ( ',' )?
                    	    int alt49=2;
                    	    try { dbg.enterSubRule(49);
                    	    try { dbg.enterDecision(49);

                    	    int LA49_0 = input.LA(1);

                    	    if ( (LA49_0==58) ) {
                    	        alt49=1;
                    	    }
                    	    } finally {dbg.exitDecision(49);}

                    	    switch (alt49) {
                    	        case 1 :
                    	            dbg.enterAlt(1);

                    	            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:346:24: ','
                    	            {
                    	            dbg.location(346,24);
                    	            char_literal333=(Token)match(input,58,FOLLOW_58_in_factor2541); if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) {
                    	            char_literal333_tree = (Object)adaptor.create(char_literal333);
                    	            adaptor.addChild(root_0, char_literal333_tree);
                    	            }

                    	            }
                    	            break;

                    	    }
                    	    } finally {dbg.exitSubRule(49);}


                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(50);}

                    dbg.location(346,31);
                    char_literal334=(Token)match(input,21,FOLLOW_21_in_factor2546); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal334_tree = (Object)adaptor.create(char_literal334);
                    adaptor.addChild(root_0, char_literal334_tree);
                    }

                    }
                    break;
                case 13 :
                    dbg.enterAlt(13);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:347:9: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(347,9);
                    ID335=(Token)match(input,ID,FOLLOW_ID_in_factor2556); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID335_tree = (Object)adaptor.create(ID335);
                    adaptor.addChild(root_0, ID335_tree);
                    }

                    }
                    break;
                case 14 :
                    dbg.enterAlt(14);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:348:9: '(' expr ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(348,9);
                    char_literal336=(Token)match(input,57,FOLLOW_57_in_factor2567); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal336_tree = (Object)adaptor.create(char_literal336);
                    adaptor.addChild(root_0, char_literal336_tree);
                    }
                    dbg.location(348,13);
                    pushFollow(FOLLOW_expr_in_factor2569);
                    expr337=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr337.getTree());
                    dbg.location(348,18);
                    char_literal338=(Token)match(input,59,FOLLOW_59_in_factor2571); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal338_tree = (Object)adaptor.create(char_literal338);
                    adaptor.addChild(root_0, char_literal338_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(349, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "factor");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "factor"

    public static class hash_line_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "hash_line"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:351:1: hash_line : STRING ':' expr ;
    public final rulesetParser.hash_line_return hash_line() throws RecognitionException {
        rulesetParser.hash_line_return retval = new rulesetParser.hash_line_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STRING339=null;
        Token char_literal340=null;
        rulesetParser.expr_return expr341 = null;


        Object STRING339_tree=null;
        Object char_literal340_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "hash_line");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(351, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:352:2: ( STRING ':' expr )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:352:4: STRING ':' expr
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(352,4);
            STRING339=(Token)match(input,STRING,FOLLOW_STRING_in_hash_line2584); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING339_tree = (Object)adaptor.create(STRING339);
            adaptor.addChild(root_0, STRING339_tree);
            }
            dbg.location(352,11);
            char_literal340=(Token)match(input,38,FOLLOW_38_in_hash_line2586); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal340_tree = (Object)adaptor.create(char_literal340);
            adaptor.addChild(root_0, char_literal340_tree);
            }
            dbg.location(352,15);
            pushFollow(FOLLOW_expr_in_hash_line2588);
            expr341=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr341.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(353, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "hash_line");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "hash_line"

    public static class function_app_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function_app"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:355:1: function_app : ( namespace ID '(' ( expr ( ',' )? )* ')' | ID '(' ( expr ( ',' )? )* ')' );
    public final rulesetParser.function_app_return function_app() throws RecognitionException {
        rulesetParser.function_app_return retval = new rulesetParser.function_app_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID343=null;
        Token char_literal344=null;
        Token char_literal346=null;
        Token char_literal347=null;
        Token ID348=null;
        Token char_literal349=null;
        Token char_literal351=null;
        Token char_literal352=null;
        rulesetParser.namespace_return namespace342 = null;

        rulesetParser.expr_return expr345 = null;

        rulesetParser.expr_return expr350 = null;


        Object ID343_tree=null;
        Object char_literal344_tree=null;
        Object char_literal346_tree=null;
        Object char_literal347_tree=null;
        Object ID348_tree=null;
        Object char_literal349_tree=null;
        Object char_literal351_tree=null;
        Object char_literal352_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "function_app");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(355, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:356:2: ( namespace ID '(' ( expr ( ',' )? )* ')' | ID '(' ( expr ( ',' )? )* ')' )
            int alt56=2;
            try { dbg.enterDecision(56);

            int LA56_0 = input.LA(1);

            if ( (LA56_0==ID) ) {
                int LA56_1 = input.LA(2);

                if ( (LA56_1==38) ) {
                    alt56=1;
                }
                else if ( (LA56_1==57) ) {
                    alt56=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 56, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(56);}

            switch (alt56) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:356:3: namespace ID '(' ( expr ( ',' )? )* ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(356,3);
                    pushFollow(FOLLOW_namespace_in_function_app2601);
                    namespace342=namespace();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, namespace342.getTree());
                    dbg.location(356,13);
                    ID343=(Token)match(input,ID,FOLLOW_ID_in_function_app2603); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID343_tree = (Object)adaptor.create(ID343);
                    adaptor.addChild(root_0, ID343_tree);
                    }
                    dbg.location(356,16);
                    char_literal344=(Token)match(input,57,FOLLOW_57_in_function_app2605); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal344_tree = (Object)adaptor.create(char_literal344);
                    adaptor.addChild(root_0, char_literal344_tree);
                    }
                    dbg.location(356,20);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:356:20: ( expr ( ',' )? )*
                    try { dbg.enterSubRule(53);

                    loop53:
                    do {
                        int alt53=2;
                        try { dbg.enterDecision(53);

                        int LA53_0 = input.LA(1);

                        if ( ((LA53_0>=ID && LA53_0<=INT)||LA53_0==STRING||LA53_0==REGEXP||LA53_0==20||LA53_0==57||LA53_0==71||LA53_0==84||LA53_0==98||LA53_0==102||(LA53_0>=104 && LA53_0<=106)||(LA53_0>=108 && LA53_0<=109)||(LA53_0>=134 && LA53_0<=135)) ) {
                            alt53=1;
                        }


                        } finally {dbg.exitDecision(53);}

                        switch (alt53) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:356:21: expr ( ',' )?
                    	    {
                    	    dbg.location(356,21);
                    	    pushFollow(FOLLOW_expr_in_function_app2608);
                    	    expr345=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr345.getTree());
                    	    dbg.location(356,26);
                    	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:356:26: ( ',' )?
                    	    int alt52=2;
                    	    try { dbg.enterSubRule(52);
                    	    try { dbg.enterDecision(52);

                    	    int LA52_0 = input.LA(1);

                    	    if ( (LA52_0==58) ) {
                    	        alt52=1;
                    	    }
                    	    } finally {dbg.exitDecision(52);}

                    	    switch (alt52) {
                    	        case 1 :
                    	            dbg.enterAlt(1);

                    	            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:356:26: ','
                    	            {
                    	            dbg.location(356,26);
                    	            char_literal346=(Token)match(input,58,FOLLOW_58_in_function_app2610); if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) {
                    	            char_literal346_tree = (Object)adaptor.create(char_literal346);
                    	            adaptor.addChild(root_0, char_literal346_tree);
                    	            }

                    	            }
                    	            break;

                    	    }
                    	    } finally {dbg.exitSubRule(52);}


                    	    }
                    	    break;

                    	default :
                    	    break loop53;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(53);}

                    dbg.location(356,33);
                    char_literal347=(Token)match(input,59,FOLLOW_59_in_function_app2615); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal347_tree = (Object)adaptor.create(char_literal347);
                    adaptor.addChild(root_0, char_literal347_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:357:3: ID '(' ( expr ( ',' )? )* ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(357,3);
                    ID348=(Token)match(input,ID,FOLLOW_ID_in_function_app2621); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID348_tree = (Object)adaptor.create(ID348);
                    adaptor.addChild(root_0, ID348_tree);
                    }
                    dbg.location(357,6);
                    char_literal349=(Token)match(input,57,FOLLOW_57_in_function_app2623); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal349_tree = (Object)adaptor.create(char_literal349);
                    adaptor.addChild(root_0, char_literal349_tree);
                    }
                    dbg.location(357,10);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:357:10: ( expr ( ',' )? )*
                    try { dbg.enterSubRule(55);

                    loop55:
                    do {
                        int alt55=2;
                        try { dbg.enterDecision(55);

                        int LA55_0 = input.LA(1);

                        if ( ((LA55_0>=ID && LA55_0<=INT)||LA55_0==STRING||LA55_0==REGEXP||LA55_0==20||LA55_0==57||LA55_0==71||LA55_0==84||LA55_0==98||LA55_0==102||(LA55_0>=104 && LA55_0<=106)||(LA55_0>=108 && LA55_0<=109)||(LA55_0>=134 && LA55_0<=135)) ) {
                            alt55=1;
                        }


                        } finally {dbg.exitDecision(55);}

                        switch (alt55) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:357:11: expr ( ',' )?
                    	    {
                    	    dbg.location(357,11);
                    	    pushFollow(FOLLOW_expr_in_function_app2626);
                    	    expr350=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr350.getTree());
                    	    dbg.location(357,16);
                    	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:357:16: ( ',' )?
                    	    int alt54=2;
                    	    try { dbg.enterSubRule(54);
                    	    try { dbg.enterDecision(54);

                    	    int LA54_0 = input.LA(1);

                    	    if ( (LA54_0==58) ) {
                    	        alt54=1;
                    	    }
                    	    } finally {dbg.exitDecision(54);}

                    	    switch (alt54) {
                    	        case 1 :
                    	            dbg.enterAlt(1);

                    	            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:357:16: ','
                    	            {
                    	            dbg.location(357,16);
                    	            char_literal351=(Token)match(input,58,FOLLOW_58_in_function_app2628); if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) {
                    	            char_literal351_tree = (Object)adaptor.create(char_literal351);
                    	            adaptor.addChild(root_0, char_literal351_tree);
                    	            }

                    	            }
                    	            break;

                    	    }
                    	    } finally {dbg.exitSubRule(54);}


                    	    }
                    	    break;

                    	default :
                    	    break loop55;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(55);}

                    dbg.location(357,23);
                    char_literal352=(Token)match(input,59,FOLLOW_59_in_function_app2633); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal352_tree = (Object)adaptor.create(char_literal352);
                    adaptor.addChild(root_0, char_literal352_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(358, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "function_app");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "function_app"

    public static class namespace_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "namespace"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:360:1: namespace : ID ':' ;
    public final rulesetParser.namespace_return namespace() throws RecognitionException {
        rulesetParser.namespace_return retval = new rulesetParser.namespace_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID353=null;
        Token char_literal354=null;

        Object ID353_tree=null;
        Object char_literal354_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "namespace");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(360, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:361:2: ( ID ':' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:361:4: ID ':'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(361,4);
            ID353=(Token)match(input,ID,FOLLOW_ID_in_namespace2645); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID353_tree = (Object)adaptor.create(ID353);
            adaptor.addChild(root_0, ID353_tree);
            }
            dbg.location(361,7);
            char_literal354=(Token)match(input,38,FOLLOW_38_in_namespace2647); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal354_tree = (Object)adaptor.create(char_literal354);
            adaptor.addChild(root_0, char_literal354_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(362, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "namespace");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "namespace"

    public static class trail_exp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "trail_exp"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:364:1: trail_exp : ( 'current' var_domain ':' ID | 'history' expr var_domain ':' ID );
    public final rulesetParser.trail_exp_return trail_exp() throws RecognitionException {
        rulesetParser.trail_exp_return retval = new rulesetParser.trail_exp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal355=null;
        Token char_literal357=null;
        Token ID358=null;
        Token string_literal359=null;
        Token char_literal362=null;
        Token ID363=null;
        rulesetParser.var_domain_return var_domain356 = null;

        rulesetParser.expr_return expr360 = null;

        rulesetParser.var_domain_return var_domain361 = null;


        Object string_literal355_tree=null;
        Object char_literal357_tree=null;
        Object ID358_tree=null;
        Object string_literal359_tree=null;
        Object char_literal362_tree=null;
        Object ID363_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "trail_exp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(364, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:365:2: ( 'current' var_domain ':' ID | 'history' expr var_domain ':' ID )
            int alt57=2;
            try { dbg.enterDecision(57);

            int LA57_0 = input.LA(1);

            if ( (LA57_0==108) ) {
                alt57=1;
            }
            else if ( (LA57_0==109) ) {
                alt57=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(57);}

            switch (alt57) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:365:3: 'current' var_domain ':' ID
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(365,3);
                    string_literal355=(Token)match(input,108,FOLLOW_108_in_trail_exp2659); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal355_tree = (Object)adaptor.create(string_literal355);
                    adaptor.addChild(root_0, string_literal355_tree);
                    }
                    dbg.location(365,13);
                    pushFollow(FOLLOW_var_domain_in_trail_exp2661);
                    var_domain356=var_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, var_domain356.getTree());
                    dbg.location(365,24);
                    char_literal357=(Token)match(input,38,FOLLOW_38_in_trail_exp2663); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal357_tree = (Object)adaptor.create(char_literal357);
                    adaptor.addChild(root_0, char_literal357_tree);
                    }
                    dbg.location(365,28);
                    ID358=(Token)match(input,ID,FOLLOW_ID_in_trail_exp2665); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID358_tree = (Object)adaptor.create(ID358);
                    adaptor.addChild(root_0, ID358_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:366:2: 'history' expr var_domain ':' ID
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(366,2);
                    string_literal359=(Token)match(input,109,FOLLOW_109_in_trail_exp2670); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal359_tree = (Object)adaptor.create(string_literal359);
                    adaptor.addChild(root_0, string_literal359_tree);
                    }
                    dbg.location(366,12);
                    pushFollow(FOLLOW_expr_in_trail_exp2672);
                    expr360=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr360.getTree());
                    dbg.location(366,17);
                    pushFollow(FOLLOW_var_domain_in_trail_exp2674);
                    var_domain361=var_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, var_domain361.getTree());
                    dbg.location(366,28);
                    char_literal362=(Token)match(input,38,FOLLOW_38_in_trail_exp2676); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal362_tree = (Object)adaptor.create(char_literal362);
                    adaptor.addChild(root_0, char_literal362_tree);
                    }
                    dbg.location(366,32);
                    ID363=(Token)match(input,ID,FOLLOW_ID_in_trail_exp2678); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID363_tree = (Object)adaptor.create(ID363);
                    adaptor.addChild(root_0, ID363_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(367, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "trail_exp");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "trail_exp"

    public static class persistent_var_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "persistent_var"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:369:1: persistent_var : var_domain ':' ID ;
    public final rulesetParser.persistent_var_return persistent_var() throws RecognitionException {
        rulesetParser.persistent_var_return retval = new rulesetParser.persistent_var_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal365=null;
        Token ID366=null;
        rulesetParser.var_domain_return var_domain364 = null;


        Object char_literal365_tree=null;
        Object ID366_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "persistent_var");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(369, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:370:2: ( var_domain ':' ID )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:370:4: var_domain ':' ID
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(370,4);
            pushFollow(FOLLOW_var_domain_in_persistent_var2692);
            var_domain364=var_domain();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, var_domain364.getTree());
            dbg.location(370,15);
            char_literal365=(Token)match(input,38,FOLLOW_38_in_persistent_var2694); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal365_tree = (Object)adaptor.create(char_literal365);
            adaptor.addChild(root_0, char_literal365_tree);
            }
            dbg.location(370,19);
            ID366=(Token)match(input,ID,FOLLOW_ID_in_persistent_var2696); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID366_tree = (Object)adaptor.create(ID366);
            adaptor.addChild(root_0, ID366_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(371, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "persistent_var");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "persistent_var"

    public static class operator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operator"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:372:1: operator : '.' operator_op '(' expr ( ',' )? ')' ;
    public final rulesetParser.operator_return operator() throws RecognitionException {
        rulesetParser.operator_return retval = new rulesetParser.operator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal367=null;
        Token char_literal369=null;
        Token char_literal371=null;
        Token char_literal372=null;
        rulesetParser.operator_op_return operator_op368 = null;

        rulesetParser.expr_return expr370 = null;


        Object char_literal367_tree=null;
        Object char_literal369_tree=null;
        Object char_literal371_tree=null;
        Object char_literal372_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "operator");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(372, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:373:2: ( '.' operator_op '(' expr ( ',' )? ')' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:373:4: '.' operator_op '(' expr ( ',' )? ')'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(373,4);
            char_literal367=(Token)match(input,110,FOLLOW_110_in_operator2708); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal367_tree = (Object)adaptor.create(char_literal367);
            adaptor.addChild(root_0, char_literal367_tree);
            }
            dbg.location(373,8);
            pushFollow(FOLLOW_operator_op_in_operator2710);
            operator_op368=operator_op();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, operator_op368.getTree());
            dbg.location(373,20);
            char_literal369=(Token)match(input,57,FOLLOW_57_in_operator2712); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal369_tree = (Object)adaptor.create(char_literal369);
            adaptor.addChild(root_0, char_literal369_tree);
            }
            dbg.location(373,24);
            pushFollow(FOLLOW_expr_in_operator2714);
            expr370=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr370.getTree());
            dbg.location(373,29);
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:373:29: ( ',' )?
            int alt58=2;
            try { dbg.enterSubRule(58);
            try { dbg.enterDecision(58);

            int LA58_0 = input.LA(1);

            if ( (LA58_0==58) ) {
                alt58=1;
            }
            } finally {dbg.exitDecision(58);}

            switch (alt58) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:373:29: ','
                    {
                    dbg.location(373,29);
                    char_literal371=(Token)match(input,58,FOLLOW_58_in_operator2716); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal371_tree = (Object)adaptor.create(char_literal371);
                    adaptor.addChild(root_0, char_literal371_tree);
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(58);}

            dbg.location(373,34);
            char_literal372=(Token)match(input,59,FOLLOW_59_in_operator2719); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal372_tree = (Object)adaptor.create(char_literal372);
            adaptor.addChild(root_0, char_literal372_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(374, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "operator");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "operator"

    public static class operator_op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operator_op"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:376:1: operator_op : ( 'pick' | 'match' | 'length' | 'replace' | 'as' | 'head' | 'tail' | 'sort' | 'filter' | 'map' | 'uc' | 'lc' | 'split' | 'join' | 'query' | 'has' | 'union' | 'difference' | 'intersection' | 'unique' | 'once' | 'duplicates' );
    public final rulesetParser.operator_op_return operator_op() throws RecognitionException {
        rulesetParser.operator_op_return retval = new rulesetParser.operator_op_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set373=null;

        Object set373_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "operator_op");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(376, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:377:2: ( 'pick' | 'match' | 'length' | 'replace' | 'as' | 'head' | 'tail' | 'sort' | 'filter' | 'map' | 'uc' | 'lc' | 'split' | 'join' | 'query' | 'has' | 'union' | 'difference' | 'intersection' | 'unique' | 'once' | 'duplicates' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(377,2);
            set373=(Token)input.LT(1);
            if ( (input.LA(1)>=111 && input.LA(1)<=132) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set373));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(381, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "operator_op");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "operator_op"

    public static class timeframe_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "timeframe"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:382:1: timeframe : 'within' expr ( periods | period ) ;
    public final rulesetParser.timeframe_return timeframe() throws RecognitionException {
        rulesetParser.timeframe_return retval = new rulesetParser.timeframe_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal374=null;
        rulesetParser.expr_return expr375 = null;

        rulesetParser.periods_return periods376 = null;

        rulesetParser.period_return period377 = null;


        Object string_literal374_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "timeframe");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(382, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:383:2: ( 'within' expr ( periods | period ) )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:383:5: 'within' expr ( periods | period )
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(383,5);
            string_literal374=(Token)match(input,133,FOLLOW_133_in_timeframe2829); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal374_tree = (Object)adaptor.create(string_literal374);
            adaptor.addChild(root_0, string_literal374_tree);
            }
            dbg.location(383,14);
            pushFollow(FOLLOW_expr_in_timeframe2831);
            expr375=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr375.getTree());
            dbg.location(383,19);
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:383:19: ( periods | period )
            int alt59=2;
            try { dbg.enterSubRule(59);
            try { dbg.enterDecision(59);

            int LA59_0 = input.LA(1);

            if ( ((LA59_0>=143 && LA59_0<=149)) ) {
                alt59=1;
            }
            else if ( ((LA59_0>=150 && LA59_0<=156)) ) {
                alt59=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(59);}

            switch (alt59) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:383:20: periods
                    {
                    dbg.location(383,20);
                    pushFollow(FOLLOW_periods_in_timeframe2834);
                    periods376=periods();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, periods376.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:383:30: period
                    {
                    dbg.location(383,30);
                    pushFollow(FOLLOW_period_in_timeframe2838);
                    period377=period();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, period377.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(59);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(384, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "timeframe");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "timeframe"

    public static class var_domain_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "var_domain"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:386:1: var_domain : ( 'ent' | 'app' );
    public final rulesetParser.var_domain_return var_domain() throws RecognitionException {
        rulesetParser.var_domain_return retval = new rulesetParser.var_domain_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set378=null;

        Object set378_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "var_domain");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(386, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:386:11: ( 'ent' | 'app' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(386,11);
            set378=(Token)input.LT(1);
            if ( (input.LA(1)>=134 && input.LA(1)<=135) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set378));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(386, 26);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "var_domain");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "var_domain"

    public static class emit_block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "emit_block"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:388:1: emit_block : 'emit' ( HTML | STRING | JS ) ;
    public final rulesetParser.emit_block_return emit_block() throws RecognitionException {
        rulesetParser.emit_block_return retval = new rulesetParser.emit_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal379=null;
        Token set380=null;

        Object string_literal379_tree=null;
        Object set380_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "emit_block");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(388, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:389:2: ( 'emit' ( HTML | STRING | JS ) )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:389:4: 'emit' ( HTML | STRING | JS )
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(389,4);
            string_literal379=(Token)match(input,136,FOLLOW_136_in_emit_block2865); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal379_tree = (Object)adaptor.create(string_literal379);
            adaptor.addChild(root_0, string_literal379_tree);
            }
            dbg.location(389,11);
            set380=(Token)input.LT(1);
            if ( input.LA(1)==STRING||(input.LA(1)>=HTML && input.LA(1)<=JS) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set380));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(390, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "emit_block");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "emit_block"

    public static class dataset_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dataset"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:392:1: dataset : 'dataset' ID ( datatype )? '<-' STRING cachable ;
    public final rulesetParser.dataset_return dataset() throws RecognitionException {
        rulesetParser.dataset_return retval = new rulesetParser.dataset_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal381=null;
        Token ID382=null;
        Token string_literal384=null;
        Token STRING385=null;
        rulesetParser.datatype_return datatype383 = null;

        rulesetParser.cachable_return cachable386 = null;


        Object string_literal381_tree=null;
        Object ID382_tree=null;
        Object string_literal384_tree=null;
        Object STRING385_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dataset");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(392, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:392:9: ( 'dataset' ID ( datatype )? '<-' STRING cachable )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:392:11: 'dataset' ID ( datatype )? '<-' STRING cachable
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(392,11);
            string_literal381=(Token)match(input,137,FOLLOW_137_in_dataset2885); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal381_tree = (Object)adaptor.create(string_literal381);
            adaptor.addChild(root_0, string_literal381_tree);
            }
            dbg.location(392,21);
            ID382=(Token)match(input,ID,FOLLOW_ID_in_dataset2887); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID382_tree = (Object)adaptor.create(ID382);
            adaptor.addChild(root_0, ID382_tree);
            }
            dbg.location(392,24);
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:392:24: ( datatype )?
            int alt60=2;
            try { dbg.enterSubRule(60);
            try { dbg.enterDecision(60);

            int LA60_0 = input.LA(1);

            if ( (LA60_0==38) ) {
                alt60=1;
            }
            } finally {dbg.exitDecision(60);}

            switch (alt60) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:392:24: datatype
                    {
                    dbg.location(392,24);
                    pushFollow(FOLLOW_datatype_in_dataset2889);
                    datatype383=datatype();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, datatype383.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(60);}

            dbg.location(392,34);
            string_literal384=(Token)match(input,82,FOLLOW_82_in_dataset2892); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal384_tree = (Object)adaptor.create(string_literal384);
            adaptor.addChild(root_0, string_literal384_tree);
            }
            dbg.location(392,39);
            STRING385=(Token)match(input,STRING,FOLLOW_STRING_in_dataset2894); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING385_tree = (Object)adaptor.create(STRING385);
            adaptor.addChild(root_0, STRING385_tree);
            }
            dbg.location(392,46);
            pushFollow(FOLLOW_cachable_in_dataset2896);
            cachable386=cachable();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cachable386.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(393, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "dataset");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "dataset"

    public static class datatype_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "datatype"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:395:1: datatype : ':' ( 'JSON' | 'XML' | 'RSS' | 'HTML' ) ;
    public final rulesetParser.datatype_return datatype() throws RecognitionException {
        rulesetParser.datatype_return retval = new rulesetParser.datatype_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal387=null;
        Token set388=null;

        Object char_literal387_tree=null;
        Object set388_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "datatype");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(395, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:395:9: ( ':' ( 'JSON' | 'XML' | 'RSS' | 'HTML' ) )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:395:11: ':' ( 'JSON' | 'XML' | 'RSS' | 'HTML' )
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(395,11);
            char_literal387=(Token)match(input,38,FOLLOW_38_in_datatype2906); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal387_tree = (Object)adaptor.create(char_literal387);
            adaptor.addChild(root_0, char_literal387_tree);
            }
            dbg.location(395,15);
            set388=(Token)input.LT(1);
            if ( (input.LA(1)>=138 && input.LA(1)<=141) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set388));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(396, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "datatype");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "datatype"

    public static class cachable_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cachable"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:398:1: cachable : 'cachable' cachetime ;
    public final rulesetParser.cachable_return cachable() throws RecognitionException {
        rulesetParser.cachable_return retval = new rulesetParser.cachable_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal389=null;
        rulesetParser.cachetime_return cachetime390 = null;


        Object string_literal389_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "cachable");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(398, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:398:9: ( 'cachable' cachetime )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:398:11: 'cachable' cachetime
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(398,11);
            string_literal389=(Token)match(input,142,FOLLOW_142_in_cachable2925); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal389_tree = (Object)adaptor.create(string_literal389);
            adaptor.addChild(root_0, string_literal389_tree);
            }
            dbg.location(398,22);
            pushFollow(FOLLOW_cachetime_in_cachable2927);
            cachetime390=cachetime();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cachetime390.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(399, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "cachable");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "cachable"

    public static class cachetime_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cachetime"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:401:1: cachetime : 'for' INT ( periods | period ) ;
    public final rulesetParser.cachetime_return cachetime() throws RecognitionException {
        rulesetParser.cachetime_return retval = new rulesetParser.cachetime_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal391=null;
        Token INT392=null;
        rulesetParser.periods_return periods393 = null;

        rulesetParser.period_return period394 = null;


        Object string_literal391_tree=null;
        Object INT392_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "cachetime");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(401, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:401:10: ( 'for' INT ( periods | period ) )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:401:12: 'for' INT ( periods | period )
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(401,12);
            string_literal391=(Token)match(input,52,FOLLOW_52_in_cachetime2938); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal391_tree = (Object)adaptor.create(string_literal391);
            adaptor.addChild(root_0, string_literal391_tree);
            }
            dbg.location(401,18);
            INT392=(Token)match(input,INT,FOLLOW_INT_in_cachetime2940); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INT392_tree = (Object)adaptor.create(INT392);
            adaptor.addChild(root_0, INT392_tree);
            }
            dbg.location(401,22);
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:401:22: ( periods | period )
            int alt61=2;
            try { dbg.enterSubRule(61);
            try { dbg.enterDecision(61);

            int LA61_0 = input.LA(1);

            if ( ((LA61_0>=143 && LA61_0<=149)) ) {
                alt61=1;
            }
            else if ( ((LA61_0>=150 && LA61_0<=156)) ) {
                alt61=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(61);}

            switch (alt61) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:401:23: periods
                    {
                    dbg.location(401,23);
                    pushFollow(FOLLOW_periods_in_cachetime2943);
                    periods393=periods();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, periods393.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:401:31: period
                    {
                    dbg.location(401,31);
                    pushFollow(FOLLOW_period_in_cachetime2945);
                    period394=period();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, period394.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(61);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(402, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "cachetime");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "cachetime"

    public static class periods_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "periods"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:404:1: periods : ( 'years' | 'months' | 'weeks' | 'days' | 'hours' | 'minutes' | 'seconds' );
    public final rulesetParser.periods_return periods() throws RecognitionException {
        rulesetParser.periods_return retval = new rulesetParser.periods_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set395=null;

        Object set395_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "periods");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(404, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:404:9: ( 'years' | 'months' | 'weeks' | 'days' | 'hours' | 'minutes' | 'seconds' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(404,9);
            set395=(Token)input.LT(1);
            if ( (input.LA(1)>=143 && input.LA(1)<=149) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set395));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(411, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "periods");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "periods"

    public static class period_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "period"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:413:1: period : ( 'year' | 'month' | 'week' | 'day' | 'hour' | 'minute' | 'second' );
    public final rulesetParser.period_return period() throws RecognitionException {
        rulesetParser.period_return retval = new rulesetParser.period_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set396=null;

        Object set396_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "period");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(413, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:413:9: ( 'year' | 'month' | 'week' | 'day' | 'hour' | 'minute' | 'second' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(413,9);
            set396=(Token)input.LT(1);
            if ( (input.LA(1)>=150 && input.LA(1)<=156) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set396));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(420, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "period");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "period"

    public static class dispatch_block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dispatch_block"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:425:1: dispatch_block : 'dispatch' '{' ( dispatch )* '}' ;
    public final rulesetParser.dispatch_block_return dispatch_block() throws RecognitionException {
        rulesetParser.dispatch_block_return retval = new rulesetParser.dispatch_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal397=null;
        Token char_literal398=null;
        Token char_literal400=null;
        rulesetParser.dispatch_return dispatch399 = null;


        Object string_literal397_tree=null;
        Object char_literal398_tree=null;
        Object char_literal400_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dispatch_block");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(425, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:426:2: ( 'dispatch' '{' ( dispatch )* '}' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:426:4: 'dispatch' '{' ( dispatch )* '}'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(426,4);
            string_literal397=(Token)match(input,157,FOLLOW_157_in_dispatch_block3080); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal397_tree = (Object)adaptor.create(string_literal397);
            adaptor.addChild(root_0, string_literal397_tree);
            }
            dbg.location(426,15);
            char_literal398=(Token)match(input,20,FOLLOW_20_in_dispatch_block3082); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal398_tree = (Object)adaptor.create(char_literal398);
            adaptor.addChild(root_0, char_literal398_tree);
            }
            dbg.location(426,19);
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:426:19: ( dispatch )*
            try { dbg.enterSubRule(62);

            loop62:
            do {
                int alt62=2;
                try { dbg.enterDecision(62);

                int LA62_0 = input.LA(1);

                if ( (LA62_0==158) ) {
                    alt62=1;
                }


                } finally {dbg.exitDecision(62);}

                switch (alt62) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:426:19: dispatch
            	    {
            	    dbg.location(426,19);
            	    pushFollow(FOLLOW_dispatch_in_dispatch_block3084);
            	    dispatch399=dispatch();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, dispatch399.getTree());

            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);
            } finally {dbg.exitSubRule(62);}

            dbg.location(426,29);
            char_literal400=(Token)match(input,21,FOLLOW_21_in_dispatch_block3087); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal400_tree = (Object)adaptor.create(char_literal400);
            adaptor.addChild(root_0, char_literal400_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(427, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "dispatch_block");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "dispatch_block"

    public static class dispatch_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dispatch"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:429:1: dispatch : 'domain' STRING dispatch_target ;
    public final rulesetParser.dispatch_return dispatch() throws RecognitionException {
        rulesetParser.dispatch_return retval = new rulesetParser.dispatch_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal401=null;
        Token STRING402=null;
        rulesetParser.dispatch_target_return dispatch_target403 = null;


        Object string_literal401_tree=null;
        Object STRING402_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dispatch");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(429, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:429:9: ( 'domain' STRING dispatch_target )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:429:11: 'domain' STRING dispatch_target
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(429,11);
            string_literal401=(Token)match(input,158,FOLLOW_158_in_dispatch3096); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal401_tree = (Object)adaptor.create(string_literal401);
            adaptor.addChild(root_0, string_literal401_tree);
            }
            dbg.location(429,20);
            STRING402=(Token)match(input,STRING,FOLLOW_STRING_in_dispatch3098); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING402_tree = (Object)adaptor.create(STRING402);
            adaptor.addChild(root_0, STRING402_tree);
            }
            dbg.location(429,27);
            pushFollow(FOLLOW_dispatch_target_in_dispatch3100);
            dispatch_target403=dispatch_target();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, dispatch_target403.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(429, 44);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "dispatch");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "dispatch"

    public static class dispatch_target_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dispatch_target"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:431:1: dispatch_target : '->' STRING ;
    public final rulesetParser.dispatch_target_return dispatch_target() throws RecognitionException {
        rulesetParser.dispatch_target_return retval = new rulesetParser.dispatch_target_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal404=null;
        Token STRING405=null;

        Object string_literal404_tree=null;
        Object STRING405_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dispatch_target");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(431, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:432:2: ( '->' STRING )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:432:4: '->' STRING
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(432,4);
            string_literal404=(Token)match(input,159,FOLLOW_159_in_dispatch_target3111); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal404_tree = (Object)adaptor.create(string_literal404);
            adaptor.addChild(root_0, string_literal404_tree);
            }
            dbg.location(432,9);
            STRING405=(Token)match(input,STRING,FOLLOW_STRING_in_dispatch_target3113); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING405_tree = (Object)adaptor.create(STRING405);
            adaptor.addChild(root_0, STRING405_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(433, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "dispatch_target");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "dispatch_target"

    public static class meta_block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "meta_block"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:438:1: meta_block : 'meta' '{' ( pragma )* '}' ;
    public final rulesetParser.meta_block_return meta_block() throws RecognitionException {
        rulesetParser.meta_block_return retval = new rulesetParser.meta_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal406=null;
        Token char_literal407=null;
        Token char_literal409=null;
        rulesetParser.pragma_return pragma408 = null;


        Object string_literal406_tree=null;
        Object char_literal407_tree=null;
        Object char_literal409_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "meta_block");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(438, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:439:2: ( 'meta' '{' ( pragma )* '}' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:439:4: 'meta' '{' ( pragma )* '}'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(439,4);
            string_literal406=(Token)match(input,160,FOLLOW_160_in_meta_block3136); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal406_tree = (Object)adaptor.create(string_literal406);
            adaptor.addChild(root_0, string_literal406_tree);
            }
            dbg.location(439,11);
            char_literal407=(Token)match(input,20,FOLLOW_20_in_meta_block3138); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal407_tree = (Object)adaptor.create(char_literal407);
            adaptor.addChild(root_0, char_literal407_tree);
            }
            dbg.location(439,15);
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:439:15: ( pragma )*
            try { dbg.enterSubRule(63);

            loop63:
            do {
                int alt63=2;
                try { dbg.enterDecision(63);

                int LA63_0 = input.LA(1);

                if ( ((LA63_0>=161 && LA63_0<=163)||LA63_0==170||LA63_0==174||LA63_0==177||LA63_0==180) ) {
                    alt63=1;
                }


                } finally {dbg.exitDecision(63);}

                switch (alt63) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:439:15: pragma
            	    {
            	    dbg.location(439,15);
            	    pushFollow(FOLLOW_pragma_in_meta_block3140);
            	    pragma408=pragma();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, pragma408.getTree());

            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);
            } finally {dbg.exitSubRule(63);}

            dbg.location(440,2);
            char_literal409=(Token)match(input,21,FOLLOW_21_in_meta_block3144); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal409_tree = (Object)adaptor.create(char_literal409);
            adaptor.addChild(root_0, char_literal409_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(442, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "meta_block");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "meta_block"

    public static class pragma_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pragma"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:444:1: pragma : ( desc_block | 'name' STRING | 'author' STRING | 'key' ( 'errorstack' | 'googleanalytics' | 'twitter' | 'amazon' | 'kpds' | 'google' | ID ) key_value | authz_pragma | logging_pargma | 'use' 'module' ID ( alias )? | 'use' ( 'css' | 'javascript' ) 'resource' location );
    public final rulesetParser.pragma_return pragma() throws RecognitionException {
        rulesetParser.pragma_return retval = new rulesetParser.pragma_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal411=null;
        Token STRING412=null;
        Token string_literal413=null;
        Token STRING414=null;
        Token string_literal415=null;
        Token set416=null;
        Token string_literal420=null;
        Token string_literal421=null;
        Token ID422=null;
        Token string_literal424=null;
        Token set425=null;
        Token string_literal426=null;
        rulesetParser.desc_block_return desc_block410 = null;

        rulesetParser.key_value_return key_value417 = null;

        rulesetParser.authz_pragma_return authz_pragma418 = null;

        rulesetParser.logging_pargma_return logging_pargma419 = null;

        rulesetParser.alias_return alias423 = null;

        rulesetParser.location_return location427 = null;


        Object string_literal411_tree=null;
        Object STRING412_tree=null;
        Object string_literal413_tree=null;
        Object STRING414_tree=null;
        Object string_literal415_tree=null;
        Object set416_tree=null;
        Object string_literal420_tree=null;
        Object string_literal421_tree=null;
        Object ID422_tree=null;
        Object string_literal424_tree=null;
        Object set425_tree=null;
        Object string_literal426_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "pragma");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(444, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:444:9: ( desc_block | 'name' STRING | 'author' STRING | 'key' ( 'errorstack' | 'googleanalytics' | 'twitter' | 'amazon' | 'kpds' | 'google' | ID ) key_value | authz_pragma | logging_pargma | 'use' 'module' ID ( alias )? | 'use' ( 'css' | 'javascript' ) 'resource' location )
            int alt65=8;
            try { dbg.enterDecision(65);

            try {
                isCyclicDecision = true;
                alt65 = dfa65.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(65);}

            switch (alt65) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:444:11: desc_block
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(444,11);
                    pushFollow(FOLLOW_desc_block_in_pragma3158);
                    desc_block410=desc_block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, desc_block410.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:444:24: 'name' STRING
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(444,24);
                    string_literal411=(Token)match(input,161,FOLLOW_161_in_pragma3162); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal411_tree = (Object)adaptor.create(string_literal411);
                    adaptor.addChild(root_0, string_literal411_tree);
                    }
                    dbg.location(444,31);
                    STRING412=(Token)match(input,STRING,FOLLOW_STRING_in_pragma3164); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING412_tree = (Object)adaptor.create(STRING412);
                    adaptor.addChild(root_0, STRING412_tree);
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:444:40: 'author' STRING
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(444,40);
                    string_literal413=(Token)match(input,162,FOLLOW_162_in_pragma3168); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal413_tree = (Object)adaptor.create(string_literal413);
                    adaptor.addChild(root_0, string_literal413_tree);
                    }
                    dbg.location(444,49);
                    STRING414=(Token)match(input,STRING,FOLLOW_STRING_in_pragma3170); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING414_tree = (Object)adaptor.create(STRING414);
                    adaptor.addChild(root_0, STRING414_tree);
                    }

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:444:58: 'key' ( 'errorstack' | 'googleanalytics' | 'twitter' | 'amazon' | 'kpds' | 'google' | ID ) key_value
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(444,58);
                    string_literal415=(Token)match(input,163,FOLLOW_163_in_pragma3174); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal415_tree = (Object)adaptor.create(string_literal415);
                    adaptor.addChild(root_0, string_literal415_tree);
                    }
                    dbg.location(444,64);
                    set416=(Token)input.LT(1);
                    if ( input.LA(1)==ID||(input.LA(1)>=164 && input.LA(1)<=169) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set416));
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(444,137);
                    pushFollow(FOLLOW_key_value_in_pragma3194);
                    key_value417=key_value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, key_value417.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:445:4: authz_pragma
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(445,4);
                    pushFollow(FOLLOW_authz_pragma_in_pragma3200);
                    authz_pragma418=authz_pragma();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, authz_pragma418.getTree());

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:446:4: logging_pargma
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(446,4);
                    pushFollow(FOLLOW_logging_pargma_in_pragma3205);
                    logging_pargma419=logging_pargma();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logging_pargma419.getTree());

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:447:4: 'use' 'module' ID ( alias )?
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(447,4);
                    string_literal420=(Token)match(input,170,FOLLOW_170_in_pragma3210); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal420_tree = (Object)adaptor.create(string_literal420);
                    adaptor.addChild(root_0, string_literal420_tree);
                    }
                    dbg.location(447,10);
                    string_literal421=(Token)match(input,171,FOLLOW_171_in_pragma3212); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal421_tree = (Object)adaptor.create(string_literal421);
                    adaptor.addChild(root_0, string_literal421_tree);
                    }
                    dbg.location(447,19);
                    ID422=(Token)match(input,ID,FOLLOW_ID_in_pragma3214); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID422_tree = (Object)adaptor.create(ID422);
                    adaptor.addChild(root_0, ID422_tree);
                    }
                    dbg.location(447,22);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:447:22: ( alias )?
                    int alt64=2;
                    try { dbg.enterSubRule(64);
                    try { dbg.enterDecision(64);

                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==179) ) {
                        alt64=1;
                    }
                    } finally {dbg.exitDecision(64);}

                    switch (alt64) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:447:22: alias
                            {
                            dbg.location(447,22);
                            pushFollow(FOLLOW_alias_in_pragma3216);
                            alias423=alias();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, alias423.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(64);}


                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:448:4: 'use' ( 'css' | 'javascript' ) 'resource' location
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(448,4);
                    string_literal424=(Token)match(input,170,FOLLOW_170_in_pragma3222); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal424_tree = (Object)adaptor.create(string_literal424);
                    adaptor.addChild(root_0, string_literal424_tree);
                    }
                    dbg.location(448,10);
                    set425=(Token)input.LT(1);
                    if ( input.LA(1)==83||input.LA(1)==172 ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set425));
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(448,33);
                    string_literal426=(Token)match(input,173,FOLLOW_173_in_pragma3232); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal426_tree = (Object)adaptor.create(string_literal426);
                    adaptor.addChild(root_0, string_literal426_tree);
                    }
                    dbg.location(448,44);
                    pushFollow(FOLLOW_location_in_pragma3234);
                    location427=location();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, location427.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(449, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "pragma");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "pragma"

    public static class authz_pragma_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "authz_pragma"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:451:1: authz_pragma : 'authz' 'require' 'user' ;
    public final rulesetParser.authz_pragma_return authz_pragma() throws RecognitionException {
        rulesetParser.authz_pragma_return retval = new rulesetParser.authz_pragma_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal428=null;
        Token string_literal429=null;
        Token string_literal430=null;

        Object string_literal428_tree=null;
        Object string_literal429_tree=null;
        Object string_literal430_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "authz_pragma");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(451, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:452:2: ( 'authz' 'require' 'user' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:452:4: 'authz' 'require' 'user'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(452,4);
            string_literal428=(Token)match(input,174,FOLLOW_174_in_authz_pragma3246); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal428_tree = (Object)adaptor.create(string_literal428);
            adaptor.addChild(root_0, string_literal428_tree);
            }
            dbg.location(452,12);
            string_literal429=(Token)match(input,175,FOLLOW_175_in_authz_pragma3248); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal429_tree = (Object)adaptor.create(string_literal429);
            adaptor.addChild(root_0, string_literal429_tree);
            }
            dbg.location(452,22);
            string_literal430=(Token)match(input,176,FOLLOW_176_in_authz_pragma3250); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal430_tree = (Object)adaptor.create(string_literal430);
            adaptor.addChild(root_0, string_literal430_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(453, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "authz_pragma");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "authz_pragma"

    public static class logging_pargma_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logging_pargma"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:455:1: logging_pargma : 'logging' ( 'on' | 'off' ) ;
    public final rulesetParser.logging_pargma_return logging_pargma() throws RecognitionException {
        rulesetParser.logging_pargma_return retval = new rulesetParser.logging_pargma_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal431=null;
        Token set432=null;

        Object string_literal431_tree=null;
        Object set432_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "logging_pargma");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(455, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:456:2: ( 'logging' ( 'on' | 'off' ) )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:456:4: 'logging' ( 'on' | 'off' )
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(456,4);
            string_literal431=(Token)match(input,177,FOLLOW_177_in_logging_pargma3262); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal431_tree = (Object)adaptor.create(string_literal431);
            adaptor.addChild(root_0, string_literal431_tree);
            }
            dbg.location(456,14);
            set432=(Token)input.LT(1);
            if ( input.LA(1)==79||input.LA(1)==178 ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set432));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(457, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "logging_pargma");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "logging_pargma"

    public static class alias_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "alias"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:459:1: alias : 'alias' ID ;
    public final rulesetParser.alias_return alias() throws RecognitionException {
        rulesetParser.alias_return retval = new rulesetParser.alias_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal433=null;
        Token ID434=null;

        Object string_literal433_tree=null;
        Object ID434_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "alias");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(459, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:459:7: ( 'alias' ID )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:459:9: 'alias' ID
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(459,9);
            string_literal433=(Token)match(input,179,FOLLOW_179_in_alias3279); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal433_tree = (Object)adaptor.create(string_literal433);
            adaptor.addChild(root_0, string_literal433_tree);
            }
            dbg.location(459,17);
            ID434=(Token)match(input,ID,FOLLOW_ID_in_alias3281); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID434_tree = (Object)adaptor.create(ID434);
            adaptor.addChild(root_0, ID434_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(459, 19);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "alias");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "alias"

    public static class location_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "location"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:461:1: location : ( STRING | ID );
    public final rulesetParser.location_return location() throws RecognitionException {
        rulesetParser.location_return retval = new rulesetParser.location_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set435=null;

        Object set435_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "location");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(461, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:461:9: ( STRING | ID )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(461,9);
            set435=(Token)input.LT(1);
            if ( input.LA(1)==ID||input.LA(1)==STRING ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set435));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(461, 22);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "location");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "location"

    public static class desc_block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "desc_block"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:463:1: desc_block : 'description' ( HTML | STRING ) ;
    public final rulesetParser.desc_block_return desc_block() throws RecognitionException {
        rulesetParser.desc_block_return retval = new rulesetParser.desc_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal436=null;
        Token set437=null;

        Object string_literal436_tree=null;
        Object set437_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "desc_block");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(463, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:464:2: ( 'description' ( HTML | STRING ) )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:464:4: 'description' ( HTML | STRING )
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(464,4);
            string_literal436=(Token)match(input,180,FOLLOW_180_in_desc_block3303); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal436_tree = (Object)adaptor.create(string_literal436);
            adaptor.addChild(root_0, string_literal436_tree);
            }
            dbg.location(464,18);
            set437=(Token)input.LT(1);
            if ( input.LA(1)==STRING||input.LA(1)==HTML ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set437));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(465, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "desc_block");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "desc_block"

    public static class key_value_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "key_value"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:468:1: key_value : ( STRING | ( name_value_pair )+ );
    public final rulesetParser.key_value_return key_value() throws RecognitionException {
        rulesetParser.key_value_return retval = new rulesetParser.key_value_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STRING438=null;
        rulesetParser.name_value_pair_return name_value_pair439 = null;


        Object STRING438_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "key_value");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(468, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:469:2: ( STRING | ( name_value_pair )+ )
            int alt67=2;
            try { dbg.enterDecision(67);

            int LA67_0 = input.LA(1);

            if ( (LA67_0==STRING) ) {
                int LA67_1 = input.LA(2);

                if ( (LA67_1==38) ) {
                    alt67=2;
                }
                else if ( (LA67_1==21||(LA67_1>=161 && LA67_1<=163)||LA67_1==170||LA67_1==174||LA67_1==177||LA67_1==180) ) {
                    alt67=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 67, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(67);}

            switch (alt67) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:469:4: STRING
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(469,4);
                    STRING438=(Token)match(input,STRING,FOLLOW_STRING_in_key_value3323); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING438_tree = (Object)adaptor.create(STRING438);
                    adaptor.addChild(root_0, STRING438_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:469:13: ( name_value_pair )+
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(469,13);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:469:13: ( name_value_pair )+
                    int cnt66=0;
                    try { dbg.enterSubRule(66);

                    loop66:
                    do {
                        int alt66=2;
                        try { dbg.enterDecision(66);

                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==STRING) ) {
                            alt66=1;
                        }


                        } finally {dbg.exitDecision(66);}

                        switch (alt66) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:469:13: name_value_pair
                    	    {
                    	    dbg.location(469,13);
                    	    pushFollow(FOLLOW_name_value_pair_in_key_value3327);
                    	    name_value_pair439=name_value_pair();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, name_value_pair439.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt66 >= 1 ) break loop66;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(66, input);
                                dbg.recognitionException(eee);

                                throw eee;
                        }
                        cnt66++;
                    } while (true);
                    } finally {dbg.exitSubRule(66);}


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(470, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "key_value");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "key_value"

    public static class name_value_pair_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "name_value_pair"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:472:1: name_value_pair : STRING ':' ( INT | STRING ) ;
    public final rulesetParser.name_value_pair_return name_value_pair() throws RecognitionException {
        rulesetParser.name_value_pair_return retval = new rulesetParser.name_value_pair_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STRING440=null;
        Token char_literal441=null;
        Token set442=null;

        Object STRING440_tree=null;
        Object char_literal441_tree=null;
        Object set442_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "name_value_pair");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(472, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:473:2: ( STRING ':' ( INT | STRING ) )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:473:4: STRING ':' ( INT | STRING )
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(473,4);
            STRING440=(Token)match(input,STRING,FOLLOW_STRING_in_name_value_pair3343); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING440_tree = (Object)adaptor.create(STRING440);
            adaptor.addChild(root_0, STRING440_tree);
            }
            dbg.location(473,11);
            char_literal441=(Token)match(input,38,FOLLOW_38_in_name_value_pair3345); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal441_tree = (Object)adaptor.create(char_literal441);
            adaptor.addChild(root_0, char_literal441_tree);
            }
            dbg.location(473,15);
            set442=(Token)input.LT(1);
            if ( input.LA(1)==INT||input.LA(1)==STRING ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set442));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(474, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "name_value_pair");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "name_value_pair"

    // $ANTLR start synpred1_ruleset
    public final void synpred1_ruleset_fragment() throws RecognitionException {   
        // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:220:4: ( event_or 'then' )
        dbg.enterAlt(1);

        // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:220:4: event_or 'then'
        {
        dbg.location(220,4);
        pushFollow(FOLLOW_event_or_in_synpred1_ruleset1597);
        event_or();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(220,13);
        match(input,56,FOLLOW_56_in_synpred1_ruleset1599); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_ruleset

    // $ANTLR start synpred2_ruleset
    public final void synpred2_ruleset_fragment() throws RecognitionException {   
        // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:221:3: ( event_or 'before' )
        dbg.enterAlt(1);

        // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:221:3: event_or 'before'
        {
        dbg.location(221,3);
        pushFollow(FOLLOW_event_or_in_synpred2_ruleset1604);
        event_or();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(221,12);
        match(input,69,FOLLOW_69_in_synpred2_ruleset1606); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_ruleset

    // $ANTLR start synpred6_ruleset
    public final void synpred6_ruleset_fragment() throws RecognitionException {   
        // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:293:4: ( disjunction '=>' expr '|' expr )
        dbg.enterAlt(1);

        // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:293:4: disjunction '=>' expr '|' expr
        {
        dbg.location(293,4);
        pushFollow(FOLLOW_disjunction_in_synpred6_ruleset2103);
        disjunction();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(293,16);
        match(input,60,FOLLOW_60_in_synpred6_ruleset2105); if (state.failed) return ;
        dbg.location(293,21);
        pushFollow(FOLLOW_expr_in_synpred6_ruleset2107);
        expr();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(293,26);
        match(input,85,FOLLOW_85_in_synpred6_ruleset2109); if (state.failed) return ;
        dbg.location(293,30);
        pushFollow(FOLLOW_expr_in_synpred6_ruleset2111);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_ruleset

    // $ANTLR start synpred8_ruleset
    public final void synpred8_ruleset_fragment() throws RecognitionException {   
        // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:322:2: ( 'seen' STRING 'in' var_domain ':' ID timeframe )
        dbg.enterAlt(1);

        // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:322:2: 'seen' STRING 'in' var_domain ':' ID timeframe
        {
        dbg.location(322,2);
        match(input,102,FOLLOW_102_in_synpred8_ruleset2303); if (state.failed) return ;
        dbg.location(322,9);
        match(input,STRING,FOLLOW_STRING_in_synpred8_ruleset2305); if (state.failed) return ;
        dbg.location(322,16);
        match(input,41,FOLLOW_41_in_synpred8_ruleset2307); if (state.failed) return ;
        dbg.location(322,21);
        pushFollow(FOLLOW_var_domain_in_synpred8_ruleset2309);
        var_domain();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(322,32);
        match(input,38,FOLLOW_38_in_synpred8_ruleset2311); if (state.failed) return ;
        dbg.location(322,36);
        match(input,ID,FOLLOW_ID_in_synpred8_ruleset2313); if (state.failed) return ;
        dbg.location(322,39);
        pushFollow(FOLLOW_timeframe_in_synpred8_ruleset2315);
        timeframe();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred8_ruleset

    // $ANTLR start synpred9_ruleset
    public final void synpred9_ruleset_fragment() throws RecognitionException {   
        // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:323:2: ( 'seen' STRING ( 'before' | 'after' ) STRING 'in' var_domain ':' ID )
        dbg.enterAlt(1);

        // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:323:2: 'seen' STRING ( 'before' | 'after' ) STRING 'in' var_domain ':' ID
        {
        dbg.location(323,2);
        match(input,102,FOLLOW_102_in_synpred9_ruleset2320); if (state.failed) return ;
        dbg.location(323,9);
        match(input,STRING,FOLLOW_STRING_in_synpred9_ruleset2322); if (state.failed) return ;
        dbg.location(323,16);
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

        dbg.location(323,37);
        match(input,STRING,FOLLOW_STRING_in_synpred9_ruleset2332); if (state.failed) return ;
        dbg.location(323,44);
        match(input,41,FOLLOW_41_in_synpred9_ruleset2334); if (state.failed) return ;
        dbg.location(323,49);
        pushFollow(FOLLOW_var_domain_in_synpred9_ruleset2336);
        var_domain();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(323,60);
        match(input,38,FOLLOW_38_in_synpred9_ruleset2338); if (state.failed) return ;
        dbg.location(323,64);
        match(input,ID,FOLLOW_ID_in_synpred9_ruleset2340); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_ruleset

    // $ANTLR start synpred10_ruleset
    public final void synpred10_ruleset_fragment() throws RecognitionException {   
        // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:324:2: ( var_domain ':' ID predop expr timeframe )
        dbg.enterAlt(1);

        // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:324:2: var_domain ':' ID predop expr timeframe
        {
        dbg.location(324,2);
        pushFollow(FOLLOW_var_domain_in_synpred10_ruleset2345);
        var_domain();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(324,13);
        match(input,38,FOLLOW_38_in_synpred10_ruleset2347); if (state.failed) return ;
        dbg.location(324,17);
        match(input,ID,FOLLOW_ID_in_synpred10_ruleset2349); if (state.failed) return ;
        dbg.location(324,20);
        pushFollow(FOLLOW_predop_in_synpred10_ruleset2351);
        predop();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(324,27);
        pushFollow(FOLLOW_expr_in_synpred10_ruleset2353);
        expr();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(324,32);
        pushFollow(FOLLOW_timeframe_in_synpred10_ruleset2355);
        timeframe();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_ruleset

    // $ANTLR start synpred11_ruleset
    public final void synpred11_ruleset_fragment() throws RecognitionException {   
        // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:325:2: ( var_domain ':' ID timeframe )
        dbg.enterAlt(1);

        // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:325:2: var_domain ':' ID timeframe
        {
        dbg.location(325,2);
        pushFollow(FOLLOW_var_domain_in_synpred11_ruleset2360);
        var_domain();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(325,13);
        match(input,38,FOLLOW_38_in_synpred11_ruleset2362); if (state.failed) return ;
        dbg.location(325,17);
        match(input,ID,FOLLOW_ID_in_synpred11_ruleset2364); if (state.failed) return ;
        dbg.location(325,20);
        pushFollow(FOLLOW_timeframe_in_synpred11_ruleset2366);
        timeframe();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred11_ruleset

    // $ANTLR start synpred18_ruleset
    public final void synpred18_ruleset_fragment() throws RecognitionException {   
        // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:341:9: ( ID '[' expr ']' )
        dbg.enterAlt(1);

        // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:341:9: ID '[' expr ']'
        {
        dbg.location(341,9);
        match(input,ID,FOLLOW_ID_in_synpred18_ruleset2474); if (state.failed) return ;
        dbg.location(341,12);
        match(input,106,FOLLOW_106_in_synpred18_ruleset2476); if (state.failed) return ;
        dbg.location(341,16);
        pushFollow(FOLLOW_expr_in_synpred18_ruleset2478);
        expr();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(341,21);
        match(input,107,FOLLOW_107_in_synpred18_ruleset2480); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_ruleset

    // $ANTLR start synpred21_ruleset
    public final void synpred21_ruleset_fragment() throws RecognitionException {   
        // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:344:9: ( function_app )
        dbg.enterAlt(1);

        // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:344:9: function_app
        {
        dbg.location(344,9);
        pushFollow(FOLLOW_function_app_in_synpred21_ruleset2510);
        function_app();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred21_ruleset

    // $ANTLR start synpred24_ruleset
    public final void synpred24_ruleset_fragment() throws RecognitionException {   
        // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:347:9: ( ID )
        dbg.enterAlt(1);

        // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:347:9: ID
        {
        dbg.location(347,9);
        match(input,ID,FOLLOW_ID_in_synpred24_ruleset2556); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred24_ruleset

    // Delegated rules

    public final boolean synpred21_ruleset() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred21_ruleset_fragment(); // can never throw exception
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
    public final boolean synpred24_ruleset() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred24_ruleset_fragment(); // can never throw exception
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
    public final boolean synpred8_ruleset() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred8_ruleset_fragment(); // can never throw exception
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
    public final boolean synpred2_ruleset() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred2_ruleset_fragment(); // can never throw exception
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
    public final boolean synpred1_ruleset() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred1_ruleset_fragment(); // can never throw exception
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
    public final boolean synpred10_ruleset() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred10_ruleset_fragment(); // can never throw exception
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
    public final boolean synpred11_ruleset() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred11_ruleset_fragment(); // can never throw exception
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
    public final boolean synpred18_ruleset() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred18_ruleset_fragment(); // can never throw exception
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
    public final boolean synpred9_ruleset() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred9_ruleset_fragment(); // can never throw exception
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
    public final boolean synpred6_ruleset() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred6_ruleset_fragment(); // can never throw exception
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


    protected DFA41 dfa41 = new DFA41(this);
    protected DFA47 dfa47 = new DFA47(this);
    protected DFA51 dfa51 = new DFA51(this);
    protected DFA65 dfa65 = new DFA65(this);
    static final String DFA41_eotS =
        "\22\uffff";
    static final String DFA41_eofS =
        "\22\uffff";
    static final String DFA41_minS =
        "\1\4\17\0\2\uffff";
    static final String DFA41_maxS =
        "\1\u0087\17\0\2\uffff";
    static final String DFA41_acceptS =
        "\20\uffff\1\1\1\2";
    static final String DFA41_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\2\uffff}>";
    static final String[] DFA41_transitionS = {
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

    static final short[] DFA41_eot = DFA.unpackEncodedString(DFA41_eotS);
    static final short[] DFA41_eof = DFA.unpackEncodedString(DFA41_eofS);
    static final char[] DFA41_min = DFA.unpackEncodedStringToUnsignedChars(DFA41_minS);
    static final char[] DFA41_max = DFA.unpackEncodedStringToUnsignedChars(DFA41_maxS);
    static final short[] DFA41_accept = DFA.unpackEncodedString(DFA41_acceptS);
    static final short[] DFA41_special = DFA.unpackEncodedString(DFA41_specialS);
    static final short[][] DFA41_transition;

    static {
        int numStates = DFA41_transitionS.length;
        DFA41_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA41_transition[i] = DFA.unpackEncodedString(DFA41_transitionS[i]);
        }
    }

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = DFA41_eot;
            this.eof = DFA41_eof;
            this.min = DFA41_min;
            this.max = DFA41_max;
            this.accept = DFA41_accept;
            this.special = DFA41_special;
            this.transition = DFA41_transition;
        }
        public String getDescription() {
            return "292:1: conditional_expression options {backtrack=true; } : ( disjunction '=>' expr '|' expr | disjunction );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA41_1 = input.LA(1);

                         
                        int index41_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_ruleset()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index41_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA41_2 = input.LA(1);

                         
                        int index41_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_ruleset()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index41_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA41_3 = input.LA(1);

                         
                        int index41_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_ruleset()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index41_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA41_4 = input.LA(1);

                         
                        int index41_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_ruleset()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index41_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA41_5 = input.LA(1);

                         
                        int index41_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_ruleset()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index41_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA41_6 = input.LA(1);

                         
                        int index41_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_ruleset()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index41_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA41_7 = input.LA(1);

                         
                        int index41_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_ruleset()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index41_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA41_8 = input.LA(1);

                         
                        int index41_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_ruleset()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index41_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA41_9 = input.LA(1);

                         
                        int index41_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_ruleset()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index41_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA41_10 = input.LA(1);

                         
                        int index41_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_ruleset()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index41_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA41_11 = input.LA(1);

                         
                        int index41_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_ruleset()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index41_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA41_12 = input.LA(1);

                         
                        int index41_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_ruleset()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index41_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA41_13 = input.LA(1);

                         
                        int index41_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_ruleset()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index41_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA41_14 = input.LA(1);

                         
                        int index41_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_ruleset()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index41_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA41_15 = input.LA(1);

                         
                        int index41_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_ruleset()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index41_15);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 41, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA47_eotS =
        "\24\uffff";
    static final String DFA47_eofS =
        "\24\uffff";
    static final String DFA47_minS =
        "\1\4\1\uffff\2\0\20\uffff";
    static final String DFA47_maxS =
        "\1\u0087\1\uffff\2\0\20\uffff";
    static final String DFA47_acceptS =
        "\1\uffff\1\1\2\uffff\1\6\13\uffff\1\2\1\3\1\4\1\5";
    static final String DFA47_specialS =
        "\2\uffff\1\0\1\1\20\uffff}>";
    static final String[] DFA47_transitionS = {
            "\2\4\5\uffff\1\4\6\uffff\1\4\1\uffff\1\4\44\uffff\1\4\15\uffff"+
            "\1\1\32\uffff\1\4\3\uffff\1\2\1\uffff\3\4\1\uffff\2\4\30\uffff"+
            "\2\3",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA47_eot = DFA.unpackEncodedString(DFA47_eotS);
    static final short[] DFA47_eof = DFA.unpackEncodedString(DFA47_eofS);
    static final char[] DFA47_min = DFA.unpackEncodedStringToUnsignedChars(DFA47_minS);
    static final char[] DFA47_max = DFA.unpackEncodedStringToUnsignedChars(DFA47_maxS);
    static final short[] DFA47_accept = DFA.unpackEncodedString(DFA47_acceptS);
    static final short[] DFA47_special = DFA.unpackEncodedString(DFA47_specialS);
    static final short[][] DFA47_transition;

    static {
        int numStates = DFA47_transitionS.length;
        DFA47_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA47_transition[i] = DFA.unpackEncodedString(DFA47_transitionS[i]);
        }
    }

    class DFA47 extends DFA {

        public DFA47(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 47;
            this.eot = DFA47_eot;
            this.eof = DFA47_eof;
            this.min = DFA47_min;
            this.max = DFA47_max;
            this.accept = DFA47_accept;
            this.special = DFA47_special;
            this.transition = DFA47_transition;
        }
        public String getDescription() {
            return "320:1: unary_expr options {backtrack=true; } : ( 'not' unary_expr | 'seen' STRING 'in' var_domain ':' ID timeframe | 'seen' STRING ( 'before' | 'after' ) STRING 'in' var_domain ':' ID | var_domain ':' ID predop expr timeframe | var_domain ':' ID timeframe | operator_expr );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA47_2 = input.LA(1);

                         
                        int index47_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_ruleset()) ) {s = 16;}

                        else if ( (synpred9_ruleset()) ) {s = 17;}

                         
                        input.seek(index47_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA47_3 = input.LA(1);

                         
                        int index47_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_ruleset()) ) {s = 18;}

                        else if ( (synpred11_ruleset()) ) {s = 19;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index47_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 47, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA51_eotS =
        "\21\uffff";
    static final String DFA51_eofS =
        "\21\uffff";
    static final String DFA51_minS =
        "\1\4\6\uffff\1\0\11\uffff";
    static final String DFA51_maxS =
        "\1\u0087\6\uffff\1\0\11\uffff";
    static final String DFA51_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\10\1\11\1\uffff\1\13"+
        "\1\14\1\16\1\7\1\12\1\15";
    static final String DFA51_specialS =
        "\7\uffff\1\0\11\uffff}>";
    static final String[] DFA51_transitionS = {
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

    static final short[] DFA51_eot = DFA.unpackEncodedString(DFA51_eotS);
    static final short[] DFA51_eof = DFA.unpackEncodedString(DFA51_eofS);
    static final char[] DFA51_min = DFA.unpackEncodedStringToUnsignedChars(DFA51_minS);
    static final char[] DFA51_max = DFA.unpackEncodedStringToUnsignedChars(DFA51_maxS);
    static final short[] DFA51_accept = DFA.unpackEncodedString(DFA51_acceptS);
    static final short[] DFA51_special = DFA.unpackEncodedString(DFA51_specialS);
    static final short[][] DFA51_transition;

    static {
        int numStates = DFA51_transitionS.length;
        DFA51_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA51_transition[i] = DFA.unpackEncodedString(DFA51_transitionS[i]);
        }
    }

    class DFA51 extends DFA {

        public DFA51(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 51;
            this.eot = DFA51_eot;
            this.eof = DFA51_eof;
            this.min = DFA51_min;
            this.max = DFA51_max;
            this.accept = DFA51_accept;
            this.special = DFA51_special;
            this.transition = DFA51_transition;
        }
        public String getDescription() {
            return "334:1: factor options {backtrack=true; } : ( INT | '-' INT | STRING | REGEXP | 'true' | 'false' | ID '[' expr ']' | persistent_var | trail_exp | function_app | '[' expr ',' ']' | '{' ( hash_line ( ',' )? )* '}' | ID | '(' expr ')' );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA51_7 = input.LA(1);

                         
                        int index51_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_ruleset()) ) {s = 14;}

                        else if ( (synpred21_ruleset()) ) {s = 15;}

                        else if ( (synpred24_ruleset()) ) {s = 16;}

                         
                        input.seek(index51_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 51, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA65_eotS =
        "\12\uffff";
    static final String DFA65_eofS =
        "\12\uffff";
    static final String DFA65_minS =
        "\1\u00a1\6\uffff\1\123\2\uffff";
    static final String DFA65_maxS =
        "\1\u00b4\6\uffff\1\u00ac\2\uffff";
    static final String DFA65_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\7\1\10";
    static final String DFA65_specialS =
        "\12\uffff}>";
    static final String[] DFA65_transitionS = {
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

    static final short[] DFA65_eot = DFA.unpackEncodedString(DFA65_eotS);
    static final short[] DFA65_eof = DFA.unpackEncodedString(DFA65_eofS);
    static final char[] DFA65_min = DFA.unpackEncodedStringToUnsignedChars(DFA65_minS);
    static final char[] DFA65_max = DFA.unpackEncodedStringToUnsignedChars(DFA65_maxS);
    static final short[] DFA65_accept = DFA.unpackEncodedString(DFA65_acceptS);
    static final short[] DFA65_special = DFA.unpackEncodedString(DFA65_specialS);
    static final short[][] DFA65_transition;

    static {
        int numStates = DFA65_transitionS.length;
        DFA65_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA65_transition[i] = DFA.unpackEncodedString(DFA65_transitionS[i]);
        }
    }

    class DFA65 extends DFA {

        public DFA65(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 65;
            this.eot = DFA65_eot;
            this.eof = DFA65_eof;
            this.min = DFA65_min;
            this.max = DFA65_max;
            this.accept = DFA65_accept;
            this.special = DFA65_special;
            this.transition = DFA65_transition;
        }
        public String getDescription() {
            return "444:1: pragma : ( desc_block | 'name' STRING | 'author' STRING | 'key' ( 'errorstack' | 'googleanalytics' | 'twitter' | 'amazon' | 'kpds' | 'google' | ID ) key_value | authz_pragma | logging_pargma | 'use' 'module' ID ( alias )? | 'use' ( 'css' | 'javascript' ) 'resource' location );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
 

    public static final BitSet FOLLOW_19_in_ruleset653 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rulesetname_in_ruleset655 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleset657 = new BitSet(new long[]{0x0000000000600000L,0x0000000000010000L,0x0000000120000000L});
    public static final BitSet FOLLOW_meta_block_in_ruleset665 = new BitSet(new long[]{0x0000000000600000L,0x0000000000010000L,0x0000000120000000L});
    public static final BitSet FOLLOW_dispatch_block_in_ruleset673 = new BitSet(new long[]{0x0000000000600000L,0x0000000000010000L,0x0000000120000000L});
    public static final BitSet FOLLOW_global_decls_in_ruleset680 = new BitSet(new long[]{0x0000000000600000L,0x0000000000010000L,0x0000000120000000L});
    public static final BitSet FOLLOW_rule_in_ruleset688 = new BitSet(new long[]{0x0000000000600000L,0x0000000000010000L,0x0000000120000000L});
    public static final BitSet FOLLOW_21_in_ruleset696 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_ruleset698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_rulesetname0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule754 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_rule756 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rule758 = new BitSet(new long[]{0x00E0000000000000L});
    public static final BitSet FOLLOW_rule_state_in_rule760 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rule762 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_select_in_rule765 = new BitSet(new long[]{0xC000000020000010L,0x0000000000000001L,0x0000000000000100L});
    public static final BitSet FOLLOW_pre_block_in_rule767 = new BitSet(new long[]{0xC000000020000010L,0x0000000000000001L,0x0000000000000100L});
    public static final BitSet FOLLOW_emit_block_in_rule770 = new BitSet(new long[]{0xC000000020000010L,0x0000000000000001L,0x0000000000000100L});
    public static final BitSet FOLLOW_action_in_rule773 = new BitSet(new long[]{0x000000004F200000L});
    public static final BitSet FOLLOW_24_in_rule775 = new BitSet(new long[]{0x000000004E200000L});
    public static final BitSet FOLLOW_callbacks_in_rule778 = new BitSet(new long[]{0x000000000E200000L});
    public static final BitSet FOLLOW_post_block_in_rule781 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rule785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_post_in_post_block799 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_post_block801 = new BitSet(new long[]{0x000385A000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_post_statement_in_post_block803 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_post_block805 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_post_block807 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_post_block809 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_post_alternate_in_post_block811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_post0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_post_alternate842 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_post_alternate844 = new BitSet(new long[]{0x000385A000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_post_statement_in_post_alternate846 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_post_alternate848 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_post_alternate850 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_post_alternate852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_persistent_expr_in_post_statement859 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_post_statement862 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_post_statement864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_log_statement_in_post_statement871 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_post_statement874 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_post_statement876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_control_statement_in_post_statement883 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_post_statement886 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_post_statement888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_raise_statement_in_post_statement895 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_post_statement898 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_post_statement900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_callbacks912 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_callbacks914 = new BitSet(new long[]{0x0000000180200000L});
    public static final BitSet FOLLOW_success_in_callbacks916 = new BitSet(new long[]{0x0000000100200000L});
    public static final BitSet FOLLOW_failure_in_callbacks919 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_callbacks922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_success929 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_success931 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_click_in_success933 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_24_in_success935 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_success938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_failure945 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_failure947 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_click_in_failure949 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_24_in_failure951 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_failure956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_click963 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_click971 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_click973 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_click975 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_click_link_in_click977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_click_link985 = new BitSet(new long[]{0x000005A000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_persistent_expr_in_click_link987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_persistent_clear_in_persistent_expr995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_persistent_set_in_persistent_expr1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_persistent_iterate_in_persistent_expr1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_trail_forget_in_persistent_expr1016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_trail_mark_in_persistent_expr1023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_persistent_clear1031 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_var_domain_in_persistent_clear1033 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_persistent_clear1035 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_persistent_clear1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_persistent_set1044 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_var_domain_in_persistent_set1046 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_persistent_set1048 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_persistent_set1050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_domain_in_persistent_iterate1057 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_persistent_iterate1059 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_persistent_iterate1061 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_counter_op_in_persistent_iterate1063 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_persistent_iterate1065 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_counter_start_in_persistent_iterate1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_trail_forget1074 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_trail_forget1076 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_trail_forget1078 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_var_domain_in_trail_forget1080 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_trail_forget1082 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_trail_forget1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_trail_mark1091 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_var_domain_in_trail_mark1093 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_trail_mark1095 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_trail_mark1097 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_trail_with_in_trail_mark1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_trail_with1106 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_trail_with1108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_counter_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_counter_start1137 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_counter_start1139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_log_statement1147 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_log_statement1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_control_statement1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_raise_statement1163 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_raise_statement1165 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_raise_statement1167 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_raise_statement1169 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_for_clause_in_raise_statement1171 = new BitSet(new long[]{0x2000080000000000L});
    public static final BitSet FOLLOW_modifier_clause_in_raise_statement1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_for_clause1180 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_for_clause1182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_rule_state0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_action_in_action1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unconditional_action_in_action1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_conditional_action1272 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_conditional_action1274 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_conditional_action1276 = new BitSet(new long[]{0xC000000020000010L,0x0000000000000001L,0x0000000000000100L});
    public static final BitSet FOLLOW_unconditional_action_in_conditional_action1278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primrule_in_unconditional_action1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actionblock_in_unconditional_action1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule_label_in_primrule1308 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_namespace_in_primrule1311 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_primrule1314 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_primrule1316 = new BitSet(new long[]{0x0A00000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_primrule1319 = new BitSet(new long[]{0x0E00000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_58_in_primrule1321 = new BitSet(new long[]{0x0A00000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_59_in_primrule1326 = new BitSet(new long[]{0x2000080000000002L});
    public static final BitSet FOLLOW_modifier_clause_in_primrule1329 = new BitSet(new long[]{0x2000080000000002L});
    public static final BitSet FOLLOW_rule_label_in_primrule1338 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_emit_block_in_primrule1341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_rule_label1362 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_rule_label1364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_modifier_clause1384 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_modifier_in_modifier_clause1386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_modifier_clause1392 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_modifier_in_modifier_clause1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_modifier1407 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_modifier1409 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_modifier1411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_modifier1418 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_modifier1420 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_JS_in_modifier1422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blocktype_in_actionblock1435 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_actionblock1437 = new BitSet(new long[]{0x0000000000200010L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_primrule_in_actionblock1440 = new BitSet(new long[]{0x0000000001200010L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_24_in_actionblock1442 = new BitSet(new long[]{0x0000000000200010L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_21_in_actionblock1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_blocktype0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_pre_block1489 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_pre_block1491 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_decl_in_pre_block1493 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_pre_block1495 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_pre_block1497 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_pre_block1499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_foreach1519 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_foreach1521 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_setting_in_foreach1523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_select1542 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_using_in_select1545 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_when_in_select1547 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_foreach_in_select1550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_using1563 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_using1565 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_setting_in_using1567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_when1574 = new BitSet(new long[]{0x0200000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_event_seq_in_when1576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_event_or_in_event_seq1597 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_event_seq1599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_event_or_in_event_seq1604 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_event_seq1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_event_or_in_event_seq1611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_event_and_in_event_or1622 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_event_or1625 = new BitSet(new long[]{0x0200000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_event_and_in_event_or1627 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_event_btwn_in_event_and1638 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_event_and1641 = new BitSet(new long[]{0x0200000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_event_btwn_in_event_and1643 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_event_prim_in_event_btwn1656 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_event_btwn1659 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_event_btwn1662 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_event_btwn1664 = new BitSet(new long[]{0x0200000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_event_seq_in_event_btwn1666 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_event_btwn1668 = new BitSet(new long[]{0x0200000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_event_seq_in_event_btwn1670 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_event_btwn1672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_event_domain_in_event_prim1687 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_event_prim1689 = new BitSet(new long[]{0x0000000000040800L});
    public static final BitSet FOLLOW_set_in_event_prim1691 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_setting_in_event_prim1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_event_domain_in_event_prim1702 = new BitSet(new long[]{0x0000000600000000L,0x0000000000001C00L});
    public static final BitSet FOLLOW_set_in_event_prim1704 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_event_prim1716 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_on_expr_in_event_prim1718 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_setting_in_event_prim1721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_event_prim1726 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_event_prim1728 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_event_filter_in_event_prim1730 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_setting_in_event_prim1732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_event_prim1737 = new BitSet(new long[]{0x0200000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_event_seq_in_event_prim1739 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_event_prim1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_setting1752 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_setting1754 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_setting1756 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_setting1758 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_setting1760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_event_domain1770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_event_filter1784 = new BitSet(new long[]{0x0000000000040800L});
    public static final BitSet FOLLOW_set_in_event_filter1786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_on_expr1804 = new BitSet(new long[]{0x0000000000040800L});
    public static final BitSet FOLLOW_set_in_on_expr1806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_global_decls1830 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_global_decls1832 = new BitSet(new long[]{0x0000000000000010L,0x00000000000A0000L,0x0000000000000300L});
    public static final BitSet FOLLOW_global_in_global_decls1836 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_global_decls1838 = new BitSet(new long[]{0x0000000000200010L,0x00000000000A0000L,0x0000000000000300L});
    public static final BitSet FOLLOW_21_in_global_decls1843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emit_block_in_global1859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dataset_in_global1863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_datasource_in_global1867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_css_emit_in_global1871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decl_in_global1875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_datasource1887 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_datasource1889 = new BitSet(new long[]{0x0000004000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_datatype_in_datasource1891 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_datasource1894 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_datasource1896 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_cachable_in_datasource1898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_css_emit1910 = new BitSet(new long[]{0x0000000000010800L});
    public static final BitSet FOLLOW_set_in_css_emit1912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_decl1946 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_decl1948 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_HTML_in_decl1950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_decl1955 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_decl1957 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_JS_in_decl1959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_decl1964 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_decl1966 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_decl1968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_def_in_expr1998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_expression_in_expr2002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_function_def2027 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_function_def2029 = new BitSet(new long[]{0x0800000000000010L});
    public static final BitSet FOLLOW_ID_in_function_def2032 = new BitSet(new long[]{0x0C00000000000010L});
    public static final BitSet FOLLOW_58_in_function_def2034 = new BitSet(new long[]{0x0800000000000010L});
    public static final BitSet FOLLOW_59_in_function_def2039 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_function_def2041 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_fundecls_in_function_def2043 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_function_def2046 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_24_in_function_def2048 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_function_def2051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decl_in_fundecls2075 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_fundecls2077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_disjunction_in_conditional_expression2103 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_conditional_expression2105 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_conditional_expression2107 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_conditional_expression2109 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_conditional_expression2111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_disjunction_in_conditional_expression2115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conjunction_in_disjunction2128 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_disjunction2131 = new BitSet(new long[]{0x0200000000140830L,0x0000374400000080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_conjunction_in_disjunction2133 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_equality_expr_in_conjunction2149 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_conjunction2152 = new BitSet(new long[]{0x0200000000140830L,0x0000374400000080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_equality_expr_in_conjunction2154 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_add_expr_in_equality_expr2169 = new BitSet(new long[]{0x0000000000000002L,0x00000001FF000000L});
    public static final BitSet FOLLOW_predop_in_equality_expr2172 = new BitSet(new long[]{0x0200000000140830L,0x0000374400000080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_add_expr_in_equality_expr2174 = new BitSet(new long[]{0x0000000000000002L,0x00000001FF000000L});
    public static final BitSet FOLLOW_set_in_predop0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mult_expr_in_add_expr2228 = new BitSet(new long[]{0x0000000000000002L,0x0000000600000000L});
    public static final BitSet FOLLOW_add_op_in_add_expr2231 = new BitSet(new long[]{0x0200000000140830L,0x0000374400000080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_mult_expr_in_add_expr2233 = new BitSet(new long[]{0x0000000000000002L,0x0000000600000000L});
    public static final BitSet FOLLOW_set_in_add_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_expr_in_mult_expr2255 = new BitSet(new long[]{0x0000000000000002L,0x0000003800000000L});
    public static final BitSet FOLLOW_mult_op_in_mult_expr2258 = new BitSet(new long[]{0x0200000000140830L,0x0000374400000080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_unary_expr_in_mult_expr2260 = new BitSet(new long[]{0x0000000000000002L,0x0000003800000000L});
    public static final BitSet FOLLOW_set_in_mult_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_unary_expr2295 = new BitSet(new long[]{0x0200000000140830L,0x0000374400000080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_unary_expr_in_unary_expr2297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_unary_expr2303 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_unary_expr2305 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_unary_expr2307 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_var_domain_in_unary_expr2309 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_unary_expr2311 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_unary_expr2313 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_timeframe_in_unary_expr2315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_unary_expr2320 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_unary_expr2322 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000020L});
    public static final BitSet FOLLOW_set_in_unary_expr2324 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_unary_expr2332 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_unary_expr2334 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_var_domain_in_unary_expr2336 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_unary_expr2338 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_unary_expr2340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_domain_in_unary_expr2345 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_unary_expr2347 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_unary_expr2349 = new BitSet(new long[]{0x0000000000000000L,0x00000001FF000000L});
    public static final BitSet FOLLOW_predop_in_unary_expr2351 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_unary_expr2353 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_timeframe_in_unary_expr2355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_domain_in_unary_expr2360 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_unary_expr2362 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_unary_expr2364 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_timeframe_in_unary_expr2366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operator_expr_in_unary_expr2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_operator_expr2385 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_operator_in_operator_expr2387 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_INT_in_factor2412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_factor2422 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_INT_in_factor2424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_factor2434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REGEXP_in_factor2444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_factor2454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_factor2464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_factor2474 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_factor2476 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_factor2478 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_factor2480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_persistent_var_in_factor2490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_trail_exp_in_factor2500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_app_in_factor2510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_factor2520 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_factor2522 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_factor2524 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_factor2526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_factor2536 = new BitSet(new long[]{0x0000000000200800L});
    public static final BitSet FOLLOW_hash_line_in_factor2539 = new BitSet(new long[]{0x0400000000200800L});
    public static final BitSet FOLLOW_58_in_factor2541 = new BitSet(new long[]{0x0000000000200800L});
    public static final BitSet FOLLOW_21_in_factor2546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_factor2556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_factor2567 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_factor2569 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_factor2571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_hash_line2584 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_hash_line2586 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_hash_line2588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namespace_in_function_app2601 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_function_app2603 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_function_app2605 = new BitSet(new long[]{0x0A00000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_function_app2608 = new BitSet(new long[]{0x0E00000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_58_in_function_app2610 = new BitSet(new long[]{0x0A00000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_59_in_function_app2615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_function_app2621 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_function_app2623 = new BitSet(new long[]{0x0A00000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_function_app2626 = new BitSet(new long[]{0x0E00000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_58_in_function_app2628 = new BitSet(new long[]{0x0A00000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_59_in_function_app2633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_namespace2645 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_namespace2647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_trail_exp2659 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_var_domain_in_trail_exp2661 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_trail_exp2663 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_trail_exp2665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_trail_exp2670 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_trail_exp2672 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_var_domain_in_trail_exp2674 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_trail_exp2676 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_trail_exp2678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_domain_in_persistent_var2692 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_persistent_var2694 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_persistent_var2696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_operator2708 = new BitSet(new long[]{0x0000000000000000L,0xFFFF800000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_operator_op_in_operator2710 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_operator2712 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_operator2714 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_58_in_operator2716 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_operator2719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operator_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_timeframe2829 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_timeframe2831 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000001FFF8000L});
    public static final BitSet FOLLOW_periods_in_timeframe2834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_period_in_timeframe2838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_var_domain0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_emit_block2865 = new BitSet(new long[]{0x0000000000030800L});
    public static final BitSet FOLLOW_set_in_emit_block2867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_dataset2885 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_dataset2887 = new BitSet(new long[]{0x0000004000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_datatype_in_dataset2889 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_dataset2892 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_dataset2894 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_cachable_in_dataset2896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_datatype2906 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000003C00L});
    public static final BitSet FOLLOW_set_in_datatype2908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_142_in_cachable2925 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_cachetime_in_cachable2927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_cachetime2938 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_INT_in_cachetime2940 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000001FFF8000L});
    public static final BitSet FOLLOW_periods_in_cachetime2943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_period_in_cachetime2945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_periods0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_period0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_157_in_dispatch_block3080 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_dispatch_block3082 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_dispatch_in_dispatch_block3084 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_21_in_dispatch_block3087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_158_in_dispatch3096 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_dispatch3098 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_dispatch_target_in_dispatch3100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_159_in_dispatch_target3111 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_dispatch_target3113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_160_in_meta_block3136 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_meta_block3138 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000000L,0x0012440E00000000L});
    public static final BitSet FOLLOW_pragma_in_meta_block3140 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000000L,0x0012440E00000000L});
    public static final BitSet FOLLOW_21_in_meta_block3144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_desc_block_in_pragma3158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_161_in_pragma3162 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_pragma3164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_162_in_pragma3168 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_pragma3170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_163_in_pragma3174 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000000L,0x000003F000000000L});
    public static final BitSet FOLLOW_set_in_pragma3176 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_key_value_in_pragma3194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_authz_pragma_in_pragma3200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logging_pargma_in_pragma3205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_170_in_pragma3210 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_171_in_pragma3212 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_pragma3214 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_alias_in_pragma3216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_170_in_pragma3222 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000100000000000L});
    public static final BitSet FOLLOW_set_in_pragma3224 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_173_in_pragma3232 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_location_in_pragma3234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_174_in_authz_pragma3246 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_175_in_authz_pragma3248 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_176_in_authz_pragma3250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_177_in_logging_pargma3262 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L,0x0004000000000000L});
    public static final BitSet FOLLOW_set_in_logging_pargma3264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_179_in_alias3279 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_alias3281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_location0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_180_in_desc_block3303 = new BitSet(new long[]{0x0000000000010800L});
    public static final BitSet FOLLOW_set_in_desc_block3305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_key_value3323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_value_pair_in_key_value3327 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_STRING_in_name_value_pair3343 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_name_value_pair3345 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_set_in_name_value_pair3347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_event_or_in_synpred1_ruleset1597 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_synpred1_ruleset1599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_event_or_in_synpred2_ruleset1604 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_synpred2_ruleset1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_disjunction_in_synpred6_ruleset2103 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_synpred6_ruleset2105 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_synpred6_ruleset2107 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_synpred6_ruleset2109 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_synpred6_ruleset2111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_synpred8_ruleset2303 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_synpred8_ruleset2305 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_synpred8_ruleset2307 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_var_domain_in_synpred8_ruleset2309 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_synpred8_ruleset2311 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_synpred8_ruleset2313 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_timeframe_in_synpred8_ruleset2315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_synpred9_ruleset2320 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_synpred9_ruleset2322 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000020L});
    public static final BitSet FOLLOW_set_in_synpred9_ruleset2324 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_synpred9_ruleset2332 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_synpred9_ruleset2334 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_var_domain_in_synpred9_ruleset2336 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_synpred9_ruleset2338 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_synpred9_ruleset2340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_domain_in_synpred10_ruleset2345 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_synpred10_ruleset2347 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_synpred10_ruleset2349 = new BitSet(new long[]{0x0000000000000000L,0x00000001FF000000L});
    public static final BitSet FOLLOW_predop_in_synpred10_ruleset2351 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_synpred10_ruleset2353 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_timeframe_in_synpred10_ruleset2355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_domain_in_synpred11_ruleset2360 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_synpred11_ruleset2362 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_synpred11_ruleset2364 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_timeframe_in_synpred11_ruleset2366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_synpred18_ruleset2474 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_synpred18_ruleset2476 = new BitSet(new long[]{0x0200000000140830L,0x0000374400100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_synpred18_ruleset2478 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_synpred18_ruleset2480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_app_in_synpred21_ruleset2510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_synpred24_ruleset2556 = new BitSet(new long[]{0x0000000000000002L});

}