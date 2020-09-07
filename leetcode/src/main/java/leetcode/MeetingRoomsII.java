package leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MeetingRoomsII {
    public int minMeetingRooms(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return 0;
        }

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        heap.add(intervals[0][1]);

        for(int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= heap.peek()) {
                heap.poll();
            }
            heap.add(intervals[i][1]);
        }

        return heap.size();
    }
}
