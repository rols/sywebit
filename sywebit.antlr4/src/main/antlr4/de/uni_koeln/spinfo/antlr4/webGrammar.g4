grammar webGrammar;
					  
options{ tokenVocab = webGrammarLexer;}

/*startSymb : word+  dot EOF;
dot :PUNKT;
word: WORD;
*/
startSymb : //entry+ /*(entry|error)+ */ EOF;
//entry : */ 
qs endEntry;
error :  .*? endEntry;
qs : qsLemma; // gramm;
qsLemma: verb | nomen | alternat; // endung?; //|token (COMMA token)*  ;
// zsLemma: ZSLEMMA;

//gramm : pos;
pos:  (PRON|PREP|INT|NN|ADJ|ADV) WS?;
//token: TOKEN;
verb : verbstamm konjugation VERBTYPE;
/* non greedy stem, in order not to bleed konjugation (verbal ending) above */
verbstamm : stem;
stem :STEM+;
/* verbal ending: a or e or i followed by r (--> ar, er, ir) */
konjugation: STEM {(_input.LT(-1).getText().equals("a")) || (_input.LT(-1).getText().equals("e"))
		|| (_input.LT(-1).getText().equals("i"))
		}? 
		STEM {(_input.LT(-1).getText().equals("r"))}?
		; //ARENDUNG|IRENDUNG|ERENDUNG;

nomen : stem NN WS?;
alternat : stem //(endung|WS?)  
			pos;


endEntry: /*DOT*/ LINEBREAK; 




 
