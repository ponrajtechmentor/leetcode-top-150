package Leetcode.LinkedList;

public class Solution_009 {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0){
            return head;
        }
        ListNode t = head;
        int size = 0;
        while(t != null){
            size++;
            t = t.next;
        }
        k = k % size;
        t = head;
        ListNode t1 = head;
        while(t.next != null && k > 0){
            k--;
            t = t.next;
        }
        while(t.next != null){
            t = t.next;
            t1 = t1.next;
        }
        t.next = head;
        head = t1.next;
        t1.next = null;
        return head;
    }
}