package leetcode.greedy;

import java.util.Arrays;

public class EliminateMaximumNumberOfMonsters {
    public int eliminateMaximum(int[] dist, int[] speed) {
        int n = dist.length;
        int[] time = new int[n];
        
        for(int i = 0; i < n; i++) {
            time[i] = (int) Math.ceil(dist[i] * 1.0 / speed[i]);
        }
        
        Arrays.sort(time);
        
        int res = 0;
        for(int i = 0; i < n; i++) {
            if (i < time[i]) {
               res++; 
            } else {
                break;
            }
        }
        return res;
    }    
}
