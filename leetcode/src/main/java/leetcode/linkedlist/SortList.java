package leetcode.linkedlist;

import util.ListNode;

public class SortList {
    public ListNode sortList(ListNode head) {
        // It is important to return head if it is null or its next is null, otherwise stack overflow happens
        // e.g. if head is single node, cause line 20 NPE first
        if (head == null || head.next == null) {
            return head;
        }

        ListNode pre = null, slow = head, fast = head;
        while(fast != null && fast.next != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        pre.next = null;
        
        ListNode node1 = sortList(head);
        ListNode node2 = sortList(slow);

        return merge(node1, node2);
    }

    private ListNode merge(ListNode node1, ListNode node2) {
        ListNode dummy = new ListNode(0);
        ListNode node = dummy;
        while(node1 != null && node2 != null) {
            if(node1.val < node2.val) {
                node.next = node1;
                node1 = node1.next;
            } else {
                node.next = node2;
                node2 = node2.next;
            }
            node = node.next;
        }

        if (node1 != null) {
            node.next = node1;
        } else if (node2 != null) {
            node.next = node2;
        }

        return dummy.next;
    }    
}
