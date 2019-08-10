package code.dfs;

import java.util.*;

/**
 * @Author: Agile——Mouri
 * @Date: 2019/8/9
 * @Title: 组合总和II
 * 输入：可重复元素的数组candidates[]和目标总和target。
 * 输出：所有能够组成目标和的无重复组合，每个元素只能被用一次。
 */
public class CombinationSum2 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>>  result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(candidates);
        combinationInternally(result,list,candidates,0,target);
        return result;
    }

    private void combinationInternally(List<List<Integer>> result, List<Integer> list, int[] candidates,int pos, int target ){
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

    public static void main(String[] args) {
        CombinationSum2 test = new CombinationSum2();
        int[] a = {10,1,2,7,6,1,5};
        System.out.println(test.combinationSum2(a,8));
    }
}
