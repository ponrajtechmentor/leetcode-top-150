package Leetcode.LinkedList;

public class Solution_004 {
    public Node copyRandomList(Node h1) {
        Node t1 = h1;
        Node h2 = new Node(0);
        Node t2 = h2;
        while(t1 != null){
            Node node = new Node(t1.val);
            t1 = t1.next;

            t2.next = node;
            t2 = t2.next;
        }
        while(t1 != null){
            if(t1.random == null){
                t2.random = null;
            }
            else {
                Node k1 = h1;
                Node k2 = h2.next;
                while(k1 != null && k1 != t1.random){
                    k1 = k1.next;
                    k2 = k2.next;
                }
                t2.random = k2;
            }
            t1 = t1.next;
            t2 = t2.next;
        }
        return h2.next;
    }
}
