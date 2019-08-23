package test.wanmei;

import java.util.Arrays;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] s = str.split(" ");
        int limit = in.nextInt();
        int count = 0;


        int[] nums = new int[s.length];
        for(int i=0;i<nums.length;i++){
            nums[i] = Integer.valueOf(s[i]);
        }

        Arrays.sort(nums);
        if(nums[nums.length-1]>limit){
            System.out.println(0);
        }


        int first = 0;
        int end = nums.length-1;
        while (first<end){
            if(nums[first]+nums[end]<=limit){
                count++;
                first++;
                end--;
            }else {
                end--;
                count++;
            }
        }

        if (first==end){
            count++;
        }
        System.out.println(count);

    }
}
