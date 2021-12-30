package leetcode.design;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class SnapshotArray {
    List<Map<Integer, Integer>> diff;
    int snapId;
    int size;

    public SnapshotArray(int length) {
        size = length;
        snapId = 0;
        diff = new ArrayList<>();
        diff.add(new HashMap<>());
    }
    
    public void set(int index, int val) {
        if (index >= size)
            return;
        diff.get(snapId).put(index, val);
    }
    
    public int snap() {
        diff.add(new HashMap<>());
        return snapId++;
    }
    
    public int get(int index, int snap_id) {
        for (int i = snap_id; i >= 0; i--) {
            if (diff.get(i).containsKey(index))
                return diff.get(i).get(index);
        }
        return 0;
    }
}
