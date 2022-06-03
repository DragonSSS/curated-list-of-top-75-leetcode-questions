package leetcode.design;

public class FindWinnerOnTicTacToeGame {
    public String tictactoe(int[][] moves) {
        int[] row = new int[3];
        int[] col = new int[3];
        int leftTopToRightBottom = 0;
        int rightTopToLeftBottom = 0;
        
        boolean isA = true;
        for(int[] move: moves) {
            int moveValue = isA? 1 : -1;
            int i = move[0];
            int j = move[1];
            row[i] += moveValue;
            col[j] += moveValue;
            if(i == j) leftTopToRightBottom += moveValue;
            if(i + j == 2) rightTopToLeftBottom += moveValue;
            
            if(row[i] == 3 || col[j] == 3 || leftTopToRightBottom == 3 || rightTopToLeftBottom == 3)
                return "A";
            
            if(row[i] == -3 || col[j] == -3 || leftTopToRightBottom == -3 || rightTopToLeftBottom == -3)
                return "B";
            
            
            isA = !isA;
        }
        
        return moves.length == 9 ? "Draw" : "Pending";
    }
}
