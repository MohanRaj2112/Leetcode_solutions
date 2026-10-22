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
    public int getMinimumDifference(TreeNode root) {

        Queue<TreeNode> q = new LinkedList<>();

        if(root == null){
            return 0;
        }
        q.add(root);

        List<Integer> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;

        while(!q.isEmpty()){
            TreeNode c = q.poll();
            list.add(c.val);
           
            if(c.left != null){
                q.add(c.left);
            }

            if(c.right != null){
                q.add(c.right);
            }
            
        }
        Collections.sort(list);
        for(int i = 1;i < list.size(); i++){
            int d = list.get(i) - list.get(i-1);
            min = Math.min(min, d);

        }
        return min;
    }
}