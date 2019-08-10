package code.dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: Agile——Mouri
 * @Date: 2019/8/9
 * @Title: 组合总和
 * 输入：无重复元素的数组candidates[]和目标总和target；无重复元素可以被使用多次。
 * 输出：所有能够组成目标和的无重复组合
 */
public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        Arrays.sort(candidates);
        combinationSumInternally(result,list,candidates,0,target);
        return result;
    }

    private void combinationSumInternally(List<List<Integer>> results, List<Integer> list, int[] candidates,int pos, int target){
        if (target==0){
            results.add(new ArrayList<>(list));
            return;
        }
        for (int i=pos;i<candidates.length&&target-candidates[i]>=0;i++){
            list.add(candidates[i]);
            combinationSumInternally(results,list,candidates,i,target-candidates[i]);
            list.remove(list.size()-1);
        }
    }
    public static void main(String[] args) {
        CombinationSum test = new CombinationSum();
        int[] a = {2,3,6,7};
        System.out.println(test.combinationSum(a,7));
    }
}
