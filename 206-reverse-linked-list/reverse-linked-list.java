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
        // 3 pounter is used in the reverse of linklist 
        ListNode prev = null ;
        ListNode curr = head  ;
        ListNode next = null ;
        while( curr != null){
         next   = curr.next ;
         curr.next = prev ;
         prev = curr;
         curr = next ;
        }
         return prev ;
        
    }
}