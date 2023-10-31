public class BattleshipsInBoard {
    int[][] dirs = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    boolean[][] visited;
    public int countBattleships(char[][] board) {
        int m = board.length, n = board[0].length;
        visited = new boolean[m][n];
        int count = 0;

        for(int i = 0 ; i < m ; i++) {
            for(int j = 0; j < n; j++) {
                if(!visited[i][j] && board[i][j] == 'X') {
                    helper(i, j, board);
                    count++;
                }
            }
        }
        return count;
    }

    private void helper(int i, int j, char[][] board) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || visited[i][j] || board[i][j] != 'X') {
            return;
        }

        visited[i][j] = true;
        for(int[] dir : dirs) {
            helper(i + dir[0], j + dir[1], board);
        }
    }    
}
