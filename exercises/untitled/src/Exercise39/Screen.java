package Exercise39;

import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;

public class Screen implements Callable<Integer> {
    System system;
    Random random;

    public Screen(System system) {
        random = new Random();
        this.system = system;
    }

    @Override
    public Integer call() throws Exception {
        int randomIndex = random.nextInt(0,system.getCompetitionResults().size());
        return randomIndex;
    }
}
