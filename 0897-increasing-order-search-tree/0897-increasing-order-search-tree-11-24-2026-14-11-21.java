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
    public void dfs(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }
        dfs(root.left , list);
        list.add(root.val);
        dfs(root.right, list);

    }



    public TreeNode increasingBST(TreeNode root) {

        
        List<Integer> list = new ArrayList<>();
        dfs(root , list);
        
        int roo = list.get(0);
        TreeNode sam = new TreeNode(0);
        TreeNode temp = sam;
        int n = list.size();
        

        for(int i = 0; i < n; i++){
            temp.right = new TreeNode(list.get(i));
            temp = temp.right;

        }
        return sam.right;
        
    }
}