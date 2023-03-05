package leetcode.interval;

import java.util.Arrays;

public class RemoveCoveredIntervals {
    // [1, 4]: n = 1, curEnd = 4;
    // [1, 3]: n = 1, curEnd = 4;
    // [2, 5]; n = 2, curEnd = 5;
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] == b[0]? b[1] - a[1] : a[0] - b[0]);
        int count = 0;
        int curEnd = 0;
        for(int[] interval : intervals) {
            if (curEnd < interval[1]) {
                count++;
                curEnd = interval[1];
            }
        }
        return count;
    }    
}
