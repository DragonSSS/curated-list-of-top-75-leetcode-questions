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

    public int[][] merge_2r(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int[] merge = intervals[0];
        List<int[]> list = new ArrayList<>();
        
        for(int i = 1; i < intervals.length; i++) {
            int[] cur = intervals[i];
            if (merge[1] < cur[0]) {
                list.add(merge);
                merge = cur;
            // } else if (merge[0] > cur[1] ) {
            //     list.add(cur);
            } else {
                merge[0] = Math.min(merge[0], cur[0]);
                merge[1] = Math.max(merge[1], cur[1]);
            }
        }
        list.add(merge);
        
        int[][] res = new int[list.size()][2];
        for(int i = 0; i < list.size(); i++) {
            res[i] = new int[]{list.get(i)[0], list.get(i)[1]};
        }
        
        return res;
    }

    public int[][] merge_3r(int[][] intervals) {
        List<int[]> list = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int[] mergeInterval = intervals[0];
        
        for(int i = 1; i < intervals.length; i++) {
            if(mergeInterval[1] < intervals[i][0]) {
                list.add(mergeInterval);
                mergeInterval = intervals[i];
            } else if(mergeInterval[0] > intervals[i][1]){
                list.add(intervals[i]);
            } else {
                mergeInterval[0] = Math.min(mergeInterval[0], intervals[i][0]);
                mergeInterval[1] = Math.max(mergeInterval[1], intervals[i][1]);
            }
        }
        
        list.add(mergeInterval);
        
        int[][] res = new int[list.size()][2];
        for(int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
