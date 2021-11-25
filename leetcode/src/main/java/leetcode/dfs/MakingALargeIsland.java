package leetcode.dfs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

public class MakingALargeIsland {
    // group island by index
    // int groups[][]
    // dfs finds all groups
    // Map<Integer, Integer> groupArea, key is group id, value is the area
    // find all grid[][] = 0, four directions, find max area
    int[][] dirs = new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
    public int largestIsland(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        int[][] groups = new int[n][m];
        int group = 1;
        Map<Integer, Integer> groupArea = new HashMap<>();
        int largestArea = 0;

        for (int i = 0 ; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1 && groups[i][j] == 0) {
                    int curArea = helper(grid, i, j, groups, group);
                    largestArea = Math.max(largestArea, curArea);
                    groupArea.put(group, curArea);
                    group++;
                }
            }
        }

        for (int i = 0 ; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 0) {
                    int sumArea = 1;
                    Set<Integer> visited = new HashSet<>();
                    for (int[] dir : dirs) {
                        int newx = i + dir[0];
                        int newy = j + dir[1];

                        if (newx < 0 || newx >= n || newy < 0 || newy >= m || visited.contains(groups[newx][newy])) {
                            continue;
                        }
                        sumArea += groupArea.getOrDefault(groups[newx][newy], 0);
                        visited.add(groups[newx][newy]);
                    }
                    largestArea = Math.max(largestArea, sumArea);
                }
            }
        }
        return largestArea;
    }

    private int helper(int[][] grid, int x, int y, int[][] groups, int group) {
        if (x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || groups[x][y] != 0 || grid[x][y] != 1) {
            return 0;
        }

        groups[x][y] = group;
        int res = 1;
        for (int[] dir : dirs) {
            int newx = x + dir[0];
            int newy = y + dir[1];
            res += helper(grid, newx, newy, groups, group);
        }

        return res;
    }
}
