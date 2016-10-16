/**
 * Created by Harry Johnson on 10/5/2016.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        // your code
        // multiple producer/consumer threads need to be created based on input parameters
        Constants myConstant = new Constants(Integer.parseInt(args[2]));
        Buffer MyBuffer = new Buffer();
        Producer p1 = new Producer(MyBuffer);
        Consumer c1 = new Consumer(MyBuffer);

        for(int i = 0; i < Integer.parseInt(args[0]); i++) {
            Thread t1 = new Thread(p1);;
            t1.start();
            Thread t2 = new Thread(p1);
            t2.start();
        }
        /*for(int i = 0; i < Integer.parseInt(args[1]); i++) {
            Thread t1 = new Thread(c1);
            t1.start();
        }*/



    }
}
