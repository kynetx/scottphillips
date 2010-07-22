// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g 2010-07-22 13:19:56

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
import org.antlr.runtime.debug.*;
import java.io.IOException;

import org.antlr.runtime.tree.*;

public class RuleSet2Parser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "VAR", "INT", "EXPONENT", "FLOAT", "COMMENT", "WS", "ESC_SEQ", "STRING", "REGEXP", "HTML", "JS", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "'<='", "'>='", "'<'", "'>'", "'=='", "'!='", "'eq'", "'neq'", "'like'", "'+'", "'-'", "'{'", "'}'", "';'", "'if'", "'callbacks'", "'success'", "'failure'", "'click'", "'change'", "'='", "':'", "'forget'", "'mark'", "'with'", "'+='", "'-='", "'for'", "'=>'", "'('", "','", "')'", "'and'", "'using'", "'setting'", "'pre'", "'foreach'", "'when'", "'or'", "'not'", "'between'", "'web'", "'pageview'", "'submit'", "'dblclick'", "'update'", "'on'", "'global'", "'JSON'", "'XML'", "'RSS'", "'HTML'", "'<-'", "'function'", "'|'", "'||'", "'&&'", "'*'", "'/'", "'%'", "'seen'", "'.pick'", "'.match'", "'.length'", "'.replace'", "'.as'", "'.head'", "'.tail'", "'.sort'", "'.filter'", "'.map'", "'.uc'", "'.lc'", "'.split'", "'.join'", "'.query'", "'.has'", "'.union'", "'.difference'", "'.intersection'", "'.unique'", "'.once'", "'.duplicates'", "'true'", "'false'", "'['", "']'", "'current'", "'history'", "'ent'", "'app'", "'within'", "'css'", "'cachable'", "'emit'", "'meta'", "'key'", "'authz'", "'require'", "'user'", "'logging'", "'off'", "'use'", "'javascript'", "'module'", "'alias'", "'->'"
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

    public static final String[] ruleNames = new String[] {
        "invalidRule", "synpred165_RuleSet2", "synpred73_RuleSet2", "synpred46_RuleSet2", 
        "synpred79_RuleSet2", "synpred148_RuleSet2", "synpred36_RuleSet2", 
        "synpred16_RuleSet2", "synpred193_RuleSet2", "synpred134_RuleSet2", 
        "hash_line", "synpred96_RuleSet2", "synpred12_RuleSet2", "synpred24_RuleSet2", 
        "synpred180_RuleSet2", "synpred19_RuleSet2", "mult_op", "synpred194_RuleSet2", 
        "pre_block", "synpred26_RuleSet2", "synpred42_RuleSet2", "synpred57_RuleSet2", 
        "synpred192_RuleSet2", "synpred151_RuleSet2", "add_op", "conditional_expression", 
        "operator", "meta_block", "synpred44_RuleSet2", "rule", "synpred107_RuleSet2", 
        "synpred131_RuleSet2", "synpred39_RuleSet2", "synpred88_RuleSet2", 
        "trail_mark", "synpred30_RuleSet2", "decl", "failure", "synpred82_RuleSet2", 
        "synpred56_RuleSet2", "synpred156_RuleSet2", "log_statement", "action", 
        "period", "synpred119_RuleSet2", "action_block", "synpred113_RuleSet2", 
        "synpred81_RuleSet2", "synpred13_RuleSet2", "synpred59_RuleSet2", 
        "event_prim", "synpred167_RuleSet2", "synpred35_RuleSet2", "var_domain", 
        "synpred157_RuleSet2", "using", "event_and", "synpred77_RuleSet2", 
        "synpred182_RuleSet2", "synpred177_RuleSet2", "synpred95_RuleSet2", 
        "counter_op", "synpred117_RuleSet2", "timeframe", "synpred109_RuleSet2", 
        "synpred126_RuleSet2", "synpred162_RuleSet2", "synpred8_RuleSet2", 
        "synpred37_RuleSet2", "synpred94_RuleSet2", "synpred74_RuleSet2", 
        "synpred10_RuleSet2", "synpred102_RuleSet2", "synpred175_RuleSet2", 
        "synpred80_RuleSet2", "synpred190_RuleSet2", "callbacks", "rulesetname", 
        "synpred128_RuleSet2", "primrule", "synpred164_RuleSet2", "synpred60_RuleSet2", 
        "synpred152_RuleSet2", "synpred160_RuleSet2", "synpred7_RuleSet2", 
        "synpred3_RuleSet2", "synpred122_RuleSet2", "synpred25_RuleSet2", 
        "synpred191_RuleSet2", "synpred185_RuleSet2", "setting", "synpred137_RuleSet2", 
        "synpred76_RuleSet2", "conditional_action", "persistent_iterate", 
        "synpred22_RuleSet2", "synpred20_RuleSet2", "synpred114_RuleSet2", 
        "synpred172_RuleSet2", "synpred166_RuleSet2", "modifier", "synpred189_RuleSet2", 
        "synpred139_RuleSet2", "synpred90_RuleSet2", "synpred132_RuleSet2", 
        "synpred38_RuleSet2", "synpred55_RuleSet2", "synpred150_RuleSet2", 
        "unconditional_action", "synpred33_RuleSet2", "synpred142_RuleSet2", 
        "equality_expr", "synpred104_RuleSet2", "synpred5_RuleSet2", "synpred145_RuleSet2", 
        "synpred116_RuleSet2", "synpred144_RuleSet2", "synpred23_RuleSet2", 
        "synpred181_RuleSet2", "synpred48_RuleSet2", "event_or", "emit_block", 
        "counter_start", "synpred179_RuleSet2", "synpred105_RuleSet2", "synpred29_RuleSet2", 
        "synpred133_RuleSet2", "name_value_pair", "synpred153_RuleSet2", 
        "synpred143_RuleSet2", "synpred138_RuleSet2", "synpred28_RuleSet2", 
        "synpred174_RuleSet2", "synpred158_RuleSet2", "disjunction", "ruleset", 
        "synpred11_RuleSet2", "synpred99_RuleSet2", "predop", "success", 
        "synpred92_RuleSet2", "synpred68_RuleSet2", "conjunction", "synpred91_RuleSet2", 
        "persistent_expr", "add_expr", "post_block", "post_alternate", "synpred163_RuleSet2", 
        "synpred135_RuleSet2", "raise_statement", "synpred87_RuleSet2", 
        "synpred171_RuleSet2", "synpred125_RuleSet2", "synpred54_RuleSet2", 
        "function_def", "synpred159_RuleSet2", "synpred63_RuleSet2", "synpred17_RuleSet2", 
        "synpred40_RuleSet2", "synpred21_RuleSet2", "synpred71_RuleSet2", 
        "synpred86_RuleSet2", "synpred9_RuleSet2", "synpred34_RuleSet2", 
        "synpred183_RuleSet2", "synpred121_RuleSet2", "synpred14_RuleSet2", 
        "synpred97_RuleSet2", "synpred31_RuleSet2", "event_btwn", "synpred75_RuleSet2", 
        "click", "synpred84_RuleSet2", "persistent_clear_set", "synpred120_RuleSet2", 
        "cachable", "namespace", "synpred83_RuleSet2", "synpred72_RuleSet2", 
        "synpred101_RuleSet2", "synpred65_RuleSet2", "synpred2_RuleSet2", 
        "synpred27_RuleSet2", "synpred169_RuleSet2", "click_link", "dispatch_block", 
        "on_expr", "factor", "synpred66_RuleSet2", "foreach", "synpred155_RuleSet2", 
        "synpred108_RuleSet2", "synpred130_RuleSet2", "synpred186_RuleSet2", 
        "synpred124_RuleSet2", "synpred15_RuleSet2", "synpred178_RuleSet2", 
        "synpred18_RuleSet2", "synpred67_RuleSet2", "synpred176_RuleSet2", 
        "expr", "synpred85_RuleSet2", "synpred58_RuleSet2", "synpred50_RuleSet2", 
        "operator_expr", "synpred78_RuleSet2", "modifier_clause", "synpred47_RuleSet2", 
        "synpred64_RuleSet2", "synpred173_RuleSet2", "synpred141_RuleSet2", 
        "synpred184_RuleSet2", "synpred61_RuleSet2", "synpred106_RuleSet2", 
        "synpred146_RuleSet2", "synpred129_RuleSet2", "synpred52_RuleSet2", 
        "synpred187_RuleSet2", "synpred62_RuleSet2", "synpred161_RuleSet2", 
        "css_emit", "synpred32_RuleSet2", "synpred70_RuleSet2", "trail_with", 
        "synpred110_RuleSet2", "synpred6_RuleSet2", "synpred1_RuleSet2", 
        "synpred93_RuleSet2", "synpred53_RuleSet2", "for_clause", "synpred51_RuleSet2", 
        "synpred136_RuleSet2", "synpred69_RuleSet2", "synpred111_RuleSet2", 
        "synpred154_RuleSet2", "synpred41_RuleSet2", "trail_forget", "event_filter", 
        "synpred112_RuleSet2", "synpred49_RuleSet2", "synpred127_RuleSet2", 
        "synpred140_RuleSet2", "synpred100_RuleSet2", "post_statement", 
        "synpred170_RuleSet2", "synpred168_RuleSet2", "synpred98_RuleSet2", 
        "synpred4_RuleSet2", "synpred103_RuleSet2", "when", "unary_expr", 
        "synpred118_RuleSet2", "synpred115_RuleSet2", "rule_name", "synpred188_RuleSet2", 
        "synpred123_RuleSet2", "mult_expr", "global_block", "synpred149_RuleSet2", 
        "event_seq", "synpred45_RuleSet2", "synpred43_RuleSet2", "synpred89_RuleSet2", 
        "must_be", "synpred147_RuleSet2", "must_be_one"
    };
     
        public int ruleLevel = 0;
        public int getRuleLevel() { return ruleLevel; }
        public void incRuleLevel() { ruleLevel++; }
        public void decRuleLevel() { ruleLevel--; }
        public RuleSet2Parser(TokenStream input) {
            this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
        }
        public RuleSet2Parser(TokenStream input, int port, RecognizerSharedState state) {
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
    public RuleSet2Parser(TokenStream input, DebugEventListener dbg) {
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


    public String[] getTokenNames() { return RuleSet2Parser.tokenNames; }
    public String getGrammarFileName() { return "/Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g"; }

     
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
    		return value.substring(start.length(),value.length() - end.length()).trim();	
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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:177:1: predop : ( '<=' | '>=' | '<' | '>' | '==' | '!=' | 'eq' | 'neq' | 'like' );
    public final RuleSet2Parser.predop_return predop() throws RecognitionException {
        RuleSet2Parser.predop_return retval = new RuleSet2Parser.predop_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set1=null;

        Object set1_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "predop");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(177, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:177:7: ( '<=' | '>=' | '<' | '>' | '==' | '!=' | 'eq' | 'neq' | 'like' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(177,7);
            set1=(Token)input.LT(1);
            if ( (input.LA(1)>=18 && input.LA(1)<=26) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set1));
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
        dbg.location(177, 70);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "predop");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "predop"

    public static class add_op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "add_op"
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:179:1: add_op : ( '+' | '-' );
    public final RuleSet2Parser.add_op_return add_op() throws RecognitionException {
        RuleSet2Parser.add_op_return retval = new RuleSet2Parser.add_op_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set2=null;

        Object set2_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "add_op");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(179, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:179:7: ( '+' | '-' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(179,7);
            set2=(Token)input.LT(1);
            if ( (input.LA(1)>=27 && input.LA(1)<=28) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set2));
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
        dbg.location(179, 16);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "add_op");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "add_op"

    public static class ruleset_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ruleset"
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:270:1: ruleset options {backtrack=false; } : must_be[\"ruleset\"] rulesetname '{' ( meta_block | dispatch_block | global_block | rule )* '}' EOF ;
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

        try { dbg.enterRule(getGrammarFileName(), "ruleset");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(270, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:281:3: ( must_be[\"ruleset\"] rulesetname '{' ( meta_block | dispatch_block | global_block | rule )* '}' EOF )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:282:3: must_be[\"ruleset\"] rulesetname '{' ( meta_block | dispatch_block | global_block | rule )* '}' EOF
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(282,3);
            pushFollow(FOLLOW_must_be_in_ruleset818);
            must_be3=must_be("ruleset");

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, must_be3.getTree());
            dbg.location(283,3);
            pushFollow(FOLLOW_rulesetname_in_ruleset824);
            rulesetname4=rulesetname();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, rulesetname4.getTree());
            dbg.location(283,15);
            if ( state.backtracking==0 ) {
               current_top.put("ruleset_name",(rulesetname4!=null?input.toString(rulesetname4.start,rulesetname4.stop):null)); 
            }
            dbg.location(284,3);
            char_literal5=(Token)match(input,29,FOLLOW_29_in_ruleset831); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal5_tree = (Object)adaptor.create(char_literal5);
            adaptor.addChild(root_0, char_literal5_tree);
            }
            dbg.location(285,3);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:285:3: ( meta_block | dispatch_block | global_block | rule )*
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=5;
                try { dbg.enterDecision(1);

                switch ( input.LA(1) ) {
                case 113:
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
                case 65:
                    {
                    alt1=3;
                    }
                    break;

                }

                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:285:5: meta_block
            	    {
            	    dbg.location(285,5);
            	    pushFollow(FOLLOW_meta_block_in_ruleset838);
            	    meta_block6=meta_block();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, meta_block6.getTree());

            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:285:18: dispatch_block
            	    {
            	    dbg.location(285,18);
            	    pushFollow(FOLLOW_dispatch_block_in_ruleset842);
            	    dispatch_block7=dispatch_block();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, dispatch_block7.getTree());

            	    }
            	    break;
            	case 3 :
            	    dbg.enterAlt(3);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:285:35: global_block
            	    {
            	    dbg.location(285,35);
            	    pushFollow(FOLLOW_global_block_in_ruleset846);
            	    global_block8=global_block();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, global_block8.getTree());

            	    }
            	    break;
            	case 4 :
            	    dbg.enterAlt(4);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:285:50: rule
            	    {
            	    dbg.location(285,50);
            	    pushFollow(FOLLOW_rule_in_ruleset850);
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
            } finally {dbg.exitSubRule(1);}

            dbg.location(286,2);
            char_literal10=(Token)match(input,30,FOLLOW_30_in_ruleset856); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal10_tree = (Object)adaptor.create(char_literal10);
            adaptor.addChild(root_0, char_literal10_tree);
            }
            dbg.location(287,2);
            EOF11=(Token)match(input,EOF,FOLLOW_EOF_in_ruleset860); if (state.failed) return retval;
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
        dbg.location(288, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "ruleset");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "ruleset"

    public static class must_be_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "must_be"
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:290:1: must_be[String what] : v= VAR ;
    public final RuleSet2Parser.must_be_return must_be(String what) throws RecognitionException {
        RuleSet2Parser.must_be_return retval = new RuleSet2Parser.must_be_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token v=null;

        Object v_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "must_be");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(290, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:291:3: (v= VAR )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:292:3: v= VAR
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(292,4);
            v=(Token)match(input,VAR,FOLLOW_VAR_in_must_be883); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            v_tree = (Object)adaptor.create(v);
            adaptor.addChild(root_0, v_tree);
            }
            dbg.location(292,9);
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
        dbg.location(293, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "must_be");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "must_be"

    public static class must_be_one_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "must_be_one"
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:295:1: must_be_one[String[] what] : v= VAR ;
    public final RuleSet2Parser.must_be_one_return must_be_one(String[] what) throws RecognitionException {
        RuleSet2Parser.must_be_one_return retval = new RuleSet2Parser.must_be_one_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token v=null;

        Object v_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "must_be_one");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(295, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:296:3: (v= VAR )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:297:3: v= VAR
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(297,4);
            v=(Token)match(input,VAR,FOLLOW_VAR_in_must_be_one908); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            v_tree = (Object)adaptor.create(v);
            adaptor.addChild(root_0, v_tree);
            }
            dbg.location(297,9);
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
        dbg.location(298, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "must_be_one");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "must_be_one"

    public static class rulesetname_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rulesetname"
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:300:1: rulesetname : ( VAR | INT );
    public final RuleSet2Parser.rulesetname_return rulesetname() throws RecognitionException {
        RuleSet2Parser.rulesetname_return retval = new RuleSet2Parser.rulesetname_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set12=null;

        Object set12_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rulesetname");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(300, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:301:2: ( VAR | INT )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(301,2);
            set12=(Token)input.LT(1);
            if ( (input.LA(1)>=VAR && input.LA(1)<=INT) ) {
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
        }
        dbg.location(302, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "rulesetname");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "rulesetname"

    public static class rule_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rule_name"
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:310:10: fragment rule_name : ( VAR | INT );
    public final RuleSet2Parser.rule_name_return rule_name() throws RecognitionException {
        RuleSet2Parser.rule_name_return retval = new RuleSet2Parser.rule_name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set13=null;

        Object set13_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rule_name");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(310, 10);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:311:2: ( VAR | INT )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(311,2);
            set13=(Token)input.LT(1);
            if ( (input.LA(1)>=VAR && input.LA(1)<=INT) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set13));
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
        dbg.location(313, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "rule_name");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "rule_name"

    public static class rule_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rule"
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:315:1: rule : must_be[\"rule\"] name= rule_name must_be[\"is\"] ait= must_be_one[sar(\"active\",\"inactive\",\"test\")] '{' select= VAR (ptu= using | ptw= when ) (f= foreach )* (pb= pre_block )? ( ';' )? (eb= emit_block )? ( ';' )? ( action[actions_result] ) (cb= callbacks )? ( ';' )? (postb= post_block )? ( ';' )? '}' ;
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

        try { dbg.enterRule(getGrammarFileName(), "rule");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(315, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:322:2: ( must_be[\"rule\"] name= rule_name must_be[\"is\"] ait= must_be_one[sar(\"active\",\"inactive\",\"test\")] '{' select= VAR (ptu= using | ptw= when ) (f= foreach )* (pb= pre_block )? ( ';' )? (eb= emit_block )? ( ';' )? ( action[actions_result] ) (cb= callbacks )? ( ';' )? (postb= post_block )? ( ';' )? '}' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:322:5: must_be[\"rule\"] name= rule_name must_be[\"is\"] ait= must_be_one[sar(\"active\",\"inactive\",\"test\")] '{' select= VAR (ptu= using | ptw= when ) (f= foreach )* (pb= pre_block )? ( ';' )? (eb= emit_block )? ( ';' )? ( action[actions_result] ) (cb= callbacks )? ( ';' )? (postb= post_block )? ( ';' )? '}'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(322,5);
            pushFollow(FOLLOW_must_be_in_rule967);
            must_be14=must_be("rule");

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, must_be14.getTree());
            dbg.location(323,7);
            pushFollow(FOLLOW_rule_name_in_rule975);
            name=rule_name();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, name.getTree());
            dbg.location(324,3);
            pushFollow(FOLLOW_must_be_in_rule982);
            must_be15=must_be("is");

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, must_be15.getTree());
            dbg.location(326,6);
            pushFollow(FOLLOW_must_be_one_in_rule992);
            ait=must_be_one(sar("active","inactive","test"));

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ait.getTree());
            dbg.location(327,3);
            char_literal16=(Token)match(input,29,FOLLOW_29_in_rule997); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal16_tree = (Object)adaptor.create(char_literal16);
            adaptor.addChild(root_0, char_literal16_tree);
            }
            dbg.location(328,12);
            select=(Token)match(input,VAR,FOLLOW_VAR_in_rule1007); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            select_tree = (Object)adaptor.create(select);
            adaptor.addChild(root_0, select_tree);
            }
            dbg.location(328,17);
            if ( state.backtracking==0 ) {
               cn((select!=null?select.getText():null), sar("select"),input); 
            }
            dbg.location(328,60);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:328:60: (ptu= using | ptw= when )
            int alt2=2;
            try { dbg.enterSubRule(2);
            try { dbg.enterDecision(2);

            int LA2_0 = input.LA(1);

            if ( (LA2_0==51) ) {
                alt2=1;
            }
            else if ( (LA2_0==55) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(2);}

            switch (alt2) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:328:61: ptu= using
                    {
                    dbg.location(328,64);
                    pushFollow(FOLLOW_using_in_rule1014);
                    ptu=using();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ptu.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:328:71: ptw= when
                    {
                    dbg.location(328,74);
                    pushFollow(FOLLOW_when_in_rule1018);
                    ptw=when();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ptw.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(2);}

            dbg.location(328,81);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:328:81: (f= foreach )*
            try { dbg.enterSubRule(3);

            loop3:
            do {
                int alt3=2;
                try { dbg.enterDecision(3);

                int LA3_0 = input.LA(1);

                if ( (LA3_0==54) ) {
                    alt3=1;
                }


                } finally {dbg.exitDecision(3);}

                switch (alt3) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:328:82: f= foreach
            	    {
            	    dbg.location(328,83);
            	    pushFollow(FOLLOW_foreach_in_rule1024);
            	    f=foreach();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            	    dbg.location(328,91);
            	    if ( state.backtracking==0 ) {
            	       fors.add((f!=null?f.result:null));
            	    }

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);
            } finally {dbg.exitSubRule(3);}

            dbg.location(328,119);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:328:119: (pb= pre_block )?
            int alt4=2;
            try { dbg.enterSubRule(4);
            try { dbg.enterDecision(4);

            int LA4_0 = input.LA(1);

            if ( (LA4_0==53) ) {
                alt4=1;
            }
            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: pb= pre_block
                    {
                    dbg.location(328,119);
                    pushFollow(FOLLOW_pre_block_in_rule1031);
                    pb=pre_block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pb.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(4);}

            dbg.location(328,131);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:328:131: ( ';' )?
            int alt5=2;
            try { dbg.enterSubRule(5);
            try { dbg.enterDecision(5);

            int LA5_0 = input.LA(1);

            if ( (LA5_0==31) ) {
                int LA5_1 = input.LA(2);

                if ( (synpred19_RuleSet2()) ) {
                    alt5=1;
                }
            }
            } finally {dbg.exitDecision(5);}

            switch (alt5) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: ';'
                    {
                    dbg.location(328,131);
                    char_literal17=(Token)match(input,31,FOLLOW_31_in_rule1034); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal17_tree = (Object)adaptor.create(char_literal17);
                    adaptor.addChild(root_0, char_literal17_tree);
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(5);}

            dbg.location(328,138);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:328:138: (eb= emit_block )?
            int alt6=2;
            try { dbg.enterSubRule(6);
            try { dbg.enterDecision(6);

            int LA6_0 = input.LA(1);

            if ( (LA6_0==112) ) {
                int LA6_1 = input.LA(2);

                if ( (synpred20_RuleSet2()) ) {
                    alt6=1;
                }
            }
            } finally {dbg.exitDecision(6);}

            switch (alt6) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: eb= emit_block
                    {
                    dbg.location(328,138);
                    pushFollow(FOLLOW_emit_block_in_rule1039);
                    eb=emit_block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, eb.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(6);}

            dbg.location(328,151);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:328:151: ( ';' )?
            int alt7=2;
            try { dbg.enterSubRule(7);
            try { dbg.enterDecision(7);

            int LA7_0 = input.LA(1);

            if ( (LA7_0==31) ) {
                alt7=1;
            }
            } finally {dbg.exitDecision(7);}

            switch (alt7) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: ';'
                    {
                    dbg.location(328,151);
                    char_literal18=(Token)match(input,31,FOLLOW_31_in_rule1042); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal18_tree = (Object)adaptor.create(char_literal18);
                    adaptor.addChild(root_0, char_literal18_tree);
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(7);}

            dbg.location(328,156);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:328:156: ( action[actions_result] )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:328:157: action[actions_result]
            {
            dbg.location(328,157);
            pushFollow(FOLLOW_action_in_rule1046);
            action19=action(actions_result);

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, action19.getTree());

            }

            dbg.location(328,183);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:328:183: (cb= callbacks )?
            int alt8=2;
            try { dbg.enterSubRule(8);
            try { dbg.enterDecision(8);

            int LA8_0 = input.LA(1);

            if ( (LA8_0==33) ) {
                alt8=1;
            }
            } finally {dbg.exitDecision(8);}

            switch (alt8) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: cb= callbacks
                    {
                    dbg.location(328,183);
                    pushFollow(FOLLOW_callbacks_in_rule1052);
                    cb=callbacks();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, cb.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(8);}

            dbg.location(328,195);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:328:195: ( ';' )?
            int alt9=2;
            try { dbg.enterSubRule(9);
            try { dbg.enterDecision(9);

            int LA9_0 = input.LA(1);

            if ( (LA9_0==31) ) {
                int LA9_1 = input.LA(2);

                if ( (synpred23_RuleSet2()) ) {
                    alt9=1;
                }
            }
            } finally {dbg.exitDecision(9);}

            switch (alt9) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: ';'
                    {
                    dbg.location(328,195);
                    char_literal20=(Token)match(input,31,FOLLOW_31_in_rule1055); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal20_tree = (Object)adaptor.create(char_literal20);
                    adaptor.addChild(root_0, char_literal20_tree);
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(9);}

            dbg.location(328,205);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:328:205: (postb= post_block )?
            int alt10=2;
            try { dbg.enterSubRule(10);
            try { dbg.enterDecision(10);

            int LA10_0 = input.LA(1);

            if ( (LA10_0==VAR) ) {
                alt10=1;
            }
            } finally {dbg.exitDecision(10);}

            switch (alt10) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: postb= post_block
                    {
                    dbg.location(328,205);
                    pushFollow(FOLLOW_post_block_in_rule1060);
                    postb=post_block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, postb.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(10);}

            dbg.location(328,218);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:328:218: ( ';' )?
            int alt11=2;
            try { dbg.enterSubRule(11);
            try { dbg.enterDecision(11);

            int LA11_0 = input.LA(1);

            if ( (LA11_0==31) ) {
                alt11=1;
            }
            } finally {dbg.exitDecision(11);}

            switch (alt11) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: ';'
                    {
                    dbg.location(328,218);
                    char_literal21=(Token)match(input,31,FOLLOW_31_in_rule1063); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal21_tree = (Object)adaptor.create(char_literal21);
                    adaptor.addChild(root_0, char_literal21_tree);
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(11);}

            dbg.location(329,3);
            char_literal22=(Token)match(input,30,FOLLOW_30_in_rule1068); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal22_tree = (Object)adaptor.create(char_literal22);
            adaptor.addChild(root_0, char_literal22_tree);
            }
            dbg.location(329,7);
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
              			current_rule.put("blocktype",actions_result.get("blocktype"));
              			
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
        dbg.location(371, 1);

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
        public HashMap result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "post_block"
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:376:1: post_block returns [HashMap result] : typ= must_be_one[sar(\"fired\",\"always\",\"notfired\")] '{' p1= post_statement ( ';' p2= post_statement )* ';' '}' (alt= post_alternate )? ;
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

        try { dbg.enterRule(getGrammarFileName(), "post_block");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(376, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:380:2: (typ= must_be_one[sar(\"fired\",\"always\",\"notfired\")] '{' p1= post_statement ( ';' p2= post_statement )* ';' '}' (alt= post_alternate )? )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:381:2: typ= must_be_one[sar(\"fired\",\"always\",\"notfired\")] '{' p1= post_statement ( ';' p2= post_statement )* ';' '}' (alt= post_alternate )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(381,5);
            pushFollow(FOLLOW_must_be_one_in_post_block1099);
            typ=must_be_one(sar("fired","always","notfired"));

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typ.getTree());
            dbg.location(381,52);
            char_literal23=(Token)match(input,29,FOLLOW_29_in_post_block1102); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal23_tree = (Object)adaptor.create(char_literal23);
            adaptor.addChild(root_0, char_literal23_tree);
            }
            dbg.location(382,5);
            pushFollow(FOLLOW_post_statement_in_post_block1109);
            p1=post_statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p1.getTree());
            dbg.location(382,21);
            if ( state.backtracking==0 ) {
               temp_list.add((p1!=null?p1.result:null));
            }
            dbg.location(382,51);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:382:51: ( ';' p2= post_statement )*
            try { dbg.enterSubRule(12);

            loop12:
            do {
                int alt12=2;
                try { dbg.enterDecision(12);

                int LA12_0 = input.LA(1);

                if ( (LA12_0==31) ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1==VAR||(LA12_1>=40 && LA12_1<=41)||(LA12_1>=107 && LA12_1<=108)) ) {
                        alt12=1;
                    }


                }


                } finally {dbg.exitDecision(12);}

                switch (alt12) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:382:52: ';' p2= post_statement
            	    {
            	    dbg.location(382,52);
            	    char_literal24=(Token)match(input,31,FOLLOW_31_in_post_block1114); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal24_tree = (Object)adaptor.create(char_literal24);
            	    adaptor.addChild(root_0, char_literal24_tree);
            	    }
            	    dbg.location(382,58);
            	    pushFollow(FOLLOW_post_statement_in_post_block1118);
            	    p2=post_statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p2.getTree());
            	    dbg.location(382,74);
            	    if ( state.backtracking==0 ) {
            	       temp_list.add((p2!=null?p2.result:null));
            	    }

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);
            } finally {dbg.exitSubRule(12);}

            dbg.location(382,108);
            char_literal25=(Token)match(input,31,FOLLOW_31_in_post_block1126); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal25_tree = (Object)adaptor.create(char_literal25);
            adaptor.addChild(root_0, char_literal25_tree);
            }
            dbg.location(382,112);
            char_literal26=(Token)match(input,30,FOLLOW_30_in_post_block1128); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal26_tree = (Object)adaptor.create(char_literal26);
            adaptor.addChild(root_0, char_literal26_tree);
            }
            dbg.location(383,6);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:383:6: (alt= post_alternate )?
            int alt13=2;
            try { dbg.enterSubRule(13);
            try { dbg.enterDecision(13);

            int LA13_0 = input.LA(1);

            if ( (LA13_0==VAR) ) {
                alt13=1;
            }
            } finally {dbg.exitDecision(13);}

            switch (alt13) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: alt= post_alternate
                    {
                    dbg.location(383,6);
                    pushFollow(FOLLOW_post_alternate_in_post_block1135);
                    alt=post_alternate();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, alt.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(13);}

            dbg.location(383,23);
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
        dbg.location(394, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "post_block");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:397:1: post_alternate returns [ArrayList result] : must_be[\"else\"] '{' (p= post_statement ( ';' p1= post_statement )* )? ( ';' )? '}' ;
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

        try { dbg.enterRule(getGrammarFileName(), "post_alternate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(397, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:401:2: ( must_be[\"else\"] '{' (p= post_statement ( ';' p1= post_statement )* )? ( ';' )? '}' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:402:3: must_be[\"else\"] '{' (p= post_statement ( ';' p1= post_statement )* )? ( ';' )? '}'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(402,3);
            pushFollow(FOLLOW_must_be_in_post_alternate1161);
            must_be27=must_be("else");

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, must_be27.getTree());
            dbg.location(402,19);
            char_literal28=(Token)match(input,29,FOLLOW_29_in_post_alternate1164); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal28_tree = (Object)adaptor.create(char_literal28);
            adaptor.addChild(root_0, char_literal28_tree);
            }
            dbg.location(402,23);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:402:23: (p= post_statement ( ';' p1= post_statement )* )?
            int alt15=2;
            try { dbg.enterSubRule(15);
            try { dbg.enterDecision(15);

            int LA15_0 = input.LA(1);

            if ( (LA15_0==VAR||(LA15_0>=40 && LA15_0<=41)||(LA15_0>=107 && LA15_0<=108)) ) {
                alt15=1;
            }
            } finally {dbg.exitDecision(15);}

            switch (alt15) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:402:24: p= post_statement ( ';' p1= post_statement )*
                    {
                    dbg.location(402,25);
                    pushFollow(FOLLOW_post_statement_in_post_alternate1169);
                    p=post_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p.getTree());
                    dbg.location(402,41);
                    if ( state.backtracking==0 ) {
                      temp_array.add((p!=null?p.result:null));
                    }
                    dbg.location(402,70);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:402:70: ( ';' p1= post_statement )*
                    try { dbg.enterSubRule(14);

                    loop14:
                    do {
                        int alt14=2;
                        try { dbg.enterDecision(14);

                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==31) ) {
                            int LA14_1 = input.LA(2);

                            if ( (LA14_1==VAR||(LA14_1>=40 && LA14_1<=41)||(LA14_1>=107 && LA14_1<=108)) ) {
                                alt14=1;
                            }


                        }


                        } finally {dbg.exitDecision(14);}

                        switch (alt14) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:402:71: ';' p1= post_statement
                    	    {
                    	    dbg.location(402,71);
                    	    char_literal29=(Token)match(input,31,FOLLOW_31_in_post_alternate1174); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal29_tree = (Object)adaptor.create(char_literal29);
                    	    adaptor.addChild(root_0, char_literal29_tree);
                    	    }
                    	    dbg.location(402,77);
                    	    pushFollow(FOLLOW_post_statement_in_post_alternate1178);
                    	    p1=post_statement();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p1.getTree());
                    	    dbg.location(402,92);
                    	    if ( state.backtracking==0 ) {
                    	      temp_array.add((p1!=null?p1.result:null));
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(14);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(15);}

            dbg.location(402,127);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:402:127: ( ';' )?
            int alt16=2;
            try { dbg.enterSubRule(16);
            try { dbg.enterDecision(16);

            int LA16_0 = input.LA(1);

            if ( (LA16_0==31) ) {
                alt16=1;
            }
            } finally {dbg.exitDecision(16);}

            switch (alt16) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: ';'
                    {
                    dbg.location(402,127);
                    char_literal30=(Token)match(input,31,FOLLOW_31_in_post_alternate1186); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal30_tree = (Object)adaptor.create(char_literal30);
                    adaptor.addChild(root_0, char_literal30_tree);
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(16);}

            dbg.location(402,132);
            char_literal31=(Token)match(input,30,FOLLOW_30_in_post_alternate1189); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal31_tree = (Object)adaptor.create(char_literal31);
            adaptor.addChild(root_0, char_literal31_tree);
            }
            dbg.location(402,136);
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
        dbg.location(404, 3);

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
        public HashMap result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "post_statement"
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:406:1: post_statement returns [HashMap result] : ( (pe= persistent_expr | rs= raise_statement | l= log_statement | las= must_be[\"last\"] ) ( 'if' ie= expr )? ) ;
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

        try { dbg.enterRule(getGrammarFileName(), "post_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(406, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:407:2: ( ( (pe= persistent_expr | rs= raise_statement | l= log_statement | las= must_be[\"last\"] ) ( 'if' ie= expr )? ) )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:407:4: ( (pe= persistent_expr | rs= raise_statement | l= log_statement | las= must_be[\"last\"] ) ( 'if' ie= expr )? )
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(407,4);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:407:4: ( (pe= persistent_expr | rs= raise_statement | l= log_statement | las= must_be[\"last\"] ) ( 'if' ie= expr )? )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:407:5: (pe= persistent_expr | rs= raise_statement | l= log_statement | las= must_be[\"last\"] ) ( 'if' ie= expr )?
            {
            dbg.location(407,5);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:407:5: (pe= persistent_expr | rs= raise_statement | l= log_statement | las= must_be[\"last\"] )
            int alt17=4;
            try { dbg.enterSubRule(17);
            try { dbg.enterDecision(17);

            try {
                isCyclicDecision = true;
                alt17 = dfa17.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(17);}

            switch (alt17) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:407:6: pe= persistent_expr
                    {
                    dbg.location(407,8);
                    pushFollow(FOLLOW_persistent_expr_in_post_statement1207);
                    pe=persistent_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pe.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:408:6: rs= raise_statement
                    {
                    dbg.location(408,8);
                    pushFollow(FOLLOW_raise_statement_in_post_statement1217);
                    rs=raise_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rs.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:409:4: l= log_statement
                    {
                    dbg.location(409,5);
                    pushFollow(FOLLOW_log_statement_in_post_statement1224);
                    l=log_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, l.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:410:4: las= must_be[\"last\"]
                    {
                    dbg.location(410,7);
                    pushFollow(FOLLOW_must_be_in_post_statement1234);
                    las=must_be("last");

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, las.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(17);}

            dbg.location(411,2);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:411:2: ( 'if' ie= expr )?
            int alt18=2;
            try { dbg.enterSubRule(18);
            try { dbg.enterDecision(18);

            int LA18_0 = input.LA(1);

            if ( (LA18_0==32) ) {
                alt18=1;
            }
            } finally {dbg.exitDecision(18);}

            switch (alt18) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:411:3: 'if' ie= expr
                    {
                    dbg.location(411,3);
                    string_literal32=(Token)match(input,32,FOLLOW_32_in_post_statement1240); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal32_tree = (Object)adaptor.create(string_literal32);
                    adaptor.addChild(root_0, string_literal32_tree);
                    }
                    dbg.location(411,10);
                    pushFollow(FOLLOW_expr_in_post_statement1244);
                    ie=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ie.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(18);}


            }

            dbg.location(411,19);
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
        dbg.location(435, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "post_statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:437:1: raise_statement returns [HashMap result] : must_be[\"raise\"] must_be[\"explicit\"] must_be[\"event\"] evt= VAR (f= for_clause )? (m= modifier_clause )? ;
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

        try { dbg.enterRule(getGrammarFileName(), "raise_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(437, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:438:2: ( must_be[\"raise\"] must_be[\"explicit\"] must_be[\"event\"] evt= VAR (f= for_clause )? (m= modifier_clause )? )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:439:2: must_be[\"raise\"] must_be[\"explicit\"] must_be[\"event\"] evt= VAR (f= for_clause )? (m= modifier_clause )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(439,2);
            pushFollow(FOLLOW_must_be_in_raise_statement1269);
            must_be33=must_be("raise");

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, must_be33.getTree());
            dbg.location(439,19);
            pushFollow(FOLLOW_must_be_in_raise_statement1272);
            must_be34=must_be("explicit");

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, must_be34.getTree());
            dbg.location(439,39);
            pushFollow(FOLLOW_must_be_in_raise_statement1275);
            must_be35=must_be("event");

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, must_be35.getTree());
            dbg.location(439,60);
            evt=(Token)match(input,VAR,FOLLOW_VAR_in_raise_statement1281); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            evt_tree = (Object)adaptor.create(evt);
            adaptor.addChild(root_0, evt_tree);
            }
            dbg.location(439,66);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:439:66: (f= for_clause )?
            int alt19=2;
            try { dbg.enterSubRule(19);
            try { dbg.enterDecision(19);

            int LA19_0 = input.LA(1);

            if ( (LA19_0==45) ) {
                alt19=1;
            }
            } finally {dbg.exitDecision(19);}

            switch (alt19) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: f= for_clause
                    {
                    dbg.location(439,66);
                    pushFollow(FOLLOW_for_clause_in_raise_statement1285);
                    f=for_clause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, f.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(19);}

            dbg.location(439,80);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:439:80: (m= modifier_clause )?
            int alt20=2;
            try { dbg.enterSubRule(20);
            try { dbg.enterDecision(20);

            int LA20_0 = input.LA(1);

            if ( (LA20_0==42) ) {
                alt20=1;
            }
            } finally {dbg.exitDecision(20);}

            switch (alt20) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: m= modifier_clause
                    {
                    dbg.location(439,80);
                    pushFollow(FOLLOW_modifier_clause_in_raise_statement1290);
                    m=modifier_clause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, m.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(20);}

            dbg.location(439,98);
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
        dbg.location(452, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "raise_statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:454:1: log_statement returns [HashMap result] : must_be[\"log\"] e= expr ;
    public final RuleSet2Parser.log_statement_return log_statement() throws RecognitionException {
        RuleSet2Parser.log_statement_return retval = new RuleSet2Parser.log_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RuleSet2Parser.expr_return e = null;

        RuleSet2Parser.must_be_return must_be36 = null;



        try { dbg.enterRule(getGrammarFileName(), "log_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(454, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:455:2: ( must_be[\"log\"] e= expr )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:456:2: must_be[\"log\"] e= expr
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(456,2);
            pushFollow(FOLLOW_must_be_in_log_statement1310);
            must_be36=must_be("log");

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, must_be36.getTree());
            dbg.location(456,19);
            pushFollow(FOLLOW_expr_in_log_statement1316);
            e=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
            dbg.location(456,25);
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
        dbg.location(462, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "log_statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:465:1: callbacks returns [HashMap result] : 'callbacks' '{' (s= success )? (f= failure )? '}' ;
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

        try { dbg.enterRule(getGrammarFileName(), "callbacks");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(465, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:466:2: ( 'callbacks' '{' (s= success )? (f= failure )? '}' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:467:2: 'callbacks' '{' (s= success )? (f= failure )? '}'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(467,2);
            string_literal37=(Token)match(input,33,FOLLOW_33_in_callbacks1336); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal37_tree = (Object)adaptor.create(string_literal37);
            adaptor.addChild(root_0, string_literal37_tree);
            }
            dbg.location(467,14);
            char_literal38=(Token)match(input,29,FOLLOW_29_in_callbacks1338); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal38_tree = (Object)adaptor.create(char_literal38);
            adaptor.addChild(root_0, char_literal38_tree);
            }
            dbg.location(467,19);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:467:19: (s= success )?
            int alt21=2;
            try { dbg.enterSubRule(21);
            try { dbg.enterDecision(21);

            int LA21_0 = input.LA(1);

            if ( (LA21_0==34) ) {
                alt21=1;
            }
            } finally {dbg.exitDecision(21);}

            switch (alt21) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: s= success
                    {
                    dbg.location(467,19);
                    pushFollow(FOLLOW_success_in_callbacks1342);
                    s=success();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, s.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(21);}

            dbg.location(467,30);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:467:30: (f= failure )?
            int alt22=2;
            try { dbg.enterSubRule(22);
            try { dbg.enterDecision(22);

            int LA22_0 = input.LA(1);

            if ( (LA22_0==35) ) {
                alt22=1;
            }
            } finally {dbg.exitDecision(22);}

            switch (alt22) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: f= failure
                    {
                    dbg.location(467,30);
                    pushFollow(FOLLOW_failure_in_callbacks1347);
                    f=failure();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, f.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(22);}

            dbg.location(467,40);
            char_literal39=(Token)match(input,30,FOLLOW_30_in_callbacks1350); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal39_tree = (Object)adaptor.create(char_literal39);
            adaptor.addChild(root_0, char_literal39_tree);
            }
            dbg.location(467,44);
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
        dbg.location(480, 2);

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
        public ArrayList result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "success"
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:482:1: success returns [ArrayList result] : 'success' '{' c= click ( ';' c1= click )* ( ';' )? '}' ;
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

        try { dbg.enterRule(getGrammarFileName(), "success");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(482, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:486:2: ( 'success' '{' c= click ( ';' c1= click )* ( ';' )? '}' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:486:4: 'success' '{' c= click ( ';' c1= click )* ( ';' )? '}'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(486,4);
            string_literal40=(Token)match(input,34,FOLLOW_34_in_success1373); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal40_tree = (Object)adaptor.create(string_literal40);
            adaptor.addChild(root_0, string_literal40_tree);
            }
            dbg.location(486,14);
            char_literal41=(Token)match(input,29,FOLLOW_29_in_success1375); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal41_tree = (Object)adaptor.create(char_literal41);
            adaptor.addChild(root_0, char_literal41_tree);
            }
            dbg.location(486,19);
            pushFollow(FOLLOW_click_in_success1379);
            c=click();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, c.getTree());
            dbg.location(486,26);
            if ( state.backtracking==0 ) {
              tmp_list.add((c!=null?c.result:null));
            }
            dbg.location(486,54);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:486:54: ( ';' c1= click )*
            try { dbg.enterSubRule(23);

            loop23:
            do {
                int alt23=2;
                try { dbg.enterDecision(23);

                int LA23_0 = input.LA(1);

                if ( (LA23_0==31) ) {
                    int LA23_1 = input.LA(2);

                    if ( ((LA23_1>=36 && LA23_1<=37)) ) {
                        alt23=1;
                    }


                }


                } finally {dbg.exitDecision(23);}

                switch (alt23) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:486:55: ';' c1= click
            	    {
            	    dbg.location(486,55);
            	    char_literal42=(Token)match(input,31,FOLLOW_31_in_success1385); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal42_tree = (Object)adaptor.create(char_literal42);
            	    adaptor.addChild(root_0, char_literal42_tree);
            	    }
            	    dbg.location(486,61);
            	    pushFollow(FOLLOW_click_in_success1389);
            	    c1=click();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, c1.getTree());
            	    dbg.location(486,68);
            	    if ( state.backtracking==0 ) {
            	      tmp_list.add((c1!=null?c1.result:null));
            	    }

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);
            } finally {dbg.exitSubRule(23);}

            dbg.location(486,99);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:486:99: ( ';' )?
            int alt24=2;
            try { dbg.enterSubRule(24);
            try { dbg.enterDecision(24);

            int LA24_0 = input.LA(1);

            if ( (LA24_0==31) ) {
                alt24=1;
            }
            } finally {dbg.exitDecision(24);}

            switch (alt24) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: ';'
                    {
                    dbg.location(486,99);
                    char_literal43=(Token)match(input,31,FOLLOW_31_in_success1396); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal43_tree = (Object)adaptor.create(char_literal43);
                    adaptor.addChild(root_0, char_literal43_tree);
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(24);}

            dbg.location(486,105);
            char_literal44=(Token)match(input,30,FOLLOW_30_in_success1400); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal44_tree = (Object)adaptor.create(char_literal44);
            adaptor.addChild(root_0, char_literal44_tree);
            }
            dbg.location(486,109);
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
        dbg.location(489, 2);

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
        public ArrayList result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "failure"
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:491:1: failure returns [ArrayList result] : 'failure' '{' c= click ( ';' c1= click )* ( ';' )? '}' ;
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

        try { dbg.enterRule(getGrammarFileName(), "failure");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(491, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:495:2: ( 'failure' '{' c= click ( ';' c1= click )* ( ';' )? '}' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:496:2: 'failure' '{' c= click ( ';' c1= click )* ( ';' )? '}'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(496,2);
            string_literal45=(Token)match(input,35,FOLLOW_35_in_failure1426); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal45_tree = (Object)adaptor.create(string_literal45);
            adaptor.addChild(root_0, string_literal45_tree);
            }
            dbg.location(496,12);
            char_literal46=(Token)match(input,29,FOLLOW_29_in_failure1428); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal46_tree = (Object)adaptor.create(char_literal46);
            adaptor.addChild(root_0, char_literal46_tree);
            }
            dbg.location(496,17);
            pushFollow(FOLLOW_click_in_failure1432);
            c=click();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, c.getTree());
            dbg.location(496,24);
            if ( state.backtracking==0 ) {
              tmp_list.add((c!=null?c.result:null));
            }
            dbg.location(496,52);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:496:52: ( ';' c1= click )*
            try { dbg.enterSubRule(25);

            loop25:
            do {
                int alt25=2;
                try { dbg.enterDecision(25);

                int LA25_0 = input.LA(1);

                if ( (LA25_0==31) ) {
                    int LA25_1 = input.LA(2);

                    if ( ((LA25_1>=36 && LA25_1<=37)) ) {
                        alt25=1;
                    }


                }


                } finally {dbg.exitDecision(25);}

                switch (alt25) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:496:53: ';' c1= click
            	    {
            	    dbg.location(496,53);
            	    char_literal47=(Token)match(input,31,FOLLOW_31_in_failure1438); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal47_tree = (Object)adaptor.create(char_literal47);
            	    adaptor.addChild(root_0, char_literal47_tree);
            	    }
            	    dbg.location(496,59);
            	    pushFollow(FOLLOW_click_in_failure1442);
            	    c1=click();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, c1.getTree());
            	    dbg.location(496,67);
            	    if ( state.backtracking==0 ) {
            	      tmp_list.add((c1!=null?c1.result:null));
            	    }

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);
            } finally {dbg.exitSubRule(25);}

            dbg.location(496,98);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:496:98: ( ';' )?
            int alt26=2;
            try { dbg.enterSubRule(26);
            try { dbg.enterDecision(26);

            int LA26_0 = input.LA(1);

            if ( (LA26_0==31) ) {
                alt26=1;
            }
            } finally {dbg.exitDecision(26);}

            switch (alt26) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: ';'
                    {
                    dbg.location(496,98);
                    char_literal48=(Token)match(input,31,FOLLOW_31_in_failure1450); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal48_tree = (Object)adaptor.create(char_literal48);
                    adaptor.addChild(root_0, char_literal48_tree);
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(26);}

            dbg.location(496,104);
            char_literal49=(Token)match(input,30,FOLLOW_30_in_failure1454); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal49_tree = (Object)adaptor.create(char_literal49);
            adaptor.addChild(root_0, char_literal49_tree);
            }
            dbg.location(496,107);
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
        dbg.location(499, 2);

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
        public HashMap result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "click"
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:501:1: click returns [HashMap result] : corc= ( 'click' | 'change' ) attr= VAR '=' val= STRING (cl= click_link )? ;
    public final RuleSet2Parser.click_return click() throws RecognitionException {
        RuleSet2Parser.click_return retval = new RuleSet2Parser.click_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token corc=null;
        Token attr=null;
        Token val=null;
        Token char_literal50=null;
        RuleSet2Parser.click_link_return cl = null;


        Object corc_tree=null;
        Object attr_tree=null;
        Object val_tree=null;
        Object char_literal50_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "click");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(501, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:501:31: (corc= ( 'click' | 'change' ) attr= VAR '=' val= STRING (cl= click_link )? )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:502:2: corc= ( 'click' | 'change' ) attr= VAR '=' val= STRING (cl= click_link )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(502,6);
            corc=(Token)input.LT(1);
            if ( (input.LA(1)>=36 && input.LA(1)<=37) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(corc));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }

            dbg.location(502,32);
            attr=(Token)match(input,VAR,FOLLOW_VAR_in_click1482); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            attr_tree = (Object)adaptor.create(attr);
            adaptor.addChild(root_0, attr_tree);
            }
            dbg.location(502,37);
            char_literal50=(Token)match(input,38,FOLLOW_38_in_click1484); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal50_tree = (Object)adaptor.create(char_literal50);
            adaptor.addChild(root_0, char_literal50_tree);
            }
            dbg.location(502,44);
            val=(Token)match(input,STRING,FOLLOW_STRING_in_click1488); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            val_tree = (Object)adaptor.create(val);
            adaptor.addChild(root_0, val_tree);
            }
            dbg.location(502,54);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:502:54: (cl= click_link )?
            int alt27=2;
            try { dbg.enterSubRule(27);
            try { dbg.enterDecision(27);

            int LA27_0 = input.LA(1);

            if ( (LA27_0==VAR) ) {
                alt27=1;
            }
            } finally {dbg.exitDecision(27);}

            switch (alt27) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: cl= click_link
                    {
                    dbg.location(502,54);
                    pushFollow(FOLLOW_click_link_in_click1492);
                    cl=click_link();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, cl.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(27);}

            dbg.location(502,67);
            if ( state.backtracking==0 ) {

              		HashMap tmp = new HashMap();
              		tmp.put("type",(corc!=null?corc.getText():null));
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
        dbg.location(510, 2);

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
        public HashMap result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "click_link"
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:512:1: click_link returns [HashMap result] : must_be[\"triggers\"] p= persistent_expr ;
    public final RuleSet2Parser.click_link_return click_link() throws RecognitionException {
        RuleSet2Parser.click_link_return retval = new RuleSet2Parser.click_link_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RuleSet2Parser.persistent_expr_return p = null;

        RuleSet2Parser.must_be_return must_be51 = null;



        try { dbg.enterRule(getGrammarFileName(), "click_link");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(512, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:513:2: ( must_be[\"triggers\"] p= persistent_expr )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:514:2: must_be[\"triggers\"] p= persistent_expr
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(514,2);
            pushFollow(FOLLOW_must_be_in_click_link1512);
            must_be51=must_be("triggers");

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, must_be51.getTree());
            dbg.location(514,23);
            pushFollow(FOLLOW_persistent_expr_in_click_link1517);
            p=persistent_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p.getTree());
            dbg.location(514,41);
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
        dbg.location(517, 2);

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
        public HashMap result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "persistent_expr"
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:520:1: persistent_expr returns [HashMap result] : (pc= persistent_clear_set | pi= persistent_iterate | tf= trail_forget | tm= trail_mark );
    public final RuleSet2Parser.persistent_expr_return persistent_expr() throws RecognitionException {
        RuleSet2Parser.persistent_expr_return retval = new RuleSet2Parser.persistent_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RuleSet2Parser.persistent_clear_set_return pc = null;

        RuleSet2Parser.persistent_iterate_return pi = null;

        RuleSet2Parser.trail_forget_return tf = null;

        RuleSet2Parser.trail_mark_return tm = null;



        try { dbg.enterRule(getGrammarFileName(), "persistent_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(520, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:521:2: (pc= persistent_clear_set | pi= persistent_iterate | tf= trail_forget | tm= trail_mark )
            int alt28=4;
            try { dbg.enterDecision(28);

            switch ( input.LA(1) ) {
            case VAR:
                {
                alt28=1;
                }
                break;
            case 107:
            case 108:
                {
                alt28=2;
                }
                break;
            case 40:
                {
                alt28=3;
                }
                break;
            case 41:
                {
                alt28=4;
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

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:522:2: pc= persistent_clear_set
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(522,4);
                    pushFollow(FOLLOW_persistent_clear_set_in_persistent_expr1539);
                    pc=persistent_clear_set();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pc.getTree());
                    dbg.location(522,27);
                    if ( state.backtracking==0 ) {

                      		retval.result = (pc!=null?pc.result:null);
                      	
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:525:4: pi= persistent_iterate
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(525,6);
                    pushFollow(FOLLOW_persistent_iterate_in_persistent_expr1549);
                    pi=persistent_iterate();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pi.getTree());
                    dbg.location(525,27);
                    if ( state.backtracking==0 ) {

                      		retval.result = (pi!=null?pi.result:null);
                      	
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:528:7: tf= trail_forget
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(528,9);
                    pushFollow(FOLLOW_trail_forget_in_persistent_expr1562);
                    tf=trail_forget();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, tf.getTree());
                    dbg.location(528,24);
                    if ( state.backtracking==0 ) {

                      		retval.result = (tf!=null?tf.result:null);
                      	
                    }

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:531:7: tm= trail_mark
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(531,9);
                    pushFollow(FOLLOW_trail_mark_in_persistent_expr1575);
                    tm=trail_mark();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, tm.getTree());
                    dbg.location(531,22);
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
        dbg.location(534, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "persistent_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:537:1: persistent_clear_set returns [HashMap result] : cs= must_be_one[sar(\"clear\",\"set\")] dm= var_domain ':' name= VAR ;
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

        try { dbg.enterRule(getGrammarFileName(), "persistent_clear_set");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(537, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:538:2: (cs= must_be_one[sar(\"clear\",\"set\")] dm= var_domain ':' name= VAR )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:539:2: cs= must_be_one[sar(\"clear\",\"set\")] dm= var_domain ':' name= VAR
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(539,4);
            pushFollow(FOLLOW_must_be_one_in_persistent_clear_set1600);
            cs=must_be_one(sar("clear","set"));

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cs.getTree());
            dbg.location(539,40);
            pushFollow(FOLLOW_var_domain_in_persistent_clear_set1606);
            dm=var_domain();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, dm.getTree());
            dbg.location(539,52);
            char_literal52=(Token)match(input,39,FOLLOW_39_in_persistent_clear_set1608); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal52_tree = (Object)adaptor.create(char_literal52);
            adaptor.addChild(root_0, char_literal52_tree);
            }
            dbg.location(539,60);
            name=(Token)match(input,VAR,FOLLOW_VAR_in_persistent_clear_set1612); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            name_tree = (Object)adaptor.create(name);
            adaptor.addChild(root_0, name_tree);
            }
            dbg.location(539,65);
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
        dbg.location(547, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "persistent_clear_set");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:550:1: persistent_iterate returns [HashMap result] : dm= var_domain ':' name= VAR op= counter_op v= expr from= counter_start ;
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

        try { dbg.enterRule(getGrammarFileName(), "persistent_iterate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(550, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:551:2: (dm= var_domain ':' name= VAR op= counter_op v= expr from= counter_start )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:552:2: dm= var_domain ':' name= VAR op= counter_op v= expr from= counter_start
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(552,4);
            pushFollow(FOLLOW_var_domain_in_persistent_iterate1633);
            dm=var_domain();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, dm.getTree());
            dbg.location(552,16);
            char_literal53=(Token)match(input,39,FOLLOW_39_in_persistent_iterate1635); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal53_tree = (Object)adaptor.create(char_literal53);
            adaptor.addChild(root_0, char_literal53_tree);
            }
            dbg.location(552,24);
            name=(Token)match(input,VAR,FOLLOW_VAR_in_persistent_iterate1639); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            name_tree = (Object)adaptor.create(name);
            adaptor.addChild(root_0, name_tree);
            }
            dbg.location(552,31);
            pushFollow(FOLLOW_counter_op_in_persistent_iterate1643);
            op=counter_op();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, op.getTree());
            dbg.location(552,44);
            pushFollow(FOLLOW_expr_in_persistent_iterate1647);
            v=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, v.getTree());
            dbg.location(552,54);
            pushFollow(FOLLOW_counter_start_in_persistent_iterate1651);
            from=counter_start();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, from.getTree());
            dbg.location(552,69);
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
        dbg.location(563, 2);

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
        public HashMap result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "trail_forget"
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:565:1: trail_forget returns [HashMap result] : 'forget' what= STRING must_be[\"in\"] dm= var_domain ':' name= VAR ;
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

        try { dbg.enterRule(getGrammarFileName(), "trail_forget");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(565, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:566:2: ( 'forget' what= STRING must_be[\"in\"] dm= var_domain ':' name= VAR )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:567:2: 'forget' what= STRING must_be[\"in\"] dm= var_domain ':' name= VAR
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(567,2);
            string_literal54=(Token)match(input,40,FOLLOW_40_in_trail_forget1669); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal54_tree = (Object)adaptor.create(string_literal54);
            adaptor.addChild(root_0, string_literal54_tree);
            }
            dbg.location(567,16);
            what=(Token)match(input,STRING,FOLLOW_STRING_in_trail_forget1674); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            what_tree = (Object)adaptor.create(what);
            adaptor.addChild(root_0, what_tree);
            }
            dbg.location(567,24);
            pushFollow(FOLLOW_must_be_in_trail_forget1676);
            must_be55=must_be("in");

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, must_be55.getTree());
            dbg.location(567,41);
            pushFollow(FOLLOW_var_domain_in_trail_forget1682);
            dm=var_domain();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, dm.getTree());
            dbg.location(567,53);
            char_literal56=(Token)match(input,39,FOLLOW_39_in_trail_forget1684); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal56_tree = (Object)adaptor.create(char_literal56);
            adaptor.addChild(root_0, char_literal56_tree);
            }
            dbg.location(567,61);
            name=(Token)match(input,VAR,FOLLOW_VAR_in_trail_forget1688); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            name_tree = (Object)adaptor.create(name);
            adaptor.addChild(root_0, name_tree);
            }
            dbg.location(567,67);
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
        dbg.location(577, 2);

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
        public HashMap result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "trail_mark"
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:579:1: trail_mark returns [HashMap result] : 'mark' dm= var_domain ':' name= VAR (t= trail_with )? ;
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

        try { dbg.enterRule(getGrammarFileName(), "trail_mark");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(579, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:580:2: ( 'mark' dm= var_domain ':' name= VAR (t= trail_with )? )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:581:2: 'mark' dm= var_domain ':' name= VAR (t= trail_with )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(581,2);
            string_literal57=(Token)match(input,41,FOLLOW_41_in_trail_mark1707); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal57_tree = (Object)adaptor.create(string_literal57);
            adaptor.addChild(root_0, string_literal57_tree);
            }
            dbg.location(581,11);
            pushFollow(FOLLOW_var_domain_in_trail_mark1711);
            dm=var_domain();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, dm.getTree());
            dbg.location(581,23);
            char_literal58=(Token)match(input,39,FOLLOW_39_in_trail_mark1713); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal58_tree = (Object)adaptor.create(char_literal58);
            adaptor.addChild(root_0, char_literal58_tree);
            }
            dbg.location(581,31);
            name=(Token)match(input,VAR,FOLLOW_VAR_in_trail_mark1717); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            name_tree = (Object)adaptor.create(name);
            adaptor.addChild(root_0, name_tree);
            }
            dbg.location(581,37);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:581:37: (t= trail_with )?
            int alt29=2;
            try { dbg.enterSubRule(29);
            try { dbg.enterDecision(29);

            int LA29_0 = input.LA(1);

            if ( (LA29_0==42) ) {
                alt29=1;
            }
            } finally {dbg.exitDecision(29);}

            switch (alt29) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: t= trail_with
                    {
                    dbg.location(581,37);
                    pushFollow(FOLLOW_trail_with_in_trail_mark1721);
                    t=trail_with();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, t.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(29);}

            dbg.location(581,50);
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
        dbg.location(591, 2);

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
        public Object result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "trail_with"
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:593:1: trail_with returns [Object result] : 'with' e= expr ;
    public final RuleSet2Parser.trail_with_return trail_with() throws RecognitionException {
        RuleSet2Parser.trail_with_return retval = new RuleSet2Parser.trail_with_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal59=null;
        RuleSet2Parser.expr_return e = null;


        Object string_literal59_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "trail_with");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(593, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:594:2: ( 'with' e= expr )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:595:2: 'with' e= expr
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(595,2);
            string_literal59=(Token)match(input,42,FOLLOW_42_in_trail_with1740); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal59_tree = (Object)adaptor.create(string_literal59);
            adaptor.addChild(root_0, string_literal59_tree);
            }
            dbg.location(595,10);
            pushFollow(FOLLOW_expr_in_trail_with1744);
            e=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
            dbg.location(595,16);
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
        dbg.location(598, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:600:1: counter_op : ( '+=' | '-=' );
    public final RuleSet2Parser.counter_op_return counter_op() throws RecognitionException {
        RuleSet2Parser.counter_op_return retval = new RuleSet2Parser.counter_op_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set60=null;

        Object set60_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "counter_op");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(600, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:601:2: ( '+=' | '-=' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(601,2);
            set60=(Token)input.LT(1);
            if ( (input.LA(1)>=43 && input.LA(1)<=44) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set60));
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
        dbg.location(604, 9);

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
        public Object result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "counter_start"
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:606:1: counter_start returns [Object result] : must_be[\"from\"] e= expr ;
    public final RuleSet2Parser.counter_start_return counter_start() throws RecognitionException {
        RuleSet2Parser.counter_start_return retval = new RuleSet2Parser.counter_start_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RuleSet2Parser.expr_return e = null;

        RuleSet2Parser.must_be_return must_be61 = null;



        try { dbg.enterRule(getGrammarFileName(), "counter_start");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(606, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:607:2: ( must_be[\"from\"] e= expr )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:608:2: must_be[\"from\"] e= expr
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(608,2);
            pushFollow(FOLLOW_must_be_in_counter_start1794);
            must_be61=must_be("from");

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, must_be61.getTree());
            dbg.location(608,19);
            pushFollow(FOLLOW_expr_in_counter_start1799);
            e=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
            dbg.location(608,25);
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
        dbg.location(611, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "counter_start");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:614:1: for_clause returns [String result] : 'for' v= VAR ;
    public final RuleSet2Parser.for_clause_return for_clause() throws RecognitionException {
        RuleSet2Parser.for_clause_return retval = new RuleSet2Parser.for_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token v=null;
        Token string_literal62=null;

        Object v_tree=null;
        Object string_literal62_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "for_clause");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(614, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:615:2: ( 'for' v= VAR )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:616:2: 'for' v= VAR
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(616,2);
            string_literal62=(Token)match(input,45,FOLLOW_45_in_for_clause1820); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal62_tree = (Object)adaptor.create(string_literal62);
            adaptor.addChild(root_0, string_literal62_tree);
            }
            dbg.location(616,10);
            v=(Token)match(input,VAR,FOLLOW_VAR_in_for_clause1825); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            v_tree = (Object)adaptor.create(v);
            adaptor.addChild(root_0, v_tree);
            }
            dbg.location(617,2);
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
        dbg.location(620, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "for_clause");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "for_clause"

    public static class action_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "action"
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:630:1: action[HashMap result] : ( conditional_action[result] | unconditional_action[result] ) ( ';' )? ;
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

        try { dbg.enterRule(getGrammarFileName(), "action");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(630, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:639:2: ( ( conditional_action[result] | unconditional_action[result] ) ( ';' )? )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:640:2: ( conditional_action[result] | unconditional_action[result] ) ( ';' )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(640,2);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:640:2: ( conditional_action[result] | unconditional_action[result] )
            int alt30=2;
            try { dbg.enterSubRule(30);
            try { dbg.enterDecision(30);

            int LA30_0 = input.LA(1);

            if ( (LA30_0==32) ) {
                alt30=1;
            }
            else if ( (LA30_0==VAR||LA30_0==29||LA30_0==112) ) {
                alt30=2;
            }
            else {
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

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:640:3: conditional_action[result]
                    {
                    dbg.location(640,3);
                    pushFollow(FOLLOW_conditional_action_in_action1859);
                    conditional_action63=conditional_action(result);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditional_action63.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:640:32: unconditional_action[result]
                    {
                    dbg.location(640,32);
                    pushFollow(FOLLOW_unconditional_action_in_action1864);
                    unconditional_action64=unconditional_action(result);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unconditional_action64.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(30);}

            dbg.location(640,62);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:640:62: ( ';' )?
            int alt31=2;
            try { dbg.enterSubRule(31);
            try { dbg.enterDecision(31);

            int LA31_0 = input.LA(1);

            if ( (LA31_0==31) ) {
                int LA31_1 = input.LA(2);

                if ( (synpred51_RuleSet2()) ) {
                    alt31=1;
                }
            }
            } finally {dbg.exitDecision(31);}

            switch (alt31) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: ';'
                    {
                    dbg.location(640,62);
                    char_literal65=(Token)match(input,31,FOLLOW_31_in_action1868); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal65_tree = (Object)adaptor.create(char_literal65);
                    adaptor.addChild(root_0, char_literal65_tree);
                    }

                    }
                    break;

            }
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
        }
        dbg.location(641, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:644:1: conditional_action[HashMap result] : 'if' (e= expr )? must_be[\"then\"] unconditional_action[result] ;
    public final RuleSet2Parser.conditional_action_return conditional_action(HashMap result) throws RecognitionException {
        RuleSet2Parser.conditional_action_return retval = new RuleSet2Parser.conditional_action_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal66=null;
        RuleSet2Parser.expr_return e = null;

        RuleSet2Parser.must_be_return must_be67 = null;

        RuleSet2Parser.unconditional_action_return unconditional_action68 = null;


        Object string_literal66_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "conditional_action");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(644, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:645:2: ( 'if' (e= expr )? must_be[\"then\"] unconditional_action[result] )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:645:4: 'if' (e= expr )? must_be[\"then\"] unconditional_action[result]
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(645,4);
            string_literal66=(Token)match(input,32,FOLLOW_32_in_conditional_action1885); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal66_tree = (Object)adaptor.create(string_literal66);
            adaptor.addChild(root_0, string_literal66_tree);
            }
            dbg.location(645,10);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:645:10: (e= expr )?
            int alt32=2;
            try { dbg.enterSubRule(32);
            try { dbg.enterDecision(32);

            int LA32_0 = input.LA(1);

            if ( (LA32_0==INT||LA32_0==FLOAT||(LA32_0>=STRING && LA32_0<=REGEXP)||LA32_0==29||LA32_0==47||LA32_0==57||LA32_0==71||LA32_0==78||(LA32_0>=101 && LA32_0<=103)||(LA32_0>=105 && LA32_0<=108)) ) {
                alt32=1;
            }
            else if ( (LA32_0==VAR) ) {
                int LA32_2 = input.LA(2);

                if ( ((LA32_2>=18 && LA32_2<=28)||LA32_2==39||(LA32_2>=46 && LA32_2<=47)||(LA32_2>=73 && LA32_2<=77)||(LA32_2>=79 && LA32_2<=100)||LA32_2==103) ) {
                    alt32=1;
                }
                else if ( (LA32_2==VAR) ) {
                    int LA32_3 = input.LA(3);

                    if ( (synpred52_RuleSet2()) ) {
                        alt32=1;
                    }
                }
            }
            } finally {dbg.exitDecision(32);}

            switch (alt32) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: e= expr
                    {
                    dbg.location(645,10);
                    pushFollow(FOLLOW_expr_in_conditional_action1889);
                    e=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(32);}

            dbg.location(645,17);
            pushFollow(FOLLOW_must_be_in_conditional_action1892);
            must_be67=must_be("then");

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, must_be67.getTree());
            dbg.location(645,33);
            pushFollow(FOLLOW_unconditional_action_in_conditional_action1895);
            unconditional_action68=unconditional_action(result);

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unconditional_action68.getTree());
            dbg.location(645,63);
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
        dbg.location(658, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:660:1: unconditional_action[HashMap result] : (p= primrule | action_block[result] );
    public final RuleSet2Parser.unconditional_action_return unconditional_action(HashMap result) throws RecognitionException {
        RuleSet2Parser.unconditional_action_return retval = new RuleSet2Parser.unconditional_action_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RuleSet2Parser.primrule_return p = null;

        RuleSet2Parser.action_block_return action_block69 = null;



         
        	ArrayList temp_list = new ArrayList(); 

        try { dbg.enterRule(getGrammarFileName(), "unconditional_action");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(660, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:664:2: (p= primrule | action_block[result] )
            int alt33=2;
            try { dbg.enterDecision(33);

            switch ( input.LA(1) ) {
            case VAR:
                {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==39||(LA33_1>=46 && LA33_1<=47)) ) {
                    alt33=1;
                }
                else if ( (LA33_1==29) ) {
                    alt33=2;
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
            case 112:
                {
                alt33=1;
                }
                break;
            case 29:
                {
                alt33=2;
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

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:664:4: p= primrule
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(664,5);
                    pushFollow(FOLLOW_primrule_in_unconditional_action1920);
                    p=primrule();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p.getTree());
                    dbg.location(664,15);
                    if ( state.backtracking==0 ) {
                      temp_list.add((p!=null?p.result:null)); result.put("actions",temp_list);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:665:6: action_block[result]
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(665,6);
                    pushFollow(FOLLOW_action_block_in_unconditional_action1930);
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
        dbg.location(666, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "unconditional_action");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "unconditional_action"

    public static class action_block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "action_block"
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:668:1: action_block[HashMap result] : (at= must_be_one[sar(\"choose\",\"every\")] )? '{' (p= primrule ( ';' p= primrule )* ) ( ';' )? '}' ;
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

        try { dbg.enterRule(getGrammarFileName(), "action_block");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(668, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:672:2: ( (at= must_be_one[sar(\"choose\",\"every\")] )? '{' (p= primrule ( ';' p= primrule )* ) ( ';' )? '}' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:672:4: (at= must_be_one[sar(\"choose\",\"every\")] )? '{' (p= primrule ( ';' p= primrule )* ) ( ';' )? '}'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(672,6);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:672:6: (at= must_be_one[sar(\"choose\",\"every\")] )?
            int alt34=2;
            try { dbg.enterSubRule(34);
            try { dbg.enterDecision(34);

            int LA34_0 = input.LA(1);

            if ( (LA34_0==VAR) ) {
                alt34=1;
            }
            } finally {dbg.exitDecision(34);}

            switch (alt34) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: at= must_be_one[sar(\"choose\",\"every\")]
                    {
                    dbg.location(672,6);
                    pushFollow(FOLLOW_must_be_one_in_action_block1956);
                    at=must_be_one(sar("choose","every"));

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, at.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(34);}

            dbg.location(672,43);
            if ( state.backtracking==0 ) {
              result.put("blocktype",(at!=null?input.toString(at.start,at.stop):null)); 
            }
            dbg.location(673,3);
            char_literal70=(Token)match(input,29,FOLLOW_29_in_action_block1966); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal70_tree = (Object)adaptor.create(char_literal70);
            adaptor.addChild(root_0, char_literal70_tree);
            }
            dbg.location(673,7);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:673:7: (p= primrule ( ';' p= primrule )* )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:673:8: p= primrule ( ';' p= primrule )*
            {
            dbg.location(673,9);
            pushFollow(FOLLOW_primrule_in_action_block1971);
            p=primrule();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p.getTree());
            dbg.location(673,19);
            if ( state.backtracking==0 ) {
              temp_list.add((p!=null?p.result:null));
            }
            dbg.location(674,4);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:674:4: ( ';' p= primrule )*
            try { dbg.enterSubRule(35);

            loop35:
            do {
                int alt35=2;
                try { dbg.enterDecision(35);

                int LA35_0 = input.LA(1);

                if ( (LA35_0==31) ) {
                    int LA35_1 = input.LA(2);

                    if ( (LA35_1==VAR||LA35_1==112) ) {
                        alt35=1;
                    }


                }


                } finally {dbg.exitDecision(35);}

                switch (alt35) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:674:5: ';' p= primrule
            	    {
            	    dbg.location(674,5);
            	    char_literal71=(Token)match(input,31,FOLLOW_31_in_action_block1981); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal71_tree = (Object)adaptor.create(char_literal71);
            	    adaptor.addChild(root_0, char_literal71_tree);
            	    }
            	    dbg.location(674,10);
            	    pushFollow(FOLLOW_primrule_in_action_block1985);
            	    p=primrule();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p.getTree());
            	    dbg.location(674,19);
            	    if ( state.backtracking==0 ) {
            	      temp_list.add((p!=null?p.result:null));
            	    }

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);
            } finally {dbg.exitSubRule(35);}


            }

            dbg.location(674,51);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:674:51: ( ';' )?
            int alt36=2;
            try { dbg.enterSubRule(36);
            try { dbg.enterDecision(36);

            int LA36_0 = input.LA(1);

            if ( (LA36_0==31) ) {
                alt36=1;
            }
            } finally {dbg.exitDecision(36);}

            switch (alt36) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: ';'
                    {
                    dbg.location(674,51);
                    char_literal72=(Token)match(input,31,FOLLOW_31_in_action_block1992); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal72_tree = (Object)adaptor.create(char_literal72);
                    adaptor.addChild(root_0, char_literal72_tree);
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(36);}

            dbg.location(674,56);
            char_literal73=(Token)match(input,30,FOLLOW_30_in_action_block1995); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal73_tree = (Object)adaptor.create(char_literal73);
            adaptor.addChild(root_0, char_literal73_tree);
            }
            dbg.location(674,60);
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
        dbg.location(677, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "action_block");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:679:1: primrule returns [HashMap result] : (label= VAR '=>' )? ( (src= namespace )? name= VAR '(' (ex= expr ( ',' ex1= expr )* )? ( ',' )? ')' (m= modifier_clause )? | e= emit_block ) ;
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

        try { dbg.enterRule(getGrammarFileName(), "primrule");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(679, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:683:2: ( (label= VAR '=>' )? ( (src= namespace )? name= VAR '(' (ex= expr ( ',' ex1= expr )* )? ( ',' )? ')' (m= modifier_clause )? | e= emit_block ) )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:683:5: (label= VAR '=>' )? ( (src= namespace )? name= VAR '(' (ex= expr ( ',' ex1= expr )* )? ( ',' )? ')' (m= modifier_clause )? | e= emit_block )
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(683,5);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:683:5: (label= VAR '=>' )?
            int alt37=2;
            try { dbg.enterSubRule(37);
            try { dbg.enterDecision(37);

            int LA37_0 = input.LA(1);

            if ( (LA37_0==VAR) ) {
                int LA37_1 = input.LA(2);

                if ( (LA37_1==46) ) {
                    alt37=1;
                }
            }
            } finally {dbg.exitDecision(37);}

            switch (alt37) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:683:6: label= VAR '=>'
                    {
                    dbg.location(683,11);
                    label=(Token)match(input,VAR,FOLLOW_VAR_in_primrule2022); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    label_tree = (Object)adaptor.create(label);
                    adaptor.addChild(root_0, label_tree);
                    }
                    dbg.location(683,16);
                    string_literal74=(Token)match(input,46,FOLLOW_46_in_primrule2024); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal74_tree = (Object)adaptor.create(string_literal74);
                    adaptor.addChild(root_0, string_literal74_tree);
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(37);}

            dbg.location(683,23);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:683:23: ( (src= namespace )? name= VAR '(' (ex= expr ( ',' ex1= expr )* )? ( ',' )? ')' (m= modifier_clause )? | e= emit_block )
            int alt43=2;
            try { dbg.enterSubRule(43);
            try { dbg.enterDecision(43);

            int LA43_0 = input.LA(1);

            if ( (LA43_0==VAR) ) {
                alt43=1;
            }
            else if ( (LA43_0==112) ) {
                alt43=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(43);}

            switch (alt43) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:684:4: (src= namespace )? name= VAR '(' (ex= expr ( ',' ex1= expr )* )? ( ',' )? ')' (m= modifier_clause )?
                    {
                    dbg.location(684,7);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:684:7: (src= namespace )?
                    int alt38=2;
                    try { dbg.enterSubRule(38);
                    try { dbg.enterDecision(38);

                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==VAR) ) {
                        int LA38_1 = input.LA(2);

                        if ( (LA38_1==39) ) {
                            alt38=1;
                        }
                    }
                    } finally {dbg.exitDecision(38);}

                    switch (alt38) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: src= namespace
                            {
                            dbg.location(684,7);
                            pushFollow(FOLLOW_namespace_in_primrule2035);
                            src=namespace();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, src.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(38);}

                    dbg.location(684,23);
                    name=(Token)match(input,VAR,FOLLOW_VAR_in_primrule2040); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    name_tree = (Object)adaptor.create(name);
                    adaptor.addChild(root_0, name_tree);
                    }
                    dbg.location(684,28);
                    char_literal75=(Token)match(input,47,FOLLOW_47_in_primrule2042); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal75_tree = (Object)adaptor.create(char_literal75);
                    adaptor.addChild(root_0, char_literal75_tree);
                    }
                    dbg.location(684,32);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:684:32: (ex= expr ( ',' ex1= expr )* )?
                    int alt40=2;
                    try { dbg.enterSubRule(40);
                    try { dbg.enterDecision(40);

                    int LA40_0 = input.LA(1);

                    if ( ((LA40_0>=VAR && LA40_0<=INT)||LA40_0==FLOAT||(LA40_0>=STRING && LA40_0<=REGEXP)||LA40_0==29||LA40_0==47||LA40_0==57||LA40_0==71||LA40_0==78||(LA40_0>=101 && LA40_0<=103)||(LA40_0>=105 && LA40_0<=108)) ) {
                        alt40=1;
                    }
                    } finally {dbg.exitDecision(40);}

                    switch (alt40) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:684:33: ex= expr ( ',' ex1= expr )*
                            {
                            dbg.location(684,35);
                            pushFollow(FOLLOW_expr_in_primrule2047);
                            ex=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, ex.getTree());
                            dbg.location(684,40);
                            if ( state.backtracking==0 ) {
                              temp_list.add((ex!=null?ex.result:null));
                            }
                            dbg.location(684,70);
                            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:684:70: ( ',' ex1= expr )*
                            try { dbg.enterSubRule(39);

                            loop39:
                            do {
                                int alt39=2;
                                try { dbg.enterDecision(39);

                                int LA39_0 = input.LA(1);

                                if ( (LA39_0==48) ) {
                                    int LA39_1 = input.LA(2);

                                    if ( ((LA39_1>=VAR && LA39_1<=INT)||LA39_1==FLOAT||(LA39_1>=STRING && LA39_1<=REGEXP)||LA39_1==29||LA39_1==47||LA39_1==57||LA39_1==71||LA39_1==78||(LA39_1>=101 && LA39_1<=103)||(LA39_1>=105 && LA39_1<=108)) ) {
                                        alt39=1;
                                    }


                                }


                                } finally {dbg.exitDecision(39);}

                                switch (alt39) {
                            	case 1 :
                            	    dbg.enterAlt(1);

                            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:684:71: ',' ex1= expr
                            	    {
                            	    dbg.location(684,71);
                            	    char_literal76=(Token)match(input,48,FOLLOW_48_in_primrule2052); if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) {
                            	    char_literal76_tree = (Object)adaptor.create(char_literal76);
                            	    adaptor.addChild(root_0, char_literal76_tree);
                            	    }
                            	    dbg.location(684,78);
                            	    pushFollow(FOLLOW_expr_in_primrule2056);
                            	    ex1=expr();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, ex1.getTree());
                            	    dbg.location(684,83);
                            	    if ( state.backtracking==0 ) {
                            	      temp_list.add((ex1!=null?ex1.result:null));
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop39;
                                }
                            } while (true);
                            } finally {dbg.exitSubRule(39);}


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(40);}

                    dbg.location(684,118);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:684:118: ( ',' )?
                    int alt41=2;
                    try { dbg.enterSubRule(41);
                    try { dbg.enterDecision(41);

                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==48) ) {
                        alt41=1;
                    }
                    } finally {dbg.exitDecision(41);}

                    switch (alt41) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: ','
                            {
                            dbg.location(684,118);
                            char_literal77=(Token)match(input,48,FOLLOW_48_in_primrule2064); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal77_tree = (Object)adaptor.create(char_literal77);
                            adaptor.addChild(root_0, char_literal77_tree);
                            }

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(41);}

                    dbg.location(684,124);
                    char_literal78=(Token)match(input,49,FOLLOW_49_in_primrule2068); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal78_tree = (Object)adaptor.create(char_literal78);
                    adaptor.addChild(root_0, char_literal78_tree);
                    }
                    dbg.location(684,129);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:684:129: (m= modifier_clause )?
                    int alt42=2;
                    try { dbg.enterSubRule(42);
                    try { dbg.enterDecision(42);

                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==42) ) {
                        alt42=1;
                    }
                    } finally {dbg.exitDecision(42);}

                    switch (alt42) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: m= modifier_clause
                            {
                            dbg.location(684,129);
                            pushFollow(FOLLOW_modifier_clause_in_primrule2072);
                            m=modifier_clause();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, m.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(42);}

                    dbg.location(684,147);
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
                      			retval.result = tmp2;
                      		 	
                      		 
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:700:4: e= emit_block
                    {
                    dbg.location(700,5);
                    pushFollow(FOLLOW_emit_block_in_primrule2082);
                    e=emit_block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
                    dbg.location(700,17);
                    if ( state.backtracking==0 ) {
                       
                      			HashMap tmp = new HashMap();
                      			tmp.put("emit",(e!=null?e.emit_value:null));
                      			retval.result = tmp;
                      		
                    }

                    }
                    break;

            }
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
        dbg.location(707, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "primrule");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:710:1: modifier_clause returns [ArrayList result] : 'with' m= modifier ( 'and' m1= modifier )* ;
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

        try { dbg.enterRule(getGrammarFileName(), "modifier_clause");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(710, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:714:2: ( 'with' m= modifier ( 'and' m1= modifier )* )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:715:2: 'with' m= modifier ( 'and' m1= modifier )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(715,2);
            string_literal79=(Token)match(input,42,FOLLOW_42_in_modifier_clause2116); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal79_tree = (Object)adaptor.create(string_literal79);
            adaptor.addChild(root_0, string_literal79_tree);
            }
            dbg.location(715,10);
            pushFollow(FOLLOW_modifier_in_modifier_clause2120);
            m=modifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, m.getTree());
            dbg.location(715,20);
            if ( state.backtracking==0 ) {
              temp_list.add((m!=null?m.result:null));
            }
            dbg.location(715,48);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:715:48: ( 'and' m1= modifier )*
            try { dbg.enterSubRule(44);

            loop44:
            do {
                int alt44=2;
                try { dbg.enterDecision(44);

                int LA44_0 = input.LA(1);

                if ( (LA44_0==50) ) {
                    alt44=1;
                }


                } finally {dbg.exitDecision(44);}

                switch (alt44) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:715:49: 'and' m1= modifier
            	    {
            	    dbg.location(715,49);
            	    string_literal80=(Token)match(input,50,FOLLOW_50_in_modifier_clause2125); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal80_tree = (Object)adaptor.create(string_literal80);
            	    adaptor.addChild(root_0, string_literal80_tree);
            	    }
            	    dbg.location(715,57);
            	    pushFollow(FOLLOW_modifier_in_modifier_clause2129);
            	    m1=modifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, m1.getTree());
            	    dbg.location(715,67);
            	    if ( state.backtracking==0 ) {
            	      temp_list.add((m1!=null?m1.result:null));
            	    }

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);
            } finally {dbg.exitSubRule(44);}

            dbg.location(716,2);
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
        dbg.location(719, 2);

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
        public HashMap result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "modifier"
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:721:1: modifier returns [HashMap result] : name= VAR '=' (e= expr | j= JS ) ;
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

        try { dbg.enterRule(getGrammarFileName(), "modifier");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(721, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:722:2: (name= VAR '=' (e= expr | j= JS ) )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:722:4: name= VAR '=' (e= expr | j= JS )
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(722,8);
            name=(Token)match(input,VAR,FOLLOW_VAR_in_modifier2154); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            name_tree = (Object)adaptor.create(name);
            adaptor.addChild(root_0, name_tree);
            }
            dbg.location(722,13);
            char_literal81=(Token)match(input,38,FOLLOW_38_in_modifier2156); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal81_tree = (Object)adaptor.create(char_literal81);
            adaptor.addChild(root_0, char_literal81_tree);
            }
            dbg.location(722,17);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:722:17: (e= expr | j= JS )
            int alt45=2;
            try { dbg.enterSubRule(45);
            try { dbg.enterDecision(45);

            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=VAR && LA45_0<=INT)||LA45_0==FLOAT||(LA45_0>=STRING && LA45_0<=REGEXP)||LA45_0==29||LA45_0==47||LA45_0==57||LA45_0==71||LA45_0==78||(LA45_0>=101 && LA45_0<=103)||(LA45_0>=105 && LA45_0<=108)) ) {
                alt45=1;
            }
            else if ( (LA45_0==JS) ) {
                alt45=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(45);}

            switch (alt45) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:722:18: e= expr
                    {
                    dbg.location(722,19);
                    pushFollow(FOLLOW_expr_in_modifier2161);
                    e=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:722:27: j= JS
                    {
                    dbg.location(722,28);
                    j=(Token)match(input,JS,FOLLOW_JS_in_modifier2167); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    j_tree = (Object)adaptor.create(j);
                    adaptor.addChild(root_0, j_tree);
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(45);}

            dbg.location(722,33);
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
        dbg.location(740, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "modifier");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:749:1: using returns [HashMap result] : 'using' p= ( STRING | REGEXP ) (s= setting )? ;
    public final RuleSet2Parser.using_return using() throws RecognitionException {
        RuleSet2Parser.using_return retval = new RuleSet2Parser.using_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token p=null;
        Token string_literal82=null;
        RuleSet2Parser.setting_return s = null;


        Object p_tree=null;
        Object string_literal82_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "using");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(749, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:750:2: ( 'using' p= ( STRING | REGEXP ) (s= setting )? )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:750:4: 'using' p= ( STRING | REGEXP ) (s= setting )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(750,4);
            string_literal82=(Token)match(input,51,FOLLOW_51_in_using2192); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal82_tree = (Object)adaptor.create(string_literal82);
            adaptor.addChild(root_0, string_literal82_tree);
            }
            dbg.location(750,13);
            p=(Token)input.LT(1);
            if ( (input.LA(1)>=STRING && input.LA(1)<=REGEXP) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(p));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }

            dbg.location(750,31);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:750:31: (s= setting )?
            int alt46=2;
            try { dbg.enterSubRule(46);
            try { dbg.enterDecision(46);

            int LA46_0 = input.LA(1);

            if ( (LA46_0==52) ) {
                alt46=1;
            }
            } finally {dbg.exitDecision(46);}

            switch (alt46) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: s= setting
                    {
                    dbg.location(750,31);
                    pushFollow(FOLLOW_setting_in_using2204);
                    s=setting();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, s.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(46);}

            dbg.location(750,41);
            if ( state.backtracking==0 ) {

              			HashMap tmp = new HashMap();
              			tmp.put("op","pageview");
              			HashMap evt_expr = new HashMap();
              			evt_expr.put("pattern",strip_string((p!=null?p.getText():null)));
              			evt_expr.put("lagacy",1);
              			evt_expr.put("type","prim_event");
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
        dbg.location(762, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "using");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:764:1: setting returns [ArrayList result] : 'setting' '(' (v= VAR ( ',' v2= VAR )* )? ')' ;
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

        try { dbg.enterRule(getGrammarFileName(), "setting");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(764, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:768:2: ( 'setting' '(' (v= VAR ( ',' v2= VAR )* )? ')' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:768:4: 'setting' '(' (v= VAR ( ',' v2= VAR )* )? ')'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(768,4);
            string_literal83=(Token)match(input,52,FOLLOW_52_in_setting2225); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal83_tree = (Object)adaptor.create(string_literal83);
            adaptor.addChild(root_0, string_literal83_tree);
            }
            dbg.location(768,14);
            char_literal84=(Token)match(input,47,FOLLOW_47_in_setting2227); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal84_tree = (Object)adaptor.create(char_literal84);
            adaptor.addChild(root_0, char_literal84_tree);
            }
            dbg.location(768,18);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:768:18: (v= VAR ( ',' v2= VAR )* )?
            int alt48=2;
            try { dbg.enterSubRule(48);
            try { dbg.enterDecision(48);

            int LA48_0 = input.LA(1);

            if ( (LA48_0==VAR) ) {
                alt48=1;
            }
            } finally {dbg.exitDecision(48);}

            switch (alt48) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:768:19: v= VAR ( ',' v2= VAR )*
                    {
                    dbg.location(768,20);
                    v=(Token)match(input,VAR,FOLLOW_VAR_in_setting2232); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    v_tree = (Object)adaptor.create(v);
                    adaptor.addChild(root_0, v_tree);
                    }
                    dbg.location(768,24);
                    if ( state.backtracking==0 ) {
                      sresult.add((v!=null?v.getText():null));
                    }
                    dbg.location(768,48);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:768:48: ( ',' v2= VAR )*
                    try { dbg.enterSubRule(47);

                    loop47:
                    do {
                        int alt47=2;
                        try { dbg.enterDecision(47);

                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==48) ) {
                            alt47=1;
                        }


                        } finally {dbg.exitDecision(47);}

                        switch (alt47) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:768:49: ',' v2= VAR
                    	    {
                    	    dbg.location(768,49);
                    	    char_literal85=(Token)match(input,48,FOLLOW_48_in_setting2236); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal85_tree = (Object)adaptor.create(char_literal85);
                    	    adaptor.addChild(root_0, char_literal85_tree);
                    	    }
                    	    dbg.location(768,55);
                    	    v2=(Token)match(input,VAR,FOLLOW_VAR_in_setting2240); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    v2_tree = (Object)adaptor.create(v2);
                    	    adaptor.addChild(root_0, v2_tree);
                    	    }
                    	    dbg.location(768,59);
                    	    if ( state.backtracking==0 ) {
                    	      sresult.add((v2!=null?v2.getText():null));
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(47);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(48);}

            dbg.location(768,89);
            char_literal86=(Token)match(input,49,FOLLOW_49_in_setting2248); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal86_tree = (Object)adaptor.create(char_literal86);
            adaptor.addChild(root_0, char_literal86_tree);
            }
            dbg.location(768,93);
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
        dbg.location(771, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "setting");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:774:1: pre_block returns [ArrayList result] : 'pre' '{' ( decl[tmp] ( ';' decl[tmp] )* )? ( ';' )? '}' ;
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

        try { dbg.enterRule(getGrammarFileName(), "pre_block");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(774, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:777:3: ( 'pre' '{' ( decl[tmp] ( ';' decl[tmp] )* )? ( ';' )? '}' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:778:3: 'pre' '{' ( decl[tmp] ( ';' decl[tmp] )* )? ( ';' )? '}'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(778,3);
            string_literal87=(Token)match(input,53,FOLLOW_53_in_pre_block2273); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal87_tree = (Object)adaptor.create(string_literal87);
            adaptor.addChild(root_0, string_literal87_tree);
            }
            dbg.location(778,9);
            char_literal88=(Token)match(input,29,FOLLOW_29_in_pre_block2275); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal88_tree = (Object)adaptor.create(char_literal88);
            adaptor.addChild(root_0, char_literal88_tree);
            }
            dbg.location(778,13);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:778:13: ( decl[tmp] ( ';' decl[tmp] )* )?
            int alt50=2;
            try { dbg.enterSubRule(50);
            try { dbg.enterDecision(50);

            int LA50_0 = input.LA(1);

            if ( (LA50_0==VAR) ) {
                alt50=1;
            }
            } finally {dbg.exitDecision(50);}

            switch (alt50) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:778:15: decl[tmp] ( ';' decl[tmp] )*
                    {
                    dbg.location(778,15);
                    pushFollow(FOLLOW_decl_in_pre_block2279);
                    decl89=decl(tmp);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, decl89.getTree());
                    dbg.location(778,25);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:778:25: ( ';' decl[tmp] )*
                    try { dbg.enterSubRule(49);

                    loop49:
                    do {
                        int alt49=2;
                        try { dbg.enterDecision(49);

                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==31) ) {
                            int LA49_1 = input.LA(2);

                            if ( (LA49_1==VAR) ) {
                                alt49=1;
                            }


                        }


                        } finally {dbg.exitDecision(49);}

                        switch (alt49) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:778:26: ';' decl[tmp]
                    	    {
                    	    dbg.location(778,26);
                    	    char_literal90=(Token)match(input,31,FOLLOW_31_in_pre_block2283); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal90_tree = (Object)adaptor.create(char_literal90);
                    	    adaptor.addChild(root_0, char_literal90_tree);
                    	    }
                    	    dbg.location(778,30);
                    	    pushFollow(FOLLOW_decl_in_pre_block2285);
                    	    decl91=decl(tmp);

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, decl91.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(49);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(50);}

            dbg.location(778,45);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:778:45: ( ';' )?
            int alt51=2;
            try { dbg.enterSubRule(51);
            try { dbg.enterDecision(51);

            int LA51_0 = input.LA(1);

            if ( (LA51_0==31) ) {
                alt51=1;
            }
            } finally {dbg.exitDecision(51);}

            switch (alt51) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: ';'
                    {
                    dbg.location(778,45);
                    char_literal92=(Token)match(input,31,FOLLOW_31_in_pre_block2293); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal92_tree = (Object)adaptor.create(char_literal92);
                    adaptor.addChild(root_0, char_literal92_tree);
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(51);}

            dbg.location(778,50);
            char_literal93=(Token)match(input,30,FOLLOW_30_in_pre_block2296); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal93_tree = (Object)adaptor.create(char_literal93);
            adaptor.addChild(root_0, char_literal93_tree);
            }
            dbg.location(778,54);
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
        dbg.location(782, 3);

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
        public ArrayList result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "foreach"
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:785:1: foreach returns [ArrayList result] : 'foreach' e= expr s= setting ;
    public final RuleSet2Parser.foreach_return foreach() throws RecognitionException {
        RuleSet2Parser.foreach_return retval = new RuleSet2Parser.foreach_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal94=null;
        RuleSet2Parser.expr_return e = null;

        RuleSet2Parser.setting_return s = null;


        Object string_literal94_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "foreach");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(785, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:786:2: ( 'foreach' e= expr s= setting )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:787:2: 'foreach' e= expr s= setting
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(787,2);
            string_literal94=(Token)match(input,54,FOLLOW_54_in_foreach2329); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal94_tree = (Object)adaptor.create(string_literal94);
            adaptor.addChild(root_0, string_literal94_tree);
            }
            dbg.location(787,13);
            pushFollow(FOLLOW_expr_in_foreach2333);
            e=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
            dbg.location(787,20);
            pushFollow(FOLLOW_setting_in_foreach2337);
            s=setting();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, s.getTree());
            dbg.location(787,29);
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
        dbg.location(794, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "foreach");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:797:1: when returns [HashMap result] : 'when' es= event_seq ;
    public final RuleSet2Parser.when_return when() throws RecognitionException {
        RuleSet2Parser.when_return retval = new RuleSet2Parser.when_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal95=null;
        RuleSet2Parser.event_seq_return es = null;


        Object string_literal95_tree=null;



        try { dbg.enterRule(getGrammarFileName(), "when");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(797, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:800:2: ( 'when' es= event_seq )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:801:2: 'when' es= event_seq
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(801,2);
            string_literal95=(Token)match(input,55,FOLLOW_55_in_when2372); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal95_tree = (Object)adaptor.create(string_literal95);
            adaptor.addChild(root_0, string_literal95_tree);
            }
            dbg.location(801,11);
            pushFollow(FOLLOW_event_seq_in_when2376);
            es=event_seq();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, es.getTree());
            dbg.location(801,22);
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
        dbg.location(807, 2);

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
        public HashMap result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "event_seq"
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:810:1: event_seq returns [HashMap result] : eor= event_or (tb= must_be_one[sar(\"then\",\"before\")] eor2= event_or )* ;
    public final RuleSet2Parser.event_seq_return event_seq() throws RecognitionException {
        RuleSet2Parser.event_seq_return retval = new RuleSet2Parser.event_seq_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RuleSet2Parser.event_or_return eor = null;

        RuleSet2Parser.must_be_one_return tb = null;

        RuleSet2Parser.event_or_return eor2 = null;




        	ArrayList temp_list = new ArrayList();
        	ArrayList temp_list_2 = new ArrayList();

        try { dbg.enterRule(getGrammarFileName(), "event_seq");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(810, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:815:2: (eor= event_or (tb= must_be_one[sar(\"then\",\"before\")] eor2= event_or )* )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:816:3: eor= event_or (tb= must_be_one[sar(\"then\",\"before\")] eor2= event_or )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(816,6);
            pushFollow(FOLLOW_event_or_in_event_seq2403);
            eor=event_or();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, eor.getTree());
            dbg.location(816,16);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:816:16: (tb= must_be_one[sar(\"then\",\"before\")] eor2= event_or )*
            try { dbg.enterSubRule(52);

            loop52:
            do {
                int alt52=2;
                try { dbg.enterDecision(52);

                try {
                    isCyclicDecision = true;
                    alt52 = dfa52.predict(input);
                }
                catch (NoViableAltException nvae) {
                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                } finally {dbg.exitDecision(52);}

                switch (alt52) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:816:17: tb= must_be_one[sar(\"then\",\"before\")] eor2= event_or
            	    {
            	    dbg.location(816,19);
            	    pushFollow(FOLLOW_must_be_one_in_event_seq2408);
            	    tb=must_be_one(sar("then","before"));

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, tb.getTree());
            	    dbg.location(816,58);
            	    pushFollow(FOLLOW_event_or_in_event_seq2413);
            	    eor2=event_or();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, eor2.getTree());
            	    dbg.location(816,68);
            	    if ( state.backtracking==0 ) {
            	       temp_list_2.add((tb!=null?input.toString(tb.start,tb.stop):null));temp_list.add(eor2);
            	    }

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);
            } finally {dbg.exitSubRule(52);}

            dbg.location(817,3);
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
        dbg.location(857, 2);

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
        public HashMap result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "event_or"
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:861:1: event_or returns [HashMap result] : ea= event_and ( 'or' ea1= event_and )* ;
    public final RuleSet2Parser.event_or_return event_or() throws RecognitionException {
        RuleSet2Parser.event_or_return retval = new RuleSet2Parser.event_or_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal96=null;
        RuleSet2Parser.event_and_return ea = null;

        RuleSet2Parser.event_and_return ea1 = null;


        Object string_literal96_tree=null;


        	ArrayList temp_list = new ArrayList();

        try { dbg.enterRule(getGrammarFileName(), "event_or");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(861, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:865:2: (ea= event_and ( 'or' ea1= event_and )* )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:866:3: ea= event_and ( 'or' ea1= event_and )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(866,5);
            pushFollow(FOLLOW_event_and_in_event_or2455);
            ea=event_and();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ea.getTree());
            dbg.location(866,16);
            if ( state.backtracking==0 ) {
              temp_list.add(ea);
            }
            dbg.location(866,37);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:866:37: ( 'or' ea1= event_and )*
            try { dbg.enterSubRule(53);

            loop53:
            do {
                int alt53=2;
                try { dbg.enterDecision(53);

                int LA53_0 = input.LA(1);

                if ( (LA53_0==56) ) {
                    alt53=1;
                }


                } finally {dbg.exitDecision(53);}

                switch (alt53) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:866:38: 'or' ea1= event_and
            	    {
            	    dbg.location(866,38);
            	    string_literal96=(Token)match(input,56,FOLLOW_56_in_event_or2460); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal96_tree = (Object)adaptor.create(string_literal96);
            	    adaptor.addChild(root_0, string_literal96_tree);
            	    }
            	    dbg.location(866,46);
            	    pushFollow(FOLLOW_event_and_in_event_or2464);
            	    ea1=event_and();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, ea1.getTree());
            	    dbg.location(866,57);
            	    if ( state.backtracking==0 ) {
            	       temp_list.add(ea1);
            	    }

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);
            } finally {dbg.exitSubRule(53);}

            dbg.location(866,82);
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
        dbg.location(905, 2);

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
        public HashMap result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "event_and"
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:907:1: event_and returns [HashMap result] : e= event_btwn ( 'and' e1= event_btwn )* ;
    public final RuleSet2Parser.event_and_return event_and() throws RecognitionException {
        RuleSet2Parser.event_and_return retval = new RuleSet2Parser.event_and_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal97=null;
        RuleSet2Parser.event_btwn_return e = null;

        RuleSet2Parser.event_btwn_return e1 = null;


        Object string_literal97_tree=null;


        	ArrayList temp_list = new ArrayList();

        try { dbg.enterRule(getGrammarFileName(), "event_and");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(907, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:911:2: (e= event_btwn ( 'and' e1= event_btwn )* )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:912:3: e= event_btwn ( 'and' e1= event_btwn )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(912,4);
            pushFollow(FOLLOW_event_btwn_in_event_and2494);
            e=event_btwn();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
            dbg.location(912,16);
            if ( state.backtracking==0 ) {
              temp_list.add(e);
            }
            dbg.location(912,36);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:912:36: ( 'and' e1= event_btwn )*
            try { dbg.enterSubRule(54);

            loop54:
            do {
                int alt54=2;
                try { dbg.enterDecision(54);

                int LA54_0 = input.LA(1);

                if ( (LA54_0==50) ) {
                    alt54=1;
                }


                } finally {dbg.exitDecision(54);}

                switch (alt54) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:912:37: 'and' e1= event_btwn
            	    {
            	    dbg.location(912,37);
            	    string_literal97=(Token)match(input,50,FOLLOW_50_in_event_and2499); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal97_tree = (Object)adaptor.create(string_literal97);
            	    adaptor.addChild(root_0, string_literal97_tree);
            	    }
            	    dbg.location(912,45);
            	    pushFollow(FOLLOW_event_btwn_in_event_and2503);
            	    e1=event_btwn();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, e1.getTree());
            	    dbg.location(912,57);
            	    if ( state.backtracking==0 ) {
            	       temp_list.add(e1);
            	    }

            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);
            } finally {dbg.exitSubRule(54);}

            dbg.location(912,82);
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
        dbg.location(951, 2);

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
        public HashMap result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "event_btwn"
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:953:1: event_btwn returns [HashMap result] : ep= event_prim ( (not= 'not' )? 'between' '(' es1= event_seq ',' es2= event_seq ')' )? ;
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

        try { dbg.enterRule(getGrammarFileName(), "event_btwn");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(953, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:954:2: (ep= event_prim ( (not= 'not' )? 'between' '(' es1= event_seq ',' es2= event_seq ')' )? )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:955:3: ep= event_prim ( (not= 'not' )? 'between' '(' es1= event_seq ',' es2= event_seq ')' )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(955,5);
            pushFollow(FOLLOW_event_prim_in_event_btwn2529);
            ep=event_prim();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ep.getTree());
            dbg.location(955,17);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:955:17: ( (not= 'not' )? 'between' '(' es1= event_seq ',' es2= event_seq ')' )?
            int alt56=2;
            try { dbg.enterSubRule(56);
            try { dbg.enterDecision(56);

            int LA56_0 = input.LA(1);

            if ( ((LA56_0>=57 && LA56_0<=58)) ) {
                alt56=1;
            }
            } finally {dbg.exitDecision(56);}

            switch (alt56) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:955:18: (not= 'not' )? 'between' '(' es1= event_seq ',' es2= event_seq ')'
                    {
                    dbg.location(955,18);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:955:18: (not= 'not' )?
                    int alt55=2;
                    try { dbg.enterSubRule(55);
                    try { dbg.enterDecision(55);

                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==57) ) {
                        alt55=1;
                    }
                    } finally {dbg.exitDecision(55);}

                    switch (alt55) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:955:19: not= 'not'
                            {
                            dbg.location(955,22);
                            not=(Token)match(input,57,FOLLOW_57_in_event_btwn2535); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            not_tree = (Object)adaptor.create(not);
                            adaptor.addChild(root_0, not_tree);
                            }

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(55);}

                    dbg.location(955,32);
                    string_literal98=(Token)match(input,58,FOLLOW_58_in_event_btwn2540); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal98_tree = (Object)adaptor.create(string_literal98);
                    adaptor.addChild(root_0, string_literal98_tree);
                    }
                    dbg.location(955,42);
                    char_literal99=(Token)match(input,47,FOLLOW_47_in_event_btwn2542); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal99_tree = (Object)adaptor.create(char_literal99);
                    adaptor.addChild(root_0, char_literal99_tree);
                    }
                    dbg.location(955,49);
                    pushFollow(FOLLOW_event_seq_in_event_btwn2546);
                    es1=event_seq();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, es1.getTree());
                    dbg.location(955,60);
                    char_literal100=(Token)match(input,48,FOLLOW_48_in_event_btwn2548); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal100_tree = (Object)adaptor.create(char_literal100);
                    adaptor.addChild(root_0, char_literal100_tree);
                    }
                    dbg.location(955,67);
                    pushFollow(FOLLOW_event_seq_in_event_btwn2552);
                    es2=event_seq();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, es2.getTree());
                    dbg.location(955,78);
                    char_literal101=(Token)match(input,49,FOLLOW_49_in_event_btwn2554); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal101_tree = (Object)adaptor.create(char_literal101);
                    adaptor.addChild(root_0, char_literal101_tree);
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(56);}

            dbg.location(955,84);
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
        dbg.location(977, 2);

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
        public HashMap result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "event_prim"
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:980:1: event_prim returns [HashMap result] : ( ( 'web' )? 'pageview' (spat= STRING | rpat= REGEXP ) (set= setting )? | ( 'web' )? opt= ( 'submit' | 'click' | 'dblclick' | 'change' | 'update' ) elem= STRING (on= on_expr )? (set= setting )? | dom= VAR oper= VAR (filter= event_filter )* (set= setting )? | '(' evt= event_seq ')' );
    public final RuleSet2Parser.event_prim_return event_prim() throws RecognitionException {
        RuleSet2Parser.event_prim_return retval = new RuleSet2Parser.event_prim_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token spat=null;
        Token rpat=null;
        Token opt=null;
        Token elem=null;
        Token dom=null;
        Token oper=null;
        Token string_literal102=null;
        Token string_literal103=null;
        Token string_literal104=null;
        Token char_literal105=null;
        Token char_literal106=null;
        RuleSet2Parser.setting_return set = null;

        RuleSet2Parser.on_expr_return on = null;

        RuleSet2Parser.event_filter_return filter = null;

        RuleSet2Parser.event_seq_return evt = null;


        Object spat_tree=null;
        Object rpat_tree=null;
        Object opt_tree=null;
        Object elem_tree=null;
        Object dom_tree=null;
        Object oper_tree=null;
        Object string_literal102_tree=null;
        Object string_literal103_tree=null;
        Object string_literal104_tree=null;
        Object char_literal105_tree=null;
        Object char_literal106_tree=null;


        	ArrayList filters = new ArrayList();

        try { dbg.enterRule(getGrammarFileName(), "event_prim");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(980, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:984:2: ( ( 'web' )? 'pageview' (spat= STRING | rpat= REGEXP ) (set= setting )? | ( 'web' )? opt= ( 'submit' | 'click' | 'dblclick' | 'change' | 'update' ) elem= STRING (on= on_expr )? (set= setting )? | dom= VAR oper= VAR (filter= event_filter )* (set= setting )? | '(' evt= event_seq ')' )
            int alt65=4;
            try { dbg.enterDecision(65);

            switch ( input.LA(1) ) {
            case 59:
                {
                int LA65_1 = input.LA(2);

                if ( (LA65_1==60) ) {
                    alt65=1;
                }
                else if ( ((LA65_1>=36 && LA65_1<=37)||(LA65_1>=61 && LA65_1<=63)) ) {
                    alt65=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case 60:
                {
                alt65=1;
                }
                break;
            case 36:
            case 37:
            case 61:
            case 62:
            case 63:
                {
                alt65=2;
                }
                break;
            case VAR:
                {
                alt65=3;
                }
                break;
            case 47:
                {
                alt65=4;
                }
                break;
            default:
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

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:985:2: ( 'web' )? 'pageview' (spat= STRING | rpat= REGEXP ) (set= setting )?
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(985,2);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:985:2: ( 'web' )?
                    int alt57=2;
                    try { dbg.enterSubRule(57);
                    try { dbg.enterDecision(57);

                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==59) ) {
                        alt57=1;
                    }
                    } finally {dbg.exitDecision(57);}

                    switch (alt57) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: 'web'
                            {
                            dbg.location(985,2);
                            string_literal102=(Token)match(input,59,FOLLOW_59_in_event_prim2585); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal102_tree = (Object)adaptor.create(string_literal102);
                            adaptor.addChild(root_0, string_literal102_tree);
                            }

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(57);}

                    dbg.location(985,9);
                    string_literal103=(Token)match(input,60,FOLLOW_60_in_event_prim2588); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal103_tree = (Object)adaptor.create(string_literal103);
                    adaptor.addChild(root_0, string_literal103_tree);
                    }
                    dbg.location(985,20);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:985:20: (spat= STRING | rpat= REGEXP )
                    int alt58=2;
                    try { dbg.enterSubRule(58);
                    try { dbg.enterDecision(58);

                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==STRING) ) {
                        alt58=1;
                    }
                    else if ( (LA58_0==REGEXP) ) {
                        alt58=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 58, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(58);}

                    switch (alt58) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:985:21: spat= STRING
                            {
                            dbg.location(985,25);
                            spat=(Token)match(input,STRING,FOLLOW_STRING_in_event_prim2593); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            spat_tree = (Object)adaptor.create(spat);
                            adaptor.addChild(root_0, spat_tree);
                            }

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:985:33: rpat= REGEXP
                            {
                            dbg.location(985,37);
                            rpat=(Token)match(input,REGEXP,FOLLOW_REGEXP_in_event_prim2597); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            rpat_tree = (Object)adaptor.create(rpat);
                            adaptor.addChild(root_0, rpat_tree);
                            }

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(58);}

                    dbg.location(985,49);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:985:49: (set= setting )?
                    int alt59=2;
                    try { dbg.enterSubRule(59);
                    try { dbg.enterDecision(59);

                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==52) ) {
                        alt59=1;
                    }
                    } finally {dbg.exitDecision(59);}

                    switch (alt59) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: set= setting
                            {
                            dbg.location(985,49);
                            pushFollow(FOLLOW_setting_in_event_prim2602);
                            set=setting();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, set.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(59);}

                    dbg.location(985,59);
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
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:998:4: ( 'web' )? opt= ( 'submit' | 'click' | 'dblclick' | 'change' | 'update' ) elem= STRING (on= on_expr )? (set= setting )?
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(998,4);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:998:4: ( 'web' )?
                    int alt60=2;
                    try { dbg.enterSubRule(60);
                    try { dbg.enterDecision(60);

                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==59) ) {
                        alt60=1;
                    }
                    } finally {dbg.exitDecision(60);}

                    switch (alt60) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: 'web'
                            {
                            dbg.location(998,4);
                            string_literal104=(Token)match(input,59,FOLLOW_59_in_event_prim2611); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal104_tree = (Object)adaptor.create(string_literal104);
                            adaptor.addChild(root_0, string_literal104_tree);
                            }

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(60);}

                    dbg.location(998,14);
                    opt=(Token)input.LT(1);
                    if ( (input.LA(1)>=36 && input.LA(1)<=37)||(input.LA(1)>=61 && input.LA(1)<=63) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(opt));
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(998,67);
                    elem=(Token)match(input,STRING,FOLLOW_STRING_in_event_prim2630); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    elem_tree = (Object)adaptor.create(elem);
                    adaptor.addChild(root_0, elem_tree);
                    }
                    dbg.location(998,77);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:998:77: (on= on_expr )?
                    int alt61=2;
                    try { dbg.enterSubRule(61);
                    try { dbg.enterDecision(61);

                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==64) ) {
                        alt61=1;
                    }
                    } finally {dbg.exitDecision(61);}

                    switch (alt61) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: on= on_expr
                            {
                            dbg.location(998,77);
                            pushFollow(FOLLOW_on_expr_in_event_prim2634);
                            on=on_expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, on.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(61);}

                    dbg.location(998,91);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:998:91: (set= setting )?
                    int alt62=2;
                    try { dbg.enterSubRule(62);
                    try { dbg.enterDecision(62);

                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==52) ) {
                        alt62=1;
                    }
                    } finally {dbg.exitDecision(62);}

                    switch (alt62) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: set= setting
                            {
                            dbg.location(998,91);
                            pushFollow(FOLLOW_setting_in_event_prim2640);
                            set=setting();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, set.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(62);}

                    dbg.location(998,101);
                    if ( state.backtracking==0 ) {

                      		HashMap tmp = new HashMap();
                      		tmp.put("domain","web");
                      		tmp.put("element",strip_string((elem!=null?elem.getText():null)));
                      		tmp.put("type","prim_event"); 
                      		if((set!=null?input.toString(set.start,set.stop):null) != null)
                      			tmp.put("vars",(set!=null?set.result:null));
                      		tmp.put("op",(opt!=null?opt.getText():null));
                      		if((on!=null?input.toString(on.start,on.stop):null) != null)
                      			tmp.put("on",(on!=null?on.result:null));
                      		retval.result = tmp;			
                      	
                      	
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1011:4: dom= VAR oper= VAR (filter= event_filter )* (set= setting )?
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(1011,7);
                    dom=(Token)match(input,VAR,FOLLOW_VAR_in_event_prim2650); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    dom_tree = (Object)adaptor.create(dom);
                    adaptor.addChild(root_0, dom_tree);
                    }
                    dbg.location(1011,16);
                    oper=(Token)match(input,VAR,FOLLOW_VAR_in_event_prim2654); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    oper_tree = (Object)adaptor.create(oper);
                    adaptor.addChild(root_0, oper_tree);
                    }
                    dbg.location(1011,21);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1011:21: (filter= event_filter )*
                    try { dbg.enterSubRule(63);

                    loop63:
                    do {
                        int alt63=2;
                        try { dbg.enterDecision(63);

                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==VAR) ) {
                            int LA63_2 = input.LA(2);

                            if ( ((LA63_2>=STRING && LA63_2<=REGEXP)) ) {
                                alt63=1;
                            }


                        }


                        } finally {dbg.exitDecision(63);}

                        switch (alt63) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1011:22: filter= event_filter
                    	    {
                    	    dbg.location(1011,28);
                    	    pushFollow(FOLLOW_event_filter_in_event_prim2659);
                    	    filter=event_filter();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, filter.getTree());
                    	    dbg.location(1011,41);
                    	    if ( state.backtracking==0 ) {
                    	      filters.add((filter!=null?filter.result:null));
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop63;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(63);}

                    dbg.location(1011,77);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1011:77: (set= setting )?
                    int alt64=2;
                    try { dbg.enterSubRule(64);
                    try { dbg.enterDecision(64);

                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==52) ) {
                        alt64=1;
                    }
                    } finally {dbg.exitDecision(64);}

                    switch (alt64) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: set= setting
                            {
                            dbg.location(1011,77);
                            pushFollow(FOLLOW_setting_in_event_prim2666);
                            set=setting();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, set.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(64);}

                    dbg.location(1011,88);
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
                    dbg.enterAlt(4);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1023:4: '(' evt= event_seq ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(1023,4);
                    char_literal105=(Token)match(input,47,FOLLOW_47_in_event_prim2676); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal105_tree = (Object)adaptor.create(char_literal105);
                    adaptor.addChild(root_0, char_literal105_tree);
                    }
                    dbg.location(1023,11);
                    pushFollow(FOLLOW_event_seq_in_event_prim2680);
                    evt=event_seq();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, evt.getTree());
                    dbg.location(1023,22);
                    char_literal106=(Token)match(input,49,FOLLOW_49_in_event_prim2682); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal106_tree = (Object)adaptor.create(char_literal106);
                    adaptor.addChild(root_0, char_literal106_tree);
                    }
                    dbg.location(1023,26);
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
        dbg.location(1026, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "event_prim");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1029:1: event_filter returns [ArrayList result] : typ= VAR (sfilt= STRING | rfilt= REGEXP ) ;
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

        try { dbg.enterRule(getGrammarFileName(), "event_filter");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1029, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1030:2: (typ= VAR (sfilt= STRING | rfilt= REGEXP ) )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1030:4: typ= VAR (sfilt= STRING | rfilt= REGEXP )
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(1030,7);
            typ=(Token)match(input,VAR,FOLLOW_VAR_in_event_filter2703); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            typ_tree = (Object)adaptor.create(typ);
            adaptor.addChild(root_0, typ_tree);
            }
            dbg.location(1030,12);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1030:12: (sfilt= STRING | rfilt= REGEXP )
            int alt66=2;
            try { dbg.enterSubRule(66);
            try { dbg.enterDecision(66);

            int LA66_0 = input.LA(1);

            if ( (LA66_0==STRING) ) {
                alt66=1;
            }
            else if ( (LA66_0==REGEXP) ) {
                alt66=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(66);}

            switch (alt66) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1030:13: sfilt= STRING
                    {
                    dbg.location(1030,18);
                    sfilt=(Token)match(input,STRING,FOLLOW_STRING_in_event_filter2708); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    sfilt_tree = (Object)adaptor.create(sfilt);
                    adaptor.addChild(root_0, sfilt_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1030:28: rfilt= REGEXP
                    {
                    dbg.location(1030,33);
                    rfilt=(Token)match(input,REGEXP,FOLLOW_REGEXP_in_event_filter2714); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    rfilt_tree = (Object)adaptor.create(rfilt);
                    adaptor.addChild(root_0, rfilt_tree);
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(66);}

            dbg.location(1030,42);
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
        dbg.location(1041, 2);

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
        public String result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "on_expr"
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1043:1: on_expr returns [String result] : 'on' (s= STRING | r= REGEXP ) ;
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

        try { dbg.enterRule(getGrammarFileName(), "on_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1043, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1043:32: ( 'on' (s= STRING | r= REGEXP ) )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1043:34: 'on' (s= STRING | r= REGEXP )
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(1043,34);
            string_literal107=(Token)match(input,64,FOLLOW_64_in_on_expr2733); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal107_tree = (Object)adaptor.create(string_literal107);
            adaptor.addChild(root_0, string_literal107_tree);
            }
            dbg.location(1044,2);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1044:2: (s= STRING | r= REGEXP )
            int alt67=2;
            try { dbg.enterSubRule(67);
            try { dbg.enterDecision(67);

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

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(67);}

            switch (alt67) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1044:5: s= STRING
                    {
                    dbg.location(1044,6);
                    s=(Token)match(input,STRING,FOLLOW_STRING_in_on_expr2742); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    s_tree = (Object)adaptor.create(s);
                    adaptor.addChild(root_0, s_tree);
                    }
                    dbg.location(1044,14);
                    if ( state.backtracking==0 ) {
                      retval.result = strip_string((s!=null?s.getText():null));
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1045:5: r= REGEXP
                    {
                    dbg.location(1045,6);
                    r=(Token)match(input,REGEXP,FOLLOW_REGEXP_in_on_expr2753); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    r_tree = (Object)adaptor.create(r);
                    adaptor.addChild(root_0, r_tree);
                    }
                    dbg.location(1045,14);
                    if ( state.backtracking==0 ) {
                      retval.result = strip_string((r!=null?r.getText():null));
                    }

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
        }
        dbg.location(1047, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "on_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "on_expr"

    public static class global_block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "global_block"
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1095:1: global_block : 'global' '{' (emt= emit_block | dst= must_be_one[sar(\"dataset\",\"datasource\")] name= VAR ( ':' dtype= ( 'JSON' | 'XML' | 'RSS' | 'HTML' ) )? '<-' src= STRING (cas= cachable )? | css_emit | decl[global_block_array] | ';' )* '}' ;
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
        Token char_literal114=null;
        Token char_literal115=null;
        RuleSet2Parser.emit_block_return emt = null;

        RuleSet2Parser.must_be_one_return dst = null;

        RuleSet2Parser.cachable_return cas = null;

        RuleSet2Parser.css_emit_return css_emit112 = null;

        RuleSet2Parser.decl_return decl113 = null;


        Object name_tree=null;
        Object dtype_tree=null;
        Object src_tree=null;
        Object string_literal108_tree=null;
        Object char_literal109_tree=null;
        Object char_literal110_tree=null;
        Object string_literal111_tree=null;
        Object char_literal114_tree=null;
        Object char_literal115_tree=null;


        	 ArrayList global_block_array = (ArrayList)rule_json.get("global");
        	 boolean found_cache = false;

        try { dbg.enterRule(getGrammarFileName(), "global_block");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1095, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1102:2: ( 'global' '{' (emt= emit_block | dst= must_be_one[sar(\"dataset\",\"datasource\")] name= VAR ( ':' dtype= ( 'JSON' | 'XML' | 'RSS' | 'HTML' ) )? '<-' src= STRING (cas= cachable )? | css_emit | decl[global_block_array] | ';' )* '}' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1102:4: 'global' '{' (emt= emit_block | dst= must_be_one[sar(\"dataset\",\"datasource\")] name= VAR ( ':' dtype= ( 'JSON' | 'XML' | 'RSS' | 'HTML' ) )? '<-' src= STRING (cas= cachable )? | css_emit | decl[global_block_array] | ';' )* '}'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(1102,4);
            string_literal108=(Token)match(input,65,FOLLOW_65_in_global_block2838); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal108_tree = (Object)adaptor.create(string_literal108);
            adaptor.addChild(root_0, string_literal108_tree);
            }
            dbg.location(1102,13);
            char_literal109=(Token)match(input,29,FOLLOW_29_in_global_block2840); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal109_tree = (Object)adaptor.create(char_literal109);
            adaptor.addChild(root_0, char_literal109_tree);
            }
            dbg.location(1103,2);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1103:2: (emt= emit_block | dst= must_be_one[sar(\"dataset\",\"datasource\")] name= VAR ( ':' dtype= ( 'JSON' | 'XML' | 'RSS' | 'HTML' ) )? '<-' src= STRING (cas= cachable )? | css_emit | decl[global_block_array] | ';' )*
            try { dbg.enterSubRule(70);

            loop70:
            do {
                int alt70=6;
                try { dbg.enterDecision(70);

                switch ( input.LA(1) ) {
                case 112:
                    {
                    alt70=1;
                    }
                    break;
                case VAR:
                    {
                    int LA70_3 = input.LA(2);

                    if ( (LA70_3==38) ) {
                        alt70=4;
                    }
                    else if ( (LA70_3==VAR) ) {
                        alt70=2;
                    }


                    }
                    break;
                case 110:
                    {
                    alt70=3;
                    }
                    break;
                case 31:
                    {
                    alt70=5;
                    }
                    break;

                }

                } finally {dbg.exitDecision(70);}

                switch (alt70) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1103:4: emt= emit_block
            	    {
            	    dbg.location(1103,7);
            	    pushFollow(FOLLOW_emit_block_in_global_block2848);
            	    emt=emit_block();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, emt.getTree());
            	    dbg.location(1103,19);
            	    if ( state.backtracking==0 ) {

            	      		HashMap tmp = new HashMap(); 
            	      		tmp.put("emit",(emt!=null?emt.emit_value:null));
            	      		global_block_array.add(tmp);
            	      	
            	    }

            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1108:4: dst= must_be_one[sar(\"dataset\",\"datasource\")] name= VAR ( ':' dtype= ( 'JSON' | 'XML' | 'RSS' | 'HTML' ) )? '<-' src= STRING (cas= cachable )?
            	    {
            	    dbg.location(1108,7);
            	    pushFollow(FOLLOW_must_be_one_in_global_block2858);
            	    dst=must_be_one(sar("dataset","datasource"));

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, dst.getTree());
            	    dbg.location(1108,53);
            	    name=(Token)match(input,VAR,FOLLOW_VAR_in_global_block2863); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    name_tree = (Object)adaptor.create(name);
            	    adaptor.addChild(root_0, name_tree);
            	    }
            	    dbg.location(1108,58);
            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1108:58: ( ':' dtype= ( 'JSON' | 'XML' | 'RSS' | 'HTML' ) )?
            	    int alt68=2;
            	    try { dbg.enterSubRule(68);
            	    try { dbg.enterDecision(68);

            	    int LA68_0 = input.LA(1);

            	    if ( (LA68_0==39) ) {
            	        alt68=1;
            	    }
            	    } finally {dbg.exitDecision(68);}

            	    switch (alt68) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1108:59: ':' dtype= ( 'JSON' | 'XML' | 'RSS' | 'HTML' )
            	            {
            	            dbg.location(1108,59);
            	            char_literal110=(Token)match(input,39,FOLLOW_39_in_global_block2866); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal110_tree = (Object)adaptor.create(char_literal110);
            	            adaptor.addChild(root_0, char_literal110_tree);
            	            }
            	            dbg.location(1108,68);
            	            dtype=(Token)input.LT(1);
            	            if ( (input.LA(1)>=66 && input.LA(1)<=69) ) {
            	                input.consume();
            	                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(dtype));
            	                state.errorRecovery=false;state.failed=false;
            	            }
            	            else {
            	                if (state.backtracking>0) {state.failed=true; return retval;}
            	                MismatchedSetException mse = new MismatchedSetException(null,input);
            	                dbg.recognitionException(mse);
            	                throw mse;
            	            }


            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(68);}

            	    dbg.location(1108,99);
            	    string_literal111=(Token)match(input,70,FOLLOW_70_in_global_block2882); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal111_tree = (Object)adaptor.create(string_literal111);
            	    adaptor.addChild(root_0, string_literal111_tree);
            	    }
            	    dbg.location(1108,107);
            	    src=(Token)match(input,STRING,FOLLOW_STRING_in_global_block2886); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    src_tree = (Object)adaptor.create(src);
            	    adaptor.addChild(root_0, src_tree);
            	    }
            	    dbg.location(1108,115);
            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1108:115: (cas= cachable )?
            	    int alt69=2;
            	    try { dbg.enterSubRule(69);
            	    try { dbg.enterDecision(69);

            	    int LA69_0 = input.LA(1);

            	    if ( (LA69_0==111) ) {
            	        alt69=1;
            	    }
            	    } finally {dbg.exitDecision(69);}

            	    switch (alt69) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1108:116: cas= cachable
            	            {
            	            dbg.location(1108,119);
            	            pushFollow(FOLLOW_cachable_in_global_block2891);
            	            cas=cachable();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, cas.getTree());
            	            dbg.location(1108,129);
            	            if ( state.backtracking==0 ) {
            	              found_cache =true; 
            	            }

            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(69);}

            	    dbg.location(1108,154);
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
            	    dbg.enterAlt(3);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1142:4: css_emit
            	    {
            	    dbg.location(1142,4);
            	    pushFollow(FOLLOW_css_emit_in_global_block2904);
            	    css_emit112=css_emit();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, css_emit112.getTree());
            	    dbg.location(1142,13);
            	    if ( state.backtracking==0 ) {

            	      		HashMap tmp = new HashMap(); 
            	      		tmp.put("content",(emt!=null?emt.emit_value:null));
            	      		tmp.put("type","css");
            	      		global_block_array.add(tmp);
            	      	
            	    }

            	    }
            	    break;
            	case 4 :
            	    dbg.enterAlt(4);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1148:4: decl[global_block_array]
            	    {
            	    dbg.location(1148,4);
            	    pushFollow(FOLLOW_decl_in_global_block2912);
            	    decl113=decl(global_block_array);

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, decl113.getTree());

            	    }
            	    break;
            	case 5 :
            	    dbg.enterAlt(5);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1149:4: ';'
            	    {
            	    dbg.location(1149,4);
            	    char_literal114=(Token)match(input,31,FOLLOW_31_in_global_block2918); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal114_tree = (Object)adaptor.create(char_literal114);
            	    adaptor.addChild(root_0, char_literal114_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);
            } finally {dbg.exitSubRule(70);}

            dbg.location(1149,11);
            char_literal115=(Token)match(input,30,FOLLOW_30_in_global_block2923); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal115_tree = (Object)adaptor.create(char_literal115);
            adaptor.addChild(root_0, char_literal115_tree);
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
        dbg.location(1150, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "global_block");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "global_block"

    public static class decl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "decl"
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1156:1: decl[ArrayList block_array] : (var= VAR '=' val= HTML | var= VAR '=' val= JS | var= VAR '=' e= expr );
    public final RuleSet2Parser.decl_return decl(ArrayList  block_array) throws RecognitionException {
        RuleSet2Parser.decl_return retval = new RuleSet2Parser.decl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token var=null;
        Token val=null;
        Token char_literal116=null;
        Token char_literal117=null;
        Token char_literal118=null;
        RuleSet2Parser.expr_return e = null;


        Object var_tree=null;
        Object val_tree=null;
        Object char_literal116_tree=null;
        Object char_literal117_tree=null;
        Object char_literal118_tree=null;



        try { dbg.enterRule(getGrammarFileName(), "decl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1156, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1159:2: (var= VAR '=' val= HTML | var= VAR '=' val= JS | var= VAR '=' e= expr )
            int alt71=3;
            try { dbg.enterDecision(71);

            int LA71_0 = input.LA(1);

            if ( (LA71_0==VAR) ) {
                int LA71_1 = input.LA(2);

                if ( (LA71_1==38) ) {
                    switch ( input.LA(3) ) {
                    case HTML:
                        {
                        alt71=1;
                        }
                        break;
                    case JS:
                        {
                        alt71=2;
                        }
                        break;
                    case VAR:
                    case INT:
                    case FLOAT:
                    case STRING:
                    case REGEXP:
                    case 29:
                    case 47:
                    case 57:
                    case 71:
                    case 78:
                    case 101:
                    case 102:
                    case 103:
                    case 105:
                    case 106:
                    case 107:
                    case 108:
                        {
                        alt71=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 71, 2, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 71, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(71);}

            switch (alt71) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1160:2: var= VAR '=' val= HTML
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(1160,5);
                    var=(Token)match(input,VAR,FOLLOW_VAR_in_decl2950); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    var_tree = (Object)adaptor.create(var);
                    adaptor.addChild(root_0, var_tree);
                    }
                    dbg.location(1160,10);
                    char_literal116=(Token)match(input,38,FOLLOW_38_in_decl2952); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal116_tree = (Object)adaptor.create(char_literal116);
                    adaptor.addChild(root_0, char_literal116_tree);
                    }
                    dbg.location(1160,17);
                    val=(Token)match(input,HTML,FOLLOW_HTML_in_decl2956); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    val_tree = (Object)adaptor.create(val);
                    adaptor.addChild(root_0, val_tree);
                    }
                    dbg.location(1160,23);
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
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1167:4: var= VAR '=' val= JS
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(1167,7);
                    var=(Token)match(input,VAR,FOLLOW_VAR_in_decl2966); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    var_tree = (Object)adaptor.create(var);
                    adaptor.addChild(root_0, var_tree);
                    }
                    dbg.location(1167,12);
                    char_literal117=(Token)match(input,38,FOLLOW_38_in_decl2968); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal117_tree = (Object)adaptor.create(char_literal117);
                    adaptor.addChild(root_0, char_literal117_tree);
                    }
                    dbg.location(1167,19);
                    val=(Token)match(input,JS,FOLLOW_JS_in_decl2972); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    val_tree = (Object)adaptor.create(val);
                    adaptor.addChild(root_0, val_tree);
                    }
                    dbg.location(1167,23);
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
                    dbg.enterAlt(3);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1174:4: var= VAR '=' e= expr
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(1174,7);
                    var=(Token)match(input,VAR,FOLLOW_VAR_in_decl2982); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    var_tree = (Object)adaptor.create(var);
                    adaptor.addChild(root_0, var_tree);
                    }
                    dbg.location(1174,12);
                    char_literal118=(Token)match(input,38,FOLLOW_38_in_decl2984); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal118_tree = (Object)adaptor.create(char_literal118);
                    adaptor.addChild(root_0, char_literal118_tree);
                    }
                    dbg.location(1174,17);
                    pushFollow(FOLLOW_expr_in_decl2988);
                    e=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
                    dbg.location(1174,23);
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
        dbg.location(1181, 2);

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
        public Object result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1186:1: expr returns [Object result] : (fd= function_def | c= conditional_expression );
    public final RuleSet2Parser.expr_return expr() throws RecognitionException {
        RuleSet2Parser.expr_return retval = new RuleSet2Parser.expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RuleSet2Parser.function_def_return fd = null;

        RuleSet2Parser.conditional_expression_return c = null;




        	HashMap result_hash = new HashMap();

        try { dbg.enterRule(getGrammarFileName(), "expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1186, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1190:2: (fd= function_def | c= conditional_expression )
            int alt72=2;
            try { dbg.enterDecision(72);

            int LA72_0 = input.LA(1);

            if ( (LA72_0==71) ) {
                alt72=1;
            }
            else if ( ((LA72_0>=VAR && LA72_0<=INT)||LA72_0==FLOAT||(LA72_0>=STRING && LA72_0<=REGEXP)||LA72_0==29||LA72_0==47||LA72_0==57||LA72_0==78||(LA72_0>=101 && LA72_0<=103)||(LA72_0>=105 && LA72_0<=108)) ) {
                alt72=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(72);}

            switch (alt72) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1190:4: fd= function_def
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(1190,6);
                    pushFollow(FOLLOW_function_def_in_expr3015);
                    fd=function_def();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fd.getTree());
                    dbg.location(1190,20);
                    if ( state.backtracking==0 ) {

                      		retval.result = (fd!=null?fd.result:null);
                      	
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1193:4: c= conditional_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(1193,5);
                    pushFollow(FOLLOW_conditional_expression_in_expr3024);
                    c=conditional_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, c.getTree());
                    dbg.location(1193,29);
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
        dbg.location(1196, 2);

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
        public Object result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function_def"
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1198:1: function_def returns [Object result] : 'function' '(' (args+= VAR )? ( ',' args+= VAR )* ')' '{' (decs+= decl[block_array] )? ( ';' decs+= decl[block_array] )* ( ';' )? e1= expr '}' ;
    public final RuleSet2Parser.function_def_return function_def() throws RecognitionException {
        RuleSet2Parser.function_def_return retval = new RuleSet2Parser.function_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal119=null;
        Token char_literal120=null;
        Token char_literal121=null;
        Token char_literal122=null;
        Token char_literal123=null;
        Token char_literal124=null;
        Token char_literal125=null;
        Token char_literal126=null;
        Token args=null;
        List list_args=null;
        List list_decs=null;
        RuleSet2Parser.expr_return e1 = null;

        RuleReturnScope decs = null;
        Object string_literal119_tree=null;
        Object char_literal120_tree=null;
        Object char_literal121_tree=null;
        Object char_literal122_tree=null;
        Object char_literal123_tree=null;
        Object char_literal124_tree=null;
        Object char_literal125_tree=null;
        Object char_literal126_tree=null;
        Object args_tree=null;


        	ArrayList block_array = new ArrayList();

        try { dbg.enterRule(getGrammarFileName(), "function_def");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1198, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1202:2: ( 'function' '(' (args+= VAR )? ( ',' args+= VAR )* ')' '{' (decs+= decl[block_array] )? ( ';' decs+= decl[block_array] )* ( ';' )? e1= expr '}' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1202:4: 'function' '(' (args+= VAR )? ( ',' args+= VAR )* ')' '{' (decs+= decl[block_array] )? ( ';' decs+= decl[block_array] )* ( ';' )? e1= expr '}'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(1202,4);
            string_literal119=(Token)match(input,71,FOLLOW_71_in_function_def3047); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal119_tree = (Object)adaptor.create(string_literal119);
            adaptor.addChild(root_0, string_literal119_tree);
            }
            dbg.location(1202,15);
            char_literal120=(Token)match(input,47,FOLLOW_47_in_function_def3049); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal120_tree = (Object)adaptor.create(char_literal120);
            adaptor.addChild(root_0, char_literal120_tree);
            }
            dbg.location(1202,23);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1202:23: (args+= VAR )?
            int alt73=2;
            try { dbg.enterSubRule(73);
            try { dbg.enterDecision(73);

            int LA73_0 = input.LA(1);

            if ( (LA73_0==VAR) ) {
                alt73=1;
            }
            } finally {dbg.exitDecision(73);}

            switch (alt73) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: args+= VAR
                    {
                    dbg.location(1202,23);
                    args=(Token)match(input,VAR,FOLLOW_VAR_in_function_def3053); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    args_tree = (Object)adaptor.create(args);
                    adaptor.addChild(root_0, args_tree);
                    }
                    if (list_args==null) list_args=new ArrayList();
                    list_args.add(args);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(73);}

            dbg.location(1202,30);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1202:30: ( ',' args+= VAR )*
            try { dbg.enterSubRule(74);

            loop74:
            do {
                int alt74=2;
                try { dbg.enterDecision(74);

                int LA74_0 = input.LA(1);

                if ( (LA74_0==48) ) {
                    alt74=1;
                }


                } finally {dbg.exitDecision(74);}

                switch (alt74) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1202:31: ',' args+= VAR
            	    {
            	    dbg.location(1202,31);
            	    char_literal121=(Token)match(input,48,FOLLOW_48_in_function_def3057); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal121_tree = (Object)adaptor.create(char_literal121);
            	    adaptor.addChild(root_0, char_literal121_tree);
            	    }
            	    dbg.location(1202,39);
            	    args=(Token)match(input,VAR,FOLLOW_VAR_in_function_def3061); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    args_tree = (Object)adaptor.create(args);
            	    adaptor.addChild(root_0, args_tree);
            	    }
            	    if (list_args==null) list_args=new ArrayList();
            	    list_args.add(args);


            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);
            } finally {dbg.exitSubRule(74);}

            dbg.location(1202,48);
            char_literal122=(Token)match(input,49,FOLLOW_49_in_function_def3066); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal122_tree = (Object)adaptor.create(char_literal122);
            adaptor.addChild(root_0, char_literal122_tree);
            }
            dbg.location(1202,52);
            char_literal123=(Token)match(input,29,FOLLOW_29_in_function_def3068); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal123_tree = (Object)adaptor.create(char_literal123);
            adaptor.addChild(root_0, char_literal123_tree);
            }
            dbg.location(1202,60);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1202:60: (decs+= decl[block_array] )?
            int alt75=2;
            try { dbg.enterSubRule(75);
            try { dbg.enterDecision(75);

            int LA75_0 = input.LA(1);

            if ( (LA75_0==VAR) ) {
                int LA75_1 = input.LA(2);

                if ( (LA75_1==38) ) {
                    alt75=1;
                }
            }
            } finally {dbg.exitDecision(75);}

            switch (alt75) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: decs+= decl[block_array]
                    {
                    dbg.location(1202,60);
                    pushFollow(FOLLOW_decl_in_function_def3072);
                    decs=decl(block_array);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, decs.getTree());
                    if (list_decs==null) list_decs=new ArrayList();
                    list_decs.add(decs.getTree());


                    }
                    break;

            }
            } finally {dbg.exitSubRule(75);}

            dbg.location(1202,81);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1202:81: ( ';' decs+= decl[block_array] )*
            try { dbg.enterSubRule(76);

            loop76:
            do {
                int alt76=2;
                try { dbg.enterDecision(76);

                int LA76_0 = input.LA(1);

                if ( (LA76_0==31) ) {
                    int LA76_1 = input.LA(2);

                    if ( (LA76_1==VAR) ) {
                        int LA76_3 = input.LA(3);

                        if ( (LA76_3==38) ) {
                            alt76=1;
                        }


                    }


                }


                } finally {dbg.exitDecision(76);}

                switch (alt76) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1202:82: ';' decs+= decl[block_array]
            	    {
            	    dbg.location(1202,82);
            	    char_literal124=(Token)match(input,31,FOLLOW_31_in_function_def3077); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal124_tree = (Object)adaptor.create(char_literal124);
            	    adaptor.addChild(root_0, char_literal124_tree);
            	    }
            	    dbg.location(1202,90);
            	    pushFollow(FOLLOW_decl_in_function_def3081);
            	    decs=decl(block_array);

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, decs.getTree());
            	    if (list_decs==null) list_decs=new ArrayList();
            	    list_decs.add(decs.getTree());


            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);
            } finally {dbg.exitSubRule(76);}

            dbg.location(1202,112);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1202:112: ( ';' )?
            int alt77=2;
            try { dbg.enterSubRule(77);
            try { dbg.enterDecision(77);

            int LA77_0 = input.LA(1);

            if ( (LA77_0==31) ) {
                alt77=1;
            }
            } finally {dbg.exitDecision(77);}

            switch (alt77) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: ';'
                    {
                    dbg.location(1202,112);
                    char_literal125=(Token)match(input,31,FOLLOW_31_in_function_def3086); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal125_tree = (Object)adaptor.create(char_literal125);
                    adaptor.addChild(root_0, char_literal125_tree);
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(77);}

            dbg.location(1202,119);
            pushFollow(FOLLOW_expr_in_function_def3091);
            e1=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, e1.getTree());
            dbg.location(1202,125);
            char_literal126=(Token)match(input,30,FOLLOW_30_in_function_def3093); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal126_tree = (Object)adaptor.create(char_literal126);
            adaptor.addChild(root_0, char_literal126_tree);
            }
            dbg.location(1202,129);
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
        dbg.location(1221, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "function_def");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1224:1: conditional_expression returns [Object result] : d= disjunction ( '=>' expr '|' expr )? ;
    public final RuleSet2Parser.conditional_expression_return conditional_expression() throws RecognitionException {
        RuleSet2Parser.conditional_expression_return retval = new RuleSet2Parser.conditional_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal127=null;
        Token char_literal129=null;
        RuleSet2Parser.disjunction_return d = null;

        RuleSet2Parser.expr_return expr128 = null;

        RuleSet2Parser.expr_return expr130 = null;


        Object string_literal127_tree=null;
        Object char_literal129_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "conditional_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1224, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1225:2: (d= disjunction ( '=>' expr '|' expr )? )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1225:5: d= disjunction ( '=>' expr '|' expr )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(1225,6);
            pushFollow(FOLLOW_disjunction_in_conditional_expression3115);
            d=disjunction();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, d.getTree());
            dbg.location(1225,19);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1225:19: ( '=>' expr '|' expr )?
            int alt78=2;
            try { dbg.enterSubRule(78);
            try { dbg.enterDecision(78);

            int LA78_0 = input.LA(1);

            if ( (LA78_0==46) ) {
                alt78=1;
            }
            } finally {dbg.exitDecision(78);}

            switch (alt78) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1225:20: '=>' expr '|' expr
                    {
                    dbg.location(1225,20);
                    string_literal127=(Token)match(input,46,FOLLOW_46_in_conditional_expression3118); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal127_tree = (Object)adaptor.create(string_literal127);
                    adaptor.addChild(root_0, string_literal127_tree);
                    }
                    dbg.location(1225,25);
                    pushFollow(FOLLOW_expr_in_conditional_expression3120);
                    expr128=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr128.getTree());
                    dbg.location(1225,30);
                    char_literal129=(Token)match(input,72,FOLLOW_72_in_conditional_expression3122); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal129_tree = (Object)adaptor.create(char_literal129);
                    adaptor.addChild(root_0, char_literal129_tree);
                    }
                    dbg.location(1225,34);
                    pushFollow(FOLLOW_expr_in_conditional_expression3124);
                    expr130=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr130.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(78);}

            dbg.location(1226,5);
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
        dbg.location(1227, 2);

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
        public Object result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "disjunction"
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1230:1: disjunction returns [Object result] : me1= conjunction (op= '||' me2= conjunction )* ;
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

        try { dbg.enterRule(getGrammarFileName(), "disjunction");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1230, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1235:2: (me1= conjunction (op= '||' me2= conjunction )* )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1235:4: me1= conjunction (op= '||' me2= conjunction )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(1235,7);
            pushFollow(FOLLOW_conjunction_in_disjunction3156);
            me1=conjunction();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, me1.getTree());
            dbg.location(1235,20);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1235:20: (op= '||' me2= conjunction )*
            try { dbg.enterSubRule(79);

            loop79:
            do {
                int alt79=2;
                try { dbg.enterDecision(79);

                int LA79_0 = input.LA(1);

                if ( (LA79_0==73) ) {
                    alt79=1;
                }


                } finally {dbg.exitDecision(79);}

                switch (alt79) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1235:21: op= '||' me2= conjunction
            	    {
            	    dbg.location(1235,23);
            	    op=(Token)match(input,73,FOLLOW_73_in_disjunction3161); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    adaptor.addChild(root_0, op_tree);
            	    }
            	    dbg.location(1235,32);
            	    pushFollow(FOLLOW_conjunction_in_disjunction3165);
            	    me2=conjunction();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, me2.getTree());
            	    dbg.location(1235,44);
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
            	    break loop79;
                }
            } while (true);
            } finally {dbg.exitSubRule(79);}

            dbg.location(1245,6);
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
        dbg.location(1251, 2);

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
        public Object result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conjunction"
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1253:1: conjunction returns [Object result] : me1= equality_expr (op= '&&' me2= equality_expr )* ;
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

        try { dbg.enterRule(getGrammarFileName(), "conjunction");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1253, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1258:2: (me1= equality_expr (op= '&&' me2= equality_expr )* )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1258:4: me1= equality_expr (op= '&&' me2= equality_expr )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(1258,7);
            pushFollow(FOLLOW_equality_expr_in_conjunction3195);
            me1=equality_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, me1.getTree());
            dbg.location(1258,22);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1258:22: (op= '&&' me2= equality_expr )*
            try { dbg.enterSubRule(80);

            loop80:
            do {
                int alt80=2;
                try { dbg.enterDecision(80);

                int LA80_0 = input.LA(1);

                if ( (LA80_0==74) ) {
                    alt80=1;
                }


                } finally {dbg.exitDecision(80);}

                switch (alt80) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1258:23: op= '&&' me2= equality_expr
            	    {
            	    dbg.location(1258,25);
            	    op=(Token)match(input,74,FOLLOW_74_in_conjunction3200); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    adaptor.addChild(root_0, op_tree);
            	    }
            	    dbg.location(1258,34);
            	    pushFollow(FOLLOW_equality_expr_in_conjunction3204);
            	    me2=equality_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, me2.getTree());
            	    dbg.location(1258,49);
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
            	    break loop80;
                }
            } while (true);
            } finally {dbg.exitSubRule(80);}

            dbg.location(1268,7);
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
        dbg.location(1274, 2);

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
        public Object result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equality_expr"
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1276:1: equality_expr returns [Object result] : me1= add_expr (op= predop me2= add_expr )* ;
    public final RuleSet2Parser.equality_expr_return equality_expr() throws RecognitionException {
        RuleSet2Parser.equality_expr_return retval = new RuleSet2Parser.equality_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RuleSet2Parser.add_expr_return me1 = null;

        RuleSet2Parser.predop_return op = null;

        RuleSet2Parser.add_expr_return me2 = null;




        	boolean found_op = false;
        	ArrayList result = new ArrayList();

        try { dbg.enterRule(getGrammarFileName(), "equality_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1276, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1281:2: (me1= add_expr (op= predop me2= add_expr )* )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1281:4: me1= add_expr (op= predop me2= add_expr )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(1281,7);
            pushFollow(FOLLOW_add_expr_in_equality_expr3235);
            me1=add_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, me1.getTree());
            dbg.location(1281,17);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1281:17: (op= predop me2= add_expr )*
            try { dbg.enterSubRule(81);

            loop81:
            do {
                int alt81=2;
                try { dbg.enterDecision(81);

                int LA81_0 = input.LA(1);

                if ( ((LA81_0>=18 && LA81_0<=26)) ) {
                    alt81=1;
                }


                } finally {dbg.exitDecision(81);}

                switch (alt81) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1281:18: op= predop me2= add_expr
            	    {
            	    dbg.location(1281,20);
            	    pushFollow(FOLLOW_predop_in_equality_expr3240);
            	    op=predop();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, op.getTree());
            	    dbg.location(1281,31);
            	    pushFollow(FOLLOW_add_expr_in_equality_expr3244);
            	    me2=add_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, me2.getTree());
            	    dbg.location(1281,41);
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
            	    break loop81;
                }
            } while (true);
            } finally {dbg.exitSubRule(81);}

            dbg.location(1290,6);
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
        dbg.location(1296, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "equality_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1299:1: add_expr returns [Object result] : me1= mult_expr (op= add_op me2= mult_expr )* ;
    public final RuleSet2Parser.add_expr_return add_expr() throws RecognitionException {
        RuleSet2Parser.add_expr_return retval = new RuleSet2Parser.add_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RuleSet2Parser.mult_expr_return me1 = null;

        RuleSet2Parser.add_op_return op = null;

        RuleSet2Parser.mult_expr_return me2 = null;




        	boolean found_op = false;
        	ArrayList result = new ArrayList();

        try { dbg.enterRule(getGrammarFileName(), "add_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1299, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1304:2: (me1= mult_expr (op= add_op me2= mult_expr )* )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1304:4: me1= mult_expr (op= add_op me2= mult_expr )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(1304,7);
            pushFollow(FOLLOW_mult_expr_in_add_expr3278);
            me1=mult_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, me1.getTree());
            dbg.location(1304,18);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1304:18: (op= add_op me2= mult_expr )*
            try { dbg.enterSubRule(82);

            loop82:
            do {
                int alt82=2;
                try { dbg.enterDecision(82);

                int LA82_0 = input.LA(1);

                if ( ((LA82_0>=27 && LA82_0<=28)) ) {
                    alt82=1;
                }


                } finally {dbg.exitDecision(82);}

                switch (alt82) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1304:19: op= add_op me2= mult_expr
            	    {
            	    dbg.location(1304,21);
            	    pushFollow(FOLLOW_add_op_in_add_expr3283);
            	    op=add_op();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, op.getTree());
            	    dbg.location(1304,32);
            	    pushFollow(FOLLOW_mult_expr_in_add_expr3287);
            	    me2=mult_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, me2.getTree());
            	    dbg.location(1304,44);
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
            	    break loop82;
                }
            } while (true);
            } finally {dbg.exitSubRule(82);}

            dbg.location(1314,6);
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
        dbg.location(1320, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "add_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "add_expr"

    public static class mult_op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mult_op"
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1323:1: mult_op : ( '*' | '/' | '%' );
    public final RuleSet2Parser.mult_op_return mult_op() throws RecognitionException {
        RuleSet2Parser.mult_op_return retval = new RuleSet2Parser.mult_op_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set131=null;

        Object set131_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "mult_op");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1323, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1323:8: ( '*' | '/' | '%' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(1323,8);
            set131=(Token)input.LT(1);
            if ( (input.LA(1)>=75 && input.LA(1)<=77) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set131));
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
        dbg.location(1323, 21);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "mult_op");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1325:1: mult_expr returns [Object result] : me1= unary_expr (op= mult_op me2= unary_expr )* ;
    public final RuleSet2Parser.mult_expr_return mult_expr() throws RecognitionException {
        RuleSet2Parser.mult_expr_return retval = new RuleSet2Parser.mult_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RuleSet2Parser.unary_expr_return me1 = null;

        RuleSet2Parser.mult_op_return op = null;

        RuleSet2Parser.unary_expr_return me2 = null;




        	boolean found_op = false;
        	ArrayList result = new ArrayList();

        try { dbg.enterRule(getGrammarFileName(), "mult_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1325, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1330:2: (me1= unary_expr (op= mult_op me2= unary_expr )* )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1330:4: me1= unary_expr (op= mult_op me2= unary_expr )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(1330,7);
            pushFollow(FOLLOW_unary_expr_in_mult_expr3335);
            me1=unary_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, me1.getTree());
            dbg.location(1330,19);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1330:19: (op= mult_op me2= unary_expr )*
            try { dbg.enterSubRule(83);

            loop83:
            do {
                int alt83=2;
                try { dbg.enterDecision(83);

                int LA83_0 = input.LA(1);

                if ( ((LA83_0>=75 && LA83_0<=77)) ) {
                    alt83=1;
                }


                } finally {dbg.exitDecision(83);}

                switch (alt83) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1330:20: op= mult_op me2= unary_expr
            	    {
            	    dbg.location(1330,22);
            	    pushFollow(FOLLOW_mult_op_in_mult_expr3340);
            	    op=mult_op();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, op.getTree());
            	    dbg.location(1330,34);
            	    pushFollow(FOLLOW_unary_expr_in_mult_expr3344);
            	    me2=unary_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, me2.getTree());
            	    dbg.location(1331,2);
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
            	    break loop83;
                }
            } while (true);
            } finally {dbg.exitSubRule(83);}

            dbg.location(1343,7);
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
        dbg.location(1351, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "mult_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1354:1: unary_expr returns [Object result] options {backtrack=true; } : ( 'not' unary_expr | 'seen' rx= STRING must_be[\"in\"] vd= var_domain ':' v= VAR (t= timeframe )? | 'seen' rx_1= STRING op= must_be_one[sar(\"before\",\"after\")] rx_2= STRING must_be[\"in\"] vd= var_domain ':' v= VAR | vd= var_domain ':' v= VAR pop= predop e= expr t= timeframe | vd= var_domain ':' v= VAR t= timeframe | oe= operator_expr );
    public final RuleSet2Parser.unary_expr_return unary_expr() throws RecognitionException {
        RuleSet2Parser.unary_expr_return retval = new RuleSet2Parser.unary_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token rx=null;
        Token v=null;
        Token rx_1=null;
        Token rx_2=null;
        Token string_literal132=null;
        Token string_literal134=null;
        Token char_literal136=null;
        Token string_literal137=null;
        Token char_literal139=null;
        Token char_literal140=null;
        Token char_literal141=null;
        RuleSet2Parser.var_domain_return vd = null;

        RuleSet2Parser.timeframe_return t = null;

        RuleSet2Parser.must_be_one_return op = null;

        RuleSet2Parser.predop_return pop = null;

        RuleSet2Parser.expr_return e = null;

        RuleSet2Parser.operator_expr_return oe = null;

        RuleSet2Parser.unary_expr_return unary_expr133 = null;

        RuleSet2Parser.must_be_return must_be135 = null;

        RuleSet2Parser.must_be_return must_be138 = null;


        Object rx_tree=null;
        Object v_tree=null;
        Object rx_1_tree=null;
        Object rx_2_tree=null;
        Object string_literal132_tree=null;
        Object string_literal134_tree=null;
        Object char_literal136_tree=null;
        Object string_literal137_tree=null;
        Object char_literal139_tree=null;
        Object char_literal140_tree=null;
        Object char_literal141_tree=null;




        try { dbg.enterRule(getGrammarFileName(), "unary_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1354, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1358:2: ( 'not' unary_expr | 'seen' rx= STRING must_be[\"in\"] vd= var_domain ':' v= VAR (t= timeframe )? | 'seen' rx_1= STRING op= must_be_one[sar(\"before\",\"after\")] rx_2= STRING must_be[\"in\"] vd= var_domain ':' v= VAR | vd= var_domain ':' v= VAR pop= predop e= expr t= timeframe | vd= var_domain ':' v= VAR t= timeframe | oe= operator_expr )
            int alt85=6;
            try { dbg.enterDecision(85);

            try {
                isCyclicDecision = true;
                alt85 = dfa85.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(85);}

            switch (alt85) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1358:4: 'not' unary_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(1358,4);
                    string_literal132=(Token)match(input,57,FOLLOW_57_in_unary_expr3384); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal132_tree = (Object)adaptor.create(string_literal132);
                    adaptor.addChild(root_0, string_literal132_tree);
                    }
                    dbg.location(1358,10);
                    pushFollow(FOLLOW_unary_expr_in_unary_expr3386);
                    unary_expr133=unary_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expr133.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1359:4: 'seen' rx= STRING must_be[\"in\"] vd= var_domain ':' v= VAR (t= timeframe )?
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(1359,4);
                    string_literal134=(Token)match(input,78,FOLLOW_78_in_unary_expr3393); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal134_tree = (Object)adaptor.create(string_literal134);
                    adaptor.addChild(root_0, string_literal134_tree);
                    }
                    dbg.location(1359,13);
                    rx=(Token)match(input,STRING,FOLLOW_STRING_in_unary_expr3397); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    rx_tree = (Object)adaptor.create(rx);
                    adaptor.addChild(root_0, rx_tree);
                    }
                    dbg.location(1359,21);
                    pushFollow(FOLLOW_must_be_in_unary_expr3399);
                    must_be135=must_be("in");

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, must_be135.getTree());
                    dbg.location(1359,37);
                    pushFollow(FOLLOW_var_domain_in_unary_expr3404);
                    vd=var_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vd.getTree());
                    dbg.location(1359,49);
                    char_literal136=(Token)match(input,39,FOLLOW_39_in_unary_expr3406); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal136_tree = (Object)adaptor.create(char_literal136);
                    adaptor.addChild(root_0, char_literal136_tree);
                    }
                    dbg.location(1359,54);
                    v=(Token)match(input,VAR,FOLLOW_VAR_in_unary_expr3410); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    v_tree = (Object)adaptor.create(v);
                    adaptor.addChild(root_0, v_tree);
                    }
                    dbg.location(1359,60);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1359:60: (t= timeframe )?
                    int alt84=2;
                    try { dbg.enterSubRule(84);
                    try { dbg.enterDecision(84);

                    try {
                        isCyclicDecision = true;
                        alt84 = dfa84.predict(input);
                    }
                    catch (NoViableAltException nvae) {
                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(84);}

                    switch (alt84) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: t= timeframe
                            {
                            dbg.location(1359,60);
                            pushFollow(FOLLOW_timeframe_in_unary_expr3414);
                            t=timeframe();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, t.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(84);}

                    dbg.location(1359,72);
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
                    dbg.enterAlt(3);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1370:4: 'seen' rx_1= STRING op= must_be_one[sar(\"before\",\"after\")] rx_2= STRING must_be[\"in\"] vd= var_domain ':' v= VAR
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(1370,4);
                    string_literal137=(Token)match(input,78,FOLLOW_78_in_unary_expr3422); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal137_tree = (Object)adaptor.create(string_literal137);
                    adaptor.addChild(root_0, string_literal137_tree);
                    }
                    dbg.location(1370,15);
                    rx_1=(Token)match(input,STRING,FOLLOW_STRING_in_unary_expr3426); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    rx_1_tree = (Object)adaptor.create(rx_1);
                    adaptor.addChild(root_0, rx_1_tree);
                    }
                    dbg.location(1370,25);
                    pushFollow(FOLLOW_must_be_one_in_unary_expr3430);
                    op=must_be_one(sar("before","after"));

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, op.getTree());
                    dbg.location(1370,65);
                    rx_2=(Token)match(input,STRING,FOLLOW_STRING_in_unary_expr3435); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    rx_2_tree = (Object)adaptor.create(rx_2);
                    adaptor.addChild(root_0, rx_2_tree);
                    }
                    dbg.location(1370,74);
                    pushFollow(FOLLOW_must_be_in_unary_expr3438);
                    must_be138=must_be("in");

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, must_be138.getTree());
                    dbg.location(1370,90);
                    pushFollow(FOLLOW_var_domain_in_unary_expr3443);
                    vd=var_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vd.getTree());
                    dbg.location(1370,102);
                    char_literal139=(Token)match(input,39,FOLLOW_39_in_unary_expr3445); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal139_tree = (Object)adaptor.create(char_literal139);
                    adaptor.addChild(root_0, char_literal139_tree);
                    }
                    dbg.location(1370,107);
                    v=(Token)match(input,VAR,FOLLOW_VAR_in_unary_expr3449); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    v_tree = (Object)adaptor.create(v);
                    adaptor.addChild(root_0, v_tree);
                    }
                    dbg.location(1370,112);
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
                    dbg.enterAlt(4);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1380:4: vd= var_domain ':' v= VAR pop= predop e= expr t= timeframe
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(1380,6);
                    pushFollow(FOLLOW_var_domain_in_unary_expr3458);
                    vd=var_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vd.getTree());
                    dbg.location(1380,18);
                    char_literal140=(Token)match(input,39,FOLLOW_39_in_unary_expr3460); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal140_tree = (Object)adaptor.create(char_literal140);
                    adaptor.addChild(root_0, char_literal140_tree);
                    }
                    dbg.location(1380,23);
                    v=(Token)match(input,VAR,FOLLOW_VAR_in_unary_expr3464); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    v_tree = (Object)adaptor.create(v);
                    adaptor.addChild(root_0, v_tree);
                    }
                    dbg.location(1380,31);
                    pushFollow(FOLLOW_predop_in_unary_expr3468);
                    pop=predop();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pop.getTree());
                    dbg.location(1380,40);
                    pushFollow(FOLLOW_expr_in_unary_expr3472);
                    e=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
                    dbg.location(1380,47);
                    pushFollow(FOLLOW_timeframe_in_unary_expr3476);
                    t=timeframe();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, t.getTree());
                    dbg.location(1380,59);
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
                    dbg.enterAlt(5);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1392:4: vd= var_domain ':' v= VAR t= timeframe
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(1392,6);
                    pushFollow(FOLLOW_var_domain_in_unary_expr3486);
                    vd=var_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vd.getTree());
                    dbg.location(1392,18);
                    char_literal141=(Token)match(input,39,FOLLOW_39_in_unary_expr3488); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal141_tree = (Object)adaptor.create(char_literal141);
                    adaptor.addChild(root_0, char_literal141_tree);
                    }
                    dbg.location(1392,23);
                    v=(Token)match(input,VAR,FOLLOW_VAR_in_unary_expr3492); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    v_tree = (Object)adaptor.create(v);
                    adaptor.addChild(root_0, v_tree);
                    }
                    dbg.location(1392,29);
                    pushFollow(FOLLOW_timeframe_in_unary_expr3496);
                    t=timeframe();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, t.getTree());
                    dbg.location(1392,40);
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
                    dbg.enterAlt(6);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1403:4: oe= operator_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(1403,6);
                    pushFollow(FOLLOW_operator_expr_in_unary_expr3505);
                    oe=operator_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, oe.getTree());
                    dbg.location(1403,21);
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
        dbg.location(1406, 2);

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
        public Object result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operator_expr"
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1409:1: operator_expr returns [Object result] : f= factor (o= operator )* ;
    public final RuleSet2Parser.operator_expr_return operator_expr() throws RecognitionException {
        RuleSet2Parser.operator_expr_return retval = new RuleSet2Parser.operator_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RuleSet2Parser.factor_return f = null;

        RuleSet2Parser.operator_return o = null;




        	ArrayList operators = new ArrayList();

        try { dbg.enterRule(getGrammarFileName(), "operator_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1409, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1414:2: (f= factor (o= operator )* )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1414:4: f= factor (o= operator )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(1414,5);
            pushFollow(FOLLOW_factor_in_operator_expr3534);
            f=factor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            dbg.location(1414,14);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1414:14: (o= operator )*
            try { dbg.enterSubRule(86);

            loop86:
            do {
                int alt86=2;
                try { dbg.enterDecision(86);

                int LA86_0 = input.LA(1);

                if ( ((LA86_0>=79 && LA86_0<=100)) ) {
                    alt86=1;
                }


                } finally {dbg.exitDecision(86);}

                switch (alt86) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1414:15: o= operator
            	    {
            	    dbg.location(1414,16);
            	    pushFollow(FOLLOW_operator_in_operator_expr3540);
            	    o=operator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, o.getTree());
            	    dbg.location(1414,26);
            	    if ( state.backtracking==0 ) {
            	       operators.add(o); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop86;
                }
            } while (true);
            } finally {dbg.exitSubRule(86);}

            dbg.location(1414,50);
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
        dbg.location(1450, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "operator_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1452:10: fragment operator returns [String oper,ArrayList exprs] : o= ( '.pick' | '.match' | '.length' | '.replace' | '.as' | '.head' | '.tail' | '.sort' | '.filter' | '.map' | '.uc' | '.lc' | '.split' | '.join' | '.query' | '.has' | '.union' | '.difference' | '.intersection' | '.unique' | '.once' | '.duplicates' ) '(' (e= expr ( ',' e1= expr )* )? ')' ;
    public final RuleSet2Parser.operator_return operator() throws RecognitionException {
        RuleSet2Parser.operator_return retval = new RuleSet2Parser.operator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token o=null;
        Token char_literal142=null;
        Token char_literal143=null;
        Token char_literal144=null;
        RuleSet2Parser.expr_return e = null;

        RuleSet2Parser.expr_return e1 = null;


        Object o_tree=null;
        Object char_literal142_tree=null;
        Object char_literal143_tree=null;
        Object char_literal144_tree=null;

        	
        	ArrayList rexprs = new ArrayList();

        try { dbg.enterRule(getGrammarFileName(), "operator");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1452, 10);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1457:2: (o= ( '.pick' | '.match' | '.length' | '.replace' | '.as' | '.head' | '.tail' | '.sort' | '.filter' | '.map' | '.uc' | '.lc' | '.split' | '.join' | '.query' | '.has' | '.union' | '.difference' | '.intersection' | '.unique' | '.once' | '.duplicates' ) '(' (e= expr ( ',' e1= expr )* )? ')' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1457:4: o= ( '.pick' | '.match' | '.length' | '.replace' | '.as' | '.head' | '.tail' | '.sort' | '.filter' | '.map' | '.uc' | '.lc' | '.split' | '.join' | '.query' | '.has' | '.union' | '.difference' | '.intersection' | '.unique' | '.once' | '.duplicates' ) '(' (e= expr ( ',' e1= expr )* )? ')'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(1457,5);
            o=(Token)input.LT(1);
            if ( (input.LA(1)>=79 && input.LA(1)<=100) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(o));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }

            dbg.location(1460,25);
            char_literal142=(Token)match(input,47,FOLLOW_47_in_operator3657); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal142_tree = (Object)adaptor.create(char_literal142);
            adaptor.addChild(root_0, char_literal142_tree);
            }
            dbg.location(1460,29);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1460:29: (e= expr ( ',' e1= expr )* )?
            int alt88=2;
            try { dbg.enterSubRule(88);
            try { dbg.enterDecision(88);

            int LA88_0 = input.LA(1);

            if ( ((LA88_0>=VAR && LA88_0<=INT)||LA88_0==FLOAT||(LA88_0>=STRING && LA88_0<=REGEXP)||LA88_0==29||LA88_0==47||LA88_0==57||LA88_0==71||LA88_0==78||(LA88_0>=101 && LA88_0<=103)||(LA88_0>=105 && LA88_0<=108)) ) {
                alt88=1;
            }
            } finally {dbg.exitDecision(88);}

            switch (alt88) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1460:30: e= expr ( ',' e1= expr )*
                    {
                    dbg.location(1460,31);
                    pushFollow(FOLLOW_expr_in_operator3662);
                    e=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
                    dbg.location(1460,37);
                    if ( state.backtracking==0 ) {
                      rexprs.add(e.result); 
                    }
                    dbg.location(1460,62);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1460:62: ( ',' e1= expr )*
                    try { dbg.enterSubRule(87);

                    loop87:
                    do {
                        int alt87=2;
                        try { dbg.enterDecision(87);

                        int LA87_0 = input.LA(1);

                        if ( (LA87_0==48) ) {
                            alt87=1;
                        }


                        } finally {dbg.exitDecision(87);}

                        switch (alt87) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1460:63: ',' e1= expr
                    	    {
                    	    dbg.location(1460,63);
                    	    char_literal143=(Token)match(input,48,FOLLOW_48_in_operator3667); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal143_tree = (Object)adaptor.create(char_literal143);
                    	    adaptor.addChild(root_0, char_literal143_tree);
                    	    }
                    	    dbg.location(1460,69);
                    	    pushFollow(FOLLOW_expr_in_operator3671);
                    	    e1=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, e1.getTree());
                    	    dbg.location(1460,75);
                    	    if ( state.backtracking==0 ) {
                    	      rexprs.add(e1.result); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop87;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(87);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(88);}

            dbg.location(1460,106);
            char_literal144=(Token)match(input,49,FOLLOW_49_in_operator3680); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal144_tree = (Object)adaptor.create(char_literal144);
            adaptor.addChild(root_0, char_literal144_tree);
            }
            dbg.location(1460,110);
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
        dbg.location(1465, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "operator");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1469:1: factor returns [Object result] options {backtrack=true; } : (v= INT | v= STRING | v= FLOAT | v= ( 'true' | 'false' ) | vr= REGEXP | v= VAR '[' e= expr ']' | d= var_domain ':' v= VAR | 'current' d= var_domain ':' v= VAR | 'history' e= expr d= var_domain ':' v= VAR | n= namespace p= VAR '(' (e= expr ( ',' )? )* ')' | v= VAR '(' (e= expr ( ',' )? )* ')' | '[' e= expr ( ',' e2= expr )* ']' | '{' h1= hash_line ( ',' h2= hash_line )* '}' | v= VAR | '(' e= expr ')' );
    public final RuleSet2Parser.factor_return factor() throws RecognitionException {
        RuleSet2Parser.factor_return retval = new RuleSet2Parser.factor_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token v=null;
        Token vr=null;
        Token p=null;
        Token char_literal145=null;
        Token char_literal146=null;
        Token char_literal147=null;
        Token string_literal148=null;
        Token char_literal149=null;
        Token string_literal150=null;
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
        Token char_literal163=null;
        Token char_literal164=null;
        Token char_literal165=null;
        RuleSet2Parser.expr_return e = null;

        RuleSet2Parser.var_domain_return d = null;

        RuleSet2Parser.namespace_return n = null;

        RuleSet2Parser.expr_return e2 = null;

        RuleSet2Parser.hash_line_return h1 = null;

        RuleSet2Parser.hash_line_return h2 = null;


        Object v_tree=null;
        Object vr_tree=null;
        Object p_tree=null;
        Object char_literal145_tree=null;
        Object char_literal146_tree=null;
        Object char_literal147_tree=null;
        Object string_literal148_tree=null;
        Object char_literal149_tree=null;
        Object string_literal150_tree=null;
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
        Object char_literal163_tree=null;
        Object char_literal164_tree=null;
        Object char_literal165_tree=null;


              ArrayList exprs2 = new ArrayList();


        try { dbg.enterRule(getGrammarFileName(), "factor");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1469, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1474:2: (v= INT | v= STRING | v= FLOAT | v= ( 'true' | 'false' ) | vr= REGEXP | v= VAR '[' e= expr ']' | d= var_domain ':' v= VAR | 'current' d= var_domain ':' v= VAR | 'history' e= expr d= var_domain ':' v= VAR | n= namespace p= VAR '(' (e= expr ( ',' )? )* ')' | v= VAR '(' (e= expr ( ',' )? )* ')' | '[' e= expr ( ',' e2= expr )* ']' | '{' h1= hash_line ( ',' h2= hash_line )* '}' | v= VAR | '(' e= expr ')' )
            int alt95=15;
            try { dbg.enterDecision(95);

            try {
                isCyclicDecision = true;
                alt95 = dfa95.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(95);}

            switch (alt95) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1474:4: v= INT
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(1474,5);
                    v=(Token)match(input,INT,FOLLOW_INT_in_factor3719); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    v_tree = (Object)adaptor.create(v);
                    adaptor.addChild(root_0, v_tree);
                    }
                    dbg.location(1474,10);
                    if ( state.backtracking==0 ) {
                       
                      		HashMap tmp = new HashMap();
                      		tmp.put("type","num");
                      		tmp.put("val",Long.getLong((v!=null?v.getText():null)));
                      		retval.result = tmp;
                      	
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1480:9: v= STRING
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(1480,10);
                    v=(Token)match(input,STRING,FOLLOW_STRING_in_factor3734); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    v_tree = (Object)adaptor.create(v);
                    adaptor.addChild(root_0, v_tree);
                    }
                    dbg.location(1480,20);
                    if ( state.backtracking==0 ) {
                       
                            		HashMap tmp = new HashMap();
                      		tmp.put("type","str");
                      		tmp.put("val",strip_string((v!=null?v.getText():null)));
                      		retval.result = tmp;
                      	
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1486:9: v= FLOAT
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(1486,10);
                    v=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_factor3754); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    v_tree = (Object)adaptor.create(v);
                    adaptor.addChild(root_0, v_tree);
                    }
                    dbg.location(1486,19);
                    if ( state.backtracking==0 ) {
                       
                            		HashMap tmp = new HashMap();
                      		tmp.put("type","num");
                      		tmp.put("val",Float.parseFloat((v!=null?v.getText():null)));
                      		retval.result = tmp;
                      	
                    }

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1492:9: v= ( 'true' | 'false' )
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(1492,10);
                    v=(Token)input.LT(1);
                    if ( (input.LA(1)>=101 && input.LA(1)<=102) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(v));
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(1492,31);
                    if ( state.backtracking==0 ) {
                       
                            		HashMap tmp = new HashMap();
                      		tmp.put("type","bool");
                      		tmp.put("val",(v!=null?v.getText():null));
                      		retval.result = tmp;
                      	
                    }

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1498:9: vr= REGEXP
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(1498,11);
                    vr=(Token)match(input,REGEXP,FOLLOW_REGEXP_in_factor3794); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    vr_tree = (Object)adaptor.create(vr);
                    adaptor.addChild(root_0, vr_tree);
                    }
                    dbg.location(1498,19);
                    if ( state.backtracking==0 ) {

                            		HashMap tmp = new HashMap();
                      		tmp.put("type","regx");
                      		tmp.put("val",strip_string((vr!=null?vr.getText():null)));
                      		retval.result = tmp;
                            
                    }

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1504:9: v= VAR '[' e= expr ']'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(1504,10);
                    v=(Token)match(input,VAR,FOLLOW_VAR_in_factor3808); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    v_tree = (Object)adaptor.create(v);
                    adaptor.addChild(root_0, v_tree);
                    }
                    dbg.location(1504,15);
                    char_literal145=(Token)match(input,103,FOLLOW_103_in_factor3810); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal145_tree = (Object)adaptor.create(char_literal145);
                    adaptor.addChild(root_0, char_literal145_tree);
                    }
                    dbg.location(1504,20);
                    pushFollow(FOLLOW_expr_in_factor3814);
                    e=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
                    dbg.location(1504,26);
                    char_literal146=(Token)match(input,104,FOLLOW_104_in_factor3816); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal146_tree = (Object)adaptor.create(char_literal146);
                    adaptor.addChild(root_0, char_literal146_tree);
                    }
                    dbg.location(1504,31);
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
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1518:9: d= var_domain ':' v= VAR
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(1518,10);
                    pushFollow(FOLLOW_var_domain_in_factor3831);
                    d=var_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, d.getTree());
                    dbg.location(1518,22);
                    char_literal147=(Token)match(input,39,FOLLOW_39_in_factor3833); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal147_tree = (Object)adaptor.create(char_literal147);
                    adaptor.addChild(root_0, char_literal147_tree);
                    }
                    dbg.location(1518,27);
                    v=(Token)match(input,VAR,FOLLOW_VAR_in_factor3837); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    v_tree = (Object)adaptor.create(v);
                    adaptor.addChild(root_0, v_tree);
                    }
                    dbg.location(1518,32);
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
                    dbg.enterAlt(8);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1525:9: 'current' d= var_domain ':' v= VAR
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(1525,9);
                    string_literal148=(Token)match(input,105,FOLLOW_105_in_factor3849); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal148_tree = (Object)adaptor.create(string_literal148);
                    adaptor.addChild(root_0, string_literal148_tree);
                    }
                    dbg.location(1525,20);
                    pushFollow(FOLLOW_var_domain_in_factor3853);
                    d=var_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, d.getTree());
                    dbg.location(1525,32);
                    char_literal149=(Token)match(input,39,FOLLOW_39_in_factor3855); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal149_tree = (Object)adaptor.create(char_literal149);
                    adaptor.addChild(root_0, char_literal149_tree);
                    }
                    dbg.location(1525,37);
                    v=(Token)match(input,VAR,FOLLOW_VAR_in_factor3859); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    v_tree = (Object)adaptor.create(v);
                    adaptor.addChild(root_0, v_tree);
                    }
                    dbg.location(1525,42);
                    if ( state.backtracking==0 ) {

                            	      	HashMap tmp = new HashMap();
                      	      	tmp.put("domain",(d!=null?input.toString(d.start,d.stop):null));
                      	      	tmp.put("name",(v!=null?v.getText():null));
                      	      	tmp.put("type","persistent");
                      	      	retval.result = tmp;
                            
                    }

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1532:9: 'history' e= expr d= var_domain ':' v= VAR
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(1532,9);
                    string_literal150=(Token)match(input,106,FOLLOW_106_in_factor3872); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal150_tree = (Object)adaptor.create(string_literal150);
                    adaptor.addChild(root_0, string_literal150_tree);
                    }
                    dbg.location(1532,20);
                    pushFollow(FOLLOW_expr_in_factor3876);
                    e=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
                    dbg.location(1532,27);
                    pushFollow(FOLLOW_var_domain_in_factor3880);
                    d=var_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, d.getTree());
                    dbg.location(1532,39);
                    char_literal151=(Token)match(input,39,FOLLOW_39_in_factor3882); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal151_tree = (Object)adaptor.create(char_literal151);
                    adaptor.addChild(root_0, char_literal151_tree);
                    }
                    dbg.location(1532,44);
                    v=(Token)match(input,VAR,FOLLOW_VAR_in_factor3886); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    v_tree = (Object)adaptor.create(v);
                    adaptor.addChild(root_0, v_tree);
                    }
                    dbg.location(1532,49);
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
                case 10 :
                    dbg.enterAlt(10);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1542:9: n= namespace p= VAR '(' (e= expr ( ',' )? )* ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(1542,10);
                    pushFollow(FOLLOW_namespace_in_factor3900);
                    n=namespace();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, n.getTree());
                    dbg.location(1542,22);
                    p=(Token)match(input,VAR,FOLLOW_VAR_in_factor3904); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    p_tree = (Object)adaptor.create(p);
                    adaptor.addChild(root_0, p_tree);
                    }
                    dbg.location(1542,27);
                    char_literal152=(Token)match(input,47,FOLLOW_47_in_factor3906); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal152_tree = (Object)adaptor.create(char_literal152);
                    adaptor.addChild(root_0, char_literal152_tree);
                    }
                    dbg.location(1542,31);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1542:31: (e= expr ( ',' )? )*
                    try { dbg.enterSubRule(90);

                    loop90:
                    do {
                        int alt90=2;
                        try { dbg.enterDecision(90);

                        int LA90_0 = input.LA(1);

                        if ( ((LA90_0>=VAR && LA90_0<=INT)||LA90_0==FLOAT||(LA90_0>=STRING && LA90_0<=REGEXP)||LA90_0==29||LA90_0==47||LA90_0==57||LA90_0==71||LA90_0==78||(LA90_0>=101 && LA90_0<=103)||(LA90_0>=105 && LA90_0<=108)) ) {
                            alt90=1;
                        }


                        } finally {dbg.exitDecision(90);}

                        switch (alt90) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1542:32: e= expr ( ',' )?
                    	    {
                    	    dbg.location(1542,33);
                    	    pushFollow(FOLLOW_expr_in_factor3911);
                    	    e=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
                    	    dbg.location(1542,39);
                    	    if ( state.backtracking==0 ) {

                    	                  exprs2.add((e!=null?e.result:null));
                    	            	
                    	    }
                    	    dbg.location(1545,8);
                    	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1545:8: ( ',' )?
                    	    int alt89=2;
                    	    try { dbg.enterSubRule(89);
                    	    try { dbg.enterDecision(89);

                    	    int LA89_0 = input.LA(1);

                    	    if ( (LA89_0==48) ) {
                    	        alt89=1;
                    	    }
                    	    } finally {dbg.exitDecision(89);}

                    	    switch (alt89) {
                    	        case 1 :
                    	            dbg.enterAlt(1);

                    	            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: ','
                    	            {
                    	            dbg.location(1545,8);
                    	            char_literal153=(Token)match(input,48,FOLLOW_48_in_factor3922); if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) {
                    	            char_literal153_tree = (Object)adaptor.create(char_literal153);
                    	            adaptor.addChild(root_0, char_literal153_tree);
                    	            }

                    	            }
                    	            break;

                    	    }
                    	    } finally {dbg.exitSubRule(89);}


                    	    }
                    	    break;

                    	default :
                    	    break loop90;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(90);}

                    dbg.location(1545,15);
                    char_literal154=(Token)match(input,49,FOLLOW_49_in_factor3927); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal154_tree = (Object)adaptor.create(char_literal154);
                    adaptor.addChild(root_0, char_literal154_tree);
                    }
                    dbg.location(1545,20);
                    if ( state.backtracking==0 ) {

                      	      	HashMap tmp = new HashMap();
                      	      	tmp.put("predicate",(p!=null?p.getText():null));
                      	      	tmp.put("source",(n!=null?input.toString(n.start,n.stop):null));
                      	      	tmp.put("args",exprs2);
                      	      	retval.result = tmp;
                            
                    }

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1552:9: v= VAR '(' (e= expr ( ',' )? )* ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(1552,10);
                    v=(Token)match(input,VAR,FOLLOW_VAR_in_factor3942); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    v_tree = (Object)adaptor.create(v);
                    adaptor.addChild(root_0, v_tree);
                    }
                    dbg.location(1552,15);
                    char_literal155=(Token)match(input,47,FOLLOW_47_in_factor3944); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal155_tree = (Object)adaptor.create(char_literal155);
                    adaptor.addChild(root_0, char_literal155_tree);
                    }
                    dbg.location(1552,19);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1552:19: (e= expr ( ',' )? )*
                    try { dbg.enterSubRule(92);

                    loop92:
                    do {
                        int alt92=2;
                        try { dbg.enterDecision(92);

                        int LA92_0 = input.LA(1);

                        if ( ((LA92_0>=VAR && LA92_0<=INT)||LA92_0==FLOAT||(LA92_0>=STRING && LA92_0<=REGEXP)||LA92_0==29||LA92_0==47||LA92_0==57||LA92_0==71||LA92_0==78||(LA92_0>=101 && LA92_0<=103)||(LA92_0>=105 && LA92_0<=108)) ) {
                            alt92=1;
                        }


                        } finally {dbg.exitDecision(92);}

                        switch (alt92) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1552:20: e= expr ( ',' )?
                    	    {
                    	    dbg.location(1552,21);
                    	    pushFollow(FOLLOW_expr_in_factor3949);
                    	    e=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
                    	    dbg.location(1552,26);
                    	    if ( state.backtracking==0 ) {

                    	                  exprs2.add((e!=null?e.result:null));
                    	            	
                    	    }
                    	    dbg.location(1555,2);
                    	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1555:2: ( ',' )?
                    	    int alt91=2;
                    	    try { dbg.enterSubRule(91);
                    	    try { dbg.enterDecision(91);

                    	    int LA91_0 = input.LA(1);

                    	    if ( (LA91_0==48) ) {
                    	        alt91=1;
                    	    }
                    	    } finally {dbg.exitDecision(91);}

                    	    switch (alt91) {
                    	        case 1 :
                    	            dbg.enterAlt(1);

                    	            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: ','
                    	            {
                    	            dbg.location(1555,2);
                    	            char_literal156=(Token)match(input,48,FOLLOW_48_in_factor3953); if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) {
                    	            char_literal156_tree = (Object)adaptor.create(char_literal156);
                    	            adaptor.addChild(root_0, char_literal156_tree);
                    	            }

                    	            }
                    	            break;

                    	    }
                    	    } finally {dbg.exitSubRule(91);}


                    	    }
                    	    break;

                    	default :
                    	    break loop92;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(92);}

                    dbg.location(1555,9);
                    char_literal157=(Token)match(input,49,FOLLOW_49_in_factor3958); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal157_tree = (Object)adaptor.create(char_literal157);
                    adaptor.addChild(root_0, char_literal157_tree);
                    }
                    dbg.location(1555,13);
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
                case 12 :
                    dbg.enterAlt(12);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1566:9: '[' e= expr ( ',' e2= expr )* ']'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(1566,9);
                    char_literal158=(Token)match(input,103,FOLLOW_103_in_factor3970); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal158_tree = (Object)adaptor.create(char_literal158);
                    adaptor.addChild(root_0, char_literal158_tree);
                    }
                    dbg.location(1566,14);
                    pushFollow(FOLLOW_expr_in_factor3974);
                    e=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
                    dbg.location(1566,20);
                    if ( state.backtracking==0 ) {

                            			exprs2.add((e!=null?e.result:null));
                            		 
                    }
                    dbg.location(1568,12);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1568:12: ( ',' e2= expr )*
                    try { dbg.enterSubRule(93);

                    loop93:
                    do {
                        int alt93=2;
                        try { dbg.enterDecision(93);

                        int LA93_0 = input.LA(1);

                        if ( (LA93_0==48) ) {
                            alt93=1;
                        }


                        } finally {dbg.exitDecision(93);}

                        switch (alt93) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1568:13: ',' e2= expr
                    	    {
                    	    dbg.location(1568,13);
                    	    char_literal159=(Token)match(input,48,FOLLOW_48_in_factor3979); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal159_tree = (Object)adaptor.create(char_literal159);
                    	    adaptor.addChild(root_0, char_literal159_tree);
                    	    }
                    	    dbg.location(1568,19);
                    	    pushFollow(FOLLOW_expr_in_factor3983);
                    	    e2=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, e2.getTree());
                    	    dbg.location(1568,24);
                    	    if ( state.backtracking==0 ) {

                    	            			exprs2.add((e2!=null?e2.result:null));
                    	            		 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop93;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(93);}

                    dbg.location(1570,14);
                    char_literal160=(Token)match(input,104,FOLLOW_104_in_factor3988); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal160_tree = (Object)adaptor.create(char_literal160);
                    adaptor.addChild(root_0, char_literal160_tree);
                    }
                    dbg.location(1570,18);
                    if ( state.backtracking==0 ) {

                            			HashMap tmp = new HashMap();
                            			tmp.put("val",exprs2);	
                            			tmp.put("type","array");
                            		 
                      	      	retval.result = tmp;
                            
                    }

                    }
                    break;
                case 13 :
                    dbg.enterAlt(13);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1577:9: '{' h1= hash_line ( ',' h2= hash_line )* '}'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(1577,9);
                    char_literal161=(Token)match(input,29,FOLLOW_29_in_factor4000); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal161_tree = (Object)adaptor.create(char_literal161);
                    adaptor.addChild(root_0, char_literal161_tree);
                    }
                    dbg.location(1577,15);
                    pushFollow(FOLLOW_hash_line_in_factor4004);
                    h1=hash_line();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, h1.getTree());
                    dbg.location(1577,26);
                    if ( state.backtracking==0 ) {

                            			exprs2.add((h1!=null?h1.result:null));
                            		 
                    }
                    dbg.location(1579,12);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1579:12: ( ',' h2= hash_line )*
                    try { dbg.enterSubRule(94);

                    loop94:
                    do {
                        int alt94=2;
                        try { dbg.enterDecision(94);

                        int LA94_0 = input.LA(1);

                        if ( (LA94_0==48) ) {
                            alt94=1;
                        }


                        } finally {dbg.exitDecision(94);}

                        switch (alt94) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1579:13: ',' h2= hash_line
                    	    {
                    	    dbg.location(1579,13);
                    	    char_literal162=(Token)match(input,48,FOLLOW_48_in_factor4009); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal162_tree = (Object)adaptor.create(char_literal162);
                    	    adaptor.addChild(root_0, char_literal162_tree);
                    	    }
                    	    dbg.location(1579,19);
                    	    pushFollow(FOLLOW_hash_line_in_factor4013);
                    	    h2=hash_line();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, h2.getTree());
                    	    dbg.location(1579,30);
                    	    if ( state.backtracking==0 ) {

                    	            			exprs2.add((h2!=null?h2.result:null));
                    	            		 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop94;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(94);}

                    dbg.location(1581,14);
                    char_literal163=(Token)match(input,30,FOLLOW_30_in_factor4019); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal163_tree = (Object)adaptor.create(char_literal163);
                    adaptor.addChild(root_0, char_literal163_tree);
                    }
                    dbg.location(1581,18);
                    if ( state.backtracking==0 ) {

                            			HashMap tmp = new HashMap();
                            			tmp.put("val",exprs2);	
                            			tmp.put("type","hashraw");
                            		 
                      	      	retval.result = tmp;
                      	
                    }

                    }
                    break;
                case 14 :
                    dbg.enterAlt(14);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1588:9: v= VAR
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(1588,10);
                    v=(Token)match(input,VAR,FOLLOW_VAR_in_factor4033); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    v_tree = (Object)adaptor.create(v);
                    adaptor.addChild(root_0, v_tree);
                    }
                    dbg.location(1588,16);
                    if ( state.backtracking==0 ) {
                       
                            		HashMap tmp = new HashMap();
                      		tmp.put("type","var");
                      		tmp.put("val",(v!=null?v.getText():null));
                      		retval.result = tmp;

                    }

                    }
                    break;
                case 15 :
                    dbg.enterAlt(15);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1594:9: '(' e= expr ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(1594,9);
                    char_literal164=(Token)match(input,47,FOLLOW_47_in_factor4046); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal164_tree = (Object)adaptor.create(char_literal164);
                    adaptor.addChild(root_0, char_literal164_tree);
                    }
                    dbg.location(1594,14);
                    pushFollow(FOLLOW_expr_in_factor4050);
                    e=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
                    dbg.location(1594,20);
                    char_literal165=(Token)match(input,49,FOLLOW_49_in_factor4052); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal165_tree = (Object)adaptor.create(char_literal165);
                    adaptor.addChild(root_0, char_literal165_tree);
                    }
                    dbg.location(1594,24);
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
        dbg.location(1597, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "factor");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "factor"

    public static class var_domain_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "var_domain"
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1598:10: fragment var_domain : ( 'ent' | 'app' );
    public final RuleSet2Parser.var_domain_return var_domain() throws RecognitionException {
        RuleSet2Parser.var_domain_return retval = new RuleSet2Parser.var_domain_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set166=null;

        Object set166_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "var_domain");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1598, 10);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1598:20: ( 'ent' | 'app' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(1598,20);
            set166=(Token)input.LT(1);
            if ( (input.LA(1)>=107 && input.LA(1)<=108) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set166));
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
        dbg.location(1598, 35);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "var_domain");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1603:10: fragment namespace returns [String result] : v= VAR ':' ;
    public final RuleSet2Parser.namespace_return namespace() throws RecognitionException {
        RuleSet2Parser.namespace_return retval = new RuleSet2Parser.namespace_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token v=null;
        Token char_literal167=null;

        Object v_tree=null;
        Object char_literal167_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "namespace");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1603, 10);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1604:2: (v= VAR ':' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1604:4: v= VAR ':'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(1604,5);
            v=(Token)match(input,VAR,FOLLOW_VAR_in_namespace4095); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            v_tree = (Object)adaptor.create(v);
            adaptor.addChild(root_0, v_tree);
            }
            dbg.location(1604,10);
            char_literal167=(Token)match(input,39,FOLLOW_39_in_namespace4097); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal167_tree = (Object)adaptor.create(char_literal167);
            adaptor.addChild(root_0, char_literal167_tree);
            }
            dbg.location(1605,2);
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
        dbg.location(1608, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "namespace");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1611:1: timeframe returns [Object result,String time] : 'within' e= expr p= period ;
    public final RuleSet2Parser.timeframe_return timeframe() throws RecognitionException {
        RuleSet2Parser.timeframe_return retval = new RuleSet2Parser.timeframe_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal168=null;
        RuleSet2Parser.expr_return e = null;

        RuleSet2Parser.period_return p = null;


        Object string_literal168_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "timeframe");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1611, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1612:2: ( 'within' e= expr p= period )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1612:5: 'within' e= expr p= period
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(1612,5);
            string_literal168=(Token)match(input,109,FOLLOW_109_in_timeframe4119); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal168_tree = (Object)adaptor.create(string_literal168);
            adaptor.addChild(root_0, string_literal168_tree);
            }
            dbg.location(1612,15);
            pushFollow(FOLLOW_expr_in_timeframe4123);
            e=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
            dbg.location(1612,22);
            pushFollow(FOLLOW_period_in_timeframe4127);
            p=period();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p.getTree());
            dbg.location(1612,30);
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
        dbg.location(1617, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "timeframe");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1619:1: hash_line returns [HashMap result] : s= STRING ':' e= expr ;
    public final RuleSet2Parser.hash_line_return hash_line() throws RecognitionException {
        RuleSet2Parser.hash_line_return retval = new RuleSet2Parser.hash_line_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token s=null;
        Token char_literal169=null;
        RuleSet2Parser.expr_return e = null;


        Object s_tree=null;
        Object char_literal169_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "hash_line");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1619, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1620:2: (s= STRING ':' e= expr )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1620:4: s= STRING ':' e= expr
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(1620,5);
            s=(Token)match(input,STRING,FOLLOW_STRING_in_hash_line4151); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            s_tree = (Object)adaptor.create(s);
            adaptor.addChild(root_0, s_tree);
            }
            dbg.location(1620,13);
            char_literal169=(Token)match(input,39,FOLLOW_39_in_hash_line4153); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal169_tree = (Object)adaptor.create(char_literal169);
            adaptor.addChild(root_0, char_literal169_tree);
            }
            dbg.location(1620,18);
            pushFollow(FOLLOW_expr_in_hash_line4157);
            e=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
            dbg.location(1620,25);
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
        dbg.location(1627, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "hash_line");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1629:1: css_emit returns [String emit_value] : 'css' (h= HTML | h= STRING ) ;
    public final RuleSet2Parser.css_emit_return css_emit() throws RecognitionException {
        RuleSet2Parser.css_emit_return retval = new RuleSet2Parser.css_emit_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token h=null;
        Token string_literal170=null;

        Object h_tree=null;
        Object string_literal170_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "css_emit");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1629, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1630:2: ( 'css' (h= HTML | h= STRING ) )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1630:4: 'css' (h= HTML | h= STRING )
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(1630,4);
            string_literal170=(Token)match(input,110,FOLLOW_110_in_css_emit4175); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal170_tree = (Object)adaptor.create(string_literal170);
            adaptor.addChild(root_0, string_literal170_tree);
            }
            dbg.location(1630,10);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1630:10: (h= HTML | h= STRING )
            int alt96=2;
            try { dbg.enterSubRule(96);
            try { dbg.enterDecision(96);

            int LA96_0 = input.LA(1);

            if ( (LA96_0==HTML) ) {
                alt96=1;
            }
            else if ( (LA96_0==STRING) ) {
                alt96=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(96);}

            switch (alt96) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1630:12: h= HTML
                    {
                    dbg.location(1630,13);
                    h=(Token)match(input,HTML,FOLLOW_HTML_in_css_emit4181); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    h_tree = (Object)adaptor.create(h);
                    adaptor.addChild(root_0, h_tree);
                    }
                    dbg.location(1630,19);
                    if ( state.backtracking==0 ) {
                      retval.emit_value = strip_wrappers("<<",">>",(h!=null?h.getText():null));
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1631:3: h= STRING
                    {
                    dbg.location(1631,4);
                    h=(Token)match(input,STRING,FOLLOW_STRING_in_css_emit4189); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    h_tree = (Object)adaptor.create(h);
                    adaptor.addChild(root_0, h_tree);
                    }
                    dbg.location(1631,12);
                    if ( state.backtracking==0 ) {
                      retval.emit_value = strip_string((h!=null?h.getText():null));
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(96);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(1633, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "css_emit");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "css_emit"

    public static class period_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "period"
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1635:10: fragment period : must_be_one[sar( \"years\", \"months\", \"weeks\", \"days\", \"hours\", \"minutes\", \"seconds\", \"year\", \"month\", \"week\", \"day\", \"hour\", \"minute\", \"second\")] ;
    public final RuleSet2Parser.period_return period() throws RecognitionException {
        RuleSet2Parser.period_return retval = new RuleSet2Parser.period_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RuleSet2Parser.must_be_one_return must_be_one171 = null;



        try { dbg.enterRule(getGrammarFileName(), "period");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1635, 10);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1636:2: ( must_be_one[sar( \"years\", \"months\", \"weeks\", \"days\", \"hours\", \"minutes\", \"seconds\", \"year\", \"month\", \"week\", \"day\", \"hour\", \"minute\", \"second\")] )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1637:3: must_be_one[sar( \"years\", \"months\", \"weeks\", \"days\", \"hours\", \"minutes\", \"seconds\", \"year\", \"month\", \"week\", \"day\", \"hour\", \"minute\", \"second\")]
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(1637,3);
            pushFollow(FOLLOW_must_be_one_in_period4212);
            must_be_one171=must_be_one(sar( "years", "months", "weeks", "days", "hours", "minutes", "seconds", "year", "month", "week", "day", "hour", "minute", "second"));

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, must_be_one171.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(1638, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "period");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1657:1: cachable returns [Object what] : ca= 'cachable' ( 'for' tm= INT per= period )? ;
    public final RuleSet2Parser.cachable_return cachable() throws RecognitionException {
        RuleSet2Parser.cachable_return retval = new RuleSet2Parser.cachable_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ca=null;
        Token tm=null;
        Token string_literal172=null;
        RuleSet2Parser.period_return per = null;


        Object ca_tree=null;
        Object tm_tree=null;
        Object string_literal172_tree=null;


        	retval.what = null;

        try { dbg.enterRule(getGrammarFileName(), "cachable");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1657, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1661:2: (ca= 'cachable' ( 'for' tm= INT per= period )? )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1662:3: ca= 'cachable' ( 'for' tm= INT per= period )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(1662,5);
            ca=(Token)match(input,111,FOLLOW_111_in_cachable4246); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ca_tree = (Object)adaptor.create(ca);
            adaptor.addChild(root_0, ca_tree);
            }
            dbg.location(1662,17);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1662:17: ( 'for' tm= INT per= period )?
            int alt97=2;
            try { dbg.enterSubRule(97);
            try { dbg.enterDecision(97);

            int LA97_0 = input.LA(1);

            if ( (LA97_0==45) ) {
                alt97=1;
            }
            } finally {dbg.exitDecision(97);}

            switch (alt97) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1662:18: 'for' tm= INT per= period
                    {
                    dbg.location(1662,18);
                    string_literal172=(Token)match(input,45,FOLLOW_45_in_cachable4249); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal172_tree = (Object)adaptor.create(string_literal172);
                    adaptor.addChild(root_0, string_literal172_tree);
                    }
                    dbg.location(1662,26);
                    tm=(Token)match(input,INT,FOLLOW_INT_in_cachable4253); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    tm_tree = (Object)adaptor.create(tm);
                    adaptor.addChild(root_0, tm_tree);
                    }
                    dbg.location(1662,34);
                    pushFollow(FOLLOW_period_in_cachable4257);
                    per=period();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, per.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(97);}

            dbg.location(1662,44);
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
        dbg.location(1678, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "cachable");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1682:1: emit_block returns [String emit_value] : 'emit' (h= HTML | h= STRING | h= JS ) ;
    public final RuleSet2Parser.emit_block_return emit_block() throws RecognitionException {
        RuleSet2Parser.emit_block_return retval = new RuleSet2Parser.emit_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token h=null;
        Token string_literal173=null;

        Object h_tree=null;
        Object string_literal173_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "emit_block");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1682, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1683:2: ( 'emit' (h= HTML | h= STRING | h= JS ) )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1683:4: 'emit' (h= HTML | h= STRING | h= JS )
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(1683,4);
            string_literal173=(Token)match(input,112,FOLLOW_112_in_emit_block4281); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal173_tree = (Object)adaptor.create(string_literal173);
            adaptor.addChild(root_0, string_literal173_tree);
            }
            dbg.location(1683,11);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1683:11: (h= HTML | h= STRING | h= JS )
            int alt98=3;
            try { dbg.enterSubRule(98);
            try { dbg.enterDecision(98);

            switch ( input.LA(1) ) {
            case HTML:
                {
                alt98=1;
                }
                break;
            case STRING:
                {
                alt98=2;
                }
                break;
            case JS:
                {
                alt98=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(98);}

            switch (alt98) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1683:13: h= HTML
                    {
                    dbg.location(1683,14);
                    h=(Token)match(input,HTML,FOLLOW_HTML_in_emit_block4287); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    h_tree = (Object)adaptor.create(h);
                    adaptor.addChild(root_0, h_tree);
                    }
                    dbg.location(1683,20);
                    if ( state.backtracking==0 ) {
                      retval.emit_value = strip_wrappers("<<",">>",(h!=null?h.getText():null));
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1684:3: h= STRING
                    {
                    dbg.location(1684,4);
                    h=(Token)match(input,STRING,FOLLOW_STRING_in_emit_block4295); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    h_tree = (Object)adaptor.create(h);
                    adaptor.addChild(root_0, h_tree);
                    }
                    dbg.location(1684,12);
                    if ( state.backtracking==0 ) {
                      retval.emit_value = strip_string((h!=null?h.getText():null));
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1685:3: h= JS
                    {
                    dbg.location(1685,4);
                    h=(Token)match(input,JS,FOLLOW_JS_in_emit_block4303); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    h_tree = (Object)adaptor.create(h);
                    adaptor.addChild(root_0, h_tree);
                    }
                    dbg.location(1685,8);
                    if ( state.backtracking==0 ) {
                      retval.emit_value = strip_wrappers("<|","|>",(h!=null?h.getText():null));
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(98);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(1687, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "emit_block");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "emit_block"

    public static class meta_block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "meta_block"
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1689:1: meta_block : 'meta' '{' (name= must_be_one[sar(\"description\",\"name\",\"author\")] (html_desc= HTML | string_desc= STRING ) | 'key' what= must_be_one[sar(\"errorstack\",\"googleanalytics\",\"twitter\",\"amazon\",\"kpds\",\"google\")] (key_value= STRING | '{' ( name_value_pair[key_values] ( ',' name_value_pair[key_values] )* ) '}' )+ | 'authz' 'require' 'user' | 'logging' onoff= ( 'on' | 'off' ) | 'use' ( (rtype= ( 'css' | 'javascript' ) must_be[\"resource\"] (url= STRING | nicename= VAR ) ) | ( 'module' modname= VAR ( 'alias' alias= VAR )? ) ) )* '}' ;
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
        Token string_literal174=null;
        Token char_literal175=null;
        Token string_literal176=null;
        Token char_literal177=null;
        Token char_literal179=null;
        Token char_literal181=null;
        Token string_literal182=null;
        Token string_literal183=null;
        Token string_literal184=null;
        Token string_literal185=null;
        Token string_literal186=null;
        Token string_literal188=null;
        Token string_literal189=null;
        Token char_literal190=null;
        RuleSet2Parser.must_be_one_return name = null;

        RuleSet2Parser.must_be_one_return what = null;

        RuleSet2Parser.name_value_pair_return name_value_pair178 = null;

        RuleSet2Parser.name_value_pair_return name_value_pair180 = null;

        RuleSet2Parser.must_be_return must_be187 = null;


        Object html_desc_tree=null;
        Object string_desc_tree=null;
        Object key_value_tree=null;
        Object onoff_tree=null;
        Object rtype_tree=null;
        Object url_tree=null;
        Object nicename_tree=null;
        Object modname_tree=null;
        Object alias_tree=null;
        Object string_literal174_tree=null;
        Object char_literal175_tree=null;
        Object string_literal176_tree=null;
        Object char_literal177_tree=null;
        Object char_literal179_tree=null;
        Object char_literal181_tree=null;
        Object string_literal182_tree=null;
        Object string_literal183_tree=null;
        Object string_literal184_tree=null;
        Object string_literal185_tree=null;
        Object string_literal186_tree=null;
        Object string_literal188_tree=null;
        Object string_literal189_tree=null;
        Object char_literal190_tree=null;


        	 HashMap meta_block_hash = (HashMap)rule_json.get("meta");
        	 ArrayList use_list = new ArrayList();
        	 HashMap keys_map = new HashMap();
        	 HashMap key_values = new HashMap();

        try { dbg.enterRule(getGrammarFileName(), "meta_block");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1689, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1706:2: ( 'meta' '{' (name= must_be_one[sar(\"description\",\"name\",\"author\")] (html_desc= HTML | string_desc= STRING ) | 'key' what= must_be_one[sar(\"errorstack\",\"googleanalytics\",\"twitter\",\"amazon\",\"kpds\",\"google\")] (key_value= STRING | '{' ( name_value_pair[key_values] ( ',' name_value_pair[key_values] )* ) '}' )+ | 'authz' 'require' 'user' | 'logging' onoff= ( 'on' | 'off' ) | 'use' ( (rtype= ( 'css' | 'javascript' ) must_be[\"resource\"] (url= STRING | nicename= VAR ) ) | ( 'module' modname= VAR ( 'alias' alias= VAR )? ) ) )* '}' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1706:4: 'meta' '{' (name= must_be_one[sar(\"description\",\"name\",\"author\")] (html_desc= HTML | string_desc= STRING ) | 'key' what= must_be_one[sar(\"errorstack\",\"googleanalytics\",\"twitter\",\"amazon\",\"kpds\",\"google\")] (key_value= STRING | '{' ( name_value_pair[key_values] ( ',' name_value_pair[key_values] )* ) '}' )+ | 'authz' 'require' 'user' | 'logging' onoff= ( 'on' | 'off' ) | 'use' ( (rtype= ( 'css' | 'javascript' ) must_be[\"resource\"] (url= STRING | nicename= VAR ) ) | ( 'module' modname= VAR ( 'alias' alias= VAR )? ) ) )* '}'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(1706,4);
            string_literal174=(Token)match(input,113,FOLLOW_113_in_meta_block4335); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal174_tree = (Object)adaptor.create(string_literal174);
            adaptor.addChild(root_0, string_literal174_tree);
            }
            dbg.location(1706,11);
            char_literal175=(Token)match(input,29,FOLLOW_29_in_meta_block4337); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal175_tree = (Object)adaptor.create(char_literal175);
            adaptor.addChild(root_0, char_literal175_tree);
            }
            dbg.location(1707,2);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1707:2: (name= must_be_one[sar(\"description\",\"name\",\"author\")] (html_desc= HTML | string_desc= STRING ) | 'key' what= must_be_one[sar(\"errorstack\",\"googleanalytics\",\"twitter\",\"amazon\",\"kpds\",\"google\")] (key_value= STRING | '{' ( name_value_pair[key_values] ( ',' name_value_pair[key_values] )* ) '}' )+ | 'authz' 'require' 'user' | 'logging' onoff= ( 'on' | 'off' ) | 'use' ( (rtype= ( 'css' | 'javascript' ) must_be[\"resource\"] (url= STRING | nicename= VAR ) ) | ( 'module' modname= VAR ( 'alias' alias= VAR )? ) ) )*
            try { dbg.enterSubRule(105);

            loop105:
            do {
                int alt105=6;
                try { dbg.enterDecision(105);

                switch ( input.LA(1) ) {
                case VAR:
                    {
                    alt105=1;
                    }
                    break;
                case 114:
                    {
                    alt105=2;
                    }
                    break;
                case 115:
                    {
                    alt105=3;
                    }
                    break;
                case 118:
                    {
                    alt105=4;
                    }
                    break;
                case 120:
                    {
                    alt105=5;
                    }
                    break;

                }

                } finally {dbg.exitDecision(105);}

                switch (alt105) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1707:5: name= must_be_one[sar(\"description\",\"name\",\"author\")] (html_desc= HTML | string_desc= STRING )
            	    {
            	    dbg.location(1707,9);
            	    pushFollow(FOLLOW_must_be_one_in_meta_block4346);
            	    name=must_be_one(sar("description","name","author"));

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, name.getTree());
            	    dbg.location(1707,58);
            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1707:58: (html_desc= HTML | string_desc= STRING )
            	    int alt99=2;
            	    try { dbg.enterSubRule(99);
            	    try { dbg.enterDecision(99);

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

            	        dbg.recognitionException(nvae);
            	        throw nvae;
            	    }
            	    } finally {dbg.exitDecision(99);}

            	    switch (alt99) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1707:59: html_desc= HTML
            	            {
            	            dbg.location(1707,68);
            	            html_desc=(Token)match(input,HTML,FOLLOW_HTML_in_meta_block4352); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            html_desc_tree = (Object)adaptor.create(html_desc);
            	            adaptor.addChild(root_0, html_desc_tree);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            dbg.enterAlt(2);

            	            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1707:74: string_desc= STRING
            	            {
            	            dbg.location(1707,85);
            	            string_desc=(Token)match(input,STRING,FOLLOW_STRING_in_meta_block4356); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_desc_tree = (Object)adaptor.create(string_desc);
            	            adaptor.addChild(root_0, string_desc_tree);
            	            }

            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(99);}

            	    dbg.location(1708,3);
            	    if ( state.backtracking==0 ) {
            	       
            	      			if((string_desc!=null?string_desc.getText():null) != null)
            	      				meta_block_hash.put((name!=null?input.toString(name.start,name.stop):null),strip_string((string_desc!=null?string_desc.getText():null))); 
            	      			else
            	      				meta_block_hash.put((name!=null?input.toString(name.start,name.stop):null),strip_wrappers("<<",">>",(html_desc!=null?html_desc.getText():null))); 
            	      	
            	      		
            	    }

            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1715:5: 'key' what= must_be_one[sar(\"errorstack\",\"googleanalytics\",\"twitter\",\"amazon\",\"kpds\",\"google\")] (key_value= STRING | '{' ( name_value_pair[key_values] ( ',' name_value_pair[key_values] )* ) '}' )+
            	    {
            	    dbg.location(1715,5);
            	    string_literal176=(Token)match(input,114,FOLLOW_114_in_meta_block4370); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal176_tree = (Object)adaptor.create(string_literal176);
            	    adaptor.addChild(root_0, string_literal176_tree);
            	    }
            	    dbg.location(1715,15);
            	    pushFollow(FOLLOW_must_be_one_in_meta_block4374);
            	    what=must_be_one(sar("errorstack","googleanalytics","twitter","amazon","kpds","google"));

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, what.getTree());
            	    dbg.location(1715,100);
            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1715:100: (key_value= STRING | '{' ( name_value_pair[key_values] ( ',' name_value_pair[key_values] )* ) '}' )+
            	    int cnt101=0;
            	    try { dbg.enterSubRule(101);

            	    loop101:
            	    do {
            	        int alt101=3;
            	        try { dbg.enterDecision(101);

            	        int LA101_0 = input.LA(1);

            	        if ( (LA101_0==STRING) ) {
            	            alt101=1;
            	        }
            	        else if ( (LA101_0==29) ) {
            	            alt101=2;
            	        }


            	        } finally {dbg.exitDecision(101);}

            	        switch (alt101) {
            	    	case 1 :
            	    	    dbg.enterAlt(1);

            	    	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1715:101: key_value= STRING
            	    	    {
            	    	    dbg.location(1715,110);
            	    	    key_value=(Token)match(input,STRING,FOLLOW_STRING_in_meta_block4380); if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) {
            	    	    key_value_tree = (Object)adaptor.create(key_value);
            	    	    adaptor.addChild(root_0, key_value_tree);
            	    	    }

            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    dbg.enterAlt(2);

            	    	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1715:120: '{' ( name_value_pair[key_values] ( ',' name_value_pair[key_values] )* ) '}'
            	    	    {
            	    	    dbg.location(1715,120);
            	    	    char_literal177=(Token)match(input,29,FOLLOW_29_in_meta_block4384); if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) {
            	    	    char_literal177_tree = (Object)adaptor.create(char_literal177);
            	    	    adaptor.addChild(root_0, char_literal177_tree);
            	    	    }
            	    	    dbg.location(1715,124);
            	    	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1715:124: ( name_value_pair[key_values] ( ',' name_value_pair[key_values] )* )
            	    	    dbg.enterAlt(1);

            	    	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1715:125: name_value_pair[key_values] ( ',' name_value_pair[key_values] )*
            	    	    {
            	    	    dbg.location(1715,125);
            	    	    pushFollow(FOLLOW_name_value_pair_in_meta_block4387);
            	    	    name_value_pair178=name_value_pair(key_values);

            	    	    state._fsp--;
            	    	    if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, name_value_pair178.getTree());
            	    	    dbg.location(1715,153);
            	    	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1715:153: ( ',' name_value_pair[key_values] )*
            	    	    try { dbg.enterSubRule(100);

            	    	    loop100:
            	    	    do {
            	    	        int alt100=2;
            	    	        try { dbg.enterDecision(100);

            	    	        int LA100_0 = input.LA(1);

            	    	        if ( (LA100_0==48) ) {
            	    	            alt100=1;
            	    	        }


            	    	        } finally {dbg.exitDecision(100);}

            	    	        switch (alt100) {
            	    	    	case 1 :
            	    	    	    dbg.enterAlt(1);

            	    	    	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1715:154: ',' name_value_pair[key_values]
            	    	    	    {
            	    	    	    dbg.location(1715,154);
            	    	    	    char_literal179=(Token)match(input,48,FOLLOW_48_in_meta_block4391); if (state.failed) return retval;
            	    	    	    if ( state.backtracking==0 ) {
            	    	    	    char_literal179_tree = (Object)adaptor.create(char_literal179);
            	    	    	    adaptor.addChild(root_0, char_literal179_tree);
            	    	    	    }
            	    	    	    dbg.location(1715,158);
            	    	    	    pushFollow(FOLLOW_name_value_pair_in_meta_block4393);
            	    	    	    name_value_pair180=name_value_pair(key_values);

            	    	    	    state._fsp--;
            	    	    	    if (state.failed) return retval;
            	    	    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, name_value_pair180.getTree());

            	    	    	    }
            	    	    	    break;

            	    	    	default :
            	    	    	    break loop100;
            	    	        }
            	    	    } while (true);
            	    	    } finally {dbg.exitSubRule(100);}


            	    	    }

            	    	    dbg.location(1715,189);
            	    	    char_literal181=(Token)match(input,30,FOLLOW_30_in_meta_block4399); if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) {
            	    	    char_literal181_tree = (Object)adaptor.create(char_literal181);
            	    	    adaptor.addChild(root_0, char_literal181_tree);
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt101 >= 1 ) break loop101;
            	    	    if (state.backtracking>0) {state.failed=true; return retval;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(101, input);
            	                dbg.recognitionException(eee);

            	                throw eee;
            	        }
            	        cnt101++;
            	    } while (true);
            	    } finally {dbg.exitSubRule(101);}

            	    dbg.location(1715,197);
            	    if ( state.backtracking==0 ) {
            	       
            	      		if(!key_values.isEmpty()) 
            	      			keys_map.put((what!=null?input.toString(what.start,what.stop):null),key_values); 
            	      		else 
            	      			keys_map.put((what!=null?input.toString(what.start,what.stop):null),strip_string((key_value!=null?key_value.getText():null))); 
            	      	
            	    }

            	    }
            	    break;
            	case 3 :
            	    dbg.enterAlt(3);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1721:4: 'authz' 'require' 'user'
            	    {
            	    dbg.location(1721,4);
            	    string_literal182=(Token)match(input,115,FOLLOW_115_in_meta_block4411); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal182_tree = (Object)adaptor.create(string_literal182);
            	    adaptor.addChild(root_0, string_literal182_tree);
            	    }
            	    dbg.location(1721,12);
            	    string_literal183=(Token)match(input,116,FOLLOW_116_in_meta_block4413); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal183_tree = (Object)adaptor.create(string_literal183);
            	    adaptor.addChild(root_0, string_literal183_tree);
            	    }
            	    dbg.location(1721,22);
            	    string_literal184=(Token)match(input,117,FOLLOW_117_in_meta_block4415); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal184_tree = (Object)adaptor.create(string_literal184);
            	    adaptor.addChild(root_0, string_literal184_tree);
            	    }
            	    dbg.location(1721,29);
            	    if ( state.backtracking==0 ) {
            	        
            	      		HashMap tmp = new HashMap(); 
            	      		tmp.put("level","user");
            	      		tmp.put("type","required");
            	      		meta_block_hash.put("authz",tmp);
            	      	   
            	    }

            	    }
            	    break;
            	case 4 :
            	    dbg.enterAlt(4);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1727:4: 'logging' onoff= ( 'on' | 'off' )
            	    {
            	    dbg.location(1727,4);
            	    string_literal185=(Token)match(input,118,FOLLOW_118_in_meta_block4423); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal185_tree = (Object)adaptor.create(string_literal185);
            	    adaptor.addChild(root_0, string_literal185_tree);
            	    }
            	    dbg.location(1727,19);
            	    onoff=(Token)input.LT(1);
            	    if ( input.LA(1)==64||input.LA(1)==119 ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(onoff));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(1727,33);
            	    if ( state.backtracking==0 ) {
            	        meta_block_hash.put("logging",(onoff!=null?onoff.getText():null)); 
            	    }

            	    }
            	    break;
            	case 5 :
            	    dbg.enterAlt(5);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1728:4: 'use' ( (rtype= ( 'css' | 'javascript' ) must_be[\"resource\"] (url= STRING | nicename= VAR ) ) | ( 'module' modname= VAR ( 'alias' alias= VAR )? ) )
            	    {
            	    dbg.location(1728,4);
            	    string_literal186=(Token)match(input,120,FOLLOW_120_in_meta_block4438); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal186_tree = (Object)adaptor.create(string_literal186);
            	    adaptor.addChild(root_0, string_literal186_tree);
            	    }
            	    dbg.location(1728,10);
            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1728:10: ( (rtype= ( 'css' | 'javascript' ) must_be[\"resource\"] (url= STRING | nicename= VAR ) ) | ( 'module' modname= VAR ( 'alias' alias= VAR )? ) )
            	    int alt104=2;
            	    try { dbg.enterSubRule(104);
            	    try { dbg.enterDecision(104);

            	    int LA104_0 = input.LA(1);

            	    if ( (LA104_0==110||LA104_0==121) ) {
            	        alt104=1;
            	    }
            	    else if ( (LA104_0==122) ) {
            	        alt104=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 104, 0, input);

            	        dbg.recognitionException(nvae);
            	        throw nvae;
            	    }
            	    } finally {dbg.exitDecision(104);}

            	    switch (alt104) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1728:12: (rtype= ( 'css' | 'javascript' ) must_be[\"resource\"] (url= STRING | nicename= VAR ) )
            	            {
            	            dbg.location(1728,12);
            	            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1728:12: (rtype= ( 'css' | 'javascript' ) must_be[\"resource\"] (url= STRING | nicename= VAR ) )
            	            dbg.enterAlt(1);

            	            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1728:13: rtype= ( 'css' | 'javascript' ) must_be[\"resource\"] (url= STRING | nicename= VAR )
            	            {
            	            dbg.location(1728,18);
            	            rtype=(Token)input.LT(1);
            	            if ( input.LA(1)==110||input.LA(1)==121 ) {
            	                input.consume();
            	                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(rtype));
            	                state.errorRecovery=false;state.failed=false;
            	            }
            	            else {
            	                if (state.backtracking>0) {state.failed=true; return retval;}
            	                MismatchedSetException mse = new MismatchedSetException(null,input);
            	                dbg.recognitionException(mse);
            	                throw mse;
            	            }

            	            dbg.location(1728,40);
            	            pushFollow(FOLLOW_must_be_in_meta_block4451);
            	            must_be187=must_be("resource");

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, must_be187.getTree());
            	            dbg.location(1728,60);
            	            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1728:60: (url= STRING | nicename= VAR )
            	            int alt102=2;
            	            try { dbg.enterSubRule(102);
            	            try { dbg.enterDecision(102);

            	            int LA102_0 = input.LA(1);

            	            if ( (LA102_0==STRING) ) {
            	                alt102=1;
            	            }
            	            else if ( (LA102_0==VAR) ) {
            	                alt102=2;
            	            }
            	            else {
            	                if (state.backtracking>0) {state.failed=true; return retval;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 102, 0, input);

            	                dbg.recognitionException(nvae);
            	                throw nvae;
            	            }
            	            } finally {dbg.exitDecision(102);}

            	            switch (alt102) {
            	                case 1 :
            	                    dbg.enterAlt(1);

            	                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1728:61: url= STRING
            	                    {
            	                    dbg.location(1728,64);
            	                    url=(Token)match(input,STRING,FOLLOW_STRING_in_meta_block4457); if (state.failed) return retval;
            	                    if ( state.backtracking==0 ) {
            	                    url_tree = (Object)adaptor.create(url);
            	                    adaptor.addChild(root_0, url_tree);
            	                    }

            	                    }
            	                    break;
            	                case 2 :
            	                    dbg.enterAlt(2);

            	                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1728:74: nicename= VAR
            	                    {
            	                    dbg.location(1728,82);
            	                    nicename=(Token)match(input,VAR,FOLLOW_VAR_in_meta_block4463); if (state.failed) return retval;
            	                    if ( state.backtracking==0 ) {
            	                    nicename_tree = (Object)adaptor.create(nicename);
            	                    adaptor.addChild(root_0, nicename_tree);
            	                    }

            	                    }
            	                    break;

            	            }
            	            } finally {dbg.exitSubRule(102);}

            	            dbg.location(1728,91);
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
            	            dbg.enterAlt(2);

            	            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1747:6: ( 'module' modname= VAR ( 'alias' alias= VAR )? )
            	            {
            	            dbg.location(1747,6);
            	            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1747:6: ( 'module' modname= VAR ( 'alias' alias= VAR )? )
            	            dbg.enterAlt(1);

            	            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1747:7: 'module' modname= VAR ( 'alias' alias= VAR )?
            	            {
            	            dbg.location(1747,7);
            	            string_literal188=(Token)match(input,122,FOLLOW_122_in_meta_block4478); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal188_tree = (Object)adaptor.create(string_literal188);
            	            adaptor.addChild(root_0, string_literal188_tree);
            	            }
            	            dbg.location(1747,24);
            	            modname=(Token)match(input,VAR,FOLLOW_VAR_in_meta_block4483); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            modname_tree = (Object)adaptor.create(modname);
            	            adaptor.addChild(root_0, modname_tree);
            	            }
            	            dbg.location(1747,29);
            	            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1747:29: ( 'alias' alias= VAR )?
            	            int alt103=2;
            	            try { dbg.enterSubRule(103);
            	            try { dbg.enterDecision(103);

            	            int LA103_0 = input.LA(1);

            	            if ( (LA103_0==123) ) {
            	                alt103=1;
            	            }
            	            } finally {dbg.exitDecision(103);}

            	            switch (alt103) {
            	                case 1 :
            	                    dbg.enterAlt(1);

            	                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1747:30: 'alias' alias= VAR
            	                    {
            	                    dbg.location(1747,30);
            	                    string_literal189=(Token)match(input,123,FOLLOW_123_in_meta_block4486); if (state.failed) return retval;
            	                    if ( state.backtracking==0 ) {
            	                    string_literal189_tree = (Object)adaptor.create(string_literal189);
            	                    adaptor.addChild(root_0, string_literal189_tree);
            	                    }
            	                    dbg.location(1747,43);
            	                    alias=(Token)match(input,VAR,FOLLOW_VAR_in_meta_block4490); if (state.failed) return retval;
            	                    if ( state.backtracking==0 ) {
            	                    alias_tree = (Object)adaptor.create(alias);
            	                    adaptor.addChild(root_0, alias_tree);
            	                    }

            	                    }
            	                    break;

            	            }
            	            } finally {dbg.exitSubRule(103);}


            	            }

            	            dbg.location(1747,51);
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
            	    } finally {dbg.exitSubRule(104);}


            	    }
            	    break;

            	default :
            	    break loop105;
                }
            } while (true);
            } finally {dbg.exitSubRule(105);}

            dbg.location(1757,3);
            char_literal190=(Token)match(input,30,FOLLOW_30_in_meta_block4505); if (state.failed) return retval;
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
        dbg.location(1759, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "meta_block");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "meta_block"

    public static class dispatch_block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dispatch_block"
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1762:1: dispatch_block : must_be[\"dispatch\"] '{' ( must_be[\"domain\"] domain= STRING ( '->' rsid= STRING )? )* '}' ;
    public final RuleSet2Parser.dispatch_block_return dispatch_block() throws RecognitionException {
        RuleSet2Parser.dispatch_block_return retval = new RuleSet2Parser.dispatch_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token domain=null;
        Token rsid=null;
        Token char_literal192=null;
        Token string_literal194=null;
        Token char_literal195=null;
        RuleSet2Parser.must_be_return must_be191 = null;

        RuleSet2Parser.must_be_return must_be193 = null;


        Object domain_tree=null;
        Object rsid_tree=null;
        Object char_literal192_tree=null;
        Object string_literal194_tree=null;
        Object char_literal195_tree=null;


        	 ArrayList dispatch_block_array = (ArrayList)rule_json.get("dispatch");

        try { dbg.enterRule(getGrammarFileName(), "dispatch_block");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1762, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1768:2: ( must_be[\"dispatch\"] '{' ( must_be[\"domain\"] domain= STRING ( '->' rsid= STRING )? )* '}' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1768:4: must_be[\"dispatch\"] '{' ( must_be[\"domain\"] domain= STRING ( '->' rsid= STRING )? )* '}'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(1768,4);
            pushFollow(FOLLOW_must_be_in_dispatch_block4536);
            must_be191=must_be("dispatch");

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, must_be191.getTree());
            dbg.location(1768,25);
            char_literal192=(Token)match(input,29,FOLLOW_29_in_dispatch_block4540); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal192_tree = (Object)adaptor.create(char_literal192);
            adaptor.addChild(root_0, char_literal192_tree);
            }
            dbg.location(1768,29);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1768:29: ( must_be[\"domain\"] domain= STRING ( '->' rsid= STRING )? )*
            try { dbg.enterSubRule(107);

            loop107:
            do {
                int alt107=2;
                try { dbg.enterDecision(107);

                int LA107_0 = input.LA(1);

                if ( (LA107_0==VAR) ) {
                    alt107=1;
                }


                } finally {dbg.exitDecision(107);}

                switch (alt107) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1768:30: must_be[\"domain\"] domain= STRING ( '->' rsid= STRING )?
            	    {
            	    dbg.location(1768,30);
            	    pushFollow(FOLLOW_must_be_in_dispatch_block4543);
            	    must_be193=must_be("domain");

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, must_be193.getTree());
            	    dbg.location(1768,54);
            	    domain=(Token)match(input,STRING,FOLLOW_STRING_in_dispatch_block4548); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    domain_tree = (Object)adaptor.create(domain);
            	    adaptor.addChild(root_0, domain_tree);
            	    }
            	    dbg.location(1768,62);
            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1768:62: ( '->' rsid= STRING )?
            	    int alt106=2;
            	    try { dbg.enterSubRule(106);
            	    try { dbg.enterDecision(106);

            	    int LA106_0 = input.LA(1);

            	    if ( (LA106_0==124) ) {
            	        alt106=1;
            	    }
            	    } finally {dbg.exitDecision(106);}

            	    switch (alt106) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1768:63: '->' rsid= STRING
            	            {
            	            dbg.location(1768,63);
            	            string_literal194=(Token)match(input,124,FOLLOW_124_in_dispatch_block4551); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal194_tree = (Object)adaptor.create(string_literal194);
            	            adaptor.addChild(root_0, string_literal194_tree);
            	            }
            	            dbg.location(1768,72);
            	            rsid=(Token)match(input,STRING,FOLLOW_STRING_in_dispatch_block4555); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            rsid_tree = (Object)adaptor.create(rsid);
            	            adaptor.addChild(root_0, rsid_tree);
            	            }

            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(106);}

            	    dbg.location(1768,82);
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
            	    break loop107;
                }
            } while (true);
            } finally {dbg.exitSubRule(107);}

            dbg.location(1777,2);
            char_literal195=(Token)match(input,30,FOLLOW_30_in_dispatch_block4565); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal195_tree = (Object)adaptor.create(char_literal195);
            adaptor.addChild(root_0, char_literal195_tree);
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
        dbg.location(1778, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "dispatch_block");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "dispatch_block"

    public static class name_value_pair_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "name_value_pair"
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1782:1: name_value_pair[HashMap key_values] : k= STRING ':' (v= INT | v= FLOAT | v= STRING ) ;
    public final RuleSet2Parser.name_value_pair_return name_value_pair(HashMap key_values) throws RecognitionException {
        RuleSet2Parser.name_value_pair_return retval = new RuleSet2Parser.name_value_pair_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token k=null;
        Token v=null;
        Token char_literal196=null;

        Object k_tree=null;
        Object v_tree=null;
        Object char_literal196_tree=null;


        	Object value = null;

        try { dbg.enterRule(getGrammarFileName(), "name_value_pair");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1782, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1786:2: (k= STRING ':' (v= INT | v= FLOAT | v= STRING ) )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1786:4: k= STRING ':' (v= INT | v= FLOAT | v= STRING )
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(1786,5);
            k=(Token)match(input,STRING,FOLLOW_STRING_in_name_value_pair4588); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            k_tree = (Object)adaptor.create(k);
            adaptor.addChild(root_0, k_tree);
            }
            dbg.location(1786,13);
            char_literal196=(Token)match(input,39,FOLLOW_39_in_name_value_pair4590); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal196_tree = (Object)adaptor.create(char_literal196);
            adaptor.addChild(root_0, char_literal196_tree);
            }
            dbg.location(1786,17);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1786:17: (v= INT | v= FLOAT | v= STRING )
            int alt108=3;
            try { dbg.enterSubRule(108);
            try { dbg.enterDecision(108);

            switch ( input.LA(1) ) {
            case INT:
                {
                alt108=1;
                }
                break;
            case FLOAT:
                {
                alt108=2;
                }
                break;
            case STRING:
                {
                alt108=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(108);}

            switch (alt108) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1787:3: v= INT
                    {
                    dbg.location(1787,4);
                    v=(Token)match(input,INT,FOLLOW_INT_in_name_value_pair4598); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    v_tree = (Object)adaptor.create(v);
                    adaptor.addChild(root_0, v_tree);
                    }
                    dbg.location(1787,9);
                    if ( state.backtracking==0 ) {
                      value =(v!=null?v.getText():null);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1788:5: v= FLOAT
                    {
                    dbg.location(1788,6);
                    v=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_name_value_pair4609); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    v_tree = (Object)adaptor.create(v);
                    adaptor.addChild(root_0, v_tree);
                    }
                    dbg.location(1788,13);
                    if ( state.backtracking==0 ) {
                      value = (v!=null?v.getText():null);
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1789:5: v= STRING
                    {
                    dbg.location(1789,6);
                    v=(Token)match(input,STRING,FOLLOW_STRING_in_name_value_pair4620); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    v_tree = (Object)adaptor.create(v);
                    adaptor.addChild(root_0, v_tree);
                    }
                    dbg.location(1789,14);
                    if ( state.backtracking==0 ) {
                      value = strip_string((v!=null?v.getText():null));
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(108);}

            dbg.location(1790,3);
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
        dbg.location(1791, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "name_value_pair");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "name_value_pair"

    // $ANTLR start synpred19_RuleSet2
    public final void synpred19_RuleSet2_fragment() throws RecognitionException {   
        // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:328:131: ( ';' )
        dbg.enterAlt(1);

        // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:328:131: ';'
        {
        dbg.location(328,131);
        match(input,31,FOLLOW_31_in_synpred19_RuleSet21034); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred19_RuleSet2

    // $ANTLR start synpred20_RuleSet2
    public final void synpred20_RuleSet2_fragment() throws RecognitionException {   
        RuleSet2Parser.emit_block_return eb = null;


        // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:328:138: (eb= emit_block )
        dbg.enterAlt(1);

        // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:328:138: eb= emit_block
        {
        dbg.location(328,138);
        pushFollow(FOLLOW_emit_block_in_synpred20_RuleSet21039);
        eb=emit_block();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred20_RuleSet2

    // $ANTLR start synpred23_RuleSet2
    public final void synpred23_RuleSet2_fragment() throws RecognitionException {   
        // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:328:195: ( ';' )
        dbg.enterAlt(1);

        // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:328:195: ';'
        {
        dbg.location(328,195);
        match(input,31,FOLLOW_31_in_synpred23_RuleSet21055); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred23_RuleSet2

    // $ANTLR start synpred31_RuleSet2
    public final void synpred31_RuleSet2_fragment() throws RecognitionException {   
        RuleSet2Parser.persistent_expr_return pe = null;


        // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:407:6: (pe= persistent_expr )
        dbg.enterAlt(1);

        // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:407:6: pe= persistent_expr
        {
        dbg.location(407,8);
        pushFollow(FOLLOW_persistent_expr_in_synpred31_RuleSet21207);
        pe=persistent_expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_RuleSet2

    // $ANTLR start synpred33_RuleSet2
    public final void synpred33_RuleSet2_fragment() throws RecognitionException {   
        RuleSet2Parser.log_statement_return l = null;


        // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:409:4: (l= log_statement )
        dbg.enterAlt(1);

        // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:409:4: l= log_statement
        {
        dbg.location(409,5);
        pushFollow(FOLLOW_log_statement_in_synpred33_RuleSet21224);
        l=log_statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred33_RuleSet2

    // $ANTLR start synpred51_RuleSet2
    public final void synpred51_RuleSet2_fragment() throws RecognitionException {   
        // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:640:62: ( ';' )
        dbg.enterAlt(1);

        // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:640:62: ';'
        {
        dbg.location(640,62);
        match(input,31,FOLLOW_31_in_synpred51_RuleSet21868); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred51_RuleSet2

    // $ANTLR start synpred52_RuleSet2
    public final void synpred52_RuleSet2_fragment() throws RecognitionException {   
        RuleSet2Parser.expr_return e = null;


        // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:645:10: (e= expr )
        dbg.enterAlt(1);

        // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:645:10: e= expr
        {
        dbg.location(645,10);
        pushFollow(FOLLOW_expr_in_synpred52_RuleSet21889);
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


        // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:816:17: (tb= must_be_one[sar(\"then\",\"before\")] eor2= event_or )
        dbg.enterAlt(1);

        // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:816:17: tb= must_be_one[sar(\"then\",\"before\")] eor2= event_or
        {
        dbg.location(816,19);
        pushFollow(FOLLOW_must_be_one_in_synpred73_RuleSet22408);
        tb=must_be_one(sar("then","before"));

        state._fsp--;
        if (state.failed) return ;
        dbg.location(816,58);
        pushFollow(FOLLOW_event_or_in_synpred73_RuleSet22413);
        eor2=event_or();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred73_RuleSet2

    // $ANTLR start synpred122_RuleSet2
    public final void synpred122_RuleSet2_fragment() throws RecognitionException {   
        RuleSet2Parser.timeframe_return t = null;


        // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1359:60: (t= timeframe )
        dbg.enterAlt(1);

        // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1359:60: t= timeframe
        {
        dbg.location(1359,60);
        pushFollow(FOLLOW_timeframe_in_synpred122_RuleSet23414);
        t=timeframe();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred122_RuleSet2

    // $ANTLR start synpred123_RuleSet2
    public final void synpred123_RuleSet2_fragment() throws RecognitionException {   
        Token rx=null;
        Token v=null;
        RuleSet2Parser.var_domain_return vd = null;

        RuleSet2Parser.timeframe_return t = null;


        // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1359:4: ( 'seen' rx= STRING must_be[\"in\"] vd= var_domain ':' v= VAR (t= timeframe )? )
        dbg.enterAlt(1);

        // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1359:4: 'seen' rx= STRING must_be[\"in\"] vd= var_domain ':' v= VAR (t= timeframe )?
        {
        dbg.location(1359,4);
        match(input,78,FOLLOW_78_in_synpred123_RuleSet23393); if (state.failed) return ;
        dbg.location(1359,13);
        rx=(Token)match(input,STRING,FOLLOW_STRING_in_synpred123_RuleSet23397); if (state.failed) return ;
        dbg.location(1359,21);
        pushFollow(FOLLOW_must_be_in_synpred123_RuleSet23399);
        must_be("in");

        state._fsp--;
        if (state.failed) return ;
        dbg.location(1359,37);
        pushFollow(FOLLOW_var_domain_in_synpred123_RuleSet23404);
        vd=var_domain();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(1359,49);
        match(input,39,FOLLOW_39_in_synpred123_RuleSet23406); if (state.failed) return ;
        dbg.location(1359,54);
        v=(Token)match(input,VAR,FOLLOW_VAR_in_synpred123_RuleSet23410); if (state.failed) return ;
        dbg.location(1359,60);
        // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1359:60: (t= timeframe )?
        int alt129=2;
        try { dbg.enterSubRule(129);
        try { dbg.enterDecision(129);

        int LA129_0 = input.LA(1);

        if ( (LA129_0==109) ) {
            alt129=1;
        }
        } finally {dbg.exitDecision(129);}

        switch (alt129) {
            case 1 :
                dbg.enterAlt(1);

                // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: t= timeframe
                {
                dbg.location(1359,60);
                pushFollow(FOLLOW_timeframe_in_synpred123_RuleSet23414);
                t=timeframe();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }
        } finally {dbg.exitSubRule(129);}


        }
    }
    // $ANTLR end synpred123_RuleSet2

    // $ANTLR start synpred124_RuleSet2
    public final void synpred124_RuleSet2_fragment() throws RecognitionException {   
        Token rx_1=null;
        Token rx_2=null;
        Token v=null;
        RuleSet2Parser.must_be_one_return op = null;

        RuleSet2Parser.var_domain_return vd = null;


        // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1370:4: ( 'seen' rx_1= STRING op= must_be_one[sar(\"before\",\"after\")] rx_2= STRING must_be[\"in\"] vd= var_domain ':' v= VAR )
        dbg.enterAlt(1);

        // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1370:4: 'seen' rx_1= STRING op= must_be_one[sar(\"before\",\"after\")] rx_2= STRING must_be[\"in\"] vd= var_domain ':' v= VAR
        {
        dbg.location(1370,4);
        match(input,78,FOLLOW_78_in_synpred124_RuleSet23422); if (state.failed) return ;
        dbg.location(1370,15);
        rx_1=(Token)match(input,STRING,FOLLOW_STRING_in_synpred124_RuleSet23426); if (state.failed) return ;
        dbg.location(1370,25);
        pushFollow(FOLLOW_must_be_one_in_synpred124_RuleSet23430);
        op=must_be_one(sar("before","after"));

        state._fsp--;
        if (state.failed) return ;
        dbg.location(1370,65);
        rx_2=(Token)match(input,STRING,FOLLOW_STRING_in_synpred124_RuleSet23435); if (state.failed) return ;
        dbg.location(1370,74);
        pushFollow(FOLLOW_must_be_in_synpred124_RuleSet23438);
        must_be("in");

        state._fsp--;
        if (state.failed) return ;
        dbg.location(1370,90);
        pushFollow(FOLLOW_var_domain_in_synpred124_RuleSet23443);
        vd=var_domain();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(1370,102);
        match(input,39,FOLLOW_39_in_synpred124_RuleSet23445); if (state.failed) return ;
        dbg.location(1370,107);
        v=(Token)match(input,VAR,FOLLOW_VAR_in_synpred124_RuleSet23449); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred124_RuleSet2

    // $ANTLR start synpred125_RuleSet2
    public final void synpred125_RuleSet2_fragment() throws RecognitionException {   
        Token v=null;
        RuleSet2Parser.var_domain_return vd = null;

        RuleSet2Parser.predop_return pop = null;

        RuleSet2Parser.expr_return e = null;

        RuleSet2Parser.timeframe_return t = null;


        // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1380:4: (vd= var_domain ':' v= VAR pop= predop e= expr t= timeframe )
        dbg.enterAlt(1);

        // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1380:4: vd= var_domain ':' v= VAR pop= predop e= expr t= timeframe
        {
        dbg.location(1380,6);
        pushFollow(FOLLOW_var_domain_in_synpred125_RuleSet23458);
        vd=var_domain();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(1380,18);
        match(input,39,FOLLOW_39_in_synpred125_RuleSet23460); if (state.failed) return ;
        dbg.location(1380,23);
        v=(Token)match(input,VAR,FOLLOW_VAR_in_synpred125_RuleSet23464); if (state.failed) return ;
        dbg.location(1380,31);
        pushFollow(FOLLOW_predop_in_synpred125_RuleSet23468);
        pop=predop();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(1380,40);
        pushFollow(FOLLOW_expr_in_synpred125_RuleSet23472);
        e=expr();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(1380,47);
        pushFollow(FOLLOW_timeframe_in_synpred125_RuleSet23476);
        t=timeframe();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred125_RuleSet2

    // $ANTLR start synpred126_RuleSet2
    public final void synpred126_RuleSet2_fragment() throws RecognitionException {   
        Token v=null;
        RuleSet2Parser.var_domain_return vd = null;

        RuleSet2Parser.timeframe_return t = null;


        // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1392:4: (vd= var_domain ':' v= VAR t= timeframe )
        dbg.enterAlt(1);

        // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1392:4: vd= var_domain ':' v= VAR t= timeframe
        {
        dbg.location(1392,6);
        pushFollow(FOLLOW_var_domain_in_synpred126_RuleSet23486);
        vd=var_domain();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(1392,18);
        match(input,39,FOLLOW_39_in_synpred126_RuleSet23488); if (state.failed) return ;
        dbg.location(1392,23);
        v=(Token)match(input,VAR,FOLLOW_VAR_in_synpred126_RuleSet23492); if (state.failed) return ;
        dbg.location(1392,29);
        pushFollow(FOLLOW_timeframe_in_synpred126_RuleSet23496);
        t=timeframe();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred126_RuleSet2

    // $ANTLR start synpred157_RuleSet2
    public final void synpred157_RuleSet2_fragment() throws RecognitionException {   
        Token v=null;
        RuleSet2Parser.expr_return e = null;


        // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1504:9: (v= VAR '[' e= expr ']' )
        dbg.enterAlt(1);

        // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1504:9: v= VAR '[' e= expr ']'
        {
        dbg.location(1504,10);
        v=(Token)match(input,VAR,FOLLOW_VAR_in_synpred157_RuleSet23808); if (state.failed) return ;
        dbg.location(1504,15);
        match(input,103,FOLLOW_103_in_synpred157_RuleSet23810); if (state.failed) return ;
        dbg.location(1504,20);
        pushFollow(FOLLOW_expr_in_synpred157_RuleSet23814);
        e=expr();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(1504,26);
        match(input,104,FOLLOW_104_in_synpred157_RuleSet23816); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred157_RuleSet2

    // $ANTLR start synpred163_RuleSet2
    public final void synpred163_RuleSet2_fragment() throws RecognitionException {   
        Token p=null;
        RuleSet2Parser.namespace_return n = null;

        RuleSet2Parser.expr_return e = null;


        // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1542:9: (n= namespace p= VAR '(' (e= expr ( ',' )? )* ')' )
        dbg.enterAlt(1);

        // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1542:9: n= namespace p= VAR '(' (e= expr ( ',' )? )* ')'
        {
        dbg.location(1542,10);
        pushFollow(FOLLOW_namespace_in_synpred163_RuleSet23900);
        n=namespace();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(1542,22);
        p=(Token)match(input,VAR,FOLLOW_VAR_in_synpred163_RuleSet23904); if (state.failed) return ;
        dbg.location(1542,27);
        match(input,47,FOLLOW_47_in_synpred163_RuleSet23906); if (state.failed) return ;
        dbg.location(1542,31);
        // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1542:31: (e= expr ( ',' )? )*
        try { dbg.enterSubRule(133);

        loop133:
        do {
            int alt133=2;
            try { dbg.enterDecision(133);

            int LA133_0 = input.LA(1);

            if ( ((LA133_0>=VAR && LA133_0<=INT)||LA133_0==FLOAT||(LA133_0>=STRING && LA133_0<=REGEXP)||LA133_0==29||LA133_0==47||LA133_0==57||LA133_0==71||LA133_0==78||(LA133_0>=101 && LA133_0<=103)||(LA133_0>=105 && LA133_0<=108)) ) {
                alt133=1;
            }


            } finally {dbg.exitDecision(133);}

            switch (alt133) {
        	case 1 :
        	    dbg.enterAlt(1);

        	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1542:32: e= expr ( ',' )?
        	    {
        	    dbg.location(1542,33);
        	    pushFollow(FOLLOW_expr_in_synpred163_RuleSet23911);
        	    e=expr();

        	    state._fsp--;
        	    if (state.failed) return ;
        	    dbg.location(1545,8);
        	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1545:8: ( ',' )?
        	    int alt132=2;
        	    try { dbg.enterSubRule(132);
        	    try { dbg.enterDecision(132);

        	    int LA132_0 = input.LA(1);

        	    if ( (LA132_0==48) ) {
        	        alt132=1;
        	    }
        	    } finally {dbg.exitDecision(132);}

        	    switch (alt132) {
        	        case 1 :
        	            dbg.enterAlt(1);

        	            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: ','
        	            {
        	            dbg.location(1545,8);
        	            match(input,48,FOLLOW_48_in_synpred163_RuleSet23922); if (state.failed) return ;

        	            }
        	            break;

        	    }
        	    } finally {dbg.exitSubRule(132);}


        	    }
        	    break;

        	default :
        	    break loop133;
            }
        } while (true);
        } finally {dbg.exitSubRule(133);}

        dbg.location(1545,15);
        match(input,49,FOLLOW_49_in_synpred163_RuleSet23927); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred163_RuleSet2

    // $ANTLR start synpred166_RuleSet2
    public final void synpred166_RuleSet2_fragment() throws RecognitionException {   
        Token v=null;
        RuleSet2Parser.expr_return e = null;


        // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1552:9: (v= VAR '(' (e= expr ( ',' )? )* ')' )
        dbg.enterAlt(1);

        // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1552:9: v= VAR '(' (e= expr ( ',' )? )* ')'
        {
        dbg.location(1552,10);
        v=(Token)match(input,VAR,FOLLOW_VAR_in_synpred166_RuleSet23942); if (state.failed) return ;
        dbg.location(1552,15);
        match(input,47,FOLLOW_47_in_synpred166_RuleSet23944); if (state.failed) return ;
        dbg.location(1552,19);
        // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1552:19: (e= expr ( ',' )? )*
        try { dbg.enterSubRule(136);

        loop136:
        do {
            int alt136=2;
            try { dbg.enterDecision(136);

            int LA136_0 = input.LA(1);

            if ( ((LA136_0>=VAR && LA136_0<=INT)||LA136_0==FLOAT||(LA136_0>=STRING && LA136_0<=REGEXP)||LA136_0==29||LA136_0==47||LA136_0==57||LA136_0==71||LA136_0==78||(LA136_0>=101 && LA136_0<=103)||(LA136_0>=105 && LA136_0<=108)) ) {
                alt136=1;
            }


            } finally {dbg.exitDecision(136);}

            switch (alt136) {
        	case 1 :
        	    dbg.enterAlt(1);

        	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1552:20: e= expr ( ',' )?
        	    {
        	    dbg.location(1552,21);
        	    pushFollow(FOLLOW_expr_in_synpred166_RuleSet23949);
        	    e=expr();

        	    state._fsp--;
        	    if (state.failed) return ;
        	    dbg.location(1555,2);
        	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1555:2: ( ',' )?
        	    int alt135=2;
        	    try { dbg.enterSubRule(135);
        	    try { dbg.enterDecision(135);

        	    int LA135_0 = input.LA(1);

        	    if ( (LA135_0==48) ) {
        	        alt135=1;
        	    }
        	    } finally {dbg.exitDecision(135);}

        	    switch (alt135) {
        	        case 1 :
        	            dbg.enterAlt(1);

        	            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: ','
        	            {
        	            dbg.location(1555,2);
        	            match(input,48,FOLLOW_48_in_synpred166_RuleSet23953); if (state.failed) return ;

        	            }
        	            break;

        	    }
        	    } finally {dbg.exitSubRule(135);}


        	    }
        	    break;

        	default :
        	    break loop136;
            }
        } while (true);
        } finally {dbg.exitSubRule(136);}

        dbg.location(1555,9);
        match(input,49,FOLLOW_49_in_synpred166_RuleSet23958); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred166_RuleSet2

    // $ANTLR start synpred171_RuleSet2
    public final void synpred171_RuleSet2_fragment() throws RecognitionException {   
        Token v=null;

        // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1588:9: (v= VAR )
        dbg.enterAlt(1);

        // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1588:9: v= VAR
        {
        dbg.location(1588,10);
        v=(Token)match(input,VAR,FOLLOW_VAR_in_synpred171_RuleSet24033); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred171_RuleSet2

    // Delegated rules

    public final boolean synpred51_RuleSet2() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred51_RuleSet2_fragment(); // can never throw exception
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
    public final boolean synpred157_RuleSet2() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred157_RuleSet2_fragment(); // can never throw exception
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
    public final boolean synpred73_RuleSet2() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred73_RuleSet2_fragment(); // can never throw exception
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
    public final boolean synpred125_RuleSet2() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred125_RuleSet2_fragment(); // can never throw exception
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
    public final boolean synpred23_RuleSet2() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred23_RuleSet2_fragment(); // can never throw exception
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
    public final boolean synpred123_RuleSet2() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred123_RuleSet2_fragment(); // can never throw exception
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
    public final boolean synpred163_RuleSet2() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred163_RuleSet2_fragment(); // can never throw exception
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
    public final boolean synpred122_RuleSet2() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred122_RuleSet2_fragment(); // can never throw exception
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
    public final boolean synpred166_RuleSet2() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred166_RuleSet2_fragment(); // can never throw exception
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
    public final boolean synpred33_RuleSet2() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred33_RuleSet2_fragment(); // can never throw exception
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
    public final boolean synpred52_RuleSet2() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred52_RuleSet2_fragment(); // can never throw exception
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
    public final boolean synpred19_RuleSet2() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred19_RuleSet2_fragment(); // can never throw exception
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
    public final boolean synpred126_RuleSet2() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred126_RuleSet2_fragment(); // can never throw exception
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
    public final boolean synpred171_RuleSet2() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred171_RuleSet2_fragment(); // can never throw exception
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
    public final boolean synpred124_RuleSet2() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred124_RuleSet2_fragment(); // can never throw exception
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
    public final boolean synpred20_RuleSet2() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred20_RuleSet2_fragment(); // can never throw exception
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
    public final boolean synpred31_RuleSet2() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred31_RuleSet2_fragment(); // can never throw exception
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


    protected DFA17 dfa17 = new DFA17(this);
    protected DFA52 dfa52 = new DFA52(this);
    protected DFA85 dfa85 = new DFA85(this);
    protected DFA84 dfa84 = new DFA84(this);
    protected DFA95 dfa95 = new DFA95(this);
    static final String DFA17_eotS =
        "\12\uffff";
    static final String DFA17_eofS =
        "\1\uffff\1\3\2\uffff\1\6\5\uffff";
    static final String DFA17_minS =
        "\2\4\2\uffff\1\4\1\47\2\uffff\1\4\1\0";
    static final String DFA17_maxS =
        "\2\154\2\uffff\1\147\1\47\2\uffff\1\4\1\0";
    static final String DFA17_acceptS =
        "\2\uffff\1\1\1\4\2\uffff\1\3\1\2\2\uffff";
    static final String DFA17_specialS =
        "\11\uffff\1\0}>";
    static final String[] DFA17_transitionS = {
            "\1\1\43\uffff\2\2\101\uffff\2\2",
            "\1\4\1\6\1\uffff\1\6\3\uffff\2\6\20\uffff\1\6\3\3\16\uffff"+
            "\1\6\11\uffff\1\6\15\uffff\1\6\6\uffff\1\6\26\uffff\3\6\1\uffff"+
            "\2\6\2\5",
            "",
            "",
            "\1\7\15\uffff\13\6\1\uffff\3\6\6\uffff\1\6\6\uffff\2\6\31\uffff"+
            "\5\6\1\uffff\26\6\2\uffff\1\6",
            "\1\10",
            "",
            "",
            "\1\11",
            "\1\uffff"
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "407:5: (pe= persistent_expr | rs= raise_statement | l= log_statement | las= must_be[\"last\"] )";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_9 = input.LA(1);

                         
                        int index17_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_RuleSet2()) ) {s = 2;}

                        else if ( (synpred33_RuleSet2()) ) {s = 6;}

                         
                        input.seek(index17_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA52_eotS =
        "\13\uffff";
    static final String DFA52_eofS =
        "\13\uffff";
    static final String DFA52_minS =
        "\1\4\5\uffff\1\0\4\uffff";
    static final String DFA52_maxS =
        "\1\160\5\uffff\1\0\4\uffff";
    static final String DFA52_acceptS =
        "\1\uffff\1\2\10\uffff\1\1";
    static final String DFA52_specialS =
        "\6\uffff\1\0\4\uffff}>";
    static final String[] DFA52_transitionS = {
            "\1\6\30\uffff\1\1\1\uffff\2\1\17\uffff\2\1\3\uffff\2\1\71\uffff"+
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

    static final short[] DFA52_eot = DFA.unpackEncodedString(DFA52_eotS);
    static final short[] DFA52_eof = DFA.unpackEncodedString(DFA52_eofS);
    static final char[] DFA52_min = DFA.unpackEncodedStringToUnsignedChars(DFA52_minS);
    static final char[] DFA52_max = DFA.unpackEncodedStringToUnsignedChars(DFA52_maxS);
    static final short[] DFA52_accept = DFA.unpackEncodedString(DFA52_acceptS);
    static final short[] DFA52_special = DFA.unpackEncodedString(DFA52_specialS);
    static final short[][] DFA52_transition;

    static {
        int numStates = DFA52_transitionS.length;
        DFA52_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA52_transition[i] = DFA.unpackEncodedString(DFA52_transitionS[i]);
        }
    }

    class DFA52 extends DFA {

        public DFA52(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 52;
            this.eot = DFA52_eot;
            this.eof = DFA52_eof;
            this.min = DFA52_min;
            this.max = DFA52_max;
            this.accept = DFA52_accept;
            this.special = DFA52_special;
            this.transition = DFA52_transition;
        }
        public String getDescription() {
            return "()* loopback of 816:16: (tb= must_be_one[sar(\"then\",\"before\")] eor2= event_or )*";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA52_6 = input.LA(1);

                         
                        int index52_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred73_RuleSet2()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index52_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 52, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA85_eotS =
        "\23\uffff";
    static final String DFA85_eofS =
        "\23\uffff";
    static final String DFA85_minS =
        "\1\4\1\uffff\2\0\17\uffff";
    static final String DFA85_maxS =
        "\1\154\1\uffff\2\0\17\uffff";
    static final String DFA85_acceptS =
        "\1\uffff\1\1\2\uffff\1\6\12\uffff\1\2\1\3\1\4\1\5";
    static final String DFA85_specialS =
        "\2\uffff\1\0\1\1\17\uffff}>";
    static final String[] DFA85_transitionS = {
            "\2\4\1\uffff\1\4\3\uffff\2\4\20\uffff\1\4\21\uffff\1\4\11\uffff"+
            "\1\1\24\uffff\1\2\26\uffff\3\4\1\uffff\2\4\2\3",
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
            return "1354:1: unary_expr returns [Object result] options {backtrack=true; } : ( 'not' unary_expr | 'seen' rx= STRING must_be[\"in\"] vd= var_domain ':' v= VAR (t= timeframe )? | 'seen' rx_1= STRING op= must_be_one[sar(\"before\",\"after\")] rx_2= STRING must_be[\"in\"] vd= var_domain ':' v= VAR | vd= var_domain ':' v= VAR pop= predop e= expr t= timeframe | vd= var_domain ':' v= VAR t= timeframe | oe= operator_expr );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA85_2 = input.LA(1);

                         
                        int index85_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred123_RuleSet2()) ) {s = 15;}

                        else if ( (synpred124_RuleSet2()) ) {s = 16;}

                         
                        input.seek(index85_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA85_3 = input.LA(1);

                         
                        int index85_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_RuleSet2()) ) {s = 17;}

                        else if ( (synpred126_RuleSet2()) ) {s = 18;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index85_3);
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
    static final String DFA84_eotS =
        "\45\uffff";
    static final String DFA84_eofS =
        "\1\2\44\uffff";
    static final String DFA84_minS =
        "\1\4\1\0\43\uffff";
    static final String DFA84_maxS =
        "\1\160\1\0\43\uffff";
    static final String DFA84_acceptS =
        "\2\uffff\1\2\41\uffff\1\1";
    static final String DFA84_specialS =
        "\1\uffff\1\0\43\uffff}>";
    static final String[] DFA84_transitionS = {
            "\2\2\1\uffff\1\2\3\uffff\2\2\5\uffff\20\2\14\uffff\5\2\1\uffff"+
            "\1\2\4\uffff\1\2\15\uffff\10\2\26\uffff\10\2\1\1\1\2\1\uffff"+
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

    static final short[] DFA84_eot = DFA.unpackEncodedString(DFA84_eotS);
    static final short[] DFA84_eof = DFA.unpackEncodedString(DFA84_eofS);
    static final char[] DFA84_min = DFA.unpackEncodedStringToUnsignedChars(DFA84_minS);
    static final char[] DFA84_max = DFA.unpackEncodedStringToUnsignedChars(DFA84_maxS);
    static final short[] DFA84_accept = DFA.unpackEncodedString(DFA84_acceptS);
    static final short[] DFA84_special = DFA.unpackEncodedString(DFA84_specialS);
    static final short[][] DFA84_transition;

    static {
        int numStates = DFA84_transitionS.length;
        DFA84_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA84_transition[i] = DFA.unpackEncodedString(DFA84_transitionS[i]);
        }
    }

    class DFA84 extends DFA {

        public DFA84(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 84;
            this.eot = DFA84_eot;
            this.eof = DFA84_eof;
            this.min = DFA84_min;
            this.max = DFA84_max;
            this.accept = DFA84_accept;
            this.special = DFA84_special;
            this.transition = DFA84_transition;
        }
        public String getDescription() {
            return "1359:60: (t= timeframe )?";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA84_1 = input.LA(1);

                         
                        int index84_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred122_RuleSet2()) ) {s = 36;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index84_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 84, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA95_eotS =
        "\21\uffff";
    static final String DFA95_eofS =
        "\21\uffff";
    static final String DFA95_minS =
        "\1\4\5\uffff\1\0\12\uffff";
    static final String DFA95_maxS =
        "\1\154\5\uffff\1\0\12\uffff";
    static final String DFA95_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\7\1\10\1\11\1\14\1\15\1\17"+
        "\1\6\1\12\1\13\1\16";
    static final String DFA95_specialS =
        "\6\uffff\1\0\12\uffff}>";
    static final String[] DFA95_transitionS = {
            "\1\6\1\1\1\uffff\1\3\3\uffff\1\2\1\5\20\uffff\1\13\21\uffff"+
            "\1\14\65\uffff\2\4\1\12\1\uffff\1\10\1\11\2\7",
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
            "",
            ""
    };

    static final short[] DFA95_eot = DFA.unpackEncodedString(DFA95_eotS);
    static final short[] DFA95_eof = DFA.unpackEncodedString(DFA95_eofS);
    static final char[] DFA95_min = DFA.unpackEncodedStringToUnsignedChars(DFA95_minS);
    static final char[] DFA95_max = DFA.unpackEncodedStringToUnsignedChars(DFA95_maxS);
    static final short[] DFA95_accept = DFA.unpackEncodedString(DFA95_acceptS);
    static final short[] DFA95_special = DFA.unpackEncodedString(DFA95_specialS);
    static final short[][] DFA95_transition;

    static {
        int numStates = DFA95_transitionS.length;
        DFA95_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA95_transition[i] = DFA.unpackEncodedString(DFA95_transitionS[i]);
        }
    }

    class DFA95 extends DFA {

        public DFA95(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 95;
            this.eot = DFA95_eot;
            this.eof = DFA95_eof;
            this.min = DFA95_min;
            this.max = DFA95_max;
            this.accept = DFA95_accept;
            this.special = DFA95_special;
            this.transition = DFA95_transition;
        }
        public String getDescription() {
            return "1469:1: factor returns [Object result] options {backtrack=true; } : (v= INT | v= STRING | v= FLOAT | v= ( 'true' | 'false' ) | vr= REGEXP | v= VAR '[' e= expr ']' | d= var_domain ':' v= VAR | 'current' d= var_domain ':' v= VAR | 'history' e= expr d= var_domain ':' v= VAR | n= namespace p= VAR '(' (e= expr ( ',' )? )* ')' | v= VAR '(' (e= expr ( ',' )? )* ')' | '[' e= expr ( ',' e2= expr )* ']' | '{' h1= hash_line ( ',' h2= hash_line )* '}' | v= VAR | '(' e= expr ')' );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA95_6 = input.LA(1);

                         
                        int index95_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred157_RuleSet2()) ) {s = 13;}

                        else if ( (synpred163_RuleSet2()) ) {s = 14;}

                        else if ( (synpred166_RuleSet2()) ) {s = 15;}

                        else if ( (synpred171_RuleSet2()) ) {s = 16;}

                         
                        input.seek(index95_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 95, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_set_in_predop0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_add_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_must_be_in_ruleset818 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rulesetname_in_ruleset824 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleset831 = new BitSet(new long[]{0x0000000040000010L,0x0002000000000002L});
    public static final BitSet FOLLOW_meta_block_in_ruleset838 = new BitSet(new long[]{0x0000000040000010L,0x0002000000000002L});
    public static final BitSet FOLLOW_dispatch_block_in_ruleset842 = new BitSet(new long[]{0x0000000040000010L,0x0002000000000002L});
    public static final BitSet FOLLOW_global_block_in_ruleset846 = new BitSet(new long[]{0x0000000040000010L,0x0002000000000002L});
    public static final BitSet FOLLOW_rule_in_ruleset850 = new BitSet(new long[]{0x0000000040000010L,0x0002000000000002L});
    public static final BitSet FOLLOW_30_in_ruleset856 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_ruleset860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_must_be883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_must_be_one908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_rulesetname0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_rule_name0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_must_be_in_rule967 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule_name_in_rule975 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_must_be_in_rule982 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_must_be_one_in_rule992 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_rule997 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_rule1007 = new BitSet(new long[]{0x0088000000000000L});
    public static final BitSet FOLLOW_using_in_rule1014 = new BitSet(new long[]{0x00600001A0000010L,0x0001000000000000L});
    public static final BitSet FOLLOW_when_in_rule1018 = new BitSet(new long[]{0x00600001A0000010L,0x0001000000000000L});
    public static final BitSet FOLLOW_foreach_in_rule1024 = new BitSet(new long[]{0x00600001A0000010L,0x0001000000000000L});
    public static final BitSet FOLLOW_pre_block_in_rule1031 = new BitSet(new long[]{0x00600001A0000010L,0x0001000000000000L});
    public static final BitSet FOLLOW_31_in_rule1034 = new BitSet(new long[]{0x00600001A0000010L,0x0001000000000000L});
    public static final BitSet FOLLOW_emit_block_in_rule1039 = new BitSet(new long[]{0x00600001A0000010L,0x0001000000000000L});
    public static final BitSet FOLLOW_31_in_rule1042 = new BitSet(new long[]{0x00600001A0000010L,0x0001000000000000L});
    public static final BitSet FOLLOW_action_in_rule1046 = new BitSet(new long[]{0x00000002C0000010L});
    public static final BitSet FOLLOW_callbacks_in_rule1052 = new BitSet(new long[]{0x00000000C0000010L});
    public static final BitSet FOLLOW_31_in_rule1055 = new BitSet(new long[]{0x00000000C0000010L});
    public static final BitSet FOLLOW_post_block_in_rule1060 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_31_in_rule1063 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_rule1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_must_be_one_in_post_block1099 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_post_block1102 = new BitSet(new long[]{0x0000030000000010L,0x0000180000000000L});
    public static final BitSet FOLLOW_post_statement_in_post_block1109 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_post_block1114 = new BitSet(new long[]{0x0000030000000010L,0x0000180000000000L});
    public static final BitSet FOLLOW_post_statement_in_post_block1118 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_post_block1126 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_post_block1128 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_post_alternate_in_post_block1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_must_be_in_post_alternate1161 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_post_alternate1164 = new BitSet(new long[]{0x00000300C0000010L,0x0000180000000000L});
    public static final BitSet FOLLOW_post_statement_in_post_alternate1169 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_31_in_post_alternate1174 = new BitSet(new long[]{0x0000030000000010L,0x0000180000000000L});
    public static final BitSet FOLLOW_post_statement_in_post_alternate1178 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_31_in_post_alternate1186 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_post_alternate1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_persistent_expr_in_post_statement1207 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_raise_statement_in_post_statement1217 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_log_statement_in_post_statement1224 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_must_be_in_post_statement1234 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_post_statement1240 = new BitSet(new long[]{0x02008000200018B0L,0x00001EE000004080L});
    public static final BitSet FOLLOW_expr_in_post_statement1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_must_be_in_raise_statement1269 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_must_be_in_raise_statement1272 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_must_be_in_raise_statement1275 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_raise_statement1281 = new BitSet(new long[]{0x0000240000000002L});
    public static final BitSet FOLLOW_for_clause_in_raise_statement1285 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_modifier_clause_in_raise_statement1290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_must_be_in_log_statement1310 = new BitSet(new long[]{0x02008000200018B0L,0x00001EE000004080L});
    public static final BitSet FOLLOW_expr_in_log_statement1316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_callbacks1336 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_callbacks1338 = new BitSet(new long[]{0x0000000C40000000L});
    public static final BitSet FOLLOW_success_in_callbacks1342 = new BitSet(new long[]{0x0000000840000000L});
    public static final BitSet FOLLOW_failure_in_callbacks1347 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_callbacks1350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_success1373 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_success1375 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_click_in_success1379 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_31_in_success1385 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_click_in_success1389 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_31_in_success1396 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_success1400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_failure1426 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_failure1428 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_click_in_failure1432 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_31_in_failure1438 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_click_in_failure1442 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_31_in_failure1450 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_failure1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_click1472 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_click1482 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_click1484 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_click1488 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_click_link_in_click1492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_must_be_in_click_link1512 = new BitSet(new long[]{0x0000030000000010L,0x0000180000000000L});
    public static final BitSet FOLLOW_persistent_expr_in_click_link1517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_persistent_clear_set_in_persistent_expr1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_persistent_iterate_in_persistent_expr1549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_trail_forget_in_persistent_expr1562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_trail_mark_in_persistent_expr1575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_must_be_one_in_persistent_clear_set1600 = new BitSet(new long[]{0x0000000000000000L,0x0000180000000000L});
    public static final BitSet FOLLOW_var_domain_in_persistent_clear_set1606 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_persistent_clear_set1608 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_persistent_clear_set1612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_domain_in_persistent_iterate1633 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_persistent_iterate1635 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_persistent_iterate1639 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_counter_op_in_persistent_iterate1643 = new BitSet(new long[]{0x02008000200018B0L,0x00001EE000004080L});
    public static final BitSet FOLLOW_expr_in_persistent_iterate1647 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_counter_start_in_persistent_iterate1651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_trail_forget1669 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_trail_forget1674 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_must_be_in_trail_forget1676 = new BitSet(new long[]{0x0000000000000000L,0x0000180000000000L});
    public static final BitSet FOLLOW_var_domain_in_trail_forget1682 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_trail_forget1684 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_trail_forget1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_trail_mark1707 = new BitSet(new long[]{0x0000000000000000L,0x0000180000000000L});
    public static final BitSet FOLLOW_var_domain_in_trail_mark1711 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_trail_mark1713 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_trail_mark1717 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_trail_with_in_trail_mark1721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_trail_with1740 = new BitSet(new long[]{0x02008000200018B0L,0x00001EE000004080L});
    public static final BitSet FOLLOW_expr_in_trail_with1744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_counter_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_must_be_in_counter_start1794 = new BitSet(new long[]{0x02008000200018B0L,0x00001EE000004080L});
    public static final BitSet FOLLOW_expr_in_counter_start1799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_for_clause1820 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_for_clause1825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_action_in_action1859 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_unconditional_action_in_action1864 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_action1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_conditional_action1885 = new BitSet(new long[]{0x02008000200018B0L,0x00001EE000004080L});
    public static final BitSet FOLLOW_expr_in_conditional_action1889 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_must_be_in_conditional_action1892 = new BitSet(new long[]{0x00600001A0000010L,0x0001000000000000L});
    public static final BitSet FOLLOW_unconditional_action_in_conditional_action1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primrule_in_unconditional_action1920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_action_block_in_unconditional_action1930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_must_be_one_in_action_block1956 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_action_block1966 = new BitSet(new long[]{0x0000000000000010L,0x0001000000000000L});
    public static final BitSet FOLLOW_primrule_in_action_block1971 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_31_in_action_block1981 = new BitSet(new long[]{0x0000000000000010L,0x0001000000000000L});
    public static final BitSet FOLLOW_primrule_in_action_block1985 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_31_in_action_block1992 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_action_block1995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_primrule2022 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_primrule2024 = new BitSet(new long[]{0x0000000000000010L,0x0001000000000000L});
    public static final BitSet FOLLOW_namespace_in_primrule2035 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_primrule2040 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_primrule2042 = new BitSet(new long[]{0x02038000200018B0L,0x00001EE000004080L});
    public static final BitSet FOLLOW_expr_in_primrule2047 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_48_in_primrule2052 = new BitSet(new long[]{0x02008000200018B0L,0x00001EE000004080L});
    public static final BitSet FOLLOW_expr_in_primrule2056 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_48_in_primrule2064 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_primrule2068 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_modifier_clause_in_primrule2072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emit_block_in_primrule2082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_modifier_clause2116 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_modifier_in_modifier_clause2120 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_modifier_clause2125 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_modifier_in_modifier_clause2129 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_VAR_in_modifier2154 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_modifier2156 = new BitSet(new long[]{0x02008000200058B0L,0x00001EE000004080L});
    public static final BitSet FOLLOW_expr_in_modifier2161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JS_in_modifier2167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_using2192 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_set_in_using2196 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_setting_in_using2204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_setting2225 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_setting2227 = new BitSet(new long[]{0x0002000000000010L});
    public static final BitSet FOLLOW_VAR_in_setting2232 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_48_in_setting2236 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_setting2240 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_49_in_setting2248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_pre_block2273 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_pre_block2275 = new BitSet(new long[]{0x00000000C0000010L});
    public static final BitSet FOLLOW_decl_in_pre_block2279 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_31_in_pre_block2283 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_decl_in_pre_block2285 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_31_in_pre_block2293 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_pre_block2296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_foreach2329 = new BitSet(new long[]{0x02008000200018B0L,0x00001EE000004080L});
    public static final BitSet FOLLOW_expr_in_foreach2333 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_setting_in_foreach2337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_when2372 = new BitSet(new long[]{0xF800803000000010L});
    public static final BitSet FOLLOW_event_seq_in_when2376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_event_or_in_event_seq2403 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_must_be_one_in_event_seq2408 = new BitSet(new long[]{0xF800803000000010L});
    public static final BitSet FOLLOW_event_or_in_event_seq2413 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_event_and_in_event_or2455 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_event_or2460 = new BitSet(new long[]{0xF800803000000010L});
    public static final BitSet FOLLOW_event_and_in_event_or2464 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_event_btwn_in_event_and2494 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_event_and2499 = new BitSet(new long[]{0xF800803000000010L});
    public static final BitSet FOLLOW_event_btwn_in_event_and2503 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_event_prim_in_event_btwn2529 = new BitSet(new long[]{0x0600000000000002L});
    public static final BitSet FOLLOW_57_in_event_btwn2535 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_event_btwn2540 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_event_btwn2542 = new BitSet(new long[]{0xF800803000000010L});
    public static final BitSet FOLLOW_event_seq_in_event_btwn2546 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_event_btwn2548 = new BitSet(new long[]{0xF800803000000010L});
    public static final BitSet FOLLOW_event_seq_in_event_btwn2552 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_event_btwn2554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_event_prim2585 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_event_prim2588 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_STRING_in_event_prim2593 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_REGEXP_in_event_prim2597 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_setting_in_event_prim2602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_event_prim2611 = new BitSet(new long[]{0xE000003000000000L});
    public static final BitSet FOLLOW_set_in_event_prim2616 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_event_prim2630 = new BitSet(new long[]{0x0010000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_on_expr_in_event_prim2634 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_setting_in_event_prim2640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_event_prim2650 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_event_prim2654 = new BitSet(new long[]{0x0010000000000012L});
    public static final BitSet FOLLOW_event_filter_in_event_prim2659 = new BitSet(new long[]{0x0010000000000012L});
    public static final BitSet FOLLOW_setting_in_event_prim2666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_event_prim2676 = new BitSet(new long[]{0xF800803000000010L});
    public static final BitSet FOLLOW_event_seq_in_event_prim2680 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_event_prim2682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_event_filter2703 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_STRING_in_event_filter2708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REGEXP_in_event_filter2714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_on_expr2733 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_STRING_in_on_expr2742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REGEXP_in_on_expr2753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_global_block2838 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_global_block2840 = new BitSet(new long[]{0x00000000C0000010L,0x0001400000000000L});
    public static final BitSet FOLLOW_emit_block_in_global_block2848 = new BitSet(new long[]{0x00000000C0000010L,0x0001400000000000L});
    public static final BitSet FOLLOW_must_be_one_in_global_block2858 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_global_block2863 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_39_in_global_block2866 = new BitSet(new long[]{0x0000000000000000L,0x000000000000003CL});
    public static final BitSet FOLLOW_set_in_global_block2870 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_global_block2882 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_global_block2886 = new BitSet(new long[]{0x00000000C0000010L,0x0001C00000000000L});
    public static final BitSet FOLLOW_cachable_in_global_block2891 = new BitSet(new long[]{0x00000000C0000010L,0x0001400000000000L});
    public static final BitSet FOLLOW_css_emit_in_global_block2904 = new BitSet(new long[]{0x00000000C0000010L,0x0001400000000000L});
    public static final BitSet FOLLOW_decl_in_global_block2912 = new BitSet(new long[]{0x00000000C0000010L,0x0001400000000000L});
    public static final BitSet FOLLOW_31_in_global_block2918 = new BitSet(new long[]{0x00000000C0000010L,0x0001400000000000L});
    public static final BitSet FOLLOW_30_in_global_block2923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_decl2950 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_decl2952 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_HTML_in_decl2956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_decl2966 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_decl2968 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_JS_in_decl2972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_decl2982 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_decl2984 = new BitSet(new long[]{0x02008000200018B0L,0x00001EE000004080L});
    public static final BitSet FOLLOW_expr_in_decl2988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_def_in_expr3015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_expression_in_expr3024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_function_def3047 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_function_def3049 = new BitSet(new long[]{0x0003000000000010L});
    public static final BitSet FOLLOW_VAR_in_function_def3053 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_48_in_function_def3057 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_function_def3061 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_49_in_function_def3066 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_function_def3068 = new BitSet(new long[]{0x02008000A00018B0L,0x00001EE000004080L});
    public static final BitSet FOLLOW_decl_in_function_def3072 = new BitSet(new long[]{0x02008000A00018B0L,0x00001EE000004080L});
    public static final BitSet FOLLOW_31_in_function_def3077 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_decl_in_function_def3081 = new BitSet(new long[]{0x02008000A00018B0L,0x00001EE000004080L});
    public static final BitSet FOLLOW_31_in_function_def3086 = new BitSet(new long[]{0x02008000200018B0L,0x00001EE000004080L});
    public static final BitSet FOLLOW_expr_in_function_def3091 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_function_def3093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_disjunction_in_conditional_expression3115 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_conditional_expression3118 = new BitSet(new long[]{0x02008000200018B0L,0x00001EE000004080L});
    public static final BitSet FOLLOW_expr_in_conditional_expression3120 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_conditional_expression3122 = new BitSet(new long[]{0x02008000200018B0L,0x00001EE000004080L});
    public static final BitSet FOLLOW_expr_in_conditional_expression3124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conjunction_in_disjunction3156 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_disjunction3161 = new BitSet(new long[]{0x02008000200018B0L,0x00001EE000004080L});
    public static final BitSet FOLLOW_conjunction_in_disjunction3165 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_equality_expr_in_conjunction3195 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_conjunction3200 = new BitSet(new long[]{0x02008000200018B0L,0x00001EE000004080L});
    public static final BitSet FOLLOW_equality_expr_in_conjunction3204 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_add_expr_in_equality_expr3235 = new BitSet(new long[]{0x0000000007FC0002L});
    public static final BitSet FOLLOW_predop_in_equality_expr3240 = new BitSet(new long[]{0x02008000200018B0L,0x00001EE000004080L});
    public static final BitSet FOLLOW_add_expr_in_equality_expr3244 = new BitSet(new long[]{0x0000000007FC0002L});
    public static final BitSet FOLLOW_mult_expr_in_add_expr3278 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_add_op_in_add_expr3283 = new BitSet(new long[]{0x02008000200018B0L,0x00001EE000004080L});
    public static final BitSet FOLLOW_mult_expr_in_add_expr3287 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_set_in_mult_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_expr_in_mult_expr3335 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003800L});
    public static final BitSet FOLLOW_mult_op_in_mult_expr3340 = new BitSet(new long[]{0x02008000200018B0L,0x00001EE000004080L});
    public static final BitSet FOLLOW_unary_expr_in_mult_expr3344 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003800L});
    public static final BitSet FOLLOW_57_in_unary_expr3384 = new BitSet(new long[]{0x02008000200018B0L,0x00001EE000004080L});
    public static final BitSet FOLLOW_unary_expr_in_unary_expr3386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_unary_expr3393 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_unary_expr3397 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_must_be_in_unary_expr3399 = new BitSet(new long[]{0x0000000000000000L,0x0000180000000000L});
    public static final BitSet FOLLOW_var_domain_in_unary_expr3404 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_unary_expr3406 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_unary_expr3410 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L});
    public static final BitSet FOLLOW_timeframe_in_unary_expr3414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_unary_expr3422 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_unary_expr3426 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_must_be_one_in_unary_expr3430 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_unary_expr3435 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_must_be_in_unary_expr3438 = new BitSet(new long[]{0x0000000000000000L,0x0000180000000000L});
    public static final BitSet FOLLOW_var_domain_in_unary_expr3443 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_unary_expr3445 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_unary_expr3449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_domain_in_unary_expr3458 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_unary_expr3460 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_unary_expr3464 = new BitSet(new long[]{0x0000000007FC0000L});
    public static final BitSet FOLLOW_predop_in_unary_expr3468 = new BitSet(new long[]{0x02008000200018B0L,0x00001EE000004080L});
    public static final BitSet FOLLOW_expr_in_unary_expr3472 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_timeframe_in_unary_expr3476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_domain_in_unary_expr3486 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_unary_expr3488 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_unary_expr3492 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_timeframe_in_unary_expr3496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operator_expr_in_unary_expr3505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_operator_expr3534 = new BitSet(new long[]{0x0000000000000002L,0x0000001FFFFF8000L});
    public static final BitSet FOLLOW_operator_in_operator_expr3540 = new BitSet(new long[]{0x0000000000000002L,0x0000001FFFFF8000L});
    public static final BitSet FOLLOW_set_in_operator3570 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_operator3657 = new BitSet(new long[]{0x02028000200018B0L,0x00001EE000004080L});
    public static final BitSet FOLLOW_expr_in_operator3662 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_48_in_operator3667 = new BitSet(new long[]{0x02008000200018B0L,0x00001EE000004080L});
    public static final BitSet FOLLOW_expr_in_operator3671 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_49_in_operator3680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_factor3719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_factor3734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_factor3754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_factor3774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REGEXP_in_factor3794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_factor3808 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_factor3810 = new BitSet(new long[]{0x02008000200018B0L,0x00001EE000004080L});
    public static final BitSet FOLLOW_expr_in_factor3814 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_104_in_factor3816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_domain_in_factor3831 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_factor3833 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_factor3837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_factor3849 = new BitSet(new long[]{0x0000000000000000L,0x0000180000000000L});
    public static final BitSet FOLLOW_var_domain_in_factor3853 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_factor3855 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_factor3859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_factor3872 = new BitSet(new long[]{0x02008000200018B0L,0x00001EE000004080L});
    public static final BitSet FOLLOW_expr_in_factor3876 = new BitSet(new long[]{0x0000000000000000L,0x0000180000000000L});
    public static final BitSet FOLLOW_var_domain_in_factor3880 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_factor3882 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_factor3886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namespace_in_factor3900 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_factor3904 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_factor3906 = new BitSet(new long[]{0x02028000200018B0L,0x00001EE000004080L});
    public static final BitSet FOLLOW_expr_in_factor3911 = new BitSet(new long[]{0x02038000200018B0L,0x00001EE000004080L});
    public static final BitSet FOLLOW_48_in_factor3922 = new BitSet(new long[]{0x02028000200018B0L,0x00001EE000004080L});
    public static final BitSet FOLLOW_49_in_factor3927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_factor3942 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_factor3944 = new BitSet(new long[]{0x02028000200018B0L,0x00001EE000004080L});
    public static final BitSet FOLLOW_expr_in_factor3949 = new BitSet(new long[]{0x02038000200018B0L,0x00001EE000004080L});
    public static final BitSet FOLLOW_48_in_factor3953 = new BitSet(new long[]{0x02028000200018B0L,0x00001EE000004080L});
    public static final BitSet FOLLOW_49_in_factor3958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_factor3970 = new BitSet(new long[]{0x02008000200018B0L,0x00001EE000004080L});
    public static final BitSet FOLLOW_expr_in_factor3974 = new BitSet(new long[]{0x0001000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_48_in_factor3979 = new BitSet(new long[]{0x02008000200018B0L,0x00001EE000004080L});
    public static final BitSet FOLLOW_expr_in_factor3983 = new BitSet(new long[]{0x0001000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_104_in_factor3988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_factor4000 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_hash_line_in_factor4004 = new BitSet(new long[]{0x0001000040000000L});
    public static final BitSet FOLLOW_48_in_factor4009 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_hash_line_in_factor4013 = new BitSet(new long[]{0x0001000040000000L});
    public static final BitSet FOLLOW_30_in_factor4019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_factor4033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_factor4046 = new BitSet(new long[]{0x02008000200018B0L,0x00001EE000004080L});
    public static final BitSet FOLLOW_expr_in_factor4050 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_factor4052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_var_domain0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_namespace4095 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_namespace4097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_timeframe4119 = new BitSet(new long[]{0x02008000200018B0L,0x00001EE000004080L});
    public static final BitSet FOLLOW_expr_in_timeframe4123 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_period_in_timeframe4127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_hash_line4151 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_hash_line4153 = new BitSet(new long[]{0x02008000200018B0L,0x00001EE000004080L});
    public static final BitSet FOLLOW_expr_in_hash_line4157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_css_emit4175 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_HTML_in_css_emit4181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_css_emit4189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_must_be_one_in_period4212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_cachable4246 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_cachable4249 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_INT_in_cachable4253 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_period_in_cachable4257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_emit_block4281 = new BitSet(new long[]{0x0000000000006800L});
    public static final BitSet FOLLOW_HTML_in_emit_block4287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_emit_block4295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JS_in_emit_block4303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_meta_block4335 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_meta_block4337 = new BitSet(new long[]{0x0000000040000010L,0x014C000000000000L});
    public static final BitSet FOLLOW_must_be_one_in_meta_block4346 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_HTML_in_meta_block4352 = new BitSet(new long[]{0x0000000040000010L,0x014C000000000000L});
    public static final BitSet FOLLOW_STRING_in_meta_block4356 = new BitSet(new long[]{0x0000000040000010L,0x014C000000000000L});
    public static final BitSet FOLLOW_114_in_meta_block4370 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_must_be_one_in_meta_block4374 = new BitSet(new long[]{0x0000000020000800L});
    public static final BitSet FOLLOW_STRING_in_meta_block4380 = new BitSet(new long[]{0x0000000060000810L,0x014C000000000000L});
    public static final BitSet FOLLOW_29_in_meta_block4384 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_name_value_pair_in_meta_block4387 = new BitSet(new long[]{0x0001000040000000L});
    public static final BitSet FOLLOW_48_in_meta_block4391 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_name_value_pair_in_meta_block4393 = new BitSet(new long[]{0x0001000040000000L});
    public static final BitSet FOLLOW_30_in_meta_block4399 = new BitSet(new long[]{0x0000000060000810L,0x014C000000000000L});
    public static final BitSet FOLLOW_115_in_meta_block4411 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_meta_block4413 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_meta_block4415 = new BitSet(new long[]{0x0000000040000010L,0x014C000000000000L});
    public static final BitSet FOLLOW_118_in_meta_block4423 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000001L});
    public static final BitSet FOLLOW_set_in_meta_block4427 = new BitSet(new long[]{0x0000000040000010L,0x014C000000000000L});
    public static final BitSet FOLLOW_120_in_meta_block4438 = new BitSet(new long[]{0x0000000000000000L,0x0600400000000000L});
    public static final BitSet FOLLOW_set_in_meta_block4445 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_must_be_in_meta_block4451 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_STRING_in_meta_block4457 = new BitSet(new long[]{0x0000000040000010L,0x014C000000000000L});
    public static final BitSet FOLLOW_VAR_in_meta_block4463 = new BitSet(new long[]{0x0000000040000010L,0x014C000000000000L});
    public static final BitSet FOLLOW_122_in_meta_block4478 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_meta_block4483 = new BitSet(new long[]{0x0000000040000010L,0x094C000000000000L});
    public static final BitSet FOLLOW_123_in_meta_block4486 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_meta_block4490 = new BitSet(new long[]{0x0000000040000010L,0x014C000000000000L});
    public static final BitSet FOLLOW_30_in_meta_block4505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_must_be_in_dispatch_block4536 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_dispatch_block4540 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_must_be_in_dispatch_block4543 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_dispatch_block4548 = new BitSet(new long[]{0x0000000040000010L,0x1000000000000000L});
    public static final BitSet FOLLOW_124_in_dispatch_block4551 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_dispatch_block4555 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_30_in_dispatch_block4565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_name_value_pair4588 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_name_value_pair4590 = new BitSet(new long[]{0x00000000000008A0L});
    public static final BitSet FOLLOW_INT_in_name_value_pair4598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_name_value_pair4609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_name_value_pair4620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_synpred19_RuleSet21034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emit_block_in_synpred20_RuleSet21039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_synpred23_RuleSet21055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_persistent_expr_in_synpred31_RuleSet21207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_log_statement_in_synpred33_RuleSet21224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_synpred51_RuleSet21868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred52_RuleSet21889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_must_be_one_in_synpred73_RuleSet22408 = new BitSet(new long[]{0xF800803000000010L});
    public static final BitSet FOLLOW_event_or_in_synpred73_RuleSet22413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeframe_in_synpred122_RuleSet23414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_synpred123_RuleSet23393 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_synpred123_RuleSet23397 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_must_be_in_synpred123_RuleSet23399 = new BitSet(new long[]{0x0000000000000000L,0x0000180000000000L});
    public static final BitSet FOLLOW_var_domain_in_synpred123_RuleSet23404 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_synpred123_RuleSet23406 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_synpred123_RuleSet23410 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L});
    public static final BitSet FOLLOW_timeframe_in_synpred123_RuleSet23414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_synpred124_RuleSet23422 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_synpred124_RuleSet23426 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_must_be_one_in_synpred124_RuleSet23430 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_synpred124_RuleSet23435 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_must_be_in_synpred124_RuleSet23438 = new BitSet(new long[]{0x0000000000000000L,0x0000180000000000L});
    public static final BitSet FOLLOW_var_domain_in_synpred124_RuleSet23443 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_synpred124_RuleSet23445 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_synpred124_RuleSet23449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_domain_in_synpred125_RuleSet23458 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_synpred125_RuleSet23460 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_synpred125_RuleSet23464 = new BitSet(new long[]{0x0000000007FC0000L});
    public static final BitSet FOLLOW_predop_in_synpred125_RuleSet23468 = new BitSet(new long[]{0x02008000200018B0L,0x00001EE000004080L});
    public static final BitSet FOLLOW_expr_in_synpred125_RuleSet23472 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_timeframe_in_synpred125_RuleSet23476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_domain_in_synpred126_RuleSet23486 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_synpred126_RuleSet23488 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_synpred126_RuleSet23492 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_timeframe_in_synpred126_RuleSet23496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_synpred157_RuleSet23808 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_synpred157_RuleSet23810 = new BitSet(new long[]{0x02008000200018B0L,0x00001EE000004080L});
    public static final BitSet FOLLOW_expr_in_synpred157_RuleSet23814 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_104_in_synpred157_RuleSet23816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namespace_in_synpred163_RuleSet23900 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_synpred163_RuleSet23904 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_synpred163_RuleSet23906 = new BitSet(new long[]{0x02028000200018B0L,0x00001EE000004080L});
    public static final BitSet FOLLOW_expr_in_synpred163_RuleSet23911 = new BitSet(new long[]{0x02038000200018B0L,0x00001EE000004080L});
    public static final BitSet FOLLOW_48_in_synpred163_RuleSet23922 = new BitSet(new long[]{0x02028000200018B0L,0x00001EE000004080L});
    public static final BitSet FOLLOW_49_in_synpred163_RuleSet23927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_synpred166_RuleSet23942 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_synpred166_RuleSet23944 = new BitSet(new long[]{0x02028000200018B0L,0x00001EE000004080L});
    public static final BitSet FOLLOW_expr_in_synpred166_RuleSet23949 = new BitSet(new long[]{0x02038000200018B0L,0x00001EE000004080L});
    public static final BitSet FOLLOW_48_in_synpred166_RuleSet23953 = new BitSet(new long[]{0x02028000200018B0L,0x00001EE000004080L});
    public static final BitSet FOLLOW_49_in_synpred166_RuleSet23958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_synpred171_RuleSet24033 = new BitSet(new long[]{0x0000000000000002L});

}