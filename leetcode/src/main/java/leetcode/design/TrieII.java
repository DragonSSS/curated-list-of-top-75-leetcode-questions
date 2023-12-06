package leetcode.design;

public class TrieII {
    class Node {
        Node[] children;
        int endCount;
        int startCount;

        public Node() {
            children = new Node[26];
            endCount = 0;
            startCount = 0;
        }
    }

    Node root;
    public TrieII() {
        root = new Node();
    }
    
    public void insert(String word) {
        Node node = root;
        for(char c: word.toCharArray()) {
            if (node.children[c - 'a'] == null) {
                node.children[c - 'a'] = new Node();
            }
            node = node.children[c - 'a'];
            node.startCount++;
        }
        node.endCount++;
    }
    
    public int countWordsEqualTo(String word) {
        Node node = root;
        for(char c: word.toCharArray()) {
            if (node.children[c - 'a'] == null) {
                return 0;
            }
            node = node.children[c - 'a'];
        }
        return node.endCount;
    }
    
    public int countWordsStartingWith(String prefix) {
        Node node = root;
        for(char c: prefix.toCharArray()) {
            if (node.children[c - 'a'] == null) {
                return 0;
            }
            node = node.children[c - 'a'];
        }
        return node.startCount;
    }
    
    public void erase(String word) {
        Node node = root;
        for(char c: word.toCharArray()) {
            node = node.children[c - 'a'];
            node.startCount--;
        }
        node.endCount--;
    }    
}
