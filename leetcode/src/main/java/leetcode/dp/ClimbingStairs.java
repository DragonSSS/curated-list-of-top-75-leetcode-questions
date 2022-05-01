package leetcode.dp;

import java.util.Map;
import java.util.HashMap;

public class ClimbingStairs {
    // 1 <= n <= 45
    // step 1 or 2 to n
    // n = 0, count = 0;
    // n = 1, count = 1;
    // n = 2, count = 2;
    // top-down
    private int[] memo = new int[46];
    public int climbStairs(int n) {
        int res = 0;

        if (n == 0)
            res = 0;

        if (n == 1)
            res = 1;

        if (n == 2)
            res = 2;

        if (n > 2 && memo[n] == 0)
            res = climbStairs(n - 1) + climbStairs(n - 2);

        if (n > 2 && memo[n] != 0)
            res = memo[n];

        memo[n] = res;
        return res;
    }

    int[] steps = new int[]{1, 2};
    public int climbStairs_dfs(int n) {
        Map<Integer, Integer> memo = new HashMap<>();
        return helper(n, memo);
    }

    private int helper(int remain, Map<Integer, Integer> memo) {
        if (memo.containsKey(remain))
            return memo.get(remain);
        int res = 0;
        if (remain < 0)
            return 0;
        if (remain == 0) {
            return 1;
        }
        
        for (int next : steps) {
           res += helper(remain - next, memo);
        }
        memo.put(remain, res);
        return res;
    }

    // 1 -> 1
    // 2 -> 2
    // 3 -> [2] + [1] = 3
    // 4 -> [2] + [3] = 5
    public int climbStairs_2r_dp(int n) {
        int[] dp = new int[n + 1];
        if (n == 1)
            return 1;
        
        if (n == 2)
            return 2;
        
        dp[1] = 1;
        dp[2] = 2;
        
        for(int i = 3; i <= n; i++) {
            dp[i] = dp[i - 2] + dp[i - 1];
        }
        
        return dp[n];
    }
    
    public int climbStairs_2r_recursion_memo(int n) {
        return helper(n, new Integer[n + 1]);
    }
    
    private int helper(int n, Integer[] memo) {
        if (n == 1)
            return 1;
        
        if (n == 2)
            return 2;
        
        if(memo[n] != null)
            return memo[n];
        
        
        int res = helper(n - 1, memo) + helper(n - 2, memo);
         
        memo[n] = res;
        return res;
    }

    public int climbStairs_3r(int n) {
        if (n == 1)
            return 1;
        
        if (n == 2)
            return 2;
        
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        
        for(int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        
        return dp[n];
    }
}
