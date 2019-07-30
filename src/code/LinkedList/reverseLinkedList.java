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
      �ݹ�������ת
       */
//    public ListNode reverseList(ListNode head) {
//        //�ݹ���ֹ����
//        if (head==null||head.next==null){
//          return head;
//        }
//        ListNode node = head.next;
//        //newHead�����һ���ڵ�
//        ListNode newHead = reverseList(node);
//        //�����һ���ڵ㷴ת���ӵ������ڶ����ڵ���
//        node.next = head;
//        head.next = null;
//        return newHead;
//    }

    /*
      �ǵݹ�������ת
     */
    public ListNode reverseList(ListNode head) {
      ListNode listNode = new ListNode(-1);
      if (head==null||head.next==null){
        return head;
      }
      //��ԭ����ͷ�ڵ�ȡ���������뵽������
      while(head!=null){
        ListNode temp = head;
        head = head.next;
        temp.next = listNode.next;
        listNode.next = temp;
      }
      return listNode.next;
    }
}
