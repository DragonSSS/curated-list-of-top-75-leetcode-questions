package leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        //edge case
        if (nums == null || nums.length == 0)
            return res;

        // O(nlogn)
        Arrays.sort(nums);

        // O(n(n - 1) / 2 = n^2)
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            if(i >= 1 && nums[i] == nums[i - 1])
                continue;

            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    right--;
                    left++;
                } else if (sum > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return res;
    }

    public List<List<Integer>> threeSum_2r(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++) {
            if(i >= 1 && nums[i] == nums[i-1])
                continue;
            
            int start = i + 1;
            int end = nums.length - 1;
            while(start < end) {
                int sum = nums[i] + nums[start] + nums[end];
                
                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    while(start < end && nums[start] == nums[start + 1]) {
                        start++;
                    }
                    while(start < end && nums[end] == nums[end - 1]) {
                        end--;
                    }
                    start++;
                    end--;
                } else if (sum < 0) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        return res;
    }

    public List<List<Integer>> threeSum_3r(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums.length < 3) {
            return res;
        }
        
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            
            if (i >= 1 && nums[i] == nums[i - 1])
                continue;
            
            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while(left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while(left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                } else if (sum > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return res;
    }

    public List<List<Integer>> threeSum_4r(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums.length < 3)
            return res;
        
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            if (i > 0 && nums[i - 1] == nums[i])
                continue;
            
            int low = i + 1;
            int high = n - 1;
            while(low < high) {
                int sum = nums[i] + nums[low] + nums[high];
                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    while(low < high && nums[low + 1] == nums[low]) {
                        low++;
                    }
                    while(low < high && nums[high - 1] == nums[high]) {
                        high--;
                    }
                    low++;
                    high--;
                } else if (sum > 0) {
                    high--;
                } else {
                    low++;
                }
            }
        }
        return res;
    }

    public List<List<Integer>> threeSum_5r(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        int size = nums.length;
        for(int i = 0; i < size; i++) {
            if(i > 0 && nums[i - 1] == nums[i]) {
                continue;
            }

            int left = i + 1;
            int right = size - 1;
            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    while(left < right && nums[left + 1] == nums[left]) {
                        left++;
                    }

                    while(left < right && nums[right - 1] == nums[right]) {
                        right--;
                    }
                    left++;
                    right--;
                } else if (sum > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return res;
    }
}
