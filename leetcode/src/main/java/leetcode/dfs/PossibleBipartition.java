package leetcode.dfs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PossibleBipartition {
    // dfs
    Map<Integer, List<Integer>> graph = new HashMap<>();
    Integer[] colors;
    public boolean possibleBipartition(int n, int[][] dislikes) {
        colors = new Integer[n + 1];
        for(int i = 1; i <= n; i++) {
            graph.putIfAbsent(i, new ArrayList<>());
        }

        for(int[] dislike: dislikes) {
            graph.get(dislike[0]).add(dislike[1]);
            graph.get(dislike[1]).add(dislike[0]);
        }

        for(int i = 1; i <= n; i++) {
            if(colors[i] == null && !helper(i, 1)) {
                return false;
            }
        }
        return true;
    }

    private boolean helper(int cur, int color) {
        colors[cur] = color;
        for(int next : graph.get(cur)) {
            if (colors[next] == null) {
                if(!helper(next, color * -1)) {
                    return false;
                }
            } else if (colors[next] == color) {
                return false;
            }
        }
        return true;
    }    
}
