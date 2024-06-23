/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        while(node != null && node.next!= null){
            node.val = node.next.val;
            if(node.next.next == null){
                node.next = null;
            }
            node = node.next;
           
        }

    
    }
}