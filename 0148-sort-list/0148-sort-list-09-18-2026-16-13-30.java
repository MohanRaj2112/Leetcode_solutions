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
    public ListNode sortList(ListNode head) {

        ListNode temp = head;
        int n = 0;

        while(temp != null){
            n++;
            temp = temp.next;
        }

        int[] arr = new int[n];
        int id = 0;
        temp = head;

        while(temp != null){
            arr[id++] = temp.val;
            temp = temp.next;

        }
        Arrays.sort(arr);

        ListNode dummy = new ListNode(0);
        ListNode t = dummy;

        for(int i = 0; i < n;i++){
            ListNode emp = new ListNode(arr[i]);
            t.next = emp;
            t = t.next;
        }
        return dummy.next;
        
    }
}