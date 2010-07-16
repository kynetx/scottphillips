// $ANTLR 3.2 Sep 23, 2009 12:02:23 RuleSet2.g 2010-07-16 10:24:34

	package com.kynetx;
	import java.util.HashMap;
	import java.util.ArrayList;
//	import org.json.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class RuleSet2Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "VAR", "INT", "EXPONENT", "FLOAT", "NUM", "COMMENT", "WS", "ESC_SEQ", "STRING", "HTML", "JS", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "'<='", "'>='", "'<'", "'>'", "'=='", "'!='", "'eq'", "'neq'", "'like'", "'+'", "'-'", "'ruleset'", "'{'", "'}'", "'global'", "'dataset'", "'datasource'", "':'", "'JSON'", "'XML'", "'RSS'", "'HTML'", "'<-'", "';'", "'='", "'function'", "'('", "','", "')'", "'=>'", "'|'", "'||'", "'&&'", "'*'", "'/'", "'%'", "'not'", "'seen'", "'in'", "'before'", "'after'", "'.'", "'pick'", "'match'", "'length'", "'replace'", "'as'", "'head'", "'tail'", "'sort'", "'filter'", "'map'", "'uc'", "'lc'", "'split'", "'join'", "'query'", "'has'", "'union'", "'difference'", "'intersection'", "'unique'", "'once'", "'duplicates'", "'true'", "'false'", "'['", "']'", "'current'", "'history'", "'ent'", "'app'", "'within'", "'css'", "'years'", "'months'", "'weeks'", "'days'", "'hours'", "'minutes'", "'seconds'", "'year'", "'month'", "'week'", "'day'", "'hour'", "'minute'", "'second'", "'cachable'", "'for'", "'emit'", "'meta'", "'description'", "'name'", "'author'", "'key'", "'errorstack'", "'googleanalytics'", "'twitter'", "'amazon'", "'kpds'", "'google'", "'authz'", "'require'", "'user'", "'logging'", "'on'", "'off'", "'use'", "'module'", "'alias'", "'javascript'", "'resource'", "'dispatch'", "'domain'", "'->'"
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
    	
    	public void  add_to_expression(ArrayList result,String type,String op, Object oresult)
    	{
    		HashMap tmp = new HashMap();
    		tmp.put("op",op);
    		tmp.put("type",type);
    		tmp.put("result",oresult); 
    		result.add(tmp);
    	}
    	public void puts(String str)
    	{
    		System.out.println(str);
    	}
    	
    	public HashMap build_exp_result(ArrayList operators)
    	{
    //		puts("Start " + operators.size() ) ;
    		HashMap result = new HashMap();
    		ArrayList args_array = new ArrayList();
    		result.put("args",args_array);
    		for(int i = 0;i < operators.size(); i++)
    		{
    //			puts("at " + i);
    			HashMap value = (HashMap)operators.get(i);				
    						
    			// Are we at the end?
    			if(i == operators.size() - 1 ||  i == 0)
    			{
    				if(i == 0)
    				{
    //					puts("O Opt " + value.get("op") + " - " + i);
    					result.put("op",value.get("op"));
    					result.put("type",value.get("type"));
    				}

    				args_array.add(value.get("result"));
    			}
    			else
    			{
    				HashMap tmp = new HashMap();
    				ArrayList new_args_array = new ArrayList();
    				// We really need the next operator for the ast
    				HashMap value2 = (HashMap)operators.get(i+1);				
    										
    				tmp.put("op",value2.get("op"));
    				tmp.put("type",value2.get("type"));
    				tmp.put("args",new_args_array);

    				new_args_array.add(value.get("result"));
    				
    				args_array.add(tmp); 
    				args_array = new_args_array;
    			}
    		}
    //		puts("End " ) ;
    		return result;
    	}


    public static class predop_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "predop"
    // RuleSet2.g:115:10: fragment predop : ( '<=' | '>=' | '<' | '>' | '==' | '!=' | 'eq' | 'neq' | 'like' );
    public final RuleSet2Parser.predop_return predop() throws RecognitionException {
        RuleSet2Parser.predop_return retval = new RuleSet2Parser.predop_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set1=null;

        Object set1_tree=null;

        try {
            // RuleSet2.g:115:16: ( '<=' | '>=' | '<' | '>' | '==' | '!=' | 'eq' | 'neq' | 'like' )
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
    // RuleSet2.g:117:10: fragment add_op : ( '+' | '-' );
    public final RuleSet2Parser.add_op_return add_op() throws RecognitionException {
        RuleSet2Parser.add_op_return retval = new RuleSet2Parser.add_op_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set2=null;

        Object set2_tree=null;

        try {
            // RuleSet2.g:117:16: ( '+' | '-' )
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

    public static class ruleset_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ruleset"
    // RuleSet2.g:190:1: ruleset options {backtrack=false; } : 'ruleset' rulesetname '{' ( meta_block | dispatch_block | global_block )+ '}' EOF ;
    public final RuleSet2Parser.ruleset_return ruleset() throws RecognitionException {
        RuleSet2Parser.ruleset_return retval = new RuleSet2Parser.ruleset_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal3=null;
        Token char_literal5=null;
        Token char_literal9=null;
        Token EOF10=null;
        RuleSet2Parser.rulesetname_return rulesetname4 = null;

        RuleSet2Parser.meta_block_return meta_block6 = null;

        RuleSet2Parser.dispatch_block_return dispatch_block7 = null;

        RuleSet2Parser.global_block_return global_block8 = null;


        Object string_literal3_tree=null;
        Object char_literal5_tree=null;
        Object char_literal9_tree=null;
        Object EOF10_tree=null;


         	 rule_json.put("global",new ArrayList());
         	 rule_json.put("dispatch",new ArrayList());
         	 rule_json.put("rules",new ArrayList());
         	 rule_json.put("meta", new HashMap());
        	 current_top = rule_json;

        try {
            // RuleSet2.g:201:3: ( 'ruleset' rulesetname '{' ( meta_block | dispatch_block | global_block )+ '}' EOF )
            // RuleSet2.g:201:7: 'ruleset' rulesetname '{' ( meta_block | dispatch_block | global_block )+ '}' EOF
            {
            root_0 = (Object)adaptor.nil();

            string_literal3=(Token)match(input,29,FOLLOW_29_in_ruleset744); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal3_tree = (Object)adaptor.create(string_literal3);
            adaptor.addChild(root_0, string_literal3_tree);
            }
            pushFollow(FOLLOW_rulesetname_in_ruleset746);
            rulesetname4=rulesetname();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, rulesetname4.getTree());
            if ( state.backtracking==0 ) {
               current_top.put("ruleset_name",(rulesetname4!=null?input.toString(rulesetname4.start,rulesetname4.stop):null)); 
            }
            char_literal5=(Token)match(input,30,FOLLOW_30_in_ruleset750); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal5_tree = (Object)adaptor.create(char_literal5);
            adaptor.addChild(root_0, char_literal5_tree);
            }
            // RuleSet2.g:202:4: ( meta_block | dispatch_block | global_block )+
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
                case 32:
                    {
                    alt1=3;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // RuleSet2.g:202:6: meta_block
            	    {
            	    pushFollow(FOLLOW_meta_block_in_ruleset758);
            	    meta_block6=meta_block();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, meta_block6.getTree());

            	    }
            	    break;
            	case 2 :
            	    // RuleSet2.g:202:19: dispatch_block
            	    {
            	    pushFollow(FOLLOW_dispatch_block_in_ruleset762);
            	    dispatch_block7=dispatch_block();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, dispatch_block7.getTree());

            	    }
            	    break;
            	case 3 :
            	    // RuleSet2.g:202:36: global_block
            	    {
            	    pushFollow(FOLLOW_global_block_in_ruleset766);
            	    global_block8=global_block();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, global_block8.getTree());

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

            char_literal9=(Token)match(input,31,FOLLOW_31_in_ruleset773); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal9_tree = (Object)adaptor.create(char_literal9);
            adaptor.addChild(root_0, char_literal9_tree);
            }
            EOF10=(Token)match(input,EOF,FOLLOW_EOF_in_ruleset775); if (state.failed) return retval;
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
        }
        return retval;
    }
    // $ANTLR end "ruleset"

    public static class rulesetname_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rulesetname"
    // RuleSet2.g:206:1: rulesetname : ( VAR | INT );
    public final RuleSet2Parser.rulesetname_return rulesetname() throws RecognitionException {
        RuleSet2Parser.rulesetname_return retval = new RuleSet2Parser.rulesetname_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set11=null;

        Object set11_tree=null;

        try {
            // RuleSet2.g:207:2: ( VAR | INT )
            // RuleSet2.g:
            {
            root_0 = (Object)adaptor.nil();

            set11=(Token)input.LT(1);
            if ( (input.LA(1)>=VAR && input.LA(1)<=INT) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set11));
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
    // RuleSet2.g:211:1: global_block : 'global' '{' (emt= emit_block | dst= ( 'dataset' | 'datasource' ) name= VAR ( ':' dtype= ( 'JSON' | 'XML' | 'RSS' | 'HTML' ) )? '<-' src= STRING (cas= cachable )? | css_emit | decl[global_block_array] | ';' )+ '}' ;
    public final RuleSet2Parser.global_block_return global_block() throws RecognitionException {
        RuleSet2Parser.global_block_return retval = new RuleSet2Parser.global_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token dst=null;
        Token name=null;
        Token dtype=null;
        Token src=null;
        Token string_literal12=null;
        Token char_literal13=null;
        Token char_literal14=null;
        Token string_literal15=null;
        Token char_literal18=null;
        Token char_literal19=null;
        RuleSet2Parser.emit_block_return emt = null;

        RuleSet2Parser.cachable_return cas = null;

        RuleSet2Parser.css_emit_return css_emit16 = null;

        RuleSet2Parser.decl_return decl17 = null;


        Object dst_tree=null;
        Object name_tree=null;
        Object dtype_tree=null;
        Object src_tree=null;
        Object string_literal12_tree=null;
        Object char_literal13_tree=null;
        Object char_literal14_tree=null;
        Object string_literal15_tree=null;
        Object char_literal18_tree=null;
        Object char_literal19_tree=null;


        	 ArrayList global_block_array = (ArrayList)rule_json.get("global");
        	 boolean found_cache = false;

        try {
            // RuleSet2.g:218:2: ( 'global' '{' (emt= emit_block | dst= ( 'dataset' | 'datasource' ) name= VAR ( ':' dtype= ( 'JSON' | 'XML' | 'RSS' | 'HTML' ) )? '<-' src= STRING (cas= cachable )? | css_emit | decl[global_block_array] | ';' )+ '}' )
            // RuleSet2.g:218:4: 'global' '{' (emt= emit_block | dst= ( 'dataset' | 'datasource' ) name= VAR ( ':' dtype= ( 'JSON' | 'XML' | 'RSS' | 'HTML' ) )? '<-' src= STRING (cas= cachable )? | css_emit | decl[global_block_array] | ';' )+ '}'
            {
            root_0 = (Object)adaptor.nil();

            string_literal12=(Token)match(input,32,FOLLOW_32_in_global_block818); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal12_tree = (Object)adaptor.create(string_literal12);
            adaptor.addChild(root_0, string_literal12_tree);
            }
            char_literal13=(Token)match(input,30,FOLLOW_30_in_global_block820); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal13_tree = (Object)adaptor.create(char_literal13);
            adaptor.addChild(root_0, char_literal13_tree);
            }
            // RuleSet2.g:219:2: (emt= emit_block | dst= ( 'dataset' | 'datasource' ) name= VAR ( ':' dtype= ( 'JSON' | 'XML' | 'RSS' | 'HTML' ) )? '<-' src= STRING (cas= cachable )? | css_emit | decl[global_block_array] | ';' )+
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
                case 33:
                case 34:
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
                case 41:
                    {
                    alt4=5;
                    }
                    break;

                }

                switch (alt4) {
            	case 1 :
            	    // RuleSet2.g:219:4: emt= emit_block
            	    {
            	    pushFollow(FOLLOW_emit_block_in_global_block828);
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
            	    // RuleSet2.g:224:4: dst= ( 'dataset' | 'datasource' ) name= VAR ( ':' dtype= ( 'JSON' | 'XML' | 'RSS' | 'HTML' ) )? '<-' src= STRING (cas= cachable )?
            	    {
            	    dst=(Token)input.LT(1);
            	    if ( (input.LA(1)>=33 && input.LA(1)<=34) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(dst));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    name=(Token)match(input,VAR,FOLLOW_VAR_in_global_block847); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    name_tree = (Object)adaptor.create(name);
            	    adaptor.addChild(root_0, name_tree);
            	    }
            	    // RuleSet2.g:224:43: ( ':' dtype= ( 'JSON' | 'XML' | 'RSS' | 'HTML' ) )?
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==35) ) {
            	        alt2=1;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // RuleSet2.g:224:44: ':' dtype= ( 'JSON' | 'XML' | 'RSS' | 'HTML' )
            	            {
            	            char_literal14=(Token)match(input,35,FOLLOW_35_in_global_block850); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal14_tree = (Object)adaptor.create(char_literal14);
            	            adaptor.addChild(root_0, char_literal14_tree);
            	            }
            	            dtype=(Token)input.LT(1);
            	            if ( (input.LA(1)>=36 && input.LA(1)<=39) ) {
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

            	    string_literal15=(Token)match(input,40,FOLLOW_40_in_global_block866); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal15_tree = (Object)adaptor.create(string_literal15);
            	    adaptor.addChild(root_0, string_literal15_tree);
            	    }
            	    src=(Token)match(input,STRING,FOLLOW_STRING_in_global_block870); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    src_tree = (Object)adaptor.create(src);
            	    adaptor.addChild(root_0, src_tree);
            	    }
            	    // RuleSet2.g:224:100: (cas= cachable )?
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==106) ) {
            	        alt3=1;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // RuleSet2.g:224:101: cas= cachable
            	            {
            	            pushFollow(FOLLOW_cachable_in_global_block875);
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
            	    // RuleSet2.g:258:4: css_emit
            	    {
            	    pushFollow(FOLLOW_css_emit_in_global_block888);
            	    css_emit16=css_emit();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, css_emit16.getTree());
            	    if ( state.backtracking==0 ) {

            	      		HashMap tmp = new HashMap(); 
            	      		tmp.put("content",(emt!=null?emt.emit_value:null));
            	      		tmp.put("type","css");
            	      		global_block_array.add(tmp);
            	      	
            	    }

            	    }
            	    break;
            	case 4 :
            	    // RuleSet2.g:264:4: decl[global_block_array]
            	    {
            	    pushFollow(FOLLOW_decl_in_global_block896);
            	    decl17=decl(global_block_array);

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, decl17.getTree());

            	    }
            	    break;
            	case 5 :
            	    // RuleSet2.g:265:4: ';'
            	    {
            	    char_literal18=(Token)match(input,41,FOLLOW_41_in_global_block902); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal18_tree = (Object)adaptor.create(char_literal18);
            	    adaptor.addChild(root_0, char_literal18_tree);
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

            char_literal19=(Token)match(input,31,FOLLOW_31_in_global_block907); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal19_tree = (Object)adaptor.create(char_literal19);
            adaptor.addChild(root_0, char_literal19_tree);
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
    // RuleSet2.g:272:1: decl[ArrayList block_array] : (var= VAR '=' val= HTML | var= VAR '=' val= JS | var= VAR '=' e= expr );
    public final RuleSet2Parser.decl_return decl(ArrayList  block_array) throws RecognitionException {
        RuleSet2Parser.decl_return retval = new RuleSet2Parser.decl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token var=null;
        Token val=null;
        Token char_literal20=null;
        Token char_literal21=null;
        Token char_literal22=null;
        RuleSet2Parser.expr_return e = null;


        Object var_tree=null;
        Object val_tree=null;
        Object char_literal20_tree=null;
        Object char_literal21_tree=null;
        Object char_literal22_tree=null;



        try {
            // RuleSet2.g:275:2: (var= VAR '=' val= HTML | var= VAR '=' val= JS | var= VAR '=' e= expr )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==VAR) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==42) ) {
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
                    case 30:
                    case 43:
                    case 44:
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
                    // RuleSet2.g:276:2: var= VAR '=' val= HTML
                    {
                    root_0 = (Object)adaptor.nil();

                    var=(Token)match(input,VAR,FOLLOW_VAR_in_decl934); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    var_tree = (Object)adaptor.create(var);
                    adaptor.addChild(root_0, var_tree);
                    }
                    char_literal20=(Token)match(input,42,FOLLOW_42_in_decl936); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal20_tree = (Object)adaptor.create(char_literal20);
                    adaptor.addChild(root_0, char_literal20_tree);
                    }
                    val=(Token)match(input,HTML,FOLLOW_HTML_in_decl940); if (state.failed) return retval;
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
                    // RuleSet2.g:283:4: var= VAR '=' val= JS
                    {
                    root_0 = (Object)adaptor.nil();

                    var=(Token)match(input,VAR,FOLLOW_VAR_in_decl950); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    var_tree = (Object)adaptor.create(var);
                    adaptor.addChild(root_0, var_tree);
                    }
                    char_literal21=(Token)match(input,42,FOLLOW_42_in_decl952); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal21_tree = (Object)adaptor.create(char_literal21);
                    adaptor.addChild(root_0, char_literal21_tree);
                    }
                    val=(Token)match(input,JS,FOLLOW_JS_in_decl956); if (state.failed) return retval;
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
                    // RuleSet2.g:290:4: var= VAR '=' e= expr
                    {
                    root_0 = (Object)adaptor.nil();

                    var=(Token)match(input,VAR,FOLLOW_VAR_in_decl966); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    var_tree = (Object)adaptor.create(var);
                    adaptor.addChild(root_0, var_tree);
                    }
                    char_literal22=(Token)match(input,42,FOLLOW_42_in_decl968); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal22_tree = (Object)adaptor.create(char_literal22);
                    adaptor.addChild(root_0, char_literal22_tree);
                    }
                    pushFollow(FOLLOW_expr_in_decl972);
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
        public Object result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // RuleSet2.g:302:1: expr returns [Object result] : (fd= function_def[result_hash] | c= conditional_expression );
    public final RuleSet2Parser.expr_return expr() throws RecognitionException {
        RuleSet2Parser.expr_return retval = new RuleSet2Parser.expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RuleSet2Parser.function_def_return fd = null;

        RuleSet2Parser.conditional_expression_return c = null;




        	HashMap result_hash = new HashMap();

        try {
            // RuleSet2.g:306:2: (fd= function_def[result_hash] | c= conditional_expression )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==43) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=VAR && LA6_0<=INT)||LA6_0==STRING||LA6_0==30||LA6_0==44||(LA6_0>=54 && LA6_0<=55)||(LA6_0>=82 && LA6_0<=84)||(LA6_0>=86 && LA6_0<=89)) ) {
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
                    // RuleSet2.g:306:4: fd= function_def[result_hash]
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_function_def_in_expr999);
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
                    // RuleSet2.g:309:4: c= conditional_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_conditional_expression_in_expr1009);
                    c=conditional_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, c.getTree());
                    if ( state.backtracking==0 ) {

                      		retval.result = (c!=null?c.result:null);
                      	
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
    // RuleSet2.g:314:1: function_def[HashMap expr_hash] : 'function' '(' (v1= VAR )? ( ',' v2= VAR )* ')' '{' (d1= decl[block_array] )? ( ';' d2= decl[block_array] )* ( ';' )? e1= expr '}' ;
    public final RuleSet2Parser.function_def_return function_def(HashMap  expr_hash) throws RecognitionException {
        RuleSet2Parser.function_def_return retval = new RuleSet2Parser.function_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token v1=null;
        Token v2=null;
        Token string_literal23=null;
        Token char_literal24=null;
        Token char_literal25=null;
        Token char_literal26=null;
        Token char_literal27=null;
        Token char_literal28=null;
        Token char_literal29=null;
        Token char_literal30=null;
        RuleSet2Parser.decl_return d1 = null;

        RuleSet2Parser.decl_return d2 = null;

        RuleSet2Parser.expr_return e1 = null;


        Object v1_tree=null;
        Object v2_tree=null;
        Object string_literal23_tree=null;
        Object char_literal24_tree=null;
        Object char_literal25_tree=null;
        Object char_literal26_tree=null;
        Object char_literal27_tree=null;
        Object char_literal28_tree=null;
        Object char_literal29_tree=null;
        Object char_literal30_tree=null;


        	ArrayList block_array = new ArrayList();

        try {
            // RuleSet2.g:318:2: ( 'function' '(' (v1= VAR )? ( ',' v2= VAR )* ')' '{' (d1= decl[block_array] )? ( ';' d2= decl[block_array] )* ( ';' )? e1= expr '}' )
            // RuleSet2.g:318:4: 'function' '(' (v1= VAR )? ( ',' v2= VAR )* ')' '{' (d1= decl[block_array] )? ( ';' d2= decl[block_array] )* ( ';' )? e1= expr '}'
            {
            root_0 = (Object)adaptor.nil();

            string_literal23=(Token)match(input,43,FOLLOW_43_in_function_def1030); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal23_tree = (Object)adaptor.create(string_literal23);
            adaptor.addChild(root_0, string_literal23_tree);
            }
            char_literal24=(Token)match(input,44,FOLLOW_44_in_function_def1032); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal24_tree = (Object)adaptor.create(char_literal24);
            adaptor.addChild(root_0, char_literal24_tree);
            }
            // RuleSet2.g:318:21: (v1= VAR )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==VAR) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // RuleSet2.g:318:21: v1= VAR
                    {
                    v1=(Token)match(input,VAR,FOLLOW_VAR_in_function_def1036); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    v1_tree = (Object)adaptor.create(v1);
                    adaptor.addChild(root_0, v1_tree);
                    }

                    }
                    break;

            }

            // RuleSet2.g:318:27: ( ',' v2= VAR )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==45) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // RuleSet2.g:318:28: ',' v2= VAR
            	    {
            	    char_literal25=(Token)match(input,45,FOLLOW_45_in_function_def1040); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal25_tree = (Object)adaptor.create(char_literal25);
            	    adaptor.addChild(root_0, char_literal25_tree);
            	    }
            	    v2=(Token)match(input,VAR,FOLLOW_VAR_in_function_def1044); if (state.failed) return retval;
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

            char_literal26=(Token)match(input,46,FOLLOW_46_in_function_def1049); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal26_tree = (Object)adaptor.create(char_literal26);
            adaptor.addChild(root_0, char_literal26_tree);
            }
            char_literal27=(Token)match(input,30,FOLLOW_30_in_function_def1051); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal27_tree = (Object)adaptor.create(char_literal27);
            adaptor.addChild(root_0, char_literal27_tree);
            }
            // RuleSet2.g:318:52: (d1= decl[block_array] )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==VAR) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==42) ) {
                    alt9=1;
                }
            }
            switch (alt9) {
                case 1 :
                    // RuleSet2.g:318:52: d1= decl[block_array]
                    {
                    pushFollow(FOLLOW_decl_in_function_def1055);
                    d1=decl(block_array);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, d1.getTree());

                    }
                    break;

            }

            // RuleSet2.g:318:72: ( ';' d2= decl[block_array] )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==41) ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1==VAR) ) {
                        int LA10_3 = input.LA(3);

                        if ( (LA10_3==42) ) {
                            alt10=1;
                        }


                    }


                }


                switch (alt10) {
            	case 1 :
            	    // RuleSet2.g:318:73: ';' d2= decl[block_array]
            	    {
            	    char_literal28=(Token)match(input,41,FOLLOW_41_in_function_def1060); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal28_tree = (Object)adaptor.create(char_literal28);
            	    adaptor.addChild(root_0, char_literal28_tree);
            	    }
            	    pushFollow(FOLLOW_decl_in_function_def1064);
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

            // RuleSet2.g:318:100: ( ';' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==41) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // RuleSet2.g:318:100: ';'
                    {
                    char_literal29=(Token)match(input,41,FOLLOW_41_in_function_def1069); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal29_tree = (Object)adaptor.create(char_literal29);
                    adaptor.addChild(root_0, char_literal29_tree);
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_expr_in_function_def1074);
            e1=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, e1.getTree());
            char_literal30=(Token)match(input,31,FOLLOW_31_in_function_def1076); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal30_tree = (Object)adaptor.create(char_literal30);
            adaptor.addChild(root_0, char_literal30_tree);
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
        public Object result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditional_expression"
    // RuleSet2.g:323:1: conditional_expression returns [Object result] : d= disjunction ( '=>' expr '|' expr )? ;
    public final RuleSet2Parser.conditional_expression_return conditional_expression() throws RecognitionException {
        RuleSet2Parser.conditional_expression_return retval = new RuleSet2Parser.conditional_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal31=null;
        Token char_literal33=null;
        RuleSet2Parser.disjunction_return d = null;

        RuleSet2Parser.expr_return expr32 = null;

        RuleSet2Parser.expr_return expr34 = null;


        Object string_literal31_tree=null;
        Object char_literal33_tree=null;

        try {
            // RuleSet2.g:324:2: (d= disjunction ( '=>' expr '|' expr )? )
            // RuleSet2.g:324:5: d= disjunction ( '=>' expr '|' expr )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_disjunction_in_conditional_expression1098);
            d=disjunction();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, d.getTree());
            // RuleSet2.g:324:19: ( '=>' expr '|' expr )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==47) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // RuleSet2.g:324:20: '=>' expr '|' expr
                    {
                    string_literal31=(Token)match(input,47,FOLLOW_47_in_conditional_expression1101); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal31_tree = (Object)adaptor.create(string_literal31);
                    adaptor.addChild(root_0, string_literal31_tree);
                    }
                    pushFollow(FOLLOW_expr_in_conditional_expression1103);
                    expr32=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr32.getTree());
                    char_literal33=(Token)match(input,48,FOLLOW_48_in_conditional_expression1105); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal33_tree = (Object)adaptor.create(char_literal33);
                    adaptor.addChild(root_0, char_literal33_tree);
                    }
                    pushFollow(FOLLOW_expr_in_conditional_expression1107);
                    expr34=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr34.getTree());

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               retval.result = (d!=null?d.result:null); 
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
        public Object result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "disjunction"
    // RuleSet2.g:329:1: disjunction returns [Object result] : me1= conjunction (op= '||' me2= conjunction )* ;
    public final RuleSet2Parser.disjunction_return disjunction() throws RecognitionException {
        RuleSet2Parser.disjunction_return retval = new RuleSet2Parser.disjunction_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op=null;
        RuleSet2Parser.conjunction_return me1 = null;

        RuleSet2Parser.conjunction_return me2 = null;


        Object op_tree=null;


        	boolean found_op = false;
        	ArrayList result = new ArrayList();

        try {
            // RuleSet2.g:334:2: (me1= conjunction (op= '||' me2= conjunction )* )
            // RuleSet2.g:334:4: me1= conjunction (op= '||' me2= conjunction )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_conjunction_in_disjunction1139);
            me1=conjunction();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, me1.getTree());
            // RuleSet2.g:334:20: (op= '||' me2= conjunction )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==49) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // RuleSet2.g:334:21: op= '||' me2= conjunction
            	    {
            	    op=(Token)match(input,49,FOLLOW_49_in_disjunction1144); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    adaptor.addChild(root_0, op_tree);
            	    }
            	    pushFollow(FOLLOW_conjunction_in_disjunction1148);
            	    me2=conjunction();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, me2.getTree());
            	    if ( state.backtracking==0 ) {

            	      		found_op = true;
            	      		if(result.isEmpty())
            	      		{
            	      			 add_to_expression(result,"pred",(op!=null?op.getText():null),(me1!=null?me1.result:null));
            	      			 add_to_expression(result,"pred",(op!=null?op.getText():null),(me2!=null?me2.result:null));
            	      		}			 
            	      		else
            	      			 add_to_expression(result,"pred",(op!=null?op.getText():null),(me2!=null?me2.result:null));

            	      	
            	    }

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		if(found_op)
              			retval.result = build_exp_result(result); 
              		else
              			retval.result = (me1!=null?me1.result:null);
              	
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
    // $ANTLR end "disjunction"

    public static class conjunction_return extends ParserRuleReturnScope {
        public Object result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conjunction"
    // RuleSet2.g:352:1: conjunction returns [Object result] : me1= equality_expr (op= '&&' me2= equality_expr )* ;
    public final RuleSet2Parser.conjunction_return conjunction() throws RecognitionException {
        RuleSet2Parser.conjunction_return retval = new RuleSet2Parser.conjunction_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op=null;
        RuleSet2Parser.equality_expr_return me1 = null;

        RuleSet2Parser.equality_expr_return me2 = null;


        Object op_tree=null;


        	boolean found_op = false;
        	ArrayList result = new ArrayList();

        try {
            // RuleSet2.g:357:2: (me1= equality_expr (op= '&&' me2= equality_expr )* )
            // RuleSet2.g:357:4: me1= equality_expr (op= '&&' me2= equality_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equality_expr_in_conjunction1178);
            me1=equality_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, me1.getTree());
            // RuleSet2.g:357:22: (op= '&&' me2= equality_expr )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==50) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // RuleSet2.g:357:23: op= '&&' me2= equality_expr
            	    {
            	    op=(Token)match(input,50,FOLLOW_50_in_conjunction1183); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    adaptor.addChild(root_0, op_tree);
            	    }
            	    pushFollow(FOLLOW_equality_expr_in_conjunction1187);
            	    me2=equality_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, me2.getTree());
            	    if ( state.backtracking==0 ) {

            	      		found_op = true;
            	      		if(result.isEmpty())
            	      		{
            	      			 add_to_expression(result,"prim",(op!=null?op.getText():null),(me1!=null?me1.result:null));
            	      			 add_to_expression(result,"prim",(op!=null?op.getText():null),(me2!=null?me2.result:null));
            	      		}
            	      		else
            	      			 add_to_expression(result,"prim",(op!=null?op.getText():null),(me2!=null?me2.result:null));

            	      	
            	    }

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               
              		if(found_op)
              			retval.result = build_exp_result(result); 
              		else
              			retval.result = (me1!=null?me1.result:null);
              	 
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
    // $ANTLR end "conjunction"

    public static class equality_expr_return extends ParserRuleReturnScope {
        public Object result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equality_expr"
    // RuleSet2.g:375:1: equality_expr returns [Object result] : me1= add_expr (op= predop me2= add_expr )* ;
    public final RuleSet2Parser.equality_expr_return equality_expr() throws RecognitionException {
        RuleSet2Parser.equality_expr_return retval = new RuleSet2Parser.equality_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RuleSet2Parser.add_expr_return me1 = null;

        RuleSet2Parser.predop_return op = null;

        RuleSet2Parser.add_expr_return me2 = null;




        	boolean found_op = false;
        	ArrayList result = new ArrayList();

        try {
            // RuleSet2.g:380:2: (me1= add_expr (op= predop me2= add_expr )* )
            // RuleSet2.g:380:4: me1= add_expr (op= predop me2= add_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_add_expr_in_equality_expr1218);
            me1=add_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, me1.getTree());
            // RuleSet2.g:380:17: (op= predop me2= add_expr )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=18 && LA15_0<=26)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // RuleSet2.g:380:18: op= predop me2= add_expr
            	    {
            	    pushFollow(FOLLOW_predop_in_equality_expr1223);
            	    op=predop();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, op.getTree());
            	    pushFollow(FOLLOW_add_expr_in_equality_expr1227);
            	    me2=add_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, me2.getTree());
            	    if ( state.backtracking==0 ) {

            	      		found_op = true;
            	      		if(result.isEmpty())
            	      		{
            	      			 add_to_expression(result,"prim",(op!=null?input.toString(op.start,op.stop):null),(me1!=null?me1.result:null));
            	      			 add_to_expression(result,"prim",(op!=null?input.toString(op.start,op.stop):null),(me2!=null?me2.result:null));
            	      		}
            	      		else
            	      			 add_to_expression(result,"prim",(op!=null?input.toString(op.start,op.stop):null),(me2!=null?me2.result:null));
            	      	
            	    }

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               
              		if(found_op)
              			retval.result = build_exp_result(result); 
              		else
              			retval.result = (me1!=null?me1.result:null);
              	 
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
    // $ANTLR end "equality_expr"

    public static class add_expr_return extends ParserRuleReturnScope {
        public Object result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "add_expr"
    // RuleSet2.g:398:1: add_expr returns [Object result] : me1= mult_expr (op= add_op me2= mult_expr )* ;
    public final RuleSet2Parser.add_expr_return add_expr() throws RecognitionException {
        RuleSet2Parser.add_expr_return retval = new RuleSet2Parser.add_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RuleSet2Parser.mult_expr_return me1 = null;

        RuleSet2Parser.add_op_return op = null;

        RuleSet2Parser.mult_expr_return me2 = null;




        	boolean found_op = false;
        	ArrayList result = new ArrayList();

        try {
            // RuleSet2.g:403:2: (me1= mult_expr (op= add_op me2= mult_expr )* )
            // RuleSet2.g:403:4: me1= mult_expr (op= add_op me2= mult_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_mult_expr_in_add_expr1261);
            me1=mult_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, me1.getTree());
            // RuleSet2.g:403:18: (op= add_op me2= mult_expr )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=27 && LA16_0<=28)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // RuleSet2.g:403:19: op= add_op me2= mult_expr
            	    {
            	    pushFollow(FOLLOW_add_op_in_add_expr1266);
            	    op=add_op();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, op.getTree());
            	    pushFollow(FOLLOW_mult_expr_in_add_expr1270);
            	    me2=mult_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, me2.getTree());
            	    if ( state.backtracking==0 ) {

            	      		found_op = true;
            	      		if(result.isEmpty())
            	      		{
            	      			 add_to_expression(result,"prim",(op!=null?input.toString(op.start,op.stop):null),(me1!=null?me1.result:null));
            	      			 add_to_expression(result,"prim",(op!=null?input.toString(op.start,op.stop):null),(me2!=null?me2.result:null));
            	      		}
            	      		else
            	      			 add_to_expression(result,"prim",(op!=null?input.toString(op.start,op.stop):null),(me2!=null?me2.result:null));
            	      	
            	    }

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               
              		if(found_op)
              			retval.result = build_exp_result(result); 
              		else
              			retval.result = (me1!=null?me1.result:null);
               
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

    public static class mult_op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mult_op"
    // RuleSet2.g:422:1: mult_op : ( '*' | '/' | '%' );
    public final RuleSet2Parser.mult_op_return mult_op() throws RecognitionException {
        RuleSet2Parser.mult_op_return retval = new RuleSet2Parser.mult_op_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set35=null;

        Object set35_tree=null;

        try {
            // RuleSet2.g:422:8: ( '*' | '/' | '%' )
            // RuleSet2.g:
            {
            root_0 = (Object)adaptor.nil();

            set35=(Token)input.LT(1);
            if ( (input.LA(1)>=51 && input.LA(1)<=53) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set35));
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

    public static class mult_expr_return extends ParserRuleReturnScope {
        public Object result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mult_expr"
    // RuleSet2.g:424:1: mult_expr returns [Object result] : me1= unary_expr (op= mult_op me2= unary_expr )* ;
    public final RuleSet2Parser.mult_expr_return mult_expr() throws RecognitionException {
        RuleSet2Parser.mult_expr_return retval = new RuleSet2Parser.mult_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RuleSet2Parser.unary_expr_return me1 = null;

        RuleSet2Parser.mult_op_return op = null;

        RuleSet2Parser.unary_expr_return me2 = null;




        	boolean found_op = false;
        	ArrayList result = new ArrayList();

        try {
            // RuleSet2.g:429:2: (me1= unary_expr (op= mult_op me2= unary_expr )* )
            // RuleSet2.g:429:4: me1= unary_expr (op= mult_op me2= unary_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_unary_expr_in_mult_expr1318);
            me1=unary_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, me1.getTree());
            // RuleSet2.g:429:19: (op= mult_op me2= unary_expr )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=51 && LA17_0<=53)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // RuleSet2.g:429:20: op= mult_op me2= unary_expr
            	    {
            	    pushFollow(FOLLOW_mult_op_in_mult_expr1323);
            	    op=mult_op();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, op.getTree());
            	    pushFollow(FOLLOW_unary_expr_in_mult_expr1327);
            	    me2=unary_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, me2.getTree());
            	    if ( state.backtracking==0 ) {
            	      	
            	      		found_op = true;
            	      		if(result.isEmpty())
            	      		{
            	      			System.out.println("a oper " + (op!=null?input.toString(op.start,op.stop):null));
            	      			 add_to_expression(result,"prim",(op!=null?input.toString(op.start,op.stop):null),(me1!=null?me1.result:null));
            	      			 add_to_expression(result,"prim",(op!=null?input.toString(op.start,op.stop):null),(me2!=null?me2.result:null));
            	      		}
            	      		else
            	      		{
            	      			System.out.println("b oper " + (op!=null?input.toString(op.start,op.stop):null));
            	      			 add_to_expression(result,"prim",(op!=null?input.toString(op.start,op.stop):null),(me2!=null?me2.result:null));
            	      		}
            	      			 
            	      	
            	    }

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               
              		if(found_op)
              		{
              			puts("Result Cound = " + result.size());
              			retval.result = build_exp_result(result); 
              			}
              		else
              			retval.result = (me1!=null?me1.result:null);
               
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
    // $ANTLR end "mult_expr"

    public static class unary_expr_return extends ParserRuleReturnScope {
        public Object result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unary_expr"
    // RuleSet2.g:456:1: unary_expr returns [Object result] options {backtrack=true; } : ( 'not' unary_expr | 'seen' STRING 'in' var_domain ':' VAR timeframe | 'seen' STRING ( 'before' | 'after' ) STRING 'in' var_domain ':' VAR | var_domain ':' VAR predop expr timeframe | var_domain ':' VAR timeframe | oe= operator_expr );
    public final RuleSet2Parser.unary_expr_return unary_expr() throws RecognitionException {
        RuleSet2Parser.unary_expr_return retval = new RuleSet2Parser.unary_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal36=null;
        Token string_literal38=null;
        Token STRING39=null;
        Token string_literal40=null;
        Token char_literal42=null;
        Token VAR43=null;
        Token string_literal45=null;
        Token STRING46=null;
        Token set47=null;
        Token STRING48=null;
        Token string_literal49=null;
        Token char_literal51=null;
        Token VAR52=null;
        Token char_literal54=null;
        Token VAR55=null;
        Token char_literal60=null;
        Token VAR61=null;
        RuleSet2Parser.operator_expr_return oe = null;

        RuleSet2Parser.unary_expr_return unary_expr37 = null;

        RuleSet2Parser.var_domain_return var_domain41 = null;

        RuleSet2Parser.timeframe_return timeframe44 = null;

        RuleSet2Parser.var_domain_return var_domain50 = null;

        RuleSet2Parser.var_domain_return var_domain53 = null;

        RuleSet2Parser.predop_return predop56 = null;

        RuleSet2Parser.expr_return expr57 = null;

        RuleSet2Parser.timeframe_return timeframe58 = null;

        RuleSet2Parser.var_domain_return var_domain59 = null;

        RuleSet2Parser.timeframe_return timeframe62 = null;


        Object string_literal36_tree=null;
        Object string_literal38_tree=null;
        Object STRING39_tree=null;
        Object string_literal40_tree=null;
        Object char_literal42_tree=null;
        Object VAR43_tree=null;
        Object string_literal45_tree=null;
        Object STRING46_tree=null;
        Object set47_tree=null;
        Object STRING48_tree=null;
        Object string_literal49_tree=null;
        Object char_literal51_tree=null;
        Object VAR52_tree=null;
        Object char_literal54_tree=null;
        Object VAR55_tree=null;
        Object char_literal60_tree=null;
        Object VAR61_tree=null;

        try {
            // RuleSet2.g:457:2: ( 'not' unary_expr | 'seen' STRING 'in' var_domain ':' VAR timeframe | 'seen' STRING ( 'before' | 'after' ) STRING 'in' var_domain ':' VAR | var_domain ':' VAR predop expr timeframe | var_domain ':' VAR timeframe | oe= operator_expr )
            int alt18=6;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // RuleSet2.g:457:4: 'not' unary_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal36=(Token)match(input,54,FOLLOW_54_in_unary_expr1362); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal36_tree = (Object)adaptor.create(string_literal36);
                    adaptor.addChild(root_0, string_literal36_tree);
                    }
                    pushFollow(FOLLOW_unary_expr_in_unary_expr1364);
                    unary_expr37=unary_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expr37.getTree());

                    }
                    break;
                case 2 :
                    // RuleSet2.g:458:4: 'seen' STRING 'in' var_domain ':' VAR timeframe
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal38=(Token)match(input,55,FOLLOW_55_in_unary_expr1370); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal38_tree = (Object)adaptor.create(string_literal38);
                    adaptor.addChild(root_0, string_literal38_tree);
                    }
                    STRING39=(Token)match(input,STRING,FOLLOW_STRING_in_unary_expr1372); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING39_tree = (Object)adaptor.create(STRING39);
                    adaptor.addChild(root_0, STRING39_tree);
                    }
                    string_literal40=(Token)match(input,56,FOLLOW_56_in_unary_expr1374); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal40_tree = (Object)adaptor.create(string_literal40);
                    adaptor.addChild(root_0, string_literal40_tree);
                    }
                    pushFollow(FOLLOW_var_domain_in_unary_expr1376);
                    var_domain41=var_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, var_domain41.getTree());
                    char_literal42=(Token)match(input,35,FOLLOW_35_in_unary_expr1378); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal42_tree = (Object)adaptor.create(char_literal42);
                    adaptor.addChild(root_0, char_literal42_tree);
                    }
                    VAR43=(Token)match(input,VAR,FOLLOW_VAR_in_unary_expr1380); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VAR43_tree = (Object)adaptor.create(VAR43);
                    adaptor.addChild(root_0, VAR43_tree);
                    }
                    pushFollow(FOLLOW_timeframe_in_unary_expr1382);
                    timeframe44=timeframe();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeframe44.getTree());

                    }
                    break;
                case 3 :
                    // RuleSet2.g:459:4: 'seen' STRING ( 'before' | 'after' ) STRING 'in' var_domain ':' VAR
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal45=(Token)match(input,55,FOLLOW_55_in_unary_expr1388); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal45_tree = (Object)adaptor.create(string_literal45);
                    adaptor.addChild(root_0, string_literal45_tree);
                    }
                    STRING46=(Token)match(input,STRING,FOLLOW_STRING_in_unary_expr1390); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING46_tree = (Object)adaptor.create(STRING46);
                    adaptor.addChild(root_0, STRING46_tree);
                    }
                    set47=(Token)input.LT(1);
                    if ( (input.LA(1)>=57 && input.LA(1)<=58) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set47));
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    STRING48=(Token)match(input,STRING,FOLLOW_STRING_in_unary_expr1400); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING48_tree = (Object)adaptor.create(STRING48);
                    adaptor.addChild(root_0, STRING48_tree);
                    }
                    string_literal49=(Token)match(input,56,FOLLOW_56_in_unary_expr1402); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal49_tree = (Object)adaptor.create(string_literal49);
                    adaptor.addChild(root_0, string_literal49_tree);
                    }
                    pushFollow(FOLLOW_var_domain_in_unary_expr1404);
                    var_domain50=var_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, var_domain50.getTree());
                    char_literal51=(Token)match(input,35,FOLLOW_35_in_unary_expr1406); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal51_tree = (Object)adaptor.create(char_literal51);
                    adaptor.addChild(root_0, char_literal51_tree);
                    }
                    VAR52=(Token)match(input,VAR,FOLLOW_VAR_in_unary_expr1408); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VAR52_tree = (Object)adaptor.create(VAR52);
                    adaptor.addChild(root_0, VAR52_tree);
                    }

                    }
                    break;
                case 4 :
                    // RuleSet2.g:460:4: var_domain ':' VAR predop expr timeframe
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_var_domain_in_unary_expr1414);
                    var_domain53=var_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, var_domain53.getTree());
                    char_literal54=(Token)match(input,35,FOLLOW_35_in_unary_expr1416); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal54_tree = (Object)adaptor.create(char_literal54);
                    adaptor.addChild(root_0, char_literal54_tree);
                    }
                    VAR55=(Token)match(input,VAR,FOLLOW_VAR_in_unary_expr1418); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VAR55_tree = (Object)adaptor.create(VAR55);
                    adaptor.addChild(root_0, VAR55_tree);
                    }
                    pushFollow(FOLLOW_predop_in_unary_expr1420);
                    predop56=predop();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, predop56.getTree());
                    pushFollow(FOLLOW_expr_in_unary_expr1422);
                    expr57=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr57.getTree());
                    pushFollow(FOLLOW_timeframe_in_unary_expr1424);
                    timeframe58=timeframe();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeframe58.getTree());

                    }
                    break;
                case 5 :
                    // RuleSet2.g:461:4: var_domain ':' VAR timeframe
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_var_domain_in_unary_expr1430);
                    var_domain59=var_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, var_domain59.getTree());
                    char_literal60=(Token)match(input,35,FOLLOW_35_in_unary_expr1432); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal60_tree = (Object)adaptor.create(char_literal60);
                    adaptor.addChild(root_0, char_literal60_tree);
                    }
                    VAR61=(Token)match(input,VAR,FOLLOW_VAR_in_unary_expr1434); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VAR61_tree = (Object)adaptor.create(VAR61);
                    adaptor.addChild(root_0, VAR61_tree);
                    }
                    pushFollow(FOLLOW_timeframe_in_unary_expr1436);
                    timeframe62=timeframe();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeframe62.getTree());

                    }
                    break;
                case 6 :
                    // RuleSet2.g:462:4: oe= operator_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_operator_expr_in_unary_expr1444);
                    oe=operator_expr();

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
    // RuleSet2.g:466:1: operator_expr returns [Object result] : f= factor ( operator )* ;
    public final RuleSet2Parser.operator_expr_return operator_expr() throws RecognitionException {
        RuleSet2Parser.operator_expr_return retval = new RuleSet2Parser.operator_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RuleSet2Parser.factor_return f = null;

        RuleSet2Parser.operator_return operator63 = null;






        try {
            // RuleSet2.g:471:2: (f= factor ( operator )* )
            // RuleSet2.g:471:4: f= factor ( operator )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_factor_in_operator_expr1471);
            f=factor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            if ( state.backtracking==0 ) {
              retval.result = (f!=null?f.result:null);  
            }
            // RuleSet2.g:472:3: ( operator )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==59) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // RuleSet2.g:472:3: operator
            	    {
            	    pushFollow(FOLLOW_operator_in_operator_expr1477);
            	    operator63=operator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, operator63.getTree());

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
    // RuleSet2.g:475:1: operator : '.' operator_op '(' expr ( ',' )? ')' ;
    public final RuleSet2Parser.operator_return operator() throws RecognitionException {
        RuleSet2Parser.operator_return retval = new RuleSet2Parser.operator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal64=null;
        Token char_literal66=null;
        Token char_literal68=null;
        Token char_literal69=null;
        RuleSet2Parser.operator_op_return operator_op65 = null;

        RuleSet2Parser.expr_return expr67 = null;


        Object char_literal64_tree=null;
        Object char_literal66_tree=null;
        Object char_literal68_tree=null;
        Object char_literal69_tree=null;

        try {
            // RuleSet2.g:476:2: ( '.' operator_op '(' expr ( ',' )? ')' )
            // RuleSet2.g:476:4: '.' operator_op '(' expr ( ',' )? ')'
            {
            root_0 = (Object)adaptor.nil();

            char_literal64=(Token)match(input,59,FOLLOW_59_in_operator1491); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal64_tree = (Object)adaptor.create(char_literal64);
            adaptor.addChild(root_0, char_literal64_tree);
            }
            pushFollow(FOLLOW_operator_op_in_operator1493);
            operator_op65=operator_op();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, operator_op65.getTree());
            char_literal66=(Token)match(input,44,FOLLOW_44_in_operator1495); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal66_tree = (Object)adaptor.create(char_literal66);
            adaptor.addChild(root_0, char_literal66_tree);
            }
            pushFollow(FOLLOW_expr_in_operator1497);
            expr67=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr67.getTree());
            // RuleSet2.g:476:29: ( ',' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==45) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // RuleSet2.g:476:29: ','
                    {
                    char_literal68=(Token)match(input,45,FOLLOW_45_in_operator1499); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal68_tree = (Object)adaptor.create(char_literal68);
                    adaptor.addChild(root_0, char_literal68_tree);
                    }

                    }
                    break;

            }

            char_literal69=(Token)match(input,46,FOLLOW_46_in_operator1502); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal69_tree = (Object)adaptor.create(char_literal69);
            adaptor.addChild(root_0, char_literal69_tree);
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
    // RuleSet2.g:479:10: fragment operator_op : ( 'pick' | 'match' | 'length' | 'replace' | 'as' | 'head' | 'tail' | 'sort' | 'filter' | 'map' | 'uc' | 'lc' | 'split' | 'join' | 'query' | 'has' | 'union' | 'difference' | 'intersection' | 'unique' | 'once' | 'duplicates' );
    public final RuleSet2Parser.operator_op_return operator_op() throws RecognitionException {
        RuleSet2Parser.operator_op_return retval = new RuleSet2Parser.operator_op_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set70=null;

        Object set70_tree=null;

        try {
            // RuleSet2.g:480:2: ( 'pick' | 'match' | 'length' | 'replace' | 'as' | 'head' | 'tail' | 'sort' | 'filter' | 'map' | 'uc' | 'lc' | 'split' | 'join' | 'query' | 'has' | 'union' | 'difference' | 'intersection' | 'unique' | 'once' | 'duplicates' )
            // RuleSet2.g:
            {
            root_0 = (Object)adaptor.nil();

            set70=(Token)input.LT(1);
            if ( (input.LA(1)>=60 && input.LA(1)<=81) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set70));
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
    // RuleSet2.g:486:1: factor returns [Object result] options {backtrack=true; } : (v= INT | v= STRING | v= ( 'true' | 'false' ) | v= VAR '[' e= expr ']' | d= var_domain ':' v= VAR | 'current' d= var_domain ':' v= VAR | 'history' e= expr d= var_domain ':' v= VAR | n= namespace p= VAR '(' (e= expr ( ',' )? )* ')' | v= VAR '(' (e= expr ( ',' )? )* ')' | '[' e= expr ( ',' e2= expr )* ']' | '{' h1= hash_line ( ',' h2= hash_line )* '}' | v= VAR | '(' e= expr ')' );
    public final RuleSet2Parser.factor_return factor() throws RecognitionException {
        RuleSet2Parser.factor_return retval = new RuleSet2Parser.factor_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token v=null;
        Token p=null;
        Token char_literal71=null;
        Token char_literal72=null;
        Token char_literal73=null;
        Token string_literal74=null;
        Token char_literal75=null;
        Token string_literal76=null;
        Token char_literal77=null;
        Token char_literal78=null;
        Token char_literal79=null;
        Token char_literal80=null;
        Token char_literal81=null;
        Token char_literal82=null;
        Token char_literal83=null;
        Token char_literal84=null;
        Token char_literal85=null;
        Token char_literal86=null;
        Token char_literal87=null;
        Token char_literal88=null;
        Token char_literal89=null;
        Token char_literal90=null;
        Token char_literal91=null;
        RuleSet2Parser.expr_return e = null;

        RuleSet2Parser.var_domain_return d = null;

        RuleSet2Parser.namespace_return n = null;

        RuleSet2Parser.expr_return e2 = null;

        RuleSet2Parser.hash_line_return h1 = null;

        RuleSet2Parser.hash_line_return h2 = null;


        Object v_tree=null;
        Object p_tree=null;
        Object char_literal71_tree=null;
        Object char_literal72_tree=null;
        Object char_literal73_tree=null;
        Object string_literal74_tree=null;
        Object char_literal75_tree=null;
        Object string_literal76_tree=null;
        Object char_literal77_tree=null;
        Object char_literal78_tree=null;
        Object char_literal79_tree=null;
        Object char_literal80_tree=null;
        Object char_literal81_tree=null;
        Object char_literal82_tree=null;
        Object char_literal83_tree=null;
        Object char_literal84_tree=null;
        Object char_literal85_tree=null;
        Object char_literal86_tree=null;
        Object char_literal87_tree=null;
        Object char_literal88_tree=null;
        Object char_literal89_tree=null;
        Object char_literal90_tree=null;
        Object char_literal91_tree=null;


              ArrayList exprs2 = new ArrayList();


        try {
            // RuleSet2.g:491:2: (v= INT | v= STRING | v= ( 'true' | 'false' ) | v= VAR '[' e= expr ']' | d= var_domain ':' v= VAR | 'current' d= var_domain ':' v= VAR | 'history' e= expr d= var_domain ':' v= VAR | n= namespace p= VAR '(' (e= expr ( ',' )? )* ')' | v= VAR '(' (e= expr ( ',' )? )* ')' | '[' e= expr ( ',' e2= expr )* ']' | '{' h1= hash_line ( ',' h2= hash_line )* '}' | v= VAR | '(' e= expr ')' )
            int alt27=13;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // RuleSet2.g:491:4: v= INT
                    {
                    root_0 = (Object)adaptor.nil();

                    v=(Token)match(input,INT,FOLLOW_INT_in_factor1638); if (state.failed) return retval;
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
                    // RuleSet2.g:497:9: v= STRING
                    {
                    root_0 = (Object)adaptor.nil();

                    v=(Token)match(input,STRING,FOLLOW_STRING_in_factor1653); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    v_tree = (Object)adaptor.create(v);
                    adaptor.addChild(root_0, v_tree);
                    }
                    if ( state.backtracking==0 ) {
                       
                            		HashMap tmp = new HashMap();
                      		tmp.put("type","str");
                      		tmp.put("val",strip_string((v!=null?v.getText():null)));
                      		retval.result = tmp;
                      	
                    }

                    }
                    break;
                case 3 :
                    // RuleSet2.g:503:9: v= ( 'true' | 'false' )
                    {
                    root_0 = (Object)adaptor.nil();

                    v=(Token)input.LT(1);
                    if ( (input.LA(1)>=82 && input.LA(1)<=83) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(v));
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    if ( state.backtracking==0 ) {
                       
                            		HashMap tmp = new HashMap();
                      		tmp.put("type","bool");
                      		tmp.put("val",(v!=null?v.getText():null));
                      		retval.result = tmp;
                      	
                    }

                    }
                    break;
                case 4 :
                    // RuleSet2.g:509:9: v= VAR '[' e= expr ']'
                    {
                    root_0 = (Object)adaptor.nil();

                    v=(Token)match(input,VAR,FOLLOW_VAR_in_factor1693); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    v_tree = (Object)adaptor.create(v);
                    adaptor.addChild(root_0, v_tree);
                    }
                    char_literal71=(Token)match(input,84,FOLLOW_84_in_factor1695); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal71_tree = (Object)adaptor.create(char_literal71);
                    adaptor.addChild(root_0, char_literal71_tree);
                    }
                    pushFollow(FOLLOW_expr_in_factor1699);
                    e=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
                    char_literal72=(Token)match(input,85,FOLLOW_85_in_factor1701); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal72_tree = (Object)adaptor.create(char_literal72);
                    adaptor.addChild(root_0, char_literal72_tree);
                    }
                    if ( state.backtracking==0 ) {
                       
                            		HashMap tmp = new HashMap();
                      		HashMap val = new HashMap();

                      		HashMap index = new HashMap();
                      		index.putAll((HashMap)(e!=null?e.result:null));
                      		val.put("var_expr",(v!=null?v.getText():null));

                      		val.put("index",index);
                      		tmp.put("type","array_ref");

                      		tmp.put("val",val);
                      		retval.result = tmp;
                            
                    }

                    }
                    break;
                case 5 :
                    // RuleSet2.g:523:9: d= var_domain ':' v= VAR
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_var_domain_in_factor1716);
                    d=var_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, d.getTree());
                    char_literal73=(Token)match(input,35,FOLLOW_35_in_factor1718); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal73_tree = (Object)adaptor.create(char_literal73);
                    adaptor.addChild(root_0, char_literal73_tree);
                    }
                    v=(Token)match(input,VAR,FOLLOW_VAR_in_factor1722); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    v_tree = (Object)adaptor.create(v);
                    adaptor.addChild(root_0, v_tree);
                    }
                    if ( state.backtracking==0 ) {

                      	      	HashMap tmp = new HashMap();
                      	      	tmp.put("domain",(d!=null?input.toString(d.start,d.stop):null));
                      	      	tmp.put("name",(v!=null?v.getText():null));
                      	      	tmp.put("type","persistent");
                      	      	retval.result = tmp;
                            
                    }

                    }
                    break;
                case 6 :
                    // RuleSet2.g:530:9: 'current' d= var_domain ':' v= VAR
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal74=(Token)match(input,86,FOLLOW_86_in_factor1734); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal74_tree = (Object)adaptor.create(string_literal74);
                    adaptor.addChild(root_0, string_literal74_tree);
                    }
                    pushFollow(FOLLOW_var_domain_in_factor1738);
                    d=var_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, d.getTree());
                    char_literal75=(Token)match(input,35,FOLLOW_35_in_factor1740); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal75_tree = (Object)adaptor.create(char_literal75);
                    adaptor.addChild(root_0, char_literal75_tree);
                    }
                    v=(Token)match(input,VAR,FOLLOW_VAR_in_factor1744); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    v_tree = (Object)adaptor.create(v);
                    adaptor.addChild(root_0, v_tree);
                    }
                    if ( state.backtracking==0 ) {

                            	      	HashMap tmp = new HashMap();
                      	      	tmp.put("domain",(d!=null?input.toString(d.start,d.stop):null));
                      	      	tmp.put("name",(v!=null?v.getText():null));
                      	      	tmp.put("type","persistent");
                      	      	retval.result = tmp;
                            
                    }

                    }
                    break;
                case 7 :
                    // RuleSet2.g:537:9: 'history' e= expr d= var_domain ':' v= VAR
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal76=(Token)match(input,87,FOLLOW_87_in_factor1757); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal76_tree = (Object)adaptor.create(string_literal76);
                    adaptor.addChild(root_0, string_literal76_tree);
                    }
                    pushFollow(FOLLOW_expr_in_factor1761);
                    e=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
                    pushFollow(FOLLOW_var_domain_in_factor1765);
                    d=var_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, d.getTree());
                    char_literal77=(Token)match(input,35,FOLLOW_35_in_factor1767); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal77_tree = (Object)adaptor.create(char_literal77);
                    adaptor.addChild(root_0, char_literal77_tree);
                    }
                    v=(Token)match(input,VAR,FOLLOW_VAR_in_factor1771); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    v_tree = (Object)adaptor.create(v);
                    adaptor.addChild(root_0, v_tree);
                    }
                    if ( state.backtracking==0 ) {

                            	      	HashMap tmp = new HashMap();
                      	      	tmp.put("domain",(d!=null?input.toString(d.start,d.stop):null));
                      	      	tmp.put("name",(v!=null?v.getText():null));
                      	      	tmp.put("type","trail_history");
                            	      	HashMap tmp2 = new HashMap();
                      	      	tmp2.putAll((HashMap)(e!=null?e.result:null));
                      	      	tmp.put("offset",tmp2);
                      	      	retval.result = tmp;
                            
                    }

                    }
                    break;
                case 8 :
                    // RuleSet2.g:547:9: n= namespace p= VAR '(' (e= expr ( ',' )? )* ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_namespace_in_factor1785);
                    n=namespace();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, n.getTree());
                    p=(Token)match(input,VAR,FOLLOW_VAR_in_factor1789); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    p_tree = (Object)adaptor.create(p);
                    adaptor.addChild(root_0, p_tree);
                    }
                    char_literal78=(Token)match(input,44,FOLLOW_44_in_factor1791); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal78_tree = (Object)adaptor.create(char_literal78);
                    adaptor.addChild(root_0, char_literal78_tree);
                    }
                    // RuleSet2.g:547:31: (e= expr ( ',' )? )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( ((LA22_0>=VAR && LA22_0<=INT)||LA22_0==STRING||LA22_0==30||(LA22_0>=43 && LA22_0<=44)||(LA22_0>=54 && LA22_0<=55)||(LA22_0>=82 && LA22_0<=84)||(LA22_0>=86 && LA22_0<=89)) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // RuleSet2.g:547:32: e= expr ( ',' )?
                    	    {
                    	    pushFollow(FOLLOW_expr_in_factor1796);
                    	    e=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
                    	    if ( state.backtracking==0 ) {

                    	                  exprs2.add((e!=null?e.result:null));
                    	            	
                    	    }
                    	    // RuleSet2.g:550:8: ( ',' )?
                    	    int alt21=2;
                    	    int LA21_0 = input.LA(1);

                    	    if ( (LA21_0==45) ) {
                    	        alt21=1;
                    	    }
                    	    switch (alt21) {
                    	        case 1 :
                    	            // RuleSet2.g:550:8: ','
                    	            {
                    	            char_literal79=(Token)match(input,45,FOLLOW_45_in_factor1807); if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) {
                    	            char_literal79_tree = (Object)adaptor.create(char_literal79);
                    	            adaptor.addChild(root_0, char_literal79_tree);
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

                    char_literal80=(Token)match(input,46,FOLLOW_46_in_factor1812); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal80_tree = (Object)adaptor.create(char_literal80);
                    adaptor.addChild(root_0, char_literal80_tree);
                    }
                    if ( state.backtracking==0 ) {

                      	      	HashMap tmp = new HashMap();
                      	      	tmp.put("predicate",(p!=null?p.getText():null));
                      	      	tmp.put("source",(n!=null?input.toString(n.start,n.stop):null));
                      	      	tmp.put("args",exprs2);
                      	      	retval.result = tmp;
                            
                    }

                    }
                    break;
                case 9 :
                    // RuleSet2.g:557:9: v= VAR '(' (e= expr ( ',' )? )* ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    v=(Token)match(input,VAR,FOLLOW_VAR_in_factor1827); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    v_tree = (Object)adaptor.create(v);
                    adaptor.addChild(root_0, v_tree);
                    }
                    char_literal81=(Token)match(input,44,FOLLOW_44_in_factor1829); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal81_tree = (Object)adaptor.create(char_literal81);
                    adaptor.addChild(root_0, char_literal81_tree);
                    }
                    // RuleSet2.g:557:19: (e= expr ( ',' )? )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( ((LA24_0>=VAR && LA24_0<=INT)||LA24_0==STRING||LA24_0==30||(LA24_0>=43 && LA24_0<=44)||(LA24_0>=54 && LA24_0<=55)||(LA24_0>=82 && LA24_0<=84)||(LA24_0>=86 && LA24_0<=89)) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // RuleSet2.g:557:20: e= expr ( ',' )?
                    	    {
                    	    pushFollow(FOLLOW_expr_in_factor1834);
                    	    e=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
                    	    if ( state.backtracking==0 ) {

                    	                  exprs2.add((e!=null?e.result:null));
                    	            	
                    	    }
                    	    // RuleSet2.g:560:2: ( ',' )?
                    	    int alt23=2;
                    	    int LA23_0 = input.LA(1);

                    	    if ( (LA23_0==45) ) {
                    	        alt23=1;
                    	    }
                    	    switch (alt23) {
                    	        case 1 :
                    	            // RuleSet2.g:560:2: ','
                    	            {
                    	            char_literal82=(Token)match(input,45,FOLLOW_45_in_factor1838); if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) {
                    	            char_literal82_tree = (Object)adaptor.create(char_literal82);
                    	            adaptor.addChild(root_0, char_literal82_tree);
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    char_literal83=(Token)match(input,46,FOLLOW_46_in_factor1843); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal83_tree = (Object)adaptor.create(char_literal83);
                    adaptor.addChild(root_0, char_literal83_tree);
                    }
                    if ( state.backtracking==0 ) {

                      	      	HashMap tmp = new HashMap();
                      	      	tmp.put("type","app");
                      	      	HashMap tmp2 = new HashMap();
                      	      	tmp2.put("val",(v!=null?v.getText():null));
                      	      	tmp2.put("type","var");
                      	      	tmp.put("function_expr",tmp2);
                      	      	tmp.put("args",exprs2);
                      	      	retval.result = tmp;
                            
                            
                    }

                    }
                    break;
                case 10 :
                    // RuleSet2.g:571:9: '[' e= expr ( ',' e2= expr )* ']'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal84=(Token)match(input,84,FOLLOW_84_in_factor1855); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal84_tree = (Object)adaptor.create(char_literal84);
                    adaptor.addChild(root_0, char_literal84_tree);
                    }
                    pushFollow(FOLLOW_expr_in_factor1859);
                    e=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
                    if ( state.backtracking==0 ) {

                            			exprs2.add((e!=null?e.result:null));
                            		 
                    }
                    // RuleSet2.g:573:12: ( ',' e2= expr )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==45) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // RuleSet2.g:573:13: ',' e2= expr
                    	    {
                    	    char_literal85=(Token)match(input,45,FOLLOW_45_in_factor1864); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal85_tree = (Object)adaptor.create(char_literal85);
                    	    adaptor.addChild(root_0, char_literal85_tree);
                    	    }
                    	    pushFollow(FOLLOW_expr_in_factor1868);
                    	    e2=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, e2.getTree());
                    	    if ( state.backtracking==0 ) {

                    	            			exprs2.add((e2!=null?e2.result:null));
                    	            		 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    char_literal86=(Token)match(input,85,FOLLOW_85_in_factor1873); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal86_tree = (Object)adaptor.create(char_literal86);
                    adaptor.addChild(root_0, char_literal86_tree);
                    }
                    if ( state.backtracking==0 ) {

                            			HashMap tmp = new HashMap();
                            			tmp.put("val",exprs2);	
                            			tmp.put("type","array");
                            		 
                      	      	retval.result = tmp;
                            
                    }

                    }
                    break;
                case 11 :
                    // RuleSet2.g:582:9: '{' h1= hash_line ( ',' h2= hash_line )* '}'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal87=(Token)match(input,30,FOLLOW_30_in_factor1885); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal87_tree = (Object)adaptor.create(char_literal87);
                    adaptor.addChild(root_0, char_literal87_tree);
                    }
                    pushFollow(FOLLOW_hash_line_in_factor1889);
                    h1=hash_line();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, h1.getTree());
                    if ( state.backtracking==0 ) {

                            			exprs2.add((h1!=null?h1.result:null));
                            		 
                    }
                    // RuleSet2.g:584:12: ( ',' h2= hash_line )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==45) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // RuleSet2.g:584:13: ',' h2= hash_line
                    	    {
                    	    char_literal88=(Token)match(input,45,FOLLOW_45_in_factor1894); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal88_tree = (Object)adaptor.create(char_literal88);
                    	    adaptor.addChild(root_0, char_literal88_tree);
                    	    }
                    	    pushFollow(FOLLOW_hash_line_in_factor1898);
                    	    h2=hash_line();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, h2.getTree());
                    	    if ( state.backtracking==0 ) {

                    	            			exprs2.add((h2!=null?h2.result:null));
                    	            		 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    char_literal89=(Token)match(input,31,FOLLOW_31_in_factor1904); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal89_tree = (Object)adaptor.create(char_literal89);
                    adaptor.addChild(root_0, char_literal89_tree);
                    }
                    if ( state.backtracking==0 ) {

                            			HashMap tmp = new HashMap();
                            			tmp.put("val",exprs2);	
                            			tmp.put("type","hashraw");
                            		 
                      	      	retval.result = tmp;
                      	
                    }

                    }
                    break;
                case 12 :
                    // RuleSet2.g:593:9: v= VAR
                    {
                    root_0 = (Object)adaptor.nil();

                    v=(Token)match(input,VAR,FOLLOW_VAR_in_factor1918); if (state.failed) return retval;
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
                case 13 :
                    // RuleSet2.g:599:9: '(' e= expr ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal90=(Token)match(input,44,FOLLOW_44_in_factor1931); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal90_tree = (Object)adaptor.create(char_literal90);
                    adaptor.addChild(root_0, char_literal90_tree);
                    }
                    pushFollow(FOLLOW_expr_in_factor1935);
                    e=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
                    char_literal91=(Token)match(input,46,FOLLOW_46_in_factor1937); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal91_tree = (Object)adaptor.create(char_literal91);
                    adaptor.addChild(root_0, char_literal91_tree);
                    }
                    if ( state.backtracking==0 ) {
                       
                            		retval.result =(e!=null?e.result:null); 
                            	
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
    // RuleSet2.g:603:10: fragment var_domain : ( 'ent' | 'app' );
    public final RuleSet2Parser.var_domain_return var_domain() throws RecognitionException {
        RuleSet2Parser.var_domain_return retval = new RuleSet2Parser.var_domain_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set92=null;

        Object set92_tree=null;

        try {
            // RuleSet2.g:603:20: ( 'ent' | 'app' )
            // RuleSet2.g:
            {
            root_0 = (Object)adaptor.nil();

            set92=(Token)input.LT(1);
            if ( (input.LA(1)>=88 && input.LA(1)<=89) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set92));
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

    public static class namespace_return extends ParserRuleReturnScope {
        public String result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "namespace"
    // RuleSet2.g:608:10: fragment namespace returns [String result] : v= VAR ':' ;
    public final RuleSet2Parser.namespace_return namespace() throws RecognitionException {
        RuleSet2Parser.namespace_return retval = new RuleSet2Parser.namespace_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token v=null;
        Token char_literal93=null;

        Object v_tree=null;
        Object char_literal93_tree=null;

        try {
            // RuleSet2.g:609:2: (v= VAR ':' )
            // RuleSet2.g:609:4: v= VAR ':'
            {
            root_0 = (Object)adaptor.nil();

            v=(Token)match(input,VAR,FOLLOW_VAR_in_namespace1980); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            v_tree = (Object)adaptor.create(v);
            adaptor.addChild(root_0, v_tree);
            }
            char_literal93=(Token)match(input,35,FOLLOW_35_in_namespace1982); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal93_tree = (Object)adaptor.create(char_literal93);
            adaptor.addChild(root_0, char_literal93_tree);
            }
            if ( state.backtracking==0 ) {

              		retval.result = (v!=null?v.getText():null);
              	
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

    public static class timeframe_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "timeframe"
    // RuleSet2.g:616:1: timeframe : 'within' expr ( period ) ;
    public final RuleSet2Parser.timeframe_return timeframe() throws RecognitionException {
        RuleSet2Parser.timeframe_return retval = new RuleSet2Parser.timeframe_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal94=null;
        RuleSet2Parser.expr_return expr95 = null;

        RuleSet2Parser.period_return period96 = null;


        Object string_literal94_tree=null;

        try {
            // RuleSet2.g:617:2: ( 'within' expr ( period ) )
            // RuleSet2.g:617:5: 'within' expr ( period )
            {
            root_0 = (Object)adaptor.nil();

            string_literal94=(Token)match(input,90,FOLLOW_90_in_timeframe2001); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal94_tree = (Object)adaptor.create(string_literal94);
            adaptor.addChild(root_0, string_literal94_tree);
            }
            pushFollow(FOLLOW_expr_in_timeframe2003);
            expr95=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr95.getTree());
            // RuleSet2.g:617:19: ( period )
            // RuleSet2.g:617:21: period
            {
            pushFollow(FOLLOW_period_in_timeframe2007);
            period96=period();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, period96.getTree());

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
        public HashMap result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "hash_line"
    // RuleSet2.g:620:1: hash_line returns [HashMap result] : s= STRING ':' e= expr ;
    public final RuleSet2Parser.hash_line_return hash_line() throws RecognitionException {
        RuleSet2Parser.hash_line_return retval = new RuleSet2Parser.hash_line_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token s=null;
        Token char_literal97=null;
        RuleSet2Parser.expr_return e = null;


        Object s_tree=null;
        Object char_literal97_tree=null;

        try {
            // RuleSet2.g:621:2: (s= STRING ':' e= expr )
            // RuleSet2.g:621:4: s= STRING ':' e= expr
            {
            root_0 = (Object)adaptor.nil();

            s=(Token)match(input,STRING,FOLLOW_STRING_in_hash_line2029); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            s_tree = (Object)adaptor.create(s);
            adaptor.addChild(root_0, s_tree);
            }
            char_literal97=(Token)match(input,35,FOLLOW_35_in_hash_line2031); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal97_tree = (Object)adaptor.create(char_literal97);
            adaptor.addChild(root_0, char_literal97_tree);
            }
            pushFollow(FOLLOW_expr_in_hash_line2035);
            e=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
            if ( state.backtracking==0 ) {

              		HashMap tmp = new HashMap();
              		tmp.put("lhs",strip_string((s!=null?s.getText():null)));
              		tmp.put("rhs",(e!=null?e.result:null));
              //		tmp.put("val",(e!=null?e.result:null));
              		retval.result = tmp;
              	
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
    // $ANTLR end "hash_line"

    public static class css_emit_return extends ParserRuleReturnScope {
        public String emit_value;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "css_emit"
    // RuleSet2.g:630:1: css_emit returns [String emit_value] : 'css' (h= HTML | h= STRING ) ;
    public final RuleSet2Parser.css_emit_return css_emit() throws RecognitionException {
        RuleSet2Parser.css_emit_return retval = new RuleSet2Parser.css_emit_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token h=null;
        Token string_literal98=null;

        Object h_tree=null;
        Object string_literal98_tree=null;

        try {
            // RuleSet2.g:631:2: ( 'css' (h= HTML | h= STRING ) )
            // RuleSet2.g:631:4: 'css' (h= HTML | h= STRING )
            {
            root_0 = (Object)adaptor.nil();

            string_literal98=(Token)match(input,91,FOLLOW_91_in_css_emit2053); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal98_tree = (Object)adaptor.create(string_literal98);
            adaptor.addChild(root_0, string_literal98_tree);
            }
            // RuleSet2.g:631:10: (h= HTML | h= STRING )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==HTML) ) {
                alt28=1;
            }
            else if ( (LA28_0==STRING) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // RuleSet2.g:631:12: h= HTML
                    {
                    h=(Token)match(input,HTML,FOLLOW_HTML_in_css_emit2059); if (state.failed) return retval;
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
                    // RuleSet2.g:632:3: h= STRING
                    {
                    h=(Token)match(input,STRING,FOLLOW_STRING_in_css_emit2067); if (state.failed) return retval;
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
    // RuleSet2.g:636:10: fragment period : ( 'years' | 'months' | 'weeks' | 'days' | 'hours' | 'minutes' | 'seconds' | 'year' | 'month' | 'week' | 'day' | 'hour' | 'minute' | 'second' );
    public final RuleSet2Parser.period_return period() throws RecognitionException {
        RuleSet2Parser.period_return retval = new RuleSet2Parser.period_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set99=null;

        Object set99_tree=null;

        try {
            // RuleSet2.g:637:2: ( 'years' | 'months' | 'weeks' | 'days' | 'hours' | 'minutes' | 'seconds' | 'year' | 'month' | 'week' | 'day' | 'hour' | 'minute' | 'second' )
            // RuleSet2.g:
            {
            root_0 = (Object)adaptor.nil();

            set99=(Token)input.LT(1);
            if ( (input.LA(1)>=92 && input.LA(1)<=105) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set99));
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
    // RuleSet2.g:655:1: cachable returns [Object what] : ca= 'cachable' ( 'for' tm= INT per= period )? ;
    public final RuleSet2Parser.cachable_return cachable() throws RecognitionException {
        RuleSet2Parser.cachable_return retval = new RuleSet2Parser.cachable_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ca=null;
        Token tm=null;
        Token string_literal100=null;
        RuleSet2Parser.period_return per = null;


        Object ca_tree=null;
        Object tm_tree=null;
        Object string_literal100_tree=null;


        	retval.what = null;

        try {
            // RuleSet2.g:659:2: (ca= 'cachable' ( 'for' tm= INT per= period )? )
            // RuleSet2.g:660:3: ca= 'cachable' ( 'for' tm= INT per= period )?
            {
            root_0 = (Object)adaptor.nil();

            ca=(Token)match(input,106,FOLLOW_106_in_cachable2207); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ca_tree = (Object)adaptor.create(ca);
            adaptor.addChild(root_0, ca_tree);
            }
            // RuleSet2.g:660:17: ( 'for' tm= INT per= period )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==107) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // RuleSet2.g:660:18: 'for' tm= INT per= period
                    {
                    string_literal100=(Token)match(input,107,FOLLOW_107_in_cachable2210); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal100_tree = (Object)adaptor.create(string_literal100);
                    adaptor.addChild(root_0, string_literal100_tree);
                    }
                    tm=(Token)match(input,INT,FOLLOW_INT_in_cachable2214); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    tm_tree = (Object)adaptor.create(tm);
                    adaptor.addChild(root_0, tm_tree);
                    }
                    pushFollow(FOLLOW_period_in_cachable2218);
                    per=period();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, per.getTree());

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

               			if((tm!=null?tm.getText():null) != null)
               			{
              	 			retval.what = new HashMap();
              	 			((HashMap)retval.what).put("value",(tm!=null?tm.getText():null));
              	 			((HashMap)retval.what).put("period",(per!=null?input.toString(per.start,per.stop):null));	 			
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
    // RuleSet2.g:680:1: emit_block returns [String emit_value] : 'emit' (h= HTML | h= STRING | h= JS ) ;
    public final RuleSet2Parser.emit_block_return emit_block() throws RecognitionException {
        RuleSet2Parser.emit_block_return retval = new RuleSet2Parser.emit_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token h=null;
        Token string_literal101=null;

        Object h_tree=null;
        Object string_literal101_tree=null;

        try {
            // RuleSet2.g:681:2: ( 'emit' (h= HTML | h= STRING | h= JS ) )
            // RuleSet2.g:681:4: 'emit' (h= HTML | h= STRING | h= JS )
            {
            root_0 = (Object)adaptor.nil();

            string_literal101=(Token)match(input,108,FOLLOW_108_in_emit_block2242); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal101_tree = (Object)adaptor.create(string_literal101);
            adaptor.addChild(root_0, string_literal101_tree);
            }
            // RuleSet2.g:681:11: (h= HTML | h= STRING | h= JS )
            int alt30=3;
            switch ( input.LA(1) ) {
            case HTML:
                {
                alt30=1;
                }
                break;
            case STRING:
                {
                alt30=2;
                }
                break;
            case JS:
                {
                alt30=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // RuleSet2.g:681:13: h= HTML
                    {
                    h=(Token)match(input,HTML,FOLLOW_HTML_in_emit_block2248); if (state.failed) return retval;
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
                    // RuleSet2.g:682:3: h= STRING
                    {
                    h=(Token)match(input,STRING,FOLLOW_STRING_in_emit_block2256); if (state.failed) return retval;
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
                    // RuleSet2.g:683:3: h= JS
                    {
                    h=(Token)match(input,JS,FOLLOW_JS_in_emit_block2264); if (state.failed) return retval;
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
    // RuleSet2.g:687:1: meta_block : 'meta' '{' ( 'description' desc= ( HTML | STRING ) | 'name' thename= STRING | 'author' author= STRING | 'key' what= ( 'errorstack' | 'googleanalytics' | 'twitter' | 'amazon' | 'kpds' | 'google' | VAR ) (key_value= STRING | '{' ( name_value_pair[key_values] ( ',' name_value_pair[key_values] )* ) '}' )+ | 'authz' 'require' 'user' | 'logging' ( 'on' | 'off' ) | 'use' 'module' name= VAR ( 'alias' alias= VAR )? | 'use' rtype= ( 'css' | 'javascript' ) 'resource' (url= STRING | name= VAR ) )* '}' ;
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
        Token string_literal102=null;
        Token char_literal103=null;
        Token string_literal104=null;
        Token string_literal105=null;
        Token string_literal106=null;
        Token string_literal107=null;
        Token char_literal108=null;
        Token char_literal110=null;
        Token char_literal112=null;
        Token string_literal113=null;
        Token string_literal114=null;
        Token string_literal115=null;
        Token string_literal116=null;
        Token set117=null;
        Token string_literal118=null;
        Token string_literal119=null;
        Token string_literal120=null;
        Token string_literal121=null;
        Token string_literal122=null;
        Token char_literal123=null;
        RuleSet2Parser.name_value_pair_return name_value_pair109 = null;

        RuleSet2Parser.name_value_pair_return name_value_pair111 = null;


        Object desc_tree=null;
        Object thename_tree=null;
        Object author_tree=null;
        Object what_tree=null;
        Object key_value_tree=null;
        Object name_tree=null;
        Object alias_tree=null;
        Object rtype_tree=null;
        Object url_tree=null;
        Object string_literal102_tree=null;
        Object char_literal103_tree=null;
        Object string_literal104_tree=null;
        Object string_literal105_tree=null;
        Object string_literal106_tree=null;
        Object string_literal107_tree=null;
        Object char_literal108_tree=null;
        Object char_literal110_tree=null;
        Object char_literal112_tree=null;
        Object string_literal113_tree=null;
        Object string_literal114_tree=null;
        Object string_literal115_tree=null;
        Object string_literal116_tree=null;
        Object set117_tree=null;
        Object string_literal118_tree=null;
        Object string_literal119_tree=null;
        Object string_literal120_tree=null;
        Object string_literal121_tree=null;
        Object string_literal122_tree=null;
        Object char_literal123_tree=null;


        	 HashMap meta_block_hash = (HashMap)rule_json.get("meta");
        	 ArrayList use_list = new ArrayList();
        	 HashMap keys_map = new HashMap();
        	 HashMap key_values = new HashMap();

        try {
            // RuleSet2.g:704:2: ( 'meta' '{' ( 'description' desc= ( HTML | STRING ) | 'name' thename= STRING | 'author' author= STRING | 'key' what= ( 'errorstack' | 'googleanalytics' | 'twitter' | 'amazon' | 'kpds' | 'google' | VAR ) (key_value= STRING | '{' ( name_value_pair[key_values] ( ',' name_value_pair[key_values] )* ) '}' )+ | 'authz' 'require' 'user' | 'logging' ( 'on' | 'off' ) | 'use' 'module' name= VAR ( 'alias' alias= VAR )? | 'use' rtype= ( 'css' | 'javascript' ) 'resource' (url= STRING | name= VAR ) )* '}' )
            // RuleSet2.g:704:4: 'meta' '{' ( 'description' desc= ( HTML | STRING ) | 'name' thename= STRING | 'author' author= STRING | 'key' what= ( 'errorstack' | 'googleanalytics' | 'twitter' | 'amazon' | 'kpds' | 'google' | VAR ) (key_value= STRING | '{' ( name_value_pair[key_values] ( ',' name_value_pair[key_values] )* ) '}' )+ | 'authz' 'require' 'user' | 'logging' ( 'on' | 'off' ) | 'use' 'module' name= VAR ( 'alias' alias= VAR )? | 'use' rtype= ( 'css' | 'javascript' ) 'resource' (url= STRING | name= VAR ) )* '}'
            {
            root_0 = (Object)adaptor.nil();

            string_literal102=(Token)match(input,109,FOLLOW_109_in_meta_block2296); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal102_tree = (Object)adaptor.create(string_literal102);
            adaptor.addChild(root_0, string_literal102_tree);
            }
            char_literal103=(Token)match(input,30,FOLLOW_30_in_meta_block2298); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal103_tree = (Object)adaptor.create(char_literal103);
            adaptor.addChild(root_0, char_literal103_tree);
            }
            // RuleSet2.g:705:2: ( 'description' desc= ( HTML | STRING ) | 'name' thename= STRING | 'author' author= STRING | 'key' what= ( 'errorstack' | 'googleanalytics' | 'twitter' | 'amazon' | 'kpds' | 'google' | VAR ) (key_value= STRING | '{' ( name_value_pair[key_values] ( ',' name_value_pair[key_values] )* ) '}' )+ | 'authz' 'require' 'user' | 'logging' ( 'on' | 'off' ) | 'use' 'module' name= VAR ( 'alias' alias= VAR )? | 'use' rtype= ( 'css' | 'javascript' ) 'resource' (url= STRING | name= VAR ) )*
            loop35:
            do {
                int alt35=9;
                alt35 = dfa35.predict(input);
                switch (alt35) {
            	case 1 :
            	    // RuleSet2.g:705:4: 'description' desc= ( HTML | STRING )
            	    {
            	    string_literal104=(Token)match(input,110,FOLLOW_110_in_meta_block2304); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal104_tree = (Object)adaptor.create(string_literal104);
            	    adaptor.addChild(root_0, string_literal104_tree);
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
            	    // RuleSet2.g:706:5: 'name' thename= STRING
            	    {
            	    string_literal105=(Token)match(input,111,FOLLOW_111_in_meta_block2322); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal105_tree = (Object)adaptor.create(string_literal105);
            	    adaptor.addChild(root_0, string_literal105_tree);
            	    }
            	    thename=(Token)match(input,STRING,FOLLOW_STRING_in_meta_block2326); if (state.failed) return retval;
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
            	    // RuleSet2.g:707:5: 'author' author= STRING
            	    {
            	    string_literal106=(Token)match(input,112,FOLLOW_112_in_meta_block2336); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal106_tree = (Object)adaptor.create(string_literal106);
            	    adaptor.addChild(root_0, string_literal106_tree);
            	    }
            	    author=(Token)match(input,STRING,FOLLOW_STRING_in_meta_block2340); if (state.failed) return retval;
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
            	    // RuleSet2.g:708:5: 'key' what= ( 'errorstack' | 'googleanalytics' | 'twitter' | 'amazon' | 'kpds' | 'google' | VAR ) (key_value= STRING | '{' ( name_value_pair[key_values] ( ',' name_value_pair[key_values] )* ) '}' )+
            	    {
            	    string_literal107=(Token)match(input,113,FOLLOW_113_in_meta_block2352); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal107_tree = (Object)adaptor.create(string_literal107);
            	    adaptor.addChild(root_0, string_literal107_tree);
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

            	    // RuleSet2.g:708:91: (key_value= STRING | '{' ( name_value_pair[key_values] ( ',' name_value_pair[key_values] )* ) '}' )+
            	    int cnt32=0;
            	    loop32:
            	    do {
            	        int alt32=3;
            	        int LA32_0 = input.LA(1);

            	        if ( (LA32_0==STRING) ) {
            	            alt32=1;
            	        }
            	        else if ( (LA32_0==30) ) {
            	            alt32=2;
            	        }


            	        switch (alt32) {
            	    	case 1 :
            	    	    // RuleSet2.g:708:92: key_value= STRING
            	    	    {
            	    	    key_value=(Token)match(input,STRING,FOLLOW_STRING_in_meta_block2378); if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) {
            	    	    key_value_tree = (Object)adaptor.create(key_value);
            	    	    adaptor.addChild(root_0, key_value_tree);
            	    	    }

            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // RuleSet2.g:708:111: '{' ( name_value_pair[key_values] ( ',' name_value_pair[key_values] )* ) '}'
            	    	    {
            	    	    char_literal108=(Token)match(input,30,FOLLOW_30_in_meta_block2382); if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) {
            	    	    char_literal108_tree = (Object)adaptor.create(char_literal108);
            	    	    adaptor.addChild(root_0, char_literal108_tree);
            	    	    }
            	    	    // RuleSet2.g:708:115: ( name_value_pair[key_values] ( ',' name_value_pair[key_values] )* )
            	    	    // RuleSet2.g:708:116: name_value_pair[key_values] ( ',' name_value_pair[key_values] )*
            	    	    {
            	    	    pushFollow(FOLLOW_name_value_pair_in_meta_block2385);
            	    	    name_value_pair109=name_value_pair(key_values);

            	    	    state._fsp--;
            	    	    if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, name_value_pair109.getTree());
            	    	    // RuleSet2.g:708:144: ( ',' name_value_pair[key_values] )*
            	    	    loop31:
            	    	    do {
            	    	        int alt31=2;
            	    	        int LA31_0 = input.LA(1);

            	    	        if ( (LA31_0==45) ) {
            	    	            alt31=1;
            	    	        }


            	    	        switch (alt31) {
            	    	    	case 1 :
            	    	    	    // RuleSet2.g:708:145: ',' name_value_pair[key_values]
            	    	    	    {
            	    	    	    char_literal110=(Token)match(input,45,FOLLOW_45_in_meta_block2389); if (state.failed) return retval;
            	    	    	    if ( state.backtracking==0 ) {
            	    	    	    char_literal110_tree = (Object)adaptor.create(char_literal110);
            	    	    	    adaptor.addChild(root_0, char_literal110_tree);
            	    	    	    }
            	    	    	    pushFollow(FOLLOW_name_value_pair_in_meta_block2391);
            	    	    	    name_value_pair111=name_value_pair(key_values);

            	    	    	    state._fsp--;
            	    	    	    if (state.failed) return retval;
            	    	    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, name_value_pair111.getTree());

            	    	    	    }
            	    	    	    break;

            	    	    	default :
            	    	    	    break loop31;
            	    	        }
            	    	    } while (true);


            	    	    }

            	    	    char_literal112=(Token)match(input,31,FOLLOW_31_in_meta_block2397); if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) {
            	    	    char_literal112_tree = (Object)adaptor.create(char_literal112);
            	    	    adaptor.addChild(root_0, char_literal112_tree);
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt32 >= 1 ) break loop32;
            	    	    if (state.backtracking>0) {state.failed=true; return retval;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(32, input);
            	                throw eee;
            	        }
            	        cnt32++;
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
            	    // RuleSet2.g:714:4: 'authz' 'require' 'user'
            	    {
            	    string_literal113=(Token)match(input,120,FOLLOW_120_in_meta_block2409); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal113_tree = (Object)adaptor.create(string_literal113);
            	    adaptor.addChild(root_0, string_literal113_tree);
            	    }
            	    string_literal114=(Token)match(input,121,FOLLOW_121_in_meta_block2411); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal114_tree = (Object)adaptor.create(string_literal114);
            	    adaptor.addChild(root_0, string_literal114_tree);
            	    }
            	    string_literal115=(Token)match(input,122,FOLLOW_122_in_meta_block2413); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal115_tree = (Object)adaptor.create(string_literal115);
            	    adaptor.addChild(root_0, string_literal115_tree);
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
            	    // RuleSet2.g:720:4: 'logging' ( 'on' | 'off' )
            	    {
            	    string_literal116=(Token)match(input,123,FOLLOW_123_in_meta_block2420); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal116_tree = (Object)adaptor.create(string_literal116);
            	    adaptor.addChild(root_0, string_literal116_tree);
            	    }
            	    set117=(Token)input.LT(1);
            	    if ( (input.LA(1)>=124 && input.LA(1)<=125) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set117));
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
            	    // RuleSet2.g:721:4: 'use' 'module' name= VAR ( 'alias' alias= VAR )?
            	    {
            	    string_literal118=(Token)match(input,126,FOLLOW_126_in_meta_block2433); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal118_tree = (Object)adaptor.create(string_literal118);
            	    adaptor.addChild(root_0, string_literal118_tree);
            	    }
            	    string_literal119=(Token)match(input,127,FOLLOW_127_in_meta_block2435); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal119_tree = (Object)adaptor.create(string_literal119);
            	    adaptor.addChild(root_0, string_literal119_tree);
            	    }
            	    name=(Token)match(input,VAR,FOLLOW_VAR_in_meta_block2439); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    name_tree = (Object)adaptor.create(name);
            	    adaptor.addChild(root_0, name_tree);
            	    }
            	    // RuleSet2.g:721:28: ( 'alias' alias= VAR )?
            	    int alt33=2;
            	    int LA33_0 = input.LA(1);

            	    if ( (LA33_0==128) ) {
            	        alt33=1;
            	    }
            	    switch (alt33) {
            	        case 1 :
            	            // RuleSet2.g:721:29: 'alias' alias= VAR
            	            {
            	            string_literal120=(Token)match(input,128,FOLLOW_128_in_meta_block2442); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal120_tree = (Object)adaptor.create(string_literal120);
            	            adaptor.addChild(root_0, string_literal120_tree);
            	            }
            	            alias=(Token)match(input,VAR,FOLLOW_VAR_in_meta_block2446); if (state.failed) return retval;
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
            	    // RuleSet2.g:730:4: 'use' rtype= ( 'css' | 'javascript' ) 'resource' (url= STRING | name= VAR )
            	    {
            	    string_literal121=(Token)match(input,126,FOLLOW_126_in_meta_block2455); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal121_tree = (Object)adaptor.create(string_literal121);
            	    adaptor.addChild(root_0, string_literal121_tree);
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

            	    string_literal122=(Token)match(input,130,FOLLOW_130_in_meta_block2467); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal122_tree = (Object)adaptor.create(string_literal122);
            	    adaptor.addChild(root_0, string_literal122_tree);
            	    }
            	    // RuleSet2.g:730:50: (url= STRING | name= VAR )
            	    int alt34=2;
            	    int LA34_0 = input.LA(1);

            	    if ( (LA34_0==STRING) ) {
            	        alt34=1;
            	    }
            	    else if ( (LA34_0==VAR) ) {
            	        alt34=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 34, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt34) {
            	        case 1 :
            	            // RuleSet2.g:730:51: url= STRING
            	            {
            	            url=(Token)match(input,STRING,FOLLOW_STRING_in_meta_block2472); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            url_tree = (Object)adaptor.create(url);
            	            adaptor.addChild(root_0, url_tree);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // RuleSet2.g:730:64: name= VAR
            	            {
            	            name=(Token)match(input,VAR,FOLLOW_VAR_in_meta_block2478); if (state.failed) return retval;
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
            	    break loop35;
                }
            } while (true);

            char_literal123=(Token)match(input,31,FOLLOW_31_in_meta_block2491); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal123_tree = (Object)adaptor.create(char_literal123);
            adaptor.addChild(root_0, char_literal123_tree);
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
    // RuleSet2.g:755:1: dispatch_block : 'dispatch' '{' ( 'domain' domain= STRING ( '->' rsid= STRING )? )* '}' ;
    public final RuleSet2Parser.dispatch_block_return dispatch_block() throws RecognitionException {
        RuleSet2Parser.dispatch_block_return retval = new RuleSet2Parser.dispatch_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token domain=null;
        Token rsid=null;
        Token string_literal124=null;
        Token char_literal125=null;
        Token string_literal126=null;
        Token string_literal127=null;
        Token char_literal128=null;

        Object domain_tree=null;
        Object rsid_tree=null;
        Object string_literal124_tree=null;
        Object char_literal125_tree=null;
        Object string_literal126_tree=null;
        Object string_literal127_tree=null;
        Object char_literal128_tree=null;


        	 ArrayList dispatch_block_array = (ArrayList)rule_json.get("dispatch");

        try {
            // RuleSet2.g:761:2: ( 'dispatch' '{' ( 'domain' domain= STRING ( '->' rsid= STRING )? )* '}' )
            // RuleSet2.g:761:4: 'dispatch' '{' ( 'domain' domain= STRING ( '->' rsid= STRING )? )* '}'
            {
            root_0 = (Object)adaptor.nil();

            string_literal124=(Token)match(input,131,FOLLOW_131_in_dispatch_block2522); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal124_tree = (Object)adaptor.create(string_literal124);
            adaptor.addChild(root_0, string_literal124_tree);
            }
            char_literal125=(Token)match(input,30,FOLLOW_30_in_dispatch_block2524); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal125_tree = (Object)adaptor.create(char_literal125);
            adaptor.addChild(root_0, char_literal125_tree);
            }
            // RuleSet2.g:761:19: ( 'domain' domain= STRING ( '->' rsid= STRING )? )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==132) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // RuleSet2.g:761:20: 'domain' domain= STRING ( '->' rsid= STRING )?
            	    {
            	    string_literal126=(Token)match(input,132,FOLLOW_132_in_dispatch_block2527); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal126_tree = (Object)adaptor.create(string_literal126);
            	    adaptor.addChild(root_0, string_literal126_tree);
            	    }
            	    domain=(Token)match(input,STRING,FOLLOW_STRING_in_dispatch_block2531); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    domain_tree = (Object)adaptor.create(domain);
            	    adaptor.addChild(root_0, domain_tree);
            	    }
            	    // RuleSet2.g:761:43: ( '->' rsid= STRING )?
            	    int alt36=2;
            	    int LA36_0 = input.LA(1);

            	    if ( (LA36_0==133) ) {
            	        alt36=1;
            	    }
            	    switch (alt36) {
            	        case 1 :
            	            // RuleSet2.g:761:44: '->' rsid= STRING
            	            {
            	            string_literal127=(Token)match(input,133,FOLLOW_133_in_dispatch_block2534); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal127_tree = (Object)adaptor.create(string_literal127);
            	            adaptor.addChild(root_0, string_literal127_tree);
            	            }
            	            rsid=(Token)match(input,STRING,FOLLOW_STRING_in_dispatch_block2538); if (state.failed) return retval;
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
            	    break loop37;
                }
            } while (true);

            char_literal128=(Token)match(input,31,FOLLOW_31_in_dispatch_block2548); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal128_tree = (Object)adaptor.create(char_literal128);
            adaptor.addChild(root_0, char_literal128_tree);
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
    // RuleSet2.g:775:1: name_value_pair[HashMap key_values] : k= STRING ':' (v= INT | v= FLOAT | v= STRING ) ;
    public final RuleSet2Parser.name_value_pair_return name_value_pair(HashMap key_values) throws RecognitionException {
        RuleSet2Parser.name_value_pair_return retval = new RuleSet2Parser.name_value_pair_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token k=null;
        Token v=null;
        Token char_literal129=null;

        Object k_tree=null;
        Object v_tree=null;
        Object char_literal129_tree=null;


        	Object value = null;

        try {
            // RuleSet2.g:779:2: (k= STRING ':' (v= INT | v= FLOAT | v= STRING ) )
            // RuleSet2.g:779:4: k= STRING ':' (v= INT | v= FLOAT | v= STRING )
            {
            root_0 = (Object)adaptor.nil();

            k=(Token)match(input,STRING,FOLLOW_STRING_in_name_value_pair2571); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            k_tree = (Object)adaptor.create(k);
            adaptor.addChild(root_0, k_tree);
            }
            char_literal129=(Token)match(input,35,FOLLOW_35_in_name_value_pair2573); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal129_tree = (Object)adaptor.create(char_literal129);
            adaptor.addChild(root_0, char_literal129_tree);
            }
            // RuleSet2.g:779:17: (v= INT | v= FLOAT | v= STRING )
            int alt38=3;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt38=1;
                }
                break;
            case FLOAT:
                {
                alt38=2;
                }
                break;
            case STRING:
                {
                alt38=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // RuleSet2.g:780:3: v= INT
                    {
                    v=(Token)match(input,INT,FOLLOW_INT_in_name_value_pair2581); if (state.failed) return retval;
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
                    // RuleSet2.g:781:5: v= FLOAT
                    {
                    v=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_name_value_pair2592); if (state.failed) return retval;
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
                    // RuleSet2.g:782:5: v= STRING
                    {
                    v=(Token)match(input,STRING,FOLLOW_STRING_in_name_value_pair2603); if (state.failed) return retval;
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
        // RuleSet2.g:458:4: ( 'seen' STRING 'in' var_domain ':' VAR timeframe )
        // RuleSet2.g:458:4: 'seen' STRING 'in' var_domain ':' VAR timeframe
        {
        match(input,55,FOLLOW_55_in_synpred2_RuleSet21370); if (state.failed) return ;
        match(input,STRING,FOLLOW_STRING_in_synpred2_RuleSet21372); if (state.failed) return ;
        match(input,56,FOLLOW_56_in_synpred2_RuleSet21374); if (state.failed) return ;
        pushFollow(FOLLOW_var_domain_in_synpred2_RuleSet21376);
        var_domain();

        state._fsp--;
        if (state.failed) return ;
        match(input,35,FOLLOW_35_in_synpred2_RuleSet21378); if (state.failed) return ;
        match(input,VAR,FOLLOW_VAR_in_synpred2_RuleSet21380); if (state.failed) return ;
        pushFollow(FOLLOW_timeframe_in_synpred2_RuleSet21382);
        timeframe();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_RuleSet2

    // $ANTLR start synpred3_RuleSet2
    public final void synpred3_RuleSet2_fragment() throws RecognitionException {   
        // RuleSet2.g:459:4: ( 'seen' STRING ( 'before' | 'after' ) STRING 'in' var_domain ':' VAR )
        // RuleSet2.g:459:4: 'seen' STRING ( 'before' | 'after' ) STRING 'in' var_domain ':' VAR
        {
        match(input,55,FOLLOW_55_in_synpred3_RuleSet21388); if (state.failed) return ;
        match(input,STRING,FOLLOW_STRING_in_synpred3_RuleSet21390); if (state.failed) return ;
        if ( (input.LA(1)>=57 && input.LA(1)<=58) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }

        match(input,STRING,FOLLOW_STRING_in_synpred3_RuleSet21400); if (state.failed) return ;
        match(input,56,FOLLOW_56_in_synpred3_RuleSet21402); if (state.failed) return ;
        pushFollow(FOLLOW_var_domain_in_synpred3_RuleSet21404);
        var_domain();

        state._fsp--;
        if (state.failed) return ;
        match(input,35,FOLLOW_35_in_synpred3_RuleSet21406); if (state.failed) return ;
        match(input,VAR,FOLLOW_VAR_in_synpred3_RuleSet21408); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_RuleSet2

    // $ANTLR start synpred4_RuleSet2
    public final void synpred4_RuleSet2_fragment() throws RecognitionException {   
        // RuleSet2.g:460:4: ( var_domain ':' VAR predop expr timeframe )
        // RuleSet2.g:460:4: var_domain ':' VAR predop expr timeframe
        {
        pushFollow(FOLLOW_var_domain_in_synpred4_RuleSet21414);
        var_domain();

        state._fsp--;
        if (state.failed) return ;
        match(input,35,FOLLOW_35_in_synpred4_RuleSet21416); if (state.failed) return ;
        match(input,VAR,FOLLOW_VAR_in_synpred4_RuleSet21418); if (state.failed) return ;
        pushFollow(FOLLOW_predop_in_synpred4_RuleSet21420);
        predop();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred4_RuleSet21422);
        expr();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_timeframe_in_synpred4_RuleSet21424);
        timeframe();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_RuleSet2

    // $ANTLR start synpred5_RuleSet2
    public final void synpred5_RuleSet2_fragment() throws RecognitionException {   
        // RuleSet2.g:461:4: ( var_domain ':' VAR timeframe )
        // RuleSet2.g:461:4: var_domain ':' VAR timeframe
        {
        pushFollow(FOLLOW_var_domain_in_synpred5_RuleSet21430);
        var_domain();

        state._fsp--;
        if (state.failed) return ;
        match(input,35,FOLLOW_35_in_synpred5_RuleSet21432); if (state.failed) return ;
        match(input,VAR,FOLLOW_VAR_in_synpred5_RuleSet21434); if (state.failed) return ;
        pushFollow(FOLLOW_timeframe_in_synpred5_RuleSet21436);
        timeframe();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_RuleSet2

    // $ANTLR start synpred9_RuleSet2
    public final void synpred9_RuleSet2_fragment() throws RecognitionException {   
        Token v=null;
        RuleSet2Parser.expr_return e = null;


        // RuleSet2.g:509:9: (v= VAR '[' e= expr ']' )
        // RuleSet2.g:509:9: v= VAR '[' e= expr ']'
        {
        v=(Token)match(input,VAR,FOLLOW_VAR_in_synpred9_RuleSet21693); if (state.failed) return ;
        match(input,84,FOLLOW_84_in_synpred9_RuleSet21695); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred9_RuleSet21699);
        e=expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,85,FOLLOW_85_in_synpred9_RuleSet21701); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_RuleSet2

    // $ANTLR start synpred13_RuleSet2
    public final void synpred13_RuleSet2_fragment() throws RecognitionException {   
        Token p=null;
        RuleSet2Parser.namespace_return n = null;

        RuleSet2Parser.expr_return e = null;


        // RuleSet2.g:547:9: (n= namespace p= VAR '(' (e= expr ( ',' )? )* ')' )
        // RuleSet2.g:547:9: n= namespace p= VAR '(' (e= expr ( ',' )? )* ')'
        {
        pushFollow(FOLLOW_namespace_in_synpred13_RuleSet21785);
        n=namespace();

        state._fsp--;
        if (state.failed) return ;
        p=(Token)match(input,VAR,FOLLOW_VAR_in_synpred13_RuleSet21789); if (state.failed) return ;
        match(input,44,FOLLOW_44_in_synpred13_RuleSet21791); if (state.failed) return ;
        // RuleSet2.g:547:31: (e= expr ( ',' )? )*
        loop40:
        do {
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=VAR && LA40_0<=INT)||LA40_0==STRING||LA40_0==30||(LA40_0>=43 && LA40_0<=44)||(LA40_0>=54 && LA40_0<=55)||(LA40_0>=82 && LA40_0<=84)||(LA40_0>=86 && LA40_0<=89)) ) {
                alt40=1;
            }


            switch (alt40) {
        	case 1 :
        	    // RuleSet2.g:547:32: e= expr ( ',' )?
        	    {
        	    pushFollow(FOLLOW_expr_in_synpred13_RuleSet21796);
        	    e=expr();

        	    state._fsp--;
        	    if (state.failed) return ;
        	    // RuleSet2.g:550:8: ( ',' )?
        	    int alt39=2;
        	    int LA39_0 = input.LA(1);

        	    if ( (LA39_0==45) ) {
        	        alt39=1;
        	    }
        	    switch (alt39) {
        	        case 1 :
        	            // RuleSet2.g:550:8: ','
        	            {
        	            match(input,45,FOLLOW_45_in_synpred13_RuleSet21807); if (state.failed) return ;

        	            }
        	            break;

        	    }


        	    }
        	    break;

        	default :
        	    break loop40;
            }
        } while (true);

        match(input,46,FOLLOW_46_in_synpred13_RuleSet21812); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_RuleSet2

    // $ANTLR start synpred14_RuleSet2
    public final void synpred14_RuleSet2_fragment() throws RecognitionException {   
        Token v=null;
        RuleSet2Parser.expr_return e = null;


        // RuleSet2.g:557:9: (v= VAR '(' (e= expr ( ',' )? )* ')' )
        // RuleSet2.g:557:9: v= VAR '(' (e= expr ( ',' )? )* ')'
        {
        v=(Token)match(input,VAR,FOLLOW_VAR_in_synpred14_RuleSet21827); if (state.failed) return ;
        match(input,44,FOLLOW_44_in_synpred14_RuleSet21829); if (state.failed) return ;
        // RuleSet2.g:557:19: (e= expr ( ',' )? )*
        loop42:
        do {
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=VAR && LA42_0<=INT)||LA42_0==STRING||LA42_0==30||(LA42_0>=43 && LA42_0<=44)||(LA42_0>=54 && LA42_0<=55)||(LA42_0>=82 && LA42_0<=84)||(LA42_0>=86 && LA42_0<=89)) ) {
                alt42=1;
            }


            switch (alt42) {
        	case 1 :
        	    // RuleSet2.g:557:20: e= expr ( ',' )?
        	    {
        	    pushFollow(FOLLOW_expr_in_synpred14_RuleSet21834);
        	    e=expr();

        	    state._fsp--;
        	    if (state.failed) return ;
        	    // RuleSet2.g:560:2: ( ',' )?
        	    int alt41=2;
        	    int LA41_0 = input.LA(1);

        	    if ( (LA41_0==45) ) {
        	        alt41=1;
        	    }
        	    switch (alt41) {
        	        case 1 :
        	            // RuleSet2.g:560:2: ','
        	            {
        	            match(input,45,FOLLOW_45_in_synpred14_RuleSet21838); if (state.failed) return ;

        	            }
        	            break;

        	    }


        	    }
        	    break;

        	default :
        	    break loop42;
            }
        } while (true);

        match(input,46,FOLLOW_46_in_synpred14_RuleSet21843); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_RuleSet2

    // $ANTLR start synpred17_RuleSet2
    public final void synpred17_RuleSet2_fragment() throws RecognitionException {   
        Token v=null;

        // RuleSet2.g:593:9: (v= VAR )
        // RuleSet2.g:593:9: v= VAR
        {
        v=(Token)match(input,VAR,FOLLOW_VAR_in_synpred17_RuleSet21918); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred17_RuleSet2

    // Delegated rules

    public final boolean synpred9_RuleSet2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_RuleSet2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
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
    public final boolean synpred14_RuleSet2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_RuleSet2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_RuleSet2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_RuleSet2_fragment(); // can never throw exception
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
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA35 dfa35 = new DFA35(this);
    static final String DFA18_eotS =
        "\21\uffff";
    static final String DFA18_eofS =
        "\21\uffff";
    static final String DFA18_minS =
        "\1\4\1\uffff\2\0\15\uffff";
    static final String DFA18_maxS =
        "\1\131\1\uffff\2\0\15\uffff";
    static final String DFA18_acceptS =
        "\1\uffff\1\1\2\uffff\1\6\10\uffff\1\2\1\3\1\4\1\5";
    static final String DFA18_specialS =
        "\2\uffff\1\0\1\1\15\uffff}>";
    static final String[] DFA18_transitionS = {
            "\2\4\6\uffff\1\4\21\uffff\1\4\15\uffff\1\4\11\uffff\1\1\1\2"+
            "\32\uffff\3\4\1\uffff\2\4\2\3",
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
            return "456:1: unary_expr returns [Object result] options {backtrack=true; } : ( 'not' unary_expr | 'seen' STRING 'in' var_domain ':' VAR timeframe | 'seen' STRING ( 'before' | 'after' ) STRING 'in' var_domain ':' VAR | var_domain ':' VAR predop expr timeframe | var_domain ':' VAR timeframe | oe= operator_expr );";
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
                        if ( (synpred2_RuleSet2()) ) {s = 13;}

                        else if ( (synpred3_RuleSet2()) ) {s = 14;}

                         
                        input.seek(index18_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_3 = input.LA(1);

                         
                        int index18_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_RuleSet2()) ) {s = 15;}

                        else if ( (synpred5_RuleSet2()) ) {s = 16;}

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
    static final String DFA27_eotS =
        "\17\uffff";
    static final String DFA27_eofS =
        "\17\uffff";
    static final String DFA27_minS =
        "\1\4\3\uffff\1\0\12\uffff";
    static final String DFA27_maxS =
        "\1\131\3\uffff\1\0\12\uffff";
    static final String DFA27_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\1\6\1\7\1\12\1\13\1\15\1\4\1\10"+
        "\1\11\1\14";
    static final String DFA27_specialS =
        "\4\uffff\1\0\12\uffff}>";
    static final String[] DFA27_transitionS = {
            "\1\4\1\1\6\uffff\1\2\21\uffff\1\11\15\uffff\1\12\45\uffff\2"+
            "\3\1\10\1\uffff\1\6\1\7\2\5",
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
            "",
            ""
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "486:1: factor returns [Object result] options {backtrack=true; } : (v= INT | v= STRING | v= ( 'true' | 'false' ) | v= VAR '[' e= expr ']' | d= var_domain ':' v= VAR | 'current' d= var_domain ':' v= VAR | 'history' e= expr d= var_domain ':' v= VAR | n= namespace p= VAR '(' (e= expr ( ',' )? )* ')' | v= VAR '(' (e= expr ( ',' )? )* ')' | '[' e= expr ( ',' e2= expr )* ']' | '{' h1= hash_line ( ',' h2= hash_line )* '}' | v= VAR | '(' e= expr ')' );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_4 = input.LA(1);

                         
                        int index27_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_RuleSet2()) ) {s = 11;}

                        else if ( (synpred13_RuleSet2()) ) {s = 12;}

                        else if ( (synpred14_RuleSet2()) ) {s = 13;}

                        else if ( (synpred17_RuleSet2()) ) {s = 14;}

                         
                        input.seek(index27_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 27, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA35_eotS =
        "\13\uffff";
    static final String DFA35_eofS =
        "\13\uffff";
    static final String DFA35_minS =
        "\1\37\7\uffff\1\133\2\uffff";
    static final String DFA35_maxS =
        "\1\176\7\uffff\1\u0081\2\uffff";
    static final String DFA35_acceptS =
        "\1\uffff\1\11\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\7\1\10";
    static final String DFA35_specialS =
        "\13\uffff}>";
    static final String[] DFA35_transitionS = {
            "\1\1\116\uffff\1\2\1\3\1\4\1\5\6\uffff\1\6\2\uffff\1\7\2\uffff"+
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

    static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
    static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
    static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
    static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
    static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
    static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
    static final short[][] DFA35_transition;

    static {
        int numStates = DFA35_transitionS.length;
        DFA35_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
        }
    }

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = DFA35_eot;
            this.eof = DFA35_eof;
            this.min = DFA35_min;
            this.max = DFA35_max;
            this.accept = DFA35_accept;
            this.special = DFA35_special;
            this.transition = DFA35_transition;
        }
        public String getDescription() {
            return "()* loopback of 705:2: ( 'description' desc= ( HTML | STRING ) | 'name' thename= STRING | 'author' author= STRING | 'key' what= ( 'errorstack' | 'googleanalytics' | 'twitter' | 'amazon' | 'kpds' | 'google' | VAR ) (key_value= STRING | '{' ( name_value_pair[key_values] ( ',' name_value_pair[key_values] )* ) '}' )+ | 'authz' 'require' 'user' | 'logging' ( 'on' | 'off' ) | 'use' 'module' name= VAR ( 'alias' alias= VAR )? | 'use' rtype= ( 'css' | 'javascript' ) 'resource' (url= STRING | name= VAR ) )*";
        }
    }
 

    public static final BitSet FOLLOW_set_in_predop0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_add_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleset744 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rulesetname_in_ruleset746 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleset750 = new BitSet(new long[]{0x0000000100000000L,0x0000200000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_meta_block_in_ruleset758 = new BitSet(new long[]{0x0000000180000000L,0x0000200000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_dispatch_block_in_ruleset762 = new BitSet(new long[]{0x0000000180000000L,0x0000200000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_global_block_in_ruleset766 = new BitSet(new long[]{0x0000000180000000L,0x0000200000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_31_in_ruleset773 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_ruleset775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_rulesetname0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_global_block818 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_global_block820 = new BitSet(new long[]{0x0000020600000010L,0x0000100008000000L});
    public static final BitSet FOLLOW_emit_block_in_global_block828 = new BitSet(new long[]{0x0000020680000010L,0x0000100008000000L});
    public static final BitSet FOLLOW_set_in_global_block838 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_global_block847 = new BitSet(new long[]{0x0000010800000000L});
    public static final BitSet FOLLOW_35_in_global_block850 = new BitSet(new long[]{0x000000F000000000L});
    public static final BitSet FOLLOW_set_in_global_block854 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_global_block866 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_STRING_in_global_block870 = new BitSet(new long[]{0x0000020680000010L,0x0000140008000000L});
    public static final BitSet FOLLOW_cachable_in_global_block875 = new BitSet(new long[]{0x0000020680000010L,0x0000100008000000L});
    public static final BitSet FOLLOW_css_emit_in_global_block888 = new BitSet(new long[]{0x0000020680000010L,0x0000100008000000L});
    public static final BitSet FOLLOW_decl_in_global_block896 = new BitSet(new long[]{0x0000020680000010L,0x0000100008000000L});
    public static final BitSet FOLLOW_41_in_global_block902 = new BitSet(new long[]{0x0000020680000010L,0x0000100008000000L});
    public static final BitSet FOLLOW_31_in_global_block907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_decl934 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_decl936 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_HTML_in_decl940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_decl950 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_decl952 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_JS_in_decl956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_decl966 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_decl968 = new BitSet(new long[]{0x00C0180040001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_expr_in_decl972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_def_in_expr999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_expression_in_expr1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_function_def1030 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_function_def1032 = new BitSet(new long[]{0x0000600000000010L});
    public static final BitSet FOLLOW_VAR_in_function_def1036 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_45_in_function_def1040 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_function_def1044 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_46_in_function_def1049 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_function_def1051 = new BitSet(new long[]{0x00C01A0040001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_decl_in_function_def1055 = new BitSet(new long[]{0x00C01A0040001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_41_in_function_def1060 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_decl_in_function_def1064 = new BitSet(new long[]{0x00C01A0040001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_41_in_function_def1069 = new BitSet(new long[]{0x00C0180040001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_expr_in_function_def1074 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_function_def1076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_disjunction_in_conditional_expression1098 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_conditional_expression1101 = new BitSet(new long[]{0x00C0180040001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_expr_in_conditional_expression1103 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_conditional_expression1105 = new BitSet(new long[]{0x00C0180040001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_expr_in_conditional_expression1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conjunction_in_disjunction1139 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_disjunction1144 = new BitSet(new long[]{0x00C0180040001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_conjunction_in_disjunction1148 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_equality_expr_in_conjunction1178 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_conjunction1183 = new BitSet(new long[]{0x00C0180040001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_equality_expr_in_conjunction1187 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_add_expr_in_equality_expr1218 = new BitSet(new long[]{0x0000000007FC0002L});
    public static final BitSet FOLLOW_predop_in_equality_expr1223 = new BitSet(new long[]{0x00C0180040001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_add_expr_in_equality_expr1227 = new BitSet(new long[]{0x0000000007FC0002L});
    public static final BitSet FOLLOW_mult_expr_in_add_expr1261 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_add_op_in_add_expr1266 = new BitSet(new long[]{0x00C0180040001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_mult_expr_in_add_expr1270 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_set_in_mult_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_expr_in_mult_expr1318 = new BitSet(new long[]{0x0038000000000002L});
    public static final BitSet FOLLOW_mult_op_in_mult_expr1323 = new BitSet(new long[]{0x00C0180040001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_unary_expr_in_mult_expr1327 = new BitSet(new long[]{0x0038000000000002L});
    public static final BitSet FOLLOW_54_in_unary_expr1362 = new BitSet(new long[]{0x00C0180040001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_unary_expr_in_unary_expr1364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_unary_expr1370 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_STRING_in_unary_expr1372 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_unary_expr1374 = new BitSet(new long[]{0x0000000000000000L,0x0000000003000000L});
    public static final BitSet FOLLOW_var_domain_in_unary_expr1376 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_unary_expr1378 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_unary_expr1380 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_timeframe_in_unary_expr1382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_unary_expr1388 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_STRING_in_unary_expr1390 = new BitSet(new long[]{0x0600000000000000L});
    public static final BitSet FOLLOW_set_in_unary_expr1392 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_STRING_in_unary_expr1400 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_unary_expr1402 = new BitSet(new long[]{0x0000000000000000L,0x0000000003000000L});
    public static final BitSet FOLLOW_var_domain_in_unary_expr1404 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_unary_expr1406 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_unary_expr1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_domain_in_unary_expr1414 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_unary_expr1416 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_unary_expr1418 = new BitSet(new long[]{0x0000000007FC0000L});
    public static final BitSet FOLLOW_predop_in_unary_expr1420 = new BitSet(new long[]{0x00C0180040001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_expr_in_unary_expr1422 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_timeframe_in_unary_expr1424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_domain_in_unary_expr1430 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_unary_expr1432 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_unary_expr1434 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_timeframe_in_unary_expr1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operator_expr_in_unary_expr1444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_operator_expr1471 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_operator_in_operator_expr1477 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_59_in_operator1491 = new BitSet(new long[]{0xF000000000000000L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_operator_op_in_operator1493 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_operator1495 = new BitSet(new long[]{0x00C0180040001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_expr_in_operator1497 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_45_in_operator1499 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_operator1502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operator_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_factor1638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_factor1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_factor1673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_factor1693 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_factor1695 = new BitSet(new long[]{0x00C0180040001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_expr_in_factor1699 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_factor1701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_domain_in_factor1716 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_factor1718 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_factor1722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_factor1734 = new BitSet(new long[]{0x0000000000000000L,0x0000000003000000L});
    public static final BitSet FOLLOW_var_domain_in_factor1738 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_factor1740 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_factor1744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_factor1757 = new BitSet(new long[]{0x00C0180040001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_expr_in_factor1761 = new BitSet(new long[]{0x0000000000000000L,0x0000000003000000L});
    public static final BitSet FOLLOW_var_domain_in_factor1765 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_factor1767 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_factor1771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namespace_in_factor1785 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_factor1789 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_factor1791 = new BitSet(new long[]{0x00C0580040001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_expr_in_factor1796 = new BitSet(new long[]{0x00C0780040001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_45_in_factor1807 = new BitSet(new long[]{0x00C0580040001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_46_in_factor1812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_factor1827 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_factor1829 = new BitSet(new long[]{0x00C0580040001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_expr_in_factor1834 = new BitSet(new long[]{0x00C0780040001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_45_in_factor1838 = new BitSet(new long[]{0x00C0580040001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_46_in_factor1843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_factor1855 = new BitSet(new long[]{0x00C0180040001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_expr_in_factor1859 = new BitSet(new long[]{0x0000200000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_45_in_factor1864 = new BitSet(new long[]{0x00C0180040001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_expr_in_factor1868 = new BitSet(new long[]{0x0000200000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_factor1873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_factor1885 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_hash_line_in_factor1889 = new BitSet(new long[]{0x0000200080000000L});
    public static final BitSet FOLLOW_45_in_factor1894 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_hash_line_in_factor1898 = new BitSet(new long[]{0x0000200080000000L});
    public static final BitSet FOLLOW_31_in_factor1904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_factor1918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_factor1931 = new BitSet(new long[]{0x00C0180040001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_expr_in_factor1935 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_factor1937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_var_domain0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_namespace1980 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_namespace1982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_timeframe2001 = new BitSet(new long[]{0x00C0180040001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_expr_in_timeframe2003 = new BitSet(new long[]{0x0000000000000000L,0x000003FFF0000000L});
    public static final BitSet FOLLOW_period_in_timeframe2007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_hash_line2029 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_hash_line2031 = new BitSet(new long[]{0x00C0180040001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_expr_in_hash_line2035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_css_emit2053 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_HTML_in_css_emit2059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_css_emit2067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_period0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_cachable2207 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_cachable2210 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_INT_in_cachable2214 = new BitSet(new long[]{0x0000000000000000L,0x000003FFF0000000L});
    public static final BitSet FOLLOW_period_in_cachable2218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_emit_block2242 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_HTML_in_emit_block2248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_emit_block2256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JS_in_emit_block2264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_meta_block2296 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_meta_block2298 = new BitSet(new long[]{0x0000000080000000L,0x4903C00000000000L});
    public static final BitSet FOLLOW_110_in_meta_block2304 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_set_in_meta_block2308 = new BitSet(new long[]{0x0000000080000000L,0x4903C00000000000L});
    public static final BitSet FOLLOW_111_in_meta_block2322 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_STRING_in_meta_block2326 = new BitSet(new long[]{0x0000000080000000L,0x4903C00000000000L});
    public static final BitSet FOLLOW_112_in_meta_block2336 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_STRING_in_meta_block2340 = new BitSet(new long[]{0x0000000080000000L,0x4903C00000000000L});
    public static final BitSet FOLLOW_113_in_meta_block2352 = new BitSet(new long[]{0x0000000000000010L,0x00FC000000000000L});
    public static final BitSet FOLLOW_set_in_meta_block2356 = new BitSet(new long[]{0x0000000040001000L});
    public static final BitSet FOLLOW_STRING_in_meta_block2378 = new BitSet(new long[]{0x00000000C0001000L,0x4903C00000000000L});
    public static final BitSet FOLLOW_30_in_meta_block2382 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_name_value_pair_in_meta_block2385 = new BitSet(new long[]{0x0000200080000000L});
    public static final BitSet FOLLOW_45_in_meta_block2389 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_name_value_pair_in_meta_block2391 = new BitSet(new long[]{0x0000200080000000L});
    public static final BitSet FOLLOW_31_in_meta_block2397 = new BitSet(new long[]{0x00000000C0001000L,0x4903C00000000000L});
    public static final BitSet FOLLOW_120_in_meta_block2409 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_121_in_meta_block2411 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_meta_block2413 = new BitSet(new long[]{0x0000000080000000L,0x4903C00000000000L});
    public static final BitSet FOLLOW_123_in_meta_block2420 = new BitSet(new long[]{0x0000000000000000L,0x3000000000000000L});
    public static final BitSet FOLLOW_set_in_meta_block2422 = new BitSet(new long[]{0x0000000080000000L,0x4903C00000000000L});
    public static final BitSet FOLLOW_126_in_meta_block2433 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_meta_block2435 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_meta_block2439 = new BitSet(new long[]{0x0000000080000000L,0x4903C00000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_128_in_meta_block2442 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_meta_block2446 = new BitSet(new long[]{0x0000000080000000L,0x4903C00000000000L});
    public static final BitSet FOLLOW_126_in_meta_block2455 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_meta_block2459 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_130_in_meta_block2467 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_STRING_in_meta_block2472 = new BitSet(new long[]{0x0000000080000000L,0x4903C00000000000L});
    public static final BitSet FOLLOW_VAR_in_meta_block2478 = new BitSet(new long[]{0x0000000080000000L,0x4903C00000000000L});
    public static final BitSet FOLLOW_31_in_meta_block2491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_dispatch_block2522 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_dispatch_block2524 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_132_in_dispatch_block2527 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_STRING_in_dispatch_block2531 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_133_in_dispatch_block2534 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_STRING_in_dispatch_block2538 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_31_in_dispatch_block2548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_name_value_pair2571 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_name_value_pair2573 = new BitSet(new long[]{0x00000000000010A0L});
    public static final BitSet FOLLOW_INT_in_name_value_pair2581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_name_value_pair2592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_name_value_pair2603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_synpred2_RuleSet21370 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_STRING_in_synpred2_RuleSet21372 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_synpred2_RuleSet21374 = new BitSet(new long[]{0x0000000000000000L,0x0000000003000000L});
    public static final BitSet FOLLOW_var_domain_in_synpred2_RuleSet21376 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_synpred2_RuleSet21378 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_synpred2_RuleSet21380 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_timeframe_in_synpred2_RuleSet21382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_synpred3_RuleSet21388 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_STRING_in_synpred3_RuleSet21390 = new BitSet(new long[]{0x0600000000000000L});
    public static final BitSet FOLLOW_set_in_synpred3_RuleSet21392 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_STRING_in_synpred3_RuleSet21400 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_synpred3_RuleSet21402 = new BitSet(new long[]{0x0000000000000000L,0x0000000003000000L});
    public static final BitSet FOLLOW_var_domain_in_synpred3_RuleSet21404 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_synpred3_RuleSet21406 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_synpred3_RuleSet21408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_domain_in_synpred4_RuleSet21414 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_synpred4_RuleSet21416 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_synpred4_RuleSet21418 = new BitSet(new long[]{0x0000000007FC0000L});
    public static final BitSet FOLLOW_predop_in_synpred4_RuleSet21420 = new BitSet(new long[]{0x00C0180040001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_expr_in_synpred4_RuleSet21422 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_timeframe_in_synpred4_RuleSet21424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_domain_in_synpred5_RuleSet21430 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_synpred5_RuleSet21432 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_synpred5_RuleSet21434 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_timeframe_in_synpred5_RuleSet21436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_synpred9_RuleSet21693 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_synpred9_RuleSet21695 = new BitSet(new long[]{0x00C0180040001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_expr_in_synpred9_RuleSet21699 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_synpred9_RuleSet21701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namespace_in_synpred13_RuleSet21785 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_synpred13_RuleSet21789 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_synpred13_RuleSet21791 = new BitSet(new long[]{0x00C0580040001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_expr_in_synpred13_RuleSet21796 = new BitSet(new long[]{0x00C0780040001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_45_in_synpred13_RuleSet21807 = new BitSet(new long[]{0x00C0580040001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_46_in_synpred13_RuleSet21812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_synpred14_RuleSet21827 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_synpred14_RuleSet21829 = new BitSet(new long[]{0x00C0580040001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_expr_in_synpred14_RuleSet21834 = new BitSet(new long[]{0x00C0780040001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_45_in_synpred14_RuleSet21838 = new BitSet(new long[]{0x00C0580040001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_46_in_synpred14_RuleSet21843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_synpred17_RuleSet21918 = new BitSet(new long[]{0x0000000000000002L});

}