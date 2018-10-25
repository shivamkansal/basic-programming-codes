# basic-programming-codes
Here you may put your basic codes which you want to share.
This may help you to see some nice question

TreeNode<int>* maxDataNode(TreeNode<int>* root) {
    /* Don't write main().
     * Don't read input, it is passed as function argument.
     * Return output and don't print it.
     * Taking input and printing output is handled automatically.
     */
    TreeNode<int> * ans1 = root;
  
  for(int i=0;i<root->children.size();i++)
  {
     TreeNode<int> * ans2 = maxDataNode(root->children[i]);
    if(ans1->data < ans2->data)
    {
      ans1=ans2;
    }
 }
return ans1;
}
