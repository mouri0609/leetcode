package test.Zoom;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        ArrayList<Integer> index = new ArrayList<>();
        int[] nums = new int[s.length()];

        StringBuffer a = new StringBuffer();
        for (int i=0; i<s.length();i++){
            int num = s.charAt(i)-'0';
            if ((num>9||num<0)&&s.charAt(i)!='-'){
                 a.append(" ");
            }else {
                a.append(s.charAt(i));
            }
        }

        System.out.println(a.toString());
    }


}
