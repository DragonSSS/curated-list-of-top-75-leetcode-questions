package leetcode.linkedlist;

import util.ListNode;

public class ReverseNodesInKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode node = head;
        // count starts with 0
        int count = 0;
        // e.g.
        // count = 0 1 2,  k = 3
        // node will be the k + 1 node
        while(count < k) {
            if (node == null)
                return head;
            node = node.next;
            count++;
        }
        // 1-2-3  4-5
        // 2-3    1-4-5   2 is head, 1 is pre
        // 3    2-1-4-5   3 is head, 2 is pre
        // 3-2-1-4-5     null is head, 3 is pre
        ListNode pre = reverseKGroup(node, k);
        while(count-- > 0) {
            ListNode temp = head.next;
            head.next = pre;
            pre = head;
            head = temp;
        }
        return pre;
    }
}
