Merge 2 BST with limited extra space [ maximum space allowed= O(height of tree1 + height of tree2)  Time complexity=O(m+n) total no. of nodes]

```
struct node* mergeBST(struct node* root1, struct node* root2)
{
  /* Logic to merge 2 BST */
}
```


**Method**:
- Find inorder traversal of 2 BSTs, store in array. Merge 2 sorted arrays and then created BST from sorted array (separate question) 
