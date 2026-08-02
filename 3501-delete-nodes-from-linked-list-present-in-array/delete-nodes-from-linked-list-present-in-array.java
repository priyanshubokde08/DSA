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
    static boolean search(int arr[], int x){
        int n = arr.length;
        int left = 0; int right = n -1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(arr[mid] == x) return true;
            else if(arr[mid] > x) right = mid -1;
            else left = mid + 1;
        }
        return false;
    }
    public ListNode modifiedList(int[] nums, ListNode head){
    Arrays.sort(nums);
    ListNode dummy = new ListNode(0);
    dummy.next = head;

    ListNode prev = dummy;
    ListNode curr = head;
    while(curr != null){
        if(search(nums, curr.val)){
            prev.next = curr.next; // a temporary currnt node
        }else{
            prev = curr;
        }
        curr = curr.next;
    }
    return dummy.next;
    }
}