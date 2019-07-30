package code.array.newCoder;

import java.util.ArrayList;

/**
 * @Author: Agile¡ª¡ªMouri
 * @Date: 2019/7/29
 * @Title:Å£¿ÍÍøË³Ê±Õë´òÓ¡¾ØÕó
 */
public class PrintMatrix {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        int rowTop=0,rowBottom=matrix.length-1,cowLeft=0,cowRight=matrix[0].length-1;

        while (rowTop<=rowBottom&&cowLeft<=cowRight){
            for(int i=cowLeft;i<=cowRight;i++){
                result.add(matrix[rowTop][i]);
            }

            for(int i=rowTop+1;i<=rowBottom;i++){
                result.add(matrix[i][cowRight]);
            }

            if(rowTop!=rowBottom){
                for (int i=cowRight-1;i>=cowLeft;i--){
                    result.add(matrix[rowBottom][i]);
                }
            }

            if(cowLeft!=cowRight){
                for (int i=rowBottom-1;i>rowTop;i--){
                    result.add(matrix[i][cowLeft]);
                }
            }
            rowTop++;rowBottom--;cowLeft++;cowRight--;
        }

        return result;

    }
}
