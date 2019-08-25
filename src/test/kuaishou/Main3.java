package test.kuaishou;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();

        if (s1.length()==0){
            System.out.println(s2);
        }
        if (s2.length()==0){
            System.out.println(s1);
        }

        StringBuffer sb = new StringBuffer();
        String[] strings1 = s1.split(" ");
        String[] strings2 = s2.split(" ");


        int len1 = strings1.length;
        int len2 = strings2.length;

        int index = 1;
        int i=0;
        int j=0;
        while (len1!=i&&len2!=j){
            if (index%5==0){
                sb.append(strings2[j]+" ");
                j++;
            }else {
                sb.append(strings1[i]+" ");
                i++;
            }
            index++;
        }

        if(len1==i){
            for (int k=j;k<len2;k++){
                sb.append(strings2[k]+" ");
            }
        }else if (len2==j){
            for (int k=i;k<len1;k++){
                sb.append(strings1[k]+" ");
            }


        }
        System.out.println(sb.toString().trim());
    }
}
