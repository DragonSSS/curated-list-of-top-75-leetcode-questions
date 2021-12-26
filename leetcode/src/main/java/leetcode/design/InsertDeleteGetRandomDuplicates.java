package leetcode.design;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;


public class InsertDeleteGetRandomDuplicates {
    List<Integer> res;
    Map<Integer, Set<Integer>> map;
    Random random;

    public InsertDeleteGetRandomDuplicates() {
        res = new ArrayList<>();
        map = new HashMap<>();
        random = new Random();
    }
    
    // return true if val is not present, otherwise false
    public boolean insert(int val) {
        boolean present = map.containsKey(val);
        map.putIfAbsent(val, new HashSet<>());
        map.get(val).add(res.size());
        res.add(val);
        return !present;
    }
    
    // return true if val is present, otherwise false
    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }

        // swap current val with last index of val in res list
        if (!map.get(val).contains(res.size() - 1)) {
            int curIndex = map.get(val).iterator().next();
            int lastVal = res.get(res.size() - 1);
            map.get(lastVal).remove(res.size() - 1);
            map.get(lastVal).add(curIndex);
            map.get(val).remove(curIndex);
            map.get(val).add(res.size() - 1);
            res.set(curIndex, lastVal);
        }

        map.get(val).remove(res.size() - 1);
        if (map.get(val).isEmpty()) map.remove(val);
        res.remove(res.size() - 1);
        return true;
    }
    
    public int getRandom() {
        return res.get(random.nextInt(res.size()));
    }
}
