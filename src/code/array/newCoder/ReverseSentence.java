package code.array.newCoder;

/**
 * @Author: Agile¡ª¡ªMouri
 * @Date: 2019/8/5
 */
public class ReverseSentence {
    public String ReverseSentence(String str) {
        if (str.trim().length()==0){
            return str;
        }
        String[] s = str.split(" ");
        int length = s.length;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i=length-1;i>=0;i--){
            stringBuffer.append(s[i]+" ");
        }
        return stringBuffer.toString().trim();
    }
}
