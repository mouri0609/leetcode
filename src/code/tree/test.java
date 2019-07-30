package code.tree;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Mouri on 2018/11/28 10:32
 */
public class test {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    public boolean isValidBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inOrder(root,list);
        for (int i=0;i<list.size()-1;i++){
            if (list.get(i)>=list.get(i+1)){
                return false;
            }
        }
        return true;

    }

    public void inOrder(TreeNode node,List<Integer> list){
        if (node==null){
            return;
        }
        inOrder(node.left,list);
        list.add(node.val);
        inOrder(node.right,list);
    }




}
