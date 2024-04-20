package leetcode.linkedlist;

import util.ListNode;

public class IntersectionOfTwoLinkedLists {
    // list a: aaaacc
    // list b: bbcc
    // aaaaccbbcc
    // bbccaaaacc
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pA = headA;
        ListNode pB = headB;
        while (pA != pB) {
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pA;  
    }    
}
