package code.dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: Agile——Mouri
 * @Date: 2019/8/9
 * @Title: 全排列II
 * 输入：有重复数字的序列
 * 输出：不重复的全排列
 */
public class PermuteUnique {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];

        Arrays.sort(nums);

        permuteUniqueInternally(result,list,nums,visited);
        System.out.println(result);
        return result;
    }

    private void permuteUniqueInternally(List<List<Integer>> result,List<Integer> list,int[] nums,boolean[] visited){
        if (nums.length==list.size()){
            result.add(new ArrayList<>(list));
            return;
        }
        for (int i=0;i<nums.length;i++){
            if (!visited[i]){
                if (i>0&&nums[i]==nums[i-1]&&visited[i-1]){
                   continue;
                }
                list.add(nums[i]);
                visited[i] = true;
                permuteUniqueInternally(result,list,nums,visited);
                list.remove(list.size()-1);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1,2,1};
        PermuteUnique test = new PermuteUnique();
        test.permuteUnique(a);
    }
}
