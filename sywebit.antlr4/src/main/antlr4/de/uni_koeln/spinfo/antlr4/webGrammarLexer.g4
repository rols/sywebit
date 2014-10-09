lexer grammar webGrammarLexer;

//PUNKT : '.';

//WORD  : ('a'..'z'|'A'..'Z')+;

//WS  : (' '|'\t'|'\u000C'|'\u000D')+ -> skip;

//ErrorChar: . ;



PRON : ' pron' ;
PREP : ' prep.' ;
VERBTYPE: (' tr' | ' intr'| ' refl')  ;
INT : ' interj' ;
NN: (' m'|' f');
ADJ: ' adj';
ADV:' adv';


LINEBREAK : '\r'? '\n' | '\r' ;
//ARENDUNG : 'ar';
//ERENDUNG : 'er';
//IRENDUNG : 'ir';
STEM : ('a'..'z');
//CHAR : ('a'..'z');
//TOKEN  : ('a'..'z'|'A'..'Z') ('a'..'z')* EXCLAM?;
WS  : (' '|'\t'|'\u000C'|'\u000D')+; 
PAR: '(' .*? ')'  -> skip;
DOT : '.';

EXCLAM :'!';