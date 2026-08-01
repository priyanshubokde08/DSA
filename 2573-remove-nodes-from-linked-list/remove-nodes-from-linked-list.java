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
    static ListNode reverse(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null){
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
    public ListNode removeNodes(ListNode head) {
        head = reverse(head);
        ListNode temp = head;
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int max = head.val;

        while(temp != null){
            if(temp.val >= max){
                curr.next = new ListNode(temp.val);
                curr = curr.next;
                max = temp.val;
            }
            temp = temp.next;
        }
        return reverse(dummy.next);
    }
}