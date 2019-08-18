package test.xiaoHongshu;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] str = s.split(" ");
        int index = 0;
        for (int i=0;i<str.length;i++){
            if (str[i]==" "){
                index++;
            }
        }

        String[] result = new String[str.length-index];
        index = 0;
        for (int i=0;i<str.length;i++){
            if (str[i]!=" "){
                result[index++] = str[i];
            }
        }

        StringBuffer sb = new StringBuffer();
        for (int i=result.length-1;i>=0;i--){
            sb.append(result[i]+ " ");
        }
        System.out.println(sb.toString().trim());
    }
}
