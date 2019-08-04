package code.deque;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @Author: Agile——Mouri
 * @Date: 2019/8/4
 * @Title: 最小的K个数
 */
public class GetLeastNumbers {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] data, int k) {
        Queue<Integer> maxQueue = new PriorityQueue<Integer>(((o1, o2) -> o2-o1));
        ArrayList<Integer> list = new ArrayList<>();
        if (data.length<k||k==0){
            return list;
        }

        for (int i=0;i<data.length;i++){
            if (i<k){
                maxQueue.offer(data[i]);
            }else {
                if (data[i]<maxQueue.peek()){
                    maxQueue.poll();
                    maxQueue.offer(data[i]);
                }
            }
        }
        for (int i=0;i<k;i++){
            list.add(maxQueue.poll());
        }
        return list;
    }

    public static void main(String[] args) {
        int[] a = {4,3,5,6,2,8,1,0,9};
        GetLeastNumbers test = new GetLeastNumbers();
        ArrayList<Integer> list = test.GetLeastNumbers_Solution(a,5);
        System.out.println(list);
    }
}
