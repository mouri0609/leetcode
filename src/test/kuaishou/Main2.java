package test.kuaishou;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        in.nextLine();

        List<String> result = new ArrayList<>();
        for (int i=0;i<m;i++) {
            if (isOne(in.nextInt())){
                result.add("true");
            }else {
                result.add("false");
            }
        }

        for(int i=0;i<result.size();i++){
            System.out.println(result.get(i));
        }
    }

    public static boolean isOne(int n){
        int result = n;
        int sum = 0;
        boolean isFirst = true;

        List<Integer> temp = new ArrayList<>();
        while (result!=1&&!temp.contains(result)){
            temp.add(result);
            if (!isFirst){
                n = sum;
            }
            while (n!=0){
                sum = 0;
                int yu = n%10;
                sum+=yu*yu;
                n = n/10;
                isFirst = false;
            }
            result = sum;
        }
        if (result==1){
            return true;
        }
        return false;
    }
}
