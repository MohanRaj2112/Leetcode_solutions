// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
//  */
// class Solution {
//     public boolean isEvenOddTree(TreeNode root) {
        
//         if(root == null){
//             return false;
//         }
//         int min = Integer.MAX_VALUE;
//         int max = Integer.MIN_VALUE;


//         Queue<TreeNode> q= new LinkedList<>();
//         q.add(root);

//         boolean k = true;
//         int l = 0;

//         while(!q.isEmpty()){
          

//             int n = q.size();

//             for(int i = 0; i < n; i++){
//                 TreeNode t = q.poll();

//                 if(l % 2 == 1){
//                     if(t.left != null){
//                         if(t.left.val % 2 != 1){
//                             k = false;
//                         }
//                         else if(t.left.val < min){
//                                   min = t.left.val;
//                         }
//                         else{
//                             k = false;
//                         }
//                         q.add(t.left);

//                     }
//                     if(t.right != null){
//                         if(t.right.val % 2 != 1){
//                             k = false;
//                         }
//                         else if(t.right.val < min){
//                                   min = t.right.val;
//                         }
//                         else{
//                             k = false;
//                         }
//                         q.add(t.right);
//                     }

//                 }
//                 else{
//                     if(t.left != null){
//                         if(t.left.val % 2 != 0){
//                             k = false;
//                         }
//                         else if(t.left.val > max){
//                             max = t.left.val;
//                         }
//                         else{
//                             k = false;
//                         }
//                         q.add(t.left);

//                     }
//                     if(t.right != null){
//                         if(t.right.val % 2 != 0){
//                             k = false;
//                         }
//                         else if(t.right.val > max){
//                             max = t.right.val;
//                         }
//                         else{
//                             k = false;
//                         }
//                         q.add(t.right);
//                     }

//                 }

//             }
//             l++;

//         }
//         return k;


//         }
//     }   88 / 100;


class Solution {
    public boolean isEvenOddTree(TreeNode root) {

        if(root == null){
            return true;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        int l = 0;

        while(!q.isEmpty()){

            int n = q.size();

            int prev;

            if(l % 2 == 0){
                prev = Integer.MIN_VALUE;
            }
            else{
                prev = Integer.MAX_VALUE;
            }

            for(int i = 0; i < n; i++){

                TreeNode t = q.poll();

              
                if(l % 2 == 0){

                   
                    if(t.val % 2 == 0){
                        return false;
                    }

                  
                    if(t.val <= prev){
                        return false;
                    }

                }

                else{

             
                    if(t.val % 2 != 0){
                        return false;
                    }

                   
                    if(t.val >= prev){
                        return false;
                    }

                }

                prev = t.val;

                if(t.left != null){
                    q.add(t.left);
                }

                if(t.right != null){
                    q.add(t.right);
                }

            }

            l++;
        }

        return true;
    }
}
