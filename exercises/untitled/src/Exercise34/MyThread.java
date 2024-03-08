package Exercise34;

public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

class Test{
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
