import java.util.concurrent.Semaphore;

/**
 * Created by Harry Johnson on 10/5/2016.
 */
public class Buffer{

    // remember to initialize the semaphores in the constructor
    private Semaphore empty;
    private Semaphore full;
    private Semaphore mutex;
    //more private fields such as a container object for holding the buffer items
    private Object[] intArray;

    public Buffer() throws InterruptedException {
        // your code
        intArray = new Object[Constants.BUFFER_SIZE];
        for(int i = 0; i < intArray.length; i++){
            intArray[i] = null;
        }
        empty = new Semaphore(5);
        full = new Semaphore(5);
        mutex = new Semaphore(1);
        empty.acquire(5);
    }

    public int insert_item(Object item) throws InterruptedException {

        //acquire semaphores
        try {
            mutex.acquire();
            if (full.availablePermits() > 0) {
                //critical section
                //insert the item
                for (int i = 0; i < intArray.length; i++) {
                    if (intArray[i] == null) {
                        intArray[i] = item;
                        break;
                    }
                }
                full.acquire();
                empty.release();

            } else {
                System.out.println("Array is full");
                mutex.release();
                return 0;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Mutex unavailable");
            mutex.release();
            return 0;
        }
        //release semaphores
        mutex.release();
        for (int i = 0; i < intArray.length; i++) {
            System.out.print("Buffer at index "+i+" holds "+intArray[i]+"  ");
        }
        System.out.println();
        return 1;
    }

    public Object remove_item() {

        //acquire semaphores
        try {
            mutex.acquire();
            if (empty.availablePermits() > 0){
                //critical section
                //insert the item
                for(int i = 0; i < intArray.length; i++) {
                    if (intArray[i] != null) {
                        intArray[i] = null;
                    }
                }
                full.release();
                empty.acquire();
            }else{
                System.out.println("Array is empty");
                mutex.release();
                return 0;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Mutex unavailable");
            mutex.release();
            for (int i = 0; i < intArray.length; i++) {
                System.out.print("Buffer at index "+i+" holds "+intArray[i]+"  ");
            }
            System.out.println();
            return 0;
        }
        //release semaphores
        mutex.release();
        return 1;
    }
}

