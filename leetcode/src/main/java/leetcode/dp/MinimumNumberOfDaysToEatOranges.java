package leetcode.dp;

import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class MinimumNumberOfDaysToEatOranges {
    Map<Integer, Integer> memo = new HashMap<>();
    public int minDays(int n) {
        if (n <= 1)
            return n;
        
        if (memo.containsKey(n))
            return memo.get(n);
        
        int res = Math.min(n % 2 + minDays(n / 2), n % 3 + minDays(n / 3)) + 1;
        memo.put(n, res);
        return res;
    }
    // bfs
    public int minDays_bfs(int n) {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(n);
        // visited.add(n);
        int res = 0;

        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                int cur = queue.poll();
                if (cur == 0)
                    return res;

                if (cur % 3 == 0) {
                    if (!visited.contains(cur / 3)) {
                        queue.offer(cur / 3);
                        visited.add(cur / 3);
                    }
                }
                if (cur % 2 == 0) {
                    if (!visited.contains(cur / 2)) {
                        queue.offer(cur / 2);
                        visited.add(cur / 2);
                    }
                }
                if (!visited.contains(cur - 1)) {
                    queue.offer(cur - 1);
                    visited.add(cur - 1);
                }
            }
            res++;
        }
        return -1;
    }

    // Map<Integer, Integer> memo = new HashMap<>();
    public int minDays_dfs(int n) {
        if (n == 1)
            return 1;
        
        if (n <= 3)
            return 2;
        
        if (memo.containsKey(n))
            return memo.get(n);
        
        int cur = n;
        if(n % 2 == 0) {
            cur = Math.min(cur, minDays(n / 2) + 1);
        } else {
            cur = Math.min(cur, minDays(n - 1) + 1);
        }
        
        if(n % 3 == 0) {
            cur = Math.min(cur, minDays(n / 3) + 1);
        } else if (n % 3 == 1) {
            cur = Math.min(cur, minDays(n - 1) + 1);
        } else {
            cur = Math.min(cur, minDays(n - 2) + 2);
        }
        memo.put(n, cur);
        return cur;
    }
}
