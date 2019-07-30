package code.sort.basic;

import java.util.Arrays;

/**
 * Created by Mouri on 2018/11/21 14:54
 */
public class ChooseSort {
//    public void chooseSort(int[] nums) {
//        int temp;
//        int min;
//        int location;
//        for(int i=0;i<nums.length-1;i++){
//            min = nums[i];
//            location = i;
//            for (int j = i;j<nums.length;j++){
//                if(nums[j]<min){
//                    min = nums[j];
//                    location = j;
//                }
//            }
//            if(location!=i){
//               temp = nums[location];
//               nums[location] = nums[i];
//               nums[i] = temp;
//            }
//        }
//    }
    public static void main(String[] args) {
        int[] test = {2,4,3,7,1};
        ChooseSort choose = new ChooseSort();
        choose.chooseSort(test,5);
        System.out.println(Arrays.toString(test));
    }
    public void chooseSort(int[] a,int n){
        int location;
        int min;

        for (int i=0;i<n-1;i++){
            location = i;
            min = a[i];

            for (int j = i+1;j<n;j++){
                if (a[j]<min){
                    min = a[j];
                    location = j;
                }
            }
            if (location!=i){
                int temp = a[location];
                 a[location] = a[i];
                 a[i] = temp;
            }
        }
    }
}
