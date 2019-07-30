package code.dp;

/**
 * @Author: Agilephotonics
 * @Date: 2019/6/6
 */
public class Rob {
    public int rob(int[] nums){
        int n = nums.length;
        if(n==0){
            return 0;
        }
        if(n==1){
            return nums[0];
        }

        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[1],dp[0]);
        for(int i=2;i<n;i++){
            dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i]);
            System.out.println(dp[i]);
        }
        return dp[n-1];
    }
}
