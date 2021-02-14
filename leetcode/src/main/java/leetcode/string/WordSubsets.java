package leetcode.string;

import java.util.ArrayList;
import java.util.List;

public class WordSubsets {
    public List<String> wordSubsets(String[] A, String[] B) {
        int[] count = new int[26], temp = new int[26];
        List<String> res = new ArrayList<>();

        for(String s : B) {
            temp = countFreq(s);
            for(int i = 0; i < 26; i++) {
                count[i] = Math.max(count[i], temp[i]);
            }
        }

        for(String s : A) {
            temp = countFreq(s);
            int num = 0;
            for(int i = 0; i < 26; i++) {
                if(temp[i] < count[i])
                    break;
                num++;
            }

            if(num == 26)
                res.add(s);
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
