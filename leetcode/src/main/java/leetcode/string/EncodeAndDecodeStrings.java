package leetcode.string;

import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecodeStrings {
    public String encode(List<String> strs) {
        if (strs.size() == 0)
            return null;

        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append('/').append(s);
        }

        return sb.toString();
    }

    public List<String> decode(String s) {
        List<String> res = new ArrayList<>();
        if (s == null)
            return res;

        int i = 0;

        while (i < s.length()) {
            int slash = s.indexOf('/', i);
            int size = Integer.valueOf(s.substring(i, slash));
            res.add(s.substring(slash + 1, slash + size + 1));
            i = slash + size + 1;
        }

        return res;
    }

        // Encodes a list of strings to a single string.
        public String encode_2r(List<String> strs) {
            if(strs.size() == 0)
                return null;
            StringBuilder sb = new StringBuilder();
            for(String s : strs) {
                sb.append(s.length()).append('/').append(s);
            }
            return sb.toString();
        }
    
        // Decodes a single string to a list of strings.
        public List<String> decode_2r(String s) {
            List<String> res = new ArrayList<>();
            if (s == null)
                return res;
            
            int index = 0;
            while(index < s.length()) {
                int slash = s.indexOf('/', index);
                int size = Integer.valueOf(s.substring(index, slash));
                res.add(s.substring(slash + 1, slash + size + 1));
                index = slash + size + 1;
            }
            
            return res;
        }
}
