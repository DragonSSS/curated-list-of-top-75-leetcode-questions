package leetcode.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Arrays;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        if (strs == null || strs.length == 0)
            return res;

        Map<String, ArrayList<String>> map = new HashMap<>();

        for (String s : strs) {
            int[] dict = new int[26];
            for (char c : s.toCharArray()) {
                dict[c - 'a']++;
            }

            String str = Arrays.toString(dict);
            if (!map.containsKey(str))
                map.put(str, new ArrayList<>());

            map.get(str).add(s);
        }
        res.addAll(map.values());
        return res;
    }
}
