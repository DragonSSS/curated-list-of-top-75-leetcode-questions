package leetcode.dp;

public class DeleteAndEarn {
    // similar to house robber, we could convert this problem to exact one
    public int deleteAndEarn(int[] nums) {
        int n = 10001;
        Integer[] memo = new Integer[n];
        int[] maps = new int[n];
        
        for (int num : nums) {
            maps[num]++;
        }
        
        return helper(maps, 0, memo);
    }
    
    private int helper(int[] maps, int index, Integer memo[]) {
        if (index >= maps.length) {
            return 0;
        }
        
        if(memo[index] != null) {
            return memo[index];
        }
        
        int res = Math.max(helper(maps, index + 1, memo), helper(maps, index + 2, memo) + index * maps[index]);
        memo[index] = res;
        return res;
    }
    
    public int deleteAndEarn_dp(int[] nums) {
        int[] sum = new int[100001];
        int max = 0;
        for(int num : nums) {
            sum[num] += num;
            max = Math.max(max, num);
        }
        
        for(int i = 2; i <= max; i++) {
            sum[i] = Math.max(sum[i - 1], sum[i - 2] + sum[i]);
        }
        return sum[max];
    }
}
