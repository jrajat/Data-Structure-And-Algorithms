Given a binary matrix, find out the maximum size square sub-matrix with all 1s.

Input Format:

First line n m

n lines with m elements in each


Output Format:

sub-matrix


*Input*: 

6 5

0 1 1 0 1

1 1 0 1 0

0 1 1 1 0

1 1 1 1 0 

1 1 1 1 1

0 0 0 0 0


*Output*: 

1 1 1

1 1 1

1 1 1


__*Note*__: Logic should pass all possible testcases


**Method**:
- DP problem, create a new matrix which will store the sum of values in matrix
- copy first row and col to sum matrix
- for remaining elements in matrix,
  * If its 1, set 1 + min(left, top, diagonal) 
  * Else 0
- Find maximum value in sum matrix 
- With the help of max value and position we can find the entire sub-array
