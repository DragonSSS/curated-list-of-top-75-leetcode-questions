package leetcode.string;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s) {
        int res = 0;
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        char pre = 'M';
        for(int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            int curVal = map.get(cur);
            int preVal = map.get(pre);
            pre = cur;
            if(curVal > preVal) {
                res = res - preVal + (curVal - preVal);
            } else {
                res += curVal;
            }
        }
        return res;
    }    
}
