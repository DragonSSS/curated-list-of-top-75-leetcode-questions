package leetcode.string;

import java.util.HashMap;
import java.util.Map;

public class DecodeTheMessage {
    Map<Character, Character> map = new HashMap<>();
    public String decodeMessage(String key, String message) {
        buildMap(key);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if (c == ' ') {
                sb.append(' ');
            } else {
                sb.append(map.get(c));
            }
        }
        return sb.toString();
    }

    private void buildMap(String key) {
        char start = 'a';
        for(int i = 0; i < key.length(); i++) {
            char c = key.charAt(i);
            if (c != ' ') {
                if (!map.containsKey(c)) {
                    map.put(c, start++);
                }
            }
        }
    }   
}
