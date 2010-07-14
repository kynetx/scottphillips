// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g 2010-07-13 19:40:05

	package com.kynetx;
	import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import org.antlr.runtime.debug.*;
import java.io.IOException;

import org.antlr.runtime.tree.*;

public class RulesetParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "INT", "EXPONENT", "FLOAT", "REGEXP", "WS", "ESC_SEQ", "STRING", "CHAR", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "HTML", "JS", "CMT", "'ruleset'", "'{'", "'}'", "'rule'", "'is'", "';'", "'fired'", "'always'", "'notfired'", "'else'", "'if'", "'callbacks'", "'success'", "'failure'", "'click'", "'change'", "'='", "'triggers'", "'clear'", "':'", "'set'", "'forget'", "'in'", "'mark'", "'with'", "'+='", "'-='", "'from'", "'log'", "'last'", "'raise'", "'explicit'", "'event'", "'for'", "'active'", "'inactive'", "'test'", "'then'", "'('", "','", "')'", "'=>'", "'and'", "'choose'", "'every'", "'pre'", "'foreach'", "'select'", "'using'", "'when'", "'before'", "'or'", "'not'", "'between'", "'pageview'", "'submit'", "'dblclick'", "'update'", "'setting'", "'web'", "'on'", "'global'", "'datasource'", "'<-'", "'css'", "'function'", "'|'", "'||'", "'&&'", "'<='", "'>='", "'<'", "'>'", "'=='", "'!='", "'eq'", "'neq'", "'like'", "'+'", "'-'", "'*'", "'/'", "'%'", "'seen'", "'after'", "'true'", "'false'", "'['", "']'", "'current'", "'history'", "'.'", "'pick'", "'match'", "'length'", "'replace'", "'as'", "'head'", "'tail'", "'sort'", "'filter'", "'map'", "'uc'", "'lc'", "'split'", "'join'", "'query'", "'has'", "'union'", "'difference'", "'intersection'", "'unique'", "'once'", "'duplicates'", "'within'", "'ent'", "'app'", "'emit'", "'dataset'", "'JSON'", "'XML'", "'RSS'", "'HTML'", "'cachable'", "'years'", "'months'", "'weeks'", "'days'", "'hours'", "'minutes'", "'seconds'", "'year'", "'month'", "'week'", "'day'", "'hour'", "'minute'", "'second'", "'dispatch'", "'domain'", "'->'", "'meta'", "'author'", "'key'", "'errorstack'", "'googleanalytics'", "'twitter'", "'amazon'", "'kpds'", "'google'", "'use'", "'module'", "'javascript'", "'resource'", "'name'", "'authz'", "'require'", "'user'", "'logging'", "'off'", "'alias'", "'description'"
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
    public static final int REGEXP=8;
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
    public static final int CMT=18;
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
        "invalidRule", "event_filter", "synpred2_Ruleset", "mult_expr", 
        "synpred21_Ruleset", "setting", "select_clause", "timeframe", "periods", 
        "for_clause", "factor", "synpred16_Ruleset", "synpred11_Ruleset", 
        "mult_op", "desc_block", "datatype", "synpred10_Ruleset", "synpred6_Ruleset", 
        "operator_expr", "synpred12_Ruleset", "post_alternate", "operator_op", 
        "dispatch", "alias", "synpred1_Ruleset", "event_or", "hash_line", 
        "operator", "conditional_expression", "raise_statement", "global", 
        "foreach", "synpred4_Ruleset", "rule_state", "dispatch_block", "logging_pargma", 
        "global_decls", "synpred19_Ruleset", "click", "success", "callbacks", 
        "synpred18_Ruleset", "primrule", "synpred23_Ruleset", "log_statement", 
        "expr", "trail_forget", "pragma", "when", "fundecls", "event_domain", 
        "equality_expr", "name_value_pair", "event_and", "function_app", 
        "synpred5_Ruleset", "synpred15_Ruleset", "disjunction", "conjunction", 
        "synpred13_Ruleset", "conditional_action", "failure", "ruleset", 
        "post_block", "rule_label", "event_seq", "click_link", "meta_name", 
        "decl", "cachetime", "event_prim", "namespace", "action", "add_expr", 
        "using", "pre_block", "blocktype", "synpred14_Ruleset", "location", 
        "function_def", "dataset", "period", "authz_pragma", "rulesetname", 
        "unconditional_action", "comment", "actionblock", "meta_block", 
        "modifier_clause", "css_emit", "persistent_iterate", "post_statement", 
        "key_value", "synpred22_Ruleset", "trail_exp", "rule", "synpred20_Ruleset", 
        "predop", "persistent_var", "synpred17_Ruleset", "dispatch_target", 
        "synpred3_Ruleset", "counter_start", "on_expr", "unary_expr", "persistent_expr", 
        "persistent_set", "modifier", "trail_mark", "cachable", "event_btwn", 
        "counter_op", "var_domain", "emit_block", "synpred9_Ruleset", "control_statement", 
        "add_op", "synpred7_Ruleset", "synpred8_Ruleset", "post", "trail_with", 
        "persistent_clear", "datasource"
    };
     
        public int ruleLevel = 0;
        public int getRuleLevel() { return ruleLevel; }
        public void incRuleLevel() { ruleLevel++; }
        public void decRuleLevel() { ruleLevel--; }
        public RulesetParser(TokenStream input) {
            this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
        }
        public RulesetParser(TokenStream input, int port, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[122+1];
             
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
    public RulesetParser(TokenStream input, DebugEventListener dbg) {
        super(input, dbg);
        this.state.ruleMemo = new HashMap[122+1];
         
         
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


    public String[] getTokenNames() { return RulesetParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g"; }

     

    	public HashMap rule_json = new HashMap();
    	public HashMap current_top = null;

    	public boolean checkname = true;

    	public String strip_string(String value)
    	{ 
    		return value.substring(1,value.length() - 1);
    	}
    	/*
    	 * Strip Crap off that we do not want any more.
    	 */
    	public String strip_wrappers(String start, String end, String value)
    	{
    		return value.substring(start.length(),value.length() - end.length()).trim();	
    	}

    	public void store_in_hash(HashMap start_hash,String subhash,String key, Object value)
    	{
    		HashMap themap = (HashMap)start_hash.get(subhash);
    		if(themap == null)
    		{
    			themap = new HashMap();
    			start_hash.put(subhash,themap);
    		}
    		themap.put(key,value);
    	}


    public static class ruleset_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ruleset"
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:122:1: ruleset options {backtrack=false; } : 'ruleset' rulesetname '{' ( meta_block | comment | dispatch_block | global_decls | rule )+ '}' EOF ;
    public final RulesetParser.ruleset_return ruleset() throws RecognitionException {
        RulesetParser.ruleset_return retval = new RulesetParser.ruleset_return();
        retval.start = input.LT(1);
        int ruleset_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal1=null;
        Token char_literal3=null;
        Token char_literal9=null;
        Token EOF10=null;
        RulesetParser.rulesetname_return rulesetname2 = null;

        RulesetParser.meta_block_return meta_block4 = null;

        RulesetParser.comment_return comment5 = null;

        RulesetParser.dispatch_block_return dispatch_block6 = null;

        RulesetParser.global_decls_return global_decls7 = null;

        RulesetParser.rule_return rule8 = null;


        Object string_literal1_tree=null;
        Object char_literal3_tree=null;
        Object char_literal9_tree=null;
        Object EOF10_tree=null;


        	 current_top = rule_json;

        try { dbg.enterRule(getGrammarFileName(), "ruleset");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(122, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:129:3: ( 'ruleset' rulesetname '{' ( meta_block | comment | dispatch_block | global_decls | rule )+ '}' EOF )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:129:6: 'ruleset' rulesetname '{' ( meta_block | comment | dispatch_block | global_decls | rule )+ '}' EOF
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(129,6);
            string_literal1=(Token)match(input,19,FOLLOW_19_in_ruleset663); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal1_tree = (Object)adaptor.create(string_literal1);
            adaptor.addChild(root_0, string_literal1_tree);
            }
            dbg.location(129,16);
            pushFollow(FOLLOW_rulesetname_in_ruleset665);
            rulesetname2=rulesetname();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, rulesetname2.getTree());
            dbg.location(129,28);
            if ( state.backtracking==0 ) {
               current_top.put("ruleset_name",(rulesetname2!=null?input.toString(rulesetname2.start,rulesetname2.stop):null)); 
            }
            dbg.location(129,83);
            char_literal3=(Token)match(input,20,FOLLOW_20_in_ruleset669); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal3_tree = (Object)adaptor.create(char_literal3);
            adaptor.addChild(root_0, char_literal3_tree);
            }
            dbg.location(130,4);
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:130:4: ( meta_block | comment | dispatch_block | global_decls | rule )+
            int cnt1=0;
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=6;
                try { dbg.enterDecision(1);

                switch ( input.LA(1) ) {
                case 160:
                    {
                    alt1=1;
                    }
                    break;
                case CMT:
                    {
                    alt1=2;
                    }
                    break;
                case 157:
                    {
                    alt1=3;
                    }
                    break;
                case 80:
                    {
                    alt1=4;
                    }
                    break;
                case 22:
                    {
                    alt1=5;
                    }
                    break;

                }

                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:130:6: meta_block
            	    {
            	    dbg.location(130,6);
            	    pushFollow(FOLLOW_meta_block_in_ruleset677);
            	    meta_block4=meta_block();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, meta_block4.getTree());

            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:130:20: comment
            	    {
            	    dbg.location(130,20);
            	    pushFollow(FOLLOW_comment_in_ruleset682);
            	    comment5=comment();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, comment5.getTree());

            	    }
            	    break;
            	case 3 :
            	    dbg.enterAlt(3);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:131:6: dispatch_block
            	    {
            	    dbg.location(131,6);
            	    pushFollow(FOLLOW_dispatch_block_in_ruleset689);
            	    dispatch_block6=dispatch_block();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, dispatch_block6.getTree());

            	    }
            	    break;
            	case 4 :
            	    dbg.enterAlt(4);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:132:6: global_decls
            	    {
            	    dbg.location(132,6);
            	    pushFollow(FOLLOW_global_decls_in_ruleset697);
            	    global_decls7=global_decls();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, global_decls7.getTree());

            	    }
            	    break;
            	case 5 :
            	    dbg.enterAlt(5);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:133:6: rule
            	    {
            	    dbg.location(133,6);
            	    pushFollow(FOLLOW_rule_in_ruleset705);
            	    rule8=rule();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, rule8.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt1++;
            } while (true);
            } finally {dbg.exitSubRule(1);}

            dbg.location(134,3);
            char_literal9=(Token)match(input,21,FOLLOW_21_in_ruleset712); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal9_tree = (Object)adaptor.create(char_literal9);
            adaptor.addChild(root_0, char_literal9_tree);
            }
            dbg.location(134,7);
            EOF10=(Token)match(input,EOF,FOLLOW_EOF_in_ruleset714); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EOF10_tree = (Object)adaptor.create(EOF10);
            adaptor.addChild(root_0, EOF10_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

              	current_top = null;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 1, ruleset_StartIndex); }
        }
        dbg.location(135, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "ruleset");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "ruleset"

    public static class comment_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "comment"
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:142:1: comment options {backtrack=false; } : CMT ;
    public final RulesetParser.comment_return comment() throws RecognitionException {
        RulesetParser.comment_return retval = new RulesetParser.comment_return();
        retval.start = input.LT(1);
        int comment_StartIndex = input.index();
        Object root_0 = null;

        Token CMT11=null;

        Object CMT11_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "comment");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(142, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:143:5: ( CMT )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:143:9: CMT
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(143,9);
            CMT11=(Token)match(input,CMT,FOLLOW_CMT_in_comment800); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CMT11_tree = (Object)adaptor.create(CMT11);
            adaptor.addChild(root_0, CMT11_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 2, comment_StartIndex); }
        }
        dbg.location(144, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "comment");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "comment"

    public static class rulesetname_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rulesetname"
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:146:1: rulesetname : ( ID | INT );
    public final RulesetParser.rulesetname_return rulesetname() throws RecognitionException {
        RulesetParser.rulesetname_return retval = new RulesetParser.rulesetname_return();
        retval.start = input.LT(1);
        int rulesetname_StartIndex = input.index();
        Object root_0 = null;

        Token set12=null;

        Object set12_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rulesetname");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(146, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:147:2: ( ID | INT )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(147,2);
            set12=(Token)input.LT(1);
            if ( (input.LA(1)>=ID && input.LA(1)<=INT) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set12));
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
            if ( state.backtracking>0 ) { memoize(input, 3, rulesetname_StartIndex); }
        }
        dbg.location(148, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:154:1: rule : 'rule' ID 'is' rule_state '{' select_clause ( pre_block )? ( emit_block )? ( action ( ';' )? ) ( callbacks )? ( post_block )? '}' ;
    public final RulesetParser.rule_return rule() throws RecognitionException {
        RulesetParser.rule_return retval = new RulesetParser.rule_return();
        retval.start = input.LT(1);
        int rule_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal13=null;
        Token ID14=null;
        Token string_literal15=null;
        Token char_literal17=null;
        Token char_literal22=null;
        Token char_literal25=null;
        RulesetParser.rule_state_return rule_state16 = null;

        RulesetParser.select_clause_return select_clause18 = null;

        RulesetParser.pre_block_return pre_block19 = null;

        RulesetParser.emit_block_return emit_block20 = null;

        RulesetParser.action_return action21 = null;

        RulesetParser.callbacks_return callbacks23 = null;

        RulesetParser.post_block_return post_block24 = null;


        Object string_literal13_tree=null;
        Object ID14_tree=null;
        Object string_literal15_tree=null;
        Object char_literal17_tree=null;
        Object char_literal22_tree=null;
        Object char_literal25_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rule");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(154, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:154:6: ( 'rule' ID 'is' rule_state '{' select_clause ( pre_block )? ( emit_block )? ( action ( ';' )? ) ( callbacks )? ( post_block )? '}' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:154:9: 'rule' ID 'is' rule_state '{' select_clause ( pre_block )? ( emit_block )? ( action ( ';' )? ) ( callbacks )? ( post_block )? '}'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(154,9);
            string_literal13=(Token)match(input,22,FOLLOW_22_in_rule852); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal13_tree = (Object)adaptor.create(string_literal13);
            adaptor.addChild(root_0, string_literal13_tree);
            }
            dbg.location(154,16);
            ID14=(Token)match(input,ID,FOLLOW_ID_in_rule854); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID14_tree = (Object)adaptor.create(ID14);
            adaptor.addChild(root_0, ID14_tree);
            }
            dbg.location(154,19);
            string_literal15=(Token)match(input,23,FOLLOW_23_in_rule856); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal15_tree = (Object)adaptor.create(string_literal15);
            adaptor.addChild(root_0, string_literal15_tree);
            }
            dbg.location(154,24);
            pushFollow(FOLLOW_rule_state_in_rule858);
            rule_state16=rule_state();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, rule_state16.getTree());
            dbg.location(154,35);
            char_literal17=(Token)match(input,20,FOLLOW_20_in_rule860); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal17_tree = (Object)adaptor.create(char_literal17);
            adaptor.addChild(root_0, char_literal17_tree);
            }
            dbg.location(155,2);
            pushFollow(FOLLOW_select_clause_in_rule863);
            select_clause18=select_clause();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, select_clause18.getTree());
            dbg.location(155,16);
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:155:16: ( pre_block )?
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

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:155:16: pre_block
                    {
                    dbg.location(155,16);
                    pushFollow(FOLLOW_pre_block_in_rule865);
                    pre_block19=pre_block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pre_block19.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(2);}

            dbg.location(155,27);
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:155:27: ( emit_block )?
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

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:155:27: emit_block
                    {
                    dbg.location(155,27);
                    pushFollow(FOLLOW_emit_block_in_rule868);
                    emit_block20=emit_block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, emit_block20.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(3);}

            dbg.location(155,39);
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:155:39: ( action ( ';' )? )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:155:40: action ( ';' )?
            {
            dbg.location(155,40);
            pushFollow(FOLLOW_action_in_rule872);
            action21=action();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, action21.getTree());
            dbg.location(155,47);
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:155:47: ( ';' )?
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

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:155:47: ';'
                    {
                    dbg.location(155,47);
                    char_literal22=(Token)match(input,24,FOLLOW_24_in_rule874); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal22_tree = (Object)adaptor.create(char_literal22);
                    adaptor.addChild(root_0, char_literal22_tree);
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(4);}


            }

            dbg.location(155,53);
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:155:53: ( callbacks )?
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

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:155:53: callbacks
                    {
                    dbg.location(155,53);
                    pushFollow(FOLLOW_callbacks_in_rule878);
                    callbacks23=callbacks();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, callbacks23.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(5);}

            dbg.location(155,64);
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:155:64: ( post_block )?
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

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:155:64: post_block
                    {
                    dbg.location(155,64);
                    pushFollow(FOLLOW_post_block_in_rule881);
                    post_block24=post_block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, post_block24.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(6);}

            dbg.location(156,2);
            char_literal25=(Token)match(input,21,FOLLOW_21_in_rule885); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal25_tree = (Object)adaptor.create(char_literal25);
            adaptor.addChild(root_0, char_literal25_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 4, rule_StartIndex); }
        }
        dbg.location(157, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:164:1: post_block : post '{' post_statement ';' ';' '}' post_alternate ;
    public final RulesetParser.post_block_return post_block() throws RecognitionException {
        RulesetParser.post_block_return retval = new RulesetParser.post_block_return();
        retval.start = input.LT(1);
        int post_block_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal27=null;
        Token char_literal29=null;
        Token char_literal30=null;
        Token char_literal31=null;
        RulesetParser.post_return post26 = null;

        RulesetParser.post_statement_return post_statement28 = null;

        RulesetParser.post_alternate_return post_alternate32 = null;


        Object char_literal27_tree=null;
        Object char_literal29_tree=null;
        Object char_literal30_tree=null;
        Object char_literal31_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "post_block");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(164, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:164:11: ( post '{' post_statement ';' ';' '}' post_alternate )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:164:13: post '{' post_statement ';' ';' '}' post_alternate
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(164,13);
            pushFollow(FOLLOW_post_in_post_block901);
            post26=post();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, post26.getTree());
            dbg.location(164,18);
            char_literal27=(Token)match(input,20,FOLLOW_20_in_post_block903); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal27_tree = (Object)adaptor.create(char_literal27);
            adaptor.addChild(root_0, char_literal27_tree);
            }
            dbg.location(164,22);
            pushFollow(FOLLOW_post_statement_in_post_block905);
            post_statement28=post_statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, post_statement28.getTree());
            dbg.location(164,37);
            char_literal29=(Token)match(input,24,FOLLOW_24_in_post_block907); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal29_tree = (Object)adaptor.create(char_literal29);
            adaptor.addChild(root_0, char_literal29_tree);
            }
            dbg.location(164,41);
            char_literal30=(Token)match(input,24,FOLLOW_24_in_post_block909); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal30_tree = (Object)adaptor.create(char_literal30);
            adaptor.addChild(root_0, char_literal30_tree);
            }
            dbg.location(164,45);
            char_literal31=(Token)match(input,21,FOLLOW_21_in_post_block911); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal31_tree = (Object)adaptor.create(char_literal31);
            adaptor.addChild(root_0, char_literal31_tree);
            }
            dbg.location(164,49);
            pushFollow(FOLLOW_post_alternate_in_post_block913);
            post_alternate32=post_alternate();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, post_alternate32.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 5, post_block_StartIndex); }
        }
        dbg.location(164, 63);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:166:1: post : ( 'fired' | 'always' | 'notfired' );
    public final RulesetParser.post_return post() throws RecognitionException {
        RulesetParser.post_return retval = new RulesetParser.post_return();
        retval.start = input.LT(1);
        int post_StartIndex = input.index();
        Object root_0 = null;

        Token set33=null;

        Object set33_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "post");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(166, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:166:5: ( 'fired' | 'always' | 'notfired' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(166,5);
            set33=(Token)input.LT(1);
            if ( (input.LA(1)>=25 && input.LA(1)<=27) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set33));
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
            if ( state.backtracking>0 ) { memoize(input, 6, post_StartIndex); }
        }
        dbg.location(168, 17);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:171:1: post_alternate : 'else' '{' post_statement ';' ';' '}' ;
    public final RulesetParser.post_alternate_return post_alternate() throws RecognitionException {
        RulesetParser.post_alternate_return retval = new RulesetParser.post_alternate_return();
        retval.start = input.LT(1);
        int post_alternate_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal34=null;
        Token char_literal35=null;
        Token char_literal37=null;
        Token char_literal38=null;
        Token char_literal39=null;
        RulesetParser.post_statement_return post_statement36 = null;


        Object string_literal34_tree=null;
        Object char_literal35_tree=null;
        Object char_literal37_tree=null;
        Object char_literal38_tree=null;
        Object char_literal39_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "post_alternate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(171, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:171:15: ( 'else' '{' post_statement ';' ';' '}' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:171:17: 'else' '{' post_statement ';' ';' '}'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(171,17);
            string_literal34=(Token)match(input,28,FOLLOW_28_in_post_alternate944); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal34_tree = (Object)adaptor.create(string_literal34);
            adaptor.addChild(root_0, string_literal34_tree);
            }
            dbg.location(171,24);
            char_literal35=(Token)match(input,20,FOLLOW_20_in_post_alternate946); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal35_tree = (Object)adaptor.create(char_literal35);
            adaptor.addChild(root_0, char_literal35_tree);
            }
            dbg.location(171,28);
            pushFollow(FOLLOW_post_statement_in_post_alternate948);
            post_statement36=post_statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, post_statement36.getTree());
            dbg.location(171,43);
            char_literal37=(Token)match(input,24,FOLLOW_24_in_post_alternate950); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal37_tree = (Object)adaptor.create(char_literal37);
            adaptor.addChild(root_0, char_literal37_tree);
            }
            dbg.location(171,47);
            char_literal38=(Token)match(input,24,FOLLOW_24_in_post_alternate952); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal38_tree = (Object)adaptor.create(char_literal38);
            adaptor.addChild(root_0, char_literal38_tree);
            }
            dbg.location(171,51);
            char_literal39=(Token)match(input,21,FOLLOW_21_in_post_alternate954); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal39_tree = (Object)adaptor.create(char_literal39);
            adaptor.addChild(root_0, char_literal39_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 7, post_alternate_StartIndex); }
        }
        dbg.location(171, 54);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:173:1: post_statement : ( persistent_expr ( 'if' expr ) | log_statement ( 'if' expr ) | control_statement ( 'if' expr ) | raise_statement ( 'if' expr ) );
    public final RulesetParser.post_statement_return post_statement() throws RecognitionException {
        RulesetParser.post_statement_return retval = new RulesetParser.post_statement_return();
        retval.start = input.LT(1);
        int post_statement_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal41=null;
        Token string_literal44=null;
        Token string_literal47=null;
        Token string_literal50=null;
        RulesetParser.persistent_expr_return persistent_expr40 = null;

        RulesetParser.expr_return expr42 = null;

        RulesetParser.log_statement_return log_statement43 = null;

        RulesetParser.expr_return expr45 = null;

        RulesetParser.control_statement_return control_statement46 = null;

        RulesetParser.expr_return expr48 = null;

        RulesetParser.raise_statement_return raise_statement49 = null;

        RulesetParser.expr_return expr51 = null;


        Object string_literal41_tree=null;
        Object string_literal44_tree=null;
        Object string_literal47_tree=null;
        Object string_literal50_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "post_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(173, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:173:15: ( persistent_expr ( 'if' expr ) | log_statement ( 'if' expr ) | control_statement ( 'if' expr ) | raise_statement ( 'if' expr ) )
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

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:173:17: persistent_expr ( 'if' expr )
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(173,17);
                    pushFollow(FOLLOW_persistent_expr_in_post_statement961);
                    persistent_expr40=persistent_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, persistent_expr40.getTree());
                    dbg.location(173,33);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:173:33: ( 'if' expr )
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:173:34: 'if' expr
                    {
                    dbg.location(173,34);
                    string_literal41=(Token)match(input,29,FOLLOW_29_in_post_statement964); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal41_tree = (Object)adaptor.create(string_literal41);
                    adaptor.addChild(root_0, string_literal41_tree);
                    }
                    dbg.location(173,39);
                    pushFollow(FOLLOW_expr_in_post_statement966);
                    expr42=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr42.getTree());

                    }


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:174:5: log_statement ( 'if' expr )
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(174,5);
                    pushFollow(FOLLOW_log_statement_in_post_statement973);
                    log_statement43=log_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, log_statement43.getTree());
                    dbg.location(174,19);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:174:19: ( 'if' expr )
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:174:20: 'if' expr
                    {
                    dbg.location(174,20);
                    string_literal44=(Token)match(input,29,FOLLOW_29_in_post_statement976); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal44_tree = (Object)adaptor.create(string_literal44);
                    adaptor.addChild(root_0, string_literal44_tree);
                    }
                    dbg.location(174,25);
                    pushFollow(FOLLOW_expr_in_post_statement978);
                    expr45=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr45.getTree());

                    }


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:175:5: control_statement ( 'if' expr )
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(175,5);
                    pushFollow(FOLLOW_control_statement_in_post_statement985);
                    control_statement46=control_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, control_statement46.getTree());
                    dbg.location(175,23);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:175:23: ( 'if' expr )
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:175:24: 'if' expr
                    {
                    dbg.location(175,24);
                    string_literal47=(Token)match(input,29,FOLLOW_29_in_post_statement988); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal47_tree = (Object)adaptor.create(string_literal47);
                    adaptor.addChild(root_0, string_literal47_tree);
                    }
                    dbg.location(175,29);
                    pushFollow(FOLLOW_expr_in_post_statement990);
                    expr48=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr48.getTree());

                    }


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:176:5: raise_statement ( 'if' expr )
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(176,5);
                    pushFollow(FOLLOW_raise_statement_in_post_statement997);
                    raise_statement49=raise_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, raise_statement49.getTree());
                    dbg.location(176,21);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:176:21: ( 'if' expr )
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:176:22: 'if' expr
                    {
                    dbg.location(176,22);
                    string_literal50=(Token)match(input,29,FOLLOW_29_in_post_statement1000); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal50_tree = (Object)adaptor.create(string_literal50);
                    adaptor.addChild(root_0, string_literal50_tree);
                    }
                    dbg.location(176,27);
                    pushFollow(FOLLOW_expr_in_post_statement1002);
                    expr51=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr51.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 8, post_statement_StartIndex); }
        }
        dbg.location(177, 3);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:180:1: callbacks : 'callbacks' '{' ( success )? ( failure )? '}' ;
    public final RulesetParser.callbacks_return callbacks() throws RecognitionException {
        RulesetParser.callbacks_return retval = new RulesetParser.callbacks_return();
        retval.start = input.LT(1);
        int callbacks_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal52=null;
        Token char_literal53=null;
        Token char_literal56=null;
        RulesetParser.success_return success54 = null;

        RulesetParser.failure_return failure55 = null;


        Object string_literal52_tree=null;
        Object char_literal53_tree=null;
        Object char_literal56_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "callbacks");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(180, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:180:10: ( 'callbacks' '{' ( success )? ( failure )? '}' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:180:12: 'callbacks' '{' ( success )? ( failure )? '}'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(180,12);
            string_literal52=(Token)match(input,30,FOLLOW_30_in_callbacks1014); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal52_tree = (Object)adaptor.create(string_literal52);
            adaptor.addChild(root_0, string_literal52_tree);
            }
            dbg.location(180,24);
            char_literal53=(Token)match(input,20,FOLLOW_20_in_callbacks1016); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal53_tree = (Object)adaptor.create(char_literal53);
            adaptor.addChild(root_0, char_literal53_tree);
            }
            dbg.location(180,28);
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:180:28: ( success )?
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

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:180:28: success
                    {
                    dbg.location(180,28);
                    pushFollow(FOLLOW_success_in_callbacks1018);
                    success54=success();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, success54.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(8);}

            dbg.location(180,37);
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:180:37: ( failure )?
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

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:180:37: failure
                    {
                    dbg.location(180,37);
                    pushFollow(FOLLOW_failure_in_callbacks1021);
                    failure55=failure();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, failure55.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(9);}

            dbg.location(180,46);
            char_literal56=(Token)match(input,21,FOLLOW_21_in_callbacks1024); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal56_tree = (Object)adaptor.create(char_literal56);
            adaptor.addChild(root_0, char_literal56_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 9, callbacks_StartIndex); }
        }
        dbg.location(180, 49);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:182:1: success : 'success' '{' click ( ';' )? '}' ;
    public final RulesetParser.success_return success() throws RecognitionException {
        RulesetParser.success_return retval = new RulesetParser.success_return();
        retval.start = input.LT(1);
        int success_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal57=null;
        Token char_literal58=null;
        Token char_literal60=null;
        Token char_literal61=null;
        RulesetParser.click_return click59 = null;


        Object string_literal57_tree=null;
        Object char_literal58_tree=null;
        Object char_literal60_tree=null;
        Object char_literal61_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "success");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(182, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:182:8: ( 'success' '{' click ( ';' )? '}' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:182:10: 'success' '{' click ( ';' )? '}'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(182,10);
            string_literal57=(Token)match(input,31,FOLLOW_31_in_success1031); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal57_tree = (Object)adaptor.create(string_literal57);
            adaptor.addChild(root_0, string_literal57_tree);
            }
            dbg.location(182,20);
            char_literal58=(Token)match(input,20,FOLLOW_20_in_success1033); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal58_tree = (Object)adaptor.create(char_literal58);
            adaptor.addChild(root_0, char_literal58_tree);
            }
            dbg.location(182,24);
            pushFollow(FOLLOW_click_in_success1035);
            click59=click();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, click59.getTree());
            dbg.location(182,30);
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:182:30: ( ';' )?
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

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:182:30: ';'
                    {
                    dbg.location(182,30);
                    char_literal60=(Token)match(input,24,FOLLOW_24_in_success1037); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal60_tree = (Object)adaptor.create(char_literal60);
                    adaptor.addChild(root_0, char_literal60_tree);
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(10);}

            dbg.location(182,35);
            char_literal61=(Token)match(input,21,FOLLOW_21_in_success1040); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal61_tree = (Object)adaptor.create(char_literal61);
            adaptor.addChild(root_0, char_literal61_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 10, success_StartIndex); }
        }
        dbg.location(182, 38);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:184:1: failure : 'failure' '{' click ( ';' )? '}' ;
    public final RulesetParser.failure_return failure() throws RecognitionException {
        RulesetParser.failure_return retval = new RulesetParser.failure_return();
        retval.start = input.LT(1);
        int failure_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal62=null;
        Token char_literal63=null;
        Token char_literal65=null;
        Token char_literal66=null;
        RulesetParser.click_return click64 = null;


        Object string_literal62_tree=null;
        Object char_literal63_tree=null;
        Object char_literal65_tree=null;
        Object char_literal66_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "failure");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(184, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:184:8: ( 'failure' '{' click ( ';' )? '}' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:184:10: 'failure' '{' click ( ';' )? '}'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(184,10);
            string_literal62=(Token)match(input,32,FOLLOW_32_in_failure1047); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal62_tree = (Object)adaptor.create(string_literal62);
            adaptor.addChild(root_0, string_literal62_tree);
            }
            dbg.location(184,20);
            char_literal63=(Token)match(input,20,FOLLOW_20_in_failure1049); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal63_tree = (Object)adaptor.create(char_literal63);
            adaptor.addChild(root_0, char_literal63_tree);
            }
            dbg.location(184,24);
            pushFollow(FOLLOW_click_in_failure1051);
            click64=click();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, click64.getTree());
            dbg.location(184,30);
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:184:30: ( ';' )?
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

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:184:30: ';'
                    {
                    dbg.location(184,30);
                    char_literal65=(Token)match(input,24,FOLLOW_24_in_failure1053); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal65_tree = (Object)adaptor.create(char_literal65);
                    adaptor.addChild(root_0, char_literal65_tree);
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(11);}

            dbg.location(184,37);
            char_literal66=(Token)match(input,21,FOLLOW_21_in_failure1058); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal66_tree = (Object)adaptor.create(char_literal66);
            adaptor.addChild(root_0, char_literal66_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 11, failure_StartIndex); }
        }
        dbg.location(184, 40);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:186:1: click : ( 'click' | 'change' ) ID '=' STRING ( click_link )? ;
    public final RulesetParser.click_return click() throws RecognitionException {
        RulesetParser.click_return retval = new RulesetParser.click_return();
        retval.start = input.LT(1);
        int click_StartIndex = input.index();
        Object root_0 = null;

        Token set67=null;
        Token ID68=null;
        Token char_literal69=null;
        Token STRING70=null;
        RulesetParser.click_link_return click_link71 = null;


        Object set67_tree=null;
        Object ID68_tree=null;
        Object char_literal69_tree=null;
        Object STRING70_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "click");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(186, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:186:6: ( ( 'click' | 'change' ) ID '=' STRING ( click_link )? )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:186:8: ( 'click' | 'change' ) ID '=' STRING ( click_link )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(186,8);
            set67=(Token)input.LT(1);
            if ( (input.LA(1)>=33 && input.LA(1)<=34) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set67));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }

            dbg.location(186,29);
            ID68=(Token)match(input,ID,FOLLOW_ID_in_click1073); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID68_tree = (Object)adaptor.create(ID68);
            adaptor.addChild(root_0, ID68_tree);
            }
            dbg.location(186,32);
            char_literal69=(Token)match(input,35,FOLLOW_35_in_click1075); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal69_tree = (Object)adaptor.create(char_literal69);
            adaptor.addChild(root_0, char_literal69_tree);
            }
            dbg.location(186,36);
            STRING70=(Token)match(input,STRING,FOLLOW_STRING_in_click1077); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING70_tree = (Object)adaptor.create(STRING70);
            adaptor.addChild(root_0, STRING70_tree);
            }
            dbg.location(186,43);
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:186:43: ( click_link )?
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

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:186:43: click_link
                    {
                    dbg.location(186,43);
                    pushFollow(FOLLOW_click_link_in_click1079);
                    click_link71=click_link();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, click_link71.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 12, click_StartIndex); }
        }
        dbg.location(186, 54);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:188:1: click_link : 'triggers' persistent_expr ;
    public final RulesetParser.click_link_return click_link() throws RecognitionException {
        RulesetParser.click_link_return retval = new RulesetParser.click_link_return();
        retval.start = input.LT(1);
        int click_link_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal72=null;
        RulesetParser.persistent_expr_return persistent_expr73 = null;


        Object string_literal72_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "click_link");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(188, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:188:11: ( 'triggers' persistent_expr )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:188:13: 'triggers' persistent_expr
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(188,13);
            string_literal72=(Token)match(input,36,FOLLOW_36_in_click_link1087); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal72_tree = (Object)adaptor.create(string_literal72);
            adaptor.addChild(root_0, string_literal72_tree);
            }
            dbg.location(188,24);
            pushFollow(FOLLOW_persistent_expr_in_click_link1089);
            persistent_expr73=persistent_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, persistent_expr73.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 13, click_link_StartIndex); }
        }
        dbg.location(188, 39);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:191:1: persistent_expr : ( persistent_clear | persistent_set | persistent_iterate | trail_forget | trail_mark );
    public final RulesetParser.persistent_expr_return persistent_expr() throws RecognitionException {
        RulesetParser.persistent_expr_return retval = new RulesetParser.persistent_expr_return();
        retval.start = input.LT(1);
        int persistent_expr_StartIndex = input.index();
        Object root_0 = null;

        RulesetParser.persistent_clear_return persistent_clear74 = null;

        RulesetParser.persistent_set_return persistent_set75 = null;

        RulesetParser.persistent_iterate_return persistent_iterate76 = null;

        RulesetParser.trail_forget_return trail_forget77 = null;

        RulesetParser.trail_mark_return trail_mark78 = null;



        try { dbg.enterRule(getGrammarFileName(), "persistent_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(191, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:191:16: ( persistent_clear | persistent_set | persistent_iterate | trail_forget | trail_mark )
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

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:191:18: persistent_clear
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(191,18);
                    pushFollow(FOLLOW_persistent_clear_in_persistent_expr1097);
                    persistent_clear74=persistent_clear();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, persistent_clear74.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:192:6: persistent_set
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(192,6);
                    pushFollow(FOLLOW_persistent_set_in_persistent_expr1104);
                    persistent_set75=persistent_set();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, persistent_set75.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:193:6: persistent_iterate
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(193,6);
                    pushFollow(FOLLOW_persistent_iterate_in_persistent_expr1111);
                    persistent_iterate76=persistent_iterate();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, persistent_iterate76.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:194:6: trail_forget
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(194,6);
                    pushFollow(FOLLOW_trail_forget_in_persistent_expr1118);
                    trail_forget77=trail_forget();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, trail_forget77.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:195:6: trail_mark
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(195,6);
                    pushFollow(FOLLOW_trail_mark_in_persistent_expr1125);
                    trail_mark78=trail_mark();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, trail_mark78.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 14, persistent_expr_StartIndex); }
        }
        dbg.location(195, 16);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:198:1: persistent_clear : 'clear' var_domain ':' ID ;
    public final RulesetParser.persistent_clear_return persistent_clear() throws RecognitionException {
        RulesetParser.persistent_clear_return retval = new RulesetParser.persistent_clear_return();
        retval.start = input.LT(1);
        int persistent_clear_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal79=null;
        Token char_literal81=null;
        Token ID82=null;
        RulesetParser.var_domain_return var_domain80 = null;


        Object string_literal79_tree=null;
        Object char_literal81_tree=null;
        Object ID82_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "persistent_clear");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(198, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:198:17: ( 'clear' var_domain ':' ID )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:198:19: 'clear' var_domain ':' ID
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(198,19);
            string_literal79=(Token)match(input,37,FOLLOW_37_in_persistent_clear1133); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal79_tree = (Object)adaptor.create(string_literal79);
            adaptor.addChild(root_0, string_literal79_tree);
            }
            dbg.location(198,27);
            pushFollow(FOLLOW_var_domain_in_persistent_clear1135);
            var_domain80=var_domain();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, var_domain80.getTree());
            dbg.location(198,38);
            char_literal81=(Token)match(input,38,FOLLOW_38_in_persistent_clear1137); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal81_tree = (Object)adaptor.create(char_literal81);
            adaptor.addChild(root_0, char_literal81_tree);
            }
            dbg.location(198,42);
            ID82=(Token)match(input,ID,FOLLOW_ID_in_persistent_clear1139); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID82_tree = (Object)adaptor.create(ID82);
            adaptor.addChild(root_0, ID82_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 15, persistent_clear_StartIndex); }
        }
        dbg.location(198, 44);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:200:1: persistent_set : 'set' var_domain ':' ID ;
    public final RulesetParser.persistent_set_return persistent_set() throws RecognitionException {
        RulesetParser.persistent_set_return retval = new RulesetParser.persistent_set_return();
        retval.start = input.LT(1);
        int persistent_set_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal83=null;
        Token char_literal85=null;
        Token ID86=null;
        RulesetParser.var_domain_return var_domain84 = null;


        Object string_literal83_tree=null;
        Object char_literal85_tree=null;
        Object ID86_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "persistent_set");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(200, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:200:15: ( 'set' var_domain ':' ID )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:200:17: 'set' var_domain ':' ID
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(200,17);
            string_literal83=(Token)match(input,39,FOLLOW_39_in_persistent_set1146); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal83_tree = (Object)adaptor.create(string_literal83);
            adaptor.addChild(root_0, string_literal83_tree);
            }
            dbg.location(200,23);
            pushFollow(FOLLOW_var_domain_in_persistent_set1148);
            var_domain84=var_domain();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, var_domain84.getTree());
            dbg.location(200,34);
            char_literal85=(Token)match(input,38,FOLLOW_38_in_persistent_set1150); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal85_tree = (Object)adaptor.create(char_literal85);
            adaptor.addChild(root_0, char_literal85_tree);
            }
            dbg.location(200,38);
            ID86=(Token)match(input,ID,FOLLOW_ID_in_persistent_set1152); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID86_tree = (Object)adaptor.create(ID86);
            adaptor.addChild(root_0, ID86_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 16, persistent_set_StartIndex); }
        }
        dbg.location(200, 40);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:202:1: persistent_iterate : var_domain ':' ID counter_op expr counter_start ;
    public final RulesetParser.persistent_iterate_return persistent_iterate() throws RecognitionException {
        RulesetParser.persistent_iterate_return retval = new RulesetParser.persistent_iterate_return();
        retval.start = input.LT(1);
        int persistent_iterate_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal88=null;
        Token ID89=null;
        RulesetParser.var_domain_return var_domain87 = null;

        RulesetParser.counter_op_return counter_op90 = null;

        RulesetParser.expr_return expr91 = null;

        RulesetParser.counter_start_return counter_start92 = null;


        Object char_literal88_tree=null;
        Object ID89_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "persistent_iterate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(202, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:202:19: ( var_domain ':' ID counter_op expr counter_start )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:202:21: var_domain ':' ID counter_op expr counter_start
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(202,21);
            pushFollow(FOLLOW_var_domain_in_persistent_iterate1159);
            var_domain87=var_domain();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, var_domain87.getTree());
            dbg.location(202,32);
            char_literal88=(Token)match(input,38,FOLLOW_38_in_persistent_iterate1161); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal88_tree = (Object)adaptor.create(char_literal88);
            adaptor.addChild(root_0, char_literal88_tree);
            }
            dbg.location(202,36);
            ID89=(Token)match(input,ID,FOLLOW_ID_in_persistent_iterate1163); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID89_tree = (Object)adaptor.create(ID89);
            adaptor.addChild(root_0, ID89_tree);
            }
            dbg.location(202,39);
            pushFollow(FOLLOW_counter_op_in_persistent_iterate1165);
            counter_op90=counter_op();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, counter_op90.getTree());
            dbg.location(202,50);
            pushFollow(FOLLOW_expr_in_persistent_iterate1167);
            expr91=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr91.getTree());
            dbg.location(202,55);
            pushFollow(FOLLOW_counter_start_in_persistent_iterate1169);
            counter_start92=counter_start();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, counter_start92.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 17, persistent_iterate_StartIndex); }
        }
        dbg.location(202, 68);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:204:1: trail_forget : 'forget' STRING 'in' var_domain ':' ID ;
    public final RulesetParser.trail_forget_return trail_forget() throws RecognitionException {
        RulesetParser.trail_forget_return retval = new RulesetParser.trail_forget_return();
        retval.start = input.LT(1);
        int trail_forget_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal93=null;
        Token STRING94=null;
        Token string_literal95=null;
        Token char_literal97=null;
        Token ID98=null;
        RulesetParser.var_domain_return var_domain96 = null;


        Object string_literal93_tree=null;
        Object STRING94_tree=null;
        Object string_literal95_tree=null;
        Object char_literal97_tree=null;
        Object ID98_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "trail_forget");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(204, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:204:13: ( 'forget' STRING 'in' var_domain ':' ID )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:204:15: 'forget' STRING 'in' var_domain ':' ID
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(204,15);
            string_literal93=(Token)match(input,40,FOLLOW_40_in_trail_forget1176); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal93_tree = (Object)adaptor.create(string_literal93);
            adaptor.addChild(root_0, string_literal93_tree);
            }
            dbg.location(204,24);
            STRING94=(Token)match(input,STRING,FOLLOW_STRING_in_trail_forget1178); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING94_tree = (Object)adaptor.create(STRING94);
            adaptor.addChild(root_0, STRING94_tree);
            }
            dbg.location(204,31);
            string_literal95=(Token)match(input,41,FOLLOW_41_in_trail_forget1180); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal95_tree = (Object)adaptor.create(string_literal95);
            adaptor.addChild(root_0, string_literal95_tree);
            }
            dbg.location(204,36);
            pushFollow(FOLLOW_var_domain_in_trail_forget1182);
            var_domain96=var_domain();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, var_domain96.getTree());
            dbg.location(204,47);
            char_literal97=(Token)match(input,38,FOLLOW_38_in_trail_forget1184); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal97_tree = (Object)adaptor.create(char_literal97);
            adaptor.addChild(root_0, char_literal97_tree);
            }
            dbg.location(204,51);
            ID98=(Token)match(input,ID,FOLLOW_ID_in_trail_forget1186); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID98_tree = (Object)adaptor.create(ID98);
            adaptor.addChild(root_0, ID98_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 18, trail_forget_StartIndex); }
        }
        dbg.location(204, 53);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:206:1: trail_mark : 'mark' var_domain ':' ID trail_with ;
    public final RulesetParser.trail_mark_return trail_mark() throws RecognitionException {
        RulesetParser.trail_mark_return retval = new RulesetParser.trail_mark_return();
        retval.start = input.LT(1);
        int trail_mark_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal99=null;
        Token char_literal101=null;
        Token ID102=null;
        RulesetParser.var_domain_return var_domain100 = null;

        RulesetParser.trail_with_return trail_with103 = null;


        Object string_literal99_tree=null;
        Object char_literal101_tree=null;
        Object ID102_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "trail_mark");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(206, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:206:11: ( 'mark' var_domain ':' ID trail_with )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:206:13: 'mark' var_domain ':' ID trail_with
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(206,13);
            string_literal99=(Token)match(input,42,FOLLOW_42_in_trail_mark1193); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal99_tree = (Object)adaptor.create(string_literal99);
            adaptor.addChild(root_0, string_literal99_tree);
            }
            dbg.location(206,20);
            pushFollow(FOLLOW_var_domain_in_trail_mark1195);
            var_domain100=var_domain();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, var_domain100.getTree());
            dbg.location(206,31);
            char_literal101=(Token)match(input,38,FOLLOW_38_in_trail_mark1197); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal101_tree = (Object)adaptor.create(char_literal101);
            adaptor.addChild(root_0, char_literal101_tree);
            }
            dbg.location(206,35);
            ID102=(Token)match(input,ID,FOLLOW_ID_in_trail_mark1199); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID102_tree = (Object)adaptor.create(ID102);
            adaptor.addChild(root_0, ID102_tree);
            }
            dbg.location(206,38);
            pushFollow(FOLLOW_trail_with_in_trail_mark1201);
            trail_with103=trail_with();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, trail_with103.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 19, trail_mark_StartIndex); }
        }
        dbg.location(206, 48);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:208:1: trail_with : 'with' expr ;
    public final RulesetParser.trail_with_return trail_with() throws RecognitionException {
        RulesetParser.trail_with_return retval = new RulesetParser.trail_with_return();
        retval.start = input.LT(1);
        int trail_with_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal104=null;
        RulesetParser.expr_return expr105 = null;


        Object string_literal104_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "trail_with");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(208, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:208:11: ( 'with' expr )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:208:13: 'with' expr
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(208,13);
            string_literal104=(Token)match(input,43,FOLLOW_43_in_trail_with1208); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal104_tree = (Object)adaptor.create(string_literal104);
            adaptor.addChild(root_0, string_literal104_tree);
            }
            dbg.location(208,20);
            pushFollow(FOLLOW_expr_in_trail_with1210);
            expr105=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr105.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 20, trail_with_StartIndex); }
        }
        dbg.location(208, 24);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:211:1: counter_op : ( '+=' | '-=' );
    public final RulesetParser.counter_op_return counter_op() throws RecognitionException {
        RulesetParser.counter_op_return retval = new RulesetParser.counter_op_return();
        retval.start = input.LT(1);
        int counter_op_StartIndex = input.index();
        Object root_0 = null;

        Token set106=null;

        Object set106_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "counter_op");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(211, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:211:11: ( '+=' | '-=' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(211,11);
            set106=(Token)input.LT(1);
            if ( (input.LA(1)>=44 && input.LA(1)<=45) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set106));
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
            if ( state.backtracking>0 ) { memoize(input, 21, counter_op_StartIndex); }
        }
        dbg.location(212, 17);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:214:1: counter_start : 'from' expr ;
    public final RulesetParser.counter_start_return counter_start() throws RecognitionException {
        RulesetParser.counter_start_return retval = new RulesetParser.counter_start_return();
        retval.start = input.LT(1);
        int counter_start_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal107=null;
        RulesetParser.expr_return expr108 = null;


        Object string_literal107_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "counter_start");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(214, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:214:14: ( 'from' expr )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:214:16: 'from' expr
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(214,16);
            string_literal107=(Token)match(input,46,FOLLOW_46_in_counter_start1239); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal107_tree = (Object)adaptor.create(string_literal107);
            adaptor.addChild(root_0, string_literal107_tree);
            }
            dbg.location(214,23);
            pushFollow(FOLLOW_expr_in_counter_start1241);
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
            if ( state.backtracking>0 ) { memoize(input, 22, counter_start_StartIndex); }
        }
        dbg.location(214, 27);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:217:1: log_statement : 'log' expr ;
    public final RulesetParser.log_statement_return log_statement() throws RecognitionException {
        RulesetParser.log_statement_return retval = new RulesetParser.log_statement_return();
        retval.start = input.LT(1);
        int log_statement_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal109=null;
        RulesetParser.expr_return expr110 = null;


        Object string_literal109_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "log_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(217, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:217:14: ( 'log' expr )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:217:16: 'log' expr
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(217,16);
            string_literal109=(Token)match(input,47,FOLLOW_47_in_log_statement1249); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal109_tree = (Object)adaptor.create(string_literal109);
            adaptor.addChild(root_0, string_literal109_tree);
            }
            dbg.location(217,22);
            pushFollow(FOLLOW_expr_in_log_statement1251);
            expr110=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr110.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 23, log_statement_StartIndex); }
        }
        dbg.location(217, 26);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:219:1: control_statement : 'last' ;
    public final RulesetParser.control_statement_return control_statement() throws RecognitionException {
        RulesetParser.control_statement_return retval = new RulesetParser.control_statement_return();
        retval.start = input.LT(1);
        int control_statement_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal111=null;

        Object string_literal111_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "control_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(219, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:219:18: ( 'last' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:219:20: 'last'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(219,20);
            string_literal111=(Token)match(input,48,FOLLOW_48_in_control_statement1258); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal111_tree = (Object)adaptor.create(string_literal111);
            adaptor.addChild(root_0, string_literal111_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 24, control_statement_StartIndex); }
        }
        dbg.location(219, 26);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:221:1: raise_statement : 'raise' 'explicit' 'event' ID for_clause modifier_clause ;
    public final RulesetParser.raise_statement_return raise_statement() throws RecognitionException {
        RulesetParser.raise_statement_return retval = new RulesetParser.raise_statement_return();
        retval.start = input.LT(1);
        int raise_statement_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal112=null;
        Token string_literal113=null;
        Token string_literal114=null;
        Token ID115=null;
        RulesetParser.for_clause_return for_clause116 = null;

        RulesetParser.modifier_clause_return modifier_clause117 = null;


        Object string_literal112_tree=null;
        Object string_literal113_tree=null;
        Object string_literal114_tree=null;
        Object ID115_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "raise_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(221, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:221:16: ( 'raise' 'explicit' 'event' ID for_clause modifier_clause )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:221:18: 'raise' 'explicit' 'event' ID for_clause modifier_clause
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(221,18);
            string_literal112=(Token)match(input,49,FOLLOW_49_in_raise_statement1265); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal112_tree = (Object)adaptor.create(string_literal112);
            adaptor.addChild(root_0, string_literal112_tree);
            }
            dbg.location(221,26);
            string_literal113=(Token)match(input,50,FOLLOW_50_in_raise_statement1267); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal113_tree = (Object)adaptor.create(string_literal113);
            adaptor.addChild(root_0, string_literal113_tree);
            }
            dbg.location(221,37);
            string_literal114=(Token)match(input,51,FOLLOW_51_in_raise_statement1269); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal114_tree = (Object)adaptor.create(string_literal114);
            adaptor.addChild(root_0, string_literal114_tree);
            }
            dbg.location(221,45);
            ID115=(Token)match(input,ID,FOLLOW_ID_in_raise_statement1271); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID115_tree = (Object)adaptor.create(ID115);
            adaptor.addChild(root_0, ID115_tree);
            }
            dbg.location(221,48);
            pushFollow(FOLLOW_for_clause_in_raise_statement1273);
            for_clause116=for_clause();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, for_clause116.getTree());
            dbg.location(221,59);
            pushFollow(FOLLOW_modifier_clause_in_raise_statement1275);
            modifier_clause117=modifier_clause();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, modifier_clause117.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 25, raise_statement_StartIndex); }
        }
        dbg.location(221, 74);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:223:1: for_clause : 'for' ID ;
    public final RulesetParser.for_clause_return for_clause() throws RecognitionException {
        RulesetParser.for_clause_return retval = new RulesetParser.for_clause_return();
        retval.start = input.LT(1);
        int for_clause_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal118=null;
        Token ID119=null;

        Object string_literal118_tree=null;
        Object ID119_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "for_clause");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(223, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:223:11: ( 'for' ID )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:223:13: 'for' ID
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(223,13);
            string_literal118=(Token)match(input,52,FOLLOW_52_in_for_clause1282); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal118_tree = (Object)adaptor.create(string_literal118);
            adaptor.addChild(root_0, string_literal118_tree);
            }
            dbg.location(223,19);
            ID119=(Token)match(input,ID,FOLLOW_ID_in_for_clause1284); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID119_tree = (Object)adaptor.create(ID119);
            adaptor.addChild(root_0, ID119_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 26, for_clause_StartIndex); }
        }
        dbg.location(223, 21);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:228:1: rule_state : ( 'active' | 'inactive' | 'test' );
    public final RulesetParser.rule_state_return rule_state() throws RecognitionException {
        RulesetParser.rule_state_return retval = new RulesetParser.rule_state_return();
        retval.start = input.LT(1);
        int rule_state_StartIndex = input.index();
        Object root_0 = null;

        Token set120=null;

        Object set120_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rule_state");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(228, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:228:11: ( 'active' | 'inactive' | 'test' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(228,11);
            set120=(Token)input.LT(1);
            if ( (input.LA(1)>=53 && input.LA(1)<=55) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set120));
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
            if ( state.backtracking>0 ) { memoize(input, 27, rule_state_StartIndex); }
        }
        dbg.location(231, 11);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:234:1: action : ( conditional_action | unconditional_action );
    public final RulesetParser.action_return action() throws RecognitionException {
        RulesetParser.action_return retval = new RulesetParser.action_return();
        retval.start = input.LT(1);
        int action_StartIndex = input.index();
        Object root_0 = null;

        RulesetParser.conditional_action_return conditional_action121 = null;

        RulesetParser.unconditional_action_return unconditional_action122 = null;



        try { dbg.enterRule(getGrammarFileName(), "action");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(234, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:234:9: ( conditional_action | unconditional_action )
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

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:234:11: conditional_action
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(234,11);
                    pushFollow(FOLLOW_conditional_action_in_action1356);
                    conditional_action121=conditional_action();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditional_action121.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:234:32: unconditional_action
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(234,32);
                    pushFollow(FOLLOW_unconditional_action_in_action1360);
                    unconditional_action122=unconditional_action();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unconditional_action122.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 28, action_StartIndex); }
        }
        dbg.location(235, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:238:1: conditional_action : 'if' expr 'then' unconditional_action ;
    public final RulesetParser.conditional_action_return conditional_action() throws RecognitionException {
        RulesetParser.conditional_action_return retval = new RulesetParser.conditional_action_return();
        retval.start = input.LT(1);
        int conditional_action_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal123=null;
        Token string_literal125=null;
        RulesetParser.expr_return expr124 = null;

        RulesetParser.unconditional_action_return unconditional_action126 = null;


        Object string_literal123_tree=null;
        Object string_literal125_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "conditional_action");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(238, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:239:2: ( 'if' expr 'then' unconditional_action )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:239:4: 'if' expr 'then' unconditional_action
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(239,4);
            string_literal123=(Token)match(input,29,FOLLOW_29_in_conditional_action1374); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal123_tree = (Object)adaptor.create(string_literal123);
            adaptor.addChild(root_0, string_literal123_tree);
            }
            dbg.location(239,9);
            pushFollow(FOLLOW_expr_in_conditional_action1376);
            expr124=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr124.getTree());
            dbg.location(239,14);
            string_literal125=(Token)match(input,56,FOLLOW_56_in_conditional_action1378); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal125_tree = (Object)adaptor.create(string_literal125);
            adaptor.addChild(root_0, string_literal125_tree);
            }
            dbg.location(239,21);
            pushFollow(FOLLOW_unconditional_action_in_conditional_action1380);
            unconditional_action126=unconditional_action();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unconditional_action126.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 29, conditional_action_StartIndex); }
        }
        dbg.location(240, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:242:1: unconditional_action : ( primrule | actionblock );
    public final RulesetParser.unconditional_action_return unconditional_action() throws RecognitionException {
        RulesetParser.unconditional_action_return retval = new RulesetParser.unconditional_action_return();
        retval.start = input.LT(1);
        int unconditional_action_StartIndex = input.index();
        Object root_0 = null;

        RulesetParser.primrule_return primrule127 = null;

        RulesetParser.actionblock_return actionblock128 = null;



        try { dbg.enterRule(getGrammarFileName(), "unconditional_action");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(242, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:243:2: ( primrule | actionblock )
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

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:243:4: primrule
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(243,4);
                    pushFollow(FOLLOW_primrule_in_unconditional_action1393);
                    primrule127=primrule();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primrule127.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:243:15: actionblock
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(243,15);
                    pushFollow(FOLLOW_actionblock_in_unconditional_action1397);
                    actionblock128=actionblock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, actionblock128.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 30, unconditional_action_StartIndex); }
        }
        dbg.location(244, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:246:1: primrule : ( ( rule_label )? ( namespace )? ID '(' ( expr ( ',' )? )* ')' ( modifier_clause )? | ( rule_label )? emit_block );
    public final RulesetParser.primrule_return primrule() throws RecognitionException {
        RulesetParser.primrule_return retval = new RulesetParser.primrule_return();
        retval.start = input.LT(1);
        int primrule_StartIndex = input.index();
        Object root_0 = null;

        Token ID131=null;
        Token char_literal132=null;
        Token char_literal134=null;
        Token char_literal135=null;
        RulesetParser.rule_label_return rule_label129 = null;

        RulesetParser.namespace_return namespace130 = null;

        RulesetParser.expr_return expr133 = null;

        RulesetParser.modifier_clause_return modifier_clause136 = null;

        RulesetParser.rule_label_return rule_label137 = null;

        RulesetParser.emit_block_return emit_block138 = null;


        Object ID131_tree=null;
        Object char_literal132_tree=null;
        Object char_literal134_tree=null;
        Object char_literal135_tree=null;



        try { dbg.enterRule(getGrammarFileName(), "primrule");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(246, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:251:2: ( ( rule_label )? ( namespace )? ID '(' ( expr ( ',' )? )* ')' ( modifier_clause )? | ( rule_label )? emit_block )
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

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:252:2: ( rule_label )? ( namespace )? ID '(' ( expr ( ',' )? )* ')' ( modifier_clause )?
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(252,2);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:252:2: ( rule_label )?
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

                            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:252:2: rule_label
                            {
                            dbg.location(252,2);
                            pushFollow(FOLLOW_rule_label_in_primrule1422);
                            rule_label129=rule_label();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, rule_label129.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(16);}

                    dbg.location(252,14);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:252:14: ( namespace )?
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

                            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:252:14: namespace
                            {
                            dbg.location(252,14);
                            pushFollow(FOLLOW_namespace_in_primrule1425);
                            namespace130=namespace();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, namespace130.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(17);}

                    dbg.location(252,25);
                    ID131=(Token)match(input,ID,FOLLOW_ID_in_primrule1428); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID131_tree = (Object)adaptor.create(ID131);
                    adaptor.addChild(root_0, ID131_tree);
                    }
                    dbg.location(252,28);
                    char_literal132=(Token)match(input,57,FOLLOW_57_in_primrule1430); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal132_tree = (Object)adaptor.create(char_literal132);
                    adaptor.addChild(root_0, char_literal132_tree);
                    }
                    dbg.location(252,32);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:252:32: ( expr ( ',' )? )*
                    try { dbg.enterSubRule(19);

                    loop19:
                    do {
                        int alt19=2;
                        try { dbg.enterDecision(19);

                        int LA19_0 = input.LA(1);

                        if ( ((LA19_0>=ID && LA19_0<=INT)||LA19_0==REGEXP||LA19_0==STRING||LA19_0==20||LA19_0==57||LA19_0==71||LA19_0==84||LA19_0==102||(LA19_0>=104 && LA19_0<=106)||(LA19_0>=108 && LA19_0<=109)||(LA19_0>=134 && LA19_0<=135)) ) {
                            alt19=1;
                        }


                        } finally {dbg.exitDecision(19);}

                        switch (alt19) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:252:33: expr ( ',' )?
                    	    {
                    	    dbg.location(252,33);
                    	    pushFollow(FOLLOW_expr_in_primrule1433);
                    	    expr133=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr133.getTree());
                    	    dbg.location(252,38);
                    	    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:252:38: ( ',' )?
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

                    	            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:252:38: ','
                    	            {
                    	            dbg.location(252,38);
                    	            char_literal134=(Token)match(input,58,FOLLOW_58_in_primrule1435); if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) {
                    	            char_literal134_tree = (Object)adaptor.create(char_literal134);
                    	            adaptor.addChild(root_0, char_literal134_tree);
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

                    dbg.location(252,45);
                    char_literal135=(Token)match(input,59,FOLLOW_59_in_primrule1440); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal135_tree = (Object)adaptor.create(char_literal135);
                    adaptor.addChild(root_0, char_literal135_tree);
                    }
                    dbg.location(252,49);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:252:49: ( modifier_clause )?
                    int alt20=2;
                    try { dbg.enterSubRule(20);
                    try { dbg.enterDecision(20);

                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==43) ) {
                        alt20=1;
                    }
                    } finally {dbg.exitDecision(20);}

                    switch (alt20) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:252:49: modifier_clause
                            {
                            dbg.location(252,49);
                            pushFollow(FOLLOW_modifier_clause_in_primrule1442);
                            modifier_clause136=modifier_clause();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, modifier_clause136.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(20);}

                    dbg.location(253,3);
                    if ( state.backtracking==0 ) {
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:255:3: ( rule_label )? emit_block
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(255,3);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:255:3: ( rule_label )?
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

                            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:255:3: rule_label
                            {
                            dbg.location(255,3);
                            pushFollow(FOLLOW_rule_label_in_primrule1455);
                            rule_label137=rule_label();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, rule_label137.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(21);}

                    dbg.location(255,15);
                    pushFollow(FOLLOW_emit_block_in_primrule1458);
                    emit_block138=emit_block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, emit_block138.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {


            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 31, primrule_StartIndex); }
        }
        dbg.location(257, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:259:1: rule_label : ID '=>' ;
    public final RulesetParser.rule_label_return rule_label() throws RecognitionException {
        RulesetParser.rule_label_return retval = new RulesetParser.rule_label_return();
        retval.start = input.LT(1);
        int rule_label_StartIndex = input.index();
        Object root_0 = null;

        Token ID139=null;
        Token string_literal140=null;

        Object ID139_tree=null;
        Object string_literal140_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rule_label");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(259, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:259:12: ( ID '=>' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:259:14: ID '=>'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(259,14);
            ID139=(Token)match(input,ID,FOLLOW_ID_in_rule_label1481); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID139_tree = (Object)adaptor.create(ID139);
            adaptor.addChild(root_0, ID139_tree);
            }
            dbg.location(259,17);
            string_literal140=(Token)match(input,60,FOLLOW_60_in_rule_label1483); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal140_tree = (Object)adaptor.create(string_literal140);
            adaptor.addChild(root_0, string_literal140_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 32, rule_label_StartIndex); }
        }
        dbg.location(259, 21);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:261:1: modifier_clause : 'with' modifier ( 'and' modifier )* ;
    public final RulesetParser.modifier_clause_return modifier_clause() throws RecognitionException {
        RulesetParser.modifier_clause_return retval = new RulesetParser.modifier_clause_return();
        retval.start = input.LT(1);
        int modifier_clause_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal141=null;
        Token string_literal143=null;
        RulesetParser.modifier_return modifier142 = null;

        RulesetParser.modifier_return modifier144 = null;


        Object string_literal141_tree=null;
        Object string_literal143_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "modifier_clause");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(261, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:262:2: ( 'with' modifier ( 'and' modifier )* )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:262:5: 'with' modifier ( 'and' modifier )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(262,5);
            string_literal141=(Token)match(input,43,FOLLOW_43_in_modifier_clause1504); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal141_tree = (Object)adaptor.create(string_literal141);
            adaptor.addChild(root_0, string_literal141_tree);
            }
            dbg.location(262,12);
            pushFollow(FOLLOW_modifier_in_modifier_clause1506);
            modifier142=modifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, modifier142.getTree());
            dbg.location(262,21);
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:262:21: ( 'and' modifier )*
            try { dbg.enterSubRule(23);

            loop23:
            do {
                int alt23=2;
                try { dbg.enterDecision(23);

                int LA23_0 = input.LA(1);

                if ( (LA23_0==61) ) {
                    alt23=1;
                }


                } finally {dbg.exitDecision(23);}

                switch (alt23) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:262:22: 'and' modifier
            	    {
            	    dbg.location(262,22);
            	    string_literal143=(Token)match(input,61,FOLLOW_61_in_modifier_clause1509); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal143_tree = (Object)adaptor.create(string_literal143);
            	    adaptor.addChild(root_0, string_literal143_tree);
            	    }
            	    dbg.location(262,28);
            	    pushFollow(FOLLOW_modifier_in_modifier_clause1511);
            	    modifier144=modifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, modifier144.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);
            } finally {dbg.exitSubRule(23);}


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
            if ( state.backtracking>0 ) { memoize(input, 33, modifier_clause_StartIndex); }
        }
        dbg.location(263, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:265:1: modifier : ID '=' ( expr | JS ) ;
    public final RulesetParser.modifier_return modifier() throws RecognitionException {
        RulesetParser.modifier_return retval = new RulesetParser.modifier_return();
        retval.start = input.LT(1);
        int modifier_StartIndex = input.index();
        Object root_0 = null;

        Token ID145=null;
        Token char_literal146=null;
        Token JS148=null;
        RulesetParser.expr_return expr147 = null;


        Object ID145_tree=null;
        Object char_literal146_tree=null;
        Object JS148_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "modifier");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(265, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:266:2: ( ID '=' ( expr | JS ) )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:266:4: ID '=' ( expr | JS )
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(266,4);
            ID145=(Token)match(input,ID,FOLLOW_ID_in_modifier1526); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID145_tree = (Object)adaptor.create(ID145);
            adaptor.addChild(root_0, ID145_tree);
            }
            dbg.location(266,7);
            char_literal146=(Token)match(input,35,FOLLOW_35_in_modifier1528); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal146_tree = (Object)adaptor.create(char_literal146);
            adaptor.addChild(root_0, char_literal146_tree);
            }
            dbg.location(266,11);
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:266:11: ( expr | JS )
            int alt24=2;
            try { dbg.enterSubRule(24);
            try { dbg.enterDecision(24);

            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=ID && LA24_0<=INT)||LA24_0==REGEXP||LA24_0==STRING||LA24_0==20||LA24_0==57||LA24_0==71||LA24_0==84||LA24_0==102||(LA24_0>=104 && LA24_0<=106)||(LA24_0>=108 && LA24_0<=109)||(LA24_0>=134 && LA24_0<=135)) ) {
                alt24=1;
            }
            else if ( (LA24_0==JS) ) {
                alt24=2;
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

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:266:12: expr
                    {
                    dbg.location(266,12);
                    pushFollow(FOLLOW_expr_in_modifier1531);
                    expr147=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr147.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:266:19: JS
                    {
                    dbg.location(266,19);
                    JS148=(Token)match(input,JS,FOLLOW_JS_in_modifier1535); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    JS148_tree = (Object)adaptor.create(JS148);
                    adaptor.addChild(root_0, JS148_tree);
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(24);}


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
            if ( state.backtracking>0 ) { memoize(input, 34, modifier_StartIndex); }
        }
        dbg.location(267, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:269:1: actionblock : blocktype '{' ( primrule ( ';' )? )* '}' ;
    public final RulesetParser.actionblock_return actionblock() throws RecognitionException {
        RulesetParser.actionblock_return retval = new RulesetParser.actionblock_return();
        retval.start = input.LT(1);
        int actionblock_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal150=null;
        Token char_literal152=null;
        Token char_literal153=null;
        RulesetParser.blocktype_return blocktype149 = null;

        RulesetParser.primrule_return primrule151 = null;


        Object char_literal150_tree=null;
        Object char_literal152_tree=null;
        Object char_literal153_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "actionblock");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(269, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:270:2: ( blocktype '{' ( primrule ( ';' )? )* '}' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:270:4: blocktype '{' ( primrule ( ';' )? )* '}'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(270,4);
            pushFollow(FOLLOW_blocktype_in_actionblock1550);
            blocktype149=blocktype();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, blocktype149.getTree());
            dbg.location(270,14);
            char_literal150=(Token)match(input,20,FOLLOW_20_in_actionblock1552); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal150_tree = (Object)adaptor.create(char_literal150);
            adaptor.addChild(root_0, char_literal150_tree);
            }
            dbg.location(270,18);
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:270:18: ( primrule ( ';' )? )*
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

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:270:19: primrule ( ';' )?
            	    {
            	    dbg.location(270,19);
            	    pushFollow(FOLLOW_primrule_in_actionblock1555);
            	    primrule151=primrule();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, primrule151.getTree());
            	    dbg.location(270,28);
            	    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:270:28: ( ';' )?
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

            	            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:270:28: ';'
            	            {
            	            dbg.location(270,28);
            	            char_literal152=(Token)match(input,24,FOLLOW_24_in_actionblock1557); if (state.failed) return retval;
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

            dbg.location(270,35);
            char_literal153=(Token)match(input,21,FOLLOW_21_in_actionblock1562); if (state.failed) return retval;
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
            if ( state.backtracking>0 ) { memoize(input, 35, actionblock_StartIndex); }
        }
        dbg.location(271, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:273:1: blocktype : ( 'choose' | 'every' );
    public final RulesetParser.blocktype_return blocktype() throws RecognitionException {
        RulesetParser.blocktype_return retval = new RulesetParser.blocktype_return();
        retval.start = input.LT(1);
        int blocktype_StartIndex = input.index();
        Object root_0 = null;

        Token set154=null;

        Object set154_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "blocktype");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(273, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:273:10: ( 'choose' | 'every' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(273,10);
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
            if ( state.backtracking>0 ) { memoize(input, 36, blocktype_StartIndex); }
        }
        dbg.location(274, 19);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:277:1: pre_block : 'pre' '{' ( decl ( ';' )? ) '}' ;
    public final RulesetParser.pre_block_return pre_block() throws RecognitionException {
        RulesetParser.pre_block_return retval = new RulesetParser.pre_block_return();
        retval.start = input.LT(1);
        int pre_block_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal155=null;
        Token char_literal156=null;
        Token char_literal158=null;
        Token char_literal159=null;
        RulesetParser.decl_return decl157 = null;


        Object string_literal155_tree=null;
        Object char_literal156_tree=null;
        Object char_literal158_tree=null;
        Object char_literal159_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "pre_block");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(277, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:277:10: ( 'pre' '{' ( decl ( ';' )? ) '}' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:277:12: 'pre' '{' ( decl ( ';' )? ) '}'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(277,12);
            string_literal155=(Token)match(input,64,FOLLOW_64_in_pre_block1604); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal155_tree = (Object)adaptor.create(string_literal155);
            adaptor.addChild(root_0, string_literal155_tree);
            }
            dbg.location(277,18);
            char_literal156=(Token)match(input,20,FOLLOW_20_in_pre_block1606); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal156_tree = (Object)adaptor.create(char_literal156);
            adaptor.addChild(root_0, char_literal156_tree);
            }
            dbg.location(277,22);
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:277:22: ( decl ( ';' )? )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:277:23: decl ( ';' )?
            {
            dbg.location(277,23);
            pushFollow(FOLLOW_decl_in_pre_block1609);
            decl157=decl();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, decl157.getTree());
            dbg.location(277,28);
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:277:28: ( ';' )?
            int alt27=2;
            try { dbg.enterSubRule(27);
            try { dbg.enterDecision(27);

            int LA27_0 = input.LA(1);

            if ( (LA27_0==24) ) {
                alt27=1;
            }
            } finally {dbg.exitDecision(27);}

            switch (alt27) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:277:28: ';'
                    {
                    dbg.location(277,28);
                    char_literal158=(Token)match(input,24,FOLLOW_24_in_pre_block1611); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal158_tree = (Object)adaptor.create(char_literal158);
                    adaptor.addChild(root_0, char_literal158_tree);
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(27);}


            }

            dbg.location(277,34);
            char_literal159=(Token)match(input,21,FOLLOW_21_in_pre_block1615); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal159_tree = (Object)adaptor.create(char_literal159);
            adaptor.addChild(root_0, char_literal159_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 37, pre_block_StartIndex); }
        }
        dbg.location(277, 37);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:280:1: foreach : 'foreach' expr setting ;
    public final RulesetParser.foreach_return foreach() throws RecognitionException {
        RulesetParser.foreach_return retval = new RulesetParser.foreach_return();
        retval.start = input.LT(1);
        int foreach_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal160=null;
        RulesetParser.expr_return expr161 = null;

        RulesetParser.setting_return setting162 = null;


        Object string_literal160_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "foreach");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(280, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:280:8: ( 'foreach' expr setting )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:281:2: 'foreach' expr setting
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(281,2);
            string_literal160=(Token)match(input,65,FOLLOW_65_in_foreach1635); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal160_tree = (Object)adaptor.create(string_literal160);
            adaptor.addChild(root_0, string_literal160_tree);
            }
            dbg.location(281,12);
            pushFollow(FOLLOW_expr_in_foreach1637);
            expr161=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr161.getTree());
            dbg.location(281,17);
            pushFollow(FOLLOW_setting_in_foreach1639);
            setting162=setting();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, setting162.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 38, foreach_StartIndex); }
        }
        dbg.location(282, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "foreach");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "foreach"

    public static class select_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "select_clause"
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:284:1: select_clause : 'select' ( using | when ) ( foreach )? ;
    public final RulesetParser.select_clause_return select_clause() throws RecognitionException {
        RulesetParser.select_clause_return retval = new RulesetParser.select_clause_return();
        retval.start = input.LT(1);
        int select_clause_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal163=null;
        RulesetParser.using_return using164 = null;

        RulesetParser.when_return when165 = null;

        RulesetParser.foreach_return foreach166 = null;


        Object string_literal163_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "select_clause");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(284, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:284:15: ( 'select' ( using | when ) ( foreach )? )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:284:17: 'select' ( using | when ) ( foreach )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(284,17);
            string_literal163=(Token)match(input,66,FOLLOW_66_in_select_clause1658); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal163_tree = (Object)adaptor.create(string_literal163);
            adaptor.addChild(root_0, string_literal163_tree);
            }
            dbg.location(284,26);
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:284:26: ( using | when )
            int alt28=2;
            try { dbg.enterSubRule(28);
            try { dbg.enterDecision(28);

            int LA28_0 = input.LA(1);

            if ( (LA28_0==67) ) {
                alt28=1;
            }
            else if ( (LA28_0==68) ) {
                alt28=2;
            }
            else {
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

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:284:27: using
                    {
                    dbg.location(284,27);
                    pushFollow(FOLLOW_using_in_select_clause1661);
                    using164=using();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, using164.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:284:33: when
                    {
                    dbg.location(284,33);
                    pushFollow(FOLLOW_when_in_select_clause1663);
                    when165=when();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, when165.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(28);}

            dbg.location(284,39);
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:284:39: ( foreach )?
            int alt29=2;
            try { dbg.enterSubRule(29);
            try { dbg.enterDecision(29);

            int LA29_0 = input.LA(1);

            if ( (LA29_0==65) ) {
                alt29=1;
            }
            } finally {dbg.exitDecision(29);}

            switch (alt29) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:284:39: foreach
                    {
                    dbg.location(284,39);
                    pushFollow(FOLLOW_foreach_in_select_clause1666);
                    foreach166=foreach();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, foreach166.getTree());

                    }
                    break;

            }
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
            if ( state.backtracking>0 ) { memoize(input, 39, select_clause_StartIndex); }
        }
        dbg.location(285, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "select_clause");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "select_clause"

    public static class using_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "using"
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:287:1: using : 'using' STRING setting ;
    public final RulesetParser.using_return using() throws RecognitionException {
        RulesetParser.using_return retval = new RulesetParser.using_return();
        retval.start = input.LT(1);
        int using_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal167=null;
        Token STRING168=null;
        RulesetParser.setting_return setting169 = null;


        Object string_literal167_tree=null;
        Object STRING168_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "using");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(287, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:287:7: ( 'using' STRING setting )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:287:9: 'using' STRING setting
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(287,9);
            string_literal167=(Token)match(input,67,FOLLOW_67_in_using1680); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal167_tree = (Object)adaptor.create(string_literal167);
            adaptor.addChild(root_0, string_literal167_tree);
            }
            dbg.location(287,17);
            STRING168=(Token)match(input,STRING,FOLLOW_STRING_in_using1682); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING168_tree = (Object)adaptor.create(STRING168);
            adaptor.addChild(root_0, STRING168_tree);
            }
            dbg.location(287,24);
            pushFollow(FOLLOW_setting_in_using1684);
            setting169=setting();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, setting169.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 40, using_StartIndex); }
        }
        dbg.location(287, 31);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:289:1: when : 'when' event_seq ;
    public final RulesetParser.when_return when() throws RecognitionException {
        RulesetParser.when_return retval = new RulesetParser.when_return();
        retval.start = input.LT(1);
        int when_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal170=null;
        RulesetParser.event_seq_return event_seq171 = null;


        Object string_literal170_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "when");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(289, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:289:6: ( 'when' event_seq )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:289:7: 'when' event_seq
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(289,7);
            string_literal170=(Token)match(input,68,FOLLOW_68_in_when1691); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal170_tree = (Object)adaptor.create(string_literal170);
            adaptor.addChild(root_0, string_literal170_tree);
            }
            dbg.location(289,14);
            pushFollow(FOLLOW_event_seq_in_when1693);
            event_seq171=event_seq();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, event_seq171.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 41, when_StartIndex); }
        }
        dbg.location(289, 23);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:291:1: event_seq options {backtrack=true; } : ( event_or 'then' | event_or 'before' | event_or );
    public final RulesetParser.event_seq_return event_seq() throws RecognitionException {
        RulesetParser.event_seq_return retval = new RulesetParser.event_seq_return();
        retval.start = input.LT(1);
        int event_seq_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal173=null;
        Token string_literal175=null;
        RulesetParser.event_or_return event_or172 = null;

        RulesetParser.event_or_return event_or174 = null;

        RulesetParser.event_or_return event_or176 = null;


        Object string_literal173_tree=null;
        Object string_literal175_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "event_seq");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(291, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:292:2: ( event_or 'then' | event_or 'before' | event_or )
            int alt30=3;
            try { dbg.enterDecision(30);

            switch ( input.LA(1) ) {
            case 78:
                {
                int LA30_1 = input.LA(2);

                if ( (synpred1_Ruleset()) ) {
                    alt30=1;
                }
                else if ( (synpred2_Ruleset()) ) {
                    alt30=2;
                }
                else if ( (true) ) {
                    alt30=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case ID:
                {
                int LA30_2 = input.LA(2);

                if ( (synpred1_Ruleset()) ) {
                    alt30=1;
                }
                else if ( (synpred2_Ruleset()) ) {
                    alt30=2;
                }
                else if ( (true) ) {
                    alt30=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case 57:
                {
                int LA30_3 = input.LA(2);

                if ( (synpred1_Ruleset()) ) {
                    alt30=1;
                }
                else if ( (synpred2_Ruleset()) ) {
                    alt30=2;
                }
                else if ( (true) ) {
                    alt30=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 3, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(30);}

            switch (alt30) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:292:4: event_or 'then'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(292,4);
                    pushFollow(FOLLOW_event_or_in_event_seq1714);
                    event_or172=event_or();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, event_or172.getTree());
                    dbg.location(292,13);
                    string_literal173=(Token)match(input,56,FOLLOW_56_in_event_seq1716); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal173_tree = (Object)adaptor.create(string_literal173);
                    adaptor.addChild(root_0, string_literal173_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:293:3: event_or 'before'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(293,3);
                    pushFollow(FOLLOW_event_or_in_event_seq1721);
                    event_or174=event_or();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, event_or174.getTree());
                    dbg.location(293,12);
                    string_literal175=(Token)match(input,69,FOLLOW_69_in_event_seq1723); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal175_tree = (Object)adaptor.create(string_literal175);
                    adaptor.addChild(root_0, string_literal175_tree);
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:294:3: event_or
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(294,3);
                    pushFollow(FOLLOW_event_or_in_event_seq1728);
                    event_or176=event_or();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, event_or176.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 42, event_seq_StartIndex); }
        }
        dbg.location(295, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:297:1: event_or : event_and ( 'or' event_and )* ;
    public final RulesetParser.event_or_return event_or() throws RecognitionException {
        RulesetParser.event_or_return retval = new RulesetParser.event_or_return();
        retval.start = input.LT(1);
        int event_or_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal178=null;
        RulesetParser.event_and_return event_and177 = null;

        RulesetParser.event_and_return event_and179 = null;


        Object string_literal178_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "event_or");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(297, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:297:9: ( event_and ( 'or' event_and )* )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:297:11: event_and ( 'or' event_and )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(297,11);
            pushFollow(FOLLOW_event_and_in_event_or1739);
            event_and177=event_and();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, event_and177.getTree());
            dbg.location(297,21);
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:297:21: ( 'or' event_and )*
            try { dbg.enterSubRule(31);

            loop31:
            do {
                int alt31=2;
                try { dbg.enterDecision(31);

                int LA31_0 = input.LA(1);

                if ( (LA31_0==70) ) {
                    alt31=1;
                }


                } finally {dbg.exitDecision(31);}

                switch (alt31) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:297:22: 'or' event_and
            	    {
            	    dbg.location(297,22);
            	    string_literal178=(Token)match(input,70,FOLLOW_70_in_event_or1742); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal178_tree = (Object)adaptor.create(string_literal178);
            	    adaptor.addChild(root_0, string_literal178_tree);
            	    }
            	    dbg.location(297,27);
            	    pushFollow(FOLLOW_event_and_in_event_or1744);
            	    event_and179=event_and();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, event_and179.getTree());

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);
            } finally {dbg.exitSubRule(31);}


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
            if ( state.backtracking>0 ) { memoize(input, 43, event_or_StartIndex); }
        }
        dbg.location(297, 38);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:299:1: event_and : event_btwn ( 'and' event_btwn )* ;
    public final RulesetParser.event_and_return event_and() throws RecognitionException {
        RulesetParser.event_and_return retval = new RulesetParser.event_and_return();
        retval.start = input.LT(1);
        int event_and_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal181=null;
        RulesetParser.event_btwn_return event_btwn180 = null;

        RulesetParser.event_btwn_return event_btwn182 = null;


        Object string_literal181_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "event_and");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(299, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:300:2: ( event_btwn ( 'and' event_btwn )* )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:300:4: event_btwn ( 'and' event_btwn )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(300,4);
            pushFollow(FOLLOW_event_btwn_in_event_and1755);
            event_btwn180=event_btwn();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, event_btwn180.getTree());
            dbg.location(300,15);
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:300:15: ( 'and' event_btwn )*
            try { dbg.enterSubRule(32);

            loop32:
            do {
                int alt32=2;
                try { dbg.enterDecision(32);

                int LA32_0 = input.LA(1);

                if ( (LA32_0==61) ) {
                    alt32=1;
                }


                } finally {dbg.exitDecision(32);}

                switch (alt32) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:300:16: 'and' event_btwn
            	    {
            	    dbg.location(300,16);
            	    string_literal181=(Token)match(input,61,FOLLOW_61_in_event_and1758); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal181_tree = (Object)adaptor.create(string_literal181);
            	    adaptor.addChild(root_0, string_literal181_tree);
            	    }
            	    dbg.location(300,22);
            	    pushFollow(FOLLOW_event_btwn_in_event_and1760);
            	    event_btwn182=event_btwn();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, event_btwn182.getTree());

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);
            } finally {dbg.exitSubRule(32);}


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
            if ( state.backtracking>0 ) { memoize(input, 44, event_and_StartIndex); }
        }
        dbg.location(301, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:303:1: event_btwn : event_prim ( 'not' ) 'between' '(' event_seq ',' event_seq ')' ;
    public final RulesetParser.event_btwn_return event_btwn() throws RecognitionException {
        RulesetParser.event_btwn_return retval = new RulesetParser.event_btwn_return();
        retval.start = input.LT(1);
        int event_btwn_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal184=null;
        Token string_literal185=null;
        Token char_literal186=null;
        Token char_literal188=null;
        Token char_literal190=null;
        RulesetParser.event_prim_return event_prim183 = null;

        RulesetParser.event_seq_return event_seq187 = null;

        RulesetParser.event_seq_return event_seq189 = null;


        Object string_literal184_tree=null;
        Object string_literal185_tree=null;
        Object char_literal186_tree=null;
        Object char_literal188_tree=null;
        Object char_literal190_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "event_btwn");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(303, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:304:2: ( event_prim ( 'not' ) 'between' '(' event_seq ',' event_seq ')' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:304:4: event_prim ( 'not' ) 'between' '(' event_seq ',' event_seq ')'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(304,4);
            pushFollow(FOLLOW_event_prim_in_event_btwn1773);
            event_prim183=event_prim();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, event_prim183.getTree());
            dbg.location(304,15);
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:304:15: ( 'not' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:304:16: 'not'
            {
            dbg.location(304,16);
            string_literal184=(Token)match(input,71,FOLLOW_71_in_event_btwn1776); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal184_tree = (Object)adaptor.create(string_literal184);
            adaptor.addChild(root_0, string_literal184_tree);
            }

            }

            dbg.location(304,23);
            string_literal185=(Token)match(input,72,FOLLOW_72_in_event_btwn1779); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal185_tree = (Object)adaptor.create(string_literal185);
            adaptor.addChild(root_0, string_literal185_tree);
            }
            dbg.location(304,33);
            char_literal186=(Token)match(input,57,FOLLOW_57_in_event_btwn1781); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal186_tree = (Object)adaptor.create(char_literal186);
            adaptor.addChild(root_0, char_literal186_tree);
            }
            dbg.location(304,37);
            pushFollow(FOLLOW_event_seq_in_event_btwn1783);
            event_seq187=event_seq();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, event_seq187.getTree());
            dbg.location(304,47);
            char_literal188=(Token)match(input,58,FOLLOW_58_in_event_btwn1785); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal188_tree = (Object)adaptor.create(char_literal188);
            adaptor.addChild(root_0, char_literal188_tree);
            }
            dbg.location(304,51);
            pushFollow(FOLLOW_event_seq_in_event_btwn1787);
            event_seq189=event_seq();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, event_seq189.getTree());
            dbg.location(304,61);
            char_literal190=(Token)match(input,59,FOLLOW_59_in_event_btwn1789); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal190_tree = (Object)adaptor.create(char_literal190);
            adaptor.addChild(root_0, char_literal190_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 45, event_btwn_StartIndex); }
        }
        dbg.location(304, 64);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:307:1: event_prim : ( event_domain 'pageview' ( STRING | REGEXP ) setting | event_domain ( 'submit' | 'click' | 'dblclick' | 'change' | 'update' ) STRING on_expr setting | ID ID event_filter setting | '(' event_seq ')' );
    public final RulesetParser.event_prim_return event_prim() throws RecognitionException {
        RulesetParser.event_prim_return retval = new RulesetParser.event_prim_return();
        retval.start = input.LT(1);
        int event_prim_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal192=null;
        Token set193=null;
        Token set196=null;
        Token STRING197=null;
        Token ID200=null;
        Token ID201=null;
        Token char_literal204=null;
        Token char_literal206=null;
        RulesetParser.event_domain_return event_domain191 = null;

        RulesetParser.setting_return setting194 = null;

        RulesetParser.event_domain_return event_domain195 = null;

        RulesetParser.on_expr_return on_expr198 = null;

        RulesetParser.setting_return setting199 = null;

        RulesetParser.event_filter_return event_filter202 = null;

        RulesetParser.setting_return setting203 = null;

        RulesetParser.event_seq_return event_seq205 = null;


        Object string_literal192_tree=null;
        Object set193_tree=null;
        Object set196_tree=null;
        Object STRING197_tree=null;
        Object ID200_tree=null;
        Object ID201_tree=null;
        Object char_literal204_tree=null;
        Object char_literal206_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "event_prim");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(307, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:308:2: ( event_domain 'pageview' ( STRING | REGEXP ) setting | event_domain ( 'submit' | 'click' | 'dblclick' | 'change' | 'update' ) STRING on_expr setting | ID ID event_filter setting | '(' event_seq ')' )
            int alt33=4;
            try { dbg.enterDecision(33);

            switch ( input.LA(1) ) {
            case 78:
                {
                int LA33_1 = input.LA(2);

                if ( ((LA33_1>=33 && LA33_1<=34)||(LA33_1>=74 && LA33_1<=76)) ) {
                    alt33=2;
                }
                else if ( (LA33_1==73) ) {
                    alt33=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case ID:
                {
                alt33=3;
                }
                break;
            case 57:
                {
                alt33=4;
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

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:308:4: event_domain 'pageview' ( STRING | REGEXP ) setting
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(308,4);
                    pushFollow(FOLLOW_event_domain_in_event_prim1804);
                    event_domain191=event_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, event_domain191.getTree());
                    dbg.location(308,17);
                    string_literal192=(Token)match(input,73,FOLLOW_73_in_event_prim1806); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal192_tree = (Object)adaptor.create(string_literal192);
                    adaptor.addChild(root_0, string_literal192_tree);
                    }
                    dbg.location(308,28);
                    set193=(Token)input.LT(1);
                    if ( input.LA(1)==REGEXP||input.LA(1)==STRING ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set193));
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(308,44);
                    pushFollow(FOLLOW_setting_in_event_prim1814);
                    setting194=setting();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, setting194.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:309:2: event_domain ( 'submit' | 'click' | 'dblclick' | 'change' | 'update' ) STRING on_expr setting
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(309,2);
                    pushFollow(FOLLOW_event_domain_in_event_prim1819);
                    event_domain195=event_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, event_domain195.getTree());
                    dbg.location(309,15);
                    set196=(Token)input.LT(1);
                    if ( (input.LA(1)>=33 && input.LA(1)<=34)||(input.LA(1)>=74 && input.LA(1)<=76) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set196));
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(309,63);
                    STRING197=(Token)match(input,STRING,FOLLOW_STRING_in_event_prim1833); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING197_tree = (Object)adaptor.create(STRING197);
                    adaptor.addChild(root_0, STRING197_tree);
                    }
                    dbg.location(309,70);
                    pushFollow(FOLLOW_on_expr_in_event_prim1835);
                    on_expr198=on_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, on_expr198.getTree());
                    dbg.location(309,79);
                    pushFollow(FOLLOW_setting_in_event_prim1838);
                    setting199=setting();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, setting199.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:310:2: ID ID event_filter setting
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(310,2);
                    ID200=(Token)match(input,ID,FOLLOW_ID_in_event_prim1843); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID200_tree = (Object)adaptor.create(ID200);
                    adaptor.addChild(root_0, ID200_tree);
                    }
                    dbg.location(310,5);
                    ID201=(Token)match(input,ID,FOLLOW_ID_in_event_prim1845); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID201_tree = (Object)adaptor.create(ID201);
                    adaptor.addChild(root_0, ID201_tree);
                    }
                    dbg.location(310,8);
                    pushFollow(FOLLOW_event_filter_in_event_prim1847);
                    event_filter202=event_filter();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, event_filter202.getTree());
                    dbg.location(310,21);
                    pushFollow(FOLLOW_setting_in_event_prim1849);
                    setting203=setting();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, setting203.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:311:2: '(' event_seq ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(311,2);
                    char_literal204=(Token)match(input,57,FOLLOW_57_in_event_prim1854); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal204_tree = (Object)adaptor.create(char_literal204);
                    adaptor.addChild(root_0, char_literal204_tree);
                    }
                    dbg.location(311,6);
                    pushFollow(FOLLOW_event_seq_in_event_prim1856);
                    event_seq205=event_seq();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, event_seq205.getTree());
                    dbg.location(311,16);
                    char_literal206=(Token)match(input,59,FOLLOW_59_in_event_prim1858); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal206_tree = (Object)adaptor.create(char_literal206);
                    adaptor.addChild(root_0, char_literal206_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 46, event_prim_StartIndex); }
        }
        dbg.location(312, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:314:1: setting : 'setting' '(' ( ID ( ',' )? )* ')' ;
    public final RulesetParser.setting_return setting() throws RecognitionException {
        RulesetParser.setting_return retval = new RulesetParser.setting_return();
        retval.start = input.LT(1);
        int setting_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal207=null;
        Token char_literal208=null;
        Token ID209=null;
        Token char_literal210=null;
        Token char_literal211=null;

        Object string_literal207_tree=null;
        Object char_literal208_tree=null;
        Object ID209_tree=null;
        Object char_literal210_tree=null;
        Object char_literal211_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "setting");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(314, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:314:9: ( 'setting' '(' ( ID ( ',' )? )* ')' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:314:11: 'setting' '(' ( ID ( ',' )? )* ')'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(314,11);
            string_literal207=(Token)match(input,77,FOLLOW_77_in_setting1869); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal207_tree = (Object)adaptor.create(string_literal207);
            adaptor.addChild(root_0, string_literal207_tree);
            }
            dbg.location(314,21);
            char_literal208=(Token)match(input,57,FOLLOW_57_in_setting1871); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal208_tree = (Object)adaptor.create(char_literal208);
            adaptor.addChild(root_0, char_literal208_tree);
            }
            dbg.location(314,25);
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:314:25: ( ID ( ',' )? )*
            try { dbg.enterSubRule(35);

            loop35:
            do {
                int alt35=2;
                try { dbg.enterDecision(35);

                int LA35_0 = input.LA(1);

                if ( (LA35_0==ID) ) {
                    alt35=1;
                }


                } finally {dbg.exitDecision(35);}

                switch (alt35) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:314:26: ID ( ',' )?
            	    {
            	    dbg.location(314,26);
            	    ID209=(Token)match(input,ID,FOLLOW_ID_in_setting1874); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    ID209_tree = (Object)adaptor.create(ID209);
            	    adaptor.addChild(root_0, ID209_tree);
            	    }
            	    dbg.location(314,29);
            	    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:314:29: ( ',' )?
            	    int alt34=2;
            	    try { dbg.enterSubRule(34);
            	    try { dbg.enterDecision(34);

            	    int LA34_0 = input.LA(1);

            	    if ( (LA34_0==58) ) {
            	        alt34=1;
            	    }
            	    } finally {dbg.exitDecision(34);}

            	    switch (alt34) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:314:29: ','
            	            {
            	            dbg.location(314,29);
            	            char_literal210=(Token)match(input,58,FOLLOW_58_in_setting1876); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal210_tree = (Object)adaptor.create(char_literal210);
            	            adaptor.addChild(root_0, char_literal210_tree);
            	            }

            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(34);}


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);
            } finally {dbg.exitSubRule(35);}

            dbg.location(314,36);
            char_literal211=(Token)match(input,59,FOLLOW_59_in_setting1881); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal211_tree = (Object)adaptor.create(char_literal211);
            adaptor.addChild(root_0, char_literal211_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 47, setting_StartIndex); }
        }
        dbg.location(314, 39);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:316:1: event_domain : 'web' ;
    public final RulesetParser.event_domain_return event_domain() throws RecognitionException {
        RulesetParser.event_domain_return retval = new RulesetParser.event_domain_return();
        retval.start = input.LT(1);
        int event_domain_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal212=null;

        Object string_literal212_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "event_domain");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(316, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:317:2: ( 'web' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:317:4: 'web'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(317,4);
            string_literal212=(Token)match(input,78,FOLLOW_78_in_event_domain1891); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal212_tree = (Object)adaptor.create(string_literal212);
            adaptor.addChild(root_0, string_literal212_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 48, event_domain_StartIndex); }
        }
        dbg.location(318, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:320:1: event_filter : ID ( STRING | REGEXP ) ;
    public final RulesetParser.event_filter_return event_filter() throws RecognitionException {
        RulesetParser.event_filter_return retval = new RulesetParser.event_filter_return();
        retval.start = input.LT(1);
        int event_filter_StartIndex = input.index();
        Object root_0 = null;

        Token ID213=null;
        Token set214=null;

        Object ID213_tree=null;
        Object set214_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "event_filter");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(320, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:321:2: ( ID ( STRING | REGEXP ) )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:321:4: ID ( STRING | REGEXP )
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(321,4);
            ID213=(Token)match(input,ID,FOLLOW_ID_in_event_filter1905); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID213_tree = (Object)adaptor.create(ID213);
            adaptor.addChild(root_0, ID213_tree);
            }
            dbg.location(321,7);
            set214=(Token)input.LT(1);
            if ( input.LA(1)==REGEXP||input.LA(1)==STRING ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set214));
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
            if ( state.backtracking>0 ) { memoize(input, 49, event_filter_StartIndex); }
        }
        dbg.location(322, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:324:1: on_expr : 'on' ( STRING | REGEXP ) ;
    public final RulesetParser.on_expr_return on_expr() throws RecognitionException {
        RulesetParser.on_expr_return retval = new RulesetParser.on_expr_return();
        retval.start = input.LT(1);
        int on_expr_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal215=null;
        Token set216=null;

        Object string_literal215_tree=null;
        Object set216_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "on_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(324, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:324:9: ( 'on' ( STRING | REGEXP ) )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:324:11: 'on' ( STRING | REGEXP )
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(324,11);
            string_literal215=(Token)match(input,79,FOLLOW_79_in_on_expr1925); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal215_tree = (Object)adaptor.create(string_literal215);
            adaptor.addChild(root_0, string_literal215_tree);
            }
            dbg.location(324,16);
            set216=(Token)input.LT(1);
            if ( input.LA(1)==REGEXP||input.LA(1)==STRING ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set216));
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
            if ( state.backtracking>0 ) { memoize(input, 50, on_expr_StartIndex); }
        }
        dbg.location(325, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:328:1: global_decls : 'global' '{' ( global ';' )+ '}' ;
    public final RulesetParser.global_decls_return global_decls() throws RecognitionException {
        RulesetParser.global_decls_return retval = new RulesetParser.global_decls_return();
        retval.start = input.LT(1);
        int global_decls_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal217=null;
        Token char_literal218=null;
        Token char_literal220=null;
        Token char_literal221=null;
        RulesetParser.global_return global219 = null;


        Object string_literal217_tree=null;
        Object char_literal218_tree=null;
        Object char_literal220_tree=null;
        Object char_literal221_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "global_decls");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(328, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:329:2: ( 'global' '{' ( global ';' )+ '}' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:329:4: 'global' '{' ( global ';' )+ '}'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(329,4);
            string_literal217=(Token)match(input,80,FOLLOW_80_in_global_decls1951); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal217_tree = (Object)adaptor.create(string_literal217);
            adaptor.addChild(root_0, string_literal217_tree);
            }
            dbg.location(329,13);
            char_literal218=(Token)match(input,20,FOLLOW_20_in_global_decls1953); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal218_tree = (Object)adaptor.create(char_literal218);
            adaptor.addChild(root_0, char_literal218_tree);
            }
            dbg.location(329,17);
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:329:17: ( global ';' )+
            int cnt36=0;
            try { dbg.enterSubRule(36);

            loop36:
            do {
                int alt36=2;
                try { dbg.enterDecision(36);

                int LA36_0 = input.LA(1);

                if ( (LA36_0==ID||LA36_0==81||LA36_0==83||(LA36_0>=136 && LA36_0<=137)) ) {
                    alt36=1;
                }


                } finally {dbg.exitDecision(36);}

                switch (alt36) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:329:19: global ';'
            	    {
            	    dbg.location(329,19);
            	    pushFollow(FOLLOW_global_in_global_decls1957);
            	    global219=global();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, global219.getTree());
            	    dbg.location(329,26);
            	    char_literal220=(Token)match(input,24,FOLLOW_24_in_global_decls1959); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal220_tree = (Object)adaptor.create(char_literal220);
            	    adaptor.addChild(root_0, char_literal220_tree);
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt36 >= 1 ) break loop36;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(36, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt36++;
            } while (true);
            } finally {dbg.exitSubRule(36);}

            dbg.location(329,33);
            char_literal221=(Token)match(input,21,FOLLOW_21_in_global_decls1964); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal221_tree = (Object)adaptor.create(char_literal221);
            adaptor.addChild(root_0, char_literal221_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 51, global_decls_StartIndex); }
        }
        dbg.location(330, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:332:1: global : ( emit_block | dataset | datasource | css_emit | decl );
    public final RulesetParser.global_return global() throws RecognitionException {
        RulesetParser.global_return retval = new RulesetParser.global_return();
        retval.start = input.LT(1);
        int global_StartIndex = input.index();
        Object root_0 = null;

        RulesetParser.emit_block_return emit_block222 = null;

        RulesetParser.dataset_return dataset223 = null;

        RulesetParser.datasource_return datasource224 = null;

        RulesetParser.css_emit_return css_emit225 = null;

        RulesetParser.decl_return decl226 = null;



        try { dbg.enterRule(getGrammarFileName(), "global");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(332, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:332:9: ( emit_block | dataset | datasource | css_emit | decl )
            int alt37=5;
            try { dbg.enterDecision(37);

            switch ( input.LA(1) ) {
            case 136:
                {
                alt37=1;
                }
                break;
            case 137:
                {
                alt37=2;
                }
                break;
            case 81:
                {
                alt37=3;
                }
                break;
            case 83:
                {
                alt37=4;
                }
                break;
            case ID:
                {
                alt37=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(37);}

            switch (alt37) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:332:11: emit_block
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(332,11);
                    pushFollow(FOLLOW_emit_block_in_global1980);
                    emit_block222=emit_block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, emit_block222.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:332:24: dataset
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(332,24);
                    pushFollow(FOLLOW_dataset_in_global1984);
                    dataset223=dataset();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dataset223.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:332:34: datasource
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(332,34);
                    pushFollow(FOLLOW_datasource_in_global1988);
                    datasource224=datasource();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, datasource224.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:332:47: css_emit
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(332,47);
                    pushFollow(FOLLOW_css_emit_in_global1992);
                    css_emit225=css_emit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, css_emit225.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:332:58: decl
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(332,58);
                    pushFollow(FOLLOW_decl_in_global1996);
                    decl226=decl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, decl226.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 52, global_StartIndex); }
        }
        dbg.location(333, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:335:1: datasource : 'datasource' ID ( datatype )? '<-' STRING cachable ;
    public final RulesetParser.datasource_return datasource() throws RecognitionException {
        RulesetParser.datasource_return retval = new RulesetParser.datasource_return();
        retval.start = input.LT(1);
        int datasource_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal227=null;
        Token ID228=null;
        Token string_literal230=null;
        Token STRING231=null;
        RulesetParser.datatype_return datatype229 = null;

        RulesetParser.cachable_return cachable232 = null;


        Object string_literal227_tree=null;
        Object ID228_tree=null;
        Object string_literal230_tree=null;
        Object STRING231_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "datasource");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(335, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:336:2: ( 'datasource' ID ( datatype )? '<-' STRING cachable )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:336:5: 'datasource' ID ( datatype )? '<-' STRING cachable
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(336,5);
            string_literal227=(Token)match(input,81,FOLLOW_81_in_datasource2008); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal227_tree = (Object)adaptor.create(string_literal227);
            adaptor.addChild(root_0, string_literal227_tree);
            }
            dbg.location(336,18);
            ID228=(Token)match(input,ID,FOLLOW_ID_in_datasource2010); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID228_tree = (Object)adaptor.create(ID228);
            adaptor.addChild(root_0, ID228_tree);
            }
            dbg.location(336,21);
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:336:21: ( datatype )?
            int alt38=2;
            try { dbg.enterSubRule(38);
            try { dbg.enterDecision(38);

            int LA38_0 = input.LA(1);

            if ( (LA38_0==38) ) {
                alt38=1;
            }
            } finally {dbg.exitDecision(38);}

            switch (alt38) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:336:21: datatype
                    {
                    dbg.location(336,21);
                    pushFollow(FOLLOW_datatype_in_datasource2012);
                    datatype229=datatype();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, datatype229.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(38);}

            dbg.location(336,31);
            string_literal230=(Token)match(input,82,FOLLOW_82_in_datasource2015); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal230_tree = (Object)adaptor.create(string_literal230);
            adaptor.addChild(root_0, string_literal230_tree);
            }
            dbg.location(336,36);
            STRING231=(Token)match(input,STRING,FOLLOW_STRING_in_datasource2017); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING231_tree = (Object)adaptor.create(STRING231);
            adaptor.addChild(root_0, STRING231_tree);
            }
            dbg.location(336,43);
            pushFollow(FOLLOW_cachable_in_datasource2019);
            cachable232=cachable();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cachable232.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 53, datasource_StartIndex); }
        }
        dbg.location(337, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:339:1: css_emit : 'css' ( HTML | STRING ) ;
    public final RulesetParser.css_emit_return css_emit() throws RecognitionException {
        RulesetParser.css_emit_return retval = new RulesetParser.css_emit_return();
        retval.start = input.LT(1);
        int css_emit_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal233=null;
        Token set234=null;

        Object string_literal233_tree=null;
        Object set234_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "css_emit");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(339, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:340:2: ( 'css' ( HTML | STRING ) )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:340:4: 'css' ( HTML | STRING )
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(340,4);
            string_literal233=(Token)match(input,83,FOLLOW_83_in_css_emit2031); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal233_tree = (Object)adaptor.create(string_literal233);
            adaptor.addChild(root_0, string_literal233_tree);
            }
            dbg.location(340,10);
            set234=(Token)input.LT(1);
            if ( input.LA(1)==STRING||input.LA(1)==HTML ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set234));
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
            if ( state.backtracking>0 ) { memoize(input, 54, css_emit_StartIndex); }
        }
        dbg.location(341, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:343:1: decl options {backtrack=true; } : ( ID '=' HTML | ID '=' JS | ID '=' expr );
    public final RulesetParser.decl_return decl() throws RecognitionException {
        RulesetParser.decl_return retval = new RulesetParser.decl_return();
        retval.start = input.LT(1);
        int decl_StartIndex = input.index();
        Object root_0 = null;

        Token ID235=null;
        Token char_literal236=null;
        Token HTML237=null;
        Token ID238=null;
        Token char_literal239=null;
        Token JS240=null;
        Token ID241=null;
        Token char_literal242=null;
        RulesetParser.expr_return expr243 = null;


        Object ID235_tree=null;
        Object char_literal236_tree=null;
        Object HTML237_tree=null;
        Object ID238_tree=null;
        Object char_literal239_tree=null;
        Object JS240_tree=null;
        Object ID241_tree=null;
        Object char_literal242_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "decl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(343, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:343:39: ( ID '=' HTML | ID '=' JS | ID '=' expr )
            int alt39=3;
            try { dbg.enterDecision(39);

            int LA39_0 = input.LA(1);

            if ( (LA39_0==ID) ) {
                int LA39_1 = input.LA(2);

                if ( (LA39_1==35) ) {
                    switch ( input.LA(3) ) {
                    case HTML:
                        {
                        alt39=1;
                        }
                        break;
                    case JS:
                        {
                        alt39=2;
                        }
                        break;
                    case ID:
                    case INT:
                    case REGEXP:
                    case STRING:
                    case 20:
                    case 57:
                    case 71:
                    case 84:
                    case 102:
                    case 104:
                    case 105:
                    case 106:
                    case 108:
                    case 109:
                    case 134:
                    case 135:
                        {
                        alt39=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 39, 2, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(39);}

            switch (alt39) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:344:2: ID '=' HTML
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(344,2);
                    ID235=(Token)match(input,ID,FOLLOW_ID_in_decl2067); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID235_tree = (Object)adaptor.create(ID235);
                    adaptor.addChild(root_0, ID235_tree);
                    }
                    dbg.location(344,5);
                    char_literal236=(Token)match(input,35,FOLLOW_35_in_decl2069); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal236_tree = (Object)adaptor.create(char_literal236);
                    adaptor.addChild(root_0, char_literal236_tree);
                    }
                    dbg.location(344,9);
                    HTML237=(Token)match(input,HTML,FOLLOW_HTML_in_decl2071); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    HTML237_tree = (Object)adaptor.create(HTML237);
                    adaptor.addChild(root_0, HTML237_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:345:2: ID '=' JS
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(345,2);
                    ID238=(Token)match(input,ID,FOLLOW_ID_in_decl2076); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID238_tree = (Object)adaptor.create(ID238);
                    adaptor.addChild(root_0, ID238_tree);
                    }
                    dbg.location(345,5);
                    char_literal239=(Token)match(input,35,FOLLOW_35_in_decl2078); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal239_tree = (Object)adaptor.create(char_literal239);
                    adaptor.addChild(root_0, char_literal239_tree);
                    }
                    dbg.location(345,9);
                    JS240=(Token)match(input,JS,FOLLOW_JS_in_decl2080); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    JS240_tree = (Object)adaptor.create(JS240);
                    adaptor.addChild(root_0, JS240_tree);
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:346:2: ID '=' expr
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(346,2);
                    ID241=(Token)match(input,ID,FOLLOW_ID_in_decl2085); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID241_tree = (Object)adaptor.create(ID241);
                    adaptor.addChild(root_0, ID241_tree);
                    }
                    dbg.location(346,5);
                    char_literal242=(Token)match(input,35,FOLLOW_35_in_decl2087); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal242_tree = (Object)adaptor.create(char_literal242);
                    adaptor.addChild(root_0, char_literal242_tree);
                    }
                    dbg.location(346,9);
                    pushFollow(FOLLOW_expr_in_decl2089);
                    expr243=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr243.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 55, decl_StartIndex); }
        }
        dbg.location(347, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:351:1: expr options {backtrack=true; } : ( function_def | conditional_expression );
    public final RulesetParser.expr_return expr() throws RecognitionException {
        RulesetParser.expr_return retval = new RulesetParser.expr_return();
        retval.start = input.LT(1);
        int expr_StartIndex = input.index();
        Object root_0 = null;

        RulesetParser.function_def_return function_def244 = null;

        RulesetParser.conditional_expression_return conditional_expression245 = null;



        try { dbg.enterRule(getGrammarFileName(), "expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(351, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:351:36: ( function_def | conditional_expression )
            int alt40=2;
            try { dbg.enterDecision(40);

            int LA40_0 = input.LA(1);

            if ( (LA40_0==84) ) {
                alt40=1;
            }
            else if ( ((LA40_0>=ID && LA40_0<=INT)||LA40_0==REGEXP||LA40_0==STRING||LA40_0==20||LA40_0==57||LA40_0==71||LA40_0==102||(LA40_0>=104 && LA40_0<=106)||(LA40_0>=108 && LA40_0<=109)||(LA40_0>=134 && LA40_0<=135)) ) {
                alt40=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(40);}

            switch (alt40) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:351:38: function_def
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(351,38);
                    pushFollow(FOLLOW_function_def_in_expr2119);
                    function_def244=function_def();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_def244.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:351:53: conditional_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(351,53);
                    pushFollow(FOLLOW_conditional_expression_in_expr2123);
                    conditional_expression245=conditional_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditional_expression245.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 56, expr_StartIndex); }
        }
        dbg.location(352, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:354:1: function_def options {backtrack=true; } : 'function' '(' ( ID ( ',' )? )* ')' '{' ( fundecls )* expr ( ';' )? '}' ;
    public final RulesetParser.function_def_return function_def() throws RecognitionException {
        RulesetParser.function_def_return retval = new RulesetParser.function_def_return();
        retval.start = input.LT(1);
        int function_def_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal246=null;
        Token char_literal247=null;
        Token ID248=null;
        Token char_literal249=null;
        Token char_literal250=null;
        Token char_literal251=null;
        Token char_literal254=null;
        Token char_literal255=null;
        RulesetParser.fundecls_return fundecls252 = null;

        RulesetParser.expr_return expr253 = null;


        Object string_literal246_tree=null;
        Object char_literal247_tree=null;
        Object ID248_tree=null;
        Object char_literal249_tree=null;
        Object char_literal250_tree=null;
        Object char_literal251_tree=null;
        Object char_literal254_tree=null;
        Object char_literal255_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "function_def");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(354, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:355:2: ( 'function' '(' ( ID ( ',' )? )* ')' '{' ( fundecls )* expr ( ';' )? '}' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:355:4: 'function' '(' ( ID ( ',' )? )* ')' '{' ( fundecls )* expr ( ';' )? '}'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(355,4);
            string_literal246=(Token)match(input,84,FOLLOW_84_in_function_def2148); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal246_tree = (Object)adaptor.create(string_literal246);
            adaptor.addChild(root_0, string_literal246_tree);
            }
            dbg.location(355,15);
            char_literal247=(Token)match(input,57,FOLLOW_57_in_function_def2150); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal247_tree = (Object)adaptor.create(char_literal247);
            adaptor.addChild(root_0, char_literal247_tree);
            }
            dbg.location(355,19);
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:355:19: ( ID ( ',' )? )*
            try { dbg.enterSubRule(42);

            loop42:
            do {
                int alt42=2;
                try { dbg.enterDecision(42);

                int LA42_0 = input.LA(1);

                if ( (LA42_0==ID) ) {
                    alt42=1;
                }


                } finally {dbg.exitDecision(42);}

                switch (alt42) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:355:20: ID ( ',' )?
            	    {
            	    dbg.location(355,20);
            	    ID248=(Token)match(input,ID,FOLLOW_ID_in_function_def2153); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    ID248_tree = (Object)adaptor.create(ID248);
            	    adaptor.addChild(root_0, ID248_tree);
            	    }
            	    dbg.location(355,23);
            	    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:355:23: ( ',' )?
            	    int alt41=2;
            	    try { dbg.enterSubRule(41);
            	    try { dbg.enterDecision(41);

            	    int LA41_0 = input.LA(1);

            	    if ( (LA41_0==58) ) {
            	        alt41=1;
            	    }
            	    } finally {dbg.exitDecision(41);}

            	    switch (alt41) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:355:23: ','
            	            {
            	            dbg.location(355,23);
            	            char_literal249=(Token)match(input,58,FOLLOW_58_in_function_def2155); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal249_tree = (Object)adaptor.create(char_literal249);
            	            adaptor.addChild(root_0, char_literal249_tree);
            	            }

            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(41);}


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);
            } finally {dbg.exitSubRule(42);}

            dbg.location(355,30);
            char_literal250=(Token)match(input,59,FOLLOW_59_in_function_def2160); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal250_tree = (Object)adaptor.create(char_literal250);
            adaptor.addChild(root_0, char_literal250_tree);
            }
            dbg.location(355,34);
            char_literal251=(Token)match(input,20,FOLLOW_20_in_function_def2162); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal251_tree = (Object)adaptor.create(char_literal251);
            adaptor.addChild(root_0, char_literal251_tree);
            }
            dbg.location(355,38);
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:355:38: ( fundecls )*
            try { dbg.enterSubRule(43);

            loop43:
            do {
                int alt43=2;
                try { dbg.enterDecision(43);

                int LA43_0 = input.LA(1);

                if ( (LA43_0==ID) ) {
                    int LA43_2 = input.LA(2);

                    if ( (LA43_2==35) ) {
                        alt43=1;
                    }


                }


                } finally {dbg.exitDecision(43);}

                switch (alt43) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:355:38: fundecls
            	    {
            	    dbg.location(355,38);
            	    pushFollow(FOLLOW_fundecls_in_function_def2164);
            	    fundecls252=fundecls();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, fundecls252.getTree());

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);
            } finally {dbg.exitSubRule(43);}

            dbg.location(355,48);
            pushFollow(FOLLOW_expr_in_function_def2167);
            expr253=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr253.getTree());
            dbg.location(355,53);
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:355:53: ( ';' )?
            int alt44=2;
            try { dbg.enterSubRule(44);
            try { dbg.enterDecision(44);

            int LA44_0 = input.LA(1);

            if ( (LA44_0==24) ) {
                alt44=1;
            }
            } finally {dbg.exitDecision(44);}

            switch (alt44) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:355:53: ';'
                    {
                    dbg.location(355,53);
                    char_literal254=(Token)match(input,24,FOLLOW_24_in_function_def2169); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal254_tree = (Object)adaptor.create(char_literal254);
                    adaptor.addChild(root_0, char_literal254_tree);
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(44);}

            dbg.location(355,58);
            char_literal255=(Token)match(input,21,FOLLOW_21_in_function_def2172); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal255_tree = (Object)adaptor.create(char_literal255);
            adaptor.addChild(root_0, char_literal255_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 57, function_def_StartIndex); }
        }
        dbg.location(356, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:358:1: fundecls options {backtrack=true; } : decl ';' ;
    public final RulesetParser.fundecls_return fundecls() throws RecognitionException {
        RulesetParser.fundecls_return retval = new RulesetParser.fundecls_return();
        retval.start = input.LT(1);
        int fundecls_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal257=null;
        RulesetParser.decl_return decl256 = null;


        Object char_literal257_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "fundecls");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(358, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:359:2: ( decl ';' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:359:4: decl ';'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(359,4);
            pushFollow(FOLLOW_decl_in_fundecls2196);
            decl256=decl();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, decl256.getTree());
            dbg.location(359,9);
            char_literal257=(Token)match(input,24,FOLLOW_24_in_fundecls2198); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal257_tree = (Object)adaptor.create(char_literal257);
            adaptor.addChild(root_0, char_literal257_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 58, fundecls_StartIndex); }
        }
        dbg.location(360, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:364:1: conditional_expression options {backtrack=true; } : ( disjunction '=>' expr '|' expr | disjunction );
    public final RulesetParser.conditional_expression_return conditional_expression() throws RecognitionException {
        RulesetParser.conditional_expression_return retval = new RulesetParser.conditional_expression_return();
        retval.start = input.LT(1);
        int conditional_expression_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal259=null;
        Token char_literal261=null;
        RulesetParser.disjunction_return disjunction258 = null;

        RulesetParser.expr_return expr260 = null;

        RulesetParser.expr_return expr262 = null;

        RulesetParser.disjunction_return disjunction263 = null;


        Object string_literal259_tree=null;
        Object char_literal261_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "conditional_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(364, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:365:2: ( disjunction '=>' expr '|' expr | disjunction )
            int alt45=2;
            try { dbg.enterDecision(45);

            try {
                isCyclicDecision = true;
                alt45 = dfa45.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(45);}

            switch (alt45) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:365:4: disjunction '=>' expr '|' expr
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(365,4);
                    pushFollow(FOLLOW_disjunction_in_conditional_expression2224);
                    disjunction258=disjunction();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, disjunction258.getTree());
                    dbg.location(365,16);
                    string_literal259=(Token)match(input,60,FOLLOW_60_in_conditional_expression2226); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal259_tree = (Object)adaptor.create(string_literal259);
                    adaptor.addChild(root_0, string_literal259_tree);
                    }
                    dbg.location(365,21);
                    pushFollow(FOLLOW_expr_in_conditional_expression2228);
                    expr260=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr260.getTree());
                    dbg.location(365,26);
                    char_literal261=(Token)match(input,85,FOLLOW_85_in_conditional_expression2230); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal261_tree = (Object)adaptor.create(char_literal261);
                    adaptor.addChild(root_0, char_literal261_tree);
                    }
                    dbg.location(365,30);
                    pushFollow(FOLLOW_expr_in_conditional_expression2232);
                    expr262=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr262.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:365:37: disjunction
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(365,37);
                    pushFollow(FOLLOW_disjunction_in_conditional_expression2236);
                    disjunction263=disjunction();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, disjunction263.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 59, conditional_expression_StartIndex); }
        }
        dbg.location(366, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:368:1: disjunction : conjunction ( '||' conjunction )* ;
    public final RulesetParser.disjunction_return disjunction() throws RecognitionException {
        RulesetParser.disjunction_return retval = new RulesetParser.disjunction_return();
        retval.start = input.LT(1);
        int disjunction_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal265=null;
        RulesetParser.conjunction_return conjunction264 = null;

        RulesetParser.conjunction_return conjunction266 = null;


        Object string_literal265_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "disjunction");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(368, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:369:2: ( conjunction ( '||' conjunction )* )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:369:4: conjunction ( '||' conjunction )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(369,4);
            pushFollow(FOLLOW_conjunction_in_disjunction2249);
            conjunction264=conjunction();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conjunction264.getTree());
            dbg.location(369,16);
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:369:16: ( '||' conjunction )*
            try { dbg.enterSubRule(46);

            loop46:
            do {
                int alt46=2;
                try { dbg.enterDecision(46);

                int LA46_0 = input.LA(1);

                if ( (LA46_0==86) ) {
                    alt46=1;
                }


                } finally {dbg.exitDecision(46);}

                switch (alt46) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:369:17: '||' conjunction
            	    {
            	    dbg.location(369,17);
            	    string_literal265=(Token)match(input,86,FOLLOW_86_in_disjunction2252); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal265_tree = (Object)adaptor.create(string_literal265);
            	    adaptor.addChild(root_0, string_literal265_tree);
            	    }
            	    dbg.location(369,22);
            	    pushFollow(FOLLOW_conjunction_in_disjunction2254);
            	    conjunction266=conjunction();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, conjunction266.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 60, disjunction_StartIndex); }
        }
        dbg.location(370, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:372:1: conjunction : equality_expr ( '&&' equality_expr )* ;
    public final RulesetParser.conjunction_return conjunction() throws RecognitionException {
        RulesetParser.conjunction_return retval = new RulesetParser.conjunction_return();
        retval.start = input.LT(1);
        int conjunction_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal268=null;
        RulesetParser.equality_expr_return equality_expr267 = null;

        RulesetParser.equality_expr_return equality_expr269 = null;


        Object string_literal268_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "conjunction");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(372, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:373:2: ( equality_expr ( '&&' equality_expr )* )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:373:4: equality_expr ( '&&' equality_expr )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(373,4);
            pushFollow(FOLLOW_equality_expr_in_conjunction2270);
            equality_expr267=equality_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equality_expr267.getTree());
            dbg.location(373,18);
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:373:18: ( '&&' equality_expr )*
            try { dbg.enterSubRule(47);

            loop47:
            do {
                int alt47=2;
                try { dbg.enterDecision(47);

                int LA47_0 = input.LA(1);

                if ( (LA47_0==87) ) {
                    alt47=1;
                }


                } finally {dbg.exitDecision(47);}

                switch (alt47) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:373:19: '&&' equality_expr
            	    {
            	    dbg.location(373,19);
            	    string_literal268=(Token)match(input,87,FOLLOW_87_in_conjunction2273); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal268_tree = (Object)adaptor.create(string_literal268);
            	    adaptor.addChild(root_0, string_literal268_tree);
            	    }
            	    dbg.location(373,24);
            	    pushFollow(FOLLOW_equality_expr_in_conjunction2275);
            	    equality_expr269=equality_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, equality_expr269.getTree());

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);
            } finally {dbg.exitSubRule(47);}


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
            if ( state.backtracking>0 ) { memoize(input, 61, conjunction_StartIndex); }
        }
        dbg.location(374, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:376:1: equality_expr : add_expr ( predop add_expr )* ;
    public final RulesetParser.equality_expr_return equality_expr() throws RecognitionException {
        RulesetParser.equality_expr_return retval = new RulesetParser.equality_expr_return();
        retval.start = input.LT(1);
        int equality_expr_StartIndex = input.index();
        Object root_0 = null;

        RulesetParser.add_expr_return add_expr270 = null;

        RulesetParser.predop_return predop271 = null;

        RulesetParser.add_expr_return add_expr272 = null;



        try { dbg.enterRule(getGrammarFileName(), "equality_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(376, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:377:2: ( add_expr ( predop add_expr )* )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:377:4: add_expr ( predop add_expr )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(377,4);
            pushFollow(FOLLOW_add_expr_in_equality_expr2290);
            add_expr270=add_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, add_expr270.getTree());
            dbg.location(377,13);
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:377:13: ( predop add_expr )*
            try { dbg.enterSubRule(48);

            loop48:
            do {
                int alt48=2;
                try { dbg.enterDecision(48);

                int LA48_0 = input.LA(1);

                if ( ((LA48_0>=88 && LA48_0<=96)) ) {
                    alt48=1;
                }


                } finally {dbg.exitDecision(48);}

                switch (alt48) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:377:14: predop add_expr
            	    {
            	    dbg.location(377,14);
            	    pushFollow(FOLLOW_predop_in_equality_expr2293);
            	    predop271=predop();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, predop271.getTree());
            	    dbg.location(377,21);
            	    pushFollow(FOLLOW_add_expr_in_equality_expr2295);
            	    add_expr272=add_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, add_expr272.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 62, equality_expr_StartIndex); }
        }
        dbg.location(378, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:380:1: predop : ( '<=' | '>=' | '<' | '>' | '==' | '!=' | 'eq' | 'neq' | 'like' );
    public final RulesetParser.predop_return predop() throws RecognitionException {
        RulesetParser.predop_return retval = new RulesetParser.predop_return();
        retval.start = input.LT(1);
        int predop_StartIndex = input.index();
        Object root_0 = null;

        Token set273=null;

        Object set273_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "predop");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(380, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:380:7: ( '<=' | '>=' | '<' | '>' | '==' | '!=' | 'eq' | 'neq' | 'like' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(380,7);
            set273=(Token)input.LT(1);
            if ( (input.LA(1)>=88 && input.LA(1)<=96) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set273));
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
            if ( state.backtracking>0 ) { memoize(input, 63, predop_StartIndex); }
        }
        dbg.location(380, 70);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:382:1: add_expr : mult_expr ( add_op mult_expr )* ;
    public final RulesetParser.add_expr_return add_expr() throws RecognitionException {
        RulesetParser.add_expr_return retval = new RulesetParser.add_expr_return();
        retval.start = input.LT(1);
        int add_expr_StartIndex = input.index();
        Object root_0 = null;

        RulesetParser.mult_expr_return mult_expr274 = null;

        RulesetParser.add_op_return add_op275 = null;

        RulesetParser.mult_expr_return mult_expr276 = null;



        try { dbg.enterRule(getGrammarFileName(), "add_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(382, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:382:10: ( mult_expr ( add_op mult_expr )* )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:382:12: mult_expr ( add_op mult_expr )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(382,12);
            pushFollow(FOLLOW_mult_expr_in_add_expr2350);
            mult_expr274=mult_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, mult_expr274.getTree());
            dbg.location(382,22);
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:382:22: ( add_op mult_expr )*
            try { dbg.enterSubRule(49);

            loop49:
            do {
                int alt49=2;
                try { dbg.enterDecision(49);

                int LA49_0 = input.LA(1);

                if ( ((LA49_0>=97 && LA49_0<=98)) ) {
                    alt49=1;
                }


                } finally {dbg.exitDecision(49);}

                switch (alt49) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:382:23: add_op mult_expr
            	    {
            	    dbg.location(382,23);
            	    pushFollow(FOLLOW_add_op_in_add_expr2353);
            	    add_op275=add_op();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, add_op275.getTree());
            	    dbg.location(382,30);
            	    pushFollow(FOLLOW_mult_expr_in_add_expr2355);
            	    mult_expr276=mult_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, mult_expr276.getTree());

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);
            } finally {dbg.exitSubRule(49);}


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
            if ( state.backtracking>0 ) { memoize(input, 64, add_expr_StartIndex); }
        }
        dbg.location(382, 41);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:384:1: add_op : ( '+' | '-' );
    public final RulesetParser.add_op_return add_op() throws RecognitionException {
        RulesetParser.add_op_return retval = new RulesetParser.add_op_return();
        retval.start = input.LT(1);
        int add_op_StartIndex = input.index();
        Object root_0 = null;

        Token set277=null;

        Object set277_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "add_op");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(384, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:384:7: ( '+' | '-' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(384,7);
            set277=(Token)input.LT(1);
            if ( (input.LA(1)>=97 && input.LA(1)<=98) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set277));
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
            if ( state.backtracking>0 ) { memoize(input, 65, add_op_StartIndex); }
        }
        dbg.location(384, 16);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:386:1: mult_expr : unary_expr ( mult_op unary_expr )* ;
    public final RulesetParser.mult_expr_return mult_expr() throws RecognitionException {
        RulesetParser.mult_expr_return retval = new RulesetParser.mult_expr_return();
        retval.start = input.LT(1);
        int mult_expr_StartIndex = input.index();
        Object root_0 = null;

        RulesetParser.unary_expr_return unary_expr278 = null;

        RulesetParser.mult_op_return mult_op279 = null;

        RulesetParser.unary_expr_return unary_expr280 = null;



        try { dbg.enterRule(getGrammarFileName(), "mult_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(386, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:387:2: ( unary_expr ( mult_op unary_expr )* )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:387:4: unary_expr ( mult_op unary_expr )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(387,4);
            pushFollow(FOLLOW_unary_expr_in_mult_expr2377);
            unary_expr278=unary_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expr278.getTree());
            dbg.location(387,15);
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:387:15: ( mult_op unary_expr )*
            try { dbg.enterSubRule(50);

            loop50:
            do {
                int alt50=2;
                try { dbg.enterDecision(50);

                int LA50_0 = input.LA(1);

                if ( ((LA50_0>=99 && LA50_0<=101)) ) {
                    alt50=1;
                }


                } finally {dbg.exitDecision(50);}

                switch (alt50) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:387:16: mult_op unary_expr
            	    {
            	    dbg.location(387,16);
            	    pushFollow(FOLLOW_mult_op_in_mult_expr2380);
            	    mult_op279=mult_op();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, mult_op279.getTree());
            	    dbg.location(387,24);
            	    pushFollow(FOLLOW_unary_expr_in_mult_expr2382);
            	    unary_expr280=unary_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expr280.getTree());

            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);
            } finally {dbg.exitSubRule(50);}


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
            if ( state.backtracking>0 ) { memoize(input, 66, mult_expr_StartIndex); }
        }
        dbg.location(388, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:390:1: mult_op : ( '*' | '/' | '%' );
    public final RulesetParser.mult_op_return mult_op() throws RecognitionException {
        RulesetParser.mult_op_return retval = new RulesetParser.mult_op_return();
        retval.start = input.LT(1);
        int mult_op_StartIndex = input.index();
        Object root_0 = null;

        Token set281=null;

        Object set281_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "mult_op");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(390, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:390:8: ( '*' | '/' | '%' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(390,8);
            set281=(Token)input.LT(1);
            if ( (input.LA(1)>=99 && input.LA(1)<=101) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set281));
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
            if ( state.backtracking>0 ) { memoize(input, 67, mult_op_StartIndex); }
        }
        dbg.location(390, 21);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:392:1: unary_expr options {backtrack=true; } : ( 'not' unary_expr | 'seen' STRING 'in' var_domain ':' ID timeframe | 'seen' STRING ( 'before' | 'after' ) STRING 'in' var_domain ':' ID | var_domain ':' ID predop expr timeframe | var_domain ':' ID timeframe | operator_expr );
    public final RulesetParser.unary_expr_return unary_expr() throws RecognitionException {
        RulesetParser.unary_expr_return retval = new RulesetParser.unary_expr_return();
        retval.start = input.LT(1);
        int unary_expr_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal282=null;
        Token string_literal284=null;
        Token STRING285=null;
        Token string_literal286=null;
        Token char_literal288=null;
        Token ID289=null;
        Token string_literal291=null;
        Token STRING292=null;
        Token set293=null;
        Token STRING294=null;
        Token string_literal295=null;
        Token char_literal297=null;
        Token ID298=null;
        Token char_literal300=null;
        Token ID301=null;
        Token char_literal306=null;
        Token ID307=null;
        RulesetParser.unary_expr_return unary_expr283 = null;

        RulesetParser.var_domain_return var_domain287 = null;

        RulesetParser.timeframe_return timeframe290 = null;

        RulesetParser.var_domain_return var_domain296 = null;

        RulesetParser.var_domain_return var_domain299 = null;

        RulesetParser.predop_return predop302 = null;

        RulesetParser.expr_return expr303 = null;

        RulesetParser.timeframe_return timeframe304 = null;

        RulesetParser.var_domain_return var_domain305 = null;

        RulesetParser.timeframe_return timeframe308 = null;

        RulesetParser.operator_expr_return operator_expr309 = null;


        Object string_literal282_tree=null;
        Object string_literal284_tree=null;
        Object STRING285_tree=null;
        Object string_literal286_tree=null;
        Object char_literal288_tree=null;
        Object ID289_tree=null;
        Object string_literal291_tree=null;
        Object STRING292_tree=null;
        Object set293_tree=null;
        Object STRING294_tree=null;
        Object string_literal295_tree=null;
        Object char_literal297_tree=null;
        Object ID298_tree=null;
        Object char_literal300_tree=null;
        Object ID301_tree=null;
        Object char_literal306_tree=null;
        Object ID307_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "unary_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(392, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:393:2: ( 'not' unary_expr | 'seen' STRING 'in' var_domain ':' ID timeframe | 'seen' STRING ( 'before' | 'after' ) STRING 'in' var_domain ':' ID | var_domain ':' ID predop expr timeframe | var_domain ':' ID timeframe | operator_expr )
            int alt51=6;
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

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:393:4: 'not' unary_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(393,4);
                    string_literal282=(Token)match(input,71,FOLLOW_71_in_unary_expr2417); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal282_tree = (Object)adaptor.create(string_literal282);
                    adaptor.addChild(root_0, string_literal282_tree);
                    }
                    dbg.location(393,10);
                    pushFollow(FOLLOW_unary_expr_in_unary_expr2419);
                    unary_expr283=unary_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expr283.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:394:2: 'seen' STRING 'in' var_domain ':' ID timeframe
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(394,2);
                    string_literal284=(Token)match(input,102,FOLLOW_102_in_unary_expr2425); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal284_tree = (Object)adaptor.create(string_literal284);
                    adaptor.addChild(root_0, string_literal284_tree);
                    }
                    dbg.location(394,9);
                    STRING285=(Token)match(input,STRING,FOLLOW_STRING_in_unary_expr2427); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING285_tree = (Object)adaptor.create(STRING285);
                    adaptor.addChild(root_0, STRING285_tree);
                    }
                    dbg.location(394,16);
                    string_literal286=(Token)match(input,41,FOLLOW_41_in_unary_expr2429); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal286_tree = (Object)adaptor.create(string_literal286);
                    adaptor.addChild(root_0, string_literal286_tree);
                    }
                    dbg.location(394,21);
                    pushFollow(FOLLOW_var_domain_in_unary_expr2431);
                    var_domain287=var_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, var_domain287.getTree());
                    dbg.location(394,32);
                    char_literal288=(Token)match(input,38,FOLLOW_38_in_unary_expr2433); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal288_tree = (Object)adaptor.create(char_literal288);
                    adaptor.addChild(root_0, char_literal288_tree);
                    }
                    dbg.location(394,36);
                    ID289=(Token)match(input,ID,FOLLOW_ID_in_unary_expr2435); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID289_tree = (Object)adaptor.create(ID289);
                    adaptor.addChild(root_0, ID289_tree);
                    }
                    dbg.location(394,39);
                    pushFollow(FOLLOW_timeframe_in_unary_expr2437);
                    timeframe290=timeframe();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeframe290.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:395:2: 'seen' STRING ( 'before' | 'after' ) STRING 'in' var_domain ':' ID
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(395,2);
                    string_literal291=(Token)match(input,102,FOLLOW_102_in_unary_expr2442); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal291_tree = (Object)adaptor.create(string_literal291);
                    adaptor.addChild(root_0, string_literal291_tree);
                    }
                    dbg.location(395,9);
                    STRING292=(Token)match(input,STRING,FOLLOW_STRING_in_unary_expr2444); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING292_tree = (Object)adaptor.create(STRING292);
                    adaptor.addChild(root_0, STRING292_tree);
                    }
                    dbg.location(395,16);
                    set293=(Token)input.LT(1);
                    if ( input.LA(1)==69||input.LA(1)==103 ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set293));
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(395,37);
                    STRING294=(Token)match(input,STRING,FOLLOW_STRING_in_unary_expr2454); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING294_tree = (Object)adaptor.create(STRING294);
                    adaptor.addChild(root_0, STRING294_tree);
                    }
                    dbg.location(395,44);
                    string_literal295=(Token)match(input,41,FOLLOW_41_in_unary_expr2456); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal295_tree = (Object)adaptor.create(string_literal295);
                    adaptor.addChild(root_0, string_literal295_tree);
                    }
                    dbg.location(395,49);
                    pushFollow(FOLLOW_var_domain_in_unary_expr2458);
                    var_domain296=var_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, var_domain296.getTree());
                    dbg.location(395,60);
                    char_literal297=(Token)match(input,38,FOLLOW_38_in_unary_expr2460); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal297_tree = (Object)adaptor.create(char_literal297);
                    adaptor.addChild(root_0, char_literal297_tree);
                    }
                    dbg.location(395,64);
                    ID298=(Token)match(input,ID,FOLLOW_ID_in_unary_expr2462); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID298_tree = (Object)adaptor.create(ID298);
                    adaptor.addChild(root_0, ID298_tree);
                    }

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:396:2: var_domain ':' ID predop expr timeframe
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(396,2);
                    pushFollow(FOLLOW_var_domain_in_unary_expr2467);
                    var_domain299=var_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, var_domain299.getTree());
                    dbg.location(396,13);
                    char_literal300=(Token)match(input,38,FOLLOW_38_in_unary_expr2469); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal300_tree = (Object)adaptor.create(char_literal300);
                    adaptor.addChild(root_0, char_literal300_tree);
                    }
                    dbg.location(396,17);
                    ID301=(Token)match(input,ID,FOLLOW_ID_in_unary_expr2471); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID301_tree = (Object)adaptor.create(ID301);
                    adaptor.addChild(root_0, ID301_tree);
                    }
                    dbg.location(396,20);
                    pushFollow(FOLLOW_predop_in_unary_expr2473);
                    predop302=predop();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, predop302.getTree());
                    dbg.location(396,27);
                    pushFollow(FOLLOW_expr_in_unary_expr2475);
                    expr303=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr303.getTree());
                    dbg.location(396,32);
                    pushFollow(FOLLOW_timeframe_in_unary_expr2477);
                    timeframe304=timeframe();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeframe304.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:397:2: var_domain ':' ID timeframe
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(397,2);
                    pushFollow(FOLLOW_var_domain_in_unary_expr2482);
                    var_domain305=var_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, var_domain305.getTree());
                    dbg.location(397,13);
                    char_literal306=(Token)match(input,38,FOLLOW_38_in_unary_expr2484); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal306_tree = (Object)adaptor.create(char_literal306);
                    adaptor.addChild(root_0, char_literal306_tree);
                    }
                    dbg.location(397,17);
                    ID307=(Token)match(input,ID,FOLLOW_ID_in_unary_expr2486); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID307_tree = (Object)adaptor.create(ID307);
                    adaptor.addChild(root_0, ID307_tree);
                    }
                    dbg.location(397,20);
                    pushFollow(FOLLOW_timeframe_in_unary_expr2488);
                    timeframe308=timeframe();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeframe308.getTree());

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:398:2: operator_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(398,2);
                    pushFollow(FOLLOW_operator_expr_in_unary_expr2493);
                    operator_expr309=operator_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, operator_expr309.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 68, unary_expr_StartIndex); }
        }
        dbg.location(399, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:402:1: operator_expr : factor ( operator )* ;
    public final RulesetParser.operator_expr_return operator_expr() throws RecognitionException {
        RulesetParser.operator_expr_return retval = new RulesetParser.operator_expr_return();
        retval.start = input.LT(1);
        int operator_expr_StartIndex = input.index();
        Object root_0 = null;

        RulesetParser.factor_return factor310 = null;

        RulesetParser.operator_return operator311 = null;



        try { dbg.enterRule(getGrammarFileName(), "operator_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(402, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:403:2: ( factor ( operator )* )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:403:4: factor ( operator )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(403,4);
            pushFollow(FOLLOW_factor_in_operator_expr2507);
            factor310=factor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, factor310.getTree());
            dbg.location(403,11);
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:403:11: ( operator )*
            try { dbg.enterSubRule(52);

            loop52:
            do {
                int alt52=2;
                try { dbg.enterDecision(52);

                int LA52_0 = input.LA(1);

                if ( (LA52_0==110) ) {
                    alt52=1;
                }


                } finally {dbg.exitDecision(52);}

                switch (alt52) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:403:11: operator
            	    {
            	    dbg.location(403,11);
            	    pushFollow(FOLLOW_operator_in_operator_expr2509);
            	    operator311=operator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, operator311.getTree());

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);
            } finally {dbg.exitSubRule(52);}


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
            if ( state.backtracking>0 ) { memoize(input, 69, operator_expr_StartIndex); }
        }
        dbg.location(404, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:406:1: factor options {backtrack=true; } : ( INT | STRING | REGEXP | 'true' | 'false' | ID '[' expr ']' | persistent_var | trail_exp | function_app | '[' expr ',' ']' | '{' ( hash_line ( ',' )? )* '}' | ID | '(' expr ')' );
    public final RulesetParser.factor_return factor() throws RecognitionException {
        RulesetParser.factor_return retval = new RulesetParser.factor_return();
        retval.start = input.LT(1);
        int factor_StartIndex = input.index();
        Object root_0 = null;

        Token INT312=null;
        Token STRING313=null;
        Token REGEXP314=null;
        Token string_literal315=null;
        Token string_literal316=null;
        Token ID317=null;
        Token char_literal318=null;
        Token char_literal320=null;
        Token char_literal324=null;
        Token char_literal326=null;
        Token char_literal327=null;
        Token char_literal328=null;
        Token char_literal330=null;
        Token char_literal331=null;
        Token ID332=null;
        Token char_literal333=null;
        Token char_literal335=null;
        RulesetParser.expr_return expr319 = null;

        RulesetParser.persistent_var_return persistent_var321 = null;

        RulesetParser.trail_exp_return trail_exp322 = null;

        RulesetParser.function_app_return function_app323 = null;

        RulesetParser.expr_return expr325 = null;

        RulesetParser.hash_line_return hash_line329 = null;

        RulesetParser.expr_return expr334 = null;


        Object INT312_tree=null;
        Object STRING313_tree=null;
        Object REGEXP314_tree=null;
        Object string_literal315_tree=null;
        Object string_literal316_tree=null;
        Object ID317_tree=null;
        Object char_literal318_tree=null;
        Object char_literal320_tree=null;
        Object char_literal324_tree=null;
        Object char_literal326_tree=null;
        Object char_literal327_tree=null;
        Object char_literal328_tree=null;
        Object char_literal330_tree=null;
        Object char_literal331_tree=null;
        Object ID332_tree=null;
        Object char_literal333_tree=null;
        Object char_literal335_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "factor");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(406, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:407:2: ( INT | STRING | REGEXP | 'true' | 'false' | ID '[' expr ']' | persistent_var | trail_exp | function_app | '[' expr ',' ']' | '{' ( hash_line ( ',' )? )* '}' | ID | '(' expr ')' )
            int alt55=13;
            try { dbg.enterDecision(55);

            try {
                isCyclicDecision = true;
                alt55 = dfa55.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(55);}

            switch (alt55) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:407:4: INT
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(407,4);
                    INT312=(Token)match(input,INT,FOLLOW_INT_in_factor2534); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT312_tree = (Object)adaptor.create(INT312);
                    adaptor.addChild(root_0, INT312_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:408:9: STRING
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(408,9);
                    STRING313=(Token)match(input,STRING,FOLLOW_STRING_in_factor2544); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING313_tree = (Object)adaptor.create(STRING313);
                    adaptor.addChild(root_0, STRING313_tree);
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:409:9: REGEXP
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(409,9);
                    REGEXP314=(Token)match(input,REGEXP,FOLLOW_REGEXP_in_factor2554); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXP314_tree = (Object)adaptor.create(REGEXP314);
                    adaptor.addChild(root_0, REGEXP314_tree);
                    }

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:410:9: 'true'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(410,9);
                    string_literal315=(Token)match(input,104,FOLLOW_104_in_factor2564); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal315_tree = (Object)adaptor.create(string_literal315);
                    adaptor.addChild(root_0, string_literal315_tree);
                    }

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:411:9: 'false'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(411,9);
                    string_literal316=(Token)match(input,105,FOLLOW_105_in_factor2574); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal316_tree = (Object)adaptor.create(string_literal316);
                    adaptor.addChild(root_0, string_literal316_tree);
                    }

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:412:9: ID '[' expr ']'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(412,9);
                    ID317=(Token)match(input,ID,FOLLOW_ID_in_factor2584); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID317_tree = (Object)adaptor.create(ID317);
                    adaptor.addChild(root_0, ID317_tree);
                    }
                    dbg.location(412,12);
                    char_literal318=(Token)match(input,106,FOLLOW_106_in_factor2586); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal318_tree = (Object)adaptor.create(char_literal318);
                    adaptor.addChild(root_0, char_literal318_tree);
                    }
                    dbg.location(412,16);
                    pushFollow(FOLLOW_expr_in_factor2588);
                    expr319=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr319.getTree());
                    dbg.location(412,21);
                    char_literal320=(Token)match(input,107,FOLLOW_107_in_factor2590); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal320_tree = (Object)adaptor.create(char_literal320);
                    adaptor.addChild(root_0, char_literal320_tree);
                    }

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:413:9: persistent_var
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(413,9);
                    pushFollow(FOLLOW_persistent_var_in_factor2600);
                    persistent_var321=persistent_var();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, persistent_var321.getTree());

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:414:9: trail_exp
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(414,9);
                    pushFollow(FOLLOW_trail_exp_in_factor2610);
                    trail_exp322=trail_exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, trail_exp322.getTree());

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:415:9: function_app
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(415,9);
                    pushFollow(FOLLOW_function_app_in_factor2620);
                    function_app323=function_app();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_app323.getTree());

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:416:9: '[' expr ',' ']'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(416,9);
                    char_literal324=(Token)match(input,106,FOLLOW_106_in_factor2630); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal324_tree = (Object)adaptor.create(char_literal324);
                    adaptor.addChild(root_0, char_literal324_tree);
                    }
                    dbg.location(416,13);
                    pushFollow(FOLLOW_expr_in_factor2632);
                    expr325=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr325.getTree());
                    dbg.location(416,18);
                    char_literal326=(Token)match(input,58,FOLLOW_58_in_factor2634); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal326_tree = (Object)adaptor.create(char_literal326);
                    adaptor.addChild(root_0, char_literal326_tree);
                    }
                    dbg.location(416,22);
                    char_literal327=(Token)match(input,107,FOLLOW_107_in_factor2636); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal327_tree = (Object)adaptor.create(char_literal327);
                    adaptor.addChild(root_0, char_literal327_tree);
                    }

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:417:9: '{' ( hash_line ( ',' )? )* '}'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(417,9);
                    char_literal328=(Token)match(input,20,FOLLOW_20_in_factor2646); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal328_tree = (Object)adaptor.create(char_literal328);
                    adaptor.addChild(root_0, char_literal328_tree);
                    }
                    dbg.location(417,13);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:417:13: ( hash_line ( ',' )? )*
                    try { dbg.enterSubRule(54);

                    loop54:
                    do {
                        int alt54=2;
                        try { dbg.enterDecision(54);

                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==STRING) ) {
                            alt54=1;
                        }


                        } finally {dbg.exitDecision(54);}

                        switch (alt54) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:417:14: hash_line ( ',' )?
                    	    {
                    	    dbg.location(417,14);
                    	    pushFollow(FOLLOW_hash_line_in_factor2649);
                    	    hash_line329=hash_line();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, hash_line329.getTree());
                    	    dbg.location(417,24);
                    	    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:417:24: ( ',' )?
                    	    int alt53=2;
                    	    try { dbg.enterSubRule(53);
                    	    try { dbg.enterDecision(53);

                    	    int LA53_0 = input.LA(1);

                    	    if ( (LA53_0==58) ) {
                    	        alt53=1;
                    	    }
                    	    } finally {dbg.exitDecision(53);}

                    	    switch (alt53) {
                    	        case 1 :
                    	            dbg.enterAlt(1);

                    	            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:417:24: ','
                    	            {
                    	            dbg.location(417,24);
                    	            char_literal330=(Token)match(input,58,FOLLOW_58_in_factor2651); if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) {
                    	            char_literal330_tree = (Object)adaptor.create(char_literal330);
                    	            adaptor.addChild(root_0, char_literal330_tree);
                    	            }

                    	            }
                    	            break;

                    	    }
                    	    } finally {dbg.exitSubRule(53);}


                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(54);}

                    dbg.location(417,31);
                    char_literal331=(Token)match(input,21,FOLLOW_21_in_factor2656); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal331_tree = (Object)adaptor.create(char_literal331);
                    adaptor.addChild(root_0, char_literal331_tree);
                    }

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:418:9: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(418,9);
                    ID332=(Token)match(input,ID,FOLLOW_ID_in_factor2666); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID332_tree = (Object)adaptor.create(ID332);
                    adaptor.addChild(root_0, ID332_tree);
                    }

                    }
                    break;
                case 13 :
                    dbg.enterAlt(13);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:419:9: '(' expr ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(419,9);
                    char_literal333=(Token)match(input,57,FOLLOW_57_in_factor2677); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal333_tree = (Object)adaptor.create(char_literal333);
                    adaptor.addChild(root_0, char_literal333_tree);
                    }
                    dbg.location(419,13);
                    pushFollow(FOLLOW_expr_in_factor2679);
                    expr334=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr334.getTree());
                    dbg.location(419,18);
                    char_literal335=(Token)match(input,59,FOLLOW_59_in_factor2681); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal335_tree = (Object)adaptor.create(char_literal335);
                    adaptor.addChild(root_0, char_literal335_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 70, factor_StartIndex); }
        }
        dbg.location(420, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:422:1: hash_line : STRING ':' expr ;
    public final RulesetParser.hash_line_return hash_line() throws RecognitionException {
        RulesetParser.hash_line_return retval = new RulesetParser.hash_line_return();
        retval.start = input.LT(1);
        int hash_line_StartIndex = input.index();
        Object root_0 = null;

        Token STRING336=null;
        Token char_literal337=null;
        RulesetParser.expr_return expr338 = null;


        Object STRING336_tree=null;
        Object char_literal337_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "hash_line");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(422, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:423:2: ( STRING ':' expr )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:423:4: STRING ':' expr
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(423,4);
            STRING336=(Token)match(input,STRING,FOLLOW_STRING_in_hash_line2694); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING336_tree = (Object)adaptor.create(STRING336);
            adaptor.addChild(root_0, STRING336_tree);
            }
            dbg.location(423,11);
            char_literal337=(Token)match(input,38,FOLLOW_38_in_hash_line2696); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal337_tree = (Object)adaptor.create(char_literal337);
            adaptor.addChild(root_0, char_literal337_tree);
            }
            dbg.location(423,15);
            pushFollow(FOLLOW_expr_in_hash_line2698);
            expr338=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr338.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 71, hash_line_StartIndex); }
        }
        dbg.location(424, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:426:1: function_app : ( namespace ID '(' ( expr ( ',' )? )* ')' | ID '(' ( expr ( ',' )? )* ')' );
    public final RulesetParser.function_app_return function_app() throws RecognitionException {
        RulesetParser.function_app_return retval = new RulesetParser.function_app_return();
        retval.start = input.LT(1);
        int function_app_StartIndex = input.index();
        Object root_0 = null;

        Token ID340=null;
        Token char_literal341=null;
        Token char_literal343=null;
        Token char_literal344=null;
        Token ID345=null;
        Token char_literal346=null;
        Token char_literal348=null;
        Token char_literal349=null;
        RulesetParser.namespace_return namespace339 = null;

        RulesetParser.expr_return expr342 = null;

        RulesetParser.expr_return expr347 = null;


        Object ID340_tree=null;
        Object char_literal341_tree=null;
        Object char_literal343_tree=null;
        Object char_literal344_tree=null;
        Object ID345_tree=null;
        Object char_literal346_tree=null;
        Object char_literal348_tree=null;
        Object char_literal349_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "function_app");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(426, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:427:2: ( namespace ID '(' ( expr ( ',' )? )* ')' | ID '(' ( expr ( ',' )? )* ')' )
            int alt60=2;
            try { dbg.enterDecision(60);

            int LA60_0 = input.LA(1);

            if ( (LA60_0==ID) ) {
                int LA60_1 = input.LA(2);

                if ( (LA60_1==38) ) {
                    alt60=1;
                }
                else if ( (LA60_1==57) ) {
                    alt60=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 60, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(60);}

            switch (alt60) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:427:3: namespace ID '(' ( expr ( ',' )? )* ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(427,3);
                    pushFollow(FOLLOW_namespace_in_function_app2711);
                    namespace339=namespace();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, namespace339.getTree());
                    dbg.location(427,13);
                    ID340=(Token)match(input,ID,FOLLOW_ID_in_function_app2713); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID340_tree = (Object)adaptor.create(ID340);
                    adaptor.addChild(root_0, ID340_tree);
                    }
                    dbg.location(427,16);
                    char_literal341=(Token)match(input,57,FOLLOW_57_in_function_app2715); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal341_tree = (Object)adaptor.create(char_literal341);
                    adaptor.addChild(root_0, char_literal341_tree);
                    }
                    dbg.location(427,20);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:427:20: ( expr ( ',' )? )*
                    try { dbg.enterSubRule(57);

                    loop57:
                    do {
                        int alt57=2;
                        try { dbg.enterDecision(57);

                        int LA57_0 = input.LA(1);

                        if ( ((LA57_0>=ID && LA57_0<=INT)||LA57_0==REGEXP||LA57_0==STRING||LA57_0==20||LA57_0==57||LA57_0==71||LA57_0==84||LA57_0==102||(LA57_0>=104 && LA57_0<=106)||(LA57_0>=108 && LA57_0<=109)||(LA57_0>=134 && LA57_0<=135)) ) {
                            alt57=1;
                        }


                        } finally {dbg.exitDecision(57);}

                        switch (alt57) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:427:21: expr ( ',' )?
                    	    {
                    	    dbg.location(427,21);
                    	    pushFollow(FOLLOW_expr_in_function_app2718);
                    	    expr342=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr342.getTree());
                    	    dbg.location(427,26);
                    	    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:427:26: ( ',' )?
                    	    int alt56=2;
                    	    try { dbg.enterSubRule(56);
                    	    try { dbg.enterDecision(56);

                    	    int LA56_0 = input.LA(1);

                    	    if ( (LA56_0==58) ) {
                    	        alt56=1;
                    	    }
                    	    } finally {dbg.exitDecision(56);}

                    	    switch (alt56) {
                    	        case 1 :
                    	            dbg.enterAlt(1);

                    	            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:427:26: ','
                    	            {
                    	            dbg.location(427,26);
                    	            char_literal343=(Token)match(input,58,FOLLOW_58_in_function_app2720); if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) {
                    	            char_literal343_tree = (Object)adaptor.create(char_literal343);
                    	            adaptor.addChild(root_0, char_literal343_tree);
                    	            }

                    	            }
                    	            break;

                    	    }
                    	    } finally {dbg.exitSubRule(56);}


                    	    }
                    	    break;

                    	default :
                    	    break loop57;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(57);}

                    dbg.location(427,33);
                    char_literal344=(Token)match(input,59,FOLLOW_59_in_function_app2725); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal344_tree = (Object)adaptor.create(char_literal344);
                    adaptor.addChild(root_0, char_literal344_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:428:3: ID '(' ( expr ( ',' )? )* ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(428,3);
                    ID345=(Token)match(input,ID,FOLLOW_ID_in_function_app2731); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID345_tree = (Object)adaptor.create(ID345);
                    adaptor.addChild(root_0, ID345_tree);
                    }
                    dbg.location(428,6);
                    char_literal346=(Token)match(input,57,FOLLOW_57_in_function_app2733); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal346_tree = (Object)adaptor.create(char_literal346);
                    adaptor.addChild(root_0, char_literal346_tree);
                    }
                    dbg.location(428,10);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:428:10: ( expr ( ',' )? )*
                    try { dbg.enterSubRule(59);

                    loop59:
                    do {
                        int alt59=2;
                        try { dbg.enterDecision(59);

                        int LA59_0 = input.LA(1);

                        if ( ((LA59_0>=ID && LA59_0<=INT)||LA59_0==REGEXP||LA59_0==STRING||LA59_0==20||LA59_0==57||LA59_0==71||LA59_0==84||LA59_0==102||(LA59_0>=104 && LA59_0<=106)||(LA59_0>=108 && LA59_0<=109)||(LA59_0>=134 && LA59_0<=135)) ) {
                            alt59=1;
                        }


                        } finally {dbg.exitDecision(59);}

                        switch (alt59) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:428:11: expr ( ',' )?
                    	    {
                    	    dbg.location(428,11);
                    	    pushFollow(FOLLOW_expr_in_function_app2736);
                    	    expr347=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr347.getTree());
                    	    dbg.location(428,16);
                    	    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:428:16: ( ',' )?
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

                    	            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:428:16: ','
                    	            {
                    	            dbg.location(428,16);
                    	            char_literal348=(Token)match(input,58,FOLLOW_58_in_function_app2738); if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) {
                    	            char_literal348_tree = (Object)adaptor.create(char_literal348);
                    	            adaptor.addChild(root_0, char_literal348_tree);
                    	            }

                    	            }
                    	            break;

                    	    }
                    	    } finally {dbg.exitSubRule(58);}


                    	    }
                    	    break;

                    	default :
                    	    break loop59;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(59);}

                    dbg.location(428,23);
                    char_literal349=(Token)match(input,59,FOLLOW_59_in_function_app2743); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal349_tree = (Object)adaptor.create(char_literal349);
                    adaptor.addChild(root_0, char_literal349_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 72, function_app_StartIndex); }
        }
        dbg.location(429, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:431:1: namespace : ID ':' ;
    public final RulesetParser.namespace_return namespace() throws RecognitionException {
        RulesetParser.namespace_return retval = new RulesetParser.namespace_return();
        retval.start = input.LT(1);
        int namespace_StartIndex = input.index();
        Object root_0 = null;

        Token ID350=null;
        Token char_literal351=null;

        Object ID350_tree=null;
        Object char_literal351_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "namespace");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(431, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:432:2: ( ID ':' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:432:4: ID ':'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(432,4);
            ID350=(Token)match(input,ID,FOLLOW_ID_in_namespace2755); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID350_tree = (Object)adaptor.create(ID350);
            adaptor.addChild(root_0, ID350_tree);
            }
            dbg.location(432,7);
            char_literal351=(Token)match(input,38,FOLLOW_38_in_namespace2757); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal351_tree = (Object)adaptor.create(char_literal351);
            adaptor.addChild(root_0, char_literal351_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 73, namespace_StartIndex); }
        }
        dbg.location(433, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:435:1: trail_exp : ( 'current' var_domain ':' ID | 'history' expr var_domain ':' ID );
    public final RulesetParser.trail_exp_return trail_exp() throws RecognitionException {
        RulesetParser.trail_exp_return retval = new RulesetParser.trail_exp_return();
        retval.start = input.LT(1);
        int trail_exp_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal352=null;
        Token char_literal354=null;
        Token ID355=null;
        Token string_literal356=null;
        Token char_literal359=null;
        Token ID360=null;
        RulesetParser.var_domain_return var_domain353 = null;

        RulesetParser.expr_return expr357 = null;

        RulesetParser.var_domain_return var_domain358 = null;


        Object string_literal352_tree=null;
        Object char_literal354_tree=null;
        Object ID355_tree=null;
        Object string_literal356_tree=null;
        Object char_literal359_tree=null;
        Object ID360_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "trail_exp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(435, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:436:2: ( 'current' var_domain ':' ID | 'history' expr var_domain ':' ID )
            int alt61=2;
            try { dbg.enterDecision(61);

            int LA61_0 = input.LA(1);

            if ( (LA61_0==108) ) {
                alt61=1;
            }
            else if ( (LA61_0==109) ) {
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

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:436:3: 'current' var_domain ':' ID
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(436,3);
                    string_literal352=(Token)match(input,108,FOLLOW_108_in_trail_exp2769); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal352_tree = (Object)adaptor.create(string_literal352);
                    adaptor.addChild(root_0, string_literal352_tree);
                    }
                    dbg.location(436,13);
                    pushFollow(FOLLOW_var_domain_in_trail_exp2771);
                    var_domain353=var_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, var_domain353.getTree());
                    dbg.location(436,24);
                    char_literal354=(Token)match(input,38,FOLLOW_38_in_trail_exp2773); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal354_tree = (Object)adaptor.create(char_literal354);
                    adaptor.addChild(root_0, char_literal354_tree);
                    }
                    dbg.location(436,28);
                    ID355=(Token)match(input,ID,FOLLOW_ID_in_trail_exp2775); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID355_tree = (Object)adaptor.create(ID355);
                    adaptor.addChild(root_0, ID355_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:437:2: 'history' expr var_domain ':' ID
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(437,2);
                    string_literal356=(Token)match(input,109,FOLLOW_109_in_trail_exp2780); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal356_tree = (Object)adaptor.create(string_literal356);
                    adaptor.addChild(root_0, string_literal356_tree);
                    }
                    dbg.location(437,12);
                    pushFollow(FOLLOW_expr_in_trail_exp2782);
                    expr357=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr357.getTree());
                    dbg.location(437,17);
                    pushFollow(FOLLOW_var_domain_in_trail_exp2784);
                    var_domain358=var_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, var_domain358.getTree());
                    dbg.location(437,28);
                    char_literal359=(Token)match(input,38,FOLLOW_38_in_trail_exp2786); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal359_tree = (Object)adaptor.create(char_literal359);
                    adaptor.addChild(root_0, char_literal359_tree);
                    }
                    dbg.location(437,32);
                    ID360=(Token)match(input,ID,FOLLOW_ID_in_trail_exp2788); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID360_tree = (Object)adaptor.create(ID360);
                    adaptor.addChild(root_0, ID360_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 74, trail_exp_StartIndex); }
        }
        dbg.location(438, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:440:1: persistent_var : var_domain ':' ID ;
    public final RulesetParser.persistent_var_return persistent_var() throws RecognitionException {
        RulesetParser.persistent_var_return retval = new RulesetParser.persistent_var_return();
        retval.start = input.LT(1);
        int persistent_var_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal362=null;
        Token ID363=null;
        RulesetParser.var_domain_return var_domain361 = null;


        Object char_literal362_tree=null;
        Object ID363_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "persistent_var");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(440, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:441:2: ( var_domain ':' ID )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:441:4: var_domain ':' ID
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(441,4);
            pushFollow(FOLLOW_var_domain_in_persistent_var2802);
            var_domain361=var_domain();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, var_domain361.getTree());
            dbg.location(441,15);
            char_literal362=(Token)match(input,38,FOLLOW_38_in_persistent_var2804); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal362_tree = (Object)adaptor.create(char_literal362);
            adaptor.addChild(root_0, char_literal362_tree);
            }
            dbg.location(441,19);
            ID363=(Token)match(input,ID,FOLLOW_ID_in_persistent_var2806); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID363_tree = (Object)adaptor.create(ID363);
            adaptor.addChild(root_0, ID363_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 75, persistent_var_StartIndex); }
        }
        dbg.location(442, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:443:1: operator : '.' operator_op '(' expr ( ',' )? ')' ;
    public final RulesetParser.operator_return operator() throws RecognitionException {
        RulesetParser.operator_return retval = new RulesetParser.operator_return();
        retval.start = input.LT(1);
        int operator_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal364=null;
        Token char_literal366=null;
        Token char_literal368=null;
        Token char_literal369=null;
        RulesetParser.operator_op_return operator_op365 = null;

        RulesetParser.expr_return expr367 = null;


        Object char_literal364_tree=null;
        Object char_literal366_tree=null;
        Object char_literal368_tree=null;
        Object char_literal369_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "operator");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(443, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:444:2: ( '.' operator_op '(' expr ( ',' )? ')' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:444:4: '.' operator_op '(' expr ( ',' )? ')'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(444,4);
            char_literal364=(Token)match(input,110,FOLLOW_110_in_operator2818); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal364_tree = (Object)adaptor.create(char_literal364);
            adaptor.addChild(root_0, char_literal364_tree);
            }
            dbg.location(444,8);
            pushFollow(FOLLOW_operator_op_in_operator2820);
            operator_op365=operator_op();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, operator_op365.getTree());
            dbg.location(444,20);
            char_literal366=(Token)match(input,57,FOLLOW_57_in_operator2822); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal366_tree = (Object)adaptor.create(char_literal366);
            adaptor.addChild(root_0, char_literal366_tree);
            }
            dbg.location(444,24);
            pushFollow(FOLLOW_expr_in_operator2824);
            expr367=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr367.getTree());
            dbg.location(444,29);
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:444:29: ( ',' )?
            int alt62=2;
            try { dbg.enterSubRule(62);
            try { dbg.enterDecision(62);

            int LA62_0 = input.LA(1);

            if ( (LA62_0==58) ) {
                alt62=1;
            }
            } finally {dbg.exitDecision(62);}

            switch (alt62) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:444:29: ','
                    {
                    dbg.location(444,29);
                    char_literal368=(Token)match(input,58,FOLLOW_58_in_operator2826); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal368_tree = (Object)adaptor.create(char_literal368);
                    adaptor.addChild(root_0, char_literal368_tree);
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(62);}

            dbg.location(444,34);
            char_literal369=(Token)match(input,59,FOLLOW_59_in_operator2829); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal369_tree = (Object)adaptor.create(char_literal369);
            adaptor.addChild(root_0, char_literal369_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 76, operator_StartIndex); }
        }
        dbg.location(445, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:447:1: operator_op : ( 'pick' | 'match' | 'length' | 'replace' | 'as' | 'head' | 'tail' | 'sort' | 'filter' | 'map' | 'uc' | 'lc' | 'split' | 'join' | 'query' | 'has' | 'union' | 'difference' | 'intersection' | 'unique' | 'once' | 'duplicates' );
    public final RulesetParser.operator_op_return operator_op() throws RecognitionException {
        RulesetParser.operator_op_return retval = new RulesetParser.operator_op_return();
        retval.start = input.LT(1);
        int operator_op_StartIndex = input.index();
        Object root_0 = null;

        Token set370=null;

        Object set370_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "operator_op");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(447, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:448:2: ( 'pick' | 'match' | 'length' | 'replace' | 'as' | 'head' | 'tail' | 'sort' | 'filter' | 'map' | 'uc' | 'lc' | 'split' | 'join' | 'query' | 'has' | 'union' | 'difference' | 'intersection' | 'unique' | 'once' | 'duplicates' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(448,2);
            set370=(Token)input.LT(1);
            if ( (input.LA(1)>=111 && input.LA(1)<=132) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set370));
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
            if ( state.backtracking>0 ) { memoize(input, 77, operator_op_StartIndex); }
        }
        dbg.location(452, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:453:1: timeframe : 'within' expr ( periods | period ) ;
    public final RulesetParser.timeframe_return timeframe() throws RecognitionException {
        RulesetParser.timeframe_return retval = new RulesetParser.timeframe_return();
        retval.start = input.LT(1);
        int timeframe_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal371=null;
        RulesetParser.expr_return expr372 = null;

        RulesetParser.periods_return periods373 = null;

        RulesetParser.period_return period374 = null;


        Object string_literal371_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "timeframe");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(453, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:454:2: ( 'within' expr ( periods | period ) )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:454:5: 'within' expr ( periods | period )
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(454,5);
            string_literal371=(Token)match(input,133,FOLLOW_133_in_timeframe2939); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal371_tree = (Object)adaptor.create(string_literal371);
            adaptor.addChild(root_0, string_literal371_tree);
            }
            dbg.location(454,14);
            pushFollow(FOLLOW_expr_in_timeframe2941);
            expr372=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr372.getTree());
            dbg.location(454,19);
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:454:19: ( periods | period )
            int alt63=2;
            try { dbg.enterSubRule(63);
            try { dbg.enterDecision(63);

            int LA63_0 = input.LA(1);

            if ( ((LA63_0>=143 && LA63_0<=149)) ) {
                alt63=1;
            }
            else if ( ((LA63_0>=150 && LA63_0<=156)) ) {
                alt63=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(63);}

            switch (alt63) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:454:20: periods
                    {
                    dbg.location(454,20);
                    pushFollow(FOLLOW_periods_in_timeframe2944);
                    periods373=periods();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, periods373.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:454:30: period
                    {
                    dbg.location(454,30);
                    pushFollow(FOLLOW_period_in_timeframe2948);
                    period374=period();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, period374.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(63);}


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
            if ( state.backtracking>0 ) { memoize(input, 78, timeframe_StartIndex); }
        }
        dbg.location(455, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:457:1: var_domain : ( 'ent' | 'app' );
    public final RulesetParser.var_domain_return var_domain() throws RecognitionException {
        RulesetParser.var_domain_return retval = new RulesetParser.var_domain_return();
        retval.start = input.LT(1);
        int var_domain_StartIndex = input.index();
        Object root_0 = null;

        Token set375=null;

        Object set375_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "var_domain");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(457, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:457:11: ( 'ent' | 'app' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(457,11);
            set375=(Token)input.LT(1);
            if ( (input.LA(1)>=134 && input.LA(1)<=135) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set375));
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
            if ( state.backtracking>0 ) { memoize(input, 79, var_domain_StartIndex); }
        }
        dbg.location(457, 26);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:459:1: emit_block : 'emit' ( HTML | STRING | JS ) ;
    public final RulesetParser.emit_block_return emit_block() throws RecognitionException {
        RulesetParser.emit_block_return retval = new RulesetParser.emit_block_return();
        retval.start = input.LT(1);
        int emit_block_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal376=null;
        Token set377=null;

        Object string_literal376_tree=null;
        Object set377_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "emit_block");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(459, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:460:2: ( 'emit' ( HTML | STRING | JS ) )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:460:4: 'emit' ( HTML | STRING | JS )
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(460,4);
            string_literal376=(Token)match(input,136,FOLLOW_136_in_emit_block2975); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal376_tree = (Object)adaptor.create(string_literal376);
            adaptor.addChild(root_0, string_literal376_tree);
            }
            dbg.location(460,11);
            set377=(Token)input.LT(1);
            if ( input.LA(1)==STRING||(input.LA(1)>=HTML && input.LA(1)<=JS) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set377));
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
            if ( state.backtracking>0 ) { memoize(input, 80, emit_block_StartIndex); }
        }
        dbg.location(461, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:463:1: dataset : 'dataset' ID ( datatype )? '<-' STRING cachable ;
    public final RulesetParser.dataset_return dataset() throws RecognitionException {
        RulesetParser.dataset_return retval = new RulesetParser.dataset_return();
        retval.start = input.LT(1);
        int dataset_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal378=null;
        Token ID379=null;
        Token string_literal381=null;
        Token STRING382=null;
        RulesetParser.datatype_return datatype380 = null;

        RulesetParser.cachable_return cachable383 = null;


        Object string_literal378_tree=null;
        Object ID379_tree=null;
        Object string_literal381_tree=null;
        Object STRING382_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dataset");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(463, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:463:9: ( 'dataset' ID ( datatype )? '<-' STRING cachable )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:463:11: 'dataset' ID ( datatype )? '<-' STRING cachable
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(463,11);
            string_literal378=(Token)match(input,137,FOLLOW_137_in_dataset2995); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal378_tree = (Object)adaptor.create(string_literal378);
            adaptor.addChild(root_0, string_literal378_tree);
            }
            dbg.location(463,21);
            ID379=(Token)match(input,ID,FOLLOW_ID_in_dataset2997); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID379_tree = (Object)adaptor.create(ID379);
            adaptor.addChild(root_0, ID379_tree);
            }
            dbg.location(463,24);
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:463:24: ( datatype )?
            int alt64=2;
            try { dbg.enterSubRule(64);
            try { dbg.enterDecision(64);

            int LA64_0 = input.LA(1);

            if ( (LA64_0==38) ) {
                alt64=1;
            }
            } finally {dbg.exitDecision(64);}

            switch (alt64) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:463:24: datatype
                    {
                    dbg.location(463,24);
                    pushFollow(FOLLOW_datatype_in_dataset2999);
                    datatype380=datatype();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, datatype380.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(64);}

            dbg.location(463,34);
            string_literal381=(Token)match(input,82,FOLLOW_82_in_dataset3002); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal381_tree = (Object)adaptor.create(string_literal381);
            adaptor.addChild(root_0, string_literal381_tree);
            }
            dbg.location(463,39);
            STRING382=(Token)match(input,STRING,FOLLOW_STRING_in_dataset3004); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING382_tree = (Object)adaptor.create(STRING382);
            adaptor.addChild(root_0, STRING382_tree);
            }
            dbg.location(463,46);
            pushFollow(FOLLOW_cachable_in_dataset3006);
            cachable383=cachable();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cachable383.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 81, dataset_StartIndex); }
        }
        dbg.location(464, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:466:1: datatype : ':' ( 'JSON' | 'XML' | 'RSS' | 'HTML' ) ;
    public final RulesetParser.datatype_return datatype() throws RecognitionException {
        RulesetParser.datatype_return retval = new RulesetParser.datatype_return();
        retval.start = input.LT(1);
        int datatype_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal384=null;
        Token set385=null;

        Object char_literal384_tree=null;
        Object set385_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "datatype");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(466, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:466:9: ( ':' ( 'JSON' | 'XML' | 'RSS' | 'HTML' ) )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:466:11: ':' ( 'JSON' | 'XML' | 'RSS' | 'HTML' )
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(466,11);
            char_literal384=(Token)match(input,38,FOLLOW_38_in_datatype3016); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal384_tree = (Object)adaptor.create(char_literal384);
            adaptor.addChild(root_0, char_literal384_tree);
            }
            dbg.location(466,15);
            set385=(Token)input.LT(1);
            if ( (input.LA(1)>=138 && input.LA(1)<=141) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set385));
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
            if ( state.backtracking>0 ) { memoize(input, 82, datatype_StartIndex); }
        }
        dbg.location(467, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:469:1: cachable : 'cachable' cachetime ;
    public final RulesetParser.cachable_return cachable() throws RecognitionException {
        RulesetParser.cachable_return retval = new RulesetParser.cachable_return();
        retval.start = input.LT(1);
        int cachable_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal386=null;
        RulesetParser.cachetime_return cachetime387 = null;


        Object string_literal386_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "cachable");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(469, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:469:9: ( 'cachable' cachetime )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:469:11: 'cachable' cachetime
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(469,11);
            string_literal386=(Token)match(input,142,FOLLOW_142_in_cachable3035); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal386_tree = (Object)adaptor.create(string_literal386);
            adaptor.addChild(root_0, string_literal386_tree);
            }
            dbg.location(469,22);
            pushFollow(FOLLOW_cachetime_in_cachable3037);
            cachetime387=cachetime();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cachetime387.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 83, cachable_StartIndex); }
        }
        dbg.location(470, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:472:1: cachetime : 'for' INT ( periods | period ) ;
    public final RulesetParser.cachetime_return cachetime() throws RecognitionException {
        RulesetParser.cachetime_return retval = new RulesetParser.cachetime_return();
        retval.start = input.LT(1);
        int cachetime_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal388=null;
        Token INT389=null;
        RulesetParser.periods_return periods390 = null;

        RulesetParser.period_return period391 = null;


        Object string_literal388_tree=null;
        Object INT389_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "cachetime");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(472, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:472:10: ( 'for' INT ( periods | period ) )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:472:12: 'for' INT ( periods | period )
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(472,12);
            string_literal388=(Token)match(input,52,FOLLOW_52_in_cachetime3048); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal388_tree = (Object)adaptor.create(string_literal388);
            adaptor.addChild(root_0, string_literal388_tree);
            }
            dbg.location(472,18);
            INT389=(Token)match(input,INT,FOLLOW_INT_in_cachetime3050); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INT389_tree = (Object)adaptor.create(INT389);
            adaptor.addChild(root_0, INT389_tree);
            }
            dbg.location(472,22);
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:472:22: ( periods | period )
            int alt65=2;
            try { dbg.enterSubRule(65);
            try { dbg.enterDecision(65);

            int LA65_0 = input.LA(1);

            if ( ((LA65_0>=143 && LA65_0<=149)) ) {
                alt65=1;
            }
            else if ( ((LA65_0>=150 && LA65_0<=156)) ) {
                alt65=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(65);}

            switch (alt65) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:472:23: periods
                    {
                    dbg.location(472,23);
                    pushFollow(FOLLOW_periods_in_cachetime3053);
                    periods390=periods();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, periods390.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:472:31: period
                    {
                    dbg.location(472,31);
                    pushFollow(FOLLOW_period_in_cachetime3055);
                    period391=period();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, period391.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(65);}


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
            if ( state.backtracking>0 ) { memoize(input, 84, cachetime_StartIndex); }
        }
        dbg.location(473, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:475:1: periods : ( 'years' | 'months' | 'weeks' | 'days' | 'hours' | 'minutes' | 'seconds' );
    public final RulesetParser.periods_return periods() throws RecognitionException {
        RulesetParser.periods_return retval = new RulesetParser.periods_return();
        retval.start = input.LT(1);
        int periods_StartIndex = input.index();
        Object root_0 = null;

        Token set392=null;

        Object set392_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "periods");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(475, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:475:9: ( 'years' | 'months' | 'weeks' | 'days' | 'hours' | 'minutes' | 'seconds' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(475,9);
            set392=(Token)input.LT(1);
            if ( (input.LA(1)>=143 && input.LA(1)<=149) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set392));
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
            if ( state.backtracking>0 ) { memoize(input, 85, periods_StartIndex); }
        }
        dbg.location(482, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:484:1: period : ( 'year' | 'month' | 'week' | 'day' | 'hour' | 'minute' | 'second' );
    public final RulesetParser.period_return period() throws RecognitionException {
        RulesetParser.period_return retval = new RulesetParser.period_return();
        retval.start = input.LT(1);
        int period_StartIndex = input.index();
        Object root_0 = null;

        Token set393=null;

        Object set393_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "period");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(484, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:484:9: ( 'year' | 'month' | 'week' | 'day' | 'hour' | 'minute' | 'second' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(484,9);
            set393=(Token)input.LT(1);
            if ( (input.LA(1)>=150 && input.LA(1)<=156) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set393));
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
            if ( state.backtracking>0 ) { memoize(input, 86, period_StartIndex); }
        }
        dbg.location(491, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:496:1: dispatch_block : 'dispatch' '{' ( dispatch )* '}' ;
    public final RulesetParser.dispatch_block_return dispatch_block() throws RecognitionException {
        RulesetParser.dispatch_block_return retval = new RulesetParser.dispatch_block_return();
        retval.start = input.LT(1);
        int dispatch_block_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal394=null;
        Token char_literal395=null;
        Token char_literal397=null;
        RulesetParser.dispatch_return dispatch396 = null;


        Object string_literal394_tree=null;
        Object char_literal395_tree=null;
        Object char_literal397_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dispatch_block");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(496, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:497:2: ( 'dispatch' '{' ( dispatch )* '}' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:497:4: 'dispatch' '{' ( dispatch )* '}'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(497,4);
            string_literal394=(Token)match(input,157,FOLLOW_157_in_dispatch_block3190); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal394_tree = (Object)adaptor.create(string_literal394);
            adaptor.addChild(root_0, string_literal394_tree);
            }
            dbg.location(497,15);
            char_literal395=(Token)match(input,20,FOLLOW_20_in_dispatch_block3192); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal395_tree = (Object)adaptor.create(char_literal395);
            adaptor.addChild(root_0, char_literal395_tree);
            }
            dbg.location(497,19);
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:497:19: ( dispatch )*
            try { dbg.enterSubRule(66);

            loop66:
            do {
                int alt66=2;
                try { dbg.enterDecision(66);

                int LA66_0 = input.LA(1);

                if ( (LA66_0==158) ) {
                    alt66=1;
                }


                } finally {dbg.exitDecision(66);}

                switch (alt66) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:497:19: dispatch
            	    {
            	    dbg.location(497,19);
            	    pushFollow(FOLLOW_dispatch_in_dispatch_block3194);
            	    dispatch396=dispatch();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, dispatch396.getTree());

            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);
            } finally {dbg.exitSubRule(66);}

            dbg.location(497,29);
            char_literal397=(Token)match(input,21,FOLLOW_21_in_dispatch_block3197); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal397_tree = (Object)adaptor.create(char_literal397);
            adaptor.addChild(root_0, char_literal397_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 87, dispatch_block_StartIndex); }
        }
        dbg.location(498, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:500:1: dispatch : 'domain' STRING ( dispatch_target )? ;
    public final RulesetParser.dispatch_return dispatch() throws RecognitionException {
        RulesetParser.dispatch_return retval = new RulesetParser.dispatch_return();
        retval.start = input.LT(1);
        int dispatch_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal398=null;
        Token STRING399=null;
        RulesetParser.dispatch_target_return dispatch_target400 = null;


        Object string_literal398_tree=null;
        Object STRING399_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dispatch");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(500, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:500:9: ( 'domain' STRING ( dispatch_target )? )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:500:11: 'domain' STRING ( dispatch_target )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(500,11);
            string_literal398=(Token)match(input,158,FOLLOW_158_in_dispatch3206); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal398_tree = (Object)adaptor.create(string_literal398);
            adaptor.addChild(root_0, string_literal398_tree);
            }
            dbg.location(500,20);
            STRING399=(Token)match(input,STRING,FOLLOW_STRING_in_dispatch3208); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING399_tree = (Object)adaptor.create(STRING399);
            adaptor.addChild(root_0, STRING399_tree);
            }
            dbg.location(500,27);
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:500:27: ( dispatch_target )?
            int alt67=2;
            try { dbg.enterSubRule(67);
            try { dbg.enterDecision(67);

            int LA67_0 = input.LA(1);

            if ( (LA67_0==159) ) {
                alt67=1;
            }
            } finally {dbg.exitDecision(67);}

            switch (alt67) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:500:27: dispatch_target
                    {
                    dbg.location(500,27);
                    pushFollow(FOLLOW_dispatch_target_in_dispatch3210);
                    dispatch_target400=dispatch_target();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dispatch_target400.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(67);}


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
            if ( state.backtracking>0 ) { memoize(input, 88, dispatch_StartIndex); }
        }
        dbg.location(500, 45);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:502:1: dispatch_target : '->' STRING ;
    public final RulesetParser.dispatch_target_return dispatch_target() throws RecognitionException {
        RulesetParser.dispatch_target_return retval = new RulesetParser.dispatch_target_return();
        retval.start = input.LT(1);
        int dispatch_target_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal401=null;
        Token STRING402=null;

        Object string_literal401_tree=null;
        Object STRING402_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dispatch_target");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(502, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:503:2: ( '->' STRING )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:503:4: '->' STRING
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(503,4);
            string_literal401=(Token)match(input,159,FOLLOW_159_in_dispatch_target3222); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal401_tree = (Object)adaptor.create(string_literal401);
            adaptor.addChild(root_0, string_literal401_tree);
            }
            dbg.location(503,9);
            STRING402=(Token)match(input,STRING,FOLLOW_STRING_in_dispatch_target3224); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING402_tree = (Object)adaptor.create(STRING402);
            adaptor.addChild(root_0, STRING402_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 89, dispatch_target_StartIndex); }
        }
        dbg.location(504, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:509:1: meta_block : 'meta' '{' ( pragma[keys_map] )* '}' ;
    public final RulesetParser.meta_block_return meta_block() throws RecognitionException {
        RulesetParser.meta_block_return retval = new RulesetParser.meta_block_return();
        retval.start = input.LT(1);
        int meta_block_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal403=null;
        Token char_literal404=null;
        Token char_literal406=null;
        RulesetParser.pragma_return pragma405 = null;


        Object string_literal403_tree=null;
        Object char_literal404_tree=null;
        Object char_literal406_tree=null;


        	 rule_json.put("meta",new HashMap());
        	 current_top = (HashMap)rule_json.get("meta");
        	 current_top.put("keys",new HashMap());
        	 HashMap keys_map = new HashMap();
        	 

        try { dbg.enterRule(getGrammarFileName(), "meta_block");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(509, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:525:2: ( 'meta' '{' ( pragma[keys_map] )* '}' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:525:4: 'meta' '{' ( pragma[keys_map] )* '}'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(525,4);
            string_literal403=(Token)match(input,160,FOLLOW_160_in_meta_block3259); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal403_tree = (Object)adaptor.create(string_literal403);
            adaptor.addChild(root_0, string_literal403_tree);
            }
            dbg.location(525,11);
            char_literal404=(Token)match(input,20,FOLLOW_20_in_meta_block3261); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal404_tree = (Object)adaptor.create(char_literal404);
            adaptor.addChild(root_0, char_literal404_tree);
            }
            dbg.location(525,15);
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:525:15: ( pragma[keys_map] )*
            try { dbg.enterSubRule(68);

            loop68:
            do {
                int alt68=2;
                try { dbg.enterDecision(68);

                int LA68_0 = input.LA(1);

                if ( ((LA68_0>=161 && LA68_0<=162)||LA68_0==169||(LA68_0>=173 && LA68_0<=174)||LA68_0==177||LA68_0==180) ) {
                    alt68=1;
                }


                } finally {dbg.exitDecision(68);}

                switch (alt68) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:525:15: pragma[keys_map]
            	    {
            	    dbg.location(525,15);
            	    pushFollow(FOLLOW_pragma_in_meta_block3263);
            	    pragma405=pragma(keys_map);

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, pragma405.getTree());

            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);
            } finally {dbg.exitSubRule(68);}

            dbg.location(525,33);
            char_literal406=(Token)match(input,21,FOLLOW_21_in_meta_block3267); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal406_tree = (Object)adaptor.create(char_literal406);
            adaptor.addChild(root_0, char_literal406_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

              	if(!keys_map.isEmpty())
              	{
              		current_top.put("keys",keys_map);
              	}
              		
              	current_top = rule_json;	

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 90, meta_block_StartIndex); }
        }
        dbg.location(527, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:529:1: pragma[HashMap keys_map] : ( desc_block | meta_name | 'author' author= STRING | 'key' what= ( 'errorstack' | 'googleanalytics' | 'twitter' | 'amazon' | 'kpds' | 'google' | ID ) key_value[key_values] | authz_pragma | logging_pargma | 'use' 'module' ID ( alias )? | 'use' ( 'css' | 'javascript' ) 'resource' location );
    public final RulesetParser.pragma_return pragma(HashMap keys_map) throws RecognitionException {
        RulesetParser.pragma_return retval = new RulesetParser.pragma_return();
        retval.start = input.LT(1);
        int pragma_StartIndex = input.index();
        Object root_0 = null;

        Token author=null;
        Token what=null;
        Token string_literal409=null;
        Token string_literal410=null;
        Token string_literal414=null;
        Token string_literal415=null;
        Token ID416=null;
        Token string_literal418=null;
        Token set419=null;
        Token string_literal420=null;
        RulesetParser.desc_block_return desc_block407 = null;

        RulesetParser.meta_name_return meta_name408 = null;

        RulesetParser.key_value_return key_value411 = null;

        RulesetParser.authz_pragma_return authz_pragma412 = null;

        RulesetParser.logging_pargma_return logging_pargma413 = null;

        RulesetParser.alias_return alias417 = null;

        RulesetParser.location_return location421 = null;


        Object author_tree=null;
        Object what_tree=null;
        Object string_literal409_tree=null;
        Object string_literal410_tree=null;
        Object string_literal414_tree=null;
        Object string_literal415_tree=null;
        Object ID416_tree=null;
        Object string_literal418_tree=null;
        Object set419_tree=null;
        Object string_literal420_tree=null;


        	HashMap key_values = new HashMap();
        	

        try { dbg.enterRule(getGrammarFileName(), "pragma");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(529, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:535:2: ( desc_block | meta_name | 'author' author= STRING | 'key' what= ( 'errorstack' | 'googleanalytics' | 'twitter' | 'amazon' | 'kpds' | 'google' | ID ) key_value[key_values] | authz_pragma | logging_pargma | 'use' 'module' ID ( alias )? | 'use' ( 'css' | 'javascript' ) 'resource' location )
            int alt70=8;
            try { dbg.enterDecision(70);

            try {
                isCyclicDecision = true;
                alt70 = dfa70.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(70);}

            switch (alt70) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:535:4: desc_block
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(535,4);
                    pushFollow(FOLLOW_desc_block_in_pragma3291);
                    desc_block407=desc_block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, desc_block407.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:536:4: meta_name
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(536,4);
                    pushFollow(FOLLOW_meta_name_in_pragma3297);
                    meta_name408=meta_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, meta_name408.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:537:4: 'author' author= STRING
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(537,4);
                    string_literal409=(Token)match(input,161,FOLLOW_161_in_pragma3302); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal409_tree = (Object)adaptor.create(string_literal409);
                    adaptor.addChild(root_0, string_literal409_tree);
                    }
                    dbg.location(537,19);
                    author=(Token)match(input,STRING,FOLLOW_STRING_in_pragma3306); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    author_tree = (Object)adaptor.create(author);
                    adaptor.addChild(root_0, author_tree);
                    }
                    dbg.location(537,29);
                    if ( state.backtracking==0 ) {
                       ((HashMap)rule_json.get("meta")).put("author",(author!=null?author.getText():null)); 
                    }

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:538:4: 'key' what= ( 'errorstack' | 'googleanalytics' | 'twitter' | 'amazon' | 'kpds' | 'google' | ID ) key_value[key_values]
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(538,4);
                    string_literal410=(Token)match(input,162,FOLLOW_162_in_pragma3315); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal410_tree = (Object)adaptor.create(string_literal410);
                    adaptor.addChild(root_0, string_literal410_tree);
                    }
                    dbg.location(538,14);
                    what=(Token)input.LT(1);
                    if ( input.LA(1)==ID||(input.LA(1)>=163 && input.LA(1)<=168) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(what));
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(538,88);
                    pushFollow(FOLLOW_key_value_in_pragma3337);
                    key_value411=key_value(key_values);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, key_value411.getTree());
                    dbg.location(538,111);
                    if ( state.backtracking==0 ) {
                       
                      		if(!key_values.isEmpty()) 
                      			keys_map.put((what!=null?what.getText():null),key_values); 
                      		else 
                      			keys_map.put((what!=null?what.getText():null),strip_string((key_value411!=null?input.toString(key_value411.start,key_value411.stop):null))); 
                      	
                    }

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:544:4: authz_pragma
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(544,4);
                    pushFollow(FOLLOW_authz_pragma_in_pragma3346);
                    authz_pragma412=authz_pragma();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, authz_pragma412.getTree());

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:545:4: logging_pargma
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(545,4);
                    pushFollow(FOLLOW_logging_pargma_in_pragma3351);
                    logging_pargma413=logging_pargma();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logging_pargma413.getTree());

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:546:4: 'use' 'module' ID ( alias )?
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(546,4);
                    string_literal414=(Token)match(input,169,FOLLOW_169_in_pragma3356); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal414_tree = (Object)adaptor.create(string_literal414);
                    adaptor.addChild(root_0, string_literal414_tree);
                    }
                    dbg.location(546,10);
                    string_literal415=(Token)match(input,170,FOLLOW_170_in_pragma3358); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal415_tree = (Object)adaptor.create(string_literal415);
                    adaptor.addChild(root_0, string_literal415_tree);
                    }
                    dbg.location(546,19);
                    ID416=(Token)match(input,ID,FOLLOW_ID_in_pragma3360); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID416_tree = (Object)adaptor.create(ID416);
                    adaptor.addChild(root_0, ID416_tree);
                    }
                    dbg.location(546,22);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:546:22: ( alias )?
                    int alt69=2;
                    try { dbg.enterSubRule(69);
                    try { dbg.enterDecision(69);

                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==179) ) {
                        alt69=1;
                    }
                    } finally {dbg.exitDecision(69);}

                    switch (alt69) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:546:22: alias
                            {
                            dbg.location(546,22);
                            pushFollow(FOLLOW_alias_in_pragma3362);
                            alias417=alias();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, alias417.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(69);}


                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:547:4: 'use' ( 'css' | 'javascript' ) 'resource' location
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(547,4);
                    string_literal418=(Token)match(input,169,FOLLOW_169_in_pragma3368); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal418_tree = (Object)adaptor.create(string_literal418);
                    adaptor.addChild(root_0, string_literal418_tree);
                    }
                    dbg.location(547,10);
                    set419=(Token)input.LT(1);
                    if ( input.LA(1)==83||input.LA(1)==171 ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set419));
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(547,33);
                    string_literal420=(Token)match(input,172,FOLLOW_172_in_pragma3378); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal420_tree = (Object)adaptor.create(string_literal420);
                    adaptor.addChild(root_0, string_literal420_tree);
                    }
                    dbg.location(547,44);
                    pushFollow(FOLLOW_location_in_pragma3380);
                    location421=location();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, location421.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 91, pragma_StartIndex); }
        }
        dbg.location(548, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "pragma");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "pragma"

    public static class meta_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "meta_name"
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:550:1: meta_name : 'name' thename= STRING ;
    public final RulesetParser.meta_name_return meta_name() throws RecognitionException {
        RulesetParser.meta_name_return retval = new RulesetParser.meta_name_return();
        retval.start = input.LT(1);
        int meta_name_StartIndex = input.index();
        Object root_0 = null;

        Token thename=null;
        Token string_literal422=null;

        Object thename_tree=null;
        Object string_literal422_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "meta_name");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(550, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:551:2: ( 'name' thename= STRING )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:551:5: 'name' thename= STRING
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(551,5);
            string_literal422=(Token)match(input,173,FOLLOW_173_in_meta_name3394); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal422_tree = (Object)adaptor.create(string_literal422);
            adaptor.addChild(root_0, string_literal422_tree);
            }
            dbg.location(551,19);
            thename=(Token)match(input,STRING,FOLLOW_STRING_in_meta_name3398); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            thename_tree = (Object)adaptor.create(thename);
            adaptor.addChild(root_0, thename_tree);
            }
            dbg.location(551,27);
            if ( state.backtracking==0 ) {
               ((HashMap)rule_json.get("meta")).put("name",strip_string((thename!=null?thename.getText():null))); 
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
            if ( state.backtracking>0 ) { memoize(input, 92, meta_name_StartIndex); }
        }
        dbg.location(552, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "meta_name");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "meta_name"

    public static class authz_pragma_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "authz_pragma"
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:554:1: authz_pragma : 'authz' 'require' 'user' ;
    public final RulesetParser.authz_pragma_return authz_pragma() throws RecognitionException {
        RulesetParser.authz_pragma_return retval = new RulesetParser.authz_pragma_return();
        retval.start = input.LT(1);
        int authz_pragma_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal423=null;
        Token string_literal424=null;
        Token string_literal425=null;

        Object string_literal423_tree=null;
        Object string_literal424_tree=null;
        Object string_literal425_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "authz_pragma");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(554, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:555:2: ( 'authz' 'require' 'user' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:555:4: 'authz' 'require' 'user'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(555,4);
            string_literal423=(Token)match(input,174,FOLLOW_174_in_authz_pragma3412); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal423_tree = (Object)adaptor.create(string_literal423);
            adaptor.addChild(root_0, string_literal423_tree);
            }
            dbg.location(555,12);
            string_literal424=(Token)match(input,175,FOLLOW_175_in_authz_pragma3414); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal424_tree = (Object)adaptor.create(string_literal424);
            adaptor.addChild(root_0, string_literal424_tree);
            }
            dbg.location(555,22);
            string_literal425=(Token)match(input,176,FOLLOW_176_in_authz_pragma3416); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal425_tree = (Object)adaptor.create(string_literal425);
            adaptor.addChild(root_0, string_literal425_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 93, authz_pragma_StartIndex); }
        }
        dbg.location(556, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:558:1: logging_pargma : 'logging' ( 'on' | 'off' ) ;
    public final RulesetParser.logging_pargma_return logging_pargma() throws RecognitionException {
        RulesetParser.logging_pargma_return retval = new RulesetParser.logging_pargma_return();
        retval.start = input.LT(1);
        int logging_pargma_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal426=null;
        Token set427=null;

        Object string_literal426_tree=null;
        Object set427_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "logging_pargma");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(558, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:559:2: ( 'logging' ( 'on' | 'off' ) )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:559:4: 'logging' ( 'on' | 'off' )
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(559,4);
            string_literal426=(Token)match(input,177,FOLLOW_177_in_logging_pargma3428); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal426_tree = (Object)adaptor.create(string_literal426);
            adaptor.addChild(root_0, string_literal426_tree);
            }
            dbg.location(559,14);
            set427=(Token)input.LT(1);
            if ( input.LA(1)==79||input.LA(1)==178 ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set427));
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
            if ( state.backtracking>0 ) { memoize(input, 94, logging_pargma_StartIndex); }
        }
        dbg.location(560, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:562:1: alias : 'alias' ID ;
    public final RulesetParser.alias_return alias() throws RecognitionException {
        RulesetParser.alias_return retval = new RulesetParser.alias_return();
        retval.start = input.LT(1);
        int alias_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal428=null;
        Token ID429=null;

        Object string_literal428_tree=null;
        Object ID429_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "alias");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(562, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:562:7: ( 'alias' ID )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:562:9: 'alias' ID
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(562,9);
            string_literal428=(Token)match(input,179,FOLLOW_179_in_alias3445); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal428_tree = (Object)adaptor.create(string_literal428);
            adaptor.addChild(root_0, string_literal428_tree);
            }
            dbg.location(562,17);
            ID429=(Token)match(input,ID,FOLLOW_ID_in_alias3447); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID429_tree = (Object)adaptor.create(ID429);
            adaptor.addChild(root_0, ID429_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 95, alias_StartIndex); }
        }
        dbg.location(562, 19);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:564:1: location : ( STRING | ID );
    public final RulesetParser.location_return location() throws RecognitionException {
        RulesetParser.location_return retval = new RulesetParser.location_return();
        retval.start = input.LT(1);
        int location_StartIndex = input.index();
        Object root_0 = null;

        Token set430=null;

        Object set430_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "location");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(564, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:564:9: ( STRING | ID )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(564,9);
            set430=(Token)input.LT(1);
            if ( input.LA(1)==ID||input.LA(1)==STRING ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set430));
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
            if ( state.backtracking>0 ) { memoize(input, 96, location_StartIndex); }
        }
        dbg.location(564, 22);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:566:1: desc_block : {...}? 'description' desc= ( HTML | STRING ) ;
    public final RulesetParser.desc_block_return desc_block() throws RecognitionException {
        RulesetParser.desc_block_return retval = new RulesetParser.desc_block_return();
        retval.start = input.LT(1);
        int desc_block_StartIndex = input.index();
        Object root_0 = null;

        Token desc=null;
        Token string_literal431=null;

        Object desc_tree=null;
        Object string_literal431_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "desc_block");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(566, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:567:2: ({...}? 'description' desc= ( HTML | STRING ) )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:567:4: {...}? 'description' desc= ( HTML | STRING )
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(567,4);
            if ( !(evalPredicate(false,"false")) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "desc_block", "false");
            }
            dbg.location(567,13);
            string_literal431=(Token)match(input,180,FOLLOW_180_in_desc_block3471); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal431_tree = (Object)adaptor.create(string_literal431);
            adaptor.addChild(root_0, string_literal431_tree);
            }
            dbg.location(567,31);
            desc=(Token)input.LT(1);
            if ( input.LA(1)==STRING||input.LA(1)==HTML ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(desc));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }

            dbg.location(567,46);
            if ( state.backtracking==0 ) {
               ((HashMap)rule_json.get("meta")).put("description",strip_wrappers("<<",">>",(desc!=null?desc.getText():null))); 
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
            if ( state.backtracking>0 ) { memoize(input, 97, desc_block_StartIndex); }
        }
        dbg.location(568, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:571:1: key_value[HashMap key_values] : ( STRING | '{' ( name_value_pair[key_values] ( ',' )? )+ '}' );
    public final RulesetParser.key_value_return key_value(HashMap key_values) throws RecognitionException {
        RulesetParser.key_value_return retval = new RulesetParser.key_value_return();
        retval.start = input.LT(1);
        int key_value_StartIndex = input.index();
        Object root_0 = null;

        Token STRING432=null;
        Token char_literal433=null;
        Token char_literal435=null;
        Token char_literal436=null;
        RulesetParser.name_value_pair_return name_value_pair434 = null;


        Object STRING432_tree=null;
        Object char_literal433_tree=null;
        Object char_literal435_tree=null;
        Object char_literal436_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "key_value");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(571, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:572:2: ( STRING | '{' ( name_value_pair[key_values] ( ',' )? )+ '}' )
            int alt73=2;
            try { dbg.enterDecision(73);

            int LA73_0 = input.LA(1);

            if ( (LA73_0==STRING) ) {
                alt73=1;
            }
            else if ( (LA73_0==20) ) {
                alt73=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(73);}

            switch (alt73) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:572:4: STRING
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(572,4);
                    STRING432=(Token)match(input,STRING,FOLLOW_STRING_in_key_value3496); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING432_tree = (Object)adaptor.create(STRING432);
                    adaptor.addChild(root_0, STRING432_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:572:13: '{' ( name_value_pair[key_values] ( ',' )? )+ '}'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(572,13);
                    char_literal433=(Token)match(input,20,FOLLOW_20_in_key_value3500); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal433_tree = (Object)adaptor.create(char_literal433);
                    adaptor.addChild(root_0, char_literal433_tree);
                    }
                    dbg.location(572,17);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:572:17: ( name_value_pair[key_values] ( ',' )? )+
                    int cnt72=0;
                    try { dbg.enterSubRule(72);

                    loop72:
                    do {
                        int alt72=2;
                        try { dbg.enterDecision(72);

                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==STRING) ) {
                            alt72=1;
                        }


                        } finally {dbg.exitDecision(72);}

                        switch (alt72) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:572:18: name_value_pair[key_values] ( ',' )?
                    	    {
                    	    dbg.location(572,18);
                    	    pushFollow(FOLLOW_name_value_pair_in_key_value3503);
                    	    name_value_pair434=name_value_pair(key_values);

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, name_value_pair434.getTree());
                    	    dbg.location(572,46);
                    	    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:572:46: ( ',' )?
                    	    int alt71=2;
                    	    try { dbg.enterSubRule(71);
                    	    try { dbg.enterDecision(71);

                    	    int LA71_0 = input.LA(1);

                    	    if ( (LA71_0==58) ) {
                    	        alt71=1;
                    	    }
                    	    } finally {dbg.exitDecision(71);}

                    	    switch (alt71) {
                    	        case 1 :
                    	            dbg.enterAlt(1);

                    	            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:572:46: ','
                    	            {
                    	            dbg.location(572,46);
                    	            char_literal435=(Token)match(input,58,FOLLOW_58_in_key_value3506); if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) {
                    	            char_literal435_tree = (Object)adaptor.create(char_literal435);
                    	            adaptor.addChild(root_0, char_literal435_tree);
                    	            }

                    	            }
                    	            break;

                    	    }
                    	    } finally {dbg.exitSubRule(71);}


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt72 >= 1 ) break loop72;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(72, input);
                                dbg.recognitionException(eee);

                                throw eee;
                        }
                        cnt72++;
                    } while (true);
                    } finally {dbg.exitSubRule(72);}

                    dbg.location(572,53);
                    char_literal436=(Token)match(input,21,FOLLOW_21_in_key_value3511); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal436_tree = (Object)adaptor.create(char_literal436);
                    adaptor.addChild(root_0, char_literal436_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 98, key_value_StartIndex); }
        }
        dbg.location(573, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:575:1: name_value_pair[HashMap key_values] : k= STRING ':' (v= INT | v= FLOAT | v= STRING ) ;
    public final RulesetParser.name_value_pair_return name_value_pair(HashMap key_values) throws RecognitionException {
        RulesetParser.name_value_pair_return retval = new RulesetParser.name_value_pair_return();
        retval.start = input.LT(1);
        int name_value_pair_StartIndex = input.index();
        Object root_0 = null;

        Token k=null;
        Token v=null;
        Token char_literal437=null;

        Object k_tree=null;
        Object v_tree=null;
        Object char_literal437_tree=null;


        	Object value = null;

        try { dbg.enterRule(getGrammarFileName(), "name_value_pair");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(575, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return retval; }
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:579:2: (k= STRING ':' (v= INT | v= FLOAT | v= STRING ) )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:579:4: k= STRING ':' (v= INT | v= FLOAT | v= STRING )
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(579,5);
            k=(Token)match(input,STRING,FOLLOW_STRING_in_name_value_pair3534); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            k_tree = (Object)adaptor.create(k);
            adaptor.addChild(root_0, k_tree);
            }
            dbg.location(579,13);
            char_literal437=(Token)match(input,38,FOLLOW_38_in_name_value_pair3536); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal437_tree = (Object)adaptor.create(char_literal437);
            adaptor.addChild(root_0, char_literal437_tree);
            }
            dbg.location(579,17);
            // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:579:17: (v= INT | v= FLOAT | v= STRING )
            int alt74=3;
            try { dbg.enterSubRule(74);
            try { dbg.enterDecision(74);

            switch ( input.LA(1) ) {
            case INT:
                {
                alt74=1;
                }
                break;
            case FLOAT:
                {
                alt74=2;
                }
                break;
            case STRING:
                {
                alt74=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(74);}

            switch (alt74) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:579:18: v= INT
                    {
                    dbg.location(579,19);
                    v=(Token)match(input,INT,FOLLOW_INT_in_name_value_pair3541); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    v_tree = (Object)adaptor.create(v);
                    adaptor.addChild(root_0, v_tree);
                    }
                    dbg.location(579,24);
                    if ( state.backtracking==0 ) {
                      value = Integer.parseInt((v!=null?v.getText():null));System.out.println("found int");
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:579:95: v= FLOAT
                    {
                    dbg.location(579,96);
                    v=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_name_value_pair3549); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    v_tree = (Object)adaptor.create(v);
                    adaptor.addChild(root_0, v_tree);
                    }
                    dbg.location(579,103);
                    if ( state.backtracking==0 ) {
                      value = Float.parseFloat((v!=null?v.getText():null));
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:579:142: v= STRING
                    {
                    dbg.location(579,143);
                    v=(Token)match(input,STRING,FOLLOW_STRING_in_name_value_pair3557); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    v_tree = (Object)adaptor.create(v);
                    adaptor.addChild(root_0, v_tree);
                    }
                    dbg.location(579,151);
                    if ( state.backtracking==0 ) {
                      value = (v!=null?v.getText():null);
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(74);}

            dbg.location(579,171);
            if ( state.backtracking==0 ) {
              key_values.put(strip_string((k!=null?k.getText():null)),value);
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
            if ( state.backtracking>0 ) { memoize(input, 99, name_value_pair_StartIndex); }
        }
        dbg.location(580, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "name_value_pair");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "name_value_pair"

    // $ANTLR start synpred1_Ruleset
    public final void synpred1_Ruleset_fragment() throws RecognitionException {   
        // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:292:4: ( event_or 'then' )
        dbg.enterAlt(1);

        // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:292:4: event_or 'then'
        {
        dbg.location(292,4);
        pushFollow(FOLLOW_event_or_in_synpred1_Ruleset1714);
        event_or();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(292,13);
        match(input,56,FOLLOW_56_in_synpred1_Ruleset1716); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_Ruleset

    // $ANTLR start synpred2_Ruleset
    public final void synpred2_Ruleset_fragment() throws RecognitionException {   
        // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:293:3: ( event_or 'before' )
        dbg.enterAlt(1);

        // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:293:3: event_or 'before'
        {
        dbg.location(293,3);
        pushFollow(FOLLOW_event_or_in_synpred2_Ruleset1721);
        event_or();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(293,12);
        match(input,69,FOLLOW_69_in_synpred2_Ruleset1723); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_Ruleset

    // $ANTLR start synpred6_Ruleset
    public final void synpred6_Ruleset_fragment() throws RecognitionException {   
        // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:365:4: ( disjunction '=>' expr '|' expr )
        dbg.enterAlt(1);

        // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:365:4: disjunction '=>' expr '|' expr
        {
        dbg.location(365,4);
        pushFollow(FOLLOW_disjunction_in_synpred6_Ruleset2224);
        disjunction();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(365,16);
        match(input,60,FOLLOW_60_in_synpred6_Ruleset2226); if (state.failed) return ;
        dbg.location(365,21);
        pushFollow(FOLLOW_expr_in_synpred6_Ruleset2228);
        expr();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(365,26);
        match(input,85,FOLLOW_85_in_synpred6_Ruleset2230); if (state.failed) return ;
        dbg.location(365,30);
        pushFollow(FOLLOW_expr_in_synpred6_Ruleset2232);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_Ruleset

    // $ANTLR start synpred8_Ruleset
    public final void synpred8_Ruleset_fragment() throws RecognitionException {   
        // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:394:2: ( 'seen' STRING 'in' var_domain ':' ID timeframe )
        dbg.enterAlt(1);

        // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:394:2: 'seen' STRING 'in' var_domain ':' ID timeframe
        {
        dbg.location(394,2);
        match(input,102,FOLLOW_102_in_synpred8_Ruleset2425); if (state.failed) return ;
        dbg.location(394,9);
        match(input,STRING,FOLLOW_STRING_in_synpred8_Ruleset2427); if (state.failed) return ;
        dbg.location(394,16);
        match(input,41,FOLLOW_41_in_synpred8_Ruleset2429); if (state.failed) return ;
        dbg.location(394,21);
        pushFollow(FOLLOW_var_domain_in_synpred8_Ruleset2431);
        var_domain();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(394,32);
        match(input,38,FOLLOW_38_in_synpred8_Ruleset2433); if (state.failed) return ;
        dbg.location(394,36);
        match(input,ID,FOLLOW_ID_in_synpred8_Ruleset2435); if (state.failed) return ;
        dbg.location(394,39);
        pushFollow(FOLLOW_timeframe_in_synpred8_Ruleset2437);
        timeframe();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred8_Ruleset

    // $ANTLR start synpred9_Ruleset
    public final void synpred9_Ruleset_fragment() throws RecognitionException {   
        // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:395:2: ( 'seen' STRING ( 'before' | 'after' ) STRING 'in' var_domain ':' ID )
        dbg.enterAlt(1);

        // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:395:2: 'seen' STRING ( 'before' | 'after' ) STRING 'in' var_domain ':' ID
        {
        dbg.location(395,2);
        match(input,102,FOLLOW_102_in_synpred9_Ruleset2442); if (state.failed) return ;
        dbg.location(395,9);
        match(input,STRING,FOLLOW_STRING_in_synpred9_Ruleset2444); if (state.failed) return ;
        dbg.location(395,16);
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

        dbg.location(395,37);
        match(input,STRING,FOLLOW_STRING_in_synpred9_Ruleset2454); if (state.failed) return ;
        dbg.location(395,44);
        match(input,41,FOLLOW_41_in_synpred9_Ruleset2456); if (state.failed) return ;
        dbg.location(395,49);
        pushFollow(FOLLOW_var_domain_in_synpred9_Ruleset2458);
        var_domain();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(395,60);
        match(input,38,FOLLOW_38_in_synpred9_Ruleset2460); if (state.failed) return ;
        dbg.location(395,64);
        match(input,ID,FOLLOW_ID_in_synpred9_Ruleset2462); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_Ruleset

    // $ANTLR start synpred10_Ruleset
    public final void synpred10_Ruleset_fragment() throws RecognitionException {   
        // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:396:2: ( var_domain ':' ID predop expr timeframe )
        dbg.enterAlt(1);

        // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:396:2: var_domain ':' ID predop expr timeframe
        {
        dbg.location(396,2);
        pushFollow(FOLLOW_var_domain_in_synpred10_Ruleset2467);
        var_domain();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(396,13);
        match(input,38,FOLLOW_38_in_synpred10_Ruleset2469); if (state.failed) return ;
        dbg.location(396,17);
        match(input,ID,FOLLOW_ID_in_synpred10_Ruleset2471); if (state.failed) return ;
        dbg.location(396,20);
        pushFollow(FOLLOW_predop_in_synpred10_Ruleset2473);
        predop();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(396,27);
        pushFollow(FOLLOW_expr_in_synpred10_Ruleset2475);
        expr();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(396,32);
        pushFollow(FOLLOW_timeframe_in_synpred10_Ruleset2477);
        timeframe();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_Ruleset

    // $ANTLR start synpred11_Ruleset
    public final void synpred11_Ruleset_fragment() throws RecognitionException {   
        // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:397:2: ( var_domain ':' ID timeframe )
        dbg.enterAlt(1);

        // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:397:2: var_domain ':' ID timeframe
        {
        dbg.location(397,2);
        pushFollow(FOLLOW_var_domain_in_synpred11_Ruleset2482);
        var_domain();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(397,13);
        match(input,38,FOLLOW_38_in_synpred11_Ruleset2484); if (state.failed) return ;
        dbg.location(397,17);
        match(input,ID,FOLLOW_ID_in_synpred11_Ruleset2486); if (state.failed) return ;
        dbg.location(397,20);
        pushFollow(FOLLOW_timeframe_in_synpred11_Ruleset2488);
        timeframe();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred11_Ruleset

    // $ANTLR start synpred17_Ruleset
    public final void synpred17_Ruleset_fragment() throws RecognitionException {   
        // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:412:9: ( ID '[' expr ']' )
        dbg.enterAlt(1);

        // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:412:9: ID '[' expr ']'
        {
        dbg.location(412,9);
        match(input,ID,FOLLOW_ID_in_synpred17_Ruleset2584); if (state.failed) return ;
        dbg.location(412,12);
        match(input,106,FOLLOW_106_in_synpred17_Ruleset2586); if (state.failed) return ;
        dbg.location(412,16);
        pushFollow(FOLLOW_expr_in_synpred17_Ruleset2588);
        expr();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(412,21);
        match(input,107,FOLLOW_107_in_synpred17_Ruleset2590); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred17_Ruleset

    // $ANTLR start synpred20_Ruleset
    public final void synpred20_Ruleset_fragment() throws RecognitionException {   
        // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:415:9: ( function_app )
        dbg.enterAlt(1);

        // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:415:9: function_app
        {
        dbg.location(415,9);
        pushFollow(FOLLOW_function_app_in_synpred20_Ruleset2620);
        function_app();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred20_Ruleset

    // $ANTLR start synpred23_Ruleset
    public final void synpred23_Ruleset_fragment() throws RecognitionException {   
        // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:418:9: ( ID )
        dbg.enterAlt(1);

        // /Users/ciddennis/Development/sandboxes/cid/parser/Ruleset.g:418:9: ID
        {
        dbg.location(418,9);
        match(input,ID,FOLLOW_ID_in_synpred23_Ruleset2666); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred23_Ruleset

    // Delegated rules

    public final boolean synpred2_Ruleset() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred2_Ruleset_fragment(); // can never throw exception
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
    public final boolean synpred10_Ruleset() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred10_Ruleset_fragment(); // can never throw exception
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
    public final boolean synpred1_Ruleset() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred1_Ruleset_fragment(); // can never throw exception
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
    public final boolean synpred11_Ruleset() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred11_Ruleset_fragment(); // can never throw exception
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
    public final boolean synpred20_Ruleset() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred20_Ruleset_fragment(); // can never throw exception
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
    public final boolean synpred17_Ruleset() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred17_Ruleset_fragment(); // can never throw exception
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
    public final boolean synpred6_Ruleset() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred6_Ruleset_fragment(); // can never throw exception
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
    public final boolean synpred23_Ruleset() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred23_Ruleset_fragment(); // can never throw exception
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
    public final boolean synpred8_Ruleset() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred8_Ruleset_fragment(); // can never throw exception
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
    public final boolean synpred9_Ruleset() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred9_Ruleset_fragment(); // can never throw exception
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


    protected DFA45 dfa45 = new DFA45(this);
    protected DFA51 dfa51 = new DFA51(this);
    protected DFA55 dfa55 = new DFA55(this);
    protected DFA70 dfa70 = new DFA70(this);
    static final String DFA45_eotS =
        "\21\uffff";
    static final String DFA45_eofS =
        "\21\uffff";
    static final String DFA45_minS =
        "\1\4\16\0\2\uffff";
    static final String DFA45_maxS =
        "\1\u0087\16\0\2\uffff";
    static final String DFA45_acceptS =
        "\17\uffff\1\1\1\2";
    static final String DFA45_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\2\uffff}>";
    static final String[] DFA45_transitionS = {
            "\1\11\1\4\2\uffff\1\6\2\uffff\1\5\10\uffff\1\15\44\uffff\1\16"+
            "\15\uffff\1\1\36\uffff\1\2\1\uffff\1\7\1\10\1\14\1\uffff\1\12"+
            "\1\13\30\uffff\2\3",
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

    static final short[] DFA45_eot = DFA.unpackEncodedString(DFA45_eotS);
    static final short[] DFA45_eof = DFA.unpackEncodedString(DFA45_eofS);
    static final char[] DFA45_min = DFA.unpackEncodedStringToUnsignedChars(DFA45_minS);
    static final char[] DFA45_max = DFA.unpackEncodedStringToUnsignedChars(DFA45_maxS);
    static final short[] DFA45_accept = DFA.unpackEncodedString(DFA45_acceptS);
    static final short[] DFA45_special = DFA.unpackEncodedString(DFA45_specialS);
    static final short[][] DFA45_transition;

    static {
        int numStates = DFA45_transitionS.length;
        DFA45_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA45_transition[i] = DFA.unpackEncodedString(DFA45_transitionS[i]);
        }
    }

    class DFA45 extends DFA {

        public DFA45(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 45;
            this.eot = DFA45_eot;
            this.eof = DFA45_eof;
            this.min = DFA45_min;
            this.max = DFA45_max;
            this.accept = DFA45_accept;
            this.special = DFA45_special;
            this.transition = DFA45_transition;
        }
        public String getDescription() {
            return "364:1: conditional_expression options {backtrack=true; } : ( disjunction '=>' expr '|' expr | disjunction );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA45_1 = input.LA(1);

                         
                        int index45_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_Ruleset()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index45_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA45_2 = input.LA(1);

                         
                        int index45_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_Ruleset()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index45_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA45_3 = input.LA(1);

                         
                        int index45_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_Ruleset()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index45_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA45_4 = input.LA(1);

                         
                        int index45_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_Ruleset()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index45_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA45_5 = input.LA(1);

                         
                        int index45_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_Ruleset()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index45_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA45_6 = input.LA(1);

                         
                        int index45_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_Ruleset()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index45_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA45_7 = input.LA(1);

                         
                        int index45_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_Ruleset()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index45_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA45_8 = input.LA(1);

                         
                        int index45_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_Ruleset()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index45_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA45_9 = input.LA(1);

                         
                        int index45_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_Ruleset()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index45_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA45_10 = input.LA(1);

                         
                        int index45_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_Ruleset()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index45_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA45_11 = input.LA(1);

                         
                        int index45_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_Ruleset()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index45_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA45_12 = input.LA(1);

                         
                        int index45_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_Ruleset()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index45_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA45_13 = input.LA(1);

                         
                        int index45_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_Ruleset()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index45_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA45_14 = input.LA(1);

                         
                        int index45_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_Ruleset()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index45_14);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 45, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA51_eotS =
        "\23\uffff";
    static final String DFA51_eofS =
        "\23\uffff";
    static final String DFA51_minS =
        "\1\4\1\uffff\2\0\17\uffff";
    static final String DFA51_maxS =
        "\1\u0087\1\uffff\2\0\17\uffff";
    static final String DFA51_acceptS =
        "\1\uffff\1\1\2\uffff\1\6\12\uffff\1\2\1\3\1\4\1\5";
    static final String DFA51_specialS =
        "\2\uffff\1\0\1\1\17\uffff}>";
    static final String[] DFA51_transitionS = {
            "\2\4\2\uffff\1\4\2\uffff\1\4\10\uffff\1\4\44\uffff\1\4\15\uffff"+
            "\1\1\36\uffff\1\2\1\uffff\3\4\1\uffff\2\4\30\uffff\2\3",
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
            return "392:1: unary_expr options {backtrack=true; } : ( 'not' unary_expr | 'seen' STRING 'in' var_domain ':' ID timeframe | 'seen' STRING ( 'before' | 'after' ) STRING 'in' var_domain ':' ID | var_domain ':' ID predop expr timeframe | var_domain ':' ID timeframe | operator_expr );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA51_2 = input.LA(1);

                         
                        int index51_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_Ruleset()) ) {s = 15;}

                        else if ( (synpred9_Ruleset()) ) {s = 16;}

                         
                        input.seek(index51_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA51_3 = input.LA(1);

                         
                        int index51_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_Ruleset()) ) {s = 17;}

                        else if ( (synpred11_Ruleset()) ) {s = 18;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index51_3);
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
    static final String DFA55_eotS =
        "\20\uffff";
    static final String DFA55_eofS =
        "\20\uffff";
    static final String DFA55_minS =
        "\1\4\5\uffff\1\0\11\uffff";
    static final String DFA55_maxS =
        "\1\u0087\5\uffff\1\0\11\uffff";
    static final String DFA55_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\7\1\10\1\uffff\1\12\1\13"+
        "\1\15\1\6\1\11\1\14";
    static final String DFA55_specialS =
        "\6\uffff\1\0\11\uffff}>";
    static final String[] DFA55_transitionS = {
            "\1\6\1\1\2\uffff\1\3\2\uffff\1\2\10\uffff\1\13\44\uffff\1\14"+
            "\56\uffff\1\4\1\5\1\12\1\uffff\2\10\30\uffff\2\7",
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

    static final short[] DFA55_eot = DFA.unpackEncodedString(DFA55_eotS);
    static final short[] DFA55_eof = DFA.unpackEncodedString(DFA55_eofS);
    static final char[] DFA55_min = DFA.unpackEncodedStringToUnsignedChars(DFA55_minS);
    static final char[] DFA55_max = DFA.unpackEncodedStringToUnsignedChars(DFA55_maxS);
    static final short[] DFA55_accept = DFA.unpackEncodedString(DFA55_acceptS);
    static final short[] DFA55_special = DFA.unpackEncodedString(DFA55_specialS);
    static final short[][] DFA55_transition;

    static {
        int numStates = DFA55_transitionS.length;
        DFA55_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA55_transition[i] = DFA.unpackEncodedString(DFA55_transitionS[i]);
        }
    }

    class DFA55 extends DFA {

        public DFA55(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 55;
            this.eot = DFA55_eot;
            this.eof = DFA55_eof;
            this.min = DFA55_min;
            this.max = DFA55_max;
            this.accept = DFA55_accept;
            this.special = DFA55_special;
            this.transition = DFA55_transition;
        }
        public String getDescription() {
            return "406:1: factor options {backtrack=true; } : ( INT | STRING | REGEXP | 'true' | 'false' | ID '[' expr ']' | persistent_var | trail_exp | function_app | '[' expr ',' ']' | '{' ( hash_line ( ',' )? )* '}' | ID | '(' expr ')' );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA55_6 = input.LA(1);

                         
                        int index55_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_Ruleset()) ) {s = 13;}

                        else if ( (synpred20_Ruleset()) ) {s = 14;}

                        else if ( (synpred23_Ruleset()) ) {s = 15;}

                         
                        input.seek(index55_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 55, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA70_eotS =
        "\12\uffff";
    static final String DFA70_eofS =
        "\12\uffff";
    static final String DFA70_minS =
        "\1\u00a1\6\uffff\1\123\2\uffff";
    static final String DFA70_maxS =
        "\1\u00b4\6\uffff\1\u00ab\2\uffff";
    static final String DFA70_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\7\1\10";
    static final String DFA70_specialS =
        "\12\uffff}>";
    static final String[] DFA70_transitionS = {
            "\1\3\1\4\6\uffff\1\7\3\uffff\1\2\1\5\2\uffff\1\6\2\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\11\126\uffff\1\10\1\11",
            "",
            ""
    };

    static final short[] DFA70_eot = DFA.unpackEncodedString(DFA70_eotS);
    static final short[] DFA70_eof = DFA.unpackEncodedString(DFA70_eofS);
    static final char[] DFA70_min = DFA.unpackEncodedStringToUnsignedChars(DFA70_minS);
    static final char[] DFA70_max = DFA.unpackEncodedStringToUnsignedChars(DFA70_maxS);
    static final short[] DFA70_accept = DFA.unpackEncodedString(DFA70_acceptS);
    static final short[] DFA70_special = DFA.unpackEncodedString(DFA70_specialS);
    static final short[][] DFA70_transition;

    static {
        int numStates = DFA70_transitionS.length;
        DFA70_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA70_transition[i] = DFA.unpackEncodedString(DFA70_transitionS[i]);
        }
    }

    class DFA70 extends DFA {

        public DFA70(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 70;
            this.eot = DFA70_eot;
            this.eof = DFA70_eof;
            this.min = DFA70_min;
            this.max = DFA70_max;
            this.accept = DFA70_accept;
            this.special = DFA70_special;
            this.transition = DFA70_transition;
        }
        public String getDescription() {
            return "529:1: pragma[HashMap keys_map] : ( desc_block | meta_name | 'author' author= STRING | 'key' what= ( 'errorstack' | 'googleanalytics' | 'twitter' | 'amazon' | 'kpds' | 'google' | ID ) key_value[key_values] | authz_pragma | logging_pargma | 'use' 'module' ID ( alias )? | 'use' ( 'css' | 'javascript' ) 'resource' location );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
 

    public static final BitSet FOLLOW_19_in_ruleset663 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rulesetname_in_ruleset665 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleset669 = new BitSet(new long[]{0x0000000000440000L,0x0000000000010000L,0x0000000120000000L});
    public static final BitSet FOLLOW_meta_block_in_ruleset677 = new BitSet(new long[]{0x0000000000640000L,0x0000000000010000L,0x0000000120000000L});
    public static final BitSet FOLLOW_comment_in_ruleset682 = new BitSet(new long[]{0x0000000000640000L,0x0000000000010000L,0x0000000120000000L});
    public static final BitSet FOLLOW_dispatch_block_in_ruleset689 = new BitSet(new long[]{0x0000000000640000L,0x0000000000010000L,0x0000000120000000L});
    public static final BitSet FOLLOW_global_decls_in_ruleset697 = new BitSet(new long[]{0x0000000000640000L,0x0000000000010000L,0x0000000120000000L});
    public static final BitSet FOLLOW_rule_in_ruleset705 = new BitSet(new long[]{0x0000000000640000L,0x0000000000010000L,0x0000000120000000L});
    public static final BitSet FOLLOW_21_in_ruleset712 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_ruleset714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CMT_in_comment800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_rulesetname0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule852 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_rule854 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rule856 = new BitSet(new long[]{0x00E0000000000000L});
    public static final BitSet FOLLOW_rule_state_in_rule858 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rule860 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_select_clause_in_rule863 = new BitSet(new long[]{0xC000000020000010L,0x0000000000000001L,0x0000000000000100L});
    public static final BitSet FOLLOW_pre_block_in_rule865 = new BitSet(new long[]{0xC000000020000010L,0x0000000000000001L,0x0000000000000100L});
    public static final BitSet FOLLOW_emit_block_in_rule868 = new BitSet(new long[]{0xC000000020000010L,0x0000000000000001L,0x0000000000000100L});
    public static final BitSet FOLLOW_action_in_rule872 = new BitSet(new long[]{0x000000004F200000L});
    public static final BitSet FOLLOW_24_in_rule874 = new BitSet(new long[]{0x000000004E200000L});
    public static final BitSet FOLLOW_callbacks_in_rule878 = new BitSet(new long[]{0x000000000E200000L});
    public static final BitSet FOLLOW_post_block_in_rule881 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rule885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_post_in_post_block901 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_post_block903 = new BitSet(new long[]{0x000385A000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_post_statement_in_post_block905 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_post_block907 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_post_block909 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_post_block911 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_post_alternate_in_post_block913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_post0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_post_alternate944 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_post_alternate946 = new BitSet(new long[]{0x000385A000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_post_statement_in_post_alternate948 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_post_alternate950 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_post_alternate952 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_post_alternate954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_persistent_expr_in_post_statement961 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_post_statement964 = new BitSet(new long[]{0x0200000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_post_statement966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_log_statement_in_post_statement973 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_post_statement976 = new BitSet(new long[]{0x0200000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_post_statement978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_control_statement_in_post_statement985 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_post_statement988 = new BitSet(new long[]{0x0200000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_post_statement990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_raise_statement_in_post_statement997 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_post_statement1000 = new BitSet(new long[]{0x0200000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_post_statement1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_callbacks1014 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_callbacks1016 = new BitSet(new long[]{0x0000000180200000L});
    public static final BitSet FOLLOW_success_in_callbacks1018 = new BitSet(new long[]{0x0000000100200000L});
    public static final BitSet FOLLOW_failure_in_callbacks1021 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_callbacks1024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_success1031 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_success1033 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_click_in_success1035 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_24_in_success1037 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_success1040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_failure1047 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_failure1049 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_click_in_failure1051 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_24_in_failure1053 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_failure1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_click1065 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_click1073 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_click1075 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_click1077 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_click_link_in_click1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_click_link1087 = new BitSet(new long[]{0x000005A000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_persistent_expr_in_click_link1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_persistent_clear_in_persistent_expr1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_persistent_set_in_persistent_expr1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_persistent_iterate_in_persistent_expr1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_trail_forget_in_persistent_expr1118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_trail_mark_in_persistent_expr1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_persistent_clear1133 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_var_domain_in_persistent_clear1135 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_persistent_clear1137 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_persistent_clear1139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_persistent_set1146 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_var_domain_in_persistent_set1148 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_persistent_set1150 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_persistent_set1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_domain_in_persistent_iterate1159 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_persistent_iterate1161 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_persistent_iterate1163 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_counter_op_in_persistent_iterate1165 = new BitSet(new long[]{0x0200000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_persistent_iterate1167 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_counter_start_in_persistent_iterate1169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_trail_forget1176 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_trail_forget1178 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_trail_forget1180 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_var_domain_in_trail_forget1182 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_trail_forget1184 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_trail_forget1186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_trail_mark1193 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_var_domain_in_trail_mark1195 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_trail_mark1197 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_trail_mark1199 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_trail_with_in_trail_mark1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_trail_with1208 = new BitSet(new long[]{0x0200000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_trail_with1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_counter_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_counter_start1239 = new BitSet(new long[]{0x0200000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_counter_start1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_log_statement1249 = new BitSet(new long[]{0x0200000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_log_statement1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_control_statement1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_raise_statement1265 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_raise_statement1267 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_raise_statement1269 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_raise_statement1271 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_for_clause_in_raise_statement1273 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_modifier_clause_in_raise_statement1275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_for_clause1282 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_for_clause1284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_rule_state0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_action_in_action1356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unconditional_action_in_action1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_conditional_action1374 = new BitSet(new long[]{0x0200000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_conditional_action1376 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_conditional_action1378 = new BitSet(new long[]{0xC000000020000010L,0x0000000000000001L,0x0000000000000100L});
    public static final BitSet FOLLOW_unconditional_action_in_conditional_action1380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primrule_in_unconditional_action1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actionblock_in_unconditional_action1397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule_label_in_primrule1422 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_namespace_in_primrule1425 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_primrule1428 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_primrule1430 = new BitSet(new long[]{0x0A00000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_primrule1433 = new BitSet(new long[]{0x0E00000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_58_in_primrule1435 = new BitSet(new long[]{0x0A00000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_59_in_primrule1440 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_modifier_clause_in_primrule1442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule_label_in_primrule1455 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_emit_block_in_primrule1458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_rule_label1481 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_rule_label1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_modifier_clause1504 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_modifier_in_modifier_clause1506 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_modifier_clause1509 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_modifier_in_modifier_clause1511 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_ID_in_modifier1526 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_modifier1528 = new BitSet(new long[]{0x0200000000120930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_modifier1531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JS_in_modifier1535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blocktype_in_actionblock1550 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_actionblock1552 = new BitSet(new long[]{0x0000000000200010L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_primrule_in_actionblock1555 = new BitSet(new long[]{0x0000000001200010L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_24_in_actionblock1557 = new BitSet(new long[]{0x0000000000200010L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_21_in_actionblock1562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_blocktype0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_pre_block1604 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_pre_block1606 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_decl_in_pre_block1609 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_24_in_pre_block1611 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_pre_block1615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_foreach1635 = new BitSet(new long[]{0x0200000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_foreach1637 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_setting_in_foreach1639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_select_clause1658 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_using_in_select_clause1661 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_when_in_select_clause1663 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_foreach_in_select_clause1666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_using1680 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_using1682 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_setting_in_using1684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_when1691 = new BitSet(new long[]{0x0200000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_event_seq_in_when1693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_event_or_in_event_seq1714 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_event_seq1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_event_or_in_event_seq1721 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_event_seq1723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_event_or_in_event_seq1728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_event_and_in_event_or1739 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_event_or1742 = new BitSet(new long[]{0x0200000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_event_and_in_event_or1744 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_event_btwn_in_event_and1755 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_event_and1758 = new BitSet(new long[]{0x0200000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_event_btwn_in_event_and1760 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_event_prim_in_event_btwn1773 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_event_btwn1776 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_event_btwn1779 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_event_btwn1781 = new BitSet(new long[]{0x0200000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_event_seq_in_event_btwn1783 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_event_btwn1785 = new BitSet(new long[]{0x0200000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_event_seq_in_event_btwn1787 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_event_btwn1789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_event_domain_in_event_prim1804 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_event_prim1806 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_set_in_event_prim1808 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_setting_in_event_prim1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_event_domain_in_event_prim1819 = new BitSet(new long[]{0x0000000600000000L,0x0000000000001C00L});
    public static final BitSet FOLLOW_set_in_event_prim1821 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_event_prim1833 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_on_expr_in_event_prim1835 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_setting_in_event_prim1838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_event_prim1843 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_event_prim1845 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_event_filter_in_event_prim1847 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_setting_in_event_prim1849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_event_prim1854 = new BitSet(new long[]{0x0200000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_event_seq_in_event_prim1856 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_event_prim1858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_setting1869 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_setting1871 = new BitSet(new long[]{0x0800000000000010L});
    public static final BitSet FOLLOW_ID_in_setting1874 = new BitSet(new long[]{0x0C00000000000010L});
    public static final BitSet FOLLOW_58_in_setting1876 = new BitSet(new long[]{0x0800000000000010L});
    public static final BitSet FOLLOW_59_in_setting1881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_event_domain1891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_event_filter1905 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_set_in_event_filter1907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_on_expr1925 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_set_in_on_expr1927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_global_decls1951 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_global_decls1953 = new BitSet(new long[]{0x0000000000000010L,0x00000000000A0000L,0x0000000000000300L});
    public static final BitSet FOLLOW_global_in_global_decls1957 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_global_decls1959 = new BitSet(new long[]{0x0000000000200010L,0x00000000000A0000L,0x0000000000000300L});
    public static final BitSet FOLLOW_21_in_global_decls1964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emit_block_in_global1980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dataset_in_global1984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_datasource_in_global1988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_css_emit_in_global1992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decl_in_global1996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_datasource2008 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_datasource2010 = new BitSet(new long[]{0x0000004000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_datatype_in_datasource2012 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_datasource2015 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_datasource2017 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_cachable_in_datasource2019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_css_emit2031 = new BitSet(new long[]{0x0000000000010800L});
    public static final BitSet FOLLOW_set_in_css_emit2033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_decl2067 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_decl2069 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_HTML_in_decl2071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_decl2076 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_decl2078 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_JS_in_decl2080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_decl2085 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_decl2087 = new BitSet(new long[]{0x0200000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_decl2089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_def_in_expr2119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_expression_in_expr2123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_function_def2148 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_function_def2150 = new BitSet(new long[]{0x0800000000000010L});
    public static final BitSet FOLLOW_ID_in_function_def2153 = new BitSet(new long[]{0x0C00000000000010L});
    public static final BitSet FOLLOW_58_in_function_def2155 = new BitSet(new long[]{0x0800000000000010L});
    public static final BitSet FOLLOW_59_in_function_def2160 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_function_def2162 = new BitSet(new long[]{0x0200000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_fundecls_in_function_def2164 = new BitSet(new long[]{0x0200000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_function_def2167 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_24_in_function_def2169 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_function_def2172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decl_in_fundecls2196 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_fundecls2198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_disjunction_in_conditional_expression2224 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_conditional_expression2226 = new BitSet(new long[]{0x0200000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_conditional_expression2228 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_conditional_expression2230 = new BitSet(new long[]{0x0200000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_conditional_expression2232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_disjunction_in_conditional_expression2236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conjunction_in_disjunction2249 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_disjunction2252 = new BitSet(new long[]{0x0200000000100930L,0x0000374000000080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_conjunction_in_disjunction2254 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_equality_expr_in_conjunction2270 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_conjunction2273 = new BitSet(new long[]{0x0200000000100930L,0x0000374000000080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_equality_expr_in_conjunction2275 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_add_expr_in_equality_expr2290 = new BitSet(new long[]{0x0000000000000002L,0x00000001FF000000L});
    public static final BitSet FOLLOW_predop_in_equality_expr2293 = new BitSet(new long[]{0x0200000000100930L,0x0000374000000080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_add_expr_in_equality_expr2295 = new BitSet(new long[]{0x0000000000000002L,0x00000001FF000000L});
    public static final BitSet FOLLOW_set_in_predop0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mult_expr_in_add_expr2350 = new BitSet(new long[]{0x0000000000000002L,0x0000000600000000L});
    public static final BitSet FOLLOW_add_op_in_add_expr2353 = new BitSet(new long[]{0x0200000000100930L,0x0000374000000080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_mult_expr_in_add_expr2355 = new BitSet(new long[]{0x0000000000000002L,0x0000000600000000L});
    public static final BitSet FOLLOW_set_in_add_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_expr_in_mult_expr2377 = new BitSet(new long[]{0x0000000000000002L,0x0000003800000000L});
    public static final BitSet FOLLOW_mult_op_in_mult_expr2380 = new BitSet(new long[]{0x0200000000100930L,0x0000374000000080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_unary_expr_in_mult_expr2382 = new BitSet(new long[]{0x0000000000000002L,0x0000003800000000L});
    public static final BitSet FOLLOW_set_in_mult_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_unary_expr2417 = new BitSet(new long[]{0x0200000000100930L,0x0000374000000080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_unary_expr_in_unary_expr2419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_unary_expr2425 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_unary_expr2427 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_unary_expr2429 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_var_domain_in_unary_expr2431 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_unary_expr2433 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_unary_expr2435 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_timeframe_in_unary_expr2437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_unary_expr2442 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_unary_expr2444 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000020L});
    public static final BitSet FOLLOW_set_in_unary_expr2446 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_unary_expr2454 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_unary_expr2456 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_var_domain_in_unary_expr2458 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_unary_expr2460 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_unary_expr2462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_domain_in_unary_expr2467 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_unary_expr2469 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_unary_expr2471 = new BitSet(new long[]{0x0000000000000000L,0x00000001FF000000L});
    public static final BitSet FOLLOW_predop_in_unary_expr2473 = new BitSet(new long[]{0x0200000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_unary_expr2475 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_timeframe_in_unary_expr2477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_domain_in_unary_expr2482 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_unary_expr2484 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_unary_expr2486 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_timeframe_in_unary_expr2488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operator_expr_in_unary_expr2493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_operator_expr2507 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_operator_in_operator_expr2509 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_INT_in_factor2534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_factor2544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REGEXP_in_factor2554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_factor2564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_factor2574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_factor2584 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_factor2586 = new BitSet(new long[]{0x0200000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_factor2588 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_factor2590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_persistent_var_in_factor2600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_trail_exp_in_factor2610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_app_in_factor2620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_factor2630 = new BitSet(new long[]{0x0200000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_factor2632 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_factor2634 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_factor2636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_factor2646 = new BitSet(new long[]{0x0000000000200800L});
    public static final BitSet FOLLOW_hash_line_in_factor2649 = new BitSet(new long[]{0x0400000000200800L});
    public static final BitSet FOLLOW_58_in_factor2651 = new BitSet(new long[]{0x0000000000200800L});
    public static final BitSet FOLLOW_21_in_factor2656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_factor2666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_factor2677 = new BitSet(new long[]{0x0200000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_factor2679 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_factor2681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_hash_line2694 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_hash_line2696 = new BitSet(new long[]{0x0200000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_hash_line2698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namespace_in_function_app2711 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_function_app2713 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_function_app2715 = new BitSet(new long[]{0x0A00000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_function_app2718 = new BitSet(new long[]{0x0E00000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_58_in_function_app2720 = new BitSet(new long[]{0x0A00000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_59_in_function_app2725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_function_app2731 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_function_app2733 = new BitSet(new long[]{0x0A00000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_function_app2736 = new BitSet(new long[]{0x0E00000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_58_in_function_app2738 = new BitSet(new long[]{0x0A00000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_59_in_function_app2743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_namespace2755 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_namespace2757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_trail_exp2769 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_var_domain_in_trail_exp2771 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_trail_exp2773 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_trail_exp2775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_trail_exp2780 = new BitSet(new long[]{0x0200000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_trail_exp2782 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_var_domain_in_trail_exp2784 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_trail_exp2786 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_trail_exp2788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_domain_in_persistent_var2802 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_persistent_var2804 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_persistent_var2806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_operator2818 = new BitSet(new long[]{0x0000000000000000L,0xFFFF800000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_operator_op_in_operator2820 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_operator2822 = new BitSet(new long[]{0x0200000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_operator2824 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_58_in_operator2826 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_operator2829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operator_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_timeframe2939 = new BitSet(new long[]{0x0200000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_timeframe2941 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000001FFF8000L});
    public static final BitSet FOLLOW_periods_in_timeframe2944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_period_in_timeframe2948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_var_domain0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_emit_block2975 = new BitSet(new long[]{0x0000000000030800L});
    public static final BitSet FOLLOW_set_in_emit_block2977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_dataset2995 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_dataset2997 = new BitSet(new long[]{0x0000004000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_datatype_in_dataset2999 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_dataset3002 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_dataset3004 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_cachable_in_dataset3006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_datatype3016 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000003C00L});
    public static final BitSet FOLLOW_set_in_datatype3018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_142_in_cachable3035 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_cachetime_in_cachable3037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_cachetime3048 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_INT_in_cachetime3050 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000001FFF8000L});
    public static final BitSet FOLLOW_periods_in_cachetime3053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_period_in_cachetime3055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_periods0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_period0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_157_in_dispatch_block3190 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_dispatch_block3192 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_dispatch_in_dispatch_block3194 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_21_in_dispatch_block3197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_158_in_dispatch3206 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_dispatch3208 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_dispatch_target_in_dispatch3210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_159_in_dispatch_target3222 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_dispatch_target3224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_160_in_meta_block3259 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_meta_block3261 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000000L,0x0012620600000000L});
    public static final BitSet FOLLOW_pragma_in_meta_block3263 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000000L,0x0012620600000000L});
    public static final BitSet FOLLOW_21_in_meta_block3267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_desc_block_in_pragma3291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_meta_name_in_pragma3297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_161_in_pragma3302 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_pragma3306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_162_in_pragma3315 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000000L,0x000001F800000000L});
    public static final BitSet FOLLOW_set_in_pragma3319 = new BitSet(new long[]{0x0000000000100800L});
    public static final BitSet FOLLOW_key_value_in_pragma3337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_authz_pragma_in_pragma3346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logging_pargma_in_pragma3351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_169_in_pragma3356 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_170_in_pragma3358 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_pragma3360 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_alias_in_pragma3362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_169_in_pragma3368 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000080000000000L});
    public static final BitSet FOLLOW_set_in_pragma3370 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_172_in_pragma3378 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_location_in_pragma3380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_173_in_meta_name3394 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_meta_name3398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_174_in_authz_pragma3412 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_175_in_authz_pragma3414 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_176_in_authz_pragma3416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_177_in_logging_pargma3428 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L,0x0004000000000000L});
    public static final BitSet FOLLOW_set_in_logging_pargma3430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_179_in_alias3445 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_alias3447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_location0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_180_in_desc_block3471 = new BitSet(new long[]{0x0000000000010800L});
    public static final BitSet FOLLOW_set_in_desc_block3475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_key_value3496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_key_value3500 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_name_value_pair_in_key_value3503 = new BitSet(new long[]{0x0400000000200800L});
    public static final BitSet FOLLOW_58_in_key_value3506 = new BitSet(new long[]{0x0000000000200800L});
    public static final BitSet FOLLOW_21_in_key_value3511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_name_value_pair3534 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_name_value_pair3536 = new BitSet(new long[]{0x00000000000008A0L});
    public static final BitSet FOLLOW_INT_in_name_value_pair3541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_name_value_pair3549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_name_value_pair3557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_event_or_in_synpred1_Ruleset1714 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_synpred1_Ruleset1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_event_or_in_synpred2_Ruleset1721 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_synpred2_Ruleset1723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_disjunction_in_synpred6_Ruleset2224 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_synpred6_Ruleset2226 = new BitSet(new long[]{0x0200000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_synpred6_Ruleset2228 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_synpred6_Ruleset2230 = new BitSet(new long[]{0x0200000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_synpred6_Ruleset2232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_synpred8_Ruleset2425 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_synpred8_Ruleset2427 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_synpred8_Ruleset2429 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_var_domain_in_synpred8_Ruleset2431 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_synpred8_Ruleset2433 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_synpred8_Ruleset2435 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_timeframe_in_synpred8_Ruleset2437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_synpred9_Ruleset2442 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_synpred9_Ruleset2444 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000020L});
    public static final BitSet FOLLOW_set_in_synpred9_Ruleset2446 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_synpred9_Ruleset2454 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_synpred9_Ruleset2456 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_var_domain_in_synpred9_Ruleset2458 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_synpred9_Ruleset2460 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_synpred9_Ruleset2462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_domain_in_synpred10_Ruleset2467 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_synpred10_Ruleset2469 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_synpred10_Ruleset2471 = new BitSet(new long[]{0x0000000000000000L,0x00000001FF000000L});
    public static final BitSet FOLLOW_predop_in_synpred10_Ruleset2473 = new BitSet(new long[]{0x0200000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_synpred10_Ruleset2475 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_timeframe_in_synpred10_Ruleset2477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_domain_in_synpred11_Ruleset2482 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_synpred11_Ruleset2484 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_synpred11_Ruleset2486 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_timeframe_in_synpred11_Ruleset2488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_synpred17_Ruleset2584 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_synpred17_Ruleset2586 = new BitSet(new long[]{0x0200000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_synpred17_Ruleset2588 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_synpred17_Ruleset2590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_app_in_synpred20_Ruleset2620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_synpred23_Ruleset2666 = new BitSet(new long[]{0x0000000000000002L});

}