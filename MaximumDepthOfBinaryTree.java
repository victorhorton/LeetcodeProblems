import java.util.LinkedList;
import java.util.Queue;

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

        if (root == null) {
            return result;
        }

        Queue<TreeNode> node_queue = new LinkedList<TreeNode>();
        node_queue.add(root);

        TreeNode current = root;

        while (!node_queue.isEmpty()) {

            int current_queue_size = node_queue.size();

            for (int i = 0; i < current_queue_size; i++) {
                current = node_queue.remove();

                if (current.left != null) {
                    node_queue.add(current.left);
                }
                if (current.right != null) {
                    node_queue.add(current.right);
                }
            }

            result++;
        }

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

       TreeNode test_3 = new TreeNode(
        1,
        null,
        new TreeNode(
            2,
            null,
            null
        )
       );

       System.out.print("3: ");
       System.out.println(maxDepth(test_1));

       System.out.print("3: ");
       System.out.println(maxDepth(test_2));

       System.out.print("2: ");
       System.out.println(maxDepth(test_3));
    }

}
