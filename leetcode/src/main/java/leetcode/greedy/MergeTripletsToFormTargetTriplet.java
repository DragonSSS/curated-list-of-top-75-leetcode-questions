package leetcode.greedy;

public class MergeTripletsToFormTargetTriplet {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        int[] res = new int[3];
        for(int i = 0; i < triplets.length; i++) {
            if (triplets[i][0] > target[0] || triplets[i][1] > target[1] || triplets[i][2] > target[2])
                continue;
            
            for(int j = 0; j < 3; j++) {
                res[j] = Math.max(res[j], triplets[i][j]);
            }
        }
        return res[0] == target[0] && res[1] == target[1] && res[2] == target[2];
    }    
}
