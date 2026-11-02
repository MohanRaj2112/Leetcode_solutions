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
    public ListNode oddEvenList(ListNode head) {
         
        ListNode temp = head;
        if( temp == null||temp.next == null){
            return head;
        }

        ListNode odd = new ListNode(0);
        ListNode copy = odd;

        while(temp.next != null &&  temp.next.next != null){
            copy.next = new ListNode(temp.val);
            temp = temp.next.next;
            copy = copy.next;
        }
        copy.next = new ListNode(temp.val);
        copy = copy.next;

        ListNode copy2 = head.next;

        while(copy2.next != null && copy2.next.next != null){
            copy.next = new ListNode(copy2.val);
            copy2 = copy2.next.next;
            copy = copy.next;
        }
        copy.next = new ListNode(copy2.val);
        

        return odd.next;     //10th attempt 💯✅

       
        
    }
}