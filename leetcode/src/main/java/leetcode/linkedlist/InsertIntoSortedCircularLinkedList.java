package leetcode.linkedlist;

public class InsertIntoSortedCircularLinkedList {

    class Node {
        public int val;
        public Node next;
    
        public Node() {}
    
        public Node(int _val) {
            val = _val;
        }
    
        public Node(int _val, Node _next) {
            val = _val;
            next = _next;
        }
    }

    public Node insert(Node head, int insertVal) {
        if (head == null) {
            Node cur = new Node(insertVal);
            cur.next = cur;
            return cur;
        }

        Node cur = head.next;
        Node pre = head;
        boolean found = false;
        while(cur != head) {
            int curVal = cur.val;
            int preVal = pre.val;
            if (preVal == insertVal 
            || (insertVal > preVal && insertVal <= curVal) 
            || (curVal < preVal && insertVal > preVal) 
            || (curVal < preVal && insertVal < curVal )) {
                found = true;
                Node insert = new Node(insertVal);
                pre.next = insert;
                insert.next = cur;
                break;
            }
            pre = cur;
            cur = cur.next;
        }

        if (!found) {
            Node insert = new Node(insertVal);
            pre.next = insert;
            insert.next = cur;
        }

        return head;
    }    
}
