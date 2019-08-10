package code.dfs;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Agile——Mouri
 * @Date: 2019/8/9
 * @Title: 子集
 * 输入：不含重复元素的整数数组
 * 输出：所有可能的子集
 */
public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        subsetsInternally(result,list,nums,0);

        return result;
    }

    private void subsetsInternally(List<List<Integer>> result,List<Integer> list, int[] nums,int index){
        result.add(new ArrayList<>(list));

        for (int i=index;i<nums.length;i++){
            list.add(nums[i]);
            subsetsInternally(result,list,nums,i+1);
            list.remove(list.size()-1);
        }
    }
}
