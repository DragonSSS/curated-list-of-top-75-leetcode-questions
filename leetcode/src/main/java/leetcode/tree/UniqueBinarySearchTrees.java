package leetcode.tree;

import java.util.HashMap;
import java.util.Map;

public class UniqueBinarySearchTrees {
    public int numTrees(int n) {
        Map<Integer, Integer> memo = new HashMap<>();
        return helper(n, memo);
//        dp version
//        int[] dp = new int[n + 1];
//        dp[0] = 1;
//        dp[1] = 1;
//
//        for(int i = 2; i <= n; i++) {
//            for(int j = 1; j <= i; j++){
//                dp[i] += dp[j - 1] * dp[i - j];
//            }
//        }
//
//        return dp[n];
    }

    private int helper(int n, Map<Integer, Integer> memo) {
        if(n <= 1)
            return 1;

        if(memo.containsKey(n))
            return memo.get(n);

        int res = 0;
        for (int i = 1; i <= n; i++) {
            res += helper(i - 1, memo) * helper( n - i, memo);
        }

        memo.put(n, res);
        return res;
    }
}
