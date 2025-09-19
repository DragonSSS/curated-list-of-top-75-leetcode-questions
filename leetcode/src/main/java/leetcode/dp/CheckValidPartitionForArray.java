package leetcode.dp;

public class CheckValidPartitionForArray {
    // dfs + memeorization
    public boolean validPartition(int[] nums) {
        Boolean[] memo = new Boolean[nums.length];
        return dfs(0, nums, memo);
    }

    private boolean dfs(int index, int[] nums, Boolean[] memo) {
        int size = nums.length;
        if (index == size) {
            return true;
        }

        if (size - index < 2) {
            return false;
        }

        if (memo[index] != null) {
            return memo[index];
        }

        boolean take2 = (nums[index] == nums[index + 1]) && dfs(index + 2, nums, memo);

        if (size - index < 3) {
            return memo[index] = take2;
        }

        boolean take3 = ((nums[index] == nums[index + 1] && nums[index + 1] == nums[index + 2]) || (nums[index] + 1 == nums[index + 1] && nums[index + 1] + 1 == nums[index + 2])) && dfs(index + 3, nums, memo);
        return memo[index] = take2 || take3;
    }    
}
