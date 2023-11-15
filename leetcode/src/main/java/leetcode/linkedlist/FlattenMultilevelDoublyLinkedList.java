package leetcode.linkedlist;

public class FlattenMultilevelDoublyLinkedList {
    class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;
    }

    public Node flatten(Node head) {
        if (head == null) {
            return head;
        }
        Node dummy = new Node();
        helper(dummy, head);

        dummy.next.prev = null;
        return dummy.next;
    }

    private Node helper(Node pre, Node cur) {
        if (cur == null) {
            return pre;
        }
        cur.prev = pre;
        pre.next = cur;

        Node temp = cur.next;

        Node tail = helper(cur, cur.child);
        cur.child = null;

        return helper(tail, temp);
    }    
}
