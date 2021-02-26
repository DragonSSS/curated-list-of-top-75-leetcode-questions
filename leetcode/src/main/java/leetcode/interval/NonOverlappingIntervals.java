package leetcode.interval;

import java.util.Arrays;

public class NonOverlappingIntervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0)
            return 0;

        Arrays.sort(intervals, (i1, i2) -> i1[0] - i2[0]);
        int end = intervals[0][1], count = 1;

        for(int i = 1; i < intervals.length; i++) {
            if(intervals[i][0] >= end) {
                end = intervals[i][1];
                count++;
            } else {
                end = Math.min(intervals[i][1], end);
            }
        }

        return intervals.length - count;
    }

    // The other version
    /*
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals == null || intervals.length == 0)
            return 0;
        Arrays.sort(intervals, (i1, i2) -> i1[0] - i2[0]);
        int preEnd = intervals[0][1];
        int count = 0;

        for(int i = 1; i < intervals.length; i++) {
            if(intervals[i][0] >= preEnd) {
                preEnd = intervals[i][1];
            } else {
                count++;
                preEnd = Math.min(preEnd, intervals[i][1]);
            }
        }

        return count;
    }*/
}
