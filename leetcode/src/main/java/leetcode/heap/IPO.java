package leetcode.heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class IPO {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n = profits.length;
        int[][] projects = new int[n][2];
        
        for(int i = 0; i < n; i++) {
            projects[i][0] = profits[i];
            projects[i][1] = capital[i];
        }
        
        Arrays.sort(projects, (a, b) -> a[1] != b[1]? a[1] - b[1] : b[0] - a[0]);
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] != b[0]? b[0] - a[0] : a[1] - b[1]);
        
        int curIndex = 0;
        int res = w;
        while( k-- > 0) {
            while(curIndex < n && projects[curIndex][1] <= res) {
                pq.offer( projects[curIndex++]);
            }
            
            if (pq.isEmpty())
                break;
            
            res += pq.poll()[0];
        }

        return res;
    }

    public int findMaximizedCapital_2r(int k, int w, int[] profits, int[] capital) {
        int n = profits.length;
        int[][] projects = new int[n][2];

        // {profit, capital}
        for(int i = 0 ; i < n ;i ++) {
            projects[i][0] = profits[i];
            projects[i][1] = capital[i];
        }

        Arrays.sort(projects, (a, b) -> a[1] != b[1]? a[1] - b[1] : b[0] - a[0]);
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0] != b[0]? b[0] - a[0] : a[1] - b[1]);

        int currIndex = 0;
        int res = w;
        while(k-- > 0) {
            while(currIndex < n && projects[currIndex][1] <= res) {
                pq.offer(projects[currIndex++]);
            }

            if (!pq.isEmpty()) {
                res += pq.poll()[0];
            }
        }
        return res;
    }
}
