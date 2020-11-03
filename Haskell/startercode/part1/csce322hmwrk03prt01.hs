-- import Prelude
-- import System.Environment ( getArgs )
-- import Data.List
-- import Helpers

-- The main method that will be used for testing / command line access
-- main = do
--     args <- getArgs
--     filename <- readFile (head args)
--     (moves,puzzle) <- readBossPuzzleFile filename
--     -- (printPuzzle (oneMove (head moves) puzzle))
--     print puzzle

-- zeroIndex :: [[Int]] -> [Int]
-- zeroIndex puzzle = puzzle!!0

-- YOUR CODE SHOULD COME AFTER THIS POINT
-- oneMove :: Char -> [[Int]] -> [[Int]]
-- oneMove move puzzle = do
--     zeroIndex :: [Int] =
--     case move of
--         | 'u' = swap()
--         | 'd' = swap()
--         | 'l' = swap()
--         | 'r' = swap()
--         | otherwise = puzzle

import Data.List (findIndices)
import Prelude

puzzle = [[16, 11, 5, 0], [4, 9, 13, 20], [1, 15, 18, 17], [10, 8, 19, 3], [14, 21, 6, 12], [22, 23, 2, 7]]

main = do
  print $ findZero 0 puzzle

findZero :: Int -> [[Int]] -> [(Int, Int)]
findZero _ [] = []
findZero zero (x : xs) = r ++ c
  where
    r = [(0, col) | col <- (elemIndices zero x)]
    c = [(row, col) | (currentRow, col) <- (findZero zero xs), let row = currentRow + 1]

elemIndices :: Eq a => a -> [a] -> [Int]
elemIndices find array = findIndices (== find) array
