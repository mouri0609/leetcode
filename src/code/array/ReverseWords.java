package code.array;

import java.util.Arrays;

public class ReverseWords {
    public String reverseWords(String s) {
        String[] a = s.split(" ");
        String result = "";
        for (int i = 0;i<a.length;i++){
            char temp;
            char[] chars = a[i].toCharArray();
            int start = 0;
            int tail = a[i].length()-1;
            while (start<tail){
                temp= chars[start];
                chars[start++] = chars[tail];
                chars[tail--] = temp;
            }
            result = result+String.valueOf(chars)+" ";

        }
        System.out.println(result);
        return result.substring(0,result.length()-1);
    }

    public static void main(String[] args) {
        ReverseWords reverseWords = new ReverseWords();
        String string = reverseWords.reverseWords("Let's take LeetCode contest");
        System.out.println(string);
    }
}
