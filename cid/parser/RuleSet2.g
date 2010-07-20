grammar RuleSet2;
options {
  output=AST;
//  backtrack=true;
//  memoize=true;
//  language=C;
//  ASTLabelType=pANTLR3_BASE_TREE;

}


// Handle Escaping in string http://stackoverflow.com/questions/504402/how-to-handle-escape-sequences-in-string-literals-in-antlr-3


@header {
	package com.kynetx;
	import java.util.HashMap;
	import java.util.ArrayList;
//	import org.json.*;
}
@lexer::header {
	package com.kynetx;
}

@members { 
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
}


		
fragment predop: '<=' | '>=' | '<' | '>' | '==' | '!=' | 'eq' | 'neq' | 'like';		
	
fragment add_op: '+'|'-';

	
VAR  :	('a'..'z'|'A'..'Z')+
    ;


INT :	'0'..'9'+
    ;

FLOAT
    :   ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    |   '.' ('0'..'9')+ EXPONENT?
    |   ('0'..'9')+ EXPONENT
    ;
    
//NUM 	
//    : INT 
//    | FLOAT
//   ;

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

STRING
    :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    ;

fragment REGEXP 
	:
	'\/' ( options {greedy=false;} : . )*  '\/' 
	| '#' ( options {greedy=false;} : . )*  '#' 
	;
	
//	: '<<' ( ~('\\<') )* '>>'
HTML 	
	: '<<' ( options {greedy=false;} : . )* '>>'
	;

JS 	
	: '<|' ( options {greedy=false;} : . )* '|>'
	;

fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;


fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;



/*

 ruleset <name> { 
 } 
 
*/ 
ruleset  options {backtrack=false;}
@init {
 	 rule_json.put("global",new ArrayList());
 	 rule_json.put("dispatch",new ArrayList());
 	 rule_json.put("rules",new ArrayList());
 	 rule_json.put("meta", new HashMap());
	 current_top = rule_json;
}
@after  { 
	current_top = null; 
}
 	:   	
 	must_be["ruleset"] 
 	rulesetname { current_top.put("ruleset_name",$rulesetname.text); } 
 	'{' 
 	( meta_block | dispatch_block | global_block | rule )+
	'}' 
	EOF
 	;
 	
must_be[String what] 
 	: 	
 	v=VAR { cn($v.text, sar($what),input); } 
 	;

must_be_one[String[\] what]  
 	: 	
 	v=VAR { cn($v.text,what,input); } 
 	;
	
rulesetname 
	: VAR (VAR|INT)*
	; 	 
/*

 rule <name> is <active|inactive|test> {

 } 
  
*/ 
rule	: 	must_be["rule"]
		VAR 
		must_be["is"]
		must_be_one[sar("active","inactive","test")]
		'{'
		( select=VAR { cn($select.text, sar("select"),input); } (using|when) foreach?) pre_block? (action) callbacks? post_block?
		'}' 
	; 
	
	
post_block: must_be_one[sar("fired","always","notfired")] '{' post_statement ';' ';' '}' post_alternate;


post_alternate: must_be["else"] '{' post_statement ';' ';' '}';

post_statement
	: (persistent_expr 
	| log_statement 
  	| raise_statement
  	| 'last')
	(must_be["if"] expr)?
  	;
	
	
callbacks: 'callbacks' '{' success? failure? '}';

success: 'success' '{' click ';'? '}';

failure: 'failure' '{' click ';'?   '}';

click: ('click' | 'change') VAR '=' STRING click_link?;

click_link:  must_be["triggers"] persistent_expr;


persistent_expr: persistent_clear
   | persistent_set
   | persistent_iterate
   | trail_forget
   | trail_mark;


persistent_clear: 'clear'  var_domain ':' VAR;

persistent_set: 'set'  var_domain ':' VAR;

persistent_iterate: var_domain ':' VAR counter_op expr counter_start;

trail_forget: 'forget'  STRING must_be["in"]  var_domain ':' VAR;

trail_mark: 'mark' var_domain ':' VAR trail_with;

trail_with: 'with' expr;


counter_op: '+='
          | '-=';

counter_start: must_be["from"] expr;

log_statement: must_be["log"]  expr;


raise_statement: must_be["raise"] must_be["explicit"] must_be["event"]  VAR for_clause modifier_clause;
  
for_clause: must_be["for"]  VAR;
		

action 
	: ((conditional_action)=> conditional_action | unconditional_action) ';'?
	;
	
	
conditional_action
	: 'if' expr 'then' unconditional_action	
	;

unconditional_action  
	: (at=VAR{  cn($at.text, sar("choose","every"),input); })? 
	 '{' (primrule (';' primrule)*) ';'? '}'
	| primrule 
	; 
	
