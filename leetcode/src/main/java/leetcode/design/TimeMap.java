package leetcode.design;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
// import java.util.TreeMap;

public class TimeMap {

    class Value {
        String value;
        int timestamp;
        
        public Value(String value, int timestamp){
            this.value = value;
            this.timestamp = timestamp;
        }
    }
    // Map<String, List<Value>>
    // binary search against on list - logn
    
    Map<String, List<Value>> valMap;

    public TimeMap() {
       valMap = new HashMap<>(); 
    }
    
    // O(1)
    public void set(String key, String value, int timestamp) {
        valMap.putIfAbsent(key, new ArrayList<>());
        valMap.get(key).add(new Value(value, timestamp));
    }
    
    // O(log(n))
    public String get(String key, int timestamp) {
        if (!valMap.containsKey(key))
            return "";
        List<Value> list = valMap.get(key);
        int left = 0, right = list.size() - 1;
        // trick, make sure below indexes always valid
        while(left + 1 < right) {
            int mid = left + (right - left) / 2;
            Value cur = list.get(mid);
            if (cur.timestamp == timestamp)
                return cur.value;
            if (cur.timestamp < timestamp) {
                left = mid;
            } else {
                right = mid;
            }
        }
        
        if (list.get(right).timestamp <= timestamp) 
            return list.get(right).value;
        else if (list.get(left).timestamp <= timestamp) 
            return list.get(left).value;
        return "";
    }

    // solution 2: TreeMap
    // private Map<String,TreeMap<Integer, String>> valMap;

    // public TimeMap() {
    //     valMap = new HashMap<>();
    // }

    // O(logk, k is the number of timestamp on k)
    // public void set(String key, String value, int timestamp) {
    //     valMap.putIfAbsent(key,new TreeMap<>());
    //     valMap.get(key).put(timestamp,value);
    // }

    // O(logn)
    // public String get(String key, int timestamp) {
    //     TreeMap<Integer, String> treeMap = valMap.get(key);
    //     if(treeMap==null) {
    //         return "";
    //     }
    //     Integer floor = treeMap.floorKey(timestamp); // trick
    //     if(floor==null) {
    //         return "";
    //     }
    //     return treeMap.get(floor);
    // }
}
