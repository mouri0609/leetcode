package code.deque;

import java.util.List;

/**
 * Created by Mouri on 2019/2/21 14:51
 */
class MyCircularDeque {
    class ListNode{
        public ListNode(int val){
            this.val = val;
            next = null;
            pre = null;
        }
        public int val;
        public ListNode next;
        public ListNode pre;
    }
    ListNode head;
    ListNode tail;
    int size;
    int capacity;

    /** Initialize your data structure here. Set the size of the deque to be k. */
    public MyCircularDeque(int k) {
        head = null;
        tail = null;
        capacity = k;
        size = 0;
    }

    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
        if(size>=capacity)
            return false;
        ListNode node = new ListNode(value);
        if(head!=null){
            head.pre = node;
            node.next = head;
            head = node;
        }else {
            head = node;
            tail = node;
        }
        size++;
        return true;
    }

    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
        if(size>=capacity)
            return false;
        ListNode node = new ListNode(value);
        if(tail!=null){
            tail.next = node;
            node.pre = tail;
            tail = node;
        }else {
            head = node;
            tail = node;
        }
        size++;
        return true;

    }

    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        if (head==null){
            return false;
        }
        ListNode node = head.next;
        if (node!=null){
            node.pre = null;
            head = node;
        }else {
            head = null;
            tail = null;
        }
        size--;
        return true;
    }

    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
        if(tail==null){
            return false;
        }
        ListNode node = tail.pre;
        if (node!=null){
            node.next = null;
            tail = node;
        }else {
            head = null;
            tail = null;
        }
        size--;
        return true;
    }

    /** Get the front item from the deque. */
    public int getFront() {
        if(head!=null){
            return head.val;
        }
        return -1;
    }

    /** Get the last item from the deque. */
    public int getRear() {
        if(tail!=null){
            return tail.val;
        }
        return -1;
    }

    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        return size==0;
    }

    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        return size==capacity;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */
