package test.huawei;


import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lowNum = in.nextInt();
        int highNum = in.nextInt();
        getPersum(lowNum,highNum);
    }

    private static void getPersum(int low,int high){
        List<Integer> list = new ArrayList<>();
        for (int i=low;i<high;i++){
            if (isPersum(i)){
                list.add(i);
            }
        }
        System.out.println(findResult(list));
    }

    private static int findResult(List<Integer> list){
        int shi=0;
        int ge=0;
        for (Integer i:list){
            Queue<Integer> queue = new LinkedList<>();
            while (i!=0){
                queue.add(i%10);
                i=i/10;
            }
            if(!queue.isEmpty()){
                ge = ge+queue.poll();
            }

            if(!queue.isEmpty()){
                shi = shi+queue.poll();
            }

        }
        return Math.min(ge,shi);
    }

    private static boolean isPersum(int num){
        for (int i=2;i*i<=num;i++){
            if (num%i==0){
                return false;
            }
        }
        return true;
    }
}
