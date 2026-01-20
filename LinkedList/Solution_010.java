package Leetcode.LinkedList;

public class Solution_010 {
    public ListNode partition(ListNode head, int x) {
        ListNode h1 = new ListNode(0);
        ListNode t1 = h1;
        ListNode h2 = new ListNode(0);
        ListNode t2 = h2;
        ListNode t = head;

        while(t != null){
            if(t.val < x){
                t1.next = t;
                t1 = t1.next;
            }
            else {
                t2.next = t;
                t2 = t2.next;
            }
            t = t.next;
        }
        t1.next = h2.next;
        t2.next = null;
        return h1.next;
    }
}