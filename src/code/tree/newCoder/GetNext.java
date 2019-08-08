package code.tree.newCoder;

import javax.swing.tree.TreeCellRenderer;

/**
 * @Author: Agile����Mouri
 * @Date: 2019/8/5
 */


public class GetNext {
    public class TreeLinkNode {
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;

        TreeLinkNode(int val) {
            this.val = val;
        }
    }

    public TreeLinkNode GetNext(TreeLinkNode pNode){
        if (pNode.right!=null){
            TreeLinkNode node  = pNode.right;
            while (node.left!=null){
                node = node.left;
            }
            return node;
        }else {
            while (pNode.next!=null){
                TreeLinkNode parent = pNode.next;
                if (parent.left==pNode){
                    return parent;
                }
                pNode = pNode.next;
            }
        }
        return null;
    }
}
