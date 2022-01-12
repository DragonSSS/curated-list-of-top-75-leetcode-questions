package leetcode.array;

import java.util.Map;
import java.util.HashMap;

public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        // key - prefix sum, val - count
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int preSum = 0;
        int res = 0;
        for (int i = 0 ; i < nums.length; i++) {
            preSum += nums[i];
            if (map.containsKey(preSum - k)) {
                res += map.get(preSum - k);
            }
            map.put(preSum, map.getOrDefault(preSum, 0) + 1);
        }
        
        return res;
    }
}
