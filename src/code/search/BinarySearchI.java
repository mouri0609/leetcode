package code.search;

/**
 * Created by Mouri on 2019/2/24 18:51
 */
public class BinarySearchI {
    public static int binarySearch(int[] nums, int target){
        int low = 0;
        int high = nums.length-1;
        int mid;
        while (low<=high){
            mid = low+(high-low)/2;
            if (nums[mid]==target){
                return mid;
            }else if (nums[mid]<target){
                low = mid+1;
            }else {
                high = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8};
        System.out.println(binarySearch(a,4));
    }
}
