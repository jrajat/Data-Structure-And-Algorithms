Write a program to check if linked list is palindrome

```
bool isPalindrome(struct node* head)
{
  /* Logic */
}
```


**Methods**:
- Push all elements into stack, re-traverse the list and keep comparing with top and remove from stack if same else its not palindrome
- Reverse second half of linked list, with 2 two pointer compare 2 halfs, again reverse the second half to maintain the original list
