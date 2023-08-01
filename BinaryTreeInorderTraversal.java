import java.util.List;
import java.util.Stack;

class BinaryTreeInorderTraversal {

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

  public static List<Integer> inorderTraversal(TreeNode root) {
    Stack<Integer> result = new Stack<>();
    Stack<TreeNode> stack = new Stack<>();

    TreeNode current = root;

    // Runs until every node is transversed
    while (current != null || !stack.empty()) {
      while (current != null) {
        stack.push(current);
        current = current.left;
      }

      current = stack.pop();
      result.push(current.val);
      current = current.right;

    }

    return result;
  }

  public static void main(String[] args) {

    /*

         1
        / \
       /   \
      2     3
     / \   / \
    4   5 6   7

    [ 4 2 5 1 6 3 7 ]

    */

    TreeNode test_1 = new TreeNode(
      1,
      new TreeNode(
        2,
        new TreeNode(4),
        new TreeNode(5)
      ),
      new TreeNode(
        3,
        new TreeNode(6),
        new TreeNode(7)
      )
    );

    System.out.println(inorderTraversal(test_1));
 }
}
