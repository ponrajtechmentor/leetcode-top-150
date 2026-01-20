package Leetcode.LinkedList;

public class Solution_007 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head, slow = head;
        int count = 0;
        for(int i = 0; i <= n && fast != null; i++, count++){
            fast = fast.next;
        }
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
            count++;
        }
        if(n == count){
            head = head.next;
        }
        else if(slow != null && slow.next != null){
            slow.next = slow.next.next;
        }
        return head;
    }
}