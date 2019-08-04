package code.search.newCoder;

/**
 * @Author: Agile¡ª¡ªMouri
 * @Date: 2019/8/4
 */
public class GetNumberOfK {
    public int GetNumberOfK(int [] array , int k) {

       int start = getFirst(array,k);
        int n = 1;
        while (start!=array.length-1&&array[start]==array[start+1]){
            start++;
            n++;
        }
       return n;
    }

    private int getFirst(int[] array,int k){
        int low = 0;
        int high = array.length-1;
        while (low<=high){
            int mid = low+(high-low)/2;
            if (array[mid]==k){
                if(mid==0||array[mid-1]!=k){
                    return mid;
                }else {
                    high = mid-1;
                }
            }else if (array[mid]>k){
                high = mid-1;
            }else {
                low = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,5,5,5,5,5,6,7,8};
        GetNumberOfK test = new GetNumberOfK();
        System.out.println(test.GetNumberOfK(a,8));
    }
}
