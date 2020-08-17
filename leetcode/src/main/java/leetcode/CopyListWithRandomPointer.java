package leetcode;

public class CopyListWithRandomPointer {

    class Node {
        public int val;
        public Node next;
        public Node random;

        public Node() {}

        public Node(int _val,Node _next,Node _random) {
            val = _val;
            next = _next;
            random = _random;
        }
    };

    public Node copyRandomList(Node head) {
        if (head == null) return head;
        Node root = new Node(head.val, null, null);
        Node newHead = root;
        while (head != null) {
            if (head.random != null){
                root.random = new Node(head.random.val, null, null);
            } else
                root.random = null;
            if(head.next != null) {
                root.next = new Node(head.next.val, null, null);
            } else
                root.next = null;

            root = root.next;
            head = head.next;
        }
        return newHead;
    }
}
