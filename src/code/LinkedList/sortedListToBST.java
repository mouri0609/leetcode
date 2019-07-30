package code.LinkedList;

import code.LinkedList.Node.ListNode;
import code.LinkedList.Node.TreeNode;

public class sortedListToBST {
    public TreeNode sortedListToBST(ListNode head) {
        if (head==null){
            return null;
        } else if (head.next==null){
            return new TreeNode(head.val);
        }

        /*
        ��Ҫ����ָ�룬��ָ����Ϊ�жϽڵ������������
        ��ָ��ѡ��root�ڵ㣻
        ��ָ���ǰ��ָ�뽫����Ͽ�
         */
        ListNode prev = head;
        ListNode slow = prev.next;
        ListNode fast = slow.next;

        while (fast!=null&&fast.next!=null){
            prev = prev.next;
            slow = slow.next;
            fast = fast.next.next;
        }
        //�Ͽ�����
        prev.next = null;
        TreeNode root = new TreeNode(slow.val);
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(slow.next);
        return root;
    }
}
