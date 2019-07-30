package code.tree.leetcode;

import code.LinkedList.Node.TreeNode;

public class FindSecondMinimumValue {
    public int findSecondMinimumValue(TreeNode root) {
        if (root==null){
            return -1;
        }
        int vaule = findSecondMinimumValueInternally(root,root.val);
        return vaule;
    }

    private int findSecondMinimumValueInternally(TreeNode root,int value){
        if (root==null){
            return -1;
        }

        if (root.val>value){
            return root.val;
        }
        int left = findSecondMinimumValueInternally(root.left,value);
        int right = findSecondMinimumValueInternally(root.right,value);


        if (left!=-1&&right!=-1){
            return Math.min(left,right);
        }else {
            return Math.max(left,right);
        }

    }
}
