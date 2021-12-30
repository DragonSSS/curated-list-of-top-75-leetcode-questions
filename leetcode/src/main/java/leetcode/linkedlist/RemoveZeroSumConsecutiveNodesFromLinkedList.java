package leetcode.linkedlist;

import util.ListNode;
import java.util.Map;
import java.util.HashMap;

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
}
