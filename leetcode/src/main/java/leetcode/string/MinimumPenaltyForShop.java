package leetcode.string;

public class MinimumPenaltyForShop {
    public int bestClosingTime(String customers) {
        int curPenalty = 0;
        // if close at index 0
        for(char c : customers.toCharArray()) {
            if (c == 'Y') {
                curPenalty++;
            }
        }
        int minPenalty = curPenalty;
        int index = 0;
        for(int i = 1; i <= customers.length(); i++) {
            if (customers.charAt(i - 1) == 'Y') {
                curPenalty--;
            } else {
                curPenalty++;
            }
            if (curPenalty < minPenalty) {
                minPenalty = curPenalty;
                index = i;
            }
        }
        return index;
    }    
}
