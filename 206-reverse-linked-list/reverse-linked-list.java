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
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return  head;
        }

        ListNode prev = head;
        ListNode curr = prev.next;
        while(curr != null){
            ListNode next = curr.next;

            curr.next = prev;

            prev = curr;
            curr = next;
        }

        head.next = null;
        return prev;
    }
}