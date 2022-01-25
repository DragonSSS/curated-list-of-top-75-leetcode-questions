package leetcode.bfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class OpenTheLock {
    // bfs
    public int openLock(String[] deadends, String target) {
        Set<String> deadendsSet = new HashSet<>(Arrays.asList(deadends));
        if (deadendsSet.contains("0000"))
            return -1;
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        int res = 0;
        queue.offer("0000");
        visited.add("0000");
        
        while(!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String cur = queue.poll();
                if (cur.equals(target)) // no ==
                    return res;
                List<String> nexts = findNexts(cur);
                for (String next : nexts) {
                    if (deadendsSet.contains(next) || visited.contains(next))
                        continue;
                    visited.add(next);
                    queue.offer(next);
                }
                
            }
            res += 1;
        }
        return -1;
    }
    
    private List<String> findNexts(String s) {
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i < sb.length(); i++) {
            int cur = sb.charAt(i) - '0';
            int minus = (10 + cur - 1) % 10;
            int add = (cur + 1) % 10;
            sb.setCharAt(i, (char) (minus + '0'));
            String s1 = sb.toString();
            res.add(s1);
            sb.setCharAt(i, (char) (add + '0'));
            String s2 = sb.toString();
            res.add(s2);
            sb.setCharAt(i, (char) (cur + '0'));
        }
        return res;
    }    
}
