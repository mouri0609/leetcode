package code.tree.newCoder;

import code.LinkedList.Node.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Author: Agile——Mouri
 * @Date: 2019/7/31
 * @Title: 二叉树中和为某一值的路径
 */
public class FindPath {
    ArrayList<ArrayList<Integer>> result = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {

        if (root==null){
            return result;
        }
        ArrayList<Integer> list = new ArrayList<>();
        find(list,root,target);
        return result;
    }

    private void find(ArrayList<Integer> list,TreeNode root,int target){
        if (root==null){
            return;
        }

        list.add(root.val);
        target -= root.val;

        if (target==0&&root.left==null&&root.right==null){
            result.add(new ArrayList<>(list));
        }else {
            find(list, root.left, target);
            find(list, root.right, target);
        }
        list.remove(list.size()-1);
    }
}
