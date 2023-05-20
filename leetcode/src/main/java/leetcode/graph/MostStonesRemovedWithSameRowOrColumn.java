package leetcode.graph;

import java.util.HashSet;
import java.util.Set;

public class MostStonesRemovedWithSameRowOrColumn {
    // dfs
    Set<String> visited;
    public int removeStones(int[][] stones) {
        visited = new HashSet<>();
        int total = stones.length;
        int islands = 0;
        for(int[] stone : stones) {
            String key = stone[0] + ":" + stone[1];
            if(!visited.contains(key)) {
                helper(stones, stone);
                islands++;
            }
        } 
        return total - islands;
    }

    private void helper(int[][] stones, int[] cur) {
        int x = cur[0], y = cur[1];
        String key = x + ":" + y;
        visited.add(key);
        for(int[] stone : stones) {
            if ((stone[0] == x || stone[1] == y) && !visited.contains(stone[0] + ":" + stone[1])) {
                helper(stones, stone);
            } 
        }
    }
 
    // union-find
    int[] parents;
    int[] ranking;
    public int removeStones_union_find(int[][] stones) {
        int n = stones.length;
        parents = new int[n];
        ranking = new int[n];
        for(int i = 0; i < n; i++) {
            parents[i] = i;
        }

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if((stones[i][0] == stones[j][0] || stones[i][1] == stones[j][1])) {
                    union(i, j);
                }
            }
        }

        int count = 0;
        for(int i = 0; i < n; i++) {
            if(parents[i] == i) {
                count++;
            }
        }
        return n - count;
    }

    private void union(int s1, int s2) {
        int p1 = find(s1);
        int p2 = find(s2);

        if(p1 == p2) {
            return;
        }

        if(ranking[p1] > ranking[p2]) {
            parents[p2] = p1;
        } else if(ranking[p1] < ranking[p2]) {
            parents[p1] = p2;
        } else {
            parents[p2] = p1;
            ranking[p1]++;
        }
    }

    private int find(int stone) {
        while(stone != parents[stone]) {
            stone = parents[stone];
        }
        return parents[stone];
    }    
}
