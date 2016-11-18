Given 2 sorted arrays of size n each, find the median of combined array. Median is average of two middle elements since the number of elements is always going to be even.

Input Format:

First line n

Second line n elements of array1

Third line n elements of array2


Output Format:

Median of 2 arrays


*Input*: 

5

1 12 15 26 38

2 13 17 30 45


*Output*: 

16


__*Note*__: Logic should pass all possible testcases


**Methods**:
- Try to merge both arrays and keep count till u reach n, find median of n & n+1 element
- Compare median(m1,m2) of 2 arrays, 
  * if m1>m2 median is either in arr1[0-m1] or arr2[m2-n] 
  * if m2>m1 median is either in arr1[m1-n] or arr2[0-m2]. 
  * Repeat above logic till size of both subarrays becomes 2 
  * If size=1, just find average between elements in both array
  * median = (max(arr1[0],arr2[0]) + min(arr1[1]+arr2[1])) / 2;

**_IMP_**: What if 2 arrays are not of same size, we can use second method but special cases need to be handled
