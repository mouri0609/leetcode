package code.heap;

import java.util.*;

/**
 * @Author: Agile¡ª¡ªMouri
 * @Date: 2019/8/6
 */
public class maxInWindows {
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> list = new ArrayList<>();
        if (num==null||size<0||size>num.length){
            return list;
        }

        Deque<Integer> queue = new ArrayDeque<>();

        for (int i=0;i<num.length;i++){
            int left = i-size+ 1;
            if (queue.isEmpty()){
                queue.offerLast(i);
            }else if(left>queue.peekFirst()){
                queue.pollFirst();
            }

            while (!queue.isEmpty()&&num[queue.peekLast()]<=num[i]){
                queue.pollLast();
            }
            queue.offerLast(i);

            if (left>=0){
                System.out.println(num[queue.peekFirst()]);
                list.add(num[queue.peekFirst()]);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] a = {1,4,2,3,0,5,-1};
        maxInWindows test = new maxInWindows();
        test.maxInWindows(a,3);
    }
}
