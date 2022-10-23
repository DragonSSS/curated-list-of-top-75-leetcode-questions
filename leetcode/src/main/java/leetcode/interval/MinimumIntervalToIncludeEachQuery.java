package leetcode.interval;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MinimumIntervalToIncludeEachQuery {
    public int[] minInterval(int[][] intervals, int[] queries) {
        int[] res = new int[queries.length];
        // build queries with its index
        int[][] queriesWithIndex = new int[queries.length][2];
        for(int i = 0; i < queries.length; i++) {
            queriesWithIndex[i] = new int[]{queries[i], i};
        }
        // sort interval by start point
        // sort queries by value
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        Arrays.sort(queriesWithIndex, (a, b) -> (a[0] - b[0]));
        
        // minHeap to story valid intervals
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> (a[1] - a[0]) - (b[1] - b[0]));
        
        int index = 0;
        for (int[] query : queriesWithIndex) {
            int queryVal = query[0];
            int queryIndex = query[1];
            
            // add valid interval
            while(index < intervals.length && intervals[index][0] <= queryVal) {
                pq.offer(intervals[index++]);
            }
            
            // remove invalid interval
            while(!pq.isEmpty() && pq.peek()[1] < queryVal) {
                pq.poll();
            }
            
            res[queryIndex] = pq.isEmpty() ? -1 : pq.peek()[1] - pq.peek()[0] + 1;
        }
        
        return res;
    }    
}
