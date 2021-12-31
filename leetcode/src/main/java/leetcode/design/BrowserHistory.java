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
    
    ListNode head, cur;
    // double linkedlist fit perfectly
    public BrowserHistory(String homepage) {
        head = new ListNode(homepage);
        cur = head;
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
}
