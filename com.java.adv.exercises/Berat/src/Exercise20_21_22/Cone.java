package Exercise20_21_22;

import java.util.Comparator;

public class Cone extends ThreeDShape{

    int lartesi;
    int rreze;

    public Cone(int lartesi, int rreze) {
        this.lartesi = lartesi;
        this.rreze = rreze;
    }

    @Override
    double calculateVolume() {
        return ((double) 1 /3)*Math.PI*Math.pow(rreze,2)*lartesi;
    }
    @Override
    double calculatePerimeter() {
        return 2*Math.PI*rreze;
    }

    @Override
    double calculateArea() {
        return Math.PI*rreze*(lartesi+rreze);
    }

}
