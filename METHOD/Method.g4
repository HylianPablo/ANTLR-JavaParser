grammar Method;

init
 :  PUBLIC CLASS word OB method CB EOF
 ;

method
 :  mainheader OB sentence+ CB
 ;

mainheader
 :  PUBLIC STATIC VOID MAIN OP STRING ARGS OC CC CP
 ;

sentence
 : word SC
 ;

word
 :  WORD
 ;

PUBLIC
 :  'public'
 ;

STATIC
 :  'static'
 ;

VOID
 :  'void'
 ;

STRING
 :  'String'
 ;

ARGS
 :  'args'
 ;

MAIN
 :  'main'
 ;

CLASS
 :  'class'
 ;


OB
 :  '{'
 ;

CB
 :  '}'
 ;

OP
 :  '('
 ;

CP
 :  ')'
 ;

OC
 :  '['
 ;

CC
 :  ']'
 ;

SC
 :  ';'
 ;

WORD
 :  ([a-zA-Z]|'"'|'.'|'('|')')+
 ;

SPACE
 : [ \t\r\n] -> skip
 ;