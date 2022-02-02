package leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class IntervalListIntersections {
    // two pointers
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> res = new ArrayList<>();
        int n = firstList.length;
        int m = secondList.length;
        
        int lateStart = 0, earlyEnd = 0;
        int i = 0, j = 0;
        while(i < n && j < m) {
            lateStart = Math.max(firstList[i][0], secondList[j][0]);
            earlyEnd = Math.min(firstList[i][1], secondList[j][1]);
            
            if (lateStart <= earlyEnd) {
                res.add(new int[]{lateStart, earlyEnd});
            }
            
            if (firstList[i][1] == earlyEnd) i++;
            if (secondList[j][1] == earlyEnd) j++;
        }
        
        int[][] ans = new int[res.size()][2];
        int index = 0;
        for(int[] interval : res) {
            ans[index++] = interval;
        }
        return ans;
    }    
}
