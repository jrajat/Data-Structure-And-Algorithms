Given an array of n characters, check if there is duplicate 

Input Format:

First line n

Second line n elements of array


Output Format:

true/false


*Input*: 

5

a c d h a


*Output*: 

false


__*Note*__: Logic should pass all possible testcases


**Methods**:
- Nested loops, check if character is duplicate
- Sort and then for each element check if its present in remaining array using binary search
- Hashing, store each character/ASCII and keep track of its count 
