package code.dp.leetcode;

/**
 * @Author: Agile¡ª¡ªMouri
 * @Date: 2019/8/6
 */
public class IsInterleave {
    public boolean isInterleave(String s1, String s2, String s3) {
        int len1 = s1.length();
        int len2 = s2.length();

        if ((len1+len2)!=s3.length()){
            return false;
        }
        boolean[][] dp = new boolean[len1+1][len2+1];
        dp[0][0] = true;
        for (int i=0;i<=len1;i++){
            for (int j=0;j<=len2;j++){
                if (i==0&&j==0){
                    dp[i][j] = true;
                }else if (j==0){
                    dp[i][j] = dp[i-1][j]&&s1.charAt(i-1)==s3.charAt(i-1);
                }else if (i==0){
                    dp[i][j] = dp[i][j-1]&&s2.charAt(j-1)==s3.charAt(j-1);
                }else {
                    dp[i][j] = (dp[i-1][j]&&s1.charAt(i-1)==s3.charAt(i+j-1))||(dp[i][j-1]&&s2.charAt(j-1)==s3.charAt(i+j-1));
                }
            }
        }

        return dp[len1][len2];
    }
}
