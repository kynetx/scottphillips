// $ANTLR 3.2 Sep 23, 2009 12:02:23 RuleSet2.g 2010-07-26 12:03:35

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "VAR", "INT", "EXPONENT", "FLOAT", "COMMENT", "WS", "ESC_SEQ", "STRING", "REGEXP", "HTML", "JS", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "'<='", "'>='", "'<'", "'>'", "'=='", "'!='", "'eq'", "'neq'", "'like'", "'+'", "'-'", "'{'", "'}'", "';'", "'if'", "'callbacks'", "'success'", "'failure'", "'='", "':'", "'forget'", "'mark'", "'with'", "'+='", "'-='", "'for'", "'=>'", "'('", "','", "')'", "'and'", "'using'", "'setting'", "'pre'", "'foreach'", "'when'", "'or'", "'not'", "'between'", "'web'", "'pageview'", "'on'", "'global'", "'JSON'", "'XML'", "'RSS'", "'HTML'", "'<-'", "'function'", "'|'", "'||'", "'&&'", "'*'", "'/'", "'%'", "'seen'", "'.pick'", "'.match'", "'.length'", "'.replace'", "'.as'", "'.head'", "'.tail'", "'.sort'", "'.filter'", "'.map'", "'.uc'", "'.lc'", "'.split'", "'.join'", "'.query'", "'.has'", "'.union'", "'.difference'", "'.intersection'", "'.unique'", "'.once'", "'.duplicates'", "'true'", "'false'", "'['", "']'", "'current'", "'history'", "'ent'", "'app'", "'within'", "'css'", "'cachable'", "'emit'", "'meta'", "'key'", "'authz'", "'require'", "'logging'", "'off'", "'use'", "'javascript'", "'module'", "'alias'", "'->'"
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
    public static final int REGEXP=12;
    public static final int VAR=4;
    public static final int COMMENT=8;
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
    public static final int WS=9;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
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
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int FLOAT=7;
    public static final int HTML=13;
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
    public static final int UNICODE_ESC=16;
    public static final int JS=14;
    public static final int HEX_DIGIT=15;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
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
    public static final int STRING=11;

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

     
    	public boolean check_operator = false;
    	public HashMap rule_json = new HashMap();
    	public HashMap current_top = null;

    	public boolean checkname = true;
    	
    	public class InvalidToken extends RecognitionException 
    	{	 
    		String aMessage = "";
    		public InvalidToken(String inMessage, org.antlr.runtime.IntStream intstream)
    		{		
    			super(intstream);
    			aMessage = inMessage;
    		}
    		
    		public String getMessage()
    		{
    			return aMessage;
    		}
    	
    	}

    	public String strip_string(String value)
    	{ 
    		return value.substring(1,value.length() - 1);
    	}

    	public boolean isIn(String value,String[] other_values)
    	{
    		for(int i=0;i<other_values.length;i++)
    		{
    			if(value.equals(other_values[i]))
    				return true;
    		}		
    		return false;
    	}	
    	public String should_have_been(String value,String[] values)
    	{
    		if(values.length == 0)
    		{
    			return "Invalid value [" + value + "] found should have been " + values[0];			
    		}
    		else
    		{
    			String result = "Invalid value [" + value + "] found should have been one of [";
    			for(int i=0;i<values.length;i++)
    			{
    				result = result + values[i];
    				if(i < values.length - 1)
    				{
    					result = result + ", ";
    				}	
    			}
    			result = result + "]";
    			return result;
    		}
    	
    	}
    	
    	public void cn(String value,String[] values, org.antlr.runtime.IntStream input)  throws InvalidToken
    	{
    		for(int i=0;i<values.length;i++)
    		{
    			if(value.equals(values[i]))
    				return;
    		}
    		throw new InvalidToken(should_have_been(value,values), input); 
    	} 
    	/*
    	 * Strip Crap off that we do not want any more.
    	 */
    	public String strip_wrappers(String start, String end, String value)
    	{
    		return value.substring(start.length(),value.length() - end.length());	
    	}

    	public String[] sar(String ... values)
    	{
    		return values;
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
    // RuleSet2.g:177:1: predop : ( '<=' | '>=' | '<' | '>' | '==' | '!=' | 'eq' | 'neq' | 'like' );
    public final RuleSet2Parser.predop_return predop() throws RecognitionException {
        RuleSet2Parser.predop_return retval = new RuleSet2Parser.predop_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set1=null;

        Object set1_tree=null;

        try {
            // RuleSet2.g:177:7: ( '<=' | '>=' | '<' | '>' | '==' | '!=' | 'eq' | 'neq' | 'like' )
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
    // RuleSet2.g:179:1: add_op : ( '+' | '-' );
    public final RuleSet2Parser.add_op_return add_op() throws RecognitionException {
        RuleSet2Parser.add_op_return retval = new RuleSet2Parser.add_op_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set2=null;

        Object set2_tree=null;

        try {
            // RuleSet2.g:179:7: ( '+' | '-' )
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
    // RuleSet2.g:272:1: ruleset options {backtrack=false; } : must_be[\"ruleset\"] rulesetname '{' ( meta_block | dispatch_block | global_block | rule )* '}' EOF ;
    public final RuleSet2Parser.ruleset_return ruleset() throws RecognitionException {
        RuleSet2Parser.ruleset_return retval = new RuleSet2Parser.ruleset_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal5=null;
        Token char_literal10=null;
        Token EOF11=null;
        RuleSet2Parser.must_be_return must_be3 = null;

        RuleSet2Parser.rulesetname_return rulesetname4 = null;

        RuleSet2Parser.meta_block_return meta_block6 = null;

        RuleSet2Parser.dispatch_block_return dispatch_block7 = null;

        RuleSet2Parser.global_block_return global_block8 = null;

        RuleSet2Parser.rule_return rule9 = null;


        Object char_literal5_tree=null;
        Object char_literal10_tree=null;
        Object EOF11_tree=null;


         	 rule_json.put("global",new ArrayList());
         	 rule_json.put("dispatch",new ArrayList());
         	 rule_json.put("rules",new ArrayList());
         	 rule_json.put("meta", new HashMap());
        	 current_top = rule_json; 

        try {
            // RuleSet2.g:283:3: ( must_be[\"ruleset\"] rulesetname '{' ( meta_block | dispatch_block | global_block | rule )* '}' EOF )
            // RuleSet2.g:284:3: must_be[\"ruleset\"] rulesetname '{' ( meta_block | dispatch_block | global_block | rule )* '}' EOF
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_must_be_in_ruleset846);
            must_be3=must_be("ruleset");

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, must_be3.getTree());
            pushFollow(FOLLOW_rulesetname_in_ruleset852);
            rulesetname4=rulesetname();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, rulesetname4.getTree());
            if ( state.backtracking==0 ) {
               current_top.put("ruleset_name",(rulesetname4!=null?input.toString(rulesetname4.start,rulesetname4.stop):null)); 
            }
            char_literal5=(Token)match(input,29,FOLLOW_29_in_ruleset859); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal5_tree = (Object)adaptor.create(char_literal5);
            adaptor.addChild(root_0, char_literal5_tree);
            }
            // RuleSet2.g:287:3: ( meta_block | dispatch_block | global_block | rule )*
            loop1:
            do {
                int alt1=5;
                switch ( input.LA(1) ) {
                case 108:
                    {
                    alt1=1;
                    }
                    break;
                case VAR:
                    {
                    int LA1_3 = input.LA(2);

                    if ( ((LA1_3>=VAR && LA1_3<=INT)) ) {
                        alt1=4;
                    }
                    else if ( (LA1_3==29) ) {
                        alt1=2;
                    }


                    }
                    break;
                case 60:
                    {
                    alt1=3;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // RuleSet2.g:287:5: meta_block
            	    {
            	    pushFollow(FOLLOW_meta_block_in_ruleset866);
            	    meta_block6=meta_block();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, meta_block6.getTree());

            	    }
            	    break;
            	case 2 :
            	    // RuleSet2.g:287:18: dispatch_block
            	    {
            	    pushFollow(FOLLOW_dispatch_block_in_ruleset870);
            	    dispatch_block7=dispatch_block();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, dispatch_block7.getTree());

            	    }
            	    break;
            	case 3 :
            	    // RuleSet2.g:287:35: global_block
            	    {
            	    pushFollow(FOLLOW_global_block_in_ruleset874);
            	    global_block8=global_block();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, global_block8.getTree());

            	    }
            	    break;
            	case 4 :
            	    // RuleSet2.g:287:50: rule
            	    {
            	    pushFollow(FOLLOW_rule_in_ruleset878);
            	    rule9=rule();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, rule9.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            char_literal10=(Token)match(input,30,FOLLOW_30_in_ruleset884); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal10_tree = (Object)adaptor.create(char_literal10);
            adaptor.addChild(root_0, char_literal10_tree);
            }
            EOF11=(Token)match(input,EOF,FOLLOW_EOF_in_ruleset888); if (state.failed) return retval;
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

    public static class must_be_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "must_be"
    // RuleSet2.g:292:1: must_be[String what] : v= VAR ;
    public final RuleSet2Parser.must_be_return must_be(String what) throws RecognitionException {
        RuleSet2Parser.must_be_return retval = new RuleSet2Parser.must_be_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token v=null;

        Object v_tree=null;

        try {
            // RuleSet2.g:293:3: (v= VAR )
            // RuleSet2.g:294:3: v= VAR
            {
            root_0 = (Object)adaptor.nil();

            v=(Token)match(input,VAR,FOLLOW_VAR_in_must_be911); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            v_tree = (Object)adaptor.create(v);
            adaptor.addChild(root_0, v_tree);
            }
            if ( state.backtracking==0 ) {
               cn((v!=null?v.getText():null), sar(what),input); 
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
    // $ANTLR end "must_be"

    public static class must_be_one_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "must_be_one"
    // RuleSet2.g:297:1: must_be_one[String[] what] : v= VAR ;
    public final RuleSet2Parser.must_be_one_return must_be_one(String[] what) throws RecognitionException {
        RuleSet2Parser.must_be_one_return retval = new RuleSet2Parser.must_be_one_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token v=null;

        Object v_tree=null;

        try {
            // RuleSet2.g:298:3: (v= VAR )
            // RuleSet2.g:299:3: v= VAR
            {
            root_0 = (Object)adaptor.nil();

            v=(Token)match(input,VAR,FOLLOW_VAR_in_must_be_one936); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            v_tree = (Object)adaptor.create(v);
            adaptor.addChild(root_0, v_tree);
            }
            if ( state.backtracking==0 ) {
               cn((v!=null?v.getText():null),what,input); 
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
    // $ANTLR end "must_be_one"

    public static class rulesetname_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rulesetname"
    // RuleSet2.g:302:1: rulesetname : ( VAR | INT );
    public final RuleSet2Parser.rulesetname_return rulesetname() throws RecognitionException {
        RuleSet2Parser.rulesetname_return retval = new RuleSet2Parser.rulesetname_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set12=null;

        Object set12_tree=null;

        try {
            // RuleSet2.g:303:2: ( VAR | INT )
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

    public static class rule_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rule_name"
    // RuleSet2.g:312:10: fragment rule_name : ( VAR | INT );
    public final RuleSet2Parser.rule_name_return rule_name() throws RecognitionException {
        RuleSet2Parser.rule_name_return retval = new RuleSet2Parser.rule_name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set13=null;

        Object set13_tree=null;

        try {
            // RuleSet2.g:313:2: ( VAR | INT )
            // RuleSet2.g:
            {
            root_0 = (Object)adaptor.nil();

            set13=(Token)input.LT(1);
            if ( (input.LA(1)>=VAR && input.LA(1)<=INT) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set13));
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
    // $ANTLR end "rule_name"

    public static class rule_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rule"
    // RuleSet2.g:317:1: rule : must_be[\"rule\"] name= rule_name must_be[\"is\"] ait= must_be_one[sar(\"active\",\"inactive\",\"test\")] '{' select= VAR (ptu= using | ptw= when ) (f= foreach )* (pb= pre_block )? ( ';' )? (eb= emit_block )? ( ';' )? ( action[actions_result] ) (cb= callbacks )? ( ';' )? (postb= post_block )? ( ';' )? '}' ;
    public final RuleSet2Parser.rule_return rule() throws RecognitionException {
        RuleSet2Parser.rule_return retval = new RuleSet2Parser.rule_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token select=null;
        Token char_literal16=null;
        Token char_literal17=null;
        Token char_literal18=null;
        Token char_literal20=null;
        Token char_literal21=null;
        Token char_literal22=null;
        RuleSet2Parser.rule_name_return name = null;

        RuleSet2Parser.must_be_one_return ait = null;

        RuleSet2Parser.using_return ptu = null;

        RuleSet2Parser.when_return ptw = null;

        RuleSet2Parser.foreach_return f = null;

        RuleSet2Parser.pre_block_return pb = null;

        RuleSet2Parser.emit_block_return eb = null;

        RuleSet2Parser.callbacks_return cb = null;

        RuleSet2Parser.post_block_return postb = null;

        RuleSet2Parser.must_be_return must_be14 = null;

        RuleSet2Parser.must_be_return must_be15 = null;

        RuleSet2Parser.action_return action19 = null;


        Object select_tree=null;
        Object char_literal16_tree=null;
        Object char_literal17_tree=null;
        Object char_literal18_tree=null;
        Object char_literal20_tree=null;
        Object char_literal21_tree=null;
        Object char_literal22_tree=null;


        	 ArrayList rule_block_array = (ArrayList)rule_json.get("rules");
        	 HashMap current_rule = new HashMap();
        	 HashMap actions_result = new HashMap();
        	 ArrayList fors = new ArrayList();

        try {
            // RuleSet2.g:324:2: ( must_be[\"rule\"] name= rule_name must_be[\"is\"] ait= must_be_one[sar(\"active\",\"inactive\",\"test\")] '{' select= VAR (ptu= using | ptw= when ) (f= foreach )* (pb= pre_block )? ( ';' )? (eb= emit_block )? ( ';' )? ( action[actions_result] ) (cb= callbacks )? ( ';' )? (postb= post_block )? ( ';' )? '}' )
            // RuleSet2.g:324:5: must_be[\"rule\"] name= rule_name must_be[\"is\"] ait= must_be_one[sar(\"active\",\"inactive\",\"test\")] '{' select= VAR (ptu= using | ptw= when ) (f= foreach )* (pb= pre_block )? ( ';' )? (eb= emit_block )? ( ';' )? ( action[actions_result] ) (cb= callbacks )? ( ';' )? (postb= post_block )? ( ';' )? '}'
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_must_be_in_rule995);
            must_be14=must_be("rule");

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, must_be14.getTree());
            pushFollow(FOLLOW_rule_name_in_rule1002);
            name=rule_name();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, name.getTree());
            pushFollow(FOLLOW_must_be_in_rule1010);
            must_be15=must_be("is");

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, must_be15.getTree());
            pushFollow(FOLLOW_must_be_one_in_rule1020);
            ait=must_be_one(sar("active","inactive","test"));

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ait.getTree());
            char_literal16=(Token)match(input,29,FOLLOW_29_in_rule1025); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal16_tree = (Object)adaptor.create(char_literal16);
            adaptor.addChild(root_0, char_literal16_tree);
            }
            select=(Token)match(input,VAR,FOLLOW_VAR_in_rule1035); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            select_tree = (Object)adaptor.create(select);
            adaptor.addChild(root_0, select_tree);
            }
            if ( state.backtracking==0 ) {
               cn((select!=null?select.getText():null), sar("select"),input); 
            }
            // RuleSet2.g:330:60: (ptu= using | ptw= when )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==49) ) {
                alt2=1;
            }
            else if ( (LA2_0==53) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // RuleSet2.g:330:61: ptu= using
                    {
                    pushFollow(FOLLOW_using_in_rule1042);
                    ptu=using();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ptu.getTree());

                    }
                    break;
                case 2 :
                    // RuleSet2.g:330:71: ptw= when
                    {
                    pushFollow(FOLLOW_when_in_rule1046);
                    ptw=when();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ptw.getTree());

                    }
                    break;

            }

            // RuleSet2.g:330:81: (f= foreach )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==52) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // RuleSet2.g:330:82: f= foreach
            	    {
            	    pushFollow(FOLLOW_foreach_in_rule1052);
            	    f=foreach();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            	    if ( state.backtracking==0 ) {
            	       fors.add((f!=null?f.result:null));
            	    }

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // RuleSet2.g:330:119: (pb= pre_block )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==51) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // RuleSet2.g:0:0: pb= pre_block
                    {
                    pushFollow(FOLLOW_pre_block_in_rule1059);
                    pb=pre_block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pb.getTree());

                    }
                    break;

            }

            // RuleSet2.g:330:131: ( ';' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==31) ) {
                int LA5_1 = input.LA(2);

                if ( (synpred19_RuleSet2()) ) {
                    alt5=1;
                }
            }
            switch (alt5) {
                case 1 :
                    // RuleSet2.g:0:0: ';'
                    {
                    char_literal17=(Token)match(input,31,FOLLOW_31_in_rule1062); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal17_tree = (Object)adaptor.create(char_literal17);
                    adaptor.addChild(root_0, char_literal17_tree);
                    }

                    }
                    break;

            }

            // RuleSet2.g:330:138: (eb= emit_block )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==107) ) {
                int LA6_1 = input.LA(2);

                if ( (synpred20_RuleSet2()) ) {
                    alt6=1;
                }
            }
            switch (alt6) {
                case 1 :
                    // RuleSet2.g:0:0: eb= emit_block
                    {
                    pushFollow(FOLLOW_emit_block_in_rule1067);
                    eb=emit_block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, eb.getTree());

                    }
                    break;

            }

            // RuleSet2.g:330:151: ( ';' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==31) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // RuleSet2.g:0:0: ';'
                    {
                    char_literal18=(Token)match(input,31,FOLLOW_31_in_rule1070); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal18_tree = (Object)adaptor.create(char_literal18);
                    adaptor.addChild(root_0, char_literal18_tree);
                    }

                    }
                    break;

            }

            // RuleSet2.g:330:156: ( action[actions_result] )
            // RuleSet2.g:330:157: action[actions_result]
            {
            pushFollow(FOLLOW_action_in_rule1074);
            action19=action(actions_result);

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, action19.getTree());

            }

            // RuleSet2.g:330:183: (cb= callbacks )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==33) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // RuleSet2.g:0:0: cb= callbacks
                    {
                    pushFollow(FOLLOW_callbacks_in_rule1080);
                    cb=callbacks();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, cb.getTree());

                    }
                    break;

            }

            // RuleSet2.g:330:195: ( ';' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==31) ) {
                int LA9_1 = input.LA(2);

                if ( (synpred23_RuleSet2()) ) {
                    alt9=1;
                }
            }
            switch (alt9) {
                case 1 :
                    // RuleSet2.g:0:0: ';'
                    {
                    char_literal20=(Token)match(input,31,FOLLOW_31_in_rule1083); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal20_tree = (Object)adaptor.create(char_literal20);
                    adaptor.addChild(root_0, char_literal20_tree);
                    }

                    }
                    break;

            }

            // RuleSet2.g:330:205: (postb= post_block )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==VAR) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // RuleSet2.g:0:0: postb= post_block
                    {
                    pushFollow(FOLLOW_post_block_in_rule1088);
                    postb=post_block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, postb.getTree());

                    }
                    break;

            }

            // RuleSet2.g:330:218: ( ';' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==31) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // RuleSet2.g:0:0: ';'
                    {
                    char_literal21=(Token)match(input,31,FOLLOW_31_in_rule1091); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal21_tree = (Object)adaptor.create(char_literal21);
                    adaptor.addChild(root_0, char_literal21_tree);
                    }

                    }
                    break;

            }

            char_literal22=(Token)match(input,30,FOLLOW_30_in_rule1096); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal22_tree = (Object)adaptor.create(char_literal22);
            adaptor.addChild(root_0, char_literal22_tree);
            }
            if ( state.backtracking==0 ) {

              			HashMap tmp = new HashMap();
              			HashMap cond = new HashMap();
              			cond.put("val","true");
              			cond.put("type","bool");  
              		 	 
              			if(actions_result.get("cond") != null)
              		 	{
              				current_rule.put("cond",actions_result.get("cond"));
              			}
              		 	else
              			{ 
              				HashMap condt = new HashMap();
              				condt.put("val","true");
              				condt.put("type","bool"); 
              				current_rule.put("cond",condt);
              			}
              			current_rule.put("blocktype",(actions_result.get("blocktype") != null ? actions_result.get("blocktype") : "every"));
              			
              			current_rule.put("actions",actions_result.get("actions"));
              			if((postb!=null?input.toString(postb.start,postb.stop):null) != null)
              				current_rule.put("post",(postb!=null?postb.result:null));
              			
              			if((pb!=null?input.toString(pb.start,pb.stop):null) != null)
              				current_rule.put("pre",(pb!=null?pb.result:null));
              			
              			current_rule.put("name",(name!=null?input.toString(name.start,name.stop):null));
              			current_rule.put("emit",(eb!=null?eb.emit_value:null));
              			current_rule.put("state",(ait!=null?input.toString(ait.start,ait.stop):null));
              			current_rule.put("callbacks",(cb!=null?cb.result:null));
              			
              			if((ptu!=null?input.toString(ptu.start,ptu.stop):null) != null)
              				current_rule.put("pagetype",(ptu!=null?ptu.result:null));
              			else
              			{
              				current_rule.put("pagetype",(ptw!=null?ptw.result:null));
              			}
              				
              			current_rule.put("foreach",fors);
              			rule_block_array.add(current_rule);
              			 
              		
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
        public HashMap result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "post_block"
    // RuleSet2.g:378:1: post_block returns [HashMap result] : typ= must_be_one[sar(\"fired\",\"always\",\"notfired\")] '{' p1= post_statement ( ';' p2= post_statement )* ( ';' )? '}' (alt= post_alternate )? ;
    public final RuleSet2Parser.post_block_return post_block() throws RecognitionException {
        RuleSet2Parser.post_block_return retval = new RuleSet2Parser.post_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal23=null;
        Token char_literal24=null;
        Token char_literal25=null;
        Token char_literal26=null;
        RuleSet2Parser.must_be_one_return typ = null;

        RuleSet2Parser.post_statement_return p1 = null;

        RuleSet2Parser.post_statement_return p2 = null;

        RuleSet2Parser.post_alternate_return alt = null;


        Object char_literal23_tree=null;
        Object char_literal24_tree=null;
        Object char_literal25_tree=null;
        Object char_literal26_tree=null;


        	ArrayList temp_list = new ArrayList();

        try {
            // RuleSet2.g:382:2: (typ= must_be_one[sar(\"fired\",\"always\",\"notfired\")] '{' p1= post_statement ( ';' p2= post_statement )* ( ';' )? '}' (alt= post_alternate )? )
            // RuleSet2.g:383:2: typ= must_be_one[sar(\"fired\",\"always\",\"notfired\")] '{' p1= post_statement ( ';' p2= post_statement )* ( ';' )? '}' (alt= post_alternate )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_must_be_one_in_post_block1127);
            typ=must_be_one(sar("fired","always","notfired"));

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typ.getTree());
            char_literal23=(Token)match(input,29,FOLLOW_29_in_post_block1130); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal23_tree = (Object)adaptor.create(char_literal23);
            adaptor.addChild(root_0, char_literal23_tree);
            }
            pushFollow(FOLLOW_post_statement_in_post_block1137);
            p1=post_statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p1.getTree());
            if ( state.backtracking==0 ) {
               temp_list.add((p1!=null?p1.result:null));
            }
            // RuleSet2.g:384:51: ( ';' p2= post_statement )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==31) ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1==VAR||(LA12_1>=38 && LA12_1<=39)||(LA12_1>=102 && LA12_1<=103)) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // RuleSet2.g:384:52: ';' p2= post_statement
            	    {
            	    char_literal24=(Token)match(input,31,FOLLOW_31_in_post_block1142); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal24_tree = (Object)adaptor.create(char_literal24);
            	    adaptor.addChild(root_0, char_literal24_tree);
            	    }
            	    pushFollow(FOLLOW_post_statement_in_post_block1146);
            	    p2=post_statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p2.getTree());
            	    if ( state.backtracking==0 ) {
            	       temp_list.add((p2!=null?p2.result:null));
            	    }

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // RuleSet2.g:384:108: ( ';' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // RuleSet2.g:0:0: ';'
                    {
                    char_literal25=(Token)match(input,31,FOLLOW_31_in_post_block1154); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal25_tree = (Object)adaptor.create(char_literal25);
                    adaptor.addChild(root_0, char_literal25_tree);
                    }

                    }
                    break;

            }

            char_literal26=(Token)match(input,30,FOLLOW_30_in_post_block1157); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal26_tree = (Object)adaptor.create(char_literal26);
            adaptor.addChild(root_0, char_literal26_tree);
            }
            // RuleSet2.g:385:6: (alt= post_alternate )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==VAR) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // RuleSet2.g:0:0: alt= post_alternate
                    {
                    pushFollow(FOLLOW_post_alternate_in_post_block1164);
                    alt=post_alternate();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, alt.getTree());

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		HashMap tmp = new HashMap();
              //		tmp.put("alt",(alt!=null?alt.result:null));
              		tmp.put("type",(typ!=null?input.toString(typ.start,typ.stop):null));
              		tmp.put("cons",temp_list);
              		if((alt!=null?input.toString(alt.start,alt.stop):null) != null)
              		{
              			tmp.put("alt",(alt!=null?alt.result:null));
              		}
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
    // $ANTLR end "post_block"

    public static class post_alternate_return extends ParserRuleReturnScope {
        public ArrayList result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "post_alternate"
    // RuleSet2.g:399:1: post_alternate returns [ArrayList result] : must_be[\"else\"] '{' (p= post_statement ( ';' p1= post_statement )* )? ( ';' )? '}' ;
    public final RuleSet2Parser.post_alternate_return post_alternate() throws RecognitionException {
        RuleSet2Parser.post_alternate_return retval = new RuleSet2Parser.post_alternate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal28=null;
        Token char_literal29=null;
        Token char_literal30=null;
        Token char_literal31=null;
        RuleSet2Parser.post_statement_return p = null;

        RuleSet2Parser.post_statement_return p1 = null;

        RuleSet2Parser.must_be_return must_be27 = null;


        Object char_literal28_tree=null;
        Object char_literal29_tree=null;
        Object char_literal30_tree=null;
        Object char_literal31_tree=null;


        	ArrayList temp_array = new ArrayList();

        try {
            // RuleSet2.g:403:2: ( must_be[\"else\"] '{' (p= post_statement ( ';' p1= post_statement )* )? ( ';' )? '}' )
            // RuleSet2.g:404:3: must_be[\"else\"] '{' (p= post_statement ( ';' p1= post_statement )* )? ( ';' )? '}'
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_must_be_in_post_alternate1191);
            must_be27=must_be("else");

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, must_be27.getTree());
            char_literal28=(Token)match(input,29,FOLLOW_29_in_post_alternate1194); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal28_tree = (Object)adaptor.create(char_literal28);
            adaptor.addChild(root_0, char_literal28_tree);
            }
            // RuleSet2.g:404:23: (p= post_statement ( ';' p1= post_statement )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==VAR||(LA16_0>=38 && LA16_0<=39)||(LA16_0>=102 && LA16_0<=103)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // RuleSet2.g:404:24: p= post_statement ( ';' p1= post_statement )*
                    {
                    pushFollow(FOLLOW_post_statement_in_post_alternate1199);
                    p=post_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p.getTree());
                    if ( state.backtracking==0 ) {
                      temp_array.add((p!=null?p.result:null));
                    }
                    // RuleSet2.g:404:70: ( ';' p1= post_statement )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==31) ) {
                            int LA15_1 = input.LA(2);

                            if ( (LA15_1==VAR||(LA15_1>=38 && LA15_1<=39)||(LA15_1>=102 && LA15_1<=103)) ) {
                                alt15=1;
                            }


                        }


                        switch (alt15) {
                    	case 1 :
                    	    // RuleSet2.g:404:71: ';' p1= post_statement
                    	    {
                    	    char_literal29=(Token)match(input,31,FOLLOW_31_in_post_alternate1204); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal29_tree = (Object)adaptor.create(char_literal29);
                    	    adaptor.addChild(root_0, char_literal29_tree);
                    	    }
                    	    pushFollow(FOLLOW_post_statement_in_post_alternate1208);
                    	    p1=post_statement();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p1.getTree());
                    	    if ( state.backtracking==0 ) {
                    	      temp_array.add((p1!=null?p1.result:null));
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }

            // RuleSet2.g:404:127: ( ';' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==31) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // RuleSet2.g:0:0: ';'
                    {
                    char_literal30=(Token)match(input,31,FOLLOW_31_in_post_alternate1216); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal30_tree = (Object)adaptor.create(char_literal30);
                    adaptor.addChild(root_0, char_literal30_tree);
                    }

                    }
                    break;

            }

            char_literal31=(Token)match(input,30,FOLLOW_30_in_post_alternate1219); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal31_tree = (Object)adaptor.create(char_literal31);
            adaptor.addChild(root_0, char_literal31_tree);
            }
            if ( state.backtracking==0 ) {

              		retval.result = temp_array;
              	
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
        public HashMap result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "post_statement"
    // RuleSet2.g:408:1: post_statement returns [HashMap result] : ( (pe= persistent_expr | rs= raise_statement | l= log_statement | las= must_be[\"last\"] ) ( 'if' ie= expr )? ) ;
    public final RuleSet2Parser.post_statement_return post_statement() throws RecognitionException {
        RuleSet2Parser.post_statement_return retval = new RuleSet2Parser.post_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal32=null;
        RuleSet2Parser.persistent_expr_return pe = null;

        RuleSet2Parser.raise_statement_return rs = null;

        RuleSet2Parser.log_statement_return l = null;

        RuleSet2Parser.must_be_return las = null;

        RuleSet2Parser.expr_return ie = null;


        Object string_literal32_tree=null;

        try {
            // RuleSet2.g:409:2: ( ( (pe= persistent_expr | rs= raise_statement | l= log_statement | las= must_be[\"last\"] ) ( 'if' ie= expr )? ) )
            // RuleSet2.g:409:4: ( (pe= persistent_expr | rs= raise_statement | l= log_statement | las= must_be[\"last\"] ) ( 'if' ie= expr )? )
            {
            root_0 = (Object)adaptor.nil();

            // RuleSet2.g:409:4: ( (pe= persistent_expr | rs= raise_statement | l= log_statement | las= must_be[\"last\"] ) ( 'if' ie= expr )? )
            // RuleSet2.g:409:5: (pe= persistent_expr | rs= raise_statement | l= log_statement | las= must_be[\"last\"] ) ( 'if' ie= expr )?
            {
            // RuleSet2.g:409:5: (pe= persistent_expr | rs= raise_statement | l= log_statement | las= must_be[\"last\"] )
            int alt18=4;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // RuleSet2.g:409:6: pe= persistent_expr
                    {
                    pushFollow(FOLLOW_persistent_expr_in_post_statement1237);
                    pe=persistent_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pe.getTree());

                    }
                    break;
                case 2 :
                    // RuleSet2.g:410:6: rs= raise_statement
                    {
                    pushFollow(FOLLOW_raise_statement_in_post_statement1247);
                    rs=raise_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rs.getTree());

                    }
                    break;
                case 3 :
                    // RuleSet2.g:411:4: l= log_statement
                    {
                    pushFollow(FOLLOW_log_statement_in_post_statement1254);
                    l=log_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, l.getTree());

                    }
                    break;
                case 4 :
                    // RuleSet2.g:412:4: las= must_be[\"last\"]
                    {
                    pushFollow(FOLLOW_must_be_in_post_statement1264);
                    las=must_be("last");

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, las.getTree());

                    }
                    break;

            }

            // RuleSet2.g:413:2: ( 'if' ie= expr )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==32) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // RuleSet2.g:413:3: 'if' ie= expr
                    {
                    string_literal32=(Token)match(input,32,FOLLOW_32_in_post_statement1270); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal32_tree = (Object)adaptor.create(string_literal32);
                    adaptor.addChild(root_0, string_literal32_tree);
                    }
                    pushFollow(FOLLOW_expr_in_post_statement1274);
                    ie=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ie.getTree());

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              		if((pe!=null?input.toString(pe.start,pe.stop):null) != null)
              		 	retval.result = (pe!=null?pe.result:null) ;
              		 	
              		if((l!=null?input.toString(l.start,l.stop):null) != null)
              		 	retval.result = (l!=null?l.result:null) ;
              		 	
              		if((rs!=null?input.toString(rs.start,rs.stop):null) != null)
              		 	retval.result = (rs!=null?rs.result:null) ;
              		 	
              		if((las!=null?input.toString(las.start,las.stop):null) != null)
              		{
              			HashMap tmp = new HashMap();
              			tmp.put("statement","last");
              			tmp.put("type","control");
              		 	retval.result = tmp;
              		}
              		 	
              		if((ie!=null?input.toString(ie.start,ie.stop):null) != null)
              		{
              			retval.result.put("test",(ie!=null?ie.result:null));
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
    // $ANTLR end "post_statement"

    public static class raise_statement_return extends ParserRuleReturnScope {
        public HashMap result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "raise_statement"
    // RuleSet2.g:439:1: raise_statement returns [HashMap result] : must_be[\"raise\"] must_be[\"explicit\"] must_be[\"event\"] evt= VAR (f= for_clause )? (m= modifier_clause )? ;
    public final RuleSet2Parser.raise_statement_return raise_statement() throws RecognitionException {
        RuleSet2Parser.raise_statement_return retval = new RuleSet2Parser.raise_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token evt=null;
        RuleSet2Parser.for_clause_return f = null;

        RuleSet2Parser.modifier_clause_return m = null;

        RuleSet2Parser.must_be_return must_be33 = null;

        RuleSet2Parser.must_be_return must_be34 = null;

        RuleSet2Parser.must_be_return must_be35 = null;


        Object evt_tree=null;

        try {
            // RuleSet2.g:440:2: ( must_be[\"raise\"] must_be[\"explicit\"] must_be[\"event\"] evt= VAR (f= for_clause )? (m= modifier_clause )? )
            // RuleSet2.g:441:2: must_be[\"raise\"] must_be[\"explicit\"] must_be[\"event\"] evt= VAR (f= for_clause )? (m= modifier_clause )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_must_be_in_raise_statement1299);
            must_be33=must_be("raise");

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, must_be33.getTree());
            pushFollow(FOLLOW_must_be_in_raise_statement1302);
            must_be34=must_be("explicit");

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, must_be34.getTree());
            pushFollow(FOLLOW_must_be_in_raise_statement1305);
            must_be35=must_be("event");

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, must_be35.getTree());
            evt=(Token)match(input,VAR,FOLLOW_VAR_in_raise_statement1311); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            evt_tree = (Object)adaptor.create(evt);
            adaptor.addChild(root_0, evt_tree);
            }
            // RuleSet2.g:441:66: (f= for_clause )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==43) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // RuleSet2.g:0:0: f= for_clause
                    {
                    pushFollow(FOLLOW_for_clause_in_raise_statement1315);
                    f=for_clause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, f.getTree());

                    }
                    break;

            }

            // RuleSet2.g:441:80: (m= modifier_clause )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==40) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // RuleSet2.g:0:0: m= modifier_clause
                    {
                    pushFollow(FOLLOW_modifier_clause_in_raise_statement1320);
                    m=modifier_clause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, m.getTree());

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		HashMap tmp = new HashMap();
              		tmp.put("event",(evt!=null?evt.getText():null));
              		tmp.put("domain","explicit");
              		tmp.put("type","raise");
              		if((f!=null?input.toString(f.start,f.stop):null) != null)
              			tmp.put("rid",(f!=null?f.result:null));
              			
              		if((m!=null?input.toString(m.start,m.stop):null) != null)
              			tmp.put("modifiers",(m!=null?m.result:null));	
              		
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
    // $ANTLR end "raise_statement"

    public static class log_statement_return extends ParserRuleReturnScope {
        public HashMap result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "log_statement"
    // RuleSet2.g:456:1: log_statement returns [HashMap result] : must_be[\"log\"] e= expr ;
    public final RuleSet2Parser.log_statement_return log_statement() throws RecognitionException {
        RuleSet2Parser.log_statement_return retval = new RuleSet2Parser.log_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RuleSet2Parser.expr_return e = null;

        RuleSet2Parser.must_be_return must_be36 = null;



        try {
            // RuleSet2.g:457:2: ( must_be[\"log\"] e= expr )
            // RuleSet2.g:458:2: must_be[\"log\"] e= expr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_must_be_in_log_statement1340);
            must_be36=must_be("log");

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, must_be36.getTree());
            pushFollow(FOLLOW_expr_in_log_statement1346);
            e=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
            if ( state.backtracking==0 ) {

              		HashMap tmp = new HashMap();
              		tmp.put("type","log");
              		tmp.put("what",(e!=null?e.result:null));
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
    // $ANTLR end "log_statement"

    public static class callbacks_return extends ParserRuleReturnScope {
        public HashMap result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "callbacks"
    // RuleSet2.g:467:1: callbacks returns [HashMap result] : 'callbacks' '{' (s= success )? (f= failure )? '}' ;
    public final RuleSet2Parser.callbacks_return callbacks() throws RecognitionException {
        RuleSet2Parser.callbacks_return retval = new RuleSet2Parser.callbacks_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal37=null;
        Token char_literal38=null;
        Token char_literal39=null;
        RuleSet2Parser.success_return s = null;

        RuleSet2Parser.failure_return f = null;


        Object string_literal37_tree=null;
        Object char_literal38_tree=null;
        Object char_literal39_tree=null;

        try {
            // RuleSet2.g:468:2: ( 'callbacks' '{' (s= success )? (f= failure )? '}' )
            // RuleSet2.g:469:2: 'callbacks' '{' (s= success )? (f= failure )? '}'
            {
            root_0 = (Object)adaptor.nil();

            string_literal37=(Token)match(input,33,FOLLOW_33_in_callbacks1366); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal37_tree = (Object)adaptor.create(string_literal37);
            adaptor.addChild(root_0, string_literal37_tree);
            }
            char_literal38=(Token)match(input,29,FOLLOW_29_in_callbacks1368); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal38_tree = (Object)adaptor.create(char_literal38);
            adaptor.addChild(root_0, char_literal38_tree);
            }
            // RuleSet2.g:469:19: (s= success )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==34) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // RuleSet2.g:0:0: s= success
                    {
                    pushFollow(FOLLOW_success_in_callbacks1372);
                    s=success();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, s.getTree());

                    }
                    break;

            }

            // RuleSet2.g:469:30: (f= failure )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==35) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // RuleSet2.g:0:0: f= failure
                    {
                    pushFollow(FOLLOW_failure_in_callbacks1377);
                    f=failure();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, f.getTree());

                    }
                    break;

            }

            char_literal39=(Token)match(input,30,FOLLOW_30_in_callbacks1380); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal39_tree = (Object)adaptor.create(char_literal39);
            adaptor.addChild(root_0, char_literal39_tree);
            }
            if ( state.backtracking==0 ) {

              		HashMap tmp = new HashMap();
              		if((s!=null?input.toString(s.start,s.stop):null) != null)
              		{
              			tmp.put("success",(s!=null?s.result:null));
              			
              		}
              		if((f!=null?input.toString(f.start,f.stop):null) != null)
              		{
              			tmp.put("failure",(f!=null?f.result:null));		
              		}
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
    // $ANTLR end "callbacks"

    public static class success_return extends ParserRuleReturnScope {
        public ArrayList result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "success"
    // RuleSet2.g:484:1: success returns [ArrayList result] : 'success' '{' c= click ( ';' c1= click )* ( ';' )? '}' ;
    public final RuleSet2Parser.success_return success() throws RecognitionException {
        RuleSet2Parser.success_return retval = new RuleSet2Parser.success_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal40=null;
        Token char_literal41=null;
        Token char_literal42=null;
        Token char_literal43=null;
        Token char_literal44=null;
        RuleSet2Parser.click_return c = null;

        RuleSet2Parser.click_return c1 = null;


        Object string_literal40_tree=null;
        Object char_literal41_tree=null;
        Object char_literal42_tree=null;
        Object char_literal43_tree=null;
        Object char_literal44_tree=null;


        	ArrayList tmp_list = new ArrayList();

        try {
            // RuleSet2.g:488:2: ( 'success' '{' c= click ( ';' c1= click )* ( ';' )? '}' )
            // RuleSet2.g:488:4: 'success' '{' c= click ( ';' c1= click )* ( ';' )? '}'
            {
            root_0 = (Object)adaptor.nil();

            string_literal40=(Token)match(input,34,FOLLOW_34_in_success1403); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal40_tree = (Object)adaptor.create(string_literal40);
            adaptor.addChild(root_0, string_literal40_tree);
            }
            char_literal41=(Token)match(input,29,FOLLOW_29_in_success1405); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal41_tree = (Object)adaptor.create(char_literal41);
            adaptor.addChild(root_0, char_literal41_tree);
            }
            pushFollow(FOLLOW_click_in_success1409);
            c=click();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, c.getTree());
            if ( state.backtracking==0 ) {
              tmp_list.add((c!=null?c.result:null));
            }
            // RuleSet2.g:488:54: ( ';' c1= click )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==31) ) {
                    int LA24_1 = input.LA(2);

                    if ( (LA24_1==VAR) ) {
                        alt24=1;
                    }


                }


                switch (alt24) {
            	case 1 :
            	    // RuleSet2.g:488:55: ';' c1= click
            	    {
            	    char_literal42=(Token)match(input,31,FOLLOW_31_in_success1415); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal42_tree = (Object)adaptor.create(char_literal42);
            	    adaptor.addChild(root_0, char_literal42_tree);
            	    }
            	    pushFollow(FOLLOW_click_in_success1419);
            	    c1=click();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, c1.getTree());
            	    if ( state.backtracking==0 ) {
            	      tmp_list.add((c1!=null?c1.result:null));
            	    }

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            // RuleSet2.g:488:99: ( ';' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==31) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // RuleSet2.g:0:0: ';'
                    {
                    char_literal43=(Token)match(input,31,FOLLOW_31_in_success1426); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal43_tree = (Object)adaptor.create(char_literal43);
                    adaptor.addChild(root_0, char_literal43_tree);
                    }

                    }
                    break;

            }

            char_literal44=(Token)match(input,30,FOLLOW_30_in_success1430); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal44_tree = (Object)adaptor.create(char_literal44);
            adaptor.addChild(root_0, char_literal44_tree);
            }
            if ( state.backtracking==0 ) {

              		retval.result = tmp_list;
              	
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
        public ArrayList result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "failure"
    // RuleSet2.g:493:1: failure returns [ArrayList result] : 'failure' '{' c= click ( ';' c1= click )* ( ';' )? '}' ;
    public final RuleSet2Parser.failure_return failure() throws RecognitionException {
        RuleSet2Parser.failure_return retval = new RuleSet2Parser.failure_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal45=null;
        Token char_literal46=null;
        Token char_literal47=null;
        Token char_literal48=null;
        Token char_literal49=null;
        RuleSet2Parser.click_return c = null;

        RuleSet2Parser.click_return c1 = null;


        Object string_literal45_tree=null;
        Object char_literal46_tree=null;
        Object char_literal47_tree=null;
        Object char_literal48_tree=null;
        Object char_literal49_tree=null;


        	ArrayList tmp_list = new ArrayList();

        try {
            // RuleSet2.g:497:2: ( 'failure' '{' c= click ( ';' c1= click )* ( ';' )? '}' )
            // RuleSet2.g:498:2: 'failure' '{' c= click ( ';' c1= click )* ( ';' )? '}'
            {
            root_0 = (Object)adaptor.nil();

            string_literal45=(Token)match(input,35,FOLLOW_35_in_failure1456); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal45_tree = (Object)adaptor.create(string_literal45);
            adaptor.addChild(root_0, string_literal45_tree);
            }
            char_literal46=(Token)match(input,29,FOLLOW_29_in_failure1458); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal46_tree = (Object)adaptor.create(char_literal46);
            adaptor.addChild(root_0, char_literal46_tree);
            }
            pushFollow(FOLLOW_click_in_failure1462);
            c=click();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, c.getTree());
            if ( state.backtracking==0 ) {
              tmp_list.add((c!=null?c.result:null));
            }
            // RuleSet2.g:498:52: ( ';' c1= click )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==31) ) {
                    int LA26_1 = input.LA(2);

                    if ( (LA26_1==VAR) ) {
                        alt26=1;
                    }


                }


                switch (alt26) {
            	case 1 :
            	    // RuleSet2.g:498:53: ';' c1= click
            	    {
            	    char_literal47=(Token)match(input,31,FOLLOW_31_in_failure1468); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal47_tree = (Object)adaptor.create(char_literal47);
            	    adaptor.addChild(root_0, char_literal47_tree);
            	    }
            	    pushFollow(FOLLOW_click_in_failure1472);
            	    c1=click();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, c1.getTree());
            	    if ( state.backtracking==0 ) {
            	      tmp_list.add((c1!=null?c1.result:null));
            	    }

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            // RuleSet2.g:498:98: ( ';' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==31) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // RuleSet2.g:0:0: ';'
                    {
                    char_literal48=(Token)match(input,31,FOLLOW_31_in_failure1480); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal48_tree = (Object)adaptor.create(char_literal48);
                    adaptor.addChild(root_0, char_literal48_tree);
                    }

                    }
                    break;

            }

            char_literal49=(Token)match(input,30,FOLLOW_30_in_failure1484); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal49_tree = (Object)adaptor.create(char_literal49);
            adaptor.addChild(root_0, char_literal49_tree);
            }
            if ( state.backtracking==0 ) {

              		retval.result = tmp_list;
              	
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
        public HashMap result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "click"
    // RuleSet2.g:503:1: click returns [HashMap result] : corc= must_be_one[sar(\"click\",\"change\")] attr= VAR '=' val= STRING (cl= click_link )? ;
    public final RuleSet2Parser.click_return click() throws RecognitionException {
        RuleSet2Parser.click_return retval = new RuleSet2Parser.click_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token attr=null;
        Token val=null;
        Token char_literal50=null;
        RuleSet2Parser.must_be_one_return corc = null;

        RuleSet2Parser.click_link_return cl = null;


        Object attr_tree=null;
        Object val_tree=null;
        Object char_literal50_tree=null;

        try {
            // RuleSet2.g:503:31: (corc= must_be_one[sar(\"click\",\"change\")] attr= VAR '=' val= STRING (cl= click_link )? )
            // RuleSet2.g:504:2: corc= must_be_one[sar(\"click\",\"change\")] attr= VAR '=' val= STRING (cl= click_link )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_must_be_one_in_click1502);
            corc=must_be_one(sar("click","change"));

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, corc.getTree());
            attr=(Token)match(input,VAR,FOLLOW_VAR_in_click1507); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            attr_tree = (Object)adaptor.create(attr);
            adaptor.addChild(root_0, attr_tree);
            }
            char_literal50=(Token)match(input,36,FOLLOW_36_in_click1509); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal50_tree = (Object)adaptor.create(char_literal50);
            adaptor.addChild(root_0, char_literal50_tree);
            }
            val=(Token)match(input,STRING,FOLLOW_STRING_in_click1513); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            val_tree = (Object)adaptor.create(val);
            adaptor.addChild(root_0, val_tree);
            }
            // RuleSet2.g:504:68: (cl= click_link )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==VAR) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // RuleSet2.g:0:0: cl= click_link
                    {
                    pushFollow(FOLLOW_click_link_in_click1517);
                    cl=click_link();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, cl.getTree());

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		HashMap tmp = new HashMap();
              		tmp.put("type",(corc!=null?input.toString(corc.start,corc.stop):null));
              		tmp.put("value",strip_string((val!=null?val.getText():null)));
              		tmp.put("attribute",(attr!=null?attr.getText():null));
              		tmp.put("trigger",(cl!=null?cl.result:null));
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
    // $ANTLR end "click"

    public static class click_link_return extends ParserRuleReturnScope {
        public HashMap result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "click_link"
    // RuleSet2.g:514:1: click_link returns [HashMap result] : must_be[\"triggers\"] p= persistent_expr ;
    public final RuleSet2Parser.click_link_return click_link() throws RecognitionException {
        RuleSet2Parser.click_link_return retval = new RuleSet2Parser.click_link_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RuleSet2Parser.persistent_expr_return p = null;

        RuleSet2Parser.must_be_return must_be51 = null;



        try {
            // RuleSet2.g:515:2: ( must_be[\"triggers\"] p= persistent_expr )
            // RuleSet2.g:516:2: must_be[\"triggers\"] p= persistent_expr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_must_be_in_click_link1537);
            must_be51=must_be("triggers");

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, must_be51.getTree());
            pushFollow(FOLLOW_persistent_expr_in_click_link1542);
            p=persistent_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p.getTree());
            if ( state.backtracking==0 ) {

              		retval.result = (p!=null?p.result:null);
              	
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
    // $ANTLR end "click_link"

    public static class persistent_expr_return extends ParserRuleReturnScope {
        public HashMap result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "persistent_expr"
    // RuleSet2.g:522:1: persistent_expr returns [HashMap result] : (pc= persistent_clear_set | pi= persistent_iterate | tf= trail_forget | tm= trail_mark );
    public final RuleSet2Parser.persistent_expr_return persistent_expr() throws RecognitionException {
        RuleSet2Parser.persistent_expr_return retval = new RuleSet2Parser.persistent_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RuleSet2Parser.persistent_clear_set_return pc = null;

        RuleSet2Parser.persistent_iterate_return pi = null;

        RuleSet2Parser.trail_forget_return tf = null;

        RuleSet2Parser.trail_mark_return tm = null;



        try {
            // RuleSet2.g:523:2: (pc= persistent_clear_set | pi= persistent_iterate | tf= trail_forget | tm= trail_mark )
            int alt29=4;
            switch ( input.LA(1) ) {
            case VAR:
                {
                alt29=1;
                }
                break;
            case 102:
            case 103:
                {
                alt29=2;
                }
                break;
            case 38:
                {
                alt29=3;
                }
                break;
            case 39:
                {
                alt29=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // RuleSet2.g:524:2: pc= persistent_clear_set
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_persistent_clear_set_in_persistent_expr1564);
                    pc=persistent_clear_set();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pc.getTree());
                    if ( state.backtracking==0 ) {

                      		retval.result = (pc!=null?pc.result:null);
                      	
                    }

                    }
                    break;
                case 2 :
                    // RuleSet2.g:527:4: pi= persistent_iterate
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_persistent_iterate_in_persistent_expr1574);
                    pi=persistent_iterate();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pi.getTree());
                    if ( state.backtracking==0 ) {

                      		retval.result = (pi!=null?pi.result:null);
                      	
                    }

                    }
                    break;
                case 3 :
                    // RuleSet2.g:530:7: tf= trail_forget
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_trail_forget_in_persistent_expr1587);
                    tf=trail_forget();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, tf.getTree());
                    if ( state.backtracking==0 ) {

                      		retval.result = (tf!=null?tf.result:null);
                      	
                    }

                    }
                    break;
                case 4 :
                    // RuleSet2.g:533:7: tm= trail_mark
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_trail_mark_in_persistent_expr1600);
                    tm=trail_mark();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, tm.getTree());
                    if ( state.backtracking==0 ) {

                      		retval.result = (tm!=null?tm.result:null);
                      	
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
    // $ANTLR end "persistent_expr"

    public static class persistent_clear_set_return extends ParserRuleReturnScope {
        public HashMap result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "persistent_clear_set"
    // RuleSet2.g:539:1: persistent_clear_set returns [HashMap result] : cs= must_be_one[sar(\"clear\",\"set\")] dm= var_domain ':' name= VAR ;
    public final RuleSet2Parser.persistent_clear_set_return persistent_clear_set() throws RecognitionException {
        RuleSet2Parser.persistent_clear_set_return retval = new RuleSet2Parser.persistent_clear_set_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token name=null;
        Token char_literal52=null;
        RuleSet2Parser.must_be_one_return cs = null;

        RuleSet2Parser.var_domain_return dm = null;


        Object name_tree=null;
        Object char_literal52_tree=null;

        try {
            // RuleSet2.g:540:2: (cs= must_be_one[sar(\"clear\",\"set\")] dm= var_domain ':' name= VAR )
            // RuleSet2.g:541:2: cs= must_be_one[sar(\"clear\",\"set\")] dm= var_domain ':' name= VAR
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_must_be_one_in_persistent_clear_set1625);
            cs=must_be_one(sar("clear","set"));

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cs.getTree());
            pushFollow(FOLLOW_var_domain_in_persistent_clear_set1631);
            dm=var_domain();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, dm.getTree());
            char_literal52=(Token)match(input,37,FOLLOW_37_in_persistent_clear_set1633); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal52_tree = (Object)adaptor.create(char_literal52);
            adaptor.addChild(root_0, char_literal52_tree);
            }
            name=(Token)match(input,VAR,FOLLOW_VAR_in_persistent_clear_set1637); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            name_tree = (Object)adaptor.create(name);
            adaptor.addChild(root_0, name_tree);
            }
            if ( state.backtracking==0 ) {

              		HashMap tmp = new HashMap();
              		tmp.put("action",(cs!=null?input.toString(cs.start,cs.stop):null));
              		tmp.put("name",(name!=null?name.getText():null));
              		tmp.put("domain",(dm!=null?input.toString(dm.start,dm.stop):null));
              		tmp.put("type","persistent");
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
    // $ANTLR end "persistent_clear_set"

    public static class persistent_iterate_return extends ParserRuleReturnScope {
        public HashMap result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "persistent_iterate"
    // RuleSet2.g:552:1: persistent_iterate returns [HashMap result] : dm= var_domain ':' name= VAR op= counter_op v= expr from= counter_start ;
    public final RuleSet2Parser.persistent_iterate_return persistent_iterate() throws RecognitionException {
        RuleSet2Parser.persistent_iterate_return retval = new RuleSet2Parser.persistent_iterate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token name=null;
        Token char_literal53=null;
        RuleSet2Parser.var_domain_return dm = null;

        RuleSet2Parser.counter_op_return op = null;

        RuleSet2Parser.expr_return v = null;

        RuleSet2Parser.counter_start_return from = null;


        Object name_tree=null;
        Object char_literal53_tree=null;

        try {
            // RuleSet2.g:553:2: (dm= var_domain ':' name= VAR op= counter_op v= expr from= counter_start )
            // RuleSet2.g:554:2: dm= var_domain ':' name= VAR op= counter_op v= expr from= counter_start
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_var_domain_in_persistent_iterate1658);
            dm=var_domain();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, dm.getTree());
            char_literal53=(Token)match(input,37,FOLLOW_37_in_persistent_iterate1660); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal53_tree = (Object)adaptor.create(char_literal53);
            adaptor.addChild(root_0, char_literal53_tree);
            }
            name=(Token)match(input,VAR,FOLLOW_VAR_in_persistent_iterate1664); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            name_tree = (Object)adaptor.create(name);
            adaptor.addChild(root_0, name_tree);
            }
            pushFollow(FOLLOW_counter_op_in_persistent_iterate1668);
            op=counter_op();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, op.getTree());
            pushFollow(FOLLOW_expr_in_persistent_iterate1672);
            v=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, v.getTree());
            pushFollow(FOLLOW_counter_start_in_persistent_iterate1676);
            from=counter_start();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, from.getTree());
            if ( state.backtracking==0 ) {

              		HashMap tmp = new HashMap();
              		tmp.put("action","iterator");
              		tmp.put("name",(name!=null?name.getText():null));
              		tmp.put("domain",(dm!=null?input.toString(dm.start,dm.stop):null));
              		tmp.put("type","persistent");
              		tmp.put("op",(op!=null?input.toString(op.start,op.stop):null));
              		tmp.put("from",(from!=null?from.result:null));
              		tmp.put("value",(v!=null?v.result:null));
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
    // $ANTLR end "persistent_iterate"

    public static class trail_forget_return extends ParserRuleReturnScope {
        public HashMap result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "trail_forget"
    // RuleSet2.g:567:1: trail_forget returns [HashMap result] : 'forget' what= STRING must_be[\"in\"] dm= var_domain ':' name= VAR ;
    public final RuleSet2Parser.trail_forget_return trail_forget() throws RecognitionException {
        RuleSet2Parser.trail_forget_return retval = new RuleSet2Parser.trail_forget_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token what=null;
        Token name=null;
        Token string_literal54=null;
        Token char_literal56=null;
        RuleSet2Parser.var_domain_return dm = null;

        RuleSet2Parser.must_be_return must_be55 = null;


        Object what_tree=null;
        Object name_tree=null;
        Object string_literal54_tree=null;
        Object char_literal56_tree=null;

        try {
            // RuleSet2.g:568:2: ( 'forget' what= STRING must_be[\"in\"] dm= var_domain ':' name= VAR )
            // RuleSet2.g:569:2: 'forget' what= STRING must_be[\"in\"] dm= var_domain ':' name= VAR
            {
            root_0 = (Object)adaptor.nil();

            string_literal54=(Token)match(input,38,FOLLOW_38_in_trail_forget1694); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal54_tree = (Object)adaptor.create(string_literal54);
            adaptor.addChild(root_0, string_literal54_tree);
            }
            what=(Token)match(input,STRING,FOLLOW_STRING_in_trail_forget1699); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            what_tree = (Object)adaptor.create(what);
            adaptor.addChild(root_0, what_tree);
            }
            pushFollow(FOLLOW_must_be_in_trail_forget1701);
            must_be55=must_be("in");

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, must_be55.getTree());
            pushFollow(FOLLOW_var_domain_in_trail_forget1707);
            dm=var_domain();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, dm.getTree());
            char_literal56=(Token)match(input,37,FOLLOW_37_in_trail_forget1709); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal56_tree = (Object)adaptor.create(char_literal56);
            adaptor.addChild(root_0, char_literal56_tree);
            }
            name=(Token)match(input,VAR,FOLLOW_VAR_in_trail_forget1713); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            name_tree = (Object)adaptor.create(name);
            adaptor.addChild(root_0, name_tree);
            }
            if ( state.backtracking==0 ) {

              		HashMap tmp = new HashMap();
              		tmp.put("action","forget");
              		tmp.put("name",(name!=null?name.getText():null));
              		tmp.put("domain",(dm!=null?input.toString(dm.start,dm.stop):null));
              		tmp.put("type","persistent");
              		tmp.put("regexp",strip_string((what!=null?what.getText():null)));
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
    // $ANTLR end "trail_forget"

    public static class trail_mark_return extends ParserRuleReturnScope {
        public HashMap result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "trail_mark"
    // RuleSet2.g:581:1: trail_mark returns [HashMap result] : 'mark' dm= var_domain ':' name= VAR (t= trail_with )? ;
    public final RuleSet2Parser.trail_mark_return trail_mark() throws RecognitionException {
        RuleSet2Parser.trail_mark_return retval = new RuleSet2Parser.trail_mark_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token name=null;
        Token string_literal57=null;
        Token char_literal58=null;
        RuleSet2Parser.var_domain_return dm = null;

        RuleSet2Parser.trail_with_return t = null;


        Object name_tree=null;
        Object string_literal57_tree=null;
        Object char_literal58_tree=null;

        try {
            // RuleSet2.g:582:2: ( 'mark' dm= var_domain ':' name= VAR (t= trail_with )? )
            // RuleSet2.g:583:2: 'mark' dm= var_domain ':' name= VAR (t= trail_with )?
            {
            root_0 = (Object)adaptor.nil();

            string_literal57=(Token)match(input,39,FOLLOW_39_in_trail_mark1732); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal57_tree = (Object)adaptor.create(string_literal57);
            adaptor.addChild(root_0, string_literal57_tree);
            }
            pushFollow(FOLLOW_var_domain_in_trail_mark1736);
            dm=var_domain();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, dm.getTree());
            char_literal58=(Token)match(input,37,FOLLOW_37_in_trail_mark1738); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal58_tree = (Object)adaptor.create(char_literal58);
            adaptor.addChild(root_0, char_literal58_tree);
            }
            name=(Token)match(input,VAR,FOLLOW_VAR_in_trail_mark1742); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            name_tree = (Object)adaptor.create(name);
            adaptor.addChild(root_0, name_tree);
            }
            // RuleSet2.g:583:37: (t= trail_with )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==40) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // RuleSet2.g:0:0: t= trail_with
                    {
                    pushFollow(FOLLOW_trail_with_in_trail_mark1746);
                    t=trail_with();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, t.getTree());

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		HashMap tmp = new HashMap();
              		tmp.put("action","mark");
              		tmp.put("name",(name!=null?name.getText():null));
              		tmp.put("domain",(dm!=null?input.toString(dm.start,dm.stop):null));
              		tmp.put("type","persistent");
              		if((t!=null?input.toString(t.start,t.stop):null) != null)
              			tmp.put("with",(t!=null?t.result:null));
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
    // $ANTLR end "trail_mark"

    public static class trail_with_return extends ParserRuleReturnScope {
        public Object result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "trail_with"
    // RuleSet2.g:595:1: trail_with returns [Object result] : 'with' e= expr ;
    public final RuleSet2Parser.trail_with_return trail_with() throws RecognitionException {
        RuleSet2Parser.trail_with_return retval = new RuleSet2Parser.trail_with_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal59=null;
        RuleSet2Parser.expr_return e = null;


        Object string_literal59_tree=null;

        try {
            // RuleSet2.g:596:2: ( 'with' e= expr )
            // RuleSet2.g:597:2: 'with' e= expr
            {
            root_0 = (Object)adaptor.nil();

            string_literal59=(Token)match(input,40,FOLLOW_40_in_trail_with1765); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal59_tree = (Object)adaptor.create(string_literal59);
            adaptor.addChild(root_0, string_literal59_tree);
            }
            pushFollow(FOLLOW_expr_in_trail_with1769);
            e=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
            if ( state.backtracking==0 ) {

              		retval.result = (e!=null?e.result:null);
              	
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
    // $ANTLR end "trail_with"

    public static class counter_op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "counter_op"
    // RuleSet2.g:602:1: counter_op : ( '+=' | '-=' );
    public final RuleSet2Parser.counter_op_return counter_op() throws RecognitionException {
        RuleSet2Parser.counter_op_return retval = new RuleSet2Parser.counter_op_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set60=null;

        Object set60_tree=null;

        try {
            // RuleSet2.g:603:2: ( '+=' | '-=' )
            // RuleSet2.g:
            {
            root_0 = (Object)adaptor.nil();

            set60=(Token)input.LT(1);
            if ( (input.LA(1)>=41 && input.LA(1)<=42) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set60));
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
        public Object result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "counter_start"
    // RuleSet2.g:608:1: counter_start returns [Object result] : must_be[\"from\"] e= expr ;
    public final RuleSet2Parser.counter_start_return counter_start() throws RecognitionException {
        RuleSet2Parser.counter_start_return retval = new RuleSet2Parser.counter_start_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RuleSet2Parser.expr_return e = null;

        RuleSet2Parser.must_be_return must_be61 = null;



        try {
            // RuleSet2.g:609:2: ( must_be[\"from\"] e= expr )
            // RuleSet2.g:610:2: must_be[\"from\"] e= expr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_must_be_in_counter_start1819);
            must_be61=must_be("from");

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, must_be61.getTree());
            pushFollow(FOLLOW_expr_in_counter_start1824);
            e=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
            if ( state.backtracking==0 ) {

              	 retval.result =e.result;
              	
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
    // $ANTLR end "counter_start"

    public static class for_clause_return extends ParserRuleReturnScope {
        public String result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "for_clause"
    // RuleSet2.g:616:1: for_clause returns [String result] : 'for' v= VAR ;
    public final RuleSet2Parser.for_clause_return for_clause() throws RecognitionException {
        RuleSet2Parser.for_clause_return retval = new RuleSet2Parser.for_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token v=null;
        Token string_literal62=null;

        Object v_tree=null;
        Object string_literal62_tree=null;

        try {
            // RuleSet2.g:617:2: ( 'for' v= VAR )
            // RuleSet2.g:618:2: 'for' v= VAR
            {
            root_0 = (Object)adaptor.nil();

            string_literal62=(Token)match(input,43,FOLLOW_43_in_for_clause1845); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal62_tree = (Object)adaptor.create(string_literal62);
            adaptor.addChild(root_0, string_literal62_tree);
            }
            v=(Token)match(input,VAR,FOLLOW_VAR_in_for_clause1850); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            v_tree = (Object)adaptor.create(v);
            adaptor.addChild(root_0, v_tree);
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
    // $ANTLR end "for_clause"

    public static class action_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "action"
    // RuleSet2.g:632:1: action[HashMap result] : ( conditional_action[result] | unconditional_action[result] ) ( ';' )? ;
    public final RuleSet2Parser.action_return action(HashMap result) throws RecognitionException {
        RuleSet2Parser.action_return retval = new RuleSet2Parser.action_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal65=null;
        RuleSet2Parser.conditional_action_return conditional_action63 = null;

        RuleSet2Parser.unconditional_action_return unconditional_action64 = null;


        Object char_literal65_tree=null;


        	result.put("blocktype","every");
        	HashMap condt = new HashMap();
        	condt.put("val","true");
        	condt.put("type","bool");
        	result.put("cond",condt);
        	result.put("actions",new ArrayList());

        try {
            // RuleSet2.g:641:2: ( ( conditional_action[result] | unconditional_action[result] ) ( ';' )? )
            // RuleSet2.g:642:2: ( conditional_action[result] | unconditional_action[result] ) ( ';' )?
            {
            root_0 = (Object)adaptor.nil();

            // RuleSet2.g:642:2: ( conditional_action[result] | unconditional_action[result] )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==32) ) {
                alt31=1;
            }
            else if ( (LA31_0==VAR||LA31_0==29||LA31_0==107) ) {
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
                    // RuleSet2.g:642:3: conditional_action[result]
                    {
                    pushFollow(FOLLOW_conditional_action_in_action1884);
                    conditional_action63=conditional_action(result);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditional_action63.getTree());

                    }
                    break;
                case 2 :
                    // RuleSet2.g:642:32: unconditional_action[result]
                    {
                    pushFollow(FOLLOW_unconditional_action_in_action1889);
                    unconditional_action64=unconditional_action(result);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unconditional_action64.getTree());

                    }
                    break;

            }

            // RuleSet2.g:642:62: ( ';' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==31) ) {
                int LA32_1 = input.LA(2);

                if ( (synpred51_RuleSet2()) ) {
                    alt32=1;
                }
            }
            switch (alt32) {
                case 1 :
                    // RuleSet2.g:0:0: ';'
                    {
                    char_literal65=(Token)match(input,31,FOLLOW_31_in_action1893); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal65_tree = (Object)adaptor.create(char_literal65);
                    adaptor.addChild(root_0, char_literal65_tree);
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
    // $ANTLR end "action"

    public static class conditional_action_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditional_action"
    // RuleSet2.g:646:1: conditional_action[HashMap result] : 'if' (e= expr )? must_be[\"then\"] unconditional_action[result] ;
    public final RuleSet2Parser.conditional_action_return conditional_action(HashMap result) throws RecognitionException {
        RuleSet2Parser.conditional_action_return retval = new RuleSet2Parser.conditional_action_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal66=null;
        RuleSet2Parser.expr_return e = null;

        RuleSet2Parser.must_be_return must_be67 = null;

        RuleSet2Parser.unconditional_action_return unconditional_action68 = null;


        Object string_literal66_tree=null;

        try {
            // RuleSet2.g:647:2: ( 'if' (e= expr )? must_be[\"then\"] unconditional_action[result] )
            // RuleSet2.g:647:4: 'if' (e= expr )? must_be[\"then\"] unconditional_action[result]
            {
            root_0 = (Object)adaptor.nil();

            string_literal66=(Token)match(input,32,FOLLOW_32_in_conditional_action1910); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal66_tree = (Object)adaptor.create(string_literal66);
            adaptor.addChild(root_0, string_literal66_tree);
            }
            // RuleSet2.g:647:10: (e= expr )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==INT||LA33_0==FLOAT||(LA33_0>=STRING && LA33_0<=REGEXP)||LA33_0==29||LA33_0==45||LA33_0==55||LA33_0==66||LA33_0==73||(LA33_0>=96 && LA33_0<=98)||(LA33_0>=100 && LA33_0<=103)) ) {
                alt33=1;
            }
            else if ( (LA33_0==VAR) ) {
                int LA33_2 = input.LA(2);

                if ( ((LA33_2>=18 && LA33_2<=28)||LA33_2==37||(LA33_2>=44 && LA33_2<=45)||(LA33_2>=68 && LA33_2<=72)||(LA33_2>=74 && LA33_2<=95)||LA33_2==98) ) {
                    alt33=1;
                }
                else if ( (LA33_2==VAR) ) {
                    int LA33_3 = input.LA(3);

                    if ( (synpred52_RuleSet2()) ) {
                        alt33=1;
                    }
                }
            }
            switch (alt33) {
                case 1 :
                    // RuleSet2.g:0:0: e= expr
                    {
                    pushFollow(FOLLOW_expr_in_conditional_action1914);
                    e=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_must_be_in_conditional_action1917);
            must_be67=must_be("then");

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, must_be67.getTree());
            pushFollow(FOLLOW_unconditional_action_in_conditional_action1920);
            unconditional_action68=unconditional_action(result);

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unconditional_action68.getTree());
            if ( state.backtracking==0 ) {

              		if((e!=null?input.toString(e.start,e.stop):null) == null)
              		{
              			HashMap tmp = new HashMap();
              			tmp.put("type","bool");
              			tmp.put("val","true");
              			result.put("cond",tmp);
              		}
              		else
              		{
              			result.put("cond",(e!=null?e.result:null));	 
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
    // $ANTLR end "conditional_action"

    public static class unconditional_action_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unconditional_action"
    // RuleSet2.g:662:1: unconditional_action[HashMap result] : (p= primrule | action_block[result] );
    public final RuleSet2Parser.unconditional_action_return unconditional_action(HashMap result) throws RecognitionException {
        RuleSet2Parser.unconditional_action_return retval = new RuleSet2Parser.unconditional_action_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RuleSet2Parser.primrule_return p = null;

        RuleSet2Parser.action_block_return action_block69 = null;



         
        	ArrayList temp_list = new ArrayList(); 

        try {
            // RuleSet2.g:666:2: (p= primrule | action_block[result] )
            int alt34=2;
            switch ( input.LA(1) ) {
            case VAR:
                {
                int LA34_1 = input.LA(2);

                if ( (LA34_1==37||(LA34_1>=44 && LA34_1<=45)) ) {
                    alt34=1;
                }
                else if ( (LA34_1==29) ) {
                    alt34=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 1, input);

                    throw nvae;
                }
                }
                break;
            case 107:
                {
                alt34=1;
                }
                break;
            case 29:
                {
                alt34=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // RuleSet2.g:666:4: p= primrule
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primrule_in_unconditional_action1945);
                    p=primrule();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p.getTree());
                    if ( state.backtracking==0 ) {
                      temp_list.add((p!=null?p.result:null)); result.put("actions",temp_list);
                    }

                    }
                    break;
                case 2 :
                    // RuleSet2.g:667:6: action_block[result]
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_action_block_in_unconditional_action1955);
                    action_block69=action_block(result);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, action_block69.getTree());

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

    public static class action_block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "action_block"
    // RuleSet2.g:670:1: action_block[HashMap result] : (at= must_be_one[sar(\"choose\",\"every\")] )? '{' (p= primrule ( ';' p= primrule )* ) ( ';' )? '}' ;
    public final RuleSet2Parser.action_block_return action_block(HashMap result) throws RecognitionException {
        RuleSet2Parser.action_block_return retval = new RuleSet2Parser.action_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal70=null;
        Token char_literal71=null;
        Token char_literal72=null;
        Token char_literal73=null;
        RuleSet2Parser.must_be_one_return at = null;

        RuleSet2Parser.primrule_return p = null;


        Object char_literal70_tree=null;
        Object char_literal71_tree=null;
        Object char_literal72_tree=null;
        Object char_literal73_tree=null;

         
        	ArrayList temp_list = new ArrayList(); 

        try {
            // RuleSet2.g:674:2: ( (at= must_be_one[sar(\"choose\",\"every\")] )? '{' (p= primrule ( ';' p= primrule )* ) ( ';' )? '}' )
            // RuleSet2.g:674:4: (at= must_be_one[sar(\"choose\",\"every\")] )? '{' (p= primrule ( ';' p= primrule )* ) ( ';' )? '}'
            {
            root_0 = (Object)adaptor.nil();

            // RuleSet2.g:674:6: (at= must_be_one[sar(\"choose\",\"every\")] )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==VAR) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // RuleSet2.g:0:0: at= must_be_one[sar(\"choose\",\"every\")]
                    {
                    pushFollow(FOLLOW_must_be_one_in_action_block1981);
                    at=must_be_one(sar("choose","every"));

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, at.getTree());

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
              result.put("blocktype",(at!=null?input.toString(at.start,at.stop):null)); 
            }
            char_literal70=(Token)match(input,29,FOLLOW_29_in_action_block1991); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal70_tree = (Object)adaptor.create(char_literal70);
            adaptor.addChild(root_0, char_literal70_tree);
            }
            // RuleSet2.g:675:7: (p= primrule ( ';' p= primrule )* )
            // RuleSet2.g:675:8: p= primrule ( ';' p= primrule )*
            {
            pushFollow(FOLLOW_primrule_in_action_block1996);
            p=primrule();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p.getTree());
            if ( state.backtracking==0 ) {
              temp_list.add((p!=null?p.result:null));
            }
            // RuleSet2.g:676:4: ( ';' p= primrule )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==31) ) {
                    int LA36_1 = input.LA(2);

                    if ( (LA36_1==VAR||LA36_1==107) ) {
                        alt36=1;
                    }


                }


                switch (alt36) {
            	case 1 :
            	    // RuleSet2.g:676:5: ';' p= primrule
            	    {
            	    char_literal71=(Token)match(input,31,FOLLOW_31_in_action_block2006); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal71_tree = (Object)adaptor.create(char_literal71);
            	    adaptor.addChild(root_0, char_literal71_tree);
            	    }
            	    pushFollow(FOLLOW_primrule_in_action_block2010);
            	    p=primrule();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p.getTree());
            	    if ( state.backtracking==0 ) {
            	      temp_list.add((p!=null?p.result:null));
            	    }

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }

            // RuleSet2.g:676:51: ( ';' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==31) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // RuleSet2.g:0:0: ';'
                    {
                    char_literal72=(Token)match(input,31,FOLLOW_31_in_action_block2017); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal72_tree = (Object)adaptor.create(char_literal72);
                    adaptor.addChild(root_0, char_literal72_tree);
                    }

                    }
                    break;

            }

            char_literal73=(Token)match(input,30,FOLLOW_30_in_action_block2020); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal73_tree = (Object)adaptor.create(char_literal73);
            adaptor.addChild(root_0, char_literal73_tree);
            }
            if ( state.backtracking==0 ) {

              		result.put("actions",temp_list);
              	
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
    // $ANTLR end "action_block"

    public static class primrule_return extends ParserRuleReturnScope {
        public HashMap result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primrule"
    // RuleSet2.g:681:1: primrule returns [HashMap result] : (label= VAR '=>' )? ( (src= namespace )? name= VAR '(' (ex= expr ( ',' ex1= expr )* )? ( ',' )? ')' (m= modifier_clause )? | e= emit_block ) ;
    public final RuleSet2Parser.primrule_return primrule() throws RecognitionException {
        RuleSet2Parser.primrule_return retval = new RuleSet2Parser.primrule_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token label=null;
        Token name=null;
        Token string_literal74=null;
        Token char_literal75=null;
        Token char_literal76=null;
        Token char_literal77=null;
        Token char_literal78=null;
        RuleSet2Parser.namespace_return src = null;

        RuleSet2Parser.expr_return ex = null;

        RuleSet2Parser.expr_return ex1 = null;

        RuleSet2Parser.modifier_clause_return m = null;

        RuleSet2Parser.emit_block_return e = null;


        Object label_tree=null;
        Object name_tree=null;
        Object string_literal74_tree=null;
        Object char_literal75_tree=null;
        Object char_literal76_tree=null;
        Object char_literal77_tree=null;
        Object char_literal78_tree=null;


        	ArrayList temp_list = new ArrayList();

        try {
            // RuleSet2.g:685:2: ( (label= VAR '=>' )? ( (src= namespace )? name= VAR '(' (ex= expr ( ',' ex1= expr )* )? ( ',' )? ')' (m= modifier_clause )? | e= emit_block ) )
            // RuleSet2.g:685:5: (label= VAR '=>' )? ( (src= namespace )? name= VAR '(' (ex= expr ( ',' ex1= expr )* )? ( ',' )? ')' (m= modifier_clause )? | e= emit_block )
            {
            root_0 = (Object)adaptor.nil();

            // RuleSet2.g:685:5: (label= VAR '=>' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==VAR) ) {
                int LA38_1 = input.LA(2);

                if ( (LA38_1==44) ) {
                    alt38=1;
                }
            }
            switch (alt38) {
                case 1 :
                    // RuleSet2.g:685:6: label= VAR '=>'
                    {
                    label=(Token)match(input,VAR,FOLLOW_VAR_in_primrule2047); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    label_tree = (Object)adaptor.create(label);
                    adaptor.addChild(root_0, label_tree);
                    }
                    string_literal74=(Token)match(input,44,FOLLOW_44_in_primrule2049); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal74_tree = (Object)adaptor.create(string_literal74);
                    adaptor.addChild(root_0, string_literal74_tree);
                    }

                    }
                    break;

            }

            // RuleSet2.g:685:23: ( (src= namespace )? name= VAR '(' (ex= expr ( ',' ex1= expr )* )? ( ',' )? ')' (m= modifier_clause )? | e= emit_block )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==VAR) ) {
                alt44=1;
            }
            else if ( (LA44_0==107) ) {
                alt44=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // RuleSet2.g:686:4: (src= namespace )? name= VAR '(' (ex= expr ( ',' ex1= expr )* )? ( ',' )? ')' (m= modifier_clause )?
                    {
                    // RuleSet2.g:686:7: (src= namespace )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==VAR) ) {
                        int LA39_1 = input.LA(2);

                        if ( (LA39_1==37) ) {
                            alt39=1;
                        }
                    }
                    switch (alt39) {
                        case 1 :
                            // RuleSet2.g:0:0: src= namespace
                            {
                            pushFollow(FOLLOW_namespace_in_primrule2060);
                            src=namespace();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, src.getTree());

                            }
                            break;

                    }

                    name=(Token)match(input,VAR,FOLLOW_VAR_in_primrule2065); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    name_tree = (Object)adaptor.create(name);
                    adaptor.addChild(root_0, name_tree);
                    }
                    char_literal75=(Token)match(input,45,FOLLOW_45_in_primrule2067); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal75_tree = (Object)adaptor.create(char_literal75);
                    adaptor.addChild(root_0, char_literal75_tree);
                    }
                    // RuleSet2.g:686:32: (ex= expr ( ',' ex1= expr )* )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( ((LA41_0>=VAR && LA41_0<=INT)||LA41_0==FLOAT||(LA41_0>=STRING && LA41_0<=REGEXP)||LA41_0==29||LA41_0==45||LA41_0==55||LA41_0==66||LA41_0==73||(LA41_0>=96 && LA41_0<=98)||(LA41_0>=100 && LA41_0<=103)) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // RuleSet2.g:686:33: ex= expr ( ',' ex1= expr )*
                            {
                            pushFollow(FOLLOW_expr_in_primrule2072);
                            ex=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, ex.getTree());
                            if ( state.backtracking==0 ) {
                              temp_list.add((ex!=null?ex.result:null));
                            }
                            // RuleSet2.g:686:70: ( ',' ex1= expr )*
                            loop40:
                            do {
                                int alt40=2;
                                int LA40_0 = input.LA(1);

                                if ( (LA40_0==46) ) {
                                    int LA40_1 = input.LA(2);

                                    if ( ((LA40_1>=VAR && LA40_1<=INT)||LA40_1==FLOAT||(LA40_1>=STRING && LA40_1<=REGEXP)||LA40_1==29||LA40_1==45||LA40_1==55||LA40_1==66||LA40_1==73||(LA40_1>=96 && LA40_1<=98)||(LA40_1>=100 && LA40_1<=103)) ) {
                                        alt40=1;
                                    }


                                }


                                switch (alt40) {
                            	case 1 :
                            	    // RuleSet2.g:686:71: ',' ex1= expr
                            	    {
                            	    char_literal76=(Token)match(input,46,FOLLOW_46_in_primrule2077); if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) {
                            	    char_literal76_tree = (Object)adaptor.create(char_literal76);
                            	    adaptor.addChild(root_0, char_literal76_tree);
                            	    }
                            	    pushFollow(FOLLOW_expr_in_primrule2081);
                            	    ex1=expr();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, ex1.getTree());
                            	    if ( state.backtracking==0 ) {
                            	      temp_list.add((ex1!=null?ex1.result:null));
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop40;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // RuleSet2.g:686:118: ( ',' )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==46) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // RuleSet2.g:0:0: ','
                            {
                            char_literal77=(Token)match(input,46,FOLLOW_46_in_primrule2089); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal77_tree = (Object)adaptor.create(char_literal77);
                            adaptor.addChild(root_0, char_literal77_tree);
                            }

                            }
                            break;

                    }

                    char_literal78=(Token)match(input,47,FOLLOW_47_in_primrule2093); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal78_tree = (Object)adaptor.create(char_literal78);
                    adaptor.addChild(root_0, char_literal78_tree);
                    }
                    // RuleSet2.g:686:129: (m= modifier_clause )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==40) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // RuleSet2.g:0:0: m= modifier_clause
                            {
                            pushFollow(FOLLOW_modifier_clause_in_primrule2097);
                            m=modifier_clause();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, m.getTree());

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                      		 	
                      		 	HashMap tmp = new HashMap();
                      		 	tmp.put("source",(src!=null?src.result:null));
                      		 	tmp.put("name",(name!=null?name.getText():null));
                      		 	tmp.put("args",temp_list);
                      		 
                      		 	
                      		 	if((label!=null?label.getText():null) != null) 
                      			 	tmp.put("label",(label!=null?label.getText():null));
                      			 	
                      		 	tmp.put("modifiers",(m!=null?m.result:null));
                      		 	HashMap tmp2 = new HashMap();
                      			tmp2.put("action",tmp);
                      			if((label!=null?label.getText():null) != null)
                      				tmp2.put("label",(label!=null?label.getText():null));
                      			retval.result = tmp2;
                      		 	
                      		 
                    }

                    }
                    break;
                case 2 :
                    // RuleSet2.g:705:4: e= emit_block
                    {
                    pushFollow(FOLLOW_emit_block_in_primrule2107);
                    e=emit_block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
                    if ( state.backtracking==0 ) {
                       
                      			HashMap tmp = new HashMap();
                      			tmp.put("emit",(e!=null?e.emit_value:null));
                      			retval.result = tmp;
                      		
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
    // $ANTLR end "primrule"

    public static class modifier_clause_return extends ParserRuleReturnScope {
        public ArrayList result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "modifier_clause"
    // RuleSet2.g:715:1: modifier_clause returns [ArrayList result] : 'with' m= modifier ( 'and' m1= modifier )* ;
    public final RuleSet2Parser.modifier_clause_return modifier_clause() throws RecognitionException {
        RuleSet2Parser.modifier_clause_return retval = new RuleSet2Parser.modifier_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal79=null;
        Token string_literal80=null;
        RuleSet2Parser.modifier_return m = null;

        RuleSet2Parser.modifier_return m1 = null;


        Object string_literal79_tree=null;
        Object string_literal80_tree=null;


        	ArrayList temp_list = new ArrayList();

        try {
            // RuleSet2.g:719:2: ( 'with' m= modifier ( 'and' m1= modifier )* )
            // RuleSet2.g:720:2: 'with' m= modifier ( 'and' m1= modifier )*
            {
            root_0 = (Object)adaptor.nil();

            string_literal79=(Token)match(input,40,FOLLOW_40_in_modifier_clause2141); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal79_tree = (Object)adaptor.create(string_literal79);
            adaptor.addChild(root_0, string_literal79_tree);
            }
            pushFollow(FOLLOW_modifier_in_modifier_clause2145);
            m=modifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, m.getTree());
            if ( state.backtracking==0 ) {
              temp_list.add((m!=null?m.result:null));
            }
            // RuleSet2.g:720:48: ( 'and' m1= modifier )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==48) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // RuleSet2.g:720:49: 'and' m1= modifier
            	    {
            	    string_literal80=(Token)match(input,48,FOLLOW_48_in_modifier_clause2150); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal80_tree = (Object)adaptor.create(string_literal80);
            	    adaptor.addChild(root_0, string_literal80_tree);
            	    }
            	    pushFollow(FOLLOW_modifier_in_modifier_clause2154);
            	    m1=modifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, m1.getTree());
            	    if ( state.backtracking==0 ) {
            	      temp_list.add((m1!=null?m1.result:null));
            	    }

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		retval.result = temp_list;
              	
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
    // $ANTLR end "modifier_clause"

    public static class modifier_return extends ParserRuleReturnScope {
        public HashMap result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "modifier"
    // RuleSet2.g:726:1: modifier returns [HashMap result] : name= VAR '=' (e= expr | j= JS ) ;
    public final RuleSet2Parser.modifier_return modifier() throws RecognitionException {
        RuleSet2Parser.modifier_return retval = new RuleSet2Parser.modifier_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token name=null;
        Token j=null;
        Token char_literal81=null;
        RuleSet2Parser.expr_return e = null;


        Object name_tree=null;
        Object j_tree=null;
        Object char_literal81_tree=null;

        try {
            // RuleSet2.g:727:2: (name= VAR '=' (e= expr | j= JS ) )
            // RuleSet2.g:727:4: name= VAR '=' (e= expr | j= JS )
            {
            root_0 = (Object)adaptor.nil();

            name=(Token)match(input,VAR,FOLLOW_VAR_in_modifier2179); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            name_tree = (Object)adaptor.create(name);
            adaptor.addChild(root_0, name_tree);
            }
            char_literal81=(Token)match(input,36,FOLLOW_36_in_modifier2181); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal81_tree = (Object)adaptor.create(char_literal81);
            adaptor.addChild(root_0, char_literal81_tree);
            }
            // RuleSet2.g:727:17: (e= expr | j= JS )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=VAR && LA46_0<=INT)||LA46_0==FLOAT||(LA46_0>=STRING && LA46_0<=REGEXP)||LA46_0==29||LA46_0==45||LA46_0==55||LA46_0==66||LA46_0==73||(LA46_0>=96 && LA46_0<=98)||(LA46_0>=100 && LA46_0<=103)) ) {
                alt46=1;
            }
            else if ( (LA46_0==JS) ) {
                alt46=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // RuleSet2.g:727:18: e= expr
                    {
                    pushFollow(FOLLOW_expr_in_modifier2186);
                    e=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());

                    }
                    break;
                case 2 :
                    // RuleSet2.g:727:27: j= JS
                    {
                    j=(Token)match(input,JS,FOLLOW_JS_in_modifier2192); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    j_tree = (Object)adaptor.create(j);
                    adaptor.addChild(root_0, j_tree);
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		HashMap tmp2 = new HashMap();
              		
              		HashMap tmp = new HashMap();
              		if((e!=null?input.toString(e.start,e.stop):null) != null)
              		{
              			tmp2.put("value",(e!=null?e.result:null));
              		}
              		else
              		{
              			tmp.put("type","JS");
              			tmp.put("val",strip_wrappers("<|","|>",(j!=null?j.getText():null)));		
              			tmp2.put("value",tmp);
              		}

              		tmp2.put("name",(name!=null?name.getText():null));
              		retval.result = tmp2;
              	
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

    public static class using_return extends ParserRuleReturnScope {
        public HashMap result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "using"
    // RuleSet2.g:754:1: using returns [HashMap result] : 'using' p= ( STRING | REGEXP ) (s= setting )? ;
    public final RuleSet2Parser.using_return using() throws RecognitionException {
        RuleSet2Parser.using_return retval = new RuleSet2Parser.using_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token p=null;
        Token string_literal82=null;
        RuleSet2Parser.setting_return s = null;


        Object p_tree=null;
        Object string_literal82_tree=null;

        try {
            // RuleSet2.g:755:2: ( 'using' p= ( STRING | REGEXP ) (s= setting )? )
            // RuleSet2.g:755:4: 'using' p= ( STRING | REGEXP ) (s= setting )?
            {
            root_0 = (Object)adaptor.nil();

            string_literal82=(Token)match(input,49,FOLLOW_49_in_using2217); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal82_tree = (Object)adaptor.create(string_literal82);
            adaptor.addChild(root_0, string_literal82_tree);
            }
            p=(Token)input.LT(1);
            if ( (input.LA(1)>=STRING && input.LA(1)<=REGEXP) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(p));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            // RuleSet2.g:755:31: (s= setting )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==50) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // RuleSet2.g:0:0: s= setting
                    {
                    pushFollow(FOLLOW_setting_in_using2229);
                    s=setting();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, s.getTree());

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			HashMap tmp = new HashMap();
              			HashMap evt_expr = new HashMap();
              			evt_expr.put("pattern",strip_string((p!=null?p.getText():null)));
              			evt_expr.put("legacy",1);
              			evt_expr.put("type","prim_event");
              			evt_expr.put("op","pageview");
              			
              			if((s!=null?input.toString(s.start,s.stop):null) != null)
              				evt_expr.put("vars",(s!=null?s.result:null));	
              			
              			tmp.put("event_expr",evt_expr);		
              			retval.result =tmp;
              		
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
    // $ANTLR end "using"

    public static class setting_return extends ParserRuleReturnScope {
        public ArrayList result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "setting"
    // RuleSet2.g:770:1: setting returns [ArrayList result] : 'setting' '(' (v= VAR ( ',' v2= VAR )* )? ')' ;
    public final RuleSet2Parser.setting_return setting() throws RecognitionException {
        RuleSet2Parser.setting_return retval = new RuleSet2Parser.setting_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token v=null;
        Token v2=null;
        Token string_literal83=null;
        Token char_literal84=null;
        Token char_literal85=null;
        Token char_literal86=null;

        Object v_tree=null;
        Object v2_tree=null;
        Object string_literal83_tree=null;
        Object char_literal84_tree=null;
        Object char_literal85_tree=null;
        Object char_literal86_tree=null;


        	ArrayList sresult = new ArrayList();

        try {
            // RuleSet2.g:774:2: ( 'setting' '(' (v= VAR ( ',' v2= VAR )* )? ')' )
            // RuleSet2.g:774:4: 'setting' '(' (v= VAR ( ',' v2= VAR )* )? ')'
            {
            root_0 = (Object)adaptor.nil();

            string_literal83=(Token)match(input,50,FOLLOW_50_in_setting2250); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal83_tree = (Object)adaptor.create(string_literal83);
            adaptor.addChild(root_0, string_literal83_tree);
            }
            char_literal84=(Token)match(input,45,FOLLOW_45_in_setting2252); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal84_tree = (Object)adaptor.create(char_literal84);
            adaptor.addChild(root_0, char_literal84_tree);
            }
            // RuleSet2.g:774:18: (v= VAR ( ',' v2= VAR )* )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==VAR) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // RuleSet2.g:774:19: v= VAR ( ',' v2= VAR )*
                    {
                    v=(Token)match(input,VAR,FOLLOW_VAR_in_setting2257); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    v_tree = (Object)adaptor.create(v);
                    adaptor.addChild(root_0, v_tree);
                    }
                    if ( state.backtracking==0 ) {
                      sresult.add((v!=null?v.getText():null));
                    }
                    // RuleSet2.g:774:48: ( ',' v2= VAR )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==46) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // RuleSet2.g:774:49: ',' v2= VAR
                    	    {
                    	    char_literal85=(Token)match(input,46,FOLLOW_46_in_setting2261); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal85_tree = (Object)adaptor.create(char_literal85);
                    	    adaptor.addChild(root_0, char_literal85_tree);
                    	    }
                    	    v2=(Token)match(input,VAR,FOLLOW_VAR_in_setting2265); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    v2_tree = (Object)adaptor.create(v2);
                    	    adaptor.addChild(root_0, v2_tree);
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	      sresult.add((v2!=null?v2.getText():null));
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal86=(Token)match(input,47,FOLLOW_47_in_setting2273); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal86_tree = (Object)adaptor.create(char_literal86);
            adaptor.addChild(root_0, char_literal86_tree);
            }
            if ( state.backtracking==0 ) {

              		retval.result = sresult;
              	
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

    public static class pre_block_return extends ParserRuleReturnScope {
        public ArrayList result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pre_block"
    // RuleSet2.g:780:1: pre_block returns [ArrayList result] : 'pre' '{' ( decl[tmp] ( ';' decl[tmp] )* )? ( ';' )? '}' ;
    public final RuleSet2Parser.pre_block_return pre_block() throws RecognitionException {
        RuleSet2Parser.pre_block_return retval = new RuleSet2Parser.pre_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal87=null;
        Token char_literal88=null;
        Token char_literal90=null;
        Token char_literal92=null;
        Token char_literal93=null;
        RuleSet2Parser.decl_return decl89 = null;

        RuleSet2Parser.decl_return decl91 = null;


        Object string_literal87_tree=null;
        Object char_literal88_tree=null;
        Object char_literal90_tree=null;
        Object char_literal92_tree=null;
        Object char_literal93_tree=null;


        	ArrayList tmp = new ArrayList();

        try {
            // RuleSet2.g:783:3: ( 'pre' '{' ( decl[tmp] ( ';' decl[tmp] )* )? ( ';' )? '}' )
            // RuleSet2.g:784:3: 'pre' '{' ( decl[tmp] ( ';' decl[tmp] )* )? ( ';' )? '}'
            {
            root_0 = (Object)adaptor.nil();

            string_literal87=(Token)match(input,51,FOLLOW_51_in_pre_block2298); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal87_tree = (Object)adaptor.create(string_literal87);
            adaptor.addChild(root_0, string_literal87_tree);
            }
            char_literal88=(Token)match(input,29,FOLLOW_29_in_pre_block2300); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal88_tree = (Object)adaptor.create(char_literal88);
            adaptor.addChild(root_0, char_literal88_tree);
            }
            // RuleSet2.g:784:13: ( decl[tmp] ( ';' decl[tmp] )* )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==VAR) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // RuleSet2.g:784:15: decl[tmp] ( ';' decl[tmp] )*
                    {
                    pushFollow(FOLLOW_decl_in_pre_block2304);
                    decl89=decl(tmp);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, decl89.getTree());
                    // RuleSet2.g:784:25: ( ';' decl[tmp] )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==31) ) {
                            int LA50_1 = input.LA(2);

                            if ( (LA50_1==VAR) ) {
                                alt50=1;
                            }


                        }


                        switch (alt50) {
                    	case 1 :
                    	    // RuleSet2.g:784:26: ';' decl[tmp]
                    	    {
                    	    char_literal90=(Token)match(input,31,FOLLOW_31_in_pre_block2308); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal90_tree = (Object)adaptor.create(char_literal90);
                    	    adaptor.addChild(root_0, char_literal90_tree);
                    	    }
                    	    pushFollow(FOLLOW_decl_in_pre_block2310);
                    	    decl91=decl(tmp);

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, decl91.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);


                    }
                    break;

            }

            // RuleSet2.g:784:45: ( ';' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==31) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // RuleSet2.g:0:0: ';'
                    {
                    char_literal92=(Token)match(input,31,FOLLOW_31_in_pre_block2318); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal92_tree = (Object)adaptor.create(char_literal92);
                    adaptor.addChild(root_0, char_literal92_tree);
                    }

                    }
                    break;

            }

            char_literal93=(Token)match(input,30,FOLLOW_30_in_pre_block2321); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal93_tree = (Object)adaptor.create(char_literal93);
            adaptor.addChild(root_0, char_literal93_tree);
            }
            if ( state.backtracking==0 ) {

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
    // $ANTLR end "pre_block"

    public static class foreach_return extends ParserRuleReturnScope {
        public ArrayList result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "foreach"
    // RuleSet2.g:791:1: foreach returns [ArrayList result] : 'foreach' e= expr s= setting ;
    public final RuleSet2Parser.foreach_return foreach() throws RecognitionException {
        RuleSet2Parser.foreach_return retval = new RuleSet2Parser.foreach_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal94=null;
        RuleSet2Parser.expr_return e = null;

        RuleSet2Parser.setting_return s = null;


        Object string_literal94_tree=null;

        try {
            // RuleSet2.g:792:2: ( 'foreach' e= expr s= setting )
            // RuleSet2.g:793:2: 'foreach' e= expr s= setting
            {
            root_0 = (Object)adaptor.nil();

            string_literal94=(Token)match(input,52,FOLLOW_52_in_foreach2354); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal94_tree = (Object)adaptor.create(string_literal94);
            adaptor.addChild(root_0, string_literal94_tree);
            }
            pushFollow(FOLLOW_expr_in_foreach2358);
            e=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
            pushFollow(FOLLOW_setting_in_foreach2362);
            s=setting();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, s.getTree());
            if ( state.backtracking==0 ) {

              		retval.result = new ArrayList();
              		HashMap tmp = new HashMap();
              		tmp.put("expr",e.result);
              		tmp.put("var",s.result);
              		retval.result.add(tmp);	
              	
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
    // $ANTLR end "foreach"

    public static class when_return extends ParserRuleReturnScope {
        public HashMap result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "when"
    // RuleSet2.g:803:1: when returns [HashMap result] : 'when' es= event_seq ;
    public final RuleSet2Parser.when_return when() throws RecognitionException {
        RuleSet2Parser.when_return retval = new RuleSet2Parser.when_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal95=null;
        RuleSet2Parser.event_seq_return es = null;


        Object string_literal95_tree=null;



        try {
            // RuleSet2.g:806:2: ( 'when' es= event_seq )
            // RuleSet2.g:807:2: 'when' es= event_seq
            {
            root_0 = (Object)adaptor.nil();

            string_literal95=(Token)match(input,53,FOLLOW_53_in_when2397); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal95_tree = (Object)adaptor.create(string_literal95);
            adaptor.addChild(root_0, string_literal95_tree);
            }
            pushFollow(FOLLOW_event_seq_in_when2401);
            es=event_seq();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, es.getTree());
            if ( state.backtracking==0 ) {

              		HashMap tmp = new HashMap();
              		tmp.put("foreach",new ArrayList());
              		tmp.put("event_expr",(es!=null?es.result:null));
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
    // $ANTLR end "when"

    public static class event_seq_return extends ParserRuleReturnScope {
        public HashMap result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "event_seq"
    // RuleSet2.g:816:1: event_seq returns [HashMap result] : eor= event_or (tb= must_be_one[sar(\"then\",\"before\")] eor2= event_or )* ;
    public final RuleSet2Parser.event_seq_return event_seq() throws RecognitionException {
        RuleSet2Parser.event_seq_return retval = new RuleSet2Parser.event_seq_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RuleSet2Parser.event_or_return eor = null;

        RuleSet2Parser.must_be_one_return tb = null;

        RuleSet2Parser.event_or_return eor2 = null;




        	ArrayList temp_list = new ArrayList();
        	ArrayList temp_list_2 = new ArrayList();

        try {
            // RuleSet2.g:821:2: (eor= event_or (tb= must_be_one[sar(\"then\",\"before\")] eor2= event_or )* )
            // RuleSet2.g:822:3: eor= event_or (tb= must_be_one[sar(\"then\",\"before\")] eor2= event_or )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_event_or_in_event_seq2428);
            eor=event_or();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, eor.getTree());
            // RuleSet2.g:822:16: (tb= must_be_one[sar(\"then\",\"before\")] eor2= event_or )*
            loop53:
            do {
                int alt53=2;
                alt53 = dfa53.predict(input);
                switch (alt53) {
            	case 1 :
            	    // RuleSet2.g:822:17: tb= must_be_one[sar(\"then\",\"before\")] eor2= event_or
            	    {
            	    pushFollow(FOLLOW_must_be_one_in_event_seq2433);
            	    tb=must_be_one(sar("then","before"));

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, tb.getTree());
            	    pushFollow(FOLLOW_event_or_in_event_seq2438);
            	    eor2=event_or();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, eor2.getTree());
            	    if ( state.backtracking==0 ) {
            	       temp_list_2.add((tb!=null?input.toString(tb.start,tb.stop):null));temp_list.add(eor2);
            	    }

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              			if(temp_list.size() == 0)
              			{ 
              				retval.result = eor.result; 
              			}
              			else 
              			{
              				HashMap the_result = new HashMap();
              				the_result.put("type","complex_event");
              				the_result.put("op",temp_list_2.get(0).toString());
              				the_result.put("args",new ArrayList());
              				((ArrayList)the_result.get("args")).add(eor.result);
              				HashMap last = the_result;
              				
              				for(int i = 0; i <temp_list.size(); i++)
              				{				
              					HashMap rtmp = ((event_or_return)temp_list.get(i)).result;
              					if(i == temp_list.size() - 1)
              					{
              						((ArrayList)last.get("args")).add(rtmp);						
              					}
              					else
              					{	
              						HashMap tmp = new HashMap();
              						tmp.put("type","complex_event");
              						tmp.put("op",temp_list_2.get(i+1).toString());
              						tmp.put("args",new ArrayList());
              						((ArrayList)tmp.get("args")).add(rtmp);
              						((ArrayList)last.get("args")).add(tmp);
              						last = 	tmp;
              					}
              				}
              				
              				retval.result = the_result;
              				
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
    // $ANTLR end "event_seq"

    public static class event_or_return extends ParserRuleReturnScope {
        public HashMap result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "event_or"
    // RuleSet2.g:867:1: event_or returns [HashMap result] : ea= event_and ( 'or' ea1= event_and )* ;
    public final RuleSet2Parser.event_or_return event_or() throws RecognitionException {
        RuleSet2Parser.event_or_return retval = new RuleSet2Parser.event_or_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal96=null;
        RuleSet2Parser.event_and_return ea = null;

        RuleSet2Parser.event_and_return ea1 = null;


        Object string_literal96_tree=null;


        	ArrayList temp_list = new ArrayList();

        try {
            // RuleSet2.g:871:2: (ea= event_and ( 'or' ea1= event_and )* )
            // RuleSet2.g:872:3: ea= event_and ( 'or' ea1= event_and )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_event_and_in_event_or2480);
            ea=event_and();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ea.getTree());
            if ( state.backtracking==0 ) {
              temp_list.add(ea);
            }
            // RuleSet2.g:872:37: ( 'or' ea1= event_and )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==54) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // RuleSet2.g:872:38: 'or' ea1= event_and
            	    {
            	    string_literal96=(Token)match(input,54,FOLLOW_54_in_event_or2485); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal96_tree = (Object)adaptor.create(string_literal96);
            	    adaptor.addChild(root_0, string_literal96_tree);
            	    }
            	    pushFollow(FOLLOW_event_and_in_event_or2489);
            	    ea1=event_and();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, ea1.getTree());
            	    if ( state.backtracking==0 ) {
            	       temp_list.add(ea1);
            	    }

            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              			if(temp_list.size() == 1)
              			{ 
              				retval.result = ((event_and_return)temp_list.get(0)).result;
              			}
              			else
              			{
              				HashMap the_result = new HashMap();
              				the_result.put("type","complex_event");
              				the_result.put("op","or");
              				the_result.put("args",new ArrayList());
              				((ArrayList)the_result.get("args")).add(ea.result);
              				HashMap last = the_result;
              				

              				for(int i = 1; i <temp_list.size(); i++)
              				{				
              					HashMap rtmp = ((event_and_return)temp_list.get(i)).result;
              					if(i == temp_list.size() - 1)
              					{
              						((ArrayList)last.get("args")).add(rtmp);						
              					}
              					else
              					{	
              						HashMap tmp = new HashMap();
              						tmp.put("type","complex_event");
              						tmp.put("op","or");
              						tmp.put("args",new ArrayList());
              						((ArrayList)tmp.get("args")).add(rtmp);
              						((ArrayList)last.get("args")).add(tmp);
              						last = 	tmp;
              					}
              				}
              				
              				retval.result = the_result;
              				
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
    // $ANTLR end "event_or"

    public static class event_and_return extends ParserRuleReturnScope {
        public HashMap result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "event_and"
    // RuleSet2.g:913:1: event_and returns [HashMap result] : e= event_btwn ( 'and' e1= event_btwn )* ;
    public final RuleSet2Parser.event_and_return event_and() throws RecognitionException {
        RuleSet2Parser.event_and_return retval = new RuleSet2Parser.event_and_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal97=null;
        RuleSet2Parser.event_btwn_return e = null;

        RuleSet2Parser.event_btwn_return e1 = null;


        Object string_literal97_tree=null;


        	ArrayList temp_list = new ArrayList();

        try {
            // RuleSet2.g:917:2: (e= event_btwn ( 'and' e1= event_btwn )* )
            // RuleSet2.g:918:3: e= event_btwn ( 'and' e1= event_btwn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_event_btwn_in_event_and2519);
            e=event_btwn();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
            if ( state.backtracking==0 ) {
              temp_list.add(e);
            }
            // RuleSet2.g:918:36: ( 'and' e1= event_btwn )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==48) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // RuleSet2.g:918:37: 'and' e1= event_btwn
            	    {
            	    string_literal97=(Token)match(input,48,FOLLOW_48_in_event_and2524); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal97_tree = (Object)adaptor.create(string_literal97);
            	    adaptor.addChild(root_0, string_literal97_tree);
            	    }
            	    pushFollow(FOLLOW_event_btwn_in_event_and2528);
            	    e1=event_btwn();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, e1.getTree());
            	    if ( state.backtracking==0 ) {
            	       temp_list.add(e1);
            	    }

            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              			
              			if(temp_list.size() == 1)
              			{ 
              				retval.result = ((event_btwn_return)temp_list.get(0)).result;
              			}
              			else
              			{
              				HashMap the_result = new HashMap();
              				the_result.put("type","complex_event");
              				the_result.put("op","and");
              				the_result.put("args",new ArrayList());
              				((ArrayList)the_result.get("args")).add(e.result);
              				HashMap last = the_result;
              				

              				for(int i = 1; i <temp_list.size(); i++)
              				{				
              					HashMap rtmp = ((event_btwn_return)temp_list.get(i)).result;
              					if(i == temp_list.size() - 1)
              					{
              						((ArrayList)last.get("args")).add(rtmp);						
              					}
              					else
              					{	
              						HashMap tmp = new HashMap();
              						tmp.put("type","complex_event");
              						tmp.put("op","and");
              						tmp.put("args",new ArrayList());
              						((ArrayList)tmp.get("args")).add(rtmp);
              						((ArrayList)last.get("args")).add(tmp);
              						last = 	tmp;
              					}
              				}
              				
              				retval.result = the_result;
              				
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
    // $ANTLR end "event_and"

    public static class event_btwn_return extends ParserRuleReturnScope {
        public HashMap result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "event_btwn"
    // RuleSet2.g:959:1: event_btwn returns [HashMap result] : ep= event_prim ( (not= 'not' )? 'between' '(' es1= event_seq ',' es2= event_seq ')' )? ;
    public final RuleSet2Parser.event_btwn_return event_btwn() throws RecognitionException {
        RuleSet2Parser.event_btwn_return retval = new RuleSet2Parser.event_btwn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token not=null;
        Token string_literal98=null;
        Token char_literal99=null;
        Token char_literal100=null;
        Token char_literal101=null;
        RuleSet2Parser.event_prim_return ep = null;

        RuleSet2Parser.event_seq_return es1 = null;

        RuleSet2Parser.event_seq_return es2 = null;


        Object not_tree=null;
        Object string_literal98_tree=null;
        Object char_literal99_tree=null;
        Object char_literal100_tree=null;
        Object char_literal101_tree=null;

        try {
            // RuleSet2.g:960:2: (ep= event_prim ( (not= 'not' )? 'between' '(' es1= event_seq ',' es2= event_seq ')' )? )
            // RuleSet2.g:961:3: ep= event_prim ( (not= 'not' )? 'between' '(' es1= event_seq ',' es2= event_seq ')' )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_event_prim_in_event_btwn2554);
            ep=event_prim();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ep.getTree());
            // RuleSet2.g:961:17: ( (not= 'not' )? 'between' '(' es1= event_seq ',' es2= event_seq ')' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( ((LA57_0>=55 && LA57_0<=56)) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // RuleSet2.g:961:18: (not= 'not' )? 'between' '(' es1= event_seq ',' es2= event_seq ')'
                    {
                    // RuleSet2.g:961:18: (not= 'not' )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==55) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // RuleSet2.g:961:19: not= 'not'
                            {
                            not=(Token)match(input,55,FOLLOW_55_in_event_btwn2560); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            not_tree = (Object)adaptor.create(not);
                            adaptor.addChild(root_0, not_tree);
                            }

                            }
                            break;

                    }

                    string_literal98=(Token)match(input,56,FOLLOW_56_in_event_btwn2565); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal98_tree = (Object)adaptor.create(string_literal98);
                    adaptor.addChild(root_0, string_literal98_tree);
                    }
                    char_literal99=(Token)match(input,45,FOLLOW_45_in_event_btwn2567); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal99_tree = (Object)adaptor.create(char_literal99);
                    adaptor.addChild(root_0, char_literal99_tree);
                    }
                    pushFollow(FOLLOW_event_seq_in_event_btwn2571);
                    es1=event_seq();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, es1.getTree());
                    char_literal100=(Token)match(input,46,FOLLOW_46_in_event_btwn2573); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal100_tree = (Object)adaptor.create(char_literal100);
                    adaptor.addChild(root_0, char_literal100_tree);
                    }
                    pushFollow(FOLLOW_event_seq_in_event_btwn2577);
                    es2=event_seq();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, es2.getTree());
                    char_literal101=(Token)match(input,47,FOLLOW_47_in_event_btwn2579); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal101_tree = (Object)adaptor.create(char_literal101);
                    adaptor.addChild(root_0, char_literal101_tree);
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		
              		
              			if((es1!=null?input.toString(es1.start,es1.stop):null) == null)
              			{ 
              				retval.result = ep.result;
              			}
              			else
              			{
              				HashMap the_result = new HashMap();
              				the_result.put("type","complex_event");
              				if((not!=null?not.getText():null) != null)
              					the_result.put("op","notbetween");
              				else
              					the_result.put("op","between");
              				the_result.put("first",es1.result);
              				the_result.put("last",es2.result);
              				the_result.put("mid",ep.result);
              				retval.result = the_result;
              				
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
    // $ANTLR end "event_btwn"

    public static class event_prim_return extends ParserRuleReturnScope {
        public HashMap result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "event_prim"
    // RuleSet2.g:986:1: event_prim returns [HashMap result] : ( ( 'web' )? 'pageview' (spat= STRING | rpat= REGEXP ) (set= setting )? | ( 'web' )? opt= must_be_one[sar(\"submit\",\"click\",\"dblclick\",\"change\",\"update\")] elem= STRING (on= on_expr )? (set= setting )? | dom= VAR oper= VAR (filter= event_filter )* (set= setting )? | '(' evt= event_seq ')' );
    public final RuleSet2Parser.event_prim_return event_prim() throws RecognitionException {
        RuleSet2Parser.event_prim_return retval = new RuleSet2Parser.event_prim_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token spat=null;
        Token rpat=null;
        Token elem=null;
        Token dom=null;
        Token oper=null;
        Token string_literal102=null;
        Token string_literal103=null;
        Token string_literal104=null;
        Token char_literal105=null;
        Token char_literal106=null;
        RuleSet2Parser.setting_return set = null;

        RuleSet2Parser.must_be_one_return opt = null;

        RuleSet2Parser.on_expr_return on = null;

        RuleSet2Parser.event_filter_return filter = null;

        RuleSet2Parser.event_seq_return evt = null;


        Object spat_tree=null;
        Object rpat_tree=null;
        Object elem_tree=null;
        Object dom_tree=null;
        Object oper_tree=null;
        Object string_literal102_tree=null;
        Object string_literal103_tree=null;
        Object string_literal104_tree=null;
        Object char_literal105_tree=null;
        Object char_literal106_tree=null;


        	ArrayList filters = new ArrayList();

        try {
            // RuleSet2.g:990:2: ( ( 'web' )? 'pageview' (spat= STRING | rpat= REGEXP ) (set= setting )? | ( 'web' )? opt= must_be_one[sar(\"submit\",\"click\",\"dblclick\",\"change\",\"update\")] elem= STRING (on= on_expr )? (set= setting )? | dom= VAR oper= VAR (filter= event_filter )* (set= setting )? | '(' evt= event_seq ')' )
            int alt66=4;
            switch ( input.LA(1) ) {
            case 57:
                {
                int LA66_1 = input.LA(2);

                if ( (LA66_1==58) ) {
                    alt66=1;
                }
                else if ( (LA66_1==VAR) ) {
                    alt66=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 66, 1, input);

                    throw nvae;
                }
                }
                break;
            case 58:
                {
                alt66=1;
                }
                break;
            case VAR:
                {
                int LA66_3 = input.LA(2);

                if ( (LA66_3==VAR) ) {
                    alt66=3;
                }
                else if ( (LA66_3==STRING) ) {
                    alt66=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 66, 3, input);

                    throw nvae;
                }
                }
                break;
            case 45:
                {
                alt66=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // RuleSet2.g:991:2: ( 'web' )? 'pageview' (spat= STRING | rpat= REGEXP ) (set= setting )?
                    {
                    root_0 = (Object)adaptor.nil();

                    // RuleSet2.g:991:2: ( 'web' )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==57) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // RuleSet2.g:0:0: 'web'
                            {
                            string_literal102=(Token)match(input,57,FOLLOW_57_in_event_prim2610); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal102_tree = (Object)adaptor.create(string_literal102);
                            adaptor.addChild(root_0, string_literal102_tree);
                            }

                            }
                            break;

                    }

                    string_literal103=(Token)match(input,58,FOLLOW_58_in_event_prim2613); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal103_tree = (Object)adaptor.create(string_literal103);
                    adaptor.addChild(root_0, string_literal103_tree);
                    }
                    // RuleSet2.g:991:20: (spat= STRING | rpat= REGEXP )
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==STRING) ) {
                        alt59=1;
                    }
                    else if ( (LA59_0==REGEXP) ) {
                        alt59=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 59, 0, input);

                        throw nvae;
                    }
                    switch (alt59) {
                        case 1 :
                            // RuleSet2.g:991:21: spat= STRING
                            {
                            spat=(Token)match(input,STRING,FOLLOW_STRING_in_event_prim2618); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            spat_tree = (Object)adaptor.create(spat);
                            adaptor.addChild(root_0, spat_tree);
                            }

                            }
                            break;
                        case 2 :
                            // RuleSet2.g:991:33: rpat= REGEXP
                            {
                            rpat=(Token)match(input,REGEXP,FOLLOW_REGEXP_in_event_prim2622); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            rpat_tree = (Object)adaptor.create(rpat);
                            adaptor.addChild(root_0, rpat_tree);
                            }

                            }
                            break;

                    }

                    // RuleSet2.g:991:49: (set= setting )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==50) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // RuleSet2.g:0:0: set= setting
                            {
                            pushFollow(FOLLOW_setting_in_event_prim2627);
                            set=setting();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, set.getTree());

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                      		HashMap tmp = new HashMap();
                      		tmp.put("domain","web");
                      		if((spat!=null?spat.getText():null) != null)
                      			tmp.put("pattern",strip_string((spat!=null?spat.getText():null)));
                      		else
                      			tmp.put("pattern",strip_string((rpat!=null?rpat.getText():null)));
                      		tmp.put("type","prim_event");
                      		if((set!=null?input.toString(set.start,set.stop):null) != null)
                      			tmp.put("vars",(set!=null?set.result:null));
                      		tmp.put("op","pageview");
                      		retval.result = tmp;			
                      	
                    }

                    }
                    break;
                case 2 :
                    // RuleSet2.g:1004:4: ( 'web' )? opt= must_be_one[sar(\"submit\",\"click\",\"dblclick\",\"change\",\"update\")] elem= STRING (on= on_expr )? (set= setting )?
                    {
                    root_0 = (Object)adaptor.nil();

                    // RuleSet2.g:1004:4: ( 'web' )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==57) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // RuleSet2.g:0:0: 'web'
                            {
                            string_literal104=(Token)match(input,57,FOLLOW_57_in_event_prim2636); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal104_tree = (Object)adaptor.create(string_literal104);
                            adaptor.addChild(root_0, string_literal104_tree);
                            }

                            }
                            break;

                    }

                    pushFollow(FOLLOW_must_be_one_in_event_prim2641);
                    opt=must_be_one(sar("submit","click","dblclick","change","update"));

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, opt.getTree());
                    elem=(Token)match(input,STRING,FOLLOW_STRING_in_event_prim2646); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    elem_tree = (Object)adaptor.create(elem);
                    adaptor.addChild(root_0, elem_tree);
                    }
                    // RuleSet2.g:1004:93: (on= on_expr )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==59) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // RuleSet2.g:0:0: on= on_expr
                            {
                            pushFollow(FOLLOW_on_expr_in_event_prim2650);
                            on=on_expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, on.getTree());

                            }
                            break;

                    }

                    // RuleSet2.g:1004:107: (set= setting )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==50) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // RuleSet2.g:0:0: set= setting
                            {
                            pushFollow(FOLLOW_setting_in_event_prim2656);
                            set=setting();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, set.getTree());

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                      		HashMap tmp = new HashMap();
                      		tmp.put("domain","web");
                      		tmp.put("element",strip_string((elem!=null?elem.getText():null)));
                      		tmp.put("type","prim_event"); 
                      		if((set!=null?input.toString(set.start,set.stop):null) != null)
                      			tmp.put("vars",(set!=null?set.result:null));
                      		tmp.put("op",(opt!=null?input.toString(opt.start,opt.stop):null));
                      		if((on!=null?input.toString(on.start,on.stop):null) != null)
                      			tmp.put("on",(on!=null?on.result:null));
                      		retval.result = tmp;			
                      	
                      	
                    }

                    }
                    break;
                case 3 :
                    // RuleSet2.g:1017:4: dom= VAR oper= VAR (filter= event_filter )* (set= setting )?
                    {
                    root_0 = (Object)adaptor.nil();

                    dom=(Token)match(input,VAR,FOLLOW_VAR_in_event_prim2666); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    dom_tree = (Object)adaptor.create(dom);
                    adaptor.addChild(root_0, dom_tree);
                    }
                    oper=(Token)match(input,VAR,FOLLOW_VAR_in_event_prim2670); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    oper_tree = (Object)adaptor.create(oper);
                    adaptor.addChild(root_0, oper_tree);
                    }
                    // RuleSet2.g:1017:21: (filter= event_filter )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==VAR) ) {
                            int LA64_2 = input.LA(2);

                            if ( ((LA64_2>=STRING && LA64_2<=REGEXP)) ) {
                                alt64=1;
                            }


                        }


                        switch (alt64) {
                    	case 1 :
                    	    // RuleSet2.g:1017:22: filter= event_filter
                    	    {
                    	    pushFollow(FOLLOW_event_filter_in_event_prim2675);
                    	    filter=event_filter();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, filter.getTree());
                    	    if ( state.backtracking==0 ) {
                    	      filters.add((filter!=null?filter.result:null));
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop64;
                        }
                    } while (true);

                    // RuleSet2.g:1017:77: (set= setting )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==50) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // RuleSet2.g:0:0: set= setting
                            {
                            pushFollow(FOLLOW_setting_in_event_prim2682);
                            set=setting();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, set.getTree());

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                      		HashMap tmp = new HashMap();
                      		tmp.put("domain",(dom!=null?dom.getText():null));
                      		tmp.put("type","prim_event");
                      		if((set!=null?input.toString(set.start,set.stop):null) != null)
                      			tmp.put("vars",(set!=null?set.result:null));
                      		tmp.put("op",(oper!=null?oper.getText():null));
                      		if(filters.size() != 0)
                      			tmp.put("filters",filters);
                      		retval.result = tmp;			
                      	
                      	
                    }

                    }
                    break;
                case 4 :
                    // RuleSet2.g:1029:4: '(' evt= event_seq ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal105=(Token)match(input,45,FOLLOW_45_in_event_prim2692); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal105_tree = (Object)adaptor.create(char_literal105);
                    adaptor.addChild(root_0, char_literal105_tree);
                    }
                    pushFollow(FOLLOW_event_seq_in_event_prim2696);
                    evt=event_seq();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, evt.getTree());
                    char_literal106=(Token)match(input,47,FOLLOW_47_in_event_prim2698); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal106_tree = (Object)adaptor.create(char_literal106);
                    adaptor.addChild(root_0, char_literal106_tree);
                    }
                    if ( state.backtracking==0 ) {

                      		retval.result =(evt!=null?evt.result:null);
                      	
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

    public static class event_filter_return extends ParserRuleReturnScope {
        public ArrayList result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "event_filter"
    // RuleSet2.g:1035:1: event_filter returns [ArrayList result] : typ= VAR (sfilt= STRING | rfilt= REGEXP ) ;
    public final RuleSet2Parser.event_filter_return event_filter() throws RecognitionException {
        RuleSet2Parser.event_filter_return retval = new RuleSet2Parser.event_filter_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token typ=null;
        Token sfilt=null;
        Token rfilt=null;

        Object typ_tree=null;
        Object sfilt_tree=null;
        Object rfilt_tree=null;

        try {
            // RuleSet2.g:1036:2: (typ= VAR (sfilt= STRING | rfilt= REGEXP ) )
            // RuleSet2.g:1036:4: typ= VAR (sfilt= STRING | rfilt= REGEXP )
            {
            root_0 = (Object)adaptor.nil();

            typ=(Token)match(input,VAR,FOLLOW_VAR_in_event_filter2719); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            typ_tree = (Object)adaptor.create(typ);
            adaptor.addChild(root_0, typ_tree);
            }
            // RuleSet2.g:1036:12: (sfilt= STRING | rfilt= REGEXP )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==STRING) ) {
                alt67=1;
            }
            else if ( (LA67_0==REGEXP) ) {
                alt67=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // RuleSet2.g:1036:13: sfilt= STRING
                    {
                    sfilt=(Token)match(input,STRING,FOLLOW_STRING_in_event_filter2724); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    sfilt_tree = (Object)adaptor.create(sfilt);
                    adaptor.addChild(root_0, sfilt_tree);
                    }

                    }
                    break;
                case 2 :
                    // RuleSet2.g:1036:28: rfilt= REGEXP
                    {
                    rfilt=(Token)match(input,REGEXP,FOLLOW_REGEXP_in_event_filter2730); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    rfilt_tree = (Object)adaptor.create(rfilt);
                    adaptor.addChild(root_0, rfilt_tree);
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		HashMap tmp = new HashMap();
              		tmp.put("type",(typ!=null?typ.getText():null));
              		if((sfilt!=null?sfilt.getText():null) != null)
              			tmp.put("pattern",strip_string((sfilt!=null?sfilt.getText():null)));
              		else
              			tmp.put("pattern",strip_string((rfilt!=null?rfilt.getText():null)));
              		ArrayList ar = new ArrayList();
              		ar.add(tmp);
              		retval.result = ar;
              	
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
        public String result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "on_expr"
    // RuleSet2.g:1049:1: on_expr returns [String result] : 'on' (s= STRING | r= REGEXP ) ;
    public final RuleSet2Parser.on_expr_return on_expr() throws RecognitionException {
        RuleSet2Parser.on_expr_return retval = new RuleSet2Parser.on_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token s=null;
        Token r=null;
        Token string_literal107=null;

        Object s_tree=null;
        Object r_tree=null;
        Object string_literal107_tree=null;

        try {
            // RuleSet2.g:1049:32: ( 'on' (s= STRING | r= REGEXP ) )
            // RuleSet2.g:1049:34: 'on' (s= STRING | r= REGEXP )
            {
            root_0 = (Object)adaptor.nil();

            string_literal107=(Token)match(input,59,FOLLOW_59_in_on_expr2749); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal107_tree = (Object)adaptor.create(string_literal107);
            adaptor.addChild(root_0, string_literal107_tree);
            }
            // RuleSet2.g:1050:2: (s= STRING | r= REGEXP )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==STRING) ) {
                alt68=1;
            }
            else if ( (LA68_0==REGEXP) ) {
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
                    // RuleSet2.g:1050:5: s= STRING
                    {
                    s=(Token)match(input,STRING,FOLLOW_STRING_in_on_expr2758); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    s_tree = (Object)adaptor.create(s);
                    adaptor.addChild(root_0, s_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.result = strip_string((s!=null?s.getText():null));
                    }

                    }
                    break;
                case 2 :
                    // RuleSet2.g:1051:5: r= REGEXP
                    {
                    r=(Token)match(input,REGEXP,FOLLOW_REGEXP_in_on_expr2769); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    r_tree = (Object)adaptor.create(r);
                    adaptor.addChild(root_0, r_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.result = strip_string((r!=null?r.getText():null));
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
    // $ANTLR end "on_expr"

    public static class global_block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "global_block"
    // RuleSet2.g:1101:1: global_block : 'global' '{' (emt= emit_block | dst= must_be_one[sar(\"dataset\",\"datasource\")] name= VAR ( ':' dtype= ( 'JSON' | 'XML' | 'RSS' | 'HTML' ) )? '<-' src= STRING (cas= cachable )? | cemt= css_emit | decl[global_block_array] | ';' )* '}' ;
    public final RuleSet2Parser.global_block_return global_block() throws RecognitionException {
        RuleSet2Parser.global_block_return retval = new RuleSet2Parser.global_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token name=null;
        Token dtype=null;
        Token src=null;
        Token string_literal108=null;
        Token char_literal109=null;
        Token char_literal110=null;
        Token string_literal111=null;
        Token char_literal113=null;
        Token char_literal114=null;
        RuleSet2Parser.emit_block_return emt = null;

        RuleSet2Parser.must_be_one_return dst = null;

        RuleSet2Parser.cachable_return cas = null;

        RuleSet2Parser.css_emit_return cemt = null;

        RuleSet2Parser.decl_return decl112 = null;


        Object name_tree=null;
        Object dtype_tree=null;
        Object src_tree=null;
        Object string_literal108_tree=null;
        Object char_literal109_tree=null;
        Object char_literal110_tree=null;
        Object string_literal111_tree=null;
        Object char_literal113_tree=null;
        Object char_literal114_tree=null;


        	 ArrayList global_block_array = (ArrayList)rule_json.get("global");
        	 boolean found_cache = false;

        try {
            // RuleSet2.g:1108:2: ( 'global' '{' (emt= emit_block | dst= must_be_one[sar(\"dataset\",\"datasource\")] name= VAR ( ':' dtype= ( 'JSON' | 'XML' | 'RSS' | 'HTML' ) )? '<-' src= STRING (cas= cachable )? | cemt= css_emit | decl[global_block_array] | ';' )* '}' )
            // RuleSet2.g:1108:4: 'global' '{' (emt= emit_block | dst= must_be_one[sar(\"dataset\",\"datasource\")] name= VAR ( ':' dtype= ( 'JSON' | 'XML' | 'RSS' | 'HTML' ) )? '<-' src= STRING (cas= cachable )? | cemt= css_emit | decl[global_block_array] | ';' )* '}'
            {
            root_0 = (Object)adaptor.nil();

            string_literal108=(Token)match(input,60,FOLLOW_60_in_global_block2854); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal108_tree = (Object)adaptor.create(string_literal108);
            adaptor.addChild(root_0, string_literal108_tree);
            }
            char_literal109=(Token)match(input,29,FOLLOW_29_in_global_block2856); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal109_tree = (Object)adaptor.create(char_literal109);
            adaptor.addChild(root_0, char_literal109_tree);
            }
            // RuleSet2.g:1109:2: (emt= emit_block | dst= must_be_one[sar(\"dataset\",\"datasource\")] name= VAR ( ':' dtype= ( 'JSON' | 'XML' | 'RSS' | 'HTML' ) )? '<-' src= STRING (cas= cachable )? | cemt= css_emit | decl[global_block_array] | ';' )*
            loop71:
            do {
                int alt71=6;
                switch ( input.LA(1) ) {
                case 107:
                    {
                    alt71=1;
                    }
                    break;
                case VAR:
                    {
                    int LA71_3 = input.LA(2);

                    if ( (LA71_3==36) ) {
                        alt71=4;
                    }
                    else if ( (LA71_3==VAR) ) {
                        alt71=2;
                    }


                    }
                    break;
                case 105:
                    {
                    alt71=3;
                    }
                    break;
                case 31:
                    {
                    alt71=5;
                    }
                    break;

                }

                switch (alt71) {
            	case 1 :
            	    // RuleSet2.g:1109:4: emt= emit_block
            	    {
            	    pushFollow(FOLLOW_emit_block_in_global_block2864);
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
            	    // RuleSet2.g:1114:4: dst= must_be_one[sar(\"dataset\",\"datasource\")] name= VAR ( ':' dtype= ( 'JSON' | 'XML' | 'RSS' | 'HTML' ) )? '<-' src= STRING (cas= cachable )?
            	    {
            	    pushFollow(FOLLOW_must_be_one_in_global_block2874);
            	    dst=must_be_one(sar("dataset","datasource"));

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, dst.getTree());
            	    name=(Token)match(input,VAR,FOLLOW_VAR_in_global_block2879); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    name_tree = (Object)adaptor.create(name);
            	    adaptor.addChild(root_0, name_tree);
            	    }
            	    // RuleSet2.g:1114:58: ( ':' dtype= ( 'JSON' | 'XML' | 'RSS' | 'HTML' ) )?
            	    int alt69=2;
            	    int LA69_0 = input.LA(1);

            	    if ( (LA69_0==37) ) {
            	        alt69=1;
            	    }
            	    switch (alt69) {
            	        case 1 :
            	            // RuleSet2.g:1114:59: ':' dtype= ( 'JSON' | 'XML' | 'RSS' | 'HTML' )
            	            {
            	            char_literal110=(Token)match(input,37,FOLLOW_37_in_global_block2882); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal110_tree = (Object)adaptor.create(char_literal110);
            	            adaptor.addChild(root_0, char_literal110_tree);
            	            }
            	            dtype=(Token)input.LT(1);
            	            if ( (input.LA(1)>=61 && input.LA(1)<=64) ) {
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

            	    string_literal111=(Token)match(input,65,FOLLOW_65_in_global_block2898); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal111_tree = (Object)adaptor.create(string_literal111);
            	    adaptor.addChild(root_0, string_literal111_tree);
            	    }
            	    src=(Token)match(input,STRING,FOLLOW_STRING_in_global_block2902); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    src_tree = (Object)adaptor.create(src);
            	    adaptor.addChild(root_0, src_tree);
            	    }
            	    // RuleSet2.g:1114:115: (cas= cachable )?
            	    int alt70=2;
            	    int LA70_0 = input.LA(1);

            	    if ( (LA70_0==106) ) {
            	        alt70=1;
            	    }
            	    switch (alt70) {
            	        case 1 :
            	            // RuleSet2.g:1114:116: cas= cachable
            	            {
            	            pushFollow(FOLLOW_cachable_in_global_block2907);
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
            	      		tmp.put("type",(dst!=null?input.toString(dst.start,dst.stop):null));	
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
            	      			else if((cas!=null?cas.what:null) instanceof Long)
            	      			{
            	      				tmp.put("cachable",((Long)(cas!=null?cas.what:null)).longValue());
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
            	    // RuleSet2.g:1148:4: cemt= css_emit
            	    {
            	    pushFollow(FOLLOW_css_emit_in_global_block2922);
            	    cemt=css_emit();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, cemt.getTree());
            	    if ( state.backtracking==0 ) {

            	      		HashMap tmp = new HashMap(); 
            	      		tmp.put("content",(cemt!=null?cemt.emit_value:null));
            	      		tmp.put("type","css");
            	      		global_block_array.add(tmp);
            	      	
            	    }

            	    }
            	    break;
            	case 4 :
            	    // RuleSet2.g:1154:4: decl[global_block_array]
            	    {
            	    pushFollow(FOLLOW_decl_in_global_block2930);
            	    decl112=decl(global_block_array);

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, decl112.getTree());

            	    }
            	    break;
            	case 5 :
            	    // RuleSet2.g:1155:4: ';'
            	    {
            	    char_literal113=(Token)match(input,31,FOLLOW_31_in_global_block2936); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal113_tree = (Object)adaptor.create(char_literal113);
            	    adaptor.addChild(root_0, char_literal113_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop71;
                }
            } while (true);

            char_literal114=(Token)match(input,30,FOLLOW_30_in_global_block2941); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal114_tree = (Object)adaptor.create(char_literal114);
            adaptor.addChild(root_0, char_literal114_tree);
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
    // RuleSet2.g:1162:1: decl[ArrayList block_array] : (var= VAR '=' val= HTML | var= VAR '=' val= JS | var= VAR '=' e= expr );
    public final RuleSet2Parser.decl_return decl(ArrayList  block_array) throws RecognitionException {
        RuleSet2Parser.decl_return retval = new RuleSet2Parser.decl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token var=null;
        Token val=null;
        Token char_literal115=null;
        Token char_literal116=null;
        Token char_literal117=null;
        RuleSet2Parser.expr_return e = null;


        Object var_tree=null;
        Object val_tree=null;
        Object char_literal115_tree=null;
        Object char_literal116_tree=null;
        Object char_literal117_tree=null;



        try {
            // RuleSet2.g:1165:2: (var= VAR '=' val= HTML | var= VAR '=' val= JS | var= VAR '=' e= expr )
            int alt72=3;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==VAR) ) {
                int LA72_1 = input.LA(2);

                if ( (LA72_1==36) ) {
                    switch ( input.LA(3) ) {
                    case HTML:
                        {
                        alt72=1;
                        }
                        break;
                    case JS:
                        {
                        alt72=2;
                        }
                        break;
                    case VAR:
                    case INT:
                    case FLOAT:
                    case STRING:
                    case REGEXP:
                    case 29:
                    case 45:
                    case 55:
                    case 66:
                    case 73:
                    case 96:
                    case 97:
                    case 98:
                    case 100:
                    case 101:
                    case 102:
                    case 103:
                        {
                        alt72=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 72, 2, input);

                        throw nvae;
                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 72, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // RuleSet2.g:1166:2: var= VAR '=' val= HTML
                    {
                    root_0 = (Object)adaptor.nil();

                    var=(Token)match(input,VAR,FOLLOW_VAR_in_decl2968); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    var_tree = (Object)adaptor.create(var);
                    adaptor.addChild(root_0, var_tree);
                    }
                    char_literal115=(Token)match(input,36,FOLLOW_36_in_decl2970); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal115_tree = (Object)adaptor.create(char_literal115);
                    adaptor.addChild(root_0, char_literal115_tree);
                    }
                    val=(Token)match(input,HTML,FOLLOW_HTML_in_decl2974); if (state.failed) return retval;
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
                    // RuleSet2.g:1173:4: var= VAR '=' val= JS
                    {
                    root_0 = (Object)adaptor.nil();

                    var=(Token)match(input,VAR,FOLLOW_VAR_in_decl2984); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    var_tree = (Object)adaptor.create(var);
                    adaptor.addChild(root_0, var_tree);
                    }
                    char_literal116=(Token)match(input,36,FOLLOW_36_in_decl2986); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal116_tree = (Object)adaptor.create(char_literal116);
                    adaptor.addChild(root_0, char_literal116_tree);
                    }
                    val=(Token)match(input,JS,FOLLOW_JS_in_decl2990); if (state.failed) return retval;
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
                    // RuleSet2.g:1180:4: var= VAR '=' e= expr
                    {
                    root_0 = (Object)adaptor.nil();

                    var=(Token)match(input,VAR,FOLLOW_VAR_in_decl3000); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    var_tree = (Object)adaptor.create(var);
                    adaptor.addChild(root_0, var_tree);
                    }
                    char_literal117=(Token)match(input,36,FOLLOW_36_in_decl3002); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal117_tree = (Object)adaptor.create(char_literal117);
                    adaptor.addChild(root_0, char_literal117_tree);
                    }
                    pushFollow(FOLLOW_expr_in_decl3006);
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
    // RuleSet2.g:1192:1: expr returns [Object result] : (fd= function_def | c= conditional_expression );
    public final RuleSet2Parser.expr_return expr() throws RecognitionException {
        RuleSet2Parser.expr_return retval = new RuleSet2Parser.expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RuleSet2Parser.function_def_return fd = null;

        RuleSet2Parser.conditional_expression_return c = null;




        	HashMap result_hash = new HashMap();

        try {
            // RuleSet2.g:1196:2: (fd= function_def | c= conditional_expression )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==66) ) {
                alt73=1;
            }
            else if ( ((LA73_0>=VAR && LA73_0<=INT)||LA73_0==FLOAT||(LA73_0>=STRING && LA73_0<=REGEXP)||LA73_0==29||LA73_0==45||LA73_0==55||LA73_0==73||(LA73_0>=96 && LA73_0<=98)||(LA73_0>=100 && LA73_0<=103)) ) {
                alt73=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // RuleSet2.g:1196:4: fd= function_def
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_function_def_in_expr3033);
                    fd=function_def();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fd.getTree());
                    if ( state.backtracking==0 ) {

                      		retval.result = (fd!=null?fd.result:null);
                      	
                    }

                    }
                    break;
                case 2 :
                    // RuleSet2.g:1199:4: c= conditional_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_conditional_expression_in_expr3042);
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
        public Object result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function_def"
    // RuleSet2.g:1204:1: function_def returns [Object result] : 'function' '(' (args+= VAR )? ( ',' args+= VAR )* ')' '{' (decs+= decl[block_array] )? ( ';' decs+= decl[block_array] )* ( ';' )? e1= expr '}' ;
    public final RuleSet2Parser.function_def_return function_def() throws RecognitionException {
        RuleSet2Parser.function_def_return retval = new RuleSet2Parser.function_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal118=null;
        Token char_literal119=null;
        Token char_literal120=null;
        Token char_literal121=null;
        Token char_literal122=null;
        Token char_literal123=null;
        Token char_literal124=null;
        Token char_literal125=null;
        Token args=null;
        List list_args=null;
        List list_decs=null;
        RuleSet2Parser.expr_return e1 = null;

        RuleReturnScope decs = null;
        Object string_literal118_tree=null;
        Object char_literal119_tree=null;
        Object char_literal120_tree=null;
        Object char_literal121_tree=null;
        Object char_literal122_tree=null;
        Object char_literal123_tree=null;
        Object char_literal124_tree=null;
        Object char_literal125_tree=null;
        Object args_tree=null;


        	ArrayList block_array = new ArrayList();

        try {
            // RuleSet2.g:1208:2: ( 'function' '(' (args+= VAR )? ( ',' args+= VAR )* ')' '{' (decs+= decl[block_array] )? ( ';' decs+= decl[block_array] )* ( ';' )? e1= expr '}' )
            // RuleSet2.g:1208:4: 'function' '(' (args+= VAR )? ( ',' args+= VAR )* ')' '{' (decs+= decl[block_array] )? ( ';' decs+= decl[block_array] )* ( ';' )? e1= expr '}'
            {
            root_0 = (Object)adaptor.nil();

            string_literal118=(Token)match(input,66,FOLLOW_66_in_function_def3065); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal118_tree = (Object)adaptor.create(string_literal118);
            adaptor.addChild(root_0, string_literal118_tree);
            }
            char_literal119=(Token)match(input,45,FOLLOW_45_in_function_def3067); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal119_tree = (Object)adaptor.create(char_literal119);
            adaptor.addChild(root_0, char_literal119_tree);
            }
            // RuleSet2.g:1208:23: (args+= VAR )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==VAR) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // RuleSet2.g:0:0: args+= VAR
                    {
                    args=(Token)match(input,VAR,FOLLOW_VAR_in_function_def3071); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    args_tree = (Object)adaptor.create(args);
                    adaptor.addChild(root_0, args_tree);
                    }
                    if (list_args==null) list_args=new ArrayList();
                    list_args.add(args);


                    }
                    break;

            }

            // RuleSet2.g:1208:30: ( ',' args+= VAR )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==46) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // RuleSet2.g:1208:31: ',' args+= VAR
            	    {
            	    char_literal120=(Token)match(input,46,FOLLOW_46_in_function_def3075); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal120_tree = (Object)adaptor.create(char_literal120);
            	    adaptor.addChild(root_0, char_literal120_tree);
            	    }
            	    args=(Token)match(input,VAR,FOLLOW_VAR_in_function_def3079); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    args_tree = (Object)adaptor.create(args);
            	    adaptor.addChild(root_0, args_tree);
            	    }
            	    if (list_args==null) list_args=new ArrayList();
            	    list_args.add(args);


            	    }
            	    break;

            	default :
            	    break loop75;
                }
            } while (true);

            char_literal121=(Token)match(input,47,FOLLOW_47_in_function_def3084); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal121_tree = (Object)adaptor.create(char_literal121);
            adaptor.addChild(root_0, char_literal121_tree);
            }
            char_literal122=(Token)match(input,29,FOLLOW_29_in_function_def3086); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal122_tree = (Object)adaptor.create(char_literal122);
            adaptor.addChild(root_0, char_literal122_tree);
            }
            // RuleSet2.g:1208:60: (decs+= decl[block_array] )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==VAR) ) {
                int LA76_1 = input.LA(2);

                if ( (LA76_1==36) ) {
                    alt76=1;
                }
            }
            switch (alt76) {
                case 1 :
                    // RuleSet2.g:0:0: decs+= decl[block_array]
                    {
                    pushFollow(FOLLOW_decl_in_function_def3090);
                    decs=decl(block_array);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, decs.getTree());
                    if (list_decs==null) list_decs=new ArrayList();
                    list_decs.add(decs.getTree());


                    }
                    break;

            }

            // RuleSet2.g:1208:81: ( ';' decs+= decl[block_array] )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==31) ) {
                    int LA77_1 = input.LA(2);

                    if ( (LA77_1==VAR) ) {
                        int LA77_3 = input.LA(3);

                        if ( (LA77_3==36) ) {
                            alt77=1;
                        }


                    }


                }


                switch (alt77) {
            	case 1 :
            	    // RuleSet2.g:1208:82: ';' decs+= decl[block_array]
            	    {
            	    char_literal123=(Token)match(input,31,FOLLOW_31_in_function_def3095); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal123_tree = (Object)adaptor.create(char_literal123);
            	    adaptor.addChild(root_0, char_literal123_tree);
            	    }
            	    pushFollow(FOLLOW_decl_in_function_def3099);
            	    decs=decl(block_array);

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, decs.getTree());
            	    if (list_decs==null) list_decs=new ArrayList();
            	    list_decs.add(decs.getTree());


            	    }
            	    break;

            	default :
            	    break loop77;
                }
            } while (true);

            // RuleSet2.g:1208:112: ( ';' )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==31) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // RuleSet2.g:0:0: ';'
                    {
                    char_literal124=(Token)match(input,31,FOLLOW_31_in_function_def3104); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal124_tree = (Object)adaptor.create(char_literal124);
                    adaptor.addChild(root_0, char_literal124_tree);
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_expr_in_function_def3109);
            e1=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, e1.getTree());
            char_literal125=(Token)match(input,30,FOLLOW_30_in_function_def3111); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal125_tree = (Object)adaptor.create(char_literal125);
            adaptor.addChild(root_0, char_literal125_tree);
            }
            if ( state.backtracking==0 ) {

              		HashMap tmp = new HashMap();
              		ArrayList nargs = new ArrayList();
              		if(list_args != null)
              		{
              			for(int i = 0;i< list_args.size();i++)
              			{
              				nargs.add(((Token)list_args.get(i)).getText());
              			}
              		}
              		tmp.put("vars",nargs);
              		tmp.put("type","function");
              		if(block_array.size() != 0)
              			tmp.put("decls",block_array); 
              		if((e1!=null?input.toString(e1.start,e1.stop):null) != null)
              			tmp.put("expr",(e1!=null?e1.result:null));	
              				
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
    // $ANTLR end "function_def"

    public static class conditional_expression_return extends ParserRuleReturnScope {
        public Object result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditional_expression"
    // RuleSet2.g:1230:1: conditional_expression returns [Object result] : d= disjunction ( '=>' e1= expr '|' e2= expr )? ;
    public final RuleSet2Parser.conditional_expression_return conditional_expression() throws RecognitionException {
        RuleSet2Parser.conditional_expression_return retval = new RuleSet2Parser.conditional_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal126=null;
        Token char_literal127=null;
        RuleSet2Parser.disjunction_return d = null;

        RuleSet2Parser.expr_return e1 = null;

        RuleSet2Parser.expr_return e2 = null;


        Object string_literal126_tree=null;
        Object char_literal127_tree=null;


        	ArrayList tmp_list = new ArrayList();

        try {
            // RuleSet2.g:1234:2: (d= disjunction ( '=>' e1= expr '|' e2= expr )? )
            // RuleSet2.g:1234:5: d= disjunction ( '=>' e1= expr '|' e2= expr )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_disjunction_in_conditional_expression3138);
            d=disjunction();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, d.getTree());
            // RuleSet2.g:1234:19: ( '=>' e1= expr '|' e2= expr )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==44) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // RuleSet2.g:1234:20: '=>' e1= expr '|' e2= expr
                    {
                    string_literal126=(Token)match(input,44,FOLLOW_44_in_conditional_expression3141); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal126_tree = (Object)adaptor.create(string_literal126);
                    adaptor.addChild(root_0, string_literal126_tree);
                    }
                    pushFollow(FOLLOW_expr_in_conditional_expression3145);
                    e1=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, e1.getTree());
                    char_literal127=(Token)match(input,67,FOLLOW_67_in_conditional_expression3147); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal127_tree = (Object)adaptor.create(char_literal127);
                    adaptor.addChild(root_0, char_literal127_tree);
                    }
                    pushFollow(FOLLOW_expr_in_conditional_expression3151);
                    e2=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, e2.getTree());

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               
              	   	if((e1!=null?input.toString(e1.start,e1.stop):null) == null)
              	   	{
              		   	retval.result = (d!=null?d.result:null); 
              		}
              		else
              		{
              			
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
    // $ANTLR end "conditional_expression"

    public static class disjunction_return extends ParserRuleReturnScope {
        public Object result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "disjunction"
    // RuleSet2.g:1249:1: disjunction returns [Object result] : me1= conjunction (op= '||' me2= conjunction )* ;
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
            // RuleSet2.g:1254:2: (me1= conjunction (op= '||' me2= conjunction )* )
            // RuleSet2.g:1254:4: me1= conjunction (op= '||' me2= conjunction )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_conjunction_in_disjunction3184);
            me1=conjunction();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, me1.getTree());
            // RuleSet2.g:1254:20: (op= '||' me2= conjunction )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==68) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // RuleSet2.g:1254:21: op= '||' me2= conjunction
            	    {
            	    op=(Token)match(input,68,FOLLOW_68_in_disjunction3189); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    adaptor.addChild(root_0, op_tree);
            	    }
            	    pushFollow(FOLLOW_conjunction_in_disjunction3193);
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
            	    break loop80;
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
    // RuleSet2.g:1272:1: conjunction returns [Object result] : me1= equality_expr (op= '&&' me2= equality_expr )* ;
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
            // RuleSet2.g:1277:2: (me1= equality_expr (op= '&&' me2= equality_expr )* )
            // RuleSet2.g:1277:4: me1= equality_expr (op= '&&' me2= equality_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equality_expr_in_conjunction3223);
            me1=equality_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, me1.getTree());
            // RuleSet2.g:1277:22: (op= '&&' me2= equality_expr )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==69) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // RuleSet2.g:1277:23: op= '&&' me2= equality_expr
            	    {
            	    op=(Token)match(input,69,FOLLOW_69_in_conjunction3228); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    adaptor.addChild(root_0, op_tree);
            	    }
            	    pushFollow(FOLLOW_equality_expr_in_conjunction3232);
            	    me2=equality_expr();

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
            	    break loop81;
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
    // RuleSet2.g:1295:1: equality_expr returns [Object result] : me1= add_expr (op= predop me2= add_expr )* ;
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
            // RuleSet2.g:1300:2: (me1= add_expr (op= predop me2= add_expr )* )
            // RuleSet2.g:1300:4: me1= add_expr (op= predop me2= add_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_add_expr_in_equality_expr3263);
            me1=add_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, me1.getTree());
            // RuleSet2.g:1300:17: (op= predop me2= add_expr )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( ((LA82_0>=18 && LA82_0<=26)) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // RuleSet2.g:1300:18: op= predop me2= add_expr
            	    {
            	    pushFollow(FOLLOW_predop_in_equality_expr3268);
            	    op=predop();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, op.getTree());
            	    pushFollow(FOLLOW_add_expr_in_equality_expr3272);
            	    me2=add_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, me2.getTree());
            	    if ( state.backtracking==0 ) {

            	      		found_op = true;
            	      		if(result.isEmpty())
            	      		{
            	      			 add_to_expression(result,"ineq",(op!=null?input.toString(op.start,op.stop):null),(me1!=null?me1.result:null));
            	      			 add_to_expression(result,"ineq",(op!=null?input.toString(op.start,op.stop):null),(me2!=null?me2.result:null));
            	      		}
            	      		else
            	      			 add_to_expression(result,"ineq",(op!=null?input.toString(op.start,op.stop):null),(me2!=null?me2.result:null));
            	      	
            	    }

            	    }
            	    break;

            	default :
            	    break loop82;
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
    // RuleSet2.g:1318:1: add_expr returns [Object result] : me1= mult_expr (op= add_op me2= mult_expr )* ;
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
            // RuleSet2.g:1323:2: (me1= mult_expr (op= add_op me2= mult_expr )* )
            // RuleSet2.g:1323:4: me1= mult_expr (op= add_op me2= mult_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_mult_expr_in_add_expr3306);
            me1=mult_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, me1.getTree());
            // RuleSet2.g:1323:18: (op= add_op me2= mult_expr )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( ((LA83_0>=27 && LA83_0<=28)) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // RuleSet2.g:1323:19: op= add_op me2= mult_expr
            	    {
            	    pushFollow(FOLLOW_add_op_in_add_expr3311);
            	    op=add_op();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, op.getTree());
            	    pushFollow(FOLLOW_mult_expr_in_add_expr3315);
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
            	    break loop83;
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
    // RuleSet2.g:1342:1: mult_op : ( '*' | '/' | '%' );
    public final RuleSet2Parser.mult_op_return mult_op() throws RecognitionException {
        RuleSet2Parser.mult_op_return retval = new RuleSet2Parser.mult_op_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set128=null;

        Object set128_tree=null;

        try {
            // RuleSet2.g:1342:8: ( '*' | '/' | '%' )
            // RuleSet2.g:
            {
            root_0 = (Object)adaptor.nil();

            set128=(Token)input.LT(1);
            if ( (input.LA(1)>=70 && input.LA(1)<=72) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set128));
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
    // RuleSet2.g:1344:1: mult_expr returns [Object result] : me1= unary_expr (op= mult_op me2= unary_expr )* ;
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
            // RuleSet2.g:1349:2: (me1= unary_expr (op= mult_op me2= unary_expr )* )
            // RuleSet2.g:1349:4: me1= unary_expr (op= mult_op me2= unary_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_unary_expr_in_mult_expr3363);
            me1=unary_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, me1.getTree());
            // RuleSet2.g:1349:19: (op= mult_op me2= unary_expr )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( ((LA84_0>=70 && LA84_0<=72)) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // RuleSet2.g:1349:20: op= mult_op me2= unary_expr
            	    {
            	    pushFollow(FOLLOW_mult_op_in_mult_expr3368);
            	    op=mult_op();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, op.getTree());
            	    pushFollow(FOLLOW_unary_expr_in_mult_expr3372);
            	    me2=unary_expr();

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
            	      		{
            	      			 add_to_expression(result,"prim",(op!=null?input.toString(op.start,op.stop):null),(me2!=null?me2.result:null));
            	      		}
            	      			 
            	      	
            	    }

            	    }
            	    break;

            	default :
            	    break loop84;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               
              		if(found_op)
              		{
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
    // RuleSet2.g:1373:1: unary_expr returns [Object result] options {backtrack=true; } : ( 'not' unary_expr | 'seen' rx= STRING must_be[\"in\"] vd= var_domain ':' v= VAR (t= timeframe )? | 'seen' rx_1= STRING op= must_be_one[sar(\"before\",\"after\")] rx_2= STRING must_be[\"in\"] vd= var_domain ':' v= VAR | vd= var_domain ':' v= VAR pop= predop e= expr t= timeframe | vd= var_domain ':' v= VAR t= timeframe | oe= operator_expr );
    public final RuleSet2Parser.unary_expr_return unary_expr() throws RecognitionException {
        RuleSet2Parser.unary_expr_return retval = new RuleSet2Parser.unary_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token rx=null;
        Token v=null;
        Token rx_1=null;
        Token rx_2=null;
        Token string_literal129=null;
        Token string_literal131=null;
        Token char_literal133=null;
        Token string_literal134=null;
        Token char_literal136=null;
        Token char_literal137=null;
        Token char_literal138=null;
        RuleSet2Parser.var_domain_return vd = null;

        RuleSet2Parser.timeframe_return t = null;

        RuleSet2Parser.must_be_one_return op = null;

        RuleSet2Parser.predop_return pop = null;

        RuleSet2Parser.expr_return e = null;

        RuleSet2Parser.operator_expr_return oe = null;

        RuleSet2Parser.unary_expr_return unary_expr130 = null;

        RuleSet2Parser.must_be_return must_be132 = null;

        RuleSet2Parser.must_be_return must_be135 = null;


        Object rx_tree=null;
        Object v_tree=null;
        Object rx_1_tree=null;
        Object rx_2_tree=null;
        Object string_literal129_tree=null;
        Object string_literal131_tree=null;
        Object char_literal133_tree=null;
        Object string_literal134_tree=null;
        Object char_literal136_tree=null;
        Object char_literal137_tree=null;
        Object char_literal138_tree=null;




        try {
            // RuleSet2.g:1377:2: ( 'not' unary_expr | 'seen' rx= STRING must_be[\"in\"] vd= var_domain ':' v= VAR (t= timeframe )? | 'seen' rx_1= STRING op= must_be_one[sar(\"before\",\"after\")] rx_2= STRING must_be[\"in\"] vd= var_domain ':' v= VAR | vd= var_domain ':' v= VAR pop= predop e= expr t= timeframe | vd= var_domain ':' v= VAR t= timeframe | oe= operator_expr )
            int alt86=6;
            alt86 = dfa86.predict(input);
            switch (alt86) {
                case 1 :
                    // RuleSet2.g:1377:4: 'not' unary_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal129=(Token)match(input,55,FOLLOW_55_in_unary_expr3412); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal129_tree = (Object)adaptor.create(string_literal129);
                    adaptor.addChild(root_0, string_literal129_tree);
                    }
                    pushFollow(FOLLOW_unary_expr_in_unary_expr3414);
                    unary_expr130=unary_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expr130.getTree());

                    }
                    break;
                case 2 :
                    // RuleSet2.g:1378:4: 'seen' rx= STRING must_be[\"in\"] vd= var_domain ':' v= VAR (t= timeframe )?
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal131=(Token)match(input,73,FOLLOW_73_in_unary_expr3421); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal131_tree = (Object)adaptor.create(string_literal131);
                    adaptor.addChild(root_0, string_literal131_tree);
                    }
                    rx=(Token)match(input,STRING,FOLLOW_STRING_in_unary_expr3425); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    rx_tree = (Object)adaptor.create(rx);
                    adaptor.addChild(root_0, rx_tree);
                    }
                    pushFollow(FOLLOW_must_be_in_unary_expr3427);
                    must_be132=must_be("in");

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, must_be132.getTree());
                    pushFollow(FOLLOW_var_domain_in_unary_expr3432);
                    vd=var_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vd.getTree());
                    char_literal133=(Token)match(input,37,FOLLOW_37_in_unary_expr3434); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal133_tree = (Object)adaptor.create(char_literal133);
                    adaptor.addChild(root_0, char_literal133_tree);
                    }
                    v=(Token)match(input,VAR,FOLLOW_VAR_in_unary_expr3438); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    v_tree = (Object)adaptor.create(v);
                    adaptor.addChild(root_0, v_tree);
                    }
                    // RuleSet2.g:1378:60: (t= timeframe )?
                    int alt85=2;
                    alt85 = dfa85.predict(input);
                    switch (alt85) {
                        case 1 :
                            // RuleSet2.g:0:0: t= timeframe
                            {
                            pushFollow(FOLLOW_timeframe_in_unary_expr3442);
                            t=timeframe();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, t.getTree());

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                            	      	HashMap tmp = new HashMap();
                      	      	tmp.put("within",(t!=null?t.result:null));
                      	      	tmp.put("type","seen_timeframe");
                      	      	tmp.put("var",(v!=null?v.getText():null));
                      	      	tmp.put("regexp",strip_string((rx!=null?rx.getText():null)));
                      	      	tmp.put("domain",(vd!=null?input.toString(vd.start,vd.stop):null));
                      	      	if((t!=null?input.toString(t.start,t.stop):null) != null)
                      		      	tmp.put("timeframe",t.time);
                      	      	retval.result = tmp;		
                      	
                    }

                    }
                    break;
                case 3 :
                    // RuleSet2.g:1389:4: 'seen' rx_1= STRING op= must_be_one[sar(\"before\",\"after\")] rx_2= STRING must_be[\"in\"] vd= var_domain ':' v= VAR
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal134=(Token)match(input,73,FOLLOW_73_in_unary_expr3450); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal134_tree = (Object)adaptor.create(string_literal134);
                    adaptor.addChild(root_0, string_literal134_tree);
                    }
                    rx_1=(Token)match(input,STRING,FOLLOW_STRING_in_unary_expr3454); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    rx_1_tree = (Object)adaptor.create(rx_1);
                    adaptor.addChild(root_0, rx_1_tree);
                    }
                    pushFollow(FOLLOW_must_be_one_in_unary_expr3458);
                    op=must_be_one(sar("before","after"));

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, op.getTree());
                    rx_2=(Token)match(input,STRING,FOLLOW_STRING_in_unary_expr3463); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    rx_2_tree = (Object)adaptor.create(rx_2);
                    adaptor.addChild(root_0, rx_2_tree);
                    }
                    pushFollow(FOLLOW_must_be_in_unary_expr3466);
                    must_be135=must_be("in");

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, must_be135.getTree());
                    pushFollow(FOLLOW_var_domain_in_unary_expr3471);
                    vd=var_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vd.getTree());
                    char_literal136=(Token)match(input,37,FOLLOW_37_in_unary_expr3473); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal136_tree = (Object)adaptor.create(char_literal136);
                    adaptor.addChild(root_0, char_literal136_tree);
                    }
                    v=(Token)match(input,VAR,FOLLOW_VAR_in_unary_expr3477); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    v_tree = (Object)adaptor.create(v);
                    adaptor.addChild(root_0, v_tree);
                    }
                    if ( state.backtracking==0 ) {

                            	      	HashMap tmp = new HashMap();
                      	      	tmp.put("type","seen_compare");
                      	      	tmp.put("domain",(vd!=null?input.toString(vd.start,vd.stop):null));
                      	      	tmp.put("regexp_1",strip_string((rx_1!=null?rx_1.getText():null)));
                      	      	tmp.put("regexp_2",strip_string((rx_2!=null?rx_2.getText():null)));	      	
                      	      	tmp.put("var",(v!=null?v.getText():null));
                      	      	tmp.put("op",(op!=null?input.toString(op.start,op.stop):null));
                      	      	retval.result = tmp;		
                      	
                    }

                    }
                    break;
                case 4 :
                    // RuleSet2.g:1399:4: vd= var_domain ':' v= VAR pop= predop e= expr t= timeframe
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_var_domain_in_unary_expr3486);
                    vd=var_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vd.getTree());
                    char_literal137=(Token)match(input,37,FOLLOW_37_in_unary_expr3488); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal137_tree = (Object)adaptor.create(char_literal137);
                    adaptor.addChild(root_0, char_literal137_tree);
                    }
                    v=(Token)match(input,VAR,FOLLOW_VAR_in_unary_expr3492); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    v_tree = (Object)adaptor.create(v);
                    adaptor.addChild(root_0, v_tree);
                    }
                    pushFollow(FOLLOW_predop_in_unary_expr3496);
                    pop=predop();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pop.getTree());
                    pushFollow(FOLLOW_expr_in_unary_expr3500);
                    e=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
                    pushFollow(FOLLOW_timeframe_in_unary_expr3504);
                    t=timeframe();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, t.getTree());
                    if ( state.backtracking==0 ) {

                            	      	HashMap tmp = new HashMap();
                      	      	tmp.put("within",(t!=null?t.result:null));
                      	      	tmp.put("timeframe",t.time);
                      	      	tmp.put("type","persistent_ineq");
                      	      	tmp.put("domain",(vd!=null?input.toString(vd.start,vd.stop):null));
                      	      	tmp.put("expr",(e!=null?e.result:null));
                      	      	tmp.put("var",(v!=null?v.getText():null));
                      	      	tmp.put("ineq",(pop!=null?input.toString(pop.start,pop.stop):null));
                      	      	retval.result = tmp;		
                      	
                      	
                    }

                    }
                    break;
                case 5 :
                    // RuleSet2.g:1411:4: vd= var_domain ':' v= VAR t= timeframe
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_var_domain_in_unary_expr3514);
                    vd=var_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vd.getTree());
                    char_literal138=(Token)match(input,37,FOLLOW_37_in_unary_expr3516); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal138_tree = (Object)adaptor.create(char_literal138);
                    adaptor.addChild(root_0, char_literal138_tree);
                    }
                    v=(Token)match(input,VAR,FOLLOW_VAR_in_unary_expr3520); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    v_tree = (Object)adaptor.create(v);
                    adaptor.addChild(root_0, v_tree);
                    }
                    pushFollow(FOLLOW_timeframe_in_unary_expr3524);
                    t=timeframe();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, t.getTree());
                    if ( state.backtracking==0 ) {

                            	      	HashMap tmp = new HashMap();
                      	      	tmp.put("within",(t!=null?t.result:null));
                      	      	tmp.put("timeframe",t.time);
                      	      	tmp.put("type","persistent_ineq");
                      	      	tmp.put("domain",(vd!=null?input.toString(vd.start,vd.stop):null));
                      	      	tmp.put("ineq","==");
                      	      	tmp.put("var",(v!=null?v.getText():null));
                      	      	retval.result = tmp;		
                      	
                      	
                    }

                    }
                    break;
                case 6 :
                    // RuleSet2.g:1422:4: oe= operator_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_operator_expr_in_unary_expr3533);
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
    // RuleSet2.g:1428:1: operator_expr returns [Object result] : f= factor (o= operator )* ;
    public final RuleSet2Parser.operator_expr_return operator_expr() throws RecognitionException {
        RuleSet2Parser.operator_expr_return retval = new RuleSet2Parser.operator_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RuleSet2Parser.factor_return f = null;

        RuleSet2Parser.operator_return o = null;




        	ArrayList operators = new ArrayList();

        try {
            // RuleSet2.g:1433:2: (f= factor (o= operator )* )
            // RuleSet2.g:1433:4: f= factor (o= operator )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_factor_in_operator_expr3562);
            f=factor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            // RuleSet2.g:1433:14: (o= operator )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( ((LA87_0>=74 && LA87_0<=95)) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // RuleSet2.g:1433:15: o= operator
            	    {
            	    pushFollow(FOLLOW_operator_in_operator_expr3568);
            	    o=operator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, o.getTree());
            	    if ( state.backtracking==0 ) {
            	       operators.add(o); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop87;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		if(operators.size() > 0)
              		{
              			HashMap the_result = null;
              			HashMap last_one = null;
              			ArrayList templist = new ArrayList();
              			for(int i = 0;i < operators.size();i++)
              			{
              				RuleSet2Parser.operator_return current = (RuleSet2Parser.operator_return)operators.get(i);
              				HashMap tmp = new HashMap();
              			      	tmp.put("type","operator");			
              		      		tmp.put("name",current.oper);
              				tmp.put("args",current.exprs);
              				templist.add(tmp);				
              			}
              			for(int i = (templist.size() - 1);i > -1;i--)
              			{
              				HashMap current = (HashMap)templist.get(i);
              				if(i == (templist.size() - 1))
              				{				
              					the_result = current;
              					current.put("obj",(f!=null?f.result:null));
              				}
              				if(i != 0)
              				{
              					current.put("obj",templist.get(i-1));      		
              				}
              		      		last_one = current;		
              			}
              		      	retval.result = the_result;;		
              		}
              		else
              		{
              			retval.result = (f!=null?f.result:null);
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
    // $ANTLR end "operator_expr"

    public static class operator_return extends ParserRuleReturnScope {
        public String oper;
        public ArrayList exprs;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operator"
    // RuleSet2.g:1471:10: fragment operator returns [String oper,ArrayList exprs] : o= ( '.pick' | '.match' | '.length' | '.replace' | '.as' | '.head' | '.tail' | '.sort' | '.filter' | '.map' | '.uc' | '.lc' | '.split' | '.join' | '.query' | '.has' | '.union' | '.difference' | '.intersection' | '.unique' | '.once' | '.duplicates' ) '(' (e= expr ( ',' e1= expr )* )? ')' ;
    public final RuleSet2Parser.operator_return operator() throws RecognitionException {
        RuleSet2Parser.operator_return retval = new RuleSet2Parser.operator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token o=null;
        Token char_literal139=null;
        Token char_literal140=null;
        Token char_literal141=null;
        RuleSet2Parser.expr_return e = null;

        RuleSet2Parser.expr_return e1 = null;


        Object o_tree=null;
        Object char_literal139_tree=null;
        Object char_literal140_tree=null;
        Object char_literal141_tree=null;

        	
        	ArrayList rexprs = new ArrayList();

        try {
            // RuleSet2.g:1476:2: (o= ( '.pick' | '.match' | '.length' | '.replace' | '.as' | '.head' | '.tail' | '.sort' | '.filter' | '.map' | '.uc' | '.lc' | '.split' | '.join' | '.query' | '.has' | '.union' | '.difference' | '.intersection' | '.unique' | '.once' | '.duplicates' ) '(' (e= expr ( ',' e1= expr )* )? ')' )
            // RuleSet2.g:1476:4: o= ( '.pick' | '.match' | '.length' | '.replace' | '.as' | '.head' | '.tail' | '.sort' | '.filter' | '.map' | '.uc' | '.lc' | '.split' | '.join' | '.query' | '.has' | '.union' | '.difference' | '.intersection' | '.unique' | '.once' | '.duplicates' ) '(' (e= expr ( ',' e1= expr )* )? ')'
            {
            root_0 = (Object)adaptor.nil();

            o=(Token)input.LT(1);
            if ( (input.LA(1)>=74 && input.LA(1)<=95) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(o));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            char_literal139=(Token)match(input,45,FOLLOW_45_in_operator3685); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal139_tree = (Object)adaptor.create(char_literal139);
            adaptor.addChild(root_0, char_literal139_tree);
            }
            // RuleSet2.g:1479:29: (e= expr ( ',' e1= expr )* )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( ((LA89_0>=VAR && LA89_0<=INT)||LA89_0==FLOAT||(LA89_0>=STRING && LA89_0<=REGEXP)||LA89_0==29||LA89_0==45||LA89_0==55||LA89_0==66||LA89_0==73||(LA89_0>=96 && LA89_0<=98)||(LA89_0>=100 && LA89_0<=103)) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // RuleSet2.g:1479:30: e= expr ( ',' e1= expr )*
                    {
                    pushFollow(FOLLOW_expr_in_operator3690);
                    e=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
                    if ( state.backtracking==0 ) {
                      rexprs.add(e.result); 
                    }
                    // RuleSet2.g:1479:62: ( ',' e1= expr )*
                    loop88:
                    do {
                        int alt88=2;
                        int LA88_0 = input.LA(1);

                        if ( (LA88_0==46) ) {
                            alt88=1;
                        }


                        switch (alt88) {
                    	case 1 :
                    	    // RuleSet2.g:1479:63: ',' e1= expr
                    	    {
                    	    char_literal140=(Token)match(input,46,FOLLOW_46_in_operator3695); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal140_tree = (Object)adaptor.create(char_literal140);
                    	    adaptor.addChild(root_0, char_literal140_tree);
                    	    }
                    	    pushFollow(FOLLOW_expr_in_operator3699);
                    	    e1=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, e1.getTree());
                    	    if ( state.backtracking==0 ) {
                    	      rexprs.add(e1.result); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop88;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal141=(Token)match(input,47,FOLLOW_47_in_operator3708); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal141_tree = (Object)adaptor.create(char_literal141);
            adaptor.addChild(root_0, char_literal141_tree);
            }
            if ( state.backtracking==0 ) {

                    		// Remove .
                    		retval.oper = (o!=null?o.getText():null).substring(1,(o!=null?o.getText():null).length());
                    		retval.exprs = rexprs;
                    	
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

    public static class factor_return extends ParserRuleReturnScope {
        public Object result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "factor"
    // RuleSet2.g:1488:1: factor returns [Object result] options {backtrack=true; } : (iv= INT | sv= STRING | fv= FLOAT | bv= ( 'true' | 'false' ) | bv= VAR '[' e= expr ']' | d= var_domain ':' vv= VAR | 'current' d= var_domain ':' v= VAR | 'history' e= expr d= var_domain ':' v= VAR | n= namespace p= VAR '(' (e= expr ( ',' )? )* ')' | v= VAR '(' (e= expr ( ',' )? )* ')' | '[' (e= expr ( ',' e2= expr )* )? ']' | '{' (h1= hash_line ( ',' h2= hash_line )* )? '}' | v= VAR | '(' e= expr ')' | vr= REGEXP );
    public final RuleSet2Parser.factor_return factor() throws RecognitionException {
        RuleSet2Parser.factor_return retval = new RuleSet2Parser.factor_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token iv=null;
        Token sv=null;
        Token fv=null;
        Token bv=null;
        Token vv=null;
        Token v=null;
        Token p=null;
        Token vr=null;
        Token char_literal142=null;
        Token char_literal143=null;
        Token char_literal144=null;
        Token string_literal145=null;
        Token char_literal146=null;
        Token string_literal147=null;
        Token char_literal148=null;
        Token char_literal149=null;
        Token char_literal150=null;
        Token char_literal151=null;
        Token char_literal152=null;
        Token char_literal153=null;
        Token char_literal154=null;
        Token char_literal155=null;
        Token char_literal156=null;
        Token char_literal157=null;
        Token char_literal158=null;
        Token char_literal159=null;
        Token char_literal160=null;
        Token char_literal161=null;
        Token char_literal162=null;
        RuleSet2Parser.expr_return e = null;

        RuleSet2Parser.var_domain_return d = null;

        RuleSet2Parser.namespace_return n = null;

        RuleSet2Parser.expr_return e2 = null;

        RuleSet2Parser.hash_line_return h1 = null;

        RuleSet2Parser.hash_line_return h2 = null;


        Object iv_tree=null;
        Object sv_tree=null;
        Object fv_tree=null;
        Object bv_tree=null;
        Object vv_tree=null;
        Object v_tree=null;
        Object p_tree=null;
        Object vr_tree=null;
        Object char_literal142_tree=null;
        Object char_literal143_tree=null;
        Object char_literal144_tree=null;
        Object string_literal145_tree=null;
        Object char_literal146_tree=null;
        Object string_literal147_tree=null;
        Object char_literal148_tree=null;
        Object char_literal149_tree=null;
        Object char_literal150_tree=null;
        Object char_literal151_tree=null;
        Object char_literal152_tree=null;
        Object char_literal153_tree=null;
        Object char_literal154_tree=null;
        Object char_literal155_tree=null;
        Object char_literal156_tree=null;
        Object char_literal157_tree=null;
        Object char_literal158_tree=null;
        Object char_literal159_tree=null;
        Object char_literal160_tree=null;
        Object char_literal161_tree=null;
        Object char_literal162_tree=null;


              ArrayList exprs2 = new ArrayList();


        try {
            // RuleSet2.g:1493:2: (iv= INT | sv= STRING | fv= FLOAT | bv= ( 'true' | 'false' ) | bv= VAR '[' e= expr ']' | d= var_domain ':' vv= VAR | 'current' d= var_domain ':' v= VAR | 'history' e= expr d= var_domain ':' v= VAR | n= namespace p= VAR '(' (e= expr ( ',' )? )* ')' | v= VAR '(' (e= expr ( ',' )? )* ')' | '[' (e= expr ( ',' e2= expr )* )? ']' | '{' (h1= hash_line ( ',' h2= hash_line )* )? '}' | v= VAR | '(' e= expr ')' | vr= REGEXP )
            int alt98=15;
            alt98 = dfa98.predict(input);
            switch (alt98) {
                case 1 :
                    // RuleSet2.g:1493:4: iv= INT
                    {
                    root_0 = (Object)adaptor.nil();

                    iv=(Token)match(input,INT,FOLLOW_INT_in_factor3747); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    iv_tree = (Object)adaptor.create(iv);
                    adaptor.addChild(root_0, iv_tree);
                    }
                    if ( state.backtracking==0 ) {
                       
                      		HashMap tmp = new HashMap();
                      		tmp.put("type","num");
                      		tmp.put("val",Long.parseLong((iv!=null?iv.getText():null)));
                      		retval.result = tmp;
                      	
                    }

                    }
                    break;
                case 2 :
                    // RuleSet2.g:1499:9: sv= STRING
                    {
                    root_0 = (Object)adaptor.nil();

                    sv=(Token)match(input,STRING,FOLLOW_STRING_in_factor3762); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    sv_tree = (Object)adaptor.create(sv);
                    adaptor.addChild(root_0, sv_tree);
                    }
                    if ( state.backtracking==0 ) {
                       
                            		HashMap tmp = new HashMap();
                      		tmp.put("type","str");
                      		tmp.put("val",strip_string((sv!=null?sv.getText():null)));
                      		retval.result = tmp;
                      	
                    }

                    }
                    break;
                case 3 :
                    // RuleSet2.g:1505:9: fv= FLOAT
                    {
                    root_0 = (Object)adaptor.nil();

                    fv=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_factor3782); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    fv_tree = (Object)adaptor.create(fv);
                    adaptor.addChild(root_0, fv_tree);
                    }
                    if ( state.backtracking==0 ) {
                       
                            		HashMap tmp = new HashMap();
                      		tmp.put("type","num");
                      		tmp.put("val",Float.parseFloat((fv!=null?fv.getText():null)));
                      		retval.result = tmp;
                      	
                    }

                    }
                    break;
                case 4 :
                    // RuleSet2.g:1511:9: bv= ( 'true' | 'false' )
                    {
                    root_0 = (Object)adaptor.nil();

                    bv=(Token)input.LT(1);
                    if ( (input.LA(1)>=96 && input.LA(1)<=97) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(bv));
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
                      		tmp.put("val",(bv!=null?bv.getText():null));
                      		retval.result = tmp;
                      	
                    }

                    }
                    break;
                case 5 :
                    // RuleSet2.g:1517:9: bv= VAR '[' e= expr ']'
                    {
                    root_0 = (Object)adaptor.nil();

                    bv=(Token)match(input,VAR,FOLLOW_VAR_in_factor3822); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    bv_tree = (Object)adaptor.create(bv);
                    adaptor.addChild(root_0, bv_tree);
                    }
                    char_literal142=(Token)match(input,98,FOLLOW_98_in_factor3824); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal142_tree = (Object)adaptor.create(char_literal142);
                    adaptor.addChild(root_0, char_literal142_tree);
                    }
                    pushFollow(FOLLOW_expr_in_factor3828);
                    e=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
                    char_literal143=(Token)match(input,99,FOLLOW_99_in_factor3830); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal143_tree = (Object)adaptor.create(char_literal143);
                    adaptor.addChild(root_0, char_literal143_tree);
                    }
                    if ( state.backtracking==0 ) {
                       
                            		HashMap tmp = new HashMap();
                      		HashMap val = new HashMap();

                      		HashMap index = new HashMap();
                      		index.putAll((HashMap)(e!=null?e.result:null));
                      		val.put("var_expr",(bv!=null?bv.getText():null));

                      		val.put("index",index);
                      		tmp.put("type","array_ref");

                      		tmp.put("val",val);
                      		retval.result = tmp;
                            
                    }

                    }
                    break;
                case 6 :
                    // RuleSet2.g:1531:9: d= var_domain ':' vv= VAR
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_var_domain_in_factor3845);
                    d=var_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, d.getTree());
                    char_literal144=(Token)match(input,37,FOLLOW_37_in_factor3847); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal144_tree = (Object)adaptor.create(char_literal144);
                    adaptor.addChild(root_0, char_literal144_tree);
                    }
                    vv=(Token)match(input,VAR,FOLLOW_VAR_in_factor3851); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    vv_tree = (Object)adaptor.create(vv);
                    adaptor.addChild(root_0, vv_tree);
                    }
                    if ( state.backtracking==0 ) {

                      	      	HashMap tmp = new HashMap();
                      	      	tmp.put("domain",(d!=null?input.toString(d.start,d.stop):null));
                      	      	tmp.put("name",(vv!=null?vv.getText():null));
                      	      	tmp.put("type","persistent");
                      	      	retval.result = tmp;
                            
                    }

                    }
                    break;
                case 7 :
                    // RuleSet2.g:1538:9: 'current' d= var_domain ':' v= VAR
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal145=(Token)match(input,100,FOLLOW_100_in_factor3863); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal145_tree = (Object)adaptor.create(string_literal145);
                    adaptor.addChild(root_0, string_literal145_tree);
                    }
                    pushFollow(FOLLOW_var_domain_in_factor3867);
                    d=var_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, d.getTree());
                    char_literal146=(Token)match(input,37,FOLLOW_37_in_factor3869); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal146_tree = (Object)adaptor.create(char_literal146);
                    adaptor.addChild(root_0, char_literal146_tree);
                    }
                    v=(Token)match(input,VAR,FOLLOW_VAR_in_factor3873); if (state.failed) return retval;
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
                case 8 :
                    // RuleSet2.g:1545:9: 'history' e= expr d= var_domain ':' v= VAR
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal147=(Token)match(input,101,FOLLOW_101_in_factor3886); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal147_tree = (Object)adaptor.create(string_literal147);
                    adaptor.addChild(root_0, string_literal147_tree);
                    }
                    pushFollow(FOLLOW_expr_in_factor3890);
                    e=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
                    pushFollow(FOLLOW_var_domain_in_factor3894);
                    d=var_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, d.getTree());
                    char_literal148=(Token)match(input,37,FOLLOW_37_in_factor3896); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal148_tree = (Object)adaptor.create(char_literal148);
                    adaptor.addChild(root_0, char_literal148_tree);
                    }
                    v=(Token)match(input,VAR,FOLLOW_VAR_in_factor3900); if (state.failed) return retval;
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
                case 9 :
                    // RuleSet2.g:1555:9: n= namespace p= VAR '(' (e= expr ( ',' )? )* ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_namespace_in_factor3914);
                    n=namespace();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, n.getTree());
                    p=(Token)match(input,VAR,FOLLOW_VAR_in_factor3918); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    p_tree = (Object)adaptor.create(p);
                    adaptor.addChild(root_0, p_tree);
                    }
                    char_literal149=(Token)match(input,45,FOLLOW_45_in_factor3920); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal149_tree = (Object)adaptor.create(char_literal149);
                    adaptor.addChild(root_0, char_literal149_tree);
                    }
                    // RuleSet2.g:1555:31: (e= expr ( ',' )? )*
                    loop91:
                    do {
                        int alt91=2;
                        int LA91_0 = input.LA(1);

                        if ( ((LA91_0>=VAR && LA91_0<=INT)||LA91_0==FLOAT||(LA91_0>=STRING && LA91_0<=REGEXP)||LA91_0==29||LA91_0==45||LA91_0==55||LA91_0==66||LA91_0==73||(LA91_0>=96 && LA91_0<=98)||(LA91_0>=100 && LA91_0<=103)) ) {
                            alt91=1;
                        }


                        switch (alt91) {
                    	case 1 :
                    	    // RuleSet2.g:1555:32: e= expr ( ',' )?
                    	    {
                    	    pushFollow(FOLLOW_expr_in_factor3925);
                    	    e=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
                    	    if ( state.backtracking==0 ) {

                    	                  exprs2.add((e!=null?e.result:null));
                    	            	
                    	    }
                    	    // RuleSet2.g:1558:8: ( ',' )?
                    	    int alt90=2;
                    	    int LA90_0 = input.LA(1);

                    	    if ( (LA90_0==46) ) {
                    	        alt90=1;
                    	    }
                    	    switch (alt90) {
                    	        case 1 :
                    	            // RuleSet2.g:0:0: ','
                    	            {
                    	            char_literal150=(Token)match(input,46,FOLLOW_46_in_factor3936); if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) {
                    	            char_literal150_tree = (Object)adaptor.create(char_literal150);
                    	            adaptor.addChild(root_0, char_literal150_tree);
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop91;
                        }
                    } while (true);

                    char_literal151=(Token)match(input,47,FOLLOW_47_in_factor3941); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal151_tree = (Object)adaptor.create(char_literal151);
                    adaptor.addChild(root_0, char_literal151_tree);
                    }
                    if ( state.backtracking==0 ) {

                      	      	HashMap tmp = new HashMap();
                      	      	tmp.put("type","qualified");
                      	      	tmp.put("predicate",(p!=null?p.getText():null));
                      	      	tmp.put("source",(n!=null?input.toString(n.start,n.stop):null).substring(0,(n!=null?input.toString(n.start,n.stop):null).length() - 1));
                      	      	tmp.put("args",exprs2);
                      	      	retval.result = tmp;
                            
                    }

                    }
                    break;
                case 10 :
                    // RuleSet2.g:1566:9: v= VAR '(' (e= expr ( ',' )? )* ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    v=(Token)match(input,VAR,FOLLOW_VAR_in_factor3956); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    v_tree = (Object)adaptor.create(v);
                    adaptor.addChild(root_0, v_tree);
                    }
                    char_literal152=(Token)match(input,45,FOLLOW_45_in_factor3958); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal152_tree = (Object)adaptor.create(char_literal152);
                    adaptor.addChild(root_0, char_literal152_tree);
                    }
                    // RuleSet2.g:1566:19: (e= expr ( ',' )? )*
                    loop93:
                    do {
                        int alt93=2;
                        int LA93_0 = input.LA(1);

                        if ( ((LA93_0>=VAR && LA93_0<=INT)||LA93_0==FLOAT||(LA93_0>=STRING && LA93_0<=REGEXP)||LA93_0==29||LA93_0==45||LA93_0==55||LA93_0==66||LA93_0==73||(LA93_0>=96 && LA93_0<=98)||(LA93_0>=100 && LA93_0<=103)) ) {
                            alt93=1;
                        }


                        switch (alt93) {
                    	case 1 :
                    	    // RuleSet2.g:1566:20: e= expr ( ',' )?
                    	    {
                    	    pushFollow(FOLLOW_expr_in_factor3963);
                    	    e=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
                    	    if ( state.backtracking==0 ) {

                    	                  exprs2.add((e!=null?e.result:null));
                    	            	
                    	    }
                    	    // RuleSet2.g:1569:2: ( ',' )?
                    	    int alt92=2;
                    	    int LA92_0 = input.LA(1);

                    	    if ( (LA92_0==46) ) {
                    	        alt92=1;
                    	    }
                    	    switch (alt92) {
                    	        case 1 :
                    	            // RuleSet2.g:0:0: ','
                    	            {
                    	            char_literal153=(Token)match(input,46,FOLLOW_46_in_factor3967); if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) {
                    	            char_literal153_tree = (Object)adaptor.create(char_literal153);
                    	            adaptor.addChild(root_0, char_literal153_tree);
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop93;
                        }
                    } while (true);

                    char_literal154=(Token)match(input,47,FOLLOW_47_in_factor3972); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal154_tree = (Object)adaptor.create(char_literal154);
                    adaptor.addChild(root_0, char_literal154_tree);
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
                case 11 :
                    // RuleSet2.g:1580:9: '[' (e= expr ( ',' e2= expr )* )? ']'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal155=(Token)match(input,98,FOLLOW_98_in_factor3984); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal155_tree = (Object)adaptor.create(char_literal155);
                    adaptor.addChild(root_0, char_literal155_tree);
                    }
                    // RuleSet2.g:1580:13: (e= expr ( ',' e2= expr )* )?
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( ((LA95_0>=VAR && LA95_0<=INT)||LA95_0==FLOAT||(LA95_0>=STRING && LA95_0<=REGEXP)||LA95_0==29||LA95_0==45||LA95_0==55||LA95_0==66||LA95_0==73||(LA95_0>=96 && LA95_0<=98)||(LA95_0>=100 && LA95_0<=103)) ) {
                        alt95=1;
                    }
                    switch (alt95) {
                        case 1 :
                            // RuleSet2.g:1580:14: e= expr ( ',' e2= expr )*
                            {
                            pushFollow(FOLLOW_expr_in_factor3989);
                            e=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
                            if ( state.backtracking==0 ) {

                                    			exprs2.add((e!=null?e.result:null));
                                    		 
                            }
                            // RuleSet2.g:1582:12: ( ',' e2= expr )*
                            loop94:
                            do {
                                int alt94=2;
                                int LA94_0 = input.LA(1);

                                if ( (LA94_0==46) ) {
                                    alt94=1;
                                }


                                switch (alt94) {
                            	case 1 :
                            	    // RuleSet2.g:1582:13: ',' e2= expr
                            	    {
                            	    char_literal156=(Token)match(input,46,FOLLOW_46_in_factor3994); if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) {
                            	    char_literal156_tree = (Object)adaptor.create(char_literal156);
                            	    adaptor.addChild(root_0, char_literal156_tree);
                            	    }
                            	    pushFollow(FOLLOW_expr_in_factor3998);
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
                            	    break loop94;
                                }
                            } while (true);


                            }
                            break;

                    }

                    char_literal157=(Token)match(input,99,FOLLOW_99_in_factor4006); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal157_tree = (Object)adaptor.create(char_literal157);
                    adaptor.addChild(root_0, char_literal157_tree);
                    }
                    if ( state.backtracking==0 ) {

                            			HashMap tmp = new HashMap();
                            			tmp.put("val",exprs2);	
                            			tmp.put("type","array");
                            		 
                      	      	retval.result = tmp;
                            
                    }

                    }
                    break;
                case 12 :
                    // RuleSet2.g:1591:9: '{' (h1= hash_line ( ',' h2= hash_line )* )? '}'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal158=(Token)match(input,29,FOLLOW_29_in_factor4018); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal158_tree = (Object)adaptor.create(char_literal158);
                    adaptor.addChild(root_0, char_literal158_tree);
                    }
                    // RuleSet2.g:1591:13: (h1= hash_line ( ',' h2= hash_line )* )?
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==STRING) ) {
                        alt97=1;
                    }
                    switch (alt97) {
                        case 1 :
                            // RuleSet2.g:1591:14: h1= hash_line ( ',' h2= hash_line )*
                            {
                            pushFollow(FOLLOW_hash_line_in_factor4023);
                            h1=hash_line();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, h1.getTree());
                            if ( state.backtracking==0 ) {
                               
                                    			exprs2.add((h1!=null?h1.result:null));
                                    		 
                            }
                            // RuleSet2.g:1593:12: ( ',' h2= hash_line )*
                            loop96:
                            do {
                                int alt96=2;
                                int LA96_0 = input.LA(1);

                                if ( (LA96_0==46) ) {
                                    alt96=1;
                                }


                                switch (alt96) {
                            	case 1 :
                            	    // RuleSet2.g:1593:13: ',' h2= hash_line
                            	    {
                            	    char_literal159=(Token)match(input,46,FOLLOW_46_in_factor4028); if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) {
                            	    char_literal159_tree = (Object)adaptor.create(char_literal159);
                            	    adaptor.addChild(root_0, char_literal159_tree);
                            	    }
                            	    pushFollow(FOLLOW_hash_line_in_factor4032);
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
                            	    break loop96;
                                }
                            } while (true);


                            }
                            break;

                    }

                    char_literal160=(Token)match(input,30,FOLLOW_30_in_factor4041); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal160_tree = (Object)adaptor.create(char_literal160);
                    adaptor.addChild(root_0, char_literal160_tree);
                    }
                    if ( state.backtracking==0 ) {

                            			HashMap tmp = new HashMap();
                            			tmp.put("val",exprs2);	
                            			tmp.put("type","hashraw");
                            		 
                      	      	retval.result = tmp;
                      	
                    }

                    }
                    break;
                case 13 :
                    // RuleSet2.g:1602:9: v= VAR
                    {
                    root_0 = (Object)adaptor.nil();

                    v=(Token)match(input,VAR,FOLLOW_VAR_in_factor4055); if (state.failed) return retval;
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
                case 14 :
                    // RuleSet2.g:1608:9: '(' e= expr ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal161=(Token)match(input,45,FOLLOW_45_in_factor4068); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal161_tree = (Object)adaptor.create(char_literal161);
                    adaptor.addChild(root_0, char_literal161_tree);
                    }
                    pushFollow(FOLLOW_expr_in_factor4072);
                    e=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
                    char_literal162=(Token)match(input,47,FOLLOW_47_in_factor4074); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal162_tree = (Object)adaptor.create(char_literal162);
                    adaptor.addChild(root_0, char_literal162_tree);
                    }
                    if ( state.backtracking==0 ) {
                       
                            		retval.result =(e!=null?e.result:null); 
                            	
                    }

                    }
                    break;
                case 15 :
                    // RuleSet2.g:1611:9: vr= REGEXP
                    {
                    root_0 = (Object)adaptor.nil();

                    vr=(Token)match(input,REGEXP,FOLLOW_REGEXP_in_factor4093); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    vr_tree = (Object)adaptor.create(vr);
                    adaptor.addChild(root_0, vr_tree);
                    }
                    if ( state.backtracking==0 ) {

                            		HashMap tmp = new HashMap();
                      		tmp.put("type","regx");
                      		tmp.put("val",strip_string((vr!=null?vr.getText():null)));
                      		retval.result = tmp;
                            
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
    // RuleSet2.g:1621:10: fragment var_domain : ( 'ent' | 'app' );
    public final RuleSet2Parser.var_domain_return var_domain() throws RecognitionException {
        RuleSet2Parser.var_domain_return retval = new RuleSet2Parser.var_domain_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set163=null;

        Object set163_tree=null;

        try {
            // RuleSet2.g:1621:20: ( 'ent' | 'app' )
            // RuleSet2.g:
            {
            root_0 = (Object)adaptor.nil();

            set163=(Token)input.LT(1);
            if ( (input.LA(1)>=102 && input.LA(1)<=103) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set163));
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
    // RuleSet2.g:1625:10: fragment namespace returns [String result] : v= VAR ':' ;
    public final RuleSet2Parser.namespace_return namespace() throws RecognitionException {
        RuleSet2Parser.namespace_return retval = new RuleSet2Parser.namespace_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token v=null;
        Token char_literal164=null;

        Object v_tree=null;
        Object char_literal164_tree=null;

        try {
            // RuleSet2.g:1626:2: (v= VAR ':' )
            // RuleSet2.g:1626:4: v= VAR ':'
            {
            root_0 = (Object)adaptor.nil();

            v=(Token)match(input,VAR,FOLLOW_VAR_in_namespace4133); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            v_tree = (Object)adaptor.create(v);
            adaptor.addChild(root_0, v_tree);
            }
            char_literal164=(Token)match(input,37,FOLLOW_37_in_namespace4135); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal164_tree = (Object)adaptor.create(char_literal164);
            adaptor.addChild(root_0, char_literal164_tree);
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
        public Object result;
        public String time;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "timeframe"
    // RuleSet2.g:1633:1: timeframe returns [Object result,String time] : 'within' e= expr p= period ;
    public final RuleSet2Parser.timeframe_return timeframe() throws RecognitionException {
        RuleSet2Parser.timeframe_return retval = new RuleSet2Parser.timeframe_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal165=null;
        RuleSet2Parser.expr_return e = null;

        RuleSet2Parser.period_return p = null;


        Object string_literal165_tree=null;

        try {
            // RuleSet2.g:1634:2: ( 'within' e= expr p= period )
            // RuleSet2.g:1634:5: 'within' e= expr p= period
            {
            root_0 = (Object)adaptor.nil();

            string_literal165=(Token)match(input,104,FOLLOW_104_in_timeframe4157); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal165_tree = (Object)adaptor.create(string_literal165);
            adaptor.addChild(root_0, string_literal165_tree);
            }
            pushFollow(FOLLOW_expr_in_timeframe4161);
            e=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
            pushFollow(FOLLOW_period_in_timeframe4165);
            p=period();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p.getTree());
            if ( state.backtracking==0 ) {

              		retval.result = (e!=null?e.result:null);
              		retval.time = (p!=null?input.toString(p.start,p.stop):null);
              	
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
    // RuleSet2.g:1641:1: hash_line returns [HashMap result] : s= STRING ':' e= expr ;
    public final RuleSet2Parser.hash_line_return hash_line() throws RecognitionException {
        RuleSet2Parser.hash_line_return retval = new RuleSet2Parser.hash_line_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token s=null;
        Token char_literal166=null;
        RuleSet2Parser.expr_return e = null;


        Object s_tree=null;
        Object char_literal166_tree=null;

        try {
            // RuleSet2.g:1642:2: (s= STRING ':' e= expr )
            // RuleSet2.g:1642:4: s= STRING ':' e= expr
            {
            root_0 = (Object)adaptor.nil();

            s=(Token)match(input,STRING,FOLLOW_STRING_in_hash_line4189); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            s_tree = (Object)adaptor.create(s);
            adaptor.addChild(root_0, s_tree);
            }
            char_literal166=(Token)match(input,37,FOLLOW_37_in_hash_line4191); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal166_tree = (Object)adaptor.create(char_literal166);
            adaptor.addChild(root_0, char_literal166_tree);
            }
            pushFollow(FOLLOW_expr_in_hash_line4195);
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
    // RuleSet2.g:1651:1: css_emit returns [String emit_value] : 'css' (h= HTML | h= STRING ) ;
    public final RuleSet2Parser.css_emit_return css_emit() throws RecognitionException {
        RuleSet2Parser.css_emit_return retval = new RuleSet2Parser.css_emit_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token h=null;
        Token string_literal167=null;

        Object h_tree=null;
        Object string_literal167_tree=null;

        try {
            // RuleSet2.g:1652:2: ( 'css' (h= HTML | h= STRING ) )
            // RuleSet2.g:1652:4: 'css' (h= HTML | h= STRING )
            {
            root_0 = (Object)adaptor.nil();

            string_literal167=(Token)match(input,105,FOLLOW_105_in_css_emit4213); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal167_tree = (Object)adaptor.create(string_literal167);
            adaptor.addChild(root_0, string_literal167_tree);
            }
            // RuleSet2.g:1652:10: (h= HTML | h= STRING )
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==HTML) ) {
                alt99=1;
            }
            else if ( (LA99_0==STRING) ) {
                alt99=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }
            switch (alt99) {
                case 1 :
                    // RuleSet2.g:1652:12: h= HTML
                    {
                    h=(Token)match(input,HTML,FOLLOW_HTML_in_css_emit4219); if (state.failed) return retval;
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
                    // RuleSet2.g:1653:3: h= STRING
                    {
                    h=(Token)match(input,STRING,FOLLOW_STRING_in_css_emit4227); if (state.failed) return retval;
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
    // RuleSet2.g:1657:10: fragment period : must_be_one[sar( \"years\", \"months\", \"weeks\", \"days\", \"hours\", \"minutes\", \"seconds\", \"year\", \"month\", \"week\", \"day\", \"hour\", \"minute\", \"second\")] ;
    public final RuleSet2Parser.period_return period() throws RecognitionException {
        RuleSet2Parser.period_return retval = new RuleSet2Parser.period_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RuleSet2Parser.must_be_one_return must_be_one168 = null;



        try {
            // RuleSet2.g:1658:2: ( must_be_one[sar( \"years\", \"months\", \"weeks\", \"days\", \"hours\", \"minutes\", \"seconds\", \"year\", \"month\", \"week\", \"day\", \"hour\", \"minute\", \"second\")] )
            // RuleSet2.g:1659:3: must_be_one[sar( \"years\", \"months\", \"weeks\", \"days\", \"hours\", \"minutes\", \"seconds\", \"year\", \"month\", \"week\", \"day\", \"hour\", \"minute\", \"second\")]
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_must_be_one_in_period4250);
            must_be_one168=must_be_one(sar( "years", "months", "weeks", "days", "hours", "minutes", "seconds", "year", "month", "week", "day", "hour", "minute", "second"));

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, must_be_one168.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // RuleSet2.g:1679:1: cachable returns [Object what] : ca= 'cachable' ( 'for' tm= INT per= period )? ;
    public final RuleSet2Parser.cachable_return cachable() throws RecognitionException {
        RuleSet2Parser.cachable_return retval = new RuleSet2Parser.cachable_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ca=null;
        Token tm=null;
        Token string_literal169=null;
        RuleSet2Parser.period_return per = null;


        Object ca_tree=null;
        Object tm_tree=null;
        Object string_literal169_tree=null;


        	retval.what = null;

        try {
            // RuleSet2.g:1683:2: (ca= 'cachable' ( 'for' tm= INT per= period )? )
            // RuleSet2.g:1684:3: ca= 'cachable' ( 'for' tm= INT per= period )?
            {
            root_0 = (Object)adaptor.nil();

            ca=(Token)match(input,106,FOLLOW_106_in_cachable4284); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ca_tree = (Object)adaptor.create(ca);
            adaptor.addChild(root_0, ca_tree);
            }
            // RuleSet2.g:1684:17: ( 'for' tm= INT per= period )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==43) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // RuleSet2.g:1684:18: 'for' tm= INT per= period
                    {
                    string_literal169=(Token)match(input,43,FOLLOW_43_in_cachable4287); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal169_tree = (Object)adaptor.create(string_literal169);
                    adaptor.addChild(root_0, string_literal169_tree);
                    }
                    tm=(Token)match(input,INT,FOLLOW_INT_in_cachable4291); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    tm_tree = (Object)adaptor.create(tm);
                    adaptor.addChild(root_0, tm_tree);
                    }
                    pushFollow(FOLLOW_period_in_cachable4295);
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
              	 			retval.what = new Long(1);
              	 		}
              	 		else
              	 		{
              	 			retval.what = new Long(0);
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
    // RuleSet2.g:1704:1: emit_block returns [String emit_value] : 'emit' (h= HTML | h= STRING | h= JS ) ;
    public final RuleSet2Parser.emit_block_return emit_block() throws RecognitionException {
        RuleSet2Parser.emit_block_return retval = new RuleSet2Parser.emit_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token h=null;
        Token string_literal170=null;

        Object h_tree=null;
        Object string_literal170_tree=null;

        try {
            // RuleSet2.g:1705:2: ( 'emit' (h= HTML | h= STRING | h= JS ) )
            // RuleSet2.g:1705:4: 'emit' (h= HTML | h= STRING | h= JS )
            {
            root_0 = (Object)adaptor.nil();

            string_literal170=(Token)match(input,107,FOLLOW_107_in_emit_block4319); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal170_tree = (Object)adaptor.create(string_literal170);
            adaptor.addChild(root_0, string_literal170_tree);
            }
            // RuleSet2.g:1705:11: (h= HTML | h= STRING | h= JS )
            int alt101=3;
            switch ( input.LA(1) ) {
            case HTML:
                {
                alt101=1;
                }
                break;
            case STRING:
                {
                alt101=2;
                }
                break;
            case JS:
                {
                alt101=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;
            }

            switch (alt101) {
                case 1 :
                    // RuleSet2.g:1705:13: h= HTML
                    {
                    h=(Token)match(input,HTML,FOLLOW_HTML_in_emit_block4325); if (state.failed) return retval;
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
                    // RuleSet2.g:1706:3: h= STRING
                    {
                    h=(Token)match(input,STRING,FOLLOW_STRING_in_emit_block4333); if (state.failed) return retval;
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
                    // RuleSet2.g:1707:3: h= JS
                    {
                    h=(Token)match(input,JS,FOLLOW_JS_in_emit_block4341); if (state.failed) return retval;
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
    // RuleSet2.g:1711:1: meta_block : 'meta' '{' (name= must_be_one[sar(\"description\",\"name\",\"author\")] (html_desc= HTML | string_desc= STRING ) | 'key' what= must_be_one[sar(\"errorstack\",\"googleanalytics\",\"facebook\",\"twitter\",\"amazon\",\"kpds\",\"google\")] (key_value= STRING | '{' ( name_value_pair[key_values] ( ',' name_value_pair[key_values] )* ) '}' )+ | 'authz' 'require' must_be[\"user\"] | 'logging' onoff= ( 'on' | 'off' ) | 'use' ( (rtype= ( 'css' | 'javascript' ) must_be[\"resource\"] (url= STRING | nicename= VAR ) ) | ( 'module' modname= VAR ( 'alias' alias= VAR )? ) ) )* '}' ;
    public final RuleSet2Parser.meta_block_return meta_block() throws RecognitionException {
        RuleSet2Parser.meta_block_return retval = new RuleSet2Parser.meta_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token html_desc=null;
        Token string_desc=null;
        Token key_value=null;
        Token onoff=null;
        Token rtype=null;
        Token url=null;
        Token nicename=null;
        Token modname=null;
        Token alias=null;
        Token string_literal171=null;
        Token char_literal172=null;
        Token string_literal173=null;
        Token char_literal174=null;
        Token char_literal176=null;
        Token char_literal178=null;
        Token string_literal179=null;
        Token string_literal180=null;
        Token string_literal182=null;
        Token string_literal183=null;
        Token string_literal185=null;
        Token string_literal186=null;
        Token char_literal187=null;
        RuleSet2Parser.must_be_one_return name = null;

        RuleSet2Parser.must_be_one_return what = null;

        RuleSet2Parser.name_value_pair_return name_value_pair175 = null;

        RuleSet2Parser.name_value_pair_return name_value_pair177 = null;

        RuleSet2Parser.must_be_return must_be181 = null;

        RuleSet2Parser.must_be_return must_be184 = null;


        Object html_desc_tree=null;
        Object string_desc_tree=null;
        Object key_value_tree=null;
        Object onoff_tree=null;
        Object rtype_tree=null;
        Object url_tree=null;
        Object nicename_tree=null;
        Object modname_tree=null;
        Object alias_tree=null;
        Object string_literal171_tree=null;
        Object char_literal172_tree=null;
        Object string_literal173_tree=null;
        Object char_literal174_tree=null;
        Object char_literal176_tree=null;
        Object char_literal178_tree=null;
        Object string_literal179_tree=null;
        Object string_literal180_tree=null;
        Object string_literal182_tree=null;
        Object string_literal183_tree=null;
        Object string_literal185_tree=null;
        Object string_literal186_tree=null;
        Object char_literal187_tree=null;


        	 HashMap meta_block_hash = (HashMap)rule_json.get("meta");
        	 ArrayList use_list = new ArrayList();
        	 HashMap keys_map = new HashMap();
        	 HashMap key_values = new HashMap();

        try {
            // RuleSet2.g:1728:2: ( 'meta' '{' (name= must_be_one[sar(\"description\",\"name\",\"author\")] (html_desc= HTML | string_desc= STRING ) | 'key' what= must_be_one[sar(\"errorstack\",\"googleanalytics\",\"facebook\",\"twitter\",\"amazon\",\"kpds\",\"google\")] (key_value= STRING | '{' ( name_value_pair[key_values] ( ',' name_value_pair[key_values] )* ) '}' )+ | 'authz' 'require' must_be[\"user\"] | 'logging' onoff= ( 'on' | 'off' ) | 'use' ( (rtype= ( 'css' | 'javascript' ) must_be[\"resource\"] (url= STRING | nicename= VAR ) ) | ( 'module' modname= VAR ( 'alias' alias= VAR )? ) ) )* '}' )
            // RuleSet2.g:1728:4: 'meta' '{' (name= must_be_one[sar(\"description\",\"name\",\"author\")] (html_desc= HTML | string_desc= STRING ) | 'key' what= must_be_one[sar(\"errorstack\",\"googleanalytics\",\"facebook\",\"twitter\",\"amazon\",\"kpds\",\"google\")] (key_value= STRING | '{' ( name_value_pair[key_values] ( ',' name_value_pair[key_values] )* ) '}' )+ | 'authz' 'require' must_be[\"user\"] | 'logging' onoff= ( 'on' | 'off' ) | 'use' ( (rtype= ( 'css' | 'javascript' ) must_be[\"resource\"] (url= STRING | nicename= VAR ) ) | ( 'module' modname= VAR ( 'alias' alias= VAR )? ) ) )* '}'
            {
            root_0 = (Object)adaptor.nil();

            string_literal171=(Token)match(input,108,FOLLOW_108_in_meta_block4373); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal171_tree = (Object)adaptor.create(string_literal171);
            adaptor.addChild(root_0, string_literal171_tree);
            }
            char_literal172=(Token)match(input,29,FOLLOW_29_in_meta_block4375); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal172_tree = (Object)adaptor.create(char_literal172);
            adaptor.addChild(root_0, char_literal172_tree);
            }
            // RuleSet2.g:1729:2: (name= must_be_one[sar(\"description\",\"name\",\"author\")] (html_desc= HTML | string_desc= STRING ) | 'key' what= must_be_one[sar(\"errorstack\",\"googleanalytics\",\"facebook\",\"twitter\",\"amazon\",\"kpds\",\"google\")] (key_value= STRING | '{' ( name_value_pair[key_values] ( ',' name_value_pair[key_values] )* ) '}' )+ | 'authz' 'require' must_be[\"user\"] | 'logging' onoff= ( 'on' | 'off' ) | 'use' ( (rtype= ( 'css' | 'javascript' ) must_be[\"resource\"] (url= STRING | nicename= VAR ) ) | ( 'module' modname= VAR ( 'alias' alias= VAR )? ) ) )*
            loop108:
            do {
                int alt108=6;
                switch ( input.LA(1) ) {
                case VAR:
                    {
                    alt108=1;
                    }
                    break;
                case 109:
                    {
                    alt108=2;
                    }
                    break;
                case 110:
                    {
                    alt108=3;
                    }
                    break;
                case 112:
                    {
                    alt108=4;
                    }
                    break;
                case 114:
                    {
                    alt108=5;
                    }
                    break;

                }

                switch (alt108) {
            	case 1 :
            	    // RuleSet2.g:1729:5: name= must_be_one[sar(\"description\",\"name\",\"author\")] (html_desc= HTML | string_desc= STRING )
            	    {
            	    pushFollow(FOLLOW_must_be_one_in_meta_block4384);
            	    name=must_be_one(sar("description","name","author"));

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, name.getTree());
            	    // RuleSet2.g:1729:58: (html_desc= HTML | string_desc= STRING )
            	    int alt102=2;
            	    int LA102_0 = input.LA(1);

            	    if ( (LA102_0==HTML) ) {
            	        alt102=1;
            	    }
            	    else if ( (LA102_0==STRING) ) {
            	        alt102=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 102, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt102) {
            	        case 1 :
            	            // RuleSet2.g:1729:59: html_desc= HTML
            	            {
            	            html_desc=(Token)match(input,HTML,FOLLOW_HTML_in_meta_block4390); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            html_desc_tree = (Object)adaptor.create(html_desc);
            	            adaptor.addChild(root_0, html_desc_tree);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // RuleSet2.g:1729:74: string_desc= STRING
            	            {
            	            string_desc=(Token)match(input,STRING,FOLLOW_STRING_in_meta_block4394); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_desc_tree = (Object)adaptor.create(string_desc);
            	            adaptor.addChild(root_0, string_desc_tree);
            	            }

            	            }
            	            break;

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	      			if((string_desc!=null?string_desc.getText():null) != null)
            	      				meta_block_hash.put((name!=null?input.toString(name.start,name.stop):null),strip_string((string_desc!=null?string_desc.getText():null))); 
            	      			else
            	      				meta_block_hash.put((name!=null?input.toString(name.start,name.stop):null),strip_wrappers("<<",">>",(html_desc!=null?html_desc.getText():null))); 
            	      			html_desc = null;
            	      			string_desc = null;
            	      	
            	      		
            	    }

            	    }
            	    break;
            	case 2 :
            	    // RuleSet2.g:1739:5: 'key' what= must_be_one[sar(\"errorstack\",\"googleanalytics\",\"facebook\",\"twitter\",\"amazon\",\"kpds\",\"google\")] (key_value= STRING | '{' ( name_value_pair[key_values] ( ',' name_value_pair[key_values] )* ) '}' )+
            	    {
            	    string_literal173=(Token)match(input,109,FOLLOW_109_in_meta_block4408); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal173_tree = (Object)adaptor.create(string_literal173);
            	    adaptor.addChild(root_0, string_literal173_tree);
            	    }
            	    pushFollow(FOLLOW_must_be_one_in_meta_block4412);
            	    what=must_be_one(sar("errorstack","googleanalytics","facebook","twitter","amazon","kpds","google"));

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, what.getTree());
            	    // RuleSet2.g:1739:111: (key_value= STRING | '{' ( name_value_pair[key_values] ( ',' name_value_pair[key_values] )* ) '}' )+
            	    int cnt104=0;
            	    loop104:
            	    do {
            	        int alt104=3;
            	        int LA104_0 = input.LA(1);

            	        if ( (LA104_0==STRING) ) {
            	            alt104=1;
            	        }
            	        else if ( (LA104_0==29) ) {
            	            alt104=2;
            	        }


            	        switch (alt104) {
            	    	case 1 :
            	    	    // RuleSet2.g:1739:112: key_value= STRING
            	    	    {
            	    	    key_value=(Token)match(input,STRING,FOLLOW_STRING_in_meta_block4418); if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) {
            	    	    key_value_tree = (Object)adaptor.create(key_value);
            	    	    adaptor.addChild(root_0, key_value_tree);
            	    	    }

            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // RuleSet2.g:1739:131: '{' ( name_value_pair[key_values] ( ',' name_value_pair[key_values] )* ) '}'
            	    	    {
            	    	    char_literal174=(Token)match(input,29,FOLLOW_29_in_meta_block4422); if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) {
            	    	    char_literal174_tree = (Object)adaptor.create(char_literal174);
            	    	    adaptor.addChild(root_0, char_literal174_tree);
            	    	    }
            	    	    // RuleSet2.g:1739:135: ( name_value_pair[key_values] ( ',' name_value_pair[key_values] )* )
            	    	    // RuleSet2.g:1739:136: name_value_pair[key_values] ( ',' name_value_pair[key_values] )*
            	    	    {
            	    	    pushFollow(FOLLOW_name_value_pair_in_meta_block4425);
            	    	    name_value_pair175=name_value_pair(key_values);

            	    	    state._fsp--;
            	    	    if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, name_value_pair175.getTree());
            	    	    // RuleSet2.g:1739:164: ( ',' name_value_pair[key_values] )*
            	    	    loop103:
            	    	    do {
            	    	        int alt103=2;
            	    	        int LA103_0 = input.LA(1);

            	    	        if ( (LA103_0==46) ) {
            	    	            alt103=1;
            	    	        }


            	    	        switch (alt103) {
            	    	    	case 1 :
            	    	    	    // RuleSet2.g:1739:165: ',' name_value_pair[key_values]
            	    	    	    {
            	    	    	    char_literal176=(Token)match(input,46,FOLLOW_46_in_meta_block4429); if (state.failed) return retval;
            	    	    	    if ( state.backtracking==0 ) {
            	    	    	    char_literal176_tree = (Object)adaptor.create(char_literal176);
            	    	    	    adaptor.addChild(root_0, char_literal176_tree);
            	    	    	    }
            	    	    	    pushFollow(FOLLOW_name_value_pair_in_meta_block4431);
            	    	    	    name_value_pair177=name_value_pair(key_values);

            	    	    	    state._fsp--;
            	    	    	    if (state.failed) return retval;
            	    	    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, name_value_pair177.getTree());

            	    	    	    }
            	    	    	    break;

            	    	    	default :
            	    	    	    break loop103;
            	    	        }
            	    	    } while (true);


            	    	    }

            	    	    char_literal178=(Token)match(input,30,FOLLOW_30_in_meta_block4437); if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) {
            	    	    char_literal178_tree = (Object)adaptor.create(char_literal178);
            	    	    adaptor.addChild(root_0, char_literal178_tree);
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt104 >= 1 ) break loop104;
            	    	    if (state.backtracking>0) {state.failed=true; return retval;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(104, input);
            	                throw eee;
            	        }
            	        cnt104++;
            	    } while (true);

            	    if ( state.backtracking==0 ) {
            	       
            	      		if(!key_values.isEmpty()) 
            	      			keys_map.put((what!=null?input.toString(what.start,what.stop):null),key_values); 
            	      		else 
            	      			keys_map.put((what!=null?input.toString(what.start,what.stop):null),strip_string((key_value!=null?key_value.getText():null))); 
            	      	
            	    }

            	    }
            	    break;
            	case 3 :
            	    // RuleSet2.g:1745:4: 'authz' 'require' must_be[\"user\"]
            	    {
            	    string_literal179=(Token)match(input,110,FOLLOW_110_in_meta_block4449); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal179_tree = (Object)adaptor.create(string_literal179);
            	    adaptor.addChild(root_0, string_literal179_tree);
            	    }
            	    string_literal180=(Token)match(input,111,FOLLOW_111_in_meta_block4451); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal180_tree = (Object)adaptor.create(string_literal180);
            	    adaptor.addChild(root_0, string_literal180_tree);
            	    }
            	    pushFollow(FOLLOW_must_be_in_meta_block4453);
            	    must_be181=must_be("user");

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, must_be181.getTree());
            	    if ( state.backtracking==0 ) {
            	        
            	      		HashMap tmp = new HashMap(); 
            	      		tmp.put("level","user");
            	      		tmp.put("type","required");
            	      		meta_block_hash.put("authz",tmp);
            	      	   
            	    }

            	    }
            	    break;
            	case 4 :
            	    // RuleSet2.g:1751:4: 'logging' onoff= ( 'on' | 'off' )
            	    {
            	    string_literal182=(Token)match(input,112,FOLLOW_112_in_meta_block4462); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal182_tree = (Object)adaptor.create(string_literal182);
            	    adaptor.addChild(root_0, string_literal182_tree);
            	    }
            	    onoff=(Token)input.LT(1);
            	    if ( input.LA(1)==59||input.LA(1)==113 ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(onoff));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    if ( state.backtracking==0 ) {
            	        meta_block_hash.put("logging",(onoff!=null?onoff.getText():null)); 
            	    }

            	    }
            	    break;
            	case 5 :
            	    // RuleSet2.g:1752:4: 'use' ( (rtype= ( 'css' | 'javascript' ) must_be[\"resource\"] (url= STRING | nicename= VAR ) ) | ( 'module' modname= VAR ( 'alias' alias= VAR )? ) )
            	    {
            	    string_literal183=(Token)match(input,114,FOLLOW_114_in_meta_block4477); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal183_tree = (Object)adaptor.create(string_literal183);
            	    adaptor.addChild(root_0, string_literal183_tree);
            	    }
            	    // RuleSet2.g:1752:10: ( (rtype= ( 'css' | 'javascript' ) must_be[\"resource\"] (url= STRING | nicename= VAR ) ) | ( 'module' modname= VAR ( 'alias' alias= VAR )? ) )
            	    int alt107=2;
            	    int LA107_0 = input.LA(1);

            	    if ( (LA107_0==105||LA107_0==115) ) {
            	        alt107=1;
            	    }
            	    else if ( (LA107_0==116) ) {
            	        alt107=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 107, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt107) {
            	        case 1 :
            	            // RuleSet2.g:1752:12: (rtype= ( 'css' | 'javascript' ) must_be[\"resource\"] (url= STRING | nicename= VAR ) )
            	            {
            	            // RuleSet2.g:1752:12: (rtype= ( 'css' | 'javascript' ) must_be[\"resource\"] (url= STRING | nicename= VAR ) )
            	            // RuleSet2.g:1752:13: rtype= ( 'css' | 'javascript' ) must_be[\"resource\"] (url= STRING | nicename= VAR )
            	            {
            	            rtype=(Token)input.LT(1);
            	            if ( input.LA(1)==105||input.LA(1)==115 ) {
            	                input.consume();
            	                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(rtype));
            	                state.errorRecovery=false;state.failed=false;
            	            }
            	            else {
            	                if (state.backtracking>0) {state.failed=true; return retval;}
            	                MismatchedSetException mse = new MismatchedSetException(null,input);
            	                throw mse;
            	            }

            	            pushFollow(FOLLOW_must_be_in_meta_block4490);
            	            must_be184=must_be("resource");

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, must_be184.getTree());
            	            // RuleSet2.g:1752:60: (url= STRING | nicename= VAR )
            	            int alt105=2;
            	            int LA105_0 = input.LA(1);

            	            if ( (LA105_0==STRING) ) {
            	                alt105=1;
            	            }
            	            else if ( (LA105_0==VAR) ) {
            	                alt105=2;
            	            }
            	            else {
            	                if (state.backtracking>0) {state.failed=true; return retval;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 105, 0, input);

            	                throw nvae;
            	            }
            	            switch (alt105) {
            	                case 1 :
            	                    // RuleSet2.g:1752:61: url= STRING
            	                    {
            	                    url=(Token)match(input,STRING,FOLLOW_STRING_in_meta_block4496); if (state.failed) return retval;
            	                    if ( state.backtracking==0 ) {
            	                    url_tree = (Object)adaptor.create(url);
            	                    adaptor.addChild(root_0, url_tree);
            	                    }

            	                    }
            	                    break;
            	                case 2 :
            	                    // RuleSet2.g:1752:74: nicename= VAR
            	                    {
            	                    nicename=(Token)match(input,VAR,FOLLOW_VAR_in_meta_block4502); if (state.failed) return retval;
            	                    if ( state.backtracking==0 ) {
            	                    nicename_tree = (Object)adaptor.create(nicename);
            	                    adaptor.addChild(root_0, nicename_tree);
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
            	              			tmp2.put("location",(nicename!=null?nicename.getText():null));
            	              			tmp2.put("type","name");			
            	              		} 
            	              		tmp.put("resource",tmp2);
            	              		
            	              		tmp.put("name",(name!=null?input.toString(name.start,name.stop):null));
            	              		tmp.put("resource_type",(rtype!=null?rtype.getText():null));
            	              		use_list.add(tmp);
            	              	 
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // RuleSet2.g:1771:6: ( 'module' modname= VAR ( 'alias' alias= VAR )? )
            	            {
            	            // RuleSet2.g:1771:6: ( 'module' modname= VAR ( 'alias' alias= VAR )? )
            	            // RuleSet2.g:1771:7: 'module' modname= VAR ( 'alias' alias= VAR )?
            	            {
            	            string_literal185=(Token)match(input,116,FOLLOW_116_in_meta_block4517); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal185_tree = (Object)adaptor.create(string_literal185);
            	            adaptor.addChild(root_0, string_literal185_tree);
            	            }
            	            modname=(Token)match(input,VAR,FOLLOW_VAR_in_meta_block4522); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            modname_tree = (Object)adaptor.create(modname);
            	            adaptor.addChild(root_0, modname_tree);
            	            }
            	            // RuleSet2.g:1771:29: ( 'alias' alias= VAR )?
            	            int alt106=2;
            	            int LA106_0 = input.LA(1);

            	            if ( (LA106_0==117) ) {
            	                alt106=1;
            	            }
            	            switch (alt106) {
            	                case 1 :
            	                    // RuleSet2.g:1771:30: 'alias' alias= VAR
            	                    {
            	                    string_literal186=(Token)match(input,117,FOLLOW_117_in_meta_block4525); if (state.failed) return retval;
            	                    if ( state.backtracking==0 ) {
            	                    string_literal186_tree = (Object)adaptor.create(string_literal186);
            	                    adaptor.addChild(root_0, string_literal186_tree);
            	                    }
            	                    alias=(Token)match(input,VAR,FOLLOW_VAR_in_meta_block4529); if (state.failed) return retval;
            	                    if ( state.backtracking==0 ) {
            	                    alias_tree = (Object)adaptor.create(alias);
            	                    adaptor.addChild(root_0, alias_tree);
            	                    }

            	                    }
            	                    break;

            	            }


            	            }

            	            if ( state.backtracking==0 ) {

            	              		HashMap tmp = new HashMap(); 
            	              		tmp.put("name",(modname!=null?modname.getText():null));
            	              		tmp.put("type","module");
            	              		if((alias!=null?alias.getText():null) != null) {
            	              			tmp.put("alias",(alias!=null?alias.getText():null));
            	              		}
            	              		use_list.add(tmp);
            	              	 
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop108;
                }
            } while (true);

            char_literal187=(Token)match(input,30,FOLLOW_30_in_meta_block4544); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal187_tree = (Object)adaptor.create(char_literal187);
            adaptor.addChild(root_0, char_literal187_tree);
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
    // RuleSet2.g:1786:1: dispatch_block : must_be[\"dispatch\"] '{' ( must_be[\"domain\"] domain= STRING ( '->' rsid= STRING )? )* '}' ;
    public final RuleSet2Parser.dispatch_block_return dispatch_block() throws RecognitionException {
        RuleSet2Parser.dispatch_block_return retval = new RuleSet2Parser.dispatch_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token domain=null;
        Token rsid=null;
        Token char_literal189=null;
        Token string_literal191=null;
        Token char_literal192=null;
        RuleSet2Parser.must_be_return must_be188 = null;

        RuleSet2Parser.must_be_return must_be190 = null;


        Object domain_tree=null;
        Object rsid_tree=null;
        Object char_literal189_tree=null;
        Object string_literal191_tree=null;
        Object char_literal192_tree=null;


        	 ArrayList dispatch_block_array = (ArrayList)rule_json.get("dispatch");

        try {
            // RuleSet2.g:1792:2: ( must_be[\"dispatch\"] '{' ( must_be[\"domain\"] domain= STRING ( '->' rsid= STRING )? )* '}' )
            // RuleSet2.g:1792:4: must_be[\"dispatch\"] '{' ( must_be[\"domain\"] domain= STRING ( '->' rsid= STRING )? )* '}'
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_must_be_in_dispatch_block4575);
            must_be188=must_be("dispatch");

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, must_be188.getTree());
            char_literal189=(Token)match(input,29,FOLLOW_29_in_dispatch_block4579); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal189_tree = (Object)adaptor.create(char_literal189);
            adaptor.addChild(root_0, char_literal189_tree);
            }
            // RuleSet2.g:1792:29: ( must_be[\"domain\"] domain= STRING ( '->' rsid= STRING )? )*
            loop110:
            do {
                int alt110=2;
                int LA110_0 = input.LA(1);

                if ( (LA110_0==VAR) ) {
                    alt110=1;
                }


                switch (alt110) {
            	case 1 :
            	    // RuleSet2.g:1792:30: must_be[\"domain\"] domain= STRING ( '->' rsid= STRING )?
            	    {
            	    pushFollow(FOLLOW_must_be_in_dispatch_block4582);
            	    must_be190=must_be("domain");

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, must_be190.getTree());
            	    domain=(Token)match(input,STRING,FOLLOW_STRING_in_dispatch_block4587); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    domain_tree = (Object)adaptor.create(domain);
            	    adaptor.addChild(root_0, domain_tree);
            	    }
            	    // RuleSet2.g:1792:62: ( '->' rsid= STRING )?
            	    int alt109=2;
            	    int LA109_0 = input.LA(1);

            	    if ( (LA109_0==118) ) {
            	        alt109=1;
            	    }
            	    switch (alt109) {
            	        case 1 :
            	            // RuleSet2.g:1792:63: '->' rsid= STRING
            	            {
            	            string_literal191=(Token)match(input,118,FOLLOW_118_in_dispatch_block4590); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal191_tree = (Object)adaptor.create(string_literal191);
            	            adaptor.addChild(root_0, string_literal191_tree);
            	            }
            	            rsid=(Token)match(input,STRING,FOLLOW_STRING_in_dispatch_block4594); if (state.failed) return retval;
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
            	    break loop110;
                }
            } while (true);

            char_literal192=(Token)match(input,30,FOLLOW_30_in_dispatch_block4604); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal192_tree = (Object)adaptor.create(char_literal192);
            adaptor.addChild(root_0, char_literal192_tree);
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
    // RuleSet2.g:1806:1: name_value_pair[HashMap key_values] : k= STRING ':' (v= INT | v= FLOAT | v= STRING ) ;
    public final RuleSet2Parser.name_value_pair_return name_value_pair(HashMap key_values) throws RecognitionException {
        RuleSet2Parser.name_value_pair_return retval = new RuleSet2Parser.name_value_pair_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token k=null;
        Token v=null;
        Token char_literal193=null;

        Object k_tree=null;
        Object v_tree=null;
        Object char_literal193_tree=null;


        	Object value = null;

        try {
            // RuleSet2.g:1810:2: (k= STRING ':' (v= INT | v= FLOAT | v= STRING ) )
            // RuleSet2.g:1810:4: k= STRING ':' (v= INT | v= FLOAT | v= STRING )
            {
            root_0 = (Object)adaptor.nil();

            k=(Token)match(input,STRING,FOLLOW_STRING_in_name_value_pair4627); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            k_tree = (Object)adaptor.create(k);
            adaptor.addChild(root_0, k_tree);
            }
            char_literal193=(Token)match(input,37,FOLLOW_37_in_name_value_pair4629); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal193_tree = (Object)adaptor.create(char_literal193);
            adaptor.addChild(root_0, char_literal193_tree);
            }
            // RuleSet2.g:1810:17: (v= INT | v= FLOAT | v= STRING )
            int alt111=3;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt111=1;
                }
                break;
            case FLOAT:
                {
                alt111=2;
                }
                break;
            case STRING:
                {
                alt111=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 111, 0, input);

                throw nvae;
            }

            switch (alt111) {
                case 1 :
                    // RuleSet2.g:1811:3: v= INT
                    {
                    v=(Token)match(input,INT,FOLLOW_INT_in_name_value_pair4637); if (state.failed) return retval;
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
                    // RuleSet2.g:1812:5: v= FLOAT
                    {
                    v=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_name_value_pair4648); if (state.failed) return retval;
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
                    // RuleSet2.g:1813:5: v= STRING
                    {
                    v=(Token)match(input,STRING,FOLLOW_STRING_in_name_value_pair4659); if (state.failed) return retval;
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

    // $ANTLR start synpred19_RuleSet2
    public final void synpred19_RuleSet2_fragment() throws RecognitionException {   
        // RuleSet2.g:330:131: ( ';' )
        // RuleSet2.g:330:131: ';'
        {
        match(input,31,FOLLOW_31_in_synpred19_RuleSet21062); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred19_RuleSet2

    // $ANTLR start synpred20_RuleSet2
    public final void synpred20_RuleSet2_fragment() throws RecognitionException {   
        RuleSet2Parser.emit_block_return eb = null;


        // RuleSet2.g:330:138: (eb= emit_block )
        // RuleSet2.g:330:138: eb= emit_block
        {
        pushFollow(FOLLOW_emit_block_in_synpred20_RuleSet21067);
        eb=emit_block();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred20_RuleSet2

    // $ANTLR start synpred23_RuleSet2
    public final void synpred23_RuleSet2_fragment() throws RecognitionException {   
        // RuleSet2.g:330:195: ( ';' )
        // RuleSet2.g:330:195: ';'
        {
        match(input,31,FOLLOW_31_in_synpred23_RuleSet21083); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred23_RuleSet2

    // $ANTLR start synpred32_RuleSet2
    public final void synpred32_RuleSet2_fragment() throws RecognitionException {   
        RuleSet2Parser.persistent_expr_return pe = null;


        // RuleSet2.g:409:6: (pe= persistent_expr )
        // RuleSet2.g:409:6: pe= persistent_expr
        {
        pushFollow(FOLLOW_persistent_expr_in_synpred32_RuleSet21237);
        pe=persistent_expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred32_RuleSet2

    // $ANTLR start synpred34_RuleSet2
    public final void synpred34_RuleSet2_fragment() throws RecognitionException {   
        RuleSet2Parser.log_statement_return l = null;


        // RuleSet2.g:411:4: (l= log_statement )
        // RuleSet2.g:411:4: l= log_statement
        {
        pushFollow(FOLLOW_log_statement_in_synpred34_RuleSet21254);
        l=log_statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred34_RuleSet2

    // $ANTLR start synpred51_RuleSet2
    public final void synpred51_RuleSet2_fragment() throws RecognitionException {   
        // RuleSet2.g:642:62: ( ';' )
        // RuleSet2.g:642:62: ';'
        {
        match(input,31,FOLLOW_31_in_synpred51_RuleSet21893); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred51_RuleSet2

    // $ANTLR start synpred52_RuleSet2
    public final void synpred52_RuleSet2_fragment() throws RecognitionException {   
        RuleSet2Parser.expr_return e = null;


        // RuleSet2.g:647:10: (e= expr )
        // RuleSet2.g:647:10: e= expr
        {
        pushFollow(FOLLOW_expr_in_synpred52_RuleSet21914);
        e=expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred52_RuleSet2

    // $ANTLR start synpred73_RuleSet2
    public final void synpred73_RuleSet2_fragment() throws RecognitionException {   
        RuleSet2Parser.must_be_one_return tb = null;

        RuleSet2Parser.event_or_return eor2 = null;


        // RuleSet2.g:822:17: (tb= must_be_one[sar(\"then\",\"before\")] eor2= event_or )
        // RuleSet2.g:822:17: tb= must_be_one[sar(\"then\",\"before\")] eor2= event_or
        {
        pushFollow(FOLLOW_must_be_one_in_synpred73_RuleSet22433);
        tb=must_be_one(sar("then","before"));

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_event_or_in_synpred73_RuleSet22438);
        eor2=event_or();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred73_RuleSet2

    // $ANTLR start synpred118_RuleSet2
    public final void synpred118_RuleSet2_fragment() throws RecognitionException {   
        RuleSet2Parser.timeframe_return t = null;


        // RuleSet2.g:1378:60: (t= timeframe )
        // RuleSet2.g:1378:60: t= timeframe
        {
        pushFollow(FOLLOW_timeframe_in_synpred118_RuleSet23442);
        t=timeframe();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred118_RuleSet2

    // $ANTLR start synpred119_RuleSet2
    public final void synpred119_RuleSet2_fragment() throws RecognitionException {   
        Token rx=null;
        Token v=null;
        RuleSet2Parser.var_domain_return vd = null;

        RuleSet2Parser.timeframe_return t = null;


        // RuleSet2.g:1378:4: ( 'seen' rx= STRING must_be[\"in\"] vd= var_domain ':' v= VAR (t= timeframe )? )
        // RuleSet2.g:1378:4: 'seen' rx= STRING must_be[\"in\"] vd= var_domain ':' v= VAR (t= timeframe )?
        {
        match(input,73,FOLLOW_73_in_synpred119_RuleSet23421); if (state.failed) return ;
        rx=(Token)match(input,STRING,FOLLOW_STRING_in_synpred119_RuleSet23425); if (state.failed) return ;
        pushFollow(FOLLOW_must_be_in_synpred119_RuleSet23427);
        must_be("in");

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_var_domain_in_synpred119_RuleSet23432);
        vd=var_domain();

        state._fsp--;
        if (state.failed) return ;
        match(input,37,FOLLOW_37_in_synpred119_RuleSet23434); if (state.failed) return ;
        v=(Token)match(input,VAR,FOLLOW_VAR_in_synpred119_RuleSet23438); if (state.failed) return ;
        // RuleSet2.g:1378:60: (t= timeframe )?
        int alt132=2;
        int LA132_0 = input.LA(1);

        if ( (LA132_0==104) ) {
            alt132=1;
        }
        switch (alt132) {
            case 1 :
                // RuleSet2.g:0:0: t= timeframe
                {
                pushFollow(FOLLOW_timeframe_in_synpred119_RuleSet23442);
                t=timeframe();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred119_RuleSet2

    // $ANTLR start synpred120_RuleSet2
    public final void synpred120_RuleSet2_fragment() throws RecognitionException {   
        Token rx_1=null;
        Token rx_2=null;
        Token v=null;
        RuleSet2Parser.must_be_one_return op = null;

        RuleSet2Parser.var_domain_return vd = null;


        // RuleSet2.g:1389:4: ( 'seen' rx_1= STRING op= must_be_one[sar(\"before\",\"after\")] rx_2= STRING must_be[\"in\"] vd= var_domain ':' v= VAR )
        // RuleSet2.g:1389:4: 'seen' rx_1= STRING op= must_be_one[sar(\"before\",\"after\")] rx_2= STRING must_be[\"in\"] vd= var_domain ':' v= VAR
        {
        match(input,73,FOLLOW_73_in_synpred120_RuleSet23450); if (state.failed) return ;
        rx_1=(Token)match(input,STRING,FOLLOW_STRING_in_synpred120_RuleSet23454); if (state.failed) return ;
        pushFollow(FOLLOW_must_be_one_in_synpred120_RuleSet23458);
        op=must_be_one(sar("before","after"));

        state._fsp--;
        if (state.failed) return ;
        rx_2=(Token)match(input,STRING,FOLLOW_STRING_in_synpred120_RuleSet23463); if (state.failed) return ;
        pushFollow(FOLLOW_must_be_in_synpred120_RuleSet23466);
        must_be("in");

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_var_domain_in_synpred120_RuleSet23471);
        vd=var_domain();

        state._fsp--;
        if (state.failed) return ;
        match(input,37,FOLLOW_37_in_synpred120_RuleSet23473); if (state.failed) return ;
        v=(Token)match(input,VAR,FOLLOW_VAR_in_synpred120_RuleSet23477); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred120_RuleSet2

    // $ANTLR start synpred121_RuleSet2
    public final void synpred121_RuleSet2_fragment() throws RecognitionException {   
        Token v=null;
        RuleSet2Parser.var_domain_return vd = null;

        RuleSet2Parser.predop_return pop = null;

        RuleSet2Parser.expr_return e = null;

        RuleSet2Parser.timeframe_return t = null;


        // RuleSet2.g:1399:4: (vd= var_domain ':' v= VAR pop= predop e= expr t= timeframe )
        // RuleSet2.g:1399:4: vd= var_domain ':' v= VAR pop= predop e= expr t= timeframe
        {
        pushFollow(FOLLOW_var_domain_in_synpred121_RuleSet23486);
        vd=var_domain();

        state._fsp--;
        if (state.failed) return ;
        match(input,37,FOLLOW_37_in_synpred121_RuleSet23488); if (state.failed) return ;
        v=(Token)match(input,VAR,FOLLOW_VAR_in_synpred121_RuleSet23492); if (state.failed) return ;
        pushFollow(FOLLOW_predop_in_synpred121_RuleSet23496);
        pop=predop();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred121_RuleSet23500);
        e=expr();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_timeframe_in_synpred121_RuleSet23504);
        t=timeframe();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred121_RuleSet2

    // $ANTLR start synpred122_RuleSet2
    public final void synpred122_RuleSet2_fragment() throws RecognitionException {   
        Token v=null;
        RuleSet2Parser.var_domain_return vd = null;

        RuleSet2Parser.timeframe_return t = null;


        // RuleSet2.g:1411:4: (vd= var_domain ':' v= VAR t= timeframe )
        // RuleSet2.g:1411:4: vd= var_domain ':' v= VAR t= timeframe
        {
        pushFollow(FOLLOW_var_domain_in_synpred122_RuleSet23514);
        vd=var_domain();

        state._fsp--;
        if (state.failed) return ;
        match(input,37,FOLLOW_37_in_synpred122_RuleSet23516); if (state.failed) return ;
        v=(Token)match(input,VAR,FOLLOW_VAR_in_synpred122_RuleSet23520); if (state.failed) return ;
        pushFollow(FOLLOW_timeframe_in_synpred122_RuleSet23524);
        t=timeframe();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred122_RuleSet2

    // $ANTLR start synpred152_RuleSet2
    public final void synpred152_RuleSet2_fragment() throws RecognitionException {   
        Token bv=null;
        RuleSet2Parser.expr_return e = null;


        // RuleSet2.g:1517:9: (bv= VAR '[' e= expr ']' )
        // RuleSet2.g:1517:9: bv= VAR '[' e= expr ']'
        {
        bv=(Token)match(input,VAR,FOLLOW_VAR_in_synpred152_RuleSet23822); if (state.failed) return ;
        match(input,98,FOLLOW_98_in_synpred152_RuleSet23824); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred152_RuleSet23828);
        e=expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,99,FOLLOW_99_in_synpred152_RuleSet23830); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred152_RuleSet2

    // $ANTLR start synpred158_RuleSet2
    public final void synpred158_RuleSet2_fragment() throws RecognitionException {   
        Token p=null;
        RuleSet2Parser.namespace_return n = null;

        RuleSet2Parser.expr_return e = null;


        // RuleSet2.g:1555:9: (n= namespace p= VAR '(' (e= expr ( ',' )? )* ')' )
        // RuleSet2.g:1555:9: n= namespace p= VAR '(' (e= expr ( ',' )? )* ')'
        {
        pushFollow(FOLLOW_namespace_in_synpred158_RuleSet23914);
        n=namespace();

        state._fsp--;
        if (state.failed) return ;
        p=(Token)match(input,VAR,FOLLOW_VAR_in_synpred158_RuleSet23918); if (state.failed) return ;
        match(input,45,FOLLOW_45_in_synpred158_RuleSet23920); if (state.failed) return ;
        // RuleSet2.g:1555:31: (e= expr ( ',' )? )*
        loop136:
        do {
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( ((LA136_0>=VAR && LA136_0<=INT)||LA136_0==FLOAT||(LA136_0>=STRING && LA136_0<=REGEXP)||LA136_0==29||LA136_0==45||LA136_0==55||LA136_0==66||LA136_0==73||(LA136_0>=96 && LA136_0<=98)||(LA136_0>=100 && LA136_0<=103)) ) {
                alt136=1;
            }


            switch (alt136) {
        	case 1 :
        	    // RuleSet2.g:1555:32: e= expr ( ',' )?
        	    {
        	    pushFollow(FOLLOW_expr_in_synpred158_RuleSet23925);
        	    e=expr();

        	    state._fsp--;
        	    if (state.failed) return ;
        	    // RuleSet2.g:1558:8: ( ',' )?
        	    int alt135=2;
        	    int LA135_0 = input.LA(1);

        	    if ( (LA135_0==46) ) {
        	        alt135=1;
        	    }
        	    switch (alt135) {
        	        case 1 :
        	            // RuleSet2.g:0:0: ','
        	            {
        	            match(input,46,FOLLOW_46_in_synpred158_RuleSet23936); if (state.failed) return ;

        	            }
        	            break;

        	    }


        	    }
        	    break;

        	default :
        	    break loop136;
            }
        } while (true);

        match(input,47,FOLLOW_47_in_synpred158_RuleSet23941); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred158_RuleSet2

    // $ANTLR start synpred161_RuleSet2
    public final void synpred161_RuleSet2_fragment() throws RecognitionException {   
        Token v=null;
        RuleSet2Parser.expr_return e = null;


        // RuleSet2.g:1566:9: (v= VAR '(' (e= expr ( ',' )? )* ')' )
        // RuleSet2.g:1566:9: v= VAR '(' (e= expr ( ',' )? )* ')'
        {
        v=(Token)match(input,VAR,FOLLOW_VAR_in_synpred161_RuleSet23956); if (state.failed) return ;
        match(input,45,FOLLOW_45_in_synpred161_RuleSet23958); if (state.failed) return ;
        // RuleSet2.g:1566:19: (e= expr ( ',' )? )*
        loop139:
        do {
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( ((LA139_0>=VAR && LA139_0<=INT)||LA139_0==FLOAT||(LA139_0>=STRING && LA139_0<=REGEXP)||LA139_0==29||LA139_0==45||LA139_0==55||LA139_0==66||LA139_0==73||(LA139_0>=96 && LA139_0<=98)||(LA139_0>=100 && LA139_0<=103)) ) {
                alt139=1;
            }


            switch (alt139) {
        	case 1 :
        	    // RuleSet2.g:1566:20: e= expr ( ',' )?
        	    {
        	    pushFollow(FOLLOW_expr_in_synpred161_RuleSet23963);
        	    e=expr();

        	    state._fsp--;
        	    if (state.failed) return ;
        	    // RuleSet2.g:1569:2: ( ',' )?
        	    int alt138=2;
        	    int LA138_0 = input.LA(1);

        	    if ( (LA138_0==46) ) {
        	        alt138=1;
        	    }
        	    switch (alt138) {
        	        case 1 :
        	            // RuleSet2.g:0:0: ','
        	            {
        	            match(input,46,FOLLOW_46_in_synpred161_RuleSet23967); if (state.failed) return ;

        	            }
        	            break;

        	    }


        	    }
        	    break;

        	default :
        	    break loop139;
            }
        } while (true);

        match(input,47,FOLLOW_47_in_synpred161_RuleSet23972); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred161_RuleSet2

    // $ANTLR start synpred168_RuleSet2
    public final void synpred168_RuleSet2_fragment() throws RecognitionException {   
        Token v=null;

        // RuleSet2.g:1602:9: (v= VAR )
        // RuleSet2.g:1602:9: v= VAR
        {
        v=(Token)match(input,VAR,FOLLOW_VAR_in_synpred168_RuleSet24055); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred168_RuleSet2

    // Delegated rules

    public final boolean synpred152_RuleSet2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred152_RuleSet2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred168_RuleSet2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred168_RuleSet2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred51_RuleSet2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred51_RuleSet2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_RuleSet2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_RuleSet2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_RuleSet2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_RuleSet2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred73_RuleSet2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred73_RuleSet2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_RuleSet2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_RuleSet2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred120_RuleSet2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred120_RuleSet2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred121_RuleSet2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred121_RuleSet2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred161_RuleSet2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred161_RuleSet2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred122_RuleSet2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred122_RuleSet2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred119_RuleSet2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred119_RuleSet2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred118_RuleSet2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred118_RuleSet2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred52_RuleSet2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred52_RuleSet2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_RuleSet2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_RuleSet2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred158_RuleSet2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred158_RuleSet2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_RuleSet2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_RuleSet2_fragment(); // can never throw exception
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
    protected DFA53 dfa53 = new DFA53(this);
    protected DFA86 dfa86 = new DFA86(this);
    protected DFA85 dfa85 = new DFA85(this);
    protected DFA98 dfa98 = new DFA98(this);
    static final String DFA18_eotS =
        "\12\uffff";
    static final String DFA18_eofS =
        "\1\uffff\1\5\2\uffff\1\6\5\uffff";
    static final String DFA18_minS =
        "\2\4\1\uffff\1\45\1\4\2\uffff\1\4\1\uffff\1\0";
    static final String DFA18_maxS =
        "\2\147\1\uffff\1\45\1\142\2\uffff\1\4\1\uffff\1\0";
    static final String DFA18_acceptS =
        "\2\uffff\1\1\2\uffff\1\4\1\3\1\uffff\1\2\1\uffff";
    static final String DFA18_specialS =
        "\11\uffff\1\0}>";
    static final String[] DFA18_transitionS = {
            "\1\1\41\uffff\2\2\76\uffff\2\2",
            "\1\4\1\6\1\uffff\1\6\3\uffff\2\6\20\uffff\1\6\3\5\14\uffff"+
            "\1\6\11\uffff\1\6\12\uffff\1\6\6\uffff\1\6\26\uffff\3\6\1\uffff"+
            "\2\6\2\3",
            "",
            "\1\7",
            "\1\10\15\uffff\13\6\1\uffff\3\6\4\uffff\1\6\6\uffff\2\6\26"+
            "\uffff\5\6\1\uffff\26\6\2\uffff\1\6",
            "",
            "",
            "\1\11",
            "",
            "\1\uffff"
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
            return "409:5: (pe= persistent_expr | rs= raise_statement | l= log_statement | las= must_be[\"last\"] )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_9 = input.LA(1);

                         
                        int index18_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_RuleSet2()) ) {s = 2;}

                        else if ( (synpred34_RuleSet2()) ) {s = 6;}

                         
                        input.seek(index18_9);
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
    static final String DFA53_eotS =
        "\13\uffff";
    static final String DFA53_eofS =
        "\13\uffff";
    static final String DFA53_minS =
        "\1\4\5\uffff\1\0\4\uffff";
    static final String DFA53_maxS =
        "\1\153\5\uffff\1\0\4\uffff";
    static final String DFA53_acceptS =
        "\1\uffff\1\2\10\uffff\1\1";
    static final String DFA53_specialS =
        "\6\uffff\1\0\4\uffff}>";
    static final String[] DFA53_transitionS = {
            "\1\6\30\uffff\1\1\1\uffff\2\1\15\uffff\2\1\3\uffff\2\1\66\uffff"+
            "\1\1",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA53_eot = DFA.unpackEncodedString(DFA53_eotS);
    static final short[] DFA53_eof = DFA.unpackEncodedString(DFA53_eofS);
    static final char[] DFA53_min = DFA.unpackEncodedStringToUnsignedChars(DFA53_minS);
    static final char[] DFA53_max = DFA.unpackEncodedStringToUnsignedChars(DFA53_maxS);
    static final short[] DFA53_accept = DFA.unpackEncodedString(DFA53_acceptS);
    static final short[] DFA53_special = DFA.unpackEncodedString(DFA53_specialS);
    static final short[][] DFA53_transition;

    static {
        int numStates = DFA53_transitionS.length;
        DFA53_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA53_transition[i] = DFA.unpackEncodedString(DFA53_transitionS[i]);
        }
    }

    class DFA53 extends DFA {

        public DFA53(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 53;
            this.eot = DFA53_eot;
            this.eof = DFA53_eof;
            this.min = DFA53_min;
            this.max = DFA53_max;
            this.accept = DFA53_accept;
            this.special = DFA53_special;
            this.transition = DFA53_transition;
        }
        public String getDescription() {
            return "()* loopback of 822:16: (tb= must_be_one[sar(\"then\",\"before\")] eor2= event_or )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA53_6 = input.LA(1);

                         
                        int index53_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred73_RuleSet2()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index53_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 53, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA86_eotS =
        "\23\uffff";
    static final String DFA86_eofS =
        "\23\uffff";
    static final String DFA86_minS =
        "\1\4\1\uffff\2\0\17\uffff";
    static final String DFA86_maxS =
        "\1\147\1\uffff\2\0\17\uffff";
    static final String DFA86_acceptS =
        "\1\uffff\1\1\2\uffff\1\6\12\uffff\1\2\1\3\1\4\1\5";
    static final String DFA86_specialS =
        "\2\uffff\1\0\1\1\17\uffff}>";
    static final String[] DFA86_transitionS = {
            "\2\4\1\uffff\1\4\3\uffff\2\4\20\uffff\1\4\17\uffff\1\4\11\uffff"+
            "\1\1\21\uffff\1\2\26\uffff\3\4\1\uffff\2\4\2\3",
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

    static final short[] DFA86_eot = DFA.unpackEncodedString(DFA86_eotS);
    static final short[] DFA86_eof = DFA.unpackEncodedString(DFA86_eofS);
    static final char[] DFA86_min = DFA.unpackEncodedStringToUnsignedChars(DFA86_minS);
    static final char[] DFA86_max = DFA.unpackEncodedStringToUnsignedChars(DFA86_maxS);
    static final short[] DFA86_accept = DFA.unpackEncodedString(DFA86_acceptS);
    static final short[] DFA86_special = DFA.unpackEncodedString(DFA86_specialS);
    static final short[][] DFA86_transition;

    static {
        int numStates = DFA86_transitionS.length;
        DFA86_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA86_transition[i] = DFA.unpackEncodedString(DFA86_transitionS[i]);
        }
    }

    class DFA86 extends DFA {

        public DFA86(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 86;
            this.eot = DFA86_eot;
            this.eof = DFA86_eof;
            this.min = DFA86_min;
            this.max = DFA86_max;
            this.accept = DFA86_accept;
            this.special = DFA86_special;
            this.transition = DFA86_transition;
        }
        public String getDescription() {
            return "1373:1: unary_expr returns [Object result] options {backtrack=true; } : ( 'not' unary_expr | 'seen' rx= STRING must_be[\"in\"] vd= var_domain ':' v= VAR (t= timeframe )? | 'seen' rx_1= STRING op= must_be_one[sar(\"before\",\"after\")] rx_2= STRING must_be[\"in\"] vd= var_domain ':' v= VAR | vd= var_domain ':' v= VAR pop= predop e= expr t= timeframe | vd= var_domain ':' v= VAR t= timeframe | oe= operator_expr );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA86_2 = input.LA(1);

                         
                        int index86_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred119_RuleSet2()) ) {s = 15;}

                        else if ( (synpred120_RuleSet2()) ) {s = 16;}

                         
                        input.seek(index86_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA86_3 = input.LA(1);

                         
                        int index86_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred121_RuleSet2()) ) {s = 17;}

                        else if ( (synpred122_RuleSet2()) ) {s = 18;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index86_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 86, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA85_eotS =
        "\45\uffff";
    static final String DFA85_eofS =
        "\1\2\44\uffff";
    static final String DFA85_minS =
        "\1\4\1\0\43\uffff";
    static final String DFA85_maxS =
        "\1\153\1\0\43\uffff";
    static final String DFA85_acceptS =
        "\2\uffff\1\2\41\uffff\1\1";
    static final String DFA85_specialS =
        "\1\uffff\1\0\43\uffff}>";
    static final String[] DFA85_transitionS = {
            "\2\2\1\uffff\1\2\3\uffff\2\2\5\uffff\20\2\12\uffff\5\2\1\uffff"+
            "\1\2\4\uffff\1\2\12\uffff\10\2\26\uffff\10\2\1\1\1\2\1\uffff"+
            "\1\2",
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
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA85_eot = DFA.unpackEncodedString(DFA85_eotS);
    static final short[] DFA85_eof = DFA.unpackEncodedString(DFA85_eofS);
    static final char[] DFA85_min = DFA.unpackEncodedStringToUnsignedChars(DFA85_minS);
    static final char[] DFA85_max = DFA.unpackEncodedStringToUnsignedChars(DFA85_maxS);
    static final short[] DFA85_accept = DFA.unpackEncodedString(DFA85_acceptS);
    static final short[] DFA85_special = DFA.unpackEncodedString(DFA85_specialS);
    static final short[][] DFA85_transition;

    static {
        int numStates = DFA85_transitionS.length;
        DFA85_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA85_transition[i] = DFA.unpackEncodedString(DFA85_transitionS[i]);
        }
    }

    class DFA85 extends DFA {

        public DFA85(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 85;
            this.eot = DFA85_eot;
            this.eof = DFA85_eof;
            this.min = DFA85_min;
            this.max = DFA85_max;
            this.accept = DFA85_accept;
            this.special = DFA85_special;
            this.transition = DFA85_transition;
        }
        public String getDescription() {
            return "1378:60: (t= timeframe )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA85_1 = input.LA(1);

                         
                        int index85_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred118_RuleSet2()) ) {s = 36;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index85_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 85, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA98_eotS =
        "\21\uffff";
    static final String DFA98_eofS =
        "\21\uffff";
    static final String DFA98_minS =
        "\1\4\4\uffff\1\0\13\uffff";
    static final String DFA98_maxS =
        "\1\147\4\uffff\1\0\13\uffff";
    static final String DFA98_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\6\1\7\1\10\1\13\1\14\1\16\1\17"+
        "\1\5\1\11\1\12\1\15";
    static final String DFA98_specialS =
        "\5\uffff\1\0\13\uffff}>";
    static final String[] DFA98_transitionS = {
            "\1\5\1\1\1\uffff\1\3\3\uffff\1\2\1\14\20\uffff\1\12\17\uffff"+
            "\1\13\62\uffff\2\4\1\11\1\uffff\1\7\1\10\2\6",
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
            "",
            "",
            ""
    };

    static final short[] DFA98_eot = DFA.unpackEncodedString(DFA98_eotS);
    static final short[] DFA98_eof = DFA.unpackEncodedString(DFA98_eofS);
    static final char[] DFA98_min = DFA.unpackEncodedStringToUnsignedChars(DFA98_minS);
    static final char[] DFA98_max = DFA.unpackEncodedStringToUnsignedChars(DFA98_maxS);
    static final short[] DFA98_accept = DFA.unpackEncodedString(DFA98_acceptS);
    static final short[] DFA98_special = DFA.unpackEncodedString(DFA98_specialS);
    static final short[][] DFA98_transition;

    static {
        int numStates = DFA98_transitionS.length;
        DFA98_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA98_transition[i] = DFA.unpackEncodedString(DFA98_transitionS[i]);
        }
    }

    class DFA98 extends DFA {

        public DFA98(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 98;
            this.eot = DFA98_eot;
            this.eof = DFA98_eof;
            this.min = DFA98_min;
            this.max = DFA98_max;
            this.accept = DFA98_accept;
            this.special = DFA98_special;
            this.transition = DFA98_transition;
        }
        public String getDescription() {
            return "1488:1: factor returns [Object result] options {backtrack=true; } : (iv= INT | sv= STRING | fv= FLOAT | bv= ( 'true' | 'false' ) | bv= VAR '[' e= expr ']' | d= var_domain ':' vv= VAR | 'current' d= var_domain ':' v= VAR | 'history' e= expr d= var_domain ':' v= VAR | n= namespace p= VAR '(' (e= expr ( ',' )? )* ')' | v= VAR '(' (e= expr ( ',' )? )* ')' | '[' (e= expr ( ',' e2= expr )* )? ']' | '{' (h1= hash_line ( ',' h2= hash_line )* )? '}' | v= VAR | '(' e= expr ')' | vr= REGEXP );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA98_5 = input.LA(1);

                         
                        int index98_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred152_RuleSet2()) ) {s = 13;}

                        else if ( (synpred158_RuleSet2()) ) {s = 14;}

                        else if ( (synpred161_RuleSet2()) ) {s = 15;}

                        else if ( (synpred168_RuleSet2()) ) {s = 16;}

                         
                        input.seek(index98_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 98, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_set_in_predop0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_add_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_must_be_in_ruleset846 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rulesetname_in_ruleset852 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleset859 = new BitSet(new long[]{0x1000000040000010L,0x0000100000000000L});
    public static final BitSet FOLLOW_meta_block_in_ruleset866 = new BitSet(new long[]{0x1000000040000010L,0x0000100000000000L});
    public static final BitSet FOLLOW_dispatch_block_in_ruleset870 = new BitSet(new long[]{0x1000000040000010L,0x0000100000000000L});
    public static final BitSet FOLLOW_global_block_in_ruleset874 = new BitSet(new long[]{0x1000000040000010L,0x0000100000000000L});
    public static final BitSet FOLLOW_rule_in_ruleset878 = new BitSet(new long[]{0x1000000040000010L,0x0000100000000000L});
    public static final BitSet FOLLOW_30_in_ruleset884 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_ruleset888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_must_be911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_must_be_one936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_rulesetname0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_rule_name0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_must_be_in_rule995 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule_name_in_rule1002 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_must_be_in_rule1010 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_must_be_one_in_rule1020 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_rule1025 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_rule1035 = new BitSet(new long[]{0x0022000000000000L});
    public static final BitSet FOLLOW_using_in_rule1042 = new BitSet(new long[]{0x00180001A0000010L,0x0000080000000000L});
    public static final BitSet FOLLOW_when_in_rule1046 = new BitSet(new long[]{0x00180001A0000010L,0x0000080000000000L});
    public static final BitSet FOLLOW_foreach_in_rule1052 = new BitSet(new long[]{0x00180001A0000010L,0x0000080000000000L});
    public static final BitSet FOLLOW_pre_block_in_rule1059 = new BitSet(new long[]{0x00180001A0000010L,0x0000080000000000L});
    public static final BitSet FOLLOW_31_in_rule1062 = new BitSet(new long[]{0x00180001A0000010L,0x0000080000000000L});
    public static final BitSet FOLLOW_emit_block_in_rule1067 = new BitSet(new long[]{0x00180001A0000010L,0x0000080000000000L});
    public static final BitSet FOLLOW_31_in_rule1070 = new BitSet(new long[]{0x00180001A0000010L,0x0000080000000000L});
    public static final BitSet FOLLOW_action_in_rule1074 = new BitSet(new long[]{0x00000002C0000010L});
    public static final BitSet FOLLOW_callbacks_in_rule1080 = new BitSet(new long[]{0x00000000C0000010L});
    public static final BitSet FOLLOW_31_in_rule1083 = new BitSet(new long[]{0x00000000C0000010L});
    public static final BitSet FOLLOW_post_block_in_rule1088 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_31_in_rule1091 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_rule1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_must_be_one_in_post_block1127 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_post_block1130 = new BitSet(new long[]{0x000000C000000010L,0x000000C000000000L});
    public static final BitSet FOLLOW_post_statement_in_post_block1137 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_31_in_post_block1142 = new BitSet(new long[]{0x000000C000000010L,0x000000C000000000L});
    public static final BitSet FOLLOW_post_statement_in_post_block1146 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_31_in_post_block1154 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_post_block1157 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_post_alternate_in_post_block1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_must_be_in_post_alternate1191 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_post_alternate1194 = new BitSet(new long[]{0x000000C0C0000010L,0x000000C000000000L});
    public static final BitSet FOLLOW_post_statement_in_post_alternate1199 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_31_in_post_alternate1204 = new BitSet(new long[]{0x000000C000000010L,0x000000C000000000L});
    public static final BitSet FOLLOW_post_statement_in_post_alternate1208 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_31_in_post_alternate1216 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_post_alternate1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_persistent_expr_in_post_statement1237 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_raise_statement_in_post_statement1247 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_log_statement_in_post_statement1254 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_must_be_in_post_statement1264 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_post_statement1270 = new BitSet(new long[]{0x00802000200018B0L,0x000000F700000204L});
    public static final BitSet FOLLOW_expr_in_post_statement1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_must_be_in_raise_statement1299 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_must_be_in_raise_statement1302 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_must_be_in_raise_statement1305 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_raise_statement1311 = new BitSet(new long[]{0x0000090000000002L});
    public static final BitSet FOLLOW_for_clause_in_raise_statement1315 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_modifier_clause_in_raise_statement1320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_must_be_in_log_statement1340 = new BitSet(new long[]{0x00802000200018B0L,0x000000F700000204L});
    public static final BitSet FOLLOW_expr_in_log_statement1346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_callbacks1366 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_callbacks1368 = new BitSet(new long[]{0x0000000C40000000L});
    public static final BitSet FOLLOW_success_in_callbacks1372 = new BitSet(new long[]{0x0000000840000000L});
    public static final BitSet FOLLOW_failure_in_callbacks1377 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_callbacks1380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_success1403 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_success1405 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_click_in_success1409 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_31_in_success1415 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_click_in_success1419 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_31_in_success1426 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_success1430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_failure1456 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_failure1458 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_click_in_failure1462 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_31_in_failure1468 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_click_in_failure1472 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_31_in_failure1480 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_failure1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_must_be_one_in_click1502 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_click1507 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_click1509 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_click1513 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_click_link_in_click1517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_must_be_in_click_link1537 = new BitSet(new long[]{0x000000C000000010L,0x000000C000000000L});
    public static final BitSet FOLLOW_persistent_expr_in_click_link1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_persistent_clear_set_in_persistent_expr1564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_persistent_iterate_in_persistent_expr1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_trail_forget_in_persistent_expr1587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_trail_mark_in_persistent_expr1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_must_be_one_in_persistent_clear_set1625 = new BitSet(new long[]{0x0000000000000000L,0x000000C000000000L});
    public static final BitSet FOLLOW_var_domain_in_persistent_clear_set1631 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_persistent_clear_set1633 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_persistent_clear_set1637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_domain_in_persistent_iterate1658 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_persistent_iterate1660 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_persistent_iterate1664 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_counter_op_in_persistent_iterate1668 = new BitSet(new long[]{0x00802000200018B0L,0x000000F700000204L});
    public static final BitSet FOLLOW_expr_in_persistent_iterate1672 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_counter_start_in_persistent_iterate1676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_trail_forget1694 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_trail_forget1699 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_must_be_in_trail_forget1701 = new BitSet(new long[]{0x0000000000000000L,0x000000C000000000L});
    public static final BitSet FOLLOW_var_domain_in_trail_forget1707 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_trail_forget1709 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_trail_forget1713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_trail_mark1732 = new BitSet(new long[]{0x0000000000000000L,0x000000C000000000L});
    public static final BitSet FOLLOW_var_domain_in_trail_mark1736 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_trail_mark1738 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_trail_mark1742 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_trail_with_in_trail_mark1746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_trail_with1765 = new BitSet(new long[]{0x00802000200018B0L,0x000000F700000204L});
    public static final BitSet FOLLOW_expr_in_trail_with1769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_counter_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_must_be_in_counter_start1819 = new BitSet(new long[]{0x00802000200018B0L,0x000000F700000204L});
    public static final BitSet FOLLOW_expr_in_counter_start1824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_for_clause1845 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_for_clause1850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_action_in_action1884 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_unconditional_action_in_action1889 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_action1893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_conditional_action1910 = new BitSet(new long[]{0x00802000200018B0L,0x000000F700000204L});
    public static final BitSet FOLLOW_expr_in_conditional_action1914 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_must_be_in_conditional_action1917 = new BitSet(new long[]{0x00180001A0000010L,0x0000080000000000L});
    public static final BitSet FOLLOW_unconditional_action_in_conditional_action1920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primrule_in_unconditional_action1945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_action_block_in_unconditional_action1955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_must_be_one_in_action_block1981 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_action_block1991 = new BitSet(new long[]{0x0000000000000010L,0x0000080000000000L});
    public static final BitSet FOLLOW_primrule_in_action_block1996 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_31_in_action_block2006 = new BitSet(new long[]{0x0000000000000010L,0x0000080000000000L});
    public static final BitSet FOLLOW_primrule_in_action_block2010 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_31_in_action_block2017 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_action_block2020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_primrule2047 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_primrule2049 = new BitSet(new long[]{0x0000000000000010L,0x0000080000000000L});
    public static final BitSet FOLLOW_namespace_in_primrule2060 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_primrule2065 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_primrule2067 = new BitSet(new long[]{0x0080E000200018B0L,0x000000F700000204L});
    public static final BitSet FOLLOW_expr_in_primrule2072 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_46_in_primrule2077 = new BitSet(new long[]{0x00802000200018B0L,0x000000F700000204L});
    public static final BitSet FOLLOW_expr_in_primrule2081 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_46_in_primrule2089 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_primrule2093 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_modifier_clause_in_primrule2097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emit_block_in_primrule2107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_modifier_clause2141 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_modifier_in_modifier_clause2145 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_modifier_clause2150 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_modifier_in_modifier_clause2154 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_VAR_in_modifier2179 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_modifier2181 = new BitSet(new long[]{0x00802000200058B0L,0x000000F700000204L});
    public static final BitSet FOLLOW_expr_in_modifier2186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JS_in_modifier2192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_using2217 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_set_in_using2221 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_setting_in_using2229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_setting2250 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_setting2252 = new BitSet(new long[]{0x0000800000000010L});
    public static final BitSet FOLLOW_VAR_in_setting2257 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_46_in_setting2261 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_setting2265 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_47_in_setting2273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_pre_block2298 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_pre_block2300 = new BitSet(new long[]{0x00000000C0000010L});
    public static final BitSet FOLLOW_decl_in_pre_block2304 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_31_in_pre_block2308 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_decl_in_pre_block2310 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_31_in_pre_block2318 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_pre_block2321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_foreach2354 = new BitSet(new long[]{0x00802000200018B0L,0x000000F700000204L});
    public static final BitSet FOLLOW_expr_in_foreach2358 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_setting_in_foreach2362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_when2397 = new BitSet(new long[]{0x0600200000000010L});
    public static final BitSet FOLLOW_event_seq_in_when2401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_event_or_in_event_seq2428 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_must_be_one_in_event_seq2433 = new BitSet(new long[]{0x0600200000000010L});
    public static final BitSet FOLLOW_event_or_in_event_seq2438 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_event_and_in_event_or2480 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_event_or2485 = new BitSet(new long[]{0x0600200000000010L});
    public static final BitSet FOLLOW_event_and_in_event_or2489 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_event_btwn_in_event_and2519 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_event_and2524 = new BitSet(new long[]{0x0600200000000010L});
    public static final BitSet FOLLOW_event_btwn_in_event_and2528 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_event_prim_in_event_btwn2554 = new BitSet(new long[]{0x0180000000000002L});
    public static final BitSet FOLLOW_55_in_event_btwn2560 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_event_btwn2565 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_event_btwn2567 = new BitSet(new long[]{0x0600200000000010L});
    public static final BitSet FOLLOW_event_seq_in_event_btwn2571 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_event_btwn2573 = new BitSet(new long[]{0x0600200000000010L});
    public static final BitSet FOLLOW_event_seq_in_event_btwn2577 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_event_btwn2579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_event_prim2610 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_event_prim2613 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_STRING_in_event_prim2618 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_REGEXP_in_event_prim2622 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_setting_in_event_prim2627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_event_prim2636 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_must_be_one_in_event_prim2641 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_event_prim2646 = new BitSet(new long[]{0x0804000000000002L});
    public static final BitSet FOLLOW_on_expr_in_event_prim2650 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_setting_in_event_prim2656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_event_prim2666 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_event_prim2670 = new BitSet(new long[]{0x0004000000000012L});
    public static final BitSet FOLLOW_event_filter_in_event_prim2675 = new BitSet(new long[]{0x0004000000000012L});
    public static final BitSet FOLLOW_setting_in_event_prim2682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_event_prim2692 = new BitSet(new long[]{0x0600200000000010L});
    public static final BitSet FOLLOW_event_seq_in_event_prim2696 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_event_prim2698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_event_filter2719 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_STRING_in_event_filter2724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REGEXP_in_event_filter2730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_on_expr2749 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_STRING_in_on_expr2758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REGEXP_in_on_expr2769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_global_block2854 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_global_block2856 = new BitSet(new long[]{0x00000000C0000010L,0x00000A0000000000L});
    public static final BitSet FOLLOW_emit_block_in_global_block2864 = new BitSet(new long[]{0x00000000C0000010L,0x00000A0000000000L});
    public static final BitSet FOLLOW_must_be_one_in_global_block2874 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_global_block2879 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_global_block2882 = new BitSet(new long[]{0xE000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_set_in_global_block2886 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_global_block2898 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_global_block2902 = new BitSet(new long[]{0x00000000C0000010L,0x00000E0000000000L});
    public static final BitSet FOLLOW_cachable_in_global_block2907 = new BitSet(new long[]{0x00000000C0000010L,0x00000A0000000000L});
    public static final BitSet FOLLOW_css_emit_in_global_block2922 = new BitSet(new long[]{0x00000000C0000010L,0x00000A0000000000L});
    public static final BitSet FOLLOW_decl_in_global_block2930 = new BitSet(new long[]{0x00000000C0000010L,0x00000A0000000000L});
    public static final BitSet FOLLOW_31_in_global_block2936 = new BitSet(new long[]{0x00000000C0000010L,0x00000A0000000000L});
    public static final BitSet FOLLOW_30_in_global_block2941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_decl2968 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_decl2970 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_HTML_in_decl2974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_decl2984 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_decl2986 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_JS_in_decl2990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_decl3000 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_decl3002 = new BitSet(new long[]{0x00802000200018B0L,0x000000F700000204L});
    public static final BitSet FOLLOW_expr_in_decl3006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_def_in_expr3033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_expression_in_expr3042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_function_def3065 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_function_def3067 = new BitSet(new long[]{0x0000C00000000010L});
    public static final BitSet FOLLOW_VAR_in_function_def3071 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_46_in_function_def3075 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_function_def3079 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_47_in_function_def3084 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_function_def3086 = new BitSet(new long[]{0x00802000A00018B0L,0x000000F700000204L});
    public static final BitSet FOLLOW_decl_in_function_def3090 = new BitSet(new long[]{0x00802000A00018B0L,0x000000F700000204L});
    public static final BitSet FOLLOW_31_in_function_def3095 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_decl_in_function_def3099 = new BitSet(new long[]{0x00802000A00018B0L,0x000000F700000204L});
    public static final BitSet FOLLOW_31_in_function_def3104 = new BitSet(new long[]{0x00802000200018B0L,0x000000F700000204L});
    public static final BitSet FOLLOW_expr_in_function_def3109 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_function_def3111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_disjunction_in_conditional_expression3138 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_conditional_expression3141 = new BitSet(new long[]{0x00802000200018B0L,0x000000F700000204L});
    public static final BitSet FOLLOW_expr_in_conditional_expression3145 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_conditional_expression3147 = new BitSet(new long[]{0x00802000200018B0L,0x000000F700000204L});
    public static final BitSet FOLLOW_expr_in_conditional_expression3151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conjunction_in_disjunction3184 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_disjunction3189 = new BitSet(new long[]{0x00802000200018B0L,0x000000F700000204L});
    public static final BitSet FOLLOW_conjunction_in_disjunction3193 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_equality_expr_in_conjunction3223 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_conjunction3228 = new BitSet(new long[]{0x00802000200018B0L,0x000000F700000204L});
    public static final BitSet FOLLOW_equality_expr_in_conjunction3232 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_add_expr_in_equality_expr3263 = new BitSet(new long[]{0x0000000007FC0002L});
    public static final BitSet FOLLOW_predop_in_equality_expr3268 = new BitSet(new long[]{0x00802000200018B0L,0x000000F700000204L});
    public static final BitSet FOLLOW_add_expr_in_equality_expr3272 = new BitSet(new long[]{0x0000000007FC0002L});
    public static final BitSet FOLLOW_mult_expr_in_add_expr3306 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_add_op_in_add_expr3311 = new BitSet(new long[]{0x00802000200018B0L,0x000000F700000204L});
    public static final BitSet FOLLOW_mult_expr_in_add_expr3315 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_set_in_mult_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_expr_in_mult_expr3363 = new BitSet(new long[]{0x0000000000000002L,0x00000000000001C0L});
    public static final BitSet FOLLOW_mult_op_in_mult_expr3368 = new BitSet(new long[]{0x00802000200018B0L,0x000000F700000204L});
    public static final BitSet FOLLOW_unary_expr_in_mult_expr3372 = new BitSet(new long[]{0x0000000000000002L,0x00000000000001C0L});
    public static final BitSet FOLLOW_55_in_unary_expr3412 = new BitSet(new long[]{0x00802000200018B0L,0x000000F700000204L});
    public static final BitSet FOLLOW_unary_expr_in_unary_expr3414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_unary_expr3421 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_unary_expr3425 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_must_be_in_unary_expr3427 = new BitSet(new long[]{0x0000000000000000L,0x000000C000000000L});
    public static final BitSet FOLLOW_var_domain_in_unary_expr3432 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_unary_expr3434 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_unary_expr3438 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_timeframe_in_unary_expr3442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_unary_expr3450 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_unary_expr3454 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_must_be_one_in_unary_expr3458 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_unary_expr3463 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_must_be_in_unary_expr3466 = new BitSet(new long[]{0x0000000000000000L,0x000000C000000000L});
    public static final BitSet FOLLOW_var_domain_in_unary_expr3471 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_unary_expr3473 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_unary_expr3477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_domain_in_unary_expr3486 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_unary_expr3488 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_unary_expr3492 = new BitSet(new long[]{0x0000000007FC0000L});
    public static final BitSet FOLLOW_predop_in_unary_expr3496 = new BitSet(new long[]{0x00802000200018B0L,0x000000F700000204L});
    public static final BitSet FOLLOW_expr_in_unary_expr3500 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_timeframe_in_unary_expr3504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_domain_in_unary_expr3514 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_unary_expr3516 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_unary_expr3520 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_timeframe_in_unary_expr3524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operator_expr_in_unary_expr3533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_operator_expr3562 = new BitSet(new long[]{0x0000000000000002L,0x00000000FFFFFC00L});
    public static final BitSet FOLLOW_operator_in_operator_expr3568 = new BitSet(new long[]{0x0000000000000002L,0x00000000FFFFFC00L});
    public static final BitSet FOLLOW_set_in_operator3598 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_operator3685 = new BitSet(new long[]{0x0080A000200018B0L,0x000000F700000204L});
    public static final BitSet FOLLOW_expr_in_operator3690 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_46_in_operator3695 = new BitSet(new long[]{0x00802000200018B0L,0x000000F700000204L});
    public static final BitSet FOLLOW_expr_in_operator3699 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_47_in_operator3708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_factor3747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_factor3762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_factor3782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_factor3802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_factor3822 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_factor3824 = new BitSet(new long[]{0x00802000200018B0L,0x000000F700000204L});
    public static final BitSet FOLLOW_expr_in_factor3828 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_factor3830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_domain_in_factor3845 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_factor3847 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_factor3851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_factor3863 = new BitSet(new long[]{0x0000000000000000L,0x000000C000000000L});
    public static final BitSet FOLLOW_var_domain_in_factor3867 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_factor3869 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_factor3873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_factor3886 = new BitSet(new long[]{0x00802000200018B0L,0x000000F700000204L});
    public static final BitSet FOLLOW_expr_in_factor3890 = new BitSet(new long[]{0x0000000000000000L,0x000000C000000000L});
    public static final BitSet FOLLOW_var_domain_in_factor3894 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_factor3896 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_factor3900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namespace_in_factor3914 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_factor3918 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_factor3920 = new BitSet(new long[]{0x0080A000200018B0L,0x000000F700000204L});
    public static final BitSet FOLLOW_expr_in_factor3925 = new BitSet(new long[]{0x0080E000200018B0L,0x000000F700000204L});
    public static final BitSet FOLLOW_46_in_factor3936 = new BitSet(new long[]{0x0080A000200018B0L,0x000000F700000204L});
    public static final BitSet FOLLOW_47_in_factor3941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_factor3956 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_factor3958 = new BitSet(new long[]{0x0080A000200018B0L,0x000000F700000204L});
    public static final BitSet FOLLOW_expr_in_factor3963 = new BitSet(new long[]{0x0080E000200018B0L,0x000000F700000204L});
    public static final BitSet FOLLOW_46_in_factor3967 = new BitSet(new long[]{0x0080A000200018B0L,0x000000F700000204L});
    public static final BitSet FOLLOW_47_in_factor3972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_factor3984 = new BitSet(new long[]{0x00802000200018B0L,0x000000FF00000204L});
    public static final BitSet FOLLOW_expr_in_factor3989 = new BitSet(new long[]{0x0000400000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_46_in_factor3994 = new BitSet(new long[]{0x00802000200018B0L,0x000000F700000204L});
    public static final BitSet FOLLOW_expr_in_factor3998 = new BitSet(new long[]{0x0000400000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_factor4006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_factor4018 = new BitSet(new long[]{0x0000000040000800L});
    public static final BitSet FOLLOW_hash_line_in_factor4023 = new BitSet(new long[]{0x0000400040000000L});
    public static final BitSet FOLLOW_46_in_factor4028 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_hash_line_in_factor4032 = new BitSet(new long[]{0x0000400040000000L});
    public static final BitSet FOLLOW_30_in_factor4041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_factor4055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_factor4068 = new BitSet(new long[]{0x00802000200018B0L,0x000000F700000204L});
    public static final BitSet FOLLOW_expr_in_factor4072 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_factor4074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REGEXP_in_factor4093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_var_domain0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_namespace4133 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_namespace4135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_timeframe4157 = new BitSet(new long[]{0x00802000200018B0L,0x000000F700000204L});
    public static final BitSet FOLLOW_expr_in_timeframe4161 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_period_in_timeframe4165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_hash_line4189 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_hash_line4191 = new BitSet(new long[]{0x00802000200018B0L,0x000000F700000204L});
    public static final BitSet FOLLOW_expr_in_hash_line4195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_css_emit4213 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_HTML_in_css_emit4219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_css_emit4227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_must_be_one_in_period4250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_cachable4284 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_cachable4287 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_INT_in_cachable4291 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_period_in_cachable4295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_emit_block4319 = new BitSet(new long[]{0x0000000000006800L});
    public static final BitSet FOLLOW_HTML_in_emit_block4325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_emit_block4333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JS_in_emit_block4341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_meta_block4373 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_meta_block4375 = new BitSet(new long[]{0x0000000040000010L,0x0005600000000000L});
    public static final BitSet FOLLOW_must_be_one_in_meta_block4384 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_HTML_in_meta_block4390 = new BitSet(new long[]{0x0000000040000010L,0x0005600000000000L});
    public static final BitSet FOLLOW_STRING_in_meta_block4394 = new BitSet(new long[]{0x0000000040000010L,0x0005600000000000L});
    public static final BitSet FOLLOW_109_in_meta_block4408 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_must_be_one_in_meta_block4412 = new BitSet(new long[]{0x0000000020000800L});
    public static final BitSet FOLLOW_STRING_in_meta_block4418 = new BitSet(new long[]{0x0000000060000810L,0x0005600000000000L});
    public static final BitSet FOLLOW_29_in_meta_block4422 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_name_value_pair_in_meta_block4425 = new BitSet(new long[]{0x0000400040000000L});
    public static final BitSet FOLLOW_46_in_meta_block4429 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_name_value_pair_in_meta_block4431 = new BitSet(new long[]{0x0000400040000000L});
    public static final BitSet FOLLOW_30_in_meta_block4437 = new BitSet(new long[]{0x0000000060000810L,0x0005600000000000L});
    public static final BitSet FOLLOW_110_in_meta_block4449 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_meta_block4451 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_must_be_in_meta_block4453 = new BitSet(new long[]{0x0000000040000010L,0x0005600000000000L});
    public static final BitSet FOLLOW_112_in_meta_block4462 = new BitSet(new long[]{0x0800000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_set_in_meta_block4466 = new BitSet(new long[]{0x0000000040000010L,0x0005600000000000L});
    public static final BitSet FOLLOW_114_in_meta_block4477 = new BitSet(new long[]{0x0000000000000000L,0x0018020000000000L});
    public static final BitSet FOLLOW_set_in_meta_block4484 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_must_be_in_meta_block4490 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_STRING_in_meta_block4496 = new BitSet(new long[]{0x0000000040000010L,0x0005600000000000L});
    public static final BitSet FOLLOW_VAR_in_meta_block4502 = new BitSet(new long[]{0x0000000040000010L,0x0005600000000000L});
    public static final BitSet FOLLOW_116_in_meta_block4517 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_meta_block4522 = new BitSet(new long[]{0x0000000040000010L,0x0025600000000000L});
    public static final BitSet FOLLOW_117_in_meta_block4525 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_meta_block4529 = new BitSet(new long[]{0x0000000040000010L,0x0005600000000000L});
    public static final BitSet FOLLOW_30_in_meta_block4544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_must_be_in_dispatch_block4575 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_dispatch_block4579 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_must_be_in_dispatch_block4582 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_dispatch_block4587 = new BitSet(new long[]{0x0000000040000010L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_dispatch_block4590 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_dispatch_block4594 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_30_in_dispatch_block4604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_name_value_pair4627 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_name_value_pair4629 = new BitSet(new long[]{0x00000000000008A0L});
    public static final BitSet FOLLOW_INT_in_name_value_pair4637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_name_value_pair4648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_name_value_pair4659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_synpred19_RuleSet21062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emit_block_in_synpred20_RuleSet21067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_synpred23_RuleSet21083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_persistent_expr_in_synpred32_RuleSet21237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_log_statement_in_synpred34_RuleSet21254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_synpred51_RuleSet21893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred52_RuleSet21914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_must_be_one_in_synpred73_RuleSet22433 = new BitSet(new long[]{0x0600200000000010L});
    public static final BitSet FOLLOW_event_or_in_synpred73_RuleSet22438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeframe_in_synpred118_RuleSet23442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_synpred119_RuleSet23421 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_synpred119_RuleSet23425 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_must_be_in_synpred119_RuleSet23427 = new BitSet(new long[]{0x0000000000000000L,0x000000C000000000L});
    public static final BitSet FOLLOW_var_domain_in_synpred119_RuleSet23432 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_synpred119_RuleSet23434 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_synpred119_RuleSet23438 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_timeframe_in_synpred119_RuleSet23442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_synpred120_RuleSet23450 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_synpred120_RuleSet23454 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_must_be_one_in_synpred120_RuleSet23458 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_synpred120_RuleSet23463 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_must_be_in_synpred120_RuleSet23466 = new BitSet(new long[]{0x0000000000000000L,0x000000C000000000L});
    public static final BitSet FOLLOW_var_domain_in_synpred120_RuleSet23471 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_synpred120_RuleSet23473 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_synpred120_RuleSet23477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_domain_in_synpred121_RuleSet23486 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_synpred121_RuleSet23488 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_synpred121_RuleSet23492 = new BitSet(new long[]{0x0000000007FC0000L});
    public static final BitSet FOLLOW_predop_in_synpred121_RuleSet23496 = new BitSet(new long[]{0x00802000200018B0L,0x000000F700000204L});
    public static final BitSet FOLLOW_expr_in_synpred121_RuleSet23500 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_timeframe_in_synpred121_RuleSet23504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_domain_in_synpred122_RuleSet23514 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_synpred122_RuleSet23516 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_synpred122_RuleSet23520 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_timeframe_in_synpred122_RuleSet23524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_synpred152_RuleSet23822 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_synpred152_RuleSet23824 = new BitSet(new long[]{0x00802000200018B0L,0x000000F700000204L});
    public static final BitSet FOLLOW_expr_in_synpred152_RuleSet23828 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_synpred152_RuleSet23830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namespace_in_synpred158_RuleSet23914 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_synpred158_RuleSet23918 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_synpred158_RuleSet23920 = new BitSet(new long[]{0x0080A000200018B0L,0x000000F700000204L});
    public static final BitSet FOLLOW_expr_in_synpred158_RuleSet23925 = new BitSet(new long[]{0x0080E000200018B0L,0x000000F700000204L});
    public static final BitSet FOLLOW_46_in_synpred158_RuleSet23936 = new BitSet(new long[]{0x0080A000200018B0L,0x000000F700000204L});
    public static final BitSet FOLLOW_47_in_synpred158_RuleSet23941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_synpred161_RuleSet23956 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_synpred161_RuleSet23958 = new BitSet(new long[]{0x0080A000200018B0L,0x000000F700000204L});
    public static final BitSet FOLLOW_expr_in_synpred161_RuleSet23963 = new BitSet(new long[]{0x0080E000200018B0L,0x000000F700000204L});
    public static final BitSet FOLLOW_46_in_synpred161_RuleSet23967 = new BitSet(new long[]{0x0080A000200018B0L,0x000000F700000204L});
    public static final BitSet FOLLOW_47_in_synpred161_RuleSet23972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_synpred168_RuleSet24055 = new BitSet(new long[]{0x0000000000000002L});

}