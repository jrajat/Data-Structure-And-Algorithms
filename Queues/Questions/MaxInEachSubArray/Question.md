Given an array of size n and an integer k, find the maximum for each and every contiguous subarray of size k.

*Input*: 

n k

array elements

9 3

1 2 3 1 4 5 2 3 6


*Output*:

3 3 4 5 5 5 6



__*Note*__: Logic should pass all possible testcases


**Methods**:
- Nested Loops
- Create a Dequeue (double ended queue: enqueue and dequeue from both the ends of the queue) of capacity k, that stores only useful elements of current window of k elements. An element is useful if it is in current window and is greater than all other elements on left side of it in current window. We process all array elements one by one and maintain Qi to contain useful elements of current window and these useful elements are maintained in sorted order. The element at front of the Qi is the largest and element at rear of Qi is the smallest of current window
