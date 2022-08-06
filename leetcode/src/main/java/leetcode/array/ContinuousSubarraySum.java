package leetcode.array;

import java.util.HashMap;
import java.util.Map;

public class ContinuousSubarraySum {
    // prefix sum with hashmap
    public boolean checkSubarraySum(int[] nums, int k) {
        // key = prefix sum, val = index
        Map<Integer, Integer> map = new HashMap<>();
        // initialize map with index -1 with prefix sum 0
        map.put(0, -1);
        int sum = 0;
        
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int curRemainder = sum % k;
            if (curRemainder == 0 && i > 0) {
                return true;
            // as (i, j]
            } else if (map.containsKey(curRemainder) && i - map.get(curRemainder) > 1) {
                return true;
            } else if (!map.containsKey(curRemainder)) {
                map.put(curRemainder, i);
            }
        }
        return false;
    }    
}
