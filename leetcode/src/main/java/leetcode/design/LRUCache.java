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
        return 0;
    }

    public void put(int key, int value) {

    }

    private void removeNode(Node node) {

    }

    private  void setHead(Node node) {

    }
}