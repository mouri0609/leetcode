package code.array.newCoder;

import code.dp.newCoder.FindGreatestSumOfSubArray;
import org.w3c.dom.ls.LSInput;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Author: Agile——Mouri
 * @Date: 2019/8/2
 * @Title: 第一个只出现一次的字符
 */
public class FirstNotRepeatingChar {
    public int firstNotRepeatingChar(String str) {
        char[] chars = str.toCharArray();
        HashMap<Character,Integer> hashMap = new HashMap<>();
        HashMap<Character,Integer> firstIndexMap = new HashMap<>();
        List<Character> list = new ArrayList<>();

        for (int i=0;i<chars.length;i++){
            if (!hashMap.containsKey(chars[i])) {
                hashMap.put(chars[i],1);
                firstIndexMap.put(chars[i],i);
            }
            if (hashMap.containsKey(chars[i])){
                hashMap.put(chars[i],hashMap.get(chars[i])+1);
            }
            list.add(chars[i]);
        }

        list.sort((a,b)->{
            if (hashMap.get(a).equals(hashMap.get(b))){
                return firstIndexMap.get(a)-firstIndexMap.get(b);
            }
            return hashMap.get(a)-hashMap.get(b);
        });

        if (!list.get(0).equals(list.get(1))){
            return firstIndexMap.get(list.get(0));
        }
        return -1;
    }
}
