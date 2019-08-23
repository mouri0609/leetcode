package test.Beike;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        int sum = 0;
        for (int i=0;i<n;i++){
            nums[i]=in.nextInt();
            sum+=nums[i];
        }

        int target = sum/2;
        int[] dp = new int[target+1];
        dp[0] = 0;

        for (int i=1;i<=target;i++){
            dp[i] = Math.max(dp[i-1],dp[i-nums[i-1]]);
        }

        int halfSum = dp[target];

        int min = nums.length;
        int max = 0;
        List<List<Integer>> list = combinationSum2(nums,halfSum);
        for(int i=0;i<list.size();i++){
            int temp = list.get(i).size();
            if(temp>max){
                max = temp;
            }
            if (temp<min){
                min = temp;
            }
        }
        int a = Math.max(Math.abs(n-min-min),Math.abs(max-n+max));
        int b = sum-2*halfSum;
        System.out.println(b+" "+a);

    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>>  result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(candidates);
        combinationInternally(result,list,candidates,0,target);
        return result;
    }

    private static void combinationInternally(List<List<Integer>> result, List<Integer> list, int[] candidates,int pos, int target ){
        if (target==0){
            result.add(new ArrayList<>(list));
            return;
        }
        for (int i=pos;i<candidates.length;i++){
            if (i>pos&&candidates[i]==candidates[i-1]){continue;}
            list.add(candidates[i]);
            combinationInternally(result,list,candidates,i+1,target-candidates[i]);
            list.remove(list.size()-1);
        }
    }
}
