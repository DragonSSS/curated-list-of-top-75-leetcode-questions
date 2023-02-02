package leetcode.bfs;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class StickersToSpellWord {
    public int minStickers(String[] stickers, String target) {
        // convert target into integer array
        int[] chars = new int[26];
        for (int i = 0; i < target.length(); i++) {
            chars[target.charAt(i)  - 'a']++;
        }

        // build the integer array for each sticker within map
        int[][] map = new int[stickers.length][26];
        for(int i = 0; i < stickers.length; i++) {
            for(int j = 0; j < stickers[i].length(); j++) {
                map[i][stickers[i].charAt(j) - 'a']++;
            }
        }
        
        Queue<int[]> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        queue.offer(chars);
        int res = 0;
        while(!queue.isEmpty()) {
            int size = queue.size();
            res++;
            for(int i = 0; i < size; i++) {
                int[] cur = queue.poll();
                // this will sort the string as well
                String s = getStringfromIntArray(cur);
                // only care about the string we don't visit yet
                if (visited.add(s)) {
                    for(int j = 0; j < map.length; j++) {
                        // optimization by checking first char of current string exists in current sticker
                        if (map[j][s.charAt(0) - 'a'] == 0)
                            continue;
                        
                        int[] temp = cur.clone();
                         for (int k = 0; k < 26; k++) {
                             if (temp[k] > 0) {
                                 int rest = temp[k] - map[j][k];
                                 temp[k] = rest > 0 ? rest : 0;
                             }
                         }
                        
                         // check if modified string is empty
                        if (isEmptyString(temp))
                            return res;
                        queue.offer(temp);
                    }
                }
            }
        }
        return -1;
    }
    
    private boolean isEmptyString(int[] chars) {
        for(int i = 0; i < chars.length; i++) {
            if(chars[i] != 0)
                return false;
        }
        return true;
    }
    
    private String getStringfromIntArray(int[] chars) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 26; i++) {
            int count = chars[i];
            while(count > 0) {
                sb.append((char) (i + 'a'));
                count--;
            }
        }
        return sb.toString();
    }    
}
