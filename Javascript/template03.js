var helpers = require( './helpers' );
var part = require( './csce322hmwrk02prt03' );
const diffDefault = require('jest-diff').default;

for(var numTest=1; numTest<=10; numTest++){

    var test_ = numTest.toString().padStart(2,0)
    console.log(`Test Case: ${test_}`)
    var puzzle = helpers.readPuzzleFile( `test/part03test${test_}.puzzle.bpf` );
    var moves = helpers.readMovesFile( `test/part03test${test_}.moves.bpf` );
    var solution = helpers.readSolutionFile(`test/part03test${test_}.solution`);

    var theFunction = part.puzzleSolvable( puzzle );

    var after = theFunction();

    console.log(diffDefault(solution.replace('\n', ''), after.toString()))
}


