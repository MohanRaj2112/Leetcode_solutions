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
    public int pairSum(ListNode head) {

        int cnt = 0;
        ListNode temp = head;
        while(temp != null){
            cnt++;
            temp = temp.next;
        }

        int arr[] = new int[cnt];
        int max = Integer.MIN_VALUE;
        int id = 0;
        temp = head;

        while(temp != null){
            arr[id++] = temp.val;
            temp = temp.next;
        }



        for(int i = 0; i < arr.length; i++){
            int sum = arr[i] + arr[cnt - 1 - i];
            max = Math.max(max , sum);

        }
        return max;
        
    }
}