// $ANTLR 3.2 Sep 23, 2009 12:02:23 RuleSet2.g 2010-07-15 16:13:38

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "VAR", "INT", "EXPONENT", "FLOAT", "NUM", "COMMENT", "WS", "ESC_SEQ", "STRING", "HTML", "JS", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "'<='", "'>='", "'<'", "'>'", "'=='", "'!='", "'eq'", "'neq'", "'like'", "'+'", "'-'", "'ruleset'", "'{'", "'}'", "'global'", "'dataset'", "'datasource'", "':'", "'JSON'", "'XML'", "'RSS'", "'HTML'", "'<-'", "';'", "'='", "'function'", "'('", "','", "')'", "'=>'", "'|'", "'||'", "'&&'", "'*'", "'/'", "'%'", "'not'", "'seen'", "'in'", "'before'", "'after'", "'.'", "'pick'", "'match'", "'length'", "'replace'", "'as'", "'head'", "'tail'", "'sort'", "'filter'", "'map'", "'uc'", "'lc'", "'split'", "'join'", "'query'", "'has'", "'union'", "'difference'", "'intersection'", "'unique'", "'once'", "'duplicates'", "'true'", "'false'", "'['", "']'", "'ent'", "'app'", "'current'", "'history'", "'within'", "'css'", "'years'", "'months'", "'weeks'", "'days'", "'hours'", "'minutes'", "'seconds'", "'year'", "'month'", "'week'", "'day'", "'hour'", "'minute'", "'second'", "'cachable'", "'for'", "'emit'", "'meta'", "'description'", "'name'", "'author'", "'key'", "'errorstack'", "'googleanalytics'", "'twitter'", "'amazon'", "'kpds'", "'google'", "'authz'", "'require'", "'user'", "'logging'", "'on'", "'off'", "'use'", "'module'", "'alias'", "'javascript'", "'resource'", "'dispatch'", "'domain'", "'->'"
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
                    // RuleSet2.g:458:2: 'seen' STRING 'in' var_domain ':' VAR timeframe
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
                    // RuleSet2.g:459:2: 'seen' STRING ( 'before' | 'after' ) STRING 'in' var_domain ':' VAR
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal45=(Token)match(input,55,FOLLOW_55_in_unary_expr1387); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal45_tree = (Object)adaptor.create(string_literal45);
                    adaptor.addChild(root_0, string_literal45_tree);
                    }
                    STRING46=(Token)match(input,STRING,FOLLOW_STRING_in_unary_expr1389); if (state.failed) return retval;
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

                    STRING48=(Token)match(input,STRING,FOLLOW_STRING_in_unary_expr1399); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING48_tree = (Object)adaptor.create(STRING48);
                    adaptor.addChild(root_0, STRING48_tree);
                    }
                    string_literal49=(Token)match(input,56,FOLLOW_56_in_unary_expr1401); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal49_tree = (Object)adaptor.create(string_literal49);
                    adaptor.addChild(root_0, string_literal49_tree);
                    }
                    pushFollow(FOLLOW_var_domain_in_unary_expr1403);
                    var_domain50=var_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, var_domain50.getTree());
                    char_literal51=(Token)match(input,35,FOLLOW_35_in_unary_expr1405); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal51_tree = (Object)adaptor.create(char_literal51);
                    adaptor.addChild(root_0, char_literal51_tree);
                    }
                    VAR52=(Token)match(input,VAR,FOLLOW_VAR_in_unary_expr1407); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VAR52_tree = (Object)adaptor.create(VAR52);
                    adaptor.addChild(root_0, VAR52_tree);
                    }

                    }
                    break;
                case 4 :
                    // RuleSet2.g:460:2: var_domain ':' VAR predop expr timeframe
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_var_domain_in_unary_expr1412);
                    var_domain53=var_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, var_domain53.getTree());
                    char_literal54=(Token)match(input,35,FOLLOW_35_in_unary_expr1414); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal54_tree = (Object)adaptor.create(char_literal54);
                    adaptor.addChild(root_0, char_literal54_tree);
                    }
                    VAR55=(Token)match(input,VAR,FOLLOW_VAR_in_unary_expr1416); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VAR55_tree = (Object)adaptor.create(VAR55);
                    adaptor.addChild(root_0, VAR55_tree);
                    }
                    pushFollow(FOLLOW_predop_in_unary_expr1418);
                    predop56=predop();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, predop56.getTree());
                    pushFollow(FOLLOW_expr_in_unary_expr1420);
                    expr57=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr57.getTree());
                    pushFollow(FOLLOW_timeframe_in_unary_expr1422);
                    timeframe58=timeframe();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeframe58.getTree());

                    }
                    break;
                case 5 :
                    // RuleSet2.g:461:2: var_domain ':' VAR timeframe
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_var_domain_in_unary_expr1427);
                    var_domain59=var_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, var_domain59.getTree());
                    char_literal60=(Token)match(input,35,FOLLOW_35_in_unary_expr1429); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal60_tree = (Object)adaptor.create(char_literal60);
                    adaptor.addChild(root_0, char_literal60_tree);
                    }
                    VAR61=(Token)match(input,VAR,FOLLOW_VAR_in_unary_expr1431); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VAR61_tree = (Object)adaptor.create(VAR61);
                    adaptor.addChild(root_0, VAR61_tree);
                    }
                    pushFollow(FOLLOW_timeframe_in_unary_expr1433);
                    timeframe62=timeframe();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeframe62.getTree());

                    }
                    break;
                case 6 :
                    // RuleSet2.g:462:2: oe= operator_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_operator_expr_in_unary_expr1440);
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

            pushFollow(FOLLOW_factor_in_operator_expr1467);
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
            	    pushFollow(FOLLOW_operator_in_operator_expr1473);
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

            char_literal64=(Token)match(input,59,FOLLOW_59_in_operator1487); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal64_tree = (Object)adaptor.create(char_literal64);
            adaptor.addChild(root_0, char_literal64_tree);
            }
            pushFollow(FOLLOW_operator_op_in_operator1489);
            operator_op65=operator_op();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, operator_op65.getTree());
            char_literal66=(Token)match(input,44,FOLLOW_44_in_operator1491); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal66_tree = (Object)adaptor.create(char_literal66);
            adaptor.addChild(root_0, char_literal66_tree);
            }
            pushFollow(FOLLOW_expr_in_operator1493);
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
                    char_literal68=(Token)match(input,45,FOLLOW_45_in_operator1495); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal68_tree = (Object)adaptor.create(char_literal68);
                    adaptor.addChild(root_0, char_literal68_tree);
                    }

                    }
                    break;

            }

            char_literal69=(Token)match(input,46,FOLLOW_46_in_operator1498); if (state.failed) return retval;
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
    // RuleSet2.g:486:1: factor returns [Object result] options {backtrack=true; } : (v= INT | v= STRING | v= 'true' | v= 'false' | VAR '[' expr ']' | var_domain ':' VAR | trail_exp | function_app | '[' expr ',' ']' | '{' ( hash_line ( ',' )? )* '}' | v= VAR | '(' e= expr ')' );
    public final RuleSet2Parser.factor_return factor() throws RecognitionException {
        RuleSet2Parser.factor_return retval = new RuleSet2Parser.factor_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token v=null;
        Token VAR71=null;
        Token char_literal72=null;
        Token char_literal74=null;
        Token char_literal76=null;
        Token VAR77=null;
        Token char_literal80=null;
        Token char_literal82=null;
        Token char_literal83=null;
        Token char_literal84=null;
        Token char_literal86=null;
        Token char_literal87=null;
        Token char_literal88=null;
        Token char_literal89=null;
        RuleSet2Parser.expr_return e = null;

        RuleSet2Parser.expr_return expr73 = null;

        RuleSet2Parser.var_domain_return var_domain75 = null;

        RuleSet2Parser.trail_exp_return trail_exp78 = null;

        RuleSet2Parser.function_app_return function_app79 = null;

        RuleSet2Parser.expr_return expr81 = null;

        RuleSet2Parser.hash_line_return hash_line85 = null;


        Object v_tree=null;
        Object VAR71_tree=null;
        Object char_literal72_tree=null;
        Object char_literal74_tree=null;
        Object char_literal76_tree=null;
        Object VAR77_tree=null;
        Object char_literal80_tree=null;
        Object char_literal82_tree=null;
        Object char_literal83_tree=null;
        Object char_literal84_tree=null;
        Object char_literal86_tree=null;
        Object char_literal87_tree=null;
        Object char_literal88_tree=null;
        Object char_literal89_tree=null;

        try {
            // RuleSet2.g:487:2: (v= INT | v= STRING | v= 'true' | v= 'false' | VAR '[' expr ']' | var_domain ':' VAR | trail_exp | function_app | '[' expr ',' ']' | '{' ( hash_line ( ',' )? )* '}' | v= VAR | '(' e= expr ')' )
            int alt23=12;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // RuleSet2.g:487:4: v= INT
                    {
                    root_0 = (Object)adaptor.nil();

                    v=(Token)match(input,INT,FOLLOW_INT_in_factor1629); if (state.failed) return retval;
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
                    // RuleSet2.g:493:9: v= STRING
                    {
                    root_0 = (Object)adaptor.nil();

                    v=(Token)match(input,STRING,FOLLOW_STRING_in_factor1643); if (state.failed) return retval;
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
                    // RuleSet2.g:494:9: v= 'true'
                    {
                    root_0 = (Object)adaptor.nil();

                    v=(Token)match(input,82,FOLLOW_82_in_factor1662); if (state.failed) return retval;
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
                    // RuleSet2.g:495:9: v= 'false'
                    {
                    root_0 = (Object)adaptor.nil();

                    v=(Token)match(input,83,FOLLOW_83_in_factor1677); if (state.failed) return retval;
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
                    // RuleSet2.g:496:9: VAR '[' expr ']'
                    {
                    root_0 = (Object)adaptor.nil();

                    VAR71=(Token)match(input,VAR,FOLLOW_VAR_in_factor1690); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VAR71_tree = (Object)adaptor.create(VAR71);
                    adaptor.addChild(root_0, VAR71_tree);
                    }
                    char_literal72=(Token)match(input,84,FOLLOW_84_in_factor1692); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal72_tree = (Object)adaptor.create(char_literal72);
                    adaptor.addChild(root_0, char_literal72_tree);
                    }
                    pushFollow(FOLLOW_expr_in_factor1694);
                    expr73=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr73.getTree());
                    char_literal74=(Token)match(input,85,FOLLOW_85_in_factor1696); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal74_tree = (Object)adaptor.create(char_literal74);
                    adaptor.addChild(root_0, char_literal74_tree);
                    }

                    }
                    break;
                case 6 :
                    // RuleSet2.g:497:9: var_domain ':' VAR
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_var_domain_in_factor1706);
                    var_domain75=var_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, var_domain75.getTree());
                    char_literal76=(Token)match(input,35,FOLLOW_35_in_factor1708); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal76_tree = (Object)adaptor.create(char_literal76);
                    adaptor.addChild(root_0, char_literal76_tree);
                    }
                    VAR77=(Token)match(input,VAR,FOLLOW_VAR_in_factor1710); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VAR77_tree = (Object)adaptor.create(VAR77);
                    adaptor.addChild(root_0, VAR77_tree);
                    }

                    }
                    break;
                case 7 :
                    // RuleSet2.g:498:9: trail_exp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_trail_exp_in_factor1720);
                    trail_exp78=trail_exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, trail_exp78.getTree());

                    }
                    break;
                case 8 :
                    // RuleSet2.g:499:9: function_app
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_function_app_in_factor1730);
                    function_app79=function_app();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_app79.getTree());

                    }
                    break;
                case 9 :
                    // RuleSet2.g:500:9: '[' expr ',' ']'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal80=(Token)match(input,84,FOLLOW_84_in_factor1740); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal80_tree = (Object)adaptor.create(char_literal80);
                    adaptor.addChild(root_0, char_literal80_tree);
                    }
                    pushFollow(FOLLOW_expr_in_factor1742);
                    expr81=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr81.getTree());
                    char_literal82=(Token)match(input,45,FOLLOW_45_in_factor1744); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal82_tree = (Object)adaptor.create(char_literal82);
                    adaptor.addChild(root_0, char_literal82_tree);
                    }
                    char_literal83=(Token)match(input,85,FOLLOW_85_in_factor1746); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal83_tree = (Object)adaptor.create(char_literal83);
                    adaptor.addChild(root_0, char_literal83_tree);
                    }

                    }
                    break;
                case 10 :
                    // RuleSet2.g:501:9: '{' ( hash_line ( ',' )? )* '}'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal84=(Token)match(input,30,FOLLOW_30_in_factor1756); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal84_tree = (Object)adaptor.create(char_literal84);
                    adaptor.addChild(root_0, char_literal84_tree);
                    }
                    // RuleSet2.g:501:13: ( hash_line ( ',' )? )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==STRING) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // RuleSet2.g:501:14: hash_line ( ',' )?
                    	    {
                    	    pushFollow(FOLLOW_hash_line_in_factor1759);
                    	    hash_line85=hash_line();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, hash_line85.getTree());
                    	    // RuleSet2.g:501:24: ( ',' )?
                    	    int alt21=2;
                    	    int LA21_0 = input.LA(1);

                    	    if ( (LA21_0==45) ) {
                    	        alt21=1;
                    	    }
                    	    switch (alt21) {
                    	        case 1 :
                    	            // RuleSet2.g:501:24: ','
                    	            {
                    	            char_literal86=(Token)match(input,45,FOLLOW_45_in_factor1761); if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) {
                    	            char_literal86_tree = (Object)adaptor.create(char_literal86);
                    	            adaptor.addChild(root_0, char_literal86_tree);
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

                    char_literal87=(Token)match(input,31,FOLLOW_31_in_factor1766); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal87_tree = (Object)adaptor.create(char_literal87);
                    adaptor.addChild(root_0, char_literal87_tree);
                    }

                    }
                    break;
                case 11 :
                    // RuleSet2.g:502:9: v= VAR
                    {
                    root_0 = (Object)adaptor.nil();

                    v=(Token)match(input,VAR,FOLLOW_VAR_in_factor1778); if (state.failed) return retval;
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
                    // RuleSet2.g:508:9: '(' e= expr ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal88=(Token)match(input,44,FOLLOW_44_in_factor1791); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal88_tree = (Object)adaptor.create(char_literal88);
                    adaptor.addChild(root_0, char_literal88_tree);
                    }
                    pushFollow(FOLLOW_expr_in_factor1795);
                    e=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
                    char_literal89=(Token)match(input,46,FOLLOW_46_in_factor1797); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal89_tree = (Object)adaptor.create(char_literal89);
                    adaptor.addChild(root_0, char_literal89_tree);
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
    // RuleSet2.g:510:10: fragment var_domain : ( 'ent' | 'app' );
    public final RuleSet2Parser.var_domain_return var_domain() throws RecognitionException {
        RuleSet2Parser.var_domain_return retval = new RuleSet2Parser.var_domain_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set90=null;

        Object set90_tree=null;

        try {
            // RuleSet2.g:510:20: ( 'ent' | 'app' )
            // RuleSet2.g:
            {
            root_0 = (Object)adaptor.nil();

            set90=(Token)input.LT(1);
            if ( (input.LA(1)>=86 && input.LA(1)<=87) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set90));
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
    // RuleSet2.g:514:1: function_app : ( namespace VAR '(' ( expr ( ',' )? )* ')' | VAR '(' ( expr ( ',' )? )* ')' );
    public final RuleSet2Parser.function_app_return function_app() throws RecognitionException {
        RuleSet2Parser.function_app_return retval = new RuleSet2Parser.function_app_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VAR92=null;
        Token char_literal93=null;
        Token char_literal95=null;
        Token char_literal96=null;
        Token VAR97=null;
        Token char_literal98=null;
        Token char_literal100=null;
        Token char_literal101=null;
        RuleSet2Parser.namespace_return namespace91 = null;

        RuleSet2Parser.expr_return expr94 = null;

        RuleSet2Parser.expr_return expr99 = null;


        Object VAR92_tree=null;
        Object char_literal93_tree=null;
        Object char_literal95_tree=null;
        Object char_literal96_tree=null;
        Object VAR97_tree=null;
        Object char_literal98_tree=null;
        Object char_literal100_tree=null;
        Object char_literal101_tree=null;

        try {
            // RuleSet2.g:515:2: ( namespace VAR '(' ( expr ( ',' )? )* ')' | VAR '(' ( expr ( ',' )? )* ')' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==VAR) ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==35) ) {
                    alt28=1;
                }
                else if ( (LA28_1==44) ) {
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
                    // RuleSet2.g:515:3: namespace VAR '(' ( expr ( ',' )? )* ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_namespace_in_function_app1832);
                    namespace91=namespace();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, namespace91.getTree());
                    VAR92=(Token)match(input,VAR,FOLLOW_VAR_in_function_app1834); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VAR92_tree = (Object)adaptor.create(VAR92);
                    adaptor.addChild(root_0, VAR92_tree);
                    }
                    char_literal93=(Token)match(input,44,FOLLOW_44_in_function_app1836); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal93_tree = (Object)adaptor.create(char_literal93);
                    adaptor.addChild(root_0, char_literal93_tree);
                    }
                    // RuleSet2.g:515:21: ( expr ( ',' )? )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( ((LA25_0>=VAR && LA25_0<=INT)||LA25_0==STRING||LA25_0==30||(LA25_0>=43 && LA25_0<=44)||(LA25_0>=54 && LA25_0<=55)||(LA25_0>=82 && LA25_0<=84)||(LA25_0>=86 && LA25_0<=89)) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // RuleSet2.g:515:22: expr ( ',' )?
                    	    {
                    	    pushFollow(FOLLOW_expr_in_function_app1839);
                    	    expr94=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr94.getTree());
                    	    // RuleSet2.g:515:27: ( ',' )?
                    	    int alt24=2;
                    	    int LA24_0 = input.LA(1);

                    	    if ( (LA24_0==45) ) {
                    	        alt24=1;
                    	    }
                    	    switch (alt24) {
                    	        case 1 :
                    	            // RuleSet2.g:515:27: ','
                    	            {
                    	            char_literal95=(Token)match(input,45,FOLLOW_45_in_function_app1841); if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) {
                    	            char_literal95_tree = (Object)adaptor.create(char_literal95);
                    	            adaptor.addChild(root_0, char_literal95_tree);
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

                    char_literal96=(Token)match(input,46,FOLLOW_46_in_function_app1846); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal96_tree = (Object)adaptor.create(char_literal96);
                    adaptor.addChild(root_0, char_literal96_tree);
                    }

                    }
                    break;
                case 2 :
                    // RuleSet2.g:516:4: VAR '(' ( expr ( ',' )? )* ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    VAR97=(Token)match(input,VAR,FOLLOW_VAR_in_function_app1852); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VAR97_tree = (Object)adaptor.create(VAR97);
                    adaptor.addChild(root_0, VAR97_tree);
                    }
                    char_literal98=(Token)match(input,44,FOLLOW_44_in_function_app1854); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal98_tree = (Object)adaptor.create(char_literal98);
                    adaptor.addChild(root_0, char_literal98_tree);
                    }
                    // RuleSet2.g:516:12: ( expr ( ',' )? )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( ((LA27_0>=VAR && LA27_0<=INT)||LA27_0==STRING||LA27_0==30||(LA27_0>=43 && LA27_0<=44)||(LA27_0>=54 && LA27_0<=55)||(LA27_0>=82 && LA27_0<=84)||(LA27_0>=86 && LA27_0<=89)) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // RuleSet2.g:516:13: expr ( ',' )?
                    	    {
                    	    pushFollow(FOLLOW_expr_in_function_app1857);
                    	    expr99=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr99.getTree());
                    	    // RuleSet2.g:516:18: ( ',' )?
                    	    int alt26=2;
                    	    int LA26_0 = input.LA(1);

                    	    if ( (LA26_0==45) ) {
                    	        alt26=1;
                    	    }
                    	    switch (alt26) {
                    	        case 1 :
                    	            // RuleSet2.g:516:18: ','
                    	            {
                    	            char_literal100=(Token)match(input,45,FOLLOW_45_in_function_app1859); if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) {
                    	            char_literal100_tree = (Object)adaptor.create(char_literal100);
                    	            adaptor.addChild(root_0, char_literal100_tree);
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

                    char_literal101=(Token)match(input,46,FOLLOW_46_in_function_app1864); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal101_tree = (Object)adaptor.create(char_literal101);
                    adaptor.addChild(root_0, char_literal101_tree);
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
    // RuleSet2.g:519:10: fragment namespace : VAR ':' ;
    public final RuleSet2Parser.namespace_return namespace() throws RecognitionException {
        RuleSet2Parser.namespace_return retval = new RuleSet2Parser.namespace_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VAR102=null;
        Token char_literal103=null;

        Object VAR102_tree=null;
        Object char_literal103_tree=null;

        try {
            // RuleSet2.g:520:2: ( VAR ':' )
            // RuleSet2.g:520:4: VAR ':'
            {
            root_0 = (Object)adaptor.nil();

            VAR102=(Token)match(input,VAR,FOLLOW_VAR_in_namespace1878); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            VAR102_tree = (Object)adaptor.create(VAR102);
            adaptor.addChild(root_0, VAR102_tree);
            }
            char_literal103=(Token)match(input,35,FOLLOW_35_in_namespace1880); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal103_tree = (Object)adaptor.create(char_literal103);
            adaptor.addChild(root_0, char_literal103_tree);
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
    // RuleSet2.g:523:1: trail_exp : ( 'current' var_domain ':' VAR | 'history' expr var_domain ':' VAR );
    public final RuleSet2Parser.trail_exp_return trail_exp() throws RecognitionException {
        RuleSet2Parser.trail_exp_return retval = new RuleSet2Parser.trail_exp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal104=null;
        Token char_literal106=null;
        Token VAR107=null;
        Token string_literal108=null;
        Token char_literal111=null;
        Token VAR112=null;
        RuleSet2Parser.var_domain_return var_domain105 = null;

        RuleSet2Parser.expr_return expr109 = null;

        RuleSet2Parser.var_domain_return var_domain110 = null;


        Object string_literal104_tree=null;
        Object char_literal106_tree=null;
        Object VAR107_tree=null;
        Object string_literal108_tree=null;
        Object char_literal111_tree=null;
        Object VAR112_tree=null;

        try {
            // RuleSet2.g:524:2: ( 'current' var_domain ':' VAR | 'history' expr var_domain ':' VAR )
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
                    // RuleSet2.g:524:3: 'current' var_domain ':' VAR
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal104=(Token)match(input,88,FOLLOW_88_in_trail_exp1893); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal104_tree = (Object)adaptor.create(string_literal104);
                    adaptor.addChild(root_0, string_literal104_tree);
                    }
                    pushFollow(FOLLOW_var_domain_in_trail_exp1895);
                    var_domain105=var_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, var_domain105.getTree());
                    char_literal106=(Token)match(input,35,FOLLOW_35_in_trail_exp1897); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal106_tree = (Object)adaptor.create(char_literal106);
                    adaptor.addChild(root_0, char_literal106_tree);
                    }
                    VAR107=(Token)match(input,VAR,FOLLOW_VAR_in_trail_exp1899); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VAR107_tree = (Object)adaptor.create(VAR107);
                    adaptor.addChild(root_0, VAR107_tree);
                    }

                    }
                    break;
                case 2 :
                    // RuleSet2.g:525:4: 'history' expr var_domain ':' VAR
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal108=(Token)match(input,89,FOLLOW_89_in_trail_exp1905); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal108_tree = (Object)adaptor.create(string_literal108);
                    adaptor.addChild(root_0, string_literal108_tree);
                    }
                    pushFollow(FOLLOW_expr_in_trail_exp1907);
                    expr109=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr109.getTree());
                    pushFollow(FOLLOW_var_domain_in_trail_exp1909);
                    var_domain110=var_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, var_domain110.getTree());
                    char_literal111=(Token)match(input,35,FOLLOW_35_in_trail_exp1911); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal111_tree = (Object)adaptor.create(char_literal111);
                    adaptor.addChild(root_0, char_literal111_tree);
                    }
                    VAR112=(Token)match(input,VAR,FOLLOW_VAR_in_trail_exp1913); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VAR112_tree = (Object)adaptor.create(VAR112);
                    adaptor.addChild(root_0, VAR112_tree);
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
    // RuleSet2.g:528:1: timeframe : 'within' expr ( period ) ;
    public final RuleSet2Parser.timeframe_return timeframe() throws RecognitionException {
        RuleSet2Parser.timeframe_return retval = new RuleSet2Parser.timeframe_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal113=null;
        RuleSet2Parser.expr_return expr114 = null;

        RuleSet2Parser.period_return period115 = null;


        Object string_literal113_tree=null;

        try {
            // RuleSet2.g:529:2: ( 'within' expr ( period ) )
            // RuleSet2.g:529:5: 'within' expr ( period )
            {
            root_0 = (Object)adaptor.nil();

            string_literal113=(Token)match(input,90,FOLLOW_90_in_timeframe1926); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal113_tree = (Object)adaptor.create(string_literal113);
            adaptor.addChild(root_0, string_literal113_tree);
            }
            pushFollow(FOLLOW_expr_in_timeframe1928);
            expr114=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr114.getTree());
            // RuleSet2.g:529:19: ( period )
            // RuleSet2.g:529:21: period
            {
            pushFollow(FOLLOW_period_in_timeframe1932);
            period115=period();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, period115.getTree());

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
    // RuleSet2.g:532:1: hash_line : STRING ':' expr ;
    public final RuleSet2Parser.hash_line_return hash_line() throws RecognitionException {
        RuleSet2Parser.hash_line_return retval = new RuleSet2Parser.hash_line_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STRING116=null;
        Token char_literal117=null;
        RuleSet2Parser.expr_return expr118 = null;


        Object STRING116_tree=null;
        Object char_literal117_tree=null;

        try {
            // RuleSet2.g:533:2: ( STRING ':' expr )
            // RuleSet2.g:533:4: STRING ':' expr
            {
            root_0 = (Object)adaptor.nil();

            STRING116=(Token)match(input,STRING,FOLLOW_STRING_in_hash_line1948); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING116_tree = (Object)adaptor.create(STRING116);
            adaptor.addChild(root_0, STRING116_tree);
            }
            char_literal117=(Token)match(input,35,FOLLOW_35_in_hash_line1950); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal117_tree = (Object)adaptor.create(char_literal117);
            adaptor.addChild(root_0, char_literal117_tree);
            }
            pushFollow(FOLLOW_expr_in_hash_line1952);
            expr118=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr118.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // RuleSet2.g:536:1: css_emit returns [String emit_value] : 'css' (h= HTML | h= STRING ) ;
    public final RuleSet2Parser.css_emit_return css_emit() throws RecognitionException {
        RuleSet2Parser.css_emit_return retval = new RuleSet2Parser.css_emit_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token h=null;
        Token string_literal119=null;

        Object h_tree=null;
        Object string_literal119_tree=null;

        try {
            // RuleSet2.g:537:2: ( 'css' (h= HTML | h= STRING ) )
            // RuleSet2.g:537:4: 'css' (h= HTML | h= STRING )
            {
            root_0 = (Object)adaptor.nil();

            string_literal119=(Token)match(input,91,FOLLOW_91_in_css_emit1967); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal119_tree = (Object)adaptor.create(string_literal119);
            adaptor.addChild(root_0, string_literal119_tree);
            }
            // RuleSet2.g:537:10: (h= HTML | h= STRING )
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
                    // RuleSet2.g:537:12: h= HTML
                    {
                    h=(Token)match(input,HTML,FOLLOW_HTML_in_css_emit1973); if (state.failed) return retval;
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
                    // RuleSet2.g:538:3: h= STRING
                    {
                    h=(Token)match(input,STRING,FOLLOW_STRING_in_css_emit1981); if (state.failed) return retval;
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
    // RuleSet2.g:542:10: fragment period : ( 'years' | 'months' | 'weeks' | 'days' | 'hours' | 'minutes' | 'seconds' | 'year' | 'month' | 'week' | 'day' | 'hour' | 'minute' | 'second' );
    public final RuleSet2Parser.period_return period() throws RecognitionException {
        RuleSet2Parser.period_return retval = new RuleSet2Parser.period_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set120=null;

        Object set120_tree=null;

        try {
            // RuleSet2.g:543:2: ( 'years' | 'months' | 'weeks' | 'days' | 'hours' | 'minutes' | 'seconds' | 'year' | 'month' | 'week' | 'day' | 'hour' | 'minute' | 'second' )
            // RuleSet2.g:
            {
            root_0 = (Object)adaptor.nil();

            set120=(Token)input.LT(1);
            if ( (input.LA(1)>=92 && input.LA(1)<=105) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set120));
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
    // RuleSet2.g:561:1: cachable returns [Object what] : ca= 'cachable' ( 'for' tm= INT per= period )? ;
    public final RuleSet2Parser.cachable_return cachable() throws RecognitionException {
        RuleSet2Parser.cachable_return retval = new RuleSet2Parser.cachable_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ca=null;
        Token tm=null;
        Token string_literal121=null;
        RuleSet2Parser.period_return per = null;


        Object ca_tree=null;
        Object tm_tree=null;
        Object string_literal121_tree=null;


        	retval.what = null;

        try {
            // RuleSet2.g:565:2: (ca= 'cachable' ( 'for' tm= INT per= period )? )
            // RuleSet2.g:566:3: ca= 'cachable' ( 'for' tm= INT per= period )?
            {
            root_0 = (Object)adaptor.nil();

            ca=(Token)match(input,106,FOLLOW_106_in_cachable2121); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ca_tree = (Object)adaptor.create(ca);
            adaptor.addChild(root_0, ca_tree);
            }
            // RuleSet2.g:566:17: ( 'for' tm= INT per= period )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==107) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // RuleSet2.g:566:18: 'for' tm= INT per= period
                    {
                    string_literal121=(Token)match(input,107,FOLLOW_107_in_cachable2124); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal121_tree = (Object)adaptor.create(string_literal121);
                    adaptor.addChild(root_0, string_literal121_tree);
                    }
                    tm=(Token)match(input,INT,FOLLOW_INT_in_cachable2128); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    tm_tree = (Object)adaptor.create(tm);
                    adaptor.addChild(root_0, tm_tree);
                    }
                    pushFollow(FOLLOW_period_in_cachable2132);
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
    // RuleSet2.g:586:1: emit_block returns [String emit_value] : 'emit' (h= HTML | h= STRING | h= JS ) ;
    public final RuleSet2Parser.emit_block_return emit_block() throws RecognitionException {
        RuleSet2Parser.emit_block_return retval = new RuleSet2Parser.emit_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token h=null;
        Token string_literal122=null;

        Object h_tree=null;
        Object string_literal122_tree=null;

        try {
            // RuleSet2.g:587:2: ( 'emit' (h= HTML | h= STRING | h= JS ) )
            // RuleSet2.g:587:4: 'emit' (h= HTML | h= STRING | h= JS )
            {
            root_0 = (Object)adaptor.nil();

            string_literal122=(Token)match(input,108,FOLLOW_108_in_emit_block2156); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal122_tree = (Object)adaptor.create(string_literal122);
            adaptor.addChild(root_0, string_literal122_tree);
            }
            // RuleSet2.g:587:11: (h= HTML | h= STRING | h= JS )
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
                    // RuleSet2.g:587:13: h= HTML
                    {
                    h=(Token)match(input,HTML,FOLLOW_HTML_in_emit_block2162); if (state.failed) return retval;
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
                    // RuleSet2.g:588:3: h= STRING
                    {
                    h=(Token)match(input,STRING,FOLLOW_STRING_in_emit_block2170); if (state.failed) return retval;
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
                    // RuleSet2.g:589:3: h= JS
                    {
                    h=(Token)match(input,JS,FOLLOW_JS_in_emit_block2178); if (state.failed) return retval;
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
    // RuleSet2.g:593:1: meta_block : 'meta' '{' ( 'description' desc= ( HTML | STRING ) | 'name' thename= STRING | 'author' author= STRING | 'key' what= ( 'errorstack' | 'googleanalytics' | 'twitter' | 'amazon' | 'kpds' | 'google' | VAR ) (key_value= STRING | '{' ( name_value_pair[key_values] ( ',' name_value_pair[key_values] )* ) '}' )+ | 'authz' 'require' 'user' | 'logging' ( 'on' | 'off' ) | 'use' 'module' name= VAR ( 'alias' alias= VAR )? | 'use' rtype= ( 'css' | 'javascript' ) 'resource' (url= STRING | name= VAR ) )* '}' ;
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
        Token string_literal123=null;
        Token char_literal124=null;
        Token string_literal125=null;
        Token string_literal126=null;
        Token string_literal127=null;
        Token string_literal128=null;
        Token char_literal129=null;
        Token char_literal131=null;
        Token char_literal133=null;
        Token string_literal134=null;
        Token string_literal135=null;
        Token string_literal136=null;
        Token string_literal137=null;
        Token set138=null;
        Token string_literal139=null;
        Token string_literal140=null;
        Token string_literal141=null;
        Token string_literal142=null;
        Token string_literal143=null;
        Token char_literal144=null;
        RuleSet2Parser.name_value_pair_return name_value_pair130 = null;

        RuleSet2Parser.name_value_pair_return name_value_pair132 = null;


        Object desc_tree=null;
        Object thename_tree=null;
        Object author_tree=null;
        Object what_tree=null;
        Object key_value_tree=null;
        Object name_tree=null;
        Object alias_tree=null;
        Object rtype_tree=null;
        Object url_tree=null;
        Object string_literal123_tree=null;
        Object char_literal124_tree=null;
        Object string_literal125_tree=null;
        Object string_literal126_tree=null;
        Object string_literal127_tree=null;
        Object string_literal128_tree=null;
        Object char_literal129_tree=null;
        Object char_literal131_tree=null;
        Object char_literal133_tree=null;
        Object string_literal134_tree=null;
        Object string_literal135_tree=null;
        Object string_literal136_tree=null;
        Object string_literal137_tree=null;
        Object set138_tree=null;
        Object string_literal139_tree=null;
        Object string_literal140_tree=null;
        Object string_literal141_tree=null;
        Object string_literal142_tree=null;
        Object string_literal143_tree=null;
        Object char_literal144_tree=null;


        	 HashMap meta_block_hash = (HashMap)rule_json.get("meta");
        	 ArrayList use_list = new ArrayList();
        	 HashMap keys_map = new HashMap();
        	 HashMap key_values = new HashMap();

        try {
            // RuleSet2.g:610:2: ( 'meta' '{' ( 'description' desc= ( HTML | STRING ) | 'name' thename= STRING | 'author' author= STRING | 'key' what= ( 'errorstack' | 'googleanalytics' | 'twitter' | 'amazon' | 'kpds' | 'google' | VAR ) (key_value= STRING | '{' ( name_value_pair[key_values] ( ',' name_value_pair[key_values] )* ) '}' )+ | 'authz' 'require' 'user' | 'logging' ( 'on' | 'off' ) | 'use' 'module' name= VAR ( 'alias' alias= VAR )? | 'use' rtype= ( 'css' | 'javascript' ) 'resource' (url= STRING | name= VAR ) )* '}' )
            // RuleSet2.g:610:4: 'meta' '{' ( 'description' desc= ( HTML | STRING ) | 'name' thename= STRING | 'author' author= STRING | 'key' what= ( 'errorstack' | 'googleanalytics' | 'twitter' | 'amazon' | 'kpds' | 'google' | VAR ) (key_value= STRING | '{' ( name_value_pair[key_values] ( ',' name_value_pair[key_values] )* ) '}' )+ | 'authz' 'require' 'user' | 'logging' ( 'on' | 'off' ) | 'use' 'module' name= VAR ( 'alias' alias= VAR )? | 'use' rtype= ( 'css' | 'javascript' ) 'resource' (url= STRING | name= VAR ) )* '}'
            {
            root_0 = (Object)adaptor.nil();

            string_literal123=(Token)match(input,109,FOLLOW_109_in_meta_block2210); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal123_tree = (Object)adaptor.create(string_literal123);
            adaptor.addChild(root_0, string_literal123_tree);
            }
            char_literal124=(Token)match(input,30,FOLLOW_30_in_meta_block2212); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal124_tree = (Object)adaptor.create(char_literal124);
            adaptor.addChild(root_0, char_literal124_tree);
            }
            // RuleSet2.g:611:2: ( 'description' desc= ( HTML | STRING ) | 'name' thename= STRING | 'author' author= STRING | 'key' what= ( 'errorstack' | 'googleanalytics' | 'twitter' | 'amazon' | 'kpds' | 'google' | VAR ) (key_value= STRING | '{' ( name_value_pair[key_values] ( ',' name_value_pair[key_values] )* ) '}' )+ | 'authz' 'require' 'user' | 'logging' ( 'on' | 'off' ) | 'use' 'module' name= VAR ( 'alias' alias= VAR )? | 'use' rtype= ( 'css' | 'javascript' ) 'resource' (url= STRING | name= VAR ) )*
            loop37:
            do {
                int alt37=9;
                alt37 = dfa37.predict(input);
                switch (alt37) {
            	case 1 :
            	    // RuleSet2.g:611:4: 'description' desc= ( HTML | STRING )
            	    {
            	    string_literal125=(Token)match(input,110,FOLLOW_110_in_meta_block2218); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal125_tree = (Object)adaptor.create(string_literal125);
            	    adaptor.addChild(root_0, string_literal125_tree);
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
            	    // RuleSet2.g:612:5: 'name' thename= STRING
            	    {
            	    string_literal126=(Token)match(input,111,FOLLOW_111_in_meta_block2236); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal126_tree = (Object)adaptor.create(string_literal126);
            	    adaptor.addChild(root_0, string_literal126_tree);
            	    }
            	    thename=(Token)match(input,STRING,FOLLOW_STRING_in_meta_block2240); if (state.failed) return retval;
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
            	    // RuleSet2.g:613:5: 'author' author= STRING
            	    {
            	    string_literal127=(Token)match(input,112,FOLLOW_112_in_meta_block2250); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal127_tree = (Object)adaptor.create(string_literal127);
            	    adaptor.addChild(root_0, string_literal127_tree);
            	    }
            	    author=(Token)match(input,STRING,FOLLOW_STRING_in_meta_block2254); if (state.failed) return retval;
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
            	    // RuleSet2.g:614:5: 'key' what= ( 'errorstack' | 'googleanalytics' | 'twitter' | 'amazon' | 'kpds' | 'google' | VAR ) (key_value= STRING | '{' ( name_value_pair[key_values] ( ',' name_value_pair[key_values] )* ) '}' )+
            	    {
            	    string_literal128=(Token)match(input,113,FOLLOW_113_in_meta_block2266); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal128_tree = (Object)adaptor.create(string_literal128);
            	    adaptor.addChild(root_0, string_literal128_tree);
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

            	    // RuleSet2.g:614:91: (key_value= STRING | '{' ( name_value_pair[key_values] ( ',' name_value_pair[key_values] )* ) '}' )+
            	    int cnt34=0;
            	    loop34:
            	    do {
            	        int alt34=3;
            	        int LA34_0 = input.LA(1);

            	        if ( (LA34_0==STRING) ) {
            	            alt34=1;
            	        }
            	        else if ( (LA34_0==30) ) {
            	            alt34=2;
            	        }


            	        switch (alt34) {
            	    	case 1 :
            	    	    // RuleSet2.g:614:92: key_value= STRING
            	    	    {
            	    	    key_value=(Token)match(input,STRING,FOLLOW_STRING_in_meta_block2292); if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) {
            	    	    key_value_tree = (Object)adaptor.create(key_value);
            	    	    adaptor.addChild(root_0, key_value_tree);
            	    	    }

            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // RuleSet2.g:614:111: '{' ( name_value_pair[key_values] ( ',' name_value_pair[key_values] )* ) '}'
            	    	    {
            	    	    char_literal129=(Token)match(input,30,FOLLOW_30_in_meta_block2296); if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) {
            	    	    char_literal129_tree = (Object)adaptor.create(char_literal129);
            	    	    adaptor.addChild(root_0, char_literal129_tree);
            	    	    }
            	    	    // RuleSet2.g:614:115: ( name_value_pair[key_values] ( ',' name_value_pair[key_values] )* )
            	    	    // RuleSet2.g:614:116: name_value_pair[key_values] ( ',' name_value_pair[key_values] )*
            	    	    {
            	    	    pushFollow(FOLLOW_name_value_pair_in_meta_block2299);
            	    	    name_value_pair130=name_value_pair(key_values);

            	    	    state._fsp--;
            	    	    if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, name_value_pair130.getTree());
            	    	    // RuleSet2.g:614:144: ( ',' name_value_pair[key_values] )*
            	    	    loop33:
            	    	    do {
            	    	        int alt33=2;
            	    	        int LA33_0 = input.LA(1);

            	    	        if ( (LA33_0==45) ) {
            	    	            alt33=1;
            	    	        }


            	    	        switch (alt33) {
            	    	    	case 1 :
            	    	    	    // RuleSet2.g:614:145: ',' name_value_pair[key_values]
            	    	    	    {
            	    	    	    char_literal131=(Token)match(input,45,FOLLOW_45_in_meta_block2303); if (state.failed) return retval;
            	    	    	    if ( state.backtracking==0 ) {
            	    	    	    char_literal131_tree = (Object)adaptor.create(char_literal131);
            	    	    	    adaptor.addChild(root_0, char_literal131_tree);
            	    	    	    }
            	    	    	    pushFollow(FOLLOW_name_value_pair_in_meta_block2305);
            	    	    	    name_value_pair132=name_value_pair(key_values);

            	    	    	    state._fsp--;
            	    	    	    if (state.failed) return retval;
            	    	    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, name_value_pair132.getTree());

            	    	    	    }
            	    	    	    break;

            	    	    	default :
            	    	    	    break loop33;
            	    	        }
            	    	    } while (true);


            	    	    }

            	    	    char_literal133=(Token)match(input,31,FOLLOW_31_in_meta_block2311); if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) {
            	    	    char_literal133_tree = (Object)adaptor.create(char_literal133);
            	    	    adaptor.addChild(root_0, char_literal133_tree);
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
            	    // RuleSet2.g:620:4: 'authz' 'require' 'user'
            	    {
            	    string_literal134=(Token)match(input,120,FOLLOW_120_in_meta_block2323); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal134_tree = (Object)adaptor.create(string_literal134);
            	    adaptor.addChild(root_0, string_literal134_tree);
            	    }
            	    string_literal135=(Token)match(input,121,FOLLOW_121_in_meta_block2325); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal135_tree = (Object)adaptor.create(string_literal135);
            	    adaptor.addChild(root_0, string_literal135_tree);
            	    }
            	    string_literal136=(Token)match(input,122,FOLLOW_122_in_meta_block2327); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal136_tree = (Object)adaptor.create(string_literal136);
            	    adaptor.addChild(root_0, string_literal136_tree);
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
            	    // RuleSet2.g:626:4: 'logging' ( 'on' | 'off' )
            	    {
            	    string_literal137=(Token)match(input,123,FOLLOW_123_in_meta_block2334); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal137_tree = (Object)adaptor.create(string_literal137);
            	    adaptor.addChild(root_0, string_literal137_tree);
            	    }
            	    set138=(Token)input.LT(1);
            	    if ( (input.LA(1)>=124 && input.LA(1)<=125) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set138));
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
            	    // RuleSet2.g:627:4: 'use' 'module' name= VAR ( 'alias' alias= VAR )?
            	    {
            	    string_literal139=(Token)match(input,126,FOLLOW_126_in_meta_block2347); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal139_tree = (Object)adaptor.create(string_literal139);
            	    adaptor.addChild(root_0, string_literal139_tree);
            	    }
            	    string_literal140=(Token)match(input,127,FOLLOW_127_in_meta_block2349); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal140_tree = (Object)adaptor.create(string_literal140);
            	    adaptor.addChild(root_0, string_literal140_tree);
            	    }
            	    name=(Token)match(input,VAR,FOLLOW_VAR_in_meta_block2353); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    name_tree = (Object)adaptor.create(name);
            	    adaptor.addChild(root_0, name_tree);
            	    }
            	    // RuleSet2.g:627:28: ( 'alias' alias= VAR )?
            	    int alt35=2;
            	    int LA35_0 = input.LA(1);

            	    if ( (LA35_0==128) ) {
            	        alt35=1;
            	    }
            	    switch (alt35) {
            	        case 1 :
            	            // RuleSet2.g:627:29: 'alias' alias= VAR
            	            {
            	            string_literal141=(Token)match(input,128,FOLLOW_128_in_meta_block2356); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal141_tree = (Object)adaptor.create(string_literal141);
            	            adaptor.addChild(root_0, string_literal141_tree);
            	            }
            	            alias=(Token)match(input,VAR,FOLLOW_VAR_in_meta_block2360); if (state.failed) return retval;
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
            	    // RuleSet2.g:636:4: 'use' rtype= ( 'css' | 'javascript' ) 'resource' (url= STRING | name= VAR )
            	    {
            	    string_literal142=(Token)match(input,126,FOLLOW_126_in_meta_block2369); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal142_tree = (Object)adaptor.create(string_literal142);
            	    adaptor.addChild(root_0, string_literal142_tree);
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

            	    string_literal143=(Token)match(input,130,FOLLOW_130_in_meta_block2381); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal143_tree = (Object)adaptor.create(string_literal143);
            	    adaptor.addChild(root_0, string_literal143_tree);
            	    }
            	    // RuleSet2.g:636:50: (url= STRING | name= VAR )
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
            	            // RuleSet2.g:636:51: url= STRING
            	            {
            	            url=(Token)match(input,STRING,FOLLOW_STRING_in_meta_block2386); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            url_tree = (Object)adaptor.create(url);
            	            adaptor.addChild(root_0, url_tree);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // RuleSet2.g:636:64: name= VAR
            	            {
            	            name=(Token)match(input,VAR,FOLLOW_VAR_in_meta_block2392); if (state.failed) return retval;
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

            char_literal144=(Token)match(input,31,FOLLOW_31_in_meta_block2405); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal144_tree = (Object)adaptor.create(char_literal144);
            adaptor.addChild(root_0, char_literal144_tree);
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
    // RuleSet2.g:661:1: dispatch_block : 'dispatch' '{' ( 'domain' domain= STRING ( '->' rsid= STRING )? )* '}' ;
    public final RuleSet2Parser.dispatch_block_return dispatch_block() throws RecognitionException {
        RuleSet2Parser.dispatch_block_return retval = new RuleSet2Parser.dispatch_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token domain=null;
        Token rsid=null;
        Token string_literal145=null;
        Token char_literal146=null;
        Token string_literal147=null;
        Token string_literal148=null;
        Token char_literal149=null;

        Object domain_tree=null;
        Object rsid_tree=null;
        Object string_literal145_tree=null;
        Object char_literal146_tree=null;
        Object string_literal147_tree=null;
        Object string_literal148_tree=null;
        Object char_literal149_tree=null;


        	 ArrayList dispatch_block_array = (ArrayList)rule_json.get("dispatch");

        try {
            // RuleSet2.g:667:2: ( 'dispatch' '{' ( 'domain' domain= STRING ( '->' rsid= STRING )? )* '}' )
            // RuleSet2.g:667:4: 'dispatch' '{' ( 'domain' domain= STRING ( '->' rsid= STRING )? )* '}'
            {
            root_0 = (Object)adaptor.nil();

            string_literal145=(Token)match(input,131,FOLLOW_131_in_dispatch_block2436); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal145_tree = (Object)adaptor.create(string_literal145);
            adaptor.addChild(root_0, string_literal145_tree);
            }
            char_literal146=(Token)match(input,30,FOLLOW_30_in_dispatch_block2438); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal146_tree = (Object)adaptor.create(char_literal146);
            adaptor.addChild(root_0, char_literal146_tree);
            }
            // RuleSet2.g:667:19: ( 'domain' domain= STRING ( '->' rsid= STRING )? )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==132) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // RuleSet2.g:667:20: 'domain' domain= STRING ( '->' rsid= STRING )?
            	    {
            	    string_literal147=(Token)match(input,132,FOLLOW_132_in_dispatch_block2441); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal147_tree = (Object)adaptor.create(string_literal147);
            	    adaptor.addChild(root_0, string_literal147_tree);
            	    }
            	    domain=(Token)match(input,STRING,FOLLOW_STRING_in_dispatch_block2445); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    domain_tree = (Object)adaptor.create(domain);
            	    adaptor.addChild(root_0, domain_tree);
            	    }
            	    // RuleSet2.g:667:43: ( '->' rsid= STRING )?
            	    int alt38=2;
            	    int LA38_0 = input.LA(1);

            	    if ( (LA38_0==133) ) {
            	        alt38=1;
            	    }
            	    switch (alt38) {
            	        case 1 :
            	            // RuleSet2.g:667:44: '->' rsid= STRING
            	            {
            	            string_literal148=(Token)match(input,133,FOLLOW_133_in_dispatch_block2448); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal148_tree = (Object)adaptor.create(string_literal148);
            	            adaptor.addChild(root_0, string_literal148_tree);
            	            }
            	            rsid=(Token)match(input,STRING,FOLLOW_STRING_in_dispatch_block2452); if (state.failed) return retval;
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

            char_literal149=(Token)match(input,31,FOLLOW_31_in_dispatch_block2462); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal149_tree = (Object)adaptor.create(char_literal149);
            adaptor.addChild(root_0, char_literal149_tree);
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
    // RuleSet2.g:681:1: name_value_pair[HashMap key_values] : k= STRING ':' (v= INT | v= FLOAT | v= STRING ) ;
    public final RuleSet2Parser.name_value_pair_return name_value_pair(HashMap key_values) throws RecognitionException {
        RuleSet2Parser.name_value_pair_return retval = new RuleSet2Parser.name_value_pair_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token k=null;
        Token v=null;
        Token char_literal150=null;

        Object k_tree=null;
        Object v_tree=null;
        Object char_literal150_tree=null;


        	Object value = null;

        try {
            // RuleSet2.g:685:2: (k= STRING ':' (v= INT | v= FLOAT | v= STRING ) )
            // RuleSet2.g:685:4: k= STRING ':' (v= INT | v= FLOAT | v= STRING )
            {
            root_0 = (Object)adaptor.nil();

            k=(Token)match(input,STRING,FOLLOW_STRING_in_name_value_pair2485); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            k_tree = (Object)adaptor.create(k);
            adaptor.addChild(root_0, k_tree);
            }
            char_literal150=(Token)match(input,35,FOLLOW_35_in_name_value_pair2487); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal150_tree = (Object)adaptor.create(char_literal150);
            adaptor.addChild(root_0, char_literal150_tree);
            }
            // RuleSet2.g:685:17: (v= INT | v= FLOAT | v= STRING )
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
                    // RuleSet2.g:686:3: v= INT
                    {
                    v=(Token)match(input,INT,FOLLOW_INT_in_name_value_pair2495); if (state.failed) return retval;
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
                    // RuleSet2.g:687:5: v= FLOAT
                    {
                    v=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_name_value_pair2506); if (state.failed) return retval;
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
                    // RuleSet2.g:688:5: v= STRING
                    {
                    v=(Token)match(input,STRING,FOLLOW_STRING_in_name_value_pair2517); if (state.failed) return retval;
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
        // RuleSet2.g:458:2: ( 'seen' STRING 'in' var_domain ':' VAR timeframe )
        // RuleSet2.g:458:2: 'seen' STRING 'in' var_domain ':' VAR timeframe
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
        // RuleSet2.g:459:2: ( 'seen' STRING ( 'before' | 'after' ) STRING 'in' var_domain ':' VAR )
        // RuleSet2.g:459:2: 'seen' STRING ( 'before' | 'after' ) STRING 'in' var_domain ':' VAR
        {
        match(input,55,FOLLOW_55_in_synpred3_RuleSet21387); if (state.failed) return ;
        match(input,STRING,FOLLOW_STRING_in_synpred3_RuleSet21389); if (state.failed) return ;
        if ( (input.LA(1)>=57 && input.LA(1)<=58) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }

        match(input,STRING,FOLLOW_STRING_in_synpred3_RuleSet21399); if (state.failed) return ;
        match(input,56,FOLLOW_56_in_synpred3_RuleSet21401); if (state.failed) return ;
        pushFollow(FOLLOW_var_domain_in_synpred3_RuleSet21403);
        var_domain();

        state._fsp--;
        if (state.failed) return ;
        match(input,35,FOLLOW_35_in_synpred3_RuleSet21405); if (state.failed) return ;
        match(input,VAR,FOLLOW_VAR_in_synpred3_RuleSet21407); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_RuleSet2

    // $ANTLR start synpred4_RuleSet2
    public final void synpred4_RuleSet2_fragment() throws RecognitionException {   
        // RuleSet2.g:460:2: ( var_domain ':' VAR predop expr timeframe )
        // RuleSet2.g:460:2: var_domain ':' VAR predop expr timeframe
        {
        pushFollow(FOLLOW_var_domain_in_synpred4_RuleSet21412);
        var_domain();

        state._fsp--;
        if (state.failed) return ;
        match(input,35,FOLLOW_35_in_synpred4_RuleSet21414); if (state.failed) return ;
        match(input,VAR,FOLLOW_VAR_in_synpred4_RuleSet21416); if (state.failed) return ;
        pushFollow(FOLLOW_predop_in_synpred4_RuleSet21418);
        predop();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred4_RuleSet21420);
        expr();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_timeframe_in_synpred4_RuleSet21422);
        timeframe();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_RuleSet2

    // $ANTLR start synpred5_RuleSet2
    public final void synpred5_RuleSet2_fragment() throws RecognitionException {   
        // RuleSet2.g:461:2: ( var_domain ':' VAR timeframe )
        // RuleSet2.g:461:2: var_domain ':' VAR timeframe
        {
        pushFollow(FOLLOW_var_domain_in_synpred5_RuleSet21427);
        var_domain();

        state._fsp--;
        if (state.failed) return ;
        match(input,35,FOLLOW_35_in_synpred5_RuleSet21429); if (state.failed) return ;
        match(input,VAR,FOLLOW_VAR_in_synpred5_RuleSet21431); if (state.failed) return ;
        pushFollow(FOLLOW_timeframe_in_synpred5_RuleSet21433);
        timeframe();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_RuleSet2

    // $ANTLR start synpred10_RuleSet2
    public final void synpred10_RuleSet2_fragment() throws RecognitionException {   
        // RuleSet2.g:496:9: ( VAR '[' expr ']' )
        // RuleSet2.g:496:9: VAR '[' expr ']'
        {
        match(input,VAR,FOLLOW_VAR_in_synpred10_RuleSet21690); if (state.failed) return ;
        match(input,84,FOLLOW_84_in_synpred10_RuleSet21692); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred10_RuleSet21694);
        expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,85,FOLLOW_85_in_synpred10_RuleSet21696); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_RuleSet2

    // $ANTLR start synpred13_RuleSet2
    public final void synpred13_RuleSet2_fragment() throws RecognitionException {   
        // RuleSet2.g:499:9: ( function_app )
        // RuleSet2.g:499:9: function_app
        {
        pushFollow(FOLLOW_function_app_in_synpred13_RuleSet21730);
        function_app();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_RuleSet2

    // $ANTLR start synpred16_RuleSet2
    public final void synpred16_RuleSet2_fragment() throws RecognitionException {   
        Token v=null;

        // RuleSet2.g:502:9: (v= VAR )
        // RuleSet2.g:502:9: v= VAR
        {
        v=(Token)match(input,VAR,FOLLOW_VAR_in_synpred16_RuleSet21778); if (state.failed) return ;

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
            "\2\4\6\uffff\1\4\21\uffff\1\4\15\uffff\1\4\11\uffff\1\1\1\2"+
            "\32\uffff\3\4\1\uffff\2\3\2\4",
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
            "\1\5\1\1\6\uffff\1\2\21\uffff\1\12\15\uffff\1\13\45\uffff\1"+
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
            return "486:1: factor returns [Object result] options {backtrack=true; } : (v= INT | v= STRING | v= 'true' | v= 'false' | VAR '[' expr ']' | var_domain ':' VAR | trail_exp | function_app | '[' expr ',' ']' | '{' ( hash_line ( ',' )? )* '}' | v= VAR | '(' e= expr ')' );";
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
        "\1\37\7\uffff\1\133\2\uffff";
    static final String DFA37_maxS =
        "\1\176\7\uffff\1\u0081\2\uffff";
    static final String DFA37_acceptS =
        "\1\uffff\1\11\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\7\1\10";
    static final String DFA37_specialS =
        "\13\uffff}>";
    static final String[] DFA37_transitionS = {
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
            return "()* loopback of 611:2: ( 'description' desc= ( HTML | STRING ) | 'name' thename= STRING | 'author' author= STRING | 'key' what= ( 'errorstack' | 'googleanalytics' | 'twitter' | 'amazon' | 'kpds' | 'google' | VAR ) (key_value= STRING | '{' ( name_value_pair[key_values] ( ',' name_value_pair[key_values] )* ) '}' )+ | 'authz' 'require' 'user' | 'logging' ( 'on' | 'off' ) | 'use' 'module' name= VAR ( 'alias' alias= VAR )? | 'use' rtype= ( 'css' | 'javascript' ) 'resource' (url= STRING | name= VAR ) )*";
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
    public static final BitSet FOLLOW_56_in_unary_expr1374 = new BitSet(new long[]{0x0000000000000000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_var_domain_in_unary_expr1376 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_unary_expr1378 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_unary_expr1380 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_timeframe_in_unary_expr1382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_unary_expr1387 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_STRING_in_unary_expr1389 = new BitSet(new long[]{0x0600000000000000L});
    public static final BitSet FOLLOW_set_in_unary_expr1391 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_STRING_in_unary_expr1399 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_unary_expr1401 = new BitSet(new long[]{0x0000000000000000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_var_domain_in_unary_expr1403 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_unary_expr1405 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_unary_expr1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_domain_in_unary_expr1412 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_unary_expr1414 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_unary_expr1416 = new BitSet(new long[]{0x0000000007FC0000L});
    public static final BitSet FOLLOW_predop_in_unary_expr1418 = new BitSet(new long[]{0x00C0180040001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_expr_in_unary_expr1420 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_timeframe_in_unary_expr1422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_domain_in_unary_expr1427 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_unary_expr1429 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_unary_expr1431 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_timeframe_in_unary_expr1433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operator_expr_in_unary_expr1440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_operator_expr1467 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_operator_in_operator_expr1473 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_59_in_operator1487 = new BitSet(new long[]{0xF000000000000000L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_operator_op_in_operator1489 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_operator1491 = new BitSet(new long[]{0x00C0180040001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_expr_in_operator1493 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_45_in_operator1495 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_operator1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operator_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_factor1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_factor1643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_factor1662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_factor1677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_factor1690 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_factor1692 = new BitSet(new long[]{0x00C0180040001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_expr_in_factor1694 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_factor1696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_domain_in_factor1706 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_factor1708 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_factor1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_trail_exp_in_factor1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_app_in_factor1730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_factor1740 = new BitSet(new long[]{0x00C0180040001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_expr_in_factor1742 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_factor1744 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_factor1746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_factor1756 = new BitSet(new long[]{0x0000000080001000L});
    public static final BitSet FOLLOW_hash_line_in_factor1759 = new BitSet(new long[]{0x0000200080001000L});
    public static final BitSet FOLLOW_45_in_factor1761 = new BitSet(new long[]{0x0000000080001000L});
    public static final BitSet FOLLOW_31_in_factor1766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_factor1778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_factor1791 = new BitSet(new long[]{0x00C0180040001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_expr_in_factor1795 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_factor1797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_var_domain0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namespace_in_function_app1832 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_function_app1834 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_function_app1836 = new BitSet(new long[]{0x00C0580040001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_expr_in_function_app1839 = new BitSet(new long[]{0x00C0780040001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_45_in_function_app1841 = new BitSet(new long[]{0x00C0580040001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_46_in_function_app1846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_function_app1852 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_function_app1854 = new BitSet(new long[]{0x00C0580040001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_expr_in_function_app1857 = new BitSet(new long[]{0x00C0780040001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_45_in_function_app1859 = new BitSet(new long[]{0x00C0580040001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_46_in_function_app1864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_namespace1878 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_namespace1880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_trail_exp1893 = new BitSet(new long[]{0x0000000000000000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_var_domain_in_trail_exp1895 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_trail_exp1897 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_trail_exp1899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_trail_exp1905 = new BitSet(new long[]{0x00C0180040001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_expr_in_trail_exp1907 = new BitSet(new long[]{0x0000000000000000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_var_domain_in_trail_exp1909 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_trail_exp1911 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_trail_exp1913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_timeframe1926 = new BitSet(new long[]{0x00C0180040001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_expr_in_timeframe1928 = new BitSet(new long[]{0x0000000000000000L,0x000003FFF0000000L});
    public static final BitSet FOLLOW_period_in_timeframe1932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_hash_line1948 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_hash_line1950 = new BitSet(new long[]{0x00C0180040001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_expr_in_hash_line1952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_css_emit1967 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_HTML_in_css_emit1973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_css_emit1981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_period0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_cachable2121 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_cachable2124 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_INT_in_cachable2128 = new BitSet(new long[]{0x0000000000000000L,0x000003FFF0000000L});
    public static final BitSet FOLLOW_period_in_cachable2132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_emit_block2156 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_HTML_in_emit_block2162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_emit_block2170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JS_in_emit_block2178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_meta_block2210 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_meta_block2212 = new BitSet(new long[]{0x0000000080000000L,0x4903C00000000000L});
    public static final BitSet FOLLOW_110_in_meta_block2218 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_set_in_meta_block2222 = new BitSet(new long[]{0x0000000080000000L,0x4903C00000000000L});
    public static final BitSet FOLLOW_111_in_meta_block2236 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_STRING_in_meta_block2240 = new BitSet(new long[]{0x0000000080000000L,0x4903C00000000000L});
    public static final BitSet FOLLOW_112_in_meta_block2250 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_STRING_in_meta_block2254 = new BitSet(new long[]{0x0000000080000000L,0x4903C00000000000L});
    public static final BitSet FOLLOW_113_in_meta_block2266 = new BitSet(new long[]{0x0000000000000010L,0x00FC000000000000L});
    public static final BitSet FOLLOW_set_in_meta_block2270 = new BitSet(new long[]{0x0000000040001000L});
    public static final BitSet FOLLOW_STRING_in_meta_block2292 = new BitSet(new long[]{0x00000000C0001000L,0x4903C00000000000L});
    public static final BitSet FOLLOW_30_in_meta_block2296 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_name_value_pair_in_meta_block2299 = new BitSet(new long[]{0x0000200080000000L});
    public static final BitSet FOLLOW_45_in_meta_block2303 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_name_value_pair_in_meta_block2305 = new BitSet(new long[]{0x0000200080000000L});
    public static final BitSet FOLLOW_31_in_meta_block2311 = new BitSet(new long[]{0x00000000C0001000L,0x4903C00000000000L});
    public static final BitSet FOLLOW_120_in_meta_block2323 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_121_in_meta_block2325 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_meta_block2327 = new BitSet(new long[]{0x0000000080000000L,0x4903C00000000000L});
    public static final BitSet FOLLOW_123_in_meta_block2334 = new BitSet(new long[]{0x0000000000000000L,0x3000000000000000L});
    public static final BitSet FOLLOW_set_in_meta_block2336 = new BitSet(new long[]{0x0000000080000000L,0x4903C00000000000L});
    public static final BitSet FOLLOW_126_in_meta_block2347 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_meta_block2349 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_meta_block2353 = new BitSet(new long[]{0x0000000080000000L,0x4903C00000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_128_in_meta_block2356 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_meta_block2360 = new BitSet(new long[]{0x0000000080000000L,0x4903C00000000000L});
    public static final BitSet FOLLOW_126_in_meta_block2369 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_meta_block2373 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_130_in_meta_block2381 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_STRING_in_meta_block2386 = new BitSet(new long[]{0x0000000080000000L,0x4903C00000000000L});
    public static final BitSet FOLLOW_VAR_in_meta_block2392 = new BitSet(new long[]{0x0000000080000000L,0x4903C00000000000L});
    public static final BitSet FOLLOW_31_in_meta_block2405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_dispatch_block2436 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_dispatch_block2438 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_132_in_dispatch_block2441 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_STRING_in_dispatch_block2445 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_133_in_dispatch_block2448 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_STRING_in_dispatch_block2452 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_31_in_dispatch_block2462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_name_value_pair2485 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_name_value_pair2487 = new BitSet(new long[]{0x00000000000010A0L});
    public static final BitSet FOLLOW_INT_in_name_value_pair2495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_name_value_pair2506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_name_value_pair2517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_synpred2_RuleSet21370 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_STRING_in_synpred2_RuleSet21372 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_synpred2_RuleSet21374 = new BitSet(new long[]{0x0000000000000000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_var_domain_in_synpred2_RuleSet21376 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_synpred2_RuleSet21378 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_synpred2_RuleSet21380 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_timeframe_in_synpred2_RuleSet21382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_synpred3_RuleSet21387 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_STRING_in_synpred3_RuleSet21389 = new BitSet(new long[]{0x0600000000000000L});
    public static final BitSet FOLLOW_set_in_synpred3_RuleSet21391 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_STRING_in_synpred3_RuleSet21399 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_synpred3_RuleSet21401 = new BitSet(new long[]{0x0000000000000000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_var_domain_in_synpred3_RuleSet21403 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_synpred3_RuleSet21405 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_synpred3_RuleSet21407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_domain_in_synpred4_RuleSet21412 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_synpred4_RuleSet21414 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_synpred4_RuleSet21416 = new BitSet(new long[]{0x0000000007FC0000L});
    public static final BitSet FOLLOW_predop_in_synpred4_RuleSet21418 = new BitSet(new long[]{0x00C0180040001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_expr_in_synpred4_RuleSet21420 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_timeframe_in_synpred4_RuleSet21422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_domain_in_synpred5_RuleSet21427 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_synpred5_RuleSet21429 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_synpred5_RuleSet21431 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_timeframe_in_synpred5_RuleSet21433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_synpred10_RuleSet21690 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_synpred10_RuleSet21692 = new BitSet(new long[]{0x00C0180040001030L,0x0000000003DC0000L});
    public static final BitSet FOLLOW_expr_in_synpred10_RuleSet21694 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_synpred10_RuleSet21696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_app_in_synpred13_RuleSet21730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_synpred16_RuleSet21778 = new BitSet(new long[]{0x0000000000000002L});

}