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
    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> list = new ArrayList<>();

        if(root == null){
            return list;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);


        // while(!q. isEmpty()){
        //    TreeNode curr = q.poll();

        //    if(curr != null){
        //        list.add(curr.val);
        //    }

        //    if( curr != null && curr.right != null){
        //       q.add(curr.right);
           
        //          if(curr.right.right == null){
        //             if(curr.right.left != null){
        //                 q.add(curr.right.left);
        //             }
        //             else if(curr.left != null){
        //                 if(curr.left.right != null ){
        //                     q.add(curr.left.right);
        //                 }
        //                 else {
        //                     q.add(curr.left.left);

        //                 }

                        

        //             }
                   
        //           }
        //    }
        // else{

        //     if( curr != null && curr.left != null){
        //         q.add(curr.left);
        //      }

          
        //  }             111 /  217 -- half


        // }
           

           while(!q. isEmpty()){

            int n = q.size();

            for(int i = 0 ; i < n; i++){

                TreeNode curr = q.poll();

                if(i == n-1){
                    list.add(curr.val);
                }

                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
           }
           


       
        return list;
        
    }
}