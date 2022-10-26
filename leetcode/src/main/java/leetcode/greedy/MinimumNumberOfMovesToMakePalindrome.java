package leetcode.greedy;

public class MinimumNumberOfMovesToMakePalindrome {
    // caabb
    // c lastIndex = 0;
    // b firstIndex = 3
    // move c step = 4
    // move b step = 3
    public int minMovesToMakePalindrome(String s) {
        int res = 0;
        while(s.length() > 2) {
            int len = s.length();
            char first = s.charAt(0);
            char last = s.charAt(len - 1);
            
            
            if (first == last) {
                s = s.substring(1, len - 1);
            } else {
                int indexRight = s.lastIndexOf(first);
                int indexLeft = s.indexOf(last);
                
                int stepRight = len - 1 - indexRight;
                int stepLeft = indexLeft;
                
                if (stepRight > stepLeft) {
                    // aaabbbbb => baaabbbb
                    s = s.substring(0, indexLeft) + s.substring(indexLeft + 1, len - 1);
                    res += stepLeft;
                } else {
                    // aaaabb => aaabba
                    s = s.substring(1, indexRight) + s.substring(indexRight + 1);
                    res += stepRight;
                }
            }
        }
        return res;
    }    
}
