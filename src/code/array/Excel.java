package code.array;

public class Excel {
    public void excel(String s){
        int length = s.length();
        char[] chars = s.toCharArray();
        int result = String.valueOf(chars[0]).hashCode()-64;
        for (int i = 1;i<length;i++){
            result = result*26+String.valueOf(chars[i]).hashCode()-64;
        }
        System.out.println(result);
    }
}
