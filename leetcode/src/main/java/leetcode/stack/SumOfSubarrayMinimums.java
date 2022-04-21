package leetcode.stack;

import java.util.Arrays;
import java.util.Stack;

public class SumOfSubarrayMinimums {
    public int sumSubarrayMins(int[] arr) {
        int size = arr.length;
        int[] nextSmaller = new int[size];
        Arrays.fill(nextSmaller, size);
        int[] preSmaller = new int[size];
        Arrays.fill(preSmaller, -1);

        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < size; i++) {
            while(!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                nextSmaller[stack.pop()] = i;
            }
            stack.push(i);
        }

        stack.clear();

        // ..3 5 3..
        for(int i = size - 1; i >= 0; i--) {
            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                preSmaller[stack.pop()] = i;
            }
            stack.push(i);
        }

        int mod = (int) Math.pow(10, 9) + 7;
        long res = 0;
        for(int i = 0; i < size; i++) {
            long count = (i - preSmaller[i]) * (nextSmaller[i] - i) % mod;
            res = res % mod + (count * arr[i]) % mod;
        }
        return (int) res;
    }
}
