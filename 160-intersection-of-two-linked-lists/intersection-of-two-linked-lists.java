/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode a, ListNode b) {

        int s1 = 0;
        int s2 = 0;

        ListNode temp1 = a;
        while(temp1 != null){
            s1++;
            temp1 = temp1.next;
        }
        ListNode temp2 = b;
        while(temp2 != null){
            s2++;
            temp2 = temp2.next;
        }
        temp1 = a; temp2 = b;
        for(int i = 1; i <= Math.abs(s1 - s2); i++){
            if(s1 >= s2){
                temp1 = temp1.next;
            }else{
                temp2 = temp2.next;
            }
        }
        while(temp1 != temp2){
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1;
    }
}