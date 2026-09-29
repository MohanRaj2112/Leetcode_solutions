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
    public ListNode deleteDuplicates(ListNode head) {
        
        List<Integer> list = new ArrayList<>();

        ListNode temp = head;

        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
        }

        Map<Integer,Integer> map  = new HashMap<>();

        for(int num : list){
            map.put(num , map.getOrDefault(num , 0) +1);
        }
        ArrayList<Integer> New = new ArrayList<>();

        for(int num : map.keySet()){
            if(map.get(num) == 1){
                New.add(num);
            }
        }

        Collections.sort(New);

        ListNode dummy = new ListNode(0);
        ListNode tem = dummy;

        for(int i = 0; i < New.size(); i++){
            tem.next =  new ListNode(New.get(i));
            tem = tem.next;
        }
        return dummy.next;
    }
}