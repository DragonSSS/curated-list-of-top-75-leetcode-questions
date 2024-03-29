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

    public int[][] insert_2r(int[][] intervals, int[] newInterval) {       
        List<int[]> resList = new ArrayList<>();
        for(int[] interval : intervals) {
            if(newInterval[1] < interval[0]) {
                resList.add(newInterval);
                newInterval = interval;
            } else if (newInterval[0] > interval[1]) {
                resList.add(interval);
            } else {
                newInterval[0] = Math.min(newInterval[0], interval[0]);
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            }
        }
        resList.add(newInterval); // easy to forget
        
        int[][] resArray = new int[resList.size()][2];
        for(int i = 0; i < resList.size(); i++) {
            resArray[i] = new int[]{resList.get(i)[0], resList.get(i)[1]};
        }
        
        return resArray;
    }

    public int[][] insert_3r(int[][] intervals, int[] newInterval) {
        List<int[]> resList = new ArrayList<>();
        int[] curInterval = newInterval;
        for(int[] interval : intervals) {
            if(curInterval[1] < interval[0]) {
                resList.add(curInterval);
                curInterval = interval;
            } else if (curInterval[0] > interval[1]) {
                resList.add(interval);
            } else {
                curInterval[0] = Math.min(curInterval[0], interval[0]);
                curInterval[1] = Math.max(curInterval[1], interval[1]); 
            }
        }
        
        resList.add(curInterval);
        
        int[][] res = new int[resList.size()][2];
        for(int i = 0; i < resList.size(); i++) {
            res[i] = resList.get(i);
        }
        return res;
    }

    public int[][] insert_4r(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>();
        // Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int[] insert = newInterval;
        for(int[] interval: intervals) {
            if(insert[1] < interval[0]) {
                list.add(insert);
                insert = interval;
            } else if (insert[0] > interval[1]) {
                list.add(interval);
            } else {
               insert[0] = Math.min(insert[0], interval[0]);
               insert[1] = Math.max(insert[1], interval[1]); 
            }
        }
        list.add(insert);
        int[][] res = new int[list.size()][2];
        for(int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    public int[][] insert_5r(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>();
        int[] insert = newInterval;
        for(int[] interval : intervals) {
            if (insert[1] < interval[0]) {
                list.add(insert);
                insert = interval;
            } else if (insert[0] > interval[1]) {
                list.add(interval);
            } else {
                insert[0] = Math.min(insert[0], interval[0]);
                insert[1] = Math.max(insert[1], interval[1]);
            }
        }
        list.add(insert);
        int[][] res = new int[list.size()][2];
        for(int i = 0 ; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
