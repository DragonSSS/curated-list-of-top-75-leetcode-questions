package leetcode.design;

import java.util.Map;
import java.util.HashMap;

public class SparseVector {
    Map<Integer, Integer> map;
    SparseVector(int[] nums) {
        map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                this.map.put(i, nums[i]);
            }
        }
    }
    
	// Return the dotProduct of two sparse vectors
    public int dotProduct(SparseVector vec) {
        int res = 0;
        if (this.map.size() == 0 || vec.map.size() == 0) return res;
        for (Map.Entry<Integer, Integer> entry : this.map.entrySet()) {
            int index = entry.getKey();
            int val = entry.getValue();
            if (!vec.map.containsKey(index)) continue;
            res += val * vec.map.get(index);
        }

        return res;
    }
}
