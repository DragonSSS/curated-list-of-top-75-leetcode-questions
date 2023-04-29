package leetcode.heap;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class TaskScheduler {
    // A A A B B B n = 2
    // A - 3 B - 3
    // pq <3 , 3>
    // q <>
    
    // time 1: q<(2, 3)>
    // A, 
    
    // time 2: q<(2, 3), <2, 4>>
    // A, B
    
    // time 3: q<<2, 4>>
    // A, B, idle
    public int leastInterval(char[] tasks, int n) {
        if (n == 0)
            return tasks.length;
        
        int[] map = new int[26];
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a); // process peak() one at time i;
        Queue<int[]> queue = new LinkedList<>(); // int[]{freq_val, time_to_back_into_pq}
        int time = 0;
        
        // count freq
        for(char c : tasks) {
            map[c - 'A']++;
        }
        
        // add freq into pq
        for (int val : map) {
            if (val != 0) {
                pq.offer(val);
            }
        }
        
        // simulate task process
        while(!pq.isEmpty() || !queue.isEmpty()) {
            time++;
            // put one task on cpu
            if(!pq.isEmpty()) {
                int cur = pq.poll();
                cur--;
                if (cur > 0) {
                    queue.offer(new int[]{cur, time + n});
                }
            }
            // check if there is a task can be put back to pq 
            if (!queue.isEmpty() && queue.peek()[1] == time) {
                int[] backToPq = queue.poll();
                pq.offer(backToPq[0]);
            }
            
        }
        return time;
    }

    public int leastInterval_2r(char[] tasks, int n) {
        int[] map = new int[26];
        for(char task : tasks) {
            map[task - 'A']++;
        }

        // store the tasks based on its freqency, so we want process high frequency asap greedly
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for(int freq : map) {
            if(freq != 0) {
                pq.offer(freq);
            }
        }

        // use queue to store processed task but not ready to be back to pq, based on cooldown
        // time, <freq, time_back_to_pq>
        Queue<int[]> queue = new LinkedList<>();
        int time = 0;
        while(!pq.isEmpty() || !queue.isEmpty()) {
            time++;
            if (!pq.isEmpty()) {
                int curTask = pq.poll();
                curTask--;
                if (curTask > 0) {
                    queue.offer(new int[]{curTask, time + n});
                }
            }

            while(!queue.isEmpty() && queue.peek()[1] == time) {
                int[] task = queue.poll();
                pq.offer(task[0]);
            }
        }

        return time;
    }
}
