package leetcode.string;

import java.util.HashMap;
import java.util.Map;

public class MaximizeConfusionOfExam {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int res = k; // current max size = k
        Map<Character, Integer> map = new HashMap<>();
        // get char freq from answerKey.substring(0, k)
        for(int i = 0; i < k; i++) {
            map.put(answerKey.charAt(i), map.getOrDefault(answerKey.charAt(i), 0) + 1);
        }

        int left = 0;
        for(int right = k; right < answerKey.length(); right++) {
            // calculate new char from right side
            map.put(answerKey.charAt(right), map.getOrDefault(answerKey.charAt(right), 0) + 1);
            // check if substring is valid, if not, remove leftmost char
            while(Math.min(map.getOrDefault('T', 0), map.getOrDefault('F', 0)) > k) {
               map.put(answerKey.charAt(left), map.get(answerKey.charAt(left)) - 1);
               left++; 
            }
            // track current max size of valid substring
            res = Math.max(res, right - left + 1);
        }
        return res;
    }    
}
