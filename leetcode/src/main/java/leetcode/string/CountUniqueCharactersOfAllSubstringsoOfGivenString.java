package leetcode.string;

import java.util.Arrays;

public class CountUniqueCharactersOfAllSubstringsoOfGivenString {
        // A .... A ..... A
    // find most left position
    // find most right position
    public int uniqueLetterString(String s) {
        int[] chars = new int[26];
        int[] leftPos = new int[s.length()];
        int[] rightPos = new int[s.length()];
        
        Arrays.fill(chars, -1);
        Arrays.fill(leftPos, -1);
        Arrays.fill(rightPos, -1);
        
        for (int i = 0; i < s.length(); i++) {
            if (chars[s.charAt(i) - 'A'] != -1) {
                leftPos[i] = chars[s.charAt(i) - 'A'];
            }
            
            chars[s.charAt(i) - 'A'] = i;
        }
        
        Arrays.fill(chars, -1);
        
        for (int i = s.length() - 1; i >= 0; i--) {
            if (chars[s.charAt(i) - 'A'] != -1) {
                rightPos[i] = chars[s.charAt(i) - 'A'];
            }
            
            chars[s.charAt(i) - 'A'] = i;
        }
        
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            int leftBound = leftPos[i] == -1? 0:leftPos[i] + 1;
            int rightBound = rightPos[i] == -1? s.length() - 1 : rightPos[i] - 1;
            res += (i - leftBound + 1) * (rightBound - i + 1);
        }
        return res;
    }
}
