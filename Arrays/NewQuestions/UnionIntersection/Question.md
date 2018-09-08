Given 2 sorted arrays of size m and n, find the union and intersection between these arrays
 
Input Format:

First line m n

Second line m elements of array

Third line n elements of array


Output Format:

Union

Intersection


*Input*: 

5 4

1 3 4 5 7

2 3 5 6


*Output*: 

Union: 1 2 3 4 5 6 7

Intersection: 3 5


__*Note*__: Logic should pass all possible testcases


**Method**:
- Traverse both arrays, copy elements into union array and if same copy into intersection array and only once in union array 
