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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {

        ListNode temp = list1;      
        ListNode trav = list2;

        while(trav.next != null){
            trav = trav.next;
        }

        for(int i = 0; i <b ; i++){
            temp = temp.next;
        }
        while(temp.next != null){
            trav.next = new ListNode(temp.next.val);
            temp = temp.next;
            trav = trav.next;
        }
        ListNode fin = list1;
        for(int i = 0; i < a - 1; i++){
                 fin = fin.next;
        }
        fin.next = list2;


        return list1;
    }
}

      