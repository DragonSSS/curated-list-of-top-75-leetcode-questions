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

    public boolean hasCycle_2r(ListNode head) {        
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                return true;
            }
        }
        
        return false;
    }

    public boolean hasCycle_3r(ListNode head) {
        ListNode slow = head, fast = head;
        
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if (slow == fast)
                return true;
        }
        
        return false;
    }
}