primrule 
	:  (VAR '=>')? (
		 namespace? VAR '(' (expr (',' expr)?)*  ')' modifier_clause?
	|	emit_block )
	
	;		

	
using	:	'using' STRING setting;

setting :	'setting' '(' (VAR (',' VAR )?)* ')';

when	:  'when' event_seq;


modifier_clause 
	:  'with' modifier ('and' modifier)*
	;
	
modifier 
	: VAR '=' (expr | JS)		
	;
	
	
pre_block
@init {
	ArrayList tmp = new ArrayList();
}	:
	 'pre' '{' (decl[tmp] (';' decl[tmp])?)? '}'
	 ;

          
foreach: 
	'foreach' expr setting
	;         

event_seq  options { backtrack = true; }
	:	event_or 'then'|
		event_or 'before'|
		event_or 
	;	
	
	
	

event_or:	event_and ('or' event_and)*;

event_and
	:	event_btwn ('and' event_btwn)*
	;

event_btwn
	:	event_prim ('not') 'between' '(' event_seq ',' event_seq ')';
	 	
 	
event_prim
	:	event_domain 'pageview' (STRING|REGEXP) setting |
	event_domain ('submit'|'click'|'dblclick'|'change'|'update') STRING on_expr  setting |
	VAR VAR event_filter setting |
	'(' event_seq ')'
	;


event_filter  
	: VAR (STRING | REGEXP)
	;	 

on_expr : 'on' (STRING|REGEXP)	
	; 
	
	 
event_domain 
	:	'web'
	;			
 	











































	
