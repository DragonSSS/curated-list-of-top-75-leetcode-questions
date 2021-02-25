package leetcode.interval;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();
        for(int[] interval : intervals) {
            if(newInterval[1] < interval[0]) {
                res.add(newInterval);
                newInterval = interval;
            } else if(newInterval[0] > interval[1]) {
                res.add(interval);
            } else {
                newInterval[0] = Math.min(newInterval[0], interval[0]);
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            }
        }
        res.add(newInterval);
        return res.toArray(new int[][]{});
    }
}
