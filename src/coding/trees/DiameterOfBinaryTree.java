package coding.trees;


public class DiameterOfBinaryTree {

    static int diameter = 0;

//                   1
//                  / \
//                 2   3
//                / \
//               4   5
//    Output: 3
//    Path: 4 → 2 → 1 → 3

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println(diameterOfBinaryTree(root));
    }

    public static int diameterOfBinaryTree(TreeNode root) {
        helper(root);
        return diameter;
    }

    public static int helper(TreeNode root){
        if(root == null) return 0;

        int left = helper(root.left);
        int right = helper(root.right);

        diameter = Math.max(diameter, left+right);

        return 1 + Math.max(left, right);
    }


}
