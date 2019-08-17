package test.KeDaXunfei;

import java.util.Scanner;

public class Main1 {
    public static int binarySearch(int[] nums, int target,int low,int high){
        int mid = low+(high-low)/2;
        if (low>high) return -1;
        if (target==nums[mid]) return mid;
        else if (target>nums[mid]){
            return binarySearch(nums,target,mid+1,high);
        }else {
            return binarySearch(nums,target,low,mid-1);
        }
    }

    public static void main(String[] args) {
        String s = "{11,13,15,17,19,21}";
        int target = 19;
        String[] strs = s.substring(1,s.length()-1).split(",");

        int[] nums = new int[strs.length];
        for (int i=0;i<strs.length;i++){
            nums[i] = Integer.valueOf(strs[i]);
        }
        System.out.println(binarySearch(nums,target,0,nums.length-1)+1);
    }
}
