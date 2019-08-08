package code.array.newCoder;

/**
 * @Author: Agile¡ª¡ªMouri
 * @Date: 2019/8/5
 */
public class Sum_Solution {
    public int Sum_Solution(int n) {
        int sum = n;
        Boolean flag = (sum>0)&&((sum+=Sum_Solution(--n))>0);
        return sum;
    }
}
