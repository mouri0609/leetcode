package code.deque;

import code.LinkedList.Node.ListNode;

public class MyCircularQueue {

    ListNode head;
    ListNode tail;
    int capacity;
    int size;

    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        head = null;
        tail = null;
        capacity = k;
        size = 0;
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if (size>=capacity){
            return false;
        }
        ListNode node = new ListNode(value);
        if (head!=null){
            tail.next = node;
            tail = tail.next;
        }else {
            head = node;
            tail = node;
        }
        size++;
        return true;
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if(size<1){
            return false;
        }else if(size>1){
            head = head.next;
        }else {
            head = head.next;
            tail = tail.next;
        }
        size--;
        return true;
    }

    /** Get the front item from the queue. */
    public int Front() {
        if (size>0){
            return head.val;
        }else{
            return 0;
        }
    }

    /** Get the last item from the queue. */
    public int Rear() {
        if (size==0){
            return 0;
        }else {
            return tail.val;
        }
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        if (size==0){
            return true;
        }else {
            return false;
        }
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        if (size==capacity){
            return true;
        }else {
            return false;
        }
    }


    public static void main(String[] args) {
        MyCircularQueue obj = new MyCircularQueue(3);
        boolean param_1 = obj.enQueue(1);
        boolean param_2 = obj.enQueue(2);
        boolean param_3 = obj.enQueue(3);
        boolean param_4 = obj.enQueue(4);
        int param_5 = obj.Rear();
        boolean param_6 = obj.isFull();
        boolean param_7 = obj.deQueue();
        boolean param_8 = obj.enQueue(4);
        int param_9 = obj.Rear();
    }
}
