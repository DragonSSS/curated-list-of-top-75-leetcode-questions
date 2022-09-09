package leetcode.linkedlist;

public class FindTheDuplicateNumber {
    // index: 0 1 2 3 4
    // value: 1 3 4 2 2
    
    // 0 -> 1 -> 3 -> 2 -> 4 - > 2
    // linkedlist cycle problem
    // floyd’s cycle detection algorithm
    public int findDuplicate(int[] nums) {
        int slow = 0, fast = 0;
        boolean first = true;
        while(first || slow != fast) {
            first = false;
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        
        int slow1 = 0;
        while(slow != slow1) {
            slow = nums[slow];
            slow1 = nums[slow1];
        }
        
        return slow;
    }    
}
