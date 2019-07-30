package code.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mouri on 2019/2/18 20:37
 */
public class threeNumberSum {
    public List<List<Integer>> threeSum(int[] nums) {
        int length = nums.length;


        List<List<Integer>> lists = new ArrayList<>();

        for (int i=0;i<length-2;i++){
            for(int j=i+1;j<length-1;j++) {
                for(int k=i+2;k<length;k++) {
                    if (nums[i]+nums[j]+nums[k]==0)
                    {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        lists.add(list);
                    }
                }
            }
        }
        System.out.println(lists);
        return lists;
    }

//    public static void main(String[] args) {
//        threeNumberSum Question3 = new threeNumberSum();
//
//    }
}
