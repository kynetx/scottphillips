grammar ruleset;
options {
	output=AST;
  backtrack=true;

}
@members { 
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

}

//ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
//    ;

ID 	: ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_')*
	;

INT :	('-')? '0'..'9'+
    ;

FLOAT
    :   ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    |   '.' ('0'..'9')+ EXPONENT?
    |   ('0'..'9')+ EXPONENT
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

CHAR:  '\'' ( ESC_SEQ | ~('\''|'\\') ) '\''
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

HTML 	: '<<' ( options {greedy=false;} : . )* '>>'
	;
JS 	: '<|' ( options {greedy=false;} : . )* '|>'
	;
	
REGEXP	: '/'  ( options {greedy=false;} : . )*  '/';
	

ruleset 
 	: 'ruleset' rulesetname '{' 
 		( meta_block 
 		| dispatch_block
 		| global_decls 
 		| rule  )*
 	'}' EOF
 	;
 	
 	
 	
 	
 	
 	
rulesetname
	:  ID | INT
	;
 	
 	
 	
 	
 	
rule	:	 'rule' ID 'is' rule_state '{'
	select pre_block? emit_block? (action ';'?) callbacks? post_block?
	'}'
	; 	

//		select pre_block emit_block action ';' callbacks post_block


post_block: post '{' post_statement ';' ';' '}' post_alternate;

post: 'fired'
    | 'always'
    | 'notfired';


post_alternate: 'else' '{' post_statement ';' ';' '}';

post_statement: persistent_expr ('if' expr)
  | log_statement ('if' expr)
  | control_statement ('if' expr)
  | raise_statement ('if' expr)
  ;


callbacks: 'callbacks' '{' success? failure? '}';

success: 'success' '{' click ';'? '}';

failure: 'failure' '{' click ';'?   '}';

click: ('click' | 'change') ID '=' STRING click_link?;

click_link: 'triggers' persistent_expr;


persistent_expr: persistent_clear
   | persistent_set
   | persistent_iterate
   | trail_forget
   | trail_mark;


persistent_clear: 'clear' var_domain ':' ID;

persistent_set: 'set' var_domain ':' ID;

persistent_iterate: var_domain ':' ID counter_op expr counter_start;

trail_forget: 'forget' STRING 'in' var_domain ':' ID;

trail_mark: 'mark' var_domain ':' ID trail_with;

trail_with: 'with' expr;


counter_op: '+='
          | '-=';

counter_start: 'from' expr;


log_statement: 'log' expr;

control_statement: 'last';

raise_statement: 'raise' 'explicit' 'event' ID for_clause modifier_clause;

for_clause: 'for' ID;




rule_state: 'active'
          | 'inactive'
          | 'test'
          ;	 	
          

action 	: conditional_action | unconditional_action 
	;


conditional_action 
	: 'if' expr 'then' unconditional_action	
	;

unconditional_action 
	: primrule | actionblock
	;
	
primrule 
	: 
	rule_label? namespace? ID '(' (expr ','?)* ')' modifier_clause? 
		{System.out.println("found primrule: "+$primrule.text);}
		
	|rule_label? emit_block	
	
	;
          
rule_label : ID '=>';          

modifier_clause   
	: 
		'with' modifierx ('and' modifierx)*
		{System.out.println("found mod clause expr: "+$modifier_clause.text);}
	;
	
modifierx	
	: ID '=' STRING 
		{System.out.println("found modifier  expr: " + $modifierx.text);}

	| ID '=' JS
		{System.out.println("found modifier  JS expr: " + $modifierx.text);}
	;
	
actionblock
	: blocktype '{' (primrule ';'?)* '}'	
	;
	
blocktype: 'choose'
         | 'every';
         	

pre_block: 'pre' '{' (decl ';'?) '}';

          
foreach: 
	'foreach' expr setting
	;         

select	:	'select' (using|when) foreach?
	;
	 	
using	:	'using' STRING setting;

when	:'when' event_seq;

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
	ID ID event_filter setting |
	'(' event_seq ')'
	;
	
setting :	'setting' '(' (ID ','?)* ')';

event_domain 
	:	'web'
	;	

event_filter  
	: ID (STRING | REGEXP)
	;	 

on_expr : 'on' (STRING|REGEXP)	
	; 	
 	
 	
global_decls 
	: 'global' '{' ( global ';')+  '}'	
	; 	
 	
global 	: emit_block | dataset | datasource | css_emit | decl
	;

datasource
	:  'datasource' ID datatype? '<-' STRING cachable
	;

