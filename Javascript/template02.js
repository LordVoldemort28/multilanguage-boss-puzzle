var helpers = require( './helpers' );
var part = require( './csce322hmwrk02prt02' );
const diffDefault = require('jest-diff').default;

var total_test = 50
for (var test=1; test <= total_test; test++){
    var test_ = test.toString().padStart(2,0)
    console.log(`Test Case: ${test_}`)
    var puzzle = helpers.readPuzzleFile( `test/part02test${test_}.puzzle.bpf` );
    var moves = helpers.readMovesFile( `test/part02test${test_}.moves.bpf` );
    var solution = helpers.readSolutionFile(`test/part02test${test_}.solution`);

    var output = ''

    function build_output(line){
        output += '['
        for(var i=0; i<line.length; i++){
            if(i == line.length-1)
                output += ` '${line[i]}' ]\n`;
            else
                output += ` '${line[i]}',`;
        }
    }

    var theFunction = part.manyMoves( puzzle );

    var after = theFunction( moves );

    for( var i = 0; i < after.length; i++ ){
        // console.log( after[i] );
        build_output(after[i])
    }

    console.log(diffDefault(solution, output))
}
