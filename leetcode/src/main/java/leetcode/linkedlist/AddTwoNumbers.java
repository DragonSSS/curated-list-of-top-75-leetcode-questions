package leetcode.linkedlist;

import util.ListNode;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode cur = dummy;
        int carry = 0;
        while(l1 != null || l2 != null || carry != 0) {
            int val1 = l1 == null? 0 : l1.val;
            int val2 = l2 == null? 0 : l2.val;
            
            int sum = val1 + val2 + carry;
            int rest = sum % 10;
            carry = sum / 10;
            ListNode newNode = new ListNode(rest);
            cur.next = newNode;
            cur = cur.next;
            
            if (l1 != null)
                l1 = l1.next;
            
            if (l2 != null)
                l2 = l2.next;
        }
        return dummy.next;
    }    
}
