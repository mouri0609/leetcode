package code.heap;

import java.util.PriorityQueue;

public class midnum {
    private int N = 0;
    PriorityQueue<Integer> smalltop = new PriorityQueue<>((o1, o2) -> o2-o1);
    PriorityQueue<Integer> bigtop = new PriorityQueue<>();
    public void Insert(Integer num) {
        if (N%2==0){
            bigtop.offer(num);
            smalltop.offer(bigtop.poll());
        }else {
            smalltop.offer(num);
            bigtop.offer(smalltop.poll());
        }
        N++;
    }

    public Double GetMedian() {
        if (N%2==0){
            return (bigtop.peek()+smalltop.peek())/2.0;
        }else {
            return (double)smalltop.peek();
        }
    }
}
