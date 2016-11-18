Given an array of n elements, find maximum difference between 2 elements in array such that larger element appears after the smaller in array

Input Format:

First line n

Second line n elements of array


Output Format:

Max Difference Value


*Input*: 

8

4 6 3 8 1 7 9 10


*Output*: 

9


__*Note*__: Logic should pass all possible testcases


**Methods**:
- Nested loops for each element find the differnce with other and check if its max
- Keep track of min_element and max_diff, while traversing array 
