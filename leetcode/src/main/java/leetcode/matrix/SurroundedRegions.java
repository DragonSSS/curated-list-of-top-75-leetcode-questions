package leetcode.matrix;

public class SurroundedRegions {
    public void solve(char[][] board) {
        if (board == null || board[0].length == 0)
            return;

        int row = board.length;
        int col = board[0].length;

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(i == 0 || i == row - 1 || j == 0 || j == col - 1) {
                    if(board[i][j] == 'O')
                        helper(row, col, i, j, board); // find the island that cannot be flipped
                }
            }
        }


        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(board[i][j] == '*') {
                    board[i][j] = 'O';
                } else {
                    board[i][j] = 'X';
                }
            }
        }
    }

    private void helper(int n, int m, int i, int j, char[][] board) {
        if (i < 0 || i >= n || j < 0 || j >= m)
            return;

        if (board[i][j] == 'X' || board[i][j] == '*') //X or has been visited
            return;

        board[i][j] = '*'; //cannot be flipped
        helper(n, m, i + 1, j, board);
        helper(n, m, i, j + 1, board);
        helper(n, m, i - 1, j, board);
        helper(n, m, i, j - 1, board);
    }
}
