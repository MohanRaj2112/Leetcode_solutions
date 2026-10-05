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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

         List<List<Integer>> main = new ArrayList<>();

         if(root == null){
            return main;
         }

         Queue<TreeNode> q = new LinkedList<>();

         q.add(root);
         int level = 0;

         while(!q.isEmpty()){

            level++;

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
            if(level % 2 == 0){
                Collections.reverse(list);
                main.add(list);
            }
            else{

                main.add(list);

            }

         }
         return main;
        
    }
}