package code.array.newCoder;

/**
 * @Author: Agile����Mouri
 * @Date: 2019/8/5
 */
public class Sum_Solution {
    public int Sum_Solution(int n) {
        int sum = n;
        Boolean flag = (sum>0)&&((sum+=Sum_Solution(--n))>0);
        return sum;
    }
}
