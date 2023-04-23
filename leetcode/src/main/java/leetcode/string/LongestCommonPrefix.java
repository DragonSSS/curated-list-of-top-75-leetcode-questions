package leetcode.string;

import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1)
            return strs[0];
        
        Arrays.sort(strs);
        int index = 0;
        String first = strs[0];
        String last = strs[strs.length - 1];
        while(index < first.length() && first.charAt(index) == last.charAt(index)) {
            index++;
        }
        
        return index == 0 ? "" : first.substring(0, index);
    }    

    // Trie
    class TrieNode {
        TrieNode[] children;
        boolean isEnd;
        int count;

        public TrieNode() {
            children = new TrieNode[26];
            isEnd = false;
            count = 0;
        }
    }
    TrieNode root = new TrieNode();

    public String longestCommonPrefix_2r(String[] strs) {
        for(String s : strs) {
            insert(s);
        }
        return search(strs[0], strs.length);
    }

    private void insert(String s) {
        TrieNode node = root;
        for(char c : s.toCharArray()) {
            if (node.children[c - 'a'] == null) {
                node.children[c - 'a'] = new TrieNode();
            }
            node.children[c - 'a'].count++;
            node = node.children[c - 'a'];
        }
        node.isEnd = true;
    }

    private String search(String s, int total) {
        TrieNode node = root;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(node.children[c - 'a'] != null && node.children[c - 'a'].count == total) {
                node = node.children[c - 'a'];
            } else {
                return s.substring(0, i);
            }
        }
        return s;
    }
}
