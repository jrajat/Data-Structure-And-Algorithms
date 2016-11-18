Given an array of n elements, find max and min element in array

Input Format:

First line n

Second line n elements of array


Output Format:

max min


*Input*: 

5

2 4 6 3 1


*Output*: 

6 1


__*Note*__: Logic should pass all possible testcases


**Methods**:
- Linear search for each element compare max,min value
- Tournament method: divide array into halfs, find min-max in each and then compare to find overall max,min
- Consider pair of elements, compare between them and then compare overall minimum and maximum with that values (3n/2-2 comparisons) 
