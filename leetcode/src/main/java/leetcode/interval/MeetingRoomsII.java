package leetcode.interval;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MeetingRoomsII {
    public int minMeetingRooms(int[][] intervals) {
        if (intervals == null)
            return 0;

        if (intervals.length <= 1)
            return intervals.length;

        Arrays.sort(intervals, (i1, i2) -> (i1[0] == i2[0]? i1[1] - i2[1] : i1[0] - i2[0]));
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int[] interval : intervals) {
            if (!queue.isEmpty() && queue.peek() <= interval[0])
                queue.poll();
            queue.offer(interval[1]);
        }

        return queue.size();
    }
}
