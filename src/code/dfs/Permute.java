package code.dfs;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Agile——Mouri
 * @Date: 2019/8/9
 * @Title: 全排列
 * 输入：没有重复的序列
 * 输出：全排列
 */
public class Permute {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];

        permuteInternally(result,list,nums,visited);
        System.out.println(result);
        return result;
    }

    private void permuteInternally(List<List<Integer>> results, List<Integer> list, int[] nums,boolean[] visited){
        if (list.size()==nums.length){
            results.add(new ArrayList<>(list));
            return;
        }
        for (int i=0;i<nums.length;i++){
            if (visited[i]){
                continue;
            }
            list.add(nums[i]);
            visited[i] = true;
            permuteInternally(results,list,nums,visited);
            list.remove(list.size()-1);
            visited[i] = false;
        }
    }

    public static void main(String[] args) {
        int[] a = {1,2,3};
        Permute test = new Permute();
        test.permute(a);

    }
}
