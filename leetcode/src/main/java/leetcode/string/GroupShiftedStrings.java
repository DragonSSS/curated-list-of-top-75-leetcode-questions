package leetcode.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupShiftedStrings {
    // abc -> 0, 1, 2
    // bcd -> 0, 1, 2
    // xyz -> 0, 1, 2
    public List<List<String>> groupStrings(String[] strings) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strings) {
            String key = generateHashKey(s);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }
        
        List<List<String>> res = new ArrayList<>();
        for(Map.Entry<String, List<String>> entry : map.entrySet()) {
            res.add(new ArrayList<>(entry.getValue()));
        }
        
        return res;
    }
    
    private String generateHashKey(String s) {
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        char base = chars[0];
        int[] key = new int[chars.length];
        for(int i = 0; i < chars.length; i++) {
            int val = chars[i] - base;
            if (val < 0) {
                val += 26;
            }
            key[i] = val;
        }
        return Arrays.toString(key);
    }    
}
