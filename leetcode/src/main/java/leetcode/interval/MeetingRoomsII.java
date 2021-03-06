package leetcode.interval;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MeetingRoomsII {
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
    }
}
