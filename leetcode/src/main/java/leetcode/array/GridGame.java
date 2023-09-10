package leetcode.array;

public class GridGame {
    public long gridGame(int[][] grid) {
        int size = grid[0].length;
        long topSum = 0, bottomSum = 0;
        long res = Long.MAX_VALUE;
        for(int i = 0; i < size; i++) {
            topSum += grid[0][i];
        }

        for(int i = 0; i < size; i++) {
            topSum -= grid[0][i];
            res = Math.min(res, Math.max(bottomSum, topSum));
            bottomSum += grid[1][i];
        }
        return res;
    }    
}
