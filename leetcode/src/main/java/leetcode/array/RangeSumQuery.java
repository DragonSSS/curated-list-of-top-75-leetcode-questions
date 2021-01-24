package leetcode.array;

public class RangeSumQuery {
    private int[] sums;

    public RangeSumQuery(int[] nums) {
        int len = nums.length;
        this.sums = new int[len];
        if (len != 0)
            sums[0] = nums[0];
        for(int i = 1; i < len; i++) {
            sums[i] = sums[i - 1] + nums[i];
        }
    }

    public int sumRange(int i, int j) {
        if (i == 0)
            return sums[j];

        return sums[j] - sums[i - 1];
    }
}
