package code.tree.leetcode;

import code.LinkedList.Node.TreeNode;

/**
 * @Author: Agile¡ª¡ªMouri
 * @Date: 2019/8/6
 */
public class MergeTrees {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1==null){
            return t2;
        }
        if (t2==null){
            return t1;
        }
        TreeNode node = new TreeNode(t1.val+t2.val);
        node.left = mergeTrees(t1.left,t2.left);
        node.right = mergeTrees(t1.right,t2.right);
        return node;
    }
}
