package code.tree;

import java.util.LinkedList;

/**
 * Created by Mouri on 2018/11/27 19:20
 */
public class OverturnBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode invertTree(TreeNode root) {
        if (root==null){
            return root;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        if(root.left!=null){
            invertTree(root.left);
        }
        if (root.right!=null){
            invertTree(root.right);
        }
        return root;
    }
}
