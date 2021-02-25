package leetcode.interval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<>();

        if(intervals.length <=1 )
            return intervals;

        Arrays.sort(intervals, (i1, i2) -> i1[0] - i2[0]);
        int[] newInterval = intervals[0];

        for(int i = 1; i < intervals.length; i++) {
            int[] interval = intervals[i];

            if(newInterval[1] < interval[0]) {
                res.add(newInterval);
                newInterval = interval;
            } else if (interval[1] < newInterval[0]) {
                res.add(interval);
            } else {
                newInterval[0] = Math.min(interval[0], newInterval[0]);
                newInterval[1] = Math.min(interval[1], newInterval[1]);
            }
        }
        res.add(newInterval);
        return res.toArray(new int[][]{});
    }
}
