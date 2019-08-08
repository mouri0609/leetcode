package code.LinkedList.newCoder;

import code.LinkedList.Node.ListNode;

/**
 * @Author: Agile¡ª¡ªMouri
 * @Date: 2019/8/5
 */
public class DeleteDuplication {
    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead==null||pHead.next==null){
           return pHead;
        }
        ListNode preNode = null;
        ListNode node = pHead;


        while (node!=null){
            if (node.next!=null&&node.val==node.next.val){
                int value = node.val;
                while (node.next!=null&&node.next.val==value){
                    node = node.next;
                }

                if (preNode==null){
                    pHead = node.next;
                }else {
                    preNode.next = node.next;
                }

            }else {
                preNode = node;
            }
            node = node.next;
        }
        return pHead;
    }
}


