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
    public List<Double> averageOfLevels(TreeNode root) {

        List<Double> list = new ArrayList<>();

        if(root == null){
            return list;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);


        while(!q.isEmpty()){
            int n = q.size();
            double sum = 0;

            for(int i = 0; i < n; i++){
                TreeNode c = q.poll();
                sum += c.val;

                if(i == n-1){
                    list.add(sum / n);
                }

                if(c.left != null){
                    q.add(c.left);
                }

                if(c.right != null){
                    q.add(c.right);
                }

                

            }
        }
        return list;
        
    }


}