Write a program to rotate linked list by n nodes

```
struct node* rotate(struct node* head, int n)
{
  /* Logic */
}
```


**Method**:
- Move pointer to (n-1)<supth</sup> node, make its next null, and attach head to the tail and n<sup>th</sup> node is new head
