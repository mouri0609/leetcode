package code.array.newCoder;

import java.util.ArrayList;

/**
 * @Author: Agile——Mouri
 * @Date: 2019/8/5
 * @Title: 孩子们的游戏
 */
public class LastRemaining_Solution {
    public int LastRemaining_Solution(int n, int m) {
        if (n<1||m<1){
            return -1;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0;i<n;i++){
            list.add(i);
        }
        int a = 0;
        while (list.size()>1){
            a = (a+(m-1))%list.size();
            list.remove(a);
        }
        return list.get(0);
    }
}
