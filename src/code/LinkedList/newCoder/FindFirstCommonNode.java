package code.LinkedList.newCoder;

import code.LinkedList.Node.ListNode;

import java.util.List;

/**
 * @Author: Agile——Mouri
 * @Date: 2019/8/2
 * @Title: 剑指offer_两个链表的公共节点
 */
public class FindFirstCommonNode {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ListNode head1 = pHead1;
        ListNode head2 = pHead2;
        ListNode longhead = pHead1;
        ListNode shorthead = pHead2;
        ListNode temp = null;

        int subLength = 0;
        while (head1!=null&&head2!=null){
            head1 = head1.next;
            head2 = head1.next;
        }

        if (head1==null){
            temp = head2;
            shorthead = pHead1;
            longhead = pHead2;
        }else {
            temp = head1;
        }

        while (temp!=null){
            temp = temp.next;
            subLength++;
        }

        while (subLength>0){
            longhead = longhead.next;
            subLength--;
        }

        while (longhead!=shorthead&&longhead!=null&&shorthead!=null){
            longhead = longhead.next;
            shorthead = shorthead.next;
        }
        return shorthead;

    }
}
