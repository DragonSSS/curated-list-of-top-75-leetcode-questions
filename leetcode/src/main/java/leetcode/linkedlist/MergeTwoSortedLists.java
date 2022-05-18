package leetcode.linkedlist;

import util.ListNode;

public class MergeTwoSortedLists {
    // two sorted linked lists
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;

        if (l2 == null)
            return l1;

        ListNode dummy = new ListNode();
        ListNode res = dummy;
        while(l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                dummy.next = l1;
                l1 = l1.next;
            } else {
                dummy.next = l2;
                l2 = l2.next;
            }

            dummy = dummy.next;
        }

        if (l1 != null) {
            dummy.next = l1;
        }

        if (l2 != null) {
            dummy.next = l2;
        }

        return res.next;
    }

    public ListNode mergeTwoLists_2r(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        
        while(list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                cur.next = list1;
                list1 = list1.next;
            } else {
                cur.next = list2;
                list2 = list2.next; 
            }
            
            cur = cur.next;
        }
        
        if(list1 != null) {
            cur.next = list1;
        }
        
        if(list2 != null) {
            cur.next = list2;
        }
        
        return dummy.next;
    }

    public ListNode mergeTwoLists_3r(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode node = dummy;
        
        while(list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                node.next = list1;
                list1 = list1.next;
            } else {
                node.next = list2;
                list2 = list2.next;
            }
            node = node.next;
        }
        
        if (list1 != null) {
            node.next = list1;
        }
        
        if (list2 != null) {
            node.next = list2;
        }
        
        return dummy.next;
    }
}
