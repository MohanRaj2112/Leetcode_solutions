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
    public long kthLargestLevelSum(TreeNode root, int k) {

        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        ArrayList<Long> list = new ArrayList<>();
    

        while(!q.isEmpty()){

            long sum = 0;

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
           list.add(sum);

        } 
        Collections.sort(list);
            int l = list.size();

        if(list.size() < k){
            return -1;
        }
        

        return list.get(l-k);

        
    }
}