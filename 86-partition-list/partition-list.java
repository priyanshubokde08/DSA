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
    public ListNode partition(ListNode head, int x) {
        List<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            if(temp.val < x){
                list.add(temp.val);
            }
            temp = temp.next;
        }
        temp = head;
        while(temp != null){
            if(temp.val >= x){
                list.add(temp.val);
            }
            temp = temp.next;
        }
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for(int k : list){
            curr.next = new ListNode(k);
            curr = curr.next;
        }
        return dummy.next;
    }
}