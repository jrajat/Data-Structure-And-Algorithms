Given an array of n elements such that its sorted and the pivoted(rotated by some count), find a element k in array

Input Format:

First line n k

Second line n elements of array


Output Format:

Index where key is present


*Input*: 

5 6

10 13 3 6 9


*Output*: 

3


__*Note*__: Logic should pass all possible testcases


**Methods**:
- Traverse entire array and check if elements exists
- Divide array into 2 sorted arrays virtually(keeping 2 indices), and apply binary search in either first/second half 
