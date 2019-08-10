package code.Lock.Producer_Consumer;

import java.util.concurrent.BlockingQueue;

/**
 * @Author: Agile¡ª¡ªMouri
 * @Date: 2019/8/8
 */
public class Consumer implements Runnable{
    private final BlockingQueue sharedQueue;
    public Consumer(BlockingQueue sharedQueue){
        this.sharedQueue = sharedQueue;
    }

    @Override
    public void run(){
        while(true){
            try{
                System.out.println("Consumed:"+sharedQueue.take());
            }catch(InterruptedException ex){
                System.out.println("Exception:"+ex);
            }
        }
    }
}