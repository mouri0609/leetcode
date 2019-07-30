package code.tree;

import java.util.*;

public class PrintTreeByLevel {
    public ArrayList<Integer> PrintFromTopToBottom(BFS.TreeNode root) {
        ArrayList<Integer> array = new ArrayList<>();
        Queue<BFS.TreeNode> queue = new LinkedList<>();

        queue.add(root);
        while(!queue.isEmpty()){
            int n = queue.size();
            while (n-->0){
                BFS.TreeNode t = queue.poll();
                if (t==null){
                    continue;
                }
                array.add(root.val);
                queue.add(root.left);
                queue.add(root.left);
            }

        }

        return array;
    }
}
