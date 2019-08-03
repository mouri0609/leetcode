package code.LinkedList.newCoder;

import code.LinkedList.Node.TreeNode;

import java.util.Stack;

/**
 * @Author: Agile¡ª¡ªMouri
 * @Date: 2019/8/2
 */
public class ConvertBSTToBiList {
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree==null){
            return null;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = pRootOfTree;
        TreeNode pre = null;
        TreeNode root = null;

        boolean flag = true;
        while(p!=null||!stack.isEmpty()){
            while(p!=null){
                stack.push(p);
                p = p.left;
            }
            p = stack.pop();
            if (flag){
                root = p;
                pre = p;
                flag = false;
            }else {
                pre.right = p;
                p.left = pre;
                pre = p;
            }
            p = p.right;
        }
        return root;
    }
}
