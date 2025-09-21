package leetcode.array;

import java.util.HashSet;
import java.util.Set;

public class MaximumErasureValue {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int res = 0;
        int curMax = 0;
        int start = 0;
        for(int end = 0; end < nums.length; end++) {
            while (set.contains(nums[end])) {
                set.remove(nums[start]);
                curMax -= nums[start++];
            }
            curMax += nums[end];
            set.add(nums[end]);
            res = Math.max(res, curMax);
        }
        return res;
    }    
}
