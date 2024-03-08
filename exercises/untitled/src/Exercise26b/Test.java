package Exercise26b;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Makina2> list = Arrays.asList(new Makina2("BMW",160),
                new Makina2("WV",140),
                new Makina2("Mercedes",200),
                new Makina2("Audi",240));
        Collections.sort(list);
        for (Makina2 makina2: list){
            System.out.println(makina2.marka);
        }
    }

}

class Makina2 implements Comparable<Makina2>{
    String marka;
    int maxSpeed;

    public Makina2(String marka, int maxSpeed) {
        this.marka = marka;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public int compareTo(Makina2 o) {
        return this.marka.charAt(0)-o.marka.charAt(0);
    }
}
