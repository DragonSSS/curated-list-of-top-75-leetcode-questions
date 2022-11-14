package leetcode.heap;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

// Definition for an Interval.
class Interval {
    public int start;
    public int end;

    public Interval() {}

    public Interval(int _start, int _end) {
        start = _start;
        end = _end;
    }
};

public class EmployeeFreeTime {
    public List<Interval> employeeFreeTime(List<List<Interval>> schedule) {
        List<Interval> res = new ArrayList<>();
        PriorityQueue<Interval> pq = new PriorityQueue<>((a, b) -> a.start != b.start ? a.start - b.start : a.end - b.end);
        for(List<Interval> intervalList : schedule) {
            for(Interval interval : intervalList) {
                pq.offer(interval);
            }
        }

        if(pq.isEmpty()) {
            return res;
        }

        Interval pre = pq.poll();
        while(!pq.isEmpty()) {
            Interval cur = pq.poll();
            // <3, 5>
            // <7, 8>
            if (pre.end < cur.start) {
                res.add(new Interval(pre.end, cur.start));
            } else {
                // merge
                cur.end = Math.max(cur.end, pre.end);
            }
            pre = cur;
        }
        return res;
    }
}
