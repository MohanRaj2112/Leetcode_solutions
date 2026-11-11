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
 */
class Solution {
    int sum = 0;
    public void dfs(TreeNode root , int low , int high){
        if(root == null){
            return;
        }
        dfs(root.left , low , high);
        if(root.val <= high && root.val >= low){
            sum += root.val;
        }
        dfs(root.right , low, high);
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        dfs(root , low, high);

        return sum;


        
    }
}