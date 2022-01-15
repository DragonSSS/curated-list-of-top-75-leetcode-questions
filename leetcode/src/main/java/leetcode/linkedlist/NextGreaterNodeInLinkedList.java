package leetcode.linkedlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import util.ListNode;

public class NextGreaterNodeInLinkedList {
    public int[] nextLargerNodes(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        ListNode node = head;
        while(node != null) {
            list.add(node);
            node = node.next;
        }
        
        int[] res = new int[list.size()];
        // monotonic stack
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < list.size(); i++) {
            while(!stack.isEmpty() && list.get(stack.peek()).val < list.get(i).val) {
                res[stack.pop()] =  list.get(i).val;
            }
            stack.push(i);
        }
        return res;
    }
}
