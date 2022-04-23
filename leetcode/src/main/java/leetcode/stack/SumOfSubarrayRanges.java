package leetcode.stack;

import java.util.Arrays;
import java.util.Stack;

public class SumOfSubarrayRanges {
    public long subArrayRanges(int[] nums) {
        long res = 0;
        for (int i = 0; i < nums.length; i++) {
            long max = nums[i], min = nums[i];
            for(int j = i; j < nums.length; j++) {
                max = Math.max(max, nums[j]);
                min = Math.min(min, nums[j]);
                res += (max - min);
            }
        }
        return res;
    }

    public long subArrayRanges_2r(int[] nums) {
        int size = nums.length;
        long sum = 0;
        Stack<Integer> stack = new Stack<>();
        int[] preLess = new int[size];
        int[] nextLess = new int[size];
        int[] preGreater = new int[size];
        int[] nextGreater = new int[size];
        
        Arrays.fill(preLess , -1);
        Arrays.fill(nextLess , size);
        Arrays.fill(preGreater , -1);
        Arrays.fill(nextGreater , size);
        
        
        for(int i = 0; i < size; i++){
            while(!stack.isEmpty() && nums[stack.peek()] > nums[i]){
                nextLess[stack.pop()] = i;
            }
            stack.push(i);
        }
        
        stack.clear();
        
        for(int i = size - 1; i >= 0; i--){
            while(!stack.isEmpty() && nums[stack.peek()] >= nums[i]){
                
                preLess[stack.pop()] = i;
            }
            stack.push(i);
        }
        
        stack.clear();
        
        for(int i = 0; i < size; i++){
            while(!stack.isEmpty() && nums[stack.peek()] < nums[i]){
                nextGreater[stack.pop()] = i;
            }
            stack.push(i);
        }
        
        stack.clear();
        
        for(int i = size - 1; i >= 0; i--){
            while(!stack.isEmpty() && nums[stack.peek()] <= nums[i]){
                preGreater[stack.pop()] = i;
            }
            stack.push(i);
        }
        
        
        for(int i = 0; i < size; i++){
            long leftLess = i - preLess[i];
            long rightLess = nextLess[i]-i;
            long leftGreater = i - preGreater[i];
            long rightGreater = nextGreater[i]-i;
            sum+= (rightGreater*leftGreater - leftLess*rightLess) * nums[i];
        }
        
        return sum;
    }    
}
