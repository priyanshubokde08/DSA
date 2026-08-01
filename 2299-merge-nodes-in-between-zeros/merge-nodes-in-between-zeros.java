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
        while(temp != null && temp.next != null){
            ListNode curr = temp.next;
            while(curr.val != 0){
                temp.val += curr.val;
                curr = curr.next;
            }
            temp.next = curr.next;
            temp = curr.next;
        }
        return head;
    }
}