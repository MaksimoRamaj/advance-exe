package Exercise37;

import Exercise36.ThreadPlaygroundRunnable;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exe37 {
    public static void main(String[] args) {
        Executor executor = Executors.newFixedThreadPool(2);
        for (int i=0;i<10;i++){
            executor.execute(new ThreadPlaygroundRunnable("Thread: " + i));
        }
        if (executor instanceof ExecutorService){
            ((ExecutorService) executor).shutdown();
        }
    }
}
