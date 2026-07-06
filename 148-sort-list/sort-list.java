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
    public ListNode sortList(ListNode head) {

        // LinkedList Into ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        ListNode curr = head;
        while(curr != null){
            list.add(curr.val);
            curr = curr.next;
        }
        
        // Sorting
        Collections.sort(list);

        // ArrayList Into LinkedList
        ListNode dummy = new ListNode(0);
        ListNode first = dummy;
        for(int x : list){
            first.next = new ListNode(x);
            first = first.next;
        }
        return dummy.next;
    }
}