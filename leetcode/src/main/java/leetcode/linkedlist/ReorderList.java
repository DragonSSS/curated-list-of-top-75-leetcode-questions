package leetcode.linkedlist;

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

    public void reorderList_2r(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        ListNode pre = null;
        while(fast != null && fast.next != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        pre.next = null;
        ListNode list2 = reverse_2r(slow);
        
        ListNode list1 = head;
        merge_2r(list1, list2);
    }
    
    private ListNode reverse_2r(ListNode node) {
        ListNode pre = null;
        while(node != null) {
            ListNode temp = node.next;
            node.next = pre;
            pre = node;
            node = temp;
        }
        return pre;
    }

    private void merge_2r(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while(list1 != null && list2 != null) {
            cur.next = list1;
            list1 = list1.next;
            cur = cur.next;
            cur.next = list2;
            list2 = list2.next;
            cur = cur.next;
        }
        if (list1 != null ) {
            cur.next = list1;
        }
        if (list2 != null ) {
            cur.next = list2;
        }
        dummy.next = null;
    }

    public void reorderList_3r(ListNode head) {
        if (head.next == null)
            return;
        ListNode slow = head, fast = head, pre = null;
        
        
        while(fast != null && fast.next != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        pre.next = null;
        ListNode head1 = head;
        ListNode head2 = reverse_3r(slow);
        
        
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        
        while(head1 != null && head2 != null) {
            cur.next = head1;
            head1 = head1.next;
            cur = cur.next;
            cur.next = head2;
            head2 = head2.next;
            cur = cur.next;
        }
        
        if (head1 != null) {
            cur.next = head1;
        }
        
        if (head2 != null) {
            cur.next = head2;
        }
        
        dummy.next = null;
    }
    
    private ListNode reverse_3r(ListNode head) {
        ListNode pre = null;
        while( head != null) {
           ListNode temp = head.next;
            head.next = pre;
            pre = head;
            head = temp;
        }
        
        return pre;
    }
}


