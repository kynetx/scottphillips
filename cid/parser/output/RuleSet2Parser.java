// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g 2010-07-22 12:23:27

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "VAR", "INT", "EXPONENT", "FLOAT", "COMMENT", "WS", "ESC_SEQ", "STRING", "REGEXP", "HTML", "JS", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "'<='", "'>='", "'<'", "'>'", "'=='", "'!='", "'eq'", "'neq'", "'like'", "'+'", "'-'", "'{'", "'}'", "';'", "'if'", "'callbacks'", "'success'", "'failure'", "'click'", "'change'", "'='", "'clear'", "':'", "'set'", "'forget'", "'mark'", "'with'", "'+='", "'-='", "'for'", "'then'", "'=>'", "'('", "','", "')'", "'and'", "'using'", "'setting'", "'pre'", "'foreach'", "'when'", "'before'", "'or'", "'not'", "'between'", "'web'", "'pageview'", "'submit'", "'dblclick'", "'update'", "'on'", "'global'", "'JSON'", "'XML'", "'RSS'", "'HTML'", "'<-'", "'function'", "'|'", "'||'", "'&&'", "'*'", "'/'", "'%'", "'seen'", "'after'", "'.pick'", "'.match'", "'.length'", "'.replace'", "'.as'", "'.head'", "'.tail'", "'.sort'", "'.filter'", "'.map'", "'.uc'", "'.lc'", "'.split'", "'.join'", "'.query'", "'.has'", "'.union'", "'.difference'", "'.intersection'", "'.unique'", "'.once'", "'.duplicates'", "'true'", "'false'", "'['", "']'", "'current'", "'history'", "'ent'", "'app'", "'within'", "'css'", "'cachable'", "'emit'", "'meta'", "'key'", "'authz'", "'require'", "'user'", "'logging'", "'off'", "'use'", "'javascript'", "'module'", "'alias'", "'->'"
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
        "invalidRule", "synpred190_RuleSet2", "synpred179_RuleSet2", "synpred6_RuleSet2", 
        "emit_block", "synpred108_RuleSet2", "for_clause", "synpred65_RuleSet2", 
        "synpred152_RuleSet2", "synpred3_RuleSet2", "synpred85_RuleSet2", 
        "when", "synpred25_RuleSet2", "synpred56_RuleSet2", "mult_op", "synpred57_RuleSet2", 
        "synpred160_RuleSet2", "synpred40_RuleSet2", "synpred134_RuleSet2", 
        "synpred133_RuleSet2", "synpred120_RuleSet2", "synpred32_RuleSet2", 
        "synpred12_RuleSet2", "synpred79_RuleSet2", "synpred48_RuleSet2", 
        "synpred38_RuleSet2", "synpred67_RuleSet2", "synpred20_RuleSet2", 
        "predop", "on_expr", "rule", "timeframe", "pre_block", "click", 
        "synpred33_RuleSet2", "add_op", "action", "synpred27_RuleSet2", 
        "synpred62_RuleSet2", "synpred93_RuleSet2", "synpred109_RuleSet2", 
        "synpred192_RuleSet2", "operator_expr", "modifier_clause", "synpred137_RuleSet2", 
        "synpred91_RuleSet2", "factor", "synpred86_RuleSet2", "persistent_iterate", 
        "persistent_clear", "synpred138_RuleSet2", "synpred71_RuleSet2", 
        "synpred10_RuleSet2", "name_value_pair", "hash_line", "synpred98_RuleSet2", 
        "mult_expr", "synpred184_RuleSet2", "synpred36_RuleSet2", "rule_name", 
        "click_link", "synpred55_RuleSet2", "synpred16_RuleSet2", "global_block", 
        "synpred144_RuleSet2", "synpred141_RuleSet2", "synpred165_RuleSet2", 
        "synpred158_RuleSet2", "css_emit", "synpred84_RuleSet2", "synpred121_RuleSet2", 
        "post_block", "synpred22_RuleSet2", "synpred83_RuleSet2", "synpred89_RuleSet2", 
        "synpred181_RuleSet2", "synpred13_RuleSet2", "unconditional_action", 
        "synpred176_RuleSet2", "synpred2_RuleSet2", "success", "event_seq", 
        "operator", "synpred99_RuleSet2", "period", "log_statement", "synpred47_RuleSet2", 
        "synpred111_RuleSet2", "counter_op", "failure", "synpred76_RuleSet2", 
        "synpred170_RuleSet2", "synpred45_RuleSet2", "synpred80_RuleSet2", 
        "synpred128_RuleSet2", "synpred116_RuleSet2", "synpred4_RuleSet2", 
        "synpred129_RuleSet2", "primrule", "synpred130_RuleSet2", "synpred31_RuleSet2", 
        "synpred182_RuleSet2", "synpred97_RuleSet2", "synpred104_RuleSet2", 
        "event_btwn", "synpred100_RuleSet2", "modifier", "function_def", 
        "expr", "synpred183_RuleSet2", "synpred42_RuleSet2", "synpred1_RuleSet2", 
        "synpred81_RuleSet2", "must_be", "synpred70_RuleSet2", "synpred145_RuleSet2", 
        "synpred8_RuleSet2", "synpred64_RuleSet2", "synpred150_RuleSet2", 
        "add_expr", "synpred172_RuleSet2", "synpred15_RuleSet2", "post_alternate", 
        "synpred73_RuleSet2", "synpred115_RuleSet2", "synpred61_RuleSet2", 
        "synpred90_RuleSet2", "callbacks", "dispatch_block", "meta_block", 
        "synpred112_RuleSet2", "synpred63_RuleSet2", "synpred102_RuleSet2", 
        "synpred35_RuleSet2", "synpred37_RuleSet2", "synpred187_RuleSet2", 
        "synpred149_RuleSet2", "synpred41_RuleSet2", "synpred34_RuleSet2", 
        "synpred26_RuleSet2", "synpred52_RuleSet2", "synpred131_RuleSet2", 
        "synpred126_RuleSet2", "synpred54_RuleSet2", "synpred156_RuleSet2", 
        "synpred50_RuleSet2", "synpred175_RuleSet2", "synpred18_RuleSet2", 
        "synpred118_RuleSet2", "synpred174_RuleSet2", "synpred105_RuleSet2", 
        "synpred29_RuleSet2", "synpred185_RuleSet2", "synpred123_RuleSet2", 
        "synpred161_RuleSet2", "synpred142_RuleSet2", "synpred178_RuleSet2", 
        "unary_expr", "synpred162_RuleSet2", "conjunction", "synpred168_RuleSet2", 
        "synpred77_RuleSet2", "synpred94_RuleSet2", "event_prim", "synpred148_RuleSet2", 
        "synpred49_RuleSet2", "synpred88_RuleSet2", "synpred180_RuleSet2", 
        "synpred155_RuleSet2", "synpred132_RuleSet2", "synpred78_RuleSet2", 
        "synpred139_RuleSet2", "counter_start", "equality_expr", "synpred103_RuleSet2", 
        "synpred9_RuleSet2", "synpred135_RuleSet2", "event_or", "synpred87_RuleSet2", 
        "synpred159_RuleSet2", "using", "synpred166_RuleSet2", "synpred44_RuleSet2", 
        "synpred164_RuleSet2", "synpred106_RuleSet2", "synpred151_RuleSet2", 
        "synpred191_RuleSet2", "persistent_set", "synpred143_RuleSet2", 
        "synpred23_RuleSet2", "trail_with", "cachable", "synpred188_RuleSet2", 
        "synpred21_RuleSet2", "synpred60_RuleSet2", "synpred96_RuleSet2", 
        "synpred153_RuleSet2", "post_statement", "synpred171_RuleSet2", 
        "synpred53_RuleSet2", "synpred186_RuleSet2", "decl", "synpred17_RuleSet2", 
        "synpred66_RuleSet2", "synpred92_RuleSet2", "synpred140_RuleSet2", 
        "raise_statement", "synpred39_RuleSet2", "synpred113_RuleSet2", 
        "action_block", "rulesetname", "synpred114_RuleSet2", "synpred28_RuleSet2", 
        "namespace", "synpred5_RuleSet2", "synpred68_RuleSet2", "synpred69_RuleSet2", 
        "conditional_action", "synpred14_RuleSet2", "synpred11_RuleSet2", 
        "synpred127_RuleSet2", "trail_mark", "synpred167_RuleSet2", "synpred163_RuleSet2", 
        "conditional_expression", "synpred136_RuleSet2", "synpred147_RuleSet2", 
        "synpred146_RuleSet2", "synpred24_RuleSet2", "must_be_one", "synpred119_RuleSet2", 
        "disjunction", "persistent_expr", "synpred58_RuleSet2", "synpred43_RuleSet2", 
        "synpred75_RuleSet2", "synpred95_RuleSet2", "synpred72_RuleSet2", 
        "var_domain", "synpred107_RuleSet2", "synpred19_RuleSet2", "event_filter", 
        "synpred125_RuleSet2", "ruleset", "synpred117_RuleSet2", "synpred59_RuleSet2", 
        "synpred74_RuleSet2", "synpred154_RuleSet2", "event_and", "trail_forget", 
        "synpred7_RuleSet2", "synpred122_RuleSet2", "foreach", "synpred82_RuleSet2", 
        "synpred51_RuleSet2", "synpred110_RuleSet2", "synpred173_RuleSet2", 
        "synpred169_RuleSet2", "synpred30_RuleSet2", "synpred157_RuleSet2", 
        "synpred124_RuleSet2", "synpred101_RuleSet2", "synpred177_RuleSet2", 
        "synpred46_RuleSet2", "synpred189_RuleSet2", "setting"
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
            pushFollow(FOLLOW_must_be_in_ruleset806);
            must_be3=must_be("ruleset");

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, must_be3.getTree());
            dbg.location(283,3);
            pushFollow(FOLLOW_rulesetname_in_ruleset812);
            rulesetname4=rulesetname();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, rulesetname4.getTree());
            dbg.location(283,15);
            if ( state.backtracking==0 ) {
               current_top.put("ruleset_name",(rulesetname4!=null?input.toString(rulesetname4.start,rulesetname4.stop):null)); 
            }
            dbg.location(284,3);
            char_literal5=(Token)match(input,29,FOLLOW_29_in_ruleset819); if (state.failed) return retval;
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
                case 118:
                    {
                    alt1=1;
                    }
                    break;
                case VAR:
                    {
                    int LA1_3 = input.LA(2);

                    if ( (LA1_3==29) ) {
                        alt1=2;
                    }
                    else if ( ((LA1_3>=VAR && LA1_3<=INT)) ) {
                        alt1=4;
                    }


                    }
                    break;
                case 69:
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
            	    pushFollow(FOLLOW_meta_block_in_ruleset826);
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
            	    pushFollow(FOLLOW_dispatch_block_in_ruleset830);
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
            	    pushFollow(FOLLOW_global_block_in_ruleset834);
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
            	    pushFollow(FOLLOW_rule_in_ruleset838);
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
            char_literal10=(Token)match(input,30,FOLLOW_30_in_ruleset844); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal10_tree = (Object)adaptor.create(char_literal10);
            adaptor.addChild(root_0, char_literal10_tree);
            }
            dbg.location(287,2);
            EOF11=(Token)match(input,EOF,FOLLOW_EOF_in_ruleset848); if (state.failed) return retval;
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
            v=(Token)match(input,VAR,FOLLOW_VAR_in_must_be871); if (state.failed) return retval;
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
            v=(Token)match(input,VAR,FOLLOW_VAR_in_must_be_one896); if (state.failed) return retval;
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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:315:1: rule : must_be[\"rule\"] name= rule_name must_be[\"is\"] ait= must_be_one[sar(\"active\",\"inactive\",\"test\")] '{' select= VAR (ptu= using | ptw= when ) (f= foreach )* (pb= pre_block )? (eb= emit_block )? ( action[actions_result] ) (cb= callbacks )? (postb= post_block )? '}' ;
    public final RuleSet2Parser.rule_return rule() throws RecognitionException {
        RuleSet2Parser.rule_return retval = new RuleSet2Parser.rule_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token select=null;
        Token char_literal16=null;
        Token char_literal18=null;
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

        RuleSet2Parser.action_return action17 = null;


        Object select_tree=null;
        Object char_literal16_tree=null;
        Object char_literal18_tree=null;


        	 ArrayList rule_block_array = (ArrayList)rule_json.get("rules");
        	 HashMap current_rule = new HashMap();
        	 HashMap actions_result = new HashMap();
        	 ArrayList fors = new ArrayList();

        try { dbg.enterRule(getGrammarFileName(), "rule");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(315, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:322:2: ( must_be[\"rule\"] name= rule_name must_be[\"is\"] ait= must_be_one[sar(\"active\",\"inactive\",\"test\")] '{' select= VAR (ptu= using | ptw= when ) (f= foreach )* (pb= pre_block )? (eb= emit_block )? ( action[actions_result] ) (cb= callbacks )? (postb= post_block )? '}' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:322:5: must_be[\"rule\"] name= rule_name must_be[\"is\"] ait= must_be_one[sar(\"active\",\"inactive\",\"test\")] '{' select= VAR (ptu= using | ptw= when ) (f= foreach )* (pb= pre_block )? (eb= emit_block )? ( action[actions_result] ) (cb= callbacks )? (postb= post_block )? '}'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(322,5);
            pushFollow(FOLLOW_must_be_in_rule955);
            must_be14=must_be("rule");

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, must_be14.getTree());
            dbg.location(323,7);
            pushFollow(FOLLOW_rule_name_in_rule962);
            name=rule_name();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, name.getTree());
            dbg.location(324,3);
            pushFollow(FOLLOW_must_be_in_rule969);
            must_be15=must_be("is");

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, must_be15.getTree());
            dbg.location(326,6);
            pushFollow(FOLLOW_must_be_one_in_rule978);
            ait=must_be_one(sar("active","inactive","test"));

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ait.getTree());
            dbg.location(327,3);
            char_literal16=(Token)match(input,29,FOLLOW_29_in_rule983); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal16_tree = (Object)adaptor.create(char_literal16);
            adaptor.addChild(root_0, char_literal16_tree);
            }
            dbg.location(328,12);
            select=(Token)match(input,VAR,FOLLOW_VAR_in_rule993); if (state.failed) return retval;
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

            if ( (LA2_0==54) ) {
                alt2=1;
            }
            else if ( (LA2_0==58) ) {
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
                    pushFollow(FOLLOW_using_in_rule1000);
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
                    pushFollow(FOLLOW_when_in_rule1004);
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

                if ( (LA3_0==57) ) {
                    alt3=1;
                }


                } finally {dbg.exitDecision(3);}

                switch (alt3) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:328:82: f= foreach
            	    {
            	    dbg.location(328,83);
            	    pushFollow(FOLLOW_foreach_in_rule1010);
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

            if ( (LA4_0==56) ) {
                alt4=1;
            }
            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: pb= pre_block
                    {
                    dbg.location(328,119);
                    pushFollow(FOLLOW_pre_block_in_rule1017);
                    pb=pre_block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pb.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(4);}

            dbg.location(328,133);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:328:133: (eb= emit_block )?
            int alt5=2;
            try { dbg.enterSubRule(5);
            try { dbg.enterDecision(5);

            int LA5_0 = input.LA(1);

            if ( (LA5_0==117) ) {
                int LA5_1 = input.LA(2);

                if ( (synpred19_RuleSet2()) ) {
                    alt5=1;
                }
            }
            } finally {dbg.exitDecision(5);}

            switch (alt5) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: eb= emit_block
                    {
                    dbg.location(328,133);
                    pushFollow(FOLLOW_emit_block_in_rule1022);
                    eb=emit_block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, eb.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(5);}

            dbg.location(328,146);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:328:146: ( action[actions_result] )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:328:147: action[actions_result]
            {
            dbg.location(328,147);
            pushFollow(FOLLOW_action_in_rule1026);
            action17=action(actions_result);

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, action17.getTree());

            }

            dbg.location(328,173);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:328:173: (cb= callbacks )?
            int alt6=2;
            try { dbg.enterSubRule(6);
            try { dbg.enterDecision(6);

            int LA6_0 = input.LA(1);

            if ( (LA6_0==33) ) {
                alt6=1;
            }
            } finally {dbg.exitDecision(6);}

            switch (alt6) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: cb= callbacks
                    {
                    dbg.location(328,173);
                    pushFollow(FOLLOW_callbacks_in_rule1032);
                    cb=callbacks();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, cb.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(6);}

            dbg.location(328,190);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:328:190: (postb= post_block )?
            int alt7=2;
            try { dbg.enterSubRule(7);
            try { dbg.enterDecision(7);

            int LA7_0 = input.LA(1);

            if ( (LA7_0==VAR) ) {
                alt7=1;
            }
            } finally {dbg.exitDecision(7);}

            switch (alt7) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: postb= post_block
                    {
                    dbg.location(328,190);
                    pushFollow(FOLLOW_post_block_in_rule1037);
                    postb=post_block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, postb.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(7);}

            dbg.location(329,3);
            char_literal18=(Token)match(input,30,FOLLOW_30_in_rule1042); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal18_tree = (Object)adaptor.create(char_literal18);
            adaptor.addChild(root_0, char_literal18_tree);
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

        Token char_literal19=null;
        Token char_literal20=null;
        Token char_literal21=null;
        Token char_literal22=null;
        RuleSet2Parser.must_be_one_return typ = null;

        RuleSet2Parser.post_statement_return p1 = null;

        RuleSet2Parser.post_statement_return p2 = null;

        RuleSet2Parser.post_alternate_return alt = null;


        Object char_literal19_tree=null;
        Object char_literal20_tree=null;
        Object char_literal21_tree=null;
        Object char_literal22_tree=null;


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
            pushFollow(FOLLOW_must_be_one_in_post_block1073);
            typ=must_be_one(sar("fired","always","notfired"));

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typ.getTree());
            dbg.location(381,52);
            char_literal19=(Token)match(input,29,FOLLOW_29_in_post_block1076); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal19_tree = (Object)adaptor.create(char_literal19);
            adaptor.addChild(root_0, char_literal19_tree);
            }
            dbg.location(382,5);
            pushFollow(FOLLOW_post_statement_in_post_block1083);
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
            try { dbg.enterSubRule(8);

            loop8:
            do {
                int alt8=2;
                try { dbg.enterDecision(8);

                int LA8_0 = input.LA(1);

                if ( (LA8_0==31) ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1==VAR||LA8_1==39||(LA8_1>=41 && LA8_1<=43)||(LA8_1>=112 && LA8_1<=113)) ) {
                        alt8=1;
                    }


                }


                } finally {dbg.exitDecision(8);}

                switch (alt8) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:382:52: ';' p2= post_statement
            	    {
            	    dbg.location(382,52);
            	    char_literal20=(Token)match(input,31,FOLLOW_31_in_post_block1088); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal20_tree = (Object)adaptor.create(char_literal20);
            	    adaptor.addChild(root_0, char_literal20_tree);
            	    }
            	    dbg.location(382,58);
            	    pushFollow(FOLLOW_post_statement_in_post_block1092);
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
            	    break loop8;
                }
            } while (true);
            } finally {dbg.exitSubRule(8);}

            dbg.location(382,108);
            char_literal21=(Token)match(input,31,FOLLOW_31_in_post_block1100); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal21_tree = (Object)adaptor.create(char_literal21);
            adaptor.addChild(root_0, char_literal21_tree);
            }
            dbg.location(382,112);
            char_literal22=(Token)match(input,30,FOLLOW_30_in_post_block1102); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal22_tree = (Object)adaptor.create(char_literal22);
            adaptor.addChild(root_0, char_literal22_tree);
            }
            dbg.location(383,6);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:383:6: (alt= post_alternate )?
            int alt9=2;
            try { dbg.enterSubRule(9);
            try { dbg.enterDecision(9);

            int LA9_0 = input.LA(1);

            if ( (LA9_0==VAR) ) {
                alt9=1;
            }
            } finally {dbg.exitDecision(9);}

            switch (alt9) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: alt= post_alternate
                    {
                    dbg.location(383,6);
                    pushFollow(FOLLOW_post_alternate_in_post_block1109);
                    alt=post_alternate();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, alt.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(9);}

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

        Token char_literal24=null;
        Token char_literal25=null;
        Token char_literal26=null;
        Token char_literal27=null;
        RuleSet2Parser.post_statement_return p = null;

        RuleSet2Parser.post_statement_return p1 = null;

        RuleSet2Parser.must_be_return must_be23 = null;


        Object char_literal24_tree=null;
        Object char_literal25_tree=null;
        Object char_literal26_tree=null;
        Object char_literal27_tree=null;


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
            pushFollow(FOLLOW_must_be_in_post_alternate1135);
            must_be23=must_be("else");

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, must_be23.getTree());
            dbg.location(402,19);
            char_literal24=(Token)match(input,29,FOLLOW_29_in_post_alternate1138); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal24_tree = (Object)adaptor.create(char_literal24);
            adaptor.addChild(root_0, char_literal24_tree);
            }
            dbg.location(402,23);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:402:23: (p= post_statement ( ';' p1= post_statement )* )?
            int alt11=2;
            try { dbg.enterSubRule(11);
            try { dbg.enterDecision(11);

            int LA11_0 = input.LA(1);

            if ( (LA11_0==VAR||LA11_0==39||(LA11_0>=41 && LA11_0<=43)||(LA11_0>=112 && LA11_0<=113)) ) {
                alt11=1;
            }
            } finally {dbg.exitDecision(11);}

            switch (alt11) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:402:24: p= post_statement ( ';' p1= post_statement )*
                    {
                    dbg.location(402,25);
                    pushFollow(FOLLOW_post_statement_in_post_alternate1143);
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
                    try { dbg.enterSubRule(10);

                    loop10:
                    do {
                        int alt10=2;
                        try { dbg.enterDecision(10);

                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==31) ) {
                            int LA10_1 = input.LA(2);

                            if ( (LA10_1==VAR||LA10_1==39||(LA10_1>=41 && LA10_1<=43)||(LA10_1>=112 && LA10_1<=113)) ) {
                                alt10=1;
                            }


                        }


                        } finally {dbg.exitDecision(10);}

                        switch (alt10) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:402:71: ';' p1= post_statement
                    	    {
                    	    dbg.location(402,71);
                    	    char_literal25=(Token)match(input,31,FOLLOW_31_in_post_alternate1148); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal25_tree = (Object)adaptor.create(char_literal25);
                    	    adaptor.addChild(root_0, char_literal25_tree);
                    	    }
                    	    dbg.location(402,77);
                    	    pushFollow(FOLLOW_post_statement_in_post_alternate1152);
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
                    	    break loop10;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(10);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(11);}

            dbg.location(402,127);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:402:127: ( ';' )?
            int alt12=2;
            try { dbg.enterSubRule(12);
            try { dbg.enterDecision(12);

            int LA12_0 = input.LA(1);

            if ( (LA12_0==31) ) {
                alt12=1;
            }
            } finally {dbg.exitDecision(12);}

            switch (alt12) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: ';'
                    {
                    dbg.location(402,127);
                    char_literal26=(Token)match(input,31,FOLLOW_31_in_post_alternate1160); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal26_tree = (Object)adaptor.create(char_literal26);
                    adaptor.addChild(root_0, char_literal26_tree);
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(12);}

            dbg.location(402,132);
            char_literal27=(Token)match(input,30,FOLLOW_30_in_post_alternate1163); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal27_tree = (Object)adaptor.create(char_literal27);
            adaptor.addChild(root_0, char_literal27_tree);
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

        Token string_literal28=null;
        RuleSet2Parser.persistent_expr_return pe = null;

        RuleSet2Parser.raise_statement_return rs = null;

        RuleSet2Parser.log_statement_return l = null;

        RuleSet2Parser.must_be_return las = null;

        RuleSet2Parser.expr_return ie = null;


        Object string_literal28_tree=null;

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
            int alt13=4;
            try { dbg.enterSubRule(13);
            try { dbg.enterDecision(13);

            int LA13_0 = input.LA(1);

            if ( (LA13_0==39||(LA13_0>=41 && LA13_0<=43)||(LA13_0>=112 && LA13_0<=113)) ) {
                alt13=1;
            }
            else if ( (LA13_0==VAR) ) {
                switch ( input.LA(2) ) {
                case INT:
                case FLOAT:
                case STRING:
                case REGEXP:
                case 29:
                case 50:
                case 61:
                case 75:
                case 82:
                case 106:
                case 107:
                case 108:
                case 110:
                case 111:
                case 112:
                case 113:
                    {
                    alt13=3;
                    }
                    break;
                case VAR:
                    {
                    int LA13_4 = input.LA(3);

                    if ( (LA13_4==EOF||(LA13_4>=18 && LA13_4<=28)||(LA13_4>=30 && LA13_4<=32)||LA13_4==40||(LA13_4>=49 && LA13_4<=50)||(LA13_4>=77 && LA13_4<=81)||(LA13_4>=84 && LA13_4<=105)||LA13_4==108) ) {
                        alt13=3;
                    }
                    else if ( (LA13_4==VAR) ) {
                        alt13=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 4, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case 30:
                case 31:
                case 32:
                    {
                    alt13=4;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }

            }
            else {
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

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:407:6: pe= persistent_expr
                    {
                    dbg.location(407,8);
                    pushFollow(FOLLOW_persistent_expr_in_post_statement1181);
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
                    pushFollow(FOLLOW_raise_statement_in_post_statement1191);
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
                    pushFollow(FOLLOW_log_statement_in_post_statement1198);
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
                    pushFollow(FOLLOW_must_be_in_post_statement1208);
                    las=must_be("last");

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, las.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(13);}

            dbg.location(411,2);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:411:2: ( 'if' ie= expr )?
            int alt14=2;
            try { dbg.enterSubRule(14);
            try { dbg.enterDecision(14);

            int LA14_0 = input.LA(1);

            if ( (LA14_0==32) ) {
                alt14=1;
            }
            } finally {dbg.exitDecision(14);}

            switch (alt14) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:411:3: 'if' ie= expr
                    {
                    dbg.location(411,3);
                    string_literal28=(Token)match(input,32,FOLLOW_32_in_post_statement1214); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal28_tree = (Object)adaptor.create(string_literal28);
                    adaptor.addChild(root_0, string_literal28_tree);
                    }
                    dbg.location(411,10);
                    pushFollow(FOLLOW_expr_in_post_statement1218);
                    ie=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ie.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(14);}


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

        RuleSet2Parser.must_be_return must_be29 = null;

        RuleSet2Parser.must_be_return must_be30 = null;

        RuleSet2Parser.must_be_return must_be31 = null;


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
            pushFollow(FOLLOW_must_be_in_raise_statement1243);
            must_be29=must_be("raise");

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, must_be29.getTree());
            dbg.location(439,19);
            pushFollow(FOLLOW_must_be_in_raise_statement1246);
            must_be30=must_be("explicit");

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, must_be30.getTree());
            dbg.location(439,39);
            pushFollow(FOLLOW_must_be_in_raise_statement1249);
            must_be31=must_be("event");

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, must_be31.getTree());
            dbg.location(439,60);
            evt=(Token)match(input,VAR,FOLLOW_VAR_in_raise_statement1255); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            evt_tree = (Object)adaptor.create(evt);
            adaptor.addChild(root_0, evt_tree);
            }
            dbg.location(439,66);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:439:66: (f= for_clause )?
            int alt15=2;
            try { dbg.enterSubRule(15);
            try { dbg.enterDecision(15);

            int LA15_0 = input.LA(1);

            if ( (LA15_0==47) ) {
                alt15=1;
            }
            } finally {dbg.exitDecision(15);}

            switch (alt15) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: f= for_clause
                    {
                    dbg.location(439,66);
                    pushFollow(FOLLOW_for_clause_in_raise_statement1259);
                    f=for_clause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, f.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(15);}

            dbg.location(439,80);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:439:80: (m= modifier_clause )?
            int alt16=2;
            try { dbg.enterSubRule(16);
            try { dbg.enterDecision(16);

            int LA16_0 = input.LA(1);

            if ( (LA16_0==44) ) {
                alt16=1;
            }
            } finally {dbg.exitDecision(16);}

            switch (alt16) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: m= modifier_clause
                    {
                    dbg.location(439,80);
                    pushFollow(FOLLOW_modifier_clause_in_raise_statement1264);
                    m=modifier_clause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, m.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(16);}

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

        RuleSet2Parser.must_be_return must_be32 = null;



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
            pushFollow(FOLLOW_must_be_in_log_statement1284);
            must_be32=must_be("log");

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, must_be32.getTree());
            dbg.location(456,19);
            pushFollow(FOLLOW_expr_in_log_statement1290);
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

        Token string_literal33=null;
        Token char_literal34=null;
        Token char_literal35=null;
        RuleSet2Parser.success_return s = null;

        RuleSet2Parser.failure_return f = null;


        Object string_literal33_tree=null;
        Object char_literal34_tree=null;
        Object char_literal35_tree=null;

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
            string_literal33=(Token)match(input,33,FOLLOW_33_in_callbacks1310); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal33_tree = (Object)adaptor.create(string_literal33);
            adaptor.addChild(root_0, string_literal33_tree);
            }
            dbg.location(467,14);
            char_literal34=(Token)match(input,29,FOLLOW_29_in_callbacks1312); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal34_tree = (Object)adaptor.create(char_literal34);
            adaptor.addChild(root_0, char_literal34_tree);
            }
            dbg.location(467,19);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:467:19: (s= success )?
            int alt17=2;
            try { dbg.enterSubRule(17);
            try { dbg.enterDecision(17);

            int LA17_0 = input.LA(1);

            if ( (LA17_0==34) ) {
                alt17=1;
            }
            } finally {dbg.exitDecision(17);}

            switch (alt17) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: s= success
                    {
                    dbg.location(467,19);
                    pushFollow(FOLLOW_success_in_callbacks1316);
                    s=success();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, s.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(17);}

            dbg.location(467,30);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:467:30: (f= failure )?
            int alt18=2;
            try { dbg.enterSubRule(18);
            try { dbg.enterDecision(18);

            int LA18_0 = input.LA(1);

            if ( (LA18_0==35) ) {
                alt18=1;
            }
            } finally {dbg.exitDecision(18);}

            switch (alt18) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: f= failure
                    {
                    dbg.location(467,30);
                    pushFollow(FOLLOW_failure_in_callbacks1321);
                    f=failure();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, f.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(18);}

            dbg.location(467,40);
            char_literal35=(Token)match(input,30,FOLLOW_30_in_callbacks1324); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal35_tree = (Object)adaptor.create(char_literal35);
            adaptor.addChild(root_0, char_literal35_tree);
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

        Token string_literal36=null;
        Token char_literal37=null;
        Token char_literal38=null;
        Token char_literal39=null;
        Token char_literal40=null;
        RuleSet2Parser.click_return c = null;

        RuleSet2Parser.click_return c1 = null;


        Object string_literal36_tree=null;
        Object char_literal37_tree=null;
        Object char_literal38_tree=null;
        Object char_literal39_tree=null;
        Object char_literal40_tree=null;


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
            string_literal36=(Token)match(input,34,FOLLOW_34_in_success1347); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal36_tree = (Object)adaptor.create(string_literal36);
            adaptor.addChild(root_0, string_literal36_tree);
            }
            dbg.location(486,14);
            char_literal37=(Token)match(input,29,FOLLOW_29_in_success1349); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal37_tree = (Object)adaptor.create(char_literal37);
            adaptor.addChild(root_0, char_literal37_tree);
            }
            dbg.location(486,19);
            pushFollow(FOLLOW_click_in_success1353);
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
            try { dbg.enterSubRule(19);

            loop19:
            do {
                int alt19=2;
                try { dbg.enterDecision(19);

                int LA19_0 = input.LA(1);

                if ( (LA19_0==31) ) {
                    int LA19_1 = input.LA(2);

                    if ( ((LA19_1>=36 && LA19_1<=37)) ) {
                        alt19=1;
                    }


                }


                } finally {dbg.exitDecision(19);}

                switch (alt19) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:486:55: ';' c1= click
            	    {
            	    dbg.location(486,55);
            	    char_literal38=(Token)match(input,31,FOLLOW_31_in_success1359); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal38_tree = (Object)adaptor.create(char_literal38);
            	    adaptor.addChild(root_0, char_literal38_tree);
            	    }
            	    dbg.location(486,61);
            	    pushFollow(FOLLOW_click_in_success1363);
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
            	    break loop19;
                }
            } while (true);
            } finally {dbg.exitSubRule(19);}

            dbg.location(486,99);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:486:99: ( ';' )?
            int alt20=2;
            try { dbg.enterSubRule(20);
            try { dbg.enterDecision(20);

            int LA20_0 = input.LA(1);

            if ( (LA20_0==31) ) {
                alt20=1;
            }
            } finally {dbg.exitDecision(20);}

            switch (alt20) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: ';'
                    {
                    dbg.location(486,99);
                    char_literal39=(Token)match(input,31,FOLLOW_31_in_success1370); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal39_tree = (Object)adaptor.create(char_literal39);
                    adaptor.addChild(root_0, char_literal39_tree);
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(20);}

            dbg.location(486,105);
            char_literal40=(Token)match(input,30,FOLLOW_30_in_success1374); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal40_tree = (Object)adaptor.create(char_literal40);
            adaptor.addChild(root_0, char_literal40_tree);
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

        Token string_literal41=null;
        Token char_literal42=null;
        Token char_literal43=null;
        Token char_literal44=null;
        Token char_literal45=null;
        RuleSet2Parser.click_return c = null;

        RuleSet2Parser.click_return c1 = null;


        Object string_literal41_tree=null;
        Object char_literal42_tree=null;
        Object char_literal43_tree=null;
        Object char_literal44_tree=null;
        Object char_literal45_tree=null;


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
            string_literal41=(Token)match(input,35,FOLLOW_35_in_failure1400); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal41_tree = (Object)adaptor.create(string_literal41);
            adaptor.addChild(root_0, string_literal41_tree);
            }
            dbg.location(496,12);
            char_literal42=(Token)match(input,29,FOLLOW_29_in_failure1402); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal42_tree = (Object)adaptor.create(char_literal42);
            adaptor.addChild(root_0, char_literal42_tree);
            }
            dbg.location(496,17);
            pushFollow(FOLLOW_click_in_failure1406);
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
            try { dbg.enterSubRule(21);

            loop21:
            do {
                int alt21=2;
                try { dbg.enterDecision(21);

                int LA21_0 = input.LA(1);

                if ( (LA21_0==31) ) {
                    int LA21_1 = input.LA(2);

                    if ( ((LA21_1>=36 && LA21_1<=37)) ) {
                        alt21=1;
                    }


                }


                } finally {dbg.exitDecision(21);}

                switch (alt21) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:496:53: ';' c1= click
            	    {
            	    dbg.location(496,53);
            	    char_literal43=(Token)match(input,31,FOLLOW_31_in_failure1412); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal43_tree = (Object)adaptor.create(char_literal43);
            	    adaptor.addChild(root_0, char_literal43_tree);
            	    }
            	    dbg.location(496,59);
            	    pushFollow(FOLLOW_click_in_failure1416);
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
            	    break loop21;
                }
            } while (true);
            } finally {dbg.exitSubRule(21);}

            dbg.location(496,98);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:496:98: ( ';' )?
            int alt22=2;
            try { dbg.enterSubRule(22);
            try { dbg.enterDecision(22);

            int LA22_0 = input.LA(1);

            if ( (LA22_0==31) ) {
                alt22=1;
            }
            } finally {dbg.exitDecision(22);}

            switch (alt22) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: ';'
                    {
                    dbg.location(496,98);
                    char_literal44=(Token)match(input,31,FOLLOW_31_in_failure1424); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal44_tree = (Object)adaptor.create(char_literal44);
                    adaptor.addChild(root_0, char_literal44_tree);
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(22);}

            dbg.location(496,104);
            char_literal45=(Token)match(input,30,FOLLOW_30_in_failure1428); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal45_tree = (Object)adaptor.create(char_literal45);
            adaptor.addChild(root_0, char_literal45_tree);
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
        Token char_literal46=null;
        RuleSet2Parser.click_link_return cl = null;


        Object corc_tree=null;
        Object attr_tree=null;
        Object val_tree=null;
        Object char_literal46_tree=null;

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
            attr=(Token)match(input,VAR,FOLLOW_VAR_in_click1456); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            attr_tree = (Object)adaptor.create(attr);
            adaptor.addChild(root_0, attr_tree);
            }
            dbg.location(502,37);
            char_literal46=(Token)match(input,38,FOLLOW_38_in_click1458); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal46_tree = (Object)adaptor.create(char_literal46);
            adaptor.addChild(root_0, char_literal46_tree);
            }
            dbg.location(502,44);
            val=(Token)match(input,STRING,FOLLOW_STRING_in_click1462); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            val_tree = (Object)adaptor.create(val);
            adaptor.addChild(root_0, val_tree);
            }
            dbg.location(502,54);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:502:54: (cl= click_link )?
            int alt23=2;
            try { dbg.enterSubRule(23);
            try { dbg.enterDecision(23);

            int LA23_0 = input.LA(1);

            if ( (LA23_0==VAR) ) {
                alt23=1;
            }
            } finally {dbg.exitDecision(23);}

            switch (alt23) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: cl= click_link
                    {
                    dbg.location(502,54);
                    pushFollow(FOLLOW_click_link_in_click1466);
                    cl=click_link();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, cl.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(23);}

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

        RuleSet2Parser.must_be_return must_be47 = null;



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
            pushFollow(FOLLOW_must_be_in_click_link1486);
            must_be47=must_be("triggers");

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, must_be47.getTree());
            dbg.location(514,23);
            pushFollow(FOLLOW_persistent_expr_in_click_link1491);
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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:520:1: persistent_expr returns [HashMap result] : (pc= persistent_clear | ps= persistent_set | pi= persistent_iterate | tf= trail_forget | tm= trail_mark );
    public final RuleSet2Parser.persistent_expr_return persistent_expr() throws RecognitionException {
        RuleSet2Parser.persistent_expr_return retval = new RuleSet2Parser.persistent_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RuleSet2Parser.persistent_clear_return pc = null;

        RuleSet2Parser.persistent_set_return ps = null;

        RuleSet2Parser.persistent_iterate_return pi = null;

        RuleSet2Parser.trail_forget_return tf = null;

        RuleSet2Parser.trail_mark_return tm = null;



        try { dbg.enterRule(getGrammarFileName(), "persistent_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(520, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:521:2: (pc= persistent_clear | ps= persistent_set | pi= persistent_iterate | tf= trail_forget | tm= trail_mark )
            int alt24=5;
            try { dbg.enterDecision(24);

            switch ( input.LA(1) ) {
            case 39:
                {
                alt24=1;
                }
                break;
            case 41:
                {
                alt24=2;
                }
                break;
            case 112:
            case 113:
                {
                alt24=3;
                }
                break;
            case 42:
                {
                alt24=4;
                }
                break;
            case 43:
                {
                alt24=5;
                }
                break;
            default:
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

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:522:2: pc= persistent_clear
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(522,4);
                    pushFollow(FOLLOW_persistent_clear_in_persistent_expr1513);
                    pc=persistent_clear();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pc.getTree());
                    dbg.location(522,23);
                    if ( state.backtracking==0 ) {

                      		retval.result = (pc!=null?pc.result:null);
                      	
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:525:4: ps= persistent_set
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(525,6);
                    pushFollow(FOLLOW_persistent_set_in_persistent_expr1523);
                    ps=persistent_set();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ps.getTree());
                    dbg.location(525,23);
                    if ( state.backtracking==0 ) {

                      		retval.result = (ps!=null?ps.result:null);
                      	
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:528:4: pi= persistent_iterate
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(528,6);
                    pushFollow(FOLLOW_persistent_iterate_in_persistent_expr1533);
                    pi=persistent_iterate();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pi.getTree());
                    dbg.location(528,27);
                    if ( state.backtracking==0 ) {

                      		retval.result = (pi!=null?pi.result:null);
                      	
                    }

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:531:7: tf= trail_forget
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(531,9);
                    pushFollow(FOLLOW_trail_forget_in_persistent_expr1546);
                    tf=trail_forget();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, tf.getTree());
                    dbg.location(531,24);
                    if ( state.backtracking==0 ) {

                      		retval.result = (tf!=null?tf.result:null);
                      	
                    }

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:534:7: tm= trail_mark
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(534,9);
                    pushFollow(FOLLOW_trail_mark_in_persistent_expr1559);
                    tm=trail_mark();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, tm.getTree());
                    dbg.location(534,22);
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
        dbg.location(537, 5);

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
        public HashMap result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "persistent_clear"
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:540:1: persistent_clear returns [HashMap result] : 'clear' dm= var_domain ':' name= VAR ;
    public final RuleSet2Parser.persistent_clear_return persistent_clear() throws RecognitionException {
        RuleSet2Parser.persistent_clear_return retval = new RuleSet2Parser.persistent_clear_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token name=null;
        Token string_literal48=null;
        Token char_literal49=null;
        RuleSet2Parser.var_domain_return dm = null;


        Object name_tree=null;
        Object string_literal48_tree=null;
        Object char_literal49_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "persistent_clear");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(540, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:541:2: ( 'clear' dm= var_domain ':' name= VAR )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:542:2: 'clear' dm= var_domain ':' name= VAR
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(542,2);
            string_literal48=(Token)match(input,39,FOLLOW_39_in_persistent_clear1582); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal48_tree = (Object)adaptor.create(string_literal48);
            adaptor.addChild(root_0, string_literal48_tree);
            }
            dbg.location(542,13);
            pushFollow(FOLLOW_var_domain_in_persistent_clear1587);
            dm=var_domain();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, dm.getTree());
            dbg.location(542,25);
            char_literal49=(Token)match(input,40,FOLLOW_40_in_persistent_clear1589); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal49_tree = (Object)adaptor.create(char_literal49);
            adaptor.addChild(root_0, char_literal49_tree);
            }
            dbg.location(542,33);
            name=(Token)match(input,VAR,FOLLOW_VAR_in_persistent_clear1593); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            name_tree = (Object)adaptor.create(name);
            adaptor.addChild(root_0, name_tree);
            }
            dbg.location(542,38);
            if ( state.backtracking==0 ) {

              		HashMap tmp = new HashMap();
              		tmp.put("action","clear");
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
        dbg.location(550, 2);

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
        public HashMap result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "persistent_set"
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:552:1: persistent_set returns [HashMap result] : 'set' dm= var_domain ':' name= VAR ;
    public final RuleSet2Parser.persistent_set_return persistent_set() throws RecognitionException {
        RuleSet2Parser.persistent_set_return retval = new RuleSet2Parser.persistent_set_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token name=null;
        Token string_literal50=null;
        Token char_literal51=null;
        RuleSet2Parser.var_domain_return dm = null;


        Object name_tree=null;
        Object string_literal50_tree=null;
        Object char_literal51_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "persistent_set");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(552, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:553:2: ( 'set' dm= var_domain ':' name= VAR )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:554:2: 'set' dm= var_domain ':' name= VAR
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(554,2);
            string_literal50=(Token)match(input,41,FOLLOW_41_in_persistent_set1611); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal50_tree = (Object)adaptor.create(string_literal50);
            adaptor.addChild(root_0, string_literal50_tree);
            }
            dbg.location(554,11);
            pushFollow(FOLLOW_var_domain_in_persistent_set1616);
            dm=var_domain();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, dm.getTree());
            dbg.location(554,23);
            char_literal51=(Token)match(input,40,FOLLOW_40_in_persistent_set1618); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal51_tree = (Object)adaptor.create(char_literal51);
            adaptor.addChild(root_0, char_literal51_tree);
            }
            dbg.location(554,31);
            name=(Token)match(input,VAR,FOLLOW_VAR_in_persistent_set1622); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            name_tree = (Object)adaptor.create(name);
            adaptor.addChild(root_0, name_tree);
            }
            dbg.location(554,36);
            if ( state.backtracking==0 ) {

              		HashMap tmp = new HashMap();
              		tmp.put("action","set");
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
        dbg.location(562, 2);

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
        public HashMap result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "persistent_iterate"
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:564:1: persistent_iterate returns [HashMap result] : dm= var_domain ':' name= VAR op= counter_op v= expr from= counter_start ;
    public final RuleSet2Parser.persistent_iterate_return persistent_iterate() throws RecognitionException {
        RuleSet2Parser.persistent_iterate_return retval = new RuleSet2Parser.persistent_iterate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token name=null;
        Token char_literal52=null;
        RuleSet2Parser.var_domain_return dm = null;

        RuleSet2Parser.counter_op_return op = null;

        RuleSet2Parser.expr_return v = null;

        RuleSet2Parser.counter_start_return from = null;


        Object name_tree=null;
        Object char_literal52_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "persistent_iterate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(564, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:565:2: (dm= var_domain ':' name= VAR op= counter_op v= expr from= counter_start )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:566:2: dm= var_domain ':' name= VAR op= counter_op v= expr from= counter_start
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(566,4);
            pushFollow(FOLLOW_var_domain_in_persistent_iterate1642);
            dm=var_domain();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, dm.getTree());
            dbg.location(566,16);
            char_literal52=(Token)match(input,40,FOLLOW_40_in_persistent_iterate1644); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal52_tree = (Object)adaptor.create(char_literal52);
            adaptor.addChild(root_0, char_literal52_tree);
            }
            dbg.location(566,24);
            name=(Token)match(input,VAR,FOLLOW_VAR_in_persistent_iterate1648); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            name_tree = (Object)adaptor.create(name);
            adaptor.addChild(root_0, name_tree);
            }
            dbg.location(566,31);
            pushFollow(FOLLOW_counter_op_in_persistent_iterate1652);
            op=counter_op();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, op.getTree());
            dbg.location(566,44);
            pushFollow(FOLLOW_expr_in_persistent_iterate1656);
            v=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, v.getTree());
            dbg.location(566,54);
            pushFollow(FOLLOW_counter_start_in_persistent_iterate1660);
            from=counter_start();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, from.getTree());
            dbg.location(566,69);
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
        dbg.location(577, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:579:1: trail_forget returns [HashMap result] : 'forget' what= STRING must_be[\"in\"] dm= var_domain ':' name= VAR ;
    public final RuleSet2Parser.trail_forget_return trail_forget() throws RecognitionException {
        RuleSet2Parser.trail_forget_return retval = new RuleSet2Parser.trail_forget_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token what=null;
        Token name=null;
        Token string_literal53=null;
        Token char_literal55=null;
        RuleSet2Parser.var_domain_return dm = null;

        RuleSet2Parser.must_be_return must_be54 = null;


        Object what_tree=null;
        Object name_tree=null;
        Object string_literal53_tree=null;
        Object char_literal55_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "trail_forget");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(579, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:580:2: ( 'forget' what= STRING must_be[\"in\"] dm= var_domain ':' name= VAR )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:581:2: 'forget' what= STRING must_be[\"in\"] dm= var_domain ':' name= VAR
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(581,2);
            string_literal53=(Token)match(input,42,FOLLOW_42_in_trail_forget1678); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal53_tree = (Object)adaptor.create(string_literal53);
            adaptor.addChild(root_0, string_literal53_tree);
            }
            dbg.location(581,16);
            what=(Token)match(input,STRING,FOLLOW_STRING_in_trail_forget1683); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            what_tree = (Object)adaptor.create(what);
            adaptor.addChild(root_0, what_tree);
            }
            dbg.location(581,24);
            pushFollow(FOLLOW_must_be_in_trail_forget1685);
            must_be54=must_be("in");

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, must_be54.getTree());
            dbg.location(581,41);
            pushFollow(FOLLOW_var_domain_in_trail_forget1691);
            dm=var_domain();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, dm.getTree());
            dbg.location(581,53);
            char_literal55=(Token)match(input,40,FOLLOW_40_in_trail_forget1693); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal55_tree = (Object)adaptor.create(char_literal55);
            adaptor.addChild(root_0, char_literal55_tree);
            }
            dbg.location(581,61);
            name=(Token)match(input,VAR,FOLLOW_VAR_in_trail_forget1697); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            name_tree = (Object)adaptor.create(name);
            adaptor.addChild(root_0, name_tree);
            }
            dbg.location(581,67);
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
        dbg.location(591, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:593:1: trail_mark returns [HashMap result] : 'mark' dm= var_domain ':' name= VAR (t= trail_with )? ;
    public final RuleSet2Parser.trail_mark_return trail_mark() throws RecognitionException {
        RuleSet2Parser.trail_mark_return retval = new RuleSet2Parser.trail_mark_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token name=null;
        Token string_literal56=null;
        Token char_literal57=null;
        RuleSet2Parser.var_domain_return dm = null;

        RuleSet2Parser.trail_with_return t = null;


        Object name_tree=null;
        Object string_literal56_tree=null;
        Object char_literal57_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "trail_mark");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(593, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:594:2: ( 'mark' dm= var_domain ':' name= VAR (t= trail_with )? )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:595:2: 'mark' dm= var_domain ':' name= VAR (t= trail_with )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(595,2);
            string_literal56=(Token)match(input,43,FOLLOW_43_in_trail_mark1716); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal56_tree = (Object)adaptor.create(string_literal56);
            adaptor.addChild(root_0, string_literal56_tree);
            }
            dbg.location(595,11);
            pushFollow(FOLLOW_var_domain_in_trail_mark1720);
            dm=var_domain();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, dm.getTree());
            dbg.location(595,23);
            char_literal57=(Token)match(input,40,FOLLOW_40_in_trail_mark1722); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal57_tree = (Object)adaptor.create(char_literal57);
            adaptor.addChild(root_0, char_literal57_tree);
            }
            dbg.location(595,31);
            name=(Token)match(input,VAR,FOLLOW_VAR_in_trail_mark1726); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            name_tree = (Object)adaptor.create(name);
            adaptor.addChild(root_0, name_tree);
            }
            dbg.location(595,37);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:595:37: (t= trail_with )?
            int alt25=2;
            try { dbg.enterSubRule(25);
            try { dbg.enterDecision(25);

            int LA25_0 = input.LA(1);

            if ( (LA25_0==44) ) {
                alt25=1;
            }
            } finally {dbg.exitDecision(25);}

            switch (alt25) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: t= trail_with
                    {
                    dbg.location(595,37);
                    pushFollow(FOLLOW_trail_with_in_trail_mark1730);
                    t=trail_with();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, t.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(25);}

            dbg.location(595,50);
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
        dbg.location(605, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:607:1: trail_with returns [Object result] : 'with' e= expr ;
    public final RuleSet2Parser.trail_with_return trail_with() throws RecognitionException {
        RuleSet2Parser.trail_with_return retval = new RuleSet2Parser.trail_with_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal58=null;
        RuleSet2Parser.expr_return e = null;


        Object string_literal58_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "trail_with");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(607, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:608:2: ( 'with' e= expr )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:609:2: 'with' e= expr
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(609,2);
            string_literal58=(Token)match(input,44,FOLLOW_44_in_trail_with1749); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal58_tree = (Object)adaptor.create(string_literal58);
            adaptor.addChild(root_0, string_literal58_tree);
            }
            dbg.location(609,10);
            pushFollow(FOLLOW_expr_in_trail_with1753);
            e=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
            dbg.location(609,16);
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
        dbg.location(612, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:614:1: counter_op : ( '+=' | '-=' );
    public final RuleSet2Parser.counter_op_return counter_op() throws RecognitionException {
        RuleSet2Parser.counter_op_return retval = new RuleSet2Parser.counter_op_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set59=null;

        Object set59_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "counter_op");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(614, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:615:2: ( '+=' | '-=' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(615,2);
            set59=(Token)input.LT(1);
            if ( (input.LA(1)>=45 && input.LA(1)<=46) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set59));
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
        dbg.location(618, 9);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:620:1: counter_start returns [Object result] : must_be[\"from\"] e= expr ;
    public final RuleSet2Parser.counter_start_return counter_start() throws RecognitionException {
        RuleSet2Parser.counter_start_return retval = new RuleSet2Parser.counter_start_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RuleSet2Parser.expr_return e = null;

        RuleSet2Parser.must_be_return must_be60 = null;



        try { dbg.enterRule(getGrammarFileName(), "counter_start");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(620, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:621:2: ( must_be[\"from\"] e= expr )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:622:2: must_be[\"from\"] e= expr
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(622,2);
            pushFollow(FOLLOW_must_be_in_counter_start1803);
            must_be60=must_be("from");

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, must_be60.getTree());
            dbg.location(622,19);
            pushFollow(FOLLOW_expr_in_counter_start1808);
            e=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
            dbg.location(622,25);
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
        dbg.location(625, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:628:1: for_clause returns [String result] : 'for' v= VAR ;
    public final RuleSet2Parser.for_clause_return for_clause() throws RecognitionException {
        RuleSet2Parser.for_clause_return retval = new RuleSet2Parser.for_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token v=null;
        Token string_literal61=null;

        Object v_tree=null;
        Object string_literal61_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "for_clause");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(628, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:629:2: ( 'for' v= VAR )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:630:2: 'for' v= VAR
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(630,2);
            string_literal61=(Token)match(input,47,FOLLOW_47_in_for_clause1829); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal61_tree = (Object)adaptor.create(string_literal61);
            adaptor.addChild(root_0, string_literal61_tree);
            }
            dbg.location(630,10);
            v=(Token)match(input,VAR,FOLLOW_VAR_in_for_clause1834); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            v_tree = (Object)adaptor.create(v);
            adaptor.addChild(root_0, v_tree);
            }
            dbg.location(631,2);
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
        dbg.location(634, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:644:1: action[HashMap result] : ( conditional_action[result] | unconditional_action[result] ) ( ';' )? ;
    public final RuleSet2Parser.action_return action(HashMap result) throws RecognitionException {
        RuleSet2Parser.action_return retval = new RuleSet2Parser.action_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal64=null;
        RuleSet2Parser.conditional_action_return conditional_action62 = null;

        RuleSet2Parser.unconditional_action_return unconditional_action63 = null;


        Object char_literal64_tree=null;


        	result.put("blocktype","every");
        	HashMap condt = new HashMap();
        	condt.put("val","true");
        	condt.put("type","bool");
        	result.put("cond",condt);
        	result.put("actions",new ArrayList());

        try { dbg.enterRule(getGrammarFileName(), "action");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(644, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:653:2: ( ( conditional_action[result] | unconditional_action[result] ) ( ';' )? )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:654:2: ( conditional_action[result] | unconditional_action[result] ) ( ';' )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(654,2);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:654:2: ( conditional_action[result] | unconditional_action[result] )
            int alt26=2;
            try { dbg.enterSubRule(26);
            try { dbg.enterDecision(26);

            int LA26_0 = input.LA(1);

            if ( (LA26_0==32) ) {
                alt26=1;
            }
            else if ( (LA26_0==VAR||LA26_0==29||LA26_0==117) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(26);}

            switch (alt26) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:654:3: conditional_action[result]
                    {
                    dbg.location(654,3);
                    pushFollow(FOLLOW_conditional_action_in_action1868);
                    conditional_action62=conditional_action(result);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditional_action62.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:654:32: unconditional_action[result]
                    {
                    dbg.location(654,32);
                    pushFollow(FOLLOW_unconditional_action_in_action1873);
                    unconditional_action63=unconditional_action(result);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unconditional_action63.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(26);}

            dbg.location(654,62);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:654:62: ( ';' )?
            int alt27=2;
            try { dbg.enterSubRule(27);
            try { dbg.enterDecision(27);

            int LA27_0 = input.LA(1);

            if ( (LA27_0==31) ) {
                alt27=1;
            }
            } finally {dbg.exitDecision(27);}

            switch (alt27) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: ';'
                    {
                    dbg.location(654,62);
                    char_literal64=(Token)match(input,31,FOLLOW_31_in_action1877); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal64_tree = (Object)adaptor.create(char_literal64);
                    adaptor.addChild(root_0, char_literal64_tree);
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(27);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(655, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:658:1: conditional_action[HashMap result] : 'if' e= expr 'then' unconditional_action[result] ;
    public final RuleSet2Parser.conditional_action_return conditional_action(HashMap result) throws RecognitionException {
        RuleSet2Parser.conditional_action_return retval = new RuleSet2Parser.conditional_action_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal65=null;
        Token string_literal66=null;
        RuleSet2Parser.expr_return e = null;

        RuleSet2Parser.unconditional_action_return unconditional_action67 = null;


        Object string_literal65_tree=null;
        Object string_literal66_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "conditional_action");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(658, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:659:2: ( 'if' e= expr 'then' unconditional_action[result] )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:659:4: 'if' e= expr 'then' unconditional_action[result]
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(659,4);
            string_literal65=(Token)match(input,32,FOLLOW_32_in_conditional_action1894); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal65_tree = (Object)adaptor.create(string_literal65);
            adaptor.addChild(root_0, string_literal65_tree);
            }
            dbg.location(659,10);
            pushFollow(FOLLOW_expr_in_conditional_action1898);
            e=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
            dbg.location(659,16);
            string_literal66=(Token)match(input,48,FOLLOW_48_in_conditional_action1900); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal66_tree = (Object)adaptor.create(string_literal66);
            adaptor.addChild(root_0, string_literal66_tree);
            }
            dbg.location(659,23);
            pushFollow(FOLLOW_unconditional_action_in_conditional_action1902);
            unconditional_action67=unconditional_action(result);

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unconditional_action67.getTree());
            dbg.location(659,53);
            if ( state.backtracking==0 ) {

              		result.put("cond",(e!=null?e.result:null));	
              	
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(662, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:664:1: unconditional_action[HashMap result] : (p= primrule | action_block[result] );
    public final RuleSet2Parser.unconditional_action_return unconditional_action(HashMap result) throws RecognitionException {
        RuleSet2Parser.unconditional_action_return retval = new RuleSet2Parser.unconditional_action_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RuleSet2Parser.primrule_return p = null;

        RuleSet2Parser.action_block_return action_block68 = null;



         
        	ArrayList temp_list = new ArrayList(); 

        try { dbg.enterRule(getGrammarFileName(), "unconditional_action");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(664, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:668:2: (p= primrule | action_block[result] )
            int alt28=2;
            try { dbg.enterDecision(28);

            switch ( input.LA(1) ) {
            case VAR:
                {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==40||(LA28_1>=49 && LA28_1<=50)) ) {
                    alt28=1;
                }
                else if ( (LA28_1==29) ) {
                    alt28=2;
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
            case 117:
                {
                alt28=1;
                }
                break;
            case 29:
                {
                alt28=2;
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

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:668:4: p= primrule
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(668,5);
                    pushFollow(FOLLOW_primrule_in_unconditional_action1927);
                    p=primrule();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p.getTree());
                    dbg.location(668,15);
                    if ( state.backtracking==0 ) {
                      temp_list.add((p!=null?p.result:null)); result.put("actions",temp_list);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:669:6: action_block[result]
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(669,6);
                    pushFollow(FOLLOW_action_block_in_unconditional_action1937);
                    action_block68=action_block(result);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, action_block68.getTree());

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
        dbg.location(670, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:672:1: action_block[HashMap result] : (at= must_be_one[sar(\"choose\",\"every\")] )? '{' (p= primrule ( ';' p= primrule )* ) ( ';' )? '}' ;
    public final RuleSet2Parser.action_block_return action_block(HashMap result) throws RecognitionException {
        RuleSet2Parser.action_block_return retval = new RuleSet2Parser.action_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal69=null;
        Token char_literal70=null;
        Token char_literal71=null;
        Token char_literal72=null;
        RuleSet2Parser.must_be_one_return at = null;

        RuleSet2Parser.primrule_return p = null;


        Object char_literal69_tree=null;
        Object char_literal70_tree=null;
        Object char_literal71_tree=null;
        Object char_literal72_tree=null;

         
        	ArrayList temp_list = new ArrayList(); 

        try { dbg.enterRule(getGrammarFileName(), "action_block");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(672, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:676:2: ( (at= must_be_one[sar(\"choose\",\"every\")] )? '{' (p= primrule ( ';' p= primrule )* ) ( ';' )? '}' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:676:4: (at= must_be_one[sar(\"choose\",\"every\")] )? '{' (p= primrule ( ';' p= primrule )* ) ( ';' )? '}'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(676,6);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:676:6: (at= must_be_one[sar(\"choose\",\"every\")] )?
            int alt29=2;
            try { dbg.enterSubRule(29);
            try { dbg.enterDecision(29);

            int LA29_0 = input.LA(1);

            if ( (LA29_0==VAR) ) {
                alt29=1;
            }
            } finally {dbg.exitDecision(29);}

            switch (alt29) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: at= must_be_one[sar(\"choose\",\"every\")]
                    {
                    dbg.location(676,6);
                    pushFollow(FOLLOW_must_be_one_in_action_block1963);
                    at=must_be_one(sar("choose","every"));

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, at.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(29);}

            dbg.location(676,43);
            if ( state.backtracking==0 ) {
              result.put("blocktype",(at!=null?input.toString(at.start,at.stop):null)); 
            }
            dbg.location(677,3);
            char_literal69=(Token)match(input,29,FOLLOW_29_in_action_block1973); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal69_tree = (Object)adaptor.create(char_literal69);
            adaptor.addChild(root_0, char_literal69_tree);
            }
            dbg.location(677,7);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:677:7: (p= primrule ( ';' p= primrule )* )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:677:8: p= primrule ( ';' p= primrule )*
            {
            dbg.location(677,9);
            pushFollow(FOLLOW_primrule_in_action_block1978);
            p=primrule();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p.getTree());
            dbg.location(677,19);
            if ( state.backtracking==0 ) {
              temp_list.add((p!=null?p.result:null));
            }
            dbg.location(678,4);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:678:4: ( ';' p= primrule )*
            try { dbg.enterSubRule(30);

            loop30:
            do {
                int alt30=2;
                try { dbg.enterDecision(30);

                int LA30_0 = input.LA(1);

                if ( (LA30_0==31) ) {
                    int LA30_1 = input.LA(2);

                    if ( (LA30_1==VAR||LA30_1==117) ) {
                        alt30=1;
                    }


                }


                } finally {dbg.exitDecision(30);}

                switch (alt30) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:678:5: ';' p= primrule
            	    {
            	    dbg.location(678,5);
            	    char_literal70=(Token)match(input,31,FOLLOW_31_in_action_block1988); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal70_tree = (Object)adaptor.create(char_literal70);
            	    adaptor.addChild(root_0, char_literal70_tree);
            	    }
            	    dbg.location(678,10);
            	    pushFollow(FOLLOW_primrule_in_action_block1992);
            	    p=primrule();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p.getTree());
            	    dbg.location(678,19);
            	    if ( state.backtracking==0 ) {
            	      temp_list.add((p!=null?p.result:null));
            	    }

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);
            } finally {dbg.exitSubRule(30);}


            }

            dbg.location(678,51);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:678:51: ( ';' )?
            int alt31=2;
            try { dbg.enterSubRule(31);
            try { dbg.enterDecision(31);

            int LA31_0 = input.LA(1);

            if ( (LA31_0==31) ) {
                alt31=1;
            }
            } finally {dbg.exitDecision(31);}

            switch (alt31) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: ';'
                    {
                    dbg.location(678,51);
                    char_literal71=(Token)match(input,31,FOLLOW_31_in_action_block1999); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal71_tree = (Object)adaptor.create(char_literal71);
                    adaptor.addChild(root_0, char_literal71_tree);
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(31);}

            dbg.location(678,56);
            char_literal72=(Token)match(input,30,FOLLOW_30_in_action_block2002); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal72_tree = (Object)adaptor.create(char_literal72);
            adaptor.addChild(root_0, char_literal72_tree);
            }
            dbg.location(678,60);
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
        dbg.location(681, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:683:1: primrule returns [HashMap result] : (label= VAR '=>' )? ( (src= namespace )? name= VAR '(' (ex= expr ( ',' ex1= expr )* )? ( ',' )? ')' (m= modifier_clause )? | e= emit_block ) ;
    public final RuleSet2Parser.primrule_return primrule() throws RecognitionException {
        RuleSet2Parser.primrule_return retval = new RuleSet2Parser.primrule_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token label=null;
        Token name=null;
        Token string_literal73=null;
        Token char_literal74=null;
        Token char_literal75=null;
        Token char_literal76=null;
        Token char_literal77=null;
        RuleSet2Parser.namespace_return src = null;

        RuleSet2Parser.expr_return ex = null;

        RuleSet2Parser.expr_return ex1 = null;

        RuleSet2Parser.modifier_clause_return m = null;

        RuleSet2Parser.emit_block_return e = null;


        Object label_tree=null;
        Object name_tree=null;
        Object string_literal73_tree=null;
        Object char_literal74_tree=null;
        Object char_literal75_tree=null;
        Object char_literal76_tree=null;
        Object char_literal77_tree=null;


        	ArrayList temp_list = new ArrayList();

        try { dbg.enterRule(getGrammarFileName(), "primrule");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(683, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:687:2: ( (label= VAR '=>' )? ( (src= namespace )? name= VAR '(' (ex= expr ( ',' ex1= expr )* )? ( ',' )? ')' (m= modifier_clause )? | e= emit_block ) )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:687:5: (label= VAR '=>' )? ( (src= namespace )? name= VAR '(' (ex= expr ( ',' ex1= expr )* )? ( ',' )? ')' (m= modifier_clause )? | e= emit_block )
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(687,5);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:687:5: (label= VAR '=>' )?
            int alt32=2;
            try { dbg.enterSubRule(32);
            try { dbg.enterDecision(32);

            int LA32_0 = input.LA(1);

            if ( (LA32_0==VAR) ) {
                int LA32_1 = input.LA(2);

                if ( (LA32_1==49) ) {
                    alt32=1;
                }
            }
            } finally {dbg.exitDecision(32);}

            switch (alt32) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:687:6: label= VAR '=>'
                    {
                    dbg.location(687,11);
                    label=(Token)match(input,VAR,FOLLOW_VAR_in_primrule2029); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    label_tree = (Object)adaptor.create(label);
                    adaptor.addChild(root_0, label_tree);
                    }
                    dbg.location(687,16);
                    string_literal73=(Token)match(input,49,FOLLOW_49_in_primrule2031); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal73_tree = (Object)adaptor.create(string_literal73);
                    adaptor.addChild(root_0, string_literal73_tree);
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(32);}

            dbg.location(687,23);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:687:23: ( (src= namespace )? name= VAR '(' (ex= expr ( ',' ex1= expr )* )? ( ',' )? ')' (m= modifier_clause )? | e= emit_block )
            int alt38=2;
            try { dbg.enterSubRule(38);
            try { dbg.enterDecision(38);

            int LA38_0 = input.LA(1);

            if ( (LA38_0==VAR) ) {
                alt38=1;
            }
            else if ( (LA38_0==117) ) {
                alt38=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(38);}

            switch (alt38) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:688:4: (src= namespace )? name= VAR '(' (ex= expr ( ',' ex1= expr )* )? ( ',' )? ')' (m= modifier_clause )?
                    {
                    dbg.location(688,7);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:688:7: (src= namespace )?
                    int alt33=2;
                    try { dbg.enterSubRule(33);
                    try { dbg.enterDecision(33);

                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==VAR) ) {
                        int LA33_1 = input.LA(2);

                        if ( (LA33_1==40) ) {
                            alt33=1;
                        }
                    }
                    } finally {dbg.exitDecision(33);}

                    switch (alt33) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: src= namespace
                            {
                            dbg.location(688,7);
                            pushFollow(FOLLOW_namespace_in_primrule2042);
                            src=namespace();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, src.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(33);}

                    dbg.location(688,23);
                    name=(Token)match(input,VAR,FOLLOW_VAR_in_primrule2047); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    name_tree = (Object)adaptor.create(name);
                    adaptor.addChild(root_0, name_tree);
                    }
                    dbg.location(688,28);
                    char_literal74=(Token)match(input,50,FOLLOW_50_in_primrule2049); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal74_tree = (Object)adaptor.create(char_literal74);
                    adaptor.addChild(root_0, char_literal74_tree);
                    }
                    dbg.location(688,32);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:688:32: (ex= expr ( ',' ex1= expr )* )?
                    int alt35=2;
                    try { dbg.enterSubRule(35);
                    try { dbg.enterDecision(35);

                    int LA35_0 = input.LA(1);

                    if ( ((LA35_0>=VAR && LA35_0<=INT)||LA35_0==FLOAT||(LA35_0>=STRING && LA35_0<=REGEXP)||LA35_0==29||LA35_0==50||LA35_0==61||LA35_0==75||LA35_0==82||(LA35_0>=106 && LA35_0<=108)||(LA35_0>=110 && LA35_0<=113)) ) {
                        alt35=1;
                    }
                    } finally {dbg.exitDecision(35);}

                    switch (alt35) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:688:33: ex= expr ( ',' ex1= expr )*
                            {
                            dbg.location(688,35);
                            pushFollow(FOLLOW_expr_in_primrule2054);
                            ex=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, ex.getTree());
                            dbg.location(688,40);
                            if ( state.backtracking==0 ) {
                              temp_list.add((ex!=null?ex.result:null));
                            }
                            dbg.location(688,70);
                            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:688:70: ( ',' ex1= expr )*
                            try { dbg.enterSubRule(34);

                            loop34:
                            do {
                                int alt34=2;
                                try { dbg.enterDecision(34);

                                int LA34_0 = input.LA(1);

                                if ( (LA34_0==51) ) {
                                    int LA34_1 = input.LA(2);

                                    if ( ((LA34_1>=VAR && LA34_1<=INT)||LA34_1==FLOAT||(LA34_1>=STRING && LA34_1<=REGEXP)||LA34_1==29||LA34_1==50||LA34_1==61||LA34_1==75||LA34_1==82||(LA34_1>=106 && LA34_1<=108)||(LA34_1>=110 && LA34_1<=113)) ) {
                                        alt34=1;
                                    }


                                }


                                } finally {dbg.exitDecision(34);}

                                switch (alt34) {
                            	case 1 :
                            	    dbg.enterAlt(1);

                            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:688:71: ',' ex1= expr
                            	    {
                            	    dbg.location(688,71);
                            	    char_literal75=(Token)match(input,51,FOLLOW_51_in_primrule2059); if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) {
                            	    char_literal75_tree = (Object)adaptor.create(char_literal75);
                            	    adaptor.addChild(root_0, char_literal75_tree);
                            	    }
                            	    dbg.location(688,78);
                            	    pushFollow(FOLLOW_expr_in_primrule2063);
                            	    ex1=expr();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, ex1.getTree());
                            	    dbg.location(688,83);
                            	    if ( state.backtracking==0 ) {
                            	      temp_list.add((ex1!=null?ex1.result:null));
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop34;
                                }
                            } while (true);
                            } finally {dbg.exitSubRule(34);}


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(35);}

                    dbg.location(688,118);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:688:118: ( ',' )?
                    int alt36=2;
                    try { dbg.enterSubRule(36);
                    try { dbg.enterDecision(36);

                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==51) ) {
                        alt36=1;
                    }
                    } finally {dbg.exitDecision(36);}

                    switch (alt36) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: ','
                            {
                            dbg.location(688,118);
                            char_literal76=(Token)match(input,51,FOLLOW_51_in_primrule2071); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal76_tree = (Object)adaptor.create(char_literal76);
                            adaptor.addChild(root_0, char_literal76_tree);
                            }

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(36);}

                    dbg.location(688,124);
                    char_literal77=(Token)match(input,52,FOLLOW_52_in_primrule2075); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal77_tree = (Object)adaptor.create(char_literal77);
                    adaptor.addChild(root_0, char_literal77_tree);
                    }
                    dbg.location(688,129);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:688:129: (m= modifier_clause )?
                    int alt37=2;
                    try { dbg.enterSubRule(37);
                    try { dbg.enterDecision(37);

                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==44) ) {
                        alt37=1;
                    }
                    } finally {dbg.exitDecision(37);}

                    switch (alt37) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: m= modifier_clause
                            {
                            dbg.location(688,129);
                            pushFollow(FOLLOW_modifier_clause_in_primrule2079);
                            m=modifier_clause();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, m.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(37);}

                    dbg.location(688,147);
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

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:704:4: e= emit_block
                    {
                    dbg.location(704,5);
                    pushFollow(FOLLOW_emit_block_in_primrule2089);
                    e=emit_block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
                    dbg.location(704,17);
                    if ( state.backtracking==0 ) {
                       
                      			HashMap tmp = new HashMap();
                      			tmp.put("emit",(e!=null?e.emit_value:null));
                      			retval.result = tmp;
                      		
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(38);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(711, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:714:1: modifier_clause returns [ArrayList result] : 'with' m= modifier ( 'and' m1= modifier )* ;
    public final RuleSet2Parser.modifier_clause_return modifier_clause() throws RecognitionException {
        RuleSet2Parser.modifier_clause_return retval = new RuleSet2Parser.modifier_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal78=null;
        Token string_literal79=null;
        RuleSet2Parser.modifier_return m = null;

        RuleSet2Parser.modifier_return m1 = null;


        Object string_literal78_tree=null;
        Object string_literal79_tree=null;


        	ArrayList temp_list = new ArrayList();

        try { dbg.enterRule(getGrammarFileName(), "modifier_clause");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(714, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:718:2: ( 'with' m= modifier ( 'and' m1= modifier )* )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:719:2: 'with' m= modifier ( 'and' m1= modifier )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(719,2);
            string_literal78=(Token)match(input,44,FOLLOW_44_in_modifier_clause2123); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal78_tree = (Object)adaptor.create(string_literal78);
            adaptor.addChild(root_0, string_literal78_tree);
            }
            dbg.location(719,10);
            pushFollow(FOLLOW_modifier_in_modifier_clause2127);
            m=modifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, m.getTree());
            dbg.location(719,20);
            if ( state.backtracking==0 ) {
              temp_list.add((m!=null?m.result:null));
            }
            dbg.location(719,48);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:719:48: ( 'and' m1= modifier )*
            try { dbg.enterSubRule(39);

            loop39:
            do {
                int alt39=2;
                try { dbg.enterDecision(39);

                int LA39_0 = input.LA(1);

                if ( (LA39_0==53) ) {
                    alt39=1;
                }


                } finally {dbg.exitDecision(39);}

                switch (alt39) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:719:49: 'and' m1= modifier
            	    {
            	    dbg.location(719,49);
            	    string_literal79=(Token)match(input,53,FOLLOW_53_in_modifier_clause2132); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal79_tree = (Object)adaptor.create(string_literal79);
            	    adaptor.addChild(root_0, string_literal79_tree);
            	    }
            	    dbg.location(719,57);
            	    pushFollow(FOLLOW_modifier_in_modifier_clause2136);
            	    m1=modifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, m1.getTree());
            	    dbg.location(719,67);
            	    if ( state.backtracking==0 ) {
            	      temp_list.add((m1!=null?m1.result:null));
            	    }

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);
            } finally {dbg.exitSubRule(39);}

            dbg.location(720,2);
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
        dbg.location(723, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:725:1: modifier returns [HashMap result] : name= VAR '=' (e= expr | j= JS ) ;
    public final RuleSet2Parser.modifier_return modifier() throws RecognitionException {
        RuleSet2Parser.modifier_return retval = new RuleSet2Parser.modifier_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token name=null;
        Token j=null;
        Token char_literal80=null;
        RuleSet2Parser.expr_return e = null;


        Object name_tree=null;
        Object j_tree=null;
        Object char_literal80_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "modifier");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(725, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:726:2: (name= VAR '=' (e= expr | j= JS ) )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:726:4: name= VAR '=' (e= expr | j= JS )
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(726,8);
            name=(Token)match(input,VAR,FOLLOW_VAR_in_modifier2161); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            name_tree = (Object)adaptor.create(name);
            adaptor.addChild(root_0, name_tree);
            }
            dbg.location(726,13);
            char_literal80=(Token)match(input,38,FOLLOW_38_in_modifier2163); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal80_tree = (Object)adaptor.create(char_literal80);
            adaptor.addChild(root_0, char_literal80_tree);
            }
            dbg.location(726,17);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:726:17: (e= expr | j= JS )
            int alt40=2;
            try { dbg.enterSubRule(40);
            try { dbg.enterDecision(40);

            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=VAR && LA40_0<=INT)||LA40_0==FLOAT||(LA40_0>=STRING && LA40_0<=REGEXP)||LA40_0==29||LA40_0==50||LA40_0==61||LA40_0==75||LA40_0==82||(LA40_0>=106 && LA40_0<=108)||(LA40_0>=110 && LA40_0<=113)) ) {
                alt40=1;
            }
            else if ( (LA40_0==JS) ) {
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

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:726:18: e= expr
                    {
                    dbg.location(726,19);
                    pushFollow(FOLLOW_expr_in_modifier2168);
                    e=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:726:27: j= JS
                    {
                    dbg.location(726,28);
                    j=(Token)match(input,JS,FOLLOW_JS_in_modifier2174); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    j_tree = (Object)adaptor.create(j);
                    adaptor.addChild(root_0, j_tree);
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(40);}

            dbg.location(726,33);
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
        dbg.location(744, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:753:1: using returns [HashMap result] : 'using' p= ( STRING | REGEXP ) (s= setting )? ;
    public final RuleSet2Parser.using_return using() throws RecognitionException {
        RuleSet2Parser.using_return retval = new RuleSet2Parser.using_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token p=null;
        Token string_literal81=null;
        RuleSet2Parser.setting_return s = null;


        Object p_tree=null;
        Object string_literal81_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "using");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(753, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:754:2: ( 'using' p= ( STRING | REGEXP ) (s= setting )? )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:754:4: 'using' p= ( STRING | REGEXP ) (s= setting )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(754,4);
            string_literal81=(Token)match(input,54,FOLLOW_54_in_using2199); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal81_tree = (Object)adaptor.create(string_literal81);
            adaptor.addChild(root_0, string_literal81_tree);
            }
            dbg.location(754,13);
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

            dbg.location(754,31);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:754:31: (s= setting )?
            int alt41=2;
            try { dbg.enterSubRule(41);
            try { dbg.enterDecision(41);

            int LA41_0 = input.LA(1);

            if ( (LA41_0==55) ) {
                alt41=1;
            }
            } finally {dbg.exitDecision(41);}

            switch (alt41) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: s= setting
                    {
                    dbg.location(754,31);
                    pushFollow(FOLLOW_setting_in_using2211);
                    s=setting();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, s.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(41);}

            dbg.location(754,41);
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
        dbg.location(766, 4);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:768:1: setting returns [ArrayList result] : 'setting' '(' (v= VAR ( ',' v2= VAR )? )* ')' ;
    public final RuleSet2Parser.setting_return setting() throws RecognitionException {
        RuleSet2Parser.setting_return retval = new RuleSet2Parser.setting_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token v=null;
        Token v2=null;
        Token string_literal82=null;
        Token char_literal83=null;
        Token char_literal84=null;
        Token char_literal85=null;

        Object v_tree=null;
        Object v2_tree=null;
        Object string_literal82_tree=null;
        Object char_literal83_tree=null;
        Object char_literal84_tree=null;
        Object char_literal85_tree=null;


        	ArrayList sresult = new ArrayList();

        try { dbg.enterRule(getGrammarFileName(), "setting");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(768, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:772:2: ( 'setting' '(' (v= VAR ( ',' v2= VAR )? )* ')' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:772:4: 'setting' '(' (v= VAR ( ',' v2= VAR )? )* ')'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(772,4);
            string_literal82=(Token)match(input,55,FOLLOW_55_in_setting2232); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal82_tree = (Object)adaptor.create(string_literal82);
            adaptor.addChild(root_0, string_literal82_tree);
            }
            dbg.location(772,14);
            char_literal83=(Token)match(input,50,FOLLOW_50_in_setting2234); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal83_tree = (Object)adaptor.create(char_literal83);
            adaptor.addChild(root_0, char_literal83_tree);
            }
            dbg.location(772,18);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:772:18: (v= VAR ( ',' v2= VAR )? )*
            try { dbg.enterSubRule(43);

            loop43:
            do {
                int alt43=2;
                try { dbg.enterDecision(43);

                int LA43_0 = input.LA(1);

                if ( (LA43_0==VAR) ) {
                    alt43=1;
                }


                } finally {dbg.exitDecision(43);}

                switch (alt43) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:772:19: v= VAR ( ',' v2= VAR )?
            	    {
            	    dbg.location(772,20);
            	    v=(Token)match(input,VAR,FOLLOW_VAR_in_setting2239); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    v_tree = (Object)adaptor.create(v);
            	    adaptor.addChild(root_0, v_tree);
            	    }
            	    dbg.location(772,24);
            	    if ( state.backtracking==0 ) {
            	      sresult.add((v!=null?v.getText():null));
            	    }
            	    dbg.location(772,48);
            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:772:48: ( ',' v2= VAR )?
            	    int alt42=2;
            	    try { dbg.enterSubRule(42);
            	    try { dbg.enterDecision(42);

            	    int LA42_0 = input.LA(1);

            	    if ( (LA42_0==51) ) {
            	        alt42=1;
            	    }
            	    } finally {dbg.exitDecision(42);}

            	    switch (alt42) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:772:49: ',' v2= VAR
            	            {
            	            dbg.location(772,49);
            	            char_literal84=(Token)match(input,51,FOLLOW_51_in_setting2243); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal84_tree = (Object)adaptor.create(char_literal84);
            	            adaptor.addChild(root_0, char_literal84_tree);
            	            }
            	            dbg.location(772,55);
            	            v2=(Token)match(input,VAR,FOLLOW_VAR_in_setting2247); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            v2_tree = (Object)adaptor.create(v2);
            	            adaptor.addChild(root_0, v2_tree);
            	            }
            	            dbg.location(772,59);
            	            if ( state.backtracking==0 ) {
            	              sresult.add((v2!=null?v2.getText():null));
            	            }

            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(42);}


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);
            } finally {dbg.exitSubRule(43);}

            dbg.location(772,89);
            char_literal85=(Token)match(input,52,FOLLOW_52_in_setting2255); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal85_tree = (Object)adaptor.create(char_literal85);
            adaptor.addChild(root_0, char_literal85_tree);
            }
            dbg.location(772,93);
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
        dbg.location(775, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:778:1: pre_block returns [ArrayList result] : 'pre' '{' ( decl[tmp] ( ';' decl[tmp] )* )? ( ';' )? '}' ;
    public final RuleSet2Parser.pre_block_return pre_block() throws RecognitionException {
        RuleSet2Parser.pre_block_return retval = new RuleSet2Parser.pre_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal86=null;
        Token char_literal87=null;
        Token char_literal89=null;
        Token char_literal91=null;
        Token char_literal92=null;
        RuleSet2Parser.decl_return decl88 = null;

        RuleSet2Parser.decl_return decl90 = null;


        Object string_literal86_tree=null;
        Object char_literal87_tree=null;
        Object char_literal89_tree=null;
        Object char_literal91_tree=null;
        Object char_literal92_tree=null;


        	ArrayList tmp = new ArrayList();

        try { dbg.enterRule(getGrammarFileName(), "pre_block");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(778, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:781:3: ( 'pre' '{' ( decl[tmp] ( ';' decl[tmp] )* )? ( ';' )? '}' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:782:3: 'pre' '{' ( decl[tmp] ( ';' decl[tmp] )* )? ( ';' )? '}'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(782,3);
            string_literal86=(Token)match(input,56,FOLLOW_56_in_pre_block2280); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal86_tree = (Object)adaptor.create(string_literal86);
            adaptor.addChild(root_0, string_literal86_tree);
            }
            dbg.location(782,9);
            char_literal87=(Token)match(input,29,FOLLOW_29_in_pre_block2282); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal87_tree = (Object)adaptor.create(char_literal87);
            adaptor.addChild(root_0, char_literal87_tree);
            }
            dbg.location(782,13);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:782:13: ( decl[tmp] ( ';' decl[tmp] )* )?
            int alt45=2;
            try { dbg.enterSubRule(45);
            try { dbg.enterDecision(45);

            int LA45_0 = input.LA(1);

            if ( (LA45_0==VAR) ) {
                alt45=1;
            }
            } finally {dbg.exitDecision(45);}

            switch (alt45) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:782:15: decl[tmp] ( ';' decl[tmp] )*
                    {
                    dbg.location(782,15);
                    pushFollow(FOLLOW_decl_in_pre_block2286);
                    decl88=decl(tmp);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, decl88.getTree());
                    dbg.location(782,25);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:782:25: ( ';' decl[tmp] )*
                    try { dbg.enterSubRule(44);

                    loop44:
                    do {
                        int alt44=2;
                        try { dbg.enterDecision(44);

                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==31) ) {
                            int LA44_1 = input.LA(2);

                            if ( (LA44_1==VAR) ) {
                                alt44=1;
                            }


                        }


                        } finally {dbg.exitDecision(44);}

                        switch (alt44) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:782:26: ';' decl[tmp]
                    	    {
                    	    dbg.location(782,26);
                    	    char_literal89=(Token)match(input,31,FOLLOW_31_in_pre_block2290); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal89_tree = (Object)adaptor.create(char_literal89);
                    	    adaptor.addChild(root_0, char_literal89_tree);
                    	    }
                    	    dbg.location(782,30);
                    	    pushFollow(FOLLOW_decl_in_pre_block2292);
                    	    decl90=decl(tmp);

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, decl90.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(44);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(45);}

            dbg.location(782,45);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:782:45: ( ';' )?
            int alt46=2;
            try { dbg.enterSubRule(46);
            try { dbg.enterDecision(46);

            int LA46_0 = input.LA(1);

            if ( (LA46_0==31) ) {
                alt46=1;
            }
            } finally {dbg.exitDecision(46);}

            switch (alt46) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: ';'
                    {
                    dbg.location(782,45);
                    char_literal91=(Token)match(input,31,FOLLOW_31_in_pre_block2300); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal91_tree = (Object)adaptor.create(char_literal91);
                    adaptor.addChild(root_0, char_literal91_tree);
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(46);}

            dbg.location(782,50);
            char_literal92=(Token)match(input,30,FOLLOW_30_in_pre_block2303); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal92_tree = (Object)adaptor.create(char_literal92);
            adaptor.addChild(root_0, char_literal92_tree);
            }
            dbg.location(782,54);
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
        dbg.location(786, 3);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:789:1: foreach returns [ArrayList result] : 'foreach' e= expr s= setting ;
    public final RuleSet2Parser.foreach_return foreach() throws RecognitionException {
        RuleSet2Parser.foreach_return retval = new RuleSet2Parser.foreach_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal93=null;
        RuleSet2Parser.expr_return e = null;

        RuleSet2Parser.setting_return s = null;


        Object string_literal93_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "foreach");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(789, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:790:2: ( 'foreach' e= expr s= setting )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:791:2: 'foreach' e= expr s= setting
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(791,2);
            string_literal93=(Token)match(input,57,FOLLOW_57_in_foreach2336); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal93_tree = (Object)adaptor.create(string_literal93);
            adaptor.addChild(root_0, string_literal93_tree);
            }
            dbg.location(791,13);
            pushFollow(FOLLOW_expr_in_foreach2340);
            e=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
            dbg.location(791,20);
            pushFollow(FOLLOW_setting_in_foreach2344);
            s=setting();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, s.getTree());
            dbg.location(791,29);
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
        dbg.location(798, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:801:1: when returns [HashMap result] : 'when' es= event_seq ;
    public final RuleSet2Parser.when_return when() throws RecognitionException {
        RuleSet2Parser.when_return retval = new RuleSet2Parser.when_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal94=null;
        RuleSet2Parser.event_seq_return es = null;


        Object string_literal94_tree=null;



        try { dbg.enterRule(getGrammarFileName(), "when");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(801, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:804:2: ( 'when' es= event_seq )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:805:2: 'when' es= event_seq
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(805,2);
            string_literal94=(Token)match(input,58,FOLLOW_58_in_when2379); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal94_tree = (Object)adaptor.create(string_literal94);
            adaptor.addChild(root_0, string_literal94_tree);
            }
            dbg.location(805,11);
            pushFollow(FOLLOW_event_seq_in_when2383);
            es=event_seq();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, es.getTree());
            dbg.location(805,22);
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
        dbg.location(811, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:814:1: event_seq returns [HashMap result] : eor= event_or (tb= ( 'then' | 'before' ) eor2= event_or )* ;
    public final RuleSet2Parser.event_seq_return event_seq() throws RecognitionException {
        RuleSet2Parser.event_seq_return retval = new RuleSet2Parser.event_seq_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token tb=null;
        RuleSet2Parser.event_or_return eor = null;

        RuleSet2Parser.event_or_return eor2 = null;


        Object tb_tree=null;


        	ArrayList temp_list = new ArrayList();
        	ArrayList temp_list_2 = new ArrayList();

        try { dbg.enterRule(getGrammarFileName(), "event_seq");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(814, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:819:2: (eor= event_or (tb= ( 'then' | 'before' ) eor2= event_or )* )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:820:3: eor= event_or (tb= ( 'then' | 'before' ) eor2= event_or )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(820,6);
            pushFollow(FOLLOW_event_or_in_event_seq2410);
            eor=event_or();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, eor.getTree());
            dbg.location(820,15);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:820:15: (tb= ( 'then' | 'before' ) eor2= event_or )*
            try { dbg.enterSubRule(47);

            loop47:
            do {
                int alt47=2;
                try { dbg.enterDecision(47);

                int LA47_0 = input.LA(1);

                if ( (LA47_0==48||LA47_0==59) ) {
                    alt47=1;
                }


                } finally {dbg.exitDecision(47);}

                switch (alt47) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:820:16: tb= ( 'then' | 'before' ) eor2= event_or
            	    {
            	    dbg.location(820,18);
            	    tb=(Token)input.LT(1);
            	    if ( input.LA(1)==48||input.LA(1)==59 ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(tb));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(820,41);
            	    pushFollow(FOLLOW_event_or_in_event_seq2422);
            	    eor2=event_or();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, eor2.getTree());
            	    dbg.location(820,51);
            	    if ( state.backtracking==0 ) {
            	       temp_list_2.add((tb!=null?tb.getText():null));temp_list.add(eor2);
            	    }

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);
            } finally {dbg.exitSubRule(47);}

            dbg.location(821,3);
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
        dbg.location(861, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:865:1: event_or returns [HashMap result] : ea= event_and ( 'or' ea1= event_and )* ;
    public final RuleSet2Parser.event_or_return event_or() throws RecognitionException {
        RuleSet2Parser.event_or_return retval = new RuleSet2Parser.event_or_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal95=null;
        RuleSet2Parser.event_and_return ea = null;

        RuleSet2Parser.event_and_return ea1 = null;


        Object string_literal95_tree=null;


        	ArrayList temp_list = new ArrayList();

        try { dbg.enterRule(getGrammarFileName(), "event_or");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(865, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:869:2: (ea= event_and ( 'or' ea1= event_and )* )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:870:3: ea= event_and ( 'or' ea1= event_and )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(870,5);
            pushFollow(FOLLOW_event_and_in_event_or2464);
            ea=event_and();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ea.getTree());
            dbg.location(870,16);
            if ( state.backtracking==0 ) {
              temp_list.add(ea);
            }
            dbg.location(870,37);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:870:37: ( 'or' ea1= event_and )*
            try { dbg.enterSubRule(48);

            loop48:
            do {
                int alt48=2;
                try { dbg.enterDecision(48);

                int LA48_0 = input.LA(1);

                if ( (LA48_0==60) ) {
                    alt48=1;
                }


                } finally {dbg.exitDecision(48);}

                switch (alt48) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:870:38: 'or' ea1= event_and
            	    {
            	    dbg.location(870,38);
            	    string_literal95=(Token)match(input,60,FOLLOW_60_in_event_or2469); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal95_tree = (Object)adaptor.create(string_literal95);
            	    adaptor.addChild(root_0, string_literal95_tree);
            	    }
            	    dbg.location(870,46);
            	    pushFollow(FOLLOW_event_and_in_event_or2473);
            	    ea1=event_and();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, ea1.getTree());
            	    dbg.location(870,57);
            	    if ( state.backtracking==0 ) {
            	       temp_list.add(ea1);
            	    }

            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);
            } finally {dbg.exitSubRule(48);}

            dbg.location(870,82);
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
        dbg.location(909, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:911:1: event_and returns [HashMap result] : e= event_btwn ( 'and' e1= event_btwn )* ;
    public final RuleSet2Parser.event_and_return event_and() throws RecognitionException {
        RuleSet2Parser.event_and_return retval = new RuleSet2Parser.event_and_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal96=null;
        RuleSet2Parser.event_btwn_return e = null;

        RuleSet2Parser.event_btwn_return e1 = null;


        Object string_literal96_tree=null;


        	ArrayList temp_list = new ArrayList();

        try { dbg.enterRule(getGrammarFileName(), "event_and");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(911, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:915:2: (e= event_btwn ( 'and' e1= event_btwn )* )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:916:3: e= event_btwn ( 'and' e1= event_btwn )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(916,4);
            pushFollow(FOLLOW_event_btwn_in_event_and2503);
            e=event_btwn();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
            dbg.location(916,16);
            if ( state.backtracking==0 ) {
              temp_list.add(e);
            }
            dbg.location(916,36);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:916:36: ( 'and' e1= event_btwn )*
            try { dbg.enterSubRule(49);

            loop49:
            do {
                int alt49=2;
                try { dbg.enterDecision(49);

                int LA49_0 = input.LA(1);

                if ( (LA49_0==53) ) {
                    alt49=1;
                }


                } finally {dbg.exitDecision(49);}

                switch (alt49) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:916:37: 'and' e1= event_btwn
            	    {
            	    dbg.location(916,37);
            	    string_literal96=(Token)match(input,53,FOLLOW_53_in_event_and2508); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal96_tree = (Object)adaptor.create(string_literal96);
            	    adaptor.addChild(root_0, string_literal96_tree);
            	    }
            	    dbg.location(916,45);
            	    pushFollow(FOLLOW_event_btwn_in_event_and2512);
            	    e1=event_btwn();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, e1.getTree());
            	    dbg.location(916,57);
            	    if ( state.backtracking==0 ) {
            	       temp_list.add(e1);
            	    }

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);
            } finally {dbg.exitSubRule(49);}

            dbg.location(916,82);
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
        dbg.location(955, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:957:1: event_btwn returns [HashMap result] : ep= event_prim ( (not= 'not' )? 'between' '(' es1= event_seq ',' es2= event_seq ')' )? ;
    public final RuleSet2Parser.event_btwn_return event_btwn() throws RecognitionException {
        RuleSet2Parser.event_btwn_return retval = new RuleSet2Parser.event_btwn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token not=null;
        Token string_literal97=null;
        Token char_literal98=null;
        Token char_literal99=null;
        Token char_literal100=null;
        RuleSet2Parser.event_prim_return ep = null;

        RuleSet2Parser.event_seq_return es1 = null;

        RuleSet2Parser.event_seq_return es2 = null;


        Object not_tree=null;
        Object string_literal97_tree=null;
        Object char_literal98_tree=null;
        Object char_literal99_tree=null;
        Object char_literal100_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "event_btwn");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(957, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:958:2: (ep= event_prim ( (not= 'not' )? 'between' '(' es1= event_seq ',' es2= event_seq ')' )? )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:959:3: ep= event_prim ( (not= 'not' )? 'between' '(' es1= event_seq ',' es2= event_seq ')' )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(959,5);
            pushFollow(FOLLOW_event_prim_in_event_btwn2538);
            ep=event_prim();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ep.getTree());
            dbg.location(959,17);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:959:17: ( (not= 'not' )? 'between' '(' es1= event_seq ',' es2= event_seq ')' )?
            int alt51=2;
            try { dbg.enterSubRule(51);
            try { dbg.enterDecision(51);

            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=61 && LA51_0<=62)) ) {
                alt51=1;
            }
            } finally {dbg.exitDecision(51);}

            switch (alt51) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:959:18: (not= 'not' )? 'between' '(' es1= event_seq ',' es2= event_seq ')'
                    {
                    dbg.location(959,18);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:959:18: (not= 'not' )?
                    int alt50=2;
                    try { dbg.enterSubRule(50);
                    try { dbg.enterDecision(50);

                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==61) ) {
                        alt50=1;
                    }
                    } finally {dbg.exitDecision(50);}

                    switch (alt50) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:959:19: not= 'not'
                            {
                            dbg.location(959,22);
                            not=(Token)match(input,61,FOLLOW_61_in_event_btwn2544); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            not_tree = (Object)adaptor.create(not);
                            adaptor.addChild(root_0, not_tree);
                            }

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(50);}

                    dbg.location(959,32);
                    string_literal97=(Token)match(input,62,FOLLOW_62_in_event_btwn2549); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal97_tree = (Object)adaptor.create(string_literal97);
                    adaptor.addChild(root_0, string_literal97_tree);
                    }
                    dbg.location(959,42);
                    char_literal98=(Token)match(input,50,FOLLOW_50_in_event_btwn2551); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal98_tree = (Object)adaptor.create(char_literal98);
                    adaptor.addChild(root_0, char_literal98_tree);
                    }
                    dbg.location(959,49);
                    pushFollow(FOLLOW_event_seq_in_event_btwn2555);
                    es1=event_seq();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, es1.getTree());
                    dbg.location(959,60);
                    char_literal99=(Token)match(input,51,FOLLOW_51_in_event_btwn2557); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal99_tree = (Object)adaptor.create(char_literal99);
                    adaptor.addChild(root_0, char_literal99_tree);
                    }
                    dbg.location(959,67);
                    pushFollow(FOLLOW_event_seq_in_event_btwn2561);
                    es2=event_seq();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, es2.getTree());
                    dbg.location(959,78);
                    char_literal100=(Token)match(input,52,FOLLOW_52_in_event_btwn2563); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal100_tree = (Object)adaptor.create(char_literal100);
                    adaptor.addChild(root_0, char_literal100_tree);
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(51);}

            dbg.location(959,84);
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
        dbg.location(981, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:984:1: event_prim returns [HashMap result] : ( ( 'web' )? 'pageview' (spat= STRING | rpat= REGEXP ) (set= setting )? | ( 'web' )? opt= ( 'submit' | 'click' | 'dblclick' | 'change' | 'update' ) elem= STRING (on= on_expr )? (set= setting )? | dom= VAR oper= VAR (filter= event_filter )* (set= setting )? | '(' evt= event_seq ')' );
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
        Token string_literal101=null;
        Token string_literal102=null;
        Token string_literal103=null;
        Token char_literal104=null;
        Token char_literal105=null;
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
        Object string_literal101_tree=null;
        Object string_literal102_tree=null;
        Object string_literal103_tree=null;
        Object char_literal104_tree=null;
        Object char_literal105_tree=null;


        	ArrayList filters = new ArrayList();

        try { dbg.enterRule(getGrammarFileName(), "event_prim");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(984, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:988:2: ( ( 'web' )? 'pageview' (spat= STRING | rpat= REGEXP ) (set= setting )? | ( 'web' )? opt= ( 'submit' | 'click' | 'dblclick' | 'change' | 'update' ) elem= STRING (on= on_expr )? (set= setting )? | dom= VAR oper= VAR (filter= event_filter )* (set= setting )? | '(' evt= event_seq ')' )
            int alt60=4;
            try { dbg.enterDecision(60);

            switch ( input.LA(1) ) {
            case 63:
                {
                int LA60_1 = input.LA(2);

                if ( ((LA60_1>=36 && LA60_1<=37)||(LA60_1>=65 && LA60_1<=67)) ) {
                    alt60=2;
                }
                else if ( (LA60_1==64) ) {
                    alt60=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 60, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case 64:
                {
                alt60=1;
                }
                break;
            case 36:
            case 37:
            case 65:
            case 66:
            case 67:
                {
                alt60=2;
                }
                break;
            case VAR:
                {
                alt60=3;
                }
                break;
            case 50:
                {
                alt60=4;
                }
                break;
            default:
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

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:989:2: ( 'web' )? 'pageview' (spat= STRING | rpat= REGEXP ) (set= setting )?
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(989,2);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:989:2: ( 'web' )?
                    int alt52=2;
                    try { dbg.enterSubRule(52);
                    try { dbg.enterDecision(52);

                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==63) ) {
                        alt52=1;
                    }
                    } finally {dbg.exitDecision(52);}

                    switch (alt52) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: 'web'
                            {
                            dbg.location(989,2);
                            string_literal101=(Token)match(input,63,FOLLOW_63_in_event_prim2594); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal101_tree = (Object)adaptor.create(string_literal101);
                            adaptor.addChild(root_0, string_literal101_tree);
                            }

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(52);}

                    dbg.location(989,9);
                    string_literal102=(Token)match(input,64,FOLLOW_64_in_event_prim2597); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal102_tree = (Object)adaptor.create(string_literal102);
                    adaptor.addChild(root_0, string_literal102_tree);
                    }
                    dbg.location(989,20);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:989:20: (spat= STRING | rpat= REGEXP )
                    int alt53=2;
                    try { dbg.enterSubRule(53);
                    try { dbg.enterDecision(53);

                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==STRING) ) {
                        alt53=1;
                    }
                    else if ( (LA53_0==REGEXP) ) {
                        alt53=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 53, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(53);}

                    switch (alt53) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:989:21: spat= STRING
                            {
                            dbg.location(989,25);
                            spat=(Token)match(input,STRING,FOLLOW_STRING_in_event_prim2602); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            spat_tree = (Object)adaptor.create(spat);
                            adaptor.addChild(root_0, spat_tree);
                            }

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:989:33: rpat= REGEXP
                            {
                            dbg.location(989,37);
                            rpat=(Token)match(input,REGEXP,FOLLOW_REGEXP_in_event_prim2606); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            rpat_tree = (Object)adaptor.create(rpat);
                            adaptor.addChild(root_0, rpat_tree);
                            }

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(53);}

                    dbg.location(989,49);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:989:49: (set= setting )?
                    int alt54=2;
                    try { dbg.enterSubRule(54);
                    try { dbg.enterDecision(54);

                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==55) ) {
                        alt54=1;
                    }
                    } finally {dbg.exitDecision(54);}

                    switch (alt54) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: set= setting
                            {
                            dbg.location(989,49);
                            pushFollow(FOLLOW_setting_in_event_prim2611);
                            set=setting();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, set.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(54);}

                    dbg.location(989,59);
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

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1002:4: ( 'web' )? opt= ( 'submit' | 'click' | 'dblclick' | 'change' | 'update' ) elem= STRING (on= on_expr )? (set= setting )?
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(1002,4);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1002:4: ( 'web' )?
                    int alt55=2;
                    try { dbg.enterSubRule(55);
                    try { dbg.enterDecision(55);

                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==63) ) {
                        alt55=1;
                    }
                    } finally {dbg.exitDecision(55);}

                    switch (alt55) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: 'web'
                            {
                            dbg.location(1002,4);
                            string_literal103=(Token)match(input,63,FOLLOW_63_in_event_prim2620); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal103_tree = (Object)adaptor.create(string_literal103);
                            adaptor.addChild(root_0, string_literal103_tree);
                            }

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(55);}

                    dbg.location(1002,14);
                    opt=(Token)input.LT(1);
                    if ( (input.LA(1)>=36 && input.LA(1)<=37)||(input.LA(1)>=65 && input.LA(1)<=67) ) {
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

                    dbg.location(1002,67);
                    elem=(Token)match(input,STRING,FOLLOW_STRING_in_event_prim2639); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    elem_tree = (Object)adaptor.create(elem);
                    adaptor.addChild(root_0, elem_tree);
                    }
                    dbg.location(1002,77);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1002:77: (on= on_expr )?
                    int alt56=2;
                    try { dbg.enterSubRule(56);
                    try { dbg.enterDecision(56);

                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==68) ) {
                        alt56=1;
                    }
                    } finally {dbg.exitDecision(56);}

                    switch (alt56) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: on= on_expr
                            {
                            dbg.location(1002,77);
                            pushFollow(FOLLOW_on_expr_in_event_prim2643);
                            on=on_expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, on.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(56);}

                    dbg.location(1002,91);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1002:91: (set= setting )?
                    int alt57=2;
                    try { dbg.enterSubRule(57);
                    try { dbg.enterDecision(57);

                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==55) ) {
                        alt57=1;
                    }
                    } finally {dbg.exitDecision(57);}

                    switch (alt57) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: set= setting
                            {
                            dbg.location(1002,91);
                            pushFollow(FOLLOW_setting_in_event_prim2649);
                            set=setting();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, set.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(57);}

                    dbg.location(1002,101);
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

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1015:4: dom= VAR oper= VAR (filter= event_filter )* (set= setting )?
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(1015,7);
                    dom=(Token)match(input,VAR,FOLLOW_VAR_in_event_prim2659); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    dom_tree = (Object)adaptor.create(dom);
                    adaptor.addChild(root_0, dom_tree);
                    }
                    dbg.location(1015,16);
                    oper=(Token)match(input,VAR,FOLLOW_VAR_in_event_prim2663); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    oper_tree = (Object)adaptor.create(oper);
                    adaptor.addChild(root_0, oper_tree);
                    }
                    dbg.location(1015,21);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1015:21: (filter= event_filter )*
                    try { dbg.enterSubRule(58);

                    loop58:
                    do {
                        int alt58=2;
                        try { dbg.enterDecision(58);

                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==VAR) ) {
                            int LA58_2 = input.LA(2);

                            if ( ((LA58_2>=STRING && LA58_2<=REGEXP)) ) {
                                alt58=1;
                            }


                        }


                        } finally {dbg.exitDecision(58);}

                        switch (alt58) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1015:22: filter= event_filter
                    	    {
                    	    dbg.location(1015,28);
                    	    pushFollow(FOLLOW_event_filter_in_event_prim2668);
                    	    filter=event_filter();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, filter.getTree());
                    	    dbg.location(1015,41);
                    	    if ( state.backtracking==0 ) {
                    	      filters.add((filter!=null?filter.result:null));
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop58;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(58);}

                    dbg.location(1015,77);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1015:77: (set= setting )?
                    int alt59=2;
                    try { dbg.enterSubRule(59);
                    try { dbg.enterDecision(59);

                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==55) ) {
                        alt59=1;
                    }
                    } finally {dbg.exitDecision(59);}

                    switch (alt59) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: set= setting
                            {
                            dbg.location(1015,77);
                            pushFollow(FOLLOW_setting_in_event_prim2675);
                            set=setting();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, set.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(59);}

                    dbg.location(1015,88);
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

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1027:4: '(' evt= event_seq ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(1027,4);
                    char_literal104=(Token)match(input,50,FOLLOW_50_in_event_prim2685); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal104_tree = (Object)adaptor.create(char_literal104);
                    adaptor.addChild(root_0, char_literal104_tree);
                    }
                    dbg.location(1027,11);
                    pushFollow(FOLLOW_event_seq_in_event_prim2689);
                    evt=event_seq();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, evt.getTree());
                    dbg.location(1027,22);
                    char_literal105=(Token)match(input,52,FOLLOW_52_in_event_prim2691); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal105_tree = (Object)adaptor.create(char_literal105);
                    adaptor.addChild(root_0, char_literal105_tree);
                    }
                    dbg.location(1027,26);
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
        dbg.location(1030, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1033:1: event_filter returns [ArrayList result] : typ= VAR (sfilt= STRING | rfilt= REGEXP ) ;
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
        dbg.location(1033, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1034:2: (typ= VAR (sfilt= STRING | rfilt= REGEXP ) )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1034:4: typ= VAR (sfilt= STRING | rfilt= REGEXP )
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(1034,7);
            typ=(Token)match(input,VAR,FOLLOW_VAR_in_event_filter2712); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            typ_tree = (Object)adaptor.create(typ);
            adaptor.addChild(root_0, typ_tree);
            }
            dbg.location(1034,12);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1034:12: (sfilt= STRING | rfilt= REGEXP )
            int alt61=2;
            try { dbg.enterSubRule(61);
            try { dbg.enterDecision(61);

            int LA61_0 = input.LA(1);

            if ( (LA61_0==STRING) ) {
                alt61=1;
            }
            else if ( (LA61_0==REGEXP) ) {
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

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1034:13: sfilt= STRING
                    {
                    dbg.location(1034,18);
                    sfilt=(Token)match(input,STRING,FOLLOW_STRING_in_event_filter2717); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    sfilt_tree = (Object)adaptor.create(sfilt);
                    adaptor.addChild(root_0, sfilt_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1034:28: rfilt= REGEXP
                    {
                    dbg.location(1034,33);
                    rfilt=(Token)match(input,REGEXP,FOLLOW_REGEXP_in_event_filter2723); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    rfilt_tree = (Object)adaptor.create(rfilt);
                    adaptor.addChild(root_0, rfilt_tree);
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(61);}

            dbg.location(1034,42);
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
        dbg.location(1045, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1047:1: on_expr returns [String result] : 'on' (s= STRING | r= REGEXP ) ;
    public final RuleSet2Parser.on_expr_return on_expr() throws RecognitionException {
        RuleSet2Parser.on_expr_return retval = new RuleSet2Parser.on_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token s=null;
        Token r=null;
        Token string_literal106=null;

        Object s_tree=null;
        Object r_tree=null;
        Object string_literal106_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "on_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1047, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1047:32: ( 'on' (s= STRING | r= REGEXP ) )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1047:34: 'on' (s= STRING | r= REGEXP )
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(1047,34);
            string_literal106=(Token)match(input,68,FOLLOW_68_in_on_expr2742); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal106_tree = (Object)adaptor.create(string_literal106);
            adaptor.addChild(root_0, string_literal106_tree);
            }
            dbg.location(1048,2);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1048:2: (s= STRING | r= REGEXP )
            int alt62=2;
            try { dbg.enterSubRule(62);
            try { dbg.enterDecision(62);

            int LA62_0 = input.LA(1);

            if ( (LA62_0==STRING) ) {
                alt62=1;
            }
            else if ( (LA62_0==REGEXP) ) {
                alt62=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(62);}

            switch (alt62) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1048:5: s= STRING
                    {
                    dbg.location(1048,6);
                    s=(Token)match(input,STRING,FOLLOW_STRING_in_on_expr2751); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    s_tree = (Object)adaptor.create(s);
                    adaptor.addChild(root_0, s_tree);
                    }
                    dbg.location(1048,14);
                    if ( state.backtracking==0 ) {
                      retval.result = strip_string((s!=null?s.getText():null));
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1049:5: r= REGEXP
                    {
                    dbg.location(1049,6);
                    r=(Token)match(input,REGEXP,FOLLOW_REGEXP_in_on_expr2762); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    r_tree = (Object)adaptor.create(r);
                    adaptor.addChild(root_0, r_tree);
                    }
                    dbg.location(1049,14);
                    if ( state.backtracking==0 ) {
                      retval.result = strip_string((r!=null?r.getText():null));
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(62);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(1051, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1099:1: global_block : 'global' '{' (emt= emit_block | dst= must_be_one[sar(\"dataset\",\"datasource\")] name= VAR ( ':' dtype= ( 'JSON' | 'XML' | 'RSS' | 'HTML' ) )? '<-' src= STRING (cas= cachable )? | css_emit | decl[global_block_array] | ';' )+ '}' ;
    public final RuleSet2Parser.global_block_return global_block() throws RecognitionException {
        RuleSet2Parser.global_block_return retval = new RuleSet2Parser.global_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token name=null;
        Token dtype=null;
        Token src=null;
        Token string_literal107=null;
        Token char_literal108=null;
        Token char_literal109=null;
        Token string_literal110=null;
        Token char_literal113=null;
        Token char_literal114=null;
        RuleSet2Parser.emit_block_return emt = null;

        RuleSet2Parser.must_be_one_return dst = null;

        RuleSet2Parser.cachable_return cas = null;

        RuleSet2Parser.css_emit_return css_emit111 = null;

        RuleSet2Parser.decl_return decl112 = null;


        Object name_tree=null;
        Object dtype_tree=null;
        Object src_tree=null;
        Object string_literal107_tree=null;
        Object char_literal108_tree=null;
        Object char_literal109_tree=null;
        Object string_literal110_tree=null;
        Object char_literal113_tree=null;
        Object char_literal114_tree=null;


        	 ArrayList global_block_array = (ArrayList)rule_json.get("global");
        	 boolean found_cache = false;

        try { dbg.enterRule(getGrammarFileName(), "global_block");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1099, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1106:2: ( 'global' '{' (emt= emit_block | dst= must_be_one[sar(\"dataset\",\"datasource\")] name= VAR ( ':' dtype= ( 'JSON' | 'XML' | 'RSS' | 'HTML' ) )? '<-' src= STRING (cas= cachable )? | css_emit | decl[global_block_array] | ';' )+ '}' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1106:4: 'global' '{' (emt= emit_block | dst= must_be_one[sar(\"dataset\",\"datasource\")] name= VAR ( ':' dtype= ( 'JSON' | 'XML' | 'RSS' | 'HTML' ) )? '<-' src= STRING (cas= cachable )? | css_emit | decl[global_block_array] | ';' )+ '}'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(1106,4);
            string_literal107=(Token)match(input,69,FOLLOW_69_in_global_block2847); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal107_tree = (Object)adaptor.create(string_literal107);
            adaptor.addChild(root_0, string_literal107_tree);
            }
            dbg.location(1106,13);
            char_literal108=(Token)match(input,29,FOLLOW_29_in_global_block2849); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal108_tree = (Object)adaptor.create(char_literal108);
            adaptor.addChild(root_0, char_literal108_tree);
            }
            dbg.location(1107,2);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1107:2: (emt= emit_block | dst= must_be_one[sar(\"dataset\",\"datasource\")] name= VAR ( ':' dtype= ( 'JSON' | 'XML' | 'RSS' | 'HTML' ) )? '<-' src= STRING (cas= cachable )? | css_emit | decl[global_block_array] | ';' )+
            int cnt65=0;
            try { dbg.enterSubRule(65);

            loop65:
            do {
                int alt65=6;
                try { dbg.enterDecision(65);

                switch ( input.LA(1) ) {
                case 117:
                    {
                    alt65=1;
                    }
                    break;
                case VAR:
                    {
                    int LA65_3 = input.LA(2);

                    if ( (LA65_3==38) ) {
                        alt65=4;
                    }
                    else if ( (LA65_3==VAR) ) {
                        alt65=2;
                    }


                    }
                    break;
                case 115:
                    {
                    alt65=3;
                    }
                    break;
                case 31:
                    {
                    alt65=5;
                    }
                    break;

                }

                } finally {dbg.exitDecision(65);}

                switch (alt65) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1107:4: emt= emit_block
            	    {
            	    dbg.location(1107,7);
            	    pushFollow(FOLLOW_emit_block_in_global_block2857);
            	    emt=emit_block();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, emt.getTree());
            	    dbg.location(1107,19);
            	    if ( state.backtracking==0 ) {

            	      		HashMap tmp = new HashMap(); 
            	      		tmp.put("emit",(emt!=null?emt.emit_value:null));
            	      		global_block_array.add(tmp);
            	      	
            	    }

            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1112:4: dst= must_be_one[sar(\"dataset\",\"datasource\")] name= VAR ( ':' dtype= ( 'JSON' | 'XML' | 'RSS' | 'HTML' ) )? '<-' src= STRING (cas= cachable )?
            	    {
            	    dbg.location(1112,7);
            	    pushFollow(FOLLOW_must_be_one_in_global_block2867);
            	    dst=must_be_one(sar("dataset","datasource"));

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, dst.getTree());
            	    dbg.location(1112,53);
            	    name=(Token)match(input,VAR,FOLLOW_VAR_in_global_block2872); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    name_tree = (Object)adaptor.create(name);
            	    adaptor.addChild(root_0, name_tree);
            	    }
            	    dbg.location(1112,58);
            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1112:58: ( ':' dtype= ( 'JSON' | 'XML' | 'RSS' | 'HTML' ) )?
            	    int alt63=2;
            	    try { dbg.enterSubRule(63);
            	    try { dbg.enterDecision(63);

            	    int LA63_0 = input.LA(1);

            	    if ( (LA63_0==40) ) {
            	        alt63=1;
            	    }
            	    } finally {dbg.exitDecision(63);}

            	    switch (alt63) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1112:59: ':' dtype= ( 'JSON' | 'XML' | 'RSS' | 'HTML' )
            	            {
            	            dbg.location(1112,59);
            	            char_literal109=(Token)match(input,40,FOLLOW_40_in_global_block2875); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal109_tree = (Object)adaptor.create(char_literal109);
            	            adaptor.addChild(root_0, char_literal109_tree);
            	            }
            	            dbg.location(1112,68);
            	            dtype=(Token)input.LT(1);
            	            if ( (input.LA(1)>=70 && input.LA(1)<=73) ) {
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
            	    } finally {dbg.exitSubRule(63);}

            	    dbg.location(1112,99);
            	    string_literal110=(Token)match(input,74,FOLLOW_74_in_global_block2891); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal110_tree = (Object)adaptor.create(string_literal110);
            	    adaptor.addChild(root_0, string_literal110_tree);
            	    }
            	    dbg.location(1112,107);
            	    src=(Token)match(input,STRING,FOLLOW_STRING_in_global_block2895); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    src_tree = (Object)adaptor.create(src);
            	    adaptor.addChild(root_0, src_tree);
            	    }
            	    dbg.location(1112,115);
            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1112:115: (cas= cachable )?
            	    int alt64=2;
            	    try { dbg.enterSubRule(64);
            	    try { dbg.enterDecision(64);

            	    int LA64_0 = input.LA(1);

            	    if ( (LA64_0==116) ) {
            	        alt64=1;
            	    }
            	    } finally {dbg.exitDecision(64);}

            	    switch (alt64) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1112:116: cas= cachable
            	            {
            	            dbg.location(1112,119);
            	            pushFollow(FOLLOW_cachable_in_global_block2900);
            	            cas=cachable();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, cas.getTree());
            	            dbg.location(1112,129);
            	            if ( state.backtracking==0 ) {
            	              found_cache =true; 
            	            }

            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(64);}

            	    dbg.location(1112,154);
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

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1146:4: css_emit
            	    {
            	    dbg.location(1146,4);
            	    pushFollow(FOLLOW_css_emit_in_global_block2913);
            	    css_emit111=css_emit();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, css_emit111.getTree());
            	    dbg.location(1146,13);
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

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1152:4: decl[global_block_array]
            	    {
            	    dbg.location(1152,4);
            	    pushFollow(FOLLOW_decl_in_global_block2921);
            	    decl112=decl(global_block_array);

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, decl112.getTree());

            	    }
            	    break;
            	case 5 :
            	    dbg.enterAlt(5);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1153:4: ';'
            	    {
            	    dbg.location(1153,4);
            	    char_literal113=(Token)match(input,31,FOLLOW_31_in_global_block2927); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal113_tree = (Object)adaptor.create(char_literal113);
            	    adaptor.addChild(root_0, char_literal113_tree);
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt65 >= 1 ) break loop65;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(65, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt65++;
            } while (true);
            } finally {dbg.exitSubRule(65);}

            dbg.location(1153,11);
            char_literal114=(Token)match(input,30,FOLLOW_30_in_global_block2932); if (state.failed) return retval;
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
        dbg.location(1154, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1160:1: decl[ArrayList block_array] : (var= VAR '=' val= HTML | var= VAR '=' val= JS | var= VAR '=' e= expr );
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



        try { dbg.enterRule(getGrammarFileName(), "decl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1160, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1163:2: (var= VAR '=' val= HTML | var= VAR '=' val= JS | var= VAR '=' e= expr )
            int alt66=3;
            try { dbg.enterDecision(66);

            int LA66_0 = input.LA(1);

            if ( (LA66_0==VAR) ) {
                int LA66_1 = input.LA(2);

                if ( (LA66_1==38) ) {
                    switch ( input.LA(3) ) {
                    case HTML:
                        {
                        alt66=1;
                        }
                        break;
                    case JS:
                        {
                        alt66=2;
                        }
                        break;
                    case VAR:
                    case INT:
                    case FLOAT:
                    case STRING:
                    case REGEXP:
                    case 29:
                    case 50:
                    case 61:
                    case 75:
                    case 82:
                    case 106:
                    case 107:
                    case 108:
                    case 110:
                    case 111:
                    case 112:
                    case 113:
                        {
                        alt66=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 66, 2, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 66, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
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

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1164:2: var= VAR '=' val= HTML
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(1164,5);
                    var=(Token)match(input,VAR,FOLLOW_VAR_in_decl2959); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    var_tree = (Object)adaptor.create(var);
                    adaptor.addChild(root_0, var_tree);
                    }
                    dbg.location(1164,10);
                    char_literal115=(Token)match(input,38,FOLLOW_38_in_decl2961); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal115_tree = (Object)adaptor.create(char_literal115);
                    adaptor.addChild(root_0, char_literal115_tree);
                    }
                    dbg.location(1164,17);
                    val=(Token)match(input,HTML,FOLLOW_HTML_in_decl2965); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    val_tree = (Object)adaptor.create(val);
                    adaptor.addChild(root_0, val_tree);
                    }
                    dbg.location(1164,23);
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

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1171:4: var= VAR '=' val= JS
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(1171,7);
                    var=(Token)match(input,VAR,FOLLOW_VAR_in_decl2975); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    var_tree = (Object)adaptor.create(var);
                    adaptor.addChild(root_0, var_tree);
                    }
                    dbg.location(1171,12);
                    char_literal116=(Token)match(input,38,FOLLOW_38_in_decl2977); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal116_tree = (Object)adaptor.create(char_literal116);
                    adaptor.addChild(root_0, char_literal116_tree);
                    }
                    dbg.location(1171,19);
                    val=(Token)match(input,JS,FOLLOW_JS_in_decl2981); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    val_tree = (Object)adaptor.create(val);
                    adaptor.addChild(root_0, val_tree);
                    }
                    dbg.location(1171,23);
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

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1178:4: var= VAR '=' e= expr
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(1178,7);
                    var=(Token)match(input,VAR,FOLLOW_VAR_in_decl2991); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    var_tree = (Object)adaptor.create(var);
                    adaptor.addChild(root_0, var_tree);
                    }
                    dbg.location(1178,12);
                    char_literal117=(Token)match(input,38,FOLLOW_38_in_decl2993); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal117_tree = (Object)adaptor.create(char_literal117);
                    adaptor.addChild(root_0, char_literal117_tree);
                    }
                    dbg.location(1178,17);
                    pushFollow(FOLLOW_expr_in_decl2997);
                    e=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
                    dbg.location(1178,23);
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
        dbg.location(1185, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1190:1: expr returns [Object result] : (fd= function_def | c= conditional_expression );
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
        dbg.location(1190, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1194:2: (fd= function_def | c= conditional_expression )
            int alt67=2;
            try { dbg.enterDecision(67);

            int LA67_0 = input.LA(1);

            if ( (LA67_0==75) ) {
                alt67=1;
            }
            else if ( ((LA67_0>=VAR && LA67_0<=INT)||LA67_0==FLOAT||(LA67_0>=STRING && LA67_0<=REGEXP)||LA67_0==29||LA67_0==50||LA67_0==61||LA67_0==82||(LA67_0>=106 && LA67_0<=108)||(LA67_0>=110 && LA67_0<=113)) ) {
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

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1194:4: fd= function_def
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(1194,6);
                    pushFollow(FOLLOW_function_def_in_expr3024);
                    fd=function_def();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fd.getTree());
                    dbg.location(1194,20);
                    if ( state.backtracking==0 ) {

                      		retval.result = (fd!=null?fd.result:null);
                      	
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1197:4: c= conditional_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(1197,5);
                    pushFollow(FOLLOW_conditional_expression_in_expr3033);
                    c=conditional_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, c.getTree());
                    dbg.location(1197,29);
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
        dbg.location(1200, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1202:1: function_def returns [Object result] : 'function' '(' (args+= VAR )? ( ',' args+= VAR )* ')' '{' (decs+= decl[block_array] )? ( ';' decs+= decl[block_array] )* ( ';' )? e1= expr '}' ;
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

        try { dbg.enterRule(getGrammarFileName(), "function_def");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1202, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1206:2: ( 'function' '(' (args+= VAR )? ( ',' args+= VAR )* ')' '{' (decs+= decl[block_array] )? ( ';' decs+= decl[block_array] )* ( ';' )? e1= expr '}' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1206:4: 'function' '(' (args+= VAR )? ( ',' args+= VAR )* ')' '{' (decs+= decl[block_array] )? ( ';' decs+= decl[block_array] )* ( ';' )? e1= expr '}'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(1206,4);
            string_literal118=(Token)match(input,75,FOLLOW_75_in_function_def3056); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal118_tree = (Object)adaptor.create(string_literal118);
            adaptor.addChild(root_0, string_literal118_tree);
            }
            dbg.location(1206,15);
            char_literal119=(Token)match(input,50,FOLLOW_50_in_function_def3058); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal119_tree = (Object)adaptor.create(char_literal119);
            adaptor.addChild(root_0, char_literal119_tree);
            }
            dbg.location(1206,23);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1206:23: (args+= VAR )?
            int alt68=2;
            try { dbg.enterSubRule(68);
            try { dbg.enterDecision(68);

            int LA68_0 = input.LA(1);

            if ( (LA68_0==VAR) ) {
                alt68=1;
            }
            } finally {dbg.exitDecision(68);}

            switch (alt68) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: args+= VAR
                    {
                    dbg.location(1206,23);
                    args=(Token)match(input,VAR,FOLLOW_VAR_in_function_def3062); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    args_tree = (Object)adaptor.create(args);
                    adaptor.addChild(root_0, args_tree);
                    }
                    if (list_args==null) list_args=new ArrayList();
                    list_args.add(args);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(68);}

            dbg.location(1206,30);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1206:30: ( ',' args+= VAR )*
            try { dbg.enterSubRule(69);

            loop69:
            do {
                int alt69=2;
                try { dbg.enterDecision(69);

                int LA69_0 = input.LA(1);

                if ( (LA69_0==51) ) {
                    alt69=1;
                }


                } finally {dbg.exitDecision(69);}

                switch (alt69) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1206:31: ',' args+= VAR
            	    {
            	    dbg.location(1206,31);
            	    char_literal120=(Token)match(input,51,FOLLOW_51_in_function_def3066); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal120_tree = (Object)adaptor.create(char_literal120);
            	    adaptor.addChild(root_0, char_literal120_tree);
            	    }
            	    dbg.location(1206,39);
            	    args=(Token)match(input,VAR,FOLLOW_VAR_in_function_def3070); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    args_tree = (Object)adaptor.create(args);
            	    adaptor.addChild(root_0, args_tree);
            	    }
            	    if (list_args==null) list_args=new ArrayList();
            	    list_args.add(args);


            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);
            } finally {dbg.exitSubRule(69);}

            dbg.location(1206,48);
            char_literal121=(Token)match(input,52,FOLLOW_52_in_function_def3075); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal121_tree = (Object)adaptor.create(char_literal121);
            adaptor.addChild(root_0, char_literal121_tree);
            }
            dbg.location(1206,52);
            char_literal122=(Token)match(input,29,FOLLOW_29_in_function_def3077); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal122_tree = (Object)adaptor.create(char_literal122);
            adaptor.addChild(root_0, char_literal122_tree);
            }
            dbg.location(1206,60);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1206:60: (decs+= decl[block_array] )?
            int alt70=2;
            try { dbg.enterSubRule(70);
            try { dbg.enterDecision(70);

            int LA70_0 = input.LA(1);

            if ( (LA70_0==VAR) ) {
                int LA70_1 = input.LA(2);

                if ( (LA70_1==38) ) {
                    alt70=1;
                }
            }
            } finally {dbg.exitDecision(70);}

            switch (alt70) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: decs+= decl[block_array]
                    {
                    dbg.location(1206,60);
                    pushFollow(FOLLOW_decl_in_function_def3081);
                    decs=decl(block_array);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, decs.getTree());
                    if (list_decs==null) list_decs=new ArrayList();
                    list_decs.add(decs.getTree());


                    }
                    break;

            }
            } finally {dbg.exitSubRule(70);}

            dbg.location(1206,81);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1206:81: ( ';' decs+= decl[block_array] )*
            try { dbg.enterSubRule(71);

            loop71:
            do {
                int alt71=2;
                try { dbg.enterDecision(71);

                int LA71_0 = input.LA(1);

                if ( (LA71_0==31) ) {
                    int LA71_1 = input.LA(2);

                    if ( (LA71_1==VAR) ) {
                        int LA71_3 = input.LA(3);

                        if ( (LA71_3==38) ) {
                            alt71=1;
                        }


                    }


                }


                } finally {dbg.exitDecision(71);}

                switch (alt71) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1206:82: ';' decs+= decl[block_array]
            	    {
            	    dbg.location(1206,82);
            	    char_literal123=(Token)match(input,31,FOLLOW_31_in_function_def3086); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal123_tree = (Object)adaptor.create(char_literal123);
            	    adaptor.addChild(root_0, char_literal123_tree);
            	    }
            	    dbg.location(1206,90);
            	    pushFollow(FOLLOW_decl_in_function_def3090);
            	    decs=decl(block_array);

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, decs.getTree());
            	    if (list_decs==null) list_decs=new ArrayList();
            	    list_decs.add(decs.getTree());


            	    }
            	    break;

            	default :
            	    break loop71;
                }
            } while (true);
            } finally {dbg.exitSubRule(71);}

            dbg.location(1206,112);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1206:112: ( ';' )?
            int alt72=2;
            try { dbg.enterSubRule(72);
            try { dbg.enterDecision(72);

            int LA72_0 = input.LA(1);

            if ( (LA72_0==31) ) {
                alt72=1;
            }
            } finally {dbg.exitDecision(72);}

            switch (alt72) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: ';'
                    {
                    dbg.location(1206,112);
                    char_literal124=(Token)match(input,31,FOLLOW_31_in_function_def3095); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal124_tree = (Object)adaptor.create(char_literal124);
                    adaptor.addChild(root_0, char_literal124_tree);
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(72);}

            dbg.location(1206,119);
            pushFollow(FOLLOW_expr_in_function_def3100);
            e1=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, e1.getTree());
            dbg.location(1206,125);
            char_literal125=(Token)match(input,30,FOLLOW_30_in_function_def3102); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal125_tree = (Object)adaptor.create(char_literal125);
            adaptor.addChild(root_0, char_literal125_tree);
            }
            dbg.location(1206,129);
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
        dbg.location(1225, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1228:1: conditional_expression returns [Object result] : d= disjunction ( '=>' expr '|' expr )? ;
    public final RuleSet2Parser.conditional_expression_return conditional_expression() throws RecognitionException {
        RuleSet2Parser.conditional_expression_return retval = new RuleSet2Parser.conditional_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal126=null;
        Token char_literal128=null;
        RuleSet2Parser.disjunction_return d = null;

        RuleSet2Parser.expr_return expr127 = null;

        RuleSet2Parser.expr_return expr129 = null;


        Object string_literal126_tree=null;
        Object char_literal128_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "conditional_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1228, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1229:2: (d= disjunction ( '=>' expr '|' expr )? )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1229:5: d= disjunction ( '=>' expr '|' expr )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(1229,6);
            pushFollow(FOLLOW_disjunction_in_conditional_expression3124);
            d=disjunction();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, d.getTree());
            dbg.location(1229,19);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1229:19: ( '=>' expr '|' expr )?
            int alt73=2;
            try { dbg.enterSubRule(73);
            try { dbg.enterDecision(73);

            int LA73_0 = input.LA(1);

            if ( (LA73_0==49) ) {
                alt73=1;
            }
            } finally {dbg.exitDecision(73);}

            switch (alt73) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1229:20: '=>' expr '|' expr
                    {
                    dbg.location(1229,20);
                    string_literal126=(Token)match(input,49,FOLLOW_49_in_conditional_expression3127); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal126_tree = (Object)adaptor.create(string_literal126);
                    adaptor.addChild(root_0, string_literal126_tree);
                    }
                    dbg.location(1229,25);
                    pushFollow(FOLLOW_expr_in_conditional_expression3129);
                    expr127=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr127.getTree());
                    dbg.location(1229,30);
                    char_literal128=(Token)match(input,76,FOLLOW_76_in_conditional_expression3131); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal128_tree = (Object)adaptor.create(char_literal128);
                    adaptor.addChild(root_0, char_literal128_tree);
                    }
                    dbg.location(1229,34);
                    pushFollow(FOLLOW_expr_in_conditional_expression3133);
                    expr129=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr129.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(73);}

            dbg.location(1230,5);
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
        dbg.location(1231, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1234:1: disjunction returns [Object result] : me1= conjunction (op= '||' me2= conjunction )* ;
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
        dbg.location(1234, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1239:2: (me1= conjunction (op= '||' me2= conjunction )* )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1239:4: me1= conjunction (op= '||' me2= conjunction )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(1239,7);
            pushFollow(FOLLOW_conjunction_in_disjunction3165);
            me1=conjunction();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, me1.getTree());
            dbg.location(1239,20);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1239:20: (op= '||' me2= conjunction )*
            try { dbg.enterSubRule(74);

            loop74:
            do {
                int alt74=2;
                try { dbg.enterDecision(74);

                int LA74_0 = input.LA(1);

                if ( (LA74_0==77) ) {
                    alt74=1;
                }


                } finally {dbg.exitDecision(74);}

                switch (alt74) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1239:21: op= '||' me2= conjunction
            	    {
            	    dbg.location(1239,23);
            	    op=(Token)match(input,77,FOLLOW_77_in_disjunction3170); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    adaptor.addChild(root_0, op_tree);
            	    }
            	    dbg.location(1239,32);
            	    pushFollow(FOLLOW_conjunction_in_disjunction3174);
            	    me2=conjunction();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, me2.getTree());
            	    dbg.location(1239,44);
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
            	    break loop74;
                }
            } while (true);
            } finally {dbg.exitSubRule(74);}

            dbg.location(1249,6);
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
        dbg.location(1255, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1257:1: conjunction returns [Object result] : me1= equality_expr (op= '&&' me2= equality_expr )* ;
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
        dbg.location(1257, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1262:2: (me1= equality_expr (op= '&&' me2= equality_expr )* )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1262:4: me1= equality_expr (op= '&&' me2= equality_expr )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(1262,7);
            pushFollow(FOLLOW_equality_expr_in_conjunction3204);
            me1=equality_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, me1.getTree());
            dbg.location(1262,22);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1262:22: (op= '&&' me2= equality_expr )*
            try { dbg.enterSubRule(75);

            loop75:
            do {
                int alt75=2;
                try { dbg.enterDecision(75);

                int LA75_0 = input.LA(1);

                if ( (LA75_0==78) ) {
                    alt75=1;
                }


                } finally {dbg.exitDecision(75);}

                switch (alt75) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1262:23: op= '&&' me2= equality_expr
            	    {
            	    dbg.location(1262,25);
            	    op=(Token)match(input,78,FOLLOW_78_in_conjunction3209); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    op_tree = (Object)adaptor.create(op);
            	    adaptor.addChild(root_0, op_tree);
            	    }
            	    dbg.location(1262,34);
            	    pushFollow(FOLLOW_equality_expr_in_conjunction3213);
            	    me2=equality_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, me2.getTree());
            	    dbg.location(1262,49);
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
            	    break loop75;
                }
            } while (true);
            } finally {dbg.exitSubRule(75);}

            dbg.location(1272,7);
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
        dbg.location(1278, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1280:1: equality_expr returns [Object result] : me1= add_expr (op= predop me2= add_expr )* ;
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
        dbg.location(1280, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1285:2: (me1= add_expr (op= predop me2= add_expr )* )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1285:4: me1= add_expr (op= predop me2= add_expr )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(1285,7);
            pushFollow(FOLLOW_add_expr_in_equality_expr3244);
            me1=add_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, me1.getTree());
            dbg.location(1285,17);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1285:17: (op= predop me2= add_expr )*
            try { dbg.enterSubRule(76);

            loop76:
            do {
                int alt76=2;
                try { dbg.enterDecision(76);

                int LA76_0 = input.LA(1);

                if ( ((LA76_0>=18 && LA76_0<=26)) ) {
                    alt76=1;
                }


                } finally {dbg.exitDecision(76);}

                switch (alt76) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1285:18: op= predop me2= add_expr
            	    {
            	    dbg.location(1285,20);
            	    pushFollow(FOLLOW_predop_in_equality_expr3249);
            	    op=predop();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, op.getTree());
            	    dbg.location(1285,31);
            	    pushFollow(FOLLOW_add_expr_in_equality_expr3253);
            	    me2=add_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, me2.getTree());
            	    dbg.location(1285,41);
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
            	    break loop76;
                }
            } while (true);
            } finally {dbg.exitSubRule(76);}

            dbg.location(1294,6);
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
        dbg.location(1300, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1303:1: add_expr returns [Object result] : me1= mult_expr (op= add_op me2= mult_expr )* ;
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
        dbg.location(1303, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1308:2: (me1= mult_expr (op= add_op me2= mult_expr )* )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1308:4: me1= mult_expr (op= add_op me2= mult_expr )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(1308,7);
            pushFollow(FOLLOW_mult_expr_in_add_expr3287);
            me1=mult_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, me1.getTree());
            dbg.location(1308,18);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1308:18: (op= add_op me2= mult_expr )*
            try { dbg.enterSubRule(77);

            loop77:
            do {
                int alt77=2;
                try { dbg.enterDecision(77);

                int LA77_0 = input.LA(1);

                if ( ((LA77_0>=27 && LA77_0<=28)) ) {
                    alt77=1;
                }


                } finally {dbg.exitDecision(77);}

                switch (alt77) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1308:19: op= add_op me2= mult_expr
            	    {
            	    dbg.location(1308,21);
            	    pushFollow(FOLLOW_add_op_in_add_expr3292);
            	    op=add_op();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, op.getTree());
            	    dbg.location(1308,32);
            	    pushFollow(FOLLOW_mult_expr_in_add_expr3296);
            	    me2=mult_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, me2.getTree());
            	    dbg.location(1308,44);
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
            	    break loop77;
                }
            } while (true);
            } finally {dbg.exitSubRule(77);}

            dbg.location(1318,6);
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
        dbg.location(1324, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1327:1: mult_op : ( '*' | '/' | '%' );
    public final RuleSet2Parser.mult_op_return mult_op() throws RecognitionException {
        RuleSet2Parser.mult_op_return retval = new RuleSet2Parser.mult_op_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set130=null;

        Object set130_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "mult_op");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1327, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1327:8: ( '*' | '/' | '%' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(1327,8);
            set130=(Token)input.LT(1);
            if ( (input.LA(1)>=79 && input.LA(1)<=81) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set130));
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
        dbg.location(1327, 21);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1329:1: mult_expr returns [Object result] : me1= unary_expr (op= mult_op me2= unary_expr )* ;
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
        dbg.location(1329, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1334:2: (me1= unary_expr (op= mult_op me2= unary_expr )* )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1334:4: me1= unary_expr (op= mult_op me2= unary_expr )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(1334,7);
            pushFollow(FOLLOW_unary_expr_in_mult_expr3344);
            me1=unary_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, me1.getTree());
            dbg.location(1334,19);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1334:19: (op= mult_op me2= unary_expr )*
            try { dbg.enterSubRule(78);

            loop78:
            do {
                int alt78=2;
                try { dbg.enterDecision(78);

                int LA78_0 = input.LA(1);

                if ( ((LA78_0>=79 && LA78_0<=81)) ) {
                    alt78=1;
                }


                } finally {dbg.exitDecision(78);}

                switch (alt78) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1334:20: op= mult_op me2= unary_expr
            	    {
            	    dbg.location(1334,22);
            	    pushFollow(FOLLOW_mult_op_in_mult_expr3349);
            	    op=mult_op();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, op.getTree());
            	    dbg.location(1334,34);
            	    pushFollow(FOLLOW_unary_expr_in_mult_expr3353);
            	    me2=unary_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, me2.getTree());
            	    dbg.location(1335,2);
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
            	    break loop78;
                }
            } while (true);
            } finally {dbg.exitSubRule(78);}

            dbg.location(1347,7);
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
        dbg.location(1355, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1358:1: unary_expr returns [Object result] options {backtrack=true; } : ( 'not' unary_expr | 'seen' rx= STRING must_be[\"in\"] vd= var_domain ':' v= VAR (t= timeframe )? | 'seen' rx_1= STRING op= ( 'before' | 'after' ) rx_2= STRING must_be[\"in\"] vd= var_domain ':' v= VAR | vd= var_domain ':' v= VAR pop= predop e= expr t= timeframe | vd= var_domain ':' v= VAR t= timeframe | oe= operator_expr );
    public final RuleSet2Parser.unary_expr_return unary_expr() throws RecognitionException {
        RuleSet2Parser.unary_expr_return retval = new RuleSet2Parser.unary_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token rx=null;
        Token v=null;
        Token rx_1=null;
        Token op=null;
        Token rx_2=null;
        Token string_literal131=null;
        Token string_literal133=null;
        Token char_literal135=null;
        Token string_literal136=null;
        Token char_literal138=null;
        Token char_literal139=null;
        Token char_literal140=null;
        RuleSet2Parser.var_domain_return vd = null;

        RuleSet2Parser.timeframe_return t = null;

        RuleSet2Parser.predop_return pop = null;

        RuleSet2Parser.expr_return e = null;

        RuleSet2Parser.operator_expr_return oe = null;

        RuleSet2Parser.unary_expr_return unary_expr132 = null;

        RuleSet2Parser.must_be_return must_be134 = null;

        RuleSet2Parser.must_be_return must_be137 = null;


        Object rx_tree=null;
        Object v_tree=null;
        Object rx_1_tree=null;
        Object op_tree=null;
        Object rx_2_tree=null;
        Object string_literal131_tree=null;
        Object string_literal133_tree=null;
        Object char_literal135_tree=null;
        Object string_literal136_tree=null;
        Object char_literal138_tree=null;
        Object char_literal139_tree=null;
        Object char_literal140_tree=null;




        try { dbg.enterRule(getGrammarFileName(), "unary_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1358, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1362:2: ( 'not' unary_expr | 'seen' rx= STRING must_be[\"in\"] vd= var_domain ':' v= VAR (t= timeframe )? | 'seen' rx_1= STRING op= ( 'before' | 'after' ) rx_2= STRING must_be[\"in\"] vd= var_domain ':' v= VAR | vd= var_domain ':' v= VAR pop= predop e= expr t= timeframe | vd= var_domain ':' v= VAR t= timeframe | oe= operator_expr )
            int alt80=6;
            try { dbg.enterDecision(80);

            try {
                isCyclicDecision = true;
                alt80 = dfa80.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(80);}

            switch (alt80) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1362:4: 'not' unary_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(1362,4);
                    string_literal131=(Token)match(input,61,FOLLOW_61_in_unary_expr3393); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal131_tree = (Object)adaptor.create(string_literal131);
                    adaptor.addChild(root_0, string_literal131_tree);
                    }
                    dbg.location(1362,10);
                    pushFollow(FOLLOW_unary_expr_in_unary_expr3395);
                    unary_expr132=unary_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expr132.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1363:4: 'seen' rx= STRING must_be[\"in\"] vd= var_domain ':' v= VAR (t= timeframe )?
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(1363,4);
                    string_literal133=(Token)match(input,82,FOLLOW_82_in_unary_expr3402); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal133_tree = (Object)adaptor.create(string_literal133);
                    adaptor.addChild(root_0, string_literal133_tree);
                    }
                    dbg.location(1363,13);
                    rx=(Token)match(input,STRING,FOLLOW_STRING_in_unary_expr3406); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    rx_tree = (Object)adaptor.create(rx);
                    adaptor.addChild(root_0, rx_tree);
                    }
                    dbg.location(1363,21);
                    pushFollow(FOLLOW_must_be_in_unary_expr3408);
                    must_be134=must_be("in");

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, must_be134.getTree());
                    dbg.location(1363,37);
                    pushFollow(FOLLOW_var_domain_in_unary_expr3413);
                    vd=var_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vd.getTree());
                    dbg.location(1363,49);
                    char_literal135=(Token)match(input,40,FOLLOW_40_in_unary_expr3415); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal135_tree = (Object)adaptor.create(char_literal135);
                    adaptor.addChild(root_0, char_literal135_tree);
                    }
                    dbg.location(1363,54);
                    v=(Token)match(input,VAR,FOLLOW_VAR_in_unary_expr3419); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    v_tree = (Object)adaptor.create(v);
                    adaptor.addChild(root_0, v_tree);
                    }
                    dbg.location(1363,60);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1363:60: (t= timeframe )?
                    int alt79=2;
                    try { dbg.enterSubRule(79);
                    try { dbg.enterDecision(79);

                    try {
                        isCyclicDecision = true;
                        alt79 = dfa79.predict(input);
                    }
                    catch (NoViableAltException nvae) {
                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(79);}

                    switch (alt79) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: t= timeframe
                            {
                            dbg.location(1363,60);
                            pushFollow(FOLLOW_timeframe_in_unary_expr3423);
                            t=timeframe();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, t.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(79);}

                    dbg.location(1363,72);
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

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1374:4: 'seen' rx_1= STRING op= ( 'before' | 'after' ) rx_2= STRING must_be[\"in\"] vd= var_domain ':' v= VAR
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(1374,4);
                    string_literal136=(Token)match(input,82,FOLLOW_82_in_unary_expr3431); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal136_tree = (Object)adaptor.create(string_literal136);
                    adaptor.addChild(root_0, string_literal136_tree);
                    }
                    dbg.location(1374,15);
                    rx_1=(Token)match(input,STRING,FOLLOW_STRING_in_unary_expr3435); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    rx_1_tree = (Object)adaptor.create(rx_1);
                    adaptor.addChild(root_0, rx_1_tree);
                    }
                    dbg.location(1374,25);
                    op=(Token)input.LT(1);
                    if ( input.LA(1)==59||input.LA(1)==83 ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(op));
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(1374,51);
                    rx_2=(Token)match(input,STRING,FOLLOW_STRING_in_unary_expr3449); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    rx_2_tree = (Object)adaptor.create(rx_2);
                    adaptor.addChild(root_0, rx_2_tree);
                    }
                    dbg.location(1374,60);
                    pushFollow(FOLLOW_must_be_in_unary_expr3452);
                    must_be137=must_be("in");

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, must_be137.getTree());
                    dbg.location(1374,76);
                    pushFollow(FOLLOW_var_domain_in_unary_expr3457);
                    vd=var_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vd.getTree());
                    dbg.location(1374,88);
                    char_literal138=(Token)match(input,40,FOLLOW_40_in_unary_expr3459); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal138_tree = (Object)adaptor.create(char_literal138);
                    adaptor.addChild(root_0, char_literal138_tree);
                    }
                    dbg.location(1374,93);
                    v=(Token)match(input,VAR,FOLLOW_VAR_in_unary_expr3463); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    v_tree = (Object)adaptor.create(v);
                    adaptor.addChild(root_0, v_tree);
                    }
                    dbg.location(1374,98);
                    if ( state.backtracking==0 ) {

                            	      	HashMap tmp = new HashMap();
                      	      	tmp.put("type","seen_compare");
                      	      	tmp.put("domain",(vd!=null?input.toString(vd.start,vd.stop):null));
                      	      	tmp.put("regexp_1",strip_string((rx_1!=null?rx_1.getText():null)));
                      	      	tmp.put("regexp_2",strip_string((rx_2!=null?rx_2.getText():null)));	      	
                      	      	tmp.put("var",(v!=null?v.getText():null));
                      	      	tmp.put("op",(op!=null?op.getText():null));
                      	      	retval.result = tmp;		
                      	
                    }

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1384:4: vd= var_domain ':' v= VAR pop= predop e= expr t= timeframe
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(1384,6);
                    pushFollow(FOLLOW_var_domain_in_unary_expr3472);
                    vd=var_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vd.getTree());
                    dbg.location(1384,18);
                    char_literal139=(Token)match(input,40,FOLLOW_40_in_unary_expr3474); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal139_tree = (Object)adaptor.create(char_literal139);
                    adaptor.addChild(root_0, char_literal139_tree);
                    }
                    dbg.location(1384,23);
                    v=(Token)match(input,VAR,FOLLOW_VAR_in_unary_expr3478); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    v_tree = (Object)adaptor.create(v);
                    adaptor.addChild(root_0, v_tree);
                    }
                    dbg.location(1384,31);
                    pushFollow(FOLLOW_predop_in_unary_expr3482);
                    pop=predop();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pop.getTree());
                    dbg.location(1384,40);
                    pushFollow(FOLLOW_expr_in_unary_expr3486);
                    e=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
                    dbg.location(1384,47);
                    pushFollow(FOLLOW_timeframe_in_unary_expr3490);
                    t=timeframe();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, t.getTree());
                    dbg.location(1384,59);
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

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1396:4: vd= var_domain ':' v= VAR t= timeframe
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(1396,6);
                    pushFollow(FOLLOW_var_domain_in_unary_expr3500);
                    vd=var_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vd.getTree());
                    dbg.location(1396,18);
                    char_literal140=(Token)match(input,40,FOLLOW_40_in_unary_expr3502); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal140_tree = (Object)adaptor.create(char_literal140);
                    adaptor.addChild(root_0, char_literal140_tree);
                    }
                    dbg.location(1396,23);
                    v=(Token)match(input,VAR,FOLLOW_VAR_in_unary_expr3506); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    v_tree = (Object)adaptor.create(v);
                    adaptor.addChild(root_0, v_tree);
                    }
                    dbg.location(1396,29);
                    pushFollow(FOLLOW_timeframe_in_unary_expr3510);
                    t=timeframe();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, t.getTree());
                    dbg.location(1396,40);
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

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1407:4: oe= operator_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(1407,6);
                    pushFollow(FOLLOW_operator_expr_in_unary_expr3519);
                    oe=operator_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, oe.getTree());
                    dbg.location(1407,21);
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
        dbg.location(1410, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1413:1: operator_expr returns [Object result] : f= factor (o= operator )* ;
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
        dbg.location(1413, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1418:2: (f= factor (o= operator )* )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1418:4: f= factor (o= operator )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(1418,5);
            pushFollow(FOLLOW_factor_in_operator_expr3548);
            f=factor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, f.getTree());
            dbg.location(1418,14);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1418:14: (o= operator )*
            try { dbg.enterSubRule(81);

            loop81:
            do {
                int alt81=2;
                try { dbg.enterDecision(81);

                int LA81_0 = input.LA(1);

                if ( ((LA81_0>=84 && LA81_0<=105)) ) {
                    alt81=1;
                }


                } finally {dbg.exitDecision(81);}

                switch (alt81) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1418:15: o= operator
            	    {
            	    dbg.location(1418,16);
            	    pushFollow(FOLLOW_operator_in_operator_expr3554);
            	    o=operator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, o.getTree());
            	    dbg.location(1418,26);
            	    if ( state.backtracking==0 ) {
            	       operators.add(o); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop81;
                }
            } while (true);
            } finally {dbg.exitSubRule(81);}

            dbg.location(1418,50);
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
        dbg.location(1454, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1456:10: fragment operator returns [String oper,ArrayList exprs] : o= ( '.pick' | '.match' | '.length' | '.replace' | '.as' | '.head' | '.tail' | '.sort' | '.filter' | '.map' | '.uc' | '.lc' | '.split' | '.join' | '.query' | '.has' | '.union' | '.difference' | '.intersection' | '.unique' | '.once' | '.duplicates' ) '(' (e= expr ( ',' e1= expr )* )? ')' ;
    public final RuleSet2Parser.operator_return operator() throws RecognitionException {
        RuleSet2Parser.operator_return retval = new RuleSet2Parser.operator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token o=null;
        Token char_literal141=null;
        Token char_literal142=null;
        Token char_literal143=null;
        RuleSet2Parser.expr_return e = null;

        RuleSet2Parser.expr_return e1 = null;


        Object o_tree=null;
        Object char_literal141_tree=null;
        Object char_literal142_tree=null;
        Object char_literal143_tree=null;

        	
        	ArrayList rexprs = new ArrayList();

        try { dbg.enterRule(getGrammarFileName(), "operator");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1456, 10);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1461:2: (o= ( '.pick' | '.match' | '.length' | '.replace' | '.as' | '.head' | '.tail' | '.sort' | '.filter' | '.map' | '.uc' | '.lc' | '.split' | '.join' | '.query' | '.has' | '.union' | '.difference' | '.intersection' | '.unique' | '.once' | '.duplicates' ) '(' (e= expr ( ',' e1= expr )* )? ')' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1461:4: o= ( '.pick' | '.match' | '.length' | '.replace' | '.as' | '.head' | '.tail' | '.sort' | '.filter' | '.map' | '.uc' | '.lc' | '.split' | '.join' | '.query' | '.has' | '.union' | '.difference' | '.intersection' | '.unique' | '.once' | '.duplicates' ) '(' (e= expr ( ',' e1= expr )* )? ')'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(1461,5);
            o=(Token)input.LT(1);
            if ( (input.LA(1)>=84 && input.LA(1)<=105) ) {
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

            dbg.location(1464,25);
            char_literal141=(Token)match(input,50,FOLLOW_50_in_operator3671); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal141_tree = (Object)adaptor.create(char_literal141);
            adaptor.addChild(root_0, char_literal141_tree);
            }
            dbg.location(1464,29);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1464:29: (e= expr ( ',' e1= expr )* )?
            int alt83=2;
            try { dbg.enterSubRule(83);
            try { dbg.enterDecision(83);

            int LA83_0 = input.LA(1);

            if ( ((LA83_0>=VAR && LA83_0<=INT)||LA83_0==FLOAT||(LA83_0>=STRING && LA83_0<=REGEXP)||LA83_0==29||LA83_0==50||LA83_0==61||LA83_0==75||LA83_0==82||(LA83_0>=106 && LA83_0<=108)||(LA83_0>=110 && LA83_0<=113)) ) {
                alt83=1;
            }
            } finally {dbg.exitDecision(83);}

            switch (alt83) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1464:30: e= expr ( ',' e1= expr )*
                    {
                    dbg.location(1464,31);
                    pushFollow(FOLLOW_expr_in_operator3676);
                    e=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
                    dbg.location(1464,37);
                    if ( state.backtracking==0 ) {
                      rexprs.add(e.result); 
                    }
                    dbg.location(1464,62);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1464:62: ( ',' e1= expr )*
                    try { dbg.enterSubRule(82);

                    loop82:
                    do {
                        int alt82=2;
                        try { dbg.enterDecision(82);

                        int LA82_0 = input.LA(1);

                        if ( (LA82_0==51) ) {
                            alt82=1;
                        }


                        } finally {dbg.exitDecision(82);}

                        switch (alt82) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1464:63: ',' e1= expr
                    	    {
                    	    dbg.location(1464,63);
                    	    char_literal142=(Token)match(input,51,FOLLOW_51_in_operator3681); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal142_tree = (Object)adaptor.create(char_literal142);
                    	    adaptor.addChild(root_0, char_literal142_tree);
                    	    }
                    	    dbg.location(1464,69);
                    	    pushFollow(FOLLOW_expr_in_operator3685);
                    	    e1=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, e1.getTree());
                    	    dbg.location(1464,75);
                    	    if ( state.backtracking==0 ) {
                    	      rexprs.add(e1.result); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop82;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(82);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(83);}

            dbg.location(1464,106);
            char_literal143=(Token)match(input,52,FOLLOW_52_in_operator3694); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal143_tree = (Object)adaptor.create(char_literal143);
            adaptor.addChild(root_0, char_literal143_tree);
            }
            dbg.location(1464,110);
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
        dbg.location(1469, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1473:1: factor returns [Object result] options {backtrack=true; } : (v= INT | v= STRING | v= FLOAT | v= ( 'true' | 'false' ) | vr= REGEXP | v= VAR '[' e= expr ']' | d= var_domain ':' v= VAR | 'current' d= var_domain ':' v= VAR | 'history' e= expr d= var_domain ':' v= VAR | n= namespace p= VAR '(' (e= expr ( ',' )? )* ')' | v= VAR '(' (e= expr ( ',' )? )* ')' | '[' e= expr ( ',' e2= expr )* ']' | '{' h1= hash_line ( ',' h2= hash_line )* '}' | v= VAR | '(' e= expr ')' );
    public final RuleSet2Parser.factor_return factor() throws RecognitionException {
        RuleSet2Parser.factor_return retval = new RuleSet2Parser.factor_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token v=null;
        Token vr=null;
        Token p=null;
        Token char_literal144=null;
        Token char_literal145=null;
        Token char_literal146=null;
        Token string_literal147=null;
        Token char_literal148=null;
        Token string_literal149=null;
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
        Token char_literal163=null;
        Token char_literal164=null;
        RuleSet2Parser.expr_return e = null;

        RuleSet2Parser.var_domain_return d = null;

        RuleSet2Parser.namespace_return n = null;

        RuleSet2Parser.expr_return e2 = null;

        RuleSet2Parser.hash_line_return h1 = null;

        RuleSet2Parser.hash_line_return h2 = null;


        Object v_tree=null;
        Object vr_tree=null;
        Object p_tree=null;
        Object char_literal144_tree=null;
        Object char_literal145_tree=null;
        Object char_literal146_tree=null;
        Object string_literal147_tree=null;
        Object char_literal148_tree=null;
        Object string_literal149_tree=null;
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
        Object char_literal163_tree=null;
        Object char_literal164_tree=null;


              ArrayList exprs2 = new ArrayList();


        try { dbg.enterRule(getGrammarFileName(), "factor");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1473, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1478:2: (v= INT | v= STRING | v= FLOAT | v= ( 'true' | 'false' ) | vr= REGEXP | v= VAR '[' e= expr ']' | d= var_domain ':' v= VAR | 'current' d= var_domain ':' v= VAR | 'history' e= expr d= var_domain ':' v= VAR | n= namespace p= VAR '(' (e= expr ( ',' )? )* ')' | v= VAR '(' (e= expr ( ',' )? )* ')' | '[' e= expr ( ',' e2= expr )* ']' | '{' h1= hash_line ( ',' h2= hash_line )* '}' | v= VAR | '(' e= expr ')' )
            int alt90=15;
            try { dbg.enterDecision(90);

            try {
                isCyclicDecision = true;
                alt90 = dfa90.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(90);}

            switch (alt90) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1478:4: v= INT
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(1478,5);
                    v=(Token)match(input,INT,FOLLOW_INT_in_factor3732); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    v_tree = (Object)adaptor.create(v);
                    adaptor.addChild(root_0, v_tree);
                    }
                    dbg.location(1478,10);
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

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1484:9: v= STRING
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(1484,10);
                    v=(Token)match(input,STRING,FOLLOW_STRING_in_factor3747); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    v_tree = (Object)adaptor.create(v);
                    adaptor.addChild(root_0, v_tree);
                    }
                    dbg.location(1484,20);
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

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1490:9: v= FLOAT
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(1490,10);
                    v=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_factor3767); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    v_tree = (Object)adaptor.create(v);
                    adaptor.addChild(root_0, v_tree);
                    }
                    dbg.location(1490,19);
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

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1496:9: v= ( 'true' | 'false' )
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(1496,10);
                    v=(Token)input.LT(1);
                    if ( (input.LA(1)>=106 && input.LA(1)<=107) ) {
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

                    dbg.location(1496,31);
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

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1502:9: vr= REGEXP
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(1502,11);
                    vr=(Token)match(input,REGEXP,FOLLOW_REGEXP_in_factor3807); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    vr_tree = (Object)adaptor.create(vr);
                    adaptor.addChild(root_0, vr_tree);
                    }
                    dbg.location(1502,19);
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

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1508:9: v= VAR '[' e= expr ']'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(1508,10);
                    v=(Token)match(input,VAR,FOLLOW_VAR_in_factor3821); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    v_tree = (Object)adaptor.create(v);
                    adaptor.addChild(root_0, v_tree);
                    }
                    dbg.location(1508,15);
                    char_literal144=(Token)match(input,108,FOLLOW_108_in_factor3823); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal144_tree = (Object)adaptor.create(char_literal144);
                    adaptor.addChild(root_0, char_literal144_tree);
                    }
                    dbg.location(1508,20);
                    pushFollow(FOLLOW_expr_in_factor3827);
                    e=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
                    dbg.location(1508,26);
                    char_literal145=(Token)match(input,109,FOLLOW_109_in_factor3829); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal145_tree = (Object)adaptor.create(char_literal145);
                    adaptor.addChild(root_0, char_literal145_tree);
                    }
                    dbg.location(1508,31);
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

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1522:9: d= var_domain ':' v= VAR
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(1522,10);
                    pushFollow(FOLLOW_var_domain_in_factor3844);
                    d=var_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, d.getTree());
                    dbg.location(1522,22);
                    char_literal146=(Token)match(input,40,FOLLOW_40_in_factor3846); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal146_tree = (Object)adaptor.create(char_literal146);
                    adaptor.addChild(root_0, char_literal146_tree);
                    }
                    dbg.location(1522,27);
                    v=(Token)match(input,VAR,FOLLOW_VAR_in_factor3850); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    v_tree = (Object)adaptor.create(v);
                    adaptor.addChild(root_0, v_tree);
                    }
                    dbg.location(1522,32);
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

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1529:9: 'current' d= var_domain ':' v= VAR
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(1529,9);
                    string_literal147=(Token)match(input,110,FOLLOW_110_in_factor3862); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal147_tree = (Object)adaptor.create(string_literal147);
                    adaptor.addChild(root_0, string_literal147_tree);
                    }
                    dbg.location(1529,20);
                    pushFollow(FOLLOW_var_domain_in_factor3866);
                    d=var_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, d.getTree());
                    dbg.location(1529,32);
                    char_literal148=(Token)match(input,40,FOLLOW_40_in_factor3868); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal148_tree = (Object)adaptor.create(char_literal148);
                    adaptor.addChild(root_0, char_literal148_tree);
                    }
                    dbg.location(1529,37);
                    v=(Token)match(input,VAR,FOLLOW_VAR_in_factor3872); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    v_tree = (Object)adaptor.create(v);
                    adaptor.addChild(root_0, v_tree);
                    }
                    dbg.location(1529,42);
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

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1536:9: 'history' e= expr d= var_domain ':' v= VAR
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(1536,9);
                    string_literal149=(Token)match(input,111,FOLLOW_111_in_factor3885); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal149_tree = (Object)adaptor.create(string_literal149);
                    adaptor.addChild(root_0, string_literal149_tree);
                    }
                    dbg.location(1536,20);
                    pushFollow(FOLLOW_expr_in_factor3889);
                    e=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
                    dbg.location(1536,27);
                    pushFollow(FOLLOW_var_domain_in_factor3893);
                    d=var_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, d.getTree());
                    dbg.location(1536,39);
                    char_literal150=(Token)match(input,40,FOLLOW_40_in_factor3895); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal150_tree = (Object)adaptor.create(char_literal150);
                    adaptor.addChild(root_0, char_literal150_tree);
                    }
                    dbg.location(1536,44);
                    v=(Token)match(input,VAR,FOLLOW_VAR_in_factor3899); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    v_tree = (Object)adaptor.create(v);
                    adaptor.addChild(root_0, v_tree);
                    }
                    dbg.location(1536,49);
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

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1546:9: n= namespace p= VAR '(' (e= expr ( ',' )? )* ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(1546,10);
                    pushFollow(FOLLOW_namespace_in_factor3913);
                    n=namespace();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, n.getTree());
                    dbg.location(1546,22);
                    p=(Token)match(input,VAR,FOLLOW_VAR_in_factor3917); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    p_tree = (Object)adaptor.create(p);
                    adaptor.addChild(root_0, p_tree);
                    }
                    dbg.location(1546,27);
                    char_literal151=(Token)match(input,50,FOLLOW_50_in_factor3919); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal151_tree = (Object)adaptor.create(char_literal151);
                    adaptor.addChild(root_0, char_literal151_tree);
                    }
                    dbg.location(1546,31);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1546:31: (e= expr ( ',' )? )*
                    try { dbg.enterSubRule(85);

                    loop85:
                    do {
                        int alt85=2;
                        try { dbg.enterDecision(85);

                        int LA85_0 = input.LA(1);

                        if ( ((LA85_0>=VAR && LA85_0<=INT)||LA85_0==FLOAT||(LA85_0>=STRING && LA85_0<=REGEXP)||LA85_0==29||LA85_0==50||LA85_0==61||LA85_0==75||LA85_0==82||(LA85_0>=106 && LA85_0<=108)||(LA85_0>=110 && LA85_0<=113)) ) {
                            alt85=1;
                        }


                        } finally {dbg.exitDecision(85);}

                        switch (alt85) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1546:32: e= expr ( ',' )?
                    	    {
                    	    dbg.location(1546,33);
                    	    pushFollow(FOLLOW_expr_in_factor3924);
                    	    e=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
                    	    dbg.location(1546,39);
                    	    if ( state.backtracking==0 ) {

                    	                  exprs2.add((e!=null?e.result:null));
                    	            	
                    	    }
                    	    dbg.location(1549,8);
                    	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1549:8: ( ',' )?
                    	    int alt84=2;
                    	    try { dbg.enterSubRule(84);
                    	    try { dbg.enterDecision(84);

                    	    int LA84_0 = input.LA(1);

                    	    if ( (LA84_0==51) ) {
                    	        alt84=1;
                    	    }
                    	    } finally {dbg.exitDecision(84);}

                    	    switch (alt84) {
                    	        case 1 :
                    	            dbg.enterAlt(1);

                    	            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: ','
                    	            {
                    	            dbg.location(1549,8);
                    	            char_literal152=(Token)match(input,51,FOLLOW_51_in_factor3935); if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) {
                    	            char_literal152_tree = (Object)adaptor.create(char_literal152);
                    	            adaptor.addChild(root_0, char_literal152_tree);
                    	            }

                    	            }
                    	            break;

                    	    }
                    	    } finally {dbg.exitSubRule(84);}


                    	    }
                    	    break;

                    	default :
                    	    break loop85;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(85);}

                    dbg.location(1549,15);
                    char_literal153=(Token)match(input,52,FOLLOW_52_in_factor3940); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal153_tree = (Object)adaptor.create(char_literal153);
                    adaptor.addChild(root_0, char_literal153_tree);
                    }
                    dbg.location(1549,20);
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

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1556:9: v= VAR '(' (e= expr ( ',' )? )* ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(1556,10);
                    v=(Token)match(input,VAR,FOLLOW_VAR_in_factor3955); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    v_tree = (Object)adaptor.create(v);
                    adaptor.addChild(root_0, v_tree);
                    }
                    dbg.location(1556,15);
                    char_literal154=(Token)match(input,50,FOLLOW_50_in_factor3957); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal154_tree = (Object)adaptor.create(char_literal154);
                    adaptor.addChild(root_0, char_literal154_tree);
                    }
                    dbg.location(1556,19);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1556:19: (e= expr ( ',' )? )*
                    try { dbg.enterSubRule(87);

                    loop87:
                    do {
                        int alt87=2;
                        try { dbg.enterDecision(87);

                        int LA87_0 = input.LA(1);

                        if ( ((LA87_0>=VAR && LA87_0<=INT)||LA87_0==FLOAT||(LA87_0>=STRING && LA87_0<=REGEXP)||LA87_0==29||LA87_0==50||LA87_0==61||LA87_0==75||LA87_0==82||(LA87_0>=106 && LA87_0<=108)||(LA87_0>=110 && LA87_0<=113)) ) {
                            alt87=1;
                        }


                        } finally {dbg.exitDecision(87);}

                        switch (alt87) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1556:20: e= expr ( ',' )?
                    	    {
                    	    dbg.location(1556,21);
                    	    pushFollow(FOLLOW_expr_in_factor3962);
                    	    e=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
                    	    dbg.location(1556,26);
                    	    if ( state.backtracking==0 ) {

                    	                  exprs2.add((e!=null?e.result:null));
                    	            	
                    	    }
                    	    dbg.location(1559,2);
                    	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1559:2: ( ',' )?
                    	    int alt86=2;
                    	    try { dbg.enterSubRule(86);
                    	    try { dbg.enterDecision(86);

                    	    int LA86_0 = input.LA(1);

                    	    if ( (LA86_0==51) ) {
                    	        alt86=1;
                    	    }
                    	    } finally {dbg.exitDecision(86);}

                    	    switch (alt86) {
                    	        case 1 :
                    	            dbg.enterAlt(1);

                    	            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: ','
                    	            {
                    	            dbg.location(1559,2);
                    	            char_literal155=(Token)match(input,51,FOLLOW_51_in_factor3966); if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) {
                    	            char_literal155_tree = (Object)adaptor.create(char_literal155);
                    	            adaptor.addChild(root_0, char_literal155_tree);
                    	            }

                    	            }
                    	            break;

                    	    }
                    	    } finally {dbg.exitSubRule(86);}


                    	    }
                    	    break;

                    	default :
                    	    break loop87;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(87);}

                    dbg.location(1559,9);
                    char_literal156=(Token)match(input,52,FOLLOW_52_in_factor3971); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal156_tree = (Object)adaptor.create(char_literal156);
                    adaptor.addChild(root_0, char_literal156_tree);
                    }
                    dbg.location(1559,13);
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

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1570:9: '[' e= expr ( ',' e2= expr )* ']'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(1570,9);
                    char_literal157=(Token)match(input,108,FOLLOW_108_in_factor3983); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal157_tree = (Object)adaptor.create(char_literal157);
                    adaptor.addChild(root_0, char_literal157_tree);
                    }
                    dbg.location(1570,14);
                    pushFollow(FOLLOW_expr_in_factor3987);
                    e=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
                    dbg.location(1570,20);
                    if ( state.backtracking==0 ) {

                            			exprs2.add((e!=null?e.result:null));
                            		 
                    }
                    dbg.location(1572,12);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1572:12: ( ',' e2= expr )*
                    try { dbg.enterSubRule(88);

                    loop88:
                    do {
                        int alt88=2;
                        try { dbg.enterDecision(88);

                        int LA88_0 = input.LA(1);

                        if ( (LA88_0==51) ) {
                            alt88=1;
                        }


                        } finally {dbg.exitDecision(88);}

                        switch (alt88) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1572:13: ',' e2= expr
                    	    {
                    	    dbg.location(1572,13);
                    	    char_literal158=(Token)match(input,51,FOLLOW_51_in_factor3992); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal158_tree = (Object)adaptor.create(char_literal158);
                    	    adaptor.addChild(root_0, char_literal158_tree);
                    	    }
                    	    dbg.location(1572,19);
                    	    pushFollow(FOLLOW_expr_in_factor3996);
                    	    e2=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, e2.getTree());
                    	    dbg.location(1572,24);
                    	    if ( state.backtracking==0 ) {

                    	            			exprs2.add((e2!=null?e2.result:null));
                    	            		 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop88;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(88);}

                    dbg.location(1574,14);
                    char_literal159=(Token)match(input,109,FOLLOW_109_in_factor4001); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal159_tree = (Object)adaptor.create(char_literal159);
                    adaptor.addChild(root_0, char_literal159_tree);
                    }
                    dbg.location(1574,18);
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

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1581:9: '{' h1= hash_line ( ',' h2= hash_line )* '}'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(1581,9);
                    char_literal160=(Token)match(input,29,FOLLOW_29_in_factor4013); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal160_tree = (Object)adaptor.create(char_literal160);
                    adaptor.addChild(root_0, char_literal160_tree);
                    }
                    dbg.location(1581,15);
                    pushFollow(FOLLOW_hash_line_in_factor4017);
                    h1=hash_line();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, h1.getTree());
                    dbg.location(1581,26);
                    if ( state.backtracking==0 ) {

                            			exprs2.add((h1!=null?h1.result:null));
                            		 
                    }
                    dbg.location(1583,12);
                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1583:12: ( ',' h2= hash_line )*
                    try { dbg.enterSubRule(89);

                    loop89:
                    do {
                        int alt89=2;
                        try { dbg.enterDecision(89);

                        int LA89_0 = input.LA(1);

                        if ( (LA89_0==51) ) {
                            alt89=1;
                        }


                        } finally {dbg.exitDecision(89);}

                        switch (alt89) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1583:13: ',' h2= hash_line
                    	    {
                    	    dbg.location(1583,13);
                    	    char_literal161=(Token)match(input,51,FOLLOW_51_in_factor4022); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal161_tree = (Object)adaptor.create(char_literal161);
                    	    adaptor.addChild(root_0, char_literal161_tree);
                    	    }
                    	    dbg.location(1583,19);
                    	    pushFollow(FOLLOW_hash_line_in_factor4026);
                    	    h2=hash_line();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, h2.getTree());
                    	    dbg.location(1583,30);
                    	    if ( state.backtracking==0 ) {

                    	            			exprs2.add((h2!=null?h2.result:null));
                    	            		 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop89;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(89);}

                    dbg.location(1585,14);
                    char_literal162=(Token)match(input,30,FOLLOW_30_in_factor4032); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal162_tree = (Object)adaptor.create(char_literal162);
                    adaptor.addChild(root_0, char_literal162_tree);
                    }
                    dbg.location(1585,18);
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

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1592:9: v= VAR
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(1592,10);
                    v=(Token)match(input,VAR,FOLLOW_VAR_in_factor4046); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    v_tree = (Object)adaptor.create(v);
                    adaptor.addChild(root_0, v_tree);
                    }
                    dbg.location(1592,16);
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

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1598:9: '(' e= expr ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(1598,9);
                    char_literal163=(Token)match(input,50,FOLLOW_50_in_factor4059); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal163_tree = (Object)adaptor.create(char_literal163);
                    adaptor.addChild(root_0, char_literal163_tree);
                    }
                    dbg.location(1598,14);
                    pushFollow(FOLLOW_expr_in_factor4063);
                    e=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
                    dbg.location(1598,20);
                    char_literal164=(Token)match(input,52,FOLLOW_52_in_factor4065); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal164_tree = (Object)adaptor.create(char_literal164);
                    adaptor.addChild(root_0, char_literal164_tree);
                    }
                    dbg.location(1598,24);
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
        dbg.location(1601, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1602:10: fragment var_domain : ( 'ent' | 'app' );
    public final RuleSet2Parser.var_domain_return var_domain() throws RecognitionException {
        RuleSet2Parser.var_domain_return retval = new RuleSet2Parser.var_domain_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set165=null;

        Object set165_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "var_domain");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1602, 10);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1602:20: ( 'ent' | 'app' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(1602,20);
            set165=(Token)input.LT(1);
            if ( (input.LA(1)>=112 && input.LA(1)<=113) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set165));
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
        dbg.location(1602, 35);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1607:10: fragment namespace returns [String result] : v= VAR ':' ;
    public final RuleSet2Parser.namespace_return namespace() throws RecognitionException {
        RuleSet2Parser.namespace_return retval = new RuleSet2Parser.namespace_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token v=null;
        Token char_literal166=null;

        Object v_tree=null;
        Object char_literal166_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "namespace");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1607, 10);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1608:2: (v= VAR ':' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1608:4: v= VAR ':'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(1608,5);
            v=(Token)match(input,VAR,FOLLOW_VAR_in_namespace4108); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            v_tree = (Object)adaptor.create(v);
            adaptor.addChild(root_0, v_tree);
            }
            dbg.location(1608,10);
            char_literal166=(Token)match(input,40,FOLLOW_40_in_namespace4110); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal166_tree = (Object)adaptor.create(char_literal166);
            adaptor.addChild(root_0, char_literal166_tree);
            }
            dbg.location(1609,2);
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
        dbg.location(1612, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1615:1: timeframe returns [Object result,String time] : 'within' e= expr p= period ;
    public final RuleSet2Parser.timeframe_return timeframe() throws RecognitionException {
        RuleSet2Parser.timeframe_return retval = new RuleSet2Parser.timeframe_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal167=null;
        RuleSet2Parser.expr_return e = null;

        RuleSet2Parser.period_return p = null;


        Object string_literal167_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "timeframe");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1615, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1616:2: ( 'within' e= expr p= period )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1616:5: 'within' e= expr p= period
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(1616,5);
            string_literal167=(Token)match(input,114,FOLLOW_114_in_timeframe4132); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal167_tree = (Object)adaptor.create(string_literal167);
            adaptor.addChild(root_0, string_literal167_tree);
            }
            dbg.location(1616,15);
            pushFollow(FOLLOW_expr_in_timeframe4136);
            e=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
            dbg.location(1616,22);
            pushFollow(FOLLOW_period_in_timeframe4140);
            p=period();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p.getTree());
            dbg.location(1616,30);
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
        dbg.location(1621, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1623:1: hash_line returns [HashMap result] : s= STRING ':' e= expr ;
    public final RuleSet2Parser.hash_line_return hash_line() throws RecognitionException {
        RuleSet2Parser.hash_line_return retval = new RuleSet2Parser.hash_line_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token s=null;
        Token char_literal168=null;
        RuleSet2Parser.expr_return e = null;


        Object s_tree=null;
        Object char_literal168_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "hash_line");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1623, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1624:2: (s= STRING ':' e= expr )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1624:4: s= STRING ':' e= expr
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(1624,5);
            s=(Token)match(input,STRING,FOLLOW_STRING_in_hash_line4164); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            s_tree = (Object)adaptor.create(s);
            adaptor.addChild(root_0, s_tree);
            }
            dbg.location(1624,13);
            char_literal168=(Token)match(input,40,FOLLOW_40_in_hash_line4166); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal168_tree = (Object)adaptor.create(char_literal168);
            adaptor.addChild(root_0, char_literal168_tree);
            }
            dbg.location(1624,18);
            pushFollow(FOLLOW_expr_in_hash_line4170);
            e=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
            dbg.location(1624,25);
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
        dbg.location(1631, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1633:1: css_emit returns [String emit_value] : 'css' (h= HTML | h= STRING ) ;
    public final RuleSet2Parser.css_emit_return css_emit() throws RecognitionException {
        RuleSet2Parser.css_emit_return retval = new RuleSet2Parser.css_emit_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token h=null;
        Token string_literal169=null;

        Object h_tree=null;
        Object string_literal169_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "css_emit");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1633, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1634:2: ( 'css' (h= HTML | h= STRING ) )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1634:4: 'css' (h= HTML | h= STRING )
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(1634,4);
            string_literal169=(Token)match(input,115,FOLLOW_115_in_css_emit4188); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal169_tree = (Object)adaptor.create(string_literal169);
            adaptor.addChild(root_0, string_literal169_tree);
            }
            dbg.location(1634,10);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1634:10: (h= HTML | h= STRING )
            int alt91=2;
            try { dbg.enterSubRule(91);
            try { dbg.enterDecision(91);

            int LA91_0 = input.LA(1);

            if ( (LA91_0==HTML) ) {
                alt91=1;
            }
            else if ( (LA91_0==STRING) ) {
                alt91=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(91);}

            switch (alt91) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1634:12: h= HTML
                    {
                    dbg.location(1634,13);
                    h=(Token)match(input,HTML,FOLLOW_HTML_in_css_emit4194); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    h_tree = (Object)adaptor.create(h);
                    adaptor.addChild(root_0, h_tree);
                    }
                    dbg.location(1634,19);
                    if ( state.backtracking==0 ) {
                      retval.emit_value = strip_wrappers("<<",">>",(h!=null?h.getText():null));
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1635:3: h= STRING
                    {
                    dbg.location(1635,4);
                    h=(Token)match(input,STRING,FOLLOW_STRING_in_css_emit4202); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    h_tree = (Object)adaptor.create(h);
                    adaptor.addChild(root_0, h_tree);
                    }
                    dbg.location(1635,12);
                    if ( state.backtracking==0 ) {
                      retval.emit_value = strip_string((h!=null?h.getText():null));
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(91);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(1637, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1639:10: fragment period : must_be_one[sar( \"years\", \"months\", \"weeks\", \"days\", \"hours\", \"minutes\", \"seconds\", \"year\", \"month\", \"week\", \"day\", \"hour\", \"minute\", \"second\")] ;
    public final RuleSet2Parser.period_return period() throws RecognitionException {
        RuleSet2Parser.period_return retval = new RuleSet2Parser.period_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RuleSet2Parser.must_be_one_return must_be_one170 = null;



        try { dbg.enterRule(getGrammarFileName(), "period");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1639, 10);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1640:2: ( must_be_one[sar( \"years\", \"months\", \"weeks\", \"days\", \"hours\", \"minutes\", \"seconds\", \"year\", \"month\", \"week\", \"day\", \"hour\", \"minute\", \"second\")] )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1641:3: must_be_one[sar( \"years\", \"months\", \"weeks\", \"days\", \"hours\", \"minutes\", \"seconds\", \"year\", \"month\", \"week\", \"day\", \"hour\", \"minute\", \"second\")]
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(1641,3);
            pushFollow(FOLLOW_must_be_one_in_period4225);
            must_be_one170=must_be_one(sar( "years", "months", "weeks", "days", "hours", "minutes", "seconds", "year", "month", "week", "day", "hour", "minute", "second"));

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, must_be_one170.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(1642, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1661:1: cachable returns [Object what] : ca= 'cachable' ( 'for' tm= INT per= period )? ;
    public final RuleSet2Parser.cachable_return cachable() throws RecognitionException {
        RuleSet2Parser.cachable_return retval = new RuleSet2Parser.cachable_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ca=null;
        Token tm=null;
        Token string_literal171=null;
        RuleSet2Parser.period_return per = null;


        Object ca_tree=null;
        Object tm_tree=null;
        Object string_literal171_tree=null;


        	retval.what = null;

        try { dbg.enterRule(getGrammarFileName(), "cachable");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1661, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1665:2: (ca= 'cachable' ( 'for' tm= INT per= period )? )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1666:3: ca= 'cachable' ( 'for' tm= INT per= period )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(1666,5);
            ca=(Token)match(input,116,FOLLOW_116_in_cachable4259); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ca_tree = (Object)adaptor.create(ca);
            adaptor.addChild(root_0, ca_tree);
            }
            dbg.location(1666,17);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1666:17: ( 'for' tm= INT per= period )?
            int alt92=2;
            try { dbg.enterSubRule(92);
            try { dbg.enterDecision(92);

            int LA92_0 = input.LA(1);

            if ( (LA92_0==47) ) {
                alt92=1;
            }
            } finally {dbg.exitDecision(92);}

            switch (alt92) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1666:18: 'for' tm= INT per= period
                    {
                    dbg.location(1666,18);
                    string_literal171=(Token)match(input,47,FOLLOW_47_in_cachable4262); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal171_tree = (Object)adaptor.create(string_literal171);
                    adaptor.addChild(root_0, string_literal171_tree);
                    }
                    dbg.location(1666,26);
                    tm=(Token)match(input,INT,FOLLOW_INT_in_cachable4266); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    tm_tree = (Object)adaptor.create(tm);
                    adaptor.addChild(root_0, tm_tree);
                    }
                    dbg.location(1666,34);
                    pushFollow(FOLLOW_period_in_cachable4270);
                    per=period();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, per.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(92);}

            dbg.location(1666,44);
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
        dbg.location(1682, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1686:1: emit_block returns [String emit_value] : 'emit' (h= HTML | h= STRING | h= JS ) ;
    public final RuleSet2Parser.emit_block_return emit_block() throws RecognitionException {
        RuleSet2Parser.emit_block_return retval = new RuleSet2Parser.emit_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token h=null;
        Token string_literal172=null;

        Object h_tree=null;
        Object string_literal172_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "emit_block");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1686, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1687:2: ( 'emit' (h= HTML | h= STRING | h= JS ) )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1687:4: 'emit' (h= HTML | h= STRING | h= JS )
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(1687,4);
            string_literal172=(Token)match(input,117,FOLLOW_117_in_emit_block4294); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal172_tree = (Object)adaptor.create(string_literal172);
            adaptor.addChild(root_0, string_literal172_tree);
            }
            dbg.location(1687,11);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1687:11: (h= HTML | h= STRING | h= JS )
            int alt93=3;
            try { dbg.enterSubRule(93);
            try { dbg.enterDecision(93);

            switch ( input.LA(1) ) {
            case HTML:
                {
                alt93=1;
                }
                break;
            case STRING:
                {
                alt93=2;
                }
                break;
            case JS:
                {
                alt93=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(93);}

            switch (alt93) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1687:13: h= HTML
                    {
                    dbg.location(1687,14);
                    h=(Token)match(input,HTML,FOLLOW_HTML_in_emit_block4300); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    h_tree = (Object)adaptor.create(h);
                    adaptor.addChild(root_0, h_tree);
                    }
                    dbg.location(1687,20);
                    if ( state.backtracking==0 ) {
                      retval.emit_value = strip_wrappers("<<",">>",(h!=null?h.getText():null));
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1688:3: h= STRING
                    {
                    dbg.location(1688,4);
                    h=(Token)match(input,STRING,FOLLOW_STRING_in_emit_block4308); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    h_tree = (Object)adaptor.create(h);
                    adaptor.addChild(root_0, h_tree);
                    }
                    dbg.location(1688,12);
                    if ( state.backtracking==0 ) {
                      retval.emit_value = strip_string((h!=null?h.getText():null));
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1689:3: h= JS
                    {
                    dbg.location(1689,4);
                    h=(Token)match(input,JS,FOLLOW_JS_in_emit_block4316); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    h_tree = (Object)adaptor.create(h);
                    adaptor.addChild(root_0, h_tree);
                    }
                    dbg.location(1689,8);
                    if ( state.backtracking==0 ) {
                      retval.emit_value = strip_wrappers("<|","|>",(h!=null?h.getText():null));
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(93);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(1691, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1693:1: meta_block : 'meta' '{' (name= must_be_one[sar(\"description\",\"name\",\"author\")] (html_desc= HTML | string_desc= STRING ) | 'key' what= must_be_one[sar(\"errorstack\",\"googleanalytics\",\"twitter\",\"amazon\",\"kpds\",\"google\")] (key_value= STRING | '{' ( name_value_pair[key_values] ( ',' name_value_pair[key_values] )* ) '}' )+ | 'authz' 'require' 'user' | 'logging' onoff= ( 'on' | 'off' ) | 'use' ( (rtype= ( 'css' | 'javascript' ) must_be[\"resource\"] (url= STRING | nicename= VAR ) ) | ( 'module' modname= VAR ( 'alias' alias= VAR )? ) ) )* '}' ;
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
        Token string_literal173=null;
        Token char_literal174=null;
        Token string_literal175=null;
        Token char_literal176=null;
        Token char_literal178=null;
        Token char_literal180=null;
        Token string_literal181=null;
        Token string_literal182=null;
        Token string_literal183=null;
        Token string_literal184=null;
        Token string_literal185=null;
        Token string_literal187=null;
        Token string_literal188=null;
        Token char_literal189=null;
        RuleSet2Parser.must_be_one_return name = null;

        RuleSet2Parser.must_be_one_return what = null;

        RuleSet2Parser.name_value_pair_return name_value_pair177 = null;

        RuleSet2Parser.name_value_pair_return name_value_pair179 = null;

        RuleSet2Parser.must_be_return must_be186 = null;


        Object html_desc_tree=null;
        Object string_desc_tree=null;
        Object key_value_tree=null;
        Object onoff_tree=null;
        Object rtype_tree=null;
        Object url_tree=null;
        Object nicename_tree=null;
        Object modname_tree=null;
        Object alias_tree=null;
        Object string_literal173_tree=null;
        Object char_literal174_tree=null;
        Object string_literal175_tree=null;
        Object char_literal176_tree=null;
        Object char_literal178_tree=null;
        Object char_literal180_tree=null;
        Object string_literal181_tree=null;
        Object string_literal182_tree=null;
        Object string_literal183_tree=null;
        Object string_literal184_tree=null;
        Object string_literal185_tree=null;
        Object string_literal187_tree=null;
        Object string_literal188_tree=null;
        Object char_literal189_tree=null;


        	 HashMap meta_block_hash = (HashMap)rule_json.get("meta");
        	 ArrayList use_list = new ArrayList();
        	 HashMap keys_map = new HashMap();
        	 HashMap key_values = new HashMap();

        try { dbg.enterRule(getGrammarFileName(), "meta_block");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1693, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1710:2: ( 'meta' '{' (name= must_be_one[sar(\"description\",\"name\",\"author\")] (html_desc= HTML | string_desc= STRING ) | 'key' what= must_be_one[sar(\"errorstack\",\"googleanalytics\",\"twitter\",\"amazon\",\"kpds\",\"google\")] (key_value= STRING | '{' ( name_value_pair[key_values] ( ',' name_value_pair[key_values] )* ) '}' )+ | 'authz' 'require' 'user' | 'logging' onoff= ( 'on' | 'off' ) | 'use' ( (rtype= ( 'css' | 'javascript' ) must_be[\"resource\"] (url= STRING | nicename= VAR ) ) | ( 'module' modname= VAR ( 'alias' alias= VAR )? ) ) )* '}' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1710:4: 'meta' '{' (name= must_be_one[sar(\"description\",\"name\",\"author\")] (html_desc= HTML | string_desc= STRING ) | 'key' what= must_be_one[sar(\"errorstack\",\"googleanalytics\",\"twitter\",\"amazon\",\"kpds\",\"google\")] (key_value= STRING | '{' ( name_value_pair[key_values] ( ',' name_value_pair[key_values] )* ) '}' )+ | 'authz' 'require' 'user' | 'logging' onoff= ( 'on' | 'off' ) | 'use' ( (rtype= ( 'css' | 'javascript' ) must_be[\"resource\"] (url= STRING | nicename= VAR ) ) | ( 'module' modname= VAR ( 'alias' alias= VAR )? ) ) )* '}'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(1710,4);
            string_literal173=(Token)match(input,118,FOLLOW_118_in_meta_block4348); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal173_tree = (Object)adaptor.create(string_literal173);
            adaptor.addChild(root_0, string_literal173_tree);
            }
            dbg.location(1710,11);
            char_literal174=(Token)match(input,29,FOLLOW_29_in_meta_block4350); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal174_tree = (Object)adaptor.create(char_literal174);
            adaptor.addChild(root_0, char_literal174_tree);
            }
            dbg.location(1711,2);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1711:2: (name= must_be_one[sar(\"description\",\"name\",\"author\")] (html_desc= HTML | string_desc= STRING ) | 'key' what= must_be_one[sar(\"errorstack\",\"googleanalytics\",\"twitter\",\"amazon\",\"kpds\",\"google\")] (key_value= STRING | '{' ( name_value_pair[key_values] ( ',' name_value_pair[key_values] )* ) '}' )+ | 'authz' 'require' 'user' | 'logging' onoff= ( 'on' | 'off' ) | 'use' ( (rtype= ( 'css' | 'javascript' ) must_be[\"resource\"] (url= STRING | nicename= VAR ) ) | ( 'module' modname= VAR ( 'alias' alias= VAR )? ) ) )*
            try { dbg.enterSubRule(100);

            loop100:
            do {
                int alt100=6;
                try { dbg.enterDecision(100);

                switch ( input.LA(1) ) {
                case VAR:
                    {
                    alt100=1;
                    }
                    break;
                case 119:
                    {
                    alt100=2;
                    }
                    break;
                case 120:
                    {
                    alt100=3;
                    }
                    break;
                case 123:
                    {
                    alt100=4;
                    }
                    break;
                case 125:
                    {
                    alt100=5;
                    }
                    break;

                }

                } finally {dbg.exitDecision(100);}

                switch (alt100) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1711:5: name= must_be_one[sar(\"description\",\"name\",\"author\")] (html_desc= HTML | string_desc= STRING )
            	    {
            	    dbg.location(1711,9);
            	    pushFollow(FOLLOW_must_be_one_in_meta_block4359);
            	    name=must_be_one(sar("description","name","author"));

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, name.getTree());
            	    dbg.location(1711,58);
            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1711:58: (html_desc= HTML | string_desc= STRING )
            	    int alt94=2;
            	    try { dbg.enterSubRule(94);
            	    try { dbg.enterDecision(94);

            	    int LA94_0 = input.LA(1);

            	    if ( (LA94_0==HTML) ) {
            	        alt94=1;
            	    }
            	    else if ( (LA94_0==STRING) ) {
            	        alt94=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 94, 0, input);

            	        dbg.recognitionException(nvae);
            	        throw nvae;
            	    }
            	    } finally {dbg.exitDecision(94);}

            	    switch (alt94) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1711:59: html_desc= HTML
            	            {
            	            dbg.location(1711,68);
            	            html_desc=(Token)match(input,HTML,FOLLOW_HTML_in_meta_block4365); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            html_desc_tree = (Object)adaptor.create(html_desc);
            	            adaptor.addChild(root_0, html_desc_tree);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            dbg.enterAlt(2);

            	            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1711:74: string_desc= STRING
            	            {
            	            dbg.location(1711,85);
            	            string_desc=(Token)match(input,STRING,FOLLOW_STRING_in_meta_block4369); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_desc_tree = (Object)adaptor.create(string_desc);
            	            adaptor.addChild(root_0, string_desc_tree);
            	            }

            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(94);}

            	    dbg.location(1712,3);
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

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1719:5: 'key' what= must_be_one[sar(\"errorstack\",\"googleanalytics\",\"twitter\",\"amazon\",\"kpds\",\"google\")] (key_value= STRING | '{' ( name_value_pair[key_values] ( ',' name_value_pair[key_values] )* ) '}' )+
            	    {
            	    dbg.location(1719,5);
            	    string_literal175=(Token)match(input,119,FOLLOW_119_in_meta_block4383); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal175_tree = (Object)adaptor.create(string_literal175);
            	    adaptor.addChild(root_0, string_literal175_tree);
            	    }
            	    dbg.location(1719,15);
            	    pushFollow(FOLLOW_must_be_one_in_meta_block4387);
            	    what=must_be_one(sar("errorstack","googleanalytics","twitter","amazon","kpds","google"));

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, what.getTree());
            	    dbg.location(1719,100);
            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1719:100: (key_value= STRING | '{' ( name_value_pair[key_values] ( ',' name_value_pair[key_values] )* ) '}' )+
            	    int cnt96=0;
            	    try { dbg.enterSubRule(96);

            	    loop96:
            	    do {
            	        int alt96=3;
            	        try { dbg.enterDecision(96);

            	        int LA96_0 = input.LA(1);

            	        if ( (LA96_0==STRING) ) {
            	            alt96=1;
            	        }
            	        else if ( (LA96_0==29) ) {
            	            alt96=2;
            	        }


            	        } finally {dbg.exitDecision(96);}

            	        switch (alt96) {
            	    	case 1 :
            	    	    dbg.enterAlt(1);

            	    	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1719:101: key_value= STRING
            	    	    {
            	    	    dbg.location(1719,110);
            	    	    key_value=(Token)match(input,STRING,FOLLOW_STRING_in_meta_block4393); if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) {
            	    	    key_value_tree = (Object)adaptor.create(key_value);
            	    	    adaptor.addChild(root_0, key_value_tree);
            	    	    }

            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    dbg.enterAlt(2);

            	    	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1719:120: '{' ( name_value_pair[key_values] ( ',' name_value_pair[key_values] )* ) '}'
            	    	    {
            	    	    dbg.location(1719,120);
            	    	    char_literal176=(Token)match(input,29,FOLLOW_29_in_meta_block4397); if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) {
            	    	    char_literal176_tree = (Object)adaptor.create(char_literal176);
            	    	    adaptor.addChild(root_0, char_literal176_tree);
            	    	    }
            	    	    dbg.location(1719,124);
            	    	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1719:124: ( name_value_pair[key_values] ( ',' name_value_pair[key_values] )* )
            	    	    dbg.enterAlt(1);

            	    	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1719:125: name_value_pair[key_values] ( ',' name_value_pair[key_values] )*
            	    	    {
            	    	    dbg.location(1719,125);
            	    	    pushFollow(FOLLOW_name_value_pair_in_meta_block4400);
            	    	    name_value_pair177=name_value_pair(key_values);

            	    	    state._fsp--;
            	    	    if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, name_value_pair177.getTree());
            	    	    dbg.location(1719,153);
            	    	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1719:153: ( ',' name_value_pair[key_values] )*
            	    	    try { dbg.enterSubRule(95);

            	    	    loop95:
            	    	    do {
            	    	        int alt95=2;
            	    	        try { dbg.enterDecision(95);

            	    	        int LA95_0 = input.LA(1);

            	    	        if ( (LA95_0==51) ) {
            	    	            alt95=1;
            	    	        }


            	    	        } finally {dbg.exitDecision(95);}

            	    	        switch (alt95) {
            	    	    	case 1 :
            	    	    	    dbg.enterAlt(1);

            	    	    	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1719:154: ',' name_value_pair[key_values]
            	    	    	    {
            	    	    	    dbg.location(1719,154);
            	    	    	    char_literal178=(Token)match(input,51,FOLLOW_51_in_meta_block4404); if (state.failed) return retval;
            	    	    	    if ( state.backtracking==0 ) {
            	    	    	    char_literal178_tree = (Object)adaptor.create(char_literal178);
            	    	    	    adaptor.addChild(root_0, char_literal178_tree);
            	    	    	    }
            	    	    	    dbg.location(1719,158);
            	    	    	    pushFollow(FOLLOW_name_value_pair_in_meta_block4406);
            	    	    	    name_value_pair179=name_value_pair(key_values);

            	    	    	    state._fsp--;
            	    	    	    if (state.failed) return retval;
            	    	    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, name_value_pair179.getTree());

            	    	    	    }
            	    	    	    break;

            	    	    	default :
            	    	    	    break loop95;
            	    	        }
            	    	    } while (true);
            	    	    } finally {dbg.exitSubRule(95);}


            	    	    }

            	    	    dbg.location(1719,189);
            	    	    char_literal180=(Token)match(input,30,FOLLOW_30_in_meta_block4412); if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) {
            	    	    char_literal180_tree = (Object)adaptor.create(char_literal180);
            	    	    adaptor.addChild(root_0, char_literal180_tree);
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt96 >= 1 ) break loop96;
            	    	    if (state.backtracking>0) {state.failed=true; return retval;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(96, input);
            	                dbg.recognitionException(eee);

            	                throw eee;
            	        }
            	        cnt96++;
            	    } while (true);
            	    } finally {dbg.exitSubRule(96);}

            	    dbg.location(1719,197);
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

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1725:4: 'authz' 'require' 'user'
            	    {
            	    dbg.location(1725,4);
            	    string_literal181=(Token)match(input,120,FOLLOW_120_in_meta_block4424); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal181_tree = (Object)adaptor.create(string_literal181);
            	    adaptor.addChild(root_0, string_literal181_tree);
            	    }
            	    dbg.location(1725,12);
            	    string_literal182=(Token)match(input,121,FOLLOW_121_in_meta_block4426); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal182_tree = (Object)adaptor.create(string_literal182);
            	    adaptor.addChild(root_0, string_literal182_tree);
            	    }
            	    dbg.location(1725,22);
            	    string_literal183=(Token)match(input,122,FOLLOW_122_in_meta_block4428); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal183_tree = (Object)adaptor.create(string_literal183);
            	    adaptor.addChild(root_0, string_literal183_tree);
            	    }
            	    dbg.location(1725,29);
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

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1731:4: 'logging' onoff= ( 'on' | 'off' )
            	    {
            	    dbg.location(1731,4);
            	    string_literal184=(Token)match(input,123,FOLLOW_123_in_meta_block4436); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal184_tree = (Object)adaptor.create(string_literal184);
            	    adaptor.addChild(root_0, string_literal184_tree);
            	    }
            	    dbg.location(1731,19);
            	    onoff=(Token)input.LT(1);
            	    if ( input.LA(1)==68||input.LA(1)==124 ) {
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

            	    dbg.location(1731,33);
            	    if ( state.backtracking==0 ) {
            	        meta_block_hash.put("logging",(onoff!=null?onoff.getText():null)); 
            	    }

            	    }
            	    break;
            	case 5 :
            	    dbg.enterAlt(5);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1732:4: 'use' ( (rtype= ( 'css' | 'javascript' ) must_be[\"resource\"] (url= STRING | nicename= VAR ) ) | ( 'module' modname= VAR ( 'alias' alias= VAR )? ) )
            	    {
            	    dbg.location(1732,4);
            	    string_literal185=(Token)match(input,125,FOLLOW_125_in_meta_block4451); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal185_tree = (Object)adaptor.create(string_literal185);
            	    adaptor.addChild(root_0, string_literal185_tree);
            	    }
            	    dbg.location(1732,10);
            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1732:10: ( (rtype= ( 'css' | 'javascript' ) must_be[\"resource\"] (url= STRING | nicename= VAR ) ) | ( 'module' modname= VAR ( 'alias' alias= VAR )? ) )
            	    int alt99=2;
            	    try { dbg.enterSubRule(99);
            	    try { dbg.enterDecision(99);

            	    int LA99_0 = input.LA(1);

            	    if ( (LA99_0==115||LA99_0==126) ) {
            	        alt99=1;
            	    }
            	    else if ( (LA99_0==127) ) {
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

            	            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1732:12: (rtype= ( 'css' | 'javascript' ) must_be[\"resource\"] (url= STRING | nicename= VAR ) )
            	            {
            	            dbg.location(1732,12);
            	            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1732:12: (rtype= ( 'css' | 'javascript' ) must_be[\"resource\"] (url= STRING | nicename= VAR ) )
            	            dbg.enterAlt(1);

            	            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1732:13: rtype= ( 'css' | 'javascript' ) must_be[\"resource\"] (url= STRING | nicename= VAR )
            	            {
            	            dbg.location(1732,18);
            	            rtype=(Token)input.LT(1);
            	            if ( input.LA(1)==115||input.LA(1)==126 ) {
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

            	            dbg.location(1732,40);
            	            pushFollow(FOLLOW_must_be_in_meta_block4464);
            	            must_be186=must_be("resource");

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, must_be186.getTree());
            	            dbg.location(1732,60);
            	            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1732:60: (url= STRING | nicename= VAR )
            	            int alt97=2;
            	            try { dbg.enterSubRule(97);
            	            try { dbg.enterDecision(97);

            	            int LA97_0 = input.LA(1);

            	            if ( (LA97_0==STRING) ) {
            	                alt97=1;
            	            }
            	            else if ( (LA97_0==VAR) ) {
            	                alt97=2;
            	            }
            	            else {
            	                if (state.backtracking>0) {state.failed=true; return retval;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 97, 0, input);

            	                dbg.recognitionException(nvae);
            	                throw nvae;
            	            }
            	            } finally {dbg.exitDecision(97);}

            	            switch (alt97) {
            	                case 1 :
            	                    dbg.enterAlt(1);

            	                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1732:61: url= STRING
            	                    {
            	                    dbg.location(1732,64);
            	                    url=(Token)match(input,STRING,FOLLOW_STRING_in_meta_block4470); if (state.failed) return retval;
            	                    if ( state.backtracking==0 ) {
            	                    url_tree = (Object)adaptor.create(url);
            	                    adaptor.addChild(root_0, url_tree);
            	                    }

            	                    }
            	                    break;
            	                case 2 :
            	                    dbg.enterAlt(2);

            	                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1732:74: nicename= VAR
            	                    {
            	                    dbg.location(1732,82);
            	                    nicename=(Token)match(input,VAR,FOLLOW_VAR_in_meta_block4476); if (state.failed) return retval;
            	                    if ( state.backtracking==0 ) {
            	                    nicename_tree = (Object)adaptor.create(nicename);
            	                    adaptor.addChild(root_0, nicename_tree);
            	                    }

            	                    }
            	                    break;

            	            }
            	            } finally {dbg.exitSubRule(97);}

            	            dbg.location(1732,91);
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

            	            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1751:6: ( 'module' modname= VAR ( 'alias' alias= VAR )? )
            	            {
            	            dbg.location(1751,6);
            	            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1751:6: ( 'module' modname= VAR ( 'alias' alias= VAR )? )
            	            dbg.enterAlt(1);

            	            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1751:7: 'module' modname= VAR ( 'alias' alias= VAR )?
            	            {
            	            dbg.location(1751,7);
            	            string_literal187=(Token)match(input,127,FOLLOW_127_in_meta_block4491); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal187_tree = (Object)adaptor.create(string_literal187);
            	            adaptor.addChild(root_0, string_literal187_tree);
            	            }
            	            dbg.location(1751,24);
            	            modname=(Token)match(input,VAR,FOLLOW_VAR_in_meta_block4496); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            modname_tree = (Object)adaptor.create(modname);
            	            adaptor.addChild(root_0, modname_tree);
            	            }
            	            dbg.location(1751,29);
            	            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1751:29: ( 'alias' alias= VAR )?
            	            int alt98=2;
            	            try { dbg.enterSubRule(98);
            	            try { dbg.enterDecision(98);

            	            int LA98_0 = input.LA(1);

            	            if ( (LA98_0==128) ) {
            	                alt98=1;
            	            }
            	            } finally {dbg.exitDecision(98);}

            	            switch (alt98) {
            	                case 1 :
            	                    dbg.enterAlt(1);

            	                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1751:30: 'alias' alias= VAR
            	                    {
            	                    dbg.location(1751,30);
            	                    string_literal188=(Token)match(input,128,FOLLOW_128_in_meta_block4499); if (state.failed) return retval;
            	                    if ( state.backtracking==0 ) {
            	                    string_literal188_tree = (Object)adaptor.create(string_literal188);
            	                    adaptor.addChild(root_0, string_literal188_tree);
            	                    }
            	                    dbg.location(1751,43);
            	                    alias=(Token)match(input,VAR,FOLLOW_VAR_in_meta_block4503); if (state.failed) return retval;
            	                    if ( state.backtracking==0 ) {
            	                    alias_tree = (Object)adaptor.create(alias);
            	                    adaptor.addChild(root_0, alias_tree);
            	                    }

            	                    }
            	                    break;

            	            }
            	            } finally {dbg.exitSubRule(98);}


            	            }

            	            dbg.location(1751,51);
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
            	    } finally {dbg.exitSubRule(99);}


            	    }
            	    break;

            	default :
            	    break loop100;
                }
            } while (true);
            } finally {dbg.exitSubRule(100);}

            dbg.location(1761,3);
            char_literal189=(Token)match(input,30,FOLLOW_30_in_meta_block4518); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal189_tree = (Object)adaptor.create(char_literal189);
            adaptor.addChild(root_0, char_literal189_tree);
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
        dbg.location(1763, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1766:1: dispatch_block : must_be[\"dispatch\"] '{' ( must_be[\"domain\"] domain= STRING ( '->' rsid= STRING )? )* '}' ;
    public final RuleSet2Parser.dispatch_block_return dispatch_block() throws RecognitionException {
        RuleSet2Parser.dispatch_block_return retval = new RuleSet2Parser.dispatch_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token domain=null;
        Token rsid=null;
        Token char_literal191=null;
        Token string_literal193=null;
        Token char_literal194=null;
        RuleSet2Parser.must_be_return must_be190 = null;

        RuleSet2Parser.must_be_return must_be192 = null;


        Object domain_tree=null;
        Object rsid_tree=null;
        Object char_literal191_tree=null;
        Object string_literal193_tree=null;
        Object char_literal194_tree=null;


        	 ArrayList dispatch_block_array = (ArrayList)rule_json.get("dispatch");

        try { dbg.enterRule(getGrammarFileName(), "dispatch_block");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1766, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1772:2: ( must_be[\"dispatch\"] '{' ( must_be[\"domain\"] domain= STRING ( '->' rsid= STRING )? )* '}' )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1772:4: must_be[\"dispatch\"] '{' ( must_be[\"domain\"] domain= STRING ( '->' rsid= STRING )? )* '}'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(1772,4);
            pushFollow(FOLLOW_must_be_in_dispatch_block4549);
            must_be190=must_be("dispatch");

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, must_be190.getTree());
            dbg.location(1772,25);
            char_literal191=(Token)match(input,29,FOLLOW_29_in_dispatch_block4553); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal191_tree = (Object)adaptor.create(char_literal191);
            adaptor.addChild(root_0, char_literal191_tree);
            }
            dbg.location(1772,29);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1772:29: ( must_be[\"domain\"] domain= STRING ( '->' rsid= STRING )? )*
            try { dbg.enterSubRule(102);

            loop102:
            do {
                int alt102=2;
                try { dbg.enterDecision(102);

                int LA102_0 = input.LA(1);

                if ( (LA102_0==VAR) ) {
                    alt102=1;
                }


                } finally {dbg.exitDecision(102);}

                switch (alt102) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1772:30: must_be[\"domain\"] domain= STRING ( '->' rsid= STRING )?
            	    {
            	    dbg.location(1772,30);
            	    pushFollow(FOLLOW_must_be_in_dispatch_block4556);
            	    must_be192=must_be("domain");

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, must_be192.getTree());
            	    dbg.location(1772,54);
            	    domain=(Token)match(input,STRING,FOLLOW_STRING_in_dispatch_block4561); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    domain_tree = (Object)adaptor.create(domain);
            	    adaptor.addChild(root_0, domain_tree);
            	    }
            	    dbg.location(1772,62);
            	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1772:62: ( '->' rsid= STRING )?
            	    int alt101=2;
            	    try { dbg.enterSubRule(101);
            	    try { dbg.enterDecision(101);

            	    int LA101_0 = input.LA(1);

            	    if ( (LA101_0==129) ) {
            	        alt101=1;
            	    }
            	    } finally {dbg.exitDecision(101);}

            	    switch (alt101) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1772:63: '->' rsid= STRING
            	            {
            	            dbg.location(1772,63);
            	            string_literal193=(Token)match(input,129,FOLLOW_129_in_dispatch_block4564); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal193_tree = (Object)adaptor.create(string_literal193);
            	            adaptor.addChild(root_0, string_literal193_tree);
            	            }
            	            dbg.location(1772,72);
            	            rsid=(Token)match(input,STRING,FOLLOW_STRING_in_dispatch_block4568); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            rsid_tree = (Object)adaptor.create(rsid);
            	            adaptor.addChild(root_0, rsid_tree);
            	            }

            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(101);}

            	    dbg.location(1772,82);
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
            	    break loop102;
                }
            } while (true);
            } finally {dbg.exitSubRule(102);}

            dbg.location(1781,2);
            char_literal194=(Token)match(input,30,FOLLOW_30_in_dispatch_block4578); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal194_tree = (Object)adaptor.create(char_literal194);
            adaptor.addChild(root_0, char_literal194_tree);
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
        dbg.location(1782, 2);

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1786:1: name_value_pair[HashMap key_values] : k= STRING ':' (v= INT | v= FLOAT | v= STRING ) ;
    public final RuleSet2Parser.name_value_pair_return name_value_pair(HashMap key_values) throws RecognitionException {
        RuleSet2Parser.name_value_pair_return retval = new RuleSet2Parser.name_value_pair_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token k=null;
        Token v=null;
        Token char_literal195=null;

        Object k_tree=null;
        Object v_tree=null;
        Object char_literal195_tree=null;


        	Object value = null;

        try { dbg.enterRule(getGrammarFileName(), "name_value_pair");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1786, 1);

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1790:2: (k= STRING ':' (v= INT | v= FLOAT | v= STRING ) )
            dbg.enterAlt(1);

            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1790:4: k= STRING ':' (v= INT | v= FLOAT | v= STRING )
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(1790,5);
            k=(Token)match(input,STRING,FOLLOW_STRING_in_name_value_pair4601); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            k_tree = (Object)adaptor.create(k);
            adaptor.addChild(root_0, k_tree);
            }
            dbg.location(1790,13);
            char_literal195=(Token)match(input,40,FOLLOW_40_in_name_value_pair4603); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal195_tree = (Object)adaptor.create(char_literal195);
            adaptor.addChild(root_0, char_literal195_tree);
            }
            dbg.location(1790,17);
            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1790:17: (v= INT | v= FLOAT | v= STRING )
            int alt103=3;
            try { dbg.enterSubRule(103);
            try { dbg.enterDecision(103);

            switch ( input.LA(1) ) {
            case INT:
                {
                alt103=1;
                }
                break;
            case FLOAT:
                {
                alt103=2;
                }
                break;
            case STRING:
                {
                alt103=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(103);}

            switch (alt103) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1791:3: v= INT
                    {
                    dbg.location(1791,4);
                    v=(Token)match(input,INT,FOLLOW_INT_in_name_value_pair4611); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    v_tree = (Object)adaptor.create(v);
                    adaptor.addChild(root_0, v_tree);
                    }
                    dbg.location(1791,9);
                    if ( state.backtracking==0 ) {
                      value =(v!=null?v.getText():null);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1792:5: v= FLOAT
                    {
                    dbg.location(1792,6);
                    v=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_name_value_pair4622); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    v_tree = (Object)adaptor.create(v);
                    adaptor.addChild(root_0, v_tree);
                    }
                    dbg.location(1792,13);
                    if ( state.backtracking==0 ) {
                      value = (v!=null?v.getText():null);
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1793:5: v= STRING
                    {
                    dbg.location(1793,6);
                    v=(Token)match(input,STRING,FOLLOW_STRING_in_name_value_pair4633); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    v_tree = (Object)adaptor.create(v);
                    adaptor.addChild(root_0, v_tree);
                    }
                    dbg.location(1793,14);
                    if ( state.backtracking==0 ) {
                      value = strip_string((v!=null?v.getText():null));
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(103);}

            dbg.location(1794,3);
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
        dbg.location(1795, 2);

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
        RuleSet2Parser.emit_block_return eb = null;


        // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:328:133: (eb= emit_block )
        dbg.enterAlt(1);

        // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:328:133: eb= emit_block
        {
        dbg.location(328,133);
        pushFollow(FOLLOW_emit_block_in_synpred19_RuleSet21022);
        eb=emit_block();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred19_RuleSet2

    // $ANTLR start synpred119_RuleSet2
    public final void synpred119_RuleSet2_fragment() throws RecognitionException {   
        RuleSet2Parser.timeframe_return t = null;


        // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1363:60: (t= timeframe )
        dbg.enterAlt(1);

        // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1363:60: t= timeframe
        {
        dbg.location(1363,60);
        pushFollow(FOLLOW_timeframe_in_synpred119_RuleSet23423);
        t=timeframe();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred119_RuleSet2

    // $ANTLR start synpred120_RuleSet2
    public final void synpred120_RuleSet2_fragment() throws RecognitionException {   
        Token rx=null;
        Token v=null;
        RuleSet2Parser.var_domain_return vd = null;

        RuleSet2Parser.timeframe_return t = null;


        // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1363:4: ( 'seen' rx= STRING must_be[\"in\"] vd= var_domain ':' v= VAR (t= timeframe )? )
        dbg.enterAlt(1);

        // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1363:4: 'seen' rx= STRING must_be[\"in\"] vd= var_domain ':' v= VAR (t= timeframe )?
        {
        dbg.location(1363,4);
        match(input,82,FOLLOW_82_in_synpred120_RuleSet23402); if (state.failed) return ;
        dbg.location(1363,13);
        rx=(Token)match(input,STRING,FOLLOW_STRING_in_synpred120_RuleSet23406); if (state.failed) return ;
        dbg.location(1363,21);
        pushFollow(FOLLOW_must_be_in_synpred120_RuleSet23408);
        must_be("in");

        state._fsp--;
        if (state.failed) return ;
        dbg.location(1363,37);
        pushFollow(FOLLOW_var_domain_in_synpred120_RuleSet23413);
        vd=var_domain();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(1363,49);
        match(input,40,FOLLOW_40_in_synpred120_RuleSet23415); if (state.failed) return ;
        dbg.location(1363,54);
        v=(Token)match(input,VAR,FOLLOW_VAR_in_synpred120_RuleSet23419); if (state.failed) return ;
        dbg.location(1363,60);
        // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1363:60: (t= timeframe )?
        int alt124=2;
        try { dbg.enterSubRule(124);
        try { dbg.enterDecision(124);

        int LA124_0 = input.LA(1);

        if ( (LA124_0==114) ) {
            alt124=1;
        }
        } finally {dbg.exitDecision(124);}

        switch (alt124) {
            case 1 :
                dbg.enterAlt(1);

                // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: t= timeframe
                {
                dbg.location(1363,60);
                pushFollow(FOLLOW_timeframe_in_synpred120_RuleSet23423);
                t=timeframe();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }
        } finally {dbg.exitSubRule(124);}


        }
    }
    // $ANTLR end synpred120_RuleSet2

    // $ANTLR start synpred122_RuleSet2
    public final void synpred122_RuleSet2_fragment() throws RecognitionException {   
        Token rx_1=null;
        Token op=null;
        Token rx_2=null;
        Token v=null;
        RuleSet2Parser.var_domain_return vd = null;


        // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1374:4: ( 'seen' rx_1= STRING op= ( 'before' | 'after' ) rx_2= STRING must_be[\"in\"] vd= var_domain ':' v= VAR )
        dbg.enterAlt(1);

        // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1374:4: 'seen' rx_1= STRING op= ( 'before' | 'after' ) rx_2= STRING must_be[\"in\"] vd= var_domain ':' v= VAR
        {
        dbg.location(1374,4);
        match(input,82,FOLLOW_82_in_synpred122_RuleSet23431); if (state.failed) return ;
        dbg.location(1374,15);
        rx_1=(Token)match(input,STRING,FOLLOW_STRING_in_synpred122_RuleSet23435); if (state.failed) return ;
        dbg.location(1374,25);
        op=(Token)input.LT(1);
        if ( input.LA(1)==59||input.LA(1)==83 ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            dbg.recognitionException(mse);
            throw mse;
        }

        dbg.location(1374,51);
        rx_2=(Token)match(input,STRING,FOLLOW_STRING_in_synpred122_RuleSet23449); if (state.failed) return ;
        dbg.location(1374,60);
        pushFollow(FOLLOW_must_be_in_synpred122_RuleSet23452);
        must_be("in");

        state._fsp--;
        if (state.failed) return ;
        dbg.location(1374,76);
        pushFollow(FOLLOW_var_domain_in_synpred122_RuleSet23457);
        vd=var_domain();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(1374,88);
        match(input,40,FOLLOW_40_in_synpred122_RuleSet23459); if (state.failed) return ;
        dbg.location(1374,93);
        v=(Token)match(input,VAR,FOLLOW_VAR_in_synpred122_RuleSet23463); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred122_RuleSet2

    // $ANTLR start synpred123_RuleSet2
    public final void synpred123_RuleSet2_fragment() throws RecognitionException {   
        Token v=null;
        RuleSet2Parser.var_domain_return vd = null;

        RuleSet2Parser.predop_return pop = null;

        RuleSet2Parser.expr_return e = null;

        RuleSet2Parser.timeframe_return t = null;


        // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1384:4: (vd= var_domain ':' v= VAR pop= predop e= expr t= timeframe )
        dbg.enterAlt(1);

        // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1384:4: vd= var_domain ':' v= VAR pop= predop e= expr t= timeframe
        {
        dbg.location(1384,6);
        pushFollow(FOLLOW_var_domain_in_synpred123_RuleSet23472);
        vd=var_domain();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(1384,18);
        match(input,40,FOLLOW_40_in_synpred123_RuleSet23474); if (state.failed) return ;
        dbg.location(1384,23);
        v=(Token)match(input,VAR,FOLLOW_VAR_in_synpred123_RuleSet23478); if (state.failed) return ;
        dbg.location(1384,31);
        pushFollow(FOLLOW_predop_in_synpred123_RuleSet23482);
        pop=predop();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(1384,40);
        pushFollow(FOLLOW_expr_in_synpred123_RuleSet23486);
        e=expr();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(1384,47);
        pushFollow(FOLLOW_timeframe_in_synpred123_RuleSet23490);
        t=timeframe();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred123_RuleSet2

    // $ANTLR start synpred124_RuleSet2
    public final void synpred124_RuleSet2_fragment() throws RecognitionException {   
        Token v=null;
        RuleSet2Parser.var_domain_return vd = null;

        RuleSet2Parser.timeframe_return t = null;


        // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1396:4: (vd= var_domain ':' v= VAR t= timeframe )
        dbg.enterAlt(1);

        // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1396:4: vd= var_domain ':' v= VAR t= timeframe
        {
        dbg.location(1396,6);
        pushFollow(FOLLOW_var_domain_in_synpred124_RuleSet23500);
        vd=var_domain();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(1396,18);
        match(input,40,FOLLOW_40_in_synpred124_RuleSet23502); if (state.failed) return ;
        dbg.location(1396,23);
        v=(Token)match(input,VAR,FOLLOW_VAR_in_synpred124_RuleSet23506); if (state.failed) return ;
        dbg.location(1396,29);
        pushFollow(FOLLOW_timeframe_in_synpred124_RuleSet23510);
        t=timeframe();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred124_RuleSet2

    // $ANTLR start synpred155_RuleSet2
    public final void synpred155_RuleSet2_fragment() throws RecognitionException {   
        Token v=null;
        RuleSet2Parser.expr_return e = null;


        // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1508:9: (v= VAR '[' e= expr ']' )
        dbg.enterAlt(1);

        // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1508:9: v= VAR '[' e= expr ']'
        {
        dbg.location(1508,10);
        v=(Token)match(input,VAR,FOLLOW_VAR_in_synpred155_RuleSet23821); if (state.failed) return ;
        dbg.location(1508,15);
        match(input,108,FOLLOW_108_in_synpred155_RuleSet23823); if (state.failed) return ;
        dbg.location(1508,20);
        pushFollow(FOLLOW_expr_in_synpred155_RuleSet23827);
        e=expr();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(1508,26);
        match(input,109,FOLLOW_109_in_synpred155_RuleSet23829); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred155_RuleSet2

    // $ANTLR start synpred161_RuleSet2
    public final void synpred161_RuleSet2_fragment() throws RecognitionException {   
        Token p=null;
        RuleSet2Parser.namespace_return n = null;

        RuleSet2Parser.expr_return e = null;


        // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1546:9: (n= namespace p= VAR '(' (e= expr ( ',' )? )* ')' )
        dbg.enterAlt(1);

        // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1546:9: n= namespace p= VAR '(' (e= expr ( ',' )? )* ')'
        {
        dbg.location(1546,10);
        pushFollow(FOLLOW_namespace_in_synpred161_RuleSet23913);
        n=namespace();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(1546,22);
        p=(Token)match(input,VAR,FOLLOW_VAR_in_synpred161_RuleSet23917); if (state.failed) return ;
        dbg.location(1546,27);
        match(input,50,FOLLOW_50_in_synpred161_RuleSet23919); if (state.failed) return ;
        dbg.location(1546,31);
        // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1546:31: (e= expr ( ',' )? )*
        try { dbg.enterSubRule(128);

        loop128:
        do {
            int alt128=2;
            try { dbg.enterDecision(128);

            int LA128_0 = input.LA(1);

            if ( ((LA128_0>=VAR && LA128_0<=INT)||LA128_0==FLOAT||(LA128_0>=STRING && LA128_0<=REGEXP)||LA128_0==29||LA128_0==50||LA128_0==61||LA128_0==75||LA128_0==82||(LA128_0>=106 && LA128_0<=108)||(LA128_0>=110 && LA128_0<=113)) ) {
                alt128=1;
            }


            } finally {dbg.exitDecision(128);}

            switch (alt128) {
        	case 1 :
        	    dbg.enterAlt(1);

        	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1546:32: e= expr ( ',' )?
        	    {
        	    dbg.location(1546,33);
        	    pushFollow(FOLLOW_expr_in_synpred161_RuleSet23924);
        	    e=expr();

        	    state._fsp--;
        	    if (state.failed) return ;
        	    dbg.location(1549,8);
        	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1549:8: ( ',' )?
        	    int alt127=2;
        	    try { dbg.enterSubRule(127);
        	    try { dbg.enterDecision(127);

        	    int LA127_0 = input.LA(1);

        	    if ( (LA127_0==51) ) {
        	        alt127=1;
        	    }
        	    } finally {dbg.exitDecision(127);}

        	    switch (alt127) {
        	        case 1 :
        	            dbg.enterAlt(1);

        	            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: ','
        	            {
        	            dbg.location(1549,8);
        	            match(input,51,FOLLOW_51_in_synpred161_RuleSet23935); if (state.failed) return ;

        	            }
        	            break;

        	    }
        	    } finally {dbg.exitSubRule(127);}


        	    }
        	    break;

        	default :
        	    break loop128;
            }
        } while (true);
        } finally {dbg.exitSubRule(128);}

        dbg.location(1549,15);
        match(input,52,FOLLOW_52_in_synpred161_RuleSet23940); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred161_RuleSet2

    // $ANTLR start synpred164_RuleSet2
    public final void synpred164_RuleSet2_fragment() throws RecognitionException {   
        Token v=null;
        RuleSet2Parser.expr_return e = null;


        // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1556:9: (v= VAR '(' (e= expr ( ',' )? )* ')' )
        dbg.enterAlt(1);

        // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1556:9: v= VAR '(' (e= expr ( ',' )? )* ')'
        {
        dbg.location(1556,10);
        v=(Token)match(input,VAR,FOLLOW_VAR_in_synpred164_RuleSet23955); if (state.failed) return ;
        dbg.location(1556,15);
        match(input,50,FOLLOW_50_in_synpred164_RuleSet23957); if (state.failed) return ;
        dbg.location(1556,19);
        // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1556:19: (e= expr ( ',' )? )*
        try { dbg.enterSubRule(131);

        loop131:
        do {
            int alt131=2;
            try { dbg.enterDecision(131);

            int LA131_0 = input.LA(1);

            if ( ((LA131_0>=VAR && LA131_0<=INT)||LA131_0==FLOAT||(LA131_0>=STRING && LA131_0<=REGEXP)||LA131_0==29||LA131_0==50||LA131_0==61||LA131_0==75||LA131_0==82||(LA131_0>=106 && LA131_0<=108)||(LA131_0>=110 && LA131_0<=113)) ) {
                alt131=1;
            }


            } finally {dbg.exitDecision(131);}

            switch (alt131) {
        	case 1 :
        	    dbg.enterAlt(1);

        	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1556:20: e= expr ( ',' )?
        	    {
        	    dbg.location(1556,21);
        	    pushFollow(FOLLOW_expr_in_synpred164_RuleSet23962);
        	    e=expr();

        	    state._fsp--;
        	    if (state.failed) return ;
        	    dbg.location(1559,2);
        	    // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1559:2: ( ',' )?
        	    int alt130=2;
        	    try { dbg.enterSubRule(130);
        	    try { dbg.enterDecision(130);

        	    int LA130_0 = input.LA(1);

        	    if ( (LA130_0==51) ) {
        	        alt130=1;
        	    }
        	    } finally {dbg.exitDecision(130);}

        	    switch (alt130) {
        	        case 1 :
        	            dbg.enterAlt(1);

        	            // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:0:0: ','
        	            {
        	            dbg.location(1559,2);
        	            match(input,51,FOLLOW_51_in_synpred164_RuleSet23966); if (state.failed) return ;

        	            }
        	            break;

        	    }
        	    } finally {dbg.exitSubRule(130);}


        	    }
        	    break;

        	default :
        	    break loop131;
            }
        } while (true);
        } finally {dbg.exitSubRule(131);}

        dbg.location(1559,9);
        match(input,52,FOLLOW_52_in_synpred164_RuleSet23971); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred164_RuleSet2

    // $ANTLR start synpred169_RuleSet2
    public final void synpred169_RuleSet2_fragment() throws RecognitionException {   
        Token v=null;

        // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1592:9: (v= VAR )
        dbg.enterAlt(1);

        // /Users/ciddennis/Development/sandboxes/cid/parser/RuleSet2.g:1592:9: v= VAR
        {
        dbg.location(1592,10);
        v=(Token)match(input,VAR,FOLLOW_VAR_in_synpred169_RuleSet24046); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred169_RuleSet2

    // Delegated rules

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
    public final boolean synpred169_RuleSet2() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred169_RuleSet2_fragment(); // can never throw exception
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
    public final boolean synpred119_RuleSet2() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred119_RuleSet2_fragment(); // can never throw exception
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
    public final boolean synpred155_RuleSet2() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred155_RuleSet2_fragment(); // can never throw exception
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
    public final boolean synpred120_RuleSet2() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred120_RuleSet2_fragment(); // can never throw exception
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
    public final boolean synpred164_RuleSet2() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred164_RuleSet2_fragment(); // can never throw exception
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
    public final boolean synpred161_RuleSet2() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred161_RuleSet2_fragment(); // can never throw exception
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


    protected DFA80 dfa80 = new DFA80(this);
    protected DFA79 dfa79 = new DFA79(this);
    protected DFA90 dfa90 = new DFA90(this);
    static final String DFA80_eotS =
        "\23\uffff";
    static final String DFA80_eofS =
        "\23\uffff";
    static final String DFA80_minS =
        "\1\4\1\uffff\2\0\17\uffff";
    static final String DFA80_maxS =
        "\1\161\1\uffff\2\0\17\uffff";
    static final String DFA80_acceptS =
        "\1\uffff\1\1\2\uffff\1\6\12\uffff\1\2\1\3\1\4\1\5";
    static final String DFA80_specialS =
        "\2\uffff\1\0\1\1\17\uffff}>";
    static final String[] DFA80_transitionS = {
            "\2\4\1\uffff\1\4\3\uffff\2\4\20\uffff\1\4\24\uffff\1\4\12\uffff"+
            "\1\1\24\uffff\1\2\27\uffff\3\4\1\uffff\2\4\2\3",
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

    static final short[] DFA80_eot = DFA.unpackEncodedString(DFA80_eotS);
    static final short[] DFA80_eof = DFA.unpackEncodedString(DFA80_eofS);
    static final char[] DFA80_min = DFA.unpackEncodedStringToUnsignedChars(DFA80_minS);
    static final char[] DFA80_max = DFA.unpackEncodedStringToUnsignedChars(DFA80_maxS);
    static final short[] DFA80_accept = DFA.unpackEncodedString(DFA80_acceptS);
    static final short[] DFA80_special = DFA.unpackEncodedString(DFA80_specialS);
    static final short[][] DFA80_transition;

    static {
        int numStates = DFA80_transitionS.length;
        DFA80_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA80_transition[i] = DFA.unpackEncodedString(DFA80_transitionS[i]);
        }
    }

    class DFA80 extends DFA {

        public DFA80(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 80;
            this.eot = DFA80_eot;
            this.eof = DFA80_eof;
            this.min = DFA80_min;
            this.max = DFA80_max;
            this.accept = DFA80_accept;
            this.special = DFA80_special;
            this.transition = DFA80_transition;
        }
        public String getDescription() {
            return "1358:1: unary_expr returns [Object result] options {backtrack=true; } : ( 'not' unary_expr | 'seen' rx= STRING must_be[\"in\"] vd= var_domain ':' v= VAR (t= timeframe )? | 'seen' rx_1= STRING op= ( 'before' | 'after' ) rx_2= STRING must_be[\"in\"] vd= var_domain ':' v= VAR | vd= var_domain ':' v= VAR pop= predop e= expr t= timeframe | vd= var_domain ':' v= VAR t= timeframe | oe= operator_expr );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA80_2 = input.LA(1);

                         
                        int index80_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred120_RuleSet2()) ) {s = 15;}

                        else if ( (synpred122_RuleSet2()) ) {s = 16;}

                         
                        input.seek(index80_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA80_3 = input.LA(1);

                         
                        int index80_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred123_RuleSet2()) ) {s = 17;}

                        else if ( (synpred124_RuleSet2()) ) {s = 18;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index80_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 80, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA79_eotS =
        "\46\uffff";
    static final String DFA79_eofS =
        "\1\2\45\uffff";
    static final String DFA79_minS =
        "\1\4\1\0\44\uffff";
    static final String DFA79_maxS =
        "\1\165\1\0\44\uffff";
    static final String DFA79_acceptS =
        "\2\uffff\1\2\42\uffff\1\1";
    static final String DFA79_specialS =
        "\1\uffff\1\0\44\uffff}>";
    static final String[] DFA79_transitionS = {
            "\2\2\1\uffff\1\2\3\uffff\2\2\5\uffff\20\2\16\uffff\6\2\1\uffff"+
            "\1\2\5\uffff\1\2\15\uffff\10\2\27\uffff\10\2\1\1\1\2\1\uffff"+
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
            "",
            ""
    };

    static final short[] DFA79_eot = DFA.unpackEncodedString(DFA79_eotS);
    static final short[] DFA79_eof = DFA.unpackEncodedString(DFA79_eofS);
    static final char[] DFA79_min = DFA.unpackEncodedStringToUnsignedChars(DFA79_minS);
    static final char[] DFA79_max = DFA.unpackEncodedStringToUnsignedChars(DFA79_maxS);
    static final short[] DFA79_accept = DFA.unpackEncodedString(DFA79_acceptS);
    static final short[] DFA79_special = DFA.unpackEncodedString(DFA79_specialS);
    static final short[][] DFA79_transition;

    static {
        int numStates = DFA79_transitionS.length;
        DFA79_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA79_transition[i] = DFA.unpackEncodedString(DFA79_transitionS[i]);
        }
    }

    class DFA79 extends DFA {

        public DFA79(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 79;
            this.eot = DFA79_eot;
            this.eof = DFA79_eof;
            this.min = DFA79_min;
            this.max = DFA79_max;
            this.accept = DFA79_accept;
            this.special = DFA79_special;
            this.transition = DFA79_transition;
        }
        public String getDescription() {
            return "1363:60: (t= timeframe )?";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA79_1 = input.LA(1);

                         
                        int index79_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred119_RuleSet2()) ) {s = 37;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index79_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 79, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA90_eotS =
        "\21\uffff";
    static final String DFA90_eofS =
        "\21\uffff";
    static final String DFA90_minS =
        "\1\4\5\uffff\1\0\12\uffff";
    static final String DFA90_maxS =
        "\1\161\5\uffff\1\0\12\uffff";
    static final String DFA90_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\7\1\10\1\11\1\14\1\15\1\17"+
        "\1\6\1\12\1\13\1\16";
    static final String DFA90_specialS =
        "\6\uffff\1\0\12\uffff}>";
    static final String[] DFA90_transitionS = {
            "\1\6\1\1\1\uffff\1\3\3\uffff\1\2\1\5\20\uffff\1\13\24\uffff"+
            "\1\14\67\uffff\2\4\1\12\1\uffff\1\10\1\11\2\7",
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

    static final short[] DFA90_eot = DFA.unpackEncodedString(DFA90_eotS);
    static final short[] DFA90_eof = DFA.unpackEncodedString(DFA90_eofS);
    static final char[] DFA90_min = DFA.unpackEncodedStringToUnsignedChars(DFA90_minS);
    static final char[] DFA90_max = DFA.unpackEncodedStringToUnsignedChars(DFA90_maxS);
    static final short[] DFA90_accept = DFA.unpackEncodedString(DFA90_acceptS);
    static final short[] DFA90_special = DFA.unpackEncodedString(DFA90_specialS);
    static final short[][] DFA90_transition;

    static {
        int numStates = DFA90_transitionS.length;
        DFA90_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA90_transition[i] = DFA.unpackEncodedString(DFA90_transitionS[i]);
        }
    }

    class DFA90 extends DFA {

        public DFA90(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 90;
            this.eot = DFA90_eot;
            this.eof = DFA90_eof;
            this.min = DFA90_min;
            this.max = DFA90_max;
            this.accept = DFA90_accept;
            this.special = DFA90_special;
            this.transition = DFA90_transition;
        }
        public String getDescription() {
            return "1473:1: factor returns [Object result] options {backtrack=true; } : (v= INT | v= STRING | v= FLOAT | v= ( 'true' | 'false' ) | vr= REGEXP | v= VAR '[' e= expr ']' | d= var_domain ':' v= VAR | 'current' d= var_domain ':' v= VAR | 'history' e= expr d= var_domain ':' v= VAR | n= namespace p= VAR '(' (e= expr ( ',' )? )* ')' | v= VAR '(' (e= expr ( ',' )? )* ')' | '[' e= expr ( ',' e2= expr )* ']' | '{' h1= hash_line ( ',' h2= hash_line )* '}' | v= VAR | '(' e= expr ')' );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA90_6 = input.LA(1);

                         
                        int index90_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred155_RuleSet2()) ) {s = 13;}

                        else if ( (synpred161_RuleSet2()) ) {s = 14;}

                        else if ( (synpred164_RuleSet2()) ) {s = 15;}

                        else if ( (synpred169_RuleSet2()) ) {s = 16;}

                         
                        input.seek(index90_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 90, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_set_in_predop0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_add_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_must_be_in_ruleset806 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rulesetname_in_ruleset812 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleset819 = new BitSet(new long[]{0x0000000040000010L,0x0040000000000020L});
    public static final BitSet FOLLOW_meta_block_in_ruleset826 = new BitSet(new long[]{0x0000000040000010L,0x0040000000000020L});
    public static final BitSet FOLLOW_dispatch_block_in_ruleset830 = new BitSet(new long[]{0x0000000040000010L,0x0040000000000020L});
    public static final BitSet FOLLOW_global_block_in_ruleset834 = new BitSet(new long[]{0x0000000040000010L,0x0040000000000020L});
    public static final BitSet FOLLOW_rule_in_ruleset838 = new BitSet(new long[]{0x0000000040000010L,0x0040000000000020L});
    public static final BitSet FOLLOW_30_in_ruleset844 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_ruleset848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_must_be871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_must_be_one896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_rulesetname0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_rule_name0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_must_be_in_rule955 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule_name_in_rule962 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_must_be_in_rule969 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_must_be_one_in_rule978 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_rule983 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_rule993 = new BitSet(new long[]{0x0440000000000000L});
    public static final BitSet FOLLOW_using_in_rule1000 = new BitSet(new long[]{0x0300000120000010L,0x0020000000000000L});
    public static final BitSet FOLLOW_when_in_rule1004 = new BitSet(new long[]{0x0300000120000010L,0x0020000000000000L});
    public static final BitSet FOLLOW_foreach_in_rule1010 = new BitSet(new long[]{0x0300000120000010L,0x0020000000000000L});
    public static final BitSet FOLLOW_pre_block_in_rule1017 = new BitSet(new long[]{0x0300000120000010L,0x0020000000000000L});
    public static final BitSet FOLLOW_emit_block_in_rule1022 = new BitSet(new long[]{0x0300000120000010L,0x0020000000000000L});
    public static final BitSet FOLLOW_action_in_rule1026 = new BitSet(new long[]{0x0000000240000010L});
    public static final BitSet FOLLOW_callbacks_in_rule1032 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_post_block_in_rule1037 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_rule1042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_must_be_one_in_post_block1073 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_post_block1076 = new BitSet(new long[]{0x00000E8000000010L,0x0003000000000000L});
    public static final BitSet FOLLOW_post_statement_in_post_block1083 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_post_block1088 = new BitSet(new long[]{0x00000E8000000010L,0x0003000000000000L});
    public static final BitSet FOLLOW_post_statement_in_post_block1092 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_post_block1100 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_post_block1102 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_post_alternate_in_post_block1109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_must_be_in_post_alternate1135 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_post_alternate1138 = new BitSet(new long[]{0x00000E80C0000010L,0x0003000000000000L});
    public static final BitSet FOLLOW_post_statement_in_post_alternate1143 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_31_in_post_alternate1148 = new BitSet(new long[]{0x00000E8000000010L,0x0003000000000000L});
    public static final BitSet FOLLOW_post_statement_in_post_alternate1152 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_31_in_post_alternate1160 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_post_alternate1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_persistent_expr_in_post_statement1181 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_raise_statement_in_post_statement1191 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_log_statement_in_post_statement1198 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_must_be_in_post_statement1208 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_post_statement1214 = new BitSet(new long[]{0x20040000200018B0L,0x0003DC0000040800L});
    public static final BitSet FOLLOW_expr_in_post_statement1218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_must_be_in_raise_statement1243 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_must_be_in_raise_statement1246 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_must_be_in_raise_statement1249 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_raise_statement1255 = new BitSet(new long[]{0x0000900000000002L});
    public static final BitSet FOLLOW_for_clause_in_raise_statement1259 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_modifier_clause_in_raise_statement1264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_must_be_in_log_statement1284 = new BitSet(new long[]{0x20040000200018B0L,0x0003DC0000040800L});
    public static final BitSet FOLLOW_expr_in_log_statement1290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_callbacks1310 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_callbacks1312 = new BitSet(new long[]{0x0000000C40000000L});
    public static final BitSet FOLLOW_success_in_callbacks1316 = new BitSet(new long[]{0x0000000840000000L});
    public static final BitSet FOLLOW_failure_in_callbacks1321 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_callbacks1324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_success1347 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_success1349 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_click_in_success1353 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_31_in_success1359 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_click_in_success1363 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_31_in_success1370 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_success1374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_failure1400 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_failure1402 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_click_in_failure1406 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_31_in_failure1412 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_click_in_failure1416 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_31_in_failure1424 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_failure1428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_click1446 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_click1456 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_click1458 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_click1462 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_click_link_in_click1466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_must_be_in_click_link1486 = new BitSet(new long[]{0x00000E8000000000L,0x0003000000000000L});
    public static final BitSet FOLLOW_persistent_expr_in_click_link1491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_persistent_clear_in_persistent_expr1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_persistent_set_in_persistent_expr1523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_persistent_iterate_in_persistent_expr1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_trail_forget_in_persistent_expr1546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_trail_mark_in_persistent_expr1559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_persistent_clear1582 = new BitSet(new long[]{0x0000000000000000L,0x0003000000000000L});
    public static final BitSet FOLLOW_var_domain_in_persistent_clear1587 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_persistent_clear1589 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_persistent_clear1593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_persistent_set1611 = new BitSet(new long[]{0x0000000000000000L,0x0003000000000000L});
    public static final BitSet FOLLOW_var_domain_in_persistent_set1616 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_persistent_set1618 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_persistent_set1622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_domain_in_persistent_iterate1642 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_persistent_iterate1644 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_persistent_iterate1648 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_counter_op_in_persistent_iterate1652 = new BitSet(new long[]{0x20040000200018B0L,0x0003DC0000040800L});
    public static final BitSet FOLLOW_expr_in_persistent_iterate1656 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_counter_start_in_persistent_iterate1660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_trail_forget1678 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_trail_forget1683 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_must_be_in_trail_forget1685 = new BitSet(new long[]{0x0000000000000000L,0x0003000000000000L});
    public static final BitSet FOLLOW_var_domain_in_trail_forget1691 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_trail_forget1693 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_trail_forget1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_trail_mark1716 = new BitSet(new long[]{0x0000000000000000L,0x0003000000000000L});
    public static final BitSet FOLLOW_var_domain_in_trail_mark1720 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_trail_mark1722 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_trail_mark1726 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_trail_with_in_trail_mark1730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_trail_with1749 = new BitSet(new long[]{0x20040000200018B0L,0x0003DC0000040800L});
    public static final BitSet FOLLOW_expr_in_trail_with1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_counter_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_must_be_in_counter_start1803 = new BitSet(new long[]{0x20040000200018B0L,0x0003DC0000040800L});
    public static final BitSet FOLLOW_expr_in_counter_start1808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_for_clause1829 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_for_clause1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_action_in_action1868 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_unconditional_action_in_action1873 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_action1877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_conditional_action1894 = new BitSet(new long[]{0x20040000200018B0L,0x0003DC0000040800L});
    public static final BitSet FOLLOW_expr_in_conditional_action1898 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_conditional_action1900 = new BitSet(new long[]{0x0300000120000010L,0x0020000000000000L});
    public static final BitSet FOLLOW_unconditional_action_in_conditional_action1902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primrule_in_unconditional_action1927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_action_block_in_unconditional_action1937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_must_be_one_in_action_block1963 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_action_block1973 = new BitSet(new long[]{0x0000000000000010L,0x0020000000000000L});
    public static final BitSet FOLLOW_primrule_in_action_block1978 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_31_in_action_block1988 = new BitSet(new long[]{0x0000000000000010L,0x0020000000000000L});
    public static final BitSet FOLLOW_primrule_in_action_block1992 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_31_in_action_block1999 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_action_block2002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_primrule2029 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_primrule2031 = new BitSet(new long[]{0x0000000000000010L,0x0020000000000000L});
    public static final BitSet FOLLOW_namespace_in_primrule2042 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_primrule2047 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_primrule2049 = new BitSet(new long[]{0x201C0000200018B0L,0x0003DC0000040800L});
    public static final BitSet FOLLOW_expr_in_primrule2054 = new BitSet(new long[]{0x0018000000000000L});
    public static final BitSet FOLLOW_51_in_primrule2059 = new BitSet(new long[]{0x20040000200018B0L,0x0003DC0000040800L});
    public static final BitSet FOLLOW_expr_in_primrule2063 = new BitSet(new long[]{0x0018000000000000L});
    public static final BitSet FOLLOW_51_in_primrule2071 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_primrule2075 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_modifier_clause_in_primrule2079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emit_block_in_primrule2089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_modifier_clause2123 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_modifier_in_modifier_clause2127 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_modifier_clause2132 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_modifier_in_modifier_clause2136 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_VAR_in_modifier2161 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_modifier2163 = new BitSet(new long[]{0x20040000200058B0L,0x0003DC0000040800L});
    public static final BitSet FOLLOW_expr_in_modifier2168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JS_in_modifier2174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_using2199 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_set_in_using2203 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_setting_in_using2211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_setting2232 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_setting2234 = new BitSet(new long[]{0x0010000000000010L});
    public static final BitSet FOLLOW_VAR_in_setting2239 = new BitSet(new long[]{0x0018000000000010L});
    public static final BitSet FOLLOW_51_in_setting2243 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_setting2247 = new BitSet(new long[]{0x0010000000000010L});
    public static final BitSet FOLLOW_52_in_setting2255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_pre_block2280 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_pre_block2282 = new BitSet(new long[]{0x00000000C0000010L});
    public static final BitSet FOLLOW_decl_in_pre_block2286 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_31_in_pre_block2290 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_decl_in_pre_block2292 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_31_in_pre_block2300 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_pre_block2303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_foreach2336 = new BitSet(new long[]{0x20040000200018B0L,0x0003DC0000040800L});
    public static final BitSet FOLLOW_expr_in_foreach2340 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_setting_in_foreach2344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_when2379 = new BitSet(new long[]{0x8004003000000010L,0x000000000000000FL});
    public static final BitSet FOLLOW_event_seq_in_when2383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_event_or_in_event_seq2410 = new BitSet(new long[]{0x0801000000000002L});
    public static final BitSet FOLLOW_set_in_event_seq2414 = new BitSet(new long[]{0x8004003000000010L,0x000000000000000FL});
    public static final BitSet FOLLOW_event_or_in_event_seq2422 = new BitSet(new long[]{0x0801000000000002L});
    public static final BitSet FOLLOW_event_and_in_event_or2464 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_event_or2469 = new BitSet(new long[]{0x8004003000000010L,0x000000000000000FL});
    public static final BitSet FOLLOW_event_and_in_event_or2473 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_event_btwn_in_event_and2503 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_event_and2508 = new BitSet(new long[]{0x8004003000000010L,0x000000000000000FL});
    public static final BitSet FOLLOW_event_btwn_in_event_and2512 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_event_prim_in_event_btwn2538 = new BitSet(new long[]{0x6000000000000002L});
    public static final BitSet FOLLOW_61_in_event_btwn2544 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_event_btwn2549 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_event_btwn2551 = new BitSet(new long[]{0x8004003000000010L,0x000000000000000FL});
    public static final BitSet FOLLOW_event_seq_in_event_btwn2555 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_event_btwn2557 = new BitSet(new long[]{0x8004003000000010L,0x000000000000000FL});
    public static final BitSet FOLLOW_event_seq_in_event_btwn2561 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_event_btwn2563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_event_prim2594 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_event_prim2597 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_STRING_in_event_prim2602 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_REGEXP_in_event_prim2606 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_setting_in_event_prim2611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_event_prim2620 = new BitSet(new long[]{0x0000003000000000L,0x000000000000000EL});
    public static final BitSet FOLLOW_set_in_event_prim2625 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_event_prim2639 = new BitSet(new long[]{0x0080000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_on_expr_in_event_prim2643 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_setting_in_event_prim2649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_event_prim2659 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_event_prim2663 = new BitSet(new long[]{0x0080000000000012L});
    public static final BitSet FOLLOW_event_filter_in_event_prim2668 = new BitSet(new long[]{0x0080000000000012L});
    public static final BitSet FOLLOW_setting_in_event_prim2675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_event_prim2685 = new BitSet(new long[]{0x8004003000000010L,0x000000000000000FL});
    public static final BitSet FOLLOW_event_seq_in_event_prim2689 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_event_prim2691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_event_filter2712 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_STRING_in_event_filter2717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REGEXP_in_event_filter2723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_on_expr2742 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_STRING_in_on_expr2751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REGEXP_in_on_expr2762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_global_block2847 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_global_block2849 = new BitSet(new long[]{0x0000000080000010L,0x0028000000000000L});
    public static final BitSet FOLLOW_emit_block_in_global_block2857 = new BitSet(new long[]{0x00000000C0000010L,0x0028000000000000L});
    public static final BitSet FOLLOW_must_be_one_in_global_block2867 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_global_block2872 = new BitSet(new long[]{0x0000010000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_40_in_global_block2875 = new BitSet(new long[]{0x0000000000000000L,0x00000000000003C0L});
    public static final BitSet FOLLOW_set_in_global_block2879 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_global_block2891 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_global_block2895 = new BitSet(new long[]{0x00000000C0000010L,0x0038000000000000L});
    public static final BitSet FOLLOW_cachable_in_global_block2900 = new BitSet(new long[]{0x00000000C0000010L,0x0028000000000000L});
    public static final BitSet FOLLOW_css_emit_in_global_block2913 = new BitSet(new long[]{0x00000000C0000010L,0x0028000000000000L});
    public static final BitSet FOLLOW_decl_in_global_block2921 = new BitSet(new long[]{0x00000000C0000010L,0x0028000000000000L});
    public static final BitSet FOLLOW_31_in_global_block2927 = new BitSet(new long[]{0x00000000C0000010L,0x0028000000000000L});
    public static final BitSet FOLLOW_30_in_global_block2932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_decl2959 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_decl2961 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_HTML_in_decl2965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_decl2975 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_decl2977 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_JS_in_decl2981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_decl2991 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_decl2993 = new BitSet(new long[]{0x20040000200018B0L,0x0003DC0000040800L});
    public static final BitSet FOLLOW_expr_in_decl2997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_def_in_expr3024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_expression_in_expr3033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_function_def3056 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_function_def3058 = new BitSet(new long[]{0x0018000000000010L});
    public static final BitSet FOLLOW_VAR_in_function_def3062 = new BitSet(new long[]{0x0018000000000000L});
    public static final BitSet FOLLOW_51_in_function_def3066 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_function_def3070 = new BitSet(new long[]{0x0018000000000000L});
    public static final BitSet FOLLOW_52_in_function_def3075 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_function_def3077 = new BitSet(new long[]{0x20040000A00018B0L,0x0003DC0000040800L});
    public static final BitSet FOLLOW_decl_in_function_def3081 = new BitSet(new long[]{0x20040000A00018B0L,0x0003DC0000040800L});
    public static final BitSet FOLLOW_31_in_function_def3086 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_decl_in_function_def3090 = new BitSet(new long[]{0x20040000A00018B0L,0x0003DC0000040800L});
    public static final BitSet FOLLOW_31_in_function_def3095 = new BitSet(new long[]{0x20040000200018B0L,0x0003DC0000040800L});
    public static final BitSet FOLLOW_expr_in_function_def3100 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_function_def3102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_disjunction_in_conditional_expression3124 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_conditional_expression3127 = new BitSet(new long[]{0x20040000200018B0L,0x0003DC0000040800L});
    public static final BitSet FOLLOW_expr_in_conditional_expression3129 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_conditional_expression3131 = new BitSet(new long[]{0x20040000200018B0L,0x0003DC0000040800L});
    public static final BitSet FOLLOW_expr_in_conditional_expression3133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conjunction_in_disjunction3165 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_disjunction3170 = new BitSet(new long[]{0x20040000200018B0L,0x0003DC0000040800L});
    public static final BitSet FOLLOW_conjunction_in_disjunction3174 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_equality_expr_in_conjunction3204 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_conjunction3209 = new BitSet(new long[]{0x20040000200018B0L,0x0003DC0000040800L});
    public static final BitSet FOLLOW_equality_expr_in_conjunction3213 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_add_expr_in_equality_expr3244 = new BitSet(new long[]{0x0000000007FC0002L});
    public static final BitSet FOLLOW_predop_in_equality_expr3249 = new BitSet(new long[]{0x20040000200018B0L,0x0003DC0000040800L});
    public static final BitSet FOLLOW_add_expr_in_equality_expr3253 = new BitSet(new long[]{0x0000000007FC0002L});
    public static final BitSet FOLLOW_mult_expr_in_add_expr3287 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_add_op_in_add_expr3292 = new BitSet(new long[]{0x20040000200018B0L,0x0003DC0000040800L});
    public static final BitSet FOLLOW_mult_expr_in_add_expr3296 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_set_in_mult_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_expr_in_mult_expr3344 = new BitSet(new long[]{0x0000000000000002L,0x0000000000038000L});
    public static final BitSet FOLLOW_mult_op_in_mult_expr3349 = new BitSet(new long[]{0x20040000200018B0L,0x0003DC0000040800L});
    public static final BitSet FOLLOW_unary_expr_in_mult_expr3353 = new BitSet(new long[]{0x0000000000000002L,0x0000000000038000L});
    public static final BitSet FOLLOW_61_in_unary_expr3393 = new BitSet(new long[]{0x20040000200018B0L,0x0003DC0000040800L});
    public static final BitSet FOLLOW_unary_expr_in_unary_expr3395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_unary_expr3402 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_unary_expr3406 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_must_be_in_unary_expr3408 = new BitSet(new long[]{0x0000000000000000L,0x0003000000000000L});
    public static final BitSet FOLLOW_var_domain_in_unary_expr3413 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_unary_expr3415 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_unary_expr3419 = new BitSet(new long[]{0x0000000000000002L,0x0004000000000000L});
    public static final BitSet FOLLOW_timeframe_in_unary_expr3423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_unary_expr3431 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_unary_expr3435 = new BitSet(new long[]{0x0800000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_set_in_unary_expr3439 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_unary_expr3449 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_must_be_in_unary_expr3452 = new BitSet(new long[]{0x0000000000000000L,0x0003000000000000L});
    public static final BitSet FOLLOW_var_domain_in_unary_expr3457 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_unary_expr3459 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_unary_expr3463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_domain_in_unary_expr3472 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_unary_expr3474 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_unary_expr3478 = new BitSet(new long[]{0x0000000007FC0000L});
    public static final BitSet FOLLOW_predop_in_unary_expr3482 = new BitSet(new long[]{0x20040000200018B0L,0x0003DC0000040800L});
    public static final BitSet FOLLOW_expr_in_unary_expr3486 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_timeframe_in_unary_expr3490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_domain_in_unary_expr3500 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_unary_expr3502 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_unary_expr3506 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_timeframe_in_unary_expr3510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operator_expr_in_unary_expr3519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_operator_expr3548 = new BitSet(new long[]{0x0000000000000002L,0x000003FFFFF00000L});
    public static final BitSet FOLLOW_operator_in_operator_expr3554 = new BitSet(new long[]{0x0000000000000002L,0x000003FFFFF00000L});
    public static final BitSet FOLLOW_set_in_operator3584 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_operator3671 = new BitSet(new long[]{0x20140000200018B0L,0x0003DC0000040800L});
    public static final BitSet FOLLOW_expr_in_operator3676 = new BitSet(new long[]{0x0018000000000000L});
    public static final BitSet FOLLOW_51_in_operator3681 = new BitSet(new long[]{0x20040000200018B0L,0x0003DC0000040800L});
    public static final BitSet FOLLOW_expr_in_operator3685 = new BitSet(new long[]{0x0018000000000000L});
    public static final BitSet FOLLOW_52_in_operator3694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_factor3732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_factor3747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_factor3767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_factor3787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REGEXP_in_factor3807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_factor3821 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_108_in_factor3823 = new BitSet(new long[]{0x20040000200018B0L,0x0003DC0000040800L});
    public static final BitSet FOLLOW_expr_in_factor3827 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_factor3829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_domain_in_factor3844 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_factor3846 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_factor3850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_factor3862 = new BitSet(new long[]{0x0000000000000000L,0x0003000000000000L});
    public static final BitSet FOLLOW_var_domain_in_factor3866 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_factor3868 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_factor3872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_factor3885 = new BitSet(new long[]{0x20040000200018B0L,0x0003DC0000040800L});
    public static final BitSet FOLLOW_expr_in_factor3889 = new BitSet(new long[]{0x0000000000000000L,0x0003000000000000L});
    public static final BitSet FOLLOW_var_domain_in_factor3893 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_factor3895 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_factor3899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namespace_in_factor3913 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_factor3917 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_factor3919 = new BitSet(new long[]{0x20140000200018B0L,0x0003DC0000040800L});
    public static final BitSet FOLLOW_expr_in_factor3924 = new BitSet(new long[]{0x201C0000200018B0L,0x0003DC0000040800L});
    public static final BitSet FOLLOW_51_in_factor3935 = new BitSet(new long[]{0x20140000200018B0L,0x0003DC0000040800L});
    public static final BitSet FOLLOW_52_in_factor3940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_factor3955 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_factor3957 = new BitSet(new long[]{0x20140000200018B0L,0x0003DC0000040800L});
    public static final BitSet FOLLOW_expr_in_factor3962 = new BitSet(new long[]{0x201C0000200018B0L,0x0003DC0000040800L});
    public static final BitSet FOLLOW_51_in_factor3966 = new BitSet(new long[]{0x20140000200018B0L,0x0003DC0000040800L});
    public static final BitSet FOLLOW_52_in_factor3971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_factor3983 = new BitSet(new long[]{0x20040000200018B0L,0x0003DC0000040800L});
    public static final BitSet FOLLOW_expr_in_factor3987 = new BitSet(new long[]{0x0008000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_51_in_factor3992 = new BitSet(new long[]{0x20040000200018B0L,0x0003DC0000040800L});
    public static final BitSet FOLLOW_expr_in_factor3996 = new BitSet(new long[]{0x0008000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_factor4001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_factor4013 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_hash_line_in_factor4017 = new BitSet(new long[]{0x0008000040000000L});
    public static final BitSet FOLLOW_51_in_factor4022 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_hash_line_in_factor4026 = new BitSet(new long[]{0x0008000040000000L});
    public static final BitSet FOLLOW_30_in_factor4032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_factor4046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_factor4059 = new BitSet(new long[]{0x20040000200018B0L,0x0003DC0000040800L});
    public static final BitSet FOLLOW_expr_in_factor4063 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_factor4065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_var_domain0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_namespace4108 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_namespace4110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_timeframe4132 = new BitSet(new long[]{0x20040000200018B0L,0x0003DC0000040800L});
    public static final BitSet FOLLOW_expr_in_timeframe4136 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_period_in_timeframe4140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_hash_line4164 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_hash_line4166 = new BitSet(new long[]{0x20040000200018B0L,0x0003DC0000040800L});
    public static final BitSet FOLLOW_expr_in_hash_line4170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_css_emit4188 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_HTML_in_css_emit4194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_css_emit4202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_must_be_one_in_period4225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_cachable4259 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_cachable4262 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_INT_in_cachable4266 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_period_in_cachable4270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_emit_block4294 = new BitSet(new long[]{0x0000000000006800L});
    public static final BitSet FOLLOW_HTML_in_emit_block4300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_emit_block4308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JS_in_emit_block4316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_meta_block4348 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_meta_block4350 = new BitSet(new long[]{0x0000000040000010L,0x2980000000000000L});
    public static final BitSet FOLLOW_must_be_one_in_meta_block4359 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_HTML_in_meta_block4365 = new BitSet(new long[]{0x0000000040000010L,0x2980000000000000L});
    public static final BitSet FOLLOW_STRING_in_meta_block4369 = new BitSet(new long[]{0x0000000040000010L,0x2980000000000000L});
    public static final BitSet FOLLOW_119_in_meta_block4383 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_must_be_one_in_meta_block4387 = new BitSet(new long[]{0x0000000020000800L});
    public static final BitSet FOLLOW_STRING_in_meta_block4393 = new BitSet(new long[]{0x0000000060000810L,0x2980000000000000L});
    public static final BitSet FOLLOW_29_in_meta_block4397 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_name_value_pair_in_meta_block4400 = new BitSet(new long[]{0x0008000040000000L});
    public static final BitSet FOLLOW_51_in_meta_block4404 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_name_value_pair_in_meta_block4406 = new BitSet(new long[]{0x0008000040000000L});
    public static final BitSet FOLLOW_30_in_meta_block4412 = new BitSet(new long[]{0x0000000060000810L,0x2980000000000000L});
    public static final BitSet FOLLOW_120_in_meta_block4424 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_121_in_meta_block4426 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_meta_block4428 = new BitSet(new long[]{0x0000000040000010L,0x2980000000000000L});
    public static final BitSet FOLLOW_123_in_meta_block4436 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000010L});
    public static final BitSet FOLLOW_set_in_meta_block4440 = new BitSet(new long[]{0x0000000040000010L,0x2980000000000000L});
    public static final BitSet FOLLOW_125_in_meta_block4451 = new BitSet(new long[]{0x0000000000000000L,0xC008000000000000L});
    public static final BitSet FOLLOW_set_in_meta_block4458 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_must_be_in_meta_block4464 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_STRING_in_meta_block4470 = new BitSet(new long[]{0x0000000040000010L,0x2980000000000000L});
    public static final BitSet FOLLOW_VAR_in_meta_block4476 = new BitSet(new long[]{0x0000000040000010L,0x2980000000000000L});
    public static final BitSet FOLLOW_127_in_meta_block4491 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_meta_block4496 = new BitSet(new long[]{0x0000000040000010L,0x2980000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_128_in_meta_block4499 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_meta_block4503 = new BitSet(new long[]{0x0000000040000010L,0x2980000000000000L});
    public static final BitSet FOLLOW_30_in_meta_block4518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_must_be_in_dispatch_block4549 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_dispatch_block4553 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_must_be_in_dispatch_block4556 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_dispatch_block4561 = new BitSet(new long[]{0x0000000040000010L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_dispatch_block4564 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_dispatch_block4568 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_30_in_dispatch_block4578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_name_value_pair4601 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_name_value_pair4603 = new BitSet(new long[]{0x00000000000008A0L});
    public static final BitSet FOLLOW_INT_in_name_value_pair4611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_name_value_pair4622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_name_value_pair4633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emit_block_in_synpred19_RuleSet21022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeframe_in_synpred119_RuleSet23423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_synpred120_RuleSet23402 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_synpred120_RuleSet23406 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_must_be_in_synpred120_RuleSet23408 = new BitSet(new long[]{0x0000000000000000L,0x0003000000000000L});
    public static final BitSet FOLLOW_var_domain_in_synpred120_RuleSet23413 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_synpred120_RuleSet23415 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_synpred120_RuleSet23419 = new BitSet(new long[]{0x0000000000000002L,0x0004000000000000L});
    public static final BitSet FOLLOW_timeframe_in_synpred120_RuleSet23423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_synpred122_RuleSet23431 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_synpred122_RuleSet23435 = new BitSet(new long[]{0x0800000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_set_in_synpred122_RuleSet23439 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_synpred122_RuleSet23449 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_must_be_in_synpred122_RuleSet23452 = new BitSet(new long[]{0x0000000000000000L,0x0003000000000000L});
    public static final BitSet FOLLOW_var_domain_in_synpred122_RuleSet23457 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_synpred122_RuleSet23459 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_synpred122_RuleSet23463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_domain_in_synpred123_RuleSet23472 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_synpred123_RuleSet23474 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_synpred123_RuleSet23478 = new BitSet(new long[]{0x0000000007FC0000L});
    public static final BitSet FOLLOW_predop_in_synpred123_RuleSet23482 = new BitSet(new long[]{0x20040000200018B0L,0x0003DC0000040800L});
    public static final BitSet FOLLOW_expr_in_synpred123_RuleSet23486 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_timeframe_in_synpred123_RuleSet23490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_domain_in_synpred124_RuleSet23500 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_synpred124_RuleSet23502 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_synpred124_RuleSet23506 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_timeframe_in_synpred124_RuleSet23510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_synpred155_RuleSet23821 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_108_in_synpred155_RuleSet23823 = new BitSet(new long[]{0x20040000200018B0L,0x0003DC0000040800L});
    public static final BitSet FOLLOW_expr_in_synpred155_RuleSet23827 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_synpred155_RuleSet23829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namespace_in_synpred161_RuleSet23913 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_synpred161_RuleSet23917 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_synpred161_RuleSet23919 = new BitSet(new long[]{0x20140000200018B0L,0x0003DC0000040800L});
    public static final BitSet FOLLOW_expr_in_synpred161_RuleSet23924 = new BitSet(new long[]{0x201C0000200018B0L,0x0003DC0000040800L});
    public static final BitSet FOLLOW_51_in_synpred161_RuleSet23935 = new BitSet(new long[]{0x20140000200018B0L,0x0003DC0000040800L});
    public static final BitSet FOLLOW_52_in_synpred161_RuleSet23940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_synpred164_RuleSet23955 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_synpred164_RuleSet23957 = new BitSet(new long[]{0x20140000200018B0L,0x0003DC0000040800L});
    public static final BitSet FOLLOW_expr_in_synpred164_RuleSet23962 = new BitSet(new long[]{0x201C0000200018B0L,0x0003DC0000040800L});
    public static final BitSet FOLLOW_51_in_synpred164_RuleSet23966 = new BitSet(new long[]{0x20140000200018B0L,0x0003DC0000040800L});
    public static final BitSet FOLLOW_52_in_synpred164_RuleSet23971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_synpred169_RuleSet24046 = new BitSet(new long[]{0x0000000000000002L});

}