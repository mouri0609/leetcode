package code.search;

/**
 * Created by Mouri on 2019/2/24 22:01
 */
//查找最后一个小于等于给定值的元素
public class VagueBinarySearchIV {

    public static int binarySearch(int[] nums, int target){
        int low = 0;
        int high = nums.length;
        int mid;
        while (low<=high){
            mid = low+(high-low)/2;
            if (nums[mid]<=target){
                if (mid==nums.length-1||nums[mid+1]>target){
                    return nums[mid];
                }else {
                    low = mid+1;
                }
            }else {
                high = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {3,5,6,8,9,10};
        System.out.println(binarySearch(a,7));

    }

}
