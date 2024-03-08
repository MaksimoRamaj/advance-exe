package Exercise39;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Future;

public class Sensor extends Thread{
    private final System system;
    private List<Integer> current;
    private List<Integer> updated;
    private Integer index;
    private Random random;
    private String name;

    public Sensor(System system,String name) {
        current = new ArrayList<>();
        updated = new ArrayList<>();
        random = new Random();
        this.system = system;
        index = 0;
        current.add(0);
        updated.add(0);
        this.name = name;
    }



    public void setIndex(Integer index) {
        this.index = index;
    }

    @Override
    public void run() {
        if (system.setCompetitionResults(current,updated,index)){
            updated.add(random.nextInt(4));
            java.lang.System.out.println(name + "updated the result!");
        };
    }
}
