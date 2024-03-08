package Exercise36;

public class ThreadPlaygroundRunnable implements Runnable{

    String name;

    public ThreadPlaygroundRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println(name + " No of iteration: " + i);
        }
    }
}
