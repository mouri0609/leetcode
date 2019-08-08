package code.Lock;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: Agile¡ª¡ªMouri
 * @Date: 2019/7/11
 */
public class Question3 {
    static class Task {
        private static ReentrantLock reentrantLock = new ReentrantLock();
        private static Condition conditionA = reentrantLock.newCondition();
        private static Condition conditionB = reentrantLock.newCondition();
        private static Condition conditionC = reentrantLock.newCondition();
        public void execute(String flag) {
            reentrantLock.lock();
            try {
                while(true) {
                    if ("A".equals(flag)) {
                        System.out.println(Thread.currentThread().getName());
                        conditionB.signal();
                        conditionA.await();
                    }
                    if ("B".equals(flag)) {
                        System.out.println(Thread.currentThread().getName());
                        conditionC.signal();
                        conditionB.await();
                    }
                    if ("C".equals(flag)) {
                        System.out.println(Thread.currentThread().getName());
                        conditionA.signal();
                        conditionC.await();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                reentrantLock.unlock();
            }
        }
    }
    public static void main(String[] args) {
        final Task myTask = new Task();
        Scanner scanner = new Scanner(System.in);
        System.out.printf(scanner.nextLine());
        new Thread(new Runnable() {

            @Override
            public void run() {
                myTask.execute("_A");
            }
        }, "A").start();

        new Thread(new Runnable() {

            @Override
            public void run() {
                myTask.execute("_B");
            }
        }, "B").start();

        new Thread(new Runnable() {

            @Override
            public void run() {
                myTask.execute("_C");
            }
        }, "C").start();
    }
}