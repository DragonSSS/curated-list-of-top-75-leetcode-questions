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

    int[][] dirs = new int[][]{{0,1}, {1,0}, {0,-1}, {-1,0}};
    public boolean exist_2r(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        boolean[][] visited;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                visited = new boolean[m][n];
                if(helper_2r(i, j, 0, board, word, visited)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean helper_2r(int i, int j, int index, char[][] board, String word, boolean[][] visited) {
        if(index == word.length())
            return true;
        
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || visited[i][j] || board[i][j] != word.charAt(index))
            return false;
        
        visited[i][j] = true;
        
        for(int[] dir : dirs) {
            if(helper_2r(i + dir[0], j + dir[1], index + 1, board, word, visited)) {
                return true;
            }
        }
        
        visited[i][j] = false;
        return false;
    }

    // int[][] dirs = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    public boolean exist_3r(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(helper_3r(i, j, 0, word, board, new boolean[row][col])){
                    return true;
                }
            }
        }
        
        return false;
    }
    
    private boolean helper_3r(int i, int j, int index, String s, char[][] board, boolean[][] visited) {
        if(index == s.length())
            return true;
        if( i < 0  || i >= board.length || j < 0 || j >= board[0].length || visited[i][j] || board[i][j] != s.charAt(index))
            return false;
        
        visited[i][j] = true;
        for(int[] dir : dirs) {
            int x = i + dir[0];
            int y = j + dir[1];
            
            if (helper_3r(x, y, index + 1, s, board, visited)) {
                return true;
            }
        }
        visited[i][j] = false;
        return false;
    }

    // int[][] dirs = new int[][]{{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
    public boolean exist_4r(char[][] board, String word) {
        int m = board.length, n = board[0].length;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(board[i][j] == word.charAt(0) && helper_4r(board, word, 1, i, j, new boolean[m][n])) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean helper_4r(char[][] board, String word, int index, int i, int j, boolean[][] visited) {
        if (index == word.length()) {
            return true;
        }

        visited[i][j] = true;
        for(int[] dir : dirs) {
            int x = i + dir[0];
            int y = j + dir[1];
            if(x < 0 || x >= board.length || y < 0 || y >= board[0].length || visited[x][y] || word.charAt(index) != board[x][y]) {
                continue;
            }

            if (helper_4r(board, word, index + 1, x, y, visited)) {
                return true;
            }
        }
        visited[i][j] = false;
        return false;
    }
}
