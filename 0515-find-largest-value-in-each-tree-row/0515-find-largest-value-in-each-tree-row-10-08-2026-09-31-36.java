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
    public List<Integer> largestValues(TreeNode root) {

          List<Integer> list = new ArrayList<>();

           if(root == null) return list;

          Queue<TreeNode> q = new LinkedList<>();
          q.add(root);


          while(!q.isEmpty()){
           int max = Integer.MIN_VALUE;

           int n = q.size();

           for(int i = 0; i < n; i++){
                 
                 TreeNode c = q.poll();

                 if(c != null){
                    max = Math.max(max , c.val);
                 }

                 if(c.left != null){
                    q.add(c.left);
                 }

                 if(c.right != null){
                    q.add(c.right);
                 }

           }
           list.add(max);

          }

          return list;



    }
}