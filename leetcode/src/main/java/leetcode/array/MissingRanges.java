package leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingRanges {
    public List<List<Integer>> findMissingRanges(int[] nums, int lower, int upper) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length == 0) {
            res.add(Arrays.asList(lower, upper));
            return res;
        }

        if (lower < nums[0]) {
            res.add(Arrays.asList(lower, nums[0] - 1));
        }

        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i + 1] - nums[i] <= 1) {
                continue;
            }
            res.add(Arrays.asList(nums[i] + 1, nums[i + 1] - 1));
        }

        if (upper > nums[nums.length - 1]) {
            res.add(Arrays.asList(nums[nums.length - 1] + 1, upper));
        }
        return res;
    }    
}
