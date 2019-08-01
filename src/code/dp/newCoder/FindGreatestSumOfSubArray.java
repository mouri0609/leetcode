package code.dp.newCoder;

/**
 * @Author: Agile——Mouri
 * @Date: 2019/8/1
 * @Title: 牛客连续子数组最大和
 */
public class FindGreatestSumOfSubArray {
    public int findGreatestSumOfSubArray(int[] array) {
        int[] dp = new int[array.length];
        if(array.length==1){
            return array[0];
        }
        dp[0] = array[0];
        int max = Integer.MIN_VALUE;
        for(int i=1;i<array.length;i++){
            dp[i] = Math.max(dp[i-1]+array[i],array[i]);
            if (dp[i]>max){
                max = dp[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        FindGreatestSumOfSubArray test = new FindGreatestSumOfSubArray();
        int[] a = {1,-2,3,10,-4,7,2,-5};
        int b = test.findGreatestSumOfSubArray(a);
        System.out.println(b);
    }
}
