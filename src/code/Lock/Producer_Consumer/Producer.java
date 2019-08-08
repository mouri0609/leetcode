package code.Lock.Producer_Consumer;

import java.util.concurrent.BlockingQueue;

import static java.lang.Thread.sleep;

/**
 * @Author: Agile¡ª¡ªMouri
 * @Date: 2019/8/8
 */
public class Producer implements Runnable{
    private final BlockingQueue sharedQueue;
    public Producer(BlockingQueue sharedQueue){
        this.sharedQueue = sharedQueue;
    }

    @Override
    public void run(){
        for(int i=0;i<10;i++){
            try{
                System.out.println("Producer:"+i);
                sharedQueue.put(i);
                Thread.sleep(1000);
            }catch(InterruptedException ex){
                System.out.println("exception:"+ex);
            }
        }
    }
}
