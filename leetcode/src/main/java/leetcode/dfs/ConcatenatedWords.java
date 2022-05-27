package leetcode.dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ConcatenatedWords {
    public List<String> findAllConcatenatedWordsInADict_dfs_without_trie(String[] words) {
        List<String> res = new ArrayList<>();
        Set<String> wordSet = new HashSet<>(Arrays.asList(words));
        Map<String, Boolean> memo = new HashMap<>();
        
        for (String word : words) {
            if (helper(word, wordSet, memo)) {
                res.add(word);
            }
        }

        return res;
    }

    private boolean helper(String word, Set<String> wordSet, Map<String, Boolean> memo) {
        if (memo.containsKey(word)){
            return memo.get(word);
        }

        for (int i = 1; i < word.length(); i++) {
            if (wordSet.contains(word.substring(0, i))) {
                String suffix = word.substring(i);
                if (wordSet.contains(suffix) || helper(suffix, wordSet, memo)) {
                    memo.put(word, true);
                    return true;
                }
            }
        }
        memo.put(word, false);
        return false;
    }

    class TrieNode {
        TrieNode[] children;
        boolean isWord;
        public TrieNode() {
            this.children = new TrieNode[26];
            this.isWord = false;
        }
    }

    private void addWord(String word) {
        TrieNode cur = root;
        for(char c : word.toCharArray()) {
            if (cur.children[c - 'a'] == null) {
                cur.children[c - 'a'] = new TrieNode();
            }
            cur = cur.children[c - 'a'];
        }
        cur.isWord = true;
    }

    TrieNode root = new TrieNode();
    public List<String> findAllConcatenatedWordsInADict_dfs_with_trie(String[] words) {
        List<String> res = new ArrayList<>();

        for (String word : words) {
            addWord(word);
        }

        for (String word : words) {
            if (helper_trie(word, 0, 0, new HashMap<>())) {
                res.add(word);
            }
        }

        return res;
    }

    private boolean helper_trie(String word, int index, int count, Map<Integer, Boolean> memo) {
        if(memo.containsKey(index)) 
            return memo.get(index);
        
        if(index == word.length()) {
            memo.put(index, count > 1);
            return count > 1;
        }

        TrieNode cur = root;
        for (int i = index; i < word.length(); i++) {
            char c = word.charAt(i);
            if (cur.children[c - 'a'] == null) {
                memo.put(index, false);
                return false;
            } else {
                cur = cur.children[c - 'a'];
                if (cur.isWord && helper_trie(word, i + 1, count + 1, memo)) {
                    memo.put(index, true);
                    return true;
                }
            }
        }
        memo.put(index, false);
        return false;
    }

    private boolean helper_3r(int index, int count, String word, Map<Integer, Boolean> memo) {
        if(index == word.length()){
            memo.put(index, count > 1);
            return count > 1;
        }

        if (memo.containsKey(index)) {
            return memo.get(index);
        }

        TrieNode node = root;
        for(int i = index; i < word.length(); i++) {
            char c = word.charAt(i);
            if (node.children[c - 'a'] == null) {
                memo.put(index, false);
                return false;
            } else {
                node = node.children[c - 'a'];
                if (node.isWord && helper_3r(index + 1, count + 1, word, memo)) {
                    memo.put(index, true);
                    return true;
                }
            }
        }
        memo.put(index, false);
        return false;
    }
}
