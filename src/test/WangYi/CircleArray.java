package test.WangYi;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: Agile¡ª¡ªMouri
 * @Date: 2019/8/3
 */
public class CircleArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i=0;i<t;i++){
            int n = scan.nextInt();
            int[] nums = new int[n];
            for(int j=0;j<n;++j){
                nums[j] = scan.nextInt();
            }
            solution(nums);
        }
        scan.close();
    }

    private static void solution(int[] nums){
        if(nums==null||nums.length<3){
            System.out.println("NO");
            return;
        }
        Arrays.sort(nums);
        int len = nums.length;
        for(int i=1;i<len-1;++i){
            if(nums[i-1]+nums[i+1]<nums[i]){
                System.out.println("NO");
                return;
            }
        }
        if(nums[0]<nums[1]+nums[len-1]&&nums[len-1]<nums[len-1]+nums[1]){
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }
}
