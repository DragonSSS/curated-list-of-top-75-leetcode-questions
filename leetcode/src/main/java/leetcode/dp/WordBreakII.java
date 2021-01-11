package leetcode.dp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordBreakII {
    public List<String> wordBreak(String s, List<String> wordDict) {
        return helper(s, wordDict, new HashMap<>());
    }

    private List<String> helper(String s, List<String> dict, Map<String, List<String>> map) {
        if(map.containsKey(s))
            return map.get(s);

        List<String> res = new ArrayList<>();
        if(s.length() == 0) {
            res.add("");
            return res;
        }

        for(String word : dict) {
            if(s.startsWith(word)) {
                String cur = s.substring(word.length());
                List<String> curRes = helper(cur, dict, map);
                for(String str : curRes) {
                    res.add(word + (str.length() == 0 ? "" : " ") + str);
                }
            }
        }

        map.put(s, res);
        return res;
    }
}
