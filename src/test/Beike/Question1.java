package test.Beike;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        //数据输入
        int n = in.nextInt();
        long[] nums = new long[n];
        for (int i=0;i<nums.length;i++){
            nums[i] = in.nextLong();
        }

        //代码
        long min = Long.MAX_VALUE;
        int index = -1;
        for (int i=0;i<nums.length-1;i++){
            long temp = Math.abs(nums[i]-nums[i+1]);
            if (temp<min){
                min = temp;
                index = i;
            }
        }

        System.out.println(nums[index]+" "+ nums[index+1]);
    }
}
