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
    public int findBottomLeftValue(TreeNode root) {

        if(root == null)  return 0;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        int val = 0;


        while(!q.isEmpty()){
           
            int n = q.size();

            for(int i = 0; i < n; i++){
              TreeNode c = q.poll();


            if(i == 0){
                val = c.val;

            }

            if(c.left != null){
                q.add(c.left);
            }

            if(c.right != null){
                q.add(c.right);
            }

           
        }
}
     return val;


        
    }
}