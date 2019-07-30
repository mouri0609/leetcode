package code.stack;

import java.util.Stack;

public class nextGreaterElements {
    public int[] nextGreaterElements(int[] nums) {
        int length = nums.length;
        Stack<Integer> stack = new Stack<>();

        int[] result = new int[length];


        for (int i=0;i<length;i++){
            boolean status = false;
            for (int j = i+1;j<length;j++){
                if (nums[i]<nums[j]){
                    stack.push(nums[j]);
                    status =true;
                    break;
                }
            }
            if (!status){
                for (int j = 0;j<i;j++){
                    if (nums[i]<nums[j]){
                        stack.push(nums[j]);
                        status = true;
                        break;
                    }
                }
            }

            if (!status){
                stack.push(-1);
            }
        }

        int i =0;
        while (!stack.isEmpty()){
            result[i] = stack.pop();
            i++;
        }
        return  result;

    }
}
