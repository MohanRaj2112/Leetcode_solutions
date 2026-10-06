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
    public int maxLevelSum(TreeNode root) {


        int max = Integer.MIN_VALUE;

        int  level = 0;

        int min = 0;

        
        if(root == null){
            return level;
        }


        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
     

        while(!q.isEmpty()){
            level++;
             int sum = 0;
        

            int n = q.size();

            for(int i = 0; i < n; i++){
                      
                
                TreeNode c = q.poll();

                if(c != null){
                    sum += c.val;
                }

                if(c.left != null){
                    q.add(c.left);
                }

                if(c.right != null){
                    q.add(c.right);
                }

            }
            if(max < sum){
                max = sum;
               min = level;
            }
            else if(max == sum){
                min = Math.min(min , level);
            }
        }
        return min;
        
    }
}