global_block 
@init {
	 ArrayList global_block_array = (ArrayList)rule_json.get("global");
	 boolean found_cache = false;
}
@after  {
}	
	: 'global' '{' 
	( emt=emit_block {
		HashMap tmp = new HashMap(); 
		tmp.put("emit",$emt.emit_value);
		global_block_array.add(tmp);
	} 
	| dst=('dataset' |'datasource') name=VAR (':' dtype=('JSON'|'XML'|'RSS'|'HTML'))? '<-' src=STRING (cas=cachable {found_cache =true; })?  {
	
		HashMap tmp = new HashMap(); 
		tmp.put("type",$dst.text);	
		tmp.put("name",$name.text);
		tmp.put("datatype","JSON");
		if($dtype.text != null)
		{
			tmp.put("datatype",$dtype.text);
		}
		tmp.put("source",strip_string($src.text));
		if(found_cache)
		{
			if($cas.what instanceof HashMap)
			{
				tmp.put("cachable",$cas.what);
			}
			else if($cas.what instanceof Integer)
			{
				tmp.put("cachable",((Integer)$cas.what).intValue());
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
	| css_emit {
		HashMap tmp = new HashMap(); 
		tmp.put("content",$emt.emit_value);
		tmp.put("type","css");
		global_block_array.add(tmp);
	} 
	| decl[global_block_array]
	| ';')+  '}'
	;	

//	VAR '=' HTML |
//	VAR '=' JS |
//	VAR '=' expr  	

decl[ArrayList  block_array]  
@init {
}
	:
	var=VAR '=' val=HTML { 
		HashMap tmp = new HashMap(); 
		tmp.put("rhs",strip_wrappers("<<",">>",$val.text));
		tmp.put("type","here_doc");
		tmp.put("lhs",$var.text);
		block_array.add(tmp);
	 } 
	| var=VAR '=' val=JS { 
		HashMap tmp = new HashMap(); 
		tmp.put("rhs",strip_wrappers("<|","|>",$val.text));
		tmp.put("type","JS");
		tmp.put("lhs",$var.text);
		block_array.add(tmp);
	} 
	| var=VAR '=' e=expr { 
		HashMap tmp = new HashMap(); 
		tmp.put("lhs",$var.text);
		tmp.put("type","expr");
		tmp.put("rhs",$e.result);		
		block_array.add(tmp);		
	}
	;	


//expr options : function_def | conditional_expression	

expr returns[Object result]
@init {
	HashMap result_hash = new HashMap();
}
	: fd=function_def {
		$result = $fd.result;
	}
	| c=conditional_expression {
		$result = $c.result;
	}
	;	
	
function_def returns[Object result]
@init {
	ArrayList block_array = new ArrayList();
}
	: 'function' '(' args+=VAR? (',' args+=VAR )* ')' '{' decs+=decl[block_array]? (';' decs+=decl[block_array])* ';'? e1=expr '}' {
		HashMap tmp = new HashMap();
		ArrayList nargs = new ArrayList();
		for(int i = 0;i< $args.size();i++)
		{
			nargs.add(((Token)$args.get(i)).getText());
		}
		tmp.put("vars",nargs);
		tmp.put("type","function");
		if(block_array.size() != 0)
			tmp.put("decls",block_array);
		if($e1.text != null)
			tmp.put("expr",$e1.result);	
				
		$result = tmp;		
	}
	;	

	
conditional_expression returns[Object result]
	:  d=disjunction ('=>' expr '|' expr)?
	   { $result = $d.result; }
	;	
	

disjunction returns[Object result]
@init {
	boolean found_op = false;
	ArrayList result = new ArrayList();
}
	: me1=conjunction (op='||' me2=conjunction{
		found_op = true;
		if(result.isEmpty())
		{
			 add_to_expression(result,"pred",$op.text,$me1.result);
			 add_to_expression(result,"pred",$op.text,$me2.result);
		}			 
		else
			 add_to_expression(result,"pred",$op.text,$me2.result);

	})* {
		if(found_op)
			$result = build_exp_result(result); 
		else
			$result = $me1.result;
	}
	;	
	
conjunction returns[Object result]
@init {
	boolean found_op = false;
	ArrayList result = new ArrayList();
}	 
	: me1=equality_expr (op='&&' me2=equality_expr {
		found_op = true;
		if(result.isEmpty())
		{
			 add_to_expression(result,"prim",$op.text,$me1.result);
			 add_to_expression(result,"prim",$op.text,$me2.result);
		}
		else
			 add_to_expression(result,"prim",$op.text,$me2.result);

	})*  { 
		if(found_op)
			$result = build_exp_result(result); 
		else
			$result = $me1.result;
	 }
	;
	
equality_expr returns[Object result]
@init {
	boolean found_op = false;
	ArrayList result = new ArrayList();
}	 
	: me1=add_expr (op=predop me2=add_expr {
		found_op = true;
		if(result.isEmpty())
		{
			 add_to_expression(result,"prim",$op.text,$me1.result);
			 add_to_expression(result,"prim",$op.text,$me2.result);
		}
		else
			 add_to_expression(result,"prim",$op.text,$me2.result);
	})* { 
		if(found_op)
			$result = build_exp_result(result); 
		else
			$result = $me1.result;
	 }
	;
	 
	 
add_expr returns[Object result]
@init {
	boolean found_op = false;
	ArrayList result = new ArrayList();
}	 
	: me1=mult_expr (op=add_op me2=mult_expr  {
		found_op = true;
		if(result.isEmpty())
		{
			 add_to_expression(result,"prim",$op.text,$me1.result);
			 add_to_expression(result,"prim",$op.text,$me2.result);
		}
		else
			 add_to_expression(result,"prim",$op.text,$me2.result);
	}
	)*  { 
		if(found_op)
			$result = build_exp_result(result); 
		else
			$result = $me1.result;
 }
	;		


mult_op: '*'|'/'|'%';

mult_expr  returns[Object result]
@init {
	boolean found_op = false;
	ArrayList result = new ArrayList();
}	 
	: me1=unary_expr (op=mult_op me2=unary_expr
	{	
		found_op = true;
		if(result.isEmpty())
		{
			System.out.println("a oper " + $op.text);
			 add_to_expression(result,"prim",$op.text,$me1.result);
			 add_to_expression(result,"prim",$op.text,$me2.result);
		}
		else
		{
			System.out.println("b oper " + $op.text);
			 add_to_expression(result,"prim",$op.text,$me2.result);
		}
			 
	})*  { 
		if(found_op)
		{
			puts("Result Cound = " + result.size());
			$result = build_exp_result(result); 
			}
		else
			$result = $me1.result;
 }
	;


unary_expr  returns[Object result] options { backtrack = true; }
@init {
	check_operator = true;
}
	: 'not' unary_expr  
	| 'seen' STRING 'in' var_domain ':' VAR timeframe	
	| 'seen' STRING ('before' | 'after') STRING 'in' var_domain ':' VAR 
	| var_domain ':' VAR ( (predop expr)? timeframe 
	| var_domain ':' VAR timeframe 
	| {check_operator}? oe=operator_expr { $result = $oe.result; }
	;
	 

operator_expr returns[Object result]
@init 
{

}
	: f=factor {$result = $f.result;  }
	 operator*	
	;

fragment operator 
	: ('.pick'|'.match'|'.length'|'.replace'|'.as'|'.head'|'.tail'|'.sort'
      	|'.filter'|'.map'|'.uc'|'.lc' |'.split' | '.join' | '.query'
      	| '.has' | '.union' | '.difference' | '.intersection' | '.unique' | '.once'
      	| '.duplicates') '(' expr ','? ')'	
	;
//	 
		
// TODO: REGEX needs to be added      | REGEXP  	
factor returns[Object result] options { backtrack = true; }
@init {
      ArrayList exprs2 = new ArrayList();

}
	: v=INT { 
		HashMap tmp = new HashMap();
		tmp.put("type","num");
		tmp.put("val",Integer.parseInt($v.text));
		$result = tmp;
	}
      | v= STRING  { 
      		HashMap tmp = new HashMap();
		tmp.put("type","str");
		tmp.put("val",strip_string($v.text));
		$result = tmp;
	}    
      | v= ('true'| 'false')  { 
      		HashMap tmp = new HashMap();
		tmp.put("type","bool");
		tmp.put("val",$v.text);
		$result = tmp;
	}
      | v=VAR '[' e=expr ']'  { 
      		HashMap tmp = new HashMap();
		HashMap val = new HashMap();

		HashMap index = new HashMap();
		index.putAll((HashMap)$e.result);
		val.put("var_expr",$v.text);

		val.put("index",index);
		tmp.put("type","array_ref");

		tmp.put("val",val);
		$result = tmp;
      }
      | d=var_domain ':' v=VAR {
	      	HashMap tmp = new HashMap();
	      	tmp.put("domain",$d.text);
	      	tmp.put("name",$v.text);
	      	tmp.put("type","persistent");
	      	$result = tmp;
      }
      | 'current' d=var_domain ':' v=VAR {
      	      	HashMap tmp = new HashMap();
	      	tmp.put("domain",$d.text);
	      	tmp.put("name",$v.text);
	      	tmp.put("type","persistent");
	      	$result = tmp;
      } 
      | 'history' e=expr d=var_domain ':' v=VAR {
      	      	HashMap tmp = new HashMap();
	      	tmp.put("domain",$d.text);
	      	tmp.put("name",$v.text);
	      	tmp.put("type","trail_history");
      	      	HashMap tmp2 = new HashMap();
	      	tmp2.putAll((HashMap)$e.result);
	      	tmp.put("offset",tmp2);
	      	$result = tmp;
      }
      | n=namespace p=VAR '(' (e=expr {
            exprs2.add($e.result);
      	}
      	','?)* ')'  {
	      	HashMap tmp = new HashMap();
	      	tmp.put("predicate",$p.text);
	      	tmp.put("source",$n.text);
	      	tmp.put("args",exprs2);
	      	$result = tmp;
      }
      | v=VAR '(' (e=expr{
            exprs2.add($e.result);
      	}
	','?)* ')'	{
	      	HashMap tmp = new HashMap();
	      	tmp.put("type","app");
	      	HashMap tmp2 = new HashMap();
	      	tmp2.put("val",$v.text);
	      	tmp2.put("type","var");
	      	tmp.put("function_expr",tmp2);
	      	tmp.put("args",exprs2);
	      	$result = tmp;
      
      }
      | '[' e=expr {
      			exprs2.add($e.result);
      		 } (',' e2=expr{
      			exprs2.add($e2.result);
      		 })* ']' {
      			HashMap tmp = new HashMap();
      			tmp.put("val",exprs2);	
      			tmp.put("type","array");
      		 
	      	$result = tmp;
      }
      | '{' h1=hash_line {
      			exprs2.add($h1.result);
      		 } (',' h2=hash_line {
      			exprs2.add($h2.result);
      		 })* '}' {
      			HashMap tmp = new HashMap();
      			tmp.put("val",exprs2);	
      			tmp.put("type","hashraw");
      		 
	      	$result = tmp;
	}
      | v=VAR  { 
      		HashMap tmp = new HashMap();
		tmp.put("type","var");
		tmp.put("val",$v.text);
		$result = tmp;
}
      | '(' e=expr ')' { 
      		$result=$e.result; 
      	}     
	;	
fragment var_domain: 'ent' | 'app';	
	



fragment namespace returns[String result]
	: v=VAR ':'
	{
		$result = $v.text;
	}	
	;
	
	
timeframe
	:  'within' expr ( period)	 
	;
	
hash_line  returns[HashMap result] 
	: s=STRING ':' e=expr  {
		HashMap tmp = new HashMap();
		tmp.put("lhs",strip_string($s.text));
		tmp.put("rhs",$e.result);
//		tmp.put("val",$e.result);
		$result = tmp;
	}	
	;

css_emit returns[String emit_value]
	: 'css' ( h=HTML {$emit_value = strip_wrappers("<<",">>",$h.text);}
	|h=STRING {$emit_value = strip_string($h.text);}
	)
	;
	
fragment period 
	:	 
	  'years'
	| 'months'
	| 'weeks'
	| 'days'
      	| 'hours'
	| 'minutes'
      	| 'seconds'
      	| 'year'
	| 'month'
 	| 'week'
	| 'day'
	| 'hour'
	| 'minute'
 	| 'second'
 	;	
		
	
cachable returns[Object what]
@init {
	$what = null;
}
	: 
		ca='cachable' ('for' tm=INT per=period)? {
 			if($tm.text != null)
 			{
	 			$what = new HashMap();
	 			((HashMap)$what).put("value",$tm.text);
	 			((HashMap)$what).put("period",$per.text);	 			
	 		}
	 		else if($ca.text != null)
	 		{
	 			$what = new Integer(1);
	 		}
	 		else
	 		{
	 			$what = new Integer(0);
	 		}
 		}
	;	

	
	
emit_block  returns[String emit_value]
	: 'emit' ( h=HTML {$emit_value = strip_wrappers("<<",">>",$h.text);}
	|h=STRING {$emit_value = strip_string($h.text);}
	|h=JS {$emit_value = strip_wrappers("<|","|>",$h.text);}
	)
	;		
	
meta_block 
@init {
	 HashMap meta_block_hash = (HashMap)rule_json.get("meta");
	 ArrayList use_list = new ArrayList();
	 HashMap keys_map = new HashMap();
	 HashMap key_values = new HashMap();
}
@after  {
	if(!keys_map.isEmpty())
	{
		meta_block_hash.put("keys",keys_map);
	}
	if(!use_list.isEmpty())
	{
		meta_block_hash.put("use",use_list);
	}
}	
	: 'meta' '{' 
	(  name=must_be_one[sar("description","name","author")] (html_desc=HTML|string_desc=STRING) 	
		{ 
			if($string_desc.text != null)
				meta_block_hash.put($name.text,strip_string($string_desc.text)); 
			else
				meta_block_hash.put($name.text,strip_wrappers("<<",">>",$html_desc.text)); 
	
		} 
	 | 'key' what=must_be_one[sar("errorstack","googleanalytics","twitter","amazon","kpds","google")] (key_value=STRING | '{' (name_value_pair[key_values] (',' name_value_pair[key_values])*) '}') +  { 
		if(!key_values.isEmpty()) 
			keys_map.put($what.text,key_values); 
		else 
			keys_map.put($what.text,strip_string($key_value.text)); 
	}	
	| 'authz' 'require' 'user' {  
		HashMap tmp = new HashMap(); 
		tmp.put("level","user");
		tmp.put("type","required");
		meta_block_hash.put("authz",tmp);
	   } 
	| 'logging' onoff=('on'|'off') {  meta_block_hash.put("logging",$onoff.text); }
	| 'use' ( (rtype=('css'|'javascript') must_be["resource"] (url=STRING | nicename=VAR)    {
		HashMap tmp = new HashMap();  
		HashMap tmp2 = new HashMap();
		if($url.text != null)
		{
			tmp2.put("location",strip_string($url.text));
			tmp2.put("type","url");
		}
		else
		{ 
			tmp2.put("location",$nicename.text);
			tmp2.put("type","name");			
		} 
		tmp.put("resource",tmp2);
		
		tmp.put("name",$name.text);
		tmp.put("resource_type",$rtype.text);
		use_list.add(tmp);
	 })
	 	| ('module'  modname=VAR ('alias' alias=VAR)?) {
		HashMap tmp = new HashMap(); 
		tmp.put("name",$modname.text);
		tmp.put("type","module");
		if($alias.text != null) {
			tmp.put("alias",$alias.text);
		}
		use_list.add(tmp);
	 })
		)*
	 '}'  
	
	;
	
		
dispatch_block
@init {
	 ArrayList dispatch_block_array = (ArrayList)rule_json.get("dispatch");
}
@after  {
}	
	: must_be["dispatch"]  '{' (must_be["domain"] domain=STRING ('->' rsid=STRING)? {
		HashMap tmp = new HashMap();
		tmp.put("domain",strip_string($domain.text));
		if($rsid.text != null)
		{
			tmp.put("ruleset_id",strip_string($rsid.text));
		}
		dispatch_block_array.add(tmp);
		})* 
	'}'
	;

	

name_value_pair[HashMap key_values] 
@init {
	Object value = null;
}
	: k=STRING ':' (
		v=INT {value =$v.text;} 
		| v=FLOAT {value = $v.text;} 
		| v=STRING {value = strip_string($v.text);}) 
		{key_values.put(strip_string($k.text),value);}
	;
	
	