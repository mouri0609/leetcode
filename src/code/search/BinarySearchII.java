package code.search;

/**
 * Created by Mouri on 2019/2/24 19:09
 */
public class BinarySearchII {
    public int bsearch(int[] a,int k){
        return bsearchInternally(a,0,a.length-1, k);
    }
    private int bsearchInternally(int[] a,int low,int high,int k){
        if (low>high){
            return  -1;
        }
        int mid = low+(high-low)/2;
        if (mid<k){
            return bsearchInternally(a,mid+1,high,k);
        }else if (mid>k){
           return bsearchInternally(a,low,mid-1,k);
        }else if (mid==k){
            return a[mid];
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearchII binarySearchII = new BinarySearchII();
        int[] a = {1,3,4,5,6,7,8};
        System.out.println(binarySearchII.bsearch(a,4));
    }
}
