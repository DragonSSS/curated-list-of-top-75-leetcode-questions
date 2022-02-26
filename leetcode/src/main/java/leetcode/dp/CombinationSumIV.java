package leetcode.dp;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class CombinationSumIV {
    // top-down recursion + memorization
    public int combinationSum4(int[] nums, int target) {
        Integer[] memo = new Integer[target + 1];
        return helper(nums, target, memo);
    }

    private int helper(int[] nums, int target, Integer[] memo) {
        if (target == 0)
            return 1;

        if (memo[target] != null)
            return memo[target];

        int res = 0;
        for(int num : nums) {
            if (num <= target) {
                res += helper(nums, target - num, memo);
            }
        }
        memo[target] = res;
        return res;
    }
    
    Map<Integer, Integer> memo = new HashMap<>();
    public int combinationSum4_2r(int[] nums, int target) {
        if (target == 0)
            return 1;
        
        if (memo.containsKey(target))
            return memo.get(target);
        
        int res = 0;
        for(int num : nums) {
            if(target - num >= 0) {
                res += combinationSum4_2r(nums, target - num);
            }
        }
        
        memo.put(target, res);
        return res;
    }

    public int combinationSum4_2r_bfs_tle(int[] nums, int target) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(target);
        
        int res = 0;
        
        while(!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int cur = queue.poll();
                if (cur == 0) {
                    res++;
                    continue;
                }
                for(int num : nums) {
                    if (cur - num >= 0) {
                        queue.offer(cur - num);
                    }
                }
            }
        }
        
        return res;
    }
}
