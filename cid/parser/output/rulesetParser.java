// $ANTLR 3.2 Sep 23, 2009 12:02:23 Ruleset.g 2010-07-14 13:07:43

	package com.kynetx;
	import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class RulesetParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "INT", "EXPONENT", "FLOAT", "REGEXP", "WS", "ESC_SEQ", "STRING", "CHAR", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "HTML", "JS", "CMT", "'ruleset'", "'{'", "'}'", "'rule'", "'is'", "';'", "'fired'", "'always'", "'notfired'", "'else'", "'if'", "'callbacks'", "'success'", "'failure'", "'click'", "'change'", "'='", "'triggers'", "'clear'", "':'", "'set'", "'forget'", "'in'", "'mark'", "'with'", "'+='", "'-='", "'from'", "'log'", "'last'", "'raise'", "'explicit'", "'event'", "'for'", "'active'", "'inactive'", "'test'", "'then'", "'('", "')'", "','", "'=>'", "'and'", "'choose'", "'every'", "'pre'", "'foreach'", "'select'", "'using'", "'when'", "'before'", "'or'", "'not'", "'between'", "'pageview'", "'submit'", "'dblclick'", "'update'", "'setting'", "'web'", "'on'", "'global'", "'datasource'", "'<-'", "'css'", "'function'", "'|'", "'||'", "'&&'", "'<='", "'>='", "'<'", "'>'", "'=='", "'!='", "'eq'", "'neq'", "'like'", "'+'", "'-'", "'*'", "'/'", "'%'", "'seen'", "'after'", "'true'", "'false'", "'['", "']'", "'current'", "'history'", "'.'", "'pick'", "'match'", "'length'", "'replace'", "'as'", "'head'", "'tail'", "'sort'", "'filter'", "'map'", "'uc'", "'lc'", "'split'", "'join'", "'query'", "'has'", "'union'", "'difference'", "'intersection'", "'unique'", "'once'", "'duplicates'", "'within'", "'ent'", "'app'", "'emit'", "'dataset'", "'JSON'", "'XML'", "'RSS'", "'HTML'", "'cachable'", "'years'", "'months'", "'weeks'", "'days'", "'hours'", "'minutes'", "'seconds'", "'year'", "'month'", "'week'", "'day'", "'hour'", "'minute'", "'second'", "'dispatch'", "'domain'", "'->'", "'meta'", "'author'", "'key'", "'errorstack'", "'googleanalytics'", "'twitter'", "'amazon'", "'kpds'", "'google'", "'use'", "'module'", "'javascript'", "'resource'", "'name'", "'authz'", "'require'", "'user'", "'logging'", "'off'", "'alias'", "'description'"
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


        public RulesetParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public RulesetParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return RulesetParser.tokenNames; }
    public String getGrammarFileName() { return "Ruleset.g"; }

     

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
    // Ruleset.g:127:1: ruleset options {backtrack=false; } : ( comment )? 'ruleset' rulesetname '{' ( meta_block | comment | dispatch_block | global_decls | rule )+ '}' EOF ;
    public final RulesetParser.ruleset_return ruleset() throws RecognitionException {
        RulesetParser.ruleset_return retval = new RulesetParser.ruleset_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal2=null;
        Token char_literal4=null;
        Token char_literal10=null;
        Token EOF11=null;
        RulesetParser.comment_return comment1 = null;

        RulesetParser.rulesetname_return rulesetname3 = null;

        RulesetParser.meta_block_return meta_block5 = null;

        RulesetParser.comment_return comment6 = null;

        RulesetParser.dispatch_block_return dispatch_block7 = null;

        RulesetParser.global_decls_return global_decls8 = null;

        RulesetParser.rule_return rule9 = null;


        Object string_literal2_tree=null;
        Object char_literal4_tree=null;
        Object char_literal10_tree=null;
        Object EOF11_tree=null;


        	 current_top = rule_json;

        try {
            // Ruleset.g:134:3: ( ( comment )? 'ruleset' rulesetname '{' ( meta_block | comment | dispatch_block | global_decls | rule )+ '}' EOF )
            // Ruleset.g:134:6: ( comment )? 'ruleset' rulesetname '{' ( meta_block | comment | dispatch_block | global_decls | rule )+ '}' EOF
            {
            root_0 = (Object)adaptor.nil();

            // Ruleset.g:134:6: ( comment )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==REGEXP||LA1_0==CMT) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // Ruleset.g:134:6: comment
                    {
                    pushFollow(FOLLOW_comment_in_ruleset662);
                    comment1=comment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, comment1.getTree());

                    }
                    break;

            }

            string_literal2=(Token)match(input,19,FOLLOW_19_in_ruleset665); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal2_tree = (Object)adaptor.create(string_literal2);
            adaptor.addChild(root_0, string_literal2_tree);
            }
            pushFollow(FOLLOW_rulesetname_in_ruleset667);
            rulesetname3=rulesetname();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, rulesetname3.getTree());
            if ( state.backtracking==0 ) {
               current_top.put("ruleset_name",(rulesetname3!=null?input.toString(rulesetname3.start,rulesetname3.stop):null)); 
            }
            char_literal4=(Token)match(input,20,FOLLOW_20_in_ruleset671); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal4_tree = (Object)adaptor.create(char_literal4);
            adaptor.addChild(root_0, char_literal4_tree);
            }
            // Ruleset.g:135:4: ( meta_block | comment | dispatch_block | global_decls | rule )+
            int cnt2=0;
            loop2:
            do {
                int alt2=6;
                switch ( input.LA(1) ) {
                case 160:
                    {
                    alt2=1;
                    }
                    break;
                case REGEXP:
                case CMT:
                    {
                    alt2=2;
                    }
                    break;
                case 157:
                    {
                    alt2=3;
                    }
                    break;
                case 80:
                    {
                    alt2=4;
                    }
                    break;
                case 22:
                    {
                    alt2=5;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // Ruleset.g:135:6: meta_block
            	    {
            	    pushFollow(FOLLOW_meta_block_in_ruleset679);
            	    meta_block5=meta_block();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, meta_block5.getTree());

            	    }
            	    break;
            	case 2 :
            	    // Ruleset.g:135:20: comment
            	    {
            	    pushFollow(FOLLOW_comment_in_ruleset684);
            	    comment6=comment();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, comment6.getTree());

            	    }
            	    break;
            	case 3 :
            	    // Ruleset.g:136:6: dispatch_block
            	    {
            	    pushFollow(FOLLOW_dispatch_block_in_ruleset691);
            	    dispatch_block7=dispatch_block();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, dispatch_block7.getTree());

            	    }
            	    break;
            	case 4 :
            	    // Ruleset.g:137:6: global_decls
            	    {
            	    pushFollow(FOLLOW_global_decls_in_ruleset699);
            	    global_decls8=global_decls();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, global_decls8.getTree());

            	    }
            	    break;
            	case 5 :
            	    // Ruleset.g:138:6: rule
            	    {
            	    pushFollow(FOLLOW_rule_in_ruleset707);
            	    rule9=rule();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, rule9.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            char_literal10=(Token)match(input,21,FOLLOW_21_in_ruleset714); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal10_tree = (Object)adaptor.create(char_literal10);
            adaptor.addChild(root_0, char_literal10_tree);
            }
            EOF11=(Token)match(input,EOF,FOLLOW_EOF_in_ruleset716); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EOF11_tree = (Object)adaptor.create(EOF11);
            adaptor.addChild(root_0, EOF11_tree);
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
        }
        return retval;
    }
    // $ANTLR end "ruleset"

    public static class mult_line_comment_or_regx_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mult_line_comment_or_regx"
    // Ruleset.g:151:1: mult_line_comment_or_regx : REGEXP ;
    public final RulesetParser.mult_line_comment_or_regx_return mult_line_comment_or_regx() throws RecognitionException {
        RulesetParser.mult_line_comment_or_regx_return retval = new RulesetParser.mult_line_comment_or_regx_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token REGEXP12=null;

        Object REGEXP12_tree=null;

        try {
            // Ruleset.g:152:2: ( REGEXP )
            // Ruleset.g:152:4: REGEXP
            {
            root_0 = (Object)adaptor.nil();

            REGEXP12=(Token)match(input,REGEXP,FOLLOW_REGEXP_in_mult_line_comment_or_regx772); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            REGEXP12_tree = (Object)adaptor.create(REGEXP12);
            adaptor.addChild(root_0, REGEXP12_tree);
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
        return retval;
    }
    // $ANTLR end "mult_line_comment_or_regx"

    public static class single_line_comment_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "single_line_comment"
    // Ruleset.g:154:1: single_line_comment : CMT ;
    public final RulesetParser.single_line_comment_return single_line_comment() throws RecognitionException {
        RulesetParser.single_line_comment_return retval = new RulesetParser.single_line_comment_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CMT13=null;

        Object CMT13_tree=null;

        try {
            // Ruleset.g:155:2: ( CMT )
            // Ruleset.g:155:4: CMT
            {
            root_0 = (Object)adaptor.nil();

            CMT13=(Token)match(input,CMT,FOLLOW_CMT_in_single_line_comment782); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CMT13_tree = (Object)adaptor.create(CMT13);
            adaptor.addChild(root_0, CMT13_tree);
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
        return retval;
    }
    // $ANTLR end "single_line_comment"

    public static class comment_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "comment"
    // Ruleset.g:158:1: comment : ( ( single_line_comment )=> single_line_comment | mult_line_comment_or_regx );
    public final RulesetParser.comment_return comment() throws RecognitionException {
        RulesetParser.comment_return retval = new RulesetParser.comment_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RulesetParser.single_line_comment_return single_line_comment14 = null;

        RulesetParser.mult_line_comment_or_regx_return mult_line_comment_or_regx15 = null;



        try {
            // Ruleset.g:159:5: ( ( single_line_comment )=> single_line_comment | mult_line_comment_or_regx )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==CMT) && (synpred1_Ruleset())) {
                alt3=1;
            }
            else if ( (LA3_0==REGEXP) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // Ruleset.g:159:9: ( single_line_comment )=> single_line_comment
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_single_line_comment_in_comment807);
                    single_line_comment14=single_line_comment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, single_line_comment14.getTree());

                    }
                    break;
                case 2 :
                    // Ruleset.g:159:56: mult_line_comment_or_regx
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_mult_line_comment_or_regx_in_comment811);
                    mult_line_comment_or_regx15=mult_line_comment_or_regx();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, mult_line_comment_or_regx15.getTree());

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
        return retval;
    }
    // $ANTLR end "comment"

    public static class rulesetname_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rulesetname"
    // Ruleset.g:162:1: rulesetname : ( ID | INT );
    public final RulesetParser.rulesetname_return rulesetname() throws RecognitionException {
        RulesetParser.rulesetname_return retval = new RulesetParser.rulesetname_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set16=null;

        Object set16_tree=null;

        try {
            // Ruleset.g:163:2: ( ID | INT )
            // Ruleset.g:
            {
            root_0 = (Object)adaptor.nil();

            set16=(Token)input.LT(1);
            if ( (input.LA(1)>=ID && input.LA(1)<=INT) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set16));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
        return retval;
    }
    // $ANTLR end "rulesetname"

    public static class rule_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rule"
    // Ruleset.g:166:1: rule : 'rule' ID 'is' rule_state '{' select_clause ( pre_block )? ( emit_block )? ( action ( ';' )? ) ( callbacks )? ( post_block )? '}' ;
    public final RulesetParser.rule_return rule() throws RecognitionException {
        RulesetParser.rule_return retval = new RulesetParser.rule_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal17=null;
        Token ID18=null;
        Token string_literal19=null;
        Token char_literal21=null;
        Token char_literal26=null;
        Token char_literal29=null;
        RulesetParser.rule_state_return rule_state20 = null;

        RulesetParser.select_clause_return select_clause22 = null;

        RulesetParser.pre_block_return pre_block23 = null;

        RulesetParser.emit_block_return emit_block24 = null;

        RulesetParser.action_return action25 = null;

        RulesetParser.callbacks_return callbacks27 = null;

        RulesetParser.post_block_return post_block28 = null;


        Object string_literal17_tree=null;
        Object ID18_tree=null;
        Object string_literal19_tree=null;
        Object char_literal21_tree=null;
        Object char_literal26_tree=null;
        Object char_literal29_tree=null;

        try {
            // Ruleset.g:166:6: ( 'rule' ID 'is' rule_state '{' select_clause ( pre_block )? ( emit_block )? ( action ( ';' )? ) ( callbacks )? ( post_block )? '}' )
            // Ruleset.g:166:9: 'rule' ID 'is' rule_state '{' select_clause ( pre_block )? ( emit_block )? ( action ( ';' )? ) ( callbacks )? ( post_block )? '}'
            {
            root_0 = (Object)adaptor.nil();

            string_literal17=(Token)match(input,22,FOLLOW_22_in_rule854); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal17_tree = (Object)adaptor.create(string_literal17);
            adaptor.addChild(root_0, string_literal17_tree);
            }
            ID18=(Token)match(input,ID,FOLLOW_ID_in_rule856); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID18_tree = (Object)adaptor.create(ID18);
            adaptor.addChild(root_0, ID18_tree);
            }
            string_literal19=(Token)match(input,23,FOLLOW_23_in_rule858); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal19_tree = (Object)adaptor.create(string_literal19);
            adaptor.addChild(root_0, string_literal19_tree);
            }
            pushFollow(FOLLOW_rule_state_in_rule860);
            rule_state20=rule_state();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, rule_state20.getTree());
            char_literal21=(Token)match(input,20,FOLLOW_20_in_rule862); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal21_tree = (Object)adaptor.create(char_literal21);
            adaptor.addChild(root_0, char_literal21_tree);
            }
            pushFollow(FOLLOW_select_clause_in_rule865);
            select_clause22=select_clause();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, select_clause22.getTree());
            // Ruleset.g:167:16: ( pre_block )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==64) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // Ruleset.g:167:16: pre_block
                    {
                    pushFollow(FOLLOW_pre_block_in_rule867);
                    pre_block23=pre_block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pre_block23.getTree());

                    }
                    break;

            }

            // Ruleset.g:167:27: ( emit_block )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==136) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==STRING||(LA5_1>=HTML && LA5_1<=JS)) ) {
                    int LA5_3 = input.LA(3);

                    if ( (LA5_3==ID||LA5_3==29||(LA5_3>=62 && LA5_3<=63)||LA5_3==136) ) {
                        alt5=1;
                    }
                }
            }
            switch (alt5) {
                case 1 :
                    // Ruleset.g:167:27: emit_block
                    {
                    pushFollow(FOLLOW_emit_block_in_rule870);
                    emit_block24=emit_block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, emit_block24.getTree());

                    }
                    break;

            }

            // Ruleset.g:167:39: ( action ( ';' )? )
            // Ruleset.g:167:40: action ( ';' )?
            {
            pushFollow(FOLLOW_action_in_rule874);
            action25=action();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, action25.getTree());
            // Ruleset.g:167:47: ( ';' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // Ruleset.g:167:47: ';'
                    {
                    char_literal26=(Token)match(input,24,FOLLOW_24_in_rule876); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal26_tree = (Object)adaptor.create(char_literal26);
                    adaptor.addChild(root_0, char_literal26_tree);
                    }

                    }
                    break;

            }


            }

            // Ruleset.g:167:53: ( callbacks )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==30) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // Ruleset.g:167:53: callbacks
                    {
                    pushFollow(FOLLOW_callbacks_in_rule880);
                    callbacks27=callbacks();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, callbacks27.getTree());

                    }
                    break;

            }

            // Ruleset.g:167:64: ( post_block )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=25 && LA8_0<=27)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // Ruleset.g:167:64: post_block
                    {
                    pushFollow(FOLLOW_post_block_in_rule883);
                    post_block28=post_block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, post_block28.getTree());

                    }
                    break;

            }

            char_literal29=(Token)match(input,21,FOLLOW_21_in_rule887); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal29_tree = (Object)adaptor.create(char_literal29);
            adaptor.addChild(root_0, char_literal29_tree);
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
        return retval;
    }
    // $ANTLR end "rule"

    public static class post_block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "post_block"
    // Ruleset.g:176:1: post_block : post '{' post_statement ';' ';' '}' post_alternate ;
    public final RulesetParser.post_block_return post_block() throws RecognitionException {
        RulesetParser.post_block_return retval = new RulesetParser.post_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal31=null;
        Token char_literal33=null;
        Token char_literal34=null;
        Token char_literal35=null;
        RulesetParser.post_return post30 = null;

        RulesetParser.post_statement_return post_statement32 = null;

        RulesetParser.post_alternate_return post_alternate36 = null;


        Object char_literal31_tree=null;
        Object char_literal33_tree=null;
        Object char_literal34_tree=null;
        Object char_literal35_tree=null;

        try {
            // Ruleset.g:176:11: ( post '{' post_statement ';' ';' '}' post_alternate )
            // Ruleset.g:176:13: post '{' post_statement ';' ';' '}' post_alternate
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_post_in_post_block903);
            post30=post();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, post30.getTree());
            char_literal31=(Token)match(input,20,FOLLOW_20_in_post_block905); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal31_tree = (Object)adaptor.create(char_literal31);
            adaptor.addChild(root_0, char_literal31_tree);
            }
            pushFollow(FOLLOW_post_statement_in_post_block907);
            post_statement32=post_statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, post_statement32.getTree());
            char_literal33=(Token)match(input,24,FOLLOW_24_in_post_block909); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal33_tree = (Object)adaptor.create(char_literal33);
            adaptor.addChild(root_0, char_literal33_tree);
            }
            char_literal34=(Token)match(input,24,FOLLOW_24_in_post_block911); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal34_tree = (Object)adaptor.create(char_literal34);
            adaptor.addChild(root_0, char_literal34_tree);
            }
            char_literal35=(Token)match(input,21,FOLLOW_21_in_post_block913); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal35_tree = (Object)adaptor.create(char_literal35);
            adaptor.addChild(root_0, char_literal35_tree);
            }
            pushFollow(FOLLOW_post_alternate_in_post_block915);
            post_alternate36=post_alternate();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, post_alternate36.getTree());

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
        return retval;
    }
    // $ANTLR end "post_block"

    public static class post_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "post"
    // Ruleset.g:178:1: post : ( 'fired' | 'always' | 'notfired' );
    public final RulesetParser.post_return post() throws RecognitionException {
        RulesetParser.post_return retval = new RulesetParser.post_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set37=null;

        Object set37_tree=null;

        try {
            // Ruleset.g:178:5: ( 'fired' | 'always' | 'notfired' )
            // Ruleset.g:
            {
            root_0 = (Object)adaptor.nil();

            set37=(Token)input.LT(1);
            if ( (input.LA(1)>=25 && input.LA(1)<=27) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set37));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
        return retval;
    }
    // $ANTLR end "post"

    public static class post_alternate_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "post_alternate"
    // Ruleset.g:183:1: post_alternate : 'else' '{' post_statement ';' ';' '}' ;
    public final RulesetParser.post_alternate_return post_alternate() throws RecognitionException {
        RulesetParser.post_alternate_return retval = new RulesetParser.post_alternate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal38=null;
        Token char_literal39=null;
        Token char_literal41=null;
        Token char_literal42=null;
        Token char_literal43=null;
        RulesetParser.post_statement_return post_statement40 = null;


        Object string_literal38_tree=null;
        Object char_literal39_tree=null;
        Object char_literal41_tree=null;
        Object char_literal42_tree=null;
        Object char_literal43_tree=null;

        try {
            // Ruleset.g:183:15: ( 'else' '{' post_statement ';' ';' '}' )
            // Ruleset.g:183:17: 'else' '{' post_statement ';' ';' '}'
            {
            root_0 = (Object)adaptor.nil();

            string_literal38=(Token)match(input,28,FOLLOW_28_in_post_alternate946); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal38_tree = (Object)adaptor.create(string_literal38);
            adaptor.addChild(root_0, string_literal38_tree);
            }
            char_literal39=(Token)match(input,20,FOLLOW_20_in_post_alternate948); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal39_tree = (Object)adaptor.create(char_literal39);
            adaptor.addChild(root_0, char_literal39_tree);
            }
            pushFollow(FOLLOW_post_statement_in_post_alternate950);
            post_statement40=post_statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, post_statement40.getTree());
            char_literal41=(Token)match(input,24,FOLLOW_24_in_post_alternate952); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal41_tree = (Object)adaptor.create(char_literal41);
            adaptor.addChild(root_0, char_literal41_tree);
            }
            char_literal42=(Token)match(input,24,FOLLOW_24_in_post_alternate954); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal42_tree = (Object)adaptor.create(char_literal42);
            adaptor.addChild(root_0, char_literal42_tree);
            }
            char_literal43=(Token)match(input,21,FOLLOW_21_in_post_alternate956); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal43_tree = (Object)adaptor.create(char_literal43);
            adaptor.addChild(root_0, char_literal43_tree);
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
        return retval;
    }
    // $ANTLR end "post_alternate"

    public static class post_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "post_statement"
    // Ruleset.g:185:1: post_statement : ( persistent_expr ( 'if' expr ) | log_statement ( 'if' expr ) | control_statement ( 'if' expr ) | raise_statement ( 'if' expr ) );
    public final RulesetParser.post_statement_return post_statement() throws RecognitionException {
        RulesetParser.post_statement_return retval = new RulesetParser.post_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal45=null;
        Token string_literal48=null;
        Token string_literal51=null;
        Token string_literal54=null;
        RulesetParser.persistent_expr_return persistent_expr44 = null;

        RulesetParser.expr_return expr46 = null;

        RulesetParser.log_statement_return log_statement47 = null;

        RulesetParser.expr_return expr49 = null;

        RulesetParser.control_statement_return control_statement50 = null;

        RulesetParser.expr_return expr52 = null;

        RulesetParser.raise_statement_return raise_statement53 = null;

        RulesetParser.expr_return expr55 = null;


        Object string_literal45_tree=null;
        Object string_literal48_tree=null;
        Object string_literal51_tree=null;
        Object string_literal54_tree=null;

        try {
            // Ruleset.g:185:15: ( persistent_expr ( 'if' expr ) | log_statement ( 'if' expr ) | control_statement ( 'if' expr ) | raise_statement ( 'if' expr ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 37:
            case 39:
            case 40:
            case 42:
            case 134:
            case 135:
                {
                alt9=1;
                }
                break;
            case 47:
                {
                alt9=2;
                }
                break;
            case 48:
                {
                alt9=3;
                }
                break;
            case 49:
                {
                alt9=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // Ruleset.g:185:17: persistent_expr ( 'if' expr )
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_persistent_expr_in_post_statement963);
                    persistent_expr44=persistent_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, persistent_expr44.getTree());
                    // Ruleset.g:185:33: ( 'if' expr )
                    // Ruleset.g:185:34: 'if' expr
                    {
                    string_literal45=(Token)match(input,29,FOLLOW_29_in_post_statement966); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal45_tree = (Object)adaptor.create(string_literal45);
                    adaptor.addChild(root_0, string_literal45_tree);
                    }
                    pushFollow(FOLLOW_expr_in_post_statement968);
                    expr46=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr46.getTree());

                    }


                    }
                    break;
                case 2 :
                    // Ruleset.g:186:5: log_statement ( 'if' expr )
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_log_statement_in_post_statement975);
                    log_statement47=log_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, log_statement47.getTree());
                    // Ruleset.g:186:19: ( 'if' expr )
                    // Ruleset.g:186:20: 'if' expr
                    {
                    string_literal48=(Token)match(input,29,FOLLOW_29_in_post_statement978); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal48_tree = (Object)adaptor.create(string_literal48);
                    adaptor.addChild(root_0, string_literal48_tree);
                    }
                    pushFollow(FOLLOW_expr_in_post_statement980);
                    expr49=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr49.getTree());

                    }


                    }
                    break;
                case 3 :
                    // Ruleset.g:187:5: control_statement ( 'if' expr )
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_control_statement_in_post_statement987);
                    control_statement50=control_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, control_statement50.getTree());
                    // Ruleset.g:187:23: ( 'if' expr )
                    // Ruleset.g:187:24: 'if' expr
                    {
                    string_literal51=(Token)match(input,29,FOLLOW_29_in_post_statement990); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal51_tree = (Object)adaptor.create(string_literal51);
                    adaptor.addChild(root_0, string_literal51_tree);
                    }
                    pushFollow(FOLLOW_expr_in_post_statement992);
                    expr52=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr52.getTree());

                    }


                    }
                    break;
                case 4 :
                    // Ruleset.g:188:5: raise_statement ( 'if' expr )
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_raise_statement_in_post_statement999);
                    raise_statement53=raise_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, raise_statement53.getTree());
                    // Ruleset.g:188:21: ( 'if' expr )
                    // Ruleset.g:188:22: 'if' expr
                    {
                    string_literal54=(Token)match(input,29,FOLLOW_29_in_post_statement1002); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal54_tree = (Object)adaptor.create(string_literal54);
                    adaptor.addChild(root_0, string_literal54_tree);
                    }
                    pushFollow(FOLLOW_expr_in_post_statement1004);
                    expr55=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr55.getTree());

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
        return retval;
    }
    // $ANTLR end "post_statement"

    public static class callbacks_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "callbacks"
    // Ruleset.g:192:1: callbacks : 'callbacks' '{' ( success )? ( failure )? '}' ;
    public final RulesetParser.callbacks_return callbacks() throws RecognitionException {
        RulesetParser.callbacks_return retval = new RulesetParser.callbacks_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal56=null;
        Token char_literal57=null;
        Token char_literal60=null;
        RulesetParser.success_return success58 = null;

        RulesetParser.failure_return failure59 = null;


        Object string_literal56_tree=null;
        Object char_literal57_tree=null;
        Object char_literal60_tree=null;

        try {
            // Ruleset.g:192:10: ( 'callbacks' '{' ( success )? ( failure )? '}' )
            // Ruleset.g:192:12: 'callbacks' '{' ( success )? ( failure )? '}'
            {
            root_0 = (Object)adaptor.nil();

            string_literal56=(Token)match(input,30,FOLLOW_30_in_callbacks1016); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal56_tree = (Object)adaptor.create(string_literal56);
            adaptor.addChild(root_0, string_literal56_tree);
            }
            char_literal57=(Token)match(input,20,FOLLOW_20_in_callbacks1018); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal57_tree = (Object)adaptor.create(char_literal57);
            adaptor.addChild(root_0, char_literal57_tree);
            }
            // Ruleset.g:192:28: ( success )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==31) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // Ruleset.g:192:28: success
                    {
                    pushFollow(FOLLOW_success_in_callbacks1020);
                    success58=success();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, success58.getTree());

                    }
                    break;

            }

            // Ruleset.g:192:37: ( failure )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==32) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // Ruleset.g:192:37: failure
                    {
                    pushFollow(FOLLOW_failure_in_callbacks1023);
                    failure59=failure();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, failure59.getTree());

                    }
                    break;

            }

            char_literal60=(Token)match(input,21,FOLLOW_21_in_callbacks1026); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal60_tree = (Object)adaptor.create(char_literal60);
            adaptor.addChild(root_0, char_literal60_tree);
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
        return retval;
    }
    // $ANTLR end "callbacks"

    public static class success_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "success"
    // Ruleset.g:194:1: success : 'success' '{' click ( ';' )? '}' ;
    public final RulesetParser.success_return success() throws RecognitionException {
        RulesetParser.success_return retval = new RulesetParser.success_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal61=null;
        Token char_literal62=null;
        Token char_literal64=null;
        Token char_literal65=null;
        RulesetParser.click_return click63 = null;


        Object string_literal61_tree=null;
        Object char_literal62_tree=null;
        Object char_literal64_tree=null;
        Object char_literal65_tree=null;

        try {
            // Ruleset.g:194:8: ( 'success' '{' click ( ';' )? '}' )
            // Ruleset.g:194:10: 'success' '{' click ( ';' )? '}'
            {
            root_0 = (Object)adaptor.nil();

            string_literal61=(Token)match(input,31,FOLLOW_31_in_success1033); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal61_tree = (Object)adaptor.create(string_literal61);
            adaptor.addChild(root_0, string_literal61_tree);
            }
            char_literal62=(Token)match(input,20,FOLLOW_20_in_success1035); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal62_tree = (Object)adaptor.create(char_literal62);
            adaptor.addChild(root_0, char_literal62_tree);
            }
            pushFollow(FOLLOW_click_in_success1037);
            click63=click();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, click63.getTree());
            // Ruleset.g:194:30: ( ';' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // Ruleset.g:194:30: ';'
                    {
                    char_literal64=(Token)match(input,24,FOLLOW_24_in_success1039); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal64_tree = (Object)adaptor.create(char_literal64);
                    adaptor.addChild(root_0, char_literal64_tree);
                    }

                    }
                    break;

            }

            char_literal65=(Token)match(input,21,FOLLOW_21_in_success1042); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal65_tree = (Object)adaptor.create(char_literal65);
            adaptor.addChild(root_0, char_literal65_tree);
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
        return retval;
    }
    // $ANTLR end "success"

    public static class failure_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "failure"
    // Ruleset.g:196:1: failure : 'failure' '{' click ( ';' )? '}' ;
    public final RulesetParser.failure_return failure() throws RecognitionException {
        RulesetParser.failure_return retval = new RulesetParser.failure_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal66=null;
        Token char_literal67=null;
        Token char_literal69=null;
        Token char_literal70=null;
        RulesetParser.click_return click68 = null;


        Object string_literal66_tree=null;
        Object char_literal67_tree=null;
        Object char_literal69_tree=null;
        Object char_literal70_tree=null;

        try {
            // Ruleset.g:196:8: ( 'failure' '{' click ( ';' )? '}' )
            // Ruleset.g:196:10: 'failure' '{' click ( ';' )? '}'
            {
            root_0 = (Object)adaptor.nil();

            string_literal66=(Token)match(input,32,FOLLOW_32_in_failure1049); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal66_tree = (Object)adaptor.create(string_literal66);
            adaptor.addChild(root_0, string_literal66_tree);
            }
            char_literal67=(Token)match(input,20,FOLLOW_20_in_failure1051); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal67_tree = (Object)adaptor.create(char_literal67);
            adaptor.addChild(root_0, char_literal67_tree);
            }
            pushFollow(FOLLOW_click_in_failure1053);
            click68=click();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, click68.getTree());
            // Ruleset.g:196:30: ( ';' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // Ruleset.g:196:30: ';'
                    {
                    char_literal69=(Token)match(input,24,FOLLOW_24_in_failure1055); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal69_tree = (Object)adaptor.create(char_literal69);
                    adaptor.addChild(root_0, char_literal69_tree);
                    }

                    }
                    break;

            }

            char_literal70=(Token)match(input,21,FOLLOW_21_in_failure1060); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal70_tree = (Object)adaptor.create(char_literal70);
            adaptor.addChild(root_0, char_literal70_tree);
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
        return retval;
    }
    // $ANTLR end "failure"

    public static class click_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "click"
    // Ruleset.g:198:1: click : ( 'click' | 'change' ) ID '=' STRING ( click_link )? ;
    public final RulesetParser.click_return click() throws RecognitionException {
        RulesetParser.click_return retval = new RulesetParser.click_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set71=null;
        Token ID72=null;
        Token char_literal73=null;
        Token STRING74=null;
        RulesetParser.click_link_return click_link75 = null;


        Object set71_tree=null;
        Object ID72_tree=null;
        Object char_literal73_tree=null;
        Object STRING74_tree=null;

        try {
            // Ruleset.g:198:6: ( ( 'click' | 'change' ) ID '=' STRING ( click_link )? )
            // Ruleset.g:198:8: ( 'click' | 'change' ) ID '=' STRING ( click_link )?
            {
            root_0 = (Object)adaptor.nil();

            set71=(Token)input.LT(1);
            if ( (input.LA(1)>=33 && input.LA(1)<=34) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set71));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            ID72=(Token)match(input,ID,FOLLOW_ID_in_click1075); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID72_tree = (Object)adaptor.create(ID72);
            adaptor.addChild(root_0, ID72_tree);
            }
            char_literal73=(Token)match(input,35,FOLLOW_35_in_click1077); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal73_tree = (Object)adaptor.create(char_literal73);
            adaptor.addChild(root_0, char_literal73_tree);
            }
            STRING74=(Token)match(input,STRING,FOLLOW_STRING_in_click1079); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING74_tree = (Object)adaptor.create(STRING74);
            adaptor.addChild(root_0, STRING74_tree);
            }
            // Ruleset.g:198:43: ( click_link )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==36) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // Ruleset.g:198:43: click_link
                    {
                    pushFollow(FOLLOW_click_link_in_click1081);
                    click_link75=click_link();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, click_link75.getTree());

                    }
                    break;

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
        return retval;
    }
    // $ANTLR end "click"

    public static class click_link_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "click_link"
    // Ruleset.g:200:1: click_link : 'triggers' persistent_expr ;
    public final RulesetParser.click_link_return click_link() throws RecognitionException {
        RulesetParser.click_link_return retval = new RulesetParser.click_link_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal76=null;
        RulesetParser.persistent_expr_return persistent_expr77 = null;


        Object string_literal76_tree=null;

        try {
            // Ruleset.g:200:11: ( 'triggers' persistent_expr )
            // Ruleset.g:200:13: 'triggers' persistent_expr
            {
            root_0 = (Object)adaptor.nil();

            string_literal76=(Token)match(input,36,FOLLOW_36_in_click_link1089); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal76_tree = (Object)adaptor.create(string_literal76);
            adaptor.addChild(root_0, string_literal76_tree);
            }
            pushFollow(FOLLOW_persistent_expr_in_click_link1091);
            persistent_expr77=persistent_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, persistent_expr77.getTree());

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
        return retval;
    }
    // $ANTLR end "click_link"

    public static class persistent_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "persistent_expr"
    // Ruleset.g:203:1: persistent_expr : ( persistent_clear | persistent_set | persistent_iterate | trail_forget | trail_mark );
    public final RulesetParser.persistent_expr_return persistent_expr() throws RecognitionException {
        RulesetParser.persistent_expr_return retval = new RulesetParser.persistent_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RulesetParser.persistent_clear_return persistent_clear78 = null;

        RulesetParser.persistent_set_return persistent_set79 = null;

        RulesetParser.persistent_iterate_return persistent_iterate80 = null;

        RulesetParser.trail_forget_return trail_forget81 = null;

        RulesetParser.trail_mark_return trail_mark82 = null;



        try {
            // Ruleset.g:203:16: ( persistent_clear | persistent_set | persistent_iterate | trail_forget | trail_mark )
            int alt15=5;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt15=1;
                }
                break;
            case 39:
                {
                alt15=2;
                }
                break;
            case 134:
            case 135:
                {
                alt15=3;
                }
                break;
            case 40:
                {
                alt15=4;
                }
                break;
            case 42:
                {
                alt15=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // Ruleset.g:203:18: persistent_clear
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_persistent_clear_in_persistent_expr1099);
                    persistent_clear78=persistent_clear();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, persistent_clear78.getTree());

                    }
                    break;
                case 2 :
                    // Ruleset.g:204:6: persistent_set
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_persistent_set_in_persistent_expr1106);
                    persistent_set79=persistent_set();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, persistent_set79.getTree());

                    }
                    break;
                case 3 :
                    // Ruleset.g:205:6: persistent_iterate
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_persistent_iterate_in_persistent_expr1113);
                    persistent_iterate80=persistent_iterate();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, persistent_iterate80.getTree());

                    }
                    break;
                case 4 :
                    // Ruleset.g:206:6: trail_forget
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_trail_forget_in_persistent_expr1120);
                    trail_forget81=trail_forget();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, trail_forget81.getTree());

                    }
                    break;
                case 5 :
                    // Ruleset.g:207:6: trail_mark
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_trail_mark_in_persistent_expr1127);
                    trail_mark82=trail_mark();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, trail_mark82.getTree());

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
        return retval;
    }
    // $ANTLR end "persistent_expr"

    public static class persistent_clear_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "persistent_clear"
    // Ruleset.g:210:1: persistent_clear : 'clear' var_domain ':' ID ;
    public final RulesetParser.persistent_clear_return persistent_clear() throws RecognitionException {
        RulesetParser.persistent_clear_return retval = new RulesetParser.persistent_clear_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal83=null;
        Token char_literal85=null;
        Token ID86=null;
        RulesetParser.var_domain_return var_domain84 = null;


        Object string_literal83_tree=null;
        Object char_literal85_tree=null;
        Object ID86_tree=null;

        try {
            // Ruleset.g:210:17: ( 'clear' var_domain ':' ID )
            // Ruleset.g:210:19: 'clear' var_domain ':' ID
            {
            root_0 = (Object)adaptor.nil();

            string_literal83=(Token)match(input,37,FOLLOW_37_in_persistent_clear1135); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal83_tree = (Object)adaptor.create(string_literal83);
            adaptor.addChild(root_0, string_literal83_tree);
            }
            pushFollow(FOLLOW_var_domain_in_persistent_clear1137);
            var_domain84=var_domain();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, var_domain84.getTree());
            char_literal85=(Token)match(input,38,FOLLOW_38_in_persistent_clear1139); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal85_tree = (Object)adaptor.create(char_literal85);
            adaptor.addChild(root_0, char_literal85_tree);
            }
            ID86=(Token)match(input,ID,FOLLOW_ID_in_persistent_clear1141); if (state.failed) return retval;
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
        }
        return retval;
    }
    // $ANTLR end "persistent_clear"

    public static class persistent_set_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "persistent_set"
    // Ruleset.g:212:1: persistent_set : 'set' var_domain ':' ID ;
    public final RulesetParser.persistent_set_return persistent_set() throws RecognitionException {
        RulesetParser.persistent_set_return retval = new RulesetParser.persistent_set_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal87=null;
        Token char_literal89=null;
        Token ID90=null;
        RulesetParser.var_domain_return var_domain88 = null;


        Object string_literal87_tree=null;
        Object char_literal89_tree=null;
        Object ID90_tree=null;

        try {
            // Ruleset.g:212:15: ( 'set' var_domain ':' ID )
            // Ruleset.g:212:17: 'set' var_domain ':' ID
            {
            root_0 = (Object)adaptor.nil();

            string_literal87=(Token)match(input,39,FOLLOW_39_in_persistent_set1148); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal87_tree = (Object)adaptor.create(string_literal87);
            adaptor.addChild(root_0, string_literal87_tree);
            }
            pushFollow(FOLLOW_var_domain_in_persistent_set1150);
            var_domain88=var_domain();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, var_domain88.getTree());
            char_literal89=(Token)match(input,38,FOLLOW_38_in_persistent_set1152); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal89_tree = (Object)adaptor.create(char_literal89);
            adaptor.addChild(root_0, char_literal89_tree);
            }
            ID90=(Token)match(input,ID,FOLLOW_ID_in_persistent_set1154); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID90_tree = (Object)adaptor.create(ID90);
            adaptor.addChild(root_0, ID90_tree);
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
        return retval;
    }
    // $ANTLR end "persistent_set"

    public static class persistent_iterate_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "persistent_iterate"
    // Ruleset.g:214:1: persistent_iterate : var_domain ':' ID counter_op expr counter_start ;
    public final RulesetParser.persistent_iterate_return persistent_iterate() throws RecognitionException {
        RulesetParser.persistent_iterate_return retval = new RulesetParser.persistent_iterate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal92=null;
        Token ID93=null;
        RulesetParser.var_domain_return var_domain91 = null;

        RulesetParser.counter_op_return counter_op94 = null;

        RulesetParser.expr_return expr95 = null;

        RulesetParser.counter_start_return counter_start96 = null;


        Object char_literal92_tree=null;
        Object ID93_tree=null;

        try {
            // Ruleset.g:214:19: ( var_domain ':' ID counter_op expr counter_start )
            // Ruleset.g:214:21: var_domain ':' ID counter_op expr counter_start
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_var_domain_in_persistent_iterate1161);
            var_domain91=var_domain();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, var_domain91.getTree());
            char_literal92=(Token)match(input,38,FOLLOW_38_in_persistent_iterate1163); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal92_tree = (Object)adaptor.create(char_literal92);
            adaptor.addChild(root_0, char_literal92_tree);
            }
            ID93=(Token)match(input,ID,FOLLOW_ID_in_persistent_iterate1165); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID93_tree = (Object)adaptor.create(ID93);
            adaptor.addChild(root_0, ID93_tree);
            }
            pushFollow(FOLLOW_counter_op_in_persistent_iterate1167);
            counter_op94=counter_op();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, counter_op94.getTree());
            pushFollow(FOLLOW_expr_in_persistent_iterate1169);
            expr95=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr95.getTree());
            pushFollow(FOLLOW_counter_start_in_persistent_iterate1171);
            counter_start96=counter_start();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, counter_start96.getTree());

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
        return retval;
    }
    // $ANTLR end "persistent_iterate"

    public static class trail_forget_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "trail_forget"
    // Ruleset.g:216:1: trail_forget : 'forget' STRING 'in' var_domain ':' ID ;
    public final RulesetParser.trail_forget_return trail_forget() throws RecognitionException {
        RulesetParser.trail_forget_return retval = new RulesetParser.trail_forget_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal97=null;
        Token STRING98=null;
        Token string_literal99=null;
        Token char_literal101=null;
        Token ID102=null;
        RulesetParser.var_domain_return var_domain100 = null;


        Object string_literal97_tree=null;
        Object STRING98_tree=null;
        Object string_literal99_tree=null;
        Object char_literal101_tree=null;
        Object ID102_tree=null;

        try {
            // Ruleset.g:216:13: ( 'forget' STRING 'in' var_domain ':' ID )
            // Ruleset.g:216:15: 'forget' STRING 'in' var_domain ':' ID
            {
            root_0 = (Object)adaptor.nil();

            string_literal97=(Token)match(input,40,FOLLOW_40_in_trail_forget1178); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal97_tree = (Object)adaptor.create(string_literal97);
            adaptor.addChild(root_0, string_literal97_tree);
            }
            STRING98=(Token)match(input,STRING,FOLLOW_STRING_in_trail_forget1180); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING98_tree = (Object)adaptor.create(STRING98);
            adaptor.addChild(root_0, STRING98_tree);
            }
            string_literal99=(Token)match(input,41,FOLLOW_41_in_trail_forget1182); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal99_tree = (Object)adaptor.create(string_literal99);
            adaptor.addChild(root_0, string_literal99_tree);
            }
            pushFollow(FOLLOW_var_domain_in_trail_forget1184);
            var_domain100=var_domain();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, var_domain100.getTree());
            char_literal101=(Token)match(input,38,FOLLOW_38_in_trail_forget1186); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal101_tree = (Object)adaptor.create(char_literal101);
            adaptor.addChild(root_0, char_literal101_tree);
            }
            ID102=(Token)match(input,ID,FOLLOW_ID_in_trail_forget1188); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID102_tree = (Object)adaptor.create(ID102);
            adaptor.addChild(root_0, ID102_tree);
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
        return retval;
    }
    // $ANTLR end "trail_forget"

    public static class trail_mark_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "trail_mark"
    // Ruleset.g:218:1: trail_mark : 'mark' var_domain ':' ID trail_with ;
    public final RulesetParser.trail_mark_return trail_mark() throws RecognitionException {
        RulesetParser.trail_mark_return retval = new RulesetParser.trail_mark_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal103=null;
        Token char_literal105=null;
        Token ID106=null;
        RulesetParser.var_domain_return var_domain104 = null;

        RulesetParser.trail_with_return trail_with107 = null;


        Object string_literal103_tree=null;
        Object char_literal105_tree=null;
        Object ID106_tree=null;

        try {
            // Ruleset.g:218:11: ( 'mark' var_domain ':' ID trail_with )
            // Ruleset.g:218:13: 'mark' var_domain ':' ID trail_with
            {
            root_0 = (Object)adaptor.nil();

            string_literal103=(Token)match(input,42,FOLLOW_42_in_trail_mark1195); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal103_tree = (Object)adaptor.create(string_literal103);
            adaptor.addChild(root_0, string_literal103_tree);
            }
            pushFollow(FOLLOW_var_domain_in_trail_mark1197);
            var_domain104=var_domain();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, var_domain104.getTree());
            char_literal105=(Token)match(input,38,FOLLOW_38_in_trail_mark1199); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal105_tree = (Object)adaptor.create(char_literal105);
            adaptor.addChild(root_0, char_literal105_tree);
            }
            ID106=(Token)match(input,ID,FOLLOW_ID_in_trail_mark1201); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID106_tree = (Object)adaptor.create(ID106);
            adaptor.addChild(root_0, ID106_tree);
            }
            pushFollow(FOLLOW_trail_with_in_trail_mark1203);
            trail_with107=trail_with();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, trail_with107.getTree());

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
        return retval;
    }
    // $ANTLR end "trail_mark"

    public static class trail_with_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "trail_with"
    // Ruleset.g:220:1: trail_with : 'with' expr ;
    public final RulesetParser.trail_with_return trail_with() throws RecognitionException {
        RulesetParser.trail_with_return retval = new RulesetParser.trail_with_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal108=null;
        RulesetParser.expr_return expr109 = null;


        Object string_literal108_tree=null;

        try {
            // Ruleset.g:220:11: ( 'with' expr )
            // Ruleset.g:220:13: 'with' expr
            {
            root_0 = (Object)adaptor.nil();

            string_literal108=(Token)match(input,43,FOLLOW_43_in_trail_with1210); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal108_tree = (Object)adaptor.create(string_literal108);
            adaptor.addChild(root_0, string_literal108_tree);
            }
            pushFollow(FOLLOW_expr_in_trail_with1212);
            expr109=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr109.getTree());

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
        return retval;
    }
    // $ANTLR end "trail_with"

    public static class counter_op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "counter_op"
    // Ruleset.g:223:1: counter_op : ( '+=' | '-=' );
    public final RulesetParser.counter_op_return counter_op() throws RecognitionException {
        RulesetParser.counter_op_return retval = new RulesetParser.counter_op_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set110=null;

        Object set110_tree=null;

        try {
            // Ruleset.g:223:11: ( '+=' | '-=' )
            // Ruleset.g:
            {
            root_0 = (Object)adaptor.nil();

            set110=(Token)input.LT(1);
            if ( (input.LA(1)>=44 && input.LA(1)<=45) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set110));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
        return retval;
    }
    // $ANTLR end "counter_op"

    public static class counter_start_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "counter_start"
    // Ruleset.g:226:1: counter_start : 'from' expr ;
    public final RulesetParser.counter_start_return counter_start() throws RecognitionException {
        RulesetParser.counter_start_return retval = new RulesetParser.counter_start_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal111=null;
        RulesetParser.expr_return expr112 = null;


        Object string_literal111_tree=null;

        try {
            // Ruleset.g:226:14: ( 'from' expr )
            // Ruleset.g:226:16: 'from' expr
            {
            root_0 = (Object)adaptor.nil();

            string_literal111=(Token)match(input,46,FOLLOW_46_in_counter_start1241); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal111_tree = (Object)adaptor.create(string_literal111);
            adaptor.addChild(root_0, string_literal111_tree);
            }
            pushFollow(FOLLOW_expr_in_counter_start1243);
            expr112=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr112.getTree());

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
        return retval;
    }
    // $ANTLR end "counter_start"

    public static class log_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "log_statement"
    // Ruleset.g:229:1: log_statement : 'log' expr ;
    public final RulesetParser.log_statement_return log_statement() throws RecognitionException {
        RulesetParser.log_statement_return retval = new RulesetParser.log_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal113=null;
        RulesetParser.expr_return expr114 = null;


        Object string_literal113_tree=null;

        try {
            // Ruleset.g:229:14: ( 'log' expr )
            // Ruleset.g:229:16: 'log' expr
            {
            root_0 = (Object)adaptor.nil();

            string_literal113=(Token)match(input,47,FOLLOW_47_in_log_statement1251); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal113_tree = (Object)adaptor.create(string_literal113);
            adaptor.addChild(root_0, string_literal113_tree);
            }
            pushFollow(FOLLOW_expr_in_log_statement1253);
            expr114=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr114.getTree());

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
        return retval;
    }
    // $ANTLR end "log_statement"

    public static class control_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "control_statement"
    // Ruleset.g:231:1: control_statement : 'last' ;
    public final RulesetParser.control_statement_return control_statement() throws RecognitionException {
        RulesetParser.control_statement_return retval = new RulesetParser.control_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal115=null;

        Object string_literal115_tree=null;

        try {
            // Ruleset.g:231:18: ( 'last' )
            // Ruleset.g:231:20: 'last'
            {
            root_0 = (Object)adaptor.nil();

            string_literal115=(Token)match(input,48,FOLLOW_48_in_control_statement1260); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal115_tree = (Object)adaptor.create(string_literal115);
            adaptor.addChild(root_0, string_literal115_tree);
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
        return retval;
    }
    // $ANTLR end "control_statement"

    public static class raise_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "raise_statement"
    // Ruleset.g:233:1: raise_statement : 'raise' 'explicit' 'event' ID for_clause modifier_clause ;
    public final RulesetParser.raise_statement_return raise_statement() throws RecognitionException {
        RulesetParser.raise_statement_return retval = new RulesetParser.raise_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal116=null;
        Token string_literal117=null;
        Token string_literal118=null;
        Token ID119=null;
        RulesetParser.for_clause_return for_clause120 = null;

        RulesetParser.modifier_clause_return modifier_clause121 = null;


        Object string_literal116_tree=null;
        Object string_literal117_tree=null;
        Object string_literal118_tree=null;
        Object ID119_tree=null;

        try {
            // Ruleset.g:233:16: ( 'raise' 'explicit' 'event' ID for_clause modifier_clause )
            // Ruleset.g:233:18: 'raise' 'explicit' 'event' ID for_clause modifier_clause
            {
            root_0 = (Object)adaptor.nil();

            string_literal116=(Token)match(input,49,FOLLOW_49_in_raise_statement1267); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal116_tree = (Object)adaptor.create(string_literal116);
            adaptor.addChild(root_0, string_literal116_tree);
            }
            string_literal117=(Token)match(input,50,FOLLOW_50_in_raise_statement1269); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal117_tree = (Object)adaptor.create(string_literal117);
            adaptor.addChild(root_0, string_literal117_tree);
            }
            string_literal118=(Token)match(input,51,FOLLOW_51_in_raise_statement1271); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal118_tree = (Object)adaptor.create(string_literal118);
            adaptor.addChild(root_0, string_literal118_tree);
            }
            ID119=(Token)match(input,ID,FOLLOW_ID_in_raise_statement1273); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID119_tree = (Object)adaptor.create(ID119);
            adaptor.addChild(root_0, ID119_tree);
            }
            pushFollow(FOLLOW_for_clause_in_raise_statement1275);
            for_clause120=for_clause();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, for_clause120.getTree());
            pushFollow(FOLLOW_modifier_clause_in_raise_statement1277);
            modifier_clause121=modifier_clause();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, modifier_clause121.getTree());

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
        return retval;
    }
    // $ANTLR end "raise_statement"

    public static class for_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "for_clause"
    // Ruleset.g:235:1: for_clause : 'for' ID ;
    public final RulesetParser.for_clause_return for_clause() throws RecognitionException {
        RulesetParser.for_clause_return retval = new RulesetParser.for_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal122=null;
        Token ID123=null;

        Object string_literal122_tree=null;
        Object ID123_tree=null;

        try {
            // Ruleset.g:235:11: ( 'for' ID )
            // Ruleset.g:235:13: 'for' ID
            {
            root_0 = (Object)adaptor.nil();

            string_literal122=(Token)match(input,52,FOLLOW_52_in_for_clause1284); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal122_tree = (Object)adaptor.create(string_literal122);
            adaptor.addChild(root_0, string_literal122_tree);
            }
            ID123=(Token)match(input,ID,FOLLOW_ID_in_for_clause1286); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID123_tree = (Object)adaptor.create(ID123);
            adaptor.addChild(root_0, ID123_tree);
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
        return retval;
    }
    // $ANTLR end "for_clause"

    public static class rule_state_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rule_state"
    // Ruleset.g:240:1: rule_state : ( 'active' | 'inactive' | 'test' );
    public final RulesetParser.rule_state_return rule_state() throws RecognitionException {
        RulesetParser.rule_state_return retval = new RulesetParser.rule_state_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set124=null;

        Object set124_tree=null;

        try {
            // Ruleset.g:240:11: ( 'active' | 'inactive' | 'test' )
            // Ruleset.g:
            {
            root_0 = (Object)adaptor.nil();

            set124=(Token)input.LT(1);
            if ( (input.LA(1)>=53 && input.LA(1)<=55) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set124));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
        return retval;
    }
    // $ANTLR end "rule_state"

    public static class action_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "action"
    // Ruleset.g:246:1: action : ( ( unconditional_action )=> unconditional_action | conditional_action );
    public final RulesetParser.action_return action() throws RecognitionException {
        RulesetParser.action_return retval = new RulesetParser.action_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RulesetParser.unconditional_action_return unconditional_action125 = null;

        RulesetParser.conditional_action_return conditional_action126 = null;



        try {
            // Ruleset.g:247:2: ( ( unconditional_action )=> unconditional_action | conditional_action )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=62 && LA16_0<=63)) && (synpred2_Ruleset())) {
                alt16=1;
            }
            else if ( (LA16_0==ID) && (synpred2_Ruleset())) {
                alt16=1;
            }
            else if ( (LA16_0==136) && (synpred2_Ruleset())) {
                alt16=1;
            }
            else if ( (LA16_0==29) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // Ruleset.g:248:2: ( unconditional_action )=> unconditional_action
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_unconditional_action_in_action1366);
                    unconditional_action125=unconditional_action();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unconditional_action125.getTree());

                    }
                    break;
                case 2 :
                    // Ruleset.g:248:50: conditional_action
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_conditional_action_in_action1370);
                    conditional_action126=conditional_action();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditional_action126.getTree());

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
        return retval;
    }
    // $ANTLR end "action"

    public static class conditional_action_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditional_action"
    // Ruleset.g:252:1: conditional_action : 'if' expr 'then' unconditional_action ;
    public final RulesetParser.conditional_action_return conditional_action() throws RecognitionException {
        RulesetParser.conditional_action_return retval = new RulesetParser.conditional_action_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal127=null;
        Token string_literal129=null;
        RulesetParser.expr_return expr128 = null;

        RulesetParser.unconditional_action_return unconditional_action130 = null;


        Object string_literal127_tree=null;
        Object string_literal129_tree=null;

        try {
            // Ruleset.g:253:2: ( 'if' expr 'then' unconditional_action )
            // Ruleset.g:253:4: 'if' expr 'then' unconditional_action
            {
            root_0 = (Object)adaptor.nil();

            string_literal127=(Token)match(input,29,FOLLOW_29_in_conditional_action1383); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal127_tree = (Object)adaptor.create(string_literal127);
            adaptor.addChild(root_0, string_literal127_tree);
            }
            pushFollow(FOLLOW_expr_in_conditional_action1385);
            expr128=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr128.getTree());
            string_literal129=(Token)match(input,56,FOLLOW_56_in_conditional_action1387); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal129_tree = (Object)adaptor.create(string_literal129);
            adaptor.addChild(root_0, string_literal129_tree);
            }
            pushFollow(FOLLOW_unconditional_action_in_conditional_action1389);
            unconditional_action130=unconditional_action();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unconditional_action130.getTree());

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
        return retval;
    }
    // $ANTLR end "conditional_action"

    public static class unconditional_action_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unconditional_action"
    // Ruleset.g:256:1: unconditional_action : ( ( actionblock )=> actionblock | primrule );
    public final RulesetParser.unconditional_action_return unconditional_action() throws RecognitionException {
        RulesetParser.unconditional_action_return retval = new RulesetParser.unconditional_action_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RulesetParser.actionblock_return actionblock131 = null;

        RulesetParser.primrule_return primrule132 = null;



        try {
            // Ruleset.g:257:2: ( ( actionblock )=> actionblock | primrule )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=62 && LA17_0<=63)) && (synpred3_Ruleset())) {
                alt17=1;
            }
            else if ( (LA17_0==ID||LA17_0==136) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // Ruleset.g:257:4: ( actionblock )=> actionblock
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_actionblock_in_unconditional_action1407);
                    actionblock131=actionblock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, actionblock131.getTree());

                    }
                    break;
                case 2 :
                    // Ruleset.g:257:34: primrule
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primrule_in_unconditional_action1411);
                    primrule132=primrule();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primrule132.getTree());

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
        return retval;
    }
    // $ANTLR end "unconditional_action"

    public static class primrule_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primrule"
    // Ruleset.g:260:1: primrule : ( ( rule_label )? ( namespace )? ID '(' arguments ')' ( modifier_clause )? | ( rule_label )? emit_block );
    public final RulesetParser.primrule_return primrule() throws RecognitionException {
        RulesetParser.primrule_return retval = new RulesetParser.primrule_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID135=null;
        Token char_literal136=null;
        Token char_literal138=null;
        RulesetParser.rule_label_return rule_label133 = null;

        RulesetParser.namespace_return namespace134 = null;

        RulesetParser.arguments_return arguments137 = null;

        RulesetParser.modifier_clause_return modifier_clause139 = null;

        RulesetParser.rule_label_return rule_label140 = null;

        RulesetParser.emit_block_return emit_block141 = null;


        Object ID135_tree=null;
        Object char_literal136_tree=null;
        Object char_literal138_tree=null;

        try {
            // Ruleset.g:261:2: ( ( rule_label )? ( namespace )? ID '(' arguments ')' ( modifier_clause )? | ( rule_label )? emit_block )
            int alt22=2;
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

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // Ruleset.g:262:2: ( rule_label )? ( namespace )? ID '(' arguments ')' ( modifier_clause )?
                    {
                    root_0 = (Object)adaptor.nil();

                    // Ruleset.g:262:2: ( rule_label )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==ID) ) {
                        int LA18_1 = input.LA(2);

                        if ( (LA18_1==60) ) {
                            alt18=1;
                        }
                    }
                    switch (alt18) {
                        case 1 :
                            // Ruleset.g:262:2: rule_label
                            {
                            pushFollow(FOLLOW_rule_label_in_primrule1427);
                            rule_label133=rule_label();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, rule_label133.getTree());

                            }
                            break;

                    }

                    // Ruleset.g:262:14: ( namespace )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==ID) ) {
                        int LA19_1 = input.LA(2);

                        if ( (LA19_1==38) ) {
                            alt19=1;
                        }
                    }
                    switch (alt19) {
                        case 1 :
                            // Ruleset.g:262:14: namespace
                            {
                            pushFollow(FOLLOW_namespace_in_primrule1430);
                            namespace134=namespace();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, namespace134.getTree());

                            }
                            break;

                    }

                    ID135=(Token)match(input,ID,FOLLOW_ID_in_primrule1433); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID135_tree = (Object)adaptor.create(ID135);
                    adaptor.addChild(root_0, ID135_tree);
                    }
                    char_literal136=(Token)match(input,57,FOLLOW_57_in_primrule1435); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal136_tree = (Object)adaptor.create(char_literal136);
                    adaptor.addChild(root_0, char_literal136_tree);
                    }
                    pushFollow(FOLLOW_arguments_in_primrule1437);
                    arguments137=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments137.getTree());
                    char_literal138=(Token)match(input,58,FOLLOW_58_in_primrule1439); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal138_tree = (Object)adaptor.create(char_literal138);
                    adaptor.addChild(root_0, char_literal138_tree);
                    }
                    // Ruleset.g:262:46: ( modifier_clause )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==43) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // Ruleset.g:262:46: modifier_clause
                            {
                            pushFollow(FOLLOW_modifier_clause_in_primrule1441);
                            modifier_clause139=modifier_clause();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, modifier_clause139.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // Ruleset.g:263:3: ( rule_label )? emit_block
                    {
                    root_0 = (Object)adaptor.nil();

                    // Ruleset.g:263:3: ( rule_label )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==ID) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // Ruleset.g:263:3: rule_label
                            {
                            pushFollow(FOLLOW_rule_label_in_primrule1447);
                            rule_label140=rule_label();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, rule_label140.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_emit_block_in_primrule1450);
                    emit_block141=emit_block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, emit_block141.getTree());

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
        return retval;
    }
    // $ANTLR end "primrule"

    public static class arguments_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arguments"
    // Ruleset.g:267:1: arguments : ( expr )? ( ',' expr )* ;
    public final RulesetParser.arguments_return arguments() throws RecognitionException {
        RulesetParser.arguments_return retval = new RulesetParser.arguments_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal143=null;
        RulesetParser.expr_return expr142 = null;

        RulesetParser.expr_return expr144 = null;


        Object char_literal143_tree=null;

        try {
            // Ruleset.g:268:2: ( ( expr )? ( ',' expr )* )
            // Ruleset.g:268:4: ( expr )? ( ',' expr )*
            {
            root_0 = (Object)adaptor.nil();

            // Ruleset.g:268:4: ( expr )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=ID && LA23_0<=INT)||LA23_0==REGEXP||LA23_0==STRING||LA23_0==20||LA23_0==57||LA23_0==71||LA23_0==84||LA23_0==102||(LA23_0>=104 && LA23_0<=106)||(LA23_0>=108 && LA23_0<=109)||(LA23_0>=134 && LA23_0<=135)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // Ruleset.g:268:5: expr
                    {
                    pushFollow(FOLLOW_expr_in_arguments1465);
                    expr142=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr142.getTree());

                    }
                    break;

            }

            // Ruleset.g:268:12: ( ',' expr )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==59) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // Ruleset.g:268:13: ',' expr
            	    {
            	    char_literal143=(Token)match(input,59,FOLLOW_59_in_arguments1470); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal143_tree = (Object)adaptor.create(char_literal143);
            	    adaptor.addChild(root_0, char_literal143_tree);
            	    }
            	    pushFollow(FOLLOW_expr_in_arguments1472);
            	    expr144=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr144.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


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
        return retval;
    }
    // $ANTLR end "arguments"

    public static class rule_label_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rule_label"
    // Ruleset.g:270:1: rule_label : ID '=>' ;
    public final RulesetParser.rule_label_return rule_label() throws RecognitionException {
        RulesetParser.rule_label_return retval = new RulesetParser.rule_label_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID145=null;
        Token string_literal146=null;

        Object ID145_tree=null;
        Object string_literal146_tree=null;

        try {
            // Ruleset.g:270:12: ( ID '=>' )
            // Ruleset.g:270:14: ID '=>'
            {
            root_0 = (Object)adaptor.nil();

            ID145=(Token)match(input,ID,FOLLOW_ID_in_rule_label1494); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID145_tree = (Object)adaptor.create(ID145);
            adaptor.addChild(root_0, ID145_tree);
            }
            string_literal146=(Token)match(input,60,FOLLOW_60_in_rule_label1496); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal146_tree = (Object)adaptor.create(string_literal146);
            adaptor.addChild(root_0, string_literal146_tree);
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
        return retval;
    }
    // $ANTLR end "rule_label"

    public static class modifier_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "modifier_clause"
    // Ruleset.g:272:1: modifier_clause : 'with' modifier ( 'and' modifier )* ;
    public final RulesetParser.modifier_clause_return modifier_clause() throws RecognitionException {
        RulesetParser.modifier_clause_return retval = new RulesetParser.modifier_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal147=null;
        Token string_literal149=null;
        RulesetParser.modifier_return modifier148 = null;

        RulesetParser.modifier_return modifier150 = null;


        Object string_literal147_tree=null;
        Object string_literal149_tree=null;

        try {
            // Ruleset.g:273:2: ( 'with' modifier ( 'and' modifier )* )
            // Ruleset.g:273:5: 'with' modifier ( 'and' modifier )*
            {
            root_0 = (Object)adaptor.nil();

            string_literal147=(Token)match(input,43,FOLLOW_43_in_modifier_clause1517); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal147_tree = (Object)adaptor.create(string_literal147);
            adaptor.addChild(root_0, string_literal147_tree);
            }
            pushFollow(FOLLOW_modifier_in_modifier_clause1519);
            modifier148=modifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, modifier148.getTree());
            // Ruleset.g:273:21: ( 'and' modifier )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==61) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // Ruleset.g:273:22: 'and' modifier
            	    {
            	    string_literal149=(Token)match(input,61,FOLLOW_61_in_modifier_clause1522); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal149_tree = (Object)adaptor.create(string_literal149);
            	    adaptor.addChild(root_0, string_literal149_tree);
            	    }
            	    pushFollow(FOLLOW_modifier_in_modifier_clause1524);
            	    modifier150=modifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, modifier150.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


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
        return retval;
    }
    // $ANTLR end "modifier_clause"

    public static class modifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "modifier"
    // Ruleset.g:276:1: modifier : ID '=' ( expr | JS ) ;
    public final RulesetParser.modifier_return modifier() throws RecognitionException {
        RulesetParser.modifier_return retval = new RulesetParser.modifier_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID151=null;
        Token char_literal152=null;
        Token JS154=null;
        RulesetParser.expr_return expr153 = null;


        Object ID151_tree=null;
        Object char_literal152_tree=null;
        Object JS154_tree=null;

        try {
            // Ruleset.g:277:2: ( ID '=' ( expr | JS ) )
            // Ruleset.g:277:4: ID '=' ( expr | JS )
            {
            root_0 = (Object)adaptor.nil();

            ID151=(Token)match(input,ID,FOLLOW_ID_in_modifier1539); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID151_tree = (Object)adaptor.create(ID151);
            adaptor.addChild(root_0, ID151_tree);
            }
            char_literal152=(Token)match(input,35,FOLLOW_35_in_modifier1541); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal152_tree = (Object)adaptor.create(char_literal152);
            adaptor.addChild(root_0, char_literal152_tree);
            }
            // Ruleset.g:277:11: ( expr | JS )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=ID && LA26_0<=INT)||LA26_0==REGEXP||LA26_0==STRING||LA26_0==20||LA26_0==57||LA26_0==71||LA26_0==84||LA26_0==102||(LA26_0>=104 && LA26_0<=106)||(LA26_0>=108 && LA26_0<=109)||(LA26_0>=134 && LA26_0<=135)) ) {
                alt26=1;
            }
            else if ( (LA26_0==JS) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // Ruleset.g:277:12: expr
                    {
                    pushFollow(FOLLOW_expr_in_modifier1544);
                    expr153=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr153.getTree());

                    }
                    break;
                case 2 :
                    // Ruleset.g:277:19: JS
                    {
                    JS154=(Token)match(input,JS,FOLLOW_JS_in_modifier1548); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    JS154_tree = (Object)adaptor.create(JS154);
                    adaptor.addChild(root_0, JS154_tree);
                    }

                    }
                    break;

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
        return retval;
    }
    // $ANTLR end "modifier"

    public static class actionblock_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "actionblock"
    // Ruleset.g:280:1: actionblock : blocktype '{' ( primrule ( ';' )? )* '}' ;
    public final RulesetParser.actionblock_return actionblock() throws RecognitionException {
        RulesetParser.actionblock_return retval = new RulesetParser.actionblock_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal156=null;
        Token char_literal158=null;
        Token char_literal159=null;
        RulesetParser.blocktype_return blocktype155 = null;

        RulesetParser.primrule_return primrule157 = null;


        Object char_literal156_tree=null;
        Object char_literal158_tree=null;
        Object char_literal159_tree=null;

        try {
            // Ruleset.g:281:2: ( blocktype '{' ( primrule ( ';' )? )* '}' )
            // Ruleset.g:281:4: blocktype '{' ( primrule ( ';' )? )* '}'
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_blocktype_in_actionblock1563);
            blocktype155=blocktype();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, blocktype155.getTree());
            char_literal156=(Token)match(input,20,FOLLOW_20_in_actionblock1565); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal156_tree = (Object)adaptor.create(char_literal156);
            adaptor.addChild(root_0, char_literal156_tree);
            }
            // Ruleset.g:281:18: ( primrule ( ';' )? )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==ID||LA28_0==136) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // Ruleset.g:281:19: primrule ( ';' )?
            	    {
            	    pushFollow(FOLLOW_primrule_in_actionblock1568);
            	    primrule157=primrule();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, primrule157.getTree());
            	    // Ruleset.g:281:28: ( ';' )?
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==24) ) {
            	        alt27=1;
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // Ruleset.g:281:28: ';'
            	            {
            	            char_literal158=(Token)match(input,24,FOLLOW_24_in_actionblock1570); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal158_tree = (Object)adaptor.create(char_literal158);
            	            adaptor.addChild(root_0, char_literal158_tree);
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            char_literal159=(Token)match(input,21,FOLLOW_21_in_actionblock1575); if (state.failed) return retval;
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
        }
        return retval;
    }
    // $ANTLR end "actionblock"

    public static class blocktype_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "blocktype"
    // Ruleset.g:284:1: blocktype : ( 'choose' | 'every' );
    public final RulesetParser.blocktype_return blocktype() throws RecognitionException {
        RulesetParser.blocktype_return retval = new RulesetParser.blocktype_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set160=null;

        Object set160_tree=null;

        try {
            // Ruleset.g:284:10: ( 'choose' | 'every' )
            // Ruleset.g:
            {
            root_0 = (Object)adaptor.nil();

            set160=(Token)input.LT(1);
            if ( (input.LA(1)>=62 && input.LA(1)<=63) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set160));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
        return retval;
    }
    // $ANTLR end "blocktype"

    public static class pre_block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pre_block"
    // Ruleset.g:288:1: pre_block : 'pre' '{' ( decl ( ';' )? )? '}' ;
    public final RulesetParser.pre_block_return pre_block() throws RecognitionException {
        RulesetParser.pre_block_return retval = new RulesetParser.pre_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal161=null;
        Token char_literal162=null;
        Token char_literal164=null;
        Token char_literal165=null;
        RulesetParser.decl_return decl163 = null;


        Object string_literal161_tree=null;
        Object char_literal162_tree=null;
        Object char_literal164_tree=null;
        Object char_literal165_tree=null;

        try {
            // Ruleset.g:288:10: ( 'pre' '{' ( decl ( ';' )? )? '}' )
            // Ruleset.g:288:12: 'pre' '{' ( decl ( ';' )? )? '}'
            {
            root_0 = (Object)adaptor.nil();

            string_literal161=(Token)match(input,64,FOLLOW_64_in_pre_block1617); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal161_tree = (Object)adaptor.create(string_literal161);
            adaptor.addChild(root_0, string_literal161_tree);
            }
            char_literal162=(Token)match(input,20,FOLLOW_20_in_pre_block1619); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal162_tree = (Object)adaptor.create(char_literal162);
            adaptor.addChild(root_0, char_literal162_tree);
            }
            // Ruleset.g:288:22: ( decl ( ';' )? )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==ID) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // Ruleset.g:288:23: decl ( ';' )?
                    {
                    pushFollow(FOLLOW_decl_in_pre_block1622);
                    decl163=decl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, decl163.getTree());
                    // Ruleset.g:288:28: ( ';' )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==24) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // Ruleset.g:288:28: ';'
                            {
                            char_literal164=(Token)match(input,24,FOLLOW_24_in_pre_block1624); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal164_tree = (Object)adaptor.create(char_literal164);
                            adaptor.addChild(root_0, char_literal164_tree);
                            }

                            }
                            break;

                    }


                    }
                    break;

            }

            char_literal165=(Token)match(input,21,FOLLOW_21_in_pre_block1629); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal165_tree = (Object)adaptor.create(char_literal165);
            adaptor.addChild(root_0, char_literal165_tree);
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
        return retval;
    }
    // $ANTLR end "pre_block"

    public static class foreach_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "foreach"
    // Ruleset.g:291:1: foreach : 'foreach' expr setting ;
    public final RulesetParser.foreach_return foreach() throws RecognitionException {
        RulesetParser.foreach_return retval = new RulesetParser.foreach_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal166=null;
        RulesetParser.expr_return expr167 = null;

        RulesetParser.setting_return setting168 = null;


        Object string_literal166_tree=null;

        try {
            // Ruleset.g:291:8: ( 'foreach' expr setting )
            // Ruleset.g:292:2: 'foreach' expr setting
            {
            root_0 = (Object)adaptor.nil();

            string_literal166=(Token)match(input,65,FOLLOW_65_in_foreach1649); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal166_tree = (Object)adaptor.create(string_literal166);
            adaptor.addChild(root_0, string_literal166_tree);
            }
            pushFollow(FOLLOW_expr_in_foreach1651);
            expr167=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr167.getTree());
            pushFollow(FOLLOW_setting_in_foreach1653);
            setting168=setting();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, setting168.getTree());

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
        return retval;
    }
    // $ANTLR end "foreach"

    public static class select_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "select_clause"
    // Ruleset.g:295:1: select_clause : 'select' ( using | when ) ( foreach )? ;
    public final RulesetParser.select_clause_return select_clause() throws RecognitionException {
        RulesetParser.select_clause_return retval = new RulesetParser.select_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal169=null;
        RulesetParser.using_return using170 = null;

        RulesetParser.when_return when171 = null;

        RulesetParser.foreach_return foreach172 = null;


        Object string_literal169_tree=null;

        try {
            // Ruleset.g:295:15: ( 'select' ( using | when ) ( foreach )? )
            // Ruleset.g:295:17: 'select' ( using | when ) ( foreach )?
            {
            root_0 = (Object)adaptor.nil();

            string_literal169=(Token)match(input,66,FOLLOW_66_in_select_clause1672); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal169_tree = (Object)adaptor.create(string_literal169);
            adaptor.addChild(root_0, string_literal169_tree);
            }
            // Ruleset.g:295:26: ( using | when )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==67) ) {
                alt31=1;
            }
            else if ( (LA31_0==68) ) {
                alt31=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // Ruleset.g:295:27: using
                    {
                    pushFollow(FOLLOW_using_in_select_clause1675);
                    using170=using();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, using170.getTree());

                    }
                    break;
                case 2 :
                    // Ruleset.g:295:33: when
                    {
                    pushFollow(FOLLOW_when_in_select_clause1677);
                    when171=when();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, when171.getTree());

                    }
                    break;

            }

            // Ruleset.g:295:39: ( foreach )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==65) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // Ruleset.g:295:39: foreach
                    {
                    pushFollow(FOLLOW_foreach_in_select_clause1680);
                    foreach172=foreach();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, foreach172.getTree());

                    }
                    break;

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
        return retval;
    }
    // $ANTLR end "select_clause"

    public static class using_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "using"
    // Ruleset.g:298:1: using : 'using' STRING setting ;
    public final RulesetParser.using_return using() throws RecognitionException {
        RulesetParser.using_return retval = new RulesetParser.using_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal173=null;
        Token STRING174=null;
        RulesetParser.setting_return setting175 = null;


        Object string_literal173_tree=null;
        Object STRING174_tree=null;

        try {
            // Ruleset.g:298:7: ( 'using' STRING setting )
            // Ruleset.g:298:9: 'using' STRING setting
            {
            root_0 = (Object)adaptor.nil();

            string_literal173=(Token)match(input,67,FOLLOW_67_in_using1694); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal173_tree = (Object)adaptor.create(string_literal173);
            adaptor.addChild(root_0, string_literal173_tree);
            }
            STRING174=(Token)match(input,STRING,FOLLOW_STRING_in_using1696); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING174_tree = (Object)adaptor.create(STRING174);
            adaptor.addChild(root_0, STRING174_tree);
            }
            pushFollow(FOLLOW_setting_in_using1698);
            setting175=setting();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, setting175.getTree());

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
        return retval;
    }
    // $ANTLR end "using"

    public static class when_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "when"
    // Ruleset.g:300:1: when : 'when' event_seq ;
    public final RulesetParser.when_return when() throws RecognitionException {
        RulesetParser.when_return retval = new RulesetParser.when_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal176=null;
        RulesetParser.event_seq_return event_seq177 = null;


        Object string_literal176_tree=null;

        try {
            // Ruleset.g:300:6: ( 'when' event_seq )
            // Ruleset.g:300:7: 'when' event_seq
            {
            root_0 = (Object)adaptor.nil();

            string_literal176=(Token)match(input,68,FOLLOW_68_in_when1705); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal176_tree = (Object)adaptor.create(string_literal176);
            adaptor.addChild(root_0, string_literal176_tree);
            }
            pushFollow(FOLLOW_event_seq_in_when1707);
            event_seq177=event_seq();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, event_seq177.getTree());

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
        return retval;
    }
    // $ANTLR end "when"

    public static class event_seq_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "event_seq"
    // Ruleset.g:302:1: event_seq options {backtrack=true; } : ( event_or 'then' | event_or 'before' | event_or );
    public final RulesetParser.event_seq_return event_seq() throws RecognitionException {
        RulesetParser.event_seq_return retval = new RulesetParser.event_seq_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal179=null;
        Token string_literal181=null;
        RulesetParser.event_or_return event_or178 = null;

        RulesetParser.event_or_return event_or180 = null;

        RulesetParser.event_or_return event_or182 = null;


        Object string_literal179_tree=null;
        Object string_literal181_tree=null;

        try {
            // Ruleset.g:303:2: ( event_or 'then' | event_or 'before' | event_or )
            int alt33=3;
            switch ( input.LA(1) ) {
            case 78:
                {
                int LA33_1 = input.LA(2);

                if ( (synpred4_Ruleset()) ) {
                    alt33=1;
                }
                else if ( (synpred5_Ruleset()) ) {
                    alt33=2;
                }
                else if ( (true) ) {
                    alt33=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    throw nvae;
                }
                }
                break;
            case ID:
                {
                int LA33_2 = input.LA(2);

                if ( (synpred4_Ruleset()) ) {
                    alt33=1;
                }
                else if ( (synpred5_Ruleset()) ) {
                    alt33=2;
                }
                else if ( (true) ) {
                    alt33=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 2, input);

                    throw nvae;
                }
                }
                break;
            case 57:
                {
                int LA33_3 = input.LA(2);

                if ( (synpred4_Ruleset()) ) {
                    alt33=1;
                }
                else if ( (synpred5_Ruleset()) ) {
                    alt33=2;
                }
                else if ( (true) ) {
                    alt33=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // Ruleset.g:303:4: event_or 'then'
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_event_or_in_event_seq1728);
                    event_or178=event_or();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, event_or178.getTree());
                    string_literal179=(Token)match(input,56,FOLLOW_56_in_event_seq1730); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal179_tree = (Object)adaptor.create(string_literal179);
                    adaptor.addChild(root_0, string_literal179_tree);
                    }

                    }
                    break;
                case 2 :
                    // Ruleset.g:304:3: event_or 'before'
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_event_or_in_event_seq1735);
                    event_or180=event_or();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, event_or180.getTree());
                    string_literal181=(Token)match(input,69,FOLLOW_69_in_event_seq1737); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal181_tree = (Object)adaptor.create(string_literal181);
                    adaptor.addChild(root_0, string_literal181_tree);
                    }

                    }
                    break;
                case 3 :
                    // Ruleset.g:305:3: event_or
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_event_or_in_event_seq1742);
                    event_or182=event_or();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, event_or182.getTree());

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
        return retval;
    }
    // $ANTLR end "event_seq"

    public static class event_or_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "event_or"
    // Ruleset.g:308:1: event_or : event_and ( 'or' event_and )* ;
    public final RulesetParser.event_or_return event_or() throws RecognitionException {
        RulesetParser.event_or_return retval = new RulesetParser.event_or_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal184=null;
        RulesetParser.event_and_return event_and183 = null;

        RulesetParser.event_and_return event_and185 = null;


        Object string_literal184_tree=null;

        try {
            // Ruleset.g:308:9: ( event_and ( 'or' event_and )* )
            // Ruleset.g:308:11: event_and ( 'or' event_and )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_event_and_in_event_or1753);
            event_and183=event_and();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, event_and183.getTree());
            // Ruleset.g:308:21: ( 'or' event_and )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==70) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // Ruleset.g:308:22: 'or' event_and
            	    {
            	    string_literal184=(Token)match(input,70,FOLLOW_70_in_event_or1756); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal184_tree = (Object)adaptor.create(string_literal184);
            	    adaptor.addChild(root_0, string_literal184_tree);
            	    }
            	    pushFollow(FOLLOW_event_and_in_event_or1758);
            	    event_and185=event_and();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, event_and185.getTree());

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


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
        return retval;
    }
    // $ANTLR end "event_or"

    public static class event_and_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "event_and"
    // Ruleset.g:310:1: event_and : event_btwn ( 'and' event_btwn )* ;
    public final RulesetParser.event_and_return event_and() throws RecognitionException {
        RulesetParser.event_and_return retval = new RulesetParser.event_and_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal187=null;
        RulesetParser.event_btwn_return event_btwn186 = null;

        RulesetParser.event_btwn_return event_btwn188 = null;


        Object string_literal187_tree=null;

        try {
            // Ruleset.g:311:2: ( event_btwn ( 'and' event_btwn )* )
            // Ruleset.g:311:4: event_btwn ( 'and' event_btwn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_event_btwn_in_event_and1769);
            event_btwn186=event_btwn();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, event_btwn186.getTree());
            // Ruleset.g:311:15: ( 'and' event_btwn )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==61) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // Ruleset.g:311:16: 'and' event_btwn
            	    {
            	    string_literal187=(Token)match(input,61,FOLLOW_61_in_event_and1772); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal187_tree = (Object)adaptor.create(string_literal187);
            	    adaptor.addChild(root_0, string_literal187_tree);
            	    }
            	    pushFollow(FOLLOW_event_btwn_in_event_and1774);
            	    event_btwn188=event_btwn();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, event_btwn188.getTree());

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


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
        return retval;
    }
    // $ANTLR end "event_and"

    public static class event_btwn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "event_btwn"
    // Ruleset.g:314:1: event_btwn : event_prim ( 'not' ) 'between' '(' event_seq ',' event_seq ')' ;
    public final RulesetParser.event_btwn_return event_btwn() throws RecognitionException {
        RulesetParser.event_btwn_return retval = new RulesetParser.event_btwn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal190=null;
        Token string_literal191=null;
        Token char_literal192=null;
        Token char_literal194=null;
        Token char_literal196=null;
        RulesetParser.event_prim_return event_prim189 = null;

        RulesetParser.event_seq_return event_seq193 = null;

        RulesetParser.event_seq_return event_seq195 = null;


        Object string_literal190_tree=null;
        Object string_literal191_tree=null;
        Object char_literal192_tree=null;
        Object char_literal194_tree=null;
        Object char_literal196_tree=null;

        try {
            // Ruleset.g:315:2: ( event_prim ( 'not' ) 'between' '(' event_seq ',' event_seq ')' )
            // Ruleset.g:315:4: event_prim ( 'not' ) 'between' '(' event_seq ',' event_seq ')'
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_event_prim_in_event_btwn1787);
            event_prim189=event_prim();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, event_prim189.getTree());
            // Ruleset.g:315:15: ( 'not' )
            // Ruleset.g:315:16: 'not'
            {
            string_literal190=(Token)match(input,71,FOLLOW_71_in_event_btwn1790); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal190_tree = (Object)adaptor.create(string_literal190);
            adaptor.addChild(root_0, string_literal190_tree);
            }

            }

            string_literal191=(Token)match(input,72,FOLLOW_72_in_event_btwn1793); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal191_tree = (Object)adaptor.create(string_literal191);
            adaptor.addChild(root_0, string_literal191_tree);
            }
            char_literal192=(Token)match(input,57,FOLLOW_57_in_event_btwn1795); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal192_tree = (Object)adaptor.create(char_literal192);
            adaptor.addChild(root_0, char_literal192_tree);
            }
            pushFollow(FOLLOW_event_seq_in_event_btwn1797);
            event_seq193=event_seq();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, event_seq193.getTree());
            char_literal194=(Token)match(input,59,FOLLOW_59_in_event_btwn1799); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal194_tree = (Object)adaptor.create(char_literal194);
            adaptor.addChild(root_0, char_literal194_tree);
            }
            pushFollow(FOLLOW_event_seq_in_event_btwn1801);
            event_seq195=event_seq();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, event_seq195.getTree());
            char_literal196=(Token)match(input,58,FOLLOW_58_in_event_btwn1803); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal196_tree = (Object)adaptor.create(char_literal196);
            adaptor.addChild(root_0, char_literal196_tree);
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
        return retval;
    }
    // $ANTLR end "event_btwn"

    public static class event_prim_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "event_prim"
    // Ruleset.g:318:1: event_prim : ( event_domain 'pageview' ( STRING | REGEXP ) setting | event_domain ( 'submit' | 'click' | 'dblclick' | 'change' | 'update' ) STRING on_expr setting | ID ID event_filter setting | '(' event_seq ')' );
    public final RulesetParser.event_prim_return event_prim() throws RecognitionException {
        RulesetParser.event_prim_return retval = new RulesetParser.event_prim_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal198=null;
        Token set199=null;
        Token set202=null;
        Token STRING203=null;
        Token ID206=null;
        Token ID207=null;
        Token char_literal210=null;
        Token char_literal212=null;
        RulesetParser.event_domain_return event_domain197 = null;

        RulesetParser.setting_return setting200 = null;

        RulesetParser.event_domain_return event_domain201 = null;

        RulesetParser.on_expr_return on_expr204 = null;

        RulesetParser.setting_return setting205 = null;

        RulesetParser.event_filter_return event_filter208 = null;

        RulesetParser.setting_return setting209 = null;

        RulesetParser.event_seq_return event_seq211 = null;


        Object string_literal198_tree=null;
        Object set199_tree=null;
        Object set202_tree=null;
        Object STRING203_tree=null;
        Object ID206_tree=null;
        Object ID207_tree=null;
        Object char_literal210_tree=null;
        Object char_literal212_tree=null;

        try {
            // Ruleset.g:319:2: ( event_domain 'pageview' ( STRING | REGEXP ) setting | event_domain ( 'submit' | 'click' | 'dblclick' | 'change' | 'update' ) STRING on_expr setting | ID ID event_filter setting | '(' event_seq ')' )
            int alt36=4;
            switch ( input.LA(1) ) {
            case 78:
                {
                int LA36_1 = input.LA(2);

                if ( (LA36_1==73) ) {
                    alt36=1;
                }
                else if ( ((LA36_1>=33 && LA36_1<=34)||(LA36_1>=74 && LA36_1<=76)) ) {
                    alt36=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 1, input);

                    throw nvae;
                }
                }
                break;
            case ID:
                {
                alt36=3;
                }
                break;
            case 57:
                {
                alt36=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // Ruleset.g:319:4: event_domain 'pageview' ( STRING | REGEXP ) setting
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_event_domain_in_event_prim1818);
                    event_domain197=event_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, event_domain197.getTree());
                    string_literal198=(Token)match(input,73,FOLLOW_73_in_event_prim1820); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal198_tree = (Object)adaptor.create(string_literal198);
                    adaptor.addChild(root_0, string_literal198_tree);
                    }
                    set199=(Token)input.LT(1);
                    if ( input.LA(1)==REGEXP||input.LA(1)==STRING ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set199));
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_setting_in_event_prim1828);
                    setting200=setting();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, setting200.getTree());

                    }
                    break;
                case 2 :
                    // Ruleset.g:320:2: event_domain ( 'submit' | 'click' | 'dblclick' | 'change' | 'update' ) STRING on_expr setting
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_event_domain_in_event_prim1833);
                    event_domain201=event_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, event_domain201.getTree());
                    set202=(Token)input.LT(1);
                    if ( (input.LA(1)>=33 && input.LA(1)<=34)||(input.LA(1)>=74 && input.LA(1)<=76) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set202));
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    STRING203=(Token)match(input,STRING,FOLLOW_STRING_in_event_prim1847); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING203_tree = (Object)adaptor.create(STRING203);
                    adaptor.addChild(root_0, STRING203_tree);
                    }
                    pushFollow(FOLLOW_on_expr_in_event_prim1849);
                    on_expr204=on_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, on_expr204.getTree());
                    pushFollow(FOLLOW_setting_in_event_prim1852);
                    setting205=setting();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, setting205.getTree());

                    }
                    break;
                case 3 :
                    // Ruleset.g:321:2: ID ID event_filter setting
                    {
                    root_0 = (Object)adaptor.nil();

                    ID206=(Token)match(input,ID,FOLLOW_ID_in_event_prim1857); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID206_tree = (Object)adaptor.create(ID206);
                    adaptor.addChild(root_0, ID206_tree);
                    }
                    ID207=(Token)match(input,ID,FOLLOW_ID_in_event_prim1859); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID207_tree = (Object)adaptor.create(ID207);
                    adaptor.addChild(root_0, ID207_tree);
                    }
                    pushFollow(FOLLOW_event_filter_in_event_prim1861);
                    event_filter208=event_filter();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, event_filter208.getTree());
                    pushFollow(FOLLOW_setting_in_event_prim1863);
                    setting209=setting();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, setting209.getTree());

                    }
                    break;
                case 4 :
                    // Ruleset.g:322:2: '(' event_seq ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal210=(Token)match(input,57,FOLLOW_57_in_event_prim1868); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal210_tree = (Object)adaptor.create(char_literal210);
                    adaptor.addChild(root_0, char_literal210_tree);
                    }
                    pushFollow(FOLLOW_event_seq_in_event_prim1870);
                    event_seq211=event_seq();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, event_seq211.getTree());
                    char_literal212=(Token)match(input,58,FOLLOW_58_in_event_prim1872); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal212_tree = (Object)adaptor.create(char_literal212);
                    adaptor.addChild(root_0, char_literal212_tree);
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
        return retval;
    }
    // $ANTLR end "event_prim"

    public static class setting_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "setting"
    // Ruleset.g:325:1: setting : 'setting' '(' ( ID ( ',' )? )* ')' ;
    public final RulesetParser.setting_return setting() throws RecognitionException {
        RulesetParser.setting_return retval = new RulesetParser.setting_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal213=null;
        Token char_literal214=null;
        Token ID215=null;
        Token char_literal216=null;
        Token char_literal217=null;

        Object string_literal213_tree=null;
        Object char_literal214_tree=null;
        Object ID215_tree=null;
        Object char_literal216_tree=null;
        Object char_literal217_tree=null;

        try {
            // Ruleset.g:325:9: ( 'setting' '(' ( ID ( ',' )? )* ')' )
            // Ruleset.g:325:11: 'setting' '(' ( ID ( ',' )? )* ')'
            {
            root_0 = (Object)adaptor.nil();

            string_literal213=(Token)match(input,77,FOLLOW_77_in_setting1883); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal213_tree = (Object)adaptor.create(string_literal213);
            adaptor.addChild(root_0, string_literal213_tree);
            }
            char_literal214=(Token)match(input,57,FOLLOW_57_in_setting1885); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal214_tree = (Object)adaptor.create(char_literal214);
            adaptor.addChild(root_0, char_literal214_tree);
            }
            // Ruleset.g:325:25: ( ID ( ',' )? )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==ID) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // Ruleset.g:325:26: ID ( ',' )?
            	    {
            	    ID215=(Token)match(input,ID,FOLLOW_ID_in_setting1888); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    ID215_tree = (Object)adaptor.create(ID215);
            	    adaptor.addChild(root_0, ID215_tree);
            	    }
            	    // Ruleset.g:325:29: ( ',' )?
            	    int alt37=2;
            	    int LA37_0 = input.LA(1);

            	    if ( (LA37_0==59) ) {
            	        alt37=1;
            	    }
            	    switch (alt37) {
            	        case 1 :
            	            // Ruleset.g:325:29: ','
            	            {
            	            char_literal216=(Token)match(input,59,FOLLOW_59_in_setting1890); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal216_tree = (Object)adaptor.create(char_literal216);
            	            adaptor.addChild(root_0, char_literal216_tree);
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            char_literal217=(Token)match(input,58,FOLLOW_58_in_setting1895); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal217_tree = (Object)adaptor.create(char_literal217);
            adaptor.addChild(root_0, char_literal217_tree);
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
        return retval;
    }
    // $ANTLR end "setting"

    public static class event_domain_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "event_domain"
    // Ruleset.g:327:1: event_domain : 'web' ;
    public final RulesetParser.event_domain_return event_domain() throws RecognitionException {
        RulesetParser.event_domain_return retval = new RulesetParser.event_domain_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal218=null;

        Object string_literal218_tree=null;

        try {
            // Ruleset.g:328:2: ( 'web' )
            // Ruleset.g:328:4: 'web'
            {
            root_0 = (Object)adaptor.nil();

            string_literal218=(Token)match(input,78,FOLLOW_78_in_event_domain1905); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal218_tree = (Object)adaptor.create(string_literal218);
            adaptor.addChild(root_0, string_literal218_tree);
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
        return retval;
    }
    // $ANTLR end "event_domain"

    public static class event_filter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "event_filter"
    // Ruleset.g:331:1: event_filter : ID ( STRING | REGEXP ) ;
    public final RulesetParser.event_filter_return event_filter() throws RecognitionException {
        RulesetParser.event_filter_return retval = new RulesetParser.event_filter_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID219=null;
        Token set220=null;

        Object ID219_tree=null;
        Object set220_tree=null;

        try {
            // Ruleset.g:332:2: ( ID ( STRING | REGEXP ) )
            // Ruleset.g:332:4: ID ( STRING | REGEXP )
            {
            root_0 = (Object)adaptor.nil();

            ID219=(Token)match(input,ID,FOLLOW_ID_in_event_filter1919); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID219_tree = (Object)adaptor.create(ID219);
            adaptor.addChild(root_0, ID219_tree);
            }
            set220=(Token)input.LT(1);
            if ( input.LA(1)==REGEXP||input.LA(1)==STRING ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set220));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
        return retval;
    }
    // $ANTLR end "event_filter"

    public static class on_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "on_expr"
    // Ruleset.g:335:1: on_expr : 'on' ( STRING | REGEXP ) ;
    public final RulesetParser.on_expr_return on_expr() throws RecognitionException {
        RulesetParser.on_expr_return retval = new RulesetParser.on_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal221=null;
        Token set222=null;

        Object string_literal221_tree=null;
        Object set222_tree=null;

        try {
            // Ruleset.g:335:9: ( 'on' ( STRING | REGEXP ) )
            // Ruleset.g:335:11: 'on' ( STRING | REGEXP )
            {
            root_0 = (Object)adaptor.nil();

            string_literal221=(Token)match(input,79,FOLLOW_79_in_on_expr1939); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal221_tree = (Object)adaptor.create(string_literal221);
            adaptor.addChild(root_0, string_literal221_tree);
            }
            set222=(Token)input.LT(1);
            if ( input.LA(1)==REGEXP||input.LA(1)==STRING ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set222));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
        return retval;
    }
    // $ANTLR end "on_expr"

    public static class global_decls_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "global_decls"
    // Ruleset.g:339:1: global_decls : 'global' '{' ( global ';' )+ '}' ;
    public final RulesetParser.global_decls_return global_decls() throws RecognitionException {
        RulesetParser.global_decls_return retval = new RulesetParser.global_decls_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal223=null;
        Token char_literal224=null;
        Token char_literal226=null;
        Token char_literal227=null;
        RulesetParser.global_return global225 = null;


        Object string_literal223_tree=null;
        Object char_literal224_tree=null;
        Object char_literal226_tree=null;
        Object char_literal227_tree=null;

        try {
            // Ruleset.g:340:2: ( 'global' '{' ( global ';' )+ '}' )
            // Ruleset.g:340:4: 'global' '{' ( global ';' )+ '}'
            {
            root_0 = (Object)adaptor.nil();

            string_literal223=(Token)match(input,80,FOLLOW_80_in_global_decls1965); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal223_tree = (Object)adaptor.create(string_literal223);
            adaptor.addChild(root_0, string_literal223_tree);
            }
            char_literal224=(Token)match(input,20,FOLLOW_20_in_global_decls1967); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal224_tree = (Object)adaptor.create(char_literal224);
            adaptor.addChild(root_0, char_literal224_tree);
            }
            // Ruleset.g:340:17: ( global ';' )+
            int cnt39=0;
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==ID||LA39_0==81||LA39_0==83||(LA39_0>=136 && LA39_0<=137)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // Ruleset.g:340:19: global ';'
            	    {
            	    pushFollow(FOLLOW_global_in_global_decls1971);
            	    global225=global();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, global225.getTree());
            	    char_literal226=(Token)match(input,24,FOLLOW_24_in_global_decls1973); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal226_tree = (Object)adaptor.create(char_literal226);
            	    adaptor.addChild(root_0, char_literal226_tree);
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt39 >= 1 ) break loop39;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(39, input);
                        throw eee;
                }
                cnt39++;
            } while (true);

            char_literal227=(Token)match(input,21,FOLLOW_21_in_global_decls1978); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal227_tree = (Object)adaptor.create(char_literal227);
            adaptor.addChild(root_0, char_literal227_tree);
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
        return retval;
    }
    // $ANTLR end "global_decls"

    public static class global_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "global"
    // Ruleset.g:343:1: global : ( emit_block | dataset | datasource | css_emit | decl );
    public final RulesetParser.global_return global() throws RecognitionException {
        RulesetParser.global_return retval = new RulesetParser.global_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RulesetParser.emit_block_return emit_block228 = null;

        RulesetParser.dataset_return dataset229 = null;

        RulesetParser.datasource_return datasource230 = null;

        RulesetParser.css_emit_return css_emit231 = null;

        RulesetParser.decl_return decl232 = null;



        try {
            // Ruleset.g:343:9: ( emit_block | dataset | datasource | css_emit | decl )
            int alt40=5;
            switch ( input.LA(1) ) {
            case 136:
                {
                alt40=1;
                }
                break;
            case 137:
                {
                alt40=2;
                }
                break;
            case 81:
                {
                alt40=3;
                }
                break;
            case 83:
                {
                alt40=4;
                }
                break;
            case ID:
                {
                alt40=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // Ruleset.g:343:11: emit_block
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_emit_block_in_global1994);
                    emit_block228=emit_block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, emit_block228.getTree());

                    }
                    break;
                case 2 :
                    // Ruleset.g:343:24: dataset
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_dataset_in_global1998);
                    dataset229=dataset();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dataset229.getTree());

                    }
                    break;
                case 3 :
                    // Ruleset.g:343:34: datasource
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_datasource_in_global2002);
                    datasource230=datasource();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, datasource230.getTree());

                    }
                    break;
                case 4 :
                    // Ruleset.g:343:47: css_emit
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_css_emit_in_global2006);
                    css_emit231=css_emit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, css_emit231.getTree());

                    }
                    break;
                case 5 :
                    // Ruleset.g:343:58: decl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_decl_in_global2010);
                    decl232=decl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, decl232.getTree());

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
        return retval;
    }
    // $ANTLR end "global"

    public static class datasource_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "datasource"
    // Ruleset.g:346:1: datasource : 'datasource' ID ( datatype )? '<-' STRING cachable ;
    public final RulesetParser.datasource_return datasource() throws RecognitionException {
        RulesetParser.datasource_return retval = new RulesetParser.datasource_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal233=null;
        Token ID234=null;
        Token string_literal236=null;
        Token STRING237=null;
        RulesetParser.datatype_return datatype235 = null;

        RulesetParser.cachable_return cachable238 = null;


        Object string_literal233_tree=null;
        Object ID234_tree=null;
        Object string_literal236_tree=null;
        Object STRING237_tree=null;

        try {
            // Ruleset.g:347:2: ( 'datasource' ID ( datatype )? '<-' STRING cachable )
            // Ruleset.g:347:5: 'datasource' ID ( datatype )? '<-' STRING cachable
            {
            root_0 = (Object)adaptor.nil();

            string_literal233=(Token)match(input,81,FOLLOW_81_in_datasource2022); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal233_tree = (Object)adaptor.create(string_literal233);
            adaptor.addChild(root_0, string_literal233_tree);
            }
            ID234=(Token)match(input,ID,FOLLOW_ID_in_datasource2024); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID234_tree = (Object)adaptor.create(ID234);
            adaptor.addChild(root_0, ID234_tree);
            }
            // Ruleset.g:347:21: ( datatype )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==38) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // Ruleset.g:347:21: datatype
                    {
                    pushFollow(FOLLOW_datatype_in_datasource2026);
                    datatype235=datatype();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, datatype235.getTree());

                    }
                    break;

            }

            string_literal236=(Token)match(input,82,FOLLOW_82_in_datasource2029); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal236_tree = (Object)adaptor.create(string_literal236);
            adaptor.addChild(root_0, string_literal236_tree);
            }
            STRING237=(Token)match(input,STRING,FOLLOW_STRING_in_datasource2031); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING237_tree = (Object)adaptor.create(STRING237);
            adaptor.addChild(root_0, STRING237_tree);
            }
            pushFollow(FOLLOW_cachable_in_datasource2033);
            cachable238=cachable();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cachable238.getTree());

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
        return retval;
    }
    // $ANTLR end "datasource"

    public static class css_emit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "css_emit"
    // Ruleset.g:350:1: css_emit : 'css' ( HTML | STRING ) ;
    public final RulesetParser.css_emit_return css_emit() throws RecognitionException {
        RulesetParser.css_emit_return retval = new RulesetParser.css_emit_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal239=null;
        Token set240=null;

        Object string_literal239_tree=null;
        Object set240_tree=null;

        try {
            // Ruleset.g:351:2: ( 'css' ( HTML | STRING ) )
            // Ruleset.g:351:4: 'css' ( HTML | STRING )
            {
            root_0 = (Object)adaptor.nil();

            string_literal239=(Token)match(input,83,FOLLOW_83_in_css_emit2045); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal239_tree = (Object)adaptor.create(string_literal239);
            adaptor.addChild(root_0, string_literal239_tree);
            }
            set240=(Token)input.LT(1);
            if ( input.LA(1)==STRING||input.LA(1)==HTML ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set240));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
        return retval;
    }
    // $ANTLR end "css_emit"

    public static class decl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "decl"
    // Ruleset.g:354:1: decl options {backtrack=true; } : ( ID '=' HTML | ID '=' JS | ID '=' expr );
    public final RulesetParser.decl_return decl() throws RecognitionException {
        RulesetParser.decl_return retval = new RulesetParser.decl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID241=null;
        Token char_literal242=null;
        Token HTML243=null;
        Token ID244=null;
        Token char_literal245=null;
        Token JS246=null;
        Token ID247=null;
        Token char_literal248=null;
        RulesetParser.expr_return expr249 = null;


        Object ID241_tree=null;
        Object char_literal242_tree=null;
        Object HTML243_tree=null;
        Object ID244_tree=null;
        Object char_literal245_tree=null;
        Object JS246_tree=null;
        Object ID247_tree=null;
        Object char_literal248_tree=null;

        try {
            // Ruleset.g:354:39: ( ID '=' HTML | ID '=' JS | ID '=' expr )
            int alt42=3;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==ID) ) {
                int LA42_1 = input.LA(2);

                if ( (LA42_1==35) ) {
                    switch ( input.LA(3) ) {
                    case HTML:
                        {
                        alt42=1;
                        }
                        break;
                    case JS:
                        {
                        alt42=2;
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
                        alt42=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 42, 2, input);

                        throw nvae;
                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // Ruleset.g:355:2: ID '=' HTML
                    {
                    root_0 = (Object)adaptor.nil();

                    ID241=(Token)match(input,ID,FOLLOW_ID_in_decl2081); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID241_tree = (Object)adaptor.create(ID241);
                    adaptor.addChild(root_0, ID241_tree);
                    }
                    char_literal242=(Token)match(input,35,FOLLOW_35_in_decl2083); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal242_tree = (Object)adaptor.create(char_literal242);
                    adaptor.addChild(root_0, char_literal242_tree);
                    }
                    HTML243=(Token)match(input,HTML,FOLLOW_HTML_in_decl2085); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    HTML243_tree = (Object)adaptor.create(HTML243);
                    adaptor.addChild(root_0, HTML243_tree);
                    }

                    }
                    break;
                case 2 :
                    // Ruleset.g:356:2: ID '=' JS
                    {
                    root_0 = (Object)adaptor.nil();

                    ID244=(Token)match(input,ID,FOLLOW_ID_in_decl2090); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID244_tree = (Object)adaptor.create(ID244);
                    adaptor.addChild(root_0, ID244_tree);
                    }
                    char_literal245=(Token)match(input,35,FOLLOW_35_in_decl2092); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal245_tree = (Object)adaptor.create(char_literal245);
                    adaptor.addChild(root_0, char_literal245_tree);
                    }
                    JS246=(Token)match(input,JS,FOLLOW_JS_in_decl2094); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    JS246_tree = (Object)adaptor.create(JS246);
                    adaptor.addChild(root_0, JS246_tree);
                    }

                    }
                    break;
                case 3 :
                    // Ruleset.g:357:2: ID '=' expr
                    {
                    root_0 = (Object)adaptor.nil();

                    ID247=(Token)match(input,ID,FOLLOW_ID_in_decl2099); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID247_tree = (Object)adaptor.create(ID247);
                    adaptor.addChild(root_0, ID247_tree);
                    }
                    char_literal248=(Token)match(input,35,FOLLOW_35_in_decl2101); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal248_tree = (Object)adaptor.create(char_literal248);
                    adaptor.addChild(root_0, char_literal248_tree);
                    }
                    pushFollow(FOLLOW_expr_in_decl2103);
                    expr249=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr249.getTree());

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
        return retval;
    }
    // $ANTLR end "decl"

    public static class expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // Ruleset.g:362:1: expr options {backtrack=true; } : ( function_def | conditional_expression );
    public final RulesetParser.expr_return expr() throws RecognitionException {
        RulesetParser.expr_return retval = new RulesetParser.expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RulesetParser.function_def_return function_def250 = null;

        RulesetParser.conditional_expression_return conditional_expression251 = null;



        try {
            // Ruleset.g:362:36: ( function_def | conditional_expression )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==84) ) {
                alt43=1;
            }
            else if ( ((LA43_0>=ID && LA43_0<=INT)||LA43_0==REGEXP||LA43_0==STRING||LA43_0==20||LA43_0==57||LA43_0==71||LA43_0==102||(LA43_0>=104 && LA43_0<=106)||(LA43_0>=108 && LA43_0<=109)||(LA43_0>=134 && LA43_0<=135)) ) {
                alt43=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // Ruleset.g:362:38: function_def
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_function_def_in_expr2133);
                    function_def250=function_def();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_def250.getTree());

                    }
                    break;
                case 2 :
                    // Ruleset.g:362:53: conditional_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_conditional_expression_in_expr2137);
                    conditional_expression251=conditional_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditional_expression251.getTree());

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
        return retval;
    }
    // $ANTLR end "expr"

    public static class function_def_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function_def"
    // Ruleset.g:365:1: function_def options {backtrack=true; } : 'function' '(' ( ID ( ',' )? )* ')' '{' ( fundecls )* expr ( ';' )? '}' ;
    public final RulesetParser.function_def_return function_def() throws RecognitionException {
        RulesetParser.function_def_return retval = new RulesetParser.function_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal252=null;
        Token char_literal253=null;
        Token ID254=null;
        Token char_literal255=null;
        Token char_literal256=null;
        Token char_literal257=null;
        Token char_literal260=null;
        Token char_literal261=null;
        RulesetParser.fundecls_return fundecls258 = null;

        RulesetParser.expr_return expr259 = null;


        Object string_literal252_tree=null;
        Object char_literal253_tree=null;
        Object ID254_tree=null;
        Object char_literal255_tree=null;
        Object char_literal256_tree=null;
        Object char_literal257_tree=null;
        Object char_literal260_tree=null;
        Object char_literal261_tree=null;

        try {
            // Ruleset.g:366:2: ( 'function' '(' ( ID ( ',' )? )* ')' '{' ( fundecls )* expr ( ';' )? '}' )
            // Ruleset.g:366:4: 'function' '(' ( ID ( ',' )? )* ')' '{' ( fundecls )* expr ( ';' )? '}'
            {
            root_0 = (Object)adaptor.nil();

            string_literal252=(Token)match(input,84,FOLLOW_84_in_function_def2162); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal252_tree = (Object)adaptor.create(string_literal252);
            adaptor.addChild(root_0, string_literal252_tree);
            }
            char_literal253=(Token)match(input,57,FOLLOW_57_in_function_def2164); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal253_tree = (Object)adaptor.create(char_literal253);
            adaptor.addChild(root_0, char_literal253_tree);
            }
            // Ruleset.g:366:19: ( ID ( ',' )? )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==ID) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // Ruleset.g:366:20: ID ( ',' )?
            	    {
            	    ID254=(Token)match(input,ID,FOLLOW_ID_in_function_def2167); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    ID254_tree = (Object)adaptor.create(ID254);
            	    adaptor.addChild(root_0, ID254_tree);
            	    }
            	    // Ruleset.g:366:23: ( ',' )?
            	    int alt44=2;
            	    int LA44_0 = input.LA(1);

            	    if ( (LA44_0==59) ) {
            	        alt44=1;
            	    }
            	    switch (alt44) {
            	        case 1 :
            	            // Ruleset.g:366:23: ','
            	            {
            	            char_literal255=(Token)match(input,59,FOLLOW_59_in_function_def2169); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal255_tree = (Object)adaptor.create(char_literal255);
            	            adaptor.addChild(root_0, char_literal255_tree);
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            char_literal256=(Token)match(input,58,FOLLOW_58_in_function_def2174); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal256_tree = (Object)adaptor.create(char_literal256);
            adaptor.addChild(root_0, char_literal256_tree);
            }
            char_literal257=(Token)match(input,20,FOLLOW_20_in_function_def2176); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal257_tree = (Object)adaptor.create(char_literal257);
            adaptor.addChild(root_0, char_literal257_tree);
            }
            // Ruleset.g:366:38: ( fundecls )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==ID) ) {
                    int LA46_2 = input.LA(2);

                    if ( (LA46_2==35) ) {
                        alt46=1;
                    }


                }


                switch (alt46) {
            	case 1 :
            	    // Ruleset.g:366:38: fundecls
            	    {
            	    pushFollow(FOLLOW_fundecls_in_function_def2178);
            	    fundecls258=fundecls();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, fundecls258.getTree());

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            pushFollow(FOLLOW_expr_in_function_def2181);
            expr259=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr259.getTree());
            // Ruleset.g:366:53: ( ';' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==24) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // Ruleset.g:366:53: ';'
                    {
                    char_literal260=(Token)match(input,24,FOLLOW_24_in_function_def2183); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal260_tree = (Object)adaptor.create(char_literal260);
                    adaptor.addChild(root_0, char_literal260_tree);
                    }

                    }
                    break;

            }

            char_literal261=(Token)match(input,21,FOLLOW_21_in_function_def2186); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal261_tree = (Object)adaptor.create(char_literal261);
            adaptor.addChild(root_0, char_literal261_tree);
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
        return retval;
    }
    // $ANTLR end "function_def"

    public static class fundecls_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fundecls"
    // Ruleset.g:369:1: fundecls options {backtrack=true; } : decl ';' ;
    public final RulesetParser.fundecls_return fundecls() throws RecognitionException {
        RulesetParser.fundecls_return retval = new RulesetParser.fundecls_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal263=null;
        RulesetParser.decl_return decl262 = null;


        Object char_literal263_tree=null;

        try {
            // Ruleset.g:370:2: ( decl ';' )
            // Ruleset.g:370:4: decl ';'
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_decl_in_fundecls2210);
            decl262=decl();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, decl262.getTree());
            char_literal263=(Token)match(input,24,FOLLOW_24_in_fundecls2212); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal263_tree = (Object)adaptor.create(char_literal263);
            adaptor.addChild(root_0, char_literal263_tree);
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
        return retval;
    }
    // $ANTLR end "fundecls"

    public static class conditional_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditional_expression"
    // Ruleset.g:375:1: conditional_expression options {backtrack=true; } : ( disjunction '=>' expr '|' expr | disjunction );
    public final RulesetParser.conditional_expression_return conditional_expression() throws RecognitionException {
        RulesetParser.conditional_expression_return retval = new RulesetParser.conditional_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal265=null;
        Token char_literal267=null;
        RulesetParser.disjunction_return disjunction264 = null;

        RulesetParser.expr_return expr266 = null;

        RulesetParser.expr_return expr268 = null;

        RulesetParser.disjunction_return disjunction269 = null;


        Object string_literal265_tree=null;
        Object char_literal267_tree=null;

        try {
            // Ruleset.g:376:2: ( disjunction '=>' expr '|' expr | disjunction )
            int alt48=2;
            alt48 = dfa48.predict(input);
            switch (alt48) {
                case 1 :
                    // Ruleset.g:376:4: disjunction '=>' expr '|' expr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_disjunction_in_conditional_expression2238);
                    disjunction264=disjunction();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, disjunction264.getTree());
                    string_literal265=(Token)match(input,60,FOLLOW_60_in_conditional_expression2240); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal265_tree = (Object)adaptor.create(string_literal265);
                    adaptor.addChild(root_0, string_literal265_tree);
                    }
                    pushFollow(FOLLOW_expr_in_conditional_expression2242);
                    expr266=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr266.getTree());
                    char_literal267=(Token)match(input,85,FOLLOW_85_in_conditional_expression2244); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal267_tree = (Object)adaptor.create(char_literal267);
                    adaptor.addChild(root_0, char_literal267_tree);
                    }
                    pushFollow(FOLLOW_expr_in_conditional_expression2246);
                    expr268=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr268.getTree());

                    }
                    break;
                case 2 :
                    // Ruleset.g:376:37: disjunction
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_disjunction_in_conditional_expression2250);
                    disjunction269=disjunction();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, disjunction269.getTree());

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
        return retval;
    }
    // $ANTLR end "conditional_expression"

    public static class disjunction_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "disjunction"
    // Ruleset.g:379:1: disjunction : conjunction ( '||' conjunction )* ;
    public final RulesetParser.disjunction_return disjunction() throws RecognitionException {
        RulesetParser.disjunction_return retval = new RulesetParser.disjunction_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal271=null;
        RulesetParser.conjunction_return conjunction270 = null;

        RulesetParser.conjunction_return conjunction272 = null;


        Object string_literal271_tree=null;

        try {
            // Ruleset.g:380:2: ( conjunction ( '||' conjunction )* )
            // Ruleset.g:380:4: conjunction ( '||' conjunction )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_conjunction_in_disjunction2263);
            conjunction270=conjunction();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conjunction270.getTree());
            // Ruleset.g:380:16: ( '||' conjunction )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==86) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // Ruleset.g:380:17: '||' conjunction
            	    {
            	    string_literal271=(Token)match(input,86,FOLLOW_86_in_disjunction2266); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal271_tree = (Object)adaptor.create(string_literal271);
            	    adaptor.addChild(root_0, string_literal271_tree);
            	    }
            	    pushFollow(FOLLOW_conjunction_in_disjunction2268);
            	    conjunction272=conjunction();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, conjunction272.getTree());

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


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
        return retval;
    }
    // $ANTLR end "disjunction"

    public static class conjunction_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conjunction"
    // Ruleset.g:383:1: conjunction : equality_expr ( '&&' equality_expr )* ;
    public final RulesetParser.conjunction_return conjunction() throws RecognitionException {
        RulesetParser.conjunction_return retval = new RulesetParser.conjunction_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal274=null;
        RulesetParser.equality_expr_return equality_expr273 = null;

        RulesetParser.equality_expr_return equality_expr275 = null;


        Object string_literal274_tree=null;

        try {
            // Ruleset.g:384:2: ( equality_expr ( '&&' equality_expr )* )
            // Ruleset.g:384:4: equality_expr ( '&&' equality_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equality_expr_in_conjunction2284);
            equality_expr273=equality_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equality_expr273.getTree());
            // Ruleset.g:384:18: ( '&&' equality_expr )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==87) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // Ruleset.g:384:19: '&&' equality_expr
            	    {
            	    string_literal274=(Token)match(input,87,FOLLOW_87_in_conjunction2287); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal274_tree = (Object)adaptor.create(string_literal274);
            	    adaptor.addChild(root_0, string_literal274_tree);
            	    }
            	    pushFollow(FOLLOW_equality_expr_in_conjunction2289);
            	    equality_expr275=equality_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, equality_expr275.getTree());

            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);


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
        return retval;
    }
    // $ANTLR end "conjunction"

    public static class equality_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equality_expr"
    // Ruleset.g:387:1: equality_expr : add_expr ( predop add_expr )* ;
    public final RulesetParser.equality_expr_return equality_expr() throws RecognitionException {
        RulesetParser.equality_expr_return retval = new RulesetParser.equality_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RulesetParser.add_expr_return add_expr276 = null;

        RulesetParser.predop_return predop277 = null;

        RulesetParser.add_expr_return add_expr278 = null;



        try {
            // Ruleset.g:388:2: ( add_expr ( predop add_expr )* )
            // Ruleset.g:388:4: add_expr ( predop add_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_add_expr_in_equality_expr2304);
            add_expr276=add_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, add_expr276.getTree());
            // Ruleset.g:388:13: ( predop add_expr )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( ((LA51_0>=88 && LA51_0<=96)) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // Ruleset.g:388:14: predop add_expr
            	    {
            	    pushFollow(FOLLOW_predop_in_equality_expr2307);
            	    predop277=predop();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, predop277.getTree());
            	    pushFollow(FOLLOW_add_expr_in_equality_expr2309);
            	    add_expr278=add_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, add_expr278.getTree());

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);


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
        return retval;
    }
    // $ANTLR end "equality_expr"

    public static class predop_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "predop"
    // Ruleset.g:391:1: predop : ( '<=' | '>=' | '<' | '>' | '==' | '!=' | 'eq' | 'neq' | 'like' );
    public final RulesetParser.predop_return predop() throws RecognitionException {
        RulesetParser.predop_return retval = new RulesetParser.predop_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set279=null;

        Object set279_tree=null;

        try {
            // Ruleset.g:391:7: ( '<=' | '>=' | '<' | '>' | '==' | '!=' | 'eq' | 'neq' | 'like' )
            // Ruleset.g:
            {
            root_0 = (Object)adaptor.nil();

            set279=(Token)input.LT(1);
            if ( (input.LA(1)>=88 && input.LA(1)<=96) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set279));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
        return retval;
    }
    // $ANTLR end "predop"

    public static class add_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "add_expr"
    // Ruleset.g:393:1: add_expr : mult_expr ( add_op mult_expr )* ;
    public final RulesetParser.add_expr_return add_expr() throws RecognitionException {
        RulesetParser.add_expr_return retval = new RulesetParser.add_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RulesetParser.mult_expr_return mult_expr280 = null;

        RulesetParser.add_op_return add_op281 = null;

        RulesetParser.mult_expr_return mult_expr282 = null;



        try {
            // Ruleset.g:393:10: ( mult_expr ( add_op mult_expr )* )
            // Ruleset.g:393:12: mult_expr ( add_op mult_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_mult_expr_in_add_expr2364);
            mult_expr280=mult_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, mult_expr280.getTree());
            // Ruleset.g:393:22: ( add_op mult_expr )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( ((LA52_0>=97 && LA52_0<=98)) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // Ruleset.g:393:23: add_op mult_expr
            	    {
            	    pushFollow(FOLLOW_add_op_in_add_expr2367);
            	    add_op281=add_op();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, add_op281.getTree());
            	    pushFollow(FOLLOW_mult_expr_in_add_expr2369);
            	    mult_expr282=mult_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, mult_expr282.getTree());

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);


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
        return retval;
    }
    // $ANTLR end "add_expr"

    public static class add_op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "add_op"
    // Ruleset.g:395:1: add_op : ( '+' | '-' );
    public final RulesetParser.add_op_return add_op() throws RecognitionException {
        RulesetParser.add_op_return retval = new RulesetParser.add_op_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set283=null;

        Object set283_tree=null;

        try {
            // Ruleset.g:395:7: ( '+' | '-' )
            // Ruleset.g:
            {
            root_0 = (Object)adaptor.nil();

            set283=(Token)input.LT(1);
            if ( (input.LA(1)>=97 && input.LA(1)<=98) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set283));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
        return retval;
    }
    // $ANTLR end "add_op"

    public static class mult_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mult_expr"
    // Ruleset.g:397:1: mult_expr : unary_expr ( mult_op unary_expr )* ;
    public final RulesetParser.mult_expr_return mult_expr() throws RecognitionException {
        RulesetParser.mult_expr_return retval = new RulesetParser.mult_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RulesetParser.unary_expr_return unary_expr284 = null;

        RulesetParser.mult_op_return mult_op285 = null;

        RulesetParser.unary_expr_return unary_expr286 = null;



        try {
            // Ruleset.g:398:2: ( unary_expr ( mult_op unary_expr )* )
            // Ruleset.g:398:4: unary_expr ( mult_op unary_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_unary_expr_in_mult_expr2391);
            unary_expr284=unary_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expr284.getTree());
            // Ruleset.g:398:15: ( mult_op unary_expr )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( ((LA53_0>=99 && LA53_0<=101)) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // Ruleset.g:398:16: mult_op unary_expr
            	    {
            	    pushFollow(FOLLOW_mult_op_in_mult_expr2394);
            	    mult_op285=mult_op();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, mult_op285.getTree());
            	    pushFollow(FOLLOW_unary_expr_in_mult_expr2396);
            	    unary_expr286=unary_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expr286.getTree());

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);


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
        return retval;
    }
    // $ANTLR end "mult_expr"

    public static class mult_op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mult_op"
    // Ruleset.g:401:1: mult_op : ( '*' | '/' | '%' );
    public final RulesetParser.mult_op_return mult_op() throws RecognitionException {
        RulesetParser.mult_op_return retval = new RulesetParser.mult_op_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set287=null;

        Object set287_tree=null;

        try {
            // Ruleset.g:401:8: ( '*' | '/' | '%' )
            // Ruleset.g:
            {
            root_0 = (Object)adaptor.nil();

            set287=(Token)input.LT(1);
            if ( (input.LA(1)>=99 && input.LA(1)<=101) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set287));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
        return retval;
    }
    // $ANTLR end "mult_op"

    public static class unary_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unary_expr"
    // Ruleset.g:403:1: unary_expr options {backtrack=true; } : ( 'not' unary_expr | 'seen' STRING 'in' var_domain ':' ID timeframe | 'seen' STRING ( 'before' | 'after' ) STRING 'in' var_domain ':' ID | var_domain ':' ID predop expr timeframe | var_domain ':' ID timeframe | operator_expr );
    public final RulesetParser.unary_expr_return unary_expr() throws RecognitionException {
        RulesetParser.unary_expr_return retval = new RulesetParser.unary_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal288=null;
        Token string_literal290=null;
        Token STRING291=null;
        Token string_literal292=null;
        Token char_literal294=null;
        Token ID295=null;
        Token string_literal297=null;
        Token STRING298=null;
        Token set299=null;
        Token STRING300=null;
        Token string_literal301=null;
        Token char_literal303=null;
        Token ID304=null;
        Token char_literal306=null;
        Token ID307=null;
        Token char_literal312=null;
        Token ID313=null;
        RulesetParser.unary_expr_return unary_expr289 = null;

        RulesetParser.var_domain_return var_domain293 = null;

        RulesetParser.timeframe_return timeframe296 = null;

        RulesetParser.var_domain_return var_domain302 = null;

        RulesetParser.var_domain_return var_domain305 = null;

        RulesetParser.predop_return predop308 = null;

        RulesetParser.expr_return expr309 = null;

        RulesetParser.timeframe_return timeframe310 = null;

        RulesetParser.var_domain_return var_domain311 = null;

        RulesetParser.timeframe_return timeframe314 = null;

        RulesetParser.operator_expr_return operator_expr315 = null;


        Object string_literal288_tree=null;
        Object string_literal290_tree=null;
        Object STRING291_tree=null;
        Object string_literal292_tree=null;
        Object char_literal294_tree=null;
        Object ID295_tree=null;
        Object string_literal297_tree=null;
        Object STRING298_tree=null;
        Object set299_tree=null;
        Object STRING300_tree=null;
        Object string_literal301_tree=null;
        Object char_literal303_tree=null;
        Object ID304_tree=null;
        Object char_literal306_tree=null;
        Object ID307_tree=null;
        Object char_literal312_tree=null;
        Object ID313_tree=null;

        try {
            // Ruleset.g:404:2: ( 'not' unary_expr | 'seen' STRING 'in' var_domain ':' ID timeframe | 'seen' STRING ( 'before' | 'after' ) STRING 'in' var_domain ':' ID | var_domain ':' ID predop expr timeframe | var_domain ':' ID timeframe | operator_expr )
            int alt54=6;
            alt54 = dfa54.predict(input);
            switch (alt54) {
                case 1 :
                    // Ruleset.g:404:4: 'not' unary_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal288=(Token)match(input,71,FOLLOW_71_in_unary_expr2431); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal288_tree = (Object)adaptor.create(string_literal288);
                    adaptor.addChild(root_0, string_literal288_tree);
                    }
                    pushFollow(FOLLOW_unary_expr_in_unary_expr2433);
                    unary_expr289=unary_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expr289.getTree());

                    }
                    break;
                case 2 :
                    // Ruleset.g:405:2: 'seen' STRING 'in' var_domain ':' ID timeframe
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal290=(Token)match(input,102,FOLLOW_102_in_unary_expr2439); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal290_tree = (Object)adaptor.create(string_literal290);
                    adaptor.addChild(root_0, string_literal290_tree);
                    }
                    STRING291=(Token)match(input,STRING,FOLLOW_STRING_in_unary_expr2441); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING291_tree = (Object)adaptor.create(STRING291);
                    adaptor.addChild(root_0, STRING291_tree);
                    }
                    string_literal292=(Token)match(input,41,FOLLOW_41_in_unary_expr2443); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal292_tree = (Object)adaptor.create(string_literal292);
                    adaptor.addChild(root_0, string_literal292_tree);
                    }
                    pushFollow(FOLLOW_var_domain_in_unary_expr2445);
                    var_domain293=var_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, var_domain293.getTree());
                    char_literal294=(Token)match(input,38,FOLLOW_38_in_unary_expr2447); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal294_tree = (Object)adaptor.create(char_literal294);
                    adaptor.addChild(root_0, char_literal294_tree);
                    }
                    ID295=(Token)match(input,ID,FOLLOW_ID_in_unary_expr2449); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID295_tree = (Object)adaptor.create(ID295);
                    adaptor.addChild(root_0, ID295_tree);
                    }
                    pushFollow(FOLLOW_timeframe_in_unary_expr2451);
                    timeframe296=timeframe();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeframe296.getTree());

                    }
                    break;
                case 3 :
                    // Ruleset.g:406:2: 'seen' STRING ( 'before' | 'after' ) STRING 'in' var_domain ':' ID
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal297=(Token)match(input,102,FOLLOW_102_in_unary_expr2456); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal297_tree = (Object)adaptor.create(string_literal297);
                    adaptor.addChild(root_0, string_literal297_tree);
                    }
                    STRING298=(Token)match(input,STRING,FOLLOW_STRING_in_unary_expr2458); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING298_tree = (Object)adaptor.create(STRING298);
                    adaptor.addChild(root_0, STRING298_tree);
                    }
                    set299=(Token)input.LT(1);
                    if ( input.LA(1)==69||input.LA(1)==103 ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set299));
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    STRING300=(Token)match(input,STRING,FOLLOW_STRING_in_unary_expr2468); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING300_tree = (Object)adaptor.create(STRING300);
                    adaptor.addChild(root_0, STRING300_tree);
                    }
                    string_literal301=(Token)match(input,41,FOLLOW_41_in_unary_expr2470); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal301_tree = (Object)adaptor.create(string_literal301);
                    adaptor.addChild(root_0, string_literal301_tree);
                    }
                    pushFollow(FOLLOW_var_domain_in_unary_expr2472);
                    var_domain302=var_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, var_domain302.getTree());
                    char_literal303=(Token)match(input,38,FOLLOW_38_in_unary_expr2474); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal303_tree = (Object)adaptor.create(char_literal303);
                    adaptor.addChild(root_0, char_literal303_tree);
                    }
                    ID304=(Token)match(input,ID,FOLLOW_ID_in_unary_expr2476); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID304_tree = (Object)adaptor.create(ID304);
                    adaptor.addChild(root_0, ID304_tree);
                    }

                    }
                    break;
                case 4 :
                    // Ruleset.g:407:2: var_domain ':' ID predop expr timeframe
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_var_domain_in_unary_expr2481);
                    var_domain305=var_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, var_domain305.getTree());
                    char_literal306=(Token)match(input,38,FOLLOW_38_in_unary_expr2483); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal306_tree = (Object)adaptor.create(char_literal306);
                    adaptor.addChild(root_0, char_literal306_tree);
                    }
                    ID307=(Token)match(input,ID,FOLLOW_ID_in_unary_expr2485); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID307_tree = (Object)adaptor.create(ID307);
                    adaptor.addChild(root_0, ID307_tree);
                    }
                    pushFollow(FOLLOW_predop_in_unary_expr2487);
                    predop308=predop();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, predop308.getTree());
                    pushFollow(FOLLOW_expr_in_unary_expr2489);
                    expr309=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr309.getTree());
                    pushFollow(FOLLOW_timeframe_in_unary_expr2491);
                    timeframe310=timeframe();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeframe310.getTree());

                    }
                    break;
                case 5 :
                    // Ruleset.g:408:2: var_domain ':' ID timeframe
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_var_domain_in_unary_expr2496);
                    var_domain311=var_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, var_domain311.getTree());
                    char_literal312=(Token)match(input,38,FOLLOW_38_in_unary_expr2498); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal312_tree = (Object)adaptor.create(char_literal312);
                    adaptor.addChild(root_0, char_literal312_tree);
                    }
                    ID313=(Token)match(input,ID,FOLLOW_ID_in_unary_expr2500); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID313_tree = (Object)adaptor.create(ID313);
                    adaptor.addChild(root_0, ID313_tree);
                    }
                    pushFollow(FOLLOW_timeframe_in_unary_expr2502);
                    timeframe314=timeframe();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeframe314.getTree());

                    }
                    break;
                case 6 :
                    // Ruleset.g:409:2: operator_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_operator_expr_in_unary_expr2507);
                    operator_expr315=operator_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, operator_expr315.getTree());

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
        return retval;
    }
    // $ANTLR end "unary_expr"

    public static class operator_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operator_expr"
    // Ruleset.g:413:1: operator_expr : factor ( operator )* ;
    public final RulesetParser.operator_expr_return operator_expr() throws RecognitionException {
        RulesetParser.operator_expr_return retval = new RulesetParser.operator_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RulesetParser.factor_return factor316 = null;

        RulesetParser.operator_return operator317 = null;



        try {
            // Ruleset.g:414:2: ( factor ( operator )* )
            // Ruleset.g:414:4: factor ( operator )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_factor_in_operator_expr2521);
            factor316=factor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, factor316.getTree());
            // Ruleset.g:414:11: ( operator )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==110) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // Ruleset.g:414:11: operator
            	    {
            	    pushFollow(FOLLOW_operator_in_operator_expr2523);
            	    operator317=operator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, operator317.getTree());

            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);


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
        return retval;
    }
    // $ANTLR end "operator_expr"

    public static class factor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "factor"
    // Ruleset.g:417:1: factor options {backtrack=true; } : ( INT | STRING | REGEXP | 'true' | 'false' | ID '[' expr ']' | persistent_var | trail_exp | function_app | '[' expr ',' ']' | '{' ( hash_line ( ',' )? )* '}' | ID | '(' expr ')' );
    public final RulesetParser.factor_return factor() throws RecognitionException {
        RulesetParser.factor_return retval = new RulesetParser.factor_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT318=null;
        Token STRING319=null;
        Token REGEXP320=null;
        Token string_literal321=null;
        Token string_literal322=null;
        Token ID323=null;
        Token char_literal324=null;
        Token char_literal326=null;
        Token char_literal330=null;
        Token char_literal332=null;
        Token char_literal333=null;
        Token char_literal334=null;
        Token char_literal336=null;
        Token char_literal337=null;
        Token ID338=null;
        Token char_literal339=null;
        Token char_literal341=null;
        RulesetParser.expr_return expr325 = null;

        RulesetParser.persistent_var_return persistent_var327 = null;

        RulesetParser.trail_exp_return trail_exp328 = null;

        RulesetParser.function_app_return function_app329 = null;

        RulesetParser.expr_return expr331 = null;

        RulesetParser.hash_line_return hash_line335 = null;

        RulesetParser.expr_return expr340 = null;


        Object INT318_tree=null;
        Object STRING319_tree=null;
        Object REGEXP320_tree=null;
        Object string_literal321_tree=null;
        Object string_literal322_tree=null;
        Object ID323_tree=null;
        Object char_literal324_tree=null;
        Object char_literal326_tree=null;
        Object char_literal330_tree=null;
        Object char_literal332_tree=null;
        Object char_literal333_tree=null;
        Object char_literal334_tree=null;
        Object char_literal336_tree=null;
        Object char_literal337_tree=null;
        Object ID338_tree=null;
        Object char_literal339_tree=null;
        Object char_literal341_tree=null;

        try {
            // Ruleset.g:418:2: ( INT | STRING | REGEXP | 'true' | 'false' | ID '[' expr ']' | persistent_var | trail_exp | function_app | '[' expr ',' ']' | '{' ( hash_line ( ',' )? )* '}' | ID | '(' expr ')' )
            int alt58=13;
            alt58 = dfa58.predict(input);
            switch (alt58) {
                case 1 :
                    // Ruleset.g:418:4: INT
                    {
                    root_0 = (Object)adaptor.nil();

                    INT318=(Token)match(input,INT,FOLLOW_INT_in_factor2548); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT318_tree = (Object)adaptor.create(INT318);
                    adaptor.addChild(root_0, INT318_tree);
                    }

                    }
                    break;
                case 2 :
                    // Ruleset.g:419:9: STRING
                    {
                    root_0 = (Object)adaptor.nil();

                    STRING319=(Token)match(input,STRING,FOLLOW_STRING_in_factor2558); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING319_tree = (Object)adaptor.create(STRING319);
                    adaptor.addChild(root_0, STRING319_tree);
                    }

                    }
                    break;
                case 3 :
                    // Ruleset.g:420:9: REGEXP
                    {
                    root_0 = (Object)adaptor.nil();

                    REGEXP320=(Token)match(input,REGEXP,FOLLOW_REGEXP_in_factor2568); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXP320_tree = (Object)adaptor.create(REGEXP320);
                    adaptor.addChild(root_0, REGEXP320_tree);
                    }

                    }
                    break;
                case 4 :
                    // Ruleset.g:421:9: 'true'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal321=(Token)match(input,104,FOLLOW_104_in_factor2578); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal321_tree = (Object)adaptor.create(string_literal321);
                    adaptor.addChild(root_0, string_literal321_tree);
                    }

                    }
                    break;
                case 5 :
                    // Ruleset.g:422:9: 'false'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal322=(Token)match(input,105,FOLLOW_105_in_factor2588); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal322_tree = (Object)adaptor.create(string_literal322);
                    adaptor.addChild(root_0, string_literal322_tree);
                    }

                    }
                    break;
                case 6 :
                    // Ruleset.g:423:9: ID '[' expr ']'
                    {
                    root_0 = (Object)adaptor.nil();

                    ID323=(Token)match(input,ID,FOLLOW_ID_in_factor2598); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID323_tree = (Object)adaptor.create(ID323);
                    adaptor.addChild(root_0, ID323_tree);
                    }
                    char_literal324=(Token)match(input,106,FOLLOW_106_in_factor2600); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal324_tree = (Object)adaptor.create(char_literal324);
                    adaptor.addChild(root_0, char_literal324_tree);
                    }
                    pushFollow(FOLLOW_expr_in_factor2602);
                    expr325=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr325.getTree());
                    char_literal326=(Token)match(input,107,FOLLOW_107_in_factor2604); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal326_tree = (Object)adaptor.create(char_literal326);
                    adaptor.addChild(root_0, char_literal326_tree);
                    }

                    }
                    break;
                case 7 :
                    // Ruleset.g:424:9: persistent_var
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_persistent_var_in_factor2614);
                    persistent_var327=persistent_var();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, persistent_var327.getTree());

                    }
                    break;
                case 8 :
                    // Ruleset.g:425:9: trail_exp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_trail_exp_in_factor2624);
                    trail_exp328=trail_exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, trail_exp328.getTree());

                    }
                    break;
                case 9 :
                    // Ruleset.g:426:9: function_app
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_function_app_in_factor2634);
                    function_app329=function_app();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_app329.getTree());

                    }
                    break;
                case 10 :
                    // Ruleset.g:427:9: '[' expr ',' ']'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal330=(Token)match(input,106,FOLLOW_106_in_factor2644); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal330_tree = (Object)adaptor.create(char_literal330);
                    adaptor.addChild(root_0, char_literal330_tree);
                    }
                    pushFollow(FOLLOW_expr_in_factor2646);
                    expr331=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr331.getTree());
                    char_literal332=(Token)match(input,59,FOLLOW_59_in_factor2648); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal332_tree = (Object)adaptor.create(char_literal332);
                    adaptor.addChild(root_0, char_literal332_tree);
                    }
                    char_literal333=(Token)match(input,107,FOLLOW_107_in_factor2650); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal333_tree = (Object)adaptor.create(char_literal333);
                    adaptor.addChild(root_0, char_literal333_tree);
                    }

                    }
                    break;
                case 11 :
                    // Ruleset.g:428:9: '{' ( hash_line ( ',' )? )* '}'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal334=(Token)match(input,20,FOLLOW_20_in_factor2660); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal334_tree = (Object)adaptor.create(char_literal334);
                    adaptor.addChild(root_0, char_literal334_tree);
                    }
                    // Ruleset.g:428:13: ( hash_line ( ',' )? )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==STRING) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // Ruleset.g:428:14: hash_line ( ',' )?
                    	    {
                    	    pushFollow(FOLLOW_hash_line_in_factor2663);
                    	    hash_line335=hash_line();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, hash_line335.getTree());
                    	    // Ruleset.g:428:24: ( ',' )?
                    	    int alt56=2;
                    	    int LA56_0 = input.LA(1);

                    	    if ( (LA56_0==59) ) {
                    	        alt56=1;
                    	    }
                    	    switch (alt56) {
                    	        case 1 :
                    	            // Ruleset.g:428:24: ','
                    	            {
                    	            char_literal336=(Token)match(input,59,FOLLOW_59_in_factor2665); if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) {
                    	            char_literal336_tree = (Object)adaptor.create(char_literal336);
                    	            adaptor.addChild(root_0, char_literal336_tree);
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop57;
                        }
                    } while (true);

                    char_literal337=(Token)match(input,21,FOLLOW_21_in_factor2670); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal337_tree = (Object)adaptor.create(char_literal337);
                    adaptor.addChild(root_0, char_literal337_tree);
                    }

                    }
                    break;
                case 12 :
                    // Ruleset.g:429:9: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID338=(Token)match(input,ID,FOLLOW_ID_in_factor2680); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID338_tree = (Object)adaptor.create(ID338);
                    adaptor.addChild(root_0, ID338_tree);
                    }

                    }
                    break;
                case 13 :
                    // Ruleset.g:430:9: '(' expr ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal339=(Token)match(input,57,FOLLOW_57_in_factor2691); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal339_tree = (Object)adaptor.create(char_literal339);
                    adaptor.addChild(root_0, char_literal339_tree);
                    }
                    pushFollow(FOLLOW_expr_in_factor2693);
                    expr340=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr340.getTree());
                    char_literal341=(Token)match(input,58,FOLLOW_58_in_factor2695); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal341_tree = (Object)adaptor.create(char_literal341);
                    adaptor.addChild(root_0, char_literal341_tree);
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
        return retval;
    }
    // $ANTLR end "factor"

    public static class hash_line_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "hash_line"
    // Ruleset.g:433:1: hash_line : STRING ':' expr ;
    public final RulesetParser.hash_line_return hash_line() throws RecognitionException {
        RulesetParser.hash_line_return retval = new RulesetParser.hash_line_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STRING342=null;
        Token char_literal343=null;
        RulesetParser.expr_return expr344 = null;


        Object STRING342_tree=null;
        Object char_literal343_tree=null;

        try {
            // Ruleset.g:434:2: ( STRING ':' expr )
            // Ruleset.g:434:4: STRING ':' expr
            {
            root_0 = (Object)adaptor.nil();

            STRING342=(Token)match(input,STRING,FOLLOW_STRING_in_hash_line2708); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING342_tree = (Object)adaptor.create(STRING342);
            adaptor.addChild(root_0, STRING342_tree);
            }
            char_literal343=(Token)match(input,38,FOLLOW_38_in_hash_line2710); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal343_tree = (Object)adaptor.create(char_literal343);
            adaptor.addChild(root_0, char_literal343_tree);
            }
            pushFollow(FOLLOW_expr_in_hash_line2712);
            expr344=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr344.getTree());

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
        return retval;
    }
    // $ANTLR end "hash_line"

    public static class function_app_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function_app"
    // Ruleset.g:437:1: function_app : ( namespace ID '(' ( expr ( ',' )? )* ')' | ID '(' ( expr ( ',' )? )* ')' );
    public final RulesetParser.function_app_return function_app() throws RecognitionException {
        RulesetParser.function_app_return retval = new RulesetParser.function_app_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID346=null;
        Token char_literal347=null;
        Token char_literal349=null;
        Token char_literal350=null;
        Token ID351=null;
        Token char_literal352=null;
        Token char_literal354=null;
        Token char_literal355=null;
        RulesetParser.namespace_return namespace345 = null;

        RulesetParser.expr_return expr348 = null;

        RulesetParser.expr_return expr353 = null;


        Object ID346_tree=null;
        Object char_literal347_tree=null;
        Object char_literal349_tree=null;
        Object char_literal350_tree=null;
        Object ID351_tree=null;
        Object char_literal352_tree=null;
        Object char_literal354_tree=null;
        Object char_literal355_tree=null;

        try {
            // Ruleset.g:438:2: ( namespace ID '(' ( expr ( ',' )? )* ')' | ID '(' ( expr ( ',' )? )* ')' )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==ID) ) {
                int LA63_1 = input.LA(2);

                if ( (LA63_1==38) ) {
                    alt63=1;
                }
                else if ( (LA63_1==57) ) {
                    alt63=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 63, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // Ruleset.g:438:3: namespace ID '(' ( expr ( ',' )? )* ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_namespace_in_function_app2725);
                    namespace345=namespace();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, namespace345.getTree());
                    ID346=(Token)match(input,ID,FOLLOW_ID_in_function_app2727); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID346_tree = (Object)adaptor.create(ID346);
                    adaptor.addChild(root_0, ID346_tree);
                    }
                    char_literal347=(Token)match(input,57,FOLLOW_57_in_function_app2729); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal347_tree = (Object)adaptor.create(char_literal347);
                    adaptor.addChild(root_0, char_literal347_tree);
                    }
                    // Ruleset.g:438:20: ( expr ( ',' )? )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( ((LA60_0>=ID && LA60_0<=INT)||LA60_0==REGEXP||LA60_0==STRING||LA60_0==20||LA60_0==57||LA60_0==71||LA60_0==84||LA60_0==102||(LA60_0>=104 && LA60_0<=106)||(LA60_0>=108 && LA60_0<=109)||(LA60_0>=134 && LA60_0<=135)) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // Ruleset.g:438:21: expr ( ',' )?
                    	    {
                    	    pushFollow(FOLLOW_expr_in_function_app2732);
                    	    expr348=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr348.getTree());
                    	    // Ruleset.g:438:26: ( ',' )?
                    	    int alt59=2;
                    	    int LA59_0 = input.LA(1);

                    	    if ( (LA59_0==59) ) {
                    	        alt59=1;
                    	    }
                    	    switch (alt59) {
                    	        case 1 :
                    	            // Ruleset.g:438:26: ','
                    	            {
                    	            char_literal349=(Token)match(input,59,FOLLOW_59_in_function_app2734); if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) {
                    	            char_literal349_tree = (Object)adaptor.create(char_literal349);
                    	            adaptor.addChild(root_0, char_literal349_tree);
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop60;
                        }
                    } while (true);

                    char_literal350=(Token)match(input,58,FOLLOW_58_in_function_app2739); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal350_tree = (Object)adaptor.create(char_literal350);
                    adaptor.addChild(root_0, char_literal350_tree);
                    }

                    }
                    break;
                case 2 :
                    // Ruleset.g:439:3: ID '(' ( expr ( ',' )? )* ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    ID351=(Token)match(input,ID,FOLLOW_ID_in_function_app2745); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID351_tree = (Object)adaptor.create(ID351);
                    adaptor.addChild(root_0, ID351_tree);
                    }
                    char_literal352=(Token)match(input,57,FOLLOW_57_in_function_app2747); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal352_tree = (Object)adaptor.create(char_literal352);
                    adaptor.addChild(root_0, char_literal352_tree);
                    }
                    // Ruleset.g:439:10: ( expr ( ',' )? )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( ((LA62_0>=ID && LA62_0<=INT)||LA62_0==REGEXP||LA62_0==STRING||LA62_0==20||LA62_0==57||LA62_0==71||LA62_0==84||LA62_0==102||(LA62_0>=104 && LA62_0<=106)||(LA62_0>=108 && LA62_0<=109)||(LA62_0>=134 && LA62_0<=135)) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // Ruleset.g:439:11: expr ( ',' )?
                    	    {
                    	    pushFollow(FOLLOW_expr_in_function_app2750);
                    	    expr353=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr353.getTree());
                    	    // Ruleset.g:439:16: ( ',' )?
                    	    int alt61=2;
                    	    int LA61_0 = input.LA(1);

                    	    if ( (LA61_0==59) ) {
                    	        alt61=1;
                    	    }
                    	    switch (alt61) {
                    	        case 1 :
                    	            // Ruleset.g:439:16: ','
                    	            {
                    	            char_literal354=(Token)match(input,59,FOLLOW_59_in_function_app2752); if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) {
                    	            char_literal354_tree = (Object)adaptor.create(char_literal354);
                    	            adaptor.addChild(root_0, char_literal354_tree);
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop62;
                        }
                    } while (true);

                    char_literal355=(Token)match(input,58,FOLLOW_58_in_function_app2757); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal355_tree = (Object)adaptor.create(char_literal355);
                    adaptor.addChild(root_0, char_literal355_tree);
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
        return retval;
    }
    // $ANTLR end "function_app"

    public static class namespace_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "namespace"
    // Ruleset.g:442:1: namespace : ID ':' ;
    public final RulesetParser.namespace_return namespace() throws RecognitionException {
        RulesetParser.namespace_return retval = new RulesetParser.namespace_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID356=null;
        Token char_literal357=null;

        Object ID356_tree=null;
        Object char_literal357_tree=null;

        try {
            // Ruleset.g:443:2: ( ID ':' )
            // Ruleset.g:443:4: ID ':'
            {
            root_0 = (Object)adaptor.nil();

            ID356=(Token)match(input,ID,FOLLOW_ID_in_namespace2769); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID356_tree = (Object)adaptor.create(ID356);
            adaptor.addChild(root_0, ID356_tree);
            }
            char_literal357=(Token)match(input,38,FOLLOW_38_in_namespace2771); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal357_tree = (Object)adaptor.create(char_literal357);
            adaptor.addChild(root_0, char_literal357_tree);
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
        return retval;
    }
    // $ANTLR end "namespace"

    public static class trail_exp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "trail_exp"
    // Ruleset.g:446:1: trail_exp : ( 'current' var_domain ':' ID | 'history' expr var_domain ':' ID );
    public final RulesetParser.trail_exp_return trail_exp() throws RecognitionException {
        RulesetParser.trail_exp_return retval = new RulesetParser.trail_exp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal358=null;
        Token char_literal360=null;
        Token ID361=null;
        Token string_literal362=null;
        Token char_literal365=null;
        Token ID366=null;
        RulesetParser.var_domain_return var_domain359 = null;

        RulesetParser.expr_return expr363 = null;

        RulesetParser.var_domain_return var_domain364 = null;


        Object string_literal358_tree=null;
        Object char_literal360_tree=null;
        Object ID361_tree=null;
        Object string_literal362_tree=null;
        Object char_literal365_tree=null;
        Object ID366_tree=null;

        try {
            // Ruleset.g:447:2: ( 'current' var_domain ':' ID | 'history' expr var_domain ':' ID )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==108) ) {
                alt64=1;
            }
            else if ( (LA64_0==109) ) {
                alt64=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // Ruleset.g:447:3: 'current' var_domain ':' ID
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal358=(Token)match(input,108,FOLLOW_108_in_trail_exp2783); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal358_tree = (Object)adaptor.create(string_literal358);
                    adaptor.addChild(root_0, string_literal358_tree);
                    }
                    pushFollow(FOLLOW_var_domain_in_trail_exp2785);
                    var_domain359=var_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, var_domain359.getTree());
                    char_literal360=(Token)match(input,38,FOLLOW_38_in_trail_exp2787); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal360_tree = (Object)adaptor.create(char_literal360);
                    adaptor.addChild(root_0, char_literal360_tree);
                    }
                    ID361=(Token)match(input,ID,FOLLOW_ID_in_trail_exp2789); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID361_tree = (Object)adaptor.create(ID361);
                    adaptor.addChild(root_0, ID361_tree);
                    }

                    }
                    break;
                case 2 :
                    // Ruleset.g:448:2: 'history' expr var_domain ':' ID
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal362=(Token)match(input,109,FOLLOW_109_in_trail_exp2794); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal362_tree = (Object)adaptor.create(string_literal362);
                    adaptor.addChild(root_0, string_literal362_tree);
                    }
                    pushFollow(FOLLOW_expr_in_trail_exp2796);
                    expr363=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr363.getTree());
                    pushFollow(FOLLOW_var_domain_in_trail_exp2798);
                    var_domain364=var_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, var_domain364.getTree());
                    char_literal365=(Token)match(input,38,FOLLOW_38_in_trail_exp2800); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal365_tree = (Object)adaptor.create(char_literal365);
                    adaptor.addChild(root_0, char_literal365_tree);
                    }
                    ID366=(Token)match(input,ID,FOLLOW_ID_in_trail_exp2802); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID366_tree = (Object)adaptor.create(ID366);
                    adaptor.addChild(root_0, ID366_tree);
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
        return retval;
    }
    // $ANTLR end "trail_exp"

    public static class persistent_var_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "persistent_var"
    // Ruleset.g:451:1: persistent_var : var_domain ':' ID ;
    public final RulesetParser.persistent_var_return persistent_var() throws RecognitionException {
        RulesetParser.persistent_var_return retval = new RulesetParser.persistent_var_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal368=null;
        Token ID369=null;
        RulesetParser.var_domain_return var_domain367 = null;


        Object char_literal368_tree=null;
        Object ID369_tree=null;

        try {
            // Ruleset.g:452:2: ( var_domain ':' ID )
            // Ruleset.g:452:4: var_domain ':' ID
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_var_domain_in_persistent_var2816);
            var_domain367=var_domain();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, var_domain367.getTree());
            char_literal368=(Token)match(input,38,FOLLOW_38_in_persistent_var2818); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal368_tree = (Object)adaptor.create(char_literal368);
            adaptor.addChild(root_0, char_literal368_tree);
            }
            ID369=(Token)match(input,ID,FOLLOW_ID_in_persistent_var2820); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID369_tree = (Object)adaptor.create(ID369);
            adaptor.addChild(root_0, ID369_tree);
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
        return retval;
    }
    // $ANTLR end "persistent_var"

    public static class operator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operator"
    // Ruleset.g:454:1: operator : '.' operator_op '(' expr ( ',' )? ')' ;
    public final RulesetParser.operator_return operator() throws RecognitionException {
        RulesetParser.operator_return retval = new RulesetParser.operator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal370=null;
        Token char_literal372=null;
        Token char_literal374=null;
        Token char_literal375=null;
        RulesetParser.operator_op_return operator_op371 = null;

        RulesetParser.expr_return expr373 = null;


        Object char_literal370_tree=null;
        Object char_literal372_tree=null;
        Object char_literal374_tree=null;
        Object char_literal375_tree=null;

        try {
            // Ruleset.g:455:2: ( '.' operator_op '(' expr ( ',' )? ')' )
            // Ruleset.g:455:4: '.' operator_op '(' expr ( ',' )? ')'
            {
            root_0 = (Object)adaptor.nil();

            char_literal370=(Token)match(input,110,FOLLOW_110_in_operator2832); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal370_tree = (Object)adaptor.create(char_literal370);
            adaptor.addChild(root_0, char_literal370_tree);
            }
            pushFollow(FOLLOW_operator_op_in_operator2834);
            operator_op371=operator_op();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, operator_op371.getTree());
            char_literal372=(Token)match(input,57,FOLLOW_57_in_operator2836); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal372_tree = (Object)adaptor.create(char_literal372);
            adaptor.addChild(root_0, char_literal372_tree);
            }
            pushFollow(FOLLOW_expr_in_operator2838);
            expr373=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr373.getTree());
            // Ruleset.g:455:29: ( ',' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==59) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // Ruleset.g:455:29: ','
                    {
                    char_literal374=(Token)match(input,59,FOLLOW_59_in_operator2840); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal374_tree = (Object)adaptor.create(char_literal374);
                    adaptor.addChild(root_0, char_literal374_tree);
                    }

                    }
                    break;

            }

            char_literal375=(Token)match(input,58,FOLLOW_58_in_operator2843); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal375_tree = (Object)adaptor.create(char_literal375);
            adaptor.addChild(root_0, char_literal375_tree);
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
        return retval;
    }
    // $ANTLR end "operator"

    public static class operator_op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operator_op"
    // Ruleset.g:458:1: operator_op : ( 'pick' | 'match' | 'length' | 'replace' | 'as' | 'head' | 'tail' | 'sort' | 'filter' | 'map' | 'uc' | 'lc' | 'split' | 'join' | 'query' | 'has' | 'union' | 'difference' | 'intersection' | 'unique' | 'once' | 'duplicates' );
    public final RulesetParser.operator_op_return operator_op() throws RecognitionException {
        RulesetParser.operator_op_return retval = new RulesetParser.operator_op_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set376=null;

        Object set376_tree=null;

        try {
            // Ruleset.g:459:2: ( 'pick' | 'match' | 'length' | 'replace' | 'as' | 'head' | 'tail' | 'sort' | 'filter' | 'map' | 'uc' | 'lc' | 'split' | 'join' | 'query' | 'has' | 'union' | 'difference' | 'intersection' | 'unique' | 'once' | 'duplicates' )
            // Ruleset.g:
            {
            root_0 = (Object)adaptor.nil();

            set376=(Token)input.LT(1);
            if ( (input.LA(1)>=111 && input.LA(1)<=132) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set376));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
        return retval;
    }
    // $ANTLR end "operator_op"

    public static class timeframe_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "timeframe"
    // Ruleset.g:464:1: timeframe : 'within' expr ( periods | period ) ;
    public final RulesetParser.timeframe_return timeframe() throws RecognitionException {
        RulesetParser.timeframe_return retval = new RulesetParser.timeframe_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal377=null;
        RulesetParser.expr_return expr378 = null;

        RulesetParser.periods_return periods379 = null;

        RulesetParser.period_return period380 = null;


        Object string_literal377_tree=null;

        try {
            // Ruleset.g:465:2: ( 'within' expr ( periods | period ) )
            // Ruleset.g:465:5: 'within' expr ( periods | period )
            {
            root_0 = (Object)adaptor.nil();

            string_literal377=(Token)match(input,133,FOLLOW_133_in_timeframe2953); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal377_tree = (Object)adaptor.create(string_literal377);
            adaptor.addChild(root_0, string_literal377_tree);
            }
            pushFollow(FOLLOW_expr_in_timeframe2955);
            expr378=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr378.getTree());
            // Ruleset.g:465:19: ( periods | period )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( ((LA66_0>=143 && LA66_0<=149)) ) {
                alt66=1;
            }
            else if ( ((LA66_0>=150 && LA66_0<=156)) ) {
                alt66=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // Ruleset.g:465:20: periods
                    {
                    pushFollow(FOLLOW_periods_in_timeframe2958);
                    periods379=periods();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, periods379.getTree());

                    }
                    break;
                case 2 :
                    // Ruleset.g:465:30: period
                    {
                    pushFollow(FOLLOW_period_in_timeframe2962);
                    period380=period();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, period380.getTree());

                    }
                    break;

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
        return retval;
    }
    // $ANTLR end "timeframe"

    public static class var_domain_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "var_domain"
    // Ruleset.g:468:1: var_domain : ( 'ent' | 'app' );
    public final RulesetParser.var_domain_return var_domain() throws RecognitionException {
        RulesetParser.var_domain_return retval = new RulesetParser.var_domain_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set381=null;

        Object set381_tree=null;

        try {
            // Ruleset.g:468:11: ( 'ent' | 'app' )
            // Ruleset.g:
            {
            root_0 = (Object)adaptor.nil();

            set381=(Token)input.LT(1);
            if ( (input.LA(1)>=134 && input.LA(1)<=135) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set381));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
        return retval;
    }
    // $ANTLR end "var_domain"

    public static class emit_block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "emit_block"
    // Ruleset.g:470:1: emit_block : 'emit' ( HTML | STRING | JS ) ;
    public final RulesetParser.emit_block_return emit_block() throws RecognitionException {
        RulesetParser.emit_block_return retval = new RulesetParser.emit_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal382=null;
        Token set383=null;

        Object string_literal382_tree=null;
        Object set383_tree=null;

        try {
            // Ruleset.g:471:2: ( 'emit' ( HTML | STRING | JS ) )
            // Ruleset.g:471:4: 'emit' ( HTML | STRING | JS )
            {
            root_0 = (Object)adaptor.nil();

            string_literal382=(Token)match(input,136,FOLLOW_136_in_emit_block2989); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal382_tree = (Object)adaptor.create(string_literal382);
            adaptor.addChild(root_0, string_literal382_tree);
            }
            set383=(Token)input.LT(1);
            if ( input.LA(1)==STRING||(input.LA(1)>=HTML && input.LA(1)<=JS) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set383));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
        return retval;
    }
    // $ANTLR end "emit_block"

    public static class dataset_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dataset"
    // Ruleset.g:474:1: dataset : 'dataset' ID ( datatype )? '<-' STRING cachable ;
    public final RulesetParser.dataset_return dataset() throws RecognitionException {
        RulesetParser.dataset_return retval = new RulesetParser.dataset_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal384=null;
        Token ID385=null;
        Token string_literal387=null;
        Token STRING388=null;
        RulesetParser.datatype_return datatype386 = null;

        RulesetParser.cachable_return cachable389 = null;


        Object string_literal384_tree=null;
        Object ID385_tree=null;
        Object string_literal387_tree=null;
        Object STRING388_tree=null;

        try {
            // Ruleset.g:474:9: ( 'dataset' ID ( datatype )? '<-' STRING cachable )
            // Ruleset.g:474:11: 'dataset' ID ( datatype )? '<-' STRING cachable
            {
            root_0 = (Object)adaptor.nil();

            string_literal384=(Token)match(input,137,FOLLOW_137_in_dataset3009); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal384_tree = (Object)adaptor.create(string_literal384);
            adaptor.addChild(root_0, string_literal384_tree);
            }
            ID385=(Token)match(input,ID,FOLLOW_ID_in_dataset3011); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID385_tree = (Object)adaptor.create(ID385);
            adaptor.addChild(root_0, ID385_tree);
            }
            // Ruleset.g:474:24: ( datatype )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==38) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // Ruleset.g:474:24: datatype
                    {
                    pushFollow(FOLLOW_datatype_in_dataset3013);
                    datatype386=datatype();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, datatype386.getTree());

                    }
                    break;

            }

            string_literal387=(Token)match(input,82,FOLLOW_82_in_dataset3016); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal387_tree = (Object)adaptor.create(string_literal387);
            adaptor.addChild(root_0, string_literal387_tree);
            }
            STRING388=(Token)match(input,STRING,FOLLOW_STRING_in_dataset3018); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING388_tree = (Object)adaptor.create(STRING388);
            adaptor.addChild(root_0, STRING388_tree);
            }
            pushFollow(FOLLOW_cachable_in_dataset3020);
            cachable389=cachable();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cachable389.getTree());

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
        return retval;
    }
    // $ANTLR end "dataset"

    public static class datatype_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "datatype"
    // Ruleset.g:477:1: datatype : ':' ( 'JSON' | 'XML' | 'RSS' | 'HTML' ) ;
    public final RulesetParser.datatype_return datatype() throws RecognitionException {
        RulesetParser.datatype_return retval = new RulesetParser.datatype_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal390=null;
        Token set391=null;

        Object char_literal390_tree=null;
        Object set391_tree=null;

        try {
            // Ruleset.g:477:9: ( ':' ( 'JSON' | 'XML' | 'RSS' | 'HTML' ) )
            // Ruleset.g:477:11: ':' ( 'JSON' | 'XML' | 'RSS' | 'HTML' )
            {
            root_0 = (Object)adaptor.nil();

            char_literal390=(Token)match(input,38,FOLLOW_38_in_datatype3030); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal390_tree = (Object)adaptor.create(char_literal390);
            adaptor.addChild(root_0, char_literal390_tree);
            }
            set391=(Token)input.LT(1);
            if ( (input.LA(1)>=138 && input.LA(1)<=141) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set391));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
        return retval;
    }
    // $ANTLR end "datatype"

    public static class cachable_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cachable"
    // Ruleset.g:480:1: cachable : 'cachable' cachetime ;
    public final RulesetParser.cachable_return cachable() throws RecognitionException {
        RulesetParser.cachable_return retval = new RulesetParser.cachable_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal392=null;
        RulesetParser.cachetime_return cachetime393 = null;


        Object string_literal392_tree=null;

        try {
            // Ruleset.g:480:9: ( 'cachable' cachetime )
            // Ruleset.g:480:11: 'cachable' cachetime
            {
            root_0 = (Object)adaptor.nil();

            string_literal392=(Token)match(input,142,FOLLOW_142_in_cachable3049); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal392_tree = (Object)adaptor.create(string_literal392);
            adaptor.addChild(root_0, string_literal392_tree);
            }
            pushFollow(FOLLOW_cachetime_in_cachable3051);
            cachetime393=cachetime();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cachetime393.getTree());

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
        return retval;
    }
    // $ANTLR end "cachable"

    public static class cachetime_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cachetime"
    // Ruleset.g:483:1: cachetime : 'for' INT ( periods | period ) ;
    public final RulesetParser.cachetime_return cachetime() throws RecognitionException {
        RulesetParser.cachetime_return retval = new RulesetParser.cachetime_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal394=null;
        Token INT395=null;
        RulesetParser.periods_return periods396 = null;

        RulesetParser.period_return period397 = null;


        Object string_literal394_tree=null;
        Object INT395_tree=null;

        try {
            // Ruleset.g:483:10: ( 'for' INT ( periods | period ) )
            // Ruleset.g:483:12: 'for' INT ( periods | period )
            {
            root_0 = (Object)adaptor.nil();

            string_literal394=(Token)match(input,52,FOLLOW_52_in_cachetime3062); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal394_tree = (Object)adaptor.create(string_literal394);
            adaptor.addChild(root_0, string_literal394_tree);
            }
            INT395=(Token)match(input,INT,FOLLOW_INT_in_cachetime3064); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INT395_tree = (Object)adaptor.create(INT395);
            adaptor.addChild(root_0, INT395_tree);
            }
            // Ruleset.g:483:22: ( periods | period )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( ((LA68_0>=143 && LA68_0<=149)) ) {
                alt68=1;
            }
            else if ( ((LA68_0>=150 && LA68_0<=156)) ) {
                alt68=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // Ruleset.g:483:23: periods
                    {
                    pushFollow(FOLLOW_periods_in_cachetime3067);
                    periods396=periods();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, periods396.getTree());

                    }
                    break;
                case 2 :
                    // Ruleset.g:483:31: period
                    {
                    pushFollow(FOLLOW_period_in_cachetime3069);
                    period397=period();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, period397.getTree());

                    }
                    break;

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
        return retval;
    }
    // $ANTLR end "cachetime"

    public static class periods_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "periods"
    // Ruleset.g:486:1: periods : ( 'years' | 'months' | 'weeks' | 'days' | 'hours' | 'minutes' | 'seconds' );
    public final RulesetParser.periods_return periods() throws RecognitionException {
        RulesetParser.periods_return retval = new RulesetParser.periods_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set398=null;

        Object set398_tree=null;

        try {
            // Ruleset.g:486:9: ( 'years' | 'months' | 'weeks' | 'days' | 'hours' | 'minutes' | 'seconds' )
            // Ruleset.g:
            {
            root_0 = (Object)adaptor.nil();

            set398=(Token)input.LT(1);
            if ( (input.LA(1)>=143 && input.LA(1)<=149) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set398));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
        return retval;
    }
    // $ANTLR end "periods"

    public static class period_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "period"
    // Ruleset.g:495:1: period : ( 'year' | 'month' | 'week' | 'day' | 'hour' | 'minute' | 'second' );
    public final RulesetParser.period_return period() throws RecognitionException {
        RulesetParser.period_return retval = new RulesetParser.period_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set399=null;

        Object set399_tree=null;

        try {
            // Ruleset.g:495:9: ( 'year' | 'month' | 'week' | 'day' | 'hour' | 'minute' | 'second' )
            // Ruleset.g:
            {
            root_0 = (Object)adaptor.nil();

            set399=(Token)input.LT(1);
            if ( (input.LA(1)>=150 && input.LA(1)<=156) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set399));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
        return retval;
    }
    // $ANTLR end "period"

    public static class dispatch_block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dispatch_block"
    // Ruleset.g:507:1: dispatch_block : 'dispatch' '{' ( dispatch )* '}' ;
    public final RulesetParser.dispatch_block_return dispatch_block() throws RecognitionException {
        RulesetParser.dispatch_block_return retval = new RulesetParser.dispatch_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal400=null;
        Token char_literal401=null;
        Token char_literal403=null;
        RulesetParser.dispatch_return dispatch402 = null;


        Object string_literal400_tree=null;
        Object char_literal401_tree=null;
        Object char_literal403_tree=null;

        try {
            // Ruleset.g:508:2: ( 'dispatch' '{' ( dispatch )* '}' )
            // Ruleset.g:508:4: 'dispatch' '{' ( dispatch )* '}'
            {
            root_0 = (Object)adaptor.nil();

            string_literal400=(Token)match(input,157,FOLLOW_157_in_dispatch_block3204); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal400_tree = (Object)adaptor.create(string_literal400);
            adaptor.addChild(root_0, string_literal400_tree);
            }
            char_literal401=(Token)match(input,20,FOLLOW_20_in_dispatch_block3206); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal401_tree = (Object)adaptor.create(char_literal401);
            adaptor.addChild(root_0, char_literal401_tree);
            }
            // Ruleset.g:508:19: ( dispatch )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==158) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // Ruleset.g:508:19: dispatch
            	    {
            	    pushFollow(FOLLOW_dispatch_in_dispatch_block3208);
            	    dispatch402=dispatch();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, dispatch402.getTree());

            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);

            char_literal403=(Token)match(input,21,FOLLOW_21_in_dispatch_block3211); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal403_tree = (Object)adaptor.create(char_literal403);
            adaptor.addChild(root_0, char_literal403_tree);
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
        return retval;
    }
    // $ANTLR end "dispatch_block"

    public static class dispatch_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dispatch"
    // Ruleset.g:511:1: dispatch : 'domain' STRING ( dispatch_target )? ;
    public final RulesetParser.dispatch_return dispatch() throws RecognitionException {
        RulesetParser.dispatch_return retval = new RulesetParser.dispatch_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal404=null;
        Token STRING405=null;
        RulesetParser.dispatch_target_return dispatch_target406 = null;


        Object string_literal404_tree=null;
        Object STRING405_tree=null;

        try {
            // Ruleset.g:511:9: ( 'domain' STRING ( dispatch_target )? )
            // Ruleset.g:511:11: 'domain' STRING ( dispatch_target )?
            {
            root_0 = (Object)adaptor.nil();

            string_literal404=(Token)match(input,158,FOLLOW_158_in_dispatch3220); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal404_tree = (Object)adaptor.create(string_literal404);
            adaptor.addChild(root_0, string_literal404_tree);
            }
            STRING405=(Token)match(input,STRING,FOLLOW_STRING_in_dispatch3222); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING405_tree = (Object)adaptor.create(STRING405);
            adaptor.addChild(root_0, STRING405_tree);
            }
            // Ruleset.g:511:27: ( dispatch_target )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==159) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // Ruleset.g:511:27: dispatch_target
                    {
                    pushFollow(FOLLOW_dispatch_target_in_dispatch3224);
                    dispatch_target406=dispatch_target();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dispatch_target406.getTree());

                    }
                    break;

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
        return retval;
    }
    // $ANTLR end "dispatch"

    public static class dispatch_target_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dispatch_target"
    // Ruleset.g:513:1: dispatch_target : '->' STRING ;
    public final RulesetParser.dispatch_target_return dispatch_target() throws RecognitionException {
        RulesetParser.dispatch_target_return retval = new RulesetParser.dispatch_target_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal407=null;
        Token STRING408=null;

        Object string_literal407_tree=null;
        Object STRING408_tree=null;

        try {
            // Ruleset.g:514:2: ( '->' STRING )
            // Ruleset.g:514:4: '->' STRING
            {
            root_0 = (Object)adaptor.nil();

            string_literal407=(Token)match(input,159,FOLLOW_159_in_dispatch_target3236); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal407_tree = (Object)adaptor.create(string_literal407);
            adaptor.addChild(root_0, string_literal407_tree);
            }
            STRING408=(Token)match(input,STRING,FOLLOW_STRING_in_dispatch_target3238); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING408_tree = (Object)adaptor.create(STRING408);
            adaptor.addChild(root_0, STRING408_tree);
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
        return retval;
    }
    // $ANTLR end "dispatch_target"

    public static class meta_block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "meta_block"
    // Ruleset.g:520:1: meta_block : 'meta' '{' ( pragma[keys_map] )* '}' ;
    public final RulesetParser.meta_block_return meta_block() throws RecognitionException {
        RulesetParser.meta_block_return retval = new RulesetParser.meta_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal409=null;
        Token char_literal410=null;
        Token char_literal412=null;
        RulesetParser.pragma_return pragma411 = null;


        Object string_literal409_tree=null;
        Object char_literal410_tree=null;
        Object char_literal412_tree=null;


        	 rule_json.put("meta",new HashMap());
        	 current_top = (HashMap)rule_json.get("meta");
        	 current_top.put("keys",new HashMap());
        	 HashMap keys_map = new HashMap();
        	 

        try {
            // Ruleset.g:536:2: ( 'meta' '{' ( pragma[keys_map] )* '}' )
            // Ruleset.g:536:4: 'meta' '{' ( pragma[keys_map] )* '}'
            {
            root_0 = (Object)adaptor.nil();

            string_literal409=(Token)match(input,160,FOLLOW_160_in_meta_block3273); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal409_tree = (Object)adaptor.create(string_literal409);
            adaptor.addChild(root_0, string_literal409_tree);
            }
            char_literal410=(Token)match(input,20,FOLLOW_20_in_meta_block3275); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal410_tree = (Object)adaptor.create(char_literal410);
            adaptor.addChild(root_0, char_literal410_tree);
            }
            // Ruleset.g:536:15: ( pragma[keys_map] )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( ((LA71_0>=161 && LA71_0<=162)||LA71_0==169||(LA71_0>=173 && LA71_0<=174)||LA71_0==177||LA71_0==180) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // Ruleset.g:536:15: pragma[keys_map]
            	    {
            	    pushFollow(FOLLOW_pragma_in_meta_block3277);
            	    pragma411=pragma(keys_map);

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, pragma411.getTree());

            	    }
            	    break;

            	default :
            	    break loop71;
                }
            } while (true);

            char_literal412=(Token)match(input,21,FOLLOW_21_in_meta_block3281); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal412_tree = (Object)adaptor.create(char_literal412);
            adaptor.addChild(root_0, char_literal412_tree);
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
        }
        return retval;
    }
    // $ANTLR end "meta_block"

    public static class pragma_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pragma"
    // Ruleset.g:540:1: pragma[HashMap keys_map] : ( desc_block | meta_name | 'author' author= STRING | 'key' what= ( 'errorstack' | 'googleanalytics' | 'twitter' | 'amazon' | 'kpds' | 'google' | ID ) key_value[key_values] | authz_pragma | logging_pargma | 'use' 'module' ID ( alias )? | 'use' ( 'css' | 'javascript' ) 'resource' location );
    public final RulesetParser.pragma_return pragma(HashMap keys_map) throws RecognitionException {
        RulesetParser.pragma_return retval = new RulesetParser.pragma_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token author=null;
        Token what=null;
        Token string_literal415=null;
        Token string_literal416=null;
        Token string_literal420=null;
        Token string_literal421=null;
        Token ID422=null;
        Token string_literal424=null;
        Token set425=null;
        Token string_literal426=null;
        RulesetParser.desc_block_return desc_block413 = null;

        RulesetParser.meta_name_return meta_name414 = null;

        RulesetParser.key_value_return key_value417 = null;

        RulesetParser.authz_pragma_return authz_pragma418 = null;

        RulesetParser.logging_pargma_return logging_pargma419 = null;

        RulesetParser.alias_return alias423 = null;

        RulesetParser.location_return location427 = null;


        Object author_tree=null;
        Object what_tree=null;
        Object string_literal415_tree=null;
        Object string_literal416_tree=null;
        Object string_literal420_tree=null;
        Object string_literal421_tree=null;
        Object ID422_tree=null;
        Object string_literal424_tree=null;
        Object set425_tree=null;
        Object string_literal426_tree=null;


        	HashMap key_values = new HashMap();
        	

        try {
            // Ruleset.g:546:2: ( desc_block | meta_name | 'author' author= STRING | 'key' what= ( 'errorstack' | 'googleanalytics' | 'twitter' | 'amazon' | 'kpds' | 'google' | ID ) key_value[key_values] | authz_pragma | logging_pargma | 'use' 'module' ID ( alias )? | 'use' ( 'css' | 'javascript' ) 'resource' location )
            int alt73=8;
            alt73 = dfa73.predict(input);
            switch (alt73) {
                case 1 :
                    // Ruleset.g:546:4: desc_block
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_desc_block_in_pragma3305);
                    desc_block413=desc_block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, desc_block413.getTree());

                    }
                    break;
                case 2 :
                    // Ruleset.g:547:4: meta_name
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_meta_name_in_pragma3311);
                    meta_name414=meta_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, meta_name414.getTree());

                    }
                    break;
                case 3 :
                    // Ruleset.g:548:4: 'author' author= STRING
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal415=(Token)match(input,161,FOLLOW_161_in_pragma3316); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal415_tree = (Object)adaptor.create(string_literal415);
                    adaptor.addChild(root_0, string_literal415_tree);
                    }
                    author=(Token)match(input,STRING,FOLLOW_STRING_in_pragma3320); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    author_tree = (Object)adaptor.create(author);
                    adaptor.addChild(root_0, author_tree);
                    }
                    if ( state.backtracking==0 ) {
                       ((HashMap)rule_json.get("meta")).put("author",(author!=null?author.getText():null)); 
                    }

                    }
                    break;
                case 4 :
                    // Ruleset.g:549:4: 'key' what= ( 'errorstack' | 'googleanalytics' | 'twitter' | 'amazon' | 'kpds' | 'google' | ID ) key_value[key_values]
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal416=(Token)match(input,162,FOLLOW_162_in_pragma3329); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal416_tree = (Object)adaptor.create(string_literal416);
                    adaptor.addChild(root_0, string_literal416_tree);
                    }
                    what=(Token)input.LT(1);
                    if ( input.LA(1)==ID||(input.LA(1)>=163 && input.LA(1)<=168) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(what));
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_key_value_in_pragma3351);
                    key_value417=key_value(key_values);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, key_value417.getTree());
                    if ( state.backtracking==0 ) {
                       
                      		if(!key_values.isEmpty()) 
                      			keys_map.put((what!=null?what.getText():null),key_values); 
                      		else 
                      			keys_map.put((what!=null?what.getText():null),strip_string((key_value417!=null?input.toString(key_value417.start,key_value417.stop):null))); 
                      	
                    }

                    }
                    break;
                case 5 :
                    // Ruleset.g:555:4: authz_pragma
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_authz_pragma_in_pragma3360);
                    authz_pragma418=authz_pragma();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, authz_pragma418.getTree());

                    }
                    break;
                case 6 :
                    // Ruleset.g:556:4: logging_pargma
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_logging_pargma_in_pragma3365);
                    logging_pargma419=logging_pargma();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logging_pargma419.getTree());

                    }
                    break;
                case 7 :
                    // Ruleset.g:557:4: 'use' 'module' ID ( alias )?
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal420=(Token)match(input,169,FOLLOW_169_in_pragma3370); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal420_tree = (Object)adaptor.create(string_literal420);
                    adaptor.addChild(root_0, string_literal420_tree);
                    }
                    string_literal421=(Token)match(input,170,FOLLOW_170_in_pragma3372); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal421_tree = (Object)adaptor.create(string_literal421);
                    adaptor.addChild(root_0, string_literal421_tree);
                    }
                    ID422=(Token)match(input,ID,FOLLOW_ID_in_pragma3374); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID422_tree = (Object)adaptor.create(ID422);
                    adaptor.addChild(root_0, ID422_tree);
                    }
                    // Ruleset.g:557:22: ( alias )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==179) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // Ruleset.g:557:22: alias
                            {
                            pushFollow(FOLLOW_alias_in_pragma3376);
                            alias423=alias();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, alias423.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 8 :
                    // Ruleset.g:558:4: 'use' ( 'css' | 'javascript' ) 'resource' location
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal424=(Token)match(input,169,FOLLOW_169_in_pragma3382); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal424_tree = (Object)adaptor.create(string_literal424);
                    adaptor.addChild(root_0, string_literal424_tree);
                    }
                    set425=(Token)input.LT(1);
                    if ( input.LA(1)==83||input.LA(1)==171 ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set425));
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    string_literal426=(Token)match(input,172,FOLLOW_172_in_pragma3392); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal426_tree = (Object)adaptor.create(string_literal426);
                    adaptor.addChild(root_0, string_literal426_tree);
                    }
                    pushFollow(FOLLOW_location_in_pragma3394);
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
        return retval;
    }
    // $ANTLR end "pragma"

    public static class meta_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "meta_name"
    // Ruleset.g:561:1: meta_name : 'name' thename= STRING ;
    public final RulesetParser.meta_name_return meta_name() throws RecognitionException {
        RulesetParser.meta_name_return retval = new RulesetParser.meta_name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token thename=null;
        Token string_literal428=null;

        Object thename_tree=null;
        Object string_literal428_tree=null;

        try {
            // Ruleset.g:562:2: ( 'name' thename= STRING )
            // Ruleset.g:562:5: 'name' thename= STRING
            {
            root_0 = (Object)adaptor.nil();

            string_literal428=(Token)match(input,173,FOLLOW_173_in_meta_name3408); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal428_tree = (Object)adaptor.create(string_literal428);
            adaptor.addChild(root_0, string_literal428_tree);
            }
            thename=(Token)match(input,STRING,FOLLOW_STRING_in_meta_name3412); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            thename_tree = (Object)adaptor.create(thename);
            adaptor.addChild(root_0, thename_tree);
            }
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
        }
        return retval;
    }
    // $ANTLR end "meta_name"

    public static class authz_pragma_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "authz_pragma"
    // Ruleset.g:565:1: authz_pragma : 'authz' 'require' 'user' ;
    public final RulesetParser.authz_pragma_return authz_pragma() throws RecognitionException {
        RulesetParser.authz_pragma_return retval = new RulesetParser.authz_pragma_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal429=null;
        Token string_literal430=null;
        Token string_literal431=null;

        Object string_literal429_tree=null;
        Object string_literal430_tree=null;
        Object string_literal431_tree=null;

        try {
            // Ruleset.g:566:2: ( 'authz' 'require' 'user' )
            // Ruleset.g:566:4: 'authz' 'require' 'user'
            {
            root_0 = (Object)adaptor.nil();

            string_literal429=(Token)match(input,174,FOLLOW_174_in_authz_pragma3426); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal429_tree = (Object)adaptor.create(string_literal429);
            adaptor.addChild(root_0, string_literal429_tree);
            }
            string_literal430=(Token)match(input,175,FOLLOW_175_in_authz_pragma3428); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal430_tree = (Object)adaptor.create(string_literal430);
            adaptor.addChild(root_0, string_literal430_tree);
            }
            string_literal431=(Token)match(input,176,FOLLOW_176_in_authz_pragma3430); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal431_tree = (Object)adaptor.create(string_literal431);
            adaptor.addChild(root_0, string_literal431_tree);
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
        return retval;
    }
    // $ANTLR end "authz_pragma"

    public static class logging_pargma_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logging_pargma"
    // Ruleset.g:569:1: logging_pargma : 'logging' ( 'on' | 'off' ) ;
    public final RulesetParser.logging_pargma_return logging_pargma() throws RecognitionException {
        RulesetParser.logging_pargma_return retval = new RulesetParser.logging_pargma_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal432=null;
        Token set433=null;

        Object string_literal432_tree=null;
        Object set433_tree=null;

        try {
            // Ruleset.g:570:2: ( 'logging' ( 'on' | 'off' ) )
            // Ruleset.g:570:4: 'logging' ( 'on' | 'off' )
            {
            root_0 = (Object)adaptor.nil();

            string_literal432=(Token)match(input,177,FOLLOW_177_in_logging_pargma3442); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal432_tree = (Object)adaptor.create(string_literal432);
            adaptor.addChild(root_0, string_literal432_tree);
            }
            set433=(Token)input.LT(1);
            if ( input.LA(1)==79||input.LA(1)==178 ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set433));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
        return retval;
    }
    // $ANTLR end "logging_pargma"

    public static class alias_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "alias"
    // Ruleset.g:573:1: alias : 'alias' ID ;
    public final RulesetParser.alias_return alias() throws RecognitionException {
        RulesetParser.alias_return retval = new RulesetParser.alias_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal434=null;
        Token ID435=null;

        Object string_literal434_tree=null;
        Object ID435_tree=null;

        try {
            // Ruleset.g:573:7: ( 'alias' ID )
            // Ruleset.g:573:9: 'alias' ID
            {
            root_0 = (Object)adaptor.nil();

            string_literal434=(Token)match(input,179,FOLLOW_179_in_alias3459); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal434_tree = (Object)adaptor.create(string_literal434);
            adaptor.addChild(root_0, string_literal434_tree);
            }
            ID435=(Token)match(input,ID,FOLLOW_ID_in_alias3461); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID435_tree = (Object)adaptor.create(ID435);
            adaptor.addChild(root_0, ID435_tree);
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
        return retval;
    }
    // $ANTLR end "alias"

    public static class location_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "location"
    // Ruleset.g:575:1: location : ( STRING | ID );
    public final RulesetParser.location_return location() throws RecognitionException {
        RulesetParser.location_return retval = new RulesetParser.location_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set436=null;

        Object set436_tree=null;

        try {
            // Ruleset.g:575:9: ( STRING | ID )
            // Ruleset.g:
            {
            root_0 = (Object)adaptor.nil();

            set436=(Token)input.LT(1);
            if ( input.LA(1)==ID||input.LA(1)==STRING ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set436));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
        return retval;
    }
    // $ANTLR end "location"

    public static class desc_block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "desc_block"
    // Ruleset.g:577:1: desc_block options {k=1; } : 'description' desc= ( HTML | STRING ) ;
    public final RulesetParser.desc_block_return desc_block() throws RecognitionException {
        RulesetParser.desc_block_return retval = new RulesetParser.desc_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token desc=null;
        Token string_literal437=null;

        Object desc_tree=null;
        Object string_literal437_tree=null;

        try {
            // Ruleset.g:578:2: ( 'description' desc= ( HTML | STRING ) )
            // Ruleset.g:578:4: 'description' desc= ( HTML | STRING )
            {
            root_0 = (Object)adaptor.nil();

            string_literal437=(Token)match(input,180,FOLLOW_180_in_desc_block3492); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal437_tree = (Object)adaptor.create(string_literal437);
            adaptor.addChild(root_0, string_literal437_tree);
            }
            desc=(Token)input.LT(1);
            if ( input.LA(1)==STRING||input.LA(1)==HTML ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(desc));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

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
        }
        return retval;
    }
    // $ANTLR end "desc_block"

    public static class key_value_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "key_value"
    // Ruleset.g:582:1: key_value[HashMap key_values] : ( STRING | '{' ( name_value_pair[key_values] ( ',' )? )+ '}' );
    public final RulesetParser.key_value_return key_value(HashMap key_values) throws RecognitionException {
        RulesetParser.key_value_return retval = new RulesetParser.key_value_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STRING438=null;
        Token char_literal439=null;
        Token char_literal441=null;
        Token char_literal442=null;
        RulesetParser.name_value_pair_return name_value_pair440 = null;


        Object STRING438_tree=null;
        Object char_literal439_tree=null;
        Object char_literal441_tree=null;
        Object char_literal442_tree=null;

        try {
            // Ruleset.g:583:2: ( STRING | '{' ( name_value_pair[key_values] ( ',' )? )+ '}' )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==STRING) ) {
                alt76=1;
            }
            else if ( (LA76_0==20) ) {
                alt76=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }
            switch (alt76) {
                case 1 :
                    // Ruleset.g:583:4: STRING
                    {
                    root_0 = (Object)adaptor.nil();

                    STRING438=(Token)match(input,STRING,FOLLOW_STRING_in_key_value3517); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING438_tree = (Object)adaptor.create(STRING438);
                    adaptor.addChild(root_0, STRING438_tree);
                    }

                    }
                    break;
                case 2 :
                    // Ruleset.g:583:13: '{' ( name_value_pair[key_values] ( ',' )? )+ '}'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal439=(Token)match(input,20,FOLLOW_20_in_key_value3521); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal439_tree = (Object)adaptor.create(char_literal439);
                    adaptor.addChild(root_0, char_literal439_tree);
                    }
                    // Ruleset.g:583:17: ( name_value_pair[key_values] ( ',' )? )+
                    int cnt75=0;
                    loop75:
                    do {
                        int alt75=2;
                        int LA75_0 = input.LA(1);

                        if ( (LA75_0==STRING) ) {
                            alt75=1;
                        }


                        switch (alt75) {
                    	case 1 :
                    	    // Ruleset.g:583:18: name_value_pair[key_values] ( ',' )?
                    	    {
                    	    pushFollow(FOLLOW_name_value_pair_in_key_value3524);
                    	    name_value_pair440=name_value_pair(key_values);

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, name_value_pair440.getTree());
                    	    // Ruleset.g:583:46: ( ',' )?
                    	    int alt74=2;
                    	    int LA74_0 = input.LA(1);

                    	    if ( (LA74_0==59) ) {
                    	        alt74=1;
                    	    }
                    	    switch (alt74) {
                    	        case 1 :
                    	            // Ruleset.g:583:46: ','
                    	            {
                    	            char_literal441=(Token)match(input,59,FOLLOW_59_in_key_value3527); if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) {
                    	            char_literal441_tree = (Object)adaptor.create(char_literal441);
                    	            adaptor.addChild(root_0, char_literal441_tree);
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt75 >= 1 ) break loop75;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(75, input);
                                throw eee;
                        }
                        cnt75++;
                    } while (true);

                    char_literal442=(Token)match(input,21,FOLLOW_21_in_key_value3532); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal442_tree = (Object)adaptor.create(char_literal442);
                    adaptor.addChild(root_0, char_literal442_tree);
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
        return retval;
    }
    // $ANTLR end "key_value"

    public static class name_value_pair_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "name_value_pair"
    // Ruleset.g:586:1: name_value_pair[HashMap key_values] : k= STRING ':' (v= INT | v= FLOAT | v= STRING ) ;
    public final RulesetParser.name_value_pair_return name_value_pair(HashMap key_values) throws RecognitionException {
        RulesetParser.name_value_pair_return retval = new RulesetParser.name_value_pair_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token k=null;
        Token v=null;
        Token char_literal443=null;

        Object k_tree=null;
        Object v_tree=null;
        Object char_literal443_tree=null;


        	Object value = null;

        try {
            // Ruleset.g:590:2: (k= STRING ':' (v= INT | v= FLOAT | v= STRING ) )
            // Ruleset.g:590:4: k= STRING ':' (v= INT | v= FLOAT | v= STRING )
            {
            root_0 = (Object)adaptor.nil();

            k=(Token)match(input,STRING,FOLLOW_STRING_in_name_value_pair3555); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            k_tree = (Object)adaptor.create(k);
            adaptor.addChild(root_0, k_tree);
            }
            char_literal443=(Token)match(input,38,FOLLOW_38_in_name_value_pair3557); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal443_tree = (Object)adaptor.create(char_literal443);
            adaptor.addChild(root_0, char_literal443_tree);
            }
            // Ruleset.g:590:17: (v= INT | v= FLOAT | v= STRING )
            int alt77=3;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt77=1;
                }
                break;
            case FLOAT:
                {
                alt77=2;
                }
                break;
            case STRING:
                {
                alt77=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }

            switch (alt77) {
                case 1 :
                    // Ruleset.g:590:18: v= INT
                    {
                    v=(Token)match(input,INT,FOLLOW_INT_in_name_value_pair3562); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    v_tree = (Object)adaptor.create(v);
                    adaptor.addChild(root_0, v_tree);
                    }
                    if ( state.backtracking==0 ) {
                      value = Integer.parseInt((v!=null?v.getText():null));System.out.println("found int");
                    }

                    }
                    break;
                case 2 :
                    // Ruleset.g:590:95: v= FLOAT
                    {
                    v=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_name_value_pair3570); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    v_tree = (Object)adaptor.create(v);
                    adaptor.addChild(root_0, v_tree);
                    }
                    if ( state.backtracking==0 ) {
                      value = Float.parseFloat((v!=null?v.getText():null));
                    }

                    }
                    break;
                case 3 :
                    // Ruleset.g:590:142: v= STRING
                    {
                    v=(Token)match(input,STRING,FOLLOW_STRING_in_name_value_pair3578); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    v_tree = (Object)adaptor.create(v);
                    adaptor.addChild(root_0, v_tree);
                    }
                    if ( state.backtracking==0 ) {
                      value = (v!=null?v.getText():null);
                    }

                    }
                    break;

            }

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
        }
        return retval;
    }
    // $ANTLR end "name_value_pair"

    // $ANTLR start synpred1_Ruleset
    public final void synpred1_Ruleset_fragment() throws RecognitionException {   
        // Ruleset.g:159:9: ( single_line_comment )
        // Ruleset.g:159:10: single_line_comment
        {
        pushFollow(FOLLOW_single_line_comment_in_synpred1_Ruleset802);
        single_line_comment();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_Ruleset

    // $ANTLR start synpred2_Ruleset
    public final void synpred2_Ruleset_fragment() throws RecognitionException {   
        // Ruleset.g:248:2: ( unconditional_action )
        // Ruleset.g:248:3: unconditional_action
        {
        pushFollow(FOLLOW_unconditional_action_in_synpred2_Ruleset1362);
        unconditional_action();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_Ruleset

    // $ANTLR start synpred3_Ruleset
    public final void synpred3_Ruleset_fragment() throws RecognitionException {   
        // Ruleset.g:257:4: ( actionblock )
        // Ruleset.g:257:5: actionblock
        {
        pushFollow(FOLLOW_actionblock_in_synpred3_Ruleset1403);
        actionblock();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_Ruleset

    // $ANTLR start synpred4_Ruleset
    public final void synpred4_Ruleset_fragment() throws RecognitionException {   
        // Ruleset.g:303:4: ( event_or 'then' )
        // Ruleset.g:303:4: event_or 'then'
        {
        pushFollow(FOLLOW_event_or_in_synpred4_Ruleset1728);
        event_or();

        state._fsp--;
        if (state.failed) return ;
        match(input,56,FOLLOW_56_in_synpred4_Ruleset1730); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_Ruleset

    // $ANTLR start synpred5_Ruleset
    public final void synpred5_Ruleset_fragment() throws RecognitionException {   
        // Ruleset.g:304:3: ( event_or 'before' )
        // Ruleset.g:304:3: event_or 'before'
        {
        pushFollow(FOLLOW_event_or_in_synpred5_Ruleset1735);
        event_or();

        state._fsp--;
        if (state.failed) return ;
        match(input,69,FOLLOW_69_in_synpred5_Ruleset1737); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_Ruleset

    // $ANTLR start synpred9_Ruleset
    public final void synpred9_Ruleset_fragment() throws RecognitionException {   
        // Ruleset.g:376:4: ( disjunction '=>' expr '|' expr )
        // Ruleset.g:376:4: disjunction '=>' expr '|' expr
        {
        pushFollow(FOLLOW_disjunction_in_synpred9_Ruleset2238);
        disjunction();

        state._fsp--;
        if (state.failed) return ;
        match(input,60,FOLLOW_60_in_synpred9_Ruleset2240); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred9_Ruleset2242);
        expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,85,FOLLOW_85_in_synpred9_Ruleset2244); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred9_Ruleset2246);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_Ruleset

    // $ANTLR start synpred11_Ruleset
    public final void synpred11_Ruleset_fragment() throws RecognitionException {   
        // Ruleset.g:405:2: ( 'seen' STRING 'in' var_domain ':' ID timeframe )
        // Ruleset.g:405:2: 'seen' STRING 'in' var_domain ':' ID timeframe
        {
        match(input,102,FOLLOW_102_in_synpred11_Ruleset2439); if (state.failed) return ;
        match(input,STRING,FOLLOW_STRING_in_synpred11_Ruleset2441); if (state.failed) return ;
        match(input,41,FOLLOW_41_in_synpred11_Ruleset2443); if (state.failed) return ;
        pushFollow(FOLLOW_var_domain_in_synpred11_Ruleset2445);
        var_domain();

        state._fsp--;
        if (state.failed) return ;
        match(input,38,FOLLOW_38_in_synpred11_Ruleset2447); if (state.failed) return ;
        match(input,ID,FOLLOW_ID_in_synpred11_Ruleset2449); if (state.failed) return ;
        pushFollow(FOLLOW_timeframe_in_synpred11_Ruleset2451);
        timeframe();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred11_Ruleset

    // $ANTLR start synpred12_Ruleset
    public final void synpred12_Ruleset_fragment() throws RecognitionException {   
        // Ruleset.g:406:2: ( 'seen' STRING ( 'before' | 'after' ) STRING 'in' var_domain ':' ID )
        // Ruleset.g:406:2: 'seen' STRING ( 'before' | 'after' ) STRING 'in' var_domain ':' ID
        {
        match(input,102,FOLLOW_102_in_synpred12_Ruleset2456); if (state.failed) return ;
        match(input,STRING,FOLLOW_STRING_in_synpred12_Ruleset2458); if (state.failed) return ;
        if ( input.LA(1)==69||input.LA(1)==103 ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }

        match(input,STRING,FOLLOW_STRING_in_synpred12_Ruleset2468); if (state.failed) return ;
        match(input,41,FOLLOW_41_in_synpred12_Ruleset2470); if (state.failed) return ;
        pushFollow(FOLLOW_var_domain_in_synpred12_Ruleset2472);
        var_domain();

        state._fsp--;
        if (state.failed) return ;
        match(input,38,FOLLOW_38_in_synpred12_Ruleset2474); if (state.failed) return ;
        match(input,ID,FOLLOW_ID_in_synpred12_Ruleset2476); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred12_Ruleset

    // $ANTLR start synpred13_Ruleset
    public final void synpred13_Ruleset_fragment() throws RecognitionException {   
        // Ruleset.g:407:2: ( var_domain ':' ID predop expr timeframe )
        // Ruleset.g:407:2: var_domain ':' ID predop expr timeframe
        {
        pushFollow(FOLLOW_var_domain_in_synpred13_Ruleset2481);
        var_domain();

        state._fsp--;
        if (state.failed) return ;
        match(input,38,FOLLOW_38_in_synpred13_Ruleset2483); if (state.failed) return ;
        match(input,ID,FOLLOW_ID_in_synpred13_Ruleset2485); if (state.failed) return ;
        pushFollow(FOLLOW_predop_in_synpred13_Ruleset2487);
        predop();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred13_Ruleset2489);
        expr();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_timeframe_in_synpred13_Ruleset2491);
        timeframe();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_Ruleset

    // $ANTLR start synpred14_Ruleset
    public final void synpred14_Ruleset_fragment() throws RecognitionException {   
        // Ruleset.g:408:2: ( var_domain ':' ID timeframe )
        // Ruleset.g:408:2: var_domain ':' ID timeframe
        {
        pushFollow(FOLLOW_var_domain_in_synpred14_Ruleset2496);
        var_domain();

        state._fsp--;
        if (state.failed) return ;
        match(input,38,FOLLOW_38_in_synpred14_Ruleset2498); if (state.failed) return ;
        match(input,ID,FOLLOW_ID_in_synpred14_Ruleset2500); if (state.failed) return ;
        pushFollow(FOLLOW_timeframe_in_synpred14_Ruleset2502);
        timeframe();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_Ruleset

    // $ANTLR start synpred20_Ruleset
    public final void synpred20_Ruleset_fragment() throws RecognitionException {   
        // Ruleset.g:423:9: ( ID '[' expr ']' )
        // Ruleset.g:423:9: ID '[' expr ']'
        {
        match(input,ID,FOLLOW_ID_in_synpred20_Ruleset2598); if (state.failed) return ;
        match(input,106,FOLLOW_106_in_synpred20_Ruleset2600); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred20_Ruleset2602);
        expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,107,FOLLOW_107_in_synpred20_Ruleset2604); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred20_Ruleset

    // $ANTLR start synpred23_Ruleset
    public final void synpred23_Ruleset_fragment() throws RecognitionException {   
        // Ruleset.g:426:9: ( function_app )
        // Ruleset.g:426:9: function_app
        {
        pushFollow(FOLLOW_function_app_in_synpred23_Ruleset2634);
        function_app();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred23_Ruleset

    // $ANTLR start synpred26_Ruleset
    public final void synpred26_Ruleset_fragment() throws RecognitionException {   
        // Ruleset.g:429:9: ( ID )
        // Ruleset.g:429:9: ID
        {
        match(input,ID,FOLLOW_ID_in_synpred26_Ruleset2680); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_Ruleset

    // Delegated rules

    public final boolean synpred1_Ruleset() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_Ruleset_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_Ruleset() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_Ruleset_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_Ruleset() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_Ruleset_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_Ruleset() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_Ruleset_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_Ruleset() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_Ruleset_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_Ruleset() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_Ruleset_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_Ruleset() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_Ruleset_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_Ruleset() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_Ruleset_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_Ruleset() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_Ruleset_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_Ruleset() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_Ruleset_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_Ruleset() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_Ruleset_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_Ruleset() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_Ruleset_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_Ruleset() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_Ruleset_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA48 dfa48 = new DFA48(this);
    protected DFA54 dfa54 = new DFA54(this);
    protected DFA58 dfa58 = new DFA58(this);
    protected DFA73 dfa73 = new DFA73(this);
    static final String DFA48_eotS =
        "\21\uffff";
    static final String DFA48_eofS =
        "\21\uffff";
    static final String DFA48_minS =
        "\1\4\16\0\2\uffff";
    static final String DFA48_maxS =
        "\1\u0087\16\0\2\uffff";
    static final String DFA48_acceptS =
        "\17\uffff\1\1\1\2";
    static final String DFA48_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\2\uffff}>";
    static final String[] DFA48_transitionS = {
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

    static final short[] DFA48_eot = DFA.unpackEncodedString(DFA48_eotS);
    static final short[] DFA48_eof = DFA.unpackEncodedString(DFA48_eofS);
    static final char[] DFA48_min = DFA.unpackEncodedStringToUnsignedChars(DFA48_minS);
    static final char[] DFA48_max = DFA.unpackEncodedStringToUnsignedChars(DFA48_maxS);
    static final short[] DFA48_accept = DFA.unpackEncodedString(DFA48_acceptS);
    static final short[] DFA48_special = DFA.unpackEncodedString(DFA48_specialS);
    static final short[][] DFA48_transition;

    static {
        int numStates = DFA48_transitionS.length;
        DFA48_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA48_transition[i] = DFA.unpackEncodedString(DFA48_transitionS[i]);
        }
    }

    class DFA48 extends DFA {

        public DFA48(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 48;
            this.eot = DFA48_eot;
            this.eof = DFA48_eof;
            this.min = DFA48_min;
            this.max = DFA48_max;
            this.accept = DFA48_accept;
            this.special = DFA48_special;
            this.transition = DFA48_transition;
        }
        public String getDescription() {
            return "375:1: conditional_expression options {backtrack=true; } : ( disjunction '=>' expr '|' expr | disjunction );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA48_1 = input.LA(1);

                         
                        int index48_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_Ruleset()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index48_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA48_2 = input.LA(1);

                         
                        int index48_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_Ruleset()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index48_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA48_3 = input.LA(1);

                         
                        int index48_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_Ruleset()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index48_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA48_4 = input.LA(1);

                         
                        int index48_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_Ruleset()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index48_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA48_5 = input.LA(1);

                         
                        int index48_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_Ruleset()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index48_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA48_6 = input.LA(1);

                         
                        int index48_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_Ruleset()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index48_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA48_7 = input.LA(1);

                         
                        int index48_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_Ruleset()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index48_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA48_8 = input.LA(1);

                         
                        int index48_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_Ruleset()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index48_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA48_9 = input.LA(1);

                         
                        int index48_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_Ruleset()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index48_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA48_10 = input.LA(1);

                         
                        int index48_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_Ruleset()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index48_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA48_11 = input.LA(1);

                         
                        int index48_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_Ruleset()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index48_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA48_12 = input.LA(1);

                         
                        int index48_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_Ruleset()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index48_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA48_13 = input.LA(1);

                         
                        int index48_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_Ruleset()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index48_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA48_14 = input.LA(1);

                         
                        int index48_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_Ruleset()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index48_14);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 48, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA54_eotS =
        "\23\uffff";
    static final String DFA54_eofS =
        "\23\uffff";
    static final String DFA54_minS =
        "\1\4\1\uffff\2\0\17\uffff";
    static final String DFA54_maxS =
        "\1\u0087\1\uffff\2\0\17\uffff";
    static final String DFA54_acceptS =
        "\1\uffff\1\1\2\uffff\1\6\12\uffff\1\2\1\3\1\4\1\5";
    static final String DFA54_specialS =
        "\2\uffff\1\0\1\1\17\uffff}>";
    static final String[] DFA54_transitionS = {
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

    static final short[] DFA54_eot = DFA.unpackEncodedString(DFA54_eotS);
    static final short[] DFA54_eof = DFA.unpackEncodedString(DFA54_eofS);
    static final char[] DFA54_min = DFA.unpackEncodedStringToUnsignedChars(DFA54_minS);
    static final char[] DFA54_max = DFA.unpackEncodedStringToUnsignedChars(DFA54_maxS);
    static final short[] DFA54_accept = DFA.unpackEncodedString(DFA54_acceptS);
    static final short[] DFA54_special = DFA.unpackEncodedString(DFA54_specialS);
    static final short[][] DFA54_transition;

    static {
        int numStates = DFA54_transitionS.length;
        DFA54_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA54_transition[i] = DFA.unpackEncodedString(DFA54_transitionS[i]);
        }
    }

    class DFA54 extends DFA {

        public DFA54(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 54;
            this.eot = DFA54_eot;
            this.eof = DFA54_eof;
            this.min = DFA54_min;
            this.max = DFA54_max;
            this.accept = DFA54_accept;
            this.special = DFA54_special;
            this.transition = DFA54_transition;
        }
        public String getDescription() {
            return "403:1: unary_expr options {backtrack=true; } : ( 'not' unary_expr | 'seen' STRING 'in' var_domain ':' ID timeframe | 'seen' STRING ( 'before' | 'after' ) STRING 'in' var_domain ':' ID | var_domain ':' ID predop expr timeframe | var_domain ':' ID timeframe | operator_expr );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA54_2 = input.LA(1);

                         
                        int index54_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_Ruleset()) ) {s = 15;}

                        else if ( (synpred12_Ruleset()) ) {s = 16;}

                         
                        input.seek(index54_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA54_3 = input.LA(1);

                         
                        int index54_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_Ruleset()) ) {s = 17;}

                        else if ( (synpred14_Ruleset()) ) {s = 18;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index54_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 54, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA58_eotS =
        "\20\uffff";
    static final String DFA58_eofS =
        "\20\uffff";
    static final String DFA58_minS =
        "\1\4\5\uffff\1\0\11\uffff";
    static final String DFA58_maxS =
        "\1\u0087\5\uffff\1\0\11\uffff";
    static final String DFA58_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\7\1\10\1\uffff\1\12\1\13"+
        "\1\15\1\6\1\11\1\14";
    static final String DFA58_specialS =
        "\6\uffff\1\0\11\uffff}>";
    static final String[] DFA58_transitionS = {
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

    static final short[] DFA58_eot = DFA.unpackEncodedString(DFA58_eotS);
    static final short[] DFA58_eof = DFA.unpackEncodedString(DFA58_eofS);
    static final char[] DFA58_min = DFA.unpackEncodedStringToUnsignedChars(DFA58_minS);
    static final char[] DFA58_max = DFA.unpackEncodedStringToUnsignedChars(DFA58_maxS);
    static final short[] DFA58_accept = DFA.unpackEncodedString(DFA58_acceptS);
    static final short[] DFA58_special = DFA.unpackEncodedString(DFA58_specialS);
    static final short[][] DFA58_transition;

    static {
        int numStates = DFA58_transitionS.length;
        DFA58_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA58_transition[i] = DFA.unpackEncodedString(DFA58_transitionS[i]);
        }
    }

    class DFA58 extends DFA {

        public DFA58(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 58;
            this.eot = DFA58_eot;
            this.eof = DFA58_eof;
            this.min = DFA58_min;
            this.max = DFA58_max;
            this.accept = DFA58_accept;
            this.special = DFA58_special;
            this.transition = DFA58_transition;
        }
        public String getDescription() {
            return "417:1: factor options {backtrack=true; } : ( INT | STRING | REGEXP | 'true' | 'false' | ID '[' expr ']' | persistent_var | trail_exp | function_app | '[' expr ',' ']' | '{' ( hash_line ( ',' )? )* '}' | ID | '(' expr ')' );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA58_6 = input.LA(1);

                         
                        int index58_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_Ruleset()) ) {s = 13;}

                        else if ( (synpred23_Ruleset()) ) {s = 14;}

                        else if ( (synpred26_Ruleset()) ) {s = 15;}

                         
                        input.seek(index58_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 58, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA73_eotS =
        "\12\uffff";
    static final String DFA73_eofS =
        "\12\uffff";
    static final String DFA73_minS =
        "\1\u00a1\6\uffff\1\123\2\uffff";
    static final String DFA73_maxS =
        "\1\u00b4\6\uffff\1\u00ab\2\uffff";
    static final String DFA73_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\7\1\10";
    static final String DFA73_specialS =
        "\12\uffff}>";
    static final String[] DFA73_transitionS = {
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

    static final short[] DFA73_eot = DFA.unpackEncodedString(DFA73_eotS);
    static final short[] DFA73_eof = DFA.unpackEncodedString(DFA73_eofS);
    static final char[] DFA73_min = DFA.unpackEncodedStringToUnsignedChars(DFA73_minS);
    static final char[] DFA73_max = DFA.unpackEncodedStringToUnsignedChars(DFA73_maxS);
    static final short[] DFA73_accept = DFA.unpackEncodedString(DFA73_acceptS);
    static final short[] DFA73_special = DFA.unpackEncodedString(DFA73_specialS);
    static final short[][] DFA73_transition;

    static {
        int numStates = DFA73_transitionS.length;
        DFA73_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA73_transition[i] = DFA.unpackEncodedString(DFA73_transitionS[i]);
        }
    }

    class DFA73 extends DFA {

        public DFA73(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 73;
            this.eot = DFA73_eot;
            this.eof = DFA73_eof;
            this.min = DFA73_min;
            this.max = DFA73_max;
            this.accept = DFA73_accept;
            this.special = DFA73_special;
            this.transition = DFA73_transition;
        }
        public String getDescription() {
            return "540:1: pragma[HashMap keys_map] : ( desc_block | meta_name | 'author' author= STRING | 'key' what= ( 'errorstack' | 'googleanalytics' | 'twitter' | 'amazon' | 'kpds' | 'google' | ID ) key_value[key_values] | authz_pragma | logging_pargma | 'use' 'module' ID ( alias )? | 'use' ( 'css' | 'javascript' ) 'resource' location );";
        }
    }
 

    public static final BitSet FOLLOW_comment_in_ruleset662 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleset665 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rulesetname_in_ruleset667 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleset671 = new BitSet(new long[]{0x0000000000440100L,0x0000000000010000L,0x0000000120000000L});
    public static final BitSet FOLLOW_meta_block_in_ruleset679 = new BitSet(new long[]{0x0000000000640100L,0x0000000000010000L,0x0000000120000000L});
    public static final BitSet FOLLOW_comment_in_ruleset684 = new BitSet(new long[]{0x0000000000640100L,0x0000000000010000L,0x0000000120000000L});
    public static final BitSet FOLLOW_dispatch_block_in_ruleset691 = new BitSet(new long[]{0x0000000000640100L,0x0000000000010000L,0x0000000120000000L});
    public static final BitSet FOLLOW_global_decls_in_ruleset699 = new BitSet(new long[]{0x0000000000640100L,0x0000000000010000L,0x0000000120000000L});
    public static final BitSet FOLLOW_rule_in_ruleset707 = new BitSet(new long[]{0x0000000000640100L,0x0000000000010000L,0x0000000120000000L});
    public static final BitSet FOLLOW_21_in_ruleset714 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_ruleset716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REGEXP_in_mult_line_comment_or_regx772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CMT_in_single_line_comment782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_single_line_comment_in_comment807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mult_line_comment_or_regx_in_comment811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_rulesetname0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule854 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_rule856 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rule858 = new BitSet(new long[]{0x00E0000000000000L});
    public static final BitSet FOLLOW_rule_state_in_rule860 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rule862 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_select_clause_in_rule865 = new BitSet(new long[]{0xC000000020000010L,0x0000000000000001L,0x0000000000000100L});
    public static final BitSet FOLLOW_pre_block_in_rule867 = new BitSet(new long[]{0xC000000020000010L,0x0000000000000001L,0x0000000000000100L});
    public static final BitSet FOLLOW_emit_block_in_rule870 = new BitSet(new long[]{0xC000000020000010L,0x0000000000000001L,0x0000000000000100L});
    public static final BitSet FOLLOW_action_in_rule874 = new BitSet(new long[]{0x000000004F200000L});
    public static final BitSet FOLLOW_24_in_rule876 = new BitSet(new long[]{0x000000004E200000L});
    public static final BitSet FOLLOW_callbacks_in_rule880 = new BitSet(new long[]{0x000000000E200000L});
    public static final BitSet FOLLOW_post_block_in_rule883 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rule887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_post_in_post_block903 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_post_block905 = new BitSet(new long[]{0x000385A000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_post_statement_in_post_block907 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_post_block909 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_post_block911 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_post_block913 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_post_alternate_in_post_block915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_post0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_post_alternate946 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_post_alternate948 = new BitSet(new long[]{0x000385A000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_post_statement_in_post_alternate950 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_post_alternate952 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_post_alternate954 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_post_alternate956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_persistent_expr_in_post_statement963 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_post_statement966 = new BitSet(new long[]{0x0200000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_post_statement968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_log_statement_in_post_statement975 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_post_statement978 = new BitSet(new long[]{0x0200000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_post_statement980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_control_statement_in_post_statement987 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_post_statement990 = new BitSet(new long[]{0x0200000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_post_statement992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_raise_statement_in_post_statement999 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_post_statement1002 = new BitSet(new long[]{0x0200000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_post_statement1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_callbacks1016 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_callbacks1018 = new BitSet(new long[]{0x0000000180200000L});
    public static final BitSet FOLLOW_success_in_callbacks1020 = new BitSet(new long[]{0x0000000100200000L});
    public static final BitSet FOLLOW_failure_in_callbacks1023 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_callbacks1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_success1033 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_success1035 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_click_in_success1037 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_24_in_success1039 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_success1042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_failure1049 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_failure1051 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_click_in_failure1053 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_24_in_failure1055 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_failure1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_click1067 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_click1075 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_click1077 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_click1079 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_click_link_in_click1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_click_link1089 = new BitSet(new long[]{0x000005A000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_persistent_expr_in_click_link1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_persistent_clear_in_persistent_expr1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_persistent_set_in_persistent_expr1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_persistent_iterate_in_persistent_expr1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_trail_forget_in_persistent_expr1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_trail_mark_in_persistent_expr1127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_persistent_clear1135 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_var_domain_in_persistent_clear1137 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_persistent_clear1139 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_persistent_clear1141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_persistent_set1148 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_var_domain_in_persistent_set1150 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_persistent_set1152 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_persistent_set1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_domain_in_persistent_iterate1161 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_persistent_iterate1163 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_persistent_iterate1165 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_counter_op_in_persistent_iterate1167 = new BitSet(new long[]{0x0200000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_persistent_iterate1169 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_counter_start_in_persistent_iterate1171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_trail_forget1178 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_trail_forget1180 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_trail_forget1182 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_var_domain_in_trail_forget1184 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_trail_forget1186 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_trail_forget1188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_trail_mark1195 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_var_domain_in_trail_mark1197 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_trail_mark1199 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_trail_mark1201 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_trail_with_in_trail_mark1203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_trail_with1210 = new BitSet(new long[]{0x0200000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_trail_with1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_counter_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_counter_start1241 = new BitSet(new long[]{0x0200000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_counter_start1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_log_statement1251 = new BitSet(new long[]{0x0200000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_log_statement1253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_control_statement1260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_raise_statement1267 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_raise_statement1269 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_raise_statement1271 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_raise_statement1273 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_for_clause_in_raise_statement1275 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_modifier_clause_in_raise_statement1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_for_clause1284 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_for_clause1286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_rule_state0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unconditional_action_in_action1366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_action_in_action1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_conditional_action1383 = new BitSet(new long[]{0x0200000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_conditional_action1385 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_conditional_action1387 = new BitSet(new long[]{0xC000000000000010L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_unconditional_action_in_conditional_action1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actionblock_in_unconditional_action1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primrule_in_unconditional_action1411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule_label_in_primrule1427 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_namespace_in_primrule1430 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_primrule1433 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_primrule1435 = new BitSet(new long[]{0x0E00000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_arguments_in_primrule1437 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_primrule1439 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_modifier_clause_in_primrule1441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule_label_in_primrule1447 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_emit_block_in_primrule1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_arguments1465 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_59_in_arguments1470 = new BitSet(new long[]{0x0200000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_arguments1472 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_ID_in_rule_label1494 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_rule_label1496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_modifier_clause1517 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_modifier_in_modifier_clause1519 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_modifier_clause1522 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_modifier_in_modifier_clause1524 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_ID_in_modifier1539 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_modifier1541 = new BitSet(new long[]{0x0200000000120930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_modifier1544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JS_in_modifier1548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blocktype_in_actionblock1563 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_actionblock1565 = new BitSet(new long[]{0xC000000000200010L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_primrule_in_actionblock1568 = new BitSet(new long[]{0xC000000001200010L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_24_in_actionblock1570 = new BitSet(new long[]{0xC000000000200010L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_21_in_actionblock1575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_blocktype0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_pre_block1617 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_pre_block1619 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_decl_in_pre_block1622 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_24_in_pre_block1624 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_pre_block1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_foreach1649 = new BitSet(new long[]{0x0200000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_foreach1651 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_setting_in_foreach1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_select_clause1672 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_using_in_select_clause1675 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_when_in_select_clause1677 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_foreach_in_select_clause1680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_using1694 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_using1696 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_setting_in_using1698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_when1705 = new BitSet(new long[]{0x0200000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_event_seq_in_when1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_event_or_in_event_seq1728 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_event_seq1730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_event_or_in_event_seq1735 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_event_seq1737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_event_or_in_event_seq1742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_event_and_in_event_or1753 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_event_or1756 = new BitSet(new long[]{0x0200000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_event_and_in_event_or1758 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_event_btwn_in_event_and1769 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_event_and1772 = new BitSet(new long[]{0x0200000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_event_btwn_in_event_and1774 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_event_prim_in_event_btwn1787 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_event_btwn1790 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_event_btwn1793 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_event_btwn1795 = new BitSet(new long[]{0x0200000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_event_seq_in_event_btwn1797 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_event_btwn1799 = new BitSet(new long[]{0x0200000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_event_seq_in_event_btwn1801 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_event_btwn1803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_event_domain_in_event_prim1818 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_event_prim1820 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_set_in_event_prim1822 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_setting_in_event_prim1828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_event_domain_in_event_prim1833 = new BitSet(new long[]{0x0000000600000000L,0x0000000000001C00L});
    public static final BitSet FOLLOW_set_in_event_prim1835 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_event_prim1847 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_on_expr_in_event_prim1849 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_setting_in_event_prim1852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_event_prim1857 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_event_prim1859 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_event_filter_in_event_prim1861 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_setting_in_event_prim1863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_event_prim1868 = new BitSet(new long[]{0x0200000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_event_seq_in_event_prim1870 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_event_prim1872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_setting1883 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_setting1885 = new BitSet(new long[]{0x0400000000000010L});
    public static final BitSet FOLLOW_ID_in_setting1888 = new BitSet(new long[]{0x0C00000000000010L});
    public static final BitSet FOLLOW_59_in_setting1890 = new BitSet(new long[]{0x0400000000000010L});
    public static final BitSet FOLLOW_58_in_setting1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_event_domain1905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_event_filter1919 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_set_in_event_filter1921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_on_expr1939 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_set_in_on_expr1941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_global_decls1965 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_global_decls1967 = new BitSet(new long[]{0x0000000000000010L,0x00000000000A0000L,0x0000000000000300L});
    public static final BitSet FOLLOW_global_in_global_decls1971 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_global_decls1973 = new BitSet(new long[]{0x0000000000200010L,0x00000000000A0000L,0x0000000000000300L});
    public static final BitSet FOLLOW_21_in_global_decls1978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emit_block_in_global1994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dataset_in_global1998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_datasource_in_global2002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_css_emit_in_global2006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decl_in_global2010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_datasource2022 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_datasource2024 = new BitSet(new long[]{0x0000004000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_datatype_in_datasource2026 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_datasource2029 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_datasource2031 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_cachable_in_datasource2033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_css_emit2045 = new BitSet(new long[]{0x0000000000010800L});
    public static final BitSet FOLLOW_set_in_css_emit2047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_decl2081 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_decl2083 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_HTML_in_decl2085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_decl2090 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_decl2092 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_JS_in_decl2094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_decl2099 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_decl2101 = new BitSet(new long[]{0x0200000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_decl2103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_def_in_expr2133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_expression_in_expr2137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_function_def2162 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_function_def2164 = new BitSet(new long[]{0x0400000000000010L});
    public static final BitSet FOLLOW_ID_in_function_def2167 = new BitSet(new long[]{0x0C00000000000010L});
    public static final BitSet FOLLOW_59_in_function_def2169 = new BitSet(new long[]{0x0400000000000010L});
    public static final BitSet FOLLOW_58_in_function_def2174 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_function_def2176 = new BitSet(new long[]{0x0200000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_fundecls_in_function_def2178 = new BitSet(new long[]{0x0200000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_function_def2181 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_24_in_function_def2183 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_function_def2186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decl_in_fundecls2210 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_fundecls2212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_disjunction_in_conditional_expression2238 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_conditional_expression2240 = new BitSet(new long[]{0x0200000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_conditional_expression2242 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_conditional_expression2244 = new BitSet(new long[]{0x0200000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_conditional_expression2246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_disjunction_in_conditional_expression2250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conjunction_in_disjunction2263 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_disjunction2266 = new BitSet(new long[]{0x0200000000100930L,0x0000374000000080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_conjunction_in_disjunction2268 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_equality_expr_in_conjunction2284 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_conjunction2287 = new BitSet(new long[]{0x0200000000100930L,0x0000374000000080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_equality_expr_in_conjunction2289 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_add_expr_in_equality_expr2304 = new BitSet(new long[]{0x0000000000000002L,0x00000001FF000000L});
    public static final BitSet FOLLOW_predop_in_equality_expr2307 = new BitSet(new long[]{0x0200000000100930L,0x0000374000000080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_add_expr_in_equality_expr2309 = new BitSet(new long[]{0x0000000000000002L,0x00000001FF000000L});
    public static final BitSet FOLLOW_set_in_predop0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mult_expr_in_add_expr2364 = new BitSet(new long[]{0x0000000000000002L,0x0000000600000000L});
    public static final BitSet FOLLOW_add_op_in_add_expr2367 = new BitSet(new long[]{0x0200000000100930L,0x0000374000000080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_mult_expr_in_add_expr2369 = new BitSet(new long[]{0x0000000000000002L,0x0000000600000000L});
    public static final BitSet FOLLOW_set_in_add_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_expr_in_mult_expr2391 = new BitSet(new long[]{0x0000000000000002L,0x0000003800000000L});
    public static final BitSet FOLLOW_mult_op_in_mult_expr2394 = new BitSet(new long[]{0x0200000000100930L,0x0000374000000080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_unary_expr_in_mult_expr2396 = new BitSet(new long[]{0x0000000000000002L,0x0000003800000000L});
    public static final BitSet FOLLOW_set_in_mult_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_unary_expr2431 = new BitSet(new long[]{0x0200000000100930L,0x0000374000000080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_unary_expr_in_unary_expr2433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_unary_expr2439 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_unary_expr2441 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_unary_expr2443 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_var_domain_in_unary_expr2445 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_unary_expr2447 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_unary_expr2449 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_timeframe_in_unary_expr2451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_unary_expr2456 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_unary_expr2458 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000020L});
    public static final BitSet FOLLOW_set_in_unary_expr2460 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_unary_expr2468 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_unary_expr2470 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_var_domain_in_unary_expr2472 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_unary_expr2474 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_unary_expr2476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_domain_in_unary_expr2481 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_unary_expr2483 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_unary_expr2485 = new BitSet(new long[]{0x0000000000000000L,0x00000001FF000000L});
    public static final BitSet FOLLOW_predop_in_unary_expr2487 = new BitSet(new long[]{0x0200000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_unary_expr2489 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_timeframe_in_unary_expr2491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_domain_in_unary_expr2496 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_unary_expr2498 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_unary_expr2500 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_timeframe_in_unary_expr2502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operator_expr_in_unary_expr2507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_operator_expr2521 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_operator_in_operator_expr2523 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_INT_in_factor2548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_factor2558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REGEXP_in_factor2568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_factor2578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_factor2588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_factor2598 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_factor2600 = new BitSet(new long[]{0x0200000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_factor2602 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_factor2604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_persistent_var_in_factor2614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_trail_exp_in_factor2624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_app_in_factor2634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_factor2644 = new BitSet(new long[]{0x0200000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_factor2646 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_factor2648 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_factor2650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_factor2660 = new BitSet(new long[]{0x0000000000200800L});
    public static final BitSet FOLLOW_hash_line_in_factor2663 = new BitSet(new long[]{0x0800000000200800L});
    public static final BitSet FOLLOW_59_in_factor2665 = new BitSet(new long[]{0x0000000000200800L});
    public static final BitSet FOLLOW_21_in_factor2670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_factor2680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_factor2691 = new BitSet(new long[]{0x0200000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_factor2693 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_factor2695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_hash_line2708 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_hash_line2710 = new BitSet(new long[]{0x0200000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_hash_line2712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namespace_in_function_app2725 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_function_app2727 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_function_app2729 = new BitSet(new long[]{0x0600000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_function_app2732 = new BitSet(new long[]{0x0E00000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_59_in_function_app2734 = new BitSet(new long[]{0x0600000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_58_in_function_app2739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_function_app2745 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_function_app2747 = new BitSet(new long[]{0x0600000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_function_app2750 = new BitSet(new long[]{0x0E00000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_59_in_function_app2752 = new BitSet(new long[]{0x0600000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_58_in_function_app2757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_namespace2769 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_namespace2771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_trail_exp2783 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_var_domain_in_trail_exp2785 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_trail_exp2787 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_trail_exp2789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_trail_exp2794 = new BitSet(new long[]{0x0200000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_trail_exp2796 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_var_domain_in_trail_exp2798 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_trail_exp2800 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_trail_exp2802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_domain_in_persistent_var2816 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_persistent_var2818 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_persistent_var2820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_operator2832 = new BitSet(new long[]{0x0000000000000000L,0xFFFF800000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_operator_op_in_operator2834 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_operator2836 = new BitSet(new long[]{0x0200000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_operator2838 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_59_in_operator2840 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_operator2843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operator_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_timeframe2953 = new BitSet(new long[]{0x0200000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_timeframe2955 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000001FFF8000L});
    public static final BitSet FOLLOW_periods_in_timeframe2958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_period_in_timeframe2962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_var_domain0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_emit_block2989 = new BitSet(new long[]{0x0000000000030800L});
    public static final BitSet FOLLOW_set_in_emit_block2991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_dataset3009 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_dataset3011 = new BitSet(new long[]{0x0000004000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_datatype_in_dataset3013 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_dataset3016 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_dataset3018 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_cachable_in_dataset3020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_datatype3030 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000003C00L});
    public static final BitSet FOLLOW_set_in_datatype3032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_142_in_cachable3049 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_cachetime_in_cachable3051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_cachetime3062 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_INT_in_cachetime3064 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000001FFF8000L});
    public static final BitSet FOLLOW_periods_in_cachetime3067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_period_in_cachetime3069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_periods0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_period0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_157_in_dispatch_block3204 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_dispatch_block3206 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_dispatch_in_dispatch_block3208 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_21_in_dispatch_block3211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_158_in_dispatch3220 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_dispatch3222 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_dispatch_target_in_dispatch3224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_159_in_dispatch_target3236 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_dispatch_target3238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_160_in_meta_block3273 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_meta_block3275 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000000L,0x0012620600000000L});
    public static final BitSet FOLLOW_pragma_in_meta_block3277 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000000L,0x0012620600000000L});
    public static final BitSet FOLLOW_21_in_meta_block3281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_desc_block_in_pragma3305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_meta_name_in_pragma3311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_161_in_pragma3316 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_pragma3320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_162_in_pragma3329 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000000L,0x000001F800000000L});
    public static final BitSet FOLLOW_set_in_pragma3333 = new BitSet(new long[]{0x0000000000100800L});
    public static final BitSet FOLLOW_key_value_in_pragma3351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_authz_pragma_in_pragma3360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logging_pargma_in_pragma3365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_169_in_pragma3370 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_170_in_pragma3372 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_pragma3374 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_alias_in_pragma3376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_169_in_pragma3382 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000080000000000L});
    public static final BitSet FOLLOW_set_in_pragma3384 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_172_in_pragma3392 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_location_in_pragma3394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_173_in_meta_name3408 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_meta_name3412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_174_in_authz_pragma3426 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_175_in_authz_pragma3428 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_176_in_authz_pragma3430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_177_in_logging_pargma3442 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L,0x0004000000000000L});
    public static final BitSet FOLLOW_set_in_logging_pargma3444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_179_in_alias3459 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_alias3461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_location0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_180_in_desc_block3492 = new BitSet(new long[]{0x0000000000010800L});
    public static final BitSet FOLLOW_set_in_desc_block3496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_key_value3517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_key_value3521 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_name_value_pair_in_key_value3524 = new BitSet(new long[]{0x0800000000200800L});
    public static final BitSet FOLLOW_59_in_key_value3527 = new BitSet(new long[]{0x0000000000200800L});
    public static final BitSet FOLLOW_21_in_key_value3532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_name_value_pair3555 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_name_value_pair3557 = new BitSet(new long[]{0x00000000000008A0L});
    public static final BitSet FOLLOW_INT_in_name_value_pair3562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_name_value_pair3570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_name_value_pair3578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_single_line_comment_in_synpred1_Ruleset802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unconditional_action_in_synpred2_Ruleset1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actionblock_in_synpred3_Ruleset1403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_event_or_in_synpred4_Ruleset1728 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_synpred4_Ruleset1730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_event_or_in_synpred5_Ruleset1735 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_synpred5_Ruleset1737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_disjunction_in_synpred9_Ruleset2238 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_synpred9_Ruleset2240 = new BitSet(new long[]{0x0200000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_synpred9_Ruleset2242 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_synpred9_Ruleset2244 = new BitSet(new long[]{0x0200000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_synpred9_Ruleset2246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_synpred11_Ruleset2439 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_synpred11_Ruleset2441 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_synpred11_Ruleset2443 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_var_domain_in_synpred11_Ruleset2445 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_synpred11_Ruleset2447 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_synpred11_Ruleset2449 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_timeframe_in_synpred11_Ruleset2451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_synpred12_Ruleset2456 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_synpred12_Ruleset2458 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000020L});
    public static final BitSet FOLLOW_set_in_synpred12_Ruleset2460 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_synpred12_Ruleset2468 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_synpred12_Ruleset2470 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_var_domain_in_synpred12_Ruleset2472 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_synpred12_Ruleset2474 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_synpred12_Ruleset2476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_domain_in_synpred13_Ruleset2481 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_synpred13_Ruleset2483 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_synpred13_Ruleset2485 = new BitSet(new long[]{0x0000000000000000L,0x00000001FF000000L});
    public static final BitSet FOLLOW_predop_in_synpred13_Ruleset2487 = new BitSet(new long[]{0x0200000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_synpred13_Ruleset2489 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_timeframe_in_synpred13_Ruleset2491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_domain_in_synpred14_Ruleset2496 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_synpred14_Ruleset2498 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_synpred14_Ruleset2500 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_timeframe_in_synpred14_Ruleset2502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_synpred20_Ruleset2598 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_synpred20_Ruleset2600 = new BitSet(new long[]{0x0200000000100930L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_synpred20_Ruleset2602 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_synpred20_Ruleset2604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_app_in_synpred23_Ruleset2634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_synpred26_Ruleset2680 = new BitSet(new long[]{0x0000000000000002L});

}