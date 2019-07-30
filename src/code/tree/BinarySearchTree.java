package code.tree;

/**
 * Created by Mouri on 2018/11/27 17:21
 */

public class BinarySearchTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }
    //����������ݹ����
    public TreeNode searchTraversal(TreeNode root, int num) {
        if (root==null) {
            return null;
        }

        if (root.val==num) {
            return root;
        }
        else {
            if (root.val<num) {
                return searchTraversal(root.right,num);
            }
            if (root.val>num) {
                return searchTraversal(root.left,num);
            }
        }
        return null;
    }
    //����������ǵݹ����
    public TreeNode searchDistraversal(TreeNode root, int num) {
        while (root!=null){
            if (root.val==num){
                return root;
            }else if (root.val>num){
                root = root.left;
            }else {
                root = root.right;
            }
        }
        return null;
    }


    //����������ݹ����
    public void insertDistraversal(TreeNode root, int num){
        if (root==null){
            root = new TreeNode(num);
            return;
        }
        if (root.val>num) {
            insertDistraversal(root.left,num);
        }else {
            insertDistraversal(root.right,num);
        }
        return;
    }

    //����������ǵݹ����
    public void insertTraversal(TreeNode root, int num){
        if (root==null){
            return;
        }
        while (root!=null) {
            if (root.val>num){
                if (root.left==null){
                    root.left =  new TreeNode(num);
                    return;
                }
                root = root.left;
            }else {
                if (root.right==null){
                    root.right = new TreeNode(num);
                    return;
                }
                root = root.right;
            }
        }
    }

    //����������ݹ�ɾ��
    public TreeNode deleteNode(TreeNode root, int key){
        if(root==null){
            return null;
        }

        if(root.val==key){
             if(root.left==null){
                return root.right;
            }else if(root.right==null){
                return root.left;
            }else{
                TreeNode p = root.right;
                while(p.left!=null){
                    p = p.left;
                }
                root.val = p.val;

                root.right = deleteNode(root.right,root.val);
            }
            return root;
        }else if (key<root.val){
            root.left = deleteNode(root.left,key);
        }else if(key>root.val) {
            root.right = deleteNode(root.right,key);
        }
        return root;
    }

}
