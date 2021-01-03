package leetcode.linkedlist;

import org.w3c.dom.ls.LSException;
import util.ListNode;

public class ReorderList {
    // 1-2-3-4
    // 0-1-2-3
    // 1-4-2-3
    // 0-3-1-2

    // 1-2-3-4-5
    // 1-5-2-4-3

    // find the mid to split two linked lists
    // reverse second one
    // merge two linked list into one
    public void reorderList(ListNode head) {
        if (head == null || head.next == null)
            return;

        ListNode pre = null;
        ListNode slow = head;
        ListNode fast = head;
        ListNode head1 = head;

        while(fast != null && fast.next != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        pre.next = null;

        ListNode head2 = reverse(slow);

        merge(head1, head2);
    }

    private ListNode reverse(ListNode head) {
        ListNode node = head;
        ListNode pre = null;

        while(node != null) {
            ListNode temp = node.next;
            node.next = pre;
            pre = node;
            node = temp;
        }

        return pre;
    }

    private void merge(ListNode l1, ListNode l2) {
        while (l1 != null) {
            ListNode n1 = l1.next;
            ListNode n2 = l2.next;

            l1.next = l2;

            if(n1 == null)
                break;

            l2.next = n1;
            l1 = n1;
            l2 = n2;
        }
    }
}


