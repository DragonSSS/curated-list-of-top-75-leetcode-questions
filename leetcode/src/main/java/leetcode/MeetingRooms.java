package leetcode;

import java.util.Arrays;

public class MeetingRooms {
    public boolean canAttendMeetings(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return true;
        }

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        for (int i = 0; i < intervals.length - 1; i++) {
            int[] interval1 = intervals[i];
            int[] interval2 = intervals[i + 1];

            if (interval2[0] < interval1[1] || interval1[0] == interval2[0])
                return false;
        }

        return true;
    }
}
