Given a linked list with 2 pointers, one pointing to next node and other pointing to any random node in linked list. Write a logic to clone the linked list without original list being modified

https://camo.githubusercontent.com/e10213ab87297352c04e9815f1a1cbe170df91c2/687474703a2f2f7777772e6765656b73666f726765656b732e6f72672f77702d636f6e74656e742f75706c6f6164732f323030392f30382f41726269744c696e6b65642d4c69737431322e676966


**Methods**:
- Store next and arbitrary mappings of original list in an array. Modify original list tocreate copy and then restore original list

- Using constant extra space, create copy of 1st node and place between 1 and second node...and so on… Then copy arbitrary link. Now restore original list and clone list by playing with pointers 
