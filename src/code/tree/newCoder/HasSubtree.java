package code.tree.newCoder;

import code.LinkedList.Node.TreeNode;

/**
 * @Author: Agile——Mouri
 * @Date: 2019/7/29
 * @Title: 牛客网树的子结构
 */
public class HasSubtree {
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if (root1==null){
            return false;
        }
        if (root2==null){
            return false;
        }

        return isSub(root1,root2)||HasSubtree(root1.left,root2)||HasSubtree(root1.right,root2);
    }

    private boolean isSub(TreeNode root1,TreeNode root2){
        if (root1==null){
            return true;
        }
        if (root2==null){
            return false;
        }
        if (root1.val!=root2.val){
            return false;
        }
        return isSub(root1.left,root2.left)&&isSub(root1.right,root2.right);
    }
}
