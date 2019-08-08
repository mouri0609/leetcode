package code.array.leetcode;

import java.util.Map;

/**
 * @Author: Agile¡ª¡ªMouri
 * @Date: 2019/8/5
 */
public class MaxArea {
    public int maxArea(int[] height) {
        int left = 0;int right = height.length-1;
        int area = 0;
        while (left<right){
            int temp = Math.min(height[left],height[right])*(right-left);

            area = Math.max(area,temp);

            if (height[left]<height[right]){
                left++;
            }else {
                right--;
            }
        }
//        System.out.println(area);
        return area;
    }

    public static void main(String[] args) {
        MaxArea test = new MaxArea();
        int[] a = {1,8,6,2,5,4,8,3,7};
        test.maxArea(a);
    }
}
