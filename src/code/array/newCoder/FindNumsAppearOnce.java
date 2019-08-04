package code.array.newCoder;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Author: Agile——Mouri
 * @Date: 2019/8/4
 * @Title: 数组中只出现一次的数字
 */
public class FindNumsAppearOnce {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(array);
        for (int i=0;i<array.length-1;i++){
            if (array[i]==array[i+1]){
                i++;
            }else {
                list.add(array[i]);
            }
        }
        if (list.size()==1){
            list.add(array[array.length-1]);
        }
        num1[0] = list.get(0);
        num2[0] = list.get(1);
    }
}
