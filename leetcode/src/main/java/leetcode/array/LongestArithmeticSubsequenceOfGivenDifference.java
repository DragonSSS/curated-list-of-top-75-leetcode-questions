package leetcode.array;

import java.util.HashMap;
import java.util.Map;

public class LongestArithmeticSubsequenceOfGivenDifference {
    public int longestSubsequence(int[] arr, int difference) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int val : arr) {
            int pre = map.getOrDefault(val - difference, 0);
            map.put(val, pre + 1);
            res = Math.max(map.get(val), res);
        }
        return res;
    }    
}
