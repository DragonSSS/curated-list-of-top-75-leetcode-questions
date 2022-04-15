package leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class WordSearch2 {

    class TreeNode {
        TreeNode[] children;
        String word;

        TreeNode() {
            children = new TreeNode[26];
            word = null;
        }
    }

    boolean[][] visited;

    public List<String> findWords(char[][] board, String[] words) {
        List<String> res = new ArrayList<>();
        if (board == null || board.length == 0 || words == null || words.length == 0)
            return res;

        visited = new boolean[board.length][board[0].length];
        TreeNode root = new TreeNode();
        buildTrie(root, words);

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (root.children[board[i][j] - 'a'] != null) {
                    dfs(board, root, i, j, res);
                }
            }
        }

        return res;
    }

    // build trie with all words
    private void buildTrie(TreeNode root,  String[] words) {
        for(String word : words) {
            TreeNode cur = root;
            for(char ch : word.toCharArray()) {
                if (cur.children[ch - 'a'] == null) {
                    cur.children[ch - 'a'] = new TreeNode();
                }
                cur = cur.children[ch - 'a'];
            }
            cur.word = word;
        }
    }

    // dfs + backtracking + trie
    private void dfs(char[][] board, TreeNode cur, int i, int j, List<String> res) {

        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || visited[i][j] || cur.children[board[i][j] - 'a'] == null)
            return;

        cur = cur.children[board[i][j] - 'a'];

        if (cur.word != null) {
            res.add(cur.word);
            cur.word = null;
        }

        visited[i][j] = true;
        dfs(board, cur, i + 1, j, res);
        dfs(board, cur, i - 1, j, res);
        dfs(board, cur, i, j + 1, res);
        dfs(board, cur, i, j - 1, res);
        visited[i][j] = false;
    }

    // class TreeNode {
    //     public TreeNode[] children;
    //     public String word;
        
    //     public TreeNode() {
    //         this.children = new TreeNode[26];
    //         this.word = null;
    //     }
    // }
    
    // boolean[][] visited;
    TreeNode root;
    int[][] dirs = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    public List<String> findWords_2r(char[][] board, String[] words) {
        List<String> res = new ArrayList<>();
        root = new TreeNode();
        visited = new boolean[board.length][board[0].length];
        
        buildTrie_2r(words);
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                char cur = board[i][j];
                if (root.children[cur - 'a'] != null) {
                    helper_2r(i, j, root, board, res);
                }
            }
        }
        
        return res;
    }
    
    private void helper_2r(int i, int j, TreeNode node, char[][] board, List<String> res) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || visited[i][j] || node.children[board[i][j] - 'a'] == null)
            return;
        
        TreeNode next = node.children[board[i][j] - 'a'];
        if (next.word != null) {
            res.add(next.word);
            // remove duplicates
            next.word = null;
        }
        
        visited[i][j] = true;
        for(int[] dir : dirs) {
            helper_2r(i + dir[0], j + dir[1], next, board, res);
        }
        visited[i][j] = false;
    }
    
    private void buildTrie_2r(String[] words) {
        for(String word : words) {
            TreeNode node = root;
            char[] chars = word.toCharArray();
            for(char c : chars) {
                if (node.children[c - 'a'] == null) {
                    node.children[c - 'a'] = new TreeNode();
                }
                node = node.children[c - 'a'];
            }
            node.word = word;
        }
    }
}
