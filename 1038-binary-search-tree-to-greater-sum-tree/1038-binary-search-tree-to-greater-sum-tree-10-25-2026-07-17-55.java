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
    public void Mtree(TreeNode root , List<Integer> list){
        if(root == null){
            return ;
        }

        list.add(root.val);
        Mtree(root.left , list);
        Mtree(root.right , list);

    }

    public TreeNode bstToGst(TreeNode root) {

      TreeNode temp = root;

      List<Integer> list = new ArrayList<>();
      Mtree(root , list);

      Collections.sort(list);

      int n = list.size();



      if(temp == null){
        return null;
      }

      Map<Integer, Integer> map = new HashMap<>();
      for(int i = 0; i < n; i++){
        int sum = 0;
        for(int j = i; j < n; j++){
            sum += list.get(j);
        }

        map.put(list.get(i) , sum);
      }

      Queue<TreeNode> q = new LinkedList<>();
      q.add(temp);

      while(!q.isEmpty()){
        TreeNode c = q.poll();
        c.val = map.get(c.val);

        if(c.left != null){
            q.add(c.left);

        }

        if(c.right != null){
            q.add(c.right);
        }

        

      }
     return temp;
        
    }
}