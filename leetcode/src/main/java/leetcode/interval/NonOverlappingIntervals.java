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

    public int eraseOverlapIntervals_2r(int[][] intervals) {
        int removedCount = 0; 
        Arrays.sort(intervals, (a, b) -> (a[0] - b[0]));
        
        int preEnd = intervals[0][1];
        for(int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < preEnd) {
                preEnd = Math.min(intervals[i][1], preEnd);
                removedCount++;
            } else {
               preEnd =  intervals[i][1];
            }
        }
        
        return removedCount;
    }


    public int eraseOverlapIntervals_3r(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int res = 0;
        int preEnd = intervals[0][1];
        
        for(int i = 1; i < intervals.length; i++) {
            if(preEnd > intervals[i][0]) {
                res++;
                // tricky part to make greedy work
                preEnd = Math.min(preEnd, intervals[i][1]);
            } else {
                preEnd = intervals[i][1];
            }
        }
        
        return res;
    }
}
