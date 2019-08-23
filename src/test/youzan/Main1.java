package test.youzan;

import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        String[] strings = s.split("\\|");
        System.out.println(strings[0]);
        System.out.println(strings[1]);
        String[] nums1 = strings[0].split(",");
        String[] nums2 = strings[1].split(",");

        int i = 0;
        int j = 0;
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(nums1[0]);
        while (i<nums1.length&&j<nums2.length){
            int a = Integer.valueOf(nums1[i]);
            int b = Integer.valueOf(nums2[j]);
            if (a<b){
                list.add(a);
                i++;
            }
            if(a>b){
                list.add(b);
                j++;
            }
            if(a==b){
                list.add(a);
                i++;j++;
            }
        }

        int start = i;
        int end = nums1.length;
        if(j<nums2.length){
            start = j;
            end = nums2.length;
        }

        for(int k=start;k<end;k++){
            if (j<nums2.length){list.add(Integer.valueOf(nums2[k]));}
            else {
                list.add(Integer.valueOf(nums1[k]));
            }
        }

        System.out.println(list);
    }
}
