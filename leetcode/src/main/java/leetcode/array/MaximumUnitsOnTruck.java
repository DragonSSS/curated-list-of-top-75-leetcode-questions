package leetcode.array;

import java.util.Arrays;

public class MaximumUnitsOnTruck {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        // make sure to get maximum unit, so we should sort by numberOfUnitsPerBox
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        int res = 0;
        for (int[] boxType: boxTypes) {
            
            for (int i = 0; i < boxType[0]; i++) {
                if (truckSize <= 0)
                    return res;
                res += boxType[1];
                truckSize--;
            }
        }
        return res;
    }
}
