import java.util.Random;
import java.util.concurrent.BrokenBarrierException;

/**
 * Created by Harry Johnson on 10/5/2016.
 */
public class Producer implements Runnable {

    private Buffer buffer;

    public Producer(Buffer _buffer) {
        // your code
        this.buffer = _buffer;
    }

    public void run() {
        // your code
        try {
            Buffer.gate.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
        Random rng = new Random();
        try {
            Thread.sleep((long)rng.nextInt(10000));
            System.out.println("Producer #"+Thread.currentThread().getId());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
            Integer myIntObj = rng.nextInt();

        try {
            buffer.insert_item(myIntObj);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println();
    }
}

