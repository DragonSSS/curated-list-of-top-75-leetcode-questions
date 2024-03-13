package leetcode.bfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class MinimumMovesToSpreadStonesOverGrid {
    public int minimumMoves(int[][] grid) {
        int[] state = new int[9];
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                state[i * 3 + j] = grid[i][j];
            }
        }

        Queue<int[]> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        int[] target = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1};

        queue.offer(state);
        visited.add(Arrays.toString(state));

        int res = 0;
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                int[] cur = queue.poll();
                if (Arrays.equals(cur, target)) {
                    return res;
                }
                for(int j = 0; j < 9; j++) {
                    if (cur[j] > 1) {
                        for(int next : findNexts(j)) {
                            int[] nextState = cur.clone();
                            nextState[j]--;
                            nextState[next]++;
                            if(!visited.contains(Arrays.toString(nextState))) {
                                visited.add(Arrays.toString(nextState));
                                queue.offer(nextState);
                            }
                        }
                    }
                }
            }
            res++;
        }
        return -1;
    }

    private List<Integer> findNexts(int index) {
        List<Integer> res = new ArrayList<>();
        int row = index / 3;
        int col = index % 3;

        if (col > 0) {
            res.add(index - 1);
        }

        if (col < 2) {
            res.add(index + 1);
        }

        if (row > 0) {
            res.add(index - 3);
        }

        if (row < 2) {
            res.add(index + 3);
        }
        return res;
    }    
}
