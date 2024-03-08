package Exercise36;

public class MyThreadTest {
    static Thread t1;
    static Thread t2;

    public static void main(String[] args) throws InterruptedException {
        MyThreadTest.t1 = new Thread(new ThreadPlaygroundRunnable("Thread-t1"));
        MyThreadTest.t2 = new Thread(new ThreadPlaygroundRunnable("Thread-t2"));

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Main thread finished!");
    }
}
