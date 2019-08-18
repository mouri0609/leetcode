package test.xiaoHongshu;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int T = in.nextInt();
        int M = in.nextInt();
        int[] blood = new int[N];
        for (int i=0;i<N;i++){
            blood[i] = in.nextInt();

        }

        if (N>=T){
            System.out.println(-1);
        }

    }
}
