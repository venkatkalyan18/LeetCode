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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] grid = new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(grid[i],-1);
        }
        int topRow = 0;
        int bottomRow = m - 1;
        int leftCol = 0;
        int rightCol = n - 1;
        while(head != null){
            for(int i = leftCol ;i<=rightCol && head != null;i++){
                grid[topRow][i] = head.val;
                head = head.next;
            }
            topRow++;
            for(int i= topRow ;i<=bottomRow && head != null;i++ ){
                grid[i][rightCol] = head.val;
                head = head.next;
            }
            rightCol--;
            for(int i =rightCol;i>=leftCol && head != null;i--){
                grid[bottomRow][i] = head.val;
                head = head.next;
            }
            bottomRow--;
            for(int i=bottomRow;i>=topRow && head != null;i--){
                grid[i][leftCol] = head.val;
                head = head.next;
            }
            leftCol++;
        }
        return grid;
    }
}