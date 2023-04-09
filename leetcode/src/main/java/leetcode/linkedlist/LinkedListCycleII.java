package leetcode.linkedlist;

import util.ListNode;

public class LinkedListCycleII {
    // 1-------2------3-------4
    //         |              |
    //         5------6-------7

    // x = distance of start to beginning of cycle 
    // y = the travel distance in the cycle
    // slow = x + y
    // fast = x + y + C = 2(x + y)
    // x + y = C
    // x = C - y
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head, cur = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }

        if (slow != fast || fast == null || fast.next == null) {
            return null;
        }

        while(cur != slow) {
            cur = cur.next;
            slow = slow.next;
        }

        return cur;
    }    
}
