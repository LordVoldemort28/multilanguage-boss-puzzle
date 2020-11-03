module.exports = {
    puzzleSolvable: puzzleSolvable
}
function flatten2dArray(puzzle){
    var puzzleArray = []
    for(var i=0; i<puzzle.length; i++){
        for(var j=0; j<puzzle[0].length; j++){
            if(puzzle[i][j] != 0){
                puzzleArray.push(parseInt(puzzle[i][j]));
            }
        }
    }
    return puzzleArray
}
function getInversion(puzzle){
    var flatPuzzle = flatten2dArray(puzzle);
    var inversion_count = 0;
    for(var i=0; i<flatPuzzle.length; i++){
        for(var j=i+1; j<flatPuzzle.length; j++){
            if(flatPuzzle[i] > flatPuzzle[j]){
                inversion_count++;
            }
        }
    }
    return inversion_count
}

function findZero(puzzle){
    for(var i=0; i<puzzle.length; i++){
        for(var j=0; j<puzzle[0].length; j++){
            if(puzzle[i][j] == 0)
                return [i, j];
        }
    }
}
function puzzleSolvable(puzzle){
    
    function whatever(){
        var numInversion = getInversion(puzzle);
        var rowSize = puzzle.length;
        var colSize = puzzle[0].length;
        var zeroIdx = findZero(puzzle)
        var blankRow = rowSize - zeroIdx[0]
        
        if(((colSize%2 != 0) && (numInversion%2==0)) || 
            ((colSize%2 == 0) && ((blankRow%2 != 0) == (numInversion%2==0)))){
            return true
        }
	return false
    }
    
    return whatever;
}