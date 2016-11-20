Write a program to find middle of linked list

```
struct node* findMiddle(struct node* head)
{
  /* Logic */
}
```


**Methods**:
- Traverse the list, find length of the LL and re-traverse till middle of the list
- Keep 2 pointers, move 1 with normal speed (traversing each node) and other faster(skipping alternate node) when fast pointer reached end slow pointer will point to middle element
