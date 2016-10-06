import java.util.Random;

/**
 * Created by Harry Johnson on 10/5/2016.
 */
public class Consumer implements Runnable {

    private Buffer buffer;

    public Consumer(Buffer _buffer) {
        // your code
        this.buffer = _buffer;
    }

    public void run() {
        // your code
        Random rng = new Random();
        try {
            Thread.sleep((long)rng.nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
            buffer.remove_item();
    }
}