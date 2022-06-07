package leetcode.design;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class SnakeGame {
	private final Queue<int[]> snakeQueue;
    private int snakeLength;
    private final int[][] food;
    private final int width;
    private final int height;
    private int currentX;
    private int currentY;
    private int foodIndex;
    private static final Map<String, int[]> dirs = new HashMap<>();

    public SnakeGame(int width, int height, int[][] food) {
        this.snakeQueue = new LinkedList<>();
        this.snakeQueue.add(new int[]{0,0});
        this.snakeLength = 1;
        this.food = food;
        this.width = width;
        this.height = height;
        this.currentX = 0;
        this.currentY = 0;
        foodIndex = 0;

        dirs.put("R", new int[]{0, 1});
        dirs.put("L", new int[]{0, -1});
        dirs.put("U", new int[]{-1, 0});
        dirs.put("D", new int[]{1, 0});
    }
    
    public int move(String direction) {
        this.currentX += dirs.get(direction)[0];
        this.currentY += dirs.get(direction)[1];

        //boundary check
        if (this.currentX<0 || this.currentX>=this.height || this.currentY<0 || this.currentY>=this.width) return -1;

        // can eat the food with this move
        if (this.foodIndex < this.food.length && this.currentX == food[foodIndex][0] && this.currentY == food[foodIndex][1]) {
            this.snakeLength++;
            this.foodIndex++;
        } else {
            // remove tail from peek of queue if no food
            this.snakeQueue.poll();
        }
        
        // check if hit the body
        for (int[] bodySegment : this.snakeQueue) {
            if (this.currentX == bodySegment[0] && this.currentY == bodySegment[1]) return -1;
        }

        // add new head
        this.snakeQueue.offer(new int[]{this.currentX, this.currentY});

        return this.snakeLength - 1;
    }
}
