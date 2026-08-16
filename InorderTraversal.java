class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorder=new ArrayList<>();
        traversal(root,inorder);
        return inorder;
        
    }
    //Implementing the preorder tranversal
    //here root is a node in a tree either it is a root or internal node, leaf node whatever it is
    public void traversal(TreeNode root,List<Integer> inorder){
        //empty node 
        if(root==null){
            return;
        }
        
        traversal(root.left,inorder);
        inorder.add(root.val);
        traversal(root.right,inorder);
    }
}
