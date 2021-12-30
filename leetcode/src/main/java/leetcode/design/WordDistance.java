package leetcode.design;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class WordDistance {
    Map<String, List<Integer>> map = new HashMap<>();;

    public WordDistance(String[] wordsDict) {
        for (int i = 0; i < wordsDict.length; i++) {
            map.putIfAbsent(wordsDict[i], new ArrayList<>());
            map.get(wordsDict[i]).add(i);
        }
    }
    
    public int shortest(String word1, String word2) {
        List<Integer> list1 = map.get(word1);
        List<Integer> list2 = map.get(word2);
        int res = Integer.MAX_VALUE;
        for(int i = 0, j = 0; i < list1.size() && j < list2.size();) {
            if (list1.get(i) < list2.get(j)) {
                res = Math.min(res, list2.get(j) - list1.get(i));
                i++;
            } else {
                res = Math.min(res, list1.get(i) - list2.get(j));
                j++;
            }
        }
        return res;
    }
}
