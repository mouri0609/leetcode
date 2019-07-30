package code.search;

import java.util.Scanner;

/**
 * @Author: Agile¡ª¡ªMouri
 * @Date: 2019/6/16
 */
public class Test {
    public int findTargetSumWays(int[] nums, int S) {
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
        }

        if((sum+S)%2!=0){return 0;}

        sum = (sum+S)/2;

        int[] dp = new int[sum+1];
        dp[0] = 1;
        if(nums[0]<sum){
            dp[nums[0]]=1;
        }
        for(int i=0;i<nums.length;i++){
            for(int j=sum-nums[i];j>=0;j--){
                if(dp[j]!=0){
                    dp[j+nums[i]] = dp[j];
                }
            }
        }
        for (int i=sum;i>=0;i--){
            if (dp[i]!=0){
                System.out.println(dp[i]);
                sum = dp[i];
//                break;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(-1%4);

    }

}
