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
}
@lexer::header {
	package com.kynetx;
}

@members { 

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
}


		
fragment predop: '<=' | '>=' | '<' | '>' | '==' | '!=' | 'eq' | 'neq' | 'like';		
	
fragment add_op: '+'|'-';

fragment mult_op: '*'|'/'|'%';

VAR  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_')*
    ;

INT :	'0'..'9'+
    ;

FLOAT
    :   ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    |   '.' ('0'..'9')+ EXPONENT?
    |   ('0'..'9')+ EXPONENT
    ;
    
fragment NUM 	
    : INT 
    | FLOAT
    ;

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
 	:   'ruleset' rulesetname { current_top.put("ruleset_name",$rulesetname.text); } '{' 
 		( meta_block | dispatch_block | global_block )+
 	'}' EOF
 	;

rulesetname
	:  VAR | INT
	;
//	: 'global' '{' ( emit_block | dataset | datasource | css_emit | decl ';')+  '}'
	
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

expr returns[HashMap result]
@init {
	HashMap result_hash = new HashMap();

}
	: fd=function_def[result_hash] {
		$result = result_hash;
	}
	| conditional_expression[result_hash] {
//		result_hash.put(
		$result = result_hash;	
	}
	;	
	
function_def[HashMap  expr_hash]
@init {
		ArrayList block_array = new ArrayList();

}
	: 'function' '(' v1=VAR? (',' v2=VAR )* ')' '{' d1=decl[block_array]? (';' d2=decl[block_array])* ';'? e1=expr '}' {
	}
	;	

	
conditional_expression[HashMap expr_hash] 
	:  disjunction[expr_hash] ('=>' expr '|' expr)?
	;	
	

disjunction[HashMap expr_hash] 
	: conjunction[expr_hash] ('||' conjunction[expr_hash])*
	;	
	
conjunction[HashMap expr_hash] 
	: equality_expr[expr_hash] ('&&' equality_expr[expr_hash])*
	;
	
equality_expr[HashMap expr_hash] 
	: add_expr[expr_hash] {
	}
	 (predop add_expr[expr_hash]{
	 })*
	;
	 
	
add_expr[HashMap expr_hash]
@init {
	ArrayList operators = new ArrayList();
	int opt_cnt = 0;
}	 
	: me1=mult_expr[expr_hash] (op=add_op me2=mult_expr[expr_hash]  {
		if(opt_cnt == 0)
		{
			// Add first one
			HashMap tmp = new HashMap();
			tmp.put("op",$op.text);
			tmp.put("type","prim");
			tmp.put("result",$me1.result);
			operators.add(tmp);

			// Add Second one
			 tmp = new HashMap();
			tmp.put("op",$op.text);
			tmp.put("type","prim");
			tmp.put("result",$me2.result);
			operators.add(tmp);
			opt_cnt = opt_cnt + 1;
		}
		else
		{
			// Loopers
			HashMap tmp = new HashMap();
			tmp.put("op",$op.text);
			tmp.put("type","prim");
			tmp.put("result",$me2.result);
			operators.add(tmp);
			opt_cnt = opt_cnt + 1;
		}
		
	})* {
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
	};		


mult_expr[HashMap expr_hash]  returns[Object result]
	: u=unary_expr[expr_hash] { $result = $u.result; }(mult_op unary_expr[expr_hash])*
	;


unary_expr[HashMap expr_hash]  returns[Object result] options { backtrack = true; }
	: 'not' unary_expr[expr_hash] | 
	'seen' STRING 'in' var_domain ':' VAR timeframe	|
	'seen' STRING ('before' | 'after') STRING 'in' var_domain ':' VAR |
	var_domain ':' VAR predop expr timeframe |
	var_domain ':' VAR timeframe |
	oe=operator_expr[expr_hash] { $result = $oe.result; }
	;
	

operator_expr[HashMap expr_hash] returns[Object result]
	: f=factor[expr_hash] {$result = $f.result;  }
	 operator*	
	;

operator 
	: '.' operator_op '(' expr ','? ')'	
	;
		
fragment operator_op 
	: 'pick'|'match'|'length'|'replace'|'as'|'head'|'tail'|'sort'
      |'filter'|'map'|'uc'|'lc' |'split' | 'join' | 'query'
      | 'has' | 'union' | 'difference' | 'intersection' | 'unique' | 'once'
      | 'duplicates';
      	
// TODO: REGEX needs to be added      | REGEXP  	
factor[HashMap expr_hash] returns[Object result] options { backtrack = true; }
	: v=INT { 
		HashMap tmp = new HashMap();
		tmp.put("type","num");
		tmp.put("val",Integer.parseInt($v.text));
		$result = tmp;
	}
      | v=STRING  { $result=$v.text; }    
      | v='true'  { $result=$v.text; }
      | v='false'  { $result=$v.text; }
      | VAR '[' expr ']'
      | var_domain ':' VAR
      | trail_exp
      | function_app
      | '[' expr ',' ']'
      | '{' (hash_line ','?)* '}'
      | v=VAR  { 
      		HashMap tmp = new HashMap();
		tmp.put("type","var");
		tmp.put("val",$v.text);
		$result = tmp;
}
      | '(' expr ')'
	;	
fragment var_domain: 'ent' | 'app';	
	


function_app 
	:namespace VAR '(' (expr ','?)* ')' 
	| VAR '(' (expr ','?)* ')'	
	;

fragment namespace
	: VAR ':'	
	;
	
trail_exp 
	:'current' var_domain ':' VAR 
	| 'history' expr var_domain ':' VAR
	;
	
timeframe
	:  'within' expr ( period)	 
	;
	
hash_line 
	: STRING ':' expr	
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
		ca='cachable' ('for' tm=INT per=(period))? {
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
	( 'description' desc=(HTML|STRING) 	{ meta_block_hash.put("description",strip_wrappers("<<",">>",$desc.text)); } 
	 | 'name' thename=STRING 		{ meta_block_hash.put("name",strip_string($thename.text)); }
	 | 'author' author=STRING   		{ meta_block_hash.put("author",strip_string($author.text)); }
	 | 'key' what=('errorstack'|'googleanalytics'|'twitter'|'amazon'|'kpds'|'google' | VAR)  (key_value=STRING | '{' (name_value_pair[key_values] (',' name_value_pair[key_values])*) '}') +  { 
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
	| 'logging' ('on'|'off') {  meta_block_hash.put("logging","on"); }
	| 'use' 'module' name=VAR ('alias' alias=VAR)? {
		HashMap tmp = new HashMap(); 
		tmp.put("name",$name.text);
		tmp.put("type","module");
		if($alias.text != null) {
			tmp.put("alias",$alias.text);
		}
		use_list.add(tmp);
	 }
	| 'use' rtype=('css' | 'javascript') 'resource' (url=STRING | name=VAR)  {
		HashMap tmp = new HashMap(); 
		HashMap tmp2 = new HashMap();
		if($url.text != null)
		{
			tmp2.put("location",strip_string($url.text));
			tmp2.put("type","url");
		}
		else
		{
			tmp2.put("location",$name.text);
			tmp2.put("type","name");			
		}
		tmp.put("resource",tmp2);
		
		tmp.put("name",$name.text);
		tmp.put("resource_type",$rtype.text);
		use_list.add(tmp);
	 }
	 )*
	 '}'  
	
	;
	
		
dispatch_block
@init {
	 ArrayList dispatch_block_array = (ArrayList)rule_json.get("dispatch");
}
@after  {
}	
	: 'dispatch' '{' ('domain' domain=STRING ('->' rsid=STRING)? {
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