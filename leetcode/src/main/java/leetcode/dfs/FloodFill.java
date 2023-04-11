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

    //int[][] dirs = new int[][]{{0,1}, {1,0}, {0,-1}, {-1,0}};
    public int[][] floodFill_2r(int[][] image, int sr, int sc, int color) {
        helper_2r(image, sr, sc, image[sr][sc], color);
        return image;
    }

    private void helper_2r(int[][] image, int x, int y, int curColor, int newColor) {
        if (x < 0 || x >= image.length || y < 0 || y >= image[0].length || image[x][y] != curColor || image[x][y] == newColor) {
            return;
        }

        image[x][y] = newColor;
        for(int[] dir : dirs) {
            helper_2r(image, x + dir[0], y + dir[1], curColor, newColor);
        }
    }
}
