package test.xiaoHongshu;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] votes = new int[n];
        for (int i=0;i<n;i++){
            votes[i] = in.nextInt();
        }

        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = votes[0];

        int[] result = new int[n+1];
        result[0] = 0;
        result[1] = 1;
        for (int i=2;i<=n;i++){
            dp[i] = Math.max(dp[i-1],dp[i-2]+votes[i-1]);
            if (dp[i]==dp[i-1]){
                result[i] = result[i-1];
            }else {
                result[i] = result[i-2]+1;
            }
        }
        int total = dp[n];
        System.out.println(total+" "+result[n]);
    }
}