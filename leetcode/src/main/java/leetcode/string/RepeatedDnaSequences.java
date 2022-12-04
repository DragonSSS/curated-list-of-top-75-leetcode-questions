package leetcode.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RepeatedDnaSequences {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> res = new HashSet<>();
        Set<String> hashSet = new HashSet<>();
        if (s.length() < 10)
            return new ArrayList<>();
        
        for(int i = 0; i <= s.length() - 10; i++) {
            if (hashSet.contains(s.substring(i, i + 10))) {
                res.add(s.substring(i, i + 10));
            }
            hashSet.add(s.substring(i, i + 10));
        }
        return new ArrayList<>(res);
    }    
}
