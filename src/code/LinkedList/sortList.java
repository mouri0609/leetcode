package code.LinkedList;

import code.LinkedList.Node.ListNode;

public class sortList {
    public ListNode sortList(ListNode head) {
        return head==null?null:mergeList(head);
    }

    public ListNode mergeList(ListNode head){
        if (head==null){
            return null;
        }else if (head.next==null){
            return head;
        }
        /*
        ����ָ��
        fast��slowָ�����ڽ������Ϊ�������֣�slowָ��ָ���м䣻
        prevָ��ʼ����slowǰ�棬���ڽ������Ϊ����С����
        prev��Ϊһ�������β����slow��Ϊһ�������ͷ����
         */
        ListNode prev = head;
        ListNode slow = prev.next;
        ListNode fast = slow.next;

        while (fast!=null&&fast.next!=null){
            prev = prev.next;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        ListNode l = mergeList(head);
        ListNode r = mergeList(slow);
        return merge(l,r);
    }

    public ListNode merge(ListNode l, ListNode r){
        ListNode dummpyHead = new ListNode(0);
        ListNode node = dummpyHead;
        /*
        �ж�������ĳһ������β��Ϊ
         */
        while (l!=null&&r!=null){
            if (l.val<r.val){
                node.next = l;
                l = l.next;
                node = node.next;
            }else {
                node.next = l;
                l = l.next;
                node = node.next;
            }
        }
        if (l!=null){
            node.next = l;
        }
        if (r!=null){
            node.next = r;
        }
        //���ؿսڵ����һ���ڵ�
        return dummpyHead.next;
    }
}
