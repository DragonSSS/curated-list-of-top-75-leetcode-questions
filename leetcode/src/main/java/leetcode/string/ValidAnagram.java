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

    public boolean isAnagram_3r(String s, String t) {
        int[] freq = new int[26];
        
        if (s.length() != t.length())
            return false;
        
        for(int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            freq[c1 - 'a']++;
            freq[c2 - 'a']--;
        }
        
        for(int val : freq) {
            if(val != 0)
                return false;
        }
        
        return true;
    }
}
