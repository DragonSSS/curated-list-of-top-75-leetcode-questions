package leetcode.interval;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MeetingRoomsII {
    // sort the arrays by start time
    // use priorityQueue to store finish time of each meeting
    // poll() the value if peek() is earlier than start time of current meeting
    // keep adding finish time into pq
    public int minMeetingRooms(int[][] intervals) {
        if (intervals == null || intervals.length == 0)
            return 0;

        Arrays.sort(intervals, (i1, i2) -> i1[0] - i2[0]);
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int[] interval : intervals) {
            if (queue.size() > 0 && queue.peek() <= interval[0])
                queue.poll();
            queue.offer(interval[1]);
        }

        return queue.size();
    }

    public int minMeetingRooms_2r(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < intervals.length; i++) {
            int[] interval = intervals[i];
            if(pq.size() != 0 && pq.peek() <= interval[0]) {
                pq.poll();
            }
            pq.offer(interval[1]);
        }
        
        return pq.size();
    }

    public int minMeetingRooms_3r(int[][] intervals) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        
        for(int[] interval : intervals) {
            int start = interval[0];
            int end = interval[1];
            
            if(!pq.isEmpty() && pq.peek() <= start) {
                pq.poll();
            }
            
            pq.offer(end);
        }
        
        return pq.size();
    }

    public int minMeetingRooms_4r(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int[] interval : intervals) {
            if (!pq.isEmpty() && pq.peek() <= interval[0]) {
                pq.poll();
            }
            pq.offer(interval[1]);
        }
        return pq.size();
    }
}
