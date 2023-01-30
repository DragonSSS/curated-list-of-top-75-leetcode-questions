package leetcode.dp;

import java.util.List;

public class Triangle {
    // top-down + memorization
    Integer[][] memo;
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        memo = new Integer[n][n];
        return  helper(triangle, 0, 0);
    }
    
    private int helper(List<List<Integer>> triangle, int i, int j) {
        if (memo[i][j] != null)
            return memo[i][j];
        
        int curVal = triangle.get(i).get(j);
        int minSumVal = curVal;
        if (i < triangle.size() - 1) {
            minSumVal = curVal + Math.min(helper(triangle, i + 1, j), helper(triangle, i + 1, j + 1));
        }
        
        memo[i][j] = minSumVal;
        return minSumVal;
    }    
}
