package leetcode.heap;

import util.ListNode;

import java.util.PriorityQueue;
import java.util.Queue;

public class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0)
            return null;

        Queue<ListNode> heap = new PriorityQueue<ListNode>((a, b) -> a.val - b.val);

        for(ListNode node : lists) {
            if (node != null)
                heap.offer(node);
        }

        ListNode dummy = new ListNode();
        ListNode node = dummy;
        while (!heap.isEmpty()) {
            node.next = heap.poll();
            node = node.next;

            if (node.next!= null) {
                heap.offer(node.next);
            }
        }

        return dummy.next;
    }
}