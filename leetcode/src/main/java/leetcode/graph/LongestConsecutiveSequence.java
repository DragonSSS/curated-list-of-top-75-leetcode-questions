package leetcode.graph;

import java.util.Arrays;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        Arrays.sort(nums);

        int res = 1;
        for(int i = 0; i < nums.length; i++) {
            int index = i;
            int count = 1;
            while(index < nums.length - 1 && (nums[index] == nums[index + 1] || nums[index] + 1 == nums[index + 1])) {
                if (nums[index] == nums[index + 1]) {
                    index++;
                } else {
                    count++;
                    index++;
                }
            }
            i = index;
            res = Math.max(res, count);
        }

        return res;
    }
}
