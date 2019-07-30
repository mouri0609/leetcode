package code.tree.leetcode;

import code.LinkedList.Node.TreeNode;
/*
����������������ϼ�����
�ڶ����������Ѱ����С�ĵ�k������
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
