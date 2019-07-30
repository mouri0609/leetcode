package code.sort;

import java.util.*;
import java.util.concurrent.locks.ReentrantLock;

public class largestNumber {
    public String largestNumber(int[] nums) {
        String[]s = new String[nums.length];

        for(int i = 0;i < nums.length;i++){
            s[i] = ""+nums[i];
        }

        Arrays.sort(s, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -(o1+o2).compareTo(o2+o1);
            }
        });

        String ans = "";
        for(int i = 0;i < s.length;i++)
            ans += s[i];
        System.out.println(ans);
        return ans;
    }

    public static void main(String[] args) {
       largestNumber largestNumber = new largestNumber();
       int[] nums = new int[]{3,30,34,5,9};
       largestNumber.largestNumber(nums);
    }
}
