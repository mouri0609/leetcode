package code.LinkedList;

import code.LinkedList.Node.ListNode;
/*
leetcode 142
环形链表II
使用双指针，第一次相遇后，记录相遇点。另一个指针从头开始，相遇点指针继续向前。相遇点就是交点。
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
