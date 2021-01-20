package leetcode.string;

public class IsSubsequence {
    // check if s is subsequence of t
    // s: small t: longer
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0)
            return true;

        int indexS = 0, indexT = 0;

        while(indexT < t.length()) {
            if (s.charAt(indexS) == t.charAt(indexT)) {
                indexS++;
                indexT++;

                if (indexS == s.length())
                    return true;
            } else {
                indexT++;
            }
        }

        return false;
    }
}
