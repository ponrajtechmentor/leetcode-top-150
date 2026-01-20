package Leetcode.LinkedList;

public class Solution_003 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode t = head, t1 = l1, t2 = l2;

        while (t1 != null && t2 != null){
            if(t1.val < t2.val){
                t.next = t1;
                t1 = t1.next;
                t = t.next;
            }
            else {
                t.next = t2;
                t2 = t2.next;
                t = t.next;
            }
            t.next = null;
        }
        if(t1 != null){
            t.next = t1;
        }
        else if(t2 != null){
            t.next = t2;
        }
        return head.next;
    }
}