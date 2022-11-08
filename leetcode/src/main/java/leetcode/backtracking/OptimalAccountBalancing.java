package leetcode.backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OptimalAccountBalancing {
    // 0 -> 1 = 10;
    // 0 : -10
    // 1 : 10
    
    
    // 2 -> 0 = 5;
    // 2 : -5
    // 0 : -10 + 5 = -5;
    
    // 0: -5, 1: 10, 2: -5
    public int minTransfers(int[][] transactions) {
        // backtracking
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] transaction : transactions) {
            int from = transaction[0];
            int to = transaction[1];
            int amount = transaction[2];
            map.put(from, map.getOrDefault(from, 0) - amount);
            map.put(to, map.getOrDefault(to, 0) + amount);
        }
        
        List<Integer> list = new ArrayList<>();
        for(int val : map.values()) {
            if (val != 0)
                list.add(val);
        }
        
        return helper(0, list);
    }
    
    private int helper(int index, List<Integer> list) {
        if (index == list.size())
            return 0;
        
        if (list.get(index) == 0)
            return helper(index + 1, list);
        
        int cur = list.get(index);
        int res = Integer.MAX_VALUE;
        for(int i = index + 1; i < list.size(); i++) {
            int next = list.get(i);
            if (cur * next < 0) {
                list.set(i, cur + next);
                res = Math.min(res, 1 + helper(index + 1, list));
                list.set(i, next);
                
                if (cur + next == 0)
                    break;
            }
        }
        return res;
    }    
}
