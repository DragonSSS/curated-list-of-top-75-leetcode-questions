package leetcode.interval;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MeetingRoomsII {
    /*
    public int minMeetingRooms(int[][] intervals) {
        if (intervals == null || intervals.length == 0)
            return 0;

        Arrays.sort(intervals, (i1, i2) -> i1[0] - i2[0]);

        PriorityQueue<int[]> queue = new PriorityQueue<>((i1, i2) -> i1[1] - i2[1]);
        queue.offer(intervals[0]);

        for(int i = 0; i < intervals.length; i++) {
            if (intervals[i][0] >= queue.peek()[1]) {
                queue.poll();
            }
            queue.offer(intervals[i]);
        }

        return queue.size();
    }*/


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
}
