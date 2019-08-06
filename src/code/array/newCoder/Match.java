package code.array.newCoder;

import java.util.HashMap;

/**
 * @Author: Agile¡ª¡ªMouri
 * @Date: 2019/8/5
 */
public class Match {

    int[] table = new int[256];
    StringBuffer s = new StringBuffer();
    //Insert one char from stringstream
    public void Insert(char ch)
    {
        s.append(ch);
        if (table[ch]==0){
            table[ch]=1;
        }else {
            table[ch]++;
        }
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        char[] chars = s.toString().toCharArray();
        for (int i =0;i<chars.length;i++){
            if (table[chars[i]]==1){
                return chars[i];
            }
        }
        return '0';
    }
}
