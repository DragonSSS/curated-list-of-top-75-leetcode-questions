package leetcode.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortTheJumbledNumbers {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        Map<Integer, Integer> intMap = new HashMap<>();
        for(int i = 0 ; i < mapping.length; i++) {
            intMap.put(i, mapping[i]);
        }

        List<int[]> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            String strNum = String.valueOf(num);
            StringBuilder sb = new StringBuilder();
            for(char c: strNum.toCharArray()) {
                sb.append((char)((intMap.get(c - '0') + '0')));
            }
            int mappedNum = Integer.valueOf(sb.toString());
            list.add(new int[]{i, mappedNum});
        }
        list.sort((a, b) -> a[1] != b[1]? a[1] - b[1] : a[0] - b[0]);
        int[] res = new int[nums.length];
        for(int i = 0; i < list.size(); i++) {
            res[i] = nums[list.get(i)[0]];
        }
        return res;
    }    
}
