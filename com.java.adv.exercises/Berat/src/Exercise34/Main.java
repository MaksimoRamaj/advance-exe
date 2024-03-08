package Exercise34;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        String mainName = Thread.currentThread().getName();
        System.out.println("Emri i thread main: " + mainName);
    }
}
