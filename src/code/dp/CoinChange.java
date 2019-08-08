package code.dp;

import java.util.Collections;
import java.util.Map;

/**
 * @Author: Agile¡ª¡ªMouri
 * @Date: 2019/8/4
 */
public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        dp[0] = 0;

        for (int i=1;i<=amount;i++){
            for (int j=0;j<coins.length;j++){
                if (i>=coins[j]){
                    dp[i] = Math.min(dp[i],dp[i-coins[j]]+1);
                }
            }
        }
        return dp[amount];
    }

    public static void main(String[] args) {
        int[] a = {1,2,5};
        CoinChange test = new CoinChange();
        int b = test.coinChange(a,11);
        System.out.println(b);

    }
}
