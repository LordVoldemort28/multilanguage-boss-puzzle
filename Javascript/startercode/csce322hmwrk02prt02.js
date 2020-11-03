module.exports = {
    manyMoves: manyMoves
}

function swap(from, to, puzzle){
    try{
        if(to[0] > -1 && to[1] > -1 && puzzle[to[0]][to[1]]){
            var temp = puzzle[to[0]][to[1]]
            puzzle[to[0]][to[1]] = puzzle[from[0]][from[1]]
            puzzle[from[0]][from[1]] = temp
        }
    }catch(err){
        return puzzle
    }
    return puzzle;
}
function find_zero(puzzle){
    for(var i=0; i<puzzle.length; i++){
        for(var j=0; j<puzzle[0].length; j++){
            if(puzzle[i][j] == 0)
                return [i, j];
        }
    }
}

function manyMoves(puzzle){
    
    function whatever(directions){
        directions.forEach(direction => {
            var zero_idxs = find_zero(puzzle);

            switch(direction){
                case 'r':
                    puzzle = swap(zero_idxs, [zero_idxs[0], zero_idxs[1]-1], puzzle)
                    break;
                case 'l':
                    puzzle = swap(zero_idxs, [zero_idxs[0], zero_idxs[1]+1], puzzle)
                    break;
                case 'u':
                    puzzle = swap(zero_idxs, [zero_idxs[0]+1, zero_idxs[1]], puzzle)
                    break;
                case 'd':
                    puzzle = swap(zero_idxs, [zero_idxs[0]-1, zero_idxs[1]], puzzle)
                    break;
            }
        });
            
	return puzzle;
    }

    return whatever;
}