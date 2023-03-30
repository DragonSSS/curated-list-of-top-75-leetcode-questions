package leetcode.binary;

import java.util.Arrays;

public class ParallelCoursesII {
    // bitmask + dp
    public int minNumberOfSemesters(int n, int[][] relations, int k) {
        // prerequisite course in bit
        int[] pres = new int[n];
        for(int[] relation : relations) {
            int from = relation[0] - 1;
            int to = relation[1] - 1;
            pres[to] |= (1 << from);
        }

        int[] dp = new int[1 << n];
        // max semester is n;
        Arrays.fill(dp, n);
        dp[0] = 0;

        for(int mask = 0; mask < dp.length; mask++) {
            int canTake = 0;
            for(int i = 0; i < n; i++) {
                // already took
                if (((1 << i) & mask) != 0) {
                    continue;
                }

                if((mask & pres[i]) == pres[i]) {
                    canTake |= (1 << i);
                }
            }

            // loop sub-mask of current canTake
            for (int take = canTake; take > 0; take = (take - 1) & canTake) {
                if (Integer.bitCount(take) > k) {
                    continue;
                }
                dp[take | mask] = Math.min(dp[take | mask], dp[mask] + 1);
            }
        }
        return dp[(1 << n) - 1];
    }    
}
