package leetcode.design;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
public class InsertDeleteGetRandom {
    List<Integer> res; // store the val at tail of list
    Map<Integer, Integer> map; // store the key - value -> val - index
    Random rand = new java.util.Random();

    public InsertDeleteGetRandom() {
        res = new ArrayList<>();
        map = new HashMap<>();
    }
    
    // insert the val if it doesn't exist, returns true
    // otherwise returns false
    // list.add();
    public boolean insert(int val) {
        if(map.containsKey(val)) {
            return false;
        }
        map.put(val, res.size());
        res.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if (!map.containsKey(val))
            return false;
        int index = map.get(val);
        if (index < res.size() - 1) {
            // swap the last with current val
            int last = res.get(res.size() - 1);
            res.set(index, last );
            map.put(last , index);
        }
        res.remove(res.size() - 1);
        map.remove(val);
        return true;
    }
    
    public int getRandom() {
        return res.get(rand.nextInt(res.size()));
    }
}
