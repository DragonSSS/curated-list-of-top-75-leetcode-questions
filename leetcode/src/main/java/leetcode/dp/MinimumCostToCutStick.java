package leetcode.dp;

import java.util.HashMap;
import java.util.Map;

public class MinimumCostToCutStick {
    public int minCost(int n, int[] cuts) {
        // Arrays.sort(cuts);
        return helper(cuts, new HashMap<>(), 0, n);
    }

    private int helper(int[] cuts, Map<String, Integer> memo, int start, int end) {
        int res = Integer.MAX_VALUE;

        String key = start + "-" + end;
        if (memo.containsKey(key))
            return memo.get(key);

        int cost = end - start;
        for(int i = 0; i < cuts.length; i++) {
            if (cuts[i] <= start || cuts[i] >= end)
                continue;

            res = Math.min(res, helper(cuts, memo, start, cuts[i]) + cost + helper(cuts, memo, cuts[i], end));
        }

        res = res == Integer.MAX_VALUE ? 0 : res;
        memo.put(key, res);
        return res;
    }
}
