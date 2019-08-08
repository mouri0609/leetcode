package code.dfs;

/**
 * @Author: Agile¡ª¡ªMouri
 * @Date: 2019/8/6
 * @Title: »úÆ÷ÈËÂ·¾¶
 */
public class HasPath {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
        boolean[] visit = new boolean[matrix.length];
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                if (search(matrix,rows,cols,i,j,0,str,visit)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean search(char[] matrix, int rows, int cols, int r, int c, int index, char[] str, boolean[] visited){
        if (r<0||r>=rows||c<0||c>=cols||matrix[r*cols+c]!=str[index]||visited[r*cols+c]){
            return false;
        }
        if (index==str.length-1){
            return true;
        }
        visited[r*cols+c] = true;
        if (search(matrix,rows,cols,r-1,c,index+1,str,visited)||
                search(matrix,rows,cols,r,c-1,index+1,str,visited)||
                search(matrix,rows,cols,r,c+1,index+1,str,visited)||
                search(matrix,rows,cols,r+1,c,index+1,str,visited)){
            return true;
        }
        visited[r*cols+c] = false;
        return false;
    }
}
