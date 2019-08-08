package test.QuShi;

import java.util.Scanner;

public class BigSum {
    private static String addParttern(String num1, String num2)
    {
        char[] num1s = num1.toCharArray();
        char[] num2s = num2.toCharArray();

        int len1 = num1s.length-1;
        int len2 = num2s.length-1;

        StringBuffer stringBuffer = new StringBuffer();
        int count=0;
        while (len1>=0||len2>=0){
            int temp= 0;
            if (len1 < 0) {
                temp = num2s[len2--]+count-'0';
            }
            if (len2<0){
                temp = num1s[len1--]+count-'0';
            }
            if (len1>=0&&len2>=0){
                temp = num1s[len1--]+num2s[len2--]+count-2*'0';
            }
            if (temp>9){
                count=1;
                temp-=10;
            }else {
                count=0;
            }
            stringBuffer.append(temp);
            if (len1<0&&len2<0&&count==1){
                stringBuffer.append(count);
            }
        }

        return stringBuffer.reverse().toString();
    }

    private static String add(String num1, String num2)
    {
        int point1Index= num1.indexOf(".");
        int point2Index = num2.indexOf(".");


        String s = new String();
        if (point1Index==-1&&point2Index==-1){
            return addParttern(num1,num2);
        }
        if (point1Index!=-1&&point2Index!=-1) {
            String s1 = addParttern(num1.substring(0,point1Index),num2.substring(0,point2Index));
            String s2 = addParttern(num1.substring(point1Index+1),num2.substring(point2Index+1));
            s = s1+"."+s2;
        }
        if (point1Index!=-1&&point2Index==-1) {
            String s1 = addParttern(num1.substring(0,point1Index),num2);
            String s2 = num1.substring(point1Index+1);
            s = s1+"."+s2;
        }
        if (point1Index==-1&&point2Index!=-1) {
            String s1 = addParttern(num1,num2.substring(0,point2Index));
            String s2 = num2.substring(point2Index+1);
            s = s1+"."+s2;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num1 = sc.nextLine();
        String num2 = sc.nextLine();

        String sum = add(num1, num2);
        System.out.println(sum);
    }
}
