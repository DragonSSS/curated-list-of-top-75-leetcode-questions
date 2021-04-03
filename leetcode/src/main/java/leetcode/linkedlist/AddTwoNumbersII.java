package leetcode.linkedlist;

import util.ListNode;

import java.util.Stack;

public class AddTwoNumbersII {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        while(l1 != null || l2 != null) {
            if(l1 != null) {
                stack1.push(l1.val);
                l1 = l1.next;
            }
            if(l2 != null) {
                stack2.push(l2.val);
                l2 = l2.next;
            }
        }

        int carry = 0;

        ListNode head = new ListNode(0);

        while(!stack1.isEmpty() || !stack2.isEmpty()) {
            int sum = carry;

            if(!stack1.isEmpty()) {
                sum += stack1.pop();
            }

            if(!stack2.isEmpty()) {
                sum+= stack2.pop();
            }

            ListNode newNode = new ListNode(sum % 10);
            newNode.next = head.next;
            head.next = newNode;

            carry = sum / 10;
        }

        if(carry == 1) {
            ListNode newNode = new ListNode(1);
            newNode.next = head.next;
            head.next = newNode;
        }

        return head.next;
    }
}
