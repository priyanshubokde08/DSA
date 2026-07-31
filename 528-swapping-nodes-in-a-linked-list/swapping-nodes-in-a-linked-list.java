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
        int s = 0;
        ListNode temp = head;
        while(temp != null){
            s++;
            temp = temp.next;
        }
        ListNode t1 = head;
        for(int i = 1; i < k; i++){
            t1 = t1.next;
        }
        ListNode t2 = head;
        for(int i = 1; i <= (s - k); i++){
            t2 = t2.next;
        }
        int x = t2.val;
        t2.val = t1.val;
        t1.val = x;

        return head;
    }
}