Write a program to find if Loop exists in linked list

![alt text] (https://camo.githubusercontent.com/d4b60181351ed11867ec61eb4b1215cf7b05dbdf/687474703a2f2f7777772e6765656b73666f726765656b732e6f72672f77702d636f6e74656e742f75706c6f6164732f323030392f30342f4c696e6b65642d4c6973742d4c6f6f702e676966)

```
bool loopExists(struct node* head)
{
  /* Logic */
}
```


**Methods**:
- Modify the node and store visited flag to keep track of the nodes visited. Since we need to write function only can't change node definition
- Hashing: Store the address of each node visited, if its revisited then there is loop
- Floyd's cycle detection algorithm: 2 pointers one moves slow and other moves fast(alternate nodes) 
