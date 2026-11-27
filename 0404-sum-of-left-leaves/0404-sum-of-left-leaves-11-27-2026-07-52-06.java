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
              

    public int sumOfLeftLeaves(TreeNode root) {

        TreeNode temp = root;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        int count = 0;

        if(root.left == null && root.right ==null){
            return 0;
        }

        while(!q.isEmpty()){
            int n = q.size();


            for(int i = 0; i < n; i++){
                TreeNode c = q.poll();

                if(c.left != null){
                    q.add(c.left);
                }
               

              
                if(c.left != null){
                    if(c.left.left == null && c.left.right == null){
                        count += c.left.val;
                    }
                }
                  if(c.right != null){
                    q.add(c.right);
                }


            }
        }
        return count;
        

        
    }
}