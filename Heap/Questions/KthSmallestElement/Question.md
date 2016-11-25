Write a program to find Kth smallest/largest element in array

*Input*: 

5  2

34 12 67 54 23 

*Output*: 

23 



__*Note*__: Logic should pass all possible testcases


**Methods**:
- Use bubble k times
- Consider first k elements as largest, find min in that and compare with remaining n-k elements, if greater continue else replace at proper position
- Sorting
- Build max heap, and call extractMin() k times
- Build min heap for first k elements. For each n-k elements, check if its greater than root replace and call heapify else ignore. This will give kth smallest element at root (To get k elements in sorted order, can apply heap sort) 
