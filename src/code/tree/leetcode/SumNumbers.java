package code.tree.leetcode;

import code.LinkedList.Node.TreeNode;
/*
leetcode 129
求根到叶子节点数字之和
 */
public class SumNumbers {
    private int result = 0;
    public int sumNumbers(TreeNode root) {
        sumNumbersInternally(0,root);
        return result;
    }

    private void sumNumbersInternally(int sums,TreeNode node){
        if(node==null){
            return;
        }
        sums = sums*10+node.val;
        if (node.left==null&&node.right==null){
            result = result+sums;
        }
        sumNumbersInternally(sums,node.left);
        sumNumbersInternally(sums,node.right);
    }
}
