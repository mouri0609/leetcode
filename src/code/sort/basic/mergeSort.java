package code.sort.basic;

/**
 * Created by Mouri on 2019/1/7 15:59
 */
public class mergeSort {

    public static void mergeSort(int[] a, int n){
        mergeSortInternally(a,0,n-1);
    }


    private static void mergeSortInternally(int[] a, int p, int r) {
        if (p>=r) return;

        int q = p+(r-p)/2;
        mergeSortInternally(a,p,q);
        mergeSortInternally(a,q+1,r);
        merge(a,p,q,r);
    }

    private static  void merge(int[] a,int p,int q,int r) {
        int i = p;
        int j = q+1;
        int k = 0;
        //申请临时数组空间，大小为r-p+1
        int[] tmp = new int[r-p+1];
        while (i<=q&&j<=r) {
            if (a[i]<=a[j]){
                tmp[k++] = a[i++];
            }else {
                tmp[k++] = a[j++];
            }
        }

        int start = i;
        int end = q;
        if(j<=r) {
            start = j;
            end = r;
        }
        //后续数组添加到末尾
        while (start<=end) {
            tmp[k++] = a[start++];
        }
        //临时数组空间拷贝
        for (i=0;i<=r-p;++i){
            a[p+i] = tmp[i];
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{4, 3, 6, 1, 2, 5};
        mergeSort(a,6);
        for (int i = 0; i < a.length; ++i) {
            System.out.print(a[i] + "　");
        }
    }

// public static void mergeSort(int[] nums,int n){
//        mergeSortInternally(nums,0,n-1);
//    }
//
//    private static void mergeSortInternally(int[] nums,int p,int r){
//        if (p>=r){
//            return;
//        }
//        int q = p+(r-p)/2;
//        mergeSortInternally(nums,p,q);
//        mergeSortInternally(nums,q+1,r);
//        mergeSortNums(nums,p,q,r);
//    }
//
//    private static void mergeSortNums(int[] nums,int p,int q,int r){
//        int i = p;
//        int j = q+1;
//        int k=0;
//
//        int[] temp = new int[r-p+1];
//
//        while (i<=p&&j<=r){
//            if (nums[i]<nums[j]){
//                temp[k++] = nums[i++];
//            }else {
//                temp[k++] = nums[j++];
//            }
//        }
//        int start = i;
//        int end = q;
//        if (j<=r){
//            start = j;
//            end = r;
//        }
//        while (start<=end){
//            temp[k++] = nums[start++];
//        }
//
//       // 临时数组空间拷贝
//        for (i=0;i<=r-p;++i){
//           nums[p+i] = temp[i];
//        }
//
//    }

}
