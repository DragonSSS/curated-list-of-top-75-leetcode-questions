package leetcode.design;

import java.util.List;
import java.util.ArrayList;

public class CustomStack {
    int size;
    List<Integer> list;

    public CustomStack(int maxSize) {
        this.size = maxSize;
        this.list = new ArrayList<>();
    }
    
    public void push(int x) {
        if (list.size() < size) {
            list.add(x);
        }
    }
    
    public int pop() {
        if (list.isEmpty()) {
            return -1;
        } else {
            return list.remove(list.size() - 1);
        }
    }
    
    public void increment(int k, int val) {
        for (int i = 0; i < k && i < list.size(); i++) {
            list.set(i, list.get(i) + val);
        }
    }
}
