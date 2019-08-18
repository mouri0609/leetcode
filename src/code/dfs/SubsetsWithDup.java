package code.dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: Agile����Mouri
 * @Date: 2019/8/9
 * @Title: �Ӽ�II
 * ���룺���ܰ����ظ�Ԫ�ص�����
 * ������⼯�������ظ����Ӽ�
 *
 */
public class SubsetsWithDup {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        subsetsWithDupInternally(result,list,nums,0);
        return result;
    }

    private void subsetsWithDupInternally(List<List<Integer>> result, List<Integer> list, int[] nums, int pos){
        result.add(new ArrayList<>(list));
        for (int i=pos;i<nums.length;i++){
            if (i>pos&&nums[i]==nums[i-1]){
                continue;
            }
            list.add(nums[i]);
            subsetsWithDupInternally(result,list,nums,i+1);
            list.remove(list.size()-1);
        }
    }
}
