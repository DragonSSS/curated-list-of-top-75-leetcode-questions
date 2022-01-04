package leetcode.array;

import java.util.Arrays;

public class MaximumProfitInJobScheduling {
        // O(n^2)
    // dfs + memo
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int[][] jobs = new int[startTime.length][3];
        for(int i = 0; i < startTime.length; i++) {
            jobs[i] = new int[]{startTime[i], endTime[i], profit[i]};
        }
        
        Arrays.sort(jobs, (a, b) -> a[0] - b[0]);
        Integer[] memo = new Integer[jobs.length];
        return helper(0, jobs, memo);
    }
    
    private int helper(int curIndex, int[][] jobs, Integer[] memo){
        if (curIndex >= jobs.length)
            return 0;
        
        if (memo[curIndex] != null)
            return memo[curIndex];
        
        int next = jobs.length;
        for (int i = curIndex + 1; i < jobs.length; i++) {
            if (jobs[i][0] >= jobs[curIndex][1]){
                next = i;
                break;
            }
        }
        
        int include = jobs[curIndex][2] + helper(next, jobs, memo);
        int exclude = helper(curIndex + 1, jobs, memo);
        memo[curIndex] = Math.max(include, exclude);
        
        return memo[curIndex];
    }
}
