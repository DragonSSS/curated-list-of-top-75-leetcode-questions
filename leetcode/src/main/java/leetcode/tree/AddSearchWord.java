package leetcode.tree;

public class AddSearchWord {
    class WordDictionary {

        class TreeNode {
            public TreeNode[] children;
            public boolean isWord;

            TreeNode() {
                this.children = new TreeNode[26];
                this.isWord = false;
            }
        }

        TreeNode root;
        /** Initialize your data structure here. */
        public WordDictionary() {
            this.root = new TreeNode();
        }

        /** Adds a word into the data structure. */
        public void addWord(String word) {
            char[] chars = word.toCharArray();
            TreeNode node = root;
            for (char c : chars) {
                if (node.children[c - 'a'] == null)
                    node.children[c - 'a'] = new TreeNode();
                node = node.children[c - 'a'];
            }
            node.isWord = true;

        }

        /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
        public boolean search(String word) {
            return helper(word, 0, root);
        }

        private  boolean helper(String word, int index, TreeNode node) {
            if (index == word.length())
                return node.isWord;

            char c = word.charAt(index);

            if (c == '.') {
                for (int i = 0; i < 26; i++) {
                    if (node.children[i] != null && helper(word, index + 1, node.children[i]))
                        return true;
                }
                return false;
            } else {
                return node.children[c - 'a'] != null && helper(word, index + 1, node.children[c - 'a']);
            }
        }
        
        public void addWord_2r(String word) {
            char[] chars = word.toCharArray();
            TreeNode node = root;
            for (char c : chars) {
                if (node.children[c - 'a'] == null) {
                    node.children[c - 'a'] = new TreeNode();
                }
                node = node.children[c - 'a'];
            }
            node.isWord = true;
        }
        
        public boolean search_2r(String word) {
            return helper_2r(0, word, root);
        }
        
        private boolean helper_2r(int index, String word, TreeNode node) {
            if (index == word.length())
                return node.isWord;
            
            char cur = word.charAt(index);
            if(cur == '.') {
                for(int i = 0; i < 26; i++) {
                    if(node.children[i] != null && helper_2r(index + 1, word, node.children[i]))
                        return true;
                }
                return false;
            } else {
                return node.children[cur - 'a'] != null && helper_2r(index + 1, word, node.children[cur - 'a']);
            }
        }
    }

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */
}
