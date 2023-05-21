package leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsII {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        //edge case
        if (nums == null || nums.length == 0)
            return res;

        // O(nlogn)
        Arrays.sort(nums);
        // O(2^n)
        helper(nums, res, new ArrayList<>(), 0);
        return res;
    }

    private void helper(int[] nums, List<List<Integer>> res, List<Integer> subset, int index) {
        res.add(new ArrayList<>(subset));

        for(int i = index; i < nums.length; i++) {
            // trick
            if (i > index && nums[i] == nums[i - 1]) continue;
            subset.add(nums[i]);
            helper(nums, res, subset, i + 1);
            subset.remove(subset.size() - 1);
        }
    }

    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup_2r(int[] nums) {
        Arrays.sort(nums);
        helper_2r(nums, 0, new ArrayList<>());
        return res;
    }

    private void helper_2r(int[] nums, int index, List<Integer> curList) {
        res.add(new ArrayList<>(curList));

        for(int i = index; i < nums.length; i++) {
            if(i > index && nums[i - 1] == nums[i]) {
                continue;
            }

            curList.add(nums[i]);
            helper_2r(nums, i + 1, curList);
            curList.remove(curList.size() - 1);
        }
    }
}
