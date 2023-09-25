package leetcode.dp;

public class ChampagneTower {
    public double champagneTower(int poured, int query_row, int query_glass) {
        double[][] tower = new double[101][101];
        tower[0][0] = (double) poured;
        for(int r = 0; r <= query_row; r++) {
            for(int c = 0; c <= r; c++) {
                double next = (tower[r][c] - 1) / 2.0;
                if (next > 0) {
                   tower[r + 1][c] += next;
                   tower[r + 1][c + 1] += next; 
                }
            }
        }
        return Math.min(1.0, tower[query_row][query_glass]);
    }
}
