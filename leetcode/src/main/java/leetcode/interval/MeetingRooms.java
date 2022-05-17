package leetcode.interval;

import java.util.Arrays;

public class MeetingRooms {
    public boolean canAttendMeetings(int[][] intervals) {
        if (intervals == null || intervals.length <= 1)
            return true;

        Arrays.sort(intervals, (i1, i2) -> i1[0] - i2[0]);

        for (int i = 0; i < intervals.length - 1; i++) {
            if (intervals[i][1] > intervals[i + 1][0] || intervals[i][0] == intervals[i + 1][0]) {
                return false;
            }
        }

        return true;
    }

    public boolean canAttendMeetings_2r(int[][] intervals) {
        if (intervals.length <= 1)
            return true;
        Arrays.sort(intervals, (a, b) -> a[0] - b [0]);
        int preEnd = intervals[0][1];
        for(int i = 1; i < intervals.length; i++) {
            int curStart = intervals[i][0];
            if (preEnd > curStart) {
                return false;
            }
            preEnd = intervals[i][1];
        }
        
        return true;
    }

    public boolean canAttendMeetings_3r(int[][] intervals) {
        if (intervals.length == 0)
            return true;
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int preEnd = intervals[0][1];
        
        for(int i = 1; i < intervals.length; i++) {
            if (preEnd > intervals[i][0])
                return false;
            else
                preEnd = intervals[i][1];
        }
        return true;
    }
}
