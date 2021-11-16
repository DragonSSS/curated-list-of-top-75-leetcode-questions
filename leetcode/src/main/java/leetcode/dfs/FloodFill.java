package leetcode.dfs;

public class FloodFill {
    int[][] dirs = new int[][]{{1, 0},{0, 1},{-1, 0},{0, -1}};
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        helper(image, sr, sc, newColor, image[sr][sc]);
        return image;
    }
    
    private void helper(int[][] image, int x, int y, int newColor, int curColor) {
        if (x < 0 || x >= image.length || y < 0 || y >= image[0].length || image[x][y] == newColor ||  image[x][y] != curColor)
            return;
             
        image[x][y] = newColor;
        for (int[] dir : dirs) {
            helper(image, x + dir[0], y + dir[1], newColor, curColor);
        }
    }
}
