package leetcode.design;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AutocompleteSystem {
    class TrieNode implements Comparable<TrieNode> {
        TrieNode[] children;
        int times;
        List<TrieNode> hotList; // store top 3 sentences that pass through this node
        String sentence;

        public TrieNode(){
            children = new TrieNode[27];
            times = 0;
            hotList = new ArrayList<>();
            sentence = null;
        }

        public int compareTo(TrieNode that) {
            if (this.times == that.times) {
                return this.sentence.compareTo(that.sentence);
            }
            return that.times - this.times; // 3, 2, 1
        }

        public void updateHotList(TrieNode endSentenceNode) {
            if (!hotList.contains(endSentenceNode)) {
                hotList.add(endSentenceNode);
            }

            Collections.sort(hotList);
            if (hotList.size() > 3) {
                hotList.remove(hotList.size() - 1);
            }
        }
    }

    TrieNode root;
    TrieNode cur;
    StringBuilder sb;
    public AutocompleteSystem(String[] sentences, int[] times) {
        root = new TrieNode();
        cur = root;
        sb = new StringBuilder();
        for (int i = 0 ; i < sentences.length; i++) {
            addSentence(sentences[i], times[i]);
        }
    }

    private void addSentence(String sentence, int times) {
        TrieNode node = root;
        List<TrieNode> visited = new ArrayList<>();
        for (int i = 0; i < sentence.length(); i++) {
            int childIndex = sentence.charAt(i) == ' ' ? 26 : sentence.charAt(i) - 'a';
            if (node.children[childIndex] == null) {
                node.children[childIndex] = new TrieNode();
            }
            node = node.children[childIndex];
            visited.add(node);
        }
        node.times += times;
        node.sentence = sentence;

        for (TrieNode n : visited) {
            n.updateHotList(node);
        }
    }

    public List<String> input(char c) {
        List<String> res = new ArrayList<>();

        // exit and clean 
        if (c == '#') {
            addSentence(sb.toString(), 1);
            cur = root;
            sb = new StringBuilder();
            return res;
        }

        sb.append(c);
        int childIndex = c == ' ' ? 26 : c - 'a';
        if (cur != null) {
            cur = cur.children[childIndex];
        }

        if (cur == null) {
            return res;
        }

        for (TrieNode n : cur.hotList) {
            res.add(n.sentence);
        }
        return res;
    }
}
