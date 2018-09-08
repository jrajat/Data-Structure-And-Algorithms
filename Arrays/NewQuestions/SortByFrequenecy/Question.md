Print elements of an array(size=n) in decreasing frquency(number of time element present in array) if 2 numbers have same frequency then print one which came first.
Input Format:

First line n

Second line n elements of array


Output Format:

Sorted array by frequency


*Input*: 

8

2 5 2 8 5 6 8 8 


*Output*: 

8 8 8 2 2 5 5 6


__*Note*__: Logic should pass all possible testcases


**Methods**:
- Sort array but while sorting also keep track of their indices, count frequency of each element, sory in descending order, Print sorted elements, but if they have same frequency compare their indices and one with lower index should be considered first.
- Use BST to store elements but modify node to store count and first_index. Also its good to have self balancing BST.
- Can Hashing be useful?  
