package code.Lock.Producer_Consumer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.logging.Logger;

/**
 * @Author: Agile——Mouri
 * @Date: 2019/8/8
 */
public class ProducerConsumerPattern {
    public static void main(String[] args) {
        //阻塞队列
        BlockingQueue sharedQueue = new LinkedBlockingDeque();

        //创建生产者和消费者，共享队列
        Thread prodThread = new Thread(new Producer(sharedQueue));
        Thread consThread = new Thread(new Consumer(sharedQueue));

        //开启生产者和消费者进程
        consThread.start();
        prodThread.start();

    }
}