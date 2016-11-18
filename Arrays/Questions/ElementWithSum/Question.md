Given an array of lengtgh n and a number k, check if there exists two elements such that their sum is number.

Input Format:

First line n and k

Second line n elements of array


Output Format:

True/False


*Input*: 

5 16

2 4 7 3 9


*Output*: 

True


__*Note*__: Logic should pass all possible testcases


**Methods**:
- Nested loop, for each element check all other elements if sum=k 
- Sort array and then by keeping 2 pointers at two extremes check if sum=k
- Sort array and then applying binary search check for each element another elements exists in array such that their sum=k
- Apply hashing, for each element find if other element is present in array such that their sum=k in O(1)
