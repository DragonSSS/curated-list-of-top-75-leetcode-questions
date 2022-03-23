package leetcode.linkedlist;

import util.ListNode;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        // return helper(head, null);
        if (head == null)
            return head;

        ListNode pre = null;

        while(head != null) {
            ListNode temp = head.next;
            head.next = pre;
            pre = head;
            head = temp;
        }

        return pre;
    }

    // recursion
    // private ListNode helper(ListNode node, ListNode pre) {
    //     if (node == null)
    //         return pre;

    //     ListNode temp = node.next;
    //     node.next = pre;
    //     return helper(temp, node);
    // }

    public ListNode reverseList_2r(ListNode head) {
        if(head == null)
            return head;
        
        ListNode pre = null;
        while(head != null) {
            ListNode temp = head.next;
            head.next = pre;
            pre = head;
            head = temp;
        }
        
        return pre;
    }
}
