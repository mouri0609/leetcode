package test.DJ;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, T;
        int[] costs, satis, counts;
        while (sc.hasNext()) {
            N = sc.nextInt();
            T = sc.nextInt();
            costs = new int[N];
            satis = new int[N];
            counts = new int[N];
            for (int i = 0; i < N; i++) {
                costs[i] = sc.nextInt();
                satis[i] = sc.nextInt();
                counts[i] = sc.nextInt();
            }

            int[][] dp = new int[N+1][T+1];

            // dp[i][t] = max{dp[i-1][t], dp[i-1][t-k*costs[i-1]]+k*satis[i-1]}
            for (int i = 1; i <= N; i++) {
                for (int t = T; t >= 0; t--) {
                    int max = 0;
                    for (int k = 0; k <= counts[i-1] && t-k*costs[i-1] >= 0; k++) {
                        max = Math.max(max, dp[i-1][t-k*costs[i-1]] + k*satis[i-1]);
                    }
                    dp[i][t] = max;
                }
            }

            System.out.println(dp[N][T]);
        }
    }
}
