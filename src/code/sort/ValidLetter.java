package code.sort;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Mouri on 2018/12/24 19:10
 */
public class ValidLetter {
    public boolean isAnagram(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        if (s1.length!=t1.length) {
            return  false;
        }

        Arrays.sort(s1);
        Arrays.sort(t1);
        return Arrays.equals(s1,t1);
    }

    public static void main(String[] args) {
        ValidLetter validLetter = new ValidLetter();
        System.out.println(validLetter.isAnagram("anagram", "nagaram"));
    }
}
