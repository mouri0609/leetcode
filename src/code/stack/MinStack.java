package code.stack;

import java.util.ArrayList;
import java.util.Stack;

public class MinStack {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public MinStack() {

    }

    public void push(int x) {
        stack1.push(x);
        if (stack2.isEmpty()){
            stack2.push(x);
        }else  {
            if (stack2.peek()>=x){
                stack2.push(x);
            }
        }
    }

    public void pop() {
        if (stack1.peek().equals(stack2.peek())){
            stack2.pop();
            stack1.pop();
        }else {
            stack1.pop();
        }

    }

    public int top() {
        return stack1.peek();
    }

    public int getMin() {
        return stack2.peek();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(512);
        minStack.push(-1024);
        minStack.push(-1024);
        minStack.push(512);

        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());


    }
}
