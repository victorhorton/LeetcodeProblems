class MaximumDepthOfBinaryTree {

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

    public static int maxDepth(TreeNode root) {
        int result = 0;

        return result;
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

       System.out.print("3: ");
       System.out.println(maxDepth(test_1));
       System.out.print("3: ");
       System.out.println(maxDepth(test_2));

    }

}
