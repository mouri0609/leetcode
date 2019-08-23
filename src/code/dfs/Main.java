package code.dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.valueOf(in.nextLine());
        String s = in.nextLine();
        String[] str = s.split(" ");
        int[] num = new int[str.length];

        for (int i=0;i<str.length;i++){
            num[i] = Integer.valueOf(str[i]);
        }

        System.out.println(combinationSum(num,n));

    }

    public static int combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        Arrays.sort(candidates);
        combinationSumInternally(result,list,candidates,0,target,1);
        if(result.size()!=0){
          return 1;
        }
        return -1;
    }

    private static void combinationSumInternally(List<List<Integer>> results, List<Integer> list, int[] candidates,int pos, int target,int sum){
        if (target==sum){
            results.add(new ArrayList<>(list));
            return;
        }
        for (int i=pos;i<candidates.length&&target-sum>=0;i++){
            list.add(candidates[i]);
            combinationSumInternally(results,list,candidates,i,target,sum*candidates[i]);
            list.remove(list.size()-1);
        }
    }
}
