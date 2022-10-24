package leetcode.bfs;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class RaceCar {
    // BFS to find the shortest path
    // visited set as string
    // queue stores position and speed
    // always try to go forward as A (overshooting)
    // under condition to reverse as R (slowly approaching)
    // - too right far and spend is positive
    // - too left far and speed is negative
    public int racecar(int target) {
        Set<String> visited = new HashSet<>();
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 1});
        
        int steps = 0;
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                int[] cur = queue.poll();
                int curPos = cur[0];
                int curV = cur[1];
                
                if (curPos == target)
                    return steps;
                
                String key = getKey(curPos, curV);
                if (visited.contains(key))
                    continue;
                visited.add(key);
                
                // always try to go forward with A
                int nextPos = curPos + curV;
                int nextV = curV * 2;
                queue.offer(new int[]{nextPos, nextV});
                
                // additionally two cases need R, overshooting now
                // detect overshooting asap instead of `curPos > target` and `curPos < target`
                if ((nextPos > target && curV > 0)
                    || (nextPos < target && curV < 0)) {
                     queue.offer(new int[]{curPos, curV > 0? -1 : 1});
                }
            }
            steps++;
        }
        return -1;
    }
    
    private String getKey(int pos, int speed) {
        return pos + ":" + speed;
    }    
}
