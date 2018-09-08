Given an array of n elements, find count of inversions required to make array sorted

Input Format:

First line n

Second line n elements of array


Output Format:

Inversion Count


*Input*: 

5

2 4 1 3 5 


*Output*: 

3


__*Note*__: Logic should pass all possible testcases


**Methods**:
- For each element check number of elements smaller than it in right side of array
- Divide array into 2 halfs, inversion count is sum of inversion count in left and right subarray + while merging check if there is inversion i.e. only if arr1[i]>arr2[j], inversion count of mid(number of elements in arr1)-i will be added (since arr1 is sorted all elements in arr1 greater than i will also be greater than arr2[j]) 
