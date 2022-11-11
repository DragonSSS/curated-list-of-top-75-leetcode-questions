package leetcode.backtracking;

import java.util.HashSet;
import java.util.Set;

interface Robot {
    // Returns true if the cell in front is open and robot moves into the cell.
    // Returns false if the cell in front is blocked and robot stays in the current cell.
    public boolean move();

    // Robot will stay in the same cell after calling turnLeft/turnRight.
    // Each turn will be 90 degrees.
    public void turnLeft();
    public void turnRight();

    // Clean the current cell.
    public void clean();
}

public class RobotRoomCleaner {
    // up, right, down, left, clockwise
    int[][] directions = new int[][]{{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    Set<String> visited = new HashSet<>();
    public void cleanRoom(Robot robot) {
        // start from (0, 0) with direct up
        helper(0, 0, 0, robot);
    }

    private void helper(int i, int j, int dir, Robot robot) {
        visited.add(key(i, j));
        robot.clean();

        // four directions
        for (int k = 0; k < 4; k++) {
            // trick to get the direction index
            int newDir = (dir + k) % 4;
            int[] direction = directions[newDir];
            // next coordinate by moveing with direction
            int x = i + direction[0];
            int y = j + direction[1];

            if (!visited.contains(key(x, y)) && robot.move()) {
                helper(x, y, newDir, robot);
                goBack(robot);
            }
            // trick and important
            // start from up, turn clockwise
            robot.turnRight();
        }
    }

    private String key(int i, int j) {
        return i + ":" + j;
    }
    
    // trick to backtracking with robot apis
    private void goBack(Robot robot) {
        robot.turnRight();
        robot.turnRight();
        robot.move();
        robot.turnRight();
        robot.turnRight();
    }
}
