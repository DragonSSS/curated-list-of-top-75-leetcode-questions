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

    // memorization
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
}
