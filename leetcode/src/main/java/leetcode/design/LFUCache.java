package leetcode.design;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class LFUCache {
    Map<Integer, Integer> vals; // key of data, val of data
    Map<Integer, Integer> counts; // key of data, usage freqency of data
    Map<Integer, Set<Integer>> lists; // key - usage counts, val - list of keys of data
    int cap;
    int min; // the min of usage count
    public LFUCache(int capacity) {
        this.vals = new HashMap<>();
        this.counts = new HashMap<>();
        this.lists = new HashMap<>();
        this.lists.put(1, new LinkedHashSet<>()); // make sure insertion order maintained via LinkedHashSet
        this.cap = capacity;
        this.min = 0;
    }
    
    public int get(int key) {
        if (!vals.containsKey(key)) {
            return -1;
        }
        // update usage frequency and track min of count
        int count = counts.get(key);
        counts.put(key, count + 1);
        lists.get(count).remove(key);
        if (count == min && lists.get(min).size() == 0) {
            min++;
        }

        lists.putIfAbsent(count + 1, new LinkedHashSet<>());
        lists.get(count + 1).add(key);
        return vals.get(key);
    }
    
    public void put(int key, int value) {
        if (cap <= 0) return;
        // already exists
        if (vals.containsKey(key)) {
            vals.put(key, value);
            // update usage freqency by calling get()
            this.get(key);
            return;
        }

        if (vals.size() >= cap) {
            // least recently used key will be invalidated
            int eject = lists.get(min).iterator().next();
            lists.get(min).remove(eject);
            vals.remove(eject);
        }

        vals.put(key, value);
        counts.put(key, 1);
        min = 1;
        lists.get(1).add(key);
    }

    Map<Integer, Integer> keyToValue = new HashMap<>();
    Map<Integer, Integer> keyToFreq = new HashMap<>();
    Map<Integer, Set<Integer>> freqToKeys = new HashMap<>();
    // int cap;
    // int min;
    // public LFUCache(int capacity) {
    //     this.cap = capacity;
    //     this.min = 0;
    //     this.freqToKeys.put(1, new LinkedHashSet<>());
    // }
    
    public int get_2r(int key) {
        if(!keyToValue.containsKey(key)) {
            return -1;
        }

        int freq = keyToFreq.get(key);
        keyToFreq.put(key, freq + 1);
        freqToKeys.get(freq).remove(key);
        //  update min freq
        if(freq == min && freqToKeys.get(freq).size() == 0) {
            min++;
        }

        freqToKeys.putIfAbsent(freq + 1, new LinkedHashSet<>());
        freqToKeys.get(freq + 1).add(key);
        return keyToValue.get(key);
    }
    
    public void put_2r(int key, int value) {
        if (cap <= 0) {
            return;
        }

        if (keyToValue.containsKey(key)) {
            keyToValue.put(key, value);
            this.get_2r(key);
            return;
        }

        if(keyToValue.size() >= cap) {
            int eject = freqToKeys.get(min).iterator().next();
            freqToKeys.get(min).remove(eject);
            keyToValue.remove(eject);
            keyToFreq.remove(eject);
        }

        keyToValue.put(key, value);
        keyToFreq.put(key, 1);
        min = 1;
        freqToKeys.get(1).add(key);
    }
}
