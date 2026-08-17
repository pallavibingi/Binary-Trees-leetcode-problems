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

public class Main {
    public static void preOrder(TreeNode root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);

    }
    public static int countNodes(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=countNodes(root.left);
        int right=countNodes(root.right);

        return 1+left+right;
    }
    public static void main(String[] args){
        TreeNode root=new TreeNode(10);
        root.left=new TreeNode(20);
        root.right=new TreeNode(30);
        root.left.left=new TreeNode(40);
        root.left.right=new TreeNode(50);
        preOrder(root);
        System.out.println("No.Of Nodes in a tree");
        System.out.println(countNodes(root));
       
    }
}
