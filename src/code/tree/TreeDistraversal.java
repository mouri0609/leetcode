package code.tree;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.Stack;

public class TreeDistraversal {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static void preOrderRecursive(TreeNode root){

        Stack<TreeNode> stack = new Stack<>();
        while (root!=null||!stack.isEmpty()){
            while (root!=null){
                System.out.println(root.val);
                 stack.push(root);
                 root = root.left;
            }
            if (!stack.isEmpty()){
                root = stack.pop();
                root = root.right;
            }
        }
    }

    public static void inOrderRecursive(TreeNode root){

        Stack<TreeNode> stack = new Stack<>();
        while (root!=null||!stack.isEmpty()){
            while (root!=null){
                stack.push(root);
                root = root.left;
            }
            if (!stack.isEmpty()){
                root = stack.pop();
                System.out.println(root.val);
                root = root.right;
            }
        }
    }
    //难点
    public static void lastOrderRecursive(TreeNode root){
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode cur = root;
        /* 用来记录最新出栈的节点，
         * 如果当前节点的右儿子与flag相同，说明当前节点右子树已完成遍历
         */
        TreeNode flag = null;
        ArrayList<Integer> ans = new ArrayList<Integer>(20);
        while (cur != null) {
            stack.push(cur);
            cur = cur.left;
        }
        while (!stack.isEmpty()) {
            cur = stack.pop();
            if (cur.right == null || cur.right == flag) {
                ans.add(cur.val);
                flag = cur;
            }
            else {
                stack.push(cur);
                cur = cur.right;
                while(cur != null) {
                    stack.push(cur);
                    cur = cur.left;
                }
            }
        }
    }

}
