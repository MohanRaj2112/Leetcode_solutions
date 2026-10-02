/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {

        int[][] arr = new int[m][n];
        for (int[] row : arr) {
          Arrays.fill(row, -1);
        }

        ListNode temp = head;

        int l = 0;
        int r = n-1; 
        int top = 0;
        int bot = m-1;
        

        while(l <= r && top <= bot){
            

            for(int i = l; i <= r; i++){
                if(temp != null){
                    arr[top][i] = temp.val;
                    temp = temp.next;
                }
                // else{
                //     arr[top][i] = -1;
                // }
            }
            top++;

            for(int i = top; i <= bot; i++){
                if(temp != null){
                    arr[i][r] = temp.val;
                    temp = temp.next;
                }
            //     else{
            //         arr[i][r] = -1;
            //     }
             }
            r--;

            for(int i = r; i >= l; i--){
                if(temp != null){
                    arr[bot][i] = temp.val;
                    temp = temp.next;
                }
                // else{
                //     arr[bot][i] = -1;
                // }
            }
            bot--;

            for(int i = bot; i >= top; i--){
                if(temp!= null){
                    arr[i][l] = temp.val;
                    temp = temp.next;
                }
                // else{
                //     arr[i][l] = -1;
                // }
            }
            l++;


        }
        return arr;


             
    }
}