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
    public ListNode removeNodes(ListNode head) {
        Stack<Integer> st = new Stack<>();
        ListNode temp = head;
        while(temp != null){
            while(!st.empty() && temp.val > st.peek()){
                st.pop();
            }
            st.push(temp.val);
            temp = temp.next;
        }
        ListNode curr = head;
        for(int i = 0; i < st.size(); i++){
            curr.next = new ListNode(st.get(i));
            curr = curr.next;
            if(i == st.size() - 1) curr.next = null;
        }
        return head.next;
    }
}