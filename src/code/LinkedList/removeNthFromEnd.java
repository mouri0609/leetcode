package code.LinkedList;

public class removeNthFromEnd {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (n<1){
            return head;
        }
        ListNode fast = head;
        while (n-->0){
            fast = fast.next;
        }
        ListNode slow = head;
        if (fast==null){
            return head.next;
        }
        while (fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
