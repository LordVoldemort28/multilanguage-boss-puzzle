grammar csce322hmwrk01prt01;

SECTION_BEGIN: '<<alpha';
SECTION_END: 'omega>>';
SECTION_TYPE: 'Moves' | 'Puzzle';
VALUE_ASSIGNMENT: '=';
VALUE_SEPERATOR: '&';
NUMERICAL: [0-9]+;
MOVES: 'u' | 'd' | 'l' | 'r';
ROW_SEPERATOR: '$';
BOARD_BEGIN: '{';
BOARD_END: '}';
LIST_BEGIN: '[';
LIST_END: ']';
WS: [ \t\r\n]+ -> skip;

// rules
boss: (puzzles+ moves+ eof) | (moves+ puzzles+ eof) | eof;

moves:
	SECTION_BEGIN {System.out.println("Start Section: " + $SECTION_BEGIN.text);}
	| SECTION_TYPE {System.out.println("Section: " + $SECTION_TYPE.text);}
	| VALUE_ASSIGNMENT {System.out.println("Assignment: " + $VALUE_ASSIGNMENT.text);}
	| LIST_BEGIN
	| move_symbol
	| LIST_END
	| SECTION_END {System.out.println("End Section: " + $SECTION_END.text);};

move_symbol: (
		MOVES {System.out.println("Move: " + $MOVES.text);}
		| VALUE_SEPERATOR
	);

puzzles:
	SECTION_BEGIN {System.out.println("Start Section: " + $SECTION_BEGIN.text);}
	| SECTION_TYPE {System.out.println("Section: " + $SECTION_TYPE.text);}
	| VALUE_ASSIGNMENT {System.out.println("Assignment: " + $VALUE_ASSIGNMENT.text);}
	| BOARD_BEGIN {System.out.println("Start Puzzle: " + $BOARD_BEGIN.text);}
	| puzzle_symbol
	| BOARD_END {System.out.println("End Puzzle: " + $BOARD_END.text);}
	| SECTION_END {System.out.println("End Section: " + $SECTION_END.text);};

puzzle_symbol: (
		NUMERICAL {System.out.println("Tile: " + $NUMERICAL.text);}
		| VALUE_SEPERATOR
		| ROW_SEPERATOR {System.out.println("End Row: " + $ROW_SEPERATOR.text);}
	);

eof: EOF {System.out.println("End of File");};