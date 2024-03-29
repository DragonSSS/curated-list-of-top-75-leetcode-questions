package leetcode.tree;

public class Trie {
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
    public Trie() {
        this.root = new TreeNode();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        char[] chars = word.toCharArray();
        TreeNode node = this.root;

        for (char c : chars) {
            if (node.children[c - 'a'] == null) {
                node.children[c - 'a'] = new TreeNode();
            }
            node = node.children[c - 'a'];
        }

        node.isWord = true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        char[] chars = word.toCharArray();
        TreeNode node = root;

        for (char c : chars) {
            if (node.children[c - 'a'] == null)
                return false;
            node = node.children[c - 'a'];
        }

        return node.isWord;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        char[] chars = prefix.toCharArray();
        TreeNode node = root;

        for (char c : chars) {
            if (node.children[c - 'a'] == null)
                return false;
            node = node.children[c - 'a'];
        }

        return true;
    }

    // class TreeNode {
    //     public TreeNode[] children;
    //     public boolean isWord;
        
    //     public TreeNode() {
    //         this.children = new TreeNode[26];
    //         this.isWord = false;
    //     }
    // }

    // TreeNode root;
    /** Initialize your data structure here. */
    // public Trie() {
    //     root = new TreeNode();
    // }
    
    /** Inserts a word into the trie. */
    public void insert_2r(String word) {
        char[] chars = word.toCharArray();
        TreeNode node = root;
        for(char c : chars) {
            if(node.children[c - 'a'] == null) {
                node.children[c - 'a'] = new TreeNode();
            }
            node = node.children[c - 'a'];
        }
        node.isWord = true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search_2r(String word) {
        char[] chars = word.toCharArray();
        TreeNode node = root;
        
        for(char c : chars) {
            if(node.children[c - 'a'] == null) {
                return false;
            }
            node = node.children[c - 'a'];
        }
        
        return node.isWord;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith_2r(String prefix) {
        char[] chars = prefix.toCharArray();
        TreeNode node = root;
        
        for(char c : chars) {
            if(node.children[c - 'a'] == null) {
                return false;
            }
            node = node.children[c - 'a'];
        }
        
        return true;
    }

    // class TreeNode {
    //     TreeNode[] children;
    //     boolean isWord;
        
    //     public TreeNode() {
    //         children = new TreeNode[26];
    //         isWord = false;
    //     }
    // }
    
    // TreeNode root;
    // /** Initialize your data structure here. */
    // public Trie() {
    //     root = new TreeNode();
    // }
    
    /** Inserts a word into the trie. */
    public void insert_3r(String word) {
        TreeNode node = root;
        for(char c : word.toCharArray()) {
            if (node.children[c - 'a'] == null) {
                node.children[c - 'a'] = new TreeNode();
            }
            node = node.children[c - 'a'];
        }
        node.isWord = true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search_3r(String word) {
        TreeNode node = root;
        for(char c : word.toCharArray()) {
            if (node.children[c - 'a'] == null) {
                return false;
            }
            node = node.children[c - 'a'];
        }
        return node.isWord;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith_3r(String prefix) {
        TreeNode node = root;
        for(char c : prefix.toCharArray()) {
            if (node.children[c - 'a'] == null) {
                return false;
            }
            node = node.children[c - 'a'];
        }
        return true;
    }

    class TrieNode {
        public TrieNode[] children;
        public boolean isWord;

        public TrieNode() {
            children = new TrieNode[26];
            isWord = false;
        }
    }

    TrieNode rootNode;
    // public Trie() {
    //     rootNode = new TrieNode();
    // }
    
    public void insert_4r(String word) {
        TrieNode node = rootNode;
        for(char c : word.toCharArray()) {
            if (node.children[c - 'a'] == null) {
                node.children[c - 'a'] = new TrieNode();
            }
            node = node.children[c - 'a'];
        }
        node.isWord = true;
    }
    
    public boolean search_4r(String word) {
        TrieNode node = rootNode;
        for(char c : word.toCharArray()) {
            if (node.children[c - 'a'] == null) {
                return false;
            }
            node = node.children[c - 'a'];
        }

        return node.isWord;
    }
    
    public boolean startsWith_4r(String prefix) {
        TrieNode node = rootNode;
        for(char c : prefix.toCharArray()) {
            if (node.children[c - 'a'] == null) {
                return false;
            }
            node = node.children[c - 'a'];
        }
        return true;
    }
}
