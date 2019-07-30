package code.LinkedList;

import code.LinkedList.Node.ListNode;
/*
leetcode 142
��������II
ʹ��˫ָ�룬��һ�������󣬼�¼�����㡣��һ��ָ���ͷ��ʼ��������ָ�������ǰ����������ǽ��㡣
 */
public class DetectCycle {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        boolean isCycle = false;
        while(fast!=null&&fast.next!=null){

            fast = fast.next.next;
            slow = slow.next;

            if(slow==fast){
                isCycle = true;
                break;
            }
        }

        if(!isCycle){
            return null;
        }

        ListNode node = head;
        while(node!=slow){
            node = node.next;
            slow = slow.next;
        }
        return node;
    }
}
