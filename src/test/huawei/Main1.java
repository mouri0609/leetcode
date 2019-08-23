package test.huawei;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        String[] nums = str.split(" ");
        int len = hexToInt(nums[0]);

        StringBuffer sb = new StringBuffer();
        int times = 0;
        for (int i=1;i<nums.length;i++){
            if ("A".equals(nums[i])){
                sb.append("12 34 ");
                times++;
            }else if("B".equals(nums[i])){
                sb.append("AB CD ");
                times++;
            }else {
                sb.append(nums[i]+" ");
            }
        }

        len = times+len;
        String s = intToHex(len);
        System.out.print(s+" "+sb.toString().trim());

    }

    private static String intToHex(int n){
        StringBuffer sb = new StringBuffer();
        char[] chars = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while (n!=0){
            sb = sb.append(chars[n%16]);
            n = n/16;
        }
        return sb.reverse().toString();
    }

    private static int hexToInt(String s){
        char[] chars = s.toCharArray();
        int result = 0;
        for (int i=0;i<chars.length;i++){
            int temp  =  Integer.parseInt(String.valueOf(chars[i]),16);
            result= result*10+temp;
        }
        return result;
    }
}
