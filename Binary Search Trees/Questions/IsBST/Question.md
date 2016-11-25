Check if give tree is BST or not

```
bool isBST(struct node* root)
{
  /* Logic to check if given tree is BST */
}
```


**Methods**:
- Check if root is > left-child and < right-child, also max-value in left-subtree is < root and min-value in right-subtree is > root
- Call each node with expected min and max value, and check if node data is in between
- Store inorder traversal in array and check if its sorted
