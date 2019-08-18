package test.tengxun;

import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String s = in.nextLine();
        String s = "HG[3|B[2|CA]]F";
        StringBuffer sb = new StringBuffer();
        Stack<String> stack1 = new Stack<>();
        Stack<String> stack2 = new Stack<>();

//        for (int i=0;i<s.length();i++){
//            if (s.charAt(i)!='['){
//                sb.append(s.charAt(i));
//            }else {
//                i++
//                while (true){
//                   stack1.empty()
//                }
//                i++;
//                if ()
//            }
//        }

        String pattern = "\\[*";

        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(s);
        System.out.println(m.group(0));
    }

//    private int findStack(String s){
//        int left = 1;
//        int right = 0;
//        int index = 0
//        for (int i=0;i<s.length();i++){
//            if (s.charAt(i)=='['){
//                left++;
//            }else if (s.charAt(i)==']'){
//                right--;
//            }
//            if (left==right){
//                index = i;
//                break;
//            }
//        }
//        return index;
//    }
//
//    private String stack(String s){
//        Stack<Integer> stack1 = new Stack<>();
//        Stack<Integer> stack2 = new Stack<>();
//
//
//    }

}
