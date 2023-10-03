package leetcode.dp;

public class PredictTheWinner {
    Integer[][] memo;
    public boolean predictTheWinner(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        memo = new Integer[nums.length][nums.length];
        
        int playerOne = helper(0, nums.length - 1, nums);
        return playerOne >= (sum - playerOne);
    }

    private int helper(int left, int right, int[] nums) {
        if (left > right) {
            return 0;
        }

        if (memo[left][right] != null) {
            return memo[left][right];
        }

        // i, i + 1, i + 2...j - 1, j 
        memo[left][right] = Math.max(
            nums[left] + Math.min(
                helper(left + 2, right, nums),
                helper(left + 1, right - 1, nums)
            ),
            nums[right] + Math.min(
                helper(left, right - 2, nums),
                helper(left + 1, right - 1, nums)
            )
        );
        return memo[left][right];
    }    
}
