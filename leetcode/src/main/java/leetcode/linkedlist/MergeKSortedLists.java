package leetcode.linkedlist;

import util.ListNode;

import java.util.PriorityQueue;
import java.util.Queue;

public class MergeKSortedLists {
    // O(nklogk)
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        Queue<ListNode> queue = new PriorityQueue<>((a, b) -> a.val - b.val);

        for (ListNode node : lists) {
            if (node != null) {
                queue.offer(node);
            }
        }

        ListNode dummy = new ListNode();
        ListNode node = dummy;

        while (!queue.isEmpty()) {
            node.next = queue.poll();
            node = node.next;

            if(node.next != null) {
                queue.offer(node.next);
            }
        }
        return dummy.next;
    }
}
