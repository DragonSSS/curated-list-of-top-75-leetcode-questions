package leetcode.linkedlist;

import util.ListNode;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null)
            return false;

        if (head.next == null)
            return false;

        ListNode slow = head.next;
        ListNode fast = head.next.next;

        while (fast != null && fast.next != null) {
            if (slow == fast)
                return true;
            slow = slow.next;
            fast = fast.next.next;

        }

        return false;
    }
}