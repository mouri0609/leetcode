package code.sort.basic;

/**
 * Created by Mouri on 2019/2/24 14:33
 */
public class QuickSort {
//    public static void quickSort(int[] a, int n){
//        quickSortInternally(a,0,n-1);
//    }
//
//    private static void quickSortInternally(int[] a, int p, int r){
//        if (p>=r){
//            return;
//        }
//        int q = partition(a,p,r);
//        quickSortInternally(a, p,q-1);
//        quickSortInternally(a,q+1,r);
//    }
//
//    private static int partition(int[] a,int p,int r){
//        int pivot = a[r];
//        int i = p;
//        int temp;
//        for (int j=p;j<r;j++){
//            if(a[j]<pivot){
//                if(i==j){
//                    ++i;
//                }else {
//                    temp = a[i];
//                    a[i++] = a[j];
//                    a[j] = temp;
//                }
//            }
//        }
//        temp = a[i];
//        a[i] = a[r];
//        a[r] = temp;
//        return i;
//    }

    public static void main(String[] args) {
        int[] test = {1,5,4,3,7,2,8,6};
        quickSort(test,8);
        for (int i = 0; i < test.length; ++i) {
            System.out.print(test[i] + "¡¡");
        }
    }

    public static void  quickSort(int[] nums,int n){
        quickSortInternally(nums,0,n-1);
    }

    private static void quickSortInternally(int[] nums,int p,int r){
        if (p>=r){
            return;
        }
        int q =partition(nums,p,r);
        quickSortInternally(nums,p,q-1);
        quickSortInternally(nums,q+1,r);
    }

    private static int partition(int[] nums,int p,int r){
        int privot = nums[r];
        int i = p;
        int temp;
        for (int j=p;j<r;j++){
            if (nums[j]<privot){
                if (i==j){
                    ++i;
                }else {
                    temp = nums[i];
                    nums[i++] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        temp = nums[i];
        nums[i] = nums[r];
        nums[r] = temp;
        return i;
    }
}
