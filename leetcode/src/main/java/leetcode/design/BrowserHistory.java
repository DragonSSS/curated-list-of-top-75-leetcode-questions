package leetcode.design;

public class BrowserHistory {
    class ListNode {
        String url;
        ListNode next, pre;
        
        public ListNode(String url){
            this.url = url;
            next = null;
            pre = null;
        }
    }
    
    ListNode cur;
    // double linkedlist fit perfectly
    public BrowserHistory(String homepage) {
        cur = new ListNode(homepage);
    }
    
    public void visit(String url) {
        ListNode node = new ListNode(url);
        cur.next = node;
        node.pre = cur;
        cur = node;
    }
    
    public String back(int steps) {
        while(cur.pre != null && steps > 0) {
            cur = cur.pre;
            steps--;
        }
        return cur.url;
    }
    
    public String forward(int steps) {
        while(cur.next != null && steps > 0) {
            cur = cur.next;
            steps--;
        }
        return cur.url;
    }

    // 2r
    // class LinkedNode {
    //     LinkedNode pre;
    //     LinkedNode next;
    //     String url;

    //     public LinkedNode(String url) {
    //         this.url = url;
    //     }
    // }

    // LinkedNode cur;
    // public BrowserHistory(String homepage) {
    //     cur = new LinkedNode(homepage);
    // }
    
    // public void visit(String url) {
    //     LinkedNode add = new LinkedNode(url);
    //     add.pre = cur;
    //     cur.next = add;
    //     cur = add;
    // }
    
    // public String back(int steps) {
    //     while(cur.pre != null && steps > 0) {
    //         cur = cur.pre;
    //         steps--;
    //     }
    //     return cur.url;
    // }
    
    // public String forward(int steps) {
    //     while(cur.next != null && steps > 0) {
    //         cur = cur.next;
    //         steps--;
    //     }
    //     return cur.url;
    // }
}
