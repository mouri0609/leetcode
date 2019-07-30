package code.sort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Mouri on 2018/12/24 19:56
 */
public class IntersectionInterger {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> hashMap1 = new HashMap<>();
        for (int i=0;i<nums1.length;i++){
            if(hashMap1.containsKey(nums1[i])){
                int value = hashMap1.get(nums1[i]);
                hashMap1.put(nums1[i],value+1);
            }else {
                hashMap1.put(nums1[i],1);
            }

        }
        System.out.println(hashMap1);
        for (int j=0;j<nums2.length;j++){
            if(hashMap1.containsKey(nums2[j])&&hashMap1.get(nums2[j])!=0){
                list.add(nums2[j]);
                int value = hashMap1.get(nums2[j]);
                hashMap1.put(nums2[j],value-1);
            }
        }
        int[] a =new  int[list.size()];
        for (int i = 0;i<a.length;i++){
            a[i] = list.get(i);
        }
            return a;
    }

    public static void main(String[] args) {
        IntersectionInterger intersectionInterger = new IntersectionInterger();
        int[] a = {1,2,2,3};
        int[] b = {2,2,2};
        System.out.println(intersectionInterger.intersect(a,b));

    }
}
