package code.LinkedList.newCoder;

import code.LinkedList.Node.ListNode;
import code.LinkedList.Node.TreeNode;

import java.util.List;

/**
 * @Author: Agile¡ª¡ªMouri
 * @Date: 2019/8/5
 */
public class EntryNodeOfLoop {
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
       if (pHead==null||pHead.next==null){
           return null;
       }

       ListNode slow = pHead;
       ListNode fast = pHead;

       boolean isCircle = false;
       while (fast!=null&&fast.next!=null){
           fast = fast.next.next;
           slow = slow.next;

           if (slow==fast){
               isCircle = true;
               break;
           }
       }

       if (!isCircle){return null;}
       slow = pHead;

       while (slow!=fast){
           slow = slow.next;
           fast = fast.next;
       }
       return slow;
    }
}
