package leetcode.linkedlist;

import util.ListNode;

public class SwapNodesInPairs {
    // recursion
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = head.next;
        head.next = swapPairs(head.next.next);
        newHead.next = head;
        return newHead;
    }    
}
