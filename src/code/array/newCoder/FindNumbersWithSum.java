package code.array.newCoder;

import java.util.ArrayList;

/**
 * @Author: Agile——Mouri
 * @Date: 2019/8/5
 * @Title: 和为S的两个数字
 */
public class FindNumbersWithSum {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> list = new ArrayList<>();
        int low = 0;int high = array.length-1;

        while (low<high){
            int tempSum = array[low]+array[high];
            if (tempSum>sum){
                high--;
            }else if(tempSum<sum){
                low++;
            }else {
                list.add(array[low]);
                list.add(array[high]);
                break;
            }
        }
        return list;
    }
}
