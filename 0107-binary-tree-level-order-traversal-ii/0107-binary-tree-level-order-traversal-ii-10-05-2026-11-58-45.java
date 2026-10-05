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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
         List<List<Integer>> main = new ArrayList<>();

         Queue<TreeNode> q = new LinkedList<>();

         if(root == null){
            return main;
         }

         q.add(root);


         while(!q.isEmpty()){
            List<Integer> list = new ArrayList<>();

            int n = q.size();

            for(int i = 0; i < n; i++){

                TreeNode current = q.poll();

                if(current != null){
                    list.add(current.val);
                }

                if(current.left != null){
                    q.add(current.left);
                }

                if(current.right != null){
                    q.add(current.right);
                }
                
            }
            main.add(list);
         }
         Collections.reverse(main);

         return main;


        
    }
}