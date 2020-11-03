var helpers = require( './helpers' );
var part = require( './csce322hmwrk02prt01' );
const diffDefault = require('jest-diff').default;

var total_test = 30
for (var test=1; test <= total_test; test++){
    var test_ = test.toString().padStart(2,0)
    console.log(`Testing: ${test_}`)
    var puzzle = helpers.readPuzzleFile( `test/part01test${test_}.puzzle.bpf` );
    var moves = helpers.readMovesFile( `test/part01test${test_}.moves.bpf` );
    var solution = helpers.readSolutionFile(`test/part01test${test_}.solution`);

    var theFunction = part.oneMove( puzzle );

    var output = moves[0] + '\n'
    // console.log( moves[0] );
    var after = theFunction( moves[0] );

    function build_output(line){
        output += '['
        for(var i=0; i<line.length; i++){
            if(i == line.length-1)
                output += ` '${line[i]}' ]\n`;
            else
                output += ` '${line[i]}',`;
        }
    }

    for( var i = 0; i < after.length; i++ ){
        // console.log( after[i] );
        build_output(after[i])
    }

    console.log(diffDefault(solution, output))
}
