package leetcode.design;

public class TicTacToe {
    int[][] matrix;
    int size;
    public TicTacToe(int n) {
        matrix = new int[n][n];
        size = n;
    }
    
    public int move(int row, int col, int player) {
        if (row < 0 || row >= size || col < 0 || col >= size) return 0;
        if (matrix[row][col] != 0) return 0;
        matrix[row][col] = player == 1 ? 1 : 2;
        
        // check if the player win the game by this move
        if (checkVertical(col, player)) return player;
        if (checkHorizontal(row, player)) return player;
        if (checkDiagonal(row, col, player)) return player;
        
        return 0;
    }
    
    private boolean checkVertical(int col, int player) {
        for (int i = 0; i < size; i++) {
            if (matrix[i][col] != player)
                return false;
        }
        return true;
    }
    
    private boolean checkHorizontal(int row, int player) {
        for (int i = 0; i < size; i++) {
            if (matrix[row][i] != player)
                return false;
        }
        return true;
    }
    
    private boolean checkDiagonal(int row, int col, int player) {
        if ((row != col) && (row != size - col - 1))
            return false;
        
        boolean topLeftToBottomRight = true, topRightToBottomLeft = true;
        
        for (int i = 0; i < size; i++) {
                if (matrix[i][i] != player)
                    topLeftToBottomRight = false;
        }
        
        for (int i = 0; i < size; i++) {
            if (matrix[i][size- i - 1] != player)
                topRightToBottomLeft = false;
        }
        return topLeftToBottomRight || topRightToBottomLeft;
    }
}
