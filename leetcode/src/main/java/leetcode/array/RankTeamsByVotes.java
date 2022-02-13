package leetcode.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RankTeamsByVotes {
    public String rankTeams(String[] votes) {
        int n = votes[0].length();
        Map<Character, int[]> map = new HashMap<>();
        for(char c : votes[0].toCharArray()) {
            map.put(c, new int[n]);
        }
        for(String vote : votes) {
            char[] chars = vote.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                int[] cur = map.get(chars[i]);
                cur[i]++;
                map.put(chars[i], cur);
            }
        }
        
        char[] res = votes[0].toCharArray();
        
        Character[] temp = new Character[n];
        
        for (int i = 0; i < n; i++) {
            temp[i] = res[i];
        }
        
        Arrays.sort(temp, (a, b) -> {
            for(int i = 0; i < n; i++) {
                if (map.get(a)[i] != map.get(b)[i]) {
                    return map.get(b)[i] - map.get(a)[i];
                }
            }
            return a - b;
        });
        
        for (int i = 0; i < n; i++) {
            res[i] = temp[i];
        }
        
        return String.valueOf(res);
    }    
}
