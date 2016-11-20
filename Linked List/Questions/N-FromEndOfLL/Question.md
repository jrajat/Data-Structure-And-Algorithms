Write a program to find n<sup>th</sup> element from end of the linked list

```
struct node* findNfromEnd(struct node* head, int n)
{
  /* Logic */
}
```


**Methods**:
- Traverse the list, find length of the LL and re-traverse till length-n of the list
- Keep 2 pointers, forward one pointer by n nodes. When the pointer ahead reaches the end of list the second pointer will point to n<sup>th</sup> node from end of list  
