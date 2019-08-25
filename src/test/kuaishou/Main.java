package test.kuaishou;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        in.nextLine();

        List<String> result = new ArrayList<>();
        for (int i=0;i<m;i++){
            String s = in.nextLine();
            String[] str = s.split(" ");

            String[] firstVersion = str[0].split("\\.");
            String[] secondVersion = str[1].split("\\.");

            int[] first = new int[4];
            int[] second = new int[4];

            for (int k=0;k<4;k++){
                if(k>=firstVersion.length){
                    first[k] = 0;
                }else {
                    first[k] = Integer.valueOf(firstVersion[k]);
                }

                if(k>=secondVersion.length){
                    second[k] = 0;
                }else {
                    second[k] = Integer.valueOf(secondVersion[k]);
                }
            }

            boolean flag = false;
            for (int j=0;j<4;j++){
                if(first[j]<second[j]){
                    flag = true;
                    break;
                }
            }
            if (flag){
                result.add("true");
            }else {
                result.add("false");
            }
        }
        for(int i=0;i<m;i++){
            if ("true".equals(result.get(i))){
                System.out.println("true");
            }else {
                System.out.println("false");
            }
        }
    }
}
