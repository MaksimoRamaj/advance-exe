package Exercise38;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestCoffee {
    public static void main(String[] args) throws InterruptedException {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.startMachine();
//        coffeeMachine.stopMachine();
    }
}
