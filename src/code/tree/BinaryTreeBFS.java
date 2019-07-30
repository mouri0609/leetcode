package code.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//二叉查找树按层遍历
public class BinaryTreeBFS {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

    public void BinaryTreeBFS(TreeNode root){

        TreeNode temp;
        if (root == null){
            return;
        }
        Queue<TreeNode> treeNodeQueue = new LinkedList<>();
        treeNodeQueue.offer(root);

        while (!treeNodeQueue.isEmpty()){
            temp = treeNodeQueue.poll();
            if (temp.left!=null){
                treeNodeQueue.offer(temp.left);
            }
            if (temp.right!=null){
                treeNodeQueue.offer(temp.right);
            }
        }
    }
}
