package code.LinkedList;

import code.LinkedList.Node.ListNode;
import code.tree.BinarySearchTree;

import java.util.List;

public class reverseLinkedList {

    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

      /*
      递归求链表反转
       */
//    public ListNode reverseList(ListNode head) {
//        //递归终止条件
//        if (head==null||head.next==null){
//          return head;
//        }
//        ListNode node = head.next;
//        //newHead是最后一个节点
//        ListNode newHead = reverseList(node);
//        //将最后一个节点反转连接到倒数第二个节点上
//        node.next = head;
//        head.next = null;
//        return newHead;
//    }

    /*
      非递归求链表反转
     */
    public ListNode reverseList(ListNode head) {
      ListNode listNode = new ListNode(-1);
      if (head==null||head.next==null){
        return head;
      }
      //将原链表头节点取出来，插入到新链表。
      while(head!=null){
        ListNode temp = head;
        head = head.next;
        temp.next = listNode.next;
        listNode.next = temp;
      }
      return listNode.next;
    }
}
