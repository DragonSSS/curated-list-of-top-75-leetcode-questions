package leetcode.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class SORTracker {
    class Data implements Comparable<Data> {
        int score;
        String name;
        
        public Data(String name, int score){
            this.name = name;
            this.score = score;
        }
        
        @Override
        public int compareTo(Data that) {
            if(this.score == that.score) {
                return that.name.compareTo(this.name);
            }
            
            return this.score - that.score;
        }
    }
    
    PriorityQueue<Data> minPq;
    PriorityQueue<Data> maxPq;

    public SORTracker() {
        this.minPq = new PriorityQueue<>();
        this.maxPq = new PriorityQueue<>(Comparator.reverseOrder());
    }
    
    public void add(String name, int score) {
        Data data = new Data(name, score);
        minPq.offer(data);
        maxPq.offer(minPq.poll());
    }
    
    public String get() {
        Data data = maxPq.poll();
        minPq.offer(data);
        return data.name;
    }    
}
