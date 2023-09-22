package leetcode.array;

public class MinimumOperationsToReduceXToZero {
    public int minOperations(int[] nums, int x) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        int res = -1;
        int target = sum - x;
        int left = 0;
        int curSum = 0;
        for (int right = 0; right < nums.length; right++) {
            curSum += nums[right];

            // do this before curSum == target to avoid missing case
            while(left <= right && curSum > target) {
                curSum -= nums[left];
                left++;
            }

            if (curSum == target) {
                res = Math.max(res, right - left + 1);
            }
        }
        return res == -1 ? -1 : nums.length - res;
    }    
}
