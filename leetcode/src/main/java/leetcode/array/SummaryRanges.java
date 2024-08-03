package leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        Arrays.sort(nums);
        List<String> res = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            int start = nums[i];
            while(i < nums.length - 1 && nums[i + 1] == nums[i] + 1) {
                i++;
            }
            if (start != nums[i]) {
                res.add(start + "->"+ nums[i]);
            } else {
                res.add(String.valueOf(start));
            }
        }
        return res;
    }    
}
