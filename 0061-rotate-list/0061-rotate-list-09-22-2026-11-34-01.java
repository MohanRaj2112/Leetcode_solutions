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
class Solution 
{
    public ListNode rotateRight(ListNode head, int k)
    {

        ListNode temp = head;
        int n = 0;
        while(temp != null){
            n++;
            temp = temp.next;
        }

        int[] arr = new int[n];

        temp = head;
        int id = 0;

        while(temp != null){

            arr[id++] = temp.val;
            temp = temp.next;

        }

        if(head == null){
            return head;
        }
              int index = 0;

        if(n > k){
            index = k;
        }
        else{
            index = k % n;
        }
  

        for(int j = 0; j < index; j++){
            int swap = arr[n-1];

             for(int i = n-1; i > 0; i--){
                arr[i] = arr[i - 1];
             }
             arr[0] = swap;
        

        }

        ListNode dummy = new ListNode(0);

        ListNode newNode = dummy;

        for(int i = 0; i < n; i++){
            newNode.next = new ListNode(arr[i]);
            newNode = newNode.next;
        }
        return dummy.next;
        


        
    }
}