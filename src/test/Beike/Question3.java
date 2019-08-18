package test.Beike;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Question3 {
    public static int count = 0;
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);

        //接收数据
        int n = in.nextInt();
        int[] weight = new int[n];

        for (int i=0;i<weight.length;i++){
            weight[i] = in.nextInt();
        }

        subTwo(weight);
        System.out.println(count);

    }

    private static int subTwo(int[] nums){
        List<Integer> list = new ArrayList<>();
        boolean[] visited =new boolean[nums.length];
        subTwoInternally(list,nums,visited,0);
        return count;
    }

    private static void  subTwoInternally(List<Integer> list, int[] nums,boolean[] visited,int pos){
        if (list.size()==2){
            if (isRight(list.get(0),list.get(1))){
                count++;
            }
            return;
        }

        for (int i=pos;i<nums.length;i++){
            if (!visited[i]){
                list.add(nums[i]);
                visited[i] = true;
                subTwoInternally(list,nums,visited,i+1);
                list.remove(list.size()-1);
                visited[i] = false;
            }

        }
    }


    private static boolean isRight(int a,int b){
        double max = Math.max(a,b);
        double sub = (Math.abs(a-b)/max)*100;
        if (sub<=10){
            return true;
        }else {
            return false;
        }
    }

}
