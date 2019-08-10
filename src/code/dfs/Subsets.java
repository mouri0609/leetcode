package code.dfs;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Agile����Mouri
 * @Date: 2019/8/9
 * @Title: �Ӽ�
 * ���룺�����ظ�Ԫ�ص���������
 * ��������п��ܵ��Ӽ�
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
