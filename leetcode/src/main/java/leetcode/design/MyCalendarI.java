package leetcode.design;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class MyCalendarI {
    // brute force
    List<int[]> calendar;

    TreeMap<Integer, Integer> calendar_2r;
    
    public MyCalendarI() {
        calendar = new ArrayList<>();
        calendar_2r = new TreeMap<>();
    }
    
    public boolean book(int start, int end) {
        for(int[] event : calendar) {
           if (Math.max(start, event[0]) < Math.min(end, event[1]))
               return false;
        }
        calendar.add(new int[]{start, end});
        return true; 
    }

    // TreeMap
    public boolean book_2r(int start, int end) {
        Integer floorKey = calendar_2r.floorKey(start);
        if (floorKey != null && calendar_2r.get(floorKey) > start)
            return false;

        Integer ceilingKey = calendar_2r.ceilingKey(start);
        if (ceilingKey != null && ceilingKey < end)
            return false;

        calendar_2r.put(start, end);
        return true;
    }
}
