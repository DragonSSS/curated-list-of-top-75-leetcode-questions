package leetcode.design;

import java.util.TreeMap;

public class RangeModule {
    // key is the start, val is end exclusively
    TreeMap<Integer, Integer> treeMap;

    public RangeModule() {
        treeMap = new TreeMap<>();
    }
    
    public void addRange(int left, int right) {
        Integer start = treeMap.floorKey(left);
        Integer end = treeMap.floorKey(right);
        
        if(start != null && treeMap.get(start) >= left) {
            left = start;
        }
        
        if(end != null && treeMap.get(end) > right) {
            right = treeMap.get(end);
        }
        
        treeMap.put(left, right);
        treeMap.subMap(left, false, right, true).clear();
    }
    
    public boolean queryRange(int left, int right) {
        Integer start = treeMap.floorKey(left);
        if (start == null)
            return false;
        return treeMap.get(start) >= right;
    }
    
    public void removeRange(int left, int right) {
        Integer start = treeMap.floorKey(left);
        Integer end = treeMap.floorKey(right);
        
        // [5, 20)
        // left = 10, right = 15
        // [10, 15)
        
        // start = 5; end = 5;
        // [15, 20)
        // [5, 10)
        
        // [5, 10)
        // touch start first, could change the orignial range
        // to avoid this case, touch end first
        if (end != null && treeMap.get(end) > right) {
            treeMap.put(right, treeMap.get(end));
        }
        
        if (start != null && treeMap.get(start) > left) {
            treeMap.put(start, left);
        }
        treeMap.subMap(left, true, right, false).clear();
    }    
}
