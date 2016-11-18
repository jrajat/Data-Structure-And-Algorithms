Given an array of n elements containing 0 & 1, rearrange array such that all 0s are followed by all 1s 

Input Format:

First line n

Second line n elements of array


Output Format:

rearranged array


*Input*: 

8

0 1 0 1 0 1 0 0


*Output*: 

0 0 0 0 0 1 1 1


__*Note*__: Logic should pass all possible testcases


**Methods**:
- Count 0s in array, replace initial elements with count of 0 and remaining are 1s
- Use 2 indexes at 2 extremes, i=0,j=n-1 increment i till its 0 and decrement j till its 1  
