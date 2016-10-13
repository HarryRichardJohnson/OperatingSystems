/**
 * Created by Harry Johnson on 10/5/2016.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        // your code
        // multiple producer/consumer threads need to be created based on input parameters
        Buffer MyBuffer = new Buffer();
        Producer p1 = new Producer(MyBuffer);
        Consumer c1 = new Consumer(MyBuffer);
        p1.run();
        p1.run();
        p1.run();
        p1.run();
        p1.run();
        p1.run();

    }
}
