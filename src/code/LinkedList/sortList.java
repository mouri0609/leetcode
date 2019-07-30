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
        三个指针
        fast和slow指针用于将链表分为两个部分，slow指针指向中间；
        prev指针始终在slow前面，用于将链表分为两个小链表；
        prev作为一个链表的尾部，slow作为一个链表的头部。
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
        判断条件是某一个链表尾部为
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
        //返回空节点的下一个节点
        return dummpyHead.next;
    }
}
