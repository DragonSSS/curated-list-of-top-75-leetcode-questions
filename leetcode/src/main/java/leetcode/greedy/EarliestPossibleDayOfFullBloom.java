package leetcode.greedy;

import java.util.Arrays;

public class EarliestPossibleDayOfFullBloom {
    // early plant the seed which takes longer to glow, so that it bloom earlier
    // sorting + greedy
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        int size = plantTime.length;
        int[][] sortedTime = new int[size][2];
        for(int i = 0; i < size; i++) {
            sortedTime[i] = new int[]{i, growTime[i]}; // [size][index, growTime]
        }

        Arrays.sort(sortedTime, (a, b) -> b[1] - a[1]);
        int totalTime = 0;
        int curPlantTime = 0;
        for(int[] sorted : sortedTime) {
            int index = sorted[0];
            int grow = sorted[1];
            totalTime = Math.max(totalTime, curPlantTime + plantTime[index] + grow);
            curPlantTime += plantTime[index];
        }
        return totalTime;
    }    
}
