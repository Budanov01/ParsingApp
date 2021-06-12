grammar mathExp;

start : expr ;

expr
    : PLUSMINUS expr        # UNARYOP
    | NUMBER          # CONSTANT
    | LPAR expr RPAR    # PARENTHESES
    | IDENTIFIER LPAR expr (',' expr)* RPAR  # FUNCTIONCALL
    | <assoc=right> expr OP_POW expr    # POW
    | expr MULDIV expr   # MULORDIV
    | expr PLUSMINUS expr   # ADDORSUB
    ;

PLUSMINUS : '+' | '-';
MULDIV : '*' | '/';
OP_POW : '^';
LPAR : '(';
RPAR : ')';
IDENTIFIER: [A-Za-z][A-Za-z0-9]* ;
NUMBER : ('0' .. '9')+ ('.' ('0' .. '9')+)? ;
WHITESPACE : [ \r\n\t] + -> skip ;