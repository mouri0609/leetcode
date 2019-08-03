package test.YuanFuDao;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int C = in.nextInt();
        in.nextLine();
        for (int i = 0; i < C; ++i) {
            String s = in.nextLine();
            solution(s);
        }
    }
    private static void solution(String s) {
//        System.out.println(s);
        if (s == null || s.length() == 0) {
            return;
        }
        Stack<Character> stack = new Stack<>();
        int index = 0, len = s.length();
        while (index < len) {
            char c = s.charAt(index);
            if (c == '(' || (c >= 'A' && c <= 'Z')) {
                stack.push(c);
                index++;

            }
            //Êý×Ö
            else if (c >= '0' && c <= '9') {
                int num = 0, tmpIndex = index;
                for (; index < len && c == '0';) {
                    if (++index < len) {
                        c = s.charAt(index);
                    }
                }
                for (; index < len && (c >= '0' && c <= '9');) {
                    num = num * 10 + (c - '0');
                    if (++index < len) {
                        c = s.charAt(index);
                    }
                }
                List<Character> list = new ArrayList<>();
                if (s.charAt(tmpIndex - 1) == ')') {
                    while (!stack.isEmpty()) {
                        char tempC = stack.pop();
                        if (tempC == '(') {
                            break;
                        }
                        list.add(tempC);
                    }
                    for (int i = 0; i < num; ++i) {
                        for (int j = list.size() - 1; j > -1; --j) {
                            stack.push(list.get(j));
                        }
                    }
                }
                else {
                    char tempC = stack.pop();
                }