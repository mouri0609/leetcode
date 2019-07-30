package code;

/**
 * @Author: Agile——Mouri
 * @Date: 2019/7/19
 */
public class Question2 {
    public static void main(String[] args) {
        String pattern = "aabb";
        String s = "北京 北京 杭州 杭州";
        boolean flag = isMatch(pattern, s);
        System.out.println(flag);
    }

    public static boolean isMatch(String pattern,String s){
        String a = null;
        String b = null;
        String[] strArray = s.split(" ");
        StringBuffer pa = new StringBuffer();

        for(String param : strArray) {
            if(a == null) {
                a = param;
                pa = pa.append("a");
            }else if(a.equals(param)){
                pa = pa.append("a");
            }else if(b == null) {
                b = param;
                pa = pa.append("b");
            } else if(b.equals(param)) {
                pa = pa.append("b");
            }
        }
        return pattern.equals(pa.toString());
    }
}
