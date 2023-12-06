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
        if (head != null) {
            head.pre = node;
        }
        head = node;
        if (tail == null) {
            tail = node;
        }
    }

    // class Node {
    //     Node pre;
    //     Node next;
    //     int key;
    //     int val;
        
    //     public Node(int key, int val) {
    //         this.key = key;
    //         this.val = val;
    //     }
    // }

    // Map<Integer, Node> map;
    // int cap;
    // Node head;
    // Node tail;
    // public LRUCache(int capacity) {
    //     this.cap = capacity;
    //     map = new HashMap<>();
    // }
    
    public int get_2r(int key) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            removeNode_2r(node);
            setHead_2r(node);
            return node.value;
        } else {
            return -1;
        }
    }
    
    public void put_2r(int key, int value) {
        if(map.containsKey(key)) {
            Node node = map.get(key);
            node.value = value;
            removeNode_2r(node);
            setHead_2r(node);
        } else {
            Node node = new Node(key, value);
            if (map.size() == this.cap) {
                map.remove(tail.key);
                removeNode_2r(tail);
                setHead_2r(node);
                map.put(key, node);
            } else {
                setHead_2r(node);
                map.put(key, node); 
            }
        }
    }
    
    private void removeNode_2r(Node node) {
        Node pre = node.pre;
        Node next = node.next;
        if (pre != null) {
            pre.next = next;
        } else {
            head = next;
        }
        
        if (next != null) {
            next.pre = pre;
        } else {
            tail = pre;
        }
    }
    
    private void setHead_2r(Node node) {
        node.next = head;
        node.pre = null;
        if (head != null) {
            head.pre = node;
        }
        head = node;
        if (tail == null) {
            tail = node;
        }
    }

    private void removeNode_3r(Node node) {
        Node pre = node.pre;
        Node next = node.next;
        if(pre != null) {
            pre.next = next;
        } else {
            head = next;
        }

        if (next != null) {
            next.pre = pre;
        } else {
            tail = pre;
        }
    }

    private void setHead_3r(Node node) {
        node.next = head;
        node.pre = null;

        if (head != null) {
            head.pre = node;
        }
        head = node;
        if(tail == null) {
            tail = node;
        }
    }

    
    public int get_4r(int key) {
        if (!map.containsKey(key))
            return -1;
        Node node = map.get(key);
        removeNode_4r(node);
        setHead_4r(node);
        return node.value;
    }
    
    public void put_4r(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.value = value;
            removeNode_4r(node);
            setHead_4r(node);
        } else {
            Node node = new Node(key, value);
            if (map.size() >= cap) {
                map.remove(tail.key);
                removeNode_4r(tail);
            }
            map.put(key, node);
            setHead_4r(node);
        }
    }
    
    private void setHead_4r(Node node) {
        node.next = head;
        node.pre = null;
        
        if (head != null)
            head.pre = node;
        
        head = node;
        
        if (tail == null)
            tail = node;
    }
    
    private void removeNode_4r(Node node) {
        Node next = node.next;
        Node pre = node.pre;
        if (pre != null) {
            pre.next = next;
        } else {
            head = next;
        }
        
        if (next != null) {
            next.pre = pre;
        } else {
            tail = pre;
        }
    }

    // class Node {
    //     int key;
    //     int value;
    //     Node pre;
    //     Node next;

    //     public Node(int key, int value) {
    //         this.key = key;
    //         this.value = value;
    //     }
    // }

    // Node head;
    // Node tail;
    // Map<Integer, Node> map;
    // int size;
    // public LRUCache(int capacity) {
    //     this.size = capacity;
    //     this.map = new HashMap<>();
    // }
    
    public int get_5r(int key) {
        if(!map.containsKey(key)) {
            return -1;
        }
        Node node = map.get(key);
        removeNode_5r(node);
        setHead_5r(node);
        return node.value;
    }
    
    public void put_5r(int key, int value) {
        if(map.containsKey(key)) {
            Node node = map.get(key);
            node.value = value;
            removeNode_5r(node);
            setHead_5r(node);
        } else {
            Node node = new Node(key, value);
            if(map.size() >= cap) {
                map.remove(tail.key);
                removeNode_5r(tail);
            }
            map.put(key, node);
            setHead_5r(node);
        }
    }

    private void removeNode_5r(Node node) {
        Node pre = node.pre;
        Node next = node.next;

        if(pre != null) {
            pre.next = next;
        } else {
            head = next;
        }

        if(next != null) {
            next.pre = pre;
        } else {
            tail = pre;
        }
    }

    private void setHead_5r(Node node) {
        node.next = head;
        node.pre = null;

        if(head != null) {
            head.pre = node;
        }

        head = node;

        if(tail == null) {
            tail = node;
        }
    }
}