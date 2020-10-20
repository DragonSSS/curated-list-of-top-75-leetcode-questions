package leetcode.matrix;

public class WordSearch {
    boolean[][] visited;
    public boolean exist(char[][] board, String word) {
        if (board == null || board.length == 0 || word == null)
            return false;

        int n = board.length;
        int m = board[0].length;
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(dfs(board, word, 0, i, j))
                    return true;
            }
        }

        return false;
    }

    private boolean dfs(char[][] board, String word, int index, int i, int j) {
        if (index == word.length())
            return true;

        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || visited[i][j] || board[i][j] != word.charAt(index))
            return false;

        visited[i][j] = true;
        if (dfs(board, word, index + 1, i + 1, j) ||
                dfs(board, word, index + 1, i - 1, j) ||
                dfs(board, word, index + 1, i , j + 1) ||
                dfs(board, word, index + 1, i, j - 1))
            return true;
        visited[i][j] = false;

        return false;
    }
}
