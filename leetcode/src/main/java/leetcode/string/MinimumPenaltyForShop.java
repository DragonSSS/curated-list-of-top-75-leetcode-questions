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

    public int bestClosingTime_2r(String customers) {
        int curPenalty = 0;
        // assume we close the store at index 0 hr
        char[] chars = customers.toCharArray();
        for(int i = 0; i < chars.length; i++) {
            if(chars[i] == 'Y') {
                curPenalty++;
            }
        }
        
        int minPenalty = curPenalty;
        int res = 0;
        // i <= chars.length makes sure cover the case that the store is closed at last index hr
        for(int i = 1; i <= chars.length; i++) {
            // if we close store at index i hr
            if(chars[i - 1] == 'Y') {
                curPenalty--;
            } else {
                curPenalty++;
            }
            if (curPenalty < minPenalty) {
                minPenalty = curPenalty;
                res = i;
            }
            
        }
        return res;
    }
}
