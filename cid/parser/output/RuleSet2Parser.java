// $ANTLR 3.2 Sep 23, 2009 12:02:23 RuleSet2.g 2010-07-15 13:20:18

	package com.kynetx;
	import java.util.HashMap;
	import java.util.ArrayList;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class RuleSet2Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "VAR", "INT", "EXPONENT", "FLOAT", "NUM", "COMMENT", "WS", "ESC_SEQ", "STRING", "HTML", "JS", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "'<='", "'>='", "'<'", "'>'", "'=='", "'!='", "'eq'", "'neq'", "'like'", "'+'", "'-'", "'*'", "'/'", "'%'", "'ruleset'", "'{'", "'}'", "'global'", "'dataset'", "'datasource'", "':'", "'JSON'", "'XML'", "'RSS'", "'HTML'", "'<-'", "';'", "'='", "'function'", "'('", "','", "')'", "'=>'", "'|'", "'||'", "'&&'", "'not'", "'seen'", "'in'", "'before'", "'after'", "'.'", "'pick'", "'match'", "'length'", "'replace'", "'as'", "'head'", "'tail'", "'sort'", "'filter'", "'map'", "'uc'", "'lc'", "'split'", "'join'", "'query'", "'has'", "'union'", "'difference'", "'intersection'", "'unique'", "'once'", "'duplicates'", "'true'", "'false'", "'['", "']'", "'ent'", "'app'", "'current'", "'history'", "'within'", "'css'", "'years'", "'months'", "'weeks'", "'days'", "'hours'", "'minutes'", "'seconds'", "'year'", "'month'", "'week'", "'day'", "'hour'", "'minute'", "'second'", "'cachable'", "'for'", "'emit'", "'meta'", "'description'", "'name'", "'author'", "'key'", "'errorstack'", "'googleanalytics'", "'twitter'", "'amazon'", "'kpds'", "'google'", "'authz'", "'require'", "'user'", "'logging'", "'on'", "'off'", "'use'", "'module'", "'alias'", "'javascript'", "'resource'", "'dispatch'", "'domain'", "'->'"
    };
    public static final int EXPONENT=6;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int OCTAL_ESC=17;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__19=19;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__90=90;
    public static final int T__18=18;
    public static final int VAR=4;
    public static final int COMMENT=9;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int INT=5;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int T__126=126;
    public static final int T__125=125;
    public static final int T__128=128;
    public static final int T__127=127;
    public static final int WS=10;
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
    public static final int HTML=13;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int ESC_SEQ=11;
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
    public static final int UNICODE_ESC=16;
    public static final int JS=14;
    public static final int HEX_DIGIT=15;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int NUM=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int STRING=12;

    // delegates
    // delegators


        public RuleSet2Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public RuleSet2Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return RuleSet2Parser.tokenNames; }
    public String getGrammarFileName() { return "RuleSet2.g"; }

     

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


    public static class predop_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "predop"
    // RuleSet2.g:57:10: fragment predop : ( '<=' | '>=' | '<' | '>' | '==' | '!=' | 'eq' | 'neq' | 'like' );
    public final RuleSet2Parser.predop_return predop() throws RecognitionException {
        RuleSet2Parser.predop_return retval = new RuleSet2Parser.predop_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set1=null;

        Object set1_tree=null;

        try {
            // RuleSet2.g:57:16: ( '<=' | '>=' | '<' | '>' | '==' | '!=' | 'eq' | 'neq' | 'like' )
            // RuleSet2.g:
            {
            root_0 = (Object)adaptor.nil();

            set1=(Token)input.LT(1);
            if ( (input.LA(1)>=18 && input.LA(1)<=26) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set1));
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

    public static class add_op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "add_op"
    // RuleSet2.g:59:10: fragment add_op : ( '+' | '-' );
    public final RuleSet2Parser.add_op_return add_op() throws RecognitionException {
        RuleSet2Parser.add_op_return retval = new RuleSet2Parser.add_op_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set2=null;

        Object set2_tree=null;

        try {
            // RuleSet2.g:59:16: ( '+' | '-' )
            // RuleSet2.g:
            {
            root_0 = (Object)adaptor.nil();

            set2=(Token)input.LT(1);
            if ( (input.LA(1)>=27 && input.LA(1)<=28) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set2));
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

    public static class mult_op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mult_op"
    // RuleSet2.g:61:10: fragment mult_op : ( '*' | '/' | '%' );
    public final RuleSet2Parser.mult_op_return mult_op() throws RecognitionException {
        RuleSet2Parser.mult_op_return retval = new RuleSet2Parser.mult_op_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set3=null;

        Object set3_tree=null;

        try {
            // RuleSet2.g:61:17: ( '*' | '/' | '%' )
            // RuleSet2.g:
            {
            root_0 = (Object)adaptor.nil();

            set3=(Token)input.LT(1);
            if ( (input.LA(1)>=29 && input.LA(1)<=31) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set3));
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

    public static class ruleset_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ruleset"
    // RuleSet2.g:133:1: ruleset options {backtrack=false; } : 'ruleset' rulesetname '{' ( meta_block | dispatch_block | global_block )+ '}' EOF ;
    public final RuleSet2Parser.ruleset_return ruleset() throws RecognitionException {
        RuleSet2Parser.ruleset_return retval = new RuleSet2Parser.ruleset_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal4=null;
        Token char_literal6=null;
        Token char_literal10=null;
        Token EOF11=null;
        RuleSet2Parser.rulesetname_return rulesetname5 = null;

        RuleSet2Parser.meta_block_return meta_block7 = null;

        RuleSet2Parser.dispatch_block_return dispatch_block8 = null;

        RuleSet2Parser.global_block_return global_block9 = null;


        Object string_literal4_tree=null;
        Object char_literal6_tree=null;
        Object char_literal10_tree=null;
        Object EOF11_tree=null;


         	 rule_json.put("global",new ArrayList());
         	 rule_json.put("dispatch",new ArrayList());
         	 rule_json.put("rules",new ArrayList());
         	 rule_json.put("meta", new HashMap());
        	 current_top = rule_json;

        try {
            // RuleSet2.g:144:3: ( 'ruleset' rulesetname '{' ( meta_block | dispatch_block | global_block )+ '}' EOF )
            // RuleSet2.g:144:7: 'ruleset' rulesetname '{' ( meta_block | dispatch_block | global_block )+ '}' EOF
            {
            root_0 = (Object)adaptor.nil();

            string_literal4=(Token)match(input,32,FOLLOW_32_in_ruleset756); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal4_tree = (Object)adaptor.create(string_literal4);
            adaptor.addChild(root_0, string_literal4_tree);
            }
            pushFollow(FOLLOW_rulesetname_in_ruleset758);
            rulesetname5=rulesetname();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, rulesetname5.getTree());
            if ( state.backtracking==0 ) {
               current_top.put("ruleset_name",(rulesetname5!=null?input.toString(rulesetname5.start,rulesetname5.stop):null)); 
            }
            char_literal6=(Token)match(input,33,FOLLOW_33_in_ruleset762); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal6_tree = (Object)adaptor.create(char_literal6);
            adaptor.addChild(root_0, char_literal6_tree);
            }
            // RuleSet2.g:145:4: ( meta_block | dispatch_block | global_block )+
            int cnt1=0;
            loop1:
            do {
                int alt1=4;
                switch ( input.LA(1) ) {
                case 109:
                    {
                    alt1=1;
                    }
                    break;
                case 131:
                    {
                    alt1=2;
                    }
                    break;
                case 35:
                    {
                    alt1=3;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // RuleSet2.g:145:6: meta_block
            	    {
            	    pushFollow(FOLLOW_meta_block_in_ruleset770);
            	    meta_block7=meta_block();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, meta_block7.getTree());

            	    }
            	    break;
            	case 2 :
            	    // RuleSet2.g:145:19: dispatch_block
            	    {
            	    pushFollow(FOLLOW_dispatch_block_in_ruleset774);
            	    dispatch_block8=dispatch_block();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, dispatch_block8.getTree());

            	    }
            	    break;
            	case 3 :
            	    // RuleSet2.g:145:36: global_block
            	    {
            	    pushFollow(FOLLOW_global_block_in_ruleset778);
            	    global_block9=global_block();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, global_block9.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            char_literal10=(Token)match(input,34,FOLLOW_34_in_ruleset785); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal10_tree = (Object)adaptor.create(char_literal10);
            adaptor.addChild(root_0, char_literal10_tree);
            }
            EOF11=(Token)match(input,EOF,FOLLOW_EOF_in_ruleset787); if (state.failed) return retval;
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

    public static class rulesetname_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rulesetname"
    // RuleSet2.g:149:1: rulesetname : ( VAR | INT );
    public final RuleSet2Parser.rulesetname_return rulesetname() throws RecognitionException {
        RuleSet2Parser.rulesetname_return retval = new RuleSet2Parser.rulesetname_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set12=null;

        Object set12_tree=null;

        try {
            // RuleSet2.g:150:2: ( VAR | INT )
            // RuleSet2.g:
            {
            root_0 = (Object)adaptor.nil();

            set12=(Token)input.LT(1);
            if ( (input.LA(1)>=VAR && input.LA(1)<=INT) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set12));
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

    public static class global_block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "global_block"
    // RuleSet2.g:154:1: global_block : 'global' '{' (emt= emit_block | dst= ( 'dataset' | 'datasource' ) name= VAR ( ':' dtype= ( 'JSON' | 'XML' | 'RSS' | 'HTML' ) )? '<-' src= STRING (cas= cachable )? | css_emit | decl[global_block_array] | ';' )+ '}' ;
    public final RuleSet2Parser.global_block_return global_block() throws RecognitionException {
        RuleSet2Parser.global_block_return retval = new RuleSet2Parser.global_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token dst=null;
        Token name=null;
        Token dtype=null;
        Token src=null;
        Token string_literal13=null;
        Token char_literal14=null;
        Token char_literal15=null;
        Token string_literal16=null;
        Token char_literal19=null;
        Token char_literal20=null;
        RuleSet2Parser.emit_block_return emt = null;

        RuleSet2Parser.cachable_return cas = null;

        RuleSet2Parser.css_emit_return css_emit17 = null;

        RuleSet2Parser.decl_return decl18 = null;


        Object dst_tree=null;
        Object name_tree=null;
        Object dtype_tree=null;
        Object src_tree=null;
        Object string_literal13_tree=null;
        Object char_literal14_tree=null;
        Object char_literal15_tree=null;
        Object string_literal16_tree=null;
        Object char_literal19_tree=null;
        Object char_literal20_tree=null;


        	 ArrayList global_block_array = (ArrayList)rule_json.get("global");
        	 boolean found_cache = false;

        try {
            // RuleSet2.g:161:2: ( 'global' '{' (emt= emit_block | dst= ( 'dataset' | 'datasource' ) name= VAR ( ':' dtype= ( 'JSON' | 'XML' | 'RSS' | 'HTML' ) )? '<-' src= STRING (cas= cachable )? | css_emit | decl[global_block_array] | ';' )+ '}' )
            // RuleSet2.g:161:4: 'global' '{' (emt= emit_block | dst= ( 'dataset' | 'datasource' ) name= VAR ( ':' dtype= ( 'JSON' | 'XML' | 'RSS' | 'HTML' ) )? '<-' src= STRING (cas= cachable )? | css_emit | decl[global_block_array] | ';' )+ '}'
            {
            root_0 = (Object)adaptor.nil();

            string_literal13=(Token)match(input,35,FOLLOW_35_in_global_block830); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal13_tree = (Object)adaptor.create(string_literal13);
            adaptor.addChild(root_0, string_literal13_tree);
            }
            char_literal14=(Token)match(input,33,FOLLOW_33_in_global_block832); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal14_tree = (Object)adaptor.create(char_literal14);
            adaptor.addChild(root_0, char_literal14_tree);
            }
            // RuleSet2.g:162:2: (emt= emit_block | dst= ( 'dataset' | 'datasource' ) name= VAR ( ':' dtype= ( 'JSON' | 'XML' | 'RSS' | 'HTML' ) )? '<-' src= STRING (cas= cachable )? | css_emit | decl[global_block_array] | ';' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=6;
                switch ( input.LA(1) ) {
                case 108:
                    {
                    alt4=1;
                    }
                    break;
                case 36:
                case 37:
                    {
                    alt4=2;
                    }
                    break;
                case 91:
                    {
                    alt4=3;
                    }
                    break;
                case VAR:
                    {
                    alt4=4;
                    }
                    break;
                case 44:
                    {
                    alt4=5;
                    }
                    break;

                }

                switch (alt4) {
            	case 1 :
            	    // RuleSet2.g:162:4: emt= emit_block
            	    {
            	    pushFollow(FOLLOW_emit_block_in_global_block840);
            	    emt=emit_block();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, emt.getTree());
            	    if ( state.backtracking==0 ) {

            	      		HashMap tmp = new HashMap(); 
            	      		tmp.put("emit",(emt!=null?emt.emit_value:null));
            	      		global_block_array.add(tmp);
            	      	
            	    }

            	    }
            	    break;
            	case 2 :
            	    // RuleSet2.g:167:4: dst= ( 'dataset' | 'datasource' ) name= VAR ( ':' dtype= ( 'JSON' | 'XML' | 'RSS' | 'HTML' ) )? '<-' src= STRING (cas= cachable )?
            	    {
            	    dst=(Token)input.LT(1);
            	    if ( (input.LA(1)>=36 && input.LA(1)<=37) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(dst));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    name=(Token)match(input,VAR,FOLLOW_VAR_in_global_block859); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    name_tree = (Object)adaptor.create(name);
            	    adaptor.addChild(root_0, name_tree);
            	    }
            	    // RuleSet2.g:167:43: ( ':' dtype= ( 'JSON' | 'XML' | 'RSS' | 'HTML' ) )?
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==38) ) {
            	        alt2=1;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // RuleSet2.g:167:44: ':' dtype= ( 'JSON' | 'XML' | 'RSS' | 'HTML' )
            	            {
            	            char_literal15=(Token)match(input,38,FOLLOW_38_in_global_block862); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal15_tree = (Object)adaptor.create(char_literal15);
            	            adaptor.addChild(root_0, char_literal15_tree);
            	            }
            	            dtype=(Token)input.LT(1);
            	            if ( (input.LA(1)>=39 && input.LA(1)<=42) ) {
            	                input.consume();
            	                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(dtype));
            	                state.errorRecovery=false;state.failed=false;
            	            }
            	            else {
            	                if (state.backtracking>0) {state.failed=true; return retval;}
            	                MismatchedSetException mse = new MismatchedSetException(null,input);
            	                throw mse;
            	            }


            	            }
            	            break;

            	    }

            	    string_literal16=(Token)match(input,43,FOLLOW_43_in_global_block878); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal16_tree = (Object)adaptor.create(string_literal16);
            	    adaptor.addChild(root_0, string_literal16_tree);
            	    }
            	    src=(Token)match(input,STRING,FOLLOW_STRING_in_global_block882); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    src_tree = (Object)adaptor.create(src);
            	    adaptor.addChild(root_0, src_tree);
            	    }
            	    // RuleSet2.g:167:100: (cas= cachable )?
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==106) ) {
            	        alt3=1;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // RuleSet2.g:167:101: cas= cachable
            	            {
            	            pushFollow(FOLLOW_cachable_in_global_block887);
            	            cas=cachable();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, cas.getTree());
            	            if ( state.backtracking==0 ) {
            	              found_cache =true; 
            	            }

            	            }
            	            break;

            	    }

            	    if ( state.backtracking==0 ) {

            	      	
            	      		HashMap tmp = new HashMap(); 
            	      		tmp.put("type",(dst!=null?dst.getText():null));	
            	      		tmp.put("name",(name!=null?name.getText():null));
            	      		tmp.put("datatype","JSON");
            	      		if((dtype!=null?dtype.getText():null) != null)
            	      		{
            	      			tmp.put("datatype",(dtype!=null?dtype.getText():null));
            	      		}
            	      		tmp.put("source",strip_string((src!=null?src.getText():null)));
            	      		if(found_cache)
            	      		{
            	      			if((cas!=null?cas.what:null) instanceof HashMap)
            	      			{
            	      				tmp.put("cachable",(cas!=null?cas.what:null));
            	      			}
            	      			else if((cas!=null?cas.what:null) instanceof Integer)
            	      			{
            	      				tmp.put("cachable",((Integer)(cas!=null?cas.what:null)).intValue());
            	      			}
            	      			else
            	      			{
            	      				tmp.put("cachable",0);
            	      			}
            	      		}
            	      		else
            	      		{
            	      			tmp.put("cachable",0);
            	      		}

            	      		global_block_array.add(tmp);			
            	      		found_cache =false;
            	      	
            	    }

            	    }
            	    break;
            	case 3 :
            	    // RuleSet2.g:201:4: css_emit
            	    {
            	    pushFollow(FOLLOW_css_emit_in_global_block900);
            	    css_emit17=css_emit();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, css_emit17.getTree());
            	    if ( state.backtracking==0 ) {

            	      		HashMap tmp = new HashMap(); 
            	      		tmp.put("content",(emt!=null?emt.emit_value:null));
            	      		tmp.put("type","css");
            	      		global_block_array.add(tmp);
            	      	
            	    }

            	    }
            	    break;
            	case 4 :
            	    // RuleSet2.g:207:4: decl[global_block_array]
            	    {
            	    pushFollow(FOLLOW_decl_in_global_block908);
            	    decl18=decl(global_block_array);

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, decl18.getTree());

            	    }
            	    break;
            	case 5 :
            	    // RuleSet2.g:208:4: ';'
            	    {
            	    char_literal19=(Token)match(input,44,FOLLOW_44_in_global_block914); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal19_tree = (Object)adaptor.create(char_literal19);
            	    adaptor.addChild(root_0, char_literal19_tree);
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            char_literal20=(Token)match(input,34,FOLLOW_34_in_global_block919); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal20_tree = (Object)adaptor.create(char_literal20);
            adaptor.addChild(root_0, char_literal20_tree);
            }

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
        }
        return retval;
    }
    // $ANTLR end "global_block"

    public static class decl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "decl"
    // RuleSet2.g:215:1: decl[ArrayList block_array] : (var= VAR '=' val= HTML | var= VAR '=' val= JS | var= VAR '=' e= expr );
    public final RuleSet2Parser.decl_return decl(ArrayList  block_array) throws RecognitionException {
        RuleSet2Parser.decl_return retval = new RuleSet2Parser.decl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token var=null;
        Token val=null;
        Token char_literal21=null;
        Token char_literal22=null;
        Token char_literal23=null;
        RuleSet2Parser.expr_return e = null;


        Object var_tree=null;
        Object val_tree=null;
        Object char_literal21_tree=null;
        Object char_literal22_tree=null;
        Object char_literal23_tree=null;



        try {
            // RuleSet2.g:218:2: (var= VAR '=' val= HTML | var= VAR '=' val= JS | var= VAR '=' e= expr )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==VAR) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==45) ) {
                    switch ( input.LA(3) ) {
                    case HTML:
                        {
                        alt5=1;
                        }
                        break;
                    case JS:
                        {
                        alt5=2;
                        }
                        break;
                    case VAR:
                    case INT:
                    case STRING:
                    case 33:
                    case 46:
                    case 47:
                    case 54:
                    case 55:
                    case 82:
                    case 83:
                    case 84:
                    case 86:
                    case 87:
                    case 88:
                    case 89:
                        {
                        alt5=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        throw nvae;
                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // RuleSet2.g:219:2: var= VAR '=' val= HTML
                    {
                    root_0 = (Object)adaptor.nil();

                    var=(Token)match(input,VAR,FOLLOW_VAR_in_decl946); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    var_tree = (Object)adaptor.create(var);
                    adaptor.addChild(root_0, var_tree);
                    }
                    char_literal21=(Token)match(input,45,FOLLOW_45_in_decl948); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal21_tree = (Object)adaptor.create(char_literal21);
                    adaptor.addChild(root_0, char_literal21_tree);
                    }
                    val=(Token)match(input,HTML,FOLLOW_HTML_in_decl952); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    val_tree = (Object)adaptor.create(val);
                    adaptor.addChild(root_0, val_tree);
                    }
                    if ( state.backtracking==0 ) {
                       
                      		HashMap tmp = new HashMap(); 
                      		tmp.put("rhs",strip_wrappers("<<",">>",(val!=null?val.getText():null)));
                      		tmp.put("type","here_doc");
                      		tmp.put("lhs",(var!=null?var.getText():null));
                      		block_array.add(tmp);
                      	 
                    }

                    }
                    break;
                case 2 :
                    // RuleSet2.g:226:4: var= VAR '=' val= JS
                    {
                    root_0 = (Object)adaptor.nil();

                    var=(Token)match(input,VAR,FOLLOW_VAR_in_decl962); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    var_tree = (Object)adaptor.create(var);
                    adaptor.addChild(root_0, var_tree);
                    }
                    char_literal22=(Token)match(input,45,FOLLOW_45_in_decl964); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal22_tree = (Object)adaptor.create(char_literal22);
                    adaptor.addChild(root_0, char_literal22_tree);
                    }
                    val=(Token)match(input,JS,FOLLOW_JS_in_decl968); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    val_tree = (Object)adaptor.create(val);
                    adaptor.addChild(root_0, val_tree);
                    }
                    if ( state.backtracking==0 ) {
                       
                      		HashMap tmp = new HashMap(); 
                      		tmp.put("rhs",strip_wrappers("<|","|>",(val!=null?val.getText():null)));
                      		tmp.put("type","JS");
                      		tmp.put("lhs",(var!=null?var.getText():null));
                      		block_array.add(tmp);
                      	
                    }

                    }
                    break;
                case 3 :
                    // RuleSet2.g:233:4: var= VAR '=' e= expr
                    {
                    root_0 = (Object)adaptor.nil();

                    var=(Token)match(input,VAR,FOLLOW_VAR_in_decl978); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    var_tree = (Object)adaptor.create(var);
                    adaptor.addChild(root_0, var_tree);
                    }
                    char_literal23=(Token)match(input,45,FOLLOW_45_in_decl980); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal23_tree = (Object)adaptor.create(char_literal23);
                    adaptor.addChild(root_0, char_literal23_tree);
                    }
                    pushFollow(FOLLOW_expr_in_decl984);
                    e=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
                    if ( state.backtracking==0 ) {
                       
                      		HashMap tmp = new HashMap(); 
                      		tmp.put("lhs",(var!=null?var.getText():null));
                      		tmp.put("type","expr");
                      		tmp.put("rhs",(e!=null?e.result:null));		
                      		block_array.add(tmp);		
                      	
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
    // $ANTLR end "decl"

    public static class expr_return extends ParserRuleReturnScope {
        public HashMap result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // RuleSet2.g:245:1: expr returns [HashMap result] : (fd= function_def[result_hash] | conditional_expression[result_hash] );
    public final RuleSet2Parser.expr_return expr() throws RecognitionException {
        RuleSet2Parser.expr_return retval = new RuleSet2Parser.expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RuleSet2Parser.function_def_return fd = null;

        RuleSet2Parser.conditional_expression_return conditional_expression24 = null;




        	HashMap result_hash = new HashMap();


        try {
            // RuleSet2.g:250:2: (fd= function_def[result_hash] | conditional_expression[result_hash] )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==46) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=VAR && LA6_0<=INT)||LA6_0==STRING||LA6_0==33||LA6_0==47||(LA6_0>=54 && LA6_0<=55)||(LA6_0>=82 && LA6_0<=84)||(LA6_0>=86 && LA6_0<=89)) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // RuleSet2.g:250:4: fd= function_def[result_hash]
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_function_def_in_expr1011);
                    fd=function_def(result_hash);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fd.getTree());
                    if ( state.backtracking==0 ) {

                      		retval.result = result_hash;
                      	
                    }

                    }
                    break;
                case 2 :
                    // RuleSet2.g:253:4: conditional_expression[result_hash]
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_conditional_expression_in_expr1019);
                    conditional_expression24=conditional_expression(result_hash);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditional_expression24.getTree());
                    if ( state.backtracking==0 ) {

                      //		result_hash.put(
                      		retval.result = result_hash;	
                      	
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
    // $ANTLR end "expr"

    public static class function_def_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function_def"
    // RuleSet2.g:259:1: function_def[HashMap expr_hash] : 'function' '(' (v1= VAR )? ( ',' v2= VAR )* ')' '{' (d1= decl[block_array] )? ( ';' d2= decl[block_array] )* ( ';' )? e1= expr '}' ;
    public final RuleSet2Parser.function_def_return function_def(HashMap  expr_hash) throws RecognitionException {
        RuleSet2Parser.function_def_return retval = new RuleSet2Parser.function_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token v1=null;
        Token v2=null;
        Token string_literal25=null;
        Token char_literal26=null;
        Token char_literal27=null;
        Token char_literal28=null;
        Token char_literal29=null;
        Token char_literal30=null;
        Token char_literal31=null;
        Token char_literal32=null;
        RuleSet2Parser.decl_return d1 = null;

        RuleSet2Parser.decl_return d2 = null;

        RuleSet2Parser.expr_return e1 = null;


        Object v1_tree=null;
        Object v2_tree=null;
        Object string_literal25_tree=null;
        Object char_literal26_tree=null;
        Object char_literal27_tree=null;
        Object char_literal28_tree=null;
        Object char_literal29_tree=null;
        Object char_literal30_tree=null;
        Object char_literal31_tree=null;
        Object char_literal32_tree=null;


        		ArrayList block_array = new ArrayList();


        try {
            // RuleSet2.g:264:2: ( 'function' '(' (v1= VAR )? ( ',' v2= VAR )* ')' '{' (d1= decl[block_array] )? ( ';' d2= decl[block_array] )* ( ';' )? e1= expr '}' )
            // RuleSet2.g:264:4: 'function' '(' (v1= VAR )? ( ',' v2= VAR )* ')' '{' (d1= decl[block_array] )? ( ';' d2= decl[block_array] )* ( ';' )? e1= expr '}'
            {
            root_0 = (Object)adaptor.nil();

            string_literal25=(Token)match(input,46,FOLLOW_46_in_function_def1041); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal25_tree = (Object)adaptor.create(string_literal25);
            adaptor.addChild(root_0, string_literal25_tree);
            }
            char_literal26=(Token)match(input,47,FOLLOW_47_in_function_def1043); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal26_tree = (Object)adaptor.create(char_literal26);
            adaptor.addChild(root_0, char_literal26_tree);
            }
            // RuleSet2.g:264:21: (v1= VAR )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==VAR) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // RuleSet2.g:264:21: v1= VAR
                    {
                    v1=(Token)match(input,VAR,FOLLOW_VAR_in_function_def1047); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    v1_tree = (Object)adaptor.create(v1);
                    adaptor.addChild(root_0, v1_tree);
                    }

                    }
                    break;

            }

            // RuleSet2.g:264:27: ( ',' v2= VAR )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==48) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // RuleSet2.g:264:28: ',' v2= VAR
            	    {
            	    char_literal27=(Token)match(input,48,FOLLOW_48_in_function_def1051); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal27_tree = (Object)adaptor.create(char_literal27);
            	    adaptor.addChild(root_0, char_literal27_tree);
            	    }
            	    v2=(Token)match(input,VAR,FOLLOW_VAR_in_function_def1055); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    v2_tree = (Object)adaptor.create(v2);
            	    adaptor.addChild(root_0, v2_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            char_literal28=(Token)match(input,49,FOLLOW_49_in_function_def1060); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal28_tree = (Object)adaptor.create(char_literal28);
            adaptor.addChild(root_0, char_literal28_tree);
            }
            char_literal29=(Token)match(input,33,FOLLOW_33_in_function_def1062); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal29_tree = (Object)adaptor.create(char_literal29);
            adaptor.addChild(root_0, char_literal29_tree);
            }
            // RuleSet2.g:264:52: (d1= decl[block_array] )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==VAR) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==45) ) {
                    alt9=1;
                }
            }
            switch (alt9) {
                case 1 :
                    // RuleSet2.g:264:52: d1= decl[block_array]
                    {
                    pushFollow(FOLLOW_decl_in_function_def1066);
                    d1=decl(block_array);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, d1.getTree());

                    }
                    break;

            }

            // RuleSet2.g:264:72: ( ';' d2= decl[block_array] )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==44) ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1==VAR) ) {
                        int LA10_3 = input.LA(3);

                        if ( (LA10_3==45) ) {
                            alt10=1;
                        }


                    }


                }


                switch (alt10) {
            	case 1 :
            	    // RuleSet2.g:264:73: ';' d2= decl[block_array]
            	    {
            	    char_literal30=(Token)match(input,44,FOLLOW_44_in_function_def1071); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal30_tree = (Object)adaptor.create(char_literal30);
            	    adaptor.addChild(root_0, char_literal30_tree);
            	    }
            	    pushFollow(FOLLOW_decl_in_function_def1075);
            	    d2=decl(block_array);

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, d2.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // RuleSet2.g:264:100: ( ';' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==44) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // RuleSet2.g:264:100: ';'
                    {
                    char_literal31=(Token)match(input,44,FOLLOW_44_in_function_def1080); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal31_tree = (Object)adaptor.create(char_literal31);
                    adaptor.addChild(root_0, char_literal31_tree);
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_expr_in_function_def1085);
            e1=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, e1.getTree());
            char_literal32=(Token)match(input,34,FOLLOW_34_in_function_def1087); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal32_tree = (Object)adaptor.create(char_literal32);
            adaptor.addChild(root_0, char_literal32_tree);
            }
            if ( state.backtracking==0 ) {

              	
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

    public static class conditional_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditional_expression"
    // RuleSet2.g:269:1: conditional_expression[HashMap expr_hash] : disjunction[expr_hash] ( '=>' expr '|' expr )? ;
    public final RuleSet2Parser.conditional_expression_return conditional_expression(HashMap expr_hash) throws RecognitionException {
        RuleSet2Parser.conditional_expression_return retval = new RuleSet2Parser.conditional_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal34=null;
        Token char_literal36=null;
        RuleSet2Parser.disjunction_return disjunction33 = null;

        RuleSet2Parser.expr_return expr35 = null;

        RuleSet2Parser.expr_return expr37 = null;


        Object string_literal34_tree=null;
        Object char_literal36_tree=null;

        try {
            // RuleSet2.g:270:2: ( disjunction[expr_hash] ( '=>' expr '|' expr )? )
            // RuleSet2.g:270:5: disjunction[expr_hash] ( '=>' expr '|' expr )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_disjunction_in_conditional_expression1106);
            disjunction33=disjunction(expr_hash);

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, disjunction33.getTree());
            // RuleSet2.g:270:28: ( '=>' expr '|' expr )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==50) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // RuleSet2.g:270:29: '=>' expr '|' expr
                    {
                    string_literal34=(Token)match(input,50,FOLLOW_50_in_conditional_expression1110); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal34_tree = (Object)adaptor.create(string_literal34);
                    adaptor.addChild(root_0, string_literal34_tree);
                    }
                    pushFollow(FOLLOW_expr_in_conditional_expression1112);
                    expr35=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr35.getTree());
                    char_literal36=(Token)match(input,51,FOLLOW_51_in_conditional_expression1114); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal36_tree = (Object)adaptor.create(char_literal36);
                    adaptor.addChild(root_0, char_literal36_tree);
                    }
                    pushFollow(FOLLOW_expr_in_conditional_expression1116);
                    expr37=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr37.getTree());

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
    // $ANTLR end "conditional_expression"

    public static class disjunction_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "disjunction"
    // RuleSet2.g:274:1: disjunction[HashMap expr_hash] : conjunction[expr_hash] ( '||' conjunction[expr_hash] )* ;
    public final RuleSet2Parser.disjunction_return disjunction(HashMap expr_hash) throws RecognitionException {
        RuleSet2Parser.disjunction_return retval = new RuleSet2Parser.disjunction_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal39=null;
        RuleSet2Parser.conjunction_return conjunction38 = null;

        RuleSet2Parser.conjunction_return conjunction40 = null;


        Object string_literal39_tree=null;

        try {
            // RuleSet2.g:275:2: ( conjunction[expr_hash] ( '||' conjunction[expr_hash] )* )
            // RuleSet2.g:275:4: conjunction[expr_hash] ( '||' conjunction[expr_hash] )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_conjunction_in_disjunction1134);
            conjunction38=conjunction(expr_hash);

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conjunction38.getTree());
            // RuleSet2.g:275:27: ( '||' conjunction[expr_hash] )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==52) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // RuleSet2.g:275:28: '||' conjunction[expr_hash]
            	    {
            	    string_literal39=(Token)match(input,52,FOLLOW_52_in_disjunction1138); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal39_tree = (Object)adaptor.create(string_literal39);
            	    adaptor.addChild(root_0, string_literal39_tree);
            	    }
            	    pushFollow(FOLLOW_conjunction_in_disjunction1140);
            	    conjunction40=conjunction(expr_hash);

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, conjunction40.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
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
    // RuleSet2.g:278:1: conjunction[HashMap expr_hash] : equality_expr[expr_hash] ( '&&' equality_expr[expr_hash] )* ;
    public final RuleSet2Parser.conjunction_return conjunction(HashMap expr_hash) throws RecognitionException {
        RuleSet2Parser.conjunction_return retval = new RuleSet2Parser.conjunction_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal42=null;
        RuleSet2Parser.equality_expr_return equality_expr41 = null;

        RuleSet2Parser.equality_expr_return equality_expr43 = null;


        Object string_literal42_tree=null;

        try {
            // RuleSet2.g:279:2: ( equality_expr[expr_hash] ( '&&' equality_expr[expr_hash] )* )
            // RuleSet2.g:279:4: equality_expr[expr_hash] ( '&&' equality_expr[expr_hash] )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equality_expr_in_conjunction1158);
            equality_expr41=equality_expr(expr_hash);

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equality_expr41.getTree());
            // RuleSet2.g:279:29: ( '&&' equality_expr[expr_hash] )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==53) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // RuleSet2.g:279:30: '&&' equality_expr[expr_hash]
            	    {
            	    string_literal42=(Token)match(input,53,FOLLOW_53_in_conjunction1162); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal42_tree = (Object)adaptor.create(string_literal42);
            	    adaptor.addChild(root_0, string_literal42_tree);
            	    }
            	    pushFollow(FOLLOW_equality_expr_in_conjunction1164);
            	    equality_expr43=equality_expr(expr_hash);

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, equality_expr43.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
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
    // RuleSet2.g:282:1: equality_expr[HashMap expr_hash] : add_expr[expr_hash] ( predop add_expr[expr_hash] )* ;
    public final RuleSet2Parser.equality_expr_return equality_expr(HashMap expr_hash) throws RecognitionException {
        RuleSet2Parser.equality_expr_return retval = new RuleSet2Parser.equality_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RuleSet2Parser.add_expr_return add_expr44 = null;

        RuleSet2Parser.predop_return predop45 = null;

        RuleSet2Parser.add_expr_return add_expr46 = null;



        try {
            // RuleSet2.g:283:2: ( add_expr[expr_hash] ( predop add_expr[expr_hash] )* )
            // RuleSet2.g:283:4: add_expr[expr_hash] ( predop add_expr[expr_hash] )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_add_expr_in_equality_expr1181);
            add_expr44=add_expr(expr_hash);

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, add_expr44.getTree());
            if ( state.backtracking==0 ) {

              	
            }
            // RuleSet2.g:285:3: ( predop add_expr[expr_hash] )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=18 && LA15_0<=26)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // RuleSet2.g:285:4: predop add_expr[expr_hash]
            	    {
            	    pushFollow(FOLLOW_predop_in_equality_expr1189);
            	    predop45=predop();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, predop45.getTree());
            	    pushFollow(FOLLOW_add_expr_in_equality_expr1191);
            	    add_expr46=add_expr(expr_hash);

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, add_expr46.getTree());
            	    if ( state.backtracking==0 ) {

            	      	 
            	    }

            	    }
            	    break;

            	default :
            	    break loop15;
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

    public static class add_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "add_expr"
    // RuleSet2.g:290:1: add_expr[HashMap expr_hash] : me1= mult_expr[expr_hash] (op= add_op me2= mult_expr[expr_hash] )* ;
    public final RuleSet2Parser.add_expr_return add_expr(HashMap expr_hash) throws RecognitionException {
        RuleSet2Parser.add_expr_return retval = new RuleSet2Parser.add_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RuleSet2Parser.mult_expr_return me1 = null;

        RuleSet2Parser.add_op_return op = null;

        RuleSet2Parser.mult_expr_return me2 = null;




        	ArrayList operators = new ArrayList();
        	int opt_cnt = 0;

        try {
            // RuleSet2.g:295:2: (me1= mult_expr[expr_hash] (op= add_op me2= mult_expr[expr_hash] )* )
            // RuleSet2.g:295:4: me1= mult_expr[expr_hash] (op= add_op me2= mult_expr[expr_hash] )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_mult_expr_in_add_expr1220);
            me1=mult_expr(expr_hash);

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, me1.getTree());
            // RuleSet2.g:295:29: (op= add_op me2= mult_expr[expr_hash] )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=27 && LA16_0<=28)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // RuleSet2.g:295:30: op= add_op me2= mult_expr[expr_hash]
            	    {
            	    pushFollow(FOLLOW_add_op_in_add_expr1226);
            	    op=add_op();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, op.getTree());
            	    pushFollow(FOLLOW_mult_expr_in_add_expr1230);
            	    me2=mult_expr(expr_hash);

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, me2.getTree());
            	    if ( state.backtracking==0 ) {

            	      		if(opt_cnt == 0)
            	      		{
            	      			// Add first one
            	      			HashMap tmp = new HashMap();
            	      			tmp.put("op",(op!=null?input.toString(op.start,op.stop):null));
            	      			tmp.put("type","prim");
            	      			tmp.put("result",(me1!=null?me1.result:null));
            	      			operators.add(tmp);

            	      			// Add Second one
            	      			 tmp = new HashMap();
            	      			tmp.put("op",(op!=null?input.toString(op.start,op.stop):null));
            	      			tmp.put("type","prim");
            	      			tmp.put("result",(me2!=null?me2.result:null));
            	      			operators.add(tmp);
            	      			opt_cnt = opt_cnt + 1;
            	      		}
            	      		else
            	      		{
            	      			// Loopers
            	      			HashMap tmp = new HashMap();
            	      			tmp.put("op",(op!=null?input.toString(op.start,op.stop):null));
            	      			tmp.put("type","prim");
            	      			tmp.put("result",(me2!=null?me2.result:null));
            	      			operators.add(tmp);
            	      			opt_cnt = opt_cnt + 1;
            	      		}
            	      		
            	      	
            	    }

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		ArrayList args_array = new ArrayList();
              		expr_hash.put("args",args_array);
              		for(int i = 0;i<operators.size();i++)
              		{
              			HashMap value = (HashMap)operators.get(i);				
              			HashMap tmp = new HashMap();
              			tmp.put("op",value.get("op"));
              			tmp.put("type",value.get("type"));
              			
              			if(i == 0)
              			{
              				expr_hash.put("op",value.get("op"));
              				expr_hash.put("type",value.get("type"));
              			}
              			
              			// Are we at the end?
              			if(i == (operators.size() - 1))
              			{
              				args_array.add(value.get("result"));
              			}
              			else
              			{
              				// Are we on the first one?
              				if(i == 0)
              				{
              					args_array.add(value.get("result"));
              				}
              				else
              				{
              					ArrayList new_args_array = new ArrayList();
              					new_args_array.add(value.get("result"));
              					tmp.put("args",new_args_array);
              					args_array.add(tmp); 
              					args_array = new_args_array;
              				}
              			}
              		}
              	
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
    // $ANTLR end "add_expr"

    public static class mult_expr_return extends ParserRuleReturnScope {
        public Object result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mult_expr"
    // RuleSet2.g:365:1: mult_expr[HashMap expr_hash] returns [Object result] : u= unary_expr[expr_hash] ( mult_op unary_expr[expr_hash] )* ;
    public final RuleSet2Parser.mult_expr_return mult_expr(HashMap expr_hash) throws RecognitionException {
        RuleSet2Parser.mult_expr_return retval = new RuleSet2Parser.mult_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RuleSet2Parser.unary_expr_return u = null;

        RuleSet2Parser.mult_op_return mult_op47 = null;

        RuleSet2Parser.unary_expr_return unary_expr48 = null;



        try {
            // RuleSet2.g:366:2: (u= unary_expr[expr_hash] ( mult_op unary_expr[expr_hash] )* )
            // RuleSet2.g:366:4: u= unary_expr[expr_hash] ( mult_op unary_expr[expr_hash] )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_unary_expr_in_mult_expr1257);
            u=unary_expr(expr_hash);

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, u.getTree());
            if ( state.backtracking==0 ) {
               retval.result = (u!=null?u.result:null); 
            }
            // RuleSet2.g:366:52: ( mult_op unary_expr[expr_hash] )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=29 && LA17_0<=31)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // RuleSet2.g:366:53: mult_op unary_expr[expr_hash]
            	    {
            	    pushFollow(FOLLOW_mult_op_in_mult_expr1262);
            	    mult_op47=mult_op();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, mult_op47.getTree());
            	    pushFollow(FOLLOW_unary_expr_in_mult_expr1264);
            	    unary_expr48=unary_expr(expr_hash);

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expr48.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
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

    public static class unary_expr_return extends ParserRuleReturnScope {
        public Object result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unary_expr"
    // RuleSet2.g:370:1: unary_expr[HashMap expr_hash] returns [Object result] options {backtrack=true; } : ( 'not' unary_expr[expr_hash] | 'seen' STRING 'in' var_domain ':' VAR timeframe | 'seen' STRING ( 'before' | 'after' ) STRING 'in' var_domain ':' VAR | var_domain ':' VAR predop expr timeframe | var_domain ':' VAR timeframe | oe= operator_expr[expr_hash] );
    public final RuleSet2Parser.unary_expr_return unary_expr(HashMap expr_hash) throws RecognitionException {
        RuleSet2Parser.unary_expr_return retval = new RuleSet2Parser.unary_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal49=null;
        Token string_literal51=null;
        Token STRING52=null;
        Token string_literal53=null;
        Token char_literal55=null;
        Token VAR56=null;
        Token string_literal58=null;
        Token STRING59=null;
        Token set60=null;
        Token STRING61=null;
        Token string_literal62=null;
        Token char_literal64=null;
        Token VAR65=null;
        Token char_literal67=null;
        Token VAR68=null;
        Token char_literal73=null;
        Token VAR74=null;
        RuleSet2Parser.operator_expr_return oe = null;

        RuleSet2Parser.unary_expr_return unary_expr50 = null;

        RuleSet2Parser.var_domain_return var_domain54 = null;

        RuleSet2Parser.timeframe_return timeframe57 = null;

        RuleSet2Parser.var_domain_return var_domain63 = null;

        RuleSet2Parser.var_domain_return var_domain66 = null;

        RuleSet2Parser.predop_return predop69 = null;

        RuleSet2Parser.expr_return expr70 = null;

        RuleSet2Parser.timeframe_return timeframe71 = null;

        RuleSet2Parser.var_domain_return var_domain72 = null;

        RuleSet2Parser.timeframe_return timeframe75 = null;


        Object string_literal49_tree=null;
        Object string_literal51_tree=null;
        Object STRING52_tree=null;
        Object string_literal53_tree=null;
        Object char_literal55_tree=null;
        Object VAR56_tree=null;
        Object string_literal58_tree=null;
        Object STRING59_tree=null;
        Object set60_tree=null;
        Object STRING61_tree=null;
        Object string_literal62_tree=null;
        Object char_literal64_tree=null;
        Object VAR65_tree=null;
        Object char_literal67_tree=null;
        Object VAR68_tree=null;
        Object char_literal73_tree=null;
        Object VAR74_tree=null;

        try {
            // RuleSet2.g:371:2: ( 'not' unary_expr[expr_hash] | 'seen' STRING 'in' var_domain ':' VAR timeframe | 'seen' STRING ( 'before' | 'after' ) STRING 'in' var_domain ':' VAR | var_domain ':' VAR predop expr timeframe | var_domain ':' VAR timeframe | oe= operator_expr[expr_hash] )
            int alt18=6;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // RuleSet2.g:371:4: 'not' unary_expr[expr_hash]
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal49=(Token)match(input,54,FOLLOW_54_in_unary_expr1295); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal49_tree = (Object)adaptor.create(string_literal49);
                    adaptor.addChild(root_0, string_literal49_tree);
                    }
                    pushFollow(FOLLOW_unary_expr_in_unary_expr1297);
                    unary_expr50=unary_expr(expr_hash);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expr50.getTree());

                    }
                    break;
                case 2 :
                    // RuleSet2.g:372:2: 'seen' STRING 'in' var_domain ':' VAR timeframe
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal51=(Token)match(input,55,FOLLOW_55_in_unary_expr1304); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal51_tree = (Object)adaptor.create(string_literal51);
                    adaptor.addChild(root_0, string_literal51_tree);
                    }
                    STRING52=(Token)match(input,STRING,FOLLOW_STRING_in_unary_expr1306); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING52_tree = (Object)adaptor.create(STRING52);
                    adaptor.addChild(root_0, STRING52_tree);
                    }
                    string_literal53=(Token)match(input,56,FOLLOW_56_in_unary_expr1308); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal53_tree = (Object)adaptor.create(string_literal53);
                    adaptor.addChild(root_0, string_literal53_tree);
                    }
                    pushFollow(FOLLOW_var_domain_in_unary_expr1310);
                    var_domain54=var_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, var_domain54.getTree());
                    char_literal55=(Token)match(input,38,FOLLOW_38_in_unary_expr1312); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal55_tree = (Object)adaptor.create(char_literal55);
                    adaptor.addChild(root_0, char_literal55_tree);
                    }
                    VAR56=(Token)match(input,VAR,FOLLOW_VAR_in_unary_expr1314); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VAR56_tree = (Object)adaptor.create(VAR56);
                    adaptor.addChild(root_0, VAR56_tree);
                    }
                    pushFollow(FOLLOW_timeframe_in_unary_expr1316);
                    timeframe57=timeframe();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeframe57.getTree());

                    }
                    break;
                case 3 :
                    // RuleSet2.g:373:2: 'seen' STRING ( 'before' | 'after' ) STRING 'in' var_domain ':' VAR
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal58=(Token)match(input,55,FOLLOW_55_in_unary_expr1321); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal58_tree = (Object)adaptor.create(string_literal58);
                    adaptor.addChild(root_0, string_literal58_tree);
                    }
                    STRING59=(Token)match(input,STRING,FOLLOW_STRING_in_unary_expr1323); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING59_tree = (Object)adaptor.create(STRING59);
                    adaptor.addChild(root_0, STRING59_tree);
                    }
                    set60=(Token)input.LT(1);
                    if ( (input.LA(1)>=57 && input.LA(1)<=58) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set60));
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    STRING61=(Token)match(input,STRING,FOLLOW_STRING_in_unary_expr1333); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING61_tree = (Object)adaptor.create(STRING61);
                    adaptor.addChild(root_0, STRING61_tree);
                    }
                    string_literal62=(Token)match(input,56,FOLLOW_56_in_unary_expr1335); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal62_tree = (Object)adaptor.create(string_literal62);
                    adaptor.addChild(root_0, string_literal62_tree);
                    }
                    pushFollow(FOLLOW_var_domain_in_unary_expr1337);
                    var_domain63=var_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, var_domain63.getTree());
                    char_literal64=(Token)match(input,38,FOLLOW_38_in_unary_expr1339); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal64_tree = (Object)adaptor.create(char_literal64);
                    adaptor.addChild(root_0, char_literal64_tree);
                    }
                    VAR65=(Token)match(input,VAR,FOLLOW_VAR_in_unary_expr1341); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VAR65_tree = (Object)adaptor.create(VAR65);
                    adaptor.addChild(root_0, VAR65_tree);
                    }

                    }
                    break;
                case 4 :
                    // RuleSet2.g:374:2: var_domain ':' VAR predop expr timeframe
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_var_domain_in_unary_expr1346);
                    var_domain66=var_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, var_domain66.getTree());
                    char_literal67=(Token)match(input,38,FOLLOW_38_in_unary_expr1348); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal67_tree = (Object)adaptor.create(char_literal67);
                    adaptor.addChild(root_0, char_literal67_tree);
                    }
                    VAR68=(Token)match(input,VAR,FOLLOW_VAR_in_unary_expr1350); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VAR68_tree = (Object)adaptor.create(VAR68);
                    adaptor.addChild(root_0, VAR68_tree);
                    }
                    pushFollow(FOLLOW_predop_in_unary_expr1352);
                    predop69=predop();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, predop69.getTree());
                    pushFollow(FOLLOW_expr_in_unary_expr1354);
                    expr70=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr70.getTree());
                    pushFollow(FOLLOW_timeframe_in_unary_expr1356);
                    timeframe71=timeframe();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeframe71.getTree());

                    }
                    break;
                case 5 :
                    // RuleSet2.g:375:2: var_domain ':' VAR timeframe
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_var_domain_in_unary_expr1361);
                    var_domain72=var_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, var_domain72.getTree());
                    char_literal73=(Token)match(input,38,FOLLOW_38_in_unary_expr1363); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal73_tree = (Object)adaptor.create(char_literal73);
                    adaptor.addChild(root_0, char_literal73_tree);
                    }
                    VAR74=(Token)match(input,VAR,FOLLOW_VAR_in_unary_expr1365); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VAR74_tree = (Object)adaptor.create(VAR74);
                    adaptor.addChild(root_0, VAR74_tree);
                    }
                    pushFollow(FOLLOW_timeframe_in_unary_expr1367);
                    timeframe75=timeframe();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeframe75.getTree());

                    }
                    break;
                case 6 :
                    // RuleSet2.g:376:2: oe= operator_expr[expr_hash]
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_operator_expr_in_unary_expr1374);
                    oe=operator_expr(expr_hash);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, oe.getTree());
                    if ( state.backtracking==0 ) {
                       retval.result = (oe!=null?oe.result:null); 
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
    // $ANTLR end "unary_expr"

    public static class operator_expr_return extends ParserRuleReturnScope {
        public Object result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operator_expr"
    // RuleSet2.g:380:1: operator_expr[HashMap expr_hash] returns [Object result] : f= factor[expr_hash] ( operator )* ;
    public final RuleSet2Parser.operator_expr_return operator_expr(HashMap expr_hash) throws RecognitionException {
        RuleSet2Parser.operator_expr_return retval = new RuleSet2Parser.operator_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RuleSet2Parser.factor_return f = null;

        RuleSet2Parser.operator_return operator76 = null;



        try {
            // RuleSet2.g:381:2: (f= factor[expr_hash] ( operator )* )
            // RuleSet2.g:381:4: f= factor[expr_hash] ( operator )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_factor_in_operator_expr1396);
            f=factor(expr_hash);

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( state.backtracking==0 ) {
              retval.result = (f!=null?f.result:null);  
            }
            // RuleSet2.g:382:3: ( operator )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==59) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // RuleSet2.g:382:3: operator
            	    {
            	    pushFollow(FOLLOW_operator_in_operator_expr1403);
            	    operator76=operator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, operator76.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
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

    public static class operator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operator"
    // RuleSet2.g:385:1: operator : '.' operator_op '(' expr ( ',' )? ')' ;
    public final RuleSet2Parser.operator_return operator() throws RecognitionException {
        RuleSet2Parser.operator_return retval = new RuleSet2Parser.operator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal77=null;
        Token char_literal79=null;
        Token char_literal81=null;
        Token char_literal82=null;
        RuleSet2Parser.operator_op_return operator_op78 = null;

        RuleSet2Parser.expr_return expr80 = null;


        Object char_literal77_tree=null;
        Object char_literal79_tree=null;
        Object char_literal81_tree=null;
        Object char_literal82_tree=null;

        try {
            // RuleSet2.g:386:2: ( '.' operator_op '(' expr ( ',' )? ')' )
            // RuleSet2.g:386:4: '.' operator_op '(' expr ( ',' )? ')'
            {
            root_0 = (Object)adaptor.nil();

            char_literal77=(Token)match(input,59,FOLLOW_59_in_operator1417); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal77_tree = (Object)adaptor.create(char_literal77);
            adaptor.addChild(root_0, char_literal77_tree);
            }
            pushFollow(FOLLOW_operator_op_in_operator1419);
            operator_op78=operator_op();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, operator_op78.getTree());
            char_literal79=(Token)match(input,47,FOLLOW_47_in_operator1421); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal79_tree = (Object)adaptor.create(char_literal79);
            adaptor.addChild(root_0, char_literal79_tree);
            }
            pushFollow(FOLLOW_expr_in_operator1423);
            expr80=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr80.getTree());
            // RuleSet2.g:386:29: ( ',' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==48) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // RuleSet2.g:386:29: ','
                    {
                    char_literal81=(Token)match(input,48,FOLLOW_48_in_operator1425); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal81_tree = (Object)adaptor.create(char_literal81);
                    adaptor.addChild(root_0, char_literal81_tree);
                    }

                    }
                    break;

            }

            char_literal82=(Token)match(input,49,FOLLOW_49_in_operator1428); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal82_tree = (Object)adaptor.create(char_literal82);
            adaptor.addChild(root_0, char_literal82_tree);
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
    // RuleSet2.g:389:10: fragment operator_op : ( 'pick' | 'match' | 'length' | 'replace' | 'as' | 'head' | 'tail' | 'sort' | 'filter' | 'map' | 'uc' | 'lc' | 'split' | 'join' | 'query' | 'has' | 'union' | 'difference' | 'intersection' | 'unique' | 'once' | 'duplicates' );
    public final RuleSet2Parser.operator_op_return operator_op() throws RecognitionException {
        RuleSet2Parser.operator_op_return retval = new RuleSet2Parser.operator_op_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set83=null;

        Object set83_tree=null;

        try {
            // RuleSet2.g:390:2: ( 'pick' | 'match' | 'length' | 'replace' | 'as' | 'head' | 'tail' | 'sort' | 'filter' | 'map' | 'uc' | 'lc' | 'split' | 'join' | 'query' | 'has' | 'union' | 'difference' | 'intersection' | 'unique' | 'once' | 'duplicates' )
            // RuleSet2.g:
            {
            root_0 = (Object)adaptor.nil();

            set83=(Token)input.LT(1);
            if ( (input.LA(1)>=60 && input.LA(1)<=81) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set83));
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

    public static class factor_return extends ParserRuleReturnScope {
        public Object result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "factor"
    // RuleSet2.g:396:1: factor[HashMap expr_hash] returns [Object result] options {backtrack=true; } : (v= INT | v= STRING | v= 'true' | v= 'false' | VAR '[' expr ']' | var_domain ':' VAR | trail_exp | function_app | '[' expr ',' ']' | '{' ( hash_line ( ',' )? )* '}' | v= VAR | '(' expr ')' );
    public final RuleSet2Parser.factor_return factor(HashMap expr_hash) throws RecognitionException {
        RuleSet2Parser.factor_return retval = new RuleSet2Parser.factor_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token v=null;
        Token VAR84=null;
        Token char_literal85=null;
        Token char_literal87=null;
        Token char_literal89=null;
        Token VAR90=null;
        Token char_literal93=null;
        Token char_literal95=null;
        Token char_literal96=null;
        Token char_literal97=null;
        Token char_literal99=null;
        Token char_literal100=null;
        Token char_literal101=null;
        Token char_literal103=null;
        RuleSet2Parser.expr_return expr86 = null;

        RuleSet2Parser.var_domain_return var_domain88 = null;

        RuleSet2Parser.trail_exp_return trail_exp91 = null;

        RuleSet2Parser.function_app_return function_app92 = null;

        RuleSet2Parser.expr_return expr94 = null;

        RuleSet2Parser.hash_line_return hash_line98 = null;

        RuleSet2Parser.expr_return expr102 = null;


        Object v_tree=null;
        Object VAR84_tree=null;
        Object char_literal85_tree=null;
        Object char_literal87_tree=null;
        Object char_literal89_tree=null;
        Object VAR90_tree=null;
        Object char_literal93_tree=null;
        Object char_literal95_tree=null;
        Object char_literal96_tree=null;
        Object char_literal97_tree=null;
        Object char_literal99_tree=null;
        Object char_literal100_tree=null;
        Object char_literal101_tree=null;
        Object char_literal103_tree=null;

        try {
            // RuleSet2.g:397:2: (v= INT | v= STRING | v= 'true' | v= 'false' | VAR '[' expr ']' | var_domain ':' VAR | trail_exp | function_app | '[' expr ',' ']' | '{' ( hash_line ( ',' )? )* '}' | v= VAR | '(' expr ')' )
            int alt23=12;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // RuleSet2.g:397:4: v= INT
                    {
                    root_0 = (Object)adaptor.nil();

                    v=(Token)match(input,INT,FOLLOW_INT_in_factor1559); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    v_tree = (Object)adaptor.create(v);
                    adaptor.addChild(root_0, v_tree);
                    }
                    if ( state.backtracking==0 ) {
                       
                      		HashMap tmp = new HashMap();
                      		tmp.put("type","num");
                      		tmp.put("val",Integer.parseInt((v!=null?v.getText():null)));
                      		retval.result = tmp;
                      	
                    }

                    }
                    break;
                case 2 :
                    // RuleSet2.g:403:9: v= STRING
                    {
                    root_0 = (Object)adaptor.nil();

                    v=(Token)match(input,STRING,FOLLOW_STRING_in_factor1573); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    v_tree = (Object)adaptor.create(v);
                    adaptor.addChild(root_0, v_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.result =(v!=null?v.getText():null); 
                    }

                    }
                    break;
                case 3 :
                    // RuleSet2.g:404:9: v= 'true'
                    {
                    root_0 = (Object)adaptor.nil();

                    v=(Token)match(input,82,FOLLOW_82_in_factor1592); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    v_tree = (Object)adaptor.create(v);
                    adaptor.addChild(root_0, v_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.result =(v!=null?v.getText():null); 
                    }

                    }
                    break;
                case 4 :
                    // RuleSet2.g:405:9: v= 'false'
                    {
                    root_0 = (Object)adaptor.nil();

                    v=(Token)match(input,83,FOLLOW_83_in_factor1607); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    v_tree = (Object)adaptor.create(v);
                    adaptor.addChild(root_0, v_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.result =(v!=null?v.getText():null); 
                    }

                    }
                    break;
                case 5 :
                    // RuleSet2.g:406:9: VAR '[' expr ']'
                    {
                    root_0 = (Object)adaptor.nil();

                    VAR84=(Token)match(input,VAR,FOLLOW_VAR_in_factor1620); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VAR84_tree = (Object)adaptor.create(VAR84);
                    adaptor.addChild(root_0, VAR84_tree);
                    }
                    char_literal85=(Token)match(input,84,FOLLOW_84_in_factor1622); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal85_tree = (Object)adaptor.create(char_literal85);
                    adaptor.addChild(root_0, char_literal85_tree);
                    }
                    pushFollow(FOLLOW_expr_in_factor1624);
                    expr86=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr86.getTree());
                    char_literal87=(Token)match(input,85,FOLLOW_85_in_factor1626); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal87_tree = (Object)adaptor.create(char_literal87);
                    adaptor.addChild(root_0, char_literal87_tree);
                    }

                    }
                    break;
                case 6 :
                    // RuleSet2.g:407:9: var_domain ':' VAR
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_var_domain_in_factor1636);
                    var_domain88=var_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, var_domain88.getTree());
                    char_literal89=(Token)match(input,38,FOLLOW_38_in_factor1638); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal89_tree = (Object)adaptor.create(char_literal89);
                    adaptor.addChild(root_0, char_literal89_tree);
                    }
                    VAR90=(Token)match(input,VAR,FOLLOW_VAR_in_factor1640); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VAR90_tree = (Object)adaptor.create(VAR90);
                    adaptor.addChild(root_0, VAR90_tree);
                    }

                    }
                    break;
                case 7 :
                    // RuleSet2.g:408:9: trail_exp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_trail_exp_in_factor1650);
                    trail_exp91=trail_exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, trail_exp91.getTree());

                    }
                    break;
                case 8 :
                    // RuleSet2.g:409:9: function_app
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_function_app_in_factor1660);
                    function_app92=function_app();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_app92.getTree());

                    }
                    break;
                case 9 :
                    // RuleSet2.g:410:9: '[' expr ',' ']'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal93=(Token)match(input,84,FOLLOW_84_in_factor1670); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal93_tree = (Object)adaptor.create(char_literal93);
                    adaptor.addChild(root_0, char_literal93_tree);
                    }
                    pushFollow(FOLLOW_expr_in_factor1672);
                    expr94=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr94.getTree());
                    char_literal95=(Token)match(input,48,FOLLOW_48_in_factor1674); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal95_tree = (Object)adaptor.create(char_literal95);
                    adaptor.addChild(root_0, char_literal95_tree);
                    }
                    char_literal96=(Token)match(input,85,FOLLOW_85_in_factor1676); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal96_tree = (Object)adaptor.create(char_literal96);
                    adaptor.addChild(root_0, char_literal96_tree);
                    }

                    }
                    break;
                case 10 :
                    // RuleSet2.g:411:9: '{' ( hash_line ( ',' )? )* '}'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal97=(Token)match(input,33,FOLLOW_33_in_factor1686); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal97_tree = (Object)adaptor.create(char_literal97);
                    adaptor.addChild(root_0, char_literal97_tree);
                    }
                    // RuleSet2.g:411:13: ( hash_line ( ',' )? )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==STRING) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // RuleSet2.g:411:14: hash_line ( ',' )?
                    	    {
                    	    pushFollow(FOLLOW_hash_line_in_factor1689);
                    	    hash_line98=hash_line();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, hash_line98.getTree());
                    	    // RuleSet2.g:411:24: ( ',' )?
                    	    int alt21=2;
                    	    int LA21_0 = input.LA(1);

                    	    if ( (LA21_0==48) ) {
                    	        alt21=1;
                    	    }
                    	    switch (alt21) {
                    	        case 1 :
                    	            // RuleSet2.g:411:24: ','
                    	            {
                    	            char_literal99=(Token)match(input,48,FOLLOW_48_in_factor1691); if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) {
                    	            char_literal99_tree = (Object)adaptor.create(char_literal99);
                    	            adaptor.addChild(root_0, char_literal99_tree);
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    char_literal100=(Token)match(input,34,FOLLOW_34_in_factor1696); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal100_tree = (Object)adaptor.create(char_literal100);
                    adaptor.addChild(root_0, char_literal100_tree);
                    }

                    }
                    break;
                case 11 :
                    // RuleSet2.g:412:9: v= VAR
                    {
                    root_0 = (Object)adaptor.nil();

                    v=(Token)match(input,VAR,FOLLOW_VAR_in_factor1708); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    v_tree = (Object)adaptor.create(v);
                    adaptor.addChild(root_0, v_tree);
                    }
                    if ( state.backtracking==0 ) {
                       
                            		HashMap tmp = new HashMap();
                      		tmp.put("type","var");
                      		tmp.put("val",(v!=null?v.getText():null));
                      		retval.result = tmp;

                    }

                    }
                    break;
                case 12 :
                    // RuleSet2.g:418:9: '(' expr ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal101=(Token)match(input,47,FOLLOW_47_in_factor1721); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal101_tree = (Object)adaptor.create(char_literal101);
                    adaptor.addChild(root_0, char_literal101_tree);
                    }
                    pushFollow(FOLLOW_expr_in_factor1723);
                    expr102=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr102.getTree());
                    char_literal103=(Token)match(input,49,FOLLOW_49_in_factor1725); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal103_tree = (Object)adaptor.create(char_literal103);
                    adaptor.addChild(root_0, char_literal103_tree);
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

    public static class var_domain_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "var_domain"
    // RuleSet2.g:420:10: fragment var_domain : ( 'ent' | 'app' );
    public final RuleSet2Parser.var_domain_return var_domain() throws RecognitionException {
        RuleSet2Parser.var_domain_return retval = new RuleSet2Parser.var_domain_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set104=null;

        Object set104_tree=null;

        try {
            // RuleSet2.g:420:20: ( 'ent' | 'app' )
            // RuleSet2.g:
            {
            root_0 = (Object)adaptor.nil();

            set104=(Token)input.LT(1);
            if ( (input.LA(1)>=86 && input.LA(1)<=87) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set104));
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

    public static class function_app_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function_app"
    // RuleSet2.g:424:1: function_app : ( namespace VAR '(' ( expr ( ',' )? )* ')' | VAR '(' ( expr ( ',' )? )* ')' );
    public final RuleSet2Parser.function_app_return function_app() throws RecognitionException {
        RuleSet2Parser.function_app_return retval = new RuleSet2Parser.function_app_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VAR106=null;
        Token char_literal107=null;
        Token char_literal109=null;
        Token char_literal110=null;
        Token VAR111=null;
        Token char_literal112=null;
        Token char_literal114=null;
        Token char_literal115=null;
        RuleSet2Parser.namespace_return namespace105 = null;

        RuleSet2Parser.expr_return expr108 = null;

        RuleSet2Parser.expr_return expr113 = null;


        Object VAR106_tree=null;
        Object char_literal107_tree=null;
        Object char_literal109_tree=null;
        Object char_literal110_tree=null;
        Object VAR111_tree=null;
        Object char_literal112_tree=null;
        Object char_literal114_tree=null;
        Object char_literal115_tree=null;

        try {
            // RuleSet2.g:425:2: ( namespace VAR '(' ( expr ( ',' )? )* ')' | VAR '(' ( expr ( ',' )? )* ')' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==VAR) ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==38) ) {
                    alt28=1;
                }
                else if ( (LA28_1==47) ) {
                    alt28=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // RuleSet2.g:425:3: namespace VAR '(' ( expr ( ',' )? )* ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_namespace_in_function_app1753);
                    namespace105=namespace();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, namespace105.getTree());
                    VAR106=(Token)match(input,VAR,FOLLOW_VAR_in_function_app1755); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VAR106_tree = (Object)adaptor.create(VAR106);
                    adaptor.addChild(root_0, VAR106_tree);
                    }
                    char_literal107=(Token)match(input,47,FOLLOW_47_in_function_app1757); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal107_tree = (Object)adaptor.create(char_literal107);
                    adaptor.addChild(root_0, char_literal107_tree);
                    }
                    // RuleSet2.g:425:21: ( expr ( ',' )? )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( ((LA25_0>=VAR && LA25_0<=INT)||LA25_0==STRING||LA25_0==33||(LA25_0>=46 && LA25_0<=47)||(LA25_0>=54 && LA25_0<=55)||(LA25_0>=82 && LA25_0<=84)||(LA25_0>=86 && LA25_0<=89)) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // RuleSet2.g:425:22: expr ( ',' )?
                    	    {
                    	    pushFollow(FOLLOW_expr_in_function_app1760);
                    	    expr108=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr108.getTree());
                    	    // RuleSet2.g:425:27: ( ',' )?
                    	    int alt24=2;
                    	    int LA24_0 = input.LA(1);

                    	    if ( (LA24_0==48) ) {
                    	        alt24=1;
                    	    }
                    	    switch (alt24) {
                    	        case 1 :
                    	            // RuleSet2.g:425:27: ','
                    	            {
                    	            char_literal109=(Token)match(input,48,FOLLOW_48_in_function_app1762); if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) {
                    	            char_literal109_tree = (Object)adaptor.create(char_literal109);
                    	            adaptor.addChild(root_0, char_literal109_tree);
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    char_literal110=(Token)match(input,49,FOLLOW_49_in_function_app1767); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal110_tree = (Object)adaptor.create(char_literal110);
                    adaptor.addChild(root_0, char_literal110_tree);
                    }

                    }
                    break;
                case 2 :
                    // RuleSet2.g:426:4: VAR '(' ( expr ( ',' )? )* ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    VAR111=(Token)match(input,VAR,FOLLOW_VAR_in_function_app1773); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VAR111_tree = (Object)adaptor.create(VAR111);
                    adaptor.addChild(root_0, VAR111_tree);
                    }
                    char_literal112=(Token)match(input,47,FOLLOW_47_in_function_app1775); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal112_tree = (Object)adaptor.create(char_literal112);
                    adaptor.addChild(root_0, char_literal112_tree);
                    }
                    // RuleSet2.g:426:12: ( expr ( ',' )? )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( ((LA27_0>=VAR && LA27_0<=INT)||LA27_0==STRING||LA27_0==33||(LA27_0>=46 && LA27_0<=47)||(LA27_0>=54 && LA27_0<=55)||(LA27_0>=82 && LA27_0<=84)||(LA27_0>=86 && LA27_0<=89)) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // RuleSet2.g:426:13: expr ( ',' )?
                    	    {
                    	    pushFollow(FOLLOW_expr_in_function_app1778);
                    	    expr113=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr113.getTree());
                    	    // RuleSet2.g:426:18: ( ',' )?
                    	    int alt26=2;
                    	    int LA26_0 = input.LA(1);

                    	    if ( (LA26_0==48) ) {
                    	        alt26=1;
                    	    }
                    	    switch (alt26) {
                    	        case 1 :
                    	            // RuleSet2.g:426:18: ','
                    	            {
                    	            char_literal114=(Token)match(input,48,FOLLOW_48_in_function_app1780); if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) {
                    	            char_literal114_tree = (Object)adaptor.create(char_literal114);
                    	            adaptor.addChild(root_0, char_literal114_tree);
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    char_literal115=(Token)match(input,49,FOLLOW_49_in_function_app1785); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal115_tree = (Object)adaptor.create(char_literal115);
                    adaptor.addChild(root_0, char_literal115_tree);
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
    // RuleSet2.g:429:10: fragment namespace : VAR ':' ;
    public final RuleSet2Parser.namespace_return namespace() throws RecognitionException {
        RuleSet2Parser.namespace_return retval = new RuleSet2Parser.namespace_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VAR116=null;
        Token char_literal117=null;

        Object VAR116_tree=null;
        Object char_literal117_tree=null;

        try {
            // RuleSet2.g:430:2: ( VAR ':' )
            // RuleSet2.g:430:4: VAR ':'
            {
            root_0 = (Object)adaptor.nil();

            VAR116=(Token)match(input,VAR,FOLLOW_VAR_in_namespace1799); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            VAR116_tree = (Object)adaptor.create(VAR116);
            adaptor.addChild(root_0, VAR116_tree);
            }
            char_literal117=(Token)match(input,38,FOLLOW_38_in_namespace1801); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal117_tree = (Object)adaptor.create(char_literal117);
            adaptor.addChild(root_0, char_literal117_tree);
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
    // RuleSet2.g:433:1: trail_exp : ( 'current' var_domain ':' VAR | 'history' expr var_domain ':' VAR );
    public final RuleSet2Parser.trail_exp_return trail_exp() throws RecognitionException {
        RuleSet2Parser.trail_exp_return retval = new RuleSet2Parser.trail_exp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal118=null;
        Token char_literal120=null;
        Token VAR121=null;
        Token string_literal122=null;
        Token char_literal125=null;
        Token VAR126=null;
        RuleSet2Parser.var_domain_return var_domain119 = null;

        RuleSet2Parser.expr_return expr123 = null;

        RuleSet2Parser.var_domain_return var_domain124 = null;


        Object string_literal118_tree=null;
        Object char_literal120_tree=null;
        Object VAR121_tree=null;
        Object string_literal122_tree=null;
        Object char_literal125_tree=null;
        Object VAR126_tree=null;

        try {
            // RuleSet2.g:434:2: ( 'current' var_domain ':' VAR | 'history' expr var_domain ':' VAR )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==88) ) {
                alt29=1;
            }
            else if ( (LA29_0==89) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // RuleSet2.g:434:3: 'current' var_domain ':' VAR
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal118=(Token)match(input,88,FOLLOW_88_in_trail_exp1814); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal118_tree = (Object)adaptor.create(string_literal118);
                    adaptor.addChild(root_0, string_literal118_tree);
                    }
                    pushFollow(FOLLOW_var_domain_in_trail_exp1816);
                    var_domain119=var_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, var_domain119.getTree());
                    char_literal120=(Token)match(input,38,FOLLOW_38_in_trail_exp1818); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal120_tree = (Object)adaptor.create(char_literal120);
                    adaptor.addChild(root_0, char_literal120_tree);
                    }
                    VAR121=(Token)match(input,VAR,FOLLOW_VAR_in_trail_exp1820); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VAR121_tree = (Object)adaptor.create(VAR121);
                    adaptor.addChild(root_0, VAR121_tree);
                    }

                    }
                    break;
                case 2 :
                    // RuleSet2.g:435:4: 'history' expr var_domain ':' VAR
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal122=(Token)match(input,89,FOLLOW_89_in_trail_exp1826); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal122_tree = (Object)adaptor.create(string_literal122);
                    adaptor.addChild(root_0, string_literal122_tree);
                    }
                    pushFollow(FOLLOW_expr_in_trail_exp1828);
                    expr123=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr123.getTree());
                    pushFollow(FOLLOW_var_domain_in_trail_exp1830);
                    var_domain124=var_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, var_domain124.getTree());
                    char_literal125=(Token)match(input,38,FOLLOW_38_in_trail_exp1832); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal125_tree = (Object)adaptor.create(char_literal125);
                    adaptor.addChild(root_0, char_literal125_tree);
                    }
                    VAR126=(Token)match(input,VAR,FOLLOW_VAR_in_trail_exp1834); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VAR126_tree = (Object)adaptor.create(VAR126);
                    adaptor.addChild(root_0, VAR126_tree);
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

    public static class timeframe_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "timeframe"
    // RuleSet2.g:438:1: timeframe : 'within' expr ( period ) ;
    public final RuleSet2Parser.timeframe_return timeframe() throws RecognitionException {
        RuleSet2Parser.timeframe_return retval = new RuleSet2Parser.timeframe_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal127=null;
        RuleSet2Parser.expr_return expr128 = null;

        RuleSet2Parser.period_return period129 = null;


        Object string_literal127_tree=null;

        try {
            // RuleSet2.g:439:2: ( 'within' expr ( period ) )
            // RuleSet2.g:439:5: 'within' expr ( period )
            {
            root_0 = (Object)adaptor.nil();

            string_literal127=(Token)match(input,90,FOLLOW_90_in_timeframe1847); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal127_tree = (Object)adaptor.create(string_literal127);
            adaptor.addChild(root_0, string_literal127_tree);
            }
            pushFollow(FOLLOW_expr_in_timeframe1849);
            expr128=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr128.getTree());
            // RuleSet2.g:439:19: ( period )
            // RuleSet2.g:439:21: period
            {
            pushFollow(FOLLOW_period_in_timeframe1853);
            period129=period();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, period129.getTree());

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

    public static class hash_line_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "hash_line"
    // RuleSet2.g:442:1: hash_line : STRING ':' expr ;
    public final RuleSet2Parser.hash_line_return hash_line() throws RecognitionException {
        RuleSet2Parser.hash_line_return retval = new RuleSet2Parser.hash_line_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STRING130=null;
        Token char_literal131=null;
        RuleSet2Parser.expr_return expr132 = null;


        Object STRING130_tree=null;
        Object char_literal131_tree=null;

        try {
            // RuleSet2.g:443:2: ( STRING ':' expr )
            // RuleSet2.g:443:4: STRING ':' expr
            {
            root_0 = (Object)adaptor.nil();

            STRING130=(Token)match(input,STRING,FOLLOW_STRING_in_hash_line1869); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING130_tree = (Object)adaptor.create(STRING130);
            adaptor.addChild(root_0, STRING130_tree);
            }
            char_literal131=(Token)match(input,38,FOLLOW_38_in_hash_line1871); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal131_tree = (Object)adaptor.create(char_literal131);
            adaptor.addChild(root_0, char_literal131_tree);
            }
            pushFollow(FOLLOW_expr_in_hash_line1873);
            expr132=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr132.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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

    public static class css_emit_return extends ParserRuleReturnScope {
        public String emit_value;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "css_emit"
    // RuleSet2.g:446:1: css_emit returns [String emit_value] : 'css' (h= HTML | h= STRING ) ;
    public final RuleSet2Parser.css_emit_return css_emit() throws RecognitionException {
        RuleSet2Parser.css_emit_return retval = new RuleSet2Parser.css_emit_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token h=null;
        Token string_literal133=null;

        Object h_tree=null;
        Object string_literal133_tree=null;

        try {
            // RuleSet2.g:447:2: ( 'css' (h= HTML | h= STRING ) )
            // RuleSet2.g:447:4: 'css' (h= HTML | h= STRING )
            {
            root_0 = (Object)adaptor.nil();

            string_literal133=(Token)match(input,91,FOLLOW_91_in_css_emit1888); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal133_tree = (Object)adaptor.create(string_literal133);
            adaptor.addChild(root_0, string_literal133_tree);
            }
            // RuleSet2.g:447:10: (h= HTML | h= STRING )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==HTML) ) {
                alt30=1;
            }
            else if ( (LA30_0==STRING) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // RuleSet2.g:447:12: h= HTML
                    {
                    h=(Token)match(input,HTML,FOLLOW_HTML_in_css_emit1894); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    h_tree = (Object)adaptor.create(h);
                    adaptor.addChild(root_0, h_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.emit_value = strip_wrappers("<<",">>",(h!=null?h.getText():null));
                    }

                    }
                    break;
                case 2 :
                    // RuleSet2.g:448:3: h= STRING
                    {
                    h=(Token)match(input,STRING,FOLLOW_STRING_in_css_emit1902); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    h_tree = (Object)adaptor.create(h);
                    adaptor.addChild(root_0, h_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.emit_value = strip_string((h!=null?h.getText():null));
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
    // $ANTLR end "css_emit"

    public static class period_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "period"
    // RuleSet2.g:452:10: fragment period : ( 'years' | 'months' | 'weeks' | 'days' | 'hours' | 'minutes' | 'seconds' | 'year' | 'month' | 'week' | 'day' | 'hour' | 'minute' | 'second' );
    public final RuleSet2Parser.period_return period() throws RecognitionException {
        RuleSet2Parser.period_return retval = new RuleSet2Parser.period_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set134=null;

        Object set134_tree=null;

        try {
            // RuleSet2.g:453:2: ( 'years' | 'months' | 'weeks' | 'days' | 'hours' | 'minutes' | 'seconds' | 'year' | 'month' | 'week' | 'day' | 'hour' | 'minute' | 'second' )
            // RuleSet2.g:
            {
            root_0 = (Object)adaptor.nil();

            set134=(Token)input.LT(1);
            if ( (input.LA(1)>=92 && input.LA(1)<=105) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set134));
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

    public static class cachable_return extends ParserRuleReturnScope {
        public Object what;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cachable"
    // RuleSet2.g:471:1: cachable returns [Object what] : ca= 'cachable' ( 'for' tm= INT per= ( period ) )? ;
    public final RuleSet2Parser.cachable_return cachable() throws RecognitionException {
        RuleSet2Parser.cachable_return retval = new RuleSet2Parser.cachable_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ca=null;
        Token tm=null;
        Token per=null;
        Token string_literal135=null;
        RuleSet2Parser.period_return period136 = null;


        Object ca_tree=null;
        Object tm_tree=null;
        Object per_tree=null;
        Object string_literal135_tree=null;


        	retval.what = null;

        try {
            // RuleSet2.g:475:2: (ca= 'cachable' ( 'for' tm= INT per= ( period ) )? )
            // RuleSet2.g:476:3: ca= 'cachable' ( 'for' tm= INT per= ( period ) )?
            {
            root_0 = (Object)adaptor.nil();

            ca=(Token)match(input,106,FOLLOW_106_in_cachable2042); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ca_tree = (Object)adaptor.create(ca);
            adaptor.addChild(root_0, ca_tree);
            }
            // RuleSet2.g:476:17: ( 'for' tm= INT per= ( period ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==107) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // RuleSet2.g:476:18: 'for' tm= INT per= ( period )
                    {
                    string_literal135=(Token)match(input,107,FOLLOW_107_in_cachable2045); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal135_tree = (Object)adaptor.create(string_literal135);
                    adaptor.addChild(root_0, string_literal135_tree);
                    }
                    tm=(Token)match(input,INT,FOLLOW_INT_in_cachable2049); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    tm_tree = (Object)adaptor.create(tm);
                    adaptor.addChild(root_0, tm_tree);
                    }
                    // RuleSet2.g:476:35: ( period )
                    // RuleSet2.g:476:36: period
                    {
                    pushFollow(FOLLOW_period_in_cachable2054);
                    period136=period();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, period136.getTree());

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

               			if((tm!=null?tm.getText():null) != null)
               			{
              	 			retval.what = new HashMap();
              	 			((HashMap)retval.what).put("value",(tm!=null?tm.getText():null));
              	 			((HashMap)retval.what).put("period",(per!=null?per.getText():null));	 			
              	 		}
              	 		else if((ca!=null?ca.getText():null) != null)
              	 		{
              	 			retval.what = new Integer(1);
              	 		}
              	 		else
              	 		{
              	 			retval.what = new Integer(0);
              	 		}
               		
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
    // $ANTLR end "cachable"

    public static class emit_block_return extends ParserRuleReturnScope {
        public String emit_value;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "emit_block"
    // RuleSet2.g:496:1: emit_block returns [String emit_value] : 'emit' (h= HTML | h= STRING | h= JS ) ;
    public final RuleSet2Parser.emit_block_return emit_block() throws RecognitionException {
        RuleSet2Parser.emit_block_return retval = new RuleSet2Parser.emit_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token h=null;
        Token string_literal137=null;

        Object h_tree=null;
        Object string_literal137_tree=null;

        try {
            // RuleSet2.g:497:2: ( 'emit' (h= HTML | h= STRING | h= JS ) )
            // RuleSet2.g:497:4: 'emit' (h= HTML | h= STRING | h= JS )
            {
            root_0 = (Object)adaptor.nil();

            string_literal137=(Token)match(input,108,FOLLOW_108_in_emit_block2079); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal137_tree = (Object)adaptor.create(string_literal137);
            adaptor.addChild(root_0, string_literal137_tree);
            }
            // RuleSet2.g:497:11: (h= HTML | h= STRING | h= JS )
            int alt32=3;
            switch ( input.LA(1) ) {
            case HTML:
                {
                alt32=1;
                }
                break;
            case STRING:
                {
                alt32=2;
                }
                break;
            case JS:
                {
                alt32=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // RuleSet2.g:497:13: h= HTML
                    {
                    h=(Token)match(input,HTML,FOLLOW_HTML_in_emit_block2085); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    h_tree = (Object)adaptor.create(h);
                    adaptor.addChild(root_0, h_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.emit_value = strip_wrappers("<<",">>",(h!=null?h.getText():null));
                    }

                    }
                    break;
                case 2 :
                    // RuleSet2.g:498:3: h= STRING
                    {
                    h=(Token)match(input,STRING,FOLLOW_STRING_in_emit_block2093); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    h_tree = (Object)adaptor.create(h);
                    adaptor.addChild(root_0, h_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.emit_value = strip_string((h!=null?h.getText():null));
                    }

                    }
                    break;
                case 3 :
                    // RuleSet2.g:499:3: h= JS
                    {
                    h=(Token)match(input,JS,FOLLOW_JS_in_emit_block2101); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    h_tree = (Object)adaptor.create(h);
                    adaptor.addChild(root_0, h_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.emit_value = strip_wrappers("<|","|>",(h!=null?h.getText():null));
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
    // $ANTLR end "emit_block"

    public static class meta_block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "meta_block"
    // RuleSet2.g:503:1: meta_block : 'meta' '{' ( 'description' desc= ( HTML | STRING ) | 'name' thename= STRING | 'author' author= STRING | 'key' what= ( 'errorstack' | 'googleanalytics' | 'twitter' | 'amazon' | 'kpds' | 'google' | VAR ) (key_value= STRING | '{' ( name_value_pair[key_values] ( ',' name_value_pair[key_values] )* ) '}' )+ | 'authz' 'require' 'user' | 'logging' ( 'on' | 'off' ) | 'use' 'module' name= VAR ( 'alias' alias= VAR )? | 'use' rtype= ( 'css' | 'javascript' ) 'resource' (url= STRING | name= VAR ) )* '}' ;
    public final RuleSet2Parser.meta_block_return meta_block() throws RecognitionException {
        RuleSet2Parser.meta_block_return retval = new RuleSet2Parser.meta_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token desc=null;
        Token thename=null;
        Token author=null;
        Token what=null;
        Token key_value=null;
        Token name=null;
        Token alias=null;
        Token rtype=null;
        Token url=null;
        Token string_literal138=null;
        Token char_literal139=null;
        Token string_literal140=null;
        Token string_literal141=null;
        Token string_literal142=null;
        Token string_literal143=null;
        Token char_literal144=null;
        Token char_literal146=null;
        Token char_literal148=null;
        Token string_literal149=null;
        Token string_literal150=null;
        Token string_literal151=null;
        Token string_literal152=null;
        Token set153=null;
        Token string_literal154=null;
        Token string_literal155=null;
        Token string_literal156=null;
        Token string_literal157=null;
        Token string_literal158=null;
        Token char_literal159=null;
        RuleSet2Parser.name_value_pair_return name_value_pair145 = null;

        RuleSet2Parser.name_value_pair_return name_value_pair147 = null;


        Object desc_tree=null;
        Object thename_tree=null;
        Object author_tree=null;
        Object what_tree=null;
        Object key_value_tree=null;
        Object name_tree=null;
        Object alias_tree=null;
        Object rtype_tree=null;
        Object url_tree=null;
        Object string_literal138_tree=null;
        Object char_literal139_tree=null;
        Object string_literal140_tree=null;
        Object string_literal141_tree=null;
        Object string_literal142_tree=null;
        Object string_literal143_tree=null;
        Object char_literal144_tree=null;
        Object char_literal146_tree=null;
        Object char_literal148_tree=null;
        Object string_literal149_tree=null;
        Object string_literal150_tree=null;
        Object string_literal151_tree=null;
        Object string_literal152_tree=null;
        Object set153_tree=null;
        Object string_literal154_tree=null;
        Object string_literal155_tree=null;
        Object string_literal156_tree=null;
        Object string_literal157_tree=null;
        Object string_literal158_tree=null;
        Object char_literal159_tree=null;


        	 HashMap meta_block_hash = (HashMap)rule_json.get("meta");
        	 ArrayList use_list = new ArrayList();
        	 HashMap keys_map = new HashMap();
        	 HashMap key_values = new HashMap();

        try {
            // RuleSet2.g:520:2: ( 'meta' '{' ( 'description' desc= ( HTML | STRING ) | 'name' thename= STRING | 'author' author= STRING | 'key' what= ( 'errorstack' | 'googleanalytics' | 'twitter' | 'amazon' | 'kpds' | 'google' | VAR ) (key_value= STRING | '{' ( name_value_pair[key_values] ( ',' name_value_pair[key_values] )* ) '}' )+ | 'authz' 'require' 'user' | 'logging' ( 'on' | 'off' ) | 'use' 'module' name= VAR ( 'alias' alias= VAR )? | 'use' rtype= ( 'css' | 'javascript' ) 'resource' (url= STRING | name= VAR ) )* '}' )
            // RuleSet2.g:520:4: 'meta' '{' ( 'description' desc= ( HTML | STRING ) | 'name' thename= STRING | 'author' author= STRING | 'key' what= ( 'errorstack' | 'googleanalytics' | 'twitter' | 'amazon' | 'kpds' | 'google' | VAR ) (key_value= STRING | '{' ( name_value_pair[key_values] ( ',' name_value_pair[key_values] )* ) '}' )+ | 'authz' 'require' 'user' | 'logging' ( 'on' | 'off' ) | 'use' 'module' name= VAR ( 'alias' alias= VAR )? | 'use' rtype= ( 'css' | 'javascript' ) 'resource' (url= STRING | name= VAR ) )* '}'
            {
            root_0 = (Object)adaptor.nil();

            string_literal138=(Token)match(input,109,FOLLOW_109_in_meta_block2133); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal138_tree = (Object)adaptor.create(string_literal138);
            adaptor.addChild(root_0, string_literal138_tree);
            }
            char_literal139=(Token)match(input,33,FOLLOW_33_in_meta_block2135); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal139_tree = (Object)adaptor.create(char_literal139);
            adaptor.addChild(root_0, char_literal139_tree);
            }
            // RuleSet2.g:521:2: ( 'description' desc= ( HTML | STRING ) | 'name' thename= STRING | 'author' author= STRING | 'key' what= ( 'errorstack' | 'googleanalytics' | 'twitter' | 'amazon' | 'kpds' | 'google' | VAR ) (key_value= STRING | '{' ( name_value_pair[key_values] ( ',' name_value_pair[key_values] )* ) '}' )+ | 'authz' 'require' 'user' | 'logging' ( 'on' | 'off' ) | 'use' 'module' name= VAR ( 'alias' alias= VAR )? | 'use' rtype= ( 'css' | 'javascript' ) 'resource' (url= STRING | name= VAR ) )*
            loop37:
            do {
                int alt37=9;
                alt37 = dfa37.predict(input);
                switch (alt37) {
            	case 1 :
            	    // RuleSet2.g:521:4: 'description' desc= ( HTML | STRING )
            	    {
            	    string_literal140=(Token)match(input,110,FOLLOW_110_in_meta_block2141); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal140_tree = (Object)adaptor.create(string_literal140);
            	    adaptor.addChild(root_0, string_literal140_tree);
            	    }
            	    desc=(Token)input.LT(1);
            	    if ( (input.LA(1)>=STRING && input.LA(1)<=HTML) ) {
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
            	       meta_block_hash.put("description",strip_wrappers("<<",">>",(desc!=null?desc.getText():null))); 
            	    }

            	    }
            	    break;
            	case 2 :
            	    // RuleSet2.g:522:5: 'name' thename= STRING
            	    {
            	    string_literal141=(Token)match(input,111,FOLLOW_111_in_meta_block2159); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal141_tree = (Object)adaptor.create(string_literal141);
            	    adaptor.addChild(root_0, string_literal141_tree);
            	    }
            	    thename=(Token)match(input,STRING,FOLLOW_STRING_in_meta_block2163); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    thename_tree = (Object)adaptor.create(thename);
            	    adaptor.addChild(root_0, thename_tree);
            	    }
            	    if ( state.backtracking==0 ) {
            	       meta_block_hash.put("name",strip_string((thename!=null?thename.getText():null))); 
            	    }

            	    }
            	    break;
            	case 3 :
            	    // RuleSet2.g:523:5: 'author' author= STRING
            	    {
            	    string_literal142=(Token)match(input,112,FOLLOW_112_in_meta_block2173); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal142_tree = (Object)adaptor.create(string_literal142);
            	    adaptor.addChild(root_0, string_literal142_tree);
            	    }
            	    author=(Token)match(input,STRING,FOLLOW_STRING_in_meta_block2177); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    author_tree = (Object)adaptor.create(author);
            	    adaptor.addChild(root_0, author_tree);
            	    }
            	    if ( state.backtracking==0 ) {
            	       meta_block_hash.put("author",strip_string((author!=null?author.getText():null))); 
            	    }

            	    }
            	    break;
            	case 4 :
            	    // RuleSet2.g:524:5: 'key' what= ( 'errorstack' | 'googleanalytics' | 'twitter' | 'amazon' | 'kpds' | 'google' | VAR ) (key_value= STRING | '{' ( name_value_pair[key_values] ( ',' name_value_pair[key_values] )* ) '}' )+
            	    {
            	    string_literal143=(Token)match(input,113,FOLLOW_113_in_meta_block2189); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal143_tree = (Object)adaptor.create(string_literal143);
            	    adaptor.addChild(root_0, string_literal143_tree);
            	    }
            	    what=(Token)input.LT(1);
            	    if ( input.LA(1)==VAR||(input.LA(1)>=114 && input.LA(1)<=119) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(what));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    // RuleSet2.g:524:91: (key_value= STRING | '{' ( name_value_pair[key_values] ( ',' name_value_pair[key_values] )* ) '}' )+
            	    int cnt34=0;
            	    loop34:
            	    do {
            	        int alt34=3;
            	        int LA34_0 = input.LA(1);

            	        if ( (LA34_0==STRING) ) {
            	            alt34=1;
            	        }
            	        else if ( (LA34_0==33) ) {
            	            alt34=2;
            	        }


            	        switch (alt34) {
            	    	case 1 :
            	    	    // RuleSet2.g:524:92: key_value= STRING
            	    	    {
            	    	    key_value=(Token)match(input,STRING,FOLLOW_STRING_in_meta_block2215); if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) {
            	    	    key_value_tree = (Object)adaptor.create(key_value);
            	    	    adaptor.addChild(root_0, key_value_tree);
            	    	    }

            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // RuleSet2.g:524:111: '{' ( name_value_pair[key_values] ( ',' name_value_pair[key_values] )* ) '}'
            	    	    {
            	    	    char_literal144=(Token)match(input,33,FOLLOW_33_in_meta_block2219); if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) {
            	    	    char_literal144_tree = (Object)adaptor.create(char_literal144);
            	    	    adaptor.addChild(root_0, char_literal144_tree);
            	    	    }
            	    	    // RuleSet2.g:524:115: ( name_value_pair[key_values] ( ',' name_value_pair[key_values] )* )
            	    	    // RuleSet2.g:524:116: name_value_pair[key_values] ( ',' name_value_pair[key_values] )*
            	    	    {
            	    	    pushFollow(FOLLOW_name_value_pair_in_meta_block2222);
            	    	    name_value_pair145=name_value_pair(key_values);

            	    	    state._fsp--;
            	    	    if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, name_value_pair145.getTree());
            	    	    // RuleSet2.g:524:144: ( ',' name_value_pair[key_values] )*
            	    	    loop33:
            	    	    do {
            	    	        int alt33=2;
            	    	        int LA33_0 = input.LA(1);

            	    	        if ( (LA33_0==48) ) {
            	    	            alt33=1;
            	    	        }


            	    	        switch (alt33) {
            	    	    	case 1 :
            	    	    	    // RuleSet2.g:524:145: ',' name_value_pair[key_values]
            	    	    	    {
            	    	    	    char_literal146=(Token)match(input,48,FOLLOW_48_in_meta_block2226); if (state.failed) return retval;
            	    	    	    if ( state.backtracking==0 ) {
            	    	    	    char_literal146_tree = (Object)adaptor.create(char_literal146);
            	    	    	    adaptor.addChild(root_0, char_literal146_tree);
            	    	    	    }
            	    	    	    pushFollow(FOLLOW_name_value_pair_in_meta_block2228);
            	    	    	    name_value_pair147=name_value_pair(key_values);

            	    	    	    state._fsp--;
            	    	    	    if (state.failed) return retval;
            	    	    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, name_value_pair147.getTree());

            	    	    	    }
            	    	    	    break;

            	    	    	default :
            	    	    	    break loop33;
            	    	        }
            	    	    } while (true);


            	    	    }

            	    	    char_literal148=(Token)match(input,34,FOLLOW_34_in_meta_block2234); if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) {
            	    	    char_literal148_tree = (Object)adaptor.create(char_literal148);
            	    	    adaptor.addChild(root_0, char_literal148_tree);
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt34 >= 1 ) break loop34;
            	    	    if (state.backtracking>0) {state.failed=true; return retval;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(34, input);
            	                throw eee;
            	        }
            	        cnt34++;
            	    } while (true);

            	    if ( state.backtracking==0 ) {
            	       
            	      		if(!key_values.isEmpty()) 
            	      			keys_map.put((what!=null?what.getText():null),key_values); 
            	      		else 
            	      			keys_map.put((what!=null?what.getText():null),strip_string((key_value!=null?key_value.getText():null))); 
            	      	
            	    }

            	    }
            	    break;
            	case 5 :
            	    // RuleSet2.g:530:4: 'authz' 'require' 'user'
            	    {
            	    string_literal149=(Token)match(input,120,FOLLOW_120_in_meta_block2246); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal149_tree = (Object)adaptor.create(string_literal149);
            	    adaptor.addChild(root_0, string_literal149_tree);
            	    }
            	    string_literal150=(Token)match(input,121,FOLLOW_121_in_meta_block2248); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal150_tree = (Object)adaptor.create(string_literal150);
            	    adaptor.addChild(root_0, string_literal150_tree);
            	    }
            	    string_literal151=(Token)match(input,122,FOLLOW_122_in_meta_block2250); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal151_tree = (Object)adaptor.create(string_literal151);
            	    adaptor.addChild(root_0, string_literal151_tree);
            	    }
            	    if ( state.backtracking==0 ) {
            	        
            	      		HashMap tmp = new HashMap(); 
            	      		tmp.put("level","user");
            	      		tmp.put("type","required");
            	      		meta_block_hash.put("authz",tmp);
            	      	   
            	    }

            	    }
            	    break;
            	case 6 :
            	    // RuleSet2.g:536:4: 'logging' ( 'on' | 'off' )
            	    {
            	    string_literal152=(Token)match(input,123,FOLLOW_123_in_meta_block2257); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal152_tree = (Object)adaptor.create(string_literal152);
            	    adaptor.addChild(root_0, string_literal152_tree);
            	    }
            	    set153=(Token)input.LT(1);
            	    if ( (input.LA(1)>=124 && input.LA(1)<=125) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set153));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    if ( state.backtracking==0 ) {
            	        meta_block_hash.put("logging","on"); 
            	    }

            	    }
            	    break;
            	case 7 :
            	    // RuleSet2.g:537:4: 'use' 'module' name= VAR ( 'alias' alias= VAR )?
            	    {
            	    string_literal154=(Token)match(input,126,FOLLOW_126_in_meta_block2270); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal154_tree = (Object)adaptor.create(string_literal154);
            	    adaptor.addChild(root_0, string_literal154_tree);
            	    }
            	    string_literal155=(Token)match(input,127,FOLLOW_127_in_meta_block2272); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal155_tree = (Object)adaptor.create(string_literal155);
            	    adaptor.addChild(root_0, string_literal155_tree);
            	    }
            	    name=(Token)match(input,VAR,FOLLOW_VAR_in_meta_block2276); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    name_tree = (Object)adaptor.create(name);
            	    adaptor.addChild(root_0, name_tree);
            	    }
            	    // RuleSet2.g:537:28: ( 'alias' alias= VAR )?
            	    int alt35=2;
            	    int LA35_0 = input.LA(1);

            	    if ( (LA35_0==128) ) {
            	        alt35=1;
            	    }
            	    switch (alt35) {
            	        case 1 :
            	            // RuleSet2.g:537:29: 'alias' alias= VAR
            	            {
            	            string_literal156=(Token)match(input,128,FOLLOW_128_in_meta_block2279); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal156_tree = (Object)adaptor.create(string_literal156);
            	            adaptor.addChild(root_0, string_literal156_tree);
            	            }
            	            alias=(Token)match(input,VAR,FOLLOW_VAR_in_meta_block2283); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            alias_tree = (Object)adaptor.create(alias);
            	            adaptor.addChild(root_0, alias_tree);
            	            }

            	            }
            	            break;

            	    }

            	    if ( state.backtracking==0 ) {

            	      		HashMap tmp = new HashMap(); 
            	      		tmp.put("name",(name!=null?name.getText():null));
            	      		tmp.put("type","module");
            	      		if((alias!=null?alias.getText():null) != null) {
            	      			tmp.put("alias",(alias!=null?alias.getText():null));
            	      		}
            	      		use_list.add(tmp);
            	      	 
            	    }

            	    }
            	    break;
            	case 8 :
            	    // RuleSet2.g:546:4: 'use' rtype= ( 'css' | 'javascript' ) 'resource' (url= STRING | name= VAR )
            	    {
            	    string_literal157=(Token)match(input,126,FOLLOW_126_in_meta_block2292); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal157_tree = (Object)adaptor.create(string_literal157);
            	    adaptor.addChild(root_0, string_literal157_tree);
            	    }
            	    rtype=(Token)input.LT(1);
            	    if ( input.LA(1)==91||input.LA(1)==129 ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(rtype));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    string_literal158=(Token)match(input,130,FOLLOW_130_in_meta_block2304); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal158_tree = (Object)adaptor.create(string_literal158);
            	    adaptor.addChild(root_0, string_literal158_tree);
            	    }
            	    // RuleSet2.g:546:50: (url= STRING | name= VAR )
            	    int alt36=2;
            	    int LA36_0 = input.LA(1);

            	    if ( (LA36_0==STRING) ) {
            	        alt36=1;
            	    }
            	    else if ( (LA36_0==VAR) ) {
            	        alt36=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 36, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt36) {
            	        case 1 :
            	            // RuleSet2.g:546:51: url= STRING
            	            {
            	            url=(Token)match(input,STRING,FOLLOW_STRING_in_meta_block2309); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            url_tree = (Object)adaptor.create(url);
            	            adaptor.addChild(root_0, url_tree);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // RuleSet2.g:546:64: name= VAR
            	            {
            	            name=(Token)match(input,VAR,FOLLOW_VAR_in_meta_block2315); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            name_tree = (Object)adaptor.create(name);
            	            adaptor.addChild(root_0, name_tree);
            	            }

            	            }
            	            break;

            	    }

            	    if ( state.backtracking==0 ) {

            	      		HashMap tmp = new HashMap(); 
            	      		HashMap tmp2 = new HashMap();
            	      		if((url!=null?url.getText():null) != null)
            	      		{
            	      			tmp2.put("location",strip_string((url!=null?url.getText():null)));
            	      			tmp2.put("type","url");
            	      		}
            	      		else
            	      		{
            	      			tmp2.put("location",(name!=null?name.getText():null));
            	      			tmp2.put("type","name");			
            	      		}
            	      		tmp.put("resource",tmp2);
            	      		
            	      		tmp.put("name",(name!=null?name.getText():null));
            	      		tmp.put("resource_type",(rtype!=null?rtype.getText():null));
            	      		use_list.add(tmp);
            	      	 
            	    }

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            char_literal159=(Token)match(input,34,FOLLOW_34_in_meta_block2328); if (state.failed) return retval;
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
            if ( state.backtracking==0 ) {

              	if(!keys_map.isEmpty())
              	{
              		meta_block_hash.put("keys",keys_map);
              	}
              	if(!use_list.isEmpty())
              	{
              		meta_block_hash.put("use",use_list);
              	}

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

    public static class dispatch_block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dispatch_block"
    // RuleSet2.g:571:1: dispatch_block : 'dispatch' '{' ( 'domain' domain= STRING ( '->' rsid= STRING )? )* '}' ;
    public final RuleSet2Parser.dispatch_block_return dispatch_block() throws RecognitionException {
        RuleSet2Parser.dispatch_block_return retval = new RuleSet2Parser.dispatch_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token domain=null;
        Token rsid=null;
        Token string_literal160=null;
        Token char_literal161=null;
        Token string_literal162=null;
        Token string_literal163=null;
        Token char_literal164=null;

        Object domain_tree=null;
        Object rsid_tree=null;
        Object string_literal160_tree=null;
        Object char_literal161_tree=null;
        Object string_literal162_tree=null;
        Object string_literal163_tree=null;
        Object char_literal164_tree=null;


        	 ArrayList dispatch_block_array = (ArrayList)rule_json.get("dispatch");

        try {
            // RuleSet2.g:577:2: ( 'dispatch' '{' ( 'domain' domain= STRING ( '->' rsid= STRING )? )* '}' )
            // RuleSet2.g:577:4: 'dispatch' '{' ( 'domain' domain= STRING ( '->' rsid= STRING )? )* '}'
            {
            root_0 = (Object)adaptor.nil();

            string_literal160=(Token)match(input,131,FOLLOW_131_in_dispatch_block2359); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal160_tree = (Object)adaptor.create(string_literal160);
            adaptor.addChild(root_0, string_literal160_tree);
            }
            char_literal161=(Token)match(input,33,FOLLOW_33_in_dispatch_block2361); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal161_tree = (Object)adaptor.create(char_literal161);
            adaptor.addChild(root_0, char_literal161_tree);
            }
            // RuleSet2.g:577:19: ( 'domain' domain= STRING ( '->' rsid= STRING )? )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==132) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // RuleSet2.g:577:20: 'domain' domain= STRING ( '->' rsid= STRING )?
            	    {
            	    string_literal162=(Token)match(input,132,FOLLOW_132_in_dispatch_block2364); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal162_tree = (Object)adaptor.create(string_literal162);
            	    adaptor.addChild(root_0, string_literal162_tree);
            	    }
            	    domain=(Token)match(input,STRING,FOLLOW_STRING_in_dispatch_block2368); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    domain_tree = (Object)adaptor.create(domain);
            	    adaptor.addChild(root_0, domain_tree);
            	    }
            	    // RuleSet2.g:577:43: ( '->' rsid= STRING )?
            	    int alt38=2;
            	    int LA38_0 = input.LA(1);

            	    if ( (LA38_0==133) ) {
            	        alt38=1;
            	    }
            	    switch (alt38) {
            	        case 1 :
            	            // RuleSet2.g:577:44: '->' rsid= STRING
            	            {
            	            string_literal163=(Token)match(input,133,FOLLOW_133_in_dispatch_block2371); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal163_tree = (Object)adaptor.create(string_literal163);
            	            adaptor.addChild(root_0, string_literal163_tree);
            	            }
            	            rsid=(Token)match(input,STRING,FOLLOW_STRING_in_dispatch_block2375); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            rsid_tree = (Object)adaptor.create(rsid);
            	            adaptor.addChild(root_0, rsid_tree);
            	            }

            	            }
            	            break;

            	    }

            	    if ( state.backtracking==0 ) {

            	      		HashMap tmp = new HashMap();
            	      		tmp.put("domain",strip_string((domain!=null?domain.getText():null)));
            	      		if((rsid!=null?rsid.getText():null) != null)
            	      		{
            	      			tmp.put("ruleset_id",strip_string((rsid!=null?rsid.getText():null)));
            	      		}
            	      		dispatch_block_array.add(tmp);
            	      		
            	    }

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            char_literal164=(Token)match(input,34,FOLLOW_34_in_dispatch_block2385); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal164_tree = (Object)adaptor.create(char_literal164);
            adaptor.addChild(root_0, char_literal164_tree);
            }

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
        }
        return retval;
    }
    // $ANTLR end "dispatch_block"

    public static class name_value_pair_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "name_value_pair"
    // RuleSet2.g:591:1: name_value_pair[HashMap key_values] : k= STRING ':' (v= INT | v= FLOAT | v= STRING ) ;
    public final RuleSet2Parser.name_value_pair_return name_value_pair(HashMap key_values) throws RecognitionException {
        RuleSet2Parser.name_value_pair_return retval = new RuleSet2Parser.name_value_pair_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token k=null;
        Token v=null;
        Token char_literal165=null;

        Object k_tree=null;
        Object v_tree=null;
        Object char_literal165_tree=null;


        	Object value = null;

        try {
            // RuleSet2.g:595:2: (k= STRING ':' (v= INT | v= FLOAT | v= STRING ) )
            // RuleSet2.g:595:4: k= STRING ':' (v= INT | v= FLOAT | v= STRING )
            {
            root_0 = (Object)adaptor.nil();

            k=(Token)match(input,STRING,FOLLOW_STRING_in_name_value_pair2408); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            k_tree = (Object)adaptor.create(k);
            adaptor.addChild(root_0, k_tree);
            }
            char_literal165=(Token)match(input,38,FOLLOW_38_in_name_value_pair2410); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal165_tree = (Object)adaptor.create(char_literal165);
            adaptor.addChild(root_0, char_literal165_tree);
            }
            // RuleSet2.g:595:17: (v= INT | v= FLOAT | v= STRING )
            int alt40=3;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt40=1;
                }
                break;
            case FLOAT:
                {
                alt40=2;
                }
                break;
            case STRING:
                {
                alt40=3;
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
                    // RuleSet2.g:596:3: v= INT
                    {
                    v=(Token)match(input,INT,FOLLOW_INT_in_name_value_pair2418); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    v_tree = (Object)adaptor.create(v);
                    adaptor.addChild(root_0, v_tree);
                    }
                    if ( state.backtracking==0 ) {
                      value =(v!=null?v.getText():null);
                    }

                    }
                    break;
                case 2 :
                    // RuleSet2.g:597:5: v= FLOAT
                    {
                    v=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_name_value_pair2429); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    v_tree = (Object)adaptor.create(v);
                    adaptor.addChild(root_0, v_tree);
                    }
                    if ( state.backtracking==0 ) {
                      value = (v!=null?v.getText():null);
                    }

                    }
                    break;
                case 3 :
                    // RuleSet2.g:598:5: v= STRING
                    {
                    v=(Token)match(input,STRING,FOLLOW_STRING_in_name_value_pair2440); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    v_tree = (Object)adaptor.create(v);
                    adaptor.addChild(root_0, v_tree);
                    }
                    if ( state.backtracking==0 ) {
                      value = strip_string((v!=null?v.getText():null));
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

    // $ANTLR start synpred2_RuleSet2
    public final void synpred2_RuleSet2_fragment() throws RecognitionException {   
        // RuleSet2.g:372:2: ( 'seen' STRING 'in' var_domain ':' VAR timeframe )
        // RuleSet2.g:372:2: 'seen' STRING 'in' var_domain ':' VAR timeframe
        {
        match(input,55,FOLLOW_55_in_synpred2_RuleSet21304); if (state.failed) return ;
        match(input,STRING,FOLLOW_STRING_in_synpred2_RuleSet21306); if (state.failed) return ;
        match(input,56,FOLLOW_56_in_synpred2_RuleSet21308); if (state.failed) return ;
        pushFollow(FOLLOW_var_domain_in_synpred2_RuleSet21310);
        var_domain();

        state._fsp--;
        if (state.failed) return ;
        match(input,38,FOLLOW_38_in_synpred2_RuleSet21312); if (state.failed) return ;
        match(input,VAR,FOLLOW_VAR_in_synpred2_RuleSet21314); if (state.failed) return ;
        pushFollow(FOLLOW_timeframe_in_synpred2_RuleSet21316);
        timeframe();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_RuleSet2

    // $ANTLR start synpred3_RuleSet2
    public final void synpred3_RuleSet2_fragment() throws RecognitionException {   
        // RuleSet2.g:373:2: ( 'seen' STRING ( 'before' | 'after' ) STRING 'in' var_domain ':' VAR )
        // RuleSet2.g:373:2: 'seen' STRING ( 'before' | 'after' ) STRING 'in' var_domain ':' VAR
        {
        match(input,55,FOLLOW_55_in_synpred3_RuleSet21321); if (state.failed) return ;
        match(input,STRING,FOLLOW_STRING_in_synpred3_RuleSet21323); if (state.failed) return ;
        if ( (input.LA(1)>=57 && input.LA(1)<=58) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }

        match(input,STRING,FOLLOW_STRING_in_synpred3_RuleSet21333); if (state.failed) return ;
        match(input,56,FOLLOW_56_in_synpred3_RuleSet21335); if (state.failed) return ;
        pushFollow(FOLLOW_var_domain_in_synpred3_RuleSet21337);
        var_domain();

        state._fsp--;
        if (state.failed) return ;
        match(input,38,FOLLOW_38_in_synpred3_RuleSet21339); if (state.failed) return ;
        match(input,VAR,FOLLOW_VAR_in_synpred3_RuleSet21341); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_RuleSet2

    // $ANTLR start synpred4_RuleSet2
    public final void synpred4_RuleSet2_fragment() throws RecognitionException {   
        // RuleSet2.g:374:2: ( var_domain ':' VAR predop expr timeframe )
        // RuleSet2.g:374:2: var_domain ':' VAR predop expr timeframe
        {
        pushFollow(FOLLOW_var_domain_in_synpred4_RuleSet21346);
        var_domain();

        state._fsp--;
        if (state.failed) return ;
        match(input,38,FOLLOW_38_in_synpred4_RuleSet21348); if (state.failed) return ;
        match(input,VAR,FOLLOW_VAR_in_synpred4_RuleSet21350); if (state.failed) return ;
        pushFollow(FOLLOW_predop_in_synpred4_RuleSet21352);
        predop();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred4_RuleSet21354);
        expr();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_timeframe_in_synpred4_RuleSet21356);
        timeframe();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_RuleSet2

    // $ANTLR start synpred5_RuleSet2
    public final void synpred5_RuleSet2_fragment() throws RecognitionException {   
        // RuleSet2.g:375:2: ( var_domain ':' VAR timeframe )
        // RuleSet2.g:375:2: var_domain ':' VAR timeframe
        {
        pushFollow(FOLLOW_var_domain_in_synpred5_RuleSet21361);
        var_domain();

        state._fsp--;
        if (state.failed) return ;
        match(input,38,FOLLOW_38_in_synpred5_RuleSet21363); if (state.failed) return ;
        match(input,VAR,FOLLOW_VAR_in_synpred5_RuleSet21365); if (state.failed) return ;
        pushFollow(FOLLOW_timeframe_in_synpred5_RuleSet21367);
        timeframe();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_RuleSet2

    // $ANTLR start synpred10_RuleSet2
    public final void synpred10_RuleSet2_fragment() throws RecognitionException {   
        // RuleSet2.g:406:9: ( VAR '[' expr ']' )
        // RuleSet2.g:406:9: VAR '[' expr ']'
        {
        match(input,VAR,FOLLOW_VAR_in_synpred10_RuleSet21620); if (state.failed) return ;
        match(input,84,FOLLOW_84_in_synpred10_RuleSet21622); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred10_RuleSet21624);
        expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,85,FOLLOW_85_in_synpred10_RuleSet21626); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_RuleSet2

    // $ANTLR start synpred13_RuleSet2
    public final void synpred13_RuleSet2_fragment() throws RecognitionException {   
        // RuleSet2.g:409:9: ( function_app )
        // RuleSet2.g:409:9: function_app
        {
        pushFollow(FOLLOW_function_app_in_synpred13_RuleSet21660);
        function_app();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_RuleSet2

    // $ANTLR start synpred16_RuleSet2
    public final void synpred16_RuleSet2_fragment() throws RecognitionException {   
        Token v=null;

        // RuleSet2.g:412:9: (v= VAR )
        // RuleSet2.g:412:9: v= VAR
        {
        v=(Token)match(input,VAR,FOLLOW_VAR_in_synpred16_RuleSet21708); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_RuleSet2

    // Delegated rules

    public final boolean synpred4_RuleSet2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_RuleSet2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_RuleSet2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_RuleSet2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_RuleSet2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_RuleSet2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_RuleSet2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_RuleSet2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_RuleSet2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_RuleSet2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_RuleSet2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_RuleSet2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_RuleSet2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_RuleSet2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA18 dfa18 = new DFA18(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA37 dfa37 = new DFA37(this);
    static final String DFA18_eotS =
        "\22\uffff";
    static final String DFA18_eofS =
        "\22\uffff";
    static final String DFA18_minS =
        "\1\4\1\uffff\2\0\16\uffff";
    static final String DFA18_maxS =
        "\1\131\1\uffff\2\0\16\uffff";
    static final String DFA18_acceptS =
        "\1\uffff\1\1\2\uffff\1\6\11\uffff\1\2\1\3\1\4\1\5";
    static final String DFA18_specialS =
        "\2\uffff\1\0\1\1\16\uffff}>";
    static final String[] DFA18_transitionS = {
            "\2\4\6\uffff\1\4\24\uffff\1\4\15\uffff\1\4\6\uffff\1\1\1\2\32"+
            "\uffff\3\4\1\uffff\2\3\2\4",
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
            return "370:1: unary_expr[HashMap expr_hash] returns [Object result] options {backtrack=true; } : ( 'not' unary_expr[expr_hash] | 'seen' STRING 'in' var_domain ':' VAR timeframe | 'seen' STRING ( 'before' | 'after' ) STRING 'in' var_domain ':' VAR | var_domain ':' VAR predop expr timeframe | var_domain ':' VAR timeframe | oe= operator_expr[expr_hash] );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_2 = input.LA(1);

                         
                        int index18_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_RuleSet2()) ) {s = 14;}

                        else if ( (synpred3_RuleSet2()) ) {s = 15;}

                         
                        input.seek(index18_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_3 = input.LA(1);

                         
                        int index18_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_RuleSet2()) ) {s = 16;}

                        else if ( (synpred5_RuleSet2()) ) {s = 17;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index18_3);
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
    static final String DFA23_eotS =
        "\17\uffff";
    static final String DFA23_eofS =
        "\17\uffff";
    static final String DFA23_minS =
        "\1\4\4\uffff\1\0\11\uffff";
    static final String DFA23_maxS =
        "\1\131\4\uffff\1\0\11\uffff";
    static final String DFA23_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\6\1\7\1\uffff\1\11\1\12\1\14"+
        "\1\5\1\10\1\13";
    static final String DFA23_specialS =
        "\5\uffff\1\0\11\uffff}>";
    static final String[] DFA23_transitionS = {
            "\1\5\1\1\6\uffff\1\2\24\uffff\1\12\15\uffff\1\13\42\uffff\1"+
            "\3\1\4\1\11\1\uffff\2\6\2\7",
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
            return "396:1: factor[HashMap expr_hash] returns [Object result] options {backtrack=true; } : (v= INT | v= STRING | v= 'true' | v= 'false' | VAR '[' expr ']' | var_domain ':' VAR | trail_exp | function_app | '[' expr ',' ']' | '{' ( hash_line ( ',' )? )* '}' | v= VAR | '(' expr ')' );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA23_5 = input.LA(1);

                         
                        int index23_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_RuleSet2()) ) {s = 12;}

                        else if ( (synpred13_RuleSet2()) ) {s = 13;}

                        else if ( (synpred16_RuleSet2()) ) {s = 14;}

                         
                        input.seek(index23_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 23, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA37_eotS =
        "\13\uffff";
    static final String DFA37_eofS =
        "\13\uffff";
    static final String DFA37_minS =
        "\1\42\7\uffff\1\133\2\uffff";
    static final String DFA37_maxS =
        "\1\176\7\uffff\1\u0081\2\uffff";
    static final String DFA37_acceptS =
        "\1\uffff\1\11\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\7\1\10";
    static final String DFA37_specialS =
        "\13\uffff}>";
    static final String[] DFA37_transitionS = {
            "\1\1\113\uffff\1\2\1\3\1\4\1\5\6\uffff\1\6\2\uffff\1\7\2\uffff"+
            "\1\10",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\12\43\uffff\1\11\1\uffff\1\12",
            "",
            ""
    };

    static final short[] DFA37_eot = DFA.unpackEncodedString(DFA37_eotS);
    static final short[] DFA37_eof = DFA.unpackEncodedString(DFA37_eofS);
    static final char[] DFA37_min = DFA.unpackEncodedStringToUnsignedChars(DFA37_minS);
    static final char[] DFA37_max = DFA.unpackEncodedStringToUnsignedChars(DFA37_maxS);
    static final short[] DFA37_accept = DFA.unpackEncodedString(DFA37_acceptS);
    static final short[] DFA37_special = DFA.unpackEncodedString(DFA37_specialS);
    static final short[][] DFA37_transition;

    static {
        int numStates = DFA37_transitionS.length;
        DFA37_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA37_transition[i] = DFA.unpackEncodedString(DFA37_transitionS[i]);
        }
    }

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = DFA37_eot;
            this.eof = DFA37_eof;
            this.min = DFA37_min;
            this.max = DFA37_max;
            this.accept = DFA37_accept;
            this.special = DFA37_special;
            this.transition = DFA37_transition;
        }
        public String getDescription() {
            return "()* loopback of 521:2: ( 'description' desc= ( HTML | STRING ) | 'name' thename= STRING | 'author' author= STRING | 'key' what= ( 'errorstack' | 'googleanalytics' | 'twitter' | 'amazon' | 'kpds' | 'google' | VAR ) (key_value= STRING | '{' ( name_value_pair[key_values] ( ',' name_value_pair[key_values] )* ) '}' )+ | 'authz' 'require' 'user' | 'logging' ( 'on' | 'off' ) | 'use' 'module' name= VAR ( 'alias' alias= VAR )? | 'use' rtype= ( 'css' | 'javascript' ) 'resource' (url= STRING | name= VAR ) )*";
        }
    }
 

    public static final BitSet FOLLOW_set_in_predop0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_add_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_mult_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleset756 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rulesetname_in_ruleset758 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleset762 = new BitSet(new long[]{0x0000000800000000L,0x0000200000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_meta_block_in_ruleset770 = new BitSet(new long[]{0x0000000C00000000L,0x0000200000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_dispatch_block_in_ruleset774 = new BitSet(new long[]{0x0000000C00000000L,0x0000200000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_global_block_in_ruleset778 = new BitSet(new long[]{0x0000000C00000000L,0x0000200000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_34_in_ruleset785 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_ruleset787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_rulesetname0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_global_block830 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_global_block832 = new BitSet(new long[]{0x0000103000000010L,0x0000100008000000L});
    public static final BitSet FOLLOW_emit_block_in_global_block840 = new BitSet(new long[]{0x0000103400000010L,0x0000100008000000L});
    public static final BitSet FOLLOW_set_in_global_block850 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_global_block859 = new BitSet(new long[]{0x0000084000000000L});
    public static final BitSet FOLLOW_38_in_global_block862 = new BitSet(new long[]{0x0000078000000000L});
    public static final BitSet FOLLOW_set_in_global_block866 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_global_block878 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_STRING_in_global_block882 = new BitSet(new long[]{0x0000103400000010L,0x0000140008000000L});
    public static final BitSet FOLLOW_cachable_in_global_block887 = new BitSet(new long[]{0x0000103400000010L,0x0000100008000000L});
    public static final BitSet FOLLOW_css_emit_in_global_block900 = new BitSet(new long[]{0x0000103400000010L,0x0000100008000000L});
    public static final BitSet FOLLOW_decl_in_global_block908 = new BitSet(new long[]{0x0000103400000010L,0x0000100008000000L});
    public static final BitSet FOLLOW_44_in_global_block914 = new BitSet(new long[]{0x0000103400000010L,0x0000100008000000L});
    public static final BitSet FOLLOW_34_in_global_block919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_decl946 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_decl948 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_HTML_in_decl952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_decl962 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_decl964 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_JS_in_decl968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_decl978 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_decl980 = new BitSet(new long[]{0x00C0C00200001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_expr_in_decl984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_def_in_expr1011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_expression_in_expr1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_function_def1041 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_function_def1043 = new BitSet(new long[]{0x0003000000000010L});
    public static final BitSet FOLLOW_VAR_in_function_def1047 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_48_in_function_def1051 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_function_def1055 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_49_in_function_def1060 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_function_def1062 = new BitSet(new long[]{0x00C0D00200001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_decl_in_function_def1066 = new BitSet(new long[]{0x00C0D00200001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_44_in_function_def1071 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_decl_in_function_def1075 = new BitSet(new long[]{0x00C0D00200001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_44_in_function_def1080 = new BitSet(new long[]{0x00C0C00200001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_expr_in_function_def1085 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_function_def1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_disjunction_in_conditional_expression1106 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_conditional_expression1110 = new BitSet(new long[]{0x00C0C00200001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_expr_in_conditional_expression1112 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_conditional_expression1114 = new BitSet(new long[]{0x00C0C00200001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_expr_in_conditional_expression1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conjunction_in_disjunction1134 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_disjunction1138 = new BitSet(new long[]{0x00C0C00200001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_conjunction_in_disjunction1140 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_equality_expr_in_conjunction1158 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_conjunction1162 = new BitSet(new long[]{0x00C0C00200001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_equality_expr_in_conjunction1164 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_add_expr_in_equality_expr1181 = new BitSet(new long[]{0x0000000007FC0002L});
    public static final BitSet FOLLOW_predop_in_equality_expr1189 = new BitSet(new long[]{0x00C0C00200001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_add_expr_in_equality_expr1191 = new BitSet(new long[]{0x0000000007FC0002L});
    public static final BitSet FOLLOW_mult_expr_in_add_expr1220 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_add_op_in_add_expr1226 = new BitSet(new long[]{0x00C0C00200001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_mult_expr_in_add_expr1230 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_unary_expr_in_mult_expr1257 = new BitSet(new long[]{0x00000000E0000002L});
    public static final BitSet FOLLOW_mult_op_in_mult_expr1262 = new BitSet(new long[]{0x00C0C00200001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_unary_expr_in_mult_expr1264 = new BitSet(new long[]{0x00000000E0000002L});
    public static final BitSet FOLLOW_54_in_unary_expr1295 = new BitSet(new long[]{0x00C0C00200001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_unary_expr_in_unary_expr1297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_unary_expr1304 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_STRING_in_unary_expr1306 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_unary_expr1308 = new BitSet(new long[]{0x0000000000000000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_var_domain_in_unary_expr1310 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_unary_expr1312 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_unary_expr1314 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_timeframe_in_unary_expr1316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_unary_expr1321 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_STRING_in_unary_expr1323 = new BitSet(new long[]{0x0600000000000000L});
    public static final BitSet FOLLOW_set_in_unary_expr1325 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_STRING_in_unary_expr1333 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_unary_expr1335 = new BitSet(new long[]{0x0000000000000000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_var_domain_in_unary_expr1337 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_unary_expr1339 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_unary_expr1341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_domain_in_unary_expr1346 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_unary_expr1348 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_unary_expr1350 = new BitSet(new long[]{0x0000000007FC0000L});
    public static final BitSet FOLLOW_predop_in_unary_expr1352 = new BitSet(new long[]{0x00C0C00200001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_expr_in_unary_expr1354 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_timeframe_in_unary_expr1356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_domain_in_unary_expr1361 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_unary_expr1363 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_unary_expr1365 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_timeframe_in_unary_expr1367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operator_expr_in_unary_expr1374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_operator_expr1396 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_operator_in_operator_expr1403 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_59_in_operator1417 = new BitSet(new long[]{0xF000000000000000L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_operator_op_in_operator1419 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_operator1421 = new BitSet(new long[]{0x00C0C00200001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_expr_in_operator1423 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_48_in_operator1425 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_operator1428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operator_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_factor1559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_factor1573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_factor1592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_factor1607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_factor1620 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_factor1622 = new BitSet(new long[]{0x00C0C00200001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_expr_in_factor1624 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_factor1626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_domain_in_factor1636 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_factor1638 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_factor1640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_trail_exp_in_factor1650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_app_in_factor1660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_factor1670 = new BitSet(new long[]{0x00C0C00200001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_expr_in_factor1672 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_factor1674 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_factor1676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_factor1686 = new BitSet(new long[]{0x0000000400001000L});
    public static final BitSet FOLLOW_hash_line_in_factor1689 = new BitSet(new long[]{0x0001000400001000L});
    public static final BitSet FOLLOW_48_in_factor1691 = new BitSet(new long[]{0x0000000400001000L});
    public static final BitSet FOLLOW_34_in_factor1696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_factor1708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_factor1721 = new BitSet(new long[]{0x00C0C00200001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_expr_in_factor1723 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_factor1725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_var_domain0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namespace_in_function_app1753 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_function_app1755 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_function_app1757 = new BitSet(new long[]{0x00C2C00200001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_expr_in_function_app1760 = new BitSet(new long[]{0x00C3C00200001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_48_in_function_app1762 = new BitSet(new long[]{0x00C2C00200001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_49_in_function_app1767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_function_app1773 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_function_app1775 = new BitSet(new long[]{0x00C2C00200001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_expr_in_function_app1778 = new BitSet(new long[]{0x00C3C00200001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_48_in_function_app1780 = new BitSet(new long[]{0x00C2C00200001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_49_in_function_app1785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_namespace1799 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_namespace1801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_trail_exp1814 = new BitSet(new long[]{0x0000000000000000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_var_domain_in_trail_exp1816 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_trail_exp1818 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_trail_exp1820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_trail_exp1826 = new BitSet(new long[]{0x00C0C00200001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_expr_in_trail_exp1828 = new BitSet(new long[]{0x0000000000000000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_var_domain_in_trail_exp1830 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_trail_exp1832 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_trail_exp1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_timeframe1847 = new BitSet(new long[]{0x00C0C00200001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_expr_in_timeframe1849 = new BitSet(new long[]{0x0000000000000000L,0x000003FFF0000000L});
    public static final BitSet FOLLOW_period_in_timeframe1853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_hash_line1869 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_hash_line1871 = new BitSet(new long[]{0x00C0C00200001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_expr_in_hash_line1873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_css_emit1888 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_HTML_in_css_emit1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_css_emit1902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_period0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_cachable2042 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_cachable2045 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_INT_in_cachable2049 = new BitSet(new long[]{0x0000000000000000L,0x000003FFF0000000L});
    public static final BitSet FOLLOW_period_in_cachable2054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_emit_block2079 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_HTML_in_emit_block2085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_emit_block2093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JS_in_emit_block2101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_meta_block2133 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_meta_block2135 = new BitSet(new long[]{0x0000000400000000L,0x4903C00000000000L});
    public static final BitSet FOLLOW_110_in_meta_block2141 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_set_in_meta_block2145 = new BitSet(new long[]{0x0000000400000000L,0x4903C00000000000L});
    public static final BitSet FOLLOW_111_in_meta_block2159 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_STRING_in_meta_block2163 = new BitSet(new long[]{0x0000000400000000L,0x4903C00000000000L});
    public static final BitSet FOLLOW_112_in_meta_block2173 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_STRING_in_meta_block2177 = new BitSet(new long[]{0x0000000400000000L,0x4903C00000000000L});
    public static final BitSet FOLLOW_113_in_meta_block2189 = new BitSet(new long[]{0x0000000000000010L,0x00FC000000000000L});
    public static final BitSet FOLLOW_set_in_meta_block2193 = new BitSet(new long[]{0x0000000200001000L});
    public static final BitSet FOLLOW_STRING_in_meta_block2215 = new BitSet(new long[]{0x0000000600001000L,0x4903C00000000000L});
    public static final BitSet FOLLOW_33_in_meta_block2219 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_name_value_pair_in_meta_block2222 = new BitSet(new long[]{0x0001000400000000L});
    public static final BitSet FOLLOW_48_in_meta_block2226 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_name_value_pair_in_meta_block2228 = new BitSet(new long[]{0x0001000400000000L});
    public static final BitSet FOLLOW_34_in_meta_block2234 = new BitSet(new long[]{0x0000000600001000L,0x4903C00000000000L});
    public static final BitSet FOLLOW_120_in_meta_block2246 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_121_in_meta_block2248 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_meta_block2250 = new BitSet(new long[]{0x0000000400000000L,0x4903C00000000000L});
    public static final BitSet FOLLOW_123_in_meta_block2257 = new BitSet(new long[]{0x0000000000000000L,0x3000000000000000L});
    public static final BitSet FOLLOW_set_in_meta_block2259 = new BitSet(new long[]{0x0000000400000000L,0x4903C00000000000L});
    public static final BitSet FOLLOW_126_in_meta_block2270 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_meta_block2272 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_meta_block2276 = new BitSet(new long[]{0x0000000400000000L,0x4903C00000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_128_in_meta_block2279 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_meta_block2283 = new BitSet(new long[]{0x0000000400000000L,0x4903C00000000000L});
    public static final BitSet FOLLOW_126_in_meta_block2292 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_meta_block2296 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_130_in_meta_block2304 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_STRING_in_meta_block2309 = new BitSet(new long[]{0x0000000400000000L,0x4903C00000000000L});
    public static final BitSet FOLLOW_VAR_in_meta_block2315 = new BitSet(new long[]{0x0000000400000000L,0x4903C00000000000L});
    public static final BitSet FOLLOW_34_in_meta_block2328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_dispatch_block2359 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_dispatch_block2361 = new BitSet(new long[]{0x0000000400000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_132_in_dispatch_block2364 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_STRING_in_dispatch_block2368 = new BitSet(new long[]{0x0000000400000000L,0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_133_in_dispatch_block2371 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_STRING_in_dispatch_block2375 = new BitSet(new long[]{0x0000000400000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_34_in_dispatch_block2385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_name_value_pair2408 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_name_value_pair2410 = new BitSet(new long[]{0x00000000000010A0L});
    public static final BitSet FOLLOW_INT_in_name_value_pair2418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_name_value_pair2429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_name_value_pair2440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_synpred2_RuleSet21304 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_STRING_in_synpred2_RuleSet21306 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_synpred2_RuleSet21308 = new BitSet(new long[]{0x0000000000000000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_var_domain_in_synpred2_RuleSet21310 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_synpred2_RuleSet21312 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_synpred2_RuleSet21314 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_timeframe_in_synpred2_RuleSet21316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_synpred3_RuleSet21321 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_STRING_in_synpred3_RuleSet21323 = new BitSet(new long[]{0x0600000000000000L});
    public static final BitSet FOLLOW_set_in_synpred3_RuleSet21325 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_STRING_in_synpred3_RuleSet21333 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_synpred3_RuleSet21335 = new BitSet(new long[]{0x0000000000000000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_var_domain_in_synpred3_RuleSet21337 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_synpred3_RuleSet21339 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_synpred3_RuleSet21341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_domain_in_synpred4_RuleSet21346 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_synpred4_RuleSet21348 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_synpred4_RuleSet21350 = new BitSet(new long[]{0x0000000007FC0000L});
    public static final BitSet FOLLOW_predop_in_synpred4_RuleSet21352 = new BitSet(new long[]{0x00C0C00200001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_expr_in_synpred4_RuleSet21354 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_timeframe_in_synpred4_RuleSet21356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_domain_in_synpred5_RuleSet21361 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_synpred5_RuleSet21363 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_synpred5_RuleSet21365 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_timeframe_in_synpred5_RuleSet21367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_synpred10_RuleSet21620 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_synpred10_RuleSet21622 = new BitSet(new long[]{0x00C0C00200001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_expr_in_synpred10_RuleSet21624 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_synpred10_RuleSet21626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_app_in_synpred13_RuleSet21660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_synpred16_RuleSet21708 = new BitSet(new long[]{0x0000000000000002L});

}