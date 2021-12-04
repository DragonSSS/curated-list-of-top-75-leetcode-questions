package leetcode.bfs;

import java.util.Set;
import java.util.HashSet;
import java.util.Queue;
import java.util.LinkedList;

public class MinimumKnightMoves {
    int[][] dirs = new int[][]{{-2, -1}, {-1, -2}, {1, -2}, {2, -1}, {-2, 1}, {-1, 2}, {1, 2}, {2, 1}};
    public int minKnightMoves(int x, int y) {
        // check only positive instead of checking both negative and positive
        int absx = Math.abs(x);
        int absy = Math.abs(y);
        Set<String> visited = new HashSet<>();
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0});
        visited.add("0_0");
        
        int res = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] cur = queue.poll();
                if (cur[0] == absx && cur[1] == absy)
                    return res;
                for (int[] dir : dirs) {
                    int newx = Math.abs(cur[0] + dir[0]);
                    int newy = Math.abs(cur[1] + dir[1]);
                    int[] next = new int[]{newx, newy};
                    if(visited.contains(next[0] + "_" + next[1]))
                        continue;
                    visited.add(next[0] + "_" + next[1]);
                    queue.offer(next);
                }
            }
            res++;
        }
        
        return res;
    }
}
