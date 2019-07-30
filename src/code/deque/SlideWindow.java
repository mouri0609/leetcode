package code.deque;

import java.util.ArrayList;

/**
 * Created by Mouri on 2019/2/21 16:34
 */
public class SlideWindow {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int length = nums.length;
        int max = Integer.MIN_VALUE;
        int localtion = -1;

        if(nums.length==0)  return new int[]{};

        int[] result = new int[length-k+1];

        for(int i=0;i<k;i++){
            if(nums[i]>=max){
                max = nums[i];
                localtion = i;
            }
        }
        result[0] = max;

        for (int i = k;i<length;i++){
            if (i-localtion==k){
                max = nums[localtion+1];
                for(int j = i-k+1;j<i+1;j++){

                    if(nums[j]>=max){
                        max = nums[j];
                        localtion = j;
                    }
                }
            }else {
                if(max<=nums[i]){
                    max = nums[i];
                    localtion = i;
                }
            }
            result[i-k+1] = max;
        }
            return result;
    }

    public static void main(String[] args) {
        SlideWindow slideWindow = new SlideWindow();
        int[] a = {1,3,1,2,0,5};
        slideWindow.maxSlidingWindow(a,3);
        for(int i =0;i<slideWindow.maxSlidingWindow(a,3).length;i++){
            System.out.println(slideWindow.maxSlidingWindow(a,3)[i]);
        }
    }
}
