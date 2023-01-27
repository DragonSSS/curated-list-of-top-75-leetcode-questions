package leetcode.stack;

import java.util.Stack;

public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        
        for(int asteroid : asteroids) {
            if (asteroid > 0) {
                stack.push(asteroid);
            } else {
                while(!stack.isEmpty() && stack.peek() > 0 && Math.abs(asteroid) > stack.peek()) {
                    stack.pop();
                }
                
                if(stack.isEmpty() || stack.peek() < 0) {
                    stack.push(asteroid);
                } else if (asteroid + stack.peek() == 0) {
                    stack.pop();
                }
            }
        }
        
        int[] res = new int[stack.size()];
        for(int i = res.length - 1; i >= 0; i--) {
            res[i] = stack.pop();
        }
        
        return res;
    }

    public int[] asteroidCollision_2r(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int asteroid : asteroids) {
            if (asteroid > 0) {
                stack.push(asteroid);
            } else {
                while(!stack.isEmpty() && stack.peek() > 0 && Math.abs(asteroid) > stack.peek()) {
                    stack.pop();
                }
                
                if (!stack.isEmpty() && Math.abs(asteroid) == stack.peek()) {
                    stack.pop();
                } else if (stack.isEmpty() || stack.peek() < 0) {
                    stack.push(asteroid);
                }
            }
        }
        
        int[] res = new int[stack.size()];
        int index = stack.size() - 1;
        while(!stack.isEmpty()) {
            res[index--] = stack.pop();
        }
        return res;
    }

    // use stack to simulate the process
    // possible cases:
    // + + 
    // - -
    // + - (have to address)
    // - + 
    public int[] asteroidCollision_3r(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
         for(int asteroid : asteroids) {
             if (asteroid > 0) {
                 stack.push(asteroid);
             } else {
                 while(!stack.isEmpty() && stack.peek() > 0 && Math.abs(asteroid) > stack.peek()) {
                     stack.pop();
                 }
                 
                 if (stack.isEmpty() || stack.peek() < 0) {
                     stack.push(asteroid);
                 } else if (stack.peek() + asteroid == 0) {
                     stack.pop();
                 }
             }
         }
         
         int size = stack.size();
         int[] res = new int[size];
         int index = size - 1;
         while(!stack.isEmpty()) {
             res[index--] = stack.pop();
         }
         return res;
     }
}
