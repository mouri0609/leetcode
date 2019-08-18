package test.Beike;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        //接收数据
        int n = in.nextInt();
        int[] nums = new int[n];

        for (int i=0;i<nums.length;i++){
            nums[i] = in.nextInt();
        }
        //动态规划
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int maxResult =1;

        for (int i=1;i<dp.length;i++){
            int temp = 0;
            for (int j=0;j<i;j++){
                if (nums[i]>nums[j]){
                    temp = Math.max(temp,dp[j]);
                }
            }
            dp[i] = temp+1;
            maxResult = Math.max(maxResult,dp[i]);

        }
        System.out.println(maxResult);
    }
}

//8
//5
//1
//6
//8
//2
//4
//5
//10