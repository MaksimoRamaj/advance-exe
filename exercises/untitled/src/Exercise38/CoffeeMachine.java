package Exercise38;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

public class CoffeeMachine {
    private WaterContainer waterContainer;
    private Thread t1;
    private Thread t2;
    private boolean isEmpty;

    ExecutorService executorService;

    public CoffeeMachine(){
        executorService = Executors.newFixedThreadPool(2);
        waterContainer = new WaterContainer(2000);

        isEmpty = true;
        t1 = new Thread(
                ()->{
                    try {
                        makeCoffee();
                    } catch (InterruptedException e) {
                        System.out.println(e.getMessage());
                    }
                }
        );

        t2 = new Thread(
                ()->{
                        refillWater();
                }
        );

    }

    void startMachine() throws InterruptedException {
            executorService.execute(t2);
            executorService.execute(t1);
            executorService.execute(t2);
            executorService.execute(t2);
    }

    void stopMachine(){
        executorService.shutdown();
    }

    private void makeCoffee() throws InterruptedException {
        synchronized (this) {
            while (!isEmpty) {
                int water = getWater();
                if (water < 150) {
                    System.out.println("Waiting for water refill...");
                    isEmpty = true;
                    wait();
                }
                System.out.println("Coffee is ready!");
            }
        }
    }

    private void refillWater() {
        synchronized (this) {
            while (isEmpty) {
                waterContainer.refill();
                System.out.println("Machine filled with water");
                isEmpty = false;
                notify();
            }
        }
    }



    private int getWater(){
        return waterContainer.getWater(150);
    }

}
