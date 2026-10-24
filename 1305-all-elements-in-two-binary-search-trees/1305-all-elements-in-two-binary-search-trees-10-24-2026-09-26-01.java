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

     

    public void bst(TreeNode root, List<Integer> list){
        if(root == null){
           return;
        }
        list.add(root.val);
         bst(root.left , list);
         bst(root.right , list);
        

    }

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
       List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
      bst(root1, list);
      bst(root2, list2);

        list.addAll(list2);

        Collections.sort(list);

        return list;

        

      
        
        
    }
}