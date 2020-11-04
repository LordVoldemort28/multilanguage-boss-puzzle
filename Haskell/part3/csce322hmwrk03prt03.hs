import Data.List
import Helpers
import System.Environment (getArgs)
import Prelude

-- The main method that will be used for testing / command line access
main = do
  args <- getArgs
  filename <- readFile (head args)
  (_, puzzle) <- readBossPuzzleFile filename
  (printSolvable (puzzleSolvable puzzle))

printSolvable :: Bool -> IO ()
printSolvable True = print "The puzzle is solvable"
printSolvable False = print "The puzzle is not solvable"

-- YOUR CODE SHOULD COME AFTER THIS POINT
puzzleSolvable :: [[Int]] -> Bool
puzzleSolvable puzzle = (mod (length puzzle) 2) == 0

getInversion' :: Int -> [Int] -> Int
getInversion' count _ = count
getInversion' count (x : xs) = count + getInversion' (getInversion x xs) xs

getInversion :: Int -> Int -> [Int] -> Int
getInversion count _ [] = count
getInversion count i (j : js)
  | i > j = getInversion (count + 1) i js
  | otherwise = getInversion count i js
