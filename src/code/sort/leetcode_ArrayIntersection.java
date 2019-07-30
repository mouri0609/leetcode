package code.sort;

import java.util.*;

/**
 * Created by Mouri on 2018/12/18 20:54
 */
public class leetcode_ArrayIntersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> hashSet1 = new HashSet<>();
        for(int i = 0;i<nums1.length;i++){
            hashSet.add(nums1[i]);
            for(int j=0;j<nums2.length;j++){
                if(hashSet.contains(nums2[j])==true){
                    hashSet1.add(nums2[j]);
                }
            }

        }
        int[] nums = new int[hashSet1.size()];
        int i=0;
        for (int number:hashSet1){
            nums[i++] = number;
        }
        return nums;

    }
}
