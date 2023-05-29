package leetcode.linkedlist;

import util.ListNode;

public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0)
            return head;

        ListNode dummy = head;

        // find the length and trail
        int len = 1;
        while(head.next != null) {
            head = head.next;
            len++;
        }
        // make the circle linked list
        head.next = dummy;

        ListNode trail = dummy;
        for(int i = 1; i <= len - k % len - 1; i++) {
            trail = trail.next;
        }

        ListNode newHead = trail.next;
        trail.next = null;

        return newHead;
    }

    public ListNode rotateRight_2r(ListNode head, int k) {
        if(head == null) {
            return head;
        }

        int len = 1;
        ListNode node = head;
        while(node.next != null) {
            node = node.next;
            len++;
        }

        node.next = head;


        for(int i = len - k % len; i > 1; i--) {
            head = head.next;
        }

        ListNode newHead = head.next;
        head.next = null;
        return newHead;
    }
}
