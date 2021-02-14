package leetcode.string;

public class FirstUniqueCharacterInString {
    public int firstUniqChar(String s) {
        if(s == null || s.length() == 0)
            return -1;

        int[] count = countFreq(s);

        int res = -1;
        for(int i = 0; i < s.length(); i++) {
            if(count[s.charAt(i) - 'a'] == 1){
                return i;
            }
        }

        return res;
    }

    private int[] countFreq(String s) {
        int[] res = new int[26];
        for(char c : s.toCharArray()) {
            res[c - 'a']++;
        }
        return res;
    }
}
