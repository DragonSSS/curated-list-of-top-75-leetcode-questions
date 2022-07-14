package leetcode.backtracking;

import java.util.Arrays;

public class MatchsticksToSquare {
    int[] edges = new int[4];
    int len;
    public boolean makesquare(int[] matchsticks) {
        int totalLen = 0;
        for(int s: matchsticks) {
            totalLen += s;
        }
        
        if (totalLen % 4 != 0)
            return false;
        
        len = totalLen / 4;
        Arrays.sort(matchsticks); //trick
        
        // reverse the index by starting from matchsticks.length - 1 as Arrays.sort
        return helper(matchsticks.length - 1, matchsticks);
    }
    
    boolean helper(int index, int[] matchsticks) {
        if (index == -1)
            return true;
        
        for(int i = 0; i < edges.length; i++) {
            if (edges[i] + matchsticks[index] <= len) {
                edges[i] += matchsticks[index];
                if(helper(index - 1, matchsticks)) {
                    return true;
                }
                edges[i] -= matchsticks[index];
            }
        }
        
        return false;
    }    
}
