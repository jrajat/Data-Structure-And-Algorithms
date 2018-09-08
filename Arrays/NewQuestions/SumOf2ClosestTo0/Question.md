Given an array of n elements, find sum of 2 elements closest to 0

Input Format:

First line n

Second line n elements of array


Output Format:

2 Elements whose Sum is closest to 0


*Input*: 

6

1 60 -10 70 -80 85


*Output*: 

-80 85


__*Note*__: Logic should pass all possible testcases


**Methods**:
- Using nested loops, find sum of every possible 2 elements and find abs minimum value
- Sort array, keep 2 pointers at extremes and keep track of abs min value 
