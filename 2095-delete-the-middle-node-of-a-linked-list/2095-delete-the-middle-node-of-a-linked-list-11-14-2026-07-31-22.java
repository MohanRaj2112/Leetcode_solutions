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
    public ListNode deleteMiddle(ListNode head) {
        
        int len = 0;
        ListNode temp = head;

        while(temp != null){
            len++;
            temp = temp.next;
        }
        if(len == 1){
            return null;
        }

        int n = len / 2;
        temp = head;

        for(int i = 0; i < n - 1; i++){

             temp = temp.next;
        }
       // if(temp.next != null && temp.next.next != null){
          temp.next = temp.next.next;
       // }
        
        return head;

    }
}