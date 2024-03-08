package Exercise34;

public class MyRunnable implements Runnable{

    Thread t;

    public MyRunnable() {
        this.t = new Thread(this);
    }

    @Override
    public void run() {
        System.out.println("Thread name: " + Thread.currentThread().getName());
    }
}

class Test1{
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        myRunnable.t.start();
    }
}
