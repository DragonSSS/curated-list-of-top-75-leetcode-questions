package leetcode.linkedlist;

import util.ListNode;

public class MaximumTwinSumOfLinkedList {
    // find the middle by two pointers, break into two linkedlists
    // reverse second linkedlist
    // update current max twin sum
    
    // or stack
    public int pairSum(ListNode head) {
        ListNode fakeHead = head.next;
        
        ListNode pre = head;
        ListNode slow = fakeHead;
        ListNode fast = fakeHead;
        while(fast.next != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode firstHead = head;
        pre.next = null;
        ListNode secondHead = slow;
        
        ListNode newSecondHead = reverse(secondHead);
        
        int res = 0;
        
        while(firstHead != null) {
            res = Math.max(res, firstHead.val + newSecondHead.val);
            firstHead = firstHead.next;
            newSecondHead = newSecondHead.next;
        }
        
        return res;
        
    }
    
    private ListNode reverse(ListNode head) {
        ListNode pre = null;
        while(head != null) {
            ListNode temp = head.next;
            head.next = pre;
            pre = head;
            head = temp;
        }
        return pre;
    }    
}
