package code.dfs;

/**
 * @Author: Agile¡ª¡ªMouri
 * @Date: 2019/8/6
 */
public class movingCount {
    public int movingCount(int threshold, int rows, int cols)
    {
        int[][] flag = new int[rows][cols];
        return helper(0,0,rows,cols,threshold,flag);
    }

    private int helper(int r,int c,int rows,int cols,int thread,int[][] flag){
        if (r<0||r>=rows||c<0||c>=cols||numSums(r)+numSums(c)>thread||flag[r][c]==1){
            return 0;
        }
        flag[r][c] = 1;
        return helper(r-1,c,rows,cols,thread,flag)+
                helper(r,c+1,rows,cols,thread,flag)+
                helper(r,c-1,rows,cols,thread,flag)+
                helper(r+1,c,rows,cols,thread,flag)+1;
    }

    private int numSums(int num){
        int sum = 0;
        while (num!=0){
            int temp = num%10;
            num = num/10;
            sum+=temp;
        }
        return sum;
    }
}
