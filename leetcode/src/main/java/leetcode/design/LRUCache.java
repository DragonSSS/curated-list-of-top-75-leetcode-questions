package leetcode.design;

import java.util.HashMap;
import java.util.Map;

class Node {
    int key;
    int value;
    Node pre;
    Node next;

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

public class LRUCache {
    Node head, tail; // head and tail nodes of double linked list
    Map<Integer, Node> map; // key - node.key, val - node
    int cap = 0;
    public LRUCache(int capacity) {
        this.cap = capacity;
        this.map = new HashMap<>();
    }

    public int get(int key) {
        if(!map.containsKey(key))
            return -1;
        Node node = map.get(key);
        removeNode(node);
        setHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        if(map.containsKey(key)) {
            Node node = map.get(key);
            node.value = value;
            removeNode(node);
            setHead(node);
        } else {
            Node node = new Node(key, value);
            if (map.size() >= cap) {
                map.remove(tail.key);
                tail = tail.pre;
                if (tail != null)
                    tail.next = null;
                setHead(node);
                map.put(key, node);
            } else {
                setHead(node);
                map.put(key, node);
            }
        }
    }

    private void removeNode(Node node) {
        Node cur = node;
        Node pre = cur.pre;
        Node next = cur.next;

        if (pre != null) {
            pre.next = next;
        } else  {
            head = next;
        }

        if (next != null) {
            next.pre = pre;
        } else {
            tail = pre;
        }
    }

    private void setHead(Node node) {
        node.next = head;
        node.pre = null;
        if ( head != null) {
            head.pre = node;
        }
        head = node;
        if (tail == null) {
            tail = node;
        }
    }
}