Given a matrix of dimension m*n where each cell in the matrix can have values 0, 1 or 2 which has the following meaning:   

0 -> Empty Cell     1-> Fresh orange    2-> Rotten orange

what is the minimum time required so that all the oranges become rotten. A rotten orange at index [i,j] can rot other fresh orange at indexes [i-1,j], [i+1,j], [i,j-1], [i,j+1] (up, down, left and right). If it is impossible to rot every orange then simply return -1. [MS interview question]

Examples:

*Input*:
  
--|---|---|---|---
2 | 1 | 0 | 2 | 1
1 | 0 | 1 | 2 | 1
1 | 0 | 0 | 2 | 1

After first pass

--|---|---|---|---
2 | 2 | 0 | 2 | 2
2 | 0 | 2 | 2 | 2
1 | 0 | 0 | 2 | 2

After second pass

--|---|---|---|---
2 | 2 | 0 | 2 | 2
2 | 0 | 2 | 2 | 2
2 | 0 | 0 | 2 | 2

*Output*:

All oranges can become rotten in 2 time frames.

		  	  

*Input*:

--|---|---|---|---  
2 | 1 | 0 | 2 | 1
0 | 0 | 1 | 2 | 1
1 | 0 | 0 | 2 | 1

After first pass

--|---|---|---|---
2 | 2 | 0 | 2 | 2
0 | 0 | 2 | 2 | 2
1 | 0 | 0 | 2 | 2


*Output*:

All oranges cannot be rotten.



__*Note*__: Logic should pass all possible testcases


**Method**:
- Create empty queue
- Enqueue all rotten oranges and delimiter to distinguish between time-frame
- While Q is not empty
  * If Q->front is not delimiter
  * Rotten all adjacent oranges and push them to Q, also increment time frame only once
- POP delimiter and push another delimiter, all oranges in between are rotten in first time frame

