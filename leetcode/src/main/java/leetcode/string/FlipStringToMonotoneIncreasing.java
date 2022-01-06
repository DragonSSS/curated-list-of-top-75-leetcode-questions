package leetcode.string;

public class FlipStringToMonotoneIncreasing {
    public int minFlipsMonoIncr(String s) {
        int flipCount = 0;
        int oneCount = 0;
        for (char c : s.toCharArray()) {
            if (c == '0') {
                if (oneCount == 0) { // all beginning is zero before, do nothing
                    continue;
                } else {
                    flipCount++; // 0 -> 1
                }
            } else {
                oneCount++; // 1 -> 0
            }
            
            if (flipCount > oneCount) {
                flipCount = oneCount;
            }
        }
        return flipCount;
    }
}
