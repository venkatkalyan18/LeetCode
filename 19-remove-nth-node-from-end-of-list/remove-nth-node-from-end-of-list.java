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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null){
            return null;
        }

        if(size(head) ==n){
            return head.next;
        }

        int reqSize = size(head) - n;
        ListNode curr = head;
        while(curr!=null && reqSize>1){
            curr = curr.next;
            reqSize--;
        }

        curr.next = curr.next.next;

        return head;
    }

    public int size(ListNode head){
        ListNode fp = head;
        ListNode sp = head;
        int s = 0;
        while(fp != null && fp.next!=null){
            fp = fp.next.next;
            sp = sp.next;
            s++;
        }

        s= s*2;

        if(fp==null){
            return s;
        }

        return s+1;
    }
}