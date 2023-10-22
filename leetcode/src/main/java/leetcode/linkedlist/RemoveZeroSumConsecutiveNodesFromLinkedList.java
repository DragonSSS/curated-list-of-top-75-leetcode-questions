package leetcode.linkedlist;

import java.util.HashMap;
import java.util.Map;
import util.ListNode;

public class RemoveZeroSumConsecutiveNodesFromLinkedList {
    // 1,2,-3,3,1
    // prefix sum: 1, 3, 0, 3, 4
    // map: (1, 1) - (3, 2) - (0, -3) - (3, 3) - (4, 1)
    
    // 1,2,3,-3,4
    // prefix sum: 1, 3, 6, 3, 6
    public ListNode removeZeroSumSublists(ListNode head) {
        Map<Integer, ListNode> map = new HashMap<>(0);
        int sum = 0;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;
        while(cur != null) {
            sum += cur.val;
            map.put(sum, cur);
            cur = cur.next;
        }
        
        cur = dummy;
        sum = 0;
        while(cur != null) {
            sum += cur.val;
            cur.next = map.get(sum).next; // trick
            cur = cur.next;
        }
        return dummy.next;
    }

    // hashmap + prefix sum
    public ListNode removeZeroSumSublists_2r(ListNode head) {
        Map<Integer, ListNode> map = new HashMap<>();
        int sum = 0;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode node = dummy;
        while(node != null) {
            sum += node.val;
            map.put(sum, node);
            node = node.next;
        }

        node = dummy;
        sum = 0;
        while(node != null) {
            sum += node.val;
            node.next = map.get(sum).next;
            node = node.next;
        }
        return dummy.next;
    }
}
