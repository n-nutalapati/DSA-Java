package coding.trees;

public class MaxDepthOfBinaryTree {

//    Input:
//              1
//             / \
//            2   3
//           /
//          4
//
//    Output: 3

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.left.left = new TreeNode(5);

        System.out.println(maxDepth(root));
    }

    public static int maxDepth(TreeNode root) {

        return helper(root);

    }

    public static int helper(TreeNode root) {

        if(root == null) return 0;

        int left = helper(root.left);
        int right = helper(root.right);

        return 1 + Math.max(left, right);

    }

}
