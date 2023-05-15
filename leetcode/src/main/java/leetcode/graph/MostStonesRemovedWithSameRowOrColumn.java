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
}
