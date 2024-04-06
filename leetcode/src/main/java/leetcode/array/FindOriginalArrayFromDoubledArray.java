package leetcode.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindOriginalArrayFromDoubledArray {
    public int[] findOriginalArray(int[] changed) {
        int n = changed.length;
        if (n == 0 || n % 2 != 0) {
            return new int[]{};
        }

        int[] res = new int[n / 2];
        int index = 0;
        Map<Integer, Integer> map  = new HashMap<>();

        Arrays.sort(changed);
        int j = n - 1;
        while(j >= 0) {
            int cur = changed[j];
            int twice = cur * 2;
            if(map.containsKey(twice)) {
                if(map.get(twice) == 1) {
                    map.remove(twice);
                } else {
                    map.put(twice, map.get(twice) - 1);
                }
                res[index++] = cur;
            } else {
                map.put(cur, map.getOrDefault(cur, 0) + 1);
            }
            j--;
        }
        return index == n / 2 ? res : new int[]{};
    }    
}
