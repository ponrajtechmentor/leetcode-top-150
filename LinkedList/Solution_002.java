package Leetcode.LinkedList;

public class Solution_002 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode t = head;
        ListNode t1 = l1, t2 = l2;

        int carry = 0;
        while(t1 != null || t2 != null){
            int sum = carry;
            if(t1 != null){
                sum += t1.val;
                t1 = t1.next;
            }
            if(t2 != null){
                sum += t2.val;
                t2 = t2.next;
            }
            ListNode node = new ListNode(sum % 10);
            t.next = node;
            t = t.next;
            carry = sum / 10;
        }
        if(carry == 1){
            ListNode node = new ListNode(1);
            t.next = node;
        }
        return head.next;
    }
}
