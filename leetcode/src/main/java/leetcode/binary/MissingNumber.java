package leetcode.binary;

public class MissingNumber {
    // n , [0, n] and missing one value;
    // [0, 1, 3] missing 2
    // index: 0, 1, 2

    // [0, 1]
    // index: 0, 1
    // missing 2
    public int missingNumber(int[] nums) {
        int res = nums.length;
        for(int i = 0; i < nums.length; i++) {
            res = res ^ i ^ nums[i];
        }
        return res;
    }
}
