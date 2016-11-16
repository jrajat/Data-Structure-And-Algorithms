Given an array of n elements, rotate it by d elements

Input Format:

First line n d

Second line n elements of array


Output Format:

Rotated array


*Input*: 

6 3

3 7 5 1 9 2


*Output*: 

1 9 2 3 7 5


__*Note*__: Logic should pass all possible testcases


**Methods**:
- Consider 2 pointers at distance of d, copy elements from d till end into new array and then first d elements into new array
- Consider 2 pointers at distance of d, and start swapping 
- Reverse first d elements, reverse remaining n-d elements and then reverse entire array
