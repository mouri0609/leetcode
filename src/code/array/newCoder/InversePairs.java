package code.array.newCoder;

/**
 * @Author: Agile——Mouri
 * @Date: 2019/8/2
 * @Title: 数组中的逆序对
 */
public class InversePairs {

    public int InversePairs(int [] array) {
        if (array.length<=1){
            return 0;
        }

        int[] copy = new int[array.length];
        for (int i=0;i<array.length;i++){
            copy[i] = array[i];
        }

        int result = inversePairsInternally(array,copy,0,array.length);
        return result;
    }

    private int inversePairsInternally(int[] array,int[] copy,int start,int end){
        if (start==end){
            return 0;
        }

        int mid = start+(end-start)/2;

        int left = inversePairsInternally(array,copy,start,mid);
        int right = inversePairsInternally(array,copy,mid+1,end);

        int i = mid;
        int j = end;
        int k = end;
        int count = 0;

        while (mid>=start&&end>=mid+1){
            if(array[i]>array[j]){
                copy[k--] = array[i--];
                count+=j-mid;
            }else {
                copy[k--] = array[j--];
            }
        }

        for (;i>=start;i--){
            copy[k--] = array[i--];
        }
        for (;j>=mid+1;j--){
            copy[k--] = array[j--];
        }
        for (int m=start;m<=end;m++){
            array[m] = copy[m];
        }
        return count+left+right;
    }
}
