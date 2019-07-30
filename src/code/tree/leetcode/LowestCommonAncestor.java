package code.tree.leetcode;

import code.LinkedList.Node.TreeNode;
/*
leetcode 235
����������Ĺ�������LCA����
�ݹ����
 */
public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root==null||root==p||root==q){
            System.out.println(root.val);
            return root;
        }

        TreeNode left = lowestCommonAncestor(root, p, q);
        TreeNode right = lowestCommonAncestor(root, p, q);

        if(left!=null&&right!=null){
            return root;
        }else if (left!=null){
            return left;
        }else if (right!=null){
            return right;
        }
        return null;


    }

}
