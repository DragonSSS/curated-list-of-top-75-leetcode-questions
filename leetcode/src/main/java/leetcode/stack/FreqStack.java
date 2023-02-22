package leetcode.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class FreqStack {
    Map<Integer, Integer> freqOfVal;
    Map<Integer, Stack<Integer>> freqToVals;
    int maxFreq;

    public FreqStack() {
        freqOfVal = new HashMap<>();
        freqToVals = new HashMap<>();
        maxFreq = 0;
    }
    
    public void push(int val) {
        int freq = freqOfVal.getOrDefault(val, 0) + 1;
        freqOfVal.put(val, freq);
        maxFreq = Math.max(maxFreq, freq);
        freqToVals.putIfAbsent(freq, new Stack<>());
        freqToVals.get(freq).push(val);
    }
    
    public int pop() {
        int result = freqToVals.get(maxFreq).pop();
        int freq = freqOfVal.get(result);
        freqOfVal.put(result, freq - 1);
        if( freqToVals.get(maxFreq).size() == 0) {
            freqToVals.remove(maxFreq);
            maxFreq--;
        }
        return result;
    }    
}
