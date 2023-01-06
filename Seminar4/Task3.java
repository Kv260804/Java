//101. Symmetric Tree
import javax.swing.tree.TreeNode;
import java.util.Stack;

public class Symmetric_Tree_101 {
    public static void main(String[] args) {

    }

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
// class Solution {
//     public boolean isSymmetric(TreeNode root) {
//         return isSymmetric(root, root);
//     }

//     private boolean isSymmetric(TreeNode p, TreeNode q) {
//         if (p == null || q == null)
//             return p == q;

//         return p.val == q.val && isSymmetric(p.left, q.right) && isSymmetric(p.right, q.left);
//     }
// }
    class Solution {
        public boolean isSymmetric(TreeNode root) {
            if (root == null) return true;
            Stack<TreeNode> stack = new Stack<>();
            stack.push(root.left);
            stack.push(root.right);
            while (!stack.empty()) {
                TreeNode p = stack.pop();
                TreeNode q = stack.pop();
                if (p == null && q == null) continue;
                if (p == null || q == null || p.val != q.val) return false;
                stack.push(p.left);
                stack.push(q.right);
                stack.push(p.right);
                stack.push(q.left);
            }
            return true;
        }
    }
}