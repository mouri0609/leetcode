package code.sort.basic;

import java.util.Arrays;

/**
 * Created by Mouri on 2018/11/21 15:42
 */
public class InsertSort {
    public void insert(int[] a,int n){
        if (n<=1){
            return;
        }
        for (int i=1;i<n;i++){
            int value = a[i];
            int j = i-1;
            for (;j>=0;j--){
                if (a[j]>value){
                    a[j+1] = a[j];
                }else {
                    break;
                }
            }
            a[j+1] = value;
        }
    }

    public static void main(String[] args) {
        InsertSort insert = new InsertSort();

        int[] test = {2,4,3,1,7,5};
        insert.insert(test,6);
        System.out.println(Arrays.toString(test));
    }




}
