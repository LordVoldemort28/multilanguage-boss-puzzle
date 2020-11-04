import Data.List (findIndices)

main = do
  let puzzle = [[16, 11, 5, 44], [4, 0, 13, 20], [1, 15, 18, 17], [10, 8, 19, 3], [14, 21, 78, 12], [22, 23, 2, 7]]
  print $ oneMove 'r' puzzle

oneMove :: Char -> [[Int]] -> [[Int]]
oneMove move puzzle
  | move == 'l' = swapRow rowIndex replaceRowLeft puzzle
  | move == 'r' = swapRow rowIndex replaceRowRight puzzle
  | otherwise = puzzle
  where
    zeroIndex = findZero puzzle
    rowIndex = fst (head (zeroIndex))
    colIndex = snd (head (zeroIndex))
    row = puzzle !! rowIndex
    replaceRowRight = swapElemRow colIndex (colIndex + 1) row
    replaceRowLeft = swapElemRow colIndex (colIndex -1) row

swapElemRow :: Int -> Int -> [Int] -> [Int]
swapElemRow i j xs = [swap r c | (r, c) <- zip [0 .. length xs - 1] xs]
  where
    swap r x
      | r == i = xs !! j
      | r == j = xs !! i
      | otherwise = x

setElem :: Int -> Int -> [Int] -> [Int]
setElem _ _ [] = []
setElem n el (x : xs)
  | n == 0 = el : xs
  | otherwise = x : (setElem (n -1) el xs)

swapRow :: Int -> [Int] -> [[Int]] -> [[Int]]
swapRow _ _ [] = []
swapRow n el (x : xs)
  | n == 0 = el : xs
  | otherwise = x : (swapRow (n -1) el xs)

findZero :: [[Int]] -> [(Int, Int)]
findZero [] = []
findZero (x : xs) = r ++ c
  where
    r = [(0, col) | col <- (elemIndices 0 x)]
    c = [(currentRow + 1, col) | (currentRow, col) <- (findZero xs)]

elemIndices :: Eq a => a -> [a] -> [Int]
elemIndices find array = findIndices (== find) array