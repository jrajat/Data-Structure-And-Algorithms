Find the first circular tour that visits all petrol pumps. 
Suppose there is a circle. There are n petrol pumps on that circle. You are given two sets of data.

1. The amount of petrol that every petrol pump has
2. Distance from that petrol pump to the next petrol pump


Calculate the first point from where a truck will be able to complete the circle (The truck will stop at each petrol pump and it has infinite capacity). Expected time complexity is O(n). Assume for 1 litre petrol, the truck can go 1 unit of distance.

For example, let there be 4 petrol pumps with amount of petrol and distance to next petrol pump value pairs as 

   A        B        C      D

  {4, 6}, {6, 5}, {7, 3}, {4, 5}. 

The first point from where truck can make a circular tour is 2nd petrol pump. Output should be “start = 1″ (index of 2nd petrol pump).

*Input*: 

4    //number of petrolpumps

4 6   

6 5

7 3

4 5 


*Output*:

start = 1



__*Note*__: Logic should pass all possible testcases


**Methods**:
- Consider every petrol pumps as starting point and see if there is a possible tour. If we find a starting point with feasible solution, we return that starting point
- Use queue to store current tour. We first enqueue first petrol pump to the queue, we keep enqueueing petrol pumps till we either complete the tour, or current amount of petrol becomes <(less) distance to be covered. If the petrol<(less) distance, then we keep dequeueing petrol pumps till the amount of petrol becomes >(greater) distance or queue becomes empty.
