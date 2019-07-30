package code.sort.basic;

import java.util.Arrays;

/**
 * Created by Mouri on 2018/11/21 16:51
 */
public class ShellSort {

    public  void shellSort(int[] data) {
        int j = 0;
        int temp = 0;

        for (int increment = data.length / 2; increment > 0; increment /= 2) {

            for (int i = increment; i < data.length; i++) {
                temp = data[i];
                for (j = i; j >= increment; j -= increment) {
                    if (temp < data[j - increment])
                    {
                        data[j] = data[j - increment];
                    } else {
                        break;
                    }

                }
                data[j] = temp;
            }

        }
    }
    public static void main(String[] args) {
        ShellSort shellSort = new ShellSort();
        int[] list = {1,2,4,3,5,0,9,8};
        shellSort.shellSort(list);
        System.out.println(Arrays.toString(list));
    }
}
