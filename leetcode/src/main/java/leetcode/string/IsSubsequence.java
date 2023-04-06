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

    public boolean isSubsequence_2r(String s, String t) {
        int i = 0, j = 0;
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        
        while(i < sChars.length && j < tChars.length) {
            if (sChars[i] == tChars[j]) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        
        if (i == sChars.length)
            return true;
        
        return false;
    }

    public boolean isSubsequence_3r(String s, String t) {
        if (s.length() > t.length()) {
            return false;
        }

        int index = 0, i = 0;
        while(i < t.length() && index < s.length()) {
            if(s.charAt(index) == t.charAt(i++)) {
                index++;
            }
        }
        return index == s.length() ? true : false;
    }
}
