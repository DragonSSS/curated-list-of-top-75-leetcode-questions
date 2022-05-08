package leetcode.stack;

import java.util.Map;
import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElementI {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // store next greater one for each element
        // key: nums, value: next greater one
        Map<Integer, Integer> map = new HashMap<>();
        // store any element that didn't find its next greater one yet
        Stack<Integer> stack = new Stack<>();
        
        for (int num : nums2) {
            // if there is the number waiting in stack to compare with current number
            // and current num is bigger than peek of stack
            // add key-value to the map by poping the peek
            // keep pop if element is left and satisfy condition
            while(!stack.isEmpty() && stack.peek() < num){
                map.put(stack.pop(), num);
            }
            stack.push(num); // keep adding into the stack
        }
        
        int res[] = new int[nums1.length];
        int index = 0;
        for (int num : nums1) {
            res[index++] = map.getOrDefault(num, -1);
        }
        return res;
    }

    public int[] nextGreaterElement_2r(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for(int num : nums2){
            while(!stack.isEmpty() && stack.peek() < num) {
                map.put(stack.pop(), num);
            }
            stack.push(num);
        }
        
        int[] res = new int[nums1.length];
        int index = 0;
        for(int num : nums1) {
            if (!map.containsKey(num)) {
                res[index] = -1;
            } else {
                res[index] = map.get(num);
            }
            index++;
        }
        return res;
    }
}
