package test.ZTE;

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        //记录行列最大值
        int[] cMax = new int[M];
        int[] rowMax = new int[N];

        int[][] result = new int[N][M];
        for(int i=0;i<N;i++){
            int max = Integer.MIN_VALUE;
            for(int j=0;j<M;j++){
                result[i][j] = in.nextInt();
                if(result[i][j]>max){
                    max = result[i][j];
                }
            }
            rowMax[i] = max;
        }

        for(int j=0;j<M;j++){
            int max = Integer.MIN_VALUE;
            for(int i=0;i<N;i++){
                if(result[i][j]>max){
                    max = result[i][j];
                }
            }
            cMax[j] = max;
        }
        //底面积
        int sum = (M*N)*2;

        for(int i=0;i<N;i++){
            sum +=2*rowMax[i];
        }

        for(int i=0;i<M;i++){
            sum +=2*cMax[i];
        }
        System.out.println(sum);


//        Scanner in = new Scanner(System.in);
//        int N = in.nextInt();
//        int M = in.nextInt();
//
//        int[] nums1 = new int[N];
//        int[] nums2 = new int[N];
//        for (int i=0;i<N;i++){
//            nums1[i] = in.nextInt();
//        }
//
//        for (int i=0;i<N;i++){
//            nums2[i] = in.nextInt();
//        }



    }
}