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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        //reverse the sec half
        ListNode sec = slow.next;
        slow.next = null;
        ListNode prev = null;
        while(sec != null){
            ListNode nextNode = sec.next;
            sec.next = prev;
            prev = sec;
            sec = nextNode;
        }

        //merge part
        ListNode first = head;
                 sec = prev; // revesred sec half
        while(sec != null){
            ListNode t1 = first.next;
            ListNode t2 = sec.next;

            first.next = sec;
            sec.next = t1;

            first = t1;
            sec = t2;
        }
    }
}