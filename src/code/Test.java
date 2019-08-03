package code;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: Agile¡ª¡ªMouri
 * @Date: 2019/7/30
 */
public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] scores = new int[n];
        for (int i=0;i<n;i++){
            scores[i] = scan.nextInt();
        }

        int times = scan.nextInt();
        int[] nums = new int[times];
        for (int i=0;i<times;i++){
            nums[i] = scan.nextInt();
        }
        rank(n,scores,nums);

    }
    private static void rank(int n,int[] score,int[] nums){
        double p;
        for (int i=0;i<nums.length;i++){
            p=(double)(realRank(score[nums[i]-1],score)-1)/n;
            System.out.printf("%.6f\n",p*100);
        }
    }
    private static int realRank(int curScore, int[] score){
        int cnt = 0;
        for (int i=0;i<score.length;i++){
            if (score[i]<=curScore){
                cnt++;
            }
        }
        return cnt;
    }
}



import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i=0;i<t;i++){
            int n = scan.nextInt();
            int[] nums = new int[n];
            for(int j=0;j<n;++j){
                nums[j] = scan.nextInt();
            }
            solution(nums);
        }
        scan.close();
    }

    private static void solution(int[] nums){
        if(nums==null||nums.length<3){
            System.out.println("NO");
            return;
        }
        Arrays.sort(nums);
        int len = nums.length;
        for(int i=1;i<len-1;++i){
            if(nums[i-1]+nums[i+1]<nums[i]){
                System.out.println("NO");
                return;
            }
        }
        if(nums[0]<nums[1]+nums[len-1]&&nums[len-1]<nums[len-1]+nums[1]){
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }
}
