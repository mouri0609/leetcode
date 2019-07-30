package code.sort;
/*
leetcode 75
颜色分类，
方法一：两遍扫描，计数排序
方法二：一遍扫描,荷兰旗问题
 */
public class SortColors {
    public void sortColors1(int[] nums){
        int zeroCount = 0;
        int oneCount = 0;
        int twoCount = 0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==0){
                zeroCount++;
            }else if (nums[i]==1){
                oneCount++;
            }else {
                twoCount++;
            }
        }

        for (int k=0;k<nums.length;){
            while (zeroCount>0){
                nums[k++] = 0;
                zeroCount--;
            }
            while (oneCount>0){
                nums[k++] = 1;
                oneCount--;
            }
            while (twoCount>0){
                nums[k++] = 2;
                twoCount--;
            }
        }
    }

    public void sortColors3(int[] nums){
        int[] a  = new int[3];
        for (int i=0;i<nums.length;i++){
            a[nums[i]]++;
        }
        int j = 0;
        for (int i=0;i<a.length;i++){
            while (a[i]>0){
                nums[j++] = i;
                a[i]--;
            }
        }
    }


    public void sortColor2(int[] nums){
        int left = 0;
        int right = nums.length-1;
        for (int i= 0;i<=right;i++){
            if (nums[i]==0){
                swap(nums,i,left++);
            }
            if (nums[i]==2){
                swap(nums,i--,right--);
            }
        }
    }

    private void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }



}
