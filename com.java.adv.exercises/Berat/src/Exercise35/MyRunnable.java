package Exercise35;

public class MyRunnable implements Runnable{

    String name;

    public MyRunnable(String threadName) {
        this.name = threadName;
    }

    @Override
    public void run() {
        Thread.currentThread().setName(this.name);
        String threadName = Thread.currentThread().getName();
        System.out.println("Emri i myRunnable thread: " + threadName);
    }
}
