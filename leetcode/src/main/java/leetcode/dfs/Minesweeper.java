package leetcode.dfs;

public class Minesweeper {
    int[] dx = new int[] {0, 1, 0, -1, 1, -1, 1, -1};
    int[] dy = new int[] {1, 0, -1, 0, 1, -1, -1, 1};
    public char[][] updateBoard(char[][] board, int[] click) {
        int x = click[0], y = click[1];
        if (board[x][y] == 'M') {
            board[x][y] = 'X';
            return board;
        }

        dfs(x, y, board);
        return board;
    }

    private void dfs(int x, int y, char[][] board) {
        // check boundary and board[x][y] != 'E'
        if (x < 0 || x >= board.length || y < 0 || y >= board[0].length || board[x][y] != 'E') {
            return;
        }
        int count = getNumsOfMines(x, y, board);
        if (count == 0) {
            board[x][y] = 'B';
            for (int i = 0; i < 8; i++) {
                int nx = x + dx[i], ny = y + dy[i];
                dfs(nx, ny, board);
            }
        } else {
            board[x][y] = (char)('0' + count);
        }
    }

    private int getNumsOfMines(int x, int y, char[][] board) {
        int count = 0;
        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i], ny = y + dy[i];
            // check boundary
            if (nx < 0 || nx >= board.length || ny < 0 || ny >= board[0].length) continue;
            if (board[nx][ny] == 'M' || board[nx][ny] == 'X') {
                count++;
            }
        }
        return count;
    }
}
