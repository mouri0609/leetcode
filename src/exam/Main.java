package exam;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
//    char[] chars = s.toCharArray();

    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        int m = scan.nextInt();
//
//        int[][] dp = new int[m+1][n+1];
//        dp[0][1] = 1;
//
//        for (int i=1;i<=m;i++){
//           for(int j=1;j<=n;j++){
//               if(j==1){
//                   dp[i][j] = dp[i-1][n]%1000000007+dp[i-1][j+1]%1000000007;
//               }else if (j==n){
//                   dp[i][j] = dp[i-1][j-1]%1000000007+dp[i-1][1]%1000000007;
//               }else {
//                   dp[i][j] = (dp[i-1][j-1])%1000000007+(dp[i-1][j+1])%1000000007;
//               }
//           }
//        }
//        System.out.println(dp[m][1]);
       Object o = new Object();
       Object c = new Object();
       c = o;

        System.out.println(o==c);
    }
}
