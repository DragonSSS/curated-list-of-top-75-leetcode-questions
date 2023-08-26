package leetcode.heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class SingleThreadedCpu {
    public int[] getOrder(int[][] tasks) {
        int n = tasks.length;
        int[] res = new int[n];
        // sorting the tasks into new array with index
        // 0 enqueue time 1 process time 2 task index
        // sort the new task array based on enqueue time
        int[][] sortedTasks = new int[n][3];
        for(int i = 0; i < n; i++) {
            sortedTasks[i][0] = tasks[i][0];
            sortedTasks[i][1] = tasks[i][1];
            sortedTasks[i][2] = i;
        }
        
        Arrays.sort(sortedTasks, (a, b) -> a[0] - b[0]);
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] != b[1]? a[1] - b[1] : a[2] - b[2]);
        
        int taskIndex = 0, currentTime = 0, resIndex = 0;
        // use miniheap to find next task
        
        while(taskIndex < n || !pq.isEmpty()) {
            // find the first task to pick up
            if (pq.isEmpty() && currentTime < sortedTasks[taskIndex][0]) {
                currentTime = sortedTasks[taskIndex][0];
            }
            
            // try to find all available tasks, put them into queue
            while(taskIndex < n && currentTime >= sortedTasks[taskIndex][0]) {
                pq.offer(sortedTasks[taskIndex++]);
            }
            
            // process the task from peak of queue
            int[] processedTask = pq.poll();
            currentTime += processedTask[1];
            res[resIndex++] = processedTask[2];
        }
        return res;
    }

    public int[] getOrder_2r(int[][] tasks) {
        // { enqueue time,  process time, task index }
        int n = tasks.length;
        int[][] sortedTasks = new int[n][3];
        int taskIndex = 0;
        for(int[] task : tasks) {
            sortedTasks[taskIndex] = new int[]{task[0], task[1], taskIndex++};
        }
        Arrays.sort(sortedTasks, (a, b) -> a[0] - b[0]);
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] != b[1]? a[1] - b[1]: a[2] - b[2]);
        taskIndex = 0;
        int resIndex = 0, currentTime = 0;
        int[] res = new int[n];
        while(taskIndex < n || !pq.isEmpty()) {
            if(pq.isEmpty() && currentTime < sortedTasks[taskIndex][0]) {
                currentTime = sortedTasks[taskIndex][0];
            }
            while(taskIndex < n && sortedTasks[taskIndex][0] <= currentTime) {
                pq.offer(sortedTasks[taskIndex++]);
            }

            int[] processTask = pq.poll();
            currentTime += processTask[1];
            res[resIndex++] = processTask[2];
        }
        return res;
    }
}
