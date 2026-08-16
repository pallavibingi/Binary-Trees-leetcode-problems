class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preorder=new ArrayList<>();
        traversal(root,preorder);
        return preorder;
        
    }
    //Implementing the preorder tranversal
    //here root is a node in a tree either it is a root or internal node, leaf node whatever it is
    public void traversal(TreeNode root,List<Integer> preorder){
        //empty node 
        if(root==null){
            return;
        }
        preorder.add(root.val);
        traversal(root.left,preorder);
        traversal(root.right,preorder);
    }
}
