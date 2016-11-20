Given an array of length n, find majority element in array (majroity: element occuring more than n/2 times in array) else print -1

Input Format:

First line n

Second line n elements of array


Output Format:

Majority Element/ -1


*Input*: 

7

2 4 6 2 3 2 2


*Output*: 

2


__*Note*__: Logic should pass all possible testcases


**Methods**:
- Nested loops, for each element check the count and verify if its majority
- Sort array and traverse it to check if count of each element is majority
- Use hashing to store count of each element, traverse to confirm if its majority
- Search for Moore's Voting algorithm, first traversal find candidate element and in second traversal confirm if its majority 
