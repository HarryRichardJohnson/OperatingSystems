import java.util.Random;

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
        Random rng = new Random();
        try {
            Thread.sleep((long)rng.nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
            Integer myIntObj = rng.nextInt();
        try {
            buffer.insert_item(myIntObj);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}

