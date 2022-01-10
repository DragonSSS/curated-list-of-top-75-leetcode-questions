package leetcode.array;

public class MinimumSwapsToGroupAllOnesTogether {
    public int minSwaps(int[] data) {
        int allOnes = 0, curOnes = 0, maxOnesInWindow = 0;
        for (int d : data) {
            if (d == 1) allOnes++;
        }
        
        for (int i = 0; i < data.length; i++) {
            if(i >= allOnes && data[i - allOnes] == 1) {
                curOnes--;
            }
            
            if (data[i] == 1) curOnes++;
            maxOnesInWindow = Math.max(curOnes, maxOnesInWindow);
        }
        
        return allOnes - maxOnesInWindow;
    }
}
