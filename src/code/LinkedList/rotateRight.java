package code.LinkedList;

import code.LinkedList.Node.ListNode;

public class rotateRight {
    public ListNode rotateRight(ListNode head, int k) {
        //判断head是否为空
        if(head==null||k==0){
            return head;
        }
        int length = 0;
        ListNode newHead = head;
        while (head!=null){
            head = head.next;
            length++;
        }

        //获取旋转的数字
        int rotateNum = k%length;
        if(rotateNum==0){
            return newHead;
        }
        ListNode listNode = new ListNode(-1);
        listNode.next = newHead;

        ListNode slow = newHead;
        ListNode fast = newHead;
        ListNode prevslow = listNode;
        ListNode prevfast = listNode;

        for (int i =0;i<rotateNum;i++){
            prevfast = prevfast.next;
            if (fast != null) {
                fast = fast.next;
            }
        }
        while (fast!=null){
            prevslow = prevslow.next;
            prevfast = prevfast.next;
            fast = fast.next;
            slow = slow.next;
        }
        prevslow.next = null;
        prevfast.next = listNode.next;
        listNode.next = slow;

        return listNode.next;
    }
}
