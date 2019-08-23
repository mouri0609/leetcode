package test.Beike;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        in.nextLine();
        String str = in.nextLine();

        StringBuffer sb = new StringBuffer();
        if(checkSingle(str)){
            for (int i=0;i<k-1;i++){
                sb.append(str.charAt(0));
            }
            System.out.println(str+sb.toString());
            return;
        }
        String temp = getRest(str);


        sb.append(str);
        for (int i=0;i<k-1;i++){
            sb.append(temp);
        }
        System.out.println(sb.toString());
        return;
    }

    private static String getRest(String s){
        int index=1;
        int len = s.length();
        int max = 0;
        while (index<len){
            String head  = s.substring(0,index);
            String tail = s.substring(s.length()-index);
            if (head.equals(tail)){
                max = index;
            }
            index++;
        }

        return s.substring(max);
    }

    private static boolean checkSingle(String s){
        char[] chars = s.toCharArray();
        char c = chars[0];
        boolean result = true;
        for (int i=1;i<chars.length;i++){
            if (chars[i]!=c){
                result = false;
                break;
            }
        }
        return result;
    }
}
