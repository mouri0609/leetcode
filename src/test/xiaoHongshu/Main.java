package test.xiaoHongshu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<List<Integer>> getSum(int[] price, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        Arrays.sort(price);
        getSumInternally(result,list,price,0,target);
        return result;
    }

    private static void getSumInternally(List<List<Integer>> results, List<Integer> list, int[] price,int pos, int target){
        if (target==0){
            results.add(new ArrayList<>(list));
            return;
        }
        for (int i=pos;i<price.length&&target-price[i]>=0;i++){
            list.add(price[i]);
            getSumInternally(results,list,price,i,target-price[i]);
            list.remove(list.size()-1);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] strs = s.split(" ");
        int sum = Integer.valueOf(strs[0]);
        String[] s1 = strs[1].substring(1,strs[1].length()-1).split(",");
        int[] price = new int[s1.length];
        for (int i=0;i<s1.length;i++){
            price[i] = Integer.valueOf(s1[i]);
        }
        List<List<Integer>> result = new ArrayList<>();
        result = getSum(price,sum);
        System.out.println(result.size());

    }
}
