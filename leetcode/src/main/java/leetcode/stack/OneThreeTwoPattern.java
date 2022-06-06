package leetcode.stack;

import java.util.Stack;

public class OneThreeTwoPattern {
    public boolean find132pattern(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int nextSmaller = Integer.MIN_VALUE;
    
        for(int i = nums.length - 1; i >= 0; i--){
            if(nums[i] < nextSmaller){
                return true;
            }
            while(!stack.isEmpty() && stack.peek() < nums[i]){
                nextSmaller = stack.peek();
                stack.pop();
            }
            stack.push(nums[i]);
        }
        return false;  
    }    
}
