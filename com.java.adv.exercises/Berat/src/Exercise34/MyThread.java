package Exercise34;

public class MyThread extends Thread{
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println("Emri i thread: " + threadName);
    }
}
