package code.array.newCoder;

/**
 * @Author: Agile¡ª¡ªMouri
 * @Date: 2019/8/5
 */
public class StrToInt {
    public int StrToInt(String str) {
        if (str.trim().length()==0){
            return 0;
        }
        char[] chars = str.toCharArray();
        boolean positive = true;
        boolean flag = true;
        if (chars[0]=='-'){
            positive = false;
            chars[0] = '0';
        }else if (chars[0] == '+'){
            chars[0] = '0';
        }

        long sum = 0;
        for (int i=0;i<chars.length;i++){
            if (chars[i]<'0'||chars[i]>'9'){
                flag = false;
                break;
            }
            sum = sum*10+(chars[i]-'0');
            if (sum>2147483647&&positive){
                return 0;
            }
            if (sum<-2147483648&&!positive){
                return 0;
            }
        }
        if (!flag){
            return 0;
        }
        if (!positive){
            return (int) (0-sum);
        }
        return (int) sum;

    }

    public static void main(String[] args) {
        char c = '0';
        System.out.print(c);
    }
}
