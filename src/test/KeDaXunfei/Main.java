package test.KeDaXunfei;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String s = "°®Ñ¶·É789swr1wwen34ifly65tek";
        StringBuffer sb = new StringBuffer();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i=0;i<s.length();i++){
            int temp = s.charAt(i)-'0';
            if (temp<10&&temp>=0){
                list.add(temp);
            }
        }

        list.sort((o1, o2) -> o1-o2);

        if (list.size()==0){
            System.out.print(-1);
            return;
        }

        for (int i=0;i<list.size();i++){
            System.out.print(list.get(i));
//            sb.append(list.get(i));
        }
//        System.out.print(sb.toString());


    }
}
