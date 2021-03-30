package leetcode.dp;

public class UniquePaths {
    public int uniquePaths(int m, int n) {
        Integer[][] memo = new Integer[m][n];
        return helper(m, n, 0, 0, memo);
    }

    private int helper(int m, int n, int curRow, int curCol, Integer[][] memo) {
        if (curRow >= m || curCol >= n)
            return 0;

        if (curRow == (m - 1) && curCol == (n - 1))
            return 1;

        if (memo[curRow][curCol] != null)
            return memo[curRow][curCol];

        int res = 0;

        res += helper(m, n, curRow + 1, curCol, memo);
        res += helper(m, n, curRow, curCol + 1, memo);
        memo[curRow][curCol] = res;

        return res;
    }
}
