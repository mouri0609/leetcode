package code.sort.basic;

/**
 * Created by Mouri on 2019/2/24 15:17
 */
public class TopK {
    public static void topK(int[] a,int k){
       topKInternally(a,0,a.length-1,k);
    }
    private static void topKInternally(int[] a,int left,int right,int k){
        if (left>=right){
            return;
        }
        int p = partiation(a,left,right);
        if(p+1<k){
            topKInternally(a,p+1,right,k);
        }else if(p+1>k){
            topKInternally(a,left,p-1,k);
        }
    }
    private static int partiation(int[] a,int left,int right){
        int qivot = a[right];
        int i = left;
        int temp;
        for(int j = left;j<a.length;j++){
            if (a[j]<qivot){
                if (i==j){
                    ++i;
                }else {
                    temp = a[j];
                    a[j] = a[i];
                    a[i++] = temp;
                }
            }

        }
        temp = a[right];
        a[right] = a[i];
        a[i] = temp;
        return i;
    }

    public static void main(String[] args) {
        int[] test = {1,3,9,4,2,5,7,6,8};
        topK(test,2);
        for (int i = 0; i < test.length; ++i) {
            System.out.print(test[i] + "¡¡");
        }
    }
}

