package code;

import code.LinkedList.Node.TreeNode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @Author: Agile¡ª¡ªMouri
 * @Date: 2019/7/30
 */
public class Test {
    public int TreeDepth(TreeNode root) {

        if (root==null){
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int count =0;
        int size = 1;
        int depth = 0;
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            count++;
            if (node.left!=null){
                queue.offer(node.left);
            }
            if (node.right!=null){
                queue.offer(node.right);
            }
            if (count==size){
                depth++;
                count = 0;
                size = queue.size();
            }
        }
        return depth;
    }
}


