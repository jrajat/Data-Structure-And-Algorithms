Given an array of non-negative integers. Find the largest multiple of 3 that can be formed from array elements.

*Input*: 

3

8 1 9

*Output*: 

981



*Input*:

5

8 1 7 6 0

*Output*:

8760


__*Note*__: Logic should pass all possible testcases


**Methods**:
- Generate all possible combinations of elements and keep track of largest number formed which is multiple of 3
- Facts about number being divisible by 3:
  * No. is multiple of 3 iff sum of its digits is multiple of 3
  * If no is multiple of 3, then all its combinations are also multiple of 3
  * We get same remainder when we divide number by 3 and sum of its digits by 3
  Logic?
	* Sort in increasing order
	* 3 queues, 1 store elements with remainder 0, 2 elements with remainder  1 and elements with remainder 2
	* Find sum of all digits
	* Three possible cases:
		* If sum divisible by 3, next step
		* If remainder is 1, dequeue one element from queue which gives remainder 1, if it’s empty dequeue 2 elements from queue which gives remainder 2, else not possible
		* If remainder is 2, dequeue one element from queue which gives remainder 2, if it’s empty dequeue 2 elements from queue which gives remainder 1, else not possible
	* Finally, empty all queues in array, sort descending order and print it

