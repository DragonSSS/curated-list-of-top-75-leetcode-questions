package leetcode.linkedlist;

import util.ListNode;

public class RemoveNthNodeFromEndOfList {
    // two pointer with sliding window
    // dummy--1--2--3--4--5, n=2;
    // slow     fast
    // dummy--1--2--3--4--5--null, n=2;
    //             slow  fast
    // slow.next = slow.next.next;

    // dummy--1--null, n=1;
    // slow  fast
    // slow.next = slow.next.next;
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;

        while(fast.next != null) {
            fast = fast.next;
            // let fast move more n steps
            if(n-- <= 0) {
                slow = slow.next;
            }
        }
        slow.next = slow.next.next;

        return dummy.next;
    }

    public ListNode removeNthFromEnd_2r(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode slow = dummy;
        ListNode fast = dummy;
        
        while(fast.next != null) {
            fast = fast.next;
            if(n-- <= 0) {
                slow = slow.next;
            }
        }
        
        slow.next = slow.next.next;
        
        return dummy.next;
        
    }

    public ListNode removeNthFromEnd_3r(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode node = dummy;
        
        ListNode slow = node, fast = node;
        ListNode pre = null;
        
        int count = 0;
        while(fast != null) {
            count++;
            if (count > n) {
                pre = slow;
                slow = slow.next;
            }
            fast = fast.next;
        }
        
        pre.next = pre.next.next;
        return dummy.next;
    }

    public ListNode removeNthFromEnd_4r(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode slow = dummy, fast = dummy, pre = null;
        int count = 0;
        while(fast != null) {
            count++;
            if (count > n) {
                pre = slow;
                slow = slow.next;
            }
            fast = fast.next;
        }

        pre.next = pre.next.next;

        return dummy.next;
    }
}
