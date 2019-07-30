package code.stack.newCoder;

import java.util.Stack;

/**
 * @Author: Agile——Mouri
 * @Date: 2019/7/29
 */
public class IsPopOrder {
    public boolean IsPopOrder(int [] pushA,int [] popA) {

        if (pushA.length==0||popA.length==0){
            return false;
        }

        Stack<Integer> stack = new Stack<>();
        int index = 0;
        for (int i=0;i<pushA.length;i++){
            stack.push(pushA[i]);
            //需要一个while循环
            while (index<pushA.length&&stack.peek()==popA[index]){
                index++;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
