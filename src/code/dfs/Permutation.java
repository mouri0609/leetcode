package code.dfs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author: Agile¡ª¡ªMouri
 * @Date: 2019/8/4
 */
public class Permutation {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> list = new ArrayList<>();
        if (str!=null&&str.length()>0){
            PermutationInternally(str.toCharArray(),0,list);
            Collections.sort(list);
        }
        return list;
    }

    private void PermutationInternally(char[] chars,int index,ArrayList<String> list){
        if (index==chars.length-1){
            list.add(String.valueOf(chars));
        }else {
            Set<Character> charSet = new HashSet<>();
            for (int j=index;j<chars.length;j++){
                if (j==index||!charSet.contains(chars[j])){
                    charSet.add(chars[j]);
                    swap(chars,index,j);
                    PermutationInternally(chars,index+1,list);
                    swap(chars,j,index);
                }
            }
        }

    }

    private void swap(char[] cs,int i,int j){
        char temp = cs[i];
        cs[i] = cs[j];
        cs[j] = temp;
    }

    public static void main(String[] args) {
        String s = "abc";
        Permutation test = new Permutation();
        test.Permutation(s);
        System.out.println(test.Permutation(s));

    }
}
