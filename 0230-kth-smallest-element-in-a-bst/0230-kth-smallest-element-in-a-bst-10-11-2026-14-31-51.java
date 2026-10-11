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
     List<Integer> list = new ArrayList<>();
   public List<Integer> inorder(TreeNode root){
       if(root == null){
        return list;
       }
       inorder(root.left);
       list.add(root.val);
       inorder(root.right);
    
    return list;
   }

    public int kthSmallest(TreeNode root, int k) {
        
        List<Integer> list2 = new ArrayList<>(inorder(root));

        return list.get(k-1);

        
        
        
    }
}