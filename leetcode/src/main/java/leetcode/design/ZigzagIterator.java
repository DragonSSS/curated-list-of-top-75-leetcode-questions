package leetcode.design;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigzagIterator {
    Queue<Iterator<Integer>> q;

    public ZigzagIterator(List<Integer> v1, List<Integer> v2) {
        q = new LinkedList<>();
        if (!v1.isEmpty()) q.offer(v1.iterator());
        if (!v2.isEmpty()) q.offer(v2.iterator());
    }

    public int next() {
        Iterator<Integer> cur = q.poll();
        int res = cur.next();
        if(cur.hasNext()) q.offer(cur);
        return res;
    }

    public boolean hasNext() {
        return q.peek() != null;
    }    
}
