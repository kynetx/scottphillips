// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g 2010-07-09 15:29:58

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class rulesetParser extends Parser {
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


        public rulesetParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public rulesetParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return rulesetParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g"; }

     
    public String getErrorMessage(RecognitionException e, String[] tokenNames)
    {
    	List stack = getRuleInvocationStack(e, this.getClass().getName()); 
    	String msg = null; 
    	if ( e instanceof NoViableAltException ) {
    		NoViableAltException nvae = (NoViableAltException)e; 
    		msg = " no viable alt; token= " + e.token + " (decision=" + nvae.decisionNumber + 
    			" state " + nvae.stateNumber + ")" + " decision=<<" + nvae.grammarDecisionDescription + ">>";
         	} 
    	else  {
    		msg = super.getErrorMessage(e, tokenNames); 
    	}
    	System.out.println(stack + " " + msg);
    	return stack + " " + msg;
        }


      public String getTokenErrorDisplay(Token t) {
        return t.toString();
      } 



    public static class ruleset_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ruleset"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:98:1: ruleset : 'ruleset' rulesetname '{' ( meta_block | dispatch_block | global_decls | rule )* '}' EOF ;
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

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:99:3: ( 'ruleset' rulesetname '{' ( meta_block | dispatch_block | global_decls | rule )* '}' EOF )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:99:5: 'ruleset' rulesetname '{' ( meta_block | dispatch_block | global_decls | rule )* '}' EOF
            {
            root_0 = (Object)adaptor.nil();

            string_literal1=(Token)match(input,19,FOLLOW_19_in_ruleset670); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal1_tree = (Object)adaptor.create(string_literal1);
            adaptor.addChild(root_0, string_literal1_tree);
            }
            pushFollow(FOLLOW_rulesetname_in_ruleset672);
            rulesetname2=rulesetname();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, rulesetname2.getTree());
            char_literal3=(Token)match(input,20,FOLLOW_20_in_ruleset674); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal3_tree = (Object)adaptor.create(char_literal3);
            adaptor.addChild(root_0, char_literal3_tree);
            }
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:100:4: ( meta_block | dispatch_block | global_decls | rule )*
            loop1:
            do {
                int alt1=5;
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

                switch (alt1) {
            	case 1 :
            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:100:6: meta_block
            	    {
            	    pushFollow(FOLLOW_meta_block_in_ruleset682);
            	    meta_block4=meta_block();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, meta_block4.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:101:6: dispatch_block
            	    {
            	    pushFollow(FOLLOW_dispatch_block_in_ruleset690);
            	    dispatch_block5=dispatch_block();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, dispatch_block5.getTree());

            	    }
            	    break;
            	case 3 :
            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:102:6: global_decls
            	    {
            	    pushFollow(FOLLOW_global_decls_in_ruleset697);
            	    global_decls6=global_decls();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, global_decls6.getTree());

            	    }
            	    break;
            	case 4 :
            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:103:6: rule
            	    {
            	    pushFollow(FOLLOW_rule_in_ruleset705);
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

            char_literal8=(Token)match(input,21,FOLLOW_21_in_ruleset713); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal8_tree = (Object)adaptor.create(char_literal8);
            adaptor.addChild(root_0, char_literal8_tree);
            }
            EOF9=(Token)match(input,EOF,FOLLOW_EOF_in_ruleset715); if (state.failed) return retval;
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
        return retval;
    }
    // $ANTLR end "ruleset"

    public static class rulesetname_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rulesetname"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:112:1: rulesetname : ( ID | INT );
    public final rulesetParser.rulesetname_return rulesetname() throws RecognitionException {
        rulesetParser.rulesetname_return retval = new rulesetParser.rulesetname_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set10=null;

        Object set10_tree=null;

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:113:2: ( ID | INT )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:
            {
            root_0 = (Object)adaptor.nil();

            set10=(Token)input.LT(1);
            if ( (input.LA(1)>=ID && input.LA(1)<=INT) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set10));
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
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:120:1: rule : 'rule' ID 'is' rule_state '{' select ( pre_block )? ( emit_block )? ( action ( ';' )? ) ( callbacks )? ( post_block )? '}' ;
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

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:120:6: ( 'rule' ID 'is' rule_state '{' select ( pre_block )? ( emit_block )? ( action ( ';' )? ) ( callbacks )? ( post_block )? '}' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:120:9: 'rule' ID 'is' rule_state '{' select ( pre_block )? ( emit_block )? ( action ( ';' )? ) ( callbacks )? ( post_block )? '}'
            {
            root_0 = (Object)adaptor.nil();

            string_literal11=(Token)match(input,22,FOLLOW_22_in_rule774); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal11_tree = (Object)adaptor.create(string_literal11);
            adaptor.addChild(root_0, string_literal11_tree);
            }
            ID12=(Token)match(input,ID,FOLLOW_ID_in_rule776); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID12_tree = (Object)adaptor.create(ID12);
            adaptor.addChild(root_0, ID12_tree);
            }
            string_literal13=(Token)match(input,23,FOLLOW_23_in_rule778); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal13_tree = (Object)adaptor.create(string_literal13);
            adaptor.addChild(root_0, string_literal13_tree);
            }
            pushFollow(FOLLOW_rule_state_in_rule780);
            rule_state14=rule_state();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, rule_state14.getTree());
            char_literal15=(Token)match(input,20,FOLLOW_20_in_rule782); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal15_tree = (Object)adaptor.create(char_literal15);
            adaptor.addChild(root_0, char_literal15_tree);
            }
            pushFollow(FOLLOW_select_in_rule785);
            select16=select();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, select16.getTree());
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:121:9: ( pre_block )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==64) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:0:0: pre_block
                    {
                    pushFollow(FOLLOW_pre_block_in_rule787);
                    pre_block17=pre_block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pre_block17.getTree());

                    }
                    break;

            }

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:121:20: ( emit_block )?
            int alt3=2;
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
            switch (alt3) {
                case 1 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:0:0: emit_block
                    {
                    pushFollow(FOLLOW_emit_block_in_rule790);
                    emit_block18=emit_block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, emit_block18.getTree());

                    }
                    break;

            }

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:121:32: ( action ( ';' )? )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:121:33: action ( ';' )?
            {
            pushFollow(FOLLOW_action_in_rule794);
            action19=action();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, action19.getTree());
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:121:40: ( ';' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==24) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:0:0: ';'
                    {
                    char_literal20=(Token)match(input,24,FOLLOW_24_in_rule796); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal20_tree = (Object)adaptor.create(char_literal20);
                    adaptor.addChild(root_0, char_literal20_tree);
                    }

                    }
                    break;

            }


            }

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:121:46: ( callbacks )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==30) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:0:0: callbacks
                    {
                    pushFollow(FOLLOW_callbacks_in_rule800);
                    callbacks21=callbacks();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, callbacks21.getTree());

                    }
                    break;

            }

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:121:57: ( post_block )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=25 && LA6_0<=27)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:0:0: post_block
                    {
                    pushFollow(FOLLOW_post_block_in_rule803);
                    post_block22=post_block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, post_block22.getTree());

                    }
                    break;

            }

            char_literal23=(Token)match(input,21,FOLLOW_21_in_rule807); if (state.failed) return retval;
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
        return retval;
    }
    // $ANTLR end "rule"

    public static class post_block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "post_block"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:128:1: post_block : post '{' post_statement ';' ';' '}' post_alternate ;
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

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:128:11: ( post '{' post_statement ';' ';' '}' post_alternate )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:128:13: post '{' post_statement ';' ';' '}' post_alternate
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_post_in_post_block821);
            post24=post();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, post24.getTree());
            char_literal25=(Token)match(input,20,FOLLOW_20_in_post_block823); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal25_tree = (Object)adaptor.create(char_literal25);
            adaptor.addChild(root_0, char_literal25_tree);
            }
            pushFollow(FOLLOW_post_statement_in_post_block825);
            post_statement26=post_statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, post_statement26.getTree());
            char_literal27=(Token)match(input,24,FOLLOW_24_in_post_block827); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal27_tree = (Object)adaptor.create(char_literal27);
            adaptor.addChild(root_0, char_literal27_tree);
            }
            char_literal28=(Token)match(input,24,FOLLOW_24_in_post_block829); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal28_tree = (Object)adaptor.create(char_literal28);
            adaptor.addChild(root_0, char_literal28_tree);
            }
            char_literal29=(Token)match(input,21,FOLLOW_21_in_post_block831); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal29_tree = (Object)adaptor.create(char_literal29);
            adaptor.addChild(root_0, char_literal29_tree);
            }
            pushFollow(FOLLOW_post_alternate_in_post_block833);
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
        return retval;
    }
    // $ANTLR end "post_block"

    public static class post_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "post"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:130:1: post : ( 'fired' | 'always' | 'notfired' );
    public final rulesetParser.post_return post() throws RecognitionException {
        rulesetParser.post_return retval = new rulesetParser.post_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set31=null;

        Object set31_tree=null;

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:130:5: ( 'fired' | 'always' | 'notfired' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:
            {
            root_0 = (Object)adaptor.nil();

            set31=(Token)input.LT(1);
            if ( (input.LA(1)>=25 && input.LA(1)<=27) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set31));
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
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:135:1: post_alternate : 'else' '{' post_statement ';' ';' '}' ;
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

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:135:15: ( 'else' '{' post_statement ';' ';' '}' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:135:17: 'else' '{' post_statement ';' ';' '}'
            {
            root_0 = (Object)adaptor.nil();

            string_literal32=(Token)match(input,28,FOLLOW_28_in_post_alternate864); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal32_tree = (Object)adaptor.create(string_literal32);
            adaptor.addChild(root_0, string_literal32_tree);
            }
            char_literal33=(Token)match(input,20,FOLLOW_20_in_post_alternate866); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal33_tree = (Object)adaptor.create(char_literal33);
            adaptor.addChild(root_0, char_literal33_tree);
            }
            pushFollow(FOLLOW_post_statement_in_post_alternate868);
            post_statement34=post_statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, post_statement34.getTree());
            char_literal35=(Token)match(input,24,FOLLOW_24_in_post_alternate870); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal35_tree = (Object)adaptor.create(char_literal35);
            adaptor.addChild(root_0, char_literal35_tree);
            }
            char_literal36=(Token)match(input,24,FOLLOW_24_in_post_alternate872); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal36_tree = (Object)adaptor.create(char_literal36);
            adaptor.addChild(root_0, char_literal36_tree);
            }
            char_literal37=(Token)match(input,21,FOLLOW_21_in_post_alternate874); if (state.failed) return retval;
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
        return retval;
    }
    // $ANTLR end "post_alternate"

    public static class post_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "post_statement"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:137:1: post_statement : ( persistent_expr ( 'if' expr ) | log_statement ( 'if' expr ) | control_statement ( 'if' expr ) | raise_statement ( 'if' expr ) );
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

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:137:15: ( persistent_expr ( 'if' expr ) | log_statement ( 'if' expr ) | control_statement ( 'if' expr ) | raise_statement ( 'if' expr ) )
            int alt7=4;
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

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:137:17: persistent_expr ( 'if' expr )
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_persistent_expr_in_post_statement881);
                    persistent_expr38=persistent_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, persistent_expr38.getTree());
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:137:33: ( 'if' expr )
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:137:34: 'if' expr
                    {
                    string_literal39=(Token)match(input,29,FOLLOW_29_in_post_statement884); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal39_tree = (Object)adaptor.create(string_literal39);
                    adaptor.addChild(root_0, string_literal39_tree);
                    }
                    pushFollow(FOLLOW_expr_in_post_statement886);
                    expr40=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr40.getTree());

                    }


                    }
                    break;
                case 2 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:138:5: log_statement ( 'if' expr )
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_log_statement_in_post_statement893);
                    log_statement41=log_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, log_statement41.getTree());
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:138:19: ( 'if' expr )
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:138:20: 'if' expr
                    {
                    string_literal42=(Token)match(input,29,FOLLOW_29_in_post_statement896); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal42_tree = (Object)adaptor.create(string_literal42);
                    adaptor.addChild(root_0, string_literal42_tree);
                    }
                    pushFollow(FOLLOW_expr_in_post_statement898);
                    expr43=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr43.getTree());

                    }


                    }
                    break;
                case 3 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:139:5: control_statement ( 'if' expr )
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_control_statement_in_post_statement905);
                    control_statement44=control_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, control_statement44.getTree());
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:139:23: ( 'if' expr )
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:139:24: 'if' expr
                    {
                    string_literal45=(Token)match(input,29,FOLLOW_29_in_post_statement908); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal45_tree = (Object)adaptor.create(string_literal45);
                    adaptor.addChild(root_0, string_literal45_tree);
                    }
                    pushFollow(FOLLOW_expr_in_post_statement910);
                    expr46=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr46.getTree());

                    }


                    }
                    break;
                case 4 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:140:5: raise_statement ( 'if' expr )
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_raise_statement_in_post_statement917);
                    raise_statement47=raise_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, raise_statement47.getTree());
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:140:21: ( 'if' expr )
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:140:22: 'if' expr
                    {
                    string_literal48=(Token)match(input,29,FOLLOW_29_in_post_statement920); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal48_tree = (Object)adaptor.create(string_literal48);
                    adaptor.addChild(root_0, string_literal48_tree);
                    }
                    pushFollow(FOLLOW_expr_in_post_statement922);
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
        return retval;
    }
    // $ANTLR end "post_statement"

    public static class callbacks_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "callbacks"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:144:1: callbacks : 'callbacks' '{' ( success )? ( failure )? '}' ;
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

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:144:10: ( 'callbacks' '{' ( success )? ( failure )? '}' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:144:12: 'callbacks' '{' ( success )? ( failure )? '}'
            {
            root_0 = (Object)adaptor.nil();

            string_literal50=(Token)match(input,30,FOLLOW_30_in_callbacks934); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal50_tree = (Object)adaptor.create(string_literal50);
            adaptor.addChild(root_0, string_literal50_tree);
            }
            char_literal51=(Token)match(input,20,FOLLOW_20_in_callbacks936); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal51_tree = (Object)adaptor.create(char_literal51);
            adaptor.addChild(root_0, char_literal51_tree);
            }
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:144:28: ( success )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==31) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:0:0: success
                    {
                    pushFollow(FOLLOW_success_in_callbacks938);
                    success52=success();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, success52.getTree());

                    }
                    break;

            }

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:144:37: ( failure )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==32) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:0:0: failure
                    {
                    pushFollow(FOLLOW_failure_in_callbacks941);
                    failure53=failure();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, failure53.getTree());

                    }
                    break;

            }

            char_literal54=(Token)match(input,21,FOLLOW_21_in_callbacks944); if (state.failed) return retval;
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
        return retval;
    }
    // $ANTLR end "callbacks"

    public static class success_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "success"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:146:1: success : 'success' '{' click ( ';' )? '}' ;
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

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:146:8: ( 'success' '{' click ( ';' )? '}' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:146:10: 'success' '{' click ( ';' )? '}'
            {
            root_0 = (Object)adaptor.nil();

            string_literal55=(Token)match(input,31,FOLLOW_31_in_success951); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal55_tree = (Object)adaptor.create(string_literal55);
            adaptor.addChild(root_0, string_literal55_tree);
            }
            char_literal56=(Token)match(input,20,FOLLOW_20_in_success953); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal56_tree = (Object)adaptor.create(char_literal56);
            adaptor.addChild(root_0, char_literal56_tree);
            }
            pushFollow(FOLLOW_click_in_success955);
            click57=click();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, click57.getTree());
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:146:30: ( ';' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:0:0: ';'
                    {
                    char_literal58=(Token)match(input,24,FOLLOW_24_in_success957); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal58_tree = (Object)adaptor.create(char_literal58);
                    adaptor.addChild(root_0, char_literal58_tree);
                    }

                    }
                    break;

            }

            char_literal59=(Token)match(input,21,FOLLOW_21_in_success960); if (state.failed) return retval;
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
        return retval;
    }
    // $ANTLR end "success"

    public static class failure_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "failure"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:148:1: failure : 'failure' '{' click ( ';' )? '}' ;
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

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:148:8: ( 'failure' '{' click ( ';' )? '}' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:148:10: 'failure' '{' click ( ';' )? '}'
            {
            root_0 = (Object)adaptor.nil();

            string_literal60=(Token)match(input,32,FOLLOW_32_in_failure967); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal60_tree = (Object)adaptor.create(string_literal60);
            adaptor.addChild(root_0, string_literal60_tree);
            }
            char_literal61=(Token)match(input,20,FOLLOW_20_in_failure969); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal61_tree = (Object)adaptor.create(char_literal61);
            adaptor.addChild(root_0, char_literal61_tree);
            }
            pushFollow(FOLLOW_click_in_failure971);
            click62=click();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, click62.getTree());
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:148:30: ( ';' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:0:0: ';'
                    {
                    char_literal63=(Token)match(input,24,FOLLOW_24_in_failure973); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal63_tree = (Object)adaptor.create(char_literal63);
                    adaptor.addChild(root_0, char_literal63_tree);
                    }

                    }
                    break;

            }

            char_literal64=(Token)match(input,21,FOLLOW_21_in_failure978); if (state.failed) return retval;
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
        return retval;
    }
    // $ANTLR end "failure"

    public static class click_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "click"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:150:1: click : ( 'click' | 'change' ) ID '=' STRING ( click_link )? ;
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

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:150:6: ( ( 'click' | 'change' ) ID '=' STRING ( click_link )? )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:150:8: ( 'click' | 'change' ) ID '=' STRING ( click_link )?
            {
            root_0 = (Object)adaptor.nil();

            set65=(Token)input.LT(1);
            if ( (input.LA(1)>=33 && input.LA(1)<=34) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set65));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            ID66=(Token)match(input,ID,FOLLOW_ID_in_click993); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID66_tree = (Object)adaptor.create(ID66);
            adaptor.addChild(root_0, ID66_tree);
            }
            char_literal67=(Token)match(input,35,FOLLOW_35_in_click995); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal67_tree = (Object)adaptor.create(char_literal67);
            adaptor.addChild(root_0, char_literal67_tree);
            }
            STRING68=(Token)match(input,STRING,FOLLOW_STRING_in_click997); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING68_tree = (Object)adaptor.create(STRING68);
            adaptor.addChild(root_0, STRING68_tree);
            }
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:150:43: ( click_link )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==36) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:0:0: click_link
                    {
                    pushFollow(FOLLOW_click_link_in_click999);
                    click_link69=click_link();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, click_link69.getTree());

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:152:1: click_link : 'triggers' persistent_expr ;
    public final rulesetParser.click_link_return click_link() throws RecognitionException {
        rulesetParser.click_link_return retval = new rulesetParser.click_link_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal70=null;
        rulesetParser.persistent_expr_return persistent_expr71 = null;


        Object string_literal70_tree=null;

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:152:11: ( 'triggers' persistent_expr )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:152:13: 'triggers' persistent_expr
            {
            root_0 = (Object)adaptor.nil();

            string_literal70=(Token)match(input,36,FOLLOW_36_in_click_link1007); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal70_tree = (Object)adaptor.create(string_literal70);
            adaptor.addChild(root_0, string_literal70_tree);
            }
            pushFollow(FOLLOW_persistent_expr_in_click_link1009);
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
        return retval;
    }
    // $ANTLR end "click_link"

    public static class persistent_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "persistent_expr"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:155:1: persistent_expr : ( persistent_clear | persistent_set | persistent_iterate | trail_forget | trail_mark );
    public final rulesetParser.persistent_expr_return persistent_expr() throws RecognitionException {
        rulesetParser.persistent_expr_return retval = new rulesetParser.persistent_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        rulesetParser.persistent_clear_return persistent_clear72 = null;

        rulesetParser.persistent_set_return persistent_set73 = null;

        rulesetParser.persistent_iterate_return persistent_iterate74 = null;

        rulesetParser.trail_forget_return trail_forget75 = null;

        rulesetParser.trail_mark_return trail_mark76 = null;



        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:155:16: ( persistent_clear | persistent_set | persistent_iterate | trail_forget | trail_mark )
            int alt13=5;
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

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:155:18: persistent_clear
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_persistent_clear_in_persistent_expr1017);
                    persistent_clear72=persistent_clear();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, persistent_clear72.getTree());

                    }
                    break;
                case 2 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:156:6: persistent_set
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_persistent_set_in_persistent_expr1024);
                    persistent_set73=persistent_set();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, persistent_set73.getTree());

                    }
                    break;
                case 3 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:157:6: persistent_iterate
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_persistent_iterate_in_persistent_expr1031);
                    persistent_iterate74=persistent_iterate();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, persistent_iterate74.getTree());

                    }
                    break;
                case 4 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:158:6: trail_forget
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_trail_forget_in_persistent_expr1038);
                    trail_forget75=trail_forget();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, trail_forget75.getTree());

                    }
                    break;
                case 5 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:159:6: trail_mark
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_trail_mark_in_persistent_expr1045);
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
        return retval;
    }
    // $ANTLR end "persistent_expr"

    public static class persistent_clear_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "persistent_clear"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:162:1: persistent_clear : 'clear' var_domain ':' ID ;
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

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:162:17: ( 'clear' var_domain ':' ID )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:162:19: 'clear' var_domain ':' ID
            {
            root_0 = (Object)adaptor.nil();

            string_literal77=(Token)match(input,37,FOLLOW_37_in_persistent_clear1053); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal77_tree = (Object)adaptor.create(string_literal77);
            adaptor.addChild(root_0, string_literal77_tree);
            }
            pushFollow(FOLLOW_var_domain_in_persistent_clear1055);
            var_domain78=var_domain();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, var_domain78.getTree());
            char_literal79=(Token)match(input,38,FOLLOW_38_in_persistent_clear1057); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal79_tree = (Object)adaptor.create(char_literal79);
            adaptor.addChild(root_0, char_literal79_tree);
            }
            ID80=(Token)match(input,ID,FOLLOW_ID_in_persistent_clear1059); if (state.failed) return retval;
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
        return retval;
    }
    // $ANTLR end "persistent_clear"

    public static class persistent_set_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "persistent_set"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:164:1: persistent_set : 'set' var_domain ':' ID ;
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

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:164:15: ( 'set' var_domain ':' ID )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:164:17: 'set' var_domain ':' ID
            {
            root_0 = (Object)adaptor.nil();

            string_literal81=(Token)match(input,39,FOLLOW_39_in_persistent_set1066); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal81_tree = (Object)adaptor.create(string_literal81);
            adaptor.addChild(root_0, string_literal81_tree);
            }
            pushFollow(FOLLOW_var_domain_in_persistent_set1068);
            var_domain82=var_domain();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, var_domain82.getTree());
            char_literal83=(Token)match(input,38,FOLLOW_38_in_persistent_set1070); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal83_tree = (Object)adaptor.create(char_literal83);
            adaptor.addChild(root_0, char_literal83_tree);
            }
            ID84=(Token)match(input,ID,FOLLOW_ID_in_persistent_set1072); if (state.failed) return retval;
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
        return retval;
    }
    // $ANTLR end "persistent_set"

    public static class persistent_iterate_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "persistent_iterate"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:166:1: persistent_iterate : var_domain ':' ID counter_op expr counter_start ;
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

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:166:19: ( var_domain ':' ID counter_op expr counter_start )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:166:21: var_domain ':' ID counter_op expr counter_start
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_var_domain_in_persistent_iterate1079);
            var_domain85=var_domain();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, var_domain85.getTree());
            char_literal86=(Token)match(input,38,FOLLOW_38_in_persistent_iterate1081); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal86_tree = (Object)adaptor.create(char_literal86);
            adaptor.addChild(root_0, char_literal86_tree);
            }
            ID87=(Token)match(input,ID,FOLLOW_ID_in_persistent_iterate1083); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID87_tree = (Object)adaptor.create(ID87);
            adaptor.addChild(root_0, ID87_tree);
            }
            pushFollow(FOLLOW_counter_op_in_persistent_iterate1085);
            counter_op88=counter_op();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, counter_op88.getTree());
            pushFollow(FOLLOW_expr_in_persistent_iterate1087);
            expr89=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr89.getTree());
            pushFollow(FOLLOW_counter_start_in_persistent_iterate1089);
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
        return retval;
    }
    // $ANTLR end "persistent_iterate"

    public static class trail_forget_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "trail_forget"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:168:1: trail_forget : 'forget' STRING 'in' var_domain ':' ID ;
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

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:168:13: ( 'forget' STRING 'in' var_domain ':' ID )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:168:15: 'forget' STRING 'in' var_domain ':' ID
            {
            root_0 = (Object)adaptor.nil();

            string_literal91=(Token)match(input,40,FOLLOW_40_in_trail_forget1096); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal91_tree = (Object)adaptor.create(string_literal91);
            adaptor.addChild(root_0, string_literal91_tree);
            }
            STRING92=(Token)match(input,STRING,FOLLOW_STRING_in_trail_forget1098); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING92_tree = (Object)adaptor.create(STRING92);
            adaptor.addChild(root_0, STRING92_tree);
            }
            string_literal93=(Token)match(input,41,FOLLOW_41_in_trail_forget1100); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal93_tree = (Object)adaptor.create(string_literal93);
            adaptor.addChild(root_0, string_literal93_tree);
            }
            pushFollow(FOLLOW_var_domain_in_trail_forget1102);
            var_domain94=var_domain();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, var_domain94.getTree());
            char_literal95=(Token)match(input,38,FOLLOW_38_in_trail_forget1104); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal95_tree = (Object)adaptor.create(char_literal95);
            adaptor.addChild(root_0, char_literal95_tree);
            }
            ID96=(Token)match(input,ID,FOLLOW_ID_in_trail_forget1106); if (state.failed) return retval;
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
        return retval;
    }
    // $ANTLR end "trail_forget"

    public static class trail_mark_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "trail_mark"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:170:1: trail_mark : 'mark' var_domain ':' ID trail_with ;
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

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:170:11: ( 'mark' var_domain ':' ID trail_with )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:170:13: 'mark' var_domain ':' ID trail_with
            {
            root_0 = (Object)adaptor.nil();

            string_literal97=(Token)match(input,42,FOLLOW_42_in_trail_mark1113); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal97_tree = (Object)adaptor.create(string_literal97);
            adaptor.addChild(root_0, string_literal97_tree);
            }
            pushFollow(FOLLOW_var_domain_in_trail_mark1115);
            var_domain98=var_domain();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, var_domain98.getTree());
            char_literal99=(Token)match(input,38,FOLLOW_38_in_trail_mark1117); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal99_tree = (Object)adaptor.create(char_literal99);
            adaptor.addChild(root_0, char_literal99_tree);
            }
            ID100=(Token)match(input,ID,FOLLOW_ID_in_trail_mark1119); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID100_tree = (Object)adaptor.create(ID100);
            adaptor.addChild(root_0, ID100_tree);
            }
            pushFollow(FOLLOW_trail_with_in_trail_mark1121);
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
        return retval;
    }
    // $ANTLR end "trail_mark"

    public static class trail_with_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "trail_with"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:172:1: trail_with : 'with' expr ;
    public final rulesetParser.trail_with_return trail_with() throws RecognitionException {
        rulesetParser.trail_with_return retval = new rulesetParser.trail_with_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal102=null;
        rulesetParser.expr_return expr103 = null;


        Object string_literal102_tree=null;

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:172:11: ( 'with' expr )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:172:13: 'with' expr
            {
            root_0 = (Object)adaptor.nil();

            string_literal102=(Token)match(input,43,FOLLOW_43_in_trail_with1128); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal102_tree = (Object)adaptor.create(string_literal102);
            adaptor.addChild(root_0, string_literal102_tree);
            }
            pushFollow(FOLLOW_expr_in_trail_with1130);
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
        return retval;
    }
    // $ANTLR end "trail_with"

    public static class counter_op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "counter_op"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:175:1: counter_op : ( '+=' | '-=' );
    public final rulesetParser.counter_op_return counter_op() throws RecognitionException {
        rulesetParser.counter_op_return retval = new rulesetParser.counter_op_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set104=null;

        Object set104_tree=null;

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:175:11: ( '+=' | '-=' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:
            {
            root_0 = (Object)adaptor.nil();

            set104=(Token)input.LT(1);
            if ( (input.LA(1)>=44 && input.LA(1)<=45) ) {
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
    // $ANTLR end "counter_op"

    public static class counter_start_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "counter_start"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:178:1: counter_start : 'from' expr ;
    public final rulesetParser.counter_start_return counter_start() throws RecognitionException {
        rulesetParser.counter_start_return retval = new rulesetParser.counter_start_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal105=null;
        rulesetParser.expr_return expr106 = null;


        Object string_literal105_tree=null;

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:178:14: ( 'from' expr )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:178:16: 'from' expr
            {
            root_0 = (Object)adaptor.nil();

            string_literal105=(Token)match(input,46,FOLLOW_46_in_counter_start1159); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal105_tree = (Object)adaptor.create(string_literal105);
            adaptor.addChild(root_0, string_literal105_tree);
            }
            pushFollow(FOLLOW_expr_in_counter_start1161);
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
        return retval;
    }
    // $ANTLR end "counter_start"

    public static class log_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "log_statement"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:181:1: log_statement : 'log' expr ;
    public final rulesetParser.log_statement_return log_statement() throws RecognitionException {
        rulesetParser.log_statement_return retval = new rulesetParser.log_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal107=null;
        rulesetParser.expr_return expr108 = null;


        Object string_literal107_tree=null;

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:181:14: ( 'log' expr )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:181:16: 'log' expr
            {
            root_0 = (Object)adaptor.nil();

            string_literal107=(Token)match(input,47,FOLLOW_47_in_log_statement1169); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal107_tree = (Object)adaptor.create(string_literal107);
            adaptor.addChild(root_0, string_literal107_tree);
            }
            pushFollow(FOLLOW_expr_in_log_statement1171);
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
        return retval;
    }
    // $ANTLR end "log_statement"

    public static class control_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "control_statement"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:183:1: control_statement : 'last' ;
    public final rulesetParser.control_statement_return control_statement() throws RecognitionException {
        rulesetParser.control_statement_return retval = new rulesetParser.control_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal109=null;

        Object string_literal109_tree=null;

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:183:18: ( 'last' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:183:20: 'last'
            {
            root_0 = (Object)adaptor.nil();

            string_literal109=(Token)match(input,48,FOLLOW_48_in_control_statement1178); if (state.failed) return retval;
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
        return retval;
    }
    // $ANTLR end "control_statement"

    public static class raise_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "raise_statement"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:185:1: raise_statement : 'raise' 'explicit' 'event' ID for_clause modifier_clause ;
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

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:185:16: ( 'raise' 'explicit' 'event' ID for_clause modifier_clause )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:185:18: 'raise' 'explicit' 'event' ID for_clause modifier_clause
            {
            root_0 = (Object)adaptor.nil();

            string_literal110=(Token)match(input,49,FOLLOW_49_in_raise_statement1185); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal110_tree = (Object)adaptor.create(string_literal110);
            adaptor.addChild(root_0, string_literal110_tree);
            }
            string_literal111=(Token)match(input,50,FOLLOW_50_in_raise_statement1187); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal111_tree = (Object)adaptor.create(string_literal111);
            adaptor.addChild(root_0, string_literal111_tree);
            }
            string_literal112=(Token)match(input,51,FOLLOW_51_in_raise_statement1189); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal112_tree = (Object)adaptor.create(string_literal112);
            adaptor.addChild(root_0, string_literal112_tree);
            }
            ID113=(Token)match(input,ID,FOLLOW_ID_in_raise_statement1191); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID113_tree = (Object)adaptor.create(ID113);
            adaptor.addChild(root_0, ID113_tree);
            }
            pushFollow(FOLLOW_for_clause_in_raise_statement1193);
            for_clause114=for_clause();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, for_clause114.getTree());
            pushFollow(FOLLOW_modifier_clause_in_raise_statement1195);
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
        return retval;
    }
    // $ANTLR end "raise_statement"

    public static class for_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "for_clause"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:187:1: for_clause : 'for' ID ;
    public final rulesetParser.for_clause_return for_clause() throws RecognitionException {
        rulesetParser.for_clause_return retval = new rulesetParser.for_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal116=null;
        Token ID117=null;

        Object string_literal116_tree=null;
        Object ID117_tree=null;

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:187:11: ( 'for' ID )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:187:13: 'for' ID
            {
            root_0 = (Object)adaptor.nil();

            string_literal116=(Token)match(input,52,FOLLOW_52_in_for_clause1202); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal116_tree = (Object)adaptor.create(string_literal116);
            adaptor.addChild(root_0, string_literal116_tree);
            }
            ID117=(Token)match(input,ID,FOLLOW_ID_in_for_clause1204); if (state.failed) return retval;
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
        return retval;
    }
    // $ANTLR end "for_clause"

    public static class rule_state_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rule_state"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:192:1: rule_state : ( 'active' | 'inactive' | 'test' );
    public final rulesetParser.rule_state_return rule_state() throws RecognitionException {
        rulesetParser.rule_state_return retval = new rulesetParser.rule_state_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set118=null;

        Object set118_tree=null;

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:192:11: ( 'active' | 'inactive' | 'test' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:
            {
            root_0 = (Object)adaptor.nil();

            set118=(Token)input.LT(1);
            if ( (input.LA(1)>=53 && input.LA(1)<=55) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set118));
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
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:198:1: action : ( conditional_action | unconditional_action );
    public final rulesetParser.action_return action() throws RecognitionException {
        rulesetParser.action_return retval = new rulesetParser.action_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        rulesetParser.conditional_action_return conditional_action119 = null;

        rulesetParser.unconditional_action_return unconditional_action120 = null;



        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:198:9: ( conditional_action | unconditional_action )
            int alt14=2;
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

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:198:11: conditional_action
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_conditional_action_in_action1276);
                    conditional_action119=conditional_action();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditional_action119.getTree());

                    }
                    break;
                case 2 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:198:32: unconditional_action
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_unconditional_action_in_action1280);
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
        return retval;
    }
    // $ANTLR end "action"

    public static class conditional_action_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditional_action"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:202:1: conditional_action : 'if' expr 'then' unconditional_action ;
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

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:203:2: ( 'if' expr 'then' unconditional_action )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:203:4: 'if' expr 'then' unconditional_action
            {
            root_0 = (Object)adaptor.nil();

            string_literal121=(Token)match(input,29,FOLLOW_29_in_conditional_action1294); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal121_tree = (Object)adaptor.create(string_literal121);
            adaptor.addChild(root_0, string_literal121_tree);
            }
            pushFollow(FOLLOW_expr_in_conditional_action1296);
            expr122=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr122.getTree());
            string_literal123=(Token)match(input,56,FOLLOW_56_in_conditional_action1298); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal123_tree = (Object)adaptor.create(string_literal123);
            adaptor.addChild(root_0, string_literal123_tree);
            }
            pushFollow(FOLLOW_unconditional_action_in_conditional_action1300);
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
        return retval;
    }
    // $ANTLR end "conditional_action"

    public static class unconditional_action_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unconditional_action"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:206:1: unconditional_action : ( primrule | actionblock );
    public final rulesetParser.unconditional_action_return unconditional_action() throws RecognitionException {
        rulesetParser.unconditional_action_return retval = new rulesetParser.unconditional_action_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        rulesetParser.primrule_return primrule125 = null;

        rulesetParser.actionblock_return actionblock126 = null;



        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:207:2: ( primrule | actionblock )
            int alt15=2;
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

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:207:4: primrule
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primrule_in_unconditional_action1313);
                    primrule125=primrule();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primrule125.getTree());

                    }
                    break;
                case 2 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:207:15: actionblock
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_actionblock_in_unconditional_action1317);
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
        return retval;
    }
    // $ANTLR end "unconditional_action"

    public static class primrule_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primrule"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:210:1: primrule : ( ( rule_label )? ( namespace )? ID '(' ( expr ( ',' )? )* ')' ( modifier_clause )? | ( rule_label )? emit_block );
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

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:211:2: ( ( rule_label )? ( namespace )? ID '(' ( expr ( ',' )? )* ')' ( modifier_clause )? | ( rule_label )? emit_block )
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
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:212:2: ( rule_label )? ( namespace )? ID '(' ( expr ( ',' )? )* ')' ( modifier_clause )?
                    {
                    root_0 = (Object)adaptor.nil();

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:212:2: ( rule_label )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==ID) ) {
                        int LA16_1 = input.LA(2);

                        if ( (LA16_1==60) ) {
                            alt16=1;
                        }
                    }
                    switch (alt16) {
                        case 1 :
                            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:0:0: rule_label
                            {
                            pushFollow(FOLLOW_rule_label_in_primrule1332);
                            rule_label127=rule_label();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, rule_label127.getTree());

                            }
                            break;

                    }

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:212:14: ( namespace )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==ID) ) {
                        int LA17_1 = input.LA(2);

                        if ( (LA17_1==38) ) {
                            alt17=1;
                        }
                    }
                    switch (alt17) {
                        case 1 :
                            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:0:0: namespace
                            {
                            pushFollow(FOLLOW_namespace_in_primrule1335);
                            namespace128=namespace();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, namespace128.getTree());

                            }
                            break;

                    }

                    ID129=(Token)match(input,ID,FOLLOW_ID_in_primrule1338); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID129_tree = (Object)adaptor.create(ID129);
                    adaptor.addChild(root_0, ID129_tree);
                    }
                    char_literal130=(Token)match(input,57,FOLLOW_57_in_primrule1340); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal130_tree = (Object)adaptor.create(char_literal130);
                    adaptor.addChild(root_0, char_literal130_tree);
                    }
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:212:32: ( expr ( ',' )? )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( ((LA19_0>=ID && LA19_0<=INT)||LA19_0==STRING||LA19_0==REGEXP||LA19_0==20||LA19_0==57||LA19_0==71||LA19_0==84||LA19_0==102||(LA19_0>=104 && LA19_0<=106)||(LA19_0>=108 && LA19_0<=109)||(LA19_0>=134 && LA19_0<=135)) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:212:33: expr ( ',' )?
                    	    {
                    	    pushFollow(FOLLOW_expr_in_primrule1343);
                    	    expr131=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr131.getTree());
                    	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:212:38: ( ',' )?
                    	    int alt18=2;
                    	    int LA18_0 = input.LA(1);

                    	    if ( (LA18_0==58) ) {
                    	        alt18=1;
                    	    }
                    	    switch (alt18) {
                    	        case 1 :
                    	            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:0:0: ','
                    	            {
                    	            char_literal132=(Token)match(input,58,FOLLOW_58_in_primrule1345); if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) {
                    	            char_literal132_tree = (Object)adaptor.create(char_literal132);
                    	            adaptor.addChild(root_0, char_literal132_tree);
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    char_literal133=(Token)match(input,59,FOLLOW_59_in_primrule1350); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal133_tree = (Object)adaptor.create(char_literal133);
                    adaptor.addChild(root_0, char_literal133_tree);
                    }
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:212:49: ( modifier_clause )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==43) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:0:0: modifier_clause
                            {
                            pushFollow(FOLLOW_modifier_clause_in_primrule1352);
                            modifier_clause134=modifier_clause();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, modifier_clause134.getTree());

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                      System.out.println("found primrule: "+input.toString(retval.start,input.LT(-1)));
                    }

                    }
                    break;
                case 2 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:215:3: ( rule_label )? emit_block
                    {
                    root_0 = (Object)adaptor.nil();

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:215:3: ( rule_label )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==ID) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:0:0: rule_label
                            {
                            pushFollow(FOLLOW_rule_label_in_primrule1365);
                            rule_label135=rule_label();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, rule_label135.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_emit_block_in_primrule1368);
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
        return retval;
    }
    // $ANTLR end "primrule"

    public static class rule_label_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rule_label"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:219:1: rule_label : ID '=>' ;
    public final rulesetParser.rule_label_return rule_label() throws RecognitionException {
        rulesetParser.rule_label_return retval = new rulesetParser.rule_label_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID137=null;
        Token string_literal138=null;

        Object ID137_tree=null;
        Object string_literal138_tree=null;

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:219:12: ( ID '=>' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:219:14: ID '=>'
            {
            root_0 = (Object)adaptor.nil();

            ID137=(Token)match(input,ID,FOLLOW_ID_in_rule_label1391); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID137_tree = (Object)adaptor.create(ID137);
            adaptor.addChild(root_0, ID137_tree);
            }
            string_literal138=(Token)match(input,60,FOLLOW_60_in_rule_label1393); if (state.failed) return retval;
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
        return retval;
    }
    // $ANTLR end "rule_label"

    public static class modifier_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "modifier_clause"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:221:1: modifier_clause : 'with' modifierx ( 'and' modifierx )* ;
    public final rulesetParser.modifier_clause_return modifier_clause() throws RecognitionException {
        rulesetParser.modifier_clause_return retval = new rulesetParser.modifier_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal139=null;
        Token string_literal141=null;
        rulesetParser.modifierx_return modifierx140 = null;

        rulesetParser.modifierx_return modifierx142 = null;


        Object string_literal139_tree=null;
        Object string_literal141_tree=null;

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:222:2: ( 'with' modifierx ( 'and' modifierx )* )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:223:3: 'with' modifierx ( 'and' modifierx )*
            {
            root_0 = (Object)adaptor.nil();

            string_literal139=(Token)match(input,43,FOLLOW_43_in_modifier_clause1418); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal139_tree = (Object)adaptor.create(string_literal139);
            adaptor.addChild(root_0, string_literal139_tree);
            }
            pushFollow(FOLLOW_modifierx_in_modifier_clause1420);
            modifierx140=modifierx();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, modifierx140.getTree());
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:223:20: ( 'and' modifierx )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==61) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:223:21: 'and' modifierx
            	    {
            	    string_literal141=(Token)match(input,61,FOLLOW_61_in_modifier_clause1423); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal141_tree = (Object)adaptor.create(string_literal141);
            	    adaptor.addChild(root_0, string_literal141_tree);
            	    }
            	    pushFollow(FOLLOW_modifierx_in_modifier_clause1425);
            	    modifierx142=modifierx();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, modifierx142.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
              System.out.println("found mod clause expr: "+input.toString(retval.start,input.LT(-1)));
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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

    public static class modifierx_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "modifierx"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:227:1: modifierx : ( ID '=' STRING | ID '=' JS );
    public final rulesetParser.modifierx_return modifierx() throws RecognitionException {
        rulesetParser.modifierx_return retval = new rulesetParser.modifierx_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID143=null;
        Token char_literal144=null;
        Token STRING145=null;
        Token ID146=null;
        Token char_literal147=null;
        Token JS148=null;

        Object ID143_tree=null;
        Object char_literal144_tree=null;
        Object STRING145_tree=null;
        Object ID146_tree=null;
        Object char_literal147_tree=null;
        Object JS148_tree=null;

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:228:2: ( ID '=' STRING | ID '=' JS )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==ID) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==35) ) {
                    int LA24_2 = input.LA(3);

                    if ( (LA24_2==STRING) ) {
                        alt24=1;
                    }
                    else if ( (LA24_2==JS) ) {
                        alt24=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:228:4: ID '=' STRING
                    {
                    root_0 = (Object)adaptor.nil();

                    ID143=(Token)match(input,ID,FOLLOW_ID_in_modifierx1444); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID143_tree = (Object)adaptor.create(ID143);
                    adaptor.addChild(root_0, ID143_tree);
                    }
                    char_literal144=(Token)match(input,35,FOLLOW_35_in_modifierx1446); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal144_tree = (Object)adaptor.create(char_literal144);
                    adaptor.addChild(root_0, char_literal144_tree);
                    }
                    STRING145=(Token)match(input,STRING,FOLLOW_STRING_in_modifierx1448); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING145_tree = (Object)adaptor.create(STRING145);
                    adaptor.addChild(root_0, STRING145_tree);
                    }
                    if ( state.backtracking==0 ) {
                      System.out.println("found modifier  expr: " + input.toString(retval.start,input.LT(-1)));
                    }

                    }
                    break;
                case 2 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:231:4: ID '=' JS
                    {
                    root_0 = (Object)adaptor.nil();

                    ID146=(Token)match(input,ID,FOLLOW_ID_in_modifierx1459); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID146_tree = (Object)adaptor.create(ID146);
                    adaptor.addChild(root_0, ID146_tree);
                    }
                    char_literal147=(Token)match(input,35,FOLLOW_35_in_modifierx1461); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal147_tree = (Object)adaptor.create(char_literal147);
                    adaptor.addChild(root_0, char_literal147_tree);
                    }
                    JS148=(Token)match(input,JS,FOLLOW_JS_in_modifierx1463); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    JS148_tree = (Object)adaptor.create(JS148);
                    adaptor.addChild(root_0, JS148_tree);
                    }
                    if ( state.backtracking==0 ) {
                      System.out.println("found modifier  JS expr: " + input.toString(retval.start,input.LT(-1)));
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
    // $ANTLR end "modifierx"

    public static class actionblock_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "actionblock"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:235:1: actionblock : blocktype '{' ( primrule ( ';' )? )* '}' ;
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

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:236:2: ( blocktype '{' ( primrule ( ';' )? )* '}' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:236:4: blocktype '{' ( primrule ( ';' )? )* '}'
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_blocktype_in_actionblock1479);
            blocktype149=blocktype();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, blocktype149.getTree());
            char_literal150=(Token)match(input,20,FOLLOW_20_in_actionblock1481); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal150_tree = (Object)adaptor.create(char_literal150);
            adaptor.addChild(root_0, char_literal150_tree);
            }
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:236:18: ( primrule ( ';' )? )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==ID||LA26_0==136) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:236:19: primrule ( ';' )?
            	    {
            	    pushFollow(FOLLOW_primrule_in_actionblock1484);
            	    primrule151=primrule();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, primrule151.getTree());
            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:236:28: ( ';' )?
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==24) ) {
            	        alt25=1;
            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:0:0: ';'
            	            {
            	            char_literal152=(Token)match(input,24,FOLLOW_24_in_actionblock1486); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal152_tree = (Object)adaptor.create(char_literal152);
            	            adaptor.addChild(root_0, char_literal152_tree);
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            char_literal153=(Token)match(input,21,FOLLOW_21_in_actionblock1491); if (state.failed) return retval;
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
        return retval;
    }
    // $ANTLR end "actionblock"

    public static class blocktype_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "blocktype"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:239:1: blocktype : ( 'choose' | 'every' );
    public final rulesetParser.blocktype_return blocktype() throws RecognitionException {
        rulesetParser.blocktype_return retval = new rulesetParser.blocktype_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set154=null;

        Object set154_tree=null;

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:239:10: ( 'choose' | 'every' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:
            {
            root_0 = (Object)adaptor.nil();

            set154=(Token)input.LT(1);
            if ( (input.LA(1)>=62 && input.LA(1)<=63) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set154));
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
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:243:1: pre_block : 'pre' '{' ( decl ( ';' )? ) '}' ;
    public final rulesetParser.pre_block_return pre_block() throws RecognitionException {
        rulesetParser.pre_block_return retval = new rulesetParser.pre_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal155=null;
        Token char_literal156=null;
        Token char_literal158=null;
        Token char_literal159=null;
        rulesetParser.decl_return decl157 = null;


        Object string_literal155_tree=null;
        Object char_literal156_tree=null;
        Object char_literal158_tree=null;
        Object char_literal159_tree=null;

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:243:10: ( 'pre' '{' ( decl ( ';' )? ) '}' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:243:12: 'pre' '{' ( decl ( ';' )? ) '}'
            {
            root_0 = (Object)adaptor.nil();

            string_literal155=(Token)match(input,64,FOLLOW_64_in_pre_block1533); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal155_tree = (Object)adaptor.create(string_literal155);
            adaptor.addChild(root_0, string_literal155_tree);
            }
            char_literal156=(Token)match(input,20,FOLLOW_20_in_pre_block1535); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal156_tree = (Object)adaptor.create(char_literal156);
            adaptor.addChild(root_0, char_literal156_tree);
            }
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:243:22: ( decl ( ';' )? )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:243:23: decl ( ';' )?
            {
            pushFollow(FOLLOW_decl_in_pre_block1538);
            decl157=decl();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, decl157.getTree());
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:243:28: ( ';' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==24) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:0:0: ';'
                    {
                    char_literal158=(Token)match(input,24,FOLLOW_24_in_pre_block1540); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal158_tree = (Object)adaptor.create(char_literal158);
                    adaptor.addChild(root_0, char_literal158_tree);
                    }

                    }
                    break;

            }


            }

            char_literal159=(Token)match(input,21,FOLLOW_21_in_pre_block1544); if (state.failed) return retval;
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
    // $ANTLR end "pre_block"

    public static class foreach_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "foreach"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:246:1: foreach : 'foreach' expr setting ;
    public final rulesetParser.foreach_return foreach() throws RecognitionException {
        rulesetParser.foreach_return retval = new rulesetParser.foreach_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal160=null;
        rulesetParser.expr_return expr161 = null;

        rulesetParser.setting_return setting162 = null;


        Object string_literal160_tree=null;

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:246:8: ( 'foreach' expr setting )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:247:2: 'foreach' expr setting
            {
            root_0 = (Object)adaptor.nil();

            string_literal160=(Token)match(input,65,FOLLOW_65_in_foreach1564); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal160_tree = (Object)adaptor.create(string_literal160);
            adaptor.addChild(root_0, string_literal160_tree);
            }
            pushFollow(FOLLOW_expr_in_foreach1566);
            expr161=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr161.getTree());
            pushFollow(FOLLOW_setting_in_foreach1568);
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
        }
        return retval;
    }
    // $ANTLR end "foreach"

    public static class select_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "select"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:250:1: select : 'select' ( using | when ) ( foreach )? ;
    public final rulesetParser.select_return select() throws RecognitionException {
        rulesetParser.select_return retval = new rulesetParser.select_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal163=null;
        rulesetParser.using_return using164 = null;

        rulesetParser.when_return when165 = null;

        rulesetParser.foreach_return foreach166 = null;


        Object string_literal163_tree=null;

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:250:8: ( 'select' ( using | when ) ( foreach )? )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:250:10: 'select' ( using | when ) ( foreach )?
            {
            root_0 = (Object)adaptor.nil();

            string_literal163=(Token)match(input,66,FOLLOW_66_in_select1587); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal163_tree = (Object)adaptor.create(string_literal163);
            adaptor.addChild(root_0, string_literal163_tree);
            }
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:250:19: ( using | when )
            int alt28=2;
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

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:250:20: using
                    {
                    pushFollow(FOLLOW_using_in_select1590);
                    using164=using();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, using164.getTree());

                    }
                    break;
                case 2 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:250:26: when
                    {
                    pushFollow(FOLLOW_when_in_select1592);
                    when165=when();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, when165.getTree());

                    }
                    break;

            }

            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:250:32: ( foreach )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==65) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:0:0: foreach
                    {
                    pushFollow(FOLLOW_foreach_in_select1595);
                    foreach166=foreach();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, foreach166.getTree());

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
    // $ANTLR end "select"

    public static class using_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "using"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:253:1: using : 'using' STRING setting ;
    public final rulesetParser.using_return using() throws RecognitionException {
        rulesetParser.using_return retval = new rulesetParser.using_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal167=null;
        Token STRING168=null;
        rulesetParser.setting_return setting169 = null;


        Object string_literal167_tree=null;
        Object STRING168_tree=null;

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:253:7: ( 'using' STRING setting )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:253:9: 'using' STRING setting
            {
            root_0 = (Object)adaptor.nil();

            string_literal167=(Token)match(input,67,FOLLOW_67_in_using1609); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal167_tree = (Object)adaptor.create(string_literal167);
            adaptor.addChild(root_0, string_literal167_tree);
            }
            STRING168=(Token)match(input,STRING,FOLLOW_STRING_in_using1611); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING168_tree = (Object)adaptor.create(STRING168);
            adaptor.addChild(root_0, STRING168_tree);
            }
            pushFollow(FOLLOW_setting_in_using1613);
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
        }
        return retval;
    }
    // $ANTLR end "using"

    public static class when_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "when"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:255:1: when : 'when' event_seq ;
    public final rulesetParser.when_return when() throws RecognitionException {
        rulesetParser.when_return retval = new rulesetParser.when_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal170=null;
        rulesetParser.event_seq_return event_seq171 = null;


        Object string_literal170_tree=null;

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:255:6: ( 'when' event_seq )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:255:7: 'when' event_seq
            {
            root_0 = (Object)adaptor.nil();

            string_literal170=(Token)match(input,68,FOLLOW_68_in_when1620); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal170_tree = (Object)adaptor.create(string_literal170);
            adaptor.addChild(root_0, string_literal170_tree);
            }
            pushFollow(FOLLOW_event_seq_in_when1622);
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
        }
        return retval;
    }
    // $ANTLR end "when"

    public static class event_seq_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "event_seq"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:257:1: event_seq options {backtrack=true; } : ( event_or 'then' | event_or 'before' | event_or );
    public final rulesetParser.event_seq_return event_seq() throws RecognitionException {
        rulesetParser.event_seq_return retval = new rulesetParser.event_seq_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal173=null;
        Token string_literal175=null;
        rulesetParser.event_or_return event_or172 = null;

        rulesetParser.event_or_return event_or174 = null;

        rulesetParser.event_or_return event_or176 = null;


        Object string_literal173_tree=null;
        Object string_literal175_tree=null;

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:258:2: ( event_or 'then' | event_or 'before' | event_or )
            int alt30=3;
            switch ( input.LA(1) ) {
            case 78:
                {
                int LA30_1 = input.LA(2);

                if ( (synpred46_ruleset()) ) {
                    alt30=1;
                }
                else if ( (synpred47_ruleset()) ) {
                    alt30=2;
                }
                else if ( (true) ) {
                    alt30=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 1, input);

                    throw nvae;
                }
                }
                break;
            case ID:
                {
                int LA30_2 = input.LA(2);

                if ( (synpred46_ruleset()) ) {
                    alt30=1;
                }
                else if ( (synpred47_ruleset()) ) {
                    alt30=2;
                }
                else if ( (true) ) {
                    alt30=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 2, input);

                    throw nvae;
                }
                }
                break;
            case 57:
                {
                int LA30_3 = input.LA(2);

                if ( (synpred46_ruleset()) ) {
                    alt30=1;
                }
                else if ( (synpred47_ruleset()) ) {
                    alt30=2;
                }
                else if ( (true) ) {
                    alt30=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 3, input);

                    throw nvae;
                }
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
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:258:4: event_or 'then'
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_event_or_in_event_seq1643);
                    event_or172=event_or();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, event_or172.getTree());
                    string_literal173=(Token)match(input,56,FOLLOW_56_in_event_seq1645); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal173_tree = (Object)adaptor.create(string_literal173);
                    adaptor.addChild(root_0, string_literal173_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:259:3: event_or 'before'
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_event_or_in_event_seq1650);
                    event_or174=event_or();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, event_or174.getTree());
                    string_literal175=(Token)match(input,69,FOLLOW_69_in_event_seq1652); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal175_tree = (Object)adaptor.create(string_literal175);
                    adaptor.addChild(root_0, string_literal175_tree);
                    }

                    }
                    break;
                case 3 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:260:3: event_or
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_event_or_in_event_seq1657);
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
        }
        return retval;
    }
    // $ANTLR end "event_seq"

    public static class event_or_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "event_or"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:263:1: event_or : event_and ( 'or' event_and )* ;
    public final rulesetParser.event_or_return event_or() throws RecognitionException {
        rulesetParser.event_or_return retval = new rulesetParser.event_or_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal178=null;
        rulesetParser.event_and_return event_and177 = null;

        rulesetParser.event_and_return event_and179 = null;


        Object string_literal178_tree=null;

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:263:9: ( event_and ( 'or' event_and )* )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:263:11: event_and ( 'or' event_and )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_event_and_in_event_or1668);
            event_and177=event_and();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, event_and177.getTree());
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:263:21: ( 'or' event_and )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==70) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:263:22: 'or' event_and
            	    {
            	    string_literal178=(Token)match(input,70,FOLLOW_70_in_event_or1671); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal178_tree = (Object)adaptor.create(string_literal178);
            	    adaptor.addChild(root_0, string_literal178_tree);
            	    }
            	    pushFollow(FOLLOW_event_and_in_event_or1673);
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


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:265:1: event_and : event_btwn ( 'and' event_btwn )* ;
    public final rulesetParser.event_and_return event_and() throws RecognitionException {
        rulesetParser.event_and_return retval = new rulesetParser.event_and_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal181=null;
        rulesetParser.event_btwn_return event_btwn180 = null;

        rulesetParser.event_btwn_return event_btwn182 = null;


        Object string_literal181_tree=null;

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:266:2: ( event_btwn ( 'and' event_btwn )* )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:266:4: event_btwn ( 'and' event_btwn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_event_btwn_in_event_and1684);
            event_btwn180=event_btwn();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, event_btwn180.getTree());
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:266:15: ( 'and' event_btwn )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==61) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:266:16: 'and' event_btwn
            	    {
            	    string_literal181=(Token)match(input,61,FOLLOW_61_in_event_and1687); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal181_tree = (Object)adaptor.create(string_literal181);
            	    adaptor.addChild(root_0, string_literal181_tree);
            	    }
            	    pushFollow(FOLLOW_event_btwn_in_event_and1689);
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


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:269:1: event_btwn : event_prim ( 'not' ) 'between' '(' event_seq ',' event_seq ')' ;
    public final rulesetParser.event_btwn_return event_btwn() throws RecognitionException {
        rulesetParser.event_btwn_return retval = new rulesetParser.event_btwn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal184=null;
        Token string_literal185=null;
        Token char_literal186=null;
        Token char_literal188=null;
        Token char_literal190=null;
        rulesetParser.event_prim_return event_prim183 = null;

        rulesetParser.event_seq_return event_seq187 = null;

        rulesetParser.event_seq_return event_seq189 = null;


        Object string_literal184_tree=null;
        Object string_literal185_tree=null;
        Object char_literal186_tree=null;
        Object char_literal188_tree=null;
        Object char_literal190_tree=null;

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:270:2: ( event_prim ( 'not' ) 'between' '(' event_seq ',' event_seq ')' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:270:4: event_prim ( 'not' ) 'between' '(' event_seq ',' event_seq ')'
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_event_prim_in_event_btwn1702);
            event_prim183=event_prim();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, event_prim183.getTree());
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:270:15: ( 'not' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:270:16: 'not'
            {
            string_literal184=(Token)match(input,71,FOLLOW_71_in_event_btwn1705); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal184_tree = (Object)adaptor.create(string_literal184);
            adaptor.addChild(root_0, string_literal184_tree);
            }

            }

            string_literal185=(Token)match(input,72,FOLLOW_72_in_event_btwn1708); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal185_tree = (Object)adaptor.create(string_literal185);
            adaptor.addChild(root_0, string_literal185_tree);
            }
            char_literal186=(Token)match(input,57,FOLLOW_57_in_event_btwn1710); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal186_tree = (Object)adaptor.create(char_literal186);
            adaptor.addChild(root_0, char_literal186_tree);
            }
            pushFollow(FOLLOW_event_seq_in_event_btwn1712);
            event_seq187=event_seq();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, event_seq187.getTree());
            char_literal188=(Token)match(input,58,FOLLOW_58_in_event_btwn1714); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal188_tree = (Object)adaptor.create(char_literal188);
            adaptor.addChild(root_0, char_literal188_tree);
            }
            pushFollow(FOLLOW_event_seq_in_event_btwn1716);
            event_seq189=event_seq();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, event_seq189.getTree());
            char_literal190=(Token)match(input,59,FOLLOW_59_in_event_btwn1718); if (state.failed) return retval;
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
        }
        return retval;
    }
    // $ANTLR end "event_btwn"

    public static class event_prim_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "event_prim"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:273:1: event_prim : ( event_domain 'pageview' ( STRING | REGEXP ) setting | event_domain ( 'submit' | 'click' | 'dblclick' | 'change' | 'update' ) STRING on_expr setting | ID ID event_filter setting | '(' event_seq ')' );
    public final rulesetParser.event_prim_return event_prim() throws RecognitionException {
        rulesetParser.event_prim_return retval = new rulesetParser.event_prim_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal192=null;
        Token set193=null;
        Token set196=null;
        Token STRING197=null;
        Token ID200=null;
        Token ID201=null;
        Token char_literal204=null;
        Token char_literal206=null;
        rulesetParser.event_domain_return event_domain191 = null;

        rulesetParser.setting_return setting194 = null;

        rulesetParser.event_domain_return event_domain195 = null;

        rulesetParser.on_expr_return on_expr198 = null;

        rulesetParser.setting_return setting199 = null;

        rulesetParser.event_filter_return event_filter202 = null;

        rulesetParser.setting_return setting203 = null;

        rulesetParser.event_seq_return event_seq205 = null;


        Object string_literal192_tree=null;
        Object set193_tree=null;
        Object set196_tree=null;
        Object STRING197_tree=null;
        Object ID200_tree=null;
        Object ID201_tree=null;
        Object char_literal204_tree=null;
        Object char_literal206_tree=null;

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:274:2: ( event_domain 'pageview' ( STRING | REGEXP ) setting | event_domain ( 'submit' | 'click' | 'dblclick' | 'change' | 'update' ) STRING on_expr setting | ID ID event_filter setting | '(' event_seq ')' )
            int alt33=4;
            switch ( input.LA(1) ) {
            case 78:
                {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==73) ) {
                    alt33=1;
                }
                else if ( ((LA33_1>=33 && LA33_1<=34)||(LA33_1>=74 && LA33_1<=76)) ) {
                    alt33=2;
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

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:274:4: event_domain 'pageview' ( STRING | REGEXP ) setting
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_event_domain_in_event_prim1733);
                    event_domain191=event_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, event_domain191.getTree());
                    string_literal192=(Token)match(input,73,FOLLOW_73_in_event_prim1735); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal192_tree = (Object)adaptor.create(string_literal192);
                    adaptor.addChild(root_0, string_literal192_tree);
                    }
                    set193=(Token)input.LT(1);
                    if ( input.LA(1)==STRING||input.LA(1)==REGEXP ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set193));
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_setting_in_event_prim1743);
                    setting194=setting();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, setting194.getTree());

                    }
                    break;
                case 2 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:275:2: event_domain ( 'submit' | 'click' | 'dblclick' | 'change' | 'update' ) STRING on_expr setting
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_event_domain_in_event_prim1748);
                    event_domain195=event_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, event_domain195.getTree());
                    set196=(Token)input.LT(1);
                    if ( (input.LA(1)>=33 && input.LA(1)<=34)||(input.LA(1)>=74 && input.LA(1)<=76) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set196));
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    STRING197=(Token)match(input,STRING,FOLLOW_STRING_in_event_prim1762); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING197_tree = (Object)adaptor.create(STRING197);
                    adaptor.addChild(root_0, STRING197_tree);
                    }
                    pushFollow(FOLLOW_on_expr_in_event_prim1764);
                    on_expr198=on_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, on_expr198.getTree());
                    pushFollow(FOLLOW_setting_in_event_prim1767);
                    setting199=setting();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, setting199.getTree());

                    }
                    break;
                case 3 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:276:2: ID ID event_filter setting
                    {
                    root_0 = (Object)adaptor.nil();

                    ID200=(Token)match(input,ID,FOLLOW_ID_in_event_prim1772); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID200_tree = (Object)adaptor.create(ID200);
                    adaptor.addChild(root_0, ID200_tree);
                    }
                    ID201=(Token)match(input,ID,FOLLOW_ID_in_event_prim1774); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID201_tree = (Object)adaptor.create(ID201);
                    adaptor.addChild(root_0, ID201_tree);
                    }
                    pushFollow(FOLLOW_event_filter_in_event_prim1776);
                    event_filter202=event_filter();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, event_filter202.getTree());
                    pushFollow(FOLLOW_setting_in_event_prim1778);
                    setting203=setting();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, setting203.getTree());

                    }
                    break;
                case 4 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:277:2: '(' event_seq ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal204=(Token)match(input,57,FOLLOW_57_in_event_prim1783); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal204_tree = (Object)adaptor.create(char_literal204);
                    adaptor.addChild(root_0, char_literal204_tree);
                    }
                    pushFollow(FOLLOW_event_seq_in_event_prim1785);
                    event_seq205=event_seq();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, event_seq205.getTree());
                    char_literal206=(Token)match(input,59,FOLLOW_59_in_event_prim1787); if (state.failed) return retval;
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
        }
        return retval;
    }
    // $ANTLR end "event_prim"

    public static class setting_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "setting"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:280:1: setting : 'setting' '(' ( ID ( ',' )? )* ')' ;
    public final rulesetParser.setting_return setting() throws RecognitionException {
        rulesetParser.setting_return retval = new rulesetParser.setting_return();
        retval.start = input.LT(1);

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

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:280:9: ( 'setting' '(' ( ID ( ',' )? )* ')' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:280:11: 'setting' '(' ( ID ( ',' )? )* ')'
            {
            root_0 = (Object)adaptor.nil();

            string_literal207=(Token)match(input,77,FOLLOW_77_in_setting1798); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal207_tree = (Object)adaptor.create(string_literal207);
            adaptor.addChild(root_0, string_literal207_tree);
            }
            char_literal208=(Token)match(input,57,FOLLOW_57_in_setting1800); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal208_tree = (Object)adaptor.create(char_literal208);
            adaptor.addChild(root_0, char_literal208_tree);
            }
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:280:25: ( ID ( ',' )? )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==ID) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:280:26: ID ( ',' )?
            	    {
            	    ID209=(Token)match(input,ID,FOLLOW_ID_in_setting1803); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    ID209_tree = (Object)adaptor.create(ID209);
            	    adaptor.addChild(root_0, ID209_tree);
            	    }
            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:280:29: ( ',' )?
            	    int alt34=2;
            	    int LA34_0 = input.LA(1);

            	    if ( (LA34_0==58) ) {
            	        alt34=1;
            	    }
            	    switch (alt34) {
            	        case 1 :
            	            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:0:0: ','
            	            {
            	            char_literal210=(Token)match(input,58,FOLLOW_58_in_setting1805); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal210_tree = (Object)adaptor.create(char_literal210);
            	            adaptor.addChild(root_0, char_literal210_tree);
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            char_literal211=(Token)match(input,59,FOLLOW_59_in_setting1810); if (state.failed) return retval;
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
        }
        return retval;
    }
    // $ANTLR end "setting"

    public static class event_domain_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "event_domain"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:282:1: event_domain : 'web' ;
    public final rulesetParser.event_domain_return event_domain() throws RecognitionException {
        rulesetParser.event_domain_return retval = new rulesetParser.event_domain_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal212=null;

        Object string_literal212_tree=null;

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:283:2: ( 'web' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:283:4: 'web'
            {
            root_0 = (Object)adaptor.nil();

            string_literal212=(Token)match(input,78,FOLLOW_78_in_event_domain1820); if (state.failed) return retval;
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
        }
        return retval;
    }
    // $ANTLR end "event_domain"

    public static class event_filter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "event_filter"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:286:1: event_filter : ID ( STRING | REGEXP ) ;
    public final rulesetParser.event_filter_return event_filter() throws RecognitionException {
        rulesetParser.event_filter_return retval = new rulesetParser.event_filter_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID213=null;
        Token set214=null;

        Object ID213_tree=null;
        Object set214_tree=null;

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:287:2: ( ID ( STRING | REGEXP ) )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:287:4: ID ( STRING | REGEXP )
            {
            root_0 = (Object)adaptor.nil();

            ID213=(Token)match(input,ID,FOLLOW_ID_in_event_filter1834); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID213_tree = (Object)adaptor.create(ID213);
            adaptor.addChild(root_0, ID213_tree);
            }
            set214=(Token)input.LT(1);
            if ( input.LA(1)==STRING||input.LA(1)==REGEXP ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set214));
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
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:290:1: on_expr : 'on' ( STRING | REGEXP ) ;
    public final rulesetParser.on_expr_return on_expr() throws RecognitionException {
        rulesetParser.on_expr_return retval = new rulesetParser.on_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal215=null;
        Token set216=null;

        Object string_literal215_tree=null;
        Object set216_tree=null;

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:290:9: ( 'on' ( STRING | REGEXP ) )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:290:11: 'on' ( STRING | REGEXP )
            {
            root_0 = (Object)adaptor.nil();

            string_literal215=(Token)match(input,79,FOLLOW_79_in_on_expr1854); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal215_tree = (Object)adaptor.create(string_literal215);
            adaptor.addChild(root_0, string_literal215_tree);
            }
            set216=(Token)input.LT(1);
            if ( input.LA(1)==STRING||input.LA(1)==REGEXP ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set216));
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
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:294:1: global_decls : 'global' '{' ( global ';' )+ '}' ;
    public final rulesetParser.global_decls_return global_decls() throws RecognitionException {
        rulesetParser.global_decls_return retval = new rulesetParser.global_decls_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal217=null;
        Token char_literal218=null;
        Token char_literal220=null;
        Token char_literal221=null;
        rulesetParser.global_return global219 = null;


        Object string_literal217_tree=null;
        Object char_literal218_tree=null;
        Object char_literal220_tree=null;
        Object char_literal221_tree=null;

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:295:2: ( 'global' '{' ( global ';' )+ '}' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:295:4: 'global' '{' ( global ';' )+ '}'
            {
            root_0 = (Object)adaptor.nil();

            string_literal217=(Token)match(input,80,FOLLOW_80_in_global_decls1880); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal217_tree = (Object)adaptor.create(string_literal217);
            adaptor.addChild(root_0, string_literal217_tree);
            }
            char_literal218=(Token)match(input,20,FOLLOW_20_in_global_decls1882); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal218_tree = (Object)adaptor.create(char_literal218);
            adaptor.addChild(root_0, char_literal218_tree);
            }
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:295:17: ( global ';' )+
            int cnt36=0;
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==ID||LA36_0==81||LA36_0==83||(LA36_0>=136 && LA36_0<=137)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:295:19: global ';'
            	    {
            	    pushFollow(FOLLOW_global_in_global_decls1886);
            	    global219=global();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, global219.getTree());
            	    char_literal220=(Token)match(input,24,FOLLOW_24_in_global_decls1888); if (state.failed) return retval;
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
                        throw eee;
                }
                cnt36++;
            } while (true);

            char_literal221=(Token)match(input,21,FOLLOW_21_in_global_decls1893); if (state.failed) return retval;
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
        }
        return retval;
    }
    // $ANTLR end "global_decls"

    public static class global_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "global"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:298:1: global : ( emit_block | dataset | datasource | css_emit | decl );
    public final rulesetParser.global_return global() throws RecognitionException {
        rulesetParser.global_return retval = new rulesetParser.global_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        rulesetParser.emit_block_return emit_block222 = null;

        rulesetParser.dataset_return dataset223 = null;

        rulesetParser.datasource_return datasource224 = null;

        rulesetParser.css_emit_return css_emit225 = null;

        rulesetParser.decl_return decl226 = null;



        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:298:9: ( emit_block | dataset | datasource | css_emit | decl )
            int alt37=5;
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

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:298:11: emit_block
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_emit_block_in_global1909);
                    emit_block222=emit_block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, emit_block222.getTree());

                    }
                    break;
                case 2 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:298:24: dataset
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_dataset_in_global1913);
                    dataset223=dataset();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dataset223.getTree());

                    }
                    break;
                case 3 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:298:34: datasource
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_datasource_in_global1917);
                    datasource224=datasource();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, datasource224.getTree());

                    }
                    break;
                case 4 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:298:47: css_emit
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_css_emit_in_global1921);
                    css_emit225=css_emit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, css_emit225.getTree());

                    }
                    break;
                case 5 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:298:58: decl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_decl_in_global1925);
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
        }
        return retval;
    }
    // $ANTLR end "global"

    public static class datasource_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "datasource"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:301:1: datasource : 'datasource' ID ( datatype )? '<-' STRING cachable ;
    public final rulesetParser.datasource_return datasource() throws RecognitionException {
        rulesetParser.datasource_return retval = new rulesetParser.datasource_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal227=null;
        Token ID228=null;
        Token string_literal230=null;
        Token STRING231=null;
        rulesetParser.datatype_return datatype229 = null;

        rulesetParser.cachable_return cachable232 = null;


        Object string_literal227_tree=null;
        Object ID228_tree=null;
        Object string_literal230_tree=null;
        Object STRING231_tree=null;

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:302:2: ( 'datasource' ID ( datatype )? '<-' STRING cachable )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:302:5: 'datasource' ID ( datatype )? '<-' STRING cachable
            {
            root_0 = (Object)adaptor.nil();

            string_literal227=(Token)match(input,81,FOLLOW_81_in_datasource1937); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal227_tree = (Object)adaptor.create(string_literal227);
            adaptor.addChild(root_0, string_literal227_tree);
            }
            ID228=(Token)match(input,ID,FOLLOW_ID_in_datasource1939); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID228_tree = (Object)adaptor.create(ID228);
            adaptor.addChild(root_0, ID228_tree);
            }
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:302:21: ( datatype )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==38) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:0:0: datatype
                    {
                    pushFollow(FOLLOW_datatype_in_datasource1941);
                    datatype229=datatype();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, datatype229.getTree());

                    }
                    break;

            }

            string_literal230=(Token)match(input,82,FOLLOW_82_in_datasource1944); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal230_tree = (Object)adaptor.create(string_literal230);
            adaptor.addChild(root_0, string_literal230_tree);
            }
            STRING231=(Token)match(input,STRING,FOLLOW_STRING_in_datasource1946); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING231_tree = (Object)adaptor.create(STRING231);
            adaptor.addChild(root_0, STRING231_tree);
            }
            pushFollow(FOLLOW_cachable_in_datasource1948);
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
        }
        return retval;
    }
    // $ANTLR end "datasource"

    public static class css_emit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "css_emit"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:305:1: css_emit : 'css' ( HTML | STRING ) ;
    public final rulesetParser.css_emit_return css_emit() throws RecognitionException {
        rulesetParser.css_emit_return retval = new rulesetParser.css_emit_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal233=null;
        Token set234=null;

        Object string_literal233_tree=null;
        Object set234_tree=null;

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:306:2: ( 'css' ( HTML | STRING ) )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:306:4: 'css' ( HTML | STRING )
            {
            root_0 = (Object)adaptor.nil();

            string_literal233=(Token)match(input,83,FOLLOW_83_in_css_emit1960); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal233_tree = (Object)adaptor.create(string_literal233);
            adaptor.addChild(root_0, string_literal233_tree);
            }
            set234=(Token)input.LT(1);
            if ( input.LA(1)==STRING||input.LA(1)==HTML ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set234));
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
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:309:1: decl options {backtrack=true; } : ( ID '=' HTML | ID '=' JS | ID '=' expr );
    public final rulesetParser.decl_return decl() throws RecognitionException {
        rulesetParser.decl_return retval = new rulesetParser.decl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID235=null;
        Token char_literal236=null;
        Token HTML237=null;
        Token ID238=null;
        Token char_literal239=null;
        Token JS240=null;
        Token ID241=null;
        Token char_literal242=null;
        rulesetParser.expr_return expr243 = null;


        Object ID235_tree=null;
        Object char_literal236_tree=null;
        Object HTML237_tree=null;
        Object ID238_tree=null;
        Object char_literal239_tree=null;
        Object JS240_tree=null;
        Object ID241_tree=null;
        Object char_literal242_tree=null;

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:309:39: ( ID '=' HTML | ID '=' JS | ID '=' expr )
            int alt39=3;
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
                    case STRING:
                    case REGEXP:
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

                        throw nvae;
                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:310:2: ID '=' HTML
                    {
                    root_0 = (Object)adaptor.nil();

                    ID235=(Token)match(input,ID,FOLLOW_ID_in_decl1996); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID235_tree = (Object)adaptor.create(ID235);
                    adaptor.addChild(root_0, ID235_tree);
                    }
                    char_literal236=(Token)match(input,35,FOLLOW_35_in_decl1998); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal236_tree = (Object)adaptor.create(char_literal236);
                    adaptor.addChild(root_0, char_literal236_tree);
                    }
                    HTML237=(Token)match(input,HTML,FOLLOW_HTML_in_decl2000); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    HTML237_tree = (Object)adaptor.create(HTML237);
                    adaptor.addChild(root_0, HTML237_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:311:2: ID '=' JS
                    {
                    root_0 = (Object)adaptor.nil();

                    ID238=(Token)match(input,ID,FOLLOW_ID_in_decl2005); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID238_tree = (Object)adaptor.create(ID238);
                    adaptor.addChild(root_0, ID238_tree);
                    }
                    char_literal239=(Token)match(input,35,FOLLOW_35_in_decl2007); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal239_tree = (Object)adaptor.create(char_literal239);
                    adaptor.addChild(root_0, char_literal239_tree);
                    }
                    JS240=(Token)match(input,JS,FOLLOW_JS_in_decl2009); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    JS240_tree = (Object)adaptor.create(JS240);
                    adaptor.addChild(root_0, JS240_tree);
                    }

                    }
                    break;
                case 3 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:312:2: ID '=' expr
                    {
                    root_0 = (Object)adaptor.nil();

                    ID241=(Token)match(input,ID,FOLLOW_ID_in_decl2014); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID241_tree = (Object)adaptor.create(ID241);
                    adaptor.addChild(root_0, ID241_tree);
                    }
                    char_literal242=(Token)match(input,35,FOLLOW_35_in_decl2016); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal242_tree = (Object)adaptor.create(char_literal242);
                    adaptor.addChild(root_0, char_literal242_tree);
                    }
                    pushFollow(FOLLOW_expr_in_decl2018);
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
        }
        return retval;
    }
    // $ANTLR end "decl"

    public static class expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:317:1: expr options {backtrack=true; } : ( function_def | conditional_expression );
    public final rulesetParser.expr_return expr() throws RecognitionException {
        rulesetParser.expr_return retval = new rulesetParser.expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        rulesetParser.function_def_return function_def244 = null;

        rulesetParser.conditional_expression_return conditional_expression245 = null;



        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:317:36: ( function_def | conditional_expression )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==84) ) {
                alt40=1;
            }
            else if ( ((LA40_0>=ID && LA40_0<=INT)||LA40_0==STRING||LA40_0==REGEXP||LA40_0==20||LA40_0==57||LA40_0==71||LA40_0==102||(LA40_0>=104 && LA40_0<=106)||(LA40_0>=108 && LA40_0<=109)||(LA40_0>=134 && LA40_0<=135)) ) {
                alt40=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:317:38: function_def
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_function_def_in_expr2048);
                    function_def244=function_def();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_def244.getTree());

                    }
                    break;
                case 2 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:317:53: conditional_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_conditional_expression_in_expr2052);
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
        }
        return retval;
    }
    // $ANTLR end "expr"

    public static class function_def_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function_def"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:320:1: function_def options {backtrack=true; } : 'function' '(' ( ID ( ',' )? )* ')' '{' ( fundecls )* expr ( ';' )? '}' ;
    public final rulesetParser.function_def_return function_def() throws RecognitionException {
        rulesetParser.function_def_return retval = new rulesetParser.function_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal246=null;
        Token char_literal247=null;
        Token ID248=null;
        Token char_literal249=null;
        Token char_literal250=null;
        Token char_literal251=null;
        Token char_literal254=null;
        Token char_literal255=null;
        rulesetParser.fundecls_return fundecls252 = null;

        rulesetParser.expr_return expr253 = null;


        Object string_literal246_tree=null;
        Object char_literal247_tree=null;
        Object ID248_tree=null;
        Object char_literal249_tree=null;
        Object char_literal250_tree=null;
        Object char_literal251_tree=null;
        Object char_literal254_tree=null;
        Object char_literal255_tree=null;

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:321:2: ( 'function' '(' ( ID ( ',' )? )* ')' '{' ( fundecls )* expr ( ';' )? '}' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:321:4: 'function' '(' ( ID ( ',' )? )* ')' '{' ( fundecls )* expr ( ';' )? '}'
            {
            root_0 = (Object)adaptor.nil();

            string_literal246=(Token)match(input,84,FOLLOW_84_in_function_def2077); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal246_tree = (Object)adaptor.create(string_literal246);
            adaptor.addChild(root_0, string_literal246_tree);
            }
            char_literal247=(Token)match(input,57,FOLLOW_57_in_function_def2079); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal247_tree = (Object)adaptor.create(char_literal247);
            adaptor.addChild(root_0, char_literal247_tree);
            }
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:321:19: ( ID ( ',' )? )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==ID) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:321:20: ID ( ',' )?
            	    {
            	    ID248=(Token)match(input,ID,FOLLOW_ID_in_function_def2082); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    ID248_tree = (Object)adaptor.create(ID248);
            	    adaptor.addChild(root_0, ID248_tree);
            	    }
            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:321:23: ( ',' )?
            	    int alt41=2;
            	    int LA41_0 = input.LA(1);

            	    if ( (LA41_0==58) ) {
            	        alt41=1;
            	    }
            	    switch (alt41) {
            	        case 1 :
            	            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:0:0: ','
            	            {
            	            char_literal249=(Token)match(input,58,FOLLOW_58_in_function_def2084); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal249_tree = (Object)adaptor.create(char_literal249);
            	            adaptor.addChild(root_0, char_literal249_tree);
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            char_literal250=(Token)match(input,59,FOLLOW_59_in_function_def2089); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal250_tree = (Object)adaptor.create(char_literal250);
            adaptor.addChild(root_0, char_literal250_tree);
            }
            char_literal251=(Token)match(input,20,FOLLOW_20_in_function_def2091); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal251_tree = (Object)adaptor.create(char_literal251);
            adaptor.addChild(root_0, char_literal251_tree);
            }
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:321:38: ( fundecls )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==ID) ) {
                    int LA43_2 = input.LA(2);

                    if ( (LA43_2==35) ) {
                        alt43=1;
                    }


                }


                switch (alt43) {
            	case 1 :
            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:0:0: fundecls
            	    {
            	    pushFollow(FOLLOW_fundecls_in_function_def2093);
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

            pushFollow(FOLLOW_expr_in_function_def2096);
            expr253=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr253.getTree());
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:321:53: ( ';' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==24) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:0:0: ';'
                    {
                    char_literal254=(Token)match(input,24,FOLLOW_24_in_function_def2098); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal254_tree = (Object)adaptor.create(char_literal254);
                    adaptor.addChild(root_0, char_literal254_tree);
                    }

                    }
                    break;

            }

            char_literal255=(Token)match(input,21,FOLLOW_21_in_function_def2101); if (state.failed) return retval;
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
        }
        return retval;
    }
    // $ANTLR end "function_def"

    public static class fundecls_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fundecls"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:324:1: fundecls options {backtrack=true; } : decl ';' ;
    public final rulesetParser.fundecls_return fundecls() throws RecognitionException {
        rulesetParser.fundecls_return retval = new rulesetParser.fundecls_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal257=null;
        rulesetParser.decl_return decl256 = null;


        Object char_literal257_tree=null;

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:325:2: ( decl ';' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:325:4: decl ';'
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_decl_in_fundecls2125);
            decl256=decl();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, decl256.getTree());
            char_literal257=(Token)match(input,24,FOLLOW_24_in_fundecls2127); if (state.failed) return retval;
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
        }
        return retval;
    }
    // $ANTLR end "fundecls"

    public static class conditional_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditional_expression"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:330:1: conditional_expression options {backtrack=true; } : ( disjunction '=>' expr '|' expr | disjunction );
    public final rulesetParser.conditional_expression_return conditional_expression() throws RecognitionException {
        rulesetParser.conditional_expression_return retval = new rulesetParser.conditional_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal259=null;
        Token char_literal261=null;
        rulesetParser.disjunction_return disjunction258 = null;

        rulesetParser.expr_return expr260 = null;

        rulesetParser.expr_return expr262 = null;

        rulesetParser.disjunction_return disjunction263 = null;


        Object string_literal259_tree=null;
        Object char_literal261_tree=null;

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:331:2: ( disjunction '=>' expr '|' expr | disjunction )
            int alt45=2;
            alt45 = dfa45.predict(input);
            switch (alt45) {
                case 1 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:331:4: disjunction '=>' expr '|' expr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_disjunction_in_conditional_expression2153);
                    disjunction258=disjunction();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, disjunction258.getTree());
                    string_literal259=(Token)match(input,60,FOLLOW_60_in_conditional_expression2155); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal259_tree = (Object)adaptor.create(string_literal259);
                    adaptor.addChild(root_0, string_literal259_tree);
                    }
                    pushFollow(FOLLOW_expr_in_conditional_expression2157);
                    expr260=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr260.getTree());
                    char_literal261=(Token)match(input,85,FOLLOW_85_in_conditional_expression2159); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal261_tree = (Object)adaptor.create(char_literal261);
                    adaptor.addChild(root_0, char_literal261_tree);
                    }
                    pushFollow(FOLLOW_expr_in_conditional_expression2161);
                    expr262=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr262.getTree());

                    }
                    break;
                case 2 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:331:37: disjunction
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_disjunction_in_conditional_expression2165);
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
        }
        return retval;
    }
    // $ANTLR end "conditional_expression"

    public static class disjunction_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "disjunction"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:334:1: disjunction : conjunction ( '||' conjunction )* ;
    public final rulesetParser.disjunction_return disjunction() throws RecognitionException {
        rulesetParser.disjunction_return retval = new rulesetParser.disjunction_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal265=null;
        rulesetParser.conjunction_return conjunction264 = null;

        rulesetParser.conjunction_return conjunction266 = null;


        Object string_literal265_tree=null;

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:335:2: ( conjunction ( '||' conjunction )* )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:335:4: conjunction ( '||' conjunction )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_conjunction_in_disjunction2178);
            conjunction264=conjunction();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conjunction264.getTree());
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:335:16: ( '||' conjunction )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==86) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:335:17: '||' conjunction
            	    {
            	    string_literal265=(Token)match(input,86,FOLLOW_86_in_disjunction2181); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal265_tree = (Object)adaptor.create(string_literal265);
            	    adaptor.addChild(root_0, string_literal265_tree);
            	    }
            	    pushFollow(FOLLOW_conjunction_in_disjunction2183);
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


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:338:1: conjunction : equality_expr ( '&&' equality_expr )* ;
    public final rulesetParser.conjunction_return conjunction() throws RecognitionException {
        rulesetParser.conjunction_return retval = new rulesetParser.conjunction_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal268=null;
        rulesetParser.equality_expr_return equality_expr267 = null;

        rulesetParser.equality_expr_return equality_expr269 = null;


        Object string_literal268_tree=null;

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:339:2: ( equality_expr ( '&&' equality_expr )* )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:339:4: equality_expr ( '&&' equality_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equality_expr_in_conjunction2199);
            equality_expr267=equality_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equality_expr267.getTree());
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:339:18: ( '&&' equality_expr )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==87) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:339:19: '&&' equality_expr
            	    {
            	    string_literal268=(Token)match(input,87,FOLLOW_87_in_conjunction2202); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal268_tree = (Object)adaptor.create(string_literal268);
            	    adaptor.addChild(root_0, string_literal268_tree);
            	    }
            	    pushFollow(FOLLOW_equality_expr_in_conjunction2204);
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


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:342:1: equality_expr : add_expr ( predop add_expr )* ;
    public final rulesetParser.equality_expr_return equality_expr() throws RecognitionException {
        rulesetParser.equality_expr_return retval = new rulesetParser.equality_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        rulesetParser.add_expr_return add_expr270 = null;

        rulesetParser.predop_return predop271 = null;

        rulesetParser.add_expr_return add_expr272 = null;



        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:343:2: ( add_expr ( predop add_expr )* )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:343:4: add_expr ( predop add_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_add_expr_in_equality_expr2219);
            add_expr270=add_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, add_expr270.getTree());
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:343:13: ( predop add_expr )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( ((LA48_0>=88 && LA48_0<=96)) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:343:14: predop add_expr
            	    {
            	    pushFollow(FOLLOW_predop_in_equality_expr2222);
            	    predop271=predop();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, predop271.getTree());
            	    pushFollow(FOLLOW_add_expr_in_equality_expr2224);
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


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:346:1: predop : ( '<=' | '>=' | '<' | '>' | '==' | '!=' | 'eq' | 'neq' | 'like' );
    public final rulesetParser.predop_return predop() throws RecognitionException {
        rulesetParser.predop_return retval = new rulesetParser.predop_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set273=null;

        Object set273_tree=null;

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:346:7: ( '<=' | '>=' | '<' | '>' | '==' | '!=' | 'eq' | 'neq' | 'like' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:
            {
            root_0 = (Object)adaptor.nil();

            set273=(Token)input.LT(1);
            if ( (input.LA(1)>=88 && input.LA(1)<=96) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set273));
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
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:348:1: add_expr : mult_expr ( add_op mult_expr )* ;
    public final rulesetParser.add_expr_return add_expr() throws RecognitionException {
        rulesetParser.add_expr_return retval = new rulesetParser.add_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        rulesetParser.mult_expr_return mult_expr274 = null;

        rulesetParser.add_op_return add_op275 = null;

        rulesetParser.mult_expr_return mult_expr276 = null;



        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:348:10: ( mult_expr ( add_op mult_expr )* )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:348:12: mult_expr ( add_op mult_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_mult_expr_in_add_expr2279);
            mult_expr274=mult_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, mult_expr274.getTree());
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:348:22: ( add_op mult_expr )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( ((LA49_0>=97 && LA49_0<=98)) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:348:23: add_op mult_expr
            	    {
            	    pushFollow(FOLLOW_add_op_in_add_expr2282);
            	    add_op275=add_op();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, add_op275.getTree());
            	    pushFollow(FOLLOW_mult_expr_in_add_expr2284);
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


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:350:1: add_op : ( '+' | '-' );
    public final rulesetParser.add_op_return add_op() throws RecognitionException {
        rulesetParser.add_op_return retval = new rulesetParser.add_op_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set277=null;

        Object set277_tree=null;

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:350:7: ( '+' | '-' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:
            {
            root_0 = (Object)adaptor.nil();

            set277=(Token)input.LT(1);
            if ( (input.LA(1)>=97 && input.LA(1)<=98) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set277));
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
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:352:1: mult_expr : unary_expr ( mult_op unary_expr )* ;
    public final rulesetParser.mult_expr_return mult_expr() throws RecognitionException {
        rulesetParser.mult_expr_return retval = new rulesetParser.mult_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        rulesetParser.unary_expr_return unary_expr278 = null;

        rulesetParser.mult_op_return mult_op279 = null;

        rulesetParser.unary_expr_return unary_expr280 = null;



        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:353:2: ( unary_expr ( mult_op unary_expr )* )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:353:4: unary_expr ( mult_op unary_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_unary_expr_in_mult_expr2306);
            unary_expr278=unary_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expr278.getTree());
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:353:15: ( mult_op unary_expr )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( ((LA50_0>=99 && LA50_0<=101)) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:353:16: mult_op unary_expr
            	    {
            	    pushFollow(FOLLOW_mult_op_in_mult_expr2309);
            	    mult_op279=mult_op();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, mult_op279.getTree());
            	    pushFollow(FOLLOW_unary_expr_in_mult_expr2311);
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


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:356:1: mult_op : ( '*' | '/' | '%' );
    public final rulesetParser.mult_op_return mult_op() throws RecognitionException {
        rulesetParser.mult_op_return retval = new rulesetParser.mult_op_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set281=null;

        Object set281_tree=null;

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:356:8: ( '*' | '/' | '%' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:
            {
            root_0 = (Object)adaptor.nil();

            set281=(Token)input.LT(1);
            if ( (input.LA(1)>=99 && input.LA(1)<=101) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set281));
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
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:358:1: unary_expr options {backtrack=true; } : ( 'not' unary_expr | 'seen' STRING 'in' var_domain ':' ID timeframe | 'seen' STRING ( 'before' | 'after' ) STRING 'in' var_domain ':' ID | var_domain ':' ID predop expr timeframe | var_domain ':' ID timeframe | operator_expr );
    public final rulesetParser.unary_expr_return unary_expr() throws RecognitionException {
        rulesetParser.unary_expr_return retval = new rulesetParser.unary_expr_return();
        retval.start = input.LT(1);

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
        rulesetParser.unary_expr_return unary_expr283 = null;

        rulesetParser.var_domain_return var_domain287 = null;

        rulesetParser.timeframe_return timeframe290 = null;

        rulesetParser.var_domain_return var_domain296 = null;

        rulesetParser.var_domain_return var_domain299 = null;

        rulesetParser.predop_return predop302 = null;

        rulesetParser.expr_return expr303 = null;

        rulesetParser.timeframe_return timeframe304 = null;

        rulesetParser.var_domain_return var_domain305 = null;

        rulesetParser.timeframe_return timeframe308 = null;

        rulesetParser.operator_expr_return operator_expr309 = null;


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

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:359:2: ( 'not' unary_expr | 'seen' STRING 'in' var_domain ':' ID timeframe | 'seen' STRING ( 'before' | 'after' ) STRING 'in' var_domain ':' ID | var_domain ':' ID predop expr timeframe | var_domain ':' ID timeframe | operator_expr )
            int alt51=6;
            alt51 = dfa51.predict(input);
            switch (alt51) {
                case 1 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:359:4: 'not' unary_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal282=(Token)match(input,71,FOLLOW_71_in_unary_expr2346); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal282_tree = (Object)adaptor.create(string_literal282);
                    adaptor.addChild(root_0, string_literal282_tree);
                    }
                    pushFollow(FOLLOW_unary_expr_in_unary_expr2348);
                    unary_expr283=unary_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expr283.getTree());

                    }
                    break;
                case 2 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:360:2: 'seen' STRING 'in' var_domain ':' ID timeframe
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal284=(Token)match(input,102,FOLLOW_102_in_unary_expr2354); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal284_tree = (Object)adaptor.create(string_literal284);
                    adaptor.addChild(root_0, string_literal284_tree);
                    }
                    STRING285=(Token)match(input,STRING,FOLLOW_STRING_in_unary_expr2356); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING285_tree = (Object)adaptor.create(STRING285);
                    adaptor.addChild(root_0, STRING285_tree);
                    }
                    string_literal286=(Token)match(input,41,FOLLOW_41_in_unary_expr2358); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal286_tree = (Object)adaptor.create(string_literal286);
                    adaptor.addChild(root_0, string_literal286_tree);
                    }
                    pushFollow(FOLLOW_var_domain_in_unary_expr2360);
                    var_domain287=var_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, var_domain287.getTree());
                    char_literal288=(Token)match(input,38,FOLLOW_38_in_unary_expr2362); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal288_tree = (Object)adaptor.create(char_literal288);
                    adaptor.addChild(root_0, char_literal288_tree);
                    }
                    ID289=(Token)match(input,ID,FOLLOW_ID_in_unary_expr2364); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID289_tree = (Object)adaptor.create(ID289);
                    adaptor.addChild(root_0, ID289_tree);
                    }
                    pushFollow(FOLLOW_timeframe_in_unary_expr2366);
                    timeframe290=timeframe();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeframe290.getTree());

                    }
                    break;
                case 3 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:361:2: 'seen' STRING ( 'before' | 'after' ) STRING 'in' var_domain ':' ID
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal291=(Token)match(input,102,FOLLOW_102_in_unary_expr2371); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal291_tree = (Object)adaptor.create(string_literal291);
                    adaptor.addChild(root_0, string_literal291_tree);
                    }
                    STRING292=(Token)match(input,STRING,FOLLOW_STRING_in_unary_expr2373); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING292_tree = (Object)adaptor.create(STRING292);
                    adaptor.addChild(root_0, STRING292_tree);
                    }
                    set293=(Token)input.LT(1);
                    if ( input.LA(1)==69||input.LA(1)==103 ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set293));
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    STRING294=(Token)match(input,STRING,FOLLOW_STRING_in_unary_expr2383); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING294_tree = (Object)adaptor.create(STRING294);
                    adaptor.addChild(root_0, STRING294_tree);
                    }
                    string_literal295=(Token)match(input,41,FOLLOW_41_in_unary_expr2385); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal295_tree = (Object)adaptor.create(string_literal295);
                    adaptor.addChild(root_0, string_literal295_tree);
                    }
                    pushFollow(FOLLOW_var_domain_in_unary_expr2387);
                    var_domain296=var_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, var_domain296.getTree());
                    char_literal297=(Token)match(input,38,FOLLOW_38_in_unary_expr2389); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal297_tree = (Object)adaptor.create(char_literal297);
                    adaptor.addChild(root_0, char_literal297_tree);
                    }
                    ID298=(Token)match(input,ID,FOLLOW_ID_in_unary_expr2391); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID298_tree = (Object)adaptor.create(ID298);
                    adaptor.addChild(root_0, ID298_tree);
                    }

                    }
                    break;
                case 4 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:362:2: var_domain ':' ID predop expr timeframe
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_var_domain_in_unary_expr2396);
                    var_domain299=var_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, var_domain299.getTree());
                    char_literal300=(Token)match(input,38,FOLLOW_38_in_unary_expr2398); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal300_tree = (Object)adaptor.create(char_literal300);
                    adaptor.addChild(root_0, char_literal300_tree);
                    }
                    ID301=(Token)match(input,ID,FOLLOW_ID_in_unary_expr2400); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID301_tree = (Object)adaptor.create(ID301);
                    adaptor.addChild(root_0, ID301_tree);
                    }
                    pushFollow(FOLLOW_predop_in_unary_expr2402);
                    predop302=predop();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, predop302.getTree());
                    pushFollow(FOLLOW_expr_in_unary_expr2404);
                    expr303=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr303.getTree());
                    pushFollow(FOLLOW_timeframe_in_unary_expr2406);
                    timeframe304=timeframe();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeframe304.getTree());

                    }
                    break;
                case 5 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:363:2: var_domain ':' ID timeframe
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_var_domain_in_unary_expr2411);
                    var_domain305=var_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, var_domain305.getTree());
                    char_literal306=(Token)match(input,38,FOLLOW_38_in_unary_expr2413); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal306_tree = (Object)adaptor.create(char_literal306);
                    adaptor.addChild(root_0, char_literal306_tree);
                    }
                    ID307=(Token)match(input,ID,FOLLOW_ID_in_unary_expr2415); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID307_tree = (Object)adaptor.create(ID307);
                    adaptor.addChild(root_0, ID307_tree);
                    }
                    pushFollow(FOLLOW_timeframe_in_unary_expr2417);
                    timeframe308=timeframe();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeframe308.getTree());

                    }
                    break;
                case 6 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:364:2: operator_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_operator_expr_in_unary_expr2422);
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
        }
        return retval;
    }
    // $ANTLR end "unary_expr"

    public static class operator_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operator_expr"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:368:1: operator_expr : factor ( operator )* ;
    public final rulesetParser.operator_expr_return operator_expr() throws RecognitionException {
        rulesetParser.operator_expr_return retval = new rulesetParser.operator_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        rulesetParser.factor_return factor310 = null;

        rulesetParser.operator_return operator311 = null;



        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:369:2: ( factor ( operator )* )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:369:4: factor ( operator )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_factor_in_operator_expr2436);
            factor310=factor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, factor310.getTree());
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:369:11: ( operator )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==110) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:0:0: operator
            	    {
            	    pushFollow(FOLLOW_operator_in_operator_expr2438);
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


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:372:1: factor options {backtrack=true; } : ( INT | STRING | REGEXP | 'true' | 'false' | ID '[' expr ']' | persistent_var | trail_exp | function_app | '[' expr ',' ']' | '{' ( hash_line ( ',' )? )* '}' | ID | '(' expr ')' );
    public final rulesetParser.factor_return factor() throws RecognitionException {
        rulesetParser.factor_return retval = new rulesetParser.factor_return();
        retval.start = input.LT(1);

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
        rulesetParser.expr_return expr319 = null;

        rulesetParser.persistent_var_return persistent_var321 = null;

        rulesetParser.trail_exp_return trail_exp322 = null;

        rulesetParser.function_app_return function_app323 = null;

        rulesetParser.expr_return expr325 = null;

        rulesetParser.hash_line_return hash_line329 = null;

        rulesetParser.expr_return expr334 = null;


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

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:373:2: ( INT | STRING | REGEXP | 'true' | 'false' | ID '[' expr ']' | persistent_var | trail_exp | function_app | '[' expr ',' ']' | '{' ( hash_line ( ',' )? )* '}' | ID | '(' expr ')' )
            int alt55=13;
            alt55 = dfa55.predict(input);
            switch (alt55) {
                case 1 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:373:4: INT
                    {
                    root_0 = (Object)adaptor.nil();

                    INT312=(Token)match(input,INT,FOLLOW_INT_in_factor2463); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT312_tree = (Object)adaptor.create(INT312);
                    adaptor.addChild(root_0, INT312_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:374:9: STRING
                    {
                    root_0 = (Object)adaptor.nil();

                    STRING313=(Token)match(input,STRING,FOLLOW_STRING_in_factor2473); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING313_tree = (Object)adaptor.create(STRING313);
                    adaptor.addChild(root_0, STRING313_tree);
                    }

                    }
                    break;
                case 3 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:375:9: REGEXP
                    {
                    root_0 = (Object)adaptor.nil();

                    REGEXP314=(Token)match(input,REGEXP,FOLLOW_REGEXP_in_factor2483); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXP314_tree = (Object)adaptor.create(REGEXP314);
                    adaptor.addChild(root_0, REGEXP314_tree);
                    }

                    }
                    break;
                case 4 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:376:9: 'true'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal315=(Token)match(input,104,FOLLOW_104_in_factor2493); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal315_tree = (Object)adaptor.create(string_literal315);
                    adaptor.addChild(root_0, string_literal315_tree);
                    }

                    }
                    break;
                case 5 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:377:9: 'false'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal316=(Token)match(input,105,FOLLOW_105_in_factor2503); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal316_tree = (Object)adaptor.create(string_literal316);
                    adaptor.addChild(root_0, string_literal316_tree);
                    }

                    }
                    break;
                case 6 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:378:9: ID '[' expr ']'
                    {
                    root_0 = (Object)adaptor.nil();

                    ID317=(Token)match(input,ID,FOLLOW_ID_in_factor2513); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID317_tree = (Object)adaptor.create(ID317);
                    adaptor.addChild(root_0, ID317_tree);
                    }
                    char_literal318=(Token)match(input,106,FOLLOW_106_in_factor2515); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal318_tree = (Object)adaptor.create(char_literal318);
                    adaptor.addChild(root_0, char_literal318_tree);
                    }
                    pushFollow(FOLLOW_expr_in_factor2517);
                    expr319=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr319.getTree());
                    char_literal320=(Token)match(input,107,FOLLOW_107_in_factor2519); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal320_tree = (Object)adaptor.create(char_literal320);
                    adaptor.addChild(root_0, char_literal320_tree);
                    }

                    }
                    break;
                case 7 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:379:9: persistent_var
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_persistent_var_in_factor2529);
                    persistent_var321=persistent_var();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, persistent_var321.getTree());

                    }
                    break;
                case 8 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:380:9: trail_exp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_trail_exp_in_factor2539);
                    trail_exp322=trail_exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, trail_exp322.getTree());

                    }
                    break;
                case 9 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:381:9: function_app
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_function_app_in_factor2549);
                    function_app323=function_app();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_app323.getTree());

                    }
                    break;
                case 10 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:382:9: '[' expr ',' ']'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal324=(Token)match(input,106,FOLLOW_106_in_factor2559); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal324_tree = (Object)adaptor.create(char_literal324);
                    adaptor.addChild(root_0, char_literal324_tree);
                    }
                    pushFollow(FOLLOW_expr_in_factor2561);
                    expr325=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr325.getTree());
                    char_literal326=(Token)match(input,58,FOLLOW_58_in_factor2563); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal326_tree = (Object)adaptor.create(char_literal326);
                    adaptor.addChild(root_0, char_literal326_tree);
                    }
                    char_literal327=(Token)match(input,107,FOLLOW_107_in_factor2565); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal327_tree = (Object)adaptor.create(char_literal327);
                    adaptor.addChild(root_0, char_literal327_tree);
                    }

                    }
                    break;
                case 11 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:383:9: '{' ( hash_line ( ',' )? )* '}'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal328=(Token)match(input,20,FOLLOW_20_in_factor2575); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal328_tree = (Object)adaptor.create(char_literal328);
                    adaptor.addChild(root_0, char_literal328_tree);
                    }
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:383:13: ( hash_line ( ',' )? )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==STRING) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:383:14: hash_line ( ',' )?
                    	    {
                    	    pushFollow(FOLLOW_hash_line_in_factor2578);
                    	    hash_line329=hash_line();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, hash_line329.getTree());
                    	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:383:24: ( ',' )?
                    	    int alt53=2;
                    	    int LA53_0 = input.LA(1);

                    	    if ( (LA53_0==58) ) {
                    	        alt53=1;
                    	    }
                    	    switch (alt53) {
                    	        case 1 :
                    	            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:0:0: ','
                    	            {
                    	            char_literal330=(Token)match(input,58,FOLLOW_58_in_factor2580); if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) {
                    	            char_literal330_tree = (Object)adaptor.create(char_literal330);
                    	            adaptor.addChild(root_0, char_literal330_tree);
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);

                    char_literal331=(Token)match(input,21,FOLLOW_21_in_factor2585); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal331_tree = (Object)adaptor.create(char_literal331);
                    adaptor.addChild(root_0, char_literal331_tree);
                    }

                    }
                    break;
                case 12 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:384:9: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID332=(Token)match(input,ID,FOLLOW_ID_in_factor2595); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID332_tree = (Object)adaptor.create(ID332);
                    adaptor.addChild(root_0, ID332_tree);
                    }

                    }
                    break;
                case 13 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:385:9: '(' expr ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal333=(Token)match(input,57,FOLLOW_57_in_factor2606); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal333_tree = (Object)adaptor.create(char_literal333);
                    adaptor.addChild(root_0, char_literal333_tree);
                    }
                    pushFollow(FOLLOW_expr_in_factor2608);
                    expr334=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr334.getTree());
                    char_literal335=(Token)match(input,59,FOLLOW_59_in_factor2610); if (state.failed) return retval;
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
        }
        return retval;
    }
    // $ANTLR end "factor"

    public static class hash_line_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "hash_line"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:388:1: hash_line : STRING ':' expr ;
    public final rulesetParser.hash_line_return hash_line() throws RecognitionException {
        rulesetParser.hash_line_return retval = new rulesetParser.hash_line_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STRING336=null;
        Token char_literal337=null;
        rulesetParser.expr_return expr338 = null;


        Object STRING336_tree=null;
        Object char_literal337_tree=null;

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:389:2: ( STRING ':' expr )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:389:4: STRING ':' expr
            {
            root_0 = (Object)adaptor.nil();

            STRING336=(Token)match(input,STRING,FOLLOW_STRING_in_hash_line2623); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING336_tree = (Object)adaptor.create(STRING336);
            adaptor.addChild(root_0, STRING336_tree);
            }
            char_literal337=(Token)match(input,38,FOLLOW_38_in_hash_line2625); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal337_tree = (Object)adaptor.create(char_literal337);
            adaptor.addChild(root_0, char_literal337_tree);
            }
            pushFollow(FOLLOW_expr_in_hash_line2627);
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
        }
        return retval;
    }
    // $ANTLR end "hash_line"

    public static class function_app_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function_app"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:392:1: function_app : ( namespace ID '(' ( expr ( ',' )? )* ')' | ID '(' ( expr ( ',' )? )* ')' );
    public final rulesetParser.function_app_return function_app() throws RecognitionException {
        rulesetParser.function_app_return retval = new rulesetParser.function_app_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID340=null;
        Token char_literal341=null;
        Token char_literal343=null;
        Token char_literal344=null;
        Token ID345=null;
        Token char_literal346=null;
        Token char_literal348=null;
        Token char_literal349=null;
        rulesetParser.namespace_return namespace339 = null;

        rulesetParser.expr_return expr342 = null;

        rulesetParser.expr_return expr347 = null;


        Object ID340_tree=null;
        Object char_literal341_tree=null;
        Object char_literal343_tree=null;
        Object char_literal344_tree=null;
        Object ID345_tree=null;
        Object char_literal346_tree=null;
        Object char_literal348_tree=null;
        Object char_literal349_tree=null;

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:393:2: ( namespace ID '(' ( expr ( ',' )? )* ')' | ID '(' ( expr ( ',' )? )* ')' )
            int alt60=2;
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

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:393:3: namespace ID '(' ( expr ( ',' )? )* ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_namespace_in_function_app2640);
                    namespace339=namespace();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, namespace339.getTree());
                    ID340=(Token)match(input,ID,FOLLOW_ID_in_function_app2642); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID340_tree = (Object)adaptor.create(ID340);
                    adaptor.addChild(root_0, ID340_tree);
                    }
                    char_literal341=(Token)match(input,57,FOLLOW_57_in_function_app2644); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal341_tree = (Object)adaptor.create(char_literal341);
                    adaptor.addChild(root_0, char_literal341_tree);
                    }
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:393:20: ( expr ( ',' )? )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( ((LA57_0>=ID && LA57_0<=INT)||LA57_0==STRING||LA57_0==REGEXP||LA57_0==20||LA57_0==57||LA57_0==71||LA57_0==84||LA57_0==102||(LA57_0>=104 && LA57_0<=106)||(LA57_0>=108 && LA57_0<=109)||(LA57_0>=134 && LA57_0<=135)) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:393:21: expr ( ',' )?
                    	    {
                    	    pushFollow(FOLLOW_expr_in_function_app2647);
                    	    expr342=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr342.getTree());
                    	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:393:26: ( ',' )?
                    	    int alt56=2;
                    	    int LA56_0 = input.LA(1);

                    	    if ( (LA56_0==58) ) {
                    	        alt56=1;
                    	    }
                    	    switch (alt56) {
                    	        case 1 :
                    	            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:0:0: ','
                    	            {
                    	            char_literal343=(Token)match(input,58,FOLLOW_58_in_function_app2649); if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) {
                    	            char_literal343_tree = (Object)adaptor.create(char_literal343);
                    	            adaptor.addChild(root_0, char_literal343_tree);
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

                    char_literal344=(Token)match(input,59,FOLLOW_59_in_function_app2654); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal344_tree = (Object)adaptor.create(char_literal344);
                    adaptor.addChild(root_0, char_literal344_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:394:3: ID '(' ( expr ( ',' )? )* ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    ID345=(Token)match(input,ID,FOLLOW_ID_in_function_app2660); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID345_tree = (Object)adaptor.create(ID345);
                    adaptor.addChild(root_0, ID345_tree);
                    }
                    char_literal346=(Token)match(input,57,FOLLOW_57_in_function_app2662); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal346_tree = (Object)adaptor.create(char_literal346);
                    adaptor.addChild(root_0, char_literal346_tree);
                    }
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:394:10: ( expr ( ',' )? )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( ((LA59_0>=ID && LA59_0<=INT)||LA59_0==STRING||LA59_0==REGEXP||LA59_0==20||LA59_0==57||LA59_0==71||LA59_0==84||LA59_0==102||(LA59_0>=104 && LA59_0<=106)||(LA59_0>=108 && LA59_0<=109)||(LA59_0>=134 && LA59_0<=135)) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:394:11: expr ( ',' )?
                    	    {
                    	    pushFollow(FOLLOW_expr_in_function_app2665);
                    	    expr347=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr347.getTree());
                    	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:394:16: ( ',' )?
                    	    int alt58=2;
                    	    int LA58_0 = input.LA(1);

                    	    if ( (LA58_0==58) ) {
                    	        alt58=1;
                    	    }
                    	    switch (alt58) {
                    	        case 1 :
                    	            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:0:0: ','
                    	            {
                    	            char_literal348=(Token)match(input,58,FOLLOW_58_in_function_app2667); if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) {
                    	            char_literal348_tree = (Object)adaptor.create(char_literal348);
                    	            adaptor.addChild(root_0, char_literal348_tree);
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop59;
                        }
                    } while (true);

                    char_literal349=(Token)match(input,59,FOLLOW_59_in_function_app2672); if (state.failed) return retval;
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
        }
        return retval;
    }
    // $ANTLR end "function_app"

    public static class namespace_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "namespace"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:397:1: namespace : ID ':' ;
    public final rulesetParser.namespace_return namespace() throws RecognitionException {
        rulesetParser.namespace_return retval = new rulesetParser.namespace_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID350=null;
        Token char_literal351=null;

        Object ID350_tree=null;
        Object char_literal351_tree=null;

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:398:2: ( ID ':' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:398:4: ID ':'
            {
            root_0 = (Object)adaptor.nil();

            ID350=(Token)match(input,ID,FOLLOW_ID_in_namespace2684); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID350_tree = (Object)adaptor.create(ID350);
            adaptor.addChild(root_0, ID350_tree);
            }
            char_literal351=(Token)match(input,38,FOLLOW_38_in_namespace2686); if (state.failed) return retval;
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
        }
        return retval;
    }
    // $ANTLR end "namespace"

    public static class trail_exp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "trail_exp"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:401:1: trail_exp : ( 'current' var_domain ':' ID | 'history' expr var_domain ':' ID );
    public final rulesetParser.trail_exp_return trail_exp() throws RecognitionException {
        rulesetParser.trail_exp_return retval = new rulesetParser.trail_exp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal352=null;
        Token char_literal354=null;
        Token ID355=null;
        Token string_literal356=null;
        Token char_literal359=null;
        Token ID360=null;
        rulesetParser.var_domain_return var_domain353 = null;

        rulesetParser.expr_return expr357 = null;

        rulesetParser.var_domain_return var_domain358 = null;


        Object string_literal352_tree=null;
        Object char_literal354_tree=null;
        Object ID355_tree=null;
        Object string_literal356_tree=null;
        Object char_literal359_tree=null;
        Object ID360_tree=null;

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:402:2: ( 'current' var_domain ':' ID | 'history' expr var_domain ':' ID )
            int alt61=2;
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

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:402:3: 'current' var_domain ':' ID
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal352=(Token)match(input,108,FOLLOW_108_in_trail_exp2698); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal352_tree = (Object)adaptor.create(string_literal352);
                    adaptor.addChild(root_0, string_literal352_tree);
                    }
                    pushFollow(FOLLOW_var_domain_in_trail_exp2700);
                    var_domain353=var_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, var_domain353.getTree());
                    char_literal354=(Token)match(input,38,FOLLOW_38_in_trail_exp2702); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal354_tree = (Object)adaptor.create(char_literal354);
                    adaptor.addChild(root_0, char_literal354_tree);
                    }
                    ID355=(Token)match(input,ID,FOLLOW_ID_in_trail_exp2704); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID355_tree = (Object)adaptor.create(ID355);
                    adaptor.addChild(root_0, ID355_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:403:2: 'history' expr var_domain ':' ID
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal356=(Token)match(input,109,FOLLOW_109_in_trail_exp2709); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal356_tree = (Object)adaptor.create(string_literal356);
                    adaptor.addChild(root_0, string_literal356_tree);
                    }
                    pushFollow(FOLLOW_expr_in_trail_exp2711);
                    expr357=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr357.getTree());
                    pushFollow(FOLLOW_var_domain_in_trail_exp2713);
                    var_domain358=var_domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, var_domain358.getTree());
                    char_literal359=(Token)match(input,38,FOLLOW_38_in_trail_exp2715); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal359_tree = (Object)adaptor.create(char_literal359);
                    adaptor.addChild(root_0, char_literal359_tree);
                    }
                    ID360=(Token)match(input,ID,FOLLOW_ID_in_trail_exp2717); if (state.failed) return retval;
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
        }
        return retval;
    }
    // $ANTLR end "trail_exp"

    public static class persistent_var_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "persistent_var"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:406:1: persistent_var : var_domain ':' ID ;
    public final rulesetParser.persistent_var_return persistent_var() throws RecognitionException {
        rulesetParser.persistent_var_return retval = new rulesetParser.persistent_var_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal362=null;
        Token ID363=null;
        rulesetParser.var_domain_return var_domain361 = null;


        Object char_literal362_tree=null;
        Object ID363_tree=null;

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:407:2: ( var_domain ':' ID )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:407:4: var_domain ':' ID
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_var_domain_in_persistent_var2731);
            var_domain361=var_domain();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, var_domain361.getTree());
            char_literal362=(Token)match(input,38,FOLLOW_38_in_persistent_var2733); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal362_tree = (Object)adaptor.create(char_literal362);
            adaptor.addChild(root_0, char_literal362_tree);
            }
            ID363=(Token)match(input,ID,FOLLOW_ID_in_persistent_var2735); if (state.failed) return retval;
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
        }
        return retval;
    }
    // $ANTLR end "persistent_var"

    public static class operator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operator"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:409:1: operator : '.' operator_op '(' expr ( ',' )? ')' ;
    public final rulesetParser.operator_return operator() throws RecognitionException {
        rulesetParser.operator_return retval = new rulesetParser.operator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal364=null;
        Token char_literal366=null;
        Token char_literal368=null;
        Token char_literal369=null;
        rulesetParser.operator_op_return operator_op365 = null;

        rulesetParser.expr_return expr367 = null;


        Object char_literal364_tree=null;
        Object char_literal366_tree=null;
        Object char_literal368_tree=null;
        Object char_literal369_tree=null;

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:410:2: ( '.' operator_op '(' expr ( ',' )? ')' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:410:4: '.' operator_op '(' expr ( ',' )? ')'
            {
            root_0 = (Object)adaptor.nil();

            char_literal364=(Token)match(input,110,FOLLOW_110_in_operator2747); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal364_tree = (Object)adaptor.create(char_literal364);
            adaptor.addChild(root_0, char_literal364_tree);
            }
            pushFollow(FOLLOW_operator_op_in_operator2749);
            operator_op365=operator_op();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, operator_op365.getTree());
            char_literal366=(Token)match(input,57,FOLLOW_57_in_operator2751); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal366_tree = (Object)adaptor.create(char_literal366);
            adaptor.addChild(root_0, char_literal366_tree);
            }
            pushFollow(FOLLOW_expr_in_operator2753);
            expr367=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr367.getTree());
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:410:29: ( ',' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==58) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:0:0: ','
                    {
                    char_literal368=(Token)match(input,58,FOLLOW_58_in_operator2755); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal368_tree = (Object)adaptor.create(char_literal368);
                    adaptor.addChild(root_0, char_literal368_tree);
                    }

                    }
                    break;

            }

            char_literal369=(Token)match(input,59,FOLLOW_59_in_operator2758); if (state.failed) return retval;
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
        }
        return retval;
    }
    // $ANTLR end "operator"

    public static class operator_op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operator_op"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:413:1: operator_op : ( 'pick' | 'match' | 'length' | 'replace' | 'as' | 'head' | 'tail' | 'sort' | 'filter' | 'map' | 'uc' | 'lc' | 'split' | 'join' | 'query' | 'has' | 'union' | 'difference' | 'intersection' | 'unique' | 'once' | 'duplicates' );
    public final rulesetParser.operator_op_return operator_op() throws RecognitionException {
        rulesetParser.operator_op_return retval = new rulesetParser.operator_op_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set370=null;

        Object set370_tree=null;

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:414:2: ( 'pick' | 'match' | 'length' | 'replace' | 'as' | 'head' | 'tail' | 'sort' | 'filter' | 'map' | 'uc' | 'lc' | 'split' | 'join' | 'query' | 'has' | 'union' | 'difference' | 'intersection' | 'unique' | 'once' | 'duplicates' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:
            {
            root_0 = (Object)adaptor.nil();

            set370=(Token)input.LT(1);
            if ( (input.LA(1)>=111 && input.LA(1)<=132) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set370));
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
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:419:1: timeframe : 'within' expr ( periods | period ) ;
    public final rulesetParser.timeframe_return timeframe() throws RecognitionException {
        rulesetParser.timeframe_return retval = new rulesetParser.timeframe_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal371=null;
        rulesetParser.expr_return expr372 = null;

        rulesetParser.periods_return periods373 = null;

        rulesetParser.period_return period374 = null;


        Object string_literal371_tree=null;

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:420:2: ( 'within' expr ( periods | period ) )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:420:5: 'within' expr ( periods | period )
            {
            root_0 = (Object)adaptor.nil();

            string_literal371=(Token)match(input,133,FOLLOW_133_in_timeframe2868); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal371_tree = (Object)adaptor.create(string_literal371);
            adaptor.addChild(root_0, string_literal371_tree);
            }
            pushFollow(FOLLOW_expr_in_timeframe2870);
            expr372=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr372.getTree());
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:420:19: ( periods | period )
            int alt63=2;
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

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:420:20: periods
                    {
                    pushFollow(FOLLOW_periods_in_timeframe2873);
                    periods373=periods();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, periods373.getTree());

                    }
                    break;
                case 2 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:420:30: period
                    {
                    pushFollow(FOLLOW_period_in_timeframe2877);
                    period374=period();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, period374.getTree());

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:423:1: var_domain : ( 'ent' | 'app' );
    public final rulesetParser.var_domain_return var_domain() throws RecognitionException {
        rulesetParser.var_domain_return retval = new rulesetParser.var_domain_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set375=null;

        Object set375_tree=null;

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:423:11: ( 'ent' | 'app' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:
            {
            root_0 = (Object)adaptor.nil();

            set375=(Token)input.LT(1);
            if ( (input.LA(1)>=134 && input.LA(1)<=135) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set375));
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
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:425:1: emit_block : 'emit' ( HTML | STRING | JS ) ;
    public final rulesetParser.emit_block_return emit_block() throws RecognitionException {
        rulesetParser.emit_block_return retval = new rulesetParser.emit_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal376=null;
        Token set377=null;

        Object string_literal376_tree=null;
        Object set377_tree=null;

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:426:2: ( 'emit' ( HTML | STRING | JS ) )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:426:4: 'emit' ( HTML | STRING | JS )
            {
            root_0 = (Object)adaptor.nil();

            string_literal376=(Token)match(input,136,FOLLOW_136_in_emit_block2904); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal376_tree = (Object)adaptor.create(string_literal376);
            adaptor.addChild(root_0, string_literal376_tree);
            }
            set377=(Token)input.LT(1);
            if ( input.LA(1)==STRING||(input.LA(1)>=HTML && input.LA(1)<=JS) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set377));
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
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:429:1: dataset : 'dataset' ID ( datatype )? '<-' STRING cachable ;
    public final rulesetParser.dataset_return dataset() throws RecognitionException {
        rulesetParser.dataset_return retval = new rulesetParser.dataset_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal378=null;
        Token ID379=null;
        Token string_literal381=null;
        Token STRING382=null;
        rulesetParser.datatype_return datatype380 = null;

        rulesetParser.cachable_return cachable383 = null;


        Object string_literal378_tree=null;
        Object ID379_tree=null;
        Object string_literal381_tree=null;
        Object STRING382_tree=null;

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:429:9: ( 'dataset' ID ( datatype )? '<-' STRING cachable )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:429:11: 'dataset' ID ( datatype )? '<-' STRING cachable
            {
            root_0 = (Object)adaptor.nil();

            string_literal378=(Token)match(input,137,FOLLOW_137_in_dataset2924); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal378_tree = (Object)adaptor.create(string_literal378);
            adaptor.addChild(root_0, string_literal378_tree);
            }
            ID379=(Token)match(input,ID,FOLLOW_ID_in_dataset2926); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID379_tree = (Object)adaptor.create(ID379);
            adaptor.addChild(root_0, ID379_tree);
            }
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:429:24: ( datatype )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==38) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:0:0: datatype
                    {
                    pushFollow(FOLLOW_datatype_in_dataset2928);
                    datatype380=datatype();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, datatype380.getTree());

                    }
                    break;

            }

            string_literal381=(Token)match(input,82,FOLLOW_82_in_dataset2931); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal381_tree = (Object)adaptor.create(string_literal381);
            adaptor.addChild(root_0, string_literal381_tree);
            }
            STRING382=(Token)match(input,STRING,FOLLOW_STRING_in_dataset2933); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING382_tree = (Object)adaptor.create(STRING382);
            adaptor.addChild(root_0, STRING382_tree);
            }
            pushFollow(FOLLOW_cachable_in_dataset2935);
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
        }
        return retval;
    }
    // $ANTLR end "dataset"

    public static class datatype_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "datatype"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:432:1: datatype : ':' ( 'JSON' | 'XML' | 'RSS' | 'HTML' ) ;
    public final rulesetParser.datatype_return datatype() throws RecognitionException {
        rulesetParser.datatype_return retval = new rulesetParser.datatype_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal384=null;
        Token set385=null;

        Object char_literal384_tree=null;
        Object set385_tree=null;

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:432:9: ( ':' ( 'JSON' | 'XML' | 'RSS' | 'HTML' ) )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:432:11: ':' ( 'JSON' | 'XML' | 'RSS' | 'HTML' )
            {
            root_0 = (Object)adaptor.nil();

            char_literal384=(Token)match(input,38,FOLLOW_38_in_datatype2945); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal384_tree = (Object)adaptor.create(char_literal384);
            adaptor.addChild(root_0, char_literal384_tree);
            }
            set385=(Token)input.LT(1);
            if ( (input.LA(1)>=138 && input.LA(1)<=141) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set385));
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
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:435:1: cachable : 'cachable' cachetime ;
    public final rulesetParser.cachable_return cachable() throws RecognitionException {
        rulesetParser.cachable_return retval = new rulesetParser.cachable_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal386=null;
        rulesetParser.cachetime_return cachetime387 = null;


        Object string_literal386_tree=null;

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:435:9: ( 'cachable' cachetime )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:435:11: 'cachable' cachetime
            {
            root_0 = (Object)adaptor.nil();

            string_literal386=(Token)match(input,142,FOLLOW_142_in_cachable2964); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal386_tree = (Object)adaptor.create(string_literal386);
            adaptor.addChild(root_0, string_literal386_tree);
            }
            pushFollow(FOLLOW_cachetime_in_cachable2966);
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
        }
        return retval;
    }
    // $ANTLR end "cachable"

    public static class cachetime_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cachetime"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:438:1: cachetime : 'for' INT ( periods | period ) ;
    public final rulesetParser.cachetime_return cachetime() throws RecognitionException {
        rulesetParser.cachetime_return retval = new rulesetParser.cachetime_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal388=null;
        Token INT389=null;
        rulesetParser.periods_return periods390 = null;

        rulesetParser.period_return period391 = null;


        Object string_literal388_tree=null;
        Object INT389_tree=null;

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:438:10: ( 'for' INT ( periods | period ) )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:438:12: 'for' INT ( periods | period )
            {
            root_0 = (Object)adaptor.nil();

            string_literal388=(Token)match(input,52,FOLLOW_52_in_cachetime2977); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal388_tree = (Object)adaptor.create(string_literal388);
            adaptor.addChild(root_0, string_literal388_tree);
            }
            INT389=(Token)match(input,INT,FOLLOW_INT_in_cachetime2979); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INT389_tree = (Object)adaptor.create(INT389);
            adaptor.addChild(root_0, INT389_tree);
            }
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:438:22: ( periods | period )
            int alt65=2;
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

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:438:23: periods
                    {
                    pushFollow(FOLLOW_periods_in_cachetime2982);
                    periods390=periods();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, periods390.getTree());

                    }
                    break;
                case 2 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:438:31: period
                    {
                    pushFollow(FOLLOW_period_in_cachetime2984);
                    period391=period();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, period391.getTree());

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
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:441:1: periods : ( 'years' | 'months' | 'weeks' | 'days' | 'hours' | 'minutes' | 'seconds' );
    public final rulesetParser.periods_return periods() throws RecognitionException {
        rulesetParser.periods_return retval = new rulesetParser.periods_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set392=null;

        Object set392_tree=null;

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:441:9: ( 'years' | 'months' | 'weeks' | 'days' | 'hours' | 'minutes' | 'seconds' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:
            {
            root_0 = (Object)adaptor.nil();

            set392=(Token)input.LT(1);
            if ( (input.LA(1)>=143 && input.LA(1)<=149) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set392));
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
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:450:1: period : ( 'year' | 'month' | 'week' | 'day' | 'hour' | 'minute' | 'second' );
    public final rulesetParser.period_return period() throws RecognitionException {
        rulesetParser.period_return retval = new rulesetParser.period_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set393=null;

        Object set393_tree=null;

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:450:9: ( 'year' | 'month' | 'week' | 'day' | 'hour' | 'minute' | 'second' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:
            {
            root_0 = (Object)adaptor.nil();

            set393=(Token)input.LT(1);
            if ( (input.LA(1)>=150 && input.LA(1)<=156) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set393));
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
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:462:1: dispatch_block : 'dispatch' '{' ( dispatch )* '}' ;
    public final rulesetParser.dispatch_block_return dispatch_block() throws RecognitionException {
        rulesetParser.dispatch_block_return retval = new rulesetParser.dispatch_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal394=null;
        Token char_literal395=null;
        Token char_literal397=null;
        rulesetParser.dispatch_return dispatch396 = null;


        Object string_literal394_tree=null;
        Object char_literal395_tree=null;
        Object char_literal397_tree=null;

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:463:2: ( 'dispatch' '{' ( dispatch )* '}' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:463:4: 'dispatch' '{' ( dispatch )* '}'
            {
            root_0 = (Object)adaptor.nil();

            string_literal394=(Token)match(input,157,FOLLOW_157_in_dispatch_block3119); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal394_tree = (Object)adaptor.create(string_literal394);
            adaptor.addChild(root_0, string_literal394_tree);
            }
            char_literal395=(Token)match(input,20,FOLLOW_20_in_dispatch_block3121); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal395_tree = (Object)adaptor.create(char_literal395);
            adaptor.addChild(root_0, char_literal395_tree);
            }
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:463:19: ( dispatch )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==158) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:0:0: dispatch
            	    {
            	    pushFollow(FOLLOW_dispatch_in_dispatch_block3123);
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

            char_literal397=(Token)match(input,21,FOLLOW_21_in_dispatch_block3126); if (state.failed) return retval;
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
        }
        return retval;
    }
    // $ANTLR end "dispatch_block"

    public static class dispatch_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dispatch"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:466:1: dispatch : 'domain' STRING dispatch_target ;
    public final rulesetParser.dispatch_return dispatch() throws RecognitionException {
        rulesetParser.dispatch_return retval = new rulesetParser.dispatch_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal398=null;
        Token STRING399=null;
        rulesetParser.dispatch_target_return dispatch_target400 = null;


        Object string_literal398_tree=null;
        Object STRING399_tree=null;

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:466:9: ( 'domain' STRING dispatch_target )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:466:11: 'domain' STRING dispatch_target
            {
            root_0 = (Object)adaptor.nil();

            string_literal398=(Token)match(input,158,FOLLOW_158_in_dispatch3135); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal398_tree = (Object)adaptor.create(string_literal398);
            adaptor.addChild(root_0, string_literal398_tree);
            }
            STRING399=(Token)match(input,STRING,FOLLOW_STRING_in_dispatch3137); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING399_tree = (Object)adaptor.create(STRING399);
            adaptor.addChild(root_0, STRING399_tree);
            }
            pushFollow(FOLLOW_dispatch_target_in_dispatch3139);
            dispatch_target400=dispatch_target();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, dispatch_target400.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:468:1: dispatch_target : '->' STRING ;
    public final rulesetParser.dispatch_target_return dispatch_target() throws RecognitionException {
        rulesetParser.dispatch_target_return retval = new rulesetParser.dispatch_target_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal401=null;
        Token STRING402=null;

        Object string_literal401_tree=null;
        Object STRING402_tree=null;

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:469:2: ( '->' STRING )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:469:4: '->' STRING
            {
            root_0 = (Object)adaptor.nil();

            string_literal401=(Token)match(input,159,FOLLOW_159_in_dispatch_target3150); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal401_tree = (Object)adaptor.create(string_literal401);
            adaptor.addChild(root_0, string_literal401_tree);
            }
            STRING402=(Token)match(input,STRING,FOLLOW_STRING_in_dispatch_target3152); if (state.failed) return retval;
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
        }
        return retval;
    }
    // $ANTLR end "dispatch_target"

    public static class meta_block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "meta_block"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:475:1: meta_block : 'meta' '{' ( pragma )* '}' ;
    public final rulesetParser.meta_block_return meta_block() throws RecognitionException {
        rulesetParser.meta_block_return retval = new rulesetParser.meta_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal403=null;
        Token char_literal404=null;
        Token char_literal406=null;
        rulesetParser.pragma_return pragma405 = null;


        Object string_literal403_tree=null;
        Object char_literal404_tree=null;
        Object char_literal406_tree=null;

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:476:2: ( 'meta' '{' ( pragma )* '}' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:476:4: 'meta' '{' ( pragma )* '}'
            {
            root_0 = (Object)adaptor.nil();

            string_literal403=(Token)match(input,160,FOLLOW_160_in_meta_block3175); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal403_tree = (Object)adaptor.create(string_literal403);
            adaptor.addChild(root_0, string_literal403_tree);
            }
            char_literal404=(Token)match(input,20,FOLLOW_20_in_meta_block3177); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal404_tree = (Object)adaptor.create(char_literal404);
            adaptor.addChild(root_0, char_literal404_tree);
            }
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:476:15: ( pragma )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( ((LA67_0>=161 && LA67_0<=163)||LA67_0==170||LA67_0==174||LA67_0==177||LA67_0==180) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:0:0: pragma
            	    {
            	    pushFollow(FOLLOW_pragma_in_meta_block3179);
            	    pragma405=pragma();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, pragma405.getTree());

            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);

            char_literal406=(Token)match(input,21,FOLLOW_21_in_meta_block3183); if (state.failed) return retval;
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
        }
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
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:481:1: pragma : ( desc_block | 'name' STRING | 'author' STRING | 'key' ( 'errorstack' | 'googleanalytics' | 'twitter' | 'amazon' | 'kpds' | 'google' | ID ) key_value | authz_pragma | logging_pargma | 'use' 'module' ID ( alias )? | 'use' ( 'css' | 'javascript' ) 'resource' location );
    public final rulesetParser.pragma_return pragma() throws RecognitionException {
        rulesetParser.pragma_return retval = new rulesetParser.pragma_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal408=null;
        Token STRING409=null;
        Token string_literal410=null;
        Token STRING411=null;
        Token string_literal412=null;
        Token set413=null;
        Token string_literal417=null;
        Token string_literal418=null;
        Token ID419=null;
        Token string_literal421=null;
        Token set422=null;
        Token string_literal423=null;
        rulesetParser.desc_block_return desc_block407 = null;

        rulesetParser.key_value_return key_value414 = null;

        rulesetParser.authz_pragma_return authz_pragma415 = null;

        rulesetParser.logging_pargma_return logging_pargma416 = null;

        rulesetParser.alias_return alias420 = null;

        rulesetParser.location_return location424 = null;


        Object string_literal408_tree=null;
        Object STRING409_tree=null;
        Object string_literal410_tree=null;
        Object STRING411_tree=null;
        Object string_literal412_tree=null;
        Object set413_tree=null;
        Object string_literal417_tree=null;
        Object string_literal418_tree=null;
        Object ID419_tree=null;
        Object string_literal421_tree=null;
        Object set422_tree=null;
        Object string_literal423_tree=null;

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:481:9: ( desc_block | 'name' STRING | 'author' STRING | 'key' ( 'errorstack' | 'googleanalytics' | 'twitter' | 'amazon' | 'kpds' | 'google' | ID ) key_value | authz_pragma | logging_pargma | 'use' 'module' ID ( alias )? | 'use' ( 'css' | 'javascript' ) 'resource' location )
            int alt69=8;
            alt69 = dfa69.predict(input);
            switch (alt69) {
                case 1 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:481:11: desc_block
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_desc_block_in_pragma3197);
                    desc_block407=desc_block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, desc_block407.getTree());

                    }
                    break;
                case 2 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:481:24: 'name' STRING
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal408=(Token)match(input,161,FOLLOW_161_in_pragma3201); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal408_tree = (Object)adaptor.create(string_literal408);
                    adaptor.addChild(root_0, string_literal408_tree);
                    }
                    STRING409=(Token)match(input,STRING,FOLLOW_STRING_in_pragma3203); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING409_tree = (Object)adaptor.create(STRING409);
                    adaptor.addChild(root_0, STRING409_tree);
                    }

                    }
                    break;
                case 3 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:481:40: 'author' STRING
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal410=(Token)match(input,162,FOLLOW_162_in_pragma3207); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal410_tree = (Object)adaptor.create(string_literal410);
                    adaptor.addChild(root_0, string_literal410_tree);
                    }
                    STRING411=(Token)match(input,STRING,FOLLOW_STRING_in_pragma3209); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING411_tree = (Object)adaptor.create(STRING411);
                    adaptor.addChild(root_0, STRING411_tree);
                    }

                    }
                    break;
                case 4 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:481:58: 'key' ( 'errorstack' | 'googleanalytics' | 'twitter' | 'amazon' | 'kpds' | 'google' | ID ) key_value
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal412=(Token)match(input,163,FOLLOW_163_in_pragma3213); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal412_tree = (Object)adaptor.create(string_literal412);
                    adaptor.addChild(root_0, string_literal412_tree);
                    }
                    set413=(Token)input.LT(1);
                    if ( input.LA(1)==ID||(input.LA(1)>=164 && input.LA(1)<=169) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set413));
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_key_value_in_pragma3233);
                    key_value414=key_value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, key_value414.getTree());

                    }
                    break;
                case 5 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:482:4: authz_pragma
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_authz_pragma_in_pragma3239);
                    authz_pragma415=authz_pragma();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, authz_pragma415.getTree());

                    }
                    break;
                case 6 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:483:4: logging_pargma
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_logging_pargma_in_pragma3244);
                    logging_pargma416=logging_pargma();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logging_pargma416.getTree());

                    }
                    break;
                case 7 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:484:4: 'use' 'module' ID ( alias )?
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal417=(Token)match(input,170,FOLLOW_170_in_pragma3249); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal417_tree = (Object)adaptor.create(string_literal417);
                    adaptor.addChild(root_0, string_literal417_tree);
                    }
                    string_literal418=(Token)match(input,171,FOLLOW_171_in_pragma3251); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal418_tree = (Object)adaptor.create(string_literal418);
                    adaptor.addChild(root_0, string_literal418_tree);
                    }
                    ID419=(Token)match(input,ID,FOLLOW_ID_in_pragma3253); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID419_tree = (Object)adaptor.create(ID419);
                    adaptor.addChild(root_0, ID419_tree);
                    }
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:484:22: ( alias )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==179) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:0:0: alias
                            {
                            pushFollow(FOLLOW_alias_in_pragma3255);
                            alias420=alias();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, alias420.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 8 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:485:4: 'use' ( 'css' | 'javascript' ) 'resource' location
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal421=(Token)match(input,170,FOLLOW_170_in_pragma3261); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal421_tree = (Object)adaptor.create(string_literal421);
                    adaptor.addChild(root_0, string_literal421_tree);
                    }
                    set422=(Token)input.LT(1);
                    if ( input.LA(1)==83||input.LA(1)==172 ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set422));
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    string_literal423=(Token)match(input,173,FOLLOW_173_in_pragma3271); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal423_tree = (Object)adaptor.create(string_literal423);
                    adaptor.addChild(root_0, string_literal423_tree);
                    }
                    pushFollow(FOLLOW_location_in_pragma3273);
                    location424=location();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, location424.getTree());

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

    public static class authz_pragma_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "authz_pragma"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:488:1: authz_pragma : 'authz' 'require' 'user' ;
    public final rulesetParser.authz_pragma_return authz_pragma() throws RecognitionException {
        rulesetParser.authz_pragma_return retval = new rulesetParser.authz_pragma_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal425=null;
        Token string_literal426=null;
        Token string_literal427=null;

        Object string_literal425_tree=null;
        Object string_literal426_tree=null;
        Object string_literal427_tree=null;

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:489:2: ( 'authz' 'require' 'user' )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:489:4: 'authz' 'require' 'user'
            {
            root_0 = (Object)adaptor.nil();

            string_literal425=(Token)match(input,174,FOLLOW_174_in_authz_pragma3285); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal425_tree = (Object)adaptor.create(string_literal425);
            adaptor.addChild(root_0, string_literal425_tree);
            }
            string_literal426=(Token)match(input,175,FOLLOW_175_in_authz_pragma3287); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal426_tree = (Object)adaptor.create(string_literal426);
            adaptor.addChild(root_0, string_literal426_tree);
            }
            string_literal427=(Token)match(input,176,FOLLOW_176_in_authz_pragma3289); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal427_tree = (Object)adaptor.create(string_literal427);
            adaptor.addChild(root_0, string_literal427_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:492:1: logging_pargma : 'logging' ( 'on' | 'off' ) ;
    public final rulesetParser.logging_pargma_return logging_pargma() throws RecognitionException {
        rulesetParser.logging_pargma_return retval = new rulesetParser.logging_pargma_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal428=null;
        Token set429=null;

        Object string_literal428_tree=null;
        Object set429_tree=null;

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:493:2: ( 'logging' ( 'on' | 'off' ) )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:493:4: 'logging' ( 'on' | 'off' )
            {
            root_0 = (Object)adaptor.nil();

            string_literal428=(Token)match(input,177,FOLLOW_177_in_logging_pargma3301); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal428_tree = (Object)adaptor.create(string_literal428);
            adaptor.addChild(root_0, string_literal428_tree);
            }
            set429=(Token)input.LT(1);
            if ( input.LA(1)==79||input.LA(1)==178 ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set429));
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
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:496:1: alias : 'alias' ID ;
    public final rulesetParser.alias_return alias() throws RecognitionException {
        rulesetParser.alias_return retval = new rulesetParser.alias_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal430=null;
        Token ID431=null;

        Object string_literal430_tree=null;
        Object ID431_tree=null;

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:496:7: ( 'alias' ID )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:496:9: 'alias' ID
            {
            root_0 = (Object)adaptor.nil();

            string_literal430=(Token)match(input,179,FOLLOW_179_in_alias3318); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal430_tree = (Object)adaptor.create(string_literal430);
            adaptor.addChild(root_0, string_literal430_tree);
            }
            ID431=(Token)match(input,ID,FOLLOW_ID_in_alias3320); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID431_tree = (Object)adaptor.create(ID431);
            adaptor.addChild(root_0, ID431_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:498:1: location : ( STRING | ID );
    public final rulesetParser.location_return location() throws RecognitionException {
        rulesetParser.location_return retval = new rulesetParser.location_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set432=null;

        Object set432_tree=null;

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:498:9: ( STRING | ID )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:
            {
            root_0 = (Object)adaptor.nil();

            set432=(Token)input.LT(1);
            if ( input.LA(1)==ID||input.LA(1)==STRING ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set432));
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
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:500:1: desc_block : 'description' ( HTML | STRING ) ;
    public final rulesetParser.desc_block_return desc_block() throws RecognitionException {
        rulesetParser.desc_block_return retval = new rulesetParser.desc_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal433=null;
        Token set434=null;

        Object string_literal433_tree=null;
        Object set434_tree=null;

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:501:2: ( 'description' ( HTML | STRING ) )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:501:4: 'description' ( HTML | STRING )
            {
            root_0 = (Object)adaptor.nil();

            string_literal433=(Token)match(input,180,FOLLOW_180_in_desc_block3342); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal433_tree = (Object)adaptor.create(string_literal433);
            adaptor.addChild(root_0, string_literal433_tree);
            }
            set434=(Token)input.LT(1);
            if ( input.LA(1)==STRING||input.LA(1)==HTML ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set434));
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
    // $ANTLR end "desc_block"

    public static class key_value_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "key_value"
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:505:1: key_value : ( STRING | ( name_value_pair )+ );
    public final rulesetParser.key_value_return key_value() throws RecognitionException {
        rulesetParser.key_value_return retval = new rulesetParser.key_value_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STRING435=null;
        rulesetParser.name_value_pair_return name_value_pair436 = null;


        Object STRING435_tree=null;

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:506:2: ( STRING | ( name_value_pair )+ )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==STRING) ) {
                int LA71_1 = input.LA(2);

                if ( (LA71_1==38) ) {
                    alt71=2;
                }
                else if ( (LA71_1==EOF||LA71_1==21||(LA71_1>=161 && LA71_1<=163)||LA71_1==170||LA71_1==174||LA71_1==177||LA71_1==180) ) {
                    alt71=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 71, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:506:4: STRING
                    {
                    root_0 = (Object)adaptor.nil();

                    STRING435=(Token)match(input,STRING,FOLLOW_STRING_in_key_value3362); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING435_tree = (Object)adaptor.create(STRING435);
                    adaptor.addChild(root_0, STRING435_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:506:13: ( name_value_pair )+
                    {
                    root_0 = (Object)adaptor.nil();

                    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:506:13: ( name_value_pair )+
                    int cnt70=0;
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==STRING) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:0:0: name_value_pair
                    	    {
                    	    pushFollow(FOLLOW_name_value_pair_in_key_value3366);
                    	    name_value_pair436=name_value_pair();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, name_value_pair436.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt70 >= 1 ) break loop70;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(70, input);
                                throw eee;
                        }
                        cnt70++;
                    } while (true);


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
    // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:509:1: name_value_pair : STRING ':' ( INT | STRING ) ;
    public final rulesetParser.name_value_pair_return name_value_pair() throws RecognitionException {
        rulesetParser.name_value_pair_return retval = new rulesetParser.name_value_pair_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STRING437=null;
        Token char_literal438=null;
        Token set439=null;

        Object STRING437_tree=null;
        Object char_literal438_tree=null;
        Object set439_tree=null;

        try {
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:510:2: ( STRING ':' ( INT | STRING ) )
            // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:510:4: STRING ':' ( INT | STRING )
            {
            root_0 = (Object)adaptor.nil();

            STRING437=(Token)match(input,STRING,FOLLOW_STRING_in_name_value_pair3382); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING437_tree = (Object)adaptor.create(STRING437);
            adaptor.addChild(root_0, STRING437_tree);
            }
            char_literal438=(Token)match(input,38,FOLLOW_38_in_name_value_pair3384); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal438_tree = (Object)adaptor.create(char_literal438);
            adaptor.addChild(root_0, char_literal438_tree);
            }
            set439=(Token)input.LT(1);
            if ( input.LA(1)==INT||input.LA(1)==STRING ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set439));
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
    // $ANTLR end "name_value_pair"

    // $ANTLR start synpred46_ruleset
    public final void synpred46_ruleset_fragment() throws RecognitionException {   
        // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:258:4: ( event_or 'then' )
        // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:258:4: event_or 'then'
        {
        pushFollow(FOLLOW_event_or_in_synpred46_ruleset1643);
        event_or();

        state._fsp--;
        if (state.failed) return ;
        match(input,56,FOLLOW_56_in_synpred46_ruleset1645); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred46_ruleset

    // $ANTLR start synpred47_ruleset
    public final void synpred47_ruleset_fragment() throws RecognitionException {   
        // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:259:3: ( event_or 'before' )
        // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:259:3: event_or 'before'
        {
        pushFollow(FOLLOW_event_or_in_synpred47_ruleset1650);
        event_or();

        state._fsp--;
        if (state.failed) return ;
        match(input,69,FOLLOW_69_in_synpred47_ruleset1652); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred47_ruleset

    // $ANTLR start synpred76_ruleset
    public final void synpred76_ruleset_fragment() throws RecognitionException {   
        // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:331:4: ( disjunction '=>' expr '|' expr )
        // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:331:4: disjunction '=>' expr '|' expr
        {
        pushFollow(FOLLOW_disjunction_in_synpred76_ruleset2153);
        disjunction();

        state._fsp--;
        if (state.failed) return ;
        match(input,60,FOLLOW_60_in_synpred76_ruleset2155); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred76_ruleset2157);
        expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,85,FOLLOW_85_in_synpred76_ruleset2159); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred76_ruleset2161);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred76_ruleset

    // $ANTLR start synpred94_ruleset
    public final void synpred94_ruleset_fragment() throws RecognitionException {   
        // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:360:2: ( 'seen' STRING 'in' var_domain ':' ID timeframe )
        // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:360:2: 'seen' STRING 'in' var_domain ':' ID timeframe
        {
        match(input,102,FOLLOW_102_in_synpred94_ruleset2354); if (state.failed) return ;
        match(input,STRING,FOLLOW_STRING_in_synpred94_ruleset2356); if (state.failed) return ;
        match(input,41,FOLLOW_41_in_synpred94_ruleset2358); if (state.failed) return ;
        pushFollow(FOLLOW_var_domain_in_synpred94_ruleset2360);
        var_domain();

        state._fsp--;
        if (state.failed) return ;
        match(input,38,FOLLOW_38_in_synpred94_ruleset2362); if (state.failed) return ;
        match(input,ID,FOLLOW_ID_in_synpred94_ruleset2364); if (state.failed) return ;
        pushFollow(FOLLOW_timeframe_in_synpred94_ruleset2366);
        timeframe();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred94_ruleset

    // $ANTLR start synpred96_ruleset
    public final void synpred96_ruleset_fragment() throws RecognitionException {   
        // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:361:2: ( 'seen' STRING ( 'before' | 'after' ) STRING 'in' var_domain ':' ID )
        // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:361:2: 'seen' STRING ( 'before' | 'after' ) STRING 'in' var_domain ':' ID
        {
        match(input,102,FOLLOW_102_in_synpred96_ruleset2371); if (state.failed) return ;
        match(input,STRING,FOLLOW_STRING_in_synpred96_ruleset2373); if (state.failed) return ;
        if ( input.LA(1)==69||input.LA(1)==103 ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }

        match(input,STRING,FOLLOW_STRING_in_synpred96_ruleset2383); if (state.failed) return ;
        match(input,41,FOLLOW_41_in_synpred96_ruleset2385); if (state.failed) return ;
        pushFollow(FOLLOW_var_domain_in_synpred96_ruleset2387);
        var_domain();

        state._fsp--;
        if (state.failed) return ;
        match(input,38,FOLLOW_38_in_synpred96_ruleset2389); if (state.failed) return ;
        match(input,ID,FOLLOW_ID_in_synpred96_ruleset2391); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred96_ruleset

    // $ANTLR start synpred97_ruleset
    public final void synpred97_ruleset_fragment() throws RecognitionException {   
        // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:362:2: ( var_domain ':' ID predop expr timeframe )
        // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:362:2: var_domain ':' ID predop expr timeframe
        {
        pushFollow(FOLLOW_var_domain_in_synpred97_ruleset2396);
        var_domain();

        state._fsp--;
        if (state.failed) return ;
        match(input,38,FOLLOW_38_in_synpred97_ruleset2398); if (state.failed) return ;
        match(input,ID,FOLLOW_ID_in_synpred97_ruleset2400); if (state.failed) return ;
        pushFollow(FOLLOW_predop_in_synpred97_ruleset2402);
        predop();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred97_ruleset2404);
        expr();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_timeframe_in_synpred97_ruleset2406);
        timeframe();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred97_ruleset

    // $ANTLR start synpred98_ruleset
    public final void synpred98_ruleset_fragment() throws RecognitionException {   
        // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:363:2: ( var_domain ':' ID timeframe )
        // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:363:2: var_domain ':' ID timeframe
        {
        pushFollow(FOLLOW_var_domain_in_synpred98_ruleset2411);
        var_domain();

        state._fsp--;
        if (state.failed) return ;
        match(input,38,FOLLOW_38_in_synpred98_ruleset2413); if (state.failed) return ;
        match(input,ID,FOLLOW_ID_in_synpred98_ruleset2415); if (state.failed) return ;
        pushFollow(FOLLOW_timeframe_in_synpred98_ruleset2417);
        timeframe();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred98_ruleset

    // $ANTLR start synpred105_ruleset
    public final void synpred105_ruleset_fragment() throws RecognitionException {   
        // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:378:9: ( ID '[' expr ']' )
        // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:378:9: ID '[' expr ']'
        {
        match(input,ID,FOLLOW_ID_in_synpred105_ruleset2513); if (state.failed) return ;
        match(input,106,FOLLOW_106_in_synpred105_ruleset2515); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred105_ruleset2517);
        expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,107,FOLLOW_107_in_synpred105_ruleset2519); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred105_ruleset

    // $ANTLR start synpred108_ruleset
    public final void synpred108_ruleset_fragment() throws RecognitionException {   
        // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:381:9: ( function_app )
        // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:381:9: function_app
        {
        pushFollow(FOLLOW_function_app_in_synpred108_ruleset2549);
        function_app();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred108_ruleset

    // $ANTLR start synpred113_ruleset
    public final void synpred113_ruleset_fragment() throws RecognitionException {   
        // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:384:9: ( ID )
        // /Users/ciddennis/Development/sandboxes/cid/parser/ruleset.g:384:9: ID
        {
        match(input,ID,FOLLOW_ID_in_synpred113_ruleset2595); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred113_ruleset

    // Delegated rules

    public final boolean synpred76_ruleset() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred76_ruleset_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred105_ruleset() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred105_ruleset_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred47_ruleset() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred47_ruleset_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred96_ruleset() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred96_ruleset_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred97_ruleset() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred97_ruleset_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred46_ruleset() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred46_ruleset_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred108_ruleset() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred108_ruleset_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred113_ruleset() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred113_ruleset_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred94_ruleset() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred94_ruleset_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred98_ruleset() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred98_ruleset_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA45 dfa45 = new DFA45(this);
    protected DFA51 dfa51 = new DFA51(this);
    protected DFA55 dfa55 = new DFA55(this);
    protected DFA69 dfa69 = new DFA69(this);
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
            "\1\11\1\4\5\uffff\1\5\6\uffff\1\6\1\uffff\1\15\44\uffff\1\16"+
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
            return "330:1: conditional_expression options {backtrack=true; } : ( disjunction '=>' expr '|' expr | disjunction );";
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
                        if ( (synpred76_ruleset()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index45_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA45_2 = input.LA(1);

                         
                        int index45_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_ruleset()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index45_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA45_3 = input.LA(1);

                         
                        int index45_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_ruleset()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index45_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA45_4 = input.LA(1);

                         
                        int index45_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_ruleset()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index45_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA45_5 = input.LA(1);

                         
                        int index45_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_ruleset()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index45_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA45_6 = input.LA(1);

                         
                        int index45_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_ruleset()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index45_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA45_7 = input.LA(1);

                         
                        int index45_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_ruleset()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index45_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA45_8 = input.LA(1);

                         
                        int index45_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_ruleset()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index45_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA45_9 = input.LA(1);

                         
                        int index45_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_ruleset()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index45_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA45_10 = input.LA(1);

                         
                        int index45_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_ruleset()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index45_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA45_11 = input.LA(1);

                         
                        int index45_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_ruleset()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index45_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA45_12 = input.LA(1);

                         
                        int index45_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_ruleset()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index45_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA45_13 = input.LA(1);

                         
                        int index45_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_ruleset()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index45_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA45_14 = input.LA(1);

                         
                        int index45_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_ruleset()) ) {s = 15;}

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
            "\2\4\5\uffff\1\4\6\uffff\1\4\1\uffff\1\4\44\uffff\1\4\15\uffff"+
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
            return "358:1: unary_expr options {backtrack=true; } : ( 'not' unary_expr | 'seen' STRING 'in' var_domain ':' ID timeframe | 'seen' STRING ( 'before' | 'after' ) STRING 'in' var_domain ':' ID | var_domain ':' ID predop expr timeframe | var_domain ':' ID timeframe | operator_expr );";
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
                        if ( (synpred94_ruleset()) ) {s = 15;}

                        else if ( (synpred96_ruleset()) ) {s = 16;}

                         
                        input.seek(index51_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA51_3 = input.LA(1);

                         
                        int index51_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred97_ruleset()) ) {s = 17;}

                        else if ( (synpred98_ruleset()) ) {s = 18;}

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
            "\1\6\1\1\5\uffff\1\2\6\uffff\1\3\1\uffff\1\13\44\uffff\1\14"+
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
            return "372:1: factor options {backtrack=true; } : ( INT | STRING | REGEXP | 'true' | 'false' | ID '[' expr ']' | persistent_var | trail_exp | function_app | '[' expr ',' ']' | '{' ( hash_line ( ',' )? )* '}' | ID | '(' expr ')' );";
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
                        if ( (synpred105_ruleset()) ) {s = 13;}

                        else if ( (synpred108_ruleset()) ) {s = 14;}

                        else if ( (synpred113_ruleset()) ) {s = 15;}

                         
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
    static final String DFA69_eotS =
        "\12\uffff";
    static final String DFA69_eofS =
        "\12\uffff";
    static final String DFA69_minS =
        "\1\u00a1\6\uffff\1\123\2\uffff";
    static final String DFA69_maxS =
        "\1\u00b4\6\uffff\1\u00ac\2\uffff";
    static final String DFA69_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\7\1\10";
    static final String DFA69_specialS =
        "\12\uffff}>";
    static final String[] DFA69_transitionS = {
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

    static final short[] DFA69_eot = DFA.unpackEncodedString(DFA69_eotS);
    static final short[] DFA69_eof = DFA.unpackEncodedString(DFA69_eofS);
    static final char[] DFA69_min = DFA.unpackEncodedStringToUnsignedChars(DFA69_minS);
    static final char[] DFA69_max = DFA.unpackEncodedStringToUnsignedChars(DFA69_maxS);
    static final short[] DFA69_accept = DFA.unpackEncodedString(DFA69_acceptS);
    static final short[] DFA69_special = DFA.unpackEncodedString(DFA69_specialS);
    static final short[][] DFA69_transition;

    static {
        int numStates = DFA69_transitionS.length;
        DFA69_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA69_transition[i] = DFA.unpackEncodedString(DFA69_transitionS[i]);
        }
    }

    class DFA69 extends DFA {

        public DFA69(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 69;
            this.eot = DFA69_eot;
            this.eof = DFA69_eof;
            this.min = DFA69_min;
            this.max = DFA69_max;
            this.accept = DFA69_accept;
            this.special = DFA69_special;
            this.transition = DFA69_transition;
        }
        public String getDescription() {
            return "481:1: pragma : ( desc_block | 'name' STRING | 'author' STRING | 'key' ( 'errorstack' | 'googleanalytics' | 'twitter' | 'amazon' | 'kpds' | 'google' | ID ) key_value | authz_pragma | logging_pargma | 'use' 'module' ID ( alias )? | 'use' ( 'css' | 'javascript' ) 'resource' location );";
        }
    }
 

    public static final BitSet FOLLOW_19_in_ruleset670 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rulesetname_in_ruleset672 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleset674 = new BitSet(new long[]{0x0000000000600000L,0x0000000000010000L,0x0000000120000000L});
    public static final BitSet FOLLOW_meta_block_in_ruleset682 = new BitSet(new long[]{0x0000000000600000L,0x0000000000010000L,0x0000000120000000L});
    public static final BitSet FOLLOW_dispatch_block_in_ruleset690 = new BitSet(new long[]{0x0000000000600000L,0x0000000000010000L,0x0000000120000000L});
    public static final BitSet FOLLOW_global_decls_in_ruleset697 = new BitSet(new long[]{0x0000000000600000L,0x0000000000010000L,0x0000000120000000L});
    public static final BitSet FOLLOW_rule_in_ruleset705 = new BitSet(new long[]{0x0000000000600000L,0x0000000000010000L,0x0000000120000000L});
    public static final BitSet FOLLOW_21_in_ruleset713 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_ruleset715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_rulesetname0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule774 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_rule776 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rule778 = new BitSet(new long[]{0x00E0000000000000L});
    public static final BitSet FOLLOW_rule_state_in_rule780 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rule782 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_select_in_rule785 = new BitSet(new long[]{0xC000000020000010L,0x0000000000000001L,0x0000000000000100L});
    public static final BitSet FOLLOW_pre_block_in_rule787 = new BitSet(new long[]{0xC000000020000010L,0x0000000000000001L,0x0000000000000100L});
    public static final BitSet FOLLOW_emit_block_in_rule790 = new BitSet(new long[]{0xC000000020000010L,0x0000000000000001L,0x0000000000000100L});
    public static final BitSet FOLLOW_action_in_rule794 = new BitSet(new long[]{0x000000004F200000L});
    public static final BitSet FOLLOW_24_in_rule796 = new BitSet(new long[]{0x000000004E200000L});
    public static final BitSet FOLLOW_callbacks_in_rule800 = new BitSet(new long[]{0x000000000E200000L});
    public static final BitSet FOLLOW_post_block_in_rule803 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rule807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_post_in_post_block821 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_post_block823 = new BitSet(new long[]{0x000385A000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_post_statement_in_post_block825 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_post_block827 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_post_block829 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_post_block831 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_post_alternate_in_post_block833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_post0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_post_alternate864 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_post_alternate866 = new BitSet(new long[]{0x000385A000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_post_statement_in_post_alternate868 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_post_alternate870 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_post_alternate872 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_post_alternate874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_persistent_expr_in_post_statement881 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_post_statement884 = new BitSet(new long[]{0x0200000000140830L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_post_statement886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_log_statement_in_post_statement893 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_post_statement896 = new BitSet(new long[]{0x0200000000140830L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_post_statement898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_control_statement_in_post_statement905 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_post_statement908 = new BitSet(new long[]{0x0200000000140830L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_post_statement910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_raise_statement_in_post_statement917 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_post_statement920 = new BitSet(new long[]{0x0200000000140830L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_post_statement922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_callbacks934 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_callbacks936 = new BitSet(new long[]{0x0000000180200000L});
    public static final BitSet FOLLOW_success_in_callbacks938 = new BitSet(new long[]{0x0000000100200000L});
    public static final BitSet FOLLOW_failure_in_callbacks941 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_callbacks944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_success951 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_success953 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_click_in_success955 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_24_in_success957 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_success960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_failure967 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_failure969 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_click_in_failure971 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_24_in_failure973 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_failure978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_click985 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_click993 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_click995 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_click997 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_click_link_in_click999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_click_link1007 = new BitSet(new long[]{0x000005A000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_persistent_expr_in_click_link1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_persistent_clear_in_persistent_expr1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_persistent_set_in_persistent_expr1024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_persistent_iterate_in_persistent_expr1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_trail_forget_in_persistent_expr1038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_trail_mark_in_persistent_expr1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_persistent_clear1053 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_var_domain_in_persistent_clear1055 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_persistent_clear1057 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_persistent_clear1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_persistent_set1066 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_var_domain_in_persistent_set1068 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_persistent_set1070 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_persistent_set1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_domain_in_persistent_iterate1079 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_persistent_iterate1081 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_persistent_iterate1083 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_counter_op_in_persistent_iterate1085 = new BitSet(new long[]{0x0200000000140830L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_persistent_iterate1087 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_counter_start_in_persistent_iterate1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_trail_forget1096 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_trail_forget1098 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_trail_forget1100 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_var_domain_in_trail_forget1102 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_trail_forget1104 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_trail_forget1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_trail_mark1113 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_var_domain_in_trail_mark1115 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_trail_mark1117 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_trail_mark1119 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_trail_with_in_trail_mark1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_trail_with1128 = new BitSet(new long[]{0x0200000000140830L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_trail_with1130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_counter_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_counter_start1159 = new BitSet(new long[]{0x0200000000140830L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_counter_start1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_log_statement1169 = new BitSet(new long[]{0x0200000000140830L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_log_statement1171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_control_statement1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_raise_statement1185 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_raise_statement1187 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_raise_statement1189 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_raise_statement1191 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_for_clause_in_raise_statement1193 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_modifier_clause_in_raise_statement1195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_for_clause1202 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_for_clause1204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_rule_state0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_action_in_action1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unconditional_action_in_action1280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_conditional_action1294 = new BitSet(new long[]{0x0200000000140830L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_conditional_action1296 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_conditional_action1298 = new BitSet(new long[]{0xC000000020000010L,0x0000000000000001L,0x0000000000000100L});
    public static final BitSet FOLLOW_unconditional_action_in_conditional_action1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primrule_in_unconditional_action1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actionblock_in_unconditional_action1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule_label_in_primrule1332 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_namespace_in_primrule1335 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_primrule1338 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_primrule1340 = new BitSet(new long[]{0x0A00000000140830L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_primrule1343 = new BitSet(new long[]{0x0E00000000140830L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_58_in_primrule1345 = new BitSet(new long[]{0x0A00000000140830L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_59_in_primrule1350 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_modifier_clause_in_primrule1352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule_label_in_primrule1365 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_emit_block_in_primrule1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_rule_label1391 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_rule_label1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_modifier_clause1418 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_modifierx_in_modifier_clause1420 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_modifier_clause1423 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_modifierx_in_modifier_clause1425 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_ID_in_modifierx1444 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_modifierx1446 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_modifierx1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_modifierx1459 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_modifierx1461 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_JS_in_modifierx1463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blocktype_in_actionblock1479 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_actionblock1481 = new BitSet(new long[]{0x0000000000200010L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_primrule_in_actionblock1484 = new BitSet(new long[]{0x0000000001200010L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_24_in_actionblock1486 = new BitSet(new long[]{0x0000000000200010L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_21_in_actionblock1491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_blocktype0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_pre_block1533 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_pre_block1535 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_decl_in_pre_block1538 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_24_in_pre_block1540 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_pre_block1544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_foreach1564 = new BitSet(new long[]{0x0200000000140830L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_foreach1566 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_setting_in_foreach1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_select1587 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_using_in_select1590 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_when_in_select1592 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_foreach_in_select1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_using1609 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_using1611 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_setting_in_using1613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_when1620 = new BitSet(new long[]{0x0200000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_event_seq_in_when1622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_event_or_in_event_seq1643 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_event_seq1645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_event_or_in_event_seq1650 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_event_seq1652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_event_or_in_event_seq1657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_event_and_in_event_or1668 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_event_or1671 = new BitSet(new long[]{0x0200000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_event_and_in_event_or1673 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_event_btwn_in_event_and1684 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_event_and1687 = new BitSet(new long[]{0x0200000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_event_btwn_in_event_and1689 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_event_prim_in_event_btwn1702 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_event_btwn1705 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_event_btwn1708 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_event_btwn1710 = new BitSet(new long[]{0x0200000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_event_seq_in_event_btwn1712 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_event_btwn1714 = new BitSet(new long[]{0x0200000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_event_seq_in_event_btwn1716 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_event_btwn1718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_event_domain_in_event_prim1733 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_event_prim1735 = new BitSet(new long[]{0x0000000000040800L});
    public static final BitSet FOLLOW_set_in_event_prim1737 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_setting_in_event_prim1743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_event_domain_in_event_prim1748 = new BitSet(new long[]{0x0000000600000000L,0x0000000000001C00L});
    public static final BitSet FOLLOW_set_in_event_prim1750 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_event_prim1762 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_on_expr_in_event_prim1764 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_setting_in_event_prim1767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_event_prim1772 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_event_prim1774 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_event_filter_in_event_prim1776 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_setting_in_event_prim1778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_event_prim1783 = new BitSet(new long[]{0x0200000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_event_seq_in_event_prim1785 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_event_prim1787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_setting1798 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_setting1800 = new BitSet(new long[]{0x0800000000000010L});
    public static final BitSet FOLLOW_ID_in_setting1803 = new BitSet(new long[]{0x0C00000000000010L});
    public static final BitSet FOLLOW_58_in_setting1805 = new BitSet(new long[]{0x0800000000000010L});
    public static final BitSet FOLLOW_59_in_setting1810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_event_domain1820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_event_filter1834 = new BitSet(new long[]{0x0000000000040800L});
    public static final BitSet FOLLOW_set_in_event_filter1836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_on_expr1854 = new BitSet(new long[]{0x0000000000040800L});
    public static final BitSet FOLLOW_set_in_on_expr1856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_global_decls1880 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_global_decls1882 = new BitSet(new long[]{0x0000000000000010L,0x00000000000A0000L,0x0000000000000300L});
    public static final BitSet FOLLOW_global_in_global_decls1886 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_global_decls1888 = new BitSet(new long[]{0x0000000000200010L,0x00000000000A0000L,0x0000000000000300L});
    public static final BitSet FOLLOW_21_in_global_decls1893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emit_block_in_global1909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dataset_in_global1913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_datasource_in_global1917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_css_emit_in_global1921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decl_in_global1925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_datasource1937 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_datasource1939 = new BitSet(new long[]{0x0000004000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_datatype_in_datasource1941 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_datasource1944 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_datasource1946 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_cachable_in_datasource1948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_css_emit1960 = new BitSet(new long[]{0x0000000000010800L});
    public static final BitSet FOLLOW_set_in_css_emit1962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_decl1996 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_decl1998 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_HTML_in_decl2000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_decl2005 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_decl2007 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_JS_in_decl2009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_decl2014 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_decl2016 = new BitSet(new long[]{0x0200000000140830L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_decl2018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_def_in_expr2048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_expression_in_expr2052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_function_def2077 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_function_def2079 = new BitSet(new long[]{0x0800000000000010L});
    public static final BitSet FOLLOW_ID_in_function_def2082 = new BitSet(new long[]{0x0C00000000000010L});
    public static final BitSet FOLLOW_58_in_function_def2084 = new BitSet(new long[]{0x0800000000000010L});
    public static final BitSet FOLLOW_59_in_function_def2089 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_function_def2091 = new BitSet(new long[]{0x0200000000140830L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_fundecls_in_function_def2093 = new BitSet(new long[]{0x0200000000140830L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_function_def2096 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_24_in_function_def2098 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_function_def2101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decl_in_fundecls2125 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_fundecls2127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_disjunction_in_conditional_expression2153 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_conditional_expression2155 = new BitSet(new long[]{0x0200000000140830L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_conditional_expression2157 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_conditional_expression2159 = new BitSet(new long[]{0x0200000000140830L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_conditional_expression2161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_disjunction_in_conditional_expression2165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conjunction_in_disjunction2178 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_disjunction2181 = new BitSet(new long[]{0x0200000000140830L,0x0000374000000080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_conjunction_in_disjunction2183 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_equality_expr_in_conjunction2199 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_conjunction2202 = new BitSet(new long[]{0x0200000000140830L,0x0000374000000080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_equality_expr_in_conjunction2204 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_add_expr_in_equality_expr2219 = new BitSet(new long[]{0x0000000000000002L,0x00000001FF000000L});
    public static final BitSet FOLLOW_predop_in_equality_expr2222 = new BitSet(new long[]{0x0200000000140830L,0x0000374000000080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_add_expr_in_equality_expr2224 = new BitSet(new long[]{0x0000000000000002L,0x00000001FF000000L});
    public static final BitSet FOLLOW_set_in_predop0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mult_expr_in_add_expr2279 = new BitSet(new long[]{0x0000000000000002L,0x0000000600000000L});
    public static final BitSet FOLLOW_add_op_in_add_expr2282 = new BitSet(new long[]{0x0200000000140830L,0x0000374000000080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_mult_expr_in_add_expr2284 = new BitSet(new long[]{0x0000000000000002L,0x0000000600000000L});
    public static final BitSet FOLLOW_set_in_add_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_expr_in_mult_expr2306 = new BitSet(new long[]{0x0000000000000002L,0x0000003800000000L});
    public static final BitSet FOLLOW_mult_op_in_mult_expr2309 = new BitSet(new long[]{0x0200000000140830L,0x0000374000000080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_unary_expr_in_mult_expr2311 = new BitSet(new long[]{0x0000000000000002L,0x0000003800000000L});
    public static final BitSet FOLLOW_set_in_mult_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_unary_expr2346 = new BitSet(new long[]{0x0200000000140830L,0x0000374000000080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_unary_expr_in_unary_expr2348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_unary_expr2354 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_unary_expr2356 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_unary_expr2358 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_var_domain_in_unary_expr2360 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_unary_expr2362 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_unary_expr2364 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_timeframe_in_unary_expr2366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_unary_expr2371 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_unary_expr2373 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000020L});
    public static final BitSet FOLLOW_set_in_unary_expr2375 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_unary_expr2383 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_unary_expr2385 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_var_domain_in_unary_expr2387 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_unary_expr2389 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_unary_expr2391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_domain_in_unary_expr2396 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_unary_expr2398 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_unary_expr2400 = new BitSet(new long[]{0x0000000000000000L,0x00000001FF000000L});
    public static final BitSet FOLLOW_predop_in_unary_expr2402 = new BitSet(new long[]{0x0200000000140830L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_unary_expr2404 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_timeframe_in_unary_expr2406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_domain_in_unary_expr2411 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_unary_expr2413 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_unary_expr2415 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_timeframe_in_unary_expr2417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operator_expr_in_unary_expr2422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_operator_expr2436 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_operator_in_operator_expr2438 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_INT_in_factor2463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_factor2473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REGEXP_in_factor2483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_factor2493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_factor2503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_factor2513 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_factor2515 = new BitSet(new long[]{0x0200000000140830L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_factor2517 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_factor2519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_persistent_var_in_factor2529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_trail_exp_in_factor2539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_app_in_factor2549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_factor2559 = new BitSet(new long[]{0x0200000000140830L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_factor2561 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_factor2563 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_factor2565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_factor2575 = new BitSet(new long[]{0x0000000000200800L});
    public static final BitSet FOLLOW_hash_line_in_factor2578 = new BitSet(new long[]{0x0400000000200800L});
    public static final BitSet FOLLOW_58_in_factor2580 = new BitSet(new long[]{0x0000000000200800L});
    public static final BitSet FOLLOW_21_in_factor2585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_factor2595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_factor2606 = new BitSet(new long[]{0x0200000000140830L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_factor2608 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_factor2610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_hash_line2623 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_hash_line2625 = new BitSet(new long[]{0x0200000000140830L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_hash_line2627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namespace_in_function_app2640 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_function_app2642 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_function_app2644 = new BitSet(new long[]{0x0A00000000140830L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_function_app2647 = new BitSet(new long[]{0x0E00000000140830L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_58_in_function_app2649 = new BitSet(new long[]{0x0A00000000140830L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_59_in_function_app2654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_function_app2660 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_function_app2662 = new BitSet(new long[]{0x0A00000000140830L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_function_app2665 = new BitSet(new long[]{0x0E00000000140830L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_58_in_function_app2667 = new BitSet(new long[]{0x0A00000000140830L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_59_in_function_app2672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_namespace2684 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_namespace2686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_trail_exp2698 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_var_domain_in_trail_exp2700 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_trail_exp2702 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_trail_exp2704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_trail_exp2709 = new BitSet(new long[]{0x0200000000140830L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_trail_exp2711 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_var_domain_in_trail_exp2713 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_trail_exp2715 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_trail_exp2717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_domain_in_persistent_var2731 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_persistent_var2733 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_persistent_var2735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_operator2747 = new BitSet(new long[]{0x0000000000000000L,0xFFFF800000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_operator_op_in_operator2749 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_operator2751 = new BitSet(new long[]{0x0200000000140830L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_operator2753 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_58_in_operator2755 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_operator2758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operator_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_timeframe2868 = new BitSet(new long[]{0x0200000000140830L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_timeframe2870 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000001FFF8000L});
    public static final BitSet FOLLOW_periods_in_timeframe2873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_period_in_timeframe2877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_var_domain0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_emit_block2904 = new BitSet(new long[]{0x0000000000030800L});
    public static final BitSet FOLLOW_set_in_emit_block2906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_dataset2924 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_dataset2926 = new BitSet(new long[]{0x0000004000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_datatype_in_dataset2928 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_dataset2931 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_dataset2933 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_cachable_in_dataset2935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_datatype2945 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000003C00L});
    public static final BitSet FOLLOW_set_in_datatype2947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_142_in_cachable2964 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_cachetime_in_cachable2966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_cachetime2977 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_INT_in_cachetime2979 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000001FFF8000L});
    public static final BitSet FOLLOW_periods_in_cachetime2982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_period_in_cachetime2984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_periods0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_period0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_157_in_dispatch_block3119 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_dispatch_block3121 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_dispatch_in_dispatch_block3123 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_21_in_dispatch_block3126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_158_in_dispatch3135 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_dispatch3137 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_dispatch_target_in_dispatch3139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_159_in_dispatch_target3150 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_dispatch_target3152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_160_in_meta_block3175 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_meta_block3177 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000000L,0x0012440E00000000L});
    public static final BitSet FOLLOW_pragma_in_meta_block3179 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000000L,0x0012440E00000000L});
    public static final BitSet FOLLOW_21_in_meta_block3183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_desc_block_in_pragma3197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_161_in_pragma3201 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_pragma3203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_162_in_pragma3207 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_pragma3209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_163_in_pragma3213 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000000L,0x000003F000000000L});
    public static final BitSet FOLLOW_set_in_pragma3215 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_key_value_in_pragma3233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_authz_pragma_in_pragma3239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logging_pargma_in_pragma3244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_170_in_pragma3249 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_171_in_pragma3251 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_pragma3253 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_alias_in_pragma3255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_170_in_pragma3261 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000100000000000L});
    public static final BitSet FOLLOW_set_in_pragma3263 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_173_in_pragma3271 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_location_in_pragma3273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_174_in_authz_pragma3285 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_175_in_authz_pragma3287 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_176_in_authz_pragma3289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_177_in_logging_pargma3301 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L,0x0004000000000000L});
    public static final BitSet FOLLOW_set_in_logging_pargma3303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_179_in_alias3318 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_alias3320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_location0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_180_in_desc_block3342 = new BitSet(new long[]{0x0000000000010800L});
    public static final BitSet FOLLOW_set_in_desc_block3344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_key_value3362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_value_pair_in_key_value3366 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_STRING_in_name_value_pair3382 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_name_value_pair3384 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_set_in_name_value_pair3386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_event_or_in_synpred46_ruleset1643 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_synpred46_ruleset1645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_event_or_in_synpred47_ruleset1650 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_synpred47_ruleset1652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_disjunction_in_synpred76_ruleset2153 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_synpred76_ruleset2155 = new BitSet(new long[]{0x0200000000140830L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_synpred76_ruleset2157 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_synpred76_ruleset2159 = new BitSet(new long[]{0x0200000000140830L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_synpred76_ruleset2161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_synpred94_ruleset2354 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_synpred94_ruleset2356 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_synpred94_ruleset2358 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_var_domain_in_synpred94_ruleset2360 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_synpred94_ruleset2362 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_synpred94_ruleset2364 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_timeframe_in_synpred94_ruleset2366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_synpred96_ruleset2371 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_synpred96_ruleset2373 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000020L});
    public static final BitSet FOLLOW_set_in_synpred96_ruleset2375 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_synpred96_ruleset2383 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_synpred96_ruleset2385 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_var_domain_in_synpred96_ruleset2387 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_synpred96_ruleset2389 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_synpred96_ruleset2391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_domain_in_synpred97_ruleset2396 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_synpred97_ruleset2398 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_synpred97_ruleset2400 = new BitSet(new long[]{0x0000000000000000L,0x00000001FF000000L});
    public static final BitSet FOLLOW_predop_in_synpred97_ruleset2402 = new BitSet(new long[]{0x0200000000140830L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_synpred97_ruleset2404 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_timeframe_in_synpred97_ruleset2406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_domain_in_synpred98_ruleset2411 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_synpred98_ruleset2413 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_synpred98_ruleset2415 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_timeframe_in_synpred98_ruleset2417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_synpred105_ruleset2513 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_synpred105_ruleset2515 = new BitSet(new long[]{0x0200000000140830L,0x0000374000100080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_expr_in_synpred105_ruleset2517 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_synpred105_ruleset2519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_app_in_synpred108_ruleset2549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_synpred113_ruleset2595 = new BitSet(new long[]{0x0000000000000002L});

}