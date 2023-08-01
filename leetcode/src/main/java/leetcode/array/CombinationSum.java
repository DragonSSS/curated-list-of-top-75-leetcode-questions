package leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        helper(candidates, new ArrayList<>(), target, 0);
        return res;
    }

    private void helper(int[] nums, List<Integer> list, int leftSum, int start) {
        if (leftSum < 0) {
            return;
        } else if (leftSum == 0) {
            res.add(new ArrayList<>(list));
        } else {
            // passing the start here to avoid the duplicate combinations
            for(int i = start; i < nums.length; i++) {
                list.add(nums[i]);
                // still start with i instead of i + 1 as unlimited number of times.
                helper(nums, list, leftSum - nums[i], i);
                list.remove(list.size() - 1);
            }
        }
    }

    // recursion + backtracking
    // List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum_2r(int[] candidates, int target) {
        Arrays.sort(candidates);
        helper_2r(candidates, target, 0, new ArrayList<>());
        return res;
    }

    private void helper_2r(int[] candidates, int target, int index, List<Integer> curList) {
        if (target < 0) {
            return;
        } else if (target == 0) {
            res.add(new ArrayList<>(curList));
        } else {
            for(int i = index; i < candidates.length; i++) {
                curList.add(candidates[i]);
                helper_2r(candidates, target - candidates[i], i, curList);
                curList.remove(curList.size() - 1);
            }
        }
    }
}
