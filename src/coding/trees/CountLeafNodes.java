package coding.trees;

public class CountLeafNodes {

//    Input:
//             1
//            / \
//           2   3
//          / \
//         4   5
//
//    Output: 3  // leaves: 4, 5, 3

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println(countLeafs(root));
    }

    public static int countLeafs(TreeNode root) {
        if (root == null) return 0; // handle null tree
        if (root.left == null && root.right == null) return 1; // leaf node

        return countLeafs(root.left) + countLeafs(root.right);
    }

}
