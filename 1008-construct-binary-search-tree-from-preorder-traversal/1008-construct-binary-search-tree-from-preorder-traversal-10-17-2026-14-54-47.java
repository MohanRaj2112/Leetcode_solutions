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
    void insert(TreeNode root , int data){
        if(root.val > data){
            if(root.left == null){
                root.left = new TreeNode(data);
            }
            else{
                insert(root.left , data);
            }
        }
        else{
            if(root.right == null){
                root.right = new TreeNode(data);
            }
            else{
                insert(root.right , data);
            }
        }
    }

    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = new TreeNode(preorder[0]);
         int n = preorder.length;
        for(int i = 1;i < n; i++){
            insert(root , preorder[i]);
        }
        return root;
    }
}