package leetcode.bfs;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class PerfectSquares {
    public int numSquares(int n) {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(n);
        int count = 0;
        
        while(!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int cur = queue.poll();
                if (cur == 0) return count;
                
                for(int j = 1; j <= Math.sqrt(cur); j++) {
                    int next = cur - (j*j);
                    if (visited.contains(next)) continue;
                    
                    visited.add(next);
                    queue.offer(next);
                }
            }
            count++;
        }
        
        return count;
    }    
}
