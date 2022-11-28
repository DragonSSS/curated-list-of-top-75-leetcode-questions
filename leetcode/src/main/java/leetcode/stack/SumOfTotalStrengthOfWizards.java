package leetcode.stack;

import java.util.Arrays;
import java.util.Stack;

public class SumOfTotalStrengthOfWizards {
    //                      1, 3, 1, 2
    // prefix sum =         0, 1, 4, 5, 7
    // prefix sum of sum =  0, 0, 1, 5, 10 (why we need this)
    // left (smaller than i), left + 1, left + 2, ..., i, ... right - 2, right - 1, right (smaller than i)
    // Find the next and previous smaller by monotonic stack
    //
    // The subarrays that start with left + 1:
    // sum of [left + 1, i] = prefixSum[i + 1] - prefixSum[left + 1];
    // sum of [left + 1, i + 1] = prefixSum[i + 2] - prefixSum[left + 1];
    // sum of [left + 1, right - 1] = prefixSum[right] - prefixSum[left + 1];
    //
    // The subarrays that start with left + 2:
    // sum of [left + 2, i] = prefixSum[i + 1] - prefixSum[left + 2];
    // sum of [left + 2, i + 1] = prefixSum[i + 2] - prefixSum[left + 2];
    // sum of [left + 2, right - 1] = prefixSum[right] - prefixSum[left + 2];
    //
    // The subarrays that start with i:
    // sum of [i, i] = prefixSum[i + 1] - prefixSum[i];
    // sum of [i, i + 1] = prefixSum[i + 2] - prefixSum[i];
    // sum of [i, right - 1] = prefixSum[right] - prefixSum[i];
    
    // the first postive part:
    // (prefixSum[i + 1] + prefixSum[i + 2] + ... + prefixSum[right]) * (i - left)
    // equal to
    // (prefixSumPrefixSum[right + 1] - prefixSumPrefixSum[i + 1]) * (i - left)
    //
    // the second negative part:
    // (prefixSum[left + 1] + prefixSum[left + 2] + ... + prefixSum[i]) * (right - i)
    // equal to
    // (prefixSumPrefixSum[i + 1] - prefixSumPrefixSum[left + 1]) * (right - i)
    private final int MOD = (int)1e9 + 7;
    public int totalStrength(int[] strength) {
        int n = strength.length;
        long[] prefixSum = getPrefixSum(strength);
        long[] prefixSumPrefixSum = getPrefixSum(prefixSum);
        int[] nextSmaller = getNextSmaller(strength);
        int[] preSmaller = getPreSmaller(strength);
        
        long res = 0;
        for(int i = 0 ; i < n; i++) {
            int right = nextSmaller[i];
            int left = preSmaller[i];
            int rightCount = right - i;
            int leftCount = i - left;
            
            res += ((prefixSumPrefixSum[right + 1] - prefixSumPrefixSum[i + 1]) * leftCount % MOD + MOD * 2 - (prefixSumPrefixSum[i + 1] - prefixSumPrefixSum[left + 1]) * rightCount % MOD) * strength[i];
            res %= MOD;
            
        }
        return (int) res;
    }
    
    private long[] getPrefixSum(long[] arr) {
        long[] res = new long[arr.length + 1];
        for(int i = 0; i < arr.length; i++) {
            res[i + 1] = (res[i] + arr[i]) % MOD;
        }
        return res;
    }
    
    private long[] getPrefixSum(int[] arr) {
        long[] res = new long[arr.length + 1];
        for(int i = 0; i < arr.length; i++) {
            res[i + 1] = (res[i] + arr[i]) % MOD;
        }
        return res;
    }
    
    private int[] getNextSmaller(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        Arrays.fill(res, n);
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < n; i++) {
            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                res[stack.pop()] = i;
            }
            stack.push(i);
        }
        return res;
    }
    
    private int[] getPreSmaller(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        Arrays.fill(res, -1);
        Stack<Integer> stack = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while(!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                res[stack.pop()] = i;
            }
            stack.push(i);
        } 
        return res;
    }
}
