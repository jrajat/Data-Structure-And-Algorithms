Given 2 LL, find the intersection node

![alt text] (https://camo.githubusercontent.com/9c05d806b04ea492d62f46ce9eb7b0cfca326d40/687474703a2f2f7777772e6765656b73666f726765656b732e6f72672f77702d636f6e74656e742f75706c6f6164732f323030392f31302f592d5368617065644c696e6b65642d4c6973742e676966)

**Methods**:
- 2 For loops, for each node in one list, iterate second list when their address is equal that's intersection point
- Modify the linked list structure to store visited flag, indicating node is visited
- Difference of node counts, find length of each linked list and increment the head of larger node till the length of both node becomes same. Then, first common node is intersection point
