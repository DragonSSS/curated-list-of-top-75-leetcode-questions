package leetcode.design;

public class MyHashMap {
    class ListNode {
        int key;
        int value;
        ListNode next;
        
        // we store both key and value in ListNode
        public ListNode(int key, int value){
            this.key = key;
            this.value = value;
        }
    }
    
    ListNode[] array;

    public MyHashMap() {
        array = new ListNode[10001];
    }
    
    public void put(int key, int value) {
        int index = this.hash(key);
        ListNode head = array[index];
        ListNode node = head;
        while(node != null) {
            if (node.key == key) {
                node.value = value;
                return;
            }
            node = node.next;
        }
        ListNode newNode = new ListNode(key, value);
        newNode.next = head;
        array[index] = newNode;
    }
    
    public int get(int key) {
        int index = this.hash(key);
        ListNode node = array[index];
        while(node != null) {
            if (node.key == key) {
                return node.value;
            }
            node = node.next;
        }
        return -1;
    }
    
    public void remove(int key) {
        int index = this.hash(key);
        ListNode head = array[index];
        ListNode dummy = new ListNode(-2, -2);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode node = head;
        while(node != null) {
            if (node.key == key) {
                pre.next = node.next;
            }
            pre = node;
            node = node.next;
        }
        
        array[index] = dummy.next;
    }
    
    private int hash(int key) {
        return Integer.hashCode(key) % 10001; // it is equal to key % 10001 ;-)
    }
}
