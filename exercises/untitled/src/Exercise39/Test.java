package Exercise39;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        System system = new System();

        Sensor s1 = new Sensor(system,"sensor1");
        Sensor s2 = new Sensor(system,"sensor2");
        Sensor s3 = new Sensor(system,"sensor3");
        Sensor s4 = new Sensor(system,"sensor4");

        Screen screen1 = new Screen(system);
        Screen screen2 = new Screen(system);
        Screen screen3 = new Screen(system);
        Screen screen4 = new Screen(system);
    boolean stop = false;
    int count2 =0;
        ExecutorService executorService = Executors.newCachedThreadPool();
    while (!stop){
        Future<Integer> result1 = executorService.submit(screen1);
        Future<Integer> result2 = executorService.submit(screen2);
        Future<Integer> result3 = executorService.submit(screen3);
        Future<Integer> result4 = executorService.submit(screen4);

        if (result1.isDone()){
            try {
                s1.setIndex(result1.get());
                executorService.submit(s1);
            } catch (InterruptedException e) {
                java.lang.System.err.println("result1 error!");
            } catch (ExecutionException e) {
                java.lang.System.err.println("result1 error!");
            }
        }
        if (result2.isDone()){
            try {
                s2.setIndex(result2.get());
                executorService.submit(s2);
            } catch (InterruptedException e) {
                java.lang.System.err.println("result2 error!");
            } catch (ExecutionException e) {
                java.lang.System.err.println("result1 error!");
            }
        }
        if (result3.isDone()){
            try {
                s3.setIndex(result3.get());
                executorService.submit(s3);
            } catch (InterruptedException e) {
                java.lang.System.err.println("result1 error!");
            } catch (ExecutionException e) {
                java.lang.System.err.println("result1 error!");
            }
        }
        if (result4.isDone()){
            try {
                s4.setIndex(result4.get());
                executorService.submit(s4);
            } catch (InterruptedException e) {
                java.lang.System.err.println("result1 error!");
            } catch (ExecutionException e) {
                java.lang.System.err.println("result1 error!");
            }
        }

        if (result1.isDone() && result2.isDone() && result3.isDone() && result4.isDone()){
            int count = 0;
            for (List<Integer> list: system.getCompetitionResults()){
                java.lang.System.out.print("list" + count + ": " );
                for (Integer i : list){
                    java.lang.System.out.print(" " + i);
                }
                java.lang.System.out.println();
                count++;
            }
        }

        Thread.sleep(1500);
        count2++;
        if (count2 == 4){
            stop = true;
        }
    }
        executorService.shutdown();
}}
