package code.LinkedList;

import code.LinkedList.Node.ListNode;

public class reverseBetween {
    /*
    ��ת������m-n�Ľڵ�
     */
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummpyHead = new ListNode(-1);
        dummpyHead.next = head;
        ListNode pre = dummpyHead;
        for (int i=1;i<m;i++){
            head = head.next;
            pre = pre.next;
        }
        //��ͼ
        for (int i = m;i<n;i++){
            ListNode next = head.next;
            head.next = next.next;
            next.next = pre.next;
            pre.next = next;
        }
        return dummpyHead.next;
    }
}
