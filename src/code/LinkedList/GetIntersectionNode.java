package code.LinkedList;

import code.LinkedList.Node.ListNode;
/*
leetcode 160
相交链表，返回交点
 */
public class GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null||headB==null){
            return null;
        }
        ListNode HeadA = headA;
        ListNode HeadB = headB;
        ListNode fast;
        ListNode slow;
        int diff = 0;
        while(headA!=null&&headB!=null){
            headA = headA.next;
            headB = headB.next;
        }
        if(headA==null){
            while(headB!=null){
                headB = headB.next;
                diff++;
            }
            fast = HeadB;
            slow = HeadA;
        }else{
            while(headA!=null){
                headA = headA.next;
                diff++;
            }
            fast = HeadA;
            slow = HeadB;
        }


        for(int i=0;i<diff;i++){
            fast = fast.next;
        }

        while(fast!=null){
            if(fast==slow){
                return fast;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return null;
    }
}
