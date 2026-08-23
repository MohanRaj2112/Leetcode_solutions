/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */class Solution {

    public int deepestLeavesSum(TreeNode root) {

        int maxDepth = getDepth(root);

        return sumDeepest(root, 1, maxDepth);
    }

    int getDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int left = getDepth(root.left);
        int right = getDepth(root.right);

        return 1 + Math.max(left, right);
    }

    int sumDeepest(TreeNode root, int depth, int maxDepth) {

        if (root == null) {
            return 0;
        }

        if (depth == maxDepth) {
            return root.val;
        }

        return sumDeepest(root.left, depth + 1, maxDepth)
             + sumDeepest(root.right, depth + 1, maxDepth);
    }
}