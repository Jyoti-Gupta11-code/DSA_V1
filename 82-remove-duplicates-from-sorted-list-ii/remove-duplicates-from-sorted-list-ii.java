class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;

        while (head != null) {

            // Duplicate found
            if (head.next != null && head.val == head.next.val) {

                // Skip all nodes with same value
                while (head.next != null && head.val == head.next.val) {
                    head = head.next;
                }

                // Remove all duplicates
                prev.next = head.next;
            }
            else {
                // Current node is unique
                prev = prev.next;
            }

            head = head.next;
        }

        return dummy.next;
    }
}