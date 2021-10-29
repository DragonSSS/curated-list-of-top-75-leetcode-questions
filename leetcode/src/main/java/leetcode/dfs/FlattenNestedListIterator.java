package leetcode.dfs;

import java.util.List;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;

 // This is the interface that allows for creating nested lists.
 // You should not implement it, or speculate about its implementation
interface NestedInteger {
 
    // @return true if this NestedInteger holds a single integer, rather than a nested list.
    public boolean isInteger();
 
    // @return the single integer that this NestedInteger holds, if it holds a single integer
    // Return null if this NestedInteger holds a nested list
    public Integer getInteger();

    // @return the nested list that this NestedInteger holds, if it holds a nested list
    // Return empty list if this NestedInteger holds a single integer
    public List<NestedInteger> getList();

}

public class FlattenNestedListIterator implements Iterator<Integer> {
    Queue<Integer> queue;
    public FlattenNestedListIterator(List<NestedInteger> nestedList) {
        queue = getFlatten(nestedList);
    }
    
    private Queue<Integer> getFlatten(List<NestedInteger> nestedList) {
        Queue<Integer> queue = new LinkedList<>();
        
        for (NestedInteger n : nestedList) {
            if (n.isInteger()) {
                queue.add(n.getInteger());
            } else {
                queue.addAll(getFlatten(n.getList()));
            }
        }
        return queue;
    }

    @Override
    public Integer next() {
        return queue.poll();
    }

    @Override
    public boolean hasNext() {
        return !queue.isEmpty();
    }
}
