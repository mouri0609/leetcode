package code.tree;

/**
 * Created by Mouri on 2019/2/28 20:26
 */
public class TreeTraversal {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static void preOrderRecursive(TreeNode head){
        if (head==null){
            return;
        }
        System.out.println(head.val+" ");
        preOrderRecursive(head.left);
        preOrderRecursive(head.right);
    }

    public static void lastOrderRecursive(TreeNode head){
        if (head==null){
            return;
        }
        lastOrderRecursive(head.left);
        lastOrderRecursive(head.right);
        System.out.println(head.val+" ");
    }

    public static void inOrderRecursive(TreeNode head){
        if (head==null){
            return;
        }
        inOrderRecursive(head.left);
        System.out.println(head.val+" ");
        inOrderRecursive(head.right);
    }


}
