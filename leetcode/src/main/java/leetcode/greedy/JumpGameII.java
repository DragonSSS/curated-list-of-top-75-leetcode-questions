package leetcode.greedy;

import java.util.Queue;
import java.util.LinkedList;

public class JumpGameII {
    // bfs
    public int jump_bfs(int[] nums) {
        int max = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
        int res = 0;
        int target = nums.length - 1;
        while(!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int curIndex = queue.poll();
                if (curIndex == target) {
                    return res;
                }
                int steps = nums[curIndex];
                for (int j = 1; j <= steps; j++) {
                    int nextIndex = curIndex + j;
                    if (nextIndex <= target && nextIndex > max) {
                        max = Math.max(max, nextIndex);
                        queue.offer(nextIndex);
                    }
                }
            }
            res++;
        }
        return res;
    }

    // greedy
    public int jump_greedy(int[] nums) {
        int res = 0;
        int index = 0;
        while(index < nums.length - 1) {
            int left = index + 1;
            int right = index + nums[index];
            int max = 0;
            if (right >= nums.length - 1) {
                return res + 1;
            }

            for (int i = left; i <= right; i++) {
                if (nums[i] + i >= max) {
                    max = nums[i] + i; // this make next jump subarray have largest possible range, so use this index for next jump.
                    index = i;
                }
            }
            res++;
        }
        return res;
    }
}
