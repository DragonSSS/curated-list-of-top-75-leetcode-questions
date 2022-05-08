package leetcode.stack;

import java.util.Stack;
import java.util.Arrays;

public class NextGreaterElementII {
    public int[] nextGreaterElements(int[] nums) {
        // trick:
        // loop the nums twice to make it like circle
        // the nums are not unique
        // so have to use index to track element
        Stack<Integer> stack = new Stack<>();
        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res, -1);
        for(int i = 0; i < n * 2; i++) {
            while(!stack.isEmpty() && nums[stack.peek()] < nums[i % n]) {
                res[stack.pop()] = nums[i % n];
            }
            if (i < n)
                stack.push(i % n);
        }
        
        return res;
    }

    public int[] nextGreaterElements_2r(int[] nums) {
        int size = nums.length;
        int[] res = new int[size];
        Stack<Integer> stack = new Stack<>();
        Arrays.fill(res, -1);
        for(int i = 0; i < size * 2; i++) {
            while(!stack.isEmpty() && nums[stack.peek()] < nums[i % size]) {
                res[stack.pop()] = nums[i % size];
            }
            if (i < size)
                stack.push(i);
        }
        return res;
    }
}
