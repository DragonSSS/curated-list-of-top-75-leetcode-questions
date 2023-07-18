package leetcode.backtracking;

public class SudokuSolver {
    public void solveSudoku(char[][] board) {
        helper(board);
    }

    private boolean helper(char[][] board) {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(board[i][j] == '.') {
                    for(char c = '1'; c <= '9'; c++) {
                        if(isValid(board, i, j, c)) {
                            board[i][j] = c;

                            if(helper(board)) {
                                return true;
                            } else {
                                board[i][j] = '.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isValid(char[][] board, int i, int j, char c) {
        for(int col = 0; col < board[0].length; col++) {
            if(board[i][col] == c) {
                return false;
            }
        }

        for(int row = 0; row < board.length; row++) {
            if(board[row][j] == c) {
                return false;
            }
        }

        for(int m = (i / 3) * 3; m < (i / 3) * 3 + 3; m++) {
            for(int n = (j / 3) * 3; n < (j / 3) * 3 + 3; n++) {
                if(board[m][n] == c) {
                    return false;
                }
            }
        }
        return true;
    }    
}
