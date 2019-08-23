package test.Beike;

import java.util.Arrays;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s = in.nextInt();
        in.nextLine();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = in.nextInt();
        }

        Arrays.sort(nums);
        int result =0;
        for (int i=0;i<nums.length;i++){
            if(s>0){
                s = s-nums[i];
                result++;
            }else {break;}
        }
        System.out.println(result);
    }
}
