package leetcode.array;

import java.util.HashMap;
import java.util.Map;

public class MinimumNumberOfOperationsToMakeArrayEmpty {
    // hashmap: num -> its frequency
    public int minOperations(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int res = 0;
        for(int val : map.values()) {
            if (val == 1) {
                return -1;
            }

            res += Math.ceil((double) val / 3);
        }
        return res;
    }    
}
