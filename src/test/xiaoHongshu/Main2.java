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

        int count = 1;
        int[] dp = new int[n];
        dp[0] = votes[0];
        dp[1] = Math.max(votes[1],dp[0]);

        if (dp[0]==0&&dp[1]==0){
            count = 0;
        }

        for (int i=2;i<n;i++){
            dp[i] = Math.max(dp[i-1],dp[i-2]+votes[i]);
            if (dp[i] !=dp[i-1]){
                count++;
            }
        }
        int total = dp[n-1];
        System.out.println(total+" "+count);
    }
}
// 5    0 0 0 1 0
//        1 2 3 1 3