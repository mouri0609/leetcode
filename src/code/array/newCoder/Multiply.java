package code.array.newCoder;

/**
 * @Author: Agile¡ª¡ªMouri
 * @Date: 2019/8/5
 */
public class Multiply {
    public int[] multiply(int[] A) {
        int len = A.length;
        int[] B = new int[len];
        for (int i=0;i<A.length;i++){
            int temp = 1;
            for (int j=0;j<i;j++){
                temp*=A[j];
            }

            for (int j=i+1;j<A.length;j++){
                temp*=A[j];
            }
            B[i] = temp;
        }
        return B;
    }
}
