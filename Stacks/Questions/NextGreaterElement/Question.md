Given an array, print the Next Greater Element (NGE) for every element. The Next greater Element for an element x is the first greater element on the right side of x in array. Elements for which no greater element exist, consider next greater element as -1

*Input*:

5

2 6 4 8 5


*Output*:

6 8 8 -1 -1



__*Note*__: Logic should pass all possible testcases



**Methods**:
- Use nested loops, for each element iterate to check next greater element
- Using stack
  1. Push the first element to stack.
  2. Pick rest of the elements one by one and follow following steps in loop. 
     * Mark the current element as next.
     * If stack is not empty, then pop an element from stack and compare it with next.
     * If next is greater than the popped element, then next is the next greater element for the popped element.
     * Keep popping from the stack while the popped element is smaller than next. next becomes the next greater element for all such popped elements
     * If next is smaller than the popped element, then push the popped element back.
  3. After the loop in step 2 is over, pop all the elements from stack and print -1 as next element for them.
