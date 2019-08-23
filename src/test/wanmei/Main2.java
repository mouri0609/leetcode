package test.wanmei;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] nums = new int[6][6];
        for (int i=0;i<6;i++){
            String s = in.nextLine();
            String[] strs = s.split(" ");
            for (int j=0;j<6;j++){
                nums[i][j] = Integer.parseInt(strs[i]);
            }
        }

        for (int k=0;k<6;k++){
            for(int i=0;i<6;i++){
                for(int j=0;j<6;j++){
                    if(i==j||i==k||j==k){
                        continue;
                    }
                    if(nums[i][k]!=-1&&nums[k][j]!=-1){
                        int total = nums[i][k]+nums[k][j];
                        if (total<nums[i][j]||nums[i][j]==0){
                            nums[i][j] = total;
                        }
                    }
                }
            }

        }
        for(int i=0;i<6;i++){
            int sum = 0;
            for (int j=0;j<6;j++){
                sum = sum+nums[i][j];
            }
            System.out.println(sum);
        }
    }
}
