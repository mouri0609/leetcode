package code.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//leetcode 102
public class BFS {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        TreeNode temp;
        if (root == null){
            return new ArrayList<>();
        }
        List<List<Integer>> lists = new ArrayList<>();
        Queue<TreeNode> treeNodeQueue = new LinkedList<>();
        treeNodeQueue.offer(root);

        while (!treeNodeQueue.isEmpty()){
            int count = treeNodeQueue.size();
            List<Integer> list = new ArrayList<>();
            while (count>0){
                temp = treeNodeQueue.poll();
                list.add(temp.val);
                if (temp.left!=null){
                    treeNodeQueue.offer(temp.left);
                }
                if (temp.right!=null){
                    treeNodeQueue.offer(temp.right);
                }
                count--;
            }
            lists.add(list);
        }
        return lists;
    }
}
