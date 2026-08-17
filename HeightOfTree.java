class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }

}

public class CountNodes {
    public static void preOrder(TreeNode root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);

    }
    public static int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftSubtree=height(root.left);
        int rightSubtree=height(root.right);

        return 1+Math.max(leftSubtree,rightSubtree);

    }
    public static void main(String[] args){
        TreeNode root=new TreeNode(10);
        root.left=new TreeNode(20);
        root.right=new TreeNode(30);
        root.left.left=new TreeNode(40);
        root.left.right=new TreeNode(50);
        preOrder(root);
        System.out.println("Height of a Tree");
        System.out.println(height(root));
    }
}
