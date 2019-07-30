package code.tree.leetcode;

import code.LinkedList.Node.TreeNode;
/*
中序遍历二叉树加上计数器
在二叉查找树中寻找最小的第k个数。
 */
public class KthSmallest {
    private int count = 0;
    private int res;

    public int kthSmallest(TreeNode root,int k){
        if (root==null){
            return -1;
        }
        kthSmallestInternally(root,k);
        return res;
    }

    private void kthSmallestInternally(TreeNode root ,int k){
        if (root==null){
            return;
        }
        kthSmallestInternally(root.left,k);
        count++;
        if (count==k){
            res = root.val;
        }
        kthSmallestInternally(root.right,k);

    }
}
