package test.WangYi;

import java.util.Scanner;

public class Rank {

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
