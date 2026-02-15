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
    public ListNode rotateRight(ListNode head, int k) {
        
        // Step 1: Edge cases
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        // Step 2: Find length
        int length = 1;
        ListNode tail = head;
        
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        // Step 3: Reduce k
        k = k % length;
        if (k == 0) return head;

        // Step 4: Make circular
        tail.next = head;

        // Step 5: Find new tail
        int stepsToNewTail = length - k;
        ListNode newTail = head;

        for (int i = 1; i < stepsToNewTail; i++) {
            newTail = newTail.next;
        }

        // Step 6: Break circle
        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }
}
