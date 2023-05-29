package leetcode.heap;

import java.util.PriorityQueue;
import java.util.Queue;
import util.ListNode;

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

    // minHeap
    public ListNode mergeKLists_2r(ListNode[] lists) {
        PriorityQueue<ListNode> queue = new PriorityQueue<>((a, b) -> a.val - b.val);
        for(ListNode head : lists) {
            ListNode node = head;
            while(node != null) {
                ListNode temp = node.next;
                node.next = null;
                queue.offer(node);
                node = temp;
            }
        }
        ListNode dummy = new ListNode(0);
        ListNode node = dummy;
        while(!queue.isEmpty()) {
            ListNode cur = queue.poll();
            node.next = cur;
            node = cur;
        }
        
        return dummy.next;
    }

    public ListNode mergeKLists_3r(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);
        ListNode dummy = new ListNode(0);
        ListNode node = dummy;
        for(ListNode list : lists) {
            if(list != null) {
                pq.offer(list);
            }
        }

        while(!pq.isEmpty()) {
            ListNode curNode = pq.poll();
            ListNode nextHead = curNode.next;
            curNode.next = null;
            node.next = curNode;
            node = node.next;
            if(nextHead != null) {
                pq.offer(nextHead);
            }
        }

        return dummy.next;
    }
}