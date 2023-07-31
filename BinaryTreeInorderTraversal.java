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

    while (current.left != null || !stack.empty()) {
      while (current.left != null) {
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

    TreeNode test_1 = new TreeNode( 1, null, new TreeNode(2, new TreeNode(3), null));

    System.out.println(inorderTraversal(test_1));
 }
}
