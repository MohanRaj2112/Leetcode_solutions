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
    public ListNode swapNodes(ListNode head, int k) {
        int count = 0;

        ListNode temp = head;

        while(temp != null){
            count++;
            temp = temp.next;
        } 
        int[] arr = new int[count];
        int id = 0;
        temp = head;

        while(temp != null  && id < count){
            arr[id++] = temp.val;
            temp = temp.next;

        
        }
       
             int temp1 = arr[k-1];
            arr[k-1] = arr[arr.length - k];
            arr[arr.length - k] = temp1;
            ListNode dummy = new ListNode(arr[0]);
            ListNode trav = dummy;

            for(int i = 1; i < arr.length; i++){
                trav.next = new ListNode(arr[i]);
                trav = trav.next;

            }
          
            
            return dummy;
    


        
    }
}