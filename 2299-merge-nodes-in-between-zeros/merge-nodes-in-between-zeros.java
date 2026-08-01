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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp = head;
        List<Integer> li = new ArrayList<>();
        int x = 0;
        while(temp != null){
            if(temp.val != 0){
                x += temp.val;
            }else{
                if(x != 0) li.add(x);
                x = 0;
            }
            temp = temp.next;
        }
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for(int k : li){
            curr.next = new ListNode(k);
            curr = curr.next;
        }
        return dummy.next;
    }
}