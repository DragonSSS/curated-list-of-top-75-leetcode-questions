package leetcode.array;

import java.util.HashSet;
import java.util.Set;

public class MaximumErasureValue {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int max = 0;
        int cur = 0;
        int start = 0;
        for(int end = 0; end < nums.length; end++) {
            while (set.contains(nums[end])) {
                set.remove(nums[start]);
                cur -= nums[start++];
            }
            cur += nums[end];
            set.add(nums[end]);
            max = Math.max(max, cur);
        }
        return max;
    }    
}
