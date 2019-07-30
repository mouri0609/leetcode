package code.dp;

import java.util.HashMap;

public class LengthOfLIS {

    public int lengthOfLIS(int[] nums) {
        /**
         dp[i]: ���г���Ϊi+1�ĵ�����������, ��С���Ǹ�����β��.
         �ɶ���֪dp�����Ȼ��һ����������, ������ maxL ����ʾ����������еĳ���.
         ��������е���, �����ж�ÿ����num�������dp������Ӧ��λ��:
         1. num > dp[maxL], ��ʾnum��������֪�������е�β������, ��num�����dp
         ����β��, ������������г���maxL��1
         2. dp[i-1] < num <= dp[i], ֻ������Ӧ��dp[i]
         **/

        HashMap map = new HashMap();
        int maxL = 0;
        int[] dp = new int[nums.length];
        for(int num : nums) {
            // ���ַ�����, Ҳ���Ե��ÿ⺯����binary_search
            int lo = 0, hi = maxL;
            while(lo < hi) {
                int mid = lo+(hi-lo)/2;
                if(dp[mid] < num)
                    lo = mid+1;
                else
                    hi = mid;
            }
            dp[lo] = num;
            if(lo == maxL)
                maxL++;
        }
        return maxL;
    }

    public static void main(String[] args) {
        LengthOfLIS lengthOfLIS = new LengthOfLIS();
        int[] array = {2,9,3,6,5,1,7};
        lengthOfLIS.lengthOfLIS(array);
    }
}
