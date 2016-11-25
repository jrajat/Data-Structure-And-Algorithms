Find inorder predecessor(previous) and successor(next) of a given key in BST, if key not present print 2 nos between which key lie. 


```
void printBetween(struct node* root, int key)
{
  /* Logic to find inorder successor and predecessor of given key */
}
```


**Method**:
- If key is found, predecessor is right-most child in left sub-tree or left child and successor is left-most child in right sub-tree or right child. 
- Else key is between two consecutive element in inorder  
