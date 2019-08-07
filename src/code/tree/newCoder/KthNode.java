package code.tree.newCoder;

import code.LinkedList.Node.TreeNode;

import java.util.HashMap;
import java.util.Stack;

/**
 * @Author: Agile¡ª¡ªMouri
 * @Date: 2019/8/6
 */
public class KthNode {
    TreeNode KthNode(TreeNode pRoot, int k)
    {
        if (k<1){
            return null;
        }
        Stack<TreeNode> stack = new Stack<>();
        while (pRoot!=null||!stack.isEmpty()){
            while (pRoot.left!=null){
                stack.add(pRoot);
                pRoot = pRoot.left;
            }

            if(!stack.isEmpty()){
                pRoot = stack.pop();
                k--;
                if (k==0){
                    break;
                }
                pRoot = pRoot.right;
            }

        }
        return pRoot;
    }
}
