package leetcode.linkedlist;

import java.util.HashMap;
import java.util.Map;
import util.ListNode;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        if (fast != null) {
            slow = slow.next;
        }

        slow = reverse(slow);
        fast = head;

        while(slow != null) {
            if(fast.val != slow.val) {
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }
        return true;
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

    public boolean isPalindrome_hashtable(ListNode head) {
        Map<Integer, Integer> map = new HashMap<>();
        int index = 0;
        while(head != null) {
            map.put(index++, head.val);
            head = head.next;
        }

        int n = map.size();

        int i, j;
        if (n % 2 == 0) {
            i = n / 2 - 1;
            j = n / 2;
        } else {
            i = n / 2; 
            j = n / 2;
        }

        while (i >= 0 && j <= n - 1) {
            if (map.get(i) != map.get(j))
                return false;
            i--;
            j++;
        }
        
        return true;
    }

    public boolean isPalindrome_2r(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        slow = reverse_2r(slow);
        fast = head;

        while(slow != null) {
            if(slow.val != fast.val) {
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }

    private ListNode reverse_2r(ListNode head) {
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
