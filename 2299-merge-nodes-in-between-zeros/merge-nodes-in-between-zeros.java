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
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        ListNode temp = head;
        
        int x = 0;
        while(temp != null){
            if(temp.val != 0){
                x += temp.val;
            }else{
                if(x != 0){
                    curr.next = new ListNode(x);
                    curr = curr.next;
                }
                x = 0;
            }
            temp = temp.next;
        }
        return dummy.next;
    }
}