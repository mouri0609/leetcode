package code.dp.newCoder;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Agile¡ª¡ªMouri
 * @Date: 2019/8/1
 */
public class MaxLengthSumOfSubArrayZero {
//    public int getLength(int[] array){
//        int length = array.length;
//
//        int maxLength = 0;
//        for (int i=0;i<length-1;i++){
//            int sum = array[i];
//            for (int j=i+1;j<length;j++){
//                sum += array[j];
//                if (sum ==0){
//                    if (j-i>maxLength){
//                        maxLength = j-i+1;
//                    }
//                }
//            }
//        }
//        return maxLength;
//    }


    public int getLength(int[] array){
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int maxLength = 0;
        int sum = 0;
        hashMap.put(0,-1);
        for (int i=0;i<array.length;i++){
            sum+=array[i];
            if (hashMap.containsKey(sum)){
                int index = hashMap.get(sum);
                if(maxLength<i-index){
                    maxLength = i-index;
                }
            }else {
                hashMap.put(sum,i);
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
//        int[] a = {1,-1};
//        MaxLengthSumOfSubArrayZero test = new MaxLengthSumOfSubArrayZero();
//        int b = test.getLength(a);
//        System.out.println(b);


        int[] a = {-3,-4,5,1,1,6,-8};
//        int[] a = {4,1,-1,3,-3,5};
        MaxLengthSumOfSubArrayZero test = new MaxLengthSumOfSubArrayZero();
        System.out.println(test.getLength(a));
    }
}
