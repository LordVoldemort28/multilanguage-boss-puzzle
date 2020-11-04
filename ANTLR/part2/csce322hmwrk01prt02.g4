grammar csce322hmwrk01prt02;

@header {
    import java.io.*;
}

@members {
    int 
}

//tokens
SECTION_BEGIN: '<<alpha';
SECTION_END: 'omega>>';
SECTION_TYPE: 'Moves' | 'Puzzle';
VALUE_ASSIGNMENT: '=';
VALUE_SEPERATOR: '&';
PUZZLE_VALUE: [0-9]+ | '-1';
MOVES: 'u' | 'd' | 'l' | 'r';
ROW_SEPERATOR: '$';
BOARD_BEGIN: '{';
BOARD_END: '}';
LIST_BEGIN: '[';
LIST_END: ']';
WS: [ \t\r\n]+ -> skip;
ERROR: (.);

// rules
boss: (section+ eof) | eof;
section:
	section_begin
	| section_type
	| value_assignment
	| (puzzle_section+ | move_section+)
	| section_end
	| error;
move_section: LIST_BEGIN | moves+ | LIST_END;
moves: MOVES | VALUE_SEPERATOR;
puzzle_section:
	BOARD_BEGIN
	| puzzle+
	| BOARD_END puzzle:
		PUZZLE_VALUE {System.out.println("Tile: " + $PUZZLE_VALUE.text);}
		| VALUE_SEPERATOR
		| ROW_SEPERATOR {System.out.println("End Row: " + $ROW_SEPERATOR.text);};
	value_assignment:
		VALUE_ASSIGNMENT {System.out.println("Assignment: " + $VALUE_ASSIGNMENT.text);};
	section_type:
		SECTION_TYPE {System.out.println("Section: " + $SECTION_TYPE.text);};
	section_begin:
		SECTION_BEGIN {System.out.println("Start Section: " + $SECTION_BEGIN.text);};
	section_end:
		SECTION_END {System.out.println("End Section: " + $SECTION_END.text);};
	error:
		ERROR {System.out.println("Line "+$ERROR.line+" Contains Unrecognized Token "+ $ERROR.text+"."); System.exit(1);
		};
	eof: EOF {System.out.print("End of File");};