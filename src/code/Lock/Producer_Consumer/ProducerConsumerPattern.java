package code.Lock.Producer_Consumer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.logging.Logger;

/**
 * @Author: Agile����Mouri
 * @Date: 2019/8/8
 */
public class ProducerConsumerPattern {
    public static void main(String[] args) {
        //��������
        BlockingQueue sharedQueue = new LinkedBlockingDeque();

        //���������ߺ������ߣ��������
        Thread prodThread = new Thread(new Producer(sharedQueue));
        Thread consThread = new Thread(new Consumer(sharedQueue));

        //���������ߺ������߽���
        consThread.start();
        prodThread.start();

    }
}