package code.search;

/**
 * Created by Mouri on 2019/2/24 21:48
 */
//查找第一个大于等于给定值的元素
public class VagueBinarySearchIII {
    public static int binarySearch(int[] nums, int target){
        int low = 0;
        int high = nums.length;
        int mid;
        while (low<=high){
            mid = low+(high-low)/2;
            if (nums[mid]>=target){
                if (mid==0||nums[mid-1]<target){
                    return mid;
                }else {
                    high = mid-1;
                }
            }else {
                 low = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {2,3,4,5,5,5,5,5,5,6,7,8};
        System.out.println(binarySearch(a,3));
    }
}
