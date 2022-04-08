package leetcode.string;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s == null && t == null)
            return true;

        if (s.length() != t.length())
            return false;

        int[] map = new int[26];

        for (int i = 0; i < s.length(); i++) {
            map[s.charAt(i) - 'a']++;
            map[t.charAt(i) - 'a']--;
        }

        for(int i : map) {
            if (i != 0)
                return false;
        }
        return true;
    }

    public boolean isAnagram_2r(String s, String t) {
        int[] map = new int[26];
        for(char c : s.toCharArray()) {
            map[c - 'a']++;
        }
        
        
        for(char c : t.toCharArray()) {
            map[c - 'a']--;
        }
        
        for(int value : map) {
            if (value != 0)
                return false;
        }
        
        return true;
    }
}
