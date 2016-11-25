Find Kth smallest element in given BST

```
int smallestElement(struct node* root, int k)
{
  /* Logic to find kth smallest element in BST */
}
```


**Methods**:
- Inorder traversal, store in array and print kth element
- Augmented data structure, modify node to store number of elements in left subtree
  * If k == node’s leftcount +1 , return node
  * Else if k < node’s leftcount, check k in left subtree
  * Else k=k-node’s leftcount -1, check k in right subtree
- While inorder traversal,keep track of static count. If count==k, print data