css_emit 
	: 'css' (HTML | STRING)	
	;	

decl    options { backtrack = true; } : 
	ID '=' HTML |
	ID '=' JS |
	ID '=' expr  	
	;	
	
	
	
expr options { backtrack = true; } : function_def | conditional_expression	
	;	
	
function_def options { backtrack = true; }
	: 'function' '(' (ID ','?)* ')' '{' fundecls* expr ';'? '}'
	;	
	
fundecls options { backtrack = true; }
	: decl ';' 
	;

	

conditional_expression options { backtrack = true; }
	: disjunction '=>' expr '|' expr | disjunction
	;	

disjunction 
	: conjunction ('||' conjunction)*
	;	
	
conjunction 
	: equality_expr ('&&' equality_expr)*
	;
	
equality_expr 
	: add_expr (predop add_expr)*
	;
	
predop: '<=' | '>=' | '<' | '>' | '==' | '!=' | 'eq' | 'neq' | 'like';		
	
add_expr : mult_expr (add_op mult_expr)*;		

add_op: '+'|'-';

mult_expr
	: unary_expr (mult_op unary_expr)*
	;

mult_op: '*'|'/'|'%';

unary_expr options { backtrack = true; }
	: 'not' unary_expr | 
	'seen' STRING 'in' var_domain ':' ID timeframe	|
	'seen' STRING ('before' | 'after') STRING 'in' var_domain ':' ID |
	var_domain ':' ID predop expr timeframe |
	var_domain ':' ID timeframe |
	operator_expr	
	;
	

operator_expr
	: factor operator*	
	;
	
factor options { backtrack = true; }
	: INT
      | STRING
      | REGEXP
      | 'true'
      | 'false'
      | ID '[' expr ']'
      | persistent_var
      | trail_exp
      | function_app
      | '[' expr ',' ']'
      | '{' (hash_line ','?)* '}'
      | ID 
      | '(' expr ')'
	;	

hash_line 
	: STRING ':' expr	
	;
	
function_app 
	:namespace ID '(' (expr ','?)* ')' |
	 ID '(' (expr ','?)* ')'	
	;

namespace
	: ID ':'	
	;

trail_exp 
	:'current' var_domain ':' ID |
	'history' expr var_domain ':' ID	
	;
	
persistent_var 
	: var_domain ':' ID	
	;
operator 
	: '.' operator_op '(' expr ','? ')'	
	;	
		
operator_op 
	: 'pick'|'match'|'length'|'replace'|'as'|'head'|'tail'|'sort'
      |'filter'|'map'|'uc'|'lc' |'split' | 'join' | 'query'
      | 'has' | 'union' | 'difference' | 'intersection' | 'unique' | 'once'
      | 'duplicates'	
	;		
timeframe
	:  'within' expr (periods | period)	 
	;
	
var_domain: 'ent' | 'app';

emit_block 
	: 'emit' (HTML|STRING|JS)	
	;
	
dataset : 'dataset' ID datatype? '<-' STRING cachable	
	;

datatype: ':' ('JSON'|'XML'|'RSS'|'HTML')
	;

cachable: 'cachable' cachetime	
	;	

cachetime: 'for' INT (periods|period)	
	;

periods : 'years'
      | 'months'
      | 'weeks'
      | 'days'
      | 'hours'
      | 'minutes'
      | 'seconds'	
	;

period 	:'year'
 | 'month'
 | 'week'
 | 'day'
 | 'hour'
 | 'minute'
 | 'second'	
 ;

	 	
 	
 	
dispatch_block
	: 'dispatch' '{' dispatch* '}'
	;

dispatch:	'domain' STRING dispatch_target	 ;

dispatch_target
	:	'->' STRING
	;
 	
 	
 	
 	
meta_block 
	: 'meta' '{' pragma*
	'}'
	
	;
	
pragma 	: desc_block | 'name' STRING | 'author' STRING | 'key' ('errorstack'|'googleanalytics'|'twitter'|'amazon'|'kpds'|'google' | ID) key_value 
	| authz_pragma
	| logging_pargma
	| 'use' 'module' ID alias?
	| 'use' ('css' | 'javascript') 'resource' location
	;
	
authz_pragma
	: 'authz' 'require' 'user'
	;
	
logging_pargma
	:	'logging' ('on'|'off')
	;
	
alias	: 'alias' ID;
		
location: STRING | ID;

desc_block
	:	'description' (HTML|STRING)
	;

	
key_value 
	: STRING | name_value_pair+	 
	;
	
name_value_pair 
	: STRING ':' (INT | STRING)
	;