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
        需要三个指针，快指针作为判断节点结束的条件；
        慢指针选出root节点；
        慢指针的前序指针将链表断开
         */
        ListNode prev = head;
        ListNode slow = prev.next;
        ListNode fast = slow.next;

        while (fast!=null&&fast.next!=null){
            prev = prev.next;
            slow = slow.next;
            fast = fast.next.next;
        }
        //断开链表
        prev.next = null;
        TreeNode root = new TreeNode(slow.val);
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(slow.next);
        return root;
    }
}
