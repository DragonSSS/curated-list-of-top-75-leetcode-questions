package leetcode.string;

import java.util.List;

public class LengthOfLongestValidSubstring {
    class TrieNode {
        TrieNode[] children;
        boolean isWord;

        public TrieNode() {
            this.children = new TrieNode[26];
            this.isWord = false;
        }
    }

    TrieNode root = new TrieNode();
    public int longestValidSubstring(String word, List<String> forbidden) {
        for(String s : forbidden) {
            insertWord(s);
        }

        int left = 0, right = 0;
        int res = 0;
        for(;right < word.length(); right++) {
            // use `while` instead of `if`
            while(isForbidden(word, left, right)) {
                left++;
            }
            res = Math.max(res, right - left + 1);
        }
        return res;
    }

    private void insertWord(String word) {
        TrieNode node = root;
        // reverse
        for(int i = word.length() - 1; i >= 0; i--) {
            char c = word.charAt(i);
            if (node.children[c - 'a'] == null) {
                node.children[c - 'a'] = new TrieNode();
            }
            node = node.children[c - 'a'];
        }
        node.isWord = true;
    }

    // forbidden = ["aaa","cb"]
    // bccb
    private boolean isForbidden(String word, int left, int right) {
        TrieNode node = root;
        // reverse
        for(int i = right; i >= left; i--) {
            char c = word.charAt(i);
            if (node.children[c - 'a'] == null) {
                return false;
            }
            node = node.children[c - 'a'];
            if(node.isWord) {
                return true;
            }
        }
        return false;
    }    
}
