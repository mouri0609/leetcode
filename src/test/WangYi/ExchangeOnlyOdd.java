package test.WangYi;

import java.util.*;

/**
 * @Author: Agile¡ª¡ªMouri
 * @Date: 2019/8/3
 */
public class ExchangeOnlyOdd {
    public ArrayList<Integer> exchange(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        int cur = 0;
        boolean odd = false;
        boolean even = false;
        for (int i=0;i<n;i++){
            cur = in.nextInt();
            if (cur%2==0&&!even){
                even = true;
            }else if (!odd){
                odd = true;
            }
            list.add(cur);
        }

        if (even&&odd){
            list.sort((a,b)->{
                int aLen = a.toString().length();
                int bLen = b.toString().length();
                int subLen = Math.abs(aLen-bLen);
                if (subLen==0){
                    return a-b;
                }else if(aLen<bLen){
                    return (int) (a*Math.pow(10,subLen)-b);
                }else {
                    return (int) (a-b*Math.pow(10,subLen));
                }
            });
        }
        return list;
    }

    public static void main(String[] args) {

        ExchangeOnlyOdd test = new ExchangeOnlyOdd();
        List<Integer> list = test.exchange();
        System.out.println(Arrays.asList(list));
    }
}
