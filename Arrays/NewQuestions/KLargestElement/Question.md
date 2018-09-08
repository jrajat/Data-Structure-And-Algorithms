Given an array of n elements, find K largest/smallest element in array

Input Format:

First line n k

Second line n elements of array


Output Format:

k largest element


*Input*: 

8 3

4 6 3 8 1 7 9 10


*Output*: 

8 9 10


__*Note*__: Logic should pass all possible testcases


**Methods**:
- Use bubble sort k times, since in each iteration of outer loop we get largest element
- Take a temp array, put k elements in it sort it, for remaining elements insert into temp array if required and that too at proper position
- Sort and print largest k elements
- Build Max heap, and extract max k times
- Build Min heap, check root with new element if greater replace and call heapify property, min heap will have k largest elements
