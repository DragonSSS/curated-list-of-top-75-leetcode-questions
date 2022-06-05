package leetcode.bfs;

import java.util.Queue;
import java.util.Set;

import java.util.HashSet;
import java.util.LinkedList;
public class SnakesAndLadders {
    public int snakesAndLadders(int[][] board) {
        int n = board.length;
        int target = n*n;
        boolean[] visited = new boolean[target + 1];
        int res = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        visited[1] = true;
        
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                int cur = queue.poll();
                if (cur == target)
                    return res;
                for (int j = 1; j <= 6 && cur + j <= target; j++) {
                    int next = cur + j;
                    int val = getBoardValue(next, board);
                    if (val != -1) {
                        next = val;
                    }
                    if (visited[next])
                        continue;
                    visited[next] = true;
                    queue.offer(next);
                }
            }
            res++;
        }
        
        return -1;
    }
    
    private int getBoardValue(int num, int[][] board) {
        int n = board.length;
        int oldRow = (num - 1) / n;
        int oldCol = (num - 1) % n;
        int newRow = n - oldRow - 1;
        int newCol = oldRow % 2 == 0 ? oldCol : n - oldCol - 1;
        return board[newRow][newCol];
    }

    public int snakesAndLadders_2r(int[][] board) {
        int n = board.length;
        int target = n * n;
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        int move = 0;
        
        queue.offer(1);
        visited.add(1);
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0 ; i < size; i++) {
                int cur = queue.poll();
                if (cur == target)
                    return move;
                for(int j = 1; j <= 6 && cur + j <= target; j++) {
                    int next = cur + j;
                    int value = getValue(next, board);
                    if (value != -1) {
                        next = value;
                    }
                    
                    if (visited.contains(next))
                        continue;
                    queue.offer(next);
                    visited.add(next);
                    
                }
            }
            move++;
        }
        
        return -1;
    }
    
    private int getValue(int num, int[][] board) {
        int n = board.length;
        int oldRow = (num - 1) /  n;
        int oldCol = (num - 1) % n ;
        int newRow = n - oldRow - 1;
        int newCol = oldRow % 2 == 0 ? oldCol : n - oldCol - 1;
        return board[newRow][newCol];
    }
}
