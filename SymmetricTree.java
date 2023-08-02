class SymmetricTree {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static boolean recursiveComparison(TreeNode left_node, TreeNode right_node) {
        // Checks if both mirrored nodes are null
        if (left_node == null && right_node == null) {
            return true;

        // Checks if only one of the mirrored node are null
        } else if (left_node == null || right_node == null) {
            return false;
        }

        // Checks if the current mirrored node's values are equal
        boolean currentMatches = left_node.val == right_node.val;

        // Checks if the outter node's values are equal
        boolean outerMatches = recursiveComparison(left_node.left, right_node.right);

        // Checks if the inner node's values are equal
        boolean innerMatches = recursiveComparison(left_node.right, right_node.left);
        return currentMatches && outerMatches && innerMatches;
    }

    public static boolean isSymmetric(TreeNode root) {
        return recursiveComparison(root.left, root.right);
    }

    public static void main(String[] args) {
       TreeNode test_1 = new TreeNode(
        1,
        new TreeNode(
            2,
            new TreeNode(3),
            new TreeNode(4)
        ),
        new TreeNode(
            2,
            new TreeNode(4),
            new TreeNode(3)
        )
       );

       TreeNode test_2 = new TreeNode(
        1,
        null,
        new TreeNode(
            2,
            null,
            new TreeNode(3)
        )
       );

       System.out.print("True: ");
       System.out.println(isSymmetric(test_1));
       System.out.print("False: ");
       System.out.println(isSymmetric(test_2));
    }
}
