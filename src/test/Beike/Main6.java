package test.Beike;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        in.nextLine();

        int[] nums = new int[n];
        int[] vol = new int[n];
        int index = 0;
        for (int i=0;i<n;i++){
            nums[index] = in.nextInt();
            vol[index] = in.nextInt();
            index++;
        }

        System.out.println(getTimes(nums,vol,m));
    }

    private static int getTimes(int[] nums,int[] vol,int m){
        int count = 0;

        for (int i=0;i<nums.length;i++){
            while (m>0&&nums[i]>0&&m>=vol[i]){
                m-=vol[i];
                nums[i]--;
                count++;
            }
            if (m<0){
                break;
            }
        }
        return count;
    }
}
