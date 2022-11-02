package leetcode.graph;

import java.util.Arrays;

public class TheEarliestMomentWhenEveryoneBecomeFriends {
    // union-find with ranking
    // eventually, all become one union
    int[] ranking;
    int[] parents; 
    public int earliestAcq(int[][] logs, int n) {
        // sort logs first based in log[0];
        Arrays.sort(logs, (a, b) -> a[0] - b[0]);
        
        ranking = new int[n];
        parents = new int[n];
        
        for (int i = 0; i < n; i++) {
            parents[i] = i;
        }
        
        int count = n;
        for(int[] log : logs) {
            if(union(log[1], log[2])) {
                count--;
                            
                if (count == 1)
                    return log[0];
            }
        }
        return -1;
    }
    
    private boolean union(int x, int y) {
        int parent1 = find(x);
        int parent2 = find(y);
        
        if (parent1 == parent2)
            return false;
        
        if (ranking[parent1] > ranking[parent2]) {
            parents[parent2] = parent1;
        } else if (ranking[parent1] < ranking[parent2]) {
            parents[parent1] = parent2;
        } else {
            parents[parent1] = parent2;
            ranking[parent2]++;
        }
        
        return true;
    }
    
    private int find(int i) {
        while(i != parents[i]) {
            i = parents[i];
        }
        return parents[i];
    }    
}
