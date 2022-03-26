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

    public ListNode mergeKLists_2r(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);
        for(ListNode node : lists) {
            while(node != null) {
                ListNode temp = node.next;
                node.next = null;
                pq.offer(node);
                node = temp;
            }
        }
        
        ListNode dummy = new ListNode(0);
        ListNode node = dummy;
        while(!pq.isEmpty()) {
          node.next = pq.poll();
          node = node.next;
        }
        return dummy.next;
    }
}
