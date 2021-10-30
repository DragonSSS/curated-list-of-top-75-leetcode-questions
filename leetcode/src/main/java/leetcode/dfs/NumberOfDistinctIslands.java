package leetcode.dfs;

import java.util.HashSet;
import java.util.Set;

public class NumberOfDistinctIslands {
    // dfs to collect all island, use hash<string> to store unique ones
    public int numDistinctIslands(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        Set<String> islands = new HashSet<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    StringBuilder sb = new StringBuilder();
                    helper(grid, i, j, islands, sb, "o");
                    String s = sb.toString();
                    if (!islands.contains(s)) {
                        islands.add(s);
                    }
                }
            }
        }

        return islands.size();
    }

    private void helper(int[][] grid, int i, int j, Set<String> islands, StringBuilder sb, String dir) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != 1) {
            return;
        }

        grid[i][j] = 0; // mark it as visited, otherwise pass boolean[][] visited
        sb.append(dir);
        helper(grid, i + 1, j, islands, sb, "r");
        helper(grid, i - 1, j, islands, sb, "l");
        helper(grid, i, j + 1, islands, sb, "d");
        helper(grid, i, j - 1, islands, sb, "u");
        sb.append("b"); // the trick that marks backtracking step to avoid missing unique shapes
    }
}
