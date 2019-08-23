package code.dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int target = in.nextInt();
        int[] num = new int[n];

        for (int i=0;i<n;i++){
            num[i] = in.nextInt();
        }

//        int[] num = {-1,0,1,2,-1,-4};
        Arrays.sort(num);
        List<List<Integer>> result = new ArrayList<>();

        for (int i=0;i<num.length-2;i++){
            if (i==0||(i>0&&num[i]!=num[i-1])){
                int l=i+1;int r=num.length-1;int sum = target-num[i];
                while (l<r){
                    if(num[l]+num[r]==sum){
                        result.add(Arrays.asList(num[i],num[l],num[r]));
                        while (l<r&&num[l]==num[l+1]) l++;
                        while (l<r&&num[r]==num[r-1]) r--;
                        l++;
                        r--;
                    }else  if (num[l]+num[r]<sum){
                        while (l<r&&num[l]==num[l-1]) l++;
                        l++;
                    }else {
                        while (l<r&&num[r]==num[r-1]) r--;
                        r--;
                    }
                }
            }
        }
        if (result.size()==0){
            System.out.println("-1 -1 -1");
        }else {
            for (int i=0;i<result.size();i++){
                int a = result.get(i).get(0);
                int b = result.get(i).get(1);
                int c = result.get(i).get(2);
                System.out.println(a+" "+b+" "+c);
            }
        }
    }
}
