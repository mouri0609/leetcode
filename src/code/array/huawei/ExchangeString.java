package code.array.huawei;

import java.util.Scanner;

/*
×Ö·û´®·­×ª
 */

public class ExchangeString {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        StringBuffer sb = new StringBuffer();

        char[] chars = str.toCharArray();
        int tail = str.length()-1;
        for(int i=0;i<str.length()/2;i++){
            swap(chars,i,tail--);
        }
        for(int i=0;i<chars.length;i++){
            sb.append(chars[i]);
        }
        System.out.print(sb.toString());
    }
    private static void swap(char[] chars,int a,int b){
        char temp = chars[a];
        chars[a] = chars[b];
        chars[b] = temp;
    }
}
