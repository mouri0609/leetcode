package code.array.newCoder;

import java.util.ArrayList;

/**
 * @Author: Agile——Mouri
 * @Date: 2019/8/5
 * @Title: 和为S的连续正数序列
 */
public class SubSumArrays {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int left = 1;
        int right = 2;
        if(sum<3){
            return result;
        }

        while (left<right){
            int tempSum = (left+right)*(right-left+1)/2;
            if (tempSum<sum){
                right++;
            }
            if (tempSum>sum){
                left++;
            }
            if (tempSum==sum){
                ArrayList<Integer> list = new ArrayList<>();
                for (int i=left;i<=right;i++){
                    list.add(i);
                }
                result.add(list);
                left++;
            }
        }
        return result;
    }
}
