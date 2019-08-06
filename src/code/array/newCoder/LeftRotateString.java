package code.array.newCoder;

/**
 * @Author: Agile¡ª¡ªMouri
 * @Date: 2019/8/5
 * @Title: ×óÐý×ª×Ö·û´®
 */
public class LeftRotateString {
    public String LeftRotateString(String str,int n) {
        int len = str.length();

        if (len==0){
            return "";
        }
        n = n%len;

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str.substring(n,len));
        stringBuffer.append(str.substring(0,n));

        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        LeftRotateString test = new LeftRotateString();
        test.LeftRotateString("Hello",3);
    }
}
