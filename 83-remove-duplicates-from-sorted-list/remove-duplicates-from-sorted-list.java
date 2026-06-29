/**
 * Definition for singly-linked list.
 
 public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
*/
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        Set<Integer> set = new LinkedHashSet<>();
        ListNode curr = head;
        while(curr != null){
            set.add(curr.val);
            curr = curr.next;
        }
        ListNode ans = new ListNode(0);
        ListNode curr1 = ans;
        for(int x : set){
            curr1.next = new ListNode(x);
            curr1 = curr1.next;
        }
        return ans.next;
    }
}