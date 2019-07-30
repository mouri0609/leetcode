package code.sort.basic;

import java.util.Arrays;

/**
 * Created by Mouri on 2018/11/21 13:47
 */
public class bubbleSort {

    public static void main(String[] args) {

        int[] test = {2,4,3,7,1};
        bubbleSort bubble = new bubbleSort();
        bubble.bubbleSort(test,5);
        System.out.println(Arrays.toString(test));
    }


    public void bubbleSort(int[] a,int n){
        //特殊情况判断
        if (n<=1){
            return;
        }
        for (int i=0;i<n;i++){
            // 提前退出冒泡循环的标志位
            boolean flag = false;
            for (int j=0;j<n-i-1;++j){
                if (a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag = true;
                }
            }
            //如果没有数据交换进行重排序，则说明数据有序，提前退出
            if (!flag){
                break;
            }
        }
    }
}
