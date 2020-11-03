module Helpers
( readBossPuzzleFile
, printPuzzle
, printMove
) where

import Data.Char
import Prelude

printMove :: [Char] -> IO ()
printMove []         = print ""
printMove (moves) = print moves

printPuzzle :: [[Int]] -> IO ()
printPuzzle []         = print ""
printPuzzle (row:rows) = do
    print row
    printPuzzle rows

readBossPuzzleFile :: String -> IO ([Char],[[Int]])
readBossPuzzleFile = readIO
