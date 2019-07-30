package code.tree;

public class findPreBST {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode parent;

        TreeNode(int x) {
            val = x;
        }
    }
    //二叉搜索树的后继节点
    public TreeNode getSucessorNode(TreeNode root){
        if (root==null){
            return null;
        }
        if (root.right!=null){
            return getMostLeft(root.right);
        }else {
            TreeNode parent = root.parent;
            while (parent!=null&&parent.left!=root){
                parent = parent.parent;
            }
            return parent;
        }
    }

    public TreeNode getMostLeft(TreeNode node){
        while (node.left!=null){
            node = node.left;
        }
        return node;
    }

    //二叉搜索树的前驱节点
    public TreeNode getPreNode(TreeNode root){
        if (root==null){
            return null;
        }
        if (root.left!=null){
            return getMostRight(root.left);
        }else {
            TreeNode parent = root.parent;
            while (parent!=null&&parent.right!=root){
                parent = parent.parent;
            }
            return parent;
        }

    }

    public TreeNode getMostRight(TreeNode node){
        while (node.right!=null){
            node = node.right;
        }
        return node;
    }
}
