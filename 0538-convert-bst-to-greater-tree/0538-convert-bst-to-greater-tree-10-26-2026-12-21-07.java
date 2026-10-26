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

     static int sum;

    public void DFS(TreeNode root){

        if(root == null) return;

        DFS(root.right);

        root.val += sum;
        sum = root.val;
        
        DFS(root.left);
    }
    public TreeNode convertBST(TreeNode root) {

        sum = 0;

        DFS(root);

        return root;
        
    }
}