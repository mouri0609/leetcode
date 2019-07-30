package code.dp.dfs;

import java.util.Collection;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: Agile¡ª¡ªMouri
 * @Date: 2019/6/7
 */
public class DivisorGame {
    public boolean divisorGame(int N) {
        boolean[] dp = new boolean[N+1];
        if(N<2){
            return false;
        }

        dp[0] = false;
        dp[1] = false;

        for(int i=2;i<=N;i++){
            for(int j=1;j<i;j++){
                if(!dp[i-1]&&i%j==0){
                    dp[i] = true;
                    break;
                }
            }
        }
//        Collection
//        ConcurrentHashMap
        System.out.println(dp[N]);
        return dp[N];

    }
}
