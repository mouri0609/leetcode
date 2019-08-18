package code.dfs;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Agile����Mouri
 * @Date: 2019/8/9
 * @Title: ���
 * ���룺������������n,k
 * ����� 1 ... n �����п��ܵ� k ��������ϡ�
 */
public class Combine {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        combineInternally(result,list,n,k,1);
        System.out.println(result);
        return result;
    }

    private void combineInternally(List<List<Integer>> result, List<Integer> list,int n,int k,int pos){
        if (list.size()==k){
            result.add(new ArrayList<>(list));
            return;
        }
        for (int i=pos;i<=n;i++){
            list.add(i);
            combineInternally(result,list,n,k,i+1);
            list.remove(list.size()-1);
        }
    }

    public static void main(String[] args) {
        Combine test = new Combine();
        test.combine(4,2);
    }
}
