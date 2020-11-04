import Data.List (findIndices)
import Helpers
import System.Environment (getArgs)
import Prelude

-- The main method that will be used for testing / command line access
main = do
  args <- getArgs
  filename <- readFile (head args)
  (moves, puzzle) <- readBossPuzzleFile filename
  (printPuzzle (manyMoves moves puzzle))

-- YOUR CODE SHOULD COME AFTER THIS POINT
manyMoves :: [Char] -> [[Int]] -> [[Int]]
manyMoves [] puzzle = puzzle
manyMoves (move : moves) puzzle = manyMoves moves (oneMove move puzzle)

oneMove :: Char -> [[Int]] -> [[Int]]
oneMove _ [] = []
oneMove move puzzle
  | move == 'l' = swapRow rowIdx replaceRowLeft puzzle
  | move == 'r' = swapRow rowIdx replaceRowRight puzzle
  | move == 'u' = replaceColUp
  | move == 'd' = replaceColDown
  | otherwise = puzzle
  where
    zeroIdx = findZero puzzle
    rowIdx = fst (head (zeroIdx))
    colIdx = snd (head (zeroIdx))
    row = puzzle !! rowIdx
    replaceRowRight = swapElemRow colIdx (colIdx - 1) row
    replaceRowLeft = swapElemRow colIdx (colIdx + 1) row
    replaceColUp = swapElemColumn (rowIdx + 1) colIdx rowIdx puzzle
    replaceColDown = swapElemColumn (rowIdx - 1) colIdx rowIdx puzzle

swapElemColumn :: Int -> Int -> Int -> [[Int]] -> [[Int]]
swapElemColumn replaceI j zeroI xs
  | ((replaceI < (length xs)) && (replaceI >= 0)) = putZero
  | otherwise = xs
  where
    replaceElement = (xs !! replaceI) !! j
    replaceCol = set2dElem zeroI j replaceElement xs
    putZero = set2dElem replaceI j 0 replaceCol

swapElemRow :: Int -> Int -> [Int] -> [Int]
swapElemRow i j xs
  | ((j < (length xs)) && (j >= 0)) = [swap r c | (r, c) <- zip [0 .. length xs - 1] xs]
  | otherwise = xs
  where
    swap r x
      | r == i = xs !! j
      | r == j = xs !! i
      | otherwise = x

-- Convert 1D array to 2D Array based of chunck size
group :: Int -> [a] -> [[a]]
group _ [] = []
group n l = (take n l) : (group n (drop n l))

-- Set element in 1D Array
setElem :: Int -> Int -> [Int] -> [Int]
setElem _ _ [] = []
setElem n el (x : xs)
  | n == 0 = el : xs
  | otherwise = x : (setElem (n -1) el xs)

-- Set element in 2D Array
set2dElem :: Int -> Int -> Int -> [[Int]] -> [[Int]]
set2dElem row col to puzzle = foldBack
  where
    chunck = length (puzzle !! 0)
    array = foldr (++) [] puzzle
    replaceElem = setElem ((chunck * row) + col) to array
    foldBack = group chunck replaceElem

-- Swap row of 2d array
swapRow :: Int -> [Int] -> [[Int]] -> [[Int]]
swapRow _ _ [] = []
swapRow n el (x : xs)
  | n == 0 = el : xs
  | otherwise = x : (swapRow (n -1) el xs)

-- Find zero in 2D Array
findZero :: [[Int]] -> [(Int, Int)]
findZero [] = []
findZero (x : xs) = r ++ c
  where
    r = [(0, col) | col <- (elemIndices 0 x)]
    c = [(currentRow + 1, col) | (currentRow, col) <- (findZero xs)]

elemIndices :: Eq a => a -> [a] -> [Int]
elemIndices find array = findIndices (== find) array