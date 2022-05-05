package leetcode.dp;

public class HouseRobber {
    Integer[] memo;
    public int rob(int[] nums) {
        memo = new Integer[nums.length + 1];
        // return helper_2r(nums, 0);
        return helper(nums, 0, memo);
    }

    private int helper(int[] nums, int cur, Integer[] memo){
        if (cur >= nums.length)
            return 0;

        if (memo[cur] != null)
            return memo[cur];

        int res1 = 0, res2 = 0;

        res1 = helper(nums, cur + 2, memo) + nums[cur];
        res2 = helper(nums, cur + 1, memo);

        int res = Math.max(res1, res2);
        memo[cur] = res;

        return res;
    }

    private int helper_2r(int[] nums, int index) {
        if(index >= nums.length)
            return 0;
        if(memo[index] != null)
            return memo[index];
        
        int skip = helper_2r(nums, index + 1);
        int nonSkip = helper_2r(nums, index + 2) + nums[index];
        
        int res = Math.max(skip, nonSkip);
        memo[index] = res;
        
        return res;
    }

        // O(n)
        Integer[] memo_3r;
        public int rob_3r(int[] nums) {
            memo_3r = new Integer[nums.length];
            return helper_3r(0, nums);
        }
        
        private int helper_3r(int index, int[] nums) {
            if (index >= nums.length) {
                return 0;
            }
            
            if (memo_3r[index] != null) {
                return memo_3r[index];
            }
            
            int with = helper_3r(index + 2, nums) + nums[index];
            int without = helper_3r(index + 1, nums);
            
            int res = Math.max(with, without);
            memo_3r[index] = res;
            return res;
        }
}
