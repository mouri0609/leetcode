package code.array.huawei;

import java.util.ArrayList;
import java.util.Scanner;

/*
最小公倍数
方法1：找到a,b两个数的最小公约数。
方法2：数学方法找到最大公约数。
 */

public class Mingbc {
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        long m = in.nextLong();
//        long n = in.nextLong();
//
//        ArrayList<Long> list = new ArrayList<>();
//        long min = Math.min(m,n);
//        long total = 1;
//        for(long i=2;i<=min;i++){
//            if(m%i==0&&n%i==0){
//                m = m/i;
//                n=n/i;
//                min = min/i;
//                list.add(i);
//                i=1;
//            }
//        }
//        if(list.size()==0){
//            System.out.println(m*n);
//            //return m*n;
//        }else{
//            for(int i=0;i<list.size();i++){
//                total*=list.get(i);
//            }
//            System.out.println(m*n*total);
//        }
//    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();

        System.out.println((m*n)/getlcd(m,n));
    }

    private static int getlcd(int a,int b){
        if (b==0){
            return a;
        }
        return getlcd(b,a%b);
    }
}
