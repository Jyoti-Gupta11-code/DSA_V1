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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0 ,lenB = 0 ;
        ListNode tempA = headA , tempB = headB ;


        // lenth find kar rahe hai dono ki 
        while (tempA != null) {
            lenA++;
            tempA = tempA.next;
        }


         while (tempB != null) {
            lenB++;
            tempB = tempB.next;
        }


         
        
         // length dono ki equal kaar rahe hai 
             while (lenA > lenB) {
            headA = headA.next;
            lenA--;
        }
        
            while (lenB > lenA) {
            headB= headB.next;
            lenB--;
        }

 // Move together
        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        
        return headA;
        
    }
}