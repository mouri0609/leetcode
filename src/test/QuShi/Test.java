package test.QuShi;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @Author: Agile——Mouri
 * @Date: 2019/8/8
 */
public class Test {
    static int[] coins = {1, 5, 10, 20, 50, 100};
    private static String process(String num1, String num2){
        String[] arr = num1.split(" ");
        int[] nums = new int[arr.length];
        for(int i=0;i<coins.length;i++) {
            nums[i] = Integer.parseInt(arr[i]);
        }
        int target = Integer.parseInt(num2);
        //新的数组，所有的硬币
        ArrayList<Integer> tmp = new ArrayList<>();
        for(int j=0;j<nums.length;j++) {
            for(int k=0;k<nums[j];k++)
                tmp.add(coins[j]);
        }
        //存放一种组合的个数
        ArrayList<Integer> res = new ArrayList<>();
        //存放一种组合的具体详情
        ArrayList<Integer> path = new ArrayList<>();
        hepler(res, tmp, target, 0, 0, path);
        int num = 0;
        for(int val:res) {
            num += val;
        }
        return num+"";

    }

    private static void hepler(ArrayList<Integer> res, ArrayList<Integer> coins, int target, int pos, int sum, ArrayList<Integer> path) {
        if(sum == target) {
            res.add(path.size());
            return;
        }
        if(sum > target)
            return;
        Set<Integer> set = new HashSet<>();
        for(int i=pos;i<coins.size();i++) {
            if(set.contains(coins.get(i))){
                System.out.println(set);
                continue;
            }

            set.add(coins.get(i));
            path.add(coins.get(i));
            hepler(res, coins, target, i+1, sum+coins.get(i), path);
            path.remove(path.size()-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String strValueSequences = sc.nextLine();
        String strChargeNum = sc.nextLine();

        String sum = process(strValueSequences, strChargeNum);
        System.out.println(sum);
    }
}
