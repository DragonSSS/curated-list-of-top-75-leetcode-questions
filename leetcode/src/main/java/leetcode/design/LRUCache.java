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
    Node head, tail;
    Map<Integer, Node> map;
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
            if (map.size() < cap) {

            } else {

            }
        }
    }

    private void removeNode(Node node) {

    }

    private  void setHead(Node node) {

    }
}